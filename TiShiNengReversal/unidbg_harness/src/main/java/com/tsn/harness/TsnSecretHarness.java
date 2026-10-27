package com.tsn.harness;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Module;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.linux.android.dvm.*;
import com.github.unidbg.linux.android.dvm.array.ArrayObject;
import com.github.unidbg.linux.android.dvm.array.ByteArray;
import com.github.unidbg.memory.Memory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.*;

/**
 * 体适能 libtsnsecret.so 纯PC模拟执行 (unidbg 0.9.9 API 适配版)
 * 目标: 动态验证静态还原的 aes_decrypt / auth() 签名校验链 / generateAuthInfo 字典序签名。
 * auth() 反射链补环境: 返回真实 XIAOWEI.RSA 证书 DER, 若 MD5 与硬编码一致则鉴权通过。
 */
public class TsnSecretHarness extends AbstractJni {

    private static final String SO_PATH =
            "/Volumes/前任肥胖/下载/tishineng.apk/lib/arm64-v8a/libtsnsecret.so";
    private static final String CERT_RSA_PATH =
            "/Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/cert_xiaowei.der";
    private static final String EXPECTED_CERT_MD5 = "7fc022e67c7d2accc3c8770a46138dc3";
    private static final String OWNER_CLASS = "com/bxkj/student/TsnSecret";

    private static final long OFF_AES_DECRYPT       = 0x3d973cL;
    private static final long OFF_RSA_DECRYPT       = 0x3ddb90L;
    private static final long OFF_GENERATE_AUTHINFO = 0x3e2cf0L;

    private final AndroidEmulator emulator;
    private final VM vm;
    private final Module module;

    // === auth()/generateAuthInfo 反射链补环境 ===
    private static final int ROLE_CONTEXT = 1, ROLE_PM = 2, ROLE_PKGINFO = 3, ROLE_SIG = 4;
    private static final int ROLE_SET = 10, ROLE_ITER = 11, ROLE_ENTRY = 12;
    private final Map<Integer, Integer> roleMap = new HashMap<>();
    private DvmClass clsContext, clsPM, clsPkgInfo, clsSignature;
    private byte[] certDer = null;
    private final Map<String, String> fakeAuthMap = new LinkedHashMap<>();
    private int iterCount = 0;
    private final List<Map.Entry<String, String>> fakeEntries = new ArrayList<>();

    public TsnSecretHarness() {
        emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("com.bxkj.student")
                .build();
        final Memory memory = emulator.getMemory();
        memory.setLibraryResolver(new AndroidResolver(23));
        vm = emulator.createDalvikVM((File) null);
        vm.setVerbose(true);
        vm.setJni(this);

        // 反射链角色类
        clsContext = vm.resolveClass("android/content/Context");
        clsPM = vm.resolveClass("android/content/pm/PackageManager");
        clsPkgInfo = vm.resolveClass("android/content/pm/PackageInfo");
        clsSignature = vm.resolveClass("android/content/pm/Signature");
        loadCert();

        DalvikModule dm = vm.loadLibrary(new File(SO_PATH), true);
        this.module = dm.getModule();
        System.out.println("[+] libtsnsecret.so loaded @ base=0x"
                + Long.toHexString(module.base) + " size=0x" + Long.toHexString(module.size));
    }

    /** 载入 XIAOWEI 证书 DER (已用 openssl 从 PKCS#7 提取) 并验证 MD5 */
    private void loadCert() {
        try {
            byte[] all;
            try (FileInputStream fis = new FileInputStream(CERT_RSA_PATH)) {
                all = fis.readAllBytes();
            }
            if (md5Hex(all).equals(EXPECTED_CERT_MD5)) {
                certDer = all;
            } else {
                // 兜底: PKCS#7 原始文件 → 偏移 0x3c 附近找 DER SEQUENCE 头 30 82 03 xx
                byte[] cand = Arrays.copyOfRange(all, 0x3c, Math.min(0x3c + 900, all.length));
                if (md5Hex(cand).equals(EXPECTED_CERT_MD5)) { certDer = cand; }
                else {
                    for (int i = 0; i + 4 < all.length; i++) {
                        if ((all[i] & 0xff) == 0x30 && (all[i + 1] & 0xff) == 0x82) {
                            int len = ((all[i + 2] & 0xff) << 8) | (all[i + 3] & 0xff);
                            if (i + 4 + len <= all.length) {
                                cand = Arrays.copyOfRange(all, i, i + 4 + len);
                                if (md5Hex(cand).equals(EXPECTED_CERT_MD5)) { certDer = cand; break; }
                            }
                        }
                    }
                }
            }
            System.out.println("[+] cert DER: " + (certDer == null ? "NOT FOUND" :
                    (certDer.length + "B md5=" + md5Hex(certDer) + (md5Hex(certDer).equals(EXPECTED_CERT_MD5) ? " MATCH (auth 可通过)" : " MISMATCH"))));
        } catch (Exception e) {
            System.out.println("[-] loadCert failed: " + e);
        }
    }

    private static String md5Hex(byte[] b) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] d = md.digest(b);
        StringBuilder sb = new StringBuilder();
        for (byte x : d) sb.append(String.format("%02x", x));
        return sb.toString();
    }

    private int reg(int role, DvmObject<?> obj) {
        vm.addLocalObject(obj);
        int h = obj.hashCode();
        roleMap.put(h, role);
        return h;
    }
    private int regObj(DvmObject<?> obj) {
        vm.addLocalObject(obj);
        return obj.hashCode();
    }
    private Integer roleOf(DvmObject<?> o) { return roleMap.get(o.hashCode()); }

    // ============ JNI 回调兜底 (0.9.9: BaseVM 签名) ============
    @Override
    public DvmObject<?> getObjectField(BaseVM vm, DvmObject<?> dvmObject, String signature) {
        int arrow = signature.indexOf("->");
        if (arrow >= 0) signature = signature.substring(arrow + 2);
        Integer role = roleOf(dvmObject);
        System.out.println("[JNI] getObjectField role=" + role + " sig=" + signature);
        if ("signatures:[Landroid/content/pm/Signature;".equals(signature)) {
            DvmObject<?> sig = clsSignature.newObject(null);
            reg(ROLE_SIG, sig);
            ArrayObject arr = new ArrayObject(sig);
            regObj(arr);
            return arr;
        }
        return super.getObjectField(vm, dvmObject, signature);
    }

    @Override
    public DvmObject<?> getStaticObjectField(BaseVM vm, DvmClass dvmClass, String signature) {
        System.out.println("[JNI] getStaticObjectField " + dvmClass.getClassName() + " sig=" + signature);
        return super.getStaticObjectField(vm, dvmClass, signature);
    }

    private DvmObject<?> handleCallObjectMethod(BaseVM vm, DvmObject<?> dvmObject, String signature) {
        // unidbg 传入形如 "android/content/Context->getPackageManager()...", 去掉类名前缀
        int arrow = signature.indexOf("->");
        if (arrow >= 0) signature = signature.substring(arrow + 2);
        Integer role = roleOf(dvmObject);
        System.out.println("[JNI] callObjectMethod role=" + role + " sig=" + signature);
        switch (signature) {
            case "getPackageManager()Landroid/content/pm/PackageManager;": {
                DvmObject<?> pm = clsPM.newObject(null);
                reg(ROLE_PM, pm);
                return pm;
            }
            case "getPackageName()Ljava/lang/String;": {
                StringObject s = new StringObject(this.vm, "com.bxkj.student");
                regObj(s);
                return s;
            }
            case "getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;": {
                DvmObject<?> pi = clsPkgInfo.newObject(null);
                reg(ROLE_PKGINFO, pi);
                return pi;
            }
            case "toByteArray()[B":
                if (role != null && role == ROLE_SIG && certDer != null) {
                    ByteArray b = new ByteArray(this.vm, certDer);
                    regObj(b);
                    return b;
                }
                break;
            case "entrySet()Ljava/util/Set;": {
                DvmObject<?> set = vm.resolveClass("java/util/Set").newObject(null);
                reg(ROLE_SET, set);
                return set;
            }
            case "iterator()Ljava/util/Iterator;": {
                iterCount = 0;
                DvmObject<?> it = vm.resolveClass("java/util/Iterator").newObject(null);
                reg(ROLE_ITER, it);
                return it;
            }
            case "next()Ljava/lang/Object;": {
                if (role != null && role == ROLE_ITER && iterCount < fakeEntries.size()) {
                    Map.Entry<String, String> e = fakeEntries.get(iterCount++);
                    DvmObject<?> entry = vm.resolveClass("java/util/Map$Entry").newObject(null);
                    reg(ROLE_ENTRY, entry);
                    return entry;
                }
                break;
            }
            case "getKey()Ljava/lang/Object;": {
                if (role != null && role == ROLE_ENTRY && iterCount > 0) {
                    Map.Entry<String, String> e = fakeEntries.get(iterCount - 1);
                    StringObject s = new StringObject(this.vm, e.getKey());
                    regObj(s);
                    return s;
                }
                break;
            }
            case "getValue()Ljava/lang/Object;": {
                if (role != null && role == ROLE_ENTRY && iterCount > 0) {
                    Map.Entry<String, String> e = fakeEntries.get(iterCount - 1);
                    StringObject s = new StringObject(this.vm, e.getValue());
                    regObj(s);
                    return s;
                }
                break;
            }
        }
        return null; // 未处理的签名: 默认返回 null (与 AbstractJni 兜底行为一致)
    }

    @Override
    public DvmObject<?> callObjectMethod(BaseVM vm, DvmObject<?> dvmObject, String signature, VarArg varArg) {
        return handleCallObjectMethod(vm, dvmObject, signature);
    }

    @Override
    public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject, String signature, VaList vaList) {
        return handleCallObjectMethod(vm, dvmObject, signature);
    }

    @Override
    public boolean callBooleanMethod(BaseVM vm, DvmObject<?> dvmObject, String signature, VarArg varArg) {
        int arrow = signature.indexOf("->");
        if (arrow >= 0) signature = signature.substring(arrow + 2);
        Integer role = roleOf(dvmObject);
        System.out.println("[JNI] callBooleanMethod role=" + role + " sig=" + signature);
        if ("hasNext()Z".equals(signature) && role != null && role == ROLE_ITER) {
            return iterCount < fakeEntries.size();
        }
        return super.callBooleanMethod(vm, dvmObject, signature, varArg);
    }

    @Override
    public boolean callBooleanMethodV(BaseVM vm, DvmObject<?> dvmObject, String signature, VaList vaList) {
        int arrow = signature.indexOf("->");
        if (arrow >= 0) signature = signature.substring(arrow + 2);
        Integer role = roleOf(dvmObject);
        System.out.println("[JNI] callBooleanMethodV role=" + role + " sig=" + signature);
        if ("hasNext()Z".equals(signature) && role != null && role == ROLE_ITER) {
            return iterCount < fakeEntries.size();
        }
        return super.callBooleanMethodV(vm, dvmObject, signature, vaList);
    }

    @Override
    public DvmObject<?> callStaticObjectMethodV(BaseVM vm, DvmClass dvmClass, String signature, VaList vaList) {
        System.out.println("[JNI] callStaticObjectMethodV " + dvmClass.getClassName() + " sig=" + signature);
        return super.callStaticObjectMethodV(vm, dvmClass, signature, vaList);
    }

    // ============ 业务调用封装 ============
    private int ctxHash() {
        DvmObject<?> ctx = clsContext.newObject(null);
        reg(ROLE_CONTEXT, ctx);
        return ctx.hashCode();
    }

    /** aes_decrypt(env, thiz, context, data, key, iv) */
    public byte[] aesDecrypt(byte[] data, byte[] key, byte[] iv) {
        DvmClass owner = vm.resolveClass(OWNER_CLASS);
        ByteArray dataArr = new ByteArray(vm, data);
        ByteArray keyArr = new ByteArray(vm, key);
        ByteArray ivArr = new ByteArray(vm, iv);
        int hData = regObj(dataArr), hKey = regObj(keyArr), hIv = regObj(ivArr);
        int hCtx = ctxHash();
        System.out.println("\n==== call aes_decrypt: dataLen=" + data.length
                + " key=" + toHex(key) + " iv=" + toHex(iv) + " ====");
        Number ret = module.callFunction(emulator, OFF_AES_DECRYPT,
                vm.getJNIEnv(), owner.hashCode(), hCtx, hData, hKey, hIv);
        return decodeReturnedByteArray(ret);
    }

    /** generateAuthInfo(env, thiz, map) */
    public String generateAuthInfo(Map<String, String> map) {
        fakeEntries.clear();
        fakeEntries.addAll(map.entrySet());
        fakeAuthMap.clear();
        fakeAuthMap.putAll(map);
        DvmClass owner = vm.resolveClass(OWNER_CLASS);
        DvmObject<?> mapObj = vm.resolveClass("java/util/Map").newObject(null);
        int hMap = regObj(mapObj);
        System.out.println("\n==== call generateAuthInfo: map=" + map + " ====");
        Number ret = module.callFunction(emulator, OFF_GENERATE_AUTHINFO,
                vm.getJNIEnv(), owner.hashCode(), hMap);
        long h = ret.longValue() & 0xffffffffL;
        if (h == 0) return null;
        DvmObject<?> obj = vm.getObject((int) h);
        return obj == null ? null : obj.getValue().toString();
    }

    private byte[] decodeReturnedByteArray(Number ret) {
        long handle = ret.longValue() & 0xffffffffL;
        if (handle == 0) {
            System.err.println("[!] 返回 null (handle=0)");
            return null;
        }
        DvmObject<?> obj = vm.getObject((int) handle);
        if (obj instanceof ByteArray) {
            byte[] v = ((ByteArray) obj).getValue();
            System.out.println("[+] aes_decrypt -> " + v.length + "B: " + toHex(v));
            return v;
        }
        System.err.println("[!] 返回对象不是 ByteArray: " + (obj == null ? "null" : obj.getClass().getName()));
        return null;
    }

    public void destroy() {
        try { emulator.close(); } catch (Exception ignored) {}
    }

    private static String toHex(byte[] b) {
        if (b == null) return "null";
        StringBuilder sb = new StringBuilder();
        int n = Math.min(b.length, 96);
        for (int i = 0; i < n; i++) sb.append(String.format("%02x", b[i]));
        if (b.length > n) sb.append("...");
        return sb.toString();
    }

    private static byte[] hex(String s) {
        byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < b.length; i++) b[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
        return b;
    }

    private static byte[] aesEncrypt(byte[] plain, byte[] key, byte[] iv) throws Exception {
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        return c.doFinal(plain);
    }

    // ============ main: 动态验证用例 ============
    public static void main(String[] args) throws Exception {
        TsnSecretHarness h = new TsnSecretHarness();
        try {
            // ---- 用例1: AUTH_KEY AES-128-CBC 往返 ----
            byte[] authKey = hex("165f47a702bf0965d2fb49cdbb373377");
            byte[] iv = new byte[16];
            String plain1 = "TSN-AUTH-TEST-2026";
            byte[] ct1 = aesEncrypt(plain1.getBytes(), authKey, iv);
            System.out.println("[CASE1] 密文(host自加密) = " + toHex(ct1));
            byte[] out1 = h.aesDecrypt(ct1, authKey, iv);
            boolean ok1 = out1 != null && new String(out1).startsWith(plain1);
            System.out.println(ok1 ? "★ CASE1 AUTH_KEY 往返验证 PASS" : "CASE1 FAIL");

            // ---- 用例2: QR_CODE_KEY ----
            byte[] qrKey = hex("c310d8a21490eddc2f3cd870c34bb732");
            String plain2 = "QR-CODE-SECRET-42";
            byte[] ct2 = aesEncrypt(plain2.getBytes(), qrKey, iv);
            byte[] out2 = h.aesDecrypt(ct2, qrKey, iv);
            boolean ok2 = out2 != null && new String(out2).startsWith(plain2);
            System.out.println(ok2 ? "★ CASE2 QR_CODE_KEY 往返验证 PASS" : "CASE2 FAIL");

            // ---- 用例3: generateAuthInfo 字典序签名 ----
            Map<String, String> m = new TreeMap<>();
            m.put("userName", "test");
            m.put("password", "abc123");
            m.put("timestamp", "1700000000");
            String auth = h.generateAuthInfo(m);
            System.out.println("CASE3 generateAuthInfo -> " + auth);

            System.out.println("\n===== 全部用例结束 =====");
        } finally {
            h.destroy();
        }
    }
}

package com.tsn.harness;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Module;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.linux.android.dvm.*;
import com.github.unidbg.linux.android.dvm.array.ArrayObject;
import com.github.unidbg.linux.android.dvm.array.ByteArray;
import com.github.unidbg.memory.Memory;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.*;

/**
 * Transform.k (native "dz") URL 解密 harness
 * 目标: 解密 @Test(demo="32hex") 注解中的全部密文, 还原 2.0.22 真实端点路径。
 * dz 签名: (JNIEnv*, jobject thiz, jobject context, jstring urlHex) -> jstring
 * dz 地址: 0x3d322c (nm -D 导出符号 _Z2dzP7_JNIEnvP8_jobjectS2_P8_jstring)
 * 备选: decode @ 0x3dc888 (env, thiz, jstring)
 */
public class TsnUrlHarness extends AbstractJni {

    private static final String SO_PATH =
            "/Volumes/MacOS/Tishineng/TiShiNengReversal/lib/arm64-v8a/libtsnsecret.so";
    private static final String CERT_RSA_PATH =
            "/Volumes/MacOS/Tishineng/TiShiNengReversal/dsh-vm/cert_xiaowei.der";
    private static final String EXPECTED_CERT_MD5 = "7fc022e67c7d2accc3c8770a46138dc3";
    private static final String OWNER_CLASS = "com/google/android/datatransport/Transform";

    private static final long OFF_DZ     = 0x3d322cL; // dz(env,thiz,ctx,jstring)
    private static final long OFF_DECODE = 0x3dc888L; // decode(env,thiz,jstring)

    private final AndroidEmulator emulator;
    private final VM vm;
    private final Module module;

    private static final int ROLE_CONTEXT = 1, ROLE_PM = 2, ROLE_PKGINFO = 3, ROLE_SIG = 4;
    private final Map<Integer, Integer> roleMap = new HashMap<>();
    private DvmClass clsContext, clsPM, clsPkgInfo, clsSignature;
    private byte[] certDer = null;

    public TsnUrlHarness() {
        emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("com.bxkj.student")
                .build();
        final Memory memory = emulator.getMemory();
        memory.setLibraryResolver(new AndroidResolver(23));
        vm = emulator.createDalvikVM((File) null);
        vm.setVerbose(false);
        vm.setJni(this);

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

    private void loadCert() {
        try {
            byte[] all;
            try (FileInputStream fis = new FileInputStream(CERT_RSA_PATH)) {
                all = fis.readAllBytes();
            }
            if (md5Hex(all).equals(EXPECTED_CERT_MD5)) {
                certDer = all;
            }
            System.out.println("[+] cert DER: " + (certDer == null ? "NOT FOUND" : certDer.length + "B md5 match"));
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

    @Override
    public DvmObject<?> getObjectField(BaseVM vm, DvmObject<?> dvmObject, String signature) {
        int arrow = signature.indexOf("->");
        if (arrow >= 0) signature = signature.substring(arrow + 2);
        if ("signatures:[Landroid/content/pm/Signature;".equals(signature)) {
            DvmObject<?> sig = clsSignature.newObject(null);
            reg(ROLE_SIG, sig);
            ArrayObject arr = new ArrayObject(sig);
            regObj(arr);
            return arr;
        }
        return super.getObjectField(vm, dvmObject, signature);
    }

    private DvmObject<?> handleCallObjectMethod(BaseVM vm, DvmObject<?> dvmObject, String signature) {
        int arrow = signature.indexOf("->");
        if (arrow >= 0) signature = signature.substring(arrow + 2);
        Integer role = roleOf(dvmObject);
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
        }
        return null;
    }

    @Override
    public DvmObject<?> callObjectMethod(BaseVM vm, DvmObject<?> dvmObject, String signature, VarArg varArg) {
        return handleCallObjectMethod(vm, dvmObject, signature);
    }

    @Override
    public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject, String signature, VaList vaList) {
        return handleCallObjectMethod(vm, dvmObject, signature);
    }

    private int ctxHash() {
        DvmObject<?> ctx = clsContext.newObject(null);
        reg(ROLE_CONTEXT, ctx);
        return ctx.hashCode();
    }

    /** dz(env, thiz, context, urlHex) -> jstring */
    public String dz(String urlHex) {
        DvmClass owner = vm.resolveClass(OWNER_CLASS);
        StringObject urlObj = new StringObject(vm, urlHex);
        int hUrl = regObj(urlObj);
        int hCtx = ctxHash();
        Number ret = module.callFunction(emulator, OFF_DZ,
                vm.getJNIEnv(), owner.hashCode(), hCtx, hUrl);
        long h = ret.longValue() & 0xffffffffL;
        if (h == 0) return null;
        DvmObject<?> obj = vm.getObject((int) h);
        return obj == null ? null : String.valueOf(obj.getValue());
    }

    /** decode(env, thiz, urlHex) -> jstring (备选) */
    public String decode(String urlHex) {
        DvmClass owner = vm.resolveClass(OWNER_CLASS);
        StringObject urlObj = new StringObject(vm, urlHex);
        int hUrl = regObj(urlObj);
        Number ret = module.callFunction(emulator, OFF_DECODE,
                vm.getJNIEnv(), owner.hashCode(), hUrl);
        long h = ret.longValue() & 0xffffffffL;
        if (h == 0) return null;
        DvmObject<?> obj = vm.getObject((int) h);
        return obj == null ? null : String.valueOf(obj.getValue());
    }

    public void destroy() {
        try { emulator.close(); } catch (Exception ignored) {}
    }

    public static void main(String[] args) throws Exception {
        // 39 个 @Test(demo=) + b.java 静态块 3 个 + retrofit/b.java 已知 schoolUrl 密文
        String[] cts = {
            "05dbfd8c595b3687f8351745f27c449b", // schoolUrl 锚点
            "7ff944758843f909e729065961954713",
            "f16f7cfccc6d82a3a6ae248da4d16a1d",
            "02941f2e7a00142dbf74699df84b52dd",
            "16dd77786f3c3e1ac964437c978434ef",
            "21eac57f6453f133c23636f1001cfec5",
            "2e3c1cc7b254311b8ad82f2d2d2fb550",
            "38c9640f6ff5813c5c109acfa894f550",
            "42b54ea6aaaf0689c4a35414077d92bc",
            "51f3f9d9b6c4443621b37fa740c82fb8",
            "595161576dff77f4a803c0ed91716d76",
            "5b4b6be878dca78c15579ef99b9fb774",
            "70ba21ded261ce2933e968e14b32ef34",
            "7299e5cc759387e8eba523ca5ad16b56",
            "746bb441d7c9966c2f2c05284bb4e277",
            "75023684c498bc2726f8e691060ffecb",
            "785796286eb58ca15168713af4fce70c",
            "7a4b002c14f6cf723035e7ebbb6d91ce",
            "7d7f2d3627c76f56f26fb6f1e1b8fed1",
            "7e9c6f977d2da2dbe67cd1005eaaf6e1",
            "84e66a8b2fcf9bfd9840bd17a5dd38cb",
            "8d4bbeb78ddde6cd39874081d49f1989",
            "8f27a7ee3082fff7aa759b38c697857a",
            "ad93462ddf9ffa8365e94742e8c6f09e",
            "c1107b22d1b83779cda4c4392c7c1cb6",
            "c395524a1fcdcb89f13a8a352bb8ee7b",
            "c9aab1c07f7f73d7598e9ac13361c663",
            "d44b2b293b348070162b31ea5d139130",
            "d60d116f2cd0fa1ff936d515b8a55f83",
            "d6b92e37a9625a7bc4b4486ecb906b76",
            "e40355ffec0e5271aa3515d1877263e8",
            "e5c6b9630a11efdfa31a4cfa4b227688",
            "e813ce47703893c5be40802067a5472b",
            "e8ed1c044ac961926d8f79bd70dee316",
            "e99908106a680b07ef8beee488dcf6cb",
            "ea78c742acd5a3b5d88cea8b018ee05e",
            "f4f56111c5a9899b708925cd66f39d4e",
            "f924a2407811f3ba790d8816a27fa03d",
            "fa7e67fe9e95d3f60e6195b7e28dd8fd",
            "fac59b800623b1146b41984c3c8df858",
            "fdd57c5a055c28fbaf8bdaa034c6cc23",
        };

        TsnUrlHarness h = new TsnUrlHarness();
        try {
            System.out.println("\n==== dz 批量解密 ====");
            for (String ct : cts) {
                String out = null;
                try { out = h.dz(ct); } catch (Throwable t) { out = "ERR:" + t.getClass().getSimpleName(); }
                System.out.println(ct + "  =>  " + out);
            }
        } finally {
            h.destroy();
        }
    }
}

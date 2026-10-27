package xyz.adscope.common.v2.encrypt.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AesUtil implements xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt {
    private static final java.lang.String ALGORITHM_AES = "AES";
    private static final java.lang.String ALGORITHM_TRANSFORMATION = "AES/CBC/PKCS5PADDING";
    private static final java.lang.String ALGORITHM_TRANSFORMATION_FCB = "AES/CFB/NoPadding";
    private static final java.lang.String DEFAULT_CHARSET = "UTF-8";
    private static final java.lang.String TAG = "AesUtil";
    private final xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig mGenerate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IAESConfig {
        java.lang.String generateAesKey();

        java.lang.String generateAesVector();
    }

    AesUtil(xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig r1) {
            r0 = this;
            r0.<init>()
            r0.mGenerate = r1
            return
    }

    private static byte[] decryptByte(java.lang.String r2, java.lang.String r3, byte[] r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L25
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L25
            r1.<init>(r3)     // Catch: java.lang.Exception -> L25
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "AES"
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Exception -> L25
            r0 = 2
            r2.init(r0, r3, r1)     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.doFinal(r4)     // Catch: java.lang.Exception -> L25
            return r2
        L25:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = 0
            return r2
    }

    public static byte[] decryptByte(byte[] r1, xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig r2) {
            if (r2 == 0) goto Lf
            java.lang.String r0 = r2.generateAesKey()
            java.lang.String r2 = r2.generateAesVector()
            byte[] r1 = decryptByte(r0, r2, r1)
            return r1
        Lf:
            java.lang.String r1 = "AesUtil"
            java.lang.String r2 = "configGenerate is null"
            xyz.adscope.common.v2.log.SDKLog.e(r1, r2)
            r1 = 0
            return r1
    }

    public static byte[] encrypt(byte[] r5, byte[] r6) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r5, r1)
            java.lang.String r5 = "AES/CFB/NoPadding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)
            int r1 = r5.getBlockSize()
            byte[] r2 = new byte[r1]
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r3.nextBytes(r2)
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
            r3.<init>(r2)
            r4 = 1
            r5.init(r4, r0, r3)
            byte[] r5 = r5.doFinal(r6)
            int r6 = r5.length
            int r6 = r6 + r1
            byte[] r6 = new byte[r6]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r6, r0, r1)
            int r2 = r5.length
            java.lang.System.arraycopy(r5, r0, r6, r1, r2)
            return r6
    }

    private static byte[] encryptByte(java.lang.String r2, java.lang.String r3, byte[] r4) {
            java.lang.String r0 = "UTF-8"
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L25
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L25
            r1.<init>(r3)     // Catch: java.lang.Exception -> L25
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "AES"
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "AES/CBC/PKCS5PADDING"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Exception -> L25
            r0 = 1
            r2.init(r0, r3, r1)     // Catch: java.lang.Exception -> L25
            byte[] r2 = r2.doFinal(r4)     // Catch: java.lang.Exception -> L25
            return r2
        L25:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = 0
            return r2
    }

    public static byte[] encryptByte(byte[] r1, xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig r2) {
            if (r2 == 0) goto Lf
            java.lang.String r0 = r2.generateAesKey()
            java.lang.String r2 = r2.generateAesVector()
            byte[] r1 = encryptByte(r0, r2, r1)
            return r1
        Lf:
            java.lang.String r1 = "AesUtil"
            java.lang.String r2 = "configGenerate is null"
            xyz.adscope.common.v2.log.SDKLog.e(r1, r2)
            r1 = 0
            return r1
    }

    public static java.lang.String encryptCFB(java.lang.String r2) {
            java.lang.String r0 = "666f430a0400462dbf62eb4e175186db"
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L1b
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Exception -> L1b
            byte[] r2 = r2.getBytes(r1)     // Catch: java.lang.Exception -> L1b
            r1 = 10
            byte[] r2 = android.util.Base64.encode(r2, r1)     // Catch: java.lang.Exception -> L1b
            byte[] r2 = encrypt(r0, r2)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r1)     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            java.lang.String r2 = ""
            return r2
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt
    public byte[] decode(byte[] r2) {
            r1 = this;
            xyz.adscope.common.v2.encrypt.impl.AesUtil$IAESConfig r0 = r1.mGenerate
            byte[] r2 = decryptByte(r2, r0)
            return r2
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt
    public byte[] encode(byte[] r2) {
            r1 = this;
            xyz.adscope.common.v2.encrypt.impl.AesUtil$IAESConfig r0 = r1.mGenerate
            byte[] r2 = encryptByte(r2, r0)
            return r2
    }
}

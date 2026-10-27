package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DataHelper {
    public static long ENVELOPE_ENTITY_RAW_LENGTH_MAX = 2097152;
    public static long ENVELOPE_EXTRA_LENGTH = 614400;
    public static long ENVELOPE_LENGTH_MAX = 204800;
    private static java.lang.String UMENG_PLUS = "umeng+0123456789";

    static {
            return
    }

    public DataHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String assembleStatelessURL(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String assembleURL(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static java.lang.String bytes2Hex(byte[] r5) {
            java.lang.String r0 = ""
            r1 = 0
        L3:
            int r2 = r5.length
            if (r1 >= r2) goto L38
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "0"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L3
        L38:
            return r0
    }

    public static java.lang.String convertExceptionToString(java.lang.Throwable r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Exception -> L23
            r1.<init>()     // Catch: java.lang.Exception -> L23
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Exception -> L23
            r2.<init>(r1)     // Catch: java.lang.Exception -> L23
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Exception -> L23
        L12:
            if (r3 == 0) goto L19
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Exception -> L23
            goto L12
        L19:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L23
            r2.close()     // Catch: java.lang.Exception -> L23
            r1.close()     // Catch: java.lang.Exception -> L23
        L23:
            return r0
    }

    public static byte[] decrypt(byte[] r3, byte[] r4) throws java.lang.Exception {
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r1.<init>(r4, r2)
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec
            byte[] r2 = com.umeng.commonsdk.utils.UMUtils.genIv()
            r4.<init>(r2)
            r2 = 2
            r0.init(r2, r1, r4)
            byte[] r3 = r0.doFinal(r3)
            return r3
    }

    @android.annotation.SuppressLint({"TrulyRandom"})
    public static byte[] encrypt(byte[] r3, byte[] r4) throws java.lang.Exception {
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r1.<init>(r4, r2)
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec
            byte[] r2 = com.umeng.commonsdk.utils.UMUtils.genIv()
            r4.<init>(r2)
            r2 = 1
            r0.init(r2, r1, r4)
            byte[] r3 = r0.doFinal(r3)
            return r3
    }

    public static java.lang.String encryptBySHA1(java.lang.String r1) {
            byte[] r1 = r1.getBytes()
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L16
            r0.update(r1)     // Catch: java.lang.Exception -> L16
            byte[] r1 = r0.digest()     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = bytes2Hex(r1)     // Catch: java.lang.Exception -> L16
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static byte[] hash(byte[] r1) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L11
            r0.reset()     // Catch: java.lang.Exception -> L11
            r0.update(r1)     // Catch: java.lang.Exception -> L11
            byte[] r1 = r0.digest()     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static boolean largeThanMaxSize(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static int random(int r5, java.lang.String r6) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            float r0 = r0.nextFloat()
            double r0 = (double) r0
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L35
            r5 = 0
            if (r6 != 0) goto L22
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "null signature.."
            r0[r5] = r1
            java.lang.String r1 = "--->"
            com.umeng.commonsdk.statistics.common.MLog.e(r1, r0)
        L22:
            r0 = 9
            r1 = 11
            java.lang.String r6 = r6.substring(r0, r1)     // Catch: java.lang.Exception -> L30
            r0 = 16
            int r5 = java.lang.Integer.parseInt(r6, r0)     // Catch: java.lang.Exception -> L30
        L30:
            r5 = r5 | 128(0x80, float:1.8E-43)
            int r5 = r5 * 1000
            return r5
        L35:
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int r5 = r6.nextInt(r5)
            r6 = 255000(0x3e418, float:3.57331E-40)
            if (r5 > r6) goto L4b
            r6 = 128000(0x1f400, float:1.79366E-40)
            if (r5 < r6) goto L4b
            r5 = 127000(0x1f018, float:1.77965E-40)
        L4b:
            return r5
    }

    public static byte[] reverseHexString(java.lang.String r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r6.length()
            int r2 = r1 % 2
            if (r2 == 0) goto Ld
            return r0
        Ld:
            int r0 = r1 / 2
            byte[] r0 = new byte[r0]
            r2 = 0
        L12:
            if (r2 >= r1) goto L2b
            int r3 = r2 / 2
            int r4 = r2 + 2
            java.lang.String r2 = r6.substring(r2, r4)
            r5 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2, r5)
            int r2 = r2.intValue()
            byte r2 = (byte) r2
            r0[r3] = r2
            r2 = r4
            goto L12
        L2b:
            return r0
    }

    public static java.lang.String toHexString(byte[] r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r5.length
            if (r2 >= r3) goto L25
            r3 = r5[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "%02X"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.append(r3)
            int r2 = r2 + 1
            goto Lb
        L25:
            java.lang.String r5 = r0.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            return r5
    }
}

package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HelperUtils {
    public static final java.lang.String LINE_SEPARATOR = null;
    private static final java.lang.String TAG = "helper";

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            com.umeng.commonsdk.statistics.common.HelperUtils.LINE_SEPARATOR = r0
            return
    }

    public HelperUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String MD5(java.lang.String r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            byte[] r0 = r7.getBytes()     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> L3e
            r1.reset()     // Catch: java.lang.Exception -> L3e
            r1.update(r0)     // Catch: java.lang.Exception -> L3e
            byte[] r0 = r1.digest()     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            r2 = 0
            r3 = 0
        L1f:
            int r4 = r0.length     // Catch: java.lang.Exception -> L3e
            if (r3 >= r4) goto L39
            java.lang.String r4 = "%02X"
            r5 = r0[r3]     // Catch: java.lang.Exception -> L3e
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch: java.lang.Exception -> L3e
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L3e
            r6[r2] = r5     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch: java.lang.Exception -> L3e
            r1.append(r4)     // Catch: java.lang.Exception -> L3e
            int r3 = r3 + 1
            goto L1f
        L39:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Exception -> L3e
            return r7
        L3e:
            java.lang.String r0 = "[^[a-z][A-Z][0-9][.][_]]"
            java.lang.String r1 = ""
            java.lang.String r7 = r7.replaceAll(r0, r1)
            return r7
    }

    public static boolean checkStrLen(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Le
            if (r0 != 0) goto Le
            int r1 = r1.length()     // Catch: java.lang.Exception -> Le
            if (r1 > r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.lang.String getFileMD5(java.io.File r6) {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            boolean r2 = r6.isFile()     // Catch: java.lang.Exception -> L3c
            if (r2 != 0) goto Ld
            java.lang.String r6 = ""
            return r6
        Ld:
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L3c
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L3c
            r3.<init>(r6)     // Catch: java.lang.Exception -> L3c
        L18:
            r6 = 0
            int r4 = r3.read(r1, r6, r0)     // Catch: java.lang.Exception -> L3c
            r5 = -1
            if (r4 == r5) goto L24
            r2.update(r1, r6, r4)     // Catch: java.lang.Exception -> L3c
            goto L18
        L24:
            r3.close()     // Catch: java.lang.Exception -> L3c
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r1 = r2.digest()
            r2 = 1
            r0.<init>(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r6] = r0
            java.lang.String r6 = "%1$032x"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            return r6
        L3c:
            r6 = 0
            return r6
    }

    public static java.lang.String getMD5(java.lang.String r4) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L34
            byte[] r4 = r4.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L34
            r0.update(r4)     // Catch: java.security.NoSuchAlgorithmException -> L34
            byte[] r4 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L34
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.security.NoSuchAlgorithmException -> L34
            r0.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L34
            r1 = 0
        L17:
            int r2 = r4.length     // Catch: java.security.NoSuchAlgorithmException -> L34
            if (r1 >= r2) goto L2f
            r2 = r4[r1]     // Catch: java.security.NoSuchAlgorithmException -> L34
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | (-256(0xffffffffffffff00, float:NaN))
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.security.NoSuchAlgorithmException -> L34
            r3 = 6
            java.lang.String r2 = r2.substring(r3)     // Catch: java.security.NoSuchAlgorithmException -> L34
            r0.append(r2)     // Catch: java.security.NoSuchAlgorithmException -> L34
            int r1 = r1 + 1
            goto L17
        L2f:
            java.lang.String r4 = r0.toString()     // Catch: java.security.NoSuchAlgorithmException -> L34
            return r4
        L34:
            r4 = move-exception
            java.lang.String r0 = "helper"
            java.lang.String r1 = "getMD5 error"
            com.umeng.commonsdk.statistics.common.MLog.i(r0, r1, r4)
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String getUmengMD5(java.lang.String r3) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L2d
            r0.update(r3)     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r0.digest()     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
        L17:
            int r2 = r3.length     // Catch: java.lang.Throwable -> L2d
            if (r1 >= r2) goto L28
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L2d
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L2d
            r0.append(r2)     // Catch: java.lang.Throwable -> L2d
            int r1 = r1 + 1
            goto L17
        L28:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L2d
            return r3
        L2d:
            r3 = move-exception
            java.lang.String r0 = "helper"
            java.lang.String r1 = "getMD5 error"
            com.umeng.commonsdk.statistics.common.MLog.i(r0, r1, r3)
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String readFile(java.io.File r3) {
            r0 = 0
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto Lb
            safeClose(r0)
            return r0
        Lb:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L22
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L22
            int r3 = r1.available()     // Catch: java.lang.Throwable -> L23
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L23
            r1.read(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            safeClose(r1)
            return r2
        L22:
            r1 = r0
        L23:
            safeClose(r1)
            return r0
    }

    public static byte[] readStreamToByteArray(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r3 == r2) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    public static java.lang.String readStreamToString(java.io.InputStream r4) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            char[] r4 = new char[r4]
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
        Le:
            int r2 = r0.read(r4)
            r3 = -1
            if (r3 == r2) goto L1a
            r3 = 0
            r1.write(r4, r3, r2)
            goto Le
        L1a:
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static void safeClose(java.io.InputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static void safeClose(java.io.OutputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static java.lang.String subStr(java.lang.String r5, int r6) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = ""
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L15
            if (r2 != 0) goto L3d
            int r2 = r5.length()     // Catch: java.lang.Exception -> L15
            if (r2 >= r6) goto L17
            int r2 = r5.length()     // Catch: java.lang.Exception -> L15
            goto L18
        L15:
            r5 = move-exception
            goto L3e
        L17:
            r2 = r6
        L18:
            r3 = 0
            java.lang.String r1 = r5.substring(r3, r2)     // Catch: java.lang.Exception -> L15
            byte[] r2 = r1.getBytes(r0)     // Catch: java.lang.Exception -> L15
            int r2 = r2.length     // Catch: java.lang.Exception -> L15
            r4 = r6
        L23:
            if (r2 <= r6) goto L3d
            int r4 = r4 + (-1)
            int r2 = r5.length()     // Catch: java.lang.Exception -> L15
            if (r4 <= r2) goto L32
            int r2 = r5.length()     // Catch: java.lang.Exception -> L15
            goto L33
        L32:
            r2 = r4
        L33:
            java.lang.String r1 = r5.substring(r3, r2)     // Catch: java.lang.Exception -> L15
            byte[] r2 = r1.getBytes(r0)     // Catch: java.lang.Exception -> L15
            int r2 = r2.length     // Catch: java.lang.Exception -> L15
            goto L23
        L3d:
            return r1
        L3e:
            com.umeng.commonsdk.statistics.common.MLog.e(r5)
            return r1
    }

    public static void writeFile(java.io.File r0, java.lang.String r1) throws java.io.IOException {
            byte[] r1 = r1.getBytes()
            writeFile(r0, r1)
            return
    }

    public static void writeFile(java.io.File r1, byte[] r2) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch: java.lang.Throwable -> Lf
            r0.flush()     // Catch: java.lang.Throwable -> Lf
            safeClose(r0)
            return
        Lf:
            r1 = move-exception
            safeClose(r0)
            throw r1
    }
}

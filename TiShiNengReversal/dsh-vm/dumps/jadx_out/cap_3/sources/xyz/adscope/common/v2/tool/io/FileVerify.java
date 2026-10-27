package xyz.adscope.common.v2.tool.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class FileVerify {
    private static final java.lang.String[] strHex = null;

    static {
            java.lang.String r15 = "e"
            java.lang.String r16 = "f"
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            java.lang.String r3 = "2"
            java.lang.String r4 = "3"
            java.lang.String r5 = "4"
            java.lang.String r6 = "5"
            java.lang.String r7 = "6"
            java.lang.String r8 = "7"
            java.lang.String r9 = "8"
            java.lang.String r10 = "9"
            java.lang.String r11 = "a"
            java.lang.String r12 = "b"
            java.lang.String r13 = "c"
            java.lang.String r14 = "d"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            xyz.adscope.common.v2.tool.io.FileVerify.strHex = r0
            return
    }

    private FileVerify() {
            r2 = this;
            r2.<init>()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "class don't need new instance"
            r0.<init>(r1)
            throw r0
    }

    private static byte[] File2byte(java.io.File r4) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L25
            r0.<init>(r4)     // Catch: java.io.IOException -> L25
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L25
            r4.<init>()     // Catch: java.io.IOException -> L25
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L25
        Le:
            int r2 = r0.read(r1)     // Catch: java.io.IOException -> L25
            r3 = -1
            if (r2 == r3) goto L1a
            r3 = 0
            r4.write(r1, r3, r2)     // Catch: java.io.IOException -> L25
            goto Le
        L1a:
            r0.close()     // Catch: java.io.IOException -> L25
            r4.close()     // Catch: java.io.IOException -> L25
            byte[] r4 = r4.toByteArray()     // Catch: java.io.IOException -> L25
            return r4
        L25:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
            r4 = 0
            return r4
    }

    private static java.lang.String bytesToHex(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L21
            r4 = r6[r3]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.append(r4)
            int r3 = r3 + 1
            goto L8
        L21:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String getFileBufferedMD5(java.io.File r4) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L44
            r0.<init>(r4)     // Catch: java.lang.Exception -> L44
            java.security.DigestInputStream r4 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2f
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L31
        L14:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L31
            r3 = -1
            if (r2 == r3) goto L1c
            goto L14
        L1c:
            java.security.MessageDigest r1 = r4.getMessageDigest()     // Catch: java.lang.Throwable -> L31
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = bytesToHex(r1)     // Catch: java.lang.Throwable -> L31
            r4.close()     // Catch: java.lang.Throwable -> L2f
            r0.close()     // Catch: java.lang.Exception -> L44
            return r1
        L2f:
            r4 = move-exception
            goto L3b
        L31:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L2f
        L3a:
            throw r1     // Catch: java.lang.Throwable -> L2f
        L3b:
            r0.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Exception -> L44
        L43:
            throw r4     // Catch: java.lang.Exception -> L44
        L44:
            r4 = 0
            return r4
    }

    public static java.lang.String getFileBufferedMD5(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = getFileBufferedMD5(r0)
            return r1
    }

    public static java.lang.String getFileMD5(java.io.File r6) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L30
            byte[] r6 = File2byte(r6)     // Catch: java.security.NoSuchAlgorithmException -> L30
            byte[] r6 = r1.digest(r6)     // Catch: java.security.NoSuchAlgorithmException -> L30
            int r1 = r6.length     // Catch: java.security.NoSuchAlgorithmException -> L30
            r2 = 0
        L15:
            if (r2 >= r1) goto L34
            r3 = r6[r2]     // Catch: java.security.NoSuchAlgorithmException -> L30
            if (r3 >= 0) goto L1d
            int r3 = r3 + 256
        L1d:
            int r4 = r3 / 16
            int r3 = r3 % 16
            java.lang.String[] r5 = xyz.adscope.common.v2.tool.io.FileVerify.strHex     // Catch: java.security.NoSuchAlgorithmException -> L30
            r4 = r5[r4]     // Catch: java.security.NoSuchAlgorithmException -> L30
            r0.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L30
            r3 = r5[r3]     // Catch: java.security.NoSuchAlgorithmException -> L30
            r0.append(r3)     // Catch: java.security.NoSuchAlgorithmException -> L30
            int r2 = r2 + 1
            goto L15
        L30:
            r6 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r6)
        L34:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String getFileMD5(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = getFileMD5(r0)
            return r1
    }
}

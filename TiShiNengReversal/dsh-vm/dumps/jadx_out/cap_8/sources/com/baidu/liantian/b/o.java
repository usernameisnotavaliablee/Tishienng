package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o {
    private static final java.lang.String[] a = null;

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
            com.baidu.liantian.b.o.a = r0
            return
    }

    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.io.File r5) {
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r1 = r5.exists()
            if (r1 != 0) goto La
            goto L4e
        La:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L35
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L35
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L36
        L19:
            int r3 = r2.read(r5)     // Catch: java.lang.Throwable -> L36
            r4 = -1
            if (r3 == r4) goto L25
            r4 = 0
            r1.update(r5, r4, r3)     // Catch: java.lang.Throwable -> L36
            goto L19
        L25:
            byte[] r5 = r1.digest()     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = e(r5)     // Catch: java.lang.Throwable -> L36
            r2.close()     // Catch: java.io.IOException -> L31
            return r5
        L31:
            com.baidu.liantian.b.e.a()
            return r5
        L35:
            r2 = r0
        L36:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L42
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L42
        L3f:
            com.baidu.liantian.b.e.a()
        L42:
            return r0
        L43:
            r5 = move-exception
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4d
        L4a:
            com.baidu.liantian.b.e.a()
        L4d:
            throw r5
        L4e:
            return r0
    }

    public static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L20
            byte[] r1 = r0.getBytes()     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r2.digest(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r1 = r0
        L21:
            com.baidu.liantian.b.e.a()
            return r1
    }

    public static java.lang.String a(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L19
            int r1 = r2.length
            if (r1 > 0) goto L7
            goto L19
        L7:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L16
            byte[] r2 = r1.digest(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            com.baidu.liantian.b.e.a()
        L19:
            return r0
    }

    public static java.lang.String b(byte[] r7) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L41
            r0.reset()     // Catch: java.security.NoSuchAlgorithmException -> L41
            r0.update(r7)     // Catch: java.security.NoSuchAlgorithmException -> L41
            byte[] r7 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L41
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L41
            r1.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L41
            int r2 = r7.length     // Catch: java.security.NoSuchAlgorithmException -> L41
            r3 = 0
        L19:
            if (r3 >= r2) goto L3c
            r4 = r7[r3]     // Catch: java.security.NoSuchAlgorithmException -> L41
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.security.NoSuchAlgorithmException -> L41
            java.lang.String r4 = r4.toUpperCase()     // Catch: java.security.NoSuchAlgorithmException -> L41
            int r5 = r4.length()     // Catch: java.security.NoSuchAlgorithmException -> L41
            r6 = 1
            if (r5 != r6) goto L33
            java.lang.String r5 = "0"
            r1.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L41
        L33:
            r1.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L41
            r1.append(r0)     // Catch: java.security.NoSuchAlgorithmException -> L41
            int r3 = r3 + 1
            goto L19
        L3c:
            java.lang.String r7 = r1.toString()     // Catch: java.security.NoSuchAlgorithmException -> L41
            return r7
        L41:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
    }

    public static byte[] c(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L15
            int r1 = r2.length
            if (r1 > 0) goto L7
            goto L15
        L7:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L12
            byte[] r2 = r1.digest(r2)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            com.baidu.liantian.b.e.a()
        L15:
            return r0
    }

    private static java.lang.String d(byte[] r6) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length
            if (r1 >= r2) goto L2e
            r2 = r6[r1]
            if (r2 >= 0) goto Lf
            int r2 = r2 + 256
        Lf:
            int r3 = r2 / 16
            int r2 = r2 % 16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String[] r5 = com.baidu.liantian.b.o.a
            r3 = r5[r3]
            r4.append(r3)
            r2 = r5[r2]
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L2e:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private static java.lang.String e(byte[] r6) {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            int r1 = r6.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            r2 = 0
        Ld:
            int r3 = r6.length
            if (r2 >= r3) goto L27
            r3 = r6[r2]
            int r4 = r2 * 2
            int r5 = r3 >>> 4
            r5 = r5 & 15
            char r5 = r0[r5]
            r1[r4] = r5
            int r4 = r4 + 1
            r3 = r3 & 15
            char r3 = r0[r3]
            r1[r4] = r3
            int r2 = r2 + 1
            goto Ld
        L27:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }
}

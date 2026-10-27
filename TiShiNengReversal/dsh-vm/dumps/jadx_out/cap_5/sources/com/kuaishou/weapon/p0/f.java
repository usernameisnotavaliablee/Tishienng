package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {
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
            com.kuaishou.weapon.p0.f.a = r0
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(byte r3) {
            if (r3 >= 0) goto L4
            int r3 = r3 + 256
        L4:
            int r0 = r3 / 16
            int r3 = r3 % 16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = com.kuaishou.weapon.p0.f.a
            r0 = r2[r0]
            r1.append(r0)
            r3 = r2[r3]
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    public static java.lang.String a(java.io.File r5) {
            r0 = 0
            if (r5 == 0) goto L3a
            boolean r1 = r5.exists()
            if (r1 != 0) goto La
            goto L3a
        La:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L33
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L33
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L25
        L19:
            int r3 = r2.read(r5)     // Catch: java.lang.Throwable -> L25
            r4 = -1
            if (r3 == r4) goto L27
            r4 = 0
            r1.update(r5, r4, r3)     // Catch: java.lang.Throwable -> L25
            goto L19
        L25:
            goto L35
        L27:
            byte[] r5 = r1.digest()     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = c(r5)     // Catch: java.lang.Throwable -> L25
            r2.close()     // Catch: java.lang.Throwable -> L32
        L32:
            return r5
        L33:
            r2 = r0
        L35:
            if (r2 == 0) goto L3a
            r2.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
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
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r1 = r0
        L21:
            return r1
    }

    public static java.lang.String a(byte[] r3) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.length
            if (r1 >= r2) goto L15
            r2 = r3[r1]
            java.lang.String r2 = a(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L15:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String b(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L16
            int r1 = r2.length
            if (r1 > 0) goto L7
            goto L16
        L7:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L16
            byte[] r2 = r1.digest(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            return r0
    }

    public static java.lang.String c(byte[] r6) {
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

    public static byte[] d(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L12
            int r1 = r2.length
            if (r1 > 0) goto L7
            goto L12
        L7:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L12
            byte[] r2 = r1.digest(r2)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }
}

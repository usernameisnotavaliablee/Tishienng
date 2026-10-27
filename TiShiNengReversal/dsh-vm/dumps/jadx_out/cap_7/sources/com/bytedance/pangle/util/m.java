package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class m {
    private static final char[] j = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.bytedance.pangle.util.m.j = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.io.File r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L26
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L26
            r1.<init>(r5)     // Catch: java.lang.Exception -> L26
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r5]     // Catch: java.lang.Exception -> L26
        Lf:
            r3 = 0
            int r4 = r1.read(r2, r3, r5)     // Catch: java.lang.Exception -> L26
            if (r4 <= 0) goto L1a
            r0.update(r2, r3, r4)     // Catch: java.lang.Exception -> L26
            goto Lf
        L1a:
            r1.close()     // Catch: java.lang.Exception -> L26
            byte[] r5 = r0.digest()     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = xt(r5)     // Catch: java.lang.Exception -> L26
            return r5
        L26:
            r5 = 0
            return r5
    }

    public static java.lang.String j(java.lang.String r0) {
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = j(r0)
            return r0
    }

    public static java.lang.String j(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L19
            int r1 = r2.length
            if (r1 > 0) goto L7
            goto L19
        L7:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> L19
            r1.update(r2)     // Catch: java.lang.Exception -> L19
            byte[] r2 = r1.digest()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = xt(r2)     // Catch: java.lang.Exception -> L19
            return r2
        L19:
            return r0
    }

    private static java.lang.String xt(byte[] r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r8.length
            if (r1 > 0) goto L8
            return r0
        L8:
            int r0 = r1 << 1
            char[] r0 = new char[r0]
            r2 = 0
            r3 = 0
        Le:
            if (r2 >= r1) goto L29
            int r4 = r3 + 1
            char[] r5 = com.bytedance.pangle.util.m.j
            r6 = r8[r2]
            int r7 = r6 >>> 4
            r7 = r7 & 15
            char r7 = r5[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r6 = r6 & 15
            char r5 = r5[r6]
            r0[r4] = r5
            int r2 = r2 + 1
            goto Le
        L29:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }
}

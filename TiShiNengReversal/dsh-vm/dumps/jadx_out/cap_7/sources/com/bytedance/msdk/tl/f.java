package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class f {
    private static final char[] cw = null;
    public static final java.nio.charset.Charset j = null;
    private static final java.security.MessageDigest xt = null;

    static {
            java.security.MessageDigest r0 = j()
            com.bytedance.msdk.tl.f.xt = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bytedance.msdk.tl.f.j = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.bytedance.msdk.tl.f.cw = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r2) {
            java.security.MessageDigest r0 = com.bytedance.msdk.tl.f.xt
            if (r2 != 0) goto L7
            java.lang.String r2 = ""
            return r2
        L7:
            java.nio.charset.Charset r1 = com.bytedance.msdk.tl.f.j
            byte[] r2 = r2.getBytes(r1)
            java.lang.Class<com.bytedance.msdk.tl.f> r1 = com.bytedance.msdk.tl.f.class
            monitor-enter(r1)
            byte[] r2 = r0.digest(r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = j(r2)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    public static java.lang.String j(byte[] r8) {
            if (r8 == 0) goto L2f
            int r0 = r8.length
            if (r0 != 0) goto L6
            goto L2f
        L6:
            int r0 = r8.length
            int r0 = r0 << 1
            char[] r0 = new char[r0]
            int r1 = r8.length
            r2 = 0
            r3 = 0
        Le:
            if (r2 >= r1) goto L29
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = com.bytedance.msdk.tl.f.cw
            r7 = r4 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> 4
            char r7 = r6[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto Le
        L29:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
        L2f:
            r8 = 0
            return r8
    }

    private static java.security.MessageDigest j() {
            java.lang.String r0 = "md5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}

package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class jy {
    private static final char[] j = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.bytedance.msdk.tl.jy.j = r0
            return
    }

    public jy() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L22
            int r1 = r3.length()     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto La
            goto L22
        La:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.lang.Exception -> L22
            r1.update(r3)     // Catch: java.lang.Exception -> L22
            byte[] r3 = r1.digest()     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = j(r3)     // Catch: java.lang.Exception -> L22
            return r3
        L22:
            return r0
    }

    public static java.lang.String j(byte[] r2) {
            if (r2 == 0) goto L9
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = j(r2, r0, r1)
            return r2
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "bytes is null"
            r2.<init>(r0)
            throw r2
    }

    public static java.lang.String j(byte[] r9, int r10, int r11) {
            if (r9 == 0) goto L39
            if (r10 < 0) goto L33
            int r0 = r10 + r11
            int r1 = r9.length
            if (r0 > r1) goto L33
            int r0 = r11 * 2
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r11) goto L2d
            int r5 = r3 + r10
            r5 = r9[r5]
            r6 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r4 + 1
            char[] r8 = com.bytedance.msdk.tl.jy.j
            int r6 = r6 >> 4
            char r6 = r8[r6]
            r1[r4] = r6
            int r4 = r4 + 2
            r5 = r5 & 15
            char r5 = r8[r5]
            r1[r7] = r5
            int r3 = r3 + 1
            goto L10
        L2d:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1, r2, r0)
            return r9
        L33:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException
            r9.<init>()
            throw r9
        L39:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "bytes is null"
            r9.<init>(r10)
            throw r9
    }
}

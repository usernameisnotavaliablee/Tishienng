package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class f {
    public static final byte[] a = null;
    private static final char[] b = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.tencent.bugly.proguard.f.b = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            com.tencent.bugly.proguard.f.a = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(byte[] r7) {
            if (r7 == 0) goto L2f
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L2f
        L6:
            int r0 = r7.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
        Lc:
            int r2 = r7.length
            if (r1 >= r2) goto L29
            r2 = r7[r1]
            int r3 = r1 * 2
            int r4 = r3 + 1
            char[] r5 = com.tencent.bugly.proguard.f.b
            r6 = r2 & 15
            char r6 = r5[r6]
            r0[r4] = r6
            int r2 = r2 >>> 4
            byte r2 = (byte) r2
            r2 = r2 & 15
            char r2 = r5[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto Lc
        L29:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            return r7
        L2f:
            r7 = 0
            return r7
    }
}

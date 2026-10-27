package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bo {
    public bo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final byte a(byte r0, int r1, boolean r2) {
            int r0 = a(r0, r1, r2)
            byte r0 = (byte) r0
            return r0
    }

    public static final int a(int r0, int r1, boolean r2) {
            if (r2 == 0) goto L7
            r2 = 1
            int r1 = r2 << r1
            r0 = r0 | r1
            return r0
        L7:
            int r0 = b(r0, r1)
            return r0
    }

    public static final int a(byte[] r1) {
            r0 = 0
            int r1 = a(r1, r0)
            return r1
    }

    public static final int a(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static final long a(long r2, int r4, boolean r5) {
            if (r5 == 0) goto L8
            r0 = 1
            long r4 = r0 << r4
            long r2 = r2 | r4
            return r2
        L8:
            long r2 = b(r2, r4)
            return r2
    }

    public static final short a(short r0, int r1, boolean r2) {
            int r0 = a(r0, r1, r2)
            short r0 = (short) r0
            return r0
    }

    public static final void a(int r1, byte[] r2) {
            r0 = 0
            a(r1, r2, r0)
            return
    }

    public static final void a(int r2, byte[] r3, int r4) {
            int r0 = r2 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            return
    }

    public static final boolean a(byte r0, int r1) {
            boolean r0 = a(r0, r1)
            return r0
    }

    public static final boolean a(int r1, int r2) {
            r0 = 1
            int r2 = r0 << r2
            r1 = r1 & r2
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    public static final boolean a(long r2, int r4) {
            r0 = 1
            long r0 = r0 << r4
            long r2 = r2 & r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public static final boolean a(short r0, int r1) {
            boolean r0 = a(r0, r1)
            return r0
    }

    public static final byte b(byte r0, int r1) {
            int r0 = b(r0, r1)
            byte r0 = (byte) r0
            return r0
    }

    public static final int b(int r1, int r2) {
            r0 = 1
            int r2 = r0 << r2
            int r2 = ~r2
            r1 = r1 & r2
            return r1
    }

    public static final long b(long r2, int r4) {
            r0 = 1
            long r0 = r0 << r4
            long r0 = ~r0
            long r2 = r2 & r0
            return r2
    }

    public static final short b(short r0, int r1) {
            int r0 = b(r0, r1)
            short r0 = (short) r0
            return r0
    }
}

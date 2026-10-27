package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class n implements java.lang.Cloneable {
    private long a;

    public n(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public byte[] a() {
            r7 = this;
            long r0 = r7.a
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r0
            int r3 = (int) r2
            byte r2 = (byte) r3
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r0
            r5 = 8
            long r3 = r3 >> r5
            int r4 = (int) r3
            byte r3 = (byte) r4
            r4 = 16711680(0xff0000, double:8.256667E-317)
            long r4 = r4 & r0
            r6 = 16
            long r4 = r4 >> r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 4278190080(0xff000000, double:2.113706745E-314)
            long r0 = r0 & r5
            r5 = 24
            long r0 = r0 >> r5
            int r1 = (int) r0
            byte r0 = (byte) r1
            r1 = 4
            byte[] r1 = new byte[r1]
            r5 = 0
            r1[r5] = r2
            r2 = 1
            r1[r2] = r3
            r2 = 2
            r1[r2] = r4
            r2 = 3
            r1[r2] = r0
            return r1
    }

    public long b() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L16
            boolean r1 = r6 instanceof com.tencent.open.utils.n
            if (r1 != 0) goto L8
            goto L16
        L8:
            long r1 = r5.a
            com.tencent.open.utils.n r6 = (com.tencent.open.utils.n) r6
            long r3 = r6.b()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L16
            r6 = 1
            return r6
        L16:
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r1 = (int) r0
            return r1
    }
}

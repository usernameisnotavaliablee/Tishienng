package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class l2 {
    public final double a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3662b;

    /* renamed from: c, reason: collision with root package name */
    public final double f3663c;

    /* renamed from: d, reason: collision with root package name */
    public final double f3664d;

    /* renamed from: e, reason: collision with root package name */
    public final double f3665e;

    /* renamed from: f, reason: collision with root package name */
    public final double f3666f;

    public l2(double r1, double r3, double r5, double r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f3662b = r5
            r0.f3663c = r3
            r0.f3664d = r7
            double r1 = r1 + r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r3
            r0.f3665e = r1
            double r5 = r5 + r7
            double r5 = r5 / r3
            r0.f3666f = r5
            return
    }

    private boolean b(double r4, double r6, double r8, double r10) {
            r3 = this;
            double r0 = r3.f3663c
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1a
            double r4 = r3.a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L1a
            double r4 = r3.f3664d
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1a
            double r4 = r3.f3662b
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L1a
            r4 = 1
            return r4
        L1a:
            r4 = 0
            return r4
    }

    public final boolean a(double r4, double r6) {
            r3 = this;
            double r0 = r3.a
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L1a
            double r0 = r3.f3663c
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L1a
            double r4 = r3.f3662b
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L1a
            double r4 = r3.f3664d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L1a
            r4 = 1
            return r4
        L1a:
            r4 = 0
            return r4
    }

    public final boolean c(com.amap.api.col.p0003l.l2 r10) {
            r9 = this;
            double r1 = r10.a
            double r3 = r10.f3663c
            double r5 = r10.f3662b
            double r7 = r10.f3664d
            r0 = r9
            boolean r10 = r0.b(r1, r3, r5, r7)
            return r10
    }

    public final boolean d(com.autonavi.amap.mapcore.DPoint r5) {
            r4 = this;
            double r0 = r5.x
            double r2 = r5.y
            boolean r5 = r4.a(r0, r2)
            return r5
    }

    public final boolean e(com.amap.api.col.p0003l.l2 r6) {
            r5 = this;
            double r0 = r6.a
            double r2 = r5.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            double r0 = r6.f3663c
            double r2 = r5.f3663c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L22
            double r0 = r6.f3662b
            double r2 = r5.f3662b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            double r0 = r6.f3664d
            double r2 = r5.f3664d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L22
            r6 = 1
            return r6
        L22:
            r6 = 0
            return r6
    }
}

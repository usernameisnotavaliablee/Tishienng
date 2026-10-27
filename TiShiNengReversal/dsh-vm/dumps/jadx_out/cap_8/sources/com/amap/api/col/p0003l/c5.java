package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c5 extends com.amap.api.col.p0003l.y7 {

    /* renamed from: h, reason: collision with root package name */
    private static int f3089h = 10000000;

    /* renamed from: b, reason: collision with root package name */
    protected int f3090b;

    /* renamed from: c, reason: collision with root package name */
    protected long f3091c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3092d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3093e;

    /* renamed from: f, reason: collision with root package name */
    private int f3094f;

    /* renamed from: g, reason: collision with root package name */
    private long f3095g;

    static {
            return
    }

    public c5(boolean r1, com.amap.api.col.p0003l.y7 r2, long r3, int r5) {
            r0 = this;
            r0.<init>(r2)
            r2 = 0
            r0.f3093e = r2
            r0.f3092d = r1
            r1 = 600000(0x927c0, float:8.40779E-40)
            r0.f3090b = r1
            r0.f3095g = r3
            r0.f3094f = r5
            return
    }

    @Override // com.amap.api.col.p0003l.y7
    public final int a() {
            r1 = this;
            r0 = 320000(0x4e200, float:4.48416E-40)
            return r0
    }

    @Override // com.amap.api.col.p0003l.y7
    protected final boolean d() {
            r9 = this;
            boolean r0 = r9.f3093e
            r1 = 1
            if (r0 == 0) goto Lf
            long r2 = r9.f3095g
            int r0 = r9.f3094f
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf
            return r1
        Lf:
            boolean r0 = r9.f3092d
            r2 = 0
            if (r0 != 0) goto L15
            return r2
        L15:
            long r3 = r9.f3095g
            int r0 = r9.f3094f
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L1f
            return r2
        L1f:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r9.f3091c
            long r5 = r3 - r5
            int r0 = r9.f3090b
            long r7 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L2f
            return r2
        L2f:
            r9.f3091c = r3
            return r1
    }

    public final void f(int r5) {
            r4 = this;
            if (r5 > 0) goto L3
            return
        L3:
            long r0 = r4.f3095g
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.f3095g = r0
            return
    }

    public final void g(boolean r1) {
            r0 = this;
            r0.f3093e = r1
            return
    }

    public final long h() {
            r2 = this;
            long r0 = r2.f3095g
            return r0
    }
}

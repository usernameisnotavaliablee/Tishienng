package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u3 extends com.amap.api.col.s.v3 {

    /* renamed from: b, reason: collision with root package name */
    protected int f4731b;

    /* renamed from: c, reason: collision with root package name */
    protected long f4732c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f4733d;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f4734e;

    public u3(android.content.Context r1, int r2, java.lang.String r3, com.amap.api.col.s.v3 r4) {
            r0 = this;
            r0.<init>(r4)
            r0.f4731b = r2
            r0.f4733d = r3
            r0.f4734e = r1
            return
    }

    @Override // com.amap.api.col.s.v3
    public final void b(boolean r4) {
            r3 = this;
            super.b(r4)
            if (r4 == 0) goto L16
            java.lang.String r4 = r3.f4733d
            long r0 = java.lang.System.currentTimeMillis()
            r3.f4732c = r0
            android.content.Context r2 = r3.f4734e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.amap.api.col.s.e2.d(r2, r4, r0)
        L16:
            return
    }

    @Override // com.amap.api.col.s.v3
    protected final boolean c() {
            r5 = this;
            long r0 = r5.f4732c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            java.lang.String r0 = r5.f4733d
            android.content.Context r1 = r5.f4734e
            java.lang.String r0 = com.amap.api.col.s.e2.a(r1, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L17
            goto L1b
        L17:
            long r2 = java.lang.Long.parseLong(r0)
        L1b:
            r5.f4732c = r2
        L1d:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f4732c
            long r0 = r0 - r2
            int r2 = r5.f4731b
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            r0 = 0
            return r0
        L2d:
            r0 = 1
            return r0
    }
}

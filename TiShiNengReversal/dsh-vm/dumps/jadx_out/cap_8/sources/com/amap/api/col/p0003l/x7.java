package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x7 extends com.amap.api.col.p0003l.y7 {

    /* renamed from: b, reason: collision with root package name */
    protected int f4199b;

    /* renamed from: c, reason: collision with root package name */
    protected long f4200c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f4201d;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f4202e;

    public x7(android.content.Context r1, int r2, java.lang.String r3, com.amap.api.col.p0003l.y7 r4) {
            r0 = this;
            r0.<init>(r4)
            r0.f4199b = r2
            r0.f4201d = r3
            r0.f4202e = r1
            return
    }

    @Override // com.amap.api.col.p0003l.y7
    public final void c(boolean r4) {
            r3 = this;
            super.c(r4)
            if (r4 == 0) goto L16
            java.lang.String r4 = r3.f4201d
            long r0 = java.lang.System.currentTimeMillis()
            r3.f4200c = r0
            android.content.Context r2 = r3.f4202e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.amap.api.col.p0003l.s5.d(r2, r4, r0)
        L16:
            return
    }

    @Override // com.amap.api.col.p0003l.y7
    protected final boolean d() {
            r5 = this;
            long r0 = r5.f4200c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            java.lang.String r0 = r5.f4201d
            android.content.Context r1 = r5.f4202e
            java.lang.String r0 = com.amap.api.col.p0003l.s5.a(r1, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L17
            goto L1b
        L17:
            long r2 = java.lang.Long.parseLong(r0)
        L1b:
            r5.f4200c = r2
        L1d:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f4200c
            long r0 = r0 - r2
            int r2 = r5.f4199b
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

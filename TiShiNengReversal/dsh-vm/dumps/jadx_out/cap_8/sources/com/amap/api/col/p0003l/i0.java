package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i0 extends com.amap.api.col.p0003l.c8 implements com.amap.api.col.3l.x0.a {

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.x0 f3483d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.z0 f3484e;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.c1 f3485g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.Context f3486h;

    /* renamed from: i, reason: collision with root package name */
    private android.os.Bundle f3487i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3488j;

    private i0(com.amap.api.col.p0003l.c1 r2, android.content.Context r3) {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f3487i = r0
            r0 = 0
            r1.f3488j = r0
            r1.f3485g = r2
            r1.f3486h = r3
            return
    }

    public i0(com.amap.api.col.p0003l.c1 r1, android.content.Context r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.lang.String d() {
            r1 = this;
            android.content.Context r0 = r1.f3486h
            java.lang.String r0 = com.amap.api.col.p0003l.b3.f0(r0)
            return r0
    }

    private void e() throws java.io.IOException {
            r5 = this;
            com.amap.api.col.3l.c1 r0 = r5.f3485g
            java.lang.String r0 = r0.w()
            com.amap.api.col.3l.y0 r1 = new com.amap.api.col.3l.y0
            com.amap.api.col.3l.c1 r2 = r5.f3485g
            java.lang.String r2 = r2.getUrl()
            java.lang.String r3 = r5.d()
            com.amap.api.col.3l.c1 r4 = r5.f3485g
            java.lang.String r4 = r4.v()
            r1.<init>(r2, r3, r4, r0)
            com.amap.api.col.3l.x0 r0 = new com.amap.api.col.3l.x0
            com.amap.api.col.3l.c1 r2 = r5.f3485g
            java.lang.String r2 = r2.getUrl()
            android.content.Context r3 = r5.f3486h
            com.amap.api.col.3l.c1 r4 = r5.f3485g
            r0.<init>(r1, r2, r3, r4)
            r5.f3483d = r0
            r0.c(r5)
            com.amap.api.col.3l.z0 r0 = new com.amap.api.col.3l.z0
            com.amap.api.col.3l.c1 r1 = r5.f3485g
            r0.<init>(r1, r1)
            r5.f3484e = r0
            boolean r0 = r5.f3488j
            if (r0 != 0) goto L41
            com.amap.api.col.3l.x0 r0 = r5.f3483d
            r0.a()
        L41:
            return
    }

    public final void a() {
            r1 = this;
            r0 = 1
            r1.f3488j = r0
            com.amap.api.col.3l.x0 r0 = r1.f3483d
            if (r0 == 0) goto Lb
            r0.d()
            goto Le
        Lb:
            r1.cancelTask()
        Le:
            com.amap.api.col.3l.z0 r0 = r1.f3484e
            if (r0 == 0) goto L15
            r0.b()
        L15:
            return
    }

    public final void b() {
            r1 = this;
            android.os.Bundle r0 = r1.f3487i
            if (r0 == 0) goto La
            r0.clear()
            r0 = 0
            r1.f3487i = r0
        La:
            return
    }

    @Override // com.amap.api.col.3l.x0.a
    public final void c() {
            r1 = this;
            com.amap.api.col.3l.z0 r0 = r1.f3484e
            if (r0 == 0) goto L7
            r0.h()
        L7:
            return
    }

    @Override // com.amap.api.col.p0003l.c8
    public final void runTask() {
            r2 = this;
            com.amap.api.col.3l.c1 r0 = r2.f3485g
            boolean r0 = r0.d()
            if (r0 == 0) goto L10
            com.amap.api.col.3l.c1 r0 = r2.f3485g
            com.amap.api.col.3l.by$a r1 = com.amap.api.col.3l.by.a.f3026c
            r0.b(r1)
            return
        L10:
            r2.e()     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }
}

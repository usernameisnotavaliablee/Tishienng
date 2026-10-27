package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z1 extends com.amap.api.col.p0003l.c8 {

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f4286d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.p0003l.y1 f4287e;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.f2 f4288g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.3l.z1.a f4289h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, com.amap.api.col.p0003l.f2 r2);
    }

    public z1(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.f4286d = r3
            com.amap.api.col.3l.y1 r0 = r2.f4287e
            if (r0 != 0) goto L12
            com.amap.api.col.3l.y1 r0 = new com.amap.api.col.3l.y1
            java.lang.String r1 = ""
            r0.<init>(r3, r1)
            r2.f4287e = r0
        L12:
            return
    }

    private static java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = com.autonavi.base.amap.mapcore.FileUtil.getMapBaseStorage(r0)
            return r0
    }

    private static void e(java.lang.String r0, byte[] r1) {
            com.autonavi.base.amap.mapcore.FileUtil.writeDatasToFile(r0, r1)
            return
    }

    public final void a() {
            r2 = this;
            r0 = 0
            r2.f4286d = r0
            com.amap.api.col.3l.y1 r1 = r2.f4287e
            if (r1 == 0) goto L9
            r2.f4287e = r0
        L9:
            return
    }

    public final void b() {
            r1 = this;
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
            r0.b(r1)
            return
    }

    public final void b(com.amap.api.col.3l.z1.a r1) {
            r0 = this;
            r0.f4289h = r1
            return
    }

    public final void c(com.amap.api.col.p0003l.f2 r1) {
            r0 = this;
            r0.f4288g = r1
            return
    }

    public final void d(java.lang.String r2) {
            r1 = this;
            com.amap.api.col.3l.y1 r0 = r1.f4287e
            if (r0 == 0) goto L7
            r0.b(r2)
        L7:
            return
    }

    @Override // com.amap.api.col.p0003l.c8
    public final void runTask() {
            r3 = this;
            boolean r0 = com.amap.api.maps.MapsInitializer.getNetWorkEnable()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L7
            return
        L7:
            com.amap.api.col.3l.y1 r0 = r3.f4287e     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.m()     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.3l.y1$a r0 = (com.amap.api.col.3l.y1.a) r0     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            byte[] r1 = r0.a     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            android.content.Context r1 = r3.f4286d     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            r2.append(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "/custom_texture_data"
            r2.append(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L34
            byte[] r0 = r0.a     // Catch: java.lang.Throwable -> L34
            e(r1, r0)     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r0 = move-exception
            goto L4a
        L36:
            r1 = 0
        L37:
            com.amap.api.col.3l.z1$a r0 = r3.f4289h     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L40
            com.amap.api.col.3l.f2 r2 = r3.f4288g     // Catch: java.lang.Throwable -> L34
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L34
        L40:
            android.content.Context r0 = r3.f4286d     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.p0003l.w5.g(r0, r1)     // Catch: java.lang.Throwable -> L34
            return
        L4a:
            java.lang.String r1 = "CustomStyleTask"
            java.lang.String r2 = "download customStyle"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }
}

package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class x1 extends com.amap.api.col.p0003l.c8 {

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f4124d;

    /* renamed from: e, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate f4125e;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.p0003l.w1 f4126g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f4127h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f4128i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f4129j;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.col.3l.x1.a f4130k;
    private int l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(byte[] r1, int r2);

        void b(byte[] r1, int r2);
    }

    public x1(android.content.Context r3, com.amap.api.col.3l.x1.a r4, int r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f4127h = r0
            r2.f4128i = r0
            r2.f4129j = r0
            r2.f4124d = r3
            r2.f4130k = r4
            r2.l = r5
            com.amap.api.col.3l.w1 r4 = r2.f4126g
            java.lang.String r0 = ""
            if (r4 != 0) goto L22
            com.amap.api.col.3l.w1 r4 = new com.amap.api.col.3l.w1
            if (r5 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r4.<init>(r3, r0, r1)
            r2.f4126g = r4
        L22:
            com.amap.api.col.3l.w1 r4 = r2.f4126g
            r4.b(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            if (r6 != 0) goto L32
            r6 = r0
        L32:
            r4.append(r6)
            java.lang.String r5 = ".amapstyle"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.f4127h = r4
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getPath()
            r2.f4128i = r3
            return
    }

    public x1(android.content.Context r2, com.autonavi.base.amap.api.mapcore.IAMapDelegate r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4127h = r0
            r1.f4128i = r0
            r1.f4129j = r0
            r0 = 0
            r1.l = r0
            r1.f4124d = r2
            r1.f4125e = r3
            com.amap.api.col.3l.w1 r3 = r1.f4126g
            if (r3 != 0) goto L1e
            com.amap.api.col.3l.w1 r3 = new com.amap.api.col.3l.w1
            java.lang.String r0 = ""
            r3.<init>(r2, r0)
            r1.f4126g = r3
        L1e:
            return
    }

    private void c(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L12
            if (r4 != 0) goto L5
            goto L12
        L5:
            android.content.Context r0 = r2.f4124d
            java.lang.String r1 = "lastModified"
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "amap_style_config"
            com.amap.api.col.p0003l.x2.a(r0, r1, r3, r4)
        L12:
            return
    }

    private void d(java.lang.String r3, byte[] r4) {
            r2 = this;
            if (r3 == 0) goto L22
            if (r4 != 0) goto L5
            goto L22
        L5:
            java.lang.String r0 = r2.f4128i
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f4128i
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.autonavi.base.amap.mapcore.FileUtil.saveFileContents(r3, r4)
        L22:
            return
    }

    private byte[] e(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r2.f4128i
            if (r1 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f4128i
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            byte[] r3 = com.autonavi.base.amap.mapcore.FileUtil.readFileContents(r3)
            return r3
        L23:
            return r0
    }

    private java.lang.String f(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = r4.f4124d
            java.lang.String r2 = "lastModified"
            java.lang.String r5 = r2.concat(r5)
            java.lang.String r2 = "amap_style_config"
            java.lang.String r3 = ""
            java.lang.Object r5 = com.amap.api.col.p0003l.x2.b(r1, r2, r5, r3)
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L1d
            if (r5 == r3) goto L1d
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L1d:
            return r0
    }

    public final void a() {
            r2 = this;
            r0 = 0
            r2.f4124d = r0
            com.amap.api.col.3l.w1 r1 = r2.f4126g
            if (r1 == 0) goto L9
            r2.f4126g = r0
        L9:
            return
    }

    public final void b() {
            r1 = this;
            com.amap.api.col.3l.z2 r0 = com.amap.api.col.p0003l.z2.a()
            r0.b(r1)
            return
    }

    public final void b(java.lang.String r2) {
            r1 = this;
            com.amap.api.col.3l.w1 r0 = r1.f4126g
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            r1.f4129j = r2
            return
    }

    @Override // com.amap.api.col.p0003l.c8
    public final void runTask() {
            r5 = this;
            boolean r0 = com.amap.api.maps.MapsInitializer.getNetWorkEnable()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L8
            goto L9a
        L8:
            com.amap.api.col.3l.w1 r0 = r5.f4126g     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r5.f4129j     // Catch: java.lang.Throwable -> L2b
            r0.append(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r5.f4127h     // Catch: java.lang.Throwable -> L2b
            r0.append(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r5.f(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            com.amap.api.col.3l.w1 r2 = r5.f4126g     // Catch: java.lang.Throwable -> L2b
            r2.d(r1)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L9b
        L2d:
            byte[] r1 = r5.e(r0)     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.x1$a r2 = r5.f4130k     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L3c
            if (r1 == 0) goto L3c
            int r3 = r5.l     // Catch: java.lang.Throwable -> L2b
            r2.a(r1, r3)     // Catch: java.lang.Throwable -> L2b
        L3c:
            com.amap.api.col.3l.w1 r2 = r5.f4126g     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.m()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.w1$a r2 = (com.amap.api.col.3l.w1.a) r2     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L89
            byte[] r3 = r2.a     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L89
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b org.json.JSONException -> L55
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b org.json.JSONException -> L55
            goto L56
        L55:
            r3 = 0
        L56:
            if (r3 != 0) goto L89
            com.amap.api.col.3l.x1$a r3 = r5.f4130k     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L6e
            byte[] r3 = r2.a     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.util.Arrays.equals(r3, r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L7f
            com.amap.api.col.3l.x1$a r1 = r5.f4130k     // Catch: java.lang.Throwable -> L2b
            byte[] r3 = r2.a     // Catch: java.lang.Throwable -> L2b
            int r4 = r5.l     // Catch: java.lang.Throwable -> L2b
            r1.b(r3, r4)     // Catch: java.lang.Throwable -> L2b
            goto L7f
        L6e:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.f4125e     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L7f
            com.autonavi.base.amap.mapcore.MapConfig r3 = r1.getMapConfig()     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.isCustomStyleEnable()     // Catch: java.lang.Throwable -> L2b
            byte[] r4 = r2.a     // Catch: java.lang.Throwable -> L2b
            r1.setCustomMapStyle(r3, r4)     // Catch: java.lang.Throwable -> L2b
        L7f:
            byte[] r1 = r2.a     // Catch: java.lang.Throwable -> L2b
            r5.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r2.f4082c     // Catch: java.lang.Throwable -> L2b
            r5.c(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L89:
            android.content.Context r0 = r5.f4124d     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.col.p0003l.w5.g(r0, r1)     // Catch: java.lang.Throwable -> L2b
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r5.f4125e     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L9a
            r1 = 0
            r0.setRunLowFrame(r1)     // Catch: java.lang.Throwable -> L2b
        L9a:
            return
        L9b:
            java.lang.String r1 = "CustomStyleTask"
            java.lang.String r2 = "download customStyle"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }
}

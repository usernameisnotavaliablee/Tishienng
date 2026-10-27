package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class el extends android.view.View {
    private android.graphics.Bitmap a;

    /* renamed from: b, reason: collision with root package name */
    private android.graphics.Bitmap f3248b;

    /* renamed from: c, reason: collision with root package name */
    private android.graphics.Bitmap f3249c;

    /* renamed from: d, reason: collision with root package name */
    private android.graphics.Bitmap f3250d;

    /* renamed from: e, reason: collision with root package name */
    private android.graphics.Bitmap f3251e;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.Bitmap f3252f;

    /* renamed from: g, reason: collision with root package name */
    private android.graphics.Bitmap f3253g;

    /* renamed from: h, reason: collision with root package name */
    private android.graphics.Paint f3254h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3255i;

    /* renamed from: j, reason: collision with root package name */
    private int f3256j;

    /* renamed from: k, reason: collision with root package name */
    private int f3257k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private android.content.Context t;
    private boolean u;
    private float v;
    private float w;
    private boolean x;
    private boolean y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.el f3258d;

        a(com.amap.api.col.p0003l.el r1) {
                r0 = this;
                r0.f3258d = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r7 = this;
                com.amap.api.col.3l.el r0 = r7.f3258d
                java.lang.String r1 = com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME
                r2 = 0
                r0.e(r1, r2)
                com.amap.api.col.3l.el r0 = r7.f3258d
                java.lang.String r1 = com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME
                r2 = 1
                r0.e(r1, r2)
                com.amap.api.col.3l.el r0 = r7.f3258d
                android.content.Context r0 = com.amap.api.col.p0003l.el.a(r0)
                java.lang.String r1 = "amap_web_logo"
                java.lang.String r3 = "md5_day"
                java.lang.String r4 = ""
                java.lang.String r0 = com.amap.api.col.p0003l.r2.b(r0, r1, r3, r4)
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L78
                com.amap.api.col.3l.el r0 = r7.f3258d
                android.graphics.Bitmap r0 = com.amap.api.col.p0003l.el.g(r0)
                java.lang.String r5 = "md5_night"
                if (r0 == 0) goto L62
                com.amap.api.col.3l.el r0 = r7.f3258d
                android.graphics.Bitmap r0 = com.amap.api.col.p0003l.el.k(r0)
                if (r0 == 0) goto L62
                java.lang.String r0 = com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME
                java.lang.String r0 = com.amap.api.col.p0003l.m4.a(r0)
                com.amap.api.col.3l.el r6 = r7.f3258d
                android.content.Context r6 = com.amap.api.col.p0003l.el.a(r6)
                com.amap.api.col.p0003l.r2.c(r6, r1, r3, r0)
                java.lang.String r0 = com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME
                java.lang.String r0 = com.amap.api.col.p0003l.m4.a(r0)
                boolean r3 = r4.equals(r0)
                if (r3 != 0) goto L5c
                com.amap.api.col.3l.el r3 = r7.f3258d
                android.content.Context r3 = com.amap.api.col.p0003l.el.a(r3)
                com.amap.api.col.p0003l.r2.c(r3, r1, r5, r0)
            L5c:
                com.amap.api.col.3l.el r0 = r7.f3258d
                r0.p(r2)
                return
            L62:
                com.amap.api.col.3l.el r0 = r7.f3258d
                android.content.Context r0 = com.amap.api.col.p0003l.el.a(r0)
                java.lang.String r2 = "0b718b5f291b09d2b62be725dfb977b3"
                com.amap.api.col.p0003l.r2.c(r0, r1, r3, r2)
                com.amap.api.col.3l.el r0 = r7.f3258d
                android.content.Context r0 = com.amap.api.col.p0003l.el.a(r0)
                java.lang.String r2 = "4b1405462a5c910de0e0723ffd96c018"
                com.amap.api.col.p0003l.r2.c(r0, r1, r5, r2)
            L78:
                return
        }
    }

    public el(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.f3254h = r0
            r0 = 0
            r5.f3255i = r0
            r5.f3256j = r0
            r5.f3257k = r0
            r5.l = r0
            r1 = 10
            r5.m = r1
            r5.n = r0
            r5.o = r0
            r5.p = r1
            r1 = 8
            r5.q = r1
            r5.r = r0
            r5.s = r0
            r1 = 1
            r5.u = r1
            r2 = 0
            r5.v = r2
            r5.w = r2
            r5.x = r1
            r5.y = r0
            r0 = 0
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> Ldb
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> Ldb
            r5.t = r2     // Catch: java.lang.Throwable -> Ldb
            android.content.res.AssetManager r2 = com.amap.api.col.p0003l.v2.b(r6)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = "ap.data"
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> Ldb
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> Ld7
            r5.f3252f = r3     // Catch: java.lang.Throwable -> Ld7
            float r4 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Bitmap r3 = com.amap.api.col.p0003l.b3.m(r3, r4)     // Catch: java.lang.Throwable -> Ld7
            r5.a = r3     // Catch: java.lang.Throwable -> Ld7
            r2.close()     // Catch: java.lang.Throwable -> Ld7
            android.content.res.AssetManager r3 = com.amap.api.col.p0003l.v2.b(r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "ap1.data"
            java.io.InputStream r0 = r3.open(r4)     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Throwable -> Ld7
            r5.f3253g = r3     // Catch: java.lang.Throwable -> Ld7
            float r4 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Bitmap r3 = com.amap.api.col.p0003l.b3.m(r3, r4)     // Catch: java.lang.Throwable -> Ld7
            r5.f3248b = r3     // Catch: java.lang.Throwable -> Ld7
            r0.close()     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Bitmap r3 = r5.f3248b     // Catch: java.lang.Throwable -> Ld7
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> Ld7
            r5.f3257k = r3     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Bitmap r3 = r5.f3248b     // Catch: java.lang.Throwable -> Ld7
            int r3 = r3.getHeight()     // Catch: java.lang.Throwable -> Ld7
            r5.f3256j = r3     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Paint r3 = r5.f3254h     // Catch: java.lang.Throwable -> Ld7
            r3.setAntiAlias(r1)     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Paint r1 = r5.f3254h     // Catch: java.lang.Throwable -> Ld7
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r3)     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Paint r1 = r5.f3254h     // Catch: java.lang.Throwable -> Ld7
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> Ld7
            r1.setStyle(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r1.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.io.File r3 = r6.getFilesDir()     // Catch: java.lang.Throwable -> Ld7
            r1.append(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = "/icon_web_day.data"
            r1.append(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = r1     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r1.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.io.File r6 = r6.getFilesDir()     // Catch: java.lang.Throwable -> Ld7
            r1.append(r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = "/icon_web_night.data"
            r1.append(r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> Ld7
            com.autonavi.amap.mapcore.AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = r6     // Catch: java.lang.Throwable -> Ld7
            com.amap.api.col.3l.z2 r6 = com.amap.api.col.p0003l.z2.a()     // Catch: java.lang.Throwable -> Ld7
            com.amap.api.col.3l.el$a r1 = new com.amap.api.col.3l.el$a     // Catch: java.lang.Throwable -> Ld7
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Ld7
            r6.b(r1)     // Catch: java.lang.Throwable -> Ld7
            r2.close()     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r0.close()     // Catch: java.lang.Throwable -> Ld6
            goto Lf0
        Ld6:
            return
        Ld7:
            r6 = move-exception
            r1 = r0
            r0 = r2
            goto Ldd
        Ldb:
            r6 = move-exception
            r1 = r0
        Ldd:
            java.lang.String r2 = "WaterMarkerView"
            java.lang.String r3 = "create"
            com.amap.api.col.p0003l.w5.p(r6, r2, r3)     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto Leb
            r0.close()     // Catch: java.lang.Throwable -> Lea
            goto Leb
        Lea:
        Leb:
            if (r1 == 0) goto Lf0
            r1.close()     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            return
        Lf1:
            r6 = move-exception
            if (r0 == 0) goto Lf9
            r0.close()     // Catch: java.lang.Throwable -> Lf8
            goto Lf9
        Lf8:
        Lf9:
            if (r1 == 0) goto Lfe
            r1.close()     // Catch: java.lang.Throwable -> Lfe
        Lfe:
            throw r6
    }

    static /* synthetic */ android.content.Context a(com.amap.api.col.p0003l.el r0) {
            android.content.Context r0 = r0.t
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap g(com.amap.api.col.p0003l.el r0) {
            android.graphics.Bitmap r0 = r0.f3249c
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap k(com.amap.api.col.p0003l.el r0) {
            android.graphics.Bitmap r0 = r0.f3250d
            return r0
    }

    private android.graphics.Bitmap r() {
            r1 = this;
            boolean r0 = r1.y
            if (r0 == 0) goto L9
            android.graphics.Bitmap r0 = r1.f3251e
            if (r0 == 0) goto L9
            return r0
        L9:
            boolean r0 = r1.f3255i
            if (r0 == 0) goto L19
            boolean r0 = r1.s
            if (r0 == 0) goto L16
            android.graphics.Bitmap r0 = r1.f3250d
            if (r0 == 0) goto L16
            return r0
        L16:
            android.graphics.Bitmap r0 = r1.f3248b
            return r0
        L19:
            boolean r0 = r1.s
            if (r0 == 0) goto L22
            android.graphics.Bitmap r0 = r1.f3249c
            if (r0 == 0) goto L22
            return r0
        L22:
            android.graphics.Bitmap r0 = r1.a
            return r0
    }

    private void s() {
            r3 = this;
            int r0 = r3.o
            if (r0 == 0) goto Lc
            r1 = 2
            if (r0 == r1) goto L8
            goto Lf
        L8:
            r3.t()
            goto Lf
        Lc:
            r3.u()
        Lf:
            int r0 = r3.p
            r3.m = r0
            int r0 = r3.getHeight()
            int r1 = r3.q
            int r0 = r0 - r1
            int r1 = r3.f3256j
            int r0 = r0 - r1
            r3.n = r0
            int r1 = r3.m
            r2 = 0
            if (r1 >= 0) goto L26
            r3.m = r2
        L26:
            if (r0 >= 0) goto L2a
            r3.n = r2
        L2a:
            return
    }

    private void t() {
            r2 = this;
            boolean r0 = r2.x
            if (r0 == 0) goto L11
            int r0 = r2.getWidth()
            float r0 = (float) r0
            float r1 = r2.v
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.p = r0
            goto L21
        L11:
            int r0 = r2.getWidth()
            float r0 = (float) r0
            float r1 = r2.v
            float r0 = r0 * r1
            int r1 = r2.f3257k
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            r2.p = r0
        L21:
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r1 = r2.w
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.q = r0
            return
    }

    private void u() {
            r3 = this;
            int r0 = r3.l
            r1 = 1
            r2 = 2
            if (r0 != r1) goto L11
            int r0 = r3.getWidth()
            int r1 = r3.f3257k
            int r0 = r0 - r1
            int r0 = r0 / r2
            r3.p = r0
            goto L22
        L11:
            r1 = 10
            if (r0 != r2) goto L20
            int r0 = r3.getWidth()
            int r2 = r3.f3257k
            int r0 = r0 - r2
            int r0 = r0 - r1
            r3.p = r0
            goto L22
        L20:
            r3.p = r1
        L22:
            r0 = 8
            r3.q = r0
            return
    }

    public final void b() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.a     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            if (r0 == 0) goto Ld
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
            r3.a = r1     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L48
        Ld:
            android.graphics.Bitmap r0 = r3.f3248b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L16
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
            r3.f3248b = r1     // Catch: java.lang.Throwable -> Lb
        L16:
            r3.a = r1     // Catch: java.lang.Throwable -> Lb
            r3.f3248b = r1     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap r0 = r3.f3252f     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L23
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
            r3.f3252f = r1     // Catch: java.lang.Throwable -> Lb
        L23:
            android.graphics.Bitmap r0 = r3.f3253g     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L2c
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
            r3.f3253g = r1     // Catch: java.lang.Throwable -> Lb
        L2c:
            android.graphics.Bitmap r0 = r3.f3249c     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L33
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
        L33:
            r3.f3249c = r1     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap r0 = r3.f3250d     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L3c
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
        L3c:
            r3.f3250d = r1     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap r0 = r3.f3251e     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L45
            r0.recycle()     // Catch: java.lang.Throwable -> Lb
        L45:
            r3.f3254h = r1     // Catch: java.lang.Throwable -> Lb
            return
        L48:
            java.lang.String r1 = "WaterMarkerView"
            java.lang.String r2 = "destory"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final void c(int r2) {
            r1 = this;
            r0 = 0
            r1.o = r0
            r1.l = r2
            r1.l()
            return
    }

    public final void d(int r4, float r5) {
            r3 = this;
            boolean r0 = r3.u
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r3.o = r0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r2)
            float r5 = java.lang.Math.max(r1, r5)
            r1 = 1
            if (r4 == 0) goto L26
            if (r4 == r1) goto L1f
            if (r4 == r0) goto L1b
            goto L2a
        L1b:
            float r2 = r2 - r5
            r3.w = r2
            goto L2a
        L1f:
            float r2 = r2 - r5
            r3.v = r2
            r4 = 0
            r3.x = r4
            goto L2a
        L26:
            r3.v = r5
            r3.x = r1
        L2a:
            r3.l()
            return
    }

    public final void e(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = r1.u     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L5
            goto L4f
        L5:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L11
            goto L4f
        L11:
            if (r3 != 0) goto L31
            android.graphics.Bitmap r3 = r1.f3249c     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2)     // Catch: java.lang.Throwable -> L2f
            r1.f3252f = r2     // Catch: java.lang.Throwable -> L2f
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r2 = com.amap.api.col.p0003l.b3.m(r2, r0)     // Catch: java.lang.Throwable -> L2f
            r1.f3249c = r2     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L4f
            boolean r2 = r3.isRecycled()     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L4f
            com.amap.api.col.p0003l.b3.B(r3)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r2 = move-exception
            goto L50
        L31:
            r0 = 1
            if (r3 != r0) goto L4f
            android.graphics.Bitmap r3 = r1.f3250d     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2)     // Catch: java.lang.Throwable -> L2f
            r1.f3252f = r2     // Catch: java.lang.Throwable -> L2f
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r2 = com.amap.api.col.p0003l.b3.m(r2, r0)     // Catch: java.lang.Throwable -> L2f
            r1.f3250d = r2     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L4f
            boolean r2 = r3.isRecycled()     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L4f
            com.amap.api.col.p0003l.b3.B(r3)     // Catch: java.lang.Throwable -> L2f
        L4f:
            return
        L50:
            java.lang.String r3 = "WaterMarkerView"
            java.lang.String r0 = "create"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)
            return
    }

    public final void f(boolean r3) {
            r2 = this;
            boolean r0 = r2.u
            if (r0 != 0) goto L5
            return
        L5:
            r2.f3255i = r3     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L12
            android.graphics.Paint r3 = r2.f3254h     // Catch: java.lang.Throwable -> L10
            r0 = -1
            r3.setColor(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            goto L1a
        L12:
            android.graphics.Paint r3 = r2.f3254h     // Catch: java.lang.Throwable -> L10
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1a:
            java.lang.String r0 = "WaterMarkerView"
            java.lang.String r1 = "changeBitmap"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }

    public final android.graphics.Point h() {
            r3 = this;
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r3.m
            int r2 = r3.n
            int r2 = r2 + (-2)
            r0.<init>(r1, r2)
            return r0
    }

    public final void i(int r2) {
            r1 = this;
            r0 = 1
            r1.o = r0
            r1.q = r2
            r1.l()
            return
    }

    public final void j(boolean r2) {
            r1 = this;
            boolean r0 = r1.u
            if (r0 != 0) goto L5
            goto L1b
        L5:
            r1.y = r2
            if (r2 == 0) goto L1c
            android.graphics.Bitmap r2 = r1.f3251e
            if (r2 == 0) goto L1b
            int r2 = r2.getWidth()
            r1.f3257k = r2
            android.graphics.Bitmap r2 = r1.f3251e
            int r2 = r2.getHeight()
            r1.f3256j = r2
        L1b:
            return
        L1c:
            android.graphics.Bitmap r2 = r1.a
            int r2 = r2.getWidth()
            r1.f3257k = r2
            android.graphics.Bitmap r2 = r1.a
            int r2 = r2.getHeight()
            r1.f3256j = r2
            return
    }

    public final void l() {
            r1 = this;
            int r0 = r1.getWidth()
            if (r0 == 0) goto L13
            int r0 = r1.getHeight()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            r1.s()
            r1.postInvalidate()
        L13:
            return
    }

    public final void m(int r2) {
            r1 = this;
            r0 = 1
            r1.o = r0
            r1.p = r2
            r1.l()
            return
    }

    public final void n(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public final float o(int r4) {
            r3 = this;
            boolean r0 = r3.u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r4 == 0) goto L18
            r0 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r4 == r0) goto L15
            r0 = 2
            if (r4 == r0) goto L11
            return r1
        L11:
            float r4 = r3.w
        L13:
            float r2 = r2 - r4
            return r2
        L15:
            float r4 = r3.v
            goto L13
        L18:
            float r4 = r3.v
            return r4
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.u     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L5
            goto L33
        L5:
            int r0 = r4.getWidth()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L33
            int r0 = r4.getHeight()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L12
            goto L33
        L12:
            android.graphics.Bitmap r0 = r4.f3248b     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r0 = r4.r     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            r4.s()     // Catch: java.lang.Throwable -> L22
            r0 = 1
            r4.r = r0     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r5 = move-exception
            goto L34
        L24:
            android.graphics.Bitmap r0 = r4.r()     // Catch: java.lang.Throwable -> L22
            int r1 = r4.m     // Catch: java.lang.Throwable -> L22
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L22
            int r2 = r4.n     // Catch: java.lang.Throwable -> L22
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L22
            android.graphics.Paint r3 = r4.f3254h     // Catch: java.lang.Throwable -> L22
            r5.drawBitmap(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L22
        L33:
            return
        L34:
            java.lang.String r0 = "WaterMarkerView"
            java.lang.String r1 = "onDraw"
            com.amap.api.col.p0003l.w5.p(r5, r0, r1)
            return
    }

    public final void p(boolean r2) {
            r1 = this;
            boolean r0 = r1.u
            if (r0 != 0) goto L5
            goto L47
        L5:
            boolean r0 = r1.s
            if (r0 == r2) goto L47
            r1.s = r2
            if (r2 == 0) goto L37
            boolean r2 = r1.f3255i
            if (r2 == 0) goto L24
            android.graphics.Bitmap r2 = r1.f3250d
            if (r2 == 0) goto L47
            int r2 = r2.getWidth()
            r1.f3257k = r2
            android.graphics.Bitmap r2 = r1.f3250d
            int r2 = r2.getHeight()
            r1.f3256j = r2
            return
        L24:
            android.graphics.Bitmap r2 = r1.f3249c
            if (r2 == 0) goto L47
            int r2 = r2.getWidth()
            r1.f3257k = r2
            android.graphics.Bitmap r2 = r1.f3249c
            int r2 = r2.getHeight()
            r1.f3256j = r2
            return
        L37:
            android.graphics.Bitmap r2 = r1.a
            int r2 = r2.getWidth()
            r1.f3257k = r2
            android.graphics.Bitmap r2 = r1.a
            int r2 = r2.getHeight()
            r1.f3256j = r2
        L47:
            return
    }

    public final boolean q() {
            r1 = this;
            boolean r0 = r1.f3255i
            return r0
    }
}

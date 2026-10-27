package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ek extends android.view.View {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f3240b;

    /* renamed from: c, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate f3241c;

    /* renamed from: d, reason: collision with root package name */
    private android.graphics.Paint f3242d;

    /* renamed from: e, reason: collision with root package name */
    private android.graphics.Paint f3243e;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.Rect f3244f;

    /* renamed from: g, reason: collision with root package name */
    private com.autonavi.amap.mapcore.IPoint f3245g;

    /* renamed from: h, reason: collision with root package name */
    private float f3246h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f3247i;

    public ek(android.content.Context r5, com.autonavi.base.amap.api.mapcore.IAMapDelegate r6) {
            r4 = this;
            r4.<init>(r5)
            java.lang.String r0 = ""
            r4.a = r0
            r0 = 0
            r4.f3240b = r0
            r0 = 0
            r4.f3246h = r0
            r0 = 21
            int[] r0 = new int[r0]
            r0 = {x0070: FILL_ARRAY_DATA , data: [10000000, 5000000, 2000000, 1000000, 500000, 200000, 100000, 50000, 30000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5} // fill-array
            r4.f3247i = r0
            r4.f3241c = r6
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r4.f3242d = r6
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r4.f3244f = r6
            android.graphics.Paint r6 = r4.f3242d
            r0 = 1
            r6.setAntiAlias(r0)
            android.graphics.Paint r6 = r4.f3242d
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setColor(r1)
            android.graphics.Paint r6 = r4.f3242d
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = com.amap.api.col.p0003l.ha.a
            float r3 = r3 * r2
            r6.setStrokeWidth(r3)
            android.graphics.Paint r6 = r4.f3242d
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r2)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r4.f3243e = r6
            r6.setAntiAlias(r0)
            android.graphics.Paint r6 = r4.f3243e
            r6.setColor(r1)
            android.graphics.Paint r6 = r4.f3243e
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = com.amap.api.col.p0003l.ha.a
            float r1 = r1 * r0
            r6.setTextSize(r1)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = com.amap.api.col.p0003l.v2.a(r5, r6)
            float r5 = (float) r5
            r4.f3246h = r5
            com.autonavi.amap.mapcore.IPoint r5 = new com.autonavi.amap.mapcore.IPoint
            r5.<init>()
            r4.f3245g = r5
            return
    }

    private void b(int r1) {
            r0 = this;
            r0.f3240b = r1
            return
    }

    private void c(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void a() {
            r1 = this;
            r0 = 0
            r1.f3242d = r0
            r1.f3243e = r0
            r1.f3244f = r0
            r1.a = r0
            r1.f3245g = r0
            return
    }

    public final void d(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto La
            r1.setVisibility(r0)
            r1.e()
            return
        La:
            java.lang.String r2 = ""
            r1.c(r2)
            r1.b(r0)
            r2 = 8
            r1.setVisibility(r2)
            return
    }

    public final void e() {
            r9 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r9.f3241c
            if (r0 != 0) goto L5
            goto L1f
        L5:
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()     // Catch: java.lang.Throwable -> L7a
            r1 = 1
            int r0 = r0.getEngineIDWithType(r1)     // Catch: java.lang.Throwable -> L7a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r9.f3241c     // Catch: java.lang.Throwable -> L7a
            float r1 = r1.getPreciseLevel(r0)     // Catch: java.lang.Throwable -> L7a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r9.f3241c     // Catch: java.lang.Throwable -> L7a
            com.autonavi.amap.mapcore.IPoint r3 = r9.f3245g     // Catch: java.lang.Throwable -> L7a
            r2.getGeoCenter(r0, r3)     // Catch: java.lang.Throwable -> L7a
            com.autonavi.amap.mapcore.IPoint r0 = r9.f3245g     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L20
        L1f:
            return
        L20:
            int r2 = r0.x     // Catch: java.lang.Throwable -> L7a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L7a
            int r0 = r0.y     // Catch: java.lang.Throwable -> L7a
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L7a
            r0 = 20
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r2, r4, r0)     // Catch: java.lang.Throwable -> L7a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r9.f3241c     // Catch: java.lang.Throwable -> L7a
            float r2 = r2.getMapZoomScale()     // Catch: java.lang.Throwable -> L7a
            double r3 = r0.y     // Catch: java.lang.Throwable -> L7a
            r5 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r3 = r3 * r5
            r7 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r3 = r3 / r7
            double r3 = java.lang.Math.cos(r3)     // Catch: java.lang.Throwable -> L7a
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 * r7
            double r3 = r3 * r5
            r5 = 4708606483430899712(0x415854a640000000, double:6378137.0)
            double r3 = r3 * r5
            double r5 = (double) r1     // Catch: java.lang.Throwable -> L7a
            double r5 = java.lang.Math.pow(r7, r5)     // Catch: java.lang.Throwable -> L7a
            r7 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r5 = r5 * r7
            double r3 = r3 / r5
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L7a
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L7a
            int[] r5 = r9.f3247i     // Catch: java.lang.Throwable -> L7a
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L7a
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L7a
            double r5 = (double) r1     // Catch: java.lang.Throwable -> L7a
            double r7 = (double) r2     // Catch: java.lang.Throwable -> L7a
            double r3 = r3 * r7
            double r5 = r5 / r3
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = com.amap.api.col.p0003l.b3.u(r1)     // Catch: java.lang.Throwable -> L7a
            r9.b(r2)     // Catch: java.lang.Throwable -> L7a
            r9.c(r1)     // Catch: java.lang.Throwable -> L7a
            r0.recycle()     // Catch: java.lang.Throwable -> L7a
            r9.invalidate()     // Catch: java.lang.Throwable -> L7a
            return
        L7a:
            r0 = move-exception
            java.lang.String r1 = "AMapDelegateImpGLSurfaceView"
            java.lang.String r2 = "changeScaleState"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas r13) {
            r12 = this;
            java.lang.String r0 = r12.a
            if (r0 == 0) goto L8b
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8b
            int r0 = r12.f3240b
            if (r0 != 0) goto L12
            goto L8b
        L12:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r12.f3241c
            android.graphics.Point r0 = r0.getWaterMarkerPositon()
            if (r0 != 0) goto L1b
            goto L8b
        L1b:
            android.graphics.Paint r1 = r12.f3243e
            java.lang.String r2 = r12.a
            int r3 = r2.length()
            android.graphics.Rect r4 = r12.f3244f
            r5 = 0
            r1.getTextBounds(r2, r5, r3, r4)
            int r1 = r0.x
            int r0 = r0.y
            android.graphics.Rect r2 = r12.f3244f
            int r2 = r2.height()
            int r0 = r0 - r2
            int r0 = r0 + 5
            java.lang.String r2 = r12.a
            int r3 = r12.f3240b
            android.graphics.Rect r4 = r12.f3244f
            int r4 = r4.width()
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r3 = r3 + r1
            float r3 = (float) r3
            float r4 = (float) r0
            android.graphics.Paint r5 = r12.f3243e
            r13.drawText(r2, r3, r4, r5)
            android.graphics.Rect r2 = r12.f3244f
            int r2 = r2.height()
            int r2 = r2 + (-5)
            int r0 = r0 + r2
            float r7 = (float) r1
            float r0 = (float) r0
            float r2 = r12.f3246h
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            float r8 = r0 - r2
            float r2 = com.amap.api.col.p0003l.ha.a
            float r10 = r0 + r2
            android.graphics.Paint r11 = r12.f3242d
            r9 = r7
            r6 = r13
            r6.drawLine(r7, r8, r9, r10, r11)
            int r2 = r12.f3240b
            int r2 = r2 + r1
            float r9 = (float) r2
            android.graphics.Paint r11 = r12.f3242d
            r10 = r0
            r8 = r0
            r6.drawLine(r7, r8, r9, r10, r11)
            int r0 = r12.f3240b
            int r2 = r1 + r0
            float r7 = (float) r2
            float r2 = r12.f3246h
            float r2 = r2 * r3
            float r2 = r8 - r2
            int r1 = r1 + r0
            float r9 = (float) r1
            float r0 = com.amap.api.col.p0003l.ha.a
            float r10 = r8 + r0
            android.graphics.Paint r11 = r12.f3242d
            r8 = r2
            r6.drawLine(r7, r8, r9, r10, r11)
        L8b:
            return
    }
}

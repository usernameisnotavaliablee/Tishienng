package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g implements android.hardware.SensorEventListener {
    private android.hardware.SensorManager a;

    /* renamed from: b, reason: collision with root package name */
    private android.hardware.Sensor f3363b;

    /* renamed from: c, reason: collision with root package name */
    private android.hardware.Sensor f3364c;

    /* renamed from: d, reason: collision with root package name */
    private android.hardware.Sensor f3365d;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f3366e;

    /* renamed from: f, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate f3367f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.maps.model.Marker f3368g;

    /* renamed from: h, reason: collision with root package name */
    private float f3369h;

    /* renamed from: i, reason: collision with root package name */
    private float[] f3370i;

    /* renamed from: j, reason: collision with root package name */
    private float[] f3371j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f3372k;
    private float[] l;
    private boolean m;

    public g(android.content.Context r4, com.autonavi.base.amap.api.mapcore.IAMapDelegate r5) {
            r3 = this;
            r3.<init>()
            r0 = 3
            float[] r1 = new float[r0]
            r3.f3370i = r1
            float[] r1 = new float[r0]
            r3.f3371j = r1
            float[] r1 = new float[r0]
            r3.f3372k = r1
            r1 = 9
            float[] r1 = new float[r1]
            r3.l = r1
            r1 = 1
            r3.m = r1
            android.content.Context r2 = r4.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r3.f3366e = r2
            r3.f3367f = r5
            java.lang.String r5 = "sensor"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch: java.lang.Throwable -> L51
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4     // Catch: java.lang.Throwable -> L51
            r3.a = r4     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L40
            boolean r4 = r3.j()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L40
            android.hardware.SensorManager r4 = r3.a     // Catch: java.lang.Throwable -> L51
            android.hardware.Sensor r4 = r4.getDefaultSensor(r0)     // Catch: java.lang.Throwable -> L51
            r3.f3363b = r4     // Catch: java.lang.Throwable -> L51
            return
        L40:
            android.hardware.SensorManager r4 = r3.a     // Catch: java.lang.Throwable -> L51
            android.hardware.Sensor r4 = r4.getDefaultSensor(r1)     // Catch: java.lang.Throwable -> L51
            r3.f3364c = r4     // Catch: java.lang.Throwable -> L51
            android.hardware.SensorManager r4 = r3.a     // Catch: java.lang.Throwable -> L51
            r5 = 2
            android.hardware.Sensor r4 = r4.getDefaultSensor(r5)     // Catch: java.lang.Throwable -> L51
            r3.f3365d = r4     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    private float a(float r1) {
            r0 = this;
            float r1 = r0.g(r1)
            return r1
    }

    private float b(float[] r3, float[] r4) {
            r2 = this;
            float[] r0 = r2.l
            r1 = 0
            boolean r3 = android.hardware.SensorManager.getRotationMatrix(r0, r1, r3, r4)
            if (r3 == 0) goto L22
            float[] r3 = r2.l
            float[] r4 = r2.f3372k
            android.hardware.SensorManager.getOrientation(r3, r4)
            float[] r3 = r2.f3372k
            r4 = 0
            r0 = r3[r4]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            r3[r4] = r0
            float[] r3 = r2.f3372k
            r3 = r3[r4]
            return r3
        L22:
            r3 = 0
            return r3
    }

    private static int c(android.content.Context r1) {
            if (r1 == 0) goto L27
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            if (r1 == 0) goto L27
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L27
            int r1 = r1.getRotation()     // Catch: java.lang.Throwable -> L27
            r0 = 1
            if (r1 == r0) goto L24
            r0 = 2
            if (r1 == r0) goto L21
            r0 = 3
            if (r1 == r0) goto L1e
            goto L27
        L1e:
            r1 = -90
            return r1
        L21:
            r1 = 180(0xb4, float:2.52E-43)
            return r1
        L24:
            r1 = 90
            return r1
        L27:
            r1 = 0
            return r1
    }

    private float g(float r3) {
            r2 = this;
            android.content.Context r0 = r2.f3366e
            int r0 = c(r0)
            float r0 = (float) r0
            float r3 = r3 + r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L13
            float r3 = r3 - r0
            goto L1a
        L13:
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L1a
            float r3 = r3 + r0
        L1a:
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L21
            r3 = 0
        L21:
            return r3
    }

    private void i(float r3) {
            r2 = this;
            com.amap.api.maps.model.Marker r0 = r2.f3368g
            if (r0 == 0) goto L1e
            boolean r1 = r2.m     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L18
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.f3367f     // Catch: java.lang.Throwable -> L1e
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.q(r3)     // Catch: java.lang.Throwable -> L1e
            r0.moveCamera(r1)     // Catch: java.lang.Throwable -> L1e
            com.amap.api.maps.model.Marker r0 = r2.f3368g     // Catch: java.lang.Throwable -> L1e
            float r3 = -r3
            r0.setRotateAngle(r3)     // Catch: java.lang.Throwable -> L1e
            return
        L18:
            r1 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 - r3
            r0.setRotateAngle(r1)     // Catch: java.lang.Throwable -> L1e
        L1e:
            return
    }

    private boolean j() {
            r4 = this;
            android.hardware.SensorManager r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = -1
            java.util.List r0 = r0.getSensorList(r2)
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            android.hardware.Sensor r2 = (android.hardware.Sensor) r2
            int r3 = r2.getType()
            r2.getStringType()
            r2 = 3
            if (r3 != r2) goto Lf
            r0 = 1
            return r0
        L27:
            return r1
    }

    public final void d() {
            r4 = this;
            android.hardware.SensorManager r0 = r4.a
            r1 = 3
            if (r0 == 0) goto Lc
            android.hardware.Sensor r2 = r4.f3363b
            if (r2 == 0) goto Lc
            r0.registerListener(r4, r2, r1)
        Lc:
            android.hardware.SensorManager r0 = r4.a
            if (r0 == 0) goto L22
            android.hardware.Sensor r2 = r4.f3364c
            if (r2 == 0) goto L22
            android.hardware.Sensor r3 = r4.f3365d
            if (r3 == 0) goto L22
            r0.registerListener(r4, r2, r1)
            android.hardware.SensorManager r0 = r4.a
            android.hardware.Sensor r2 = r4.f3365d
            r0.registerListener(r4, r2, r1)
        L22:
            return
    }

    public final void e(com.amap.api.maps.model.Marker r1) {
            r0 = this;
            r0.f3368g = r1
            return
    }

    public final void f(boolean r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public final void h() {
            r3 = this;
            android.hardware.SensorManager r0 = r3.a
            if (r0 == 0) goto Lb
            android.hardware.Sensor r1 = r3.f3363b
            if (r1 == 0) goto Lb
            r0.unregisterListener(r3, r1)
        Lb:
            android.hardware.SensorManager r0 = r3.a
            if (r0 == 0) goto L21
            android.hardware.Sensor r1 = r3.f3364c
            if (r1 == 0) goto L21
            android.hardware.Sensor r2 = r3.f3365d
            if (r2 == 0) goto L21
            r0.unregisterListener(r3, r1)
            android.hardware.SensorManager r0 = r3.a
            android.hardware.Sensor r1 = r3.f3365d
            r0.unregisterListener(r3, r1)
        L21:
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r4) {
            r3 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.f3367f     // Catch: java.lang.Throwable -> L6f
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L15
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r3.f3367f     // Catch: java.lang.Throwable -> L6f
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.getAnimateionsCount()     // Catch: java.lang.Throwable -> L6f
            if (r0 <= 0) goto L15
            goto L6f
        L15:
            android.hardware.Sensor r0 = r4.sensor     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> L6f
            r1 = 3
            r2 = 1077936128(0x40400000, float:3.0)
            if (r0 != r1) goto L3b
            float[] r4 = r4.values     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L6f
            float r0 = r3.a(r4)     // Catch: java.lang.Throwable -> L6f
            float r1 = r3.f3369h     // Catch: java.lang.Throwable -> L6f
            float r1 = r1 - r4
            float r4 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L6f
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L35
            goto L6f
        L35:
            r3.f3369h = r0     // Catch: java.lang.Throwable -> L6f
            r3.i(r0)     // Catch: java.lang.Throwable -> L6f
            return
        L3b:
            r1 = 1
            if (r0 != r1) goto L49
            float[] r4 = r4.values     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r4.clone()     // Catch: java.lang.Throwable -> L6f
            float[] r4 = (float[]) r4     // Catch: java.lang.Throwable -> L6f
            r3.f3370i = r4     // Catch: java.lang.Throwable -> L6f
            goto L56
        L49:
            r1 = 2
            if (r0 != r1) goto L56
            float[] r4 = r4.values     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r4.clone()     // Catch: java.lang.Throwable -> L6f
            float[] r4 = (float[]) r4     // Catch: java.lang.Throwable -> L6f
            r3.f3371j = r4     // Catch: java.lang.Throwable -> L6f
        L56:
            float[] r4 = r3.f3370i     // Catch: java.lang.Throwable -> L6f
            float[] r0 = r3.f3371j     // Catch: java.lang.Throwable -> L6f
            float r4 = r3.b(r4, r0)     // Catch: java.lang.Throwable -> L6f
            float r0 = r3.f3369h     // Catch: java.lang.Throwable -> L6f
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L6f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6a
            goto L6f
        L6a:
            r3.f3369h = r4     // Catch: java.lang.Throwable -> L6f
            r3.i(r4)     // Catch: java.lang.Throwable -> L6f
        L6f:
            return
    }
}

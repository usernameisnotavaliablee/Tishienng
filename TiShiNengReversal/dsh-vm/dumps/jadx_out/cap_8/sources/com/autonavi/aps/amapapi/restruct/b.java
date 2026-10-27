package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b implements android.hardware.SensorEventListener {
    android.hardware.SensorManager a;

    /* renamed from: b, reason: collision with root package name */
    android.hardware.Sensor f5725b;

    /* renamed from: c, reason: collision with root package name */
    android.hardware.Sensor f5726c;

    /* renamed from: d, reason: collision with root package name */
    android.hardware.Sensor f5727d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5728e;

    /* renamed from: f, reason: collision with root package name */
    public double f5729f;

    /* renamed from: g, reason: collision with root package name */
    public float f5730g;

    /* renamed from: h, reason: collision with root package name */
    android.os.Handler f5731h;

    /* renamed from: i, reason: collision with root package name */
    double f5732i;

    /* renamed from: j, reason: collision with root package name */
    double f5733j;

    /* renamed from: k, reason: collision with root package name */
    double f5734k;
    double l;
    double[] m;
    volatile double n;
    long o;
    long p;
    final int q;
    final int r;
    private android.content.Context s;
    private float t;
    private float u;

    public b(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.s = r0
            r4.a = r0
            r4.f5725b = r0
            r4.f5726c = r0
            r4.f5727d = r0
            r0 = 0
            r4.f5728e = r0
            r0 = 0
            r4.f5729f = r0
            r2 = 0
            r4.f5730g = r2
            r3 = 1149063168(0x447d5000, float:1013.25)
            r4.t = r3
            r4.u = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r4.f5731h = r2
            r4.f5732i = r0
            r4.f5733j = r0
            r4.f5734k = r0
            r4.l = r0
            r2 = 3
            double[] r2 = new double[r2]
            r4.m = r2
            r4.n = r0
            r0 = 0
            r4.o = r0
            r4.p = r0
            r0 = 100
            r4.q = r0
            r0 = 30
            r4.r = r0
            r4.s = r5     // Catch: java.lang.Throwable -> L54
            android.hardware.SensorManager r0 = r4.a     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L56
            java.lang.String r0 = "sensor"
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L54
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5     // Catch: java.lang.Throwable -> L54
            r4.a = r5     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L73
        L56:
            android.hardware.SensorManager r5 = r4.a     // Catch: java.lang.Throwable -> L5f
            r0 = 6
            android.hardware.Sensor r5 = r5.getDefaultSensor(r0)     // Catch: java.lang.Throwable -> L5f
            r4.f5725b = r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            android.hardware.SensorManager r5 = r4.a     // Catch: java.lang.Throwable -> L69
            r0 = 11
            android.hardware.Sensor r5 = r5.getDefaultSensor(r0)     // Catch: java.lang.Throwable -> L69
            r4.f5726c = r5     // Catch: java.lang.Throwable -> L69
        L69:
            android.hardware.SensorManager r5 = r4.a     // Catch: java.lang.Throwable -> L72
            r0 = 1
            android.hardware.Sensor r5 = r5.getDefaultSensor(r0)     // Catch: java.lang.Throwable -> L72
            r4.f5727d = r5     // Catch: java.lang.Throwable -> L72
        L72:
            return
        L73:
            java.lang.String r0 = "AMapSensorManager"
            java.lang.String r1 = "<init>"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    private void a(float[] r14) {
            r13 = this;
            double[] r0 = r13.m
            r1 = 0
            r2 = r0[r1]
            r4 = 4605380979056443392(0x3fe99999a0000000, double:0.800000011920929)
            double r2 = r2 * r4
            r6 = r14[r1]
            r7 = 1045220556(0x3e4ccccc, float:0.19999999)
            float r8 = r6 * r7
            double r8 = (double) r8
            double r2 = r2 + r8
            r0[r1] = r2
            r1 = 1
            r8 = r0[r1]
            double r8 = r8 * r4
            r10 = r14[r1]
            float r11 = r10 * r7
            double r11 = (double) r11
            double r8 = r8 + r11
            r0[r1] = r8
            r1 = 2
            r11 = r0[r1]
            double r11 = r11 * r4
            r14 = r14[r1]
            float r7 = r7 * r14
            double r4 = (double) r7
            double r11 = r11 + r4
            r0[r1] = r11
            double r0 = (double) r6
            double r0 = r0 - r2
            r13.f5732i = r0
            double r0 = (double) r10
            double r0 = r0 - r8
            r13.f5733j = r0
            double r0 = (double) r14
            double r0 = r0 - r11
            r13.f5734k = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r13.o
            long r2 = r0 - r2
            r4 = 100
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 >= 0) goto L4c
            goto L84
        L4c:
            double r2 = r13.f5732i
            double r2 = r2 * r2
            double r4 = r13.f5733j
            double r4 = r4 * r4
            double r2 = r2 + r4
            double r4 = r13.f5734k
            double r4 = r4 * r4
            double r2 = r2 + r4
            double r2 = java.lang.Math.sqrt(r2)
            long r4 = r13.p
            r6 = 1
            long r4 = r4 + r6
            r13.p = r4
            r13.o = r0
            double r0 = r13.n
            double r0 = r0 + r2
            r13.n = r0
            long r0 = r13.p
            r2 = 30
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 < 0) goto L84
            double r0 = r13.n
            long r2 = r13.p
            double r2 = (double) r2
            double r0 = r0 / r2
            r13.l = r0
            r0 = 0
            r13.n = r0
            r0 = 0
            r13.p = r0
        L84:
            return
    }

    private void b(float[] r3) {
            r2 = this;
            if (r3 == 0) goto L12
            float r0 = r2.t
            r1 = 0
            r3 = r3[r1]
            float r3 = android.hardware.SensorManager.getAltitude(r0, r3)
            float r3 = com.autonavi.aps.amapapi.utils.j.a(r3)
            double r0 = (double) r3
            r2.f5729f = r0
        L12:
            return
    }

    private void c(float[] r3) {
            r2 = this;
            if (r3 == 0) goto L2c
            r0 = 9
            float[] r0 = new float[r0]
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r3)
            r3 = 3
            float[] r3 = new float[r3]
            android.hardware.SensorManager.getOrientation(r0, r3)
            r0 = 0
            r3 = r3[r0]
            double r0 = (double) r3
            double r0 = java.lang.Math.toDegrees(r0)
            float r3 = (float) r0
            r2.u = r3
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L21
        L1f:
            double r0 = (double) r3
            goto L25
        L21:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 + r0
            goto L1f
        L25:
            double r0 = java.lang.Math.floor(r0)
            float r3 = (float) r0
            r2.u = r3
        L2c:
            return
    }

    public final void a() {
            r5 = this;
            java.lang.String r0 = "AMapSensorManager"
            android.hardware.SensorManager r1 = r5.a
            if (r1 == 0) goto L42
            boolean r2 = r5.f5728e
            if (r2 != 0) goto L42
            r2 = 1
            r5.f5728e = r2
            r2 = 3
            android.hardware.Sensor r3 = r5.f5725b     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1e
            android.os.Handler r4 = r5.f5731h     // Catch: java.lang.Throwable -> L18
            r1.registerListener(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L18
            goto L1e
        L18:
            r1 = move-exception
            java.lang.String r3 = "registerListener mPressure"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r3)
        L1e:
            android.hardware.Sensor r1 = r5.f5726c     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L30
            android.hardware.SensorManager r3 = r5.a     // Catch: java.lang.Throwable -> L2a
            android.os.Handler r4 = r5.f5731h     // Catch: java.lang.Throwable -> L2a
            r3.registerListener(r5, r1, r2, r4)     // Catch: java.lang.Throwable -> L2a
            goto L30
        L2a:
            r1 = move-exception
            java.lang.String r3 = "registerListener mRotationVector"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r3)
        L30:
            android.hardware.Sensor r1 = r5.f5727d     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L42
            android.hardware.SensorManager r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            android.os.Handler r4 = r5.f5731h     // Catch: java.lang.Throwable -> L3c
            r3.registerListener(r5, r1, r2, r4)     // Catch: java.lang.Throwable -> L3c
            goto L42
        L3c:
            r1 = move-exception
            java.lang.String r2 = "registerListener mAcceleroMeterVector"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)
        L42:
            return
    }

    public final void b() {
            r2 = this;
            android.hardware.SensorManager r0 = r2.a
            if (r0 == 0) goto L24
            boolean r1 = r2.f5728e
            if (r1 == 0) goto L24
            r1 = 0
            r2.f5728e = r1
            android.hardware.Sensor r1 = r2.f5725b     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            r0.unregisterListener(r2, r1)     // Catch: java.lang.Throwable -> L12
        L12:
            android.hardware.Sensor r0 = r2.f5726c     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            android.hardware.SensorManager r1 = r2.a     // Catch: java.lang.Throwable -> L1b
            r1.unregisterListener(r2, r0)     // Catch: java.lang.Throwable -> L1b
        L1b:
            android.hardware.Sensor r0 = r2.f5727d     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L24
            android.hardware.SensorManager r1 = r2.a     // Catch: java.lang.Throwable -> L24
            r1.unregisterListener(r2, r0)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public final double c() {
            r2 = this;
            double r0 = r2.f5729f
            return r0
    }

    public final float d() {
            r1 = this;
            float r0 = r1.u
            return r0
    }

    public final double e() {
            r2 = this;
            double r0 = r2.l
            return r0
    }

    public final void f() {
            r3 = this;
            r3.b()     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r3.f5725b = r0     // Catch: java.lang.Throwable -> L10
            r3.f5726c = r0     // Catch: java.lang.Throwable -> L10
            r3.a = r0     // Catch: java.lang.Throwable -> L10
            r3.f5727d = r0     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r3.f5728e = r0     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "AMapSensorManager"
            java.lang.String r2 = "destroy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L48
        L3:
            android.hardware.Sensor r0 = r3.sensor     // Catch: java.lang.Throwable -> L48
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> L48
            r1 = 1
            if (r0 == r1) goto L39
            r1 = 6
            if (r0 == r1) goto L24
            r1 = 11
            if (r0 == r1) goto L14
            goto L48
        L14:
            android.hardware.Sensor r0 = r2.f5726c     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L48
            float[] r3 = r3.values     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.clone()     // Catch: java.lang.Throwable -> L48
            float[] r3 = (float[]) r3     // Catch: java.lang.Throwable -> L48
            r2.c(r3)     // Catch: java.lang.Throwable -> L48
            return
        L24:
            android.hardware.Sensor r0 = r2.f5725b     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L48
            float[] r3 = r3.values     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.clone()     // Catch: java.lang.Throwable -> L48
            float[] r3 = (float[]) r3     // Catch: java.lang.Throwable -> L48
            r0 = 0
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L48
            r2.f5730g = r0     // Catch: java.lang.Throwable -> L48
            r2.b(r3)     // Catch: java.lang.Throwable -> L48
            return
        L39:
            android.hardware.Sensor r0 = r2.f5727d     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L48
            float[] r3 = r3.values     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.clone()     // Catch: java.lang.Throwable -> L48
            float[] r3 = (float[]) r3     // Catch: java.lang.Throwable -> L48
            r2.a(r3)     // Catch: java.lang.Throwable -> L48
        L48:
            return
    }
}

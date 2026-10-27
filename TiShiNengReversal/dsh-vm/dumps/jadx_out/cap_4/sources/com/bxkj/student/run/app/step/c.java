package com.bxkj.student.run.app.step;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements android.hardware.SensorEventListener {
    double[] a;
    final int b;
    float[] c;
    int d;
    boolean e;
    int f;
    int g;
    boolean h;
    float i;
    float j;
    long k;

    /* renamed from: l, reason: collision with root package name */
    long f1209l;

    /* renamed from: m, reason: collision with root package name */
    long f1210m;

    /* renamed from: n, reason: collision with root package name */
    float f1211n;

    /* renamed from: o, reason: collision with root package name */
    float f1212o;

    /* renamed from: p, reason: collision with root package name */
    final float f1213p;

    /* renamed from: q, reason: collision with root package name */
    float f1214q;

    /* renamed from: r, reason: collision with root package name */
    int f1215r;

    /* renamed from: s, reason: collision with root package name */
    private com.bxkj.student.run.app.step.b f1216s;

    public c() {
            r3 = this;
            r3.<init>()
            r0 = 3
            double[] r0 = new double[r0]
            r3.a = r0
            r0 = 4
            r3.b = r0
            float[] r0 = new float[r0]
            r3.c = r0
            r0 = 0
            r3.d = r0
            r3.e = r0
            r3.f = r0
            r3.g = r0
            r3.h = r0
            r0 = 0
            r3.i = r0
            r3.j = r0
            r1 = 0
            r3.k = r1
            r3.f1209l = r1
            r3.f1210m = r1
            r3.f1211n = r0
            r3.f1212o = r0
            r0 = 1067869798(0x3fa66666, float:1.3)
            r3.f1213p = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r3.f1214q = r0
            r0 = 250(0xfa, float:3.5E-43)
            r3.f1215r = r0
            return
    }

    public float a(float[] r4, int r5) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r5) goto La
            r2 = r4[r1]
            float r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        La:
            r4 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 / r4
            r5 = 1090519040(0x41000000, float:8.0)
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 < 0) goto L17
            r4 = 1082759578(0x4089999a, float:4.3)
            return r4
        L17:
            r1 = 1088421888(0x40e00000, float:7.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L25
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L25
            r4 = 1079194419(0x40533333, float:3.3)
            return r4
        L25:
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 < 0) goto L31
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 >= 0) goto L31
            r4 = 1075000115(0x40133333, float:2.3)
            return r4
        L31:
            r5 = 1077936128(0x40400000, float:3.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L3e
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L3e
            r4 = 1073741824(0x40000000, float:2.0)
            return r4
        L3e:
            r4 = 1067869798(0x3fa66666, float:1.3)
            return r4
    }

    public void b(float r8) {
            r7 = this;
            float r0 = r7.f1212o
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r7.f1212o = r8
            goto L5c
        La:
            boolean r0 = r7.c(r8, r0)
            if (r0 == 0) goto L5c
            long r0 = r7.k
            r7.f1209l = r0
            long r0 = java.lang.System.currentTimeMillis()
            r7.f1210m = r0
            long r2 = r7.f1209l
            long r2 = r0 - r2
            int r4 = r7.f1215r
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L39
            float r2 = r7.i
            float r3 = r7.j
            float r2 = r2 - r3
            float r3 = r7.f1214q
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L39
            r7.k = r0
            com.bxkj.student.run.app.step.b r0 = r7.f1216s
            if (r0 == 0) goto L39
            r0.a()
        L39:
            long r0 = r7.f1210m
            long r2 = r7.f1209l
            long r2 = r0 - r2
            int r4 = r7.f1215r
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L5c
            float r2 = r7.i
            float r3 = r7.j
            float r4 = r2 - r3
            r5 = 1067869798(0x3fa66666, float:1.3)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L5c
            r7.k = r0
            float r2 = r2 - r3
            float r0 = r7.e(r2)
            r7.f1214q = r0
        L5c:
            r7.f1212o = r8
            return
    }

    public boolean c(float r6, float r7) {
            r5 = this;
            boolean r0 = r5.e
            r5.h = r0
            r1 = 1
            r2 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L12
            r5.e = r1
            int r6 = r5.f
            int r6 = r6 + r1
            r5.f = r6
            goto L1a
        L12:
            int r6 = r5.f
            r5.g = r6
            r5.f = r2
            r5.e = r2
        L1a:
            boolean r6 = r5.e
            if (r6 != 0) goto L2e
            if (r0 == 0) goto L2e
            int r3 = r5.g
            r4 = 2
            if (r3 >= r4) goto L2b
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L2e
        L2b:
            r5.i = r7
            return r1
        L2e:
            if (r0 != 0) goto L34
            if (r6 == 0) goto L34
            r5.j = r7
        L34:
            return r2
    }

    public void d(com.bxkj.student.run.app.step.b r1) {
            r0 = this;
            r0.f1216s = r1
            return
    }

    public float e(float r7) {
            r6 = this;
            float r0 = r6.f1214q
            int r1 = r6.d
            r2 = 1
            r3 = 4
            if (r1 >= r3) goto L10
            float[] r3 = r6.c
            r3[r1] = r7
            int r1 = r1 + r2
            r6.d = r1
            return r0
        L10:
            float[] r0 = r6.c
            float r0 = r6.a(r0, r3)
        L16:
            if (r2 >= r3) goto L23
            float[] r1 = r6.c
            int r4 = r2 + (-1)
            r5 = r1[r2]
            r1[r4] = r5
            int r2 = r2 + 1
            goto L16
        L23:
            float[] r1 = r6.c
            r2 = 3
            r1[r2] = r7
            return r0
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 3
            if (r1 >= r2) goto L11
            double[] r2 = r5.a
            float[] r3 = r6.values
            r3 = r3[r1]
            double r3 = (double) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2
        L11:
            com.bxkj.student.run.app.step.b r6 = r5.f1216s
            if (r6 == 0) goto L1a
            double[] r1 = r5.a
            r6.b(r1)
        L1a:
            double[] r6 = r5.a
            r0 = r6[r0]
            double r0 = r0 * r0
            r2 = 1
            r2 = r6[r2]
            double r2 = r2 * r2
            double r0 = r0 + r2
            r2 = 2
            r2 = r6[r2]
            double r2 = r2 * r2
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            float r6 = (float) r0
            r5.f1211n = r6
            r5.b(r6)
            return
    }
}

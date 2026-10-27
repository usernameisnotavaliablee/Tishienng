package com.bxkj.student.v2.ui.sports.v3.service.step;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a implements android.hardware.SensorEventListener {

    @org.jetbrains.annotations.NotNull
    private double[] a;
    private final int b;

    @org.jetbrains.annotations.NotNull
    private float[] c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private float i;
    private float j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private long f1496l;

    /* renamed from: m, reason: collision with root package name */
    private long f1497m;

    /* renamed from: n, reason: collision with root package name */
    private float f1498n;

    /* renamed from: o, reason: collision with root package name */
    private float f1499o;

    /* renamed from: p, reason: collision with root package name */
    private final float f1500p;

    /* renamed from: q, reason: collision with root package name */
    private float f1501q;

    /* renamed from: r, reason: collision with root package name */
    private int f1502r;

    /* renamed from: s, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.run.app.step.b f1503s;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 3
            double[] r0 = new double[r0]
            r1.a = r0
            r0 = 4
            r1.b = r0
            float[] r0 = new float[r0]
            r1.c = r0
            r0 = 1067869798(0x3fa66666, float:1.3)
            r1.f1500p = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r1.f1501q = r0
            r0 = 250(0xfa, float:3.5E-43)
            r1.f1502r = r0
            return
    }

    public final void A(float r1) {
            r0 = this;
            r0.f1498n = r1
            return
    }

    public final void B(float r1) {
            r0 = this;
            r0.f1499o = r1
            return
    }

    public final void C(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public final void D(@org.jetbrains.annotations.NotNull double[] r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }

    public final void E(float r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public final void F(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public final void G(@org.jetbrains.annotations.NotNull float[] r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public final void H(float r1) {
            r0 = this;
            r0.f1501q = r1
            return
    }

    public final void I(int r1) {
            r0 = this;
            r0.f1502r = r1
            return
    }

    public final void J(long r1) {
            r0 = this;
            r0.f1496l = r1
            return
    }

    public final void K(long r1) {
            r0 = this;
            r0.f1497m = r1
            return
    }

    public final void L(long r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public final void M(float r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public final float a(@org.jetbrains.annotations.NotNull float[] r4, int r5) {
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            r1 = 0
        L7:
            if (r1 >= r5) goto Lf
            r2 = r4[r1]
            float r0 = r0 + r2
            int r1 = r1 + 1
            goto L7
        Lf:
            int r4 = r3.b
            float r4 = (float) r4
            float r0 = r0 / r4
            r4 = 1090519040(0x41000000, float:8.0)
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 < 0) goto L1d
            r4 = 1082759578(0x4089999a, float:4.3)
            return r4
        L1d:
            r5 = 1088421888(0x40e00000, float:7.0)
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 < 0) goto L2b
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L2b
            r4 = 1079194419(0x40533333, float:3.3)
            return r4
        L2b:
            r4 = 1082130432(0x40800000, float:4.0)
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 < 0) goto L39
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L39
            r4 = 1075000115(0x40133333, float:2.3)
            return r4
        L39:
            r5 = 1077936128(0x40400000, float:3.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L46
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L46
            r4 = 1073741824(0x40000000, float:2.0)
            return r4
        L46:
            r4 = 1067869798(0x3fa66666, float:1.3)
            return r4
    }

    public final void b(float r8) {
            r7 = this;
            float r0 = r7.f1499o
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r7.f1499o = r8
            goto L5e
        La:
            boolean r0 = r7.c(r8, r0)
            if (r0 == 0) goto L5e
            long r0 = r7.k
            r7.f1496l = r0
            long r0 = java.lang.System.currentTimeMillis()
            r7.f1497m = r0
            long r2 = r7.f1496l
            long r2 = r0 - r2
            int r4 = r7.f1502r
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3c
            float r2 = r7.i
            float r3 = r7.j
            float r2 = r2 - r3
            float r3 = r7.f1501q
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L3c
            r7.k = r0
            com.bxkj.student.run.app.step.b r0 = r7.f1503s
            if (r0 == 0) goto L3c
            kotlin.jvm.internal.g0.m(r0)
            r0.a()
        L3c:
            long r0 = r7.f1497m
            long r2 = r7.f1496l
            long r2 = r0 - r2
            int r4 = r7.f1502r
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L5e
            float r2 = r7.i
            float r3 = r7.j
            float r4 = r2 - r3
            float r5 = r7.f1500p
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L5e
            r7.k = r0
            float r2 = r2 - r3
            float r0 = r7.w(r2)
            r7.f1501q = r0
        L5e:
            r7.f1499o = r8
            return
    }

    public final boolean c(float r6, float r7) {
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

    public final int d() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public final int e() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public final float f() {
            r1 = this;
            float r0 = r1.f1498n
            return r0
    }

    public final float g() {
            r1 = this;
            float r0 = r1.f1499o
            return r0
    }

    public final float h() {
            r1 = this;
            float r0 = r1.f1500p
            return r0
    }

    public final boolean i() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final double[] j() {
            r1 = this;
            double[] r0 = r1.a
            return r0
    }

    public final float k() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public final int l() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final float[] m() {
            r1 = this;
            float[] r0 = r1.c
            return r0
    }

    public final float n() {
            r1 = this;
            float r0 = r1.f1501q
            return r0
    }

    public final int o() {
            r1 = this;
            int r0 = r1.f1502r
            return r0
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@org.jetbrains.annotations.NotNull android.hardware.Sensor r1, int r2) {
            r0 = this;
            java.lang.String r2 = "sensor"
            kotlin.jvm.internal.g0.p(r1, r2)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@org.jetbrains.annotations.NotNull android.hardware.SensorEvent r6) {
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            r1 = 0
        L7:
            r2 = 3
            if (r1 >= r2) goto L16
            double[] r2 = r5.a
            float[] r3 = r6.values
            r3 = r3[r1]
            double r3 = (double) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L7
        L16:
            com.bxkj.student.run.app.step.b r6 = r5.f1503s
            if (r6 == 0) goto L22
            kotlin.jvm.internal.g0.m(r6)
            double[] r1 = r5.a
            r6.b(r1)
        L22:
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
            r5.f1498n = r6
            r5.b(r6)
            return
    }

    public final long p() {
            r2 = this;
            long r0 = r2.f1496l
            return r0
    }

    public final long q() {
            r2 = this;
            long r0 = r2.f1497m
            return r0
    }

    public final long r() {
            r2 = this;
            long r0 = r2.k
            return r0
    }

    public final float s() {
            r1 = this;
            float r0 = r1.j
            return r0
    }

    public final int t() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final void u(@org.jetbrains.annotations.Nullable com.bxkj.student.run.app.step.b r1) {
            r0 = this;
            r0.f1503s = r1
            return
    }

    public final boolean v() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public final float w(float r8) {
            r7 = this;
            float r0 = r7.f1501q
            int r1 = r7.d
            int r2 = r7.b
            r3 = 1
            if (r1 >= r2) goto L11
            float[] r2 = r7.c
            r2[r1] = r8
            int r1 = r1 + r3
            r7.d = r1
            return r0
        L11:
            float[] r0 = r7.c
            float r0 = r7.a(r0, r2)
            int r1 = r7.b
            r2 = 1
        L1a:
            if (r2 >= r1) goto L27
            float[] r4 = r7.c
            int r5 = r2 + (-1)
            r6 = r4[r2]
            r4[r5] = r6
            int r2 = r2 + 1
            goto L1a
        L27:
            float[] r1 = r7.c
            int r2 = r7.b
            int r2 = r2 - r3
            r1[r2] = r8
            return r0
    }

    public final void x(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public final void y(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public final void z(boolean r1) {
            r0 = this;
            r0.e = r1
            return
    }
}

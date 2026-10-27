package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Spring {
    private static int o = 0;
    private static final double p = 0.064d;
    private static final double q = 0.001d;
    private com.facebook.rebound.SpringConfig a;
    private boolean b;
    private final java.lang.String c;
    private final com.facebook.rebound.Spring.PhysicsState d;
    private final com.facebook.rebound.Spring.PhysicsState e;
    private final com.facebook.rebound.Spring.PhysicsState f;
    private double g;
    private double h;
    private boolean i;
    private double j;
    private double k;
    private java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> l;
    private double m;
    private final com.facebook.rebound.BaseSpringSystem n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.facebook.rebound.Spring$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PhysicsState {
        double a;
        double b;

        private PhysicsState() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ PhysicsState(com.facebook.rebound.Spring.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    Spring(com.facebook.rebound.BaseSpringSystem r3) {
            r2 = this;
            r2.<init>()
            com.facebook.rebound.Spring$PhysicsState r0 = new com.facebook.rebound.Spring$PhysicsState
            r1 = 0
            r0.<init>(r1)
            r2.d = r0
            com.facebook.rebound.Spring$PhysicsState r0 = new com.facebook.rebound.Spring$PhysicsState
            r0.<init>(r1)
            r2.e = r0
            com.facebook.rebound.Spring$PhysicsState r0 = new com.facebook.rebound.Spring$PhysicsState
            r0.<init>(r1)
            r2.f = r0
            r0 = 1
            r2.i = r0
            r0 = 4572414629676717179(0x3f747ae147ae147b, double:0.005)
            r2.j = r0
            r2.k = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r2.l = r0
            r0 = 0
            r2.m = r0
            if (r3 == 0) goto L53
            r2.n = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "spring:"
            r3.append(r0)
            int r0 = com.facebook.rebound.Spring.o
            int r1 = r0 + 1
            com.facebook.rebound.Spring.o = r1
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.c = r3
            com.facebook.rebound.SpringConfig r3 = com.facebook.rebound.SpringConfig.c
            r2.B(r3)
            return
        L53:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Spring cannot be created outside of a BaseSpringSystem"
            r3.<init>(r0)
            throw r3
    }

    private double g(com.facebook.rebound.Spring.PhysicsState r5) {
            r4 = this;
            double r0 = r4.h
            double r2 = r5.a
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            return r0
    }

    private void o(double r9) {
            r8 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r8.d
            double r1 = r0.a
            double r1 = r1 * r9
            com.facebook.rebound.Spring$PhysicsState r3 = r8.e
            double r4 = r3.a
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r9
            double r4 = r4 * r6
            double r1 = r1 + r4
            r0.a = r1
            double r1 = r0.b
            double r1 = r1 * r9
            double r9 = r3.b
            double r9 = r9 * r6
            double r1 = r1 + r9
            r0.b = r1
            return
    }

    public com.facebook.rebound.Spring A(double r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    public com.facebook.rebound.Spring B(com.facebook.rebound.SpringConfig r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.a = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "springConfig is required"
            r2.<init>(r0)
            throw r2
    }

    public com.facebook.rebound.Spring C(double r5) {
            r4 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r4.d
            double r1 = r0.b
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L9
            return r4
        L9:
            r0.b = r5
            com.facebook.rebound.BaseSpringSystem r5 = r4.n
            java.lang.String r6 = r4.i()
            r5.a(r6)
            return r4
    }

    public boolean D() {
            r1 = this;
            boolean r0 = r1.p()
            if (r0 == 0) goto Lf
            boolean r0 = r1.E()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean E() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public com.facebook.rebound.Spring a(com.facebook.rebound.SpringListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r0 = r1.l
            r0.add(r2)
            return r1
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newListener is required"
            r2.<init>(r0)
            throw r2
    }

    void b(double r31) {
            r30 = this;
            r0 = r30
            boolean r1 = r0.p()
            if (r1 == 0) goto Le
            boolean r2 = r0.i
            if (r2 == 0) goto Le
            goto L126
        Le:
            r2 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r4 = (r31 > r2 ? 1 : (r31 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L1a
        L18:
            r2 = r31
        L1a:
            double r4 = r0.m
            double r4 = r4 + r2
            r0.m = r4
            com.facebook.rebound.SpringConfig r2 = r0.a
            double r3 = r2.b
            double r5 = r2.a
            com.facebook.rebound.Spring$PhysicsState r2 = r0.d
            double r7 = r2.a
            double r9 = r2.b
            com.facebook.rebound.Spring$PhysicsState r2 = r0.f
            double r11 = r2.a
            double r13 = r2.b
            r15 = r1
        L32:
            double r1 = r0.m
            r16 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r18 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r18 < 0) goto Lb2
            double r1 = r1 - r16
            r0.m = r1
            int r13 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r13 >= 0) goto L4b
            com.facebook.rebound.Spring$PhysicsState r1 = r0.e
            r1.a = r7
            r1.b = r9
        L4b:
            double r1 = r0.h
            double r11 = r1 - r11
            double r11 = r11 * r3
            double r13 = r5 * r9
            double r11 = r11 - r13
            double r13 = r9 * r16
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = r13 * r18
            double r13 = r13 + r7
            double r20 = r11 * r16
            double r20 = r20 * r18
            double r20 = r9 + r20
            double r13 = r1 - r13
            double r13 = r13 * r3
            double r22 = r5 * r20
            double r13 = r13 - r22
            double r22 = r20 * r16
            double r22 = r22 * r18
            double r22 = r7 + r22
            double r24 = r13 * r16
            double r24 = r24 * r18
            double r24 = r9 + r24
            double r18 = r1 - r22
            double r18 = r18 * r3
            double r22 = r5 * r24
            double r18 = r18 - r22
            double r22 = r24 * r16
            double r22 = r7 + r22
            double r26 = r18 * r16
            double r26 = r9 + r26
            double r1 = r1 - r22
            double r1 = r1 * r3
            double r28 = r5 * r26
            double r1 = r1 - r28
            double r20 = r20 + r24
            r24 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r20 = r20 * r24
            double r20 = r9 + r20
            double r20 = r20 + r26
            r28 = 4595172819793696085(0x3fc5555555555555, double:0.16666666666666666)
            double r20 = r20 * r28
            double r13 = r13 + r18
            double r13 = r13 * r24
            double r11 = r11 + r13
            double r11 = r11 + r1
            double r11 = r11 * r28
            double r20 = r20 * r16
            double r7 = r7 + r20
            double r11 = r11 * r16
            double r9 = r9 + r11
            r11 = r22
            r13 = r26
            goto L32
        Lb2:
            com.facebook.rebound.Spring$PhysicsState r5 = r0.f
            r5.a = r11
            r5.b = r13
            com.facebook.rebound.Spring$PhysicsState r5 = r0.d
            r5.a = r7
            r5.b = r9
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lc9
            double r1 = r1 / r16
            r0.o(r1)
        Lc9:
            boolean r1 = r0.p()
            r2 = 1
            if (r1 != 0) goto Ldd
            boolean r1 = r0.b
            if (r1 == 0) goto Ldb
            boolean r1 = r0.r()
            if (r1 == 0) goto Ldb
            goto Ldd
        Ldb:
            r1 = r15
            goto Lf6
        Ldd:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lea
            double r3 = r0.h
            r0.g = r3
            com.facebook.rebound.Spring$PhysicsState r1 = r0.d
            r1.a = r3
            goto Lf2
        Lea:
            com.facebook.rebound.Spring$PhysicsState r1 = r0.d
            double r3 = r1.a
            r0.h = r3
            r0.g = r3
        Lf2:
            r0.C(r5)
            r1 = 1
        Lf6:
            boolean r3 = r0.i
            r4 = 0
            if (r3 == 0) goto Lff
            r0.i = r4
            r3 = 1
            goto L100
        Lff:
            r3 = 0
        L100:
            if (r1 == 0) goto L105
            r0.i = r2
            goto L106
        L105:
            r2 = 0
        L106:
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r1 = r0.l
            java.util.Iterator r1 = r1.iterator()
        L10c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L126
            java.lang.Object r4 = r1.next()
            com.facebook.rebound.SpringListener r4 = (com.facebook.rebound.SpringListener) r4
            if (r3 == 0) goto L11d
            r4.onSpringActivate(r0)
        L11d:
            r4.onSpringUpdate(r0)
            if (r2 == 0) goto L10c
            r4.onSpringAtRest(r0)
            goto L10c
        L126:
            return
    }

    public boolean c(double r4) {
            r3 = this;
            double r0 = r3.f()
            double r0 = r0 - r4
            double r4 = java.lang.Math.abs(r0)
            double r0 = r3.j()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L13
            r4 = 1
            return r4
        L13:
            r4 = 0
            return r4
    }

    public void d() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r0 = r1.l
            r0.clear()
            com.facebook.rebound.BaseSpringSystem r0 = r1.n
            r0.e(r1)
            return
    }

    public double e() {
            r2 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r2.d
            double r0 = r2.g(r0)
            return r0
    }

    public double f() {
            r2 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r2.d
            double r0 = r0.a
            return r0
    }

    public double h() {
            r2 = this;
            double r0 = r2.h
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public double j() {
            r2 = this;
            double r0 = r2.k
            return r0
    }

    public double k() {
            r2 = this;
            double r0 = r2.j
            return r0
    }

    public com.facebook.rebound.SpringConfig l() {
            r1 = this;
            com.facebook.rebound.SpringConfig r0 = r1.a
            return r0
    }

    public double m() {
            r2 = this;
            double r0 = r2.g
            return r0
    }

    public double n() {
            r2 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r2.d
            double r0 = r0.b
            return r0
    }

    public boolean p() {
            r5 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r5.d
            double r0 = r0.b
            double r0 = java.lang.Math.abs(r0)
            double r2 = r5.j
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L26
            com.facebook.rebound.Spring$PhysicsState r0 = r5.d
            double r0 = r5.g(r0)
            double r2 = r5.k
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            com.facebook.rebound.SpringConfig r0 = r5.a
            double r0 = r0.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
        L24:
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    public boolean q() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public boolean r() {
            r5 = this;
            com.facebook.rebound.SpringConfig r0 = r5.a
            double r0 = r0.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L30
            double r0 = r5.g
            double r2 = r5.h
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            double r0 = r5.f()
            double r2 = r5.h
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L2e
        L1c:
            double r0 = r5.g
            double r2 = r5.h
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L30
            double r0 = r5.f()
            double r2 = r5.h
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L30
        L2e:
            r0 = 1
            return r0
        L30:
            r0 = 0
            return r0
    }

    public com.facebook.rebound.Spring s() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r0 = r1.l
            r0.clear()
            return r1
    }

    public com.facebook.rebound.Spring t(com.facebook.rebound.SpringListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r0 = r1.l
            r0.remove(r2)
            return r1
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listenerToRemove is required"
            r2.<init>(r0)
            throw r2
    }

    public com.facebook.rebound.Spring u() {
            r4 = this;
            com.facebook.rebound.Spring$PhysicsState r0 = r4.d
            double r1 = r0.a
            r4.h = r1
            com.facebook.rebound.Spring$PhysicsState r3 = r4.f
            r3.a = r1
            r1 = 0
            r0.b = r1
            return r4
    }

    public com.facebook.rebound.Spring v(double r2) {
            r1 = this;
            r0 = 1
            com.facebook.rebound.Spring r2 = r1.w(r2, r0)
            return r2
    }

    public com.facebook.rebound.Spring w(double r2, boolean r4) {
            r1 = this;
            r1.g = r2
            com.facebook.rebound.Spring$PhysicsState r0 = r1.d
            r0.a = r2
            com.facebook.rebound.BaseSpringSystem r2 = r1.n
            java.lang.String r3 = r1.i()
            r2.a(r3)
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r2 = r1.l
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            com.facebook.rebound.SpringListener r3 = (com.facebook.rebound.SpringListener) r3
            r3.onSpringUpdate(r1)
            goto L15
        L25:
            if (r4 == 0) goto L2a
            r1.u()
        L2a:
            return r1
    }

    public com.facebook.rebound.Spring x(double r4) {
            r3 = this;
            double r0 = r3.h
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto Ld
            boolean r0 = r3.p()
            if (r0 == 0) goto Ld
            goto L34
        Ld:
            double r0 = r3.f()
            r3.g = r0
            r3.h = r4
            com.facebook.rebound.BaseSpringSystem r4 = r3.n
            java.lang.String r5 = r3.i()
            r4.a(r5)
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringListener> r4 = r3.l
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()
            com.facebook.rebound.SpringListener r5 = (com.facebook.rebound.SpringListener) r5
            r5.onSpringEndStateChange(r3)
            goto L24
        L34:
            return r3
    }

    public com.facebook.rebound.Spring y(boolean r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.facebook.rebound.Spring z(double r1) {
            r0 = this;
            r0.k = r1
            return r0
    }
}

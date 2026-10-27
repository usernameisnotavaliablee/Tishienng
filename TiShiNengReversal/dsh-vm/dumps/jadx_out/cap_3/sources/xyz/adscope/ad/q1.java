package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q1 extends xyz.adscope.ad.p6 {
    private final java.util.Map<java.lang.String, xyz.adscope.ad.p6.c> l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private final double a;
        private final java.lang.String b;
        private double c;

        private b(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                double r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseDouble(r3)
                r2.a = r0
                r2.b = r4
                return
        }

        /* synthetic */ b(java.lang.String r1, java.lang.String r2, xyz.adscope.ad.q1.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ double a(xyz.adscope.ad.q1.b r2) {
                double r0 = r2.a
                return r0
        }

        private void a(java.lang.String r5) {
                r4 = this;
                double r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseDouble(r5)
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Lb
                goto Ld
            Lb:
                double r0 = r4.a
            Ld:
                r4.c = r0
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q1.b r0, java.lang.String r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ double b(xyz.adscope.ad.q1.b r2) {
                double r0 = r2.c
                return r0
        }

        static /* synthetic */ java.lang.String c(xyz.adscope.ad.q1.b r0) {
                java.lang.String r0 = r0.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.p6.c {
        private final int a;
        private final xyz.adscope.ad.q1.b b;
        private final xyz.adscope.ad.q1.b c;
        private final xyz.adscope.ad.q1.b d;
        private final java.lang.String e;
        private boolean f;
        private long g;
        private int h;
        private boolean i;
        private boolean j;
        private long k;
        private double l;
        private double m;
        private double n;
        private float o;
        private float p;
        private float q;
        final /* synthetic */ xyz.adscope.ad.q1 r;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends xyz.adscope.ad.k6 {
            final /* synthetic */ xyz.adscope.ad.q1.c b;

            a(xyz.adscope.ad.q1.c r1, int r2, int r3, long r4) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>(r2, r3, r4)
                    return
            }

            @Override // xyz.adscope.ad.k6
            protected void a(android.animation.ValueAnimator r6) {
                    r5 = this;
                    xyz.adscope.ad.q1$c r0 = r5.b
                    int r0 = xyz.adscope.ad.q1.c.a(r0)
                    r1 = 1
                    if (r0 != r1) goto L1c
                    xyz.adscope.ad.q1$c r0 = r5.b
                    java.lang.Object r6 = r6.getAnimatedValue()
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r6 = r6.intValue()
                    double r1 = (double) r6
                    r3 = 4621819117588971520(0x4024000000000000, double:10.0)
                    double r1 = r1 / r3
                    xyz.adscope.ad.q1.c.a(r0, r1)
                L1c:
                    return
            }

            @Override // xyz.adscope.ad.k6
            protected void b(android.animation.Animator r1) {
                    r0 = this;
                    xyz.adscope.ad.q1$c r1 = r0.b
                    xyz.adscope.ad.q1.c.c(r1)
                    return
            }

            @Override // xyz.adscope.ad.k6
            protected void d(android.animation.Animator r3) {
                    r2 = this;
                    xyz.adscope.ad.q1$c r3 = r2.b
                    r0 = 0
                    xyz.adscope.ad.q1.c.a(r3, r0)
                    xyz.adscope.ad.q1$c r3 = r2.b
                    java.lang.String r0 = xyz.adscope.ad.q1.c.b(r3)
                    xyz.adscope.ad.q1.c.a(r3, r0)
                    return
            }
        }

        private c(xyz.adscope.ad.q1 r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
                r2 = this;
                r2.r = r3
                r2.<init>()
                r3 = 1
                r2.a = r3
                r3 = 0
                r2.f = r3
                r2.i = r3
                r2.j = r3
                r0 = 0
                r2.k = r0
                r3 = 0
                r2.o = r3
                r2.p = r3
                r2.q = r3
                xyz.adscope.ad.q1$b r3 = new xyz.adscope.ad.q1$b
                r0 = 0
                r3.<init>(r4, r5, r0)
                r2.b = r3
                xyz.adscope.ad.q1$b r3 = new xyz.adscope.ad.q1$b
                r3.<init>(r6, r7, r0)
                r2.c = r3
                xyz.adscope.ad.q1$b r3 = new xyz.adscope.ad.q1$b
                r3.<init>(r8, r9, r0)
                r2.d = r3
                r2.e = r10
                return
        }

        /* synthetic */ c(xyz.adscope.ad.q1 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, xyz.adscope.ad.q1.a r9) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        private double a(double r5, float r7, java.lang.String r8, boolean r9) {
                r4 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto L40
                java.lang.String r2 = "2"
                boolean r2 = r2.equals(r8)
                r3 = 0
                if (r2 == 0) goto L1a
                if (r9 == 0) goto L16
                int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r2 >= 0) goto L1a
                goto L35
            L16:
                int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r2 > 0) goto L35
            L1a:
                java.lang.String r2 = "1"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L2d
                if (r9 == 0) goto L29
                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r9 <= 0) goto L2d
                goto L35
            L29:
                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r9 < 0) goto L35
            L2d:
                java.lang.String r9 = "0"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L40
            L35:
                float r7 = java.lang.Math.abs(r7)
                r8 = 1120403456(0x42c80000, float:100.0)
                float r7 = r7 * r8
                double r7 = (double) r7
                double r7 = r7 / r5
                return r7
            L40:
                return r0
        }

        static /* synthetic */ int a(xyz.adscope.ad.q1.c r0) {
                int r0 = r0.h
                return r0
        }

        private void a() {
                r2 = this;
                xyz.adscope.ad.q1$b r0 = r2.b
                double r0 = xyz.adscope.ad.q1.b.a(r0)
                r2.l = r0
                xyz.adscope.ad.q1$b r0 = r2.c
                double r0 = xyz.adscope.ad.q1.b.a(r0)
                r2.m = r0
                xyz.adscope.ad.q1$b r0 = r2.d
                double r0 = xyz.adscope.ad.q1.b.a(r0)
                r2.n = r0
                r0 = 0
                r2.o = r0
                r2.p = r0
                r2.q = r0
                java.lang.String r0 = "Normal"
                r2.a(r0)
                return
        }

        private void a(double r7) {
                r6 = this;
                xyz.adscope.ad.q1$b r0 = r6.b
                double r0 = xyz.adscope.ad.q1.b.a(r0)
                xyz.adscope.ad.q1$b r2 = r6.b
                double r2 = xyz.adscope.ad.q1.b.b(r2)
                xyz.adscope.ad.q1$b r4 = r6.b
                double r4 = xyz.adscope.ad.q1.b.a(r4)
                double r2 = r2 - r4
                double r2 = r2 * r7
                double r0 = r0 + r2
                r6.l = r0
                xyz.adscope.ad.q1$b r0 = r6.c
                double r0 = xyz.adscope.ad.q1.b.a(r0)
                xyz.adscope.ad.q1$b r2 = r6.c
                double r2 = xyz.adscope.ad.q1.b.b(r2)
                xyz.adscope.ad.q1$b r4 = r6.c
                double r4 = xyz.adscope.ad.q1.b.a(r4)
                double r2 = r2 - r4
                double r2 = r2 * r7
                double r0 = r0 + r2
                r6.m = r0
                xyz.adscope.ad.q1$b r0 = r6.d
                double r0 = xyz.adscope.ad.q1.b.a(r0)
                xyz.adscope.ad.q1$b r2 = r6.d
                double r2 = xyz.adscope.ad.q1.b.b(r2)
                xyz.adscope.ad.q1$b r4 = r6.d
                double r4 = xyz.adscope.ad.q1.b.a(r4)
                double r2 = r2 - r4
                double r2 = r2 * r7
                double r0 = r0 + r2
                r6.n = r0
                return
        }

        private void a(float r11, float r12, float r13) {
                r10 = this;
                xyz.adscope.ad.q1 r0 = r10.r
                android.view.View r0 = xyz.adscope.ad.q1.f(r0)
                if (r0 == 0) goto L5b
                xyz.adscope.ad.q1 r0 = r10.r
                android.view.View r0 = xyz.adscope.ad.q1.g(r0)
                boolean r0 = r0 instanceof xyz.adscope.ad.w5
                if (r0 == 0) goto L5b
                double r2 = r10.l
                xyz.adscope.ad.q1$b r0 = r10.b
                java.lang.String r5 = xyz.adscope.ad.q1.b.c(r0)
                r6 = 0
                r1 = r10
                r4 = r11
                double r2 = r1.a(r2, r4, r5, r6)
                r4 = r1
                double r5 = r4.m
                xyz.adscope.ad.q1$b r11 = r4.c
                java.lang.String r8 = xyz.adscope.ad.q1.b.c(r11)
                r9 = 1
                r7 = r12
                double r11 = r4.a(r5, r7, r8, r9)
                double r5 = r4.n
                xyz.adscope.ad.q1$b r0 = r4.d
                java.lang.String r8 = xyz.adscope.ad.q1.b.c(r0)
                r9 = 0
                r7 = r13
                double r0 = r4.a(r5, r7, r8, r9)
                r13 = 3
                double[] r13 = new double[r13]
                r5 = 0
                r13[r5] = r2
                r2 = 1
                r13[r2] = r11
                r11 = 2
                r13[r11] = r0
                java.util.Arrays.sort(r13)
                r11 = r13[r11]
                xyz.adscope.ad.q1 r13 = r4.r
                android.view.View r13 = xyz.adscope.ad.q1.h(r13)
                xyz.adscope.ad.w5 r13 = (xyz.adscope.ad.w5) r13
                r13.setCurrentProgress(r11)
                return
            L5b:
                r4 = r10
                return
        }

        private void a(long r1, int r3) {
                r0 = this;
                r0.g = r1
                r0.h = r3
                r1 = 1
                r0.i = r1
                return
        }

        private void a(java.lang.String r2) {
                r1 = this;
                xyz.adscope.ad.q1 r0 = r1.r
                android.view.View r0 = xyz.adscope.ad.q1.i(r0)
                if (r0 == 0) goto L1d
                xyz.adscope.ad.q1 r0 = r1.r
                android.view.View r0 = xyz.adscope.ad.q1.a(r0)
                boolean r0 = r0 instanceof xyz.adscope.ad.c4
                if (r0 == 0) goto L1d
                xyz.adscope.ad.q1 r0 = r1.r
                android.view.View r0 = xyz.adscope.ad.q1.b(r0)
                xyz.adscope.ad.c4 r0 = (xyz.adscope.ad.c4) r0
                r0.a(r2)
            L1d:
                return
        }

        private void a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "X"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Ld
                xyz.adscope.ad.q1$b r0 = r1.b
                xyz.adscope.ad.q1.b.a(r0, r3)
            Ld:
                java.lang.String r0 = "Y"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1a
                xyz.adscope.ad.q1$b r0 = r1.c
                xyz.adscope.ad.q1.b.a(r0, r3)
            L1a:
                java.lang.String r0 = "Z"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L27
                xyz.adscope.ad.q1$b r2 = r1.d
                xyz.adscope.ad.q1.b.a(r2, r3)
            L27:
                return
        }

        private void a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                xyz.adscope.ad.q1 r0 = r1.r
                android.view.View r0 = xyz.adscope.ad.q1.c(r0)
                if (r0 == 0) goto L1d
                xyz.adscope.ad.q1 r0 = r1.r
                android.view.View r0 = xyz.adscope.ad.q1.d(r0)
                boolean r0 = r0 instanceof xyz.adscope.ad.w5
                if (r0 == 0) goto L1d
                xyz.adscope.ad.q1 r0 = r1.r
                android.view.View r0 = xyz.adscope.ad.q1.e(r0)
                xyz.adscope.ad.w5 r0 = (xyz.adscope.ad.w5) r0
                r0.b(r2, r3, r4)
            L1d:
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q1.c r0, double r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q1.c r0, long r1, int r3) {
                r0.a(r1, r3)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q1.c r0, java.lang.String r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q1.c r0, java.lang.String r1, java.lang.String r2) {
                r0.a(r1, r2)
                return
        }

        private boolean a(double r5, float r7, java.lang.String r8) {
                r4 = this;
                r0 = 0
                r2 = 0
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 <= 0) goto L49
                java.lang.String r0 = "2"
                boolean r0 = r0.equals(r8)
                r1 = 0
                r3 = 1
                if (r0 == 0) goto L20
                int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r8 <= 0) goto L1f
                float r7 = java.lang.Math.abs(r7)
                double r7 = (double) r7
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 < 0) goto L1f
                return r3
            L1f:
                return r2
            L20:
                java.lang.String r0 = "1"
                boolean r0 = r0.equals(r8)
                if (r0 == 0) goto L37
                int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r8 >= 0) goto L36
                float r7 = java.lang.Math.abs(r7)
                double r7 = (double) r7
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 < 0) goto L36
                return r3
            L36:
                return r2
            L37:
                java.lang.String r0 = "0"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L49
                float r7 = java.lang.Math.abs(r7)
                double r7 = (double) r7
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 < 0) goto L49
                return r3
            L49:
                return r2
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.ad.q1.c r0) {
                java.lang.String r0 = r0.e
                return r0
        }

        private void b() {
                r7 = this;
                boolean r0 = r7.f
                if (r0 != 0) goto L1f
                r0 = 1
                r7.f = r0
                long r5 = r7.g
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1c
                xyz.adscope.ad.q1$c$a r1 = new xyz.adscope.ad.q1$c$a
                r3 = 10
                r4 = 1
                r2 = r7
                r1.<init>(r2, r3, r4, r5)
                r1.c()
                return
            L1c:
                r7.a()
            L1f:
                return
        }

        private void b(android.hardware.SensorEvent r9) {
                r8 = this;
                if (r9 == 0) goto L94
                android.hardware.Sensor r0 = r9.sensor
                if (r0 == 0) goto L94
                int r0 = r0.getType()
                r1 = 4
                if (r0 != r1) goto L94
                float[] r0 = r9.values
                if (r0 == 0) goto L94
                long r1 = r8.k
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L90
                r3 = 0
                r4 = r0[r3]
                r5 = 1
                r5 = r0[r5]
                r6 = 2
                r0 = r0[r6]
                long r6 = r9.timestamp
                long r6 = r6 - r1
                float r1 = (float) r6
                r2 = 814313567(0x3089705f, float:1.0E-9)
                float r1 = r1 * r2
                float r2 = r8.o
                float r4 = r4 * r1
                double r6 = (double) r4
                double r6 = java.lang.Math.toDegrees(r6)
                float r4 = (float) r6
                float r2 = r2 + r4
                r8.o = r2
                float r2 = r8.p
                float r5 = r5 * r1
                double r4 = (double) r5
                double r4 = java.lang.Math.toDegrees(r4)
                float r4 = (float) r4
                float r2 = r2 + r4
                r8.p = r2
                float r2 = r8.q
                float r0 = r0 * r1
                double r0 = (double) r0
                double r0 = java.lang.Math.toDegrees(r0)
                float r0 = (float) r0
                float r2 = r2 + r0
                r8.q = r2
                float r0 = r8.o
                float r1 = r8.p
                r8.a(r0, r1, r2)
                double r0 = r8.l
                float r2 = r8.o
                xyz.adscope.ad.q1$b r4 = r8.b
                java.lang.String r4 = xyz.adscope.ad.q1.b.c(r4)
                boolean r0 = r8.a(r0, r2, r4)
                if (r0 != 0) goto L89
                double r0 = r8.m
                float r2 = r8.p
                xyz.adscope.ad.q1$b r4 = r8.c
                java.lang.String r4 = xyz.adscope.ad.q1.b.c(r4)
                boolean r0 = r8.a(r0, r2, r4)
                if (r0 != 0) goto L89
                double r0 = r8.n
                float r2 = r8.q
                xyz.adscope.ad.q1$b r4 = r8.d
                java.lang.String r4 = xyz.adscope.ad.q1.b.c(r4)
                boolean r0 = r8.a(r0, r2, r4)
                if (r0 == 0) goto L90
            L89:
                r8.j = r3
                xyz.adscope.ad.q1 r0 = r8.r
                r0.h()
            L90:
                long r0 = r9.timestamp
                r8.k = r0
            L94:
                return
        }

        static /* synthetic */ void c(xyz.adscope.ad.q1.c r0) {
                r0.a()
                return
        }

        @Override // xyz.adscope.ad.p6.c
        public void a(android.hardware.SensorEvent r4) {
                r3 = this;
                boolean r0 = r3.i
                if (r0 == 0) goto L8
                r3.b()
                goto Lb
            L8:
                r3.a()
            Lb:
                boolean r0 = r3.j
                if (r0 != 0) goto L27
                r0 = 1
                r3.j = r0
                xyz.adscope.ad.q1$b r0 = r3.b
                java.lang.String r0 = xyz.adscope.ad.q1.b.c(r0)
                xyz.adscope.ad.q1$b r1 = r3.c
                java.lang.String r1 = xyz.adscope.ad.q1.b.c(r1)
                xyz.adscope.ad.q1$b r2 = r3.d
                java.lang.String r2 = xyz.adscope.ad.q1.b.c(r2)
                r3.a(r0, r1, r2)
            L27:
                r3.b(r4)
                return
        }
    }

    public q1(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.l = r1
            return
    }

    static /* synthetic */ android.view.View a(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    private java.lang.String a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L33
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r2.a()
            if (r0 == 0) goto L33
            java.lang.String r0 = "Cooling"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L19
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.a()
            java.lang.String r2 = r2.a()
            return r2
        L19:
            java.lang.String r0 = "Normal"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L2a
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.a()
            java.lang.String r2 = r2.b()
            return r2
        L2a:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.a()
            java.lang.String r2 = r2.c()
            return r2
        L33:
            java.lang.String r2 = ""
            return r2
    }

    private xyz.adscope.ad.q1.c a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel r11, java.lang.String r12) {
            r10 = this;
            if (r11 == 0) goto L69
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r0 = r11.a()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r2 = r11.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r3 = r11.c()
            java.lang.String r4 = "Cooling"
            boolean r4 = r4.equalsIgnoreCase(r12)
            if (r4 == 0) goto L3e
            xyz.adscope.ad.q1$c r4 = new xyz.adscope.ad.q1$c
            java.lang.String r5 = r10.a(r0, r12)
            java.lang.String r0 = r10.b(r0, r12)
            r6 = r0
            r0 = r4
            java.lang.String r4 = r10.a(r2, r12)
            r7 = r5
            java.lang.String r5 = r10.b(r2, r12)
            r2 = r6
            java.lang.String r6 = r10.a(r3, r12)
            r9 = r2
            r2 = r7
            java.lang.String r7 = r10.b(r3, r12)
            r3 = r9
            r9 = 0
            r1 = r10
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L3e:
            xyz.adscope.ad.q1$c r4 = new xyz.adscope.ad.q1$c
            java.lang.String r5 = "Normal"
            java.lang.String r6 = r10.a(r0, r5)
            java.lang.String r0 = r10.b(r0, r5)
            r7 = r0
            r0 = r4
            java.lang.String r4 = r10.a(r2, r5)
            java.lang.String r2 = r10.b(r2, r5)
            r8 = r2
            r2 = r6
            java.lang.String r6 = r10.a(r3, r5)
            java.lang.String r3 = r10.b(r3, r5)
            r9 = 0
            r1 = r7
            r7 = r3
            r3 = r1
            r1 = r10
            r5 = r8
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L69:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.view.View b(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    private java.lang.String b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L22
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r2.b()
            if (r0 == 0) goto L22
            java.lang.String r0 = "Cooling"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L19
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.b()
            java.lang.String r2 = r2.a()
            return r2
        L19:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.b()
            java.lang.String r2 = r2.b()
            return r2
        L22:
            java.lang.String r2 = ""
            return r2
    }

    static /* synthetic */ android.view.View c(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View d(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View e(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View f(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View g(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View h(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View i(xyz.adscope.ad.q1 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    private void k() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r3.g
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel r0 = r0.d()
            java.lang.String r1 = "Cooling"
            xyz.adscope.ad.q1$c r0 = r3.a(r0, r1)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r2 = r3.l
            r2.put(r1, r0)
        L15:
            return
    }

    private void l() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r3.g
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel r0 = r0.d()
            java.lang.String r1 = "Normal"
            xyz.adscope.ad.q1$c r0 = r3.a(r0, r1)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r2 = r3.l
            r2.put(r1, r0)
        L15:
            return
    }

    private void m() {
            r6 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r6.g
            if (r0 == 0) goto L51
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel r0 = r0.d()
            java.lang.String r1 = "Passive"
            xyz.adscope.ad.q1$c r0 = r6.a(r0, r1)
            if (r0 == 0) goto L51
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r2 = r6.g
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.EulerAngleModel r2 = r2.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r3 = r2.a()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r4 = r2.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.axis.AxisModel r2 = r2.c()
            java.lang.String r3 = r6.a(r3, r1)
            java.lang.String r5 = "X"
            xyz.adscope.ad.q1.c.a(r0, r5, r3)
            java.lang.String r3 = r6.a(r4, r1)
            java.lang.String r4 = "Y"
            xyz.adscope.ad.q1.c.a(r0, r4, r3)
            java.lang.String r2 = r6.a(r2, r1)
            java.lang.String r3 = "Z"
            xyz.adscope.ad.q1.c.a(r0, r3, r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r2 = r6.g
            long r2 = r2.g()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r4 = r6.g
            int r4 = r4.h()
            xyz.adscope.ad.q1.c.a(r0, r2, r4)
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r2 = r6.l
            r2.put(r1, r0)
        L51:
            return
    }

    @Override // xyz.adscope.ad.g1
    protected void d() {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r0 = r1.l
            r0.clear()
            r1.l()
            r1.m()
            r1.k()
            return
    }

    @Override // xyz.adscope.ad.p6
    protected xyz.adscope.ad.n3.a e() {
            r1 = this;
            xyz.adscope.ad.n3$a r0 = xyz.adscope.ad.n3.a.f
            return r0
    }

    @Override // xyz.adscope.ad.p6
    protected android.hardware.Sensor f() {
            r2 = this;
            android.hardware.SensorManager r0 = r2.i
            if (r0 == 0) goto La
            r1 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.p6
    protected xyz.adscope.ad.p6.c g() {
            r5 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r5.g
            if (r0 == 0) goto L58
            xyz.adscope.ad.e7 r0 = xyz.adscope.ad.e7.a()
            android.content.Context r1 = r5.c
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.x6 r0 = (xyz.adscope.ad.x6) r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1 = r5.g
            long r1 = r1.i()
            boolean r1 = r0.a(r1)
            if (r1 != 0) goto L4d
            xyz.adscope.ad.c r1 = r5.h
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r2 = r5.g
            long r2 = r2.b()
            boolean r0 = r0.a(r1, r2)
            if (r0 == 0) goto L2b
            goto L4d
        L2b:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r5.g
            long r0 = r0.g()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L42
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r0 = r5.l
            java.lang.String r1 = "Passive"
            java.lang.Object r0 = r0.get(r1)
            xyz.adscope.ad.p6$c r0 = (xyz.adscope.ad.p6.c) r0
            return r0
        L42:
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r0 = r5.l
            java.lang.String r1 = "Normal"
            java.lang.Object r0 = r0.get(r1)
            xyz.adscope.ad.p6$c r0 = (xyz.adscope.ad.p6.c) r0
            return r0
        L4d:
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r0 = r5.l
            java.lang.String r1 = "Cooling"
            java.lang.Object r0 = r0.get(r1)
            xyz.adscope.ad.p6$c r0 = (xyz.adscope.ad.p6.c) r0
            return r0
        L58:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.p6
    protected void h() {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r0 = r1.l
            r0.clear()
            super.h()
            return
    }
}

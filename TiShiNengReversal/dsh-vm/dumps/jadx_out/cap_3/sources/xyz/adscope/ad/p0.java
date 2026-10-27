package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p0 extends xyz.adscope.ad.p6 {
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
    private class b implements xyz.adscope.ad.p6.c {
        private final int a;
        private final int b;
        private final java.lang.String c;
        private final double d;
        private final double e;
        private final java.lang.String f;
        private double g;
        private double h;
        private int i;
        private double j;
        private double k;
        private int l;
        private boolean m;
        private boolean n;
        private long o;
        private int p;
        private int q;
        private double r;
        private xyz.adscope.ad.p0.c s;
        final /* synthetic */ xyz.adscope.ad.p0 t;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends xyz.adscope.ad.k6 {
            final /* synthetic */ xyz.adscope.ad.p0.b b;

            a(xyz.adscope.ad.p0.b r1, int r2, int r3, long r4) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>(r2, r3, r4)
                    return
            }

            @Override // xyz.adscope.ad.k6
            protected void a(android.animation.ValueAnimator r6) {
                    r5 = this;
                    xyz.adscope.ad.p0$b r0 = r5.b
                    int r0 = xyz.adscope.ad.p0.b.a(r0)
                    r1 = 1
                    if (r0 != r1) goto L1c
                    xyz.adscope.ad.p0$b r0 = r5.b
                    java.lang.Object r6 = r6.getAnimatedValue()
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r6 = r6.intValue()
                    double r1 = (double) r6
                    r3 = 4621819117588971520(0x4024000000000000, double:10.0)
                    double r1 = r1 / r3
                    xyz.adscope.ad.p0.b.a(r0, r1)
                L1c:
                    return
            }

            @Override // xyz.adscope.ad.k6
            protected void b(android.animation.Animator r2) {
                    r1 = this;
                    xyz.adscope.ad.p0$b r2 = r1.b
                    r0 = 0
                    xyz.adscope.ad.p0.b.a(r2, r0)
                    xyz.adscope.ad.p0$b r2 = r1.b
                    xyz.adscope.ad.p0.b.c(r2)
                    return
            }

            @Override // xyz.adscope.ad.k6
            protected void d(android.animation.Animator r3) {
                    r2 = this;
                    xyz.adscope.ad.p0$b r3 = r2.b
                    r0 = 0
                    xyz.adscope.ad.p0.b.a(r3, r0)
                    xyz.adscope.ad.p0$b r3 = r2.b
                    r0 = 0
                    xyz.adscope.ad.p0.b.a(r3, r0)
                    xyz.adscope.ad.p0$b r3 = r2.b
                    java.lang.String r0 = xyz.adscope.ad.p0.b.b(r3)
                    xyz.adscope.ad.p0.b.a(r3, r0)
                    return
            }
        }

        private b(xyz.adscope.ad.p0 r3, double r4, double r6, int r8, java.lang.String r9, java.lang.String r10) {
                r2 = this;
                r2.t = r3
                r2.<init>()
                r3 = 1
                r2.a = r3
                r3 = 0
                r2.m = r3
                r2.n = r3
                r2.q = r3
                r0 = 0
                r2.r = r0
                xyz.adscope.ad.p0$c r3 = xyz.adscope.ad.p0.c.b
                r2.s = r3
                r2.f = r10
                r2.e = r4
                r2.d = r6
                r2.b = r8
                r2.c = r9
                r2.l = r8
                r2.j = r4
                r2.k = r6
                return
        }

        /* synthetic */ b(xyz.adscope.ad.p0 r1, double r2, double r4, int r6, java.lang.String r7, java.lang.String r8, xyz.adscope.ad.p0.a r9) {
                r0 = this;
                r0.<init>(r1, r2, r4, r6, r7, r8)
                return
        }

        private double a(float r9, float r10, float r11, java.lang.String r12) {
                r8 = this;
                java.lang.String r12 = r12.toUpperCase()
                java.lang.String r0 = "X"
                boolean r0 = r12.contains(r0)
                r1 = 4611686018427387904(0x4000000000000000, double:2.0)
                r3 = 1092413450(0x411ce80a, float:9.80665)
                r4 = 0
                if (r0 == 0) goto L1a
                float r9 = r9 / r3
                double r6 = (double) r9
                double r6 = java.lang.Math.pow(r6, r1)
                double r4 = r4 + r6
            L1a:
                java.lang.String r9 = "Y"
                boolean r9 = r12.contains(r9)
                if (r9 == 0) goto L29
                float r10 = r10 / r3
                double r9 = (double) r10
                double r9 = java.lang.Math.pow(r9, r1)
                double r4 = r4 + r9
            L29:
                java.lang.String r9 = "Z"
                boolean r9 = r12.contains(r9)
                if (r9 == 0) goto L38
                float r11 = r11 / r3
                double r9 = (double) r11
                double r9 = java.lang.Math.pow(r9, r1)
                double r4 = r4 + r9
            L38:
                double r9 = java.lang.Math.sqrt(r4)
                return r9
        }

        static /* synthetic */ int a(xyz.adscope.ad.p0.b r0) {
                int r0 = r0.p
                return r0
        }

        static /* synthetic */ int a(xyz.adscope.ad.p0.b r0, int r1) {
                r0.q = r1
                return r1
        }

        private void a() {
                r2 = this;
                double r0 = r2.e
                r2.j = r0
                double r0 = r2.d
                r2.k = r0
                int r0 = r2.b
                r2.l = r0
                java.lang.String r0 = "Normal"
                r2.a(r0)
                return
        }

        private void a(double r5) {
                r4 = this;
                double r0 = r4.e
                double r2 = r4.g
                double r2 = r2 - r0
                double r2 = r2 * r5
                double r0 = r0 + r2
                r4.j = r0
                double r0 = r4.d
                double r2 = r4.h
                double r2 = r2 - r0
                double r2 = r2 * r5
                double r0 = r0 + r2
                r4.k = r0
                int r5 = r4.i
                r4.l = r5
                return
        }

        private void a(double r3, double r5, int r7) {
                r2 = this;
                r2.g = r3
                r2.h = r5
                r2.i = r7
                if (r7 <= 0) goto L9
                goto Lb
            L9:
                int r7 = r2.b
            Lb:
                r2.l = r7
                r0 = 0
                int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r7 <= 0) goto L14
                goto L16
            L14:
                double r3 = r2.e
            L16:
                r2.j = r3
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 <= 0) goto L1d
                goto L1f
            L1d:
                double r5 = r2.d
            L1f:
                r2.k = r5
                r3 = 1
                r2.m = r3
                return
        }

        private void a(long r1, int r3) {
                r0 = this;
                r0.o = r1
                r0.p = r3
                return
        }

        private void a(java.lang.String r2) {
                r1 = this;
                xyz.adscope.ad.p0 r0 = r1.t
                android.view.View r0 = xyz.adscope.ad.p0.g(r0)
                if (r0 == 0) goto L1d
                xyz.adscope.ad.p0 r0 = r1.t
                android.view.View r0 = xyz.adscope.ad.p0.a(r0)
                boolean r0 = r0 instanceof xyz.adscope.ad.c4
                if (r0 == 0) goto L1d
                xyz.adscope.ad.p0 r0 = r1.t
                android.view.View r0 = xyz.adscope.ad.p0.b(r0)
                xyz.adscope.ad.c4 r0 = (xyz.adscope.ad.c4) r0
                r0.a(r2)
            L1d:
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.p0.b r0, double r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.p0.b r0, double r1, double r3, int r5) {
                r0.a(r1, r3, r5)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.p0.b r0, long r1, int r3) {
                r0.a(r1, r3)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.p0.b r0, java.lang.String r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.ad.p0.b r0) {
                java.lang.String r0 = r0.f
                return r0
        }

        private void b() {
                r7 = this;
                boolean r0 = r7.n
                if (r0 != 0) goto L1f
                r0 = 1
                r7.n = r0
                long r5 = r7.o
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1c
                xyz.adscope.ad.p0$b$a r1 = new xyz.adscope.ad.p0$b$a
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

        private void b(android.hardware.SensorEvent r12) {
                r11 = this;
                if (r12 == 0) goto L73
                android.hardware.Sensor r0 = r12.sensor
                if (r0 == 0) goto L73
                int r0 = r0.getType()
                r1 = 1
                if (r0 != r1) goto L73
                float[] r12 = r12.values
                if (r12 == 0) goto L73
                r0 = 0
                r0 = r12[r0]
                r2 = r12[r1]
                r3 = 2
                r12 = r12[r3]
                java.lang.String r3 = "XYZ"
                double r3 = r11.a(r0, r2, r12, r3)
                java.lang.String r5 = r11.c
                double r5 = r11.a(r0, r2, r12, r5)
                r7 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r12 < 0) goto L38
                double r2 = r11.r
                r7 = 0
                int r12 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r12 != 0) goto L3e
            L38:
                double r2 = java.lang.Math.min(r5, r9)
                r11.r = r2
            L3e:
                double r2 = r11.r
                double r5 = r5 - r2
                double r2 = r11.j
                double r2 = r2 - r9
                double r7 = r11.k
                double r7 = r7 - r9
                int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r12 < 0) goto L50
                xyz.adscope.ad.p0$c r12 = xyz.adscope.ad.p0.c.a
                r11.s = r12
                return
            L50:
                int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r12 > 0) goto L73
                xyz.adscope.ad.p0$c r12 = r11.s
                xyz.adscope.ad.p0$c r0 = xyz.adscope.ad.p0.c.a
                if (r12 != r0) goto L73
                int r12 = r11.q
                int r12 = r12 + r1
                r11.q = r12
                r11.c()
                xyz.adscope.ad.p0$c r12 = xyz.adscope.ad.p0.c.b
                r11.s = r12
                int r12 = r11.l
                if (r12 <= 0) goto L73
                int r0 = r11.q
                if (r0 < r12) goto L73
                xyz.adscope.ad.p0 r12 = r11.t
                r12.h()
            L73:
                return
        }

        private void c() {
                r2 = this;
                xyz.adscope.ad.p0 r0 = r2.t
                android.view.View r0 = xyz.adscope.ad.p0.c(r0)
                if (r0 == 0) goto L2c
                xyz.adscope.ad.p0 r0 = r2.t
                android.view.View r0 = xyz.adscope.ad.p0.d(r0)
                boolean r0 = r0 instanceof xyz.adscope.ad.f6
                if (r0 == 0) goto L2c
                xyz.adscope.ad.p0 r0 = r2.t
                android.view.View r0 = xyz.adscope.ad.p0.e(r0)
                xyz.adscope.ad.f6 r0 = (xyz.adscope.ad.f6) r0
                int r1 = r2.l
                r0.setMaxProgress(r1)
                xyz.adscope.ad.p0 r0 = r2.t
                android.view.View r0 = xyz.adscope.ad.p0.f(r0)
                xyz.adscope.ad.f6 r0 = (xyz.adscope.ad.f6) r0
                int r1 = r2.q
                r0.setProgress(r1)
            L2c:
                return
        }

        static /* synthetic */ void c(xyz.adscope.ad.p0.b r0) {
                r0.a()
                return
        }

        @Override // xyz.adscope.ad.p6.c
        public void a(android.hardware.SensorEvent r2) {
                r1 = this;
                boolean r0 = r1.m
                if (r0 == 0) goto L8
                r1.b()
                goto Lb
            L8:
                r1.a()
            Lb:
                r1.b(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum c extends java.lang.Enum<xyz.adscope.ad.p0.c> {
        public static final xyz.adscope.ad.p0.c a = null;
        public static final xyz.adscope.ad.p0.c b = null;
        private static final /* synthetic */ xyz.adscope.ad.p0.c[] c = null;

        static {
                xyz.adscope.ad.p0$c r0 = new xyz.adscope.ad.p0$c
                java.lang.String r1 = "SHAKE_STATUS_START"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.ad.p0.c.a = r0
                xyz.adscope.ad.p0$c r0 = new xyz.adscope.ad.p0$c
                java.lang.String r1 = "SHAKE_STATUS_STANDBY"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.ad.p0.c.b = r0
                xyz.adscope.ad.p0$c[] r0 = a()
                xyz.adscope.ad.p0.c.c = r0
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.ad.p0.c[] a() {
                r0 = 2
                xyz.adscope.ad.p0$c[] r0 = new xyz.adscope.ad.p0.c[r0]
                xyz.adscope.ad.p0$c r1 = xyz.adscope.ad.p0.c.a
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.p0$c r1 = xyz.adscope.ad.p0.c.b
                r2 = 1
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.p0.c valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.p0$c> r0 = xyz.adscope.ad.p0.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.p0$c r1 = (xyz.adscope.ad.p0.c) r1
                return r1
        }

        public static xyz.adscope.ad.p0.c[] values() {
                xyz.adscope.ad.p0$c[] r0 = xyz.adscope.ad.p0.c.c
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.p0$c[] r0 = (xyz.adscope.ad.p0.c[]) r0
                return r0
        }
    }

    public p0(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.l = r1
            return
    }

    static /* synthetic */ android.view.View a(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    private java.lang.String a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "Cooling"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto Ld
            java.lang.String r2 = r2.a()
            return r2
        Ld:
            java.lang.String r2 = r2.b()
            return r2
    }

    private xyz.adscope.ad.p0.b a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel r12, java.lang.String r13) {
            r11 = this;
            if (r12 == 0) goto L4d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r12.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r12.c()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r3 = r12.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r4 = r12.a()
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = r11.a(r0, r13)
            double r9 = xyz.adscope.common.v2.tool.str.StringUtil.parseDouble(r0)
            goto L20
        L1f:
            r9 = r5
        L20:
            if (r2 == 0) goto L2a
            java.lang.String r0 = r11.a(r2, r13)
            double r5 = xyz.adscope.common.v2.tool.str.StringUtil.parseDouble(r0)
        L2a:
            if (r3 == 0) goto L35
            java.lang.String r0 = r11.a(r3, r13)
            int r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
            goto L36
        L35:
            r0 = 0
        L36:
            if (r4 == 0) goto L40
            java.lang.String r2 = r11.a(r4, r13)
        L3c:
            r7 = r2
            r4 = r5
            r6 = r0
            goto L43
        L40:
            java.lang.String r2 = ""
            goto L3c
        L43:
            xyz.adscope.ad.p0$b r0 = new xyz.adscope.ad.p0$b
            r2 = r9
            r9 = 0
            r1 = r11
            r8 = r13
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return r0
        L4d:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.view.View b(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View c(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View d(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View e(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View f(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    static /* synthetic */ android.view.View g(xyz.adscope.ad.p0 r0) {
            android.view.View r0 = r0.e
            return r0
    }

    private void k() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r3.g
            if (r0 == 0) goto L15
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel r0 = r0.j()
            java.lang.String r1 = "Cooling"
            xyz.adscope.ad.p0$b r0 = r3.a(r0, r1)
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
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel r0 = r0.j()
            java.lang.String r1 = "Normal"
            xyz.adscope.ad.p0$b r0 = r3.a(r0, r1)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r2 = r3.l
            r2.put(r1, r0)
        L15:
            return
    }

    private void m() {
            r9 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r9.g
            if (r0 == 0) goto L5b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.ShakeModel r0 = r0.j()
            java.lang.String r1 = "Passive"
            xyz.adscope.ad.p0$b r2 = r9.a(r0, r1)
            if (r2 == 0) goto L5b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r3 = r0.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r4 = r0.c()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r0.b()
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r3 == 0) goto L29
            java.lang.String r3 = r3.c()
            double r7 = xyz.adscope.common.v2.tool.str.StringUtil.parseDoubleOrDefault(r3, r5)
            goto L2a
        L29:
            r7 = r5
        L2a:
            if (r4 == 0) goto L34
            java.lang.String r3 = r4.c()
            double r5 = xyz.adscope.common.v2.tool.str.StringUtil.parseDoubleOrDefault(r3, r5)
        L34:
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.c()
            int r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
            r3 = r7
            r7 = r0
            goto L44
        L41:
            r0 = 0
            r3 = r7
            r7 = 0
        L44:
            xyz.adscope.ad.p0.b.a(r2, r3, r5, r7)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r9.g
            long r3 = r0.g()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r9.g
            int r0 = r0.h()
            xyz.adscope.ad.p0.b.a(r2, r3, r0)
            java.util.Map<java.lang.String, xyz.adscope.ad.p6$c> r0 = r9.l
            r0.put(r1, r2)
        L5b:
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
            xyz.adscope.ad.n3$a r0 = xyz.adscope.ad.n3.a.e
            return r0
    }

    @Override // xyz.adscope.ad.p6
    protected android.hardware.Sensor f() {
            r2 = this;
            android.hardware.SensorManager r0 = r2.i
            if (r0 == 0) goto La
            r1 = 1
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

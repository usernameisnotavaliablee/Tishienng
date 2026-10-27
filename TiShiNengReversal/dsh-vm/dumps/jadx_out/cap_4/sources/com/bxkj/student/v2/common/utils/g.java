package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.g.a a = null;
    private static int b;
    private static double c;
    private static double d;
    private static double e;
    private static double f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;

    /* renamed from: l, reason: collision with root package name */
    private static double f1370l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDriftUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriftUtils.kt\ncom/bxkj/student/v2/common/utils/DriftUtils$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1788#2,4:308\n1#3:312\n*S KotlinDebug\n*F\n+ 1 DriftUtils.kt\ncom/bxkj/student/v2/common/utils/DriftUtils$Companion\n*L\n153#1:308,4\n*E\n"})
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final double F(double[] r14) {
                r13 = this;
                int r0 = r14.length
                r1 = 0
                r3 = 0
                r5 = r1
                r4 = 0
            L6:
                if (r4 >= r0) goto Le
                r7 = r14[r4]
                double r5 = r5 + r7
                int r4 = r4 + 1
                goto L6
            Le:
                double r7 = (double) r0
                double r5 = r5 / r7
            L10:
                if (r3 >= r0) goto L1d
                r9 = r14[r3]
                double r11 = r9 - r5
                double r9 = r9 - r5
                double r11 = r11 * r9
                double r1 = r1 + r11
                int r3 = r3 + 1
                goto L10
            L1d:
                double r1 = r1 / r7
                return r1
        }

        private final double a(double[] r7) {
                r6 = this;
                int r0 = r7.length
                r1 = 0
                r3 = 0
            L4:
                if (r3 >= r0) goto Lc
                r4 = r7[r3]
                double r1 = r1 + r4
                int r3 = r3 + 1
                goto L4
            Lc:
                double r3 = (double) r0
                double r1 = r1 / r3
                return r1
        }

        private final double b(int r4, long r5) {
                r3 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L9
                r4 = 0
                return r4
            L9:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r0.<init>(r4)
                java.math.BigDecimal r4 = new java.math.BigDecimal
                r4.<init>(r5)
                java.math.RoundingMode r5 = java.math.RoundingMode.HALF_UP
                r6 = 10
                java.math.BigDecimal r4 = r0.divide(r4, r6, r5)
                java.math.BigDecimal r6 = new java.math.BigDecimal
                r0 = 60
                r6.<init>(r0)
                java.math.BigDecimal r4 = r4.multiply(r6)
                r6 = 0
                java.math.BigDecimal r4 = r4.setScale(r6, r5)
                double r4 = r4.doubleValue()
                return r4
        }

        public static /* synthetic */ boolean e(com.bxkj.student.v2.common.utils.g.a r0, java.util.List r1, double r2, int r4, java.lang.Object r5) {
                r4 = r4 & 2
                if (r4 == 0) goto L6
                r2 = 0
            L6:
                boolean r0 = r0.d(r1, r2)
                return r0
        }

        private final double g(int r5) {
                r4 = this;
                int r5 = r4.m()
                double r0 = (double) r5
                double r2 = r4.f()
                double r0 = r0 * r2
                return r0
        }

        private final double q(int r5) {
                r4 = this;
                double r0 = (double) r5
                double r2 = r4.f()
                double r0 = r0 * r2
                return r0
        }

        public final void A(int r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.t(r1)
                return
        }

        public final void B(double r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.u(r1)
                return
        }

        public final void C(int r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.v(r1)
                return
        }

        public final double D(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r8, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r9) {
                r7 = this;
                java.lang.String r0 = "prePoint"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "curPoint"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.math.BigDecimal r0 = new java.math.BigDecimal
                com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
                double r2 = r8.getA()
                double r4 = r8.getO()
                r1.<init>(r2, r4)
                com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
                double r3 = r9.getA()
                double r5 = r9.getO()
                r2.<init>(r3, r5)
                float r1 = com.amap.api.maps.AMapUtils.calculateLineDistance(r1, r2)
                double r1 = (double) r1
                r0.<init>(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                long r2 = r9.getT()
                long r8 = r8.getT()
                long r2 = r2 - r8
                r1.<init>(r2)
                java.math.BigDecimal r8 = new java.math.BigDecimal
                r9 = 1000(0x3e8, float:1.401E-42)
                r8.<init>(r9)
                r9 = 10
                r2 = 4
                java.math.BigDecimal r8 = r1.divide(r8, r9, r2)
                java.math.BigDecimal r8 = r8.abs()
                double r3 = r8.doubleValue()
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L5d
                double r8 = r0.doubleValue()
                return r8
            L5d:
                java.math.BigDecimal r8 = r0.divide(r8, r9, r2)
                java.math.BigDecimal r8 = r8.abs()
                double r8 = r8.doubleValue()
                return r8
        }

        public final boolean E(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r4, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r5) {
                r3 = this;
                java.lang.String r0 = "prePoint"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "curPoint"
                kotlin.jvm.internal.g0.p(r5, r0)
                double r4 = r3.D(r4, r5)
                double r0 = r3.l()
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 >= 0) goto L18
                r4 = 1
                return r4
            L18:
                r4 = 0
                return r4
        }

        public final double c(int r4, long r5, double r7, long r9) {
                r3 = this;
                r0 = 180(0xb4, float:2.52E-43)
                long r0 = (long) r0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 > 0) goto L2e
                double r5 = r3.b(r4, r5)
                int r9 = r3.k()
                double r9 = (double) r9
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 >= 0) goto L1d
                double r4 = r3.q(r4)
                double r7 = java.lang.Math.min(r4, r7)
                goto L2e
            L1d:
                int r9 = r3.m()
                double r9 = (double) r9
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 <= 0) goto L2e
                double r4 = r3.g(r4)
                double r7 = java.lang.Math.min(r4, r7)
            L2e:
                r4 = 0
                double r4 = java.lang.Math.max(r7, r4)
                return r4
        }

        public final boolean d(@org.jetbrains.annotations.NotNull java.util.List<com.bxkj.student.v2.common.data.PointData> r9, double r10) {
                r8 = this;
                java.lang.String r0 = "latLngList"
                kotlin.jvm.internal.g0.p(r9, r0)
                r0 = 30
                java.util.List r9 = kotlin.collections.f0.P5(r9, r0)
                int r0 = r9.size()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "lastList.size="
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = " exceptionRatio="
                r1.append(r0)
                r1.append(r10)
                java.lang.String r0 = r1.toString()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r0, r2)
                r0 = r9
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r2 = r0 instanceof java.util.Collection
                if (r2 == 0) goto L40
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L40
                r2 = 0
                goto L68
            L40:
                java.util.Iterator r0 = r0.iterator()
                r2 = 0
            L45:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L68
                java.lang.Object r3 = r0.next()
                com.bxkj.student.v2.common.data.PointData r3 = (com.bxkj.student.v2.common.data.PointData) r3
                float r3 = r3.getS()
                double r3 = (double) r3
                com.bxkj.student.v2.common.utils.g$a r5 = com.bxkj.student.v2.common.utils.g.a
                double r5 = r5.l()
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L45
                int r2 = r2 + 1
                if (r2 >= 0) goto L45
                kotlin.collections.f0.a0()
                goto L45
            L68:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                int r2 = r0.intValue()
                double r2 = (double) r2
                int r9 = r9.size()
                double r4 = (double) r9
                double r4 = r4 * r10
                int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r9 <= 0) goto L7d
                goto L7e
            L7d:
                r0 = 0
            L7e:
                if (r0 == 0) goto L82
                r9 = 1
                return r9
            L82:
                return r1
        }

        public final double f() {
                r2 = this;
                double r0 = com.bxkj.student.v2.common.utils.g.a()
                return r0
        }

        public final int h() {
                r1 = this;
                int r0 = com.bxkj.student.v2.common.utils.g.b()
                return r0
        }

        public final double i() {
                r2 = this;
                double r0 = com.bxkj.student.v2.common.utils.g.c()
                return r0
        }

        public final int j() {
                r1 = this;
                int r0 = com.bxkj.student.v2.common.utils.g.d()
                return r0
        }

        public final int k() {
                r1 = this;
                int r0 = com.bxkj.student.v2.common.utils.g.e()
                return r0
        }

        public final double l() {
                r2 = this;
                double r0 = com.bxkj.student.v2.common.utils.g.f()
                return r0
        }

        public final int m() {
                r1 = this;
                int r0 = com.bxkj.student.v2.common.utils.g.g()
                return r0
        }

        public final double n() {
                r2 = this;
                double r0 = com.bxkj.student.v2.common.utils.g.h()
                return r0
        }

        public final int o() {
                r1 = this;
                int r0 = com.bxkj.student.v2.common.utils.g.i()
                return r0
        }

        public final double p() {
                r2 = this;
                double r0 = com.bxkj.student.v2.common.utils.g.j()
                return r0
        }

        public final int r() {
                r1 = this;
                int r0 = com.bxkj.student.v2.common.utils.g.k()
                return r0
        }

        public final void s(double r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.l(r1)
                return
        }

        public final void t(int r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.m(r1)
                return
        }

        public final void u(double r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.n(r1)
                return
        }

        public final void v(int r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.o(r1)
                return
        }

        public final void w(int r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.p(r1)
                return
        }

        public final void x(double r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.q(r1)
                return
        }

        public final void y(int r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.r(r1)
                return
        }

        public final void z(double r1) {
                r0 = this;
                com.bxkj.student.v2.common.utils.g.s(r1)
                return
        }
    }

    static {
            com.bxkj.student.v2.common.utils.g$a r0 = new com.bxkj.student.v2.common.utils.g$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.utils.g.a = r0
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            com.bxkj.student.v2.common.utils.g.c = r0
            r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            com.bxkj.student.v2.common.utils.g.d = r0
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            com.bxkj.student.v2.common.utils.g.e = r0
            r0 = 4612361558371493478(0x4002666666666666, double:2.3)
            com.bxkj.student.v2.common.utils.g.f = r0
            r0 = 80
            com.bxkj.student.v2.common.utils.g.g = r0
            r0 = 150(0x96, float:2.1E-43)
            com.bxkj.student.v2.common.utils.g.h = r0
            r0 = 220(0xdc, float:3.08E-43)
            com.bxkj.student.v2.common.utils.g.i = r0
            r0 = 300(0x12c, float:4.2E-43)
            com.bxkj.student.v2.common.utils.g.j = r0
            r0 = 1
            com.bxkj.student.v2.common.utils.g.k = r0
            return
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ double a() {
            double r0 = com.bxkj.student.v2.common.utils.g.e
            return r0
    }

    public static final /* synthetic */ int b() {
            int r0 = com.bxkj.student.v2.common.utils.g.k
            return r0
    }

    public static final /* synthetic */ double c() {
            double r0 = com.bxkj.student.v2.common.utils.g.f1370l
            return r0
    }

    public static final /* synthetic */ int d() {
            int r0 = com.bxkj.student.v2.common.utils.g.j
            return r0
    }

    public static final /* synthetic */ int e() {
            int r0 = com.bxkj.student.v2.common.utils.g.g
            return r0
    }

    public static final /* synthetic */ double f() {
            double r0 = com.bxkj.student.v2.common.utils.g.c
            return r0
    }

    public static final /* synthetic */ int g() {
            int r0 = com.bxkj.student.v2.common.utils.g.i
            return r0
    }

    public static final /* synthetic */ double h() {
            double r0 = com.bxkj.student.v2.common.utils.g.f
            return r0
    }

    public static final /* synthetic */ int i() {
            int r0 = com.bxkj.student.v2.common.utils.g.h
            return r0
    }

    public static final /* synthetic */ double j() {
            double r0 = com.bxkj.student.v2.common.utils.g.d
            return r0
    }

    public static final /* synthetic */ int k() {
            int r0 = com.bxkj.student.v2.common.utils.g.b
            return r0
    }

    public static final /* synthetic */ void l(double r0) {
            com.bxkj.student.v2.common.utils.g.e = r0
            return
    }

    public static final /* synthetic */ void m(int r0) {
            com.bxkj.student.v2.common.utils.g.k = r0
            return
    }

    public static final /* synthetic */ void n(double r0) {
            com.bxkj.student.v2.common.utils.g.f1370l = r0
            return
    }

    public static final /* synthetic */ void o(int r0) {
            com.bxkj.student.v2.common.utils.g.j = r0
            return
    }

    public static final /* synthetic */ void p(int r0) {
            com.bxkj.student.v2.common.utils.g.g = r0
            return
    }

    public static final /* synthetic */ void q(double r0) {
            com.bxkj.student.v2.common.utils.g.c = r0
            return
    }

    public static final /* synthetic */ void r(int r0) {
            com.bxkj.student.v2.common.utils.g.i = r0
            return
    }

    public static final /* synthetic */ void s(double r0) {
            com.bxkj.student.v2.common.utils.g.f = r0
            return
    }

    public static final /* synthetic */ void t(int r0) {
            com.bxkj.student.v2.common.utils.g.h = r0
            return
    }

    public static final /* synthetic */ void u(double r0) {
            com.bxkj.student.v2.common.utils.g.d = r0
            return
    }

    public static final /* synthetic */ void v(int r0) {
            com.bxkj.student.v2.common.utils.g.b = r0
            return
    }
}

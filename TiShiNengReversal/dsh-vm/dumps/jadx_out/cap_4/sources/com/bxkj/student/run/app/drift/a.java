package com.bxkj.student.run.app.drift;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.run.app.drift.a.C0130a a = null;
    public static final int b = 10;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.run.app.drift.a$a, reason: collision with other inner class name */
    public static final class C0130a {
        private C0130a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0130a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
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

        private final double d(double[] r14) {
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

        public final double b(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.location.LatLngTimeSpeed r11, @org.jetbrains.annotations.NotNull com.bxkj.student.run.app.location.LatLngTimeSpeed r12) {
                r10 = this;
                java.lang.String r0 = "prePoint"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "curPoint"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.math.BigDecimal r0 = new java.math.BigDecimal
                com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
                double r2 = r11.getLatitude()
                double r4 = r11.getLongitude()
                r1.<init>(r2, r4)
                com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
                double r3 = r12.getLatitude()
                double r5 = r12.getLongitude()
                r2.<init>(r3, r5)
                float r1 = com.amap.api.maps.AMapUtils.calculateLineDistance(r1, r2)
                double r1 = (double) r1
                r0.<init>(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                long r2 = r12.getTime()
                long r4 = r11.getTime()
                long r2 = r2 - r4
                r1.<init>(r2)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                r3 = 1000(0x3e8, float:1.401E-42)
                r2.<init>(r3)
                r3 = 10
                r4 = 4
                java.math.BigDecimal r1 = r1.divide(r2, r3, r4)
                java.math.BigDecimal r1 = r1.abs()
                java.math.BigDecimal r2 = new java.math.BigDecimal
                r5 = 0
                r2.<init>(r5)
                int r2 = r1.compareTo(r2)
                if (r2 != 0) goto L5f
                double r11 = r0.doubleValue()
                return r11
            L5f:
                java.math.BigDecimal r2 = r0.divide(r1, r3, r4)
                java.math.BigDecimal r2 = r2.abs()
                java.math.BigDecimal r4 = new java.math.BigDecimal
                r4.<init>(r3)
                int r4 = r2.compareTo(r4)
                java.lang.String r6 = " speed="
                java.lang.String r7 = " time="
                java.lang.String r8 = "漂移点轨迹过滤器 distance="
                r9 = 1
                if (r4 != r9) goto L9a
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r8)
                r11.append(r0)
                r11.append(r7)
                r11.append(r1)
                r11.append(r6)
                r11.append(r2)
                java.lang.String r11 = r11.toString()
                java.lang.Object[] r12 = new java.lang.Object[r5]
                com.orhanobut.logger.j.m(r11, r12)
                goto Ld5
            L9a:
                java.math.BigDecimal r4 = new java.math.BigDecimal
                r4.<init>(r3)
                int r3 = r0.compareTo(r4)
                if (r3 != r9) goto Ld5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r8)
                r3.append(r0)
                r3.append(r7)
                r3.append(r1)
                r3.append(r6)
                r3.append(r2)
                java.lang.String r0 = " prePoint="
                r3.append(r0)
                r3.append(r11)
                java.lang.String r11 = " curPoint="
                r3.append(r11)
                r3.append(r12)
                java.lang.String r11 = r3.toString()
                java.lang.Object[] r12 = new java.lang.Object[r5]
                com.orhanobut.logger.j.d(r11, r12)
            Ld5:
                double r11 = r2.doubleValue()
                return r11
        }

        public final boolean c(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.location.LatLngTimeSpeed r4, @org.jetbrains.annotations.NotNull com.bxkj.student.run.app.location.LatLngTimeSpeed r5) {
                r3 = this;
                java.lang.String r0 = "prePoint"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "curPoint"
                kotlin.jvm.internal.g0.p(r5, r0)
                double r4 = r3.b(r4, r5)
                r0 = 4621819117588971520(0x4024000000000000, double:10.0)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 >= 0) goto L16
                r4 = 1
                return r4
            L16:
                r4 = 0
                return r4
        }

        public final boolean e(@org.jetbrains.annotations.NotNull java.util.List<? extends com.bxkj.student.run.app.location.LatLngTimeSpeed> r11, @org.jetbrains.annotations.NotNull com.bxkj.student.run.app.location.LatLngTimeSpeed r12) {
                r10 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "curPoint"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r11.size()
                r2 = 1
                r3 = 1
            L15:
                if (r3 >= r1) goto L33
                int r4 = r3 + (-1)
                java.lang.Object r4 = r11.get(r4)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r4 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r4
                java.lang.Object r5 = r11.get(r3)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r5 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r5
                double r4 = r10.b(r4, r5)
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                r0.add(r4)
                int r3 = r3 + 1
                goto L15
            L33:
                double[] r1 = kotlin.collections.f0.W5(r0)
                double r3 = r10.d(r1)
                double[] r0 = kotlin.collections.f0.W5(r0)
                double r0 = r10.a(r0)
                int r5 = r11.size()
                int r5 = r5 - r2
                java.lang.Object r11 = r11.get(r5)
                com.bxkj.student.run.app.location.LatLngTimeSpeed r11 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r11
                double r11 = r10.b(r11, r12)
                double r5 = r11 - r0
                r7 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r5 = java.lang.Math.pow(r5, r7)
                int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r7 <= 0) goto L97
                r7 = 10
                double r7 = (double) r7
                double r7 = r7 * r3
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L97
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "漂移点->方差"
                r2.append(r7)
                r2.append(r3)
                java.lang.String r3 = " 平均速度"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = " 当前速度"
                r2.append(r0)
                r2.append(r11)
                java.lang.String r11 = " pow"
                r2.append(r11)
                r2.append(r5)
                java.lang.String r11 = r2.toString()
                r12 = 0
                java.lang.Object[] r0 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r11, r0)
                return r12
            L97:
                return r2
        }
    }

    static {
            com.bxkj.student.run.app.drift.a$a r0 = new com.bxkj.student.run.app.drift.a$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.run.app.drift.a.a = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }
}

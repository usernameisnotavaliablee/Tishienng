package com.bxkj.student.v2.common.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.data.j.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSportsDataAnalysis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsDataAnalysis.kt\ncom/bxkj/student/v2/common/data/SportsDataAnalysis$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,532:1\n1563#2:533\n1634#2,3:534\n1563#2:537\n1634#2,3:538\n774#2:541\n865#2,2:542\n774#2:544\n865#2,2:545\n774#2:547\n865#2,2:548\n774#2:550\n865#2,2:551\n1#3:553\n*S KotlinDebug\n*F\n+ 1 SportsDataAnalysis.kt\ncom/bxkj/student/v2/common/data/SportsDataAnalysis$Companion\n*L\n35#1:533\n35#1:534,3\n176#1:537\n176#1:538,3\n188#1:541\n188#1:542,2\n191#1:544\n191#1:545,2\n194#1:547\n194#1:548,2\n197#1:550\n197#1:551,2\n*E\n"})
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

        public final double a(double r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                return r0
            L7:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r0.<init>(r6)
                java.math.BigDecimal r6 = new java.math.BigDecimal
                r7 = 60
                r6.<init>(r7)
                r7 = 10
                r1 = 4
                java.math.BigDecimal r6 = r0.divide(r6, r7, r1)
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r0.<init>(r4)
                java.math.BigDecimal r4 = r6.divide(r0, r7, r1)
                java.math.BigDecimal r5 = new java.math.BigDecimal
                r6 = 1000(0x3e8, float:1.401E-42)
                r5.<init>(r6)
                java.math.BigDecimal r4 = r4.multiply(r5)
                r5 = 2
                java.math.BigDecimal r4 = r4.setScale(r5, r1)
                double r4 = r4.doubleValue()
                return r4
        }

        public final void b(double r39, @org.jetbrains.annotations.NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Double>, kotlin.n1> r42, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Double>, kotlin.n1> r43, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Double>, kotlin.n1> r44, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r45) {
                r38 = this;
                r0 = r38
                r1 = r41
                r2 = r42
                r3 = r43
                r4 = r44
                r5 = r45
                r6 = 0
                java.lang.Double r8 = java.lang.Double.valueOf(r6)
                java.lang.String r9 = "dataList"
                kotlin.jvm.internal.g0.p(r1, r9)
                java.lang.String r9 = "paceMinute"
                kotlin.jvm.internal.g0.p(r2, r9)
                java.lang.String r9 = "paceKm"
                kotlin.jvm.internal.g0.p(r3, r9)
                java.lang.String r9 = "distanceMinute"
                kotlin.jvm.internal.g0.p(r4, r9)
                java.lang.String r9 = "exceptionStepDistanceCount"
                kotlin.jvm.internal.g0.p(r5, r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r12 = r1
                java.util.Collection r12 = (java.util.Collection) r12
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L449
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r8 = new java.util.ArrayList
                r12 = 10
                int r15 = kotlin.collections.f0.d0(r1, r12)
                r8.<init>(r15)
                java.util.Iterator r1 = r1.iterator()
            L54:
                boolean r15 = r1.hasNext()
                if (r15 == 0) goto Lac
                java.lang.Object r15 = r1.next()
                java.util.Map r15 = (java.util.Map) r15
                com.bxkj.student.v2.common.data.PointData r16 = new com.bxkj.student.v2.common.data.PointData
                com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r7 = "a"
                double r17 = r6.f(r15, r7)
                java.lang.String r7 = "o"
                double r19 = r6.f(r15, r7)
                java.lang.String r7 = "t"
                r31 = 1
                double r12 = r6.f(r15, r7)
                long r12 = (long) r12
                java.lang.String r7 = "s"
                float r23 = r6.i(r15, r7)
                java.lang.String r7 = "i"
                boolean r24 = r6.d(r15, r7)
                java.lang.String r7 = "l"
                r21 = r12
                double r12 = r6.f(r15, r7)
                int r7 = (int) r12
                java.lang.String r12 = "c"
                double r12 = r6.f(r15, r12)
                long r12 = (long) r12
                java.lang.String r14 = "e"
                int r28 = r6.k(r15, r14)
                r25 = r7
                r26 = r12
                r16.<init>(r17, r19, r21, r23, r24, r25, r26, r28)
                r6 = r16
                r8.add(r6)
                r6 = 0
                r12 = 10
                goto L54
            Lac:
                r31 = 1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r6 = r8.iterator()
            Lb7:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto Ld2
                java.lang.Object r7 = r6.next()
                r12 = r7
                com.bxkj.student.v2.common.data.PointData r12 = (com.bxkj.student.v2.common.data.PointData) r12
                long r12 = r12.getC()
                r14 = 30
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 >= 0) goto Lb7
                r1.add(r7)
                goto Lb7
            Ld2:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r7 = r1.iterator()
            Ldb:
                boolean r12 = r7.hasNext()
                if (r12 == 0) goto Lfb
                java.lang.Object r12 = r7.next()
                r13 = r12
                com.bxkj.student.v2.common.data.PointData r13 = (com.bxkj.student.v2.common.data.PointData) r13
                float r13 = r13.getS()
                double r13 = (double) r13
                com.bxkj.student.v2.common.utils.g$a r15 = com.bxkj.student.v2.common.utils.g.a
                double r15 = r15.l()
                int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r17 <= 0) goto Ldb
                r6.add(r12)
                goto Ldb
            Lfb:
                int r1 = r1.size()
                int r6 = r6.size()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r12 = "前30秒总共"
                r7.append(r12)
                r7.append(r1)
                java.lang.String r1 = "个点,异常点"
                r7.append(r1)
                r7.append(r6)
                java.lang.String r6 = "点"
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                r12 = 0
                java.lang.Object[] r13 = new java.lang.Object[r12]
                com.orhanobut.logger.j.e(r7, r13)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r12 = r8.iterator()
            L130:
                boolean r13 = r12.hasNext()
                r14 = 60
                if (r13 == 0) goto L152
                java.lang.Object r13 = r12.next()
                r16 = r13
                com.bxkj.student.v2.common.data.PointData r16 = (com.bxkj.student.v2.common.data.PointData) r16
                long r16 = r16.getC()
                r18 = 31
                int r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r20 > 0) goto L130
                int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r18 >= 0) goto L130
                r7.add(r13)
                goto L130
            L152:
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r13 = r7.iterator()
            L15b:
                boolean r16 = r13.hasNext()
                if (r16 == 0) goto L181
                java.lang.Object r14 = r13.next()
                r15 = r14
                com.bxkj.student.v2.common.data.PointData r15 = (com.bxkj.student.v2.common.data.PointData) r15
                float r15 = r15.getS()
                double r4 = (double) r15
                com.bxkj.student.v2.common.utils.g$a r15 = com.bxkj.student.v2.common.utils.g.a
                double r18 = r15.l()
                int r15 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r15 <= 0) goto L17a
                r12.add(r14)
            L17a:
                r4 = r44
                r5 = r45
                r14 = 60
                goto L15b
            L181:
                int r4 = r7.size()
                int r5 = r12.size()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r12 = "前30-60秒总共"
                r7.append(r12)
                r7.append(r4)
                r7.append(r1)
                r7.append(r5)
                r7.append(r6)
                java.lang.String r1 = r7.toString()
                r12 = 0
                java.lang.Object[] r4 = new java.lang.Object[r12]
                com.orhanobut.logger.j.e(r1, r4)
                java.lang.Object r1 = r8.get(r12)
                com.bxkj.student.v2.common.data.PointData r1 = (com.bxkj.student.v2.common.data.PointData) r1
                java.lang.Object r4 = r8.get(r12)
                com.bxkj.student.v2.common.data.PointData r4 = (com.bxkj.student.v2.common.data.PointData) r4
                long r4 = r4.getT()
                int r6 = r8.size()
                r26 = r4
                r4 = 1
                r7 = 0
                r12 = 1
                r13 = 1
                r14 = 0
                r18 = 0
                r20 = 0
                r22 = 0
                r24 = 0
                r29 = 0
                r32 = 0
            L1d1:
                if (r12 >= r6) goto L37d
                java.lang.Object r5 = r8.get(r12)
                com.bxkj.student.v2.common.data.PointData r5 = (com.bxkj.student.v2.common.data.PointData) r5
                r28 = r6
                com.bxkj.student.v2.common.utils.g$a r6 = com.bxkj.student.v2.common.utils.g.a
                boolean r6 = r6.E(r1, r5)
                r34 = r1
                if (r6 == 0) goto L222
                boolean r6 = r5.isI()
                if (r6 != 0) goto L21c
                long r35 = r5.getT()
                long r35 = r35 - r26
                long r24 = r24 + r35
                com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
                double r1 = r5.getA()
                r36 = r4
                double r3 = r5.getO()
                r6.<init>(r1, r3)
                com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
                double r2 = r34.getA()
                r4 = r10
                r37 = r11
                double r10 = r34.getO()
                r1.<init>(r2, r10)
                float r1 = com.amap.api.maps.AMapUtils.calculateLineDistance(r6, r1)
                double r1 = (double) r1
                double r14 = r14 + r1
            L218:
                r11 = 10
                goto L293
            L21c:
                r36 = r4
                r4 = r10
                r37 = r11
                goto L218
            L222:
                r36 = r4
                r4 = r10
                r37 = r11
                boolean r1 = r5.isI()
                if (r1 != 0) goto L218
                long r1 = r5.getT()
                long r1 = r1 - r26
                long r1 = r24 + r1
                long r10 = r5.getC()
                int r3 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
                if (r3 != 0) goto L240
                r5.setC(r1)
            L240:
                long r10 = r5.getC()
                int r3 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
                if (r3 != 0) goto L24f
                java.math.BigDecimal r3 = new java.math.BigDecimal
                r6 = 0
                r3.<init>(r6)
                goto L264
            L24f:
                java.math.BigDecimal r3 = new java.math.BigDecimal
                r3.<init>(r14)
                java.math.BigDecimal r6 = new java.math.BigDecimal
                long r10 = r5.getC()
                r6.<init>(r10)
                r10 = 4
                r11 = 10
                java.math.BigDecimal r3 = r3.divide(r6, r11, r10)
            L264:
                java.math.BigDecimal r6 = new java.math.BigDecimal
                long r10 = r5.getT()
                r24 = r1
                int r1 = r12 + (-1)
                java.lang.Object r1 = r8.get(r1)
                com.bxkj.student.v2.common.data.PointData r1 = (com.bxkj.student.v2.common.data.PointData) r1
                long r1 = r1.getT()
                long r10 = r10 - r1
                r6.<init>(r10)
                java.math.BigDecimal r1 = r3.multiply(r6)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                r3 = 1000(0x3e8, float:1.401E-42)
                r2.<init>(r3)
                r10 = 4
                r11 = 10
                java.math.BigDecimal r1 = r1.divide(r2, r11, r10)
                double r1 = r1.doubleValue()
                double r14 = r14 + r1
            L293:
                long r1 = r5.getE()
                int r6 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
                if (r6 <= 0) goto L29d
                r1 = r0
                goto L29e
            L29d:
                r1 = 0
            L29e:
                if (r1 == 0) goto L2c8
                java.math.BigDecimal r2 = new java.math.BigDecimal
                r2.<init>(r14)
                java.math.BigDecimal r6 = new java.math.BigDecimal
                r41 = r4
                long r3 = r5.getE()
                r6.<init>(r3)
                r3 = 2
                r4 = 4
                java.math.BigDecimal r2 = r2.divide(r6, r3, r4)
                double r2 = r2.doubleValue()
                com.bxkj.student.v2.common.data.j$a r4 = com.bxkj.student.v2.common.data.j.a
                int r4 = (r2 > r39 ? 1 : (r2 == r39 ? 0 : -1))
                if (r4 <= 0) goto L2c2
                r3 = r1
                goto L2c3
            L2c2:
                r3 = 0
            L2c3:
                if (r3 == 0) goto L2ca
                int r7 = r7 + 1
                goto L2ca
            L2c8:
                r41 = r4
            L2ca:
                double r1 = r14 - r18
                int r1 = kotlin.math.b.K0(r1)
                double r1 = (double) r1
                r3 = 60
                double r16 = r0.a(r1, r3)
                long r26 = r5.getC()
                int r6 = r13 * 60
                long r3 = (long) r6
                int r6 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
                if (r6 > 0) goto L30c
                int r3 = r9.size()
                if (r3 >= r13) goto L2f9
                java.lang.Double r3 = java.lang.Double.valueOf(r16)
                r9.add(r3)
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r3 = r37
                r3.add(r1)
                goto L320
            L2f9:
                r3 = r37
                int r4 = r13 + (-1)
                java.lang.Double r6 = java.lang.Double.valueOf(r16)
                r9.set(r4, r6)
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r3.set(r4, r1)
                goto L320
            L30c:
                r3 = r37
                java.lang.Double r4 = java.lang.Double.valueOf(r16)
                r9.add(r4)
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r3.add(r1)
                int r13 = r13 + 1
                r18 = r29
            L320:
                double r1 = r14 - r20
                int r1 = kotlin.math.b.K0(r1)
                double r1 = (double) r1
                long r16 = r5.getC()
                r4 = r12
                long r11 = r16 - r32
                double r1 = r0.a(r1, r11)
                r10 = r36
                int r11 = r10 * 1000
                double r11 = (double) r11
                int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r16 > 0) goto L357
                int r11 = r41.size()
                if (r11 >= r10) goto L34b
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r11 = r41
                r11.add(r1)
                goto L369
            L34b:
                r11 = r41
                int r12 = r10 + (-1)
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r11.set(r12, r1)
                goto L369
            L357:
                r11 = r41
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r11.add(r1)
                long r32 = r5.getC()
                int r1 = r10 + 1
                r10 = r1
                r20 = r14
            L369:
                long r26 = r5.getT()
                int r12 = r4 + 1
                r2 = r42
                r1 = r5
                r4 = r10
                r10 = r11
                r29 = r14
                r6 = r28
                r11 = r3
                r3 = r43
                goto L1d1
            L37d:
                r3 = r11
                r11 = r10
                r2.invoke(r9)
                r1 = r43
                r1.invoke(r11)
                r4 = r44
                r4.invoke(r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
                r5 = r45
                r5.invoke(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "总距离="
                r1.append(r2)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                r12 = 0
                java.lang.Object[] r2 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r1, r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "每分钟配速="
                r1.append(r2)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r2 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r1, r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "每分钟里程="
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r2 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r1, r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "每公里配速="
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r2 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r1, r2)
                int r1 = r8.size()
                int r1 = r1 + (-1)
                java.lang.Object r1 = r8.get(r1)
                com.bxkj.student.v2.common.data.PointData r1 = (com.bxkj.student.v2.common.data.PointData) r1
                long r1 = r1.getC()
                double r1 = r0.a(r14, r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "平均配速="
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r12 = 0
                java.lang.Object[] r2 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r1, r2)
                int r1 = r8.size()
                int r1 = r1 + (-1)
                java.lang.Object r1 = r8.get(r1)
                com.bxkj.student.v2.common.data.PointData r1 = (com.bxkj.student.v2.common.data.PointData) r1
                long r1 = r1.getC()
                double r1 = r0.a(r14, r1)
                java.lang.String r1 = r0.f(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "平均配速格式化="
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r12 = 0
                java.lang.Object[] r2 = new java.lang.Object[r12]
                com.orhanobut.logger.j.d(r1, r2)
                return
            L449:
                r1 = r3
                r3 = 1
                r12 = 0
                java.lang.Double[] r4 = new java.lang.Double[r3]
                r4[r12] = r8
                java.util.List r4 = kotlin.collections.f0.U(r4)
                r2.invoke(r4)
                java.lang.Double[] r2 = new java.lang.Double[r3]
                r2[r12] = r8
                java.util.List r2 = kotlin.collections.f0.U(r2)
                java.lang.Object r1 = r1.invoke(r2)
                kotlin.n1 r1 = (kotlin.n1) r1
                return
        }

        public final int c(int r5, double r6, int r8, double r9) {
                r4 = this;
                if (r5 != 0) goto L3
                goto L4c
            L3:
                r5 = 1000(0x3e8, float:1.401E-42)
                double r0 = (double) r5
                double r6 = r6 * r0
                r5 = 0
                if (r8 == 0) goto Ld
                r0 = r4
                goto Le
            Ld:
                r0 = r5
            Le:
                if (r0 == 0) goto L4c
                r1 = 0
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 != 0) goto L18
                r1 = 1
                goto L19
            L18:
                r1 = 0
            L19:
                if (r1 != 0) goto L1c
                goto L1d
            L1c:
                r0 = r5
            L1d:
                if (r0 == 0) goto L4c
                int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r1 <= 0) goto L24
                r5 = r0
            L24:
                if (r5 == 0) goto L4c
                java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L4a
                r5.<init>(r9)     // Catch: java.lang.Exception -> L4a
                java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L4a
                r9.<init>(r6)     // Catch: java.lang.Exception -> L4a
                r6 = 10
                r7 = 4
                java.math.BigDecimal r5 = r5.divide(r9, r6, r7)     // Catch: java.lang.Exception -> L4a
                java.math.BigDecimal r6 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L4a
                r6.<init>(r8)     // Catch: java.lang.Exception -> L4a
                java.math.BigDecimal r5 = r6.multiply(r5)     // Catch: java.lang.Exception -> L4a
                double r5 = r5.doubleValue()     // Catch: java.lang.Exception -> L4a
                double r5 = java.lang.Math.ceil(r5)     // Catch: java.lang.Exception -> L4a
                int r5 = (int) r5
                return r5
            L4a:
                r5 = -1
                return r5
            L4c:
                return r8
        }

        public final int d(double r7, int r9, double r10) {
                r6 = this;
                r0 = 1000(0x3e8, float:1.401E-42)
                double r0 = (double) r0
                double r7 = r7 * r0
                r0 = 0
                r1 = -1
                if (r9 == r1) goto Lb
                r2 = r6
                goto Lc
            Lb:
                r2 = r0
            Lc:
                if (r2 == 0) goto L49
                r3 = 0
                int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r5 != 0) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                if (r3 != 0) goto L1a
                goto L1b
            L1a:
                r2 = r0
            L1b:
                if (r2 == 0) goto L49
                int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r3 <= 0) goto L22
                r0 = r2
            L22:
                if (r0 == 0) goto L49
                java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L48
                r0.<init>(r10)     // Catch: java.lang.Exception -> L48
                java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L48
                r10.<init>(r7)     // Catch: java.lang.Exception -> L48
                r7 = 10
                r8 = 4
                java.math.BigDecimal r7 = r0.divide(r10, r7, r8)     // Catch: java.lang.Exception -> L48
                java.math.BigDecimal r8 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L48
                r8.<init>(r9)     // Catch: java.lang.Exception -> L48
                java.math.BigDecimal r7 = r8.multiply(r7)     // Catch: java.lang.Exception -> L48
                double r7 = r7.doubleValue()     // Catch: java.lang.Exception -> L48
                double r7 = java.lang.Math.ceil(r7)     // Catch: java.lang.Exception -> L48
                int r7 = (int) r7
                return r7
            L48:
                return r1
            L49:
                return r9
        }

        public final void e(@org.jetbrains.annotations.NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r32) {
                r31 = this;
                r0 = r32
                java.lang.String r1 = "dataList"
                kotlin.jvm.internal.g0.p(r0, r1)
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L265
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r3 = kotlin.collections.f0.d0(r0, r2)
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L7a
                java.lang.Object r3 = r0.next()
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.student.v2.common.data.PointData r4 = new com.bxkj.student.v2.common.data.PointData
                com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r6 = "a"
                double r6 = r5.f(r3, r6)
                java.lang.String r8 = "o"
                double r8 = r5.f(r3, r8)
                java.lang.String r10 = "t"
                double r10 = r5.f(r3, r10)
                long r10 = (long) r10
                java.lang.String r12 = "s"
                float r12 = r5.i(r3, r12)
                java.lang.String r13 = "i"
                boolean r13 = r5.d(r3, r13)
                java.lang.String r14 = "l"
                double r14 = r5.f(r3, r14)
                int r14 = (int) r14
                java.lang.String r15 = "c"
                r16 = r6
                double r6 = r5.f(r3, r15)
                long r6 = (long) r6
                java.lang.String r15 = "e"
                int r3 = r5.k(r3, r15)
                r29 = r10
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r6
                r7 = r8
                r9 = r29
                r5 = r16
                r16 = r3
                r4.<init>(r5, r7, r9, r11, r12, r13, r14, r16)
                r1.add(r4)
                goto L21
            L7a:
                r0 = 0
                java.lang.Object r3 = r1.get(r0)
                com.bxkj.student.v2.common.data.PointData r3 = (com.bxkj.student.v2.common.data.PointData) r3
                com.bxkj.student.v2.common.utils.g$a r4 = com.bxkj.student.v2.common.utils.g.a
                r5 = 0
                r4.u(r5)
                int r4 = r1.size()
                r10 = r5
                r12 = r10
                r9 = 1
                r14 = 0
                r15 = 0
            L91:
                if (r9 >= r4) goto L228
                java.lang.Object r16 = r1.get(r9)
                com.bxkj.student.v2.common.data.PointData r16 = (com.bxkj.student.v2.common.data.PointData) r16
                r17 = r5
                com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
                r6 = 1
                double r7 = r16.getA()
                r19 = r1
                double r0 = r16.getO()
                r5.<init>(r7, r0)
                com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
                double r7 = r3.getA()
                r20 = r3
                double r2 = r20.getO()
                r0.<init>(r7, r2)
                float r0 = com.amap.api.maps.AMapUtils.calculateLineDistance(r5, r0)
                double r2 = (double) r0
                java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)
                long r2 = r16.getE()
                r7 = 0
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto Ld4
                r5 = r4
                r3 = r20
                r1 = 10
                goto L21c
            Ld4:
                boolean r2 = r16.isI()
                if (r2 != 0) goto L217
                float r2 = r16.getS()
                double r2 = (double) r2
                com.bxkj.student.v2.common.utils.g$a r21 = com.bxkj.student.v2.common.utils.g.a
                double r7 = r21.l()
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 <= 0) goto L12c
                java.math.BigDecimal r2 = new java.math.BigDecimal
                r2.<init>(r10)
                java.math.BigDecimal r3 = new java.math.BigDecimal
                long r7 = r16.getC()
                r3.<init>(r7)
                r5 = 4
                r1 = 10
                java.math.BigDecimal r2 = r2.divide(r3, r1, r5)
                java.math.BigDecimal r3 = new java.math.BigDecimal
                long r7 = r16.getT()
                long r22 = r20.getT()
                long r7 = r7 - r22
                r3.<init>(r7)
                java.math.BigDecimal r3 = r3.abs()
                java.math.BigDecimal r7 = new java.math.BigDecimal
                r8 = 1000(0x3e8, float:1.401E-42)
                r7.<init>(r8)
                java.math.BigDecimal r3 = r3.divide(r7, r1, r5)
                r16.getC()
                java.util.Objects.toString(r2)
                java.util.Objects.toString(r3)
                java.util.Objects.toString(r0)
                java.math.BigDecimal r0 = r2.multiply(r3)
            L12c:
                boolean r2 = r20.isI()
                if (r2 != 0) goto L1d8
                boolean r2 = r16.isI()
                if (r2 != 0) goto L1d8
                long r2 = r16.getT()
                long r7 = r20.getT()
                long r2 = r2 - r7
                r7 = 10000(0x2710, double:4.9407E-320)
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 <= 0) goto L15f
                java.lang.String r0 = "进入隧道算法，超过10秒未获取到定位点"
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.orhanobut.logger.j.e(r0, r3)
                java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r17)
                java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r17)
                r5 = r4
                r3 = r20
                r1 = 10
                r15 = 0
                goto L1e8
            L15f:
                if (r14 == 0) goto L1d4
                int r15 = r15 + 1
                java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r17)
                java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r17)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "扔掉第"
                r3.append(r5)
                r3.append(r15)
                java.lang.String r5 = "个点"
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r5 = 0
                java.lang.Object[] r7 = new java.lang.Object[r5]
                com.orhanobut.logger.j.e(r3, r7)
                r1 = 10
                if (r15 != r1) goto L1d1
                com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
                double r2 = r16.getA()
                double r7 = r16.getO()
                r0.<init>(r2, r7)
                com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
                double r7 = r14.getA()
                r5 = r4
                double r3 = r14.getO()
                r2.<init>(r7, r3)
                float r0 = com.amap.api.maps.AMapUtils.calculateLineDistance(r0, r2)
                double r2 = (double) r0
                java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "进入隧道算法，恢复10个定位点后补偿距离算法补偿后的appendDistance="
                r2.append(r3)
                r2.append(r0)
                java.lang.String r3 = " gpsAppendDistance="
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.orhanobut.logger.j.e(r2, r4)
            L1ce:
                r2 = r0
                r3 = 0
                goto L1e8
            L1d1:
                r5 = r4
            L1d2:
                r3 = r14
                goto L1e8
            L1d4:
                r5 = r4
                r1 = 10
                goto L1e6
            L1d8:
                r5 = r4
                r1 = 10
                r3 = 0
                if (r14 == 0) goto L1e6
                java.lang.String r2 = "中途出现了暂停的点，将丢失的点位置空，重新按规则计算"
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.orhanobut.logger.j.e(r2, r4)
                goto L1ce
            L1e6:
                r2 = r0
                goto L1d2
            L1e8:
                java.math.BigDecimal r4 = new java.math.BigDecimal
                r4.<init>(r10)
                java.math.BigDecimal r0 = r4.add(r0)
                double r25 = r0.doubleValue()
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r0.<init>(r12)
                java.math.BigDecimal r0 = r0.add(r2)
                double r12 = r0.doubleValue()
                long r7 = r16.getE()
                int r0 = (int) r7
                long r23 = r16.getC()
                long r27 = r16.getC()
                r22 = r0
                double r10 = r21.c(r22, r23, r25, r27)
                r14 = r3
                goto L21a
            L217:
                r5 = r4
                r1 = 10
            L21a:
                r3 = r16
            L21c:
                int r9 = r9 + 1
                r4 = r5
                r5 = r17
                r1 = r19
                r0 = 0
                r2 = 10
                goto L91
            L228:
                r19 = r1
                r6 = 1
                int r0 = r19.size()
                int r0 = r0 - r6
                java.lang.Object r0 = r1.get(r0)
                com.bxkj.student.v2.common.data.PointData r0 = (com.bxkj.student.v2.common.data.PointData) r0
                long r0 = r0.getC()
                java.lang.String r0 = com.bxkj.student.run.app.utils.i.g(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "最终countDistance="
                r1.append(r2)
                r1.append(r10)
                java.lang.String r2 = " \n时间"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "\nGPS原始距离"
                r1.append(r0)
                r1.append(r12)
                java.lang.String r0 = r1.toString()
                r2 = 0
                java.lang.Object[] r1 = new java.lang.Object[r2]
                com.orhanobut.logger.j.e(r0, r1)
            L265:
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String f(double r5) {
                r4 = this;
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r0.<init>(r5)
                java.math.BigDecimal r5 = java.math.BigDecimal.ONE
                java.math.BigDecimal[] r5 = r0.divideAndRemainder(r5)
                r6 = 0
                r0 = r5[r6]
                r1 = 1
                r5 = r5[r1]
                int r0 = r0.intValue()
                java.text.DecimalFormat r1 = new java.text.DecimalFormat
                java.lang.String r2 = "00"
                r1.<init>(r2)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                r3 = 60
                r2.<init>(r3)
                java.math.BigDecimal r5 = r5.multiply(r2)
                r2 = 4
                java.math.BigDecimal r5 = r5.setScale(r6, r2)
                java.lang.String r5 = r1.format(r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                java.lang.String r0 = "'"
                r6.append(r0)
                r6.append(r5)
                java.lang.String r5 = "\""
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String g(@org.jetbrains.annotations.NotNull l0.d r17) {
                r16 = this;
                java.lang.String r0 = "sportsDb"
                r1 = r17
                kotlin.jvm.internal.g0.p(r1, r0)
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r2 = r1.T()
                java.util.Map r2 = r0.A(r2)
                java.lang.String r3 = r1.F()
                double r3 = java.lang.Double.parseDouble(r3)
                java.lang.String r5 = "totalRange"
                double r6 = r0.f(r2, r5)
                r8 = 1000(0x3e8, float:1.401E-42)
                double r8 = (double) r8
                double r6 = r6 * r8
                int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r10 >= 0) goto L2b
                java.lang.String r0 = "运动距离不符合"
                return r0
            L2b:
                java.lang.String r3 = r1.X()
                int r3 = com.bxkj.student.run.app.utils.i.t(r3)
                double r3 = (double) r3
                java.lang.String r6 = "step"
                double r6 = r0.f(r2, r6)
                int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r10 >= 0) goto L41
                java.lang.String r0 = "运动步数不符合"
                return r0
            L41:
                java.lang.String r3 = "startQualifiedTime"
                int r3 = r0.k(r2, r3)
                double r11 = r0.f(r2, r5)
                java.lang.String r4 = "endQualifiedTime"
                int r13 = r0.k(r2, r4)
                java.lang.String r4 = r1.F()
                double r4 = java.lang.Double.parseDouble(r4)
                double r4 = com.bxkj.student.run.app.utils.i.e(r4)
                double r14 = r4 * r8
                r10 = r16
                int r4 = r10.d(r11, r13, r14)
                java.lang.String r5 = r1.E()
                double r5 = java.lang.Double.parseDouble(r5)
                int r3 = r3 * 60
                double r7 = (double) r3
                int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r3 < 0) goto La5
                r3 = -1
                if (r4 == r3) goto L87
                java.lang.String r3 = r1.E()
                double r5 = java.lang.Double.parseDouble(r3)
                int r4 = r4 * 60
                double r3 = (double) r4
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L87
                goto La5
            L87:
                java.lang.String r3 = "list"
                java.util.List r2 = r0.n(r2, r3)
                java.lang.String r1 = r1.Q()
                java.util.List r0 = r0.z(r1)
                int r0 = r0.size()
                int r1 = r2.size()
                if (r0 >= r1) goto La2
                java.lang.String r0 = "未经过必经点"
                return r0
            La2:
                java.lang.String r0 = ""
                return r0
            La5:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "时间无效"
                com.orhanobut.logger.j.d(r1, r0)
                java.lang.String r0 = "运动时间不符合"
                return r0
        }

        public final double h(double r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L9
                r4 = -9223372036854775808
                return r4
            L9:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r1 = 1
                r0.<init>(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                r1.<init>(r4)
                java.math.BigDecimal r4 = new java.math.BigDecimal
                r5 = 60
                r4.<init>(r5)
                java.math.RoundingMode r5 = java.math.RoundingMode.HALF_UP
                r2 = 10
                java.math.BigDecimal r4 = r1.divide(r4, r2, r5)
                r1 = 2
                java.math.BigDecimal r4 = r0.divide(r4, r1, r5)
                double r4 = r4.doubleValue()
                return r4
        }

        public final double i(double r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                return r0
            L7:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.<init>(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                r1.<init>(r4)
                java.math.BigDecimal r4 = new java.math.BigDecimal
                r5 = 60
                r4.<init>(r5)
                java.math.BigDecimal r4 = r1.multiply(r4)
                r5 = 2
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP
                java.math.BigDecimal r4 = r0.divide(r4, r5, r1)
                double r4 = r4.doubleValue()
                return r4
        }

        public final double j(double r5) {
                r4 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                return r0
            L7:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r1 = 1
                r0.<init>(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                r2 = 60
                r1.<init>(r2)
                java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP
                r3 = 10
                java.math.BigDecimal r0 = r0.divide(r1, r3, r2)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                r1.<init>(r5)
                java.math.BigDecimal r5 = new java.math.BigDecimal
                r6 = 1000(0x3e8, float:1.401E-42)
                r5.<init>(r6)
                java.math.BigDecimal r5 = r1.divide(r5, r3, r2)
                java.math.BigDecimal r5 = r0.divide(r5, r3, r2)
                r6 = 2
                java.math.BigDecimal r5 = r5.setScale(r6, r2)
                double r5 = r5.doubleValue()
                return r5
        }
    }

    static {
            com.bxkj.student.v2.common.data.j$a r0 = new com.bxkj.student.v2.common.data.j$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.data.j.a = r0
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }
}

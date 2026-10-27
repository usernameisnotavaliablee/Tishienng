package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class s {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.s.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTestCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCase.kt\ncom/bxkj/student/v2/common/utils/TestCase$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1563#2:108\n1634#2,3:109\n1563#2:112\n1634#2,3:113\n*S KotlinDebug\n*F\n+ 1 TestCase.kt\ncom/bxkj/student/v2/common/utils/TestCase$Companion\n*L\n24#1:108\n24#1:109,3\n75#1:112\n75#1:113,3\n*E\n"})
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

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a(@org.jetbrains.annotations.NotNull java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r19) {
                r18 = this;
                r0 = r19
                java.lang.String r1 = "jsonToListMap"
                kotlin.jvm.internal.g0.p(r0, r1)
                com.bxkj.student.run.app.utils.o r1 = new com.bxkj.student.run.app.utils.o
                r1.<init>()
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = kotlin.collections.f0.d0(r1, r3)
                r2.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            L1e:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L68
                java.lang.Object r3 = r1.next()
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.student.v2.common.data.PointData r4 = new com.bxkj.student.v2.common.data.PointData
                java.lang.String r5 = "a"
                double r5 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r5)
                java.lang.String r7 = "o"
                double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r7)
                java.lang.String r9 = "t"
                double r9 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r9)
                long r9 = (long) r9
                java.lang.String r11 = "s"
                float r11 = cn.bluemobi.dylan.http.JsonParse.getFloat(r3, r11)
                java.lang.String r12 = "i"
                boolean r12 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r12)
                java.lang.String r13 = "l"
                int r13 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r13)
                java.lang.String r14 = "c"
                long r14 = cn.bluemobi.dylan.http.JsonParse.getLong(r3, r14)
                r17 = r1
                java.lang.String r1 = "e"
                int r16 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                r4.<init>(r5, r7, r9, r11, r12, r13, r14, r16)
                r2.add(r4)
                r1 = r17
                goto L1e
            L68:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4 = 0
                java.lang.Object r5 = r2.get(r4)
                r1.add(r5)
                java.lang.Object r5 = r0.get(r4)
                r3.add(r5)
                java.lang.Object r5 = r2.get(r4)
                com.bxkj.student.v2.common.data.PointData r5 = (com.bxkj.student.v2.common.data.PointData) r5
                int r6 = r2.size()
                r7 = 1
            L8c:
                if (r7 >= r6) goto Lb2
                java.lang.Object r8 = r2.get(r7)
                com.bxkj.student.v2.common.data.PointData r8 = (com.bxkj.student.v2.common.data.PointData) r8
                com.bxkj.student.v2.common.utils.g$a r9 = com.bxkj.student.v2.common.utils.g.a
                boolean r9 = r9.E(r5, r8)
                if (r9 == 0) goto La8
                r1.add(r8)
                java.lang.Object r5 = r0.get(r7)
                r3.add(r5)
                r5 = r8
                goto Laf
            La8:
                java.lang.String r8 = "漂移点"
                java.lang.Object[] r9 = new java.lang.Object[r4]
                com.orhanobut.logger.j.d(r8, r9)
            Laf:
                int r7 = r7 + 1
                goto L8c
            Lb2:
                return r3
        }

        public final void b(@org.jetbrains.annotations.NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r24) {
                r23 = this;
                r0 = r24
                java.lang.String r1 = "dataList"
                kotlin.jvm.internal.g0.p(r0, r1)
                com.bxkj.student.run.app.utils.o r1 = new com.bxkj.student.run.app.utils.o
                r1.<init>()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r3 = kotlin.collections.f0.d0(r0, r2)
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L1d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L75
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
                r24 = r4
                double r4 = r5.f(r3, r15)
                long r4 = (long) r4
                java.lang.String r15 = "e"
                int r16 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r15)
                r21 = r10
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r4
                r5 = r6
                r7 = r8
                r9 = r21
                r4 = r24
                r4.<init>(r5, r7, r9, r11, r12, r13, r14, r16)
                r1.add(r4)
                goto L1d
            L75:
                r0 = 0
                java.lang.Object r3 = r1.get(r0)
                com.bxkj.student.v2.common.data.PointData r3 = (com.bxkj.student.v2.common.data.PointData) r3
                java.lang.Object r4 = r1.get(r0)
                com.bxkj.student.v2.common.data.PointData r4 = (com.bxkj.student.v2.common.data.PointData) r4
                long r4 = r4.getT()
                int r6 = r1.size()
                r10 = 0
                r12 = 1
                r13 = 0
            L8f:
                java.lang.String r15 = " countTime="
                if (r12 >= r6) goto L17e
                java.lang.Object r16 = r1.get(r12)
                r17 = 0
                r7 = r16
                com.bxkj.student.v2.common.data.PointData r7 = (com.bxkj.student.v2.common.data.PointData) r7
                com.bxkj.student.v2.common.utils.g$a r8 = com.bxkj.student.v2.common.utils.g.a
                boolean r8 = r8.E(r3, r7)
                if (r8 == 0) goto Le0
                boolean r8 = r7.isI()
                if (r8 != 0) goto Ldb
                long r15 = r7.getT()
                long r15 = r15 - r4
                long r13 = r13 + r15
                com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng
                r24 = r1
                double r0 = r7.getA()
                r16 = 1
                double r8 = r7.getO()
                r4.<init>(r0, r8)
                com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
                double r8 = r3.getA()
                double r2 = r3.getO()
                r0.<init>(r8, r2)
                float r0 = com.amap.api.maps.AMapUtils.calculateLineDistance(r4, r0)
                double r2 = (double) r0
                double r10 = r10 + r2
            Ld5:
                r9 = r24
                r1 = 10
                goto L171
            Ldb:
                r24 = r1
                r16 = 1
                goto Ld5
            Le0:
                r24 = r1
                r16 = 1
                boolean r0 = r7.isI()
                if (r0 != 0) goto Ld5
                long r2 = r7.getT()
                long r2 = r2 - r4
                long r13 = r13 + r2
                long r2 = r7.getC()
                int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
                if (r0 != 0) goto Lfb
                r7.setC(r13)
            Lfb:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                r0.<init>(r10)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                long r3 = r7.getC()
                r2.<init>(r3)
                r3 = 4
                r1 = 10
                java.math.BigDecimal r0 = r0.divide(r2, r1, r3)
                java.math.BigDecimal r2 = new java.math.BigDecimal
                long r3 = r7.getT()
                int r5 = r12 + (-1)
                r9 = r24
                java.lang.Object r5 = r9.get(r5)
                com.bxkj.student.v2.common.data.PointData r5 = (com.bxkj.student.v2.common.data.PointData) r5
                long r19 = r5.getT()
                long r3 = r3 - r19
                r2.<init>(r3)
                java.math.BigDecimal r2 = r0.multiply(r2)
                java.math.BigDecimal r3 = new java.math.BigDecimal
                r4 = 1000(0x3e8, float:1.401E-42)
                r3.<init>(r4)
                r4 = 5
                r1 = 10
                java.math.BigDecimal r2 = r2.divide(r3, r1, r4)
                long r3 = r7.getC()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "countDistance="
                r5.append(r8)
                r5.append(r10)
                r5.append(r15)
                r5.append(r3)
                java.lang.String r3 = " avg="
                r5.append(r3)
                r5.append(r0)
                java.lang.String r0 = " appendDistance="
                r5.append(r0)
                r5.append(r2)
                java.lang.String r0 = r5.toString()
                r8 = 0
                java.lang.Object[] r3 = new java.lang.Object[r8]
                com.orhanobut.logger.j.e(r0, r3)
                double r2 = r2.doubleValue()
                double r10 = r10 + r2
            L171:
                long r4 = r7.getT()
                int r12 = r12 + 1
                r3 = r7
                r1 = r9
                r0 = 0
                r2 = 10
                goto L8f
            L17e:
                r9 = r1
                r16 = 1
                int r0 = r9.size()
                int r0 = r0 + (-1)
                java.lang.Object r0 = r9.get(r0)
                com.bxkj.student.v2.common.data.PointData r0 = (com.bxkj.student.v2.common.data.PointData) r0
                long r0 = r0.getC()
                java.lang.String r0 = com.bxkj.student.run.app.utils.i.g(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "最终countDistance="
                r1.append(r2)
                r1.append(r10)
                r1.append(r15)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r8 = 0
                java.lang.Object[] r1 = new java.lang.Object[r8]
                com.orhanobut.logger.j.m(r0, r1)
                return
        }
    }

    static {
            com.bxkj.student.v2.common.utils.s$a r0 = new com.bxkj.student.v2.common.utils.s$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.utils.s.a = r0
            return
    }

    public s() {
            r0 = this;
            r0.<init>()
            return
    }
}

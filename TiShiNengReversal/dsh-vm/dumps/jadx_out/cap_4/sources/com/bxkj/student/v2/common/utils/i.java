package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLineCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineCheck.kt\ncom/bxkj/student/v2/common/utils/LineCheck\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1563#2:33\n1634#2,3:34\n1761#2,3:37\n*S KotlinDebug\n*F\n+ 1 LineCheck.kt\ncom/bxkj/student/v2/common/utils/LineCheck\n*L\n15#1:33\n15#1:34,3\n17#1:37,3\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.i a = null;

    static {
            com.bxkj.student.v2.common.utils.i r0 = new com.bxkj.student.v2.common.utils.i
            r0.<init>()
            com.bxkj.student.v2.common.utils.i.a = r0
            return
    }

    private i() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean a(@org.jetbrains.annotations.NotNull java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r7) {
            r6 = this;
            java.lang.String r0 = "dataList"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r7.size()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto Le
            return r2
        Le:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r7.next()
            java.util.Map r1 = (java.util.Map) r1
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = "t"
            double r3 = r3.f(r1, r4)
            long r3 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.add(r1)
            goto L1f
        L3c:
            java.util.List r7 = kotlin.collections.f0.s6(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L50
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
            return r2
        L50:
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r7.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = r0 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L54
            r7 = 1
            return r7
        L7e:
            return r2
    }

    public final boolean b(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r7, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.common.data.PointData r8) {
            r6 = this;
            java.lang.String r0 = "prevPoint"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "currPoint"
            kotlin.jvm.internal.g0.p(r8, r0)
            long r0 = r7.getT()
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L3d
            long r0 = r8.getT()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L1e
            goto L3d
        L1e:
            boolean r0 = r7.isI()
            if (r0 != 0) goto L3d
            boolean r0 = r8.isI()
            if (r0 == 0) goto L2b
            goto L3d
        L2b:
            long r0 = r8.getT()
            long r7 = r7.getT()
            long r0 = r0 - r7
            r7 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 <= 0) goto L3d
            r7 = 1
            return r7
        L3d:
            return r2
    }
}

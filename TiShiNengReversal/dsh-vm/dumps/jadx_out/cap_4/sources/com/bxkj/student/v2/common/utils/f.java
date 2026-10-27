package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDrawMapLineManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawMapLineManager.kt\ncom/bxkj/student/v2/common/utils/DrawMapLineManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    private final android.content.Context a;

    @org.jetbrains.annotations.Nullable
    private final com.amap.api.maps.AMap b;

    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.Integer> c;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.PolylineOptions d;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.Polyline e;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.PolylineOptions f;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.Polyline g;

    public f(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.Nullable com.amap.api.maps.AMap r3) {
            r1 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            return
    }

    public final void a(@org.jetbrains.annotations.Nullable java.util.List<? extends com.bxkj.student.v2.common.data.PointData> r17) {
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r17 == 0) goto L130
            r3 = r17
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r6 = 0
            r7 = 0
        L19:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L130
            int r8 = r4 + 1
            java.lang.Object r9 = r3.next()
            com.bxkj.student.v2.common.data.PointData r9 = (com.bxkj.student.v2.common.data.PointData) r9
            boolean r10 = r9.isI()
            if (r7 == 0) goto L37
            com.bxkj.student.v2.common.utils.g$a r11 = com.bxkj.student.v2.common.utils.g.a
            double r11 = r11.D(r7, r9)
            float r7 = (float) r11
            r9.setS(r7)
        L37:
            com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng
            double r11 = r9.getA()
            double r13 = r9.getO()
            r7.<init>(r11, r13)
            android.content.Context r11 = r0.a
            float r12 = r9.getS()
            int r11 = com.bxkj.student.run.app.utils.i.s(r11, r12)
            r12 = 1084227584(0x40a00000, float:5.0)
            r13 = 2131099715(0x7f060043, float:1.7811791E38)
            r14 = 1086324736(0x40c00000, float:6.0)
            r15 = 1
            if (r10 != r6) goto La3
            r1.add(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r2.add(r7)
            int r7 = r17.size()
            int r7 = r7 - r15
            if (r4 != r7) goto L12b
            com.amap.api.maps.AMap r4 = r0.b
            if (r4 == 0) goto L12b
            com.amap.api.maps.model.PolylineOptions r7 = new com.amap.api.maps.model.PolylineOptions
            r7.<init>()
            r7.addAll(r1)
            android.content.Context r11 = r0.a
            int r11 = cn.bluemobi.dylan.base.utils.u.a(r14, r11)
            float r11 = (float) r11
            r7.width(r11)
            if (r6 == 0) goto L8e
            android.content.Context r6 = r0.a
            int r6 = androidx.core.content.ContextCompat.getColor(r6, r13)
            r7.color(r6)
            r7.setDottedLine(r15)
            goto L94
        L8e:
            r7.colorValues(r2)
            r7.useGradient(r15)
        L94:
            android.content.Context r6 = r0.a
            int r6 = cn.bluemobi.dylan.base.utils.u.a(r12, r6)
            float r6 = (float) r6
            r7.zIndex(r6)
            r4.addPolyline(r7)
            goto L12b
        La3:
            com.amap.api.maps.AMap r4 = r0.b
            if (r4 == 0) goto Ldd
            com.amap.api.maps.model.PolylineOptions r5 = new com.amap.api.maps.model.PolylineOptions
            r5.<init>()
            r5.addAll(r1)
            android.content.Context r12 = r0.a
            int r12 = cn.bluemobi.dylan.base.utils.u.a(r14, r12)
            float r12 = (float) r12
            r5.width(r12)
            if (r6 == 0) goto Lc8
            android.content.Context r6 = r0.a
            int r6 = androidx.core.content.ContextCompat.getColor(r6, r13)
            r5.color(r6)
            r5.setDottedLine(r15)
            goto Lce
        Lc8:
            r5.colorValues(r2)
            r5.useGradient(r15)
        Lce:
            android.content.Context r6 = r0.a
            r12 = 1084227584(0x40a00000, float:5.0)
            int r6 = cn.bluemobi.dylan.base.utils.u.a(r12, r6)
            float r6 = (float) r6
            r5.zIndex(r6)
            r4.addPolyline(r5)
        Ldd:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Le5
            r4 = r2
            goto Le6
        Le5:
            r4 = 0
        Le6:
            if (r4 == 0) goto L103
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto Lef
            goto Lf0
        Lef:
            r4 = 0
        Lf0:
            if (r4 == 0) goto L103
            int r4 = kotlin.collections.f0.L(r1)
            java.lang.Object r4 = r1.get(r4)
            int r5 = kotlin.collections.f0.L(r2)
            java.lang.Object r5 = r2.get(r5)
            goto L105
        L103:
            r4 = 0
            r5 = 0
        L105:
            r2.clear()
            r1.clear()
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4
            if (r4 == 0) goto L112
            r1.add(r4)
        L112:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L121
            int r4 = r5.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
        L121:
            r1.add(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r2.add(r4)
        L12b:
            r4 = r8
            r7 = r9
            r6 = r10
            goto L19
        L130:
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull com.amap.api.maps.model.LatLng r7, @org.jetbrains.annotations.NotNull com.amap.api.maps.model.LatLng r8, float r9, boolean r10) {
            r6 = this;
            java.lang.String r0 = "newLatLng"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "lastLatLng"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = 1084227584(0x40a00000, float:5.0)
            r4 = 0
            if (r10 == 0) goto L8f
            com.amap.api.maps.model.Polyline r9 = r6.g
            r10 = 2131099715(0x7f060043, float:1.7811791E38)
            r5 = 1090519040(0x41000000, float:8.0)
            if (r9 != 0) goto L61
            r6.d = r4
            r6.e = r4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r6.c = r9
            com.amap.api.maps.model.PolylineOptions r9 = new com.amap.api.maps.model.PolylineOptions
            r9.<init>()
            com.amap.api.maps.model.LatLng[] r1 = new com.amap.api.maps.model.LatLng[r1]
            r1[r0] = r8
            r1[r2] = r7
            r9.add(r1)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r5, r7)
            float r7 = (float) r7
            r9.width(r7)
            r9.setDottedLine(r2)
            android.content.Context r7 = r6.a
            int r7 = androidx.core.content.ContextCompat.getColor(r7, r10)
            r9.color(r7)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r3, r7)
            float r7 = (float) r7
            r9.zIndex(r7)
            r6.f = r9
            com.amap.api.maps.AMap r7 = r6.b
            if (r7 == 0) goto L5e
            com.amap.api.maps.model.Polyline r4 = r7.addPolyline(r9)
        L5e:
            r6.g = r4
            return
        L61:
            if (r9 == 0) goto L10e
            com.amap.api.maps.model.PolylineOptions r8 = r6.f
            if (r8 == 0) goto L8b
            r8.add(r7)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r5, r7)
            float r7 = (float) r7
            r8.width(r7)
            r8.setDottedLine(r2)
            android.content.Context r7 = r6.a
            int r7 = androidx.core.content.ContextCompat.getColor(r7, r10)
            r8.color(r7)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r3, r7)
            float r7 = (float) r7
            r8.zIndex(r7)
            r4 = r8
        L8b:
            r9.setOptions(r4)
            return
        L8f:
            java.util.List<java.lang.Integer> r10 = r6.c
            android.content.Context r5 = r6.a
            int r5 = com.bxkj.student.run.app.utils.i.s(r5, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10.add(r5)
            com.amap.api.maps.model.Polyline r10 = r6.e
            r5 = 1086324736(0x40c00000, float:6.0)
            if (r10 != 0) goto Ldc
            r6.f = r4
            r6.g = r4
            com.amap.api.maps.model.PolylineOptions r9 = new com.amap.api.maps.model.PolylineOptions
            r9.<init>()
            com.amap.api.maps.model.LatLng[] r10 = new com.amap.api.maps.model.LatLng[r1]
            r10[r0] = r8
            r10[r2] = r7
            r9.add(r10)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r5, r7)
            float r7 = (float) r7
            r9.width(r7)
            java.util.List<java.lang.Integer> r7 = r6.c
            r9.colorValues(r7)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r3, r7)
            float r7 = (float) r7
            r9.zIndex(r7)
            r6.d = r9
            com.amap.api.maps.AMap r7 = r6.b
            if (r7 == 0) goto Ld9
            com.amap.api.maps.model.Polyline r4 = r7.addPolyline(r9)
        Ld9:
            r6.e = r4
            return
        Ldc:
            if (r10 == 0) goto L10e
            com.amap.api.maps.model.PolylineOptions r8 = r6.d
            if (r8 == 0) goto L10b
            r8.add(r7)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r5, r7)
            float r7 = (float) r7
            r8.width(r7)
            java.util.List<java.lang.Integer> r7 = r6.c
            r8.colorValues(r7)
            r8.useGradient(r2)
            android.content.Context r7 = r6.a
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r3, r7)
            float r7 = (float) r7
            r8.zIndex(r7)
            android.content.Context r7 = r6.a
            int r7 = com.bxkj.student.run.app.utils.i.s(r7, r9)
            r8.color(r7)
            r4 = r8
        L10b:
            r10.setOptions(r4)
        L10e:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final com.amap.api.maps.AMap c() {
            r1 = this;
            com.amap.api.maps.AMap r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final android.content.Context d() {
            r1 = this;
            android.content.Context r0 = r1.a
            return r0
    }
}

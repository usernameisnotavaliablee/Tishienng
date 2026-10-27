package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3GeoFenceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3GeoFenceObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3GeoFenceObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1878#2,2:199\n1563#2:201\n1634#2,3:202\n1563#2:205\n1634#2,3:206\n1880#2:209\n*S KotlinDebug\n*F\n+ 1 V3GeoFenceObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3GeoFenceObserver\n*L\n70#1:199,2\n71#1:201\n71#1:202,3\n80#1:205\n80#1:206,3\n70#1:209\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3GeoFenceObserver implements androidx.lifecycle.LifecycleObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity a;

    @org.jetbrains.annotations.NotNull
    private com.bxkj.student.v2.vm.sports.SportsVM b;

    @org.jetbrains.annotations.NotNull
    private final com.amap.api.maps.AMap c;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.fence.GeoFenceClient d;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Boolean> e;

    @org.jetbrains.annotations.Nullable
    private android.content.Intent f;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String g;

    @org.jetbrains.annotations.NotNull
    private final android.content.BroadcastReceiver h;
    private boolean i;

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog j;

    public V3GeoFenceObserver(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.sports.SportsVM r3, @org.jetbrains.annotations.NotNull com.amap.api.maps.AMap r4) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mViewModel"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "aMap"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.e = r2
            java.lang.String r2 = "com.location.apis.geofenceBounds.broadcast"
            r1.g = r2
            com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver$mGeoFenceBoundsReceiver$1 r2 = new com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver$mGeoFenceBoundsReceiver$1
            r2.<init>(r1)
            r1.h = r2
            return
    }

    public static /* synthetic */ void a(java.util.List r0, int r1, java.lang.String r2) {
            e(r0, r1, r2)
            return
    }

    public static final /* synthetic */ java.util.Map b(com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver r0) {
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.e
            return r0
    }

    public static final /* synthetic */ void c(com.bxkj.student.v2.ui.sports.v3.service.V3GeoFenceObserver r0, boolean r1) {
            r0.k(r1)
            return
    }

    private final void d(java.util.List<? extends java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Lb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lf4
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L1c
            kotlin.collections.f0.b0()
        L1c:
            java.util.List r3 = (java.util.List) r3
            com.amap.api.fence.GeoFenceClient r5 = r0.d
            java.lang.String r6 = "runGeoFenceId"
            java.lang.String r7 = "lng"
            java.lang.String r8 = "lat"
            r9 = 10
            if (r5 == 0) goto L79
            r10 = r3
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.f0.d0(r10, r9)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L3a:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L67
            java.lang.Object r12 = r10.next()
            java.util.Map r12 = (java.util.Map) r12
            com.amap.api.location.DPoint r13 = new com.amap.api.location.DPoint
            com.bxkj.base.v2.common.utils.x r14 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r15 = r14.t(r12, r8)
            r16 = r10
            double r9 = java.lang.Double.parseDouble(r15)
            java.lang.String r12 = r14.t(r12, r7)
            double r14 = java.lang.Double.parseDouble(r12)
            r13.<init>(r9, r14)
            r11.add(r13)
            r10 = r16
            r9 = 10
            goto L3a
        L67:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r5.addGeoFence(r11, r9)
        L79:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r0.e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.put(r2, r6)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.f0.d0(r3, r5)
            r2.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        La0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r3.next()
            java.util.Map r5 = (java.util.Map) r5
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            com.bxkj.base.v2.common.utils.x r9 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r10 = r9.t(r5, r8)
            double r10 = java.lang.Double.parseDouble(r10)
            java.lang.String r5 = r9.t(r5, r7)
            double r12 = java.lang.Double.parseDouble(r5)
            r6.<init>(r10, r12)
            r2.add(r6)
            goto La0
        Lc7:
            com.amap.api.maps.model.PolygonOptions r3 = new com.amap.api.maps.model.PolygonOptions
            r3.<init>()
            r3.addAll(r2)
            androidx.fragment.app.FragmentActivity r2 = r0.a
            r5 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r5)
            r3.fillColor(r2)
            androidx.fragment.app.FragmentActivity r2 = r0.a
            r5 = 2131100554(0x7f06038a, float:1.7813493E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r5)
            r3.strokeColor(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            r3.strokeWidth(r2)
            com.amap.api.maps.AMap r2 = r0.c
            r2.addPolygon(r3)
            r2 = r4
            goto Lb
        Lf4:
            com.bxkj.student.v2.ui.sports.v3.service.a r1 = new com.bxkj.student.v2.ui.sports.v3.service.a
            r1.<init>()
            com.amap.api.fence.GeoFenceClient r2 = r0.d
            if (r2 == 0) goto L100
            r2.setGeoFenceListener(r1)
        L100:
            com.amap.api.fence.GeoFenceClient r1 = r0.d
            if (r1 == 0) goto L109
            java.lang.String r2 = r0.g
            r1.createPendingIntent(r2)
        L109:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.<init>(r2)
            java.lang.String r2 = r0.g
            r1.addAction(r2)
            androidx.fragment.app.FragmentActivity r2 = r0.a
            android.content.BroadcastReceiver r3 = r0.h
            android.content.Intent r1 = r2.registerReceiver(r3, r1)
            r0.f = r1
            return
    }

    private static final void e(java.util.List r0, int r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto Lb
            java.lang.String r1 = "添加跑步范围围栏成功!!"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r1, r0)
            return
        Lb:
            java.lang.String r1 = "添加跑步范围围栏失败!!"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r1, r0)
            return
    }

    private final void k(boolean r10) {
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r10 == 0) goto L6c
            boolean r3 = r9.i
            if (r3 == 0) goto L6c
            java.lang.String r3 = "ActionStatus=在地理围栏里面"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r3, r4)
            com.bxkj.student.v2.common.data.i$a r3 = com.bxkj.student.v2.common.data.i.a
            r3.c0(r2)
            com.bxkj.student.run.app.utils.d0 r3 = com.bxkj.student.run.app.utils.d0.e()
            androidx.fragment.app.FragmentActivity r4 = r9.a
            r5 = 2131886094(0x7f12000e, float:1.9406757E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer[] r6 = new java.lang.Integer[r0]
            r6[r2] = r5
            java.util.List r2 = kotlin.collections.f0.U(r6)
            r3.l(r4, r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r9.j
            if (r2 == 0) goto Le0
            boolean r3 = r2.isShowing()
            if (r3 != 0) goto L68
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            android.app.Activity r2 = r2.q()
            java.lang.String r5 = "您已进入跑步规定区域，跑步已恢复，请继续进行跑步！"
            if (r2 == 0) goto L5c
            boolean r3 = r2 instanceof com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity
            if (r3 == 0) goto L56
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            android.app.Activity r2 = r2.r()
            if (r2 == 0) goto L5a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r5)
            goto L5a
        L56:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r5)
        L5a:
            r9.j = r1
        L5c:
            com.bxkj.student.v2.ui.sports.v3.service.m$a r3 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            androidx.fragment.app.FragmentActivity r4 = r9.a
            r7 = 4
            r8 = 0
            r6 = 0
            com.bxkj.student.v2.ui.sports.v3.service.m.a.h(r3, r4, r5, r6, r7, r8)
            goto Le0
        L68:
            r2.dismiss()
            goto Le0
        L6c:
            if (r10 != 0) goto Le0
            boolean r3 = r9.i
            if (r3 != 0) goto Le0
            java.lang.String r3 = "ActionStatus=在地理围栏外面"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r3, r4)
            com.bxkj.student.v2.common.data.i$a r3 = com.bxkj.student.v2.common.data.i.a
            r3.c0(r0)
            com.bxkj.student.run.app.utils.d0 r3 = com.bxkj.student.run.app.utils.d0.e()
            androidx.fragment.app.FragmentActivity r4 = r9.a
            r5 = 2131886095(0x7f12000f, float:1.940676E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer[] r6 = new java.lang.Integer[r0]
            r6[r2] = r5
            java.util.List r2 = kotlin.collections.f0.U(r6)
            r3.l(r4, r2)
            androidx.fragment.app.FragmentActivity r2 = r9.a
            java.lang.String r3 = "vibrator"
            java.lang.Object r2 = r2.getSystemService(r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.os.Vibrator"
            kotlin.jvm.internal.g0.n(r2, r3)
            android.os.Vibrator r2 = (android.os.Vibrator) r2
            r3 = 2000(0x7d0, double:9.88E-321)
            r2.vibrate(r3)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r9.j
            if (r2 == 0) goto Lb1
            r2.dismiss()
        Lb1:
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            android.app.Activity r2 = r2.q()
            java.lang.String r5 = "您已偏离跑步规定区域，跑步已暂停，请在规定区域内进行跑步！"
            if (r2 == 0) goto Ld6
            boolean r3 = r2 instanceof com.bxkj.student.v2.ui.sports.v3.V3ThreeTwoOneActivity
            if (r3 == 0) goto Ld0
            cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
            android.app.Activity r2 = r2.r()
            if (r2 == 0) goto Ld4
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r5)
            goto Ld4
        Ld0:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r2, r5)
        Ld4:
            r9.j = r1
        Ld6:
            com.bxkj.student.v2.ui.sports.v3.service.m$a r3 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            androidx.fragment.app.FragmentActivity r4 = r9.a
            r7 = 4
            r8 = 0
            r6 = 0
            com.bxkj.student.v2.ui.sports.v3.service.m.a.h(r3, r4, r5, r6, r7, r8)
        Le0:
            r10 = r10 ^ r0
            r9.i = r10
            return
    }

    @org.jetbrains.annotations.NotNull
    public final com.amap.api.maps.AMap f() {
            r1 = this;
            com.amap.api.maps.AMap r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentActivity h() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.vm.sports.SportsVM i() {
            r1 = this;
            com.bxkj.student.v2.vm.sports.SportsVM r0 = r1.b
            return r0
    }

    public final void j(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.sports.SportsVM r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
            r3 = this;
            com.amap.api.fence.GeoFenceClient r0 = new com.amap.api.fence.GeoFenceClient
            androidx.fragment.app.FragmentActivity r1 = r3.a
            r0.<init>(r1)
            r1 = 3
            r0.setActivateAction(r1)
            r3.d = r0
            com.bxkj.student.v2.vm.sports.SportsVM r0 = r3.b
            java.util.Map r0 = r0.M()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "V3GeoFenceObserver->mViewModel.sportsSetMap="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            com.bxkj.student.v2.vm.sports.SportsVM r0 = r3.b
            java.util.Map r0 = r0.M()
            java.lang.String r1 = "geofence"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L4b
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.vm.sports.SportsVM r2 = r3.b
            java.util.Map r2 = r2.M()
            java.lang.String r1 = r0.t(r2, r1)
            java.util.List r0 = r0.y(r1)
            r3.d(r0)
        L4b:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
            r2 = this;
            com.amap.api.fence.GeoFenceClient r0 = r2.d
            if (r0 == 0) goto La
            kotlin.jvm.internal.g0.m(r0)
            r0.removeGeoFence()
        La:
            android.content.Intent r0 = r2.f
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentActivity r0 = r2.a
            android.content.BroadcastReceiver r1 = r2.h
            r0.unregisterReceiver(r1)
        L15:
            return
    }
}

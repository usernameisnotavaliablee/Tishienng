package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3PassPoint2Observer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3PassPoint2Observer.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3PassPoint2Observer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,478:1\n1#2:479\n774#3:480\n865#3,2:481\n1011#3,2:483\n1869#3,2:485\n774#3:487\n865#3,2:488\n1869#3,2:490\n1869#3,2:492\n*S KotlinDebug\n*F\n+ 1 V3PassPoint2Observer.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3PassPoint2Observer\n*L\n123#1:480\n123#1:481,2\n128#1:483,2\n142#1:485,2\n168#1:487\n168#1:488,2\n173#1:490,2\n283#1:492,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3PassPoint2Observer implements androidx.lifecycle.LifecycleObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity a;

    @org.jetbrains.annotations.NotNull
    private final com.bxkj.student.v2.vm.sports.SportsVM b;

    @org.jetbrains.annotations.NotNull
    private final com.amap.api.maps.MapView c;

    @org.jetbrains.annotations.NotNull
    private final com.amap.api.maps.AMap d;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.LatLngBounds.Builder e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.amap.api.maps.model.Marker> f;

    @org.jetbrains.annotations.NotNull
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> g;
    private boolean h;
    private boolean i;
    private int j;
    private double k;

    /* renamed from: l, reason: collision with root package name */
    private double f1490l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1491m;

    /* renamed from: n, reason: collision with root package name */
    private int f1492n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final android.content.BroadcastReceiver f1493o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements t.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer a;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.io.File> b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3PassPoint2Observer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3PassPoint2Observer.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3PassPoint2Observer$camera$4$onActivityResult$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,478:1\n1#2:479\n*E\n"})
        /* renamed from: com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$a$a, reason: collision with other inner class name */
        public static final class C0166a implements top.zibin.luban.d {
            final /* synthetic */ java.io.File a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer b;
            final /* synthetic */ java.lang.String c;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> d;

            C0166a(java.io.File r1, com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r2, java.lang.String r3, kotlin.jvm.functions.Function0<kotlin.n1> r4) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    r0.<init>()
                    return
            }

            public static /* synthetic */ kotlin.n1 b(kotlin.jvm.functions.Function0 r0, java.io.File r1) {
                    kotlin.n1 r0 = c(r0, r1)
                    return r0
            }

            private static final kotlin.n1 c(kotlin.jvm.functions.Function0 r0, java.io.File r1) {
                    r0.invoke()
                    boolean r0 = r1.exists()
                    if (r0 == 0) goto Lb
                    r0 = r1
                    goto Lc
                Lb:
                    r0 = 0
                Lc:
                    if (r0 == 0) goto L11
                    r1.delete()
                L11:
                    kotlin.n1 r0 = kotlin.n1.a
                    return r0
            }

            public void a(java.io.File r6) {
                    r5 = this;
                    java.lang.String r0 = "file"
                    kotlin.jvm.internal.g0.p(r6, r0)
                    java.io.File r0 = r5.a
                    boolean r1 = r0.exists()
                    if (r1 == 0) goto Le
                    goto Lf
                Le:
                    r0 = 0
                Lf:
                    if (r0 == 0) goto L16
                    java.io.File r0 = r5.a
                    r0.delete()
                L16:
                    com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0 = r5.b
                    com.bxkj.student.v2.vm.sports.SportsVM r0 = r0.n()
                    com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                    com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r2 = r5.b
                    com.bxkj.student.v2.vm.sports.SportsVM r2 = r2.n()
                    java.util.Map r2 = r2.M()
                    java.lang.String r3 = "identify"
                    java.lang.String r1 = r1.t(r2, r3)
                    java.lang.String r2 = r5.c
                    kotlin.jvm.functions.Function0<kotlin.n1> r3 = r5.d
                    com.bxkj.student.v2.ui.sports.v3.service.s r4 = new com.bxkj.student.v2.ui.sports.v3.service.s
                    r4.<init>(r3, r6)
                    r0.N(r1, r2, r6, r4)
                    return
            }

            public void onError(java.lang.Throwable r1) {
                    r0 = this;
                    return
            }

            public void onStart() {
                    r0 = this;
                    return
            }
        }

        a(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r1, kotlin.jvm.internal.Ref.ObjectRef<java.io.File> r2, java.lang.String r3, kotlin.jvm.functions.Function0<kotlin.n1> r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r5, android.content.Intent r6) {
                r4 = this;
                r6 = -1
                if (r5 != r6) goto L46
                com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r5 = r4.a
                boolean r5 = r5.o()
                if (r5 == 0) goto L3b
                java.io.File r5 = new java.io.File
                kotlin.jvm.internal.Ref$ObjectRef<java.io.File> r6 = r4.b
                java.lang.Object r6 = r6.element
                java.io.File r6 = (java.io.File) r6
                java.lang.String r6 = r6.getPath()
                r5.<init>(r6)
                com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r6 = r4.a
                androidx.fragment.app.FragmentActivity r6 = r6.l()
                top.zibin.luban.c$b r6 = top.zibin.luban.c.k(r6)
                top.zibin.luban.c$b r6 = r6.f(r5)
                com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$a$a r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$a$a
                com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r1 = r4.a
                java.lang.String r2 = r4.c
                kotlin.jvm.functions.Function0<kotlin.n1> r3 = r4.d
                r0.<init>(r5, r1, r2, r3)
                top.zibin.luban.c$b r5 = r6.h(r0)
                r5.e()
                return
            L3b:
                com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r5 = r4.a
                androidx.fragment.app.FragmentActivity r5 = r5.l()
                java.lang.String r6 = "未找到存储卡，无法存储照片！"
                com.bxkj.base.v2.common.ext.ContextExtKt.t(r5, r6)
            L46:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 V3PassPoint2Observer.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3PassPoint2Observer\n*L\n1#1,328:1\n128#2:329\n*E\n"})
    public static final class b<T> implements java.util.Comparator {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "sort"
                int r3 = r0.k(r3, r1)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.Map r4 = (java.util.Map) r4
                int r4 = r0.k(r4, r1)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                int r3 = kotlin.comparisons.a.l(r3, r4)
                return r3
        }
    }

    public V3PassPoint2Observer(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.sports.SportsVM r3, @org.jetbrains.annotations.NotNull com.amap.api.maps.MapView r4) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mViewModel"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "mMapView"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            com.amap.api.maps.AMap r2 = r4.getMap()
            java.lang.String r3 = "getMap(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.d = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.g = r2
            r2 = 1
            r1.j = r2
            com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$mGeoFenceReceiver$1 r2 = new com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$mGeoFenceReceiver$1
            r2.<init>(r1)
            r1.f1493o = r2
            return
    }

    public static /* synthetic */ kotlin.n1 a(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0) {
            kotlin.n1 r0 = s(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0, java.lang.String r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3) {
            kotlin.n1 r0 = u(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0, kotlin.jvm.functions.Function0 r1) {
            kotlin.n1 r0 = w(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0) {
            kotlin.n1 r0 = r(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0, java.lang.String r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2, kotlin.jvm.functions.Function0 r3) {
            kotlin.n1 r0 = v(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ java.util.List f(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.g
            return r0
    }

    public static final /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r0) {
            r0.q()
            return
    }

    private final void h(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r12) {
            r11 = this;
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        Lb:
            boolean r1 = r12.hasNext()
            java.lang.String r2 = "id"
            r3 = 0
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r12.next()
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.util.List<com.amap.api.maps.model.Marker> r5 = r11.f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.amap.api.maps.model.Marker r7 = (com.amap.api.maps.model.Marker) r7
            com.bxkj.base.v2.common.utils.x r8 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r8 = r8.t(r4, r2)
            java.lang.Object r7 = r7.getObject()
            if (r7 == 0) goto L41
            java.lang.String r7 = r7.toString()
            goto L42
        L41:
            r7 = r3
        L42:
            boolean r7 = kotlin.jvm.internal.g0.g(r8, r7)
            if (r7 == 0) goto L23
            r3 = r6
        L49:
            if (r3 != 0) goto Lb
            r0.add(r1)
            goto Lb
        L4f:
            java.util.Iterator r12 = r0.iterator()
        L53:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L106
            java.lang.Object r1 = r12.next()
            java.util.Map r1 = (java.util.Map) r1
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "latitude"
            double r5 = r4.f(r1, r5)
            java.lang.String r7 = "longitude"
            double r7 = r4.f(r1, r7)
            com.amap.api.maps.model.LatLng r9 = new com.amap.api.maps.model.LatLng
            r9.<init>(r5, r7)
            boolean r5 = r11.h
            java.lang.String r6 = "sort"
            if (r5 == 0) goto L7d
            java.lang.String r5 = r4.t(r1, r6)
            goto L7f
        L7d:
            java.lang.String r5 = "经"
        L7f:
            boolean r7 = r11.h
            if (r7 == 0) goto L9e
            java.lang.String r6 = r4.t(r1, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "第"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "个"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto La0
        L9e:
            java.lang.String r6 = ""
        La0:
            com.bxkj.student.v2.common.utils.c$a r7 = com.bxkj.student.v2.common.utils.c.a
            android.graphics.Bitmap r5 = r7.b(r5)
            com.amap.api.maps.model.BitmapDescriptor r5 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r5)
            com.amap.api.maps.model.MarkerOptions r7 = new com.amap.api.maps.model.MarkerOptions
            r7.<init>()
            com.amap.api.maps.model.MarkerOptions r7 = r7.position(r9)
            com.amap.api.maps.model.MarkerOptions r5 = r7.icon(r5)
            r7 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r5 = r5.zIndex(r7)
            java.lang.String r7 = "content"
            java.lang.String r7 = r4.t(r1, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "你还未通过"
            r8.append(r10)
            r8.append(r6)
            java.lang.String r6 = "必经点："
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            com.amap.api.maps.model.MarkerOptions r5 = r5.title(r6)
            r6 = 0
            com.amap.api.maps.model.MarkerOptions r5 = r5.draggable(r6)
            com.amap.api.maps.AMap r6 = r11.d
            com.amap.api.maps.model.Marker r5 = r6.addMarker(r5)
            java.lang.String r1 = r4.t(r1, r2)
            r5.setObject(r1)
            java.util.List<com.amap.api.maps.model.Marker> r1 = r11.f
            kotlin.jvm.internal.g0.m(r5)
            r1.add(r5)
            com.amap.api.maps.model.LatLngBounds$Builder r1 = com.amap.api.maps.model.LatLngBounds.builder()
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r1.include(r9)
            r11.e = r1
            goto L53
        L106:
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L10e
            r12 = r11
            goto L10f
        L10e:
            r12 = r3
        L10f:
            if (r12 == 0) goto L15a
            com.amap.api.maps.AMap r12 = r11.d
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r11.e
            if (r0 == 0) goto L11c
            com.amap.api.maps.model.LatLngBounds r0 = r0.build()
            goto L11d
        L11c:
            r0 = r3
        L11d:
            r1 = 1092616192(0x41200000, float:10.0)
            androidx.fragment.app.FragmentActivity r2 = r11.a
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r0, r1)
            r1 = 2000(0x7d0, double:9.88E-321)
            r12.animateCamera(r0, r1, r3)
            android.content.IntentFilter r12 = new android.content.IntentFilter
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".run"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            androidx.fragment.app.FragmentActivity r0 = r11.a
            android.content.BroadcastReceiver r1 = r11.f1493o
            java.lang.String r2 = "com.bxkj.student.sports.permissions.V3_Sports_BROADCAST"
            r0.registerReceiver(r1, r12, r2, r3)
            r12 = 1
            r11.i = r12
        L15a:
            return
    }

    private final boolean k(java.util.Map<java.lang.String, ? extends java.lang.Object> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = "id"
            java.lang.String r2 = r2.t(r1, r3)
            com.bxkj.student.v2.common.data.i$a r4 = com.bxkj.student.v2.common.data.i.a
            java.util.List r4 = r4.x()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r4.next()
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            com.bxkj.base.v2.common.utils.x r8 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r7 = r8.t(r7, r3)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r2)
            if (r7 == 0) goto L18
            goto L33
        L32:
            r5 = 0
        L33:
            java.util.Map r5 = (java.util.Map) r5
            r4 = 0
            if (r5 == 0) goto L39
            return r4
        L39:
            boolean r5 = r0.h
            r7 = 1
            java.lang.String r8 = "sort"
            if (r5 == 0) goto L72
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            int r5 = r5.k(r1, r8)
            com.bxkj.student.v2.common.data.i$a r9 = com.bxkj.student.v2.common.data.i.a
            java.util.List r9 = r9.x()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L52:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6a
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.util.Map r11 = (java.util.Map) r11
            com.bxkj.base.v2.common.utils.x r12 = com.bxkj.base.v2.common.utils.x.a
            int r11 = r12.k(r11, r8)
            int r12 = r5 + (-1)
            if (r11 != r12) goto L52
            goto L6b
        L6a:
            r10 = 0
        L6b:
            java.util.Map r10 = (java.util.Map) r10
            if (r5 <= r7) goto L72
            if (r10 != 0) goto L72
            return r4
        L72:
            java.util.List<com.amap.api.maps.model.Marker> r5 = r0.f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L7a:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r5.next()
            r10 = r9
            com.amap.api.maps.model.Marker r10 = (com.amap.api.maps.model.Marker) r10
            java.lang.Object r10 = r10.getObject()
            if (r10 == 0) goto L92
            java.lang.String r10 = r10.toString()
            goto L93
        L92:
            r10 = 0
        L93:
            boolean r10 = kotlin.jvm.internal.g0.g(r2, r10)
            if (r10 == 0) goto L7a
            goto L9b
        L9a:
            r9 = 0
        L9b:
            com.amap.api.maps.model.Marker r9 = (com.amap.api.maps.model.Marker) r9
            if (r9 == 0) goto L1bb
            java.util.List<com.amap.api.maps.model.Marker> r5 = r0.f
            r5.remove(r9)
            r9.setVisible(r4)
            r9.remove()
            r9.destroy()
            com.amap.api.maps.MapView r5 = r0.c
            r5.postInvalidate()
            boolean r5 = r0.h
            if (r5 == 0) goto Lbd
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = r5.t(r1, r8)
            goto Lbf
        Lbd:
            java.lang.String r5 = "√"
        Lbf:
            boolean r9 = r0.h
            if (r9 == 0) goto Le0
            com.bxkj.base.v2.common.utils.x r9 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r9 = r9.t(r1, r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "第"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = "个"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto Le2
        Le0:
            java.lang.String r9 = ""
        Le2:
            com.bxkj.student.v2.common.utils.c$a r10 = com.bxkj.student.v2.common.utils.c.a
            android.graphics.Bitmap r5 = r10.c(r5)
            com.amap.api.maps.model.BitmapDescriptor r5 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r5)
            com.bxkj.base.v2.common.utils.x r10 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r11 = "latitude"
            double r12 = r10.f(r1, r11)
            java.lang.String r14 = "longitude"
            double r6 = r10.f(r1, r14)
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r0 = java.util.Locale.CHINA
            r15.<init>(r4, r0)
            java.lang.String r0 = "content"
            java.lang.String r4 = r10.t(r1, r0)
            java.lang.String r1 = r10.t(r1, r8)
            com.amap.api.maps.model.MarkerOptions r10 = new com.amap.api.maps.model.MarkerOptions
            r10.<init>()
            r18 = r1
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            r1.<init>(r12, r6)
            com.amap.api.maps.model.MarkerOptions r1 = r10.position(r1)
            com.amap.api.maps.model.MarkerOptions r1 = r1.icon(r5)
            r5 = 1092616192(0x41200000, float:10.0)
            com.amap.api.maps.model.MarkerOptions r1 = r1.zIndex(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "你已经通过"
            r5.append(r10)
            r5.append(r9)
            java.lang.String r9 = "必经点:"
            r5.append(r9)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.amap.api.maps.model.MarkerOptions r1 = r1.title(r5)
            r5 = 0
            com.amap.api.maps.model.MarkerOptions r1 = r1.draggable(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r5.put(r3, r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r2 = r15.format(r2)
            java.lang.String r3 = "time"
            r5.put(r3, r2)
            r5.put(r0, r4)
            java.lang.Double r0 = java.lang.Double.valueOf(r12)
            r5.put(r11, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            r5.put(r14, r0)
            r0 = r18
            r5.put(r8, r0)
            java.lang.String r0 = r1.getTitle()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r0, r3)
            r0 = r17
            com.amap.api.maps.AMap r3 = r0.d
            r3.addMarker(r1)
            com.bxkj.student.run.app.utils.d0 r3 = com.bxkj.student.run.app.utils.d0.e()
            androidx.fragment.app.FragmentActivity r4 = r0.a
            r6 = 2131886170(0x7f12005a, float:1.9406911E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            java.lang.Integer[] r8 = new java.lang.Integer[r7]
            r8[r2] = r6
            java.util.List r6 = kotlin.collections.f0.U(r8)
            r3.l(r4, r6)
            com.bxkj.student.v2.common.data.i$a r3 = com.bxkj.student.v2.common.data.i.a
            java.util.List r3 = r3.x()
            r3.add(r5)
            androidx.fragment.app.FragmentActivity r3 = r0.a
            java.lang.String r1 = r1.getTitle()
            java.lang.String r4 = "getTitle(...)"
            kotlin.jvm.internal.g0.o(r1, r4)
            r4 = 2
            r15 = 0
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r3, r1, r2, r4, r15)
            r16 = 1
            return r16
        L1bb:
            r2 = 0
            return r2
    }

    private final void p() {
            r12 = this;
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            java.util.List r1 = r0.x()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "恢复已经过的必经点"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r1, r3)
            java.util.List r0 = r0.x()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf5
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            boolean r3 = r12.h
            java.lang.String r4 = "sort"
            if (r3 == 0) goto L40
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = r3.t(r1, r4)
            goto L42
        L40:
            java.lang.String r3 = "√"
        L42:
            boolean r5 = r12.h
            if (r5 == 0) goto L63
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r4 = r5.t(r1, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "第"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "个"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L65
        L63:
            java.lang.String r4 = ""
        L65:
            com.bxkj.student.v2.common.utils.c$a r5 = com.bxkj.student.v2.common.utils.c.a
            android.graphics.Bitmap r3 = r5.c(r3)
            com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r3)
            com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r6 = "latitude"
            double r6 = r5.f(r1, r6)
            java.lang.String r8 = "longitude"
            double r8 = r5.f(r1, r8)
            com.amap.api.maps.model.MarkerOptions r10 = new com.amap.api.maps.model.MarkerOptions
            r10.<init>()
            com.amap.api.maps.model.LatLng r11 = new com.amap.api.maps.model.LatLng
            r11.<init>(r6, r8)
            com.amap.api.maps.model.MarkerOptions r6 = r10.position(r11)
            com.amap.api.maps.model.MarkerOptions r3 = r6.icon(r3)
            r6 = 1092616192(0x41200000, float:10.0)
            com.amap.api.maps.model.MarkerOptions r3 = r3.zIndex(r6)
            java.lang.String r6 = "content"
            java.lang.String r5 = r5.t(r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "你已经通过"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = "必经点:"
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            com.amap.api.maps.model.MarkerOptions r3 = r3.title(r4)
            com.amap.api.maps.model.MarkerOptions r3 = r3.draggable(r2)
            com.amap.api.maps.AMap r4 = r12.d
            r4.addMarker(r3)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r12.g
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        Lc9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le9
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r7 = "id"
            java.lang.String r5 = r6.t(r5, r7)
            java.lang.String r6 = r6.t(r1, r7)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r5 == 0) goto Lc9
            goto Lea
        Le9:
            r4 = 0
        Lea:
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L27
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r12.g
            r1.remove(r4)
            goto L27
        Lf5:
            return
    }

    private final void q() {
            r8 = this;
            boolean r0 = r8.f1491m
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r8.j
            r1 = 2
            r2 = 0
            if (r0 != r1) goto Ld
            r0 = r8
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto Lb9
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.g
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto Lb9
            int r1 = r8.f1492n
            com.bxkj.student.v2.common.data.i$a r3 = com.bxkj.student.v2.common.data.i.a
            java.util.List r4 = r3.x()
            int r4 = r4.size()
            if (r1 >= r4) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 == 0) goto Lb9
            double r4 = r3.g()
            double r6 = r8.f1490l
            double r4 = r4 - r6
            double r6 = r8.k
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto Lb9
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.vm.sports.SportsVM r1 = r8.b
            java.util.Map r1 = r1.M()
            java.lang.String r4 = "runType"
            int r1 = r0.k(r1, r4)
            r4 = 6
            r5 = 1
            if (r1 != r4) goto L75
            boolean r1 = r8.f1491m
            if (r1 != 0) goto L58
            r2 = r8
        L58:
            if (r2 == 0) goto L74
            r8.f1491m = r5
            com.bxkj.student.v2.ui.sports.v3.dxyy.n r1 = new com.bxkj.student.v2.ui.sports.v3.dxyy.n
            androidx.fragment.app.FragmentActivity r2 = r8.a
            com.bxkj.student.v2.vm.sports.SportsVM r3 = r8.b
            java.util.Map r3 = r3.M()
            java.lang.String r4 = "pointPass"
            int r0 = r0.k(r3, r4)
            com.bxkj.student.v2.ui.sports.v3.service.o r3 = new com.bxkj.student.v2.ui.sports.v3.service.o
            r3.<init>(r8)
            r1.<init>(r2, r0, r3)
        L74:
            return
        L75:
            com.bxkj.student.v2.vm.sports.SportsVM r1 = r8.b
            java.util.Map r1 = r1.M()
            java.lang.String r4 = "takePicture"
            java.lang.String r1 = r0.t(r1, r4)
            java.lang.String r4 = "1"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r1 == 0) goto Lad
            boolean r1 = r8.f1491m
            if (r1 != 0) goto L8e
            r2 = r8
        L8e:
            if (r2 == 0) goto Lac
            r8.f1491m = r5
            java.util.List r1 = r3.x()
            java.lang.Object r1 = kotlin.collections.f0.u3(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "content"
            java.lang.String r0 = r0.t(r1, r2)
            com.bxkj.student.v2.ui.sports.v3.service.p r1 = new com.bxkj.student.v2.ui.sports.v3.service.p
            r1.<init>(r8)
            r8.t(r0, r1)
            kotlin.n1 r0 = kotlin.n1.a
        Lac:
            return
        Lad:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.g
            r1 = 0
            java.util.List r0 = r0.subList(r1, r5)
            r8.h(r0)
            kotlin.n1 r0 = kotlin.n1.a
        Lb9:
            return
    }

    private static final kotlin.n1 r(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "已完成定向越野任务，请继续前往下一个点"
            com.orhanobut.logger.j.d(r2, r1)
            int r1 = r6.f1492n
            r2 = 1
            int r1 = r1 + r2
            r6.f1492n = r1
            androidx.fragment.app.FragmentActivity r1 = r6.a
            r3 = 2
            r4 = 0
            java.lang.String r5 = "请继续前往下一个点"
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r1, r5, r0, r3, r4)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.g
            java.util.List r1 = r1.subList(r0, r2)
            r6.h(r1)
            r6.f1491m = r0
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    private static final kotlin.n1 s(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r6) {
            r0 = 0
            r6.f1491m = r0
            int r1 = r6.f1492n
            r2 = 1
            int r1 = r1 + r2
            r6.f1492n = r1
            androidx.fragment.app.FragmentActivity r1 = r6.a
            r3 = 2
            r4 = 0
            java.lang.String r5 = "打卡识别拍照图片已上传成功！请继续前往下一个点"
            com.bxkj.base.v2.common.ext.ContextExtKt.s(r1, r5, r0, r3, r4)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.g
            java.util.List r0 = r1.subList(r0, r2)
            r6.h(r0)
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    private final void t(java.lang.String r3, kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.a
            com.bxkj.student.v2.ui.sports.v3.service.q r1 = new com.bxkj.student.v2.ui.sports.v3.service.q
            r1.<init>(r2, r3, r4)
            java.lang.String r3 = "您已经过打卡点请拍照"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r3, r1)
            r4 = 0
            r3.setCanceledOnTouchOutside(r4)
            r3.setCancelable(r4)
            r3.setClickAutoCancel(r4)
            return
    }

    private static final kotlin.n1 u(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r2, java.lang.String r3, kotlin.jvm.functions.Function0 r4, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.fragment.app.FragmentActivity r0 = r2.a
            com.bxkj.student.v2.ui.sports.v3.service.r r1 = new com.bxkj.student.v2.ui.sports.v3.service.r
            r1.<init>(r2, r3, r5, r4)
            java.lang.String r2 = "打卡点请拍照"
            com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 v(com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer r1, java.lang.String r2, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3, kotlin.jvm.functions.Function0 r4) {
            com.bxkj.student.v2.ui.sports.v3.service.n r0 = new com.bxkj.student.v2.ui.sports.v3.service.n
            r0.<init>(r3, r4)
            r1.i(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 w(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0, kotlin.jvm.functions.Function0 r1) {
            r0.dismiss()
            r1.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public final void i(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r8) {
            r6 = this;
            java.lang.String r0 = "remark"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "next"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r6.o()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 == 0) goto L24
            androidx.fragment.app.FragmentActivity r0 = r6.a
            java.io.File r0 = r0.getExternalCacheDir()
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L29
            r2 = r6
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L32
            androidx.fragment.app.FragmentActivity r0 = r6.a
            java.io.File r0 = r0.getCacheDir()
        L32:
            if (r0 == 0) goto L40
            boolean r2 = r0.exists()
            if (r2 != 0) goto L3b
            r1 = r0
        L3b:
            if (r1 == 0) goto L40
            r1.mkdirs()
        L40:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "avatar"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L50
            r1.mkdirs()
        L50:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.io.File r2 = new java.io.File
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "_temp_photo.jpg"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r1, r3)
            r0.element = r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r1 >= r3) goto L7f
            android.net.Uri r1 = android.net.Uri.fromFile(r2)
            kotlin.jvm.internal.g0.m(r1)
            goto L8a
        L7f:
            androidx.fragment.app.FragmentActivity r1 = r6.a
            java.lang.String r3 = "com.bxkj.student.provider"
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r1, r3, r2)
            kotlin.jvm.internal.g0.m(r1)
        L8a:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "output"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r2.setAction(r1)
            r1 = 1
            r2.addFlags(r1)
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r2.addCategory(r1)
            t.b r1 = new t.b
            androidx.fragment.app.FragmentActivity r3 = r6.a
            r1.<init>(r3)
            t.b r1 = r1.startActivityForResult(r2)
            com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$a r2 = new com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$a
            r2.<init>(r6, r0, r7, r8)
            r1.c(r2)
            return
        Lb6:
            androidx.fragment.app.FragmentActivity r7 = r6.a
            java.lang.String r8 = "未找到存储卡，无法拍照！"
            r0 = 0
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r0)
            r7.show()
            return
    }

    public final void j(@org.jetbrains.annotations.Nullable com.amap.api.maps.model.LatLng r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r9.g
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = "okRadius"
            float r3 = r2.i(r1, r3)
            java.lang.String r4 = "latitude"
            double r4 = r2.f(r1, r4)
            java.lang.String r6 = "longitude"
            double r6 = r2.f(r1, r6)
            java.lang.String r8 = "content"
            r2.t(r1, r8)
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            r2.<init>(r4, r6)
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r10)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L10
            boolean r2 = r9.k(r1)
            if (r2 == 0) goto L10
            com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a
            double r2 = r2.g()
            r9.f1490l = r2
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r9.g
            r2.remove(r1)
            r9.q()
            goto L10
        L59:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentActivity l() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.amap.api.maps.MapView m() {
            r1 = this;
            com.amap.api.maps.MapView r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.vm.sports.SportsVM n() {
            r1 = this;
            com.bxkj.student.v2.vm.sports.SportsVM r0 = r1.b
            return r0
    }

    public final boolean o() {
            r2 = this;
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
            r11 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.vm.sports.SportsVM r1 = r11.b
            java.util.Map r1 = r1.M()
            java.lang.String r2 = "list"
            java.util.List r1 = r0.n(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.f0.d6(r1)
            r11.g = r1
            com.bxkj.student.v2.vm.sports.SportsVM r1 = r11.b
            java.util.Map r1 = r1.M()
            java.lang.String r2 = "isSequencePoint"
            java.lang.String r1 = r0.t(r1, r2)
            java.lang.String r2 = "1"
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            r11.h = r1
            com.bxkj.student.v2.vm.sports.SportsVM r1 = r11.b
            java.util.Map r1 = r1.M()
            java.lang.String r2 = "pointShowMode"
            r3 = 1
            int r1 = r0.l(r1, r2, r3)
            r11.j = r1
            com.bxkj.student.v2.vm.sports.SportsVM r1 = r11.b
            java.util.Map r1 = r1.M()
            java.lang.String r2 = "pointShowDistance"
            double r0 = r0.f(r1, r2)
            r11.k = r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.g
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L54
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 == 0) goto Ld7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La2
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            com.bxkj.student.v2.common.data.i$a r6 = com.bxkj.student.v2.common.data.i.a
            java.util.List r6 = r6.x()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L7b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.util.Map r8 = (java.util.Map) r8
            com.bxkj.base.v2.common.utils.x r9 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r10 = "id"
            java.lang.String r8 = r9.t(r8, r10)
            java.lang.String r9 = r9.t(r5, r10)
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r9)
            if (r8 == 0) goto L7b
            goto L9c
        L9b:
            r7 = r2
        L9c:
            if (r7 != 0) goto L62
            r1.add(r4)
            goto L62
        La2:
            java.util.List r0 = kotlin.collections.f0.d6(r1)
            r11.g = r0
            int r1 = r0.size()
            if (r1 <= r3) goto Lb6
            com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$b r1 = new com.bxkj.student.v2.ui.sports.v3.service.V3PassPoint2Observer$b
            r1.<init>()
            kotlin.collections.f0.r0(r0, r1)
        Lb6:
            r11.p()
            int r0 = r11.j
            if (r0 != r3) goto Lc3
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.g
            r11.h(r0)
            return
        Lc3:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.g
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld7
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.g
            r1 = 0
            java.util.List r0 = r0.subList(r1, r3)
            r11.h(r0)
        Ld7:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
            r2 = this;
            android.content.BroadcastReceiver r0 = r2.f1493o
            boolean r1 = r2.i
            if (r1 == 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L12
            r1 = 0
            r2.i = r1
            androidx.fragment.app.FragmentActivity r1 = r2.a
            r1.unregisterReceiver(r0)
        L12:
            return
    }
}

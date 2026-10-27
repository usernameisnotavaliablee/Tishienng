package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3MapObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3MapObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3MapObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,482:1\n1#2:483\n1869#3,2:484\n1869#3,2:486\n*S KotlinDebug\n*F\n+ 1 V3MapObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3MapObserver\n*L\n237#1:484,2\n462#1:486,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3MapObserver implements androidx.lifecycle.LifecycleObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity a;

    @org.jetbrains.annotations.NotNull
    private com.bxkj.student.v2.vm.sports.SportsVM b;

    @org.jetbrains.annotations.NotNull
    private final com.amap.api.maps.AMap c;

    @org.jetbrains.annotations.NotNull
    private final android.content.Context d;

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentManager e;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.LatLngBounds.Builder f;
    private long g;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.LatLng h;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.LatLng i;

    @org.jetbrains.annotations.Nullable
    private java.util.List<java.lang.Double> j;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.common.utils.f k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private android.content.BroadcastReceiver f1485l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.LocationSource f1486m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.LocationSource.OnLocationChangedListener f1487n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog f1488o;

    /* renamed from: p, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.dialog.FaceOutDialog f1489p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$faceCheckOutDialog$3", f = "V3MapObserver.kt", i = {}, l = {442, 445}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ int c;

        a(java.lang.String r1, int r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.a> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$a r3 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$a
                java.lang.String r0 = r2.b
                int r1 = r2.c
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$a r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.g0.n(r6)
                goto L63
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.g0.n(r6)
                goto L46
            L1e:
                kotlin.g0.n(r6)
                com.bxkj.student.v2.common.db.AppDatabase$a r6 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r6 = r6.a()
                com.bxkj.student.v2.common.db.dao.y r6 = r6.z()
                if (r6 == 0) goto L46
                com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
                androidx.lifecycle.MutableLiveData r1 = r1.k()
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r4 = r5.b
                r5.a = r3
                java.lang.Object r6 = r6.e(r1, r4, r5)
                if (r6 != r0) goto L46
                goto L62
            L46:
                com.bxkj.student.v2.common.db.AppDatabase$a r6 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r6 = r6.a()
                com.bxkj.student.v2.common.db.dao.y r6 = r6.z()
                if (r6 == 0) goto L63
                java.lang.String r1 = r5.b
                int r3 = r5.c
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r5.a = r2
                java.lang.Object r6 = r6.r(r1, r3, r5)
                if (r6 != r0) goto L63
            L62:
                return r0
            L63:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements com.amap.api.maps.LocationSource {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver a;

        b(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void activate(com.amap.api.maps.LocationSource.OnLocationChangedListener r2) {
                r1 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0 = r1.a
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.t(r0, r2)
                return
        }

        public void deactivate() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$showFaceDetectDialog$1$1", f = "V3MapObserver.kt", i = {0, 1, 1, 1, 1, 1}, l = {326, 336}, m = "invokeSuspend", n = {"identity", "identity", "faceOutIndex", "faceOutIndexList", "currentFaceOutIndex", "hasBeforeFaceOut"}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "Z$0"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        boolean e;
        int f;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver g;
        final /* synthetic */ int h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$showFaceDetectDialog$1$1$1", f = "V3MapObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver b;
            final /* synthetic */ int c;
            final /* synthetic */ boolean d;

            a(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r1, int r2, boolean r3, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.c.a> r4) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                    r3 = this;
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c$a r4 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c$a
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0 = r3.b
                    int r1 = r3.c
                    boolean r2 = r3.d
                    r4.<init>(r0, r1, r2, r5)
                    return r4
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c$a r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.c.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    r3 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r3.a
                    if (r0 != 0) goto L40
                    kotlin.g0.n(r4)
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r4 = r3.b
                    com.amap.api.maps.model.LatLng r4 = com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.k(r4)
                    com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
                    com.amap.api.maps.model.LatLng r0 = r0.z()
                    float r4 = com.amap.api.maps.AMapUtils.calculateLineDistance(r4, r0)
                    int r0 = r3.c
                    float r1 = (float) r0
                    r2 = 0
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 > 0) goto L2d
                    boolean r4 = r3.d
                    if (r4 == 0) goto L27
                    goto L2d
                L27:
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r4 = r3.b
                    r4.I(r0, r2)
                    goto L3d
                L2d:
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r4 = r3.b
                    r4.w(r2)
                    com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r4 = r3.b
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.m(r4)
                    if (r4 == 0) goto L3d
                    r4.dismiss()
                L3d:
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
                L40:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
            }
        }

        c(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r1, int r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.c> r3) {
                r0 = this;
                r0.g = r1
                r0.h = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c r3 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0 = r2.g
                int r1 = r2.h
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r0 = r11.c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r11.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.g0.n(r12)
                goto Ld4
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L27:
                java.lang.Object r1 = r11.a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.g0.n(r12)
                goto L60
            L2f:
                kotlin.g0.n(r12)
                com.bxkj.base.v2.common.utils.x r12 = com.bxkj.base.v2.common.utils.x.a
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r1 = r11.g
                com.bxkj.student.v2.vm.sports.SportsVM r1 = r1.G()
                java.util.Map r1 = r1.M()
                java.lang.String r4 = "identify"
                java.lang.String r1 = r12.t(r1, r4)
                com.bxkj.student.v2.common.db.AppDatabase$a r12 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r12 = r12.a()
                com.bxkj.student.v2.common.db.dao.y r12 = r12.z()
                if (r12 == 0) goto L67
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r1)
                r11.a = r4
                r11.f = r3
                java.lang.Object r12 = r12.m(r1, r11)
                if (r12 != r0) goto L60
                goto Ld3
            L60:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 != 0) goto L65
                goto L67
            L65:
                r4 = r12
                goto L6a
            L67:
                java.lang.String r12 = ""
                goto L65
            L6a:
                int r12 = r4.length()
                if (r12 != 0) goto L76
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                goto L8a
            L76:
                java.lang.String r12 = "、"
                java.lang.String[] r5 = new java.lang.String[]{r12}
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                java.util.List r12 = kotlin.text.u.m5(r4, r5, r6, r7, r8, r9)
                java.util.Collection r12 = (java.util.Collection) r12
                java.util.List r12 = kotlin.collections.f0.d6(r12)
            L8a:
                com.bxkj.student.v2.common.data.i$a r5 = com.bxkj.student.v2.common.data.i.a
                androidx.lifecycle.MutableLiveData r5 = r5.j()
                java.lang.Object r5 = r5.getValue()
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L9d
                int r5 = r5.intValue()
                goto L9e
            L9d:
                r5 = 0
            L9e:
                int r5 = r5 + r3
                java.lang.String r3 = java.lang.String.valueOf(r5)
                boolean r3 = r12.contains(r3)
                kotlinx.coroutines.p2 r6 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c$a r7 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c$a
                com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r8 = r11.g
                int r9 = r11.h
                r10 = 0
                r7.<init>(r8, r9, r3, r10)
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r1)
                r11.a = r1
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r4)
                r11.b = r1
                java.lang.Object r12 = kotlin.coroutines.jvm.internal.j.a(r12)
                r11.c = r12
                r11.d = r5
                r11.e = r3
                r11.f = r2
                java.lang.Object r12 = kotlinx.coroutines.i.h(r6, r7, r11)
                if (r12 != r0) goto Ld4
            Ld3:
                return r0
            Ld4:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    public V3MapObserver(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.sports.SportsVM r3, @org.jetbrains.annotations.NotNull com.amap.api.maps.AMap r4) {
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
            r1.d = r2
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            java.lang.String r3 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.e = r2
            return
    }

    private static final kotlin.n1 A(androidx.fragment.app.DialogFragment r0) {
            r0.dismissAllowingStateLoss()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 B(boolean r4, com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r5, androidx.fragment.app.DialogFragment r6) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r6, r0)
            if (r4 == 0) goto L14
            r6.dismiss()
            com.bxkj.student.v2.common.data.i$a r4 = com.bxkj.student.v2.common.data.i.a
            r5 = 0
            r4.a0(r5)
            r4.w0(r5)
            goto L2c
        L14:
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.vm.sports.SportsVM r6 = r5.b
            java.util.Map r6 = r6.M()
            java.lang.String r0 = "faceDistanceOut"
            double r0 = r4.f(r6, r0)
            r4 = 1000(0x3e8, float:1.401E-42)
            double r2 = (double) r4
            double r0 = r0 * r2
            int r4 = (int) r0
            r6 = 1
            r5.I(r4, r6)
        L2c:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    public static /* synthetic */ void J(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, int r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.I(r1, r2)
            return
    }

    private static final kotlin.n1 K(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r5, int r6, boolean r7) {
            com.amap.api.maps.model.LatLng r0 = r5.h
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            com.amap.api.maps.model.LatLng r2 = r1.z()
            float r0 = com.amap.api.maps.AMapUtils.calculateLineDistance(r0, r2)
            float r6 = (float) r6
            r2 = 1
            r3 = 0
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L31
            if (r7 != 0) goto L31
            com.bxkj.student.run.app.utils.d0 r6 = com.bxkj.student.run.app.utils.d0.e()
            android.content.Context r7 = r5.d
            r0 = 2131886092(0x7f12000c, float:1.9406753E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r4 = new java.lang.Integer[r2]
            r4[r3] = r0
            java.util.List r0 = kotlin.collections.f0.U(r4)
            r6.l(r7, r0)
            r5.w(r2)
            goto L56
        L31:
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r6 = r5.f1489p
            if (r6 == 0) goto L38
            r6.dismiss()
        L38:
            com.bxkj.student.run.app.utils.d0 r6 = com.bxkj.student.run.app.utils.d0.e()
            android.content.Context r7 = r5.d
            r0 = 2131886093(0x7f12000d, float:1.9406755E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r4 = new java.lang.Integer[r2]
            r4[r3] = r0
            java.util.List r0 = kotlin.collections.f0.U(r4)
            r6.l(r7, r0)
            r1.a0(r3)
            r1.w0(r3)
        L56:
            androidx.lifecycle.MutableLiveData r6 = r1.j()
            androidx.lifecycle.MutableLiveData r7 = r1.j()
            java.lang.Object r7 = r7.getValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L6a
            int r3 = r7.intValue()
        L6a:
            int r3 = r3 + r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.setValue(r7)
            r6 = 0
            r1.Z(r6)
            r6 = 0
            r1.p0(r6)
            com.bxkj.base.v2.common.utils.h0 r6 = new com.bxkj.base.v2.common.utils.h0
            androidx.fragment.app.FragmentActivity r7 = r5.a
            r6.<init>(r7)
            r6.c()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r5.f1488o
            if (r5 == 0) goto L8c
            r5.dismiss()
        L8c:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private final void L() {
            r3 = this;
            com.amap.api.maps.AMap r0 = r3.c
            java.util.List r0 = r0.getMapScreenMarkers()
            java.lang.String r1 = "getMapScreenMarkers(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.model.Marker r1 = (com.amap.api.maps.model.Marker) r1
            if (r1 == 0) goto L11
            boolean r2 = r1.isInfoWindowShown()
            if (r2 == 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L11
            r1.hideInfoWindow()
            goto L11
        L2d:
            return
    }

    private final void M(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            r0 = 2131689681(0x7f0f00d1, float:1.9008384E38)
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r0)
            com.amap.api.maps.model.MarkerOptions r1 = new com.amap.api.maps.model.MarkerOptions
            r1.<init>()
            com.amap.api.maps.model.MarkerOptions r3 = r1.position(r3)
            com.amap.api.maps.model.MarkerOptions r3 = r3.icon(r0)
            r0 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r3 = r3.zIndex(r0)
            r0 = 1
            com.amap.api.maps.model.MarkerOptions r3 = r3.draggable(r0)
            com.amap.api.maps.AMap r0 = r2.c
            r0.addMarker(r3)
            return
    }

    private static final void N(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r2, android.view.MotionEvent r3) {
            long r0 = java.lang.System.currentTimeMillis()
            r2.g = r0
            return
    }

    private static final void O(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, com.amap.api.maps.model.LatLng r1) {
            r0.L()
            return
    }

    private final void R(java.lang.String r9, int r10) {
            r8 = this;
            com.bxkj.base.v2.common.utils.h0 r0 = new com.bxkj.base.v2.common.utils.h0
            androidx.fragment.app.FragmentActivity r1 = r8.a
            r0.<init>(r1)
            r0.b()
            com.bxkj.student.v2.ui.sports.v3.service.m$a r2 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            android.content.Context r3 = r8.d
            r6 = 4
            r7 = 0
            r5 = 0
            r4 = r9
            com.bxkj.student.v2.ui.sports.v3.service.m.a.h(r2, r3, r4, r5, r6, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r0 = "\n请注意周边环境是否安全！"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r8.f1488o
            if (r0 == 0) goto L2d
            r0.dismiss()
        L2d:
            androidx.fragment.app.FragmentActivity r0 = r8.a
            com.bxkj.student.v2.ui.sports.v3.service.j r1 = new com.bxkj.student.v2.ui.sports.v3.service.j
            r1.<init>(r8, r10)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9 = com.bxkj.base.v2.common.ext.ContextExtKt.o(r0, r9, r1)
            r10 = 0
            r9.setClickAutoCancel(r10)
            r9.setCancelable(r10)
            r9.setCanceledOnTouchOutside(r10)
            r8.f1488o = r9
            return
    }

    private static final kotlin.n1 S(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r6, int r7, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r8) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r8, r0)
            com.bxkj.base.v2.common.utils.h0 r8 = new com.bxkj.base.v2.common.utils.h0
            androidx.fragment.app.FragmentActivity r0 = r6.a
            r8.<init>(r0)
            r8.c()
            com.bxkj.student.v2.vm.sports.SportsVM r8 = r6.b
            kotlinx.coroutines.r0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c r3 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$c
            r8 = 0
            r3.<init>(r6, r7, r8)
            r4 = 2
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    public static /* synthetic */ void a(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, android.view.MotionEvent r1) {
            N(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.n1 b(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, boolean r1, androidx.fragment.app.DialogFragment r2) {
            kotlin.n1 r0 = y(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(androidx.fragment.app.DialogFragment r0) {
            kotlin.n1 r0 = A(r0)
            return r0
    }

    public static /* synthetic */ void d(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, com.amap.api.maps.model.LatLng r1) {
            O(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.n1 e(boolean r0, com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r1, androidx.fragment.app.DialogFragment r2) {
            kotlin.n1 r0 = B(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, int r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = S(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(boolean r0) {
            kotlin.n1 r0 = z(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, int r1, boolean r2) {
            kotlin.n1 r0 = K(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ void i(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, com.amap.api.maps.model.LatLng r1) {
            r0.u(r1)
            return
    }

    public static final /* synthetic */ void j(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, double r1, com.amap.api.maps.model.LatLng r3) {
            r0.v(r1, r3)
            return
    }

    public static final /* synthetic */ com.amap.api.maps.model.LatLng k(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            com.amap.api.maps.model.LatLng r0 = r0.h
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.utils.f l(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            com.bxkj.student.v2.common.utils.f r0 = r0.k
            return r0
    }

    public static final /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog m(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.f1488o
            return r0
    }

    public static final /* synthetic */ com.amap.api.maps.model.LatLng n(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            com.amap.api.maps.model.LatLng r0 = r0.i
            return r0
    }

    public static final /* synthetic */ com.amap.api.maps.model.LatLngBounds.Builder o(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.f
            return r0
    }

    public static final /* synthetic */ com.amap.api.maps.LocationSource.OnLocationChangedListener p(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            com.amap.api.maps.LocationSource$OnLocationChangedListener r0 = r0.f1487n
            return r0
    }

    public static final /* synthetic */ void q(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0) {
            r0.L()
            return
    }

    public static final /* synthetic */ void r(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, com.amap.api.maps.model.LatLng r1) {
            r0.h = r1
            return
    }

    public static final /* synthetic */ void s(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, com.amap.api.maps.model.LatLng r1) {
            r0.i = r1
            return
    }

    public static final /* synthetic */ void t(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, com.amap.api.maps.LocationSource.OnLocationChangedListener r1) {
            r0.f1487n = r1
            return
    }

    private final void u(com.amap.api.maps.model.LatLng r9) {
            r8 = this;
            r8.M(r9)
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r8.f
            if (r0 == 0) goto La
            r0.include(r9)
        La:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            java.util.List r0 = r0.s()
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            boolean r0 = r9.isEmpty()
            r1 = 0
            if (r0 != 0) goto L23
            r0 = r9
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L91
            int r0 = kotlin.collections.f0.L(r9)
            java.lang.Object r0 = r9.get(r0)
            com.bxkj.student.v2.common.data.PointData r0 = (com.bxkj.student.v2.common.data.PointData) r0
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            double r3 = r0.getA()
            double r5 = r0.getO()
            r2.<init>(r3, r5)
            r8.i = r2
            com.bxkj.student.v2.common.utils.f r0 = r8.k     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L4f
            r0.a(r9)     // Catch: java.lang.Exception -> L47
            goto L4f
        L47:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.orhanobut.logger.j.c(r0)
        L4f:
            java.util.Iterator r9 = r9.iterator()
        L53:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r9.next()
            com.bxkj.student.v2.common.data.PointData r0 = (com.bxkj.student.v2.common.data.PointData) r0
            com.amap.api.maps.model.LatLngBounds$Builder r2 = r8.f
            if (r2 == 0) goto L53
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            double r4 = r0.getA()
            double r6 = r0.getO()
            r3.<init>(r4, r6)
            r2.include(r3)
            goto L53
        L74:
            com.amap.api.maps.AMap r9 = r8.c
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r8.f
            if (r0 == 0) goto L7f
            com.amap.api.maps.model.LatLngBounds r0 = r0.build()
            goto L80
        L7f:
            r0 = r1
        L80:
            r2 = 1112014848(0x42480000, float:50.0)
            android.content.Context r3 = r8.d
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r0, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r9.animateCamera(r0, r2, r1)
        L91:
            return
    }

    private final void v(double r13, com.amap.api.maps.model.LatLng r15) {
            r12 = this;
            r0 = 2131886091(0x7f12000b, float:1.9406751E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            androidx.lifecycle.MutableLiveData r2 = r1.j()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 0
            if (r2 == 0) goto L1b
            int r2 = r2.intValue()
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.util.List<java.lang.Double> r4 = r12.j
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L14e
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2a
            goto L14e
        L2a:
            java.util.List<java.lang.Double> r4 = r12.j
            if (r4 == 0) goto L14e
            int r5 = r4.size()
            if (r2 < r5) goto L36
            goto L14e
        L36:
            java.lang.Object r2 = r4.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r4 = r2.doubleValue()
            r2 = 1000(0x3e8, float:1.401E-42)
            double r6 = (double) r2
            double r4 = r4 * r6
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 < 0) goto L14e
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver> r2 = com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver.class
            monitor-enter(r2)
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r4 = r12.f1489p     // Catch: java.lang.Throwable -> L63
            r5 = 1
            if (r4 == 0) goto L66
            boolean r4 = r4.isAdded()     // Catch: java.lang.Throwable -> L63
            if (r4 != r5) goto L66
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r4 = r12.f1489p     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L66
            boolean r4 = r4.isVisible()     // Catch: java.lang.Throwable -> L63
            if (r4 != r5) goto L66
            monitor-exit(r2)
            return
        L63:
            r13 = move-exception
            goto L14c
        L66:
            double r8 = r1.i()     // Catch: java.lang.Throwable -> L63
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto Lbc
            double r13 = r1.g()     // Catch: java.lang.Throwable -> L63
            r1.Z(r13)     // Catch: java.lang.Throwable -> L63
            r1.p0(r15)     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.run.app.utils.d0 r13 = com.bxkj.student.run.app.utils.d0.e()     // Catch: java.lang.Throwable -> L63
            android.content.Context r14 = r12.d     // Catch: java.lang.Throwable -> L63
            java.lang.Integer[] r15 = new java.lang.Integer[r5]     // Catch: java.lang.Throwable -> L63
            r15[r3] = r0     // Catch: java.lang.Throwable -> L63
            java.util.List r15 = kotlin.collections.f0.U(r15)     // Catch: java.lang.Throwable -> L63
            r13.l(r14, r15)     // Catch: java.lang.Throwable -> L63
            com.bxkj.base.v2.common.utils.x r13 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.v2.vm.sports.SportsVM r14 = r12.b     // Catch: java.lang.Throwable -> L63
            java.util.Map r14 = r14.M()     // Catch: java.lang.Throwable -> L63
            java.lang.String r15 = "faceDistanceOut"
            double r13 = r13.f(r14, r15)     // Catch: java.lang.Throwable -> L63
            double r13 = r13 * r6
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r14.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r15 = "请在"
            r14.append(r15)     // Catch: java.lang.Throwable -> L63
            r14.append(r13)     // Catch: java.lang.Throwable -> L63
            java.lang.String r15 = "米范围内进行人脸识别！"
            r14.append(r15)     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L63
            com.orhanobut.logger.j.d(r14, r15)     // Catch: java.lang.Throwable -> L63
            r12.R(r14, r13)     // Catch: java.lang.Throwable -> L63
            goto L148
        Lbc:
            com.bxkj.base.v2.common.utils.x r15 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.v2.vm.sports.SportsVM r4 = r12.b     // Catch: java.lang.Throwable -> L63
            java.util.Map r4 = r4.M()     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "faceDistanceOut"
            double r8 = r15.f(r4, r8)     // Catch: java.lang.Throwable -> L63
            double r8 = r8 * r6
            int r15 = (int) r8     // Catch: java.lang.Throwable -> L63
            double r6 = r1.i()     // Catch: java.lang.Throwable -> L63
            double r13 = r13 - r6
            double r6 = (double) r15     // Catch: java.lang.Throwable -> L63
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 <= 0) goto L112
            boolean r13 = r1.l()     // Catch: java.lang.Throwable -> L63
            if (r13 != 0) goto L148
            r1.a0(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r13.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = "跑步已暂停，请在"
            r13.append(r14)     // Catch: java.lang.Throwable -> L63
            r13.append(r15)     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = "米范围内进行人脸识别！"
            r13.append(r14)     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.run.app.utils.d0 r14 = com.bxkj.student.run.app.utils.d0.e()     // Catch: java.lang.Throwable -> L63
            android.content.Context r0 = r12.d     // Catch: java.lang.Throwable -> L63
            r1 = 2131886171(0x7f12005b, float:1.9406913E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.Integer[] r4 = new java.lang.Integer[r5]     // Catch: java.lang.Throwable -> L63
            r4[r3] = r1     // Catch: java.lang.Throwable -> L63
            java.util.List r1 = kotlin.collections.f0.U(r4)     // Catch: java.lang.Throwable -> L63
            r14.l(r0, r1)     // Catch: java.lang.Throwable -> L63
            r12.R(r13, r15)     // Catch: java.lang.Throwable -> L63
            goto L148
        L112:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r13 = r12.f1488o     // Catch: java.lang.Throwable -> L63
            if (r13 == 0) goto L11e
            if (r13 == 0) goto L148
            boolean r13 = r13.isShowing()     // Catch: java.lang.Throwable -> L63
            if (r13 != 0) goto L148
        L11e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r13.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = "请在"
            r13.append(r14)     // Catch: java.lang.Throwable -> L63
            r13.append(r15)     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = "米范围内进行人脸识别！"
            r13.append(r14)     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L63
            com.bxkj.student.run.app.utils.d0 r14 = com.bxkj.student.run.app.utils.d0.e()     // Catch: java.lang.Throwable -> L63
            android.content.Context r1 = r12.d     // Catch: java.lang.Throwable -> L63
            java.lang.Integer[] r4 = new java.lang.Integer[r5]     // Catch: java.lang.Throwable -> L63
            r4[r3] = r0     // Catch: java.lang.Throwable -> L63
            java.util.List r0 = kotlin.collections.f0.U(r4)     // Catch: java.lang.Throwable -> L63
            r14.l(r1, r0)     // Catch: java.lang.Throwable -> L63
            r12.R(r13, r15)     // Catch: java.lang.Throwable -> L63
        L148:
            kotlin.n1 r13 = kotlin.n1.a     // Catch: java.lang.Throwable -> L63
            monitor-exit(r2)
            return
        L14c:
            monitor-exit(r2)
            throw r13
        L14e:
            return
    }

    public static /* synthetic */ void x(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.w(r1)
            return
    }

    private static final kotlin.n1 y(com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver r2, boolean r3, androidx.fragment.app.DialogFragment r4) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.student.v2.ui.sports.v3.V3SportsFinishDialog r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsFinishDialog
            r0.<init>()
            androidx.fragment.app.FragmentManager r2 = r2.e
            java.lang.String r1 = "finishDialog"
            r0.show(r2, r1)
            com.bxkj.student.v2.ui.sports.v3.service.h r2 = new com.bxkj.student.v2.ui.sports.v3.service.h
            r2.<init>(r3)
            r0.r0(r2)
            com.bxkj.student.v2.ui.sports.v3.service.i r2 = new com.bxkj.student.v2.ui.sports.v3.service.i
            r2.<init>(r4)
            r0.s0(r2)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 z(boolean r1) {
            if (r1 == 0) goto L8
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            r0 = 0
            r1.w0(r0)
        L8:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final com.amap.api.maps.AMap C() {
            r1 = this;
            com.amap.api.maps.AMap r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentActivity D() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final android.content.Context E() {
            r1 = this;
            android.content.Context r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.fragment.app.FragmentManager F() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.vm.sports.SportsVM G() {
            r1 = this;
            com.bxkj.student.v2.vm.sports.SportsVM r0 = r1.b
            return r0
    }

    public final long H() {
            r2 = this;
            long r0 = r2.g
            return r0
    }

    public final void I(int r9, boolean r10) {
            r8 = this;
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            androidx.fragment.app.FragmentActivity r1 = r8.a
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.vm.sports.SportsVM r3 = r8.b
            java.util.Map r3 = r3.M()
            java.lang.String r4 = "runType"
            int r3 = r2.k(r3, r4)
            com.bxkj.student.v2.vm.sports.SportsVM r4 = r8.b
            java.util.Map r4 = r4.M()
            java.lang.String r5 = "isMidwayFace"
            int r4 = r2.k(r4, r5)
            com.bxkj.student.v2.vm.sports.SportsVM r5 = r8.b
            java.util.Map r5 = r5.M()
            java.lang.String r6 = "identify"
            java.lang.String r5 = r2.t(r5, r6)
            com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a
            com.bxkj.student.v2.common.data.PointData r6 = r2.f()
            com.bxkj.student.v2.ui.sports.v3.service.e r7 = new com.bxkj.student.v2.ui.sports.v3.service.e
            r7.<init>(r8, r9, r10)
            r2 = r3
            r3 = r4
            java.lang.String r4 = "2"
            r0.h(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.sports.SportsVM r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void Q(long r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r3.g = r0
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            r3.f = r0
            com.amap.api.maps.model.MyLocationStyle r0 = new com.amap.api.maps.model.MyLocationStyle
            r0.<init>()
            r1 = 2131690227(0x7f0f02f3, float:1.9009492E38)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r1)
            r0.myLocationIcon(r1)
            android.content.Context r1 = r3.d
            r2 = 2131100712(0x7f060428, float:1.7813813E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.strokeColor(r1)
            android.content.Context r1 = r3.d
            r2 = 2131100697(0x7f060419, float:1.7813783E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.radiusFillColor(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.strokeWidth(r1)
            r1 = 5
            r0.myLocationType(r1)
            com.amap.api.maps.AMap r1 = r3.c
            r1.setMyLocationStyle(r0)
            com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$b r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$b
            r0.<init>(r3)
            r3.f1486m = r0
            com.amap.api.maps.AMap r1 = r3.c
            r1.setLocationSource(r0)
            com.amap.api.maps.AMap r0 = r3.c
            com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
            r1 = 1
            r0.setMyLocationButtonEnabled(r1)
            com.amap.api.maps.AMap r0 = r3.c
            r0.setMyLocationEnabled(r1)
            com.amap.api.maps.AMap r0 = r3.c
            com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
            r0.setZoomPosition(r1)
            r0 = 1099956224(0x41900000, float:18.0)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.zoomTo(r0)
            com.amap.api.maps.AMap r1 = r3.c
            r1.moveCamera(r0)
            r0 = 0
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.changeTilt(r0)
            com.amap.api.maps.AMap r1 = r3.c
            r1.moveCamera(r0)
            com.amap.api.maps.AMap r0 = r3.c
            com.bxkj.student.v2.ui.sports.v3.service.f r1 = new com.bxkj.student.v2.ui.sports.v3.service.f
            r1.<init>(r3)
            r0.setOnMapTouchListener(r1)
            com.amap.api.maps.AMap r0 = r3.c
            com.bxkj.student.v2.ui.sports.v3.service.g r1 = new com.bxkj.student.v2.ui.sports.v3.service.g
            r1.<init>(r3)
            r0.setOnMapClickListener(r1)
            com.bxkj.student.v2.common.utils.f r0 = new com.bxkj.student.v2.common.utils.f
            android.content.Context r1 = r3.d
            com.amap.api.maps.AMap r2 = r3.c
            r0.<init>(r1, r2)
            r3.k = r0
            com.bxkj.student.v2.vm.sports.SportsVM r0 = r3.b
            java.util.Map r0 = r0.M()
            java.lang.String r1 = "middleFaces"
            java.lang.Class r2 = java.lang.Double.TYPE
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1, r2)
            r3.j = r0
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            com.amap.api.maps.model.LatLng r0 = r0.C()
            if (r0 == 0) goto Lb4
            r3.u(r0)
        Lb4:
            com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$onCreate$5 r0 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$onCreate$5
            r0.<init>(r3)
            r3.f1485l = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".run"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            android.content.BroadcastReceiver r1 = r3.f1485l
            if (r1 == 0) goto Le4
            androidx.fragment.app.FragmentActivity r2 = r3.a
            r2.registerReceiver(r1, r0)
        Le4:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
            r2 = this;
            android.content.BroadcastReceiver r0 = r2.f1485l
            if (r0 == 0) goto L9
            androidx.fragment.app.FragmentActivity r1 = r2.a
            r1.unregisterReceiver(r0)
        L9:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void onResume() {
            r5 = this;
            com.amap.api.maps.model.LatLng r0 = r5.h
            if (r0 == 0) goto L16
            com.amap.api.maps.AMap r1 = r5.c
            r2 = 1099956224(0x41900000, float:18.0)
            com.amap.api.maps.model.CameraPosition r0 = com.amap.api.maps.model.CameraPosition.fromLatLngZoom(r0, r2)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            r1.animateCamera(r0, r2, r4)
        L16:
            r5.L()
            return
    }

    public final void w(boolean r13) {
            r12 = this;
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r0 = r12.f1489p
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            r1 = 1
            r0.w0(r1)
            androidx.lifecycle.MutableLiveData r2 = r0.k()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.setValue(r3)
            androidx.lifecycle.MutableLiveData r0 = r0.j()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 0
            if (r0 == 0) goto L28
            int r0 = r0.intValue()
            goto L29
        L28:
            r0 = 0
        L29:
            int r0 = r0 + r1
            com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.vm.sports.SportsVM r4 = r12.b
            java.util.Map r4 = r4.M()
            java.lang.String r5 = "identify"
            java.lang.String r4 = r3.t(r4, r5)
            com.bxkj.student.v2.vm.sports.SportsVM r5 = r12.b
            java.util.Map r5 = r5.M()
            java.lang.String r6 = "faceOutCanContinue"
            int r5 = r3.k(r5, r6)
            if (r5 != r1) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            com.bxkj.student.v2.vm.sports.SportsVM r2 = r12.b
            java.util.Map r2 = r2.M()
            java.lang.String r5 = "faceDistanceOut"
            double r2 = r3.f(r2, r5)
            r5 = 1000(0x3e8, float:1.401E-42)
            double r5 = (double) r5
            double r2 = r2 * r5
            int r7 = (int) r2
            com.bxkj.student.v2.ui.dialog.FaceOutDialog$b r5 = com.bxkj.student.v2.ui.dialog.FaceOutDialog.f1419r
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r1 == 0) goto L66
            java.lang.String r2 = "继续跑步"
        L64:
            r8 = r2
            goto L69
        L66:
            java.lang.String r2 = ""
            goto L64
        L69:
            androidx.fragment.app.FragmentManager r9 = r12.e
            com.bxkj.student.v2.ui.sports.v3.service.k r10 = new com.bxkj.student.v2.ui.sports.v3.service.k
            r10.<init>(r12, r1)
            com.bxkj.student.v2.ui.sports.v3.service.l r11 = new com.bxkj.student.v2.ui.sports.v3.service.l
            r11.<init>(r13, r12)
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r13 = r5.e(r6, r7, r8, r9, r10, r11)
            r12.f1489p = r13
            androidx.fragment.app.FragmentActivity r13 = r12.a
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r13)
            kotlinx.coroutines.m0 r6 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$a r8 = new com.bxkj.student.v2.ui.sports.v3.service.V3MapObserver$a
            r13 = 0
            r8.<init>(r4, r0, r13)
            r9 = 2
            r10 = 0
            r7 = 0
            kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
            return
    }
}

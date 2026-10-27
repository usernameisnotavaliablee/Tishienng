package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3LocationObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3LocationObserver.kt\ncom/bxkj/student/v2/ui/sports/v3/service/V3LocationObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n1#2:478\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3LocationObserver implements androidx.lifecycle.LifecycleObserver {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleService a;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.location.AMapLocationClient b;
    private com.amap.api.maps.model.LatLng c;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.common.data.PointData d;
    private boolean e;
    private final int f;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.common.data.PointData g;
    private double h;
    private int i;

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$onLocationChangeListener$1", f = "V3LocationObserver.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver b;
        final /* synthetic */ com.amap.api.location.AMapLocation c;

        a(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1, com.amap.api.location.AMapLocation r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.a> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$a r3 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$a
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0 = r2.b
                com.amap.api.location.AMapLocation r1 = r2.c
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
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$a r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r4 = r3.b
                com.amap.api.location.AMapLocation r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.e(r4, r1, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$onLocationSuccessListener$10$1", f = "V3LocationObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;

        b(kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.b> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$b r1 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$b
                r1.<init>(r2)
                return r1
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
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$b r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L1c
                kotlin.g0.n(r2)
                com.bxkj.student.v2.common.utils.a r2 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r2 = r2.a()
                if (r2 == 0) goto L1a
                java.lang.String r0 = "超过10秒未获取到定位点"
                com.bxkj.base.v2.common.ext.ContextExtKt.q(r2, r0)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L1a:
                r2 = 0
                return r2
            L1c:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$onLocationSuccessListener$12$1", f = "V3LocationObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super android.widget.Toast>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver b;

        c(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.c> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$c r2 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$c
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0 = r1.b
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super android.widget.Toast> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$c r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r4.a
                if (r0 != 0) goto L37
                kotlin.g0.n(r5)
                com.bxkj.student.v2.common.utils.a r5 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r5 = r5.a()
                r0 = 0
                if (r5 == 0) goto L36
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1 = r4.b
                int r1 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.d(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "扔掉第"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = "个点"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r2 = 0
                r3 = 2
                android.widget.Toast r5 = com.bxkj.base.v2.common.ext.ContextExtKt.s(r5, r1, r2, r3, r0)
                return r5
            L36:
                return r0
            L37:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$onLocationSuccessListener$15$1", f = "V3LocationObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super android.widget.Toast>, java.lang.Object> {
        int a;

        d(kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.d> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$d r1 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$d
                r1.<init>(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super android.widget.Toast> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$d r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.d) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r4.a
                if (r0 != 0) goto L1d
                kotlin.g0.n(r5)
                com.bxkj.student.v2.common.utils.a r5 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r5 = r5.a()
                r0 = 0
                if (r5 == 0) goto L1c
                r1 = 0
                r2 = 2
                java.lang.String r3 = "恢复10个定位点后补偿距离算法"
                android.widget.Toast r5 = com.bxkj.base.v2.common.ext.ContextExtKt.s(r5, r3, r1, r2, r0)
                return r5
            L1c:
                return r0
            L1d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$onLocationSuccessListener$17$1", f = "V3LocationObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super android.widget.Toast>, java.lang.Object> {
        int a;

        e(kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.e> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$e r1 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$e
                r1.<init>(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super android.widget.Toast> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$e r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.e) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r4.a
                if (r0 != 0) goto L1d
                kotlin.g0.n(r5)
                com.bxkj.student.v2.common.utils.a r5 = com.bxkj.student.v2.common.utils.a.a
                android.app.Activity r5 = r5.a()
                r0 = 0
                if (r5 == 0) goto L1c
                r1 = 0
                r2 = 2
                java.lang.String r3 = "中途出现了暂停的点，将丢失的点位置空，重新按规则计算"
                android.widget.Toast r5 = com.bxkj.base.v2.common.ext.ContextExtKt.s(r5, r3, r1, r2, r0)
                return r5
            L1c:
                return r0
            L1d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver", f = "V3LocationObserver.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {373, 384, 408, 422}, m = "onLocationSuccessListener", n = {"location", "curPoint", "sb", "distance", "appendDistance", "it", "countTime", "gpsDistance", "$i$a$-let-V3LocationObserver$onLocationSuccessListener$10", "location", "curPoint", "sb", "distance", "appendDistance", "it", "countTime", "gpsDistance", "$i$a$-let-V3LocationObserver$onLocationSuccessListener$12", "location", "curPoint", "sb", "distance", "appendDistance", "it", "countTime", "gpsDistance", "$i$a$-let-V3LocationObserver$onLocationSuccessListener$15", "location", "curPoint", "sb", "distance", "appendDistance", "it", "countTime", "gpsDistance", "$i$a$-let-V3LocationObserver$onLocationSuccessListener$17"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "D$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "D$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "D$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "D$0", "I$0"})
    static final class f extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        java.lang.Object e;
        java.lang.Object f;
        long g;
        double h;
        int i;
        /* synthetic */ java.lang.Object j;
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver k;

        /* renamed from: l, reason: collision with root package name */
        int f1484l;

        f(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.f> r2) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.j = r2
                int r2 = r1.f1484l
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f1484l = r2
                com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r2 = r1.k
                r0 = 0
                java.lang.Object r2 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.e(r2, r0, r1)
                return r2
        }
    }

    public V3LocationObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleService r2) {
            r1 = this;
            java.lang.String r0 = "service"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r2 = 100
            r1.f = r2
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0, android.content.DialogInterface r1) {
            k(r0, r1)
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0, com.amap.api.location.AMapLocation r1) {
            i(r0, r1)
            return
    }

    public static /* synthetic */ void c(android.view.View r0) {
            j(r0)
            return
    }

    public static final /* synthetic */ int d(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0) {
            int r0 = r0.i
            return r0
    }

    public static final /* synthetic */ java.lang.Object e(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0, com.amap.api.location.AMapLocation r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.m(r1, r2)
            return r0
    }

    private final com.amap.api.location.AMapLocationClientOption f() {
            r4 = this;
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            com.amap.api.location.AMapLocationClientOption$AMapLocationPurpose r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.Sport
            r0.setLocationPurpose(r1)
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
            r0.setLocationMode(r1)
            r1 = 1
            r0.setGpsFirst(r1)
            r2 = 30000(0x7530, double:1.4822E-319)
            r0.setHttpTimeOut(r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.setInterval(r2)
            r0.setNeedAddress(r1)
            r2 = 0
            r0.setOnceLocation(r2)
            r0.setOnceLocationLatest(r2)
            r0.setSensorEnable(r1)
            r0.setWifiScan(r1)
            r0.setLocationCacheEnable(r1)
            r0.setMockEnable(r2)
            return r0
    }

    private final void h() {
            r2 = this;
            com.amap.api.location.AMapLocationClient r0 = new com.amap.api.location.AMapLocationClient
            androidx.lifecycle.LifecycleService r1 = r2.a
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.<init>(r1)
            com.amap.api.location.AMapLocationClientOption r1 = r2.f()
            r0.setLocationOption(r1)
            com.bxkj.student.v2.ui.sports.v3.service.d r1 = new com.bxkj.student.v2.ui.sports.v3.service.d
            r1.<init>(r2)
            r0.setLocationListener(r1)
            r2.b = r0
            return
    }

    private static final void i(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r10, com.amap.api.location.AMapLocation r11) {
            if (r11 == 0) goto La4
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            com.bxkj.student.v2.common.data.i$a r1 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r2 = r1.B()
            java.lang.String r3 = "isCheckDevelop"
            r4 = 1
            int r0 = r0.l(r2, r3, r4)
            r2 = 0
            if (r0 != r4) goto L97
            com.bxkj.student.v2.ui.sports.safe.b r0 = com.bxkj.student.v2.ui.sports.safe.b.a
            boolean r3 = r0.b()
            if (r3 == 0) goto L97
            r1.h0(r4)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r11 = r10.j
            r3 = 0
            if (r11 == 0) goto L2d
            boolean r11 = r11.isShowing()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            goto L2e
        L2d:
            r11 = r3
        L2e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "devDialog?.isShowing="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.orhanobut.logger.j.d(r11, r5)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r11 = r10.j
            if (r11 == 0) goto L52
            if (r11 == 0) goto L51
            boolean r11 = r11.isShowing()
            if (r11 != 0) goto L51
            goto L52
        L51:
            return
        L52:
            int r11 = r1.I()
            int r11 = r11 + r4
            r1.l0(r11)
            java.lang.String r6 = r0.a()
            com.bxkj.student.v2.ui.sports.v3.service.m$a r4 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            com.bxkj.student.App$a r11 = com.bxkj.student.App.d
            com.bxkj.student.App r5 = r11.a()
            r8 = 4
            r9 = 0
            r7 = 0
            com.bxkj.student.v2.ui.sports.v3.service.m.a.h(r4, r5, r6, r7, r8, r9)
            com.bxkj.student.v2.common.utils.a r11 = com.bxkj.student.v2.common.utils.a.a
            android.app.Activity r11 = r11.a()
            if (r11 == 0) goto L94
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r11 = com.bxkj.base.v2.common.ext.ContextExtKt.m(r11, r6)
            if (r11 == 0) goto L94
            com.bxkj.student.v2.ui.sports.v3.service.b r0 = new com.bxkj.student.v2.ui.sports.v3.service.b
            r0.<init>()
            r11.setButtonOnClickListener(r0)
            r11.setClickAutoCancel(r2)
            r11.setCancelable(r2)
            r11.setCanceledOnTouchOutside(r2)
            com.bxkj.student.v2.ui.sports.v3.service.c r0 = new com.bxkj.student.v2.ui.sports.v3.service.c
            r0.<init>(r10)
            r11.setOnDismissListener(r0)
            r3 = r11
        L94:
            r10.j = r3
            return
        L97:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r10.j
            if (r0 == 0) goto L9e
            r0.dismiss()
        L9e:
            r1.h0(r2)
            r10.l(r11)
        La4:
            return
    }

    private static final void j(android.view.View r0) {
            com.bxkj.student.v2.ui.sports.safe.b r0 = com.bxkj.student.v2.ui.sports.safe.b.a
            r0.c()
            return
    }

    private static final void k(com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r0, android.content.DialogInterface r1) {
            r1 = 0
            r0.j = r1
            return
    }

    private final void l(com.amap.api.location.AMapLocation r10) {
            r9 = this;
            com.amap.api.location.AMapLocationQualityReport r0 = r10.getLocationQualityReport()
            int r0 = r0.getGPSStatus()
            int r1 = r10.getGpsAccuracyStatus()
            java.lang.String r0 = com.bxkj.student.run.app.utils.i.j(r0, r1)
            int r1 = r10.getGpsAccuracyStatus()
            int r1 = com.bxkj.student.run.app.utils.i.k(r1)
            com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a
            int r3 = r10.getGpsAccuracyStatus()
            r2.e0(r3)
            kotlin.jvm.internal.g0.m(r0)
            r2.g0(r0)
            r2.f0(r1)
            r2.O(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "回调时间:"
            r2.append(r3)
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r0 = com.bxkj.student.run.app.utils.i.h(r0, r3)
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            int r1 = r10.getErrorCode()
            if (r1 != 0) goto L23c
            java.lang.String r1 = "定位成功\n"
            r2.append(r1)
            int r1 = r10.getLocationType()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "定位类型:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " \n"
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            double r4 = r10.getLongitude()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "经\u3000\u3000度:"
            r6.append(r7)
            r6.append(r4)
            r6.append(r1)
            java.lang.String r4 = r6.toString()
            r2.append(r4)
            double r4 = r10.getLatitude()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "纬\u3000\u3000度:"
            r6.append(r7)
            r6.append(r4)
            r6.append(r1)
            java.lang.String r4 = r6.toString()
            r2.append(r4)
            float r4 = r10.getAccuracy()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "精\u3000\u3000度:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getProvider()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "提供者\u3000:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            float r4 = r10.getSpeed()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "速\u3000\u3000度:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            float r4 = r10.getBearing()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "角\u3000\u3000度:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            int r4 = r10.getSatellites()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "星\u3000\u3000数:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getCountry()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "国\u3000\u3000家:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getProvince()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "省\u3000\u3000\u3000:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getCity()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "市\u3000\u3000\u3000:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getCityCode()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "城市编码:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getDistrict()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "区\u3000\u3000\u3000:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getAdCode()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "区域码\u3000:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getAddress()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "地\u3000\u3000址:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            java.lang.String r4 = r10.getPoiName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "兴趣点\u3000:"
            r5.append(r6)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            r2.append(r4)
            long r4 = r10.getTime()
            java.lang.String r3 = com.bxkj.student.run.app.utils.i.h(r4, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "定位时间:"
            r4.append(r5)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.append(r1)
            androidx.lifecycle.LifecycleService r1 = r9.a
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r1)
            kotlinx.coroutines.m0 r4 = kotlinx.coroutines.g1.a()
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$a r6 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$a
            r1 = 0
            r6.<init>(r9, r10, r1)
            r7 = 2
            r8 = 0
            r5 = 0
            kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
            goto L29c
        L23c:
            java.lang.String r1 = "定位失败\n"
            r2.append(r1)
            int r1 = r10.getErrorCode()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "错误码\u3000:"
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            r2.append(r1)
            java.lang.String r1 = r10.getErrorInfo()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "错误信息:"
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            r2.append(r1)
            java.lang.String r1 = r10.getLocationDetail()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "错误描述:"
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.orhanobut.logger.j.d(r1, r3)
        L29c:
            java.lang.String r1 = "***定位质量报告***\n"
            r2.append(r1)
            com.amap.api.location.AMapLocationQualityReport r1 = r10.getLocationQualityReport()
            boolean r1 = r1.isWifiAble()
            if (r1 == 0) goto L2ae
            java.lang.String r1 = "开启"
            goto L2b0
        L2ae:
            java.lang.String r1 = "关闭"
        L2b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "* WIFI开关："
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            r2.append(r1)
            com.amap.api.location.AMapLocationQualityReport r1 = r10.getLocationQualityReport()
            int r1 = r1.getGPSStatus()
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.m(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "* GPS状态："
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            r2.append(r1)
            com.amap.api.location.AMapLocationQualityReport r10 = r10.getLocationQualityReport()
            int r10 = r10.getGPSSatellites()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "* GPS星数："
            r1.append(r3)
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            r2.append(r10)
            java.lang.String r10 = "****************\n"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r10, r0)
            return
    }

    private final java.lang.Object m(com.amap.api.location.AMapLocation r32, kotlin.coroutines.e<? super kotlin.n1> r33) {
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            boolean r3 = r2 instanceof com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.f
            if (r3 == 0) goto L19
            r3 = r2
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$f r3 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver.f) r3
            int r4 = r3.f1484l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f1484l = r4
            goto L1e
        L19:
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$f r3 = new com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver$f
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.j
            kotlin.coroutines.intrinsics.a.l()
            int r4 = r3.f1484l
            r5 = 3
            java.lang.String r6 = "valueOf(...)"
            r10 = 4
            r11 = 1
            r12 = 0
            if (r4 == 0) goto Ld4
            if (r4 == r11) goto Laf
            r1 = 2
            if (r4 == r1) goto L89
            if (r4 == r5) goto L64
            if (r4 != r10) goto L5c
            double r4 = r3.h
            long r6 = r3.g
            java.lang.Object r1 = r3.f
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver) r1
            java.lang.Object r1 = r3.e
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r10 = r3.d
            kotlin.jvm.internal.Ref$DoubleRef r10 = (kotlin.jvm.internal.Ref.DoubleRef) r10
            java.lang.Object r12 = r3.c
            java.lang.StringBuilder r12 = (java.lang.StringBuilder) r12
            java.lang.Object r12 = r3.b
            com.bxkj.student.v2.common.data.PointData r12 = (com.bxkj.student.v2.common.data.PointData) r12
            java.lang.Object r3 = r3.a
            com.amap.api.location.AMapLocation r3 = (com.amap.api.location.AMapLocation) r3
            kotlin.g0.n(r2)
            android.widget.Toast r2 = (android.widget.Toast) r2
            r2 = 0
            r16 = 0
            goto L488
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L64:
            double r4 = r3.h
            long r6 = r3.g
            java.lang.Object r1 = r3.f
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver) r1
            java.lang.Object r1 = r3.e
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r10 = r3.d
            kotlin.jvm.internal.Ref$DoubleRef r10 = (kotlin.jvm.internal.Ref.DoubleRef) r10
            java.lang.Object r12 = r3.c
            java.lang.StringBuilder r12 = (java.lang.StringBuilder) r12
            java.lang.Object r12 = r3.b
            com.bxkj.student.v2.common.data.PointData r12 = (com.bxkj.student.v2.common.data.PointData) r12
            java.lang.Object r3 = r3.a
            com.amap.api.location.AMapLocation r3 = (com.amap.api.location.AMapLocation) r3
            kotlin.g0.n(r2)
            android.widget.Toast r2 = (android.widget.Toast) r2
            r16 = 0
            goto L45b
        L89:
            double r4 = r3.h
            long r14 = r3.g
            java.lang.Object r1 = r3.f
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver) r1
            java.lang.Object r1 = r3.e
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r10 = r3.d
            kotlin.jvm.internal.Ref$DoubleRef r10 = (kotlin.jvm.internal.Ref.DoubleRef) r10
            r16 = 0
            java.lang.Object r8 = r3.c
            java.lang.StringBuilder r8 = (java.lang.StringBuilder) r8
            java.lang.Object r8 = r3.b
            com.bxkj.student.v2.common.data.PointData r8 = (com.bxkj.student.v2.common.data.PointData) r8
            java.lang.Object r3 = r3.a
            com.amap.api.location.AMapLocation r3 = (com.amap.api.location.AMapLocation) r3
            kotlin.g0.n(r2)
            android.widget.Toast r2 = (android.widget.Toast) r2
            r12 = r8
            goto L3fc
        Laf:
            r16 = 0
            double r4 = r3.h
            long r6 = r3.g
            java.lang.Object r1 = r3.f
            com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver r1 = (com.bxkj.student.v2.ui.sports.v3.service.V3LocationObserver) r1
            java.lang.Object r1 = r3.e
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r8 = r3.d
            kotlin.jvm.internal.Ref$DoubleRef r8 = (kotlin.jvm.internal.Ref.DoubleRef) r8
            java.lang.Object r9 = r3.c
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.Object r9 = r3.b
            com.bxkj.student.v2.common.data.PointData r9 = (com.bxkj.student.v2.common.data.PointData) r9
            java.lang.Object r3 = r3.a
            com.amap.api.location.AMapLocation r3 = (com.amap.api.location.AMapLocation) r3
            kotlin.g0.n(r2)
            kotlin.n1 r2 = (kotlin.n1) r2
            goto L3ba
        Ld4:
            r16 = 0
            kotlin.g0.n(r2)
            com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a
            r2.M(r1)
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            double r8 = r1.getLatitude()
            double r14 = r1.getLongitude()
            r3.<init>(r8, r14)
            r0.c = r3
            r2.P(r3)
            com.amap.api.maps.model.LatLng r3 = r2.n()
            java.lang.String r4 = "currentLatLng"
            if (r3 != 0) goto L10e
            com.amap.api.maps.model.LatLng r3 = r0.c
            if (r3 != 0) goto L100
            kotlin.jvm.internal.g0.S(r4)
            r3 = 0
        L100:
            r2.b0(r3)
            com.amap.api.maps.model.LatLng r3 = r0.c
            if (r3 != 0) goto L10b
            kotlin.jvm.internal.g0.S(r4)
            r3 = 0
        L10b:
            r2.N(r3)
        L10e:
            int r3 = r1.getLocationType()
            r8 = 6
            if (r3 != r8) goto L118
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L118:
            float r3 = r1.getAccuracy()
            int r8 = r0.f
            float r8 = (float) r8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L126
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L126:
            int r3 = r1.getTrustedLevel()
            if (r3 == r5) goto L531
            int r3 = r1.getTrustedLevel()
            if (r3 != r10) goto L134
            goto L531
        L134:
            com.bxkj.student.v2.common.data.PointData r18 = new com.bxkj.student.v2.common.data.PointData
            com.amap.api.maps.model.LatLng r3 = r0.c
            if (r3 != 0) goto L13e
            kotlin.jvm.internal.g0.S(r4)
            r3 = 0
        L13e:
            double r8 = r3.latitude
            com.amap.api.maps.model.LatLng r3 = r0.c
            if (r3 != 0) goto L148
            kotlin.jvm.internal.g0.S(r4)
            r3 = 0
        L148:
            double r14 = r3.longitude
            long r23 = r1.getTime()
            float r25 = r1.getSpeed()
            boolean r26 = r2.K()
            int r27 = r1.getLocationType()
            long r28 = r2.e()
            int r30 = r2.G()
            r19 = r8
            r21 = r14
            r18.<init>(r19, r21, r23, r25, r26, r27, r28, r30)
            r3 = r18
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            boolean r8 = r1.isFromMockProvider()
            if (r8 == 0) goto L178
            r8 = r0
            goto L179
        L178:
            r8 = 0
        L179:
            if (r8 == 0) goto L19a
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r11)
            r3.setF(r8)
            boolean r8 = r1.isFromMockProvider()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "location.isFromMockProvider = "
            r9.append(r14)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r5.append(r8)
        L19a:
            boolean r8 = r1.isMock()
            if (r8 == 0) goto L1a2
            r8 = r0
            goto L1a3
        L1a2:
            r8 = 0
        L1a3:
            if (r8 == 0) goto L1c4
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r11)
            r3.setM(r8)
            boolean r8 = r1.isMock()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "\nlocation.isMock = "
            r9.append(r14)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r5.append(r8)
        L1c4:
            com.amap.api.location.AMapLocationQualityReport r8 = r1.getLocationQualityReport()
            boolean r8 = r8.isInstalledHighDangerMockApp()
            if (r8 == 0) goto L1d0
            r8 = r0
            goto L1d1
        L1d0:
            r8 = 0
        L1d1:
            if (r8 == 0) goto L1f6
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r11)
            r3.setH(r8)
            com.amap.api.location.AMapLocationQualityReport r8 = r1.getLocationQualityReport()
            boolean r8 = r8.isInstalledHighDangerMockApp()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "\nlocation.locationQualityReport.isInstalledHighDangerMockApp = "
            r9.append(r14)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r5.append(r8)
        L1f6:
            r2.W(r3)
            boolean r5 = r0.e
            if (r5 != 0) goto L206
            boolean r1 = r2.t(r1)
            r0.e = r1
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L206:
            java.util.List r1 = r2.s()
            r1.add(r3)
            com.amap.api.maps.model.LatLng r1 = r2.C()
            if (r1 != 0) goto L22d
            com.amap.api.maps.model.LatLng r1 = r0.c
            if (r1 != 0) goto L21b
            kotlin.jvm.internal.g0.S(r4)
            r1 = 0
        L21b:
            r2.r0(r1)
            com.amap.api.maps.model.LatLng r1 = r0.c
            if (r1 != 0) goto L227
            kotlin.jvm.internal.g0.S(r4)
            r13 = 0
            goto L228
        L227:
            r13 = r1
        L228:
            r2.R(r13)
            goto L52c
        L22d:
            com.bxkj.student.v2.common.data.PointData r1 = r0.d
            if (r1 != 0) goto L254
            r3.setI(r11)
            r2.i0(r3)
            r2.Q(r3)
            r0.d = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "走到此处说明是中途异常结束重新继续跑步的curPoint="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r12]
            com.orhanobut.logger.j.d(r1, r2)
            goto L52c
        L254:
            if (r1 == 0) goto L262
            com.bxkj.student.v2.common.utils.g$a r5 = com.bxkj.student.v2.common.utils.g.a
            double r8 = r5.D(r1, r3)
            float r1 = (float) r8
            r3.setS(r1)
            kotlin.n1 r1 = kotlin.n1.a
        L262:
            long r8 = r2.e()
            kotlin.jvm.internal.Ref$DoubleRef r1 = new kotlin.jvm.internal.Ref$DoubleRef
            r1.<init>()
            double r14 = r2.g()
            r1.element = r14
            double r14 = r2.o()
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            com.bxkj.student.v2.common.data.PointData r13 = r0.d
            if (r13 == 0) goto L2a1
            com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng
            double r10 = r13.getA()
            double r12 = r13.getO()
            r7.<init>(r10, r12)
            com.amap.api.maps.model.LatLng r10 = r0.c
            if (r10 != 0) goto L293
            kotlin.jvm.internal.g0.S(r4)
            r10 = 0
        L293:
            float r4 = com.amap.api.maps.AMapUtils.calculateLineDistance(r7, r10)
            double r10 = (double) r4
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r10)
            if (r4 != 0) goto L29f
            goto L2a1
        L29f:
            r7 = 0
            goto L2a7
        L2a1:
            java.math.BigDecimal r4 = new java.math.BigDecimal
            r7 = 0
            r4.<init>(r7)
        L2a7:
            r5.element = r4
            int r4 = r2.G()
            if (r4 != 0) goto L2bf
            com.bxkj.student.v2.common.utils.g$a r4 = com.bxkj.student.v2.common.utils.g.a
            int r4 = r4.r()
            r10 = 1
            if (r4 != r10) goto L2bf
            java.math.BigDecimal r4 = new java.math.BigDecimal
            r4.<init>(r7)
            r5.element = r4
        L2bf:
            float r4 = r3.getS()
            double r10 = (double) r4
            com.bxkj.student.v2.common.utils.g$a r4 = com.bxkj.student.v2.common.utils.g.a
            double r12 = r4.l()
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L36b
            boolean r4 = r2.K()
            if (r4 != 0) goto L368
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L2e1
            java.math.BigDecimal r4 = new java.math.BigDecimal
            r7 = 0
            r4.<init>(r7)
            goto L2f4
        L2e1:
            java.math.BigDecimal r4 = new java.math.BigDecimal
            double r10 = r1.element
            r4.<init>(r10)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r8)
            r10 = 10
            r11 = 4
            java.math.BigDecimal r4 = r4.divide(r7, r10, r11)
        L2f4:
            com.bxkj.student.v2.common.data.PointData r7 = r0.d
            if (r7 == 0) goto L31b
            java.math.BigDecimal r10 = new java.math.BigDecimal
            long r11 = r3.getT()
            long r22 = r7.getT()
            long r11 = r11 - r22
            r10.<init>(r11)
            java.math.BigDecimal r7 = r10.abs()
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r11 = 1000(0x3e8, float:1.401E-42)
            r10.<init>(r11)
            r11 = 10
            r12 = 4
            java.math.BigDecimal r7 = r7.divide(r10, r11, r12)
            if (r7 != 0) goto L321
        L31b:
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r10 = 0
            r7.<init>(r10)
        L321:
            java.math.BigDecimal r10 = r4.multiply(r7)
            java.lang.String r11 = "multiply(...)"
            kotlin.jvm.internal.g0.o(r10, r11)
            r5.element = r10
            double r11 = r1.element
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r22 = r14
            java.lang.String r14 = "漂移点countDistance="
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = " countTime="
            r13.append(r11)
            r13.append(r8)
            java.lang.String r11 = " avg="
            r13.append(r11)
            r13.append(r4)
            java.lang.String r4 = " time="
            r13.append(r4)
            r13.append(r7)
            java.lang.String r4 = " appendDistance="
            r13.append(r4)
            r13.append(r10)
            java.lang.String r4 = r13.toString()
            r7 = 0
            java.lang.Object[] r10 = new java.lang.Object[r7]
            com.orhanobut.logger.j.m(r4, r10)
            goto L373
        L368:
            r22 = r14
            goto L373
        L36b:
            r22 = r14
            r2.i0(r3)
            r2.Q(r3)
        L373:
            boolean r2 = r2.K()
            if (r2 != 0) goto L473
            com.bxkj.student.v2.common.data.PointData r2 = r0.d
            if (r2 == 0) goto L473
            if (r2 == 0) goto L473
            boolean r2 = r2.isI()
            if (r2 != 0) goto L473
            long r10 = r3.getT()
            com.bxkj.student.v2.common.data.PointData r2 = r0.d
            kotlin.jvm.internal.g0.m(r2)
            long r12 = r2.getT()
            long r10 = r10 - r12
            r12 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L3c3
            com.bxkj.student.v2.common.data.PointData r2 = r0.d
            r0.g = r2
            double r10 = r1.element
            r0.h = r10
            r7 = 0
            r0.i = r7
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r16)
            kotlin.jvm.internal.g0.o(r2, r6)
            r5.element = r2
            java.lang.String r2 = "进入隧道算法，超过10秒未获取到定位点"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.orhanobut.logger.j.d(r2, r4)
            r6 = r8
            r8 = r1
            r9 = r3
            r1 = r5
            r4 = r22
        L3ba:
            r14 = r4
            r18 = r9
            r2 = 0
            r5 = r1
            r1 = r8
            r8 = r6
            goto L491
        L3c3:
            com.bxkj.student.v2.common.data.PointData r2 = r0.g
            if (r2 == 0) goto L471
            int r2 = r0.i
            r19 = 1
            int r2 = r2 + 1
            r0.i = r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r16)
            kotlin.jvm.internal.g0.o(r2, r6)
            r5.element = r2
            int r2 = r0.i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "扔掉第"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r2 = "个点"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r7 = 0
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.orhanobut.logger.j.d(r2, r4)
            r10 = r1
            r12 = r3
            r1 = r5
            r14 = r8
            r4 = r22
        L3fc:
            int r2 = r0.i
            r11 = 10
            if (r2 != r11) goto L463
            com.bxkj.student.v2.common.data.PointData r2 = r0.g
            if (r2 == 0) goto L436
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            double r7 = r12.getA()
            r22 = r4
            double r4 = r12.getO()
            r3.<init>(r7, r4)
            com.amap.api.maps.model.LatLng r4 = new com.amap.api.maps.model.LatLng
            double r7 = r2.getA()
            r32 = r10
            double r9 = r2.getO()
            r4.<init>(r7, r9)
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r3, r4)
            double r2 = (double) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)
            kotlin.jvm.internal.g0.o(r2, r6)
            r1.element = r2
            kotlin.n1 r2 = kotlin.n1.a
        L434:
            r2 = 0
            goto L43b
        L436:
            r22 = r4
            r32 = r10
            goto L434
        L43b:
            r0.g = r2
            java.lang.Object r2 = r1.element
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "进入隧道算法，恢复10个定位点后补偿距离算法补偿后的appendDistance="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r7 = 0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.orhanobut.logger.j.e(r2, r3)
            r10 = r32
            r6 = r14
            r4 = r22
        L45b:
            r14 = r4
            r8 = r6
            r18 = r12
            r2 = 0
        L460:
            r5 = r1
            r1 = r10
            goto L491
        L463:
            r22 = r4
            r32 = r10
            r5 = r1
            r18 = r12
            r8 = r14
            r14 = r22
            r2 = 0
            r1 = r32
            goto L491
        L471:
            r2 = 0
            goto L48d
        L473:
            com.bxkj.student.v2.common.data.PointData r2 = r0.g
            if (r2 == 0) goto L471
            r2 = 0
            r0.g = r2
            java.lang.String r4 = "中途出现了暂停的点，将丢失的点位置空，重新按规则计算"
            r7 = 0
            java.lang.Object[] r6 = new java.lang.Object[r7]
            com.orhanobut.logger.j.e(r4, r6)
            r10 = r1
            r12 = r3
            r1 = r5
            r6 = r8
            r4 = r22
        L488:
            r14 = r4
            r8 = r6
            r18 = r12
            goto L460
        L48d:
            r18 = r3
            r14 = r22
        L491:
            com.bxkj.student.v2.common.data.i$a r3 = com.bxkj.student.v2.common.data.i.a
            boolean r4 = r3.K()
            if (r4 != 0) goto L52a
            java.lang.Object r4 = r5.element
            java.math.BigDecimal r4 = (java.math.BigDecimal) r4
            java.math.BigDecimal r6 = new java.math.BigDecimal
            com.bxkj.student.v2.common.utils.g$a r20 = com.bxkj.student.v2.common.utils.g.a
            int r7 = r20.h()
            r6.<init>(r7)
            java.math.BigDecimal r4 = r4.multiply(r6)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            double r10 = r1.element
            r6.<init>(r10)
            java.math.BigDecimal r4 = r6.add(r4)
            double r6 = r4.doubleValue()
            r1.element = r6
            java.math.BigDecimal r4 = new java.math.BigDecimal
            r4.<init>(r14)
            java.lang.Object r5 = r5.element
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            java.math.BigDecimal r4 = r4.add(r5)
            double r4 = r4.doubleValue()
            int r6 = r20.r()
            r10 = 1
            if (r6 != r10) goto L4d7
            r13 = r0
            goto L4d8
        L4d7:
            r13 = r2
        L4d8:
            if (r13 == 0) goto L4f2
            int r21 = r3.G()
            long r22 = r3.e()
            double r6 = r1.element
            long r26 = r3.e()
            r24 = r6
            double r6 = r20.c(r21, r22, r24, r26)
            r1.element = r6
            kotlin.n1 r2 = kotlin.n1.a
        L4f2:
            double r6 = r1.element
            r10 = r16
            double r6 = java.lang.Math.max(r6, r10)
            r1.element = r6
            double r4 = java.lang.Math.max(r4, r10)
            double r6 = r1.element
            r3.X(r6)
            r3.d0(r4)
            double r4 = r1.element
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.a(r4, r8)
            double r4 = r1.element
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.b(r4, r8)
            kotlin.jvm.internal.g0.m(r2)
            r3.U(r2)
            kotlin.jvm.internal.g0.m(r1)
            r3.n0(r1)
            r3.T()
            com.bxkj.student.v2.ui.sports.v3.service.m$a r1 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            androidx.lifecycle.LifecycleService r2 = r0.a
            r1.f(r2)
        L52a:
            r3 = r18
        L52c:
            r0.d = r3
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L531:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void n() {
            r3 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "开启前台服务广播"
            com.orhanobut.logger.j.d(r1, r0)
            com.amap.api.location.AMapLocationClient r0 = r3.b
            if (r0 == 0) goto L13
            com.bxkj.student.v2.ui.sports.v3.service.m$a r1 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            androidx.lifecycle.LifecycleService r2 = r3.a
            r1.d(r2, r0)
        L13:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LifecycleService g() {
            r1 = this;
            androidx.lifecycle.LifecycleService r0 = r1.a
            return r0
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "开启定位监听startGetLocation"
            com.orhanobut.logger.j.d(r1, r0)
            r2.h()
            com.amap.api.location.AMapLocationClient r0 = r2.b
            if (r0 == 0) goto L18
            r0.stopLocation()
            r0.startLocation()
            r2.n()
        L18:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "停止定位服务"
            com.orhanobut.logger.j.d(r1, r0)
            com.amap.api.location.AMapLocationClient r0 = r2.b
            r1 = 1
            if (r0 == 0) goto L16
            r0.disableBackgroundLocation(r1)
            r0.stopLocation()
            r0.onDestroy()
        L16:
            androidx.lifecycle.LifecycleService r0 = r2.a
            r0.stopForeground(r1)
            com.bxkj.student.v2.ui.sports.v3.service.m$a r0 = com.bxkj.student.v2.ui.sports.v3.service.m.a
            androidx.lifecycle.LifecycleService r1 = r2.a
            r0.b(r1)
            return
    }
}

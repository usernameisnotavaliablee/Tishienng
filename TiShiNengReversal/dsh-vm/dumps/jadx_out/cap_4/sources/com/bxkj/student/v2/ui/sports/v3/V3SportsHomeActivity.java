package com.bxkj.student.v2.ui.sports.v3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3SportsHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3SportsHomeActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/V3SportsHomeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1255:1\n1#2:1256\n1869#3,2:1257\n1869#3,2:1259\n*S KotlinDebug\n*F\n+ 1 V3SportsHomeActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/V3SportsHomeActivity\n*L\n1046#1:1257,2\n1089#1:1259,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class V3SportsHomeActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcV3SportsHomeBinding, com.bxkj.student.v2.vm.sports.SportsHomeVM> {
    private final long F0;
    private long G0;

    @org.jetbrains.annotations.Nullable
    private androidx.fragment.app.DialogFragment H0;

    @org.jetbrains.annotations.Nullable
    private android.app.Dialog I0;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 J0;
    private com.amap.api.maps.AMap W;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.LocationSource X;

    @org.jetbrains.annotations.Nullable
    private com.amap.api.location.AMapLocationClient Y;

    @org.jetbrains.annotations.NotNull
    private java.lang.String Z;
    private int a0;
    private int b0;

    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog c0;

    /* renamed from: k0, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog f1446k0;

    /* renamed from: p0, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private com.amap.api.maps.model.LatLng f1447p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3SportsHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3SportsHomeActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/V3SportsHomeActivity$alertSelectCampus$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1255:1\n1#2:1256\n*E\n"})
    public static final class a implements com.bxkj.base.v2.view.a.b {
        final /* synthetic */ java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a;
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

        a(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.v2.view.a.b
        public void onMenuClick(java.lang.String r7) {
                r6 = this;
                java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                r3 = r1
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r5 = "name"
                java.lang.String r3 = r4.t(r3, r5)
                boolean r3 = kotlin.jvm.internal.g0.g(r3, r7)
                if (r3 == 0) goto L8
                goto L26
            L25:
                r1 = r2
            L26:
                java.util.Map r1 = (java.util.Map) r1
                if (r1 == 0) goto L50
                boolean r7 = r1.isEmpty()
                if (r7 != 0) goto L31
                r2 = r1
            L31:
                if (r2 == 0) goto L50
                java.util.Map<java.lang.String, java.lang.Object> r7 = r6.b
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r6.c
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r3 = "point"
                java.util.List r3 = r1.n(r2, r3)
                java.lang.String r4 = "context"
                java.lang.String r1 = r1.t(r2, r4)
                java.lang.String r2 = "list"
                r7.put(r2, r3)
                r7.put(r4, r1)
                r0.invoke()
            L50:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements t.b.a {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> a;

        b(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r1, android.content.Intent r2) {
                r0 = this;
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r0.a
                r1.invoke()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$checkSendFace$1$1", f = "V3SportsHomeActivity.kt", i = {0}, l = {750}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        int b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<android.widget.Button> c;

        c(kotlin.jvm.internal.Ref.ObjectRef<android.widget.Button> r1, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.c> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$c r2 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$c
                kotlin.jvm.internal.Ref$ObjectRef<android.widget.Button> r0 = r1.c
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

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$c r1 = (com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.b
                r2 = -1
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 != r3) goto L12
                int r1 = r6.a
                kotlin.g0.n(r7)
                goto L51
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.g0.n(r7)
                r7 = 10
                r1 = 10
            L21:
                if (r2 >= r1) goto L53
                kotlin.jvm.internal.Ref$ObjectRef<android.widget.Button> r7 = r6.c
                java.lang.Object r7 = r7.element
                android.widget.Button r7 = (android.widget.Button) r7
                if (r7 == 0) goto L44
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "继续跑步("
                r4.append(r5)
                r4.append(r1)
                java.lang.String r5 = ")"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r7.setText(r4)
            L44:
                r6.a = r1
                r6.b = r3
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = kotlinx.coroutines.a1.b(r4, r6)
                if (r7 != r0) goto L51
                return r0
            L51:
                int r1 = r1 + r2
                goto L21
            L53:
                kotlin.jvm.internal.Ref$ObjectRef<android.widget.Button> r7 = r6.c
                java.lang.Object r7 = r7.element
                android.widget.Button r7 = (android.widget.Button) r7
                if (r7 == 0) goto L60
                java.lang.String r0 = "继续跑步"
                r7.setText(r0)
            L60:
                kotlin.jvm.internal.Ref$ObjectRef<android.widget.Button> r7 = r6.c
                java.lang.Object r7 = r7.element
                android.widget.Button r7 = (android.widget.Button) r7
                if (r7 == 0) goto L71
                java.lang.String r0 = "#2C7AD7"
                int r0 = android.graphics.Color.parseColor(r0)
                r7.setTextColor(r0)
            L71:
                kotlin.jvm.internal.Ref$ObjectRef<android.widget.Button> r7 = r6.c
                java.lang.Object r7 = r7.element
                android.widget.Button r7 = (android.widget.Button) r7
                if (r7 == 0) goto L7c
                r7.setEnabled(r3)
            L7c:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d implements s.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a implements t.b.a {
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;
            final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

            a(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // t.b.a
            public void a(int r2, android.content.Intent r3) {
                    r1 = this;
                    com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2 = r1.a
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r1.b
                    kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.c
                    com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.C0(r2, r3, r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class b implements t.b.a {
            final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;
            final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
            final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

            b(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // t.b.a
            public void a(int r2, android.content.Intent r3) {
                    r1 = this;
                    com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2 = r1.a
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r1.b
                    kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.c
                    com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.C0(r2, r3, r0)
                    return
            }
        }

        d(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.n1 d(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
                kotlin.n1 r0 = g(r0, r1, r2, r3)
                return r0
        }

        public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
                kotlin.n1 r0 = f(r0, r1, r2, r3)
                return r0
        }

        private static final kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2, kotlin.jvm.functions.Function0 r3, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r4, r0)
                androidx.fragment.app.FragmentActivity r4 = r1.q()
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$d$a r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$d$a
                r0.<init>(r1, r2, r3)
                com.bxkj.base.util.v.p(r4, r0)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 g(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2, kotlin.jvm.functions.Function0 r3, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r4, r0)
                androidx.fragment.app.FragmentActivity r4 = r1.q()
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$d$b r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$d$b
                r0.<init>(r1, r2, r3)
                com.bxkj.base.util.v.p(r4, r0)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // s.b.a
        public void a() {
                r1 = this;
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.c
                r0.invoke()
                return
        }

        @Override // s.b.a
        public void b(java.lang.String[] r11) {
                r10 = this;
                java.lang.String r0 = "permission"
                kotlin.jvm.internal.g0.p(r11, r0)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1 = r10.a
                android.content.Context r11 = r1.G()
                r0 = 2131952186(0x7f13023a, float:1.9540808E38)
                java.lang.String r3 = r11.getString(r0)
                java.lang.String r11 = "getString(...)"
                kotlin.jvm.internal.g0.o(r3, r11)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r11 = r10.a
                java.util.Map<java.lang.String, java.lang.Object> r0 = r10.b
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r10.c
                com.bxkj.student.v2.ui.sports.v3.m1 r4 = new com.bxkj.student.v2.ui.sports.v3.m1
                r4.<init>(r11, r0, r2)
                r8 = 24
                r9 = 0
                java.lang.String r2 = "权限提示"
                r5 = 0
                r6 = 0
                java.lang.String r7 = "去设置"
                com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        @Override // s.b.a
        public void c(java.lang.String[] r11) {
                r10 = this;
                java.lang.String r0 = "permission"
                kotlin.jvm.internal.g0.p(r11, r0)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1 = r10.a
                android.content.Context r11 = r1.G()
                r0 = 2131952186(0x7f13023a, float:1.9540808E38)
                java.lang.String r3 = r11.getString(r0)
                java.lang.String r11 = "getString(...)"
                kotlin.jvm.internal.g0.o(r3, r11)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r11 = r10.a
                java.util.Map<java.lang.String, java.lang.Object> r0 = r10.b
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r10.c
                com.bxkj.student.v2.ui.sports.v3.n1 r4 = new com.bxkj.student.v2.ui.sports.v3.n1
                r4.<init>(r11, r0, r2)
                r8 = 24
                r9 = 0
                java.lang.String r2 = "权限提示"
                r5 = 0
                r6 = 0
                java.lang.String r7 = "去设置"
                com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e implements com.amap.api.services.weather.WeatherSearch.OnWeatherSearchListener {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;
        final /* synthetic */ java.lang.String b;

        e(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void onWeatherForecastSearched(com.amap.api.services.weather.LocalWeatherForecastResult r1, int r2) {
                r0 = this;
                return
        }

        public void onWeatherLiveSearched(com.amap.api.services.weather.LocalWeatherLiveResult r3, int r4) {
                r2 = this;
                r0 = 1000(0x3e8, float:1.401E-42)
                if (r4 != r0) goto L5c
                if (r3 == 0) goto L5c
                com.amap.api.services.weather.LocalWeatherLive r4 = r3.getLiveResult()
                if (r4 == 0) goto L5c
                com.amap.api.services.weather.LocalWeatherLive r3 = r3.getLiveResult()
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r4 = r2.a
                java.lang.String r0 = r3.getWeather()
                java.lang.String r1 = "getWeather(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.P0(r4, r0)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r4 = r2.a
                androidx.databinding.ViewDataBinding r4 = r4.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
                android.widget.TextView r4 = r4.tvWeather
                java.lang.String r3 = r3.getReportTime()
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r2.a
                java.lang.String r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.I0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = "发布天气:"
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = r1.toString()
                r4.setText(r3)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3 = r2.a
                com.bxkj.base.v2.base.BaseViewModel r3 = r3.C()
                com.bxkj.student.v2.vm.sports.SportsHomeVM r3 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r3
                java.lang.String r4 = r2.b
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r2.a
                java.lang.String r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.I0(r0)
                r3.D0(r4, r0)
            L5c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f implements t.b.a {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> a;

        f(kotlin.jvm.functions.Function0<kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r1, android.content.Intent r2) {
                r0 = this;
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r0.a
                r1.invoke()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class g implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;

        g(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r8) {
                r7 = this;
                if (r8 == 0) goto L14c
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r7.a
                com.bxkj.student.v2.common.utils.r$a r1 = com.bxkj.student.v2.common.utils.r.a
                java.lang.CharSequence r2 = r8.getText()
                int r2 = r1.c(r2)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.N0(r0, r2)
                java.lang.CharSequence r2 = r8.getText()
                int r2 = r1.a(r2)
                android.content.res.Resources r3 = r0.getResources()
                java.lang.String r4 = "id"
                java.lang.String r5 = "android"
                java.lang.String r6 = "statusBarBackground"
                int r3 = r3.getIdentifier(r6, r4, r5)
                android.view.Window r4 = r0.getWindow()
                android.view.View r3 = r4.findViewById(r3)
                if (r3 == 0) goto L34
                r3.setBackgroundResource(r2)
            L34:
                androidx.databinding.ViewDataBinding r3 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.llTitle
                r3.setBackgroundResource(r2)
                androidx.databinding.ViewDataBinding r3 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.clData
                r3.setBackgroundResource(r2)
                java.lang.CharSequence r3 = r8.getText()
                int r3 = r1.h(r3)
                com.amap.api.maps.model.MyLocationStyle r4 = new com.amap.api.maps.model.MyLocationStyle
                r4.<init>()
                com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r3)
                r4.myLocationIcon(r3)
                android.content.Context r3 = r0.G()
                int r3 = androidx.core.content.ContextCompat.getColor(r3, r2)
                r4.strokeColor(r3)
                java.lang.CharSequence r3 = r8.getText()
                int r3 = r1.i(r3)
                android.content.Context r5 = r0.G()
                int r3 = androidx.core.content.ContextCompat.getColor(r5, r3)
                r4.radiusFillColor(r3)
                r3 = 1065353216(0x3f800000, float:1.0)
                r4.strokeWidth(r3)
                com.amap.api.maps.AMap r3 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.D0(r0)
                if (r3 != 0) goto L8d
                java.lang.String r3 = "aMap"
                kotlin.jvm.internal.g0.S(r3)
                r3 = 0
            L8d:
                r3.setMyLocationStyle(r4)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.O0(r0)
                java.lang.CharSequence r3 = r8.getText()
                int r3 = r1.e(r3)
                androidx.databinding.ViewDataBinding r4 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
                android.widget.ImageView r4 = r4.ivDescription
                r4.setImageResource(r3)
                java.lang.CharSequence r3 = r8.getText()
                int r3 = r1.g(r3)
                androidx.databinding.ViewDataBinding r4 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
                android.widget.ImageView r4 = r4.ivStart
                r4.setImageResource(r3)
                java.lang.CharSequence r8 = r8.getText()
                int r8 = r1.f(r8)
                androidx.databinding.ViewDataBinding r3 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
                android.widget.ImageView r3 = r3.ivPermission
                r3.setImageResource(r8)
                androidx.databinding.ViewDataBinding r8 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r8 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r8
                android.widget.TextView r8 = r8.tvDescriptionV3
                android.content.Context r3 = r0.G()
                int r3 = androidx.core.content.ContextCompat.getColor(r3, r2)
                r8.setTextColor(r3)
                androidx.databinding.ViewDataBinding r8 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r8 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r8
                android.widget.TextView r8 = r8.tvPermissionV3
                android.content.Context r3 = r0.G()
                int r3 = androidx.core.content.ContextCompat.getColor(r3, r2)
                r8.setTextColor(r3)
                androidx.databinding.ViewDataBinding r8 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r8 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r8
                android.widget.TextView r8 = r8.tvWeather
                android.content.Context r3 = r0.G()
                int r2 = androidx.core.content.ContextCompat.getColor(r3, r2)
                r8.setTextColor(r2)
                int r8 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.E0(r0)
                int r2 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.G0(r0)
                int r8 = com.bxkj.student.run.app.utils.i.u(r8, r2)
                androidx.databinding.ViewDataBinding r2 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r2 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r2
                android.widget.TextView r2 = r2.tvGps
                r3 = 2131690189(0x7f0f02cd, float:1.9009415E38)
                if (r8 != r3) goto L12a
                android.content.Context r1 = r0.G()
                r3 = 2131100524(0x7f06036c, float:1.7813432E38)
                int r1 = androidx.core.content.ContextCompat.getColor(r1, r3)
                goto L13e
            L12a:
                android.content.Context r3 = r0.G()
                int r4 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.G0(r0)
                java.lang.String r4 = r1.d(r4)
                int r1 = r1.a(r4)
                int r1 = androidx.core.content.ContextCompat.getColor(r3, r1)
            L13e:
                r2.setTextColor(r1)
                androidx.databinding.ViewDataBinding r0 = r0.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
                androidx.appcompat.widget.AppCompatImageView r0 = r0.ivGps
                r0.setImageResource(r8)
            L14c:
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class h implements t.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

        h(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r2, android.content.Intent r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2 = r1.a
                java.util.Map<java.lang.String, java.lang.Object> r3 = r1.b
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.c
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.J0(r2, r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class i implements androidx.lifecycle.Observer, kotlin.jvm.internal.b0 {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        i(kotlin.jvm.functions.Function1 r2) {
                r1 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.lifecycle.Observer
                r1 = 0
                if (r0 == 0) goto L18
                boolean r0 = r3 instanceof kotlin.jvm.internal.b0
                if (r0 == 0) goto L18
                kotlin.n r0 = r2.getFunctionDelegate()
                kotlin.jvm.internal.b0 r3 = (kotlin.jvm.internal.b0) r3
                kotlin.n r3 = r3.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L18:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.n<?> getFunctionDelegate() {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                return r0
        }

        public final int hashCode() {
                r1 = this;
                kotlin.n r0 = r1.getFunctionDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        public final /* synthetic */ void onChanged(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1 r0 = r1.a
                r0.invoke(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3SportsHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3SportsHomeActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/V3SportsHomeActivity$selectRemark$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1255:1\n1#2:1256\n*E\n"})
    public static final class j implements com.bxkj.base.v2.view.a.b {
        final /* synthetic */ java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a;
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

        j(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.v2.view.a.b
        public void onMenuClick(java.lang.String r7) {
                r6 = this;
                java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                r3 = r1
                java.util.Map r3 = (java.util.Map) r3
                com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r5 = "name"
                java.lang.String r3 = r4.t(r3, r5)
                boolean r3 = kotlin.jvm.internal.g0.g(r3, r7)
                if (r3 == 0) goto L8
                goto L26
            L25:
                r1 = r2
            L26:
                java.util.Map r1 = (java.util.Map) r1
                if (r1 == 0) goto L47
                boolean r7 = r1.isEmpty()
                if (r7 != 0) goto L31
                r2 = r1
            L31:
                if (r2 == 0) goto L47
                java.util.Map<java.lang.String, java.lang.Object> r7 = r6.b
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r6.c
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r3 = "id"
                java.lang.String r1 = r1.t(r2, r3)
                java.lang.String r2 = "remarkId"
                r7.put(r2, r1)
                r0.invoke()
            L47:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nV3SportsHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V3SportsHomeActivity.kt\ncom/bxkj/student/v2/ui/sports/v3/V3SportsHomeActivity$setUpMap$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1255:1\n1#2:1256\n*E\n"})
    public static final class k implements com.amap.api.maps.LocationSource {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;

        k(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.amap.api.maps.LocationSource.OnLocationChangedListener r0, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, com.amap.api.location.AMapLocation r2) {
                b(r0, r1, r2)
                return
        }

        private static final void b(com.amap.api.maps.LocationSource.OnLocationChangedListener r5, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r6, com.amap.api.location.AMapLocation r7) {
                r5.onLocationChanged(r7)
                int r5 = r7.getGpsAccuracyStatus()
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.L0(r6, r5)
                int r5 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.E0(r6)
                int r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.G0(r6)
                int r5 = com.bxkj.student.run.app.utils.i.u(r5, r0)
                androidx.databinding.ViewDataBinding r0 = r6.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
                android.widget.TextView r0 = r0.tvGps
                r1 = 2131690189(0x7f0f02cd, float:1.9009415E38)
                if (r5 != r1) goto L2f
                android.content.Context r1 = r6.G()
                r2 = 2131100524(0x7f06036c, float:1.7813432E38)
                int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
                goto L45
            L2f:
                android.content.Context r1 = r6.G()
                com.bxkj.student.v2.common.utils.r$a r2 = com.bxkj.student.v2.common.utils.r.a
                int r3 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.G0(r6)
                java.lang.String r3 = r2.d(r3)
                int r2 = r2.a(r3)
                int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            L45:
                r0.setTextColor(r1)
                androidx.databinding.ViewDataBinding r0 = r6.K()
                com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
                androidx.appcompat.widget.AppCompatImageView r0 = r0.ivGps
                r0.setImageResource(r5)
                int r5 = r7.getErrorCode()
                r0 = 0
                if (r5 != 0) goto L5c
                r5 = r7
                goto L5d
            L5c:
                r5 = r0
            L5d:
                if (r5 == 0) goto La9
                com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
                double r1 = r7.getLatitude()
                double r3 = r7.getLongitude()
                r5.<init>(r1, r3)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.K0(r6, r5)
                com.amap.api.maps.AMap r5 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.D0(r6)
                if (r5 != 0) goto L7b
                java.lang.String r5 = "aMap"
                kotlin.jvm.internal.g0.S(r5)
                goto L7c
            L7b:
                r0 = r5
            L7c:
                com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
                double r1 = r7.getLatitude()
                double r3 = r7.getLongitude()
                r5.<init>(r1, r3)
                com.amap.api.maps.CameraUpdate r5 = com.amap.api.maps.CameraUpdateFactory.newLatLng(r5)
                r0.animateCamera(r5)
                java.lang.String r5 = r7.getCity()
                java.lang.String r0 = "getCity(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                int r5 = r5.length()
                if (r5 <= 0) goto La9
                java.lang.String r5 = r7.getCity()
                kotlin.jvm.internal.g0.o(r5, r0)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.H0(r6, r5)
            La9:
                return
        }

        public void activate(com.amap.api.maps.LocationSource.OnLocationChangedListener r4) {
                r3 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r3.a
                com.amap.api.location.AMapLocationClient r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.F0(r0)
                if (r0 != 0) goto L53
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r3.a
                com.amap.api.location.AMapLocationClient r1 = new com.amap.api.location.AMapLocationClient
                com.bxkj.student.App$a r2 = com.bxkj.student.App.d
                com.bxkj.student.App r2 = r2.a()
                r1.<init>(r2)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.M0(r0, r1)
                com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
                r0.<init>()
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
                r0.setLocationMode(r1)
                r1 = 0
                r0.setMockEnable(r1)
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1 = r3.a
                com.amap.api.location.AMapLocationClient r1 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.F0(r1)
                if (r1 == 0) goto L36
                r1.setLocationOption(r0)
            L36:
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r3.a
                com.amap.api.location.AMapLocationClient r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.F0(r0)
                if (r0 == 0) goto L48
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1 = r3.a
                com.bxkj.student.v2.ui.sports.v3.o1 r2 = new com.bxkj.student.v2.ui.sports.v3.o1
                r2.<init>(r4, r1)
                r0.setLocationListener(r2)
            L48:
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r4 = r3.a
                com.amap.api.location.AMapLocationClient r4 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.F0(r4)
                if (r4 == 0) goto L53
                r4.startLocation()
            L53:
                return
        }

        public void deactivate() {
                r2 = this;
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r2.a
                com.amap.api.location.AMapLocationClient r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.F0(r0)
                if (r0 == 0) goto Lb
                r0.stopLocation()
            Lb:
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r2.a
                com.amap.api.location.AMapLocationClient r0 = com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.F0(r0)
                if (r0 == 0) goto L16
                r0.onDestroy()
            L16:
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0 = r2.a
                r1 = 0
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.M0(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class l implements t.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity a;
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> b;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> c;

        l(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r2, android.content.Intent r3) {
                r1 = this;
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2 = r1.a
                java.util.Map<java.lang.String, java.lang.Object> r3 = r1.b
                kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.c
                com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity.Q0(r2, r3, r0)
                return
        }
    }

    static {
            r0 = 17991(0x4647, float:2.5211E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public V3SportsHomeActivity() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.Z = r0
            r0 = 1
            r2.a0 = r0
            r0 = -1
            r2.b0 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.F0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 A0() {
            kotlin.n1 r0 = W1()
            return r0
    }

    private static final kotlin.n1 A1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r5, java.util.Map r6) {
            if (r6 == 0) goto L84
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "identify"
            java.lang.String r1 = r0.t(r6, r1)
            java.lang.String r2 = "isFromLocalToContinue"
            boolean r2 = r0.d(r6, r2)
            r3 = 0
            if (r2 != 0) goto L15
            r2 = r6
            goto L16
        L15:
            r2 = r3
        L16:
            if (r2 == 0) goto L21
            com.bxkj.base.v2.base.BaseViewModel r2 = r5.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r2 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r2
            r2.f0(r1)
        L21:
            java.lang.String r1 = "needRegisterFace"
            int r1 = r0.k(r6, r1)
            r2 = 1
            if (r1 != r2) goto L35
            com.bxkj.student.v2.ui.sports.v3.m r0 = new com.bxkj.student.v2.ui.sports.v3.m
            r0.<init>(r5, r6)
            java.lang.String r6 = "对不起您未上传人脸照片，请先进行人脸采集！"
            com.bxkj.base.v2.common.ext.ContextExtKt.o(r5, r6, r0)
            goto L84
        L35:
            java.lang.String r1 = "limitWeather"
            java.lang.String r0 = r0.t(r6, r1)
            java.lang.String r1 = "1"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L7f
            java.lang.String r0 = r5.Z
            java.lang.String r1 = "雨"
            r2 = 0
            r4 = 2
            boolean r0 = kotlin.text.u.l3(r0, r1, r2, r4, r3)
            if (r0 != 0) goto L63
            java.lang.String r0 = r5.Z
            java.lang.String r1 = "雪"
            boolean r0 = kotlin.text.u.l3(r0, r1, r2, r4, r3)
            if (r0 != 0) goto L63
            java.lang.String r0 = r5.Z
            java.lang.String r1 = "霾"
            boolean r0 = kotlin.text.u.l3(r0, r1, r2, r4, r3)
            if (r0 == 0) goto L7f
        L63:
            java.lang.String r6 = r5.Z
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "当前天气："
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ",不能进行锻炼"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.bxkj.base.v2.common.ext.ContextExtKt.m(r5, r6)
            goto L84
        L7f:
            r5.X1(r6)
            kotlin.n1 r5 = kotlin.n1.a
        L84:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    public static /* synthetic */ kotlin.n1 B0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = e2(r0, r1)
            return r0
    }

    private static final kotlin.n1 B1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r5, r0)
            r5.dismiss()
            com.bxkj.student.v2.common.utils.h r5 = com.bxkj.student.v2.common.utils.h.a
            android.content.Context r3 = r3.G()
            java.lang.String r0 = "name"
            java.lang.String r1 = "人脸管理"
            kotlin.Pair r0 = kotlin.o0.a(r0, r1)
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "faceUrl"
            java.lang.String r4 = r1.t(r4, r2)
            java.lang.String r1 = "linkUrl"
            kotlin.Pair r4 = kotlin.o0.a(r1, r4)
            r1 = 2
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.util.Map r4 = kotlin.collections.i1.j0(r1)
            r5.b(r3, r4)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    public static final /* synthetic */ void C0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2) {
            r0.g1(r1, r2)
            return
    }

    private static final kotlin.n1 C1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            r3.M1()
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isShow"
            int r0 = r0.k(r4, r1)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r4 = r2
        L11:
            if (r4 == 0) goto L39
            java.lang.String r0 = "早操跑"
            com.google.android.material.tabs.TabLayout$Tab r1 = r3.h1(r0)
            if (r1 != 0) goto L1c
            r2 = r4
        L1c:
            if (r2 == 0) goto L39
            androidx.databinding.ViewDataBinding r4 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            androidx.databinding.ViewDataBinding r3 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r0)
            r4.addTab(r3)
        L39:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    public static final /* synthetic */ com.amap.api.maps.AMap D0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0) {
            com.amap.api.maps.AMap r0 = r0.W
            return r0
    }

    public static final /* synthetic */ int E0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0) {
            int r0 = r0.b0
            return r0
    }

    private final void E1() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.v0 r0 = new com.bxkj.student.v2.ui.sports.v3.v0
            r0.<init>()
            com.bxkj.base.v2.common.ext.t.y(r1, r0)
            return
    }

    public static final /* synthetic */ com.amap.api.location.AMapLocationClient F0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0) {
            com.amap.api.location.AMapLocationClient r0 = r0.Y
            return r0
    }

    private static final kotlin.n1 F1() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static final /* synthetic */ int G0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0) {
            int r0 = r0.a0
            return r0
    }

    private final void G1(java.util.Map<java.lang.String, java.lang.Object> r11, kotlin.jvm.functions.Function0<kotlin.n1> r12) {
            r10 = this;
            android.content.Context r0 = r10.G()
            boolean r0 = com.bxkj.base.util.u.a(r0)
            if (r0 != 0) goto L22
            com.bxkj.student.v2.ui.sports.v3.p r4 = new com.bxkj.student.v2.ui.sports.v3.p
            r4.<init>(r10, r11, r12)
            com.bxkj.student.v2.ui.sports.v3.q r5 = new com.bxkj.student.v2.ui.sports.v3.q
            r5.<init>()
            r8 = 48
            r9 = 0
            java.lang.String r2 = "允许体适能推送通知未开启"
            java.lang.String r3 = "为了能够让你在锻炼过程中不错过重要的通知消息,必须开启允许推送通知功能"
            r6 = 0
            r7 = 0
            r1 = r10
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L22:
            r12.invoke()
            return
    }

    public static final /* synthetic */ void H0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.lang.String r1) {
            r0.k1(r1)
            return
    }

    private static final kotlin.n1 H1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2, kotlin.jvm.functions.Function0 r3, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r4, r0)
            r4.dismiss()
            androidx.fragment.app.FragmentActivity r4 = r1.q()
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$h r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$h
            r0.<init>(r1, r2, r3)
            com.bxkj.base.util.u.c(r4, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static final /* synthetic */ java.lang.String I0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0) {
            java.lang.String r0 = r0.Z
            return r0
    }

    private static final kotlin.n1 I1(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.dismiss()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static final /* synthetic */ void J0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2) {
            r0.G1(r1, r2)
            return
    }

    private final void J1(java.util.Map<java.lang.String, java.lang.Object> r7, kotlin.jvm.functions.Function0<kotlin.n1> r8) {
            r6 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isFromLocalToContinue"
            boolean r1 = r0.d(r7, r1)
            if (r1 == 0) goto Le
            r8.invoke()
            return
        Le:
            java.lang.String r1 = "serverUnavailable"
            boolean r1 = r0.d(r7, r1)
            if (r1 == 0) goto L1a
            r8.invoke()
            return
        L1a:
            java.lang.String r1 = "remarks"
            java.util.List r1 = r0.n(r7, r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2a
            r8.invoke()
            return
        L2a:
            java.lang.String r2 = "remarksContext"
            java.lang.String r3 = "请根据实际情况选择跑步备注"
            java.lang.String r0 = r0.u(r7, r2, r3)
            com.bxkj.base.v2.view.a r2 = new com.bxkj.base.v2.view.a
            androidx.fragment.app.FragmentActivity r3 = r6.q()
            r2.<init>(r3)
            r2.i(r0)
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "name"
            java.lang.String r3 = r4.t(r3, r5)
            r2.c(r3)
            goto L45
        L5d:
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$j r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$j
            r0.<init>(r1, r7, r8)
            r2.g(r0)
            java.lang.String r7 = "取消"
            r2.h(r7)
            r2.show()
            return
    }

    public static final /* synthetic */ void K0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, com.amap.api.maps.model.LatLng r1) {
            r0.f1447p0 = r1
            return
    }

    public static /* synthetic */ kotlin.n1 L(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = w1(r0, r1)
            return r0
    }

    public static final /* synthetic */ void L0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, int r1) {
            r0.b0 = r1
            return
    }

    public static /* synthetic */ kotlin.n1 M(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = f2(r0, r1)
            return r0
    }

    public static final /* synthetic */ void M0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, com.amap.api.location.AMapLocationClient r1) {
            r0.Y = r1
            return
    }

    private final void M1() {
            r3 = this;
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.bxkj.base.v2.base.BaseViewModel r1 = r3.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r1 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r1
            int r2 = r3.a0
            java.util.Map r1 = r1.g0(r2)
            r0.setRecordMap(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 N(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, android.app.Dialog r2, androidx.fragment.app.DialogFragment r3) {
            kotlin.n1 r0 = T1(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ void N0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, int r1) {
            r0.a0 = r1
            return
    }

    private final void N1() {
            r4 = this;
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.amap.api.maps.MapView r0 = r0.map
            com.amap.api.maps.AMap r0 = r0.getMap()
            java.lang.String r1 = "getMap(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r4.W = r0
            com.amap.api.maps.model.MyLocationStyle r0 = new com.amap.api.maps.model.MyLocationStyle
            r0.<init>()
            r1 = 2131689901(0x7f0f01ad, float:1.900883E38)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r1)
            r0.myLocationIcon(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.strokeColor(r1)
            r1 = 0
            r2 = 180(0xb4, float:2.52E-43)
            r3 = 100
            int r1 = android.graphics.Color.argb(r3, r1, r1, r2)
            r0.radiusFillColor(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.strokeWidth(r1)
            r1 = 5
            r0.myLocationType(r1)
            com.amap.api.maps.AMap r1 = r4.W
            r2 = 0
            java.lang.String r3 = "aMap"
            if (r1 != 0) goto L47
            kotlin.jvm.internal.g0.S(r3)
            r1 = r2
        L47:
            r1.setMyLocationStyle(r0)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$k r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$k
            r0.<init>(r4)
            r4.X = r0
            com.amap.api.maps.AMap r0 = r4.W
            if (r0 != 0) goto L59
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L59:
            com.amap.api.maps.LocationSource r1 = r4.X
            r0.setLocationSource(r1)
            com.amap.api.maps.AMap r0 = r4.W
            if (r0 != 0) goto L66
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L66:
            com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
            r1 = 1
            r0.setMyLocationButtonEnabled(r1)
            com.amap.api.maps.AMap r0 = r4.W
            if (r0 != 0) goto L76
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L76:
            r0.setMyLocationEnabled(r1)
            r0 = 1100480512(0x41980000, float:19.0)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.zoomTo(r0)
            com.amap.api.maps.AMap r1 = r4.W
            if (r1 != 0) goto L87
            kotlin.jvm.internal.g0.S(r3)
            goto L88
        L87:
            r2 = r1
        L88:
            r2.moveCamera(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 O(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = Y0(r0)
            return r0
    }

    public static final /* synthetic */ void O0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0) {
            r0.M1()
            return
    }

    public static /* synthetic */ kotlin.n1 P(com.bxkj.base.v2.base.p r0) {
            kotlin.n1 r0 = f1(r0)
            return r0
    }

    public static final /* synthetic */ void P0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.lang.String r1) {
            r0.Z = r1
            return
    }

    public static /* synthetic */ void P1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, android.app.Dialog r2, androidx.fragment.app.DialogFragment r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.O1(r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlin.n1 Q(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            kotlin.n1 r0 = z1(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ void Q0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2) {
            r0.n2(r1, r2)
            return
    }

    private static final kotlin.n1 Q1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, android.app.Dialog r2) {
            r0.S1(r1, r2)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 R(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = A1(r0, r1)
            return r0
    }

    private final void R0(java.util.Map<java.lang.String, java.lang.Object> r13, kotlin.jvm.functions.Function0<kotlin.n1> r14) {
            r12 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isFromLocalToContinue"
            boolean r1 = r0.d(r13, r1)
            if (r1 == 0) goto Le
            r14.invoke()
            return
        Le:
            java.lang.String r1 = "serverUnavailable"
            boolean r1 = r0.d(r13, r1)
            if (r1 == 0) goto L1a
            r14.invoke()
            return
        L1a:
            java.lang.String r1 = "countAlertMsg"
            java.lang.String r2 = r0.t(r13, r1)
            boolean r2 = kotlin.text.u.M3(r2)
            if (r2 == 0) goto L2a
            r14.invoke()
            return
        L2a:
            java.lang.String r5 = r0.t(r13, r1)
            com.bxkj.student.v2.ui.sports.v3.u0 r6 = new com.bxkj.student.v2.ui.sports.v3.u0
            r6.<init>(r14)
            r10 = 8
            r11 = 0
            java.lang.String r4 = "温馨提示"
            r7 = 0
            java.lang.String r8 = "取消跑步"
            java.lang.String r9 = "继续跑步"
            r3 = r12
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    private static final kotlin.n1 R1(android.app.Dialog r0, androidx.fragment.app.DialogFragment r1) {
            r0.dismiss()
            if (r1 == 0) goto L8
            r1.dismiss()
        L8:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 S(kotlin.jvm.functions.Function0 r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = S0(r0, r1)
            return r0
    }

    private static final kotlin.n1 S0(kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.invoke()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 T() {
            kotlin.n1 r0 = V1()
            return r0
    }

    private final void T0(java.util.Map<java.lang.String, java.lang.Object> r7, kotlin.jvm.functions.Function0<kotlin.n1> r8) {
            r6 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isFromLocalToContinue"
            boolean r1 = r0.d(r7, r1)
            if (r1 == 0) goto Le
            r8.invoke()
            return
        Le:
            java.lang.String r1 = "campusList"
            java.util.List r1 = r0.n(r7, r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1e
            r8.invoke()
            return
        L1e:
            int r2 = r1.size()
            r3 = 1
            if (r2 > r3) goto L43
            java.lang.Object r1 = kotlin.collections.f0.G2(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "point"
            java.util.List r2 = r0.n(r1, r2)
            java.lang.String r3 = "context"
            java.lang.String r0 = r0.t(r1, r3)
            java.lang.String r1 = "list"
            r7.put(r1, r2)
            r7.put(r3, r0)
            r8.invoke()
            return
        L43:
            com.bxkj.base.v2.view.a r0 = new com.bxkj.base.v2.view.a
            androidx.fragment.app.FragmentActivity r2 = r6.q()
            r0.<init>(r2)
            java.lang.String r2 = "请选择要锻炼的校区"
            r0.i(r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            com.bxkj.base.v2.common.utils.x r4 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r5 = "name"
            java.lang.String r3 = r4.t(r3, r5)
            r0.c(r3)
            goto L58
        L70:
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$a r2 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$a
            r2.<init>(r1, r7, r8)
            r0.g(r2)
            java.lang.String r7 = "取消"
            r0.h(r7)
            r0.show()
            return
    }

    private static final kotlin.n1 T1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, l0.d r2, android.app.Dialog r3, androidx.fragment.app.DialogFragment r4) {
            java.lang.String r0 = "faceOutDialog"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.O1(r2, r3, r4)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 U(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = m2(r0)
            return r0
    }

    private final void U0(java.util.Map<java.lang.String, java.lang.Object> r1, kotlin.jvm.functions.Function0<kotlin.n1> r2) {
            r0 = this;
            com.bxkj.student.v2.ui.sports.v3.o0 r1 = new com.bxkj.student.v2.ui.sports.v3.o0
            r1.<init>(r2)
            com.bxkj.base.v2.common.ext.t.m(r0, r1)
            return
    }

    private static final kotlin.n1 U1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, l0.d r2, long r3, androidx.fragment.app.DialogFragment r5) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.fragment.app.DialogFragment r5 = r1.H0
            if (r5 == 0) goto Lc
            r5.dismiss()
        Lc:
            com.bxkj.base.v2.base.p r5 = new com.bxkj.base.v2.base.p
            android.content.Context r0 = r1.G()
            r5.<init>(r0)
            java.lang.String r0 = "加载中..."
            com.bxkj.base.v2.base.p r5 = r5.e(r0)
            android.app.Dialog r5 = r5.h()
            r1.I0 = r5
            com.bxkj.base.v2.base.BaseViewModel r5 = r1.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r5 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r5
            com.bxkj.student.v2.ui.sports.v3.e1 r0 = new com.bxkj.student.v2.ui.sports.v3.e1
            r0.<init>()
            r5.p0(r2, r0)
            r1.G0 = r3
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 V(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = d2(r0, r1)
            return r0
    }

    private static final kotlin.n1 V0(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 V1() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 W(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            kotlin.n1 r0 = H1(r0, r1, r2, r3)
            return r0
    }

    private final void W0(java.util.Map<java.lang.String, java.lang.Object> r10, kotlin.jvm.functions.Function0<kotlin.n1> r11) {
            r9 = this;
            java.lang.String r10 = "power"
            java.lang.Object r10 = r9.getSystemService(r10)
            java.lang.String r0 = "null cannot be cast to non-null type android.os.PowerManager"
            kotlin.jvm.internal.g0.n(r10, r0)
            android.os.PowerManager r10 = (android.os.PowerManager) r10
            boolean r10 = r10.isPowerSaveMode()
            if (r10 == 0) goto L2b
            com.bxkj.student.v2.ui.sports.v3.w0 r3 = new com.bxkj.student.v2.ui.sports.v3.w0
            r3.<init>(r9, r11)
            com.bxkj.student.v2.ui.sports.v3.x0 r4 = new com.bxkj.student.v2.ui.sports.v3.x0
            r4.<init>()
            r7 = 48
            r8 = 0
            java.lang.String r1 = "请勿开启省电模式"
            java.lang.String r2 = "开始锻炼前请关闭省电模式，否则轨迹记录可能不准确！"
            r5 = 0
            r6 = 0
            r0 = r9
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L2b:
            r11.invoke()
            return
    }

    private static final kotlin.n1 W1() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 X(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.List r1) {
            kotlin.n1 r0 = t1(r0, r1)
            return r0
    }

    private static final kotlin.n1 X0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r3, r0)
            r3.dismiss()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.settings.BATTERY_SAVER_SETTINGS"
            r3.<init>(r0)
            t.b r0 = new t.b
            r0.<init>(r1)
            t.b r1 = r0.startActivityForResult(r3)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$b r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$b
            r3.<init>(r2)
            r1.c(r3)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void X1(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.g1 r0 = new com.bxkj.student.v2.ui.sports.v3.g1
            r0.<init>(r1, r2)
            r1.Z0(r2, r0)
            return
    }

    public static /* synthetic */ kotlin.n1 Y(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            kotlin.n1 r0 = X0(r0, r1, r2)
            return r0
    }

    private static final kotlin.n1 Y0(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.dismiss()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 Y1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.i1 r0 = new com.bxkj.student.v2.ui.sports.v3.i1
            r0.<init>(r1, r2)
            r1.d1(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 Z() {
            kotlin.n1 r0 = F1()
            return r0
    }

    private final void Z0(java.util.Map<java.lang.String, java.lang.Object> r10, kotlin.jvm.functions.Function0<kotlin.n1> r11) {
            r9 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "sendFace"
            java.lang.String r4 = r0.t(r10, r1)
            boolean r10 = kotlin.text.u.M3(r4)
            if (r10 != 0) goto L36
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.bxkj.student.v2.ui.sports.v3.q0 r5 = new com.bxkj.student.v2.ui.sports.v3.q0
            r5.<init>(r10, r9, r11)
            com.bxkj.student.v2.ui.sports.v3.r0 r6 = new com.bxkj.student.v2.ui.sports.v3.r0
            r6.<init>(r9)
            java.lang.String r7 = "取消跑步"
            java.lang.String r8 = "继续跑步"
            java.lang.String r3 = "温馨提示"
            r2 = r9
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r11 = com.bxkj.base.v2.common.ext.ContextExtKt.g(r2, r3, r4, r5, r6, r7, r8)
            r0 = 2131296668(0x7f09019c, float:1.821126E38)
            android.view.View r0 = r11.findViewById(r0)
            r10.element = r0
            r10 = 0
            r11.setClickAutoCancel(r10)
            return
        L36:
            r11.invoke()
            return
    }

    private static final kotlin.n1 Z1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.s0 r0 = new com.bxkj.student.v2.ui.sports.v3.s0
            r0.<init>(r1, r2)
            r1.r2(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 a0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, kotlin.jvm.functions.Function0 r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2, java.lang.Object r3) {
            kotlin.n1 r0 = b1(r0, r1, r2, r3)
            return r0
    }

    private static final kotlin.n1 a1(kotlin.jvm.internal.Ref.ObjectRef r8, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r9, kotlin.jvm.functions.Function0 r10, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r11) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.Object r0 = r8.element
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto Lf
            r1 = 0
            r0.setEnabled(r1)
        Lf:
            java.lang.Object r0 = r8.element
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L1e
            java.lang.String r1 = "#999999"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
        L1e:
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r9)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$c r5 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$c
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.e2 r8 = kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            r9.J0 = r8
            com.bxkj.base.v2.base.BaseViewModel r8 = r9.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r8 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r8
            com.bxkj.student.v2.ui.sports.v3.n r0 = new com.bxkj.student.v2.ui.sports.v3.n
            r0.<init>(r9, r10, r11)
            r8.L(r0)
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }

    private static final kotlin.n1 a2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.p0 r0 = new com.bxkj.student.v2.ui.sports.v3.p0
            r0.<init>(r1, r2)
            r1.U0(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 b0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1) {
            kotlin.n1 r0 = u2(r0, r1)
            return r0
    }

    private static final kotlin.n1 b1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3, java.lang.Object r4) {
            kotlinx.coroutines.e2 r1 = r1.J0
            if (r1 == 0) goto L9
            r4 = 1
            r0 = 0
            kotlinx.coroutines.e2.a.b(r1, r0, r4, r0)
        L9:
            r2.invoke()
            r3.dismiss()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 b2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.o r0 = new com.bxkj.student.v2.ui.sports.v3.o
            r0.<init>(r1, r2)
            r1.g1(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 c0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = p1(r0, r1)
            return r0
    }

    private static final kotlin.n1 c1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlinx.coroutines.e2 r2 = r2.J0
            if (r2 == 0) goto Le
            r0 = 1
            r1 = 0
            kotlinx.coroutines.e2.a.b(r2, r1, r0, r1)
        Le:
            r3.dismiss()
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 c2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.h0 r0 = new com.bxkj.student.v2.ui.sports.v3.h0
            r0.<init>(r1, r2)
            r1.n2(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 d0(com.bxkj.base.v2.base.p r0, kotlin.jvm.functions.Function0 r1) {
            kotlin.n1 r0 = e1(r0, r1)
            return r0
    }

    private final void d1(java.util.Map<java.lang.String, java.lang.Object> r4, kotlin.jvm.functions.Function0<kotlin.n1> r5) {
            r3 = this;
            com.bxkj.base.v2.base.p r4 = new com.bxkj.base.v2.base.p
            androidx.fragment.app.FragmentActivity r0 = r3.q()
            r4.<init>(r0)
            r4.h()
            com.bxkj.student.v2.common.utils.p$a r0 = com.bxkj.student.v2.common.utils.p.a
            androidx.fragment.app.FragmentActivity r1 = r3.q()
            com.bxkj.student.v2.ui.sports.v3.f0 r2 = new com.bxkj.student.v2.ui.sports.v3.f0
            r2.<init>(r4, r5)
            com.bxkj.student.v2.ui.sports.v3.g0 r5 = new com.bxkj.student.v2.ui.sports.v3.g0
            r5.<init>(r4)
            r0.c(r1, r2, r5)
            return
    }

    private static final kotlin.n1 d2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.j1 r0 = new com.bxkj.student.v2.ui.sports.v3.j1
            r0.<init>(r1, r2)
            r1.G1(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 e(android.app.Dialog r0, androidx.fragment.app.DialogFragment r1) {
            kotlin.n1 r0 = R1(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 e0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = C1(r0, r1)
            return r0
    }

    private static final kotlin.n1 e1(com.bxkj.base.v2.base.p r0, kotlin.jvm.functions.Function0 r1) {
            r0.b()
            r1.invoke()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 e2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.f1 r0 = new com.bxkj.student.v2.ui.sports.v3.f1
            r0.<init>(r1, r2)
            r1.W0(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = Z1(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = Y1(r0, r1)
            return r0
    }

    private static final kotlin.n1 f1(com.bxkj.base.v2.base.p r0) {
            r0.b()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 f2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.i0 r0 = new com.bxkj.student.v2.ui.sports.v3.i0
            r0.<init>(r1, r2)
            r1.R0(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 g(kotlin.jvm.functions.Function0 r0, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            kotlin.n1 r0 = s2(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g0(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = v1(r0)
            return r0
    }

    private final void g1(java.util.Map<java.lang.String, java.lang.Object> r3, kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto La
            r4.invoke()
            return
        La:
            s.b r0 = new s.b
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.<init>(r1)
            java.lang.String r1 = "android.permission.ACTIVITY_RECOGNITION"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            s.b r0 = r0.c(r1)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$d r1 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$d
            r1.<init>(r2, r3, r4)
            r0.d(r1)
            return
    }

    private static final kotlin.n1 g2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.d1 r0 = new com.bxkj.student.v2.ui.sports.v3.d1
            r0.<init>(r1, r2)
            r1.T0(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            kotlin.n1 r0 = y1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 h0(kotlin.jvm.internal.Ref.ObjectRef r0, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            kotlin.n1 r0 = a1(r0, r1, r2, r3)
            return r0
    }

    private final com.google.android.material.tabs.TabLayout.Tab h1(java.lang.String r6) {
            r5 = this;
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tab
            int r0 = r0.getTabCount()
            r1 = 0
            r2 = 0
            r3 = r1
        Lf:
            if (r2 >= r0) goto L3a
            androidx.databinding.ViewDataBinding r4 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            com.google.android.material.tabs.TabLayout$Tab r4 = r4.getTabAt(r2)
            if (r4 == 0) goto L24
            java.lang.CharSequence r4 = r4.getText()
            goto L25
        L24:
            r4 = r1
        L25:
            boolean r4 = kotlin.jvm.internal.g0.g(r6, r4)
            if (r4 == 0) goto L37
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.getTabAt(r2)
        L37:
            int r2 = r2 + 1
            goto Lf
        L3a:
            return r3
    }

    private static final kotlin.n1 h2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            com.bxkj.student.v2.ui.sports.v3.k1 r0 = new com.bxkj.student.v2.ui.sports.v3.k1
            r0.<init>(r1, r2)
            r1.J1(r2, r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 i(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = p2(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 i0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = c2(r0, r1)
            return r0
    }

    private static final kotlin.n1 i2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            r0.j2(r1)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = b2(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 j0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.List r1) {
            kotlin.n1 r0 = x1(r0, r1)
            return r0
    }

    private final void j2(java.util.Map<java.lang.String, java.lang.Object> r12) {
            r11 = this;
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isStartFace"
            int r1 = r0.k(r12, r1)
            r2 = 1
            if (r1 != r2) goto L53
            java.lang.String r1 = "isFromLocalToContinue"
            boolean r1 = r0.d(r12, r1)
            if (r1 != 0) goto L53
            androidx.fragment.app.FragmentActivity r2 = r11.q()
            com.bxkj.student.v2.common.utils.r$a r1 = com.bxkj.student.v2.common.utils.r.a
            java.lang.String r3 = "runType"
            int r0 = r0.k(r12, r3)
            java.lang.String r0 = r1.d(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "开始前，请先进行人脸识别!\n请注意周边环境是否安全！"
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            com.bxkj.student.v2.ui.sports.v3.b1 r5 = new com.bxkj.student.v2.ui.sports.v3.b1
            r5.<init>(r11, r12)
            com.bxkj.student.v2.ui.sports.v3.c1 r6 = new com.bxkj.student.v2.ui.sports.v3.c1
            r6.<init>()
            r9 = 49
            r10 = 0
            r3 = 0
            r7 = 0
            r8 = 0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r12 = com.bxkj.base.v2.common.ext.ContextExtKt.h(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r12.setClickAutoCancel(r0)
            r12.setCancelable(r0)
            r12.setCanceledOnTouchOutside(r0)
            return
        L53:
            r11.q2(r12)
            return
    }

    public static /* synthetic */ kotlin.n1 k(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, long r2, androidx.fragment.app.DialogFragment r4) {
            kotlin.n1 r0 = U1(r0, r1, r2, r4)
            return r0
    }

    public static /* synthetic */ kotlin.n1 k0(kotlin.jvm.functions.Function0 r0) {
            kotlin.n1 r0 = V0(r0)
            return r0
    }

    private final void k1(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.Z
            int r0 = r0.length()
            if (r0 <= 0) goto L9
            return
        L9:
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            com.bxkj.student.v2.ui.sports.v3.t0 r1 = new com.bxkj.student.v2.ui.sports.v3.t0
            r1.<init>(r2, r3)
            r0.l0(r3, r1)
            return
    }

    private static final kotlin.n1 k2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r19, java.util.Map r20, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "it"
            kotlin.jvm.internal.g0.p(r2, r3)
            com.bxkj.student.v2.common.data.PointData r4 = new com.bxkj.student.v2.common.data.PointData
            com.amap.api.maps.model.LatLng r3 = r0.f1447p0
            r5 = 0
            if (r3 == 0) goto L16
            double r7 = r3.latitude
            goto L17
        L16:
            r7 = r5
        L17:
            if (r3 == 0) goto L1b
            double r5 = r3.longitude
        L1b:
            long r9 = java.lang.System.currentTimeMillis()
            r14 = 0
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = r7
            r7 = r5
            r5 = r17
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r16)
            com.bxkj.student.v2.ui.face.FaceManger r3 = com.bxkj.student.v2.ui.face.FaceManger.a
            androidx.fragment.app.FragmentActivity r5 = r0.q()
            com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r7 = "runType"
            int r7 = r6.k(r1, r7)
            java.lang.String r8 = "livingFace"
            int r8 = r6.k(r1, r8)
            java.lang.String r9 = "identify"
            java.lang.String r9 = r6.t(r1, r9)
            com.bxkj.student.v2.ui.sports.v3.a1 r11 = new com.bxkj.student.v2.ui.sports.v3.a1
            r11.<init>(r2, r0, r1)
            r6 = r7
            r7 = r8
            java.lang.String r8 = "1"
            r10 = r4
            r4 = r3
            r4.h(r5, r6, r7, r8, r9, r10, r11)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 l(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            kotlin.n1 r0 = B1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 l0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.lang.String r1, java.util.Map r2) {
            kotlin.n1 r0 = l1(r0, r1, r2)
            return r0
    }

    private static final kotlin.n1 l1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2, java.lang.String r3, java.util.Map r4) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r4, r0)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "weather"
            java.lang.String r4 = r0.t(r4, r1)
            r2.Z = r4
            int r4 = r4.length()
            if (r4 != 0) goto L19
            r2.m1(r3)
            goto L42
        L19:
            androidx.databinding.ViewDataBinding r3 = r2.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            android.widget.TextView r3 = r3.tvWeather
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.bxkj.base.v2.common.ext.g.b(r0)
            r4.append(r0)
            java.lang.String r0 = "发布天气:"
            r4.append(r0)
            java.lang.String r2 = r2.Z
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.setText(r2)
        L42:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 l2(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            r0.dismiss()
            r1.q2(r2)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = o1(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 m0(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0) {
            kotlin.n1 r0 = I1(r0)
            return r0
    }

    private final void m1(java.lang.String r4) {
            r3 = this;
            com.amap.api.services.weather.WeatherSearchQuery r0 = new com.amap.api.services.weather.WeatherSearchQuery
            r1 = 1
            r0.<init>(r4, r1)
            com.amap.api.services.weather.WeatherSearch r1 = new com.amap.api.services.weather.WeatherSearch
            r1.<init>(r3)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$e r2 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$e
            r2.<init>(r3, r4)
            r1.setOnWeatherSearchListener(r2)
            r1.setQuery(r0)
            r1.searchWeatherAsyn()
            return
    }

    private static final kotlin.n1 m2(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.dismiss()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 n0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            kotlin.n1 r0 = k2(r0, r1, r2)
            return r0
    }

    private final void n1(java.util.Map<java.lang.String, java.lang.Object> r4, kotlin.jvm.functions.Function0<kotlin.n1> r5) {
            r3 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r4 < r0) goto L66
            java.lang.String r4 = "power"
            java.lang.Object r4 = r3.getSystemService(r4)
            java.lang.String r0 = "null cannot be cast to non-null type android.os.PowerManager"
            kotlin.jvm.internal.g0.n(r4, r0)
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            java.lang.String r0 = r3.getPackageName()
            boolean r4 = l.o.a(r4, r0)
            if (r4 != 0) goto L62
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            r4.<init>(r0)
            java.lang.String r0 = r3.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "package:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.setData(r0)
            t.b r0 = new t.b     // Catch: java.lang.Exception -> L56
            androidx.fragment.app.FragmentActivity r1 = r3.q()     // Catch: java.lang.Exception -> L56
            r0.<init>(r1)     // Catch: java.lang.Exception -> L56
            t.b r4 = r0.startActivityForResult(r4)     // Catch: java.lang.Exception -> L56
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$f r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$f     // Catch: java.lang.Exception -> L56
            r0.<init>(r5)     // Catch: java.lang.Exception -> L56
            r4.c(r0)     // Catch: java.lang.Exception -> L56
            return
        L56:
            r4 = move-exception
            java.lang.String r4 = com.bxkj.base.v2.common.ext.e.a(r4)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.orhanobut.logger.j.e(r4, r5)
            return
        L62:
            r5.invoke()
            return
        L66:
            r5.invoke()
            return
    }

    private final void n2(java.util.Map<java.lang.String, java.lang.Object> r11, kotlin.jvm.functions.Function0<kotlin.n1> r12) {
            r10 = this;
            java.lang.String r0 = "location"
            java.lang.Object r0 = r10.getSystemService(r0)
            java.lang.String r1 = "null cannot be cast to non-null type android.location.LocationManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            java.lang.String r1 = "gps"
            boolean r0 = r0.isProviderEnabled(r1)
            if (r0 != 0) goto L37
            r0 = 2131952332(0x7f1302cc, float:1.9541104E38)
            java.lang.String r3 = r10.getString(r0)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            com.bxkj.student.v2.ui.sports.v3.b0 r4 = new com.bxkj.student.v2.ui.sports.v3.b0
            r4.<init>(r10, r11, r12)
            com.bxkj.student.v2.ui.sports.v3.c0 r5 = new com.bxkj.student.v2.ui.sports.v3.c0
            r5.<init>()
            r8 = 48
            r9 = 0
            java.lang.String r2 = "GPS未开启"
            r6 = 0
            r7 = 0
            r1 = r10
            com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L37:
            r12.invoke()
            return
    }

    public static /* synthetic */ kotlin.n1 o0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, l0.d r1, android.app.Dialog r2) {
            kotlin.n1 r0 = Q1(r0, r1, r2)
            return r0
    }

    private static final kotlin.n1 o1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            java.lang.String r0 = "noticeMap"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "latestUnreadNotice="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            com.bxkj.student.v2.ui.dialog.NoticeDialog r0 = new com.bxkj.student.v2.ui.dialog.NoticeDialog
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.bxkj.base.v2.data.ParcelableMap r2 = new com.bxkj.base.v2.data.ParcelableMap
            java.util.Map r4 = kotlin.collections.i1.J0(r4)
            r2.<init>(r4)
            java.lang.String r4 = "data"
            r1.putParcelable(r4, r2)
            r0.setArguments(r1)
            androidx.fragment.app.FragmentManager r3 = r3.getSupportFragmentManager()
            java.lang.String r4 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.String r4 = "TSNDialog"
            r1 = 1
            r0.i(r3, r4, r1)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 o2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2, java.util.Map r3, kotlin.jvm.functions.Function0 r4, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r5, r0)
            r5.dismiss()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            r5.setAction(r0)
            t.b r0 = new t.b
            androidx.fragment.app.FragmentActivity r1 = r2.q()
            r0.<init>(r1)
            t.b r5 = r0.startActivityForResult(r5)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$l r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$l
            r0.<init>(r2, r3, r4)
            r5.c(r0)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public static /* synthetic */ kotlin.n1 p0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1, kotlin.jvm.functions.Function0 r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            kotlin.n1 r0 = o2(r0, r1, r2, r3)
            return r0
    }

    private static final kotlin.n1 p1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            r3.M1()
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isShow"
            int r0 = r0.k(r4, r1)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r4 = r2
        L11:
            if (r4 == 0) goto L41
            java.lang.String r0 = "阳光跑"
            com.google.android.material.tabs.TabLayout$Tab r1 = r3.h1(r0)
            if (r1 != 0) goto L1c
            r2 = r4
        L1c:
            if (r2 == 0) goto L41
            androidx.databinding.ViewDataBinding r4 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            com.google.android.material.tabs.TabLayout$Tab r4 = r4.newTab()
            com.google.android.material.tabs.TabLayout$Tab r4 = r4.setText(r0)
            java.lang.String r0 = "setText(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            androidx.databinding.ViewDataBinding r3 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            r3.addTab(r4)
            r4.select()
        L41:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 p2(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.dismiss()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 q0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = s1(r0, r1)
            return r0
    }

    private static final kotlin.n1 q1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            r3.M1()
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isShow"
            int r0 = r0.k(r4, r1)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r4 = r2
        L11:
            if (r4 == 0) goto L39
            java.lang.String r0 = "自由跑"
            com.google.android.material.tabs.TabLayout$Tab r1 = r3.h1(r0)
            if (r1 != 0) goto L1c
            r2 = r4
        L1c:
            if (r2 == 0) goto L39
            androidx.databinding.ViewDataBinding r4 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            androidx.databinding.ViewDataBinding r3 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r0)
            r4.addTab(r3)
        L39:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private final void q2(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V4SportActivity> r1 = com.bxkj.student.v2.ui.sports.v3.V4SportActivity.class
            r0.i(r1)
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r2 = r0.B()
            r2.clear()
            java.util.Map r0 = r0.B()
            r0.putAll(r4)
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "lastExerciseExplanationDate"
            java.lang.String r4 = r0.t(r4, r2)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            boolean r2 = r2.F()
            if (r2 == 0) goto L51
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r2 = r2.t()
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r2 == 0) goto L51
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r0 = r3.G()
            r4.<init>(r0, r1)
            r3.startActivity(r4)
            r4 = 2130772072(0x7f010068, float:1.7147252E38)
            r0 = 2130772073(0x7f010069, float:1.7147254E38)
            r3.overridePendingTransition(r4, r0)
            goto L71
        L51:
            com.bxkj.base.v2.data.b r1 = r0.a()
            r2 = 0
            r1.E0(r2)
            com.bxkj.base.v2.data.b r0 = r0.a()
            r0.r0(r4)
            android.content.Intent r4 = r3.getIntent()
            android.content.Context r0 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity> r1 = com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity.class
            android.content.Intent r4 = r4.setClass(r0, r1)
            r3.startActivity(r4)
        L71:
            android.app.Dialog r4 = r3.I0
            if (r4 == 0) goto L78
            r4.dismiss()
        L78:
            return
    }

    public static /* synthetic */ kotlin.n1 r0(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, java.util.Map r2) {
            kotlin.n1 r0 = l2(r0, r1, r2)
            return r0
    }

    private static final kotlin.n1 r1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            r3.M1()
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isShow"
            int r0 = r0.k(r4, r1)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r4 = r2
        L11:
            if (r4 == 0) goto L39
            java.lang.String r0 = "场地锻炼"
            com.google.android.material.tabs.TabLayout$Tab r1 = r3.h1(r0)
            if (r1 != 0) goto L1c
            r2 = r4
        L1c:
            if (r2 == 0) goto L39
            androidx.databinding.ViewDataBinding r4 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            androidx.databinding.ViewDataBinding r3 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r0)
            r4.addTab(r3)
        L39:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private final void r2(java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.l1 r0 = new com.bxkj.student.v2.ui.sports.v3.l1
            r0.<init>(r3, r1, r2)
            com.bxkj.base.v2.common.ext.t.y(r1, r0)
            return
    }

    public static /* synthetic */ kotlin.n1 s0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = r1(r0, r1)
            return r0
    }

    private static final kotlin.n1 s1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            r3.M1()
            com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r1 = "isShow"
            int r0 = r0.k(r4, r1)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r4 = r2
        L11:
            if (r4 == 0) goto L39
            java.lang.String r0 = "定向越野"
            com.google.android.material.tabs.TabLayout$Tab r1 = r3.h1(r0)
            if (r1 != 0) goto L1c
            r2 = r4
        L1c:
            if (r2 == 0) goto L39
            androidx.databinding.ViewDataBinding r4 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            androidx.databinding.ViewDataBinding r3 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r0)
            r4.addTab(r3)
        L39:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private static final kotlin.n1 s2(kotlin.jvm.functions.Function0 r2, com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r3, java.util.Map r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            r2.invoke()
            goto Ld
        La:
            r3.n2(r4, r2)
        Ld:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    public static /* synthetic */ kotlin.n1 t0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = u1(r0, r1)
            return r0
    }

    private static final kotlin.n1 t1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r10, java.util.List r11) {
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            boolean r0 = r0.Y()
            if (r0 != 0) goto Lf
            kotlin.n1 r10 = kotlin.n1.a
            return r10
        Lf:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r10.f1446k0
            r1 = 0
            if (r0 == 0) goto L21
            boolean r2 = r0.isShowing()
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L21
            r0.dismiss()
        L21:
            if (r11 == 0) goto L75
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r11 = r1
        L2e:
            if (r11 == 0) goto L75
            int r11 = r11.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "系统检测到您还有"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = "条锻炼记录在本地暂存,是否上传？"
            r0.append(r11)
            java.lang.String r3 = r0.toString()
            com.bxkj.student.v2.ui.sports.v3.y0 r4 = new com.bxkj.student.v2.ui.sports.v3.y0
            r4.<init>(r10)
            com.bxkj.student.v2.ui.sports.v3.z0 r5 = new com.bxkj.student.v2.ui.sports.v3.z0
            r5.<init>()
            r8 = 49
            r9 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r10 = com.bxkj.base.v2.common.ext.ContextExtKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 0
            r10.setCancelable(r11)
            r10.setClickAutoCancel(r11)
            r10.setCanceledOnTouchOutside(r11)
            java.lang.String r11 = "暂存本地"
            r10.setLeftButtonText(r11)
            java.lang.String r11 = "现在上传"
            r10.setRightButtonText(r11)
            r1.f1446k0 = r10
        L75:
            kotlin.n1 r10 = kotlin.n1.a
            return r10
    }

    public static /* synthetic */ kotlin.n1 u0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = g2(r0, r1)
            return r0
    }

    private static final kotlin.n1 u1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            r3.dismiss()
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity> r1 = com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            java.lang.String r0 = "toLocal"
            r1 = 1
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final kotlin.n1 u2(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.w2()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 v0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = i2(r0, r1)
            return r0
    }

    private static final kotlin.n1 v1(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.dismiss()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 w0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = h2(r0, r1)
            return r0
    }

    private static final kotlin.n1 w1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r5, java.util.Map r6) {
            android.content.Context r0 = r5.G()
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "imageRouteUrl"
            java.lang.String r2 = r1.t(r6, r2)
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.imageview.ShapeableImageView r3 = r3.ivHead
            r4 = 2131690190(0x7f0f02ce, float:1.9009417E38)
            cn.bluemobi.dylan.base.utils.o.f(r0, r2, r3, r4, r4)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r3 = "nickName"
            java.lang.String r6 = r1.t(r6, r3)
            r2.X0(r6)
            androidx.databinding.ViewDataBinding r6 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r6 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r6
            android.widget.TextView r6 = r6.tvName
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.U()
            r6.setText(r1)
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r5 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r5
            android.widget.TextView r5 = r5.tvAccount
            com.bxkj.base.v2.data.b r6 = r0.a()
            java.lang.String r6 = r6.S()
            r5.setText(r6)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    public static /* synthetic */ kotlin.n1 x0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = a2(r0, r1)
            return r0
    }

    private static final kotlin.n1 x1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r12, java.util.List r13) {
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            boolean r0 = r0.Y()
            if (r0 != 0) goto Lf
            kotlin.n1 r12 = kotlin.n1.a
            return r12
        Lf:
            r0 = 0
            r1 = 0
            if (r13 == 0) goto L45
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L1b
            r2 = r13
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r2 == 0) goto L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "没有有异常结束数据="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r12.c0
            if (r2 == 0) goto L45
            boolean r3 = r2.isShowing()
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r2 = r0
        L40:
            if (r2 == 0) goto L45
            r2.dismiss()
        L45:
            if (r13 == 0) goto L12e
            r2 = r13
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L51
            goto L52
        L51:
            r13 = r0
        L52:
            if (r13 == 0) goto L12e
            java.lang.Object r13 = r13.get(r1)
            l0.d r13 = (l0.d) r13
            if (r13 == 0) goto L12e
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r12.c0
            if (r0 == 0) goto L6b
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L6b
            goto L12e
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "有异常结束数据="
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r2)
            androidx.fragment.app.FragmentActivity r3 = r12.q()
            java.lang.String r0 = r13.W()
            java.lang.String r0 = com.bxkj.base.v2.common.utils.g.a(r0)
            java.lang.String r2 = r13.U()
            int r2 = java.lang.Integer.parseInt(r2)
            r4 = 5
            if (r2 != r4) goto L9b
            java.lang.String r2 = ""
            goto Lbd
        L9b:
            java.lang.String r2 = r13.F()
            double r4 = java.lang.Double.parseDouble(r2)
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.c(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "已运动"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "KM"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        Lbd:
            java.lang.String r4 = r13.E()
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.String r4 = com.bxkj.student.run.app.utils.i.g(r4)
            com.bxkj.student.v2.common.utils.r$a r5 = com.bxkj.student.v2.common.utils.r.a
            java.lang.String r6 = r13.U()
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.String r5 = r5.d(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "系统检测到您在"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "开始的"
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "用时"
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = "的"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = "记录异常结束,强烈建议您检查运动权限设置是否正确后尽快恢复继续锻炼"
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            com.bxkj.student.v2.ui.sports.v3.d0 r6 = new com.bxkj.student.v2.ui.sports.v3.d0
            r6.<init>(r12, r13)
            com.bxkj.student.v2.ui.sports.v3.e0 r7 = new com.bxkj.student.v2.ui.sports.v3.e0
            r7.<init>(r12, r13)
            r10 = 49
            r11 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r13 = com.bxkj.base.v2.common.ext.ContextExtKt.h(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.setCancelable(r1)
            r13.setClickAutoCancel(r1)
            r13.setCanceledOnTouchOutside(r1)
            java.lang.String r0 = "结束并上传"
            r13.setLeftButtonText(r0)
            java.lang.String r0 = "恢复继续锻炼"
            r13.setRightButtonText(r0)
            r12.c0 = r13
        L12e:
            kotlin.n1 r12 = kotlin.n1.a
            return r12
    }

    public static /* synthetic */ kotlin.n1 y0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            kotlin.n1 r0 = c1(r0, r1)
            return r0
    }

    private static final kotlin.n1 y1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r1, l0.d r2, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.S1(r2, r3)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 z0(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r0, java.util.Map r1) {
            kotlin.n1 r0 = q1(r0, r1)
            return r0
    }

    private static final kotlin.n1 z1(com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity r7, l0.d r8, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r9) {
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            P1(r1, r2, r3, r4, r5, r6)
            kotlin.n1 r7 = kotlin.n1.a
            return r7
    }

    public final void D1() {
            r1 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.d0()
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.n0()
            return
    }

    public final void K1(@org.jetbrains.annotations.Nullable android.app.Dialog r1) {
            r0 = this;
            r0.I0 = r1
            return
    }

    public final void L1(@org.jetbrains.annotations.Nullable androidx.fragment.app.DialogFragment r1) {
            r0 = this;
            r0.H0 = r1
            return
    }

    public final void O1(@org.jetbrains.annotations.NotNull l0.d r10, @org.jetbrains.annotations.NotNull android.app.Dialog r11, @org.jetbrains.annotations.Nullable androidx.fragment.app.DialogFragment r12) {
            r9 = this;
            java.lang.String r0 = "sportsDb"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "exceptionDialog"
            kotlin.jvm.internal.g0.p(r11, r0)
            com.bxkj.student.v2.common.data.i$a r0 = com.bxkj.student.v2.common.data.i.a
            java.util.Map r1 = r0.B()
            r1.clear()
            java.util.Map r1 = r0.B()
            java.lang.String r2 = r10.T()
            androidx.collection.ArrayMap r2 = cn.bluemobi.dylan.http.JsonParse.jsonToMap(r2)
            java.lang.String r3 = "jsonToMap(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.putAll(r2)
            java.util.List r1 = r0.x()
            r1.clear()
            java.util.List r1 = r0.x()
            com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r3 = r10.Q()
            java.util.List r3 = r2.z(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = kotlin.collections.f0.d6(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r1.addAll(r3)
            java.lang.String r1 = r10.W()
            long r3 = java.lang.Long.parseLong(r1)
            r0.s0(r3)
            java.lang.String r1 = r10.E()
            long r3 = java.lang.Long.parseLong(r1)
            r0.V(r3)
            java.lang.String r1 = r10.F()
            double r3 = java.lang.Double.parseDouble(r1)
            r0.X(r3)
            java.lang.String r1 = r10.c0()
            int r1 = java.lang.Integer.parseInt(r1)
            r0.l0(r1)
            java.lang.String r1 = r10.I()
            double r3 = java.lang.Double.parseDouble(r1)
            r0.Z(r3)
            java.lang.String r1 = r10.R()
            java.lang.String r3 = "null"
            r4 = 1
            boolean r3 = kotlin.text.u.a2(r1, r3, r4)
            r5 = 0
            if (r3 != 0) goto L8d
            goto L8e
        L8d:
            r1 = r5
        L8e:
            if (r1 == 0) goto Lb2
            int r3 = r1.length()
            if (r3 <= 0) goto L97
            goto L98
        L97:
            r1 = r5
        L98:
            if (r1 == 0) goto Lb2
            java.util.Map r1 = r2.A(r1)
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            java.lang.String r6 = "latitude"
            double r6 = r2.f(r1, r6)
            java.lang.String r8 = "longitude"
            double r1 = r2.f(r1, r8)
            r3.<init>(r6, r1)
            r0.p0(r3)
        Lb2:
            java.lang.String r1 = r10.L()
            int r1 = r1.length()
            if (r1 != 0) goto Lbf
            r1 = 0
            goto Lc7
        Lbf:
            java.lang.String r1 = r10.L()
            double r1 = java.lang.Double.parseDouble(r1)
        Lc7:
            r0.d0(r1)
            java.lang.String r1 = r10.F()
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.String r3 = r10.E()
            long r6 = java.lang.Long.parseLong(r3)
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.a(r1, r6)
            java.lang.String r2 = "calAvgSpeed(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.U(r1)
            java.lang.String r1 = r10.F()
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.String r3 = r10.E()
            long r6 = java.lang.Long.parseLong(r3)
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.b(r1, r6)
            java.lang.String r2 = "calPace(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.n0(r1)
            androidx.lifecycle.MutableLiveData r1 = r0.j()
            java.lang.String r2 = r10.J()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setValue(r2)
            androidx.lifecycle.MutableLiveData r1 = r0.k()
            java.lang.String r2 = r10.b0()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            r0.T()
            java.lang.String r1 = r10.N()
            java.lang.Class<com.bxkj.student.v2.common.data.PointData> r2 = com.bxkj.student.v2.common.data.PointData.class
            java.util.List r1 = com.alibaba.fastjson.JSON.parseArray(r1, r2)
            java.util.List r2 = r0.s()
            r2.clear()
            if (r1 == 0) goto L18a
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L148
            r5 = r1
        L148:
            if (r5 == 0) goto L18a
            java.util.List r2 = r0.s()
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.f0.x2(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            int r2 = r5.size()
            int r2 = r2 - r4
            java.lang.Object r2 = r5.get(r2)
            com.bxkj.student.v2.common.data.PointData r2 = (com.bxkj.student.v2.common.data.PointData) r2
            if (r2 == 0) goto L16a
            r2.setI(r4)
        L16a:
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            r3 = 0
            java.lang.Object r4 = r1.get(r3)
            com.bxkj.student.v2.common.data.PointData r4 = (com.bxkj.student.v2.common.data.PointData) r4
            double r4 = r4.getA()
            java.lang.Object r1 = r1.get(r3)
            com.bxkj.student.v2.common.data.PointData r1 = (com.bxkj.student.v2.common.data.PointData) r1
            double r6 = r1.getO()
            r2.<init>(r4, r6)
            r0.r0(r2)
            r0.R(r2)
        L18a:
            java.lang.String r1 = r10.X()
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.util.List r1 = com.alibaba.fastjson.JSON.parseArray(r1, r2)
            if (r1 == 0) goto L1a0
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r2 = kotlin.collections.f0.H5(r2)
            r0.v0(r2)
        L1a0:
            java.util.List r2 = r0.H()
            r2.clear()
            java.util.List r0 = r0.H()
            kotlin.jvm.internal.g0.m(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            com.bxkj.student.v2.ui.sports.v3.V3SportsFinishDialog r0 = new com.bxkj.student.v2.ui.sports.v3.V3SportsFinishDialog
            r0.<init>()
            androidx.fragment.app.FragmentManager r1 = r9.getSupportFragmentManager()
            java.lang.String r2 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.String r2 = "finishDialog"
            r0.show(r1, r2)
            com.bxkj.student.v2.ui.sports.v3.m0 r1 = new com.bxkj.student.v2.ui.sports.v3.m0
            r1.<init>(r9, r10, r11)
            r0.r0(r1)
            com.bxkj.student.v2.ui.sports.v3.n0 r10 = new com.bxkj.student.v2.ui.sports.v3.n0
            r10.<init>(r11, r12)
            r0.s0(r10)
            return
    }

    public final void S1(@org.jetbrains.annotations.NotNull l0.d r19, @org.jetbrains.annotations.NotNull android.app.Dialog r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "sportsDb"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "exceptionDialog"
            kotlin.jvm.internal.g0.p(r2, r3)
            androidx.fragment.app.DialogFragment r3 = r0.H0
            r4 = 1
            if (r3 == 0) goto L22
            android.app.Dialog r3 = r3.getDialog()
            if (r3 == 0) goto L22
            boolean r3 = r3.isShowing()
            if (r3 != r4) goto L22
            return
        L22:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.G0
            long r7 = r5 - r7
            long r9 = r0.F0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto Lbc
            java.lang.String r3 = r1.b0()
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            if (r3 != 0) goto L97
            java.lang.String r3 = r1.T()
            androidx.collection.ArrayMap r3 = cn.bluemobi.dylan.http.JsonParse.jsonToMap(r3)
            com.bxkj.base.v2.common.utils.x r7 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r8 = "faceOutCanContinue"
            int r8 = r7.k(r3, r8)
            if (r8 != r4) goto L4e
            r8 = 1
            goto L4f
        L4e:
            r8 = 0
        L4f:
            java.lang.String r9 = "faceDistanceOut"
            double r9 = r7.f(r3, r9)
            r3 = 1000(0x3e8, float:1.401E-42)
            double r11 = (double) r3
            double r9 = r9 * r11
            int r13 = (int) r9
            java.lang.String r3 = r1.K()
            int r7 = r3.length()
            if (r7 != 0) goto L72
            java.lang.String r3 = r1.J()
            int r3 = java.lang.Integer.parseInt(r3)
            int r3 = r3 + r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L72:
            r12 = r3
            com.bxkj.student.v2.ui.dialog.FaceOutDialog$b r11 = com.bxkj.student.v2.ui.dialog.FaceOutDialog.f1419r
            if (r8 == 0) goto L7b
            java.lang.String r3 = "继续跑步"
        L79:
            r14 = r3
            goto L7e
        L7b:
            java.lang.String r3 = ""
            goto L79
        L7e:
            androidx.fragment.app.FragmentManager r15 = r0.I()
            com.bxkj.student.v2.ui.sports.v3.j0 r3 = new com.bxkj.student.v2.ui.sports.v3.j0
            r3.<init>(r0, r1, r2)
            com.bxkj.student.v2.ui.sports.v3.k0 r2 = new com.bxkj.student.v2.ui.sports.v3.k0
            r2.<init>(r0, r1, r5)
            r17 = r2
            r16 = r3
            com.bxkj.student.v2.ui.dialog.FaceOutDialog r1 = r11.e(r12, r13, r14, r15, r16, r17)
            r0.H0 = r1
            return
        L97:
            com.bxkj.base.v2.base.p r2 = new com.bxkj.base.v2.base.p
            android.content.Context r3 = r0.G()
            r2.<init>(r3)
            java.lang.String r3 = "加载中..."
            com.bxkj.base.v2.base.p r2 = r2.e(r3)
            android.app.Dialog r2 = r2.h()
            r0.I0 = r2
            com.bxkj.base.v2.base.BaseViewModel r2 = r0.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r2 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r2
            com.bxkj.student.v2.ui.sports.v3.l0 r3 = new com.bxkj.student.v2.ui.sports.v3.l0
            r3.<init>()
            r2.p0(r1, r3)
            r0.G0 = r5
        Lbc:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final android.app.Dialog i1() {
            r1 = this;
            android.app.Dialog r0 = r1.I0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.fragment.app.DialogFragment j1() {
            r1 = this;
            androidx.fragment.app.DialogFragment r0 = r1.H0
            return r0
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r4 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.j0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.r r2 = new com.bxkj.student.v2.ui.sports.v3.r
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.google.android.material.tabs.TabLayout r0 = r0.tab
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$g r1 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$g
            r1.<init>(r4)
            r0.addOnTabSelectedListener(r1)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.W()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.s r2 = new com.bxkj.student.v2.ui.sports.v3.s
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.h0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.t r2 = new com.bxkj.student.v2.ui.sports.v3.t
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.R()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.u r2 = new com.bxkj.student.v2.ui.sports.v3.u
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.P()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.v r2 = new com.bxkj.student.v2.ui.sports.v3.v
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.N()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.w r2 = new com.bxkj.student.v2.ui.sports.v3.w
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.i0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.y r2 = new com.bxkj.student.v2.ui.sports.v3.y
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.O()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.z r2 = new com.bxkj.student.v2.ui.sports.v3.z
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            androidx.lifecycle.MutableLiveData r0 = r0.a0()
            androidx.fragment.app.FragmentActivity r1 = r4.q()
            com.bxkj.student.v2.ui.sports.v3.a0 r2 = new com.bxkj.student.v2.ui.sports.v3.a0
            r2.<init>(r4)
            com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i r3 = new com.bxkj.student.v2.ui.sports.v3.V3SportsHomeActivity$i
            r3.<init>(r2)
            r0.observe(r1, r3)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r3 = this;
            kotlinx.coroutines.e2 r0 = r3.J0
            if (r0 == 0) goto L9
            r1 = 1
            r2 = 0
            kotlinx.coroutines.e2.a.b(r0, r2, r1, r2)
        L9:
            com.amap.api.maps.LocationSource r0 = r3.X
            if (r0 == 0) goto L10
            r0.deactivate()
        L10:
            com.amap.api.location.AMapLocationClient r0 = r3.Y
            if (r0 == 0) goto L17
            r0.onDestroy()
        L17:
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.amap.api.maps.MapView r0 = r0.map
            r0.onDestroy()
            super.onDestroy()
            return
    }

    protected void onPause() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.amap.api.maps.MapView r0 = r0.map
            r0.onPause()
            return
    }

    protected void onResume() {
            r5 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L3a
            android.content.Context r1 = r5.G()
            com.bxkj.student.v2.common.utils.r$a r2 = com.bxkj.student.v2.common.utils.r.a
            androidx.databinding.ViewDataBinding r3 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r3 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r3
            com.google.android.material.tabs.TabLayout r3 = r3.tab
            androidx.databinding.ViewDataBinding r4 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            int r4 = r4.getSelectedTabPosition()
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.getTabAt(r4)
            if (r3 == 0) goto L2e
            java.lang.CharSequence r3 = r3.getText()
            goto L2f
        L2e:
            r3 = 0
        L2f:
            int r2 = r2.a(r3)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setStatusBarColor(r1)
        L3a:
            androidx.databinding.ViewDataBinding r0 = r5.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.amap.api.maps.MapView r0 = r0.map
            r0.onResume()
            com.amap.api.location.AMapLocationClient r0 = r5.Y
            if (r0 == 0) goto L4c
            r0.startLocation()
        L4c:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.V3LocationService> r1 = com.bxkj.student.v2.ui.sports.v3.service.V3LocationService.class
            r0.<init>(r5, r1)
            r5.stopService(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService> r1 = com.bxkj.student.v2.ui.sports.v3.service.step.V3StepService.class
            r0.<init>(r5, r1)
            r5.stopService(r0)
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r5.getSystemService(r0)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r1 = 100
            r0.cancel(r1)
            return
    }

    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.g0.p(r2, r0)
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r2)
            androidx.databinding.ViewDataBinding r0 = r1.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.amap.api.maps.MapView r0 = r0.map
            r0.onSaveInstanceState(r2)
            return
    }

    protected void onStop() {
            r1 = this;
            com.amap.api.location.AMapLocationClient r0 = r1.Y
            if (r0 == 0) goto L7
            r0.stopLocation()
        L7:
            super.onStop()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r4 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "V3SportsHomeActivity->initUiData"
            com.orhanobut.logger.j.d(r1, r0)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            r0.setBackEvent(r4)
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r1.a()
            r0.setLoggedInUser(r2)
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.T()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.X()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.d0()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.n0()
            r4.E1()
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "title"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L65
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            android.content.Intent r3 = r4.getIntent()
            java.lang.String r2 = r3.getStringExtra(r2)
            r0.setTitle(r2)
            goto L70
        L65:
            androidx.databinding.ViewDataBinding r0 = r4.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r0 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r0
            java.lang.String r2 = "APP跑步"
            r0.setTitle(r2)
        L70:
            r4.N1()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            r0.K()
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r0 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r0
            com.bxkj.student.v2.ui.sports.v3.x r2 = new com.bxkj.student.v2.ui.sports.v3.x
            r2.<init>(r4)
            r0.S(r2)
            com.bxkj.base.v2.data.b r0 = r1.a()
            int r0 = r0.b0()
            r1 = 1
            if (r0 != r1) goto L9e
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            r0.v()
        L9e:
            return
    }

    public final void t2() {
            r7 = this;
            com.amap.api.maps.model.LatLng r0 = r7.f1447p0
            if (r0 != 0) goto Lf
            com.bxkj.student.v2.ui.sports.v3.h1 r0 = new com.bxkj.student.v2.ui.sports.v3.h1
            r0.<init>(r7)
            java.lang.String r1 = "当前未获取到您的位置信息，请开启定位并检测定位权限后再开始跑步"
            com.bxkj.base.v2.common.ext.ContextExtKt.o(r7, r1, r0)
            return
        Lf:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.G0
            long r2 = r0 - r2
            long r4 = r7.F0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L50
            com.bxkj.base.v2.base.BaseViewModel r2 = r7.C()
            com.bxkj.student.v2.vm.sports.SportsHomeVM r2 = (com.bxkj.student.v2.vm.sports.SportsHomeVM) r2
            com.bxkj.student.v2.common.utils.r$a r3 = com.bxkj.student.v2.common.utils.r.a
            androidx.databinding.ViewDataBinding r4 = r7.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r4 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r4
            com.google.android.material.tabs.TabLayout r4 = r4.tab
            androidx.databinding.ViewDataBinding r5 = r7.K()
            com.bxkj.student.databinding.AcV3SportsHomeBinding r5 = (com.bxkj.student.databinding.AcV3SportsHomeBinding) r5
            com.google.android.material.tabs.TabLayout r5 = r5.tab
            int r5 = r5.getSelectedTabPosition()
            com.google.android.material.tabs.TabLayout$Tab r4 = r4.getTabAt(r5)
            if (r4 == 0) goto L44
            java.lang.CharSequence r4 = r4.getText()
            goto L45
        L44:
            r4 = 0
        L45:
            int r3 = r3.c(r4)
            com.amap.api.maps.model.LatLng r4 = r7.f1447p0
            r2.b0(r3, r4)
            r7.G0 = r0
        L50:
            return
    }

    public final void v2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity> r2 = com.bxkj.student.v2.ui.sports.set.SportsDescriptionActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "showBottom"
            r2 = 0
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void w2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.PermissionSetActivity> r2 = com.bxkj.student.v2.ui.sports.set.PermissionSetActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void x2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity> r2 = com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void y2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity> r2 = com.bxkj.student.v2.ui.sports.v3.record.V3RecordListActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "tabIndex"
            r2 = 1
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    public final void z2() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.sports.set.SportsSetActivity> r2 = com.bxkj.student.v2.ui.sports.set.SportsSetActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }
}

package com.bxkj.student;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class App extends com.bxkj.base.BaseApp {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.App.a d = null;
    private static com.bxkj.student.App e;

    @org.jetbrains.annotations.Nullable
    private java.lang.Long c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
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
        public final com.bxkj.student.App a() {
                r1 = this;
                com.bxkj.student.App r0 = com.bxkj.student.App.k()
                if (r0 != 0) goto Lc
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.g0.S(r0)
                r0 = 0
            Lc:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements xyz.adscope.amps.init.inter.IAMPSInitCallback {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public void failCallback(xyz.adscope.amps.common.AMPSError r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BeiZisDemo->initAMPSSDK failCallback ampsError : "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.e(r3, r0)
                return
        }

        public void successCallback() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "BeiZisDemo->initAMPSSDK successCallback"
                com.orhanobut.logger.j.g(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements l2.b {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public l2.e a(android.content.Context r2, l2.h r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "layout"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                r3.Y(r0)
                com.scwang.smartrefresh.header.MaterialHeader r3 = new com.scwang.smartrefresh.header.MaterialHeader
                r3.<init>(r2)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d implements l2.a {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        public l2.d a(android.content.Context r2, l2.h r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "layout"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 1
                r3.S(r0)
                com.scwang.smartrefresh.layout.footer.ClassicsFooter r3 = new com.scwang.smartrefresh.layout.footer.ClassicsFooter
                r3.<init>(r2)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.App$initDataBase$1", f = "App.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;

        e(kotlin.coroutines.e<? super com.bxkj.student.App.e> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.App$e r1 = new com.bxkj.student.App$e
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
                com.bxkj.student.App$e r1 = (com.bxkj.student.App.e) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r2.a
                if (r0 != 0) goto L3d
                kotlin.g0.n(r3)
                cn.bluemobi.dylan.sqlitelibrary.c r3 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                com.bxkj.student.App r0 = com.bxkj.student.App.k()
                if (r0 != 0) goto L1a
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.g0.S(r0)
                r0 = 0
            L1a:
                java.lang.String r1 = "xiaowei"
                r3.n(r0, r1)
                cn.bluemobi.dylan.sqlitelibrary.c r3 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                java.lang.Class<com.bxkj.base.chat.db.ChatMessageDb> r0 = com.bxkj.base.chat.db.ChatMessageDb.class
                r3.b(r0)
                cn.bluemobi.dylan.sqlitelibrary.c r3 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                java.lang.Class<com.bxkj.student.common.db.HomeMenuDB> r0 = com.bxkj.student.common.db.HomeMenuDB.class
                r3.b(r0)
                cn.bluemobi.dylan.sqlitelibrary.c r3 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                java.lang.Class<com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB> r0 = com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB.class
                r3.b(r0)
                kotlin.n1 r3 = kotlin.n1.a
                return r3
            L3d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f implements com.baidu.idl.face.platform.listener.IInitCallback {
        f() {
                r0 = this;
                r0.<init>()
                return
        }

        public void initFailure(int r3, java.lang.String r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FaceSDKManager初始化失败i="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "s="
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.orhanobut.logger.j.e(r3, r4)
                return
        }

        public void initSuccess() {
                r2 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "FaceSDKManager初始化成功"
                com.orhanobut.logger.j.d(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class g extends com.orhanobut.logger.a {
        g(com.orhanobut.logger.f r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public boolean b(int r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class h implements android.app.Application.ActivityLifecycleCallbacks {
        private android.view.View.OnLayoutChangeListener a;
        final /* synthetic */ com.bxkj.student.App b;

        h(com.bxkj.student.App r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.App.h r0, android.app.Activity r1, android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
                d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        private static final void d(com.bxkj.student.App.h r0, android.app.Activity r1, android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
                r0.b(r1)
                return
        }

        public final void b(android.app.Activity r5) {
                r4 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r5, r0)
                com.bxkj.student.App r0 = r4.b
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r1 = "id"
                java.lang.String r2 = "android"
                java.lang.String r3 = "statusBarBackground"
                int r0 = r0.getIdentifier(r3, r1, r2)
                android.view.Window r5 = r5.getWindow()
                android.view.View r5 = r5.findViewById(r0)
                if (r5 == 0) goto L25
                r0 = 2131231715(0x7f0803e3, float:1.8079519E38)
                r5.setBackgroundResource(r0)
            L25:
                return
        }

        public final void c(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.b r0 = new com.bxkj.student.b
                r0.<init>(r1, r2)
                r1.a = r0
                android.view.Window r2 = r2.getWindow()
                android.view.View r2 = r2.getDecorView()
                android.view.View$OnLayoutChangeListener r0 = r1.a
                r2.addOnLayoutChangeListener(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r3 = "activity"
                kotlin.jvm.internal.g0.p(r2, r3)
                r3 = 1
                r2.setRequestedOrientation(r3)
                com.bxkj.student.v2.common.view.FloatActionView r3 = new com.bxkj.student.v2.common.view.FloatActionView     // Catch: java.lang.Exception -> L12
                r3.<init>(r2)     // Catch: java.lang.Exception -> L12
                r3.p()     // Catch: java.lang.Exception -> L12
                return
            L12:
                r2 = move-exception
                java.lang.String r2 = r2.getMessage()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "FloatActionView：="
                r3.append(r0)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.orhanobut.logger.j.e(r2, r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                android.view.Window r2 = r2.getWindow()
                android.view.View r2 = r2.getDecorView()
                android.view.View$OnLayoutChangeListener r0 = r1.a
                r2.removeOnLayoutChangeListener(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r0 = r0.isAgreement()
                if (r0 == 0) goto L12
                com.umeng.analytics.MobclickAgent.onPause(r2)
            L12:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.v2.common.utils.a r0 = com.bxkj.student.v2.common.utils.a.a
                r0.b(r2)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                boolean r0 = r0.isAgreement()
                if (r0 == 0) goto L17
                com.umeng.analytics.MobclickAgent.onResume(r2)
            L17:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "outState"
                kotlin.jvm.internal.g0.p(r3, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3 instanceof com.bxkj.student.splash.SplashActivity
                if (r0 != 0) goto L3d
                boolean r0 = r3 instanceof com.bxkj.student.splash.SelectSchoolV2Activity
                if (r0 != 0) goto L3d
                boolean r0 = r3 instanceof com.bxkj.student.v2.ui.h5.H5AppActivity
                if (r0 == 0) goto L12
                return
            L12:
                r0 = 2131298702(0x7f09098e, float:1.8215385E38)
                android.view.View r0 = r3.findViewById(r0)
                boolean r1 = r3 instanceof com.bxkj.student.MainActivity
                if (r1 == 0) goto L27
                r0 = r3
                com.bxkj.student.MainActivity r0 = (com.bxkj.student.MainActivity) r0
                r1 = 2131298703(0x7f09098f, float:1.8215387E38)
                android.view.View r0 = r0.findViewById(r1)
            L27:
                boolean r1 = r3 instanceof com.bxkj.base.v2.base.BaseActivity
                if (r1 == 0) goto L2c
                return
            L2c:
                if (r0 == 0) goto L3d
                int r1 = r0.getVisibility()
                if (r1 != 0) goto L3d
                r1 = 2131231715(0x7f0803e3, float:1.8079519E38)
                r0.setBackgroundResource(r1)
                r2.c(r3)
            L3d:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class i implements com.bxkj.student.common.versionupdate.a.d {
        final /* synthetic */ com.bxkj.student.common.versionupdate.a a;
        final /* synthetic */ android.content.Context b;

        i(com.bxkj.student.common.versionupdate.a r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.versionupdate.a.d
        public void a(boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r1 = this;
                if (r2 == 0) goto L22
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.MainActivity> r0 = com.bxkj.student.MainActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.MainActivity r2 = (com.bxkj.student.MainActivity) r2
                if (r2 == 0) goto L1c
                android.app.Dialog r2 = r2.f715p0
                if (r2 == 0) goto L1c
                boolean r2 = r2.isShowing()
                if (r2 != 0) goto L1b
                goto L1c
            L1b:
                return
            L1c:
                com.bxkj.student.common.versionupdate.a r2 = r1.a
                r2.d(r3, r4, r5)
                return
            L22:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                android.content.Context r3 = r1.b
                r2.<init>(r3)
                java.lang.String r3 = "当前已是最新版本"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        @Override // com.bxkj.student.common.versionupdate.a.d
        public void b() {
                r0 = this;
                return
        }
    }

    static {
            com.bxkj.student.App$a r0 = new com.bxkj.student.App$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.App.d = r0
            return
    }

    public App() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void j(java.lang.String r0) {
            r(r0)
            return
    }

    public static final /* synthetic */ com.bxkj.student.App k() {
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            return r0
    }

    public static final /* synthetic */ java.lang.Long l(com.bxkj.student.App r0) {
            java.lang.Long r0 = r0.c
            return r0
    }

    public static final /* synthetic */ void m(com.bxkj.student.App r0, java.lang.Long r1) {
            r0.c = r1
            return
    }

    private final java.lang.String p(android.content.Context r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.ActivityManager"
            kotlin.jvm.internal.g0.n(r5, r1)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            int r3 = android.os.Process.myPid()
            if (r2 != r3) goto L19
            java.lang.String r5 = r1.processName
            return r5
        L30:
            return r0
    }

    private final void q() {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1 = 1
            r0.setUserType(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            r1 = 0
            r0.setDebugMode(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            r1 = 2131493153(0x7f0c0121, float:1.8609778E38)
            r0.setLoadingDialog(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            g2.b r1 = new g2.b
            com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
            r1.<init>(r2)
            r0.addInterceptor(r1)
            cn.bluemobi.dylan.http.Http r0 = cn.bluemobi.dylan.http.Http.getHttp()
            okhttp3.logging.HttpLoggingInterceptor r1 = new okhttp3.logging.HttpLoggingInterceptor
            com.bxkj.student.a r2 = new com.bxkj.student.a
            r2.<init>()
            r1.<init>(r2)
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            okhttp3.logging.HttpLoggingInterceptor r1 = r1.setLevel(r2)
            r0.addInterceptor(r1)
            r3.s()
            com.bxkj.student.App$c r0 = new com.bxkj.student.App$c
            r0.<init>()
            com.scwang.smartrefresh.layout.SmartRefreshLayout.setDefaultRefreshHeaderCreater(r0)
            com.bxkj.student.App$d r0 = new com.bxkj.student.App$d
            r0.<init>()
            com.scwang.smartrefresh.layout.SmartRefreshLayout.setDefaultRefreshFooterCreater(r0)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAgreement()
            if (r0 == 0) goto L61
            r3.n()
        L61:
            r3.y()
            r3.w()
            r3.x()
            return
    }

    private static final void r(java.lang.String r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r1, r0)
            return
    }

    private final void s() {
            r6 = this;
            kotlinx.coroutines.w1 r0 = kotlinx.coroutines.w1.a
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.c()
            com.bxkj.student.App$e r3 = new com.bxkj.student.App$e
            r2 = 0
            r3.<init>(r2)
            r4 = 2
            r5 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    private final void t() {
            r5 = this;
            r5.z()
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            r0.d()
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.bxkj.student.App r1 = com.bxkj.student.App.e
            if (r1 != 0) goto L16
            java.lang.String r1 = "instance"
            kotlin.jvm.internal.g0.S(r1)
            r1 = 0
        L16:
            com.bxkj.student.App$f r2 = new com.bxkj.student.App$f
            r2.<init>()
            java.lang.String r3 = "XiaoWeiFaceDetection-face-android"
            java.lang.String r4 = "baidu-idl-license.face-android"
            r0.initialize(r1, r3, r4, r2)
            return
    }

    private final void u() {
            r2 = this;
            com.orhanobut.logger.l$b r0 = com.orhanobut.logger.l.k()
            java.lang.String r1 = "TSNAPP"
            com.orhanobut.logger.l$b r0 = r0.f(r1)
            com.orhanobut.logger.l r0 = r0.a()
            java.lang.String r1 = "build(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            com.orhanobut.logger.j.b()
            com.bxkj.student.App$g r1 = new com.bxkj.student.App$g
            r1.<init>(r0)
            com.orhanobut.logger.j.a(r1)
            return
    }

    private final void w() {
            r0 = this;
            return
    }

    private final void x() {
            r2 = this;
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            androidx.lifecycle.LifecycleOwner r0 = r0.get()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            com.bxkj.student.App$registerAppLifecycle$1 r1 = new com.bxkj.student.App$registerAppLifecycle$1
            r1.<init>(r2)
            r0.addObserver(r1)
            return
    }

    private final void y() {
            r1 = this;
            com.bxkj.student.App$h r0 = new com.bxkj.student.App$h
            r0.<init>(r1)
            r1.registerActivityLifecycleCallbacks(r0)
            return
    }

    private final void z() {
            r5 = this;
            com.baidu.idl.face.platform.FaceSDKManager r0 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.FaceConfig r0 = r0.getFaceConfig()
            r1 = 200(0xc8, float:2.8E-43)
            r0.setMinFaceSize(r1)
            r1 = 1058642330(0x3f19999a, float:0.6)
            r0.setNotFaceValue(r1)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0.setBlurnessValue(r1)
            r2 = 0
            r0.setBrightnessValue(r2)
            r2 = 1132396544(0x437f0000, float:255.0)
            r0.setBrightnessMaxValue(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setOcclusionValue(r2)
            r2 = 15
            r0.setHeadPitchValue(r2)
            r0.setHeadYawValue(r2)
            r0.setHeadRollValue(r2)
            r0.setEyeClosedValue(r1)
            r1 = 3
            r0.setCacheImageNum(r1)
            r2 = 0
            r0.setOpenMask(r2)
            r3 = 1060320051(0x3f333333, float:0.7)
            r0.setMaskValue(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.baidu.idl.face.platform.LivenessTypeEnum r4 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye
            r3.add(r4)
            com.baidu.idl.face.platform.LivenessTypeEnum r4 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth
            r3.add(r4)
            com.baidu.idl.face.platform.LivenessTypeEnum r4 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown
            r3.add(r4)
            r0.setLivenessTypeList(r3)
            r3 = 1
            r0.setLivenessRandom(r3)
            r0.setLivenessRandomCount(r1)
            r0.setSound(r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScale(r1)
            r1 = 640(0x280, float:8.97E-43)
            r0.setCropHeight(r1)
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.setEnlargeRatio(r1)
            r0.setSecType(r2)
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            r1.setFaceConfig(r0)
            return
    }

    public final void A(@org.jetbrains.annotations.NotNull android.app.Application r3) {
            r2 = this;
            java.lang.String r0 = "application"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = r2.p(r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 != 0) goto L20
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r3 < r1) goto L20
            cn.jpush.android.ad.n.a(r0)
        L20:
            return
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            androidx.multidex.MultiDex.install(r0)
            return
    }

    @Override // com.bxkj.base.BaseApp
    public void i(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "mContext"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.bxkj.student.common.versionupdate.a r0 = new com.bxkj.student.common.versionupdate.a
            r0.<init>(r3)
            com.bxkj.student.App$i r1 = new com.bxkj.student.App$i
            r1.<init>(r0, r3)
            r0.b(r1)
            return
    }

    public final void n() {
            r7 = this;
            r7.v()
            r7.t()
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            r1 = 0
            java.lang.String r2 = "instance"
            if (r0 != 0) goto L11
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        L11:
            r3 = 1
            com.amap.api.location.AMapLocationClient.updatePrivacyShow(r0, r3, r3)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto L1d
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        L1d:
            com.amap.api.location.AMapLocationClient.updatePrivacyAgree(r0, r3)
            android.content.Context r0 = r7.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r4 = "ae6e27150a"
            r5 = 0
            com.tencent.bugly.crashreport.CrashReport.initCrashReport(r0, r4, r5)
            java.lang.String r0 = r7.o(r7)
            java.lang.String r4 = "59a61305a3251138c9000c17"
            com.umeng.commonsdk.UMConfigure.preInit(r7, r4, r0)
            com.umeng.commonsdk.UMConfigure.submitPolicyGrantResult(r7, r3)
            com.umeng.commonsdk.UMConfigure.setLogEnabled(r5)
            java.lang.String r0 = r7.o(r7)
            java.lang.String r6 = ""
            com.umeng.commonsdk.UMConfigure.init(r7, r4, r0, r3, r6)
            java.lang.String r0 = "wxc9214f296e1fba92"
            java.lang.String r4 = "505a323b2213d09ca75c989ac6946943"
            com.umeng.socialize.PlatformConfig.setWeixin(r0, r4)
            java.lang.String r0 = "com.bxkj.student.provider"
            com.umeng.socialize.PlatformConfig.setWXFileProvider(r0)
            java.lang.String r4 = "1106200175"
            java.lang.String r6 = "pTNnuKKrFFrM9SFa"
            com.umeng.socialize.PlatformConfig.setQQZone(r4, r6)
            com.umeng.socialize.PlatformConfig.setQQFileProvider(r0)
            com.tencent.tauth.Tencent.setIsPermissionGranted(r3)
            com.umeng.analytics.MobclickAgent$EScenarioType r0 = com.umeng.analytics.MobclickAgent.EScenarioType.E_UM_NORMAL
            com.umeng.analytics.MobclickAgent.setScenarioType(r7, r0)
            xyz.adscope.amps.init.AMPSInitConfig$Builder r0 = new xyz.adscope.amps.init.AMPSInitConfig$Builder
            r0.<init>()
            java.lang.String r4 = "51343"
            xyz.adscope.amps.init.AMPSInitConfig$Builder r0 = r0.setAppId(r4)
            android.content.res.Resources r4 = r7.getResources()
            r6 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r4 = r4.getString(r6)
            xyz.adscope.amps.init.AMPSInitConfig$Builder r0 = r0.setAppName(r4)
            xyz.adscope.amps.init.AMPSInitConfig r0 = r0.build()
            com.bxkj.student.App$b r4 = new com.bxkj.student.App$b
            r4.<init>()
            xyz.adscope.amps.AMPSSDK.init(r7, r0, r4)
            com.bxkj.student.v2.common.utils.safe.b r0 = com.bxkj.student.v2.common.utils.safe.b.a
            r0.b()
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            int r0 = r0.d0()
            if (r0 != r3) goto L105
            cn.jpush.android.api.JPushInterface.setDebugMode(r5)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto La6
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        La6:
            cn.jpush.android.api.JPushInterface.setSmartPushEnable(r0, r5)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto Lb1
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        Lb1:
            cn.jpush.android.api.JPushInterface.setGeofenceEnable(r0, r5)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto Lbc
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        Lbc:
            cn.jiguang.api.utils.JCollectionAuth.enableAutoWakeup(r0, r5)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto Lc7
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        Lc7:
            cn.jpush.android.api.JPushInterface.setLinkMergeEnable(r0, r5)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto Ld2
            kotlin.jvm.internal.g0.S(r2)
            r0 = r1
        Ld2:
            cn.jiguang.api.utils.JCollectionAuth.enableAppTerminate(r0, r5)
            cn.jpush.android.data.JPushCollectControl$Builder r0 = new cn.jpush.android.data.JPushCollectControl$Builder
            r0.<init>()
            r0.ssid(r5)
            r0.bssid(r5)
            r0.wifi(r5)
            cn.jpush.android.data.JPushCollectControl r0 = r0.build()
            com.bxkj.student.App r4 = com.bxkj.student.App.e
            if (r4 != 0) goto Lef
            kotlin.jvm.internal.g0.S(r2)
            r4 = r1
        Lef:
            cn.jpush.android.api.JPushInterface.setCollectControl(r4, r0)
            com.bxkj.student.App r0 = com.bxkj.student.App.e
            if (r0 != 0) goto Lfa
            kotlin.jvm.internal.g0.S(r2)
            goto Lfb
        Lfa:
            r1 = r0
        Lfb:
            cn.jiguang.api.utils.JCollectionAuth.setAuth(r1, r3)
            cn.jpush.android.api.JPushInterface.init(r7)
            cn.jpush.android.api.JPushInterface.resumePush(r7)
            goto L108
        L105:
            cn.jpush.android.api.JPushInterface.stopPush(r7)
        L108:
            java.lang.String r0 = "3604766"
            i2.a.a(r7, r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String o(@org.jetbrains.annotations.Nullable android.content.Context r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r1 == 0) goto L31
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r1 = "getApplicationInfo(...)"
            kotlin.jvm.internal.g0.o(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r4 == 0) goto L31
            java.lang.String r1 = "UMENG_CHANNEL"
            java.lang.Object r4 = r4.get(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r1.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r0 = r1.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            goto L31
        L30:
        L31:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L39
            java.lang.String r0 = "Unknown"
        L39:
            return r0
    }

    @Override // com.bxkj.base.BaseApp, android.app.Application
    public void onCreate() {
            r5 = this;
            r0 = 0
            super.onCreate()     // Catch: java.lang.Exception -> L3a
            com.bxkj.student.App.e = r5     // Catch: java.lang.Exception -> L3a
            r5.u()     // Catch: java.lang.Exception -> L3a
            cn.jiguang.api.utils.JCollectionAuth.setAuth(r5, r0)     // Catch: java.lang.Exception -> L3a
            r5.A(r5)     // Catch: java.lang.Exception -> L3a
            r5.v()     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = r5.p(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r2.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "当前进程名"
            r2.append(r3)     // Catch: java.lang.Exception -> L3a
            r2.append(r1)     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L3a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L3a
            com.orhanobut.logger.j.d(r1, r2)     // Catch: java.lang.Exception -> L3a
            boolean r1 = r5.f()     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L3c
            r5.q()     // Catch: java.lang.Exception -> L3a
            return
        L3a:
            r1 = move-exception
            goto L3d
        L3c:
            return
        L3d:
            java.lang.String r2 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "初始化异常"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r2, r0)
            com.tencent.bugly.crashreport.CrashReport.postCatchedException(r1)
            return
    }

    public final void v() {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAgreement()
            if (r0 == 0) goto L1e
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "初始化省钱助手"
            com.orhanobut.logger.j.d(r1, r0)
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r2)
            r0.build()
        L1e:
            return
    }
}

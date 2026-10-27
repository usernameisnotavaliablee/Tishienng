package com.bxkj.student.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/bxkj/student/splash/SplashActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1#2:245\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SplashActivity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcSplashBinding, com.bxkj.student.v2.vm.splash.SplashVM> {

    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer W;
    private boolean X;

    @org.jetbrains.annotations.Nullable
    private xyz.adscope.amps.ad.splash.AMPSSplashAd Y;
    private boolean Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends android.os.CountDownTimer {
        final /* synthetic */ com.bxkj.student.splash.SplashActivity a;

        a(com.bxkj.student.splash.SplashActivity r5) {
                r4 = this;
                r4.a = r5
                r0 = 5000(0x1388, double:2.4703E-320)
                r2 = 1000(0x3e8, double:4.94E-321)
                r4.<init>(r0, r2)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r1 = this;
                com.bxkj.student.splash.SplashActivity r0 = r1.a
                com.bxkj.student.splash.SplashActivity.j(r0)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r4) {
                r3 = this;
                com.bxkj.student.splash.SplashActivity r0 = r3.a
                androidx.databinding.ViewDataBinding r0 = r0.K()
                com.bxkj.student.databinding.AcSplashBinding r0 = (com.bxkj.student.databinding.AcSplashBinding) r0
                android.widget.TextView r0 = r0.tvTime
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r4 = r4 / r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "跳过"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener {
        final /* synthetic */ com.bxkj.student.splash.SplashActivity a;

        b(com.bxkj.student.splash.SplashActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onAmpsAdClicked() {
                r0 = this;
                return
        }

        public void onAmpsAdDismiss() {
                r1 = this;
                com.bxkj.student.splash.SplashActivity r0 = r1.a
                com.bxkj.student.splash.SplashActivity.j(r0)
                return
        }

        public void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r2) {
                r1 = this;
                java.lang.String r0 = "errorCode"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.splash.SplashActivity r2 = r1.a
                com.bxkj.student.splash.SplashActivity.j(r2)
                return
        }

        public void onAmpsAdLoaded() {
                r2 = this;
                com.bxkj.student.splash.SplashActivity r0 = r2.a
                xyz.adscope.amps.ad.splash.AMPSSplashAd r0 = com.bxkj.student.splash.SplashActivity.i(r0)
                if (r0 == 0) goto L15
                com.bxkj.student.splash.SplashActivity r1 = r2.a
                androidx.databinding.ViewDataBinding r1 = r1.K()
                com.bxkj.student.databinding.AcSplashBinding r1 = (com.bxkj.student.databinding.AcSplashBinding) r1
                android.widget.FrameLayout r1 = r1.adsFl
                r0.show(r1)
            L15:
                return
        }

        public void onAmpsAdShow() {
                r1 = this;
                com.bxkj.student.splash.SplashActivity r0 = r1.a
                android.os.CountDownTimer r0 = com.bxkj.student.splash.SplashActivity.h(r0)
                if (r0 == 0) goto Lb
                r0.cancel()
            Lb:
                return
        }
    }

    public SplashActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void L() {
            r2 = this;
            com.bxkj.student.splash.SplashActivity$a r0 = new com.bxkj.student.splash.SplashActivity$a
            r0.<init>(r2)
            r2.W = r0
            r0.cancel()
            android.os.CountDownTimer r0 = r2.W
            if (r0 == 0) goto L11
            r0.start()
        L11:
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcSplashBinding r0 = (com.bxkj.student.databinding.AcSplashBinding) r0
            android.widget.TextView r0 = r0.tvTime
            com.bxkj.student.splash.k r1 = new com.bxkj.student.splash.k
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            int r0 = r0.a0()
            r1 = 1
            if (r0 != r1) goto L32
            r2.N()
            return
        L32:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "未开启广告"
            com.orhanobut.logger.j.d(r1, r0)
            return
    }

    private static final void M(com.bxkj.student.splash.SplashActivity r0, android.view.View r1) {
            android.os.CountDownTimer r0 = r0.W
            if (r0 == 0) goto L7
            r0.onFinish()
        L7:
            return
    }

    private final void N() {
            r3 = this;
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r0 = new xyz.adscope.amps.config.AMPSRequestParameters$Builder
            r0.<init>()
            java.lang.String r1 = "111009"
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r0 = r0.setSpaceId(r1)
            r1 = 5000(0x1388, float:7.006E-42)
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r0 = r0.setTimeOut(r1)
            int r1 = xyz.adscope.amps.tool.util.AMPSScreenUtil.getScreenWidth(r3)
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r0 = r0.setWidth(r1)
            int r1 = xyz.adscope.amps.tool.util.AMPSScreenUtil.getScreenHeight(r3)
            xyz.adscope.amps.config.AMPSRequestParameters$Builder r0 = r0.setHeight(r1)
            xyz.adscope.amps.config.AMPSRequestParameters r0 = r0.build()
            xyz.adscope.amps.ad.splash.AMPSSplashAd r1 = new xyz.adscope.amps.ad.splash.AMPSSplashAd
            com.bxkj.student.splash.SplashActivity$b r2 = new com.bxkj.student.splash.SplashActivity$b
            r2.<init>(r3)
            r1.<init>(r3, r0, r2)
            r3.Y = r1
            r1.loadAd()
            return
    }

    private final void O() {
            r2 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.splash.SplashVM r0 = (com.bxkj.student.v2.vm.splash.SplashVM) r0
            com.bxkj.student.splash.j r1 = new com.bxkj.student.splash.j
            r1.<init>(r2)
            r0.x(r1)
            return
    }

    private static final kotlin.n1 P(com.bxkj.student.splash.SplashActivity r5, java.lang.String r6) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r6, r0)
            com.bumptech.glide.request.h r0 = new com.bumptech.glide.request.h
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.m r1 = new com.bumptech.glide.load.resource.bitmap.m
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.i0 r2 = new com.bumptech.glide.load.resource.bitmap.i0
            r3 = 10
            r2.<init>(r3)
            r3 = 2
            com.bumptech.glide.load.i[] r3 = new com.bumptech.glide.load.i[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r0.R0(r3)
            android.content.Context r1 = r5.G()
            com.bumptech.glide.i r1 = com.bumptech.glide.b.D(r1)
            com.bumptech.glide.h r6 = r1.M(r6)
            com.bumptech.glide.h r6 = r6.V0(r0)
            r0 = 2131689689(0x7f0f00d9, float:1.90084E38)
            com.bumptech.glide.request.a r6 = r6.y0(r0)
            com.bumptech.glide.h r6 = (com.bumptech.glide.h) r6
            com.bumptech.glide.request.a r6 = r6.z(r0)
            com.bumptech.glide.h r6 = (com.bumptech.glide.h) r6
            androidx.databinding.ViewDataBinding r5 = r5.K()
            com.bxkj.student.databinding.AcSplashBinding r5 = (com.bxkj.student.databinding.AcSplashBinding) r5
            android.widget.ImageView r5 = r5.ivLogo
            r6.m1(r5)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private final void Q() {
            r1 = this;
            boolean r0 = r1.X
            if (r0 == 0) goto L5
            return
        L5:
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.splash.SplashVM r0 = (com.bxkj.student.v2.vm.splash.SplashVM) r0
            r0.y()
            com.bxkj.base.v2.base.BaseViewModel r0 = r1.C()
            com.bxkj.student.v2.vm.splash.SplashVM r0 = (com.bxkj.student.v2.vm.splash.SplashVM) r0
            r0.w()
            r1.O()
            r1.R()
            return
    }

    private final void R() {
            r4 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r0 = r0.getSysType()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto Le
            r0 = r4
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L49
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.j()
            int r3 = r1.length()
            if (r3 != 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            if (r1 == 0) goto L2e
            com.bxkj.base.v2.base.BaseViewModel r1 = r4.C()
            com.bxkj.student.v2.vm.splash.SplashVM r1 = (com.bxkj.student.v2.vm.splash.SplashVM) r1
            r1.v()
        L2e:
            com.bxkj.base.v2.data.b r0 = r0.a()
            boolean r0 = r0.Y()
            if (r0 == 0) goto L39
            r2 = r4
        L39:
            if (r2 == 0) goto L49
            com.bxkj.base.v2.base.BaseViewModel r0 = r4.C()
            com.bxkj.student.v2.vm.splash.SplashVM r0 = (com.bxkj.student.v2.vm.splash.SplashVM) r0
            com.bxkj.student.splash.l r1 = new com.bxkj.student.splash.l
            r1.<init>()
            r0.u(r1)
        L49:
            return
    }

    private static final kotlin.n1 S(int r3) {
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "启动页刷新Token成功"
            com.orhanobut.logger.j.d(r0, r3)
            com.bxkj.base.v2.data.b$a r3 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r3.a()
            r1 = 1
            r0.L0(r1)
            com.bxkj.student.common.jpush.a r0 = com.bxkj.student.common.jpush.a.a
            com.bxkj.base.v2.data.b r1 = r3.a()
            java.lang.String r1 = r1.R()
            com.bxkj.base.v2.data.b r2 = r3.a()
            boolean r2 = r2.Y()
            r0.d(r1, r2)
            com.bxkj.base.v2.data.b r3 = r3.a()
            r3.e()
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    private final void T() {
            r3 = this;
            boolean r0 = r3.Z
            if (r0 == 0) goto L34
            boolean r0 = r3.X
            if (r0 != 0) goto L30
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r0 = r0.getSysType()
            r1 = 2
            if (r0 != r1) goto L22
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.v2.ui.MainActivity> r2 = com.bxkj.student.v2.ui.MainActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            goto L30
        L22:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.MainActivity> r2 = com.bxkj.student.MainActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
        L30:
            r3.finish()
            return
        L34:
            r0 = 1
            r3.Z = r0
            return
    }

    public static /* synthetic */ kotlin.n1 e(int r0) {
            kotlin.n1 r0 = S(r0)
            return r0
    }

    public static /* synthetic */ void f(com.bxkj.student.splash.SplashActivity r0, android.view.View r1) {
            M(r0, r1)
            return
    }

    public static /* synthetic */ kotlin.n1 g(com.bxkj.student.splash.SplashActivity r0, java.lang.String r1) {
            kotlin.n1 r0 = P(r0, r1)
            return r0
    }

    public static final /* synthetic */ android.os.CountDownTimer h(com.bxkj.student.splash.SplashActivity r0) {
            android.os.CountDownTimer r0 = r0.W
            return r0
    }

    public static final /* synthetic */ xyz.adscope.amps.ad.splash.AMPSSplashAd i(com.bxkj.student.splash.SplashActivity r0) {
            xyz.adscope.amps.ad.splash.AMPSSplashAd r0 = r0.Y
            return r0
    }

    public static final /* synthetic */ void j(com.bxkj.student.splash.SplashActivity r0) {
            r0.T()
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r0 = this;
            return
    }

    @Override // com.bxkj.base.v2.common.view.b
    public void onBackPressed() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.W
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            xyz.adscope.amps.ad.splash.AMPSSplashAd r0 = r1.Y
            if (r0 == 0) goto Le
            r0.destroy()
        Le:
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            com.stub.StubApp.mark()
            super.onCreate(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.BaseActivity
    protected void onDestroy() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.W
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            xyz.adscope.amps.ad.splash.AMPSSplashAd r0 = r1.Y
            if (r0 == 0) goto Le
            r0.destroy()
        Le:
            super.onDestroy()
            return
    }

    protected void onPause() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            r0 = 0
            r1.Z = r0
            return
    }

    protected void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            boolean r0 = r1.Z
            if (r0 == 0) goto La
            r1.T()
        La:
            r0 = 1
            r1.Z = r0
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r3 = this;
            boolean r0 = r3.isTaskRoot()
            if (r0 != 0) goto L25
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            boolean r1 = r1.hasCategory(r2)
            if (r1 == 0) goto L25
            java.lang.String r1 = "android.intent.action.MAIN"
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 == 0) goto L25
            r3.finish()
        L25:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "onlyOpenAd"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L3c
            android.content.Intent r0 = r3.getIntent()
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r3.X = r0
        L3c:
            boolean r0 = r3.X
            if (r0 != 0) goto L6d
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.MainActivity> r1 = com.bxkj.student.MainActivity.class
            r0.i(r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r1 = com.bxkj.student.personal.login.LoginActivity.class
            r0.i(r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.h5.H5AppActivity> r1 = com.bxkj.student.v2.ui.h5.H5AppActivity.class
            r0.i(r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.MainActivity> r1 = com.bxkj.student.v2.ui.MainActivity.class
            r0.i(r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.v2.ui.LoginActivity> r1 = com.bxkj.student.v2.ui.LoginActivity.class
            r0.i(r1)
        L6d:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAgreement()
            if (r0 != 0) goto L89
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.splash.OpenPrivacyAgreementActivity> r2 = com.bxkj.student.splash.OpenPrivacyAgreementActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
        L89:
            android.content.Context r0 = r3.G()
            int r0 = com.bxkj.base.util.b0.g(r0)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r1 = r1.getLastVersionCode()
            if (r0 == r1) goto Lad
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.splash.WelcomeActivity> r2 = com.bxkj.student.splash.WelcomeActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
        Lad:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getSchoolId()
            boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r0)
            if (r0 == 0) goto Lcd
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.G()
            java.lang.Class<com.bxkj.student.splash.SelectSchoolV2Activity> r2 = com.bxkj.student.splash.SelectSchoolV2Activity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            return
        Lcd:
            androidx.databinding.ViewDataBinding r0 = r3.K()
            com.bxkj.student.databinding.AcSplashBinding r0 = (com.bxkj.student.databinding.AcSplashBinding) r0
            android.widget.TextView r0 = r0.tvSchoolName
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.L()
            r0.setText(r1)
            r3.Q()     // Catch: java.lang.Exception -> Le9
            r3.L()     // Catch: java.lang.Exception -> Le9
            return
        Le9:
            r0 = move-exception
            java.lang.String r0 = com.bxkj.base.v2.common.ext.e.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
    }
}

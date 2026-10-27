package com.bxkj.student;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MainActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.FrameLayout F0;
    private android.widget.TextView G0;
    private android.widget.RadioGroup H0;
    private java.util.List<androidx.fragment.app.Fragment> I0;
    private android.widget.ImageView J0;
    private int K0;
    private int L0;
    private boolean M0;
    private long N0;
    private int Y;
    private androidx.fragment.app.Fragment Z;
    private cn.bluemobi.dylan.base.adapter.a a0;
    private androidx.fragment.app.Fragment b0;
    private com.bxkj.base.util.v.c c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog f714k0;

    /* renamed from: p0, reason: collision with root package name */
    public android.app.Dialog f715p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.MainActivity a;

        a(com.bxkj.student.MainActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.bxkj.student.personal.login.c.c()
                com.bxkj.student.MainActivity r4 = r3.a
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.MainActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.MainActivity.o0(r1)
                java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r2 = com.bxkj.student.personal.login.LoginActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bxkj.student.common.versionupdate.a.d {
        final /* synthetic */ com.bxkj.student.common.versionupdate.a a;
        final /* synthetic */ com.bxkj.student.MainActivity b;

        b(com.bxkj.student.MainActivity r1, com.bxkj.student.common.versionupdate.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.versionupdate.a.d
        public void a(boolean r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                r2 = this;
                com.bxkj.student.MainActivity r0 = r2.b
                r1 = 1
                com.bxkj.student.MainActivity.k0(r0, r1)
                if (r3 == 0) goto L12
                com.bxkj.student.MainActivity r3 = r2.b
                com.bxkj.student.common.versionupdate.a r0 = r2.a
                android.app.Dialog r4 = r0.d(r4, r5, r6)
                r3.f715p0 = r4
            L12:
                com.bxkj.student.MainActivity r3 = r2.b
                r3.z0()
                return
        }

        @Override // com.bxkj.student.common.versionupdate.a.d
        public void b() {
                r2 = this;
                com.bxkj.student.MainActivity r0 = r2.b
                r1 = 0
                com.bxkj.student.MainActivity.k0(r0, r1)
                com.bxkj.student.MainActivity r0 = r2.b
                r0.z0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.MainActivity a;

        c(com.bxkj.student.MainActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.MainActivity r0 = r1.a
                r0.u0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "schName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setSchoolName(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "urlSite"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setServerUrl(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "isOpenEncry"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setIsOpenEncry(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "openId"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setAppId(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "sysType"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setSysType(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "isOpenKeep"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setIsOpenKeep(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "isOpenLive"
                r2 = 1
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1, r2)     // Catch: java.lang.Exception -> Lc2
                r0.setIsOpenLive(r1)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "oldToNewH5"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)     // Catch: java.lang.Exception -> Lc2
                r0.setOldToNewH5(r4)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r4 = r4.getServerUrl()     // Catch: java.lang.Exception -> Lc2
                cn.bluemobi.dylan.http.Http.changeBaseUrl(r4)     // Catch: java.lang.Exception -> Lc2
                java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Exception -> Lc2
                r4.<init>()     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r0 = r0.getSchoolName()     // Catch: java.lang.Exception -> Lc2
                r4.add(r0)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                int r4 = r4.getSysType()     // Catch: java.lang.Exception -> Lc2
                r0 = 2
                if (r4 != r0) goto Lc2
                com.bxkj.student.MainActivity r4 = r3.a     // Catch: java.lang.Exception -> Lc2
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lc2
                com.bxkj.student.MainActivity r1 = r3.a     // Catch: java.lang.Exception -> Lc2
                android.content.Context r1 = com.bxkj.student.MainActivity.p0(r1)     // Catch: java.lang.Exception -> Lc2
                java.lang.Class<com.bxkj.student.v2.ui.h5.H5AppActivity> r2 = com.bxkj.student.v2.ui.h5.H5AppActivity.class
                r0.<init>(r1, r2)     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "title"
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r2 = r2.getSchoolName()     // Catch: java.lang.Exception -> Lc2
                android.content.Intent r0 = r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
                java.lang.String r1 = "url"
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> Lc2
                java.lang.String r2 = r2.getServerUrl()     // Catch: java.lang.Exception -> Lc2
                android.content.Intent r0 = r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lc2
                r4.startActivity(r0)     // Catch: java.lang.Exception -> Lc2
                com.bxkj.student.MainActivity r4 = r3.a     // Catch: java.lang.Exception -> Lc2
                r4.finish()     // Catch: java.lang.Exception -> Lc2
            Lc2:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.MainActivity a;

        d(com.bxkj.student.MainActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.MainActivity r0 = r1.a
                r0.y0()
                return
        }

        public void netOnOtherStatus(int r1, java.lang.String r2) {
                r0 = this;
                super.netOnOtherStatus(r1, r2)
                com.bxkj.student.MainActivity r1 = r0.a
                r1.A0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                r0 = 0
                r2.setLogin(r0)
                com.bxkj.student.MainActivity r2 = r1.a
                com.bxkj.student.MainActivity.m0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.MainActivity a;

        e(com.bxkj.student.MainActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "collectPhoto"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.setHeadImageUrl(r1)
                java.lang.String r0 = "weixinId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L37
                java.lang.String r0 = "qqId"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L37
                com.bxkj.student.MainActivity r4 = r3.a
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.MainActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.MainActivity.q0(r1)
                java.lang.Class<com.bxkj.student.personal.bind.BindWechatQQActivity> r2 = com.bxkj.student.personal.bind.BindWechatQQActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
            L37:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.MainActivity a;

        f(com.bxkj.student.MainActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.MainActivity r0 = r2.a
                java.lang.String r1 = "data"
                int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.MainActivity.l0(r0, r3)
                com.bxkj.student.MainActivity r3 = r2.a
                com.bxkj.student.MainActivity.n0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.MainActivity a;

        g(com.bxkj.student.MainActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }
    }

    public MainActivity() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.Y = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.I0 = r1
            r2.K0 = r0
            r2.M0 = r0
            r0 = 0
            r2.N0 = r0
            return
    }

    private java.lang.String B0() {
            r3 = this;
            android.content.Context r0 = r3.V     // Catch: java.lang.Exception -> L14
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L14
            android.content.Context r1 = r3.V     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L14
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            java.lang.String r0 = "1.0"
            return r0
    }

    private /* synthetic */ void C0(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void D0() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.W
            com.bxkj.base.util.u.b(r0)
            return
    }

    private /* synthetic */ void E0(android.widget.RadioGroup r1, int r2) {
            r0 = this;
            r0.L0 = r2
            android.view.View r2 = r1.findViewById(r2)
            int r1 = r1.indexOfChild(r2)
            r0.K0 = r1
            r0.J0()
            return
    }

    private void F0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.personal.password.UpdatePasswordActivity> r2 = com.bxkj.student.personal.password.UpdatePasswordActivity.class
            r0.<init>(r1, r2)
            r1 = 2131952693(0x7f130435, float:1.9541836E38)
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = "msg"
            android.content.Intent r0 = r0.putExtra(r2, r1)
            r3.startActivity(r0)
            return
    }

    private void G0() {
            r2 = this;
            android.widget.RadioGroup r0 = r2.H0
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getId()
            r2.L0 = r0
            android.widget.RadioGroup r0 = r2.H0
            com.bxkj.student.f r1 = new com.bxkj.student.f
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    private void H0() {
            r3 = this;
            android.widget.RadioGroup r0 = r3.H0
            r1 = 1
            android.view.View r0 = r0.getChildAt(r1)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r2 = r2.getIsOpenLive()
            if (r2 != r1) goto L13
            r1 = 0
            goto L15
        L13:
            r1 = 8
        L15:
            r0.setVisibility(r1)
            return
    }

    private void I0() {
            r2 = this;
            int r0 = r2.Y
            if (r0 <= 0) goto Lb
            android.widget.ImageView r0 = r2.J0
            r1 = 0
            r0.setVisibility(r1)
            return
        Lb:
            android.widget.ImageView r0 = r2.J0
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    private void J0() {
            r5 = this;
            r0 = 0
        L1:
            java.util.List<androidx.fragment.app.Fragment> r1 = r5.I0
            int r1 = r1.size()
            if (r0 >= r1) goto L5a
            java.util.List<androidx.fragment.app.Fragment> r1 = r5.I0
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            int r2 = r5.K0
            if (r0 != r2) goto L42
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L2b
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            androidx.fragment.app.FragmentTransaction r1 = r2.show(r1)
            r1.commitAllowingStateLoss()
            goto L57
        L2b:
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            r3 = 2131298030(0x7f0906ee, float:1.8214022E38)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            androidx.fragment.app.FragmentTransaction r1 = r2.add(r3, r1, r4)
            r1.commitAllowingStateLoss()
            goto L57
        L42:
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L57
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            androidx.fragment.app.FragmentTransaction r1 = r2.hide(r1)
            r1.commitAllowingStateLoss()
        L57:
            int r0 = r0 + 1
            goto L1
        L5a:
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.MainActivity r0) {
            r0.D0()
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.MainActivity r0, android.widget.RadioGroup r1, int r2) {
            r0.E0(r1, r2)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.MainActivity r0, android.view.View r1) {
            r0.C0(r1)
            return
    }

    public static /* synthetic */ void j0(cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0, android.view.View r1) {
            r0.dismiss()
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            r1 = 1
            r0.n0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.MainActivity r0, boolean r1) {
            r0.M0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.MainActivity r0, int r1) {
            r0.Y = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.MainActivity r0) {
            r0.F0()
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.MainActivity r0) {
            r0.I0()
            return
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.MainActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.MainActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.MainActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void r0() {
            r10 = this;
            android.content.Context r0 = r10.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            w.f r2 = (w.f) r2
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getSchoolId()
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            com.bxkj.base.v2.common.utils.f r1 = com.bxkj.base.v2.common.utils.f.a
            android.content.Context r5 = r10.V
            java.lang.String r5 = r1.d(r5)
            java.lang.String r6 = r10.w0()
            java.lang.String r7 = r10.x0()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r8 = r1.getUserId()
            java.lang.String r9 = r10.B0()
            rx.e r1 = r2.h(r3, r4, r5, r6, r7, r8, r9)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.MainActivity$g r1 = new com.bxkj.student.MainActivity$g
            r1.<init>(r10)
            r0.setDataListener(r1)
            return
    }

    private java.lang.String s0(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L2e
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L2e
        L9:
            r0 = 0
            char r0 = r3.charAt(r0)
            boolean r1 = java.lang.Character.isUpperCase(r0)
            if (r1 == 0) goto L15
            return r3
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r0 = java.lang.Character.toUpperCase(r0)
            r1.append(r0)
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L2e:
            java.lang.String r3 = ""
            return r3
    }

    private void t0() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            long r2 = r2.getLastLoginTime()
            long r0 = r0 - r2
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r2 = r2.isLogin()
            if (r2 == 0) goto L3f
            r2 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3f
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            r1 = 0
            r0.setCancelable(r1)
            r0.setCanceledOnTouchOutside(r1)
            com.bxkj.student.MainActivity$a r1 = new com.bxkj.student.MainActivity$a
            r1.<init>(r5)
            r0.setButtonOnClickListener(r1)
            java.lang.String r1 = "登录过期,请重新登录"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
        L3f:
            return
    }

    private void v0() {
            r2 = this;
            com.bxkj.student.common.versionupdate.a r0 = new com.bxkj.student.common.versionupdate.a
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            com.bxkj.student.MainActivity$b r1 = new com.bxkj.student.MainActivity$b
            r1.<init>(r2, r0)
            r0.b(r1)
            return
    }

    private java.lang.String w0() {
            r1 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r1.s0(r0)
            return r0
    }

    private java.lang.String x0() {
            r2 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r2.s0(r1)
            return r0
        Lf:
            return r1
    }

    public void A0() {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L28
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.j1()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.MainActivity$e r1 = new com.bxkj.student.MainActivity$e
            r1.<init>(r2)
            r0.setDataListener(r1)
        L28:
            return
    }

    public void L() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.F0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492972(0x7f0c006c, float:1.860941E38)
            return r0
    }

    public void R() {
            r4 = this;
            b0.b r0 = b0.b.a
            android.content.Context r1 = r4.V
            boolean r0 = r0.c(r1)
            r1 = 0
            if (r0 != 0) goto L29
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r4.V
            r0.<init>(r2)
            java.lang.String r2 = "系统内部错误，错误码【1001】"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r2)
            r0.setClickAutoCancel(r1)
            r0.setCancelable(r1)
            com.bxkj.student.g r2 = new com.bxkj.student.g
            r2.<init>(r4)
            r0.setButtonOnClickListener(r2)
            r0.show()
        L29:
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            int r2 = r2.r()
            r3 = 1
            if (r2 != r3) goto L64
            com.bxkj.base.v2.data.b r2 = r0.a()
            boolean r2 = r2.p()
            if (r2 != 0) goto L64
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r3 = r4.V
            r2.<init>(r3)
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r0 = r0.s()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r2.setMessage(r0)
            r0.setClickAutoCancel(r1)
            r0.setCancelable(r1)
            com.bxkj.student.h r1 = new com.bxkj.student.h
            r1.<init>(r0)
            r0.setButtonOnClickListener(r1)
            r0.show()
        L64:
            r4.t0()
            java.util.List<androidx.fragment.app.Fragment> r0 = r4.I0
            androidx.fragment.app.Fragment r1 = r4.b0
            r0.add(r1)
            java.util.List<androidx.fragment.app.Fragment> r0 = r4.I0
            androidx.fragment.app.Fragment r1 = r4.Z
            r0.add(r1)
            r4.G0()
            r4.J0()
            r4.r0()     // Catch: java.lang.Exception -> L7f
            goto L80
        L7f:
        L80:
            r4.v0()
            android.content.Context r0 = r4.V
            boolean r0 = com.bxkj.base.util.u.a(r0)
            if (r0 != 0) goto Lb0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.String r1 = "为了能够让你不错过重要的通知消息,强烈建议你开始允许推送通知功能"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.i r1 = new com.bxkj.student.i
            r1.<init>(r4)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            java.lang.String r1 = "不了"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "去开启"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            r0.show()
        Lb0:
            return
    }

    public void S() {
            r1 = this;
            r0 = 0
            r1.c0(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto L28
            java.lang.String r0 = "currentIndex"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L10
            int r3 = r3.getInt(r0)
            r2.K0 = r3
        L10:
            androidx.fragment.app.FragmentManager r3 = r2.getSupportFragmentManager()
            java.lang.String r0 = "0"
            androidx.fragment.app.Fragment r3 = r3.findFragmentByTag(r0)
            r2.b0 = r3
            androidx.fragment.app.FragmentManager r3 = r2.getSupportFragmentManager()
            java.lang.String r0 = "2"
            androidx.fragment.app.Fragment r3 = r3.findFragmentByTag(r0)
            r2.Z = r3
        L28:
            androidx.fragment.app.Fragment r3 = r2.b0
            if (r3 != 0) goto L33
            com.bxkj.student.main.HomeFragment r3 = new com.bxkj.student.main.HomeFragment
            r3.<init>()
            r2.b0 = r3
        L33:
            androidx.fragment.app.Fragment r3 = r2.Z
            if (r3 != 0) goto L3e
            com.bxkj.student.main.MyFragment r3 = new com.bxkj.student.main.MyFragment
            r3.<init>()
            r2.Z = r3
        L3e:
            r3 = 2131298361(0x7f090839, float:1.8214693E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RadioGroup r3 = (android.widget.RadioGroup) r3
            r2.H0 = r3
            r3 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.G0 = r3
            r3 = 2131297219(0x7f0903c3, float:1.8212377E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.J0 = r3
            r3 = 2131297004(0x7f0902ec, float:1.821194E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2.F0 = r3
            return
    }

    public void onActivityResult(int r2, int r3, @androidx.annotation.Nullable android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            android.content.Context r0 = r1.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    public void onBackPressed() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.N0
            long r0 = r0 - r2
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            java.lang.String r0 = "再按一次退出程序"
            r5.f0(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.N0 = r0
            return
        L19:
            r5.finish()
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L17
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r1 = com.bxkj.student.personal.login.LoginActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
        L17:
            int r3 = r3.getId()
            switch(r3) {
                case 2131297004: goto L2c;
                case 2131297005: goto L1f;
                default: goto L1e;
            }
        L1e:
            return
        L1f:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.personal.MyQRCodeActivity> r1 = com.bxkj.student.personal.MyQRCodeActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
        L2c:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.message.MessageActivity> r1 = com.bxkj.student.home.message.MessageActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    protected void onDestroy() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f714k0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f714k0
            r0.dismiss()
        Lf:
            super.onDestroy()
            return
    }

    public boolean onKeyDown(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(r1, r2)
            return r1
    }

    protected void onRestart() {
            r1 = this;
            super/*android.app.Activity*/.onRestart()
            boolean r0 = r1.M0
            if (r0 != 0) goto La
            r1.v0()
        La:
            return
    }

    protected void onResume() {
            r2 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            android.widget.TextView r0 = r2.G0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getSchoolName()
            r0.setText(r1)
            return
    }

    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "currentIndex"
            int r1 = r2.K0
            r3.putInt(r0, r1)
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r3)
            return
    }

    public void u0() {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto Lb
            return
        Lb:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getAccount()
            rx.e r1 = r1.L(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.MainActivity$d r1 = new com.bxkj.student.MainActivity$d
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void y0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = "0"
            rx.e r1 = r1.Z(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.MainActivity$f r1 = new com.bxkj.student.MainActivity$f
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void z0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            rx.e r1 = r1.e(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.MainActivity$c r1 = new com.bxkj.student.MainActivity$c
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }
}

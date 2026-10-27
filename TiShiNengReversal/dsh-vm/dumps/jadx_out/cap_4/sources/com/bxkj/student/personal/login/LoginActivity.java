package com.bxkj.student.personal.login;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LoginActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button F0;
    private android.widget.Button G0;
    private android.widget.FrameLayout H0;
    private android.widget.CheckBox I0;
    private android.widget.TextView J0;
    private android.widget.TextView K0;
    private android.widget.LinearLayout L0;
    com.umeng.socialize.UMAuthListener M0;
    private androidx.appcompat.widget.Toolbar Y;
    private android.widget.TextView Z;
    private android.widget.EditText a0;
    private android.widget.EditText b0;
    private android.widget.Button c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1137k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1138p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.personal.login.LoginActivity a;

        a(com.bxkj.student.personal.login.LoginActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.personal.login.LoginActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog a;
        final /* synthetic */ com.bxkj.student.personal.login.LoginActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
            final /* synthetic */ com.bxkj.student.personal.login.LoginActivity.b a;

            a(com.bxkj.student.personal.login.LoginActivity.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void buttonRightOnClick() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 0
                    r0.setOpenModel(r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.personal.login.LoginActivity$b$b, reason: collision with other inner class name */
        class C0129b implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
            final /* synthetic */ com.bxkj.student.personal.login.LoginActivity.b a;

            C0129b(com.bxkj.student.personal.login.LoginActivity.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void buttonRightOnClick() {
                    r2 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1 = 1
                    r0.setOpenModel(r1)
                    return
            }
        }

        b(com.bxkj.student.personal.login.LoginActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.a
                r0.show()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.a
                r1 = 2131296939(0x7f0902ab, float:1.8211809E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2a
                com.bxkj.student.personal.login.LoginActivity r0 = r2.b
                java.lang.String r1 = "密码不能为空"
                r0.f0(r1)
                return
            L2a:
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r2.a     // Catch: java.lang.Exception -> L92
                r1.dismiss()     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "396436"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L92
                if (r0 == 0) goto L7d
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L92
                boolean r0 = r0.isOpenModel()     // Catch: java.lang.Exception -> L92
                if (r0 == 0) goto L5f
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.login.LoginActivity r1 = r2.b     // Catch: java.lang.Exception -> L92
                android.content.Context r1 = com.bxkj.student.personal.login.LoginActivity.l0(r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "确定关闭开发者模式？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.login.LoginActivity$b$a r1 = new com.bxkj.student.personal.login.LoginActivity$b$a     // Catch: java.lang.Exception -> L92
                r1.<init>(r2)     // Catch: java.lang.Exception -> L92
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L92
                r0.show()     // Catch: java.lang.Exception -> L92
                return
            L5f:
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.login.LoginActivity r1 = r2.b     // Catch: java.lang.Exception -> L92
                android.content.Context r1 = com.bxkj.student.personal.login.LoginActivity.m0(r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "确定打开开发者模式？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.login.LoginActivity$b$b r1 = new com.bxkj.student.personal.login.LoginActivity$b$b     // Catch: java.lang.Exception -> L92
                r1.<init>(r2)     // Catch: java.lang.Exception -> L92
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L92
                r0.show()     // Catch: java.lang.Exception -> L92
                return
            L7d:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.login.LoginActivity r1 = r2.b     // Catch: java.lang.Exception -> L92
                android.content.Context r1 = com.bxkj.student.personal.login.LoginActivity.n0(r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "密码错误，请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L92
                r0.show()     // Catch: java.lang.Exception -> L92
                return
            L92:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.login.LoginActivity r1 = r2.b
                android.content.Context r1 = com.bxkj.student.personal.login.LoginActivity.o0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "验证密码异常，请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.login.LoginActivity a;

        c(com.bxkj.student.personal.login.LoginActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.personal.login.LoginActivity r0 = r1.a
                androidx.fragment.app.FragmentActivity r0 = com.bxkj.student.personal.login.LoginActivity.p0(r0)
                com.bxkj.student.personal.login.c.b(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.umeng.socialize.UMAuthListener {
        final /* synthetic */ com.bxkj.student.personal.login.LoginActivity a;

        d(com.bxkj.student.personal.login.LoginActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r2, int r3) {
                r1 = this;
                com.bxkj.student.personal.login.LoginActivity r2 = r1.a
                android.content.Context r2 = com.bxkj.student.personal.login.LoginActivity.r0(r2)
                java.lang.String r3 = "您取消了登录"
                r0 = 1
                android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                r2.show()
                com.bxkj.student.personal.login.LoginActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.personal.login.LoginActivity.j0(r2)
                r2.setEnabled(r0)
                com.bxkj.student.personal.login.LoginActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.personal.login.LoginActivity.i0(r2)
                r2.setEnabled(r0)
                return
        }

        public void onComplete(com.umeng.socialize.bean.SHARE_MEDIA r2, int r3, java.util.Map<java.lang.String, java.lang.String> r4) {
                r1 = this;
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "platform="
                r3.append(r0)
                java.lang.String r0 = r2.name()
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                com.orhanobut.logger.j.c(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "data="
                r3.append(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.orhanobut.logger.j.c(r3)
                com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
                if (r2 != r3) goto L33
                java.lang.String r2 = "1"
                goto L35
            L33:
                java.lang.String r2 = "0"
            L35:
                java.lang.String r3 = "login_type"
                r4.put(r3, r2)
                com.bxkj.student.personal.login.LoginActivity r3 = r1.a
                com.bxkj.student.personal.login.LoginActivity.k0(r3, r2, r4)
                com.bxkj.student.personal.login.LoginActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.personal.login.LoginActivity.j0(r2)
                r3 = 1
                r2.setEnabled(r3)
                com.bxkj.student.personal.login.LoginActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.personal.login.LoginActivity.i0(r2)
                r2.setEnabled(r3)
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r1, int r2, java.lang.Throwable r3) {
                r0 = this;
                java.lang.String r1 = r3.getMessage()
                com.orhanobut.logger.j.c(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "action="
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.orhanobut.logger.j.c(r1)
                com.bxkj.student.personal.login.LoginActivity r1 = r0.a
                android.content.Context r1 = com.bxkj.student.personal.login.LoginActivity.q0(r1)
                java.lang.String r2 = "登录失败,请稍后再试"
                r3 = 1
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
                r1.show()
                com.bxkj.student.personal.login.LoginActivity r1 = r0.a
                android.widget.Button r1 = com.bxkj.student.personal.login.LoginActivity.j0(r1)
                r1.setEnabled(r3)
                com.bxkj.student.personal.login.LoginActivity r1 = r0.a
                android.widget.Button r1 = com.bxkj.student.personal.login.LoginActivity.i0(r1)
                r1.setEnabled(r3)
                return
        }

        public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ com.bxkj.student.personal.login.LoginActivity b;

        e(com.bxkj.student.personal.login.LoginActivity r1, java.util.Map r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r2 = this;
                super.netOnFinish()
                com.bxkj.student.personal.login.LoginActivity r0 = r2.b
                android.widget.Button r0 = com.bxkj.student.personal.login.LoginActivity.j0(r0)
                r1 = 1
                r0.setEnabled(r1)
                com.bxkj.student.personal.login.LoginActivity r0 = r2.b
                android.widget.Button r0 = com.bxkj.student.personal.login.LoginActivity.i0(r0)
                r0.setEnabled(r1)
                return
        }

        public void netOnOtherStatus(int r3, java.lang.String r4) {
                r2 = this;
                super.netOnOtherStatus(r3, r4)
                r0 = 201(0xc9, float:2.82E-43)
                if (r3 != r0) goto L52
                com.bxkj.student.personal.login.LoginActivity r3 = r2.b
                android.content.Intent r4 = new android.content.Intent
                com.bxkj.student.personal.login.LoginActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.personal.login.LoginActivity.t0(r0)
                java.lang.Class<com.bxkj.student.personal.bind.WechatQQBindAccountActivity> r1 = com.bxkj.student.personal.bind.WechatQQBindAccountActivity.class
                r4.<init>(r0, r1)
                java.util.Map r0 = r2.a
                java.lang.String r1 = "openid"
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r4 = r4.putExtra(r1, r0)
                java.util.Map r0 = r2.a
                java.lang.String r1 = "name"
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r4 = r4.putExtra(r1, r0)
                java.util.Map r0 = r2.a
                java.lang.String r1 = "iconurl"
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r4 = r4.putExtra(r1, r0)
                java.util.Map r0 = r2.a
                java.lang.String r1 = "login_type"
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                android.content.Intent r4 = r4.putExtra(r1, r0)
                r3.startActivity(r4)
                return
            L52:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.login.LoginActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.personal.login.LoginActivity.u0(r0)
                r3.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
                r3.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.personal.login.LoginActivity r0 = r1.b
                androidx.fragment.app.FragmentActivity r0 = com.bxkj.student.personal.login.LoginActivity.s0(r0)
                com.bxkj.student.personal.login.c.b(r0, r2)
                return
        }
    }

    public LoginActivity() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.personal.login.LoginActivity$d r0 = new com.bxkj.student.personal.login.LoginActivity$d
            r0.<init>(r1)
            r1.M0 = r0
            return
    }

    private void A0() {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "开发者模式专供开发者调试使用，请谨慎开启！开关开发者模式需要验证你的身份，请输入密码进行验证"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r0.setMessage(r1)
            r2 = 2131493147(0x7f0c011b, float:1.8609766E38)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setCenterCustomView(r2)
            com.bxkj.student.personal.login.LoginActivity$b r2 = new com.bxkj.student.personal.login.LoginActivity$b
            r2.<init>(r3, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.setRightButtonOnClickListener(r2)
            r0.show()
            return
    }

    private void C0(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "data="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = "openid"
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            rx.e r4 = r1.R(r4, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.personal.login.LoginActivity$e r0 = new com.bxkj.student.personal.login.LoginActivity$e
            r0.<init>(r3, r5)
            r4.setDataListener(r0)
            return
    }

    public static /* synthetic */ boolean g0(com.bxkj.student.personal.login.LoginActivity r0, android.view.View r1) {
            boolean r0 = r0.x0(r1)
            return r0
    }

    public static /* synthetic */ void h0(com.bxkj.student.personal.login.LoginActivity r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            r0.y0(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button i0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.widget.Button r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button j0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.widget.Button r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.personal.login.LoginActivity r0, java.lang.String r1, java.util.Map r2) {
            r0.C0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity p0(com.bxkj.student.personal.login.LoginActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity s0(com.bxkj.student.personal.login.LoginActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context u0(com.bxkj.student.personal.login.LoginActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void v0() {
            r1 = this;
            r0 = 2131298010(0x7f0906da, float:1.8213981E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.L0 = r0
            r0 = 2131299135(0x7f090b3f, float:1.8216263E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.K0 = r0
            r0 = 2131296925(0x7f09029d, float:1.821178E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.a0 = r0
            r0 = 2131296939(0x7f0902ab, float:1.8211809E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.b0 = r0
            r0 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.c0 = r0
            r0 = 2131298915(0x7f090a63, float:1.8215817E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1137k0 = r0
            r0 = 2131299136(0x7f090b40, float:1.8216265E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f1138p0 = r0
            r0 = 2131296656(0x7f090190, float:1.8211235E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.F0 = r0
            r0 = 2131296631(0x7f090177, float:1.8211184E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.G0 = r0
            r0 = 2131298027(0x7f0906eb, float:1.8214016E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.H0 = r0
            r0 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r1.Y = r0
            r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.Z = r0
            r0 = 2131296716(0x7f0901cc, float:1.8211357E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r1.I0 = r0
            r0 = 2131298774(0x7f0909d6, float:1.821553E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.J0 = r0
            return
    }

    private void w0() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a
            r0.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "mqqwpa://im/chat?chat_type=wpa&uin="
            r0.append(r1)     // Catch: java.lang.Exception -> L2a
            android.widget.FrameLayout r1 = r3.H0     // Catch: java.lang.Exception -> L2a
            java.lang.Object r1 = r1.getTag()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2a
            r0.append(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L2a
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L2a
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L2a
            r3.startActivity(r1)     // Catch: java.lang.Exception -> L2a
            return
        L2a:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "请先安装QQ！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    private /* synthetic */ boolean x0(android.view.View r1) {
            r0 = this;
            r0.A0()
            r1 = 0
            return r1
    }

    private /* synthetic */ void y0(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            r2 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1 = 1
            r0.setAgreement(r1)
            android.widget.CheckBox r0 = r2.I0
            r0.setChecked(r1)
            r3.dismiss()
            return
    }

    private void z0() {
            r4 = this;
            android.widget.EditText r0 = r4.a0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            android.widget.EditText r1 = r4.b0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L33
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入账号"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L33:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L4a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入密码"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L4a:
            android.widget.CheckBox r2 = r4.I0
            boolean r2 = r2.isChecked()
            if (r2 != 0) goto L63
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.String r1 = "请勾选同意用户协议"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L63:
            com.bxkj.base.util.x r2 = new com.bxkj.base.util.x     // Catch: java.lang.Exception -> L91
            r2.<init>()     // Catch: java.lang.Exception -> L91
            java.lang.String r1 = r2.a(r1)     // Catch: java.lang.Exception -> L91
            android.content.Context r2 = r4.V     // Catch: java.lang.Exception -> L91
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)     // Catch: java.lang.Exception -> L91
            java.lang.String r3 = "正在登录"
            cn.bluemobi.dylan.http.HttpRequest r2 = r2.setLoadingMessage(r3)     // Catch: java.lang.Exception -> L91
            java.lang.Class<d0.a> r3 = d0.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)     // Catch: java.lang.Exception -> L91
            d0.a r3 = (d0.a) r3     // Catch: java.lang.Exception -> L91
            rx.e r0 = r3.r(r0, r1)     // Catch: java.lang.Exception -> L91
            cn.bluemobi.dylan.http.HttpRequest r0 = r2.setObservable(r0)     // Catch: java.lang.Exception -> L91
            com.bxkj.student.personal.login.LoginActivity$c r1 = new com.bxkj.student.personal.login.LoginActivity$c     // Catch: java.lang.Exception -> L91
            r1.<init>(r4)     // Catch: java.lang.Exception -> L91
            r0.setDataListener(r1)     // Catch: java.lang.Exception -> L91
            return
        L91:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.String r1 = "登录异常，请联系管理员"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    public void B0(java.lang.String r2) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.H0
            r0.setTag(r2)
            return
    }

    public void L() {
            r2 = this;
            android.widget.TextView r0 = r2.J0
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r2.c0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1137k0
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r2.F0
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r2.G0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.f1138p0
            r0.setOnClickListener(r2)
            android.widget.FrameLayout r0 = r2.H0
            r0.setOnClickListener(r2)
            r0 = 2131297182(0x7f09039e, float:1.8212302E38)
            android.view.View r0 = r2.findViewById(r0)
            com.bxkj.student.personal.login.a r1 = new com.bxkj.student.personal.login.a
            r1.<init>(r2)
            r0.setOnLongClickListener(r1)
            android.widget.TextView r0 = r2.K0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492969(0x7f0c0069, float:1.8609405E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.EditText r0 = r2.a0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            r0.setText(r1)
            android.widget.TextView r0 = r2.J0
            android.text.TextPaint r0 = r0.getPaint()
            r1 = 8
            r0.setFlags(r1)
            android.widget.TextView r0 = r2.J0
            android.text.TextPaint r0 = r0.getPaint()
            r1 = 1
            r0.setAntiAlias(r1)
            return
    }

    public void S() {
            r1 = this;
            r0 = 0
            r1.c0(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            android.view.Window r2 = r1.getWindow()
            r0 = 16
            r2.setSoftInputMode(r0)
            r1.v0()
            androidx.appcompat.widget.Toolbar r2 = r1.Y     // Catch: java.lang.Exception -> L1c
            android.view.View r2 = r2.getRootView()     // Catch: java.lang.Exception -> L1c
            android.view.View r2 = r2.getRootView()     // Catch: java.lang.Exception -> L1c
            r0 = 2131689902(0x7f0f01ae, float:1.9008832E38)
            r2.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L1c
        L1c:
            com.bxkj.student.common.utils.l.d(r1)
            android.widget.TextView r2 = r1.Z
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getSchoolName()
            r2.setText(r0)
            androidx.appcompat.widget.Toolbar r2 = r1.Y
            r0 = 2131231200(0x7f0801e0, float:1.8078474E38)
            r2.setNavigationIcon(r0)
            androidx.appcompat.widget.Toolbar r2 = r1.Y
            com.bxkj.student.personal.login.LoginActivity$a r0 = new com.bxkj.student.personal.login.LoginActivity$a
            r0.<init>(r1)
            r2.setNavigationOnClickListener(r0)
            return
    }

    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r1)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            java.lang.String r0 = "请勾选同意用户协议"
            r1 = 0
            switch(r4) {
                case 2131296617: goto Lf5;
                case 2131296631: goto Lb9;
                case 2131296656: goto L7d;
                case 2131298027: goto L79;
                case 2131298774: goto L3b;
                case 2131298915: goto L2e;
                case 2131299135: goto L18;
                case 2131299136: goto Lb;
                default: goto La;
            }
        La:
            return
        Lb:
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.student.splash.SelectSchoolV2Activity> r1 = com.bxkj.student.splash.SelectSchoolV2Activity.class
            r4.<init>(r0, r1)
            r3.startActivity(r4)
            return
        L18:
            android.widget.LinearLayout r4 = r3.L0
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L28
            android.widget.LinearLayout r4 = r3.L0
            r0 = 8
            r4.setVisibility(r0)
            return
        L28:
            android.widget.LinearLayout r4 = r3.L0
            r4.setVisibility(r1)
            return
        L2e:
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.student.personal.password.forget.FindPasswordTypeActivity> r1 = com.bxkj.student.personal.password.forget.FindPasswordTypeActivity.class
            r4.<init>(r0, r1)
            r3.startActivity(r4)
            return
        L3b:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "用户协议"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setTitle(r0)
            r0 = 2131492946(0x7f0c0052, float:1.8609358E38)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setCenterCustomView(r0)
            java.lang.String r0 = "仅浏览"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setLeftButtonText(r0)
            java.lang.String r0 = "同意"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonText(r0)
            r0 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r0 = r4.findViewById(r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r0
            com.bxkj.student.v2.retrofit.b$a r1 = com.bxkj.student.v2.retrofit.b.a
            java.lang.String r1 = r1.c()
            r0.j(r1)
            com.bxkj.student.personal.login.b r0 = new com.bxkj.student.personal.login.b
            r0.<init>(r3, r4)
            r4.setRightButtonOnClickListener(r0)
            r4.show()
            return
        L79:
            r3.w0()
            return
        L7d:
            android.content.Context r4 = r3.V
            com.umeng.socialize.UMShareAPI r4 = com.umeng.socialize.UMShareAPI.get(r4)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            boolean r4 = r4.isInstall(r3, r2)
            if (r4 != 0) goto L91
            java.lang.String r4 = "您还未安装微信或微信版本过低"
            r3.f0(r4)
            return
        L91:
            android.widget.CheckBox r4 = r3.I0
            boolean r4 = r4.isChecked()
            if (r4 != 0) goto La8
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r4.<init>(r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
        La8:
            android.widget.Button r4 = r3.F0
            r4.setEnabled(r1)
            android.content.Context r4 = r3.V
            com.umeng.socialize.UMShareAPI r4 = com.umeng.socialize.UMShareAPI.get(r4)
            com.umeng.socialize.UMAuthListener r0 = r3.M0
            r4.getPlatformInfo(r3, r2, r0)
            return
        Lb9:
            android.widget.CheckBox r4 = r3.I0
            boolean r4 = r4.isChecked()
            if (r4 != 0) goto Ld0
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r4.<init>(r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
        Ld0:
            android.content.Context r4 = r3.V
            com.umeng.socialize.UMShareAPI r4 = com.umeng.socialize.UMShareAPI.get(r4)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            boolean r4 = r4.isInstall(r3, r0)
            if (r4 != 0) goto Le4
            java.lang.String r4 = "您还未安装QQ或QQ版本过低"
            r3.f0(r4)
            return
        Le4:
            android.widget.Button r4 = r3.G0
            r4.setEnabled(r1)
            android.content.Context r4 = r3.V
            com.umeng.socialize.UMShareAPI r4 = com.umeng.socialize.UMShareAPI.get(r4)
            com.umeng.socialize.UMAuthListener r1 = r3.M0
            r4.getPlatformInfo(r3, r0, r1)
            return
        Lf5:
            r3.z0()
            return
    }
}

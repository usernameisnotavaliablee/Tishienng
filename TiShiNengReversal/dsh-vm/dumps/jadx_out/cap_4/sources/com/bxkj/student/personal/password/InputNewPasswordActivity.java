package com.bxkj.student.personal.password;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InputNewPasswordActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.EditText Z;
    private android.widget.EditText a0;
    private android.widget.Button b0;
    private java.lang.String c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.personal.password.InputNewPasswordActivity a;

        a(com.bxkj.student.personal.password.InputNewPasswordActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.personal.password.InputNewPasswordActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.password.InputNewPasswordActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.personal.password.InputNewPasswordActivity.b a;

            a(com.bxkj.student.personal.password.InputNewPasswordActivity.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    cn.bluemobi.dylan.base.utils.a r4 = cn.bluemobi.dylan.base.utils.a.n()
                    r4.j()
                    com.bxkj.student.personal.password.InputNewPasswordActivity$b r4 = r3.a
                    com.bxkj.student.personal.password.InputNewPasswordActivity r4 = r4.a
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.personal.password.InputNewPasswordActivity$b r1 = r3.a
                    com.bxkj.student.personal.password.InputNewPasswordActivity r1 = r1.a
                    android.content.Context r1 = com.bxkj.student.personal.password.InputNewPasswordActivity.h0(r1)
                    java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r2 = com.bxkj.student.personal.login.LoginActivity.class
                    r0.<init>(r1, r2)
                    r4.startActivity(r0)
                    return
            }
        }

        b(com.bxkj.student.personal.password.InputNewPasswordActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.password.InputNewPasswordActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.password.InputNewPasswordActivity.g0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                r0 = 0
                r3.setLogin(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.password.InputNewPasswordActivity r1 = r2.a
                android.content.Context r1 = com.bxkj.student.personal.password.InputNewPasswordActivity.i0(r1)
                r3.<init>(r1)
                java.lang.String r1 = "密码重置成功，请登录"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r1)
                com.bxkj.student.personal.password.InputNewPasswordActivity$b$a r1 = new com.bxkj.student.personal.password.InputNewPasswordActivity$b$a
                r1.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r1)
                r3.setCancelable(r0)
                r3.show()
                return
        }
    }

    public InputNewPasswordActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.student.personal.password.InputNewPasswordActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.personal.password.InputNewPasswordActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.personal.password.InputNewPasswordActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.b0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492954(0x7f0c005a, float:1.8609374E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L3b
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "userNum"
            java.lang.String r0 = r0.getStringExtra(r2)
            r4.c0 = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.TextView r1 = r4.Y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.c0
            r2.append(r3)
            java.lang.String r3 = "--"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
        L3b:
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
            r3 = 2131298770(0x7f0909d2, float:1.8215523E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Y = r3
            r3 = 2131296939(0x7f0902ab, float:1.8211809E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.Z = r3
            r3 = 2131296940(0x7f0902ac, float:1.821181E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.a0 = r3
            r3 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.b0 = r3
            r3 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "设置新密码"
            r0.setText(r1)
            r0 = 2131231200(0x7f0801e0, float:1.8078474E38)
            r3.setNavigationIcon(r0)
            com.bxkj.student.personal.password.InputNewPasswordActivity$a r0 = new com.bxkj.student.personal.password.InputNewPasswordActivity$a
            r0.<init>(r2)
            r3.setNavigationOnClickListener(r0)
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L5f
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L5f
            r0 = 2131689902(0x7f0f01ae, float:1.9008832E38)
            r3.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L5f
        L5f:
            com.bxkj.student.common.utils.l.d(r2)
            return
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            android.widget.EditText r4 = r3.Z
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            android.widget.EditText r0 = r3.a0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L28
            java.lang.String r4 = "请输入新密码"
            r3.f0(r4)
            return
        L28:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L34
            java.lang.String r4 = "请再次输入新密码"
            r3.f0(r4)
            return
        L34:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L40
            java.lang.String r4 = "两次输入密码不一致"
            r3.f0(r4)
            return
        L40:
            com.bxkj.base.util.x r0 = new com.bxkj.base.util.x     // Catch: java.lang.Exception -> L4a
            r0.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = r0.a(r4)     // Catch: java.lang.Exception -> L4a
            goto L5b
        L4a:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "设置新密码异常，请联系管理员"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            r4 = 0
        L5b:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.c0
            rx.e r4 = r1.w1(r2, r4)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.personal.password.InputNewPasswordActivity$b r0 = new com.bxkj.student.personal.password.InputNewPasswordActivity$b
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }
}

package com.bxkj.student.personal.password;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class UpdatePasswordActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button F0;
    private android.widget.TextView G0;
    private android.widget.LinearLayout Y;
    private android.widget.LinearLayout Z;
    private android.widget.TextView a0;
    private android.widget.EditText b0;
    private android.widget.EditText c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.EditText f1139k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.EditText f1140p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.personal.password.UpdatePasswordActivity a;

        a(com.bxkj.student.personal.password.UpdatePasswordActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.personal.password.UpdatePasswordActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.password.UpdatePasswordActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.personal.password.UpdatePasswordActivity.b a;

            a(com.bxkj.student.personal.password.UpdatePasswordActivity.b r1) {
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
                    com.bxkj.student.personal.password.UpdatePasswordActivity$b r4 = r3.a
                    com.bxkj.student.personal.password.UpdatePasswordActivity r4 = r4.a
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.personal.password.UpdatePasswordActivity$b r1 = r3.a
                    com.bxkj.student.personal.password.UpdatePasswordActivity r1 = r1.a
                    android.content.Context r1 = com.bxkj.student.personal.password.UpdatePasswordActivity.h0(r1)
                    java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r2 = com.bxkj.student.personal.login.LoginActivity.class
                    r0.<init>(r1, r2)
                    r4.startActivity(r0)
                    return
            }
        }

        b(com.bxkj.student.personal.password.UpdatePasswordActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.password.UpdatePasswordActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.personal.password.UpdatePasswordActivity.g0(r0)
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
                com.bxkj.student.personal.password.UpdatePasswordActivity r1 = r2.a
                android.content.Context r1 = com.bxkj.student.personal.password.UpdatePasswordActivity.i0(r1)
                r3.<init>(r1)
                java.lang.String r1 = "密码修改成功，请重新登录"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r1)
                com.bxkj.student.personal.password.UpdatePasswordActivity$b$a r1 = new com.bxkj.student.personal.password.UpdatePasswordActivity$b$a
                r1.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r1)
                r3.setCancelable(r0)
                r3.show()
                return
        }
    }

    public UpdatePasswordActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.student.personal.password.UpdatePasswordActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.personal.password.UpdatePasswordActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.personal.password.UpdatePasswordActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.F0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493041(0x7f0c00b1, float:1.860955E38)
            return r0
    }

    public void R() {
            r6 = this;
            android.widget.TextView r0 = r6.G0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "学号："
            r1.append(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getAccount()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getRealName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9d
            int r1 = r0.length()
            r2 = 4
            java.lang.String r3 = "姓名："
            if (r1 > r2) goto L7d
            int r1 = r0.length()
            r2 = 1
            java.util.List r1 = com.bxkj.base.util.y.a(r1, r2)
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L4f:
            char[] r5 = r0.toCharArray()
            int r5 = r5.length
            if (r4 >= r5) goto L68
            if (r4 != r1) goto L60
            char r5 = r0.charAt(r4)
            r2.append(r5)
            goto L65
        L60:
            java.lang.String r5 = "*"
            r2.append(r5)
        L65:
            int r4 = r4 + 1
            goto L4f
        L68:
            android.widget.TextView r0 = r6.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            goto L9d
        L7d:
            android.widget.TextView r1 = r6.a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            android.widget.EditText r1 = r6.f1140p0
            r1.setText(r0)
            android.widget.LinearLayout r0 = r6.Z
            r1 = 8
            r0.setVisibility(r1)
        L9d:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "msg"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto Lbf
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r6.V
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r1.setMessage(r0)
            r0.show()
        Lbf:
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
            r3 = 2131298056(0x7f090708, float:1.8214074E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.Y = r3
            r3 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.a0 = r3
            r3 = 2131296938(0x7f0902aa, float:1.8211807E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.b0 = r3
            r3 = 2131296939(0x7f0902ab, float:1.8211809E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.c0 = r3
            r3 = 2131296940(0x7f0902ac, float:1.821181E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.f1139k0 = r3
            r3 = 2131296930(0x7f0902a2, float:1.821179E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.f1140p0 = r3
            r3 = 2131296600(0x7f090158, float:1.8211121E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.F0 = r3
            r3 = 2131298770(0x7f0909d2, float:1.8215523E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.G0 = r3
            r3 = 2131298026(0x7f0906ea, float:1.8214014E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.Z = r3
            r3 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "修改密码"
            r0.setText(r1)
            r0 = 2131231200(0x7f0801e0, float:1.8078474E38)
            r3.setNavigationIcon(r0)
            com.bxkj.student.personal.password.UpdatePasswordActivity$a r0 = new com.bxkj.student.personal.password.UpdatePasswordActivity$a
            r0.<init>(r2)
            r3.setNavigationOnClickListener(r0)
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L96
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L96
            r0 = 2131689902(0x7f0f01ae, float:1.9008832E38)
            r3.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L96
        L96:
            com.bxkj.student.common.utils.l.d(r2)
            return
    }

    public void onClick(android.view.View r5) {
            r4 = this;
            android.widget.EditText r5 = r4.b0
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            android.widget.EditText r0 = r4.c0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            android.widget.EditText r1 = r4.f1139k0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.widget.EditText r2 = r4.f1140p0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L44
            java.lang.String r5 = "请输入真实姓名"
            r4.f0(r5)
            return
        L44:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getRealName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            java.lang.String r5 = "请输入正确的姓名"
            r4.f0(r5)
            return
        L58:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L64
            java.lang.String r5 = "请输入旧密码"
            r4.f0(r5)
            return
        L64:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L70
            java.lang.String r5 = "请输入新密码"
            r4.f0(r5)
            return
        L70:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L7c
            java.lang.String r5 = "请再次输入新密码"
            r4.f0(r5)
            return
        L7c:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L88
            java.lang.String r5 = "两次输入密码不一致"
            r4.f0(r5)
            return
        L88:
            r1 = 0
            com.bxkj.base.util.x r2 = new com.bxkj.base.util.x     // Catch: java.lang.Exception -> L9c
            r2.<init>()     // Catch: java.lang.Exception -> L9c
            java.lang.String r5 = r2.a(r5)     // Catch: java.lang.Exception -> L9c
            com.bxkj.base.util.x r2 = new com.bxkj.base.util.x     // Catch: java.lang.Exception -> L9d
            r2.<init>()     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = r2.a(r0)     // Catch: java.lang.Exception -> L9d
            goto Lad
        L9c:
            r5 = r1
        L9d:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r4.V
            r0.<init>(r2)
            java.lang.String r2 = "修改密码异常，请联系管理员"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r2)
            r0.show()
        Lad:
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r2 = d0.a.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            d0.a r2 = (d0.a) r2
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r5 = r2.V0(r3, r5, r1)
            cn.bluemobi.dylan.http.HttpRequest r5 = r0.setObservable(r5)
            com.bxkj.student.personal.password.UpdatePasswordActivity$b r0 = new com.bxkj.student.personal.password.UpdatePasswordActivity$b
            r0.<init>(r4)
            r5.setDataListener(r0)
            return
    }
}

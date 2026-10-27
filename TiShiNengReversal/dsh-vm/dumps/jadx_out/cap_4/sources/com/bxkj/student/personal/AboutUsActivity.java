package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AboutUsActivity extends cn.bluemobi.dylan.base.BaseActivity {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnLongClickListener {
        final /* synthetic */ com.bxkj.student.personal.AboutUsActivity a;

        a(com.bxkj.student.personal.AboutUsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.personal.AboutUsActivity r1 = r0.a
                com.bxkj.student.personal.AboutUsActivity.g0(r1)
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog a;
        final /* synthetic */ com.bxkj.student.personal.AboutUsActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
            final /* synthetic */ com.bxkj.student.personal.AboutUsActivity.b a;

            a(com.bxkj.student.personal.AboutUsActivity.b r1) {
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
        /* renamed from: com.bxkj.student.personal.AboutUsActivity$b$b, reason: collision with other inner class name */
        class C0128b implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
            final /* synthetic */ com.bxkj.student.personal.AboutUsActivity.b a;

            C0128b(com.bxkj.student.personal.AboutUsActivity.b r1) {
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

        b(com.bxkj.student.personal.AboutUsActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
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
                com.bxkj.student.personal.AboutUsActivity r0 = r2.b
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
                com.bxkj.student.personal.AboutUsActivity r1 = r2.b     // Catch: java.lang.Exception -> L92
                android.content.Context r1 = com.bxkj.student.personal.AboutUsActivity.h0(r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "确定关闭开发者模式？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.AboutUsActivity$b$a r1 = new com.bxkj.student.personal.AboutUsActivity$b$a     // Catch: java.lang.Exception -> L92
                r1.<init>(r2)     // Catch: java.lang.Exception -> L92
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L92
                r0.show()     // Catch: java.lang.Exception -> L92
                return
            L5f:
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.AboutUsActivity r1 = r2.b     // Catch: java.lang.Exception -> L92
                android.content.Context r1 = com.bxkj.student.personal.AboutUsActivity.i0(r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "确定打开开发者模式？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.AboutUsActivity$b$b r1 = new com.bxkj.student.personal.AboutUsActivity$b$b     // Catch: java.lang.Exception -> L92
                r1.<init>(r2)     // Catch: java.lang.Exception -> L92
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L92
                r0.show()     // Catch: java.lang.Exception -> L92
                return
            L7d:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L92
                com.bxkj.student.personal.AboutUsActivity r1 = r2.b     // Catch: java.lang.Exception -> L92
                android.content.Context r1 = com.bxkj.student.personal.AboutUsActivity.j0(r1)     // Catch: java.lang.Exception -> L92
                r0.<init>(r1)     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "密码错误，请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)     // Catch: java.lang.Exception -> L92
                r0.show()     // Catch: java.lang.Exception -> L92
                return
            L92:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.AboutUsActivity r1 = r2.b
                android.content.Context r1 = com.bxkj.student.personal.AboutUsActivity.k0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "验证密码异常，请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
        }
    }

    public AboutUsActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ void g0(com.bxkj.student.personal.AboutUsActivity r0) {
            r0.l0()
            return
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.personal.AboutUsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.personal.AboutUsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.personal.AboutUsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.personal.AboutUsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void l0() {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "开发者模式专供开发者调试使用，请谨慎开启！开关开发者模式需要验证你的身份，请输入密码进行验证"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r0.setMessage(r1)
            r2 = 2131493147(0x7f0c011b, float:1.8609766E38)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setCenterCustomView(r2)
            com.bxkj.student.personal.AboutUsActivity$b r2 = new com.bxkj.student.personal.AboutUsActivity$b
            r2.<init>(r3, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.setRightButtonOnClickListener(r2)
            r0.show()
            return
    }

    public void L() {
            r2 = this;
            r0 = 2131297182(0x7f09039e, float:1.8212302E38)
            android.view.View r0 = r2.findViewById(r0)
            com.bxkj.student.personal.AboutUsActivity$a r1 = new com.bxkj.student.personal.AboutUsActivity$a
            r1.<init>(r2)
            r0.setOnLongClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492892(0x7f0c001c, float:1.8609249E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "关于我们"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

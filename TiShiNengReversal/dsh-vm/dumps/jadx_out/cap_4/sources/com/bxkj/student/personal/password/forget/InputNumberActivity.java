package com.bxkj.student.personal.password.forget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InputNumberActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private android.widget.Button Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.personal.password.forget.InputNumberActivity a;

        a(com.bxkj.student.personal.password.forget.InputNumberActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.personal.password.forget.InputNumberActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.personal.password.forget.InputNumberActivity b;

        b(com.bxkj.student.personal.password.forget.InputNumberActivity r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                java.lang.String r0 = "data"
                java.util.List r5 = cn.bluemobi.dylan.http.JsonParse.getList(r5, r0)
                java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r5)
                com.bxkj.student.personal.password.forget.InputNumberActivity r0 = r4.b
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.personal.password.forget.InputNumberActivity r2 = r4.b
                android.content.Context r2 = com.bxkj.student.personal.password.forget.InputNumberActivity.h0(r2)
                java.lang.Class<com.bxkj.student.personal.password.forget.SelectClassmateActivity> r3 = com.bxkj.student.personal.password.forget.SelectClassmateActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "userNumber"
                java.lang.String r3 = r4.a
                android.content.Intent r1 = r1.putExtra(r2, r3)
                java.lang.String r2 = "classmate"
                android.content.Intent r5 = r1.putExtra(r2, r5)
                r0.startActivity(r5)
                return
        }
    }

    public InputNumberActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.personal.password.forget.InputNumberActivity r0, android.view.View r1) {
            r0.i0(r1)
            return
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.personal.password.forget.InputNumberActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void i0(android.view.View r1) {
            r0 = this;
            r0.j0()
            return
    }

    private void j0() {
            r3 = this;
            android.widget.EditText r0 = r3.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L25
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入要找回密码的学号"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L25:
            android.content.Context r1 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.Class<d0.a> r2 = d0.a.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            d0.a r2 = (d0.a) r2
            rx.e r2 = r2.p1(r0)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.setObservable(r2)
            com.bxkj.student.personal.password.forget.InputNumberActivity$b r2 = new com.bxkj.student.personal.password.forget.InputNumberActivity$b
            r2.<init>(r3, r0)
            r1.setDataListener(r2)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.Z
            com.bxkj.student.personal.password.forget.b r1 = new com.bxkj.student.personal.password.forget.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492955(0x7f0c005b, float:1.8609377E38)
            return r0
    }

    public void R() {
            r0 = this;
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
            r3 = 2131296925(0x7f09029d, float:1.821178E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.Y = r3
            r3 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.Z = r3
            r3 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "输入要找回密码的学号"
            r0.setText(r1)
            r0 = 2131231200(0x7f0801e0, float:1.8078474E38)
            r3.setNavigationIcon(r0)
            com.bxkj.student.personal.password.forget.InputNumberActivity$a r0 = new com.bxkj.student.personal.password.forget.InputNumberActivity$a
            r0.<init>(r2)
            r3.setNavigationOnClickListener(r0)
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L49
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Exception -> L49
            r0 = 2131689902(0x7f0f01ae, float:1.9008832E38)
            r3.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L49
        L49:
            com.bxkj.student.common.utils.l.d(r2)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

package com.bxkj.student.personal.customer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ContactCustomerServiceActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private android.widget.EditText a0;
    private android.widget.Button b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerServiceActivity d;

        a(com.bxkj.student.personal.customer.ContactCustomerServiceActivity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.setTempUserId(r4)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r3.a
                r4.setTempUserName(r0)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r3.b
                r4.setTempUserNumber(r0)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r3.c
                r4.setTempUserPhone(r0)
                com.bxkj.student.personal.customer.ContactCustomerServiceActivity r4 = r3.d
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.personal.customer.ContactCustomerServiceActivity r1 = r3.d
                android.content.Context r1 = com.bxkj.student.personal.customer.ContactCustomerServiceActivity.h0(r1)
                java.lang.Class<com.bxkj.student.personal.customer.ContactCustomerActivity> r2 = com.bxkj.student.personal.customer.ContactCustomerActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                com.bxkj.student.personal.customer.ContactCustomerServiceActivity r4 = r3.d
                r4.finish()
                return
        }
    }

    public ContactCustomerServiceActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.personal.customer.ContactCustomerServiceActivity r0, android.view.View r1) {
            r0.j0(r1)
            return
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.student.personal.customer.ContactCustomerServiceActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void i0() {
            r5 = this;
            android.widget.EditText r0 = r5.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2d
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            android.widget.EditText r1 = r5.Y
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L2d:
            android.widget.EditText r1 = r5.Z
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L5a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            android.widget.EditText r1 = r5.Z
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L5a:
            android.widget.EditText r2 = r5.a0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L87
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            android.widget.EditText r1 = r5.a0
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r1 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L87:
            int r3 = r2.length()
            r4 = 11
            if (r3 == r4) goto La0
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入正确的手机号码"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        La0:
            android.content.Context r3 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            java.lang.Class<d0.a> r4 = d0.a.class
            java.lang.Object r4 = cn.bluemobi.dylan.http.Http.getApiService(r4)
            d0.a r4 = (d0.a) r4
            rx.e r4 = r4.e1(r1, r0, r2)
            cn.bluemobi.dylan.http.HttpRequest r3 = r3.setObservable(r4)
            com.bxkj.student.personal.customer.ContactCustomerServiceActivity$a r4 = new com.bxkj.student.personal.customer.ContactCustomerServiceActivity$a
            r4.<init>(r5, r0, r1, r2)
            r3.setDataListener(r4)
            return
    }

    private /* synthetic */ void j0(android.view.View r1) {
            r0 = this;
            r0.i0()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.b0
            com.bxkj.student.personal.customer.b r1 = new com.bxkj.student.personal.customer.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492926(0x7f0c003e, float:1.8609318E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "请输入联系方式"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296935(0x7f0902a7, float:1.82118E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            r1 = 2131296937(0x7f0902a9, float:1.8211805E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Z = r1
            r1 = 2131296941(0x7f0902ad, float:1.8211813E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.a0 = r1
            r1 = 2131296601(0x7f090159, float:1.8211123E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

package com.bxkj.student.personal.customer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ContactUsFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.ListView k;

    /* renamed from: l, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1135l;

    /* renamed from: m, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> f1136m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactUsFragment e;

        a(com.bxkj.student.personal.customer.ContactUsFragment r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r3 = this;
                r0 = 2131299055(0x7f090aef, float:1.82161E38)
                android.view.View r4 = r4.h(r0)
                android.widget.TextView r4 = (android.widget.TextView) r4
                com.bxkj.student.personal.customer.ContactUsFragment r0 = r3.e
                java.lang.String r1 = "qq"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                java.lang.String r2 = "androidQqKey"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                com.bxkj.student.personal.customer.ContactUsFragment.R(r0, r4, r1, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactUsFragment a;

        b(com.bxkj.student.personal.customer.ContactUsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "customerServicePhone"
                java.lang.String r1 = "4008330860"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0, r1)
                com.bxkj.student.personal.customer.ContactUsFragment r1 = r3.a
                com.bxkj.student.personal.customer.ContactUsFragment.Q(r1, r0)
                com.bxkj.student.personal.customer.ContactUsFragment r0 = r3.a
                java.lang.String r1 = "customerServiceQq"
                java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.student.personal.customer.ContactUsFragment.P(r0, r1)
                com.bxkj.student.personal.customer.ContactUsFragment r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r0 = com.bxkj.student.personal.customer.ContactUsFragment.N(r0)
                com.bxkj.student.personal.customer.ContactUsFragment r1 = r3.a
                java.util.List r1 = com.bxkj.student.personal.customer.ContactUsFragment.O(r1)
                r0.c(r1)
                com.bxkj.student.personal.customer.ContactUsFragment r0 = r3.a
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                java.lang.String r1 = "serviceQq"
                java.lang.String r2 = "884165111"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1, r2)
                boolean r1 = r0 instanceof com.bxkj.student.personal.login.LoginActivity
                if (r1 == 0) goto L3e
                com.bxkj.student.personal.login.LoginActivity r0 = (com.bxkj.student.personal.login.LoginActivity) r0
                r0.B0(r4)
            L3e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.text.style.ClickableSpan {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.personal.customer.ContactUsFragment b;

        c(com.bxkj.student.personal.customer.ContactUsFragment r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View r2) {
                r1 = this;
                com.bxkj.student.personal.customer.ContactUsFragment r2 = r1.b
                java.lang.String r0 = r1.a
                r2.U(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.text.style.ClickableSpan {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.personal.customer.ContactUsFragment b;

        d(com.bxkj.student.personal.customer.ContactUsFragment r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View r2) {
                r1 = this;
                com.bxkj.student.personal.customer.ContactUsFragment r2 = r1.b
                java.lang.String r0 = r1.a
                r2.W(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements s.b.a {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.personal.customer.ContactUsFragment b;

        e(com.bxkj.student.personal.customer.ContactUsFragment r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.DIAL"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "tel:"
                r1.append(r2)
                java.lang.String r2 = r3.a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                r0.setData(r1)
                com.bxkj.student.personal.customer.ContactUsFragment r1 = r3.b
                r1.startActivity(r0)
                return
        }

        @Override // s.b.a
        public void b(java.lang.String... r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.customer.ContactUsFragment r0 = r1.b
                android.content.Context r0 = com.bxkj.student.personal.customer.ContactUsFragment.T(r0)
                r2.<init>(r0)
                java.lang.String r0 = "您拒绝了拨打电话权限,无法联系客服！"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }

        @Override // s.b.a
        public void c(java.lang.String... r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.personal.customer.ContactUsFragment r0 = r1.b
                android.content.Context r0 = com.bxkj.student.personal.customer.ContactUsFragment.S(r0)
                r2.<init>(r0)
                java.lang.String r0 = "您拒绝了拨打电话权限,无法联系客服！"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }
    }

    public ContactUsFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1135l = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a N(com.bxkj.student.personal.customer.ContactUsFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1136m
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List O(com.bxkj.student.personal.customer.ContactUsFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1135l
            return r0
    }

    static /* bridge */ /* synthetic */ void P(com.bxkj.student.personal.customer.ContactUsFragment r0, java.util.List r1) {
            r0.f1135l = r1
            return
    }

    static /* bridge */ /* synthetic */ void Q(com.bxkj.student.personal.customer.ContactUsFragment r0, java.lang.String r1) {
            r0.X(r1)
            return
    }

    static /* bridge */ /* synthetic */ void R(com.bxkj.student.personal.customer.ContactUsFragment r0, android.widget.TextView r1, java.lang.String r2, java.lang.String r3) {
            r0.Y(r1, r2, r3)
            return
    }

    static /* synthetic */ android.content.Context S(com.bxkj.student.personal.customer.ContactUsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context T(com.bxkj.student.personal.customer.ContactUsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void V() {
            r2 = this;
            android.content.Context r0 = r2.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.a0()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.personal.customer.ContactUsFragment$b r1 = new com.bxkj.student.personal.customer.ContactUsFragment$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void X(java.lang.String r6) {
            r5 = this;
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "客服电话："
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            com.bxkj.student.personal.customer.ContactUsFragment$c r1 = new com.bxkj.student.personal.customer.ContactUsFragment$c
            r1.<init>(r5, r6)
            int r6 = r0.length()
            r2 = 5
            r3 = 33
            r0.setSpan(r1, r2, r6, r3)
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            int r1 = r0.length()
            r0.setSpan(r6, r2, r1, r3)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            android.content.Context r1 = r5.g
            r4 = 2131099737(0x7f060059, float:1.7811836E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r4)
            r6.<init>(r1)
            int r1 = r0.length()
            r0.setSpan(r6, r2, r1, r3)
            android.widget.TextView r6 = r5.j
            r6.setText(r0)
            android.widget.TextView r6 = r5.j
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r0)
            return
    }

    private void Y(android.widget.TextView r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "加入QQ群："
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            com.bxkj.student.personal.customer.ContactUsFragment$d r6 = new com.bxkj.student.personal.customer.ContactUsFragment$d
            r6.<init>(r4, r7)
            int r7 = r0.length()
            r1 = 6
            r2 = 33
            r0.setSpan(r6, r1, r7, r2)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            android.content.Context r7 = r4.g
            r3 = 2131099737(0x7f060059, float:1.7811836E38)
            int r7 = androidx.core.content.ContextCompat.getColor(r7, r3)
            r6.<init>(r7)
            int r7 = r0.length()
            r0.setSpan(r6, r1, r7, r2)
            r5.setText(r0)
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
            r5.setMovementMethod(r6)
            return
    }

    public void U(java.lang.String r3) {
            r2 = this;
            s.b r0 = new s.b
            r0.<init>(r2)
            java.lang.String r1 = "android.permission.CALL_PHONE"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            s.b r0 = r0.c(r1)
            com.bxkj.student.personal.customer.ContactUsFragment$e r1 = new com.bxkj.student.personal.customer.ContactUsFragment$e
            r1.<init>(r2, r3)
            r0.d(r1)
            return
    }

    public boolean W(java.lang.String r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0.setData(r4)
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L22
            r4 = 1
            return r4
        L22:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.g
            r4.<init>(r0)
            java.lang.String r0 = "您还未安装手机QQ或安装的手机QQ版本太低"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            r4 = 0
            return r4
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r4 = this;
            com.bxkj.student.personal.customer.ContactUsFragment$a r0 = new com.bxkj.student.personal.customer.ContactUsFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493245(0x7f0c017d, float:1.8609965E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1135l
            r0.<init>(r4, r1, r2, r3)
            r4.f1136m = r0
            android.widget.ListView r1 = r4.k
            r1.setAdapter(r0)
            java.lang.String r0 = "4008330860"
            r4.X(r0)
            r4.V()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.j = r1
            r1 = 2131298100(0x7f090734, float:1.8214164E38)
            android.view.View r1 = r0.c(r1)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r0.k = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493182(0x7f0c013e, float:1.8609837E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

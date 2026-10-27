package com.bxkj.student.life.secondhand;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BuyDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.Button H0;
    private android.widget.RelativeLayout I0;
    private java.lang.String J0;
    private java.util.Map<java.lang.String, java.lang.Object> K0;
    private java.util.List<java.lang.String> L0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> M0;
    private int N0;
    private java.lang.String O0;
    private java.lang.String P0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private cn.bluemobi.dylan.base.view.MyGridView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1057k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1058p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
        final /* synthetic */ com.bxkj.student.life.secondhand.BuyDetailActivity e;

        a(com.bxkj.student.life.secondhand.BuyDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.lang.String r4) {
                r2 = this;
                r0 = 2131297161(0x7f090389, float:1.821226E38)
                r1 = 2131689689(0x7f0f00d9, float:1.90084E38)
                r3.t(r0, r4, r1, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.widget.AdapterView.OnItemClickListener {
        final /* synthetic */ com.bxkj.student.life.secondhand.BuyDetailActivity a;

        b(com.bxkj.student.life.secondhand.BuyDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.life.secondhand.BuyDetailActivity r1 = r0.a
                java.util.List r1 = com.bxkj.student.life.secondhand.BuyDetailActivity.h0(r1)
                int r1 = r1.size()
                java.lang.String[] r1 = new java.lang.String[r1]
                com.bxkj.student.life.secondhand.BuyDetailActivity r2 = r0.a
                java.util.List r4 = com.bxkj.student.life.secondhand.BuyDetailActivity.h0(r2)
                java.lang.Object[] r1 = r4.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                com.bxkj.student.life.secondhand.BuyDetailActivity.m0(r2, r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ rx.e a;
        final /* synthetic */ com.bxkj.student.life.secondhand.BuyDetailActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.secondhand.BuyDetailActivity.c a;

            a(com.bxkj.student.life.secondhand.BuyDetailActivity.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                    r1 = this;
                    cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                    java.lang.Class<com.bxkj.student.life.lost.MyLostGoodsActivity> r0 = com.bxkj.student.life.lost.MyLostGoodsActivity.class
                    android.app.Activity r2 = r2.getActivity(r0)
                    com.bxkj.student.life.lost.MyLostGoodsActivity r2 = (com.bxkj.student.life.lost.MyLostGoodsActivity) r2
                    if (r2 == 0) goto L11
                    r2.t0()
                L11:
                    com.bxkj.student.life.secondhand.BuyDetailActivity$c r2 = r1.a
                    com.bxkj.student.life.secondhand.BuyDetailActivity r2 = r2.b
                    android.widget.Button r2 = com.bxkj.student.life.secondhand.BuyDetailActivity.g0(r2)
                    java.lang.CharSequence r2 = r2.getText()
                    java.lang.String r2 = r2.toString()
                    java.lang.String r2 = r2.trim()
                    java.lang.String r0 = "删除"
                    boolean r2 = r2.equals(r0)
                    if (r2 == 0) goto L4f
                    com.bxkj.student.life.secondhand.BuyDetailActivity$c r2 = r1.a
                    com.bxkj.student.life.secondhand.BuyDetailActivity r2 = r2.b
                    java.lang.String r0 = "删除成功"
                    r2.f0(r0)
                    cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                    java.lang.Class<com.bxkj.student.life.secondhand.SecondHandListFragment> r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.class
                    androidx.fragment.app.Fragment r2 = r2.o(r0)
                    com.bxkj.student.life.secondhand.SecondHandListFragment r2 = (com.bxkj.student.life.secondhand.SecondHandListFragment) r2
                    if (r2 == 0) goto L47
                    r2.f0()
                L47:
                    com.bxkj.student.life.secondhand.BuyDetailActivity$c r2 = r1.a
                    com.bxkj.student.life.secondhand.BuyDetailActivity r2 = r2.b
                    r2.finish()
                    return
                L4f:
                    com.bxkj.student.life.secondhand.BuyDetailActivity$c r2 = r1.a
                    com.bxkj.student.life.secondhand.BuyDetailActivity r2 = r2.b
                    java.lang.String r0 = "已关闭"
                    r2.f0(r0)
                    com.bxkj.student.life.secondhand.BuyDetailActivity$c r2 = r1.a
                    com.bxkj.student.life.secondhand.BuyDetailActivity r2 = r2.b
                    com.bxkj.student.life.secondhand.BuyDetailActivity.k0(r2)
                    return
            }
        }

        c(com.bxkj.student.life.secondhand.BuyDetailActivity r1, rx.e r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r2 = this;
                com.bxkj.student.life.secondhand.BuyDetailActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.life.secondhand.BuyDetailActivity.n0(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                rx.e r1 = r2.a
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.secondhand.BuyDetailActivity$c$a r1 = new com.bxkj.student.life.secondhand.BuyDetailActivity$c$a
                r1.<init>(r2)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.secondhand.BuyDetailActivity a;

        d(com.bxkj.student.life.secondhand.BuyDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.secondhand.BuyDetailActivity r0 = r2.a
                android.widget.RelativeLayout r0 = com.bxkj.student.life.secondhand.BuyDetailActivity.i0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.life.secondhand.BuyDetailActivity r0 = r2.a
                com.bxkj.student.life.secondhand.BuyDetailActivity.j0(r0, r3)
                com.bxkj.student.life.secondhand.BuyDetailActivity r3 = r2.a
                com.bxkj.student.life.secondhand.BuyDetailActivity.l0(r3)
                return
        }
    }

    public BuyDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button g0(com.bxkj.student.life.secondhand.BuyDetailActivity r0) {
            android.widget.Button r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.life.secondhand.BuyDetailActivity r0) {
            java.util.List<java.lang.String> r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RelativeLayout i0(com.bxkj.student.life.secondhand.BuyDetailActivity r0) {
            android.widget.RelativeLayout r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.life.secondhand.BuyDetailActivity r0, java.util.Map r1) {
            r0.K0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.life.secondhand.BuyDetailActivity r0) {
            r0.p0()
            return
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.life.secondhand.BuyDetailActivity r0) {
            r0.q0()
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.life.secondhand.BuyDetailActivity r0, java.lang.String[] r1, int r2) {
            r0.s0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.life.secondhand.BuyDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void o0() {
            r4 = this;
            android.widget.Button r0 = r4.H0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "删除"
            boolean r0 = r0.equals(r1)
            java.lang.Class<w.i> r1 = w.i.class
            if (r0 == 0) goto L2d
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.i r0 = (w.i) r0
            java.lang.String r1 = r4.J0
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r0 = r0.b(r1, r2)
            goto L41
        L2d:
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.i r0 = (w.i) r0
            java.lang.String r1 = r4.J0
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r0 = r0.a(r1, r2)
        L41:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "确定要"
            r2.append(r3)
            android.widget.Button r3 = r4.H0
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            r2.append(r3)
            java.lang.String r3 = "吗？"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setMessage(r2)
            com.bxkj.student.life.secondhand.BuyDetailActivity$c r2 = new com.bxkj.student.life.secondhand.BuyDetailActivity$c
            r2.<init>(r4, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.setRightButtonOnClickListener(r2)
            r0.show()
            return
    }

    private void p0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.i> r1 = w.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.i r1 = (w.i) r1
            java.lang.String r2 = r4.J0
            java.lang.String r3 = r4.O0
            rx.e r1 = r1.g(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.secondhand.BuyDetailActivity$d r1 = new com.bxkj.student.life.secondhand.BuyDetailActivity$d
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void q0() {
            r4 = this;
            android.widget.TextView r0 = r4.Y
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.K0
            java.lang.String r2 = "publishTime"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r4.Z
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.K0
            java.lang.String r2 = "goodsTypeName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r4.a0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.K0
            java.lang.String r2 = "description"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r4.c0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.K0
            java.lang.String r2 = "price"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.K0
            java.lang.String r1 = "img"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1, r2)
            r4.L0 = r0
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> r1 = r4.M0
            r1.c(r0)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r4.b0
            java.util.List<java.lang.String> r1 = r4.L0
            r2 = 0
            if (r1 == 0) goto L54
            int r1 = r1.size()
            if (r1 <= 0) goto L54
            r1 = 0
            goto L56
        L54:
            r1 = 8
        L56:
            r0.setVisibility(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.K0
            java.lang.String r1 = "myMotice"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            r4.P0 = r0
            java.lang.String r1 = "Y"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.K0
            java.lang.String r1 = "status"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.widget.Button r1 = r4.H0
            r1.setVisibility(r2)
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)
            r3 = 1
            if (r1 == 0) goto L8e
            android.widget.Button r0 = r4.H0
            r0.setEnabled(r3)
            android.widget.Button r0 = r4.H0
            java.lang.String r1 = "删除"
            r0.setText(r1)
            goto Lc4
        L8e:
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto La3
            android.widget.Button r0 = r4.H0
            r0.setEnabled(r3)
            android.widget.Button r0 = r4.H0
            java.lang.String r1 = "关闭"
            r0.setText(r1)
            goto Lc4
        La3:
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb8
            android.widget.Button r0 = r4.H0
            r0.setEnabled(r2)
            android.widget.Button r0 = r4.H0
            java.lang.String r1 = "审核不通过"
            r0.setText(r1)
            goto Lc4
        Lb8:
            android.widget.Button r0 = r4.H0
            r0.setEnabled(r2)
            android.widget.Button r0 = r4.H0
            java.lang.String r1 = "已关闭"
            r0.setText(r1)
        Lc4:
            r4.r0()
            return
    }

    private void r0() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.K0
            java.lang.String r1 = "phone"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L1d
            android.widget.TextView r0 = r4.f1057k0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            goto L2d
        L1d:
            android.widget.TextView r1 = r4.f1057k0
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.f1057k0
            r1.setText(r0)
        L2d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.K0
            java.lang.String r1 = "wechat"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L47
            android.widget.TextView r0 = r4.f1058p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            goto L57
        L47:
            android.widget.TextView r1 = r4.f1058p0
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.f1058p0
            r1.setText(r0)
        L57:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.K0
            java.lang.String r1 = "qq"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L71
            android.widget.TextView r0 = r4.G0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            return
        L71:
            android.widget.TextView r1 = r4.G0
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.G0
            r1.setText(r0)
            return
    }

    private void s0(java.lang.String[] r4, int r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r0.putExtra(r4, r5)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r5 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r5)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.H0
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.b0
            com.bxkj.student.life.secondhand.BuyDetailActivity$b r1 = new com.bxkj.student.life.secondhand.BuyDetailActivity$b
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492911(0x7f0c002f, float:1.8609287E38)
            return r0
    }

    public void R() {
            r4 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInLost()
            if (r0 == 0) goto L14
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getOpenId()
            r4.O0 = r0
        L14:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "noticeId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2a
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.J0 = r0
        L2a:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "buyType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L4e
            android.content.Intent r0 = r4.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r4.N0 = r0
            if (r0 != 0) goto L49
            java.lang.String r0 = "求购信息"
            r4.setTitle(r0)
            goto L4e
        L49:
            java.lang.String r0 = "出售信息"
            r4.setTitle(r0)
        L4e:
            com.bxkj.student.life.secondhand.BuyDetailActivity$a r0 = new com.bxkj.student.life.secondhand.BuyDetailActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493280(0x7f0c01a0, float:1.8610036E38)
            java.util.List<java.lang.String> r3 = r4.L0
            r0.<init>(r4, r1, r2, r3)
            r4.M0 = r0
            cn.bluemobi.dylan.base.view.MyGridView r1 = r4.b0
            r1.setAdapter(r0)
            r4.p0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "物品详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298860(0x7f090a2c, float:1.8215705E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            r2 = 2131298878(0x7f090a3e, float:1.8215742E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.b0 = r2
            r2 = 2131299047(0x7f090ae7, float:1.8216084E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            r2 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f1057k0 = r2
            r2 = 2131299188(0x7f090b74, float:1.821637E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f1058p0 = r2
            r2 = 2131299055(0x7f090aef, float:1.82161E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            r2 = 2131296597(0x7f090155, float:1.8211115E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.H0 = r2
            r2 = 2131298994(0x7f090ab2, float:1.8215977E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.F0 = r2
            r2 = 2131298404(0x7f090864, float:1.821478E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.I0 = r2
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296597(0x7f090155, float:1.8211115E38)
            if (r2 == r0) goto La
            return
        La:
            r1.o0()
            return
    }
}

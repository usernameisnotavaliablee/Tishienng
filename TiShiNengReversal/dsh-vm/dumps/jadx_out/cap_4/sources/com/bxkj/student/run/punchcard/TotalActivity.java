package com.bxkj.student.run.punchcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TotalActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1300k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.run.punchcard.TotalActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.run.punchcard.TotalActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0139a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.run.punchcard.TotalActivity.a b;

            ViewOnClickListenerC0139a(com.bxkj.student.run.punchcard.TotalActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.run.punchcard.TotalActivity$a r4 = r3.b
                    com.bxkj.student.run.punchcard.TotalActivity r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.run.punchcard.TotalActivity$a r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.run.punchcard.TotalActivity.a.m(r1)
                    java.lang.Class<com.bxkj.student.run.punchcard.RecorderListActivity> r2 = com.bxkj.student.run.punchcard.RecorderListActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "sysTermId"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.lang.String r2 = "termId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r4.startActivity(r0)
                    return
            }
        }

        a(com.bxkj.student.run.punchcard.TotalActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.run.punchcard.TotalActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r3 = this;
                java.lang.String r0 = "sysTerm"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "score"
                double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r5, r1)
                r0.append(r1)
                java.lang.String r1 = "分"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "合格次数："
                r0.append(r1)
                java.lang.String r1 = "goodNum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299062(0x7f090af6, float:1.8216115E38)
                r4.J(r1, r0)
                com.bxkj.student.run.punchcard.TotalActivity$a$a r0 = new com.bxkj.student.run.punchcard.TotalActivity$a$a
                r0.<init>(r3, r5)
                r5 = 2131296688(0x7f0901b0, float:1.82113E38)
                r4.w(r5, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.punchcard.TotalActivity a;

        b(com.bxkj.student.run.punchcard.TotalActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.punchcard.TotalActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.run.punchcard.TotalActivity.j0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.run.punchcard.TotalActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.run.punchcard.TotalActivity.i0(r0, r3)
                com.bxkj.student.run.punchcard.TotalActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.run.punchcard.TotalActivity.g0(r3)
                com.bxkj.student.run.punchcard.TotalActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.run.punchcard.TotalActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public TotalActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.run.punchcard.TotalActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1300k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.run.punchcard.TotalActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.run.punchcard.TotalActivity r0, java.util.List r1) {
            r0.c0 = r1
            return
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.run.punchcard.TotalActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void k0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.W(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.punchcard.TotalActivity$b r1 = new com.bxkj.student.run.punchcard.TotalActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493003(0x7f0c008b, float:1.8609474E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.widget.TextView r0 = r5.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "姓名："
            r1.append(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getRealName()
            r1.append(r2)
            java.lang.String r2 = "\u3000学号："
            r1.append(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getAccount()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r5, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setLayoutAnimation(r0)
            com.bxkj.student.run.punchcard.TotalActivity$a r0 = new com.bxkj.student.run.punchcard.TotalActivity$a
            android.content.Context r2 = r5.V
            r3 = 2131493302(0x7f0c01b6, float:1.861008E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.c0
            r0.<init>(r5, r2, r3, r4)
            r5.f1300k0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r1 = 2
            r0.setOverScrollMode(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r5.findViewById(r1)
            r0.setEmptyView(r1)
            r5.k0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "刷脸记录"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            r2 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.Z = r2
            r2 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131298994(0x7f090ab2, float:1.8215977E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

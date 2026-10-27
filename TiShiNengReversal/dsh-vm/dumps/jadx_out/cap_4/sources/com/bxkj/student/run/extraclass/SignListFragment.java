package com.bxkj.student.run.extraclass;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SignListFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView j;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> k;

    /* renamed from: l, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1284l;

    /* renamed from: m, reason: collision with root package name */
    private com.scwang.smartrefresh.layout.SmartRefreshLayout f1285m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.TextView f1286n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f1287o;

    /* renamed from: p, reason: collision with root package name */
    private int f1288p;

    /* renamed from: q, reason: collision with root package name */
    private int f1289q;

    /* renamed from: r, reason: collision with root package name */
    private int f1290r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f1291s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.run.extraclass.SignListFragment k;

        a(com.bxkj.student.run.extraclass.SignListFragment r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                int r0 = r7.f()
                int r0 = r0 + 1
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1 = 2131298991(0x7f090aaf, float:1.821597E38)
                r7.J(r1, r0)
                r0 = 2131297100(0x7f09034c, float:1.8212135E38)
                r1 = 0
                r7.N(r0, r1)
                com.bxkj.student.run.extraclass.SignListFragment r0 = r6.k
                java.lang.String r0 = com.bxkj.student.run.extraclass.SignListFragment.T(r0)
                java.lang.String r1 = "all"
                boolean r0 = r1.equals(r0)
                r1 = 2131299113(0x7f090b29, float:1.8216218E38)
                r2 = 2131299159(0x7f090b57, float:1.8216312E38)
                java.lang.String r3 = "punchDay"
                r4 = 2131298881(0x7f090a41, float:1.8215748E38)
                r5 = 2131298894(0x7f090a4e, float:1.8215774E38)
                if (r0 == 0) goto L62
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r3)
                r7.J(r4, r0)
                java.lang.String r0 = "punchTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r2, r0)
                java.lang.String r0 = "type"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r1, r0)
                java.lang.String r0 = "status"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r5, r8)
                android.content.Context r8 = r6.e
                r0 = 2131099739(0x7f06005b, float:1.781184E38)
                int r8 = androidx.core.content.ContextCompat.getColor(r8, r0)
                r7.K(r5, r8)
                return
            L62:
                java.lang.String r0 = "punchOnTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r4, r0)
                java.lang.String r0 = "punchOffTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r2, r0)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r3)
                r7.J(r1, r0)
                java.lang.String r0 = "timeLength"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r5, r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.run.extraclass.SignListFragment a;

        b(com.bxkj.student.run.extraclass.SignListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.run.extraclass.SignListFragment r4 = r3.a
                int r4 = com.bxkj.student.run.extraclass.SignListFragment.S(r4)
                com.bxkj.student.run.extraclass.SignListFragment r0 = r3.a
                int r0 = com.bxkj.student.run.extraclass.SignListFragment.Q(r0)
                int r4 = r4 / r0
                com.bxkj.student.run.extraclass.SignListFragment r0 = r3.a
                int r0 = com.bxkj.student.run.extraclass.SignListFragment.P(r0)
                com.bxkj.student.run.extraclass.SignListFragment r1 = r3.a
                int r1 = com.bxkj.student.run.extraclass.SignListFragment.S(r1)
                com.bxkj.student.run.extraclass.SignListFragment r2 = r3.a
                int r2 = com.bxkj.student.run.extraclass.SignListFragment.Q(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.run.extraclass.SignListFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.run.extraclass.SignListFragment.R(r4)
                r4.q0()
                com.bxkj.student.run.extraclass.SignListFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.run.extraclass.SignListFragment r4 = r3.a
                int r0 = com.bxkj.student.run.extraclass.SignListFragment.P(r4)
                int r0 = r0 + 1
                com.bxkj.student.run.extraclass.SignListFragment.U(r4, r0)
                com.bxkj.student.run.extraclass.SignListFragment r4 = r3.a
                com.bxkj.student.run.extraclass.SignListFragment.W(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.run.extraclass.SignListFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.run.extraclass.SignListFragment.U(r2, r0)
                com.bxkj.student.run.extraclass.SignListFragment r2 = r1.a
                com.bxkj.student.run.extraclass.SignListFragment.W(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.extraclass.SignListFragment a;

        c(com.bxkj.student.run.extraclass.SignListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.extraclass.SignListFragment.R(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.extraclass.SignListFragment.R(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.extraclass.SignListFragment.R(r0)
                r0.w0()
            L20:
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.extraclass.SignListFragment.R(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.extraclass.SignListFragment.R(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.extraclass.SignListFragment.R(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.extraclass.SignListFragment r0 = r1.a
                android.content.Context r0 = com.bxkj.student.run.extraclass.SignListFragment.X(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.run.extraclass.SignListFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.run.extraclass.SignListFragment.V(r0, r1)
                com.bxkj.student.run.extraclass.SignListFragment r0 = r2.a
                int r0 = com.bxkj.student.run.extraclass.SignListFragment.P(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.run.extraclass.SignListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.run.extraclass.SignListFragment.O(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.run.extraclass.SignListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.run.extraclass.SignListFragment.O(r0)
                r0.addAll(r3)
                com.bxkj.student.run.extraclass.SignListFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.run.extraclass.SignListFragment.N(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public SignListFragment() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.k = r0
            java.lang.String r0 = "all"
            r2.f1287o = r0
            r0 = 1
            r2.f1288p = r0
            r1 = 15
            r2.f1289q = r1
            r2.f1290r = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.run.extraclass.SignListFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1284l
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List O(com.bxkj.student.run.extraclass.SignListFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.run.extraclass.SignListFragment r0) {
            int r0 = r0.f1288p
            return r0
    }

    static /* bridge */ /* synthetic */ int Q(com.bxkj.student.run.extraclass.SignListFragment r0) {
            int r0 = r0.f1289q
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout R(com.bxkj.student.run.extraclass.SignListFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.f1285m
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.run.extraclass.SignListFragment r0) {
            int r0 = r0.f1290r
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String T(com.bxkj.student.run.extraclass.SignListFragment r0) {
            java.lang.String r0 = r0.f1287o
            return r0
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.run.extraclass.SignListFragment r0, int r1) {
            r0.f1288p = r1
            return
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.run.extraclass.SignListFragment r0, int r1) {
            r0.f1290r = r1
            return
    }

    static /* bridge */ /* synthetic */ void W(com.bxkj.student.run.extraclass.SignListFragment r0) {
            r0.Y()
            return
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.run.extraclass.SignListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void Y() {
            r5 = this;
            java.lang.String r0 = "all"
            java.lang.String r1 = r5.f1287o
            boolean r0 = r0.equals(r1)
            java.lang.Class<d0.a> r1 = d0.a.class
            if (r0 == 0) goto L25
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            java.lang.String r2 = r5.f1291s
            int r3 = r5.f1288p
            int r4 = r5.f1289q
            rx.e r0 = r0.k(r1, r2, r3, r4)
            goto L3d
        L25:
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            java.lang.String r2 = r5.f1291s
            int r3 = r5.f1288p
            int r4 = r5.f1289q
            rx.e r0 = r0.s0(r1, r2, r3, r4)
        L3d:
            android.content.Context r1 = r5.g
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            com.bxkj.student.run.extraclass.SignListFragment$c r1 = new com.bxkj.student.run.extraclass.SignListFragment$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r4 = this;
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L32
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "type"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1c
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.f1287o = r0
        L1c:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "termId"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.f1291s = r0
        L32:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.j
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.g
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.run.extraclass.SignListFragment$a r0 = new com.bxkj.student.run.extraclass.SignListFragment$a
            android.content.Context r1 = r4.g
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.k
            r3 = 2131493234(0x7f0c0172, float:1.8609942E38)
            r0.<init>(r4, r1, r3, r2)
            r4.f1284l = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.j
            r1.setAdapter(r0)
            android.widget.TextView r0 = r4.f1286n
            java.lang.String r1 = "暂无打卡数据，赶快去打卡吧！"
            r0.setText(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.j
            android.widget.TextView r1 = r4.f1286n
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.f1285m
            com.bxkj.student.run.extraclass.SignListFragment$b r1 = new com.bxkj.student.run.extraclass.SignListFragment$b
            r1.<init>(r4)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.f1285m
            r0.D()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.j = r1
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.c(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.f1285m = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1286n = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493641(0x7f0c0309, float:1.8610768E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

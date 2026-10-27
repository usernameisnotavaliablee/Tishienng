package com.bxkj.student.run.punchcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RecordListFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView j;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> k;

    /* renamed from: l, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1292l;

    /* renamed from: m, reason: collision with root package name */
    private com.scwang.smartrefresh.layout.SmartRefreshLayout f1293m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.TextView f1294n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f1295o;

    /* renamed from: p, reason: collision with root package name */
    private int f1296p;

    /* renamed from: q, reason: collision with root package name */
    private int f1297q;

    /* renamed from: r, reason: collision with root package name */
    private int f1298r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f1299s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.run.punchcard.RecordListFragment k;

        a(com.bxkj.student.run.punchcard.RecordListFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
                r7 = this;
                int r0 = r8.f()
                int r0 = r0 + 1
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1 = 2131298991(0x7f090aaf, float:1.821597E38)
                r8.J(r1, r0)
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r7.k
                java.lang.String r0 = com.bxkj.student.run.punchcard.RecordListFragment.T(r0)
                java.lang.String r1 = "all"
                boolean r0 = r1.equals(r0)
                java.lang.String r1 = "punchDay"
                java.lang.String r2 = "weekNum"
                r3 = 2131299113(0x7f090b29, float:1.8216218E38)
                java.lang.String r4 = "machineName"
                r5 = 2131299159(0x7f090b57, float:1.8216312E38)
                if (r0 == 0) goto L79
                r0 = 2131298881(0x7f090a41, float:1.8215748E38)
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r4)
                r8.J(r0, r4)
                java.lang.String r0 = "state"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r0)
                r8.J(r5, r0)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r2)
                r8.J(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r1)
                r0.append(r1)
                java.lang.String r1 = "\u3000"
                r0.append(r1)
                java.lang.String r1 = "punchTime"
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r0 = 2131298894(0x7f090a4e, float:1.8215774E38)
                r8.J(r0, r9)
                com.bxkj.student.run.punchcard.RecordListFragment r9 = r7.k
                android.content.res.Resources r9 = r9.getResources()
                r0 = 2131099739(0x7f06005b, float:1.781184E38)
                int r9 = r9.getColor(r0)
                r8.K(r5, r9)
                return
            L79:
                java.lang.String r0 = "sysUserName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r0)
                r6 = 2131298986(0x7f090aaa, float:1.821596E38)
                r8.J(r6, r0)
                r0 = 2131299190(0x7f090b76, float:1.8216374E38)
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r2)
                r8.J(r0, r2)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r4)
                r8.J(r5, r0)
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r1)
                r8.J(r3, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.run.punchcard.RecordListFragment a;

        b(com.bxkj.student.run.punchcard.RecordListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.run.punchcard.RecordListFragment r4 = r3.a
                int r4 = com.bxkj.student.run.punchcard.RecordListFragment.S(r4)
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r3.a
                int r0 = com.bxkj.student.run.punchcard.RecordListFragment.Q(r0)
                int r4 = r4 / r0
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r3.a
                int r0 = com.bxkj.student.run.punchcard.RecordListFragment.P(r0)
                com.bxkj.student.run.punchcard.RecordListFragment r1 = r3.a
                int r1 = com.bxkj.student.run.punchcard.RecordListFragment.S(r1)
                com.bxkj.student.run.punchcard.RecordListFragment r2 = r3.a
                int r2 = com.bxkj.student.run.punchcard.RecordListFragment.Q(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.run.punchcard.RecordListFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.run.punchcard.RecordListFragment.R(r4)
                r4.q0()
                com.bxkj.student.run.punchcard.RecordListFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.run.punchcard.RecordListFragment r4 = r3.a
                int r0 = com.bxkj.student.run.punchcard.RecordListFragment.P(r4)
                int r0 = r0 + 1
                com.bxkj.student.run.punchcard.RecordListFragment.U(r4, r0)
                com.bxkj.student.run.punchcard.RecordListFragment r4 = r3.a
                com.bxkj.student.run.punchcard.RecordListFragment.W(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.run.punchcard.RecordListFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.run.punchcard.RecordListFragment.U(r2, r0)
                com.bxkj.student.run.punchcard.RecordListFragment r2 = r1.a
                com.bxkj.student.run.punchcard.RecordListFragment.W(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.punchcard.RecordListFragment a;

        c(com.bxkj.student.run.punchcard.RecordListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.punchcard.RecordListFragment.R(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.punchcard.RecordListFragment.R(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.punchcard.RecordListFragment.R(r0)
                r0.w0()
            L20:
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.punchcard.RecordListFragment.R(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.punchcard.RecordListFragment.R(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.punchcard.RecordListFragment.R(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r1.a
                android.content.Context r0 = com.bxkj.student.run.punchcard.RecordListFragment.X(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.run.punchcard.RecordListFragment.V(r0, r1)
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r2.a
                int r0 = com.bxkj.student.run.punchcard.RecordListFragment.P(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.run.punchcard.RecordListFragment.O(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.run.punchcard.RecordListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.run.punchcard.RecordListFragment.O(r0)
                r0.addAll(r3)
                com.bxkj.student.run.punchcard.RecordListFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.run.punchcard.RecordListFragment.N(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public RecordListFragment() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.k = r0
            java.lang.String r0 = "all"
            r2.f1295o = r0
            r0 = 1
            r2.f1296p = r0
            r1 = 15
            r2.f1297q = r1
            r2.f1298r = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1292l
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List O(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            int r0 = r0.f1296p
            return r0
    }

    static /* bridge */ /* synthetic */ int Q(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            int r0 = r0.f1297q
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout R(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.f1293m
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            int r0 = r0.f1298r
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String T(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            java.lang.String r0 = r0.f1295o
            return r0
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.run.punchcard.RecordListFragment r0, int r1) {
            r0.f1296p = r1
            return
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.run.punchcard.RecordListFragment r0, int r1) {
            r0.f1298r = r1
            return
    }

    static /* bridge */ /* synthetic */ void W(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            r0.Y()
            return
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.run.punchcard.RecordListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void Y() {
            r5 = this;
            java.lang.String r0 = "all"
            java.lang.String r1 = r5.f1295o
            boolean r0 = r0.equals(r1)
            java.lang.Class<d0.a> r1 = d0.a.class
            if (r0 == 0) goto L25
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            java.lang.String r2 = r5.f1299s
            int r3 = r5.f1296p
            int r4 = r5.f1297q
            rx.e r0 = r0.s1(r1, r2, r3, r4)
            goto L3d
        L25:
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            java.lang.String r2 = r5.f1299s
            int r3 = r5.f1296p
            int r4 = r5.f1297q
            rx.e r0 = r0.E0(r1, r2, r3, r4)
        L3d:
            android.content.Context r1 = r5.g
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            com.bxkj.student.run.punchcard.RecordListFragment$c r1 = new com.bxkj.student.run.punchcard.RecordListFragment$c
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
            r4.f1295o = r0
        L1c:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "termId"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.f1299s = r0
        L32:
            java.lang.String r0 = "all"
            java.lang.String r1 = r4.f1295o
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 2131493301(0x7f0c01b5, float:1.8610078E38)
            goto L43
        L40:
            r0 = 2131493247(0x7f0c017f, float:1.8609969E38)
        L43:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.j
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r4.g
            r2.<init>(r3)
            r1.setLayoutManager(r2)
            com.bxkj.student.run.punchcard.RecordListFragment$a r1 = new com.bxkj.student.run.punchcard.RecordListFragment$a
            android.content.Context r2 = r4.g
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.k
            r1.<init>(r4, r2, r0, r3)
            r4.f1292l = r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.j
            r0.setAdapter(r1)
            android.widget.TextView r0 = r4.f1294n
            java.lang.String r1 = "暂无打卡数据，赶快去打卡吧！"
            r0.setText(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.j
            android.widget.TextView r1 = r4.f1294n
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.f1293m
            com.bxkj.student.run.punchcard.RecordListFragment$b r1 = new com.bxkj.student.run.punchcard.RecordListFragment$b
            r1.<init>(r4)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.f1293m
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
            r0.f1293m = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1294n = r1
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

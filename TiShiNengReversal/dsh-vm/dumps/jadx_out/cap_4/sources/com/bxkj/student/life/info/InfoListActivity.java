package com.bxkj.student.life.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InfoListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private boolean I0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private com.google.android.material.tabs.TabLayout b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f991k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f992p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.student.life.info.InfoListActivity a;

        a(com.bxkj.student.life.info.InfoListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                int r4 = com.bxkj.student.life.info.InfoListActivity.m0(r4)
                com.bxkj.student.life.info.InfoListActivity r0 = r3.a
                int r0 = com.bxkj.student.life.info.InfoListActivity.k0(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.info.InfoListActivity r0 = r3.a
                int r0 = com.bxkj.student.life.info.InfoListActivity.j0(r0)
                com.bxkj.student.life.info.InfoListActivity r1 = r3.a
                int r1 = com.bxkj.student.life.info.InfoListActivity.m0(r1)
                com.bxkj.student.life.info.InfoListActivity r2 = r3.a
                int r2 = com.bxkj.student.life.info.InfoListActivity.k0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.info.InfoListActivity.l0(r4)
                r4.q0()
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                int r0 = com.bxkj.student.life.info.InfoListActivity.j0(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.info.InfoListActivity.o0(r4, r0)
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                boolean r4 = com.bxkj.student.life.info.InfoListActivity.h0(r4)
                if (r4 == 0) goto L51
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                com.bxkj.student.life.info.InfoListActivity.r0(r4)
                return
            L51:
                com.bxkj.student.life.info.InfoListActivity r4 = r3.a
                com.bxkj.student.life.info.InfoListActivity.s0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.info.InfoListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.life.info.InfoListActivity.o0(r2, r0)
                com.bxkj.student.life.info.InfoListActivity r2 = r1.a
                boolean r2 = com.bxkj.student.life.info.InfoListActivity.h0(r2)
                if (r2 == 0) goto L14
                com.bxkj.student.life.info.InfoListActivity r2 = r1.a
                com.bxkj.student.life.info.InfoListActivity.r0(r2)
                return
            L14:
                com.bxkj.student.life.info.InfoListActivity r2 = r1.a
                com.bxkj.student.life.info.InfoListActivity.s0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.student.life.info.InfoListActivity a;

        b(com.bxkj.student.life.info.InfoListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                com.bxkj.student.life.info.InfoListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.life.info.InfoListActivity.n0(r2, r0)
                com.bxkj.student.life.info.InfoListActivity r2 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = com.bxkj.student.life.info.InfoListActivity.l0(r2)
                r2.D()
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.info.InfoListActivity a;

        c(com.bxkj.student.life.info.InfoListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.lang.String r1 = "typeList"
                java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.life.info.InfoListActivity.q0(r0, r1)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                com.bxkj.student.life.info.InfoListActivity.t0(r0)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.info.InfoListActivity.p0(r0, r1)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                int r0 = com.bxkj.student.life.info.InfoListActivity.j0(r0)
                r1 = 1
                if (r0 != r1) goto L2d
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.info.InfoListActivity.g0(r0)
                r0.clear()
            L2d:
                java.lang.String r0 = "inforList"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.info.InfoListActivity.g0(r0)
                r0.addAll(r3)
                com.bxkj.student.life.info.InfoListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.student.life.info.InfoListActivity.i0(r3)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.info.InfoListActivity.g0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.info.InfoListActivity a;

        d(com.bxkj.student.life.info.InfoListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.info.InfoListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.info.InfoListActivity.l0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.info.InfoListActivity.p0(r0, r1)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                int r0 = com.bxkj.student.life.info.InfoListActivity.j0(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.info.InfoListActivity.g0(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.info.InfoListActivity.g0(r0)
                r0.addAll(r3)
                com.bxkj.student.life.info.InfoListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.student.life.info.InfoListActivity.i0(r3)
                com.bxkj.student.life.info.InfoListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.info.InfoListActivity.g0(r0)
                r3.g(r0)
                return
        }
    }

    public InfoListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            r0 = 10
            r1.f991k0 = r0
            r0 = 1
            r1.f992p0 = r0
            r0 = 0
            r1.F0 = r0
            r1.I0 = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.List g0(com.bxkj.student.life.info.InfoListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ boolean h0(com.bxkj.student.life.info.InfoListActivity r0) {
            boolean r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter i0(com.bxkj.student.life.info.InfoListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.life.info.InfoListActivity r0) {
            int r0 = r0.f992p0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.student.life.info.InfoListActivity r0) {
            int r0 = r0.f991k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.life.info.InfoListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.life.info.InfoListActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.info.InfoListActivity r0, boolean r1) {
            r0.I0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.life.info.InfoListActivity r0, int r1) {
            r0.f992p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.info.InfoListActivity r0, int r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.info.InfoListActivity r0, java.util.List r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.life.info.InfoListActivity r0) {
            r0.u0()
            return
    }

    static /* bridge */ /* synthetic */ void s0(com.bxkj.student.life.info.InfoListActivity r0) {
            r0.v0()
            return
    }

    static /* bridge */ /* synthetic */ void t0(com.bxkj.student.life.info.InfoListActivity r0) {
            r0.x0()
            return
    }

    private void u0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.c> r1 = w.c.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.c r1 = (w.c) r1
            int r2 = r6.f991k0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.f992p0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r6.G0
            com.google.android.material.tabs.TabLayout r5 = r6.b0
            int r5 = r5.getSelectedTabPosition()
            java.lang.Object r4 = r4.get(r5)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = "id"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
            rx.e r1 = r1.a(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.info.InfoListActivity$d r1 = new com.bxkj.student.life.info.InfoListActivity$d
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void v0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.c> r1 = w.c.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.c r1 = (w.c) r1
            int r2 = r4.f991k0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.f992p0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            rx.e r1 = r1.d(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.info.InfoListActivity$c r1 = new com.bxkj.student.life.info.InfoListActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void w0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.life.info.InfoListActivity$a r1 = new com.bxkj.student.life.info.InfoListActivity$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private void x0() {
            r5 = this;
            com.google.android.material.tabs.TabLayout r0 = r5.b0
            r0.removeAllTabs()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r5.G0
            if (r0 != 0) goto La
            goto L2e
        La:
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            com.google.android.material.tabs.TabLayout r2 = r5.b0
            com.google.android.material.tabs.TabLayout$Tab r3 = r2.newTab()
            java.lang.String r4 = "inforType"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
            com.google.android.material.tabs.TabLayout$Tab r1 = r3.setText(r1)
            r2.addTab(r1)
            goto Le
        L2e:
            return
    }

    public void L() {
            r2 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.b0
            com.bxkj.student.life.info.InfoListActivity$b r1 = new com.bxkj.student.life.info.InfoListActivity$b
            r1.<init>(r2)
            r0.addOnTabSelectedListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492951(0x7f0c0057, float:1.8609368E38)
            return r0
    }

    public void R() {
            r3 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r3.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.life.info.InfoAdapter r0 = new com.bxkj.student.life.info.InfoAdapter
            android.content.Context r1 = r3.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.c0
            r0.<init>(r1, r2)
            r3.H0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r3.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            android.widget.TextView r1 = r3.a0
            r0.setEmptyView(r1)
            r3.w0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            r0 = 2131951693(0x7f13004d, float:1.9539808E38)
            java.lang.String r0 = r1.getString(r0)
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

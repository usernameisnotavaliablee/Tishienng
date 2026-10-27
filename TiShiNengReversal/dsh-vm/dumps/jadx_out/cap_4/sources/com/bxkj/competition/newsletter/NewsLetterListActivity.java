package com.bxkj.competition.newsletter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NewsLetterListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private java.lang.String H0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.Button b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f646k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f647p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.competition.newsletter.NewsLetterListActivity a;

        a(com.bxkj.competition.newsletter.NewsLetterListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r3.a
                int r4 = com.bxkj.competition.newsletter.NewsLetterListActivity.g0(r4)
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r3.a
                int r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.i0(r0)
                int r4 = r4 / r0
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r3.a
                int r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.j0(r0)
                com.bxkj.competition.newsletter.NewsLetterListActivity r1 = r3.a
                int r1 = com.bxkj.competition.newsletter.NewsLetterListActivity.g0(r1)
                com.bxkj.competition.newsletter.NewsLetterListActivity r2 = r3.a
                int r2 = com.bxkj.competition.newsletter.NewsLetterListActivity.i0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.competition.newsletter.NewsLetterListActivity.m0(r4)
                r4.q0()
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r3.a
                com.bxkj.competition.newsletter.NewsLetterListActivity.l0(r4)
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r3.a
                com.bxkj.competition.newsletter.NewsLetterListActivity.n0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.competition.newsletter.NewsLetterListActivity r2 = r1.a
                r0 = 1
                com.bxkj.competition.newsletter.NewsLetterListActivity.k0(r2, r0)
                com.bxkj.competition.newsletter.NewsLetterListActivity r2 = r1.a
                com.bxkj.competition.newsletter.NewsLetterListActivity.n0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.newsletter.NewsLetterListActivity k;

        b(com.bxkj.competition.newsletter.NewsLetterListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                int r0 = com.bxkj.competition.R.id.tv_name
                java.lang.String r1 = "content"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_status
                java.lang.String r1 = "auditState"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_time
                java.lang.String r1 = "publishDate"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.newsletter.NewsLetterListActivity a;

        c(com.bxkj.competition.newsletter.NewsLetterListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.m0(r0)
                r0.w0()
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.m0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.competition.newsletter.NewsLetterListActivity.h0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r2.a
                int r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.j0(r0)
                r1 = 1
                if (r0 != r1) goto L22
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r2.a
                com.bxkj.competition.newsletter.NewsLetterListActivity.p0(r0, r3)
                goto L2b
            L22:
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.o0(r0)
                r0.addAll(r3)
            L2b:
                com.bxkj.competition.newsletter.NewsLetterListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.newsletter.NewsLetterListActivity.q0(r3)
                com.bxkj.competition.newsletter.NewsLetterListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.o0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.competition.newsletter.NewsLetterListActivity a;

        d(com.bxkj.competition.newsletter.NewsLetterListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.competition.newsletter.NewsLetterListActivity r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.competition.newsletter.NewsLetterListActivity.r0(r4)
                java.lang.Class<com.bxkj.competition.newsletter.PostActivity> r0 = com.bxkj.competition.newsletter.PostActivity.class
                r3.<init>(r4, r0)
                com.bxkj.competition.newsletter.NewsLetterListActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.competition.newsletter.NewsLetterListActivity.q0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "content"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    public NewsLetterListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            r0 = 1
            r1.f646k0 = r0
            r1.f647p0 = r0
            r0 = 10
            r1.F0 = r0
            return
    }

    static /* synthetic */ int g0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            int r0 = r0.f646k0
            return r0
    }

    static /* synthetic */ int h0(com.bxkj.competition.newsletter.NewsLetterListActivity r0, int r1) {
            r0.f646k0 = r1
            return r1
    }

    static /* synthetic */ int i0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* synthetic */ int j0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            int r0 = r0.f647p0
            return r0
    }

    static /* synthetic */ int k0(com.bxkj.competition.newsletter.NewsLetterListActivity r0, int r1) {
            r0.f647p0 = r1
            return r1
    }

    static /* synthetic */ int l0(com.bxkj.competition.newsletter.NewsLetterListActivity r2) {
            int r0 = r2.f647p0
            int r1 = r0 + 1
            r2.f647p0 = r1
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout m0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ void n0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            r0.s0()
            return
    }

    static /* synthetic */ java.util.List o0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* synthetic */ java.util.List p0(com.bxkj.competition.newsletter.NewsLetterListActivity r0, java.util.List r1) {
            r0.c0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter q0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.competition.newsletter.NewsLetterListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void s0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r6.H0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            int r4 = r6.f647p0
            int r5 = r6.F0
            rx.e r1 = r1.q(r2, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.newsletter.NewsLetterListActivity$c r1 = new com.bxkj.competition.newsletter.NewsLetterListActivity$c
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void t0() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            int r1 = com.bxkj.competition.R.anim.zoom_in
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r4, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.competition.newsletter.NewsLetterListActivity$b r0 = new com.bxkj.competition.newsletter.NewsLetterListActivity$b
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.layout.item_for_newsletter
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.G0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            int r1 = com.bxkj.competition.R.id.tv_emptyView
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            return
    }

    private void u0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.competition.newsletter.NewsLetterListActivity$a r1 = new com.bxkj.competition.newsletter.NewsLetterListActivity$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.G0
            com.bxkj.competition.newsletter.NewsLetterListActivity$d r1 = new com.bxkj.competition.newsletter.NewsLetterListActivity$d
            r1.<init>(r2)
            r0.k(r1)
            android.widget.Button r0 = r2.b0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_my_newsletter_list
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.H0 = r0
        L16:
            r2.u0()
            r2.t0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的通讯稿"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.refresh
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            int r1 = com.bxkj.competition.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            int r1 = com.bxkj.competition.R.id.tv_emptyView
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            int r1 = com.bxkj.competition.R.id.bt_post
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            int r0 = com.bxkj.competition.R.id.bt_post
            if (r3 != r0) goto L1c
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.competition.newsletter.PostActivity> r1 = com.bxkj.competition.newsletter.PostActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "competitionId"
            java.lang.String r1 = r2.H0
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
        L1c:
            return
    }

    public void v0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.Y
            r0.D()
            return
    }
}

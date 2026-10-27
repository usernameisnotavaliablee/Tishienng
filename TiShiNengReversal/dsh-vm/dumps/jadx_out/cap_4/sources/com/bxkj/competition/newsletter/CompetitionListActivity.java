package com.bxkj.competition.newsletter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CompetitionListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private int b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f644k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f645p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.competition.newsletter.CompetitionListActivity a;

        a(com.bxkj.competition.newsletter.CompetitionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r3.a
                int r4 = com.bxkj.competition.newsletter.CompetitionListActivity.g0(r4)
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r3.a
                int r0 = com.bxkj.competition.newsletter.CompetitionListActivity.i0(r0)
                int r4 = r4 / r0
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r3.a
                int r0 = com.bxkj.competition.newsletter.CompetitionListActivity.j0(r0)
                com.bxkj.competition.newsletter.CompetitionListActivity r1 = r3.a
                int r1 = com.bxkj.competition.newsletter.CompetitionListActivity.g0(r1)
                com.bxkj.competition.newsletter.CompetitionListActivity r2 = r3.a
                int r2 = com.bxkj.competition.newsletter.CompetitionListActivity.i0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.competition.newsletter.CompetitionListActivity.m0(r4)
                r4.q0()
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r3.a
                com.bxkj.competition.newsletter.CompetitionListActivity.l0(r4)
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r3.a
                com.bxkj.competition.newsletter.CompetitionListActivity.n0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.competition.newsletter.CompetitionListActivity r2 = r1.a
                r0 = 1
                com.bxkj.competition.newsletter.CompetitionListActivity.k0(r2, r0)
                com.bxkj.competition.newsletter.CompetitionListActivity r2 = r1.a
                com.bxkj.competition.newsletter.CompetitionListActivity.n0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.newsletter.CompetitionListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ android.widget.ImageView a;
            final /* synthetic */ com.bxkj.competition.newsletter.CompetitionListActivity.b b;

            a(com.bxkj.competition.newsletter.CompetitionListActivity.b r1, android.widget.ImageView r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                    r1 = this;
                    android.widget.ImageView r0 = r1.a
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    r0.removeOnPreDrawListener(r1)
                    android.widget.ImageView r0 = r1.a
                    r0.getWidth()
                    android.widget.ImageView r0 = r1.a
                    r0.getHeight()
                    r0 = 1
                    return r0
            }
        }

        b(com.bxkj.competition.newsletter.CompetitionListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                int r0 = com.bxkj.competition.R.id.iv_image
                android.view.View r1 = r5.h(r0)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
                com.bxkj.competition.newsletter.CompetitionListActivity$b$a r3 = new com.bxkj.competition.newsletter.CompetitionListActivity$b$a
                r3.<init>(r4, r1)
                r2.addOnPreDrawListener(r3)
                java.lang.String r1 = "majorImg"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.s(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_name
                java.lang.String r1 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_location
                java.lang.String r1 = "address"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_time
                java.lang.String r1 = "startDate"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r5.J(r0, r1)
                int r0 = com.bxkj.competition.R.id.tv_day
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ""
                r1.append(r2)
                java.lang.String r2 = "diffCurrDay"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r5.J(r0, r1)
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                r6 = r6 ^ 1
                r5.N(r0, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.newsletter.CompetitionListActivity a;

        c(com.bxkj.competition.newsletter.CompetitionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.newsletter.CompetitionListActivity.m0(r0)
                r0.w0()
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.newsletter.CompetitionListActivity.m0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.competition.newsletter.CompetitionListActivity.h0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r2.a
                int r0 = com.bxkj.competition.newsletter.CompetitionListActivity.j0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r2.a
                com.bxkj.competition.newsletter.CompetitionListActivity.p0(r0, r3)
                goto L2f
            L26:
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.newsletter.CompetitionListActivity.o0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.competition.newsletter.CompetitionListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.competition.newsletter.CompetitionListActivity.q0(r3)
                com.bxkj.competition.newsletter.CompetitionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.newsletter.CompetitionListActivity.o0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.competition.newsletter.CompetitionListActivity a;

        d(com.bxkj.competition.newsletter.CompetitionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.competition.newsletter.CompetitionListActivity r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.competition.newsletter.CompetitionListActivity.r0(r4)
                java.lang.Class<com.bxkj.competition.newsletter.NewsLetterListActivity> r0 = com.bxkj.competition.newsletter.NewsLetterListActivity.class
                r3.<init>(r4, r0)
                com.bxkj.competition.newsletter.CompetitionListActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.competition.newsletter.CompetitionListActivity.q0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "competitionId"
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    public CompetitionListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 1
            r1.b0 = r0
            r1.c0 = r0
            r0 = 10
            r1.f644k0 = r0
            return
    }

    static /* synthetic */ int g0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            int r0 = r0.b0
            return r0
    }

    static /* synthetic */ int h0(com.bxkj.competition.newsletter.CompetitionListActivity r0, int r1) {
            r0.b0 = r1
            return r1
    }

    static /* synthetic */ int i0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            int r0 = r0.f644k0
            return r0
    }

    static /* synthetic */ int j0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* synthetic */ int k0(com.bxkj.competition.newsletter.CompetitionListActivity r0, int r1) {
            r0.c0 = r1
            return r1
    }

    static /* synthetic */ int l0(com.bxkj.competition.newsletter.CompetitionListActivity r2) {
            int r0 = r2.c0
            int r1 = r0 + 1
            r2.c0 = r1
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout m0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ void n0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            r0.s0()
            return
    }

    static /* synthetic */ java.util.List o0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* synthetic */ java.util.List p0(com.bxkj.competition.newsletter.CompetitionListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter q0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f645p0
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.competition.newsletter.CompetitionListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void s0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r5.F0
            int r3 = r5.c0
            int r4 = r5.f644k0
            rx.e r1 = r1.g(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.newsletter.CompetitionListActivity$c r1 = new com.bxkj.competition.newsletter.CompetitionListActivity$c
            r1.<init>(r5)
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
            com.bxkj.competition.newsletter.CompetitionListActivity$b r0 = new com.bxkj.competition.newsletter.CompetitionListActivity$b
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.competition.R.layout.item_for_competition_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.f645p0 = r0
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
            com.bxkj.competition.newsletter.CompetitionListActivity$a r1 = new com.bxkj.competition.newsletter.CompetitionListActivity$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f645p0
            com.bxkj.competition.newsletter.CompetitionListActivity$d r1 = new com.bxkj.competition.newsletter.CompetitionListActivity$d
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_pub_recycle
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
            r2.F0 = r0
        L16:
            r2.u0()
            r2.t0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "竞赛列表"
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
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

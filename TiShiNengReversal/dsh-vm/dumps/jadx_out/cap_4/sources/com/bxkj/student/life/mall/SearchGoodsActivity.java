package com.bxkj.student.life.mall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SearchGoodsActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private int G0;
    private java.lang.String H0;
    private androidx.appcompat.widget.SearchView Y;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Z;
    private androidx.recyclerview.widget.RecyclerView a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f1026k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f1027p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.student.life.mall.SearchGoodsActivity a;

        a(com.bxkj.student.life.mall.SearchGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                androidx.appcompat.widget.SearchView r0 = com.bxkj.student.life.mall.SearchGoodsActivity.l0(r0)
                r0.clearFocus()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.SearchGoodsActivity k;

        b(com.bxkj.student.life.mall.SearchGoodsActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r3 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r4.J(r1, r0)
                java.lang.String r0 = "showImg"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r1 = 2131689689(0x7f0f00d9, float:1.90084E38)
                r2 = 2131297182(0x7f09039e, float:1.8212302E38)
                r4.t(r2, r0, r1, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "￥"
                r0.append(r1)
                java.lang.String r1 = "showPrize"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getMoney(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "库存："
                r0.append(r1)
                java.lang.String r1 = "stock"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299132(0x7f090b3c, float:1.8216257E38)
                r4.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "销量："
                r0.append(r1)
                java.lang.String r1 = "saleNum"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r0 = 2131298997(0x7f090ab5, float:1.8215983E38)
                r4.J(r0, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
        final /* synthetic */ com.bxkj.student.life.mall.SearchGoodsActivity a;

        c(com.bxkj.student.life.mall.SearchGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean onQueryTextChange(java.lang.String r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onQueryTextSubmit(java.lang.String r2) {
                r1 = this;
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.bxkj.student.life.mall.SearchGoodsActivity.n0(r0, r2)
                com.bxkj.student.life.mall.SearchGoodsActivity r2 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r2)
                r2.D()
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.SearchGoodsActivity a;

        d(com.bxkj.student.life.mall.SearchGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.life.mall.SearchGoodsActivity r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.student.life.mall.SearchGoodsActivity.r0(r4)
                java.lang.Class<com.bxkj.student.life.mall.GoodsDetailActivity> r0 = com.bxkj.student.life.mall.GoodsDetailActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.life.mall.SearchGoodsActivity.g0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "goodsId"
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements m2.e {
        final /* synthetic */ com.bxkj.student.life.mall.SearchGoodsActivity a;

        e(com.bxkj.student.life.mall.SearchGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r3.a
                int r4 = com.bxkj.student.life.mall.SearchGoodsActivity.m0(r4)
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r3.a
                int r0 = com.bxkj.student.life.mall.SearchGoodsActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r3.a
                int r0 = com.bxkj.student.life.mall.SearchGoodsActivity.i0(r0)
                com.bxkj.student.life.mall.SearchGoodsActivity r1 = r3.a
                int r1 = com.bxkj.student.life.mall.SearchGoodsActivity.m0(r1)
                com.bxkj.student.life.mall.SearchGoodsActivity r2 = r3.a
                int r2 = com.bxkj.student.life.mall.SearchGoodsActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r4)
                r4.q0()
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r3.a
                int r0 = com.bxkj.student.life.mall.SearchGoodsActivity.i0(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.mall.SearchGoodsActivity.o0(r4, r0)
                com.bxkj.student.life.mall.SearchGoodsActivity r4 = r3.a
                com.bxkj.student.life.mall.SearchGoodsActivity.q0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.mall.SearchGoodsActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.life.mall.SearchGoodsActivity.o0(r2, r0)
                com.bxkj.student.life.mall.SearchGoodsActivity r2 = r1.a
                com.bxkj.student.life.mall.SearchGoodsActivity.q0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.SearchGoodsActivity a;

        f(com.bxkj.student.life.mall.SearchGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.SearchGoodsActivity.k0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.mall.SearchGoodsActivity.p0(r0, r1)
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r2.a
                int r0 = com.bxkj.student.life.mall.SearchGoodsActivity.i0(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.SearchGoodsActivity.h0(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.mall.SearchGoodsActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.SearchGoodsActivity.h0(r0)
                r0.addAll(r3)
                com.bxkj.student.life.mall.SearchGoodsActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.SearchGoodsActivity.g0(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public SearchGoodsActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            r0 = 1
            r1.f1027p0 = r0
            r0 = 15
            r1.F0 = r0
            r0 = 0
            r1.G0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            int r0 = r0.f1027p0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout k0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.appcompat.widget.SearchView l0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            androidx.appcompat.widget.SearchView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.mall.SearchGoodsActivity r0, java.lang.String r1) {
            r0.H0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.life.mall.SearchGoodsActivity r0, int r1) {
            r0.f1027p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.mall.SearchGoodsActivity r0, int r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            r0.s0()
            return
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.life.mall.SearchGoodsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void s0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r6.f1026k0
            java.lang.String r3 = r6.H0
            int r4 = r6.f1027p0
            int r5 = r6.F0
            rx.e r1 = r1.j(r2, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.SearchGoodsActivity$f r1 = new com.bxkj.student.life.mall.SearchGoodsActivity$f
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void t0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Z
            com.bxkj.student.life.mall.SearchGoodsActivity$e r1 = new com.bxkj.student.life.mall.SearchGoodsActivity$e
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void L() {
            r2 = this;
            androidx.appcompat.widget.SearchView r0 = r2.Y
            com.bxkj.student.life.mall.SearchGoodsActivity$c r1 = new com.bxkj.student.life.mall.SearchGoodsActivity$c
            r1.<init>(r2)
            r0.setOnQueryTextListener(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.b0
            com.bxkj.student.life.mall.SearchGoodsActivity$d r1 = new com.bxkj.student.life.mall.SearchGoodsActivity$d
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493023(0x7f0c009f, float:1.8609514E38)
            return r0
    }

    public void R() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.a0
            r1.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.V
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            com.bxkj.student.life.mall.SearchGoodsActivity$b r0 = new com.bxkj.student.life.mall.SearchGoodsActivity$b
            android.content.Context r1 = r4.V
            r2 = 2131493257(0x7f0c0189, float:1.860999E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.a0
            r1.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Z
            r0.D()
            r4.t0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "全部商品"
            r2.setTitle(r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "typeName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.setTitle(r0)
        L1c:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "typeId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L32
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f1026k0 = r0
        L32:
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Z = r2
            r2 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.a0 = r2
            r2 = 2131298492(0x7f0908bc, float:1.8214959E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.appcompat.widget.SearchView r2 = (androidx.appcompat.widget.SearchView) r2
            r1.Y = r2
            com.bxkj.student.life.mall.SearchGoodsActivity$a r0 = new com.bxkj.student.life.mall.SearchGoodsActivity$a
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

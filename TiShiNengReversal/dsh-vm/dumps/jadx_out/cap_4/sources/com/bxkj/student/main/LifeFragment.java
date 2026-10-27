package com.bxkj.student.main;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LifeFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout j;
    private androidx.recyclerview.widget.RecyclerView k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f1088l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.RadioGroup f1089m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.ViewFlipper f1090n;

    /* renamed from: o, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1091o;

    /* renamed from: p, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter f1092p;

    /* renamed from: q, reason: collision with root package name */
    private int f1093q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.recyclerview.widget.GridLayoutManager f1094r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.main.LifeFragment k;

        a(com.bxkj.student.main.LifeFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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
                r0 = 2131298068(0x7f090714, float:1.8214099E38)
                android.view.View r0 = r5.h(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                androidx.recyclerview.widget.GridLayoutManager$LayoutParams r1 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
                com.bxkj.student.main.LifeFragment r2 = r4.k
                int r2 = com.bxkj.student.main.LifeFragment.S(r2)
                int r2 = r2 / 5
                r3 = -2
                r1.<init>(r2, r3)
                r0.setLayoutParams(r1)
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r5.J(r1, r0)
                java.lang.String r0 = "icon"
                int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                r0 = 2131297155(0x7f090383, float:1.8212247E38)
                r5.r(r0, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.bxkj.student.main.LifeFragment f1095t;

        b(com.bxkj.student.main.LifeFragment r1) {
                r0 = this;
                r0.f1095t = r1
                r0.<init>()
                return
        }

        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r2, int r3) {
                r1 = this;
                super.onScrollStateChanged(r2, r3)
                if (r3 != 0) goto L28
                com.bxkj.student.main.LifeFragment r2 = r1.f1095t
                androidx.recyclerview.widget.GridLayoutManager r2 = com.bxkj.student.main.LifeFragment.O(r2)
                int r2 = r2.findFirstCompletelyVisibleItemPosition()
                int r2 = r2 / 8
                com.bxkj.student.main.LifeFragment r3 = r1.f1095t
                android.widget.RadioGroup r3 = com.bxkj.student.main.LifeFragment.P(r3)
                com.bxkj.student.main.LifeFragment r0 = r1.f1095t
                android.widget.RadioGroup r0 = com.bxkj.student.main.LifeFragment.P(r0)
                android.view.View r2 = r0.getChildAt(r2)
                int r2 = r2.getId()
                r3.check(r2)
            L28:
                return
        }

        public void onScrolled(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                super.onScrolled(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.main.LifeFragment a;

        c(com.bxkj.student.main.LifeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.main.LifeFragment r2 = r1.a
                java.util.List r2 = com.bxkj.student.main.LifeFragment.N(r2)
                java.lang.Object r2 = r2.get(r5)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "name"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                java.lang.String r3 = "二手"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L2d
                com.bxkj.student.main.LifeFragment r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.main.LifeFragment r4 = r1.a
                android.content.Context r4 = com.bxkj.student.main.LifeFragment.U(r4)
                java.lang.Class<com.bxkj.student.life.secondhand.SecondHandHomeActivity> r5 = com.bxkj.student.life.secondhand.SecondHandHomeActivity.class
                r3.<init>(r4, r5)
                r2.startActivity(r3)
                return
            L2d:
                java.lang.String r3 = "失物寻物"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L48
                com.bxkj.student.main.LifeFragment r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.main.LifeFragment r4 = r1.a
                android.content.Context r4 = com.bxkj.student.main.LifeFragment.V(r4)
                java.lang.Class<com.bxkj.student.life.lost.LostHomeActivity> r5 = com.bxkj.student.life.lost.LostHomeActivity.class
                r3.<init>(r4, r5)
                r2.startActivity(r3)
                return
            L48:
                java.lang.String r3 = "商城"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L63
                com.bxkj.student.main.LifeFragment r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.main.LifeFragment r4 = r1.a
                android.content.Context r4 = com.bxkj.student.main.LifeFragment.W(r4)
                java.lang.Class<com.bxkj.student.life.mall.MallHomeActivity> r5 = com.bxkj.student.life.mall.MallHomeActivity.class
                r3.<init>(r4, r5)
                r2.startActivity(r3)
                return
            L63:
                java.lang.String r3 = "信用卡"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L8b
                com.bxkj.student.main.LifeFragment r2 = r1.a
                android.content.Intent r4 = new android.content.Intent
                com.bxkj.student.main.LifeFragment r5 = r1.a
                android.content.Context r5 = com.bxkj.student.main.LifeFragment.X(r5)
                java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r0 = com.bxkj.base.webview.H5DetailActivity.class
                r4.<init>(r5, r0)
                java.lang.String r5 = "title"
                android.content.Intent r3 = r4.putExtra(r5, r3)
                java.lang.String r4 = "url"
                java.lang.String r5 = "https://creditcard.cmbc.com.cn/wsv2/?enstr=mSlA1zunTrPHh1CNz0K26zHw9V4feo2mlV1iATEE7Om%2fRx%2bHsklTDhmmcRO8Spw%2fVNOSkibHiNRP4zHyQCMkYWagHJgFtpZReRk3CXCdInmujzIcAVgLR2YbcigxNezwK98LyuBxEd6v9lR6pXeUYFmHqWtkAkYnClJ3qMsNz%2fg1rumE1ZWWqvLhQvudXiusJphdDwavqBkDd5zkNBX5NjwSNUdkp39ETXOSUvw1%2fFkFhSi%2f5NEuBauZCSWLx2eblhb4dhkfmk3gCyxuIGmKBl4FMYVUPtz10QxgfcJSfODLI0nyOvZwP8C81spE1BHd1u%2bxf7QdhQawfkIzwOUs9Q%3d%3d"
                android.content.Intent r3 = r3.putExtra(r4, r5)
                r2.startActivity(r3)
            L8b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements m2.d {
        final /* synthetic */ com.bxkj.student.main.LifeFragment a;

        d(com.bxkj.student.main.LifeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void n(l2.h r1) {
                r0 = this;
                com.bxkj.student.main.LifeFragment r1 = r0.a
                com.bxkj.student.main.LifeFragment.T(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.main.LifeFragment a;

        e(com.bxkj.student.main.LifeFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.main.LifeFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.LifeFragment.R(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.main.LifeFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.LifeFragment.R(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.main.LifeFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.main.LifeFragment.R(r0)
                r0.w0()
            L20:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "data"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
                com.bxkj.student.main.LifeFragment r0 = r3.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.student.main.LifeFragment.Q(r0)
                androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
                com.bxkj.student.main.LifeFragment r2 = r3.a
                android.content.Context r2 = com.bxkj.student.main.LifeFragment.Y(r2)
                r1.<init>(r2)
                r0.setLayoutManager(r1)
                com.bxkj.student.main.LifeFragment r0 = r3.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.student.main.LifeFragment.Q(r0)
                com.bxkj.student.life.info.InfoAdapter r1 = new com.bxkj.student.life.info.InfoAdapter
                com.bxkj.student.main.LifeFragment r2 = r3.a
                android.content.Context r2 = com.bxkj.student.main.LifeFragment.Z(r2)
                r1.<init>(r2, r4)
                r0.setAdapter(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.main.LifeFragment k;

        f(com.bxkj.student.main.LifeFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
                r0 = this;
                return
        }
    }

    public LifeFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1091o = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.List N(com.bxkj.student.main.LifeFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1091o
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.GridLayoutManager O(com.bxkj.student.main.LifeFragment r0) {
            androidx.recyclerview.widget.GridLayoutManager r0 = r0.f1094r
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup P(com.bxkj.student.main.LifeFragment r0) {
            android.widget.RadioGroup r0 = r0.f1089m
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView Q(com.bxkj.student.main.LifeFragment r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1088l
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout R(com.bxkj.student.main.LifeFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.main.LifeFragment r0) {
            int r0 = r0.f1093q
            return r0
    }

    static /* bridge */ /* synthetic */ void T(com.bxkj.student.main.LifeFragment r0) {
            r0.a0()
            return
    }

    static /* synthetic */ android.content.Context U(com.bxkj.student.main.LifeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context V(com.bxkj.student.main.LifeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context W(com.bxkj.student.main.LifeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.main.LifeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Y(com.bxkj.student.main.LifeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Z(com.bxkj.student.main.LifeFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void a0() {
            r4 = this;
            android.content.Context r0 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.c> r1 = w.c.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.c r1 = (w.c) r1
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            rx.e r1 = r1.b(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.main.LifeFragment$e r1 = new com.bxkj.student.main.LifeFragment$e
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void b0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.j
            r1 = 0
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.j
            com.bxkj.student.main.LifeFragment$d r1 = new com.bxkj.student.main.LifeFragment$d
            r1.<init>(r2)
            r0.l1(r1)
            return
    }

    private void c0() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1088l
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r4.g
            r3 = 2
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            com.bxkj.student.main.LifeFragment$f r0 = new com.bxkj.student.main.LifeFragment$f
            android.content.Context r1 = r4.g
            r2 = 2131493254(0x7f0c0186, float:1.8609983E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1091o
            r0.<init>(r4, r1, r2, r3)
            androidx.recyclerview.widget.RecyclerView r1 = r4.f1088l
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1088l
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.g
            r3 = 0
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1088l
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.g
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            return
    }

    private void d0() {
            r4 = this;
            r0 = 0
        L1:
            r1 = 5
            if (r0 >= r1) goto L16
            android.content.Context r1 = r4.g
            r2 = 2131493275(0x7f0c019b, float:1.8610026E38)
            r3 = 0
            android.view.View r1 = android.view.View.inflate(r1, r2, r3)
            android.widget.ViewFlipper r2 = r4.f1090n
            r2.addView(r1)
            int r0 = r0 + 1
            goto L1
        L16:
            return
    }

    private void e0() {
            r7 = this;
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "资讯"
            java.lang.String r2 = "name"
            r0.put(r2, r1)
            r1 = 2131689774(0x7f0f012e, float:1.9008573E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "icon"
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "商城"
            r0.put(r2, r1)
            r1 = 2131689786(0x7f0f013a, float:1.9008597E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "二手"
            r0.put(r2, r1)
            r1 = 2131689799(0x7f0f0147, float:1.9008624E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "跑腿"
            r0.put(r2, r1)
            r1 = 2131689815(0x7f0f0157, float:1.9008656E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "失物寻物"
            r0.put(r2, r1)
            r1 = 2131689740(0x7f0f010c, float:1.9008504E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "招聘求职"
            r0.put(r2, r1)
            r1 = 2131689775(0x7f0f012f, float:1.9008575E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "捐赠寄卖"
            r0.put(r2, r1)
            r1 = 2131689733(0x7f0f0105, float:1.900849E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "直播"
            r0.put(r2, r1)
            r1 = 2131689777(0x7f0f0131, float:1.9008579E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "信用卡"
            r0.put(r2, r1)
            r1 = 2131689811(0x7f0f0153, float:1.9008648E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.String r1 = "圈子"
            r0.put(r2, r1)
            r1 = 2131689743(0x7f0f010f, float:1.900851E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.f1091o
            r1.add(r0)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r1 = r7.g
            r2 = 2
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            r7.f1094r = r0
            androidx.recyclerview.widget.RecyclerView r1 = r7.k
            r1.setLayoutManager(r0)
            com.bxkj.student.main.LifeFragment$a r0 = new com.bxkj.student.main.LifeFragment$a
            android.content.Context r1 = r7.g
            r2 = 2131493276(0x7f0c019c, float:1.8610028E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r7.f1091o
            r0.<init>(r7, r1, r2, r4)
            r7.f1092p = r0
            androidx.recyclerview.widget.RecyclerView r1 = r7.k
            r1.setAdapter(r0)
            r0 = 0
        L122:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = r7.f1092p
            int r1 = r1.getItemCount()
            int r1 = r1 / 10
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = r7.f1092p
            int r2 = r2.getItemCount()
            int r2 = r2 % 10
            if (r2 != 0) goto L136
            r2 = 0
            goto L137
        L136:
            r2 = 1
        L137:
            int r1 = r1 + r2
            if (r0 >= r1) goto L176
            android.widget.RadioButton r1 = new android.widget.RadioButton
            android.content.Context r2 = r7.g
            r1.<init>(r2)
            r2 = 2131231622(0x7f080386, float:1.807933E38)
            r1.setButtonDrawable(r2)
            r1.setClickable(r3)
            r1.setFocusable(r3)
            r1.setFocusableInTouchMode(r3)
            android.widget.RadioGroup$LayoutParams r2 = new android.widget.RadioGroup$LayoutParams
            android.content.Context r4 = r7.g
            r5 = 1084227584(0x40a00000, float:5.0)
            int r4 = cn.bluemobi.dylan.base.utils.u.a(r5, r4)
            android.content.Context r6 = r7.g
            int r6 = cn.bluemobi.dylan.base.utils.u.a(r5, r6)
            r2.<init>(r4, r6)
            android.content.Context r4 = r7.g
            int r4 = cn.bluemobi.dylan.base.utils.u.a(r5, r4)
            r2.rightMargin = r4
            r1.setLayoutParams(r2)
            android.widget.RadioGroup r2 = r7.f1089m
            r2.addView(r1)
            int r0 = r0 + 1
            goto L122
        L176:
            android.widget.RadioGroup r0 = r7.f1089m
            android.view.View r1 = r0.getChildAt(r3)
            int r1 = r1.getId()
            r0.check(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r7.k
            com.bxkj.student.main.LifeFragment$b r1 = new com.bxkj.student.main.LifeFragment$b
            r1.<init>(r7)
            r0.addOnScrollListener(r1)
            return
    }

    public void b() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = r2.f1092p
            com.bxkj.student.main.LifeFragment$c r1 = new com.bxkj.student.main.LifeFragment$c
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected void e() {
            r1 = this;
            r1.e0()
            r1.d0()
            r1.b0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.j
            r0.D()
            return
    }

    protected void f(android.view.View r2) {
            r1 = this;
            r2 = 2131298537(0x7f0908e9, float:1.821505E38)
            android.view.View r2 = r1.c(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.j = r2
            r2 = 2131298431(0x7f09087f, float:1.8214835E38)
            android.view.View r2 = r1.c(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.k = r2
            r2 = 2131298364(0x7f09083c, float:1.82147E38)
            android.view.View r2 = r1.c(r2)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            r1.f1089m = r2
            r2 = 2131299252(0x7f090bb4, float:1.82165E38)
            android.view.View r2 = r1.c(r2)
            android.widget.ViewFlipper r2 = (android.widget.ViewFlipper) r2
            r1.f1090n = r2
            r2 = 2131298424(0x7f090878, float:1.821482E38)
            android.view.View r2 = r1.c(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.f1088l = r2
            android.content.Context r2 = r1.g
            int[] r2 = cn.bluemobi.dylan.base.utils.u.K(r2)
            r0 = 0
            r2 = r2[r0]
            r1.f1093q = r2
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493192(0x7f0c0148, float:1.8609857E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

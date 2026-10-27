package com.bxkj.student.life.mall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class GoodsListFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private androidx.recyclerview.widget.RecyclerView j;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout k;

    /* renamed from: l, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView f1013l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f1014m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f1015n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.FrameLayout f1016o;

    /* renamed from: p, reason: collision with root package name */
    private android.widget.TextView f1017p;

    /* renamed from: q, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1018q;

    /* renamed from: r, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1019r;

    /* renamed from: s, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1020s;

    /* renamed from: t, reason: collision with root package name */
    private int f1021t;

    /* renamed from: u, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1022u;

    /* renamed from: v, reason: collision with root package name */
    private int f1023v;

    /* renamed from: w, reason: collision with root package name */
    private int f1024w;

    /* renamed from: x, reason: collision with root package name */
    private int f1025x;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        a(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r0)
                if (r3 <= 0) goto L13
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.GoodsListFragment.S(r0)
                r1 = 0
                r0.setVisibility(r1)
                goto L1e
            L13:
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.GoodsListFragment.S(r0)
                r1 = 8
                r0.setVisibility(r1)
            L1e:
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.GoodsListFragment.S(r0)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.setText(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment k;

        b(com.bxkj.student.life.mall.GoodsListFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                int r3 = r2.f()
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.k
                int r0 = com.bxkj.student.life.mall.GoodsListFragment.N(r0)
                if (r3 != r0) goto L26
                com.bxkj.student.life.mall.GoodsListFragment r3 = r1.k
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131231950(0x7f0804ce, float:1.8079995E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r0)
                goto L27
            L26:
                r3 = 0
            L27:
                r0 = 2131297091(0x7f090343, float:1.8212117E38)
                r2.q(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
            final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment.c e;

            a(com.bxkj.student.life.mall.GoodsListFragment.c r1, android.content.Context r2, int r3, java.util.List r4) {
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
                    java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getMoney(r5, r1)
                    r0.append(r5)
                    java.lang.String r5 = r0.toString()
                    r0 = 2131299047(0x7f090ae7, float:1.8216084E38)
                    r4.J(r0, r5)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.widget.AdapterView.OnItemClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a a;
            final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment.c b;

            b(com.bxkj.student.life.mall.GoodsListFragment.c r1, cn.bluemobi.dylan.base.adapter.common.abslistview.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                    r0 = this;
                    com.bxkj.student.life.mall.GoodsListFragment$c r1 = r0.b
                    com.bxkj.student.life.mall.GoodsListFragment r1 = r1.k
                    android.content.Intent r2 = new android.content.Intent
                    com.bxkj.student.life.mall.GoodsListFragment$c r4 = r0.b
                    android.content.Context r4 = com.bxkj.student.life.mall.GoodsListFragment.c.m(r4)
                    java.lang.Class<com.bxkj.student.life.mall.GoodsDetailActivity> r5 = com.bxkj.student.life.mall.GoodsDetailActivity.class
                    r2.<init>(r4, r5)
                    cn.bluemobi.dylan.base.adapter.common.abslistview.a r4 = r0.a
                    java.lang.Object r3 = r4.getItem(r3)
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r4 = "id"
                    java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
                    java.lang.String r4 = "goodsId"
                    android.content.Intent r2 = r2.putExtra(r4, r3)
                    r1.startActivity(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.GoodsListFragment$c$c, reason: collision with other inner class name */
        class ViewOnClickListenerC0112c implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment.c b;

            ViewOnClickListenerC0112c(com.bxkj.student.life.mall.GoodsListFragment.c r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.life.mall.GoodsListFragment$c r4 = r3.b
                    com.bxkj.student.life.mall.GoodsListFragment r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.life.mall.GoodsListFragment$c r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.life.mall.GoodsListFragment.c.n(r1)
                    java.lang.Class<com.bxkj.student.life.mall.SearchGoodsActivity> r2 = com.bxkj.student.life.mall.SearchGoodsActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.lang.String r2 = "typeId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "typeName"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r4.startActivity(r0)
                    return
            }
        }

        c(com.bxkj.student.life.mall.GoodsListFragment r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.life.mall.GoodsListFragment.c r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.life.mall.GoodsListFragment.c r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                java.lang.String r0 = "typeName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131298838(0x7f090a16, float:1.821566E38)
                r6.J(r1, r0)
                java.lang.String r0 = "goods"
                java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r0)
                r1 = 2131297029(0x7f090305, float:1.8211991E38)
                android.view.View r1 = r6.h(r1)
                android.widget.GridView r1 = (android.widget.GridView) r1
                com.bxkj.student.life.mall.GoodsListFragment$c$a r2 = new com.bxkj.student.life.mall.GoodsListFragment$c$a
                android.content.Context r3 = r5.e
                r4 = 2131493281(0x7f0c01a1, float:1.8610038E38)
                r2.<init>(r5, r3, r4, r0)
                r1.setAdapter(r2)
                com.bxkj.student.life.mall.GoodsListFragment$c$b r0 = new com.bxkj.student.life.mall.GoodsListFragment$c$b
                r0.<init>(r5, r2)
                r1.setOnItemClickListener(r0)
                com.bxkj.student.life.mall.GoodsListFragment$c$c r0 = new com.bxkj.student.life.mall.GoodsListFragment$c$c
                r0.<init>(r5, r7)
                r7 = 2131298023(0x7f0906e7, float:1.8214007E38)
                r6.w(r7, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements m2.e {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        d(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.mall.GoodsListFragment r4 = r3.a
                int r4 = com.bxkj.student.life.mall.GoodsListFragment.R(r4)
                com.bxkj.student.life.mall.GoodsListFragment r0 = r3.a
                int r0 = com.bxkj.student.life.mall.GoodsListFragment.P(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.mall.GoodsListFragment r0 = r3.a
                int r0 = com.bxkj.student.life.mall.GoodsListFragment.O(r0)
                com.bxkj.student.life.mall.GoodsListFragment r1 = r3.a
                int r1 = com.bxkj.student.life.mall.GoodsListFragment.R(r1)
                com.bxkj.student.life.mall.GoodsListFragment r2 = r3.a
                int r2 = com.bxkj.student.life.mall.GoodsListFragment.P(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.mall.GoodsListFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.mall.GoodsListFragment.Q(r4)
                r4.q0()
                com.bxkj.student.life.mall.GoodsListFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.life.mall.GoodsListFragment r4 = r3.a
                int r0 = com.bxkj.student.life.mall.GoodsListFragment.O(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.mall.GoodsListFragment.Y(r4, r0)
                com.bxkj.student.life.mall.GoodsListFragment r4 = r3.a
                com.bxkj.student.life.mall.GoodsListFragment.a0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.mall.GoodsListFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.life.mall.GoodsListFragment.Y(r2, r0)
                com.bxkj.student.life.mall.GoodsListFragment r2 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.mall.GoodsListFragment.W(r2)
                int r2 = r2.getItemCount()
                if (r2 != 0) goto L18
                com.bxkj.student.life.mall.GoodsListFragment r2 = r1.a
                com.bxkj.student.life.mall.GoodsListFragment.b0(r2)
                return
            L18:
                com.bxkj.student.life.mall.GoodsListFragment r2 = r1.a
                com.bxkj.student.life.mall.GoodsListFragment.a0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        e(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.student.life.mall.GoodsListFragment r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.life.mall.GoodsListFragment.W(r1)
                com.bxkj.student.life.mall.GoodsListFragment r2 = r0.a
                int r2 = com.bxkj.student.life.mall.GoodsListFragment.N(r2)
                r1.notifyItemChanged(r2)
                com.bxkj.student.life.mall.GoodsListFragment r1 = r0.a
                com.bxkj.student.life.mall.GoodsListFragment.X(r1, r4)
                com.bxkj.student.life.mall.GoodsListFragment r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.life.mall.GoodsListFragment.W(r1)
                com.bxkj.student.life.mall.GoodsListFragment r2 = r0.a
                int r2 = com.bxkj.student.life.mall.GoodsListFragment.N(r2)
                r1.notifyItemChanged(r2)
                com.bxkj.student.life.mall.GoodsListFragment r1 = r0.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = com.bxkj.student.life.mall.GoodsListFragment.Q(r1)
                r1.D()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        f(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.bxkj.student.life.mall.GoodsListFragment r4 = r3.a
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.life.mall.GoodsListFragment r1 = r3.a
                android.content.Context r1 = com.bxkj.student.life.mall.GoodsListFragment.c0(r1)
                java.lang.Class<com.bxkj.student.life.mall.CartActivity> r2 = com.bxkj.student.life.mall.CartActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment.g a;

            a(com.bxkj.student.life.mall.GoodsListFragment.g r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r4 = this;
                    com.bxkj.student.life.mall.GoodsListFragment$g r0 = r4.a
                    com.bxkj.student.life.mall.GoodsListFragment r0 = r0.a
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.mall.GoodsListFragment$g r2 = r4.a
                    com.bxkj.student.life.mall.GoodsListFragment r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.life.mall.GoodsListFragment.d0(r2)
                    java.lang.Class<com.bxkj.student.life.mall.CartActivity> r3 = com.bxkj.student.life.mall.CartActivity.class
                    r1.<init>(r2, r3)
                    r0.startActivity(r1)
                    return
            }
        }

        g(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                android.content.Context r0 = com.bxkj.student.life.mall.GoodsListFragment.e0(r0)
                r3.<init>(r0)
                com.bxkj.student.life.mall.GoodsListFragment$g$a r0 = new com.bxkj.student.life.mall.GoodsListFragment$g$a
                r0.<init>(r2)
                com.bxkj.base.auth.a r3 = r3.i(r0)
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                r1 = 0
                r3.b(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        h(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        i(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.GoodsListFragment.T(r0)
                r0.clear()
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.GoodsListFragment.T(r0)
                r0.addAll(r3)
                com.bxkj.student.life.mall.GoodsListFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.GoodsListFragment.W(r3)
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.GoodsListFragment.T(r0)
                int r0 = r0.size()
                r1 = 0
                r3.notifyItemRangeInserted(r1, r0)
                com.bxkj.student.life.mall.GoodsListFragment r3 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r3 = com.bxkj.student.life.mall.GoodsListFragment.Q(r3)
                r3.D()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsListFragment a;

        j(com.bxkj.student.life.mall.GoodsListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.GoodsListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.GoodsListFragment.Q(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.mall.GoodsListFragment.Z(r0, r1)
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                int r0 = com.bxkj.student.life.mall.GoodsListFragment.O(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.GoodsListFragment.U(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.mall.GoodsListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.GoodsListFragment.U(r0)
                r0.addAll(r3)
                com.bxkj.student.life.mall.GoodsListFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.GoodsListFragment.V(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public GoodsListFragment() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1018q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1019r = r0
            r0 = 0
            r2.f1021t = r0
            r1 = 1
            r2.f1023v = r1
            r1 = 15
            r2.f1024w = r1
            r2.f1025x = r0
            return
    }

    static /* bridge */ /* synthetic */ int N(com.bxkj.student.life.mall.GoodsListFragment r0) {
            int r0 = r0.f1021t
            return r0
    }

    static /* bridge */ /* synthetic */ int O(com.bxkj.student.life.mall.GoodsListFragment r0) {
            int r0 = r0.f1023v
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.life.mall.GoodsListFragment r0) {
            int r0 = r0.f1024w
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout Q(com.bxkj.student.life.mall.GoodsListFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ int R(com.bxkj.student.life.mall.GoodsListFragment r0) {
            int r0 = r0.f1025x
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView S(com.bxkj.student.life.mall.GoodsListFragment r0) {
            android.widget.TextView r0 = r0.f1017p
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List T(com.bxkj.student.life.mall.GoodsListFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1019r
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List U(com.bxkj.student.life.mall.GoodsListFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1018q
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter V(com.bxkj.student.life.mall.GoodsListFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1022u
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter W(com.bxkj.student.life.mall.GoodsListFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1020s
            return r0
    }

    static /* bridge */ /* synthetic */ void X(com.bxkj.student.life.mall.GoodsListFragment r0, int r1) {
            r0.f1021t = r1
            return
    }

    static /* bridge */ /* synthetic */ void Y(com.bxkj.student.life.mall.GoodsListFragment r0, int r1) {
            r0.f1023v = r1
            return
    }

    static /* bridge */ /* synthetic */ void Z(com.bxkj.student.life.mall.GoodsListFragment r0, int r1) {
            r0.f1025x = r1
            return
    }

    static /* bridge */ /* synthetic */ void a0(com.bxkj.student.life.mall.GoodsListFragment r0) {
            r0.g0()
            return
    }

    static /* bridge */ /* synthetic */ void b0(com.bxkj.student.life.mall.GoodsListFragment r0) {
            r0.h0()
            return
    }

    static /* synthetic */ android.content.Context c0(com.bxkj.student.life.mall.GoodsListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context d0(com.bxkj.student.life.mall.GoodsListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context e0(com.bxkj.student.life.mall.GoodsListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void g0() {
            r5 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r5.f1020s
            if (r0 == 0) goto L41
            int r0 = r0.getItemCount()
            int r1 = r5.f1021t
            if (r0 > r1) goto Ld
            goto L41
        Ld:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r5.f1020s
            java.lang.Object r0 = r0.getItem(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "id"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.content.Context r1 = r5.g
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            java.lang.Class<w.g> r2 = w.g.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.g r2 = (w.g) r2
            int r3 = r5.f1023v
            int r4 = r5.f1024w
            rx.e r0 = r2.a(r0, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.life.mall.GoodsListFragment$j r1 = new com.bxkj.student.life.mall.GoodsListFragment$j
            r1.<init>(r5)
            r0.setDataListener(r1)
        L41:
            return
    }

    private void h0() {
            r2 = this;
            android.content.Context r0 = r2.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            rx.e r1 = r1.q()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.GoodsListFragment$i r1 = new com.bxkj.student.life.mall.GoodsListFragment$i
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void i0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.k
            com.bxkj.student.life.mall.GoodsListFragment$d r1 = new com.bxkj.student.life.mall.GoodsListFragment$d
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private void j0() {
            r4 = this;
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.g
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.f1013l
            r1.setLayoutAnimation(r0)
            com.bxkj.student.life.mall.GoodsListFragment$c r0 = new com.bxkj.student.life.mall.GoodsListFragment$c
            android.content.Context r1 = r4.g
            r2 = 2131493255(0x7f0c0187, float:1.8609985E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1018q
            r0.<init>(r4, r1, r2, r3)
            r4.f1022u = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f1013l
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.g
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f1013l
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.f1022u
            r0.setAdapter(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f1013l
            android.widget.TextView r1 = r4.f1014m
            r0.setEmptyView(r1)
            return
    }

    private void k0() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.j
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.g
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.g
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.j
            r1.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.j
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.g
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            com.bxkj.student.life.mall.GoodsListFragment$b r0 = new com.bxkj.student.life.mall.GoodsListFragment$b
            android.content.Context r1 = r4.g
            r2 = 2131493336(0x7f0c01d8, float:1.861015E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1019r
            r0.<init>(r4, r1, r2, r3)
            r4.f1020s = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.j
            r1.setAdapter(r0)
            return
    }

    public void b() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1020s
            com.bxkj.student.life.mall.GoodsListFragment$e r1 = new com.bxkj.student.life.mall.GoodsListFragment$e
            r1.<init>(r2)
            r0.k(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f1015n
            com.bxkj.student.life.mall.GoodsListFragment$f r1 = new com.bxkj.student.life.mall.GoodsListFragment$f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.FrameLayout r0 = r2.f1016o
            com.bxkj.student.life.mall.GoodsListFragment$g r1 = new com.bxkj.student.life.mall.GoodsListFragment$g
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1022u
            com.bxkj.student.life.mall.GoodsListFragment$h r1 = new com.bxkj.student.life.mall.GoodsListFragment$h
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected void e() {
            r0 = this;
            r0.k0()
            r0.j0()
            r0.h0()
            r0.i0()
            r0.f0()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298442(0x7f09088a, float:1.8214857E38)
            android.view.View r1 = r0.c(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.j = r1
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.c(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.k = r1
            r1 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.f1013l = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1014m = r1
            r1 = 2131296964(0x7f0902c4, float:1.821186E38)
            android.view.View r1 = r0.c(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            r0.f1015n = r1
            r1 = 2131296989(0x7f0902dd, float:1.821191E38)
            android.view.View r1 = r0.c(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.f1016o = r1
            r1 = 2131298848(0x7f090a20, float:1.821568E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1017p = r1
            return
    }

    public void f0() {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L4a
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInMall()
            if (r0 == 0) goto L4a
            android.content.Context r0 = r3.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.n(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.GoodsListFragment$a r1 = new com.bxkj.student.life.mall.GoodsListFragment$a
            r1.<init>(r3)
            r0.setDataListener(r1)
        L4a:
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493186(0x7f0c0142, float:1.8609845E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

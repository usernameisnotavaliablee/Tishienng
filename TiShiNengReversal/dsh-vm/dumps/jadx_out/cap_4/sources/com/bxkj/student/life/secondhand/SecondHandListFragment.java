package com.bxkj.student.life.secondhand;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SecondHandListFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout j;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f1063l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f1064m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f1065n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f1066o;

    /* renamed from: p, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1067p;

    /* renamed from: q, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1068q;

    /* renamed from: r, reason: collision with root package name */
    private int f1069r;

    /* renamed from: s, reason: collision with root package name */
    private int f1070s;

    /* renamed from: t, reason: collision with root package name */
    private int f1071t;

    /* renamed from: u, reason: collision with root package name */
    private final int f1072u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.secondhand.SecondHandListFragment$a$a, reason: collision with other inner class name */
        class C0127a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
            final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment.a e;

            C0127a(com.bxkj.student.life.secondhand.SecondHandListFragment.a r1, android.content.Context r2, int r3, java.util.List r4) {
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

        a(com.bxkj.student.life.secondhand.SecondHandListFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "description"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298946(0x7f090a82, float:1.821588E38)
                r5.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "时间："
                r0.append(r1)
                java.lang.String r1 = "publishTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299158(0x7f090b56, float:1.821631E38)
                r5.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "价格："
                r0.append(r1)
                java.lang.String r1 = "price"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
                r5.J(r1, r0)
                java.lang.String r0 = "buyOrSell"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                r2 = 1
                if (r1 != r2) goto L52
                java.lang.String r1 = "卖"
                goto L54
            L52:
                java.lang.String r1 = "买"
            L54:
                r3 = 2131298821(0x7f090a05, float:1.8215626E38)
                r5.J(r3, r1)
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                if (r0 != r2) goto L6a
                android.content.Context r0 = r4.e
                r1 = 2131099719(0x7f060047, float:1.78118E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
                goto L73
            L6a:
                android.content.Context r0 = r4.e
                r1 = 2131099714(0x7f060042, float:1.781179E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            L73:
                r5.k(r3, r0)
                r0 = 2131297031(0x7f090307, float:1.8211995E38)
                android.view.View r5 = r5.h(r0)
                android.widget.GridView r5 = (android.widget.GridView) r5
                r0 = 0
                r5.setEnabled(r0)
                r5.setPressed(r0)
                r5.setClickable(r0)
                java.lang.String r0 = "img"
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.util.List r6 = cn.bluemobi.dylan.http.JsonParse.getList(r6, r0, r1)
                com.bxkj.student.life.secondhand.SecondHandListFragment$a$a r0 = new com.bxkj.student.life.secondhand.SecondHandListFragment$a$a
                android.content.Context r1 = r4.e
                r2 = 2131493280(0x7f0c01a0, float:1.8610036E38)
                r0.<init>(r4, r1, r2, r6)
                r5.setAdapter(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ int a;
            final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment.b b;

            a(com.bxkj.student.life.secondhand.SecondHandListFragment.b r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r4 = this;
                    com.bxkj.student.life.secondhand.SecondHandListFragment$b r0 = r4.b
                    com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r0.a
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.secondhand.SecondHandListFragment$b r2 = r4.b
                    com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.W(r2)
                    java.lang.Class<com.bxkj.student.life.secondhand.BuyDetailActivity> r3 = com.bxkj.student.life.secondhand.BuyDetailActivity.class
                    r1.<init>(r2, r3)
                    com.bxkj.student.life.secondhand.SecondHandListFragment$b r2 = r4.b
                    com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.N(r2)
                    int r3 = r4.a
                    java.lang.Object r2 = r2.getItem(r3)
                    java.util.Map r2 = (java.util.Map) r2
                    java.lang.String r3 = "id"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                    java.lang.String r3 = "noticeId"
                    android.content.Intent r1 = r1.putExtra(r3, r2)
                    com.bxkj.student.life.secondhand.SecondHandListFragment$b r2 = r4.b
                    com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.N(r2)
                    int r3 = r4.a
                    java.lang.Object r2 = r2.getItem(r3)
                    java.util.Map r2 = (java.util.Map) r2
                    java.lang.String r3 = "buyOrSell"
                    int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
                    java.lang.String r3 = "buyType"
                    android.content.Intent r1 = r1.putExtra(r3, r2)
                    r0.startActivity(r1)
                    return
            }
        }

        b(com.bxkj.student.life.secondhand.SecondHandListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.base.auth.a r1 = new com.bxkj.base.auth.a
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r0.a
                android.content.Context r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.X(r2)
                r1.<init>(r2)
                com.bxkj.student.life.secondhand.SecondHandListFragment$b$a r2 = new com.bxkj.student.life.secondhand.SecondHandListFragment$b$a
                r2.<init>(r0, r4)
                com.bxkj.base.auth.a r1 = r1.i(r2)
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r0.a
                androidx.fragment.app.FragmentManager r2 = r2.getChildFragmentManager()
                r3 = 2
                r1.b(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment a;

        c(com.bxkj.student.life.secondhand.SecondHandListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.Y(r2)
                java.lang.Class<com.bxkj.student.life.secondhand.PublishBuyActivity> r3 = com.bxkj.student.life.secondhand.PublishBuyActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "type"
                r3 = 0
                android.content.Intent r1 = r1.putExtra(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment a;

        d(com.bxkj.student.life.secondhand.SecondHandListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.Z(r2)
                java.lang.Class<com.bxkj.student.life.secondhand.PublishBuyActivity> r3 = com.bxkj.student.life.secondhand.PublishBuyActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "type"
                r3 = 1
                android.content.Intent r1 = r1.putExtra(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment a;

        e(com.bxkj.student.life.secondhand.SecondHandListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.a0(r2)
                java.lang.Class<com.bxkj.student.life.secondhand.MyBuyGoodsActivity> r3 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements m2.e {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment a;

        f(com.bxkj.student.life.secondhand.SecondHandListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.secondhand.SecondHandListFragment r4 = r3.a
                int r4 = com.bxkj.student.life.secondhand.SecondHandListFragment.S(r4)
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r3.a
                int r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.Q(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r3.a
                int r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.P(r0)
                com.bxkj.student.life.secondhand.SecondHandListFragment r1 = r3.a
                int r1 = com.bxkj.student.life.secondhand.SecondHandListFragment.S(r1)
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r3.a
                int r2 = com.bxkj.student.life.secondhand.SecondHandListFragment.Q(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.secondhand.SecondHandListFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r4)
                r4.q0()
                com.bxkj.student.life.secondhand.SecondHandListFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.life.secondhand.SecondHandListFragment r4 = r3.a
                int r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.P(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.secondhand.SecondHandListFragment.T(r4, r0)
                com.bxkj.student.life.secondhand.SecondHandListFragment r4 = r3.a
                com.bxkj.student.life.secondhand.SecondHandListFragment.V(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.life.secondhand.SecondHandListFragment.T(r2, r0)
                com.bxkj.student.life.secondhand.SecondHandListFragment r2 = r1.a
                com.bxkj.student.life.secondhand.SecondHandListFragment.V(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.secondhand.SecondHandListFragment a;

        g(com.bxkj.student.life.secondhand.SecondHandListFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.R(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.secondhand.SecondHandListFragment.U(r0, r1)
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r2.a
                int r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.P(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.O(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.secondhand.SecondHandListFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.secondhand.SecondHandListFragment.O(r0)
                r0.addAll(r3)
                com.bxkj.student.life.secondhand.SecondHandListFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.secondhand.SecondHandListFragment.N(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public SecondHandListFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1068q = r0
            r0 = 1
            r1.f1069r = r0
            r0 = 15
            r1.f1070s = r0
            r0 = 0
            r1.f1071t = r0
            r0 = 80
            r1.f1072u = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1067p
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List O(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1068q
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            int r0 = r0.f1069r
            return r0
    }

    static /* bridge */ /* synthetic */ int Q(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            int r0 = r0.f1070s
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout R(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            int r0 = r0.f1071t
            return r0
    }

    static /* bridge */ /* synthetic */ void T(com.bxkj.student.life.secondhand.SecondHandListFragment r0, int r1) {
            r0.f1069r = r1
            return
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.life.secondhand.SecondHandListFragment r0, int r1) {
            r0.f1071t = r1
            return
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            r0.c0()
            return
    }

    static /* synthetic */ android.content.Context W(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Y(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Z(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context a0(com.bxkj.student.life.secondhand.SecondHandListFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void b0() {
            r11 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r11.f1063l
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0072: FILL_ARRAY_DATA , data: [1110704128, 0} // fill-array
            java.lang.String r3 = "rotation"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r3, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r11.f1066o
            r3 = 1131413504(0x43700000, float:240.0)
            android.content.Context r4 = r11.g
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r4)
            int r3 = -r3
            float r3 = (float) r3
            float[] r4 = new float[r1]
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r6 = 0
            r4[r3] = r6
            java.lang.String r7 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r7, r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r11.f1064m
            r8 = 1126170624(0x43200000, float:160.0)
            android.content.Context r9 = r11.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r8, r9)
            int r8 = -r8
            float r8 = (float) r8
            float[] r9 = new float[r1]
            r9[r5] = r8
            r9[r3] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r7, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r11.f1065n
            r9 = 1117782016(0x42a00000, float:80.0)
            android.content.Context r10 = r11.g
            int r9 = cn.bluemobi.dylan.base.utils.u.a(r9, r10)
            int r9 = -r9
            float r9 = (float) r9
            float[] r1 = new float[r1]
            r1[r5] = r9
            r1[r3] = r6
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r8, r7, r1)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r5 = 500(0x1f4, double:2.47E-321)
            r3.setDuration(r5)
            android.animation.AnimatorSet$Builder r0 = r3.play(r0)
            android.animation.AnimatorSet$Builder r0 = r0.with(r2)
            android.animation.AnimatorSet$Builder r0 = r0.with(r4)
            r0.with(r1)
            r3.start()
            return
    }

    private void c0() {
            r4 = this;
            android.content.Context r0 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.i> r1 = w.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.i r1 = (w.i) r1
            int r2 = r4.f1069r
            int r3 = r4.f1070s
            rx.e r1 = r1.d(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.secondhand.SecondHandListFragment$g r1 = new com.bxkj.student.life.secondhand.SecondHandListFragment$g
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void d0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.j
            com.bxkj.student.life.secondhand.SecondHandListFragment$f r1 = new com.bxkj.student.life.secondhand.SecondHandListFragment$f
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private void e0() {
            r11 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r11.f1063l
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0072: FILL_ARRAY_DATA , data: [0, 1110704128} // fill-array
            java.lang.String r3 = "rotation"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r3, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r11.f1066o
            r3 = 1131413504(0x43700000, float:240.0)
            android.content.Context r4 = r11.g
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r4)
            int r3 = -r3
            float r3 = (float) r3
            float[] r4 = new float[r1]
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r7 = 1
            r4[r7] = r3
            java.lang.String r3 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r11.f1064m
            r8 = 1126170624(0x43200000, float:160.0)
            android.content.Context r9 = r11.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r8, r9)
            int r8 = -r8
            float r8 = (float) r8
            float[] r9 = new float[r1]
            r9[r5] = r6
            r9[r7] = r8
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r3, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r11.f1065n
            r9 = 1117782016(0x42a00000, float:80.0)
            android.content.Context r10 = r11.g
            int r9 = cn.bluemobi.dylan.base.utils.u.a(r9, r10)
            int r9 = -r9
            float r9 = (float) r9
            float[] r1 = new float[r1]
            r1[r5] = r6
            r1[r7] = r9
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r8, r3, r1)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r5 = 500(0x1f4, double:2.47E-321)
            r3.setDuration(r5)
            android.animation.AnimatorSet$Builder r0 = r3.play(r0)
            android.animation.AnimatorSet$Builder r0 = r0.with(r2)
            android.animation.AnimatorSet$Builder r0 = r0.with(r4)
            r0.with(r1)
            r3.start()
            return
    }

    public void b() {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f1063l
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f1064m
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f1065n
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f1066o
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1067p
            com.bxkj.student.life.secondhand.SecondHandListFragment$b r1 = new com.bxkj.student.life.secondhand.SecondHandListFragment$b
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    public void e() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
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
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.k
            r1.setLayoutAnimation(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.g
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            com.bxkj.student.life.secondhand.SecondHandListFragment$a r0 = new com.bxkj.student.life.secondhand.SecondHandListFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493321(0x7f0c01c9, float:1.8610119E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1068q
            r0.<init>(r4, r1, r2, r3)
            r4.f1067p = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.k
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.c(r1)
            r0.setEmptyView(r1)
            r4.d0()
            r4.f0()
            return
    }

    protected void f(android.view.View r4) {
            r3 = this;
            r4 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r4 = r3.c(r4)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r4
            r3.j = r4
            r4 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r4 = r3.c(r4)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r4 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r4
            r3.k = r4
            r4 = 2131296965(0x7f0902c5, float:1.8211862E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f1063l = r4
            r4 = 2131296966(0x7f0902c6, float:1.8211864E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f1064m = r4
            r4 = 2131296968(0x7f0902c8, float:1.8211868E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f1065n = r4
            r4 = 2131296967(0x7f0902c7, float:1.8211866E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f1066o = r4
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r3.f1064m
            java.lang.String r0 = "买"
            r1 = 1109393408(0x42200000, float:40.0)
            r2 = -1
            android.graphics.Bitmap r0 = r3.g0(r0, r1, r2)
            r4.setImageBitmap(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r3.f1065n
            java.lang.String r0 = "卖"
            android.graphics.Bitmap r0 = r3.g0(r0, r1, r2)
            r4.setImageBitmap(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r3.f1066o
            java.lang.String r0 = "我的"
            android.graphics.Bitmap r0 = r3.g0(r0, r1, r2)
            r4.setImageBitmap(r0)
            return
    }

    public void f0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.j
            r0.D()
            return
    }

    public android.graphics.Bitmap g0(java.lang.String r5, float r6, int r7) {
            r4 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r0.setTextSize(r6)
            r0.setColor(r7)
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r6)
            float r6 = r0.ascent()
            float r6 = -r6
            float r7 = r0.measureText(r5)
            r1 = 0
            float r7 = r7 + r1
            int r7 = (int) r7
            float r2 = r0.descent()
            float r2 = r2 + r6
            float r2 = r2 + r1
            int r2 = (int) r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r7)
            r2.drawText(r5, r1, r6, r0)
            return r7
    }

    protected int i() {
            r1 = this;
            r0 = 2131493193(0x7f0c0149, float:1.860986E38)
            return r0
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2
            switch(r3) {
                case 2131296965: goto L51;
                case 2131296966: goto L39;
                case 2131296967: goto L21;
                case 2131296968: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.g
            r3.<init>(r1)
            com.bxkj.student.life.secondhand.SecondHandListFragment$d r1 = new com.bxkj.student.life.secondhand.SecondHandListFragment$d
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            r3.b(r1, r0)
            return
        L21:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.g
            r3.<init>(r1)
            com.bxkj.student.life.secondhand.SecondHandListFragment$e r1 = new com.bxkj.student.life.secondhand.SecondHandListFragment$e
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            r3.b(r1, r0)
            return
        L39:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.g
            r3.<init>(r1)
            com.bxkj.student.life.secondhand.SecondHandListFragment$c r1 = new com.bxkj.student.life.secondhand.SecondHandListFragment$c
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            r3.b(r1, r0)
            return
        L51:
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.f1063l
            java.lang.Object r3 = r3.getTag()
            if (r3 != 0) goto L64
            r2.e0()
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.f1063l
            java.lang.String r0 = "open"
            r3.setTag(r0)
            return
        L64:
            r2.b0()
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.f1063l
            r0 = 0
            r3.setTag(r0)
            return
    }
}

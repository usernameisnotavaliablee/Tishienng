package com.bxkj.student.life.lost;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LostGoodsFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout j;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f995l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f996m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f997n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f998o;

    /* renamed from: p, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f999p;

    /* renamed from: q, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1000q;

    /* renamed from: r, reason: collision with root package name */
    private int f1001r;

    /* renamed from: s, reason: collision with root package name */
    private int f1002s;

    /* renamed from: t, reason: collision with root package name */
    private int f1003t;

    /* renamed from: u, reason: collision with root package name */
    private final int f1004u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.lost.LostGoodsFragment$a$a, reason: collision with other inner class name */
        class C0107a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
            final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment.a e;

            C0107a(com.bxkj.student.life.lost.LostGoodsFragment.a r1, android.content.Context r2, int r3, java.util.List r4) {
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

        a(com.bxkj.student.life.lost.LostGoodsFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                java.lang.String r0 = "lostOrFound"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                r2 = 1
                if (r1 != r2) goto Lc
                java.lang.String r1 = "丢"
                goto Le
            Lc:
                java.lang.String r1 = "捡"
            Le:
                r3 = 2131299087(0x7f090b0f, float:1.8216165E38)
                r6.J(r3, r1)
                java.lang.String r1 = "description"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
                r4 = 2131298946(0x7f090a82, float:1.821588E38)
                r6.J(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "时间："
                r1.append(r4)
                java.lang.String r4 = "publishTime"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r4)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r4 = 2131299158(0x7f090b56, float:1.821631E38)
                r6.J(r4, r1)
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                if (r0 != r2) goto L4d
                android.content.Context r0 = r5.e
                r1 = 2131099739(0x7f06005b, float:1.781184E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
                goto L56
            L4d:
                android.content.Context r0 = r5.e
                r1 = 2131100565(0x7f060395, float:1.7813515E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            L56:
                r6.k(r3, r0)
                r0 = 2131297031(0x7f090307, float:1.8211995E38)
                android.view.View r6 = r6.h(r0)
                android.widget.GridView r6 = (android.widget.GridView) r6
                r0 = 0
                r6.setEnabled(r0)
                r6.setPressed(r0)
                r6.setClickable(r0)
                java.lang.String r0 = "img"
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.util.List r7 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r0, r1)
                com.bxkj.student.life.lost.LostGoodsFragment$a$a r0 = new com.bxkj.student.life.lost.LostGoodsFragment$a$a
                android.content.Context r1 = r5.e
                r2 = 2131493280(0x7f0c01a0, float:1.8610036E38)
                r0.<init>(r5, r1, r2, r7)
                r6.setAdapter(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ int a;
            final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment.b b;

            a(com.bxkj.student.life.lost.LostGoodsFragment.b r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r4 = this;
                    com.bxkj.student.life.lost.LostGoodsFragment$b r0 = r4.b
                    com.bxkj.student.life.lost.LostGoodsFragment r0 = r0.a
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.lost.LostGoodsFragment$b r2 = r4.b
                    com.bxkj.student.life.lost.LostGoodsFragment r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.life.lost.LostGoodsFragment.W(r2)
                    java.lang.Class<com.bxkj.student.life.lost.LostDetailActivity> r3 = com.bxkj.student.life.lost.LostDetailActivity.class
                    r1.<init>(r2, r3)
                    com.bxkj.student.life.lost.LostGoodsFragment$b r2 = r4.b
                    com.bxkj.student.life.lost.LostGoodsFragment r2 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.lost.LostGoodsFragment.N(r2)
                    int r3 = r4.a
                    java.lang.Object r2 = r2.getItem(r3)
                    java.util.Map r2 = (java.util.Map) r2
                    java.lang.String r3 = "id"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                    java.lang.String r3 = "noticeId"
                    android.content.Intent r1 = r1.putExtra(r3, r2)
                    com.bxkj.student.life.lost.LostGoodsFragment$b r2 = r4.b
                    com.bxkj.student.life.lost.LostGoodsFragment r2 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.lost.LostGoodsFragment.N(r2)
                    int r3 = r4.a
                    java.lang.Object r2 = r2.getItem(r3)
                    java.util.Map r2 = (java.util.Map) r2
                    java.lang.String r3 = "lostOrFound"
                    int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
                    java.lang.String r3 = "lostType"
                    android.content.Intent r1 = r1.putExtra(r3, r2)
                    r0.startActivity(r1)
                    return
            }
        }

        b(com.bxkj.student.life.lost.LostGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.base.auth.a r1 = new com.bxkj.base.auth.a
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r0.a
                android.content.Context r2 = com.bxkj.student.life.lost.LostGoodsFragment.X(r2)
                r1.<init>(r2)
                com.bxkj.student.life.lost.LostGoodsFragment$b$a r2 = new com.bxkj.student.life.lost.LostGoodsFragment$b$a
                r2.<init>(r0, r4)
                com.bxkj.base.auth.a r1 = r1.i(r2)
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r0.a
                androidx.fragment.app.FragmentManager r2 = r2.getChildFragmentManager()
                r3 = 1
                r1.b(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment a;

        c(com.bxkj.student.life.lost.LostGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.lost.LostGoodsFragment.Y(r2)
                java.lang.Class<com.bxkj.student.life.lost.PublishLostActivity> r3 = com.bxkj.student.life.lost.PublishLostActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "type"
                r3 = 1
                android.content.Intent r1 = r1.putExtra(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment a;

        d(com.bxkj.student.life.lost.LostGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.lost.LostGoodsFragment.Z(r2)
                java.lang.Class<com.bxkj.student.life.lost.PublishLostActivity> r3 = com.bxkj.student.life.lost.PublishLostActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "type"
                r3 = 0
                android.content.Intent r1 = r1.putExtra(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment a;

        e(com.bxkj.student.life.lost.LostGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.lost.LostGoodsFragment.a0(r2)
                java.lang.Class<com.bxkj.student.life.lost.MyLostGoodsActivity> r3 = com.bxkj.student.life.lost.MyLostGoodsActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements m2.e {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment a;

        f(com.bxkj.student.life.lost.LostGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.lost.LostGoodsFragment r4 = r3.a
                int r4 = com.bxkj.student.life.lost.LostGoodsFragment.S(r4)
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r3.a
                int r0 = com.bxkj.student.life.lost.LostGoodsFragment.Q(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r3.a
                int r0 = com.bxkj.student.life.lost.LostGoodsFragment.P(r0)
                com.bxkj.student.life.lost.LostGoodsFragment r1 = r3.a
                int r1 = com.bxkj.student.life.lost.LostGoodsFragment.S(r1)
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r3.a
                int r2 = com.bxkj.student.life.lost.LostGoodsFragment.Q(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.lost.LostGoodsFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.lost.LostGoodsFragment.R(r4)
                r4.q0()
                com.bxkj.student.life.lost.LostGoodsFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.life.lost.LostGoodsFragment r4 = r3.a
                int r0 = com.bxkj.student.life.lost.LostGoodsFragment.P(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.lost.LostGoodsFragment.T(r4, r0)
                com.bxkj.student.life.lost.LostGoodsFragment r4 = r3.a
                com.bxkj.student.life.lost.LostGoodsFragment.V(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.life.lost.LostGoodsFragment.T(r2, r0)
                com.bxkj.student.life.lost.LostGoodsFragment r2 = r1.a
                com.bxkj.student.life.lost.LostGoodsFragment.V(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.lost.LostGoodsFragment a;

        g(com.bxkj.student.life.lost.LostGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.lost.LostGoodsFragment.R(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.lost.LostGoodsFragment.R(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.lost.LostGoodsFragment.R(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.lost.LostGoodsFragment.R(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.lost.LostGoodsFragment.R(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.lost.LostGoodsFragment.R(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.lost.LostGoodsFragment.U(r0, r1)
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r2.a
                int r0 = com.bxkj.student.life.lost.LostGoodsFragment.P(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.lost.LostGoodsFragment.O(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.lost.LostGoodsFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.lost.LostGoodsFragment.O(r0)
                r0.addAll(r3)
                com.bxkj.student.life.lost.LostGoodsFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.lost.LostGoodsFragment.N(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public LostGoodsFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1000q = r0
            r0 = 1
            r1.f1001r = r0
            r0 = 10
            r1.f1002s = r0
            r0 = 0
            r1.f1003t = r0
            r0 = 80
            r1.f1004u = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f999p
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List O(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1000q
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            int r0 = r0.f1001r
            return r0
    }

    static /* bridge */ /* synthetic */ int Q(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            int r0 = r0.f1002s
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout R(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            int r0 = r0.f1003t
            return r0
    }

    static /* bridge */ /* synthetic */ void T(com.bxkj.student.life.lost.LostGoodsFragment r0, int r1) {
            r0.f1001r = r1
            return
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.life.lost.LostGoodsFragment r0, int r1) {
            r0.f1003t = r1
            return
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            r0.c0()
            return
    }

    static /* synthetic */ android.content.Context W(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Y(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Z(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context a0(com.bxkj.student.life.lost.LostGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void b0() {
            r11 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r11.f995l
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0072: FILL_ARRAY_DATA , data: [1110704128, 0} // fill-array
            java.lang.String r3 = "rotation"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r3, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r11.f998o
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
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r11.f996m
            r8 = 1126170624(0x43200000, float:160.0)
            android.content.Context r9 = r11.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r8, r9)
            int r8 = -r8
            float r8 = (float) r8
            float[] r9 = new float[r1]
            r9[r5] = r8
            r9[r3] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r7, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r11.f997n
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
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r1 = (w.e) r1
            int r2 = r4.f1001r
            int r3 = r4.f1002s
            rx.e r1 = r1.g(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.lost.LostGoodsFragment$g r1 = new com.bxkj.student.life.lost.LostGoodsFragment$g
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void d0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.j
            com.bxkj.student.life.lost.LostGoodsFragment$f r1 = new com.bxkj.student.life.lost.LostGoodsFragment$f
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private void e0() {
            r11 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r11.f995l
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0072: FILL_ARRAY_DATA , data: [0, 1110704128} // fill-array
            java.lang.String r3 = "rotation"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r3, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r11.f998o
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
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r11.f996m
            r8 = 1126170624(0x43200000, float:160.0)
            android.content.Context r9 = r11.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r8, r9)
            int r8 = -r8
            float r8 = (float) r8
            float[] r9 = new float[r1]
            r9[r5] = r6
            r9[r7] = r8
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r3, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = r11.f997n
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
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f995l
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f996m
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f997n
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f998o
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f999p
            com.bxkj.student.life.lost.LostGoodsFragment$b r1 = new com.bxkj.student.life.lost.LostGoodsFragment$b
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
            com.bxkj.student.life.lost.LostGoodsFragment$a r0 = new com.bxkj.student.life.lost.LostGoodsFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493279(0x7f0c019f, float:1.8610034E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1000q
            r0.<init>(r4, r1, r2, r3)
            r4.f999p = r0
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
            r3.f995l = r4
            r4 = 2131296966(0x7f0902c6, float:1.8211864E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f996m = r4
            r4 = 2131296968(0x7f0902c8, float:1.8211868E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f997n = r4
            r4 = 2131296967(0x7f0902c7, float:1.8211866E38)
            android.view.View r4 = r3.c(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r3.f998o = r4
            java.lang.String r0 = "我的"
            r1 = 1109393408(0x42200000, float:40.0)
            r2 = -1
            android.graphics.Bitmap r0 = r3.g0(r0, r1, r2)
            r4.setImageBitmap(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r3.f996m
            java.lang.String r0 = "丢"
            android.graphics.Bitmap r0 = r3.g0(r0, r1, r2)
            r4.setImageBitmap(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r3.f997n
            java.lang.String r0 = "捡"
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
            r0 = 1
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
            com.bxkj.student.life.lost.LostGoodsFragment$d r1 = new com.bxkj.student.life.lost.LostGoodsFragment$d
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            r3.b(r1, r0)
            return
        L21:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.g
            r3.<init>(r1)
            com.bxkj.student.life.lost.LostGoodsFragment$e r1 = new com.bxkj.student.life.lost.LostGoodsFragment$e
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            r3.b(r1, r0)
            return
        L39:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.g
            r3.<init>(r1)
            com.bxkj.student.life.lost.LostGoodsFragment$c r1 = new com.bxkj.student.life.lost.LostGoodsFragment$c
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getChildFragmentManager()
            r3.b(r1, r0)
            return
        L51:
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.f995l
            java.lang.Object r3 = r3.getTag()
            if (r3 != 0) goto L64
            r2.e0()
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.f995l
            java.lang.String r0 = "open"
            r3.setTag(r0)
            return
        L64:
            r2.b0()
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.f995l
            r0 = 0
            r3.setTag(r0)
            return
    }
}

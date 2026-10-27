package com.bxkj.student.life.mall.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CollectGoodsFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private androidx.appcompat.widget.SearchView j;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout k;

    /* renamed from: l, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView f1034l;

    /* renamed from: m, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1035m;

    /* renamed from: n, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1036n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f1037o;

    /* renamed from: p, reason: collision with root package name */
    private int f1038p;

    /* renamed from: q, reason: collision with root package name */
    private int f1039q;

    /* renamed from: r, reason: collision with root package name */
    private int f1040r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f1041s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0117a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment.a c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a, reason: collision with other inner class name */
            class C0118a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
                final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.ViewOnClickListenerC0117a a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                /* renamed from: com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a$a, reason: collision with other inner class name */
                class C0119a extends cn.bluemobi.dylan.http.HttpCallBack {
                    final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.ViewOnClickListenerC0117a.C0118a a;

                    C0119a(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.ViewOnClickListenerC0117a.C0118a r1) {
                            r0 = this;
                            r0.a = r1
                            r0.<init>()
                            return
                    }

                    public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                            r1 = this;
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a r2 = r1.a
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r2 = r2.a
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r2 = r2.c
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r2.k
                            java.util.List r2 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.O(r2)
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a r0 = r1.a
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r0 = r0.a
                            java.util.Map r0 = r0.a
                            r2.remove(r0)
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a r2 = r1.a
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r2 = r2.a
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r2 = r2.c
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r2.k
                            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.N(r2)
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a r0 = r1.a
                            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r0 = r0.a
                            cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r0.b
                            int r0 = r0.f()
                            r2.notifyItemRemoved(r0)
                            return
                    }
                }

                C0118a(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.ViewOnClickListenerC0117a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void buttonRightOnClick() {
                        r4 = this;
                        com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r0 = r4.a
                        com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r0 = r0.c
                        android.content.Context r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.m(r0)
                        cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                        java.lang.Class<w.g> r1 = w.g.class
                        java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                        w.g r1 = (w.g) r1
                        com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r2 = r4.a
                        java.util.Map r2 = r2.a
                        java.lang.String r3 = "commId"
                        java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                        com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                        java.lang.String r3 = r3.getOpenId()
                        rx.e r1 = r1.i(r2, r3)
                        cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                        com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a$a r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a$a
                        r1.<init>(r4)
                        r0.setDataListener(r1)
                        return
                }
            }

            ViewOnClickListenerC0117a(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r0 = r1.c
                    android.content.Context r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.n(r0)
                    r2.<init>(r0)
                    java.lang.String r0 = "确定要删除吗？"
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setMessage(r0)
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a r0 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a$a
                    r0.<init>(r1)
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonOnClickListener(r0)
                    r2.show()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment.a b;

            b(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r4 = r3.b
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.a.o(r1)
                    java.lang.Class<com.bxkj.student.life.mall.GoodsDetailActivity> r2 = com.bxkj.student.life.mall.GoodsDetailActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "commId"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.lang.String r2 = "goodsId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r4.startActivity(r0)
                    return
            }
        }

        a(com.bxkj.student.life.mall.collect.CollectGoodsFragment r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context o(com.bxkj.student.life.mall.collect.CollectGoodsFragment.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.p(r1, r2)
                return
        }

        public void p(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
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
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
                r4.J(r1, r0)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a r0 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$a
                r0.<init>(r3, r5, r4)
                r1 = 2131296603(0x7f09015b, float:1.8211127E38)
                r4.w(r1, r0)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$b r0 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$a$b
                r0.<init>(r3, r5)
                r5 = 2131298030(0x7f0906ee, float:1.8214022E38)
                r4.w(r5, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment a;

        b(com.bxkj.student.life.mall.collect.CollectGoodsFragment r1) {
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
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.bxkj.student.life.mall.collect.CollectGoodsFragment.T(r0, r2)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r2)
                r2.D()
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment a;

        c(com.bxkj.student.life.mall.collect.CollectGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r1.a
                android.content.Context r4 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.X(r4)
                java.lang.Class<com.bxkj.student.life.mall.GoodsDetailActivity> r0 = com.bxkj.student.life.mall.GoodsDetailActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.N(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "commId"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "goodsId"
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements m2.e {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment a;

        d(com.bxkj.student.life.mall.collect.CollectGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r3.a
                int r4 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.S(r4)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r3.a
                int r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.Q(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r3.a
                int r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.P(r0)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r1 = r3.a
                int r1 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.S(r1)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r3.a
                int r2 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.Q(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r4)
                r4.q0()
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r4 = r3.a
                int r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.P(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.mall.collect.CollectGoodsFragment.U(r4, r0)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.life.mall.collect.CollectGoodsFragment.U(r2, r0)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r2 = r1.a
                com.bxkj.student.life.mall.collect.CollectGoodsFragment.W(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment a;

        e(com.bxkj.student.life.mall.collect.CollectGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.R(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment.V(r0, r1)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r2.a
                int r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.P(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.O(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.O(r0)
                r0.addAll(r3)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.N(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.mall.collect.CollectGoodsFragment.f a;

            a(com.bxkj.student.life.mall.collect.CollectGoodsFragment.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$f r3 = r2.a
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment r3 = r3.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.N(r3)
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$f r0 = r2.a
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r0.a
                    java.util.List r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.O(r0)
                    int r0 = r0.size()
                    r1 = 0
                    r3.notifyItemRangeRemoved(r1, r0)
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment$f r3 = r2.a
                    com.bxkj.student.life.mall.collect.CollectGoodsFragment r3 = r3.a
                    java.util.List r3 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.O(r3)
                    r3.clear()
                    return
            }
        }

        f(com.bxkj.student.life.mall.collect.CollectGoodsFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.life.mall.collect.CollectGoodsFragment r0 = r3.a
                android.content.Context r0 = com.bxkj.student.life.mall.collect.CollectGoodsFragment.Y(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<w.g> r1 = w.g.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                w.g r1 = (w.g) r1
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getOpenId()
                rx.e r1 = r1.C(r2)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.mall.collect.CollectGoodsFragment$f$a r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$f$a
                r1.<init>(r3)
                r0.setDataListener(r1)
                return
        }
    }

    public CollectGoodsFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1036n = r0
            r0 = 1
            r1.f1038p = r0
            r0 = 15
            r1.f1039q = r0
            r0 = 0
            r1.f1040r = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1035m
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List O(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1036n
            return r0
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            int r0 = r0.f1038p
            return r0
    }

    static /* bridge */ /* synthetic */ int Q(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            int r0 = r0.f1039q
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout R(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ int S(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            int r0 = r0.f1040r
            return r0
    }

    static /* bridge */ /* synthetic */ void T(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0, java.lang.String r1) {
            r0.f1041s = r1
            return
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0, int r1) {
            r0.f1038p = r1
            return
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0, int r1) {
            r0.f1040r = r1
            return
    }

    static /* bridge */ /* synthetic */ void W(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            r0.a0()
            return
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Y(com.bxkj.student.life.mall.collect.CollectGoodsFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void a0() {
            r6 = this;
            android.content.Context r0 = r6.g
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r6.f1041s
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getOpenId()
            int r4 = r6.f1038p
            int r5 = r6.f1039q
            rx.e r1 = r1.o(r2, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.collect.CollectGoodsFragment$e r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$e
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void b0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.k
            com.bxkj.student.life.mall.collect.CollectGoodsFragment$d r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$d
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void Z() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.g
            r0.<init>(r1)
            java.lang.String r1 = "确定要清空所有商品吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.life.mall.collect.CollectGoodsFragment$f r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$f
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    public void b() {
            r2 = this;
            androidx.appcompat.widget.SearchView r0 = r2.j
            com.bxkj.student.life.mall.collect.CollectGoodsFragment$b r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$b
            r1.<init>(r2)
            r0.setOnQueryTextListener(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1035m
            com.bxkj.student.life.mall.collect.CollectGoodsFragment$c r1 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$c
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    public void e() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f1034l
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
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.f1034l
            r1.setLayoutAnimation(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f1034l
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.g
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            com.bxkj.student.life.mall.collect.CollectGoodsFragment$a r0 = new com.bxkj.student.life.mall.collect.CollectGoodsFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493240(0x7f0c0178, float:1.8609955E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1036n
            r0.<init>(r4, r1, r2, r3)
            r4.f1035m = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.f1034l
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f1034l
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.c(r1)
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.k
            r0.D()
            r4.b0()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.c(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.k = r1
            r1 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.f1034l = r1
            r1 = 2131298492(0x7f0908bc, float:1.8214959E38)
            android.view.View r1 = r0.c(r1)
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r0.j = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493023(0x7f0c009f, float:1.8609514E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

package com.bxkj.student.life.secondhand;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyBuyGoodsActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private int G0;
    private int H0;
    private int I0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private com.google.android.material.floatingactionbutton.FloatingActionButton a0;
    private com.google.android.material.floatingactionbutton.FloatingActionButton b0;
    private com.google.android.material.floatingactionbutton.FloatingActionButton c0;

    /* renamed from: k0, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.FloatingActionButton f1059k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1060p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.secondhand.MyBuyGoodsActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.secondhand.MyBuyGoodsActivity$a$a, reason: collision with other inner class name */
        class C0126a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
            final /* synthetic */ com.bxkj.student.life.secondhand.MyBuyGoodsActivity.a e;

            C0126a(com.bxkj.student.life.secondhand.MyBuyGoodsActivity.a r1, android.content.Context r2, int r3, java.util.List r4) {
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

        a(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                r0 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r1 = 1
                r5.N(r0, r1)
                java.lang.String r2 = "status"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r5.J(r0, r2)
                java.lang.String r0 = "description"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r2 = 2131298946(0x7f090a82, float:1.821588E38)
                r5.J(r2, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "时间："
                r0.append(r2)
                java.lang.String r2 = "publishTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 2131299158(0x7f090b56, float:1.821631E38)
                r5.J(r2, r0)
                java.lang.String r0 = "buyOrSell"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                if (r2 != r1) goto L44
                java.lang.String r2 = "卖"
                goto L46
            L44:
                java.lang.String r2 = "买"
            L46:
                r3 = 2131298821(0x7f090a05, float:1.8215626E38)
                r5.J(r3, r2)
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                if (r0 != r1) goto L5c
                android.content.Context r0 = r4.e
                r1 = 2131099719(0x7f060047, float:1.78118E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
                goto L65
            L5c:
                android.content.Context r0 = r4.e
                r1 = 2131099714(0x7f060042, float:1.781179E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            L65:
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
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity$a$a r0 = new com.bxkj.student.life.secondhand.MyBuyGoodsActivity$a$a
                android.content.Context r1 = r4.e
                r2 = 2131493280(0x7f0c01a0, float:1.8610036E38)
                r0.<init>(r4, r1, r2, r6)
                r5.setAdapter(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.secondhand.MyBuyGoodsActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ int a;
            final /* synthetic */ com.bxkj.student.life.secondhand.MyBuyGoodsActivity.b b;

            a(com.bxkj.student.life.secondhand.MyBuyGoodsActivity.b r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r4 = this;
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b r0 = r4.b
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r0.a
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b r2 = r4.b
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.p0(r2)
                    java.lang.Class<com.bxkj.student.life.secondhand.BuyDetailActivity> r3 = com.bxkj.student.life.secondhand.BuyDetailActivity.class
                    r1.<init>(r2, r3)
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b r2 = r4.b
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.g0(r2)
                    int r3 = r4.a
                    java.lang.Object r2 = r2.getItem(r3)
                    java.util.Map r2 = (java.util.Map) r2
                    java.lang.String r3 = "id"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                    java.lang.String r3 = "noticeId"
                    android.content.Intent r1 = r1.putExtra(r3, r2)
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b r2 = r4.b
                    com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.g0(r2)
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

        b(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.base.auth.a r1 = new com.bxkj.base.auth.a
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.q0(r2)
                r1.<init>(r2)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b$a r2 = new com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b$a
                r2.<init>(r0, r4)
                com.bxkj.base.auth.a r1 = r1.i(r2)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r0.a
                androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
                r3 = 1
                r1.b(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.life.secondhand.MyBuyGoodsActivity a;

        c(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r4 = r3.a
                int r4 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.l0(r4)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r3.a
                int r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r3.a
                int r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.i0(r0)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r1 = r3.a
                int r1 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.l0(r1)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r3.a
                int r2 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r4)
                r4.q0()
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r4 = r3.a
                int r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.i0(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity.m0(r4, r0)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r4 = r3.a
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity.o0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity.m0(r2, r0)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r2 = r1.a
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity.o0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.secondhand.MyBuyGoodsActivity a;

        d(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.k0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity.n0(r0, r1)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r2.a
                int r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.i0(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.h0(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.h0(r0)
                r0.addAll(r3)
                com.bxkj.student.life.secondhand.MyBuyGoodsActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.secondhand.MyBuyGoodsActivity.g0(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public MyBuyGoodsActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F0 = r0
            r0 = 1
            r1.G0 = r0
            r0 = 10
            r1.H0 = r0
            r0 = 0
            r1.I0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1060p0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            int r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout k0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int l0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            int r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0, int r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0, int r1) {
            r0.I0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            r0.r0()
            return
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.life.secondhand.MyBuyGoodsActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void r0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.i> r1 = w.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.i r1 = (w.i) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            int r3 = r5.G0
            int r4 = r5.H0
            rx.e r1 = r1.c(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.secondhand.MyBuyGoodsActivity$d r1 = new com.bxkj.student.life.secondhand.MyBuyGoodsActivity$d
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void s0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.life.secondhand.MyBuyGoodsActivity$c r1 = new com.bxkj.student.life.secondhand.MyBuyGoodsActivity$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1060p0
            com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b r1 = new com.bxkj.student.life.secondhand.MyBuyGoodsActivity$b
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493193(0x7f0c0149, float:1.860986E38)
            return r0
    }

    public void R() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
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
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.V
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            com.bxkj.student.life.secondhand.MyBuyGoodsActivity$a r0 = new com.bxkj.student.life.secondhand.MyBuyGoodsActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493321(0x7f0c01c9, float:1.8610119E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.F0
            r0.<init>(r4, r1, r2, r3)
            r4.f1060p0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            r4.s0()
            r4.t0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的发布"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            r2 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.Z = r2
            r2 = 2131296965(0x7f0902c5, float:1.8211862E38)
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r1.a0 = r2
            r2 = 2131296966(0x7f0902c6, float:1.8211864E38)
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r1.b0 = r2
            r2 = 2131296968(0x7f0902c8, float:1.8211868E38)
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r1.c0 = r2
            r2 = 2131296967(0x7f0902c7, float:1.8211866E38)
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r1.f1059k0 = r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r1.a0
            r0 = 8
            r2.setVisibility(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r1.b0
            r2.setVisibility(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r1.c0
            r2.setVisibility(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r1.f1059k0
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            r1.getId()
            return
    }

    public void t0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.Y
            r0.D()
            return
    }
}

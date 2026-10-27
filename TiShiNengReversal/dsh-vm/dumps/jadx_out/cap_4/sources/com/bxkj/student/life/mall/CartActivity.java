package com.bxkj.student.life.mall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CartActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private java.util.Map<java.lang.String, java.lang.Object> H0;
    private java.lang.String I0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f1009k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.CheckBox f1010p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity a;

        a(com.bxkj.student.life.mall.CartActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r2 = this;
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                java.lang.String r0 = com.bxkj.student.life.mall.CartActivity.l0(r0)
                java.lang.String r1 = "编辑"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3e
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                java.lang.String r1 = "完成"
                com.bxkj.student.life.mall.CartActivity.q0(r0, r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.CartActivity.n0(r0)
                r1 = 8
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.CartActivity.m0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.CartActivity.o0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.Button r0 = com.bxkj.student.life.mall.CartActivity.h0(r0)
                java.lang.String r1 = "删除"
                r0.setText(r1)
                goto L6a
            L3e:
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                com.bxkj.student.life.mall.CartActivity.q0(r0, r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.CartActivity.n0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.CartActivity.m0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.CartActivity.o0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                android.widget.Button r0 = com.bxkj.student.life.mall.CartActivity.h0(r0)
                java.lang.String r1 = "结算"
                r0.setText(r1)
            L6a:
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                com.bxkj.student.life.mall.CartActivity.v0(r0)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                r0.invalidateOptionsMenu()
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.life.mall.CartActivity.g0(r0)
                r0.notifyDataSetChanged()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.student.common.view.NumberButton.OnWarnListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ java.util.Map b;
            final /* synthetic */ com.bxkj.student.life.mall.CartActivity.b c;

            a(com.bxkj.student.life.mall.CartActivity.b r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.student.common.view.NumberButton.OnWarnListener
            public void onNumberChanged(int r5) {
                    r4 = this;
                    com.bxkj.student.life.mall.CartActivity$b r0 = r4.c
                    com.bxkj.student.life.mall.CartActivity r0 = r0.k
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r4.a
                    int r1 = r1.f()
                    java.util.Map r2 = r4.b
                    java.lang.String r3 = "id"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    com.bxkj.student.life.mall.CartActivity.s0(r0, r1, r2, r5)
                    return
            }

            @Override // com.bxkj.student.common.view.NumberButton.OnWarnListener
            public void onWarningForBuyMax(int r1) {
                    r0 = this;
                    return
            }

            @Override // com.bxkj.student.common.view.NumberButton.OnWarnListener
            public void onWarningForInventory(int r1) {
                    r0 = this;
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.CartActivity$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0109b implements android.view.View.OnClickListener {
            final /* synthetic */ java.lang.String a;
            final /* synthetic */ boolean b;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder c;
            final /* synthetic */ com.bxkj.student.life.mall.CartActivity.b d;

            ViewOnClickListenerC0109b(com.bxkj.student.life.mall.CartActivity.b r1, java.lang.String r2, boolean r3, cn.bluemobi.dylan.base.adapter.common.ViewHolder r4) {
                    r0 = this;
                    r0.d = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.CartActivity$b r3 = r2.d
                    com.bxkj.student.life.mall.CartActivity r3 = r3.k
                    java.util.Map r3 = com.bxkj.student.life.mall.CartActivity.i0(r3)
                    java.lang.String r0 = r2.a
                    boolean r1 = r2.b
                    r1 = r1 ^ 1
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r3.put(r0, r1)
                    com.bxkj.student.life.mall.CartActivity$b r3 = r2.d
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r2.c
                    int r0 = r0.f()
                    r3.notifyItemChanged(r0)
                    com.bxkj.student.life.mall.CartActivity$b r3 = r2.d
                    com.bxkj.student.life.mall.CartActivity r3 = r3.k
                    com.bxkj.student.life.mall.CartActivity.r0(r3)
                    return
            }
        }

        b(com.bxkj.student.life.mall.CartActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                java.lang.String r0 = "showImg"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r1 = 2131689819(0x7f0f015b, float:1.9008664E38)
                r2 = 2131297207(0x7f0903b7, float:1.8212352E38)
                r7.t(r2, r0, r1, r1)
                java.lang.String r0 = "downState"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                java.lang.String r1 = "1"
                boolean r0 = r1.equals(r0)
                r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
                r2 = 2131298986(0x7f090aaa, float:1.821596E38)
                if (r0 == 0) goto L39
                com.bxkj.student.life.mall.CartActivity r0 = r6.k
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131099732(0x7f060054, float:1.7811826E38)
                int r0 = r0.getColor(r3)
                r7.K(r2, r0)
                java.lang.String r0 = "该商品已下架"
                r7.J(r1, r0)
                goto L63
            L39:
                com.bxkj.student.life.mall.CartActivity r0 = r6.k
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131099731(0x7f060053, float:1.7811823E38)
                int r0 = r0.getColor(r3)
                r7.K(r2, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "￥"
                r0.append(r3)
                java.lang.String r3 = "commPrize"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getMoney(r8, r3)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r7.J(r1, r0)
            L63:
                java.lang.String r0 = "commName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r7.J(r2, r0)
                java.lang.String r0 = "modelName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r1 = 2131298978(0x7f090aa2, float:1.8215944E38)
                r7.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "x"
                r0.append(r1)
                java.lang.String r1 = "commNum"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 2131298848(0x7f090a20, float:1.821568E38)
                r7.J(r2, r0)
                com.bxkj.student.life.mall.CartActivity r0 = r6.k
                java.lang.String r0 = com.bxkj.student.life.mall.CartActivity.l0(r0)
                java.lang.String r3 = "编辑"
                boolean r0 = r0.equals(r3)
                r3 = 1
                r4 = 0
                r5 = 2131298253(0x7f0907cd, float:1.8214474E38)
                if (r0 == 0) goto Laf
                r7.N(r2, r3)
                r7.N(r5, r4)
                goto Lb5
            Laf:
                r7.N(r2, r4)
                r7.N(r5, r3)
            Lb5:
                android.view.View r0 = r7.h(r5)
                com.bxkj.student.common.view.NumberButton r0 = (com.bxkj.student.common.view.NumberButton) r0
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r1)
                r0.setCurrentNumber(r1)
                com.bxkj.student.life.mall.CartActivity$b$a r1 = new com.bxkj.student.life.mall.CartActivity$b$a
                r1.<init>(r6, r7, r8)
                r0.setOnWarnListener(r1)
                java.lang.String r0 = "id"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                com.bxkj.student.life.mall.CartActivity r0 = r6.k
                java.util.Map r0 = com.bxkj.student.life.mall.CartActivity.i0(r0)
                boolean r0 = r0.containsKey(r8)
                if (r0 == 0) goto Le6
                com.bxkj.student.life.mall.CartActivity r0 = r6.k
                java.util.Map r0 = com.bxkj.student.life.mall.CartActivity.i0(r0)
                boolean r4 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r8)
            Le6:
                r0 = 2131296718(0x7f0901ce, float:1.821136E38)
                r7.m(r0, r4)
                com.bxkj.student.life.mall.CartActivity$b$b r1 = new com.bxkj.student.life.mall.CartActivity$b$b
                r1.<init>(r6, r8, r4, r7)
                r7.w(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity a;

        c(com.bxkj.student.life.mall.CartActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r1) {
                r0 = this;
                return
        }

        public void n(l2.h r1) {
                r0 = this;
                com.bxkj.student.life.mall.CartActivity r1 = r0.a
                com.bxkj.student.life.mall.CartActivity.t0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity a;

        d(com.bxkj.student.life.mall.CartActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.life.mall.CartActivity r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.life.mall.CartActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.student.life.mall.CartActivity.w0(r4)
                java.lang.Class<com.bxkj.student.life.mall.GoodsDetailActivity> r0 = com.bxkj.student.life.mall.GoodsDetailActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.life.mall.CartActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.life.mall.CartActivity.g0(r4)
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
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity a;

        e(com.bxkj.student.life.mall.CartActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.CartActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.CartActivity.k0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.CartActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.CartActivity.k0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.CartActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.CartActivity.k0(r0)
                r0.w0()
            L20:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.life.mall.CartActivity.p0(r0, r3)
                com.bxkj.student.life.mall.CartActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.CartActivity.g0(r3)
                com.bxkj.student.life.mall.CartActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.CartActivity.j0(r0)
                r3.g(r0)
                com.bxkj.student.life.mall.CartActivity r3 = r2.a
                com.bxkj.student.life.mall.CartActivity.u0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity c;

        f(com.bxkj.student.life.mall.CartActivity r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.CartActivity r3 = r2.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.CartActivity.g0(r3)
                int r0 = r2.a
                java.lang.Object r3 = r3.getItem(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "commNum"
                java.lang.String r1 = r2.b
                r3.put(r0, r1)
                com.bxkj.student.life.mall.CartActivity r3 = r2.c
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.CartActivity.g0(r3)
                int r0 = r2.a
                r3.notifyItemChanged(r0)
                com.bxkj.student.life.mall.CartActivity r3 = r2.c
                com.bxkj.student.life.mall.CartActivity.u0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity a;

        g(com.bxkj.student.life.mall.CartActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                r5 = 0
                r0 = 0
            L2:
                com.bxkj.student.life.mall.CartActivity r1 = r4.a
                java.util.List r1 = com.bxkj.student.life.mall.CartActivity.j0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L51
                com.bxkj.student.life.mall.CartActivity r1 = r4.a
                java.util.List r1 = com.bxkj.student.life.mall.CartActivity.j0(r1)
                java.lang.Object r1 = r1.get(r0)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r2 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                com.bxkj.student.life.mall.CartActivity r3 = r4.a
                java.util.Map r3 = com.bxkj.student.life.mall.CartActivity.i0(r3)
                boolean r3 = r3.containsKey(r2)
                if (r3 == 0) goto L37
                com.bxkj.student.life.mall.CartActivity r3 = r4.a
                java.util.Map r3 = com.bxkj.student.life.mall.CartActivity.i0(r3)
                boolean r2 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r2)
                goto L38
            L37:
                r2 = 0
            L38:
                if (r2 == 0) goto L4e
                com.bxkj.student.life.mall.CartActivity r2 = r4.a
                java.util.List r2 = com.bxkj.student.life.mall.CartActivity.j0(r2)
                r2.remove(r1)
                com.bxkj.student.life.mall.CartActivity r1 = r4.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.life.mall.CartActivity.g0(r1)
                r1.notifyItemRemoved(r0)
                int r0 = r0 + (-1)
            L4e:
                int r0 = r0 + 1
                goto L2
            L51:
                cn.bluemobi.dylan.base.utils.a r5 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.life.mall.GoodsListFragment> r0 = com.bxkj.student.life.mall.GoodsListFragment.class
                androidx.fragment.app.Fragment r5 = r5.o(r0)
                com.bxkj.student.life.mall.GoodsListFragment r5 = (com.bxkj.student.life.mall.GoodsListFragment) r5
                if (r5 == 0) goto L62
                r5.f0()
            L62:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.CartActivity a;

        h(com.bxkj.student.life.mall.CartActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.life.mall.CartActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.life.mall.CartActivity.x0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                com.bxkj.student.life.mall.CartActivity r2 = r1.a
                com.bxkj.student.life.mall.CartActivity.t0(r2)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r7) {
                r6 = this;
                java.lang.String r0 = "ids"
                java.lang.String r1 = "postFee"
                java.lang.String r2 = "address"
                java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Exception -> L67
                r4 = 3
                r3.<init>(r4)     // Catch: java.lang.Exception -> L67
                java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Exception -> L67
                r5.<init>(r4)     // Catch: java.lang.Exception -> L67
                java.util.Map r4 = cn.bluemobi.dylan.http.JsonParse.getMap(r7, r2)     // Catch: java.lang.Exception -> L67
                r5.putAll(r4)     // Catch: java.lang.Exception -> L67
                r3.put(r2, r5)     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "goodsList"
                java.lang.String r4 = "comms"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r4)     // Catch: java.lang.Exception -> L67
                r3.put(r2, r4)     // Catch: java.lang.Exception -> L67
                double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r1)     // Catch: java.lang.Exception -> L67
                java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Exception -> L67
                r3.put(r1, r2)     // Catch: java.lang.Exception -> L67
                java.lang.String r1 = "goodsPrice"
                java.lang.String r2 = "totalPrize"
                double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r2)     // Catch: java.lang.Exception -> L67
                java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Exception -> L67
                r3.put(r1, r2)     // Catch: java.lang.Exception -> L67
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)     // Catch: java.lang.Exception -> L67
                r3.put(r0, r7)     // Catch: java.lang.Exception -> L67
                cn.bluemobi.dylan.base.utils.SeralizableMap r7 = new cn.bluemobi.dylan.base.utils.SeralizableMap     // Catch: java.lang.Exception -> L67
                r7.<init>()     // Catch: java.lang.Exception -> L67
                r7.setMap(r3)     // Catch: java.lang.Exception -> L67
                com.bxkj.student.life.mall.CartActivity r0 = r6.a     // Catch: java.lang.Exception -> L67
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L67
                com.bxkj.student.life.mall.CartActivity r2 = r6.a     // Catch: java.lang.Exception -> L67
                android.content.Context r2 = com.bxkj.student.life.mall.CartActivity.y0(r2)     // Catch: java.lang.Exception -> L67
                java.lang.Class<com.bxkj.student.life.mall.order.ConfirmOrderActivity> r3 = com.bxkj.student.life.mall.order.ConfirmOrderActivity.class
                r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "map"
                android.content.Intent r7 = r1.putExtra(r2, r7)     // Catch: java.lang.Exception -> L67
                r0.startActivity(r7)     // Catch: java.lang.Exception -> L67
            L67:
                return
        }
    }

    public CartActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.G0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.H0 = r0
            java.lang.String r0 = "编辑"
            r1.I0 = r0
            return
    }

    private void A0() {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.G0
            int r3 = r3.size()
            if (r1 >= r3) goto L30
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.G0
            java.lang.Object r3 = r3.get(r1)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "id"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.H0
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L28
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.H0
            boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r4, r3)
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 == 0) goto L2d
            int r2 = r2 + 1
        L2d:
            int r1 = r1 + 1
            goto L3
        L30:
            android.widget.CheckBox r1 = r5.f1010p0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.G0
            int r3 = r3.size()
            if (r2 != r3) goto L3b
            r0 = 1
        L3b:
            r1.setChecked(r0)
            r5.D0()
            return
    }

    private void B0(int r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = "id"
            r1.put(r2, r5)
            java.lang.String r5 = "commNum"
            r1.put(r5, r6)
            r0.add(r1)
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r0)
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            rx.e r5 = r1.v(r5)
            cn.bluemobi.dylan.http.HttpRequest r5 = r0.setObservable(r5)
            com.bxkj.student.life.mall.CartActivity$f r0 = new com.bxkj.student.life.mall.CartActivity$f
            r0.<init>(r3, r4, r6)
            r5.setDataListener(r0)
            return
    }

    private void C0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r1 = r1.E(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.CartActivity$e r1 = new com.bxkj.student.life.mall.CartActivity$e
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void D0() {
            r7 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 0
            r0.<init>(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r7.G0
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "id"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.H0
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L2d
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.H0
            boolean r4 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r5, r4)
            goto L2e
        L2d:
            r4 = 0
        L2e:
            if (r4 == 0) goto Lc
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.lang.String r5 = "commPrize"
            double r5 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r5)
            r4.<init>(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            java.lang.String r6 = "commNum"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r6)
            r5.<init>(r3)
            java.math.BigDecimal r3 = r4.multiply(r5)
            java.math.BigDecimal r0 = r0.add(r3)
            goto Lc
        L4f:
            android.widget.TextView r1 = r7.c0
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            java.lang.String r3 = "0.00"
            r2.<init>(r3)
            r3 = 2
            r4 = 4
            java.math.BigDecimal r0 = r0.setScale(r3, r4)
            java.lang.String r0 = r2.format(r0)
            r1.setText(r0)
            return
    }

    private void F0() {
            r2 = this;
            java.lang.String r0 = r2.I0
            com.bxkj.student.life.mall.CartActivity$a r1 = new com.bxkj.student.life.mall.CartActivity$a
            r1.<init>(r2)
            r2.b0(r0, r1)
            return
    }

    private void G0() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.G0
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.H0
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.H0
            boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r2)
            goto L2d
        L2c:
            r3 = 0
        L2d:
            if (r3 == 0) goto Lb
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L38
            java.lang.String r3 = ""
            goto L3a
        L38:
            java.lang.String r3 = ","
        L3a:
            r0.append(r3)
            r0.append(r2)
            goto Lb
        L41:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4d
            java.lang.String r0 = "请选择商品进行结算"
            r4.f0(r0)
            return
        L4d:
            android.content.Context r1 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideOtherStatusMessage()
            java.lang.Class<w.g> r2 = w.g.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.g r2 = (w.g) r2
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getOpenId()
            java.lang.String r0 = r0.toString()
            rx.e r0 = r2.p(r3, r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.life.mall.CartActivity$h r1 = new com.bxkj.student.life.mall.CartActivity$h
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void delete() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.G0
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.H0
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.H0
            boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r2)
            goto L2d
        L2c:
            r3 = 0
        L2d:
            if (r3 == 0) goto Lb
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L38
            java.lang.String r3 = ""
            goto L3a
        L38:
            java.lang.String r3 = ","
        L3a:
            r0.append(r3)
            r0.append(r2)
            goto Lb
        L41:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4d
            java.lang.String r0 = "请选择商品进行删除"
            r4.f0(r0)
            return
        L4d:
            android.content.Context r1 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.Class<w.g> r2 = w.g.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.g r2 = (w.g) r2
            java.lang.String r0 = r0.toString()
            rx.e r0 = r2.w(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.life.mall.CartActivity$g r1 = new com.bxkj.student.life.mall.CartActivity$g
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.mall.CartActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button h0(com.bxkj.student.life.mall.CartActivity r0) {
            android.widget.Button r0 = r0.f1009k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map i0(com.bxkj.student.life.mall.CartActivity r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.life.mall.CartActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout k0(com.bxkj.student.life.mall.CartActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String l0(com.bxkj.student.life.mall.CartActivity r0) {
            java.lang.String r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.life.mall.CartActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.life.mall.CartActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.life.mall.CartActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.mall.CartActivity r0, java.util.List r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.mall.CartActivity r0, java.lang.String r1) {
            r0.I0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.life.mall.CartActivity r0) {
            r0.A0()
            return
    }

    static /* bridge */ /* synthetic */ void s0(com.bxkj.student.life.mall.CartActivity r0, int r1, java.lang.String r2, java.lang.String r3) {
            r0.B0(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void t0(com.bxkj.student.life.mall.CartActivity r0) {
            r0.C0()
            return
    }

    static /* bridge */ /* synthetic */ void u0(com.bxkj.student.life.mall.CartActivity r0) {
            r0.D0()
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.life.mall.CartActivity r0) {
            r0.F0()
            return
    }

    static /* synthetic */ android.content.Context w0(com.bxkj.student.life.mall.CartActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context x0(com.bxkj.student.life.mall.CartActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context y0(com.bxkj.student.life.mall.CartActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void z0() {
            r4 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.G0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "id"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.H0
            android.widget.CheckBox r3 = r4.f1010p0
            boolean r3 = r3.isChecked()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r3)
            goto L6
        L28:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.F0
            r0.notifyDataSetChanged()
            r4.D0()
            return
    }

    public void E0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.Y
            r0.D()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.f1009k0
            r0.setOnClickListener(r2)
            android.widget.CheckBox r0 = r2.f1010p0
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.F0
            com.bxkj.student.life.mall.CartActivity$d r1 = new com.bxkj.student.life.mall.CartActivity$d
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492913(0x7f0c0031, float:1.8609291E38)
            return r0
    }

    public void R() {
            r5 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r5.V
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setLayoutAnimation(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r2 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r3 = r5.V
            r4 = 1
            r2.<init>(r3, r4)
            r0.addItemDecoration(r2)
            com.bxkj.student.life.mall.CartActivity$b r0 = new com.bxkj.student.life.mall.CartActivity$b
            android.content.Context r2 = r5.V
            r3 = 2131493323(0x7f0c01cb, float:1.8610123E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.G0
            r0.<init>(r5, r2, r3, r4)
            r5.F0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            r2 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r2 = r5.findViewById(r2)
            r0.setEmptyView(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.S0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            com.bxkj.student.life.mall.CartActivity$c r1 = new com.bxkj.student.life.mall.CartActivity$c
            r1.<init>(r5)
            r0.m1(r1)
            r5.E0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "购物车"
            r1.setTitle(r0)
            r1.F0()
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            r1 = 2131298848(0x7f090a20, float:1.821568E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131298850(0x7f090a22, float:1.8215685E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.f1009k0 = r1
            r1 = 2131296718(0x7f0901ce, float:1.821136E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f1010p0 = r1
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296622(0x7f09016e, float:1.8211166E38)
            if (r2 == r0) goto L13
            r0 = 2131296718(0x7f0901ce, float:1.821136E38)
            if (r2 == r0) goto Lf
            return
        Lf:
            r1.z0()
            return
        L13:
            android.widget.Button r2 = r1.f1009k0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "删除"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2d
            r1.delete()
            return
        L2d:
            r1.G0()
            return
    }
}

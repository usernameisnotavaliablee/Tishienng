package com.bxkj.student.life.mall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class GoodsDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout F0;
    private cn.bluemobi.dylan.base.view.CycleViewPager G0;
    private cn.bluemobi.dylan.smartwebview.SmartWebView H0;
    private android.widget.TextView I0;
    private android.widget.TextView J0;
    private android.widget.TextView K0;
    private android.widget.TextView L0;
    private android.widget.TextView M0;
    private android.widget.TextView N0;
    private android.widget.TextView O0;
    private android.widget.TextView P0;
    private android.widget.TextView Q0;
    private android.widget.TextView R0;
    private android.widget.TextView S0;
    private android.widget.TextView T0;
    private android.widget.Button U0;
    private android.widget.Button V0;
    private android.widget.Button W0;
    private java.lang.String X0;
    private com.google.android.material.floatingactionbutton.FloatingActionButton Y;
    private java.util.Map<java.lang.String, java.lang.Object> Y0;
    private android.widget.RelativeLayout Z;
    private java.util.List<java.lang.String> Z0;
    private android.widget.LinearLayout a0;
    private android.widget.LinearLayout b0;
    private com.bxkj.student.common.view.SlideDetailsLayout c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.ScrollView f1011k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.ScrollView f1012p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.zhy.view.flowlayout.b<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.zhy.view.flowlayout.TagFlowLayout d;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity e;

        a(com.bxkj.student.life.mall.GoodsDetailActivity r1, java.util.List r2, com.zhy.view.flowlayout.TagFlowLayout r3) {
                r0 = this;
                r0.e = r1
                r0.d = r3
                r0.<init>(r2)
                return
        }

        public /* bridge */ /* synthetic */ android.view.View d(com.zhy.view.flowlayout.FlowLayout r1, int r2, java.lang.Object r3) {
                r0 = this;
                java.util.Map r3 = (java.util.Map) r3
                android.view.View r1 = r0.j(r1, r2, r3)
                return r1
        }

        public android.view.View j(com.zhy.view.flowlayout.FlowLayout r3, int r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
                r2 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.e
                android.content.Context r3 = com.bxkj.student.life.mall.GoodsDetailActivity.B0(r3)
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                com.zhy.view.flowlayout.TagFlowLayout r4 = r2.d
                r0 = 0
                r1 = 2131493341(0x7f0c01dd, float:1.861016E38)
                android.view.View r3 = r3.inflate(r1, r4, r0)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.String r4 = "modelName"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r4)
                r3.setText(r4)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.zhy.view.flowlayout.TagFlowLayout.a {
        final /* synthetic */ android.widget.TextView a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.zhy.view.flowlayout.b c;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity d;

        b(com.bxkj.student.life.mall.GoodsDetailActivity r1, android.widget.TextView r2, java.lang.String r3, com.zhy.view.flowlayout.b r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void a(java.util.Set<java.lang.Integer> r4) {
                r3 = this;
                if (r4 == 0) goto L3c
                int r0 = r4.size()
                if (r0 != 0) goto L9
                goto L3c
            L9:
                android.widget.TextView r0 = r3.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "库存："
                r1.append(r2)
                com.zhy.view.flowlayout.b r2 = r3.c
                java.util.Iterator r4 = r4.iterator()
                java.lang.Object r4 = r4.next()
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                java.lang.Object r4 = r2.b(r4)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r2 = "branchStock"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                return
            L3c:
                android.widget.TextView r4 = r3.a
                java.lang.String r0 = r3.b
                r4.setText(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bxkj.student.common.view.NumberButton.OnWarnListener {
        final /* synthetic */ android.widget.TextView a;
        final /* synthetic */ double b;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity c;

        c(com.bxkj.student.life.mall.GoodsDetailActivity r1, android.widget.TextView r2, double r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.view.NumberButton.OnWarnListener
        public void onNumberChanged(int r8) {
                r7 = this;
                android.widget.TextView r0 = r7.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "共"
                r1.append(r2)
                r1.append(r8)
                java.lang.String r2 = "件￥"
                r1.append(r2)
                java.text.DecimalFormat r2 = new java.text.DecimalFormat
                java.lang.String r3 = "0.00"
                r2.<init>(r3)
                double r3 = r7.b
                double r5 = (double) r8
                double r3 = r3 * r5
                java.lang.String r8 = r2.format(r3)
                r1.append(r8)
                java.lang.String r8 = "元"
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.setText(r8)
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
    class d implements android.view.View.OnClickListener {
        final /* synthetic */ com.zhy.view.flowlayout.TagFlowLayout a;
        final /* synthetic */ com.bxkj.student.common.view.NumberButton b;
        final /* synthetic */ com.zhy.view.flowlayout.b c;
        final /* synthetic */ android.app.Dialog d;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity.d a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.mall.GoodsDetailActivity$d$a$a, reason: collision with other inner class name */
            class C0110a extends cn.bluemobi.dylan.http.HttpCallBack {
                final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity.d.a a;

                C0110a(com.bxkj.student.life.mall.GoodsDetailActivity.d.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                        r4 = this;
                        com.bxkj.student.life.mall.GoodsDetailActivity$d$a r0 = r4.a
                        com.bxkj.student.life.mall.GoodsDetailActivity$d r0 = r0.a
                        android.app.Dialog r0 = r0.d
                        r0.dismiss()
                        java.util.HashMap r0 = new java.util.HashMap
                        r1 = 3
                        r0.<init>(r1)
                        java.util.HashMap r2 = new java.util.HashMap
                        r2.<init>(r1)
                        java.lang.String r1 = "address"
                        java.util.Map r3 = cn.bluemobi.dylan.http.JsonParse.getMap(r5, r1)
                        r2.putAll(r3)
                        r0.put(r1, r2)
                        java.lang.String r1 = "comms"
                        java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r5, r1)
                        java.lang.String r2 = "goodsList"
                        r0.put(r2, r1)
                        java.lang.String r1 = "postFee"
                        double r2 = cn.bluemobi.dylan.http.JsonParse.getDouble(r5, r1)
                        java.lang.Double r2 = java.lang.Double.valueOf(r2)
                        r0.put(r1, r2)
                        java.lang.String r1 = "totalPrize"
                        double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r5, r1)
                        java.lang.Double r5 = java.lang.Double.valueOf(r1)
                        java.lang.String r1 = "goodsPrice"
                        r0.put(r1, r5)
                        cn.bluemobi.dylan.base.utils.SeralizableMap r5 = new cn.bluemobi.dylan.base.utils.SeralizableMap
                        r5.<init>()
                        r5.setMap(r0)
                        com.bxkj.student.life.mall.GoodsDetailActivity$d$a r0 = r4.a
                        com.bxkj.student.life.mall.GoodsDetailActivity$d r0 = r0.a
                        com.bxkj.student.life.mall.GoodsDetailActivity r0 = r0.e
                        android.content.Intent r1 = new android.content.Intent
                        com.bxkj.student.life.mall.GoodsDetailActivity$d$a r2 = r4.a
                        com.bxkj.student.life.mall.GoodsDetailActivity$d r2 = r2.a
                        com.bxkj.student.life.mall.GoodsDetailActivity r2 = r2.e
                        android.content.Context r2 = com.bxkj.student.life.mall.GoodsDetailActivity.C0(r2)
                        java.lang.Class<com.bxkj.student.life.mall.order.ConfirmOrderActivity> r3 = com.bxkj.student.life.mall.order.ConfirmOrderActivity.class
                        r1.<init>(r2, r3)
                        java.lang.String r2 = "map"
                        android.content.Intent r5 = r1.putExtra(r2, r5)
                        r0.startActivity(r5)
                        return
                }
            }

            a(com.bxkj.student.life.mall.GoodsDetailActivity.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r6 = this;
                    com.bxkj.student.life.mall.GoodsDetailActivity$d r0 = r6.a
                    com.zhy.view.flowlayout.b r1 = r0.c
                    com.zhy.view.flowlayout.TagFlowLayout r0 = r0.a
                    java.util.Set r0 = r0.getSelectedList()
                    java.util.Iterator r0 = r0.iterator()
                    java.lang.Object r0 = r0.next()
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    java.lang.Object r0 = r1.b(r0)
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.String r1 = "id"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                    com.bxkj.student.life.mall.GoodsDetailActivity$d r1 = r6.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r1 = r1.e
                    android.content.Context r1 = com.bxkj.student.life.mall.GoodsDetailActivity.D0(r1)
                    cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
                    java.lang.Class<w.g> r2 = w.g.class
                    java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
                    w.g r2 = (w.g) r2
                    com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r3 = r3.getOpenId()
                    com.bxkj.student.life.mall.GoodsDetailActivity$d r4 = r6.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r4 = r4.e
                    java.lang.String r4 = com.bxkj.student.life.mall.GoodsDetailActivity.h0(r4)
                    com.bxkj.student.life.mall.GoodsDetailActivity$d r5 = r6.a
                    com.bxkj.student.common.view.NumberButton r5 = r5.b
                    int r5 = r5.getNumber()
                    rx.e r0 = r2.g(r3, r4, r0, r5)
                    cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
                    com.bxkj.student.life.mall.GoodsDetailActivity$d$a$a r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$d$a$a
                    r1.<init>(r6)
                    r0.setDataListener(r1)
                    return
            }
        }

        d(com.bxkj.student.life.mall.GoodsDetailActivity r1, com.zhy.view.flowlayout.TagFlowLayout r2, com.bxkj.student.common.view.NumberButton r3, com.zhy.view.flowlayout.b r4, android.app.Dialog r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.zhy.view.flowlayout.TagFlowLayout r3 = r2.a
                java.util.Set r3 = r3.getSelectedList()
                if (r3 == 0) goto L44
                com.zhy.view.flowlayout.TagFlowLayout r3 = r2.a
                java.util.Set r3 = r3.getSelectedList()
                int r3 = r3.size()
                if (r3 > 0) goto L15
                goto L44
            L15:
                com.bxkj.student.common.view.NumberButton r3 = r2.b
                int r3 = r3.getNumber()
                if (r3 > 0) goto L25
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.e
                java.lang.String r0 = "请选择商品数量"
                r3.f0(r0)
                return
            L25:
                com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.e
                android.content.Context r0 = com.bxkj.student.life.mall.GoodsDetailActivity.E0(r0)
                r3.<init>(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity$d$a r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$d$a
                r0.<init>(r2)
                com.bxkj.base.auth.a r3 = r3.i(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.e
                androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
                r1 = 0
                r3.b(r0, r1)
                return
            L44:
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.e
                java.lang.String r0 = "请选择商品属性"
                r3.f0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements android.view.View.OnClickListener {
        final /* synthetic */ com.zhy.view.flowlayout.TagFlowLayout a;
        final /* synthetic */ com.bxkj.student.common.view.NumberButton b;
        final /* synthetic */ com.zhy.view.flowlayout.b c;
        final /* synthetic */ android.app.Dialog d;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bxkj.base.auth.a.g {
            final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity.e a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.mall.GoodsDetailActivity$e$a$a, reason: collision with other inner class name */
            class C0111a extends cn.bluemobi.dylan.http.HttpCallBack {
                final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity.e.a a;

                C0111a(com.bxkj.student.life.mall.GoodsDetailActivity.e.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                        r1 = this;
                        com.bxkj.student.life.mall.GoodsDetailActivity$e$a r2 = r1.a
                        com.bxkj.student.life.mall.GoodsDetailActivity$e r2 = r2.a
                        android.app.Dialog r2 = r2.d
                        r2.dismiss()
                        com.bxkj.student.life.mall.GoodsDetailActivity$e$a r2 = r1.a
                        com.bxkj.student.life.mall.GoodsDetailActivity$e r2 = r2.a
                        com.bxkj.student.life.mall.GoodsDetailActivity r2 = r2.e
                        java.lang.String r0 = "加入购物车成功"
                        r2.f0(r0)
                        cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                        java.lang.Class<com.bxkj.student.life.mall.GoodsListFragment> r0 = com.bxkj.student.life.mall.GoodsListFragment.class
                        androidx.fragment.app.Fragment r2 = r2.o(r0)
                        com.bxkj.student.life.mall.GoodsListFragment r2 = (com.bxkj.student.life.mall.GoodsListFragment) r2
                        if (r2 == 0) goto L25
                        r2.f0()
                    L25:
                        return
                }
            }

            a(com.bxkj.student.life.mall.GoodsDetailActivity.e r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bxkj.base.auth.a.g
            public void a() {
                    r6 = this;
                    com.bxkj.student.life.mall.GoodsDetailActivity$e r0 = r6.a
                    com.zhy.view.flowlayout.b r1 = r0.c
                    com.zhy.view.flowlayout.TagFlowLayout r0 = r0.a
                    java.util.Set r0 = r0.getSelectedList()
                    java.util.Iterator r0 = r0.iterator()
                    java.lang.Object r0 = r0.next()
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    java.lang.Object r0 = r1.b(r0)
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.String r1 = "id"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                    com.bxkj.student.life.mall.GoodsDetailActivity$e r1 = r6.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r1 = r1.e
                    android.content.Context r1 = com.bxkj.student.life.mall.GoodsDetailActivity.u0(r1)
                    cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
                    java.lang.Class<w.g> r2 = w.g.class
                    java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
                    w.g r2 = (w.g) r2
                    com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r3 = r3.getOpenId()
                    com.bxkj.student.life.mall.GoodsDetailActivity$e r4 = r6.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r4 = r4.e
                    java.lang.String r4 = com.bxkj.student.life.mall.GoodsDetailActivity.h0(r4)
                    com.bxkj.student.life.mall.GoodsDetailActivity$e r5 = r6.a
                    com.bxkj.student.common.view.NumberButton r5 = r5.b
                    int r5 = r5.getNumber()
                    rx.e r0 = r2.c(r3, r4, r0, r5)
                    cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
                    com.bxkj.student.life.mall.GoodsDetailActivity$e$a$a r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$e$a$a
                    r1.<init>(r6)
                    r0.setDataListener(r1)
                    return
            }
        }

        e(com.bxkj.student.life.mall.GoodsDetailActivity r1, com.zhy.view.flowlayout.TagFlowLayout r2, com.bxkj.student.common.view.NumberButton r3, com.zhy.view.flowlayout.b r4, android.app.Dialog r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.zhy.view.flowlayout.TagFlowLayout r3 = r2.a
                java.util.Set r3 = r3.getSelectedList()
                if (r3 == 0) goto L44
                com.zhy.view.flowlayout.TagFlowLayout r3 = r2.a
                java.util.Set r3 = r3.getSelectedList()
                int r3 = r3.size()
                if (r3 > 0) goto L15
                goto L44
            L15:
                com.bxkj.student.common.view.NumberButton r3 = r2.b
                int r3 = r3.getNumber()
                if (r3 > 0) goto L25
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.e
                java.lang.String r0 = "请选择商品数量"
                r3.f0(r0)
                return
            L25:
                com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.e
                android.content.Context r0 = com.bxkj.student.life.mall.GoodsDetailActivity.v0(r0)
                r3.<init>(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity$e$a r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$e$a
                r0.<init>(r2)
                com.bxkj.base.auth.a r3 = r3.i(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.e
                androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
                r1 = 0
                r3.b(r0, r1)
                return
            L44:
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.e
                java.lang.String r0 = "请选择商品属性"
                r3.f0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity e;

        f(com.bxkj.student.life.mall.GoodsDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "name"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "：\u3000"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299107(0x7f090b23, float:1.8216206E38)
                r3.J(r1, r0)
                java.lang.String r0 = "value"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299181(0x7f090b6d, float:1.8216356E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements android.view.View.OnClickListener {
        final /* synthetic */ android.app.Dialog a;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity b;

        g(com.bxkj.student.life.mall.GoodsDetailActivity r1, android.app.Dialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                android.app.Dialog r1 = r0.a
                if (r1 == 0) goto Lf
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto Lf
                android.app.Dialog r1 = r0.a
                r1.dismiss()
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity.h a;

            a(com.bxkj.student.life.mall.GoodsDetailActivity.h r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.GoodsDetailActivity$h r3 = r2.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r3 = r3.a
                    android.widget.TextView r0 = com.bxkj.student.life.mall.GoodsDetailActivity.l0(r3)
                    java.lang.CharSequence r0 = r0.getText()
                    java.lang.String r0 = r0.toString()
                    java.lang.String r0 = r0.trim()
                    java.lang.String r1 = "收藏"
                    boolean r0 = r1.equals(r0)
                    com.bxkj.student.life.mall.GoodsDetailActivity.p0(r3, r0)
                    return
            }
        }

        h(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r4.a
                android.content.Context r0 = com.bxkj.student.life.mall.GoodsDetailActivity.w0(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<w.g> r1 = w.g.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                w.g r1 = (w.g) r1
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r4.a
                java.lang.String r2 = com.bxkj.student.life.mall.GoodsDetailActivity.h0(r2)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getOpenId()
                rx.e r1 = r1.i(r2, r3)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.mall.GoodsDetailActivity$h$a r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$h$a
                r1.<init>(r4)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements com.bxkj.student.common.view.SlideDetailsLayout.OnSlideDetailsListener {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        i(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.view.SlideDetailsLayout.OnSlideDetailsListener
        public void onStatucChanged(com.bxkj.student.common.view.SlideDetailsLayout.Status r2) {
                r1 = this;
                com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
                if (r2 != r0) goto L18
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r1.a
                android.widget.ScrollView r2 = com.bxkj.student.life.mall.GoodsDetailActivity.j0(r2)
                r0 = 0
                r2.setVisibility(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r1.a
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = com.bxkj.student.life.mall.GoodsDetailActivity.g0(r2)
                r2.setVisibility(r0)
                return
            L18:
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r1.a
                android.widget.ScrollView r2 = com.bxkj.student.life.mall.GoodsDetailActivity.j0(r2)
                r0 = 8
                r2.setVisibility(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r1.a
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = com.bxkj.student.life.mall.GoodsDetailActivity.g0(r2)
                r2.setVisibility(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        j(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r1 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r1.a
                com.bxkj.student.life.mall.GoodsDetailActivity.o0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k implements com.bxkj.base.auth.a.g {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        k(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.auth.a.g
        public void a() {
                r4 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.mall.GoodsDetailActivity.s0(r2)
                java.lang.Class<com.bxkj.student.life.mall.CartActivity> r3 = com.bxkj.student.life.mall.CartActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        l(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.life.mall.GoodsDetailActivity r1 = r3.a
                r2 = 2131952036(0x7f1301a4, float:1.9540503E38)
                java.lang.String r1 = r1.getString(r2)
                android.net.Uri r1 = android.net.Uri.parse(r1)
                java.lang.String r2 = "android.intent.action.DIAL"
                r0.<init>(r2, r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r0.setFlags(r1)
                com.bxkj.student.life.mall.GoodsDetailActivity r1 = r3.a
                r1.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class m implements com.umeng.socialize.utils.ShareBoardlistener {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.umeng.socialize.UMShareListener {
            final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity.m a;

            a(com.bxkj.student.life.mall.GoodsDetailActivity.m r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.GoodsDetailActivity$m r3 = r2.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r3 = r3.a
                    android.content.Context r3 = com.bxkj.student.life.mall.GoodsDetailActivity.z0(r3)
                    java.lang.String r0 = " 分享取消了"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                    r1 = this;
                    r3.getClass()
                    com.bxkj.student.life.mall.GoodsDetailActivity$m r2 = r1.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.life.mall.GoodsDetailActivity.y0(r2)
                    java.lang.String r3 = " 分享失败啦"
                    r0 = 0
                    android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                    r2.show()
                    return
            }

            public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.GoodsDetailActivity$m r3 = r2.a
                    com.bxkj.student.life.mall.GoodsDetailActivity r3 = r3.a
                    android.content.Context r3 = com.bxkj.student.life.mall.GoodsDetailActivity.x0(r3)
                    java.lang.String r0 = " 分享成功啦"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                    r0 = this;
                    return
            }
        }

        m(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onclick(com.umeng.socialize.shareboard.SnsPlatform r4, com.umeng.socialize.bean.SHARE_MEDIA r5) {
                r3 = this;
                com.umeng.socialize.media.UMWeb r4 = new com.umeng.socialize.media.UMWeb
                java.lang.String r0 = "http://m.boxkj.com/admin/studentAppUpdate/downloadUrl"
                r4.<init>(r0)
                java.lang.String r0 = "校园生活如此简单"
                r4.setTitle(r0)
                com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
                com.bxkj.student.life.mall.GoodsDetailActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.life.mall.GoodsDetailActivity.t0(r1)
                java.lang.String r2 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
                r0.<init>(r1, r2)
                r4.setThumb(r0)
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r3.a
                r1 = 2131952726(0x7f130456, float:1.9541903E38)
                java.lang.String r0 = r0.getString(r1)
                r4.setDescription(r0)
                com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
                com.bxkj.student.life.mall.GoodsDetailActivity r1 = r3.a
                r0.<init>(r1)
                com.umeng.socialize.ShareAction r5 = r0.setPlatform(r5)
                com.bxkj.student.life.mall.GoodsDetailActivity$m$a r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$m$a
                r0.<init>(r3)
                com.umeng.socialize.ShareAction r5 = r5.setCallback(r0)
                com.umeng.socialize.ShareAction r4 = r5.withMedia(r4)
                r4.share()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class n extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        n(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.life.mall.GoodsDetailActivity.A0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.a
                android.widget.RelativeLayout r0 = com.bxkj.student.life.mall.GoodsDetailActivity.k0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.a
                com.bxkj.student.life.mall.GoodsDetailActivity.n0(r0, r3)
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.a
                com.bxkj.student.life.mall.GoodsDetailActivity.q0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class o implements cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        o(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onImageClick(java.lang.String r2, int r3, android.view.View r4) {
                r1 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r2 = r1.a
                java.util.List r2 = com.bxkj.student.life.mall.GoodsDetailActivity.i0(r2)
                int r2 = r2.size()
                java.lang.String[] r2 = new java.lang.String[r2]
                com.bxkj.student.life.mall.GoodsDetailActivity r4 = r1.a
                java.util.List r0 = com.bxkj.student.life.mall.GoodsDetailActivity.i0(r4)
                java.lang.Object[] r2 = r0.toArray(r2)
                java.lang.String[] r2 = (java.lang.String[]) r2
                com.bxkj.student.life.mall.GoodsDetailActivity.r0(r4, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class p implements cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewSelectListener {
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity a;

        p(com.bxkj.student.life.mall.GoodsDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onItemSelect(int r3) {
                r2 = this;
                com.bxkj.student.life.mall.GoodsDetailActivity r0 = r2.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.GoodsDetailActivity.m0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r3 = r3 + 1
                r1.append(r3)
                java.lang.String r3 = "/"
                r1.append(r3)
                com.bxkj.student.life.mall.GoodsDetailActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.life.mall.GoodsDetailActivity.i0(r3)
                int r3 = r3.size()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.setText(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class q implements android.view.View.OnClickListener {
        final /* synthetic */ android.app.Dialog a;
        final /* synthetic */ com.bxkj.student.life.mall.GoodsDetailActivity b;

        q(com.bxkj.student.life.mall.GoodsDetailActivity r1, android.app.Dialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                android.app.Dialog r1 = r0.a
                if (r1 == 0) goto Lf
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto Lf
                android.app.Dialog r1 = r0.a
                r1.dismiss()
            Lf:
                return
        }
    }

    public GoodsDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context A0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context B0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context C0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context D0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context E0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void F0() {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L17
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r2 = com.bxkj.student.personal.login.LoginActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
        L17:
            com.bxkj.base.auth.a r0 = new com.bxkj.base.auth.a
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            com.bxkj.student.life.mall.GoodsDetailActivity$h r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$h
            r1.<init>(r3)
            com.bxkj.base.auth.a r0 = r0.i(r1)
            androidx.fragment.app.FragmentManager r1 = r3.getSupportFragmentManager()
            r2 = 0
            r0.b(r1, r2)
            return
    }

    private void G0() {
            r4 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L1d
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInMall()
            if (r0 == 0) goto L1d
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getOpenId()
            goto L1e
        L1d:
            r0 = 0
        L1e:
            android.content.Context r1 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideOtherStatusMessage()
            java.lang.Class<w.g> r2 = w.g.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.g r2 = (w.g) r2
            java.lang.String r3 = r4.X0
            rx.e r0 = r2.d(r3, r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.life.mall.GoodsDetailActivity$n r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$n
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void H0(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.J0()
            return
        L6:
            r0.K0()
            return
    }

    private void I0() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.Y0
            java.lang.String r1 = "imgArr"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L45
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.Y0
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r4.Z0 = r0
            cn.bluemobi.dylan.base.view.CycleViewPager r1 = r4.G0
            com.bxkj.student.life.mall.GoodsDetailActivity$o r2 = new com.bxkj.student.life.mall.GoodsDetailActivity$o
            r2.<init>(r4)
            r1.setData(r0, r2)
            android.widget.TextView r0 = r4.P0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "1/"
            r1.append(r2)
            java.util.List<java.lang.String> r2 = r4.Z0
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            cn.bluemobi.dylan.base.view.CycleViewPager r0 = r4.G0
            com.bxkj.student.life.mall.GoodsDetailActivity$p r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$p
            r1.<init>(r4)
            r0.setImageCycleViewSelectListener(r1)
            goto L4c
        L45:
            android.widget.TextView r0 = r4.P0
            java.lang.String r1 = "0"
            r0.setText(r1)
        L4c:
            android.widget.TextView r0 = r4.N0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.Y0
            java.lang.String r2 = "name"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r4.O0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "￥"
            r1.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.Y0
            java.lang.String r3 = "discountPrice"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getMoney(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.I0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "原价：￥"
            r1.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.Y0
            java.lang.String r3 = "regionPrice"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getMoney(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.J0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "库存："
            r1.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.Y0
            java.lang.String r3 = "stock"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.K0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "销量："
            r1.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.Y0
            java.lang.String r3 = "saledNum"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.M0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.Y0
            java.lang.String r2 = "postFeeTip"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.Y0
            java.lang.String r1 = "hasFavorited"
            r2 = 0
            boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r1, r2)
            r4.H0(r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r4.H0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.Y0
            java.lang.String r2 = "memo"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.h(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.Y0
            java.lang.String r1 = "downState"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10a
            r4.L0()
        L10a:
            return
    }

    private void J0() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131689650(0x7f0f00b2, float:1.9008321E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.content.Context r1 = r4.V
            r2 = 1101529088(0x41a80000, float:21.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            android.content.Context r3 = r4.V
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            android.widget.TextView r1 = r4.Q0
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.Q0
            java.lang.String r1 = "已收藏"
            r0.setText(r1)
            return
    }

    private void K0() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131689649(0x7f0f00b1, float:1.900832E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.content.Context r1 = r4.V
            r2 = 1101529088(0x41a80000, float:21.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            android.content.Context r3 = r4.V
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            android.widget.TextView r1 = r4.Q0
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.Q0
            java.lang.String r1 = "收藏"
            r0.setText(r1)
            return
    }

    private void L0() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.b0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.Button r0 = r2.W0
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.S0
            r0.setEnabled(r1)
            android.widget.LinearLayout r0 = r2.a0
            r0.setEnabled(r1)
            return
    }

    private void M0(java.lang.String[] r4, int r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r0.putExtra(r4, r5)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r5 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r5)
            return
    }

    private void N0() {
            r11 = this;
            android.app.Dialog r5 = new android.app.Dialog
            android.content.Context r0 = r11.V
            r1 = 2132017475(0x7f140143, float:1.967323E38)
            r5.<init>(r0, r1)
            r0 = 2131493159(0x7f0c0127, float:1.860979E38)
            r5.setContentView(r0)
            android.view.Window r0 = r5.getWindow()
            r1 = 80
            r0.setGravity(r1)
            r0 = 1
            r5.setCanceledOnTouchOutside(r0)
            r5.setCancelable(r0)
            android.view.Window r1 = r5.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = -1
            r1.width = r2
            r2 = -2
            r1.height = r2
            android.view.Window r2 = r5.getWindow()
            r2.setAttributes(r1)
            r5.show()
            r1 = 2131297111(0x7f090357, float:1.8212158E38)
            android.view.View r1 = r5.findViewById(r1)
            com.bxkj.student.life.mall.GoodsDetailActivity$q r2 = new com.bxkj.student.life.mall.GoodsDetailActivity$q
            r2.<init>(r11, r5)
            r1.setOnClickListener(r2)
            r1 = 2131297182(0x7f09039e, float:1.8212302E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.util.List<java.lang.String> r2 = r11.Z0
            r3 = 0
            if (r2 == 0) goto L7f
            int r2 = r2.size()
            if (r2 <= 0) goto L7f
            android.content.Context r2 = r11.V
            com.bumptech.glide.i r2 = com.bumptech.glide.b.D(r2)
            java.util.List<java.lang.String> r4 = r11.Z0
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            com.bumptech.glide.h r2 = r2.M(r4)
            r4 = 2131689819(0x7f0f015b, float:1.9008664E38)
            com.bumptech.glide.request.a r2 = r2.y0(r4)
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            com.bumptech.glide.request.a r2 = r2.z(r4)
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            r2.m1(r1)
        L7f:
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.Y0
            java.lang.String r4 = "name"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            r1.setText(r2)
            r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.Y0
            java.lang.String r4 = "discountPrice"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getMoney(r2, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "￥"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.setText(r2)
            r1 = 2131299132(0x7f090b3c, float:1.8216257E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "库存："
            r2.append(r6)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r11.Y0
            java.lang.String r7 = "stock"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            r6 = 2131298683(0x7f09097b, float:1.8215346E38)
            android.view.View r6 = r5.findViewById(r6)
            com.zhy.view.flowlayout.TagFlowLayout r6 = (com.zhy.view.flowlayout.TagFlowLayout) r6
            java.util.Map<java.lang.String, java.lang.Object> r8 = r11.Y0
            java.lang.String r9 = "models"
            java.util.List r8 = cn.bluemobi.dylan.http.JsonParse.getList(r8, r9)
            r6.setMaxSelectCount(r0)
            r9 = r4
            com.bxkj.student.life.mall.GoodsDetailActivity$a r4 = new com.bxkj.student.life.mall.GoodsDetailActivity$a
            r4.<init>(r11, r8, r6)
            r6.setAdapter(r4)
            com.bxkj.student.life.mall.GoodsDetailActivity$b r8 = new com.bxkj.student.life.mall.GoodsDetailActivity$b
            r8.<init>(r11, r1, r2, r4)
            r6.setOnSelectListener(r8)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.Y0
            double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r1, r9)
            r8 = 2131298848(0x7f090a20, float:1.821568E38)
            android.view.View r8 = r5.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "共1件￥"
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = "元"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.setText(r9)
            r9 = 2131298253(0x7f0907cd, float:1.8214474E38)
            android.view.View r9 = r5.findViewById(r9)
            com.bxkj.student.common.view.NumberButton r9 = (com.bxkj.student.common.view.NumberButton) r9
            java.util.Map<java.lang.String, java.lang.Object> r10 = r11.Y0
            int r10 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r7)
            r9.setBuyMax(r10)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r11.Y0
            int r7 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r7)
            if (r7 <= 0) goto L145
            goto L146
        L145:
            r0 = 0
        L146:
            r9.setCurrentNumber(r0)
            com.bxkj.student.life.mall.GoodsDetailActivity$c r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$c
            r0.<init>(r11, r8, r1)
            r9.setOnWarnListener(r0)
            r0 = 2131296589(0x7f09014d, float:1.8211099E38)
            android.view.View r0 = r5.findViewById(r0)
            r7 = r0
            android.widget.Button r7 = (android.widget.Button) r7
            com.bxkj.student.life.mall.GoodsDetailActivity$d r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$d
            r1 = r11
            r2 = r6
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setOnClickListener(r0)
            r0 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r0 = r5.findViewById(r0)
            r6 = r0
            android.widget.Button r6 = (android.widget.Button) r6
            com.bxkj.student.life.mall.GoodsDetailActivity$e r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$e
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setOnClickListener(r0)
            return
    }

    private void O0() {
            r7 = this;
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r7.V
            r2 = 2132017475(0x7f140143, float:1.967323E38)
            r0.<init>(r1, r2)
            r1 = 2131493163(0x7f0c012b, float:1.8609798E38)
            r0.setContentView(r1)
            android.view.Window r1 = r0.getWindow()
            r2 = 80
            r1.setGravity(r2)
            r1 = 1
            r0.setCanceledOnTouchOutside(r1)
            r0.setCancelable(r1)
            android.view.Window r1 = r0.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = -1
            r1.width = r2
            r2 = -2
            r1.height = r2
            android.view.Window r2 = r0.getWindow()
            r2.setAttributes(r1)
            r0.show()
            r1 = 2131298096(0x7f090730, float:1.8214156E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ListView r1 = (android.widget.ListView) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "商品名称：\u3000"
            java.lang.String r5 = "specification"
            r3.put(r5, r4)
            java.lang.String r4 = "商品名称"
            java.lang.String r6 = "value"
            r3.put(r6, r4)
            r2.add(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "商品编号：\u3000"
            r3.put(r5, r4)
            java.lang.String r4 = "商品编号"
            r3.put(r6, r4)
            r2.add(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "品牌：\u3000\u3000\u3000"
            r3.put(r5, r4)
            java.lang.String r4 = "品牌"
            r3.put(r6, r4)
            r2.add(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "上架时间：\u3000"
            r3.put(r5, r4)
            java.lang.String r4 = "上架时间"
            r3.put(r6, r4)
            r2.add(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "商品毛重：\u3000"
            r3.put(r5, r4)
            java.lang.String r4 = "商品毛重"
            r3.put(r6, r4)
            r2.add(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "库存：\u3000\u3000\u3000"
            r3.put(r5, r4)
            java.lang.String r4 = "库存"
            r3.put(r6, r4)
            r2.add(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "面料：\u3000\u3000\u3000"
            r3.put(r5, r4)
            java.lang.String r4 = "面料"
            r3.put(r6, r4)
            r2.add(r3)
            com.bxkj.student.life.mall.GoodsDetailActivity$f r3 = new com.bxkj.student.life.mall.GoodsDetailActivity$f
            android.content.Context r4 = r7.V
            r5 = 2131493325(0x7f0c01cd, float:1.8610127E38)
            r3.<init>(r7, r4, r5, r2)
            r1.setAdapter(r3)
            r1 = 2131297111(0x7f090357, float:1.8212158E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.bxkj.student.life.mall.GoodsDetailActivity$g r2 = new com.bxkj.student.life.mall.GoodsDetailActivity$g
            r2.<init>(r7, r0)
            r1.setOnClickListener(r2)
            return
    }

    private void P0() {
            r4 = this;
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            r0.<init>(r4)
            r1 = 4
            com.umeng.socialize.bean.SHARE_MEDIA[] r1 = new com.umeng.socialize.bean.SHARE_MEDIA[r1]
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r3 = 0
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r3 = 1
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r3 = 2
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r3 = 3
            r1[r3] = r2
            com.umeng.socialize.ShareAction r0 = r0.setDisplayList(r1)
            com.bxkj.student.life.mall.GoodsDetailActivity$m r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$m
            r1.<init>(r4)
            com.umeng.socialize.ShareAction r0 = r0.setShareboardclickCallback(r1)
            r0.open()
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton g0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            java.lang.String r0 = r0.X0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            java.util.List<java.lang.String> r0 = r0.Z0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ScrollView j0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.widget.ScrollView r0 = r0.f1012p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RelativeLayout k0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.widget.RelativeLayout r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.widget.TextView r0 = r0.Q0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.widget.TextView r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.mall.GoodsDetailActivity r0, java.util.Map r1) {
            r0.Y0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            r0.F0()
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.mall.GoodsDetailActivity r0, boolean r1) {
            r0.H0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            r0.I0()
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.life.mall.GoodsDetailActivity r0, java.lang.String[] r1, int r2) {
            r0.M0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context u0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context v0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context w0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context x0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context y0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context z0(com.bxkj.student.life.mall.GoodsDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r2 = this;
            com.bxkj.student.common.view.SlideDetailsLayout r0 = r2.c0
            com.bxkj.student.life.mall.GoodsDetailActivity$i r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$i
            r1.<init>(r2)
            r0.setOnSlideDetailsListener(r1)
            android.widget.TextView r0 = r2.L0
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r2.U0
            r0.setOnClickListener(r2)
            android.widget.Button r0 = r2.V0
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.a0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.Q0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.R0
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.S0
            r0.setOnClickListener(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.Y
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.T0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492943(0x7f0c004f, float:1.8609352E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "goodsId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.X0 = r0
        L16:
            r2.G0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "商品详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296971(0x7f0902cb, float:1.8211874E38)
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r1.Y = r2
            r2 = 2131299005(0x7f090abd, float:1.8216E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.I0 = r2
            r2 = 2131298632(0x7f090948, float:1.8215243E38)
            android.view.View r2 = r1.findViewById(r2)
            com.bxkj.student.common.view.SlideDetailsLayout r2 = (com.bxkj.student.common.view.SlideDetailsLayout) r2
            r1.c0 = r2
            r2 = 2131298107(0x7f09073b, float:1.8214178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r1.f1011k0 = r2
            r2 = 2131298105(0x7f090739, float:1.8214174E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r1.f1012p0 = r2
            android.widget.ScrollView r2 = r1.f1011k0
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.F0 = r2
            r2 = 2131296824(0x7f090238, float:1.8211576E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.CycleViewPager r2 = (cn.bluemobi.dylan.base.view.CycleViewPager) r2
            r1.G0 = r2
            android.widget.TextView r2 = r1.I0
            android.text.TextPaint r2 = r2.getPaint()
            r0 = 16
            r2.setFlags(r0)
            r2 = 2131299303(0x7f090be7, float:1.8216604E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.H0 = r2
            java.lang.String r0 = "http://btblcn.com//mobi//commodity//details//de90164762b24a299f45a143e1dbe1ba"
            r2.j(r0)
            r2 = 2131299108(0x7f090b24, float:1.8216208E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.L0 = r2
            r2 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.U0 = r2
            r2 = 2131296589(0x7f09014d, float:1.8211099E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.V0 = r2
            r2 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.N0 = r2
            r2 = 2131299047(0x7f090ae7, float:1.8216084E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.O0 = r2
            r2 = 2131299132(0x7f090b3c, float:1.8216257E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.J0 = r2
            r2 = 2131299088(0x7f090b10, float:1.8216168E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.K0 = r2
            r2 = 2131298404(0x7f090864, float:1.821478E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.Z = r2
            r2 = 2131298945(0x7f090a81, float:1.8215877E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.P0 = r2
            r2 = 2131298074(0x7f09071a, float:1.821411E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.a0 = r2
            r2 = 2131298841(0x7f090a19, float:1.8215667E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Q0 = r2
            r2 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.T0 = r2
            r2 = 2131298827(0x7f090a0b, float:1.8215638E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.R0 = r2
            r2 = 2131299046(0x7f090ae6, float:1.8216082E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.M0 = r2
            r2 = 2131299100(0x7f090b1c, float:1.8216192E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.S0 = r2
            r2 = 2131298016(0x7f0906e0, float:1.8213993E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.b0 = r2
            r2 = 2131296650(0x7f09018a, float:1.8211223E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.W0 = r2
            android.widget.RelativeLayout r2 = r1.Z
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 0
            switch(r3) {
                case 2131296581: goto L7a;
                case 2131296589: goto L76;
                case 2131296971: goto L6a;
                case 2131298074: goto L66;
                case 2131298827: goto L4e;
                case 2131298841: goto L36;
                case 2131299035: goto L11;
                case 2131299100: goto Ld;
                case 2131299108: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            r2.O0()
            return
        Ld:
            r2.P0()
            return
        L11:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            java.lang.String r0 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setTitle(r0)
            r0 = 2131952741(0x7f130465, float:1.9541933E38)
            java.lang.String r0 = r2.getString(r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
            com.bxkj.student.life.mall.GoodsDetailActivity$l r0 = new com.bxkj.student.life.mall.GoodsDetailActivity$l
            r0.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r0)
            r3.show()
            return
        L36:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.V
            r3.<init>(r1)
            com.bxkj.student.life.mall.GoodsDetailActivity$j r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$j
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getSupportFragmentManager()
            r3.b(r1, r0)
            return
        L4e:
            com.bxkj.base.auth.a r3 = new com.bxkj.base.auth.a
            android.content.Context r1 = r2.V
            r3.<init>(r1)
            com.bxkj.student.life.mall.GoodsDetailActivity$k r1 = new com.bxkj.student.life.mall.GoodsDetailActivity$k
            r1.<init>(r2)
            com.bxkj.base.auth.a r3 = r3.i(r1)
            androidx.fragment.app.FragmentManager r1 = r2.getSupportFragmentManager()
            r3.b(r1, r0)
            return
        L66:
            r2.N0()
            return
        L6a:
            android.widget.ScrollView r3 = r2.f1011k0
            r3.smoothScrollTo(r0, r0)
            com.bxkj.student.common.view.SlideDetailsLayout r3 = r2.c0
            r0 = 1
            r3.smoothClose(r0)
            return
        L76:
            r2.N0()
            return
        L7a:
            r2.N0()
            return
    }
}

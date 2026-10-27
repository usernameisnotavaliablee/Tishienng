package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OrderFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout j;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView k;

    /* renamed from: l, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f1046l;

    /* renamed from: m, reason: collision with root package name */
    private int f1047m;

    /* renamed from: n, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f1048n;

    /* renamed from: o, reason: collision with root package name */
    private com.bxkj.student.life.mall.order.a f1049o;

    /* renamed from: p, reason: collision with root package name */
    private int f1050p;

    /* renamed from: q, reason: collision with root package name */
    private int f1051q;

    /* renamed from: r, reason: collision with root package name */
    private int f1052r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.order.OrderFragment$a$a, reason: collision with other inner class name */
        class C0120a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
            final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment.a e;

            C0120a(com.bxkj.student.life.mall.order.OrderFragment.a r1, android.content.Context r2, int r3, java.util.List r4) {
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
                    java.lang.String r0 = "showImg"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                    r1 = 2131689819(0x7f0f015b, float:1.9008664E38)
                    r2 = 2131297182(0x7f09039e, float:1.8212302E38)
                    r4.t(r2, r0, r1, r1)
                    java.lang.String r0 = "commName"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                    r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                    r4.J(r1, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "￥"
                    r0.append(r1)
                    java.lang.String r1 = "commPrize"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getMoney(r5, r1)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r1 = 2131299047(0x7f090ae7, float:1.8216084E38)
                    r4.J(r1, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "x"
                    r0.append(r1)
                    java.lang.String r1 = "commNum"
                    int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r1)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r1 = 2131298848(0x7f090a20, float:1.821568E38)
                    r4.J(r1, r0)
                    java.lang.String r0 = "modelName"
                    java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                    r0 = 2131298978(0x7f090aa2, float:1.8215944E38)
                    r4.J(r0, r5)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ java.util.Map b;
            final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment.a c;

            b(com.bxkj.student.life.mall.order.OrderFragment.a r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r7) {
                    r6 = this;
                    com.bxkj.student.life.mall.order.OrderFragment$a r7 = r6.c
                    com.bxkj.student.life.mall.order.OrderFragment r7 = r7.k
                    com.bxkj.student.life.mall.order.a r0 = com.bxkj.student.life.mall.order.OrderFragment.O(r7)
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r7 = r6.a
                    r1 = 2131296616(0x7f090168, float:1.8211154E38)
                    java.lang.String r1 = r7.g(r1)
                    java.util.Map r7 = r6.b
                    java.lang.String r2 = "id"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
                    java.util.Map r7 = r6.b
                    java.lang.String r3 = "orderNum"
                    java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                    java.util.Map r7 = r6.b
                    java.lang.String r4 = "totalPrize"
                    double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r4)
                    r0.d(r1, r2, r3, r4)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class c implements android.view.View.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ java.util.Map b;
            final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment.a c;

            c(com.bxkj.student.life.mall.order.OrderFragment.a r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r7) {
                    r6 = this;
                    com.bxkj.student.life.mall.order.OrderFragment$a r7 = r6.c
                    com.bxkj.student.life.mall.order.OrderFragment r7 = r7.k
                    com.bxkj.student.life.mall.order.a r0 = com.bxkj.student.life.mall.order.OrderFragment.O(r7)
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r7 = r6.a
                    r1 = 2131296641(0x7f090181, float:1.8211204E38)
                    java.lang.String r1 = r7.g(r1)
                    java.util.Map r7 = r6.b
                    java.lang.String r2 = "id"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
                    java.util.Map r7 = r6.b
                    java.lang.String r3 = "orderNum"
                    java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                    java.util.Map r7 = r6.b
                    java.lang.String r4 = "totalPrize"
                    double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r4)
                    r0.d(r1, r2, r3, r4)
                    return
            }
        }

        a(com.bxkj.student.life.mall.order.OrderFragment r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
                r8 = this;
                java.lang.String r0 = "orderNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                r1 = 2131299002(0x7f090aba, float:1.8215993E38)
                r9.J(r1, r0)
                java.lang.String r0 = "state"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                r1 = 2131299003(0x7f090abb, float:1.8215995E38)
                r9.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "共"
                r0.append(r1)
                java.lang.String r1 = "commTotalNum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r0.append(r1)
                java.lang.String r1 = "件商品"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299166(0x7f090b5e, float:1.8216326E38)
                r9.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "合计：￥"
                r0.append(r1)
                java.lang.String r1 = "totalPrize"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getMoney(r10, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299167(0x7f090b5f, float:1.8216328E38)
                r9.J(r1, r0)
                java.lang.String r0 = "postFee"
                double r0 = cn.bluemobi.dylan.http.JsonParse.getDouble(r10, r0)
                r2 = 0
                r4 = 0
                r5 = 1
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L67
                r2 = 1
                goto L68
            L67:
                r2 = 0
            L68:
                r3 = 2131299045(0x7f090ae5, float:1.821608E38)
                r9.N(r3, r2)
                if (r6 == 0) goto L94
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "(含运费￥"
                r2.append(r6)
                java.text.DecimalFormat r6 = new java.text.DecimalFormat
                java.lang.String r7 = "0.00"
                r6.<init>(r7)
                java.lang.String r0 = r6.format(r0)
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r9.J(r3, r0)
            L94:
                r0 = 2131298099(0x7f090733, float:1.8214162E38)
                android.view.View r0 = r9.h(r0)
                android.widget.ListView r0 = (android.widget.ListView) r0
                r0.setEnabled(r4)
                r0.setPressed(r4)
                r0.setClickable(r4)
                java.lang.String r1 = "commArr"
                java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r10, r1)
                com.bxkj.student.life.mall.order.OrderFragment$a$a r2 = new com.bxkj.student.life.mall.order.OrderFragment$a$a
                android.content.Context r3 = r8.e
                r6 = 2131493292(0x7f0c01ac, float:1.861006E38)
                r2.<init>(r8, r3, r6, r1)
                r0.setAdapter(r2)
                java.lang.String r0 = "orderMode"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r10, r0)
                r1 = 2131296616(0x7f090168, float:1.8211154E38)
                r2 = 2131296641(0x7f090181, float:1.8211204E38)
                if (r0 != r5) goto Ld8
                r9.N(r1, r5)
                r9.N(r2, r5)
                java.lang.String r0 = "取消订单"
                r9.J(r1, r0)
                java.lang.String r0 = "立即付款"
                r9.J(r2, r0)
                goto L12a
            Ld8:
                r3 = 2
                if (r0 != r3) goto Le7
                r9.N(r1, r4)
                r9.N(r2, r5)
                java.lang.String r0 = "申请退款"
                r9.J(r2, r0)
                goto L12a
            Le7:
                r3 = 3
                if (r0 != r3) goto Lfb
                r9.N(r1, r5)
                r9.N(r2, r5)
                java.lang.String r0 = "查看物流"
                r9.J(r1, r0)
                java.lang.String r0 = "确认收货"
                r9.J(r2, r0)
                goto L12a
            Lfb:
                r3 = 4
                java.lang.String r6 = "删除订单"
                if (r0 != r3) goto L10a
                r9.N(r1, r4)
                r9.N(r2, r5)
                r9.J(r2, r6)
                goto L12a
            L10a:
                r3 = 5
                if (r0 != r3) goto L117
                r9.N(r1, r4)
                r9.N(r2, r5)
                r9.J(r2, r6)
                goto L12a
            L117:
                r3 = 6
                if (r0 != r3) goto L124
                r9.N(r1, r4)
                r9.N(r2, r5)
                r9.J(r2, r6)
                goto L12a
            L124:
                r9.N(r1, r4)
                r9.N(r2, r4)
            L12a:
                com.bxkj.student.life.mall.order.OrderFragment$a$b r0 = new com.bxkj.student.life.mall.order.OrderFragment$a$b
                r0.<init>(r8, r9, r10)
                r9.w(r1, r0)
                com.bxkj.student.life.mall.order.OrderFragment$a$c r0 = new com.bxkj.student.life.mall.order.OrderFragment$a$c
                r0.<init>(r8, r9, r10)
                r9.w(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment a;

        b(com.bxkj.student.life.mall.order.OrderFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.life.mall.order.OrderFragment r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.life.mall.order.OrderFragment r4 = r1.a
                android.content.Context r4 = com.bxkj.student.life.mall.order.OrderFragment.X(r4)
                java.lang.Class<com.bxkj.student.life.mall.order.OrderDetailActivity> r0 = com.bxkj.student.life.mall.order.OrderDetailActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.life.mall.order.OrderFragment r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.life.mall.order.OrderFragment.N(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "orderId"
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bxkj.student.life.mall.order.a.e {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment a;

        c(com.bxkj.student.life.mall.order.OrderFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.life.mall.order.a.e
        public void a() {
                r1 = this;
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                r0.a0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements m2.e {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment a;

        d(com.bxkj.student.life.mall.order.OrderFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.mall.order.OrderFragment r4 = r3.a
                int r4 = com.bxkj.student.life.mall.order.OrderFragment.T(r4)
                com.bxkj.student.life.mall.order.OrderFragment r0 = r3.a
                int r0 = com.bxkj.student.life.mall.order.OrderFragment.R(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.mall.order.OrderFragment r0 = r3.a
                int r0 = com.bxkj.student.life.mall.order.OrderFragment.Q(r0)
                com.bxkj.student.life.mall.order.OrderFragment r1 = r3.a
                int r1 = com.bxkj.student.life.mall.order.OrderFragment.T(r1)
                com.bxkj.student.life.mall.order.OrderFragment r2 = r3.a
                int r2 = com.bxkj.student.life.mall.order.OrderFragment.R(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.mall.order.OrderFragment r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.mall.order.OrderFragment.S(r4)
                r4.q0()
                com.bxkj.student.life.mall.order.OrderFragment r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.L(r0)
                return
            L38:
                com.bxkj.student.life.mall.order.OrderFragment r4 = r3.a
                int r0 = com.bxkj.student.life.mall.order.OrderFragment.Q(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.mall.order.OrderFragment.U(r4, r0)
                com.bxkj.student.life.mall.order.OrderFragment r4 = r3.a
                com.bxkj.student.life.mall.order.OrderFragment.W(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.mall.order.OrderFragment r2 = r1.a
                r0 = 1
                com.bxkj.student.life.mall.order.OrderFragment.U(r2, r0)
                com.bxkj.student.life.mall.order.OrderFragment r2 = r1.a
                com.bxkj.student.life.mall.order.OrderFragment.W(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderFragment a;

        e(com.bxkj.student.life.mall.order.OrderFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.order.OrderFragment.S(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.order.OrderFragment.S(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.order.OrderFragment.S(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.order.OrderFragment.S(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.order.OrderFragment.S(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.order.OrderFragment r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.order.OrderFragment.S(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.order.OrderFragment r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.mall.order.OrderFragment.V(r0, r1)
                com.bxkj.student.life.mall.order.OrderFragment r0 = r2.a
                int r0 = com.bxkj.student.life.mall.order.OrderFragment.Q(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.mall.order.OrderFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.order.OrderFragment.P(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.mall.order.OrderFragment r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.order.OrderFragment.P(r0)
                r0.addAll(r3)
                com.bxkj.student.life.mall.order.OrderFragment r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.order.OrderFragment.N(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public OrderFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1046l = r0
            r0 = 1
            r1.f1050p = r0
            r0 = 15
            r1.f1051q = r0
            r0 = 0
            r1.f1052r = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter N(com.bxkj.student.life.mall.order.OrderFragment r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1048n
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.life.mall.order.a O(com.bxkj.student.life.mall.order.OrderFragment r0) {
            com.bxkj.student.life.mall.order.a r0 = r0.f1049o
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List P(com.bxkj.student.life.mall.order.OrderFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f1046l
            return r0
    }

    static /* bridge */ /* synthetic */ int Q(com.bxkj.student.life.mall.order.OrderFragment r0) {
            int r0 = r0.f1050p
            return r0
    }

    static /* bridge */ /* synthetic */ int R(com.bxkj.student.life.mall.order.OrderFragment r0) {
            int r0 = r0.f1051q
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout S(com.bxkj.student.life.mall.order.OrderFragment r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ int T(com.bxkj.student.life.mall.order.OrderFragment r0) {
            int r0 = r0.f1052r
            return r0
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.life.mall.order.OrderFragment r0, int r1) {
            r0.f1050p = r1
            return
    }

    static /* bridge */ /* synthetic */ void V(com.bxkj.student.life.mall.order.OrderFragment r0, int r1) {
            r0.f1052r = r1
            return
    }

    static /* bridge */ /* synthetic */ void W(com.bxkj.student.life.mall.order.OrderFragment r0) {
            r0.Y()
            return
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.life.mall.order.OrderFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void Y() {
            r6 = this;
            int r0 = r6.f1047m
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r6.f1047m
            if (r1 != 0) goto Lc
            java.lang.String r0 = ""
        Lc:
            android.content.Context r1 = r6.g
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            java.lang.Class<w.g> r2 = w.g.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.g r2 = (w.g) r2
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getOpenId()
            int r4 = r6.f1050p
            int r5 = r6.f1051q
            rx.e r0 = r2.k(r0, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.life.mall.order.OrderFragment$e r1 = new com.bxkj.student.life.mall.order.OrderFragment$e
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private void Z() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.j
            com.bxkj.student.life.mall.order.OrderFragment$d r1 = new com.bxkj.student.life.mall.order.OrderFragment$d
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void a0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.j
            r0.D()
            return
    }

    public void b() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f1048n
            com.bxkj.student.life.mall.order.OrderFragment$b r1 = new com.bxkj.student.life.mall.order.OrderFragment$b
            r1.<init>(r2)
            r0.k(r1)
            com.bxkj.student.life.mall.order.a r0 = r2.f1049o
            com.bxkj.student.life.mall.order.OrderFragment$c r1 = new com.bxkj.student.life.mall.order.OrderFragment$c
            r1.<init>(r2)
            r0.s(r1)
            return
    }

    protected void e() {
            r4 = this;
            com.bxkj.student.life.mall.order.a r0 = new com.bxkj.student.life.mall.order.a
            android.content.Context r1 = r4.g
            r0.<init>(r1)
            r4.f1049o = r0
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "index"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1f
            android.os.Bundle r0 = r4.getArguments()
            int r0 = r0.getInt(r1)
            r4.f1047m = r0
        L1f:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.g
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.life.mall.order.OrderFragment$a r0 = new com.bxkj.student.life.mall.order.OrderFragment$a
            android.content.Context r1 = r4.g
            r2 = 2131493293(0x7f0c01ad, float:1.8610062E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f1046l
            r0.<init>(r4, r1, r2, r3)
            r4.f1048n = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.k
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.k
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.c(r1)
            r0.setEmptyView(r1)
            r4.Z()
            r4.a0()
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.c(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.j = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.c(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.k = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493641(0x7f0c0309, float:1.8610768E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

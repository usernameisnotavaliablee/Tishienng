package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OrderDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.TextView I0;
    private androidx.cardview.widget.CardView J0;
    private android.widget.TextView K0;
    private android.widget.Button L0;
    private android.widget.Button M0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> N0;
    private java.lang.String O0;
    private java.util.Map<java.lang.String, java.lang.Object> P0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> Q0;
    private java.util.Map<java.lang.String, java.lang.Object> R0;
    private android.widget.ScrollView Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1044k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1045p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderDetailActivity k;

        a(com.bxkj.student.life.mall.order.OrderDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
    class b implements com.bxkj.student.life.mall.order.a.e {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderDetailActivity a;

        b(com.bxkj.student.life.mall.order.OrderDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.life.mall.order.a.e
        public void a() {
                r1 = this;
                com.bxkj.student.life.mall.order.OrderDetailActivity r0 = r1.a
                com.bxkj.student.life.mall.order.OrderDetailActivity.m0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.life.mall.order.a a;
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderDetailActivity b;

        c(com.bxkj.student.life.mall.order.OrderDetailActivity r1, com.bxkj.student.life.mall.order.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r7) {
                r6 = this;
                com.bxkj.student.life.mall.order.a r0 = r6.a
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                android.widget.Button r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.h0(r7)
                java.lang.CharSequence r7 = r7.getText()
                java.lang.String r7 = r7.toString()
                java.lang.String r1 = r7.trim()
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                java.util.Map r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.j0(r7)
                java.lang.String r2 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                java.util.Map r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.j0(r7)
                java.lang.String r3 = "orderNum"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                java.util.Map r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.j0(r7)
                java.lang.String r4 = "totalPrize"
                double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r4)
                r0.d(r1, r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.life.mall.order.a a;
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderDetailActivity b;

        d(com.bxkj.student.life.mall.order.OrderDetailActivity r1, com.bxkj.student.life.mall.order.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r7) {
                r6 = this;
                com.bxkj.student.life.mall.order.a r0 = r6.a
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                android.widget.Button r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.i0(r7)
                java.lang.CharSequence r7 = r7.getText()
                java.lang.String r7 = r7.toString()
                java.lang.String r1 = r7.trim()
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                java.util.Map r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.j0(r7)
                java.lang.String r2 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                java.util.Map r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.j0(r7)
                java.lang.String r3 = "orderNum"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                com.bxkj.student.life.mall.order.OrderDetailActivity r7 = r6.b
                java.util.Map r7 = com.bxkj.student.life.mall.order.OrderDetailActivity.j0(r7)
                java.lang.String r4 = "totalPrize"
                double r4 = cn.bluemobi.dylan.http.JsonParse.getDouble(r7, r4)
                r0.d(r1, r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderDetailActivity a;

        e(com.bxkj.student.life.mall.order.OrderDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.life.mall.order.OrderDetailActivity r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.life.mall.order.OrderDetailActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.student.life.mall.order.OrderDetailActivity.o0(r4)
                java.lang.Class<com.bxkj.student.life.mall.GoodsDetailActivity> r0 = com.bxkj.student.life.mall.GoodsDetailActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.life.mall.order.OrderDetailActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.life.mall.order.OrderDetailActivity.g0(r4)
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
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderDetailActivity a;

        f(com.bxkj.student.life.mall.order.OrderDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.life.mall.order.OrderDetailActivity r0 = r1.a
                com.bxkj.student.life.mall.order.OrderDetailActivity.l0(r0, r2)
                com.bxkj.student.life.mall.order.OrderDetailActivity r2 = r1.a
                android.widget.ScrollView r2 = com.bxkj.student.life.mall.order.OrderDetailActivity.k0(r2)
                r0 = 0
                r2.setVisibility(r0)
                com.bxkj.student.life.mall.order.OrderDetailActivity r2 = r1.a
                com.bxkj.student.life.mall.order.OrderDetailActivity.n0(r2)
                return
        }
    }

    public OrderDetailActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.N0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Q0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button h0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            android.widget.Button r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button i0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            android.widget.Button r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map j0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ScrollView k0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            android.widget.ScrollView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.life.mall.order.OrderDetailActivity r0, java.util.Map r1) {
            r0.P0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            r0.p0()
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            r0.q0()
            return
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.life.mall.order.OrderDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void p0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r3.O0
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.order.OrderDetailActivity$f r1 = new com.bxkj.student.life.mall.order.OrderDetailActivity$f
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void q0() {
            r6 = this;
            android.widget.TextView r0 = r6.a0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.P0
            java.lang.String r2 = "state"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r6.b0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.P0
            java.lang.String r2 = "orderNum"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r6.c0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.P0
            java.lang.String r2 = "createTime"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r6.f1044k0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.P0
            java.lang.String r2 = "receiverName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r6.f1045p0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.P0
            java.lang.String r2 = "receiverPhone"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r6.F0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.P0
            java.lang.String r2 = "address"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.P0
            java.lang.String r1 = "commArr"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1)
            r6.N0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.Q0
            r1.g(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.P0
            java.lang.String r1 = "memo"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L76
            androidx.cardview.widget.CardView r1 = r6.J0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r6.K0
            r1.setText(r0)
        L76:
            android.widget.TextView r0 = r6.G0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "￥"
            r1.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.P0
            java.lang.String r5 = "commPrize"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getMoney(r4, r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r6.H0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.P0
            java.lang.String r5 = "postFee"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getMoney(r4, r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r6.I0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.P0
            java.lang.String r4 = "totalPrize"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getMoney(r3, r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.P0
            java.lang.String r1 = "orderMode"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
            r1 = 1
            if (r0 != r1) goto Lf0
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.L0
            java.lang.String r1 = "取消订单"
            r0.setText(r1)
            android.widget.Button r0 = r6.M0
            java.lang.String r1 = "立即付款"
            r0.setText(r1)
            return
        Lf0:
            r1 = 2
            r3 = 8
            if (r0 != r1) goto L107
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.M0
            java.lang.String r1 = "申请退款"
            r0.setText(r1)
            return
        L107:
            r1 = 3
            if (r0 != r1) goto L123
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.L0
            java.lang.String r1 = "查看物流"
            r0.setText(r1)
            android.widget.Button r0 = r6.M0
            java.lang.String r1 = "确认收货"
            r0.setText(r1)
            return
        L123:
            r1 = 4
            java.lang.String r4 = "删除订单"
            if (r0 != r1) goto L138
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.M0
            r0.setText(r4)
            return
        L138:
            r1 = 5
            if (r0 != r1) goto L14b
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.M0
            r0.setText(r4)
            return
        L14b:
            r1 = 6
            if (r0 != r1) goto L15e
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r2)
            android.widget.Button r0 = r6.M0
            r0.setText(r4)
            return
        L15e:
            android.widget.Button r0 = r6.L0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.M0
            r0.setVisibility(r3)
            return
    }

    public void L() {
            r3 = this;
            com.bxkj.student.life.mall.order.a r0 = new com.bxkj.student.life.mall.order.a
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            com.bxkj.student.life.mall.order.OrderDetailActivity$b r1 = new com.bxkj.student.life.mall.order.OrderDetailActivity$b
            r1.<init>(r3)
            r0.s(r1)
            android.widget.Button r1 = r3.L0
            com.bxkj.student.life.mall.order.OrderDetailActivity$c r2 = new com.bxkj.student.life.mall.order.OrderDetailActivity$c
            r2.<init>(r3, r0)
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r3.M0
            com.bxkj.student.life.mall.order.OrderDetailActivity$d r2 = new com.bxkj.student.life.mall.order.OrderDetailActivity$d
            r2.<init>(r3, r0)
            r1.setOnClickListener(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.Q0
            com.bxkj.student.life.mall.order.OrderDetailActivity$e r1 = new com.bxkj.student.life.mall.order.OrderDetailActivity$e
            r1.<init>(r3)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492984(0x7f0c0078, float:1.8609435E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "orderId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.O0 = r0
        L16:
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.life.mall.order.OrderDetailActivity$a r0 = new com.bxkj.student.life.mall.order.OrderDetailActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493292(0x7f0c01ac, float:1.861006E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.N0
            r0.<init>(r4, r1, r2, r3)
            r4.Q0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.V
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            r4.p0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "订单详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Z = r2
            r2 = 2131298453(0x7f090895, float:1.821488E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r1.Y = r2
            r2 = 2131299003(0x7f090abb, float:1.8215995E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131299002(0x7f090aba, float:1.8215993E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131299004(0x7f090abc, float:1.8215997E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            r2 = 2131298919(0x7f090a67, float:1.8215825E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            r2 = 2131299045(0x7f090ae5, float:1.821608E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.H0 = r2
            r2 = 2131299167(0x7f090b5f, float:1.8216328E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.I0 = r2
            r2 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f1044k0 = r2
            r2 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f1045p0 = r2
            r2 = 2131298773(0x7f0909d5, float:1.8215529E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.F0 = r2
            r2 = 2131298993(0x7f090ab1, float:1.8215975E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.K0 = r2
            r2 = 2131296616(0x7f090168, float:1.8211154E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.L0 = r2
            r2 = 2131296641(0x7f090181, float:1.8211204E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.M0 = r2
            r2 = 2131296689(0x7f0901b1, float:1.8211302E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            r1.J0 = r2
            android.widget.ScrollView r2 = r1.Y
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

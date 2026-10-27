package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ConfirmOrderActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.EditText I0;
    private android.widget.Button J0;
    private java.util.Map<java.lang.String, java.lang.Object> K0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> L0;
    private double M0;
    private double N0;
    private java.lang.String O0;
    private final int P0;
    private android.widget.LinearLayout Y;
    private android.widget.LinearLayout Z;
    private androidx.recyclerview.widget.RecyclerView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1042k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1043p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.order.ConfirmOrderActivity k;

        a(com.bxkj.student.life.mall.order.ConfirmOrderActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.order.ConfirmOrderActivity a;

        b(com.bxkj.student.life.mall.order.ConfirmOrderActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.life.mall.order.ConfirmOrderActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.life.mall.order.ConfirmOrderActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.life.mall.order.ConfirmOrderActivity.g0(r2)
                java.lang.Class<com.bxkj.student.life.mall.order.OrderPayActivity> r3 = com.bxkj.student.life.mall.order.OrderPayActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "orderId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                android.content.Intent r1 = r1.putExtra(r2, r3)
                java.lang.String r2 = "orderNum"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                java.lang.String r3 = "orderNo"
                android.content.Intent r1 = r1.putExtra(r3, r2)
                java.lang.String r2 = "prize"
                double r2 = cn.bluemobi.dylan.http.JsonParse.getDouble(r5, r2)
                java.lang.String r5 = "payPrice"
                android.content.Intent r5 = r1.putExtra(r5, r2)
                r0.startActivity(r5)
                cn.bluemobi.dylan.base.utils.a r5 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.life.mall.CartActivity> r0 = com.bxkj.student.life.mall.CartActivity.class
                android.app.Activity r5 = r5.getActivity(r0)
                com.bxkj.student.life.mall.CartActivity r5 = (com.bxkj.student.life.mall.CartActivity) r5
                if (r5 == 0) goto L45
                r5.E0()
            L45:
                com.bxkj.student.life.mall.order.ConfirmOrderActivity r5 = r4.a
                r5.finish()
                return
        }
    }

    public ConfirmOrderActivity() {
            r1 = this;
            r1.<init>()
            r0 = 170(0xaa, float:2.38E-43)
            r1.P0 = r0
            return
    }

    static /* synthetic */ android.content.Context g0(com.bxkj.student.life.mall.order.ConfirmOrderActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void h0() {
            r7 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.K0
            if (r0 == 0) goto L7f
            int r0 = r0.size()
            if (r0 > 0) goto Lb
            goto L7f
        Lb:
            java.lang.String r0 = r7.O0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L47
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.L0
            r0.addAll(r1)
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> L42
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L42
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L42
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "commName"
            r2.remove(r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "commPrize"
            r2.remove(r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "showImg"
            r2.remove(r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "modelName"
            r2.remove(r3)     // Catch: java.lang.Exception -> L42
            goto L21
        L42:
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)
            goto L48
        L47:
            r0 = 0
        L48:
            android.widget.EditText r1 = r7.I0
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.content.Context r2 = r7.V
            cn.bluemobi.dylan.http.HttpRequest r2 = cn.bluemobi.dylan.http.Http.with(r2)
            java.lang.Class<w.g> r3 = w.g.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            w.g r3 = (w.g) r3
            java.lang.String r4 = r7.O0
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.K0
            java.lang.String r6 = "id"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r6)
            rx.e r0 = r3.A(r4, r5, r1, r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r2.setObservable(r0)
            com.bxkj.student.life.mall.order.ConfirmOrderActivity$b r1 = new com.bxkj.student.life.mall.order.ConfirmOrderActivity$b
            r1.<init>(r7)
            r0.setDataListener(r1)
            return
        L7f:
            java.lang.String r0 = "请选择地址"
            r7.f0(r0)
            return
    }

    private void i0() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.K0
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L40
            int r0 = r0.size()
            if (r0 > 0) goto Le
            goto L40
        Le:
            android.widget.LinearLayout r0 = r3.Z
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r3.Y
            r0.setVisibility(r1)
            android.widget.TextView r0 = r3.b0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.K0
            java.lang.String r2 = "receiverName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r3.c0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.K0
            java.lang.String r2 = "receiverPhone"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r3.f1042k0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.K0
            java.lang.String r2 = "detailAddress"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            return
        L40:
            android.widget.LinearLayout r0 = r3.Z
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r3.Y
            r0.setVisibility(r2)
            return
    }

    public void L() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.Y
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.J0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492924(0x7f0c003c, float:1.8609314E38)
            return r0
    }

    public void R() {
            r9 = this;
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "map"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L42
            android.content.Intent r0 = r9.getIntent()
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            cn.bluemobi.dylan.base.utils.SeralizableMap r0 = (cn.bluemobi.dylan.base.utils.SeralizableMap) r0
            java.util.Map r0 = r0.getMap()
            java.lang.String r1 = "address"
            java.util.Map r1 = cn.bluemobi.dylan.http.JsonParse.getMap(r0, r1)
            r9.K0 = r1
            java.lang.String r1 = "goodsList"
            java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1)
            r9.L0 = r1
            java.lang.String r1 = "goodsPrice"
            double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r0, r1)
            r9.M0 = r1
            java.lang.String r1 = "postFee"
            double r1 = cn.bluemobi.dylan.http.JsonParse.getDouble(r0, r1)
            r9.N0 = r1
            java.lang.String r1 = "ids"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            r9.O0 = r0
        L42:
            r9.i0()
            androidx.recyclerview.widget.RecyclerView r0 = r9.a0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r9.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r9.a0
            com.bxkj.student.life.mall.order.ConfirmOrderActivity$a r1 = new com.bxkj.student.life.mall.order.ConfirmOrderActivity$a
            android.content.Context r2 = r9.V
            r3 = 2131493292(0x7f0c01ac, float:1.861006E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r9.L0
            r1.<init>(r9, r2, r3, r4)
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r9.a0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r9.V
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            android.widget.TextView r0 = r9.f1043p0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "￥"
            r1.append(r2)
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r4 = "0.00"
            r3.<init>(r4)
            double r5 = r9.M0
            java.lang.String r3 = r3.format(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r9.F0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            r3.<init>(r4)
            double r5 = r9.N0
            java.lang.String r3 = r3.format(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r9.G0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r4)
            double r5 = r9.M0
            double r7 = r9.N0
            double r5 = r5 + r7
            java.lang.String r2 = r2.format(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r9.H0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "实付款：￥"
            r1.append(r2)
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r4)
            double r3 = r9.M0
            double r5 = r9.N0
            double r3 = r3 + r5
            java.lang.String r2 = r2.format(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "确认订单"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298022(0x7f0906e6, float:1.8214005E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Y = r1
            r1 = 2131298012(0x7f0906dc, float:1.8213985E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.Z = r1
            r1 = 2131298426(0x7f09087a, float:1.8214825E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.a0 = r1
            r1 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.J0 = r1
            r1 = 2131298919(0x7f090a67, float:1.8215825E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1043p0 = r1
            r1 = 2131299045(0x7f090ae5, float:1.821608E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F0 = r1
            r1 = 2131299167(0x7f090b5f, float:1.8216328E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.G0 = r1
            r1 = 2131299018(0x7f090aca, float:1.8216026E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.H0 = r1
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298773(0x7f0909d5, float:1.8215529E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1042k0 = r1
            r1 = 2131296936(0x7f0902a8, float:1.8211803E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.I0 = r1
            return
    }

    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            r0 = -1
            if (r3 == r0) goto L7
            goto L3d
        L7:
            if (r4 != 0) goto La
            goto L3d
        La:
            r3 = 170(0xaa, float:2.38E-43)
            if (r2 != r3) goto L3d
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.K0
            java.lang.String r3 = "id"
            java.lang.String r0 = r4.getStringExtra(r3)
            r2.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.K0
            java.lang.String r3 = "receiverName"
            java.lang.String r0 = r4.getStringExtra(r3)
            r2.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.K0
            java.lang.String r3 = "receiverPhone"
            java.lang.String r0 = r4.getStringExtra(r3)
            r2.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.K0
            java.lang.String r3 = "detailAddress"
            java.lang.String r4 = r4.getStringExtra(r3)
            r2.put(r3, r4)
            r1.i0()
        L3d:
            return
    }

    public void onClick(android.view.View r7) {
            r6 = this;
            int r7 = r7.getId()
            r0 = 2131296599(0x7f090157, float:1.821112E38)
            if (r7 == r0) goto L62
            r0 = 2131298012(0x7f0906dc, float:1.8213985E38)
            r1 = 170(0xaa, float:2.38E-43)
            java.lang.String r2 = "-1"
            java.lang.String r3 = "addressId"
            java.lang.Class<com.bxkj.student.life.mall.address.MyAddressListActivity> r4 = com.bxkj.student.life.mall.address.MyAddressListActivity.class
            java.lang.String r5 = "id"
            if (r7 == r0) goto L40
            r0 = 2131298022(0x7f0906e6, float:1.8214005E38)
            if (r7 == r0) goto L1e
            return
        L1e:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r0 = r6.V
            r7.<init>(r0, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.K0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r5)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            goto L38
        L32:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.K0
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r5)
        L38:
            android.content.Intent r7 = r7.putExtra(r3, r2)
            r6.startActivityForResult(r7, r1)
            return
        L40:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r0 = r6.V
            r7.<init>(r0, r4)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.K0
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r5)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L54
            goto L5a
        L54:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.K0
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r5)
        L5a:
            android.content.Intent r7 = r7.putExtra(r3, r2)
            r6.startActivityForResult(r7, r1)
            return
        L62:
            r6.h0()
            return
    }
}

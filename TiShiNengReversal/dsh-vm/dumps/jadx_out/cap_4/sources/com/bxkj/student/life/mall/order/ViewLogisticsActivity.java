package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewLogisticsActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private java.lang.String G0;
    private androidx.recyclerview.widget.RecyclerView Y;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Z;
    private java.lang.String a0;
    private java.lang.String b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1055k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.LinearLayout f1056p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.order.ViewLogisticsActivity k;

        a(com.bxkj.student.life.mall.order.ViewLogisticsActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                int r0 = r5.f()
                r1 = 2131297129(0x7f090369, float:1.8212194E38)
                r2 = 2131299158(0x7f090b56, float:1.821631E38)
                r3 = 2131298946(0x7f090a82, float:1.821588E38)
                if (r0 != 0) goto L33
                r0 = 2131690008(0x7f0f0218, float:1.9009047E38)
                r5.r(r1, r0)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r4.k
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131099731(0x7f060053, float:1.7811823E38)
                int r0 = r0.getColor(r1)
                r5.K(r3, r0)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r4.k
                android.content.res.Resources r0 = r0.getResources()
                int r0 = r0.getColor(r1)
                r5.K(r2, r0)
                goto L56
            L33:
                r0 = 2131689653(0x7f0f00b5, float:1.9008327E38)
                r5.r(r1, r0)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r4.k
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131099821(0x7f0600ad, float:1.7812006E38)
                int r0 = r0.getColor(r1)
                r5.K(r3, r0)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r4.k
                android.content.res.Resources r0 = r0.getResources()
                int r0 = r0.getColor(r1)
                r5.K(r2, r0)
            L56:
                java.lang.String r0 = "AcceptStation"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r5.J(r3, r0)
                java.lang.String r0 = "AcceptTime"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r5.J(r2, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.order.ViewLogisticsActivity a;

        b(com.bxkj.student.life.mall.order.ViewLogisticsActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r3.a
                android.widget.LinearLayout r0 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.i0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.j0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "物流公司："
                r1.append(r2)
                java.lang.String r2 = "ShipperName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.k0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "物流单号："
                r1.append(r2)
                java.lang.String r2 = "LogisticCode"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r3.a
                java.lang.String r1 = "Traces"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity.l0(r0, r4)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r4 = r3.a
                java.util.List r4 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.h0(r4)
                if (r4 == 0) goto L69
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r4 = r3.a
                java.util.List r4 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.h0(r4)
                int r4 = r4.size()
                if (r4 != 0) goto L7e
            L69:
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.lang.String r0 = "AcceptStation"
                java.lang.String r1 = "暂无物流信息"
                r4.put(r0, r1)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.h0(r0)
                r0.add(r4)
            L7e:
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r4 = r3.a
                java.util.List r4 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.h0(r4)
                java.util.Collections.reverse(r4)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.g0(r4)
                com.bxkj.student.life.mall.order.ViewLogisticsActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.h0(r0)
                r4.g(r0)
                return
        }
    }

    public ViewLogisticsActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Z = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.mall.order.ViewLogisticsActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.life.mall.order.ViewLogisticsActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.LinearLayout i0(com.bxkj.student.life.mall.order.ViewLogisticsActivity r0) {
            android.widget.LinearLayout r0 = r0.f1056p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.life.mall.order.ViewLogisticsActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.life.mall.order.ViewLogisticsActivity r0) {
            android.widget.TextView r0 = r0.f1055k0
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.life.mall.order.ViewLogisticsActivity r0, java.util.List r1) {
            r0.Z = r1
            return
    }

    private void m0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r3.G0
            rx.e r1 = r1.l(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.order.ViewLogisticsActivity$b r1 = new com.bxkj.student.life.mall.order.ViewLogisticsActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493059(0x7f0c00c3, float:1.8609587E38)
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
            r4.G0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "shipping_id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.a0 = r0
        L2c:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "invoice_no"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L42
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.b0 = r0
        L42:
            r4.m0()
            r0 = 0
        L46:
            r1 = 4
            if (r0 >= r1) goto L56
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.Z
            r2.add(r1)
            int r0 = r0 + 1
            goto L46
        L56:
            com.bxkj.student.life.mall.order.ViewLogisticsActivity$a r0 = new com.bxkj.student.life.mall.order.ViewLogisticsActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493278(0x7f0c019e, float:1.8610032E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Z
            r0.<init>(r4, r1, r2, r3)
            r4.F0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            r0.setAdapter(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "查看物流"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298096(0x7f090730, float:1.8214156E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Y = r2
            r2 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            r2 = 2131298991(0x7f090aaf, float:1.821597E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f1055k0 = r2
            r2 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f1056p0 = r2
            r0 = 4
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

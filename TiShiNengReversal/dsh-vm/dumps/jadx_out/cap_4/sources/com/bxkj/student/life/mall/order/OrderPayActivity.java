package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class OrderPayActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private double G0;
    private android.widget.TextView Y;
    private android.widget.Button Z;
    private android.widget.LinearLayout a0;
    private android.widget.LinearLayout b0;
    private android.widget.CheckBox c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.CheckBox f1053k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f1054p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderPayActivity a;

        a(com.bxkj.student.life.mall.order.OrderPayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.order.OrderPayActivity a;

        b(com.bxkj.student.life.mall.order.OrderPayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "appid"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                java.lang.String r0 = "partnerid"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                java.lang.String r0 = "prepayid"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                java.lang.String r0 = "noncestr"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                java.lang.String r0 = "package"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                java.lang.String r0 = "timestamp"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                java.lang.String r0 = "sign"
                cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                return
        }
    }

    public OrderPayActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void g0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r3.f1054p0
            rx.e r1 = r1.b(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.order.OrderPayActivity$a r1 = new com.bxkj.student.life.mall.order.OrderPayActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void h0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r3.f1054p0
            rx.e r1 = r1.m(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.order.OrderPayActivity$b r1 = new com.bxkj.student.life.mall.order.OrderPayActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.a0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.b0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492986(0x7f0c007a, float:1.860944E38)
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
            r4.f1054p0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "orderNo"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.F0 = r0
        L2c:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "payPrice"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L44
            android.content.Intent r0 = r4.getIntent()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0.getDoubleExtra(r1, r2)
            r4.G0 = r0
        L44:
            android.widget.TextView r0 = r4.Y
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "￥0.00"
            r1.<init>(r2)
            double r2 = r4.G0
            java.lang.String r1 = r1.format(r2)
            r0.setText(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "订单支付"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296626(0x7f090172, float:1.8211174E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            r1 = 2131298980(0x7f090aa4, float:1.8215948E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298381(0x7f09084d, float:1.8214734E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            r1 = 2131298410(0x7f09086a, float:1.8214792E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.b0 = r1
            r1 = 2131296717(0x7f0901cd, float:1.8211359E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.c0 = r1
            r1 = 2131296724(0x7f0901d4, float:1.8211373E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f1053k0 = r1
            return
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            r0 = 2131296626(0x7f090172, float:1.8211174E38)
            if (r4 == r0) goto L2c
            r0 = 2131298381(0x7f09084d, float:1.8214734E38)
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L21
            r0 = 2131298410(0x7f09086a, float:1.8214792E38)
            if (r4 == r0) goto L16
            goto L43
        L16:
            android.widget.CheckBox r4 = r3.c0
            r4.setChecked(r2)
            android.widget.CheckBox r4 = r3.f1053k0
            r4.setChecked(r1)
            return
        L21:
            android.widget.CheckBox r4 = r3.f1053k0
            r4.setChecked(r2)
            android.widget.CheckBox r4 = r3.c0
            r4.setChecked(r1)
            return
        L2c:
            android.widget.CheckBox r4 = r3.c0
            boolean r4 = r4.isChecked()
            if (r4 == 0) goto L38
            r3.g0()
            return
        L38:
            android.widget.CheckBox r4 = r3.f1053k0
            boolean r4 = r4.isChecked()
            if (r4 == 0) goto L43
            r3.h0()
        L43:
            return
    }
}

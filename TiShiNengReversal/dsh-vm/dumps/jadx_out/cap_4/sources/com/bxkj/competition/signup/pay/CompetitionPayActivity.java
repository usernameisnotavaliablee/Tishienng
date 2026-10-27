package com.bxkj.competition.signup.pay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CompetitionPayActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private double G0;
    private double H0;
    private double I0;
    private double J0;
    private cn.bluemobi.dylan.pay.PayListener K0;
    private android.widget.TextView Y;
    private android.widget.Button Z;
    private android.widget.LinearLayout a0;
    private android.widget.LinearLayout b0;
    private android.widget.CheckBox c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.CheckBox f672k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f673p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.pay.CompetitionPayActivity a;

        a(com.bxkj.competition.signup.pay.CompetitionPayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.competition.signup.pay.CompetitionPayActivity.g0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.pay.CompetitionPayActivity a;

        b(com.bxkj.competition.signup.pay.CompetitionPayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r11) {
                r10 = this;
                java.lang.String r0 = "appid"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "partnerid"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "prepayid"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "noncestr"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "package"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "timestamp"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "sign"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r0 = "attach"
                cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                cn.bluemobi.dylan.pay.WeChatPay r11 = new cn.bluemobi.dylan.pay.WeChatPay
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r10.a
                android.content.Context r0 = com.bxkj.competition.signup.pay.CompetitionPayActivity.i0(r0)
                r11.<init>(r0)
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r10.a
                cn.bluemobi.dylan.pay.PayListener r0 = com.bxkj.competition.signup.pay.CompetitionPayActivity.h0(r0)
                cn.bluemobi.dylan.pay.WeChatPay r1 = r11.setPayLisitener(r0)
                java.lang.String r9 = "App"
                r1.pay(r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.pay.PayListener {
        final /* synthetic */ com.bxkj.competition.signup.pay.CompetitionPayActivity a;

        c(com.bxkj.competition.signup.pay.CompetitionPayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a() {
                r2 = this;
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r2.a
                java.lang.String r1 = "取消支付"
                r0.f0(r1)
                return
        }

        public void b() {
                r2 = this;
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r2.a
                java.lang.String r1 = "支付失败"
                r0.f0(r1)
                return
        }

        public void c() {
                r4 = this;
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r4.a
                java.lang.String r1 = "支付成功"
                r0.f0(r1)
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.competition.signup.pay.CompetitionPayActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.competition.signup.pay.CompetitionPayActivity.j0(r2)
                java.lang.Class<com.bxkj.competition.signup.pay.CompetePaySuccessActivity> r3 = com.bxkj.competition.signup.pay.CompetePaySuccessActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()     // Catch: java.lang.Exception -> L33
                java.lang.Class<com.bxkj.competition.signup.CompetitionDetailActivity> r1 = com.bxkj.competition.signup.CompetitionDetailActivity.class
                android.app.Activity r0 = r0.getActivity(r1)     // Catch: java.lang.Exception -> L33
                r0.finish()     // Catch: java.lang.Exception -> L33
                cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()     // Catch: java.lang.Exception -> L33
                java.lang.Class<com.bxkj.competition.signup.CostProjectListActivity> r1 = com.bxkj.competition.signup.CostProjectListActivity.class
                android.app.Activity r0 = r0.getActivity(r1)     // Catch: java.lang.Exception -> L33
                r0.finish()     // Catch: java.lang.Exception -> L33
            L33:
                com.bxkj.competition.signup.pay.CompetitionPayActivity r0 = r4.a
                r0.finish()
                return
        }
    }

    public CompetitionPayActivity() {
            r1 = this;
            r1.<init>()
            com.bxkj.competition.signup.pay.CompetitionPayActivity$c r0 = new com.bxkj.competition.signup.pay.CompetitionPayActivity$c
            r0.<init>(r1)
            r1.K0 = r0
            return
    }

    static /* synthetic */ void g0(com.bxkj.competition.signup.pay.CompetitionPayActivity r0, java.lang.String r1) {
            r0.k0(r1)
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.pay.PayListener h0(com.bxkj.competition.signup.pay.CompetitionPayActivity r0) {
            cn.bluemobi.dylan.pay.PayListener r0 = r0.K0
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.competition.signup.pay.CompetitionPayActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.competition.signup.pay.CompetitionPayActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void k0(java.lang.String r2) {
            r1 = this;
            cn.bluemobi.dylan.pay.AliPay r0 = new cn.bluemobi.dylan.pay.AliPay
            r0.<init>(r1)
            cn.bluemobi.dylan.pay.AliPay r2 = r0.pay(r2)
            cn.bluemobi.dylan.pay.PayListener r0 = r1.K0
            r2.setPayLisitener(r0)
            return
    }

    private void l0() {
            r14 = this;
            android.content.Context r0 = r14.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            com.bxkj.competition.b r2 = (com.bxkj.competition.b) r2
            java.lang.String r3 = r14.f673p0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r1.getUserId()
            java.lang.String r5 = r14.F0
            double r6 = r14.H0
            double r8 = r14.I0
            double r10 = r14.J0
            double r12 = r14.G0
            rx.e r1 = r2.u(r3, r4, r5, r6, r8, r10, r12)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.pay.CompetitionPayActivity$a r1 = new com.bxkj.competition.signup.pay.CompetitionPayActivity$a
            r1.<init>(r14)
            r0.setDataListener(r1)
            return
    }

    private void m0() {
            r14 = this;
            android.content.Context r0 = r14.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            com.bxkj.competition.b r2 = (com.bxkj.competition.b) r2
            java.lang.String r3 = r14.f673p0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r1.getUserId()
            java.lang.String r5 = r14.F0
            double r6 = r14.H0
            double r8 = r14.I0
            double r10 = r14.J0
            double r12 = r14.G0
            rx.e r1 = r2.w(r3, r4, r5, r6, r8, r10, r12)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.pay.CompetitionPayActivity$b r1 = new com.bxkj.competition.signup.pay.CompetitionPayActivity$b
            r1.<init>(r14)
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
            int r0 = com.bxkj.competition.R.layout.ac_competition_payment
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f673p0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "itemIds"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.F0 = r0
        L2c:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "insuranceFee"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L44
            android.content.Intent r0 = r4.getIntent()
            double r0 = r0.getDoubleExtra(r1, r2)
            r4.H0 = r0
        L44:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "competitionFee"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L5a
            android.content.Intent r0 = r4.getIntent()
            double r0 = r0.getDoubleExtra(r1, r2)
            r4.I0 = r0
        L5a:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "totalPrice"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L70
            android.content.Intent r0 = r4.getIntent()
            double r0 = r0.getDoubleExtra(r1, r2)
            r4.J0 = r0
        L70:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "payPrize"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L86
            android.content.Intent r0 = r4.getIntent()
            double r0 = r0.getDoubleExtra(r1, r2)
            r4.G0 = r0
        L86:
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
            int r1 = com.bxkj.competition.R.id.bt_pay
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            int r1 = com.bxkj.competition.R.id.tv_money
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            int r1 = com.bxkj.competition.R.id.rl_alipay
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.a0 = r1
            int r1 = com.bxkj.competition.R.id.rl_wechatpay
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.b0 = r1
            int r1 = com.bxkj.competition.R.id.cb_alipay
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.c0 = r1
            int r1 = com.bxkj.competition.R.id.cb_wecahtpay
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f672k0 = r1
            return
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r4.getId()
            int r0 = com.bxkj.competition.R.id.rl_alipay
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L15
            android.widget.CheckBox r4 = r3.f672k0
            r4.setChecked(r2)
            android.widget.CheckBox r4 = r3.c0
            r4.setChecked(r1)
            return
        L15:
            int r0 = com.bxkj.competition.R.id.rl_wechatpay
            if (r4 != r0) goto L24
            android.widget.CheckBox r4 = r3.c0
            r4.setChecked(r2)
            android.widget.CheckBox r4 = r3.f672k0
            r4.setChecked(r1)
            return
        L24:
            int r0 = com.bxkj.competition.R.id.bt_pay
            if (r4 != r0) goto L3f
            android.widget.CheckBox r4 = r3.c0
            boolean r4 = r4.isChecked()
            if (r4 == 0) goto L34
            r3.l0()
            return
        L34:
            android.widget.CheckBox r4 = r3.f672k0
            boolean r4 = r4.isChecked()
            if (r4 == 0) goto L3f
            r3.m0()
        L3f:
            return
    }
}

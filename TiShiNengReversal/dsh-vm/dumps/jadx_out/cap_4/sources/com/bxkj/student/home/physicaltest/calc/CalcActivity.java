package com.bxkj.student.home.physicaltest.calc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CalcActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText F0;
    private android.widget.EditText G0;
    private android.widget.EditText H0;
    private android.widget.TextView I0;
    private android.widget.EditText J0;
    private android.widget.TextView K0;
    private android.widget.EditText L0;
    private android.widget.Button M0;
    private android.widget.EditText Y;
    private android.widget.RadioGroup Z;
    private android.widget.RadioGroup a0;
    private android.widget.RadioButton b0;
    private android.widget.EditText c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.EditText f782k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.EditText f783p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ com.bxkj.student.home.physicaltest.calc.CalcActivity a;

        a(com.bxkj.student.home.physicaltest.calc.CalcActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.RadioGroup r1, int r2) {
                r0 = this;
                r1 = 2131298346(0x7f09082a, float:1.8214663E38)
                if (r2 != r1) goto L1c
                com.bxkj.student.home.physicaltest.calc.CalcActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.home.physicaltest.calc.CalcActivity.g0(r1)
                java.lang.String r2 = "1000米"
                r1.setText(r2)
                com.bxkj.student.home.physicaltest.calc.CalcActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.home.physicaltest.calc.CalcActivity.h0(r1)
                java.lang.String r2 = "引体向上"
                r1.setText(r2)
                return
            L1c:
                com.bxkj.student.home.physicaltest.calc.CalcActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.home.physicaltest.calc.CalcActivity.g0(r1)
                java.lang.String r2 = "800米"
                r1.setText(r2)
                com.bxkj.student.home.physicaltest.calc.CalcActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.student.home.physicaltest.calc.CalcActivity.h0(r1)
                java.lang.String r2 = "仰卧起坐"
                r1.setText(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.calc.CalcActivity a;

        b(com.bxkj.student.home.physicaltest.calc.CalcActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.physicaltest.calc.CalcActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.physicaltest.calc.CalcActivity.j0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r5)
                cn.bluemobi.dylan.base.utils.SeralizableMap r5 = new cn.bluemobi.dylan.base.utils.SeralizableMap
                r5.<init>()
                r5.setMap(r0)
                com.bxkj.student.home.physicaltest.calc.CalcActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.physicaltest.calc.CalcActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.physicaltest.calc.CalcActivity.i0(r2)
                java.lang.Class<com.bxkj.student.home.physicaltest.calc.CalcResultActivity> r3 = com.bxkj.student.home.physicaltest.calc.CalcResultActivity.class
                r1.<init>(r2, r3)
                java.lang.String r2 = "sm"
                android.content.Intent r5 = r1.putExtra(r2, r5)
                r0.startActivity(r5)
                return
        }
    }

    public CalcActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView g0(com.bxkj.student.home.physicaltest.calc.CalcActivity r0) {
            android.widget.TextView r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView h0(com.bxkj.student.home.physicaltest.calc.CalcActivity r0) {
            android.widget.TextView r0 = r0.K0
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.home.physicaltest.calc.CalcActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.physicaltest.calc.CalcActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void k0() {
            r12 = this;
            android.widget.EditText r0 = r12.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            android.widget.RadioGroup r0 = r12.Z
            int r0 = r0.getCheckedRadioButtonId()
            android.widget.RadioGroup r1 = r12.Z
            r2 = 0
            android.view.View r1 = r1.getChildAt(r2)
            int r1 = r1.getId()
            if (r0 != r1) goto L24
            java.lang.String r0 = "1"
        L22:
            r2 = r0
            goto L27
        L24:
            java.lang.String r0 = "2"
            goto L22
        L27:
            android.widget.RadioGroup r0 = r12.a0
            int r1 = r0.getCheckedRadioButtonId()
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r0.trim()
            android.widget.EditText r0 = r12.c0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r0.trim()
            android.widget.EditText r0 = r12.f782k0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            android.widget.EditText r0 = r12.f783p0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r0.trim()
            android.widget.EditText r0 = r12.F0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r0.trim()
            android.widget.EditText r0 = r12.G0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r0.trim()
            android.widget.EditText r0 = r12.H0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r0.trim()
            android.widget.EditText r0 = r12.J0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = r0.trim()
            android.widget.EditText r0 = r12.L0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Lf0
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto Lf0
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r12.V
            r0.<init>(r1)
            java.lang.String r1 = "请至少输入一项"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        Lf0:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L10d
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L10d
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r12.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入身高"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L10d:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L12a
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L12a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r12.V
            r0.<init>(r1)
            java.lang.String r1 = "请输入体重"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L12a:
            android.content.Context r0 = r12.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.K0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.calc.CalcActivity$b r1 = new com.bxkj.student.home.physicaltest.calc.CalcActivity$b
            r1.<init>(r12)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.RadioGroup r0 = r2.Z
            com.bxkj.student.home.physicaltest.calc.CalcActivity$a r1 = new com.bxkj.student.home.physicaltest.calc.CalcActivity$a
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            android.widget.Button r0 = r2.M0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492990(0x7f0c007e, float:1.8609447E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测计算器"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296935(0x7f0902a7, float:1.82118E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            r1 = 2131298366(0x7f09083e, float:1.8214703E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r0.Z = r1
            r1 = 2131298346(0x7f09082a, float:1.8214663E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r0.b0 = r1
            r1 = 2131296933(0x7f0902a5, float:1.8211797E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.c0 = r1
            r1 = 2131296959(0x7f0902bf, float:1.821185E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f782k0 = r1
            r1 = 2131296957(0x7f0902bd, float:1.8211845E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f783p0 = r1
            r1 = 2131296952(0x7f0902b8, float:1.8211835E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.F0 = r1
            r1 = 2131296951(0x7f0902b7, float:1.8211833E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.G0 = r1
            r1 = 2131296923(0x7f09029b, float:1.8211776E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.H0 = r1
            r1 = 2131298766(0x7f0909ce, float:1.8215514E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.I0 = r1
            r1 = 2131296924(0x7f09029c, float:1.8211778E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.J0 = r1
            r1 = 2131299054(0x7f090aee, float:1.8216099E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.K0 = r1
            r1 = 2131296943(0x7f0902af, float:1.8211817E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.L0 = r1
            r1 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.M0 = r1
            r1 = 2131298365(0x7f09083d, float:1.8214701E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296623(0x7f09016f, float:1.8211168E38)
            if (r2 == r0) goto La
            return
        La:
            r1.k0()
            return
    }
}

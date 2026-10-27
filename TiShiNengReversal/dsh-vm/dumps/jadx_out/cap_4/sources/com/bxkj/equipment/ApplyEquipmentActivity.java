package com.bxkj.equipment;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyEquipmentActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private java.lang.String G0;
    private java.lang.String H0;
    private int I0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private com.bxkj.equipment.view.NumberButton a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.EditText f674k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.Button f675p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bxkj.equipment.view.NumberButton.a {
        final /* synthetic */ com.bxkj.equipment.ApplyEquipmentActivity a;

        a(com.bxkj.equipment.ApplyEquipmentActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.equipment.view.NumberButton.a
        public void onNumberChanged(int r1) {
                r0 = this;
                return
        }

        @Override // com.bxkj.equipment.view.NumberButton.a
        public void onWarningForBuyMax(int r1) {
                r0 = this;
                return
        }

        @Override // com.bxkj.equipment.view.NumberButton.a
        public void onWarningForInventory(int r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.equipment.ApplyEquipmentActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.equipment.ApplyEquipmentActivity.n0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "库存不足"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.equipment.ApplyEquipmentActivity a;

        b(com.bxkj.equipment.ApplyEquipmentActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.equipment.ApplyEquipmentActivity r2 = r1.a
                r2.finish()
                com.bxkj.equipment.ApplyEquipmentActivity r2 = r1.a
                java.lang.String r0 = "申请成功"
                r2.f0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.equipment.ApplyEquipmentActivity a;

        c(com.bxkj.equipment.ApplyEquipmentActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.equipment.ApplyEquipmentActivity r2 = r1.a
                r2.finish()
                com.bxkj.equipment.ApplyEquipmentActivity r2 = r1.a
                java.lang.String r0 = "申请成功"
                r2.f0(r0)
                return
        }
    }

    public ApplyEquipmentActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.I0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.equipment.ApplyEquipmentActivity r3, android.view.View r4) {
            com.bxkj.base.util.i r4 = new com.bxkj.base.util.i
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            android.widget.TextView r0 = r3.Z
            java.lang.Class<com.bxkj.equipment.i> r1 = com.bxkj.equipment.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.equipment.i r1 = (com.bxkj.equipment.i) r1
            rx.e r1 = r1.d()
            com.bxkj.equipment.g r2 = new com.bxkj.equipment.g
            r2.<init>(r3)
            java.lang.String r3 = "请选择校区"
            r4.i(r0, r3, r1, r2)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.equipment.ApplyEquipmentActivity r1, android.view.View r2) {
            com.bxkj.base.util.i r2 = new com.bxkj.base.util.i
            android.content.Context r0 = r1.V
            r2.<init>(r0)
            android.widget.TextView r1 = r1.c0
            r0 = 0
            r2.g(r1, r0)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.equipment.ApplyEquipmentActivity r0, java.lang.String r1, java.lang.String r2, java.util.Map r3) {
            r0.F0 = r1
            android.widget.TextView r1 = r0.Y
            java.lang.String r2 = ""
            r1.setText(r2)
            r0.G0 = r2
            com.bxkj.equipment.view.NumberButton r0 = r0.a0
            r1 = 1
            r0.e(r1)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.equipment.ApplyEquipmentActivity r0, java.lang.String r1, java.lang.String r2, java.util.Map r3) {
            r0.G0 = r1
            java.lang.String r1 = "amount"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
            com.bxkj.equipment.view.NumberButton r2 = r0.a0
            int r2 = r2.getNumber()
            if (r2 <= r1) goto L15
            com.bxkj.equipment.view.NumberButton r2 = r0.a0
            r2.e(r1)
        L15:
            com.bxkj.equipment.view.NumberButton r0 = r0.a0
            r0.f(r1)
            return
    }

    public static /* synthetic */ void k0(com.bxkj.equipment.ApplyEquipmentActivity r0, android.view.View r1) {
            r0.o0()
            return
    }

    public static /* synthetic */ void l0(com.bxkj.equipment.ApplyEquipmentActivity r3, android.view.View r4) {
            java.lang.String r4 = r3.F0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r3 = r3.V
            r4.<init>(r3)
            java.lang.String r3 = "请先选择校区"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r4.setMessage(r3)
            r3.show()
            return
        L19:
            com.bxkj.base.util.i r4 = new com.bxkj.base.util.i
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            android.widget.TextView r0 = r3.Y
            java.lang.Class<com.bxkj.equipment.i> r1 = com.bxkj.equipment.i.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.equipment.i r1 = (com.bxkj.equipment.i) r1
            java.lang.String r2 = r3.F0
            rx.e r1 = r1.e(r2)
            com.bxkj.equipment.f r2 = new com.bxkj.equipment.f
            r2.<init>(r3)
            java.lang.String r3 = "请选择器材"
            r4.i(r0, r3, r1, r2)
            return
    }

    public static /* synthetic */ void m0(com.bxkj.equipment.ApplyEquipmentActivity r1, android.view.View r2) {
            com.bxkj.base.util.i r2 = new com.bxkj.base.util.i
            android.content.Context r0 = r1.V
            r2.<init>(r0)
            android.widget.TextView r1 = r1.b0
            r0 = 0
            r2.g(r1, r0)
            return
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.equipment.ApplyEquipmentActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void o0() {
            r11 = this;
            java.lang.String r0 = r11.F0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r11.V
            r0.<init>(r1)
            java.lang.String r1 = "请选择校区"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L19:
            java.lang.String r0 = r11.G0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L32
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r11.V
            r0.<init>(r1)
            java.lang.String r1 = "请选择器材"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L32:
            android.widget.TextView r0 = r11.b0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L5b
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r11.V
            r0.<init>(r1)
            android.widget.TextView r1 = r11.b0
            java.lang.CharSequence r1 = r1.getHint()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L5b:
            android.widget.TextView r0 = r11.c0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L84
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r11.V
            r0.<init>(r1)
            android.widget.TextView r1 = r11.c0
            java.lang.CharSequence r1 = r1.getHint()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L84:
            android.widget.EditText r0 = r11.f674k0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lad
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r11.V
            r0.<init>(r1)
            android.widget.EditText r1 = r11.f674k0
            java.lang.CharSequence r1 = r1.getHint()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        Lad:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r0 = r0.getUserType()
            r1 = 1
            java.lang.Class<com.bxkj.equipment.i> r2 = com.bxkj.equipment.i.class
            if (r0 != r1) goto Lf0
            android.content.Context r0 = r11.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            com.bxkj.equipment.i r1 = (com.bxkj.equipment.i) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r11.F0
            java.lang.String r4 = r11.G0
            com.bxkj.equipment.view.NumberButton r6 = r11.a0
            int r6 = r6.getNumber()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "0"
            r10 = 0
            rx.e r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.equipment.ApplyEquipmentActivity$b r1 = new com.bxkj.equipment.ApplyEquipmentActivity$b
            r1.<init>(r11)
            r0.setDataListener(r1)
            return
        Lf0:
            android.content.Context r0 = r11.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            com.bxkj.equipment.i r1 = (com.bxkj.equipment.i) r1
            java.lang.String r2 = r11.H0
            int r3 = r11.I0
            java.lang.String r4 = r11.G0
            com.bxkj.equipment.view.NumberButton r6 = r11.a0
            int r6 = r6.getNumber()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "0"
            r10 = 0
            rx.e r1 = r1.f(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.equipment.ApplyEquipmentActivity$c r1 = new com.bxkj.equipment.ApplyEquipmentActivity$c
            r1.<init>(r11)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.TextView r0 = r2.Z
            com.bxkj.equipment.a r1 = new com.bxkj.equipment.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.Y
            com.bxkj.equipment.b r1 = new com.bxkj.equipment.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.b0
            com.bxkj.equipment.c r1 = new com.bxkj.equipment.c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.c0
            com.bxkj.equipment.d r1 = new com.bxkj.equipment.d
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            com.bxkj.equipment.view.NumberButton r0 = r2.a0
            com.bxkj.equipment.ApplyEquipmentActivity$a r1 = new com.bxkj.equipment.ApplyEquipmentActivity$a
            r1.<init>(r2)
            r0.g(r1)
            android.widget.Button r0 = r2.f675p0
            com.bxkj.equipment.e r1 = new com.bxkj.equipment.e
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.equipment.R.layout.ac_apply_equipment
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "teacherCurriculumId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.H0 = r0
        L16:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "week"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.I0 = r0
        L2d:
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "借用器材"
            r2.setTitle(r0)
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.bxkj.equipment.R.color.colorWhite
            int r0 = r0.getColor(r1)
            r2.d0(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.equipment.R.id.tv_campus
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            int r1 = com.bxkj.equipment.R.id.tv_name
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            int r1 = com.bxkj.equipment.R.id.number_button
            android.view.View r1 = r0.findViewById(r1)
            com.bxkj.equipment.view.NumberButton r1 = (com.bxkj.equipment.view.NumberButton) r1
            r0.a0 = r1
            int r1 = com.bxkj.equipment.R.id.tv_receive_date
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            int r1 = com.bxkj.equipment.R.id.tv_return_date
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            int r1 = com.bxkj.equipment.R.id.et_reason
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.f674k0 = r1
            int r1 = com.bxkj.equipment.R.id.bt_commit
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.f675p0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

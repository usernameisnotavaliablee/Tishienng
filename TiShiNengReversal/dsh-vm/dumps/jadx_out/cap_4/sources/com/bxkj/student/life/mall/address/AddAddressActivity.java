package com.bxkj.student.life.mall.address;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AddAddressActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private java.lang.String G0;
    private java.lang.String H0;
    private java.lang.String I0;
    private java.lang.String J0;
    private final int K0;
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private android.widget.EditText a0;
    private android.widget.EditText b0;
    private android.widget.Button c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f1028k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f1029p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.address.AddAddressActivity a;

        a(com.bxkj.student.life.mall.address.AddAddressActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.life.mall.address.MyAddressListActivity> r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.life.mall.address.MyAddressListActivity r2 = (com.bxkj.student.life.mall.address.MyAddressListActivity) r2
                if (r2 == 0) goto L11
                r2.t0()
            L11:
                com.bxkj.student.life.mall.address.AddAddressActivity r2 = r1.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.AddAddressActivity.g0(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L25
                com.bxkj.student.life.mall.address.AddAddressActivity r2 = r1.a
                java.lang.String r0 = "添加成功"
                r2.f0(r0)
                goto L2c
            L25:
                com.bxkj.student.life.mall.address.AddAddressActivity r2 = r1.a
                java.lang.String r0 = "修改成功"
                r2.f0(r0)
            L2c:
                com.bxkj.student.life.mall.address.AddAddressActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public AddAddressActivity() {
            r1 = this;
            r1.<init>()
            r0 = 170(0xaa, float:2.38E-43)
            r1.K0 = r0
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String g0(com.bxkj.student.life.mall.address.AddAddressActivity r0) {
            java.lang.String r0 = r0.f1028k0
            return r0
    }

    private void h0() {
            r8 = this;
            android.widget.EditText r0 = r8.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L1e
            android.widget.EditText r0 = r8.Y
            java.lang.CharSequence r0 = r0.getHint()
            r8.f0(r0)
            return
        L1e:
            android.widget.EditText r0 = r8.Z
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            android.widget.EditText r0 = r8.Z
            java.lang.CharSequence r0 = r0.getHint()
            r8.f0(r0)
            return
        L3c:
            int r0 = r7.length()
            r1 = 11
            if (r0 >= r1) goto L4a
            java.lang.String r0 = "请输入正确的手机号码"
            r8.f0(r0)
            return
        L4a:
            android.widget.EditText r0 = r8.a0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L68
            android.widget.EditText r0 = r8.a0
            java.lang.CharSequence r0 = r0.getHint()
            r8.f0(r0)
            return
        L68:
            android.widget.EditText r0 = r8.b0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L86
            android.widget.EditText r0 = r8.b0
            java.lang.CharSequence r0 = r0.getHint()
            r8.f0(r0)
            return
        L86:
            android.content.Context r0 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            java.lang.String r2 = r8.f1028k0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getOpenId()
            java.lang.String r4 = r8.I0
            rx.e r1 = r1.y(r2, r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.address.AddAddressActivity$a r1 = new com.bxkj.student.life.mall.address.AddAddressActivity$a
            r1.<init>(r8)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.EditText r0 = r1.a0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.c0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492893(0x7f0c001d, float:1.860925E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "addressId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f1028k0 = r0
            java.lang.String r0 = "编辑收货地址"
            r2.setTitle(r0)
            goto L21
        L1c:
            java.lang.String r0 = "添加收货地址"
            r2.setTitle(r0)
        L21:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L3a
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.EditText r1 = r2.Y
            r1.setText(r0)
        L3a:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "phone"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L53
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.EditText r1 = r2.Z
            r1.setText(r0)
        L53:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "city"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L6c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.EditText r1 = r2.a0
            r1.setText(r0)
        L6c:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "areaId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L82
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.I0 = r0
        L82:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "address"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L9b
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.EditText r1 = r2.b0
            r1.setText(r0)
        L9b:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "添加收货地址"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296928(0x7f0902a0, float:1.8211787E38)
            android.view.View r0 = r1.findViewById(r2)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.a0 = r0
            r0 = 2131296935(0x7f0902a7, float:1.82118E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.Y = r0
            r0 = 2131296941(0x7f0902ad, float:1.8211813E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.Z = r0
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.a0 = r2
            r2 = 2131296926(0x7f09029e, float:1.8211782E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.b0 = r2
            r2 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.c0 = r2
            return
    }

    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            r0 = -1
            if (r3 == r0) goto L7
            goto L5b
        L7:
            if (r4 != 0) goto La
            goto L5b
        La:
            r3 = 170(0xaa, float:2.38E-43)
            if (r2 != r3) goto L5b
            java.lang.String r2 = "provinceId"
            java.lang.String r2 = r4.getStringExtra(r2)
            r1.f1029p0 = r2
            java.lang.String r2 = "provinceName"
            java.lang.String r2 = r4.getStringExtra(r2)
            r1.F0 = r2
            java.lang.String r2 = "cityId"
            java.lang.String r2 = r4.getStringExtra(r2)
            r1.G0 = r2
            java.lang.String r2 = "cityName"
            java.lang.String r2 = r4.getStringExtra(r2)
            r1.H0 = r2
            java.lang.String r2 = "areaId"
            java.lang.String r2 = r4.getStringExtra(r2)
            r1.I0 = r2
            java.lang.String r2 = "areaName"
            java.lang.String r2 = r4.getStringExtra(r2)
            r1.J0 = r2
            android.widget.EditText r2 = r1.a0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.F0
            r3.append(r4)
            java.lang.String r4 = r1.H0
            r3.append(r4)
            java.lang.String r4 = r1.J0
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
        L5b:
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131296581(0x7f090145, float:1.8211083E38)
            if (r3 == r0) goto L1e
            r0 = 2131296928(0x7f0902a0, float:1.8211787E38)
            if (r3 == r0) goto Lf
            return
        Lf:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.life.mall.address.ChooseCityActivity> r1 = com.bxkj.student.life.mall.address.ChooseCityActivity.class
            r3.<init>(r0, r1)
            r0 = 170(0xaa, float:2.38E-43)
            r2.startActivityForResult(r3, r0)
            return
        L1e:
            r2.h0()
            return
    }
}

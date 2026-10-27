package com.bxkj.student.home.physicaltest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AdmissionTicketActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.ImageView G0;
    private android.widget.ImageView H0;
    private androidx.recyclerview.widget.RecyclerView I0;
    private cn.bluemobi.dylan.smartwebview.SmartWebView J0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> K0;
    private java.lang.String L0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> M0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f774k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f775p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.AdmissionTicketActivity k;

        a(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "scheduleName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "开始时间："
                r0.append(r1)
                java.lang.String r1 = "beginTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299113(0x7f090b29, float:1.8216218E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "结束时间："
                r0.append(r1)
                java.lang.String r1 = "endTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298894(0x7f090a4e, float:1.8215774E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "预约时间："
                r0.append(r1)
                java.lang.String r1 = "appTime"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 2131298785(0x7f0909e1, float:1.8215553E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.bxkj.student.common.utils.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.student.home.physicaltest.AdmissionTicketActivity g;

        b(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.utils.UniversalItemDecoration
        public com.bxkj.student.common.utils.UniversalItemDecoration.b a(int r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0 = r2.g
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.physicaltest.AdmissionTicketActivity.g0(r0)
                int r0 = r0.getItemCount()
                if (r3 == r0) goto L2f
                com.bxkj.student.common.utils.UniversalItemDecoration$a r3 = new com.bxkj.student.common.utils.UniversalItemDecoration$a
                r3.<init>()
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.student.home.physicaltest.AdmissionTicketActivity.k0(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
                r3.d = r0
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.student.home.physicaltest.AdmissionTicketActivity.l0(r0)
                r1 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
                r3.f = r0
                return r3
            L2f:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.AdmissionTicketActivity a;

        c(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.physicaltest.AdmissionTicketActivity.m0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0 = r2.a
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity.j0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.home.physicaltest.AdmissionTicketActivity a;

        d(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity r2 = r1.a
                java.lang.String r0 = com.bxkj.student.home.physicaltest.AdmissionTicketActivity.h0(r2)
                com.bxkj.student.home.physicaltest.AdmissionTicketActivity.i0(r2, r0)
                return
        }
    }

    public AdmissionTicketActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0) {
            java.lang.String r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0, java.lang.String r1) {
            r0.p0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0, java.util.Map r1) {
            r0.q0(r1)
            return
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.physicaltest.AdmissionTicketActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void n0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.C1()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.AdmissionTicketActivity$c r1 = new com.bxkj.student.home.physicaltest.AdmissionTicketActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private void p0(java.lang.String r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r1 = 1
            r0.putExtra(r4, r1)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r0 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r0)
            return
    }

    private void q0(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            android.widget.TextView r0 = r3.Y
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "姓名："
            r1.append(r2)
            java.lang.String r2 = "name"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.Z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "学号："
            r1.append(r2)
            java.lang.String r2 = "userNum"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "性别："
            r1.append(r2)
            java.lang.String r2 = "sex"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "年级："
            r1.append(r2)
            java.lang.String r2 = "grade"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "院系："
            r1.append(r2)
            java.lang.String r2 = "dept"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.f774k0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "专业："
            r1.append(r2)
            java.lang.String r2 = "major"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.f775p0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "班级："
            r1.append(r2)
            java.lang.String r2 = "class"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.lang.String r0 = "IDCard"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Ldb
            android.widget.TextView r1 = r3.F0
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.F0
            r1.setText(r0)
        Ldb:
            java.lang.String r0 = "collectPhoto"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
            r3.L0 = r0
            android.content.Context r0 = r3.V
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            java.lang.String r1 = r3.L0
            com.bumptech.glide.h r0 = r0.M(r1)
            r1 = 2131690097(0x7f0f0271, float:1.9009228E38)
            com.bumptech.glide.request.a r0 = r0.y0(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            com.bumptech.glide.request.a r0 = r0.z(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            android.widget.ImageView r1 = r3.H0
            r0.m1(r1)
            java.lang.String r0 = "erWeiMaCode"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
            r3.o0(r0)
            android.widget.ImageView r0 = r3.H0
            com.bxkj.student.home.physicaltest.AdmissionTicketActivity$d r1 = new com.bxkj.student.home.physicaltest.AdmissionTicketActivity$d
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "meaInfo"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
            r3.K0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.M0
            r1.g(r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r3.J0
            java.lang.String r1 = "specification"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r0.h(r4)
            cn.bluemobi.dylan.smartwebview.SmartWebView r4 = r3.J0
            android.webkit.WebView r4 = r4.getWebView()
            android.webkit.WebSettings r4 = r4.getSettings()
            android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.LARGEST
            r4.setTextSize(r0)
            return
    }

    private void r0(android.app.Activity r2, float r3) {
            r1 = this;
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
            r0.screenBrightness = r3
            r2.setAttributes(r0)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492988(0x7f0c007c, float:1.8609443E38)
            return r0
    }

    public void R() {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.r0(r4, r0)
            android.widget.FrameLayout r0 = r4.P()
            r1 = 8
            r0.setVisibility(r1)
            com.bxkj.student.home.physicaltest.AdmissionTicketActivity$a r0 = new com.bxkj.student.home.physicaltest.AdmissionTicketActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493295(0x7f0c01af, float:1.8610066E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.K0
            r0.<init>(r4, r1, r2, r3)
            r4.M0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.I0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.I0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.M0
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.I0
            com.bxkj.student.home.physicaltest.AdmissionTicketActivity$b r1 = new com.bxkj.student.home.physicaltest.AdmissionTicketActivity$b
            r1.<init>(r4)
            r0.addItemDecoration(r1)
            r4.n0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测准考证"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298997(0x7f090ab5, float:1.8215983E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299099(0x7f090b1b, float:1.821619E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131298922(0x7f090a6a, float:1.821583E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131299200(0x7f090b80, float:1.8216395E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298971(0x7f090a9b, float:1.821593E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f774k0 = r1
            r1 = 2131298835(0x7f090a13, float:1.8215654E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f775p0 = r1
            r1 = 2131298943(0x7f090a7f, float:1.8215873E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F0 = r1
            r1 = 2131297216(0x7f0903c0, float:1.821237E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.G0 = r1
            r1 = 2131297240(0x7f0903d8, float:1.821242E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.H0 = r1
            r1 = 2131298430(0x7f09087e, float:1.8214833E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.I0 = r1
            r1 = 2131298609(0x7f090931, float:1.8215196E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.J0 = r1
            return
    }

    public void o0(java.lang.String r3) {
            r2 = this;
            com.bxkj.base.v2.common.qrcode.b r0 = new com.bxkj.base.v2.common.qrcode.b
            androidx.fragment.app.FragmentActivity r1 = r2.W
            r0.<init>(r1)
            r1 = 2131689689(0x7f0f00d9, float:1.90084E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.graphics.Bitmap r3 = r0.f(r3, r1)
            android.widget.ImageView r0 = r2.G0
            r0.setImageBitmap(r3)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.r0(r1, r0)
            super.onDestroy()
            return
    }
}

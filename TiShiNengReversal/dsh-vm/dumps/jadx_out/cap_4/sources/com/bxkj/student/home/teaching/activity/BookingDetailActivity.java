package com.bxkj.student.home.teaching.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BookingDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.Button I0;
    private java.lang.String J0;
    private java.lang.String K0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f800k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f801p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.activity.BookingDetailActivity a;

        a(com.bxkj.student.home.teaching.activity.BookingDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                java.lang.String r2 = "activityId"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity.u0(r0, r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.k0(r0)
                java.lang.String r2 = "name"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.m0(r0)
                java.lang.String r2 = "term"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.n0(r0)
                java.lang.String r2 = "totalNum"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.o0(r0)
                java.lang.String r2 = "defaultRoleScore"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.p0(r0)
                java.lang.String r2 = "defaultCourseNum"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.q0(r0)
                java.lang.String r2 = "type"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.r0(r0)
                java.lang.String r2 = "address"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.s0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "appointmentBeginTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
                r2.append(r3)
                java.lang.String r3 = "-"
                r2.append(r3)
                java.lang.String r4 = "appointmentEndTime"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r4)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.t0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "actBeginTime"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r4)
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = "actEndTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.l0(r0)
                java.lang.String r2 = "memo"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                android.text.Spanned r2 = android.text.Html.fromHtml(r2)
                r0.setText(r2)
                java.lang.String r0 = "zhuangtai"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                r3 = 1
                if (r2 != 0) goto Lff
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r6 = r5.a
                android.widget.Button r6 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r6)
                r6.setEnabled(r3)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r6 = r5.a
                android.widget.Button r6 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r6)
                java.lang.String r0 = "预约"
                r6.setText(r0)
                return
            Lff:
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                if (r2 != r3) goto L11a
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r6 = r5.a
                android.widget.Button r6 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r6)
                r6.setEnabled(r3)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r6 = r5.a
                android.widget.Button r6 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r6)
                java.lang.String r0 = "取消预约"
                r6.setText(r0)
                return
            L11a:
                int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                r0 = 2
                if (r6 != r0) goto L135
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r6 = r5.a
                android.widget.Button r6 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r6)
                r6.setEnabled(r1)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r6 = r5.a
                android.widget.Button r6 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r6)
                java.lang.String r0 = "人数已满"
                r6.setText(r0)
            L135:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.activity.BookingDetailActivity a;

        b(com.bxkj.student.home.teaching.activity.BookingDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r3, java.lang.String r4) {
                r2 = this;
                super.netOnOtherStatus(r3, r4)
                r4 = 202(0xca, float:2.83E-43)
                if (r3 != r4) goto L25
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r3 = r2.a
                android.content.Intent r4 = new android.content.Intent
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.w0(r0)
                java.lang.Class<com.bxkj.student.home.teaching.activity.BookingLessonActivity> r1 = com.bxkj.student.home.teaching.activity.BookingLessonActivity.class
                r4.<init>(r0, r1)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r0 = r2.a
                java.lang.String r0 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.j0(r0)
                java.lang.String r1 = "id"
                android.content.Intent r4 = r4.putExtra(r1, r0)
                r3.startActivity(r4)
            L25:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r2)
                java.lang.String r0 = "取消预约"
                r2.setText(r0)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r2 = r1.a
                com.bxkj.student.home.teaching.activity.BookingDetailActivity.v0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.activity.BookingDetailActivity a;

        c(com.bxkj.student.home.teaching.activity.BookingDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.i0(r2)
                java.lang.String r0 = "预约"
                r2.setText(r0)
                com.bxkj.student.home.teaching.activity.BookingDetailActivity r2 = r1.a
                com.bxkj.student.home.teaching.activity.BookingDetailActivity.v0(r2)
                return
        }
    }

    public BookingDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private /* synthetic */ void A0() {
            r0 = this;
            r0.y0()
            return
    }

    private /* synthetic */ void B0(android.view.View r2) {
            r1 = this;
            android.widget.Button r2 = r1.I0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "预约"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1a
            r1.x0()
            return
        L1a:
            android.widget.Button r2 = r1.I0
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "取消预约"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r1.V
            r2.<init>(r0)
            java.lang.String r0 = "确定要取消预约吗?"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setMessage(r0)
            java.lang.String r0 = "我再想想"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setLeftButtonText(r0)
            java.lang.String r0 = "直接取消"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonText(r0)
            com.bxkj.student.home.teaching.activity.c r0 = new com.bxkj.student.home.teaching.activity.c
            r0.<init>(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonOnClickListener(r0)
            r2.show()
        L55:
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0, android.view.View r1) {
            r0.B0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            r0.A0()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button i0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.Button r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String j0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            java.lang.String r0 = r0.J0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView p0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView q0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.f800k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView r0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.f801p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView s0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView t0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ void u0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0, java.lang.String r1) {
            r0.K0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            r0.z0()
            return
    }

    static /* synthetic */ android.content.Context w0(com.bxkj.student.home.teaching.activity.BookingDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void x0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.J0
            rx.e r1 = r1.i0(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.activity.BookingDetailActivity$b r1 = new com.bxkj.student.home.teaching.activity.BookingDetailActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void y0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.K0
            rx.e r1 = r1.u(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.activity.BookingDetailActivity$c r1 = new com.bxkj.student.home.teaching.activity.BookingDetailActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void z0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.J0
            rx.e r1 = r1.q(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.activity.BookingDetailActivity$a r1 = new com.bxkj.student.home.teaching.activity.BookingDetailActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.I0
            com.bxkj.student.home.teaching.activity.b r1 = new com.bxkj.student.home.teaching.activity.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492910(0x7f0c002e, float:1.8609285E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.J0 = r0
        L16:
            android.widget.FrameLayout r0 = r2.P()
            r1 = 4
            r0.setVisibility(r1)
            r2.z0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "活动详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298750(0x7f0909be, float:1.8215482E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298753(0x7f0909c1, float:1.8215488E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131298755(0x7f0909c3, float:1.8215492E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131298757(0x7f0909c5, float:1.8215496E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131298758(0x7f0909c6, float:1.8215498E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298759(0x7f0909c7, float:1.82155E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f800k0 = r1
            r1 = 2131298760(0x7f0909c8, float:1.8215502E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f801p0 = r1
            r1 = 2131298761(0x7f0909c9, float:1.8215504E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F0 = r1
            r1 = 2131298762(0x7f0909ca, float:1.8215506E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.G0 = r1
            r1 = 2131298751(0x7f0909bf, float:1.8215484E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.H0 = r1
            r1 = 2131296580(0x7f090144, float:1.821108E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.I0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            r0.z0()
            return
    }
}

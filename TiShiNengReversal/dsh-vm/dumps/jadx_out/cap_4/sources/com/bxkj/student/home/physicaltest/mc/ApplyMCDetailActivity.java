package com.bxkj.student.home.physicaltest.mc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyMCDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private java.lang.String I0;
    private java.util.List<java.lang.String> J0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> K0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.MyGridView f788k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f789p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity e;

        a(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.lang.String r3) {
                r1 = this;
                r0 = 2131297161(0x7f090389, float:1.821226E38)
                r2.s(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity a;

        b(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r7) {
                r6 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.n0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "姓名："
                r2.append(r3)
                java.lang.String r3 = "userName"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.o0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "学号："
                r2.append(r3)
                java.lang.String r3 = "userNum"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.r0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "学期："
                r2.append(r3)
                java.lang.String r3 = "year"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.t0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "类型："
                r2.append(r3)
                java.lang.String r3 = "meaStatusName"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.p0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "原因："
                r2.append(r3)
                java.lang.String r3 = "applyMemo"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.q0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "状态："
                r2.append(r3)
                java.lang.String r3 = "status"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.s0(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "时间："
                r2.append(r3)
                java.lang.String r3 = "applyDate"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                java.lang.String r0 = "auditMemo"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                r3 = 8
                if (r2 == 0) goto L102
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.m0(r0)
                r0.setVisibility(r3)
                goto L125
            L102:
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r2 = r6.a
                android.widget.TextView r2 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.m0(r2)
                r2.setVisibility(r1)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r2 = r6.a
                android.widget.TextView r2 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.m0(r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "审批意见："
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.setText(r0)
            L125:
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                java.lang.String r2 = "imgs"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r2, r4)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.u0(r0, r2)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0 = r6.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r0 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.j0(r0)
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r2 = r6.a
                java.util.List r2 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.l0(r2)
                r0.c(r2)
                java.lang.String r0 = "statusCode"
                int r7 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                if (r7 != 0) goto L153
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r7 = r6.a
                android.widget.TextView r7 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.k0(r7)
                r7.setVisibility(r1)
                return
            L153:
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r7 = r6.a
                android.widget.TextView r7 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.k0(r7)
                r7.setVisibility(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity a;

        c(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r2 = r1.a
                com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.v0(r2)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity> r0 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r2 = (com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity) r2
                if (r2 == 0) goto L16
                r2.l0()
            L16:
                return
        }
    }

    public ApplyMCDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private /* synthetic */ void A0(android.view.View r2) {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r1.V
            r2.<init>(r0)
            java.lang.String r0 = "确定要取消申请吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setMessage(r0)
            com.bxkj.student.home.physicaltest.mc.c r0 = new com.bxkj.student.home.physicaltest.mc.c
            r0.<init>(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonOnClickListener(r0)
            r2.show()
            return
    }

    private void B0(java.lang.String[] r4, int r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r0.putExtra(r4, r5)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r5 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r5)
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            r0.z0()
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0, android.view.View r1) {
            r0.A0(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.y0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a j0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            java.util.List<java.lang.String> r0 = r0.J0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView p0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView q0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView r0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView s0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.f789p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView t0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void u0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0, java.util.List r1) {
            r0.J0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity r0) {
            r0.x0()
            return
    }

    private void w0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.I0
            rx.e r1 = r1.y1(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity$c r1 = new com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity$c
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void x0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.I0
            rx.e r1 = r1.w(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity$b r1 = new com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void y0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            java.util.List<java.lang.String> r1 = r0.J0
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.List<java.lang.String> r2 = r0.J0
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.B0(r1, r3)
            return
    }

    private /* synthetic */ void z0() {
            r0 = this;
            r0.w0()
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.f788k0
            com.bxkj.student.home.physicaltest.mc.d r1 = new com.bxkj.student.home.physicaltest.mc.d
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            android.widget.TextView r0 = r2.H0
            com.bxkj.student.home.physicaltest.mc.e r1 = new com.bxkj.student.home.physicaltest.mc.e
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492901(0x7f0c0025, float:1.8609267E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "meaNonStuApplyId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.I0 = r0
        L16:
            com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity$a r0 = new com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493280(0x7f0c01a0, float:1.8610036E38)
            java.util.List<java.lang.String> r3 = r4.J0
            r0.<init>(r4, r1, r2, r3)
            r4.K0 = r0
            cn.bluemobi.dylan.base.view.MyGridView r1 = r4.f788k0
            r1.setAdapter(r0)
            r4.x0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "申请免测详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131298997(0x7f090ab5, float:1.8215983E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            r2 = 2131299154(0x7f090b52, float:1.8216301E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131299065(0x7f090af9, float:1.821612E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            r2 = 2131297031(0x7f090307, float:1.8211995E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.f788k0 = r2
            r2 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f789p0 = r2
            r2 = 2131299116(0x7f090b2c, float:1.8216224E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.F0 = r2
            r2 = 2131298786(0x7f0909e2, float:1.8215555E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            r2 = 2131296591(0x7f09014f, float:1.8211103E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.H0 = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 4
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

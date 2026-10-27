package com.bxkj.student.home.teaching.leave.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LeaveRecordDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private cn.bluemobi.dylan.base.view.MyGridView G0;
    private java.lang.String H0;
    private java.util.List<java.lang.String> I0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f969k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f970p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity$a$a, reason: collision with other inner class name */
        class C0094a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
            final /* synthetic */ com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.a e;

            C0094a(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.a r1, android.content.Context r2, int r3, java.util.List r4) {
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

        a(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.q0(r0)
                java.lang.String r2 = "week"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.l0(r0)
                java.lang.String r2 = "teacherCurriculumName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.o0(r0)
                java.lang.String r2 = "auditorName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.p0(r0)
                java.lang.String r2 = "applyDate"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.m0(r0)
                java.lang.String r2 = "applyMemo"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r0.setText(r2)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.n0(r0)
                java.lang.String r2 = "status"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r0.setText(r2)
                java.lang.String r0 = "auditDate"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                r3 = 8
                if (r2 == 0) goto L82
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r2 = r4.a
                android.widget.TextView r2 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.k0(r2)
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r3)
                goto L91
            L82:
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r2 = r4.a
                android.widget.TextView r2 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.k0(r2)
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r1)
            L91:
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r2 = r4.a
                android.widget.TextView r2 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.k0(r2)
                r2.setText(r0)
                java.lang.String r0 = "auditMemo"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 == 0) goto Lb6
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r1 = r4.a
                android.widget.TextView r1 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.j0(r1)
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.setVisibility(r3)
                goto Lc5
            Lb6:
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r2 = r4.a
                android.widget.TextView r2 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.j0(r2)
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r1)
            Lc5:
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r1 = r4.a
                android.widget.TextView r1 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.j0(r1)
                r1.setText(r0)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0 = r4.a
                java.lang.String r1 = "imgs"
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                java.util.List r5 = cn.bluemobi.dylan.http.JsonParse.getList(r5, r1, r2)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.r0(r0, r5)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r5 = r4.a
                cn.bluemobi.dylan.base.view.MyGridView r5 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.h0(r5)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity$a$a r0 = new com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity$a$a
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r1 = r4.a
                android.content.Context r1 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.s0(r1)
                com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r2 = r4.a
                java.util.List r2 = com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity.i0(r2)
                r3 = 2131493280(0x7f0c01a0, float:1.8610036E38)
                r0.<init>(r4, r1, r3, r2)
                r5.setAdapter(r0)
                return
        }
    }

    public LeaveRecordDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.t0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.MyGridView h0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            cn.bluemobi.dylan.base.view.MyGridView r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            java.util.List<java.lang.String> r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.f970p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.f969k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView p0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView q0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0, java.util.List r1) {
            r0.I0 = r1
            return
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void t0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            java.util.List<java.lang.String> r1 = r0.I0
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.List<java.lang.String> r2 = r0.I0
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.u0(r1, r3)
            return
    }

    private void u0(java.lang.String[] r4, int r5) {
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

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.G0
            com.bxkj.student.home.teaching.leave.recorder.a r1 = new com.bxkj.student.home.teaching.leave.recorder.a
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492967(0x7f0c0067, float:1.86094E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.H0 = r0
        L1f:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.String r1 = "加载中..."
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setLoadingMessage(r1)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.H0
            rx.e r1 = r1.C0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity$a r1 = new com.bxkj.student.home.teaching.leave.recorder.LeaveRecordDetailActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "请假记录详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299190(0x7f090b76, float:1.8216374E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298954(0x7f090a8a, float:1.8215896E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131299065(0x7f090af9, float:1.821612E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f969k0 = r1
            r1 = 2131298831(0x7f090a0f, float:1.8215646E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f970p0 = r1
            r1 = 2131298830(0x7f090a0e, float:1.8215644E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F0 = r1
            r1 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.view.MyGridView r1 = (cn.bluemobi.dylan.base.view.MyGridView) r1
            r0.G0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

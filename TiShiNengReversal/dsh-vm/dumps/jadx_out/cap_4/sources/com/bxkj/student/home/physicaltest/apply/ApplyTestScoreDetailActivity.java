package com.bxkj.student.home.physicaltest.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyTestScoreDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.view.MyGridView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.TextView I0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f780k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f781p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity a;

        a(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.g0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "姓\u3000\u3000名："
                r1.append(r2)
                java.lang.String r2 = "userName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.h0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "学\u3000\u3000号："
                r1.append(r2)
                java.lang.String r2 = "userNum"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.k0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "原\u3000\u3000因："
                r1.append(r2)
                java.lang.String r2 = "applyReason"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.n0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "状\u3000\u3000态："
                r1.append(r2)
                java.lang.String r2 = "status"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.p0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "时\u3000\u3000间："
                r1.append(r2)
                java.lang.String r2 = "createTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.o0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "学\u3000\u3000年："
                r1.append(r2)
                java.lang.String r2 = "year"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.j0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "项\u3000\u3000目："
                r1.append(r2)
                java.lang.String r2 = "examName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.l0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "原始成绩："
                r1.append(r2)
                java.lang.String r2 = "rawScores"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.m0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "申诉成绩："
                r1.append(r2)
                java.lang.String r2 = "complaintResults"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.i0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "联系电话："
                r1.append(r2)
                java.lang.String r2 = "userPhone"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                return
        }
    }

    public ApplyTestScoreDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView g0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView h0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView i0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.f781p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.f780k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView p0(com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity r0) {
            android.widget.TextView r0 = r0.I0
            return r0
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492904(0x7f0c0028, float:1.8609273E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L32
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Context r1 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.Class<d0.a> r2 = d0.a.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            d0.a r2 = (d0.a) r2
            rx.e r0 = r2.B0(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity$a r1 = new com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
        L32:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "体测成绩申诉详情"
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
            r2 = 2131299053(0x7f090aed, float:1.8216097E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            r2 = 2131299094(0x7f090b16, float:1.821618E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f780k0 = r2
            r2 = 2131299065(0x7f090af9, float:1.821612E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f781p0 = r2
            r2 = 2131297031(0x7f090307, float:1.8211995E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.F0 = r2
            r2 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            r2 = 2131299116(0x7f090b2c, float:1.8216224E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.H0 = r2
            r2 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.I0 = r2
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

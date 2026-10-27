package com.bxkj.student.home.physicaltest.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ScoreDoubtActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.lang.String c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity a;

        a(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r4 = this;
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0 = r4.a
                android.content.Intent r1 = r0.getIntent()
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity.k0(r2)
                java.lang.Class<com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity> r3 = com.bxkj.student.home.physicaltest.apply.ApplyScoreDoubtActivity.class
                android.content.Intent r1 = r1.setClass(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity k;

        b(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "year"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r3.J(r1, r0)
                java.lang.String r0 = "examName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299053(0x7f090aed, float:1.8216097E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "原始成绩:"
                r0.append(r1)
                java.lang.String r1 = "rawScores"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "申诉成绩:"
                r0.append(r1)
                java.lang.String r1 = "complaintResults"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299062(0x7f090af6, float:1.8216115E38)
                r3.J(r1, r0)
                java.lang.String r0 = "createTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299158(0x7f090b56, float:1.821631E38)
                r3.J(r1, r0)
                java.lang.String r0 = "status"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity a;

        c(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity.j0(r0, r3)
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity.h0(r3)
                com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity.i0(r0)
                r3.g(r0)
                return
        }
    }

    public ScoreDoubtActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.m0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0, java.util.List r1) {
            r0.Y = r1
            return
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void m0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.V
            java.lang.Class<com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity> r3 = com.bxkj.student.home.physicaltest.apply.ApplyTestScoreDetailActivity.class
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.b0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.startActivity(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.b0
            com.bxkj.student.home.physicaltest.apply.c r1 = new com.bxkj.student.home.physicaltest.apply.c
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493640(0x7f0c0308, float:1.8610766E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "meaScoreId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.c0 = r0
        L16:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity$b r0 = new com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity$b
            android.content.Context r1 = r4.V
            r2 = 2131493231(0x7f0c016f, float:1.8609936E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Y
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            android.widget.TextView r0 = r4.a0
            java.lang.String r1 = "如果对成绩有异议，请点击右上角+号反馈"
            r0.setText(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            r4.l0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "我的体测成绩申诉列表"
            r2.setTitle(r0)
            com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity$a r0 = new com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity$a
            r0.<init>(r2)
            r1 = 2131231169(0x7f0801c1, float:1.8078411E38)
            r2.Z(r1, r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            return
    }

    public void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.c0
            rx.e r1 = r1.H0(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity$c r1 = new com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

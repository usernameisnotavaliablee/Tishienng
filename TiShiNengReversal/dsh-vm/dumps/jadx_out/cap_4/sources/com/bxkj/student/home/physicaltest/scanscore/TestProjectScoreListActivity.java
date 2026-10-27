package com.bxkj.student.home.physicaltest.scanscore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TestProjectScoreListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Y;
    private android.widget.TextView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private java.lang.String c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity k;

        a(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "examName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "actualScore"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "examunit"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "score"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "分"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r3.J(r1, r0)
                java.lang.String r0 = "rank"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299062(0x7f090af6, float:1.8216115E38)
                r3.J(r0, r4)
                r4 = 2131299116(0x7f090b2c, float:1.8216224E38)
                android.view.View r4 = r3.h(r4)
                r0 = 4
                r4.setVisibility(r0)
                r4 = 2131297100(0x7f09034c, float:1.8212135E38)
                r0 = 0
                r3.N(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity a;

        b(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity.k0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity.j0(r0, r3)
                com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity.h0(r3)
                com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity.i0(r0)
                r3.g(r0)
                return
        }
    }

    public TestProjectScoreListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0) {
            r0.m0()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void l0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.c0
            rx.e r1 = r1.P(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity$b r1 = new com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void m0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity> r2 = com.bxkj.student.home.physicaltest.apply.ScoreDoubtActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "meaScoreId"
            java.lang.String r2 = r3.c0
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493039(0x7f0c00af, float:1.8609547E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "stuName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L3c
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "stuNum"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.widget.TextView r2 = r5.Z
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "姓名："
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "\u3000\u3000\u3000学号："
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.setText(r0)
        L3c:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "meaScoreId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L52
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r5.c0 = r0
        L52:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r5, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r5.Y
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity$a r0 = new com.bxkj.student.home.physicaltest.scanscore.TestProjectScoreListActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493333(0x7f0c01d5, float:1.8610143E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.a0
            r0.<init>(r5, r1, r2, r3)
            r5.b0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r5.Y
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Y
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r5.findViewById(r1)
            r0.setEmptyView(r1)
            r5.l0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "体测分项汇总"
            r2.setTitle(r0)
            com.bxkj.student.home.physicaltest.scanscore.a r0 = new com.bxkj.student.home.physicaltest.scanscore.a
            r0.<init>(r2)
            r1 = 2131690000(0x7f0f0210, float:1.9009031E38)
            r2.Z(r1, r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Y = r1
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

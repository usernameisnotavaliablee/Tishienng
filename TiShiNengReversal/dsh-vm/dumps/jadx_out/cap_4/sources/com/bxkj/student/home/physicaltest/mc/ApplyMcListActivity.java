package com.bxkj.student.home.physicaltest.mc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ApplyMcListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity a;

        a(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r4 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.k0(r2)
                java.lang.Class<com.bxkj.student.home.physicaltest.mc.ApplyMCActivity> r3 = com.bxkj.student.home.physicaltest.mc.ApplyMCActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity k;

        b(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "userName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "userNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298997(0x7f090ab5, float:1.8215983E38)
                r3.J(r1, r0)
                java.lang.String r0 = "year"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299154(0x7f090b52, float:1.8216301E38)
                r3.J(r1, r0)
                java.lang.String r0 = "meaStatusName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299171(0x7f090b63, float:1.8216336E38)
                r3.J(r1, r0)
                java.lang.String r0 = "status"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r3.J(r1, r0)
                java.lang.String r0 = "applyDate"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299158(0x7f090b56, float:1.821631E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity a;

        c(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.j0(r0, r3)
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.h0(r3)
                com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.i0(r0)
                r3.g(r0)
                return
        }
    }

    public ApplyMcListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Y = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.m0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0, java.util.List r1) {
            r0.Y = r1
            return
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private /* synthetic */ void m0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.V
            java.lang.Class<com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity> r3 = com.bxkj.student.home.physicaltest.mc.ApplyMCDetailActivity.class
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.a0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "meaNonStuApplyId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.startActivity(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.a0
            com.bxkj.student.home.physicaltest.mc.f r1 = new com.bxkj.student.home.physicaltest.mc.f
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
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity$b r0 = new com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity$b
            android.content.Context r1 = r4.V
            r2 = 2131493228(0x7f0c016c, float:1.860993E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Y
            r0.<init>(r4, r1, r2, r3)
            r4.a0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            r4.l0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "免测申请列表"
            r2.setTitle(r0)
            com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity$a r0 = new com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity$a
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
            return
    }

    public void l0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.K(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity$c r1 = new com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity$c
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

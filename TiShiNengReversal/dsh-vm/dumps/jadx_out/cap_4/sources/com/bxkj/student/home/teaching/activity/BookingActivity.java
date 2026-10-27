package com.bxkj.student.home.teaching.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BookingActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f798k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f799p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.activity.BookingActivity k;

        a(com.bxkj.student.home.teaching.activity.BookingActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298752(0x7f0909c0, float:1.8215486E38)
                r3.J(r1, r0)
                java.lang.String r0 = "orderDate"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298754(0x7f0909c2, float:1.821549E38)
                r3.J(r1, r0)
                java.lang.String r0 = "activeDate"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131298756(0x7f0909c4, float:1.8215494E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.activity.BookingActivity a;

        b(com.bxkj.student.home.teaching.activity.BookingActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.teaching.activity.BookingActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.activity.BookingActivity.m0(r4)
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.activity.BookingActivity.k0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.activity.BookingActivity.j0(r0)
                com.bxkj.student.home.teaching.activity.BookingActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.activity.BookingActivity.m0(r1)
                com.bxkj.student.home.teaching.activity.BookingActivity r2 = r3.a
                int r2 = com.bxkj.student.home.teaching.activity.BookingActivity.k0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.teaching.activity.BookingActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r4)
                r4.q0()
                com.bxkj.student.home.teaching.activity.BookingActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.teaching.activity.BookingActivity r4 = r3.a
                int r0 = com.bxkj.student.home.teaching.activity.BookingActivity.j0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.teaching.activity.BookingActivity.o0(r4, r0)
                com.bxkj.student.home.teaching.activity.BookingActivity r4 = r3.a
                com.bxkj.student.home.teaching.activity.BookingActivity.p0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.activity.BookingActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.teaching.activity.BookingActivity.o0(r2, r0)
                com.bxkj.student.home.teaching.activity.BookingActivity r2 = r1.a
                com.bxkj.student.home.teaching.activity.BookingActivity.p0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.activity.BookingActivity a;

        c(com.bxkj.student.home.teaching.activity.BookingActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r0)
                r0.w0()
            L20:
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.activity.BookingActivity.l0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.activity.BookingActivity.n0(r0, r3)
                com.bxkj.student.home.teaching.activity.BookingActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.activity.BookingActivity.h0(r3)
                com.bxkj.student.home.teaching.activity.BookingActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.activity.BookingActivity.i0(r0)
                r3.g(r0)
                return
        }
    }

    public BookingActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            r0 = 1
            r1.f798k0 = r0
            r0 = 15
            r1.f799p0 = r0
            r0 = 0
            r1.F0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.activity.BookingActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.r0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            int r0 = r0.f798k0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            int r0 = r0.f799p0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.activity.BookingActivity r0, java.util.List r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.teaching.activity.BookingActivity r0, int r1) {
            r0.f798k0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.activity.BookingActivity r0) {
            r0.q0()
            return
    }

    private void q0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r5.f798k0
            int r4 = r5.f799p0
            rx.e r1 = r1.w0(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.activity.BookingActivity$c r1 = new com.bxkj.student.home.teaching.activity.BookingActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void r0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.V
            java.lang.Class<com.bxkj.student.home.teaching.activity.BookingDetailActivity> r3 = com.bxkj.student.home.teaching.activity.BookingDetailActivity.class
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.c0
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
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.activity.BookingActivity$b r1 = new com.bxkj.student.home.teaching.activity.BookingActivity$b
            r1.<init>(r2)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r0.D()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            com.bxkj.student.home.teaching.activity.a r1 = new com.bxkj.student.home.teaching.activity.a
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492999(0x7f0c0087, float:1.8609466E38)
            return r0
    }

    public void R() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.activity.BookingActivity$a r0 = new com.bxkj.student.home.teaching.activity.BookingActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493232(0x7f0c0170, float:1.8609938E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.b0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "预约活动列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
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

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

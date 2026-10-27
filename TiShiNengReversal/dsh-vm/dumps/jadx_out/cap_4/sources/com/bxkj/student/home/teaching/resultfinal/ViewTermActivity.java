package com.bxkj.student.home.teaching.resultfinal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewTermActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    protected int c0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f977k0;

    /* renamed from: p0, reason: collision with root package name */
    protected int f978p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.resultfinal.ViewTermActivity k;

        a(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "学期："
                r0.append(r1)
                java.lang.String r1 = "sysTermName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298861(0x7f090a2d, float:1.8215707E38)
                r3.J(r1, r0)
                java.lang.String r0 = "sysUserName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "sysUserUserNum"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298991(0x7f090aaf, float:1.821597E38)
                r3.J(r1, r0)
                java.lang.String r0 = "type"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r3.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r0 = 2131299093(0x7f090b15, float:1.8216178E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.home.teaching.resultfinal.ViewTermActivity a;

        b(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r2 = r1.a
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.i0(r4)
                java.lang.Class<com.bxkj.student.home.teaching.resultfinal.AllScoreForTeamActivity> r0 = com.bxkj.student.home.teaching.resultfinal.AllScoreForTeamActivity.class
                r3.<init>(r4, r0)
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.g0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "sysUserName"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                java.lang.String r0 = "stuName"
                android.content.Intent r3 = r3.putExtra(r0, r4)
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.g0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "sysUserUserNum"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                java.lang.String r0 = "stuNum"
                android.content.Intent r3 = r3.putExtra(r0, r4)
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.g0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "stuTeamScoreId"
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.resultfinal.ViewTermActivity a;

        c(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r5 = r4.a
                int r0 = r5.f978p0
                int r1 = r5.c0
                int r2 = r0 / r1
                int r3 = r5.f977k0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.h0(r5)
                r5.q0()
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.j0(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.f977k0 = r3
                r5.k0()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r2 = r1.a
                r0 = 1
                r2.f977k0 = r0
                r2.k0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.resultfinal.ViewTermActivity a;

        d(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.h0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.h0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.f978p0 = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.g0(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r1 = r3.a
                int r1 = r1.f977k0
                r2 = 1
                if (r1 != r2) goto L28
                goto L2c
            L28:
                r0.addAll(r4)
                r4 = r0
            L2c:
                com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.g0(r0)
                r0.g(r4)
                return
        }
    }

    public ViewTermActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 10
            r1.c0 = r0
            r0 = 1
            r1.f977k0 = r0
            r1.f978p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout h0(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.teaching.resultfinal.ViewTermActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.b0
            com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$b r1 = new com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$b
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
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$a r0 = new com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493332(0x7f0c01d4, float:1.8610141E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.a0
            r0.<init>(r5, r1, r2, r3)
            r5.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.Z
            r1.setAdapter(r0)
            r5.l0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "查看学期总分"
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
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Z = r1
            return
    }

    public void k0() {
            r4 = this;
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            int r2 = r4.f977k0
            int r3 = r4.c0
            rx.e r0 = r0.M(r1, r2, r3)
            android.content.Context r1 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$d r1 = new com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$d
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void l0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$c r1 = new com.bxkj.student.home.teaching.resultfinal.ViewTermActivity$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

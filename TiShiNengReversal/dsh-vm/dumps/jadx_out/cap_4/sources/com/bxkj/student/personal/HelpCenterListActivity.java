package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HelpCenterListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView Y;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    protected int c0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f1122k0;

    /* renamed from: p0, reason: collision with root package name */
    protected int f1123p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.personal.HelpCenterListActivity k;

        a(com.bxkj.student.personal.HelpCenterListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                r0 = 2131297200(0x7f0903b0, float:1.8212338E38)
                r1 = 0
                r3.N(r0, r1)
                r0 = 2131298951(0x7f090a87, float:1.821589E38)
                r3.N(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.f()
                int r1 = r1 + 1
                r0.append(r1)
                java.lang.String r1 = "、"
                r0.append(r1)
                java.lang.String r1 = "helpTitle"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 2131299164(0x7f090b5c, float:1.8216322E38)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.personal.HelpCenterListActivity a;

        b(com.bxkj.student.personal.HelpCenterListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.personal.HelpCenterListActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.personal.HelpCenterListActivity.k0(r2)
                java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r3 = com.bxkj.base.webview.H5DetailActivity.class
                r1.<init>(r2, r3)
                com.bxkj.student.personal.HelpCenterListActivity r2 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.personal.HelpCenterListActivity.g0(r2)
                java.lang.Object r2 = r2.getItem(r4)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "helpTitle"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r2, r3)
                java.lang.String r3 = "title"
                r1.putExtra(r3, r2)
                com.bxkj.student.personal.HelpCenterListActivity r2 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.personal.HelpCenterListActivity.g0(r2)
                java.lang.Object r2 = r2.getItem(r4)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "helpContent"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r2, r3)
                java.lang.String r3 = "content"
                r1.putExtra(r3, r2)
                com.bxkj.student.personal.HelpCenterListActivity r2 = r0.a
                r2.startActivity(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.personal.HelpCenterListActivity a;

        c(com.bxkj.student.personal.HelpCenterListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.personal.HelpCenterListActivity r5 = r4.a
                int r0 = r5.f1123p0
                int r1 = r5.c0
                int r2 = r0 / r1
                int r3 = r5.f1122k0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.personal.HelpCenterListActivity.i0(r5)
                r5.q0()
                com.bxkj.student.personal.HelpCenterListActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.personal.HelpCenterListActivity.l0(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.f1122k0 = r3
                r5.m0()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.personal.HelpCenterListActivity r2 = r1.a
                r0 = 1
                r2.f1122k0 = r0
                r2.m0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.HelpCenterListActivity a;

        d(com.bxkj.student.personal.HelpCenterListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.personal.HelpCenterListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.HelpCenterListActivity.i0(r0)
                r0.w0()
                com.bxkj.student.personal.HelpCenterListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.HelpCenterListActivity.i0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.personal.HelpCenterListActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.f1123p0 = r1
                java.lang.String r0 = "data"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
                com.bxkj.student.personal.HelpCenterListActivity r0 = r3.a
                int r1 = r0.f1122k0
                r2 = 1
                if (r1 != r2) goto L1f
                com.bxkj.student.personal.HelpCenterListActivity.j0(r0, r4)
                goto L26
            L1f:
                java.util.List r0 = com.bxkj.student.personal.HelpCenterListActivity.h0(r0)
                r0.addAll(r4)
            L26:
                com.bxkj.student.personal.HelpCenterListActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.personal.HelpCenterListActivity.g0(r4)
                com.bxkj.student.personal.HelpCenterListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.personal.HelpCenterListActivity.h0(r0)
                r4.g(r0)
                return
        }
    }

    public HelpCenterListActivity() {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.c0 = r0
            r0 = 1
            r1.f1122k0 = r0
            r1.f1123p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.personal.HelpCenterListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.personal.HelpCenterListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout i0(com.bxkj.student.personal.HelpCenterListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.personal.HelpCenterListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.personal.HelpCenterListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.personal.HelpCenterListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.b0
            com.bxkj.student.personal.HelpCenterListActivity$b r1 = new com.bxkj.student.personal.HelpCenterListActivity$b
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
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
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
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setLayoutAnimation(r0)
            com.bxkj.student.personal.HelpCenterListActivity$a r0 = new com.bxkj.student.personal.HelpCenterListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493338(0x7f0c01da, float:1.8610153E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            r4.n0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Z
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "帮助中心"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Z = r1
            return
    }

    public void m0() {
            r4 = this;
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            int r1 = r4.f1122k0
            int r2 = r4.c0
            r3 = 2
            rx.e r0 = r0.S(r3, r1, r2)
            android.content.Context r1 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.personal.HelpCenterListActivity$d r1 = new com.bxkj.student.personal.HelpCenterListActivity$d
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void n0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Z
            com.bxkj.student.personal.HelpCenterListActivity$c r1 = new com.bxkj.student.personal.HelpCenterListActivity$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

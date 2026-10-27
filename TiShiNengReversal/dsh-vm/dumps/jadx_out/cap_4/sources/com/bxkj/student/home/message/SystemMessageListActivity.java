package com.bxkj.student.home.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SystemMessageListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView Y;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f772k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f773p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.message.SystemMessageListActivity k;

        a(com.bxkj.student.home.message.SystemMessageListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                java.lang.String r0 = "title"
                java.lang.String r0 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                r1 = 2131299164(0x7f090b5c, float:1.8216322E38)
                r3.J(r1, r0)
                r0 = 2131297200(0x7f0903b0, float:1.8212338E38)
                android.view.View r3 = r3.h(r0)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                java.lang.String r0 = "isread"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r4, r0)
                java.lang.String r0 = "0"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L25
                r4 = 0
                goto L26
            L25:
                r4 = 4
            L26:
                r3.setVisibility(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.home.message.SystemMessageListActivity a;

        b(com.bxkj.student.home.message.SystemMessageListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.message.SystemMessageListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.message.SystemMessageListActivity.l0(r4)
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.message.SystemMessageListActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.message.SystemMessageListActivity.i0(r0)
                com.bxkj.student.home.message.SystemMessageListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.message.SystemMessageListActivity.l0(r1)
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.message.SystemMessageListActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.message.SystemMessageListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.message.SystemMessageListActivity.k0(r4)
                r4.q0()
                com.bxkj.student.home.message.SystemMessageListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.message.SystemMessageListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.message.SystemMessageListActivity.i0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.message.SystemMessageListActivity.n0(r4, r0)
                com.bxkj.student.home.message.SystemMessageListActivity r4 = r3.a
                com.bxkj.student.home.message.SystemMessageListActivity.p0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.message.SystemMessageListActivity.n0(r2, r0)
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r1.a
                com.bxkj.student.home.message.SystemMessageListActivity.p0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.message.SystemMessageListActivity a;

        c(com.bxkj.student.home.message.SystemMessageListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.message.SystemMessageListActivity.k0(r0)
                r0.w0()
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.message.SystemMessageListActivity.k0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.student.home.message.SystemMessageListActivity.o0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r2.a
                int r0 = com.bxkj.student.home.message.SystemMessageListActivity.i0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r2.a
                com.bxkj.student.home.message.SystemMessageListActivity.m0(r0, r3)
                goto L2f
            L26:
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.message.SystemMessageListActivity.h0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.student.home.message.SystemMessageListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.message.SystemMessageListActivity.g0(r3)
                com.bxkj.student.home.message.SystemMessageListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.message.SystemMessageListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.home.message.SystemMessageListActivity a;

        d(com.bxkj.student.home.message.SystemMessageListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.home.message.SystemMessageListActivity.q0(r2)
                java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r3 = com.bxkj.base.webview.H5DetailActivity.class
                r1.<init>(r2, r3)
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.message.SystemMessageListActivity.g0(r2)
                java.lang.Object r2 = r2.getItem(r4)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "title"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r2, r3)
                r1.putExtra(r3, r2)
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.message.SystemMessageListActivity.g0(r2)
                java.lang.Object r2 = r2.getItem(r4)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "url"
                java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r2, r3)
                r1.putExtra(r3, r2)
                com.bxkj.student.home.message.SystemMessageListActivity r2 = r0.a
                r2.startActivity(r1)
                com.bxkj.student.home.message.SystemMessageListActivity r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.home.message.SystemMessageListActivity.g0(r1)
                java.lang.Object r1 = r1.getItem(r4)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r2 = "isread"
                java.lang.String r3 = "1"
                r1.put(r2, r3)
                com.bxkj.student.home.message.SystemMessageListActivity r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.home.message.SystemMessageListActivity.g0(r1)
                r1.notifyItemChanged(r4)
                return
        }
    }

    public SystemMessageListActivity() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.c0 = r0
            r1 = 12
            r2.f772k0 = r1
            r2.f773p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            int r0 = r0.f772k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout k0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ int l0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            int r0 = r0.f773p0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.message.SystemMessageListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.message.SystemMessageListActivity r0, int r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.message.SystemMessageListActivity r0, int r1) {
            r0.f773p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            r0.r0()
            return
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.home.message.SystemMessageListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void r0() {
            r6 = this;
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r6.c0
            int r4 = r6.f772k0
            java.lang.String r5 = "0"
            rx.e r1 = r1.l1(r2, r5, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.message.SystemMessageListActivity$c r1 = new com.bxkj.student.home.message.SystemMessageListActivity$c
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.b0
            com.bxkj.student.home.message.SystemMessageListActivity$d r1 = new com.bxkj.student.home.message.SystemMessageListActivity$d
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492981(0x7f0c0075, float:1.860943E38)
            return r0
    }

    public void R() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.message.SystemMessageListActivity$a r0 = new com.bxkj.student.home.message.SystemMessageListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493338(0x7f0c01da, float:1.8610153E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Z
            com.bxkj.student.home.message.SystemMessageListActivity$b r1 = new com.bxkj.student.home.message.SystemMessageListActivity$b
            r1.<init>(r4)
            r0.m1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Z
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "通知消息"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

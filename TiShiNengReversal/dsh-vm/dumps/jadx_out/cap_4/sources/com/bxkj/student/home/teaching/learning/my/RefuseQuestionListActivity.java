package com.bxkj.student.home.teaching.learning.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RefuseQuestionListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private int G0;
    private int H0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f950k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f951p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity a;

        a(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.m0(r4)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.j0(r0)
                int r4 = r4 / r0
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r3.a
                int r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.i0(r0)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.m0(r1)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r2 = r3.a
                int r2 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.j0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r4)
                r4.q0()
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r4 = r3.a
                int r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.i0(r4)
                int r0 = r0 + 1
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.n0(r4, r0)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r4 = r3.a
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.p0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.n0(r2, r0)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r2 = r1.a
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.p0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity a;

        b(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r0)
                r0.w0()
            L20:
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.l0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.o0(r0, r1)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r2.a
                int r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.i0(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.k0(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.k0(r0)
                r0.addAll(r3)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r3 = r2.a
                com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r3 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.h0(r3)
                com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity.k0(r0)
                r3.g(r0)
                return
        }
    }

    public RefuseQuestionListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            r0 = 1
            r1.F0 = r0
            r0 = 10
            r1.G0 = r0
            r0 = 0
            r1.H0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.s0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter h0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            int r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            int r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List k0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            int r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0, int r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0, int r1) {
            r0.H0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity r0) {
            r0.q0()
            return
    }

    private void q0() {
            r4 = this;
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L7
            return
        L7:
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            int r2 = r4.G0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.F0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            rx.e r1 = r1.j(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity$b r1 = new com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void r0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity$a r1 = new com.bxkj.student.home.teaching.learning.my.RefuseQuestionListActivity$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private /* synthetic */ void s0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r1 = r0.c0
            r1.v(r4)
            return
    }

    public void L() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = r2.c0
            com.bxkj.student.home.teaching.learning.my.g r1 = new com.bxkj.student.home.teaching.learning.my.g
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493641(0x7f0c0309, float:1.8610768E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "type"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L17
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.f950k0 = r0
        L17:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "resourceId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.f951p0 = r0
        L2d:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r3.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = new com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter
            android.content.Context r1 = r3.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.b0
            r0.<init>(r1, r2)
            r3.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r3.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            android.widget.TextView r1 = r3.a0
            r0.setEmptyView(r1)
            r3.r0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "待处理作业列表"
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

    protected void onRestart() {
            r1 = this;
            super/*android.app.Activity*/.onRestart()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.Y
            r0.D()
            return
    }
}

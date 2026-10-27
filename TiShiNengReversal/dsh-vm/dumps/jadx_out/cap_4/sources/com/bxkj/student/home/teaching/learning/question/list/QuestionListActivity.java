package com.bxkj.student.home.teaching.learning.question.list;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class QuestionListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Y;
    private android.widget.TextView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f962k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity a;

        a(com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity.k0(r0, r3)
                com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r3 = r2.a
                com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r3 = com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity.i0(r3)
                com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity.j0(r0)
                r3.g(r0)
                return
        }
    }

    public QuestionListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.m0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0) {
            r0.n0()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter i0(com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0) {
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    private void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            int r2 = r4.c0
            java.lang.String r3 = r4.f962k0
            rx.e r1 = r1.l(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity$a r1 = new com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void m0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r1 = r0.b0
            r1.v(r4)
            return
    }

    private /* synthetic */ void n0() {
            r0 = this;
            r0.l0()
            return
    }

    public void L() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = r2.b0
            com.bxkj.student.home.teaching.learning.question.list.a r1 = new com.bxkj.student.home.teaching.learning.question.list.a
            r1.<init>(r2)
            r0.k(r1)
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = r2.b0
            com.bxkj.student.home.teaching.learning.question.list.b r1 = new com.bxkj.student.home.teaching.learning.question.list.b
            r1.<init>(r2)
            r0.u(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493640(0x7f0c0308, float:1.8610766E38)
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
            r3.c0 = r0
        L17:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "resourceId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.f962k0 = r0
        L2d:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r3.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0 = new com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter
            android.content.Context r1 = r3.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.a0
            r0.<init>(r1, r2)
            r3.b0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r3.Y
            r1.setAdapter(r0)
            r3.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "问题列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Y = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onRestart() {
            r2 = this;
            super/*android.app.Activity*/.onRestart()
            r2.l0()
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.home.teaching.learning.LearnHomeListActivity> r1 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.class
            android.app.Activity r0 = r0.getActivity(r1)
            com.bxkj.student.home.teaching.learning.LearnHomeListActivity r0 = (com.bxkj.student.home.teaching.learning.LearnHomeListActivity) r0
            if (r0 == 0) goto L17
            r0.S0()
        L17:
            return
    }
}

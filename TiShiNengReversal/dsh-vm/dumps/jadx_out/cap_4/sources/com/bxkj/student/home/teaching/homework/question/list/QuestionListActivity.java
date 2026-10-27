package com.bxkj.student.home.teaching.homework.question.list;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class QuestionListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f856k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.Integer f857p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity a;

        a(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity.m0(r0, r3)
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r3 = r2.a
                com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter r3 = com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity.j0(r3)
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity.k0(r0)
                r3.g(r0)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3, java.lang.String r4) {
                r2 = this;
                super.netOnSuccess(r3, r4)
                boolean r3 = android.text.TextUtils.isEmpty(r4)
                if (r3 != 0) goto L35
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r3 = r2.a
                int r0 = java.lang.Integer.parseInt(r4)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity.n0(r3, r0)
                com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r3 = r2.a
                android.widget.TextView r3 = com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity.l0(r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "第"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "周"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.setText(r4)
            L35:
                return
        }
    }

    public QuestionListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0) {
            r0.q0()
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0, java.util.List r1, android.view.View r2) {
            r0.s0(r1, r2)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0, java.lang.String r1, java.lang.String r2, java.util.Map r3) {
            r0.r0(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter j0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0) {
            com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List k0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0, java.util.List r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity r0, java.lang.Integer r1) {
            r0.f857p0 = r1
            return
    }

    private void o0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r1 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.homework.a r1 = (com.bxkj.student.home.teaching.homework.a) r1
            java.lang.String r2 = r4.f856k0
            java.lang.Integer r3 = r4.f857p0
            rx.e r1 = r1.e(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity$a r1 = new com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void p0() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
        L6:
            r2 = 31
            if (r1 >= r2) goto L39
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "第"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = "周"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "name"
            r2.put(r4, r3)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L39:
            android.widget.TextView r1 = r5.Y
            com.bxkj.student.home.teaching.homework.question.list.b r2 = new com.bxkj.student.home.teaching.homework.question.list.b
            r2.<init>(r5, r0)
            r1.setOnClickListener(r2)
            return
    }

    private /* synthetic */ void q0() {
            r0 = this;
            r0.o0()
            return
    }

    private /* synthetic */ void r0(java.lang.String r1, java.lang.String r2, java.util.Map r3) {
            r0 = this;
            int r1 = java.lang.Integer.parseInt(r1)
            if (r1 == 0) goto L36
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f857p0 = r1
            android.widget.TextView r1 = r0.Y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "第"
            r2.append(r3)
            java.lang.Integer r3 = r0.f857p0
            r2.append(r3)
            java.lang.String r3 = "周"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.b0
            r1.clear()
            com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter r1 = r0.c0
            r1.notifyDataSetChanged()
            r0.o0()
        L36:
            return
    }

    private /* synthetic */ void s0(java.util.List r8, android.view.View r9) {
            r7 = this;
            com.bxkj.base.util.i r0 = new com.bxkj.base.util.i
            android.content.Context r9 = r7.V
            r0.<init>(r9)
            android.widget.TextView r1 = r7.Y
            com.bxkj.student.home.teaching.homework.question.list.c r6 = new com.bxkj.student.home.teaching.homework.question.list.c
            r6.<init>(r7)
            java.lang.String r2 = "请选择周"
            java.lang.String r4 = "id"
            java.lang.String r5 = "name"
            r3 = r8
            r0.h(r1, r2, r3, r4, r5, r6)
            return
    }

    public void L() {
            r2 = this;
            com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter r0 = r2.c0
            com.bxkj.student.home.teaching.homework.question.list.a r1 = new com.bxkj.student.home.teaching.homework.question.list.a
            r1.<init>(r2)
            r0.u(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492949(0x7f0c0055, float:1.8609364E38)
            return r0
    }

    public void R() {
            r3 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r3.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter r0 = new com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter
            android.content.Context r1 = r3.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.b0
            r0.<init>(r1, r2)
            r3.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r3.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r3.Z
            android.widget.TextView r1 = r3.a0
            r0.setEmptyView(r1)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "teacherCurriculumId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L3c
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.f856k0 = r0
            r3.o0()
        L3c:
            r3.p0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "课后作业列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299191(0x7f090b77, float:1.8216376E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
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
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            r0.o0()
            return
    }
}

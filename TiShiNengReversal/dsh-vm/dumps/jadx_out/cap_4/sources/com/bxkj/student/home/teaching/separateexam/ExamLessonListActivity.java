package com.bxkj.student.home.teaching.separateexam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExamLessonListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity k;

        a(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.o(r1, r2)
                return
        }

        private /* synthetic */ void o(java.util.Map r4, android.view.View r5) {
                r3 = this;
                com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r5 = r3.k
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.home.teaching.separateexam.ExamLessonDescriptionActivity> r2 = com.bxkj.student.home.teaching.separateexam.ExamLessonDescriptionActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "stuid"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                android.content.Intent r4 = r0.putExtra(r1, r4)
                r5.startActivity(r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "课程："
                r0.append(r1)
                java.lang.String r1 = "curriculumName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298956(0x7f090a8c, float:1.82159E38)
                r3.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "教师："
                r0.append(r1)
                java.lang.String r1 = "teacherName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299152(0x7f090b50, float:1.8216297E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.separateexam.c r0 = new com.bxkj.student.home.teaching.separateexam.c
                r0.<init>(r2, r4)
                r4 = 2131296646(0x7f090186, float:1.8211215E38)
                r3.w(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity a;

        b(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity.j0(r0, r3)
                com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity.h0(r3)
                com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity.i0(r0)
                r3.g(r0)
                return
        }
    }

    public ExamLessonListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r0) {
            r0.l0()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity r0, java.util.List r1) {
            r0.b0 = r1
            return
    }

    private /* synthetic */ void l0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity> r2 = com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493641(0x7f0c0309, float:1.8610768E38)
            return r0
    }

    public void R() {
            r4 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity$a r0 = new com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493250(0x7f0c0182, float:1.8609975E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.b0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            r4.k0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "选择约考课程"
            r2.setTitle(r0)
            com.bxkj.student.home.teaching.separateexam.b r0 = new com.bxkj.student.home.teaching.separateexam.b
            r0.<init>(r2)
            java.lang.String r1 = "我的约考"
            r2.b0(r1, r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            r2 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.Z = r2
            r2 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Y
            r0 = 0
            r2.X0(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Y
            r2.S0(r0)
            return
    }

    public void k0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.i1(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity$b r1 = new com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

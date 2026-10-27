package com.bxkj.student.home.teaching.homework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewLessonActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    protected int c0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f840k0;

    /* renamed from: p0, reason: collision with root package name */
    protected int f841p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.ViewLessonActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.homework.ViewLessonActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0086a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.homework.ViewLessonActivity.a b;

            ViewOnClickListenerC0086a(com.bxkj.student.home.teaching.homework.ViewLessonActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.home.teaching.homework.ViewLessonActivity$a r4 = r3.b
                    com.bxkj.student.home.teaching.homework.ViewLessonActivity r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.home.teaching.homework.ViewLessonActivity$a r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.a.n(r1)
                    java.lang.Class<com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity> r2 = com.bxkj.student.home.teaching.homework.question.list.QuestionListActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.lang.String r2 = "teacherCurriculumId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    r4.startActivity(r0)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.homework.ViewLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.homework.ViewLessonActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.p(r1, r2)
                return
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.teaching.homework.ViewLessonActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        private /* synthetic */ void p(java.util.Map r2, android.view.View r3) {
                r1 = this;
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r3 = r1.k
                java.lang.String r0 = "classimg"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                com.bxkj.student.home.teaching.homework.ViewLessonActivity.i0(r3, r2)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                java.lang.String r0 = "teacherCurriculumTeachingCurriculumName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298956(0x7f090a8c, float:1.82159E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherCurriculumSysTermName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298861(0x7f090a2d, float:1.8215707E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherCurriculumTeachingSchoolTimeName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299158(0x7f090b56, float:1.821631E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherCurriculumSysOrgName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherCurriculumSysCampusName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299090(0x7f090b12, float:1.8216172E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherCurriculumType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299171(0x7f090b63, float:1.8216336E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherCurriculumFeature"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298905(0x7f090a59, float:1.8215796E38)
                r5.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "教师："
                r0.append(r1)
                java.lang.String r1 = "teacherCurriculumSysUserName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r5.J(r1, r0)
                java.lang.String r0 = "address"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                r2 = 1
                r1 = r1 ^ r2
                r3 = 2131298773(0x7f0909d5, float:1.8215529E38)
                r5.N(r3, r1)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r5.J(r3, r0)
                r0 = 2131296623(0x7f09016f, float:1.8211168E38)
                android.view.View r1 = r5.h(r0)
                android.widget.Button r1 = (android.widget.Button) r1
                java.lang.String r3 = "课后作业"
                r1.setText(r3)
                r1 = 2131296632(0x7f090178, float:1.8211186E38)
                r5.N(r1, r2)
                com.bxkj.student.home.teaching.homework.b r2 = new com.bxkj.student.home.teaching.homework.b
                r2.<init>(r4, r6)
                r5.w(r1, r2)
                com.bxkj.student.home.teaching.homework.ViewLessonActivity$a$a r2 = new com.bxkj.student.home.teaching.homework.ViewLessonActivity$a$a
                r2.<init>(r4, r6)
                r5.w(r0, r2)
                r6 = 0
                r5.N(r1, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.student.home.teaching.homework.ViewLessonActivity b;

        b(com.bxkj.student.home.teaching.homework.ViewLessonActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r2 = r1.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.g0(r2)
                java.util.List r2 = r2.d()
                int r0 = r1.a
                r2.remove(r0)
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r2 = r1.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.g0(r2)
                int r0 = r1.a
                r2.notifyItemRemoved(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.ViewLessonActivity a;

        c(com.bxkj.student.home.teaching.homework.ViewLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r5 = r4.a
                int r0 = r5.f841p0
                int r1 = r5.c0
                int r2 = r0 / r1
                int r3 = r5.f840k0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.h0(r5)
                r5.q0()
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.j0(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.f840k0 = r3
                r5.l0()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r2 = r1.a
                r0 = 1
                r2.f840k0 = r0
                r2.l0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.ViewLessonActivity a;

        d(com.bxkj.student.home.teaching.homework.ViewLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.h0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.h0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.f841p0 = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.g0(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r1 = r3.a
                int r1 = r1.f840k0
                r2 = 1
                if (r1 != r2) goto L28
                goto L2c
            L28:
                r0.addAll(r4)
                r4 = r0
            L2c:
                com.bxkj.student.home.teaching.homework.ViewLessonActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.homework.ViewLessonActivity.g0(r0)
                r0.g(r4)
                return
        }
    }

    public ViewLessonActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 10
            r1.c0 = r0
            r0 = 1
            r1.f840k0 = r0
            r1.f841p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.homework.ViewLessonActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout h0(com.bxkj.student.home.teaching.homework.ViewLessonActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.homework.ViewLessonActivity r0, java.lang.String r1) {
            r0.o0(r1)
            return
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.teaching.homework.ViewLessonActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void k0(int r5) {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.b0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            rx.e r1 = r1.o0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.homework.ViewLessonActivity$b r1 = new com.bxkj.student.home.teaching.homework.ViewLessonActivity$b
            r1.<init>(r4, r5)
            r0.setDataListener(r1)
            return
    }

    private rx.e<retrofit2.c0<okhttp3.ResponseBody>> m0() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r0 = r1.m1(r2, r0)
            return r0
    }

    private void o0(java.lang.String r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r1 = 1
            r0.putExtra(r4, r1)
            java.lang.String r4 = "is_show_save_button"
            r0.putExtra(r4, r1)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r0 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r0)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492977(0x7f0c0071, float:1.8609421E38)
            return r0
    }

    public void R() {
            r5 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r1 = 0
            r0.S0(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r5.V
            r4 = 1
            r2.<init>(r3, r4, r1)
            r0.setLayoutManager(r2)
            com.bxkj.student.home.teaching.homework.ViewLessonActivity$a r0 = new com.bxkj.student.home.teaching.homework.ViewLessonActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493274(0x7f0c019a, float:1.8610024E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.a0
            r0.<init>(r5, r1, r2, r3)
            r5.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.Z
            r1.setAdapter(r0)
            r5.n0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.D()
            return
    }

    public void S() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "课后作业-查看"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getViewAfterLabelName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            r0 = 8
            r2.setVisibility(r0)
            r2 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            r2 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Z = r2
            return
    }

    public void l0() {
            r2 = this;
            rx.e r0 = r2.m0()
            android.content.Context r1 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.homework.ViewLessonActivity$d r1 = new com.bxkj.student.home.teaching.homework.ViewLessonActivity$d
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void n0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.homework.ViewLessonActivity$c r1 = new com.bxkj.student.home.teaching.homework.ViewLessonActivity$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

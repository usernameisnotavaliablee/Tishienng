package com.bxkj.student.home.teaching.separateexam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AppointExamListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f988k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.separateexam.AppointExamListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a, reason: collision with other inner class name */
        class C0101a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a$a, reason: collision with other inner class name */
            class C0102a extends cn.bluemobi.dylan.http.HttpCallBack {
                final /* synthetic */ com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a.C0101a a;

                C0102a(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a.C0101a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                        r0 = this;
                        com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a r1 = r0.a
                        com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a r1 = r1.b
                        com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r1 = r1.k
                        r1.k0()
                        return
                }
            }

            C0101a(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void buttonRightOnClick() {
                    r5 = this;
                    com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a r0 = r5.b
                    android.content.Context r0 = com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a.n(r0)
                    cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                    java.lang.Class<d0.a> r1 = d0.a.class
                    java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                    d0.a r1 = (d0.a) r1
                    com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a r2 = r5.b
                    com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r2 = r2.k
                    java.lang.String r2 = com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.i0(r2)
                    java.util.Map r3 = r5.a
                    java.lang.String r4 = "id"
                    java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
                    rx.e r1 = r1.B1(r2, r3)
                    cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                    com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a$a r1 = new com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a$a
                    r1.<init>(r5)
                    r0.setDataListener(r1)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.p(r1, r2)
                return
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        private /* synthetic */ void p(java.util.Map r2, android.view.View r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                android.content.Context r0 = r1.e
                r3.<init>(r0)
                java.lang.String r0 = "确定选择？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
                com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a r0 = new com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a$a
                r0.<init>(r1, r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r3.setRightButtonOnClickListener(r0)
                r2.show()
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.o(r1, r2)
                return
        }

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "sysOrgId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r3.J(r1, r0)
                java.lang.String r0 = "TeachingId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298954(0x7f090a8a, float:1.8215896E38)
                r3.J(r1, r0)
                java.lang.String r0 = "teacherId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299152(0x7f090b50, float:1.8216297E38)
                r3.J(r1, r0)
                java.lang.String r0 = "teachingCurriculumTotalName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298955(0x7f090a8b, float:1.8215898E38)
                r3.J(r1, r0)
                java.lang.String r0 = "address"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298773(0x7f0909d5, float:1.8215529E38)
                r3.J(r1, r0)
                java.lang.String r0 = "appointmentTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298784(0x7f0909e0, float:1.821555E38)
                r3.J(r1, r0)
                java.lang.String r0 = "examTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298898(0x7f090a52, float:1.8215782E38)
                r3.J(r1, r0)
                com.bxkj.student.home.teaching.separateexam.a r0 = new com.bxkj.student.home.teaching.separateexam.a
                r0.<init>(r2, r4)
                r4 = 2131296646(0x7f090186, float:1.8211215E38)
                r3.w(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.separateexam.AppointExamListActivity a;

        b(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.j0(r0, r3)
                com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.g0(r3)
                com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.separateexam.AppointExamListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public AppointExamListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String i0(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r0) {
            java.lang.String r0 = r0.f988k0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.separateexam.AppointExamListActivity r0, java.util.List r1) {
            r0.b0 = r1
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
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "stuid"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f988k0 = r0
        L16:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a r0 = new com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493235(0x7f0c0173, float:1.8609944E38)
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
            r1 = this;
            java.lang.String r0 = "预约考试"
            r1.setTitle(r0)
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
            java.lang.String r2 = r3.f988k0
            rx.e r1 = r1.Q0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$b r1 = new com.bxkj.student.home.teaching.separateexam.AppointExamListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

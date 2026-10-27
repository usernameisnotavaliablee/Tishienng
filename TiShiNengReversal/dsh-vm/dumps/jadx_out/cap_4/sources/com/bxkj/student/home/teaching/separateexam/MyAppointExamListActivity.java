package com.bxkj.student.home.teaching.separateexam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyAppointExamListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$a$a, reason: collision with other inner class name */
        class C0104a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.a a;

            C0104a(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$a r1 = r0.a
                    com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r1 = r1.k
                    r1.j0()
                    return
            }
        }

        a(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.q(r1, r2)
                return
        }

        public static /* synthetic */ void n(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.a r0, java.util.Map r1) {
                r0.p(r1)
                return
        }

        private /* synthetic */ void p(java.util.Map r4) {
                r3 = this;
                android.content.Context r0 = r3.e
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<d0.a> r1 = d0.a.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                d0.a r1 = (d0.a) r1
                java.lang.String r2 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                rx.e r4 = r1.C(r4)
                cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
                com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$a$a r0 = new com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$a$a
                r0.<init>(r3)
                r4.setDataListener(r0)
                return
        }

        private /* synthetic */ void q(java.util.Map r2, android.view.View r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                android.content.Context r0 = r1.e
                r3.<init>(r0)
                java.lang.String r0 = "确定取消？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
                com.bxkj.student.home.teaching.separateexam.d r0 = new com.bxkj.student.home.teaching.separateexam.d
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

        public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r6.J(r1, r0)
                r0 = 2131298922(0x7f090a6a, float:1.821583E38)
                android.view.View r0 = r6.h(r0)
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                r1 = 8
                r0.setVisibility(r1)
                java.lang.String r0 = "teaching"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131298954(0x7f090a8a, float:1.8215896E38)
                r6.J(r2, r0)
                java.lang.String r0 = "teacher"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131299152(0x7f090b50, float:1.8216297E38)
                r6.J(r2, r0)
                r0 = 2131298955(0x7f090a8b, float:1.8215898E38)
                android.view.View r0 = r6.h(r0)
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                r0.setVisibility(r1)
                java.lang.String r0 = "address"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131298773(0x7f0909d5, float:1.8215529E38)
                r6.J(r2, r0)
                r0 = 2131298784(0x7f0909e0, float:1.821555E38)
                android.view.View r0 = r6.h(r0)
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                r0.setVisibility(r1)
                java.lang.String r0 = "time"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131298898(0x7f090a52, float:1.8215782E38)
                r6.J(r1, r0)
                java.lang.String r0 = "state"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r6.J(r1, r0)
                java.lang.String r0 = "remark"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131299069(0x7f090afd, float:1.8216129E38)
                r6.J(r1, r0)
                java.lang.String r0 = "取消约考"
                r1 = 2131296646(0x7f090186, float:1.8211215E38)
                r6.J(r1, r0)
                android.view.View r0 = r6.h(r1)
                android.widget.Button r0 = (android.widget.Button) r0
                java.lang.String r2 = "stateid"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
                java.lang.String r3 = "0"
                boolean r4 = r3.equals(r2)
                r6.N(r1, r4)
                boolean r2 = r3.equals(r2)
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.separateexam.e r0 = new com.bxkj.student.home.teaching.separateexam.e
                r0.<init>(r5, r7)
                r6.w(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity a;

        b(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.i0(r0, r3)
                com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.g0(r3)
                com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public MyAppointExamListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity r0, java.util.List r1) {
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
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$a r0 = new com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493285(0x7f0c01a5, float:1.8610046E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.b0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            r4.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "我的预约考试"
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

    public void j0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.W0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$b r1 = new com.bxkj.student.home.teaching.separateexam.MyAppointExamListActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

package com.bxkj.student.home.teaching.evaluateteacher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EvaluateListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0084a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.a b;

            ViewOnClickListenerC0084a(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$a r3 = r2.b
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r3 = r3.k
                    java.util.Map r0 = r2.a
                    java.lang.String r1 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                    com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.k0(r3, r0, r1)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                java.lang.String r0 = "term"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r5.J(r1, r0)
                java.lang.String r0 = "courseName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298855(0x7f090a27, float:1.8215695E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teacherName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299152(0x7f090b50, float:1.8216297E38)
                r5.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ 1
                r2 = 2131299093(0x7f090b15, float:1.8216178E38)
                r5.N(r2, r1)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                boolean r1 = r1.isEmpty()
                r3 = 2131296608(0x7f090160, float:1.8211137E38)
                r5.N(r3, r1)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r5.J(r2, r0)
                java.lang.String r0 = "type"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                java.lang.String r1 = "0"
                boolean r2 = r1.equals(r0)
                if (r2 == 0) goto L5c
                java.lang.String r1 = "正常"
                goto L92
            L5c:
                java.lang.String r2 = "1"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L67
                java.lang.String r1 = "保健"
                goto L92
            L67:
                java.lang.String r2 = "2"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L72
                java.lang.String r1 = "特招"
                goto L92
            L72:
                java.lang.String r2 = "3"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L7d
                java.lang.String r1 = "出国"
                goto L92
            L7d:
                java.lang.String r2 = "4"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L88
                java.lang.String r1 = "服役"
                goto L92
            L88:
                java.lang.String r2 = "5"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L92
                java.lang.String r1 = "休学"
            L92:
                r0 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r5.J(r0, r1)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$a$a r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$a$a
                r0.<init>(r4, r6)
                r5.w(r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.d {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity a;

        b(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void n(l2.h r1) {
                r0 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r1 = r0.a
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.l0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity b;

        c(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r1, java.util.Map r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.n0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r4 = r3.b
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r1 = r3.b
                android.content.Context r1 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.m0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.evaluateteacher.EvaluateDescriptionActivity> r2 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateDescriptionActivity.class
                r0.<init>(r1, r2)
                java.util.Map r1 = r3.a
                java.lang.String r2 = "id"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                java.lang.String r2 = "stuTeacherCurriculumId"
                android.content.Intent r0 = r0.putExtra(r2, r1)
                r4.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity a;

        d(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.i0(r0)
                r0.w0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.j0(r0, r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.g0(r3)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public EvaluateListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout i0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0, java.util.Map r1, java.lang.String r2) {
            r0.o0(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0) {
            r0.p0()
            return
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void o0(java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r5 = r1.b0(r2, r5)
            cn.bluemobi.dylan.http.HttpRequest r5 = r0.setObservable(r5)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$c r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$c
            r0.<init>(r3, r4)
            r5.setDataListener(r0)
            return
    }

    private void p0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.Z0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$d r1 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$d
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492999(0x7f0c0087, float:1.8609466E38)
            return r0
    }

    public void R() {
            r5 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r5, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setLayoutAnimation(r0)
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$a r0 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$a
            android.content.Context r2 = r5.V
            r3 = 2131493249(0x7f0c0181, float:1.8609973E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.a0
            r0.<init>(r5, r2, r3, r4)
            r5.b0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r5.Z
            r2.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$b r2 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity$b
            r2.<init>(r5)
            r0.l1(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r2 = 1
            r0.X0(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.S0(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r5.findViewById(r1)
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "评价课程列表"
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

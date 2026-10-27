package com.bxkj.student.home.teaching.exam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExamListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamListActivity k;

        a(com.bxkj.student.home.teaching.exam.ExamListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.exam.ExamListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.q(r1, r2)
                return
        }

        public static /* synthetic */ void n(com.bxkj.student.home.teaching.exam.ExamListActivity.a r0, java.util.Map r1, boolean r2, android.view.View r3) {
                r0.p(r1, r2, r3)
                return
        }

        private /* synthetic */ void p(java.util.Map r2, boolean r3, android.view.View r4) {
                r1 = this;
                com.bxkj.student.home.teaching.exam.ExamListActivity r4 = r1.k
                java.lang.String r0 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)
                com.bxkj.student.home.teaching.exam.ExamListActivity.l0(r4, r2, r3)
                return
        }

        private /* synthetic */ void q(java.util.Map r4, android.view.View r5) {
                r3 = this;
                com.bxkj.student.home.teaching.exam.ExamListActivity r5 = r3.k
                android.content.Intent r0 = r5.getIntent()
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.home.teaching.exam.record.ExamRecordActivity> r2 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.class
                android.content.Intent r0 = r0.setClass(r1, r2)
                java.lang.String r1 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r1 = "studentChooseLessonId"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                r5.startActivity(r4)
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
                java.lang.String r0 = "term"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131298922(0x7f090a6a, float:1.821583E38)
                r6.J(r1, r0)
                java.lang.String r0 = "courseName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131298855(0x7f090a27, float:1.8215695E38)
                r6.J(r1, r0)
                java.lang.String r0 = "teacherName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131299152(0x7f090b50, float:1.8216297E38)
                r6.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ 1
                r2 = 2131299093(0x7f090b15, float:1.8216178E38)
                r6.N(r2, r1)
                java.lang.String r1 = "isExam"
                boolean r3 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r1)
                r4 = 2131296608(0x7f090160, float:1.8211137E38)
                r6.N(r4, r3)
                r3 = 2131298787(0x7f0909e3, float:1.8215557E38)
                boolean r1 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r1)
                r6.N(r3, r1)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r6.J(r2, r0)
                java.lang.String r0 = "type"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                java.lang.String r1 = "0"
                boolean r2 = r1.equals(r0)
                if (r2 == 0) goto L64
                java.lang.String r1 = "正常"
                goto L9a
            L64:
                java.lang.String r2 = "1"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L6f
                java.lang.String r1 = "保健"
                goto L9a
            L6f:
                java.lang.String r2 = "2"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L7a
                java.lang.String r1 = "特招"
                goto L9a
            L7a:
                java.lang.String r2 = "3"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L85
                java.lang.String r1 = "出国"
                goto L9a
            L85:
                java.lang.String r2 = "4"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L90
                java.lang.String r1 = "服役"
                goto L9a
            L90:
                java.lang.String r2 = "5"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L9a
                java.lang.String r1 = "休学"
            L9a:
                java.lang.String r0 = "isShowList"
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r0)
                r2 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r6.J(r2, r1)
                java.lang.String r1 = "开始考试"
                r6.J(r4, r1)
                com.bxkj.student.home.teaching.exam.a r1 = new com.bxkj.student.home.teaching.exam.a
                r1.<init>(r5, r7, r0)
                r6.w(r4, r1)
                r1 = 2131296635(0x7f09017b, float:1.8211192E38)
                r6.N(r1, r0)
                com.bxkj.student.home.teaching.exam.b r0 = new com.bxkj.student.home.teaching.exam.b
                r0.<init>(r5, r7)
                r6.w(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.d {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamListActivity a;

        b(com.bxkj.student.home.teaching.exam.ExamListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void n(l2.h r1) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.ExamListActivity r1 = r0.a
                com.bxkj.student.home.teaching.exam.ExamListActivity.k0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamListActivity a;

        c(com.bxkj.student.home.teaching.exam.ExamListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.exam.ExamListActivity.i0(r0)
                r0.w0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.exam.ExamListActivity.j0(r0, r3)
                com.bxkj.student.home.teaching.exam.ExamListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.exam.ExamListActivity.g0(r3)
                com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.exam.ExamListActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamListActivity c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
            final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamListActivity.d a;

            a(com.bxkj.student.home.teaching.exam.ExamListActivity.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void buttonRightOnClick() {
                    r4 = this;
                    com.bxkj.student.home.teaching.exam.ExamListActivity$d r0 = r4.a
                    com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r0.c
                    android.content.Context r0 = com.bxkj.student.home.teaching.exam.ExamListActivity.o0(r0)
                    android.content.Intent r1 = new android.content.Intent
                    com.bxkj.student.home.teaching.exam.ExamListActivity$d r2 = r4.a
                    com.bxkj.student.home.teaching.exam.ExamListActivity r2 = r2.c
                    android.content.Context r2 = com.bxkj.student.home.teaching.exam.ExamListActivity.n0(r2)
                    java.lang.Class<com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity> r3 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.class
                    r1.<init>(r2, r3)
                    r0.startActivity(r1)
                    return
            }
        }

        d(com.bxkj.student.home.teaching.exam.ExamListActivity r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.exam.ExamListActivity.d r0, android.view.View r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(android.view.View r4) {
                r3 = this;
                com.bxkj.student.home.teaching.exam.ExamListActivity r4 = r3.c
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.exam.ExamListActivity r1 = r3.c
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.ExamListActivity.s0(r1)
                java.lang.Class<com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity> r2 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                r0 = 202(0xca, float:2.83E-43)
                if (r2 != r0) goto L23
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r1.c
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.ExamListActivity.q0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.home.teaching.exam.c r3 = new com.bxkj.student.home.teaching.exam.c
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
            L23:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r1.c
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.ExamListActivity.r0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "data"
                boolean r4 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r4, r0)
                if (r4 == 0) goto L2e
                com.bxkj.student.home.teaching.exam.ExamListActivity r4 = r3.c
                android.content.Intent r0 = r4.getIntent()
                com.bxkj.student.home.teaching.exam.ExamListActivity r1 = r3.c
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.ExamListActivity.m0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.exam.ExamDescriptionActivity> r2 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.class
                android.content.Intent r0 = r0.setClass(r1, r2)
                java.lang.String r1 = "stuTeacherCurriculumId"
                java.lang.String r2 = r3.a
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "isShowList"
                boolean r2 = r3.b
                android.content.Intent r0 = r0.putExtra(r1, r2)
                r4.startActivity(r0)
                return
            L2e:
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.home.teaching.exam.ExamListActivity r0 = r3.c
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.ExamListActivity.p0(r0)
                r4.<init>(r0)
                java.lang.String r0 = "提示"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setTitle(r0)
                java.lang.String r0 = "您还未评价教师，请先去评价教师"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setMessage(r0)
                com.bxkj.student.home.teaching.exam.ExamListActivity$d$a r0 = new com.bxkj.student.home.teaching.exam.ExamListActivity$d$a
                r0.<init>(r3)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonOnClickListener(r0)
                r4.show()
                return
        }
    }

    public ExamListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            r0 = 0
            r1.c0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout i0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.exam.ExamListActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            r0.t0()
            return
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.home.teaching.exam.ExamListActivity r0, java.lang.String r1, boolean r2) {
            r0.u0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.home.teaching.exam.ExamListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void t0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r4.c0
            rx.e r1 = r1.I(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.ExamListActivity$c r1 = new com.bxkj.student.home.teaching.exam.ExamListActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void u0(java.lang.String r5, boolean r6) {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            int r3 = r4.c0
            rx.e r1 = r1.N0(r5, r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.ExamListActivity$d r1 = new com.bxkj.student.home.teaching.exam.ExamListActivity$d
            r1.<init>(r4, r5, r6)
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
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "onlineType"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L17
            android.content.Intent r0 = r5.getIntent()
            int r0 = r0.getIntExtra(r1, r2)
            r5.c0 = r0
        L17:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r5.V
            r1.<init>(r3)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r5, r1)
            r0.<init>(r1)
            r0.setOrder(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r5.Z
            r1.setLayoutAnimation(r0)
            com.bxkj.student.home.teaching.exam.ExamListActivity$a r0 = new com.bxkj.student.home.teaching.exam.ExamListActivity$a
            android.content.Context r1 = r5.V
            r3 = 2131493249(0x7f0c0181, float:1.8609973E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.a0
            r0.<init>(r5, r1, r3, r4)
            r5.b0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r5.Z
            r1.setAdapter(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            com.bxkj.student.home.teaching.exam.ExamListActivity$b r1 = new com.bxkj.student.home.teaching.exam.ExamListActivity$b
            r1.<init>(r5)
            r0.l1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r1 = 1
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.S0(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r5.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r5.findViewById(r1)
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r5.Y
            r0.D()
            return
    }

    public void S() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L18
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.setTitle(r0)
            return
        L18:
            java.lang.String r0 = "考试课程"
            r2.setTitle(r0)
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

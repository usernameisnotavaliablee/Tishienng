package com.bxkj.student.home.teaching.lesson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewLessonActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    protected int c0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f973k0;

    /* renamed from: p0, reason: collision with root package name */
    protected int f974p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewLessonActivity k;

        a(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.lesson.ViewLessonActivity.a r0, java.lang.String r1, float r2, android.view.View r3) {
                r0.u(r1, r2, r3)
                return
        }

        public static /* synthetic */ void n(com.bxkj.student.home.teaching.lesson.ViewLessonActivity.a r0, java.lang.String r1, android.view.View r2) {
                r0.t(r1, r2)
                return
        }

        public static /* synthetic */ void o(com.bxkj.student.home.teaching.lesson.ViewLessonActivity.a r0, android.widget.Button r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, android.view.View r3) {
                r0.s(r1, r2, r3)
                return
        }

        public static /* synthetic */ void p(com.bxkj.student.home.teaching.lesson.ViewLessonActivity.a r0, cn.bluemobi.dylan.base.adapter.common.ViewHolder r1) {
                r0.r(r1)
                return
        }

        private /* synthetic */ void r(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                r1 = this;
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0 = r1.k
                int r2 = r2.getAdapterPosition()
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity.i0(r0, r2)
                return
        }

        private /* synthetic */ void s(android.widget.Button r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, android.view.View r3) {
                r0 = this;
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                java.lang.String r3 = "取消"
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L2d
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                android.content.Context r3 = r0.e
                r1.<init>(r3)
                java.lang.String r3 = "确定要取消吗？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setMessage(r3)
                com.bxkj.student.home.teaching.lesson.d r3 = new com.bxkj.student.home.teaching.lesson.d
                r3.<init>(r0, r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setRightButtonOnClickListener(r3)
                r1.show()
            L2d:
                return
        }

        private /* synthetic */ void t(java.lang.String r1, android.view.View r2) {
                r0 = this;
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 == 0) goto L17
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                android.content.Context r2 = r0.e
                r1.<init>(r2)
                java.lang.String r2 = "教师未上传二维码"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                r1.show()
                return
            L17:
                android.content.Context r2 = r0.e
                com.bxkj.base.util.n.a(r2, r1)
                return
        }

        private /* synthetic */ void u(java.lang.String r4, float r5, android.view.View r6) {
                r3 = this;
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r6 = r3.k
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.home.teaching.lesson.CertificateActivity> r2 = com.bxkj.student.home.teaching.lesson.CertificateActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "lessonName"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                java.lang.String r0 = "score"
                android.content.Intent r4 = r4.putExtra(r0, r5)
                r6.startActivity(r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.q(r1, r2)
                return
        }

        public void q(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                java.lang.String r0 = "teacherCurriculumTeachingCurriculumName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                r1 = 2131298956(0x7f090a8c, float:1.82159E38)
                r7.J(r1, r0)
                java.lang.String r1 = "teacherCurriculumSysTermName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131298861(0x7f090a2d, float:1.8215707E38)
                r7.J(r2, r1)
                java.lang.String r1 = "teacherCurriculumTeachingSchoolTimeName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131299158(0x7f090b56, float:1.821631E38)
                r7.J(r2, r1)
                java.lang.String r1 = "teacherCurriculumSysOrgName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131298922(0x7f090a6a, float:1.821583E38)
                r7.J(r2, r1)
                java.lang.String r1 = "teacherCurriculumSysCampusName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131299090(0x7f090b12, float:1.8216172E38)
                r7.J(r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "第"
                r1.append(r2)
                java.lang.String r2 = "parameter"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r1.append(r2)
                java.lang.String r2 = "周"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 2131299190(0x7f090b76, float:1.8216374E38)
                r7.J(r2, r1)
                java.lang.String r1 = "teacherCurriculumType"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131299171(0x7f090b63, float:1.8216336E38)
                r7.J(r2, r1)
                java.lang.String r1 = "teacherCurriculumFeature"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131298905(0x7f090a59, float:1.8215796E38)
                r7.J(r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "教师："
                r1.append(r2)
                java.lang.String r2 = "teacherCurriculumSysUserName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r7.J(r2, r1)
                java.lang.String r1 = "address"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                r3 = 1
                r2 = r2 ^ r3
                r4 = 2131298773(0x7f0909d5, float:1.8215529E38)
                r7.N(r4, r2)
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r7.J(r4, r1)
                java.lang.String r1 = "canshu"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131296623(0x7f09016f, float:1.8211168E38)
                android.view.View r2 = r7.h(r2)
                android.widget.Button r2 = (android.widget.Button) r2
                java.lang.String r4 = "0"
                boolean r1 = r1.equals(r4)
                r4 = 0
                if (r1 == 0) goto Ld5
                r2.setEnabled(r3)
                java.lang.String r1 = "取消"
                r2.setText(r1)
                com.bxkj.student.home.teaching.lesson.e r1 = new com.bxkj.student.home.teaching.lesson.e
                r1.<init>(r6, r2, r7)
                r2.setOnClickListener(r1)
                goto Ldd
            Ld5:
                r2.setEnabled(r4)
                java.lang.String r1 = "不可取消"
                r2.setText(r1)
            Ldd:
                java.lang.String r1 = "classimg"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r2 = 2131296632(0x7f090178, float:1.8211186E38)
                r7.N(r2, r3)
                com.bxkj.student.home.teaching.lesson.f r5 = new com.bxkj.student.home.teaching.lesson.f
                r5.<init>(r6, r1)
                r7.w(r2, r5)
                java.lang.String r1 = "scores"
                float r8 = cn.bluemobi.dylan.http.JsonParse.getFloat(r8, r1)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getSchoolId()
                java.lang.String r2 = "85"
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 != 0) goto L135
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getSchoolId()
                java.lang.String r5 = "2"
                boolean r1 = r1.equalsIgnoreCase(r5)
                if (r1 != 0) goto L135
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getSchoolId()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 != 0) goto L135
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getSchoolId()
                java.lang.String r2 = "131"
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L13c
            L135:
                r1 = 1114636288(0x42700000, float:60.0)
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r1 < 0) goto L13c
                goto L13d
            L13c:
                r3 = 0
            L13d:
                r1 = 2131296593(0x7f090151, float:1.8211107E38)
                r7.N(r1, r3)
                com.bxkj.student.home.teaching.lesson.g r2 = new com.bxkj.student.home.teaching.lesson.g
                r2.<init>(r6, r0, r8)
                r7.w(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewLessonActivity b;

        b(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r2 = r1.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.g0(r2)
                java.util.List r2 = r2.d()
                int r0 = r1.a
                r2.remove(r0)
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r2 = r1.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.g0(r2)
                int r0 = r1.a
                r2.notifyItemRemoved(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewLessonActivity a;

        c(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r5 = r4.a
                int r0 = r5.f974p0
                int r1 = r5.c0
                int r2 = r0 / r1
                int r3 = r5.f973k0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.h0(r5)
                r5.q0()
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.j0(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.f973k0 = r3
                r5.l0()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r2 = r1.a
                r0 = 1
                r2.f973k0 = r0
                r2.l0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.ViewLessonActivity a;

        d(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.h0(r0)
                r0.w0()
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.h0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.f974p0 = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.g0(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r1 = r3.a
                int r1 = r1.f973k0
                r2 = 1
                if (r1 != r2) goto L28
                goto L2c
            L28:
                r0.addAll(r4)
                r4 = r0
            L2c:
                com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.lesson.ViewLessonActivity.g0(r0)
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
            r1.f973k0 = r0
            r1.f974p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout h0(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0, int r1) {
            r0.k0(r1)
            return
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.teaching.lesson.ViewLessonActivity r0) {
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
            com.bxkj.student.home.teaching.lesson.ViewLessonActivity$b r1 = new com.bxkj.student.home.teaching.lesson.ViewLessonActivity$b
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

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492982(0x7f0c0076, float:1.8609431E38)
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
            com.bxkj.student.home.teaching.lesson.ViewLessonActivity$a r0 = new com.bxkj.student.home.teaching.lesson.ViewLessonActivity$a
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
            java.lang.String r1 = "查看"
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
            com.bxkj.student.home.teaching.lesson.ViewLessonActivity$d r1 = new com.bxkj.student.home.teaching.lesson.ViewLessonActivity$d
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void n0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.home.teaching.lesson.ViewLessonActivity$c r1 = new com.bxkj.student.home.teaching.lesson.ViewLessonActivity$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

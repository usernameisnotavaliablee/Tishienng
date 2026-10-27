package com.bxkj.student.home.teaching.exam.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExamRecordActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private java.lang.String H0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> I0;
    private int J0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f834k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView f835p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.record.ExamRecordActivity k;

        a(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.a r0, cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.util.Map r2, android.view.View r3) {
                r0.r(r1, r2, r3)
                return
        }

        public static /* synthetic */ void n(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.a r0, boolean r1, java.util.Map r2, android.view.View r3) {
                r0.s(r1, r2, r3)
                return
        }

        public static /* synthetic */ void o(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.a r0, cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.util.Map r2) {
                r0.q(r1, r2)
                return
        }

        private /* synthetic */ void q(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.util.Map r5) {
                r3 = this;
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.k
                int r4 = r4.f()
                java.lang.String r1 = "stuId"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                java.lang.String r2 = "identify"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.n0(r0, r4, r1, r5)
                return
        }

        private /* synthetic */ void r(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map r3, android.view.View r4) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                android.content.Context r0 = r1.e
                r4.<init>(r0)
                java.lang.String r0 = "确定要删除吗？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setMessage(r0)
                com.bxkj.student.home.teaching.exam.record.c r0 = new com.bxkj.student.home.teaching.exam.record.c
                r0.<init>(r1, r2, r3)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r4.setRightButtonOnClickListener(r0)
                r2.show()
                return
        }

        private /* synthetic */ void s(boolean r3, java.util.Map r4, android.view.View r5) {
                r2 = this;
                if (r3 == 0) goto L26
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r3 = r2.k
                android.content.Intent r5 = new android.content.Intent
                android.content.Context r0 = r2.e
                java.lang.Class<com.bxkj.student.home.teaching.exam.record.ExamDetailActivity> r1 = com.bxkj.student.home.teaching.exam.record.ExamDetailActivity.class
                r5.<init>(r0, r1)
                java.lang.String r0 = "stuId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                java.lang.String r1 = "stuTeacherCurriculumId"
                android.content.Intent r5 = r5.putExtra(r1, r0)
                java.lang.String r0 = "identify"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                android.content.Intent r4 = r5.putExtra(r0, r4)
                r3.startActivity(r4)
            L26:
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.p(r1, r2)
                return
        }

        public void p(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r5.f()
                int r1 = r1 + 1
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298991(0x7f090aaf, float:1.821597E38)
                r5.J(r1, r0)
                java.lang.String r0 = "createTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131298954(0x7f090a8a, float:1.8215896E38)
                r5.J(r1, r0)
                java.lang.String r0 = "teaUser"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299151(0x7f090b4f, float:1.8216295E38)
                r5.J(r1, r0)
                java.lang.String r0 = "score"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                r1 = 2131299093(0x7f090b15, float:1.8216178E38)
                r5.J(r1, r0)
                java.lang.String r0 = "isDelete"
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r6, r0)
                r1 = 2131296603(0x7f09015b, float:1.8211127E38)
                r5.N(r1, r0)
                java.lang.String r0 = "isToView"
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r6, r0)
                r2 = 2131297101(0x7f09034d, float:1.8212137E38)
                r5.N(r2, r0)
                r2 = 2131298068(0x7f090714, float:1.8214099E38)
                r5.n(r2, r0)
                com.bxkj.student.home.teaching.exam.record.a r3 = new com.bxkj.student.home.teaching.exam.record.a
                r3.<init>(r4, r5, r6)
                r5.w(r1, r3)
                com.bxkj.student.home.teaching.exam.record.b r1 = new com.bxkj.student.home.teaching.exam.record.b
                r1.<init>(r4, r0, r6)
                r5.w(r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.record.ExamRecordActivity b;

        b(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r3 = r2.b
                java.util.List r3 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.h0(r3)
                int r0 = r2.a
                r3.remove(r0)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.g0(r3)
                int r0 = r2.a
                r3.notifyItemRemoved(r0)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.g0(r3)
                int r0 = r2.a
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r1 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.g0(r1)
                int r1 = r1.getItemCount()
                r3.notifyItemRangeChanged(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.record.ExamRecordActivity a;

        c(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.a
                java.lang.String r1 = "li"
                java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.m0(r0, r1)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.g0(r0)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r1 = r3.a
                java.util.List r1 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.h0(r1)
                r0.g(r1)
                java.lang.String r0 = "av"
                java.util.Map r4 = cn.bluemobi.dylan.http.JsonParse.getMap(r4, r0)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.j0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "考试次数："
                r1.append(r2)
                java.lang.String r2 = "total"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.i0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "平均分："
                r1.append(r2)
                java.lang.String r2 = "avg"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.l0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "总排名："
                r1.append(r2)
                java.lang.String r2 = "rank"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.record.ExamRecordActivity.k0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "年级排名："
                r1.append(r2)
                java.lang.String r2 = "gradeRank"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                return
        }
    }

    public ExamRecordActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.J0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView i0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0) {
            android.widget.TextView r0 = r0.f834k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0, java.util.List r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.exam.record.ExamRecordActivity r0, int r1, java.lang.String r2, java.lang.String r3) {
            r0.o0(r1, r2, r3)
            return
    }

    private void o0(int r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r4 = r1.e0(r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.home.teaching.exam.record.ExamRecordActivity$b r5 = new com.bxkj.student.home.teaching.exam.record.ExamRecordActivity$b
            r5.<init>(r2, r3)
            r4.setDataListener(r5)
            return
    }

    private void p0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r4.H0
            int r3 = r4.J0
            rx.e r1 = r1.F(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.record.ExamRecordActivity$c r1 = new com.bxkj.student.home.teaching.exam.record.ExamRecordActivity$c
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492933(0x7f0c0045, float:1.8609332E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "onlineType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L17
            android.content.Intent r0 = r4.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r4.J0 = r0
        L17:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "studentChooseLessonId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.H0 = r0
        L2d:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f835p0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.exam.record.ExamRecordActivity$a r0 = new com.bxkj.student.home.teaching.exam.record.ExamRecordActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493251(0x7f0c0183, float:1.8609977E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.G0
            r0.<init>(r4, r1, r2, r3)
            r4.I0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.f835p0
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.f835p0
            android.widget.TextView r1 = r4.F0
            r0.setEmptyView(r1)
            r4.p0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "查看考试记录"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            r3 = 2131298986(0x7f090aaa, float:1.821596E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Y = r3
            r3 = 2131298997(0x7f090ab5, float:1.8215983E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Z = r3
            r3 = 2131298848(0x7f090a20, float:1.821568E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.a0 = r3
            r3 = 2131298788(0x7f0909e4, float:1.821556E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.b0 = r3
            r3 = 2131299168(0x7f090b60, float:1.821633E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.c0 = r3
            r3 = 2131298923(0x7f090a6b, float:1.8215833E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f834k0 = r3
            r3 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r3 = r2.findViewById(r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r3
            r2.f835p0 = r3
            r3 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.F0 = r3
            android.widget.TextView r3 = r2.Y
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "姓名："
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getRealName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            android.widget.TextView r3 = r2.Z
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "学号："
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getAccount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

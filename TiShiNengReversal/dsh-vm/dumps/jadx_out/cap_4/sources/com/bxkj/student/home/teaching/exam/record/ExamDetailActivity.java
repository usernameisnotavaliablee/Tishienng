package com.bxkj.student.home.teaching.exam.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExamDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.lang.String b0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f833k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.record.ExamDetailActivity k;

        a(com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
                r12 = this;
                r0 = 2131299058(0x7f090af2, float:1.8216107E38)
                android.view.View r0 = r13.h(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = "questionType"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r1)
                java.lang.String r3 = "0"
                boolean r2 = r3.equals(r2)
                java.lang.String r4 = "多选"
                if (r2 == 0) goto L1c
                java.lang.String r1 = "单选"
                goto L3b
            L1c:
                java.lang.String r2 = "1"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r1)
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L2a
                r1 = r4
                goto L3b
            L2a:
                java.lang.String r2 = "3"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r1)
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L39
                java.lang.String r1 = "判断"
                goto L3b
            L39:
                java.lang.String r1 = "未知类型"
            L3b:
                r2 = 2131299171(0x7f090b63, float:1.8216336E38)
                r13.J(r2, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r5 = r13.f()
                r6 = 1
                int r5 = r5 + r6
                r2.append(r5)
                java.lang.String r5 = ""
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r5 = 2131298944(0x7f090a80, float:1.8215875E38)
                r13.J(r5, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "("
                r2.append(r5)
                java.lang.String r5 = "score"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r5)
                r2.append(r5)
                java.lang.String r5 = ")分"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r5 = 2131299093(0x7f090b15, float:1.8216178E38)
                r13.J(r5, r2)
                java.lang.String r2 = "questionName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r2)
                android.text.Spanned r2 = android.text.Html.fromHtml(r2)
                r0.setText(r2)
                java.lang.String r0 = "answers"
                java.lang.Object r0 = r14.get(r0)
                java.util.List r0 = (java.util.List) r0
                r2 = 2131298362(0x7f09083a, float:1.8214695E38)
                android.view.View r2 = r13.h(r2)
                android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
                r2.removeAllViews()
                java.lang.String r5 = "stuAnswers"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r5)
                java.util.Iterator r0 = r0.iterator()
            Lab:
                boolean r7 = r0.hasNext()
                java.lang.String r8 = "isRight"
                if (r7 == 0) goto L10a
                java.lang.Object r7 = r0.next()
                java.util.Map r7 = (java.util.Map) r7
                boolean r9 = r1.equals(r4)
                if (r9 == 0) goto Lc7
                android.widget.CheckBox r9 = new android.widget.CheckBox
                android.content.Context r10 = r12.e
                r9.<init>(r10)
                goto Lce
            Lc7:
                android.widget.RadioButton r9 = new android.widget.RadioButton
                android.content.Context r10 = r12.e
                r9.<init>(r10)
            Lce:
                r10 = 0
                r9.setClickable(r10)
                r10 = 2
                r11 = 1098907648(0x41800000, float:16.0)
                r9.setTextSize(r10, r11)
                java.lang.String r10 = "mark"
                java.lang.String r10 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r10)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                java.lang.String r10 = "."
                r11.append(r10)
                java.lang.String r10 = "answerOption"
                java.lang.String r10 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r10)
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r9.setText(r10)
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r8)
                boolean r7 = r7.equals(r3)
                r9.setChecked(r7)
                r2.addView(r9)
                goto Lab
            L10a:
                r0 = 2131299080(0x7f090b08, float:1.8216151E38)
                r13.N(r0, r6)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "考生答案："
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = "；是否正确："
                r1.append(r2)
                java.lang.String r14 = cn.bluemobi.dylan.http.JsonParse.getString(r14, r8)
                boolean r14 = r14.equals(r3)
                if (r14 == 0) goto L12f
                java.lang.String r14 = "正确"
                goto L131
            L12f:
                java.lang.String r14 = "错误"
            L131:
                r1.append(r14)
                java.lang.String r14 = r1.toString()
                r13.J(r0, r14)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.record.ExamDetailActivity a;

        b(com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.exam.record.ExamDetailActivity.i0(r0, r3)
                com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.exam.record.ExamDetailActivity.g0(r3)
                com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.exam.record.ExamDetailActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public ExamDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.exam.record.ExamDetailActivity r0, java.util.List r1) {
            r0.a0 = r1
            return
    }

    private void j0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r5.b0
            java.lang.String r4 = r5.f833k0
            rx.e r1 = r1.o1(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.record.ExamDetailActivity$b r1 = new com.bxkj.student.home.teaching.exam.record.ExamDetailActivity$b
            r1.<init>(r5)
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
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "stuTeacherCurriculumId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.b0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "identify"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f833k0 = r0
        L2c:
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.exam.record.ExamDetailActivity$a r0 = new com.bxkj.student.home.teaching.exam.record.ExamDetailActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493185(0x7f0c0141, float:1.8609843E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.c0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            r4.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "试卷详情"
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
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Z = r2
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Y
            r0 = 0
            r2.X0(r0)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = r1.Y
            r2.S0(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

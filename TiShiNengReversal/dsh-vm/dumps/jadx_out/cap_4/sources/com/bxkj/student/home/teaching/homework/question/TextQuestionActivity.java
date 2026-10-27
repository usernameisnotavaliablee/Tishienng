package com.bxkj.student.home.teaching.homework.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TextQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText F0;
    private android.widget.Button G0;
    private android.widget.TextView H0;
    private java.lang.String I0;
    private int J0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> K0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> L0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.LinearLayout f852k0;

    /* renamed from: p0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f853p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.TextQuestionActivity k;

        a(com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                java.lang.String r0 = "answerStr"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131298775(0x7f0909d7, float:1.8215533E38)
                r6.J(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "回答时间："
                r0.append(r1)
                java.lang.String r1 = "answerTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298842(0x7f090a1a, float:1.8215669E38)
                r6.J(r1, r0)
                java.lang.String r0 = "reviewTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r2 = 1
                r1 = r1 ^ r2
                r3 = 2131298831(0x7f090a0f, float:1.8215646E38)
                r6.N(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "批改时间："
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r6.J(r3, r0)
                java.lang.String r0 = "isRight"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                r1 = 2131298949(0x7f090a85, float:1.8215886E38)
                if (r0 != 0) goto L60
                java.lang.String r0 = "是否合格：不合格"
                r6.J(r1, r0)
                goto L70
            L60:
                if (r0 != r2) goto L68
                java.lang.String r0 = "是否合格：合格"
                r6.J(r1, r0)
                goto L70
            L68:
                r3 = 2
                if (r0 != r3) goto L70
                java.lang.String r0 = "是否合格：待批改"
                r6.J(r1, r0)
            L70:
                java.lang.String r0 = "note"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                r0 = r0 ^ r2
                r1 = 2131299078(0x7f090b06, float:1.8216147E38)
                r6.N(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "备注："
                r0.append(r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.J(r1, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.TextQuestionActivity a;

        b(com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.homework.question.TextQuestionActivity.h0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.TextQuestionActivity a;

        c(com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public TextQuestionActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.K0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r0, android.view.View r1) {
            r0.j0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void h0(com.bxkj.student.home.teaching.homework.question.TextQuestionActivity r0, java.util.Map r1) {
            r0.k0(r1)
            return
    }

    private void i0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r1 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.homework.a r1 = (com.bxkj.student.home.teaching.homework.a) r1
            java.lang.String r2 = r4.I0
            int r3 = r4.J0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.homework.question.TextQuestionActivity$b r1 = new com.bxkj.student.home.teaching.homework.question.TextQuestionActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void j0(android.view.View r4) {
            r3 = this;
            android.widget.EditText r4 = r3.F0
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L25
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "请填写答案"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
        L25:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r1 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.homework.a r1 = (com.bxkj.student.home.teaching.homework.a) r1
            java.lang.String r2 = r3.I0
            rx.e r4 = r1.a(r2, r4)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.home.teaching.homework.question.TextQuestionActivity$c r0 = new com.bxkj.student.home.teaching.homework.question.TextQuestionActivity$c
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    private void k0(java.util.Map<java.lang.String, java.lang.Object> r7) {
            r6 = this;
            java.lang.String r0 = "isFlag"
            boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r0)
            int r1 = r6.J0
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 != r4) goto L25
            android.widget.Button r0 = r6.G0
            java.lang.String r1 = "已合格"
            r0.setText(r1)
            android.widget.EditText r0 = r6.F0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.b0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.G0
            r0.setEnabled(r2)
            goto L74
        L25:
            r5 = 2
            if (r1 != r5) goto L3f
            android.widget.Button r0 = r6.G0
            java.lang.String r1 = "待批改"
            r0.setText(r1)
            android.widget.EditText r0 = r6.F0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.b0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.G0
            r0.setEnabled(r2)
            goto L74
        L3f:
            if (r0 == 0) goto L4e
            android.widget.Button r0 = r6.G0
            java.lang.String r1 = "提交"
            r0.setText(r1)
            android.widget.Button r0 = r6.G0
            r0.setEnabled(r4)
            goto L74
        L4e:
            android.widget.Button r0 = r6.G0
            java.lang.String r1 = "不合格"
            r0.setText(r1)
            android.widget.Button r0 = r6.G0
            r0.setEnabled(r2)
            android.widget.EditText r0 = r6.F0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.b0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.H0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.H0
            java.lang.String r1 = "markAnswer"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
            r0.setText(r1)
        L74:
            java.lang.String r0 = "questionsRecord"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r0)
            r6.K0 = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8d
            android.widget.LinearLayout r0 = r6.f852k0
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r6.f853p0
            r0.setVisibility(r3)
            goto L94
        L8d:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.L0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.K0
            r0.g(r1)
        L94:
            android.widget.TextView r0 = r6.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            java.lang.String r2 = "socre"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
            r1.append(r2)
            java.lang.String r2 = "分)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.lang.String r0 = "limitWordsLsl"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
            java.lang.String r1 = "limitWordsUsl"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r1)
            android.widget.TextView r2 = r6.b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "字数:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "-"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "之间"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.setText(r0)
            android.widget.TextView r0 = r6.c0
            java.lang.String r1 = "questionName"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
            android.text.Spanned r7 = android.text.Html.fromHtml(r7)
            r0.setText(r7)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.G0
            com.bxkj.student.home.teaching.homework.question.m r1 = new com.bxkj.student.home.teaching.homework.question.m
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492962(0x7f0c0062, float:1.860939E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "questionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.I0 = r0
        L1f:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "isQualified"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L36
            android.content.Intent r0 = r4.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r4.J0 = r0
        L36:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f853p0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.homework.question.TextQuestionActivity$a r0 = new com.bxkj.student.home.teaching.homework.question.TextQuestionActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493269(0x7f0c0195, float:1.8610013E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.K0
            r0.<init>(r4, r1, r2, r3)
            r4.L0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.f853p0
            r1.setAdapter(r0)
            r4.i0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "课后作业开始答题-问答题"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298959(0x7f090a8f, float:1.8215906E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131298423(0x7f090877, float:1.8214819E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f853p0 = r1
            r1 = 2131298045(0x7f0906fd, float:1.8214052E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f852k0 = r1
            r1 = 2131296927(0x7f09029f, float:1.8211784E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.F0 = r1
            r1 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.G0 = r1
            r1 = 2131299080(0x7f090b08, float:1.8216151E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.H0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

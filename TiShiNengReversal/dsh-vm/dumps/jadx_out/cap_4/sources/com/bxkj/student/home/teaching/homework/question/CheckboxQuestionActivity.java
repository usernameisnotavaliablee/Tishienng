package com.bxkj.student.home.teaching.homework.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CheckboxQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private int G0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private java.lang.StringBuilder I0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.RadioGroup c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f844k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f845p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity a;

        a(com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity.i0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity a;

        b(com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public CheckboxQuestionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r0, android.view.View r1) {
            r0.k0(r1)
            return
    }

    public static /* synthetic */ void h0(java.util.Map r0, android.widget.CompoundButton r1, boolean r2) {
            java.lang.String r1 = "icChecked"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity r0, java.util.Map r1) {
            r0.l0(r1)
            return
    }

    private void j0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r1 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.homework.a r1 = (com.bxkj.student.home.teaching.homework.a) r1
            java.lang.String r2 = r4.F0
            int r3 = r4.G0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity$a r1 = new com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void k0(android.view.View r4) {
            r3 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3.I0 = r4
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r3.H0
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r4.next()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "icChecked"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto Ld
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld
            java.lang.StringBuilder r1 = r3.I0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L38
            java.lang.String r2 = ""
            goto L3a
        L38:
            java.lang.String r2 = ","
        L3a:
            r1.append(r2)
            java.lang.StringBuilder r1 = r3.I0
            java.lang.String r2 = "answerId"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r0)
            goto Ld
        L49:
            java.lang.StringBuilder r4 = r3.I0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L62
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "请选择答案"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
        L62:
            android.content.Context r4 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r4 = cn.bluemobi.dylan.http.Http.with(r4)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r0 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.homework.a r0 = (com.bxkj.student.home.teaching.homework.a) r0
            java.lang.String r1 = r3.F0
            java.lang.StringBuilder r2 = r3.I0
            java.lang.String r2 = r2.toString()
            rx.e r0 = r0.a(r1, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
            com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity$b r0 = new com.bxkj.student.home.teaching.homework.question.CheckboxQuestionActivity$b
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    private void l0(java.util.Map<java.lang.String, java.lang.Object> r10) {
            r9 = this;
            java.lang.String r0 = "isFlag"
            boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r10, r0)
            int r1 = r9.G0
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L19
            android.widget.Button r1 = r9.f844k0
            java.lang.String r4 = "已合格"
            r1.setText(r4)
            android.widget.Button r1 = r9.f844k0
            r1.setEnabled(r2)
            goto L44
        L19:
            if (r0 == 0) goto L28
            android.widget.Button r1 = r9.f844k0
            java.lang.String r4 = "提交"
            r1.setText(r4)
            android.widget.Button r1 = r9.f844k0
            r1.setEnabled(r3)
            goto L44
        L28:
            android.widget.Button r1 = r9.f844k0
            java.lang.String r4 = "不合格"
            r1.setText(r4)
            android.widget.Button r1 = r9.f844k0
            r1.setEnabled(r2)
            android.widget.TextView r1 = r9.f845p0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r9.f845p0
            java.lang.String r4 = "markAnswer"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r4)
            r1.setText(r4)
        L44:
            android.widget.TextView r1 = r9.Y
            java.lang.String r4 = "questionName"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r4)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r9.b0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            java.lang.String r5 = "socre"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r5)
            r4.append(r5)
            java.lang.String r5 = "分)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            java.lang.String r1 = "answers"
            java.lang.Object r1 = r10.get(r1)
            java.util.List r1 = (java.util.List) r1
            r9.H0 = r1
            android.widget.RadioGroup r1 = r9.c0
            r1.removeAllViews()
            java.lang.String r1 = "stuAnswers"
            java.lang.String r10 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = r10.split(r1)
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r9.H0
            java.util.Iterator r1 = r1.iterator()
        L99:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L11c
            java.lang.Object r4 = r1.next()
            java.util.Map r4 = (java.util.Map) r4
            android.widget.CheckBox r5 = new android.widget.CheckBox
            android.content.Context r6 = r9.V
            r5.<init>(r6)
            r6 = 2
            r7 = 1098907648(0x41800000, float:16.0)
            r5.setTextSize(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "mark"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r7)
            r6.append(r7)
            java.lang.String r7 = "."
            r6.append(r7)
            java.lang.String r7 = "answerOption"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r7)
            android.text.Spanned r7 = android.text.Html.fromHtml(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.setText(r6)
            int r6 = r9.G0
            r7 = -1
            java.lang.String r8 = "answerId"
            if (r6 != r3) goto Lf4
            r5.setClickable(r2)
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r8)
            int r6 = r10.indexOf(r6)
            if (r6 == r7) goto Lef
            r6 = 1
            goto Lf0
        Lef:
            r6 = 0
        Lf0:
            r5.setChecked(r6)
            goto L10d
        Lf4:
            if (r0 == 0) goto Lfa
            r5.setClickable(r3)
            goto L10d
        Lfa:
            r5.setClickable(r2)
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r8)
            int r6 = r10.indexOf(r6)
            if (r6 == r7) goto L109
            r6 = 1
            goto L10a
        L109:
            r6 = 0
        L10a:
            r5.setChecked(r6)
        L10d:
            android.widget.RadioGroup r6 = r9.c0
            r6.addView(r5)
            com.bxkj.student.home.teaching.homework.question.b r6 = new com.bxkj.student.home.teaching.homework.question.b
            r6.<init>(r4)
            r5.setOnCheckedChangeListener(r6)
            goto L99
        L11c:
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.f844k0
            com.bxkj.student.home.teaching.homework.question.a r1 = new com.bxkj.student.home.teaching.homework.question.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492958(0x7f0c005e, float:1.8609383E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "questionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.F0 = r0
        L1f:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "isQualified"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L36
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.G0 = r0
        L36:
            r3.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "课后作业开始答题-多选"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            r1.c0 = r2
            r2 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.f844k0 = r2
            r2 = 2131299080(0x7f090b08, float:1.8216151E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f845p0 = r2
            android.widget.TextView r2 = r1.Z
            java.lang.String r0 = "多选"
            r2.setText(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

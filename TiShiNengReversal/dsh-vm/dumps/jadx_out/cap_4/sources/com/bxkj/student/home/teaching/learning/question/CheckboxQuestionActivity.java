package com.bxkj.student.home.teaching.learning.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CheckboxQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> G0;
    private java.lang.StringBuilder H0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.RadioGroup c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f952k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f953p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity a;

        a(com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity.i0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity a;

        b(com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public CheckboxQuestionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(java.util.Map r0, android.widget.CompoundButton r1, boolean r2) {
            java.lang.String r1 = "icChecked"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r0, android.view.View r1) {
            r0.k0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity r0, java.util.Map r1) {
            r0.l0(r1)
            return
    }

    private void j0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r2 = r4.f953p0
            int r3 = r4.F0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity$a r1 = new com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void k0(android.view.View r4) {
            r3 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3.H0 = r4
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r3.G0
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
            java.lang.StringBuilder r1 = r3.H0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L38
            java.lang.String r2 = ""
            goto L3a
        L38:
            java.lang.String r2 = ","
        L3a:
            r1.append(r2)
            java.lang.StringBuilder r1 = r3.H0
            java.lang.String r2 = "answerId"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r0)
            goto Ld
        L49:
            java.lang.StringBuilder r4 = r3.H0
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
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            java.lang.String r1 = r3.f953p0
            java.lang.StringBuilder r2 = r3.H0
            java.lang.String r2 = r2.toString()
            rx.e r0 = r0.a(r1, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
            com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity$b r0 = new com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity$b
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    private void l0(java.util.Map<java.lang.String, java.lang.Object> r7) {
            r6 = this;
            android.widget.TextView r0 = r6.a0
            java.lang.String r1 = "1"
            r0.setText(r1)
            android.widget.TextView r0 = r6.Y
            java.lang.String r1 = "questionName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r6.b0
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
            java.lang.String r0 = "answers"
            java.lang.Object r0 = r7.get(r0)
            java.util.List r0 = (java.util.List) r0
            r6.G0 = r0
            android.widget.RadioGroup r0 = r6.c0
            r0.removeAllViews()
            java.lang.String r0 = "stuAnswers"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            java.util.List r7 = java.util.Arrays.asList(r7)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.G0
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            android.widget.CheckBox r2 = new android.widget.CheckBox
            android.content.Context r3 = r6.V
            r2.<init>(r3)
            r3 = 2
            r4 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "mark"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            java.lang.String r4 = "answerOption"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            int r3 = r6.F0
            r4 = 1
            if (r3 != r4) goto Lb5
            r3 = 0
            r2.setClickable(r3)
            java.lang.String r3 = "answerId"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            int r3 = r7.indexOf(r3)
            r5 = -1
            if (r3 == r5) goto Lb5
            r2.setChecked(r4)
        Lb5:
            android.widget.RadioGroup r3 = r6.c0
            r3.addView(r2)
            com.bxkj.student.home.teaching.learning.question.a r3 = new com.bxkj.student.home.teaching.learning.question.a
            r3.<init>(r1)
            r2.setOnCheckedChangeListener(r3)
            goto L5c
        Lc3:
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.f952k0
            com.bxkj.student.home.teaching.learning.question.b r1 = new com.bxkj.student.home.teaching.learning.question.b
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
            r3.f953p0 = r0
        L1f:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "isQualified"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L36
            android.content.Intent r0 = r3.getIntent()
            int r0 = r0.getIntExtra(r1, r2)
            r3.F0 = r0
        L36:
            int r0 = r3.F0
            r1 = 1
            if (r0 != r1) goto L47
            android.widget.Button r0 = r3.f952k0
            java.lang.String r1 = "已合格"
            r0.setText(r1)
            android.widget.Button r0 = r3.f952k0
            r0.setEnabled(r2)
        L47:
            r3.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "开始答题-多选"
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
            r1.f952k0 = r2
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

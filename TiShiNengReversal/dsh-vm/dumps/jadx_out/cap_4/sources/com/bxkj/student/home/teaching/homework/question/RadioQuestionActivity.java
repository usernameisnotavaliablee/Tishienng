package com.bxkj.student.home.teaching.homework.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RadioQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private java.lang.String G0;
    private int H0;
    private java.lang.String I0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.RadioGroup c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f850k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f851p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity a;

        a(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity.k0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity c;

        b(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r1, java.util.List r2, java.util.Map r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.RadioGroup r3, @androidx.annotation.IdRes int r4) {
                r2 = this;
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r3 = r2.c
                android.widget.RadioGroup r3 = com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity.i0(r3)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.RadioButton r3 = (android.widget.RadioButton) r3
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r4 = r2.c
                java.util.List r0 = r2.a
                android.widget.RadioGroup r1 = com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity.i0(r4)
                int r3 = r1.indexOfChild(r3)
                java.lang.Object r3 = r0.get(r3)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "answerId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity.j0(r4, r3)
                java.util.Map r3 = r2.b
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r4 = r2.c
                java.lang.String r4 = com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity.h0(r4)
                java.lang.String r0 = "checkAnswerId"
                r3.put(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity a;

        c(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public RadioQuestionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0, android.view.View r1) {
            r0.m0(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0) {
            java.lang.String r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup i0(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0) {
            android.widget.RadioGroup r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0, java.lang.String r1) {
            r0.I0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity r0, java.util.Map r1) {
            r0.n0(r1)
            return
    }

    private void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r1 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.homework.a r1 = (com.bxkj.student.home.teaching.homework.a) r1
            java.lang.String r2 = r4.G0
            int r3 = r4.H0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity$a r1 = new com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void m0(android.view.View r4) {
            r3 = this;
            java.lang.String r4 = r3.I0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "请选择答案"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
        L19:
            android.content.Context r4 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r4 = cn.bluemobi.dylan.http.Http.with(r4)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r0 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.homework.a r0 = (com.bxkj.student.home.teaching.homework.a) r0
            java.lang.String r1 = r3.G0
            java.lang.String r2 = r3.I0
            rx.e r0 = r0.a(r1, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
            com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity$c r0 = new com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity$c
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    private void n0(java.util.Map<java.lang.String, java.lang.Object> r11) {
            r10 = this;
            java.lang.String r0 = "isFlag"
            boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r11, r0)
            int r1 = r10.H0
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L19
            android.widget.Button r1 = r10.f850k0
            java.lang.String r4 = "已合格"
            r1.setText(r4)
            android.widget.Button r1 = r10.f850k0
            r1.setEnabled(r2)
            goto L44
        L19:
            if (r0 == 0) goto L28
            android.widget.Button r1 = r10.f850k0
            java.lang.String r4 = "提交"
            r1.setText(r4)
            android.widget.Button r1 = r10.f850k0
            r1.setEnabled(r3)
            goto L44
        L28:
            android.widget.Button r1 = r10.f850k0
            java.lang.String r4 = "不合格"
            r1.setText(r4)
            android.widget.Button r1 = r10.f850k0
            r1.setEnabled(r2)
            android.widget.TextView r1 = r10.f851p0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r10.f851p0
            java.lang.String r4 = "markAnswer"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r4)
            r1.setText(r4)
        L44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "课后作业开始答题-"
            r1.append(r4)
            java.lang.String r4 = "questionTypeName"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r10.setTitle(r1)
            android.widget.TextView r1 = r10.Z
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r4)
            r1.setText(r4)
            android.widget.TextView r1 = r10.b0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            java.lang.String r5 = "socre"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r5)
            r4.append(r5)
            java.lang.String r5 = "分)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            android.widget.TextView r1 = r10.a0
            java.lang.String r4 = "1"
            r1.setText(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            java.lang.String r5 = "questionName"
            if (r1 < r4) goto La2
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r5)
            r4 = 63
            android.text.Spanned r1 = com.bxkj.base.util.l.a(r1, r4)
            goto Laa
        La2:
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r5)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
        Laa:
            android.widget.TextView r4 = r10.Y
            r4.setText(r1)
            java.lang.String r1 = "stuAnswers"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r1)
            java.lang.String r4 = "answers"
            java.lang.Object r4 = r11.get(r4)
            java.util.List r4 = (java.util.List) r4
            r10.F0 = r4
            android.widget.RadioGroup r4 = r10.c0
            r4.removeAllViews()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r10.F0
            java.util.Iterator r4 = r4.iterator()
        Lca:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L165
            java.lang.Object r5 = r4.next()
            java.util.Map r5 = (java.util.Map) r5
            android.widget.RadioButton r6 = new android.widget.RadioButton
            android.content.Context r7 = r10.V
            r6.<init>(r7)
            r7 = 2131231133(0x7f08019d, float:1.8078338E38)
            r6.setButtonDrawable(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r8 = r10.V
            r9 = 1109393408(0x42200000, float:40.0)
            int r8 = cn.bluemobi.dylan.base.utils.d.a(r8, r9)
            r9 = -1
            r7.<init>(r9, r8)
            android.content.Context r8 = r10.V
            r9 = 1084227584(0x40a00000, float:5.0)
            int r8 = cn.bluemobi.dylan.base.utils.d.a(r8, r9)
            r6.setPadding(r8, r2, r2, r2)
            r6.setLayoutParams(r7)
            java.lang.String r7 = "isRight"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r7)
            r6.setTag(r7)
            r7 = 2
            r8 = 1101004800(0x41a00000, float:20.0)
            r6.setTextSize(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "mark"
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r8)
            r7.append(r8)
            java.lang.String r8 = "."
            r7.append(r8)
            java.lang.String r8 = "answerOption"
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r8)
            android.text.Spanned r8 = android.text.Html.fromHtml(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.setText(r7)
            int r7 = r10.H0
            java.lang.String r8 = "answerId"
            if (r7 != r3) goto L14a
            r6.setClickable(r2)
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r8)
            boolean r5 = r1.equals(r5)
            r6.setChecked(r5)
            goto L15e
        L14a:
            if (r0 == 0) goto L150
            r6.setClickable(r3)
            goto L15e
        L150:
            r6.setClickable(r2)
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r8)
            boolean r5 = r1.equals(r5)
            r6.setChecked(r5)
        L15e:
            android.widget.RadioGroup r5 = r10.c0
            r5.addView(r6)
            goto Lca
        L165:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r10.F0
            android.widget.RadioGroup r1 = r10.c0
            com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity$b r2 = new com.bxkj.student.home.teaching.homework.question.RadioQuestionActivity$b
            r2.<init>(r10, r0, r11)
            r1.setOnCheckedChangeListener(r2)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.f850k0
            com.bxkj.student.home.teaching.homework.question.l r1 = new com.bxkj.student.home.teaching.homework.question.l
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492961(0x7f0c0061, float:1.8609389E38)
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
            r3.G0 = r0
        L1f:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "isQualified"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L36
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.H0 = r0
        L36:
            r3.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "课后作业开始答题"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r0.c0 = r1
            r1 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.f850k0 = r1
            r1 = 2131299080(0x7f090b08, float:1.8216151E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f851p0 = r1
            return
    }

    public void o0() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            android.widget.RadioGroup r2 = r5.c0
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L3a
            android.widget.RadioGroup r2 = r5.c0
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r2.setClickable(r0)
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "0"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
            android.content.Context r3 = r5.V
            r4 = 2131231132(0x7f08019c, float:1.8078336E38)
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r4)
            r2.setBackground(r3)
        L37:
            int r1 = r1 + 1
            goto L2
        L3a:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

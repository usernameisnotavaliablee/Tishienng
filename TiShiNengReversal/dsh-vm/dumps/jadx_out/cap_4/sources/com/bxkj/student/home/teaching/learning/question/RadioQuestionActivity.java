package com.bxkj.student.home.teaching.learning.question;

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
    private android.widget.Button f956k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.os.CountDownTimer f957p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity a;

        a(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity.k0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity c;

        b(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r1, java.util.List r2, java.util.Map r3) {
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
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r3 = r2.c
                android.widget.RadioGroup r3 = com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity.i0(r3)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.RadioButton r3 = (android.widget.RadioButton) r3
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r4 = r2.c
                java.util.List r0 = r2.a
                android.widget.RadioGroup r1 = com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity.i0(r4)
                int r3 = r1.indexOfChild(r3)
                java.lang.Object r3 = r0.get(r3)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "answerId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity.j0(r4, r3)
                java.util.Map r3 = r2.b
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r4 = r2.c
                java.lang.String r4 = com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity.h0(r4)
                java.lang.String r0 = "checkAnswerId"
                r3.put(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity a;

        c(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public RadioQuestionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0, android.view.View r1) {
            r0.m0(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0) {
            java.lang.String r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup i0(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0) {
            android.widget.RadioGroup r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0, java.lang.String r1) {
            r0.I0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity r0, java.util.Map r1) {
            r0.n0(r1)
            return
    }

    private void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r2 = r4.G0
            int r3 = r4.H0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity$a r1 = new com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity$a
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
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            java.lang.String r1 = r3.G0
            java.lang.String r2 = r3.I0
            rx.e r0 = r0.a(r1, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
            com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity$c r0 = new com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity$c
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    private void n0(java.util.Map<java.lang.String, java.lang.Object> r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "开始答题-"
            r0.append(r1)
            java.lang.String r1 = "questionTypeName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r7.setTitle(r0)
            android.widget.TextView r0 = r7.Z
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
            r0.setText(r1)
            android.widget.TextView r0 = r7.b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            java.lang.String r2 = "socre"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
            r1.append(r2)
            java.lang.String r2 = "分)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r7.a0
            java.lang.String r1 = "1"
            r0.setText(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            java.lang.String r2 = "questionName"
            if (r0 < r1) goto L5e
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
            r1 = 63
            android.text.Spanned r0 = com.bxkj.base.util.l.a(r0, r1)
            goto L66
        L5e:
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
        L66:
            android.widget.TextView r1 = r7.Y
            r1.setText(r0)
            java.lang.String r0 = "stuAnswers"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            java.lang.String r1 = "answers"
            java.lang.Object r1 = r8.get(r1)
            java.util.List r1 = (java.util.List) r1
            r7.F0 = r1
            android.widget.RadioGroup r1 = r7.c0
            r1.removeAllViews()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r7.F0
            java.util.Iterator r1 = r1.iterator()
        L86:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L110
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            android.widget.RadioButton r3 = new android.widget.RadioButton
            android.content.Context r4 = r7.V
            r3.<init>(r4)
            r4 = 2131231133(0x7f08019d, float:1.8078338E38)
            r3.setButtonDrawable(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r5 = r7.V
            r6 = 1109393408(0x42200000, float:40.0)
            int r5 = cn.bluemobi.dylan.base.utils.d.a(r5, r6)
            r6 = -1
            r4.<init>(r6, r5)
            android.content.Context r5 = r7.V
            r6 = 1084227584(0x40a00000, float:5.0)
            int r5 = cn.bluemobi.dylan.base.utils.d.a(r5, r6)
            r6 = 0
            r3.setPadding(r5, r6, r6, r6)
            r3.setLayoutParams(r4)
            java.lang.String r4 = "isRight"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            r3.setTag(r4)
            r4 = 2
            r5 = 1101004800(0x41a00000, float:20.0)
            r3.setTextSize(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mark"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r5)
            r4.append(r5)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r5 = "answerOption"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r5)
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            int r4 = r7.H0
            r5 = 1
            if (r4 != r5) goto L109
            r3.setClickable(r6)
            java.lang.String r4 = "answerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L109
            r3.setChecked(r5)
        L109:
            android.widget.RadioGroup r2 = r7.c0
            r2.addView(r3)
            goto L86
        L110:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r7.F0
            android.widget.RadioGroup r1 = r7.c0
            com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity$b r2 = new com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity$b
            r2.<init>(r7, r0, r8)
            r1.setOnCheckedChangeListener(r2)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.f956k0
            com.bxkj.student.home.teaching.learning.question.f r1 = new com.bxkj.student.home.teaching.learning.question.f
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
            r2 = 0
            if (r0 == 0) goto L36
            android.content.Intent r0 = r3.getIntent()
            int r0 = r0.getIntExtra(r1, r2)
            r3.H0 = r0
        L36:
            int r0 = r3.H0
            r1 = 1
            if (r0 != r1) goto L47
            android.widget.Button r0 = r3.f956k0
            java.lang.String r1 = "已合格"
            r0.setText(r1)
            android.widget.Button r0 = r3.f956k0
            r0.setEnabled(r2)
        L47:
            r3.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "开始答题"
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
            r0.f956k0 = r1
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

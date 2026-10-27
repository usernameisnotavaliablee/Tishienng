package com.bxkj.student.home.teaching.exam.mock;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NewRadioExamFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f828l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f829m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.RadioGroup f830n;

    /* renamed from: o, reason: collision with root package name */
    private android.os.CountDownTimer f831o;

    /* renamed from: p, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f832p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment c;

        a(com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r1, java.util.Map r2, com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3) {
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
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r3 = r2.c
                android.widget.RadioGroup r3 = com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment.O(r3)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.RadioButton r3 = (android.widget.RadioButton) r3
                java.util.Map r4 = r2.a
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r0 = r2.c
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment.N(r0)
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r1 = r2.c
                android.widget.RadioGroup r1 = com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment.O(r1)
                int r1 = r1.indexOfChild(r3)
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "answerId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r1 = "checkAnswerId"
                r4.put(r1, r0)
                java.lang.Object r4 = r3.getTag()
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "0"
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L4d
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r4 = r2.c
                android.content.Context r4 = com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment.P(r4)
                r0 = 2131231132(0x7f08019c, float:1.8078336E38)
            L48:
                android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r0)
                goto L57
            L4d:
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r4 = r2.c
                android.content.Context r4 = com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment.Q(r4)
                r0 = 2131231131(0x7f08019b, float:1.8078334E38)
                goto L48
            L57:
                r3.setBackground(r4)
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r3 = r2.c
                r3.R()
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r2.b
                android.widget.Button r3 = r3.c0
                r4 = 1
                r3.setEnabled(r4)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r2.b
                android.widget.Button r3 = r3.f826k0
                r3.setEnabled(r4)
                return
        }
    }

    public NewRadioExamFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ java.util.List N(com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f832p
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup O(com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r0) {
            android.widget.RadioGroup r0 = r0.f830n
            return r0
    }

    static /* synthetic */ android.content.Context P(com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Q(com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    public void R() {
            r5 = this;
            android.widget.RadioGroup r0 = r5.f830n
            if (r0 != 0) goto L5
            goto L3f
        L5:
            r0 = 0
            r1 = 0
        L7:
            android.widget.RadioGroup r2 = r5.f830n
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L3f
            android.widget.RadioGroup r2 = r5.f830n
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r2.setClickable(r0)
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "0"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3c
            android.content.Context r3 = r5.g
            r4 = 2131231132(0x7f08019c, float:1.8078336E38)
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r4)
            r2.setBackground(r3)
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r0 = this;
            return
    }

    protected void f(android.view.View r11) {
            r10 = this;
            r11 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r11 = r10.c(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.j = r11
            r11 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r11 = r10.c(r11)
            android.widget.RadioGroup r11 = (android.widget.RadioGroup) r11
            r10.f830n = r11
            r11 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r11 = r10.c(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f828l = r11
            r11 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r11 = r10.c(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f829m = r11
            r11 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r11 = r10.c(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.k = r11
            android.os.Bundle r11 = r10.getArguments()
            java.lang.String r0 = "index"
            int r11 = r11.getInt(r0)
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = (com.bxkj.student.home.teaching.exam.mock.NewExamActivity) r0
            android.os.Bundle r1 = r10.getArguments()
            java.lang.String r2 = "seralizableMap"
            java.io.Serializable r1 = r1.getSerializable(r2)
            cn.bluemobi.dylan.base.utils.SeralizableMap r1 = (cn.bluemobi.dylan.base.utils.SeralizableMap) r1
            java.util.Map r1 = r1.getMap()
            android.widget.TextView r2 = r10.f828l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 1
            int r11 = r11 + r4
            r3.append(r11)
            java.lang.String r11 = ""
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.setText(r11)
            android.widget.TextView r11 = r10.j
            java.lang.String r2 = "questionName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            r11.setText(r2)
            android.widget.TextView r11 = r10.f829m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "("
            r2.append(r3)
            java.lang.String r3 = "score"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            r2.append(r3)
            java.lang.String r3 = ")分"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r11.setText(r2)
            java.lang.String r11 = "answers"
            java.lang.Object r11 = r1.get(r11)
            java.util.List r11 = (java.util.List) r11
            r10.f832p = r11
            android.widget.RadioGroup r11 = r10.f830n
            r11.removeAllViews()
            java.lang.String r11 = "questionType"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r11)
            java.lang.String r3 = "0"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc4
            android.widget.TextView r11 = r10.k
            java.lang.String r2 = "单选"
            r11.setText(r2)
            goto Leb
        Lc4:
            java.lang.String r2 = "1"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r11)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto Ld8
            android.widget.TextView r11 = r10.k
            java.lang.String r2 = "多选"
            r11.setText(r2)
            goto Leb
        Ld8:
            java.lang.String r2 = "3"
            java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r11)
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto Leb
            android.widget.TextView r11 = r10.k
            java.lang.String r2 = "判断"
            r11.setText(r2)
        Leb:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r11 = r10.f832p
            java.util.Iterator r11 = r11.iterator()
        Lf1:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L1bf
            java.lang.Object r2 = r11.next()
            java.util.Map r2 = (java.util.Map) r2
            android.widget.RadioButton r5 = new android.widget.RadioButton
            android.content.Context r6 = r10.g
            r5.<init>(r6)
            r6 = 2131231133(0x7f08019d, float:1.8078338E38)
            r5.setButtonDrawable(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r7 = r10.g
            r8 = 1109393408(0x42200000, float:40.0)
            int r7 = cn.bluemobi.dylan.base.utils.d.a(r7, r8)
            r8 = -1
            r6.<init>(r8, r7)
            android.content.Context r7 = r10.g
            r8 = 1084227584(0x40a00000, float:5.0)
            int r7 = cn.bluemobi.dylan.base.utils.d.a(r7, r8)
            r6.topMargin = r7
            android.content.Context r7 = r10.g
            r8 = 1092616192(0x41200000, float:10.0)
            int r7 = cn.bluemobi.dylan.base.utils.d.a(r7, r8)
            r6.leftMargin = r7
            android.content.Context r7 = r10.g
            int r7 = cn.bluemobi.dylan.base.utils.d.a(r7, r8)
            r8 = 0
            r5.setPadding(r7, r8, r8, r8)
            r5.setLayoutParams(r6)
            java.lang.String r6 = "isRight"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r6)
            r5.setTag(r6)
            r7 = 2
            r9 = 1098907648(0x41800000, float:16.0)
            r5.setTextSize(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "mark"
            java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r9)
            r7.append(r9)
            java.lang.String r9 = "."
            r7.append(r9)
            java.lang.String r9 = "answerOption"
            java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r9)
            android.text.Spanned r9 = android.text.Html.fromHtml(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r5.setText(r7)
            android.widget.RadioGroup r7 = r10.f830n
            r7.addView(r5)
            java.lang.String r7 = "checkAnswerId"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r7)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L188
            java.lang.String r9 = "timeFinish"
            boolean r9 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r1, r9)
            if (r9 == 0) goto Lf1
        L188:
            r5.setFocusable(r8)
            r5.setFocusableInTouchMode(r8)
            java.lang.String r9 = "answerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r9)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L1b7
            boolean r2 = r3.equals(r6)
            if (r2 == 0) goto L1aa
            android.content.Context r2 = r10.g
            r6 = 2131231132(0x7f08019c, float:1.8078336E38)
        L1a5:
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r6)
            goto L1b0
        L1aa:
            android.content.Context r2 = r10.g
            r6 = 2131231131(0x7f08019b, float:1.8078334E38)
            goto L1a5
        L1b0:
            r5.setBackground(r2)
            r5.setChecked(r4)
            goto L1ba
        L1b7:
            r5.setChecked(r8)
        L1ba:
            r10.R()
            goto Lf1
        L1bf:
            android.widget.RadioGroup r11 = r10.f830n
            com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment$a r2 = new com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment$a
            r2.<init>(r10, r1, r0)
            r11.setOnCheckedChangeListener(r2)
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493185(0x7f0c0141, float:1.8609843E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

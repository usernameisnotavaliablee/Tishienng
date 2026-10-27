package com.bxkj.student.home.teaching.exam.mock;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NewCheckboxExamFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f821l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f822m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.RadioGroup f823n;

    /* renamed from: o, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f824o;

    /* renamed from: p, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.Object> f825p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;
        final /* synthetic */ android.widget.CheckBox c;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment d;

        a(com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r1, java.util.Map r2, com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3, android.widget.CheckBox r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
                r2 = this;
                java.util.Map r3 = r2.a
                java.lang.String r0 = "icChecked"
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                r3.put(r0, r1)
                if (r4 == 0) goto L1c
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r2.b
                android.widget.Button r3 = r3.c0
                r4 = 1
                r3.setEnabled(r4)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r2.b
                android.widget.Button r3 = r3.f826k0
                r3.setEnabled(r4)
            L1c:
                android.widget.CheckBox r3 = r2.c
                java.lang.Object r3 = r3.getTag()
                java.lang.String r3 = r3.toString()
                android.widget.CheckBox r4 = r2.c
                java.lang.String r0 = "0"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L3e
                com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r3 = r2.d
                android.content.Context r3 = com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment.N(r3)
                r0 = 2131231132(0x7f08019c, float:1.8078336E38)
            L39:
                android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r0)
                goto L48
            L3e:
                com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r3 = r2.d
                android.content.Context r3 = com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment.O(r3)
                r0 = 2131231131(0x7f08019b, float:1.8078334E38)
                goto L39
            L48:
                r4.setBackground(r3)
                android.widget.CheckBox r3 = r2.c
                r4 = 0
                r3.setFocusable(r4)
                android.widget.CheckBox r3 = r2.c
                r3.setFocusableInTouchMode(r4)
                android.widget.CheckBox r3 = r2.c
                r3.setClickable(r4)
                return
        }
    }

    public NewCheckboxExamFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context N(com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context O(com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    public void P() {
            r5 = this;
            android.widget.RadioGroup r0 = r5.f823n
            if (r0 != 0) goto L5
            goto L3f
        L5:
            r0 = 0
            r1 = 0
        L7:
            android.widget.RadioGroup r2 = r5.f823n
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L3f
            android.widget.RadioGroup r2 = r5.f823n
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            r2.setClickable(r0)
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

    protected void f(android.view.View r12) {
            r11 = this;
            r12 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r12 = r11.c(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.j = r12
            r12 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r12 = r11.c(r12)
            android.widget.RadioGroup r12 = (android.widget.RadioGroup) r12
            r11.f823n = r12
            r12 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r12 = r11.c(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f821l = r12
            r12 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r12 = r11.c(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f822m = r12
            r12 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r12 = r11.c(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.k = r12
            java.lang.String r0 = "多选"
            r12.setText(r0)
            android.os.Bundle r12 = r11.getArguments()
            java.lang.String r0 = "index"
            int r12 = r12.getInt(r0)
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = (com.bxkj.student.home.teaching.exam.mock.NewExamActivity) r0
            android.os.Bundle r1 = r11.getArguments()
            java.lang.String r2 = "seralizableMap"
            java.io.Serializable r1 = r1.getSerializable(r2)
            cn.bluemobi.dylan.base.utils.SeralizableMap r1 = (cn.bluemobi.dylan.base.utils.SeralizableMap) r1
            java.util.Map r1 = r1.getMap()
            android.widget.TextView r2 = r11.f821l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 1
            int r12 = r12 + r4
            r3.append(r12)
            java.lang.String r12 = ""
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r2.setText(r12)
            android.widget.TextView r12 = r11.j
            java.lang.String r2 = "questionName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            r12.setText(r2)
            android.widget.TextView r12 = r11.f822m
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
            r12.setText(r2)
            java.lang.String r12 = "answers"
            java.lang.Object r12 = r1.get(r12)
            java.util.List r12 = (java.util.List) r12
            r11.f824o = r12
            android.widget.RadioGroup r12 = r11.f823n
            r12.removeAllViews()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r12 = r11.f824o
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r3 = 0
        Lbb:
            boolean r5 = r12.hasNext()
            java.lang.String r6 = "icChecked"
            if (r5 == 0) goto L15c
            java.lang.Object r5 = r12.next()
            java.util.Map r5 = (java.util.Map) r5
            android.widget.CheckBox r7 = new android.widget.CheckBox
            android.content.Context r8 = r11.g
            r7.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r9 = r11.g
            r10 = 1109393408(0x42200000, float:40.0)
            int r9 = cn.bluemobi.dylan.base.utils.d.a(r9, r10)
            r10 = -1
            r8.<init>(r10, r9)
            android.content.Context r9 = r11.g
            r10 = 1092616192(0x41200000, float:10.0)
            int r9 = cn.bluemobi.dylan.base.utils.d.a(r9, r10)
            r8.topMargin = r9
            android.content.Context r9 = r11.g
            int r9 = cn.bluemobi.dylan.base.utils.d.a(r9, r10)
            r8.leftMargin = r9
            android.content.Context r9 = r11.g
            int r9 = cn.bluemobi.dylan.base.utils.d.a(r9, r10)
            r7.setPadding(r9, r2, r2, r2)
            r7.setLayoutParams(r8)
            r8 = 2
            r9 = 1098907648(0x41800000, float:16.0)
            r7.setTextSize(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "mark"
            java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r9)
            r8.append(r9)
            java.lang.String r9 = "."
            r8.append(r9)
            java.lang.String r9 = "answerOption"
            java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r9)
            android.text.Spanned r9 = android.text.Html.fromHtml(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.setText(r8)
            java.lang.String r8 = "isRight"
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r8)
            r7.setTag(r8)
            android.widget.RadioGroup r8 = r11.f823n
            r8.addView(r7)
            boolean r8 = r5.containsKey(r6)
            if (r8 == 0) goto L14b
            java.lang.Object r6 = r5.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L14b
            r6 = 1
            goto L14c
        L14b:
            r6 = 0
        L14c:
            if (r6 == 0) goto L14f
            r3 = 1
        L14f:
            r7.setChecked(r6)
            com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment$a r6 = new com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment$a
            r6.<init>(r11, r5, r0, r7)
            r7.setOnCheckedChangeListener(r6)
            goto Lbb
        L15c:
            if (r3 != 0) goto L168
            java.lang.String r12 = "timeFinish"
            boolean r12 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r1, r12)
            if (r12 == 0) goto L167
            goto L168
        L167:
            return
        L168:
            r12 = 0
        L169:
            android.widget.RadioGroup r1 = r11.f823n
            int r1 = r1.getChildCount()
            if (r12 >= r1) goto L1b6
            android.widget.RadioGroup r1 = r11.f823n
            android.view.View r1 = r1.getChildAt(r12)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r1.setFocusable(r2)
            r1.setFocusableInTouchMode(r2)
            r1.setClickable(r2)
            java.lang.Object r3 = r1.getTag()
            java.lang.String r3 = r3.toString()
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r11.f824o
            java.lang.Object r5 = r5.get(r12)
            java.util.Map r5 = (java.util.Map) r5
            boolean r5 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r5, r6)
            if (r5 == 0) goto L1b3
            java.lang.String r5 = "0"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1aa
            android.content.Context r3 = r11.g
            r5 = 2131231132(0x7f08019c, float:1.8078336E38)
        L1a5:
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r5)
            goto L1b0
        L1aa:
            android.content.Context r3 = r11.g
            r5 = 2131231131(0x7f08019b, float:1.8078334E38)
            goto L1a5
        L1b0:
            r1.setBackground(r3)
        L1b3:
            int r12 = r12 + 1
            goto L169
        L1b6:
            android.widget.Button r12 = r0.c0
            r12.setEnabled(r4)
            android.widget.Button r12 = r0.f826k0
            r12.setEnabled(r4)
            r11.P()
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

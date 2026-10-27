package com.bxkj.student.home.teaching.exam.formal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RadioExamFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f817l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f818m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.RadioGroup f819n;

    /* renamed from: o, reason: collision with root package name */
    private com.bxkj.student.home.teaching.exam.formal.ExamActivity f820o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.RadioExamFragment c;

        a(com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r1, java.util.Map r2, java.util.List r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.RadioGroup r4, @androidx.annotation.IdRes int r5) {
                r3 = this;
                java.util.Map r4 = r3.a
                java.util.List r0 = r3.b
                com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r1 = r3.c
                android.widget.RadioGroup r1 = com.bxkj.student.home.teaching.exam.formal.RadioExamFragment.O(r1)
                com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r2 = r3.c
                android.widget.RadioGroup r2 = com.bxkj.student.home.teaching.exam.formal.RadioExamFragment.O(r2)
                android.view.View r5 = r2.findViewById(r5)
                int r5 = r1.indexOfChild(r5)
                java.lang.Object r5 = r0.get(r5)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "answerId"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.lang.String r0 = "checkAnswerId"
                r4.put(r0, r5)
                com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r4 = r3.c
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = com.bxkj.student.home.teaching.exam.formal.RadioExamFragment.N(r4)
                android.widget.Button r4 = r4.Z
                r5 = 1
                r4.setEnabled(r5)
                com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r4 = r3.c
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = com.bxkj.student.home.teaching.exam.formal.RadioExamFragment.N(r4)
                android.widget.Button r4 = r4.a0
                r4.setEnabled(r5)
                com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r4 = r3.c
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = com.bxkj.student.home.teaching.exam.formal.RadioExamFragment.N(r4)
                r4.f812a1 = r5
                return
        }
    }

    public RadioExamFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity N(com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r0) {
            com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r0.f820o
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup O(com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r0) {
            android.widget.RadioGroup r0 = r0.f819n
            return r0
    }

    public void P() {
            r3 = this;
            com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.f820o
            int r0 = r0.Y0
            r1 = 1
            if (r0 == r1) goto L25
            r0 = 0
            r1 = 0
        L9:
            android.widget.RadioGroup r2 = r3.f819n
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L25
            android.widget.RadioGroup r2 = r3.f819n
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r2.setClickable(r0)
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            int r1 = r1 + 1
            goto L9
        L25:
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

    protected void f(android.view.View r9) {
            r8 = this;
            r9 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.j = r9
            r9 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r9 = r8.c(r9)
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9
            r8.f819n = r9
            r9 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f817l = r9
            r9 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f818m = r9
            r9 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.k = r9
            android.os.Bundle r9 = r8.getArguments()
            java.lang.String r0 = "index"
            int r9 = r9.getInt(r0)
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = (com.bxkj.student.home.teaching.exam.formal.ExamActivity) r0
            r8.f820o = r0
            android.os.Bundle r0 = r8.getArguments()
            java.lang.String r1 = "seralizableMap"
            java.io.Serializable r0 = r0.getSerializable(r1)
            cn.bluemobi.dylan.base.utils.SeralizableMap r0 = (cn.bluemobi.dylan.base.utils.SeralizableMap) r0
            java.util.Map r0 = r0.getMap()
            android.widget.TextView r1 = r8.f817l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1
            int r9 = r9 + r3
            r2.append(r9)
            java.lang.String r9 = ""
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.setText(r9)
            android.widget.TextView r9 = r8.j
            java.lang.String r1 = "questionName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r9.setText(r1)
            android.widget.TextView r9 = r8.f818m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            java.lang.String r2 = "score"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            r1.append(r2)
            java.lang.String r2 = ")分"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.setText(r1)
            java.lang.String r9 = "answers"
            java.lang.Object r9 = r0.get(r9)
            java.util.List r9 = (java.util.List) r9
            android.widget.RadioGroup r1 = r8.f819n
            r1.removeAllViews()
            java.lang.String r1 = "questionType"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            java.lang.String r4 = "0"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc4
            android.widget.TextView r1 = r8.k
            java.lang.String r2 = "单选"
            r1.setText(r2)
            goto Leb
        Lc4:
            java.lang.String r2 = "1"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Ld8
            android.widget.TextView r1 = r8.k
            java.lang.String r2 = "多选"
            r1.setText(r2)
            goto Leb
        Ld8:
            java.lang.String r2 = "3"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Leb
            android.widget.TextView r1 = r8.k
            java.lang.String r2 = "判断"
            r1.setText(r2)
        Leb:
            java.util.Iterator r1 = r9.iterator()
        Lef:
            boolean r2 = r1.hasNext()
            java.lang.String r4 = "checkAnswerId"
            if (r2 == 0) goto L14f
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            android.widget.RadioButton r5 = new android.widget.RadioButton
            android.content.Context r6 = r8.g
            r5.<init>(r6)
            r6 = 2
            r7 = 1098907648(0x41800000, float:16.0)
            r5.setTextSize(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "mark"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r7)
            r6.append(r7)
            java.lang.String r7 = "."
            r6.append(r7)
            java.lang.String r7 = "answerOption"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r7)
            android.text.Spanned r7 = android.text.Html.fromHtml(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.setText(r6)
            android.widget.RadioGroup r6 = r8.f819n
            r6.addView(r5)
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r4)
            java.lang.String r6 = "answerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r6)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L14a
            r5.setChecked(r3)
            goto Lef
        L14a:
            r2 = 0
            r5.setChecked(r2)
            goto Lef
        L14f:
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L161
            java.lang.String r1 = "timeFinish"
            boolean r1 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r1)
            if (r1 == 0) goto L164
        L161:
            r8.P()
        L164:
            android.widget.RadioGroup r1 = r8.f819n
            com.bxkj.student.home.teaching.exam.formal.RadioExamFragment$a r2 = new com.bxkj.student.home.teaching.exam.formal.RadioExamFragment$a
            r2.<init>(r8, r0, r9)
            r1.setOnCheckedChangeListener(r2)
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

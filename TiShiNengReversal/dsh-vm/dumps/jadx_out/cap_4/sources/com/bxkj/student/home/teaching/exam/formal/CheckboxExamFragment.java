package com.bxkj.student.home.teaching.exam.formal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CheckboxExamFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f808l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f809m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.RadioGroup f810n;

    /* renamed from: o, reason: collision with root package name */
    private com.bxkj.student.home.teaching.exam.formal.ExamActivity f811o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment b;

        a(com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r1, java.util.Map r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
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
                if (r4 == 0) goto L2c
                com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r3 = r2.b
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment.N(r3)
                android.widget.Button r3 = r3.Z
                r4 = 1
                r3.setEnabled(r4)
                com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r3 = r2.b
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment.N(r3)
                android.widget.Button r3 = r3.a0
                r3.setEnabled(r4)
                com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r3 = r2.b
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment.N(r3)
                r3.f812a1 = r4
            L2c:
                return
        }
    }

    public CheckboxExamFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity N(com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r0) {
            com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r0.f811o
            return r0
    }

    public void O() {
            r3 = this;
            com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.f811o
            int r0 = r0.Y0
            r1 = 1
            if (r0 == r1) goto L25
            r0 = 0
            r1 = 0
        L9:
            android.widget.RadioGroup r2 = r3.f810n
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L25
            android.widget.RadioGroup r2 = r3.f810n
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            r2.setClickable(r0)
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
            r8.f810n = r9
            r9 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f808l = r9
            r9 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f809m = r9
            r9 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r9 = r8.c(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.k = r9
            java.lang.String r0 = "多选"
            r9.setText(r0)
            android.os.Bundle r9 = r8.getArguments()
            java.lang.String r0 = "index"
            int r9 = r9.getInt(r0)
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = (com.bxkj.student.home.teaching.exam.formal.ExamActivity) r0
            r8.f811o = r0
            android.os.Bundle r0 = r8.getArguments()
            java.lang.String r1 = "seralizableMap"
            java.io.Serializable r0 = r0.getSerializable(r1)
            cn.bluemobi.dylan.base.utils.SeralizableMap r0 = (cn.bluemobi.dylan.base.utils.SeralizableMap) r0
            java.util.Map r0 = r0.getMap()
            android.widget.TextView r1 = r8.f808l
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
            android.widget.TextView r9 = r8.f809m
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
            android.widget.RadioGroup r1 = r8.f810n
            r1.removeAllViews()
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
            r2 = 0
        Lb9:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L134
            java.lang.Object r4 = r9.next()
            java.util.Map r4 = (java.util.Map) r4
            android.widget.CheckBox r5 = new android.widget.CheckBox
            android.content.Context r6 = r8.g
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
            android.widget.RadioGroup r6 = r8.f810n
            r6.addView(r5)
            java.lang.String r6 = "icChecked"
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L114
            java.lang.Object r7 = r4.get(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L114
            r7 = 1
            goto L115
        L114:
            r7 = 0
        L115:
            r5.setChecked(r7)
            com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment$a r7 = new com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment$a
            r7.<init>(r8, r4)
            r5.setOnCheckedChangeListener(r7)
            boolean r5 = r4.containsKey(r6)
            if (r5 == 0) goto Lb9
            java.lang.Object r4 = r4.get(r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lb9
            r2 = 1
            goto Lb9
        L134:
            if (r2 != 0) goto L140
            java.lang.String r9 = "timeFinish"
            boolean r9 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r9)
            if (r9 == 0) goto L13f
            goto L140
        L13f:
            return
        L140:
            r8.O()
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

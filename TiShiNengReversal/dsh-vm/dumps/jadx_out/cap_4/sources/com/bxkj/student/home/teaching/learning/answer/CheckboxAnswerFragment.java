package com.bxkj.student.home.teaching.learning.answer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CheckboxAnswerFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.TextView k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f862l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f863m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.RadioGroup f864n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.CheckboxAnswerFragment b;

        a(com.bxkj.student.home.teaching.learning.answer.CheckboxAnswerFragment r1, java.util.Map r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
                r1 = this;
                java.util.Map r2 = r1.a
                java.lang.String r0 = "icChecked"
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r2.put(r0, r3)
                return
        }
    }

    public CheckboxAnswerFragment() {
            r0 = this;
            r0.<init>()
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

    protected void f(android.view.View r6) {
            r5 = this;
            r6 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r6 = r5.c(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.j = r6
            r6 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r6 = r5.c(r6)
            android.widget.RadioGroup r6 = (android.widget.RadioGroup) r6
            r5.f864n = r6
            r6 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r6 = r5.c(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f862l = r6
            r6 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r6 = r5.c(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f863m = r6
            r6 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r6 = r5.c(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.k = r6
            java.lang.String r0 = "多选"
            r6.setText(r0)
            android.os.Bundle r6 = r5.getArguments()
            java.lang.String r0 = "index"
            int r6 = r6.getInt(r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = (com.bxkj.student.home.teaching.learning.answer.AnswerActivity) r0
            java.util.List r0 = r0.H0()
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            android.widget.TextView r1 = r5.f862l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1
            int r6 = r6 + r3
            r2.append(r6)
            java.lang.String r6 = ""
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.setText(r6)
            android.widget.TextView r6 = r5.j
            java.lang.String r1 = "questionName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r6.setText(r1)
            android.widget.TextView r6 = r5.f863m
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
            r6.setText(r1)
            java.lang.String r6 = "answers"
            java.lang.Object r6 = r0.get(r6)
            java.util.List r6 = (java.util.List) r6
            android.widget.RadioGroup r0 = r5.f864n
            r0.removeAllViews()
            java.util.Iterator r6 = r6.iterator()
        Laf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L117
            java.lang.Object r0 = r6.next()
            java.util.Map r0 = (java.util.Map) r0
            android.widget.CheckBox r1 = new android.widget.CheckBox
            android.content.Context r2 = r5.g
            r1.<init>(r2)
            r2 = 2
            r4 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "mark"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r4)
            r2.append(r4)
            java.lang.String r4 = "."
            r2.append(r4)
            java.lang.String r4 = "answerOption"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r4)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            android.widget.RadioGroup r2 = r5.f864n
            r2.addView(r1)
            java.lang.String r2 = "icChecked"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L10a
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L10a
            r2 = 1
            goto L10b
        L10a:
            r2 = 0
        L10b:
            r1.setChecked(r2)
            com.bxkj.student.home.teaching.learning.answer.CheckboxAnswerFragment$a r2 = new com.bxkj.student.home.teaching.learning.answer.CheckboxAnswerFragment$a
            r2.<init>(r5, r0)
            r1.setOnCheckedChangeListener(r2)
            goto Laf
        L117:
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

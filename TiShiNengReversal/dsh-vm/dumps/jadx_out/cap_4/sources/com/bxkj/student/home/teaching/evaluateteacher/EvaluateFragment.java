package com.bxkj.student.home.teaching.evaluateteacher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EvaluateFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private android.widget.TextView j;
    private android.widget.RadioGroup k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ java.util.Map a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment c;

        a(com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment r1, java.util.Map r2, java.util.List r3) {
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
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment r1 = r3.c
                android.widget.RadioGroup r1 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment.N(r1)
                com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment r2 = r3.c
                android.widget.RadioGroup r2 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment.N(r2)
                android.view.View r5 = r2.findViewById(r5)
                int r5 = r1.indexOfChild(r5)
                java.lang.Object r5 = r0.get(r5)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "score"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.lang.String r0 = "checkScore"
                r4.put(r0, r5)
                return
        }
    }

    public EvaluateFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.RadioGroup N(com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment r0) {
            android.widget.RadioGroup r0 = r0.k
            return r0
    }

    public void b() {
            r0 = this;
            return
    }

    protected void e() {
            r0 = this;
            return
    }

    protected void f(android.view.View r8) {
            r7 = this;
            r8 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r8 = r7.c(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.j = r8
            r8 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.view.View r8 = r7.c(r8)
            android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
            r7.k = r8
            android.os.Bundle r8 = r7.getArguments()
            java.lang.String r0 = "index"
            int r8 = r8.getInt(r0)
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity r0 = (com.bxkj.student.home.teaching.evaluateteacher.EvaluateActivity) r0
            java.util.List r0 = r0.u0()
            java.lang.Object r0 = r0.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            android.widget.TextView r1 = r7.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1
            int r8 = r8 + r3
            r2.append(r8)
            java.lang.String r8 = "."
            r2.append(r8)
            java.lang.String r8 = "content"
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r8)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.setText(r8)
            java.lang.String r8 = "scores"
            java.lang.Object r8 = r0.get(r8)
            java.util.List r8 = (java.util.List) r8
            android.widget.RadioGroup r1 = r7.k
            r1.removeAllViews()
            java.util.Iterator r1 = r8.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            android.widget.RadioButton r4 = new android.widget.RadioButton
            android.content.Context r5 = r7.g
            r4.<init>(r5)
            r5 = 2
            r6 = 1098907648(0x41800000, float:16.0)
            r4.setTextSize(r5, r6)
            java.lang.String r5 = "score"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r5)
            r4.setText(r6)
            android.widget.RadioGroup r6 = r7.k
            r6.addView(r4)
            java.lang.String r6 = "checkScore"
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r6)
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r5)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L9d
            r4.setChecked(r3)
            goto L62
        L9d:
            r2 = 0
            r4.setChecked(r2)
            goto L62
        La2:
            android.widget.RadioGroup r1 = r7.k
            com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment$a r2 = new com.bxkj.student.home.teaching.evaluateteacher.EvaluateFragment$a
            r2.<init>(r7, r0, r8)
            r1.setOnCheckedChangeListener(r2)
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493184(0x7f0c0140, float:1.860984E38)
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}

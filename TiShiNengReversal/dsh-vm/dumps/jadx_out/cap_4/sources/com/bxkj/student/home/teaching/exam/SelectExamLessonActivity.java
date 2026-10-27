package com.bxkj.student.home.teaching.exam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SelectExamLessonActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private int F0;
    private java.util.HashSet<java.lang.String> G0;
    private java.util.HashSet<java.lang.String> H0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private android.widget.Button a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f806k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f807p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.SelectExamLessonActivity k;

        a(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "teachingCurriculumName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298986(0x7f090aaa, float:1.821596E38)
                r3.J(r1, r0)
                java.lang.String r0 = "teachingCurriculumId"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0 = r2.k
                java.util.HashSet r0 = com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.j0(r0)
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto L2d
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0 = r2.k
                java.util.HashSet r0 = com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.k0(r0)
                boolean r4 = r0.contains(r4)
                if (r4 == 0) goto L2b
                goto L2d
            L2b:
                r4 = 0
                goto L2e
            L2d:
                r4 = 1
            L2e:
                r0 = 2131296715(0x7f0901cb, float:1.8211355E38)
                r3.m(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.SelectExamLessonActivity a;

        b(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0 = r2.a
                java.lang.String r1 = "teachingCurriculumArray"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.l0(r0, r3)
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.i0(r3)
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.SelectExamLessonActivity a;

        c(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r1 = r0.a
                com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.m0(r1)
                return
        }
    }

    public SelectExamLessonActivity() {
            r1 = this;
            r1.<init>()
            r0 = 8
            r1.f807p0 = r0
            r0 = 2
            r1.F0 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.G0 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.H0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.p0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter i0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashSet j0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0) {
            java.util.HashSet<java.lang.String> r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashSet k0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0) {
            java.util.HashSet<java.lang.String> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0, java.util.List r1) {
            r0.Y = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.teaching.exam.SelectExamLessonActivity r0) {
            r0.q0()
            return
    }

    private void n0() {
            r1 = this;
            r0 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1.Z = r0
            r0 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.a0 = r0
            return
    }

    private void o0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.Y()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.SelectExamLessonActivity$b r1 = new com.bxkj.student.home.teaching.exam.SelectExamLessonActivity$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void p0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.b0
            java.lang.Object r1 = r1.getItem(r4)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "teachingCurriculumId"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.b0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "type"
            int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
            r3 = 1
            java.lang.String r4 = "最多只能选择"
            if (r2 != r3) goto L65
            java.util.HashSet<java.lang.String> r2 = r0.G0
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L30
            java.util.HashSet<java.lang.String> r2 = r0.G0
            r2.remove(r1)
            goto Laa
        L30:
            java.util.HashSet<java.lang.String> r2 = r0.G0
            int r2 = r2.size()
            int r3 = r0.f807p0
            if (r2 >= r3) goto L40
            java.util.HashSet<java.lang.String> r2 = r0.G0
            r2.add(r1)
            goto Laa
        L40:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r0.V
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            int r3 = r0.f807p0
            r2.append(r3)
            java.lang.String r3 = "门A题型课程"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
            r1.show()
            goto Laa
        L65:
            r3 = 2
            if (r2 != r3) goto Laa
            java.util.HashSet<java.lang.String> r2 = r0.H0
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L76
            java.util.HashSet<java.lang.String> r2 = r0.H0
            r2.remove(r1)
            goto Laa
        L76:
            java.util.HashSet<java.lang.String> r2 = r0.H0
            int r2 = r2.size()
            int r3 = r0.F0
            if (r2 >= r3) goto L86
            java.util.HashSet<java.lang.String> r2 = r0.H0
            r2.add(r1)
            goto Laa
        L86:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r0.V
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            int r3 = r0.F0
            r2.append(r3)
            java.lang.String r3 = "门B题型课程"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
            r1.show()
        Laa:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r0.b0
            r1.notifyDataSetChanged()
            return
    }

    private void q0() {
            r4 = this;
            java.util.HashSet<java.lang.String> r0 = r4.G0
            int r0 = r0.size()
            int r1 = r4.f807p0
            java.lang.String r2 = "请选择"
            if (r0 == r1) goto L31
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r2 = r4.f807p0
            r1.append(r2)
            java.lang.String r2 = "门A题型课程"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L31:
            java.util.HashSet<java.lang.String> r0 = r4.H0
            int r0 = r0.size()
            int r1 = r4.F0
            if (r0 == r1) goto L60
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r2 = r4.F0
            r1.append(r2)
            java.lang.String r2 = "门B题型课程"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L60:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet<java.lang.String> r1 = r4.G0
            r0.addAll(r1)
            java.util.HashSet<java.lang.String> r1 = r4.H0
            r0.addAll(r1)
            java.util.Iterator r0 = r0.iterator()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L78:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L87
            java.lang.String r2 = ""
            goto L89
        L87:
            java.lang.String r2 = ","
        L89:
            r1.append(r2)
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            goto L78
        L96:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "onlineType"
            int r3 = r4.f806k0
            r0.putExtra(r2, r3)
            java.lang.String r2 = "selectIds"
            java.lang.String r1 = r1.toString()
            r0.putExtra(r2, r1)
            int r1 = r4.f806k0
            if (r1 != 0) goto Lb6
            android.content.Context r1 = r4.V
            java.lang.Class<com.bxkj.student.home.teaching.exam.formal.ExamActivity> r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.class
            r0.setClass(r1, r2)
            goto Lbd
        Lb6:
            android.content.Context r1 = r4.V
            java.lang.Class<com.bxkj.student.home.teaching.exam.mock.NewExamActivity> r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.class
            r0.setClass(r1, r2)
        Lbd:
            r4.startActivity(r0)
            r4.finish()
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.b0
            com.bxkj.student.home.teaching.exam.f r1 = new com.bxkj.student.home.teaching.exam.f
            r1.<init>(r2)
            r0.k(r1)
            android.widget.Button r0 = r2.a0
            com.bxkj.student.home.teaching.exam.SelectExamLessonActivity$c r1 = new com.bxkj.student.home.teaching.exam.SelectExamLessonActivity$c
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492934(0x7f0c0046, float:1.8609334E38)
            return r0
    }

    public void R() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.Y = r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r4, r1)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r2 = r4.V
            r3 = 1
            r1.<init>(r2, r3)
            r0.addItemDecoration(r1)
            com.bxkj.student.home.teaching.exam.SelectExamLessonActivity$a r0 = new com.bxkj.student.home.teaching.exam.SelectExamLessonActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493319(0x7f0c01c7, float:1.8610115E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Y
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            r4.o0()
            return
    }

    public void S() {
            r3 = this;
            java.lang.String r0 = "选择考试课程"
            r3.setTitle(r0)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "courseNum"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L37
            android.content.Intent r0 = r3.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r3.c0 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "请选择"
            r0.append(r1)
            int r1 = r3.c0
            r0.append(r1)
            java.lang.String r1 = "门考试课程"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setTitle(r0)
        L37:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "onlineType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L4e
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.f806k0 = r0
        L4e:
            java.lang.String r0 = "请选择8门A题型和2门B题型考试课程"
            r3.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r0.n0()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }
}

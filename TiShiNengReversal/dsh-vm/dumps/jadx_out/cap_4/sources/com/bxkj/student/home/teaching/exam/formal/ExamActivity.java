package com.bxkj.student.home.teaching.exam.formal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExamActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private android.os.CountDownTimer G0;
    private android.os.CountDownTimer H0;
    private android.net.ConnectivityManager I0;
    private com.bxkj.student.home.teaching.exam.formal.ExamActivity.h J0;
    private int K0;
    private android.widget.PopupWindow L0;
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog M0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> N0;
    private java.util.List<androidx.fragment.app.Fragment> O0;
    private int P0;
    private int Q0;
    private int R0;
    private java.util.List<java.lang.Integer> S0;
    private java.util.List<java.lang.Integer> T0;
    private final int U0;
    private final int V0;
    private final int W0;
    private int X0;
    private com.bxkj.student.common.view.CustomViewPager Y;
    public int Y0;
    public android.widget.Button Z;
    private int Z0;
    public android.widget.Button a0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f812a1;
    private android.widget.Button b0;

    /* renamed from: b1, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.iOSOneButtonDialog f813b1;
    private android.widget.TextView c0;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f814c1;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.RelativeLayout f815k0;

    /* renamed from: p0, reason: collision with root package name */
    private com.bxkj.base.view.CountDownTimeView f816p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity e;

        a(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
                r9 = this;
                int r0 = r10.f()
                int r0 = r0 + 1
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r1 = 2131298997(0x7f090ab5, float:1.8215983E38)
                r10.J(r1, r0)
                java.lang.String r0 = "questionType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                java.lang.String r2 = "1"
                boolean r0 = r2.equals(r0)
                r2 = 2131099737(0x7f060059, float:1.7811836E38)
                r3 = 2131099731(0x7f060053, float:1.7811823E38)
                r4 = 2131231119(0x7f08018f, float:1.807831E38)
                r5 = 2131231636(0x7f080394, float:1.8079359E38)
                if (r0 == 0) goto L8e
                java.lang.String r0 = "answers"
                java.util.List r11 = cn.bluemobi.dylan.http.JsonParse.getList(r11, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r11 = r11.iterator()
            L39:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto L63
                java.lang.Object r6 = r11.next()
                java.util.Map r6 = (java.util.Map) r6
                java.lang.String r7 = "icChecked"
                boolean r8 = r6.containsKey(r7)
                if (r8 == 0) goto L39
                java.lang.Object r7 = r6.get(r7)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L39
                java.lang.String r7 = "answerId"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r7)
                r0.add(r6)
                goto L39
            L63:
                boolean r11 = r0.isEmpty()
                if (r11 == 0) goto L6c
                r4 = 2131231636(0x7f080394, float:1.8079359E38)
            L6c:
                r10.l(r1, r4)
                boolean r11 = r0.isEmpty()
                if (r11 == 0) goto L80
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r3)
                goto L8a
            L80:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r2)
            L8a:
                r10.K(r1, r11)
                return
            L8e:
                java.lang.String r0 = "checkAnswerId"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L9d
                r4 = 2131231636(0x7f080394, float:1.8079359E38)
            L9d:
                r10.l(r1, r4)
                java.lang.String r11 = cn.bluemobi.dylan.http.JsonParse.getString(r11, r0)
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto Lb5
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r3)
                goto Lbf
            Lb5:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r2)
            Lbf:
                r10.K(r1, r11)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity a;

        b(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.n1 a(com.bxkj.student.home.teaching.exam.formal.ExamActivity.b r0) {
                kotlin.n1 r0 = r0.c()
                return r0
        }

        public static /* synthetic */ void b(com.bxkj.student.home.teaching.exam.formal.ExamActivity.b r0, android.view.View r1) {
                r0.d(r1)
                return
        }

        private /* synthetic */ kotlin.n1 c() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.X0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.exam.FaceDetectExamActivity> r2 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.class
                r0.<init>(r1, r2)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r3.a
                r2 = 170(0xaa, float:2.38E-43)
                r1.startActivityForResult(r0, r2)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                r1 = 2130771987(0x7f010013, float:1.714708E38)
                r2 = 2130771986(0x7f010012, float:1.7147078E38)
                r0.overridePendingTransition(r1, r2)
                r0 = 0
                return r0
        }

        private /* synthetic */ void d(android.view.View r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = r2.a
                androidx.fragment.app.FragmentActivity r3 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.W0(r3)
                com.bxkj.student.home.teaching.exam.formal.j r0 = new com.bxkj.student.home.teaching.exam.formal.j
                r0.<init>(r2)
                java.lang.String r1 = "人脸识别"
                com.bxkj.base.v2.common.ext.t.p(r3, r1, r0)
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.V0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "获取考试内容异常，请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.U0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "isReturnExam"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.H0(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "isExamStartFace"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.G0(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "isExamEndFace"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.E0(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "isExamFaceNum"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.F0(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "examTimeType"
                int r2 = r0.Y0
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1, r2)
                r0.Y0 = r1
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "examTime"
                int r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.s0(r0)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1, r2)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.D0(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.lang.String r1 = "examArray"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.C0(r0, r4)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                java.util.List r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r4)
                if (r4 == 0) goto Lde
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                java.util.List r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r4)
                int r4 = r4.size()
                if (r4 <= 0) goto Lde
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.N0(r4)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.v0(r4)
                if (r4 <= 0) goto L8a
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                java.util.List r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r4)
                int r0 = r0.size()
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.v0(r1)
                java.util.List r0 = com.bxkj.base.util.y.a(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.B0(r4, r0)
            L8a:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.w0(r4)
                r0 = 1
                if (r4 != r0) goto Ld8
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.R0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "考试开始前，请先进行人脸识别"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                com.bxkj.student.home.teaching.exam.formal.k r1 = new com.bxkj.student.home.teaching.exam.formal.k
                r1.<init>(r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setButtonOnClickListener(r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.J0(r4, r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.y0(r4)
                r0 = 0
                r4.setClickAutoCancel(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.y0(r4)
                r4.setCancelable(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.y0(r4)
                r4.setCanceledOnTouchOutside(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.y0(r4)
                r4.show()
                return
            Ld8:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r4 = r3.a
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.M0(r4)
                return
            Lde:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.S0(r0)
                r4.<init>(r0)
                java.lang.String r0 = "没有题目"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
                r4.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends androidx.fragment.app.FragmentPagerAdapter {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity f;

        c(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        public int getCount() {
                r1 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.t0(r0)
                int r0 = r0.size()
                return r0
        }

        public androidx.fragment.app.Fragment getItem(int r2) {
                r1 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.t0(r0)
                java.lang.Object r2 = r0.get(r2)
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.os.CountDownTimer {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity a;

        d(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1, long r2, long r4) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r3 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                com.bxkj.base.view.CountDownTimeView r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.p0(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.s0(r1)
                r2 = 0
                r0.i(r1, r2)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r0)
                if (r0 == 0) goto L4d
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r3.a
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "timeFinish"
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.put(r1, r2)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.O0(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                android.widget.Button r0 = r0.Z
                r1 = 1
                r0.setEnabled(r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                android.widget.Button r0 = r0.a0
                r0.setEnabled(r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r3.a
                r0.f812a1 = r1
            L4d:
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r2) {
                r1 = this;
                int r3 = (int) r2
                int r3 = r3 / 1000
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r2 = r1.a
                com.bxkj.base.view.CountDownTimeView r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.p0(r2)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.a
                int r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.s0(r0)
                r2.i(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends android.os.CountDownTimer {
        final /* synthetic */ java.text.SimpleDateFormat a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity b;

        e(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1, long r2, long r4, java.text.SimpleDateFormat r6) {
                r0 = this;
                r0.b = r1
                r0.a = r6
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r1 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.b
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.L0(r0)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r2.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.z0(r0)
                java.text.SimpleDateFormat r1 = r2.a
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r3 = r1.format(r3)
                r0.setText(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity.f a;

            a(com.bxkj.student.home.teaching.exam.formal.ExamActivity.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.exam.formal.ExamActivity$f r1 = r0.a
                    com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r1.b
                    r1.finish()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity.f a;

            b(com.bxkj.student.home.teaching.exam.formal.ExamActivity.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.exam.formal.ExamActivity$f r1 = r0.a
                    com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r1.b
                    r1.finish()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class c implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity.f a;

            c(com.bxkj.student.home.teaching.exam.formal.ExamActivity.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.exam.formal.ExamActivity$f r1 = r0.a
                    com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r1.b
                    r1.finish()
                    return
            }
        }

        f(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                boolean r2 = r1.a
                if (r2 == 0) goto L24
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.a1(r0)
                r2.<init>(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity$f$c r0 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$f$c
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                java.lang.String r0 = "时间已到，自动交卷失败，请重新考试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
            L24:
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.Z0(r0)
                r2.<init>(r0)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity$f$b r0 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$f$b
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                boolean r3 = r2.a
                if (r3 == 0) goto Lf
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = r2.b
                int r3 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.u0(r3)
                if (r3 != 0) goto Lf
                java.lang.String r3 = "时间已到，已经为您自动交卷成功"
                goto L11
            Lf:
                java.lang.String r3 = "交卷成功"
            L11:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r2.b
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.Y0(r1)
                r0.<init>(r1)
                r1 = 0
                r0.setCancelable(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r0.setMessage(r3)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity$f$a r0 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$f$a
                r0.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity b;

        g(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void onPageScrolled(int r2, float r3, int r4) {
                r1 = this;
                int r3 = r1.a
                r0 = 1
                if (r3 != r0) goto L29
                if (r4 != 0) goto L29
                if (r2 != 0) goto L11
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r2 = r1.b
                java.lang.String r3 = "已经是第一题了"
                r2.f0(r3)
                return
            L11:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = r1.b
                com.bxkj.student.common.view.CustomViewPager r3 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r3)
                androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
                int r3 = r3.getCount()
                int r3 = r3 - r0
                if (r2 != r3) goto L29
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r2 = r1.b
                java.lang.String r3 = "已经是最后一题了"
                r2.f0(r3)
            L29:
                return
        }

        public void onPageSelected(int r7) {
                r6 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r6.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "理论考试"
                r1.append(r2)
                r2 = 1
                int r7 = r7 + r2
                r1.append(r7)
                java.lang.String r7 = "/"
                r1.append(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                com.bxkj.student.common.view.CustomViewPager r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r7)
                androidx.viewpager.widget.PagerAdapter r7 = r7.getAdapter()
                int r7 = r7.getCount()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.setTitle(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                int r0 = r7.Y0
                if (r0 == r2) goto L122
                android.os.CountDownTimer r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.q0(r7)
                if (r7 == 0) goto L43
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                android.os.CountDownTimer r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.q0(r7)
                r7.cancel()
            L43:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                com.bxkj.base.view.CountDownTimeView r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.p0(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r6.b
                int r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.s0(r0)
                r1 = 0
                r7.i(r0, r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                java.util.List r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r6.b
                com.bxkj.student.common.view.CustomViewPager r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r0)
                int r0 = r0.getCurrentItem()
                java.lang.Object r7 = r7.get(r0)
                java.util.Map r7 = (java.util.Map) r7
                java.lang.String r0 = "questionType"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                java.lang.String r0 = "1"
                boolean r7 = r0.equals(r7)
                java.lang.String r0 = "timeFinish"
                if (r7 == 0) goto Ldf
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                java.util.List r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r3 = r6.b
                com.bxkj.student.common.view.CustomViewPager r3 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r3)
                int r3 = r3.getCurrentItem()
                java.lang.Object r7 = r7.get(r3)
                java.util.Map r7 = (java.util.Map) r7
                java.lang.String r3 = "answers"
                java.util.List r7 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r3)
                java.util.Iterator r7 = r7.iterator()
            L99:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto Lbb
                java.lang.Object r3 = r7.next()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "icChecked"
                boolean r5 = r3.containsKey(r4)
                if (r5 == 0) goto L99
                java.lang.Object r3 = r3.get(r4)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L99
                r1 = 1
                goto L99
            Lbb:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                java.util.List r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r2 = r6.b
                com.bxkj.student.common.view.CustomViewPager r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r2)
                int r2 = r2.getCurrentItem()
                java.lang.Object r7 = r7.get(r2)
                java.util.Map r7 = (java.util.Map) r7
                boolean r7 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r0)
                if (r7 != 0) goto L122
                if (r1 != 0) goto L122
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.P0(r7)
                return
            Ldf:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                java.util.List r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r6.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r7 = r7.get(r1)
                java.util.Map r7 = (java.util.Map) r7
                boolean r7 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r0)
                if (r7 != 0) goto L122
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                java.util.List r7 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.r0(r7)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r0 = r6.b
                com.bxkj.student.common.view.CustomViewPager r0 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.A0(r0)
                int r0 = r0.getCurrentItem()
                java.lang.Object r7 = r7.get(r0)
                java.util.Map r7 = (java.util.Map) r7
                java.lang.String r0 = "checkAnswerId"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L122
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r7 = r6.b
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.P0(r7)
            L122:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class h extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.formal.ExamActivity a;

        private h(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ h(com.bxkj.student.home.teaching.exam.formal.ExamActivity r1, com.bxkj.student.home.teaching.exam.formal.l r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r0.a
                boolean r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.K0(r1)
                if (r1 != 0) goto L1d
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.b1(r2)
                r1.<init>(r2)
                java.lang.String r2 = "已脱离后台监控，请检查网络后开始考试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                r1.show()
                goto L39
            L1d:
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r0.a
                boolean r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.x0(r1)
                if (r1 != 0) goto L39
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.T0(r2)
                r1.<init>(r2)
                java.lang.String r2 = "网络已恢复，请继续开始考试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                r1.show()
            L39:
                java.lang.String r1 = "网络状态发生变化"
                com.orhanobut.logger.j.c(r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity r1 = r0.a
                boolean r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.K0(r1)
                com.bxkj.student.home.teaching.exam.formal.ExamActivity.I0(r1, r2)
                return
        }
    }

    public ExamActivity() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.K0 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.N0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.O0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.S0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.T0 = r1
            r1 = 170(0xaa, float:2.38E-43)
            r2.U0 = r1
            r1 = 187(0xbb, float:2.62E-43)
            r2.V0 = r1
            r1 = 255(0xff, float:3.57E-43)
            r2.W0 = r1
            r2.X0 = r0
            r0 = 1
            r2.Y0 = r0
            r1 = 10800(0x2a30, float:1.5134E-41)
            r2.Z0 = r1
            r2.f812a1 = r0
            r2.f814c1 = r0
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.CustomViewPager A0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            com.bxkj.student.common.view.CustomViewPager r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void B0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, java.util.List r1) {
            r0.S0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void C0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, java.util.List r1) {
            r0.N0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void D0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1) {
            r0.Z0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void E0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1) {
            r0.Q0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void F0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1) {
            r0.R0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void G0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1) {
            r0.P0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void H0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1) {
            r0.X0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void I0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, boolean r1) {
            r0.f814c1 = r1
            return
    }

    static /* bridge */ /* synthetic */ void J0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1) {
            r0.M0 = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean K0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            boolean r0 = r0.Q0()
            return r0
    }

    static /* bridge */ /* synthetic */ void L0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.d1()
            return
    }

    static /* bridge */ /* synthetic */ void M0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.i1()
            return
    }

    static /* bridge */ /* synthetic */ void N0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.k1()
            return
    }

    static /* bridge */ /* synthetic */ void O0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.t1()
            return
    }

    static /* bridge */ /* synthetic */ void P0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.x1()
            return
    }

    private boolean Q0() {
            r1 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Exception -> L1a
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1a
            r1.I0 = r0     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1a
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1a
            if (r0 != 0) goto L18
            boolean r0 = r0.isAvailable()     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.content.Context R0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context S0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context T0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context U0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context V0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity W0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    static /* synthetic */ android.content.Context X0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context Y0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context Z0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context a1(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context b1(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void c1() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.Y
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$g r1 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$g
            r1.<init>(r2)
            r0.addOnPageChangeListener(r1)
            return
    }

    private void d1() {
            r1 = this;
            r0 = 1
            r1.g1(r0)
            return
    }

    private boolean e1(int r5) {
            r4 = this;
            r0 = 1
            int r5 = r5 + r0
            java.util.List<java.lang.Integer> r1 = r4.S0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.contains(r2)
            r2 = 0
            if (r1 == 0) goto L46
            java.util.List<java.lang.Integer> r1 = r4.T0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L46
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r3 = r4.V
            r1.<init>(r3)
            java.lang.String r3 = "考试已暂停，请先进行人脸识别"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r3)
            com.bxkj.student.home.teaching.exam.formal.i r3 = new com.bxkj.student.home.teaching.exam.formal.i
            r3.<init>(r4, r5)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r1.setButtonOnClickListener(r3)
            r4.f813b1 = r5
            r5.setClickAutoCancel(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.f813b1
            r5.setCancelable(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.f813b1
            r5.setCanceledOnTouchOutside(r2)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.f813b1
            r5.show()
            return r0
        L46:
            return r2
    }

    private void f1(boolean r9, java.lang.String r10, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r11, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r12) {
            r8 = this;
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r11)
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r12)
            com.orhanobut.logger.j.h(r3)
            com.orhanobut.logger.j.h(r4)
            android.content.Context r11 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r11 = cn.bluemobi.dylan.http.Http.with(r11)
            cn.bluemobi.dylan.http.HttpRequest r11 = r11.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r11 = r11.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r11 = r11.hideFailMessage()
            java.lang.Class<d0.a> r12 = d0.a.class
            java.lang.Object r12 = cn.bluemobi.dylan.http.Http.getApiService(r12)
            r0 = r12
            d0.a r0 = (d0.a) r0
            com.bxkj.base.user.LoginUser r12 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r12.getUserId()
            r6 = 0
            int r7 = r8.K0
            java.lang.String r5 = ""
            r1 = r10
            rx.e r10 = r0.z1(r1, r2, r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r10 = r11.setObservable(r10)
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$f r11 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$f
            r11.<init>(r8, r9)
            r10.setDataListener(r11)
            return
    }

    public static /* synthetic */ void g0(android.widget.FrameLayout r2) {
            if (r2 == 0) goto Lb
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r2.setForeground(r0)
        Lb:
            return
    }

    private void g1(boolean r20) {
            r19 = this;
            r1 = r19
            android.content.Intent r0 = r1.getIntent()
            java.lang.String r2 = "stuTeacherCurriculumId"
            java.lang.String r3 = r0.getStringExtra(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
        L1c:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6 = r1.N0
            int r6 = r6.size()
            if (r2 >= r6) goto L120
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6 = r1.N0
            java.lang.Object r6 = r6.get(r2)
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r7 = "timeFinish"
            boolean r7 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r6, r7)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r8 = r1.N0
            java.lang.Object r8 = r8.get(r2)
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r9 = "questionType"
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r9)
            java.lang.String r9 = "1"
            boolean r8 = r9.equals(r8)
            java.lang.String r9 = ","
            java.lang.String r10 = ""
            java.lang.String r11 = "questionId"
            java.lang.String r12 = "question"
            java.lang.String r13 = "answers"
            java.lang.String r14 = "scoreId"
            if (r8 == 0) goto Lda
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r8 = r1.N0
            java.lang.Object r8 = r8.get(r2)
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r8 = r8.get(r13)
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r8 = r8.iterator()
        L6b:
            boolean r16 = r8.hasNext()
            if (r16 == 0) goto L9f
            java.lang.Object r16 = r8.next()
            r17 = r2
            r2 = r16
            java.util.Map r2 = (java.util.Map) r2
            r16 = r3
            java.lang.String r3 = "icChecked"
            boolean r18 = r2.containsKey(r3)
            if (r18 == 0) goto L9a
            java.lang.Object r3 = r2.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9a
            java.lang.String r3 = "answerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r15.add(r2)
        L9a:
            r3 = r16
            r2 = r17
            goto L6b
        L9f:
            r17 = r2
            r16 = r3
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r11)
            r2.put(r12, r3)
            r2.put(r13, r15)
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r14)
            r2.put(r14, r3)
            r5.add(r2)
            if (r7 != 0) goto L11a
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L11a
            if (r20 != 0) goto L11a
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto Lcd
            r9 = r10
        Lcd:
            r0.append(r9)
            int r2 = r17 + 1
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            goto L11a
        Lda:
            r17 = r2
            r16 = r3
            java.lang.String r2 = "checkAnswerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            if (r7 != 0) goto L101
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L101
            if (r20 != 0) goto L101
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto Lf5
            r9 = r10
        Lf5:
            r0.append(r9)
            int r3 = r17 + 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.append(r3)
        L101:
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r11)
            r3.put(r12, r7)
            r3.put(r13, r2)
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r14)
            r3.put(r14, r2)
            r4.add(r3)
        L11a:
            int r2 = r17 + 1
            r3 = r16
            goto L1c
        L120:
            r16 = r3
            if (r20 != 0) goto L16f
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L145
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "您还有第"
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = "题未作答，是否要提交试卷？"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L147
        L145:
            java.lang.String r0 = "确定要提交试卷吗？"
        L147:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r3 = r1.V
            r2.<init>(r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.setMessage(r0)
            java.lang.String r2 = "继续答题"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r2)
            java.lang.String r2 = "直接交卷"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = r0.setRightButtonText(r2)
            com.bxkj.student.home.teaching.exam.formal.c r0 = new com.bxkj.student.home.teaching.exam.formal.c
            r2 = r20
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.setRightButtonOnClickListener(r0)
            r0.show()
            return
        L16f:
            r2 = r20
            r3 = r16
            r1.f1(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1) {
            kotlin.n1 r0 = r0.l1(r1)
            return r0
    }

    private void h1() {
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "stuTeacherCurriculumId"
            boolean r0 = r0.hasExtra(r1)
            r2 = 0
            if (r0 == 0) goto L16
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            goto L17
        L16:
            r0 = r2
        L17:
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r3 = "selectIds"
            boolean r1 = r1.hasExtra(r3)
            if (r1 == 0) goto L2c
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r0 = r0.getStringExtra(r3)
            goto L2f
        L2c:
            r6 = r2
            r2 = r0
            r0 = r6
        L2f:
            android.content.Context r1 = r7.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideFailMessage()
            java.lang.Class<d0.a> r3 = d0.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            d0.a r3 = (d0.a) r3
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getUserId()
            int r5 = r7.K0
            rx.e r0 = r3.z0(r2, r0, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$b r1 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$b
            r1.<init>(r7)
            r0.setDataListener(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, boolean r1, java.lang.String r2, java.util.List r3, java.util.List r4) {
            r0.o1(r1, r2, r3, r4)
            return
    }

    private void i1() {
            r4 = this;
            r0 = 0
            boolean r1 = r4.e1(r0)
            if (r1 == 0) goto L8
            return
        L8:
            android.widget.RelativeLayout r1 = r4.f815k0
            r1.setVisibility(r0)
            r4.j1()
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.N0
            r1.c(r2)
            int r1 = r4.Y0
            r2 = 1
            r3 = 8
            if (r1 != r2) goto L2c
            android.widget.TextView r1 = r4.c0
            r1.setVisibility(r0)
            com.bxkj.base.view.CountDownTimeView r0 = r4.f816p0
            r0.setVisibility(r3)
            r4.y1()
            goto L45
        L2c:
            android.widget.Button r1 = r4.Z
            r1.setEnabled(r0)
            android.widget.Button r1 = r4.a0
            r1.setEnabled(r0)
            r4.f812a1 = r0
            android.widget.TextView r1 = r4.c0
            r1.setVisibility(r3)
            com.bxkj.base.view.CountDownTimeView r1 = r4.f816p0
            r1.setVisibility(r0)
            r4.x1()
        L45:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$h r1 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$h
            r2 = 0
            r1.<init>(r4, r2)
            r4.J0 = r1
            r4.registerReceiver(r1, r0)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.q1()
            return
    }

    private void j1() {
            r5 = this;
            r0 = 0
        L1:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r5.N0
            int r1 = r1.size()
            if (r0 >= r1) goto L75
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r5.N0
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "0"
            java.lang.String r3 = "questionType"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L25
            com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r2 = new com.bxkj.student.home.teaching.exam.formal.RadioExamFragment
            r2.<init>()
            goto L51
        L25:
            java.lang.String r2 = "1"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L37
            com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r2 = new com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment
            r2.<init>()
            goto L51
        L37:
            java.lang.String r2 = "3"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r2 = new com.bxkj.student.home.teaching.exam.formal.RadioExamFragment
            r2.<init>()
            goto L51
        L49:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.N0
            r2.remove(r0)
            int r0 = r0 + (-1)
            r2 = 0
        L51:
            if (r2 == 0) goto L72
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            cn.bluemobi.dylan.base.utils.SeralizableMap r4 = new cn.bluemobi.dylan.base.utils.SeralizableMap
            r4.<init>()
            r4.setMap(r1)
            java.lang.String r1 = "index"
            r3.putInt(r1, r0)
            java.lang.String r1 = "seralizableMap"
            r3.putSerializable(r1, r4)
            r2.setArguments(r3)
            java.util.List<androidx.fragment.app.Fragment> r1 = r5.O0
            r1.add(r2)
        L72:
            int r0 = r0 + 1
            goto L1
        L75:
            com.bxkj.student.common.view.CustomViewPager r0 = r5.Y
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$c r1 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$c
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            r1.<init>(r5, r2)
            r0.setAdapter(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "理论考试1/"
            r0.append(r1)
            com.bxkj.student.common.view.CustomViewPager r1 = r5.Y
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.setTitle(r0)
            return
    }

    public static /* synthetic */ void k0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.p1()
            return
    }

    private void k1() {
            r2 = this;
            int r0 = r2.X0
            r1 = 1
            if (r0 != r1) goto L1a
            android.widget.Button r0 = r2.Z
            r1 = 0
            r0.setVisibility(r1)
            com.bxkj.student.home.teaching.exam.formal.d r0 = new com.bxkj.student.home.teaching.exam.formal.d
            r0.<init>(r2)
            r1 = 2131689921(0x7f0f01c1, float:1.9008871E38)
            r2.Z(r1, r0)
            r2.invalidateOptionsMenu()
            return
        L1a:
            android.widget.Button r0 = r2.Z
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    public static /* synthetic */ void l0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.s1(r1, r2, r3, r4)
            return
    }

    private /* synthetic */ kotlin.n1 l1(int r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.teaching.exam.FaceDetectExamActivity> r2 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "faceIndex"
            r0.putExtra(r1, r4)
            r4 = 187(0xbb, float:2.62E-43)
            r3.startActivityForResult(r0, r4)
            r4 = 2130771987(0x7f010013, float:1.714708E38)
            r0 = 2130771986(0x7f010012, float:1.7147078E38)
            r3.overridePendingTransition(r4, r0)
            r4 = 0
            return r4
    }

    public static /* synthetic */ kotlin.n1 m0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            kotlin.n1 r0 = r0.n1()
            return r0
    }

    private /* synthetic */ void m1(int r2, android.view.View r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r3 = r1.W
            com.bxkj.student.home.teaching.exam.formal.h r0 = new com.bxkj.student.home.teaching.exam.formal.h
            r0.<init>(r1, r2)
            java.lang.String r2 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r3, r2, r0)
            return
    }

    public static /* synthetic */ void n0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0, int r1, android.view.View r2) {
            r0.m1(r1, r2)
            return
    }

    private /* synthetic */ kotlin.n1 n1() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.home.teaching.exam.FaceDetectExamActivity> r2 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.class
            r0.<init>(r1, r2)
            r1 = 255(0xff, float:3.57E-43)
            r3.startActivityForResult(r0, r1)
            r0 = 2130771987(0x7f010013, float:1.714708E38)
            r1 = 2130771986(0x7f010012, float:1.7147078E38)
            r3.overridePendingTransition(r0, r1)
            r0 = 0
            return r0
    }

    public static /* synthetic */ void o0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            r0.r1()
            return
    }

    private /* synthetic */ void o1(boolean r3, java.lang.String r4, java.util.List r5, java.util.List r6) {
            r2 = this;
            int r0 = r2.Q0
            r1 = 1
            if (r0 != r1) goto L12
            androidx.fragment.app.FragmentActivity r3 = r2.W
            com.bxkj.student.home.teaching.exam.formal.e r4 = new com.bxkj.student.home.teaching.exam.formal.e
            r4.<init>(r2)
            java.lang.String r5 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r3, r5, r4)
            return
        L12:
            r2.f1(r3, r4, r5, r6)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.view.CountDownTimeView p0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            com.bxkj.base.view.CountDownTimeView r0 = r0.f816p0
            return r0
    }

    private /* synthetic */ void p1() {
            r2 = this;
            boolean r0 = r2.f812a1
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.f814c1
            if (r0 != 0) goto L1a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "已脱离后台监控，请检查网络后开始考试"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L1a:
            r2.v1()
            return
    }

    static /* bridge */ /* synthetic */ android.os.CountDownTimer q0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.os.CountDownTimer r0 = r0.G0
            return r0
    }

    private /* synthetic */ void q1() {
            r0 = this;
            r0.onBackPressed()
            return
    }

    static /* bridge */ /* synthetic */ java.util.List r0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.N0
            return r0
    }

    private /* synthetic */ void r1() {
            r0 = this;
            r0.finish()
            return
    }

    static /* bridge */ /* synthetic */ int s0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            int r0 = r0.Z0
            return r0
    }

    private /* synthetic */ void s1(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            boolean r1 = r0.e1(r3)
            if (r1 == 0) goto L7
            return
        L7:
            r0.t1()
            com.bxkj.student.common.view.CustomViewPager r1 = r0.Y
            r1.setCurrentItem(r3)
            android.widget.PopupWindow r1 = r0.L0
            r1.dismiss()
            return
    }

    static /* bridge */ /* synthetic */ java.util.List t0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            java.util.List<androidx.fragment.app.Fragment> r0 = r0.O0
            return r0
    }

    private void t1() {
            r2 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r2.O0
            if (r0 == 0) goto L25
            com.bxkj.student.common.view.CustomViewPager r1 = r2.Y
            int r1 = r1.getCurrentItem()
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L25
            boolean r1 = r0 instanceof com.bxkj.student.home.teaching.exam.formal.RadioExamFragment
            if (r1 == 0) goto L1c
            com.bxkj.student.home.teaching.exam.formal.RadioExamFragment r0 = (com.bxkj.student.home.teaching.exam.formal.RadioExamFragment) r0
            r0.P()
            return
        L1c:
            boolean r1 = r0 instanceof com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment
            if (r1 == 0) goto L25
            com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment r0 = (com.bxkj.student.home.teaching.exam.formal.CheckboxExamFragment) r0
            r0.O()
        L25:
            return
    }

    static /* bridge */ /* synthetic */ int u0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            int r0 = r0.Q0
            return r0
    }

    private void u1() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.Y
            int r0 = r0.getCurrentItem()
            com.bxkj.student.common.view.CustomViewPager r1 = r2.Y
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L1a
            java.lang.String r0 = "已经是最后一题了"
            r2.f0(r0)
            return
        L1a:
            com.bxkj.student.common.view.CustomViewPager r0 = r2.Y
            int r0 = r0.getCurrentItem()
            int r0 = r0 + 1
            boolean r0 = r2.e1(r0)
            if (r0 == 0) goto L29
            return
        L29:
            r2.t1()
            com.bxkj.student.common.view.CustomViewPager r0 = r2.Y
            int r1 = r0.getCurrentItem()
            int r1 = r1 + 1
            r0.setCurrentItem(r1)
            return
    }

    static /* bridge */ /* synthetic */ int v0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            int r0 = r0.R0
            return r0
    }

    private void v1() {
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r4.L0 = r0
            android.content.Context r0 = r4.V
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131493630(0x7f0c02fe, float:1.8610746E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131297028(0x7f090304, float:1.821199E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.GridView r1 = (android.widget.GridView) r1
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            r1.setAdapter(r2)
            com.bxkj.student.home.teaching.exam.formal.f r2 = new com.bxkj.student.home.teaching.exam.formal.f
            r2.<init>(r4)
            r1.setOnItemClickListener(r2)
            android.widget.PopupWindow r1 = r4.L0
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>()
            r1.setBackgroundDrawable(r2)
            android.widget.PopupWindow r1 = r4.L0
            r2 = 1
            r1.setOutsideTouchable(r2)
            android.widget.PopupWindow r1 = r4.L0
            r1.setFocusable(r2)
            r1 = 2131299265(0x7f090bc1, float:1.8216527E38)
            android.view.View r1 = r4.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.widget.PopupWindow r2 = r4.L0
            com.bxkj.student.home.teaching.exam.formal.g r3 = new com.bxkj.student.home.teaching.exam.formal.g
            r3.<init>(r1)
            r2.setOnDismissListener(r3)
            android.widget.PopupWindow r2 = r4.L0
            r2.setContentView(r0)
            android.widget.PopupWindow r0 = r4.L0
            r2 = 2131298702(0x7f09098e, float:1.8215385E38)
            android.view.View r2 = r4.findViewById(r2)
            r0.showAsDropDown(r2)
            if (r1 == 0) goto L76
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            java.lang.String r2 = "#7F4c4c4c"
            int r2 = android.graphics.Color.parseColor(r2)
            r0.<init>(r2)
            r1.setForeground(r0)
        L76:
            return
    }

    static /* bridge */ /* synthetic */ int w0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            int r0 = r0.P0
            return r0
    }

    private void w1() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.Y
            int r0 = r0.getCurrentItem()
            if (r0 != 0) goto Le
            java.lang.String r0 = "已经是第一题了"
            r2.f0(r0)
            return
        Le:
            com.bxkj.student.common.view.CustomViewPager r0 = r2.Y
            int r0 = r0.getCurrentItem()
            int r0 = r0 + (-1)
            boolean r1 = r2.e1(r0)
            if (r1 == 0) goto L1d
            return
        L1d:
            r2.t1()
            com.bxkj.student.common.view.CustomViewPager r1 = r2.Y
            r1.setCurrentItem(r0)
            return
    }

    static /* bridge */ /* synthetic */ boolean x0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            boolean r0 = r0.f814c1
            return r0
    }

    private void x1() {
            r8 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HH:mm:ss"
            r0.<init>(r1)
            java.lang.String r1 = "GMT+00:00"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            android.widget.Button r0 = r8.Z
            r1 = 0
            r0.setEnabled(r1)
            android.widget.Button r0 = r8.a0
            r0.setEnabled(r1)
            r8.f812a1 = r1
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$d r2 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$d
            int r0 = r8.Z0
            int r0 = r0 * 1000
            long r4 = (long) r0
            r6 = 1000(0x3e8, double:4.94E-321)
            r3 = r8
            r2.<init>(r3, r4, r6)
            r3.G0 = r2
            r2.start()
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.iOSOneButtonDialog y0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.M0
            return r0
    }

    private void y1() {
            r7 = this;
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r0 = "HH:mm:ss"
            r6.<init>(r0)
            java.lang.String r0 = "GMT+00:00"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r6.setTimeZone(r0)
            int r0 = r7.Z0
            int r0 = r0 * 1000
            long r2 = (long) r0
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$e r0 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$e
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r7
            r0.<init>(r1, r2, r4, r6)
            r1.H0 = r0
            r0.start()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.TextView z0(com.bxkj.student.home.teaching.exam.formal.ExamActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.a0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.b0
            r0.setOnClickListener(r1)
            r1.c1()
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492931(0x7f0c0043, float:1.8609328E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "onlineType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L17
            android.content.Intent r0 = r4.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r4.K0 = r0
        L17:
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$a r0 = new com.bxkj.student.home.teaching.exam.formal.ExamActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493290(0x7f0c01aa, float:1.8610056E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.N0
            r0.<init>(r4, r1, r2, r3)
            r4.F0 = r0
            r4.h1()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "理论考试"
            r1.setTitle(r0)
            com.bxkj.student.home.teaching.exam.formal.a r0 = new com.bxkj.student.home.teaching.exam.formal.a
            r0.<init>(r1)
            r1.X(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            r3 = 2131299286(0x7f090bd6, float:1.821657E38)
            android.view.View r3 = r2.findViewById(r3)
            com.bxkj.student.common.view.CustomViewPager r3 = (com.bxkj.student.common.view.CustomViewPager) r3
            r2.Y = r3
            r3 = 2131296628(0x7f090174, float:1.8211178E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.Z = r3
            r3 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.a0 = r3
            r3 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.b0 = r3
            r3 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.c0 = r3
            r3 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2.f815k0 = r3
            r3 = 2131296725(0x7f0901d5, float:1.8211375E38)
            android.view.View r3 = r2.findViewById(r3)
            com.bxkj.base.view.CountDownTimeView r3 = (com.bxkj.base.view.CountDownTimeView) r3
            r2.f816p0 = r3
            com.bxkj.student.common.view.CustomViewPager r3 = r2.Y
            r0 = 0
            r3.setPagingEnabled(r0)
            android.widget.RelativeLayout r3 = r2.f815k0
            r0 = 8
            r3.setVisibility(r0)
            com.bxkj.base.view.CountDownTimeView r3 = r2.f816p0
            android.content.Context r0 = r2.V
            r1 = 1101004800(0x41a00000, float:20.0)
            int r0 = cn.bluemobi.dylan.base.utils.d.d(r0, r1)
            r3.setTextSize(r0)
            return
    }

    protected void onActivityResult(int r5, int r6, android.content.Intent r7) {
            r4 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r5, r6, r7)
            r0 = 187(0xbb, float:2.62E-43)
            r1 = 170(0xaa, float:2.38E-43)
            if (r5 != r1) goto L2e
            if (r6 != r0) goto L2e
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.M0
            if (r5 == 0) goto L1a
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L1a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.M0
            r5.dismiss()
        L1a:
            r4.i1()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r6 = r4.V
            r5.<init>(r6)
            java.lang.String r6 = "人脸识别成功，请开始答题"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r5.setMessage(r6)
            r5.show()
            return
        L2e:
            r2 = 1
            if (r5 != r0) goto L9b
            if (r6 != r0) goto L9b
            java.lang.String r5 = "faceIndex"
            boolean r6 = r7.hasExtra(r5)
            if (r6 == 0) goto L7b
            r6 = 0
            int r5 = r7.getIntExtra(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onActivityResult-faceIndex="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.orhanobut.logger.j.c(r6)
            java.util.List<java.lang.Integer> r6 = r4.T0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.add(r7)
            int r5 = r5 - r2
            if (r5 != 0) goto L64
            r4.i1()
            goto L7b
        L64:
            r4.t1()
            com.bxkj.student.common.view.CustomViewPager r6 = r4.Y
            r6.setCurrentItem(r5)
            android.widget.PopupWindow r5 = r4.L0
            if (r5 == 0) goto L7b
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L7b
            android.widget.PopupWindow r5 = r4.L0
            r5.dismiss()
        L7b:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.f813b1
            if (r5 == 0) goto L8a
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L8a
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r4.f813b1
            r5.dismiss()
        L8a:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r6 = r4.V
            r5.<init>(r6)
            java.lang.String r6 = "人脸识别成功，请继续答题"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r5.setMessage(r6)
            r5.show()
            return
        L9b:
            r3 = 255(0xff, float:3.57E-43)
            if (r5 != r3) goto La5
            if (r6 != r0) goto La5
            r4.g1(r2)
            return
        La5:
            if (r6 != r1) goto Lbb
            android.content.Context r6 = r4.V
            java.lang.Class<com.bxkj.student.home.teaching.exam.FaceDetectExamActivity> r0 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.class
            android.content.Intent r6 = r7.setClass(r6, r0)
            r4.startActivityForResult(r6, r5)
            r5 = 2130771987(0x7f010013, float:1.714708E38)
            r6 = 2130771986(0x7f010012, float:1.7147078E38)
            r4.overridePendingTransition(r5, r6)
        Lbb:
            return
    }

    public void onBackPressed() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "正在考试，是否放弃考试？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.teaching.exam.formal.b r1 = new com.bxkj.student.home.teaching.exam.formal.b
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.f814c1
            if (r0 != 0) goto L15
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r1.V
            r2.<init>(r0)
            java.lang.String r0 = "已脱离后台监控，请检查网络后开始考试"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
            r2.show()
            return
        L15:
            int r2 = r2.getId()
            switch(r2) {
                case 2131296622: goto L26;
                case 2131296623: goto L21;
                case 2131296628: goto L1d;
                default: goto L1c;
            }
        L1c:
            return
        L1d:
            r1.w1()
            return
        L21:
            r2 = 0
            r1.g1(r2)
            return
        L26:
            r1.u1()
            return
    }

    protected void onDestroy() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.H0
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.os.CountDownTimer r0 = r1.G0
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            com.bxkj.student.home.teaching.exam.formal.ExamActivity$h r0 = r1.J0
            if (r0 == 0) goto L15
            r1.unregisterReceiver(r0)
        L15:
            super.onDestroy()
            return
    }
}

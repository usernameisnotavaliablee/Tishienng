package com.bxkj.student.home.teaching.exam.mock;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class NewExamActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.RelativeLayout G0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private android.os.CountDownTimer I0;
    private android.os.CountDownTimer J0;
    private android.net.ConnectivityManager K0;
    private com.bxkj.student.home.teaching.exam.mock.NewExamActivity.m L0;
    private int M0;
    private int N0;
    private long O0;
    private java.lang.String P0;
    public int Q0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> R0;
    private java.util.List<androidx.fragment.app.Fragment> S0;
    private boolean T0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private com.bxkj.base.view.CountDownTimeView a0;
    private com.bxkj.student.common.view.CustomViewPager b0;
    public android.widget.Button c0;

    /* renamed from: k0, reason: collision with root package name */
    public android.widget.Button f826k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.Button f827p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;

        a(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1) {
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
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r1.b
                java.lang.String r3 = "已经是第一题了"
                r2.f0(r3)
                return
            L11:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r1.b
                com.bxkj.student.common.view.CustomViewPager r3 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r3)
                androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
                int r3 = r3.getCount()
                int r3 = r3 - r0
                if (r2 != r3) goto L29
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r1.b
                java.lang.String r3 = "已经是最后一题了"
                r2.f0(r3)
            L29:
                return
        }

        public void onPageSelected(int r8) {
                r7 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r7.b
                java.lang.String r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.k0(r2)
                r1.append(r2)
                int r2 = r8 + 1
                r1.append(r2)
                java.lang.String r2 = "/"
                r1.append(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r7.b
                com.bxkj.student.common.view.CustomViewPager r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r2)
                androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
                int r2 = r2.getCount()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setTitle(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.os.CountDownTimer r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.i0(r0)
                if (r0 == 0) goto L43
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.os.CountDownTimer r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.i0(r0)
                r0.cancel()
            L43:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                com.bxkj.base.view.CountDownTimeView r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r7.b
                int r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.n0(r1)
                r2 = 0
                r0.i(r1, r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r7.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "questionType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r1 = "1"
                boolean r0 = r1.equals(r0)
                java.lang.String r1 = "timeFinish"
                if (r0 == 0) goto Lf2
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r7.b
                com.bxkj.student.common.view.CustomViewPager r3 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r3)
                int r3 = r3.getCurrentItem()
                java.lang.Object r0 = r0.get(r3)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r3 = "answers"
                java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r3)
                java.util.Iterator r0 = r0.iterator()
                r3 = 0
            L9a:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto Lbc
                java.lang.Object r4 = r0.next()
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "icChecked"
                boolean r6 = r4.containsKey(r5)
                if (r6 == 0) goto L9a
                java.lang.Object r4 = r4.get(r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L9a
                r3 = 1
                goto L9a
            Lbc:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r4 = r7.b
                com.bxkj.student.common.view.CustomViewPager r4 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r4)
                int r4 = r4.getCurrentItem()
                java.lang.Object r0 = r0.get(r4)
                java.util.Map r0 = (java.util.Map) r0
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r1)
                if (r0 != 0) goto L147
                if (r3 != 0) goto L147
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.widget.Button r0 = r0.c0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.widget.Button r0 = r0.f826k0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                int r1 = r0.Q0
                if (r1 != 0) goto L147
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.F0(r0)
                goto L147
            Lf2:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r7.b
                com.bxkj.student.common.view.CustomViewPager r3 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r3)
                int r3 = r3.getCurrentItem()
                java.lang.Object r0 = r0.get(r3)
                java.util.Map r0 = (java.util.Map) r0
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r1)
                if (r0 != 0) goto L147
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r7.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "checkAnswerId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L147
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.widget.Button r0 = r0.c0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.widget.Button r0 = r0.f826k0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                int r1 = r0.Q0
                if (r1 != 0) goto L147
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.F0(r0)
            L147:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.r0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "出题人："
                r1.append(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r7.b
                java.util.List r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r2)
                java.lang.Object r2 = r2.get(r8)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "questionsSetter"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r7.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.q0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "课程名称："
                r1.append(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r7.b
                java.util.List r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r2)
                java.lang.Object r8 = r2.get(r8)
                java.util.Map r8 = (java.util.Map) r8
                java.lang.String r2 = "curriculum"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.setText(r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.widget.AdapterView.OnItemClickListener {
        final /* synthetic */ android.widget.PopupWindow a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;

        b(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, android.widget.PopupWindow r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r0.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r1)
                r1.setCurrentItem(r3)
                android.widget.PopupWindow r1 = r0.a
                r1.dismiss()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.widget.PopupWindow.OnDismissListener {
        final /* synthetic */ android.widget.FrameLayout a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;

        c(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, android.widget.FrameLayout r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r3 = this;
                android.widget.FrameLayout r0 = r3.a
                if (r0 == 0) goto Ld
                android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
                r2 = 0
                r1.<init>(r2)
                r0.setForeground(r1)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity a;

        d(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r1 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.a
                r0.onBackPressed()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity a;

        e(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r1 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.a
                r0.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity e;

        f(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r3)
                goto L8a
            L80:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r11 = r9.e
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
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r3)
                goto Lbf
            Lb5:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r2)
            Lbf:
                r10.K(r1, r11)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity a;

        g(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.L0(r0)
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
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.K0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r5.a
                long r1 = java.lang.System.currentTimeMillis()
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.y0(r0, r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r5.a
                java.lang.String r1 = "examTimeType"
                int r2 = r0.Q0
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r1, r2)
                r0.Q0 = r1
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r5.a
                java.lang.String r1 = "examTime"
                int r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.n0(r0)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r1, r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.v0(r0, r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r5.a
                java.lang.String r1 = "examArray"
                java.lang.Object r6 = r6.get(r1)
                java.util.List r6 = (java.util.List) r6
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.u0(r0, r6)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                java.util.List r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r6)
                if (r6 == 0) goto Le8
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                java.util.List r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r6)
                int r6 = r6.size()
                if (r6 <= 0) goto Le8
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                android.widget.RelativeLayout r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.m0(r6)
                r0 = 0
                r6.setVisibility(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.C0(r6)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.h0(r6)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r5.a
                java.util.List r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r1)
                r6.c(r1)
                android.content.IntentFilter r6 = new android.content.IntentFilter
                r6.<init>()
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                r6.addAction(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r5.a
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity$m r2 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$m
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r3 = r5.a
                r4 = 0
                r2.<init>(r3, r4)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.x0(r1, r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r5.a
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity$m r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.p0(r1)
                r1.registerReceiver(r2, r6)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.base.view.CountDownTimeView r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r6)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r5.a
                int r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.n0(r1)
                r6.i(r1, r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.base.view.CountDownTimeView r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r6)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r5.a
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.I0(r1)
                r2 = 1101004800(0x41a00000, float:20.0)
                int r1 = cn.bluemobi.dylan.base.utils.d.d(r1, r2)
                r6.setTextSize(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                int r1 = r6.Q0
                r2 = 1
                r3 = 8
                if (r1 != r2) goto Lcc
                android.widget.TextView r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.s0(r6)
                android.view.ViewParent r6 = r6.getParent()
                android.view.View r6 = (android.view.View) r6
                r6.setVisibility(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.base.view.CountDownTimeView r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r6)
                r6.setVisibility(r3)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.E0(r6)
                return
            Lcc:
                android.widget.TextView r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.s0(r6)
                android.view.ViewParent r6 = r6.getParent()
                android.view.View r6 = (android.view.View) r6
                r6.setVisibility(r3)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.base.view.CountDownTimeView r6 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r6)
                r6.setVisibility(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r6 = r5.a
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.F0(r6)
                return
            Le8:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r5.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.J0(r0)
                r6.<init>(r0)
                java.lang.String r0 = "没有题目"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = r6.setMessage(r0)
                r6.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
                r0 = this;
                super.netOnSuccess(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends androidx.fragment.app.FragmentPagerAdapter {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity f;

        h(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        public int getCount() {
                r1 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.l0(r0)
                int r0 = r0.size()
                return r0
        }

        public androidx.fragment.app.Fragment getItem(int r2) {
                r1 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.l0(r0)
                java.lang.Object r2 = r0.get(r2)
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i extends android.os.CountDownTimer {
        final /* synthetic */ java.text.SimpleDateFormat a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;

        i(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, long r2, long r4, java.text.SimpleDateFormat r6) {
                r0 = this;
                r0.b = r1
                r0.a = r6
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r4 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r4.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r2 = "timeFinish"
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                r1.put(r2, r3)
                goto La
            L1e:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r4.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.l0(r0)
                java.util.Iterator r0 = r0.iterator()
            L28:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L48
                java.lang.Object r1 = r0.next()
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                boolean r2 = r1 instanceof com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment
                if (r2 == 0) goto L3e
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r1 = (com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment) r1
                r1.R()
                goto L28
            L3e:
                boolean r2 = r1 instanceof com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment
                if (r2 == 0) goto L28
                com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r1 = (com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment) r1
                r1.P()
                goto L28
            L48:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r4.b
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.A0(r0)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r3) {
                r2 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r2.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.s0(r0)
                java.text.SimpleDateFormat r1 = r2.a
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r3 = r1.format(r3)
                r0.setText(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j extends android.os.CountDownTimer {
        final /* synthetic */ java.text.SimpleDateFormat a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;

        j(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, long r2, long r4, java.text.SimpleDateFormat r6) {
                r0 = this;
                r0.b = r1
                r0.a = r6
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r3 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                com.bxkj.base.view.CountDownTimeView r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r3.b
                int r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.n0(r1)
                r2 = 0
                r0.i(r1, r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                if (r0 == 0) goto L80
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.j0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r3.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "timeFinish"
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.put(r1, r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                java.util.List r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.l0(r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r3.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.t0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                boolean r1 = r0 instanceof com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment
                r2 = 1
                if (r1 == 0) goto L64
                com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r0 = (com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment) r0
                r0.R()
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                android.widget.Button r0 = r0.c0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                android.widget.Button r0 = r0.f826k0
                r0.setEnabled(r2)
                goto L7b
            L64:
                boolean r1 = r0 instanceof com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment
                if (r1 == 0) goto L7b
                com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r0 = (com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment) r0
                r0.P()
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                android.widget.Button r0 = r0.c0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                android.widget.Button r0 = r0.f826k0
                r0.setEnabled(r2)
            L7b:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.D0(r0)
            L80:
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r4) {
                r3 = this;
                int r0 = (int) r4
                int r0 = r0 / 1000
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r3.b
                com.bxkj.base.view.CountDownTimeView r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.g0(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r3.b
                int r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.n0(r2)
                r1.i(r2, r0)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.s0(r0)
                java.text.SimpleDateFormat r1 = r3.a
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                java.lang.String r4 = r1.format(r4)
                r0.setText(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ boolean a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.util.List c;
        final /* synthetic */ java.util.List d;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity e;

        k(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, boolean r2, java.lang.String r3, java.util.List r4, java.util.List r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r5 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r5.e
                boolean r1 = r5.a
                java.lang.String r2 = r5.b
                java.util.List r3 = r5.c
                java.util.List r4 = r5.d
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.B0(r0, r1, r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity.l a;

            a(com.bxkj.student.home.teaching.exam.mock.NewExamActivity.l r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.exam.mock.NewExamActivity$l r1 = r0.a
                    com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r1.b
                    r1.finish()
                    return
            }
        }

        l(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, boolean r2) {
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
                if (r2 == 0) goto L1b
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.O0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "时间已到，自动交卷失败，请手动交卷"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
            L1b:
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.N0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                boolean r3 = r2.a
                if (r3 == 0) goto L7
                java.lang.String r3 = "时间已到，已经为您自动交卷成功"
                goto L9
            L7:
                java.lang.String r3 = "交卷成功"
            L9:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r2.b
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.M0(r1)
                r0.<init>(r1)
                r1 = 0
                r0.setCancelable(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r0.setMessage(r3)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity$l$a r0 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$l$a
                r0.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class m extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity a;

        private m(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ m(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1, com.bxkj.student.home.teaching.exam.mock.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r0.a
                boolean r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.z0(r1)
                if (r1 != 0) goto L1d
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.P0(r2)
                r1.<init>(r2)
                java.lang.String r2 = "已脱离后台监控，请检查网络后开始考试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                r1.show()
                goto L39
            L1d:
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r0.a
                boolean r1 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.o0(r1)
                if (r1 != 0) goto L39
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.Q0(r2)
                r1.<init>(r2)
                java.lang.String r2 = "网络已恢复，请继续开始考试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                r1.show()
            L39:
                java.lang.String r1 = "网络状态发生变化"
                com.orhanobut.logger.j.c(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity r1 = r0.a
                boolean r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.z0(r1)
                com.bxkj.student.home.teaching.exam.mock.NewExamActivity.w0(r1, r2)
                return
        }
    }

    public NewExamActivity() {
            r2 = this;
            r2.<init>()
            r0 = 30
            r2.M0 = r0
            r0 = 0
            r2.N0 = r0
            java.lang.String r0 = "体育专业题库"
            r2.P0 = r0
            r0 = 1
            r2.Q0 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.R0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.S0 = r1
            r2.T0 = r0
            return
    }

    static /* bridge */ /* synthetic */ void A0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            r0.S0()
            return
    }

    static /* bridge */ /* synthetic */ void B0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0, boolean r1, java.lang.String r2, java.util.List r3, java.util.List r4) {
            r0.U0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ void C0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            r0.X0()
            return
    }

    static /* bridge */ /* synthetic */ void D0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            r0.Y0()
            return
    }

    static /* bridge */ /* synthetic */ void E0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            r0.b1()
            return
    }

    static /* bridge */ /* synthetic */ void F0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            r0.c1()
            return
    }

    private boolean G0() {
            r1 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Exception -> L1a
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1a
            r1.K0 = r0     // Catch: java.lang.Exception -> L1a
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

    private void H0() {
            r5 = this;
            android.net.ConnectivityManager r0 = r5.K0
            r1 = 0
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r1)
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.ConnectivityManager r2 = r5.K0
            r3 = 1
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r3)
            android.net.NetworkInfo$State r2 = r2.getState()
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r0 == r3) goto L1e
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTING
            if (r0 != r4) goto L27
        L1e:
            java.lang.String r0 = "当前为网络状态为MOBILE"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
        L27:
            if (r2 == r3) goto L2f
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTING
            if (r2 != r0) goto L2e
            goto L2f
        L2e:
            return
        L2f:
            java.lang.String r0 = "当前为网络状态为Wi-Fi"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r1)
            r0.show()
            return
    }

    static /* synthetic */ android.content.Context I0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context J0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context K0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context L0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context M0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context N0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context O0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context P0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context Q0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void R0() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$a r1 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$a
            r1.<init>(r2)
            r0.addOnPageChangeListener(r1)
            return
    }

    private void S0() {
            r1 = this;
            r0 = 1
            r1.V0(r0)
            return
    }

    private java.lang.String T0(long r9) {
            r8 = this;
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r9 / r0
            long r0 = r0 * r2
            long r9 = r9 - r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r4 = r9 / r0
            long r0 = r0 * r4
            long r9 = r9 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            r0 = 60
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 < 0) goto L1d
            long r9 = r9 % r0
            long r6 = r9 / r0
            long r4 = r4 + r6
        L1d:
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L25
            long r4 = r4 % r0
            long r0 = r4 / r0
            long r2 = r2 + r0
        L25:
            java.lang.String r0 = "0"
            r6 = 10
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 >= 0) goto L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L45
        L41:
            java.lang.String r1 = java.lang.String.valueOf(r2)
        L45:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L61
        L5d:
            java.lang.String r2 = java.lang.String.valueOf(r4)
        L61:
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 >= 0) goto L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            goto L7d
        L79:
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r0 = ":"
            r10.append(r0)
            r10.append(r2)
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
    }

    private void U0(boolean r9, java.lang.String r10, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r11, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r12) {
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
            long r5 = r8.O0
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r7 = r8.N0
            java.lang.String r5 = ""
            r1 = r10
            rx.e r10 = r0.z1(r1, r2, r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r10 = r11.setObservable(r10)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$l r11 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$l
            r11.<init>(r8, r9)
            r10.setDataListener(r11)
            return
    }

    private void V0(boolean r19) {
            r18 = this;
            r1 = r18
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
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6 = r1.R0
            int r6 = r6.size()
            if (r2 >= r6) goto L10a
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6 = r1.R0
            java.lang.Object r6 = r6.get(r2)
            java.util.Map r6 = (java.util.Map) r6
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r7 = r1.R0
            java.lang.Object r7 = r7.get(r2)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r8 = "questionType"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r8)
            java.lang.String r8 = "1"
            boolean r7 = r8.equals(r7)
            java.lang.String r8 = ","
            java.lang.String r9 = ""
            java.lang.String r10 = "questionId"
            java.lang.String r11 = "question"
            java.lang.String r12 = "answers"
            java.lang.String r13 = "scoreId"
            if (r7 == 0) goto Lca
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r7 = r1.R0
            java.lang.Object r7 = r7.get(r2)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r7 = r7.get(r12)
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L93
            java.lang.Object r15 = r7.next()
            java.util.Map r15 = (java.util.Map) r15
            r16 = r2
            java.lang.String r2 = "icChecked"
            boolean r17 = r15.containsKey(r2)
            if (r17 == 0) goto L90
            java.lang.Object r2 = r15.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L90
            java.lang.String r2 = "answerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r15, r2)
            r14.add(r2)
        L90:
            r2 = r16
            goto L65
        L93:
            r16 = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r10)
            r2.put(r11, r7)
            r2.put(r12, r14)
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r13)
            r2.put(r13, r6)
            r5.add(r2)
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L106
            if (r19 != 0) goto L106
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto Lbd
            r8 = r9
        Lbd:
            r0.append(r8)
            int r2 = r16 + 1
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            goto L106
        Lca:
            r16 = r2
            java.lang.String r2 = "checkAnswerId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto Led
            if (r19 != 0) goto Led
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto Le1
            r8 = r9
        Le1:
            r0.append(r8)
            int r7 = r16 + 1
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.append(r7)
        Led:
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r10)
            r7.put(r11, r8)
            r7.put(r12, r2)
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r13)
            r7.put(r13, r2)
            r4.add(r7)
        L106:
            int r2 = r16 + 1
            goto L1c
        L10a:
            if (r19 != 0) goto L134
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r2 = r1.V
            r0.<init>(r2)
            java.lang.String r2 = "确定要提交试卷吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r2)
            java.lang.String r2 = "继续答题"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r2)
            java.lang.String r2 = "直接交卷"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r6 = r0.setRightButtonText(r2)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$k r0 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$k
            r2 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.setRightButtonOnClickListener(r0)
            r0.show()
            return
        L134:
            r2 = r19
            r1.U0(r2, r3, r4, r5)
            return
    }

    private void W0() {
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
            int r5 = r7.N0
            rx.e r0 = r3.z0(r2, r0, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$g r1 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$g
            r1.<init>(r7)
            r0.setDataListener(r1)
            return
    }

    private void X0() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.R0
            int r2 = r2.size()
            if (r1 >= r2) goto L76
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.R0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "0"
            java.lang.String r4 = "questionType"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L26
            com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r3 = new com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment
            r3.<init>()
            goto L52
        L26:
            java.lang.String r3 = "1"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L38
            com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r3 = new com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment
            r3.<init>()
            goto L52
        L38:
            java.lang.String r3 = "3"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4a
            com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment r3 = new com.bxkj.student.home.teaching.exam.mock.NewRadioExamFragment
            r3.<init>()
            goto L52
        L4a:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.R0
            r3.remove(r1)
            int r1 = r1 + (-1)
            r3 = 0
        L52:
            if (r3 == 0) goto L73
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            cn.bluemobi.dylan.base.utils.SeralizableMap r5 = new cn.bluemobi.dylan.base.utils.SeralizableMap
            r5.<init>()
            r5.setMap(r2)
            java.lang.String r2 = "index"
            r4.putInt(r2, r1)
            java.lang.String r2 = "seralizableMap"
            r4.putSerializable(r2, r5)
            r3.setArguments(r4)
            java.util.List<androidx.fragment.app.Fragment> r2 = r6.S0
            r2.add(r3)
        L73:
            int r1 = r1 + 1
            goto L2
        L76:
            com.bxkj.student.common.view.CustomViewPager r1 = r6.b0
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$h r2 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$h
            androidx.fragment.app.FragmentManager r3 = r6.getSupportFragmentManager()
            r2.<init>(r6, r3)
            r1.setAdapter(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.P0
            r1.append(r2)
            java.lang.String r2 = "1/"
            r1.append(r2)
            com.bxkj.student.common.view.CustomViewPager r2 = r6.b0
            androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
            int r2 = r2.getCount()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.setTitle(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.R0     // Catch: java.lang.Exception -> L11d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L11d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L11d
            java.lang.String r2 = "questionsSetter"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)     // Catch: java.lang.Exception -> L11d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L11d
            r3 = 8
            if (r2 == 0) goto Lc3
            android.widget.TextView r1 = r6.Z     // Catch: java.lang.Exception -> L11d
            r1.setVisibility(r3)     // Catch: java.lang.Exception -> L11d
            goto Lde
        Lc3:
            android.widget.TextView r2 = r6.Z     // Catch: java.lang.Exception -> L11d
            r2.setVisibility(r0)     // Catch: java.lang.Exception -> L11d
            android.widget.TextView r2 = r6.Z     // Catch: java.lang.Exception -> L11d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11d
            r4.<init>()     // Catch: java.lang.Exception -> L11d
            java.lang.String r5 = "出题人："
            r4.append(r5)     // Catch: java.lang.Exception -> L11d
            r4.append(r1)     // Catch: java.lang.Exception -> L11d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L11d
            r2.setText(r1)     // Catch: java.lang.Exception -> L11d
        Lde:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.R0     // Catch: java.lang.Exception -> L11d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L11d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L11d
            java.lang.String r2 = "curriculum"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)     // Catch: java.lang.Exception -> L11d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L11d
            if (r2 == 0) goto Lf8
            android.widget.TextView r1 = r6.Y     // Catch: java.lang.Exception -> L11d
            r1.setVisibility(r3)     // Catch: java.lang.Exception -> L11d
            goto L113
        Lf8:
            android.widget.TextView r2 = r6.Y     // Catch: java.lang.Exception -> L11d
            r2.setVisibility(r0)     // Catch: java.lang.Exception -> L11d
            android.widget.TextView r2 = r6.Y     // Catch: java.lang.Exception -> L11d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11d
            r3.<init>()     // Catch: java.lang.Exception -> L11d
            java.lang.String r4 = "课程名称："
            r3.append(r4)     // Catch: java.lang.Exception -> L11d
            r3.append(r1)     // Catch: java.lang.Exception -> L11d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L11d
            r2.setText(r1)     // Catch: java.lang.Exception -> L11d
        L113:
            android.widget.Button r1 = r6.c0     // Catch: java.lang.Exception -> L11d
            r1.setEnabled(r0)     // Catch: java.lang.Exception -> L11d
            android.widget.Button r1 = r6.f826k0     // Catch: java.lang.Exception -> L11d
            r1.setEnabled(r0)     // Catch: java.lang.Exception -> L11d
        L11d:
            return
    }

    private void Y0() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            int r0 = r0.getCurrentItem()
            com.bxkj.student.common.view.CustomViewPager r1 = r2.b0
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L1a
            java.lang.String r0 = "已经是最后一题了"
            r2.f0(r0)
            return
        L1a:
            java.util.List<androidx.fragment.app.Fragment> r0 = r2.S0
            if (r0 == 0) goto L33
            com.bxkj.student.common.view.CustomViewPager r1 = r2.b0
            int r1 = r1.getCurrentItem()
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r1 = r0 instanceof com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment
            if (r1 == 0) goto L33
            com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment r0 = (com.bxkj.student.home.teaching.exam.mock.NewCheckboxExamFragment) r0
            r0.P()
        L33:
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            int r1 = r0.getCurrentItem()
            int r1 = r1 + 1
            r0.setCurrentItem(r1)
            return
    }

    private void Z0() {
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.content.Context r1 = r4.V
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131493630(0x7f0c02fe, float:1.8610746E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r2 = 2131297028(0x7f090304, float:1.821199E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.GridView r2 = (android.widget.GridView) r2
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.H0
            r2.setAdapter(r3)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$b r3 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$b
            r3.<init>(r4, r0)
            r2.setOnItemClickListener(r3)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>()
            r0.setBackgroundDrawable(r2)
            r2 = 1
            r0.setOutsideTouchable(r2)
            r0.setFocusable(r2)
            r2 = 2131299265(0x7f090bc1, float:1.8216527E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$c r3 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$c
            r3.<init>(r4, r2)
            r0.setOnDismissListener(r3)
            r0.setContentView(r1)
            r1 = 2131298702(0x7f09098e, float:1.8215385E38)
            android.view.View r1 = r4.findViewById(r1)
            r0.showAsDropDown(r1)
            if (r2 == 0) goto L68
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            java.lang.String r1 = "#7F4c4c4c"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.<init>(r1)
            r2.setForeground(r0)
        L68:
            return
    }

    private void a1() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            int r0 = r0.getCurrentItem()
            if (r0 != 0) goto Le
            java.lang.String r0 = "已经是第一题了"
            r2.f0(r0)
            return
        Le:
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            int r1 = r0.getCurrentItem()
            int r1 = r1 + (-1)
            r0.setCurrentItem(r1)
            return
    }

    private void b1() {
            r7 = this;
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r0 = "HH:mm:ss"
            r6.<init>(r0)
            java.lang.String r0 = "GMT+00:00"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r6.setTimeZone(r0)
            int r0 = r7.M0
            int r0 = r0 * 1000
            long r2 = (long) r0
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$i r0 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$i
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r7
            r0.<init>(r1, r2, r4, r6)
            r1.J0 = r0
            r0.start()
            return
    }

    private void c1() {
            r7 = this;
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r0 = "HH:mm:ss"
            r6.<init>(r0)
            java.lang.String r0 = "GMT+00:00"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r6.setTimeZone(r0)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$j r0 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$j
            int r1 = r7.M0
            int r1 = r1 * 1000
            long r2 = (long) r1
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r7
            r0.<init>(r1, r2, r4, r6)
            r1.I0 = r0
            r0.start()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.view.CountDownTimeView g0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            com.bxkj.base.view.CountDownTimeView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a h0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.CountDownTimer i0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.os.CountDownTimer r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.R0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String k0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            java.lang.String r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            java.util.List<androidx.fragment.app.Fragment> r0 = r0.S0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RelativeLayout m0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.widget.RelativeLayout r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ int n0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            int r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ boolean o0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            boolean r0 = r0.T0
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.exam.mock.NewExamActivity.m p0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$m r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView q0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView r0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView s0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.CustomViewPager t0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            com.bxkj.student.common.view.CustomViewPager r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void u0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0, java.util.List r1) {
            r0.R0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0, int r1) {
            r0.M0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0, boolean r1) {
            r0.T0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0, com.bxkj.student.home.teaching.exam.mock.NewExamActivity.m r1) {
            r0.L0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void y0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0, long r1) {
            r0.O0 = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean z0(com.bxkj.student.home.teaching.exam.mock.NewExamActivity r0) {
            boolean r0 = r0.G0()
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.c0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.f826k0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.f827p0
            r0.setOnClickListener(r1)
            r1.R0()
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492932(0x7f0c0044, float:1.860933E38)
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
            r4.N0 = r0
        L17:
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$f r0 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$f
            android.content.Context r1 = r4.V
            r2 = 2131493290(0x7f0c01aa, float:1.8610056E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.R0
            r0.<init>(r4, r1, r2, r3)
            r4.H0 = r0
            r4.W0()
            return
    }

    public void S() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.P0 = r0
            r2.setTitle(r0)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$d r0 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$d
            r0.<init>(r2)
            r2.X(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131299059(0x7f090af3, float:1.8216109E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131299060(0x7f090af4, float:1.821611E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            r2 = 2131299286(0x7f090bd6, float:1.821657E38)
            android.view.View r2 = r1.findViewById(r2)
            com.bxkj.student.common.view.CustomViewPager r2 = (com.bxkj.student.common.view.CustomViewPager) r2
            r1.b0 = r2
            r2 = 2131296628(0x7f090174, float:1.8211178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.c0 = r2
            r2 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.f826k0 = r2
            r2 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.f827p0 = r2
            r2 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.F0 = r2
            r2 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.G0 = r2
            r2 = 2131296725(0x7f0901d5, float:1.8211375E38)
            android.view.View r2 = r1.findViewById(r2)
            com.bxkj.base.view.CountDownTimeView r2 = (com.bxkj.base.view.CountDownTimeView) r2
            r1.a0 = r2
            android.widget.RelativeLayout r2 = r1.G0
            r0 = 8
            r2.setVisibility(r0)
            com.bxkj.student.common.view.CustomViewPager r2 = r1.b0
            r0 = 0
            r2.setPagingEnabled(r0)
            return
    }

    public void onBackPressed() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "正在考试，是否放弃考试？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$e r1 = new com.bxkj.student.home.teaching.exam.mock.NewExamActivity$e
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.T0
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
            r1.a1()
            return
        L21:
            r2 = 0
            r1.V0(r2)
            return
        L26:
            r1.Y0()
            return
    }

    protected void onDestroy() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.J0
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.os.CountDownTimer r0 = r1.I0
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            com.bxkj.student.home.teaching.exam.mock.NewExamActivity$m r0 = r1.L0
            if (r0 == 0) goto L15
            r1.unregisterReceiver(r0)
        L15:
            super.onDestroy()
            return
    }
}

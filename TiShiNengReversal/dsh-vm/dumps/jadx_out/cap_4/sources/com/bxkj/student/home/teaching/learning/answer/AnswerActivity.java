package com.bxkj.student.home.teaching.learning.answer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AnswerActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.RelativeLayout G0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> H0;
    private android.os.CountDownTimer I0;
    private android.net.ConnectivityManager J0;
    private com.bxkj.student.home.teaching.learning.answer.AnswerActivity.l K0;
    private java.lang.String L0;
    private int M0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> N0;
    private java.util.List<androidx.fragment.app.Fragment> O0;
    private boolean P0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private com.bxkj.base.view.CountDownTimeView a0;
    private com.bxkj.student.common.view.CustomViewPager b0;
    public android.widget.Button c0;

    /* renamed from: k0, reason: collision with root package name */
    public android.widget.Button f860k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.Button f861p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.AdapterView.OnItemClickListener {
        final /* synthetic */ android.widget.PopupWindow a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity b;

        a(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, android.widget.PopupWindow r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r0.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r1)
                r1.setCurrentItem(r3)
                android.widget.PopupWindow r1 = r0.a
                r1.dismiss()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.widget.PopupWindow.OnDismissListener {
        final /* synthetic */ android.widget.FrameLayout a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity b;

        b(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, android.widget.FrameLayout r2) {
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
    class c implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity a;

        c(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r1 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.a
                r0.onBackPressed()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity a;

        d(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r1 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.a
                r0.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity e;

        e(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r3)
                goto L8a
            L80:
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r11 = r9.e
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
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r3)
                goto Lbf
            Lb5:
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r11 = r9.e
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r2)
            Lbf:
                r10.K(r1, r11)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity a;

        f(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.x0(r0)
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
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.w0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r2.a
                android.widget.RelativeLayout r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.l0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.lang.Object r3 = r3.get(r1)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity.q0(r0, r3)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r3 = r2.a
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity.s0(r3)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r3 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.h0(r3)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j0(r0)
                r3.c(r0)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
                r0 = this;
                super.netOnSuccess(r1, r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r0.a
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity.t0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends androidx.fragment.app.FragmentPagerAdapter {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity f;

        g(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        public int getCount() {
                r1 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.k0(r0)
                int r0 = r0.size()
                return r0
        }

        public androidx.fragment.app.Fragment getItem(int r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.f
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.k0(r0)
                java.lang.Object r2 = r0.get(r2)
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends android.os.CountDownTimer {
        final /* synthetic */ java.text.SimpleDateFormat a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity b;

        h(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, long r2, long r4, java.text.SimpleDateFormat r6) {
                r0 = this;
                r0.b = r1
                r0.a = r6
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r3 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r3.b
                com.bxkj.base.view.CountDownTimeView r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.g0(r0)
                r1 = 60
                r2 = 0
                r0.i(r1, r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r3.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j0(r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r3.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "timeFinish"
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.put(r1, r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r3.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.k0(r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r3.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                boolean r1 = r0 instanceof com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment
                if (r1 == 0) goto L57
                com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment r0 = (com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment) r0
                r0.R()
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r3.b
                android.widget.Button r0 = r0.c0
                r1 = 1
                r0.setEnabled(r1)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r3.b
                android.widget.Button r0 = r0.f860k0
                r0.setEnabled(r1)
            L57:
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r4) {
                r3 = this;
                int r0 = (int) r4
                int r0 = r0 / 1000
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r3.b
                com.bxkj.base.view.CountDownTimeView r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.g0(r1)
                r2 = 60
                r1.i(r2, r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.o0(r0)
                java.text.SimpleDateFormat r1 = r3.a
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                java.lang.String r4 = r1.format(r4)
                r0.setText(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ boolean a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ java.util.List c;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity d;

        i(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, boolean r2, java.util.List r3, java.util.List r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r4 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.d
                boolean r1 = r4.a
                java.util.List r2 = r4.b
                java.util.List r3 = r4.c
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity.r0(r0, r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j a;

            a(com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j r1 = r0.a
                    com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r1.b
                    r1.finish()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j a;

            b(com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j r1 = r0.a
                    com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r1.b
                    r1.finish()
                    return
            }
        }

        j(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j r0, android.view.View r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(android.view.View r3) {
                r2 = this;
                cn.bluemobi.dylan.base.utils.a r3 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.teaching.learning.detail.backup.H5Activity> r0 = com.bxkj.student.home.teaching.learning.detail.backup.H5Activity.class
                android.app.Activity r3 = r3.getActivity(r0)
                com.bxkj.student.home.teaching.learning.detail.backup.H5Activity r3 = (com.bxkj.student.home.teaching.learning.detail.backup.H5Activity) r3
                cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity> r1 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.class
                android.app.Activity r0 = r0.getActivity(r1)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0 = (com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity) r0
                if (r3 == 0) goto L1d
                r3.l0()
            L1d:
                if (r0 == 0) goto L22
                r0.u0()
            L22:
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r3 = r2.b
                r3.finish()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                boolean r2 = r1.a
                if (r2 == 0) goto L24
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.A0(r0)
                r2.<init>(r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j$b r0 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j$b
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
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.z0(r0)
                r2.<init>(r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j$a r0 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j$a
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
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
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r2.b
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.y0(r1)
                r0.<init>(r1)
                r1 = 0
                r0.setCancelable(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r0.setMessage(r3)
                com.bxkj.student.home.teaching.learning.answer.a r0 = new com.bxkj.student.home.teaching.learning.answer.a
                r0.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int a;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity b;

        k(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1) {
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
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r2 = r1.b
                java.lang.String r3 = "已经是第一题了"
                r2.f0(r3)
                return
            L11:
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r3 = r1.b
                com.bxkj.student.common.view.CustomViewPager r3 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r3)
                androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
                int r3 = r3.getCount()
                int r3 = r3 - r0
                if (r2 != r3) goto L29
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r2 = r1.b
                java.lang.String r3 = "已经是最后一题了"
                r2.f0(r3)
            L29:
                return
        }

        public void onPageSelected(int r5) {
                r4 = this;
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r5 + 1
                r1.append(r2)
                java.lang.String r2 = "/"
                r1.append(r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r2 = r4.b
                com.bxkj.student.common.view.CustomViewPager r2 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r2)
                androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
                int r2 = r2.getCount()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setTitle(r1)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                android.os.CountDownTimer r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.i0(r0)
                if (r0 == 0) goto L3a
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                android.os.CountDownTimer r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.i0(r0)
                r0.cancel()
            L3a:
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                com.bxkj.base.view.CountDownTimeView r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.g0(r0)
                r1 = 60
                r2 = 0
                r0.i(r1, r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j0(r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r4.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "timeFinish"
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r0, r1)
                if (r0 != 0) goto L99
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                java.util.List r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j0(r0)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1 = r4.b
                com.bxkj.student.common.view.CustomViewPager r1 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.p0(r1)
                int r1 = r1.getCurrentItem()
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "checkAnswerId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L99
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                android.widget.Button r0 = r0.c0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                android.widget.Button r0 = r0.f860k0
                r0.setEnabled(r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity.t0(r0)
            L99:
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.n0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "出题人："
                r1.append(r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r2 = r4.b
                java.util.List r2 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j0(r2)
                java.lang.Object r2 = r2.get(r5)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "questionsSetter"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0 = r4.b
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.m0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "课程名称："
                r1.append(r2)
                com.bxkj.student.home.teaching.learning.answer.AnswerActivity r2 = r4.b
                java.util.List r2 = com.bxkj.student.home.teaching.learning.answer.AnswerActivity.j0(r2)
                java.lang.Object r5 = r2.get(r5)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r2 = "curriculum"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.setText(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class l extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.answer.AnswerActivity a;

        private l(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                return
        }
    }

    public AnswerActivity() {
            r1 = this;
            r1.<init>()
            r0 = 60000(0xea60, float:8.4078E-41)
            r1.M0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.N0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.O0 = r0
            r0 = 1
            r1.P0 = r0
            return
    }

    static /* synthetic */ android.content.Context A0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void B0() {
            r2 = this;
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$k r1 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$k
            r1.<init>(r2)
            r0.addOnPageChangeListener(r1)
            return
    }

    private void C0() {
            r1 = this;
            r0 = 1
            r1.F0(r0)
            return
    }

    private java.lang.String D0(long r9) {
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

    private void E0(boolean r4, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6) {
            r3 = this;
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r5)
            java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r6)
            com.orhanobut.logger.j.h(r5)
            com.orhanobut.logger.j.h(r6)
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r5 = r1.o(r2, r5, r6)
            cn.bluemobi.dylan.http.HttpRequest r5 = r0.setObservable(r5)
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j r6 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$j
            r6.<init>(r3, r4)
            r5.setDataListener(r6)
            return
    }

    private void F0(boolean r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
        L14:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6 = r0.N0
            int r6 = r6.size()
            if (r5 >= r6) goto L102
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r6 = r0.N0
            java.lang.Object r6 = r6.get(r5)
            java.util.Map r6 = (java.util.Map) r6
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r7 = r0.N0
            java.lang.Object r7 = r7.get(r5)
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
            if (r7 == 0) goto Lc2
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r7 = r0.N0
            java.lang.Object r7 = r7.get(r5)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r7 = r7.get(r12)
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5d:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L8b
            java.lang.Object r15 = r7.next()
            java.util.Map r15 = (java.util.Map) r15
            r16 = r5
            java.lang.String r5 = "icChecked"
            boolean r17 = r15.containsKey(r5)
            if (r17 == 0) goto L88
            java.lang.Object r5 = r15.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L88
            java.lang.String r5 = "answerId"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r15, r5)
            r14.add(r5)
        L88:
            r5 = r16
            goto L5d
        L8b:
            r16 = r5
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r10)
            r5.put(r11, r7)
            r5.put(r12, r14)
            java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r13)
            r5.put(r13, r6)
            r3.add(r5)
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto Lfe
            if (r1 != 0) goto Lfe
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto Lb5
            r8 = r9
        Lb5:
            r4.append(r8)
            int r5 = r16 + 1
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.append(r5)
            goto Lfe
        Lc2:
            r16 = r5
            java.lang.String r5 = "checkAnswerId"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r5)
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto Le5
            if (r1 != 0) goto Le5
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto Ld9
            r8 = r9
        Ld9:
            r4.append(r8)
            int r7 = r16 + 1
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r4.append(r7)
        Le5:
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r10)
            r7.put(r11, r8)
            r7.put(r12, r5)
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r13)
            r7.put(r13, r5)
            r2.add(r7)
        Lfe:
            int r5 = r16 + 1
            goto L14
        L102:
            if (r1 != 0) goto L14b
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L125
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "您还有第"
            r5.append(r6)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = "题未作答，是否要提交试卷？"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L127
        L125:
            java.lang.String r4 = "确定要提交试卷吗？"
        L127:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r6 = r0.V
            r5.<init>(r6)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r5.setMessage(r4)
            java.lang.String r5 = "继续答题"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setLeftButtonText(r5)
            java.lang.String r5 = "直接交卷"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonText(r5)
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$i r5 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$i
            r5.<init>(r0, r1, r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r4.setRightButtonOnClickListener(r5)
            r1.show()
            return
        L14b:
            r0.E0(r1, r2, r3)
            return
    }

    private void G0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.L0
            rx.e r1 = r1.x(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$f r1 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$f
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void I0() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.N0
            int r2 = r2.size()
            if (r1 >= r2) goto L79
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.N0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "questionType"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r4 = "0"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L26
            com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment r2 = new com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment
            r2.<init>()
            goto L62
        L26:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.N0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r4 = "1"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L40
            com.bxkj.student.home.teaching.learning.answer.CheckboxAnswerFragment r2 = new com.bxkj.student.home.teaching.learning.answer.CheckboxAnswerFragment
            r2.<init>()
            goto L62
        L40:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.N0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r3 = "3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5a
            com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment r2 = new com.bxkj.student.home.teaching.learning.answer.RadioAnswerFragment
            r2.<init>()
            goto L62
        L5a:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r5.N0
            r2.remove(r1)
            int r1 = r1 + (-1)
            r2 = 0
        L62:
            if (r2 == 0) goto L76
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "index"
            r3.putInt(r4, r1)
            r2.setArguments(r3)
            java.util.List<androidx.fragment.app.Fragment> r3 = r5.O0
            r3.add(r2)
        L76:
            int r1 = r1 + 1
            goto L2
        L79:
            com.bxkj.student.common.view.CustomViewPager r1 = r5.b0
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$g r2 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$g
            androidx.fragment.app.FragmentManager r3 = r5.getSupportFragmentManager()
            r2.<init>(r5, r3)
            r1.setAdapter(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "1/"
            r1.append(r2)
            com.bxkj.student.common.view.CustomViewPager r2 = r5.b0
            androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
            int r2 = r2.getCount()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.setTitle(r1)
            android.widget.TextView r1 = r5.Z     // Catch: java.lang.Exception -> Lbb
            r2 = 8
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> Lbb
            android.widget.TextView r1 = r5.Y     // Catch: java.lang.Exception -> Lbb
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> Lbb
            android.widget.Button r1 = r5.c0     // Catch: java.lang.Exception -> Lbb
            r1.setEnabled(r0)     // Catch: java.lang.Exception -> Lbb
            android.widget.Button r1 = r5.f860k0     // Catch: java.lang.Exception -> Lbb
            r1.setEnabled(r0)     // Catch: java.lang.Exception -> Lbb
        Lbb:
            return
    }

    private void J0() {
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
            com.bxkj.student.common.view.CustomViewPager r0 = r2.b0
            int r1 = r0.getCurrentItem()
            int r1 = r1 + 1
            r0.setCurrentItem(r1)
            return
    }

    private void K0() {
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
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$a r3 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$a
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
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$b r3 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$b
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

    private void L0() {
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

    private void M0() {
            r7 = this;
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r0 = "HH:mm:ss"
            r6.<init>(r0)
            java.lang.String r0 = "GMT+00:00"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r6.setTimeZone(r0)
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$h r0 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$h
            int r1 = r7.M0
            long r2 = (long) r1
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r7
            r0.<init>(r1, r2, r4, r6)
            r1.I0 = r0
            r0.start()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.view.CountDownTimeView g0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            com.bxkj.base.view.CountDownTimeView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a h0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.CountDownTimer i0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.os.CountDownTimer r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.N0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List k0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            java.util.List<androidx.fragment.app.Fragment> r0 = r0.O0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RelativeLayout l0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.widget.RelativeLayout r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.CustomViewPager p0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            com.bxkj.student.common.view.CustomViewPager r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0, java.util.List r1) {
            r0.N0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0, boolean r1, java.util.List r2, java.util.List r3) {
            r0.E0(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void s0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            r0.I0()
            return
    }

    static /* bridge */ /* synthetic */ void t0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            r0.M0()
            return
    }

    private boolean u0() {
            r1 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Exception -> L1a
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1a
            r1.J0 = r0     // Catch: java.lang.Exception -> L1a
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

    private void v0() {
            r5 = this;
            android.net.ConnectivityManager r0 = r5.J0
            r1 = 0
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r1)
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.ConnectivityManager r2 = r5.J0
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

    static /* synthetic */ android.content.Context w0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context x0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context y0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context z0(com.bxkj.student.home.teaching.learning.answer.AnswerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> H0() {
            r1 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.N0
            return r0
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.c0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.f860k0
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r1.f861p0
            r0.setOnClickListener(r1)
            r1.B0()
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
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.L0 = r0
        L16:
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$e r0 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$e
            android.content.Context r1 = r4.V
            r2 = 2131493290(0x7f0c01aa, float:1.8610056E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.N0
            r0.<init>(r4, r1, r2, r3)
            r4.H0 = r0
            r4.G0()
            return
    }

    public void S() {
            r1 = this;
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$c r0 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$c
            r0.<init>(r1)
            r1.X(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            r3 = 2131299059(0x7f090af3, float:1.8216109E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Y = r3
            r3 = 2131299060(0x7f090af4, float:1.821611E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Z = r3
            r3 = 2131299286(0x7f090bd6, float:1.821657E38)
            android.view.View r3 = r2.findViewById(r3)
            com.bxkj.student.common.view.CustomViewPager r3 = (com.bxkj.student.common.view.CustomViewPager) r3
            r2.b0 = r3
            r3 = 2131296628(0x7f090174, float:1.8211178E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.c0 = r3
            r3 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.f860k0 = r3
            r3 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.f861p0 = r3
            r3 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.F0 = r3
            r3 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2.G0 = r3
            r3 = 2131296725(0x7f0901d5, float:1.8211375E38)
            android.view.View r3 = r2.findViewById(r3)
            com.bxkj.base.view.CountDownTimeView r3 = (com.bxkj.base.view.CountDownTimeView) r3
            r2.a0 = r3
            android.widget.RelativeLayout r3 = r2.G0
            r0 = 8
            r3.setVisibility(r0)
            com.bxkj.student.common.view.CustomViewPager r3 = r2.b0
            r0 = 0
            r3.setPagingEnabled(r0)
            com.bxkj.base.view.CountDownTimeView r3 = r2.a0
            r1 = 60
            r3.i(r1, r0)
            com.bxkj.base.view.CountDownTimeView r3 = r2.a0
            android.content.Context r0 = r2.V
            r1 = 1101004800(0x41a00000, float:20.0)
            int r0 = cn.bluemobi.dylan.base.utils.d.d(r0, r1)
            r3.setTextSize(r0)
            return
    }

    public void onBackPressed() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "正在答题，是否放弃答题？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$d r1 = new com.bxkj.student.home.teaching.learning.answer.AnswerActivity$d
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r1.getId()
            switch(r1) {
                case 2131296622: goto L11;
                case 2131296623: goto Lc;
                case 2131296628: goto L8;
                default: goto L7;
            }
        L7:
            return
        L8:
            r0.L0()
            return
        Lc:
            r1 = 0
            r0.F0(r1)
            return
        L11:
            r0.J0()
            return
    }

    protected void onDestroy() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.I0
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.bxkj.student.home.teaching.learning.answer.AnswerActivity$l r0 = r1.K0
            if (r0 == 0) goto Le
            r1.unregisterReceiver(r0)
        Le:
            super.onDestroy()
            return
    }
}

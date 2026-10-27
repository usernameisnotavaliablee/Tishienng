package com.bxkj.student.home.teaching.exam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExamDescriptionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button Y;
    private cn.bluemobi.dylan.smartwebview.SmartWebView Z;
    private int a0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamDescriptionActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a$a, reason: collision with other inner class name */
        class CountDownTimerC0085a extends android.os.CountDownTimer {
            final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.a a;

            CountDownTimerC0085a(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.a r1, long r2, long r4) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2, r4)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                    r2 = this;
                    com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a r0 = r2.a
                    com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.g0(r0)
                    r1 = 1
                    r0.setEnabled(r1)
                    com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a r0 = r2.a
                    com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.g0(r0)
                    java.lang.String r1 = "开始考试"
                    r0.setText(r1)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onTick(long r5) {
                    r4 = this;
                    com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a r0 = r4.a
                    com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.g0(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "开始考试("
                    r1.append(r2)
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 / r2
                    r1.append(r5)
                    java.lang.String r5 = "秒)"
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.setText(r5)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.j0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r9) {
                r8 = this;
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r8.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.i0(r0)
                java.lang.String r2 = "data"
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r2)
                r0.h(r9)
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r9 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r9 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.i0(r9)
                android.webkit.WebView r9 = r9.getWebView()
                android.webkit.WebSettings r9 = r9.getSettings()
                android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.LARGEST
                r9.setTextSize(r0)
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.g0(r9)
                r9.setEnabled(r1)
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a$a r2 = new com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a$a
                r4 = 4000(0xfa0, double:1.9763E-320)
                r6 = 1000(0x3e8, double:4.94E-321)
                r3 = r8
                r2.<init>(r3, r4, r6)
                r2.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.ExamDescriptionActivity a;

        b(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "isMoreCourses"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r0)
                if (r0 != 0) goto L28
                java.lang.String r0 = "courseNum"
                int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r0)
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r1 = r3.a
                android.content.Intent r2 = r1.getIntent()
                android.content.Intent r4 = r2.putExtra(r0, r4)
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0 = r3.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.k0(r0)
                java.lang.Class<com.bxkj.student.home.teaching.exam.SelectExamLessonActivity> r2 = com.bxkj.student.home.teaching.exam.SelectExamLessonActivity.class
                android.content.Intent r4 = r4.setClass(r0, r2)
                r1.startActivity(r4)
                goto L5b
            L28:
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r4 = r3.a
                int r4 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.h0(r4)
                if (r4 != 0) goto L46
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r4 = r3.a
                android.content.Intent r0 = r4.getIntent()
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.l0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.exam.formal.ExamActivity> r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.class
                android.content.Intent r0 = r0.setClass(r1, r2)
                r4.startActivity(r0)
                goto L5b
            L46:
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r4 = r3.a
                android.content.Intent r0 = r4.getIntent()
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.exam.ExamDescriptionActivity.m0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.exam.mock.NewExamActivity> r2 = com.bxkj.student.home.teaching.exam.mock.NewExamActivity.class
                android.content.Intent r0 = r0.setClass(r1, r2)
                r4.startActivity(r0)
            L5b:
                com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r4 = r3.a
                r4.finish()
                return
        }
    }

    public ExamDescriptionActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a0 = r0
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button g0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            android.widget.Button r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int h0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            int r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView i0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.Z
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.exam.ExamDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void n0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r3 = "stuTeacherCurriculumId"
            java.lang.String r2 = r2.getStringExtra(r3)
            int r3 = r4.a0
            rx.e r1 = r1.d1(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$b r1 = new com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Y
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492998(0x7f0c0086, float:1.8609464E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "onlineType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L17
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.a0 = r0
        L17:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            int r2 = r3.a0
            rx.e r1 = r1.H(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a r1 = new com.bxkj.student.home.teaching.exam.ExamDescriptionActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L29
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "说明"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.setTitle(r0)
            return
        L29:
            java.lang.String r0 = "考试说明"
            r2.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131296646(0x7f090186, float:1.8211215E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.Y = r2
            r2 = 2131298609(0x7f090931, float:1.8215196E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.Z = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            if (r2 == r0) goto La
            return
        La:
            r1.n0()
            return
    }
}

package com.bxkj.student.run.app.ready;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunDescriptionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.Button Y;
    private cn.bluemobi.dylan.smartwebview.SmartWebView Z;
    private com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean a0;
    private final int b0;
    private final int c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.ready.RunDescriptionActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.run.app.ready.RunDescriptionActivity$a$a, reason: collision with other inner class name */
        class CountDownTimerC0134a extends android.os.CountDownTimer {
            final /* synthetic */ com.bxkj.student.run.app.ready.RunDescriptionActivity.a a;

            CountDownTimerC0134a(com.bxkj.student.run.app.ready.RunDescriptionActivity.a r1, long r2, long r4) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2, r4)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                    r2 = this;
                    com.bxkj.student.run.app.ready.RunDescriptionActivity$a r0 = r2.a
                    com.bxkj.student.run.app.ready.RunDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.run.app.ready.RunDescriptionActivity.h0(r0)
                    r1 = 1
                    r0.setEnabled(r1)
                    com.bxkj.student.run.app.ready.RunDescriptionActivity$a r0 = r2.a
                    com.bxkj.student.run.app.ready.RunDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.run.app.ready.RunDescriptionActivity.h0(r0)
                    java.lang.String r1 = "开始跑步"
                    r0.setText(r1)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onTick(long r5) {
                    r4 = this;
                    com.bxkj.student.run.app.ready.RunDescriptionActivity$a r0 = r4.a
                    com.bxkj.student.run.app.ready.RunDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.run.app.ready.RunDescriptionActivity.h0(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "开始跑步("
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

        a(com.bxkj.student.run.app.ready.RunDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r9) {
                r8 = this;
                com.bxkj.student.run.app.ready.RunDescriptionActivity r0 = r8.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.run.app.ready.RunDescriptionActivity r0 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.run.app.ready.RunDescriptionActivity.i0(r0)
                java.lang.String r2 = "data"
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r2)
                r0.h(r9)
                com.bxkj.student.run.app.ready.RunDescriptionActivity r9 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r9 = com.bxkj.student.run.app.ready.RunDescriptionActivity.i0(r9)
                android.webkit.WebView r9 = r9.getWebView()
                android.webkit.WebSettings r9 = r9.getSettings()
                android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.LARGEST
                r9.setTextSize(r0)
                com.bxkj.student.run.app.ready.RunDescriptionActivity r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.run.app.ready.RunDescriptionActivity.h0(r9)
                r9.setEnabled(r1)
                com.bxkj.student.run.app.ready.RunDescriptionActivity$a$a r2 = new com.bxkj.student.run.app.ready.RunDescriptionActivity$a$a
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
        final /* synthetic */ com.bxkj.student.run.app.ready.RunDescriptionActivity a;

        b(com.bxkj.student.run.app.ready.RunDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.run.app.ready.RunDescriptionActivity r0 = r4.a
                android.content.Intent r0 = r0.getIntent()
                com.bxkj.student.run.app.ready.RunDescriptionActivity r1 = r4.a
                android.content.Context r1 = com.bxkj.student.run.app.ready.RunDescriptionActivity.j0(r1)
                java.lang.Class<com.bxkj.student.run.app.ready.ThreeTwoOneActivity> r2 = com.bxkj.student.run.app.ready.ThreeTwoOneActivity.class
                android.content.Intent r0 = r0.setClass(r1, r2)
                java.lang.String r1 = "startTime"
                long r2 = cn.bluemobi.dylan.http.JsonParse.getLong(r5, r1)
                r0.putExtra(r1, r2)
                com.bxkj.student.run.app.ready.RunDescriptionActivity r5 = r4.a
                r5.startActivity(r0)
                com.bxkj.student.run.app.ready.RunDescriptionActivity r5 = r4.a
                r0 = 2130771987(0x7f010013, float:1.714708E38)
                r1 = 2130771986(0x7f010012, float:1.7147078E38)
                r5.overridePendingTransition(r0, r1)
                com.bxkj.student.run.app.ready.RunDescriptionActivity r5 = r4.a
                r5.finish()
                return
        }
    }

    public RunDescriptionActivity() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.b0 = r0
            r0 = 170(0xaa, float:2.38E-43)
            r1.c0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.student.run.app.ready.RunDescriptionActivity r0) {
            kotlin.n1 r0 = r0.l0()
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button h0(com.bxkj.student.run.app.ready.RunDescriptionActivity r0) {
            android.widget.Button r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView i0(com.bxkj.student.run.app.ready.RunDescriptionActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.Z
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.run.app.ready.RunDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void k0() {
            r3 = this;
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r3.a0
            int r0 = r0.getIsStartFace()
            r1 = 1
            if (r0 != r1) goto L16
            androidx.fragment.app.FragmentActivity r0 = r3.W
            com.bxkj.student.run.app.ready.a r1 = new com.bxkj.student.run.app.ready.a
            r1.<init>(r3)
            java.lang.String r2 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
            return
        L16:
            r3.m0()
            return
    }

    private /* synthetic */ kotlin.n1 l0() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.run.app.face.FaceDetectExpActivity> r2 = com.bxkj.student.run.app.face.FaceDetectExpActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r1 = r3.a0
            java.lang.String r1 = r1.getIdentify()
            java.lang.String r2 = "identify"
            r0.putExtra(r2, r1)
            r1 = 255(0xff, float:3.57E-43)
            r3.startActivityForResult(r0, r1)
            r0 = 2130771987(0x7f010013, float:1.714708E38)
            r1 = 2130771986(0x7f010012, float:1.7147078E38)
            r3.overridePendingTransition(r0, r1)
            r0 = 0
            return r0
    }

    private void m0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r2 = r3.a0
            java.lang.String r2 = r2.getIdentify()
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.ready.RunDescriptionActivity$b r1 = new com.bxkj.student.run.app.ready.RunDescriptionActivity$b
            r1.<init>(r3)
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
            java.lang.String r1 = "dataBean"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L18
            android.content.Intent r0 = r3.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = (com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean) r0
            r3.a0 = r0
        L18:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r2 = r3.a0
            int r2 = r2.getRunType()
            rx.e r1 = r1.e(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.ready.RunDescriptionActivity$a r1 = new com.bxkj.student.run.app.ready.RunDescriptionActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "跑步说明"
            r1.setTitle(r0)
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
            android.widget.Button r2 = r1.Y
            java.lang.String r0 = "开始跑步"
            r2.setText(r0)
            android.widget.FrameLayout r2 = r1.P()
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r3, r4, r5)
            r5 = -1
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto Le
            if (r4 != r5) goto Le
            r2.m0()
            return
        Le:
            r1 = 170(0xaa, float:2.38E-43)
            if (r3 != r0) goto L38
            if (r4 != r1) goto L38
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r4 = r2.V
            java.lang.Class<com.bxkj.student.run.app.face.FaceDetectExpActivity> r5 = com.bxkj.student.run.app.face.FaceDetectExpActivity.class
            android.content.Intent r3 = r3.setClass(r4, r5)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r4 = r2.a0
            java.lang.String r4 = r4.getIdentify()
            java.lang.String r5 = "identify"
            r3.putExtra(r5, r4)
            r2.startActivityForResult(r3, r0)
            r3 = 2130771987(0x7f010013, float:1.714708E38)
            r4 = 2130771986(0x7f010012, float:1.7147078E38)
            r2.overridePendingTransition(r3, r4)
            return
        L38:
            if (r3 != r1) goto L3f
            if (r4 != r5) goto L3f
            r2.k0()
        L3f:
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            if (r3 == r0) goto La
            return
        La:
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r3 = r2.a0
            int r3 = r3.getIsQuestion()
            r0 = 1
            if (r3 != r0) goto L2e
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.run.app.exam.QuestionActivity> r1 = com.bxkj.student.run.app.exam.QuestionActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            r0 = 170(0xaa, float:2.38E-43)
            r2.startActivityForResult(r3, r0)
            r3 = 2130771987(0x7f010013, float:1.714708E38)
            r0 = 2130771986(0x7f010012, float:1.7147078E38)
            r2.overridePendingTransition(r3, r0)
            return
        L2e:
            r2.k0()
            return
    }
}

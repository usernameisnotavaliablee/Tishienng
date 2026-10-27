package com.bxkj.student.home.teaching.lesson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LessonDescriptionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.smartwebview.SmartWebView Y;
    private android.widget.Button Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a$a, reason: collision with other inner class name */
        class CountDownTimerC0097a extends android.os.CountDownTimer {
            final /* synthetic */ com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.a a;

            CountDownTimerC0097a(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.a r1, long r2, long r4) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2, r4)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                    r3 = this;
                    com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a r0 = r3.a
                    com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.g0(r0)
                    r1 = 1
                    r0.setEnabled(r1)
                    com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a r0 = r3.a
                    com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.g0(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "开始选"
                    r1.append(r2)
                    com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r2 = r2.getXuanAfterLabelName()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.setText(r1)
                    return
            }

            @Override // android.os.CountDownTimer
            public void onTick(long r5) {
                    r4 = this;
                    com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a r0 = r4.a
                    com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0 = r0.a
                    android.widget.Button r0 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.g0(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "开始选"
                    r1.append(r2)
                    com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r2 = r2.getXuanAfterLabelName()
                    r1.append(r2)
                    java.lang.String r2 = "("
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

        a(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.g0(r2)
                r0 = 0
                r2.setEnabled(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.i0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r9) {
                r8 = this;
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0 = r8.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.h0(r0)
                java.lang.String r2 = "content"
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r2)
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getServerUrl()
                r0.i(r9, r2)
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r9 = r8.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r9 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.h0(r9)
                android.webkit.WebView r9 = r9.getWebView()
                android.webkit.WebSettings r9 = r9.getSettings()
                android.webkit.WebSettings$TextSize r0 = android.webkit.WebSettings.TextSize.LARGEST
                r9.setTextSize(r0)
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.g0(r9)
                r9.setEnabled(r1)
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a$a r2 = new com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a$a
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
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity a;

        b(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "data"
                int r4 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r0)
                if (r4 != 0) goto L1f
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r4 = r3.a
                android.content.Context r4 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.k0(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.j0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.lesson.OnLineLessonActivity> r2 = com.bxkj.student.home.teaching.lesson.OnLineLessonActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                goto L67
            L1f:
                r0 = 1
                java.lang.Class<com.bxkj.student.home.teaching.lesson.ChooseTimeActivity> r1 = com.bxkj.student.home.teaching.lesson.ChooseTimeActivity.class
                if (r4 != r0) goto L39
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r4 = r3.a
                android.content.Context r4 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.m0(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r2 = r3.a
                android.content.Context r2 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.l0(r2)
                r0.<init>(r2, r1)
                r4.startActivity(r0)
                goto L67
            L39:
                r0 = 2
                if (r4 != r0) goto L53
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r4 = r3.a
                android.content.Context r4 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.o0(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.n0(r1)
                java.lang.Class<com.bxkj.student.home.teaching.lesson.ChooseLessonActivity> r2 = com.bxkj.student.home.teaching.lesson.ChooseLessonActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                goto L67
            L53:
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r4 = r3.a
                android.content.Context r4 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.q0(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r2 = r3.a
                android.content.Context r2 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.p0(r2)
                r0.<init>(r2, r1)
                r4.startActivity(r0)
            L67:
                com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r4 = r3.a
                r4.finish()
                return
        }
    }

    public LessonDescriptionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button g0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.widget.Button r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView h0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.Y
            return r0
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void r0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.E(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$b r1 = new com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492998(0x7f0c0086, float:1.8609464E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = "2"
            rx.e r1 = r1.z(r3, r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a r1 = new com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    public void S() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "选"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getXuanAfterLabelName()
            r0.append(r1)
            java.lang.String r1 = "说明"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r3) {
            r2 = this;
            r3 = 2131296646(0x7f090186, float:1.8211215E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r2.Z = r3
            r3 = 2131298609(0x7f090931, float:1.8215196E38)
            android.view.View r3 = r2.findViewById(r3)
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r3
            r2.Y = r3
            android.widget.FrameLayout r3 = r2.P()
            r0 = 8
            r3.setVisibility(r0)
            android.widget.Button r3 = r2.Z
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "开始选"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getXuanAfterLabelName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            if (r2 == r0) goto La
            return
        La:
            r1.r0()
            return
    }
}

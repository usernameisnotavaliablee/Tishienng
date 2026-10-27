package com.bxkj.student.home;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    private androidx.fragment.app.FragmentActivity a;
    private android.content.Context b;
    private java.lang.String c;
    private java.lang.String d;
    private android.widget.Toast e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements s.b.a {
        final /* synthetic */ com.bxkj.student.home.d a;

        a(com.bxkj.student.home.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r4 = this;
                com.bxkj.student.home.d r0 = r4.a
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                android.content.Intent r1 = new android.content.Intent
                com.bxkj.student.home.d r2 = r4.a
                android.content.Context r2 = com.bxkj.student.home.d.b(r2)
                java.lang.Class<com.bxkj.student.run.app.StartRunActivity> r3 = com.bxkj.student.run.app.StartRunActivity.class
                r1.<init>(r2, r3)
                r0.startActivity(r1)
                return
        }

        @Override // s.b.a
        public void b(@org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.d r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                r3.<init>(r0)
                com.bxkj.student.home.d r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                r1 = 2131952329(0x7f1302c9, float:1.9541098E38)
                java.lang.String r0 = r0.getString(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }

        @Override // s.b.a
        public void c(@org.jetbrains.annotations.NotNull java.lang.String[] r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.d r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                r3.<init>(r0)
                com.bxkj.student.home.d r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                r1 = 2131952329(0x7f1302c9, float:1.9541098E38)
                java.lang.String r0 = r0.getString(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.home.d b;

        b(com.bxkj.student.home.d r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.d r0 = r1.b
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r4 = r3.a
                java.lang.String r0 = "班长预约"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L21
                com.bxkj.student.home.d r4 = r3.b
                android.content.Context r4 = com.bxkj.student.home.d.b(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.d r1 = r3.b
                android.content.Context r1 = com.bxkj.student.home.d.b(r1)
                java.lang.Class<com.bxkj.student.home.physicaltest.monitor.reservation.MonitorDescriptionActivity> r2 = com.bxkj.student.home.physicaltest.monitor.reservation.MonitorDescriptionActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                return
            L21:
                com.bxkj.student.home.d r4 = r3.b
                android.content.Context r4 = com.bxkj.student.home.d.b(r4)
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.d r1 = r3.b
                android.content.Context r1 = com.bxkj.student.home.d.b(r1)
                java.lang.Class<com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity> r2 = com.bxkj.student.home.physicaltest.monitor.record.MonitorRecordListActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.home.d a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.home.d.c a;

            a(com.bxkj.student.home.d.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnOtherStatus(int r2, java.lang.String r3) {
                    r1 = this;
                    super.netOnOtherStatus(r2, r3)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.home.d$c r0 = r1.a
                    com.bxkj.student.home.d r0 = r0.a
                    android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                    r2.<init>(r0)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                    r2.show()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                    r1 = this;
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.home.d$c r0 = r1.a
                    com.bxkj.student.home.d r0 = r0.a
                    android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                    r2.<init>(r0)
                    java.lang.String r0 = "已提交申请"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                    r2.show()
                    return
            }
        }

        c(com.bxkj.student.home.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.home.d r0 = r3.a
                android.content.Context r0 = com.bxkj.student.home.d.b(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
                java.lang.Class<d0.a> r1 = d0.a.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                d0.a r1 = (d0.a) r1
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getUserId()
                rx.e r1 = r1.D0(r2)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.home.d$c$a r1 = new com.bxkj.student.home.d$c$a
                r1.<init>(r3)
                r0.setDataListener(r1)
                return
        }
    }

    public d(androidx.fragment.app.FragmentActivity r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.home.d r0) {
            r0.e()
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context b(com.bxkj.student.home.d r0) {
            android.content.Context r0 = r0.b
            return r0
    }

    private void c() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.b
            r0.<init>(r1)
            java.lang.String r1 = "确定要申请班长吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.d$c r1 = new com.bxkj.student.home.d$c
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    private void d(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.b
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.t0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.d$b r1 = new com.bxkj.student.home.d$b
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void e() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.LOCATION_SOURCE_SETTINGS"
            r0.setAction(r1)
            androidx.fragment.app.FragmentActivity r1 = r2.a
            r1.startActivity(r0)
            return
    }

    public void f() {
            r8 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            java.lang.String r1 = "体测计算器"
            if (r0 != 0) goto L23
            java.lang.String r0 = r8.d
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r3 = com.bxkj.student.personal.login.LoginActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L23:
            java.lang.String r0 = "更多"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3c
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.HomeMenuListActivity> r3 = com.bxkj.student.home.HomeMenuListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L3c:
            java.lang.String r0 = r8.d
            java.lang.String r2 = "赛事中心"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L89
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getOldToNewH5()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L65
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r8.b
            r0.<init>(r1)
            java.lang.String r1 = "暂未开通此权限！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L65:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAccount()
            java.lang.String r4 = "username"
            r1.put(r4, r3)
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            java.lang.String r2 = "linkUrl"
            r1.put(r2, r0)
            com.bxkj.student.v2.common.utils.h r0 = com.bxkj.student.v2.common.utils.h.a
            android.content.Context r2 = r8.b
            r0.b(r2, r1)
            return
        L89:
            java.lang.String r0 = "竞赛报名"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La2
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.competition.signup.CompetitionListActivity> r3 = com.bxkj.competition.signup.CompetitionListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        La2:
            java.lang.String r0 = "竞赛记录"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lbb
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.competition.score.CompetitionListActivity> r3 = com.bxkj.competition.score.CompetitionListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        Lbb:
            java.lang.String r0 = "发布通讯稿"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld4
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.competition.newsletter.CompetitionListActivity> r3 = com.bxkj.competition.newsletter.CompetitionListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        Ld4:
            java.lang.String r0 = "电子参赛证"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Led
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.competition.electronicentry.CompeteListActivity> r3 = com.bxkj.competition.electronicentry.CompeteListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        Led:
            java.lang.String r0 = "理论考试"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            java.lang.String r2 = "onlineType"
            java.lang.Class<com.bxkj.student.home.teaching.exam.ExamListActivity> r3 = com.bxkj.student.home.teaching.exam.ExamListActivity.class
            java.lang.String r4 = "title"
            if (r0 == 0) goto L115
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r5 = r8.b
            r1.<init>(r5, r3)
            java.lang.String r3 = "理论考试课程"
            android.content.Intent r1 = r1.putExtra(r4, r3)
            r3 = 0
            android.content.Intent r1 = r1.putExtra(r2, r3)
            r0.startActivity(r1)
            return
        L115:
            java.lang.String r0 = "体育专业题库"
            java.lang.String r5 = r8.d
            boolean r0 = r0.equals(r5)
            r5 = 1
            if (r0 == 0) goto L137
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r6 = r8.b
            r1.<init>(r6, r3)
            java.lang.String r3 = r8.d
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r2, r5)
            r0.startActivity(r1)
            return
        L137:
            java.lang.String r0 = "体育知识竞赛"
            java.lang.String r6 = r8.d
            boolean r0 = r0.equals(r6)
            r6 = 2
            if (r0 == 0) goto L159
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r5 = r8.b
            r1.<init>(r5, r3)
            java.lang.String r3 = r8.d
            android.content.Intent r1 = r1.putExtra(r4, r3)
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r0.startActivity(r1)
            return
        L159:
            java.lang.String r0 = "评价教师"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L172
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity> r3 = com.bxkj.student.home.teaching.evaluateteacher.EvaluateListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L172:
            java.lang.String r0 = "体测成绩"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L18b
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity> r3 = com.bxkj.student.home.physicaltest.scanscore.TestScoreListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L18b:
            java.lang.String r0 = "预约体测"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a4
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity> r3 = com.bxkj.student.home.physicaltest.personal.reservation.DescriptionActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L1a4:
            java.lang.String r0 = "体测预约记录"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1bd
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.personal.record.MyReservationListActivity> r3 = com.bxkj.student.home.physicaltest.personal.record.MyReservationListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L1bd:
            java.lang.String r0 = "场馆预约记录"
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            java.lang.Class<com.bxkj.place.history.ApplyHistoryListActivity> r2 = com.bxkj.place.history.ApplyHistoryListActivity.class
            java.lang.String r3 = "appointType"
            if (r0 == 0) goto L1dc
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r4 = r8.b
            r1.<init>(r4, r2)
            android.content.Intent r1 = r1.putExtra(r3, r5)
            r0.startActivity(r1)
            return
        L1dc:
            java.lang.String r0 = r8.d
            java.lang.String r7 = "班长预约"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L1ea
            r8.d(r7)
            return
        L1ea:
            java.lang.String r0 = "申请班长"
            java.lang.String r7 = r8.d
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L1f8
            r8.c()
            return
        L1f8:
            java.lang.String r0 = r8.d
            java.lang.String r7 = "班长记录"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L206
            r8.d(r7)
            return
        L206:
            java.lang.String r0 = "申请免测"
            java.lang.String r7 = r8.d
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L21f
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity> r3 = com.bxkj.student.home.physicaltest.mc.ApplyMcListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L21f:
            java.lang.String r0 = r8.d
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L236
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.calc.CalcActivity> r3 = com.bxkj.student.home.physicaltest.calc.CalcActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L236:
            java.lang.String r0 = "申请状态"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24f
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.healthstatus.ApplyHealthStatusListActivity> r3 = com.bxkj.student.home.teaching.healthstatus.ApplyHealthStatusListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L24f:
            java.lang.String r0 = r8.d
            java.lang.String r1 = "预约场馆"
            boolean r0 = r1.equals(r0)
            java.lang.Class<com.bxkj.place.apply.SchoolDistrictActivity> r7 = com.bxkj.place.apply.SchoolDistrictActivity.class
            if (r0 == 0) goto L2ae
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getSchoolId()
            java.lang.String r2 = "342"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L29d
            android.content.Context r0 = r8.b
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r3 = r8.b
            java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r5 = com.bxkj.base.webview.H5DetailActivity.class
            r2.<init>(r3, r5)
            android.content.Intent r1 = r2.putExtra(r4, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "http://swufecg.tsnkj.com/#/pages/login/phone-login?u="
            r2.append(r3)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getAccount()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "url"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.startActivity(r1)
            return
        L29d:
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            r1.<init>(r2, r7)
            android.content.Intent r1 = r1.putExtra(r3, r5)
            r0.startActivity(r1)
            return
        L2ae:
            java.lang.String r0 = "申请场馆"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c9
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            r1.<init>(r2, r7)
            android.content.Intent r1 = r1.putExtra(r3, r6)
            r0.startActivity(r1)
            return
        L2c9:
            java.lang.String r0 = "申请记录"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e4
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r4 = r8.b
            r1.<init>(r4, r2)
            android.content.Intent r1 = r1.putExtra(r3, r6)
            r0.startActivity(r1)
            return
        L2e4:
            java.lang.String r0 = "上课请假"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2fd
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.leave.SelectLessenListActivity> r3 = com.bxkj.student.home.teaching.leave.SelectLessenListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L2fd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "在线选"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getXuanAfterLabelName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32d
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity> r3 = com.bxkj.student.home.teaching.lesson.LessonDescriptionActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L32d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "查看"
            r0.append(r1)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getViewAfterLabelName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r8.d
            boolean r0 = r0.equals(r2)
            java.lang.String r2 = "from"
            java.lang.Class<com.bxkj.student.home.teaching.lesson.ViewTermActivity> r3 = com.bxkj.student.home.teaching.lesson.ViewTermActivity.class
            if (r0 == 0) goto L37a
            android.content.Context r0 = r8.b
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r5 = r8.b
            r4.<init>(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getViewAfterLabelName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.content.Intent r1 = r4.putExtra(r2, r1)
            r0.startActivity(r1)
            return
        L37a:
            java.lang.String r0 = r8.d
            java.lang.String r1 = "查看点名"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L395
            android.content.Context r0 = r8.b
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r5 = r8.b
            r4.<init>(r5, r3)
            android.content.Intent r1 = r4.putExtra(r2, r1)
            r0.startActivity(r1)
            return
        L395:
            java.lang.String r0 = "上课签到"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e0
            androidx.fragment.app.FragmentActivity r0 = r8.a
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            java.lang.String r1 = "gps"
            boolean r0 = r0.isProviderEnabled(r1)
            if (r0 != 0) goto L3d1
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r8.b
            r0.<init>(r1)
            java.lang.String r1 = "GPS未开启"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r1)
            java.lang.String r1 = "为了正常上课签到，需要你开启GPS定位功能。"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.home.c r1 = new com.bxkj.student.home.c
            r1.<init>(r8)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
        L3d1:
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.rollcall.BleSignActivity> r3 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L3e0:
            java.lang.String r0 = "绑定Keep账号"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L418
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getKeepToken()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L407
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.run.app.keep.KeepAuthH5Activity> r3 = com.bxkj.student.run.app.keep.KeepAuthH5Activity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L407:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r8.b
            r0.<init>(r1)
            java.lang.String r1 = "已绑定keep账号"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L418:
            java.lang.String r0 = "同步Keep数据"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L431
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.run.app.keep.SyncKeepDataActivity> r3 = com.bxkj.student.run.app.keep.SyncKeepDataActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L431:
            java.lang.String r0 = "App跑步"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L457
            s.b r0 = new s.b
            androidx.fragment.app.FragmentActivity r1 = r8.a
            r0.<init>(r1)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            s.b r0 = r0.c(r1)
            com.bxkj.student.home.d$a r1 = new com.bxkj.student.home.d$a
            r1.<init>(r8)
            r0.d(r1)
            return
        L457:
            java.lang.String r0 = "申请免跑"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L470
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.run.app.apply.ApplyAvoidRunListActivity> r3 = com.bxkj.student.run.app.apply.ApplyAvoidRunListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L470:
            java.lang.String r0 = "锻炼考勤"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L489
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.run.punchcard.TotalActivity> r3 = com.bxkj.student.run.punchcard.TotalActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L489:
            java.lang.String r0 = "期末成绩"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a2
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.resultfinal.ViewTermActivity> r3 = com.bxkj.student.home.teaching.resultfinal.ViewTermActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L4a2:
            java.lang.String r0 = "场馆打卡"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4bb
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.run.extraclass.SignListActivity> r3 = com.bxkj.student.run.extraclass.SignListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L4bb:
            java.lang.String r0 = "预约活动"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d4
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.activity.BookingActivity> r3 = com.bxkj.student.home.teaching.activity.BookingActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L4d4:
            java.lang.String r0 = "我的活动"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4ed
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.activity.MyBookingListActivity> r3 = com.bxkj.student.home.teaching.activity.MyBookingListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L4ed:
            java.lang.String r0 = "借用器材"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L506
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.equipment.ApplyEquipmentActivity> r3 = com.bxkj.equipment.ApplyEquipmentActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L506:
            java.lang.String r0 = "借用记录"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51f
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.equipment.history.RecordListActivity> r3 = com.bxkj.equipment.history.RecordListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L51f:
            java.lang.String r0 = "在线学习"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L538
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity> r3 = com.bxkj.student.home.teaching.learning.ready.LearnDescriptionActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L538:
            java.lang.String r0 = "自助视力"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L551
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.InputEyeScoreActivity> r3 = com.bxkj.student.home.physicaltest.InputEyeScoreActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L551:
            java.lang.String r0 = "预约考试"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56a
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity> r3 = com.bxkj.student.home.teaching.separateexam.ExamLessonListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L56a:
            java.lang.String r0 = "课后作业"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L583
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.teaching.homework.ViewTermActivity> r3 = com.bxkj.student.home.teaching.homework.ViewTermActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L583:
            java.lang.String r0 = "师生互动"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59c
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.base.chat.ConversationListActivity> r3 = com.bxkj.base.chat.ConversationListActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L59c:
            java.lang.String r0 = "体测准考证"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5b5
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.AdmissionTicketActivity> r3 = com.bxkj.student.home.physicaltest.AdmissionTicketActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L5b5:
            java.lang.String r0 = "体测排名"
            java.lang.String r1 = r8.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5ce
            android.content.Context r0 = r8.b
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r8.b
            java.lang.Class<com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity> r3 = com.bxkj.student.home.physicaltest.rank.PhysicalTestRankActivity.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L5ce:
            java.lang.String r0 = "暂未开放，敬请期待"
            r8.g(r0)
            return
    }

    public void g(java.lang.CharSequence r3) {
            r2 = this;
            android.widget.Toast r0 = r2.e
            if (r0 != 0) goto Le
            android.content.Context r0 = r2.b
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
            r2.e = r3
            goto L16
        Le:
            r0.cancel()
            android.widget.Toast r0 = r2.e
            r0.setText(r3)
        L16:
            android.widget.Toast r3 = r2.e
            r3.show()
            return
    }
}

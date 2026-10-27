package com.bxkj.student.run.app.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunRecorderListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.cardview.widget.CardView F0;
    private com.google.android.material.tabs.TabLayout G0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> H0;
    protected int I0;
    protected int J0;
    protected int K0;
    private int L0;
    private com.google.android.material.tabs.TabLayout.Tab M0;
    private com.google.android.material.tabs.TabLayout.Tab N0;
    private com.google.android.material.tabs.TabLayout.Tab O0;
    private com.google.android.material.tabs.TabLayout.OnTabSelectedListener P0;
    private java.text.SimpleDateFormat Q0;
    private com.bxkj.student.run.app.vm.RunVM R0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f1184k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f1185p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.run.app.record.RunRecorderListActivity$a$a, reason: collision with other inner class name */
        class C0135a implements kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> {
            final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity.a a;

            C0135a(com.bxkj.student.run.app.record.RunRecorderListActivity.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public kotlin.n1 a(java.util.List<com.bxkj.student.run.app.offline.table.RunDb> r3) {
                    r2 = this;
                    if (r3 == 0) goto L14
                    int r0 = r3.size()
                    if (r0 <= 0) goto L14
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r0 = r2.a
                    r1 = 0
                    java.lang.Object r3 = r3.get(r1)
                    com.bxkj.student.run.app.offline.table.RunDb r3 = (com.bxkj.student.run.app.offline.table.RunDb) r3
                    com.bxkj.student.run.app.record.RunRecorderListActivity.a.o(r0, r3)
                L14:
                    r3 = 0
                    return r3
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    r0 = this;
                    java.util.List r1 = (java.util.List) r1
                    kotlin.n1 r1 = r0.a(r1)
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb a;
            final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity.a b;

            b(com.bxkj.student.run.app.record.RunRecorderListActivity.a r1, com.bxkj.student.run.app.offline.table.RunDb r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            private void a(java.lang.String r3) {
                    r2 = this;
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r0 = r2.b
                    com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r0.k
                    com.bxkj.student.run.app.vm.RunVM r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.n0(r0)
                    com.bxkj.student.run.app.offline.table.RunDb r1 = r2.a
                    java.lang.String r1 = r1.getIdentify()
                    r0.v(r1)
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r0 = r2.b
                    com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r0.k
                    com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.l0(r0)
                    r0.D()
                    cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
                    java.lang.Class<com.bxkj.student.run.app.StartRunActivity> r1 = com.bxkj.student.run.app.StartRunActivity.class
                    android.app.Activity r0 = r0.getActivity(r1)
                    com.bxkj.student.run.app.StartRunActivity r0 = (com.bxkj.student.run.app.StartRunActivity) r0
                    if (r0 == 0) goto L2d
                    r0.m1()
                L2d:
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r1 = r2.b
                    android.content.Context r1 = com.bxkj.student.run.app.record.RunRecorderListActivity.a.p(r1)
                    r0.<init>(r1)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r0.setMessage(r3)
                    r3.show()
                    return
            }

            public void netOnFailure(java.lang.Throwable r3) {
                    r2 = this;
                    boolean r0 = r3 instanceof java.net.SocketTimeoutException
                    if (r0 == 0) goto L1f
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r0 = r2.b
                    android.content.Context r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.a.s(r0)
                    r3.<init>(r0)
                    java.lang.String r0 = "上传超时,请检查网络后重试"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                    java.lang.String r0 = "确定"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setOneButtonText(r0)
                    r3.show()
                    return
                L1f:
                    java.io.StringWriter r0 = new java.io.StringWriter
                    r0.<init>()
                    java.io.PrintWriter r1 = new java.io.PrintWriter
                    r1.<init>(r0)
                    r3.getClass()
                    r0.toString()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "上传失败,请稍后再试"
                    r0.<init>(r1)
                    java.lang.String r3 = r3.getMessage()
                    r0.append(r3)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r1 = r2.b
                    android.content.Context r1 = com.bxkj.student.run.app.record.RunRecorderListActivity.a.t(r1)
                    r3.<init>(r1)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                    r3.show()
                    return
            }

            public void netOnOtherStatus(int r2, java.lang.String r3) {
                    r1 = this;
                    super.netOnOtherStatus(r2, r3)
                    r0 = 202(0xca, float:2.83E-43)
                    if (r2 != r0) goto Lb
                    r1.a(r3)
                    return
                Lb:
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r0 = r1.b
                    android.content.Context r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.a.q(r0)
                    r2.<init>(r0)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                    r2.show()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                    r0 = this;
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
                    r0 = this;
                    super.netOnSuccess(r1, r2)
                    r0.a(r2)
                    return
            }

            public void netOnSuccessServerError(int r4, java.lang.String r5) {
                    r3 = this;
                    super.netOnSuccessServerError(r4, r5)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.record.RunRecorderListActivity$a r1 = r3.b
                    android.content.Context r1 = com.bxkj.student.run.app.record.RunRecorderListActivity.a.r(r1)
                    r0.<init>(r1)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "上传异常,错误码：【"
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = "】,错误信息："
                    r1.append(r4)
                    r1.append(r5)
                    java.lang.String r4 = ",请稍后再试！"
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r0.setMessage(r4)
                    r4.show()
                    return
            }
        }

        a(com.bxkj.student.run.app.record.RunRecorderListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.x(r1, r2)
                return
        }

        public static /* synthetic */ void n(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.w(r1, r2)
                return
        }

        static /* bridge */ /* synthetic */ void o(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0, com.bxkj.student.run.app.offline.table.RunDb r1) {
                r0.y(r1)
                return
        }

        static /* synthetic */ android.content.Context p(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context q(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context r(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context s(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context t(com.bxkj.student.run.app.record.RunRecorderListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        private int v(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = ","
                boolean r1 = android.text.TextUtils.isEmpty(r8)
                r2 = 0
                if (r1 == 0) goto La
                return r2
            La:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.lang.Object r3 = com.alibaba.fastjson.JSON.parse(r8)     // Catch: java.lang.Exception -> L1e
                boolean r3 = r3 instanceof com.alibaba.fastjson.JSONArray     // Catch: java.lang.Exception -> L1e
                if (r3 == 0) goto L20
                java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
                java.util.List r1 = com.alibaba.fastjson.JSON.parseArray(r8, r3)     // Catch: java.lang.Exception -> L1e
                goto L68
            L1e:
                goto L3b
            L20:
                java.lang.String[] r3 = r8.split(r0)     // Catch: java.lang.Exception -> L1e
                int r4 = r3.length     // Catch: java.lang.Exception -> L1e
                if (r4 <= 0) goto L68
                int r4 = r3.length     // Catch: java.lang.Exception -> L1e
                r5 = 0
            L29:
                if (r5 >= r4) goto L68
                r6 = r3[r5]     // Catch: java.lang.Exception -> L1e
                int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1e
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1e
                r1.add(r6)     // Catch: java.lang.Exception -> L1e
                int r5 = r5 + 1
                goto L29
            L3b:
                java.lang.String[] r8 = r8.split(r0)
                int r0 = r8.length
                if (r0 <= 0) goto L68
                int r0 = r8.length
                r3 = 0
            L44:
                if (r3 >= r0) goto L68
                r4 = r8[r3]
                if (r4 == 0) goto L5e
                java.lang.String r5 = "null"
                boolean r5 = r5.equalsIgnoreCase(r4)
                if (r5 != 0) goto L5e
                int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L65
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L65
                r1.add(r4)     // Catch: java.lang.NumberFormatException -> L65
                goto L65
            L5e:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r1.add(r4)
            L65:
                int r3 = r3 + 1
                goto L44
            L68:
                if (r1 == 0) goto L87
                int r8 = r1.size()
                if (r8 != 0) goto L71
                goto L87
            L71:
                r8 = 0
            L72:
                int r0 = r1.size()
                if (r2 >= r0) goto L86
                java.lang.Object r0 = r1.get(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                int r8 = r8 + r0
                int r2 = r2 + 1
                goto L72
            L86:
                return r8
            L87:
                return r2
        }

        private /* synthetic */ void w(java.util.Map r2, android.view.View r3) {
                r1 = this;
                java.lang.String r3 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r1.k
                com.bxkj.student.run.app.vm.RunVM r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.n0(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity$a$a r0 = new com.bxkj.student.run.app.record.RunRecorderListActivity$a$a
                r0.<init>(r1)
                r3.w(r2, r0)
                return
        }

        private /* synthetic */ void x(java.util.Map r4, android.view.View r5) {
                r3 = this;
                com.bxkj.student.run.app.record.RunRecorderListActivity r5 = r3.k
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.run.app.record.AppealActivity> r2 = com.bxkj.student.run.app.record.AppealActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                android.content.Intent r4 = r0.putExtra(r1, r4)
                r5.startActivity(r4)
                return
        }

        private void y(com.bxkj.student.run.app.offline.table.RunDb r30) {
                r29 = this;
                r0 = r29
                java.lang.String r1 = r30.getCountTime()
                long r1 = java.lang.Long.parseLong(r1)
                java.lang.String r3 = r30.getDistance()
                float r3 = java.lang.Float.parseFloat(r3)
                double r3 = (double) r3
                java.lang.String r16 = com.bxkj.student.run.app.utils.i.a(r3, r1)
                java.lang.String r17 = com.bxkj.student.run.app.utils.i.b(r3, r1)
                android.content.Context r5 = r0.e
                cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
                java.lang.String r6 = "正在上传..."
                cn.bluemobi.dylan.http.HttpRequest r5 = r5.setLoadingMessage(r6)
                cn.bluemobi.dylan.http.HttpRequest r5 = r5.hideSuccessMessage()
                r6 = 3
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
                cn.bluemobi.dylan.http.HttpRequest r5 = r5.setTimeout(r6, r8)
                java.lang.Class<com.bxkj.student.run.app.a> r6 = com.bxkj.student.run.app.a.class
                java.lang.Object r6 = cn.bluemobi.dylan.http.Http.getApiService(r6)
                com.bxkj.student.run.app.a r6 = (com.bxkj.student.run.app.a) r6
                com.bxkj.base.user.LoginUser r7 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r7 = r7.getUserId()
                java.lang.String r8 = r30.getSportsType()
                int r8 = java.lang.Integer.parseInt(r8)
                java.lang.String r9 = r30.getStartTime()
                long r9 = java.lang.Long.parseLong(r9)
                java.lang.String r11 = r30.getEndTime()
                long r11 = java.lang.Long.parseLong(r11)
                java.lang.String r13 = r30.getLatLngList()
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                r14 = 0
                if (r13 == 0) goto L68
                r13 = r14
                goto L6c
            L68:
                java.lang.String r13 = r30.getLatLngList()
            L6c:
                java.lang.String r15 = r30.getIdentify()
                java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
                java.lang.String r2 = com.bxkj.student.run.app.utils.i.d(r3)
                java.lang.String r3 = r30.getPassLatLngList()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L85
                r18 = r14
                goto L8b
            L85:
                java.lang.String r3 = r30.getPassLatLngList()
                r18 = r3
            L8b:
                java.lang.String r19 = com.bxkj.base.util.b0.d()
                java.lang.String r20 = com.bxkj.base.util.b0.e()
                java.lang.String r22 = com.bxkj.base.util.b0.c()
                android.content.Context r3 = r0.e
                java.lang.String r23 = com.bxkj.base.util.b0.h(r3)
                java.lang.String r3 = r30.getStepList()
                java.lang.String r24 = com.alibaba.fastjson.JSON.toJSONString(r3)
                java.lang.String r25 = r30.isFaceOut()
                java.lang.String r3 = r30.getPassLatLngList()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto Lb6
            Lb3:
                r26 = r14
                goto Lbb
            Lb6:
                java.lang.String r14 = r30.getPassLatLngList()
                goto Lb3
            Lbb:
                java.lang.String r3 = r30.getUploadType()
                int r3 = java.lang.Integer.parseInt(r3)
                java.lang.Integer r27 = java.lang.Integer.valueOf(r3)
                r28 = 0
                java.lang.String r21 = "Android"
                r14 = r1
                r1 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r10 = r11
                r12 = r13
                r13 = r15
                r15 = r2
                rx.e r2 = r5.l(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.setObservable(r2)
                com.bxkj.student.run.app.record.RunRecorderListActivity$a$b r2 = new com.bxkj.student.run.app.record.RunRecorderListActivity$a$b
                r3 = r30
                r2.<init>(r0, r3)
                r1.setDataListener(r2)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.u(r1, r2)
                return
        }

        public void u(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                int r0 = r6.f()
                r1 = 1
                int r0 = r0 + r1
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2 = 2131298991(0x7f090aaf, float:1.821597E38)
                r6.J(r2, r0)
                java.lang.String r0 = "sportRange"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131298881(0x7f090a41, float:1.8215748E38)
                r6.J(r2, r0)
                java.lang.String r0 = "sportTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131299159(0x7f090b57, float:1.8216312E38)
                r6.J(r2, r0)
                java.lang.String r0 = "startTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131299113(0x7f090b29, float:1.8216218E38)
                r6.J(r2, r0)
                java.lang.String r0 = "remark"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131299116(0x7f090b2c, float:1.8216224E38)
                r6.J(r2, r0)
                java.lang.String r0 = "stepNumbers"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                int r0 = r5.v(r0)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2 = 2131299118(0x7f090b2e, float:1.8216228E38)
                r6.J(r2, r0)
                java.lang.String r0 = "uploadType"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 == 0) goto L63
                java.lang.String r0 = ""
                goto L74
            L63:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "上传方式："
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L74:
                r2 = 2131299175(0x7f090b67, float:1.8216344E38)
                r6.J(r2, r0)
                java.lang.String r0 = "sportStatus"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r2 = 2131296684(0x7f0901ac, float:1.8211292E38)
                android.view.View r2 = r6.h(r2)
                androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
                java.lang.String r3 = "-1"
                boolean r3 = r3.equalsIgnoreCase(r0)
                r4 = 2131296585(0x7f090149, float:1.821109E38)
                if (r3 == 0) goto Lb7
                java.lang.String r0 = "上传"
                r6.J(r4, r0)
                r6.N(r4, r1)
                r6.n(r4, r1)
                com.bxkj.student.run.app.record.l r0 = new com.bxkj.student.run.app.record.l
                r0.<init>(r5, r7)
                r6.w(r4, r0)
                android.content.Context r7 = r5.e
                r0 = 2131100550(0x7f060386, float:1.7813485E38)
                int r7 = androidx.core.content.ContextCompat.getColor(r7, r0)
                r2.setCardBackgroundColor(r7)
                r7 = 2131689778(0x7f0f0132, float:1.900858E38)
                goto L101
            Lb7:
                java.lang.String r3 = "1"
                boolean r0 = r3.equals(r0)
                r3 = 2131099737(0x7f060059, float:1.7811836E38)
                if (r0 == 0) goto Ld3
                r7 = 0
                r6.N(r4, r7)
                android.content.Context r7 = r5.e
                int r7 = androidx.core.content.ContextCompat.getColor(r7, r3)
                r2.setCardBackgroundColor(r7)
                r7 = 2131231633(0x7f080391, float:1.8079353E38)
                goto L101
            Ld3:
                r6.N(r4, r1)
                java.lang.String r0 = "我要申诉"
                r6.J(r4, r0)
                java.lang.String r0 = "enable"
                boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r0)
                r6.n(r4, r0)
                java.lang.String r0 = "va"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r6.J(r4, r0)
                com.bxkj.student.run.app.record.m r0 = new com.bxkj.student.run.app.record.m
                r0.<init>(r5, r7)
                r6.w(r4, r0)
                android.content.Context r7 = r5.e
                int r7 = androidx.core.content.ContextCompat.getColor(r7, r3)
                r2.setCardBackgroundColor(r7)
                r7 = 2131231631(0x7f08038f, float:1.8079348E38)
            L101:
                r0 = 2131298577(0x7f090911, float:1.8215131E38)
                r6.l(r0, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements m2.e {
        final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity a;

        b(com.bxkj.student.run.app.record.RunRecorderListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.run.app.record.RunRecorderListActivity r5 = r4.a
                int r0 = r5.K0
                int r1 = r5.I0
                int r2 = r0 / r1
                int r3 = r5.J0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                r0 = 0
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.run.app.record.RunRecorderListActivity.l0(r5)
                r5.q0()
                com.bxkj.student.run.app.record.RunRecorderListActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.run.app.record.RunRecorderListActivity.C0(r5)
                java.lang.String r1 = "没有了"
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r0)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.J0 = r3
                r5.E0(r0)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.run.app.record.RunRecorderListActivity r2 = r1.a
                r0 = 1
                r2.J0 = r0
                r0 = 0
                r2.E0(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity a;

        c(com.bxkj.student.run.app.record.RunRecorderListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r2 = this;
                super.netOnFinish()
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.l0(r0)
                r1 = 0
                r0.x0(r1)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.l0(r0)
                r0.r0(r1)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r7) {
                r6 = this;
                java.lang.String r0 = "isShowMorningRun"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L4c
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout$Tab r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.q0(r0)
                if (r0 != 0) goto L4c
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.setTag(r4)
                com.bxkj.student.run.app.record.RunRecorderListActivity r4 = r6.a
                r5 = 2131952105(0x7f1301e9, float:1.9540643E38)
                java.lang.String r4 = r4.getString(r5)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r4)
                com.bxkj.student.run.app.record.RunRecorderListActivity.z0(r0, r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout$Tab r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.q0(r3)
                r0.addTab(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                r0.setVisibility(r1)
            L4c:
                java.lang.String r0 = "isShowSunRun"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                if (r0 != r2) goto L97
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout$Tab r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.r0(r0)
                if (r0 != 0) goto L97
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
                r4 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.setTag(r4)
                com.bxkj.student.run.app.record.RunRecorderListActivity r4 = r6.a
                r5 = 2131952426(0x7f13032a, float:1.9541294E38)
                java.lang.String r4 = r4.getString(r5)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r4)
                com.bxkj.student.run.app.record.RunRecorderListActivity.A0(r0, r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout$Tab r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.r0(r3)
                r0.addTab(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                r0.setVisibility(r1)
            L97:
                java.lang.String r0 = "isShowFreedom"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                if (r0 != r2) goto Le2
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout$Tab r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.p0(r0)
                if (r0 != 0) goto Le2
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.newTab()
                r4 = 3
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.setTag(r4)
                com.bxkj.student.run.app.record.RunRecorderListActivity r4 = r6.a
                r5 = 2131951909(0x7f130125, float:1.9540246E38)
                java.lang.String r4 = r4.getString(r5)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r4)
                com.bxkj.student.run.app.record.RunRecorderListActivity.y0(r0, r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout$Tab r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.p0(r3)
                r0.addTab(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                r0.setVisibility(r1)
            Le2:
                r0 = 0
            Le3:
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r3)
                int r3 = r3.getTabCount()
                if (r0 >= r3) goto L11d
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r3)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.getTabAt(r0)
                java.lang.Object r3 = r3.getTag()
                java.lang.String r3 = r3.toString()
                int r3 = java.lang.Integer.parseInt(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r4 = r6.a
                int r4 = com.bxkj.student.run.app.record.RunRecorderListActivity.m0(r4)
                if (r3 != r4) goto L11a
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r3)
                com.google.android.material.tabs.TabLayout$Tab r3 = r3.getTabAt(r0)
                r3.select()
            L11a:
                int r0 = r0 + 1
                goto Le3
            L11d:
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                com.google.android.material.tabs.TabLayout r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.s0(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r6.a
                com.google.android.material.tabs.TabLayout$OnTabSelectedListener r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.k0(r3)
                r0.addOnTabSelectedListener(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                androidx.cardview.widget.CardView r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.i0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                java.lang.String r1 = "total"
                java.lang.String r3 = cn.bluemobi.dylan.base.utils.u.O(r7, r1)
                int r3 = java.lang.Integer.parseInt(r3)
                r0.K0 = r3
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.t0(r0)
                java.lang.String r3 = "count"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r0.setText(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.v0(r0)
                java.lang.String r3 = "succeed"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r0.setText(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.u0(r0)
                java.lang.String r3 = "noSucceed"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r3)
                r0.setText(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                android.widget.TextView r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.t0(r0)
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r1)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.setText(r1)
                java.lang.String r0 = "data"
                java.lang.Object r7 = r7.get(r0)
                java.util.List r7 = (java.util.List) r7
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                int r1 = r0.J0
                if (r1 != r2) goto L198
                com.bxkj.student.run.app.record.RunRecorderListActivity.w0(r0, r7)
                com.bxkj.student.run.app.record.RunRecorderListActivity r7 = r6.a
                com.bxkj.student.run.app.record.RunRecorderListActivity.B0(r7)
                goto L19f
            L198:
                java.util.List r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r0)
                r0.addAll(r7)
            L19f:
                com.bxkj.student.run.app.record.RunRecorderListActivity r7 = r6.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r7 = com.bxkj.student.run.app.record.RunRecorderListActivity.h0(r7)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r6.a
                java.util.List r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r0)
                r7.g(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> {
        final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity a;

        d(com.bxkj.student.run.app.record.RunRecorderListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.n1 a(java.util.List<com.bxkj.student.run.app.offline.table.RunDb> r6) {
                r5 = this;
                if (r6 == 0) goto Lb8
                int r0 = r6.size()
                if (r0 <= 0) goto Lb8
                java.util.Iterator r6 = r6.iterator()
            Lc:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto Lb8
                java.lang.Object r0 = r6.next()
                com.bxkj.student.run.app.offline.table.RunDb r0 = (com.bxkj.student.run.app.offline.table.RunDb) r0
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.String r2 = "id"
                java.lang.String r3 = r0.getIdentify()
                r1.put(r2, r3)
                java.lang.String r2 = "sportStatus"
                java.lang.String r3 = "-1"
                r1.put(r2, r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r2 = r5.a
                java.text.SimpleDateFormat r2 = com.bxkj.student.run.app.record.RunRecorderListActivity.o0(r2)
                java.lang.String r3 = r0.getStartTime()
                long r3 = java.lang.Long.parseLong(r3)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r2 = r2.format(r3)
                java.lang.String r3 = "startTime"
                r1.put(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.getDistance()
                double r3 = java.lang.Double.parseDouble(r3)
                java.lang.String r3 = com.bxkj.student.run.app.utils.i.d(r3)
                r2.append(r3)
                java.lang.String r3 = "KM"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "sportRange"
                r1.put(r3, r2)
                java.lang.String r2 = r0.getCountTime()
                long r2 = java.lang.Long.parseLong(r2)
                java.lang.String r2 = com.bxkj.student.run.app.utils.i.g(r2)
                java.lang.String r3 = "sportTime"
                r1.put(r3, r2)
                java.lang.String r2 = "stepNumbers"
                java.lang.String r0 = r0.getStepList()
                r1.put(r2, r0)
                java.lang.String r0 = "remark"
                java.lang.String r2 = "该条跑步记录在本地暂存,请尽快上传"
                r1.put(r0, r2)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r5.a
                java.util.List r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r0)
                if (r0 != 0) goto L9d
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r5.a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.bxkj.student.run.app.record.RunRecorderListActivity.w0(r0, r2)
            L9d:
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r5.a
                java.util.List r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r0)
                r2 = 0
                r0.add(r2, r1)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.h0(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r1 = r5.a
                java.util.List r1 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r1)
                r0.g(r1)
                goto Lc
            Lb8:
                r6 = 0
                return r6
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                kotlin.n1 r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        final /* synthetic */ com.bxkj.student.run.app.record.RunRecorderListActivity a;

        e(com.bxkj.student.run.app.record.RunRecorderListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
                r2 = this;
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r2.a
                java.lang.Object r3 = r3.getTag()
                java.lang.String r3 = r3.toString()
                int r3 = java.lang.Integer.parseInt(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity.x0(r0, r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r2.a
                androidx.cardview.widget.CardView r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.i0(r3)
                r0 = 8
                r3.setVisibility(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r3)
                if (r3 == 0) goto L2d
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r2.a
                java.util.List r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r3)
                r3.clear()
            L2d:
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.h0(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.h0(r0)
                int r0 = r0.getItemCount()
                r1 = 0
                r3.notifyItemRangeRemoved(r1, r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.run.app.record.RunRecorderListActivity.h0(r3)
                com.bxkj.student.run.app.record.RunRecorderListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.run.app.record.RunRecorderListActivity.j0(r0)
                r3.g(r0)
                com.bxkj.student.run.app.record.RunRecorderListActivity r3 = r2.a
                r0 = 1
                r3.J0 = r0
                r3.E0(r0)
                return
        }

        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    public RunRecorderListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.H0 = r0
            r0 = 10
            r1.I0 = r0
            r0 = 1
            r1.J0 = r0
            r1.K0 = r0
            r0 = 2
            r1.L0 = r0
            return
    }

    static /* bridge */ /* synthetic */ void A0(com.bxkj.student.run.app.record.RunRecorderListActivity r0, com.google.android.material.tabs.TabLayout.Tab r1) {
            r0.N0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void B0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            r0.F0()
            return
    }

    static /* synthetic */ android.content.Context C0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static java.lang.String D0(long r10) {
            r0 = 3600(0xe10, double:1.7786E-320)
            long r2 = r10 / r0
            java.lang.String r4 = "0"
            java.lang.String r5 = ""
            r6 = 9
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r5)
        L19:
            java.lang.String r2 = r8.toString()
            goto L2a
        L1e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r2)
            goto L19
        L2a:
            long r10 = r10 % r0
            r0 = 60
            long r8 = r10 / r0
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 <= 0) goto L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r5)
        L3e:
            java.lang.String r3 = r3.toString()
            goto L4f
        L43:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r8)
            goto L3e
        L4f:
            long r10 = r10 % r0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r5)
        L5f:
            java.lang.String r10 = r0.toString()
            goto L70
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            goto L5f
        L70:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r0 = ":"
            r11.append(r0)
            r11.append(r3)
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
    }

    private void F0() {
            r3 = this;
            com.bxkj.student.run.app.vm.RunVM r0 = r3.R0
            int r1 = r3.L0
            com.bxkj.student.run.app.record.RunRecorderListActivity$d r2 = new com.bxkj.student.run.app.record.RunRecorderListActivity$d
            r2.<init>(r3)
            r0.y(r1, r2)
            return
    }

    private /* synthetic */ void H0(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
            r1 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r1.a0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "sportStatus"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r3 = "-1"
            boolean r2 = r3.equalsIgnoreCase(r2)
            java.lang.Class<com.bxkj.student.run.app.record.RunDetailActivity> r3 = com.bxkj.student.run.app.record.RunDetailActivity.class
            java.lang.String r4 = "id"
            if (r2 == 0) goto L37
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r1.a0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r5 = r1.V
            r4.<init>(r5, r3)
            java.lang.String r3 = "runDataDbId"
            android.content.Intent r2 = r4.putExtra(r3, r2)
            r1.startActivity(r2)
            return
        L37:
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r0 = r1.V
            r2.<init>(r0, r3)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r3 = r1.a0
            java.lang.Object r3 = r3.getItem(r5)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
            java.lang.String r4 = "sportRecordId"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            r1.startActivity(r2)
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.record.RunRecorderListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.H0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.cardview.widget.CardView i0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            androidx.cardview.widget.CardView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout.OnTabSelectedListener k0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.google.android.material.tabs.TabLayout$OnTabSelectedListener r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            int r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.vm.RunVM n0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.bxkj.student.run.app.vm.RunVM r0 = r0.R0
            return r0
    }

    static /* bridge */ /* synthetic */ java.text.SimpleDateFormat o0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            java.text.SimpleDateFormat r0 = r0.Q0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout.Tab p0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.O0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout.Tab q0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout.Tab r0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.N0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.material.tabs.TabLayout s0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView t0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView u0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            android.widget.TextView r0 = r0.f1185p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView v0(com.bxkj.student.run.app.record.RunRecorderListActivity r0) {
            android.widget.TextView r0 = r0.f1184k0
            return r0
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.run.app.record.RunRecorderListActivity r0, java.util.List r1) {
            r0.H0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.run.app.record.RunRecorderListActivity r0, int r1) {
            r0.L0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void y0(com.bxkj.student.run.app.record.RunRecorderListActivity r0, com.google.android.material.tabs.TabLayout.Tab r1) {
            r0.O0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void z0(com.bxkj.student.run.app.record.RunRecorderListActivity r0, com.google.android.material.tabs.TabLayout.Tab r1) {
            r0.M0 = r1
            return
    }

    public void E0(boolean r6) {
            r5 = this;
            java.lang.Class<com.bxkj.student.run.app.a> r0 = com.bxkj.student.run.app.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.run.app.a r0 = (com.bxkj.student.run.app.a) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            int r2 = r5.L0
            int r3 = r5.J0
            int r4 = r5.I0
            rx.e r0 = r0.g(r1, r2, r3, r4)
            android.content.Context r1 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r6 = r1.setShowLoadingDialog(r6)
            cn.bluemobi.dylan.http.HttpRequest r6 = r6.setObservable(r0)
            com.bxkj.student.run.app.record.RunRecorderListActivity$c r0 = new com.bxkj.student.run.app.record.RunRecorderListActivity$c
            r0.<init>(r5)
            r6.setDataListener(r0)
            return
    }

    public void G0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.run.app.record.RunRecorderListActivity$b r1 = new com.bxkj.student.run.app.record.RunRecorderListActivity$b
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    public void I0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.Y
            r0.D()
            return
    }

    public void L() {
            r1 = this;
            com.bxkj.student.run.app.record.RunRecorderListActivity$e r0 = new com.bxkj.student.run.app.record.RunRecorderListActivity$e
            r0.<init>(r1)
            r1.P0 = r0
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493011(0x7f0c0093, float:1.860949E38)
            return r0
    }

    public void R() {
            r4 = this;
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r0.<init>(r4)
            java.lang.Class<com.bxkj.student.run.app.vm.RunVM> r1 = com.bxkj.student.run.app.vm.RunVM.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bxkj.student.run.app.vm.RunVM r0 = (com.bxkj.student.run.app.vm.RunVM) r0
            r4.R0 = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "runType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L26
            android.content.Intent r0 = r4.getIntent()
            r2 = 2
            int r0 = r0.getIntExtra(r1, r2)
            r4.L0 = r0
        L26:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            r4.Q0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.run.app.record.RunRecorderListActivity$a r0 = new com.bxkj.student.run.app.record.RunRecorderListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493313(0x7f0c01c1, float:1.8610103E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.H0
            r0.<init>(r4, r1, r2, r3)
            r4.a0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.b0
            r0.setEmptyView(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.a0
            com.bxkj.student.run.app.record.k r1 = new com.bxkj.student.run.app.record.k
            r1.<init>(r4)
            r0.k(r1)
            r4.G0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r0.D()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "跑步记录"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            r1 = 2131298848(0x7f090a20, float:1.821568E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131299201(0x7f090b81, float:1.8216397E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1184k0 = r1
            r1 = 2131298991(0x7f090aaf, float:1.821597E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f1185p0 = r1
            r1 = 2131298695(0x7f090987, float:1.821537E38)
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r0.G0 = r1
            r1 = 2131296688(0x7f0901b0, float:1.82113E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r0.F0 = r1
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            return
    }
}

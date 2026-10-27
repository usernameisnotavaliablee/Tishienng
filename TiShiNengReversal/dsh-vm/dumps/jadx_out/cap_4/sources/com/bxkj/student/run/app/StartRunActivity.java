package com.bxkj.student.run.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StartRunActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private com.bxkj.student.run.app.record.Card F0;
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog G0;
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog H0;
    private com.bxkj.student.run.app.vm.RunVM I0;
    private com.amap.api.maps.MapView Y;
    private com.amap.api.maps.AMap Z;
    private android.widget.Button a0;
    private com.bxkj.student.run.app.ready.RunTypeDialog b0;
    private com.bxkj.base.view.ViewSwitcher c0;

    /* renamed from: k0, reason: collision with root package name */
    private com.bxkj.student.run.app.record.Card f1149k0;

    /* renamed from: p0, reason: collision with root package name */
    private com.bxkj.student.run.app.record.Card f1150p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb a;
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity b;

        a(com.bxkj.student.run.app.StartRunActivity r1, com.bxkj.student.run.app.offline.table.RunDb r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.run.app.StartRunActivity.a r0, com.bxkj.student.run.app.offline.table.RunDb r1, android.view.View r2) {
                r0.b(r1, r2)
                return
        }

        private /* synthetic */ void b(com.bxkj.student.run.app.offline.table.RunDb r3, android.view.View r4) {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r4 = r2.b
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = com.bxkj.student.run.app.StartRunActivity.s0(r4)
                r1 = 3
                com.bxkj.student.run.app.StartRunActivity.B0(r4, r3, r0, r1)
                return
        }

        public void netOnOtherStatus(int r3, java.lang.String r4) {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r2.b
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = com.bxkj.student.run.app.StartRunActivity.s0(r0)
                r0.dismiss()
                r0 = 201(0xc9, float:2.82E-43)
                if (r3 != r0) goto L31
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.N0(r0)
                r3.<init>(r0)
                r0 = 0
                r3.setCanceledOnTouchOutside(r0)
                r3.setCancelable(r0)
                com.bxkj.student.run.app.offline.table.RunDb r0 = r2.a
                com.bxkj.student.run.app.i0 r1 = new com.bxkj.student.run.app.i0
                r1.<init>(r2, r0)
                r3.setButtonOnClickListener(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
                r3.show()
                return
            L31:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.P0(r0)
                r3.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
                r3.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r3 = r2.b
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = com.bxkj.student.run.app.StartRunActivity.s0(r3)
                r3.dismiss()
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                com.bxkj.student.run.app.offline.table.RunDb r0 = r2.a
                java.lang.String r0 = r0.getIdentify()
                java.lang.String r1 = "runExceptionDataDBId"
                r3.putExtra(r1, r0)
                com.bxkj.student.run.app.StartRunActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.Q0(r0)
                java.lang.Class<com.bxkj.student.run.app.RunningActivity> r1 = com.bxkj.student.run.app.RunningActivity.class
                r3.setClass(r0, r1)
                com.bxkj.student.run.app.StartRunActivity r0 = r2.b
                r0.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements kotlin.jvm.functions.Function0<kotlin.n1> {
        final /* synthetic */ float a;
        final /* synthetic */ long b;
        final /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb c;
        final /* synthetic */ int d;
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog e;
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.run.app.StartRunActivity.b a;

            a(com.bxkj.student.run.app.StartRunActivity.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public static /* synthetic */ void a(com.bxkj.student.run.app.StartRunActivity.b.a r0, android.view.View r1) {
                    r0.f(r1)
                    return
            }

            public static /* synthetic */ void b(com.bxkj.student.run.app.StartRunActivity.b.a r0, android.view.View r1) {
                    r0.e(r1)
                    return
            }

            public static /* synthetic */ void c(com.bxkj.student.run.app.StartRunActivity.b.a r0, android.view.View r1) {
                    r0.d(r1)
                    return
            }

            private /* synthetic */ void d(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.run.app.StartRunActivity$b r1 = r0.a
                    com.bxkj.student.run.app.StartRunActivity r1 = r1.f
                    com.bxkj.student.run.app.StartRunActivity.y0(r1)
                    return
            }

            private /* synthetic */ void e(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.run.app.StartRunActivity$b r1 = r0.a
                    com.bxkj.student.run.app.StartRunActivity r1 = r1.f
                    com.bxkj.student.run.app.StartRunActivity.y0(r1)
                    return
            }

            private /* synthetic */ void f(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.run.app.StartRunActivity$b r1 = r0.a
                    com.bxkj.student.run.app.StartRunActivity r1 = r1.f
                    com.bxkj.student.run.app.StartRunActivity.y0(r1)
                    return
            }

            private void g(java.lang.String r3) {
                    r2 = this;
                    com.bxkj.student.run.app.StartRunActivity$b r0 = r2.a
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.e
                    if (r0 == 0) goto L9
                    r0.dismiss()
                L9:
                    com.bxkj.student.run.app.StartRunActivity$b r0 = r2.a
                    com.bxkj.student.run.app.StartRunActivity r0 = r0.f
                    r0.m1()
                    com.bxkj.student.run.app.StartRunActivity$b r0 = r2.a
                    com.bxkj.student.run.app.StartRunActivity r0 = r0.f
                    com.bxkj.student.run.app.vm.RunVM r0 = com.bxkj.student.run.app.StartRunActivity.t0(r0)
                    com.bxkj.student.run.app.StartRunActivity$b r1 = r2.a
                    com.bxkj.student.run.app.offline.table.RunDb r1 = r1.c
                    java.lang.String r1 = r1.getIdentify()
                    r0.v(r1)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.StartRunActivity$b r1 = r2.a
                    com.bxkj.student.run.app.StartRunActivity r1 = r1.f
                    android.content.Context r1 = com.bxkj.student.run.app.StartRunActivity.C0(r1)
                    r0.<init>(r1)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r0.setMessage(r3)
                    com.bxkj.student.run.app.l0 r0 = new com.bxkj.student.run.app.l0
                    r0.<init>(r2)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r0)
                    r3.show()
                    return
            }

            public void netOnFailure(java.lang.Throwable r2) {
                    r1 = this;
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.StartRunActivity$b r0 = r1.a
                    com.bxkj.student.run.app.StartRunActivity r0 = r0.f
                    android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.O0(r0)
                    r2.<init>(r0)
                    java.lang.String r0 = "提交异常，已为您暂存本地，请稍后在本地跑步记录中重新上传！"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                    r0 = 0
                    r2.setCanceledOnTouchOutside(r0)
                    r2.setCancelable(r0)
                    com.bxkj.student.run.app.k0 r0 = new com.bxkj.student.run.app.k0
                    r0.<init>(r1)
                    r2.setButtonOnClickListener(r0)
                    r2.show()
                    return
            }

            public void netOnOtherStatus(int r2, java.lang.String r3) {
                    r1 = this;
                    super.netOnOtherStatus(r2, r3)
                    r0 = 202(0xca, float:2.83E-43)
                    if (r2 != r0) goto Lb
                    r1.g(r3)
                    return
                Lb:
                    java.lang.Exception r2 = new java.lang.Exception
                    java.lang.String r3 = "上传失败"
                    r2.<init>(r3)
                    r1.netOnFailure(r2)
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                    r0 = this;
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2) {
                    r0 = this;
                    super.netOnSuccess(r1, r2)
                    r0.g(r2)
                    return
            }

            public void netOnSuccessServerError(int r1, java.lang.String r2) {
                    r0 = this;
                    super.netOnSuccessServerError(r1, r2)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.run.app.StartRunActivity$b r2 = r0.a
                    com.bxkj.student.run.app.StartRunActivity r2 = r2.f
                    android.content.Context r2 = com.bxkj.student.run.app.StartRunActivity.D0(r2)
                    r1.<init>(r2)
                    java.lang.String r2 = "提交异常，已为您暂存本地，请稍后在本地跑步记录中重新上传！"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
                    r2 = 0
                    r1.setCanceledOnTouchOutside(r2)
                    r1.setCancelable(r2)
                    com.bxkj.student.run.app.j0 r2 = new com.bxkj.student.run.app.j0
                    r2.<init>(r0)
                    r1.setButtonOnClickListener(r2)
                    r1.show()
                    return
            }
        }

        b(com.bxkj.student.run.app.StartRunActivity r1, float r2, long r3, com.bxkj.student.run.app.offline.table.RunDb r5, int r6, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r7) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.d = r6
                r0.e = r7
                r0.<init>()
                return
        }

        public kotlin.n1 a() {
                r30 = this;
                r0 = r30
                float r1 = r0.a
                double r1 = (double) r1
                long r3 = r0.b
                java.lang.String r16 = com.bxkj.student.run.app.utils.i.a(r1, r3)
                float r1 = r0.a
                double r1 = (double) r1
                long r3 = r0.b
                java.lang.String r17 = com.bxkj.student.run.app.utils.i.b(r1, r3)
                com.bxkj.student.run.app.StartRunActivity r1 = r0.f
                android.content.Context r1 = com.bxkj.student.run.app.StartRunActivity.S0(r1)
                cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
                java.lang.String r2 = "正在上传..."
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.setLoadingMessage(r2)
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
                r2 = 0
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.setCanCancel(r2)
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideSuccessMessage()
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideFailMessage()
                java.lang.Class<com.bxkj.student.run.app.a> r2 = com.bxkj.student.run.app.a.class
                java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
                r5 = r2
                com.bxkj.student.run.app.a r5 = (com.bxkj.student.run.app.a) r5
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r6 = r2.getUserId()
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getSportsType()
                int r7 = java.lang.Integer.parseInt(r2)
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getStartTime()
                long r8 = java.lang.Long.parseLong(r2)
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getEndTime()
                long r10 = java.lang.Long.parseLong(r2)
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getLatLngList()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L72
                r12 = 0
                goto L79
            L72:
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getLatLngList()
                r12 = r2
            L79:
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r13 = r2.getIdentify()
                long r14 = r0.b
                java.lang.String r14 = com.bxkj.student.run.app.utils.i.g(r14)
                float r2 = r0.a
                r29 = 0
                double r3 = (double) r2
                java.lang.String r15 = com.bxkj.student.run.app.utils.i.d(r3)
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getPassLatLngList()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L9d
                r18 = r29
                goto La5
            L9d:
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getPassLatLngList()
                r18 = r2
            La5:
                java.lang.String r19 = com.bxkj.base.util.b0.d()
                java.lang.String r20 = com.bxkj.base.util.b0.e()
                java.lang.String r22 = com.bxkj.base.util.b0.c()
                com.bxkj.student.run.app.StartRunActivity r2 = r0.f
                android.content.Context r2 = com.bxkj.student.run.app.StartRunActivity.R0(r2)
                java.lang.String r23 = com.bxkj.base.util.b0.h(r2)
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r24 = r2.getStepList()
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r25 = r2.isFaceOut()
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getPassLatLngList()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto Ld6
                r26 = r29
                goto Lde
            Ld6:
                com.bxkj.student.run.app.offline.table.RunDb r2 = r0.c
                java.lang.String r2 = r2.getPassLatLngList()
                r26 = r2
            Lde:
                int r2 = r0.d
                java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
                r28 = 0
                java.lang.String r21 = "Android"
                rx.e r2 = r5.l(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.setObservable(r2)
                com.bxkj.student.run.app.StartRunActivity$b$a r2 = new com.bxkj.student.run.app.StartRunActivity$b$a
                r2.<init>(r0)
                r1.setDataListener(r2)
                return r29
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                kotlin.n1 r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements s.b.a {
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity a;

        c(com.bxkj.student.run.app.StartRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r0 = this;
                return
        }

        @Override // s.b.a
        public void b(@androidx.annotation.NonNull java.lang.String[] r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.U0(r0)
                r3.<init>(r0)
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 2131952329(0x7f1302c9, float:1.9541098E38)
                java.lang.String r0 = r0.getString(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }

        @Override // s.b.a
        public void c(@androidx.annotation.NonNull java.lang.String[] r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.T0(r0)
                r3.<init>(r0)
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 2131952329(0x7f1302c9, float:1.9541098E38)
                java.lang.String r0 = r0.getString(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity a;

        d(com.bxkj.student.run.app.StartRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r1 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r1.a
                androidx.fragment.app.FragmentActivity r0 = com.bxkj.student.run.app.StartRunActivity.V0(r0)
                com.bxkj.base.util.u.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements s.b.a {
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity a;

        e(com.bxkj.student.run.app.StartRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void d(com.bxkj.student.run.app.StartRunActivity.e r0) {
                r0.e()
                return
        }

        private /* synthetic */ void e() {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "android.settings.LOCATION_SOURCE_SETTINGS"
                r0.setAction(r1)
                com.bxkj.student.run.app.StartRunActivity r1 = r2.a
                r1.startActivity(r0)
                return
        }

        @Override // s.b.a
        public void a() {
                r3 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r3.a
                java.lang.String r1 = "location"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.location.LocationManager r0 = (android.location.LocationManager) r0
                java.lang.String r1 = "gps"
                boolean r0 = r0.isProviderEnabled(r1)
                if (r0 != 0) goto L3d
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.run.app.StartRunActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.run.app.StartRunActivity.W0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "GPS未开启"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setTitle(r1)
                com.bxkj.student.run.app.StartRunActivity r1 = r3.a
                r2 = 2131952332(0x7f1302cc, float:1.9541104E38)
                java.lang.String r1 = r1.getString(r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
                com.bxkj.student.run.app.m0 r1 = new com.bxkj.student.run.app.m0
                r1.<init>(r3)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
                r0.show()
                return
            L3d:
                com.bxkj.student.run.app.StartRunActivity r0 = r3.a
                com.bxkj.student.run.app.StartRunActivity.z0(r0)
                return
        }

        @Override // s.b.a
        public void b(@androidx.annotation.NonNull java.lang.String[] r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.E0(r0)
                r3.<init>(r0)
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 2131952329(0x7f1302c9, float:1.9541098E38)
                java.lang.String r0 = r0.getString(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }

        @Override // s.b.a
        public void c(@androidx.annotation.NonNull java.lang.String[] r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.X0(r0)
                r3.<init>(r0)
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 2131952329(0x7f1302c9, float:1.9541098E38)
                java.lang.String r0 = r0.getString(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity a;

        f(com.bxkj.student.run.app.StartRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r1.a
                r0.s1(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements com.bxkj.student.run.app.ready.RunTypeDialog.a {
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity a;

        g(com.bxkj.student.run.app.StartRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.run.app.ready.RunTypeDialog.a
        public void a() {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 4
                com.bxkj.student.run.app.StartRunActivity.A0(r0, r1)
                return
        }

        @Override // com.bxkj.student.run.app.ready.RunTypeDialog.a
        public void b() {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 3
                com.bxkj.student.run.app.StartRunActivity.A0(r0, r1)
                return
        }

        @Override // com.bxkj.student.run.app.ready.RunTypeDialog.a
        public void c() {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 1
                com.bxkj.student.run.app.StartRunActivity.A0(r0, r1)
                return
        }

        @Override // com.bxkj.student.run.app.ready.RunTypeDialog.a
        public void d() {
                r2 = this;
                com.bxkj.student.run.app.StartRunActivity r0 = r2.a
                r1 = 2
                com.bxkj.student.run.app.StartRunActivity.A0(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity b;

        h(com.bxkj.student.run.app.StartRunActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)     // Catch: java.lang.Exception -> L34
                java.lang.Class<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean> r0 = com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.class
                java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject(r4, r0)     // Catch: java.lang.Exception -> L34
                com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r4 = (com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean) r4     // Catch: java.lang.Exception -> L34
                int r0 = r3.a     // Catch: java.lang.Exception -> L34
                r4.setRunType(r0)     // Catch: java.lang.Exception -> L34
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L34
                com.bxkj.student.run.app.StartRunActivity r1 = r3.b     // Catch: java.lang.Exception -> L34
                android.content.Context r1 = com.bxkj.student.run.app.StartRunActivity.F0(r1)     // Catch: java.lang.Exception -> L34
                java.lang.Class<com.bxkj.student.run.app.ready.RunDescriptionActivity> r2 = com.bxkj.student.run.app.ready.RunDescriptionActivity.class
                r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L34
                java.lang.String r1 = "dataBean"
                r0.putExtra(r1, r4)     // Catch: java.lang.Exception -> L34
                com.bxkj.student.run.app.StartRunActivity r4 = r3.b     // Catch: java.lang.Exception -> L34
                r4.startActivity(r0)     // Catch: java.lang.Exception -> L34
                com.bxkj.student.run.app.StartRunActivity r4 = r3.b     // Catch: java.lang.Exception -> L34
                r0 = 2130771987(0x7f010013, float:1.714708E38)
                r1 = 2130771986(0x7f010012, float:1.7147078E38)
                r4.overridePendingTransition(r0, r1)     // Catch: java.lang.Exception -> L34
                return
            L34:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.StartRunActivity r0 = r3.b
                android.content.Context r0 = com.bxkj.student.run.app.StartRunActivity.G0(r0)
                r4.<init>(r0)
                java.lang.String r0 = "跑步设置异常,请联系管理员"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
                r4.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.StartRunActivity a;

        i(com.bxkj.student.run.app.StartRunActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r12) {
                r11 = this;
                java.lang.String r0 = "morningRun"
                java.util.Map r0 = cn.bluemobi.dylan.http.JsonParse.getMap(r12, r0)
                java.lang.String r1 = "isShow"
                java.lang.String r2 = "runSportRange"
                java.lang.String r3 = "succeed"
                r4 = 1
                if (r0 == 0) goto L79
                boolean r5 = r0.isEmpty()
                if (r5 != 0) goto L79
                int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r3)
                double r6 = cn.bluemobi.dylan.http.JsonParse.getDouble(r0, r2)
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
                com.bxkj.student.run.app.StartRunActivity r8 = r11.a
                com.bxkj.student.run.app.record.Card r8 = com.bxkj.student.run.app.StartRunActivity.p0(r8)
                if (r8 != 0) goto L5f
                if (r0 != r4) goto L5f
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r8 = new com.bxkj.student.run.app.record.Card
                com.bxkj.student.run.app.StartRunActivity r9 = r11.a
                android.content.Context r9 = com.bxkj.student.run.app.StartRunActivity.I0(r9)
                r8.<init>(r9)
                com.bxkj.student.run.app.record.Card r8 = r8.f(r4)
                com.bxkj.student.run.app.StartRunActivity r9 = r11.a
                android.content.Context r9 = com.bxkj.student.run.app.StartRunActivity.H0(r9)
                r10 = 2131099711(0x7f06003f, float:1.7811783E38)
                int r9 = androidx.core.content.ContextCompat.getColor(r9, r10)
                com.bxkj.student.run.app.record.Card r8 = r8.e(r9)
                com.bxkj.student.run.app.StartRunActivity.v0(r0, r8)
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.base.view.ViewSwitcher r0 = com.bxkj.student.run.app.StartRunActivity.u0(r0)
                com.bxkj.student.run.app.StartRunActivity r8 = r11.a
                com.bxkj.student.run.app.record.Card r8 = com.bxkj.student.run.app.StartRunActivity.p0(r8)
                r0.addView(r8)
            L5f:
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r0 = com.bxkj.student.run.app.StartRunActivity.p0(r0)
                if (r0 == 0) goto L79
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r0 = com.bxkj.student.run.app.StartRunActivity.p0(r0)
                r0.setCount(r5)
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r0 = com.bxkj.student.run.app.StartRunActivity.p0(r0)
                r0.setDistance(r6)
            L79:
                java.lang.String r0 = "sunRun"
                java.util.Map r0 = cn.bluemobi.dylan.http.JsonParse.getMap(r12, r0)
                if (r0 == 0) goto Lec
                boolean r5 = r0.isEmpty()
                if (r5 != 0) goto Lec
                int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r3)
                double r6 = cn.bluemobi.dylan.http.JsonParse.getDouble(r0, r2)
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
                com.bxkj.student.run.app.StartRunActivity r8 = r11.a
                com.bxkj.student.run.app.record.Card r8 = com.bxkj.student.run.app.StartRunActivity.q0(r8)
                if (r8 != 0) goto Ld2
                if (r0 != r4) goto Ld2
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r8 = new com.bxkj.student.run.app.record.Card
                com.bxkj.student.run.app.StartRunActivity r9 = r11.a
                android.content.Context r9 = com.bxkj.student.run.app.StartRunActivity.K0(r9)
                r8.<init>(r9)
                r9 = 2
                com.bxkj.student.run.app.record.Card r8 = r8.f(r9)
                com.bxkj.student.run.app.StartRunActivity r9 = r11.a
                android.content.Context r9 = com.bxkj.student.run.app.StartRunActivity.J0(r9)
                r10 = 2131099712(0x7f060040, float:1.7811785E38)
                int r9 = androidx.core.content.ContextCompat.getColor(r9, r10)
                com.bxkj.student.run.app.record.Card r8 = r8.e(r9)
                com.bxkj.student.run.app.StartRunActivity.w0(r0, r8)
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.base.view.ViewSwitcher r0 = com.bxkj.student.run.app.StartRunActivity.u0(r0)
                com.bxkj.student.run.app.StartRunActivity r8 = r11.a
                com.bxkj.student.run.app.record.Card r8 = com.bxkj.student.run.app.StartRunActivity.q0(r8)
                r0.addView(r8)
            Ld2:
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r0 = com.bxkj.student.run.app.StartRunActivity.q0(r0)
                if (r0 == 0) goto Lec
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r0 = com.bxkj.student.run.app.StartRunActivity.q0(r0)
                r0.setCount(r5)
                com.bxkj.student.run.app.StartRunActivity r0 = r11.a
                com.bxkj.student.run.app.record.Card r0 = com.bxkj.student.run.app.StartRunActivity.q0(r0)
                r0.setDistance(r6)
            Lec:
                java.lang.String r0 = "freedom"
                java.util.Map r12 = cn.bluemobi.dylan.http.JsonParse.getMap(r12, r0)
                if (r12 == 0) goto L15f
                boolean r0 = r12.isEmpty()
                if (r0 != 0) goto L15f
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r12, r3)
                double r2 = cn.bluemobi.dylan.http.JsonParse.getDouble(r12, r2)
                int r12 = cn.bluemobi.dylan.http.JsonParse.getInt(r12, r1)
                com.bxkj.student.run.app.StartRunActivity r1 = r11.a
                com.bxkj.student.run.app.record.Card r1 = com.bxkj.student.run.app.StartRunActivity.r0(r1)
                if (r1 != 0) goto L145
                if (r12 != r4) goto L145
                com.bxkj.student.run.app.StartRunActivity r12 = r11.a
                com.bxkj.student.run.app.record.Card r1 = new com.bxkj.student.run.app.record.Card
                com.bxkj.student.run.app.StartRunActivity r4 = r11.a
                android.content.Context r4 = com.bxkj.student.run.app.StartRunActivity.M0(r4)
                r1.<init>(r4)
                r4 = 3
                com.bxkj.student.run.app.record.Card r1 = r1.f(r4)
                com.bxkj.student.run.app.StartRunActivity r4 = r11.a
                android.content.Context r4 = com.bxkj.student.run.app.StartRunActivity.L0(r4)
                r5 = 2131099713(0x7f060041, float:1.7811787E38)
                int r4 = androidx.core.content.ContextCompat.getColor(r4, r5)
                com.bxkj.student.run.app.record.Card r1 = r1.e(r4)
                com.bxkj.student.run.app.StartRunActivity.x0(r12, r1)
                com.bxkj.student.run.app.StartRunActivity r12 = r11.a
                com.bxkj.base.view.ViewSwitcher r12 = com.bxkj.student.run.app.StartRunActivity.u0(r12)
                com.bxkj.student.run.app.StartRunActivity r1 = r11.a
                com.bxkj.student.run.app.record.Card r1 = com.bxkj.student.run.app.StartRunActivity.r0(r1)
                r12.addView(r1)
            L145:
                com.bxkj.student.run.app.StartRunActivity r12 = r11.a
                com.bxkj.student.run.app.record.Card r12 = com.bxkj.student.run.app.StartRunActivity.r0(r12)
                if (r12 == 0) goto L15f
                com.bxkj.student.run.app.StartRunActivity r12 = r11.a
                com.bxkj.student.run.app.record.Card r12 = com.bxkj.student.run.app.StartRunActivity.r0(r12)
                r12.setCount(r0)
                com.bxkj.student.run.app.StartRunActivity r12 = r11.a
                com.bxkj.student.run.app.record.Card r12 = com.bxkj.student.run.app.StartRunActivity.r0(r12)
                r12.setDistance(r2)
            L15f:
                return
        }
    }

    public StartRunActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.I0 = r0
            return
    }

    static /* bridge */ /* synthetic */ void A0(com.bxkj.student.run.app.StartRunActivity r0, int r1) {
            r0.t1(r1)
            return
    }

    static /* bridge */ /* synthetic */ void B0(com.bxkj.student.run.app.StartRunActivity r0, com.bxkj.student.run.app.offline.table.RunDb r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2, int r3) {
            r0.u1(r1, r2, r3)
            return
    }

    static /* synthetic */ android.content.Context C0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context D0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context E0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context F0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context G0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context H0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context I0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context J0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context K0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context L0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context M0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context N0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context O0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context P0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context Q0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context R0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context S0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context T0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context U0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity V0(com.bxkj.student.run.app.StartRunActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    static /* synthetic */ android.content.Context W0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context X0(com.bxkj.student.run.app.StartRunActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void Y0() {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r3.G0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r3.G0
            r0.dismiss()
        Lf:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r3.H0
            if (r0 == 0) goto L1e
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L1e
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r3.H0
            r0.dismiss()
        L1e:
            com.bxkj.student.run.app.vm.RunVM r0 = r3.I0
            if (r0 != 0) goto L23
            return
        L23:
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            r0.show()
            com.bxkj.student.run.app.vm.RunVM r1 = r3.I0
            com.bxkj.student.run.app.c0 r2 = new com.bxkj.student.run.app.c0
            r2.<init>(r3, r0)
            r1.A(r2)
            return
    }

    private void Z0() {
            r5 = this;
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            androidx.fragment.app.FragmentActivity r1 = r5.W
            r0.<init>(r1)
            r0.show()
            com.bxkj.student.v2.common.utils.p$a r1 = com.bxkj.student.v2.common.utils.p.a
            androidx.fragment.app.FragmentActivity r2 = r5.W
            com.bxkj.student.run.app.a0 r3 = new com.bxkj.student.run.app.a0
            r3.<init>(r5, r0)
            com.bxkj.student.run.app.b0 r4 = new com.bxkj.student.run.app.b0
            r4.<init>(r0)
            r1.c(r2, r3, r4)
            return
    }

    private void a1() {
            r2 = this;
            java.lang.String r0 = "power"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isPowerSaveMode()
            if (r0 == 0) goto L24
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L24
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r2.V
            r0.<init>(r1)
            java.lang.String r1 = "开始跑步前请关闭省电模式，否则轨迹记录可能不准确！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
        L24:
            return
    }

    public static boolean b1(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2b
        L19:
            int r2 = r4.read(r3)     // Catch: java.lang.Throwable -> L2b
            if (r2 <= 0) goto L23
            r1.write(r3, r0, r2)     // Catch: java.lang.Throwable -> L2b
            goto L19
        L23:
            r4.close()     // Catch: java.lang.Throwable -> L2b
            r1.close()     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            return r3
        L2b:
            return r0
    }

    private void c1() {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto Lb
            return
        Lb:
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.p(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.StartRunActivity$i r1 = new com.bxkj.student.run.app.StartRunActivity$i
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void d1() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.a(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.StartRunActivity$f r1 = new com.bxkj.student.run.app.StartRunActivity$f
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 e1(cn.bluemobi.dylan.http.dialog.LoadingDialog r1, java.util.List r2) {
            r0 = this;
            r1.dismiss()
            if (r2 == 0) goto Le
            int r1 = r2.size()
            if (r1 <= 0) goto Le
            r0.q1(r2)
        Le:
            r1 = 0
            return r1
    }

    private /* synthetic */ kotlin.n1 f1(cn.bluemobi.dylan.http.dialog.LoadingDialog r2, java.util.List r3) {
            r1 = this;
            r2.dismiss()
            if (r3 == 0) goto L16
            int r0 = r3.size()
            if (r0 <= 0) goto L16
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            com.bxkj.student.run.app.offline.table.RunDb r2 = (com.bxkj.student.run.app.offline.table.RunDb) r2
            r1.p1(r2)
            goto L23
        L16:
            r2.show()
            com.bxkj.student.run.app.vm.RunVM r3 = r1.I0
            com.bxkj.student.run.app.z r0 = new com.bxkj.student.run.app.z
            r0.<init>(r1, r2)
            r3.B(r0)
        L23:
            r2 = 0
            return r2
    }

    public static /* synthetic */ void g0(com.bxkj.student.run.app.StartRunActivity r0) {
            r0.l1()
            return
    }

    private /* synthetic */ kotlin.n1 g1(cn.bluemobi.dylan.http.dialog.LoadingDialog r1) {
            r0 = this;
            r1.dismiss()
            r0.d1()
            r1 = 0
            return r1
    }

    public static /* synthetic */ void h0(com.bxkj.student.run.app.StartRunActivity r0, com.bxkj.student.run.app.offline.table.RunDb r1) {
            r0.k1(r1)
            return
    }

    private /* synthetic */ void h1(android.view.View r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.run.app.record.RunRecorderListActivity> r2 = com.bxkj.student.run.app.record.RunRecorderListActivity.class
            r0.<init>(r1, r2)
            com.bxkj.student.run.app.record.Card r4 = (com.bxkj.student.run.app.record.Card) r4
            int r4 = r4.getRunType()
            java.lang.String r1 = "runType"
            android.content.Intent r4 = r0.putExtra(r1, r4)
            r3.startActivity(r4)
            return
    }

    public static /* synthetic */ kotlin.n1 i0(cn.bluemobi.dylan.http.dialog.LoadingDialog r0) {
            r0.dismiss()
            r0 = 0
            return r0
    }

    private /* synthetic */ void i1() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.run.app.my.MyRunActivity> r2 = com.bxkj.student.run.app.my.MyRunActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 j0(com.bxkj.student.run.app.StartRunActivity r0, cn.bluemobi.dylan.http.dialog.LoadingDialog r1, java.util.List r2) {
            kotlin.n1 r0 = r0.e1(r1, r2)
            return r0
    }

    private /* synthetic */ void j1(com.bxkj.student.run.app.offline.table.RunDb r3) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.G0
            r1 = 2
            r2.u1(r3, r0, r1)
            return
    }

    public static /* synthetic */ void k0(com.bxkj.student.run.app.StartRunActivity r0, com.bxkj.student.run.app.offline.table.RunDb r1) {
            r0.j1(r1)
            return
    }

    private /* synthetic */ void k1(com.bxkj.student.run.app.offline.table.RunDb r4) {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            java.lang.String r2 = r4.getIdentify()
            rx.e r1 = r1.d(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.StartRunActivity$a r1 = new com.bxkj.student.run.app.StartRunActivity$a
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    public static /* synthetic */ void l0(com.bxkj.student.run.app.StartRunActivity r0) {
            r0.i1()
            return
    }

    private /* synthetic */ void l1() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.run.app.record.RunRecorderListActivity> r2 = com.bxkj.student.run.app.record.RunRecorderListActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public static /* synthetic */ kotlin.n1 m0(com.bxkj.student.run.app.StartRunActivity r0, cn.bluemobi.dylan.http.dialog.LoadingDialog r1) {
            kotlin.n1 r0 = r0.g1(r1)
            return r0
    }

    public static /* synthetic */ void n0(com.bxkj.student.run.app.StartRunActivity r0, android.view.View r1) {
            r0.h1(r1)
            return
    }

    private void n1() {
            r3 = this;
            s.b r0 = new s.b
            r0.<init>(r3)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            s.b r0 = r0.c(r1)
            com.bxkj.student.run.app.StartRunActivity$c r1 = new com.bxkj.student.run.app.StartRunActivity$c
            r1.<init>(r3)
            r0.d(r1)
            android.content.Context r0 = r3.V
            boolean r0 = com.bxkj.base.util.u.a(r0)
            if (r0 != 0) goto L46
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "为了能够让你在跑步过程中不错过重要的通知消息,强烈建议你开始允许推送通知功能"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.run.app.StartRunActivity$d r1 = new com.bxkj.student.run.app.StartRunActivity$d
            r1.<init>(r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            java.lang.String r1 = "不了"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "去开启"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            r0.show()
        L46:
            return
    }

    public static /* synthetic */ kotlin.n1 o0(com.bxkj.student.run.app.StartRunActivity r0, cn.bluemobi.dylan.http.dialog.LoadingDialog r1, java.util.List r2) {
            kotlin.n1 r0 = r0.f1(r1, r2)
            return r0
    }

    private void o1() {
            r4 = this;
            com.amap.api.maps.model.MyLocationStyle r0 = new com.amap.api.maps.model.MyLocationStyle
            r0.<init>()
            r1 = 2131689901(0x7f0f01ad, float:1.900883E38)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r1)
            r0.myLocationIcon(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.strokeColor(r1)
            r1 = 0
            r2 = 180(0xb4, float:2.52E-43)
            r3 = 100
            int r1 = android.graphics.Color.argb(r3, r1, r1, r2)
            r0.radiusFillColor(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.strokeWidth(r1)
            com.amap.api.maps.AMap r1 = r4.Z
            r1.setMyLocationStyle(r0)
            com.amap.api.maps.AMap r0 = r4.Z
            com.amap.api.maps.UiSettings r0 = r0.getUiSettings()
            r1 = 1
            r0.setMyLocationButtonEnabled(r1)
            com.amap.api.maps.AMap r0 = r4.Z
            r0.setMyLocationEnabled(r1)
            r0 = 1100480512(0x41980000, float:19.0)
            com.amap.api.maps.CameraUpdate r0 = com.amap.api.maps.CameraUpdateFactory.zoomTo(r0)
            com.amap.api.maps.AMap r1 = r4.Z
            r1.moveCamera(r0)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.record.Card p0(com.bxkj.student.run.app.StartRunActivity r0) {
            com.bxkj.student.run.app.record.Card r0 = r0.f1149k0
            return r0
    }

    private void p1(com.bxkj.student.run.app.offline.table.RunDb r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "runExceptionDataDB="
            r0.append(r1)
            java.lang.String r1 = r7.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            java.lang.String r1 = r7.getStartTime()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = r0.format(r1)
            java.lang.String r1 = r7.getCountTime()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
            java.lang.String r2 = r7.getDistance()
            float r2 = java.lang.Float.parseFloat(r2)
            double r2 = (double) r2
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.d(r2)
            java.lang.String r3 = r7.getSportsType()
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r3 = com.bxkj.student.run.app.utils.i.q(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "系统检测到您有1条在"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "开始的的已运动"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "KM"
            r4.append(r0)
            java.lang.String r0 = ",用时"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "的"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = "记录异常结束,强烈建议您检查运动权限设置是否正确后尽快恢复继续跑步"
            r4.append(r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r6.V
            r0.<init>(r1)
            r6.G0 = r0
            r1 = 0
            r0.setClickAutoCancel(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.G0
            r0.setCancelable(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.G0
            r0.setCanceledOnTouchOutside(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.G0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r4)
            java.lang.String r1 = "结束并上传"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "恢复继续跑步"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            com.bxkj.student.run.app.e0 r1 = new com.bxkj.student.run.app.e0
            r1.<init>(r6, r7)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonOnClickListener(r1)
            com.bxkj.student.run.app.f0 r1 = new com.bxkj.student.run.app.f0
            r1.<init>(r6, r7)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r7 = r0.setRightButtonOnClickListener(r1)
            r7.show()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.record.Card q0(com.bxkj.student.run.app.StartRunActivity r0) {
            com.bxkj.student.run.app.record.Card r0 = r0.f1150p0
            return r0
    }

    private void q1(java.util.List<com.bxkj.student.run.app.offline.table.RunDb> r4) {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            r3.H0 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "系统检测到您还有"
            r1.append(r2)
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = "条跑步记录在本地暂存,是否上传？"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r0.setMessage(r4)
            java.lang.String r0 = "暂存本地"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setLeftButtonText(r0)
            java.lang.String r0 = "现在上传"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonText(r0)
            com.bxkj.student.run.app.h0 r0 = new com.bxkj.student.run.app.h0
            r0.<init>(r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonOnClickListener(r0)
            r4.show()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.record.Card r0(com.bxkj.student.run.app.StartRunActivity r0) {
            com.bxkj.student.run.app.record.Card r0 = r0.F0
            return r0
    }

    private void r1() {
            r3 = this;
            s.b r0 = new s.b
            r0.<init>(r3)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            s.b r0 = r0.c(r1)
            com.bxkj.student.run.app.StartRunActivity$e r1 = new com.bxkj.student.run.app.StartRunActivity$e
            r1.<init>(r3)
            r0.d(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog s0(com.bxkj.student.run.app.StartRunActivity r0) {
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.vm.RunVM t0(com.bxkj.student.run.app.StartRunActivity r0) {
            com.bxkj.student.run.app.vm.RunVM r0 = r0.I0
            return r0
    }

    private void t1(@com.bxkj.student.run.app.ready.RunType int r4) {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.run.app.a> r1 = com.bxkj.student.run.app.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.run.app.a r1 = (com.bxkj.student.run.app.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.k(r4, r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.StartRunActivity$h r1 = new com.bxkj.student.run.app.StartRunActivity$h
            r1.<init>(r3, r4)
            r0.setDataListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.view.ViewSwitcher u0(com.bxkj.student.run.app.StartRunActivity r0) {
            com.bxkj.base.view.ViewSwitcher r0 = r0.c0
            return r0
    }

    private void u1(com.bxkj.student.run.app.offline.table.RunDb r10, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r11, int r12) {
            r9 = this;
            java.lang.String r0 = r10.getCountTime()
            long r4 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r10.getDistance()
            float r3 = java.lang.Float.parseFloat(r0)
            com.bxkj.student.run.app.vm.RunVM r0 = r9.I0
            com.bxkj.student.run.app.StartRunActivity$b r1 = new com.bxkj.student.run.app.StartRunActivity$b
            r2 = r9
            r6 = r10
            r8 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0.E(r6, r1)
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.run.app.StartRunActivity r0, com.bxkj.student.run.app.record.Card r1) {
            r0.f1149k0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.run.app.StartRunActivity r0, com.bxkj.student.run.app.record.Card r1) {
            r0.f1150p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.run.app.StartRunActivity r0, com.bxkj.student.run.app.record.Card r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void y0(com.bxkj.student.run.app.StartRunActivity r0) {
            r0.Y0()
            return
    }

    static /* bridge */ /* synthetic */ void z0(com.bxkj.student.run.app.StartRunActivity r0) {
            r0.Z0()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493199(0x7f0c014f, float:1.8609871E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.student.run.app.location.service.LocationService> r1 = com.bxkj.student.run.app.location.service.LocationService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "LocationService----------isServiceRunning"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r3.V
            r0.<init>(r2, r1)
            r3.stopService(r0)
        L1d:
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.student.run.app.step.service.StepService> r1 = com.bxkj.student.run.app.step.service.StepService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "StepService----------isServiceRunning"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r3.V
            r0.<init>(r2, r1)
            r3.stopService(r0)
        L3a:
            android.widget.Button r0 = r3.a0
            r0.setOnClickListener(r3)
            r3.c1()
            r3.n1()
            r3.o1()
            com.bxkj.base.view.ViewSwitcher r0 = r3.c0
            com.bxkj.student.run.app.d0 r1 = new com.bxkj.student.run.app.d0
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            r3.a1()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "App跑步"
            r2.setTitle(r0)
            r0 = 2131099737(0x7f060059, float:1.7811836E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r2.d0(r0)
            com.bxkj.student.run.app.g0 r0 = new com.bxkj.student.run.app.g0
            r0.<init>(r2)
            r1 = 2131689955(0x7f0f01e3, float:1.900894E38)
            r2.Z(r1, r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r1.V = r1
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.a0 = r0
            r0 = 2131298111(0x7f09073f, float:1.8214186E38)
            android.view.View r0 = r1.findViewById(r0)
            com.amap.api.maps.MapView r0 = (com.amap.api.maps.MapView) r0
            r1.Y = r0
            r0.onCreate(r2)
            com.amap.api.maps.MapView r2 = r1.Y
            com.amap.api.maps.AMap r2 = r2.getMap()
            r1.Z = r2
            r2 = 2131299267(0x7f090bc3, float:1.821653E38)
            android.view.View r2 = r1.findViewById(r2)
            com.bxkj.base.view.ViewSwitcher r2 = (com.bxkj.base.view.ViewSwitcher) r2
            r1.c0 = r2
            androidx.lifecycle.ViewModelProvider r2 = new androidx.lifecycle.ViewModelProvider
            r2.<init>(r1)
            java.lang.Class<com.bxkj.student.run.app.vm.RunVM> r0 = com.bxkj.student.run.app.vm.RunVM.class
            androidx.lifecycle.ViewModel r2 = r2.get(r0)
            com.bxkj.student.run.app.vm.RunVM r2 = (com.bxkj.student.run.app.vm.RunVM) r2
            r1.I0 = r2
            return
    }

    public void m1() {
            r0 = this;
            r0.c1()
            return
    }

    public void onBackPressed() {
            r1 = this;
            com.bxkj.student.run.app.ready.RunTypeDialog r0 = r1.b0
            if (r0 == 0) goto Le
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Le
            com.bxkj.student.run.app.utils.j.d(r1)
            return
        Le:
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    public void onClick(android.view.View r4) {
            r3 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L19
            android.content.Context r4 = r3.V
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.student.personal.login.LoginActivity> r2 = com.bxkj.student.personal.login.LoginActivity.class
            r0.<init>(r1, r2)
            r4.startActivity(r0)
            return
        L19:
            int r4 = r4.getId()
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            if (r4 == r0) goto L23
            return
        L23:
            android.content.Context r4 = r3.V
            boolean r4 = com.snail.antifake.jni.EmulatorDetectUtil.b(r4)
            if (r4 == 0) goto L3c
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r3.V
            r4.<init>(r0)
            java.lang.String r0 = "系统检查到当前运行环境为模拟器，请使用真机进行跑步"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
        L3c:
            r3.r1()
            return
    }

    public void onDestroy() {
            r1 = this;
            com.amap.api.maps.MapView r0 = r1.Y
            r0.onDestroy()
            super.onDestroy()
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            com.amap.api.maps.MapView r0 = r1.Y
            r0.onPause()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.amap.api.maps.MapView r0 = r1.Y
            r0.onResume()
            r1.Y0()
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r2)
            com.amap.api.maps.MapView r0 = r1.Y
            r0.onSaveInstanceState(r2)
            return
    }

    public void s1(java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            com.bxkj.student.run.app.ready.RunTypeDialog r0 = new com.bxkj.student.run.app.ready.RunTypeDialog
            r0.<init>(r4)
            java.lang.String r1 = "morningRun"
            r2 = 1
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r1, r2)
            r3 = 0
            if (r1 != 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            com.bxkj.student.run.app.ready.RunTypeDialog r0 = r0.u(r1)
            java.lang.String r1 = "sunRun"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r1, r2)
            if (r1 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            com.bxkj.student.run.app.ready.RunTypeDialog r0 = r0.v(r1)
            java.lang.String r1 = "freedom"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r1, r2)
            if (r1 != 0) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            com.bxkj.student.run.app.ready.RunTypeDialog r0 = r0.s(r1)
            java.lang.String r1 = "marathonRun"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r1, r2)
            if (r1 != 0) goto L3d
            goto L3e
        L3d:
            r2 = 0
        L3e:
            java.lang.String r1 = "marathonRunName"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
            com.bxkj.student.run.app.ready.RunTypeDialog r5 = r0.t(r2, r5)
            com.bxkj.student.run.app.StartRunActivity$g r0 = new com.bxkj.student.run.app.StartRunActivity$g
            r0.<init>(r4)
            com.bxkj.student.run.app.ready.RunTypeDialog r5 = r5.r(r0)
            r4.b0 = r5
            r5.show()
            return
    }
}

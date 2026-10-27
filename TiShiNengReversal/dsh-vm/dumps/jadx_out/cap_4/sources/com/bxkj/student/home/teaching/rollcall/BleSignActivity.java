package com.bxkj.student.home.teaching.rollcall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class BleSignActivity extends cn.bluemobi.dylan.base.BaseActivity {

    @org.jetbrains.annotations.Nullable
    private java.lang.String Y;

    @org.jetbrains.annotations.Nullable
    private java.lang.String Z;

    @org.jetbrains.annotations.Nullable
    private java.lang.String a0;

    @org.jetbrains.annotations.Nullable
    private java.lang.String b0;
    private com.bxkj.base.view.WaveView c0;

    /* renamed from: k0, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.http.dialog.LoadingDialog f979k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BleSignActivity a;

        a(com.bxkj.student.home.teaching.rollcall.BleSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, android.view.View r1) {
                b(r0, r1)
                return
        }

        private static final void b(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, android.view.View r1) {
                r0.finish()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "msg"
                kotlin.jvm.internal.g0.p(r3, r0)
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r3 = r1.a
                com.bxkj.student.home.teaching.rollcall.a r0 = new com.bxkj.student.home.teaching.rollcall.a
                r0.<init>(r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r3, r0)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a
                java.lang.String r1 = "Identify"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.n0(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a
                java.lang.String r1 = "teachingClockingin"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.m0(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a
                java.lang.String r1 = "stuTeacherCurriculum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.l0(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a
                java.lang.String r1 = "weekNum"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.o0(r0, r3)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r3 = r2.a
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.j0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements s.b.a {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BleSignActivity a;

        b(com.bxkj.student.home.teaching.rollcall.BleSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r4 = this;
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r1 = r4.a
                android.app.Application r1 = r1.getApplication()
                r0.G(r1)
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                r1 = 1
                com.clj.fastble.a r0 = r0.l(r1)
                r2 = 5000(0x1388, double:2.4703E-320)
                com.clj.fastble.a r0 = r0.f0(r1, r2)
                r1 = 5000(0x1388, float:7.006E-42)
                r0.d0(r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.h0(r0)
                return
        }

        @Override // s.b.a
        public void b(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "permission"
                kotlin.jvm.internal.g0.p(r2, r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "您拒绝了蓝牙定位权限,无法进行蓝牙签到,请在(设置->应用—>体适能->权限管理->获取定位)设置允许定位后再进行蓝牙签到"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }

        @Override // s.b.a
        public void c(java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "permission"
                kotlin.jvm.internal.g0.p(r2, r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "您拒绝了蓝牙和定位权限,无法进行蓝牙签到,请在(设置->应用—>体适能->权限管理->获取定位)设置允许定位后再进行蓝牙签到"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements t.b.a {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BleSignActivity a;

        c(com.bxkj.student.home.teaching.rollcall.BleSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L8
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r1 = r0.a
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.k0(r1)
            L8:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends d1.i {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BleSignActivity a;

        d(com.bxkj.student.home.teaching.rollcall.BleSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void e(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                g(r0)
                return
        }

        public static /* synthetic */ void f(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                h(r0)
                return
        }

        private static final void g(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                r0.finish()
                return
        }

        private static final void h(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.h0(r0)
                return
        }

        public void a(boolean r2) {
                r1 = this;
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "onScanStarted"
                com.orhanobut.logger.j.d(r0, r2)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r2 = r1.a
                cn.bluemobi.dylan.http.dialog.LoadingDialog r2 = r2.q0()
                if (r2 == 0) goto L1b
                java.lang.String r0 = "正在搜索蓝牙..."
                android.app.Dialog r2 = r2.show(r0)
                if (r2 == 0) goto L1b
                r2.show()
            L1b:
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r2 = r1.a
                com.bxkj.base.view.WaveView r2 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.i0(r2)
                if (r2 != 0) goto L29
                java.lang.String r2 = "waveView"
                kotlin.jvm.internal.g0.S(r2)
                r2 = 0
            L29:
                r2.k()
                return
        }

        public void b(com.clj.fastble.data.BleDevice r4) {
                r3 = this;
                java.lang.String r0 = "bleDevice"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = r4.d()
                java.lang.String r4 = r4.c()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onScanning:"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "-"
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.d(r4, r0)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r4 = r3.a
                com.bxkj.base.view.WaveView r4 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.i0(r4)
                if (r4 != 0) goto L3a
                java.lang.String r4 = "waveView"
                kotlin.jvm.internal.g0.S(r4)
                r4 = 0
            L3a:
                r4.l()
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r4 = r3.a
                cn.bluemobi.dylan.http.dialog.LoadingDialog r4 = r4.q0()
                if (r4 == 0) goto L48
                r4.dismiss()
            L48:
                com.clj.fastble.a r4 = com.clj.fastble.a.v()
                r4.a()
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r4 = r3.a
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.p0(r4)
                return
        }

        public void c(com.clj.fastble.data.BleDevice r4) {
                r3 = this;
                java.lang.String r0 = "bleDevice"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = r4.d()
                java.lang.String r4 = r4.c()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onLeScan:"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "-"
                r1.append(r0)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.d(r4, r0)
                return
        }

        public void d(java.util.List<? extends com.clj.fastble.data.BleDevice> r5) {
                r4 = this;
                java.lang.String r0 = "scanResultList"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onScanFinished:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r0, r2)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                com.bxkj.base.view.WaveView r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.i0(r0)
                r2 = 0
                java.lang.String r3 = "waveView"
                if (r0 != 0) goto L2b
                kotlin.jvm.internal.g0.S(r3)
                r0 = r2
            L2b:
                boolean r0 = r0.i()
                if (r0 == 0) goto L83
                java.lang.String r0 = "搜索结束提示"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                com.bxkj.base.view.WaveView r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.i0(r0)
                if (r0 != 0) goto L44
                kotlin.jvm.internal.g0.S(r3)
                goto L45
            L44:
                r2 = r0
            L45:
                r2.l()
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r0.q0()
                if (r0 == 0) goto L53
                r0.dismiss()
            L53:
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L83
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r0)
                r5.<init>(r0)
                java.lang.String r0 = "未搜索到蓝牙信息，签到失败，是否重试？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5 = r5.setMessage(r0)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                com.bxkj.student.home.teaching.rollcall.b r1 = new com.bxkj.student.home.teaching.rollcall.b
                r1.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5 = r5.setLeftButtonOnClickListener(r1)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r4.a
                com.bxkj.student.home.teaching.rollcall.c r1 = new com.bxkj.student.home.teaching.rollcall.c
                r1.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r5 = r5.setRightButtonOnClickListener(r1)
                r5.show()
            L83:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e implements android.content.DialogInterface.OnKeyListener {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BleSignActivity a;

        e(com.bxkj.student.home.teaching.rollcall.BleSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                b(r0)
                return
        }

        private static final void b(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                r0.finish()
                return
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(android.content.DialogInterface r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                r1 = 4
                if (r2 != r1) goto L38
                if (r3 == 0) goto L38
                int r1 = r3.getAction()
                if (r1 != 0) goto L38
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r2 = r0.a
                android.content.Context r2 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r2)
                r1.<init>(r2)
                java.lang.String r2 = "正在扫描教师蓝牙签到，是否退出？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setMessage(r2)
                java.lang.String r2 = "继续签到"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setLeftButtonText(r2)
                java.lang.String r2 = "取消签到"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setRightButtonText(r2)
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r2 = r0.a
                com.bxkj.student.home.teaching.rollcall.d r3 = new com.bxkj.student.home.teaching.rollcall.d
                r3.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setRightButtonOnClickListener(r3)
                r1.show()
                r1 = 1
                return r1
            L38:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BleSignActivity a;

        f(com.bxkj.student.home.teaching.rollcall.BleSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                d(r0)
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                e(r0)
                return
        }

        public static /* synthetic */ void c(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, android.view.View r1) {
                f(r0, r1)
                return
        }

        private static final void d(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.p0(r0)
                return
        }

        private static final void e(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
                com.bxkj.student.home.teaching.rollcall.BleSignActivity.p0(r0)
                return
        }

        private static final void f(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, android.view.View r1) {
                r0.finish()
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                java.lang.String r0 = "ex"
                kotlin.jvm.internal.g0.p(r3, r0)
                super.netOnFailure(r3)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog     // Catch: java.lang.Exception -> L27
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a     // Catch: java.lang.Exception -> L27
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r0)     // Catch: java.lang.Exception -> L27
                r3.<init>(r0)     // Catch: java.lang.Exception -> L27
                java.lang.String r0 = "签到失败，是否重试？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)     // Catch: java.lang.Exception -> L27
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a     // Catch: java.lang.Exception -> L27
                com.bxkj.student.home.teaching.rollcall.g r1 = new com.bxkj.student.home.teaching.rollcall.g     // Catch: java.lang.Exception -> L27
                r1.<init>(r0)     // Catch: java.lang.Exception -> L27
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L27
                r3.show()     // Catch: java.lang.Exception -> L27
            L27:
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r2 = "msg"
                kotlin.jvm.internal.g0.p(r3, r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog     // Catch: java.lang.Exception -> L24
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r3 = r1.a     // Catch: java.lang.Exception -> L24
                android.content.Context r3 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r3)     // Catch: java.lang.Exception -> L24
                r2.<init>(r3)     // Catch: java.lang.Exception -> L24
                java.lang.String r3 = "签到失败，是否重试？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setMessage(r3)     // Catch: java.lang.Exception -> L24
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r3 = r1.a     // Catch: java.lang.Exception -> L24
                com.bxkj.student.home.teaching.rollcall.e r0 = new com.bxkj.student.home.teaching.rollcall.e     // Catch: java.lang.Exception -> L24
                r0.<init>(r3)     // Catch: java.lang.Exception -> L24
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonOnClickListener(r0)     // Catch: java.lang.Exception -> L24
                r2.show()     // Catch: java.lang.Exception -> L24
            L24:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r3, r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L24
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a     // Catch: java.lang.Exception -> L24
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BleSignActivity.g0(r0)     // Catch: java.lang.Exception -> L24
                r3.<init>(r0)     // Catch: java.lang.Exception -> L24
                java.lang.String r0 = "签到成功"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)     // Catch: java.lang.Exception -> L24
                com.bxkj.student.home.teaching.rollcall.BleSignActivity r0 = r2.a     // Catch: java.lang.Exception -> L24
                com.bxkj.student.home.teaching.rollcall.f r1 = new com.bxkj.student.home.teaching.rollcall.f     // Catch: java.lang.Exception -> L24
                r1.<init>(r0)     // Catch: java.lang.Exception -> L24
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r1)     // Catch: java.lang.Exception -> L24
                r3.show()     // Catch: java.lang.Exception -> L24
            L24:
                return
        }
    }

    public BleSignActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ android.content.Context g0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static final /* synthetic */ void h0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
            r0.s0()
            return
    }

    public static final /* synthetic */ com.bxkj.base.view.WaveView i0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
            com.bxkj.base.view.WaveView r0 = r0.c0
            return r0
    }

    public static final /* synthetic */ void j0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
            r0.t0()
            return
    }

    public static final /* synthetic */ void k0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
            r0.u0()
            return
    }

    public static final /* synthetic */ void l0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, java.lang.String r1) {
            r0.a0 = r1
            return
    }

    public static final /* synthetic */ void m0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, java.lang.String r1) {
            r0.Z = r1
            return
    }

    public static final /* synthetic */ void n0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, java.lang.String r1) {
            r0.Y = r1
            return
    }

    public static final /* synthetic */ void o0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0, java.lang.String r1) {
            r0.b0 = r1
            return
    }

    public static final /* synthetic */ void p0(com.bxkj.student.home.teaching.rollcall.BleSignActivity r0) {
            r0.w0()
            return
    }

    private final java.lang.String r0() {
            r2 = this;
            android.content.Context r0 = r2.V
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "bluetooth_address"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            return r0
    }

    private final void s0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            rx.e r1 = r1.S0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.rollcall.BleSignActivity$a r1 = new com.bxkj.student.home.teaching.rollcall.BleSignActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private final void t0() {
            r3 = this;
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            boolean r0 = r0.L()
            if (r0 == 0) goto L23
            t.b r0 = new t.b
            r0.<init>(r3)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.bluetooth.adapter.action.REQUEST_ENABLE"
            r1.<init>(r2)
            t.b r0 = r0.startActivityForResult(r1)
            com.bxkj.student.home.teaching.rollcall.BleSignActivity$c r1 = new com.bxkj.student.home.teaching.rollcall.BleSignActivity$c
            r1.<init>(r3)
            r0.c(r1)
            return
        L23:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "您的手机不支持蓝牙签到,请联系老师手动签到"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    private final void u0() {
            r4 = this;
            com.clj.fastble.scan.b$a r0 = new com.clj.fastble.scan.b$a
            r0.<init>()
            java.lang.String r1 = r4.Y
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            r2 = 1
            java.util.UUID[] r2 = new java.util.UUID[r2]
            r3 = 0
            r2[r3] = r1
            com.clj.fastble.scan.b$a r0 = r0.g(r2)
            r1 = 30000(0x7530, double:1.4822E-319)
            com.clj.fastble.scan.b$a r0 = r0.f(r1)
            com.clj.fastble.scan.b r0 = r0.b()
            com.clj.fastble.a r1 = com.clj.fastble.a.v()
            r1.H(r0)
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            r4.f979k0 = r0
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            com.bxkj.student.home.teaching.rollcall.BleSignActivity$d r1 = new com.bxkj.student.home.teaching.rollcall.BleSignActivity$d
            r1.<init>(r4)
            r0.Y(r1)
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r4.f979k0
            if (r0 == 0) goto L47
            com.bxkj.student.home.teaching.rollcall.BleSignActivity$e r1 = new com.bxkj.student.home.teaching.rollcall.BleSignActivity$e
            r1.<init>(r4)
            r0.setOnKeyListener(r1)
        L47:
            return
    }

    private final void w0() {
            r7 = this;
            java.lang.String r4 = r7.r0()
            android.content.Context r0 = r7.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.String r1 = "正在签到..."
            cn.bluemobi.dylan.http.HttpRequest r6 = r0.setLoadingMessage(r1)
            java.lang.Class<d0.a> r0 = d0.a.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            d0.a r0 = (d0.a) r0
            java.lang.String r1 = r7.Z
            java.lang.String r2 = r7.a0
            java.lang.String r3 = r7.b0
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getSchoolId()
            rx.e r0 = r0.D1(r1, r2, r3, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r0 = r6.setObservable(r0)
            com.bxkj.student.home.teaching.rollcall.BleSignActivity$f r1 = new com.bxkj.student.home.teaching.rollcall.BleSignActivity$f
            r1.<init>(r7)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493029(0x7f0c00a5, float:1.8609527E38)
            return r0
    }

    public void R() {
            r5 = this;
            s.b r0 = new s.b
            androidx.fragment.app.FragmentActivity r1 = r5.W
            java.lang.String r2 = "mActivity"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r3 = "android.permission.BLUETOOTH"
            java.lang.String r4 = "android.permission.BLUETOOTH_ADMIN"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            s.b r0 = r0.c(r1)
            com.bxkj.student.home.teaching.rollcall.BleSignActivity$b r1 = new com.bxkj.student.home.teaching.rollcall.BleSignActivity$b
            r1.<init>(r5)
            r0.d(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "上课签到"
            r1.setTitle(r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r3 = this;
            r4 = 2131299287(0x7f090bd7, float:1.8216571E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            com.bxkj.base.view.WaveView r4 = (com.bxkj.base.view.WaveView) r4
            r3.c0 = r4
            r0 = 0
            java.lang.String r1 = "waveView"
            if (r4 != 0) goto L19
            kotlin.jvm.internal.g0.S(r1)
            r4 = r0
        L19:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r4.setStyle(r2)
            com.bxkj.base.view.WaveView r4 = r3.c0
            if (r4 != 0) goto L26
            kotlin.jvm.internal.g0.S(r1)
            goto L27
        L26:
            r0 = r4
        L27:
            android.content.Context r4 = r3.V
            r1 = 2131099714(0x7f060042, float:1.781179E38)
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setColor(r4)
            return
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r2 = this;
            super.onDestroy()
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r2.f979k0
            if (r0 == 0) goto La
            r0.dismiss()
        La:
            com.bxkj.base.view.WaveView r0 = r2.c0
            if (r0 != 0) goto L14
            java.lang.String r0 = "waveView"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        L14:
            r0.l()
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            com.clj.fastble.data.BleScanState r0 = r0.C()
            com.clj.fastble.data.BleScanState r1 = com.clj.fastble.data.BleScanState.STATE_SCANNING
            if (r0 != r1) goto L2c
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            if (r0 == 0) goto L2c
            r0.a()
        L2c:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final cn.bluemobi.dylan.http.dialog.LoadingDialog q0() {
            r1 = this;
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = r1.f979k0
            return r0
    }

    public final void v0(@org.jetbrains.annotations.Nullable cn.bluemobi.dylan.http.dialog.LoadingDialog r1) {
            r0 = this;
            r0.f979k0 = r1
            return
    }
}

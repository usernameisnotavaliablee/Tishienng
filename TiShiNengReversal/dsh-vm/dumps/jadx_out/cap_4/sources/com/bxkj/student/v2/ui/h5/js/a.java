package com.bxkj.student.v2.ui.h5.js;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a extends com.bxkj.base.v2.h5.h {

    @org.jetbrains.annotations.NotNull
    private androidx.fragment.app.FragmentActivity c;

    @org.jetbrains.annotations.NotNull
    private android.webkit.WebView d;

    @org.jetbrains.annotations.Nullable
    private android.bluetooth.BluetoothGattServer e;

    @org.jetbrains.annotations.Nullable
    private android.bluetooth.le.BluetoothLeAdvertiser f;

    @org.jetbrains.annotations.Nullable
    private android.bluetooth.le.AdvertiseCallback g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.v2.ui.h5.js.a$a, reason: collision with other inner class name */
    public static final class C0158a implements t.b.a {
        final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a a;
        final /* synthetic */ java.lang.String b;

        C0158a(com.bxkj.student.v2.ui.h5.js.a r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // t.b.a
        public void a(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto La
                com.bxkj.student.v2.ui.h5.js.a r1 = r0.a
                java.lang.String r2 = r0.b
                com.bxkj.student.v2.ui.h5.js.a.g(r1, r2)
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.h5.js.BlueToothJS$openBluetooth$1", f = "BlueToothJS.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a b;
        final /* synthetic */ java.lang.String c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.v2.ui.h5.js.a$b$a, reason: collision with other inner class name */
        public static final class C0159a implements t.b.a {
            final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a a;
            final /* synthetic */ java.lang.String b;

            C0159a(com.bxkj.student.v2.ui.h5.js.a r1, java.lang.String r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // t.b.a
            public void a(int r1, android.content.Intent r2) {
                    r0 = this;
                    r2 = -1
                    if (r1 == r2) goto Lb
                    com.bxkj.student.v2.ui.h5.js.a r1 = r0.a
                    java.lang.String r2 = r0.b
                    r1.openBluetooth(r2)
                    return
                Lb:
                    com.bxkj.student.v2.ui.h5.js.a r1 = r0.a
                    java.lang.String r2 = r0.b
                    com.bxkj.student.v2.ui.h5.js.a.h(r1, r2)
                    return
            }
        }

        b(com.bxkj.student.v2.ui.h5.js.a r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.h5.js.a.b> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.h5.js.a$b r3 = new com.bxkj.student.v2.ui.h5.js.a$b
                com.bxkj.student.v2.ui.h5.js.a r0 = r2.b
                java.lang.String r1 = r2.c
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.h5.js.a$b r1 = (com.bxkj.student.v2.ui.h5.js.a.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r3.a
                if (r0 != 0) goto L57
                kotlin.g0.n(r4)
                com.bxkj.student.v2.ui.h5.js.a r4 = r3.b
                androidx.fragment.app.FragmentActivity r4 = r4.a()
                java.lang.String r0 = "bluetooth"
                java.lang.Object r4 = r4.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.bluetooth.BluetoothManager"
                kotlin.jvm.internal.g0.n(r4, r0)
                android.bluetooth.BluetoothManager r4 = (android.bluetooth.BluetoothManager) r4
                android.bluetooth.BluetoothAdapter r4 = r4.getAdapter()
                if (r4 == 0) goto L32
                boolean r4 = r4.isEnabled()
                if (r4 != 0) goto L2a
                goto L32
            L2a:
                com.bxkj.student.v2.ui.h5.js.a r4 = r3.b
                java.lang.String r0 = r3.c
                com.bxkj.student.v2.ui.h5.js.a.h(r4, r0)
                goto L54
            L32:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "android.bluetooth.adapter.action.REQUEST_ENABLE"
                r4.<init>(r0)
                t.b r0 = new t.b
                com.bxkj.student.v2.ui.h5.js.a r1 = r3.b
                androidx.fragment.app.FragmentActivity r1 = r1.a()
                r0.<init>(r1)
                t.b r4 = r0.startActivityForResult(r4)
                com.bxkj.student.v2.ui.h5.js.a$b$a r0 = new com.bxkj.student.v2.ui.h5.js.a$b$a
                com.bxkj.student.v2.ui.h5.js.a r1 = r3.b
                java.lang.String r2 = r3.c
                r0.<init>(r1, r2)
                r4.c(r0)
            L54:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
            L57:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends d1.i {
        final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a a;
        final /* synthetic */ java.lang.String b;

        c(com.bxkj.student.v2.ui.h5.js.a r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void e(com.bxkj.student.v2.ui.h5.js.a r0, java.lang.String r1) {
                h(r0, r1)
                return
        }

        public static /* synthetic */ void f() {
                g()
                return
        }

        private static final void g() {
                return
        }

        private static final void h(com.bxkj.student.v2.ui.h5.js.a r0, java.lang.String r1) {
                com.bxkj.student.v2.ui.h5.js.a.g(r0, r1)
                return
        }

        public void a(boolean r2) {
                r1 = this;
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "onScanStarted"
                com.orhanobut.logger.j.d(r0, r2)
                return
        }

        public void b(com.clj.fastble.data.BleDevice r5) {
                r4 = this;
                java.lang.String r0 = "bleDevice"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = r5.d()
                java.lang.String r5 = r5.c()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onScanning:"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "-"
                r1.append(r0)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.d(r5, r0)
                com.clj.fastble.a r5 = com.clj.fastble.a.v()
                r5.a()
                com.bxkj.student.v2.ui.h5.js.a r5 = r4.a
                java.lang.String r5 = com.bxkj.student.v2.ui.h5.js.a.e(r5)
                com.bxkj.student.v2.ui.h5.js.a r0 = r4.a
                android.webkit.WebView r0 = r0.b()
                java.lang.String r1 = r4.b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "javascript:stuSignStatus('"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = "','"
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = "')"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0.loadUrl(r5)
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

        public void d(java.util.List<? extends com.clj.fastble.data.BleDevice> r4) {
                r3 = this;
                java.lang.String r0 = "scanResultList"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onScanFinished:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r0, r1)
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L4c
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.v2.ui.h5.js.a r0 = r3.a
                androidx.fragment.app.FragmentActivity r0 = r0.a()
                r4.<init>(r0)
                java.lang.String r0 = "未搜索到蓝牙信息，签到失败，是否重试？"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setMessage(r0)
                com.bxkj.student.v2.ui.h5.js.b r0 = new com.bxkj.student.v2.ui.h5.js.b
                r0.<init>()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setLeftButtonOnClickListener(r0)
                com.bxkj.student.v2.ui.h5.js.a r0 = r3.a
                java.lang.String r1 = r3.b
                com.bxkj.student.v2.ui.h5.js.c r2 = new com.bxkj.student.v2.ui.h5.js.c
                r2.<init>(r0, r1)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r4.setRightButtonOnClickListener(r2)
                r4.show()
            L4c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends android.bluetooth.BluetoothGattServerCallback {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothDevice r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "device"
                kotlin.jvm.internal.g0.p(r2, r0)
                super.onConnectionStateChange(r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e extends android.bluetooth.le.AdvertiseCallback {
        final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a a;

        e(com.bxkj.student.v2.ui.h5.js.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartFailure(int r4) {
                r3 = this;
                super.onStartFailure(r4)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.v2.ui.h5.js.a r1 = r3.a
                androidx.fragment.app.FragmentActivity r1 = r1.a()
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "开启蓝牙广播服务失败,错误码："
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ",请重新再试"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r0.setMessage(r4)
                r4.show()
                return
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartSuccess(android.bluetooth.le.AdvertiseSettings r2) {
                r1 = this;
                java.lang.String r0 = "settingsInEffect"
                kotlin.jvm.internal.g0.p(r2, r0)
                super.onStartSuccess(r2)
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "服务发布成功"
                com.orhanobut.logger.j.g(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.ui.h5.js.BlueToothJS$stuOpenBluetooth$1", f = "BlueToothJS.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a b;
        final /* synthetic */ java.lang.String c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.v2.ui.h5.js.a$f$a, reason: collision with other inner class name */
        public static final class C0160a implements s.b.a {
            final /* synthetic */ com.bxkj.student.v2.ui.h5.js.a a;
            final /* synthetic */ java.lang.String b;

            C0160a(com.bxkj.student.v2.ui.h5.js.a r1, java.lang.String r2) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            @Override // s.b.a
            public void a() {
                    r4 = this;
                    com.clj.fastble.a r0 = com.clj.fastble.a.v()
                    com.bxkj.student.v2.ui.h5.js.a r1 = r4.a
                    androidx.fragment.app.FragmentActivity r1 = r1.a()
                    android.app.Application r1 = r1.getApplication()
                    r0.G(r1)
                    com.clj.fastble.a r0 = com.clj.fastble.a.v()
                    r1 = 1
                    com.clj.fastble.a r0 = r0.l(r1)
                    r2 = 5000(0x1388, double:2.4703E-320)
                    com.clj.fastble.a r0 = r0.f0(r1, r2)
                    r1 = 5000(0x1388, float:7.006E-42)
                    r0.d0(r1)
                    com.bxkj.student.v2.ui.h5.js.a r0 = r4.a
                    java.lang.String r1 = r4.b
                    com.bxkj.student.v2.ui.h5.js.a.f(r0, r1)
                    return
            }

            @Override // s.b.a
            public void b(java.lang.String[] r2) {
                    r1 = this;
                    java.lang.String r0 = "permission"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.v2.ui.h5.js.a r0 = r1.a
                    androidx.fragment.app.FragmentActivity r0 = r0.a()
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
                    com.bxkj.student.v2.ui.h5.js.a r0 = r1.a
                    androidx.fragment.app.FragmentActivity r0 = r0.a()
                    r2.<init>(r0)
                    java.lang.String r0 = "您拒绝了蓝牙和定位权限,无法进行蓝牙签到,请在(设置->应用—>体适能->权限管理->获取定位)设置允许定位后再进行蓝牙签到"
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                    r2.show()
                    return
            }
        }

        f(com.bxkj.student.v2.ui.h5.js.a r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.ui.h5.js.a.f> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.ui.h5.js.a$f r3 = new com.bxkj.student.v2.ui.h5.js.a$f
                com.bxkj.student.v2.ui.h5.js.a r0 = r2.b
                java.lang.String r1 = r2.c
                r3.<init>(r0, r1, r4)
                return r3
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.ui.h5.js.a$f r1 = (com.bxkj.student.v2.ui.h5.js.a.f) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r4.a
                if (r0 != 0) goto L34
                kotlin.g0.n(r5)
                s.b r5 = new s.b
                com.bxkj.student.v2.ui.h5.js.a r0 = r4.b
                androidx.fragment.app.FragmentActivity r0 = r0.a()
                r5.<init>(r0)
                java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
                java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
                java.lang.String r2 = "android.permission.BLUETOOTH"
                java.lang.String r3 = "android.permission.BLUETOOTH_ADMIN"
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
                s.b r5 = r5.c(r0)
                com.bxkj.student.v2.ui.h5.js.a$f$a r0 = new com.bxkj.student.v2.ui.h5.js.a$f$a
                com.bxkj.student.v2.ui.h5.js.a r1 = r4.b
                java.lang.String r2 = r4.c
                r0.<init>(r1, r2)
                r5.d(r0)
                kotlin.n1 r5 = kotlin.n1.a
                return r5
            L34:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
        }
    }

    public a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull android.webkit.WebView r3) {
            r1 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mWebView"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            r1.c = r2
            r1.d = r3
            return
    }

    public static final /* synthetic */ java.lang.String e(com.bxkj.student.v2.ui.h5.js.a r0) {
            java.lang.String r0 = r0.i()
            return r0
    }

    public static final /* synthetic */ void f(com.bxkj.student.v2.ui.h5.js.a r0, java.lang.String r1) {
            r0.j(r1)
            return
    }

    public static final /* synthetic */ void g(com.bxkj.student.v2.ui.h5.js.a r0, java.lang.String r1) {
            r0.k(r1)
            return
    }

    public static final /* synthetic */ void h(com.bxkj.student.v2.ui.h5.js.a r0, java.lang.String r1) {
            r0.l(r1)
            return
    }

    private final java.lang.String i() {
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.a()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "bluetooth_address"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            return r0
    }

    private final void j(java.lang.String r4) {
            r3 = this;
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            boolean r0 = r0.L()
            if (r0 == 0) goto L27
            t.b r0 = new t.b
            androidx.fragment.app.FragmentActivity r1 = r3.a()
            r0.<init>(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.bluetooth.adapter.action.REQUEST_ENABLE"
            r1.<init>(r2)
            t.b r0 = r0.startActivityForResult(r1)
            com.bxkj.student.v2.ui.h5.js.a$a r1 = new com.bxkj.student.v2.ui.h5.js.a$a
            r1.<init>(r3, r4)
            r0.c(r1)
            return
        L27:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            androidx.fragment.app.FragmentActivity r0 = r3.a()
            r4.<init>(r0)
            java.lang.String r0 = "您的手机不支持蓝牙签到,请联系老师手动签到"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r4 = r4.setMessage(r0)
            r4.show()
            return
    }

    private final void k(java.lang.String r5) {
            r4 = this;
            com.clj.fastble.scan.b$a r0 = new com.clj.fastble.scan.b$a
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.fromString(r5)
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
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            com.bxkj.student.v2.ui.h5.js.a$c r1 = new com.bxkj.student.v2.ui.h5.js.a$c
            r1.<init>(r4, r5)
            r0.Y(r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    private final void l(java.lang.String r8) {
            r7 = this;
            androidx.fragment.app.FragmentActivity r0 = r7.a()
            java.lang.String r1 = "bluetooth"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.bluetooth.BluetoothManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            android.bluetooth.BluetoothAdapter r1 = r0.getAdapter()
            android.bluetooth.BluetoothGattCharacteristic r2 = new android.bluetooth.BluetoothGattCharacteristic
            java.util.UUID r3 = java.util.UUID.fromString(r8)
            r4 = 16
            r5 = 1
            r2.<init>(r3, r4, r5)
            android.bluetooth.BluetoothGattService r3 = new android.bluetooth.BluetoothGattService
            java.util.UUID r4 = java.util.UUID.fromString(r8)
            r6 = 0
            r3.<init>(r4, r6)
            r3.addCharacteristic(r2)
            androidx.fragment.app.FragmentActivity r2 = r7.a()
            com.bxkj.student.v2.ui.h5.js.a$d r4 = new com.bxkj.student.v2.ui.h5.js.a$d
            r4.<init>()
            android.bluetooth.BluetoothGattServer r0 = r0.openGattServer(r2, r4)
            r7.e = r0
            android.bluetooth.le.BluetoothLeAdvertiser r0 = r1.getBluetoothLeAdvertiser()
            r7.f = r0
            android.bluetooth.BluetoothGattServer r0 = r7.e
            if (r0 == 0) goto L4a
            r0.addService(r3)
        L4a:
            android.bluetooth.le.AdvertiseData$Builder r0 = new android.bluetooth.le.AdvertiseData$Builder
            r0.<init>()
            android.os.ParcelUuid r8 = android.os.ParcelUuid.fromString(r8)
            android.bluetooth.le.AdvertiseData$Builder r8 = r0.addServiceUuid(r8)
            android.bluetooth.le.AdvertiseData r8 = r8.build()
            android.bluetooth.le.AdvertiseSettings$Builder r0 = new android.bluetooth.le.AdvertiseSettings$Builder
            r0.<init>()
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setConnectable(r5)
            android.bluetooth.le.AdvertiseSettings r0 = r0.build()
            com.bxkj.student.v2.ui.h5.js.a$e r1 = new com.bxkj.student.v2.ui.h5.js.a$e
            r1.<init>(r7)
            r7.g = r1
            android.bluetooth.le.BluetoothLeAdvertiser r2 = r7.f
            if (r2 == 0) goto L76
            r2.startAdvertising(r0, r8, r1)
        L76:
            return
    }

    @Override // com.bxkj.base.v2.h5.h
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.FragmentActivity a() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.c
            return r0
    }

    @Override // com.bxkj.base.v2.h5.h
    @org.jetbrains.annotations.NotNull
    public android.webkit.WebView b() {
            r1 = this;
            android.webkit.WebView r0 = r1.d
            return r0
    }

    @Override // com.bxkj.base.v2.h5.h
    public void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    @android.webkit.JavascriptInterface
    @androidx.annotation.RequiresApi(21)
    public final void closeBluetooth() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "关闭蓝牙点名"
            com.orhanobut.logger.j.d(r1, r0)
            android.bluetooth.le.BluetoothLeAdvertiser r0 = r2.f
            if (r0 == 0) goto L11
            android.bluetooth.le.AdvertiseCallback r1 = r2.g
            r0.stopAdvertising(r1)
        L11:
            android.bluetooth.BluetoothGattServer r0 = r2.e
            if (r0 == 0) goto L18
            r0.clearServices()
        L18:
            android.bluetooth.BluetoothGattServer r0 = r2.e
            if (r0 == 0) goto L1f
            r0.close()
        L1f:
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            com.clj.fastble.data.BleScanState r0 = r0.C()
            com.clj.fastble.data.BleScanState r1 = com.clj.fastble.data.BleScanState.STATE_SCANNING
            if (r0 != r1) goto L34
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            if (r0 == 0) goto L34
            r0.a()
        L34:
            return
    }

    @Override // com.bxkj.base.v2.h5.h
    public void d(@org.jetbrains.annotations.NotNull android.webkit.WebView r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }

    @android.webkit.JavascriptInterface
    public final void openBluetooth(@org.jetbrains.annotations.Nullable java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "开始蓝牙点名uuid="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r7.a()
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.student.v2.ui.h5.js.a$b r4 = new com.bxkj.student.v2.ui.h5.js.a$b
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    @android.webkit.JavascriptInterface
    public final void stuOpenBluetooth(@org.jetbrains.annotations.NotNull java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "js->stuOpenBluetooth identify="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r7.a()
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            com.bxkj.student.v2.ui.h5.js.a$f r4 = new com.bxkj.student.v2.ui.h5.js.a$f
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }
}

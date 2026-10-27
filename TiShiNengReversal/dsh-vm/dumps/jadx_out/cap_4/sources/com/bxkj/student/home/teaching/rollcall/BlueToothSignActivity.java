package com.bxkj.student.home.teaching.rollcall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BlueToothSignActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.bluetooth.le.ScanCallback F0;
    private java.lang.String G0;
    private com.bxkj.base.view.WaveView Y;
    private final int Z;
    private android.bluetooth.le.BluetoothLeScanner a0;
    private java.lang.String b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f980k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f981p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements s.b.a {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity a;

        a(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // s.b.a
        public void a() {
                r1 = this;
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.n0(r0)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.m0(r0)
                return
        }

        @Override // s.b.a
        public void b(java.lang.String... r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.s0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "您拒绝了定位权限,无法进行蓝牙签到,请在(设置->应用—>体适能->权限管理->获取定位)设置允许定位后再进行蓝牙签到"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }

        @Override // s.b.a
        public void c(java.lang.String... r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.r0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "您拒绝了定位权限,无法进行蓝牙签到,请在(设置->应用—>体适能->权限管理->获取定位)设置允许定位后再进行蓝牙签到"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                r2.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity a;

        b(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.b r0, android.view.View r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(android.view.View r1) {
                r0 = this;
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r1 = r0.a
                r1.finish()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.t0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.home.teaching.rollcall.h r3 = new com.bxkj.student.home.teaching.rollcall.h
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r2.a
                java.lang.String r1 = "Identify"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.k0(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r2.a
                java.lang.String r1 = "teachingClockingin"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.j0(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r2.a
                java.lang.String r1 = "stuTeacherCurriculum"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.i0(r0, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r2.a
                java.lang.String r1 = "weekNum"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.l0(r0, r3)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r3 = r2.a
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.o0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.bluetooth.le.ScanCallback {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity a;

        c(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "results="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.orhanobut.logger.j.c(r0)
                super.onBatchScanResults(r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                com.orhanobut.logger.j.c(r3)
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int r3) {
                r2 = this;
                super.onScanFailed(r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "errorCode="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                com.orhanobut.logger.j.c(r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.u0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "签到失败,请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        @androidx.annotation.RequiresApi(api = 21)
        public void onScanResult(int r5, android.bluetooth.le.ScanResult r6) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "callbackType="
                r0.append(r1)
                r0.append(r5)
                java.lang.String r2 = "\nre="
                r0.append(r2)
                java.lang.String r3 = r6.toString()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.orhanobut.logger.j.c(r0)
                super.onScanResult(r5, r6)
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r4.a     // Catch: java.lang.Exception -> L7d
                android.bluetooth.le.BluetoothLeScanner r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.g0(r0)     // Catch: java.lang.Exception -> L7d
                r0.stopScan(r4)     // Catch: java.lang.Exception -> L7d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
                r0.<init>()     // Catch: java.lang.Exception -> L7d
                r0.append(r1)     // Catch: java.lang.Exception -> L7d
                r0.append(r5)     // Catch: java.lang.Exception -> L7d
                r0.append(r2)     // Catch: java.lang.Exception -> L7d
                java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L7d
                r0.append(r5)     // Catch: java.lang.Exception -> L7d
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L7d
                com.orhanobut.logger.j.c(r5)     // Catch: java.lang.Exception -> L7d
                android.bluetooth.le.ScanRecord r5 = r6.getScanRecord()     // Catch: java.lang.Exception -> L7d
                java.util.List r5 = r5.getServiceUuids()     // Catch: java.lang.Exception -> L7d
                android.bluetooth.le.ScanRecord r6 = r6.getScanRecord()     // Catch: java.lang.Exception -> L7d
                if (r6 == 0) goto L7d
                if (r5 == 0) goto L7d
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L7d
            L5c:
                boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L7d
                if (r6 == 0) goto L7d
                java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L7d
                android.os.ParcelUuid r6 = (android.os.ParcelUuid) r6     // Catch: java.lang.Exception -> L7d
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L7d
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r4.a     // Catch: java.lang.Exception -> L7d
                java.lang.String r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.h0(r0)     // Catch: java.lang.Exception -> L7d
                boolean r6 = r6.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L7d
                if (r6 == 0) goto L5c
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r5 = r4.a     // Catch: java.lang.Exception -> L7d
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.p0(r5)     // Catch: java.lang.Exception -> L7d
            L7d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.d a;

            a(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$d r1 = r0.a
                    com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r1 = r1.a
                    r1.finish()
                    return
            }
        }

        d(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L17
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a     // Catch: java.lang.Exception -> L17
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.w0(r0)     // Catch: java.lang.Exception -> L17
                r2.<init>(r0)     // Catch: java.lang.Exception -> L17
                java.lang.String r0 = "签到失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)     // Catch: java.lang.Exception -> L17
                r2.show()     // Catch: java.lang.Exception -> L17
            L17:
                return
        }

        public void netOnOtherStatus(int r1, java.lang.String r2) {
                r0 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L14
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r2 = r0.a     // Catch: java.lang.Exception -> L14
                android.content.Context r2 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.x0(r2)     // Catch: java.lang.Exception -> L14
                r1.<init>(r2)     // Catch: java.lang.Exception -> L14
                java.lang.String r2 = "签到失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)     // Catch: java.lang.Exception -> L14
                r1.show()     // Catch: java.lang.Exception -> L14
            L14:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog     // Catch: java.lang.Exception -> L1d
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0 = r1.a     // Catch: java.lang.Exception -> L1d
                android.content.Context r0 = com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity.v0(r0)     // Catch: java.lang.Exception -> L1d
                r2.<init>(r0)     // Catch: java.lang.Exception -> L1d
                java.lang.String r0 = "签到成功"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)     // Catch: java.lang.Exception -> L1d
                com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$d$a r0 = new com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$d$a     // Catch: java.lang.Exception -> L1d
                r0.<init>(r1)     // Catch: java.lang.Exception -> L1d
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)     // Catch: java.lang.Exception -> L1d
                r2.show()     // Catch: java.lang.Exception -> L1d
            L1d:
                return
        }
    }

    public BlueToothSignActivity() {
            r1 = this;
            r1.<init>()
            r0 = 2561(0xa01, float:3.589E-42)
            r1.Z = r0
            return
    }

    @androidx.annotation.RequiresApi(api = 18)
    private void A0() {
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
            com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$b r1 = new com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void B0() {
            r3 = this;
            r0 = 2131299287(0x7f090bd7, float:1.8216571E38)
            android.view.View r0 = r3.findViewById(r0)
            com.bxkj.base.view.WaveView r0 = (com.bxkj.base.view.WaveView) r0
            r3.Y = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            com.bxkj.base.view.WaveView r0 = r3.Y
            android.content.Context r1 = r3.V
            r2 = 2131099714(0x7f060042, float:1.781179E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setColor(r1)
            com.bxkj.base.view.WaveView r0 = r3.Y
            r0.k()
            return
    }

    @androidx.annotation.RequiresApi(api = 18)
    private void D0() {
            r2 = this;
            java.lang.String r0 = "bluetooth"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L19
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L15
            goto L19
        L15:
            r2.F0()
            return
        L19:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.bluetooth.adapter.action.REQUEST_ENABLE"
            r0.<init>(r1)
            r1 = 2561(0xa01, float:3.589E-42)
            r2.startActivityForResult(r0, r1)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    private void E0() {
            r8 = this;
            android.content.Context r0 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            d0.a r2 = (d0.a) r2
            java.lang.String r3 = r8.c0
            java.lang.String r4 = r8.f980k0
            java.lang.String r5 = r8.f981p0
            java.lang.String r6 = r8.G0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r1.getSchoolId()
            rx.e r1 = r2.D1(r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$d r1 = new com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$d
            r1.<init>(r8)
            r0.setDataListener(r1)
            return
    }

    private void F0() {
            r4 = this;
            java.lang.String r0 = "bluetooth"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            android.content.Context r1 = r4.V
            java.lang.String r1 = z0(r1)
            r4.G0 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bluetoothAddress="
            r1.append(r2)
            java.lang.String r2 = r4.G0
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.bluetooth.le.ScanFilter$Builder r2 = new android.bluetooth.le.ScanFilter$Builder
            r2.<init>()
            java.lang.String r3 = r4.b0
            android.os.ParcelUuid r3 = android.os.ParcelUuid.fromString(r3)
            android.bluetooth.le.ScanFilter$Builder r2 = r2.setServiceUuid(r3)
            android.bluetooth.le.ScanFilter r2 = r2.build()
            r1.add(r2)
            android.bluetooth.le.ScanSettings$Builder r2 = new android.bluetooth.le.ScanSettings$Builder
            r2.<init>()
            r3 = 2
            android.bluetooth.le.ScanSettings$Builder r2 = r2.setScanMode(r3)
            android.bluetooth.le.ScanSettings r2 = r2.build()
            com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$c r3 = new com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$c
            r3.<init>(r4)
            r4.F0 = r3
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()
            r4.a0 = r0
            android.bluetooth.le.ScanCallback r3 = r4.F0
            r0.startScan(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ android.bluetooth.le.BluetoothLeScanner g0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.bluetooth.le.BluetoothLeScanner r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            java.lang.String r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0, java.lang.String r1) {
            r0.f980k0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0, java.lang.String r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0, java.lang.String r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0, java.lang.String r1) {
            r0.f981p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            r0.A0()
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            r0.B0()
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            r0.D0()
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            r0.E0()
            return
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context u0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context v0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context w0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context x0(com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static java.lang.String z0(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "bluetooth_address"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(api = 18)
    public void C0(java.lang.String r1) {
            r0 = this;
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

    @androidx.annotation.RequiresApi(api = 18)
    public void R() {
            r3 = this;
            s.b r0 = new s.b
            androidx.fragment.app.FragmentActivity r1 = r3.W
            r0.<init>(r1)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            s.b r0 = r0.c(r1)
            com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$a r1 = new com.bxkj.student.home.teaching.rollcall.BlueToothSignActivity$a
            r1.<init>(r3)
            r0.d(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "上课签到"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            return
    }

    protected void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r1, r2, r3)
            r3 = 2561(0xa01, float:3.589E-42)
            if (r1 != r3) goto L24
            r1 = -1
            if (r2 != r1) goto L13
            java.lang.String r1 = "打开蓝牙成功！"
            com.orhanobut.logger.j.c(r1)
            r0.F0()
            return
        L13:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r2 = r0.V
            r1.<init>(r2)
            java.lang.String r2 = "打开蓝牙失败,将无法签到"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r1 = r1.setMessage(r2)
            r1.show()
            return
        L24:
            java.lang.String r1 = "打开蓝牙异常！"
            com.orhanobut.logger.j.c(r1)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    protected void onDestroy() {
            r2 = this;
            com.bxkj.base.view.WaveView r0 = r2.Y
            if (r0 == 0) goto L7
            r0.l()
        L7:
            android.bluetooth.le.BluetoothLeScanner r0 = r2.a0
            if (r0 == 0) goto L10
            android.bluetooth.le.ScanCallback r1 = r2.F0
            r0.stopScan(r1)
        L10:
            super.onDestroy()
            return
    }

    public java.lang.String y0() {
            r4 = this;
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            r1 = 0
            java.lang.Class<android.bluetooth.BluetoothAdapter> r2 = android.bluetooth.BluetoothAdapter.class
            java.lang.String r3 = "mService"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L18
            return r1
        L18:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "getAddress"
            java.lang.reflect.Method r2 = r2.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L2f
            java.lang.Object r0 = r2.invoke(r0, r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2f
            return r0
        L2f:
            return r1
    }
}

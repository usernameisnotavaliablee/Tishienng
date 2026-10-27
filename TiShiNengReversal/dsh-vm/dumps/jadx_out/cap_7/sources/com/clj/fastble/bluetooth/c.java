package com.clj.fastble.bluetooth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class c {
    private static final java.lang.String f = "00002902-0000-1000-8000-00805f9b34fb";
    private android.bluetooth.BluetoothGatt a;
    private android.bluetooth.BluetoothGattService b;
    private android.bluetooth.BluetoothGattCharacteristic c;
    private com.clj.fastble.bluetooth.b d;
    private android.os.Handler e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.os.Handler {
        final /* synthetic */ com.clj.fastble.bluetooth.c a;

        a(com.clj.fastble.bluetooth.c r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                super.handleMessage(r4)
                int r0 = r4.what
                r1 = 49
                if (r0 == r1) goto L191
                r1 = 50
                if (r0 == r1) goto L166
                r1 = 65
                if (r0 == r1) goto L157
                r1 = 66
                if (r0 == r1) goto L12d
                r1 = 81
                if (r0 == r1) goto L11e
                r1 = 82
                if (r0 == r1) goto Lf4
                r1 = 97
                if (r0 == r1) goto Le5
                r1 = 98
                if (r0 == r1) goto Lbb
                switch(r0) {
                    case 17: goto Lac;
                    case 18: goto L88;
                    case 19: goto L74;
                    default: goto L28;
                }
            L28:
                switch(r0) {
                    case 33: goto L65;
                    case 34: goto L41;
                    case 35: goto L2d;
                    default: goto L2b;
                }
            L2b:
                goto L19f
            L2d:
                java.lang.Object r0 = r4.obj
                d1.c r0 = (d1.c) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "indicate_value"
                byte[] r4 = r4.getByteArray(r1)
                if (r0 == 0) goto L19f
                r0.e(r4)
                return
            L41:
                com.clj.fastble.bluetooth.c r0 = r3.a
                r0.l()
                java.lang.Object r0 = r4.obj
                d1.c r0 = (d1.c) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "indicate_status"
                int r4 = r4.getInt(r1)
                if (r0 == 0) goto L19f
                if (r4 != 0) goto L5c
                r0.g()
                return
            L5c:
                com.clj.fastble.exception.GattException r1 = new com.clj.fastble.exception.GattException
                r1.<init>(r4)
                r0.f(r1)
                return
            L65:
                java.lang.Object r4 = r4.obj
                d1.c r4 = (d1.c) r4
                if (r4 == 0) goto L19f
                com.clj.fastble.exception.TimeoutException r0 = new com.clj.fastble.exception.TimeoutException
                r0.<init>()
                r4.f(r0)
                return
            L74:
                java.lang.Object r0 = r4.obj
                d1.e r0 = (d1.e) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "notify_value"
                byte[] r4 = r4.getByteArray(r1)
                if (r0 == 0) goto L19f
                r0.e(r4)
                return
            L88:
                com.clj.fastble.bluetooth.c r0 = r3.a
                r0.n()
                java.lang.Object r0 = r4.obj
                d1.e r0 = (d1.e) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "notify_status"
                int r4 = r4.getInt(r1)
                if (r0 == 0) goto L19f
                if (r4 != 0) goto La3
                r0.g()
                return
            La3:
                com.clj.fastble.exception.GattException r1 = new com.clj.fastble.exception.GattException
                r1.<init>(r4)
                r0.f(r1)
                return
            Lac:
                java.lang.Object r4 = r4.obj
                d1.e r4 = (d1.e) r4
                if (r4 == 0) goto L19f
                com.clj.fastble.exception.TimeoutException r0 = new com.clj.fastble.exception.TimeoutException
                r0.<init>()
                r4.f(r0)
                return
            Lbb:
                com.clj.fastble.bluetooth.c r0 = r3.a
                r0.m()
                java.lang.Object r0 = r4.obj
                d1.d r0 = (d1.d) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "mtu_status"
                int r1 = r4.getInt(r1)
                java.lang.String r2 = "mtu_value"
                int r4 = r4.getInt(r2)
                if (r0 == 0) goto L19f
                if (r1 != 0) goto Ldc
                r0.e(r4)
                return
            Ldc:
                com.clj.fastble.exception.GattException r4 = new com.clj.fastble.exception.GattException
                r4.<init>(r1)
                r0.f(r4)
                return
            Le5:
                java.lang.Object r4 = r4.obj
                d1.d r4 = (d1.d) r4
                if (r4 == 0) goto L19f
                com.clj.fastble.exception.TimeoutException r0 = new com.clj.fastble.exception.TimeoutException
                r0.<init>()
                r4.f(r0)
                return
            Lf4:
                com.clj.fastble.bluetooth.c r0 = r3.a
                r0.s()
                java.lang.Object r0 = r4.obj
                d1.g r0 = (d1.g) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "rssi_status"
                int r1 = r4.getInt(r1)
                java.lang.String r2 = "rssi_value"
                int r4 = r4.getInt(r2)
                if (r0 == 0) goto L19f
                if (r1 != 0) goto L115
                r0.f(r4)
                return
            L115:
                com.clj.fastble.exception.GattException r4 = new com.clj.fastble.exception.GattException
                r4.<init>(r1)
                r0.e(r4)
                return
            L11e:
                java.lang.Object r4 = r4.obj
                d1.g r4 = (d1.g) r4
                if (r4 == 0) goto L19f
                com.clj.fastble.exception.TimeoutException r0 = new com.clj.fastble.exception.TimeoutException
                r0.<init>()
                r4.e(r0)
                return
            L12d:
                com.clj.fastble.bluetooth.c r0 = r3.a
                r0.p()
                java.lang.Object r0 = r4.obj
                d1.f r0 = (d1.f) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "read_status"
                int r1 = r4.getInt(r1)
                java.lang.String r2 = "read_value"
                byte[] r4 = r4.getByteArray(r2)
                if (r0 == 0) goto L19f
                if (r1 != 0) goto L14e
                r0.f(r4)
                return
            L14e:
                com.clj.fastble.exception.GattException r4 = new com.clj.fastble.exception.GattException
                r4.<init>(r1)
                r0.e(r4)
                return
            L157:
                java.lang.Object r4 = r4.obj
                d1.f r4 = (d1.f) r4
                if (r4 == 0) goto L19f
                com.clj.fastble.exception.TimeoutException r0 = new com.clj.fastble.exception.TimeoutException
                r0.<init>()
                r4.e(r0)
                return
            L166:
                com.clj.fastble.bluetooth.c r0 = r3.a
                r0.z()
                java.lang.Object r0 = r4.obj
                d1.k r0 = (d1.k) r0
                android.os.Bundle r4 = r4.getData()
                java.lang.String r1 = "write_status"
                int r1 = r4.getInt(r1)
                java.lang.String r2 = "write_value"
                byte[] r4 = r4.getByteArray(r2)
                if (r0 == 0) goto L19f
                if (r1 != 0) goto L188
                r1 = 1
                r0.f(r1, r1, r4)
                return
            L188:
                com.clj.fastble.exception.GattException r4 = new com.clj.fastble.exception.GattException
                r4.<init>(r1)
                r0.e(r4)
                return
            L191:
                java.lang.Object r4 = r4.obj
                d1.k r4 = (d1.k) r4
                if (r4 == 0) goto L19f
                com.clj.fastble.exception.TimeoutException r0 = new com.clj.fastble.exception.TimeoutException
                r0.<init>()
                r4.e(r0)
            L19f:
                return
        }
    }

    c(com.clj.fastble.bluetooth.b r2) {
            r1 = this;
            r1.<init>()
            r1.d = r2
            android.bluetooth.BluetoothGatt r2 = r2.I()
            r1.a = r2
            com.clj.fastble.bluetooth.c$a r2 = new com.clj.fastble.bluetooth.c$a
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r1, r0)
            r1.e = r2
            return
    }

    private java.util.UUID e(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            return r1
    }

    private void f(d1.c r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L26
            r2.l()
            r3.d(r4)
            android.os.Handler r0 = r2.e
            r3.c(r0)
            com.clj.fastble.bluetooth.b r0 = r2.d
            r0.v(r4, r3)
            android.os.Handler r4 = r2.e
            r0 = 33
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            int r0 = r0.y()
            long r0 = (long) r0
            r4.sendMessageDelayed(r3, r0)
        L26:
            return
    }

    private void g(d1.e r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L26
            r2.n()
            r3.d(r4)
            android.os.Handler r0 = r2.e
            r3.c(r0)
            com.clj.fastble.bluetooth.b r0 = r2.d
            r0.x(r4, r3)
            android.os.Handler r4 = r2.e
            r0 = 17
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            int r0 = r0.y()
            long r0 = (long) r0
            r4.sendMessageDelayed(r3, r0)
        L26:
            return
    }

    private void h(d1.f r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L26
            r2.p()
            r3.d(r4)
            android.os.Handler r0 = r2.e
            r3.c(r0)
            com.clj.fastble.bluetooth.b r0 = r2.d
            r0.y(r4, r3)
            android.os.Handler r4 = r2.e
            r0 = 65
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            int r0 = r0.y()
            long r0 = (long) r0
            r4.sendMessageDelayed(r3, r0)
        L26:
            return
    }

    private void i(d1.k r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L26
            r2.z()
            r3.d(r4)
            android.os.Handler r0 = r2.e
            r3.c(r0)
            com.clj.fastble.bluetooth.b r0 = r2.d
            r0.A(r4, r3)
            android.os.Handler r4 = r2.e
            r0 = 49
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            com.clj.fastble.a r0 = com.clj.fastble.a.v()
            int r0 = r0.y()
            long r0 = (long) r0
            r4.sendMessageDelayed(r3, r0)
        L26:
            return
    }

    private void j(d1.g r4) {
            r3 = this;
            if (r4 == 0) goto L23
            r3.s()
            android.os.Handler r0 = r3.e
            r4.c(r0)
            com.clj.fastble.bluetooth.b r0 = r3.d
            r0.z(r4)
            android.os.Handler r0 = r3.e
            r1 = 81
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            com.clj.fastble.a r1 = com.clj.fastble.a.v()
            int r1 = r1.y()
            long r1 = (long) r1
            r0.sendMessageDelayed(r4, r1)
        L23:
            return
    }

    private void k(d1.d r4) {
            r3 = this;
            if (r4 == 0) goto L23
            r3.m()
            android.os.Handler r0 = r3.e
            r4.c(r0)
            com.clj.fastble.bluetooth.b r0 = r3.d
            r0.w(r4)
            android.os.Handler r0 = r3.e
            r1 = 97
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            com.clj.fastble.a r1 = com.clj.fastble.a.v()
            int r1 = r1.y()
            long r1 = (long) r1
            r0.sendMessageDelayed(r4, r1)
        L23:
            return
    }

    private boolean t(android.bluetooth.BluetoothGatt r3, android.bluetooth.BluetoothGattCharacteristic r4, boolean r5, boolean r6, d1.c r7) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L63
            if (r4 != 0) goto L6
            goto L63
        L6:
            boolean r1 = r3.setCharacteristicNotification(r4, r6)
            if (r1 != 0) goto L1c
            r2.l()
            if (r7 == 0) goto L1b
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "gatt setCharacteristicNotification fail"
            r3.<init>(r4)
            r7.f(r3)
        L1b:
            return r0
        L1c:
            if (r5 == 0) goto L27
            java.util.UUID r5 = r4.getUuid()
            android.bluetooth.BluetoothGattDescriptor r4 = r4.getDescriptor(r5)
            goto L31
        L27:
            java.lang.String r5 = "00002902-0000-1000-8000-00805f9b34fb"
            java.util.UUID r5 = r2.e(r5)
            android.bluetooth.BluetoothGattDescriptor r4 = r4.getDescriptor(r5)
        L31:
            if (r4 != 0) goto L43
            r2.l()
            if (r7 == 0) goto L42
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "descriptor equals null"
            r3.<init>(r4)
            r7.f(r3)
        L42:
            return r0
        L43:
            if (r6 == 0) goto L48
            byte[] r5 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
            goto L4a
        L48:
            byte[] r5 = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
        L4a:
            r4.setValue(r5)
            boolean r3 = r3.writeDescriptor(r4)
            if (r3 != 0) goto L62
            r2.l()
            if (r7 == 0) goto L62
            com.clj.fastble.exception.OtherException r4 = new com.clj.fastble.exception.OtherException
            java.lang.String r5 = "gatt writeDescriptor fail"
            r4.<init>(r5)
            r7.f(r4)
        L62:
            return r3
        L63:
            r2.l()
            if (r7 == 0) goto L72
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "gatt or characteristic equal null"
            r3.<init>(r4)
            r7.f(r3)
        L72:
            return r0
    }

    private boolean u(android.bluetooth.BluetoothGatt r3, android.bluetooth.BluetoothGattCharacteristic r4, boolean r5, boolean r6, d1.e r7) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L63
            if (r4 != 0) goto L6
            goto L63
        L6:
            boolean r1 = r3.setCharacteristicNotification(r4, r6)
            if (r1 != 0) goto L1c
            r2.n()
            if (r7 == 0) goto L1b
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "gatt setCharacteristicNotification fail"
            r3.<init>(r4)
            r7.f(r3)
        L1b:
            return r0
        L1c:
            if (r5 == 0) goto L27
            java.util.UUID r5 = r4.getUuid()
            android.bluetooth.BluetoothGattDescriptor r4 = r4.getDescriptor(r5)
            goto L31
        L27:
            java.lang.String r5 = "00002902-0000-1000-8000-00805f9b34fb"
            java.util.UUID r5 = r2.e(r5)
            android.bluetooth.BluetoothGattDescriptor r4 = r4.getDescriptor(r5)
        L31:
            if (r4 != 0) goto L43
            r2.n()
            if (r7 == 0) goto L42
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "descriptor equals null"
            r3.<init>(r4)
            r7.f(r3)
        L42:
            return r0
        L43:
            if (r6 == 0) goto L48
            byte[] r5 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
            goto L4a
        L48:
            byte[] r5 = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
        L4a:
            r4.setValue(r5)
            boolean r3 = r3.writeDescriptor(r4)
            if (r3 != 0) goto L62
            r2.n()
            if (r7 == 0) goto L62
            com.clj.fastble.exception.OtherException r4 = new com.clj.fastble.exception.OtherException
            java.lang.String r5 = "gatt writeDescriptor fail"
            r4.<init>(r5)
            r7.f(r4)
        L62:
            return r3
        L63:
            r2.n()
            if (r7 == 0) goto L72
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "gatt or characteristic equal null"
            r3.<init>(r4)
            r7.f(r3)
        L72:
            return r0
    }

    private com.clj.fastble.bluetooth.c w(java.util.UUID r2, java.util.UUID r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.bluetooth.BluetoothGatt r0 = r1.a
            if (r0 == 0) goto Lc
            android.bluetooth.BluetoothGattService r2 = r0.getService(r2)
            r1.b = r2
        Lc:
            android.bluetooth.BluetoothGattService r2 = r1.b
            if (r2 == 0) goto L18
            if (r3 == 0) goto L18
            android.bluetooth.BluetoothGattCharacteristic r2 = r2.getCharacteristic(r3)
            r1.c = r2
        L18:
            return r1
    }

    public boolean a(boolean r8) {
            r7 = this;
            android.bluetooth.BluetoothGattCharacteristic r0 = r7.c
            if (r0 == 0) goto L19
            int r0 = r0.getProperties()
            r0 = r0 | 16
            if (r0 <= 0) goto L19
            android.bluetooth.BluetoothGatt r2 = r7.a
            android.bluetooth.BluetoothGattCharacteristic r3 = r7.c
            r5 = 0
            r6 = 0
            r1 = r7
            r4 = r8
            boolean r8 = r1.t(r2, r3, r4, r5, r6)
            return r8
        L19:
            r8 = 0
            return r8
    }

    public boolean b(boolean r8) {
            r7 = this;
            android.bluetooth.BluetoothGattCharacteristic r0 = r7.c
            if (r0 == 0) goto L19
            int r0 = r0.getProperties()
            r0 = r0 | 16
            if (r0 <= 0) goto L19
            android.bluetooth.BluetoothGatt r2 = r7.a
            android.bluetooth.BluetoothGattCharacteristic r3 = r7.c
            r5 = 0
            r6 = 0
            r1 = r7
            r4 = r8
            boolean r8 = r1.u(r2, r3, r4, r5, r6)
            return r8
        L19:
            r8 = 0
            return r8
    }

    public void c(d1.c r8, java.lang.String r9, boolean r10) {
            r7 = this;
            android.bluetooth.BluetoothGattCharacteristic r0 = r7.c
            if (r0 == 0) goto L1b
            int r0 = r0.getProperties()
            r0 = r0 | 16
            if (r0 <= 0) goto L1b
            r7.f(r8, r9)
            android.bluetooth.BluetoothGatt r2 = r7.a
            android.bluetooth.BluetoothGattCharacteristic r3 = r7.c
            r5 = 1
            r1 = r7
            r6 = r8
            r4 = r10
            r1.t(r2, r3, r4, r5, r6)
            return
        L1b:
            r6 = r8
            if (r6 == 0) goto L28
            com.clj.fastble.exception.OtherException r8 = new com.clj.fastble.exception.OtherException
            java.lang.String r9 = "this characteristic not support indicate!"
            r8.<init>(r9)
            r6.f(r8)
        L28:
            return
    }

    public void d(d1.e r8, java.lang.String r9, boolean r10) {
            r7 = this;
            android.bluetooth.BluetoothGattCharacteristic r0 = r7.c
            if (r0 == 0) goto L1b
            int r0 = r0.getProperties()
            r0 = r0 | 16
            if (r0 <= 0) goto L1b
            r7.g(r8, r9)
            android.bluetooth.BluetoothGatt r2 = r7.a
            android.bluetooth.BluetoothGattCharacteristic r3 = r7.c
            r5 = 1
            r1 = r7
            r6 = r8
            r4 = r10
            r1.u(r2, r3, r4, r5, r6)
            return
        L1b:
            r6 = r8
            if (r6 == 0) goto L28
            com.clj.fastble.exception.OtherException r8 = new com.clj.fastble.exception.OtherException
            java.lang.String r9 = "this characteristic not support notify!"
            r8.<init>(r9)
            r6.f(r8)
        L28:
            return
    }

    public void l() {
            r2 = this;
            android.os.Handler r0 = r2.e
            r1 = 33
            r0.removeMessages(r1)
            return
    }

    public void m() {
            r2 = this;
            android.os.Handler r0 = r2.e
            r1 = 97
            r0.removeMessages(r1)
            return
    }

    public void n() {
            r2 = this;
            android.os.Handler r0 = r2.e
            r1 = 17
            r0.removeMessages(r1)
            return
    }

    public void o(d1.f r2, java.lang.String r3) {
            r1 = this;
            android.bluetooth.BluetoothGattCharacteristic r0 = r1.c
            if (r0 == 0) goto L29
            int r0 = r0.getProperties()
            r0 = r0 & 2
            if (r0 <= 0) goto L29
            r1.h(r2, r3)
            android.bluetooth.BluetoothGatt r3 = r1.a
            android.bluetooth.BluetoothGattCharacteristic r0 = r1.c
            boolean r3 = r3.readCharacteristic(r0)
            if (r3 != 0) goto L35
            r1.p()
            if (r2 == 0) goto L35
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r0 = "gatt readCharacteristic fail"
            r3.<init>(r0)
            r2.e(r3)
            return
        L29:
            if (r2 == 0) goto L35
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r0 = "this characteristic not support read!"
            r3.<init>(r0)
            r2.e(r3)
        L35:
            return
    }

    public void p() {
            r2 = this;
            android.os.Handler r0 = r2.e
            r1 = 65
            r0.removeMessages(r1)
            return
    }

    public void q(d1.g r3) {
            r2 = this;
            r2.j(r3)
            android.bluetooth.BluetoothGatt r0 = r2.a
            boolean r0 = r0.readRemoteRssi()
            if (r0 != 0) goto L1a
            r2.s()
            if (r3 == 0) goto L1a
            com.clj.fastble.exception.OtherException r0 = new com.clj.fastble.exception.OtherException
            java.lang.String r1 = "gatt readRemoteRssi fail"
            r0.<init>(r1)
            r3.e(r0)
        L1a:
            return
    }

    public boolean r(int r2) {
            r1 = this;
            android.bluetooth.BluetoothGatt r0 = r1.a
            boolean r2 = r0.requestConnectionPriority(r2)
            return r2
    }

    public void s() {
            r2 = this;
            android.os.Handler r0 = r2.e
            r1 = 81
            r0.removeMessages(r1)
            return
    }

    public void v(int r2, d1.d r3) {
            r1 = this;
            r1.k(r3)
            android.bluetooth.BluetoothGatt r0 = r1.a
            boolean r2 = r0.requestMtu(r2)
            if (r2 != 0) goto L1a
            r1.m()
            if (r3 == 0) goto L1a
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r0 = "gatt requestMtu fail"
            r2.<init>(r0)
            r3.f(r2)
        L1a:
            return
    }

    public com.clj.fastble.bluetooth.c x(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.util.UUID r1 = r0.e(r1)
            java.util.UUID r2 = r0.e(r2)
            com.clj.fastble.bluetooth.c r1 = r0.w(r1, r2)
            return r1
    }

    public void y(byte[] r2, d1.k r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L52
            int r0 = r2.length
            if (r0 > 0) goto L6
            goto L52
        L6:
            android.bluetooth.BluetoothGattCharacteristic r0 = r1.c
            if (r0 == 0) goto L45
            int r0 = r0.getProperties()
            r0 = r0 & 12
            if (r0 != 0) goto L13
            goto L45
        L13:
            android.bluetooth.BluetoothGattCharacteristic r0 = r1.c
            boolean r2 = r0.setValue(r2)
            if (r2 == 0) goto L38
            r1.i(r3, r4)
            android.bluetooth.BluetoothGatt r2 = r1.a
            android.bluetooth.BluetoothGattCharacteristic r4 = r1.c
            boolean r2 = r2.writeCharacteristic(r4)
            if (r2 != 0) goto L5e
            r1.z()
            if (r3 == 0) goto L5e
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "gatt writeCharacteristic fail"
            r2.<init>(r4)
            r3.e(r2)
            return
        L38:
            if (r3 == 0) goto L5e
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "Updates the locally stored value of this characteristic fail"
            r2.<init>(r4)
            r3.e(r2)
            return
        L45:
            if (r3 == 0) goto L5e
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "this characteristic not support write!"
            r2.<init>(r4)
            r3.e(r2)
            return
        L52:
            if (r3 == 0) goto L5e
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "the data to be written is empty"
            r2.<init>(r4)
            r3.e(r2)
        L5e:
            return
    }

    public void z() {
            r2 = this;
            android.os.Handler r0 = r2.e
            r1 = 49
            r0.removeMessages(r1)
            return
    }
}

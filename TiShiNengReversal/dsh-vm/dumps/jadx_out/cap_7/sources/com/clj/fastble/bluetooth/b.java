package com.clj.fastble.bluetooth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class b {
    private d1.b a;
    private d1.g b;
    private d1.d c;
    private java.util.HashMap<java.lang.String, d1.e> d;
    private java.util.HashMap<java.lang.String, d1.c> e;
    private java.util.HashMap<java.lang.String, d1.k> f;
    private java.util.HashMap<java.lang.String, d1.f> g;
    private com.clj.fastble.bluetooth.b.EnumC0132b h;
    private boolean i;
    private com.clj.fastble.data.BleDevice j;
    private android.bluetooth.BluetoothGatt k;
    private com.clj.fastble.bluetooth.b.c l;
    private int m;
    private android.bluetooth.BluetoothGattCallback n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.bluetooth.BluetoothGattCallback {
        final /* synthetic */ com.clj.fastble.bluetooth.b a;

        a(com.clj.fastble.bluetooth.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(android.bluetooth.BluetoothGatt r6, android.bluetooth.BluetoothGattCharacteristic r7) {
                r5 = this;
                super.onCharacteristicChanged(r6, r7)
                com.clj.fastble.bluetooth.b r6 = r5.a
                java.util.HashMap r6 = com.clj.fastble.bluetooth.b.c(r6)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L11:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L5e
                java.lang.Object r0 = r6.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                boolean r1 = r0 instanceof d1.e
                if (r1 == 0) goto L11
                d1.e r0 = (d1.e) r0
                java.util.UUID r1 = r7.getUuid()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.b()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L11
                android.os.Handler r1 = r0.a()
                if (r1 == 0) goto L11
                android.os.Message r2 = r1.obtainMessage()
                r3 = 19
                r2.what = r3
                r2.obj = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "notify_value"
                byte[] r4 = r7.getValue()
                r0.putByteArray(r3, r4)
                r2.setData(r0)
                r1.sendMessage(r2)
                goto L11
            L5e:
                com.clj.fastble.bluetooth.b r6 = r5.a
                java.util.HashMap r6 = com.clj.fastble.bluetooth.b.d(r6)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L6c:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto Lb9
                java.lang.Object r0 = r6.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                boolean r1 = r0 instanceof d1.c
                if (r1 == 0) goto L6c
                d1.c r0 = (d1.c) r0
                java.util.UUID r1 = r7.getUuid()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.b()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L6c
                android.os.Handler r1 = r0.a()
                if (r1 == 0) goto L6c
                android.os.Message r2 = r1.obtainMessage()
                r3 = 35
                r2.what = r3
                r2.obj = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "indicate_value"
                byte[] r4 = r7.getValue()
                r0.putByteArray(r3, r4)
                r2.setData(r0)
                r1.sendMessage(r2)
                goto L6c
            Lb9:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(android.bluetooth.BluetoothGatt r6, android.bluetooth.BluetoothGattCharacteristic r7, int r8) {
                r5 = this;
                super.onCharacteristicRead(r6, r7, r8)
                com.clj.fastble.bluetooth.b r6 = r5.a
                java.util.HashMap r6 = com.clj.fastble.bluetooth.b.f(r6)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L11:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L63
                java.lang.Object r0 = r6.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                boolean r1 = r0 instanceof d1.f
                if (r1 == 0) goto L11
                d1.f r0 = (d1.f) r0
                java.util.UUID r1 = r7.getUuid()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.b()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L11
                android.os.Handler r1 = r0.a()
                if (r1 == 0) goto L11
                android.os.Message r2 = r1.obtainMessage()
                r3 = 66
                r2.what = r3
                r2.obj = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "read_status"
                r0.putInt(r3, r8)
                java.lang.String r3 = "read_value"
                byte[] r4 = r7.getValue()
                r0.putByteArray(r3, r4)
                r2.setData(r0)
                r1.sendMessage(r2)
                goto L11
            L63:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(android.bluetooth.BluetoothGatt r6, android.bluetooth.BluetoothGattCharacteristic r7, int r8) {
                r5 = this;
                super.onCharacteristicWrite(r6, r7, r8)
                com.clj.fastble.bluetooth.b r6 = r5.a
                java.util.HashMap r6 = com.clj.fastble.bluetooth.b.e(r6)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L11:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L63
                java.lang.Object r0 = r6.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                boolean r1 = r0 instanceof d1.k
                if (r1 == 0) goto L11
                d1.k r0 = (d1.k) r0
                java.util.UUID r1 = r7.getUuid()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.b()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L11
                android.os.Handler r1 = r0.a()
                if (r1 == 0) goto L11
                android.os.Message r2 = r1.obtainMessage()
                r3 = 50
                r2.what = r3
                r2.obj = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "write_status"
                r0.putInt(r3, r8)
                java.lang.String r3 = "write_value"
                byte[] r4 = r7.getValue()
                r0.putByteArray(r3, r4)
                r2.setData(r0)
                r1.sendMessage(r2)
                goto L11
            L63:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothGatt r4, int r5, int r6) {
                r3 = this;
                super.onConnectionStateChange(r4, r5, r6)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BluetoothGattCallback：onConnectionStateChange \nstatus: "
                r0.append(r1)
                r0.append(r5)
                r1 = 10
                r0.append(r1)
                java.lang.String r2 = "newState: "
                r0.append(r2)
                r0.append(r6)
                r0.append(r1)
                java.lang.String r1 = "currentThread: "
                r0.append(r1)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                long r1 = r1.getId()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.clj.fastble.utils.a.c(r0)
                com.clj.fastble.bluetooth.b r0 = r3.a
                com.clj.fastble.bluetooth.b.r(r0, r4)
                com.clj.fastble.bluetooth.b r4 = r3.a
                com.clj.fastble.bluetooth.b$c r4 = com.clj.fastble.bluetooth.b.l(r4)
                r0 = 7
                r4.removeMessages(r0)
                r4 = 2
                if (r6 != r4) goto L62
                com.clj.fastble.bluetooth.b r4 = r3.a
                com.clj.fastble.bluetooth.b$c r4 = com.clj.fastble.bluetooth.b.l(r4)
                android.os.Message r4 = r4.obtainMessage()
                r5 = 4
                r4.what = r5
                com.clj.fastble.bluetooth.b r5 = r3.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                r0 = 500(0x1f4, double:2.47E-321)
                r5.sendMessageDelayed(r4, r0)
                return
            L62:
                if (r6 != 0) goto Lbb
                com.clj.fastble.bluetooth.b r6 = r3.a
                com.clj.fastble.bluetooth.b$b r6 = com.clj.fastble.bluetooth.b.m(r6)
                com.clj.fastble.bluetooth.b$b r0 = com.clj.fastble.bluetooth.b.EnumC0132b.b
                if (r6 != r0) goto L8c
                com.clj.fastble.bluetooth.b r4 = r3.a
                com.clj.fastble.bluetooth.b$c r4 = com.clj.fastble.bluetooth.b.l(r4)
                android.os.Message r4 = r4.obtainMessage()
                r6 = 1
                r4.what = r6
                com.clj.fastble.data.a r6 = new com.clj.fastble.data.a
                r6.<init>(r5)
                r4.obj = r6
                com.clj.fastble.bluetooth.b r5 = r3.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                r5.sendMessage(r4)
                return
            L8c:
                com.clj.fastble.bluetooth.b r6 = r3.a
                com.clj.fastble.bluetooth.b$b r6 = com.clj.fastble.bluetooth.b.m(r6)
                com.clj.fastble.bluetooth.b$b r0 = com.clj.fastble.bluetooth.b.EnumC0132b.c
                if (r6 != r0) goto Lbb
                com.clj.fastble.bluetooth.b r6 = r3.a
                com.clj.fastble.bluetooth.b$c r6 = com.clj.fastble.bluetooth.b.l(r6)
                android.os.Message r6 = r6.obtainMessage()
                r6.what = r4
                com.clj.fastble.data.a r4 = new com.clj.fastble.data.a
                r4.<init>(r5)
                com.clj.fastble.bluetooth.b r5 = r3.a
                boolean r5 = com.clj.fastble.bluetooth.b.s(r5)
                r4.c(r5)
                r6.obj = r4
                com.clj.fastble.bluetooth.b r4 = r3.a
                com.clj.fastble.bluetooth.b$c r4 = com.clj.fastble.bluetooth.b.l(r4)
                r4.sendMessage(r6)
            Lbb:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(android.bluetooth.BluetoothGatt r5, android.bluetooth.BluetoothGattDescriptor r6, int r7) {
                r4 = this;
                super.onDescriptorWrite(r5, r6, r7)
                com.clj.fastble.bluetooth.b r5 = r4.a
                java.util.HashMap r5 = com.clj.fastble.bluetooth.b.c(r5)
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L11:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L5e
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                boolean r1 = r0 instanceof d1.e
                if (r1 == 0) goto L11
                d1.e r0 = (d1.e) r0
                android.bluetooth.BluetoothGattCharacteristic r1 = r6.getCharacteristic()
                java.util.UUID r1 = r1.getUuid()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.b()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L11
                android.os.Handler r1 = r0.a()
                if (r1 == 0) goto L11
                android.os.Message r2 = r1.obtainMessage()
                r3 = 18
                r2.what = r3
                r2.obj = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "notify_status"
                r0.putInt(r3, r7)
                r2.setData(r0)
                r1.sendMessage(r2)
                goto L11
            L5e:
                com.clj.fastble.bluetooth.b r5 = r4.a
                java.util.HashMap r5 = com.clj.fastble.bluetooth.b.d(r5)
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L6c:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto Lb9
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                boolean r1 = r0 instanceof d1.c
                if (r1 == 0) goto L6c
                d1.c r0 = (d1.c) r0
                android.bluetooth.BluetoothGattCharacteristic r1 = r6.getCharacteristic()
                java.util.UUID r1 = r1.getUuid()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r0.b()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L6c
                android.os.Handler r1 = r0.a()
                if (r1 == 0) goto L6c
                android.os.Message r2 = r1.obtainMessage()
                r3 = 34
                r2.what = r3
                r2.obj = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "indicate_status"
                r0.putInt(r3, r7)
                r2.setData(r0)
                r1.sendMessage(r2)
                goto L6c
            Lb9:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(android.bluetooth.BluetoothGatt r4, int r5, int r6) {
                r3 = this;
                super.onMtuChanged(r4, r5, r6)
                com.clj.fastble.bluetooth.b r4 = r3.a
                d1.d r4 = com.clj.fastble.bluetooth.b.h(r4)
                if (r4 == 0) goto L3c
                com.clj.fastble.bluetooth.b r4 = r3.a
                d1.d r4 = com.clj.fastble.bluetooth.b.h(r4)
                android.os.Handler r4 = r4.a()
                if (r4 == 0) goto L3c
                android.os.Message r0 = r4.obtainMessage()
                r1 = 98
                r0.what = r1
                com.clj.fastble.bluetooth.b r1 = r3.a
                d1.d r1 = com.clj.fastble.bluetooth.b.h(r1)
                r0.obj = r1
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "mtu_status"
                r1.putInt(r2, r6)
                java.lang.String r6 = "mtu_value"
                r1.putInt(r6, r5)
                r0.setData(r1)
                r4.sendMessage(r0)
            L3c:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(android.bluetooth.BluetoothGatt r4, int r5, int r6) {
                r3 = this;
                super.onReadRemoteRssi(r4, r5, r6)
                com.clj.fastble.bluetooth.b r4 = r3.a
                d1.g r4 = com.clj.fastble.bluetooth.b.g(r4)
                if (r4 == 0) goto L3c
                com.clj.fastble.bluetooth.b r4 = r3.a
                d1.g r4 = com.clj.fastble.bluetooth.b.g(r4)
                android.os.Handler r4 = r4.a()
                if (r4 == 0) goto L3c
                android.os.Message r0 = r4.obtainMessage()
                r1 = 82
                r0.what = r1
                com.clj.fastble.bluetooth.b r1 = r3.a
                d1.g r1 = com.clj.fastble.bluetooth.b.g(r1)
                r0.obj = r1
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "rssi_status"
                r1.putInt(r2, r6)
                java.lang.String r6 = "rssi_value"
                r1.putInt(r6, r5)
                r0.setData(r1)
                r4.sendMessage(r0)
            L3c:
                return
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(android.bluetooth.BluetoothGatt r4, int r5) {
                r3 = this;
                super.onServicesDiscovered(r4, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BluetoothGattCallback：onServicesDiscovered \nstatus: "
                r0.append(r1)
                r0.append(r5)
                r1 = 10
                r0.append(r1)
                java.lang.String r1 = "currentThread: "
                r0.append(r1)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                long r1 = r1.getId()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.clj.fastble.utils.a.c(r0)
                com.clj.fastble.bluetooth.b r0 = r3.a
                com.clj.fastble.bluetooth.b.r(r0, r4)
                if (r5 != 0) goto L51
                com.clj.fastble.bluetooth.b r4 = r3.a
                com.clj.fastble.bluetooth.b$c r4 = com.clj.fastble.bluetooth.b.l(r4)
                android.os.Message r4 = r4.obtainMessage()
                r0 = 6
                r4.what = r0
                com.clj.fastble.data.a r0 = new com.clj.fastble.data.a
                r0.<init>(r5)
                r4.obj = r0
                com.clj.fastble.bluetooth.b r5 = r3.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                r5.sendMessage(r4)
                return
            L51:
                com.clj.fastble.bluetooth.b r4 = r3.a
                com.clj.fastble.bluetooth.b$c r4 = com.clj.fastble.bluetooth.b.l(r4)
                android.os.Message r4 = r4.obtainMessage()
                r5 = 5
                r4.what = r5
                com.clj.fastble.bluetooth.b r5 = r3.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                r5.sendMessage(r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.clj.fastble.bluetooth.b$b, reason: collision with other inner class name */
    enum EnumC0132b extends java.lang.Enum<com.clj.fastble.bluetooth.b.EnumC0132b> {
        public static final com.clj.fastble.bluetooth.b.EnumC0132b a = null;
        public static final com.clj.fastble.bluetooth.b.EnumC0132b b = null;
        public static final com.clj.fastble.bluetooth.b.EnumC0132b c = null;
        public static final com.clj.fastble.bluetooth.b.EnumC0132b d = null;
        public static final com.clj.fastble.bluetooth.b.EnumC0132b e = null;
        private static final /* synthetic */ com.clj.fastble.bluetooth.b.EnumC0132b[] f = null;

        static {
                com.clj.fastble.bluetooth.b$b r0 = new com.clj.fastble.bluetooth.b$b
                java.lang.String r1 = "CONNECT_IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.clj.fastble.bluetooth.b.EnumC0132b.a = r0
                com.clj.fastble.bluetooth.b$b r1 = new com.clj.fastble.bluetooth.b$b
                java.lang.String r3 = "CONNECT_CONNECTING"
                r4 = 1
                r1.<init>(r3, r4)
                com.clj.fastble.bluetooth.b.EnumC0132b.b = r1
                com.clj.fastble.bluetooth.b$b r3 = new com.clj.fastble.bluetooth.b$b
                java.lang.String r5 = "CONNECT_CONNECTED"
                r6 = 2
                r3.<init>(r5, r6)
                com.clj.fastble.bluetooth.b.EnumC0132b.c = r3
                com.clj.fastble.bluetooth.b$b r5 = new com.clj.fastble.bluetooth.b$b
                java.lang.String r7 = "CONNECT_FAILURE"
                r8 = 3
                r5.<init>(r7, r8)
                com.clj.fastble.bluetooth.b.EnumC0132b.d = r5
                com.clj.fastble.bluetooth.b$b r7 = new com.clj.fastble.bluetooth.b$b
                java.lang.String r9 = "CONNECT_DISCONNECT"
                r10 = 4
                r7.<init>(r9, r10)
                com.clj.fastble.bluetooth.b.EnumC0132b.e = r7
                r9 = 5
                com.clj.fastble.bluetooth.b$b[] r9 = new com.clj.fastble.bluetooth.b.EnumC0132b[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.clj.fastble.bluetooth.b.EnumC0132b.f = r9
                return
        }

        EnumC0132b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.clj.fastble.bluetooth.b.EnumC0132b valueOf(java.lang.String r1) {
                java.lang.Class<com.clj.fastble.bluetooth.b$b> r0 = com.clj.fastble.bluetooth.b.EnumC0132b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.clj.fastble.bluetooth.b$b r1 = (com.clj.fastble.bluetooth.b.EnumC0132b) r1
                return r1
        }

        public static com.clj.fastble.bluetooth.b.EnumC0132b[] values() {
                com.clj.fastble.bluetooth.b$b[] r0 = com.clj.fastble.bluetooth.b.EnumC0132b.f
                java.lang.Object r0 = r0.clone()
                com.clj.fastble.bluetooth.b$b[] r0 = (com.clj.fastble.bluetooth.b.EnumC0132b[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class c extends android.os.Handler {
        final /* synthetic */ com.clj.fastble.bluetooth.b a;

        c(com.clj.fastble.bluetooth.b r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                int r0 = r5.what
                r1 = 0
                switch(r0) {
                    case 1: goto L195;
                    case 2: goto L12f;
                    case 3: goto L119;
                    case 4: goto Ld8;
                    case 5: goto L96;
                    case 6: goto L4a;
                    case 7: goto La;
                    default: goto L6;
                }
            L6:
                super.handleMessage(r5)
                return
            La:
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.a(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.b(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.i(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b$b r0 = com.clj.fastble.bluetooth.b.EnumC0132b.d
                com.clj.fastble.bluetooth.b.n(r5, r0)
                com.clj.fastble.a r5 = com.clj.fastble.a.v()
                com.clj.fastble.bluetooth.d r5 = r5.x()
                com.clj.fastble.bluetooth.b r0 = r4.a
                r5.m(r0)
                com.clj.fastble.bluetooth.b r5 = r4.a
                d1.b r5 = com.clj.fastble.bluetooth.b.o(r5)
                if (r5 == 0) goto L237
                com.clj.fastble.bluetooth.b r5 = r4.a
                d1.b r5 = com.clj.fastble.bluetooth.b.o(r5)
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.data.BleDevice r0 = com.clj.fastble.bluetooth.b.p(r0)
                com.clj.fastble.exception.TimeoutException r1 = new com.clj.fastble.exception.TimeoutException
                r1.<init>()
                r5.c(r0, r1)
                return
            L4a:
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$b r2 = com.clj.fastble.bluetooth.b.EnumC0132b.c
                com.clj.fastble.bluetooth.b.n(r0, r2)
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b.t(r0, r1)
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                com.clj.fastble.bluetooth.d r0 = r0.x()
                com.clj.fastble.bluetooth.b r1 = r4.a
                r0.m(r1)
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                com.clj.fastble.bluetooth.d r0 = r0.x()
                com.clj.fastble.bluetooth.b r1 = r4.a
                r0.a(r1)
                java.lang.Object r5 = r5.obj
                com.clj.fastble.data.a r5 = (com.clj.fastble.data.a) r5
                int r5 = r5.a()
                com.clj.fastble.bluetooth.b r0 = r4.a
                d1.b r0 = com.clj.fastble.bluetooth.b.o(r0)
                if (r0 == 0) goto L237
                com.clj.fastble.bluetooth.b r0 = r4.a
                d1.b r0 = com.clj.fastble.bluetooth.b.o(r0)
                com.clj.fastble.bluetooth.b r1 = r4.a
                com.clj.fastble.data.BleDevice r1 = com.clj.fastble.bluetooth.b.p(r1)
                com.clj.fastble.bluetooth.b r2 = r4.a
                android.bluetooth.BluetoothGatt r2 = com.clj.fastble.bluetooth.b.q(r2)
                r0.d(r1, r2, r5)
                return
            L96:
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.a(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.b(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.i(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b$b r0 = com.clj.fastble.bluetooth.b.EnumC0132b.d
                com.clj.fastble.bluetooth.b.n(r5, r0)
                com.clj.fastble.a r5 = com.clj.fastble.a.v()
                com.clj.fastble.bluetooth.d r5 = r5.x()
                com.clj.fastble.bluetooth.b r0 = r4.a
                r5.m(r0)
                com.clj.fastble.bluetooth.b r5 = r4.a
                d1.b r5 = com.clj.fastble.bluetooth.b.o(r5)
                if (r5 == 0) goto L237
                com.clj.fastble.bluetooth.b r5 = r4.a
                d1.b r5 = com.clj.fastble.bluetooth.b.o(r5)
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.data.BleDevice r0 = com.clj.fastble.bluetooth.b.p(r0)
                com.clj.fastble.exception.OtherException r1 = new com.clj.fastble.exception.OtherException
                java.lang.String r2 = "GATT discover services exception occurred!"
                r1.<init>(r2)
                r5.c(r0, r1)
                return
            Ld8:
                com.clj.fastble.bluetooth.b r5 = r4.a
                android.bluetooth.BluetoothGatt r5 = com.clj.fastble.bluetooth.b.q(r5)
                r0 = 5
                if (r5 == 0) goto L103
                com.clj.fastble.bluetooth.b r5 = r4.a
                android.bluetooth.BluetoothGatt r5 = com.clj.fastble.bluetooth.b.q(r5)
                boolean r5 = r5.discoverServices()
                if (r5 != 0) goto L237
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                android.os.Message r5 = r5.obtainMessage()
                r5.what = r0
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$c r0 = com.clj.fastble.bluetooth.b.l(r0)
                r0.sendMessage(r5)
                return
            L103:
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                android.os.Message r5 = r5.obtainMessage()
                r5.what = r0
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$c r0 = com.clj.fastble.bluetooth.b.l(r0)
                r0.sendMessage(r5)
                return
            L119:
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.data.BleDevice r0 = com.clj.fastble.bluetooth.b.p(r5)
                com.clj.fastble.bluetooth.b r2 = r4.a
                d1.b r2 = com.clj.fastble.bluetooth.b.o(r2)
                com.clj.fastble.bluetooth.b r3 = r4.a
                int r3 = com.clj.fastble.bluetooth.b.j(r3)
                r5.E(r0, r1, r2, r3)
                return
            L12f:
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$b r1 = com.clj.fastble.bluetooth.b.EnumC0132b.e
                com.clj.fastble.bluetooth.b.n(r0, r1)
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                com.clj.fastble.bluetooth.d r0 = r0.x()
                com.clj.fastble.bluetooth.b r1 = r4.a
                r0.l(r1)
                com.clj.fastble.bluetooth.b r0 = r4.a
                r0.G()
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b.b(r0)
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b.i(r0)
                com.clj.fastble.bluetooth.b r0 = r4.a
                r0.S()
                com.clj.fastble.bluetooth.b r0 = r4.a
                r0.P()
                com.clj.fastble.bluetooth.b r0 = r4.a
                r0.B()
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$c r0 = com.clj.fastble.bluetooth.b.l(r0)
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                java.lang.Object r5 = r5.obj
                com.clj.fastble.data.a r5 = (com.clj.fastble.data.a) r5
                boolean r0 = r5.b()
                int r5 = r5.a()
                com.clj.fastble.bluetooth.b r1 = r4.a
                d1.b r1 = com.clj.fastble.bluetooth.b.o(r1)
                if (r1 == 0) goto L237
                com.clj.fastble.bluetooth.b r1 = r4.a
                d1.b r1 = com.clj.fastble.bluetooth.b.o(r1)
                com.clj.fastble.bluetooth.b r2 = r4.a
                com.clj.fastble.data.BleDevice r2 = com.clj.fastble.bluetooth.b.p(r2)
                com.clj.fastble.bluetooth.b r3 = r4.a
                android.bluetooth.BluetoothGatt r3 = com.clj.fastble.bluetooth.b.q(r3)
                r1.e(r0, r2, r3, r5)
                return
            L195:
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b.a(r0)
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b.b(r0)
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b.i(r0)
                com.clj.fastble.bluetooth.b r0 = r4.a
                int r0 = com.clj.fastble.bluetooth.b.j(r0)
                com.clj.fastble.a r1 = com.clj.fastble.a.v()
                int r1 = r1.z()
                if (r0 >= r1) goto L1f9
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Connect fail, try reconnect "
                r5.append(r0)
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                long r0 = r0.A()
                r5.append(r0)
                java.lang.String r0 = " millisecond later"
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                com.clj.fastble.utils.a.b(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b.k(r5)
                com.clj.fastble.bluetooth.b r5 = r4.a
                com.clj.fastble.bluetooth.b$c r5 = com.clj.fastble.bluetooth.b.l(r5)
                android.os.Message r5 = r5.obtainMessage()
                r0 = 3
                r5.what = r0
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$c r0 = com.clj.fastble.bluetooth.b.l(r0)
                com.clj.fastble.a r1 = com.clj.fastble.a.v()
                long r1 = r1.A()
                r0.sendMessageDelayed(r5, r1)
                return
            L1f9:
                com.clj.fastble.bluetooth.b r0 = r4.a
                com.clj.fastble.bluetooth.b$b r1 = com.clj.fastble.bluetooth.b.EnumC0132b.d
                com.clj.fastble.bluetooth.b.n(r0, r1)
                com.clj.fastble.a r0 = com.clj.fastble.a.v()
                com.clj.fastble.bluetooth.d r0 = r0.x()
                com.clj.fastble.bluetooth.b r1 = r4.a
                r0.m(r1)
                java.lang.Object r5 = r5.obj
                com.clj.fastble.data.a r5 = (com.clj.fastble.data.a) r5
                int r5 = r5.a()
                com.clj.fastble.bluetooth.b r0 = r4.a
                d1.b r0 = com.clj.fastble.bluetooth.b.o(r0)
                if (r0 == 0) goto L237
                com.clj.fastble.bluetooth.b r0 = r4.a
                d1.b r0 = com.clj.fastble.bluetooth.b.o(r0)
                com.clj.fastble.bluetooth.b r1 = r4.a
                com.clj.fastble.data.BleDevice r1 = com.clj.fastble.bluetooth.b.p(r1)
                com.clj.fastble.exception.ConnectException r2 = new com.clj.fastble.exception.ConnectException
                com.clj.fastble.bluetooth.b r3 = r4.a
                android.bluetooth.BluetoothGatt r3 = com.clj.fastble.bluetooth.b.q(r3)
                r2.<init>(r3, r5)
                r0.c(r1, r2)
            L237:
                return
        }
    }

    public b(com.clj.fastble.data.BleDevice r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.g = r0
            r0 = 0
            r3.i = r0
            com.clj.fastble.bluetooth.b$c r1 = new com.clj.fastble.bluetooth.b$c
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r3, r2)
            r3.l = r1
            r3.m = r0
            com.clj.fastble.bluetooth.b$a r0 = new com.clj.fastble.bluetooth.b$a
            r0.<init>(r3)
            r3.n = r0
            r3.j = r4
            return
    }

    private synchronized void C() {
            r1 = this;
            monitor-enter(r1)
            android.bluetooth.BluetoothGatt r0 = r1.k     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.close()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private synchronized void H() {
            r1 = this;
            monitor-enter(r1)
            android.bluetooth.BluetoothGatt r0 = r1.k     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.disconnect()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private synchronized void M() {
            r3 = this;
            monitor-enter(r3)
            java.lang.Class<android.bluetooth.BluetoothGatt> r0 = android.bluetooth.BluetoothGatt.class
            java.lang.String r1 = "refresh"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r0 == 0) goto L4a
            android.bluetooth.BluetoothGatt r1 = r3.k     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r1 == 0) goto L4a
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.lang.String r2 = "refreshDeviceCache, is success:  "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r1.append(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            com.clj.fastble.utils.a.c(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            goto L4a
        L2f:
            r0 = move-exception
            goto L4c
        L31:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "exception occur while refreshing device: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2f
            r1.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            com.clj.fastble.utils.a.c(r0)     // Catch: java.lang.Throwable -> L2f
        L4a:
            monitor-exit(r3)
            return
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    static /* synthetic */ void a(com.clj.fastble.bluetooth.b r0) {
            r0.H()
            return
    }

    static /* synthetic */ void b(com.clj.fastble.bluetooth.b r0) {
            r0.M()
            return
    }

    static /* synthetic */ java.util.HashMap c(com.clj.fastble.bluetooth.b r0) {
            java.util.HashMap<java.lang.String, d1.e> r0 = r0.d
            return r0
    }

    static /* synthetic */ java.util.HashMap d(com.clj.fastble.bluetooth.b r0) {
            java.util.HashMap<java.lang.String, d1.c> r0 = r0.e
            return r0
    }

    static /* synthetic */ java.util.HashMap e(com.clj.fastble.bluetooth.b r0) {
            java.util.HashMap<java.lang.String, d1.k> r0 = r0.f
            return r0
    }

    static /* synthetic */ java.util.HashMap f(com.clj.fastble.bluetooth.b r0) {
            java.util.HashMap<java.lang.String, d1.f> r0 = r0.g
            return r0
    }

    static /* synthetic */ d1.g g(com.clj.fastble.bluetooth.b r0) {
            d1.g r0 = r0.b
            return r0
    }

    static /* synthetic */ d1.d h(com.clj.fastble.bluetooth.b r0) {
            d1.d r0 = r0.c
            return r0
    }

    static /* synthetic */ void i(com.clj.fastble.bluetooth.b r0) {
            r0.C()
            return
    }

    static /* synthetic */ int j(com.clj.fastble.bluetooth.b r0) {
            int r0 = r0.m
            return r0
    }

    static /* synthetic */ int k(com.clj.fastble.bluetooth.b r1) {
            int r0 = r1.m
            int r0 = r0 + 1
            r1.m = r0
            return r0
    }

    static /* synthetic */ com.clj.fastble.bluetooth.b.c l(com.clj.fastble.bluetooth.b r0) {
            com.clj.fastble.bluetooth.b$c r0 = r0.l
            return r0
    }

    static /* synthetic */ com.clj.fastble.bluetooth.b.EnumC0132b m(com.clj.fastble.bluetooth.b r0) {
            com.clj.fastble.bluetooth.b$b r0 = r0.h
            return r0
    }

    static /* synthetic */ com.clj.fastble.bluetooth.b.EnumC0132b n(com.clj.fastble.bluetooth.b r0, com.clj.fastble.bluetooth.b.EnumC0132b r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ d1.b o(com.clj.fastble.bluetooth.b r0) {
            d1.b r0 = r0.a
            return r0
    }

    static /* synthetic */ com.clj.fastble.data.BleDevice p(com.clj.fastble.bluetooth.b r0) {
            com.clj.fastble.data.BleDevice r0 = r0.j
            return r0
    }

    static /* synthetic */ android.bluetooth.BluetoothGatt q(com.clj.fastble.bluetooth.b r0) {
            android.bluetooth.BluetoothGatt r0 = r0.k
            return r0
    }

    static /* synthetic */ android.bluetooth.BluetoothGatt r(com.clj.fastble.bluetooth.b r0, android.bluetooth.BluetoothGatt r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ boolean s(com.clj.fastble.bluetooth.b r0) {
            boolean r0 = r0.i
            return r0
    }

    static /* synthetic */ boolean t(com.clj.fastble.bluetooth.b r0, boolean r1) {
            r0.i = r1
            return r1
    }

    public synchronized void A(java.lang.String r2, d1.k r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.k> r0 = r1.f     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized void B() {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.e> r0 = r1.d     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r0.clear()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto L22
        Lb:
            java.util.HashMap<java.lang.String, d1.c> r0 = r1.e     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L12
            r0.clear()     // Catch: java.lang.Throwable -> L9
        L12:
            java.util.HashMap<java.lang.String, d1.k> r0 = r1.f     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L19
            r0.clear()     // Catch: java.lang.Throwable -> L9
        L19:
            java.util.HashMap<java.lang.String, d1.f> r0 = r1.g     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L20
            r0.clear()     // Catch: java.lang.Throwable -> L9
        L20:
            monitor-exit(r1)
            return
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized android.bluetooth.BluetoothGatt D(com.clj.fastble.data.BleDevice r2, boolean r3, d1.b r4) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.bluetooth.BluetoothGatt r2 = r1.E(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized android.bluetooth.BluetoothGatt E(com.clj.fastble.data.BleDevice r4, boolean r5, d1.b r6, int r7) {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "connect device: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r4.d()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "\nmac: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r4.c()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "\nautoConnect: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            r0.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "\ncurrentThread: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4d
            long r1 = r1.getId()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "\nconnectCount:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            int r1 = r7 + 1
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.utils.a.c(r0)     // Catch: java.lang.Throwable -> L4d
            if (r7 != 0) goto L50
            r7 = 0
            r3.m = r7     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r4 = move-exception
            goto Ld3
        L50:
            r3.u(r6)     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.bluetooth.b$b r6 = com.clj.fastble.bluetooth.b.EnumC0132b.b     // Catch: java.lang.Throwable -> L4d
            r3.h = r6     // Catch: java.lang.Throwable -> L4d
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4d
            r7 = 23
            if (r6 < r7) goto L73
            android.bluetooth.BluetoothDevice r6 = r4.a()     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.a r7 = com.clj.fastble.a.v()     // Catch: java.lang.Throwable -> L4d
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L4d
            android.bluetooth.BluetoothGattCallback r0 = r3.n     // Catch: java.lang.Throwable -> L4d
            r1 = 2
            android.bluetooth.BluetoothGatt r5 = com.clj.fastble.bluetooth.a.a(r6, r7, r5, r0, r1)     // Catch: java.lang.Throwable -> L4d
            r3.k = r5     // Catch: java.lang.Throwable -> L4d
            goto L87
        L73:
            android.bluetooth.BluetoothDevice r6 = r4.a()     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.a r7 = com.clj.fastble.a.v()     // Catch: java.lang.Throwable -> L4d
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L4d
            android.bluetooth.BluetoothGattCallback r0 = r3.n     // Catch: java.lang.Throwable -> L4d
            android.bluetooth.BluetoothGatt r5 = r6.connectGatt(r7, r5, r0)     // Catch: java.lang.Throwable -> L4d
            r3.k = r5     // Catch: java.lang.Throwable -> L4d
        L87:
            android.bluetooth.BluetoothGatt r5 = r3.k     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto La9
            d1.b r4 = r3.a     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L92
            r4.f()     // Catch: java.lang.Throwable -> L4d
        L92:
            com.clj.fastble.bluetooth.b$c r4 = r3.l     // Catch: java.lang.Throwable -> L4d
            android.os.Message r4 = r4.obtainMessage()     // Catch: java.lang.Throwable -> L4d
            r5 = 7
            r4.what = r5     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.bluetooth.b$c r5 = r3.l     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.a r6 = com.clj.fastble.a.v()     // Catch: java.lang.Throwable -> L4d
            long r6 = r6.t()     // Catch: java.lang.Throwable -> L4d
            r5.sendMessageDelayed(r4, r6)     // Catch: java.lang.Throwable -> L4d
            goto Lcf
        La9:
            r3.H()     // Catch: java.lang.Throwable -> L4d
            r3.M()     // Catch: java.lang.Throwable -> L4d
            r3.C()     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.bluetooth.b$b r5 = com.clj.fastble.bluetooth.b.EnumC0132b.d     // Catch: java.lang.Throwable -> L4d
            r3.h = r5     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.a r5 = com.clj.fastble.a.v()     // Catch: java.lang.Throwable -> L4d
            com.clj.fastble.bluetooth.d r5 = r5.x()     // Catch: java.lang.Throwable -> L4d
            r5.m(r3)     // Catch: java.lang.Throwable -> L4d
            d1.b r5 = r3.a     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto Lcf
            com.clj.fastble.exception.OtherException r6 = new com.clj.fastble.exception.OtherException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r7 = "GATT connect exception occurred!"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4d
            r5.c(r4, r6)     // Catch: java.lang.Throwable -> L4d
        Lcf:
            android.bluetooth.BluetoothGatt r4 = r3.k     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            return r4
        Ld3:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r4
    }

    public synchronized void F() {
            r2 = this;
            monitor-enter(r2)
            com.clj.fastble.bluetooth.b$b r0 = com.clj.fastble.bluetooth.b.EnumC0132b.a     // Catch: java.lang.Throwable -> L22
            r2.h = r0     // Catch: java.lang.Throwable -> L22
            r2.H()     // Catch: java.lang.Throwable -> L22
            r2.M()     // Catch: java.lang.Throwable -> L22
            r2.C()     // Catch: java.lang.Throwable -> L22
            r2.N()     // Catch: java.lang.Throwable -> L22
            r2.S()     // Catch: java.lang.Throwable -> L22
            r2.P()     // Catch: java.lang.Throwable -> L22
            r2.B()     // Catch: java.lang.Throwable -> L22
            com.clj.fastble.bluetooth.b$c r0 = r2.l     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return
        L22:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public synchronized void G() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.i = r0     // Catch: java.lang.Throwable -> L9
            r1.H()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public android.bluetooth.BluetoothGatt I() {
            r1 = this;
            android.bluetooth.BluetoothGatt r0 = r1.k
            return r0
    }

    public com.clj.fastble.data.BleDevice J() {
            r1 = this;
            com.clj.fastble.data.BleDevice r0 = r1.j
            return r0
    }

    public java.lang.String K() {
            r1 = this;
            com.clj.fastble.data.BleDevice r0 = r1.j
            java.lang.String r0 = r0.b()
            return r0
    }

    public com.clj.fastble.bluetooth.c L() {
            r1 = this;
            com.clj.fastble.bluetooth.c r0 = new com.clj.fastble.bluetooth.c
            r0.<init>(r1)
            return r0
    }

    public synchronized void N() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.a = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public synchronized void O(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.c> r0 = r1.e     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, d1.c> r0 = r1.e     // Catch: java.lang.Throwable -> Lf
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void P() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.c = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public synchronized void Q(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.e> r0 = r1.d     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, d1.e> r0 = r1.d     // Catch: java.lang.Throwable -> Lf
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void R(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.f> r0 = r1.g     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, d1.f> r0 = r1.g     // Catch: java.lang.Throwable -> Lf
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void S() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.b = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public synchronized void T(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.k> r0 = r1.f     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, d1.k> r0 = r1.f     // Catch: java.lang.Throwable -> Lf
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void u(d1.b r1) {
            r0 = this;
            monitor-enter(r0)
            r0.a = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void v(java.lang.String r2, d1.c r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.c> r0 = r1.e     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized void w(d1.d r1) {
            r0 = this;
            monitor-enter(r0)
            r0.c = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void x(java.lang.String r2, d1.e r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.e> r0 = r1.d     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized void y(java.lang.String r2, d1.f r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, d1.f> r0 = r1.g     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized void z(d1.g r1) {
            r0 = this;
            monitor-enter(r0)
            r0.b = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }
}

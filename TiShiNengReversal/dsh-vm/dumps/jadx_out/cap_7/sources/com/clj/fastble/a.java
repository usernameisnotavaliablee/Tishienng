package com.clj.fastble;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class a {
    public static final int l = 10000;
    private static final int m = 7;
    private static final int n = 5000;
    private static final int o = 0;
    private static final int p = 5000;
    private static final int q = 23;
    private static final int r = 512;
    private static final int s = 20;
    private static final int t = 10000;
    private android.app.Application a;
    private com.clj.fastble.scan.b b;
    private android.bluetooth.BluetoothAdapter c;
    private com.clj.fastble.bluetooth.d d;
    private android.bluetooth.BluetoothManager e;
    private int f;
    private int g;
    private int h;
    private long i;
    private int j;
    private long k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.clj.fastble.a$a, reason: collision with other inner class name */
    private static class C0131a {
        private static final com.clj.fastble.a a = null;

        static {
                com.clj.fastble.a r0 = new com.clj.fastble.a
                r0.<init>()
                com.clj.fastble.a.C0131a.a = r0
                return
        }

        private C0131a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.clj.fastble.a a() {
                com.clj.fastble.a r0 = com.clj.fastble.a.C0131a.a
                return r0
        }
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 7
            r2.f = r0
            r0 = 5000(0x1388, float:7.006E-42)
            r2.g = r0
            r0 = 0
            r2.h = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.i = r0
            r0 = 20
            r2.j = r0
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.k = r0
            return
    }

    public static com.clj.fastble.a v() {
            com.clj.fastble.a r0 = com.clj.fastble.a.C0131a.a()
            return r0
    }

    public long A() {
            r2 = this;
            long r0 = r2.i
            return r0
    }

    public com.clj.fastble.scan.b B() {
            r1 = this;
            com.clj.fastble.scan.b r0 = r1.b
            return r0
    }

    public com.clj.fastble.data.BleScanState C() {
            r1 = this;
            com.clj.fastble.scan.c r0 = com.clj.fastble.scan.c.b()
            com.clj.fastble.data.BleScanState r0 = r0.c()
            return r0
    }

    public int D() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public void E(com.clj.fastble.data.BleDevice r7, java.lang.String r8, java.lang.String r9, d1.c r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.F(r1, r2, r3, r4, r5)
            return
    }

    public void F(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4, boolean r5, d1.c r6) {
            r1 = this;
            if (r6 == 0) goto L21
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto L15
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r3 = "This device not connect!"
            r2.<init>(r3)
            r6.f(r2)
            return
        L15:
            com.clj.fastble.bluetooth.c r2 = r2.L()
            com.clj.fastble.bluetooth.c r2 = r2.x(r3, r4)
            r2.c(r6, r4, r5)
            return
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "BleIndicateCallback can not be Null!"
            r2.<init>(r3)
            throw r2
    }

    public void G(android.app.Application r2) {
            r1 = this;
            android.app.Application r0 = r1.a
            if (r0 != 0) goto L2e
            if (r2 == 0) goto L2e
            r1.a = r2
            boolean r2 = r1.L()
            if (r2 == 0) goto L1a
            android.app.Application r2 = r1.a
            java.lang.String r0 = "bluetooth"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.bluetooth.BluetoothManager r2 = (android.bluetooth.BluetoothManager) r2
            r1.e = r2
        L1a:
            android.bluetooth.BluetoothAdapter r2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            r1.c = r2
            com.clj.fastble.bluetooth.d r2 = new com.clj.fastble.bluetooth.d
            r2.<init>()
            r1.d = r2
            com.clj.fastble.scan.b r2 = new com.clj.fastble.scan.b
            r2.<init>()
            r1.b = r2
        L2e:
            return
    }

    public void H(com.clj.fastble.scan.b r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public boolean I() {
            r1 = this;
            android.bluetooth.BluetoothAdapter r0 = r1.c
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean J(com.clj.fastble.data.BleDevice r2) {
            r1 = this;
            int r2 = r1.u(r2)
            r0 = 2
            if (r2 != r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public boolean K(java.lang.String r3) {
            r2 = this;
            java.util.List r0 = r2.m()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.clj.fastble.data.BleDevice r1 = (com.clj.fastble.data.BleDevice) r1
            if (r1 == 0) goto L8
            java.lang.String r1 = r1.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    public boolean L() {
            r2 = this;
            android.app.Application r0 = r2.a
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.bluetooth_le"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public void M(com.clj.fastble.data.BleDevice r7, java.lang.String r8, java.lang.String r9, d1.e r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.N(r1, r2, r3, r4, r5)
            return
    }

    public void N(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4, boolean r5, d1.e r6) {
            r1 = this;
            if (r6 == 0) goto L21
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto L15
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r3 = "This device not connect!"
            r2.<init>(r3)
            r6.f(r2)
            return
        L15:
            com.clj.fastble.bluetooth.c r2 = r2.L()
            com.clj.fastble.bluetooth.c r2 = r2.x(r3, r4)
            r2.d(r6, r4, r5)
            return
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "BleNotifyCallback can not be Null!"
            r2.<init>(r3)
            throw r2
    }

    public void O(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4, d1.f r5) {
            r1 = this;
            if (r5 == 0) goto L21
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto L15
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r3 = "This device is not connected!"
            r2.<init>(r3)
            r5.e(r2)
            return
        L15:
            com.clj.fastble.bluetooth.c r2 = r2.L()
            com.clj.fastble.bluetooth.c r2 = r2.x(r3, r4)
            r2.o(r5, r4)
            return
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "BleReadCallback can not be Null!"
            r2.<init>(r3)
            throw r2
    }

    public void P(com.clj.fastble.data.BleDevice r2, d1.g r3) {
            r1 = this;
            if (r3 == 0) goto L1d
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto L15
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r0 = "This device is not connected!"
            r2.<init>(r0)
            r3.e(r2)
            return
        L15:
            com.clj.fastble.bluetooth.c r2 = r2.L()
            r2.q(r3)
            return
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "BleRssiCallback can not be Null!"
            r2.<init>(r3)
            throw r2
    }

    public void Q(com.clj.fastble.data.BleDevice r1) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.N()
        L9:
            return
    }

    public void R(com.clj.fastble.data.BleDevice r1, java.lang.String r2) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.O(r2)
        L9:
            return
    }

    public void S(com.clj.fastble.data.BleDevice r1) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.P()
        L9:
            return
    }

    public void T(com.clj.fastble.data.BleDevice r1, java.lang.String r2) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.Q(r2)
        L9:
            return
    }

    public void U(com.clj.fastble.data.BleDevice r1, java.lang.String r2) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.R(r2)
        L9:
            return
    }

    public void V(com.clj.fastble.data.BleDevice r1) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.S()
        L9:
            return
    }

    public void W(com.clj.fastble.data.BleDevice r1, java.lang.String r2) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.T(r2)
        L9:
            return
    }

    public boolean X(com.clj.fastble.data.BleDevice r2, int r3) {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            com.clj.fastble.bluetooth.c r2 = r2.L()
            boolean r2 = r2.r(r3)
            return r2
    }

    public void Y(d1.i r10) {
            r9 = this;
            if (r10 == 0) goto L39
            boolean r0 = r9.I()
            if (r0 != 0) goto L12
            java.lang.String r0 = "Bluetooth not enable!"
            com.clj.fastble.utils.a.b(r0)
            r0 = 0
            r10.a(r0)
            return
        L12:
            com.clj.fastble.scan.b r0 = r9.b
            java.util.UUID[] r2 = r0.j()
            com.clj.fastble.scan.b r0 = r9.b
            java.lang.String[] r3 = r0.h()
            com.clj.fastble.scan.b r0 = r9.b
            java.lang.String r4 = r0.g()
            com.clj.fastble.scan.b r0 = r9.b
            boolean r5 = r0.l()
            com.clj.fastble.scan.b r0 = r9.b
            long r6 = r0.i()
            com.clj.fastble.scan.c r1 = com.clj.fastble.scan.c.b()
            r8 = r10
            r1.d(r2, r3, r4, r5, r6, r8)
            return
        L39:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "BleScanCallback can not be Null!"
            r10.<init>(r0)
            throw r10
    }

    public void Z(d1.h r10) {
            r9 = this;
            if (r10 == 0) goto L39
            boolean r0 = r9.I()
            if (r0 != 0) goto L12
            java.lang.String r0 = "Bluetooth not enable!"
            com.clj.fastble.utils.a.b(r0)
            r0 = 0
            r10.a(r0)
            return
        L12:
            com.clj.fastble.scan.b r0 = r9.b
            java.util.UUID[] r2 = r0.j()
            com.clj.fastble.scan.b r0 = r9.b
            java.lang.String[] r3 = r0.h()
            com.clj.fastble.scan.b r0 = r9.b
            java.lang.String r4 = r0.g()
            com.clj.fastble.scan.b r0 = r9.b
            boolean r5 = r0.l()
            com.clj.fastble.scan.b r0 = r9.b
            long r6 = r0.i()
            com.clj.fastble.scan.c r1 = com.clj.fastble.scan.c.b()
            r8 = r10
            r1.e(r2, r3, r4, r5, r6, r8)
            return
        L39:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "BleScanAndConnectCallback can not be Null!"
            r10.<init>(r0)
            throw r10
    }

    public void a() {
            r1 = this;
            com.clj.fastble.scan.c r0 = com.clj.fastble.scan.c.b()
            r0.g()
            return
    }

    public com.clj.fastble.a a0(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L8
            r4 = 100
        L8:
            r3.k = r4
            return r3
    }

    public void b(com.clj.fastble.data.BleDevice r1) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto L9
            r1.B()
        L9:
            return
    }

    public com.clj.fastble.a b0(int r2) {
            r1 = this;
            r0 = 7
            if (r2 <= r0) goto L4
            r2 = 7
        L4:
            r1.f = r2
            return r1
    }

    public android.bluetooth.BluetoothGatt c(com.clj.fastble.data.BleDevice r4, d1.b r5) {
            r3 = this;
            if (r5 == 0) goto L51
            boolean r0 = r3.I()
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r0 = "Bluetooth not enable!"
            com.clj.fastble.utils.a.b(r0)
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            r2.<init>(r0)
            r5.c(r4, r2)
            return r1
        L17:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L27
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r0 == r2) goto L2c
        L27:
            java.lang.String r0 = "Be careful: currentThread is not MainThread!"
            com.clj.fastble.utils.a.d(r0)
        L2c:
            if (r4 == 0) goto L46
            android.bluetooth.BluetoothDevice r0 = r4.a()
            if (r0 != 0) goto L35
            goto L46
        L35:
            com.clj.fastble.bluetooth.d r0 = r3.d
            com.clj.fastble.bluetooth.b r0 = r0.b(r4)
            com.clj.fastble.scan.b r1 = r3.b
            boolean r1 = r1.k()
            android.bluetooth.BluetoothGatt r4 = r0.D(r4, r1, r5)
            return r4
        L46:
            com.clj.fastble.exception.OtherException r0 = new com.clj.fastble.exception.OtherException
            java.lang.String r2 = "Not Found Device Exception Occurred!"
            r0.<init>(r2)
            r5.c(r4, r0)
            return r1
        L51:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "BleGattCallback can not be Null!"
            r4.<init>(r5)
            throw r4
    }

    public void c0(com.clj.fastble.data.BleDevice r2, int r3, d1.d r4) {
            r1 = this;
            if (r4 == 0) goto L41
            r0 = 512(0x200, float:7.17E-43)
            if (r3 <= r0) goto L14
            java.lang.String r2 = "requiredMtu should lower than 512 !"
            com.clj.fastble.utils.a.b(r2)
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            r3.<init>(r2)
            r4.f(r3)
            return
        L14:
            r0 = 23
            if (r3 >= r0) goto L26
            java.lang.String r2 = "requiredMtu should higher than 23 !"
            com.clj.fastble.utils.a.b(r2)
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            r3.<init>(r2)
            r4.f(r3)
            return
        L26:
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto L39
            com.clj.fastble.exception.OtherException r2 = new com.clj.fastble.exception.OtherException
            java.lang.String r3 = "This device is not connected!"
            r2.<init>(r3)
            r4.f(r2)
            return
        L39:
            com.clj.fastble.bluetooth.c r2 = r2.L()
            r2.v(r3, r4)
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "BleMtuChangedCallback can not be Null!"
            r2.<init>(r3)
            throw r2
    }

    public android.bluetooth.BluetoothGatt d(java.lang.String r8, d1.b r9) {
            r7 = this;
            android.bluetooth.BluetoothAdapter r0 = r7.o()
            android.bluetooth.BluetoothDevice r2 = r0.getRemoteDevice(r8)
            com.clj.fastble.data.BleDevice r1 = new com.clj.fastble.data.BleDevice
            r4 = 0
            r5 = 0
            r3 = 0
            r1.<init>(r2, r3, r4, r5)
            android.bluetooth.BluetoothGatt r8 = r7.c(r1, r9)
            return r8
    }

    public com.clj.fastble.a d0(int r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    public com.clj.fastble.data.BleDevice e(android.bluetooth.BluetoothDevice r2) {
            r1 = this;
            com.clj.fastble.data.BleDevice r0 = new com.clj.fastble.data.BleDevice
            r0.<init>(r2)
            return r0
    }

    public com.clj.fastble.a e0(int r3) {
            r2 = this;
            r0 = 5000(0x1388, double:2.4703E-320)
            com.clj.fastble.a r3 = r2.f0(r3, r0)
            return r3
    }

    @android.annotation.TargetApi(21)
    public com.clj.fastble.data.BleDevice f(android.bluetooth.le.ScanResult r7) {
            r6 = this;
            if (r7 == 0) goto L22
            android.bluetooth.BluetoothDevice r1 = r7.getDevice()
            int r2 = r7.getRssi()
            android.bluetooth.le.ScanRecord r0 = r7.getScanRecord()
            if (r0 == 0) goto L16
            byte[] r0 = r0.getBytes()
        L14:
            r3 = r0
            goto L18
        L16:
            r0 = 0
            goto L14
        L18:
            long r4 = r7.getTimestampNanos()
            com.clj.fastble.data.BleDevice r0 = new com.clj.fastble.data.BleDevice
            r0.<init>(r1, r2, r3, r4)
            return r0
        L22:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "scanResult can not be Null!"
            r7.<init>(r0)
            throw r7
    }

    public com.clj.fastble.a f0(int r4, long r5) {
            r3 = this;
            r0 = 10
            if (r4 <= r0) goto L6
            r4 = 10
        L6:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto Ld
            r5 = r0
        Ld:
            r3.h = r4
            r3.i = r5
            return r3
    }

    public void g() {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    public com.clj.fastble.a g0(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r0.j = r1
        L4:
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.app.Application r0 = r1.a
            return r0
    }

    public void h() {
            r1 = this;
            android.bluetooth.BluetoothAdapter r0 = r1.c
            if (r0 == 0) goto Lf
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lf
            android.bluetooth.BluetoothAdapter r0 = r1.c
            r0.disable()
        Lf:
            return
    }

    public boolean h0(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.i0(r2, r3, r4, r0)
            return r2
    }

    public void i(com.clj.fastble.data.BleDevice r2) {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            if (r0 == 0) goto L7
            r0.d(r2)
        L7:
            return
    }

    public boolean i0(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            com.clj.fastble.bluetooth.c r0 = r2.L()
            com.clj.fastble.bluetooth.c r3 = r0.x(r3, r4)
            boolean r3 = r3.a(r5)
            if (r3 == 0) goto L1b
            r2.O(r4)
        L1b:
            return r3
    }

    public void j() {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            if (r0 == 0) goto L7
            r0.e()
        L7:
            return
    }

    public boolean j0(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.k0(r2, r3, r4, r0)
            return r2
    }

    public void k() {
            r1 = this;
            android.bluetooth.BluetoothAdapter r0 = r1.c
            if (r0 == 0) goto L7
            r0.enable()
        L7:
            return
    }

    public boolean k0(com.clj.fastble.data.BleDevice r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            com.clj.fastble.bluetooth.c r0 = r2.L()
            com.clj.fastble.bluetooth.c r3 = r0.x(r3, r4)
            boolean r3 = r3.b(r5)
            if (r3 == 0) goto L1b
            r2.Q(r4)
        L1b:
            return r3
    }

    public com.clj.fastble.a l(boolean r1) {
            r0 = this;
            com.clj.fastble.utils.a.a = r1
            return r0
    }

    public void l0(com.clj.fastble.data.BleDevice r8, java.lang.String r9, java.lang.String r10, byte[] r11, d1.k r12) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.m0(r1, r2, r3, r4, r5, r6)
            return
    }

    public java.util.List<com.clj.fastble.data.BleDevice> m() {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.List r0 = r0.h()
            return r0
    }

    public void m0(com.clj.fastble.data.BleDevice r11, java.lang.String r12, java.lang.String r13, byte[] r14, boolean r15, d1.k r16) {
            r10 = this;
            r6 = 1
            r7 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r9 = r16
            r0.n0(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    public com.clj.fastble.bluetooth.b n(com.clj.fastble.data.BleDevice r2) {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            if (r0 == 0) goto L9
            com.clj.fastble.bluetooth.b r2 = r0.f(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void n0(com.clj.fastble.data.BleDevice r3, java.lang.String r4, java.lang.String r5, byte[] r6, boolean r7, boolean r8, long r9, d1.k r11) {
            r2 = this;
            if (r11 == 0) goto L57
            if (r6 != 0) goto L12
            java.lang.String r3 = "data is Null!"
            com.clj.fastble.utils.a.b(r3)
            com.clj.fastble.exception.OtherException r4 = new com.clj.fastble.exception.OtherException
            r4.<init>(r3)
            r11.e(r4)
            return
        L12:
            int r0 = r6.length
            r1 = 20
            if (r0 <= r1) goto L1e
            if (r7 != 0) goto L1e
            java.lang.String r0 = "Be careful: data's length beyond 20! Ensure MTU higher than 23, or use spilt write!"
            com.clj.fastble.utils.a.d(r0)
        L1e:
            com.clj.fastble.bluetooth.d r0 = r2.d
            com.clj.fastble.bluetooth.b r3 = r0.f(r3)
            if (r3 != 0) goto L31
            com.clj.fastble.exception.OtherException r3 = new com.clj.fastble.exception.OtherException
            java.lang.String r4 = "This device not connect!"
            r3.<init>(r4)
            r11.e(r3)
            return
        L31:
            if (r7 == 0) goto L47
            int r7 = r6.length
            int r0 = r2.D()
            if (r7 <= r0) goto L47
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            com.clj.fastble.bluetooth.e r3 = new com.clj.fastble.bluetooth.e
            r3.<init>()
            r3.k(r4, r5, r6, r7, r8, r9, r11)
            return
        L47:
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            com.clj.fastble.bluetooth.c r3 = r4.L()
            com.clj.fastble.bluetooth.c r3 = r3.x(r5, r6)
            r3.y(r7, r11, r6)
            return
        L57:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "BleWriteCallback can not be Null!"
            r3.<init>(r4)
            throw r3
    }

    public android.bluetooth.BluetoothAdapter o() {
            r1 = this;
            android.bluetooth.BluetoothAdapter r0 = r1.c
            return r0
    }

    public android.bluetooth.BluetoothGatt p(com.clj.fastble.data.BleDevice r1) {
            r0 = this;
            com.clj.fastble.bluetooth.b r1 = r0.n(r1)
            if (r1 == 0) goto Lb
            android.bluetooth.BluetoothGatt r1 = r1.I()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public java.util.List<android.bluetooth.BluetoothGattCharacteristic> q(android.bluetooth.BluetoothGattService r1) {
            r0 = this;
            java.util.List r1 = r1.getCharacteristics()
            return r1
    }

    public java.util.List<android.bluetooth.BluetoothGattService> r(com.clj.fastble.data.BleDevice r1) {
            r0 = this;
            android.bluetooth.BluetoothGatt r1 = r0.p(r1)
            if (r1 == 0) goto Lb
            java.util.List r1 = r1.getServices()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public android.bluetooth.BluetoothManager s() {
            r1 = this;
            android.bluetooth.BluetoothManager r0 = r1.e
            return r0
    }

    public long t() {
            r2 = this;
            long r0 = r2.k
            return r0
    }

    public int u(com.clj.fastble.data.BleDevice r3) {
            r2 = this;
            if (r3 == 0) goto Le
            android.bluetooth.BluetoothManager r0 = r2.e
            android.bluetooth.BluetoothDevice r3 = r3.a()
            r1 = 7
            int r3 = r0.getConnectionState(r3, r1)
            return r3
        Le:
            r3 = 0
            return r3
    }

    public int w() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public com.clj.fastble.bluetooth.d x() {
            r1 = this;
            com.clj.fastble.bluetooth.d r0 = r1.d
            return r0
    }

    public int y() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int z() {
            r1 = this;
            int r0 = r1.h
            return r0
    }
}

package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private final java.util.concurrent.atomic.AtomicBoolean a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f796c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentLinkedQueue f797d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f798e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f799f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f800g;

    /* renamed from: h, reason: collision with root package name */
    private final android.os.Handler f801h;

    /* renamed from: i, reason: collision with root package name */
    private final android.bluetooth.le.ScanCallback f802i;

    /* renamed from: j, reason: collision with root package name */
    private final android.bluetooth.BluetoothAdapter.LeScanCallback f803j;

    class a extends android.bluetooth.le.ScanCallback {
        final /* synthetic */ cn.jiguang.commons.G.e a;

        a(cn.jiguang.commons.G.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(java.util.List r8) {
                r7 = this;
                cn.jiguang.commons.G.e r0 = r7.a
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.G.e.a(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto L96
                cn.jiguang.commons.G.e r0 = r7.a
                java.util.concurrent.atomic.AtomicInteger r0 = cn.jiguang.commons.G.e.c(r0)
                int r0 = r0.get()
                r1 = 7
                if (r0 != r1) goto L1b
                goto L96
            L1b:
                java.lang.String r0 = "BluetoothScanner"
                if (r8 != 0) goto L25
                java.lang.String r8 = "batch scan received null results"
                cn.jiguang.commons.w.a.f(r0, r8)
                return
            L25:
                int r1 = r8.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r4 = 0
                r3[r4] = r1
                java.lang.String r1 = "batch scan received %d results"
                java.lang.String r1 = java.lang.String.format(r1, r3)
                cn.jiguang.commons.w.a.a(r0, r1)
                java.util.Iterator r1 = r8.iterator()
                r3 = 0
            L41:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L64
                java.lang.Object r5 = r1.next()
                android.bluetooth.le.ScanResult r5 = (android.bluetooth.le.ScanResult) r5
                if (r5 == 0) goto L41
                android.bluetooth.BluetoothDevice r6 = r5.getDevice()
                if (r6 == 0) goto L41
                cn.jiguang.commons.G.e r6 = r7.a
                java.util.concurrent.ConcurrentLinkedQueue r6 = cn.jiguang.commons.G.e.d(r6)
                boolean r5 = r6.offer(r5)
                if (r5 == 0) goto L41
                int r3 = r3 + 1
                goto L41
            L64:
                int r8 = r8.size()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                cn.jiguang.commons.G.e r3 = r7.a
                java.util.concurrent.ConcurrentLinkedQueue r3 = cn.jiguang.commons.G.e.d(r3)
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r4] = r8
                r5[r2] = r1
                r8 = 2
                r5[r8] = r3
                java.lang.String r8 = "batch scan processed: total=%d, added=%d, current size=%d"
                java.lang.String r8 = java.lang.String.format(r8, r5)
                cn.jiguang.commons.w.a.a(r0, r8)
                cn.jiguang.commons.G.e r8 = r7.a
                cn.jiguang.commons.G.e.a(r8, r2)
            L96:
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int r4) {
                r3 = this;
                r0 = 1
                if (r4 == r0) goto L27
                r1 = 2
                if (r4 == r1) goto L24
                r1 = 3
                if (r4 == r1) goto L21
                r1 = 4
                if (r4 == r1) goto L1e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown error: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                goto L29
            L1e:
                java.lang.String r4 = "feature unsupported"
                goto L29
            L21:
                java.lang.String r4 = "internal error"
                goto L29
            L24:
                java.lang.String r4 = "app registration failed"
                goto L29
            L27:
                java.lang.String r4 = "scan already started"
            L29:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "BLE scan failed: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                java.lang.String r1 = "BluetoothScanner"
                cn.jiguang.commons.w.a.f(r1, r4)
                cn.jiguang.commons.G.e r4 = r3.a
                cn.jiguang.commons.G.e.a(r4, r0)
                cn.jiguang.commons.G.e r4 = r3.a
                java.util.concurrent.atomic.AtomicReference r4 = cn.jiguang.commons.G.e.e(r4)
                java.lang.Object r4 = r4.get()
                android.bluetooth.BluetoothAdapter r4 = (android.bluetooth.BluetoothAdapter) r4
                if (r4 == 0) goto L57
                cn.jiguang.commons.G.e r0 = r3.a
                r0.c(r4)
            L57:
                return
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int r6, android.bluetooth.le.ScanResult r7) {
                r5 = this;
                cn.jiguang.commons.G.e r6 = r5.a
                java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.commons.G.e.a(r6)
                boolean r6 = r6.get()
                if (r6 == 0) goto L88
                cn.jiguang.commons.G.e r6 = r5.a
                java.util.concurrent.atomic.AtomicInteger r6 = cn.jiguang.commons.G.e.c(r6)
                int r6 = r6.get()
                r0 = 7
                if (r6 != r0) goto L1a
                goto L88
            L1a:
                if (r7 == 0) goto L88
                android.bluetooth.BluetoothDevice r6 = r7.getDevice()
                if (r6 == 0) goto L88
                android.bluetooth.BluetoothDevice r6 = r7.getDevice()
                java.lang.String r0 = r6.getAddress()
                java.lang.String r6 = r6.getName()
                int r1 = r7.getRssi()
                int r2 = cn.jiguang.commons.G.s.a(r7)
                if (r6 == 0) goto L39
                goto L3b
            L39:
                java.lang.String r6 = "null"
            L3b:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r6
                r6 = 2
                r3[r6] = r1
                r1 = 3
                r3[r1] = r2
                java.lang.String r1 = "BLE device found: addr=%s, name=%s, rssi=%d, txPower=%d"
                java.lang.String r1 = java.lang.String.format(r1, r3)
                java.lang.String r2 = "BluetoothScanner"
                cn.jiguang.commons.w.a.a(r2, r1)
                cn.jiguang.commons.G.e r1 = r5.a
                java.util.concurrent.ConcurrentLinkedQueue r1 = cn.jiguang.commons.G.e.d(r1)
                boolean r7 = r1.offer(r7)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                cn.jiguang.commons.G.e r1 = r5.a
                java.util.concurrent.ConcurrentLinkedQueue r1 = cn.jiguang.commons.G.e.d(r1)
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r4] = r7
                r6[r0] = r1
                java.lang.String r7 = "BLE result added: %b, current size=%d"
                java.lang.String r6 = java.lang.String.format(r7, r6)
                cn.jiguang.commons.w.a.a(r2, r6)
            L88:
                return
        }
    }

    class b implements android.bluetooth.BluetoothAdapter.LeScanCallback {
        final /* synthetic */ cn.jiguang.commons.G.e a;

        b(cn.jiguang.commons.G.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(android.bluetooth.BluetoothDevice r3, int r4, byte[] r5) {
                r2 = this;
                cn.jiguang.commons.G.e r0 = r2.a
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.G.e.a(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto L47
                cn.jiguang.commons.G.e r0 = r2.a
                java.util.concurrent.atomic.AtomicInteger r0 = cn.jiguang.commons.G.e.c(r0)
                int r0 = r0.get()
                r1 = 7
                if (r0 != r1) goto L1a
                goto L47
            L1a:
                if (r3 == 0) goto L47
                cn.jiguang.commons.G.e r0 = r2.a
                java.util.concurrent.ConcurrentLinkedQueue r0 = cn.jiguang.commons.G.e.d(r0)
                cn.jiguang.commons.G.i r1 = new cn.jiguang.commons.G.i
                r1.<init>(r3, r4, r5)
                boolean r4 = r0.offer(r1)
                java.lang.String r3 = r3.getAddress()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r0 = 0
                r5[r0] = r3
                r3 = 1
                r5[r3] = r4
                java.lang.String r3 = "legacy device found: %s, added=%b"
                java.lang.String r3 = java.lang.String.format(r3, r5)
                java.lang.String r4 = "BluetoothScanner"
                cn.jiguang.commons.w.a.a(r4, r3)
            L47:
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ long a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.bluetooth.BluetoothAdapter f804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.G.e f805c;

        c(cn.jiguang.commons.G.e r1, long r2, android.bluetooth.BluetoothAdapter r4) {
                r0 = this;
                r0.f805c = r1
                r0.a = r2
                r0.f804b = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.G.e r0 = r3.f805c
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.G.e.a(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto L30
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "scan timeout after "
                r0.append(r1)
                long r1 = r3.a
                r0.append(r1)
                java.lang.String r1 = "ms"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "BluetoothScanner"
                cn.jiguang.commons.w.a.f(r1, r0)
                cn.jiguang.commons.G.e r0 = r3.f805c
                android.bluetooth.BluetoothAdapter r1 = r3.f804b
                r0.c(r1)
            L30:
                return
        }
    }

    class d extends android.content.BroadcastReceiver {
        final /* synthetic */ cn.jiguang.commons.G.e a;

        d(cn.jiguang.commons.G.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r7, android.content.Intent r8) {
                r6 = this;
                java.lang.String r7 = r8.getAction()
                java.lang.String r0 = "android.bluetooth.device.action.FOUND"
                boolean r0 = r0.equals(r7)
                r1 = 2
                java.lang.String r2 = "BluetoothScanner"
                if (r0 == 0) goto L49
                java.lang.String r7 = "android.bluetooth.device.extra.DEVICE"
                android.os.Parcelable r7 = r8.getParcelableExtra(r7)
                android.bluetooth.BluetoothDevice r7 = (android.bluetooth.BluetoothDevice) r7
                java.lang.String r0 = "android.bluetooth.device.extra.RSSI"
                r3 = 0
                short r8 = r8.getShortExtra(r0, r3)
                if (r7 == 0) goto L5b
                cn.jiguang.commons.G.e r0 = r6.a
                java.util.concurrent.ConcurrentLinkedQueue r0 = cn.jiguang.commons.G.e.d(r0)
                cn.jiguang.commons.G.i r4 = new cn.jiguang.commons.G.i
                r5 = 0
                r4.<init>(r7, r8, r5)
                boolean r8 = r0.offer(r4)
                java.lang.String r7 = r7.getAddress()
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r7
                r7 = 1
                r0[r7] = r8
                java.lang.String r7 = "classic device found: %s, added=%b"
                java.lang.String r7 = java.lang.String.format(r7, r0)
                cn.jiguang.commons.w.a.a(r2, r7)
                return
            L49:
                java.lang.String r8 = "android.bluetooth.adapter.action.DISCOVERY_FINISHED"
                boolean r7 = r8.equals(r7)
                if (r7 == 0) goto L5b
                java.lang.String r7 = "classic scan finished"
                cn.jiguang.commons.w.a.a(r2, r7)
                cn.jiguang.commons.G.e r7 = r6.a
                cn.jiguang.commons.G.e.a(r7, r1)
            L5b:
                return
        }
    }

    public e() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.f796c = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r2.f797d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f798e = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f799f = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f801h = r0
            cn.jiguang.commons.G.e$a r0 = new cn.jiguang.commons.G.e$a
            r0.<init>(r2)
            r2.f802i = r0
            cn.jiguang.commons.G.e$b r0 = new cn.jiguang.commons.G.e$b
            r0.<init>(r2)
            r2.f803j = r0
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a(cn.jiguang.commons.G.e r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.a
            return r0
    }

    private void a(int r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f796c
            int r0 = r0.get()
            r0 = r0 & r5
            if (r0 == 0) goto La
            goto L41
        La:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f796c
            int r0 = r0.get()
            r0 = r0 | r5
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f796c
            r1.set(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            java.lang.String r5 = "data collected: type=0x%02X, total=0x%02X"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            java.lang.String r1 = "BluetoothScanner"
            cn.jiguang.commons.w.a.a(r1, r5)
            r5 = 7
            if (r0 != r5) goto L41
            java.lang.String r5 = "all data types collected"
            cn.jiguang.commons.w.a.a(r1, r5)
            java.util.concurrent.CountDownLatch r5 = r4.f800g
            if (r5 == 0) goto L41
            r5.countDown()
        L41:
            return
    }

    private void a(android.bluetooth.BluetoothAdapter r5) {
            r4 = this;
            android.content.Context r5 = cn.jiguang.commons.L.h.a()
            if (r5 != 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f798e
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "BluetoothScanner"
            if (r0 == 0) goto L17
            java.lang.String r5 = "broadcast receiver already registered"
            cn.jiguang.commons.w.a.a(r1, r5)
            return
        L17:
            cn.jiguang.commons.G.e$d r0 = new cn.jiguang.commons.G.e$d
            r0.<init>(r4)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.bluetooth.device.action.FOUND"
            r2.addAction(r3)
            java.lang.String r3 = "android.bluetooth.adapter.action.DISCOVERY_FINISHED"
            r2.addAction(r3)
            r3 = 0
            cn.jiguang.commons.L.w.a(r5, r0, r2, r3)     // Catch: java.lang.Exception -> L35
            java.util.concurrent.atomic.AtomicReference r5 = r4.f798e     // Catch: java.lang.Exception -> L35
            r5.set(r0)     // Catch: java.lang.Exception -> L35
            return
        L35:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "register receiver failed: "
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r5)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.G.e r0, int r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger c(cn.jiguang.commons.G.e r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f796c
            return r0
    }

    private void c() {
            r3 = this;
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            if (r0 != 0) goto L7
            goto L1c
        L7:
            java.util.concurrent.atomic.AtomicReference r1 = r3.f798e
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            if (r1 == 0) goto L1c
            r0.unregisterReceiver(r1)
            java.lang.String r0 = "BluetoothScanner"
            java.lang.String r1 = "broadcast receiver unregistered"
            cn.jiguang.commons.w.a.a(r0, r1)
        L1c:
            return
    }

    static /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue d(cn.jiguang.commons.G.e r0) {
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f797d
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference e(cn.jiguang.commons.G.e r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.f799f
            return r0
    }

    public java.util.concurrent.ConcurrentLinkedQueue a() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue r0 = r1.f797d
            return r0
    }

    public boolean a(long r4) {
            r3 = this;
            r0 = 0
            java.util.concurrent.CountDownLatch r1 = r3.f800g     // Catch: java.lang.InterruptedException -> L10
            if (r1 == 0) goto Lf
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L10
            boolean r4 = r1.await(r4, r2)     // Catch: java.lang.InterruptedException -> L10
            if (r4 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            return r0
        L10:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
            return r0
    }

    public boolean a(android.bluetooth.BluetoothAdapter r8, long r9) {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            java.lang.String r3 = "BluetoothScanner"
            if (r0 != 0) goto L12
            java.lang.String r8 = "scan already in progress"
            cn.jiguang.commons.w.a.f(r3, r8)
            return r1
        L12:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f799f     // Catch: java.lang.Exception -> L51
            r0.set(r8)     // Catch: java.lang.Exception -> L51
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f796c     // Catch: java.lang.Exception -> L51
            r0.set(r1)     // Catch: java.lang.Exception -> L51
            java.util.concurrent.ConcurrentLinkedQueue r0 = r7.f797d     // Catch: java.lang.Exception -> L51
            r0.clear()     // Catch: java.lang.Exception -> L51
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Exception -> L51
            r0.<init>(r2)     // Catch: java.lang.Exception -> L51
            r7.f800g = r0     // Catch: java.lang.Exception -> L51
            r7.a(r8)     // Catch: java.lang.Exception -> L51
            android.bluetooth.le.BluetoothLeScanner r0 = r8.getBluetoothLeScanner()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L53
            android.bluetooth.le.ScanSettings$Builder r4 = new android.bluetooth.le.ScanSettings$Builder     // Catch: java.lang.Exception -> L51
            r4.<init>()     // Catch: java.lang.Exception -> L51
            r5 = 2
            android.bluetooth.le.ScanSettings$Builder r4 = r4.setScanMode(r5)     // Catch: java.lang.Exception -> L51
            r5 = 1000(0x3e8, double:4.94E-321)
            android.bluetooth.le.ScanSettings$Builder r4 = r4.setReportDelay(r5)     // Catch: java.lang.Exception -> L51
            android.bluetooth.le.ScanSettings r4 = r4.build()     // Catch: java.lang.Exception -> L51
            android.bluetooth.le.ScanCallback r5 = r7.f802i     // Catch: java.lang.Exception -> L51
            r6 = 0
            r0.startScan(r6, r4, r5)     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = "BLE scan started (new API)"
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Exception -> L51
            goto L53
        L51:
            r9 = move-exception
            goto L6f
        L53:
            boolean r0 = r8.isDiscovering()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L5c
            r8.cancelDiscovery()     // Catch: java.lang.Exception -> L51
        L5c:
            r8.startDiscovery()     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = "classic scan started"
            cn.jiguang.commons.w.a.a(r3, r0)     // Catch: java.lang.Exception -> L51
            android.os.Handler r0 = r7.f801h     // Catch: java.lang.Exception -> L51
            cn.jiguang.commons.G.e$c r4 = new cn.jiguang.commons.G.e$c     // Catch: java.lang.Exception -> L51
            r4.<init>(r7, r9, r8)     // Catch: java.lang.Exception -> L51
            r0.postDelayed(r4, r9)     // Catch: java.lang.Exception -> L51
            return r2
        L6f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "start scan failed: "
            r10.append(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.commons.w.a.f(r3, r9)
            r7.c(r8)
            return r1
    }

    public void c(android.bluetooth.BluetoothAdapter r5) {
            r4 = this;
            java.lang.String r0 = "BluetoothScanner"
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.a
            r2 = 1
            r3 = 0
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto Ld
            goto L57
        Ld:
            android.bluetooth.le.BluetoothLeScanner r1 = r5.getBluetoothLeScanner()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            if (r1 == 0) goto L22
            android.bluetooth.le.ScanCallback r2 = r4.f802i     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.stopScan(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            android.bluetooth.le.ScanCallback r2 = r4.f802i     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.flushPendingScanResults(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            goto L22
        L1e:
            r5 = move-exception
            goto L58
        L20:
            r5 = move-exception
            goto L38
        L22:
            boolean r1 = r5.isDiscovering()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            if (r1 == 0) goto L2b
            r5.cancelDiscovery()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
        L2b:
            r4.c()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            java.lang.String r5 = "all scans stopped"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            java.util.concurrent.CountDownLatch r5 = r4.f800g
            if (r5 == 0) goto L57
            goto L54
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "stop scan failed: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L1e
            r1.append(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L1e
            cn.jiguang.commons.w.a.f(r0, r5)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.CountDownLatch r5 = r4.f800g
            if (r5 == 0) goto L57
        L54:
            r5.countDown()
        L57:
            return
        L58:
            java.util.concurrent.CountDownLatch r0 = r4.f800g
            if (r0 == 0) goto L5f
            r0.countDown()
        L5f:
            throw r5
    }
}

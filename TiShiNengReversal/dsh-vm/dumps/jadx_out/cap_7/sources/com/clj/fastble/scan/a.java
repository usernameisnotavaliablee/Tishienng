package com.clj.fastble.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class a implements android.bluetooth.BluetoothAdapter.LeScanCallback {
    private java.lang.String[] a;
    private java.lang.String b;
    private boolean c;
    private boolean d;
    private long e;
    private d1.j f;
    private java.util.List<com.clj.fastble.data.BleDevice> g;
    private android.os.Handler h;
    private android.os.HandlerThread i;
    private android.os.Handler j;
    private boolean k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.clj.fastble.scan.a$a, reason: collision with other inner class name */
    class RunnableC0133a implements java.lang.Runnable {
        final /* synthetic */ com.clj.fastble.data.BleDevice a;
        final /* synthetic */ com.clj.fastble.scan.a b;

        RunnableC0133a(com.clj.fastble.scan.a r1, com.clj.fastble.data.BleDevice r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.clj.fastble.scan.a r0 = r2.b
                com.clj.fastble.data.BleDevice r1 = r2.a
                r0.j(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.clj.fastble.scan.a a;

        b(com.clj.fastble.scan.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.clj.fastble.scan.c r0 = com.clj.fastble.scan.c.b()
                r0.g()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements java.lang.Runnable {
        final /* synthetic */ com.clj.fastble.data.BleDevice a;
        final /* synthetic */ com.clj.fastble.scan.a b;

        c(com.clj.fastble.scan.a r1, com.clj.fastble.data.BleDevice r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.clj.fastble.scan.a r0 = r2.b
                com.clj.fastble.data.BleDevice r1 = r2.a
                r0.m(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements java.lang.Runnable {
        final /* synthetic */ com.clj.fastble.scan.a a;

        d(com.clj.fastble.scan.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.clj.fastble.scan.c r0 = com.clj.fastble.scan.c.b()
                r0.g()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements java.lang.Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.clj.fastble.scan.a b;

        e(com.clj.fastble.scan.a r1, boolean r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.clj.fastble.scan.a r0 = r2.b
                boolean r1 = r2.a
                r0.l(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements java.lang.Runnable {
        final /* synthetic */ com.clj.fastble.scan.a a;

        f(com.clj.fastble.scan.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.clj.fastble.scan.a r0 = r2.a
                java.util.List r1 = com.clj.fastble.scan.a.b(r0)
                r0.k(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class g extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.clj.fastble.scan.a> a;

        g(android.os.Looper r1, com.clj.fastble.scan.a r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.a = r1
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.clj.fastble.scan.a> r0 = r2.a
                java.lang.Object r0 = r0.get()
                com.clj.fastble.scan.a r0 = (com.clj.fastble.scan.a) r0
                if (r0 == 0) goto L17
                int r1 = r3.what
                if (r1 != 0) goto L17
                java.lang.Object r3 = r3.obj
                com.clj.fastble.data.BleDevice r3 = (com.clj.fastble.data.BleDevice) r3
                if (r3 == 0) goto L17
                com.clj.fastble.scan.a.a(r0, r3)
            L17:
                return
        }
    }

    public a() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.g = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.h = r0
            return
    }

    static /* synthetic */ void a(com.clj.fastble.scan.a r0, com.clj.fastble.data.BleDevice r1) {
            r0.f(r1)
            return
    }

    static /* synthetic */ java.util.List b(com.clj.fastble.scan.a r0) {
            java.util.List<com.clj.fastble.data.BleDevice> r0 = r0.g
            return r0
    }

    private void c(com.clj.fastble.data.BleDevice r9) {
            r8 = this;
            java.lang.String r0 = r8.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L14
            java.lang.String[] r0 = r8.a
            if (r0 == 0) goto L10
            int r0 = r0.length
            if (r0 >= r1) goto L14
        L10:
            r8.d(r9)
            return
        L14:
            java.lang.String r0 = r8.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = r8.b
            java.lang.String r2 = r9.c()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L29
            goto L62
        L29:
            java.lang.String[] r0 = r8.a
            if (r0 == 0) goto L63
            int r0 = r0.length
            if (r0 <= 0) goto L63
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r0.<init>(r2)
            java.lang.String[] r3 = r8.a
            int r4 = r3.length
        L39:
            if (r2 >= r4) goto L5c
            r5 = r3[r2]
            java.lang.String r6 = r9.d()
            if (r6 != 0) goto L45
            java.lang.String r6 = ""
        L45:
            boolean r7 = r8.c
            if (r7 == 0) goto L50
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L59
            goto L56
        L50:
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L59
        L56:
            r0.set(r1)
        L59:
            int r2 = r2 + 1
            goto L39
        L5c:
            boolean r0 = r0.get()
            if (r0 != 0) goto L63
        L62:
            return
        L63:
            r8.d(r9)
            return
    }

    private void d(com.clj.fastble.data.BleDevice r6) {
            r5 = this;
            boolean r0 = r5.d
            if (r0 == 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "devices detected  ------  name:"
            r0.append(r1)
            java.lang.String r1 = r6.d()
            r0.append(r1)
            java.lang.String r1 = "  mac:"
            r0.append(r1)
            java.lang.String r1 = r6.c()
            r0.append(r1)
            java.lang.String r1 = "  Rssi:"
            r0.append(r1)
            int r1 = r6.e()
            r0.append(r1)
            java.lang.String r1 = "  scanRecord:"
            r0.append(r1)
            byte[] r1 = r6.f()
            java.lang.String r1 = com.clj.fastble.utils.b.j(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.clj.fastble.utils.a.c(r0)
            java.util.List<com.clj.fastble.data.BleDevice> r0 = r5.g
            r0.add(r6)
            android.os.Handler r6 = r5.h
            com.clj.fastble.scan.a$b r0 = new com.clj.fastble.scan.a$b
            r0.<init>(r5)
            r6.post(r0)
            return
        L54:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            java.util.List<com.clj.fastble.data.BleDevice> r1 = r5.g
            java.util.Iterator r1 = r1.iterator()
        L60:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r1.next()
            com.clj.fastble.data.BleDevice r2 = (com.clj.fastble.data.BleDevice) r2
            android.bluetooth.BluetoothDevice r2 = r2.a()
            android.bluetooth.BluetoothDevice r4 = r6.a()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L60
            r0.set(r3)
            goto L60
        L7f:
            boolean r0 = r0.get()
            if (r0 != 0) goto Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "device detected  ------  name: "
            r0.append(r1)
            java.lang.String r1 = r6.d()
            r0.append(r1)
            java.lang.String r1 = "  mac: "
            r0.append(r1)
            java.lang.String r1 = r6.c()
            r0.append(r1)
            java.lang.String r1 = "  Rssi: "
            r0.append(r1)
            int r1 = r6.e()
            r0.append(r1)
            java.lang.String r1 = "  scanRecord: "
            r0.append(r1)
            byte[] r1 = r6.f()
            java.lang.String r1 = com.clj.fastble.utils.b.k(r1, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.clj.fastble.utils.a.c(r0)
            java.util.List<com.clj.fastble.data.BleDevice> r0 = r5.g
            r0.add(r6)
            android.os.Handler r0 = r5.h
            com.clj.fastble.scan.a$c r1 = new com.clj.fastble.scan.a$c
            r1.<init>(r5, r6)
            r0.post(r1)
        Ld4:
            return
    }

    private void f(com.clj.fastble.data.BleDevice r3) {
            r2 = this;
            android.os.Handler r0 = r2.h
            com.clj.fastble.scan.a$a r1 = new com.clj.fastble.scan.a$a
            r1.<init>(r2, r3)
            r0.post(r1)
            r2.c(r3)
            return
    }

    public d1.j e() {
            r1 = this;
            d1.j r0 = r1.f
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public final void h(boolean r6) {
            r5 = this;
            java.util.List<com.clj.fastble.data.BleDevice> r0 = r5.g
            r0.clear()
            r5.o()
            if (r6 == 0) goto L1e
            long r0 = r5.e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            android.os.Handler r0 = r5.h
            com.clj.fastble.scan.a$d r1 = new com.clj.fastble.scan.a$d
            r1.<init>(r5)
            long r2 = r5.e
            r0.postDelayed(r1, r2)
        L1e:
            android.os.Handler r0 = r5.h
            com.clj.fastble.scan.a$e r1 = new com.clj.fastble.scan.a$e
            r1.<init>(r5, r6)
            r0.post(r1)
            return
    }

    public final void i() {
            r2 = this;
            r0 = 0
            r2.k = r0
            android.os.HandlerThread r0 = r2.i
            r0.quit()
            r2.o()
            android.os.Handler r0 = r2.h
            com.clj.fastble.scan.a$f r1 = new com.clj.fastble.scan.a$f
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public abstract void j(com.clj.fastble.data.BleDevice r1);

    public abstract void k(java.util.List<com.clj.fastble.data.BleDevice> r1);

    public abstract void l(boolean r1);

    public abstract void m(com.clj.fastble.data.BleDevice r1);

    public void n(java.lang.String[] r1, java.lang.String r2, boolean r3, boolean r4, long r5, d1.j r7) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r7
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.Class<com.clj.fastble.scan.a> r2 = com.clj.fastble.scan.a.class
            java.lang.String r2 = r2.getSimpleName()
            r1.<init>(r2)
            r0.i = r1
            r1.start()
            com.clj.fastble.scan.a$g r1 = new com.clj.fastble.scan.a$g
            android.os.HandlerThread r2 = r0.i
            android.os.Looper r2 = r2.getLooper()
            r1.<init>(r2, r0)
            r0.j = r1
            r1 = 1
            r0.k = r1
            return
    }

    public final void o() {
            r2 = this;
            android.os.Handler r0 = r2.h
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            android.os.Handler r0 = r2.j
            r0.removeCallbacksAndMessages(r1)
            return
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice r9, int r10, byte[] r11) {
            r8 = this;
            if (r9 != 0) goto L3
            goto L7
        L3:
            boolean r0 = r8.k
            if (r0 != 0) goto L8
        L7:
            return
        L8:
            android.os.Handler r0 = r8.j
            android.os.Message r0 = r0.obtainMessage()
            r1 = 0
            r0.what = r1
            com.clj.fastble.data.BleDevice r2 = new com.clj.fastble.data.BleDevice
            long r6 = java.lang.System.currentTimeMillis()
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6)
            r0.obj = r2
            android.os.Handler r9 = r8.j
            r9.sendMessage(r0)
            return
    }
}

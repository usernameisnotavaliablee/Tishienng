package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private final java.util.concurrent.atomic.AtomicReference a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f794c;

    /* renamed from: d, reason: collision with root package name */
    private final android.bluetooth.BluetoothProfile.ServiceListener f795d;

    class a implements android.bluetooth.BluetoothProfile.ServiceListener {
        final /* synthetic */ cn.jiguang.commons.G.c a;

        a(cn.jiguang.commons.G.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int r3, android.bluetooth.BluetoothProfile r4) {
                r2 = this;
                r0 = 1
                java.lang.String r1 = "BluetoothProfileManager"
                if (r3 == r0) goto L1a
                r0 = 2
                if (r3 == r0) goto L9
                return
            L9:
                cn.jiguang.commons.G.c r3 = r2.a
                java.util.concurrent.atomic.AtomicReference r3 = cn.jiguang.commons.G.c.a(r3)
                android.bluetooth.BluetoothA2dp r4 = (android.bluetooth.BluetoothA2dp) r4
                r3.set(r4)
                java.lang.String r3 = "A2DP profile connected"
            L16:
                cn.jiguang.commons.w.a.a(r1, r3)
                return
            L1a:
                cn.jiguang.commons.G.c r3 = r2.a
                java.util.concurrent.atomic.AtomicReference r3 = cn.jiguang.commons.G.c.c(r3)
                android.bluetooth.BluetoothHeadset r4 = (android.bluetooth.BluetoothHeadset) r4
                r3.set(r4)
                java.lang.String r3 = "headset profile connected"
                goto L16
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int r4) {
                r3 = this;
                r0 = 1
                java.lang.String r1 = "BluetoothProfileManager"
                r2 = 0
                if (r4 == r0) goto L19
                r0 = 2
                if (r4 == r0) goto La
                return
            La:
                cn.jiguang.commons.G.c r4 = r3.a
                java.util.concurrent.atomic.AtomicReference r4 = cn.jiguang.commons.G.c.a(r4)
                r4.set(r2)
                java.lang.String r4 = "A2DP profile disconnected"
            L15:
                cn.jiguang.commons.w.a.a(r1, r4)
                return
            L19:
                cn.jiguang.commons.G.c r4 = r3.a
                java.util.concurrent.atomic.AtomicReference r4 = cn.jiguang.commons.G.c.c(r4)
                r4.set(r2)
                java.lang.String r4 = "headset profile disconnected"
                goto L15
        }
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f794c = r0
            cn.jiguang.commons.G.c$a r0 = new cn.jiguang.commons.G.c$a
            r0.<init>(r1)
            r1.f795d = r0
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference a(cn.jiguang.commons.G.c r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.a
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference c(cn.jiguang.commons.G.c r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.f794c
            return r0
    }

    public int a(android.bluetooth.BluetoothDevice r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.bluetooth.BluetoothA2dp r0 = (android.bluetooth.BluetoothA2dp) r0
            if (r0 == 0) goto L2c
            if (r3 == 0) goto L2c
            int r3 = r0.getConnectionState(r3)     // Catch: java.lang.Exception -> L11
            return r3
        L11:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get A2DP state failed: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BluetoothProfileManager"
            cn.jiguang.commons.w.a.f(r0, r3)
        L2c:
            r3 = 0
            return r3
    }

    public void a(android.bluetooth.BluetoothAdapter r6) {
            r5 = this;
            if (r6 == 0) goto L5a
            java.util.concurrent.atomic.AtomicReference r0 = r5.a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            android.bluetooth.BluetoothA2dp r0 = (android.bluetooth.BluetoothA2dp) r0
            java.lang.String r2 = "BluetoothProfileManager"
            if (r0 == 0) goto L2d
            r3 = 2
            r6.closeProfileProxy(r3, r0)     // Catch: java.lang.Exception -> L14
            goto L2d
        L14:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "close A2DP proxy failed: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.f(r2, r0)
        L2d:
            java.util.concurrent.atomic.AtomicReference r0 = r5.f794c
            java.lang.Object r0 = r0.getAndSet(r1)
            android.bluetooth.BluetoothHeadset r0 = (android.bluetooth.BluetoothHeadset) r0
            if (r0 == 0) goto L55
            r1 = 1
            r6.closeProfileProxy(r1, r0)     // Catch: java.lang.Exception -> L3c
            goto L55
        L3c:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "close headset proxy failed: "
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.commons.w.a.f(r2, r6)
        L55:
            java.lang.String r6 = "profile proxies closed"
            cn.jiguang.commons.w.a.a(r2, r6)
        L5a:
            return
    }

    public void a(android.content.Context r3, android.bluetooth.BluetoothAdapter r4) {
            r2 = this;
            if (r4 == 0) goto L17
            if (r3 == 0) goto L17
            android.bluetooth.BluetoothProfile$ServiceListener r0 = r2.f795d
            r1 = 2
            r4.getProfileProxy(r3, r0, r1)
            android.bluetooth.BluetoothProfile$ServiceListener r0 = r2.f795d
            r1 = 1
            r4.getProfileProxy(r3, r0, r1)
            java.lang.String r3 = "BluetoothProfileManager"
            java.lang.String r4 = "profile proxies requested"
            cn.jiguang.commons.w.a.a(r3, r4)
        L17:
            return
    }

    public int c(android.bluetooth.BluetoothDevice r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f794c
            java.lang.Object r0 = r0.get()
            android.bluetooth.BluetoothHeadset r0 = (android.bluetooth.BluetoothHeadset) r0
            if (r0 == 0) goto L2c
            if (r3 == 0) goto L2c
            int r3 = r0.getConnectionState(r3)     // Catch: java.lang.Exception -> L11
            return r3
        L11:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get headset state failed: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BluetoothProfileManager"
            cn.jiguang.commons.w.a.f(r0, r3)
        L2c:
            r3 = 0
            return r3
    }
}

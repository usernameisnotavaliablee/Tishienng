package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private final android.bluetooth.BluetoothManager a;

    /* renamed from: c, reason: collision with root package name */
    private final cn.jiguang.commons.G.e f870c;

    /* renamed from: d, reason: collision with root package name */
    private final cn.jiguang.commons.G.c f871d;

    /* renamed from: e, reason: collision with root package name */
    private final cn.jiguang.commons.G.a f872e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f873f;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private static final cn.jiguang.commons.L.e a = null;

        static {
                cn.jiguang.commons.L.e r0 = new cn.jiguang.commons.L.e
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.L.e.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.L.e a() {
                cn.jiguang.commons.L.e r0 = cn.jiguang.commons.L.e.b.a
                return r0
        }
    }

    private e() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f873f = r0
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 0
            if (r1 < r2) goto L1c
            if (r0 == 0) goto L1c
            java.lang.String r1 = "bluetooth"
            java.lang.Object r0 = r0.getSystemService(r1)
            r3 = r0
            android.bluetooth.BluetoothManager r3 = (android.bluetooth.BluetoothManager) r3
        L1c:
            r4.a = r3
            cn.jiguang.commons.G.c r0 = new cn.jiguang.commons.G.c
            r0.<init>()
            r4.f871d = r0
            cn.jiguang.commons.G.a r1 = new cn.jiguang.commons.G.a
            r1.<init>(r0)
            r4.f872e = r1
            cn.jiguang.commons.G.e r0 = new cn.jiguang.commons.G.e
            r0.<init>()
            r4.f870c = r0
            return
    }

    /* synthetic */ e(cn.jiguang.commons.L.e.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.bluetooth.BluetoothAdapter r4) {
            r3 = this;
            java.lang.String r0 = "BluetoothUtils"
            boolean r1 = r3.f873f
            if (r1 == 0) goto L7
            goto L42
        L7:
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            if (r4 == 0) goto L42
            if (r1 == 0) goto L42
            cn.jiguang.commons.G.c r2 = r3.f871d     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            r2.a(r1, r4)     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            r4 = 1
            r3.f873f = r4     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            java.lang.String r4 = "profile manager initialized"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L1d java.lang.SecurityException -> L1f
            return
        L1d:
            r4 = move-exception
            goto L21
        L1f:
            r4 = move-exception
            goto L3a
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init profile failed:"
        L28:
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            goto L42
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init profile failed:perm:"
            goto L28
        L42:
            return
    }

    private boolean a() {
            r2 = this;
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.bluetooth_le"
            boolean r0 = r0.hasSystemFeature(r1)
            return r0
    }

    private boolean c() {
            r3 = this;
            boolean r0 = r3.a()
            r1 = 0
            java.lang.String r2 = "BluetoothUtils"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "device does not support BLE"
        Lb:
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
        Lf:
            android.bluetooth.BluetoothAdapter r0 = r3.e()
            if (r0 != 0) goto L18
            java.lang.String r0 = "bluetooth adapter is null"
            goto Lb
        L18:
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L21
            java.lang.String r0 = "bluetooth is not enabled"
            goto Lb
        L21:
            boolean r0 = cn.jiguang.commons.L.u.e()
            if (r0 != 0) goto L2a
            java.lang.String r0 = "bluetooth permissions not granted"
            goto Lb
        L2a:
            r0 = 1
            return r0
    }

    private void d() {
            r4 = this;
            java.lang.String r0 = "BluetoothUtils"
            android.bluetooth.BluetoothAdapter r1 = r4.e()     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto L15
            cn.jiguang.commons.G.e r2 = r4.f870c     // Catch: java.lang.Exception -> L13
            r2.c(r1)     // Catch: java.lang.Exception -> L13
            cn.jiguang.commons.G.c r2 = r4.f871d     // Catch: java.lang.Exception -> L13
            r2.a(r1)     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L1b
        L15:
            java.lang.String r1 = "all resources cleaned up"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L13
            return
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cleanup failed: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r1)
            return
    }

    private android.bluetooth.BluetoothAdapter e() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L11
            android.bluetooth.BluetoothManager r0 = r2.a
            if (r0 == 0) goto Lf
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            return r0
        Lf:
            r0 = 0
            return r0
        L11:
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            return r0
    }

    public static cn.jiguang.commons.L.e f() {
            cn.jiguang.commons.L.e r0 = cn.jiguang.commons.L.e.b.a()
            return r0
    }

    public void a(cn.jiguang.commons.G.d r7) {
            r6 = this;
            java.lang.String r0 = "start scan failed"
            java.lang.String r1 = "bluetooth adapter is null"
            java.lang.String r2 = "============= START BLUETOOTH SCAN ============="
            java.lang.String r3 = "BluetoothUtils"
            cn.jiguang.commons.w.a.a(r3, r2)
            boolean r2 = r6.c()
            if (r2 != 0) goto L1c
            java.lang.String r0 = "prerequisites check failed"
            cn.jiguang.commons.w.a.a(r3, r0)
            if (r7 == 0) goto L1b
            r7.a(r0)
        L1b:
            return
        L1c:
            android.bluetooth.BluetoothAdapter r2 = r6.e()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r2 != 0) goto L34
            cn.jiguang.commons.w.a.f(r3, r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r7 == 0) goto L30
            r7.a(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L30
        L2b:
            r7 = move-exception
            goto Lb8
        L2e:
            r0 = move-exception
            goto L93
        L30:
            r6.d()
            return
        L34:
            r6.a(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.G.a r1 = r6.f872e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r1.c()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.G.a r1 = r6.f872e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r1.c(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.G.e r1 = r6.f870c     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r4 = 30000(0x7530, double:1.4822E-319)
            boolean r1 = r1.a(r2, r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r1 != 0) goto L57
            cn.jiguang.commons.w.a.f(r3, r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r7 == 0) goto L53
            r7.a(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        L53:
            r6.d()
            return
        L57:
            cn.jiguang.commons.G.e r0 = r6.f870c     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            boolean r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r0 != 0) goto L64
            java.lang.String r0 = "scan timeout"
            cn.jiguang.commons.w.a.f(r3, r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        L64:
            cn.jiguang.commons.G.e r0 = r6.f870c     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.a()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
        L6e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.G.a r4 = r6.f872e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r4.a(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto L6e
        L7e:
            cn.jiguang.commons.G.a r0 = r6.f872e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.bean.BleInfo r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.G.a r1 = r6.f872e     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            java.lang.String r1 = r1.a()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            cn.jiguang.commons.w.a.a(r3, r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            if (r7 == 0) goto Lb4
            r7.a(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            goto Lb4
        L93:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "scan task failed: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L2b
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.commons.w.a.f(r3, r1)     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto Lb4
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2b
            r7.a(r0)     // Catch: java.lang.Throwable -> L2b
        Lb4:
            r6.d()
            return
        Lb8:
            r6.d()
            throw r7
    }
}

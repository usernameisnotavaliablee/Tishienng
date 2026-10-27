package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    static long f5771d;

    /* renamed from: e, reason: collision with root package name */
    static long f5772e;

    /* renamed from: f, reason: collision with root package name */
    static long f5773f;

    /* renamed from: g, reason: collision with root package name */
    public static long f5774g;

    /* renamed from: h, reason: collision with root package name */
    static long f5775h;
    public static java.util.HashMap<java.lang.String, java.lang.Long> v;
    public static long w;
    static int x;
    public static long z;
    volatile boolean A;
    private volatile com.autonavi.aps.amapapi.restruct.j B;
    private java.lang.String C;
    private long D;
    private com.autonavi.aps.amapapi.c E;
    android.net.wifi.WifiManager a;

    /* renamed from: b, reason: collision with root package name */
    java.util.ArrayList<com.amap.api.col.p0003l.m9> f5776b;

    /* renamed from: c, reason: collision with root package name */
    java.util.ArrayList<com.amap.api.col.p0003l.m9> f5777c;

    /* renamed from: i, reason: collision with root package name */
    android.content.Context f5778i;

    /* renamed from: j, reason: collision with root package name */
    boolean f5779j;

    /* renamed from: k, reason: collision with root package name */
    java.lang.StringBuilder f5780k;
    boolean l;
    boolean m;
    boolean n;
    java.lang.String o;
    java.util.TreeMap<java.lang.Integer, com.amap.api.col.p0003l.m9> p;
    public boolean q;
    public boolean r;
    public boolean s;
    com.autonavi.aps.amapapi.restruct.i t;
    long u;
    android.net.ConnectivityManager y;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 36
            r0.<init>(r1)
            com.autonavi.aps.amapapi.restruct.k.v = r0
            r0 = 0
            com.autonavi.aps.amapapi.restruct.k.w = r0
            r2 = 0
            com.autonavi.aps.amapapi.restruct.k.x = r2
            com.autonavi.aps.amapapi.restruct.k.z = r0
            return
    }

    public k(android.content.Context r5, android.net.wifi.WifiManager r6, android.os.Handler r7) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f5776b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f5777c = r0
            r0 = 0
            r4.f5779j = r0
            r1 = 0
            r4.f5780k = r1
            r2 = 1
            r4.l = r2
            r4.m = r2
            r4.n = r2
            r4.B = r1
            r4.o = r1
            r4.p = r1
            r4.q = r2
            r4.r = r2
            r4.s = r0
            java.lang.String r2 = ""
            r4.C = r2
            r2 = 0
            r4.u = r2
            r4.y = r1
            r1 = 30000(0x7530, double:1.4822E-319)
            r4.D = r1
            r4.A = r0
            r4.a = r6
            r4.f5778i = r5
            com.autonavi.aps.amapapi.restruct.i r6 = new com.autonavi.aps.amapapi.restruct.i
            java.lang.String r0 = "wifiAgee"
            r6.<init>(r5, r0, r7)
            r4.t = r6
            r6.a()
            return
    }

    private void A() {
            r2 = this;
            android.content.Context r0 = r2.f5778i     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r1)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L12
            android.net.wifi.WifiManager r0 = r2.a     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L13
            r2.r = r0     // Catch: java.lang.Throwable -> L13
        L12:
            return
        L13:
            com.autonavi.aps.amapapi.utils.d.b()
            return
    }

    private boolean B() {
            r7 = this;
            boolean r0 = r7.v()
            r7.q = r0
            r7.A()
            boolean r0 = r7.q
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            boolean r0 = r7.l
            if (r0 != 0) goto L14
            return r1
        L14:
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5773f
            r4 = 0
            r0 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1e
            return r0
        L1e:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            long r4 = com.autonavi.aps.amapapi.restruct.k.f5773f
            long r2 = r2 - r4
            r4 = 4900(0x1324, double:2.421E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L2c
            return r1
        L2c:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            long r4 = com.autonavi.aps.amapapi.restruct.k.f5774g
            long r2 = r2 - r4
            r4 = 1500(0x5dc, double:7.41E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3a
            return r1
        L3a:
            com.autonavi.aps.amapapi.utils.j.b()
            return r0
    }

    private static boolean a(int r3) {
            r0 = 20
            int r0 = android.net.wifi.WifiManager.calculateSignalLevel(r3, r0)     // Catch: java.lang.ArithmeticException -> L7
            goto Lf
        L7:
            r3 = move-exception
            java.lang.String r1 = "Aps"
            java.lang.String r2 = "wifiSigFine"
            com.autonavi.aps.amapapi.utils.b.a(r3, r1, r2)
        Lf:
            if (r0 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    public static long b() {
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.autonavi.aps.amapapi.restruct.k.w
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 1
            long r0 = r0 + r2
            return r0
    }

    private void d(boolean r6) {
            r5 = this;
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r5.f5776b
            if (r0 == 0) goto Ld0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto Ld0
        Lc:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5774g
            long r0 = r0 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            r5.g()
        L1d:
            java.util.TreeMap<java.lang.Integer, com.amap.api.col.3l.m9> r0 = r5.p
            if (r0 != 0) goto L2c
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.util.Collections.reverseOrder()
            r0.<init>(r1)
            r5.p = r0
        L2c:
            java.util.TreeMap<java.lang.Integer, com.amap.api.col.3l.m9> r0 = r5.p
            r0.clear()
            boolean r0 = r5.s
            if (r0 == 0) goto L3c
            if (r6 == 0) goto L3c
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r5.f5777c     // Catch: java.lang.Throwable -> L3c
            r0.clear()     // Catch: java.lang.Throwable -> L3c
        L3c:
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r5.f5776b
            int r0 = r0.size()
            r1 = 0
            r5.u = r1
            r1 = 0
        L47:
            if (r1 >= r0) goto Laa
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r5.f5776b
            java.lang.Object r2 = r2.get(r1)
            com.amap.api.col.3l.m9 r2 = (com.amap.api.col.p0003l.m9) r2
            boolean r3 = r2.f3691h
            if (r3 == 0) goto L59
            long r3 = r2.f3689f
            r5.u = r3
        L59:
            long r3 = r2.a
            java.lang.String r3 = com.amap.api.col.p0003l.m9.c(r3)
            boolean r3 = com.autonavi.aps.amapapi.utils.j.a(r3)
            if (r3 == 0) goto La7
            r3 = 20
            if (r0 <= r3) goto L71
            int r3 = r2.f3686c
            boolean r3 = a(r3)
            if (r3 == 0) goto La7
        L71:
            boolean r3 = r5.s
            if (r3 == 0) goto L7c
            if (r6 == 0) goto L7c
            java.util.ArrayList<com.amap.api.col.3l.m9> r3 = r5.f5777c
            r3.add(r2)
        L7c:
            java.lang.String r3 = r2.f3685b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L95
            java.lang.String r3 = "<unknown ssid>"
            java.lang.String r4 = r2.f3685b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L99
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r2.f3685b = r3
            goto L99
        L95:
            java.lang.String r3 = "unkwn"
            r2.f3685b = r3
        L99:
            java.util.TreeMap<java.lang.Integer, com.amap.api.col.3l.m9> r3 = r5.p
            int r4 = r2.f3686c
            int r4 = r4 * 25
            int r4 = r4 + r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r2)
        La7:
            int r1 = r1 + 1
            goto L47
        Laa:
            java.util.ArrayList<com.amap.api.col.3l.m9> r6 = r5.f5776b
            r6.clear()
            java.util.TreeMap<java.lang.Integer, com.amap.api.col.3l.m9> r6 = r5.p
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        Lb9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r6.next()
            com.amap.api.col.3l.m9 r0 = (com.amap.api.col.p0003l.m9) r0
            java.util.ArrayList<com.amap.api.col.3l.m9> r1 = r5.f5776b
            r1.add(r0)
            goto Lb9
        Lcb:
            java.util.TreeMap<java.lang.Integer, com.amap.api.col.3l.m9> r6 = r5.p
            r6.clear()
        Ld0:
            return
    }

    public static java.lang.String p() {
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5774g
            long r0 = r0 - r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    private java.util.List<com.amap.api.col.p0003l.m9> r() {
            r13 = this;
            android.net.wifi.WifiManager r0 = r13.a
            r1 = 0
            if (r0 == 0) goto L107
            android.content.Context r0 = r13.f5778i     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r2 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r2)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r0 == 0) goto L1c
            android.net.wifi.WifiManager r0 = r13.a     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.util.List r0 = r0.getScanResults()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            goto L2b
        L16:
            r0 = move-exception
            goto Lf7
        L19:
            r0 = move-exception
            goto L101
        L1c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r2 = "gst_n_aws"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r2 = "OPENSDK_WMW"
            java.lang.String r3 = "gsr_n_aws"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r0 = r1
        L2b:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r3 = 36
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r0 == 0) goto L50
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
        L38:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r5 = r4.BSSID     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            long r6 = r4.timestamp     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            goto L38
        L50:
            java.util.HashMap<java.lang.String, java.lang.Long> r3 = com.autonavi.aps.amapapi.restruct.k.v     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r3 != 0) goto L60
            java.util.HashMap<java.lang.String, java.lang.Long> r3 = com.autonavi.aps.amapapi.restruct.k.v     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r3 != 0) goto L68
        L60:
            com.autonavi.aps.amapapi.restruct.k.v = r2     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            com.autonavi.aps.amapapi.restruct.k.w = r2     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
        L68:
            r13.o = r1     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r2.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r3 = ""
            r13.C = r3     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            com.autonavi.aps.amapapi.restruct.j r3 = r13.m()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r13.B = r3     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            com.autonavi.aps.amapapi.restruct.j r3 = r13.B     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            boolean r3 = r13.a(r3)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r3 == 0) goto L89
            com.autonavi.aps.amapapi.restruct.j r3 = r13.B     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r13.C = r3     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
        L89:
            if (r0 == 0) goto Lf1
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r3 <= 0) goto Lf1
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r4 = 0
            r5 = 0
        L97:
            if (r5 >= r3) goto Lf1
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r7 = r6.BSSID     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r8 = r13.C     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r8 != 0) goto Lb3
            java.lang.String r8 = r13.C     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r7 == 0) goto Lb3
            r7 = 1
            goto Lb4
        Lb3:
            r7 = 0
        Lb4:
            com.amap.api.col.3l.m9 r8 = new com.amap.api.col.3l.m9     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r7 = r6.SSID     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.f3685b = r7     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            int r7 = r6.frequency     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.f3687d = r7     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            long r9 = r6.timestamp     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.f3688e = r9     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            java.lang.String r7 = r6.BSSID     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            long r9 = com.amap.api.col.p0003l.m9.a(r7)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.a = r9     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            int r7 = r6.level     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.f3686c = r7     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            long r6 = r6.timestamp     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r9 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r9
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            long r11 = r11 - r6
            long r11 = r11 / r9
            int r6 = (int) r11     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.f3690g = r6     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            if (r6 >= 0) goto Le5
            r8.f3690g = r4     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
        Le5:
            long r6 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r8.f3689f = r6     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r2.add(r8)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            int r5 = r5 + 1
            goto L97
        Lf1:
            com.autonavi.aps.amapapi.restruct.i r0 = r13.t     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            r0.a(r2)     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L19
            return r2
        Lf7:
            r13.o = r1
            java.lang.String r2 = "WifiManagerWrapper"
            java.lang.String r3 = "getScanResults"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r3)
            goto L107
        L101:
            java.lang.String r0 = r0.getMessage()
            r13.o = r0
        L107:
            return r1
    }

    private int s() {
            r1 = this;
            android.net.wifi.WifiManager r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getWifiState()
            return r0
        L9:
            r0 = 4
            return r0
    }

    private boolean t() {
            r11 = this;
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5771d
            long r0 = r0 - r2
            r2 = 4900(0x1324, double:2.421E-320)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto Lf
            return r4
        Lf:
            boolean r2 = r11.u()
            if (r2 == 0) goto L1c
            r2 = 9900(0x26ac, double:4.8912E-320)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1c
            return r4
        L1c:
            int r2 = com.autonavi.aps.amapapi.restruct.k.x
            r3 = 1
            if (r2 <= r3) goto L45
            long r5 = r11.D
            r7 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L2a
            goto L3a
        L2a:
            long r5 = com.autonavi.aps.amapapi.utils.a.o()
            r9 = -1
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 == 0) goto L39
            long r5 = com.autonavi.aps.amapapi.utils.a.o()
            goto L3a
        L39:
            r5 = r7
        L3a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r2 < r7) goto L45
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L45
            return r4
        L45:
            android.net.wifi.WifiManager r0 = r11.a
            if (r0 == 0) goto L76
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            com.autonavi.aps.amapapi.restruct.k.f5771d = r0
            int r0 = com.autonavi.aps.amapapi.restruct.k.x
            r1 = 2
            if (r0 >= r1) goto L57
            int r0 = r0 + r3
            com.autonavi.aps.amapapi.restruct.k.x = r0
        L57:
            android.content.Context r0 = r11.f5778i
            java.lang.String r1 = "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF"
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r1)
            if (r0 == 0) goto L68
            android.net.wifi.WifiManager r0 = r11.a
            boolean r0 = r0.startScan()
            return r0
        L68:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "n_cws"
            r0.<init>(r1)
            java.lang.String r1 = "OPENSDK_WMW"
            java.lang.String r2 = "wfs_n_cws"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L76:
            return r4
    }

    private boolean u() {
            r2 = this;
            android.net.ConnectivityManager r0 = r2.y
            if (r0 != 0) goto L10
            android.content.Context r0 = r2.f5778i
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r2.y = r0
        L10:
            android.net.ConnectivityManager r0 = r2.y
            boolean r0 = r2.a(r0)
            return r0
    }

    private boolean v() {
            r1 = this;
            android.net.wifi.WifiManager r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.content.Context r0 = r1.f5778i
            boolean r0 = com.autonavi.aps.amapapi.utils.j.g(r0)
            return r0
    }

    private void w() {
            r7 = this;
            boolean r0 = r7.B()
            if (r0 == 0) goto L3b
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5772e
            long r2 = r0 - r2
            r4 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L1d
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r7.f5776b
            r2.clear()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5774g
            com.autonavi.aps.amapapi.restruct.k.f5775h = r2
        L1d:
            r7.x()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5772e
            long r0 = r0 - r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L3b
            r0 = 20
        L29:
            if (r0 <= 0) goto L3b
            long r1 = com.autonavi.aps.amapapi.restruct.k.f5774g
            long r3 = com.autonavi.aps.amapapi.restruct.k.f5775h
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L3b
            r1 = 150(0x96, double:7.4E-322)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L38
        L38:
            int r0 = r0 + (-1)
            goto L29
        L3b:
            return
    }

    private void x() {
            r3 = this;
            boolean r0 = r3.B()
            if (r0 == 0) goto L1b
            boolean r0 = r3.t()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L1b
            long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L13
            com.autonavi.aps.amapapi.restruct.k.f5773f = r0     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            java.lang.String r1 = "WifiManager"
            java.lang.String r2 = "wifiScan"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L1b:
            return
    }

    private void y() {
            r5 = this;
            long r0 = com.autonavi.aps.amapapi.restruct.k.f5775h
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5774g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2c
            java.util.List r0 = r5.r()     // Catch: java.lang.Throwable -> Ld
            goto L16
        Ld:
            r0 = move-exception
            java.lang.String r1 = "WifiManager"
            java.lang.String r2 = "updateScanResult"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            r0 = 0
        L16:
            long r1 = com.autonavi.aps.amapapi.restruct.k.f5774g
            com.autonavi.aps.amapapi.restruct.k.f5775h = r1
            if (r0 == 0) goto L27
            java.util.ArrayList<com.amap.api.col.3l.m9> r1 = r5.f5776b
            r1.clear()
            java.util.ArrayList<com.amap.api.col.3l.m9> r1 = r5.f5776b
            r1.addAll(r0)
            return
        L27:
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r5.f5776b
            r0.clear()
        L2c:
            return
    }

    private void z() {
            r4 = this;
            android.net.wifi.WifiManager r0 = r4.a     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L5
            goto L2a
        L5:
            r0 = 4
            int r1 = r4.s()     // Catch: java.lang.Throwable -> Lb
            goto L14
        Lb:
            r1 = move-exception
            java.lang.String r2 = "OPENSDK_WMW"
            java.lang.String r3 = "cwsc"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L2a
            r1 = 4
        L14:
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r4.f5776b     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L1f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            r4.f5776b = r2     // Catch: java.lang.Throwable -> L2a
        L1f:
            if (r1 == 0) goto L27
            r2 = 1
            if (r1 == r2) goto L27
            if (r1 == r0) goto L27
            goto L2a
        L27:
            r4.g()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    public final java.util.ArrayList<com.amap.api.col.p0003l.m9> a() {
            r1 = this;
            boolean r0 = r1.s
            if (r0 != 0) goto L7
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r1.f5777c
            return r0
        L7:
            r0 = 1
            r1.b(r0)
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r1.f5777c
            return r0
    }

    public final void a(com.autonavi.aps.amapapi.c r1) {
            r0 = this;
            r0.E = r1
            return
    }

    public final void a(boolean r11) {
            r10 = this;
            android.content.Context r0 = r10.f5778i
            boolean r1 = com.autonavi.aps.amapapi.utils.a.n()
            if (r1 == 0) goto L6d
            boolean r1 = r10.n
            if (r1 != 0) goto Ld
            goto L6d
        Ld:
            android.net.wifi.WifiManager r1 = r10.a
            if (r1 == 0) goto L6d
            if (r0 == 0) goto L6d
            if (r11 != 0) goto L16
            goto L6d
        L16:
            int r11 = com.autonavi.aps.amapapi.utils.j.c()
            r1 = 17
            if (r11 > r1) goto L1f
            goto L6d
        L1f:
            android.content.ContentResolver r11 = r0.getContentResolver()
            java.lang.String r0 = "android.provider.Settings$Global"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r11
            r4 = 1
            java.lang.String r5 = "wifi_scan_always_enabled"
            r2[r4] = r5
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<android.content.ContentResolver> r7 = android.content.ContentResolver.class
            r6[r3] = r7
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r4] = r8
            java.lang.String r9 = "getInt"
            java.lang.Object r2 = com.autonavi.aps.amapapi.utils.f.a(r0, r9, r2, r6)     // Catch: java.lang.Throwable -> L65
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L65
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L6d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L65
            r6 = 3
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L65
            r9[r3] = r11     // Catch: java.lang.Throwable -> L65
            r9[r4] = r5     // Catch: java.lang.Throwable -> L65
            r9[r1] = r2     // Catch: java.lang.Throwable -> L65
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L65
            r11[r3] = r7     // Catch: java.lang.Throwable -> L65
            r11[r4] = r8     // Catch: java.lang.Throwable -> L65
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L65
            r11[r1] = r2     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = "putInt"
            com.autonavi.aps.amapapi.utils.f.a(r0, r1, r9, r11)     // Catch: java.lang.Throwable -> L65
            return
        L65:
            r11 = move-exception
            java.lang.String r0 = "WifiManagerWrapper"
            java.lang.String r1 = "enableWifiAlwaysScan"
            com.autonavi.aps.amapapi.utils.b.a(r11, r0, r1)
        L6d:
            return
    }

    public final void a(boolean r1, boolean r2, boolean r3, long r4) {
            r0 = this;
            r0.l = r1
            r0.m = r2
            r0.n = r3
            r1 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto Lf
            r0.D = r1
            return
        Lf:
            r0.D = r4
            return
    }

    public final boolean a(android.net.ConnectivityManager r4) {
            r3 = this;
            r0 = 0
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L17
            int r4 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            if (r4 != r1) goto L19
            com.autonavi.aps.amapapi.restruct.j r4 = r3.m()     // Catch: java.lang.Throwable -> L17
            boolean r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            return r1
        L17:
            r4 = move-exception
            goto L1a
        L19:
            return r0
        L1a:
            java.lang.String r1 = "WifiManagerWrapper"
            java.lang.String r2 = "wifiAccess"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r2)
            return r0
    }

    public final boolean a(com.autonavi.aps.amapapi.restruct.j r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r2 = r2.d()
            if (r2 != 0) goto L13
            boolean r0 = r1.v()
            if (r0 == 0) goto L13
            r1.g()
        L13:
            return r2
    }

    public final void b(boolean r6) {
            r5 = this;
            if (r6 == 0) goto L6
            r5.w()
            goto L9
        L6:
            r5.x()
        L9:
            boolean r6 = r5.A
            r0 = 0
            if (r6 == 0) goto L13
            r5.A = r0
            r5.z()
        L13:
            r5.y()
            long r1 = com.autonavi.aps.amapapi.utils.j.b()
            long r3 = com.autonavi.aps.amapapi.restruct.k.f5774g
            long r1 = r1 - r3
            r3 = 20000(0x4e20, double:9.8813E-320)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L28
            java.util.ArrayList<com.amap.api.col.3l.m9> r6 = r5.f5776b
            r6.clear()
        L28:
            long r1 = com.autonavi.aps.amapapi.utils.j.b()
            com.autonavi.aps.amapapi.restruct.k.f5772e = r1
            java.util.ArrayList<com.amap.api.col.3l.m9> r6 = r5.f5776b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L48
            long r1 = com.autonavi.aps.amapapi.utils.j.b()
            com.autonavi.aps.amapapi.restruct.k.f5774g = r1
            java.util.List r6 = r5.r()
            if (r6 == 0) goto L48
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r5.f5776b
            r0.addAll(r6)
            r0 = 1
        L48:
            r5.d(r0)
            return
    }

    public final android.net.wifi.WifiInfo c() {
            r3 = this;
            java.lang.String r0 = "gci_n_aws"
            android.net.wifi.WifiManager r1 = r3.a     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2b
            android.content.Context r1 = r3.f5778i     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"
            boolean r1 = com.autonavi.aps.amapapi.utils.j.c(r1, r2)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            android.net.wifi.WifiManager r0 = r3.a     // Catch: java.lang.Throwable -> L17
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            goto L24
        L19:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L17
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "OPENSDK_WMW"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r0)     // Catch: java.lang.Throwable -> L17
            goto L2b
        L24:
            java.lang.String r1 = "WifiManagerWrapper"
            java.lang.String r2 = "getConnectionInfo"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
        L2b:
            r0 = 0
            return r0
    }

    public final void c(boolean r2) {
            r1 = this;
            r1.g()
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r1.f5776b
            r0.clear()
            com.autonavi.aps.amapapi.restruct.i r0 = r1.t
            r0.a(r2)
            return
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public final java.util.ArrayList<com.amap.api.col.p0003l.m9> e() {
            r2 = this;
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r2.f5776b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.amap.api.col.3l.m9> r1 = r2.f5776b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            java.util.ArrayList<com.amap.api.col.3l.m9> r1 = r2.f5776b
            r0.addAll(r1)
        L18:
            return r0
    }

    public final void f() {
            r3 = this;
            r0 = 1
            r3.s = r0     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = r3.r()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L13
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r3.f5776b     // Catch: java.lang.Throwable -> L16
            r2.clear()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList<com.amap.api.col.3l.m9> r2 = r3.f5776b     // Catch: java.lang.Throwable -> L16
            r2.addAll(r1)     // Catch: java.lang.Throwable -> L16
        L13:
            r3.d(r0)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    public final void g() {
            r1 = this;
            r0 = 0
            r1.B = r0
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r1.f5776b
            r0.clear()
            return
    }

    public final void h() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.autonavi.aps.amapapi.restruct.k.z = r0
            com.autonavi.aps.amapapi.c r0 = r2.E
            if (r0 == 0) goto Ld
            r0.b()
        Ld:
            return
    }

    public final void i() {
            r5 = this;
            android.net.wifi.WifiManager r0 = r5.a
            if (r0 != 0) goto L5
            goto L18
        L5:
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = com.autonavi.aps.amapapi.restruct.k.f5774g
            long r0 = r0 - r2
            r2 = 4900(0x1324, double:2.421E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            com.autonavi.aps.amapapi.restruct.k.f5774g = r0
        L18:
            return
    }

    public final void j() {
            r1 = this;
            android.net.wifi.WifiManager r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            r1.A = r0
            return
    }

    public final boolean k() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    public final boolean l() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    public final com.autonavi.aps.amapapi.restruct.j m() {
            r2 = this;
            r2.A()
            boolean r0 = r2.l()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            com.autonavi.aps.amapapi.restruct.j r0 = r2.B
            if (r0 != 0) goto L1f
            com.autonavi.aps.amapapi.restruct.j r0 = r2.B
            java.util.Objects.toString(r0)
            com.autonavi.aps.amapapi.restruct.j r0 = new com.autonavi.aps.amapapi.restruct.j
            android.net.wifi.WifiInfo r1 = r2.c()
            r0.<init>(r1)
            r2.B = r0
        L1f:
            com.autonavi.aps.amapapi.restruct.j r0 = r2.B
            return r0
    }

    public final boolean n() {
            r1 = this;
            boolean r0 = r1.f5779j
            return r0
    }

    public final java.lang.String o() {
            r12 = this;
            java.lang.StringBuilder r0 = r12.f5780k
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 700(0x2bc, float:9.81E-43)
            r0.<init>(r2)
            r12.f5780k = r0
            goto L16
        Lf:
            int r2 = r0.length()
            r0.delete(r1, r2)
        L16:
            r12.f5779j = r1
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r12.f5776b
            int r0 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
        L21:
            r5 = 1
            if (r2 >= r0) goto L7a
            java.util.ArrayList<com.amap.api.col.3l.m9> r6 = r12.f5776b
            java.lang.Object r6 = r6.get(r2)
            com.amap.api.col.3l.m9 r6 = (com.amap.api.col.p0003l.m9) r6
            long r6 = r6.a
            java.lang.String r6 = com.amap.api.col.p0003l.m9.c(r6)
            boolean r7 = r12.m
            if (r7 != 0) goto L49
            java.util.ArrayList<com.amap.api.col.3l.m9> r7 = r12.f5776b
            java.lang.Object r7 = r7.get(r2)
            com.amap.api.col.3l.m9 r7 = (com.amap.api.col.p0003l.m9) r7
            java.lang.String r7 = r7.f3685b
            java.lang.String r8 = "<unknown ssid>"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L49
            r3 = 1
        L49:
            java.lang.String r7 = r12.C
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L5d
            java.lang.String r7 = r12.C
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L5d
            java.lang.String r4 = "access"
            r7 = 1
            goto L62
        L5d:
            java.lang.String r7 = "nb"
            r11 = r7
            r7 = r4
            r4 = r11
        L62:
            java.lang.StringBuilder r8 = r12.f5780k
            java.util.Locale r9 = java.util.Locale.US
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r1] = r6
            r10[r5] = r4
            java.lang.String r4 = "#%s,%s"
            java.lang.String r4 = java.lang.String.format(r9, r4, r10)
            r8.append(r4)
            int r2 = r2 + 1
            r4 = r7
            goto L21
        L7a:
            java.util.ArrayList<com.amap.api.col.3l.m9> r0 = r12.f5776b
            int r0 = r0.size()
            if (r0 != 0) goto L83
            r3 = 1
        L83:
            boolean r0 = r12.m
            if (r0 != 0) goto L8b
            if (r3 != 0) goto L8b
            r12.f5779j = r5
        L8b:
            if (r4 != 0) goto La8
            java.lang.String r0 = r12.C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La8
            java.lang.StringBuilder r0 = r12.f5780k
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r12.C
            r0.append(r1)
            java.lang.StringBuilder r0 = r12.f5780k
            java.lang.String r1 = ",access"
            r0.append(r1)
        La8:
            java.lang.StringBuilder r0 = r12.f5780k
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final long q() {
            r2 = this;
            long r0 = r2.u
            return r0
    }
}

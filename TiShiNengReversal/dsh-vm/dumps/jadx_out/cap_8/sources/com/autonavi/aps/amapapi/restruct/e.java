package com.autonavi.aps.amapapi.restruct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {
    java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> a;

    /* renamed from: b, reason: collision with root package name */
    android.telephony.TelephonyManager f5745b;

    /* renamed from: c, reason: collision with root package name */
    android.telephony.PhoneStateListener f5746c;

    /* renamed from: d, reason: collision with root package name */
    android.telephony.SignalStrength f5747d;

    /* renamed from: e, reason: collision with root package name */
    boolean f5748e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.StringBuilder f5749f;

    /* renamed from: g, reason: collision with root package name */
    java.lang.String f5750g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.Context f5751h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5752i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5753j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5754k;
    private java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> l;
    private com.autonavi.aps.amapapi.restruct.c m;
    private long n;
    private boolean o;
    private java.lang.Object p;

    @android.annotation.SuppressLint({"NewApi"})
    private android.telephony.TelephonyManager.CellInfoCallback q;
    private boolean r;
    private java.lang.String s;
    private java.lang.String t;
    private volatile boolean u;
    private volatile boolean v;
    private com.autonavi.aps.amapapi.c w;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.SuppressLint({"NewApi"})
    class a extends android.telephony.TelephonyManager.CellInfoCallback {
        final /* synthetic */ com.autonavi.aps.amapapi.restruct.e a;

        a(com.autonavi.aps.amapapi.restruct.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public final void onCellInfo(java.util.List<android.telephony.CellInfo> r6) {
                r5 = this;
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                java.lang.String r1 = "noLocReqCgiEnable:"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.a(r1)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                r0.append(r1)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                java.lang.String r1 = " isStartLocation:"
                r0.append(r1)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.b(r1)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                r0.append(r1)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.a(r0)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                if (r0 != 0) goto L39
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.b(r0)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                if (r0 != 0) goto L39
                goto L4a
            L35:
                r6 = move-exception
                goto L6a
            L37:
                r6 = move-exception
                goto L72
            L39:
                long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r2 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                long r2 = com.autonavi.aps.amapapi.restruct.e.c(r2)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                long r0 = r0 - r2
                r2 = 500(0x1f4, double:2.47E-321)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L4b
            L4a:
                return
            L4b:
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e.d(r0)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                android.telephony.CellLocation r0 = com.autonavi.aps.amapapi.restruct.e.e(r0)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e.a(r1, r0)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                r0.a(r6)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e r6 = r5.a     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                com.autonavi.aps.amapapi.restruct.e.a(r6, r0)     // Catch: java.lang.Throwable -> L35 java.lang.SecurityException -> L37
                return
            L6a:
                java.lang.String r0 = "Cgi"
                java.lang.String r1 = "cellInfo"
                com.autonavi.aps.amapapi.utils.b.a(r6, r0, r1)
                return
            L72:
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a
                java.lang.String r6 = r6.getMessage()
                r0.f5750g = r6
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.telephony.PhoneStateListener {
        final /* synthetic */ com.autonavi.aps.amapapi.restruct.e a;

        b(com.autonavi.aps.amapapi.restruct.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellInfoChanged(java.util.List<android.telephony.CellInfo> r6) {
                r5 = this;
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L71
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
                java.lang.String r1 = "noLocReqCgiEnable:"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a     // Catch: java.lang.Throwable -> L71
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.a(r1)     // Catch: java.lang.Throwable -> L71
                r0.append(r1)     // Catch: java.lang.Throwable -> L71
                java.lang.String r1 = " isStartLocation:"
                r0.append(r1)     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a     // Catch: java.lang.Throwable -> L71
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.b(r1)     // Catch: java.lang.Throwable -> L71
                r0.append(r1)     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L71
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.a(r0)     // Catch: java.lang.Throwable -> L71
                if (r0 != 0) goto L35
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L71
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.b(r0)     // Catch: java.lang.Throwable -> L71
                if (r0 != 0) goto L35
                goto L71
            L35:
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.c r0 = com.autonavi.aps.amapapi.restruct.e.g(r0)     // Catch: java.lang.Throwable -> L71
                if (r0 == 0) goto L46
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.c r0 = com.autonavi.aps.amapapi.restruct.e.g(r0)     // Catch: java.lang.Throwable -> L71
                r0.c()     // Catch: java.lang.Throwable -> L71
            L46:
                long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r2 = r5.a     // Catch: java.lang.Throwable -> L71
                long r2 = com.autonavi.aps.amapapi.restruct.e.c(r2)     // Catch: java.lang.Throwable -> L71
                long r0 = r0 - r2
                r2 = 500(0x1f4, double:2.47E-321)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L58
                goto L71
            L58:
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L71
                android.telephony.CellLocation r0 = com.autonavi.aps.amapapi.restruct.e.e(r0)     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e.a(r1, r0)     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L71
                r0.a(r6)     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e r6 = r5.a     // Catch: java.lang.Throwable -> L71
                long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L71
                com.autonavi.aps.amapapi.restruct.e.a(r6, r0)     // Catch: java.lang.Throwable -> L71
            L71:
                return
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(android.telephony.CellLocation r6) {
                r5 = this;
                com.autonavi.aps.amapapi.utils.d.a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "noLocReqCgiEnable:"
                r0.<init>(r1)
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.a(r1)
                r0.append(r1)
                java.lang.String r1 = " isStartLocation:"
                r0.append(r1)
                com.autonavi.aps.amapapi.restruct.e r1 = r5.a
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.b(r1)
                r0.append(r1)
                com.autonavi.aps.amapapi.utils.d.a()
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.a(r0)
                if (r0 != 0) goto L35
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.b(r0)
                if (r0 != 0) goto L35
                goto L60
            L35:
                long r0 = com.autonavi.aps.amapapi.utils.j.b()
                com.autonavi.aps.amapapi.restruct.e r2 = r5.a
                long r2 = com.autonavi.aps.amapapi.restruct.e.c(r2)
                long r0 = r0 - r2
                r2 = 500(0x1f4, double:2.47E-321)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L47
                goto L60
            L47:
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L60
                com.autonavi.aps.amapapi.restruct.e.a(r0, r6)     // Catch: java.lang.Throwable -> L60
                com.autonavi.aps.amapapi.restruct.e r6 = r5.a     // Catch: java.lang.Throwable -> L60
                java.util.List r6 = com.autonavi.aps.amapapi.restruct.e.f(r6)     // Catch: java.lang.Throwable -> L60
                com.autonavi.aps.amapapi.restruct.e r0 = r5.a     // Catch: java.lang.Throwable -> L60
                r0.a(r6)     // Catch: java.lang.Throwable -> L60
                com.autonavi.aps.amapapi.restruct.e r6 = r5.a     // Catch: java.lang.Throwable -> L60
                long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L60
                com.autonavi.aps.amapapi.restruct.e.a(r6, r0)     // Catch: java.lang.Throwable -> L60
            L60:
                return
        }

        @Override // android.telephony.PhoneStateListener
        public final void onDataConnectionStateChanged(int r1) {
                r0 = this;
                super.onDataConnectionStateChanged(r1)
                com.autonavi.aps.amapapi.utils.d.a()
                return
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(android.telephony.ServiceState r3) {
                r2 = this;
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L4b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                java.lang.String r1 = "noLocReqCgiEnable:"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
                com.autonavi.aps.amapapi.restruct.e r1 = r2.a     // Catch: java.lang.Throwable -> L4b
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.a(r1)     // Catch: java.lang.Throwable -> L4b
                r0.append(r1)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r1 = " isStartLocation:"
                r0.append(r1)     // Catch: java.lang.Throwable -> L4b
                com.autonavi.aps.amapapi.restruct.e r1 = r2.a     // Catch: java.lang.Throwable -> L4b
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.b(r1)     // Catch: java.lang.Throwable -> L4b
                r0.append(r1)     // Catch: java.lang.Throwable -> L4b
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L4b
                com.autonavi.aps.amapapi.restruct.e r0 = r2.a     // Catch: java.lang.Throwable -> L4b
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.a(r0)     // Catch: java.lang.Throwable -> L4b
                if (r0 != 0) goto L35
                com.autonavi.aps.amapapi.restruct.e r0 = r2.a     // Catch: java.lang.Throwable -> L4b
                boolean r0 = com.autonavi.aps.amapapi.restruct.e.b(r0)     // Catch: java.lang.Throwable -> L4b
                if (r0 != 0) goto L35
                goto L4b
            L35:
                int r3 = r3.getState()     // Catch: java.lang.Throwable -> L4b
                if (r3 == 0) goto L45
                r0 = 1
                if (r3 == r0) goto L3f
                goto L4b
            L3f:
                com.autonavi.aps.amapapi.restruct.e r3 = r2.a     // Catch: java.lang.Throwable -> L4b
                r3.j()     // Catch: java.lang.Throwable -> L4b
                return
            L45:
                com.autonavi.aps.amapapi.restruct.e r3 = r2.a     // Catch: java.lang.Throwable -> L4b
                r0 = 0
                r3.a(r0, r0)     // Catch: java.lang.Throwable -> L4b
            L4b:
                return
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int r1) {
                r0 = this;
                super.onSignalStrengthChanged(r1)
                com.autonavi.aps.amapapi.utils.d.a()
                return
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(android.telephony.SignalStrength r3) {
                r2 = this;
                com.autonavi.aps.amapapi.utils.d.a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "noLocReqCgiEnable:"
                r0.<init>(r1)
                com.autonavi.aps.amapapi.restruct.e r1 = r2.a
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.a(r1)
                r0.append(r1)
                java.lang.String r1 = " isStartLocation:"
                r0.append(r1)
                com.autonavi.aps.amapapi.restruct.e r1 = r2.a
                boolean r1 = com.autonavi.aps.amapapi.restruct.e.b(r1)
                r0.append(r1)
                com.autonavi.aps.amapapi.utils.d.a()
                if (r3 != 0) goto L27
                goto L4b
            L27:
                com.autonavi.aps.amapapi.restruct.e r0 = r2.a
                r0.f5747d = r3
                boolean r3 = com.autonavi.aps.amapapi.restruct.e.a(r0)
                if (r3 != 0) goto L3a
                com.autonavi.aps.amapapi.restruct.e r3 = r2.a
                boolean r3 = com.autonavi.aps.amapapi.restruct.e.b(r3)
                if (r3 != 0) goto L3a
                goto L4b
            L3a:
                com.autonavi.aps.amapapi.restruct.e r3 = r2.a     // Catch: java.lang.Throwable -> L4b
                com.autonavi.aps.amapapi.c r3 = com.autonavi.aps.amapapi.restruct.e.g(r3)     // Catch: java.lang.Throwable -> L4b
                if (r3 == 0) goto L4b
                com.autonavi.aps.amapapi.restruct.e r3 = r2.a     // Catch: java.lang.Throwable -> L4b
                com.autonavi.aps.amapapi.c r3 = com.autonavi.aps.amapapi.restruct.e.g(r3)     // Catch: java.lang.Throwable -> L4b
                r3.c()     // Catch: java.lang.Throwable -> L4b
            L4b:
                return
        }
    }

    public e(android.content.Context r5, android.os.Handler r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f5752i = r0
            r4.f5753j = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.a = r1
            r1 = 0
            r4.f5754k = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.l = r2
            r4.f5745b = r1
            r4.m = r1
            r2 = 0
            r4.n = r2
            r4.f5746c = r1
            r4.o = r0
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r4.p = r2
            r4.r = r0
            r4.f5748e = r0
            r4.f5749f = r1
            r4.s = r1
            r4.t = r1
            r4.f5750g = r1
            r0 = 1
            r4.u = r0
            r4.v = r0
            r4.f5751h = r5
            android.telephony.TelephonyManager r0 = r4.f5745b
            if (r0 != 0) goto L4d
            java.lang.String r0 = "phone"
            java.lang.Object r0 = com.autonavi.aps.amapapi.utils.j.a(r5, r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r4.f5745b = r0
        L4d:
            r4.o()
            com.autonavi.aps.amapapi.restruct.c r0 = new com.autonavi.aps.amapapi.restruct.c
            java.lang.String r1 = "cellAge"
            r0.<init>(r5, r1, r6)
            r4.m = r0
            r0.a()
            return
    }

    static /* synthetic */ long a(com.autonavi.aps.amapapi.restruct.e r0, long r1) {
            r0.n = r1
            return r1
    }

    private static com.autonavi.aps.amapapi.restruct.d a(int r1, boolean r2, int r3, int r4, int r5, int r6, int r7) {
            com.autonavi.aps.amapapi.restruct.d r0 = new com.autonavi.aps.amapapi.restruct.d
            r0.<init>(r1, r2)
            r0.a = r3
            r0.f5735b = r4
            r0.f5736c = r5
            r0.f5737d = r6
            r0.f5744k = r7
            return r0
    }

    private com.autonavi.aps.amapapi.restruct.d a(android.telephony.CellInfoCdma r12, boolean r13) {
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L77
            android.telephony.CellIdentityCdma r1 = r12.getCellIdentity()
            if (r1 != 0) goto La
            goto L77
        La:
            android.telephony.CellIdentityCdma r1 = r12.getCellIdentity()
            int r2 = r1.getSystemId()
            if (r2 <= 0) goto L77
            int r2 = r1.getNetworkId()
            if (r2 < 0) goto L77
            int r1 = r1.getBasestationId()
            if (r1 < 0) goto L77
            android.telephony.CellIdentityCdma r0 = r12.getCellIdentity()
            android.telephony.TelephonyManager r1 = r11.f5745b
            java.lang.String[] r1 = com.autonavi.aps.amapapi.utils.j.a(r1)
            r2 = 0
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L3b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L3b
            r4 = 1
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L3c
            int r2 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L3c
            r7 = r2
        L39:
            r6 = r3
            goto L3e
        L3b:
            r3 = 0
        L3c:
            r7 = 0
            goto L39
        L3e:
            android.telephony.CellSignalStrengthCdma r1 = r12.getCellSignalStrength()
            int r10 = r1.getCdmaDbm()
            r4 = 2
            r8 = 0
            r9 = 0
            r5 = r13
            com.autonavi.aps.amapapi.restruct.d r13 = a(r4, r5, r6, r7, r8, r9, r10)
            int r1 = r0.getSystemId()
            r13.f5741h = r1
            int r1 = r0.getNetworkId()
            r13.f5742i = r1
            int r1 = r0.getBasestationId()
            r13.f5743j = r1
            int r1 = r0.getLatitude()
            r13.f5739f = r1
            int r0 = r0.getLongitude()
            r13.f5740g = r0
            android.telephony.CellSignalStrengthCdma r12 = r12.getCellSignalStrength()
            int r12 = r12.getCdmaDbm()
            r13.s = r12
            return r13
        L77:
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    private static com.autonavi.aps.amapapi.restruct.d a(android.telephony.CellInfoGsm r8, boolean r9) {
            if (r8 == 0) goto L54
            android.telephony.CellIdentityGsm r0 = r8.getCellIdentity()
            if (r0 != 0) goto L9
            goto L54
        L9:
            android.telephony.CellIdentityGsm r0 = r8.getCellIdentity()
            int r3 = r0.getMcc()
            int r4 = r0.getMnc()
            int r5 = r0.getLac()
            int r6 = r0.getCid()
            android.telephony.CellSignalStrengthGsm r0 = r8.getCellSignalStrength()
            int r7 = r0.getDbm()
            r1 = 1
            r2 = r9
            com.autonavi.aps.amapapi.restruct.d r9 = a(r1, r2, r3, r4, r5, r6, r7)
            android.telephony.CellIdentityGsm r0 = r8.getCellIdentity()
            int r0 = com.autonavi.aps.amapapi.restruct.o.a(r0)
            r9.o = r0
            android.telephony.CellIdentityGsm r0 = r8.getCellIdentity()
            int r0 = com.autonavi.aps.amapapi.restruct.p.a(r0)
            r9.p = r0
            android.telephony.CellSignalStrengthGsm r0 = r8.getCellSignalStrength()
            int r0 = com.autonavi.aps.amapapi.restruct.q.a(r0)
            r9.q = r0
            android.telephony.CellSignalStrengthGsm r8 = r8.getCellSignalStrength()
            int r8 = r8.getDbm()
            r9.s = r8
            return r9
        L54:
            r8 = 0
            return r8
    }

    private static com.autonavi.aps.amapapi.restruct.d a(android.telephony.CellInfoLte r8, boolean r9) {
            if (r8 == 0) goto L52
            android.telephony.CellIdentityLte r0 = r8.getCellIdentity()
            if (r0 != 0) goto L9
            goto L52
        L9:
            android.telephony.CellIdentityLte r0 = r8.getCellIdentity()
            int r3 = r0.getMcc()
            int r4 = r0.getMnc()
            int r5 = r0.getTac()
            int r6 = r0.getCi()
            android.telephony.CellSignalStrengthLte r1 = r8.getCellSignalStrength()
            int r7 = r1.getDbm()
            r1 = 3
            r2 = r9
            com.autonavi.aps.amapapi.restruct.d r9 = a(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r0.getPci()
            r9.o = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L3d
            int r0 = com.autonavi.aps.amapapi.restruct.l.a(r0)
            r9.p = r0
        L3d:
            android.telephony.CellSignalStrengthLte r0 = r8.getCellSignalStrength()
            int r0 = r0.getTimingAdvance()
            r9.q = r0
            android.telephony.CellSignalStrengthLte r8 = r8.getCellSignalStrength()
            int r8 = r8.getDbm()
            r9.s = r8
            return r9
        L52:
            r8 = 0
            return r8
    }

    private static com.autonavi.aps.amapapi.restruct.d a(android.telephony.CellInfoNr r13, boolean r14) {
            if (r13 == 0) goto L8f
            android.telephony.CellIdentity r0 = cn.jiguang.commons.L.y0.a(r13)
            if (r0 != 0) goto La
            goto L8f
        La:
            android.telephony.CellIdentity r0 = cn.jiguang.commons.L.y0.a(r13)
            android.telephony.CellIdentityNr r0 = cn.jiguang.commons.L.z0.a(r0)
            int r1 = cn.jiguang.commons.L.b1.a(r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r1 != r2) goto L2e
            java.lang.String r2 = "HUAWEI"
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L2e
            java.lang.String r2 = "getHwTac"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2e
            int r1 = com.autonavi.aps.amapapi.utils.f.b(r0, r2, r4)     // Catch: java.lang.Throwable -> L2e
        L2e:
            long r4 = cn.jiguang.commons.L.a1.a(r0)
            java.lang.String r2 = cn.jiguang.commons.L.c1.a(r0)     // Catch: java.lang.Throwable -> L47
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = cn.jiguang.commons.L.d1.a(r0)     // Catch: java.lang.Throwable -> L45
            int r3 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L45
            r9 = r3
        L43:
            r8 = r2
            goto L4b
        L45:
            goto L49
        L47:
            r2 = 0
        L49:
            r9 = 0
            goto L43
        L4b:
            android.telephony.CellSignalStrength r2 = cn.jiguang.commons.L.x0.a(r13)
            android.telephony.CellSignalStrengthNr r2 = com.autonavi.aps.amapapi.restruct.t.a(r2)
            int r12 = com.autonavi.aps.amapapi.restruct.u.a(r2)
            int r10 = cn.jiguang.commons.L.b1.a(r0)
            r11 = 0
            r6 = 5
            r7 = r14
            com.autonavi.aps.amapapi.restruct.d r14 = a(r6, r7, r8, r9, r10, r11, r12)
            r14.f5738e = r4
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 <= r2) goto L6f
            r14.f5736c = r3
            goto L78
        L6f:
            if (r1 <= r3) goto L76
            r14.f5736c = r3
            r14.q = r1
            goto L78
        L76:
            r14.f5736c = r1
        L78:
            int r1 = com.autonavi.aps.amapapi.restruct.r.a(r0)
            r14.o = r1
            int r0 = com.autonavi.aps.amapapi.restruct.s.a(r0)
            r14.p = r0
            android.telephony.CellSignalStrength r13 = cn.jiguang.commons.L.x0.a(r13)
            int r13 = r13.getDbm()
            r14.s = r13
            return r14
        L8f:
            r13 = 0
            return r13
    }

    private static com.autonavi.aps.amapapi.restruct.d a(android.telephony.CellInfoWcdma r8, boolean r9) {
            if (r8 == 0) goto L46
            android.telephony.CellIdentityWcdma r0 = r8.getCellIdentity()
            if (r0 != 0) goto L9
            goto L46
        L9:
            android.telephony.CellIdentityWcdma r0 = r8.getCellIdentity()
            int r3 = r0.getMcc()
            int r4 = r0.getMnc()
            int r5 = r0.getLac()
            int r6 = r0.getCid()
            android.telephony.CellSignalStrengthWcdma r1 = r8.getCellSignalStrength()
            int r7 = r1.getDbm()
            r1 = 4
            r2 = r9
            com.autonavi.aps.amapapi.restruct.d r9 = a(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r0.getPsc()
            r9.o = r0
            android.telephony.CellIdentityWcdma r0 = r8.getCellIdentity()
            int r0 = com.autonavi.aps.amapapi.restruct.n.a(r0)
            r9.p = r0
            android.telephony.CellSignalStrengthWcdma r8 = r8.getCellSignalStrength()
            int r8 = r8.getDbm()
            r9.s = r8
            return r9
        L46:
            r8 = 0
            return r8
    }

    private synchronized void a(android.telephony.CellLocation r6) {
            r5 = this;
            monitor-enter(r5)
            android.telephony.TelephonyManager r0 = r5.f5745b     // Catch: java.lang.Throwable -> L4c
            java.lang.String[] r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r1 = r5.a     // Catch: java.lang.Throwable -> L4c
            r1.clear()     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r6 instanceof android.telephony.gsm.GsmCellLocation     // Catch: java.lang.Throwable -> L4c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5c
            android.telephony.gsm.GsmCellLocation r6 = (android.telephony.gsm.GsmCellLocation) r6     // Catch: java.lang.Throwable -> L4c
            com.autonavi.aps.amapapi.restruct.d r1 = new com.autonavi.aps.amapapi.restruct.d     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r3, r3)     // Catch: java.lang.Throwable -> L4c
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L4c
            int r4 = com.autonavi.aps.amapapi.utils.j.e(r4)     // Catch: java.lang.Throwable -> L4c
            r1.a = r4     // Catch: java.lang.Throwable -> L4c
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L4c
            int r0 = com.autonavi.aps.amapapi.utils.j.e(r0)     // Catch: java.lang.Throwable -> L4c
            r1.f5735b = r0     // Catch: java.lang.Throwable -> L4c
            int r0 = r6.getLac()     // Catch: java.lang.Throwable -> L4c
            r1.f5736c = r0     // Catch: java.lang.Throwable -> L4c
            int r6 = r6.getCid()     // Catch: java.lang.Throwable -> L4c
            r1.f5737d = r6     // Catch: java.lang.Throwable -> L4c
            android.telephony.SignalStrength r6 = r5.f5747d     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L4e
            int r6 = r6.getGsmSignalStrength()     // Catch: java.lang.Throwable -> L4c
            r0 = 99
            if (r6 != r0) goto L45
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L49
        L45:
            int r6 = b(r6)     // Catch: java.lang.Throwable -> L4c
        L49:
            r1.s = r6     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r6 = move-exception
            goto Lae
        L4e:
            r1.r = r2     // Catch: java.lang.Throwable -> L4c
            com.autonavi.aps.amapapi.restruct.c r6 = r5.m     // Catch: java.lang.Throwable -> L4c
            r6.a(r1)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r6 = r5.a     // Catch: java.lang.Throwable -> L4c
            r6.add(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r5)
            return
        L5c:
            boolean r1 = r6 instanceof android.telephony.cdma.CdmaCellLocation     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto Lac
            android.telephony.cdma.CdmaCellLocation r6 = (android.telephony.cdma.CdmaCellLocation) r6     // Catch: java.lang.Throwable -> L4c
            com.autonavi.aps.amapapi.restruct.d r1 = new com.autonavi.aps.amapapi.restruct.d     // Catch: java.lang.Throwable -> L4c
            r4 = 2
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L4c
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L4c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L4c
            r1.a = r4     // Catch: java.lang.Throwable -> L4c
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L4c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L4c
            r1.f5735b = r0     // Catch: java.lang.Throwable -> L4c
            int r0 = r6.getBaseStationLatitude()     // Catch: java.lang.Throwable -> L4c
            r1.f5739f = r0     // Catch: java.lang.Throwable -> L4c
            int r0 = r6.getBaseStationLongitude()     // Catch: java.lang.Throwable -> L4c
            r1.f5740g = r0     // Catch: java.lang.Throwable -> L4c
            int r0 = r6.getSystemId()     // Catch: java.lang.Throwable -> L4c
            r1.f5741h = r0     // Catch: java.lang.Throwable -> L4c
            int r0 = r6.getNetworkId()     // Catch: java.lang.Throwable -> L4c
            r1.f5742i = r0     // Catch: java.lang.Throwable -> L4c
            int r6 = r6.getBaseStationId()     // Catch: java.lang.Throwable -> L4c
            r1.f5743j = r6     // Catch: java.lang.Throwable -> L4c
            android.telephony.SignalStrength r6 = r5.f5747d     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto La0
            int r6 = r6.getCdmaDbm()     // Catch: java.lang.Throwable -> L4c
            r1.s = r6     // Catch: java.lang.Throwable -> L4c
        La0:
            r1.r = r2     // Catch: java.lang.Throwable -> L4c
            com.autonavi.aps.amapapi.restruct.c r6 = r5.m     // Catch: java.lang.Throwable -> L4c
            r6.a(r1)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r6 = r5.a     // Catch: java.lang.Throwable -> L4c
            r6.add(r1)     // Catch: java.lang.Throwable -> L4c
        Lac:
            monitor-exit(r5)
            return
        Lae:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            throw r6
    }

    static /* synthetic */ void a(com.autonavi.aps.amapapi.restruct.e r0, android.telephony.CellLocation r1) {
            r0.a(r1)
            return
    }

    public static boolean a(int r1) {
            if (r1 <= 0) goto L9
            r0 = 15
            if (r1 <= r0) goto L7
            goto L9
        L7:
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    static /* synthetic */ boolean a(com.autonavi.aps.amapapi.restruct.e r0) {
            boolean r0 = r0.v
            return r0
    }

    private static int b(int r0) {
            int r0 = r0 * 2
            int r0 = r0 + (-113)
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    private void b(boolean r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.f5748e
            r1 = 0
            if (r0 != 0) goto L51
            android.telephony.TelephonyManager r0 = r4.f5745b
            if (r0 == 0) goto L51
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 < r2) goto L51
            android.content.Context r0 = r4.f5751h
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 < r2) goto L51
            android.telephony.TelephonyManager$CellInfoCallback r0 = r4.q
            if (r0 != 0) goto L24
            com.autonavi.aps.amapapi.restruct.e$a r0 = new com.autonavi.aps.amapapi.restruct.e$a
            r0.<init>(r4)
            r4.q = r0
        L24:
            android.telephony.TelephonyManager r0 = r4.f5745b     // Catch: java.lang.Throwable -> L34
            com.amap.api.col.3l.b8 r2 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r2 = r2.f()     // Catch: java.lang.Throwable -> L34
            android.telephony.TelephonyManager$CellInfoCallback r3 = r4.q     // Catch: java.lang.Throwable -> L34
            com.autonavi.aps.amapapi.restruct.m.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L34
            goto L3c
        L34:
            r0 = move-exception
            java.lang.String r2 = "Cgi"
            java.lang.String r3 = "refreshCgi"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r3)
        L3c:
            if (r6 != 0) goto L40
            if (r5 == 0) goto L51
        L40:
            r5 = 0
        L41:
            boolean r6 = r4.r
            if (r6 != 0) goto L51
            r6 = 20
            if (r5 >= r6) goto L51
            r2 = 5
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L4e
        L4e:
            int r5 = r5 + 1
            goto L41
        L51:
            r4.f5753j = r1
            android.telephony.TelephonyManager r5 = r4.f5745b
            if (r5 == 0) goto L66
            java.lang.String r5 = r5.getNetworkOperator()
            r4.f5754k = r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L66
            r5 = 1
            r4.f5753j = r5
        L66:
            long r5 = com.autonavi.aps.amapapi.utils.j.b()
            r4.n = r5
            return
    }

    static /* synthetic */ boolean b(com.autonavi.aps.amapapi.restruct.e r0) {
            boolean r0 = r0.u
            return r0
    }

    static /* synthetic */ long c(com.autonavi.aps.amapapi.restruct.e r2) {
            long r0 = r2.n
            return r0
    }

    static /* synthetic */ boolean d(com.autonavi.aps.amapapi.restruct.e r1) {
            r0 = 1
            r1.r = r0
            return r0
    }

    static /* synthetic */ android.telephony.CellLocation e(com.autonavi.aps.amapapi.restruct.e r0) {
            android.telephony.CellLocation r0 = r0.u()
            return r0
    }

    static /* synthetic */ java.util.List f(com.autonavi.aps.amapapi.restruct.e r0) {
            java.util.List r0 = r0.v()
            return r0
    }

    static /* synthetic */ com.autonavi.aps.amapapi.c g(com.autonavi.aps.amapapi.restruct.e r0) {
            com.autonavi.aps.amapapi.c r0 = r0.w
            return r0
    }

    private void o() {
            r1 = this;
            android.telephony.TelephonyManager r0 = r1.f5745b
            if (r0 != 0) goto L5
            return
        L5:
            r1.p()
            return
    }

    private void p() {
            r8 = this;
            android.telephony.PhoneStateListener r0 = r8.f5746c     // Catch: java.lang.Exception -> L75
            if (r0 != 0) goto Lb
            com.autonavi.aps.amapapi.restruct.e$b r0 = new com.autonavi.aps.amapapi.restruct.e$b     // Catch: java.lang.Exception -> L75
            r0.<init>(r8)     // Catch: java.lang.Exception -> L75
            r8.f5746c = r0     // Catch: java.lang.Exception -> L75
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = "hasNoFineLocPerm"
            java.lang.String r2 = "hasFineLocPerm"
            r3 = 336(0x150, float:4.71E-43)
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r5 = 31
            if (r0 < r5) goto L2f
            android.content.Context r6 = r8.f5751h     // Catch: java.lang.Exception -> L75
            int r6 = androidx.core.app.q.a(r6, r4)     // Catch: java.lang.Exception -> L75
            if (r6 != 0) goto L27
            r8.t = r2     // Catch: java.lang.Exception -> L75
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Exception -> L75
            goto L32
        L27:
            r8.t = r1     // Catch: java.lang.Exception -> L75
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Exception -> L75
            r3 = 320(0x140, float:4.48E-43)
            goto L32
        L2f:
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Exception -> L75
        L32:
            if (r0 < r5) goto L67
            android.content.Context r0 = r8.f5751h     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = "android.permission.READ_PHONE_STATE"
            int r0 = androidx.core.app.q.a(r0, r5)     // Catch: java.lang.Exception -> L75
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            android.content.Context r7 = r8.f5751h     // Catch: java.lang.Exception -> L75
            int r4 = androidx.core.app.q.a(r7, r4)     // Catch: java.lang.Exception -> L75
            if (r4 != 0) goto L4c
            r5 = 1
        L4c:
            if (r0 == 0) goto L52
            if (r5 == 0) goto L52
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L52:
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L5a
            java.lang.String r0 = "hasReadPhoneStatePerm"
            goto L5c
        L5a:
            java.lang.String r0 = "hasNoReadPhoneStatePerm"
        L5c:
            r8.s = r0     // Catch: java.lang.Exception -> L75
            if (r5 == 0) goto L61
            r1 = r2
        L61:
            r8.t = r1     // Catch: java.lang.Exception -> L75
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Exception -> L75
            goto L6c
        L67:
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Exception -> L75
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L6c:
            android.telephony.PhoneStateListener r0 = r8.f5746c     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L75
            android.telephony.TelephonyManager r1 = r8.f5745b     // Catch: java.lang.Exception -> L75
            r1.listen(r0, r3)     // Catch: java.lang.Exception -> L75
        L75:
            return
    }

    private int q() {
            r1 = this;
            com.autonavi.aps.amapapi.restruct.d r0 = r1.e()
            if (r0 == 0) goto L9
            int r0 = r0.l
            return r0
        L9:
            r0 = 0
            return r0
    }

    private android.telephony.CellLocation r() {
            r4 = this;
            android.telephony.TelephonyManager r0 = r4.f5745b
            r1 = 0
            if (r0 == 0) goto L23
            android.telephony.CellLocation r0 = r0.getCellLocation()     // Catch: java.lang.Throwable -> Lf java.lang.SecurityException -> L11
            com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> Lf java.lang.SecurityException -> L11
            r4.f5750g = r1     // Catch: java.lang.Throwable -> Lf java.lang.SecurityException -> L11
            return r0
        Lf:
            r0 = move-exception
            goto L13
        L11:
            r0 = move-exception
            goto L1d
        L13:
            r4.f5750g = r1
            java.lang.String r2 = "CgiManager"
            java.lang.String r3 = "getCellLocation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r2, r3)
            goto L23
        L1d:
            java.lang.String r0 = r0.getMessage()
            r4.f5750g = r0
        L23:
            return r1
    }

    private java.util.List<android.telephony.CellInfo> s() {
            r1 = this;
            android.telephony.TelephonyManager r0 = r1.f5745b
            if (r0 == 0) goto Lc
            java.util.List r0 = r0.getAllCellInfo()
            com.autonavi.aps.amapapi.utils.d.a()
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private boolean t() {
            r6 = this;
            boolean r0 = r6.f5748e
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()
            long r4 = r6.n
            long r2 = r2 - r4
            r4 = 45000(0xafc8, double:2.2233E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L15
            return r1
        L15:
            r0 = 1
            return r0
    }

    private android.telephony.CellLocation u() {
            r1 = this;
            android.telephony.TelephonyManager r0 = r1.f5745b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.telephony.CellLocation r0 = r1.r()
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    private java.util.List<android.telephony.CellInfo> v() {
            r4 = this;
            r0 = 0
            int r1 = com.autonavi.aps.amapapi.utils.j.c()     // Catch: java.lang.Throwable -> L16
            r2 = 18
            if (r1 >= r2) goto La
            return r0
        La:
            android.telephony.TelephonyManager r1 = r4.f5745b     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.util.List r1 = r4.s()     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L1a
            r4.f5750g = r0     // Catch: java.lang.Throwable -> L16 java.lang.SecurityException -> L18
            return r1
        L16:
            r1 = move-exception
            goto L23
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            r2 = move-exception
            r1 = r0
        L1c:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L16
            r4.f5750g = r2     // Catch: java.lang.Throwable -> L16
            return r1
        L23:
            java.lang.String r2 = "Cgi"
            java.lang.String r3 = "getNewCells"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
            return r0
    }

    public final java.util.List<com.amap.api.col.p0003l.ko> a() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r9.s()
            if (r1 == 0) goto L189
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L189
            java.lang.Object r2 = r1.next()
            android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2
            boolean r3 = r2 instanceof android.telephony.CellInfoCdma
            r4 = 1
            if (r3 == 0) goto L66
            r3 = r2
            android.telephony.CellInfoCdma r3 = (android.telephony.CellInfoCdma) r3
            android.telephony.CellIdentityCdma r5 = r3.getCellIdentity()
            com.amap.api.col.3l.kp r6 = new com.amap.api.col.3l.kp
            boolean r2 = r2.isRegistered()
            r6.<init>(r2, r4)
            int r2 = r5.getLatitude()
            r6.m = r2
            int r2 = r5.getLongitude()
            r6.n = r2
            int r2 = r5.getSystemId()
            r6.f3654j = r2
            int r2 = r5.getNetworkId()
            r6.f3655k = r2
            int r2 = r5.getBasestationId()
            r6.l = r2
            android.telephony.CellSignalStrengthCdma r2 = r3.getCellSignalStrength()
            int r2 = r2.getAsuLevel()
            r6.f3648d = r2
            android.telephony.CellSignalStrengthCdma r2 = r3.getCellSignalStrength()
            int r2 = r2.getCdmaDbm()
            r6.f3647c = r2
            r0.add(r6)
            goto Lf
        L66:
            boolean r3 = r2 instanceof android.telephony.CellInfoGsm
            r5 = 24
            if (r3 == 0) goto Lc5
            r3 = r2
            android.telephony.CellInfoGsm r3 = (android.telephony.CellInfoGsm) r3
            android.telephony.CellIdentityGsm r6 = r3.getCellIdentity()
            com.amap.api.col.3l.kq r7 = new com.amap.api.col.3l.kq
            boolean r2 = r2.isRegistered()
            r7.<init>(r2, r4)
            int r2 = r6.getMcc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r7.a = r2
            int r2 = r6.getMnc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r7.f3646b = r2
            int r2 = r6.getLac()
            r7.f3656j = r2
            int r2 = r6.getCid()
            r7.f3657k = r2
            android.telephony.CellSignalStrengthGsm r2 = r3.getCellSignalStrength()
            int r2 = r2.getDbm()
            r7.f3647c = r2
            android.telephony.CellSignalStrengthGsm r2 = r3.getCellSignalStrength()
            int r2 = r2.getAsuLevel()
            r7.f3648d = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto Lc0
            int r2 = com.autonavi.aps.amapapi.restruct.p.a(r6)
            r7.m = r2
            int r2 = com.autonavi.aps.amapapi.restruct.o.a(r6)
            r7.n = r2
        Lc0:
            r0.add(r7)
            goto Lf
        Lc5:
            boolean r3 = r2 instanceof android.telephony.CellInfoLte
            if (r3 == 0) goto L12c
            r3 = r2
            android.telephony.CellInfoLte r3 = (android.telephony.CellInfoLte) r3
            android.telephony.CellIdentityLte r4 = r3.getCellIdentity()
            com.amap.api.col.3l.kr r6 = new com.amap.api.col.3l.kr
            boolean r2 = r2.isRegistered()
            r6.<init>(r2)
            int r2 = r4.getMcc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6.a = r2
            int r2 = r4.getMnc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6.f3646b = r2
            int r2 = r4.getPci()
            r6.l = r2
            android.telephony.CellSignalStrengthLte r2 = r3.getCellSignalStrength()
            int r2 = r2.getAsuLevel()
            r6.f3648d = r2
            int r2 = r4.getCi()
            r6.f3659k = r2
            int r2 = r4.getTac()
            r6.f3658j = r2
            android.telephony.CellSignalStrengthLte r2 = r3.getCellSignalStrength()
            int r2 = r2.getTimingAdvance()
            r6.n = r2
            android.telephony.CellSignalStrengthLte r2 = r3.getCellSignalStrength()
            int r2 = r2.getDbm()
            r6.f3647c = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L127
            int r2 = com.autonavi.aps.amapapi.restruct.l.a(r4)
            r6.m = r2
        L127:
            r0.add(r6)
            goto Lf
        L12c:
            int r3 = android.os.Build.VERSION.SDK_INT
            boolean r6 = r2 instanceof android.telephony.CellInfoWcdma
            if (r6 == 0) goto Lf
            r6 = r2
            android.telephony.CellInfoWcdma r6 = (android.telephony.CellInfoWcdma) r6
            android.telephony.CellIdentityWcdma r7 = r6.getCellIdentity()
            com.amap.api.col.3l.ks r8 = new com.amap.api.col.3l.ks
            boolean r2 = r2.isRegistered()
            r8.<init>(r2, r4)
            int r2 = r7.getMcc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r8.a = r2
            int r2 = r7.getMnc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r8.f3646b = r2
            int r2 = r7.getLac()
            r8.f3660j = r2
            int r2 = r7.getCid()
            r8.f3661k = r2
            int r2 = r7.getPsc()
            r8.l = r2
            android.telephony.CellSignalStrengthWcdma r2 = r6.getCellSignalStrength()
            int r2 = r2.getAsuLevel()
            r8.f3648d = r2
            android.telephony.CellSignalStrengthWcdma r2 = r6.getCellSignalStrength()
            int r2 = r2.getDbm()
            r8.f3647c = r2
            if (r3 < r5) goto L184
            int r2 = com.autonavi.aps.amapapi.restruct.n.a(r7)
            r8.m = r2
        L184:
            r0.add(r8)
            goto Lf
        L189:
            return r0
    }

    public final void a(com.autonavi.aps.amapapi.c r1) {
            r0 = this;
            r0.w = r1
            return
    }

    final synchronized void a(java.util.List<android.telephony.CellInfo> r9) {
            r8 = this;
            monitor-enter(r8)
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r8.l     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r0.clear()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r9 = move-exception
            goto La1
        Lc:
            if (r9 == 0) goto L9f
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L9
            if (r0 > 0) goto L16
            goto L9f
        L16:
            r0 = 0
            r1 = 0
        L18:
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L9
            r3 = 1
            if (r1 >= r2) goto L8f
            java.lang.Object r2 = r9.get(r1)     // Catch: java.lang.Throwable -> L9
            android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2     // Catch: java.lang.Throwable -> L9
            if (r2 == 0) goto L8c
            boolean r4 = r2.isRegistered()     // Catch: java.lang.Throwable -> L9
            boolean r5 = r2 instanceof android.telephony.CellInfoCdma     // Catch: java.lang.Throwable -> L9
            if (r5 == 0) goto L36
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r2 = r8.a(r2, r4)     // Catch: java.lang.Throwable -> L9
            goto L6d
        L36:
            boolean r5 = r2 instanceof android.telephony.CellInfoGsm     // Catch: java.lang.Throwable -> L9
            if (r5 == 0) goto L41
            android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r2 = a(r2, r4)     // Catch: java.lang.Throwable -> L9
            goto L6d
        L41:
            boolean r5 = r2 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Throwable -> L9
            if (r5 == 0) goto L4c
            android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r2 = a(r2, r4)     // Catch: java.lang.Throwable -> L9
            goto L6d
        L4c:
            boolean r5 = r2 instanceof android.telephony.CellInfoLte     // Catch: java.lang.Throwable -> L9
            if (r5 == 0) goto L57
            android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r2 = a(r2, r4)     // Catch: java.lang.Throwable -> L9
            goto L6d
        L57:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9
            r6 = 29
            if (r5 < r6) goto L6c
            boolean r5 = cn.jiguang.commons.L.m0.a(r2)     // Catch: java.lang.Throwable -> L9
            if (r5 == 0) goto L6c
            android.telephony.CellInfoNr r2 = cn.jiguang.commons.L.w0.a(r2)     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r2 = a(r2, r4)     // Catch: java.lang.Throwable -> L9
            goto L6d
        L6c:
            r2 = 0
        L6d:
            if (r2 == 0) goto L8c
            com.autonavi.aps.amapapi.restruct.c r4 = r8.m     // Catch: java.lang.Throwable -> L9
            r4.a(r2)     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.c r4 = r8.m     // Catch: java.lang.Throwable -> L9
            long r4 = r4.e(r2)     // Catch: java.lang.Throwable -> L9
            r6 = 65535(0xffff, double:3.23786E-319)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> L9
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L9
            short r4 = (short) r5     // Catch: java.lang.Throwable -> L9
            r2.m = r4     // Catch: java.lang.Throwable -> L9
            r2.r = r3     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r8.l     // Catch: java.lang.Throwable -> L9
            r3.add(r2)     // Catch: java.lang.Throwable -> L9
        L8c:
            int r1 = r1 + 1
            goto L18
        L8f:
            r8.f5752i = r0     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r9 = r8.l     // Catch: java.lang.Throwable -> L9
            if (r9 == 0) goto L9d
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L9
            if (r9 <= 0) goto L9d
            r8.f5752i = r3     // Catch: java.lang.Throwable -> L9
        L9d:
            monitor-exit(r8)
            return
        L9f:
            monitor-exit(r8)
            return
        La1:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9
            throw r9
    }

    public final void a(boolean r3) {
            r2 = this;
            com.autonavi.aps.amapapi.restruct.c r0 = r2.m
            r0.a(r3)
            r0 = 0
            r2.n = r0
            java.lang.Object r3 = r2.p
            monitor-enter(r3)
            r0 = 1
            r2.o = r0     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            android.telephony.TelephonyManager r3 = r2.f5745b
            if (r3 == 0) goto L25
            android.telephony.PhoneStateListener r0 = r2.f5746c
            if (r0 == 0) goto L25
            r1 = 0
            r3.listen(r0, r1)     // Catch: java.lang.Throwable -> L1d
            goto L25
        L1d:
            r3 = move-exception
            java.lang.String r0 = "CgiManager"
            java.lang.String r1 = "destroy"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
        L25:
            r3 = 0
            r2.f5746c = r3
            r2.f5747d = r3
            r2.f5745b = r3
            return
        L2d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r0
    }

    public final void a(boolean r2, boolean r3) {
            r1 = this;
            android.content.Context r0 = r1.f5751h     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            r1.f5748e = r0     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            boolean r0 = r1.t()     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            if (r0 == 0) goto L24
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            android.telephony.CellLocation r2 = r1.u()     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            r1.a(r2)     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            java.util.List r2 = r1.v()     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            r1.a(r2)     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            goto L24
        L20:
            r2 = move-exception
            goto L2c
        L22:
            r2 = move-exception
            goto L34
        L24:
            boolean r2 = r1.f5748e     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            if (r2 == 0) goto L2b
            r1.j()     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
        L2b:
            return
        L2c:
            java.lang.String r3 = "CgiManager"
            java.lang.String r0 = "refresh"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
        L34:
            java.lang.String r2 = r2.getMessage()
            r1.f5750g = r2
            return
    }

    public final void b() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L53
            r1 = 31
            if (r0 < r1) goto L52
            android.content.Context r0 = r4.f5751h     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = androidx.core.app.q.a(r0, r1)     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L13
            java.lang.String r0 = "hasFineLocPerm"
            goto L15
        L13:
            java.lang.String r0 = "hasNoFineLocPerm"
        L15:
            android.content.Context r1 = r4.f5751h     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            int r1 = androidx.core.app.q.a(r1, r2)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L22
            java.lang.String r1 = "hasReadPhoneStatePerm"
            goto L24
        L22:
            java.lang.String r1 = "hasNoReadPhoneStatePerm"
        L24:
            java.lang.String r2 = r4.t     // Catch: java.lang.Throwable -> L53
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 1
            if (r2 != 0) goto L37
            java.lang.String r2 = r4.t     // Catch: java.lang.Throwable -> L53
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            java.lang.String r2 = r4.s     // Catch: java.lang.Throwable -> L53
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L49
            java.lang.String r2 = r4.s     // Catch: java.lang.Throwable -> L53
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L49
            goto L4a
        L49:
            r3 = r0
        L4a:
            if (r3 == 0) goto L52
            com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Throwable -> L53
            r4.p()     // Catch: java.lang.Throwable -> L53
        L52:
            return
        L53:
            com.autonavi.aps.amapapi.utils.d.b()
            return
    }

    public final void b(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public final synchronized java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> c() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r1 = r3.a     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L22
            com.autonavi.aps.amapapi.restruct.d r2 = (com.autonavi.aps.amapapi.restruct.d) r2     // Catch: java.lang.Throwable -> L22
            com.autonavi.aps.amapapi.restruct.d r2 = r2.d()     // Catch: java.lang.Throwable -> L22
            r0.add(r2)     // Catch: java.lang.Throwable -> L22
            goto Le
        L22:
            r0 = move-exception
            goto L26
        L24:
            monitor-exit(r3)
            return r0
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public final void c(boolean r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public final synchronized java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> d() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r1 = r3.l     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L22
            com.autonavi.aps.amapapi.restruct.d r2 = (com.autonavi.aps.amapapi.restruct.d) r2     // Catch: java.lang.Throwable -> L22
            com.autonavi.aps.amapapi.restruct.d r2 = r2.d()     // Catch: java.lang.Throwable -> L22
            r0.add(r2)     // Catch: java.lang.Throwable -> L22
            goto Le
        L22:
            r0 = move-exception
            goto L26
        L24:
            monitor-exit(r3)
            return r0
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public final synchronized com.autonavi.aps.amapapi.restruct.d e() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f5748e     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r3)
            return r1
        L8:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r3.a     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L1d
            if (r2 <= 0) goto L1f
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1d
            com.autonavi.aps.amapapi.restruct.d r0 = (com.autonavi.aps.amapapi.restruct.d) r0     // Catch: java.lang.Throwable -> L1d
            com.autonavi.aps.amapapi.restruct.d r0 = r0.d()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r0
        L1d:
            r0 = move-exception
            goto L21
        L1f:
            monitor-exit(r3)
            return r1
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public final synchronized com.autonavi.aps.amapapi.restruct.d f() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f5748e     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r4)
            return r1
        L8:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r4.l     // Catch: java.lang.Throwable -> L2a
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L2a
            if (r2 <= 0) goto L39
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            com.autonavi.aps.amapapi.restruct.d r2 = (com.autonavi.aps.amapapi.restruct.d) r2     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.n     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L14
            com.autonavi.aps.amapapi.restruct.d r0 = r2.d()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return r0
        L2a:
            r0 = move-exception
            goto L3b
        L2c:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            com.autonavi.aps.amapapi.restruct.d r0 = (com.autonavi.aps.amapapi.restruct.d) r0     // Catch: java.lang.Throwable -> L2a
            com.autonavi.aps.amapapi.restruct.d r0 = r0.d()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return r0
        L39:
            monitor-exit(r4)
            return r1
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    public final int g() {
            r3 = this;
            int r0 = r3.q()
            boolean r1 = r3.f5752i
            r2 = 0
            if (r1 == 0) goto Lb
            r1 = 4
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0 = r0 | r1
            boolean r1 = r3.f5753j
            if (r1 == 0) goto L13
            r2 = 8
        L13:
            r0 = r0 | r2
            return r0
    }

    public final int h() {
            r1 = this;
            int r0 = r1.q()
            r0 = r0 & 3
            return r0
    }

    public final android.telephony.TelephonyManager i() {
            r1 = this;
            android.telephony.TelephonyManager r0 = r1.f5745b
            return r0
    }

    final synchronized void j() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.f5750g = r0     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r1.a     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r0 = r1.l     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            r0 = 0
            r1.f5752i = r0     // Catch: java.lang.Throwable -> L15
            r1.f5753j = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.f5750g
            return r0
    }

    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.f5754k
            return r0
    }

    public final synchronized java.lang.String m() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f5748e     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            r7.j()     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto L126
        Lc:
            java.lang.StringBuilder r0 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            r1 = 0
            if (r0 != 0) goto L19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9
            r0.<init>()     // Catch: java.lang.Throwable -> L9
            r7.f5749f = r0     // Catch: java.lang.Throwable -> L9
            goto L20
        L19:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L9
            r0.delete(r1, r2)     // Catch: java.lang.Throwable -> L9
        L20:
            int r0 = r7.h()     // Catch: java.lang.Throwable -> L9
            r2 = 1
            if (r0 == r2) goto L28
            goto L70
        L28:
            r0 = 1
        L29:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r7.a     // Catch: java.lang.Throwable -> L9
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L9
            if (r0 >= r3) goto L70
            java.lang.StringBuilder r3 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r4 = "#"
            r3.append(r4)     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r4 = r7.a     // Catch: java.lang.Throwable -> L9
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r4 = (com.autonavi.aps.amapapi.restruct.d) r4     // Catch: java.lang.Throwable -> L9
            int r4 = r4.f5735b     // Catch: java.lang.Throwable -> L9
            r3.append(r4)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r3 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r4 = "|"
            r3.append(r4)     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r4 = r7.a     // Catch: java.lang.Throwable -> L9
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r4 = (com.autonavi.aps.amapapi.restruct.d) r4     // Catch: java.lang.Throwable -> L9
            int r4 = r4.f5736c     // Catch: java.lang.Throwable -> L9
            r3.append(r4)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r3 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r4 = "|"
            r3.append(r4)     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r4 = r7.a     // Catch: java.lang.Throwable -> L9
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r4 = (com.autonavi.aps.amapapi.restruct.d) r4     // Catch: java.lang.Throwable -> L9
            int r4 = r4.f5737d     // Catch: java.lang.Throwable -> L9
            r3.append(r4)     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            goto L29
        L70:
            r0 = 1
        L71:
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r7.l     // Catch: java.lang.Throwable -> L9
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L9
            if (r0 >= r3) goto L111
            java.util.ArrayList<com.autonavi.aps.amapapi.restruct.d> r3 = r7.l     // Catch: java.lang.Throwable -> L9
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L9
            com.autonavi.aps.amapapi.restruct.d r3 = (com.autonavi.aps.amapapi.restruct.d) r3     // Catch: java.lang.Throwable -> L9
            int r4 = r3.l     // Catch: java.lang.Throwable -> L9
            if (r4 == r2) goto Lcf
            r5 = 3
            if (r4 == r5) goto Lcf
            r5 = 4
            if (r4 == r5) goto Lcf
            r5 = 5
            if (r4 != r5) goto L8f
            goto Lcf
        L8f:
            r5 = 2
            if (r4 != r5) goto L10d
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.l     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.a     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.f5741h     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.f5742i     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r3 = r3.f5743j     // Catch: java.lang.Throwable -> L9
            r4.append(r3)     // Catch: java.lang.Throwable -> L9
            goto L10d
        Lcf:
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.l     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.a     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.f5735b     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r3.f5736c     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r4 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
            long r5 = r3.a()     // Catch: java.lang.Throwable -> L9
            r4.append(r5)     // Catch: java.lang.Throwable -> L9
        L10d:
            int r0 = r0 + 1
            goto L71
        L111:
            java.lang.StringBuilder r0 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L9
            if (r0 <= 0) goto L11e
            java.lang.StringBuilder r0 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            r0.deleteCharAt(r1)     // Catch: java.lang.Throwable -> L9
        L11e:
            java.lang.StringBuilder r0 = r7.f5749f     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r7)
            return r0
        L126:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final boolean n() {
            r3 = this;
            r0 = 1
            android.telephony.TelephonyManager r1 = r3.f5745b     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1d
            java.lang.String r1 = r1.getSimOperator()     // Catch: java.lang.Throwable -> L1d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L10
            return r0
        L10:
            android.telephony.TelephonyManager r1 = r3.f5745b     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.getSimCountryIso()     // Catch: java.lang.Throwable -> L1d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1d
            return r0
        L1d:
            android.content.Context r1 = r3.f5751h     // Catch: java.lang.Throwable -> L36
            android.net.NetworkInfo r1 = com.autonavi.aps.amapapi.utils.j.c(r1)     // Catch: java.lang.Throwable -> L36
            int r1 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L35
            r2 = 4
            if (r1 == r2) goto L35
            r2 = 2
            if (r1 == r2) goto L35
            r2 = 5
            if (r1 == r2) goto L35
            r2 = 3
            if (r1 != r2) goto L36
        L35:
            return r0
        L36:
            r0 = 0
            return r0
    }
}

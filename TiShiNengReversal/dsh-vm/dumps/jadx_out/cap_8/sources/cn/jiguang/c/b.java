package cn.jiguang.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jiguang.internal.JCoreHelperAction {
    public static java.util.List<java.lang.Integer> a;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f737b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f738c;




    private static class a implements java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.String>> {
        private android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Integer f741b;

        public a(android.content.Context r1, java.lang.Integer r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f741b = r2
                return
        }

        public java.util.Map<java.lang.String, java.lang.String> a() {
                r2 = this;
                android.content.Context r0 = r2.a
                java.lang.Integer r1 = r2.f741b
                int r1 = r1.intValue()
                java.util.Map r0 = cn.jiguang.dy.b.c(r0, r1)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.util.Map<java.lang.String, java.lang.String> call() {
                r1 = this;
                java.util.Map r0 = r1.a()
                return r0
        }
    }

    /* renamed from: cn.jiguang.c.b$b, reason: collision with other inner class name */
    class C0019b extends cn.jiguang.au.b {
        final /* synthetic */ cn.jiguang.c.b a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f742b;

        /* renamed from: c, reason: collision with root package name */
        private android.content.Intent f743c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f744d;

        public C0019b(cn.jiguang.c.b r1, android.content.Context r2, android.content.Intent r3, java.lang.String r4) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f742b = r2
                r0.f744d = r4
                r0.f743c = r3
                java.lang.String r1 = "JCoreHelper#PushReceiverAction"
                r0.f668h = r1
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r4 = this;
                cn.jiguang.internal.ActionManager r0 = cn.jiguang.internal.ActionManager.getInstance()     // Catch: java.lang.Throwable -> L17
                android.content.Context r1 = r4.f742b     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = r4.f744d     // Catch: java.lang.Throwable -> L17
                android.content.Intent r3 = r4.f743c     // Catch: java.lang.Throwable -> L17
                r0.handleMessage(r1, r2, r3)     // Catch: java.lang.Throwable -> L17
                cn.jiguang.c.b r0 = r4.a     // Catch: java.lang.Throwable -> L17
                android.content.Context r1 = r4.f742b     // Catch: java.lang.Throwable -> L17
                android.content.Intent r2 = r4.f743c     // Catch: java.lang.Throwable -> L17
                cn.jiguang.c.b.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[PushReceiverAction failed:]"
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "JCoreHelper"
                cn.jiguang.w.f.l(r1, r0)
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.c.b.a = r0
            r1 = 134(0x86, float:1.88E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 98
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 99
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 104(0x68, float:1.46E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 119(0x77, float:1.67E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 120(0x78, float:1.68E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 121(0x79, float:1.7E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r2 = 76
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 42
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 89
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 90
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 92
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 95
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 102(0x66, float:1.43E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 108(0x6c, float:1.51E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r3 = 109(0x6d, float:1.53E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 116(0x74, float:1.63E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 122(0x7a, float:1.71E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 128(0x80, float:1.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 66
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r0.add(r2)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 77
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 78
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 83
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 130(0x82, float:1.82E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 131(0x83, float:1.84E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            r1 = 133(0x85, float:1.86E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.String r6 = "JArp"
            java.lang.String r7 = "JLocation"
            java.lang.String r2 = "JDevice"
            java.lang.String r3 = "JWakeCmd"
            java.lang.String r4 = "JWake"
            java.lang.String r5 = "JCommon"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            cn.jiguang.c.b.f737b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f738c = r0
            return
    }

    private static android.content.pm.PackageInfo a(android.content.Context r5, java.lang.Object... r6) {
            if (r5 == 0) goto L44
            if (r6 != 0) goto L5
            goto L44
        L5:
            int r0 = r6.length
            r1 = 1
            r2 = 0
            java.lang.String r3 = ""
            if (r0 != r1) goto L21
            r6 = r6[r2]
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L16
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
            goto L34
        L16:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L34
        L1a:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r2 = r6.intValue()
            goto L34
        L21:
            int r0 = r6.length
            if (r0 <= r1) goto L34
            r0 = r6[r2]
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L34
            r6 = r6[r1]
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 == 0) goto L34
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L1a
        L34:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L3f
            android.content.pm.PackageInfo r5 = cn.jiguang.av.o.a(r5, r3, r2)
            return r5
        L3f:
            android.content.pm.PackageInfo r5 = cn.jiguang.av.o.a(r5, r2)
            return r5
        L44:
            r5 = 0
            return r5
    }

    private static android.os.Bundle a(android.content.Context r3, int r4, android.os.Bundle r5) {
            r0 = 0
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            r2 = 4096(0x1000, float:5.74E-42)
            if (r4 == r2) goto L27
            r2 = 4098(0x1002, float:5.743E-42)
            if (r4 == r2) goto L23
            switch(r4) {
                case 36864: goto L1f;
                case 36865: goto L12;
                default: goto L11;
            }     // Catch: java.lang.Throwable -> L1c
        L11:
            return r0
        L12:
            boolean r3 = cn.jiguang.api.JCoreManager.isInternal()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            cn.jiguang.internal.JConstants.testAndroidQ()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L33
        L1e:
            return r0
        L1f:
            a(r5)     // Catch: java.lang.Throwable -> L1c
            return r0
        L23:
            cn.jiguang.api.JCoreManager.init(r3)     // Catch: java.lang.Throwable -> L1c
            return r1
        L27:
            if (r5 == 0) goto L32
            java.lang.String r4 = "arg1"
            java.lang.String r4 = cn.jiguang.v.a.a(r5, r4)     // Catch: java.lang.Throwable -> L1c
            a(r3, r4)     // Catch: java.lang.Throwable -> L1c
        L32:
            return r1
        L33:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "si e:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JCoreHelper"
            cn.jiguang.w.f.l(r4, r3)
            return r0
    }

    private java.lang.Boolean a(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L22
            boolean r0 = cn.jiguang.v.h.b()
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = 82
            if (r3 != r0) goto L1a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L1a:
            return r1
        L1b:
            boolean r3 = cn.jiguang.v.i.a()
            if (r3 == 0) goto L22
            return r1
        L22:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
    }

    public static java.lang.String a(android.content.Context r1) {
            android.util.Pair r1 = cn.jiguang.v.a.d(r1)
            if (r1 == 0) goto L15
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = cn.jiguang.av.v.a(r0)
            if (r0 != 0) goto L15
            java.lang.Object r1 = r1.first
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L15:
            java.lang.String r1 = ""
            return r1
    }

    private void a(android.content.Context r8, android.content.Intent r9) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[handleReceiverIntent]:"
            r0.append(r1)
            java.lang.String r1 = r9.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreHelper"
            cn.jiguang.w.f.c(r1, r0)
            java.lang.String r0 = "get_receiver"
            cn.jiguang.i.a.a(r8, r0, r9)
            java.lang.String r0 = r9.getAction()
            if (r0 != 0) goto L2b
            java.lang.String r8 = "onReceive empty action"
            cn.jiguang.w.f.i(r1, r8)
            return
        L2b:
            java.lang.String r2 = "android.intent.action.USER_PRESENT"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L35
            goto L1d3
        L35:
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r2 = r0.equalsIgnoreCase(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Le8
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r0 = r9.getParcelableExtra(r0)
            android.net.NetworkInfo r0 = (android.net.NetworkInfo) r0
            if (r0 != 0) goto L4f
            java.lang.String r8 = "Not found networkInfo"
            cn.jiguang.w.f.i(r1, r8)
            return
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Connection state changed to - "
            r2.append(r5)
            java.lang.String r5 = r0.toString()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r1, r2)
            r2 = 2
            int r5 = r0.getType()
            if (r2 == r5) goto Le2
            r2 = 3
            int r5 = r0.getType()
            if (r2 != r5) goto L76
            goto Le2
        L76:
            java.lang.String r2 = "noConnectivity"
            boolean r2 = r9.getBooleanExtra(r2, r4)
            android.os.Bundle r9 = r9.getExtras()
            if (r9 != 0) goto L87
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L87:
            java.lang.String r5 = "connected"
            if (r2 == 0) goto L94
            java.lang.String r0 = "No any network is connected"
            cn.jiguang.w.f.c(r1, r0)
            r9.putBoolean(r5, r4)
            goto Ldb
        L94:
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> Ld4
            android.net.NetworkInfo$State r6 = r0.getState()     // Catch: java.lang.Throwable -> Ld4
            if (r2 != r6) goto La5
            java.lang.String r0 = "Network is connected."
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> Ld4
            r9.putBoolean(r5, r3)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        La5:
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTED     // Catch: java.lang.Throwable -> Ld4
            android.net.NetworkInfo$State r3 = r0.getState()     // Catch: java.lang.Throwable -> Ld4
            if (r2 != r3) goto Lb6
            java.lang.String r0 = "Network is disconnected."
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> Ld4
            r9.putBoolean(r5, r4)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Lb6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "other network state - "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld4
            android.net.NetworkInfo$State r0 = r0.getState()     // Catch: java.lang.Throwable -> Ld4
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = ". Do nothing."
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Ld4
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Ld4:
            boolean r0 = cn.jiguang.av.n.a()
            r9.putBoolean(r5, r0)
        Ldb:
            java.lang.String r0 = "tcp_a15"
            cn.jiguang.a.a.a(r8, r0, r9)
            goto L1d3
        Le2:
            java.lang.String r8 = "MMS or SUPL network state change, to do nothing!"
            cn.jiguang.w.f.c(r1, r8)
            return
        Le8:
            java.lang.String r2 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            boolean r5 = r0.equals(r2)
            java.lang.String r6 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            if (r5 != 0) goto L172
            boolean r5 = r0.equals(r6)
            if (r5 == 0) goto Lfa
            goto L172
        Lfa:
            java.lang.String r1 = "noti_open_proxy"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L140
            java.lang.String r0 = "debug_notification"
            boolean r0 = r9.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L1d3
            java.lang.String r0 = "toastText"
            java.lang.String r9 = r9.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L1d3
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)
            android.view.View r0 = r8.getView()     // Catch: java.lang.Exception -> L13c
            boolean r1 = r0 instanceof android.widget.LinearLayout     // Catch: java.lang.Exception -> L13c
            if (r1 == 0) goto L13c
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L13c
            android.view.View r0 = r0.getChildAt(r4)     // Catch: java.lang.Exception -> L13c
            boolean r1 = r0 instanceof android.widget.TextView     // Catch: java.lang.Exception -> L13c
            if (r1 == 0) goto L13c
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L13c
            boolean r1 = cn.jiguang.av.v.a(r9)     // Catch: java.lang.Exception -> L13c
            if (r1 != 0) goto L137
            r0.setText(r9)     // Catch: java.lang.Exception -> L13c
        L137:
            r9 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r9)     // Catch: java.lang.Exception -> L13c
        L13c:
            r8.show()
            return
        L140:
            java.lang.String r1 = cn.jiguang.al.c.f574e
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "data"
            if (r1 == 0) goto L15c
            android.os.Bundle r8 = r9.getExtras()
            if (r8 == 0) goto L1d3
            java.lang.String r8 = r8.getString(r2)
            cn.jiguang.al.c r9 = cn.jiguang.al.c.a()
            r9.b(r8)
            return
        L15c:
            java.lang.String r1 = cn.jiguang.v.k.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d3
            android.os.Bundle r9 = r9.getExtras()
            if (r9 == 0) goto L1d3
            java.lang.String r9 = r9.getString(r2)
            cn.jiguang.v.k.a(r8, r9)
            return
        L172:
            java.lang.String r9 = "power"
            java.lang.Object r9 = r8.getSystemService(r9)
            android.os.PowerManager r9 = (android.os.PowerManager) r9
            if (r9 == 0) goto L1d3
            java.lang.String r4 = "android.os.PowerManager"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L19c
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L19c
            r5 = 0
            if (r2 == 0) goto L19e
            java.lang.String r0 = "isDeviceIdleMode"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r5)     // Catch: java.lang.Throwable -> L19c
            if (r0 == 0) goto L1b1
            java.lang.Object r9 = r0.invoke(r9, r5)     // Catch: java.lang.Throwable -> L19c
        L195:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19c
            goto L1b2
        L19c:
            r8 = move-exception
            goto L1bf
        L19e:
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Throwable -> L19c
            if (r0 == 0) goto L1b1
            java.lang.String r0 = "isPowerSaveMode"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r5)     // Catch: java.lang.Throwable -> L19c
            if (r0 == 0) goto L1b1
            java.lang.Object r9 = r0.invoke(r9, r5)     // Catch: java.lang.Throwable -> L19c
            goto L195
        L1b1:
            r9 = 1
        L1b2:
            if (r9 != 0) goto L1d3
            java.lang.String r9 = "doze or powersave mode exit."
            cn.jiguang.w.f.c(r1, r9)     // Catch: java.lang.Throwable -> L19c
            r4 = 0
            cn.jiguang.a.a.a(r8, r3, r4)     // Catch: java.lang.Throwable -> L19c
            goto L1d3
        L1bf:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "handle DEVICE_IDLE_MODE_CHANGED or POWER_SAVE_MODE_CHANGED fail:"
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.w.f.l(r1, r8)
        L1d3:
            return
    }

    private static void a(android.content.Context r8, android.os.Bundle r9) {
            java.lang.String r0 = "tcp_report"
            java.lang.String r1 = "plugin_multi_switch"
            java.lang.String r2 = "plugin_report_switch"
            java.lang.String r3 = "JCoreHelper"
            if (r9 == 0) goto L115
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L12
            goto L115
        L12:
            java.lang.String r4 = "setSDKConfigs"
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L115
            java.lang.String r4 = "heartbeat_interval"
            int r5 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL     // Catch: java.lang.Throwable -> L6c
            int r4 = r9.getInt(r4, r5)     // Catch: java.lang.Throwable -> L6c
            int r5 = cn.jiguang.ad.g.f389b     // Catch: java.lang.Throwable -> L6c
            if (r4 < r5) goto L3f
            int r5 = cn.jiguang.ad.g.a     // Catch: java.lang.Throwable -> L6c
            if (r4 <= r5) goto L28
            goto L3f
        L28:
            cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "set heartbeat interval="
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L6c
            goto L6c
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "Invalid heartbeat interval: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = ". Valid range is ["
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            int r4 = cn.jiguang.ad.g.f389b     // Catch: java.lang.Throwable -> L6c
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = ", "
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            int r4 = cn.jiguang.ad.g.a     // Catch: java.lang.Throwable -> L6c
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "] seconds"
            r5.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L6c
            cn.jiguang.w.f.l(r3, r4)     // Catch: java.lang.Throwable -> L6c
        L6c:
            java.lang.String r4 = "alarm_delay"
            int r5 = cn.jiguang.internal.JConstants.DEFAULT_ALARM_DELAY     // Catch: java.lang.Throwable -> L9a
            int r4 = r9.getInt(r4, r5)     // Catch: java.lang.Throwable -> L9a
            r5 = 86400(0x15180, float:1.21072E-40)
            if (r4 <= r5) goto L7c
            r4 = 86400(0x15180, float:1.21072E-40)
        L7c:
            int r5 = cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL     // Catch: java.lang.Throwable -> L9a
            int r6 = r5 + 5
            if (r4 >= r6) goto L84
            int r4 = r5 + 5
        L84:
            cn.jiguang.internal.JConstants.DEFAULT_ALARM_DELAY = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = "set alarm delay="
            r5.append(r6)     // Catch: java.lang.Throwable -> L9a
            r5.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L9a
        L9a:
            java.lang.String r4 = "tcp_algorithm"
            r5 = -1
            int r4 = r9.getInt(r4, r5)     // Catch: java.lang.Throwable -> L115
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L115
            if (r4 < 0) goto Lba
            cn.jiguang.internal.JConstants.tcpAlgorithm = r4     // Catch: java.lang.Throwable -> L115
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L115
            r6.<init>()     // Catch: java.lang.Throwable -> L115
            java.lang.String r7 = "set tcp algorithm="
            r6.append(r7)     // Catch: java.lang.Throwable -> L115
            r6.append(r4)     // Catch: java.lang.Throwable -> L115
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L115
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L115
        Lba:
            boolean r3 = r9.containsKey(r0)     // Catch: java.lang.Throwable -> L115
            if (r3 == 0) goto Lc6
            boolean r0 = r9.getBoolean(r0)     // Catch: java.lang.Throwable -> L115
            cn.jiguang.y.g.f1576d = r0     // Catch: java.lang.Throwable -> L115
        Lc6:
            boolean r0 = r9.containsKey(r2)     // Catch: java.lang.Throwable -> L115
            java.lang.String r3 = "cn.jiguang.prefs"
            r4 = 0
            if (r0 == 0) goto Le2
            boolean r0 = r9.getBoolean(r2)     // Catch: java.lang.Throwable -> L115
            android.content.SharedPreferences r6 = r8.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L115
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L115
            android.content.SharedPreferences$Editor r0 = r6.putBoolean(r2, r0)     // Catch: java.lang.Throwable -> L115
            r0.apply()     // Catch: java.lang.Throwable -> L115
        Le2:
            boolean r0 = r9.containsKey(r1)     // Catch: java.lang.Throwable -> L115
            if (r0 == 0) goto Lfb
            boolean r0 = r9.getBoolean(r1)     // Catch: java.lang.Throwable -> L115
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L115
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch: java.lang.Throwable -> L115
            android.content.SharedPreferences$Editor r8 = r8.putBoolean(r1, r0)     // Catch: java.lang.Throwable -> L115
            r8.apply()     // Catch: java.lang.Throwable -> L115
        Lfb:
            java.lang.String r8 = "ipv_config"
            int r8 = r9.getInt(r8, r5)     // Catch: java.lang.Throwable -> L115
            cn.jiguang.ae.c.a(r8)     // Catch: java.lang.Throwable -> L115
            r9 = 2
            if (r8 == r9) goto L113
            r9 = 3
            if (r8 != r9) goto L10b
            goto L113
        L10b:
            r9 = 1
            if (r8 == 0) goto L110
            if (r8 != r9) goto L115
        L110:
            cn.jiguang.y.g.f1581i = r9     // Catch: java.lang.Throwable -> L115
            goto L115
        L113:
            cn.jiguang.y.g.f1581i = r4     // Catch: java.lang.Throwable -> L115
        L115:
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1) {
            cn.jiguang.v.a.a(r0, r1)
            return
    }

    public static void a(android.content.Context r2, java.lang.String r3, int r4, int r5, int r6) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "name"
            r0.putString(r1, r3)
            java.lang.String r3 = "custom"
            r0.putInt(r3, r4)
            java.lang.String r3 = "dynamic"
            r0.putInt(r3, r5)
            java.lang.String r3 = "sdk_v"
            r0.putInt(r3, r6)
            java.lang.String r3 = "set_sdktype_info"
            cn.jiguang.i.a.a(r2, r3, r0)
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1, android.os.Bundle r2) {
            cn.jiguang.a.a.a(r0, r1, r2)
            cn.jiguang.v.m.b(r0)
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, android.os.Bundle r3, java.lang.String r4) {
            if (r3 == 0) goto La
            java.lang.String r0 = "sdk_type"
            r3.putString(r0, r2)
            cn.jiguang.a.a.a(r1, r4, r3)
        La:
            return
    }

    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            if (r5 != 0) goto L7
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "runActionWithService action:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreHelper"
            cn.jiguang.w.f.d(r1, r0)
            java.lang.String r0 = "sdk_type"
            r5.putString(r0, r3)
            java.lang.String r3 = "internal_action"
            r5.putString(r3, r4)
            java.lang.String r3 = "a3"
            cn.jiguang.a.a.a(r2, r3, r5)
            return
    }

    public static void a(android.content.Context r2, boolean r3) {
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "is_auth"
            r0.putBoolean(r1, r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "set_auth"
            a(r2, r3, r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "sendSaveAuth error:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JCoreHelper"
            cn.jiguang.w.f.j(r3, r2)
            return
    }

    public static void a(android.os.Bundle r0) {
            return
    }

    static /* synthetic */ void a(cn.jiguang.c.b r0, android.content.Context r1, android.content.Intent r2) {
            r0.a(r1, r2)
            return
    }

    private static void a(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.String r4, java.lang.Throwable r5) {
            cn.jiguang.w.c.a(r0, r1, r2, r3, r4, r5)
            return
    }

    private void b(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "set_country"
            r0.putString(r1, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "sdk_type"
            java.lang.String r2 = "JCore"
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "JCoreHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "setCountry action:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L34
            r2.append(r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = " countrybundle="
            r2.append(r6)     // Catch: java.lang.Throwable -> L34
            r2.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = "tcp_set_country"
            cn.jiguang.a.a.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }

    private static void c(android.content.Context r2, java.lang.String r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "sdk_type"
            r0.putString(r1, r3)
            java.lang.String r3 = "tcp_a8"
            cn.jiguang.a.a.a(r2, r3, r0)
            return
    }

    private void c(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "bundle"
            org.json.JSONObject r5 = cn.jiguang.av.v.a(r5)     // Catch: java.lang.Throwable -> L21
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = "action"
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L21
            cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L21
            r0 = 2010(0x7da, float:2.817E-42)
            r1 = 0
            r4.a(r3, r0, r1, r5)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    private static void d(android.content.Context r2, java.lang.String r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "sdk_type"
            r0.putString(r1, r3)
            java.lang.String r3 = "tcp_a9"
            cn.jiguang.a.a.a(r2, r3, r0)
            return
    }

    private static void d(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) {
            java.lang.String r0 = "JCoreHelper"
            if (r5 == 0) goto L4b
            java.lang.String r1 = "sdk_banned"
            boolean r5 = r5.getBoolean(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "[handleSdkBannedStatusChanged] sdk banned: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            r1.append(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L2f
            c(r3, r4)     // Catch: java.lang.Throwable -> L2d
            cn.jiguang.ah.b r3 = cn.jiguang.ah.b.a()     // Catch: java.lang.Throwable -> L2d
            r4 = 8000(0x1f40, float:1.121E-41)
            r3.b(r4)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r3 = move-exception
            goto L33
        L2f:
            d(r3, r4)     // Catch: java.lang.Throwable -> L2d
            return
        L33:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "network change handler error, "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.i(r0, r3)
        L4b:
            return
    }

    private static void e(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) {
            java.lang.String r0 = "JCoreHelper"
            if (r7 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "[handleConnectionChanged] connected: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "connected"
            boolean r2 = r7.getBoolean(r2)     // Catch: java.lang.Throwable -> L1f
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L98
        L21:
            cn.jiguang.av.w.a()     // Catch: java.lang.Throwable -> L1f
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L69
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r5.getSystemService(r2)     // Catch: java.lang.Throwable -> L1f
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L69
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L69
            java.lang.String r3 = "networkInfo"
            r1.putExtra(r3, r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "networkInfo, available: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r2.isAvailable()     // Catch: java.lang.Throwable -> L1f
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = ", type: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.getType()     // Catch: java.lang.Throwable -> L1f
            r3.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L1f
        L69:
            cn.jiguang.internal.ActionManager r2 = cn.jiguang.internal.ActionManager.getInstance()     // Catch: java.lang.Throwable -> L1f
            r2.handleMessage(r5, r6, r1)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L1f
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "networkInfo isCallInit: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            r1.append(r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto L8d
            return
        L8d:
            java.lang.String r6 = "action_net_changed"
            cn.jiguang.i.a.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = "tcp_a15"
            cn.jiguang.a.a.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
            return
        L98:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "network change handler error, "
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.w.f.i(r0, r5)
            return
    }

    public void a(android.content.Context r3, boolean r4, int r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "changeForegroudStat:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", userActiveType:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreHelper"
            cn.jiguang.w.f.c(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.z.b.f1599b
            r0.set(r4)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "foreground"
            r0.putBoolean(r1, r4)
            java.lang.String r4 = "user_type"
            r0.putInt(r4, r5)
            java.lang.String r4 = "a4"
            cn.jiguang.a.a.a(r3, r4, r0)
            return
    }

    public void b(android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            cn.jiguang.a.a.b(r1, r2, r3)
            return
    }

    @Override // cn.jiguang.internal.JCoreHelperAction
    public android.os.Bundle directHandle(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            cn.jiguang.v.e r0 = cn.jiguang.v.e.a()
            android.os.Bundle r2 = r0.b(r2, r3, r4, r5)
            return r2
    }

    @Override // cn.jiguang.internal.JCoreHelperAction
    public java.lang.Object onCommonMethod(android.content.Context r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = cn.jiguang.i.a.a(r1, r2, r3)
            return r1
    }

    @Override // cn.jiguang.internal.JCoreHelperAction
    public java.lang.Object onEvent(android.content.Context r28, java.lang.String r29, int r30, java.lang.String r31, android.os.Bundle r32, java.lang.Object... r33) {
            r27 = this;
            r1 = r27
            r4 = r30
            r6 = r32
            java.lang.String r0 = "country"
            java.lang.String r8 = "save_exception_data"
            java.lang.String r9 = "isFromJCore"
            java.lang.String r10 = "JCoreHelper"
            r11 = 0
            r2 = r28
            cn.jiguang.al.a.a(r2, r6)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.v.f$a r3 = cn.jiguang.v.f.a.a()     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.a(r6)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L1f
            return r11
        L1f:
            android.content.Context r12 = cn.jiguang.av.c.a(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r2 = r1.a(r4)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La23
            boolean r3 = r2.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L31
            goto La23
        L31:
            cn.jiguang.as.b r2 = cn.jiguang.as.b.a()     // Catch: java.lang.Throwable -> L73
            r3 = r29
            r5 = r31
            r7 = r33
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
            r2 = r3
            java.lang.String r3 = "jpush"
            java.lang.String r13 = "notification_state"
            java.lang.String r14 = "scence"
            java.lang.String r15 = "user had close dynamic load"
            r20 = r11
            java.lang.String r11 = "NORMAL_TASK"
            r16 = r3
            java.lang.String r3 = "SCHEDULE_TASK"
            r17 = r13
            java.lang.String r13 = "a7"
            java.lang.String r18 = ""
            r19 = r14
            java.lang.String r14 = "MAJOR_TASK"
            java.lang.String r4 = "FUTURE_TASK"
            r21 = r15
            java.lang.String r15 = "enable"
            r22 = r14
            r23 = 3
            java.lang.String r14 = "JCore"
            r24 = r11
            r11 = 0
            switch(r30) {
                case 0: goto La1c;
                case 1: goto La17;
                case 2: goto La12;
                case 3: goto La0c;
                case 4: goto La07;
                case 5: goto La02;
                case 6: goto L9fd;
                case 7: goto L9f8;
                case 8: goto L9f3;
                case 9: goto L9ee;
                case 10: goto L9e9;
                case 11: goto L9b0;
                case 12: goto L987;
                case 13: goto L6c;
                case 14: goto L974;
                case 15: goto L95d;
                case 16: goto L959;
                case 17: goto L951;
                case 18: goto L91b;
                case 19: goto L8f8;
                case 20: goto L8ef;
                case 21: goto L8e6;
                case 22: goto L8d4;
                case 23: goto L8c5;
                case 24: goto L8a0;
                case 25: goto L899;
                case 26: goto L85e;
                case 27: goto L87b;
                case 28: goto L83a;
                case 29: goto L80f;
                case 30: goto L7f9;
                case 31: goto L7e0;
                case 32: goto L6c;
                case 33: goto L6c;
                case 34: goto L7db;
                case 35: goto L772;
                case 36: goto L760;
                case 37: goto L74a;
                case 38: goto L743;
                case 39: goto L738;
                case 40: goto L6ef;
                case 41: goto L6d0;
                case 42: goto L6be;
                case 43: goto L6b9;
                case 44: goto L6c;
                case 45: goto L6c;
                case 46: goto L6b0;
                case 47: goto L6c;
                case 48: goto L6ab;
                case 49: goto L6a8;
                case 50: goto L6a4;
                case 51: goto L67f;
                case 52: goto L67a;
                case 53: goto L66d;
                case 54: goto L636;
                case 55: goto L631;
                case 56: goto L570;
                case 57: goto L6c;
                case 58: goto L567;
                case 59: goto L560;
                case 60: goto L535;
                case 61: goto L4ea;
                case 62: goto L4d8;
                case 63: goto L4be;
                case 64: goto L47f;
                case 65: goto L45f;
                case 66: goto L3b0;
                case 67: goto L3a5;
                case 68: goto L3a5;
                case 69: goto L385;
                case 70: goto L37c;
                case 71: goto L373;
                case 72: goto L33a;
                case 73: goto L310;
                case 74: goto L330;
                case 75: goto L2fc;
                case 76: goto L2ee;
                case 77: goto L2da;
                case 78: goto L2c8;
                case 79: goto L2a9;
                case 80: goto L2a4;
                case 81: goto L29f;
                case 82: goto L29c;
                case 83: goto L27a;
                case 84: goto L279;
                case 85: goto L279;
                case 86: goto L274;
                case 87: goto L6c;
                case 88: goto L25a;
                case 89: goto L256;
                case 90: goto L256;
                case 91: goto L3a5;
                case 92: goto L253;
                case 93: goto L232;
                case 94: goto L3a5;
                case 95: goto L225;
                case 96: goto L1f4;
                case 97: goto L1e8;
                case 98: goto L1df;
                case 99: goto L1da;
                case 100: goto L6c;
                case 101: goto L1d5;
                case 102: goto L1ce;
                case 103: goto L1c6;
                case 104: goto L6c;
                case 105: goto L1bf;
                case 106: goto L1b4;
                case 107: goto L1aa;
                case 108: goto L1a3;
                case 109: goto L18d;
                case 110: goto L16e;
                case 111: goto L140;
                case 112: goto L133;
                case 113: goto L6c;
                case 114: goto L6c;
                case 115: goto L177;
                case 116: goto L11a;
                case 117: goto L116;
                case 118: goto L10f;
                case 119: goto Lf9;
                case 120: goto Le3;
                case 121: goto Lda;
                case 122: goto Ld1;
                case 123: goto Lc4;
                case 124: goto Lb8;
                case 125: goto Laf;
                case 126: goto Lac;
                case 127: goto La0;
                case 128: goto L9b;
                case 129: goto L98;
                case 130: goto L83;
                case 131: goto L7e;
                case 132: goto L7b;
                case 133: goto L76;
                case 134: goto L6e;
                default: goto L6c;
            }
        L6c:
            goto La20
        L6e:
            cn.jiguang.c.c.a(r12, r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
            goto La20
        L73:
            r0 = move-exception
            goto La24
        L76:
            java.lang.Object r0 = cn.jiguang.f.b.a(r32, r33)     // Catch: java.lang.Throwable -> L73
            return r0
        L7b:
            java.lang.String r0 = "tcp_a28"
            goto L93
        L7e:
            java.lang.String r0 = cn.jiguang.w.a.a(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L83:
            if (r6 == 0) goto La20
            boolean r0 = r6.getBoolean(r15, r11)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "upload"
            r6.getBoolean(r2, r11)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.c.a(r12, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "a13"
        L93:
            a(r12, r0, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L98:
            java.lang.String r0 = "tcp_a26"
            goto L93
        L9b:
            r1.b(r12, r5)     // Catch: java.lang.Throwable -> L73
            goto La20
        La0:
            cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> L73
            boolean r0 = cn.jiguang.v.c.c()     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        Lac:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L73
            return r0
        Laf:
            boolean r0 = cn.jiguang.av.b.b(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        Lb8:
            cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> L73
            boolean r0 = cn.jiguang.v.c.b()     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        Lc4:
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.a(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        Ld1:
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L73
            r0.a(r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        Lda:
            boolean r0 = cn.jiguang.av.b.e(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        Le3:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.av.b.b(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        Lf9:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.av.b.g(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L10f:
            cn.jiguang.c.b$3 r0 = new cn.jiguang.c.b$3     // Catch: java.lang.Throwable -> L73
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L73
            goto L30b
        L116:
            java.lang.String r0 = "a10"
            goto L93
        L11a:
            java.lang.String r0 = "configID"
            int r0 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L73
            boolean r2 = r6.containsKey(r9)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L12a
            boolean r11 = r6.getBoolean(r9)     // Catch: java.lang.Throwable -> L73
        L12a:
            boolean r0 = cn.jiguang.f.b.c(r0, r11)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L133:
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "start to get"
            r3 = 35
            r0.a(r12, r3, r11, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L140:
            cn.jiguang.z.c r0 = cn.jiguang.z.c.a()     // Catch: java.lang.Throwable -> L15a
            android.os.Bundle r0 = r0.a(r12, r2, r6)     // Catch: java.lang.Throwable -> L15a
            if (r0 == 0) goto La20
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15a
            if (r2 != 0) goto La20
            java.lang.String r2 = "start send CMD_EVENT_SET_DATA_CONTROL"
            cn.jiguang.w.f.c(r10, r2)     // Catch: java.lang.Throwable -> L15a
            a(r12, r13, r0)     // Catch: java.lang.Throwable -> L15a
            goto La20
        L15a:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "CMD_EVENT_SET_COLLECT_CONFIG throwable:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L73
            r2.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L73
            goto L473
        L16e:
            boolean r0 = cn.jiguang.av.b.b(r12)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L177
            cn.jiguang.a.a.c(r12)     // Catch: java.lang.Throwable -> L73
        L177:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.av.b.c(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L18d:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.av.b.a(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L1a3:
            if (r6 == 0) goto La20
            a(r12, r13, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L1aa:
            cn.jiguang.ai.c r0 = new cn.jiguang.ai.c     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.c(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L1b4:
            if (r6 != 0) goto L1b7
            return r20
        L1b7:
            r6.putString(r8, r5)     // Catch: java.lang.Throwable -> La20
            a(r12, r14, r8, r6)     // Catch: java.lang.Throwable -> La20
            goto La20
        L1bf:
            java.lang.String r0 = "open_log"
            a(r12, r14, r0, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L1c6:
            if (r7 == 0) goto L1cd
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto L1cd
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
        L1cd:
            return r18
        L1ce:
            int r0 = cn.jiguang.av.g.a     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L1d5:
            org.json.JSONObject r0 = cn.jiguang.av.d.a(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L1da:
            android.content.pm.PackageInfo r0 = a(r12, r7)     // Catch: java.lang.Throwable -> L73
            return r0
        L1df:
            boolean r0 = cn.jiguang.av.b.a()     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L1e8:
            java.util.List r0 = cn.jiguang.f.b.A()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L1f3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
        L1f3:
            return r0
        L1f4:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "saveAuth："
            r2.append(r3)     // Catch: java.lang.Throwable -> L73
            r2.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.w.f.d(r10, r2)     // Catch: java.lang.Throwable -> L73
            r2 = 1
            cn.jiguang.av.b.a(r0, r2)     // Catch: java.lang.Throwable -> L73
            a(r12, r0)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.f.b.c(r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L225:
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.m(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L232:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 2
            if (r0 < r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Thread     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            r26 = 1
            r2 = r7[r26]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof java.lang.Throwable     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            java.lang.Thread r0 = (java.lang.Thread) r0     // Catch: java.lang.Throwable -> L73
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L73
            cn.jiguang.aj.h r3 = cn.jiguang.aj.h.a()     // Catch: java.lang.Throwable -> L73
            r3.a(r0, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L253:
            java.lang.String r0 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> L73
            return r0
        L256:
            r1.c(r12, r5, r6)     // Catch: java.lang.Throwable -> L73
            return r20
        L25a:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            int r0 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L73
            r2 = 284(0x11c, float:3.98E-43)
            if (r0 <= r2) goto La20
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            r3 = 20002(0x4e22, float:2.8029E-41)
            r0.a(r12, r3, r11, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L274:
            java.lang.Object r0 = cn.jiguang.v.b.a(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L279:
            return r18
        L27a:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            r2 = r7[r2]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            java.lang.String r3 = "DELAY_TASK"
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L73
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L73
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L73
            cn.jiguang.au.d.a(r3, r0, r4)     // Catch: java.lang.Throwable -> L73
            goto La20
        L29c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L73
            return r0
        L29f:
            d(r12, r2, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L2a4:
            e(r12, r2, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L2a9:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            r2 = r7[r2]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            boolean r0 = cn.jiguang.av.i.b(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L2c8:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.au.d.a(r3, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L2da:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            r2 = r24
        L2e9:
            cn.jiguang.au.d.a(r2, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L2ee:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            goto L30b
        L2fc:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            r4 = r22
        L30b:
            cn.jiguang.au.d.a(r4, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L310:
            if (r7 == 0) goto L330
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto L330
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L330
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L73
            r0.putBoolean(r15, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "set_wake_enable"
            a(r12, r14, r2, r0)     // Catch: java.lang.Throwable -> L73
        L330:
            if (r6 == 0) goto La20
            java.lang.String r0 = "waked"
            cn.jiguang.i.a.a(r12, r0, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L33a:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 4
            if (r0 != r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            r26 = 1
            r2 = r7[r26]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            r25 = 2
            r3 = r7[r25]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L73
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L73
            r3 = r7[r25]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L73
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L73
            r4 = r7[r23]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L73
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L73
            a(r12, r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L73
            goto La20
        L373:
            cn.jiguang.b.a r0 = cn.jiguang.b.a.a()     // Catch: java.lang.Throwable -> L73
            r0.b(r12)     // Catch: java.lang.Throwable -> L73
            goto La20
        L37c:
            cn.jiguang.b.a r0 = cn.jiguang.b.a.a()     // Catch: java.lang.Throwable -> L73
            r0.a(r12)     // Catch: java.lang.Throwable -> L73
            goto La20
        L385:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 != r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            boolean r0 = cn.jiguang.av.b.c(r12)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L39e
            r0 = r21
            cn.jiguang.w.f.i(r10, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L39e:
            cn.jiguang.c.b$2 r0 = new cn.jiguang.c.b$2     // Catch: java.lang.Throwable -> L73
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L73
            goto L30b
        L3a5:
            cn.jiguang.v.g r0 = cn.jiguang.v.g.a()     // Catch: java.lang.Throwable -> L73
            r4 = r30
            java.lang.Object r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L73
            return r0
        L3b0:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            int r0 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L73
            r3 = 250(0xfa, float:3.5E-43)
            if (r0 >= r3) goto L3e0
            r4 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L3e0
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L73
            boolean r0 = r4.booleanValue()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "old change fore:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            r3.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.w.f.c(r10, r3)     // Catch: java.lang.Throwable -> L73
            r3 = -1
            r1.a(r12, r0, r3)     // Catch: java.lang.Throwable -> L73
            goto L409
        L3e0:
            if (r0 < r3) goto L457
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L457
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "new change fore:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            r3.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.w.f.c(r10, r3)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L405
            r11 = 1
        L405:
            r1.a(r12, r11, r0)     // Catch: java.lang.Throwable -> L73
            r0 = r11
        L409:
            java.util.concurrent.atomic.AtomicBoolean r3 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "changeForegroudStat isCallInit="
            r4.append(r5)     // Catch: java.lang.Throwable -> L73
            r4.append(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "foreground="
            r4.append(r5)     // Catch: java.lang.Throwable -> L73
            r4.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.w.f.c(r10, r4)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            if (r0 == 0) goto L443
            r2 = 0
            r0 = 1
            cn.jiguang.a.a.a(r12, r0, r2)     // Catch: java.lang.Throwable -> L73
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            r3 = r19
            r2.putInt(r3, r0)     // Catch: java.lang.Throwable -> L73
            r0 = r17
            goto L835
        L443:
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            r3 = r20
            cn.jiguang.y.g.a(r12, r3)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.y.g.a(r12, r2, r3)     // Catch: java.lang.Throwable -> L73
            goto La20
        L457:
            java.lang.String r0 = "unkown change fore"
            cn.jiguang.w.f.c(r10, r0)     // Catch: java.lang.Throwable -> L73
            r20 = 0
            return r20
        L45f:
            r0 = r21
            if (r7 == 0) goto La20
            int r2 = r7.length     // Catch: java.lang.Throwable -> L73
            r3 = 1
            if (r2 != r3) goto La20
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            boolean r2 = cn.jiguang.av.b.c(r12)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L478
        L473:
            cn.jiguang.w.f.i(r10, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L478:
            cn.jiguang.c.b$1 r0 = new cn.jiguang.c.b$1     // Catch: java.lang.Throwable -> L73
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L73
            goto L30b
        L47f:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 != r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            boolean r0 = cn.jiguang.av.b.c(r12)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L49a
            java.lang.String r0 = "user had close dynamic"
            cn.jiguang.w.f.c(r10, r0)     // Catch: java.lang.Throwable -> L73
            r20 = 0
            return r20
        L49a:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            cn.jiguang.c.b$a r2 = new cn.jiguang.c.b$a     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            r3 = r7[r11]     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            r2.<init>(r12, r3)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            java.lang.String r2 = "GET_ON_EVENT_TASK"
            cn.jiguang.au.d.a(r2, r0)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            r3 = 2
            java.lang.Object r0 = r0.get(r3, r2)     // Catch: java.lang.Throwable -> L73 java.util.concurrent.TimeoutException -> L4b6
            return r0
        L4b6:
            java.lang.String r0 = "get plugin path timeout"
            cn.jiguang.w.f.c(r10, r0)     // Catch: java.lang.Throwable -> L73
            r20 = 0
            return r20
        L4be:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L73
            r0 = r7[r2]     // Catch: java.lang.Throwable -> L73
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L73
            cn.jiguang.v.e r2 = cn.jiguang.v.e.a()     // Catch: java.lang.Throwable -> L73
            r3 = r12
            android.os.Bundle r0 = r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
            return r0
        L4d8:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.v.e r2 = cn.jiguang.v.e.a()     // Catch: java.lang.Throwable -> L73
            r2.a(r12, r0, r5, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L4ea:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 7
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            int r13 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            r26 = 1
            r0 = r7[r26]     // Catch: java.lang.Throwable -> L73
            r14 = r0
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Throwable -> L73
            r25 = 2
            r0 = r7[r25]     // Catch: java.lang.Throwable -> L73
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L73
            r0 = r7[r23]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            r0.getClass()     // Catch: java.lang.Throwable -> L73
            r0 = 4
            r0 = r7[r0]     // Catch: java.lang.Throwable -> L73
            r16 = r0
            java.io.File r16 = (java.io.File) r16     // Catch: java.lang.Throwable -> L73
            r0 = 5
            r0 = r7[r0]     // Catch: java.lang.Throwable -> L73
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L73
            r3 = 6
            r3 = r7[r3]     // Catch: java.lang.Throwable -> L73
            r18 = r3
            cn.jiguang.api.ReportCallBack r18 = (cn.jiguang.api.ReportCallBack) r18     // Catch: java.lang.Throwable -> L73
            r2 = r7[r2]     // Catch: java.lang.Throwable -> L73
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r14.toString()     // Catch: java.lang.Throwable -> L73
            r3 = 1
            cn.jiguang.y.g$a r15 = cn.jiguang.y.g.a.a(r12, r2, r0, r3)     // Catch: java.lang.Throwable -> L73
            r17 = r0
            cn.jiguang.y.g.a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L73
            goto La20
        L535:
            java.lang.String r0 = "unknown msg"
            if (r7 == 0) goto L548
            int r2 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r2 <= 0) goto L548
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L548
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L73
            boolean r11 = r2.booleanValue()     // Catch: java.lang.Throwable -> L73
        L548:
            if (r7 == 0) goto L557
            int r2 = r7.length     // Catch: java.lang.Throwable -> L73
            r3 = 1
            if (r2 <= r3) goto L557
            r2 = r7[r3]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L557
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
        L557:
            boolean r0 = cn.jiguang.internal.JConstants.isAndroidQ(r12, r11, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L560:
            java.lang.String r0 = "tcp_a20"
        L562:
            a(r12, r2, r6, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L567:
            boolean r0 = cn.jiguang.d.a.l(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L570:
            java.lang.String r0 = "resume"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L585
            boolean r0 = cn.jiguang.internal.JConstants.isInstrumentationHookFailed     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r0.onResume(r12)     // Catch: java.lang.Throwable -> L73
            goto La20
        L585:
            java.lang.String r0 = "pause"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L59a
            boolean r0 = cn.jiguang.internal.JConstants.isInstrumentationHookFailed     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r0.onPause(r12)     // Catch: java.lang.Throwable -> L73
            goto La20
        L59a:
            java.lang.String r0 = "kill"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5ab
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r0.onKillProcess(r12)     // Catch: java.lang.Throwable -> L73
            goto La20
        L5ab:
            boolean r0 = r15.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5cd
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L73
            r0.setStatEnable(r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L5cd:
            java.lang.String r0 = "s_timeout"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L5f1
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L73
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L73
            r0.setInterval(r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L5f1:
            java.lang.String r0 = "f_resume"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L611
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            r0.onFragmentResume(r12, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L611:
            java.lang.String r0 = "f_pause"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.getInstance()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            r0.onFragmentPause(r12, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L631:
            a(r12, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L636:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 2
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            r26 = 1
            r3 = r7[r26]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L73
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r2]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L73
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L73
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "name"
            r4.putString(r5, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "custom"
            r4.putInt(r0, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "dynamic"
            r4.putInt(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "set_sdktype_info"
            cn.jiguang.i.a.a(r12, r0, r4)     // Catch: java.lang.Throwable -> L73
            goto La20
        L66d:
            cn.jiguang.v.c r0 = cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.a(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L67a:
            a(r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L67f:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 != r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.e.a r0 = cn.jiguang.e.a.R()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L73
            r2.intValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L73
            r2 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]     // Catch: java.lang.Throwable -> L73
            r2[r11] = r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.b.a(r12, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L6a4:
            java.lang.String r0 = "tcp_a4"
            goto L562
        L6a8:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L73
            return r0
        L6ab:
            cn.jiguang.y.e.a(r12)     // Catch: java.lang.Throwable -> L73
            goto La20
        L6b0:
            int r0 = cn.jiguang.d.a.k(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L6b9:
            java.lang.Object r0 = cn.jiguang.d.a.b()     // Catch: java.lang.Throwable -> L73
            return r0
        L6be:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r0 = cn.jiguang.av.i.a(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L6d0:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            r2 = r7[r2]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L73
            boolean r0 = cn.jiguang.av.i.a(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L6ef:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r3 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            r25 = 2
            r2 = r7[r25]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            r2 = r7[r23]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L73
            boolean r13 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
            r26 = 1
            r0 = r7[r26]     // Catch: java.lang.Throwable -> L73
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L73
            long r14 = r0.longValue()     // Catch: java.lang.Throwable -> L73
            r25 = 2
            r0 = r7[r25]     // Catch: java.lang.Throwable -> L73
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L73
            long r16 = r0.longValue()     // Catch: java.lang.Throwable -> L73
            r0 = r7[r23]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            int r18 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            r19 = 1
            cn.jiguang.a.a.a(r12, r13, r14, r16, r18, r19)     // Catch: java.lang.Throwable -> L73
            goto La20
        L738:
            if (r7 == 0) goto L73d
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            goto L73e
        L73d:
            r0 = 0
        L73e:
            cn.jiguang.y.g.a(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L743:
            java.lang.String r0 = "cn.jiguang.sdk.user.profile"
            cn.jiguang.e.b.a(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L74a:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L73
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.d.b.b(r12, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L760:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.av.g.a(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L772:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 2
            if (r0 <= r2) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            r26 = 1
            r0 = r7[r26]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            r0 = r7[r2]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            cn.jiguang.e.a r0 = cn.jiguang.e.a.M()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L73
            r2.longValue()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r2 = cn.jiguang.e.a.P()     // Catch: java.lang.Throwable -> L73
            r26 = 1
            r3 = r7[r26]     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r3 = cn.jiguang.e.a.N()     // Catch: java.lang.Throwable -> L73
            r25 = 2
            r4 = r7[r25]     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r4 = cn.jiguang.e.a.O()     // Catch: java.lang.Throwable -> L73
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L73
            r5 = 4
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r5]     // Catch: java.lang.Throwable -> L73
            r5[r11] = r0     // Catch: java.lang.Throwable -> L73
            r26 = 1
            r5[r26] = r2     // Catch: java.lang.Throwable -> L73
            r25 = 2
            r5[r25] = r3     // Catch: java.lang.Throwable -> L73
            r5[r23] = r4     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.b.b(r12, r5)     // Catch: java.lang.Throwable -> L73
            goto La20
        L7db:
            java.lang.String r0 = cn.jiguang.d.a.j(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L7e0:
            r4 = r22
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof android.content.Intent     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            cn.jiguang.c.b$b r3 = new cn.jiguang.c.b$b     // Catch: java.lang.Throwable -> L73
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> L73
            r3.<init>(r1, r12, r0, r2)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.au.d.a(r4, r3)     // Catch: java.lang.Throwable -> L73
            goto La20
        L7f9:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L73
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L73
            android.os.Bundle r0 = a(r12, r0, r6)     // Catch: java.lang.Throwable -> L73
            return r0
        L80f:
            r0 = r17
            r3 = r19
            if (r7 == 0) goto La20
            int r2 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r2 <= 0) goto L81b
            r26 = 1
            goto L81d
        L81b:
            r26 = 0
        L81d:
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            r2 = r26 & r2
            if (r2 == 0) goto La20
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            r4 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L73
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L73
            r2.putInt(r3, r4)     // Catch: java.lang.Throwable -> L73
        L835:
            a(r12, r14, r0, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L83a:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "forenry"
            r3 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L73
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L73
            r0.putLong(r2, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "lbsforenry"
        L859:
            a(r12, r14, r2, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L85e:
            if (r7 == 0) goto L87b
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto L87b
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L87b
            r2 = r7[r2]     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L872
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L87b
        L872:
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r0 = cn.jiguang.d.a.a(r12, r0, r2)     // Catch: java.lang.Throwable -> L73
            return r0
        L87b:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L73
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L73
            r0.putBoolean(r15, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "lbsenable"
            goto L859
        L899:
            int r0 = cn.jiguang.a.a.f237d     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L8a0:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto La20
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La20
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "cmd"
            r3 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L73
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L73
            r0.putInt(r2, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "old_cmd"
            r3 = 0
            a(r12, r14, r0, r3)     // Catch: java.lang.Throwable -> L73
            goto La20
        L8c5:
            cn.jiguang.internal.JConstants.testCountry = r5     // Catch: java.lang.Throwable -> L73
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> La20
            r2.<init>()     // Catch: java.lang.Throwable -> La20
            r2.putString(r0, r5)     // Catch: java.lang.Throwable -> La20
            a(r12, r14, r0, r2)     // Catch: java.lang.Throwable -> La20
            goto La20
        L8d4:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aa()     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.a r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L73
            r2 = 1
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r2]     // Catch: java.lang.Throwable -> L73
            r2[r11] = r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.e.b.a(r12, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L8e6:
            boolean r0 = cn.jiguang.d.b.a(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L73
            return r0
        L8ef:
            long r2 = cn.jiguang.d.a.f(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L73
            return r0
        L8f8:
            if (r7 == 0) goto L912
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto L912
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L912
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L73
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L73
            long r2 = cn.jiguang.d.b.a(r12, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L73
            return r0
        L912:
            long r2 = cn.jiguang.d.b.b(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L73
            return r0
        L91b:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r3 = 2
            if (r0 <= r3) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r3 = 3
            if (r0 <= r3) goto L930
            r0 = r7[r3]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r0 instanceof java.lang.Throwable     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L930
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L73
        L92d:
            r26 = 1
            goto L932
        L930:
            r0 = 0
            goto L92d
        L932:
            r3 = r7[r26]     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L73
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L73
            r3 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L73
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L73
            r25 = 2
            r6 = r7[r25]     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L73
            r7 = r5
            r5 = r3
            r3 = r7
            r7 = r0
            a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
            goto La20
        L951:
            r0 = r2
            java.lang.String r2 = "tcp_a5"
        L954:
            a(r12, r0, r6, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L959:
            r0 = r2
            java.lang.String r2 = "tcp_a3"
            goto L954
        L95d:
            if (r7 == 0) goto La20
            int r0 = r7.length     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r0 <= r2) goto La20
            r0 = r7[r2]     // Catch: java.lang.Throwable -> L73
            boolean r2 = r0 instanceof cn.jiguang.api.ReportCallBack     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto La20
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L73
            cn.jiguang.api.ReportCallBack r0 = (cn.jiguang.api.ReportCallBack) r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.y.g.a(r12, r2, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L974:
            r0 = r2
            if (r7 == 0) goto L981
            int r2 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r2 <= 0) goto L981
            r2 = r7[r11]     // Catch: java.lang.Throwable -> L73
            cn.jiguang.y.g.a(r12, r0, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L981:
            r3 = 0
            cn.jiguang.y.g.a(r12, r0, r3)     // Catch: java.lang.Throwable -> L73
            goto La20
        L987:
            r0 = r2
            r4 = r22
            r2 = r24
            if (r7 == 0) goto La20
            int r3 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r3 <= 0) goto La20
            r3 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto La20
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L9aa
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L73
            r5 = r16
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L9aa
            r2 = r4
        L9aa:
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            goto L2e9
        L9b0:
            r0 = r2
            r2 = r5
            r5 = r16
            r4 = r22
            if (r7 == 0) goto La20
            int r6 = r7.length     // Catch: java.lang.Throwable -> L73
            if (r6 <= 0) goto La20
            r6 = r7[r11]     // Catch: java.lang.Throwable -> L73
            boolean r6 = r6 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto La20
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L73
            if (r6 != 0) goto L9d3
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L9d3
            r14 = r4
            goto L9e1
        L9d3:
            java.lang.String[] r0 = cn.jiguang.c.b.f737b     // Catch: java.lang.Throwable -> L73
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L9e0
            r2 = r3
        L9e0:
            r14 = r2
        L9e1:
            r0 = r7[r11]     // Catch: java.lang.Throwable -> L73
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L73
            cn.jiguang.au.d.a(r14, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        L9e9:
            r2 = r5
            a(r12, r2, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        L9ee:
            r2 = r5
            a(r12, r2)     // Catch: java.lang.Throwable -> L73
            goto La20
        L9f3:
            java.lang.String r0 = cn.jiguang.d.a.i(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L9f8:
            java.lang.String r0 = cn.jiguang.d.a.e(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        L9fd:
            java.lang.String r0 = cn.jiguang.d.a.h(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        La02:
            java.lang.String r0 = cn.jiguang.d.a.d(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        La07:
            java.lang.String r0 = cn.jiguang.d.a.b(r12)     // Catch: java.lang.Throwable -> L73
            return r0
        La0c:
            r0 = r2
            r2 = r5
            a(r12, r0, r2, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        La12:
            r2 = r5
            r1.b(r12, r2, r6)     // Catch: java.lang.Throwable -> L73
            goto La20
        La17:
            r0 = r2
            d(r12, r0)     // Catch: java.lang.Throwable -> L73
            goto La20
        La1c:
            r0 = r2
            c(r12, r0)     // Catch: java.lang.Throwable -> L73
        La20:
            r20 = 0
            goto La39
        La23:
            return r2
        La24:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onEvent:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.i(r10, r0)
            goto La20
        La39:
            return r20
    }
}

package com.autonavi.aps.amapapi.trans;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f5798b = 2;

    /* renamed from: e, reason: collision with root package name */
    private static com.autonavi.aps.amapapi.trans.a f5799e;

    /* renamed from: c, reason: collision with root package name */
    private long f5800c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5801d;

    /* renamed from: f, reason: collision with root package name */
    private java.util.ArrayList<java.lang.String> f5802f;

    /* renamed from: g, reason: collision with root package name */
    private com.autonavi.aps.amapapi.d f5803g;

    /* renamed from: h, reason: collision with root package name */
    private com.autonavi.aps.amapapi.d f5804h;

    /* renamed from: i, reason: collision with root package name */
    private long f5805i;

    /* renamed from: j, reason: collision with root package name */
    private android.content.Context f5806j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5807k;
    private boolean l;


    static {
            return
    }

    private a(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f5800c = r0
            r0 = 0
            r3.f5801d = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f5802f = r1
            com.autonavi.aps.amapapi.d r1 = new com.autonavi.aps.amapapi.d
            r1.<init>()
            r3.f5803g = r1
            com.autonavi.aps.amapapi.d r1 = new com.autonavi.aps.amapapi.d
            r1.<init>()
            r3.f5804h = r1
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r3.f5805i = r1
            r3.l = r0
            r3.f5806j = r4
            return
    }

    static /* synthetic */ long a(com.autonavi.aps.amapapi.trans.a r0, long r1) {
            r0.f5805i = r1
            return r1
    }

    static /* synthetic */ android.content.Context a(com.autonavi.aps.amapapi.trans.a r0) {
            android.content.Context r0 = r0.f5806j
            return r0
    }

    static /* synthetic */ com.autonavi.aps.amapapi.d a(com.autonavi.aps.amapapi.trans.a r0, int r1) {
            com.autonavi.aps.amapapi.d r0 = r0.b(r1)
            return r0
    }

    public static synchronized com.autonavi.aps.amapapi.trans.a a(android.content.Context r2) {
            java.lang.Class<com.autonavi.aps.amapapi.trans.a> r0 = com.autonavi.aps.amapapi.trans.a.class
            monitor-enter(r0)
            com.autonavi.aps.amapapi.trans.a r1 = com.autonavi.aps.amapapi.trans.a.f5799e     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.autonavi.aps.amapapi.trans.a r1 = new com.autonavi.aps.amapapi.trans.a     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.autonavi.aps.amapapi.trans.a.f5799e = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.autonavi.aps.amapapi.trans.a r2 = com.autonavi.aps.amapapi.trans.a.f5799e     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    static /* synthetic */ boolean a(java.lang.String[] r0, java.lang.String[] r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.String[] a(org.json.JSONArray r0, int r1) throws org.json.JSONException {
            java.lang.String[] r0 = b(r0, r1)
            return r0
    }

    private com.autonavi.aps.amapapi.d b(int r2) {
            r1 = this;
            int r0 = com.autonavi.aps.amapapi.trans.a.f5798b
            if (r2 != r0) goto L7
            com.autonavi.aps.amapapi.d r2 = r1.f5804h
            return r2
        L7:
            com.autonavi.aps.amapapi.d r2 = r1.f5803g
            return r2
    }

    static /* synthetic */ void b(com.autonavi.aps.amapapi.trans.a r0, int r1) {
            r0.f(r1)
            return
    }

    private synchronized void b(boolean r9, int r10) {
            r8 = this;
            monitor-enter(r8)
            if (r9 != 0) goto L12
            boolean r9 = com.autonavi.aps.amapapi.utils.a.p()     // Catch: java.lang.Throwable -> Lf
            if (r9 != 0) goto L12
            boolean r9 = r8.l     // Catch: java.lang.Throwable -> Lf
            if (r9 == 0) goto L12
            monitor-exit(r8)
            return
        Lf:
            r9 = move-exception
            goto L91
        L12:
            long r0 = r8.f5800c     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L34
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            long r2 = r8.f5800c     // Catch: java.lang.Throwable -> Lf
            long r4 = r0 - r2
            long r6 = r8.f5805i     // Catch: java.lang.Throwable -> Lf
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L2a
            monitor-exit(r8)
            return
        L2a:
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L34
            monitor-exit(r8)
            return
        L34:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            r8.f5800c = r0     // Catch: java.lang.Throwable -> Lf
            r9 = 1
            r8.l = r9     // Catch: java.lang.Throwable -> Lf
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lf
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lf
            r2 = 0
        L4c:
            if (r2 >= r1) goto L83
            r3 = r9[r2]     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r4.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r3.getClassName()     // Catch: java.lang.Throwable -> Lf
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = "("
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r3.getMethodName()     // Catch: java.lang.Throwable -> Lf
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf
            int r3 = r3.getLineNumber()     // Catch: java.lang.Throwable -> Lf
            r4.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "),"
            r4.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lf
            r0.append(r3)     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L4c
        L83:
            com.amap.api.col.3l.b8 r9 = com.amap.api.col.p0003l.b8.h()     // Catch: java.lang.Throwable -> Lf
            com.autonavi.aps.amapapi.trans.a$1 r0 = new com.autonavi.aps.amapapi.trans.a$1     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r8, r10)     // Catch: java.lang.Throwable -> Lf
            r9.b(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r8)
            return
        L91:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lf
            throw r9
    }

    private static boolean b(java.lang.String[] r5, java.lang.String[] r6) {
            r0 = 0
            if (r5 == 0) goto L26
            int r1 = r5.length
            if (r1 != 0) goto L7
            goto L26
        L7:
            if (r6 == 0) goto L26
            int r1 = r6.length
            if (r1 != 0) goto Ld
            goto L26
        Ld:
            int r1 = r5.length
            int r2 = r6.length
            if (r1 == r2) goto L12
            return r0
        L12:
            int r1 = r5.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L24
            r3 = r5[r2]
            r4 = r6[r2]
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L21
            return r0
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            r5 = 1
            return r5
        L26:
            return r0
    }

    private static java.lang.String[] b(org.json.JSONArray r6, int r7) throws org.json.JSONException {
            r0 = 0
            if (r6 == 0) goto L39
            int r1 = r6.length()
            if (r1 != 0) goto La
            goto L39
        La:
            int r1 = r6.length()
            java.lang.String[] r2 = new java.lang.String[r1]
        L10:
            if (r0 >= r1) goto L38
            java.lang.String r3 = r6.getString(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L35
            int r4 = com.autonavi.aps.amapapi.trans.a.f5798b
            if (r7 != r4) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "]"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L33:
            r2[r0] = r3
        L35:
            int r0 = r0 + 1
            goto L10
        L38:
            return r2
        L39:
            java.lang.String[] r6 = new java.lang.String[r0]
            return r6
    }

    private static java.lang.String c(int r1) {
            int r0 = com.autonavi.aps.amapapi.trans.a.f5798b
            if (r1 != r0) goto L7
            java.lang.String r1 = "last_ip_6"
            return r1
        L7:
            java.lang.String r1 = "last_ip_4"
            return r1
    }

    private void d(int r3) {
            r2 = this;
            com.autonavi.aps.amapapi.d r0 = r2.b(r3)
            boolean r0 = r0.d()
            if (r0 == 0) goto L24
            android.content.Context r0 = r2.f5806j
            java.lang.String r1 = "cbG9jaXA"
            android.content.SharedPreferences$Editor r0 = com.autonavi.aps.amapapi.utils.i.a(r0, r1)
            java.lang.String r1 = c(r3)
            com.autonavi.aps.amapapi.utils.i.a(r0, r1)
            com.autonavi.aps.amapapi.utils.i.a(r0)
            com.autonavi.aps.amapapi.d r3 = r2.b(r3)
            r0 = 0
            r3.a(r0)
        L24:
            return
    }

    private java.lang.String e(int r7) {
            r6 = this;
            r0 = 0
            r6.b(r0, r7)
            com.autonavi.aps.amapapi.d r1 = r6.b(r7)
            java.lang.String[] r1 = r1.a()
            if (r1 == 0) goto L33
            int r2 = r1.length
            if (r2 <= 0) goto L33
            int r2 = r1.length
        L12:
            r3 = 0
            if (r0 >= r2) goto L23
            r4 = r1[r0]
            java.util.ArrayList<java.lang.String> r5 = r6.f5802f
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L20
            goto L24
        L20:
            int r0 = r0 + 1
            goto L12
        L23:
            r4 = r3
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L2b
            return r3
        L2b:
            com.autonavi.aps.amapapi.d r7 = r6.b(r7)
            r7.a(r4)
            return r4
        L33:
            r6.g(r7)
            com.autonavi.aps.amapapi.d r7 = r6.b(r7)
            java.lang.String r7 = r7.b()
            return r7
    }

    private void f(int r4) {
            r3 = this;
            com.autonavi.aps.amapapi.d r0 = r3.b(r4)
            java.lang.String[] r0 = r0.a()
            if (r0 == 0) goto L45
            com.autonavi.aps.amapapi.d r0 = r3.b(r4)
            java.lang.String[] r0 = r0.a()
            int r0 = r0.length
            if (r0 > 0) goto L16
            goto L45
        L16:
            com.autonavi.aps.amapapi.d r0 = r3.b(r4)
            java.lang.String[] r0 = r0.a()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = r3.f5807k
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L45
            java.util.ArrayList<java.lang.String> r1 = r3.f5802f
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L45
            r3.f5807k = r0
            android.content.Context r1 = r3.f5806j
            java.lang.String r2 = "cbG9jaXA"
            android.content.SharedPreferences$Editor r1 = com.autonavi.aps.amapapi.utils.i.a(r1, r2)
            java.lang.String r4 = c(r4)
            com.autonavi.aps.amapapi.utils.i.a(r1, r4, r0)
            com.autonavi.aps.amapapi.utils.i.a(r1)
        L45:
            return
    }

    private void g(int r5) {
            r4 = this;
            android.content.Context r0 = r4.f5806j
            java.lang.String r1 = c(r5)
            r2 = 0
            java.lang.String r3 = "cbG9jaXA"
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.i.a(r0, r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L31
            java.util.ArrayList<java.lang.String> r1 = r4.f5802f
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L31
            com.autonavi.aps.amapapi.d r1 = r4.b(r5)
            r1.a(r0)
            com.autonavi.aps.amapapi.d r1 = r4.b(r5)
            r1.b(r0)
            com.autonavi.aps.amapapi.d r5 = r4.b(r5)
            r0 = 1
            r5.a(r0)
        L31:
            return
    }

    public final java.lang.String a(com.autonavi.aps.amapapi.trans.d r7, int r8) {
            r6 = this;
            r0 = 0
            boolean r1 = com.autonavi.aps.amapapi.utils.a.q()     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L8
            return r0
        L8:
            if (r7 == 0) goto L63
            java.lang.String r1 = r7.getURL()     // Catch: java.lang.Throwable -> L63
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L63
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.getHost()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "http://abroad.apilocate.amap.com/mobile/binary"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L63
            java.lang.String r3 = "abroad.apilocate.amap.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L28
            goto L63
        L28:
            java.lang.String r3 = "apilocate.amap.com"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L33
            java.lang.String r3 = "httpdns.apilocate.amap.com"
            goto L34
        L33:
            r3 = r2
        L34:
            boolean r4 = com.amap.api.col.p0003l.g4.U(r3)     // Catch: java.lang.Throwable -> L63
            if (r4 != 0) goto L3b
            return r0
        L3b:
            java.lang.String r4 = r6.e(r8)     // Catch: java.lang.Throwable -> L63
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L63
            java.lang.String r1 = r1.replace(r2, r4)     // Catch: java.lang.Throwable -> L63
            r7.c(r1)     // Catch: java.lang.Throwable -> L63
            java.util.Map r1 = r7.getRequestHead()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "host"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L63
            r7.d(r3)     // Catch: java.lang.Throwable -> L63
            int r1 = com.autonavi.aps.amapapi.trans.a.f5798b     // Catch: java.lang.Throwable -> L63
            if (r8 != r1) goto L5e
            r8 = 1
            goto L5f
        L5e:
            r8 = 0
        L5f:
            r7.setIPV6Request(r8)     // Catch: java.lang.Throwable -> L63
            return r4
        L63:
            return r0
    }

    public final void a(int r3) {
            r2 = this;
            com.autonavi.aps.amapapi.d r0 = r2.b(r3)
            boolean r0 = r0.e()
            if (r0 != 0) goto L1f
            java.util.ArrayList<java.lang.String> r0 = r2.f5802f
            com.autonavi.aps.amapapi.d r1 = r2.b(r3)
            java.lang.String r1 = r1.b()
            r0.add(r1)
            r2.d(r3)
            r0 = 1
            r2.b(r0, r3)
            return
        L1f:
            r2.d(r3)
            return
    }

    public final void a(boolean r3, int r4) {
            r2 = this;
            com.autonavi.aps.amapapi.d r0 = r2.b(r4)
            r0.b(r3)
            if (r3 == 0) goto L37
            com.autonavi.aps.amapapi.d r3 = r2.b(r4)
            java.lang.String r3 = r3.c()
            com.autonavi.aps.amapapi.d r0 = r2.b(r4)
            java.lang.String r0 = r0.b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L37
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
            android.content.Context r3 = r2.f5806j
            java.lang.String r1 = "cbG9jaXA"
            android.content.SharedPreferences$Editor r3 = com.autonavi.aps.amapapi.utils.i.a(r3, r1)
            java.lang.String r4 = c(r4)
            com.autonavi.aps.amapapi.utils.i.a(r3, r4, r0)
            com.autonavi.aps.amapapi.utils.i.a(r3)
        L37:
            return
    }
}

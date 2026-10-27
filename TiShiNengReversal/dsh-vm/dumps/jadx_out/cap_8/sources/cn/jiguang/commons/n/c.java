package cn.jiguang.commons.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1167c;

    /* renamed from: d, reason: collision with root package name */
    private static cn.jiguang.commons.n.c f1168d;

    /* renamed from: e, reason: collision with root package name */
    private static cn.jiguang.commons.n.a f1169e;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.Object f1170f;

    /* renamed from: g, reason: collision with root package name */
    private static android.os.HandlerThread f1171g;

    /* renamed from: h, reason: collision with root package name */
    private static android.os.Handler f1172h;

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f1173i;

    /* renamed from: j, reason: collision with root package name */
    private static java.lang.String f1174j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.String f1175k;
    private static java.lang.String l;

    class a extends android.os.Handler {
        a(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 11
                if (r0 != r1) goto L6f
                cn.jiguang.commons.n.a r0 = cn.jiguang.commons.n.c.a()     // Catch: java.lang.Throwable -> L2c
                android.os.Bundle r4 = r4.getData()     // Catch: java.lang.Throwable -> L2c
                java.lang.String r1 = "type"
                java.lang.String r4 = r4.getString(r1)     // Catch: java.lang.Throwable -> L2c
                java.lang.String r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L2c
                cn.jiguang.commons.n.c.a(r4)     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r4 = cn.jiguang.commons.n.c.c()
                monitor-enter(r4)
                java.lang.Object r0 = cn.jiguang.commons.n.c.c()     // Catch: java.lang.Throwable -> L29
                r0.notify()     // Catch: java.lang.Throwable -> L29
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
                return
            L29:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
                throw r0
            L2c:
                r4 = move-exception
                java.lang.String r0 = ""
                cn.jiguang.commons.n.c.a(r0)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r0 = "MeizuIdManager"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
                r1.<init>()     // Catch: java.lang.Throwable -> L5d
                java.lang.String r2 = "getID exception, "
                r1.append(r2)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L5d
                r1.append(r4)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L5d
                cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r4 = cn.jiguang.commons.n.c.c()
                monitor-enter(r4)
                java.lang.Object r0 = cn.jiguang.commons.n.c.c()     // Catch: java.lang.Throwable -> L5a
                r0.notify()     // Catch: java.lang.Throwable -> L5a
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
                return
            L5a:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L5a
                throw r0
            L5d:
                r4 = move-exception
                java.lang.Object r0 = cn.jiguang.commons.n.c.c()
                monitor-enter(r0)
                java.lang.Object r1 = cn.jiguang.commons.n.c.c()     // Catch: java.lang.Throwable -> L6c
                r1.notify()     // Catch: java.lang.Throwable -> L6c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
                throw r4
            L6c:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
                throw r4
            L6f:
                java.lang.String r4 = "MeizuIdManager"
                java.lang.String r0 = "message type valid"
                cn.jiguang.commons.w.a.a(r4, r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.commons.n.c.f1170f = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ cn.jiguang.commons.n.a a() {
            cn.jiguang.commons.n.a r0 = cn.jiguang.commons.n.c.f1169e
            return r0
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            cn.jiguang.commons.n.c.f1173i = r0
            return r0
    }

    public static void a(android.content.Context r10) {
            java.lang.String r1 = "close cursor error: "
            r0 = 0
            java.lang.String r2 = "MeizuIdManager"
            if (r10 != 0) goto L9
            goto La9
        L9:
            android.content.pm.PackageManager r3 = r10.getPackageManager()
            java.lang.String r4 = "rIjLIWp9yd1+l2BByOWYjPjGCBlvF2tDounrABnhodw="
            java.lang.String r4 = cn.jiguang.commons.L.ad.d(r4)
            if (r3 == 0) goto La9
            android.content.pm.ProviderInfo r3 = r3.resolveContentProvider(r4, r0)
            if (r3 == 0) goto La9
            java.lang.String r3 = "SyfFpc71r1BITMlIo0m1Vt2cR3sdiPGnMd0WMSsF4yU8+J95KN/jHVtZShu2ONYO"
            java.lang.String r3 = cn.jiguang.commons.L.ad.d(r3)
            android.net.Uri r5 = android.net.Uri.parse(r3)
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "supported"
            java.lang.String[] r8 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L72
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L53
            r10.moveToFirst()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "value"
            int r3 = r10.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L73
            if (r3 < 0) goto L51
            java.lang.String r3 = r10.getString(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "0"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L73
            cn.jiguang.commons.n.c.f1167c = r3     // Catch: java.lang.Throwable -> L73
            goto L53
        L51:
            cn.jiguang.commons.n.c.f1167c = r0     // Catch: java.lang.Throwable -> L73
        L53:
            if (r10 == 0) goto Lab
            r10.close()     // Catch: java.lang.Exception -> L59
            goto Lab
        L59:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L60:
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            cn.jiguang.commons.w.a.a(r2, r10)
            goto Lab
        L72:
            r10 = 0
        L73:
            java.lang.String r3 = "mz not support"
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Throwable -> L88
            cn.jiguang.commons.n.c.f1167c = r0     // Catch: java.lang.Throwable -> L88
            if (r10 == 0) goto Lab
            r10.close()     // Catch: java.lang.Exception -> L80
            goto Lab
        L80:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L60
        L88:
            r0 = move-exception
            r3 = r0
            if (r10 == 0) goto La8
            r10.close()     // Catch: java.lang.Exception -> L90
            goto La8
        L90:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            cn.jiguang.commons.w.a.a(r2, r10)
        La8:
            throw r3
        La9:
            cn.jiguang.commons.n.c.f1167c = r0
        Lab:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "check meizu supported:"
            r10.append(r0)
            boolean r0 = cn.jiguang.commons.n.c.f1167c
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            cn.jiguang.commons.w.a.a(r2, r10)
            return
    }

    public static cn.jiguang.commons.n.c c(android.content.Context r2) {
            cn.jiguang.commons.n.c r0 = cn.jiguang.commons.n.c.f1168d
            if (r0 != 0) goto L27
            java.lang.Class<cn.jiguang.commons.n.c> r0 = cn.jiguang.commons.n.c.class
            monitor-enter(r0)
            cn.jiguang.commons.n.c r1 = cn.jiguang.commons.n.c.f1168d     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            cn.jiguang.commons.n.c r1 = new cn.jiguang.commons.n.c     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.n.c.f1168d = r1     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.n.c.a = r2     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.n.a r1 = new cn.jiguang.commons.n.a     // Catch: java.lang.Throwable -> L21
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L21
            cn.jiguang.commons.n.c.f1169e = r1     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = cn.jiguang.commons.n.c.a     // Catch: java.lang.Throwable -> L21
            a(r2)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r2 = move-exception
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r2
        L27:
            cn.jiguang.commons.n.c r2 = cn.jiguang.commons.n.c.f1168d
            return r2
    }

    static /* synthetic */ java.lang.Object c() {
            java.lang.Object r0 = cn.jiguang.commons.n.c.f1170f
            return r0
    }

    private void c(int r5) {
            r4 = this;
            android.os.Handler r0 = cn.jiguang.commons.n.c.f1172h
            android.os.Message r0 = r0.obtainMessage()
            r1 = 11
            r0.what = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "type"
            if (r5 != 0) goto L1d
            java.lang.String r5 = "ggTIEepvzybHoO4C7/s5eQ=="
        L15:
            java.lang.String r5 = cn.jiguang.commons.L.ad.d(r5)
            r1.putString(r2, r5)
            goto L29
        L1d:
            r3 = 1
            if (r5 != r3) goto L23
            java.lang.String r5 = "QlAKJNz4iTmDadRoCSAs4A=="
            goto L15
        L23:
            r3 = 2
            if (r5 != r3) goto L29
            java.lang.String r5 = "bRmfYSLDPlLJ9XQro1+/dQ=="
            goto L15
        L29:
            r0.setData(r1)
            android.os.Handler r5 = cn.jiguang.commons.n.c.f1172h
            r5.sendMessage(r0)
            return
    }

    private static void d() {
            android.os.HandlerThread r0 = cn.jiguang.commons.n.c.f1171g
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            f()
            return
    }

    private static void f() {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "jg_c_meizu_db"
            r0.<init>(r1)
            cn.jiguang.commons.n.c.f1171g = r0
            r0.start()
            cn.jiguang.commons.n.c$a r0 = new cn.jiguang.commons.n.c$a
            android.os.HandlerThread r1 = cn.jiguang.commons.n.c.f1171g
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            cn.jiguang.commons.n.c.f1172h = r0
            return
    }

    private static void h() {
            android.os.HandlerThread r0 = cn.jiguang.commons.n.c.f1171g
            if (r0 == 0) goto L2b
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L2b
            android.os.HandlerThread r0 = cn.jiguang.commons.n.c.f1171g     // Catch: java.lang.Throwable -> L10
            r0.quitSafely()     // Catch: java.lang.Throwable -> L10
            goto L2b
        L10:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "quit thread err: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MeizuIdManager"
            cn.jiguang.commons.w.a.f(r1, r0)
        L2b:
            r0 = 0
            cn.jiguang.commons.n.c.f1171g = r0
            cn.jiguang.commons.n.c.f1172h = r0
            return
    }

    public void a(int r11) {
            r10 = this;
            java.lang.String r0 = "MeizuIdManager"
            d()
            java.lang.Object r1 = cn.jiguang.commons.n.c.f1170f     // Catch: java.lang.Throwable -> L9f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9f
            r10.c(r11)     // Catch: java.lang.Throwable -> L17
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = cn.jiguang.commons.n.c.f1170f     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L1a
            r6.wait(r4)     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L1a
            goto L35
        L17:
            r11 = move-exception
            goto L9d
        L1a:
            r6 = move-exception
            java.lang.String r7 = "MeizuIdManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r8.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r9 = "lock wait err: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L17
            r8.append(r6)     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.w.a.f(r7, r6)     // Catch: java.lang.Throwable -> L17
        L35:
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L17
            long r6 = r6 - r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L93
            r2 = 0
            if (r11 == 0) goto L80
            r3 = 1
            if (r11 == r3) goto L65
            r3 = 2
            if (r11 == r3) goto L48
            goto L98
        L48:
            java.lang.String r11 = cn.jiguang.commons.n.c.f1173i     // Catch: java.lang.Throwable -> L17
            if (r11 != 0) goto L4f
            java.lang.String r11 = "get ids-aa failed"
            goto L95
        L4f:
            cn.jiguang.commons.n.c.l = r11     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.n.c.f1173i = r2     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r11.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "query aaid: "
            r11.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = cn.jiguang.commons.n.c.l     // Catch: java.lang.Throwable -> L17
            goto L7c
        L60:
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L17
            goto L95
        L65:
            java.lang.String r11 = cn.jiguang.commons.n.c.f1173i     // Catch: java.lang.Throwable -> L17
            if (r11 != 0) goto L6c
            java.lang.String r11 = "get ids-va failed"
            goto L95
        L6c:
            cn.jiguang.commons.n.c.f1175k = r11     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.n.c.f1173i = r2     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r11.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "query aaid: "
            r11.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = cn.jiguang.commons.n.c.f1175k     // Catch: java.lang.Throwable -> L17
        L7c:
            r11.append(r2)     // Catch: java.lang.Throwable -> L17
            goto L60
        L80:
            java.lang.String r11 = cn.jiguang.commons.n.c.f1173i     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.n.c.f1174j = r11     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.n.c.f1173i = r2     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r11.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "query aaid: "
            r11.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = cn.jiguang.commons.n.c.f1174j     // Catch: java.lang.Throwable -> L17
            goto L7c
        L93:
            java.lang.String r11 = "query timeout"
        L95:
            cn.jiguang.commons.w.a.a(r0, r11)     // Catch: java.lang.Throwable -> L17
        L98:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            h()
            return
        L9d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r11     // Catch: java.lang.Throwable -> L9f
        L9f:
            r11 = move-exception
            h()
            throw r11
    }

    public java.lang.String e() {
            r1 = this;
            boolean r0 = r1.g()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = cn.jiguang.commons.n.c.f1174j
            if (r0 == 0) goto Ld
            return r0
        Ld:
            r0 = 0
            r1.a(r0)
            java.lang.String r0 = cn.jiguang.commons.n.c.f1174j
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = cn.jiguang.commons.n.c.f1167c
            return r0
    }
}

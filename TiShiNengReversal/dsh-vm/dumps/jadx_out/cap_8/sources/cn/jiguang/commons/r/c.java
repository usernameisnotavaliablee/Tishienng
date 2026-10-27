package cn.jiguang.commons.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1184c;

    /* renamed from: d, reason: collision with root package name */
    private static cn.jiguang.commons.r.c f1185d;

    /* renamed from: e, reason: collision with root package name */
    private static cn.jiguang.commons.r.a f1186e;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.Object f1187f;

    /* renamed from: g, reason: collision with root package name */
    private static android.os.HandlerThread f1188g;

    /* renamed from: h, reason: collision with root package name */
    private static android.os.Handler f1189h;

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f1190i;

    /* renamed from: j, reason: collision with root package name */
    private static java.lang.String f1191j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.String f1192k;
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
                if (r0 != r1) goto L7a
                cn.jiguang.commons.r.a r0 = cn.jiguang.commons.r.c.a()     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r1 = r4.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r2 = "type"
                int r1 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L36
                android.os.Bundle r4 = r4.getData()     // Catch: java.lang.Throwable -> L36
                java.lang.String r2 = "appid"
                java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Throwable -> L36
                java.lang.String r4 = r0.a(r1, r4)     // Catch: java.lang.Throwable -> L36
                cn.jiguang.commons.r.c.a(r4)     // Catch: java.lang.Throwable -> L36
                java.lang.Object r4 = cn.jiguang.commons.r.c.c()
                monitor-enter(r4)
                java.lang.Object r0 = cn.jiguang.commons.r.c.c()     // Catch: java.lang.Throwable -> L33
                r0.notify()     // Catch: java.lang.Throwable -> L33
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
                return
            L33:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
                throw r0
            L36:
                r4 = move-exception
                java.lang.String r0 = ""
                cn.jiguang.commons.r.c.a(r0)     // Catch: java.lang.Throwable -> L68
                java.lang.String r0 = "VivoIdManager"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
                r1.<init>()     // Catch: java.lang.Throwable -> L68
                java.lang.String r2 = "vv getIds, exception"
                r1.append(r2)     // Catch: java.lang.Throwable -> L68
                java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L68
                r1.append(r4)     // Catch: java.lang.Throwable -> L68
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L68
                cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L68
                java.lang.Object r4 = cn.jiguang.commons.r.c.c()
                monitor-enter(r4)
                java.lang.Object r0 = cn.jiguang.commons.r.c.c()     // Catch: java.lang.Throwable -> L65
                r0.notify()     // Catch: java.lang.Throwable -> L65
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L65
                return
            L65:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L65
                throw r0
            L68:
                r4 = move-exception
                java.lang.Object r0 = cn.jiguang.commons.r.c.c()
                monitor-enter(r0)
                java.lang.Object r1 = cn.jiguang.commons.r.c.c()     // Catch: java.lang.Throwable -> L77
                r1.notify()     // Catch: java.lang.Throwable -> L77
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                throw r4
            L77:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                throw r4
            L7a:
                java.lang.String r4 = "VivoIdManager"
                java.lang.String r0 = "message type valid"
                cn.jiguang.commons.w.a.a(r4, r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.commons.r.c.f1187f = r0
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ cn.jiguang.commons.r.a a() {
            cn.jiguang.commons.r.a r0 = cn.jiguang.commons.r.c.f1186e
            return r0
    }

    public static cn.jiguang.commons.r.c a(android.content.Context r2) {
            cn.jiguang.commons.r.c r0 = cn.jiguang.commons.r.c.f1185d
            if (r0 != 0) goto L25
            java.lang.Class<cn.jiguang.commons.r.c> r0 = cn.jiguang.commons.r.c.class
            monitor-enter(r0)
            cn.jiguang.commons.r.c r1 = cn.jiguang.commons.r.c.f1185d     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            cn.jiguang.commons.r.c r1 = new cn.jiguang.commons.r.c     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.commons.r.c.f1185d = r1     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.commons.r.c.a = r2     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.commons.r.a r1 = new cn.jiguang.commons.r.a     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.commons.r.c.f1186e = r1     // Catch: java.lang.Throwable -> L1f
            d()     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2
        L25:
            cn.jiguang.commons.r.c r2 = cn.jiguang.commons.r.c.f1185d
            return r2
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            cn.jiguang.commons.r.c.f1190i = r0
            return r0
    }

    static /* synthetic */ java.lang.Object c() {
            java.lang.Object r0 = cn.jiguang.commons.r.c.f1187f
            return r0
    }

    private void c(int r4, java.lang.String r5) {
            r3 = this;
            android.os.Handler r0 = cn.jiguang.commons.r.c.f1189h
            android.os.Message r0 = r0.obtainMessage()
            r1 = 11
            r0.what = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "type"
            r1.putInt(r2, r4)
            r2 = 1
            if (r4 == r2) goto L1a
            r2 = 2
            if (r4 != r2) goto L1f
        L1a:
            java.lang.String r4 = "appid"
            r1.putString(r4, r5)
        L1f:
            r0.setData(r1)
            android.os.Handler r4 = cn.jiguang.commons.r.c.f1189h
            r4.sendMessage(r0)
            return
    }

    public static void d() {
            java.lang.String r0 = "persist.sys.identifierid.supported"
            java.lang.String r1 = "0"
            java.lang.String r0 = cn.jiguang.commons.L.ad.a(r0, r1)
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            cn.jiguang.commons.r.c.f1184c = r0
            return
    }

    private static void e() {
            android.os.HandlerThread r0 = cn.jiguang.commons.r.c.f1188g
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            g()
            return
    }

    private static void g() {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "jg_c_vivo_db"
            r0.<init>(r1)
            cn.jiguang.commons.r.c.f1188g = r0
            r0.start()
            cn.jiguang.commons.r.c$a r0 = new cn.jiguang.commons.r.c$a
            android.os.HandlerThread r1 = cn.jiguang.commons.r.c.f1188g
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            cn.jiguang.commons.r.c.f1189h = r0
            return
    }

    private static void i() {
            android.os.HandlerThread r0 = cn.jiguang.commons.r.c.f1188g
            if (r0 == 0) goto L2b
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L2b
            android.os.HandlerThread r0 = cn.jiguang.commons.r.c.f1188g     // Catch: java.lang.Throwable -> L10
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
            java.lang.String r1 = "VivoIdManager"
            cn.jiguang.commons.w.a.f(r1, r0)
        L2b:
            r0 = 0
            cn.jiguang.commons.r.c.f1188g = r0
            cn.jiguang.commons.r.c.f1189h = r0
            return
    }

    public void a(int r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = "VivoIdManager"
            e()
            java.lang.Object r1 = cn.jiguang.commons.r.c.f1187f     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L6e
            r9.c(r10, r11)     // Catch: java.lang.Throwable -> L17
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r11 = cn.jiguang.commons.r.c.f1187f     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            r11.wait(r4)     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            goto L34
        L17:
            r10 = move-exception
            goto L6c
        L19:
            r11 = move-exception
            java.lang.String r6 = "VivoIdManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r7.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r8 = "lock wait error: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L17
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L17
            r7.append(r11)     // Catch: java.lang.Throwable -> L17
            java.lang.String r11 = r7.toString()     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.w.a.f(r6, r11)     // Catch: java.lang.Throwable -> L17
        L34:
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L17
            long r6 = r6 - r2
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 >= 0) goto L62
            if (r10 == 0) goto L5a
            r11 = 1
            if (r10 == r11) goto L50
            r11 = 2
            if (r10 == r11) goto L46
            goto L67
        L46:
            java.lang.String r10 = cn.jiguang.commons.r.c.f1190i     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L4d
            java.lang.String r10 = "get aaid failed"
            goto L64
        L4d:
            cn.jiguang.commons.r.c.l = r10     // Catch: java.lang.Throwable -> L17
            goto L5e
        L50:
            java.lang.String r10 = cn.jiguang.commons.r.c.f1190i     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L57
            java.lang.String r10 = "get vaid failed"
            goto L64
        L57:
            cn.jiguang.commons.r.c.f1192k = r10     // Catch: java.lang.Throwable -> L17
            goto L5e
        L5a:
            java.lang.String r10 = cn.jiguang.commons.r.c.f1190i     // Catch: java.lang.Throwable -> L17
            cn.jiguang.commons.r.c.f1191j = r10     // Catch: java.lang.Throwable -> L17
        L5e:
            r10 = 0
            cn.jiguang.commons.r.c.f1190i = r10     // Catch: java.lang.Throwable -> L17
            goto L67
        L62:
            java.lang.String r10 = "query timeout"
        L64:
            cn.jiguang.commons.w.a.a(r0, r10)     // Catch: java.lang.Throwable -> L17
        L67:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            i()
            return
        L6c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r10     // Catch: java.lang.Throwable -> L6e
        L6e:
            r10 = move-exception
            i()
            throw r10
    }

    public java.lang.String f() {
            r2 = this;
            boolean r0 = r2.h()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = cn.jiguang.commons.r.c.f1191j
            if (r0 == 0) goto Ld
            return r0
        Ld:
            r0 = 0
            r2.a(r0, r1)
            java.lang.String r0 = cn.jiguang.commons.r.c.f1191j
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = cn.jiguang.commons.r.c.f1184c
            return r0
    }
}

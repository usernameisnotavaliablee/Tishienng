package cn.jiguang.commons.d;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private final java.util.concurrent.ConcurrentHashMap a;

    /* renamed from: c, reason: collision with root package name */
    private cn.jiguang.commons.d.c.d f1082c;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b implements java.lang.Runnable {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Object f1083b;

        /* renamed from: c, reason: collision with root package name */
        private long f1084c;

        /* renamed from: d, reason: collision with root package name */
        private long f1085d;

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(cn.jiguang.commons.d.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        synchronized void a(int r1, java.lang.Object r2, long r3, long r5) {
                r0 = this;
                monitor-enter(r0)
                r0.a = r1     // Catch: java.lang.Throwable -> Lb
                r0.f1083b = r2     // Catch: java.lang.Throwable -> Lb
                r0.f1084c = r3     // Catch: java.lang.Throwable -> Lb
                r0.f1085d = r5     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)
                return
            Lb:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.a()
                java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.commons.d.c.a(r0)     // Catch: java.lang.Exception -> L5e
                int r2 = r9.a     // Catch: java.lang.Exception -> L5e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L5e
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L5e
                r2 = r1
                cn.jiguang.commons.c.c r2 = (cn.jiguang.commons.c.c) r2     // Catch: java.lang.Exception -> L5e
                if (r2 == 0) goto L20
                long r4 = r9.f1084c     // Catch: java.lang.Exception -> L5e
                long r6 = r9.f1085d     // Catch: java.lang.Exception -> L5e
                r3 = 0
                r2.a(r3, r4, r6)     // Catch: java.lang.Exception -> L5e
                goto L38
            L20:
                cn.jiguang.commons.c.c r3 = new cn.jiguang.commons.c.c     // Catch: java.lang.Exception -> L5e
                long r5 = r9.f1084c     // Catch: java.lang.Exception -> L5e
                long r7 = r9.f1085d     // Catch: java.lang.Exception -> L5e
                r4 = 0
                r3.<init>(r4, r5, r7)     // Catch: java.lang.Exception -> L5e
                java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.commons.d.c.a(r0)     // Catch: java.lang.Exception -> L5e
                int r2 = r9.a     // Catch: java.lang.Exception -> L5e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L5e
                r1.put(r2, r3)     // Catch: java.lang.Exception -> L5e
                r2 = r3
            L38:
                int r1 = r9.a     // Catch: java.lang.Exception -> L5e
                r3 = 1100(0x44c, float:1.541E-42)
                if (r1 == r3) goto L4c
                r3 = 1110(0x456, float:1.555E-42)
                if (r1 != r3) goto L43
                goto L4c
            L43:
                java.lang.Object r3 = r9.f1083b     // Catch: java.lang.Exception -> L5e
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L5e
                r0.a(r1, r3, r2)     // Catch: java.lang.Exception -> L5e
            L4c:
                cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L5e
                int r3 = r9.a     // Catch: java.lang.Exception -> L5e
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L5e
                java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L5e
                r1.c(r3, r2)     // Catch: java.lang.Exception -> L5e
                return
            L5e:
                java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.commons.d.c.a(r0)     // Catch: java.lang.Throwable -> L7a
                int r2 = r9.a     // Catch: java.lang.Throwable -> L7a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7a
                r2 = r1
                cn.jiguang.commons.c.c r2 = (cn.jiguang.commons.c.c) r2     // Catch: java.lang.Throwable -> L7a
                if (r2 == 0) goto L7c
                long r4 = r9.f1084c     // Catch: java.lang.Throwable -> L7a
                long r6 = r9.f1085d     // Catch: java.lang.Throwable -> L7a
                r3 = 0
                r2.a(r3, r4, r6)     // Catch: java.lang.Throwable -> L7a
                goto Lb8
            L7a:
                r0 = move-exception
                goto L94
            L7c:
                cn.jiguang.commons.c.c r1 = new cn.jiguang.commons.c.c     // Catch: java.lang.Throwable -> L7a
                long r3 = r9.f1084c     // Catch: java.lang.Throwable -> L7a
                long r5 = r9.f1085d     // Catch: java.lang.Throwable -> L7a
                r2 = 0
                r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L7a
                java.util.concurrent.ConcurrentHashMap r0 = cn.jiguang.commons.d.c.a(r0)     // Catch: java.lang.Throwable -> L7a
                int r2 = r9.a     // Catch: java.lang.Throwable -> L7a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7a
                r0.put(r2, r1)     // Catch: java.lang.Throwable -> L7a
                goto Lb8
            L94:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "fallback mem update err:"
                r1.append(r2)
                int r2 = r9.a
                r1.append(r2)
                java.lang.String r2 = ":"
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "CacheManager"
                cn.jiguang.commons.w.a.f(r1, r0)
            Lb8:
                return
        }
    }

    /* renamed from: cn.jiguang.commons.d.c$c, reason: collision with other inner class name */
    private static final class C0033c {
        private static final cn.jiguang.commons.d.c a = null;

        static {
                cn.jiguang.commons.d.c r0 = new cn.jiguang.commons.d.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.d.c.C0033c.a = r0
                return
        }

        public C0033c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.d.c a() {
                cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.C0033c.a
                return r0
        }
    }

    public static class d {
        public final int a;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1086c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1087d;

        public d() {
                r4 = this;
                r0 = 1
                r1 = 259200000(0xf731400, double:1.280618154E-315)
                r3 = 60
                r4.<init>(r3, r0, r1)
                return
        }

        public d(int r2, boolean r3, long r4) {
                r1 = this;
                r1.<init>()
                r0 = 100
                int r2 = java.lang.Math.min(r2, r0)
                r1.a = r2
                r1.f1086c = r3
                r1.f1087d = r4
                return
        }
    }

    private c() {
            r1 = this;
            r1.<init>()
            cn.jiguang.commons.d.c$d r0 = new cn.jiguang.commons.d.c$d
            r0.<init>()
            r1.f1082c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    /* synthetic */ c(cn.jiguang.commons.d.c.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private long a(int r5, long r6) {
            r4 = this;
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L17
            cn.jiguang.commons.c.i r0 = r0.a(r5)     // Catch: java.lang.Exception -> L17
            if (r0 != 0) goto Lb
            goto L15
        Lb:
            long r0 = r0.f()     // Catch: java.lang.Exception -> L17
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L16
        L15:
            return r6
        L16:
            return r0
        L17:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "exp err:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "CacheManager"
            cn.jiguang.commons.w.a.c(r1, r5, r0)
            return r6
    }

    private cn.jiguang.commons.c.c a(java.lang.String r3) {
            r2 = this;
            r0 = 0
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L14
            java.lang.String r3 = r1.a(r3, r0)     // Catch: java.lang.Exception -> L14
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L14
            if (r1 != 0) goto L14
            cn.jiguang.commons.c.c r3 = cn.jiguang.commons.c.c.a(r3)     // Catch: java.lang.Exception -> L14
            return r3
        L14:
            return r0
    }

    public static cn.jiguang.commons.d.c a() {
            cn.jiguang.commons.d.c r0 = cn.jiguang.commons.d.c.C0033c.a()
            return r0
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap a(cn.jiguang.commons.d.c r0) {
            java.util.concurrent.ConcurrentHashMap r0 = r0.a
            return r0
    }

    private void a(int r10, java.lang.Object r11, long r12, long r14) {
            r9 = this;
            java.lang.String r1 = "CacheManager"
            cn.jiguang.commons.d.c$b r2 = new cn.jiguang.commons.d.c$b     // Catch: java.lang.Exception -> L34
            r0 = 0
            r2.<init>(r0)     // Catch: java.lang.Exception -> L34
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r2.a(r3, r4, r5, r7)     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.C.a r10 = cn.jiguang.commons.C.a.c()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.C.a$g r11 = cn.jiguang.commons.C.a.g.f772e     // Catch: java.lang.Exception -> L30
            boolean r10 = r10.a(r2, r11)     // Catch: java.lang.Exception -> L30
            if (r10 != 0) goto L33
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r10.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r11 = "set bulk submit failed: cid="
            r10.append(r11)     // Catch: java.lang.Exception -> L30
            r10.append(r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L30
            cn.jiguang.commons.w.a.f(r1, r10)     // Catch: java.lang.Exception -> L30
            return
        L30:
            r0 = move-exception
        L31:
            r10 = r0
            goto L37
        L33:
            return
        L34:
            r0 = move-exception
            r3 = r10
            goto L31
        L37:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "set bulk err: cid="
            r11.append(r12)
            r11.append(r3)
            java.lang.String r12 = ":"
            r11.append(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.commons.w.a.f(r1, r10)
            return
    }

    private void c(int r8, java.lang.Object r9, long r10, long r12) {
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r7.a     // Catch: java.lang.Exception -> L16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L16
            r1 = r0
            cn.jiguang.commons.c.c r1 = (cn.jiguang.commons.c.c) r1     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L19
            r2 = r9
            r3 = r10
            r5 = r12
            r1.a(r2, r3, r5)     // Catch: java.lang.Exception -> L16
            return
        L16:
            r0 = move-exception
            r9 = r0
            goto L2b
        L19:
            r1 = r9
            r2 = r10
            r4 = r12
            java.util.concurrent.ConcurrentHashMap r9 = r7.a     // Catch: java.lang.Exception -> L16
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L16
            cn.jiguang.commons.c.c r0 = new cn.jiguang.commons.c.c     // Catch: java.lang.Exception -> L16
            r0.<init>(r1, r2, r4)     // Catch: java.lang.Exception -> L16
            r9.put(r10, r0)     // Catch: java.lang.Exception -> L16
            return
        L2b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "mem update err:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = ":"
            r10.append(r8)
            java.lang.String r8 = r9.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "CacheManager"
            cn.jiguang.commons.w.a.f(r9, r8)
            return
    }

    private void d(int r8, java.lang.Object r9, long r10, long r12) {
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r7.a     // Catch: java.lang.Exception -> L16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L16
            r1 = r0
            cn.jiguang.commons.c.c r1 = (cn.jiguang.commons.c.c) r1     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L19
            r2 = r9
            r3 = r10
            r5 = r12
            r1.a(r2, r3, r5)     // Catch: java.lang.Exception -> L16
            goto L2b
        L16:
            r0 = move-exception
            r9 = r0
            goto L3b
        L19:
            r1 = r9
            r2 = r10
            r4 = r12
            cn.jiguang.commons.c.c r0 = new cn.jiguang.commons.c.c     // Catch: java.lang.Exception -> L16
            r0.<init>(r1, r2, r4)     // Catch: java.lang.Exception -> L16
            java.util.concurrent.ConcurrentHashMap r9 = r7.a     // Catch: java.lang.Exception -> L16
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L16
            r9.put(r10, r0)     // Catch: java.lang.Exception -> L16
            r1 = r0
        L2b:
            cn.jiguang.commons.L.ac r9 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L16
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L16
            java.lang.String r11 = r1.e()     // Catch: java.lang.Exception -> L16
            r9.c(r10, r11)     // Catch: java.lang.Exception -> L16
            return
        L3b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "sp+mem update err:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = ":"
            r10.append(r8)
            java.lang.String r8 = r9.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "CacheManager"
            cn.jiguang.commons.w.a.f(r9, r8)
            return
    }

    private java.lang.Object f(int r12) {
            r11 = this;
            java.lang.String r0 = java.lang.String.valueOf(r12)
            cn.jiguang.commons.c.c r0 = r11.a(r0)
            r1 = 0
            java.lang.String r2 = "CacheManager"
            if (r0 == 0) goto L90
            boolean r3 = r0.c()
            if (r3 == 0) goto L90
            java.util.List r3 = cn.jiguang.commons.L.c.c(r12)
            if (r3 == 0) goto L6c
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L20
            goto L6c
        L20:
            java.util.concurrent.ConcurrentHashMap r1 = r11.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.Object r1 = r1.get(r4)
            r4 = r1
            cn.jiguang.commons.c.c r4 = (cn.jiguang.commons.c.c) r4
            if (r4 == 0) goto L38
            long r6 = r0.f996c
            long r8 = r0.f997d
            r5 = 0
            r4.a(r5, r6, r8)
            goto L4b
        L38:
            java.util.concurrent.ConcurrentHashMap r1 = r11.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            cn.jiguang.commons.c.c r5 = new cn.jiguang.commons.c.c
            long r7 = r0.f996c
            long r9 = r0.f997d
            r6 = 0
            r5.<init>(r6, r7, r9)
            r1.put(r4, r5)
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "al valid:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = ":"
            r0.append(r12)
            int r12 = r3.size()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            cn.jiguang.commons.w.a.a(r2, r12)
            return r3
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "c:"
            r0.append(r4)
            r0.append(r12)
            java.lang.String r12 = ", al="
            r0.append(r12)
            if (r3 != 0) goto L83
            java.lang.String r12 = "null"
            goto L85
        L83:
            java.lang.String r12 = "empty"
        L85:
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            cn.jiguang.commons.w.a.f(r2, r12)
            return r1
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "al expired:"
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.f(r2, r0)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            cn.jiguang.commons.L.c.a(r12)
            return r1
    }

    private java.lang.Object g(int r11) {
            r10 = this;
            java.lang.String r1 = "CacheManager"
            r2 = 0
            java.lang.String r0 = cn.jiguang.commons.L.m.a(r11)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = cn.jiguang.commons.L.m.j(r0)     // Catch: java.lang.Throwable -> L26
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "file empty:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L26
            r0.append(r11)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L26
            return r2
        L26:
            r0 = move-exception
            goto L9c
        L29:
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.commons.c.c r3 = r10.a(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L79
            boolean r5 = r3.c()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L79
            java.util.concurrent.ConcurrentHashMap r0 = r10.a     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.commons.c.c r0 = (cn.jiguang.commons.c.c) r0     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L50
            long r5 = r3.f996c     // Catch: java.lang.Throwable -> L26
            long r7 = r3.f997d     // Catch: java.lang.Throwable -> L26
            r3 = r0
            r3.a(r4, r5, r7)     // Catch: java.lang.Throwable -> L26
            goto L64
        L50:
            java.util.concurrent.ConcurrentHashMap r0 = r10.a     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L26
            r5 = r3
            cn.jiguang.commons.c.c r3 = new cn.jiguang.commons.c.c     // Catch: java.lang.Throwable -> L26
            r7 = r5
            long r5 = r7.f996c     // Catch: java.lang.Throwable -> L26
            long r7 = r7.f997d     // Catch: java.lang.Throwable -> L26
            r3.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> L26
            r0.put(r9, r3)     // Catch: java.lang.Throwable -> L26
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "file valid:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L26
            r0.append(r11)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L26
            return r4
        L79:
            cn.jiguang.commons.L.m.d(r0)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.commons.L.ac r0 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "file expired:"
            r0.append(r3)     // Catch: java.lang.Throwable -> L26
            r0.append(r11)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L26
            return r2
        L9c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "file cache err:"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = ":"
            r3.append(r11)
            java.lang.String r11 = r0.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r11)
            return r2
    }

    public cn.jiguang.commons.c.c a(int r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            cn.jiguang.commons.c.c r2 = (cn.jiguang.commons.c.c) r2
            return r2
    }

    public void a(int r10, java.lang.Object r11) {
            r9 = this;
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L71
            int r6 = cn.jiguang.commons.f.g.c(r10)     // Catch: java.lang.Exception -> L71
            cn.jiguang.commons.d.c$d r0 = r9.f1082c     // Catch: java.lang.Exception -> L71
            long r0 = r0.f1087d     // Catch: java.lang.Exception -> L71
            long r2 = r9.a(r10, r0)     // Catch: java.lang.Exception -> L71
            if (r6 == 0) goto L68
            r0 = 1100(0x44c, float:1.541E-42)
            if (r10 == r0) goto L22
            r0 = 1110(0x456, float:1.555E-42)
            if (r10 != r0) goto L1b
            goto L22
        L1b:
            r1 = r9
            r7 = r4
            r4 = r6
            r5 = r2
            r2 = r10
            r3 = r11
            goto L61
        L22:
            r0 = 2
            if (r6 != r0) goto L1b
            java.util.concurrent.ConcurrentHashMap r0 = r9.a     // Catch: java.lang.Exception -> L38
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L38
            cn.jiguang.commons.c.c r0 = (cn.jiguang.commons.c.c) r0     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L3c
            r1 = 0
            r0.a(r1, r2, r4)     // Catch: java.lang.Exception -> L38
            goto L4b
        L38:
            r0 = move-exception
            r11 = r0
            r2 = r10
            goto L74
        L3c:
            java.util.concurrent.ConcurrentHashMap r7 = r9.a     // Catch: java.lang.Exception -> L38
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L38
            cn.jiguang.commons.c.c r0 = new cn.jiguang.commons.c.c     // Catch: java.lang.Exception -> L38
            r1 = 0
            r0.<init>(r1, r2, r4)     // Catch: java.lang.Exception -> L38
            r7.put(r8, r0)     // Catch: java.lang.Exception -> L38
        L4b:
            cn.jiguang.commons.L.ac r7 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L38
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L38
            cn.jiguang.commons.c.c r0 = new cn.jiguang.commons.c.c     // Catch: java.lang.Exception -> L38
            r1 = 0
            r0.<init>(r1, r2, r4)     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = r0.d()     // Catch: java.lang.Exception -> L38
            r7.c(r8, r0)     // Catch: java.lang.Exception -> L38
            goto L1b
        L61:
            r1.a(r2, r3, r4, r5, r7)     // Catch: java.lang.Exception -> L65
            return
        L65:
            r0 = move-exception
        L66:
            r11 = r0
            goto L74
        L68:
            r1 = r9
            r6 = r4
            r4 = r2
            r2 = r10
            r3 = r11
            r1.d(r2, r3, r4, r6)     // Catch: java.lang.Exception -> L65
            return
        L71:
            r0 = move-exception
            r2 = r10
            goto L66
        L74:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "update cache err:"
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ":"
            r10.append(r0)
            java.lang.String r11 = r11.getMessage()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "CacheManager"
            cn.jiguang.commons.w.a.f(r11, r10)
            return
    }

    public void a(int r2, java.lang.Object r3, int r4, long r5, long r7) {
            r1 = this;
            r0 = 2
            if (r4 == r0) goto L17
            r0 = 3
            if (r4 == r0) goto L10
            r0 = 4
            if (r4 == r0) goto L10
            r4 = r3
            r3 = r2
            r2 = r1
            r2.d(r3, r4, r5, r7)
            return
        L10:
            r4 = r3
            r3 = r2
            r2 = r1
            r2.c(r3, r4, r5, r7)
            return
        L17:
            r4 = r3
            r3 = r2
            r2 = r1
            r2.a(r3, r4, r5, r7)
            return
    }

    public void a(int r3, java.lang.String r4, cn.jiguang.commons.c.c r5) {
            r2 = this;
            java.lang.String r0 = "CacheManager"
            java.lang.String r1 = cn.jiguang.commons.L.m.a(r3)     // Catch: java.lang.Exception -> L32
            boolean r4 = cn.jiguang.commons.L.m.c(r1, r4)     // Catch: java.lang.Exception -> L32
            if (r4 == 0) goto L35
            if (r5 == 0) goto L34
            cn.jiguang.commons.L.ac r4 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L32
            r4.c(r1, r5)     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r4.<init>()     // Catch: java.lang.Exception -> L32
            java.lang.String r5 = "file saved:"
            r4.append(r5)     // Catch: java.lang.Exception -> L32
            r4.append(r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L32
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r4 = move-exception
            goto L4a
        L34:
            return
        L35:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r4.<init>()     // Catch: java.lang.Exception -> L32
            java.lang.String r5 = "file save failed:"
            r4.append(r5)     // Catch: java.lang.Exception -> L32
            r4.append(r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L32
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L32
            return
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "file save err:"
            r5.append(r1)
            r5.append(r3)
            java.lang.String r3 = ":"
            r5.append(r3)
            java.lang.String r3 = r4.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.commons.w.a.f(r0, r3)
            return
    }

    public java.lang.Object c(int r5) {
            r4 = this;
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.String r1 = "CacheManager"
            if (r5 == r0) goto L12
            r0 = 1110(0x456, float:1.555E-42)
            if (r5 != r0) goto Lb
            goto L12
        Lb:
            java.lang.Object r0 = r4.g(r5)     // Catch: java.lang.Exception -> L10
            goto L16
        L10:
            r0 = move-exception
            goto L3a
        L12:
            java.lang.Object r0 = r4.f(r5)     // Catch: java.lang.Exception -> L10
        L16:
            if (r0 == 0) goto L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10
            r2.<init>()     // Catch: java.lang.Exception -> L10
            java.lang.String r3 = "file hit:"
            r2.append(r3)     // Catch: java.lang.Exception -> L10
            goto L32
        L23:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L10
            goto L36
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10
            r2.<init>()     // Catch: java.lang.Exception -> L10
            java.lang.String r3 = "file miss:"
            r2.append(r3)     // Catch: java.lang.Exception -> L10
        L32:
            r2.append(r5)     // Catch: java.lang.Exception -> L10
            goto L23
        L36:
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L10
            return r0
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file err:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ":"
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jiguang.commons.w.a.f(r1, r5)
            r5 = 0
            return r5
    }

    public java.lang.Object d(int r7) {
            r6 = this;
            java.lang.String r0 = "CacheManager"
            java.util.concurrent.ConcurrentHashMap r1 = r6.a     // Catch: java.lang.Exception -> L43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L43
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L43
            cn.jiguang.commons.c.c r1 = (cn.jiguang.commons.c.c) r1     // Catch: java.lang.Exception -> L43
            r2 = 1110(0x456, float:1.555E-42)
            r3 = 1100(0x44c, float:1.541E-42)
            if (r1 == 0) goto L5e
            boolean r4 = r1.c()     // Catch: java.lang.Exception -> L43
            if (r4 == 0) goto L5e
            java.lang.String r4 = ":mem"
            java.lang.String r5 = "get:"
            if (r3 == r7) goto L45
            if (r2 != r7) goto L23
            goto L45
        L23:
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Exception -> L43
            boolean r2 = cn.jiguang.commons.L.ad.a(r1)     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r2.<init>()     // Catch: java.lang.Exception -> L43
            r2.append(r5)     // Catch: java.lang.Exception -> L43
            r2.append(r7)     // Catch: java.lang.Exception -> L43
            r2.append(r4)     // Catch: java.lang.Exception -> L43
        L3b:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L43
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Exception -> L43
            return r1
        L43:
            r1 = move-exception
            goto L7b
        L45:
            java.util.List r1 = cn.jiguang.commons.L.c.c(r7)     // Catch: java.lang.Exception -> L43
            boolean r2 = cn.jiguang.commons.L.ad.a(r1)     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r2.<init>()     // Catch: java.lang.Exception -> L43
            r2.append(r5)     // Catch: java.lang.Exception -> L43
            r2.append(r7)     // Catch: java.lang.Exception -> L43
            r2.append(r4)     // Catch: java.lang.Exception -> L43
            goto L3b
        L5e:
            if (r1 == 0) goto L9b
            boolean r1 = r1.c()     // Catch: java.lang.Exception -> L43
            if (r1 != 0) goto L9b
            java.util.concurrent.ConcurrentHashMap r1 = r6.a     // Catch: java.lang.Exception -> L43
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L43
            r1.remove(r4)     // Catch: java.lang.Exception -> L43
            if (r3 == r7) goto L73
            if (r2 != r7) goto L9b
        L73:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L43
            cn.jiguang.commons.L.c.a(r1)     // Catch: java.lang.Exception -> L43
            goto L9b
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mem err:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ":"
            r2.append(r7)
            java.lang.String r7 = r1.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
        L9b:
            r7 = 0
            return r7
    }

    public java.lang.Object e(int r6) {
            r5 = this;
            java.lang.String r0 = "CacheManager"
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L3f
            cn.jiguang.commons.c.c r1 = r5.a(r1)     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L41
            boolean r2 = r1.c()     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.a()     // Catch: java.lang.Exception -> L3f
            boolean r3 = cn.jiguang.commons.L.ad.a(r2)     // Catch: java.lang.Exception -> L3f
            if (r3 == 0) goto L6d
            java.util.concurrent.ConcurrentHashMap r3 = r5.a     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L3f
            r3.put(r4, r1)     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "get:"
            r1.append(r3)     // Catch: java.lang.Exception -> L3f
            r1.append(r6)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = ":sp"
            r1.append(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3f
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L3f
            return r2
        L3f:
            r1 = move-exception
            goto L4d
        L41:
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L3f
            r1.a(r2)     // Catch: java.lang.Exception -> L3f
            goto L6d
        L4d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sp err:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ":"
            r2.append(r6)
            java.lang.String r6 = r1.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r6)
        L6d:
            r6 = 0
            return r6
    }
}

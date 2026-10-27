package cn.jiguang.e;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static final java.util.Map<java.lang.String, android.content.SharedPreferences> a = null;


    private static class a {
        private static volatile android.os.Handler a;

        /* renamed from: b, reason: collision with root package name */
        private static final java.lang.Object f1270b = null;

        /* renamed from: c, reason: collision with root package name */
        private static final java.util.LinkedList<java.lang.Runnable> f1271c = null;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1272d;

        /* renamed from: e, reason: collision with root package name */
        private static final java.lang.Object f1273e = null;

        /* renamed from: cn.jiguang.e.b$a$a, reason: collision with other inner class name */
        private static class HandlerC0041a extends android.os.Handler {


            HandlerC0041a(android.os.Looper r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r3) {
                    r2 = this;
                    int r3 = r3.what
                    r0 = 1
                    if (r3 != r0) goto L10
                    cn.jiguang.e.b$a$a$1 r3 = new cn.jiguang.e.b$a$a$1
                    r3.<init>(r2)
                    r0 = 0
                    java.lang.String r1 = "FUTURE_TASK"
                    cn.jiguang.au.d.a(r1, r3, r0)
                L10:
                    return
            }
        }

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                cn.jiguang.e.b.a.f1270b = r0
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                cn.jiguang.e.b.a.f1271c = r0
                r0 = 1
                cn.jiguang.e.b.a.f1272d = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                cn.jiguang.e.b.a.f1273e = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ void a() {
                c()
                return
        }

        public static void a(java.lang.Runnable r4, boolean r5) {
                android.os.Handler r0 = b()     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L24
                java.lang.Object r1 = cn.jiguang.e.b.a.f1270b     // Catch: java.lang.Throwable -> L25
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L25
                java.util.LinkedList<java.lang.Runnable> r2 = cn.jiguang.e.b.a.f1271c     // Catch: java.lang.Throwable -> L1b
                r2.add(r4)     // Catch: java.lang.Throwable -> L1b
                r4 = 1
                if (r5 == 0) goto L1d
                boolean r5 = cn.jiguang.e.b.a.f1272d     // Catch: java.lang.Throwable -> L1b
                if (r5 == 0) goto L1d
                r2 = 100
                r0.sendEmptyMessageDelayed(r4, r2)     // Catch: java.lang.Throwable -> L1b
                goto L20
            L1b:
                r4 = move-exception
                goto L22
            L1d:
                r0.sendEmptyMessage(r4)     // Catch: java.lang.Throwable -> L1b
            L20:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
                return
            L22:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
                throw r4     // Catch: java.lang.Throwable -> L25
            L24:
                return
            L25:
                r4 = move-exception
                java.lang.String r5 = "Sp"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sp task add queue failed, "
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                cn.jiguang.w.f.i(r5, r4)
                return
        }

        private static android.os.Handler b() {
                android.os.Handler r0 = cn.jiguang.e.b.a.a
                if (r0 != 0) goto L1d
                java.lang.Object r0 = cn.jiguang.e.b.a.f1270b
                monitor-enter(r0)
                android.os.Handler r1 = cn.jiguang.e.b.a.a     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                cn.jiguang.e.b$a$a r1 = new cn.jiguang.e.b$a$a     // Catch: java.lang.Throwable -> L17
                android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
                cn.jiguang.e.b.a.a = r1     // Catch: java.lang.Throwable -> L17
                goto L19
            L17:
                r1 = move-exception
                goto L1b
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                throw r1
            L1d:
                android.os.Handler r0 = cn.jiguang.e.b.a.a
                return r0
        }

        private static void c() {
                java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
                java.lang.Object r0 = cn.jiguang.e.b.a.f1273e     // Catch: java.lang.Throwable -> L44
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L44
                java.lang.Object r1 = cn.jiguang.e.b.a.f1270b     // Catch: java.lang.Throwable -> L3c
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L3c
                java.util.LinkedList<java.lang.Runnable> r2 = cn.jiguang.e.b.a.f1271c     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r2.clone()     // Catch: java.lang.Throwable -> L1f
                java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch: java.lang.Throwable -> L1f
                r2.clear()     // Catch: java.lang.Throwable -> L1f
                android.os.Handler r2 = b()     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L21
                r4 = 1
                r2.removeMessages(r4)     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
                r2 = move-exception
                goto L40
            L21:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                int r1 = r3.size()     // Catch: java.lang.Throwable -> L3c
                if (r1 <= 0) goto L3e
                java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L3c
            L2c:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
                if (r2 == 0) goto L3e
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3c
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L3c
                r2.run()     // Catch: java.lang.Throwable -> L3c
                goto L2c
            L3c:
                r1 = move-exception
                goto L42
            L3e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                return
            L40:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                throw r2     // Catch: java.lang.Throwable -> L3c
            L42:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                throw r1     // Catch: java.lang.Throwable -> L44
            L44:
                r0 = move-exception
                java.lang.String r1 = "Sp"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "sp commit task error, "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.w.f.i(r1, r0)
                return
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.e.b.a = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> T a(android.content.Context r0, cn.jiguang.e.a<T> r1) {
            java.lang.Object r0 = b(r0, r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            T r0 = r1.f1266d
            return r0
    }

    private static <T> T a(android.content.SharedPreferences r2, java.lang.String r3, T r4) {
            r0 = 0
            if (r2 == 0) goto L48
            boolean r1 = r2.contains(r3)
            if (r1 != 0) goto La
            goto L48
        La:
            java.lang.String r2 = r2.getString(r3, r0)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L1c
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L48
            if (r3 <= 0) goto L1c
            java.lang.String r3 = cn.jiguang.a.a.f243j     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = cn.jiguang.av.t.b(r2, r3)     // Catch: java.lang.Throwable -> L48
        L1c:
            if (r2 != 0) goto L1f
            return r4
        L1f:
            boolean r3 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L28
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L48
            return r2
        L28:
            boolean r3 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L2d
            return r2
        L2d:
            boolean r3 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L48
            return r2
        L36:
            boolean r3 = r4 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L3f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L48
            return r2
        L3f:
            boolean r3 = r4 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L48
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L48
            return r2
        L48:
            return r0
    }

    private static <T> T a(android.content.SharedPreferences r2, java.lang.String r3, T r4, boolean r5) {
            r0 = 0
            if (r2 == 0) goto L68
            boolean r1 = r2.contains(r3)
            if (r1 != 0) goto La
            goto L68
        La:
            if (r5 == 0) goto L11
            java.lang.Object r2 = a(r2, r3, r4)     // Catch: java.lang.Throwable -> L68
            return r2
        L11:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L24
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L68
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L68
            boolean r2 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            return r2
        L24:
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L2f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L68
            return r2
        L2f:
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L42
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L68
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L68
            int r2 = r2.getInt(r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            return r2
        L42:
            boolean r5 = r4 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L55
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L68
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L68
            long r2 = r2.getLong(r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            return r2
        L55:
            boolean r5 = r4 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L68
            java.lang.Float r4 = (java.lang.Float) r4     // Catch: java.lang.Throwable -> L68
            float r4 = r4.floatValue()     // Catch: java.lang.Throwable -> L68
            float r2 = r2.getFloat(r3, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            return r2
        L68:
            return r0
    }

    private static <T> void a(android.content.Context r3, cn.jiguang.e.a<T> r4, cn.jiguang.e.a<T> r5) {
            java.lang.Object r0 = b(r3, r4)
            if (r0 != 0) goto L25
            java.lang.Object r0 = b(r3, r5)
            if (r0 == 0) goto L25
            cn.jiguang.e.a r4 = r4.a(r0)
            r0 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r0]
            r2 = 0
            r1[r2] = r4
            a(r3, r1)
            r4 = 0
            cn.jiguang.e.a r4 = r5.a(r4)
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r0]
            r5[r2] = r4
            a(r3, r5)
        L25:
            return
    }

    public static void a(android.content.Context r0, java.lang.String r1) {
            android.content.SharedPreferences r0 = e(r0, r1)
            if (r0 == 0) goto L11
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
        L11:
            return
    }

    private static void a(android.content.Context r1, boolean r2, cn.jiguang.e.a<?>... r3) {
            cn.jiguang.e.b$1 r0 = new cn.jiguang.e.b$1     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto Lc
            r1 = 0
            cn.jiguang.e.b.a.a(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return
        Lc:
            r0.run()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public static void a(android.content.Context r2, cn.jiguang.e.a<?>... r3) {
            if (r3 == 0) goto L1a
            int r0 = r3.length
            if (r0 <= 0) goto L1a
            boolean r0 = a()
            if (r0 == 0) goto L17
            java.lang.String r0 = "Sp"
            java.lang.String r1 = "main thread, async sp set"
            cn.jiguang.w.f.c(r0, r1)
            r0 = 1
            a(r2, r0, r3)
            return
        L17:
            b(r2, r3)
        L1a:
            return
    }

    static /* synthetic */ void a(android.content.SharedPreferences.Editor r0, java.lang.String r1, java.lang.Object r2, boolean r3) {
            b(r0, r1, r2, r3)
            return
    }

    private static boolean a() {
            r0 = 1
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1c
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L1c
            long r1 = r1.getId()     // Catch: java.lang.Throwable -> L1c
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1c
            long r3 = r3.getId()     // Catch: java.lang.Throwable -> L1c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            return r0
        L1a:
            r0 = 0
            return r0
        L1c:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[isMainThread] failed:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Sp"
            cn.jiguang.w.f.i(r2, r1)
            return r0
    }

    static /* synthetic */ android.content.SharedPreferences b(android.content.Context r0, java.lang.String r1) {
            android.content.SharedPreferences r0 = e(r0, r1)
            return r0
    }

    public static <T> T b(android.content.Context r4, cn.jiguang.e.a<T> r5) {
            java.lang.String r0 = r5.f1264b
            android.content.SharedPreferences r0 = e(r4, r0)
            java.lang.String r1 = r5.f1265c
            T r2 = r5.f1266d
            boolean r3 = r5.f1268f
            java.lang.Object r0 = a(r0, r1, r2, r3)
            if (r0 != 0) goto L26
            boolean r1 = r5.f1267e
            if (r1 == 0) goto L26
            java.lang.String r0 = r5.f1264b
            android.content.SharedPreferences r4 = d(r4, r0)
            java.lang.String r0 = r5.f1265c
            T r1 = r5.f1266d
            boolean r2 = r5.f1268f
            java.lang.Object r0 = a(r4, r0, r1, r2)
        L26:
            if (r0 == 0) goto L2c
            r5.a(r0)
            return r0
        L2c:
            r4 = 0
            return r4
    }

    public static void b(android.content.Context r1, cn.jiguang.e.a<?>... r2) {
            if (r2 == 0) goto L9
            int r0 = r2.length
            if (r0 <= 0) goto L9
            r0 = 0
            a(r1, r0, r2)
        L9:
            return
    }

    private static <T> void b(android.content.SharedPreferences.Editor r0, java.lang.String r1, T r2, boolean r3) {
            if (r0 == 0) goto L5f
            if (r2 != 0) goto L8
            r0.remove(r1)
            return
        L8:
            if (r3 == 0) goto L1e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 <= 0) goto L1a
            java.lang.String r3 = cn.jiguang.a.a.f243j
            java.lang.String r2 = cn.jiguang.av.t.a(r2, r3)
        L1a:
            r0.putString(r1, r2)
            return
        L1e:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L2c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.putBoolean(r1, r2)
            return
        L2c:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L36
            java.lang.String r2 = (java.lang.String) r2
            r0.putString(r1, r2)
            return
        L36:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L44
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.putInt(r1, r2)
            return
        L44:
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L52
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.putLong(r1, r2)
            return
        L52:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L5f
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0.putFloat(r1, r2)
        L5f:
            return
    }

    private static void c(android.content.Context r2, java.lang.String r3) {
            cn.jiguang.e.a r3 = cn.jiguang.e.a.al()
            java.lang.Object r3 = a(r2, r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L16
            java.lang.String r0 = "1."
            boolean r3 = r3.startsWith(r0)
        L16:
            cn.jiguang.e.a r3 = cn.jiguang.e.a.ak()
            java.lang.Object r3 = a(r2, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L3c
            cn.jiguang.e.a r3 = cn.jiguang.e.a.C0039a.C0040a.a()
            cn.jiguang.e.a r0 = cn.jiguang.e.a.C0039a.C0040a.b()
            a(r2, r3, r0)
            cn.jiguang.e.a r3 = cn.jiguang.e.a.C0039a.C0040a.c()
            cn.jiguang.e.a r0 = cn.jiguang.e.a.C0039a.C0040a.d()
            a(r2, r3, r0)
        L3c:
            cn.jiguang.e.a r3 = cn.jiguang.e.a.ak()
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            cn.jiguang.e.a r3 = r3.a(r1)
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r3
            a(r2, r0)
            return
    }

    private static android.content.SharedPreferences d(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto Lc
            r0 = 4
            r1.getSharedPreferences(r2, r0)
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static android.content.SharedPreferences e(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            if (r2 != 0) goto Le
            android.content.Context r2 = cn.jiguang.commons.utils.ContextUtils.getAppContext()
        Le:
            java.util.Map<java.lang.String, android.content.SharedPreferences> r0 = cn.jiguang.e.b.a
            java.lang.Object r1 = r0.get(r3)
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            if (r1 != 0) goto L25
            if (r2 == 0) goto L25
            r1 = 0
            android.content.SharedPreferences r1 = r2.getSharedPreferences(r3, r1)
            r0.put(r3, r1)
            c(r2, r3)
        L25:
            return r1
    }
}

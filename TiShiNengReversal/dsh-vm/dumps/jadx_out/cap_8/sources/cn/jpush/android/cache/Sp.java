package cn.jpush.android.cache;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Sp {
    private static final java.util.Map<java.lang.String, android.content.SharedPreferences> a = null;


    private static class a {
        private static android.os.Handler a;

        /* renamed from: b, reason: collision with root package name */
        private static final java.lang.Object f1748b = null;

        /* renamed from: c, reason: collision with root package name */
        private static final java.util.LinkedList<java.lang.Runnable> f1749c = null;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1750d;

        /* renamed from: e, reason: collision with root package name */
        private static android.content.Context f1751e;

        /* renamed from: f, reason: collision with root package name */
        private static final java.lang.Object f1752f = null;

        /* renamed from: cn.jpush.android.cache.Sp$a$a, reason: collision with other inner class name */
        private static class HandlerC0050a extends android.os.Handler {


            HandlerC0050a(android.os.Looper r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r2) {
                    r1 = this;
                    int r2 = r2.what
                    r0 = 1
                    if (r2 != r0) goto L11
                    android.content.Context r2 = cn.jpush.android.cache.Sp.a.a()
                    cn.jpush.android.cache.Sp$a$a$1 r0 = new cn.jpush.android.cache.Sp$a$a$1
                    r0.<init>(r1)
                    cn.jpush.android.helper.JCoreHelper.futureExecutor(r2, r0)
                L11:
                    return
            }
        }

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                cn.jpush.android.cache.Sp.a.f1748b = r0
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                cn.jpush.android.cache.Sp.a.f1749c = r0
                r0 = 1
                cn.jpush.android.cache.Sp.a.f1750d = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                cn.jpush.android.cache.Sp.a.f1752f = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ android.content.Context a() {
                android.content.Context r0 = cn.jpush.android.cache.Sp.a.f1751e
                return r0
        }

        static /* synthetic */ void a(android.content.Context r0) {
                c(r0)
                return
        }

        public static void a(android.content.Context r3, java.lang.Runnable r4, boolean r5) {
                android.os.Handler r3 = b(r3)     // Catch: java.lang.Throwable -> L25
                if (r3 == 0) goto L24
                java.lang.Object r0 = cn.jpush.android.cache.Sp.a.f1748b     // Catch: java.lang.Throwable -> L25
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L25
                java.util.LinkedList<java.lang.Runnable> r1 = cn.jpush.android.cache.Sp.a.f1749c     // Catch: java.lang.Throwable -> L1b
                r1.add(r4)     // Catch: java.lang.Throwable -> L1b
                r4 = 1
                if (r5 == 0) goto L1d
                boolean r5 = cn.jpush.android.cache.Sp.a.f1750d     // Catch: java.lang.Throwable -> L1b
                if (r5 == 0) goto L1d
                r1 = 100
                r3.sendEmptyMessageDelayed(r4, r1)     // Catch: java.lang.Throwable -> L1b
                goto L20
            L1b:
                r3 = move-exception
                goto L22
            L1d:
                r3.sendEmptyMessage(r4)     // Catch: java.lang.Throwable -> L1b
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                return
            L22:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r3     // Catch: java.lang.Throwable -> L25
            L24:
                return
            L25:
                r3 = move-exception
                java.lang.String r4 = "Sp"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "sp task add queue failed, "
                r5.append(r0)
                java.lang.String r3 = r3.getMessage()
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                cn.jpush.android.helper.Logger.w(r4, r3)
                return
        }

        private static android.os.Handler b(android.content.Context r2) {
                if (r2 == 0) goto Lb
                android.content.Context r2 = r2.getApplicationContext()
                android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
                goto L10
            Lb:
                r2 = 0
                android.content.Context r2 = cn.jpush.android.local.JPushConstants.getAppContext(r2)
            L10:
                cn.jpush.android.cache.Sp.a.f1751e = r2
                android.os.Handler r2 = cn.jpush.android.cache.Sp.a.a
                if (r2 != 0) goto L2f
                java.lang.Object r2 = cn.jpush.android.cache.Sp.a.f1748b
                monitor-enter(r2)
                android.os.Handler r0 = cn.jpush.android.cache.Sp.a.a     // Catch: java.lang.Throwable -> L29
                if (r0 != 0) goto L2b
                cn.jpush.android.cache.Sp$a$a r0 = new cn.jpush.android.cache.Sp$a$a     // Catch: java.lang.Throwable -> L29
                android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L29
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
                cn.jpush.android.cache.Sp.a.a = r0     // Catch: java.lang.Throwable -> L29
                goto L2b
            L29:
                r0 = move-exception
                goto L2d
            L2b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
                goto L2f
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
                throw r0
            L2f:
                android.os.Handler r2 = cn.jpush.android.cache.Sp.a.a
                return r2
        }

        private static void c(android.content.Context r6) {
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
                java.lang.Object r2 = cn.jpush.android.cache.Sp.a.f1752f     // Catch: java.lang.Throwable -> L75
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L75
                java.lang.Object r3 = cn.jpush.android.cache.Sp.a.f1748b     // Catch: java.lang.Throwable -> L3d
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L3d
                java.util.LinkedList<java.lang.Runnable> r4 = cn.jpush.android.cache.Sp.a.f1749c     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = r4.clone()     // Catch: java.lang.Throwable -> L20
                java.util.LinkedList r5 = (java.util.LinkedList) r5     // Catch: java.lang.Throwable -> L20
                r4.clear()     // Catch: java.lang.Throwable -> L20
                android.os.Handler r6 = b(r6)     // Catch: java.lang.Throwable -> L20
                if (r6 == 0) goto L22
                r4 = 1
                r6.removeMessages(r4)     // Catch: java.lang.Throwable -> L20
                goto L22
            L20:
                r6 = move-exception
                goto L71
            L22:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
                int r6 = r5.size()     // Catch: java.lang.Throwable -> L3d
                if (r6 <= 0) goto L6f
                java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L3d
            L2d:
                boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L3d
                if (r3 == 0) goto L3f
                java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L3d
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L3d
                r3.run()     // Catch: java.lang.Throwable -> L3d
                goto L2d
            L3d:
                r6 = move-exception
                goto L73
            L3f:
                boolean r6 = cn.jiguang.internal.JConstants.DEBUG_MODE     // Catch: java.lang.Throwable -> L3d
                if (r6 == 0) goto L6f
                java.lang.String r6 = "Sp"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
                r3.<init>()     // Catch: java.lang.Throwable -> L3d
                java.lang.String r4 = "sp processing "
                r3.append(r4)     // Catch: java.lang.Throwable -> L3d
                int r4 = r5.size()     // Catch: java.lang.Throwable -> L3d
                r3.append(r4)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r4 = " items took "
                r3.append(r4)     // Catch: java.lang.Throwable -> L3d
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3d
                long r4 = r4 - r0
                r3.append(r4)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r0 = " ms"
                r3.append(r0)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3d
                cn.jpush.android.helper.Logger.d(r6, r0)     // Catch: java.lang.Throwable -> L3d
            L6f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
                return
            L71:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
                throw r6     // Catch: java.lang.Throwable -> L3d
            L73:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3d
                throw r6     // Catch: java.lang.Throwable -> L75
            L75:
                r6 = move-exception
                java.lang.String r0 = "Sp"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "sp commit task error, "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                cn.jpush.android.helper.Logger.w(r0, r6)
                return
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jpush.android.cache.Sp.a = r0
            return
    }

    public Sp() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.SharedPreferences a(android.content.Context r0, java.lang.String r1) {
            android.content.SharedPreferences r0 = b(r0, r1)
            return r0
    }

    private static <T> T a(android.content.SharedPreferences r3, java.lang.String r4, T r5) {
            r0 = 0
            if (r3 == 0) goto L61
            boolean r1 = r3.contains(r4)
            if (r1 != 0) goto La
            goto L61
        La:
            boolean r1 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L1d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L61
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L61
            boolean r3 = r3.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L61
            return r3
        L1d:
            boolean r1 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L28
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r3.getString(r4, r5)     // Catch: java.lang.Throwable -> L61
            return r3
        L28:
            boolean r1 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L3b
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L61
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L61
            int r3 = r3.getInt(r4, r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L61
            return r3
        L3b:
            boolean r1 = r5 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L4e
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L61
            long r1 = r5.longValue()     // Catch: java.lang.Throwable -> L61
            long r3 = r3.getLong(r4, r1)     // Catch: java.lang.Throwable -> L61
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L61
            return r3
        L4e:
            boolean r1 = r5 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L61
            java.lang.Float r5 = (java.lang.Float) r5     // Catch: java.lang.Throwable -> L61
            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L61
            float r3 = r3.getFloat(r4, r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L61
            return r3
        L61:
            return r0
    }

    private static void a(android.content.Context r1, boolean r2, cn.jpush.android.cache.Key<?>... r3) {
            cn.jpush.android.cache.Sp$1 r0 = new cn.jpush.android.cache.Sp$1
            r0.<init>(r3, r1)
            if (r2 == 0) goto Lc
            r2 = 0
            cn.jpush.android.cache.Sp.a.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lf
            return
        Lc:
            r0.run()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    static /* synthetic */ void a(android.content.SharedPreferences.Editor r0, java.lang.String r1, java.lang.Object r2, boolean r3) {
            b(r0, r1, r2, r3)
            return
    }

    private static boolean a() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            long r0 = r0.getId()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private static android.content.SharedPreferences b(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map<java.lang.String, android.content.SharedPreferences> r0 = cn.jpush.android.cache.Sp.a
            java.lang.Object r1 = r0.get(r3)
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            if (r1 != 0) goto L23
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.getAppContext(r2)
            if (r2 == 0) goto L23
            r1 = 0
            android.content.SharedPreferences r1 = r2.getSharedPreferences(r3, r1)
            r0.put(r3, r1)
            c(r2, r3)
        L23:
            return r1
    }

    private static <T> void b(android.content.SharedPreferences.Editor r1, java.lang.String r2, T r3, boolean r4) {
            if (r1 == 0) goto L5a
            if (r3 != 0) goto L8
            r1.remove(r2)
            return
        L8:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L16
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r1.putBoolean(r2, r3)
            return
        L16:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L31
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            if (r4 == 0) goto L2b
            int r4 = r0.length()
            if (r4 <= 0) goto L2b
            java.lang.String r3 = cn.jpush.android.ad.m.a
            java.lang.String r3 = cn.jpush.android.ad.l.a(r0, r3)
        L2b:
            java.lang.String r3 = (java.lang.String) r3
            r1.putString(r2, r3)
            return
        L31:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L3f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.putInt(r2, r3)
            return
        L3f:
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L4d
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r1.putLong(r2, r3)
            return
        L4d:
            boolean r4 = r3 instanceof java.lang.Float
            if (r4 == 0) goto L5a
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.putFloat(r2, r3)
        L5a:
            return
    }

    private static void c(android.content.Context r0, java.lang.String r1) {
            return
    }

    public static void clear(android.content.Context r0, java.lang.String r1) {
            android.content.SharedPreferences r0 = b(r0, r1)
            if (r0 == 0) goto L11
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
        L11:
            return
    }

    public static <T> T get(android.content.Context r0, cn.jpush.android.cache.Key<T> r1) {
            java.lang.Object r0 = getWithNull(r0, r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            T r0 = r1.f1744c
            return r0
    }

    public static <T> T getWithNull(android.content.Context r3, cn.jpush.android.cache.Key<T> r4) {
            java.lang.String r0 = r4.a
            android.content.SharedPreferences r0 = b(r3, r0)
            java.lang.String r1 = r4.f1743b
            T r2 = r4.f1744c
            java.lang.Object r0 = a(r0, r1, r2)
            if (r0 != 0) goto L22
            boolean r1 = r4.f1745d
            if (r1 == 0) goto L22
            java.lang.String r0 = r4.a
            android.content.SharedPreferences r3 = reload(r3, r0)
            java.lang.String r0 = r4.f1743b
            T r1 = r4.f1744c
            java.lang.Object r0 = a(r3, r0, r1)
        L22:
            if (r0 == 0) goto L3f
            boolean r3 = r4.f1746e
            if (r3 == 0) goto L3b
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L3b
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r3.length()
            if (r1 <= 0) goto L3b
            java.lang.String r0 = cn.jpush.android.ad.m.a
            java.lang.String r0 = cn.jpush.android.ad.l.b(r3, r0)
        L3b:
            r4.set(r0)
            return r0
        L3f:
            r3 = 0
            return r3
    }

    public static void read(android.content.Context r3, cn.jpush.android.cache.Key<?>... r4) {
            if (r4 == 0) goto L11
            int r0 = r4.length
            if (r0 <= 0) goto L11
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r4[r1]
            get(r3, r2)
            int r1 = r1 + 1
            goto L7
        L11:
            return
    }

    public static android.content.SharedPreferences reload(android.content.Context r1, java.lang.String r2) {
            android.content.Context r1 = cn.jpush.android.local.JPushConstants.getAppContext(r1)
            if (r1 == 0) goto L10
            r0 = 4
            r1.getSharedPreferences(r2, r0)
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static void set(android.content.Context r2, cn.jpush.android.cache.Key<?>... r3) {
            if (r3 == 0) goto L1a
            int r0 = r3.length
            if (r0 <= 0) goto L1a
            boolean r0 = a()
            if (r0 == 0) goto L17
            java.lang.String r0 = "Sp"
            java.lang.String r1 = "main thread, async sp set"
            cn.jpush.android.helper.Logger.d(r0, r1)
            r0 = 1
            a(r2, r0, r3)
            return
        L17:
            sync_set(r2, r3)
        L1a:
            return
    }

    public static void sync_set(android.content.Context r1, cn.jpush.android.cache.Key<?>... r2) {
            if (r2 == 0) goto L9
            int r0 = r2.length
            if (r0 <= 0) goto L9
            r0 = 0
            a(r1, r0, r2)
        L9:
            return
    }
}

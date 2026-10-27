package cn.jiguang.ah;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ah.a> f470b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Handler f471c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.HandlerThread f472d;


    private static final class a {
        private static final cn.jiguang.ah.b a = null;

        static {
                cn.jiguang.ah.b r0 = new cn.jiguang.ah.b
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ah.b.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ah.b a() {
                cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a.a
                return r0
        }
    }

    /* renamed from: cn.jiguang.ah.b$b, reason: collision with other inner class name */
    class HandlerC0012b extends android.os.Handler {
        final /* synthetic */ cn.jiguang.ah.b a;

        public HandlerC0012b(cn.jiguang.ah.b r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                java.lang.String r0 = "TaskHandlerManager_xxx"
                cn.jiguang.ah.b r1 = r3.a     // Catch: java.lang.Throwable -> L2f
                java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.ah.b.a(r1)     // Catch: java.lang.Throwable -> L2f
                int r2 = r4.what     // Catch: java.lang.Throwable -> L2f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2f
                cn.jiguang.ah.a r1 = (cn.jiguang.ah.a) r1     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L45
                r1.a(r4)     // Catch: java.lang.Throwable -> L2f
                int r1 = r1.f469c     // Catch: java.lang.Throwable -> L2f
                r2 = 1
                if (r1 != r2) goto L31
                int r4 = r4.what     // Catch: java.lang.Throwable -> L2f
                cn.jiguang.ad.g r1 = cn.jiguang.ad.g.a()     // Catch: java.lang.Throwable -> L2f
                int r1 = r1.f()     // Catch: java.lang.Throwable -> L2f
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch: java.lang.Throwable -> L2f
                r3.sendEmptyMessageDelayed(r4, r1)     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r4 = move-exception
                goto L5c
            L31:
                r2 = 3
                if (r1 != r2) goto L35
                return
            L35:
                cn.jiguang.ah.b r1 = r3.a     // Catch: java.lang.Throwable -> L2f
                java.util.concurrent.ConcurrentHashMap r1 = cn.jiguang.ah.b.a(r1)     // Catch: java.lang.Throwable -> L2f
                int r4 = r4.what     // Catch: java.lang.Throwable -> L2f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
                r1.remove(r4)     // Catch: java.lang.Throwable -> L2f
                return
            L45:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
                r1.<init>()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r2 = "miss task:"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2f
                int r4 = r4.what     // Catch: java.lang.Throwable -> L2f
                r1.append(r4)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2f
                cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L2f
                return
            L5c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "handleMessage,e:"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                cn.jiguang.w.f.i(r0, r4)
                return
        }
    }

    private b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f470b = r0
            return
    }

    /* synthetic */ b(cn.jiguang.ah.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ah.b a() {
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a.a()
            return r0
    }

    static /* synthetic */ java.util.concurrent.ConcurrentHashMap a(cn.jiguang.ah.b r0) {
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ah.a> r0 = r0.f470b
            return r0
    }

    private void a(int r2, int r3, long r4, cn.jiguang.ah.a r6) {
            r1 = this;
            android.os.Handler r0 = r1.f471c
            if (r0 != 0) goto L5
            return
        L5:
            r6.f468b = r4
            r6.f469c = r2
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ah.a> r2 = r1.f470b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.put(r0, r6)
            android.os.Handler r2 = r1.f471c
            boolean r2 = r2.hasMessages(r3)
            if (r2 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "register,same action in handler,will replace "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "TaskHandlerManager_xxx"
            cn.jiguang.w.f.i(r6, r2)
            android.os.Handler r2 = r1.f471c
            r2.removeMessages(r3)
        L35:
            android.os.Handler r2 = r1.f471c
            r2.sendEmptyMessageDelayed(r3, r4)
            return
    }

    public void a(int r7, long r8, cn.jiguang.ah.a r10) {
            r6 = this;
            r1 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r10
            r0.a(r1, r2, r3, r5)
            return
    }

    public synchronized void a(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.a     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            if (r2 != 0) goto L14
            java.lang.String r2 = "TaskHandlerManager_xxx"
            java.lang.String r0 = "init context is null"
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            goto L5c
        L14:
            java.lang.String r2 = "TaskHandlerManager_xxx"
            java.lang.String r0 = "init task manager..."
            cn.jiguang.w.f.c(r2, r0)     // Catch: java.lang.Throwable -> L12
            android.os.HandlerThread r2 = r1.f472d     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            if (r2 == 0) goto L25
            boolean r2 = r2.isAlive()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            if (r2 != 0) goto L31
        L25:
            cn.jiguang.ah.b$1 r2 = new cn.jiguang.ah.b$1     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            java.lang.String r0 = "jg_tsk_thread"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            r1.f472d = r2     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            r2.start()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
        L31:
            cn.jiguang.ah.b$b r2 = new cn.jiguang.ah.b$b     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            android.os.HandlerThread r0 = r1.f472d     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            if (r0 != 0) goto L40
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            goto L46
        L40:
            android.os.HandlerThread r0 = r1.f472d     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
        L46:
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            r1.f471c = r2     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L4c
            goto L57
        L4c:
            cn.jiguang.ah.b$b r2 = new cn.jiguang.ah.b$b     // Catch: java.lang.Throwable -> L12
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L12
            r1.f471c = r2     // Catch: java.lang.Throwable -> L12
        L57:
            r2 = 1
            r1.a = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public boolean a(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.f471c
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.hasMessages(r2)
            return r2
    }

    public void b(int r3) {
            r2 = this;
            android.os.Handler r0 = r2.f471c
            if (r0 != 0) goto L5
            return
        L5:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ah.a> r0 = r2.f470b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.remove(r1)
            android.os.Handler r0 = r2.f471c
            r0.removeMessages(r3)
            return
    }

    public void b(int r3, long r4, cn.jiguang.ah.a r6) {
            r2 = this;
            android.os.Handler r0 = r2.f471c
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r6.f469c = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, cn.jiguang.ah.a> r0 = r2.f470b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            android.os.Handler r6 = r2.f471c
            boolean r6 = r6.hasMessages(r3)
            java.lang.String r0 = "TaskHandlerManager_xxx"
            if (r6 == 0) goto L35
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "sendMsg,replace:"
            r6.append(r1)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
            android.os.Handler r6 = r2.f471c
            r6.removeMessages(r3)
            goto L49
        L35:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "sendMsg,action="
            r6.append(r1)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
        L49:
            android.os.Handler r6 = r2.f471c
            r6.sendEmptyMessageDelayed(r3, r4)
            return
    }
}

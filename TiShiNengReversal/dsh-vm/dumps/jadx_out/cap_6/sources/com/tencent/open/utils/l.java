package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class l {
    public static final java.util.concurrent.Executor a = null;
    private static java.lang.Object b;
    private static android.os.Handler c;
    private static android.os.HandlerThread d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.open.utils.l$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.util.concurrent.Executor {
        final java.util.Queue<java.lang.Runnable> a;
        java.lang.Runnable b;


        private a() {
                r1 = this;
                r1.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r1.a = r0
                return
        }

        /* synthetic */ a(com.tencent.open.utils.l.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        protected synchronized void a() {
                r2 = this;
                monitor-enter(r2)
                java.util.Queue<java.lang.Runnable> r0 = r2.a     // Catch: java.lang.Throwable -> L13
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L13
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L13
                r2.b = r0     // Catch: java.lang.Throwable -> L13
                if (r0 == 0) goto L15
                java.util.concurrent.Executor r1 = com.tencent.open.utils.l.a     // Catch: java.lang.Throwable -> L13
                r1.execute(r0)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r0 = move-exception
                goto L17
            L15:
                monitor-exit(r2)
                return
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
                throw r0
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(java.lang.Runnable r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.Queue<java.lang.Runnable> r0 = r2.a     // Catch: java.lang.Throwable -> L13
                com.tencent.open.utils.l$a$1 r1 = new com.tencent.open.utils.l$a$1     // Catch: java.lang.Throwable -> L13
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L13
                r0.offer(r1)     // Catch: java.lang.Throwable -> L13
                java.lang.Runnable r3 = r2.b     // Catch: java.lang.Throwable -> L13
                if (r3 != 0) goto L15
                r2.a()     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r3 = move-exception
                goto L17
            L15:
                monitor-exit(r2)
                return
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
                throw r3
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.tencent.open.utils.l.b = r0
            java.util.concurrent.Executor r0 = c()
            com.tencent.open.utils.l.a = r0
            return
    }

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Handler a() {
            android.os.Handler r0 = com.tencent.open.utils.l.c
            if (r0 != 0) goto L25
            java.lang.Class<com.tencent.open.utils.l> r0 = com.tencent.open.utils.l.class
            monitor-enter(r0)
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "SDK_SUB"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            com.tencent.open.utils.l.d = r1     // Catch: java.lang.Throwable -> L22
            r1.start()     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L22
            android.os.HandlerThread r2 = com.tencent.open.utils.l.d     // Catch: java.lang.Throwable -> L22
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            com.tencent.open.utils.l.c = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
        L25:
            android.os.Handler r0 = com.tencent.open.utils.l.c
            return r0
    }

    public static void a(java.lang.Runnable r1) {
            java.util.concurrent.Executor r0 = com.tencent.open.utils.l.a     // Catch: java.util.concurrent.RejectedExecutionException -> L5
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L5
        L5:
            return
    }

    public static java.util.concurrent.Executor b() {
            com.tencent.open.utils.l$a r0 = new com.tencent.open.utils.l$a
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static void b(java.lang.Runnable r1) {
            android.os.Handler r0 = a()
            r0.post(r1)
            return
    }

    private static java.util.concurrent.Executor c() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 0
            r2 = 3
            r3 = 10
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
    }
}

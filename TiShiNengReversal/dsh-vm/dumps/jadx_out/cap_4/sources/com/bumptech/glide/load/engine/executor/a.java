package com.bumptech.glide.load.engine.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a implements java.util.concurrent.ExecutorService {
    private static final java.lang.String b = "source";
    private static final java.lang.String c = "disk-cache";
    private static final int d = 1;
    private static final java.lang.String e = "GlideExecutor";
    private static final java.lang.String f = "source-unlimited";
    private static final java.lang.String g = "animation";
    private static final long h = 0;
    private static final int i = 4;
    private static volatile int j;
    private final java.util.concurrent.ExecutorService a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.engine.executor.a$a, reason: collision with other inner class name */
    public static final class C0020a {
        public static final long g = 0;
        private final boolean a;
        private int b;
        private int c;

        @androidx.annotation.NonNull
        private com.bumptech.glide.load.engine.executor.a.c d;
        private java.lang.String e;
        private long f;

        C0020a(boolean r2) {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.load.engine.executor.a$c r0 = com.bumptech.glide.load.engine.executor.a.c.d
                r1.d = r0
                r1.a = r2
                return
        }

        public com.bumptech.glide.load.engine.executor.a a() {
                r11 = this;
                java.lang.String r0 = r11.e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L37
                java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
                int r2 = r11.b
                int r3 = r11.c
                long r4 = r11.f
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.util.concurrent.PriorityBlockingQueue r7 = new java.util.concurrent.PriorityBlockingQueue
                r7.<init>()
                com.bumptech.glide.load.engine.executor.a$b r8 = new com.bumptech.glide.load.engine.executor.a$b
                java.lang.String r0 = r11.e
                com.bumptech.glide.load.engine.executor.a$c r9 = r11.d
                boolean r10 = r11.a
                r8.<init>(r0, r9, r10)
                r1.<init>(r2, r3, r4, r6, r7, r8)
                long r2 = r11.f
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L31
                r0 = 1
                r1.allowCoreThreadTimeOut(r0)
            L31:
                com.bumptech.glide.load.engine.executor.a r0 = new com.bumptech.glide.load.engine.executor.a
                r0.<init>(r1)
                return r0
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Name must be non-null and non-empty, but given: "
                r1.append(r2)
                java.lang.String r2 = r11.e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public com.bumptech.glide.load.engine.executor.a.C0020a b(java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.a.C0020a c(@androidx.annotation.IntRange(from = 1) int r1) {
                r0 = this;
                r0.b = r1
                r0.c = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.a.C0020a d(long r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.a.C0020a e(@androidx.annotation.NonNull com.bumptech.glide.load.engine.executor.a.c r1) {
                r0 = this;
                r0.d = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements java.util.concurrent.ThreadFactory {
        private static final int e = 9;
        private final java.lang.String a;
        final com.bumptech.glide.load.engine.executor.a.c b;
        final boolean c;
        private int d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$b$a, reason: collision with other inner class name */
        class C0021a extends java.lang.Thread {
            final /* synthetic */ com.bumptech.glide.load.engine.executor.a.b a;

            C0021a(com.bumptech.glide.load.engine.executor.a.b r1, java.lang.Runnable r2, java.lang.String r3) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2, r3)
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r2 = this;
                    r0 = 9
                    android.os.Process.setThreadPriority(r0)
                    com.bumptech.glide.load.engine.executor.a$b r0 = r2.a
                    boolean r0 = r0.c
                    if (r0 == 0) goto L1f
                    android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
                    r0.<init>()
                    android.os.StrictMode$ThreadPolicy$Builder r0 = r0.detectNetwork()
                    android.os.StrictMode$ThreadPolicy$Builder r0 = r0.penaltyDeath()
                    android.os.StrictMode$ThreadPolicy r0 = r0.build()
                    android.os.StrictMode.setThreadPolicy(r0)
                L1f:
                    super.run()     // Catch: java.lang.Throwable -> L23
                    return
                L23:
                    r0 = move-exception
                    com.bumptech.glide.load.engine.executor.a$b r1 = r2.a
                    com.bumptech.glide.load.engine.executor.a$c r1 = r1.b
                    r1.a(r0)
                    return
            }
        }

        b(java.lang.String r1, com.bumptech.glide.load.engine.executor.a.c r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r4) {
                r3 = this;
                monitor-enter(r3)
                com.bumptech.glide.load.engine.executor.a$b$a r0 = new com.bumptech.glide.load.engine.executor.a$b$a     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "glide-"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L2b
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "-thread-"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                int r2 = r3.d     // Catch: java.lang.Throwable -> L2b
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L2b
                int r4 = r3.d     // Catch: java.lang.Throwable -> L2b
                int r4 = r4 + 1
                r3.d = r4     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r3)
                return r0
            L2b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        public static final com.bumptech.glide.load.engine.executor.a.c a = null;
        public static final com.bumptech.glide.load.engine.executor.a.c b = null;
        public static final com.bumptech.glide.load.engine.executor.a.c c = null;
        public static final com.bumptech.glide.load.engine.executor.a.c d = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        class C0022a implements com.bumptech.glide.load.engine.executor.a.c {
            C0022a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(java.lang.Throwable r1) {
                    r0 = this;
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements com.bumptech.glide.load.engine.executor.a.c {
            b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(java.lang.Throwable r2) {
                    r1 = this;
                    if (r2 == 0) goto L8
                    java.lang.String r2 = "GlideExecutor"
                    r0 = 6
                    android.util.Log.isLoggable(r2, r0)
                L8:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$c, reason: collision with other inner class name */
        class C0023c implements com.bumptech.glide.load.engine.executor.a.c {
            C0023c() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(java.lang.Throwable r3) {
                    r2 = this;
                    if (r3 != 0) goto L3
                    return
                L3:
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.String r1 = "Request threw uncaught throwable"
                    r0.<init>(r1, r3)
                    throw r0
            }
        }

        static {
                com.bumptech.glide.load.engine.executor.a$c$a r0 = new com.bumptech.glide.load.engine.executor.a$c$a
                r0.<init>()
                com.bumptech.glide.load.engine.executor.a.c.a = r0
                com.bumptech.glide.load.engine.executor.a$c$b r0 = new com.bumptech.glide.load.engine.executor.a$c$b
                r0.<init>()
                com.bumptech.glide.load.engine.executor.a.c.b = r0
                com.bumptech.glide.load.engine.executor.a$c$c r1 = new com.bumptech.glide.load.engine.executor.a$c$c
                r1.<init>()
                com.bumptech.glide.load.engine.executor.a.c.c = r1
                com.bumptech.glide.load.engine.executor.a.c.d = r0
                return
        }

        void a(java.lang.Throwable r1);
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 10
            long r0 = r0.toMillis(r1)
            com.bumptech.glide.load.engine.executor.a.h = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    a(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static int a() {
            int r0 = com.bumptech.glide.load.engine.executor.a.j
            if (r0 != 0) goto Lf
            r0 = 4
            int r1 = com.bumptech.glide.load.engine.executor.b.a()
            int r0 = java.lang.Math.min(r0, r1)
            com.bumptech.glide.load.engine.executor.a.j = r0
        Lf:
            int r0 = com.bumptech.glide.load.engine.executor.a.j
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.a.C0020a b() {
            int r0 = a()
            r1 = 4
            r2 = 1
            if (r0 < r1) goto La
            r0 = 2
            goto Lb
        La:
            r0 = 1
        Lb:
            com.bumptech.glide.load.engine.executor.a$a r1 = new com.bumptech.glide.load.engine.executor.a$a
            r1.<init>(r2)
            com.bumptech.glide.load.engine.executor.a$a r0 = r1.c(r0)
            java.lang.String r1 = "animation"
            com.bumptech.glide.load.engine.executor.a$a r0 = r0.b(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.a c() {
            com.bumptech.glide.load.engine.executor.a$a r0 = b()
            com.bumptech.glide.load.engine.executor.a r0 = r0.a()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.a d(int r1, com.bumptech.glide.load.engine.executor.a.c r2) {
            com.bumptech.glide.load.engine.executor.a$a r0 = b()
            com.bumptech.glide.load.engine.executor.a$a r1 = r0.c(r1)
            com.bumptech.glide.load.engine.executor.a$a r1 = r1.e(r2)
            com.bumptech.glide.load.engine.executor.a r1 = r1.a()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.a.C0020a e() {
            com.bumptech.glide.load.engine.executor.a$a r0 = new com.bumptech.glide.load.engine.executor.a$a
            r1 = 1
            r0.<init>(r1)
            com.bumptech.glide.load.engine.executor.a$a r0 = r0.c(r1)
            java.lang.String r1 = "disk-cache"
            com.bumptech.glide.load.engine.executor.a$a r0 = r0.b(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.a f() {
            com.bumptech.glide.load.engine.executor.a$a r0 = e()
            com.bumptech.glide.load.engine.executor.a r0 = r0.a()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.a g(int r1, java.lang.String r2, com.bumptech.glide.load.engine.executor.a.c r3) {
            com.bumptech.glide.load.engine.executor.a$a r0 = e()
            com.bumptech.glide.load.engine.executor.a$a r1 = r0.c(r1)
            com.bumptech.glide.load.engine.executor.a$a r1 = r1.b(r2)
            com.bumptech.glide.load.engine.executor.a$a r1 = r1.e(r3)
            com.bumptech.glide.load.engine.executor.a r1 = r1.a()
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.a h(com.bumptech.glide.load.engine.executor.a.c r1) {
            com.bumptech.glide.load.engine.executor.a$a r0 = e()
            com.bumptech.glide.load.engine.executor.a$a r1 = r0.e(r1)
            com.bumptech.glide.load.engine.executor.a r1 = r1.a()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.a.C0020a i() {
            com.bumptech.glide.load.engine.executor.a$a r0 = new com.bumptech.glide.load.engine.executor.a$a
            r1 = 0
            r0.<init>(r1)
            int r1 = a()
            com.bumptech.glide.load.engine.executor.a$a r0 = r0.c(r1)
            java.lang.String r1 = "source"
            com.bumptech.glide.load.engine.executor.a$a r0 = r0.b(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.a j() {
            com.bumptech.glide.load.engine.executor.a$a r0 = i()
            com.bumptech.glide.load.engine.executor.a r0 = r0.a()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.a k(int r1, java.lang.String r2, com.bumptech.glide.load.engine.executor.a.c r3) {
            com.bumptech.glide.load.engine.executor.a$a r0 = i()
            com.bumptech.glide.load.engine.executor.a$a r1 = r0.c(r1)
            com.bumptech.glide.load.engine.executor.a$a r1 = r1.b(r2)
            com.bumptech.glide.load.engine.executor.a$a r1 = r1.e(r3)
            com.bumptech.glide.load.engine.executor.a r1 = r1.a()
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.a l(com.bumptech.glide.load.engine.executor.a.c r1) {
            com.bumptech.glide.load.engine.executor.a$a r0 = i()
            com.bumptech.glide.load.engine.executor.a$a r1 = r0.e(r1)
            com.bumptech.glide.load.engine.executor.a r1 = r1.a()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.a m() {
            com.bumptech.glide.load.engine.executor.a r0 = new com.bumptech.glide.load.engine.executor.a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            long r4 = com.bumptech.glide.load.engine.executor.a.h
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.bumptech.glide.load.engine.executor.a$b r8 = new com.bumptech.glide.load.engine.executor.a$b
            com.bumptech.glide.load.engine.executor.a$c r2 = com.bumptech.glide.load.engine.executor.a.c.d
            r3 = 0
            java.lang.String r9 = "source-unlimited"
            r8.<init>(r9, r2, r3)
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> T invokeAny(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@androidx.annotation.NonNull java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public java.util.concurrent.Future<?> submit(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public <T> java.util.concurrent.Future<T> submit(@androidx.annotation.NonNull java.lang.Runnable r2, T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(@androidx.annotation.NonNull java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}

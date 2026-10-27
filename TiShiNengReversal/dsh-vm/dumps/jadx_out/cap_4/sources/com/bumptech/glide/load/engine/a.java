package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class a {
    private final boolean a;
    private final java.util.concurrent.Executor b;

    @androidx.annotation.VisibleForTesting
    final java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.a.d> c;
    private final java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.p<?>> d;
    private com.bumptech.glide.load.engine.p.a e;
    private volatile boolean f;

    @androidx.annotation.Nullable
    private volatile com.bumptech.glide.load.engine.a.c g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0017a implements java.util.concurrent.ThreadFactory {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0018a implements java.lang.Runnable {
            final /* synthetic */ java.lang.Runnable a;
            final /* synthetic */ com.bumptech.glide.load.engine.a.ThreadFactoryC0017a b;

            RunnableC0018a(com.bumptech.glide.load.engine.a.ThreadFactoryC0017a r1, java.lang.Runnable r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    r0 = 10
                    android.os.Process.setThreadPriority(r0)
                    java.lang.Runnable r0 = r1.a
                    r0.run()
                    return
            }
        }

        ThreadFactoryC0017a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(@androidx.annotation.NonNull java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = new java.lang.Thread
                com.bumptech.glide.load.engine.a$a$a r1 = new com.bumptech.glide.load.engine.a$a$a
                r1.<init>(r2, r3)
                java.lang.String r3 = "glide-active-resources"
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.bumptech.glide.load.engine.a a;

        b(com.bumptech.glide.load.engine.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bumptech.glide.load.engine.a r0 = r1.a
                r0.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    interface c {
        void a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static final class d extends java.lang.ref.WeakReference<com.bumptech.glide.load.engine.p<?>> {
        final com.bumptech.glide.load.c a;
        final boolean b;

        @androidx.annotation.Nullable
        com.bumptech.glide.load.engine.u<?> c;

        d(@androidx.annotation.NonNull com.bumptech.glide.load.c r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.p<?> r2, @androidx.annotation.NonNull java.lang.ref.ReferenceQueue<? super com.bumptech.glide.load.engine.p<?>> r3, boolean r4) {
                r0 = this;
                r0.<init>(r2, r3)
                java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
                com.bumptech.glide.load.c r1 = (com.bumptech.glide.load.c) r1
                r0.a = r1
                boolean r1 = r2.d()
                if (r1 == 0) goto L1e
                if (r4 == 0) goto L1e
                com.bumptech.glide.load.engine.u r1 = r2.c()
                java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
                com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                r0.c = r1
                boolean r1 = r2.d()
                r0.b = r1
                return
        }

        void a() {
                r1 = this;
                r0 = 0
                r1.c = r0
                r1.clear()
                return
        }
    }

    a(boolean r2) {
            r1 = this;
            com.bumptech.glide.load.engine.a$a r0 = new com.bumptech.glide.load.engine.a$a
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r1.<init>(r2, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    a(boolean r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r1.d = r0
            r1.a = r2
            r1.b = r3
            com.bumptech.glide.load.engine.a$b r2 = new com.bumptech.glide.load.engine.a$b
            r2.<init>(r1)
            r3.execute(r2)
            return
    }

    synchronized void a(com.bumptech.glide.load.c r4, com.bumptech.glide.load.engine.p<?> r5) {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.load.engine.a$d r0 = new com.bumptech.glide.load.engine.a$d     // Catch: java.lang.Throwable -> L18
            java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.p<?>> r1 = r3.d     // Catch: java.lang.Throwable -> L18
            boolean r2 = r3.a     // Catch: java.lang.Throwable -> L18
            r0.<init>(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L18
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.a$d> r5 = r3.c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r5.put(r4, r0)     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.load.engine.a$d r4 = (com.bumptech.glide.load.engine.a.d) r4     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L1a
            r4.a()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L1c
        L1a:
            monitor-exit(r3)
            return
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    void b() {
            r1 = this;
        L0:
            boolean r0 = r1.f
            if (r0 != 0) goto L1f
            java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.p<?>> r0 = r1.d     // Catch: java.lang.InterruptedException -> L17
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L17
            com.bumptech.glide.load.engine.a$d r0 = (com.bumptech.glide.load.engine.a.d) r0     // Catch: java.lang.InterruptedException -> L17
            r1.c(r0)     // Catch: java.lang.InterruptedException -> L17
            com.bumptech.glide.load.engine.a$c r0 = r1.g     // Catch: java.lang.InterruptedException -> L17
            if (r0 == 0) goto L0
            r0.a()     // Catch: java.lang.InterruptedException -> L17
            goto L0
        L17:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L0
        L1f:
            return
    }

    void c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.a.d r8) {
            r7 = this;
            monitor-enter(r7)
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.a$d> r0 = r7.c     // Catch: java.lang.Throwable -> L25
            com.bumptech.glide.load.c r1 = r8.a     // Catch: java.lang.Throwable -> L25
            r0.remove(r1)     // Catch: java.lang.Throwable -> L25
            boolean r0 = r8.b     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L28
            com.bumptech.glide.load.engine.u<?> r2 = r8.c     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L11
            goto L28
        L11:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            com.bumptech.glide.load.engine.p r1 = new com.bumptech.glide.load.engine.p
            com.bumptech.glide.load.c r5 = r8.a
            com.bumptech.glide.load.engine.p$a r6 = r7.e
            r3 = 1
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            com.bumptech.glide.load.engine.p$a r0 = r7.e
            com.bumptech.glide.load.c r8 = r8.a
            r0.c(r8, r1)
            return
        L25:
            r0 = move-exception
            r8 = r0
            goto L2a
        L28:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            return
        L2a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            throw r8
    }

    synchronized void d(com.bumptech.glide.load.c r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.a$d> r0 = r1.c     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.a.d) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2.a()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @androidx.annotation.Nullable
    synchronized com.bumptech.glide.load.engine.p<?> e(com.bumptech.glide.load.c r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.a$d> r0 = r1.c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.a.d) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto Le
            monitor-exit(r1)
            r2 = 0
            return r2
        Le:
            java.lang.Object r0 = r2.get()     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.load.engine.p r0 = (com.bumptech.glide.load.engine.p) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1.c(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L1e
        L1c:
            monitor-exit(r1)
            return r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    @androidx.annotation.VisibleForTesting
    void f(com.bumptech.glide.load.engine.a.c r1) {
            r0 = this;
            r0.g = r1
            return
    }

    void g(com.bumptech.glide.load.engine.p.a r2) {
            r1 = this;
            monitor-enter(r2)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7
            r1.e = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto Lc
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L7
        Lc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    void h() {
            r2 = this;
            r0 = 1
            r2.f = r0
            java.util.concurrent.Executor r0 = r2.b
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Le
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.bumptech.glide.util.e.c(r0)
        Le:
            return
    }
}

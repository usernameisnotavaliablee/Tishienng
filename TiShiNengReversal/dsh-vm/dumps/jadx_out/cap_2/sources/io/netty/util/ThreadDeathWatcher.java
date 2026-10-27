package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ThreadDeathWatcher {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final java.util.Queue<io.netty.util.ThreadDeathWatcher.Entry> pendingEntries = null;
    private static final java.util.concurrent.atomic.AtomicBoolean started = null;
    static final java.util.concurrent.ThreadFactory threadFactory = null;
    private static final io.netty.util.ThreadDeathWatcher.Watcher watcher = null;
    private static volatile java.lang.Thread watcherThread;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Entry {
        final boolean isWatch;
        final java.lang.Runnable task;
        final java.lang.Thread thread;

        Entry(java.lang.Thread r1, java.lang.Runnable r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.thread = r1
                r0.task = r2
                r0.isWatch = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof io.netty.util.ThreadDeathWatcher.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                io.netty.util.ThreadDeathWatcher$Entry r5 = (io.netty.util.ThreadDeathWatcher.Entry) r5
                java.lang.Thread r1 = r4.thread
                java.lang.Thread r3 = r5.thread
                if (r1 != r3) goto L19
                java.lang.Runnable r1 = r4.task
                java.lang.Runnable r5 = r5.task
                if (r1 != r5) goto L19
                return r0
            L19:
                return r2
        }

        public int hashCode() {
                r2 = this;
                java.lang.Thread r0 = r2.thread
                int r0 = r0.hashCode()
                java.lang.Runnable r1 = r2.task
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Watcher implements java.lang.Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.List<io.netty.util.ThreadDeathWatcher.Entry> watchees;

        static {
                return
        }

        private Watcher() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.watchees = r0
                return
        }

        /* synthetic */ Watcher(io.netty.util.ThreadDeathWatcher.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void fetchWatchees() {
                r2 = this;
            L0:
                java.util.Queue r0 = io.netty.util.ThreadDeathWatcher.access$100()
                java.lang.Object r0 = r0.poll()
                io.netty.util.ThreadDeathWatcher$Entry r0 = (io.netty.util.ThreadDeathWatcher.Entry) r0
                if (r0 != 0) goto Ld
                return
            Ld:
                boolean r1 = r0.isWatch
                if (r1 == 0) goto L17
                java.util.List<io.netty.util.ThreadDeathWatcher$Entry> r1 = r2.watchees
                r1.add(r0)
                goto L0
            L17:
                java.util.List<io.netty.util.ThreadDeathWatcher$Entry> r1 = r2.watchees
                r1.remove(r0)
                goto L0
        }

        private void notifyWatchees() {
                r5 = this;
                java.util.List<io.netty.util.ThreadDeathWatcher$Entry> r0 = r5.watchees
                r1 = 0
            L3:
                int r2 = r0.size()
                if (r1 >= r2) goto L2e
                java.lang.Object r2 = r0.get(r1)
                io.netty.util.ThreadDeathWatcher$Entry r2 = (io.netty.util.ThreadDeathWatcher.Entry) r2
                java.lang.Thread r3 = r2.thread
                boolean r3 = r3.isAlive()
                if (r3 != 0) goto L2b
                r0.remove(r1)
                java.lang.Runnable r2 = r2.task     // Catch: java.lang.Throwable -> L20
                r2.run()     // Catch: java.lang.Throwable -> L20
                goto L3
            L20:
                r2 = move-exception
                io.netty.util.internal.logging.InternalLogger r3 = io.netty.util.ThreadDeathWatcher.access$300()
                java.lang.String r4 = "Thread death watcher task raised an exception:"
                r3.warn(r4, r2)
                goto L3
            L2b:
                int r1 = r1 + 1
                goto L3
            L2e:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                r3.fetchWatchees()
                r3.notifyWatchees()
                r3.fetchWatchees()
                r3.notifyWatchees()
                r0 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L12
                goto L13
            L12:
            L13:
                java.util.List<io.netty.util.ThreadDeathWatcher$Entry> r0 = r3.watchees
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L0
                java.util.Queue r0 = io.netty.util.ThreadDeathWatcher.access$100()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L0
                java.util.concurrent.atomic.AtomicBoolean r0 = io.netty.util.ThreadDeathWatcher.access$200()
                r1 = 1
                r2 = 0
                r0.compareAndSet(r1, r2)
                java.util.Queue r0 = io.netty.util.ThreadDeathWatcher.access$100()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L39
                goto L43
            L39:
                java.util.concurrent.atomic.AtomicBoolean r0 = io.netty.util.ThreadDeathWatcher.access$200()
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L0
            L43:
                return
        }
    }

    static {
            java.lang.Class<io.netty.util.ThreadDeathWatcher> r0 = io.netty.util.ThreadDeathWatcher.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.ThreadDeathWatcher.logger = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            io.netty.util.ThreadDeathWatcher.pendingEntries = r0
            io.netty.util.ThreadDeathWatcher$Watcher r0 = new io.netty.util.ThreadDeathWatcher$Watcher
            r1 = 0
            r0.<init>(r1)
            io.netty.util.ThreadDeathWatcher.watcher = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            io.netty.util.ThreadDeathWatcher.started = r0
            java.lang.String r0 = "io.netty.serviceThreadPrefix"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            boolean r2 = io.netty.util.internal.StringUtil.isNullOrEmpty(r0)
            java.lang.String r3 = "threadDeathWatcher"
            if (r2 != 0) goto L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L3b:
            io.netty.util.concurrent.DefaultThreadFactory r0 = new io.netty.util.concurrent.DefaultThreadFactory
            r2 = 1
            r0.<init>(r3, r2, r2, r1)
            io.netty.util.ThreadDeathWatcher.threadFactory = r0
            return
    }

    private ThreadDeathWatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.Queue access$100() {
            java.util.Queue<io.netty.util.ThreadDeathWatcher$Entry> r0 = io.netty.util.ThreadDeathWatcher.pendingEntries
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$200() {
            java.util.concurrent.atomic.AtomicBoolean r0 = io.netty.util.ThreadDeathWatcher.started
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$300() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ThreadDeathWatcher.logger
            return r0
    }

    public static boolean awaitInactivity(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            if (r4 == 0) goto L15
            java.lang.Thread r0 = io.netty.util.ThreadDeathWatcher.watcherThread
            r1 = 1
            if (r0 == 0) goto L14
            long r2 = r4.toMillis(r2)
            r0.join(r2)
            boolean r2 = r0.isAlive()
            r2 = r2 ^ r1
            return r2
        L14:
            return r1
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "unit"
            r2.<init>(r3)
            throw r2
    }

    private static void schedule(java.lang.Thread r2, java.lang.Runnable r3, boolean r4) {
            java.util.Queue<io.netty.util.ThreadDeathWatcher$Entry> r0 = io.netty.util.ThreadDeathWatcher.pendingEntries
            io.netty.util.ThreadDeathWatcher$Entry r1 = new io.netty.util.ThreadDeathWatcher$Entry
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            java.util.concurrent.atomic.AtomicBoolean r2 = io.netty.util.ThreadDeathWatcher.started
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L29
            java.util.concurrent.ThreadFactory r2 = io.netty.util.ThreadDeathWatcher.threadFactory
            io.netty.util.ThreadDeathWatcher$Watcher r3 = io.netty.util.ThreadDeathWatcher.watcher
            java.lang.Thread r2 = r2.newThread(r3)
            io.netty.util.ThreadDeathWatcher$1 r3 = new io.netty.util.ThreadDeathWatcher$1
            r3.<init>(r2)
            java.security.AccessController.doPrivileged(r3)
            r2.start()
            io.netty.util.ThreadDeathWatcher.watcherThread = r2
        L29:
            return
    }

    public static void unwatch(java.lang.Thread r1, java.lang.Runnable r2) {
            if (r1 == 0) goto L11
            if (r2 == 0) goto L9
            r0 = 0
            schedule(r1, r2, r0)
            return
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "task"
            r1.<init>(r2)
            throw r1
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "thread"
            r1.<init>(r2)
            throw r1
    }

    public static void watch(java.lang.Thread r1, java.lang.Runnable r2) {
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L17
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto Lf
            r0 = 1
            schedule(r1, r2, r0)
            return
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "thread must be alive."
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "task"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "thread"
            r1.<init>(r2)
            throw r1
    }
}

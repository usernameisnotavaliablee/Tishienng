package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObjectCleaner {
    private static final java.util.concurrent.atomic.AtomicBoolean CLEANER_RUNNING = null;
    private static final java.lang.Runnable CLEANER_TASK = null;
    static final java.lang.String CLEANER_THREAD_NAME = null;
    private static final java.util.Set<io.netty.util.internal.ObjectCleaner.AutomaticCleanerReference> LIVE_SET = null;
    private static final java.lang.ref.ReferenceQueue<java.lang.Object> REFERENCE_QUEUE = null;
    private static final int REFERENCE_QUEUE_POLL_TIMEOUT_MS = 0;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AutomaticCleanerReference extends java.lang.ref.WeakReference<java.lang.Object> {
        private final java.lang.Runnable cleanupTask;

        AutomaticCleanerReference(java.lang.Object r2, java.lang.Runnable r3) {
                r1 = this;
                java.lang.ref.ReferenceQueue r0 = io.netty.util.internal.ObjectCleaner.access$200()
                r1.<init>(r2, r0)
                r1.cleanupTask = r3
                return
        }

        void cleanup() {
                r1 = this;
                java.lang.Runnable r0 = r1.cleanupTask
                r0.run()
                return
        }

        @Override // java.lang.ref.Reference
        public void clear() {
                r1 = this;
                java.util.Set r0 = io.netty.util.internal.ObjectCleaner.access$000()
                r0.remove(r1)
                super.clear()
                return
        }

        @Override // java.lang.ref.Reference
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                java.lang.Thread r0 = r1.get()
                return r0
        }

        @Override // java.lang.ref.Reference
        public java.lang.Thread get() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.String r0 = "io.netty.util.internal.ObjectCleaner.refQueuePollTimeout"
            r1 = 10000(0x2710, float:1.4013E-41)
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = java.lang.Math.max(r1, r0)
            io.netty.util.internal.ObjectCleaner.REFERENCE_QUEUE_POLL_TIMEOUT_MS = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<io.netty.util.internal.ObjectCleaner> r1 = io.netty.util.internal.ObjectCleaner.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "Thread"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.util.internal.ObjectCleaner.CLEANER_THREAD_NAME = r0
            io.netty.util.internal.ConcurrentSet r0 = new io.netty.util.internal.ConcurrentSet
            r0.<init>()
            io.netty.util.internal.ObjectCleaner.LIVE_SET = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            io.netty.util.internal.ObjectCleaner.REFERENCE_QUEUE = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            io.netty.util.internal.ObjectCleaner.CLEANER_RUNNING = r0
            io.netty.util.internal.ObjectCleaner$1 r0 = new io.netty.util.internal.ObjectCleaner$1
            r0.<init>()
            io.netty.util.internal.ObjectCleaner.CLEANER_TASK = r0
            return
    }

    private ObjectCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference> r0 = io.netty.util.internal.ObjectCleaner.LIVE_SET
            return r0
    }

    static /* synthetic */ int access$100() {
            int r0 = io.netty.util.internal.ObjectCleaner.REFERENCE_QUEUE_POLL_TIMEOUT_MS
            return r0
    }

    static /* synthetic */ java.lang.ref.ReferenceQueue access$200() {
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = io.netty.util.internal.ObjectCleaner.REFERENCE_QUEUE
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$300() {
            java.util.concurrent.atomic.AtomicBoolean r0 = io.netty.util.internal.ObjectCleaner.CLEANER_RUNNING
            return r0
    }

    public static int getLiveSetCount() {
            java.util.Set<io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference> r0 = io.netty.util.internal.ObjectCleaner.LIVE_SET
            int r0 = r0.size()
            return r0
    }

    public static void register(java.lang.Object r2, java.lang.Runnable r3) {
            io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference r0 = new io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference
            java.lang.String r1 = "cleanupTask"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r0.<init>(r2, r3)
            java.util.Set<io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference> r2 = io.netty.util.internal.ObjectCleaner.LIVE_SET
            r2.add(r0)
            java.util.concurrent.atomic.AtomicBoolean r2 = io.netty.util.internal.ObjectCleaner.CLEANER_RUNNING
            r3 = 0
            r0 = 1
            boolean r2 = r2.compareAndSet(r3, r0)
            if (r2 == 0) goto L39
            io.netty.util.concurrent.FastThreadLocalThread r2 = new io.netty.util.concurrent.FastThreadLocalThread
            java.lang.Runnable r3 = io.netty.util.internal.ObjectCleaner.CLEANER_TASK
            r2.<init>(r3)
            r2.setPriority(r0)
            io.netty.util.internal.ObjectCleaner$2 r3 = new io.netty.util.internal.ObjectCleaner$2
            r3.<init>(r2)
            java.security.AccessController.doPrivileged(r3)
            java.lang.String r3 = io.netty.util.internal.ObjectCleaner.CLEANER_THREAD_NAME
            r2.setName(r3)
            r2.setDaemon(r0)
            r2.start()
        L39:
            return
    }
}

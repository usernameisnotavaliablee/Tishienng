package okhttp3.internal.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,364:1\n55#2,4:365\n55#2,4:369\n55#2,4:373\n55#2,4:377\n55#2,4:381\n63#2:385\n63#2:386\n55#2,4:387\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n107#1:365,4\n125#1:369,4\n140#1:373,4\n171#1:377,4\n251#1:381,4\n259#1:385\n268#1:386\n274#1:387,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class TaskRunner implements okhttp3.internal.concurrent.Lockable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.concurrent.TaskRunner.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.concurrent.TaskRunner INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.logging.Logger logger = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner.Backend backend;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int executeCallCount;

    @org.jetbrains.annotations.NotNull
    private final java.util.logging.Logger logger$1;
    private int nextQueueName;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> readyQueues;
    private int runCallCount;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable runnable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Backend {
        void coordinatorNotify(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r1);

        void coordinatorWait(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r1, long r2);

        @org.jetbrains.annotations.NotNull
        <T> java.util.concurrent.BlockingQueue<T> decorate(@org.jetbrains.annotations.NotNull java.util.concurrent.BlockingQueue<T> r1);

        void execute(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2);

        long nanoTime();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.logging.Logger getLogger() {
                r1 = this;
                java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.access$getLogger$cp()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,364:1\n36#2:365\n55#2,4:366\n41#2,6:370\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n324#1:365\n337#1:366,4\n339#1:370,6\n*E\n"})
    public static final class RealBackend implements okhttp3.internal.concurrent.TaskRunner.Backend {

        @org.jetbrains.annotations.NotNull
        private final java.util.concurrent.ThreadPoolExecutor executor;

        public RealBackend(@org.jetbrains.annotations.NotNull java.util.concurrent.ThreadFactory r10) {
                r9 = this;
                java.lang.String r0 = "threadFactory"
                kotlin.jvm.internal.g0.p(r10, r0)
                r9.<init>()
                java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
                r7.<init>()
                r2 = 0
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 60
                r8 = r10
                r1.<init>(r2, r3, r4, r6, r7, r8)
                r9.executor = r1
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.notify()
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r8, long r9) throws java.lang.InterruptedException {
                r7 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.g0.p(r8, r0)
                boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r0 == 0) goto L37
                boolean r0 = java.lang.Thread.holdsLock(r8)
                if (r0 == 0) goto L10
                goto L37
            L10:
                java.lang.AssertionError r9 = new java.lang.AssertionError
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "Thread "
                r10.append(r0)
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r0 = r0.getName()
                r10.append(r0)
                java.lang.String r0 = " MUST hold lock on "
                r10.append(r0)
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                r9.<init>(r8)
                throw r9
            L37:
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 <= 0) goto L4f
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r9 / r3
                long r3 = r3 * r5
                long r9 = r9 - r3
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 > 0) goto L4b
                if (r2 <= 0) goto L4f
            L4b:
                int r10 = (int) r9
                r8.wait(r5, r10)
            L4f:
                return
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        @org.jetbrains.annotations.NotNull
        public <T> java.util.concurrent.BlockingQueue<T> decorate(@org.jetbrains.annotations.NotNull java.util.concurrent.BlockingQueue<T> r2) {
                r1 = this;
                java.lang.String r0 = "queue"
                kotlin.jvm.internal.g0.p(r2, r0)
                return r2
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "runnable"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.util.concurrent.ThreadPoolExecutor r2 = r1.executor
                r2.execute(r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.ThreadPoolExecutor getExecutor() {
                r1 = this;
                java.util.concurrent.ThreadPoolExecutor r0 = r1.executor
                return r0
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        public final void shutdown() {
                r1 = this;
                java.util.concurrent.ThreadPoolExecutor r0 = r1.executor
                r0.shutdown()
                return
        }
    }

    static {
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = new okhttp3.internal.concurrent.TaskRunner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.concurrent.TaskRunner.Companion = r0
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r0 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r2 = "getLogger(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            okhttp3.internal.concurrent.TaskRunner.logger = r0
            okhttp3.internal.concurrent.TaskRunner r0 = new okhttp3.internal.concurrent.TaskRunner
            okhttp3.internal.concurrent.TaskRunner$RealBackend r2 = new okhttp3.internal.concurrent.TaskRunner$RealBackend
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = okhttp3.internal._UtilJvmKt.okHttpName
            r3.append(r4)
            java.lang.String r4 = " TaskRunner"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            java.util.concurrent.ThreadFactory r3 = okhttp3.internal._UtilJvmKt.threadFactory(r3, r4)
            r2.<init>(r3)
            r3 = 2
            r0.<init>(r2, r1, r3, r1)
            okhttp3.internal.concurrent.TaskRunner.INSTANCE = r0
            return
    }

    public TaskRunner(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner.Backend r2, @org.jetbrains.annotations.NotNull java.util.logging.Logger r3) {
            r1 = this;
            java.lang.String r0 = "backend"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.backend = r2
            r1.logger$1 = r3
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.nextQueueName = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.busyQueues = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.readyQueues = r2
            okhttp3.internal.concurrent.TaskRunner$runnable$1 r2 = new okhttp3.internal.concurrent.TaskRunner$runnable$1
            r2.<init>(r1)
            r1.runnable = r2
            return
    }

    public /* synthetic */ TaskRunner(okhttp3.internal.concurrent.TaskRunner.Backend r1, java.util.logging.Logger r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.util.logging.Logger r2 = okhttp3.internal.concurrent.TaskRunner.logger
        L6:
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ void access$afterRun(okhttp3.internal.concurrent.TaskRunner r0, okhttp3.internal.concurrent.Task r1, long r2, boolean r4) {
            r0.afterRun(r1, r2, r4)
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$cp() {
            java.util.logging.Logger r0 = okhttp3.internal.concurrent.TaskRunner.logger
            return r0
    }

    public static final /* synthetic */ int access$getRunCallCount$p(okhttp3.internal.concurrent.TaskRunner r0) {
            int r0 = r0.runCallCount
            return r0
    }

    public static final /* synthetic */ void access$setRunCallCount$p(okhttp3.internal.concurrent.TaskRunner r0, int r1) {
            r0.runCallCount = r1
            return
    }

    private final void afterRun(okhttp3.internal.concurrent.Task r6, long r7, boolean r9) {
            r5 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Thread "
            r7.append(r8)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r7.append(r8)
            java.lang.String r8 = " MUST hold lock on "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L32:
            okhttp3.internal.concurrent.TaskQueue r0 = r6.getQueue$okhttp()
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.internal.concurrent.Task r1 = r0.getActiveTask$okhttp()
            if (r1 != r6) goto L79
            boolean r1 = r0.getCancelActiveTask$okhttp()
            r2 = 0
            r0.setCancelActiveTask$okhttp(r2)
            r2 = 0
            r0.setActiveTask$okhttp(r2)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r5.busyQueues
            r2.remove(r0)
            r2 = -1
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L62
            if (r1 != 0) goto L62
            boolean r1 = r0.getShutdown$okhttp()
            if (r1 != 0) goto L62
            r1 = 1
            r0.scheduleAndDecide$okhttp(r6, r7, r1)
        L62:
            java.util.List r6 = r0.getFutureTasks$okhttp()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L78
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r6 = r5.readyQueues
            r6.add(r0)
            if (r9 != 0) goto L78
            r5.startAnotherThread()
        L78:
            return
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Check failed."
            r6.<init>(r7)
            throw r6
    }

    private final void beforeRun(okhttp3.internal.concurrent.Task r3) {
            r2 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L32:
            r0 = -1
            r3.setNextExecuteNanoTime$okhttp(r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r3.getQueue$okhttp()
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r1 = r0.getFutureTasks$okhttp()
            r1.remove(r3)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues
            r1.remove(r0)
            r0.setActiveTask$okhttp(r3)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r3 = r2.busyQueues
            r3.add(r0)
            return
    }

    private final void startAnotherThread() {
            r3 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            int r0 = r3.executeCallCount
            int r1 = r3.runCallCount
            if (r0 <= r1) goto L39
            return
        L39:
            int r0 = r0 + 1
            r3.executeCallCount = r0
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r3.backend
            java.lang.Runnable r1 = r3.runnable
            r0.execute(r3, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.internal.concurrent.TaskQueue> activeQueues() {
            r2 = this;
            monitor-enter(r2)
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.busyQueues     // Catch: java.lang.Throwable -> Lf
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Lf
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r2.readyQueues     // Catch: java.lang.Throwable -> Lf
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> Lf
            java.util.List r0 = kotlin.collections.f0.I4(r0, r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
            r15 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r15)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L3c
            return r1
        L3c:
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend
            long r2 = r0.nanoTime()
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L4e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L80
            java.lang.Object r7 = r0.next()
            okhttp3.internal.concurrent.TaskQueue r7 = (okhttp3.internal.concurrent.TaskQueue) r7
            java.util.List r7 = r7.getFutureTasks$okhttp()
            java.lang.Object r7 = r7.get(r9)
            okhttp3.internal.concurrent.Task r7 = (okhttp3.internal.concurrent.Task) r7
            long r10 = r7.getNextExecuteNanoTime$okhttp()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L7a
            long r4 = java.lang.Math.min(r10, r4)
            goto L4e
        L7a:
            if (r6 == 0) goto L7e
            r0 = 1
            goto L81
        L7e:
            r6 = r7
            goto L4e
        L80:
            r0 = 0
        L81:
            if (r6 == 0) goto L9a
            r15.beforeRun(r6)
            if (r0 != 0) goto L96
            boolean r0 = r15.coordinatorWaiting
            if (r0 != 0) goto L99
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r15.readyQueues
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L99
        L96:
            r15.startAnotherThread()
        L99:
            return r6
        L9a:
            boolean r0 = r15.coordinatorWaiting
            if (r0 == 0) goto Lab
            long r6 = r15.coordinatorWakeUpAt
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto Laa
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend
            r0.coordinatorNotify(r15)
        Laa:
            return r1
        Lab:
            r15.coordinatorWaiting = r8
            long r2 = r2 + r4
            r15.coordinatorWakeUpAt = r2
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r15.backend     // Catch: java.lang.Throwable -> Lb9 java.lang.InterruptedException -> Lbb
            r0.coordinatorWait(r15, r4)     // Catch: java.lang.Throwable -> Lb9 java.lang.InterruptedException -> Lbb
        Lb5:
            r15.coordinatorWaiting = r9
            goto L32
        Lb9:
            r0 = move-exception
            goto Lbf
        Lbb:
            r15.cancelAll()     // Catch: java.lang.Throwable -> Lb9
            goto Lb5
        Lbf:
            r15.coordinatorWaiting = r9
            throw r0
    }

    public final void cancelAll() {
            r3 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r3.busyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L3a:
            r1 = -1
            if (r1 >= r0) goto L4b
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r3.busyQueues
            java.lang.Object r1 = r1.get(r0)
            okhttp3.internal.concurrent.TaskQueue r1 = (okhttp3.internal.concurrent.TaskQueue) r1
            r1.cancelAllAndDecide$okhttp()
            int r0 = r0 + (-1)
            goto L3a
        L4b:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r3.readyQueues
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L53:
            if (r1 >= r0) goto L72
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r3.readyQueues
            java.lang.Object r2 = r2.get(r0)
            okhttp3.internal.concurrent.TaskQueue r2 = (okhttp3.internal.concurrent.TaskQueue) r2
            r2.cancelAllAndDecide$okhttp()
            java.util.List r2 = r2.getFutureTasks$okhttp()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6f
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r2 = r3.readyQueues
            r2.remove(r0)
        L6f:
            int r0 = r0 + (-1)
            goto L53
        L72:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskRunner.Backend getBackend() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r1.backend
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.logging.Logger getLogger$okhttp() {
            r1 = this;
            java.util.logging.Logger r0 = r1.logger$1
            return r0
    }

    public final void kickCoordinator$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r3) {
            r2 = this;
            java.lang.String r0 = "taskQueue"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L37:
            okhttp3.internal.concurrent.Task r0 = r3.getActiveTask$okhttp()
            if (r0 != 0) goto L54
            java.util.List r0 = r3.getFutureTasks$okhttp()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4f
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.readyQueues
            okhttp3.internal._UtilCommonKt.addIfAbsent(r0, r3)
            goto L54
        L4f:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r0 = r2.readyQueues
            r0.remove(r3)
        L54:
            boolean r3 = r2.coordinatorWaiting
            if (r3 == 0) goto L5e
            okhttp3.internal.concurrent.TaskRunner$Backend r3 = r2.backend
            r3.coordinatorNotify(r2)
            return
        L5e:
            r2.startAnotherThread()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskQueue newQueue() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.nextQueueName     // Catch: java.lang.Throwable -> L1f
            int r1 = r0 + 1
            r4.nextQueueName = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            okhttp3.internal.concurrent.TaskQueue r1 = new okhttp3.internal.concurrent.TaskQueue
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 81
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r4, r0)
            return r1
        L1f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}

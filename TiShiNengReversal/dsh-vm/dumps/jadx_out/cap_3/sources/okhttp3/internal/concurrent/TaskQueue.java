package okhttp3.internal.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n63#2:242\n63#2:243\n63#2:252\n49#2,4:268\n63#2:272\n49#2,4:273\n63#2:277\n26#3,4:244\n26#3,4:248\n26#3,4:253\n26#3,4:257\n26#3,4:278\n360#4,7:261\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n48#1:242\n64#1:243\n122#1:252\n202#1:268,4\n204#1:272\n212#1:273,4\n214#1:277\n67#1:244,4\n70#1:248,4\n173#1:253,4\n179#1:257,4\n231#1:278,4\n188#1:261,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class TaskQueue {

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private boolean shutdown;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {

        @org.jetbrains.annotations.NotNull
        private final java.util.concurrent.CountDownLatch latch;

        public AwaitIdleTask() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = okhttp3.internal._UtilJvmKt.okHttpName
                r0.append(r1)
                java.lang.String r1 = " awaitIdle"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.latch = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.CountDownLatch getLatch() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.latch
                return r0
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                java.util.concurrent.CountDownLatch r0 = r2.latch
                r0.countDown()
                r0 = -1
                return r0
        }
    }

    public TaskQueue(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.name = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.futureTasks = r2
            return
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue r6, java.lang.String r7, long r8, boolean r10, kotlin.jvm.functions.Function0 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 2
            if (r13 == 0) goto L6
            r8 = 0
        L6:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L11
            r10 = 1
            r4 = 1
        Ld:
            r0 = r6
            r1 = r7
            r5 = r11
            goto L13
        L11:
            r4 = r10
            goto Ld
        L13:
            r0.execute(r1, r2, r4, r5)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            r0.schedule(r1, r2, r4)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, okhttp3.internal.concurrent.Task r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            r0.schedule(r1, r2)
            return
    }

    public final void cancelAll() {
            r4 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r4.taskRunner
            boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r1 == 0) goto L34
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 != 0) goto Ld
            goto L34
        Ld:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Thread "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " MUST NOT hold lock on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L34:
            okhttp3.internal.concurrent.TaskRunner r0 = r4.taskRunner
            monitor-enter(r0)
            boolean r1 = r4.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L45
            okhttp3.internal.concurrent.TaskRunner r1 = r4.taskRunner     // Catch: java.lang.Throwable -> L43
            r1.kickCoordinator$okhttp(r4)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r1 = move-exception
            goto L49
        L45:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return
        L49:
            monitor-exit(r0)
            throw r1
    }

    public final boolean cancelAllAndDecide$okhttp() {
            r5 = this;
            okhttp3.internal.concurrent.Task r0 = r5.activeTask
            r1 = 1
            if (r0 == 0) goto L10
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.getCancelable()
            if (r0 == 0) goto L10
            r5.cancelActiveTask = r1
        L10:
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r5.futureTasks
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = 0
        L18:
            r3 = -1
            if (r3 >= r0) goto L4d
            java.util.List<okhttp3.internal.concurrent.Task> r3 = r5.futureTasks
            java.lang.Object r3 = r3.get(r0)
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            boolean r3 = r3.getCancelable()
            if (r3 == 0) goto L4a
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner
            java.util.logging.Logger r2 = r2.getLogger$okhttp()
            java.util.List<okhttp3.internal.concurrent.Task> r3 = r5.futureTasks
            java.lang.Object r3 = r3.get(r0)
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r2.isLoggable(r4)
            if (r4 == 0) goto L44
            java.lang.String r4 = "canceled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r2, r3, r5, r4)
        L44:
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r5.futureTasks
            r2.remove(r0)
            r2 = 1
        L4a:
            int r0 = r0 + (-1)
            goto L18
        L4d:
            return r2
    }

    public final void execute(@org.jetbrains.annotations.NotNull java.lang.String r2, long r3, boolean r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r6) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r6, r0)
            okhttp3.internal.concurrent.TaskQueue$execute$1 r0 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r0.<init>(r2, r5, r6)
            r1.schedule(r0, r3)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.concurrent.Task getActiveTask$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.Task r0 = r1.activeTask
            return r0
    }

    public final boolean getCancelActiveTask$okhttp() {
            r1 = this;
            boolean r0 = r1.cancelActiveTask
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.internal.concurrent.Task> getFutureTasks$okhttp() {
            r1 = this;
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r1.futureTasks
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.internal.concurrent.Task> getScheduledTasks() {
            r2 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r2.futureTasks     // Catch: java.lang.Throwable -> Ld
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> Ld
            java.util.List r1 = kotlin.collections.f0.a6(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean getShutdown$okhttp() {
            r1 = this;
            boolean r0 = r1.shutdown
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CountDownLatch idleLatch() {
            r5 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r5.taskRunner
            monitor-enter(r0)
            okhttp3.internal.concurrent.Task r1 = r5.activeTask     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto L19
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r5.futureTasks     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L17:
            r1 = move-exception
            goto L5d
        L19:
            okhttp3.internal.concurrent.Task r1 = r5.activeTask     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L27
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r1     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L27:
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r5.futureTasks     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L17
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3     // Catch: java.lang.Throwable -> L17
            boolean r4 = r3 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2d
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r3 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r3     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r1 = r3.getLatch()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L45:
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = new okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            r3 = 0
            boolean r2 = r5.scheduleAndDecide$okhttp(r1, r3, r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L57
            okhttp3.internal.concurrent.TaskRunner r2 = r5.taskRunner     // Catch: java.lang.Throwable -> L17
            r2.kickCoordinator$okhttp(r5)     // Catch: java.lang.Throwable -> L17
        L57:
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L5d:
            monitor-exit(r0)
            throw r1
    }

    public final void schedule(@org.jetbrains.annotations.NotNull java.lang.String r2, long r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Long> r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r5, r0)
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r0 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r0.<init>(r2, r5)
            r1.schedule(r0, r3)
            return
    }

    public final void schedule(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r3, long r4) {
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L43
            boolean r4 = r3.getCancelable()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L2a
            okhttp3.internal.concurrent.TaskRunner r4 = r2.taskRunner     // Catch: java.lang.Throwable -> L26
            java.util.logging.Logger r4 = r4.getLogger$okhttp()     // Catch: java.lang.Throwable -> L26
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L26
            boolean r5 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L28
            java.lang.String r5 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r3 = move-exception
            goto L53
        L28:
            monitor-exit(r0)
            return
        L2a:
            okhttp3.internal.concurrent.TaskRunner r4 = r2.taskRunner     // Catch: java.lang.Throwable -> L26
            java.util.logging.Logger r4 = r4.getLogger$okhttp()     // Catch: java.lang.Throwable -> L26
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L26
            boolean r5 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L3d
            java.lang.String r5 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> L26
        L3d:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L43:
            r1 = 0
            boolean r3 = r2.scheduleAndDecide$okhttp(r3, r4, r1)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L4f
            okhttp3.internal.concurrent.TaskRunner r3 = r2.taskRunner     // Catch: java.lang.Throwable -> L26
            r3.kickCoordinator$okhttp(r2)     // Catch: java.lang.Throwable -> L26
        L4f:
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L53:
            monitor-exit(r0)
            throw r3
    }

    public final boolean scheduleAndDecide$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r11, long r12, boolean r14) {
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.g0.p(r11, r0)
            r11.initQueue$okhttp(r10)
            okhttp3.internal.concurrent.TaskRunner r0 = r10.taskRunner
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r0 = r0.nanoTime()
            long r2 = r0 + r12
            java.util.List<okhttp3.internal.concurrent.Task> r4 = r10.futureTasks
            int r4 = r4.indexOf(r11)
            r5 = 0
            r6 = -1
            if (r4 == r6) goto L3f
            long r7 = r11.getNextExecuteNanoTime$okhttp()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 > 0) goto L3a
            okhttp3.internal.concurrent.TaskRunner r12 = r10.taskRunner
            java.util.logging.Logger r12 = r12.getLogger$okhttp()
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r12.isLoggable(r13)
            if (r13 == 0) goto L39
            java.lang.String r13 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r12, r11, r10, r13)
        L39:
            return r5
        L3a:
            java.util.List<okhttp3.internal.concurrent.Task> r7 = r10.futureTasks
            r7.remove(r4)
        L3f:
            r11.setNextExecuteNanoTime$okhttp(r2)
            okhttp3.internal.concurrent.TaskRunner r4 = r10.taskRunner
            java.util.logging.Logger r4 = r4.getLogger$okhttp()
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r4.isLoggable(r7)
            if (r7 == 0) goto L82
            if (r14 == 0) goto L69
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r7 = "run again after "
            r14.append(r7)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            goto L7f
        L69:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r7 = "scheduled after "
            r14.append(r7)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
        L7f:
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r4, r11, r10, r14)
        L82:
            java.util.List<okhttp3.internal.concurrent.Task> r14 = r10.futureTasks
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
        L89:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r14.next()
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            long r3 = r3.getNextExecuteNanoTime$okhttp()
            long r3 = r3 - r0
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L9f
            goto La3
        L9f:
            int r2 = r2 + 1
            goto L89
        La2:
            r2 = -1
        La3:
            if (r2 != r6) goto Lab
            java.util.List<okhttp3.internal.concurrent.Task> r12 = r10.futureTasks
            int r2 = r12.size()
        Lab:
            java.util.List<okhttp3.internal.concurrent.Task> r12 = r10.futureTasks
            r12.add(r2, r11)
            if (r2 != 0) goto Lb4
            r11 = 1
            return r11
        Lb4:
            return r5
    }

    public final void setActiveTask$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.concurrent.Task r1) {
            r0 = this;
            r0.activeTask = r1
            return
    }

    public final void setCancelActiveTask$okhttp(boolean r1) {
            r0 = this;
            r0.cancelActiveTask = r1
            return
    }

    public final void setShutdown$okhttp(boolean r1) {
            r0 = this;
            r0.shutdown = r1
            return
    }

    public final void shutdown() {
            r4 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r4.taskRunner
            boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r1 == 0) goto L34
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 != 0) goto Ld
            goto L34
        Ld:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Thread "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " MUST NOT hold lock on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L34:
            okhttp3.internal.concurrent.TaskRunner r0 = r4.taskRunner
            monitor-enter(r0)
            r1 = 1
            r4.shutdown = r1     // Catch: java.lang.Throwable -> L46
            boolean r1 = r4.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L48
            okhttp3.internal.concurrent.TaskRunner r1 = r4.taskRunner     // Catch: java.lang.Throwable -> L46
            r1.kickCoordinator$okhttp(r4)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L4c
        L48:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            return
        L4c:
            monitor-exit(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}

package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MoreExecutors {





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.MoreExecutors$5, reason: invalid class name */
    static class AnonymousClass5 implements java.util.concurrent.Executor {
        boolean thrownFromDelegate;
        final /* synthetic */ java.util.concurrent.Executor val$delegate;
        final /* synthetic */ com.google.common.util.concurrent.AbstractFuture val$future;


        AnonymousClass5(java.util.concurrent.Executor r1, com.google.common.util.concurrent.AbstractFuture r2) {
                r0 = this;
                r0.val$delegate = r1
                r0.val$future = r2
                r0.<init>()
                r1 = 1
                r0.thrownFromDelegate = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.val$delegate     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
                com.google.common.util.concurrent.MoreExecutors$5$1 r1 = new com.google.common.util.concurrent.MoreExecutors$5$1     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
                r1.<init>(r2, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
                r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
                return
            Lb:
                r3 = move-exception
                boolean r0 = r2.thrownFromDelegate
                if (r0 == 0) goto L15
                com.google.common.util.concurrent.AbstractFuture r0 = r2.val$future
                r0.setException(r3)
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    @com.google.common.annotations.GwtIncompatible
    static class Application {


        Application() {
                r0 = this;
                r0.<init>()
                return
        }

        final void addDelayedShutdownHook(java.util.concurrent.ExecutorService r8, long r9, java.util.concurrent.TimeUnit r11) {
                r7 = this;
                com.google.common.base.Preconditions.checkNotNull(r8)
                com.google.common.base.Preconditions.checkNotNull(r11)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DelayedShutdownHook-for-"
                r0.append(r1)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                com.google.common.util.concurrent.MoreExecutors$Application$1 r1 = new com.google.common.util.concurrent.MoreExecutors$Application$1
                r2 = r7
                r3 = r8
                r4 = r9
                r6 = r11
                r1.<init>(r2, r3, r4, r6)
                java.lang.Thread r8 = com.google.common.util.concurrent.MoreExecutors.newThread(r0, r1)
                r7.addShutdownHook(r8)
                return
        }

        @com.google.common.annotations.VisibleForTesting
        void addShutdownHook(java.lang.Thread r2) {
                r1 = this;
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                r0.addShutdownHook(r2)
                return
        }

        final java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor r4) {
                r3 = this;
                r0 = 120(0x78, double:5.93E-322)
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.ExecutorService r4 = r3.getExitingExecutorService(r4, r0, r2)
                return r4
        }

        final java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                com.google.common.util.concurrent.MoreExecutors.access$000(r2)
                java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r2)
                r1.addDelayedShutdownHook(r2, r3, r5)
                return r0
        }

        final java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor r4) {
                r3 = this;
                r0 = 120(0x78, double:5.93E-322)
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.ScheduledExecutorService r4 = r3.getExitingScheduledExecutorService(r4, r0, r2)
                return r4
        }

        final java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                com.google.common.util.concurrent.MoreExecutors.access$000(r2)
                java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r2)
                r1.addDelayedShutdownHook(r2, r3, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static final class DirectExecutorService extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.lang.Object lock;

        @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
        private int runningTasks;

        @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
        private boolean shutdown;

        private DirectExecutorService() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.lock = r0
                r0 = 0
                r1.runningTasks = r0
                r1.shutdown = r0
                return
        }

        /* synthetic */ DirectExecutorService(com.google.common.util.concurrent.MoreExecutors.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void endTask() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                int r1 = r2.runningTasks     // Catch: java.lang.Throwable -> L11
                int r1 = r1 + (-1)
                r2.runningTasks = r1     // Catch: java.lang.Throwable -> L11
                if (r1 != 0) goto L13
                java.lang.Object r1 = r2.lock     // Catch: java.lang.Throwable -> L11
                r1.notifyAll()     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r1 = move-exception
                goto L15
            L13:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r1
        }

        private void startTask() {
                r3 = this;
                java.lang.Object r0 = r3.lock
                monitor-enter(r0)
                boolean r1 = r3.shutdown     // Catch: java.lang.Throwable -> Lf
                if (r1 != 0) goto L11
                int r1 = r3.runningTasks     // Catch: java.lang.Throwable -> Lf
                int r1 = r1 + 1
                r3.runningTasks = r1     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r1 = move-exception
                goto L19
            L11:
                java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> Lf
                java.lang.String r2 = "Executor already shutdown"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
                throw r1     // Catch: java.lang.Throwable -> Lf
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long r5, java.util.concurrent.TimeUnit r7) throws java.lang.InterruptedException {
                r4 = this;
                long r5 = r7.toNanos(r5)
                java.lang.Object r7 = r4.lock
                monitor-enter(r7)
            L7:
                boolean r0 = r4.shutdown     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L14
                int r0 = r4.runningTasks     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                r5 = 1
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
                return r5
            L12:
                r5 = move-exception
                goto L2f
            L14:
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 > 0) goto L1d
                r5 = 0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
                return r5
            L1d:
                long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L12
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L12
                java.lang.Object r3 = r4.lock     // Catch: java.lang.Throwable -> L12
                r2.timedWait(r3, r5)     // Catch: java.lang.Throwable -> L12
                long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L12
                long r2 = r2 - r0
                long r5 = r5 - r2
                goto L7
            L2f:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
                throw r5
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r1) {
                r0 = this;
                r0.startTask()
                r1.run()     // Catch: java.lang.Throwable -> La
                r0.endTask()
                return
            La:
                r1 = move-exception
                r0.endTask()
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> Ld
                if (r1 == 0) goto Lf
                int r1 = r2.runningTasks     // Catch: java.lang.Throwable -> Ld
                if (r1 != 0) goto Lf
                r1 = 1
                goto L10
            Ld:
                r1 = move-exception
                goto L12
            Lf:
                r1 = 0
            L10:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return r1
            L12:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                r1 = 1
                r2.shutdown = r1     // Catch: java.lang.Throwable -> L10
                int r1 = r2.runningTasks     // Catch: java.lang.Throwable -> L10
                if (r1 != 0) goto L12
                java.lang.Object r1 = r2.lock     // Catch: java.lang.Throwable -> L10
                r1.notifyAll()     // Catch: java.lang.Throwable -> L10
                goto L12
            L10:
                r1 = move-exception
                goto L14
            L12:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r1
        }

        @Override // java.util.concurrent.ExecutorService
        public java.util.List<java.lang.Runnable> shutdownNow() {
                r1 = this;
                r1.shutdown()
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static class ListeningDecorator extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.util.concurrent.ExecutorService delegate;

        ListeningDecorator(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
                r0.delegate = r1
                return
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.delegate
                boolean r2 = r0.awaitTermination(r2, r4)
                return r2
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r2) {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.delegate
                r0.execute(r2)
                return
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.delegate
                boolean r0 = r0.isShutdown()
                return r0
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.delegate
                boolean r0 = r0.isTerminated()
                return r0
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.delegate
                r0.shutdown()
                return
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.List<java.lang.Runnable> shutdownNow() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.delegate
                java.util.List r0 = r0.shutdownNow()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static final class ScheduledListeningDecorator extends com.google.common.util.concurrent.MoreExecutors.ListeningDecorator implements com.google.common.util.concurrent.ListeningScheduledExecutorService {
        final java.util.concurrent.ScheduledExecutorService delegate;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class ListenableScheduledTask<V> extends com.google.common.util.concurrent.ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements com.google.common.util.concurrent.ListenableScheduledFuture<V> {
            private final java.util.concurrent.ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(com.google.common.util.concurrent.ListenableFuture<V> r1, java.util.concurrent.ScheduledFuture<?> r2) {
                    r0 = this;
                    r0.<init>(r1)
                    r0.scheduledDelegate = r2
                    return
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean r3) {
                    r2 = this;
                    boolean r0 = super.cancel(r3)
                    if (r0 == 0) goto Lb
                    java.util.concurrent.ScheduledFuture<?> r1 = r2.scheduledDelegate
                    r1.cancel(r3)
                Lb:
                    return r0
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
                    r0 = this;
                    java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
                    int r1 = r0.compareTo2(r1)
                    return r1
            }

            /* renamed from: compareTo, reason: avoid collision after fix types in other method */
            public int compareTo2(java.util.concurrent.Delayed r2) {
                    r1 = this;
                    java.util.concurrent.ScheduledFuture<?> r0 = r1.scheduledDelegate
                    int r2 = r0.compareTo(r2)
                    return r2
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(java.util.concurrent.TimeUnit r3) {
                    r2 = this;
                    java.util.concurrent.ScheduledFuture<?> r0 = r2.scheduledDelegate
                    long r0 = r0.getDelay(r3)
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.common.annotations.GwtIncompatible
        private static final class NeverSuccessfulListenableFutureTask extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<java.lang.Void> implements java.lang.Runnable {
            private final java.lang.Runnable delegate;

            public NeverSuccessfulListenableFutureTask(java.lang.Runnable r1) {
                    r0 = this;
                    r0.<init>()
                    java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                    java.lang.Runnable r1 = (java.lang.Runnable) r1
                    r0.delegate = r1
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    java.lang.Runnable r0 = r1.delegate     // Catch: java.lang.Throwable -> L6
                    r0.run()     // Catch: java.lang.Throwable -> L6
                    return
                L6:
                    r0 = move-exception
                    r1.setException(r0)
                    java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)
                    throw r0
            }
        }

        ScheduledListeningDecorator(java.util.concurrent.ScheduledExecutorService r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                r0 = 0
                com.google.common.util.concurrent.TrustedListenableFutureTask r2 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r2, r0)
                java.util.concurrent.ScheduledExecutorService r0 = r1.delegate
                java.util.concurrent.ScheduledFuture r3 = r0.schedule(r2, r3, r5)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r4 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r4.<init>(r2, r3)
                return r4
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                com.google.common.util.concurrent.TrustedListenableFutureTask r2 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r2)
                java.util.concurrent.ScheduledExecutorService r0 = r1.delegate
                java.util.concurrent.ScheduledFuture r3 = r0.schedule(r2, r3, r5)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r4 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r4.<init>(r2, r3)
                return r4
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.schedule(r1, r2, r4)
                return r1
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.schedule(r1, r2, r4)
                return r1
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
                r7 = this;
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask r1 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask
                r1.<init>(r8)
                java.util.concurrent.ScheduledExecutorService r0 = r7.delegate
                r2 = r9
                r4 = r11
                r6 = r13
                java.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r9 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r9.<init>(r1, r8)
                return r9
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
                return r1
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
                r7 = this;
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask r1 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask
                r1.<init>(r8)
                java.util.concurrent.ScheduledExecutorService r0 = r7.delegate
                r2 = r9
                r4 = r11
                r6 = r13
                java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask r9 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator$ListenableScheduledTask
                r9.<init>(r1, r8)
                return r9
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6) {
                r0 = this;
                com.google.common.util.concurrent.ListenableScheduledFuture r1 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
                return r1
        }
    }

    private MoreExecutors() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.util.concurrent.ThreadPoolExecutor r0) {
            useDaemonThreadFactory(r0)
            return
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService r1, long r2, java.util.concurrent.TimeUnit r4) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            r0.addDelayedShutdownHook(r1, r2, r4)
            return
    }

    public static java.util.concurrent.Executor directExecutor() {
            com.google.common.util.concurrent.DirectExecutor r0 = com.google.common.util.concurrent.DirectExecutor.INSTANCE
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor r1) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            java.util.concurrent.ExecutorService r1 = r0.getExitingExecutorService(r1)
            return r1
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor r1, long r2, java.util.concurrent.TimeUnit r4) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            java.util.concurrent.ExecutorService r1 = r0.getExitingExecutorService(r1, r2, r4)
            return r1
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor r1) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            java.util.concurrent.ScheduledExecutorService r1 = r0.getExitingScheduledExecutorService(r1)
            return r1
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor r1, long r2, java.util.concurrent.TimeUnit r4) {
            com.google.common.util.concurrent.MoreExecutors$Application r0 = new com.google.common.util.concurrent.MoreExecutors$Application
            r0.<init>()
            java.util.concurrent.ScheduledExecutorService r1 = r0.getExitingScheduledExecutorService(r1, r2, r4)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    static <T> T invokeAnyImpl(com.google.common.util.concurrent.ListeningExecutorService r16, java.util.Collection<? extends java.util.concurrent.Callable<T>> r17, boolean r18, long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = r16
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r21)
            int r0 = r17.size()
            r2 = 1
            if (r0 <= 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            com.google.common.base.Preconditions.checkArgument(r3)
            java.util.ArrayList r3 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)
            java.util.concurrent.LinkedBlockingQueue r4 = com.google.common.collect.Queues.newLinkedBlockingQueue()
            r5 = r19
            r7 = r21
            long r5 = r7.toNanos(r5)
            if (r18 == 0) goto L2f
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r0 = move-exception
            goto Lbb
        L2f:
            r7 = 0
        L31:
            java.util.Iterator r9 = r17.iterator()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Callable r10 = (java.util.concurrent.Callable) r10     // Catch: java.lang.Throwable -> L2c
            com.google.common.util.concurrent.ListenableFuture r10 = submitAndAddQueueListener(r1, r10, r4)     // Catch: java.lang.Throwable -> L2c
            r3.add(r10)     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + (-1)
            r10 = 0
            r12 = r10
            r11 = 1
        L47:
            java.lang.Object r13 = r4.poll()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2c
            if (r13 != 0) goto L62
            if (r0 <= 0) goto L66
            int r0 = r0 + (-1)
            java.lang.Object r14 = r9.next()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Callable r14 = (java.util.concurrent.Callable) r14     // Catch: java.lang.Throwable -> L2c
            com.google.common.util.concurrent.ListenableFuture r14 = submitAndAddQueueListener(r1, r14, r4)     // Catch: java.lang.Throwable -> L2c
            r3.add(r14)     // Catch: java.lang.Throwable -> L2c
            int r11 = r11 + 1
        L62:
            r14 = r7
        L63:
            r6 = r5
            r5 = r0
            goto L91
        L66:
            if (r11 != 0) goto L70
            if (r12 != 0) goto L6f
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L2c
        L6f:
            throw r12     // Catch: java.lang.Throwable -> L2c
        L70:
            if (r18 == 0) goto L8a
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r13 = r4.poll(r5, r13)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2c
            if (r13 == 0) goto L84
            long r14 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2c
            long r7 = r14 - r7
            long r5 = r5 - r7
            goto L63
        L84:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L8a:
            java.lang.Object r13 = r4.take()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2c
            goto L62
        L91:
            if (r13 == 0) goto Lb7
            int r11 = r11 + (-1)
            java.lang.Object r0 = r13.get()     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> Lae java.util.concurrent.ExecutionException -> Lb5
            java.util.Iterator r1 = r3.iterator()
        L9d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto L9d
        Lad:
            return r0
        Lae:
            r0 = move-exception
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            goto Lb7
        Lb5:
            r0 = move-exception
            r12 = r0
        Lb7:
            r0 = r5
            r5 = r6
            r7 = r14
            goto L47
        Lbb:
            java.util.Iterator r1 = r3.iterator()
        Lbf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto Lbf
        Lcf:
            throw r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static boolean isAppEngine() {
            java.lang.String r0 = "com.google.appengine.runtime.environment"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "getCurrentEnvironment"
            r3 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.util.concurrent.ListeningExecutorService listeningDecorator(java.util.concurrent.ExecutorService r1) {
            boolean r0 = r1 instanceof com.google.common.util.concurrent.ListeningExecutorService
            if (r0 == 0) goto L7
            com.google.common.util.concurrent.ListeningExecutorService r1 = (com.google.common.util.concurrent.ListeningExecutorService) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L13
            com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator r0 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r1)
            return r0
        L13:
            com.google.common.util.concurrent.MoreExecutors$ListeningDecorator r0 = new com.google.common.util.concurrent.MoreExecutors$ListeningDecorator
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator(java.util.concurrent.ScheduledExecutorService r1) {
            boolean r0 = r1 instanceof com.google.common.util.concurrent.ListeningScheduledExecutorService
            if (r0 == 0) goto L7
            com.google.common.util.concurrent.ListeningScheduledExecutorService r1 = (com.google.common.util.concurrent.ListeningScheduledExecutorService) r1
            return r1
        L7:
            com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator r0 = new com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.util.concurrent.ListeningExecutorService newDirectExecutorService() {
            com.google.common.util.concurrent.MoreExecutors$DirectExecutorService r0 = new com.google.common.util.concurrent.MoreExecutors$DirectExecutorService
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor r1) {
            com.google.common.util.concurrent.SequentialExecutor r0 = new com.google.common.util.concurrent.SequentialExecutor
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.lang.Thread newThread(java.lang.String r1, java.lang.Runnable r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.concurrent.ThreadFactory r0 = platformThreadFactory()
            java.lang.Thread r2 = r0.newThread(r2)
            r2.setName(r1)     // Catch: java.lang.SecurityException -> L11
        L11:
            return r2
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static java.util.concurrent.ThreadFactory platformThreadFactory() {
            boolean r0 = isAppEngine()
            if (r0 != 0) goto Lb
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            return r0
        Lb:
            java.lang.String r0 = "com.google.appengine.api.ThreadManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L29
            java.lang.String r1 = "currentRequestThreadFactory"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L29
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L29
            java.util.concurrent.ThreadFactory r0 = (java.util.concurrent.ThreadFactory) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.Throwable -> L29
            return r0
        L1f:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)
            throw r0
        L29:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't invoke ThreadManager.currentRequestThreadFactory"
            r1.<init>(r2, r0)
            throw r1
    }

    static java.util.concurrent.Executor rejectionPropagatingExecutor(java.util.concurrent.Executor r1, com.google.common.util.concurrent.AbstractFuture<?> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.concurrent.Executor r0 = directExecutor()
            if (r1 != r0) goto Ld
            return r1
        Ld:
            com.google.common.util.concurrent.MoreExecutors$5 r0 = new com.google.common.util.concurrent.MoreExecutors$5
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.util.concurrent.Executor renamingDecorator(java.util.concurrent.Executor r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = isAppEngine()
            if (r0 == 0) goto Ld
            return r1
        Ld:
            com.google.common.util.concurrent.MoreExecutors$2 r0 = new com.google.common.util.concurrent.MoreExecutors$2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.util.concurrent.ExecutorService renamingDecorator(java.util.concurrent.ExecutorService r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = isAppEngine()
            if (r0 == 0) goto Ld
            return r1
        Ld:
            com.google.common.util.concurrent.MoreExecutors$3 r0 = new com.google.common.util.concurrent.MoreExecutors$3
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.util.concurrent.ScheduledExecutorService renamingDecorator(java.util.concurrent.ScheduledExecutorService r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = isAppEngine()
            if (r0 == 0) goto Ld
            return r1
        Ld:
            com.google.common.util.concurrent.MoreExecutors$4 r0 = new com.google.common.util.concurrent.MoreExecutors$4
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService r2, long r3, java.util.concurrent.TimeUnit r5) {
            long r3 = r5.toNanos(r3)
            r0 = 2
            long r3 = r3 / r0
            r2.shutdown()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L19
            boolean r0 = r2.awaitTermination(r3, r5)     // Catch: java.lang.InterruptedException -> L19
            if (r0 != 0) goto L23
            r2.shutdownNow()     // Catch: java.lang.InterruptedException -> L19
            r2.awaitTermination(r3, r5)     // Catch: java.lang.InterruptedException -> L19
            goto L23
        L19:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            r2.shutdownNow()
        L23:
            boolean r2 = r2.isTerminated()
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    private static <T> com.google.common.util.concurrent.ListenableFuture<T> submitAndAddQueueListener(com.google.common.util.concurrent.ListeningExecutorService r0, java.util.concurrent.Callable<T> r1, java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>> r2) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.submit(r1)
            com.google.common.util.concurrent.MoreExecutors$1 r1 = new com.google.common.util.concurrent.MoreExecutors$1
            r1.<init>(r2, r0)
            java.util.concurrent.Executor r2 = directExecutor()
            r0.addListener(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static void useDaemonThreadFactory(java.util.concurrent.ThreadPoolExecutor r2) {
            com.google.common.util.concurrent.ThreadFactoryBuilder r0 = new com.google.common.util.concurrent.ThreadFactoryBuilder
            r0.<init>()
            r1 = 1
            com.google.common.util.concurrent.ThreadFactoryBuilder r0 = r0.setDaemon(r1)
            java.util.concurrent.ThreadFactory r1 = r2.getThreadFactory()
            com.google.common.util.concurrent.ThreadFactoryBuilder r0 = r0.setThreadFactory(r1)
            java.util.concurrent.ThreadFactory r0 = r0.build()
            r2.setThreadFactory(r0)
            return
    }
}

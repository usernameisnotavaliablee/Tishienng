package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractScheduledService implements com.google.common.util.concurrent.Service {
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.util.concurrent.AbstractService delegate;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static abstract class CustomScheduler extends com.google.common.util.concurrent.AbstractScheduledService.Scheduler {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class ReschedulableCallable extends com.google.common.util.concurrent.ForwardingFuture<java.lang.Void> implements java.util.concurrent.Callable<java.lang.Void> {

            @org.checkerframework.checker.nullness.compatqual.NullableDecl
            @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
            private java.util.concurrent.Future<java.lang.Void> currentFuture;
            private final java.util.concurrent.ScheduledExecutorService executor;
            private final java.util.concurrent.locks.ReentrantLock lock;
            private final com.google.common.util.concurrent.AbstractService service;
            final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler this$0;
            private final java.lang.Runnable wrappedRunnable;

            ReschedulableCallable(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler r1, com.google.common.util.concurrent.AbstractService r2, java.util.concurrent.ScheduledExecutorService r3, java.lang.Runnable r4) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
                    r1.<init>()
                    r0.lock = r1
                    r0.wrappedRunnable = r4
                    r0.executor = r3
                    r0.service = r2
                    return
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                    r1 = this;
                    java.lang.Void r0 = r1.call2()
                    return r0
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: avoid collision after fix types in other method */
            public java.lang.Void call2() throws java.lang.Exception {
                    r1 = this;
                    java.lang.Runnable r0 = r1.wrappedRunnable
                    r0.run()
                    r1.reschedule()
                    r0 = 0
                    return r0
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean r2) {
                    r1 = this;
                    java.util.concurrent.locks.ReentrantLock r0 = r1.lock
                    r0.lock()
                    java.util.concurrent.Future<java.lang.Void> r0 = r1.currentFuture     // Catch: java.lang.Throwable -> L11
                    boolean r2 = r0.cancel(r2)     // Catch: java.lang.Throwable -> L11
                    java.util.concurrent.locks.ReentrantLock r0 = r1.lock
                    r0.unlock()
                    return r2
                L11:
                    r2 = move-exception
                    java.util.concurrent.locks.ReentrantLock r0 = r1.lock
                    r0.unlock()
                    throw r2
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
            protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                    r1 = this;
                    java.util.concurrent.Future r0 = r1.delegate()
                    return r0
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
            protected java.util.concurrent.Future<java.lang.Void> delegate() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Only cancel and isCancelled is supported by this future"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean isCancelled() {
                    r2 = this;
                    java.util.concurrent.locks.ReentrantLock r0 = r2.lock
                    r0.lock()
                    java.util.concurrent.Future<java.lang.Void> r0 = r2.currentFuture     // Catch: java.lang.Throwable -> L11
                    boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L11
                    java.util.concurrent.locks.ReentrantLock r1 = r2.lock
                    r1.unlock()
                    return r0
                L11:
                    r0 = move-exception
                    java.util.concurrent.locks.ReentrantLock r1 = r2.lock
                    r1.unlock()
                    throw r0
            }

            public void reschedule() {
                    r4 = this;
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler r0 = r4.this$0     // Catch: java.lang.Throwable -> L3c
                    com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$Schedule r0 = r0.getNextSchedule()     // Catch: java.lang.Throwable -> L3c
                    java.util.concurrent.locks.ReentrantLock r1 = r4.lock
                    r1.lock()
                    java.util.concurrent.Future<java.lang.Void> r1 = r4.currentFuture     // Catch: java.lang.Throwable -> L16
                    if (r1 == 0) goto L18
                    boolean r1 = r1.isCancelled()     // Catch: java.lang.Throwable -> L16
                    if (r1 != 0) goto L28
                    goto L18
                L16:
                    r0 = move-exception
                    goto L2f
                L18:
                    java.util.concurrent.ScheduledExecutorService r1 = r4.executor     // Catch: java.lang.Throwable -> L16
                    long r2 = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule.access$800(r0)     // Catch: java.lang.Throwable -> L16
                    java.util.concurrent.TimeUnit r0 = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule.access$900(r0)     // Catch: java.lang.Throwable -> L16
                    java.util.concurrent.ScheduledFuture r0 = r1.schedule(r4, r2, r0)     // Catch: java.lang.Throwable -> L16
                    r4.currentFuture = r0     // Catch: java.lang.Throwable -> L16
                L28:
                    java.util.concurrent.locks.ReentrantLock r0 = r4.lock
                    r0.unlock()
                    r0 = 0
                    goto L34
                L2f:
                    java.util.concurrent.locks.ReentrantLock r1 = r4.lock
                    r1.unlock()
                L34:
                    if (r0 == 0) goto L3b
                    com.google.common.util.concurrent.AbstractService r1 = r4.service
                    r1.notifyFailed(r0)
                L3b:
                    return
                L3c:
                    r0 = move-exception
                    com.google.common.util.concurrent.AbstractService r1 = r4.service
                    r1.notifyFailed(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.common.annotations.Beta
        protected static final class Schedule {
            private final long delay;
            private final java.util.concurrent.TimeUnit unit;

            public Schedule(long r1, java.util.concurrent.TimeUnit r3) {
                    r0 = this;
                    r0.<init>()
                    r0.delay = r1
                    java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
                    java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
                    r0.unit = r1
                    return
            }

            static /* synthetic */ long access$800(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule r2) {
                    long r0 = r2.delay
                    return r0
            }

            static /* synthetic */ java.util.concurrent.TimeUnit access$900(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule r0) {
                    java.util.concurrent.TimeUnit r0 = r0.unit
                    return r0
            }
        }

        public CustomScheduler() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        protected abstract com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule getNextSchedule() throws java.lang.Exception;

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        final java.util.concurrent.Future<?> schedule(com.google.common.util.concurrent.AbstractService r2, java.util.concurrent.ScheduledExecutorService r3, java.lang.Runnable r4) {
                r1 = this;
                com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$ReschedulableCallable r0 = new com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$ReschedulableCallable
                r0.<init>(r1, r2, r3, r4)
                r0.reschedule()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Scheduler {



        private Scheduler() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Scheduler(com.google.common.util.concurrent.AbstractScheduledService.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(long r8, long r10, java.util.concurrent.TimeUnit r12) {
                com.google.common.base.Preconditions.checkNotNull(r12)
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                java.lang.String r1 = "delay must be > 0, found %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r10)
                com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1 r2 = new com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1
                r3 = r8
                r5 = r10
                r7 = r12
                r2.<init>(r3, r5, r7)
                return r2
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(long r8, long r10, java.util.concurrent.TimeUnit r12) {
                com.google.common.base.Preconditions.checkNotNull(r12)
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                java.lang.String r1 = "period must be > 0, found %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r10)
                com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2 r2 = new com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2
                r3 = r8
                r5 = r10
                r7 = r12
                r2.<init>(r3, r5, r7)
                return r2
        }

        abstract java.util.concurrent.Future<?> schedule(com.google.common.util.concurrent.AbstractService r1, java.util.concurrent.ScheduledExecutorService r2, java.lang.Runnable r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ServiceDelegate extends com.google.common.util.concurrent.AbstractService {

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private volatile java.util.concurrent.ScheduledExecutorService executorService;
        private final java.util.concurrent.locks.ReentrantLock lock;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private volatile java.util.concurrent.Future<?> runningTask;
        private final java.lang.Runnable task;
        final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService this$0;




        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class Task implements java.lang.Runnable {
            final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate this$1;

            Task(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r5 = this;
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r0)
                    r0.lock()
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1     // Catch: java.lang.Throwable -> L27
                    java.util.concurrent.Future r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$300(r0)     // Catch: java.lang.Throwable -> L27
                    boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L27
                    if (r0 == 0) goto L1f
                L15:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r0)
                    r0.unlock()
                    return
                L1f:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1     // Catch: java.lang.Throwable -> L27
                    com.google.common.util.concurrent.AbstractScheduledService r0 = r0.this$0     // Catch: java.lang.Throwable -> L27
                    r0.runOneIteration()     // Catch: java.lang.Throwable -> L27
                    goto L15
                L27:
                    r0 = move-exception
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r1 = r5.this$1     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                    com.google.common.util.concurrent.AbstractScheduledService r1 = r1.this$0     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                    r1.shutDown()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                    goto L3e
                L30:
                    r0 = move-exception
                    goto L4e
                L32:
                    r1 = move-exception
                    java.util.logging.Logger r2 = com.google.common.util.concurrent.AbstractScheduledService.access$400()     // Catch: java.lang.Throwable -> L30
                    java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L30
                    java.lang.String r4 = "Error while attempting to shut down the service after failure."
                    r2.log(r3, r4, r1)     // Catch: java.lang.Throwable -> L30
                L3e:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r1 = r5.this$1     // Catch: java.lang.Throwable -> L30
                    r1.notifyFailed(r0)     // Catch: java.lang.Throwable -> L30
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = r5.this$1     // Catch: java.lang.Throwable -> L30
                    java.util.concurrent.Future r0 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$300(r0)     // Catch: java.lang.Throwable -> L30
                    r1 = 0
                    r0.cancel(r1)     // Catch: java.lang.Throwable -> L30
                    goto L15
                L4e:
                    com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r1 = r5.this$1
                    java.util.concurrent.locks.ReentrantLock r1 = com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.access$200(r1)
                    r1.unlock()
                    throw r0
            }
        }

        private ServiceDelegate(com.google.common.util.concurrent.AbstractScheduledService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
                r1.<init>()
                r0.lock = r1
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$Task r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$Task
                r1.<init>(r0)
                r0.task = r1
                return
        }

        /* synthetic */ ServiceDelegate(com.google.common.util.concurrent.AbstractScheduledService r1, com.google.common.util.concurrent.AbstractScheduledService.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ java.util.concurrent.locks.ReentrantLock access$200(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.util.concurrent.locks.ReentrantLock r0 = r0.lock
                return r0
        }

        static /* synthetic */ java.util.concurrent.Future access$300(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.util.concurrent.Future<?> r0 = r0.runningTask
                return r0
        }

        static /* synthetic */ java.util.concurrent.Future access$302(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0, java.util.concurrent.Future r1) {
                r0.runningTask = r1
                return r1
        }

        static /* synthetic */ java.util.concurrent.ScheduledExecutorService access$600(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.util.concurrent.ScheduledExecutorService r0 = r0.executorService
                return r0
        }

        static /* synthetic */ java.lang.Runnable access$700(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate r0) {
                java.lang.Runnable r0 = r0.task
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
                r2 = this;
                com.google.common.util.concurrent.AbstractScheduledService r0 = r2.this$0
                java.util.concurrent.ScheduledExecutorService r0 = r0.executor()
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1 r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1
                r1.<init>(r2)
                java.util.concurrent.ScheduledExecutorService r0 = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(r0, r1)
                r2.executorService = r0
                java.util.concurrent.ScheduledExecutorService r0 = r2.executorService
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2 r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
                r2 = this;
                java.util.concurrent.Future<?> r0 = r2.runningTask
                r1 = 0
                r0.cancel(r1)
                java.util.concurrent.ScheduledExecutorService r0 = r2.executorService
                com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3 r1 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
                r1 = this;
                com.google.common.util.concurrent.AbstractScheduledService r0 = r1.this$0
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.AbstractScheduledService> r0 = com.google.common.util.concurrent.AbstractScheduledService.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AbstractScheduledService.logger = r0
            return
    }

    protected AbstractScheduledService() {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate r0 = new com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate
            r1 = 0
            r0.<init>(r2, r1)
            r2.delegate = r0
            return
    }

    static /* synthetic */ java.util.logging.Logger access$400() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AbstractScheduledService.logger
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.AbstractService access$500(com.google.common.util.concurrent.AbstractScheduledService r0) {
            com.google.common.util.concurrent.AbstractService r0 = r0.delegate
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitRunning()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitRunning(r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitTerminated()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.awaitTerminated(r2, r4)
            return
    }

    protected java.util.concurrent.ScheduledExecutorService executor() {
            r3 = this;
            com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl r0 = new com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl
            r0.<init>(r3)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            com.google.common.util.concurrent.AbstractScheduledService$1 r1 = new com.google.common.util.concurrent.AbstractScheduledService$1
            r1.<init>(r3, r0)
            java.util.concurrent.Executor r2 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r3.addListener(r1, r2)
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            java.lang.Throwable r0 = r0.failureCause()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            boolean r0 = r0.isRunning()
            return r0
    }

    protected abstract void runOneIteration() throws java.lang.Exception;

    protected abstract com.google.common.util.concurrent.AbstractScheduledService.Scheduler scheduler();

    protected java.lang.String serviceName() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    protected void shutDown() throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.startAsync()
            return r1
    }

    protected void startUp() throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            com.google.common.util.concurrent.Service$State r0 = r0.state()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service stopAsync() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService r0 = r1.delegate
            r0.stopAsync()
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.serviceName()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            com.google.common.util.concurrent.Service$State r1 = r2.state()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

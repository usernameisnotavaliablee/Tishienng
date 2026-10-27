package androidx.camera.core.impl.utils.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class HandlerScheduledExecutorService extends java.util.concurrent.AbstractExecutorService implements java.util.concurrent.ScheduledExecutorService {
    private static java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> sThreadLocalInstance;
    private final android.os.Handler mHandler;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class HandlerScheduledFuture<V> implements java.util.concurrent.RunnableScheduledFuture<V> {
        final java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V>> mCompleter;
        private final com.google.common.util.concurrent.ListenableFuture<V> mDelegate;
        private final long mRunAtMillis;
        private final java.util.concurrent.Callable<V> mTask;


        HandlerScheduledFuture(android.os.Handler r3, long r4, java.util.concurrent.Callable<V> r6) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r1 = 0
                r0.<init>(r1)
                r2.mCompleter = r0
                r2.mRunAtMillis = r4
                r2.mTask = r6
                androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture$1 r4 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture$1
                r4.<init>(r2, r3, r6)
                com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r4)
                r2.mDelegate = r3
                return
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean r2) {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
                boolean r2 = r0.cancel(r2)
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
                r0 = this;
                java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(java.util.concurrent.Delayed r6) {
                r5 = this;
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r1 = r5.getDelay(r0)
                long r3 = r6.getDelay(r0)
                int r6 = java.lang.Long.compare(r1, r3)
                return r6
        }

        @Override // java.util.concurrent.Future
        public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // java.util.concurrent.Future
        public V get(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
                java.lang.Object r2 = r0.get(r2, r4)
                return r2
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit r5) {
                r4 = this;
                long r0 = r4.mRunAtMillis
                long r2 = java.lang.System.currentTimeMillis()
                long r0 = r0 - r2
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r0 = r5.convert(r0, r2)
                return r0
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
                boolean r0 = r0.isDone()
                return r0
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<V>> r0 = r2.mCompleter
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
                if (r0 == 0) goto L19
                java.util.concurrent.Callable<V> r1 = r2.mTask     // Catch: java.lang.Exception -> L15
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> L15
                r0.set(r1)     // Catch: java.lang.Exception -> L15
                return
            L15:
                r1 = move-exception
                r0.setException(r1)
            L19:
                return
        }
    }

    static {
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$1 r0 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$1
            r0.<init>()
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.sThreadLocalInstance = r0
            return
    }

    HandlerScheduledExecutorService(@androidx.annotation.NonNull android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.mHandler = r1
            return
    }

    private java.util.concurrent.RejectedExecutionException createPostFailedException() {
            r3 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.os.Handler r2 = r3.mHandler
            r1.append(r2)
            java.lang.String r2 = " is shutting down"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

    static java.util.concurrent.ScheduledExecutorService currentThreadExecutor() {
            java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> r0 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.sThreadLocalInstance
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 != 0) goto L28
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L20
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService r1 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            r1.<init>(r2)
            java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> r0 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.sThreadLocalInstance
            r0.set(r1)
            return r1
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Current thread has no looper!"
            r0.<init>(r1)
            throw r0
        L28:
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService> r3 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.class
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " cannot be shut down. Use Looper.quitSafely()."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            boolean r2 = r0.post(r2)
            if (r2 == 0) goto L9
            return
        L9:
            java.util.concurrent.RejectedExecutionException r2 = r1.createPostFailedException()
            throw r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> schedule(@androidx.annotation.NonNull java.lang.Runnable r2, long r3, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r5) {
            r1 = this;
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$2 r0 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$2
            r0.<init>(r1, r2)
            java.util.concurrent.ScheduledFuture r2 = r1.schedule(r0, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @androidx.annotation.NonNull
    public <V> java.util.concurrent.ScheduledFuture<V> schedule(@androidx.annotation.NonNull java.util.concurrent.Callable<V> r4, long r5, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r7) {
            r3 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r2.convert(r5, r7)
            long r0 = r0 + r5
            androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture r5 = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture
            android.os.Handler r6 = r3.mHandler
            r5.<init>(r6, r0, r4)
            android.os.Handler r4 = r3.mHandler
            boolean r4 = r4.postAtTime(r5, r0)
            if (r4 == 0) goto L1b
            return r5
        L1b:
            java.util.concurrent.RejectedExecutionException r4 = r3.createPostFailedException()
            java.util.concurrent.ScheduledFuture r4 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedScheduledFuture(r4)
            return r4
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @androidx.annotation.NonNull
    public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(@androidx.annotation.NonNull java.lang.Runnable r1, long r2, long r4, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService> r3 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.class
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " does not yet support fixed-rate scheduling."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @androidx.annotation.NonNull
    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(@androidx.annotation.NonNull java.lang.Runnable r1, long r2, long r4, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r6) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService> r3 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.class
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " does not yet support fixed-delay scheduling."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService> r2 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " cannot be shut down. Use Looper.quitSafely()."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.ExecutorService
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService> r2 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " cannot be shut down. Use Looper.quitSafely()."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}

package androidx.camera.core.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ChainingListenableFuture<I, O> extends androidx.camera.core.impl.utils.futures.FutureChain<O> implements java.lang.Runnable {

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> mFunction;

    @androidx.annotation.Nullable
    private com.google.common.util.concurrent.ListenableFuture<? extends I> mInputFuture;
    private final java.util.concurrent.BlockingQueue<java.lang.Boolean> mMayInterruptIfRunningChannel;
    private final java.util.concurrent.CountDownLatch mOutputCreated;

    @androidx.annotation.Nullable
    volatile com.google.common.util.concurrent.ListenableFuture<? extends O> mOutputFuture;


    ChainingListenableFuture(@androidx.annotation.NonNull androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> r3, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<? extends I> r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 1
            r0.<init>(r1)
            r2.mMayInterruptIfRunningChannel = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            r2.mOutputCreated = r0
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.camera.core.impl.utils.futures.AsyncFunction r3 = (androidx.camera.core.impl.utils.futures.AsyncFunction) r3
            r2.mFunction = r3
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r4)
            com.google.common.util.concurrent.ListenableFuture r3 = (com.google.common.util.concurrent.ListenableFuture) r3
            r2.mInputFuture = r3
            return
    }

    private void cancel(@androidx.annotation.Nullable java.util.concurrent.Future<?> r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.cancel(r2)
        L5:
            return
    }

    private <E> void putUninterruptibly(@androidx.annotation.NonNull java.util.concurrent.BlockingQueue<E> r2, @androidx.annotation.NonNull E r3) {
            r1 = this;
            r0 = 0
        L1:
            r2.put(r3)     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L19
            if (r0 == 0) goto Ld
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        Ld:
            return
        Le:
            r2 = move-exception
            if (r0 == 0) goto L18
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L18:
            throw r2
        L19:
            r0 = 1
            goto L1
    }

    private <E> E takeUninterruptibly(@androidx.annotation.NonNull java.util.concurrent.BlockingQueue<E> r2) {
            r1 = this;
            r0 = 0
        L1:
            java.lang.Object r2 = r2.take()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r2
        Lf:
            r2 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r2
        L1a:
            r0 = 1
            goto L1
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain
    public boolean cancel(boolean r3) {
            r2 = this;
            boolean r0 = super.cancel(r3)
            if (r0 == 0) goto L1b
            java.util.concurrent.BlockingQueue<java.lang.Boolean> r0 = r2.mMayInterruptIfRunningChannel
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r2.putUninterruptibly(r0, r1)
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r2.mInputFuture
            r2.cancel(r0, r3)
            com.google.common.util.concurrent.ListenableFuture<? extends O> r0 = r2.mOutputFuture
            r2.cancel(r0, r3)
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain
    @androidx.annotation.Nullable
    public O get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r1.isDone()
            if (r0 != 0) goto L19
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r1.mInputFuture
            if (r0 == 0) goto Ld
            r0.get()
        Ld:
            java.util.concurrent.CountDownLatch r0 = r1.mOutputCreated
            r0.await()
            com.google.common.util.concurrent.ListenableFuture<? extends O> r0 = r1.mOutputFuture
            if (r0 == 0) goto L19
            r0.get()
        L19:
            java.lang.Object r0 = super.get()
            return r0
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain
    @androidx.annotation.Nullable
    public O get(long r8, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r10) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r7 = this;
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L4a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            if (r10 == r0) goto Lf
            long r8 = r0.convert(r8, r10)
            r10 = r0
        Lf:
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r7.mInputFuture
            r1 = 0
            if (r0 == 0) goto L26
            long r3 = java.lang.System.nanoTime()
            r0.get(r8, r10)
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            long r3 = java.lang.Math.max(r1, r5)
            long r8 = r8 - r3
        L26:
            long r3 = java.lang.System.nanoTime()
            java.util.concurrent.CountDownLatch r0 = r7.mOutputCreated
            boolean r0 = r0.await(r8, r10)
            if (r0 == 0) goto L44
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            long r0 = java.lang.Math.max(r1, r5)
            long r8 = r8 - r0
            com.google.common.util.concurrent.ListenableFuture<? extends O> r0 = r7.mOutputFuture
            if (r0 == 0) goto L4a
            r0.get(r8, r10)
            goto L4a
        L44:
            java.util.concurrent.TimeoutException r8 = new java.util.concurrent.TimeoutException
            r8.<init>()
            throw r8
        L4a:
            java.lang.Object r8 = super.get(r8, r10)
            return r8
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture<? extends I> r1 = r4.mInputFuture     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36 java.util.concurrent.ExecutionException -> L45 java.util.concurrent.CancellationException -> L4e
            java.lang.Object r1 = androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36 java.util.concurrent.ExecutionException -> L45 java.util.concurrent.CancellationException -> L4e
            androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> r2 = r4.mFunction     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            com.google.common.util.concurrent.ListenableFuture r1 = r2.apply(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            r4.mOutputFuture = r1     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            boolean r2 = r4.isCancelled()     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            if (r2 == 0) goto L38
            java.util.concurrent.BlockingQueue<java.lang.Boolean> r2 = r4.mMayInterruptIfRunningChannel     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            java.lang.Object r2 = r4.takeUninterruptibly(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            r4.mOutputFuture = r0     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
        L26:
            r4.mFunction = r0
            r4.mInputFuture = r0
            java.util.concurrent.CountDownLatch r0 = r4.mOutputCreated
            r0.countDown()
            return
        L30:
            r1 = move-exception
            goto L6d
        L32:
            r1 = move-exception
            goto L53
        L34:
            r1 = move-exception
            goto L60
        L36:
            r1 = move-exception
            goto L64
        L38:
            androidx.camera.core.impl.utils.futures.ChainingListenableFuture$1 r2 = new androidx.camera.core.impl.utils.futures.ChainingListenableFuture$1     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            r1.addListener(r2, r3)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            goto L26
        L45:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            r4.setException(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            goto L26
        L4e:
            r1 = 0
            r4.cancel(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Error -> L32 java.lang.Exception -> L34 java.lang.reflect.UndeclaredThrowableException -> L36
            goto L26
        L53:
            r4.setException(r1)     // Catch: java.lang.Throwable -> L30
        L56:
            r4.mFunction = r0
            r4.mInputFuture = r0
            java.util.concurrent.CountDownLatch r0 = r4.mOutputCreated
            r0.countDown()
            goto L6c
        L60:
            r4.setException(r1)     // Catch: java.lang.Throwable -> L30
            goto L56
        L64:
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L30
            r4.setException(r1)     // Catch: java.lang.Throwable -> L30
            goto L56
        L6c:
            return
        L6d:
            r4.mFunction = r0
            r4.mInputFuture = r0
            java.util.concurrent.CountDownLatch r0 = r4.mOutputCreated
            r0.countDown()
            throw r1
    }
}

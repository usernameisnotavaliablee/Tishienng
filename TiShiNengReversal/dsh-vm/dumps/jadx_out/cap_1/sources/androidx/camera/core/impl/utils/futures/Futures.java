package androidx.camera.core.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Futures {
    private static final androidx.arch.core.util.Function<?, ?> IDENTITY_FUNCTION = null;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CallbackListener<V> implements java.lang.Runnable {
        final androidx.camera.core.impl.utils.futures.FutureCallback<? super V> mCallback;
        final java.util.concurrent.Future<V> mFuture;

        CallbackListener(java.util.concurrent.Future<V> r1, androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r2) {
                r0 = this;
                r0.<init>()
                r0.mFuture = r1
                r0.mCallback = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Future<V> r0 = r2.mFuture     // Catch: java.lang.Error -> Lc java.lang.RuntimeException -> Le java.util.concurrent.ExecutionException -> L10
                java.lang.Object r0 = androidx.camera.core.impl.utils.futures.Futures.getDone(r0)     // Catch: java.lang.Error -> Lc java.lang.RuntimeException -> Le java.util.concurrent.ExecutionException -> L10
                androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r1 = r2.mCallback
                r1.onSuccess(r0)
                return
            Lc:
                r0 = move-exception
                goto L12
            Le:
                r0 = move-exception
                goto L12
            L10:
                r0 = move-exception
                goto L18
            L12:
                androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r1 = r2.mCallback
                r1.onFailure(r0)
                return
            L18:
                java.lang.Throwable r1 = r0.getCause()
                if (r1 != 0) goto L24
                androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r1 = r2.mCallback
                r1.onFailure(r0)
                goto L29
            L24:
                androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r0 = r2.mCallback
                r0.onFailure(r1)
            L29:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<androidx.camera.core.impl.utils.futures.Futures$CallbackListener> r1 = androidx.camera.core.impl.utils.futures.Futures.CallbackListener.class
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ","
                r0.append(r1)
                androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r1 = r2.mCallback
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            androidx.camera.core.impl.utils.futures.Futures$2 r0 = new androidx.camera.core.impl.utils.futures.Futures$2
            r0.<init>()
            androidx.camera.core.impl.utils.futures.Futures.IDENTITY_FUNCTION = r0
            return
    }

    private Futures() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object a(com.google.common.util.concurrent.ListenableFuture r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            androidx.arch.core.util.Function<?, ?> r0 = androidx.camera.core.impl.utils.futures.Futures.IDENTITY_FUNCTION
            r1 = 0
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            propagateTransform(r1, r3, r0, r4, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "nonCancellationPropagating["
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = "]"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
    }

    public static <V> void addCallback(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<V> r1, @androidx.annotation.NonNull androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.core.impl.utils.futures.Futures$CallbackListener r0 = new androidx.camera.core.impl.utils.futures.Futures$CallbackListener
            r0.<init>(r1, r2)
            r1.addListener(r0, r3)
            return
    }

    @androidx.annotation.NonNull
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(@androidx.annotation.NonNull java.util.Collection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3) {
            androidx.camera.core.impl.utils.futures.ListFuture r0 = new androidx.camera.core.impl.utils.futures.ListFuture
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r3 = 1
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r0.<init>(r1, r3, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static <V> V getDone(@androidx.annotation.NonNull java.util.concurrent.Future<V> r3) throws java.util.concurrent.ExecutionException {
            boolean r0 = r3.isDone()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Future was expected to be done, "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.lang.Object r3 = getUninterruptibly(r3)
            return r3
    }

    @androidx.annotation.Nullable
    public static <V> V getUninterruptibly(@androidx.annotation.NonNull java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    @androidx.annotation.NonNull
    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(@androidx.annotation.NonNull java.lang.Throwable r1) {
            androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture r0 = new androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static <V> java.util.concurrent.ScheduledFuture<V> immediateFailedScheduledFuture(@androidx.annotation.NonNull java.lang.Throwable r1) {
            androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedScheduledFuture r0 = new androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedScheduledFuture
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(@androidx.annotation.Nullable V r1) {
            if (r1 != 0) goto L7
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.ImmediateFuture.nullFuture()
            return r1
        L7:
            androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateSuccessfulFuture r0 = new androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateSuccessfulFuture
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<V> r1) {
            androidx.core.util.Preconditions.checkNotNull(r1)
            boolean r0 = r1.isDone()
            if (r0 == 0) goto La
            return r1
        La:
            androidx.camera.core.impl.utils.futures.a r0 = new androidx.camera.core.impl.utils.futures.a
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r1
    }

    public static <V> void propagate(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<V> r2, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> r3) {
            androidx.arch.core.util.Function<?, ?> r0 = androidx.camera.core.impl.utils.futures.Futures.IDENTITY_FUNCTION
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            propagateTransform(r2, r0, r3, r1)
            return
    }

    public static <I, O> void propagateTransform(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<I> r1, @androidx.annotation.NonNull androidx.arch.core.util.Function<? super I, ? extends O> r2, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<O> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r0 = 1
            propagateTransform(r0, r1, r2, r3, r4)
            return
    }

    private static <I, O> void propagateTransform(boolean r1, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<I> r2, @androidx.annotation.NonNull androidx.arch.core.util.Function<? super I, ? extends O> r3, @androidx.annotation.NonNull androidx.concurrent.futures.CallbackToFutureAdapter.Completer<O> r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.core.util.Preconditions.checkNotNull(r4)
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.camera.core.impl.utils.futures.Futures$3 r0 = new androidx.camera.core.impl.utils.futures.Futures$3
            r0.<init>(r4, r3)
            addCallback(r2, r0, r5)
            if (r1 == 0) goto L22
            androidx.camera.core.impl.utils.futures.Futures$4 r1 = new androidx.camera.core.impl.utils.futures.Futures$4
            r1.<init>(r2)
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r4.addCancellationListener(r1, r2)
        L22:
            return
    }

    @androidx.annotation.NonNull
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(@androidx.annotation.NonNull java.util.Collection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3) {
            androidx.camera.core.impl.utils.futures.ListFuture r0 = new androidx.camera.core.impl.utils.futures.ListFuture
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r3 = 0
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r0.<init>(r1, r3, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transform(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<I> r1, @androidx.annotation.NonNull androidx.arch.core.util.Function<? super I, ? extends O> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.camera.core.impl.utils.futures.Futures$1 r0 = new androidx.camera.core.impl.utils.futures.Futures$1
            r0.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r1 = transformAsync(r1, r0, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<I> r1, @androidx.annotation.NonNull androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            androidx.camera.core.impl.utils.futures.ChainingListenableFuture r0 = new androidx.camera.core.impl.utils.futures.ChainingListenableFuture
            r0.<init>(r2, r1)
            r1.addListener(r0, r3)
            return r0
    }
}

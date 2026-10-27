package androidx.camera.core.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ListFuture<V> implements com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> {
    private final boolean mAllMustSucceed;

    @androidx.annotation.Nullable
    java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> mFutures;

    @androidx.annotation.NonNull
    private final java.util.concurrent.atomic.AtomicInteger mRemaining;

    @androidx.annotation.NonNull
    private final com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> mResult;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<V>> mResultNotifier;

    @androidx.annotation.Nullable
    java.util.List<V> mValues;




    ListFuture(@androidx.annotation.NonNull java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3, boolean r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
            java.util.List r0 = (java.util.List) r0
            r2.mFutures = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            r2.mValues = r0
            r2.mAllMustSucceed = r4
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            int r3 = r3.size()
            r4.<init>(r3)
            r2.mRemaining = r4
            androidx.camera.core.impl.utils.futures.ListFuture$1 r3 = new androidx.camera.core.impl.utils.futures.ListFuture$1
            r3.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r3)
            r2.mResult = r3
            r2.init(r5)
            return
    }

    private void callAllGets() throws java.lang.InterruptedException {
            r3 = this;
            java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r0 = r3.mFutures
            if (r0 == 0) goto L2d
            boolean r1 = r3.isDone()
            if (r1 != 0) goto L2d
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
        L1a:
            boolean r2 = r1.isDone()
            if (r2 != 0) goto Le
            r1.get()     // Catch: java.lang.Throwable -> L24 java.lang.InterruptedException -> L29 java.lang.Error -> L2b
            goto L1a
        L24:
            boolean r2 = r3.mAllMustSucceed
            if (r2 == 0) goto L1a
            goto L2d
        L29:
            r0 = move-exception
            throw r0
        L2b:
            r0 = move-exception
            throw r0
        L2d:
            return
    }

    private void init(@androidx.annotation.NonNull java.util.concurrent.Executor r5) {
            r4 = this;
            androidx.camera.core.impl.utils.futures.ListFuture$2 r0 = new androidx.camera.core.impl.utils.futures.ListFuture$2
            r0.<init>(r4)
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r4.addListener(r0, r1)
            java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r0 = r4.mFutures
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r5 = r4.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<V> r1 = r4.mValues
            r0.<init>(r1)
            r5.set(r0)
            return
        L21:
            r0 = 0
            r1 = 0
        L23:
            java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r2 = r4.mFutures
            int r2 = r2.size()
            if (r1 >= r2) goto L34
            java.util.List<V> r2 = r4.mValues
            r3 = 0
            r2.add(r3)
            int r1 = r1 + 1
            goto L23
        L34:
            java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r1 = r4.mFutures
        L36:
            int r2 = r1.size()
            if (r0 >= r2) goto L4d
            java.lang.Object r2 = r1.get(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            androidx.camera.core.impl.utils.futures.ListFuture$3 r3 = new androidx.camera.core.impl.utils.futures.ListFuture$3
            r3.<init>(r4, r0, r2)
            r2.addListener(r3, r5)
            int r0 = r0 + 1
            goto L36
        L4d:
            return
    }

    public void addListener(@androidx.annotation.NonNull java.lang.Runnable r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> r0 = r1.mResult
            r0.addListener(r2, r3)
            return
    }

    public boolean cancel(boolean r3) {
            r2 = this;
            java.util.List<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r0 = r2.mFutures
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r1.cancel(r3)
            goto L8
        L18:
            com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> r0 = r2.mResult
            boolean r3 = r0.cancel(r3)
            return r3
    }

    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r1 = this;
            java.util.List r0 = r1.m14get()
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r0 = this;
            java.util.List r1 = r0.m15get(r1, r3)
            return r1
    }

    @androidx.annotation.Nullable
    /* renamed from: get, reason: collision with other method in class */
    public java.util.List<V> m14get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            r1.callAllGets()
            com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> r0 = r1.mResult
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.util.List<V> m15get(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> r0 = r1.mResult
            java.lang.Object r2 = r0.get(r2, r4)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public boolean isCancelled() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> r0 = r1.mResult
            boolean r0 = r0.isCancelled()
            return r0
    }

    public boolean isDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> r0 = r1.mResult
            boolean r0 = r0.isDone()
            return r0
    }

    void setOneValue(int r7, @androidx.annotation.NonNull java.util.concurrent.Future<? extends V> r8) {
            r6 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List<V> r1 = r6.mValues
            boolean r2 = r6.isDone()
            if (r2 != 0) goto L111
            if (r1 != 0) goto Le
            goto L111
        Le:
            r2 = 1
            r3 = 0
            boolean r4 = r8.isDone()     // Catch: java.lang.Throwable -> L46 java.lang.Error -> L49 java.lang.RuntimeException -> L4b java.util.concurrent.ExecutionException -> L4d java.util.concurrent.CancellationException -> Lc8
            java.lang.String r5 = "Tried to set value from future which is not done"
            androidx.core.util.Preconditions.checkState(r4, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Error -> L49 java.lang.RuntimeException -> L4b java.util.concurrent.ExecutionException -> L4d java.util.concurrent.CancellationException -> Lc8
            java.lang.Object r8 = androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(r8)     // Catch: java.lang.Throwable -> L46 java.lang.Error -> L49 java.lang.RuntimeException -> L4b java.util.concurrent.ExecutionException -> L4d java.util.concurrent.CancellationException -> Lc8
            r1.set(r7, r8)     // Catch: java.lang.Throwable -> L46 java.lang.Error -> L49 java.lang.RuntimeException -> L4b java.util.concurrent.ExecutionException -> L4d java.util.concurrent.CancellationException -> Lc8
            java.util.concurrent.atomic.AtomicInteger r7 = r6.mRemaining
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            androidx.core.util.Preconditions.checkState(r2, r0)
            if (r7 != 0) goto Lea
            java.util.List<V> r7 = r6.mValues
            if (r7 == 0) goto L3e
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            r8.set(r0)
            return
        L3e:
            boolean r7 = r6.isDone()
            androidx.core.util.Preconditions.checkState(r7)
            return
        L46:
            r7 = move-exception
            goto Leb
        L49:
            r7 = move-exception
            goto L4f
        L4b:
            r7 = move-exception
            goto L7c
        L4d:
            r7 = move-exception
            goto La0
        L4f:
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier     // Catch: java.lang.Throwable -> L46
            r8.setException(r7)     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r7 = r6.mRemaining
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            androidx.core.util.Preconditions.checkState(r2, r0)
            if (r7 != 0) goto Lea
            java.util.List<V> r7 = r6.mValues
            if (r7 == 0) goto L73
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
        L6e:
            r8.set(r0)
            goto Lea
        L73:
            boolean r7 = r6.isDone()
            androidx.core.util.Preconditions.checkState(r7)
            goto Lea
        L7c:
            boolean r8 = r6.mAllMustSucceed     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L85
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier     // Catch: java.lang.Throwable -> L46
            r8.setException(r7)     // Catch: java.lang.Throwable -> L46
        L85:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.mRemaining
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L8e
            goto L8f
        L8e:
            r2 = 0
        L8f:
            androidx.core.util.Preconditions.checkState(r2, r0)
            if (r7 != 0) goto Lea
            java.util.List<V> r7 = r6.mValues
            if (r7 == 0) goto L73
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L6e
        La0:
            boolean r8 = r6.mAllMustSucceed     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto Lad
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r7.getCause()     // Catch: java.lang.Throwable -> L46
            r8.setException(r7)     // Catch: java.lang.Throwable -> L46
        Lad:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.mRemaining
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto Lb6
            goto Lb7
        Lb6:
            r2 = 0
        Lb7:
            androidx.core.util.Preconditions.checkState(r2, r0)
            if (r7 != 0) goto Lea
            java.util.List<V> r7 = r6.mValues
            if (r7 == 0) goto L73
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L6e
        Lc8:
            boolean r7 = r6.mAllMustSucceed     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto Lcf
            r6.cancel(r3)     // Catch: java.lang.Throwable -> L46
        Lcf:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.mRemaining
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto Ld8
            goto Ld9
        Ld8:
            r2 = 0
        Ld9:
            androidx.core.util.Preconditions.checkState(r2, r0)
            if (r7 != 0) goto Lea
            java.util.List<V> r7 = r6.mValues
            if (r7 == 0) goto L73
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r8 = r6.mResultNotifier
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L6e
        Lea:
            return
        Leb:
            java.util.concurrent.atomic.AtomicInteger r8 = r6.mRemaining
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto Lf4
            goto Lf5
        Lf4:
            r2 = 0
        Lf5:
            androidx.core.util.Preconditions.checkState(r2, r0)
            if (r8 != 0) goto L110
            java.util.List<V> r8 = r6.mValues
            if (r8 == 0) goto L109
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.util.List<V>> r0 = r6.mResultNotifier
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r0.set(r1)
            goto L110
        L109:
            boolean r8 = r6.isDone()
            androidx.core.util.Preconditions.checkState(r8)
        L110:
            throw r7
        L111:
            boolean r7 = r6.mAllMustSucceed
            java.lang.String r8 = "Future was done before all dependencies completed"
            androidx.core.util.Preconditions.checkState(r7, r8)
            return
    }
}

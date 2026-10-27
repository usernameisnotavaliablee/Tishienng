package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Futures extends com.google.common.util.concurrent.GwtFuturesCatchingSpecialization {




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CallbackListener<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.FutureCallback<? super V> callback;
        final java.util.concurrent.Future<V> future;

        CallbackListener(java.util.concurrent.Future<V> r1, com.google.common.util.concurrent.FutureCallback<? super V> r2) {
                r0 = this;
                r0.<init>()
                r0.future = r1
                r0.callback = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Future<V> r0 = r2.future     // Catch: java.lang.Error -> Lc java.lang.RuntimeException -> Le java.util.concurrent.ExecutionException -> L10
                java.lang.Object r0 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Error -> Lc java.lang.RuntimeException -> Le java.util.concurrent.ExecutionException -> L10
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
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
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                r1.onFailure(r0)
                return
            L18:
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                java.lang.Throwable r0 = r0.getCause()
                r1.onFailure(r0)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r2)
                com.google.common.util.concurrent.FutureCallback<? super V> r1 = r2.callback
                com.google.common.base.MoreObjects$ToStringHelper r0 = r0.addValue(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtCompatible
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> futures;


        private FutureCombiner(boolean r1, com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> r2) {
                r0 = this;
                r0.<init>()
                r0.allMustSucceed = r1
                r0.futures = r2
                return
        }

        /* synthetic */ FutureCombiner(boolean r1, com.google.common.collect.ImmutableList r2, com.google.common.util.concurrent.Futures.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <C> com.google.common.util.concurrent.ListenableFuture<C> call(java.util.concurrent.Callable<C> r4, java.util.concurrent.Executor r5) {
                r3 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = new com.google.common.util.concurrent.CombinedFuture
                com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> r1 = r3.futures
                boolean r2 = r3.allMustSucceed
                r0.<init>(r1, r2, r5, r4)
                return r0
        }

        public <C> com.google.common.util.concurrent.ListenableFuture<C> callAsync(com.google.common.util.concurrent.AsyncCallable<C> r4, java.util.concurrent.Executor r5) {
                r3 = this;
                com.google.common.util.concurrent.CombinedFuture r0 = new com.google.common.util.concurrent.CombinedFuture
                com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> r1 = r3.futures
                boolean r2 = r3.allMustSucceed
                r0.<init>(r1, r2, r5, r4)
                return r0
        }

        public com.google.common.util.concurrent.ListenableFuture<?> run(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.Futures$FutureCombiner$1 r0 = new com.google.common.util.concurrent.Futures$FutureCombiner$1
                r0.<init>(r1, r2)
                com.google.common.util.concurrent.ListenableFuture r2 = r1.call(r0, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InCompletionOrderFuture<T> extends com.google.common.util.concurrent.AbstractFuture<T> {
        private com.google.common.util.concurrent.Futures.InCompletionOrderState<T> state;

        private InCompletionOrderFuture(com.google.common.util.concurrent.Futures.InCompletionOrderState<T> r1) {
                r0 = this;
                r0.<init>()
                r0.state = r1
                return
        }

        /* synthetic */ InCompletionOrderFuture(com.google.common.util.concurrent.Futures.InCompletionOrderState r1, com.google.common.util.concurrent.Futures.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
                r1 = this;
                r0 = 0
                r1.state = r0
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean r3) {
                r2 = this;
                com.google.common.util.concurrent.Futures$InCompletionOrderState<T> r0 = r2.state
                boolean r1 = super.cancel(r3)
                if (r1 == 0) goto Ld
                com.google.common.util.concurrent.Futures.InCompletionOrderState.access$400(r0, r3)
                r3 = 1
                return r3
            Ld:
                r3 = 0
                return r3
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected java.lang.String pendingToString() {
                r3 = this;
                com.google.common.util.concurrent.Futures$InCompletionOrderState<T> r0 = r3.state
                if (r0 == 0) goto L30
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "inputCount=["
                r1.append(r2)
                com.google.common.util.concurrent.ListenableFuture[] r2 = com.google.common.util.concurrent.Futures.InCompletionOrderState.access$500(r0)
                int r2 = r2.length
                r1.append(r2)
                java.lang.String r2 = "], remaining=["
                r1.append(r2)
                java.util.concurrent.atomic.AtomicInteger r0 = com.google.common.util.concurrent.Futures.InCompletionOrderState.access$600(r0)
                int r0 = r0.get()
                r1.append(r0)
                java.lang.String r0 = "]"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L30:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final java.util.concurrent.atomic.AtomicInteger incompleteOutputCount;
        private final com.google.common.util.concurrent.ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        private InCompletionOrderState(com.google.common.util.concurrent.ListenableFuture<? extends T>[] r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.wasCancelled = r0
                r1 = 1
                r2.shouldInterrupt = r1
                r2.delegateIndex = r0
                r2.inputFutures = r3
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                int r3 = r3.length
                r0.<init>(r3)
                r2.incompleteOutputCount = r0
                return
        }

        /* synthetic */ InCompletionOrderState(com.google.common.util.concurrent.ListenableFuture[] r1, com.google.common.util.concurrent.Futures.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void access$300(com.google.common.util.concurrent.Futures.InCompletionOrderState r0, com.google.common.collect.ImmutableList r1, int r2) {
                r0.recordInputCompletion(r1, r2)
                return
        }

        static /* synthetic */ void access$400(com.google.common.util.concurrent.Futures.InCompletionOrderState r0, boolean r1) {
                r0.recordOutputCancellation(r1)
                return
        }

        static /* synthetic */ com.google.common.util.concurrent.ListenableFuture[] access$500(com.google.common.util.concurrent.Futures.InCompletionOrderState r0) {
                com.google.common.util.concurrent.ListenableFuture<? extends T>[] r0 = r0.inputFutures
                return r0
        }

        static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$600(com.google.common.util.concurrent.Futures.InCompletionOrderState r0) {
                java.util.concurrent.atomic.AtomicInteger r0 = r0.incompleteOutputCount
                return r0
        }

        private void recordCompletion() {
                r5 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r5.incompleteOutputCount
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1e
                boolean r0 = r5.wasCancelled
                if (r0 == 0) goto L1e
                com.google.common.util.concurrent.ListenableFuture<? extends T>[] r0 = r5.inputFutures
                int r1 = r0.length
                r2 = 0
            L10:
                if (r2 >= r1) goto L1e
                r3 = r0[r2]
                if (r3 == 0) goto L1b
                boolean r4 = r5.shouldInterrupt
                r3.cancel(r4)
            L1b:
                int r2 = r2 + 1
                goto L10
            L1e:
                return
        }

        private void recordInputCompletion(com.google.common.collect.ImmutableList<com.google.common.util.concurrent.AbstractFuture<T>> r4, int r5) {
                r3 = this;
                com.google.common.util.concurrent.ListenableFuture<? extends T>[] r0 = r3.inputFutures
                r1 = r0[r5]
                r2 = 0
                r0[r5] = r2
                int r5 = r3.delegateIndex
            L9:
                int r0 = r4.size()
                if (r5 >= r0) goto L26
                java.lang.Object r0 = r4.get(r5)
                com.google.common.util.concurrent.AbstractFuture r0 = (com.google.common.util.concurrent.AbstractFuture) r0
                boolean r0 = r0.setFuture(r1)
                if (r0 == 0) goto L23
                r3.recordCompletion()
                int r5 = r5 + 1
                r3.delegateIndex = r5
                return
            L23:
                int r5 = r5 + 1
                goto L9
            L26:
                int r4 = r4.size()
                r3.delegateIndex = r4
                return
        }

        private void recordOutputCancellation(boolean r2) {
                r1 = this;
                r0 = 1
                r1.wasCancelled = r0
                if (r2 != 0) goto L8
                r2 = 0
                r1.shouldInterrupt = r2
            L8:
                r1.recordCompletion()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static class MappingCheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.AbstractCheckedFuture<V, X> {
        final com.google.common.base.Function<? super java.lang.Exception, X> mapper;

        MappingCheckedFuture(com.google.common.util.concurrent.ListenableFuture<V> r1, com.google.common.base.Function<? super java.lang.Exception, X> r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.mapper = r1
                return
        }

        @Override // com.google.common.util.concurrent.AbstractCheckedFuture
        protected X mapException(java.lang.Exception r2) {
                r1 = this;
                com.google.common.base.Function<? super java.lang.Exception, X extends java.lang.Exception> r0 = r1.mapper
                java.lang.Object r2 = r0.apply(r2)
                java.lang.Exception r2 = (java.lang.Exception) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NonCancellationPropagatingFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> implements java.lang.Runnable {
        private com.google.common.util.concurrent.ListenableFuture<V> delegate;

        NonCancellationPropagatingFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
                r1 = this;
                r0 = 0
                r1.delegate = r0
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected java.lang.String pendingToString() {
                r3 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r3.delegate
                if (r0 == 0) goto L1b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "delegate=["
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "]"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L1b:
                r0 = 0
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.delegate
                if (r0 == 0) goto L7
                r1.setFuture(r0)
            L7:
                return
        }
    }

    private Futures() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> r1, com.google.common.util.concurrent.FutureCallback<? super V> r2, java.util.concurrent.Executor r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.Futures$CallbackListener r0 = new com.google.common.util.concurrent.Futures$CallbackListener
            r0.<init>(r1, r2)
            r1.addListener(r0, r3)
            return
    }

    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r2) {
            com.google.common.util.concurrent.CollectionFuture$ListFuture r0 = new com.google.common.util.concurrent.CollectionFuture$ListFuture
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.SafeVarargs
    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... r2) {
            com.google.common.util.concurrent.CollectionFuture$ListFuture r0 = new com.google.common.util.concurrent.CollectionFuture$ListFuture
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.util.concurrent.Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @com.google.common.annotations.Beta
    public static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> r0, java.lang.Class<X> r1, com.google.common.base.Function<? super X, ? extends V> r2, java.util.concurrent.Executor r3) {
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.common.util.concurrent.AbstractCatchingFuture.create(r0, r1, r2, r3)
            return r0
    }

    @com.google.common.util.concurrent.Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @com.google.common.annotations.Beta
    public static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> r0, java.lang.Class<X> r1, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> r2, java.util.concurrent.Executor r3) {
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.common.util.concurrent.AbstractCatchingFuture.create(r0, r1, r2, r3)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> r0, java.lang.Class<X> r1) throws java.lang.Exception {
            java.lang.Object r0 = com.google.common.util.concurrent.FuturesGetChecked.getChecked(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> r0, java.lang.Class<X> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.lang.Exception {
            java.lang.Object r0 = com.google.common.util.concurrent.FuturesGetChecked.getChecked(r0, r1, r2, r4)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <V> V getDone(java.util.concurrent.Future<V> r2) throws java.util.concurrent.ExecutionException {
            boolean r0 = r2.isDone()
            java.lang.String r1 = "Future was expected to be done: %s"
            com.google.common.base.Preconditions.checkState(r0, r1, r2)
            java.lang.Object r2 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <V> V getUnchecked(java.util.concurrent.Future<V> r0) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r0)     // Catch: java.util.concurrent.ExecutionException -> L8
            return r0
        L8:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            wrapAndThrowUnchecked(r0)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateCancelledFuture() {
            com.google.common.util.concurrent.ImmediateFuture$ImmediateCancelledFuture r0 = new com.google.common.util.concurrent.ImmediateFuture$ImmediateCancelledFuture
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static <V, X extends java.lang.Exception> com.google.common.util.concurrent.CheckedFuture<V, X> immediateCheckedFuture(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
            com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulCheckedFuture r0 = new com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulCheckedFuture
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static <V, X extends java.lang.Exception> com.google.common.util.concurrent.CheckedFuture<V, X> immediateFailedCheckedFuture(X r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ImmediateFuture$ImmediateFailedCheckedFuture r0 = new com.google.common.util.concurrent.ImmediateFuture$ImmediateFailedCheckedFuture
            r0.<init>(r1)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ImmediateFuture$ImmediateFailedFuture r0 = new com.google.common.util.concurrent.ImmediateFuture$ImmediateFailedFuture
            r0.<init>(r1)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
            if (r1 != 0) goto L5
            com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulFuture<java.lang.Object> r1 = com.google.common.util.concurrent.ImmediateFuture.ImmediateSuccessfulFuture.NULL
            return r1
        L5:
            com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulFuture r0 = new com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulFuture
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> r6) {
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L7
            java.util.Collection r6 = (java.util.Collection) r6
            goto Lb
        L7:
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf(r6)
        Lb:
            int r0 = r6.size()
            com.google.common.util.concurrent.ListenableFuture[] r0 = new com.google.common.util.concurrent.ListenableFuture[r0]
            java.lang.Object[] r6 = r6.toArray(r0)
            com.google.common.util.concurrent.ListenableFuture[] r6 = (com.google.common.util.concurrent.ListenableFuture[]) r6
            com.google.common.util.concurrent.ListenableFuture[] r6 = (com.google.common.util.concurrent.ListenableFuture[]) r6
            com.google.common.util.concurrent.Futures$InCompletionOrderState r0 = new com.google.common.util.concurrent.Futures$InCompletionOrderState
            r1 = 0
            r0.<init>(r6, r1)
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            r3 = 0
            r4 = 0
        L25:
            int r5 = r6.length
            if (r4 >= r5) goto L33
            com.google.common.util.concurrent.Futures$InCompletionOrderFuture r5 = new com.google.common.util.concurrent.Futures$InCompletionOrderFuture
            r5.<init>(r0, r1)
            r2.add(r5)
            int r4 = r4 + 1
            goto L25
        L33:
            com.google.common.collect.ImmutableList r1 = r2.build()
        L37:
            int r2 = r6.length
            if (r3 >= r2) goto L4b
            r2 = r6[r3]
            com.google.common.util.concurrent.Futures$3 r4 = new com.google.common.util.concurrent.Futures$3
            r4.<init>(r0, r1, r3)
            java.util.concurrent.Executor r5 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r4, r5)
            int r3 = r3 + 1
            goto L37
        L4b:
            return r1
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <I, O> java.util.concurrent.Future<O> lazyTransform(java.util.concurrent.Future<I> r1, com.google.common.base.Function<? super I, ? extends O> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.Futures$2 r0 = new com.google.common.util.concurrent.Futures$2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    @java.lang.Deprecated
    public static <V, X extends java.lang.Exception> com.google.common.util.concurrent.CheckedFuture<V, X> makeChecked(com.google.common.util.concurrent.ListenableFuture<V> r1, com.google.common.base.Function<? super java.lang.Exception, X> r2) {
            com.google.common.util.concurrent.Futures$MappingCheckedFuture r0 = new com.google.common.util.concurrent.Futures$MappingCheckedFuture
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> r2) {
            boolean r0 = r2.isDone()
            if (r0 == 0) goto L7
            return r2
        L7:
            com.google.common.util.concurrent.Futures$NonCancellationPropagatingFuture r0 = new com.google.common.util.concurrent.Futures$NonCancellationPropagatingFuture
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <O> com.google.common.util.concurrent.ListenableFuture<O> scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> r0, long r1, java.util.concurrent.TimeUnit r3, java.util.concurrent.ScheduledExecutorService r4) {
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r0)
            java.util.concurrent.ScheduledFuture r1 = r4.schedule(r0, r1, r3)
            com.google.common.util.concurrent.Futures$1 r2 = new com.google.common.util.concurrent.Futures$1
            r2.<init>(r1)
            java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r0.addListener(r2, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <O> com.google.common.util.concurrent.ListenableFuture<O> submitAsync(com.google.common.util.concurrent.AsyncCallable<O> r0, java.util.concurrent.Executor r1) {
            com.google.common.util.concurrent.TrustedListenableFutureTask r0 = com.google.common.util.concurrent.TrustedListenableFutureTask.create(r0)
            r1.execute(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r2) {
            com.google.common.util.concurrent.CollectionFuture$ListFuture r0 = new com.google.common.util.concurrent.CollectionFuture$ListFuture
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.SafeVarargs
    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... r2) {
            com.google.common.util.concurrent.CollectionFuture$ListFuture r0 = new com.google.common.util.concurrent.CollectionFuture$ListFuture
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> r0, com.google.common.base.Function<? super I, ? extends O> r1, java.util.concurrent.Executor r2) {
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.common.util.concurrent.AbstractTransformFuture.create(r0, r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> r0, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> r1, java.util.concurrent.Executor r2) {
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.common.util.concurrent.AbstractTransformFuture.create(r0, r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3) {
            com.google.common.util.concurrent.Futures$FutureCombiner r0 = new com.google.common.util.concurrent.Futures$FutureCombiner
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r3)
            r1 = 0
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @java.lang.SafeVarargs
    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllComplete(com.google.common.util.concurrent.ListenableFuture<? extends V>... r3) {
            com.google.common.util.concurrent.Futures$FutureCombiner r0 = new com.google.common.util.concurrent.Futures$FutureCombiner
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r3)
            r1 = 0
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3) {
            com.google.common.util.concurrent.Futures$FutureCombiner r0 = new com.google.common.util.concurrent.Futures$FutureCombiner
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r3)
            r1 = 0
            r2 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    @java.lang.SafeVarargs
    @com.google.common.annotations.Beta
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllSucceed(com.google.common.util.concurrent.ListenableFuture<? extends V>... r3) {
            com.google.common.util.concurrent.Futures$FutureCombiner r0 = new com.google.common.util.concurrent.Futures$FutureCombiner
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r3)
            r1 = 0
            r2 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> r1, long r2, java.util.concurrent.TimeUnit r4, java.util.concurrent.ScheduledExecutorService r5) {
            boolean r0 = r1.isDone()
            if (r0 == 0) goto L7
            return r1
        L7:
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.TimeoutFuture.create(r1, r2, r4, r5)
            return r1
    }

    private static void wrapAndThrowUnchecked(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 == 0) goto Lc
            com.google.common.util.concurrent.ExecutionError r0 = new com.google.common.util.concurrent.ExecutionError
            java.lang.Error r1 = (java.lang.Error) r1
            r0.<init>(r1)
            throw r0
        Lc:
            com.google.common.util.concurrent.UncheckedExecutionException r0 = new com.google.common.util.concurrent.UncheckedExecutionException
            r0.<init>(r1)
            throw r0
    }
}

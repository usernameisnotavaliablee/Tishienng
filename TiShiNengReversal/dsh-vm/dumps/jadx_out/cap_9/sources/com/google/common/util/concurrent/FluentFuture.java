package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class FluentFuture<V> extends com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization<V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.FluentFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        TrustedFuture() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                super.addListener(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final boolean cancel(boolean r1) {
                r0 = this;
                boolean r1 = super.cancel(r1)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                java.lang.Object r0 = super.get()
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final V get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r0 = this;
                java.lang.Object r1 = super.get(r1, r3)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
                r1 = this;
                boolean r0 = super.isCancelled()
                return r0
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
                r1 = this;
                boolean r0 = super.isDone()
                return r0
        }
    }

    FluentFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> com.google.common.util.concurrent.FluentFuture<V> from(com.google.common.util.concurrent.ListenableFuture<V> r1) {
            boolean r0 = r1 instanceof com.google.common.util.concurrent.FluentFuture
            if (r0 == 0) goto L7
            com.google.common.util.concurrent.FluentFuture r1 = (com.google.common.util.concurrent.FluentFuture) r1
            return r1
        L7:
            com.google.common.util.concurrent.ForwardingFluentFuture r0 = new com.google.common.util.concurrent.ForwardingFluentFuture
            r0.<init>(r1)
            return r0
    }

    public final void addCallback(com.google.common.util.concurrent.FutureCallback<? super V> r1, java.util.concurrent.Executor r2) {
            r0 = this;
            com.google.common.util.concurrent.Futures.addCallback(r0, r1, r2)
            return
    }

    @com.google.common.util.concurrent.Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.FluentFuture<V> catching(java.lang.Class<X> r1, com.google.common.base.Function<? super X, ? extends V> r2, java.util.concurrent.Executor r3) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.catching(r0, r1, r2, r3)
            com.google.common.util.concurrent.FluentFuture r1 = (com.google.common.util.concurrent.FluentFuture) r1
            return r1
    }

    @com.google.common.util.concurrent.Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.FluentFuture<V> catchingAsync(java.lang.Class<X> r1, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> r2, java.util.concurrent.Executor r3) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.catchingAsync(r0, r1, r2, r3)
            com.google.common.util.concurrent.FluentFuture r1 = (com.google.common.util.concurrent.FluentFuture) r1
            return r1
    }

    public final <T> com.google.common.util.concurrent.FluentFuture<T> transform(com.google.common.base.Function<? super V, T> r1, java.util.concurrent.Executor r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.transform(r0, r1, r2)
            com.google.common.util.concurrent.FluentFuture r1 = (com.google.common.util.concurrent.FluentFuture) r1
            return r1
    }

    public final <T> com.google.common.util.concurrent.FluentFuture<T> transformAsync(com.google.common.util.concurrent.AsyncFunction<? super V, T> r1, java.util.concurrent.Executor r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.transformAsync(r0, r1, r2)
            com.google.common.util.concurrent.FluentFuture r1 = (com.google.common.util.concurrent.FluentFuture) r1
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.util.concurrent.FluentFuture<V> withTimeout(long r1, java.util.concurrent.TimeUnit r3, java.util.concurrent.ScheduledExecutorService r4) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.withTimeout(r0, r1, r3, r4)
            com.google.common.util.concurrent.FluentFuture r1 = (com.google.common.util.concurrent.FluentFuture) r1
            return r1
    }
}

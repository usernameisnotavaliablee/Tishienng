package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final java.util.logging.Logger log = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ImmediateCancelledFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        ImmediateCancelledFuture() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.cancel(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    static class ImmediateFailedCheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.ImmediateFuture<V> implements com.google.common.util.concurrent.CheckedFuture<V, X> {
        private final X thrown;

        ImmediateFailedCheckedFuture(X r1) {
                r0 = this;
                r0.<init>()
                r0.thrown = r1
                return
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet() throws java.lang.Exception {
                r1 = this;
                X extends java.lang.Exception r0 = r1.thrown
                throw r0
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.Exception {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                X extends java.lang.Exception r1 = r0.thrown
                throw r1
        }

        @Override // com.google.common.util.concurrent.ImmediateFuture, java.util.concurrent.Future
        public V get() throws java.util.concurrent.ExecutionException {
                r2 = this;
                java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
                X extends java.lang.Exception r1 = r2.thrown
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "[status=FAILURE, cause=["
                r0.append(r1)
                X extends java.lang.Exception r1 = r2.thrown
                r0.append(r1)
                java.lang.String r1 = "]]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ImmediateFailedFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        ImmediateFailedFuture(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.setException(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    static class ImmediateSuccessfulCheckedFuture<V, X extends java.lang.Exception> extends com.google.common.util.concurrent.ImmediateFuture<V> implements com.google.common.util.concurrent.CheckedFuture<V, X> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final V value;

        ImmediateSuccessfulCheckedFuture(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet(long r1, java.util.concurrent.TimeUnit r3) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                V r1 = r0.value
                return r1
        }

        @Override // com.google.common.util.concurrent.ImmediateFuture, java.util.concurrent.Future
        public V get() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "[status=SUCCESS, result=["
                r0.append(r1)
                V r1 = r2.value
                r0.append(r1)
                java.lang.String r1 = "]]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ImmediateSuccessfulFuture<V> extends com.google.common.util.concurrent.ImmediateFuture<V> {
        static final com.google.common.util.concurrent.ImmediateFuture.ImmediateSuccessfulFuture<java.lang.Object> NULL = null;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final V value;

        static {
                com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulFuture r0 = new com.google.common.util.concurrent.ImmediateFuture$ImmediateSuccessfulFuture
                r1 = 0
                r0.<init>(r1)
                com.google.common.util.concurrent.ImmediateFuture.ImmediateSuccessfulFuture.NULL = r0
                return
        }

        ImmediateSuccessfulFuture(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // com.google.common.util.concurrent.ImmediateFuture, java.util.concurrent.Future
        public V get() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "[status=SUCCESS, result=["
                r0.append(r1)
                V r1 = r2.value
                r0.append(r1)
                java.lang.String r1 = "]]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ImmediateFuture> r0 = com.google.common.util.concurrent.ImmediateFuture.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ImmediateFuture.log = r0
            return
    }

    ImmediateFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r6, java.util.concurrent.Executor r7) {
            r5 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            java.lang.String r0 = "Executor was null."
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            r7.execute(r6)     // Catch: java.lang.RuntimeException -> Le
            return
        Le:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.ImmediateFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RuntimeException while executing runnable "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " with executor "
            r3.append(r6)
            r3.append(r7)
            java.lang.String r6 = r3.toString()
            r1.log(r2, r6, r0)
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws java.util.concurrent.ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.ExecutionException {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Object r1 = r0.get()
            return r1
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            r0 = 1
            return r0
    }
}

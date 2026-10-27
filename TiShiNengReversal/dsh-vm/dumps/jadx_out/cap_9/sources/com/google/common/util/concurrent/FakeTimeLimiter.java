package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FakeTimeLimiter implements com.google.common.util.concurrent.TimeLimiter {
    public FakeTimeLimiter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.ExecutionException {
            r0 = this;
            java.lang.Object r1 = r0.callWithTimeout(r1, r2, r4)
            return r1
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T callWithTimeout(java.util.concurrent.Callable<T> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.ExecutionException {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> Lb java.lang.Error -> L12 java.lang.Exception -> L19 java.lang.RuntimeException -> L20
            return r1
        Lb:
            r1 = move-exception
            java.util.concurrent.ExecutionException r2 = new java.util.concurrent.ExecutionException
            r2.<init>(r1)
            throw r2
        L12:
            r1 = move-exception
            com.google.common.util.concurrent.ExecutionError r2 = new com.google.common.util.concurrent.ExecutionError
            r2.<init>(r1)
            throw r2
        L19:
            r1 = move-exception
            java.util.concurrent.ExecutionException r2 = new java.util.concurrent.ExecutionException
            r2.<init>(r1)
            throw r2
        L20:
            r1 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r2 = new com.google.common.util.concurrent.UncheckedExecutionException
            r2.<init>(r1)
            throw r2
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T r1, java.lang.Class<T> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r5)
            return r1
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.runWithTimeout(r1, r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r4)
            r1.run()     // Catch: java.lang.Throwable -> La java.lang.Error -> L11 java.lang.RuntimeException -> L18
            return
        La:
            r1 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r2 = new com.google.common.util.concurrent.UncheckedExecutionException
            r2.<init>(r1)
            throw r2
        L11:
            r1 = move-exception
            com.google.common.util.concurrent.ExecutionError r2 = new com.google.common.util.concurrent.ExecutionError
            r2.<init>(r1)
            throw r2
        L18:
            r1 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r2 = new com.google.common.util.concurrent.UncheckedExecutionException
            r2.<init>(r1)
            throw r2
    }
}

package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DisposeOnCancel implements java.util.concurrent.Future<java.lang.Object> {
    final io.reactivex.disposables.Disposable d;

    DisposeOnCancel(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r1) {
            r0 = this;
            io.reactivex.disposables.Disposable r1 = r0.d
            r1.dispose()
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            r1 = 0
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
            r0 = 0
            return r0
    }
}

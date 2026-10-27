package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DeferredScalarDisposable<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final io.reactivex.Observer<? super T> actual;
    protected T value;

    public DeferredScalarDisposable(io.reactivex.Observer<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
            r1 = this;
            r0 = 32
            r1.lazySet(r0)
            r0 = 0
            r1.value = r0
            return
    }

    public final void complete() {
            r1 = this;
            int r0 = r1.get()
            r0 = r0 & 54
            if (r0 == 0) goto L9
            return
        L9:
            r0 = 2
            r1.lazySet(r0)
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onComplete()
            return
    }

    public final void complete(T r3) {
            r2 = this;
            int r0 = r2.get()
            r1 = r0 & 54
            if (r1 == 0) goto L9
            goto L28
        L9:
            r1 = 8
            if (r0 != r1) goto L15
            r2.value = r3
            r0 = 16
            r2.lazySet(r0)
            goto L19
        L15:
            r0 = 2
            r2.lazySet(r0)
        L19:
            io.reactivex.Observer<? super T> r0 = r2.actual
            r0.onNext(r3)
            int r3 = r2.get()
            r1 = 4
            if (r3 == r1) goto L28
            r0.onComplete()
        L28:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            r0 = 4
            r1.set(r0)
            r0 = 0
            r1.value = r0
            return
    }

    public final void error(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.get()
            r0 = r0 & 54
            if (r0 == 0) goto Lc
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
        Lc:
            r0 = 2
            r1.lazySet(r0)
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r2 = this;
            int r0 = r2.get()
            r1 = 4
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.get()
            r1 = 16
            if (r0 == r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final T poll() throws java.lang.Exception {
            r3 = this;
            int r0 = r3.get()
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L13
            T r0 = r3.value
            r3.value = r2
            r1 = 32
            r3.lazySet(r1)
            return r0
        L13:
            return r2
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int r2) {
            r1 = this;
            r0 = 2
            r2 = r2 & r0
            if (r2 == 0) goto La
            r2 = 8
            r1.lazySet(r2)
            return r0
        La:
            r2 = 0
            return r2
    }

    public final boolean tryDispose() {
            r2 = this;
            r0 = 4
            int r1 = r2.getAndSet(r0)
            if (r1 == r0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }
}

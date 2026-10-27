package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ConsumerSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -7012088219455310787L;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onSuccess;

    public ConsumerSingleObserver(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.onSuccess = r1
            r0.onError = r2
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r4.onError     // Catch: java.lang.Throwable -> L6
            r0.accept(r5)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r1.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T r2) {
            r1 = this;
            io.reactivex.functions.Consumer<? super T> r0 = r1.onSuccess     // Catch: java.lang.Throwable -> L6
            r0.accept(r2)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }
}

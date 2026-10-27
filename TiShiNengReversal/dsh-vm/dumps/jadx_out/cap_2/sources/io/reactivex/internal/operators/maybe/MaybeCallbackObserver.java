package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeCallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -6076952298809384986L;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onSuccess;

    public MaybeCallbackObserver(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3) {
            r0 = this;
            r0.<init>()
            r0.onSuccess = r1
            r0.onError = r2
            r0.onComplete = r3
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
            r1 = this;
            java.lang.Object r0 = r1.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
            r1 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r0)
            io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r4.lazySet(r0)
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r4.onError     // Catch: java.lang.Throwable -> Lb
            r0.accept(r5)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
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

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T r2) {
            r1 = this;
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r1.lazySet(r0)
            io.reactivex.functions.Consumer<? super T> r0 = r1.onSuccess     // Catch: java.lang.Throwable -> Lb
            r0.accept(r2)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }
}

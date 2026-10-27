package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class LambdaObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;

    public LambdaObserver(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r4) {
            r0 = this;
            r0.<init>()
            r0.onNext = r1
            r0.onError = r2
            r0.onComplete = r3
            r0.onSubscribe = r4
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

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L16
            r1.dispose()
            io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> Lf
            r0.run()     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L16:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isDisposed()
            if (r0 != 0) goto L24
            r4.dispose()
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r4.onError     // Catch: java.lang.Throwable -> Lf
            r0.accept(r5)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
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
        L24:
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L13
            io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> Lc
            r0.accept(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r1.onError(r2)
        L13:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            if (r1 == 0) goto L13
            io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r1 = r0.onSubscribe     // Catch: java.lang.Throwable -> Lc
            r1.accept(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            r0.onError(r1)
        L13:
            return
    }
}

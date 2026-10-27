package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DisposableLambdaObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final io.reactivex.Observer<? super T> actual;
    final io.reactivex.functions.Action onDispose;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;
    io.reactivex.disposables.Disposable s;

    public DisposableLambdaObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2, io.reactivex.functions.Action r3) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.onSubscribe = r2
            r0.onDispose = r3
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            io.reactivex.functions.Action r0 = r1.onDispose     // Catch: java.lang.Throwable -> L6
            r0.run()     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        Ld:
            io.reactivex.disposables.Disposable r0 = r1.s
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.s
            boolean r0 = r0.isDisposed()
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onComplete()
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            io.reactivex.Observer<? super T> r0 = r1.actual
            r0.onNext(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r0 = r1.onSubscribe     // Catch: java.lang.Throwable -> L15
            r0.accept(r2)     // Catch: java.lang.Throwable -> L15
            io.reactivex.disposables.Disposable r0 = r1.s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto L14
            r1.s = r2
            io.reactivex.Observer<? super T> r2 = r1.actual
            r2.onSubscribe(r1)
        L14:
            return
        L15:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r2.dispose()
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            io.reactivex.Observer<? super T> r2 = r1.actual
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r2)
            return
    }
}

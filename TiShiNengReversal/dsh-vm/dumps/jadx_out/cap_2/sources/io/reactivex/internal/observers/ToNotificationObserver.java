package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ToNotificationObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -7420197867343208289L;
    final io.reactivex.functions.Consumer<? super io.reactivex.Notification<java.lang.Object>> consumer;

    public ToNotificationObserver(io.reactivex.functions.Consumer<? super io.reactivex.Notification<java.lang.Object>> r1) {
            r0 = this;
            r0.<init>()
            r0.consumer = r1
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

    @Override // io.reactivex.Observer
    public void onComplete() {
            r2 = this;
            io.reactivex.functions.Consumer<? super io.reactivex.Notification<java.lang.Object>> r0 = r2.consumer     // Catch: java.lang.Throwable -> La
            io.reactivex.Notification r1 = io.reactivex.Notification.createOnComplete()     // Catch: java.lang.Throwable -> La
            r0.accept(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            io.reactivex.functions.Consumer<? super io.reactivex.Notification<java.lang.Object>> r0 = r4.consumer     // Catch: java.lang.Throwable -> La
            io.reactivex.Notification r1 = io.reactivex.Notification.createOnError(r5)     // Catch: java.lang.Throwable -> La
            r0.accept(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
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

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            if (r2 != 0) goto L16
            java.lang.Object r2 = r1.get()
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            r2.dispose()
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
            r1.onError(r2)
            return
        L16:
            io.reactivex.functions.Consumer<? super io.reactivex.Notification<java.lang.Object>> r0 = r1.consumer     // Catch: java.lang.Throwable -> L20
            io.reactivex.Notification r2 = io.reactivex.Notification.createOnNext(r2)     // Catch: java.lang.Throwable -> L20
            r0.accept(r2)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            java.lang.Object r0 = r1.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            r0.dispose()
            r1.onError(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }
}

package com.acse.ottn.io.reactivex;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SubscriberObservableEmitter<T> implements com.acse.ottn.io.reactivex.ObservableEmitter<T>, com.acse.ottn.io.reactivex.disposables.Disposable {
    com.acse.ottn.io.reactivex.disposables.Disposable disposable;
    rx.l<? super T> subscriber;

    public SubscriberObservableEmitter(rx.l<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.subscriber = r1
            return
    }

    @Override // com.acse.ottn.io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            rx.l<? super T> r0 = r1.subscriber
            if (r0 == 0) goto L7
            r0.unsubscribe()
        L7:
            com.acse.ottn.io.reactivex.disposables.Disposable r0 = r1.disposable
            if (r0 == 0) goto Le
            r0.dispose()
        Le:
            return
    }

    @Override // com.acse.ottn.io.reactivex.ObservableEmitter, com.acse.ottn.io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            com.acse.ottn.io.reactivex.disposables.Disposable r0 = r1.disposable
            if (r0 != 0) goto Lb
            rx.l<? super T> r0 = r1.subscriber
            boolean r0 = r0.isUnsubscribed()
            return r0
        Lb:
            boolean r0 = r0.isDisposed()
            return r0
    }

    @Override // com.acse.ottn.io.reactivex.Emitter
    public void onComplete() {
            r1 = this;
            rx.l<? super T> r0 = r1.subscriber
            r0.onCompleted()
            return
    }

    @Override // com.acse.ottn.io.reactivex.Emitter
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.l<? super T> r0 = r1.subscriber
            r0.onError(r2)
            return
    }

    @Override // com.acse.ottn.io.reactivex.Emitter
    public void onNext(T r2) {
            r1 = this;
            rx.l<? super T> r0 = r1.subscriber
            r0.onNext(r2)
            return
    }

    @Override // com.acse.ottn.io.reactivex.ObservableEmitter
    public com.acse.ottn.io.reactivex.ObservableEmitter<T> serialize() {
            r0 = this;
            return r0
    }

    @Override // com.acse.ottn.io.reactivex.ObservableEmitter
    public void setCancellable(com.acse.ottn.io.reactivex.functions.Cancellable r1) {
            r0 = this;
            return
    }

    @Override // com.acse.ottn.io.reactivex.ObservableEmitter
    public void setDisposable(com.acse.ottn.io.reactivex.disposables.Disposable r1) {
            r0 = this;
            r0.disposable = r1
            return
    }

    @Override // com.acse.ottn.io.reactivex.ObservableEmitter
    public boolean tryOnError(java.lang.Throwable r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
        L9:
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L1e
            rx.l<? super T> r0 = r1.subscriber     // Catch: java.lang.Throwable -> L19
            r0.onError(r2)     // Catch: java.lang.Throwable -> L19
            r1.dispose()
            r2 = 1
            return r2
        L19:
            r2 = move-exception
            r1.dispose()
            throw r2
        L1e:
            r2 = 0
            return r2
    }
}

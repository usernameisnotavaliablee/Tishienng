package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SubscriberCompletableObserver<T> implements io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
    io.reactivex.disposables.Disposable d;
    final org.reactivestreams.Subscriber<? super T> subscriber;

    public SubscriberCompletableObserver(org.reactivestreams.Subscriber<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.subscriber = r1
            return
    }

    public void cancel() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.d
            r0.dispose()
            return
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r1 = this;
            org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
            r0.onComplete()
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.d
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.d = r2
            org.reactivestreams.Subscriber<? super T> r2 = r1.subscriber
            r2.onSubscribe(r1)
        Lf:
            return
    }

    public void request(long r1) {
            r0 = this;
            return
    }
}

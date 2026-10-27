package io.reactivex.internal.operators.completable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompletableToObservable<T> extends io.reactivex.Observable<T> {
    final io.reactivex.CompletableSource source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ObserverCompletableObserver implements io.reactivex.CompletableObserver {
        private final io.reactivex.Observer<?> observer;

        ObserverCompletableObserver(io.reactivex.Observer<?> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<?> r0 = r1.observer
                r0.onComplete()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<?> r0 = r1.observer
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.Observer<?> r0 = r1.observer
                r0.onSubscribe(r2)
                return
        }
    }

    public CompletableToObservable(io.reactivex.CompletableSource r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableToObservable$ObserverCompletableObserver r1 = new io.reactivex.internal.operators.completable.CompletableToObservable$ObserverCompletableObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}

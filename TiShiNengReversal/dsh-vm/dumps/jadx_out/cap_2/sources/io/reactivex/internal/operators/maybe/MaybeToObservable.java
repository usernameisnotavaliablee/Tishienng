package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeToObservable<T> extends io.reactivex.Observable<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MaybeToFlowableSubscriber<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.disposables.Disposable d;

        MaybeToFlowableSubscriber(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                super.dispose()
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r0 = this;
                r0.complete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error(r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public MaybeToObservable(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToFlowableSubscriber r1 = new io.reactivex.internal.operators.maybe.MaybeToObservable$MaybeToFlowableSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}

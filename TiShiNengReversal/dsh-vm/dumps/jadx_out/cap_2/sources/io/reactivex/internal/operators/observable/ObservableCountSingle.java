package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableCountSingle<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Long> {
    final io.reactivex.ObservableSource<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CountObserver implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Long> actual;
        long count;
        io.reactivex.disposables.Disposable d;

        CountObserver(io.reactivex.SingleObserver<? super java.lang.Long> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r3.d = r0
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r3.actual
                long r1 = r3.count
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onSuccess(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.d = r0
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r5) {
                r4 = this;
                long r0 = r4.count
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.SingleObserver<? super java.lang.Long> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableCountSingle(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<java.lang.Long> fuseToObservable() {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableCount r0 = new io.reactivex.internal.operators.observable.ObservableCount
            io.reactivex.ObservableSource<T> r1 = r2.source
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableCountSingle$CountObserver r1 = new io.reactivex.internal.operators.observable.ObservableCountSingle$CountObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}

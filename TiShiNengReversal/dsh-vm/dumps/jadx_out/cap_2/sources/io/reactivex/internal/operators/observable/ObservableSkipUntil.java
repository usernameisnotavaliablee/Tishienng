package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSkipUntil<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> other;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SkipUntilObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable frc;
        volatile boolean notSkipping;
        boolean notSkippingLocal;
        io.reactivex.disposables.Disposable s;

        SkipUntilObserver(io.reactivex.Observer<? super T> r1, io.reactivex.internal.disposables.ArrayCompositeDisposable r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.frc = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r1.frc
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r1.frc
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.notSkippingLocal
                if (r0 == 0) goto La
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
            La:
                boolean r0 = r1.notSkipping
                if (r0 == 0) goto L16
                r0 = 1
                r1.notSkippingLocal = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
            L16:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L10
                r2.s = r3
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r2.frc
                r1 = 0
                r0.setResource(r1, r3)
            L10:
                return
        }
    }

    public ObservableSkipUntil(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r5)
            io.reactivex.internal.disposables.ArrayCompositeDisposable r5 = new io.reactivex.internal.disposables.ArrayCompositeDisposable
            r1 = 2
            r5.<init>(r1)
            r0.onSubscribe(r5)
            io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntilObserver r1 = new io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntilObserver
            r1.<init>(r0, r5)
            io.reactivex.ObservableSource<U> r2 = r4.other
            io.reactivex.internal.operators.observable.ObservableSkipUntil$1 r3 = new io.reactivex.internal.operators.observable.ObservableSkipUntil$1
            r3.<init>(r4, r5, r1, r0)
            r2.subscribe(r3)
            io.reactivex.ObservableSource<T> r5 = r4.source
            r5.subscribe(r1)
            return
    }
}

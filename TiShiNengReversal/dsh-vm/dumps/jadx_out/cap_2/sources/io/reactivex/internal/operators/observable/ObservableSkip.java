package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSkip<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SkipObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        io.reactivex.disposables.Disposable d;
        long remaining;

        SkipObserver(io.reactivex.Observer<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.remaining = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
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
        public void onNext(T r6) {
                r5 = this;
                long r0 = r5.remaining
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Le
                r2 = 1
                long r0 = r0 - r2
                r5.remaining = r0
                return
            Le:
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onNext(r6)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                r0.d = r1
                io.reactivex.Observer<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
                return
        }
    }

    public ObservableSkip(io.reactivex.ObservableSource<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.n = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableSkip$SkipObserver r1 = new io.reactivex.internal.operators.observable.ObservableSkip$SkipObserver
            long r2 = r4.n
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}

package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableScan<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> accumulator;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ScanObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiFunction<T, T, T> accumulator;
        final io.reactivex.Observer<? super T> actual;
        io.reactivex.disposables.Disposable s;
        T value;

        ScanObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.accumulator = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
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
        public void onNext(T r4) {
                r3 = this;
                io.reactivex.Observer<? super T> r0 = r3.actual
                T r1 = r3.value
                if (r1 != 0) goto Lc
                r3.value = r4
                r0.onNext(r4)
                return
            Lc:
                io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r4 = r2.apply(r1, r4)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = "The value returned by the accumulator is null"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)     // Catch: java.lang.Throwable -> L1e
                r3.value = r4
                r0.onNext(r4)
                return
            L1e:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.disposables.Disposable r1 = r3.s
                r1.dispose()
                r0.onError(r4)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableScan(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableScan$ScanObserver r1 = new io.reactivex.internal.operators.observable.ObservableScan$ScanObserver
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}

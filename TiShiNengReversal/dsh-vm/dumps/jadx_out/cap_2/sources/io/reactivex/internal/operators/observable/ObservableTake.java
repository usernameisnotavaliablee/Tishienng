package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableTake<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long limit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        boolean done;
        long remaining;
        io.reactivex.disposables.Disposable subscription;

        TakeObserver(io.reactivex.Observer<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.remaining = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.subscription
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.subscription
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L11
                r0 = 1
                r1.done = r0
                io.reactivex.disposables.Disposable r0 = r1.subscription
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            L11:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.disposables.Disposable r0 = r1.subscription
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r8) {
                r7 = this;
                boolean r0 = r7.done
                if (r0 != 0) goto L23
                long r0 = r7.remaining
                r2 = 1
                long r2 = r0 - r2
                r7.remaining = r2
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto L23
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                io.reactivex.Observer<? super T> r1 = r7.actual
                r1.onNext(r8)
                if (r0 == 0) goto L23
                r7.onComplete()
            L23:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r6) {
                r5 = this;
                io.reactivex.disposables.Disposable r0 = r5.subscription
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r6)
                if (r0 == 0) goto L23
                r5.subscription = r6
                long r0 = r5.remaining
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
                r0 = 1
                r5.done = r0
                r6.dispose()
                io.reactivex.Observer<? super T> r6 = r5.actual
                io.reactivex.internal.disposables.EmptyDisposable.complete(r6)
                return
            L1e:
                io.reactivex.Observer<? super T> r6 = r5.actual
                r6.onSubscribe(r5)
            L23:
                return
        }
    }

    public ObservableTake(io.reactivex.ObservableSource<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.limit = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableTake$TakeObserver r1 = new io.reactivex.internal.operators.observable.ObservableTake$TakeObserver
            long r2 = r4.limit
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}

package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableElementAtMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final long index;
    final io.reactivex.ObservableSource<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        long count;
        boolean done;
        final long index;
        io.reactivex.disposables.Disposable s;

        ElementAtObserver(io.reactivex.MaybeObserver<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
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
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                r0 = 1
                r1.done = r0
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
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
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r5.count
                long r2 = r5.index
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1b
                r0 = 1
                r5.done = r0
                io.reactivex.disposables.Disposable r0 = r5.s
                r0.dispose()
                io.reactivex.MaybeObserver<? super T> r0 = r5.actual
                r0.onSuccess(r6)
                return
            L1b:
                r2 = 1
                long r0 = r0 + r2
                r5.count = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableElementAtMaybe(io.reactivex.ObservableSource<T> r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.index = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
            r5 = this;
            io.reactivex.internal.operators.observable.ObservableElementAt r0 = new io.reactivex.internal.operators.observable.ObservableElementAt
            io.reactivex.ObservableSource<T> r1 = r5.source
            long r2 = r5.index
            r4 = 0
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(io.reactivex.MaybeObserver<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableElementAtMaybe$ElementAtObserver r1 = new io.reactivex.internal.operators.observable.ObservableElementAtMaybe$ElementAtObserver
            long r2 = r4.index
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}

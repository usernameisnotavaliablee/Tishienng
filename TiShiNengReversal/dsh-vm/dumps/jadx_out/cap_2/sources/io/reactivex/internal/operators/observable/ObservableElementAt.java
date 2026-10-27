package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableElementAt<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final T defaultValue;
    final long index;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        long count;
        final T defaultValue;
        boolean done;
        final long index;
        io.reactivex.disposables.Disposable s;

        ElementAtObserver(io.reactivex.Observer<? super T> r1, long r2, T r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                r0.defaultValue = r4
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
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L15
                r0 = 1
                r2.done = r0
                T r0 = r2.defaultValue
                if (r0 == 0) goto L10
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            L10:
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L15:
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
                io.reactivex.Observer<? super T> r0 = r1.actual
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
                if (r4 != 0) goto L20
                r0 = 1
                r5.done = r0
                io.reactivex.disposables.Disposable r0 = r5.s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onNext(r6)
                io.reactivex.Observer<? super T> r6 = r5.actual
                r6.onComplete()
                return
            L20:
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
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableElementAt(io.reactivex.ObservableSource<T> r1, long r2, T r4) {
            r0 = this;
            r0.<init>(r1)
            r0.index = r2
            r0.defaultValue = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableElementAt$ElementAtObserver r1 = new io.reactivex.internal.operators.observable.ObservableElementAt$ElementAtObserver
            long r2 = r5.index
            T r4 = r5.defaultValue
            r1.<init>(r6, r2, r4)
            r0.subscribe(r1)
            return
    }
}

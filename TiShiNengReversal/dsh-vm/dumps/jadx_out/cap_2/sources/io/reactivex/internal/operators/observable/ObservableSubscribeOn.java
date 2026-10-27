package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSubscribeOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SubscribeOnObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8094547886072529208L;
        final io.reactivex.Observer<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> s;

        SubscribeOnObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.s = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
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
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.s
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void setDisposable(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableSubscribeOn(io.reactivex.ObservableSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver r0 = new io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            io.reactivex.Scheduler r3 = r2.scheduler
            io.reactivex.internal.operators.observable.ObservableSubscribeOn$1 r1 = new io.reactivex.internal.operators.observable.ObservableSubscribeOn$1
            r1.<init>(r2, r0)
            io.reactivex.disposables.Disposable r3 = r3.scheduleDirect(r1)
            r0.setDisposable(r3)
            return
    }
}

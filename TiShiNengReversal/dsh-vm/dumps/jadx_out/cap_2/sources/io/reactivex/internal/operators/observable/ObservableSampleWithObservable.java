package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<?> other;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SampleMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.Observer<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;
        io.reactivex.disposables.Disposable s;
        final io.reactivex.ObservableSource<?> sampler;

        SampleMainObserver(io.reactivex.Observer<? super T> r2, io.reactivex.ObservableSource<?> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.sampler = r3
                return
        }

        public void complete() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                return
        }

        public void emit() {
                r2 = this;
                r0 = 0
                java.lang.Object r0 = r2.getAndSet(r0)
                if (r0 == 0) goto Lc
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            Lc:
                return
        }

        public void error(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.other
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L21
                r1.s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.other
                java.lang.Object r2 = r2.get()
                if (r2 != 0) goto L21
                io.reactivex.ObservableSource<?> r2 = r1.sampler
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SamplerObserver r0 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SamplerObserver
                r0.<init>(r1)
                r2.subscribe(r0)
            L21:
                return
        }

        boolean setOther(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SamplerObserver<T> implements io.reactivex.Observer<java.lang.Object> {
        final io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> parent;

        SamplerObserver(io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r0 = r1.parent
                r0.complete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r0 = r1.parent
                r0.error(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r1 = r0.parent
                r1.emit()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r0 = r1.parent
                r0.setOther(r2)
                return
        }
    }

    public ObservableSampleWithObservable(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<?> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r4)
            io.reactivex.ObservableSource<T> r4 = r3.source
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver r1 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
            io.reactivex.ObservableSource<?> r2 = r3.other
            r1.<init>(r0, r2)
            r4.subscribe(r1)
            return
    }
}

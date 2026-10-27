package io.reactivex.internal.operators.single;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SingleToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.SingleSource<? extends T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SingleToFlowableObserver<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;
        io.reactivex.disposables.Disposable d;

        SingleToFlowableObserver(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription
        public void cancel() {
                r1 = this;
                super.cancel()
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public SingleToFlowable(io.reactivex.SingleSource<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<? extends T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver r1 = new io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}

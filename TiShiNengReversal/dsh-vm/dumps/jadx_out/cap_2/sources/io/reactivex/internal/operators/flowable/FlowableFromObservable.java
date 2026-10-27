package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableFromObservable<T> extends io.reactivex.Flowable<T> {
    private final io.reactivex.Observable<T> upstream;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SubscriberObserver<T> implements io.reactivex.Observer<T>, org.reactivestreams.Subscription {
        private io.reactivex.disposables.Disposable d;
        private final org.reactivestreams.Subscriber<? super T> s;

        SubscriberObserver(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.s = r1
                return
        }

        public void cancel() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                r0.dispose()
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.s
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.s
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.s
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                r0.d = r1
                org.reactivestreams.Subscriber<? super T> r1 = r0.s
                r1.onSubscribe(r0)
                return
        }

        public void request(long r1) {
                r0 = this;
                return
        }
    }

    public FlowableFromObservable(io.reactivex.Observable<T> r1) {
            r0 = this;
            r0.<init>()
            r0.upstream = r1
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.Observable<T> r0 = r2.upstream
            io.reactivex.internal.operators.flowable.FlowableFromObservable$SubscriberObserver r1 = new io.reactivex.internal.operators.flowable.FlowableFromObservable$SubscriberObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}

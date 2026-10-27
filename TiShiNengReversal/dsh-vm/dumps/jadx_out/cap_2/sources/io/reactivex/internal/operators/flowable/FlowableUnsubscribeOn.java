package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableUnsubscribeOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UnsubscribeSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 1015244841293359600L;
        final org.reactivestreams.Subscriber<? super T> actual;
        org.reactivestreams.Subscription s;
        final io.reactivex.Scheduler scheduler;


        UnsubscribeSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r2
                return
        }

        public void cancel() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L12
                io.reactivex.Scheduler r0 = r2.scheduler
                io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$UnsubscribeSubscriber$1 r1 = new io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$UnsubscribeSubscriber$1
                r1.<init>(r2)
                r0.scheduleDirect(r1)
            L12:
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 != 0) goto Lb
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lb:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 == 0) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            La:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 != 0) goto Lb
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
            Lb:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }
    }

    public FlowableUnsubscribeOn(org.reactivestreams.Publisher<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$UnsubscribeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$UnsubscribeSubscriber
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}

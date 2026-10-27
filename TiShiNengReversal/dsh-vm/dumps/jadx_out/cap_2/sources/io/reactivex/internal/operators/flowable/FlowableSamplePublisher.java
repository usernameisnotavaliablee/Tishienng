package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableSamplePublisher<T> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<?> other;
    final org.reactivestreams.Publisher<T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SamplePublisherSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> other;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription s;
        final org.reactivestreams.Publisher<?> sampler;

        SamplePublisherSubscriber(org.reactivestreams.Subscriber<? super T> r2, org.reactivestreams.Publisher<?> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.sampler = r3
                return
        }

        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void complete() {
                r1 = this;
                r1.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void emit() {
                r6 = this;
                r0 = 0
                java.lang.Object r0 = r6.getAndSet(r0)
                if (r0 == 0) goto L2f
                java.util.concurrent.atomic.AtomicLong r1 = r6.requested
                long r1 = r1.get()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L20
                org.reactivestreams.Subscriber<? super T> r1 = r6.actual
                r1.onNext(r0)
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                r1 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r1)
                return
            L20:
                r6.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Couldn't emit value due to lack of requests!"
                r1.<init>(r2)
                r0.onError(r1)
            L2f:
                return
        }

        public void error(java.lang.Throwable r2) {
                r1 = this;
                r1.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L29
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.other
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L29
                org.reactivestreams.Publisher<?> r0 = r2.sampler
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplerSubscriber
                r1.<init>(r2)
                r0.subscribe(r1)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L29:
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Lb
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
            Lb:
                return
        }

        boolean setOther(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SamplerSubscriber<T> implements org.reactivestreams.Subscriber<java.lang.Object> {
        final io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> parent;

        SamplerSubscriber(io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r0 = r1.parent
                r0.complete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r0 = r1.parent
                r0.error(r2)
                return
        }

        public void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r1 = r0.parent
                r1.emit()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r0 = r2.parent
                boolean r0 = r0.setOther(r3)
                if (r0 == 0) goto L10
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L10:
                return
        }
    }

    public FlowableSamplePublisher(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<?> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r4)
            org.reactivestreams.Publisher<T> r4 = r3.source
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber
            org.reactivestreams.Publisher<?> r2 = r3.other
            r1.<init>(r0, r2)
            r4.subscribe(r1)
            return
    }
}

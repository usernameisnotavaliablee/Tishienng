package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableSubscribeOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final io.reactivex.Scheduler scheduler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SubscribeOnSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Thread> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final boolean nonScheduledRequests;
        final java.util.concurrent.atomic.AtomicLong requested;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;
        org.reactivestreams.Publisher<T> source;
        final io.reactivex.Scheduler.Worker worker;


        SubscribeOnSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.Scheduler.Worker r2, org.reactivestreams.Publisher<T> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.worker = r2
                r0.source = r3
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.s = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                r0.nonScheduledRequests = r4
                return
        }

        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.worker
                r2.dispose()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r5.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r6)
                if (r0 == 0) goto L17
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                r1 = 0
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L17
                r5.requestUpstream(r3, r6)
            L17:
                return
        }

        public void request(long r5) {
                r4 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r5)
                if (r0 == 0) goto L32
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                if (r0 == 0) goto L14
                r4.requestUpstream(r5, r0)
                return
            L14:
                java.util.concurrent.atomic.AtomicLong r0 = r4.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r5)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r5 = r4.s
                java.lang.Object r5 = r5.get()
                org.reactivestreams.Subscription r5 = (org.reactivestreams.Subscription) r5
                if (r5 == 0) goto L32
                java.util.concurrent.atomic.AtomicLong r6 = r4.requested
                r0 = 0
                long r2 = r6.getAndSet(r0)
                int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r6 == 0) goto L32
                r4.requestUpstream(r2, r5)
            L32:
                return
        }

        void requestUpstream(long r3, org.reactivestreams.Subscription r5) {
                r2 = this;
                boolean r0 = r2.nonScheduledRequests
                if (r0 != 0) goto L1a
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.Object r1 = r2.get()
                if (r0 != r1) goto Lf
                goto L1a
            Lf:
                io.reactivex.Scheduler$Worker r0 = r2.worker
                io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$1 r1 = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$1
                r1.<init>(r2, r5, r3)
                r0.schedule(r1)
                return
            L1a:
                r5.request(r3)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r2.lazySet(r0)
                org.reactivestreams.Publisher<T> r0 = r2.source
                r1 = 0
                r2.source = r1
                r0.subscribe(r2)
                return
        }
    }

    public FlowableSubscribeOn(org.reactivestreams.Publisher<T> r1, io.reactivex.Scheduler r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            r0.nonScheduledRequests = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.Scheduler r0 = r4.scheduler
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber
            org.reactivestreams.Publisher<T> r2 = r4.source
            boolean r3 = r4.nonScheduledRequests
            r1.<init>(r5, r0, r2, r3)
            r5.onSubscribe(r1)
            r0.schedule(r1)
            return
    }
}

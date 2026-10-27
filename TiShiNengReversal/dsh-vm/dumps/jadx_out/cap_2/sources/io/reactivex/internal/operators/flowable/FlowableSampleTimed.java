package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableSampleTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SampleTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final long period;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription s;
        final io.reactivex.Scheduler scheduler;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final java.util.concurrent.TimeUnit unit;

        SampleTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.period = r3
                r1.unit = r5
                r1.scheduler = r6
                return
        }

        public void cancel() {
                r1 = this;
                r1.cancelTimer()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        void cancelTimer() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        public void onComplete() {
                r1 = this;
                r1.cancelTimer()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancelTimer()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r9) {
                r8 = this;
                org.reactivestreams.Subscription r0 = r8.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r9)
                if (r0 == 0) goto L28
                r8.s = r9
                org.reactivestreams.Subscriber<? super T> r0 = r8.actual
                r0.onSubscribe(r8)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r8.timer
                io.reactivex.Scheduler r1 = r8.scheduler
                long r3 = r8.period
                java.util.concurrent.TimeUnit r7 = r8.unit
                r5 = r3
                r2 = r8
                io.reactivex.disposables.Disposable r1 = r1.schedulePeriodicallyDirect(r2, r3, r5, r7)
                r0.replace(r1)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9.request(r0)
            L28:
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

        @Override // java.lang.Runnable
        public void run() {
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
    }

    public FlowableSampleTimed(org.reactivestreams.Publisher<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.period = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r7) {
            r6 = this;
            io.reactivex.subscribers.SerializedSubscriber r1 = new io.reactivex.subscribers.SerializedSubscriber
            r1.<init>(r7)
            org.reactivestreams.Publisher<T> r7 = r6.source
            io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedSubscriber
            long r2 = r6.period
            java.util.concurrent.TimeUnit r4 = r6.unit
            io.reactivex.Scheduler r5 = r6.scheduler
            r0.<init>(r1, r2, r4, r5)
            r7.subscribe(r0)
            return
    }
}

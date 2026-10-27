package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableIntervalRange extends io.reactivex.Flowable<java.lang.Long> {
    final long end;
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final long start;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class IntervalRangeSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> actual;
        long count;
        final long end;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource;

        IntervalRangeSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> r2, long r3, long r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.resource = r0
                r1.actual = r2
                r1.count = r3
                r1.end = r5
                return
        }

        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L9
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
            L9:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r8.resource
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L71
                long r2 = r8.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L4a
                long r4 = r8.count
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r8.actual
                java.lang.Long r6 = java.lang.Long.valueOf(r4)
                r0.onNext(r6)
                long r6 = r8.end
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 != 0) goto L38
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r8.resource
                java.lang.Object r0 = r0.get()
                if (r0 == r1) goto L32
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r8.actual
                r0.onComplete()
            L32:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r8.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L38:
                r0 = 1
                long r4 = r4 + r0
                r8.count = r4
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L71
                r8.decrementAndGet()
                return
            L4a:
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r8.actual
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Can't deliver value "
                r2.append(r3)
                long r3 = r8.count
                r2.append(r3)
                java.lang.String r3 = " due to lack of requests"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r0.onError(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r8.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L71:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }
    }

    public FlowableIntervalRange(long r1, long r3, long r5, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r0 = this;
            r0.<init>()
            r0.initialDelay = r5
            r0.period = r7
            r0.unit = r9
            r0.scheduler = r10
            r0.start = r1
            r0.end = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> r8) {
            r7 = this;
            io.reactivex.internal.operators.flowable.FlowableIntervalRange$IntervalRangeSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableIntervalRange$IntervalRangeSubscriber
            long r2 = r7.start
            long r4 = r7.end
            r1 = r8
            r0.<init>(r1, r2, r4)
            r1.onSubscribe(r0)
            r1 = r0
            io.reactivex.Scheduler r0 = r7.scheduler
            long r2 = r7.initialDelay
            long r4 = r7.period
            java.util.concurrent.TimeUnit r6 = r7.unit
            io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
            r0 = r1
            r0.setResource(r8)
            return
    }
}

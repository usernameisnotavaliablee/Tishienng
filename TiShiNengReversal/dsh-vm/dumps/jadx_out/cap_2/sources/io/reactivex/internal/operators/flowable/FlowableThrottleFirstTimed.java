package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableThrottleFirstTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        volatile boolean gate;
        org.reactivestreams.Subscription s;
        final long timeout;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler.Worker r6) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.timeout = r3
                r1.unit = r5
                r1.worker = r6
                return
        }

        public void cancel() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 == 0) goto L5
                goto L4e
            L5:
                boolean r0 = r6.gate
                if (r0 != 0) goto L4e
                r0 = 1
                r6.gate = r0
                long r1 = r6.get()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L3d
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onNext(r7)
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r6, r0)
                io.reactivex.internal.disposables.SequentialDisposable r7 = r6.timer
                java.lang.Object r7 = r7.get()
                io.reactivex.disposables.Disposable r7 = (io.reactivex.disposables.Disposable) r7
                if (r7 == 0) goto L2d
                r7.dispose()
            L2d:
                io.reactivex.internal.disposables.SequentialDisposable r7 = r6.timer
                io.reactivex.Scheduler$Worker r0 = r6.worker
                long r1 = r6.timeout
                java.util.concurrent.TimeUnit r3 = r6.unit
                io.reactivex.disposables.Disposable r0 = r0.schedule(r6, r1, r3)
                r7.replace(r0)
                return
            L3d:
                r6.done = r0
                r6.cancel()
                org.reactivestreams.Subscriber<? super T> r7 = r6.actual
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver value due to lack of requests"
                r0.<init>(r1)
                r7.onError(r0)
            L4e:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
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
                r1 = this;
                r0 = 0
                r1.gate = r0
                return
        }
    }

    public FlowableThrottleFirstTimed(org.reactivestreams.Publisher<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            org.reactivestreams.Publisher<T> r0 = r7.source
            io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed$DebounceTimedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed$DebounceTimedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r8)
            long r3 = r7.timeout
            java.util.concurrent.TimeUnit r5 = r7.unit
            io.reactivex.Scheduler r8 = r7.scheduler
            io.reactivex.Scheduler$Worker r6 = r8.createWorker()
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r1)
            return
    }
}

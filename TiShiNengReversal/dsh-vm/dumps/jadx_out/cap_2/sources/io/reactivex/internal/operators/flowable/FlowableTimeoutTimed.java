package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableTimeoutTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    static final io.reactivex.disposables.Disposable NEW_TIMER = null;
    final org.reactivestreams.Publisher<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutTimedOtherSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.subscriptions.FullArbiter<T> arbiter;
        volatile boolean done;
        volatile long index;
        final org.reactivestreams.Publisher<? extends T> other;
        org.reactivestreams.Subscription s;
        final long timeout;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;


        TimeoutTimedOtherSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler.Worker r6, org.reactivestreams.Publisher<? extends T> r7) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.timeout = r3
                r1.unit = r5
                r1.worker = r6
                r1.other = r7
                io.reactivex.internal.subscriptions.FullArbiter r3 = new io.reactivex.internal.subscriptions.FullArbiter
                r4 = 8
                r3.<init>(r2, r1, r4)
                r1.arbiter = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                boolean r0 = r0.isDisposed()
                return r0
        }

        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
                org.reactivestreams.Subscription r1 = r2.s
                r0.onComplete(r1)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
                org.reactivestreams.Subscription r1 = r2.s
                r0.onError(r3, r1)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                goto L19
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.internal.subscriptions.FullArbiter<T> r2 = r4.arbiter
                org.reactivestreams.Subscription r3 = r4.s
                boolean r5 = r2.onNext(r5, r3)
                if (r5 == 0) goto L19
                r4.scheduleTimeout(r0)
            L19:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L1e
                r2.s = r3
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
                boolean r3 = r0.setSubscription(r3)
                if (r3 == 0) goto L1e
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                io.reactivex.internal.subscriptions.FullArbiter<T> r0 = r2.arbiter
                r3.onSubscribe(r0)
                r0 = 0
                r2.scheduleTimeout(r0)
            L1e:
                return
        }

        void scheduleTimeout(long r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.timer
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto Ld
                r0.dispose()
            Ld:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r3.timer
                io.reactivex.disposables.Disposable r2 = io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.NEW_TIMER
                boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
                if (r0 == 0) goto L2b
                io.reactivex.Scheduler$Worker r0 = r3.worker
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedOtherSubscriber$1 r1 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedOtherSubscriber$1
                r1.<init>(r3, r4)
                long r4 = r3.timeout
                java.util.concurrent.TimeUnit r2 = r3.unit
                io.reactivex.disposables.Disposable r4 = r0.schedule(r1, r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r5 = r3.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r5, r4)
            L2b:
                return
        }

        void subscribeNext() {
                r3 = this;
                org.reactivestreams.Publisher<? extends T> r0 = r3.other
                io.reactivex.internal.subscribers.FullArbiterSubscriber r1 = new io.reactivex.internal.subscribers.FullArbiterSubscriber
                io.reactivex.internal.subscriptions.FullArbiter<T> r2 = r3.arbiter
                r1.<init>(r2)
                r0.subscribe(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimeoutTimedSubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean done;
        volatile long index;
        org.reactivestreams.Subscription s;
        final long timeout;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;


        TimeoutTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler.Worker r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.timeout = r3
                r1.unit = r5
                r1.worker = r6
                return
        }

        public void cancel() {
                r0 = this;
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                boolean r0 = r0.isDisposed()
                return r0
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                r1.dispose()
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
                r1.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                org.reactivestreams.Subscriber<? super T> r2 = r4.actual
                r2.onNext(r5)
                r4.scheduleTimeout(r0)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L14
                r2.s = r3
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                r3.onSubscribe(r2)
                r0 = 0
                r2.scheduleTimeout(r0)
            L14:
                return
        }

        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r2)
                return
        }

        void scheduleTimeout(long r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.timer
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto Ld
                r0.dispose()
            Ld:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r3.timer
                io.reactivex.disposables.Disposable r2 = io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.NEW_TIMER
                boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
                if (r0 == 0) goto L2b
                io.reactivex.Scheduler$Worker r0 = r3.worker
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedSubscriber$1 r1 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedSubscriber$1
                r1.<init>(r3, r4)
                long r4 = r3.timeout
                java.util.concurrent.TimeUnit r2 = r3.unit
                io.reactivex.disposables.Disposable r4 = r0.schedule(r1, r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r5 = r3.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r5, r4)
            L2b:
                return
        }
    }

    static {
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$1 r0 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$1
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.NEW_TIMER = r0
            return
    }

    public FlowableTimeoutTimed(org.reactivestreams.Publisher<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, org.reactivestreams.Publisher<? extends T> r6) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.other = r6
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            org.reactivestreams.Publisher<? extends T> r0 = r8.other
            if (r0 != 0) goto L1e
            org.reactivestreams.Publisher<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r9)
            long r3 = r8.timeout
            java.util.concurrent.TimeUnit r5 = r8.unit
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r1)
            return
        L1e:
            org.reactivestreams.Publisher<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedOtherSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTimedOtherSubscriber
            long r3 = r8.timeout
            java.util.concurrent.TimeUnit r5 = r8.unit
            io.reactivex.Scheduler r2 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r2.createWorker()
            org.reactivestreams.Publisher<? extends T> r7 = r8.other
            r2 = r9
            r1.<init>(r2, r3, r5, r6, r7)
            r0.subscribe(r1)
            return
    }
}

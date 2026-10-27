package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableDebounceTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DebounceEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> parent;
        final T value;

        DebounceEmitter(T r2, long r3, io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.once = r0
                r1.value = r2
                r1.idx = r3
                r1.parent = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void emit() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L13
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber<T> r0 = r4.parent
                long r1 = r4.idx
                T r3 = r4.value
                r0.emit(r1, r3, r4)
            L13:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                r0.emit()
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        volatile long index;
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

        void emit(long r4, T r6, io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter<T> r7) {
                r3 = this;
                long r0 = r3.index
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L2d
                long r4 = r3.get()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L1e
                org.reactivestreams.Subscriber<? super T> r4 = r3.actual
                r4.onNext(r6)
                r4 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r3, r4)
                r7.dispose()
                return
            L1e:
                r3.cancel()
                org.reactivestreams.Subscriber<? super T> r4 = r3.actual
                io.reactivex.exceptions.MissingBackpressureException r5 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r6 = "Could not deliver value due to lack of requests"
                r5.<init>(r6)
                r4.onError(r5)
            L2d:
                return
        }

        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                goto L2c
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.internal.disposables.SequentialDisposable r0 = r2.timer
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                if (r1 != 0) goto L2c
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter r0 = (io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter) r0
                if (r0 == 0) goto L1d
                r0.emit()
            L1d:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r2.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
            L2c:
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

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                goto L33
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.internal.disposables.SequentialDisposable r2 = r4.timer
                java.lang.Object r2 = r2.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L19
                r2.dispose()
            L19:
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter r2 = new io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter
                r2.<init>(r5, r0, r4)
                io.reactivex.internal.disposables.SequentialDisposable r5 = r4.timer
                boolean r5 = r5.replace(r2)
                if (r5 == 0) goto L33
                io.reactivex.Scheduler$Worker r5 = r4.worker
                long r0 = r4.timeout
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r5 = r5.schedule(r2, r0, r3)
                r2.setResource(r5)
            L33:
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
    }

    public FlowableDebounceTimed(org.reactivestreams.Publisher<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
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
            io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber
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

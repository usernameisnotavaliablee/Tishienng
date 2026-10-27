package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableWindowBoundary<T, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final org.reactivestreams.Publisher<B> other;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WindowBoundaryInnerSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> parent;

        WindowBoundaryInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> r0 = r1.parent
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> r0 = r1.parent
                r0.onError(r2)
                return
        }

        public void onNext(B r1) {
                r0 = this;
                boolean r1 = r0.done
                if (r1 == 0) goto L5
                return
            L5:
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> r1 = r0.parent
                r1.next()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WindowBoundaryMainSubscriber<T, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        static final java.lang.Object NEXT = null;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> boundary;
        final int bufferSize;
        final org.reactivestreams.Publisher<B> other;
        org.reactivestreams.Subscription s;
        io.reactivex.processors.UnicastProcessor<T> window;
        final java.util.concurrent.atomic.AtomicLong windows;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.NEXT = r0
                return
        }

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, org.reactivestreams.Publisher<B> r3, int r4) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.boundary = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.windows = r2
                r1.other = r3
                r1.bufferSize = r4
                r3 = 1
                r2.lazySet(r3)
                return
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r1, java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void drainLoop() {
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                org.reactivestreams.Subscriber<? super V> r1 = r10.actual
                io.reactivex.processors.UnicastProcessor<T> r2 = r10.window
                r3 = 1
                r4 = 1
            L8:
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L12
                r7 = 1
                goto L13
            L12:
                r7 = 0
            L13:
                if (r5 == 0) goto L28
                if (r7 == 0) goto L28
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r10.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L24
                r2.onError(r0)
                return
            L24:
                r2.onComplete()
                return
            L28:
                if (r7 == 0) goto L32
                int r4 = -r4
                int r4 = r10.leave(r4)
                if (r4 != 0) goto L8
                return
            L32:
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.NEXT
                if (r6 != r5) goto L84
                r2.onComplete()
                java.util.concurrent.atomic.AtomicLong r5 = r10.windows
                long r5 = r5.decrementAndGet()
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L4b
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r10.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L4b:
                boolean r5 = r10.cancelled
                if (r5 == 0) goto L50
                goto L8
            L50:
                int r2 = r10.bufferSize
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                long r5 = r10.requested()
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L77
                java.util.concurrent.atomic.AtomicLong r7 = r10.windows
                r7.getAndIncrement()
                r1.onNext(r2)
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L74
                r5 = 1
                r10.produced(r5)
            L74:
                r10.window = r2
                goto L8
            L77:
                r10.cancelled = r3
                io.reactivex.exceptions.MissingBackpressureException r5 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r6 = "Could not deliver new window due to lack of requests"
                r5.<init>(r6)
                r1.onError(r5)
                goto L8
            L84:
                java.lang.Object r5 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r5)
                goto L8
        }

        void next() {
                r2 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                java.lang.Object r1 = io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.NEXT
                r0.offer(r1)
                boolean r0 = r2.enter()
                if (r0 == 0) goto L10
                r2.drainLoop()
            L10:
                return
        }

        public void onComplete() {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r5.done = r0
                boolean r0 = r5.enter()
                if (r0 == 0) goto L11
                r5.drainLoop()
            L11:
                java.util.concurrent.atomic.AtomicLong r0 = r5.windows
                long r0 = r0.decrementAndGet()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L22
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r5.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L22:
                org.reactivestreams.Subscriber<? super V> r0 = r5.actual
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
                return
            L8:
                r5.error = r6
                r0 = 1
                r5.done = r0
                boolean r0 = r5.enter()
                if (r0 == 0) goto L16
                r5.drainLoop()
            L16:
                java.util.concurrent.atomic.AtomicLong r0 = r5.windows
                long r0 = r0.decrementAndGet()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L27
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r5.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L27:
                org.reactivestreams.Subscriber<? super V> r0 = r5.actual
                r0.onError(r6)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.fastEnter()
                if (r0 == 0) goto L13
                io.reactivex.processors.UnicastProcessor<T> r0 = r1.window
                r0.onNext(r2)
                r2 = -1
                int r2 = r1.leave(r2)
                if (r2 != 0) goto L23
                goto L22
            L13:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
                r0.offer(r2)
                boolean r2 = r1.enter()
                if (r2 != 0) goto L23
            L22:
                return
            L23:
                r1.drainLoop()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r8) {
                r7 = this;
                org.reactivestreams.Subscription r0 = r7.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r8)
                if (r0 == 0) goto L5d
                r7.s = r8
                org.reactivestreams.Subscriber<? super V> r0 = r7.actual
                r0.onSubscribe(r7)
                boolean r1 = r7.cancelled
                if (r1 == 0) goto L14
                goto L5d
            L14:
                int r1 = r7.bufferSize
                io.reactivex.processors.UnicastProcessor r1 = io.reactivex.processors.UnicastProcessor.create(r1)
                long r2 = r7.requested()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L53
                r0.onNext(r1)
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L35
                r2 = 1
                r7.produced(r2)
            L35:
                r7.window = r1
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber
                r0.<init>(r7)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r7.boundary
                r2 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L5d
                java.util.concurrent.atomic.AtomicLong r1 = r7.windows
                r1.getAndIncrement()
                r8.request(r4)
                org.reactivestreams.Publisher<B> r8 = r7.other
                r8.subscribe(r0)
                return
            L53:
                io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver first window due to lack of requests"
                r8.<init>(r1)
                r0.onError(r8)
            L5d:
                return
        }

        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }
    }

    public FlowableWindowBoundary(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<B> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.bufferSize = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r5)
            org.reactivestreams.Publisher<B> r5 = r4.other
            int r3 = r4.bufferSize
            r1.<init>(r2, r5, r3)
            r0.subscribe(r1)
            return
    }
}

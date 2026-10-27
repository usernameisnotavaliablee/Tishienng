package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> close;
    final org.reactivestreams.Publisher<B> open;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends io.reactivex.subscribers.DisposableSubscriber<V> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> parent;
        final io.reactivex.processors.UnicastProcessor<T> w;

        OperatorWindowBoundaryCloseSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> r1, io.reactivex.processors.UnicastProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.w = r2
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber<T, ?, V> r0 = r1.parent
                r0.close(r1)
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber<T, ?, V> r0 = r1.parent
                r0.error(r2)
                return
        }

        public void onNext(V r1) {
                r0 = this;
                boolean r1 = r0.done
                if (r1 == 0) goto L5
                return
            L5:
                r1 = 1
                r0.done = r1
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber<T, ?, V> r1 = r0.parent
                r1.close(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> parent;

        OperatorWindowBoundaryOpenSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> r1) {
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber<T, B, ?> r0 = r1.parent
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber<T, B, ?> r0 = r1.parent
                r0.error(r2)
                return
        }

        public void onNext(B r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber<T, B, ?> r0 = r1.parent
                r0.open(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WindowBoundaryMainSubscriber<T, B, V> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> boundary;
        final int bufferSize;
        final io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> close;
        final org.reactivestreams.Publisher<B> open;
        final io.reactivex.disposables.CompositeDisposable resources;
        org.reactivestreams.Subscription s;
        final java.util.concurrent.atomic.AtomicLong windows;
        final java.util.List<io.reactivex.processors.UnicastProcessor<T>> ws;

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, org.reactivestreams.Publisher<B> r3, io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> r4, int r5) {
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
                r1.open = r3
                r1.close = r4
                r1.bufferSize = r5
                io.reactivex.disposables.CompositeDisposable r3 = new io.reactivex.disposables.CompositeDisposable
                r3.<init>()
                r1.resources = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.ws = r3
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

        void close(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryCloseSubscriber<T, V> r4) {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.resources
                r0.delete(r4)
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowOperation r1 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowOperation
                io.reactivex.processors.UnicastProcessor<T> r4 = r4.w
                r2 = 0
                r1.<init>(r4, r2)
                r0.offer(r1)
                boolean r4 = r3.enter()
                if (r4 == 0) goto L1b
                r3.drainLoop()
            L1b:
                return
        }

        void dispose() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void drainLoop() {
                r12 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r12.queue
                org.reactivestreams.Subscriber<? super V> r1 = r12.actual
                java.util.List<io.reactivex.processors.UnicastProcessor<T>> r2 = r12.ws
                r3 = 1
                r4 = 1
            L8:
                boolean r5 = r12.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L12
                r7 = 1
                goto L13
            L12:
                r7 = 0
            L13:
                if (r5 == 0) goto L4a
                if (r7 == 0) goto L4a
                r12.dispose()
                java.lang.Throwable r0 = r12.error
                if (r0 == 0) goto L32
                java.util.Iterator r1 = r2.iterator()
            L22:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L46
                java.lang.Object r3 = r1.next()
                io.reactivex.processors.UnicastProcessor r3 = (io.reactivex.processors.UnicastProcessor) r3
                r3.onError(r0)
                goto L22
            L32:
                java.util.Iterator r0 = r2.iterator()
            L36:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L46
                java.lang.Object r1 = r0.next()
                io.reactivex.processors.UnicastProcessor r1 = (io.reactivex.processors.UnicastProcessor) r1
                r1.onComplete()
                goto L36
            L46:
                r2.clear()
                return
            L4a:
                if (r7 == 0) goto L54
                int r4 = -r4
                int r4 = r12.leave(r4)
                if (r4 != 0) goto L8
                return
            L54:
                boolean r5 = r6 instanceof io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation
                if (r5 == 0) goto Ldd
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowOperation r6 = (io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation) r6
                io.reactivex.processors.UnicastProcessor<T> r5 = r6.w
                r7 = 0
                if (r5 == 0) goto L79
                boolean r5 = r2.remove(r5)
                if (r5 == 0) goto L8
                io.reactivex.processors.UnicastProcessor<T> r5 = r6.w
                r5.onComplete()
                java.util.concurrent.atomic.AtomicLong r5 = r12.windows
                long r5 = r5.decrementAndGet()
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L8
                r12.dispose()
                return
            L79:
                boolean r5 = r12.cancelled
                if (r5 == 0) goto L7e
                goto L8
            L7e:
                int r5 = r12.bufferSize
                io.reactivex.processors.UnicastProcessor r5 = io.reactivex.processors.UnicastProcessor.create(r5)
                long r9 = r12.requested()
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto Lcf
                r2.add(r5)
                r1.onNext(r5)
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto La0
                r7 = 1
                r12.produced(r7)
            La0:
                io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> r7 = r12.close     // Catch: java.lang.Throwable -> Lc7
                B r6 = r6.open     // Catch: java.lang.Throwable -> Lc7
                java.lang.Object r6 = r7.apply(r6)     // Catch: java.lang.Throwable -> Lc7
                java.lang.String r7 = "The publisher supplied is null"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> Lc7
                org.reactivestreams.Publisher r6 = (org.reactivestreams.Publisher) r6     // Catch: java.lang.Throwable -> Lc7
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$OperatorWindowBoundaryCloseSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$OperatorWindowBoundaryCloseSubscriber
                r7.<init>(r12, r5)
                io.reactivex.disposables.CompositeDisposable r5 = r12.resources
                boolean r5 = r5.add(r7)
                if (r5 == 0) goto L8
                java.util.concurrent.atomic.AtomicLong r5 = r12.windows
                r5.getAndIncrement()
                r6.subscribe(r7)
                goto L8
            Lc7:
                r5 = move-exception
                r12.cancelled = r3
                r1.onError(r5)
                goto L8
            Lcf:
                r12.cancelled = r3
                io.reactivex.exceptions.MissingBackpressureException r5 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r6 = "Could not deliver new window due to lack of requests"
                r5.<init>(r6)
                r1.onError(r5)
                goto L8
            Ldd:
                java.util.Iterator r5 = r2.iterator()
            Le1:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L8
                java.lang.Object r7 = r5.next()
                io.reactivex.processors.UnicastProcessor r7 = (io.reactivex.processors.UnicastProcessor) r7
                java.lang.Object r8 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r7.onNext(r8)
                goto Le1
        }

        void error(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                io.reactivex.disposables.CompositeDisposable r0 = r1.resources
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.boundary
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
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
                io.reactivex.disposables.CompositeDisposable r0 = r5.resources
                r0.dispose()
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
                io.reactivex.disposables.CompositeDisposable r0 = r5.resources
                r0.dispose()
            L27:
                org.reactivestreams.Subscriber<? super V> r0 = r5.actual
                r0.onError(r6)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                goto L38
            L5:
                boolean r0 = r2.fastEnter()
                if (r0 == 0) goto L29
                java.util.List<io.reactivex.processors.UnicastProcessor<T>> r0 = r2.ws
                java.util.Iterator r0 = r0.iterator()
            L11:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r0.next()
                io.reactivex.processors.UnicastProcessor r1 = (io.reactivex.processors.UnicastProcessor) r1
                r1.onNext(r3)
                goto L11
            L21:
                r3 = -1
                int r3 = r2.leave(r3)
                if (r3 != 0) goto L39
                goto L38
            L29:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.next(r3)
                r0.offer(r3)
                boolean r3 = r2.enter()
                if (r3 != 0) goto L39
            L38:
                return
            L39:
                r2.drainLoop()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L34
                r3.s = r4
                org.reactivestreams.Subscriber<? super V> r0 = r3.actual
                r0.onSubscribe(r3)
                boolean r0 = r3.cancelled
                if (r0 == 0) goto L14
                goto L34
            L14:
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$OperatorWindowBoundaryOpenSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$OperatorWindowBoundaryOpenSubscriber
                r0.<init>(r3)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r3.boundary
                r2 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L34
                java.util.concurrent.atomic.AtomicLong r1 = r3.windows
                r1.getAndIncrement()
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.request(r1)
                org.reactivestreams.Publisher<B> r4 = r3.open
                r4.subscribe(r0)
            L34:
                return
        }

        void open(B r4) {
                r3 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowOperation r1 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowOperation
                r2 = 0
                r1.<init>(r2, r4)
                r0.offer(r1)
                boolean r4 = r3.enter()
                if (r4 == 0) goto L14
                r3.drainLoop()
            L14:
                return
        }

        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WindowOperation<T, B> {
        final B open;
        final io.reactivex.processors.UnicastProcessor<T> w;

        WindowOperation(io.reactivex.processors.UnicastProcessor<T> r1, B r2) {
                r0 = this;
                r0.<init>()
                r0.w = r1
                r0.open = r2
                return
        }
    }

    public FlowableWindowBoundarySelector(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<B> r2, io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.open = r2
            r0.close = r3
            r0.bufferSize = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r6) {
            r5 = this;
            org.reactivestreams.Publisher<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$WindowBoundaryMainSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r6)
            org.reactivestreams.Publisher<B> r6 = r5.open
            io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> r3 = r5.close
            int r4 = r5.bufferSize
            r1.<init>(r2, r6, r3, r4)
            r0.subscribe(r1)
            return
    }
}

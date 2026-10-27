package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableFlattenIterable<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
    final int prefetch;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FlattenIterableSubscriber<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements org.reactivestreams.Subscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        int consumed;
        java.util.Iterator<? extends R> current;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        int fusionMode;
        final int limit;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription s;

        FlattenIterableSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.prefetch = r3
                int r1 = r3 >> 2
                int r3 = r3 - r1
                r0.limit = r3
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.error = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        boolean checkTerminated(boolean r4, boolean r5, org.reactivestreams.Subscriber<?> r6, io.reactivex.internal.fuseable.SimpleQueue<?> r7) {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Lc
                r3.current = r1
                r7.clear()
                return r2
            Lc:
                if (r4 == 0) goto L2d
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r3.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L27
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r3.error
                java.lang.Throwable r4 = io.reactivex.internal.util.ExceptionHelper.terminate(r4)
                r3.current = r1
                r7.clear()
                r6.onError(r4)
                return r2
            L27:
                if (r5 == 0) goto L2d
                r6.onComplete()
                return r2
            L2d:
                r4 = 0
                return r4
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                r0 = 0
                r1.current = r0
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
                return
        }

        void consumedOne(boolean r4) {
                r3 = this;
                if (r4 == 0) goto L16
                int r4 = r3.consumed
                int r4 = r4 + 1
                int r0 = r3.limit
                if (r4 != r0) goto L14
                r0 = 0
                r3.consumed = r0
                org.reactivestreams.Subscription r0 = r3.s
                long r1 = (long) r4
                r0.request(r1)
                return
            L14:
                r3.consumed = r4
            L16:
                return
        }

        void drain() {
                r17 = this;
                r1 = r17
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto La
                goto L125
            La:
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r1.queue
                int r0 = r1.fusionMode
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                java.util.Iterator<? extends R> r6 = r1.current
                r7 = 1
            L1a:
                r8 = 0
                if (r6 != 0) goto L81
                boolean r9 = r1.done
                java.lang.Object r10 = r3.poll()     // Catch: java.lang.Throwable -> L64
                if (r10 != 0) goto L27
                r11 = 1
                goto L28
            L27:
                r11 = 0
            L28:
                boolean r9 = r1.checkTerminated(r9, r11, r2, r3)
                if (r9 == 0) goto L30
                goto L125
            L30:
                if (r10 == 0) goto L81
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.mapper     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r6 = r6.apply(r10)     // Catch: java.lang.Throwable -> L4c
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L4c
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L4c
                boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L4c
                if (r9 != 0) goto L49
                r1.consumedOne(r0)
                r6 = r8
                goto L1a
            L49:
                r1.current = r6
                goto L81
            L4c:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r3 = r1.s
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            L64:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r4 = r1.s
                r4.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r4, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r1.current = r8
                r3.clear()
                r2.onError(r0)
                return
            L81:
                if (r6 == 0) goto L11e
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L8c:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto Lef
                boolean r15 = r1.done
                boolean r15 = r1.checkTerminated(r15, r4, r2, r3)
                if (r15 == 0) goto L9a
                goto L125
            L9a:
                java.lang.Object r15 = r6.next()     // Catch: java.lang.Throwable -> Ld5
                r2.onNext(r15)
                boolean r15 = r1.done
                boolean r15 = r1.checkTerminated(r15, r4, r2, r3)
                if (r15 == 0) goto Lab
                goto L125
            Lab:
                r15 = 1
                long r13 = r13 + r15
                boolean r15 = r6.hasNext()     // Catch: java.lang.Throwable -> Lbb
                if (r15 != 0) goto L8c
                r1.consumedOne(r0)
                r1.current = r8
                r6 = r8
                goto Lef
            Lbb:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.current = r8
                org.reactivestreams.Subscription r3 = r1.s
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            Ld5:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.current = r8
                org.reactivestreams.Subscription r3 = r1.s
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            Lef:
                int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r8 != 0) goto L107
                boolean r8 = r1.done
                boolean r15 = r3.isEmpty()
                if (r15 == 0) goto Lff
                if (r6 != 0) goto Lff
                r15 = 1
                goto L100
            Lff:
                r15 = 0
            L100:
                boolean r8 = r1.checkTerminated(r8, r15, r2, r3)
                if (r8 == 0) goto L107
                goto L125
            L107:
                int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r8 == 0) goto L11a
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 == 0) goto L11a
                java.util.concurrent.atomic.AtomicLong r8 = r1.requested
                long r9 = -r13
                r8.addAndGet(r9)
            L11a:
                if (r6 != 0) goto L11e
                goto L1a
            L11e:
                int r7 = -r7
                int r7 = r1.addAndGet(r7)
                if (r7 != 0) goto L1a
            L125:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                java.util.Iterator<? extends R> r0 = r1.current
                if (r0 == 0) goto La
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L12
            La:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L14
            L12:
                r0 = 1
                return r0
            L14:
                r0 = 0
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
                r1.drain()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L13
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                if (r0 == 0) goto L13
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.fusionMode
                if (r0 != 0) goto L1c
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L1c
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue is full?!"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L1c:
                r1.drain()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L4c
                r3.s = r4
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L38
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L25
                r3.fusionMode = r1
                r3.queue = r0
                r3.done = r2
                org.reactivestreams.Subscriber<? super R> r4 = r3.actual
                r4.onSubscribe(r3)
                return
            L25:
                r2 = 2
                if (r1 != r2) goto L38
                r3.fusionMode = r1
                r3.queue = r0
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L38:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L4c:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
                r3 = this;
                java.util.Iterator<? extends R> r0 = r3.current
            L2:
                r1 = 0
                if (r0 != 0) goto L24
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r3.queue
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto Le
                return r1
            Le:
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r3.mapper
                java.lang.Object r0 = r2.apply(r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                if (r2 != 0) goto L22
                r0 = r1
                goto L2
            L22:
                r3.current = r0
            L24:
                java.lang.Object r2 = r0.next()
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L30
                r3.current = r1
            L30:
                return r2
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L9
                int r2 = r1.fusionMode
                if (r2 != r0) goto L9
                return r0
            L9:
                r2 = 0
                return r2
        }
    }

    public FlowableFlattenIterable(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.prefetch = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            boolean r1 = r0 instanceof java.util.concurrent.Callable
            if (r1 == 0) goto L32
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L12
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r5)
            return
        L12:
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r1 = r4.mapper     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r1.apply(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
            io.reactivex.internal.operators.flowable.FlowableFromIterable.subscribe(r5, r0)
            return
        L22:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
        L2a:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
        L32:
            io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r4.mapper
            int r3 = r4.prefetch
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}

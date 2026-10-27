package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableZip<T, R> extends io.reactivex.Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final org.reactivestreams.Publisher<? extends T>[] sources;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> sourcesIterable;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        final java.lang.Object[] current;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] subscribers;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2, int r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.zipper = r2
                r0.delayErrors = r5
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber[] r1 = new io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber[r3]
                r2 = 0
            Lc:
                if (r2 >= r3) goto L18
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber r5 = new io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber
                r5.<init>(r0, r4, r2)
                r1[r2] = r5
                int r2 = r2 + 1
                goto Lc
            L18:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r0.current = r2
                r0.subscribers = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto La
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
            La:
                return
        }

        void cancelAll() {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber<T, R>[] r0 = r4.subscribers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.cancel()
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        void drain() {
                r20 = this;
                r1 = r20
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto La
                goto L17d
            La:
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber<T, R>[] r3 = r1.subscribers
                int r4 = r3.length
                java.lang.Object[] r5 = r1.current
                r7 = 1
            L12:
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r8 = r0.get()
                r12 = 0
            L1a:
                r14 = 0
                r15 = 0
                int r16 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r16 == 0) goto Ld9
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L26
                goto L17d
            L26:
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L3f
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L3f
                r1.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L3f:
                r0 = 0
                r6 = 0
            L41:
                if (r6 >= r4) goto La3
                r17 = 0
                r10 = r3[r6]
                r11 = r5[r6]
                if (r11 != 0) goto La0
                boolean r11 = r10.done     // Catch: java.lang.Throwable -> L56
                io.reactivex.internal.fuseable.SimpleQueue<T> r10 = r10.queue     // Catch: java.lang.Throwable -> L56
                if (r10 == 0) goto L58
                java.lang.Object r10 = r10.poll()     // Catch: java.lang.Throwable -> L56
                goto L59
            L56:
                r0 = move-exception
                goto L86
            L58:
                r10 = r14
            L59:
                if (r10 != 0) goto L5e
                r19 = 1
                goto L60
            L5e:
                r19 = 0
            L60:
                if (r11 == 0) goto L81
                if (r19 == 0) goto L81
                r1.cancelAll()     // Catch: java.lang.Throwable -> L56
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L56
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L56
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L56
                if (r0 == 0) goto L7c
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L56
                java.lang.Throwable r0 = r0.terminate()     // Catch: java.lang.Throwable -> L56
                r2.onError(r0)     // Catch: java.lang.Throwable -> L56
                goto L17d
            L7c:
                r2.onComplete()     // Catch: java.lang.Throwable -> L56
                goto L17d
            L81:
                if (r19 != 0) goto L9f
                r5[r6] = r10     // Catch: java.lang.Throwable -> L56
                goto La0
            L86:
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.util.AtomicThrowable r10 = r1.errors
                r10.addThrowable(r0)
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L9f
                r1.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L9f:
                r0 = 1
            La0:
                int r6 = r6 + 1
                goto L41
            La3:
                r17 = 0
                if (r0 == 0) goto La8
                goto Ldb
            La8:
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r1.zipper     // Catch: java.lang.Throwable -> Lc3
                java.lang.Object r6 = r5.clone()     // Catch: java.lang.Throwable -> Lc3
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> Lc3
                java.lang.String r6 = "The zipper returned a null value"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r6)     // Catch: java.lang.Throwable -> Lc3
                r2.onNext(r0)
                r10 = 1
                long r12 = r12 + r10
                java.util.Arrays.fill(r5, r14)
                goto L1a
            Lc3:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r3 = r1.errors
                r3.addThrowable(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Ld9:
                r17 = 0
            Ldb:
                if (r16 != 0) goto L158
                boolean r0 = r1.cancelled
                if (r0 == 0) goto Le3
                goto L17d
            Le3:
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto Lfc
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto Lfc
                r1.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Lfc:
                r6 = 0
            Lfd:
                if (r6 >= r4) goto L158
                r0 = r3[r6]
                r10 = r5[r6]
                if (r10 != 0) goto L155
                boolean r10 = r0.done     // Catch: java.lang.Throwable -> L110
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r0.queue     // Catch: java.lang.Throwable -> L110
                if (r0 == 0) goto L112
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L110
                goto L113
            L110:
                r0 = move-exception
                goto L13c
            L112:
                r0 = r14
            L113:
                if (r0 != 0) goto L117
                r11 = 1
                goto L118
            L117:
                r11 = 0
            L118:
                if (r10 == 0) goto L137
                if (r11 == 0) goto L137
                r1.cancelAll()     // Catch: java.lang.Throwable -> L110
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L110
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L110
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L110
                if (r0 == 0) goto L133
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L110
                java.lang.Throwable r0 = r0.terminate()     // Catch: java.lang.Throwable -> L110
                r2.onError(r0)     // Catch: java.lang.Throwable -> L110
                goto L17d
            L133:
                r2.onComplete()     // Catch: java.lang.Throwable -> L110
                goto L17d
            L137:
                if (r11 != 0) goto L155
                r5[r6] = r0     // Catch: java.lang.Throwable -> L110
                goto L155
            L13c:
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.util.AtomicThrowable r10 = r1.errors
                r10.addThrowable(r0)
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L155
                r1.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L155:
                int r6 = r6 + 1
                goto Lfd
            L158:
                int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
                if (r0 == 0) goto L176
                int r0 = r3.length
            L15d:
                if (r15 >= r0) goto L167
                r6 = r3[r15]
                r6.request(r12)
                int r15 = r15 + 1
                goto L15d
            L167:
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 == 0) goto L176
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r8 = -r12
                r0.addAndGet(r8)
            L176:
                int r0 = -r7
                int r7 = r1.addAndGet(r0)
                if (r7 != 0) goto L12
            L17d:
                return
        }

        void error(io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto Lf
                r3 = 1
                r2.done = r3
                r1.drain()
                return
            Lf:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
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

        void subscribe(org.reactivestreams.Publisher<? extends T>[] r5, int r6) {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber<T, R>[] r0 = r4.subscribers
                r1 = 0
            L3:
                if (r1 >= r6) goto L24
                boolean r2 = r4.done
                if (r2 != 0) goto L24
                boolean r2 = r4.cancelled
                if (r2 != 0) goto L24
                boolean r2 = r4.delayErrors
                if (r2 != 0) goto L1a
                io.reactivex.internal.util.AtomicThrowable r2 = r4.errors
                java.lang.Object r2 = r2.get()
                if (r2 == 0) goto L1a
                goto L24
            L1a:
                r2 = r5[r1]
                r3 = r0[r1]
                r2.subscribe(r3)
                int r1 = r1 + 1
                goto L3
            L24:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ZipSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int index;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;

        ZipSubscriber(io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.prefetch = r2
                r0.index = r3
                int r1 = r2 >> 2
                int r2 = r2 - r1
                r0.limit = r2
                return
        }

        public void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r0 = r1.parent
                r0.drain()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r0 = r1.parent
                r0.error(r1, r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.sourceMode
                r1 = 2
                if (r0 == r1) goto La
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r2.queue
                r0.offer(r3)
            La:
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r3 = r2.parent
                r3.drain()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r3, r4)
                if (r0 == 0) goto L3e
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L2f
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r4 = r3.parent
                r4.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L2f
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L2f:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L3e:
                return
        }

        public void request(long r4) {
                r3 = this;
                int r0 = r3.sourceMode
                r1 = 1
                if (r0 == r1) goto L1f
                long r0 = r3.produced
                long r0 = r0 + r4
                int r4 = r3.limit
                long r4 = (long) r4
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 < 0) goto L1d
                r4 = 0
                r3.produced = r4
                java.lang.Object r4 = r3.get()
                org.reactivestreams.Subscription r4 = (org.reactivestreams.Subscription) r4
                r4.request(r0)
                return
            L1d:
                r3.produced = r0
            L1f:
                return
        }
    }

    public FlowableZip(org.reactivestreams.Publisher<? extends T>[] r1, java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            r0.zipper = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r8) {
            r7 = this;
            org.reactivestreams.Publisher<? extends T>[] r0 = r7.sources
            if (r0 != 0) goto L30
            r0 = 8
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1 = r7.sourcesIterable
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r1.next()
            org.reactivestreams.Publisher r4 = (org.reactivestreams.Publisher) r4
            int r5 = r0.length
            if (r3 != r5) goto L28
            int r5 = r3 >> 2
            int r5 = r5 + r3
            org.reactivestreams.Publisher[] r5 = new org.reactivestreams.Publisher[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            r0 = r5
        L28:
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
            goto L10
        L2e:
            r4 = r3
            goto L32
        L30:
            int r3 = r0.length
            goto L2e
        L32:
            if (r4 != 0) goto L38
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r8)
            return
        L38:
            io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator r1 = new io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3 = r7.zipper
            int r5 = r7.bufferSize
            boolean r6 = r7.delayError
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r2.onSubscribe(r1)
            r1.subscribe(r0, r4)
            return
    }
}

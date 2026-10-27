package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableFlatMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
    final int maxConcurrency;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> parent;
        long produced;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> queue;

        InnerSubscriber(io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.id = r2
                r0.parent = r1
                int r1 = r1.bufferSize
                r0.bufferSize = r1
                int r1 = r1 >> 2
                r0.limit = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r1.parent
                r0.drain()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r1.parent
                io.reactivex.internal.util.AtomicThrowable r0 = r0.errs
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L13
                r2 = 1
                r1.done = r2
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r2 = r1.parent
                r2.drain()
                return
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void onNext(U r3) {
                r2 = this;
                int r0 = r2.fusionMode
                r1 = 2
                if (r0 == r1) goto Lb
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r2.parent
                r0.tryEmit(r3, r2)
                return
            Lb:
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r3 = r2.parent
                r3.drain()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r3, r4)
                if (r0 == 0) goto L2e
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L28
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.fusionMode = r1
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r4 = r3.parent
                r4.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L28
                r3.fusionMode = r1
                r3.queue = r0
            L28:
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
            L2e:
                return
        }

        void requestMore(long r4) {
                r3 = this;
                int r0 = r3.fusionMode
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MergeSubscriber<T, U> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription, org.reactivestreams.Subscriber<T> {
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] CANCELLED = null;
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        final org.reactivestreams.Subscriber<? super U> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errs;
        long lastId;
        int lastIndex;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
        final int maxConcurrency;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription s;
        int scalarEmitted;
        final int scalarLimit;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r1 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED = r0
                return
        }

        MergeSubscriber(org.reactivestreams.Subscriber<? super U> r3, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r4, boolean r5, int r6, int r7) {
                r2 = this;
                r2.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r2.errs = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.subscribers = r0
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r2.requested = r1
                r2.actual = r3
                r2.mapper = r4
                r2.delayErrors = r5
                r2.maxConcurrency = r6
                r2.bufferSize = r7
                r3 = 1
                int r4 = r6 >> 1
                int r3 = java.lang.Math.max(r3, r4)
                r2.scalarLimit = r3
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r3 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY
                r0.lazySet(r3)
                return
        }

        void addInner(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED
                if (r0 != r1) goto L10
                r5.dispose()
                return
            L10:
                int r1 = r0.length
                int r2 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r2 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r2]
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r2, r3, r1)
                r2[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r1 = r4.subscribers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
                if (r0 == 0) goto L0
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1c
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
                r1.disposeAll()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1c
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                if (r0 == 0) goto L1c
                r0.clear()
            L1c:
                return
        }

        boolean checkTerminate() {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 1
                if (r0 == 0) goto Ld
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                if (r0 == 0) goto Lc
                r0.clear()
            Lc:
                return r1
            Ld:
                boolean r0 = r3.delayErrors
                if (r0 != 0) goto L25
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errs
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L25
                org.reactivestreams.Subscriber<? super U> r0 = r3.actual
                io.reactivex.internal.util.AtomicThrowable r2 = r3.errs
                java.lang.Throwable r2 = r2.terminate()
                r0.onError(r2)
                return r1
            L25:
                r0 = 0
                return r0
        }

        void disposeAll() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED
                if (r0 == r1) goto L31
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                if (r0 == r1) goto L31
                int r1 = r0.length
                r2 = 0
            L18:
                if (r2 >= r1) goto L22
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L18
            L22:
                io.reactivex.internal.util.AtomicThrowable r0 = r4.errs
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L31
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r1) goto L31
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L31:
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r24 = this;
                r1 = r24
                org.reactivestreams.Subscriber<? super U> r2 = r1.actual
                r4 = 1
            L5:
                boolean r0 = r1.checkTerminate()
                if (r0 == 0) goto Ld
                goto L1a1
            Ld:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r5 = r5.get()
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 != 0) goto L20
                r10 = 1
                goto L21
            L20:
                r10 = 0
            L21:
                r12 = 1
                r14 = 0
                if (r0 == 0) goto L6f
                r16 = r14
            L29:
                r7 = r14
                r18 = 0
            L2c:
                int r19 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r19 == 0) goto L4d
                r19 = 1
                java.lang.Object r3 = r0.poll()
                boolean r18 = r1.checkTerminate()
                if (r18 == 0) goto L3e
                goto L1a1
            L3e:
                if (r3 != 0) goto L43
                r18 = r3
                goto L4f
            L43:
                r2.onNext(r3)
                long r16 = r16 + r12
                long r7 = r7 + r12
                long r5 = r5 - r12
                r18 = r3
                goto L2c
            L4d:
                r19 = 1
            L4f:
                int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r3 == 0) goto L62
                if (r10 == 0) goto L5b
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L62
            L5b:
                java.util.concurrent.atomic.AtomicLong r3 = r1.requested
                long r5 = -r7
                long r5 = r3.addAndGet(r5)
            L62:
                int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r3 == 0) goto L73
                if (r18 != 0) goto L69
                goto L73
            L69:
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L29
            L6f:
                r19 = 1
                r16 = r14
            L73:
                boolean r0 = r1.done
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r3 = r1.queue
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r7 = r1.subscribers
                java.lang.Object r7 = r7.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r7 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r7
                int r8 = r7.length
                if (r0 == 0) goto L9e
                if (r3 == 0) goto L8a
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L9e
            L8a:
                if (r8 != 0) goto L9e
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errs
                java.lang.Throwable r0 = r0.terminate()
                if (r0 != 0) goto L99
                r2.onComplete()
                goto L1a1
            L99:
                r2.onError(r0)
                goto L1a1
            L9e:
                if (r8 == 0) goto L185
                r18 = r10
                long r9 = r1.lastId
                int r0 = r1.lastIndex
                if (r8 <= r0) goto Lb3
                r3 = r7[r0]
                r20 = r12
                long r11 = r3.id
                int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r3 == 0) goto Ld4
                goto Lb5
            Lb3:
                r20 = r12
            Lb5:
                if (r8 > r0) goto Lb8
                r0 = 0
            Lb8:
                r3 = 0
            Lb9:
                if (r3 >= r8) goto Lcc
                r11 = r7[r0]
                long r11 = r11.id
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 != 0) goto Lc4
                goto Lcc
            Lc4:
                int r0 = r0 + 1
                if (r0 != r8) goto Lc9
                r0 = 0
            Lc9:
                int r3 = r3 + 1
                goto Lb9
            Lcc:
                r1.lastIndex = r0
                r3 = r7[r0]
                long r9 = r3.id
                r1.lastId = r9
            Ld4:
                r3 = r0
                r0 = 0
                r9 = 0
            Ld7:
                if (r9 >= r8) goto L177
                boolean r10 = r1.checkTerminate()
                if (r10 == 0) goto Le1
                goto L1a1
            Le1:
                r10 = r7[r3]
                r11 = 0
            Le4:
                boolean r12 = r1.checkTerminate()
                if (r12 == 0) goto Lec
                goto L1a1
            Lec:
                io.reactivex.internal.fuseable.SimpleQueue<U> r12 = r10.queue
                if (r12 != 0) goto Lf3
                r22 = r14
                goto L14b
            Lf3:
                r22 = r14
            Lf5:
                int r13 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
                if (r13 == 0) goto L12b
                java.lang.Object r11 = r12.poll()     // Catch: java.lang.Throwable -> L110
                if (r11 != 0) goto L100
                goto L12b
            L100:
                r2.onNext(r11)
                boolean r13 = r1.checkTerminate()
                if (r13 == 0) goto L10b
                goto L1a1
            L10b:
                long r5 = r5 - r20
                long r14 = r14 + r20
                goto Lf5
            L110:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r10.dispose()
                io.reactivex.internal.util.AtomicThrowable r11 = r1.errs
                r11.addThrowable(r0)
                boolean r0 = r1.checkTerminate()
                if (r0 == 0) goto L124
                goto L1a1
            L124:
                r1.removeInner(r10)
                int r9 = r9 + 1
                r0 = 1
                goto L171
            L12b:
                int r12 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
                if (r12 == 0) goto L141
                if (r18 != 0) goto L139
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r12 = -r14
                long r5 = r5.addAndGet(r12)
                goto L13e
            L139:
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L13e:
                r10.requestMore(r14)
            L141:
                int r12 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
                if (r12 == 0) goto L14b
                if (r11 != 0) goto L148
                goto L14b
            L148:
                r14 = r22
                goto Le4
            L14b:
                boolean r11 = r10.done
                io.reactivex.internal.fuseable.SimpleQueue<U> r12 = r10.queue
                if (r11 == 0) goto L166
                if (r12 == 0) goto L159
                boolean r11 = r12.isEmpty()
                if (r11 == 0) goto L166
            L159:
                r1.removeInner(r10)
                boolean r0 = r1.checkTerminate()
                if (r0 == 0) goto L163
                goto L1a1
            L163:
                long r16 = r16 + r20
                r0 = 1
            L166:
                int r10 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
                if (r10 != 0) goto L16c
            L16a:
                r9 = r0
                goto L17a
            L16c:
                int r3 = r3 + 1
                if (r3 != r8) goto L171
                r3 = 0
            L171:
                int r9 = r9 + 1
                r14 = r22
                goto Ld7
            L177:
                r22 = r14
                goto L16a
            L17a:
                r1.lastIndex = r3
                r0 = r7[r3]
                long r5 = r0.id
                r1.lastId = r5
            L182:
                r5 = r16
                goto L189
            L185:
                r22 = r14
                r9 = 0
                goto L182
            L189:
                int r0 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
                if (r0 == 0) goto L196
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L196
                org.reactivestreams.Subscription r0 = r1.s
                r0.request(r5)
            L196:
                if (r9 == 0) goto L19a
                goto L5
            L19a:
                int r0 = -r4
                int r4 = r1.addAndGet(r0)
                if (r4 != 0) goto L5
            L1a1:
                return
        }

        io.reactivex.internal.fuseable.SimpleQueue<U> getInnerQueue(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r3) {
                r2 = this;
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r3.queue
                if (r0 != 0) goto Ld
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                r3.queue = r0
            Ld:
                return r0
        }

        io.reactivex.internal.fuseable.SimpleQueue<U> getMainQueue() {
                r2 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                if (r0 != 0) goto L1c
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L13
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                goto L1a
            L13:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r2.maxConcurrency
                r0.<init>(r1)
            L1a:
                r2.queue = r0
            L1c:
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
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errs
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L17
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            L17:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                goto L41
            L5:
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r0 = r5.mapper     // Catch: java.lang.Throwable -> L62
                java.lang.Object r6 = r0.apply(r6)     // Catch: java.lang.Throwable -> L62
                java.lang.String r0 = "The mapper returned a null Publisher"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)     // Catch: java.lang.Throwable -> L62
                org.reactivestreams.Publisher r6 = (org.reactivestreams.Publisher) r6     // Catch: java.lang.Throwable -> L62
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L4f
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6     // Catch: java.lang.Throwable -> L42
                java.lang.Object r6 = r6.call()     // Catch: java.lang.Throwable -> L42
                if (r6 == 0) goto L23
                r5.tryEmitScalar(r6)
                return
            L23:
                int r6 = r5.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L41
                boolean r6 = r5.cancelled
                if (r6 != 0) goto L41
                int r6 = r5.scalarEmitted
                int r6 = r6 + 1
                r5.scalarEmitted = r6
                int r0 = r5.scalarLimit
                if (r6 != r0) goto L41
                r6 = 0
                r5.scalarEmitted = r6
                org.reactivestreams.Subscription r6 = r5.s
                long r0 = (long) r0
                r6.request(r0)
            L41:
                return
            L42:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.internal.util.AtomicThrowable r0 = r5.errs
                r0.addThrowable(r6)
                r5.drain()
                return
            L4f:
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber
                long r1 = r5.uniqueId
                r3 = 1
                long r3 = r3 + r1
                r5.uniqueId = r3
                r0.<init>(r5, r1)
                r5.addInner(r0)
                r6.subscribe(r0)
                return
            L62:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                org.reactivestreams.Subscription r0 = r5.s
                r0.cancel()
                r5.onError(r6)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L27
                r2.s = r3
                org.reactivestreams.Subscriber<? super U> r0 = r2.actual
                r0.onSubscribe(r2)
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L27
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L23
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                return
            L23:
                long r0 = (long) r0
                r3.request(r0)
            L27:
                return
        }

        void removeInner(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED
                if (r0 == r1) goto L3f
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY
                if (r0 != r1) goto L11
                goto L3f
            L11:
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L14:
                if (r3 >= r1) goto L1e
                r4 = r0[r3]
                if (r4 != r7) goto L1b
                goto L1f
            L1b:
                int r3 = r3 + 1
                goto L14
            L1e:
                r3 = -1
            L1f:
                if (r3 >= 0) goto L22
                goto L3f
            L22:
                r4 = 1
                if (r1 != r4) goto L28
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY
                goto L37
            L28:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r5 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L37:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r2 = r6.subscribers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L3f:
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

        void tryEmit(U r8, io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r9) {
                r7 = this;
                int r0 = r7.get()
                java.lang.String r1 = "Inner queue full?!"
                if (r0 != 0) goto L5b
                r0 = 0
                r2 = 1
                boolean r0 = r7.compareAndSet(r0, r2)
                if (r0 == 0) goto L5b
                java.util.concurrent.atomic.AtomicLong r0 = r7.requested
                long r2 = r0.get()
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r9.queue
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L3f
                if (r0 == 0) goto L26
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L3f
            L26:
                org.reactivestreams.Subscriber<? super U> r0 = r7.actual
                r0.onNext(r8)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r8 == 0) goto L39
                java.util.concurrent.atomic.AtomicLong r8 = r7.requested
                r8.decrementAndGet()
            L39:
                r0 = 1
                r9.requestMore(r0)
                goto L54
            L3f:
                if (r0 != 0) goto L45
                io.reactivex.internal.fuseable.SimpleQueue r0 = r7.getInnerQueue(r9)
            L45:
                boolean r8 = r0.offer(r8)
                if (r8 != 0) goto L54
                io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
                r8.<init>(r1)
                r7.onError(r8)
                return
            L54:
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L7e
                goto L7d
            L5b:
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r9.queue
                if (r0 != 0) goto L68
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r2 = r7.bufferSize
                r0.<init>(r2)
                r9.queue = r0
            L68:
                boolean r8 = r0.offer(r8)
                if (r8 != 0) goto L77
                io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
                r8.<init>(r1)
                r7.onError(r8)
                return
            L77:
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L7e
            L7d:
                return
            L7e:
                r7.drainLoop()
                return
        }

        void tryEmitScalar(U r10) {
                r9 = this;
                int r0 = r9.get()
                java.lang.String r1 = "Scalar queue full?!"
                if (r0 != 0) goto L72
                r0 = 0
                r2 = 1
                boolean r3 = r9.compareAndSet(r0, r2)
                if (r3 == 0) goto L72
                java.util.concurrent.atomic.AtomicLong r3 = r9.requested
                long r3 = r3.get()
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r5 = r9.queue
                r6 = 0
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 == 0) goto L56
                if (r5 == 0) goto L26
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L56
            L26:
                org.reactivestreams.Subscriber<? super U> r1 = r9.actual
                r1.onNext(r10)
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 == 0) goto L39
                java.util.concurrent.atomic.AtomicLong r10 = r9.requested
                r10.decrementAndGet()
            L39:
                int r10 = r9.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r10 == r1) goto L6b
                boolean r10 = r9.cancelled
                if (r10 != 0) goto L6b
                int r10 = r9.scalarEmitted
                int r10 = r10 + r2
                r9.scalarEmitted = r10
                int r1 = r9.scalarLimit
                if (r10 != r1) goto L6b
                r9.scalarEmitted = r0
                org.reactivestreams.Subscription r10 = r9.s
                long r0 = (long) r1
                r10.request(r0)
                goto L6b
            L56:
                if (r5 != 0) goto L5c
                io.reactivex.internal.fuseable.SimpleQueue r5 = r9.getMainQueue()
            L5c:
                boolean r10 = r5.offer(r10)
                if (r10 != 0) goto L6b
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r1)
                r9.onError(r10)
                return
            L6b:
                int r10 = r9.decrementAndGet()
                if (r10 != 0) goto L8c
                goto L8b
            L72:
                io.reactivex.internal.fuseable.SimpleQueue r0 = r9.getMainQueue()
                boolean r10 = r0.offer(r10)
                if (r10 != 0) goto L85
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r1)
                r9.onError(r10)
                return
            L85:
                int r10 = r9.getAndIncrement()
                if (r10 == 0) goto L8c
            L8b:
                return
            L8c:
                r9.drainLoop()
                return
        }
    }

    public FlowableFlatMap(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            r0.bufferSize = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r8) {
            r7 = this;
            org.reactivestreams.Publisher<T> r0 = r7.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r1 = r7.mapper
            boolean r0 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(r0, r8, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            org.reactivestreams.Publisher<T> r0 = r7.source
            io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r3 = r7.mapper
            boolean r4 = r7.delayErrors
            int r5 = r7.maxConcurrency
            int r6 = r7.bufferSize
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r1)
            return
    }
}

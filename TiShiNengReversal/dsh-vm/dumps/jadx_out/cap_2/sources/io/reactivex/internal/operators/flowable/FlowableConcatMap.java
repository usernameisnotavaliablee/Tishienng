package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int prefetch;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode = null;

        static {
                io.reactivex.internal.util.ErrorMode[] r0 = io.reactivex.internal.util.ErrorMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.FlowableConcatMap.AnonymousClass1.$SwitchMap$io$reactivex$internal$util$ErrorMode = r0
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.BOUNDARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableConcatMap.AnonymousClass1.$SwitchMap$io$reactivex$internal$util$ErrorMode     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class BaseConcatMapSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T>, io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapInner<R> inner;
        final int limit;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        org.reactivestreams.Subscription s;
        int sourceMode;

        BaseConcatMapSubscriber(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mapper = r1
                r0.prefetch = r2
                int r1 = r2 >> 2
                int r2 = r2 - r1
                r0.limit = r2
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner r1 = new io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner
                r1.<init>(r0)
                r0.inner = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                return
        }

        abstract void drain();

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
                r1 = this;
                r0 = 0
                r1.active = r0
                r1.drain()
                return
        }

        public final void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        public final void onNext(T r3) {
                r2 = this;
                int r0 = r2.sourceMode
                r1 = 2
                if (r0 == r1) goto L1d
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r2.queue
                boolean r3 = r0.offer(r3)
                if (r3 != 0) goto L1d
                org.reactivestreams.Subscription r3 = r2.s
                r3.cancel()
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Queue full?!"
                r3.<init>(r0)
                r2.onError(r3)
                return
            L1d:
                r2.drain()
                return
        }

        public final void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L49
                r3.s = r4
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L37
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L26
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                r3.subscribeActual()
                r3.drain()
                return
            L26:
                r2 = 2
                if (r1 != r2) goto L37
                r3.sourceMode = r1
                r3.queue = r0
                r3.subscribeActual()
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L37:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                r3.subscribeActual()
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L49:
                return
        }

        abstract void subscribeActual();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ConcatMapDelayed<T, R> extends io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final org.reactivestreams.Subscriber<? super R> actual;
        final boolean veryEnd;

        ConcatMapDelayed(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.actual = r1
                r0.veryEnd = r4
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L11
                r0 = 1
                r1.cancelled = r0
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r0 = r1.inner
                r0.cancel()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
            L11:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void drain() {
                r6 = this;
                int r0 = r6.getAndIncrement()
                if (r0 != 0) goto Lfe
            L6:
                boolean r0 = r6.cancelled
                if (r0 == 0) goto Lc
                goto Lfe
            Lc:
                boolean r0 = r6.active
                if (r0 != 0) goto Lf8
                boolean r0 = r6.done
                if (r0 == 0) goto L2e
                boolean r1 = r6.veryEnd
                if (r1 != 0) goto L2e
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L2e
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L2e:
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r6.queue     // Catch: java.lang.Throwable -> Lde
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> Lde
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L3a
                r4 = 1
                goto L3b
            L3a:
                r4 = 0
            L3b:
                if (r0 == 0) goto L53
                if (r4 == 0) goto L53
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L4d
                org.reactivestreams.Subscriber<? super R> r1 = r6.actual
                r1.onError(r0)
                return
            L4d:
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                r0.onComplete()
                return
            L53:
                if (r4 != 0) goto Lf8
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r0 = r6.mapper     // Catch: java.lang.Throwable -> Lc4
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r1 = "The mapper returned a null Publisher"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> Lc4
                org.reactivestreams.Publisher r0 = (org.reactivestreams.Publisher) r0     // Catch: java.lang.Throwable -> Lc4
                int r1 = r6.sourceMode
                if (r1 == r3) goto L79
                int r1 = r6.consumed
                int r1 = r1 + r3
                int r4 = r6.limit
                if (r1 != r4) goto L77
                r6.consumed = r2
                org.reactivestreams.Subscription r2 = r6.s
                long r4 = (long) r1
                r2.request(r4)
                goto L79
            L77:
                r6.consumed = r1
            L79:
                boolean r1 = r0 instanceof java.util.concurrent.Callable
                if (r1 == 0) goto Lbc
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> La2
                if (r0 != 0) goto L86
                goto L6
            L86:
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r1 = r6.inner
                boolean r1 = r1.isUnbounded()
                if (r1 == 0) goto L95
                org.reactivestreams.Subscriber<? super R> r1 = r6.actual
                r1.onNext(r0)
                goto L6
            L95:
                r6.active = r3
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r1 = r6.inner
                io.reactivex.internal.operators.flowable.FlowableConcatMap$WeakScalarSubscription r2 = new io.reactivex.internal.operators.flowable.FlowableConcatMap$WeakScalarSubscription
                r2.<init>(r0, r1)
                r1.setSubscription(r2)
                goto Lf8
            La2:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r1 = r6.s
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lbc:
                r6.active = r3
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r1 = r6.inner
                r0.subscribe(r1)
                goto Lf8
            Lc4:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r1 = r6.s
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lde:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r1 = r6.s
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lf8:
                int r0 = r6.decrementAndGet()
                if (r0 != 0) goto L6
            Lfe:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1b
                boolean r2 = r1.veryEnd
                if (r2 != 0) goto L14
                org.reactivestreams.Subscription r2 = r1.s
                r2.cancel()
                r2 = 1
                r1.done = r2
            L14:
                r2 = 0
                r1.active = r2
                r1.drain()
                return
            L1b:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lf
                r2 = 1
                r1.done = r2
                r1.drain()
                return
            Lf:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void request(long r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r0 = r1.inner
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void subscribeActual() {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onSubscribe(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ConcatMapImmediate<T, R> extends io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final org.reactivestreams.Subscriber<? super R> actual;
        final java.util.concurrent.atomic.AtomicInteger wip;

        ConcatMapImmediate(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.actual = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L11
                r0 = 1
                r1.cancelled = r0
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r0 = r1.inner
                r0.cancel()
                org.reactivestreams.Subscription r0 = r1.s
                r0.cancel()
            L11:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void drain() {
                r7 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r7.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Lf4
            L8:
                boolean r0 = r7.cancelled
                if (r0 == 0) goto Le
                goto Lf4
            Le:
                boolean r0 = r7.active
                if (r0 != 0) goto Lec
                boolean r0 = r7.done
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r7.queue     // Catch: java.lang.Throwable -> Ld2
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> Ld2
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L20
                r4 = 1
                goto L21
            L20:
                r4 = 0
            L21:
                if (r0 == 0) goto L2b
                if (r4 == 0) goto L2b
                org.reactivestreams.Subscriber<? super R> r0 = r7.actual
                r0.onComplete()
                return
            L2b:
                if (r4 != 0) goto Lec
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r0 = r7.mapper     // Catch: java.lang.Throwable -> Lb8
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r1 = "The mapper returned a null Publisher"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> Lb8
                org.reactivestreams.Publisher r0 = (org.reactivestreams.Publisher) r0     // Catch: java.lang.Throwable -> Lb8
                int r1 = r7.sourceMode
                if (r1 == r3) goto L51
                int r1 = r7.consumed
                int r1 = r1 + r3
                int r4 = r7.limit
                if (r1 != r4) goto L4f
                r7.consumed = r2
                org.reactivestreams.Subscription r4 = r7.s
                long r5 = (long) r1
                r4.request(r5)
                goto L51
            L4f:
                r7.consumed = r1
            L51:
                boolean r1 = r0 instanceof java.util.concurrent.Callable
                if (r1 == 0) goto Lb0
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L96
                if (r0 != 0) goto L5e
                goto L8
            L5e:
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r1 = r7.inner
                boolean r1 = r1.isUnbounded()
                if (r1 == 0) goto L89
                int r1 = r7.get()
                if (r1 != 0) goto L8
                boolean r1 = r7.compareAndSet(r2, r3)
                if (r1 == 0) goto L8
                org.reactivestreams.Subscriber<? super R> r1 = r7.actual
                r1.onNext(r0)
                boolean r0 = r7.compareAndSet(r3, r2)
                if (r0 != 0) goto L8
                org.reactivestreams.Subscriber<? super R> r0 = r7.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L89:
                r7.active = r3
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r1 = r7.inner
                io.reactivex.internal.operators.flowable.FlowableConcatMap$WeakScalarSubscription r2 = new io.reactivex.internal.operators.flowable.FlowableConcatMap$WeakScalarSubscription
                r2.<init>(r0, r1)
                r1.setSubscription(r2)
                goto Lec
            L96:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r1 = r7.s
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r7.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lb0:
                r7.active = r3
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r1 = r7.inner
                r0.subscribe(r1)
                goto Lec
            Lb8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r1 = r7.s
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r7.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Ld2:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r1 = r7.s
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r7.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r7.errors
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lec:
                java.util.concurrent.atomic.AtomicInteger r0 = r7.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L8
            Lf4:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1f
                org.reactivestreams.Subscription r2 = r1.s
                r2.cancel()
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L1e
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
            L1e:
                return
            L1f:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r4) {
                r3 = this;
                int r0 = r3.get()
                if (r0 != 0) goto L25
                r0 = 0
                r1 = 1
                boolean r2 = r3.compareAndSet(r0, r1)
                if (r2 == 0) goto L25
                org.reactivestreams.Subscriber<? super R> r2 = r3.actual
                r2.onNext(r4)
                boolean r4 = r3.compareAndSet(r1, r0)
                if (r4 == 0) goto L1a
                goto L25
            L1a:
                org.reactivestreams.Subscriber<? super R> r4 = r3.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errors
                java.lang.Throwable r0 = r0.terminate()
                r4.onError(r0)
            L25:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1f
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r2 = r1.inner
                r2.cancel()
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L1e
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
            L1e:
                return
            L1f:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void request(long r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapInner<R> r0 = r1.inner
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void subscribeActual() {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onSubscribe(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ConcatMapInner<R> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements org.reactivestreams.Subscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R> parent;
        long produced;

        ConcatMapInner(io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void onComplete() {
                r5 = this;
                long r0 = r5.produced
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Ld
                r5.produced = r2
                r5.produced(r0)
            Ld:
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport<R> r0 = r5.parent
                r0.innerComplete()
                return
        }

        public void onError(java.lang.Throwable r6) {
                r5 = this;
                long r0 = r5.produced
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Ld
                r5.produced = r2
                r5.produced(r0)
            Ld:
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport<R> r0 = r5.parent
                r0.innerError(r6)
                return
        }

        public void onNext(R r5) {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapSupport<R> r0 = r4.parent
                r0.innerNext(r5)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r1) {
                r0 = this;
                r0.setSubscription(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(java.lang.Throwable r1);

        void innerNext(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WeakScalarSubscription<T> implements org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean once;
        final T value;

        WeakScalarSubscription(T r1, org.reactivestreams.Subscriber<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.actual = r2
                return
        }

        public void cancel() {
                r0 = this;
                return
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L17
                boolean r4 = r3.once
                if (r4 != 0) goto L17
                r4 = 1
                r3.once = r4
                org.reactivestreams.Subscriber<? super T> r4 = r3.actual
                T r5 = r3.value
                r4.onNext(r5)
                r4.onComplete()
            L17:
                return
        }
    }

    public FlowableConcatMap(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, io.reactivex.internal.util.ErrorMode r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.prefetch = r3
            r0.errorMode = r4
            return
    }

    public static <T, R> org.reactivestreams.Subscriber<T> subscribe(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, int r4, io.reactivex.internal.util.ErrorMode r5) {
            int[] r0 = io.reactivex.internal.operators.flowable.FlowableConcatMap.AnonymousClass1.$SwitchMap$io$reactivex$internal$util$ErrorMode
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            if (r5 == r0) goto L1a
            r1 = 2
            if (r5 == r1) goto L14
            io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapImmediate r5 = new io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapImmediate
            r5.<init>(r2, r3, r4)
            return r5
        L14:
            io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed r5 = new io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed
            r5.<init>(r2, r3, r4, r0)
            return r5
        L1a:
            io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed r5 = new io.reactivex.internal.operators.flowable.FlowableConcatMap$ConcatMapDelayed
            r0 = 0
            r5.<init>(r2, r3, r4, r0)
            return r5
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r4.mapper
            boolean r0 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(r0, r5, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r4.mapper
            int r2 = r4.prefetch
            io.reactivex.internal.util.ErrorMode r3 = r4.errorMode
            org.reactivestreams.Subscriber r5 = subscribe(r5, r1, r2, r3)
            r0.subscribe(r5)
            return
    }
}

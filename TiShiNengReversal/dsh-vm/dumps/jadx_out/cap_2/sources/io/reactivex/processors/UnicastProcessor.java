package io.reactivex.processors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnicastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> actual;
    volatile boolean cancelled;
    volatile boolean done;
    boolean enableOperatorFusion;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> onTerminate;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
    final java.util.concurrent.atomic.AtomicLong requested;
    final io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> wip;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class UnicastQueueSubscription extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;
        final /* synthetic */ io.reactivex.processors.UnicastProcessor this$0;

        UnicastQueueSubscription(io.reactivex.processors.UnicastProcessor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void cancel() {
                r2 = this;
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                boolean r0 = r0.cancelled
                if (r0 == 0) goto L7
                goto L2e
            L7:
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                r1 = 1
                r0.cancelled = r1
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                r0.doTerminate()
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                boolean r1 = r0.enableOperatorFusion
                if (r1 != 0) goto L2e
                io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r0.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L2e
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r0.actual
                r1 = 0
                r0.lazySet(r1)
            L2e:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r1 = this;
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                java.lang.Object r0 = r0.poll()
                return r0
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L12
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                java.util.concurrent.atomic.AtomicLong r0 = r0.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                io.reactivex.processors.UnicastProcessor r2 = r1.this$0
                r2.drain()
            L12:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r3) {
                r2 = this;
                r0 = 2
                r3 = r3 & r0
                if (r3 == 0) goto La
                io.reactivex.processors.UnicastProcessor r3 = r2.this$0
                r1 = 1
                r3.enableOperatorFusion = r1
                return r0
            La:
                r3 = 0
                return r3
        }
    }

    UnicastProcessor(int r3) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.onTerminate = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription r3 = new io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription
            r3.<init>(r2)
            r2.wip = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>()
            r2.requested = r3
            return
    }

    UnicastProcessor(int r3, java.lang.Runnable r4) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r0 = "onTerminate"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r3.<init>(r4)
            r2.onTerminate = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription r3 = new io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription
            r3.<init>(r2)
            r2.wip = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>()
            r2.requested = r3
            return
    }

    public static <T> io.reactivex.processors.UnicastProcessor<T> create() {
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            int r1 = io.reactivex.Flowable.bufferSize()
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int r1) {
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int r1, java.lang.Runnable r2) {
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            r0.<init>(r1, r2)
            return r0
    }

    boolean checkTerminated(boolean r4, boolean r5, org.reactivestreams.Subscriber<? super T> r6, io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r7) {
            r3 = this;
            boolean r0 = r3.cancelled
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            r7.clear()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r4 = r3.actual
            r4.lazySet(r2)
            return r1
        Lf:
            if (r4 == 0) goto L24
            if (r5 == 0) goto L24
            java.lang.Throwable r4 = r3.error
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r5 = r3.actual
            r5.lazySet(r2)
            if (r4 == 0) goto L20
            r6.onError(r4)
            goto L23
        L20:
            r6.onComplete()
        L23:
            return r1
        L24:
            r4 = 0
            return r4
    }

    void doTerminate() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r0 = r3.onTerminate
            java.lang.Object r0 = r0.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L16
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r1 = r3.onTerminate
            r2 = 0
            boolean r1 = androidx.camera.view.p.a(r1, r0, r2)
            if (r1 == 0) goto L16
            r0.run()
        L16:
            return
    }

    void drain() {
            r2 = this;
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r2.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L9
            goto L29
        L9:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscriber r0 = (org.reactivestreams.Subscriber) r0
            r1 = 1
        L12:
            if (r0 == 0) goto L20
            boolean r1 = r2.enableOperatorFusion
            if (r1 == 0) goto L1c
            r2.drainFused(r0)
            return
        L1c:
            r2.drainRegular(r0)
            return
        L20:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r2.wip
            int r1 = -r1
            int r1 = r0.addAndGet(r1)
            if (r1 != 0) goto L2a
        L29:
            return
        L2a:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscriber r0 = (org.reactivestreams.Subscriber) r0
            goto L12
    }

    void drainFused(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r4.queue
            r1 = 1
        L3:
            boolean r2 = r4.cancelled
            r3 = 0
            if (r2 == 0) goto L11
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r5 = r4.actual
            r5.lazySet(r3)
            return
        L11:
            boolean r2 = r4.done
            r5.onNext(r3)
            if (r2 == 0) goto L29
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r4.actual
            r0.lazySet(r3)
            java.lang.Throwable r0 = r4.error
            if (r0 == 0) goto L25
            r5.onError(r0)
            return
        L25:
            r5.onComplete()
            return
        L29:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r2 = r4.wip
            int r1 = -r1
            int r1 = r2.addAndGet(r1)
            if (r1 != 0) goto L3
            return
    }

    void drainRegular(org.reactivestreams.Subscriber<? super T> r14) {
            r13 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r13.queue
            r1 = 1
            r2 = 1
        L4:
            java.util.concurrent.atomic.AtomicLong r3 = r13.requested
            long r3 = r3.get()
            r5 = 0
            r7 = r5
        Ld:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L2d
            boolean r10 = r13.done
            java.lang.Object r11 = r0.poll()
            if (r11 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            boolean r10 = r13.checkTerminated(r10, r12, r14, r0)
            if (r10 == 0) goto L23
            goto L58
        L23:
            if (r12 == 0) goto L26
            goto L2d
        L26:
            r14.onNext(r11)
            r9 = 1
            long r7 = r7 + r9
            goto Ld
        L2d:
            if (r9 != 0) goto L3c
            boolean r9 = r13.done
            boolean r10 = r0.isEmpty()
            boolean r9 = r13.checkTerminated(r9, r10, r14, r0)
            if (r9 == 0) goto L3c
            goto L58
        L3c:
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L4f
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L4f
            java.util.concurrent.atomic.AtomicLong r3 = r13.requested
            long r4 = -r7
            r3.addAndGet(r4)
        L4f:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r3 = r13.wip
            int r2 = -r2
            int r2 = r3.addAndGet(r2)
            if (r2 != 0) goto L4
        L58:
            return
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L7
            java.lang.Throwable r0 = r1.error
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r1.actual
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L12
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            goto L12
        L9:
            r0 = 1
            r1.done = r0
            r1.doTerminate()
            r1.drain()
        L12:
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L1e
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            goto L1e
        L9:
            if (r2 != 0) goto L12
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
        L12:
            r1.error = r2
            r2 = 1
            r1.done = r2
            r1.doTerminate()
            r1.drain()
            return
        L1e:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L1e
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            goto L1e
        L9:
            if (r2 != 0) goto L16
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
            r1.onError(r2)
            return
        L16:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
            r0.offer(r2)
            r1.drain()
        L1e:
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 != 0) goto L12
            boolean r0 = r2.cancelled
            if (r0 == 0) goto L9
            goto L12
        L9:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            return
        L12:
            r3.cancel()
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            boolean r0 = r0.get()
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2b
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r3.wip
            r4.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r3.actual
            r0.set(r4)
            boolean r4 = r3.cancelled
            if (r4 == 0) goto L27
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r4 = r3.actual
            r0 = 0
            r4.lazySet(r0)
            return
        L27:
            r3.drain()
            return
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This processor allows only a single Subscriber"
            r0.<init>(r1)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
            return
    }
}

package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowablePublish<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> current;
    final org.reactivestreams.Publisher<T> onSubscribe;
    final org.reactivestreams.Publisher<T> source;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final org.reactivestreams.Subscriber<? super T> child;
        volatile io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> parent;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                return
        }

        public void cancel() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1c
                long r0 = r5.getAndSet(r2)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1c
                io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T> r0 = r5.parent
                if (r0 == 0) goto L1c
                r0.remove(r5)
                r0.dispatch()
            L1c:
                return
        }

        public long produced(long r1) {
                r0 = this;
                long r1 = io.reactivex.internal.util.BackpressureHelper.producedCancel(r0, r1)
                return r1
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L10
                io.reactivex.internal.util.BackpressureHelper.addCancel(r1, r2)
                io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T> r2 = r1.parent
                if (r2 == 0) goto L10
                r2.dispatch()
            L10:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PublishSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] TERMINATED = null;
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> current;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> s;
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect;
        int sourceMode;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]> subscribers;
        volatile java.lang.Object terminalEvent;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED = r0
                return
        }

        PublishSubscriber(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> r3, int r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.s = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.EMPTY
                r0.<init>(r1)
                r2.subscribers = r0
                r2.current = r3
                java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
                r3.<init>()
                r2.shouldConnect = r3
                r2.bufferSize = r4
                return
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r3 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r1 = r4.subscribers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        boolean checkTerminated(java.lang.Object r5, boolean r6) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L51
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r5)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2a
                if (r6 == 0) goto L51
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r5 = r4.current
                androidx.camera.view.p.a(r5, r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r5 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r6 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                java.lang.Object r5 = r5.getAndSet(r6)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r5 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r5
                int r6 = r5.length
            L1d:
                if (r0 >= r6) goto L29
                r1 = r5[r0]
                org.reactivestreams.Subscriber<? super T> r1 = r1.child
                r1.onComplete()
                int r0 = r0 + 1
                goto L1d
            L29:
                return r3
            L2a:
                java.lang.Throwable r5 = io.reactivex.internal.util.NotificationLite.getError(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r6 = r4.current
                androidx.camera.view.p.a(r6, r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r6 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                java.lang.Object r6 = r6.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r6 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r6
                int r1 = r6.length
                if (r1 == 0) goto L4d
                int r1 = r6.length
            L41:
                if (r0 >= r1) goto L50
                r2 = r6[r0]
                org.reactivestreams.Subscriber<? super T> r2 = r2.child
                r2.onError(r5)
                int r0 = r0 + 1
                goto L41
            L4d:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L50:
                return r3
            L51:
                return r0
        }

        void dispatch() {
                r21 = this;
                r1 = r21
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto La
                goto L114
            La:
                r2 = 1
                r3 = 1
            Lc:
                java.lang.Object r0 = r1.terminalEvent
                io.reactivex.internal.fuseable.SimpleQueue<T> r4 = r1.queue
                if (r4 == 0) goto L1b
                boolean r6 = r4.isEmpty()
                if (r6 == 0) goto L19
                goto L1b
            L19:
                r6 = 0
                goto L1c
            L1b:
                r6 = 1
            L1c:
                boolean r0 = r1.checkTerminated(r0, r6)
                if (r0 == 0) goto L24
                goto L114
            L24:
                if (r6 != 0) goto L10d
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r0 = r1.subscribers
                java.lang.Object r0 = r0.get()
                r7 = r0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r7 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r7
                int r0 = r7.length
                int r8 = r7.length
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                r12 = 0
            L38:
                r13 = 0
                if (r11 >= r8) goto L5b
                r15 = r7[r11]
                r16 = r6
                long r5 = r15.get()
                int r15 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r15 < 0) goto L4e
                long r5 = java.lang.Math.min(r9, r5)
                r9 = r5
                goto L56
            L4e:
                r13 = -9223372036854775808
                int r15 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r15 != 0) goto L56
                int r12 = r12 + 1
            L56:
                int r11 = r11 + 1
                r6 = r16
                goto L38
            L5b:
                r16 = r6
                r5 = 1
                if (r0 != r12) goto L9c
                java.lang.Object r0 = r1.terminalEvent
                java.lang.Object r8 = r4.poll()     // Catch: java.lang.Throwable -> L68
                goto L7e
            L68:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r1.s
                java.lang.Object r4 = r4.get()
                org.reactivestreams.Subscription r4 = (org.reactivestreams.Subscription) r4
                r4.cancel()
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.error(r0)
                r1.terminalEvent = r0
                r8 = 0
            L7e:
                if (r8 != 0) goto L82
                r4 = 1
                goto L83
            L82:
                r4 = 0
            L83:
                boolean r0 = r1.checkTerminated(r0, r4)
                if (r0 == 0) goto L8b
                goto L114
            L8b:
                int r0 = r1.sourceMode
                if (r0 == r2) goto Lc
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.request(r5)
                goto Lc
            L9c:
                r17 = r9
                r11 = 0
            L9f:
                long r8 = (long) r11
                int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
                if (r0 >= 0) goto Lf4
                java.lang.Object r0 = r1.terminalEvent
                java.lang.Object r12 = r4.poll()     // Catch: java.lang.Throwable -> Lab
                goto Lc1
            Lab:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r12 = r1.s
                java.lang.Object r12 = r12.get()
                org.reactivestreams.Subscription r12 = (org.reactivestreams.Subscription) r12
                r12.cancel()
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.error(r0)
                r1.terminalEvent = r0
                r12 = 0
            Lc1:
                if (r12 != 0) goto Lc5
                r15 = 1
                goto Lc6
            Lc5:
                r15 = 0
            Lc6:
                boolean r0 = r1.checkTerminated(r0, r15)
                if (r0 == 0) goto Lcd
                goto L114
            Lcd:
                if (r15 == 0) goto Ld2
                r16 = r15
                goto Lf4
            Ld2:
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.getValue(r12)
                int r8 = r7.length
                r9 = 0
            Ld8:
                if (r9 >= r8) goto Lef
                r12 = r7[r9]
                long r19 = r12.get()
                int r16 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
                if (r16 <= 0) goto Lec
                org.reactivestreams.Subscriber<? super T> r10 = r12.child
                r10.onNext(r0)
                r12.produced(r5)
            Lec:
                int r9 = r9 + 1
                goto Ld8
            Lef:
                int r11 = r11 + 1
                r16 = r15
                goto L9f
            Lf4:
                if (r11 <= 0) goto L105
                int r0 = r1.sourceMode
                if (r0 == r2) goto L105
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.request(r8)
            L105:
                int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
                if (r0 == 0) goto L10d
                if (r16 != 0) goto L10d
                goto Lc
            L10d:
                int r0 = -r3
                int r3 = r1.addAndGet(r0)
                if (r3 != 0) goto Lc
            L114:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                if (r0 == r1) goto L1f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                if (r0 == r1) goto L1f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r0 = r2.current
                r1 = 0
                androidx.camera.view.p.a(r0, r2, r1)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            L1f:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void onComplete() {
                r1 = this;
                java.lang.Object r0 = r1.terminalEvent
                if (r0 != 0) goto Ld
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.terminalEvent = r0
                r1.dispatch()
            Ld:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.lang.Object r0 = r1.terminalEvent
                if (r0 != 0) goto Le
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
                r1.terminalEvent = r2
                r1.dispatch()
                return
            Le:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                int r0 = r1.sourceMode
                if (r0 != 0) goto L17
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L17
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Prefetch queue is full?!"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L17:
                r1.dispatch()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4)
                if (r0 == 0) goto L42
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L33
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L25
                r3.sourceMode = r1
                r3.queue = r0
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.complete()
                r3.terminalEvent = r4
                r3.dispatch()
                return
            L25:
                r2 = 2
                if (r1 != r2) goto L33
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
                return
            L33:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.bufferSize
                r0.<init>(r1)
                r3.queue = r0
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
            L42:
                return
        }

        void remove(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L3d
            Lc:
                r2 = 0
                r3 = 0
            Le:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto Le
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                goto L3d
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r5 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[]> r2 = r6.subscribers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L3d:
                return
        }
    }

    private FlowablePublish(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<T> r2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.onSubscribe = r1
            r0.source = r2
            r0.current = r3
            r0.bufferSize = r4
            return
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> r3, int r4) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowablePublish$1 r1 = new io.reactivex.internal.operators.flowable.FlowablePublish$1
            r1.<init>(r0, r4)
            io.reactivex.internal.operators.flowable.FlowablePublish r2 = new io.reactivex.internal.operators.flowable.FlowablePublish
            r2.<init>(r1, r3, r0, r4)
            io.reactivex.flowables.ConnectableFlowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r0 = r4.current
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L23
        L10:
            io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r4.current
            int r3 = r4.bufferSize
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r4.current
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 != 0) goto L22
            goto L0
        L22:
            r0 = r1
        L23:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L36
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L36
            r2 = 1
        L36:
            r5.accept(r0)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            org.reactivestreams.Publisher<T> r5 = r4.source
            r5.subscribe(r0)
        L40:
            return
        L41:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public org.reactivestreams.Publisher<T> source() {
            r1 = this;
            org.reactivestreams.Publisher<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            org.reactivestreams.Publisher<T> r0 = r1.onSubscribe
            r0.subscribe(r2)
            return
    }
}

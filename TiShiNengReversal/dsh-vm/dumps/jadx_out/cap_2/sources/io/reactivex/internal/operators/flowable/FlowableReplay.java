package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableReplay<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    static final java.util.concurrent.Callable DEFAULT_UNBOUNDED_FACTORY = null;
    final java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> bufferFactory;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> current;
    final org.reactivestreams.Publisher<T> onSubscribe;
    final org.reactivestreams.Publisher<T> source;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.Node> implements io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        io.reactivex.internal.operators.flowable.FlowableReplay.Node tail;

        BoundedReplayBuffer() {
                r4 = this;
                r4.<init>()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$Node
                r1 = 0
                r2 = 0
                r0.<init>(r1, r2)
                r4.tail = r0
                r4.set(r0)
                return
        }

        final void addLast(io.reactivex.internal.operators.flowable.FlowableReplay.Node r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = r1.tail
                r0.set(r2)
                r1.tail = r2
                int r2 = r1.size
                int r2 = r2 + 1
                r1.size = r2
                return
        }

        final void collect(java.util.Collection<? super T> r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r0
            L6:
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r0
                if (r0 == 0) goto L29
                java.lang.Object r1 = r0.value
                java.lang.Object r1 = r3.leaveTransform(r1)
                boolean r2 = io.reactivex.internal.util.NotificationLite.isComplete(r1)
                if (r2 != 0) goto L29
                boolean r2 = io.reactivex.internal.util.NotificationLite.isError(r1)
                if (r2 == 0) goto L21
                goto L29
            L21:
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.getValue(r1)
                r4.add(r1)
                goto L6
            L29:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
                r6 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                java.lang.Object r0 = r6.enterTransform(r0)
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r1 = new io.reactivex.internal.operators.flowable.FlowableReplay$Node
                long r2 = r6.index
                r4 = 1
                long r2 = r2 + r4
                r6.index = r2
                r1.<init>(r0, r2)
                r6.addLast(r1)
                r6.truncateFinal()
                return
        }

        java.lang.Object enterTransform(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void error(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Object r6 = io.reactivex.internal.util.NotificationLite.error(r6)
                java.lang.Object r6 = r5.enterTransform(r6)
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$Node
                long r1 = r5.index
                r3 = 1
                long r1 = r1 + r3
                r5.index = r1
                r0.<init>(r6, r1)
                r5.addLast(r0)
                r5.truncateFinal()
                return
        }

        boolean hasCompleted() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = r1.tail
                java.lang.Object r0 = r0.value
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.leaveTransform(r0)
                boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        boolean hasError() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = r1.tail
                java.lang.Object r0 = r0.value
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.leaveTransform(r0)
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        java.lang.Object leaveTransform(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void next(T r6) {
                r5 = this;
                java.lang.Object r6 = io.reactivex.internal.util.NotificationLite.next(r6)
                java.lang.Object r6 = r5.enterTransform(r6)
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$Node
                long r1 = r5.index
                r3 = 1
                long r1 = r1 + r3
                r5.index = r1
                r0.<init>(r6, r1)
                r5.addLast(r0)
                r5.truncate()
                return
        }

        final void removeFirst() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r0
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r0
                if (r0 == 0) goto L18
                int r1 = r2.size
                int r1 = r1 + (-1)
                r2.size = r1
                r2.setFirst(r0)
                return
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Empty list!"
                r0.<init>(r1)
                throw r0
        }

        final void removeSome(int r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r0
            L6:
                if (r3 <= 0) goto L17
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r0
                int r3 = r3 + (-1)
                int r1 = r2.size
                int r1 = r1 + (-1)
                r2.size = r1
                goto L6
            L17:
                r2.setFirst(r0)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void replay(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r14) {
                r13 = this;
                monitor-enter(r14)
                boolean r0 = r14.emitting     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r14.missed = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r14)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto La7
            Ld:
                r14.emitting = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r14)     // Catch: java.lang.Throwable -> La
            L10:
                boolean r0 = r14.isDisposed()
                if (r0 == 0) goto L18
                goto L89
            L18:
                long r2 = r14.get()
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L28
                r4 = 1
                goto L29
            L28:
                r4 = 0
            L29:
                java.lang.Object r5 = r14.index()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r5 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r5
                r6 = 0
                if (r5 != 0) goto L42
                java.lang.Object r5 = r13.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r5 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r5
                r14.index = r5
                java.util.concurrent.atomic.AtomicLong r8 = r14.totalRequested
                long r9 = r5.index
                io.reactivex.internal.util.BackpressureHelper.add(r8, r9)
            L42:
                r8 = r6
            L43:
                int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r10 == 0) goto L8a
                java.lang.Object r10 = r5.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r10 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r10
                if (r10 == 0) goto L8a
                java.lang.Object r5 = r10.value
                java.lang.Object r5 = r13.leaveTransform(r5)
                r11 = 0
                org.reactivestreams.Subscriber<? super T> r12 = r14.child     // Catch: java.lang.Throwable -> L61
                boolean r12 = io.reactivex.internal.util.NotificationLite.accept(r5, r12)     // Catch: java.lang.Throwable -> L61
                if (r12 == 0) goto L63
                r14.index = r11     // Catch: java.lang.Throwable -> L61
                return
            L61:
                r0 = move-exception
                goto L70
            L63:
                r11 = 1
                long r8 = r8 + r11
                long r2 = r2 - r11
                boolean r5 = r14.isDisposed()
                if (r5 == 0) goto L6e
                goto L89
            L6e:
                r5 = r10
                goto L43
            L70:
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r14.index = r11
                r14.dispose()
                boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r5)
                if (r1 != 0) goto L89
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r5)
                if (r1 != 0) goto L89
                org.reactivestreams.Subscriber<? super T> r14 = r14.child
                r14.onError(r0)
            L89:
                return
            L8a:
                int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r2 == 0) goto L95
                r14.index = r5
                if (r4 != 0) goto L95
                r14.produced(r8)
            L95:
                monitor-enter(r14)
                boolean r2 = r14.missed     // Catch: java.lang.Throwable -> L9e
                if (r2 != 0) goto La0
                r14.emitting = r0     // Catch: java.lang.Throwable -> L9e
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L9e
                return
            L9e:
                r0 = move-exception
                goto La5
            La0:
                r14.missed = r0     // Catch: java.lang.Throwable -> L9e
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L9e
                goto L10
            La5:
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L9e
                throw r0
            La7:
                monitor-exit(r14)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        final void setFirst(io.reactivex.internal.operators.flowable.FlowableReplay.Node r1) {
                r0 = this;
                r0.set(r1)
                return
        }

        void truncate() {
                r0 = this;
                return
        }

        void truncateFinal() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final org.reactivestreams.Subscriber<? super T> child;
        boolean emitting;
        java.lang.Object index;
        boolean missed;
        final io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> parent;
        final java.util.concurrent.atomic.AtomicLong totalRequested;

        InnerSubscription(io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> r1, org.reactivestreams.Subscriber<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.child = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.totalRequested = r1
                return
        }

        public void cancel() {
                r0 = this;
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r5 = this;
                r0 = -9223372036854775808
                long r2 = r5.getAndSet(r0)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L14
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T> r0 = r5.parent
                r0.remove(r5)
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T> r0 = r5.parent
                r0.manageRequests()
            L14:
                return
        }

        <U> U index() {
                r1 = this;
                java.lang.Object r0 = r1.index
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public long produced(long r1) {
                r0 = this;
                long r1 = io.reactivex.internal.util.BackpressureHelper.producedCancel(r0, r1)
                return r1
        }

        public void request(long r6) {
                r5 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r6)
                if (r0 == 0) goto L37
            L6:
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L11
                goto L37
            L11:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L1c
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L1c
                goto L37
            L1c:
                long r2 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r6)
                boolean r0 = r5.compareAndSet(r0, r2)
                if (r0 == 0) goto L6
                java.util.concurrent.atomic.AtomicLong r0 = r5.totalRequested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r6)
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T> r6 = r5.parent
                r6.manageRequests()
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T> r6 = r5.parent
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r6 = r6.buffer
                r6.replay(r5)
            L37:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Node extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final java.lang.Object value;

        Node(java.lang.Object r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.index = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ReplayBuffer<T> {
        void complete();

        void error(java.lang.Throwable r1);

        void next(T r1);

        void replay(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ReplaySubscriber<T> implements org.reactivestreams.Subscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] TERMINATED = null;
        final io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> buffer;
        boolean done;
        final java.util.concurrent.atomic.AtomicInteger management;
        long maxChildRequested;
        long maxUpstreamRequested;
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[]> subscribers;
        volatile org.reactivestreams.Subscription subscription;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[r0]
                io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r0 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[r0]
                io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.TERMINATED = r0
                return
        }

        ReplaySubscriber(io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> r2) {
                r1 = this;
                r1.<init>()
                r1.buffer = r2
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>()
                r1.management = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r0 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.EMPTY
                r2.<init>(r0)
                r1.subscribers = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.shouldConnect = r2
                return
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r5) {
                r4 = this;
                r5.getClass()
            L3:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r0
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.TERMINATED
                r2 = 0
                if (r0 != r1) goto L11
                return r2
            L11:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r3 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r1 = r4.subscribers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
                if (r0 == 0) goto L3
                r5 = 1
                return r5
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r0 = r2.subscribers
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.TERMINATED
                r0.set(r1)
                org.reactivestreams.Subscription r0 = r2.subscription
                r0.cancel()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.TERMINATED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        void manageRequests() {
                r11 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r11.management
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                goto L6f
            L9:
                r0 = 1
            La:
                boolean r1 = r11.isDisposed()
                if (r1 == 0) goto L11
                goto L6f
            L11:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r1 = r11.subscribers
                java.lang.Object r1 = r1.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r1
                long r2 = r11.maxChildRequested
                int r4 = r1.length
                r5 = 0
                r6 = r2
            L1e:
                if (r5 >= r4) goto L2f
                r8 = r1[r5]
                java.util.concurrent.atomic.AtomicLong r8 = r8.totalRequested
                long r8 = r8.get()
                long r6 = java.lang.Math.max(r6, r8)
                int r5 = r5 + 1
                goto L1e
            L2f:
                long r4 = r11.maxUpstreamRequested
                org.reactivestreams.Subscription r1 = r11.subscription
                long r2 = r6 - r2
                r8 = 0
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 == 0) goto L5b
                r11.maxChildRequested = r6
                if (r1 == 0) goto L4e
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L4a
                r11.maxUpstreamRequested = r8
                long r4 = r4 + r2
                r1.request(r4)
                goto L66
            L4a:
                r1.request(r2)
                goto L66
            L4e:
                long r4 = r4 + r2
                int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r1 >= 0) goto L58
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L58:
                r11.maxUpstreamRequested = r4
                goto L66
            L5b:
                int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r2 == 0) goto L66
                if (r1 == 0) goto L66
                r11.maxUpstreamRequested = r8
                r1.request(r4)
            L66:
                java.util.concurrent.atomic.AtomicInteger r1 = r11.management
                int r0 = -r0
                int r0 = r1.addAndGet(r0)
                if (r0 != 0) goto La
            L6f:
                return
        }

        public void onComplete() {
                r5 = this;
                boolean r0 = r5.done
                if (r0 != 0) goto L24
                r0 = 1
                r5.done = r0
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r0 = r5.buffer
                r0.complete()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r0 = r5.subscribers
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r0
                int r1 = r0.length
                r2 = 0
            L18:
                if (r2 >= r1) goto L24
                r3 = r0[r2]
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r4 = r5.buffer
                r4.replay(r3)
                int r2 = r2 + 1
                goto L18
            L24:
                return
        }

        public void onError(java.lang.Throwable r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 != 0) goto L25
                r0 = 1
                r4.done = r0
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r0 = r4.buffer
                r0.error(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r5 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r0 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.TERMINATED
                java.lang.Object r5 = r5.getAndSet(r0)
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r5 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r5
                int r0 = r5.length
                r1 = 0
            L18:
                if (r1 >= r0) goto L24
                r2 = r5[r1]
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r3 = r4.buffer
                r3.replay(r2)
                int r1 = r1 + 1
                goto L18
            L24:
                return
            L25:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 != 0) goto L1f
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r0 = r4.buffer
                r0.next(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r5 = r4.subscribers
                java.lang.Object r5 = r5.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r5 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r5
                int r0 = r5.length
                r1 = 0
            L13:
                if (r1 >= r0) goto L1f
                r2 = r5[r1]
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r3 = r4.buffer
                r3.replay(r2)
                int r1 = r1 + 1
                goto L13
            L1f:
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r5) {
                r4 = this;
                org.reactivestreams.Subscription r0 = r4.subscription
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r5)
                if (r0 == 0) goto L23
                r4.subscription = r5
                r4.manageRequests()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r5 = r4.subscribers
                java.lang.Object r5 = r5.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r5 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r5
                int r0 = r5.length
                r1 = 0
            L17:
                if (r1 >= r0) goto L23
                r2 = r5[r1]
                io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T> r3 = r4.buffer
                r3.replay(r2)
                int r1 = r1 + 1
                goto L17
            L23:
                return
        }

        void remove(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[]) r0
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
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription[] r5 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription<T>[]> r2 = r6.subscribers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L3d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeAndTimeBoundReplayBuffer<T> extends io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>()
                r0.scheduler = r5
                r0.limit = r1
                r0.maxAge = r2
                r0.unit = r4
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        java.lang.Object enterTransform(java.lang.Object r5) {
                r4 = this;
                io.reactivex.schedulers.Timed r0 = new io.reactivex.schedulers.Timed
                io.reactivex.Scheduler r1 = r4.scheduler
                java.util.concurrent.TimeUnit r2 = r4.unit
                long r1 = r1.now(r2)
                java.util.concurrent.TimeUnit r3 = r4.unit
                r0.<init>(r5, r1, r3)
                return r0
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        java.lang.Object leaveTransform(java.lang.Object r1) {
                r0 = this;
                io.reactivex.schedulers.Timed r1 = (io.reactivex.schedulers.Timed) r1
                java.lang.Object r1 = r1.value()
                return r1
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncate() {
                r9 = this;
                io.reactivex.Scheduler r0 = r9.scheduler
                java.util.concurrent.TimeUnit r1 = r9.unit
                long r0 = r0.now(r1)
                long r2 = r9.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r9.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                r4 = 0
            L18:
                r8 = r3
                r3 = r2
                r2 = r8
                if (r2 == 0) goto L4b
                int r5 = r9.size
                int r6 = r9.limit
                if (r5 <= r6) goto L30
                int r4 = r4 + 1
                int r5 = r5 + (-1)
                r9.size = r5
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                goto L18
            L30:
                java.lang.Object r5 = r2.value
                io.reactivex.schedulers.Timed r5 = (io.reactivex.schedulers.Timed) r5
                long r5 = r5.time()
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 > 0) goto L4b
                int r4 = r4 + 1
                int r3 = r9.size
                int r3 = r3 + (-1)
                r9.size = r3
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                goto L18
            L4b:
                if (r4 == 0) goto L50
                r9.setFirst(r3)
            L50:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncateFinal() {
                r10 = this;
                io.reactivex.Scheduler r0 = r10.scheduler
                java.util.concurrent.TimeUnit r1 = r10.unit
                long r0 = r0.now(r1)
                long r2 = r10.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                r4 = 0
            L18:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L3c
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L3c
                java.lang.Object r5 = r2.value
                io.reactivex.schedulers.Timed r5 = (io.reactivex.schedulers.Timed) r5
                long r7 = r5.time()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L3c
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                goto L18
            L3c:
                if (r4 == 0) goto L41
                r10.setFirst(r3)
            L41:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeBoundReplayBuffer<T> extends io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int r1) {
                r0 = this;
                r0.<init>()
                r0.limit = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncate() {
                r2 = this;
                int r0 = r2.size
                int r1 = r2.limit
                if (r0 <= r1) goto L9
                r2.removeFirst()
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void complete() {
                r1 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.add(r0)
                int r0 = r1.size
                int r0 = r0 + 1
                r1.size = r0
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void error(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.error(r1)
                r0.add(r1)
                int r1 = r0.size
                int r1 = r1 + 1
                r0.size = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void next(T r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.add(r1)
                int r1 = r0.size
                int r1 = r1 + 1
                r0.size = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void replay(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> r15) {
                r14 = this;
                monitor-enter(r15)
                boolean r0 = r15.emitting     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r15.missed = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L8f
            Ld:
                r15.emitting = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                org.reactivestreams.Subscriber<? super T> r0 = r15.child
            L12:
                boolean r1 = r15.isDisposed()
                if (r1 == 0) goto L19
                goto L67
            L19:
                int r1 = r14.size
                java.lang.Object r2 = r15.index()
                java.lang.Integer r2 = (java.lang.Integer) r2
                r3 = 0
                if (r2 == 0) goto L29
                int r2 = r2.intValue()
                goto L2a
            L29:
                r2 = 0
            L2a:
                long r4 = r15.get()
                r6 = 0
                r8 = r4
                r10 = r6
            L32:
                int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r12 == 0) goto L68
                if (r2 >= r1) goto L68
                java.lang.Object r12 = r14.get(r2)
                boolean r12 = io.reactivex.internal.util.NotificationLite.accept(r12, r0)     // Catch: java.lang.Throwable -> L51
                if (r12 == 0) goto L43
                goto L67
            L43:
                boolean r12 = r15.isDisposed()
                if (r12 == 0) goto L4a
                goto L67
            L4a:
                int r2 = r2 + 1
                r12 = 1
                long r8 = r8 - r12
                long r10 = r10 + r12
                goto L32
            L51:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r15.dispose()
                boolean r15 = io.reactivex.internal.util.NotificationLite.isError(r12)
                if (r15 != 0) goto L67
                boolean r15 = io.reactivex.internal.util.NotificationLite.isComplete(r12)
                if (r15 != 0) goto L67
                r0.onError(r1)
            L67:
                return
            L68:
                int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r1 == 0) goto L7e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r15.index = r1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 == 0) goto L7e
                r15.produced(r10)
            L7e:
                monitor-enter(r15)
                boolean r1 = r15.missed     // Catch: java.lang.Throwable -> L87
                if (r1 != 0) goto L89
                r15.emitting = r3     // Catch: java.lang.Throwable -> L87
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L87
                return
            L87:
                r0 = move-exception
                goto L8d
            L89:
                r15.missed = r3     // Catch: java.lang.Throwable -> L87
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L87
                goto L12
            L8d:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L87
                throw r0
            L8f:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                throw r0
        }
    }

    static {
            io.reactivex.internal.operators.flowable.FlowableReplay$1 r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$1
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowableReplay.DEFAULT_UNBOUNDED_FACTORY = r0
            return
    }

    private FlowableReplay(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<T> r2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> r3, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> r4) {
            r0 = this;
            r0.<init>()
            r0.onSubscribe = r1
            r0.source = r2
            r0.current = r3
            r0.bufferFactory = r4
            return
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(org.reactivestreams.Publisher<T> r1, int r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto La
            io.reactivex.flowables.ConnectableFlowable r1 = createFrom(r1)
            return r1
        La:
            io.reactivex.internal.operators.flowable.FlowableReplay$4 r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$4
            r0.<init>(r2)
            io.reactivex.flowables.ConnectableFlowable r1 = create(r1, r0)
            return r1
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(org.reactivestreams.Publisher<T> r6, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.flowables.ConnectableFlowable r6 = create(r0, r1, r3, r4, r5)
            return r6
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(org.reactivestreams.Publisher<T> r6, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10, int r11) {
            io.reactivex.internal.operators.flowable.FlowableReplay$5 r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$5
            r2 = r7
            r4 = r9
            r5 = r10
            r1 = r11
            r0.<init>(r1, r2, r4, r5)
            io.reactivex.flowables.ConnectableFlowable r6 = create(r6, r0)
            return r6
    }

    static <T> io.reactivex.flowables.ConnectableFlowable<T> create(org.reactivestreams.Publisher<T> r3, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> r4) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowableReplay$6 r1 = new io.reactivex.internal.operators.flowable.FlowableReplay$6
            r1.<init>(r0, r4)
            io.reactivex.internal.operators.flowable.FlowableReplay r2 = new io.reactivex.internal.operators.flowable.FlowableReplay
            r2.<init>(r1, r3, r0, r4)
            io.reactivex.flowables.ConnectableFlowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> createFrom(org.reactivestreams.Publisher<? extends T> r1) {
            java.util.concurrent.Callable r0 = io.reactivex.internal.operators.flowable.FlowableReplay.DEFAULT_UNBOUNDED_FACTORY
            io.reactivex.flowables.ConnectableFlowable r1 = create(r1, r0)
            return r1
    }

    public static <U, R> io.reactivex.Flowable<R> multicastSelector(java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> r1, io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> r2) {
            io.reactivex.internal.operators.flowable.FlowableReplay$2 r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$2
            r0.<init>(r1, r2)
            io.reactivex.Flowable r1 = io.reactivex.Flowable.unsafeCreate(r0)
            return r1
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> observeOn(io.reactivex.flowables.ConnectableFlowable<T> r1, io.reactivex.Scheduler r2) {
            io.reactivex.Flowable r2 = r1.observeOn(r2)
            io.reactivex.internal.operators.flowable.FlowableReplay$3 r0 = new io.reactivex.internal.operators.flowable.FlowableReplay$3
            r0.<init>(r1, r2)
            io.reactivex.flowables.ConnectableFlowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T>> r0 = r4.current
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L27
        L10:
            java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer<T>> r1 = r4.bufferFactory     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L57
            io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer r1 = (io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer) r1     // Catch: java.lang.Throwable -> L57
            io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay$ReplaySubscriber<T>> r1 = r4.current
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 != 0) goto L26
            goto L0
        L26:
            r0 = r2
        L27:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L3b
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L3b
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            r5.accept(r0)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L46
            org.reactivestreams.Publisher<T> r5 = r4.source
            r5.subscribe(r0)
        L46:
            return
        L47:
            r5 = move-exception
            if (r1 == 0) goto L4f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.shouldConnect
            r0.compareAndSet(r2, r3)
        L4f:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
        L57:
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

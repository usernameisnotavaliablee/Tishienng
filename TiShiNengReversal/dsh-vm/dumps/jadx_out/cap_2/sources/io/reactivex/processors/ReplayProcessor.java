package io.reactivex.processors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ReplayProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] EMPTY = null;
    private static final java.lang.Object[] EMPTY_ARRAY = null;
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] TERMINATED = null;
    final io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> buffer;
    boolean done;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[]> subscribers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ReplayBuffer<T> {
        void add(T r1);

        void addFinal(java.lang.Object r1);

        java.lang.Object get();

        T getValue();

        T[] getValues(T[] r1);

        void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r1);

        int size();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        java.lang.Object index;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.processors.ReplayProcessor<T> state;

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.ReplayProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.state = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.processors.ReplayProcessor<T> r0 = r1.state
                r0.remove(r1)
            Lc:
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L12
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                io.reactivex.processors.ReplayProcessor<T> r2 = r1.state
                io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r2 = r2.buffer
                r2.replay(r1)
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeAndTimeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        private static final long serialVersionUID = 1242561386470847675L;
        volatile boolean done;
        volatile io.reactivex.processors.ReplayProcessor.TimedNode<java.lang.Object> head;
        final long maxAge;
        final int maxSize;
        final io.reactivex.Scheduler scheduler;
        int size;
        io.reactivex.processors.ReplayProcessor.TimedNode<java.lang.Object> tail;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "maxSize"
                int r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
                r1.maxSize = r2
                java.lang.String r2 = "maxAge"
                long r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r2)
                r1.maxAge = r2
                java.lang.String r2 = "unit is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r2)
                java.util.concurrent.TimeUnit r2 = (java.util.concurrent.TimeUnit) r2
                r1.unit = r2
                java.lang.String r2 = "scheduler is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r2)
                io.reactivex.Scheduler r2 = (io.reactivex.Scheduler) r2
                r1.scheduler = r2
                io.reactivex.processors.ReplayProcessor$TimedNode r2 = new io.reactivex.processors.ReplayProcessor$TimedNode
                r3 = 0
                r4 = 0
                r2.<init>(r3, r4)
                r1.tail = r2
                r1.head = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void add(T r4) {
                r3 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = new io.reactivex.processors.ReplayProcessor$TimedNode
                io.reactivex.Scheduler r1 = r3.scheduler
                java.util.concurrent.TimeUnit r2 = r3.unit
                long r1 = r1.now(r2)
                r0.<init>(r4, r1)
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                int r1 = r1 + 1
                r3.size = r1
                r4.set(r0)
                r3.trim()
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void addFinal(java.lang.Object r4) {
                r3 = this;
                r3.lazySet(r4)
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = new io.reactivex.processors.ReplayProcessor$TimedNode
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.<init>(r4, r1)
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                r2 = 1
                int r1 = r1 + r2
                r3.size = r1
                r4.set(r0)
                r3.trimFinal()
                r3.done = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
                r4 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r0 = r4.head
                r1 = 0
                r2 = r1
            L4:
                java.lang.Object r3 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                if (r3 != 0) goto L22
                T r0 = r0.value
                if (r0 != 0) goto L11
                return r1
            L11:
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r1 != 0) goto L1f
                boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
                if (r1 == 0) goto L1e
                goto L1f
            L1e:
                return r0
            L1f:
                T r0 = r2.value
                return r0
            L22:
                r2 = r0
                r0 = r3
                goto L4
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] r6) {
                r5 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r0 = r5.head
                int r1 = r5.size()
                r2 = 0
                r3 = 0
                if (r1 != 0) goto L10
                int r0 = r6.length
                if (r0 == 0) goto Lf
                r6[r3] = r2
            Lf:
                return r6
            L10:
                int r4 = r6.length
                if (r4 >= r1) goto L21
                java.lang.Class r6 = r6.getClass()
                java.lang.Class r6 = r6.getComponentType()
                java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
            L21:
                if (r3 == r1) goto L30
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = (io.reactivex.processors.ReplayProcessor.TimedNode) r0
                T r4 = r0.value
                r6[r3] = r4
                int r3 = r3 + 1
                goto L21
            L30:
                int r0 = r6.length
                if (r0 <= r1) goto L35
                r6[r1] = r2
            L35:
                return r6
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto Lae
            Lc:
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                java.lang.Object r3 = r1.index
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                r4 = 1
                if (r3 != 0) goto L41
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r3 = r0.head
                boolean r5 = r0.done
                if (r5 != 0) goto L41
                io.reactivex.Scheduler r5 = r0.scheduler
                java.util.concurrent.TimeUnit r6 = r0.unit
                long r5 = r5.now(r6)
                long r7 = r0.maxAge
                long r5 = r5 - r7
                java.lang.Object r7 = r3.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r7 = (io.reactivex.processors.ReplayProcessor.TimedNode) r7
            L2c:
                if (r7 == 0) goto L41
                long r8 = r7.time
                int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r10 <= 0) goto L35
                goto L41
            L35:
                java.lang.Object r3 = r7.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                r16 = r7
                r7 = r3
                r3 = r16
                goto L2c
            L41:
                r5 = 1
            L42:
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L4b:
                boolean r12 = r1.cancelled
                r13 = 0
                if (r12 == 0) goto L53
                r1.index = r13
                return
            L53:
                java.lang.Object r12 = r3.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r12 = (io.reactivex.processors.ReplayProcessor.TimedNode) r12
                if (r12 != 0) goto L5c
                goto L8d
            L5c:
                T r14 = r12.value
                boolean r15 = r0.done
                if (r15 == 0) goto L7e
                java.lang.Object r15 = r12.get()
                if (r15 != 0) goto L7e
                boolean r3 = io.reactivex.internal.util.NotificationLite.isComplete(r14)
                if (r3 == 0) goto L72
                r2.onComplete()
                goto L79
            L72:
                java.lang.Throwable r3 = io.reactivex.internal.util.NotificationLite.getError(r14)
                r2.onError(r3)
            L79:
                r1.index = r13
                r1.cancelled = r4
                return
            L7e:
                int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r13 != 0) goto Laf
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                long r6 = r6 + r10
                int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r13 != 0) goto Laf
            L8d:
                int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r6 == 0) goto La5
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r12 == 0) goto La5
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                r6.addAndGet(r10)
            La5:
                r1.index = r3
                int r5 = -r5
                int r5 = r1.addAndGet(r5)
                if (r5 != 0) goto L42
            Lae:
                return
            Laf:
                r2.onNext(r14)
                r13 = 1
                long r6 = r6 - r13
                long r10 = r10 - r13
                r3 = r12
                goto L4b
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
                r3 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r0 = r3.head
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L25
                java.lang.Object r2 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r2 = (io.reactivex.processors.ReplayProcessor.TimedNode) r2
                if (r2 != 0) goto L21
                T r0 = r0.value
                boolean r2 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r2 != 0) goto L1e
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
                if (r0 == 0) goto L25
            L1e:
                int r1 = r1 + (-1)
                return r1
            L21:
                int r1 = r1 + 1
                r0 = r2
                goto L3
            L25:
                return r1
        }

        void trim() {
                r7 = this;
                int r0 = r7.size
                int r1 = r7.maxSize
                if (r0 <= r1) goto L14
                int r0 = r0 + (-1)
                r7.size = r0
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r0 = r7.head
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = (io.reactivex.processors.ReplayProcessor.TimedNode) r0
                r7.head = r0
            L14:
                io.reactivex.Scheduler r0 = r7.scheduler
                java.util.concurrent.TimeUnit r1 = r7.unit
                long r0 = r0.now(r1)
                long r2 = r7.maxAge
                long r0 = r0 - r2
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r2 = r7.head
            L21:
                java.lang.Object r3 = r2.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                if (r3 != 0) goto L2c
                r7.head = r2
                return
            L2c:
                long r4 = r3.time
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L35
                r7.head = r2
                return
            L35:
                r2 = r3
                goto L21
        }

        void trimFinal() {
                r7 = this;
                io.reactivex.Scheduler r0 = r7.scheduler
                java.util.concurrent.TimeUnit r1 = r7.unit
                long r0 = r0.now(r1)
                long r2 = r7.maxAge
                long r0 = r0 - r2
                io.reactivex.processors.ReplayProcessor$TimedNode<java.lang.Object> r2 = r7.head
            Ld:
                java.lang.Object r3 = r2.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                java.lang.Object r4 = r3.get()
                if (r4 != 0) goto L1c
                r7.head = r2
                return
            L1c:
                long r4 = r3.time
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L25
                r7.head = r2
                return
            L25:
                r2 = r3
                goto Ld
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        private static final long serialVersionUID = 3027920763113911982L;
        volatile boolean done;
        volatile io.reactivex.processors.ReplayProcessor.Node<java.lang.Object> head;
        final int maxSize;
        int size;
        io.reactivex.processors.ReplayProcessor.Node<java.lang.Object> tail;

        SizeBoundReplayBuffer(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "maxSize"
                int r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
                r1.maxSize = r2
                io.reactivex.processors.ReplayProcessor$Node r2 = new io.reactivex.processors.ReplayProcessor$Node
                r0 = 0
                r2.<init>(r0)
                r1.tail = r2
                r1.head = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void add(T r3) {
                r2 = this;
                io.reactivex.processors.ReplayProcessor$Node r0 = new io.reactivex.processors.ReplayProcessor$Node
                r0.<init>(r3)
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r3 = r2.tail
                r2.tail = r0
                int r1 = r2.size
                int r1 = r1 + 1
                r2.size = r1
                r3.set(r0)
                r2.trim()
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void addFinal(java.lang.Object r4) {
                r3 = this;
                r3.lazySet(r4)
                io.reactivex.processors.ReplayProcessor$Node r0 = new io.reactivex.processors.ReplayProcessor$Node
                r0.<init>(r4)
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                r2 = 1
                int r1 = r1 + r2
                r3.size = r1
                r4.set(r0)
                r3.done = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
                r4 = this;
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r0 = r4.head
                r1 = 0
                r2 = r1
            L4:
                java.lang.Object r3 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r3 = (io.reactivex.processors.ReplayProcessor.Node) r3
                if (r3 != 0) goto L22
                T r0 = r0.value
                if (r0 != 0) goto L11
                return r1
            L11:
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r1 != 0) goto L1f
                boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
                if (r1 == 0) goto L1e
                goto L1f
            L1e:
                return r0
            L1f:
                T r0 = r2.value
                return r0
            L22:
                r2 = r0
                r0 = r3
                goto L4
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] r6) {
                r5 = this;
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r0 = r5.head
                int r1 = r5.size()
                r2 = 0
                r3 = 0
                if (r1 != 0) goto L10
                int r0 = r6.length
                if (r0 == 0) goto Lf
                r6[r3] = r2
            Lf:
                return r6
            L10:
                int r4 = r6.length
                if (r4 >= r1) goto L21
                java.lang.Class r6 = r6.getClass()
                java.lang.Class r6 = r6.getComponentType()
                java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
            L21:
                if (r3 == r1) goto L30
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r0 = (io.reactivex.processors.ReplayProcessor.Node) r0
                T r4 = r0.value
                r6[r3] = r4
                int r3 = r3 + 1
                goto L21
            L30:
                int r0 = r6.length
                if (r0 <= r1) goto L35
                r6[r1] = r2
            L35:
                return r6
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r15) {
                r14 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L8
                goto L80
            L8:
                org.reactivestreams.Subscriber<? super T> r0 = r15.actual
                java.lang.Object r1 = r15.index
                io.reactivex.processors.ReplayProcessor$Node r1 = (io.reactivex.processors.ReplayProcessor.Node) r1
                r2 = 1
                if (r1 != 0) goto L13
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r1 = r14.head
            L13:
                r3 = 1
            L14:
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L1d:
                boolean r10 = r15.cancelled
                r11 = 0
                if (r10 == 0) goto L25
                r15.index = r11
                return
            L25:
                java.lang.Object r10 = r1.get()
                io.reactivex.processors.ReplayProcessor$Node r10 = (io.reactivex.processors.ReplayProcessor.Node) r10
                if (r10 != 0) goto L2e
                goto L5f
            L2e:
                T r12 = r10.value
                boolean r13 = r14.done
                if (r13 == 0) goto L50
                java.lang.Object r13 = r10.get()
                if (r13 != 0) goto L50
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r12)
                if (r1 == 0) goto L44
                r0.onComplete()
                goto L4b
            L44:
                java.lang.Throwable r1 = io.reactivex.internal.util.NotificationLite.getError(r12)
                r0.onError(r1)
            L4b:
                r15.index = r11
                r15.cancelled = r2
                return
            L50:
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L81
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r4 = r4.get()
                long r4 = r4 + r8
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L81
            L5f:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L77
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r4 = r4.get()
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 == 0) goto L77
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                r4.addAndGet(r8)
            L77:
                r15.index = r1
                int r3 = -r3
                int r3 = r15.addAndGet(r3)
                if (r3 != 0) goto L14
            L80:
                return
            L81:
                r0.onNext(r12)
                r11 = 1
                long r4 = r4 - r11
                long r8 = r8 - r11
                r1 = r10
                goto L1d
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
                r3 = this;
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r0 = r3.head
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L25
                java.lang.Object r2 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r2 = (io.reactivex.processors.ReplayProcessor.Node) r2
                if (r2 != 0) goto L21
                T r0 = r0.value
                boolean r2 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r2 != 0) goto L1e
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
                if (r0 == 0) goto L25
            L1e:
                int r1 = r1 + (-1)
                return r1
            L21:
                int r1 = r1 + 1
                r0 = r2
                goto L3
            L25:
                return r1
        }

        void trim() {
                r2 = this;
                int r0 = r2.size
                int r1 = r2.maxSize
                if (r0 <= r1) goto L14
                int r0 = r0 + (-1)
                r2.size = r0
                io.reactivex.processors.ReplayProcessor$Node<java.lang.Object> r0 = r2.head
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r0 = (io.reactivex.processors.ReplayProcessor.Node) r0
                r2.head = r0
            L14:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.time = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UnboundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        private static final long serialVersionUID = -4457200895834877300L;
        final java.util.List<java.lang.Object> buffer;
        volatile boolean done;
        volatile int size;

        UnboundedReplayBuffer(int r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.lang.String r1 = "capacityHint"
                int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
                r0.<init>(r3)
                r2.buffer = r0
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void add(T r2) {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.buffer
                r0.add(r2)
                int r2 = r1.size
                int r2 = r2 + 1
                r1.size = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void addFinal(java.lang.Object r2) {
                r1 = this;
                r1.lazySet(r2)
                java.util.List<java.lang.Object> r0 = r1.buffer
                r0.add(r2)
                int r2 = r1.size
                r0 = 1
                int r2 = r2 + r0
                r1.size = r2
                r1.done = r0
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
                r5 = this;
                int r0 = r5.size
                r1 = 0
                if (r0 == 0) goto L26
                java.util.List<java.lang.Object> r2 = r5.buffer
                int r3 = r0 + (-1)
                java.lang.Object r3 = r2.get(r3)
                boolean r4 = io.reactivex.internal.util.NotificationLite.isComplete(r3)
                if (r4 != 0) goto L1b
                boolean r4 = io.reactivex.internal.util.NotificationLite.isError(r3)
                if (r4 == 0) goto L1a
                goto L1b
            L1a:
                return r3
            L1b:
                r3 = 1
                if (r0 != r3) goto L1f
                return r1
            L1f:
                int r0 = r0 + (-2)
                java.lang.Object r0 = r2.get(r0)
                return r0
            L26:
                return r1
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] r7) {
                r6 = this;
                int r0 = r6.size
                r1 = 0
                r2 = 0
                if (r0 != 0) goto Lc
                int r0 = r7.length
                if (r0 == 0) goto Lb
                r7[r2] = r1
            Lb:
                return r7
            Lc:
                java.util.List<java.lang.Object> r3 = r6.buffer
                int r4 = r0 + (-1)
                java.lang.Object r4 = r3.get(r4)
                boolean r5 = io.reactivex.internal.util.NotificationLite.isComplete(r4)
                if (r5 != 0) goto L20
                boolean r4 = io.reactivex.internal.util.NotificationLite.isError(r4)
                if (r4 == 0) goto L2a
            L20:
                int r0 = r0 + (-1)
                if (r0 != 0) goto L2a
                int r0 = r7.length
                if (r0 == 0) goto L29
                r7[r2] = r1
            L29:
                return r7
            L2a:
                int r4 = r7.length
                if (r4 >= r0) goto L3b
                java.lang.Class r7 = r7.getClass()
                java.lang.Class r7 = r7.getComponentType()
                java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r0)
                java.lang.Object[] r7 = (java.lang.Object[]) r7
            L3b:
                if (r2 >= r0) goto L46
                java.lang.Object r4 = r3.get(r2)
                r7[r2] = r4
                int r2 = r2 + 1
                goto L3b
            L46:
                int r2 = r7.length
                if (r2 <= r0) goto L4b
                r7[r0] = r1
            L4b:
                return r7
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto Lb4
            Lc:
                java.util.List<java.lang.Object> r2 = r0.buffer
                org.reactivestreams.Subscriber<? super T> r3 = r1.actual
                java.lang.Object r4 = r1.index
                java.lang.Integer r4 = (java.lang.Integer) r4
                r5 = 1
                if (r4 == 0) goto L1d
                int r4 = r4.intValue()
            L1b:
                r6 = 1
                goto L25
            L1d:
                r4 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
                r1.index = r6
                goto L1b
            L25:
                boolean r7 = r1.cancelled
                r8 = 0
                if (r7 == 0) goto L2d
                r1.index = r8
                return
            L2d:
                int r7 = r0.size
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                r13 = 0
            L37:
                if (r7 == r4) goto L82
                boolean r15 = r1.cancelled
                if (r15 == 0) goto L40
                r1.index = r8
                return
            L40:
                java.lang.Object r15 = r2.get(r4)
                r16 = 0
                boolean r11 = r0.done
                if (r11 == 0) goto L68
                int r11 = r4 + 1
                if (r11 != r7) goto L68
                int r7 = r0.size
                if (r11 != r7) goto L68
                boolean r2 = io.reactivex.internal.util.NotificationLite.isComplete(r15)
                if (r2 == 0) goto L5c
                r3.onComplete()
                goto L63
            L5c:
                java.lang.Throwable r2 = io.reactivex.internal.util.NotificationLite.getError(r15)
                r3.onError(r2)
            L63:
                r1.index = r8
                r1.cancelled = r5
                return
            L68:
                int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                if (r11 != 0) goto L78
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                long r9 = r9 + r13
                int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                if (r11 != 0) goto L78
                goto L84
            L78:
                r3.onNext(r15)
                r11 = 1
                long r9 = r9 - r11
                long r13 = r13 - r11
                int r4 = r4 + 1
                goto L37
            L82:
                r16 = 0
            L84:
                int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                if (r7 == 0) goto L9d
                java.util.concurrent.atomic.AtomicLong r7 = r1.requested
                long r7 = r7.get()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r15 == 0) goto L9d
                java.util.concurrent.atomic.AtomicLong r7 = r1.requested
                long r9 = r7.addAndGet(r13)
            L9d:
                int r7 = r0.size
                if (r4 == r7) goto La7
                int r7 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                if (r7 == 0) goto La7
                goto L25
            La7:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r1.index = r7
                int r6 = -r6
                int r6 = r1.addAndGet(r6)
                if (r6 != 0) goto L25
            Lb4:
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
                r4 = this;
                int r0 = r4.size
                if (r0 == 0) goto L1b
                java.util.List<java.lang.Object> r1 = r4.buffer
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.get(r2)
                boolean r3 = io.reactivex.internal.util.NotificationLite.isComplete(r1)
                if (r3 != 0) goto L1a
                boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r1)
                if (r1 == 0) goto L19
                goto L1a
            L19:
                return r0
            L1a:
                return r2
            L1b:
                r0 = 0
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            io.reactivex.processors.ReplayProcessor.EMPTY_ARRAY = r1
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r0]
            io.reactivex.processors.ReplayProcessor.EMPTY = r1
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r0]
            io.reactivex.processors.ReplayProcessor.TERMINATED = r0
            return
    }

    ReplayProcessor(io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> r2) {
            r1 = this;
            r1.<init>()
            r1.buffer = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = io.reactivex.processors.ReplayProcessor.EMPTY
            r2.<init>(r0)
            r1.subscribers = r2
            return
    }

    public static <T> io.reactivex.processors.ReplayProcessor<T> create() {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer
            r2 = 16
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.processors.ReplayProcessor<T> create(int r2) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    static <T> io.reactivex.processors.ReplayProcessor<T> createUnbounded() {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithSize(int r2) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTime(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = r7
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTimeAndSize(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10, int r11) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer
            r3 = r7
            r5 = r9
            r6 = r10
            r2 = r11
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r1)
            return r0
    }

    boolean add(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r3 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r1 = r4.subscribers
            boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r2 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r2.buffer
            java.lang.Object r0 = r0.get()
            boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r1 == 0) goto L11
            java.lang.Throwable r0 = io.reactivex.internal.util.NotificationLite.getError(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public T getValue() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public java.lang.Object[] getValues() {
            r2 = this;
            java.lang.Object[] r0 = io.reactivex.processors.ReplayProcessor.EMPTY_ARRAY
            java.lang.Object[] r1 = r2.getValues(r0)
            if (r1 != r0) goto Lc
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lc:
            return r1
    }

    public T[] getValues(T[] r2) {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object[] r2 = r0.getValues(r2)
            return r2
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            return r0
    }

    public boolean hasValue() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            int r0 = r0.size()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void onComplete() {
            r5 = this;
            boolean r0 = r5.done
            if (r0 == 0) goto L5
            goto L27
        L5:
            r0 = 1
            r5.done = r0
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r1 = r5.buffer
            r1.addFinal(r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r5.subscribers
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r2 = io.reactivex.processors.ReplayProcessor.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r2)
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            int r2 = r0.length
            r3 = 0
        L1d:
            if (r3 >= r2) goto L27
            r4 = r0[r3]
            r1.replay(r4)
            int r3 = r3 + 1
            goto L1d
        L27:
            return
    }

    public void onError(java.lang.Throwable r5) {
            r4 = this;
            if (r5 != 0) goto L9
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r5.<init>(r0)
        L9:
            boolean r0 = r4.done
            if (r0 == 0) goto L11
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
        L11:
            r0 = 1
            r4.done = r0
            java.lang.Object r5 = io.reactivex.internal.util.NotificationLite.error(r5)
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r4.buffer
            r0.addFinal(r5)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r5 = r4.subscribers
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.TERMINATED
            java.lang.Object r5 = r5.getAndSet(r1)
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r5 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r5
            int r1 = r5.length
            r2 = 0
        L29:
            if (r2 >= r1) goto L33
            r3 = r5[r2]
            r0.replay(r3)
            int r2 = r2 + 1
            goto L29
        L33:
            return
    }

    public void onNext(T r5) {
            r4 = this;
            if (r5 != 0) goto Ld
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r5.<init>(r0)
            r4.onError(r5)
            return
        Ld:
            boolean r0 = r4.done
            if (r0 == 0) goto L12
            goto L2b
        L12:
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r4.buffer
            r0.add(r5)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r5 = r4.subscribers
            java.lang.Object r5 = r5.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r5 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r5
            int r1 = r5.length
            r2 = 0
        L21:
            if (r2 >= r1) goto L2b
            r3 = r5[r2]
            r0.replay(r3)
            int r2 = r2 + 1
            goto L21
        L2b:
            return
    }

    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L8
            r3.cancel()
            return
        L8:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            return
    }

    void remove(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.TERMINATED
            if (r0 == r1) goto L3f
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.EMPTY
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
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.EMPTY
            goto L37
        L28:
            int r5 = r1 + (-1)
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r5 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L37:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r2 = r6.subscribers
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto L0
        L3f:
            return
    }

    int size() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            int r0 = r0.size()
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplaySubscription r0 = new io.reactivex.processors.ReplayProcessor$ReplaySubscription
            r0.<init>(r2, r1)
            r2.onSubscribe(r0)
            boolean r2 = r1.add(r0)
            if (r2 == 0) goto L16
            boolean r2 = r0.cancelled
            if (r2 == 0) goto L16
            r1.remove(r0)
            return
        L16:
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r2 = r1.buffer
            r2.replay(r0)
            return
    }

    int subscriberCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            int r0 = r0.length
            return r0
    }
}

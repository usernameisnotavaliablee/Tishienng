package io.reactivex.processors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BehaviorProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] EMPTY = null;
    static final java.lang.Object[] EMPTY_ARRAY = null;
    static final io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] TERMINATED = null;
    boolean done;
    long index;
    final java.util.concurrent.locks.ReadWriteLock lock;
    final java.util.concurrent.locks.Lock readLock;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Object> value;
    final java.util.concurrent.locks.Lock writeLock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BehaviorSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;
        final io.reactivex.processors.BehaviorProcessor<T> state;

        BehaviorSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.BehaviorProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.state = r2
                return
        }

        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.processors.BehaviorProcessor<T> r0 = r1.state
                r0.remove(r1)
            Lc:
                return
        }

        void emitFirst() {
                r4 = this;
                boolean r0 = r4.cancelled
                if (r0 == 0) goto L5
                goto L3f
            L5:
                monitor-enter(r4)
                boolean r0 = r4.cancelled     // Catch: java.lang.Throwable -> Lc
                if (r0 == 0) goto Le
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                goto L40
            Le:
                boolean r0 = r4.next     // Catch: java.lang.Throwable -> Lc
                if (r0 == 0) goto L14
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                return
            L14:
                io.reactivex.processors.BehaviorProcessor<T> r0 = r4.state     // Catch: java.lang.Throwable -> Lc
                java.util.concurrent.locks.Lock r1 = r0.readLock     // Catch: java.lang.Throwable -> Lc
                r1.lock()     // Catch: java.lang.Throwable -> Lc
                long r2 = r0.index     // Catch: java.lang.Throwable -> Lc
                r4.index = r2     // Catch: java.lang.Throwable -> Lc
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.value     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lc
                r1.unlock()     // Catch: java.lang.Throwable -> Lc
                r1 = 1
                if (r0 == 0) goto L2d
                r2 = 1
                goto L2e
            L2d:
                r2 = 0
            L2e:
                r4.emitting = r2     // Catch: java.lang.Throwable -> Lc
                r4.next = r1     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                if (r0 == 0) goto L3f
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L3c
                goto L3f
            L3c:
                r4.emitLoop()
            L3f:
                return
            L40:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }

        void emitLoop() {
                r2 = this;
            L0:
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                monitor-enter(r2)
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto L11
                r0 = 0
                r2.emitting = r0     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r0 = move-exception
                goto L19
            L11:
                r1 = 0
                r2.queue = r1     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
                r0.forEachWhile(r2)
                goto L0
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
                throw r0
        }

        void emitNext(java.lang.Object r4, long r5) {
                r3 = this;
                boolean r0 = r3.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r3.fastPath
                if (r0 != 0) goto L38
                monitor-enter(r3)
                boolean r0 = r3.cancelled     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L12
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r4 = move-exception
                goto L36
            L12:
                long r0 = r3.index     // Catch: java.lang.Throwable -> L10
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L1a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                return
            L1a:
                boolean r5 = r3.emitting     // Catch: java.lang.Throwable -> L10
                if (r5 == 0) goto L2f
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r5 = r3.queue     // Catch: java.lang.Throwable -> L10
                if (r5 != 0) goto L2a
                io.reactivex.internal.util.AppendOnlyLinkedArrayList r5 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L10
                r6 = 4
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L10
                r3.queue = r5     // Catch: java.lang.Throwable -> L10
            L2a:
                r5.add(r4)     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                return
            L2f:
                r5 = 1
                r3.next = r5     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                r3.fastPath = r5
                goto L38
            L36:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                throw r4
            L38:
                r3.test(r4)
                return
        }

        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L9
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
            L9:
                return
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(java.lang.Object r7) {
                r6 = this;
                boolean r0 = r6.cancelled
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r7)
                if (r0 == 0) goto L12
                org.reactivestreams.Subscriber<? super T> r7 = r6.actual
                r7.onComplete()
                return r1
            L12:
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r7)
                if (r0 == 0) goto L22
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                java.lang.Throwable r7 = io.reactivex.internal.util.NotificationLite.getError(r7)
                r0.onError(r7)
                return r1
            L22:
                long r2 = r6.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L43
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.getValue(r7)
                r0.onNext(r7)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r7 == 0) goto L41
                r6.decrementAndGet()
            L41:
                r7 = 0
                return r7
            L43:
                r6.cancel()
                org.reactivestreams.Subscriber<? super T> r7 = r6.actual
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Could not deliver value due to lack of requests"
                r0.<init>(r2)
                r7.onError(r0)
                return r1
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            io.reactivex.processors.BehaviorProcessor.EMPTY_ARRAY = r1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[r0]
            io.reactivex.processors.BehaviorProcessor.EMPTY = r1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[r0]
            io.reactivex.processors.BehaviorProcessor.TERMINATED = r0
            return
    }

    BehaviorProcessor() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.value = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.lock = r0
            java.util.concurrent.locks.Lock r1 = r0.readLock()
            r2.readLock = r1
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r2.writeLock = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = io.reactivex.processors.BehaviorProcessor.EMPTY
            r0.<init>(r1)
            r2.subscribers = r0
            return
    }

    BehaviorProcessor(T r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.String r1 = "defaultValue is null"
            java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r1)
            r0.lazySet(r3)
            return
    }

    public static <T> io.reactivex.processors.BehaviorProcessor<T> create() {
            io.reactivex.processors.BehaviorProcessor r0 = new io.reactivex.processors.BehaviorProcessor
            r0.<init>()
            return r0
    }

    public static <T> io.reactivex.processors.BehaviorProcessor<T> createDefault(T r1) {
            java.lang.String r0 = "defaultValue is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.processors.BehaviorProcessor r0 = new io.reactivex.processors.BehaviorProcessor
            r0.<init>(r1)
            return r0
    }

    boolean add(io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = io.reactivex.processors.BehaviorProcessor.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r3 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r1 = r4.subscribers
            boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
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
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.Object r0 = r0.get()
            boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r1 != 0) goto L18
            boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r1 == 0) goto L13
            goto L18
        L13:
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.getValue(r0)
            return r0
        L18:
            r0 = 0
            return r0
    }

    public java.lang.Object[] getValues() {
            r2 = this;
            java.lang.Object[] r0 = io.reactivex.processors.BehaviorProcessor.EMPTY_ARRAY
            java.lang.Object[] r1 = r2.getValues(r0)
            if (r1 != r0) goto Lc
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lc:
            return r1
    }

    public T[] getValues(T[] r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r5.value
            java.lang.Object r0 = r0.get()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L38
            boolean r3 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r3 != 0) goto L38
            boolean r3 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r3 == 0) goto L17
            goto L38
        L17:
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.getValue(r0)
            int r3 = r6.length
            r4 = 1
            if (r3 == 0) goto L27
            r6[r2] = r0
            int r0 = r6.length
            if (r0 == r4) goto L26
            r6[r4] = r1
        L26:
            return r6
        L27:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r4)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r6[r2] = r0
            return r6
        L38:
            int r0 = r6.length
            if (r0 == 0) goto L3d
            r6[r2] = r1
        L3d:
            return r6
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.value
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
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
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.value
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            return r0
    }

    public boolean hasValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L16
            boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r1 != 0) goto L16
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void onComplete() {
            r7 = this;
            boolean r0 = r7.done
            if (r0 == 0) goto L5
            goto L1e
        L5:
            r0 = 1
            r7.done = r0
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = r7.terminate(r0)
            int r2 = r1.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            long r5 = r7.index
            r4.emitNext(r0, r5)
            int r3 = r3 + 1
            goto L12
        L1e:
            return
    }

    public void onError(java.lang.Throwable r7) {
            r6 = this;
            if (r7 != 0) goto L9
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
        L9:
            boolean r0 = r6.done
            if (r0 == 0) goto L11
            io.reactivex.plugins.RxJavaPlugins.onError(r7)
            return
        L11:
            r0 = 1
            r6.done = r0
            java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.error(r7)
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = r6.terminate(r7)
            int r1 = r0.length
            r2 = 0
        L1e:
            if (r2 >= r1) goto L2a
            r3 = r0[r2]
            long r4 = r6.index
            r3.emitNext(r7, r4)
            int r2 = r2 + 1
            goto L1e
        L2a:
            return
    }

    public void onNext(T r7) {
            r6 = this;
            if (r7 != 0) goto Ld
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
            r6.onError(r7)
            return
        Ld:
            boolean r0 = r6.done
            if (r0 == 0) goto L12
            goto L2f
        L12:
            java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.next(r7)
            r6.setCurrent(r7)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
            int r1 = r0.length
            r2 = 0
        L23:
            if (r2 >= r1) goto L2f
            r3 = r0[r2]
            long r4 = r6.index
            r3.emitNext(r7, r4)
            int r2 = r2 + 1
            goto L23
        L2f:
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

    void remove(io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = io.reactivex.processors.BehaviorProcessor.TERMINATED
            if (r0 == r1) goto L3f
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = io.reactivex.processors.BehaviorProcessor.EMPTY
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
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = io.reactivex.processors.BehaviorProcessor.EMPTY
            goto L37
        L28:
            int r5 = r1 + (-1)
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r5 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L37:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r2 = r6.subscribers
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto L0
        L3f:
            return
    }

    void setCurrent(java.lang.Object r6) {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.writeLock
            r0.lock()
            long r1 = r5.index
            r3 = 1
            long r1 = r1 + r3
            r5.index = r1
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.value
            r1.lazySet(r6)
            r0.unlock()
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription r0 = new io.reactivex.processors.BehaviorProcessor$BehaviorSubscription
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L1a
            boolean r3 = r0.cancelled
            if (r3 == 0) goto L16
            r2.remove(r0)
            return
        L16:
            r0.emitFirst()
            return
        L1a:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.Object r0 = r0.get()
            boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r1 == 0) goto L2a
            r3.onComplete()
            return
        L2a:
            java.lang.Throwable r0 = io.reactivex.internal.util.NotificationLite.getError(r0)
            r3.onError(r0)
            return
    }

    int subscriberCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
            int r0 = r0.length
            return r0
    }

    io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] terminate(java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = io.reactivex.processors.BehaviorProcessor.TERMINATED
            if (r0 == r1) goto L19
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r0 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r0
            if (r0 == r1) goto L19
            r2.setCurrent(r3)
        L19:
            return r0
    }
}

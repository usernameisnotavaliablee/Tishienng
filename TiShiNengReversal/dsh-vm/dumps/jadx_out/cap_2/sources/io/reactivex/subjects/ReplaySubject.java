package io.reactivex.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ReplaySubject<T> extends io.reactivex.subjects.Subject<T> {
    static final io.reactivex.subjects.ReplaySubject.ReplayDisposable[] EMPTY = null;
    private static final java.lang.Object[] EMPTY_ARRAY = null;
    static final io.reactivex.subjects.ReplaySubject.ReplayDisposable[] TERMINATED = null;
    final io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> buffer;
    boolean done;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[]> observers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.Node<T>> {
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

        boolean compareAndSet(java.lang.Object r1, java.lang.Object r2);

        java.lang.Object get();

        T getValue();

        T[] getValues(T[] r1);

        void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> r1);

        int size();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ReplayDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        java.lang.Object index;
        final io.reactivex.subjects.ReplaySubject<T> state;

        ReplayDisposable(io.reactivex.Observer<? super T> r1, io.reactivex.subjects.ReplaySubject<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.state = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.subjects.ReplaySubject<T> r0 = r1.state
                r0.remove(r1)
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeAndTimeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> head;
        final long maxAge;
        final int maxSize;
        final io.reactivex.Scheduler scheduler;
        int size;
        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> tail;
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
                io.reactivex.subjects.ReplaySubject$TimedNode r2 = new io.reactivex.subjects.ReplaySubject$TimedNode
                r3 = 0
                r4 = 0
                r2.<init>(r3, r4)
                r1.tail = r2
                r1.head = r2
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T r4) {
                r3 = this;
                io.reactivex.subjects.ReplaySubject$TimedNode r0 = new io.reactivex.subjects.ReplaySubject$TimedNode
                io.reactivex.Scheduler r1 = r3.scheduler
                java.util.concurrent.TimeUnit r2 = r3.unit
                long r1 = r1.now(r2)
                r0.<init>(r4, r1)
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                int r1 = r1 + 1
                r3.size = r1
                r4.set(r0)
                r3.trim()
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(java.lang.Object r4) {
                r3 = this;
                io.reactivex.subjects.ReplaySubject$TimedNode r0 = new io.reactivex.subjects.ReplaySubject$TimedNode
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.<init>(r4, r1)
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                r2 = 1
                int r1 = r1 + r2
                r3.size = r1
                r4.lazySet(r0)
                r3.trimFinal()
                r3.done = r2
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T getValue() {
                r4 = this;
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r0 = r4.head
                r1 = 0
                r2 = r1
            L4:
                java.lang.Object r3 = r0.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r3 = (io.reactivex.subjects.ReplaySubject.TimedNode) r3
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] r6) {
                r5 = this;
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r0 = r5.head
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
                io.reactivex.subjects.ReplaySubject$TimedNode r0 = (io.reactivex.subjects.ReplaySubject.TimedNode) r0
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> r11) {
                r10 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L7
                goto L62
            L7:
                io.reactivex.Observer<? super T> r0 = r11.actual
                java.lang.Object r1 = r11.index
                io.reactivex.subjects.ReplaySubject$TimedNode r1 = (io.reactivex.subjects.ReplaySubject.TimedNode) r1
                r2 = 1
                if (r1 != 0) goto L3a
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r1 = r10.head
                boolean r3 = r10.done
                if (r3 != 0) goto L3a
                io.reactivex.Scheduler r3 = r10.scheduler
                java.util.concurrent.TimeUnit r4 = r10.unit
                long r3 = r3.now(r4)
                long r5 = r10.maxAge
                long r3 = r3 - r5
                java.lang.Object r5 = r1.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r5 = (io.reactivex.subjects.ReplaySubject.TimedNode) r5
            L27:
                if (r5 == 0) goto L3a
                long r6 = r5.time
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 <= 0) goto L30
                goto L3a
            L30:
                java.lang.Object r1 = r5.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r1 = (io.reactivex.subjects.ReplaySubject.TimedNode) r1
                r9 = r5
                r5 = r1
                r1 = r9
                goto L27
            L3a:
                r3 = 1
            L3b:
                boolean r4 = r11.cancelled
                r5 = 0
                if (r4 == 0) goto L43
                r11.index = r5
                return
            L43:
                boolean r4 = r11.cancelled
                if (r4 == 0) goto L4a
                r11.index = r5
                return
            L4a:
                java.lang.Object r4 = r1.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r4 = (io.reactivex.subjects.ReplaySubject.TimedNode) r4
                if (r4 != 0) goto L63
                java.lang.Object r4 = r1.get()
                if (r4 == 0) goto L59
                goto L3b
            L59:
                r11.index = r1
                int r3 = -r3
                int r3 = r11.addAndGet(r3)
                if (r3 != 0) goto L3b
            L62:
                return
            L63:
                T r1 = r4.value
                boolean r6 = r10.done
                if (r6 == 0) goto L85
                java.lang.Object r6 = r4.get()
                if (r6 != 0) goto L85
                boolean r3 = io.reactivex.internal.util.NotificationLite.isComplete(r1)
                if (r3 == 0) goto L79
                r0.onComplete()
                goto L80
            L79:
                java.lang.Throwable r1 = io.reactivex.internal.util.NotificationLite.getError(r1)
                r0.onError(r1)
            L80:
                r11.index = r5
                r11.cancelled = r2
                return
            L85:
                r0.onNext(r1)
                r1 = r4
                goto L43
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
                r3 = this;
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r0 = r3.head
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L25
                java.lang.Object r2 = r0.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r2 = (io.reactivex.subjects.ReplaySubject.TimedNode) r2
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
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r0 = r7.head
                java.lang.Object r0 = r0.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r0 = (io.reactivex.subjects.ReplaySubject.TimedNode) r0
                r7.head = r0
            L14:
                io.reactivex.Scheduler r0 = r7.scheduler
                java.util.concurrent.TimeUnit r1 = r7.unit
                long r0 = r0.now(r1)
                long r2 = r7.maxAge
                long r0 = r0 - r2
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r2 = r7.head
            L21:
                java.lang.Object r3 = r2.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r3 = (io.reactivex.subjects.ReplaySubject.TimedNode) r3
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
                io.reactivex.subjects.ReplaySubject$TimedNode<java.lang.Object> r2 = r7.head
            Ld:
                java.lang.Object r3 = r2.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r3 = (io.reactivex.subjects.ReplaySubject.TimedNode) r3
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
    static final class SizeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> head;
        final int maxSize;
        int size;
        io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> tail;

        SizeBoundReplayBuffer(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "maxSize"
                int r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
                r1.maxSize = r2
                io.reactivex.subjects.ReplaySubject$Node r2 = new io.reactivex.subjects.ReplaySubject$Node
                r0 = 0
                r2.<init>(r0)
                r1.tail = r2
                r1.head = r2
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T r3) {
                r2 = this;
                io.reactivex.subjects.ReplaySubject$Node r0 = new io.reactivex.subjects.ReplaySubject$Node
                r0.<init>(r3)
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r3 = r2.tail
                r2.tail = r0
                int r1 = r2.size
                int r1 = r1 + 1
                r2.size = r1
                r3.set(r0)
                r2.trim()
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(java.lang.Object r4) {
                r3 = this;
                io.reactivex.subjects.ReplaySubject$Node r0 = new io.reactivex.subjects.ReplaySubject$Node
                r0.<init>(r4)
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                r2 = 1
                int r1 = r1 + r2
                r3.size = r1
                r4.lazySet(r0)
                r3.done = r2
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T getValue() {
                r4 = this;
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r0 = r4.head
                r1 = 0
                r2 = r1
            L4:
                java.lang.Object r3 = r0.get()
                io.reactivex.subjects.ReplaySubject$Node r3 = (io.reactivex.subjects.ReplaySubject.Node) r3
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public T[] getValues(T[] r6) {
                r5 = this;
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r0 = r5.head
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
                io.reactivex.subjects.ReplaySubject$Node r0 = (io.reactivex.subjects.ReplaySubject.Node) r0
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> r8) {
                r7 = this;
                int r0 = r8.getAndIncrement()
                if (r0 == 0) goto L7
                goto L33
            L7:
                io.reactivex.Observer<? super T> r0 = r8.actual
                java.lang.Object r1 = r8.index
                io.reactivex.subjects.ReplaySubject$Node r1 = (io.reactivex.subjects.ReplaySubject.Node) r1
                r2 = 1
                if (r1 != 0) goto L12
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r1 = r7.head
            L12:
                r3 = 1
            L13:
                boolean r4 = r8.cancelled
                r5 = 0
                if (r4 == 0) goto L1b
                r8.index = r5
                return
            L1b:
                java.lang.Object r4 = r1.get()
                io.reactivex.subjects.ReplaySubject$Node r4 = (io.reactivex.subjects.ReplaySubject.Node) r4
                if (r4 != 0) goto L34
                java.lang.Object r4 = r1.get()
                if (r4 == 0) goto L2a
                goto L13
            L2a:
                r8.index = r1
                int r3 = -r3
                int r3 = r8.addAndGet(r3)
                if (r3 != 0) goto L13
            L33:
                return
            L34:
                T r1 = r4.value
                boolean r6 = r7.done
                if (r6 == 0) goto L56
                java.lang.Object r6 = r4.get()
                if (r6 != 0) goto L56
                boolean r3 = io.reactivex.internal.util.NotificationLite.isComplete(r1)
                if (r3 == 0) goto L4a
                r0.onComplete()
                goto L51
            L4a:
                java.lang.Throwable r1 = io.reactivex.internal.util.NotificationLite.getError(r1)
                r0.onError(r1)
            L51:
                r8.index = r5
                r8.cancelled = r2
                return
            L56:
                r0.onNext(r1)
                r1 = r4
                goto L13
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public int size() {
                r3 = this;
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r0 = r3.head
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L25
                java.lang.Object r2 = r0.get()
                io.reactivex.subjects.ReplaySubject$Node r2 = (io.reactivex.subjects.ReplaySubject.Node) r2
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
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r0 = r2.head
                java.lang.Object r0 = r0.get()
                io.reactivex.subjects.ReplaySubject$Node r0 = (io.reactivex.subjects.ReplaySubject.Node) r0
                r2.head = r0
            L14:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.TimedNode<T>> {
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
    static final class UnboundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void add(T r2) {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.buffer
                r0.add(r2)
                int r2 = r1.size
                int r2 = r2 + 1
                r1.size = r2
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void addFinal(java.lang.Object r2) {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.buffer
                r0.add(r2)
                int r2 = r1.size
                r0 = 1
                int r2 = r2 + r0
                r1.size = r2
                r1.done = r0
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
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

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public void replay(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> r10) {
                r9 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L8
                goto L72
            L8:
                java.util.List<java.lang.Object> r0 = r9.buffer
                io.reactivex.Observer<? super T> r1 = r10.actual
                java.lang.Object r2 = r10.index
                java.lang.Integer r2 = (java.lang.Integer) r2
                r3 = 1
                if (r2 == 0) goto L19
                int r2 = r2.intValue()
            L17:
                r4 = 1
                goto L21
            L19:
                r2 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r10.index = r4
                goto L17
            L21:
                boolean r5 = r10.cancelled
                r6 = 0
                if (r5 == 0) goto L29
                r10.index = r6
                return
            L29:
                int r5 = r9.size
            L2b:
                if (r5 == r2) goto L60
                boolean r7 = r10.cancelled
                if (r7 == 0) goto L34
                r10.index = r6
                return
            L34:
                java.lang.Object r7 = r0.get(r2)
                boolean r8 = r9.done
                if (r8 == 0) goto L5a
                int r8 = r2 + 1
                if (r8 != r5) goto L5a
                int r5 = r9.size
                if (r8 != r5) goto L5a
                boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r7)
                if (r0 == 0) goto L4e
                r1.onComplete()
                goto L55
            L4e:
                java.lang.Throwable r0 = io.reactivex.internal.util.NotificationLite.getError(r7)
                r1.onError(r0)
            L55:
                r10.index = r6
                r10.cancelled = r3
                return
            L5a:
                r1.onNext(r7)
                int r2 = r2 + 1
                goto L2b
            L60:
                int r5 = r9.size
                if (r2 == r5) goto L65
                goto L21
            L65:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r10.index = r5
                int r4 = -r4
                int r4 = r10.addAndGet(r4)
                if (r4 != 0) goto L21
            L72:
                return
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
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
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r1 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[r0]
            io.reactivex.subjects.ReplaySubject.EMPTY = r1
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r1 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[r0]
            io.reactivex.subjects.ReplaySubject.TERMINATED = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            io.reactivex.subjects.ReplaySubject.EMPTY_ARRAY = r0
            return
    }

    ReplaySubject(io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> r2) {
            r1 = this;
            r1.<init>()
            r1.buffer = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = io.reactivex.subjects.ReplaySubject.EMPTY
            r2.<init>(r0)
            r1.observers = r2
            return
    }

    public static <T> io.reactivex.subjects.ReplaySubject<T> create() {
            io.reactivex.subjects.ReplaySubject r0 = new io.reactivex.subjects.ReplaySubject
            io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer r1 = new io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer
            r2 = 16
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subjects.ReplaySubject<T> create(int r2) {
            io.reactivex.subjects.ReplaySubject r0 = new io.reactivex.subjects.ReplaySubject
            io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer r1 = new io.reactivex.subjects.ReplaySubject$UnboundedReplayBuffer
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    static <T> io.reactivex.subjects.ReplaySubject<T> createUnbounded() {
            io.reactivex.subjects.ReplaySubject r0 = new io.reactivex.subjects.ReplaySubject
            io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer r1 = new io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithSize(int r2) {
            io.reactivex.subjects.ReplaySubject r0 = new io.reactivex.subjects.ReplaySubject
            io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer r1 = new io.reactivex.subjects.ReplaySubject$SizeBoundReplayBuffer
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithTime(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            io.reactivex.subjects.ReplaySubject r0 = new io.reactivex.subjects.ReplaySubject
            io.reactivex.subjects.ReplaySubject$SizeAndTimeBoundReplayBuffer r1 = new io.reactivex.subjects.ReplaySubject$SizeAndTimeBoundReplayBuffer
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = r7
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithTimeAndSize(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10, int r11) {
            io.reactivex.subjects.ReplaySubject r0 = new io.reactivex.subjects.ReplaySubject
            io.reactivex.subjects.ReplaySubject$SizeAndTimeBoundReplayBuffer r1 = new io.reactivex.subjects.ReplaySubject$SizeAndTimeBoundReplayBuffer
            r3 = r7
            r5 = r9
            r6 = r10
            r2 = r11
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r1)
            return r0
    }

    boolean add(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r0 = r4.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = (io.reactivex.subjects.ReplaySubject.ReplayDisposable[]) r0
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r1 = io.reactivex.subjects.ReplaySubject.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r3 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r1 = r4.observers
            boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
            r2 = this;
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r2.buffer
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
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public java.lang.Object[] getValues() {
            r2 = this;
            java.lang.Object[] r0 = io.reactivex.subjects.ReplaySubject.EMPTY_ARRAY
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
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object[] r2 = r0.getValues(r2)
            return r2
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
            r1 = this;
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r0 = r1.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = (io.reactivex.subjects.ReplaySubject.ReplayDisposable[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
            r1 = this;
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            return r0
    }

    public boolean hasValue() {
            r1 = this;
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r1.buffer
            int r0 = r0.size()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    int observerCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r0 = r1.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = (io.reactivex.subjects.ReplaySubject.ReplayDisposable[]) r0
            int r0 = r0.length
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r5 = this;
            boolean r0 = r5.done
            if (r0 == 0) goto L5
            goto L21
        L5:
            r0 = 1
            r5.done = r0
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r1 = r5.buffer
            r1.addFinal(r0)
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = r5.terminate(r0)
            int r2 = r0.length
            r3 = 0
        L17:
            if (r3 >= r2) goto L21
            r4 = r0[r3]
            r1.replay(r4)
            int r3 = r3 + 1
            goto L17
        L21:
            return
    }

    @Override // io.reactivex.Observer
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
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r4.buffer
            r0.addFinal(r5)
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r5 = r4.terminate(r5)
            int r1 = r5.length
            r2 = 0
        L23:
            if (r2 >= r1) goto L2d
            r3 = r5[r2]
            r0.replay(r3)
            int r2 = r2 + 1
            goto L23
        L2d:
            return
    }

    @Override // io.reactivex.Observer
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
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r4.buffer
            r0.add(r5)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r5 = r4.observers
            java.lang.Object r5 = r5.get()
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r5 = (io.reactivex.subjects.ReplaySubject.ReplayDisposable[]) r5
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

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L7
            r2.dispose()
        L7:
            return
    }

    void remove(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r0 = r6.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = (io.reactivex.subjects.ReplaySubject.ReplayDisposable[]) r0
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r1 = io.reactivex.subjects.ReplaySubject.TERMINATED
            if (r0 == r1) goto L3f
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r1 = io.reactivex.subjects.ReplaySubject.EMPTY
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
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r1 = io.reactivex.subjects.ReplaySubject.EMPTY
            goto L37
        L28:
            int r5 = r1 + (-1)
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r5 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L37:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r2 = r6.observers
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto L0
        L3f:
            return
    }

    int size() {
            r1 = this;
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r1.buffer
            int r0 = r0.size()
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.subjects.ReplaySubject$ReplayDisposable r0 = new io.reactivex.subjects.ReplaySubject$ReplayDisposable
            r0.<init>(r2, r1)
            r2.onSubscribe(r0)
            boolean r2 = r0.cancelled
            if (r2 != 0) goto L1f
            boolean r2 = r1.add(r0)
            if (r2 == 0) goto L1a
            boolean r2 = r0.cancelled
            if (r2 == 0) goto L1a
            r1.remove(r0)
            return
        L1a:
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r2 = r1.buffer
            r2.replay(r0)
        L1f:
            return
    }

    io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] terminate(java.lang.Object r3) {
            r2 = this;
            io.reactivex.subjects.ReplaySubject$ReplayBuffer<T> r0 = r2.buffer
            r1 = 0
            boolean r3 = r0.compareAndSet(r1, r3)
            if (r3 == 0) goto L14
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject$ReplayDisposable<T>[]> r3 = r2.observers
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r0 = io.reactivex.subjects.ReplaySubject.TERMINATED
            java.lang.Object r3 = r3.getAndSet(r0)
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r3 = (io.reactivex.subjects.ReplaySubject.ReplayDisposable[]) r3
            return r3
        L14:
            io.reactivex.subjects.ReplaySubject$ReplayDisposable[] r3 = io.reactivex.subjects.ReplaySubject.TERMINATED
            return r3
    }
}

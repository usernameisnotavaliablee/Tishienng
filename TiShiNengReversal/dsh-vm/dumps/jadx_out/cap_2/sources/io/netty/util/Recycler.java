package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Recycler<T> {
    private static final int DEFAULT_INITIAL_MAX_CAPACITY_PER_THREAD = 4096;
    private static final int DEFAULT_MAX_CAPACITY_PER_THREAD = 0;
    private static final io.netty.util.concurrent.FastThreadLocal<java.util.Map<io.netty.util.Recycler.Stack<?>, io.netty.util.Recycler.WeakOrderQueue>> DELAYED_RECYCLED = null;
    private static final java.util.concurrent.atomic.AtomicInteger ID_GENERATOR = null;
    private static final int INITIAL_CAPACITY = 0;
    private static final int LINK_CAPACITY = 0;
    private static final int MAX_DELAYED_QUEUES_PER_THREAD = 0;
    private static final int MAX_SHARED_CAPACITY_FACTOR = 0;
    private static final io.netty.util.Recycler.Handle NOOP_HANDLE = null;
    private static final int OWN_THREAD_ID = 0;
    private static final int RATIO = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final int maxCapacityPerThread;
    private final int maxDelayedQueuesPerThread;
    private final int maxSharedCapacityFactor;
    private final int ratioMask;
    private final io.netty.util.concurrent.FastThreadLocal<io.netty.util.Recycler.Stack<T>> threadLocal;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DefaultHandle<T> implements io.netty.util.Recycler.Handle<T> {
        boolean hasBeenRecycled;
        private int lastRecycledId;
        private int recycleId;
        private io.netty.util.Recycler.Stack<?> stack;
        private java.lang.Object value;

        DefaultHandle(io.netty.util.Recycler.Stack<?> r1) {
                r0 = this;
                r0.<init>()
                r0.stack = r1
                return
        }

        static /* synthetic */ int access$1100(io.netty.util.Recycler.DefaultHandle r0) {
                int r0 = r0.lastRecycledId
                return r0
        }

        static /* synthetic */ int access$1102(io.netty.util.Recycler.DefaultHandle r0, int r1) {
                r0.lastRecycledId = r1
                return r1
        }

        static /* synthetic */ int access$1400(io.netty.util.Recycler.DefaultHandle r0) {
                int r0 = r0.recycleId
                return r0
        }

        static /* synthetic */ int access$1402(io.netty.util.Recycler.DefaultHandle r0, int r1) {
                r0.recycleId = r1
                return r1
        }

        static /* synthetic */ java.lang.Object access$500(io.netty.util.Recycler.DefaultHandle r0) {
                java.lang.Object r0 = r0.value
                return r0
        }

        static /* synthetic */ java.lang.Object access$502(io.netty.util.Recycler.DefaultHandle r0, java.lang.Object r1) {
                r0.value = r1
                return r1
        }

        static /* synthetic */ io.netty.util.Recycler.Stack access$600(io.netty.util.Recycler.DefaultHandle r0) {
                io.netty.util.Recycler$Stack<?> r0 = r0.stack
                return r0
        }

        static /* synthetic */ io.netty.util.Recycler.Stack access$602(io.netty.util.Recycler.DefaultHandle r0, io.netty.util.Recycler.Stack r1) {
                r0.stack = r1
                return r1
        }

        @Override // io.netty.util.Recycler.Handle
        public void recycle(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r0 = r2.value
                if (r3 != r0) goto L1a
                io.netty.util.Recycler$Stack<?> r3 = r2.stack
                int r0 = r2.lastRecycledId
                int r1 = r2.recycleId
                if (r0 != r1) goto L12
                if (r3 == 0) goto L12
                r3.push(r2)
                return
            L12:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "recycled already"
                r3.<init>(r0)
                throw r3
            L1a:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "object does not belong to handle"
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Handle<T> {
        void recycle(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Stack<T> {
        final java.util.concurrent.atomic.AtomicInteger availableSharedCapacity;
        private io.netty.util.Recycler.WeakOrderQueue cursor;
        private io.netty.util.Recycler.DefaultHandle<?>[] elements;
        private int handleRecycleCount;
        private volatile io.netty.util.Recycler.WeakOrderQueue head;
        private final int maxCapacity;
        final int maxDelayedQueues;
        final io.netty.util.Recycler<T> parent;
        private io.netty.util.Recycler.WeakOrderQueue prev;
        private final int ratioMask;
        private int size;
        final java.lang.ref.WeakReference<java.lang.Thread> threadRef;

        Stack(io.netty.util.Recycler<T> r2, java.lang.Thread r3, int r4, int r5, int r6, int r7) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.handleRecycleCount = r0
                r1.parent = r2
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.threadRef = r2
                r1.maxCapacity = r4
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                int r3 = r4 / r5
                int r5 = io.netty.util.Recycler.access$900()
                int r3 = java.lang.Math.max(r3, r5)
                r2.<init>(r3)
                r1.availableSharedCapacity = r2
                int r2 = io.netty.util.Recycler.access$1500()
                int r2 = java.lang.Math.min(r2, r4)
                io.netty.util.Recycler$DefaultHandle[] r2 = new io.netty.util.Recycler.DefaultHandle[r2]
                r1.elements = r2
                r1.ratioMask = r6
                r1.maxDelayedQueues = r7
                return
        }

        static /* synthetic */ io.netty.util.Recycler.DefaultHandle[] access$700(io.netty.util.Recycler.Stack r0) {
                io.netty.util.Recycler$DefaultHandle<?>[] r0 = r0.elements
                return r0
        }

        static /* synthetic */ int access$800(io.netty.util.Recycler.Stack r0) {
                int r0 = r0.size
                return r0
        }

        static /* synthetic */ int access$802(io.netty.util.Recycler.Stack r0, int r1) {
                r0.size = r1
                return r1
        }

        private void pushLater(io.netty.util.Recycler.DefaultHandle<?> r4, java.lang.Thread r5) {
                r3 = this;
                io.netty.util.concurrent.FastThreadLocal r0 = io.netty.util.Recycler.access$400()
                java.lang.Object r0 = r0.get()
                java.util.Map r0 = (java.util.Map) r0
                java.lang.Object r1 = r0.get(r3)
                io.netty.util.Recycler$WeakOrderQueue r1 = (io.netty.util.Recycler.WeakOrderQueue) r1
                if (r1 != 0) goto L2b
                int r1 = r0.size()
                int r2 = r3.maxDelayedQueues
                if (r1 < r2) goto L20
                io.netty.util.Recycler$WeakOrderQueue r4 = io.netty.util.Recycler.WeakOrderQueue.DUMMY
                r0.put(r3, r4)
                return
            L20:
                io.netty.util.Recycler$WeakOrderQueue r1 = io.netty.util.Recycler.WeakOrderQueue.allocate(r3, r5)
                if (r1 != 0) goto L27
                goto L2f
            L27:
                r0.put(r3, r1)
                goto L30
            L2b:
                io.netty.util.Recycler$WeakOrderQueue r5 = io.netty.util.Recycler.WeakOrderQueue.DUMMY
                if (r1 != r5) goto L30
            L2f:
                return
            L30:
                r1.add(r4)
                return
        }

        private void pushNow(io.netty.util.Recycler.DefaultHandle<?> r5) {
                r4 = this;
                int r0 = io.netty.util.Recycler.DefaultHandle.access$1400(r5)
                int r1 = io.netty.util.Recycler.DefaultHandle.access$1100(r5)
                r0 = r0 | r1
                if (r0 != 0) goto L41
                int r0 = io.netty.util.Recycler.access$1900()
                int r0 = io.netty.util.Recycler.DefaultHandle.access$1102(r5, r0)
                io.netty.util.Recycler.DefaultHandle.access$1402(r5, r0)
                int r0 = r4.size
                int r1 = r4.maxCapacity
                if (r0 >= r1) goto L40
                boolean r1 = r4.dropHandle(r5)
                if (r1 == 0) goto L23
                goto L40
            L23:
                io.netty.util.Recycler$DefaultHandle<?>[] r1 = r4.elements
                int r2 = r1.length
                if (r0 != r2) goto L38
                int r2 = r0 << 1
                int r3 = r4.maxCapacity
                int r2 = java.lang.Math.min(r2, r3)
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                io.netty.util.Recycler$DefaultHandle[] r1 = (io.netty.util.Recycler.DefaultHandle[]) r1
                r4.elements = r1
            L38:
                io.netty.util.Recycler$DefaultHandle<?>[] r1 = r4.elements
                r1[r0] = r5
                int r0 = r0 + 1
                r4.size = r0
            L40:
                return
            L41:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "recycled already"
                r5.<init>(r0)
                throw r5
        }

        boolean dropHandle(io.netty.util.Recycler.DefaultHandle<?> r4) {
                r3 = this;
                boolean r0 = r4.hasBeenRecycled
                if (r0 != 0) goto L12
                int r0 = r3.handleRecycleCount
                r1 = 1
                int r0 = r0 + r1
                r3.handleRecycleCount = r0
                int r2 = r3.ratioMask
                r0 = r0 & r2
                if (r0 == 0) goto L10
                return r1
            L10:
                r4.hasBeenRecycled = r1
            L12:
                r4 = 0
                return r4
        }

        int increaseCapacity(int r3) {
                r2 = this;
                io.netty.util.Recycler$DefaultHandle<?>[] r0 = r2.elements
                int r0 = r0.length
                int r1 = r2.maxCapacity
            L5:
                int r0 = r0 << 1
                if (r0 >= r3) goto Lb
                if (r0 < r1) goto L5
            Lb:
                int r3 = java.lang.Math.min(r0, r1)
                io.netty.util.Recycler$DefaultHandle<?>[] r0 = r2.elements
                int r1 = r0.length
                if (r3 == r1) goto L1c
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
                io.netty.util.Recycler$DefaultHandle[] r0 = (io.netty.util.Recycler.DefaultHandle[]) r0
                r2.elements = r0
            L1c:
                return r3
        }

        io.netty.util.Recycler.DefaultHandle<T> newHandle() {
                r1 = this;
                io.netty.util.Recycler$DefaultHandle r0 = new io.netty.util.Recycler$DefaultHandle
                r0.<init>(r1)
                return r0
        }

        io.netty.util.Recycler.DefaultHandle<T> pop() {
                r4 = this;
                int r0 = r4.size
                r1 = 0
                if (r0 != 0) goto Le
                boolean r0 = r4.scavenge()
                if (r0 != 0) goto Lc
                return r1
            Lc:
                int r0 = r4.size
            Le:
                int r0 = r0 + (-1)
                io.netty.util.Recycler$DefaultHandle<?>[] r2 = r4.elements
                r3 = r2[r0]
                r2[r0] = r1
                int r1 = io.netty.util.Recycler.DefaultHandle.access$1100(r3)
                int r2 = io.netty.util.Recycler.DefaultHandle.access$1400(r3)
                if (r1 != r2) goto L2a
                r1 = 0
                io.netty.util.Recycler.DefaultHandle.access$1402(r3, r1)
                io.netty.util.Recycler.DefaultHandle.access$1102(r3, r1)
                r4.size = r0
                return r3
            L2a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "recycled multiple times"
                r0.<init>(r1)
                throw r0
        }

        void push(io.netty.util.Recycler.DefaultHandle<?> r3) {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.ref.WeakReference<java.lang.Thread> r1 = r2.threadRef
                java.lang.Object r1 = r1.get()
                if (r1 != r0) goto L10
                r2.pushNow(r3)
                return
            L10:
                r2.pushLater(r3, r0)
                return
        }

        boolean scavenge() {
                r1 = this;
                boolean r0 = r1.scavengeSome()
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                r1.prev = r0
                io.netty.util.Recycler$WeakOrderQueue r0 = r1.head
                r1.cursor = r0
                r0 = 0
                return r0
        }

        boolean scavengeSome() {
                r6 = this;
                io.netty.util.Recycler$WeakOrderQueue r0 = r6.cursor
                r1 = 0
                if (r0 != 0) goto Lc
                io.netty.util.Recycler$WeakOrderQueue r0 = r6.head
                if (r0 != 0) goto La
                return r1
            La:
                r2 = 0
                goto Le
            Lc:
                io.netty.util.Recycler$WeakOrderQueue r2 = r6.prev
            Le:
                boolean r3 = r0.transfer(r6)
                r4 = 1
                if (r3 == 0) goto L16
                goto L42
            L16:
                io.netty.util.Recycler$WeakOrderQueue r3 = io.netty.util.Recycler.WeakOrderQueue.access$1700(r0)
                java.lang.ref.WeakReference r5 = io.netty.util.Recycler.WeakOrderQueue.access$1800(r0)
                java.lang.Object r5 = r5.get()
                if (r5 != 0) goto L38
                boolean r5 = r0.hasFinalData()
                if (r5 == 0) goto L32
            L2a:
                boolean r5 = r0.transfer(r6)
                if (r5 == 0) goto L32
                r1 = 1
                goto L2a
            L32:
                if (r2 == 0) goto L39
                io.netty.util.Recycler.WeakOrderQueue.access$1600(r2, r3)
                goto L39
            L38:
                r2 = r0
            L39:
                if (r3 == 0) goto L40
                if (r1 == 0) goto L3e
                goto L40
            L3e:
                r0 = r3
                goto Le
            L40:
                r4 = r1
                r0 = r3
            L42:
                r6.prev = r2
                r6.cursor = r0
                return r4
        }

        synchronized void setHead(io.netty.util.Recycler.WeakOrderQueue r2) {
                r1 = this;
                monitor-enter(r1)
                io.netty.util.Recycler$WeakOrderQueue r0 = r1.head     // Catch: java.lang.Throwable -> La
                io.netty.util.Recycler.WeakOrderQueue.access$1600(r2, r0)     // Catch: java.lang.Throwable -> La
                r1.head = r2     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return
            La:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class WeakOrderQueue {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final io.netty.util.Recycler.WeakOrderQueue DUMMY = null;
        private final io.netty.util.Recycler.WeakOrderQueue.Head head;
        private final int id;
        private io.netty.util.Recycler.WeakOrderQueue next;
        private final java.lang.ref.WeakReference<java.lang.Thread> owner;
        private io.netty.util.Recycler.WeakOrderQueue.Link tail;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Head {
            static final /* synthetic */ boolean $assertionsDisabled = false;
            private final java.util.concurrent.atomic.AtomicInteger availableSharedCapacity;
            io.netty.util.Recycler.WeakOrderQueue.Link link;

            static {
                    return
            }

            Head(java.util.concurrent.atomic.AtomicInteger r1) {
                    r0 = this;
                    r0.<init>()
                    r0.availableSharedCapacity = r1
                    return
            }

            static boolean reserveSpace(java.util.concurrent.atomic.AtomicInteger r2, int r3) {
                L0:
                    int r0 = r2.get()
                    if (r0 >= r3) goto L8
                    r2 = 0
                    return r2
                L8:
                    int r1 = r0 - r3
                    boolean r0 = r2.compareAndSet(r0, r1)
                    if (r0 == 0) goto L0
                    r2 = 1
                    return r2
            }

            protected void finalize() throws java.lang.Throwable {
                    r4 = this;
                    r0 = 0
                    super.finalize()     // Catch: java.lang.Throwable -> L18
                    io.netty.util.Recycler$WeakOrderQueue$Link r1 = r4.link
                    r4.link = r0
                L8:
                    if (r1 == 0) goto L17
                    int r2 = io.netty.util.Recycler.access$900()
                    r4.reclaimSpace(r2)
                    io.netty.util.Recycler$WeakOrderQueue$Link r2 = r1.next
                    r1.next = r0
                    r1 = r2
                    goto L8
                L17:
                    return
                L18:
                    r1 = move-exception
                    io.netty.util.Recycler$WeakOrderQueue$Link r2 = r4.link
                    r4.link = r0
                L1d:
                    if (r2 == 0) goto L2c
                    int r3 = io.netty.util.Recycler.access$900()
                    r4.reclaimSpace(r3)
                    io.netty.util.Recycler$WeakOrderQueue$Link r3 = r2.next
                    r2.next = r0
                    r2 = r3
                    goto L1d
                L2c:
                    throw r1
            }

            void reclaimSpace(int r2) {
                    r1 = this;
                    java.util.concurrent.atomic.AtomicInteger r0 = r1.availableSharedCapacity
                    r0.addAndGet(r2)
                    return
            }

            boolean reserveSpace(int r2) {
                    r1 = this;
                    java.util.concurrent.atomic.AtomicInteger r0 = r1.availableSharedCapacity
                    boolean r2 = reserveSpace(r0, r2)
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Link extends java.util.concurrent.atomic.AtomicInteger {
            private final io.netty.util.Recycler.DefaultHandle<?>[] elements;
            io.netty.util.Recycler.WeakOrderQueue.Link next;
            private int readIndex;

            Link() {
                    r1 = this;
                    r1.<init>()
                    int r0 = io.netty.util.Recycler.access$900()
                    io.netty.util.Recycler$DefaultHandle[] r0 = new io.netty.util.Recycler.DefaultHandle[r0]
                    r1.elements = r0
                    return
            }

            static /* synthetic */ io.netty.util.Recycler.DefaultHandle[] access$1200(io.netty.util.Recycler.WeakOrderQueue.Link r0) {
                    io.netty.util.Recycler$DefaultHandle<?>[] r0 = r0.elements
                    return r0
            }

            static /* synthetic */ int access$1300(io.netty.util.Recycler.WeakOrderQueue.Link r0) {
                    int r0 = r0.readIndex
                    return r0
            }

            static /* synthetic */ int access$1302(io.netty.util.Recycler.WeakOrderQueue.Link r0, int r1) {
                    r0.readIndex = r1
                    return r1
            }
        }

        static {
                io.netty.util.Recycler$WeakOrderQueue r0 = new io.netty.util.Recycler$WeakOrderQueue
                r0.<init>()
                io.netty.util.Recycler.WeakOrderQueue.DUMMY = r0
                return
        }

        private WeakOrderQueue() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.Recycler.access$1000()
                int r0 = r0.getAndIncrement()
                r2.id = r0
                r0 = 0
                r2.owner = r0
                io.netty.util.Recycler$WeakOrderQueue$Head r1 = new io.netty.util.Recycler$WeakOrderQueue$Head
                r1.<init>(r0)
                r2.head = r1
                return
        }

        private WeakOrderQueue(io.netty.util.Recycler.Stack<?> r2, java.lang.Thread r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.Recycler.access$1000()
                int r0 = r0.getAndIncrement()
                r1.id = r0
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = new io.netty.util.Recycler$WeakOrderQueue$Link
                r0.<init>()
                r1.tail = r0
                io.netty.util.Recycler$WeakOrderQueue$Head r0 = new io.netty.util.Recycler$WeakOrderQueue$Head
                java.util.concurrent.atomic.AtomicInteger r2 = r2.availableSharedCapacity
                r0.<init>(r2)
                r1.head = r0
                io.netty.util.Recycler$WeakOrderQueue$Link r2 = r1.tail
                r0.link = r2
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.owner = r2
                return
        }

        static /* synthetic */ void access$1600(io.netty.util.Recycler.WeakOrderQueue r0, io.netty.util.Recycler.WeakOrderQueue r1) {
                r0.setNext(r1)
                return
        }

        static /* synthetic */ io.netty.util.Recycler.WeakOrderQueue access$1700(io.netty.util.Recycler.WeakOrderQueue r0) {
                io.netty.util.Recycler$WeakOrderQueue r0 = r0.next
                return r0
        }

        static /* synthetic */ java.lang.ref.WeakReference access$1800(io.netty.util.Recycler.WeakOrderQueue r0) {
                java.lang.ref.WeakReference<java.lang.Thread> r0 = r0.owner
                return r0
        }

        static io.netty.util.Recycler.WeakOrderQueue allocate(io.netty.util.Recycler.Stack<?> r2, java.lang.Thread r3) {
                java.util.concurrent.atomic.AtomicInteger r0 = r2.availableSharedCapacity
                int r1 = io.netty.util.Recycler.access$900()
                boolean r0 = io.netty.util.Recycler.WeakOrderQueue.Head.reserveSpace(r0, r1)
                if (r0 == 0) goto L11
                io.netty.util.Recycler$WeakOrderQueue r2 = newQueue(r2, r3)
                return r2
            L11:
                r2 = 0
                return r2
        }

        static io.netty.util.Recycler.WeakOrderQueue newQueue(io.netty.util.Recycler.Stack<?> r1, java.lang.Thread r2) {
                io.netty.util.Recycler$WeakOrderQueue r0 = new io.netty.util.Recycler$WeakOrderQueue
                r0.<init>(r1, r2)
                r1.setHead(r0)
                return r0
        }

        private void setNext(io.netty.util.Recycler.WeakOrderQueue r1) {
                r0 = this;
                r0.next = r1
                return
        }

        void add(io.netty.util.Recycler.DefaultHandle<?> r5) {
                r4 = this;
                int r0 = r4.id
                io.netty.util.Recycler.DefaultHandle.access$1102(r5, r0)
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = r4.tail
                int r1 = r0.get()
                int r2 = io.netty.util.Recycler.access$900()
                if (r1 != r2) goto L2e
                io.netty.util.Recycler$WeakOrderQueue$Head r1 = r4.head
                int r2 = io.netty.util.Recycler.access$900()
                boolean r1 = r1.reserveSpace(r2)
                if (r1 != 0) goto L1e
                return
            L1e:
                io.netty.util.Recycler$WeakOrderQueue$Link r1 = new io.netty.util.Recycler$WeakOrderQueue$Link
                r1.<init>()
                r0.next = r1
                r4.tail = r1
                int r0 = r1.get()
                r3 = r1
                r1 = r0
                r0 = r3
            L2e:
                io.netty.util.Recycler$DefaultHandle[] r2 = io.netty.util.Recycler.WeakOrderQueue.Link.access$1200(r0)
                r2[r1] = r5
                r2 = 0
                io.netty.util.Recycler.DefaultHandle.access$602(r5, r2)
                int r1 = r1 + 1
                r0.lazySet(r1)
                return
        }

        boolean hasFinalData() {
                r2 = this;
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = r2.tail
                int r0 = io.netty.util.Recycler.WeakOrderQueue.Link.access$1300(r0)
                io.netty.util.Recycler$WeakOrderQueue$Link r1 = r2.tail
                int r1 = r1.get()
                if (r0 == r1) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        boolean transfer(io.netty.util.Recycler.Stack<?> r11) {
                r10 = this;
                io.netty.util.Recycler$WeakOrderQueue$Head r0 = r10.head
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = r0.link
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r2 = io.netty.util.Recycler.WeakOrderQueue.Link.access$1300(r0)
                int r3 = io.netty.util.Recycler.access$900()
                if (r2 != r3) goto L22
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = r0.next
                if (r0 != 0) goto L17
                return r1
            L17:
                io.netty.util.Recycler$WeakOrderQueue$Head r2 = r10.head
                r2.link = r0
                int r3 = io.netty.util.Recycler.access$900()
                r2.reclaimSpace(r3)
            L22:
                int r2 = io.netty.util.Recycler.WeakOrderQueue.Link.access$1300(r0)
                int r3 = r0.get()
                int r4 = r3 - r2
                if (r4 != 0) goto L2f
                return r1
            L2f:
                int r5 = io.netty.util.Recycler.Stack.access$800(r11)
                int r4 = r4 + r5
                io.netty.util.Recycler$DefaultHandle[] r6 = io.netty.util.Recycler.Stack.access$700(r11)
                int r6 = r6.length
                if (r4 <= r6) goto L45
                int r4 = r11.increaseCapacity(r4)
                int r4 = r4 + r2
                int r4 = r4 - r5
                int r3 = java.lang.Math.min(r4, r3)
            L45:
                if (r2 == r3) goto Lb0
                io.netty.util.Recycler$DefaultHandle[] r4 = io.netty.util.Recycler.WeakOrderQueue.Link.access$1200(r0)
                io.netty.util.Recycler$DefaultHandle[] r6 = io.netty.util.Recycler.Stack.access$700(r11)
            L4f:
                if (r2 >= r3) goto L88
                r7 = r4[r2]
                int r8 = io.netty.util.Recycler.DefaultHandle.access$1400(r7)
                if (r8 != 0) goto L61
                int r8 = io.netty.util.Recycler.DefaultHandle.access$1100(r7)
                io.netty.util.Recycler.DefaultHandle.access$1402(r7, r8)
                goto L6b
            L61:
                int r8 = io.netty.util.Recycler.DefaultHandle.access$1400(r7)
                int r9 = io.netty.util.Recycler.DefaultHandle.access$1100(r7)
                if (r8 != r9) goto L80
            L6b:
                r8 = 0
                r4[r2] = r8
                boolean r8 = r11.dropHandle(r7)
                if (r8 == 0) goto L75
                goto L7d
            L75:
                io.netty.util.Recycler.DefaultHandle.access$602(r7, r11)
                int r8 = r5 + 1
                r6[r5] = r7
                r5 = r8
            L7d:
                int r2 = r2 + 1
                goto L4f
            L80:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "recycled already"
                r11.<init>(r0)
                throw r11
            L88:
                int r2 = io.netty.util.Recycler.access$900()
                if (r3 != r2) goto La1
                io.netty.util.Recycler$WeakOrderQueue$Link r2 = r0.next
                if (r2 == 0) goto La1
                io.netty.util.Recycler$WeakOrderQueue$Head r2 = r10.head
                int r4 = io.netty.util.Recycler.access$900()
                r2.reclaimSpace(r4)
                io.netty.util.Recycler$WeakOrderQueue$Head r2 = r10.head
                io.netty.util.Recycler$WeakOrderQueue$Link r4 = r0.next
                r2.link = r4
            La1:
                io.netty.util.Recycler.WeakOrderQueue.Link.access$1302(r0, r3)
                int r0 = io.netty.util.Recycler.Stack.access$800(r11)
                if (r0 != r5) goto Lab
                return r1
            Lab:
                io.netty.util.Recycler.Stack.access$802(r11, r5)
                r11 = 1
                return r11
            Lb0:
                return r1
        }
    }

    static {
            java.lang.Class<io.netty.util.Recycler> r0 = io.netty.util.Recycler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.Recycler.logger = r0
            io.netty.util.Recycler$1 r1 = new io.netty.util.Recycler$1
            r1.<init>()
            io.netty.util.Recycler.NOOP_HANDLE = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.<init>(r2)
            io.netty.util.Recycler.ID_GENERATOR = r1
            int r1 = r1.getAndIncrement()
            io.netty.util.Recycler.OWN_THREAD_ID = r1
            java.lang.String r1 = "io.netty.recycler.maxCapacity"
            r2 = 4096(0x1000, float:5.74E-42)
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r2)
            java.lang.String r3 = "io.netty.recycler.maxCapacityPerThread"
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r3, r1)
            if (r1 >= 0) goto L2f
            goto L30
        L2f:
            r2 = r1
        L30:
            io.netty.util.Recycler.DEFAULT_MAX_CAPACITY_PER_THREAD = r2
            java.lang.String r1 = "io.netty.recycler.maxSharedCapacityFactor"
            r3 = 2
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r3)
            int r1 = java.lang.Math.max(r3, r1)
            io.netty.util.Recycler.MAX_SHARED_CAPACITY_FACTOR = r1
            int r4 = io.netty.util.NettyRuntime.availableProcessors()
            int r4 = r4 * 2
            java.lang.String r3 = "io.netty.recycler.maxDelayedQueuesPerThread"
            int r3 = io.netty.util.internal.SystemPropertyUtil.getInt(r3, r4)
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            io.netty.util.Recycler.MAX_DELAYED_QUEUES_PER_THREAD = r3
            java.lang.String r3 = "io.netty.recycler.linkCapacity"
            r4 = 16
            int r3 = io.netty.util.internal.SystemPropertyUtil.getInt(r3, r4)
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = io.netty.util.internal.MathUtil.safeFindNextPositivePowerOfTwo(r3)
            io.netty.util.Recycler.LINK_CAPACITY = r3
            java.lang.String r4 = "io.netty.recycler.ratio"
            r5 = 8
            int r4 = io.netty.util.internal.SystemPropertyUtil.getInt(r4, r5)
            int r4 = io.netty.util.internal.MathUtil.safeFindNextPositivePowerOfTwo(r4)
            io.netty.util.Recycler.RATIO = r4
            boolean r5 = r0.isDebugEnabled()
            if (r5 == 0) goto Lb3
            if (r2 != 0) goto L8f
            java.lang.String r1 = "-Dio.netty.recycler.maxCapacityPerThread: disabled"
            r0.debug(r1)
            java.lang.String r1 = "-Dio.netty.recycler.maxSharedCapacityFactor: disabled"
            r0.debug(r1)
            java.lang.String r1 = "-Dio.netty.recycler.linkCapacity: disabled"
            r0.debug(r1)
            java.lang.String r1 = "-Dio.netty.recycler.ratio: disabled"
            r0.debug(r1)
            goto Lb3
        L8f:
            java.lang.String r5 = "-Dio.netty.recycler.maxCapacityPerThread: {}"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r0.debug(r5, r6)
            java.lang.String r5 = "-Dio.netty.recycler.maxSharedCapacityFactor: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r5, r1)
            java.lang.String r1 = "-Dio.netty.recycler.linkCapacity: {}"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.debug(r1, r3)
            java.lang.String r1 = "-Dio.netty.recycler.ratio: {}"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.debug(r1, r3)
        Lb3:
            r0 = 256(0x100, float:3.59E-43)
            int r0 = java.lang.Math.min(r2, r0)
            io.netty.util.Recycler.INITIAL_CAPACITY = r0
            io.netty.util.Recycler$3 r0 = new io.netty.util.Recycler$3
            r0.<init>()
            io.netty.util.Recycler.DELAYED_RECYCLED = r0
            return
    }

    protected Recycler() {
            r1 = this;
            int r0 = io.netty.util.Recycler.DEFAULT_MAX_CAPACITY_PER_THREAD
            r1.<init>(r0)
            return
    }

    protected Recycler(int r2) {
            r1 = this;
            int r0 = io.netty.util.Recycler.MAX_SHARED_CAPACITY_FACTOR
            r1.<init>(r2, r0)
            return
    }

    protected Recycler(int r3, int r4) {
            r2 = this;
            int r0 = io.netty.util.Recycler.RATIO
            int r1 = io.netty.util.Recycler.MAX_DELAYED_QUEUES_PER_THREAD
            r2.<init>(r3, r4, r0, r1)
            return
    }

    protected Recycler(int r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            io.netty.util.Recycler$2 r0 = new io.netty.util.Recycler$2
            r0.<init>(r1)
            r1.threadLocal = r0
            int r4 = io.netty.util.internal.MathUtil.safeFindNextPositivePowerOfTwo(r4)
            r0 = 1
            int r4 = r4 - r0
            r1.ratioMask = r4
            r4 = 0
            if (r2 > 0) goto L1c
            r1.maxCapacityPerThread = r4
            r1.maxSharedCapacityFactor = r0
            r1.maxDelayedQueuesPerThread = r4
            return
        L1c:
            r1.maxCapacityPerThread = r2
            int r2 = java.lang.Math.max(r0, r3)
            r1.maxSharedCapacityFactor = r2
            int r2 = java.lang.Math.max(r4, r5)
            r1.maxDelayedQueuesPerThread = r2
            return
    }

    static /* synthetic */ int access$000(io.netty.util.Recycler r0) {
            int r0 = r0.maxCapacityPerThread
            return r0
    }

    static /* synthetic */ int access$100(io.netty.util.Recycler r0) {
            int r0 = r0.maxSharedCapacityFactor
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$1000() {
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.Recycler.ID_GENERATOR
            return r0
    }

    static /* synthetic */ int access$1500() {
            int r0 = io.netty.util.Recycler.INITIAL_CAPACITY
            return r0
    }

    static /* synthetic */ int access$1900() {
            int r0 = io.netty.util.Recycler.OWN_THREAD_ID
            return r0
    }

    static /* synthetic */ int access$200(io.netty.util.Recycler r0) {
            int r0 = r0.ratioMask
            return r0
    }

    static /* synthetic */ int access$300(io.netty.util.Recycler r0) {
            int r0 = r0.maxDelayedQueuesPerThread
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.FastThreadLocal access$400() {
            io.netty.util.concurrent.FastThreadLocal<java.util.Map<io.netty.util.Recycler$Stack<?>, io.netty.util.Recycler$WeakOrderQueue>> r0 = io.netty.util.Recycler.DELAYED_RECYCLED
            return r0
    }

    static /* synthetic */ int access$900() {
            int r0 = io.netty.util.Recycler.LINK_CAPACITY
            return r0
    }

    public final T get() {
            r2 = this;
            int r0 = r2.maxCapacityPerThread
            if (r0 != 0) goto Lb
            io.netty.util.Recycler$Handle r0 = io.netty.util.Recycler.NOOP_HANDLE
            java.lang.Object r0 = r2.newObject(r0)
            return r0
        Lb:
            io.netty.util.concurrent.FastThreadLocal<io.netty.util.Recycler$Stack<T>> r0 = r2.threadLocal
            java.lang.Object r0 = r0.get()
            io.netty.util.Recycler$Stack r0 = (io.netty.util.Recycler.Stack) r0
            io.netty.util.Recycler$DefaultHandle r1 = r0.pop()
            if (r1 != 0) goto L24
            io.netty.util.Recycler$DefaultHandle r1 = r0.newHandle()
            java.lang.Object r0 = r2.newObject(r1)
            io.netty.util.Recycler.DefaultHandle.access$502(r1, r0)
        L24:
            java.lang.Object r0 = io.netty.util.Recycler.DefaultHandle.access$500(r1)
            return r0
    }

    protected abstract T newObject(io.netty.util.Recycler.Handle<T> r1);

    @java.lang.Deprecated
    public final boolean recycle(T r3, io.netty.util.Recycler.Handle<T> r4) {
            r2 = this;
            io.netty.util.Recycler$Handle r0 = io.netty.util.Recycler.NOOP_HANDLE
            r1 = 0
            if (r4 != r0) goto L6
            return r1
        L6:
            io.netty.util.Recycler$DefaultHandle r4 = (io.netty.util.Recycler.DefaultHandle) r4
            io.netty.util.Recycler$Stack r0 = io.netty.util.Recycler.DefaultHandle.access$600(r4)
            io.netty.util.Recycler<T> r0 = r0.parent
            if (r0 == r2) goto L11
            return r1
        L11:
            r4.recycle(r3)
            r3 = 1
            return r3
    }

    final int threadLocalCapacity() {
            r1 = this;
            io.netty.util.concurrent.FastThreadLocal<io.netty.util.Recycler$Stack<T>> r0 = r1.threadLocal
            java.lang.Object r0 = r0.get()
            io.netty.util.Recycler$Stack r0 = (io.netty.util.Recycler.Stack) r0
            io.netty.util.Recycler$DefaultHandle[] r0 = io.netty.util.Recycler.Stack.access$700(r0)
            int r0 = r0.length
            return r0
    }

    final int threadLocalSize() {
            r1 = this;
            io.netty.util.concurrent.FastThreadLocal<io.netty.util.Recycler$Stack<T>> r0 = r1.threadLocal
            java.lang.Object r0 = r0.get()
            io.netty.util.Recycler$Stack r0 = (io.netty.util.Recycler.Stack) r0
            int r0 = io.netty.util.Recycler.Stack.access$800(r0)
            return r0
    }
}

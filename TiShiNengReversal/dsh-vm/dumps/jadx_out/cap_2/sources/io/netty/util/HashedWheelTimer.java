package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class HashedWheelTimer implements io.netty.util.Timer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.concurrent.atomic.AtomicInteger INSTANCE_COUNTER = null;
    private static final int INSTANCE_COUNT_LIMIT = 64;
    private static final long MILLISECOND_NANOS = 0;
    private static final java.util.concurrent.atomic.AtomicBoolean WARNED_TOO_MANY_INSTANCES = null;
    public static final int WORKER_STATE_INIT = 0;
    public static final int WORKER_STATE_SHUTDOWN = 2;
    public static final int WORKER_STATE_STARTED = 1;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer> WORKER_STATE_UPDATER = null;
    private static final io.netty.util.ResourceLeakDetector<io.netty.util.HashedWheelTimer> leakDetector = null;
    static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Queue<io.netty.util.HashedWheelTimer.HashedWheelTimeout> cancelledTimeouts;
    private final io.netty.util.ResourceLeakTracker<io.netty.util.HashedWheelTimer> leak;
    private final int mask;
    private final long maxPendingTimeouts;
    private final java.util.concurrent.atomic.AtomicLong pendingTimeouts;
    private volatile long startTime;
    private final java.util.concurrent.CountDownLatch startTimeInitialized;
    private final long tickDuration;
    private final java.util.Queue<io.netty.util.HashedWheelTimer.HashedWheelTimeout> timeouts;
    private final io.netty.util.HashedWheelTimer.HashedWheelBucket[] wheel;
    private final io.netty.util.HashedWheelTimer.Worker worker;
    private volatile int workerState;
    private final java.lang.Thread workerThread;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.util.HashedWheelTimer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HashedWheelBucket {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private io.netty.util.HashedWheelTimer.HashedWheelTimeout head;
        private io.netty.util.HashedWheelTimer.HashedWheelTimeout tail;

        static {
                return
        }

        private HashedWheelBucket() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ HashedWheelBucket(io.netty.util.HashedWheelTimer.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private io.netty.util.HashedWheelTimer.HashedWheelTimeout pollTimeout() {
                r3 = this;
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r3.head
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r2 = r0.next
                if (r2 != 0) goto Lf
                r3.head = r1
                r3.tail = r1
                goto L13
            Lf:
                r3.head = r2
                r2.prev = r1
            L13:
                r0.next = r1
                r0.prev = r1
                r0.bucket = r1
                return r0
        }

        public void addTimeout(io.netty.util.HashedWheelTimer.HashedWheelTimeout r2) {
                r1 = this;
                r2.bucket = r1
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r1.head
                if (r0 != 0) goto Lb
                r1.tail = r2
                r1.head = r2
                return
            Lb:
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r1.tail
                r0.next = r2
                r2.prev = r0
                r1.tail = r2
                return
        }

        public void clearTimeouts(java.util.Set<io.netty.util.Timeout> r3) {
                r2 = this;
            L0:
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r2.pollTimeout()
                if (r0 != 0) goto L7
                return
            L7:
                boolean r1 = r0.isExpired()
                if (r1 != 0) goto L0
                boolean r1 = r0.isCancelled()
                if (r1 == 0) goto L14
                goto L0
            L14:
                r3.add(r0)
                goto L0
        }

        public void expireTimeouts(long r8) {
                r7 = this;
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r7.head
            L2:
                if (r0 == 0) goto L53
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r0.next
                long r2 = r0.remainingRounds
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L40
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r7.remove(r0)
                long r2 = io.netty.util.HashedWheelTimer.HashedWheelTimeout.access$800(r0)
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 > 0) goto L1f
                r0.expire()
            L1d:
                r0 = r1
                goto L2
            L1f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                long r2 = io.netty.util.HashedWheelTimer.HashedWheelTimeout.access$800(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r9 = 2
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r2 = 0
                r9[r2] = r0
                r0 = 1
                r9[r0] = r8
                java.lang.String r8 = "timeout.deadline (%d) > deadline (%d)"
                java.lang.String r8 = java.lang.String.format(r8, r9)
                r1.<init>(r8)
                throw r1
            L40:
                boolean r2 = r0.isCancelled()
                if (r2 == 0) goto L4b
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r7.remove(r0)
                goto L2
            L4b:
                long r2 = r0.remainingRounds
                r4 = 1
                long r2 = r2 - r4
                r0.remainingRounds = r2
                goto L1d
            L53:
                return
        }

        public io.netty.util.HashedWheelTimer.HashedWheelTimeout remove(io.netty.util.HashedWheelTimer.HashedWheelTimeout r4) {
                r3 = this;
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = r4.next
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r4.prev
                if (r1 == 0) goto L8
                r1.next = r0
            L8:
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r2 = r4.next
                if (r2 == 0) goto Le
                r2.prev = r1
            Le:
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r3.head
                r2 = 0
                if (r4 != r1) goto L1f
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r3.tail
                if (r4 != r1) goto L1c
                r3.tail = r2
                r3.head = r2
                goto L27
            L1c:
                r3.head = r0
                goto L27
            L1f:
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r3.tail
                if (r4 != r1) goto L27
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = r4.prev
                r3.tail = r1
            L27:
                r4.prev = r2
                r4.next = r2
                r4.bucket = r2
                io.netty.util.HashedWheelTimer r4 = io.netty.util.HashedWheelTimer.HashedWheelTimeout.access$1200(r4)
                java.util.concurrent.atomic.AtomicLong r4 = io.netty.util.HashedWheelTimer.access$1100(r4)
                r4.decrementAndGet()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HashedWheelTimeout implements io.netty.util.Timeout {
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer.HashedWheelTimeout> STATE_UPDATER = null;
        private static final int ST_CANCELLED = 1;
        private static final int ST_EXPIRED = 2;
        private static final int ST_INIT = 0;
        io.netty.util.HashedWheelTimer.HashedWheelBucket bucket;
        private final long deadline;
        io.netty.util.HashedWheelTimer.HashedWheelTimeout next;
        io.netty.util.HashedWheelTimer.HashedWheelTimeout prev;
        long remainingRounds;
        private volatile int state;
        private final io.netty.util.TimerTask task;
        private final io.netty.util.HashedWheelTimer timer;

        static {
                java.lang.Class<io.netty.util.HashedWheelTimer$HashedWheelTimeout> r0 = io.netty.util.HashedWheelTimer.HashedWheelTimeout.class
                java.lang.String r1 = "state"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                io.netty.util.HashedWheelTimer.HashedWheelTimeout.STATE_UPDATER = r0
                return
        }

        HashedWheelTimeout(io.netty.util.HashedWheelTimer r2, io.netty.util.TimerTask r3, long r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.state = r0
                r1.timer = r2
                r1.task = r3
                r1.deadline = r4
                return
        }

        static /* synthetic */ io.netty.util.HashedWheelTimer access$1200(io.netty.util.HashedWheelTimer.HashedWheelTimeout r0) {
                io.netty.util.HashedWheelTimer r0 = r0.timer
                return r0
        }

        static /* synthetic */ long access$800(io.netty.util.HashedWheelTimer.HashedWheelTimeout r2) {
                long r0 = r2.deadline
                return r0
        }

        @Override // io.netty.util.Timeout
        public boolean cancel() {
                r3 = this;
                r0 = 0
                r1 = 1
                boolean r2 = r3.compareAndSetState(r0, r1)
                if (r2 != 0) goto L9
                return r0
            L9:
                io.netty.util.HashedWheelTimer r0 = r3.timer
                java.util.Queue r0 = io.netty.util.HashedWheelTimer.access$1000(r0)
                r0.add(r3)
                return r1
        }

        public boolean compareAndSetState(int r2, int r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer$HashedWheelTimeout> r0 = io.netty.util.HashedWheelTimer.HashedWheelTimeout.STATE_UPDATER
                boolean r2 = r0.compareAndSet(r1, r2, r3)
                return r2
        }

        public void expire() {
                r4 = this;
                r0 = 0
                r1 = 2
                boolean r0 = r4.compareAndSetState(r0, r1)
                if (r0 != 0) goto L9
                goto L37
            L9:
                io.netty.util.TimerTask r0 = r4.task     // Catch: java.lang.Throwable -> Lf
                r0.run(r4)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r0 = move-exception
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.HashedWheelTimer.logger
                boolean r2 = r1.isWarnEnabled()
                if (r2 == 0) goto L37
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "An exception was thrown by "
                r2.append(r3)
                java.lang.Class<io.netty.util.TimerTask> r3 = io.netty.util.TimerTask.class
                java.lang.String r3 = r3.getSimpleName()
                r2.append(r3)
                r3 = 46
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.warn(r2, r0)
            L37:
                return
        }

        @Override // io.netty.util.Timeout
        public boolean isCancelled() {
                r2 = this;
                int r0 = r2.state()
                r1 = 1
                if (r0 != r1) goto L8
                return r1
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.util.Timeout
        public boolean isExpired() {
                r2 = this;
                int r0 = r2.state()
                r1 = 2
                if (r0 != r1) goto L9
                r0 = 1
                return r0
            L9:
                r0 = 0
                return r0
        }

        void remove() {
                r1 = this;
                io.netty.util.HashedWheelTimer$HashedWheelBucket r0 = r1.bucket
                if (r0 == 0) goto L8
                r0.remove(r1)
                return
            L8:
                io.netty.util.HashedWheelTimer r0 = r1.timer
                java.util.concurrent.atomic.AtomicLong r0 = io.netty.util.HashedWheelTimer.access$1100(r0)
                r0.decrementAndGet()
                return
        }

        public int state() {
                r1 = this;
                int r0 = r1.state
                return r0
        }

        @Override // io.netty.util.Timeout
        public io.netty.util.TimerTask task() {
                r1 = this;
                io.netty.util.TimerTask r0 = r1.task
                return r0
        }

        @Override // io.netty.util.Timeout
        public io.netty.util.Timer timer() {
                r1 = this;
                io.netty.util.HashedWheelTimer r0 = r1.timer
                return r0
        }

        public java.lang.String toString() {
                r6 = this;
                long r0 = java.lang.System.nanoTime()
                long r2 = r6.deadline
                long r2 = r2 - r0
                io.netty.util.HashedWheelTimer r0 = r6.timer
                long r0 = io.netty.util.HashedWheelTimer.access$200(r0)
                long r2 = r2 + r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 192(0xc0, float:2.69E-43)
                r0.<init>(r1)
                java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r6)
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                java.lang.String r1 = "deadline: "
                r0.append(r1)
                r4 = 0
                int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r1 <= 0) goto L35
                r0.append(r2)
                java.lang.String r1 = " ns later"
                r0.append(r1)
                goto L46
            L35:
                if (r1 >= 0) goto L41
                long r1 = -r2
                r0.append(r1)
                java.lang.String r1 = " ns ago"
                r0.append(r1)
                goto L46
            L41:
                java.lang.String r1 = "now"
                r0.append(r1)
            L46:
                boolean r1 = r6.isCancelled()
                if (r1 == 0) goto L51
                java.lang.String r1 = ", cancelled"
                r0.append(r1)
            L51:
                java.lang.String r1 = ", task: "
                r0.append(r1)
                io.netty.util.TimerTask r1 = r6.task()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Worker implements java.lang.Runnable {
        final /* synthetic */ io.netty.util.HashedWheelTimer this$0;
        private long tick;
        private final java.util.Set<io.netty.util.Timeout> unprocessedTimeouts;

        private Worker(io.netty.util.HashedWheelTimer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.unprocessedTimeouts = r1
                return
        }

        /* synthetic */ Worker(io.netty.util.HashedWheelTimer r1, io.netty.util.HashedWheelTimer.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void processCancelledTasks() {
                r3 = this;
            L0:
                io.netty.util.HashedWheelTimer r0 = r3.this$0
                java.util.Queue r0 = io.netty.util.HashedWheelTimer.access$1000(r0)
                java.lang.Object r0 = r0.poll()
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = (io.netty.util.HashedWheelTimer.HashedWheelTimeout) r0
                if (r0 != 0) goto Lf
                return
            Lf:
                r0.remove()     // Catch: java.lang.Throwable -> L13
                goto L0
            L13:
                r0 = move-exception
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.HashedWheelTimer.logger
                boolean r1 = r1.isWarnEnabled()
                if (r1 == 0) goto L0
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.HashedWheelTimer.logger
                java.lang.String r2 = "An exception was thrown while process a cancellation task"
                r1.warn(r2, r0)
                goto L0
        }

        private void transferTimeoutsToBuckets() {
                r8 = this;
                r0 = 0
            L1:
                r1 = 100000(0x186a0, float:1.4013E-40)
                if (r0 >= r1) goto L54
                io.netty.util.HashedWheelTimer r1 = r8.this$0
                java.util.Queue r1 = io.netty.util.HashedWheelTimer.access$700(r1)
                java.lang.Object r1 = r1.poll()
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r1 = (io.netty.util.HashedWheelTimer.HashedWheelTimeout) r1
                if (r1 != 0) goto L15
                goto L54
            L15:
                int r2 = r1.state()
                r3 = 1
                if (r2 != r3) goto L1d
                goto L51
            L1d:
                long r2 = io.netty.util.HashedWheelTimer.HashedWheelTimeout.access$800(r1)
                io.netty.util.HashedWheelTimer r4 = r8.this$0
                long r4 = io.netty.util.HashedWheelTimer.access$900(r4)
                long r2 = r2 / r4
                long r4 = r8.tick
                long r4 = r2 - r4
                io.netty.util.HashedWheelTimer r6 = r8.this$0
                io.netty.util.HashedWheelTimer$HashedWheelBucket[] r6 = io.netty.util.HashedWheelTimer.access$500(r6)
                int r6 = r6.length
                long r6 = (long) r6
                long r4 = r4 / r6
                r1.remainingRounds = r4
                long r4 = r8.tick
                long r2 = java.lang.Math.max(r2, r4)
                io.netty.util.HashedWheelTimer r4 = r8.this$0
                int r4 = io.netty.util.HashedWheelTimer.access$400(r4)
                long r4 = (long) r4
                long r2 = r2 & r4
                int r3 = (int) r2
                io.netty.util.HashedWheelTimer r2 = r8.this$0
                io.netty.util.HashedWheelTimer$HashedWheelBucket[] r2 = io.netty.util.HashedWheelTimer.access$500(r2)
                r2 = r2[r3]
                r2.addTimeout(r1)
            L51:
                int r0 = r0 + 1
                goto L1
            L54:
                return
        }

        private long waitForNextTick() {
                r11 = this;
                io.netty.util.HashedWheelTimer r0 = r11.this$0
                long r0 = io.netty.util.HashedWheelTimer.access$900(r0)
                long r2 = r11.tick
                r4 = 1
                long r2 = r2 + r4
                long r0 = r0 * r2
            Ld:
                long r2 = java.lang.System.nanoTime()
                io.netty.util.HashedWheelTimer r4 = r11.this$0
                long r4 = io.netty.util.HashedWheelTimer.access$200(r4)
                long r2 = r2 - r4
                long r4 = r0 - r2
                r6 = 999999(0xf423f, double:4.94065E-318)
                long r4 = r4 + r6
                r6 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r4 / r6
                r6 = 0
                r8 = -9223372036854775808
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 > 0) goto L35
                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r0 != 0) goto L34
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r0
            L34:
                return r2
            L35:
                boolean r2 = io.netty.util.internal.PlatformDependent.isWindows()
                if (r2 == 0) goto L40
                r2 = 10
                long r4 = r4 / r2
                long r4 = r4 * r2
            L40:
                java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L44
                goto Ld
            L44:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = io.netty.util.HashedWheelTimer.access$600()
                io.netty.util.HashedWheelTimer r3 = r11.this$0
                int r2 = r2.get(r3)
                r3 = 2
                if (r2 != r3) goto Ld
                return r8
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                io.netty.util.HashedWheelTimer r0 = r10.this$0
                long r1 = java.lang.System.nanoTime()
                io.netty.util.HashedWheelTimer.access$202(r0, r1)
                io.netty.util.HashedWheelTimer r0 = r10.this$0
                long r0 = io.netty.util.HashedWheelTimer.access$200(r0)
                r2 = 1
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto L1c
                io.netty.util.HashedWheelTimer r0 = r10.this$0
                io.netty.util.HashedWheelTimer.access$202(r0, r2)
            L1c:
                io.netty.util.HashedWheelTimer r0 = r10.this$0
                java.util.concurrent.CountDownLatch r0 = io.netty.util.HashedWheelTimer.access$300(r0)
                r0.countDown()
            L25:
                long r0 = r10.waitForNextTick()
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto L4e
                long r6 = r10.tick
                io.netty.util.HashedWheelTimer r8 = r10.this$0
                int r8 = io.netty.util.HashedWheelTimer.access$400(r8)
                long r8 = (long) r8
                long r6 = r6 & r8
                int r7 = (int) r6
                r10.processCancelledTasks()
                io.netty.util.HashedWheelTimer r6 = r10.this$0
                io.netty.util.HashedWheelTimer$HashedWheelBucket[] r6 = io.netty.util.HashedWheelTimer.access$500(r6)
                r6 = r6[r7]
                r10.transferTimeoutsToBuckets()
                r6.expireTimeouts(r0)
                long r0 = r10.tick
                long r0 = r0 + r2
                r10.tick = r0
            L4e:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = io.netty.util.HashedWheelTimer.access$600()
                io.netty.util.HashedWheelTimer r1 = r10.this$0
                int r0 = r0.get(r1)
                r1 = 1
                if (r0 == r1) goto L25
                io.netty.util.HashedWheelTimer r0 = r10.this$0
                io.netty.util.HashedWheelTimer$HashedWheelBucket[] r0 = io.netty.util.HashedWheelTimer.access$500(r0)
                int r1 = r0.length
                r2 = 0
            L63:
                if (r2 >= r1) goto L6f
                r3 = r0[r2]
                java.util.Set<io.netty.util.Timeout> r4 = r10.unprocessedTimeouts
                r3.clearTimeouts(r4)
                int r2 = r2 + 1
                goto L63
            L6f:
                io.netty.util.HashedWheelTimer r0 = r10.this$0
                java.util.Queue r0 = io.netty.util.HashedWheelTimer.access$700(r0)
                java.lang.Object r0 = r0.poll()
                io.netty.util.HashedWheelTimer$HashedWheelTimeout r0 = (io.netty.util.HashedWheelTimer.HashedWheelTimeout) r0
                if (r0 != 0) goto L81
                r10.processCancelledTasks()
                return
            L81:
                boolean r1 = r0.isCancelled()
                if (r1 != 0) goto L6f
                java.util.Set<io.netty.util.Timeout> r1 = r10.unprocessedTimeouts
                r1.add(r0)
                goto L6f
        }

        public java.util.Set<io.netty.util.Timeout> unprocessedTimeouts() {
                r1 = this;
                java.util.Set<io.netty.util.Timeout> r0 = r1.unprocessedTimeouts
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.util.HashedWheelTimer> r0 = io.netty.util.HashedWheelTimer.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.HashedWheelTimer.logger = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            io.netty.util.HashedWheelTimer.INSTANCE_COUNTER = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            io.netty.util.HashedWheelTimer.WARNED_TOO_MANY_INSTANCES = r1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 1
            long r1 = r1.toNanos(r2)
            io.netty.util.HashedWheelTimer.MILLISECOND_NANOS = r1
            io.netty.util.ResourceLeakDetectorFactory r1 = io.netty.util.ResourceLeakDetectorFactory.instance()
            r2 = 1
            io.netty.util.ResourceLeakDetector r1 = r1.newResourceLeakDetector(r0, r2)
            io.netty.util.HashedWheelTimer.leakDetector = r1
            java.lang.String r1 = "workerState"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.util.HashedWheelTimer.WORKER_STATE_UPDATER = r0
            return
    }

    public HashedWheelTimer() {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.<init>(r0)
            return
    }

    public HashedWheelTimer(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.<init>(r0, r2, r4)
            return
    }

    public HashedWheelTimer(long r7, java.util.concurrent.TimeUnit r9, int r10) {
            r6 = this;
            java.util.concurrent.ThreadFactory r1 = java.util.concurrent.Executors.defaultThreadFactory()
            r0 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public HashedWheelTimer(java.util.concurrent.ThreadFactory r4) {
            r3 = this;
            r0 = 100
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r0, r2)
            return
    }

    public HashedWheelTimer(java.util.concurrent.ThreadFactory r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            r5 = 512(0x200, float:7.17E-43)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public HashedWheelTimer(java.util.concurrent.ThreadFactory r8, long r9, java.util.concurrent.TimeUnit r11, int r12) {
            r7 = this;
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            return
    }

    public HashedWheelTimer(java.util.concurrent.ThreadFactory r10, long r11, java.util.concurrent.TimeUnit r13, int r14, boolean r15) {
            r9 = this;
            r7 = -1
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
    }

    public HashedWheelTimer(java.util.concurrent.ThreadFactory r17, long r18, java.util.concurrent.TimeUnit r20, int r21, boolean r22, long r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r21
            r0.<init>()
            io.netty.util.HashedWheelTimer$Worker r6 = new io.netty.util.HashedWheelTimer$Worker
            r7 = 0
            r6.<init>(r0, r7)
            r0.worker = r6
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch
            r9 = 1
            r8.<init>(r9)
            r0.startTimeInitialized = r8
            java.util.Queue r8 = io.netty.util.internal.PlatformDependent.newMpscQueue()
            r0.timeouts = r8
            java.util.Queue r8 = io.netty.util.internal.PlatformDependent.newMpscQueue()
            r0.cancelledTimeouts = r8
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong
            r10 = 0
            r8.<init>(r10)
            r0.pendingTimeouts = r8
            if (r1 == 0) goto Lfc
            if (r4 == 0) goto Lf4
            int r8 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r8 <= 0) goto Ldd
            if (r5 <= 0) goto Lc6
            io.netty.util.HashedWheelTimer$HashedWheelBucket[] r5 = createWheel(r5)
            r0.wheel = r5
            int r8 = r5.length
            int r8 = r8 - r9
            r0.mask = r8
            long r10 = r4.toNanos(r2)
            int r4 = r5.length
            long r12 = (long) r4
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r12 = r14 / r12
            r4 = 0
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto La8
            long r12 = io.netty.util.HashedWheelTimer.MILLISECOND_NANOS
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 >= 0) goto L76
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.HashedWheelTimer.logger
            boolean r8 = r5.isWarnEnabled()
            if (r8 == 0) goto L73
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            java.lang.String r8 = "Configured tickDuration %d smaller then %d, using 1ms."
            r5.warn(r8, r2, r3)
        L73:
            r0.tickDuration = r12
            goto L78
        L76:
            r0.tickDuration = r10
        L78:
            java.lang.Thread r1 = r1.newThread(r6)
            r0.workerThread = r1
            if (r22 != 0) goto L86
            boolean r1 = r1.isDaemon()
            if (r1 != 0) goto L8c
        L86:
            io.netty.util.ResourceLeakDetector<io.netty.util.HashedWheelTimer> r1 = io.netty.util.HashedWheelTimer.leakDetector
            io.netty.util.ResourceLeakTracker r7 = r1.track(r0)
        L8c:
            r0.leak = r7
            r1 = r23
            r0.maxPendingTimeouts = r1
            java.util.concurrent.atomic.AtomicInteger r1 = io.netty.util.HashedWheelTimer.INSTANCE_COUNTER
            int r1 = r1.incrementAndGet()
            r2 = 64
            if (r1 <= r2) goto La7
            java.util.concurrent.atomic.AtomicBoolean r1 = io.netty.util.HashedWheelTimer.WARNED_TOO_MANY_INSTANCES
            boolean r1 = r1.compareAndSet(r4, r9)
            if (r1 == 0) goto La7
            reportTooManyInstances()
        La7:
            return
        La8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            int r3 = r5.length
            long r5 = (long) r3
            long r14 = r14 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r2
            r5[r9] = r3
            java.lang.String r2 = "tickDuration: %d (expected: 0 < tickDuration in nanos < %d"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r1.<init>(r2)
            throw r1
        Lc6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ticksPerWheel must be greater than 0: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Ldd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tickDuration must be greater than 0: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        Lf4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "unit"
            r1.<init>(r2)
            throw r1
        Lfc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "threadFactory"
            r1.<init>(r2)
            throw r1
    }

    static /* synthetic */ java.util.Queue access$1000(io.netty.util.HashedWheelTimer r0) {
            java.util.Queue<io.netty.util.HashedWheelTimer$HashedWheelTimeout> r0 = r0.cancelledTimeouts
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong access$1100(io.netty.util.HashedWheelTimer r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.pendingTimeouts
            return r0
    }

    static /* synthetic */ long access$200(io.netty.util.HashedWheelTimer r2) {
            long r0 = r2.startTime
            return r0
    }

    static /* synthetic */ long access$202(io.netty.util.HashedWheelTimer r0, long r1) {
            r0.startTime = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch access$300(io.netty.util.HashedWheelTimer r0) {
            java.util.concurrent.CountDownLatch r0 = r0.startTimeInitialized
            return r0
    }

    static /* synthetic */ int access$400(io.netty.util.HashedWheelTimer r0) {
            int r0 = r0.mask
            return r0
    }

    static /* synthetic */ io.netty.util.HashedWheelTimer.HashedWheelBucket[] access$500(io.netty.util.HashedWheelTimer r0) {
            io.netty.util.HashedWheelTimer$HashedWheelBucket[] r0 = r0.wheel
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$600() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer> r0 = io.netty.util.HashedWheelTimer.WORKER_STATE_UPDATER
            return r0
    }

    static /* synthetic */ java.util.Queue access$700(io.netty.util.HashedWheelTimer r0) {
            java.util.Queue<io.netty.util.HashedWheelTimer$HashedWheelTimeout> r0 = r0.timeouts
            return r0
    }

    static /* synthetic */ long access$900(io.netty.util.HashedWheelTimer r2) {
            long r0 = r2.tickDuration
            return r0
    }

    private static io.netty.util.HashedWheelTimer.HashedWheelBucket[] createWheel(int r4) {
            if (r4 <= 0) goto L32
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 > r0) goto L1b
            int r4 = normalizeTicksPerWheel(r4)
            io.netty.util.HashedWheelTimer$HashedWheelBucket[] r0 = new io.netty.util.HashedWheelTimer.HashedWheelBucket[r4]
            r1 = 0
        Ld:
            if (r1 >= r4) goto L1a
            io.netty.util.HashedWheelTimer$HashedWheelBucket r2 = new io.netty.util.HashedWheelTimer$HashedWheelBucket
            r3 = 0
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L1a:
            return r0
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ticksPerWheel may not be greater than 2^30: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ticksPerWheel must be greater than 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static int normalizeTicksPerWheel(int r1) {
            r0 = 1
        L1:
            if (r0 >= r1) goto L6
            int r0 = r0 << 1
            goto L1
        L6:
            return r0
    }

    private static void reportTooManyInstances() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.HashedWheelTimer.logger
            boolean r1 = r0.isErrorEnabled()
            if (r1 == 0) goto L2f
            java.lang.Class<io.netty.util.HashedWheelTimer> r1 = io.netty.util.HashedWheelTimer.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "You are creating too many "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " instances. "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " is a shared resource that must be reused across the JVM,so that only a few instances are created."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.error(r1)
        L2f:
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r3 = this;
            r0 = 2
            super.finalize()     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer> r1 = io.netty.util.HashedWheelTimer.WORKER_STATE_UPDATER
            int r1 = r1.getAndSet(r3, r0)
            if (r1 == r0) goto L11
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.HashedWheelTimer.INSTANCE_COUNTER
            r0.decrementAndGet()
        L11:
            return
        L12:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer> r2 = io.netty.util.HashedWheelTimer.WORKER_STATE_UPDATER
            int r2 = r2.getAndSet(r3, r0)
            if (r2 == r0) goto L20
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.HashedWheelTimer.INSTANCE_COUNTER
            r0.decrementAndGet()
        L20:
            throw r1
    }

    @Override // io.netty.util.Timer
    public io.netty.util.Timeout newTimeout(io.netty.util.TimerTask r8, long r9, java.util.concurrent.TimeUnit r11) {
            r7 = this;
            if (r8 == 0) goto L71
            if (r11 == 0) goto L69
            java.util.concurrent.atomic.AtomicLong r0 = r7.pendingTimeouts
            long r0 = r0.incrementAndGet()
            long r2 = r7.maxPendingTimeouts
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L42
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L17
            goto L42
        L17:
            java.util.concurrent.atomic.AtomicLong r8 = r7.pendingTimeouts
            r8.decrementAndGet()
            java.util.concurrent.RejectedExecutionException r8 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Number of pending timeouts ("
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = ") is greater than or equal to maximum allowed pending timeouts ("
            r9.append(r10)
            long r10 = r7.maxPendingTimeouts
            r9.append(r10)
            java.lang.String r10 = ")"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L42:
            r7.start()
            long r0 = java.lang.System.nanoTime()
            long r2 = r11.toNanos(r9)
            long r0 = r0 + r2
            long r2 = r7.startTime
            long r0 = r0 - r2
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto L5e
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 >= 0) goto L5e
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L5e:
            io.netty.util.HashedWheelTimer$HashedWheelTimeout r9 = new io.netty.util.HashedWheelTimer$HashedWheelTimeout
            r9.<init>(r7, r8, r0)
            java.util.Queue<io.netty.util.HashedWheelTimer$HashedWheelTimeout> r8 = r7.timeouts
            r8.add(r9)
            return r9
        L69:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "unit"
            r8.<init>(r9)
            throw r8
        L71:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "task"
            r8.<init>(r9)
            throw r8
    }

    public long pendingTimeouts() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.pendingTimeouts
            long r0 = r0.get()
            return r0
    }

    public void start() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer> r0 = io.netty.util.HashedWheelTimer.WORKER_STATE_UPDATER
            int r1 = r0.get(r5)
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L2a
            r0 = 2
            if (r1 == r0) goto L16
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Invalid WorkerState"
            r0.<init>(r1)
            throw r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot be started once stopped"
            r0.<init>(r1)
            throw r0
        L1e:
            r1 = 0
            boolean r0 = r0.compareAndSet(r5, r1, r2)
            if (r0 == 0) goto L2a
            java.lang.Thread r0 = r5.workerThread
            r0.start()
        L2a:
            long r0 = r5.startTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3a
            java.util.concurrent.CountDownLatch r0 = r5.startTimeInitialized     // Catch: java.lang.InterruptedException -> L38
            r0.await()     // Catch: java.lang.InterruptedException -> L38
            goto L2a
        L38:
            goto L2a
        L3a:
            return
    }

    @Override // io.netty.util.Timer
    public java.util.Set<io.netty.util.Timeout> stop() {
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r5.workerThread
            if (r0 == r1) goto L6a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.HashedWheelTimer> r0 = io.netty.util.HashedWheelTimer.WORKER_STATE_UPDATER
            r1 = 1
            r2 = 2
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 != 0) goto L27
            int r0 = r0.getAndSet(r5, r2)
            if (r0 == r2) goto L24
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.HashedWheelTimer.INSTANCE_COUNTER
            r0.decrementAndGet()
            io.netty.util.ResourceLeakTracker<io.netty.util.HashedWheelTimer> r0 = r5.leak
            if (r0 == 0) goto L24
            r0.close(r5)
        L24:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L27:
            r0 = 0
        L28:
            java.lang.Thread r2 = r5.workerThread     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.isAlive()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L41
            java.lang.Thread r2 = r5.workerThread     // Catch: java.lang.Throwable -> L3d
            r2.interrupt()     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r2 = r5.workerThread     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            r3 = 100
            r2.join(r3)     // Catch: java.lang.Throwable -> L3d java.lang.InterruptedException -> L3f
            goto L28
        L3d:
            r0 = move-exception
            goto L5d
        L3f:
            r0 = 1
            goto L28
        L41:
            if (r0 == 0) goto L4a
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3d
            r0.interrupt()     // Catch: java.lang.Throwable -> L3d
        L4a:
            java.util.concurrent.atomic.AtomicInteger r0 = io.netty.util.HashedWheelTimer.INSTANCE_COUNTER
            r0.decrementAndGet()
            io.netty.util.ResourceLeakTracker<io.netty.util.HashedWheelTimer> r0 = r5.leak
            if (r0 == 0) goto L56
            r0.close(r5)
        L56:
            io.netty.util.HashedWheelTimer$Worker r0 = r5.worker
            java.util.Set r0 = r0.unprocessedTimeouts()
            return r0
        L5d:
            java.util.concurrent.atomic.AtomicInteger r1 = io.netty.util.HashedWheelTimer.INSTANCE_COUNTER
            r1.decrementAndGet()
            io.netty.util.ResourceLeakTracker<io.netty.util.HashedWheelTimer> r1 = r5.leak
            if (r1 == 0) goto L69
            r1.close(r5)
        L69:
            throw r0
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.netty.util.HashedWheelTimer> r2 = io.netty.util.HashedWheelTimer.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ".stop() cannot be called from "
            r1.append(r2)
            java.lang.Class<io.netty.util.TimerTask> r2 = io.netty.util.TimerTask.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}

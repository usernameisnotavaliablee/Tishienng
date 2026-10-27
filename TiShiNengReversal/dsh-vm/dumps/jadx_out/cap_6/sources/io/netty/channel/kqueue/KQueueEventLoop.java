package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class KQueueEventLoop extends io.netty.channel.SingleThreadEventLoop {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int KQUEUE_WAKE_UP_IDENT = 0;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.kqueue.KQueueEventLoop> WAKEN_UP_UPDATER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean allowGrowing;
    private final io.netty.channel.kqueue.KQueueEventArray changeList;
    private final io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> channels;
    private final io.netty.channel.kqueue.KQueueEventArray eventList;
    private volatile int ioRatio;
    private final io.netty.channel.unix.IovArray iovArray;
    private final io.netty.channel.unix.FileDescriptor kqueueFd;
    private final io.netty.util.IntSupplier selectNowSupplier;
    private final io.netty.channel.SelectStrategy selectStrategy;
    private volatile int wakenUp;


    static {
            java.lang.Class<io.netty.channel.kqueue.KQueueEventLoop> r0 = io.netty.channel.kqueue.KQueueEventLoop.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.kqueue.KQueueEventLoop.logger = r1
            java.lang.String r1 = "wakenUp"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.channel.kqueue.KQueueEventLoop.WAKEN_UP_UPDATER = r0
            io.netty.channel.kqueue.KQueue.ensureAvailability()
            return
    }

    KQueueEventLoop(io.netty.channel.EventLoopGroup r8, java.util.concurrent.Executor r9, int r10, io.netty.channel.SelectStrategy r11, io.netty.util.concurrent.RejectedExecutionHandler r12, io.netty.channel.EventLoopTaskQueueFactory r13) {
            r7 = this;
            java.util.Queue r4 = newTaskQueue(r13)
            java.util.Queue r5 = newTaskQueue(r13)
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            io.netty.channel.unix.IovArray r8 = new io.netty.channel.unix.IovArray
            r8.<init>()
            r0.iovArray = r8
            io.netty.channel.kqueue.KQueueEventLoop$1 r8 = new io.netty.channel.kqueue.KQueueEventLoop$1
            r8.<init>(r7)
            r0.selectNowSupplier = r8
            io.netty.util.collection.IntObjectHashMap r8 = new io.netty.util.collection.IntObjectHashMap
            r9 = 4096(0x1000, float:5.74E-42)
            r8.<init>(r9)
            r0.channels = r8
            r8 = 50
            r0.ioRatio = r8
            java.lang.String r8 = "strategy"
            java.lang.Object r8 = io.netty.util.internal.ObjectUtil.checkNotNull(r11, r8)
            io.netty.channel.SelectStrategy r8 = (io.netty.channel.SelectStrategy) r8
            r0.selectStrategy = r8
            io.netty.channel.unix.FileDescriptor r8 = io.netty.channel.kqueue.Native.newKQueue()
            r0.kqueueFd = r8
            r11 = 0
            if (r10 != 0) goto L44
            r10 = 1
            r0.allowGrowing = r10
            r10 = 4096(0x1000, float:5.74E-42)
            goto L46
        L44:
            r0.allowGrowing = r11
        L46:
            io.netty.channel.kqueue.KQueueEventArray r9 = new io.netty.channel.kqueue.KQueueEventArray
            r9.<init>(r10)
            r0.changeList = r9
            io.netty.channel.kqueue.KQueueEventArray r9 = new io.netty.channel.kqueue.KQueueEventArray
            r9.<init>(r10)
            r0.eventList = r9
            int r8 = r8.intValue()
            int r8 = io.netty.channel.kqueue.Native.keventAddUserEvent(r8, r11)
            if (r8 < 0) goto L5f
            return
        L5f:
            r7.cleanup()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "kevent failed to add user event with errno: "
            r10.append(r11)
            int r8 = -r8
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
    }

    static /* synthetic */ int access$000(io.netty.channel.kqueue.KQueueEventLoop r0) throws java.io.IOException {
            int r0 = r0.kqueueWaitNow()
            return r0
    }

    private void closeAll() {
            r5 = this;
            r5.kqueueWaitNow()     // Catch: java.io.IOException -> L3
        L3:
            io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> r0 = r5.channels
            java.util.Collection r0 = r0.values()
            r1 = 0
            io.netty.channel.kqueue.AbstractKQueueChannel[] r2 = new io.netty.channel.kqueue.AbstractKQueueChannel[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            io.netty.channel.kqueue.AbstractKQueueChannel[] r0 = (io.netty.channel.kqueue.AbstractKQueueChannel[]) r0
            int r2 = r0.length
        L13:
            if (r1 >= r2) goto L29
            r3 = r0[r1]
            io.netty.channel.Channel$Unsafe r4 = r3.unsafe()
            io.netty.channel.Channel$Unsafe r3 = r3.unsafe()
            io.netty.channel.ChannelPromise r3 = r3.voidPromise()
            r4.close(r3)
            int r1 = r1 + 1
            goto L13
        L29:
            return
    }

    private static void handleLoopException(java.lang.Throwable r2) {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.kqueue.KQueueEventLoop.logger
            java.lang.String r1 = "Unexpected exception in the selector loop."
            r0.warn(r1, r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            return
    }

    private int kqueueWait(int r4, int r5) throws java.io.IOException {
            r3 = this;
            io.netty.channel.unix.FileDescriptor r0 = r3.kqueueFd
            int r0 = r0.intValue()
            io.netty.channel.kqueue.KQueueEventArray r1 = r3.changeList
            io.netty.channel.kqueue.KQueueEventArray r2 = r3.eventList
            int r4 = io.netty.channel.kqueue.Native.keventWait(r0, r1, r2, r4, r5)
            io.netty.channel.kqueue.KQueueEventArray r5 = r3.changeList
            r5.clear()
            return r4
    }

    private int kqueueWait(boolean r9) throws java.io.IOException {
            r8 = this;
            if (r9 == 0) goto Ld
            boolean r9 = r8.hasTasks()
            if (r9 == 0) goto Ld
            int r9 = r8.kqueueWaitNow()
            return r9
        Ld:
            long r0 = java.lang.System.nanoTime()
            long r0 = r8.delayNanos(r0)
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r4 = r0 / r2
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r4, r6)
            int r9 = (int) r4
            long r4 = (long) r9
            long r4 = r4 * r2
            long r0 = r0 - r4
            long r0 = java.lang.Math.min(r0, r6)
            int r1 = (int) r0
            int r9 = r8.kqueueWait(r9, r1)
            return r9
    }

    private int kqueueWaitNow() throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r0 = r1.kqueueWait(r0, r0)
            return r0
    }

    private static java.util.Queue<java.lang.Runnable> newTaskQueue(io.netty.channel.EventLoopTaskQueueFactory r1) {
            if (r1 != 0) goto L9
            int r1 = io.netty.channel.SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS
            java.util.Queue r1 = newTaskQueue0(r1)
            return r1
        L9:
            int r0 = io.netty.channel.SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS
            java.util.Queue r1 = r1.newTaskQueue(r0)
            return r1
    }

    private static java.util.Queue<java.lang.Runnable> newTaskQueue0(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto La
            java.util.Queue r1 = io.netty.util.internal.PlatformDependent.newMpscQueue()
            return r1
        La:
            java.util.Queue r1 = io.netty.util.internal.PlatformDependent.newMpscQueue(r1)
            return r1
    }

    private void processReady(int r8) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r8) goto L89
            io.netty.channel.kqueue.KQueueEventArray r2 = r7.eventList
            short r2 = r2.filter(r1)
            io.netty.channel.kqueue.KQueueEventArray r3 = r7.eventList
            short r3 = r3.flags(r1)
            io.netty.channel.kqueue.KQueueEventArray r4 = r7.eventList
            int r4 = r4.fd(r1)
            short r5 = io.netty.channel.kqueue.Native.EVFILT_USER
            if (r2 == r5) goto L85
            short r5 = io.netty.channel.kqueue.Native.EV_ERROR
            r5 = r5 & r3
            if (r5 == 0) goto L20
            goto L85
        L20:
            io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> r5 = r7.channels
            java.lang.Object r4 = r5.get(r4)
            io.netty.channel.kqueue.AbstractKQueueChannel r4 = (io.netty.channel.kqueue.AbstractKQueueChannel) r4
            if (r4 != 0) goto L4f
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.channel.kqueue.KQueueEventLoop.logger
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            io.netty.channel.kqueue.KQueueEventArray r5 = r7.eventList
            int r5 = r5.fd(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r4
            r4 = 1
            r6[r4] = r5
            r4 = 2
            r6[r4] = r2
            java.lang.String r2 = "events[{}]=[{}, {}] had no channel!"
            r3.warn(r2, r6)
            goto L85
        L4f:
            io.netty.channel.Channel$Unsafe r4 = r4.unsafe()
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r4 = (io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe) r4
            short r5 = io.netty.channel.kqueue.Native.EVFILT_WRITE
            if (r2 != r5) goto L5d
            r4.writeReady()
            goto L7d
        L5d:
            short r5 = io.netty.channel.kqueue.Native.EVFILT_READ
            if (r2 != r5) goto L6b
            io.netty.channel.kqueue.KQueueEventArray r2 = r7.eventList
            long r5 = r2.data(r1)
            r4.readReady(r5)
            goto L7d
        L6b:
            short r5 = io.netty.channel.kqueue.Native.EVFILT_SOCK
            if (r2 != r5) goto L7d
            io.netty.channel.kqueue.KQueueEventArray r2 = r7.eventList
            short r2 = r2.fflags(r1)
            int r5 = io.netty.channel.kqueue.Native.NOTE_RDHUP
            r2 = r2 & r5
            if (r2 == 0) goto L7d
            r4.readEOF()
        L7d:
            short r2 = io.netty.channel.kqueue.Native.EV_EOF
            r2 = r2 & r3
            if (r2 == 0) goto L85
            r4.readEOF()
        L85:
            int r1 = r1 + 1
            goto L2
        L89:
            return
    }

    private void wakeup() {
            r2 = this;
            io.netty.channel.unix.FileDescriptor r0 = r2.kqueueFd
            int r0 = r0.intValue()
            r1 = 0
            io.netty.channel.kqueue.Native.keventTriggerUserEvent(r0, r1)
            return
    }

    void add(io.netty.channel.kqueue.AbstractKQueueChannel r3) {
            r2 = this;
            io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> r0 = r2.channels
            io.netty.channel.unix.FileDescriptor r1 = r3.fd()
            int r1 = r1.intValue()
            java.lang.Object r3 = r0.put(r1, r3)
            io.netty.channel.kqueue.AbstractKQueueChannel r3 = (io.netty.channel.kqueue.AbstractKQueueChannel) r3
            return
    }

    io.netty.channel.unix.IovArray cleanArray() {
            r1 = this;
            io.netty.channel.unix.IovArray r0 = r1.iovArray
            r0.clear()
            io.netty.channel.unix.IovArray r0 = r1.iovArray
            return r0
    }

    protected void cleanup() {
            r3 = this;
            io.netty.channel.unix.FileDescriptor r0 = r3.kqueueFd     // Catch: java.lang.Throwable -> L6 java.io.IOException -> L8
            r0.close()     // Catch: java.lang.Throwable -> L6 java.io.IOException -> L8
            goto L10
        L6:
            r0 = move-exception
            goto L1b
        L8:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.kqueue.KQueueEventLoop.logger     // Catch: java.lang.Throwable -> L6
            java.lang.String r2 = "Failed to close the kqueue fd."
            r1.warn(r2, r0)     // Catch: java.lang.Throwable -> L6
        L10:
            io.netty.channel.kqueue.KQueueEventArray r0 = r3.changeList
            r0.free()
            io.netty.channel.kqueue.KQueueEventArray r0 = r3.eventList
            r0.free()
            return
        L1b:
            io.netty.channel.kqueue.KQueueEventArray r1 = r3.changeList
            r1.free()
            io.netty.channel.kqueue.KQueueEventArray r1 = r3.eventList
            r1.free()
            throw r0
    }

    void evSet(io.netty.channel.kqueue.AbstractKQueueChannel r2, short r3, short r4, int r5) {
            r1 = this;
            io.netty.channel.kqueue.KQueueEventArray r0 = r1.changeList
            r0.evSet(r2, r3, r4, r5)
            return
    }

    public int getIoRatio() {
            r1 = this;
            int r0 = r1.ioRatio
            return r0
    }

    protected java.util.Queue<java.lang.Runnable> newTaskQueue(int r1) {
            r0 = this;
            java.util.Queue r1 = newTaskQueue0(r1)
            return r1
    }

    @Override // io.netty.channel.SingleThreadEventLoop
    public int registeredChannels() {
            r1 = this;
            io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> r0 = r1.channels
            int r0 = r0.size()
            return r0
    }

    void remove(io.netty.channel.kqueue.AbstractKQueueChannel r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.unix.FileDescriptor r0 = r3.fd()
            int r0 = r0.intValue()
            io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> r1 = r2.channels
            java.lang.Object r1 = r1.remove(r0)
            io.netty.channel.kqueue.AbstractKQueueChannel r1 = (io.netty.channel.kqueue.AbstractKQueueChannel) r1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L1a
            io.netty.util.collection.IntObjectMap<io.netty.channel.kqueue.AbstractKQueueChannel> r3 = r2.channels
            r3.put(r0, r1)
            return
        L1a:
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L23
            r3.unregisterFilters()
        L23:
            return
    }

    protected void run() {
            r7 = this;
        L0:
            io.netty.channel.SelectStrategy r0 = r7.selectStrategy     // Catch: java.lang.Throwable -> L2f
            io.netty.util.IntSupplier r1 = r7.selectNowSupplier     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r7.hasTasks()     // Catch: java.lang.Throwable -> L2f
            int r0 = r0.calculateStrategy(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r1 = -3
            r2 = 0
            if (r0 == r1) goto L17
            r1 = -2
            if (r0 == r1) goto L0
            r1 = -1
            if (r0 == r1) goto L17
            goto L31
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.kqueue.KQueueEventLoop> r0 = io.netty.channel.kqueue.KQueueEventLoop.WAKEN_UP_UPDATER     // Catch: java.lang.Throwable -> L2f
            int r0 = r0.getAndSet(r7, r2)     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            if (r0 != r1) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            int r0 = r7.kqueueWait(r0)     // Catch: java.lang.Throwable -> L2f
            int r3 = r7.wakenUp     // Catch: java.lang.Throwable -> L2f
            if (r3 != r1) goto L31
            r7.wakeup()     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L82
        L31:
            int r1 = r7.ioRatio     // Catch: java.lang.Throwable -> L2f
            r3 = 100
            if (r1 != r3) goto L46
            if (r0 <= 0) goto L42
            r7.processReady(r0)     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            r7.runAllTasks()     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L42:
            r7.runAllTasks()     // Catch: java.lang.Throwable -> L2f
            goto L70
        L46:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
            if (r0 <= 0) goto L61
            r7.processReady(r0)     // Catch: java.lang.Throwable -> L50
            goto L61
        L50:
            r0 = move-exception
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 - r3
            int r2 = 100 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 / r1
            r7.runAllTasks(r5)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L61:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 - r3
            int r3 = 100 - r1
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 * r3
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 / r3
            r7.runAllTasks(r5)     // Catch: java.lang.Throwable -> L2f
        L70:
            boolean r1 = r7.allowGrowing     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L85
            io.netty.channel.kqueue.KQueueEventArray r1 = r7.eventList     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.capacity()     // Catch: java.lang.Throwable -> L2f
            if (r0 != r1) goto L85
            io.netty.channel.kqueue.KQueueEventArray r0 = r7.eventList     // Catch: java.lang.Throwable -> L2f
            r0.realloc(r2)     // Catch: java.lang.Throwable -> L2f
            goto L85
        L82:
            handleLoopException(r0)
        L85:
            boolean r0 = r7.isShuttingDown()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L0
            r7.closeAll()     // Catch: java.lang.Throwable -> L95
            boolean r0 = r7.confirmShutdown()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L0
            return
        L95:
            r0 = move-exception
            handleLoopException(r0)
            goto L0
    }

    public void setIoRatio(int r4) {
            r3 = this;
            if (r4 <= 0) goto L9
            r0 = 100
            if (r4 > r0) goto L9
            r3.ioRatio = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ioRatio: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: 0 < ioRatio <= 100)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    protected void wakeup(boolean r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.kqueue.KQueueEventLoop> r3 = io.netty.channel.kqueue.KQueueEventLoop.WAKEN_UP_UPDATER
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r2, r0, r1)
            if (r3 == 0) goto Lf
            r2.wakeup()
        Lf:
            return
    }
}

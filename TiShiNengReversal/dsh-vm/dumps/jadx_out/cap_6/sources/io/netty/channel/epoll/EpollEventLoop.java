package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class EpollEventLoop extends io.netty.channel.SingleThreadEventLoop {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long MAX_SCHEDULED_TIMERFD_NS = 999999999;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.epoll.EpollEventLoop> WAKEN_UP_UPDATER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean allowGrowing;
    private final io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> channels;
    private io.netty.channel.epoll.NativeDatagramPacketArray datagramPacketArray;
    private final io.netty.channel.unix.FileDescriptor epollFd;
    private final io.netty.channel.unix.FileDescriptor eventFd;
    private final io.netty.channel.epoll.EpollEventArray events;
    private volatile int ioRatio;
    private io.netty.channel.unix.IovArray iovArray;
    private long prevDeadlineNanos;
    private final io.netty.util.IntSupplier selectNowSupplier;
    private final io.netty.channel.SelectStrategy selectStrategy;
    private final io.netty.channel.unix.FileDescriptor timerFd;
    private volatile int wakenUp;


    static {
            java.lang.Class<io.netty.channel.epoll.EpollEventLoop> r0 = io.netty.channel.epoll.EpollEventLoop.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.epoll.EpollEventLoop.logger = r1
            java.lang.String r1 = "wakenUp"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.channel.epoll.EpollEventLoop.WAKEN_UP_UPDATER = r0
            io.netty.channel.epoll.Epoll.ensureAvailability()
            return
    }

    EpollEventLoop(io.netty.channel.EventLoopGroup r10, java.util.concurrent.Executor r11, int r12, io.netty.channel.SelectStrategy r13, io.netty.util.concurrent.RejectedExecutionHandler r14, io.netty.channel.EventLoopTaskQueueFactory r15) {
            r9 = this;
            java.util.Queue r5 = newTaskQueue(r15)
            java.util.Queue r6 = newTaskQueue(r15)
            r4 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            long r10 = io.netty.util.concurrent.AbstractScheduledEventExecutor.nanoTime()
            r14 = 1
            long r10 = r10 - r14
            r1.prevDeadlineNanos = r10
            io.netty.util.collection.IntObjectHashMap r10 = new io.netty.util.collection.IntObjectHashMap
            r11 = 4096(0x1000, float:5.74E-42)
            r10.<init>(r11)
            r1.channels = r10
            io.netty.channel.epoll.EpollEventLoop$1 r10 = new io.netty.channel.epoll.EpollEventLoop$1
            r10.<init>(r9)
            r1.selectNowSupplier = r10
            r10 = 50
            r1.ioRatio = r10
            java.lang.String r10 = "strategy"
            java.lang.Object r10 = io.netty.util.internal.ObjectUtil.checkNotNull(r13, r10)
            io.netty.channel.SelectStrategy r10 = (io.netty.channel.SelectStrategy) r10
            r1.selectStrategy = r10
            if (r12 != 0) goto L44
            r10 = 1
            r1.allowGrowing = r10
            io.netty.channel.epoll.EpollEventArray r10 = new io.netty.channel.epoll.EpollEventArray
            r10.<init>(r11)
            r1.events = r10
            goto L4e
        L44:
            r10 = 0
            r1.allowGrowing = r10
            io.netty.channel.epoll.EpollEventArray r10 = new io.netty.channel.epoll.EpollEventArray
            r10.<init>(r12)
            r1.events = r10
        L4e:
            r10 = 0
            io.netty.channel.unix.FileDescriptor r11 = io.netty.channel.epoll.Native.newEpollCreate()     // Catch: java.lang.Throwable -> L9f
            r1.epollFd = r11     // Catch: java.lang.Throwable -> L99
            io.netty.channel.unix.FileDescriptor r12 = io.netty.channel.epoll.Native.newEventFd()     // Catch: java.lang.Throwable -> L99
            r1.eventFd = r12     // Catch: java.lang.Throwable -> L7f
            int r13 = r11.intValue()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L8f
            int r14 = r12.intValue()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L8f
            int r15 = io.netty.channel.epoll.Native.EPOLLIN     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L8f
            int r0 = io.netty.channel.epoll.Native.EPOLLET     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L8f
            r2 = r15 | r0
            io.netty.channel.epoll.Native.epollCtlAdd(r13, r14, r2)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L8f
            io.netty.channel.unix.FileDescriptor r10 = io.netty.channel.epoll.Native.newTimerFd()     // Catch: java.lang.Throwable -> L7f
            r1.timerFd = r10     // Catch: java.lang.Throwable -> L7f
            int r13 = r11.intValue()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L85
            int r14 = r10.intValue()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L85
            r15 = r15 | r0
            io.netty.channel.epoll.Native.epollCtlAdd(r13, r14, r15)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L85
            return
        L7f:
            r0 = move-exception
            r13 = r0
            r8 = r11
            r11 = r10
            r10 = r8
            goto La3
        L85:
            r0 = move-exception
            r13 = r0
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r15 = "Unable to add timerFd filedescriptor to epoll"
            r14.<init>(r15, r13)     // Catch: java.lang.Throwable -> L7f
            throw r14     // Catch: java.lang.Throwable -> L7f
        L8f:
            r0 = move-exception
            r13 = r0
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7f
            java.lang.String r15 = "Unable to add eventFd filedescriptor to epoll"
            r14.<init>(r15, r13)     // Catch: java.lang.Throwable -> L7f
            throw r14     // Catch: java.lang.Throwable -> L7f
        L99:
            r0 = move-exception
            r13 = r0
            r12 = r10
            r10 = r11
            r11 = r12
            goto La3
        L9f:
            r0 = move-exception
            r13 = r0
            r11 = r10
            r12 = r11
        La3:
            if (r10 == 0) goto Laa
            r10.close()     // Catch: java.lang.Exception -> La9
            goto Laa
        La9:
        Laa:
            if (r12 == 0) goto Lb1
            r12.close()     // Catch: java.lang.Exception -> Lb0
            goto Lb1
        Lb0:
        Lb1:
            if (r11 == 0) goto Lb6
            r11.close()     // Catch: java.lang.Exception -> Lb6
        Lb6:
            throw r13
    }

    static /* synthetic */ int access$000(io.netty.channel.epoll.EpollEventLoop r0) throws java.io.IOException {
            int r0 = r0.epollWaitNow()
            return r0
    }

    private void closeAll() {
            r5 = this;
            r5.epollWaitNow()     // Catch: java.io.IOException -> L3
        L3:
            io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> r0 = r5.channels
            java.util.Collection r0 = r0.values()
            r1 = 0
            io.netty.channel.epoll.AbstractEpollChannel[] r2 = new io.netty.channel.epoll.AbstractEpollChannel[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            io.netty.channel.epoll.AbstractEpollChannel[] r0 = (io.netty.channel.epoll.AbstractEpollChannel[]) r0
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

    private int epollBusyWait() throws java.io.IOException {
            r2 = this;
            io.netty.channel.unix.FileDescriptor r0 = r2.epollFd
            io.netty.channel.epoll.EpollEventArray r1 = r2.events
            int r0 = io.netty.channel.epoll.Native.epollBusyWait(r0, r1)
            return r0
    }

    private int epollWait() throws java.io.IOException {
            r8 = this;
            long r0 = r8.deadlineNanos()
            long r2 = r8.prevDeadlineNanos
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r0 = -1
            r1 = -1
            goto L32
        Ld:
            long r2 = java.lang.System.nanoTime()
            long r2 = r8.delayNanos(r2)
            r8.prevDeadlineNanos = r0
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r4 = r2 / r0
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r4, r6)
            int r5 = (int) r4
            long r6 = (long) r5
            long r6 = r6 * r0
            long r2 = r2 - r6
            r0 = 999999999(0x3b9ac9ff, double:4.940656453E-315)
            long r0 = java.lang.Math.min(r2, r0)
            int r0 = (int) r0
            r1 = r0
            r0 = r5
        L32:
            io.netty.channel.unix.FileDescriptor r2 = r8.epollFd
            io.netty.channel.epoll.EpollEventArray r3 = r8.events
            io.netty.channel.unix.FileDescriptor r4 = r8.timerFd
            int r0 = io.netty.channel.epoll.Native.epollWait(r2, r3, r4, r0, r1)
            return r0
    }

    private int epollWaitNow() throws java.io.IOException {
            r4 = this;
            io.netty.channel.unix.FileDescriptor r0 = r4.epollFd
            io.netty.channel.epoll.EpollEventArray r1 = r4.events
            io.netty.channel.unix.FileDescriptor r2 = r4.timerFd
            r3 = 0
            int r0 = io.netty.channel.epoll.Native.epollWait(r0, r1, r2, r3, r3)
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

    private void processReady(io.netty.channel.epoll.EpollEventArray r11, int r12) {
            r10 = this;
            r0 = 0
        L1:
            if (r0 >= r12) goto L61
            int r1 = r11.fd(r0)
            io.netty.channel.unix.FileDescriptor r2 = r10.eventFd
            int r2 = r2.intValue()
            if (r1 == r2) goto L5e
            io.netty.channel.unix.FileDescriptor r2 = r10.timerFd
            int r2 = r2.intValue()
            if (r1 != r2) goto L18
            goto L5e
        L18:
            int r2 = r11.events(r0)
            long r2 = (long) r2
            io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> r4 = r10.channels
            java.lang.Object r4 = r4.get(r1)
            io.netty.channel.epoll.AbstractEpollChannel r4 = (io.netty.channel.epoll.AbstractEpollChannel) r4
            if (r4 == 0) goto L55
            io.netty.channel.Channel$Unsafe r1 = r4.unsafe()
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r1 = (io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe) r1
            int r4 = io.netty.channel.epoll.Native.EPOLLERR
            int r5 = io.netty.channel.epoll.Native.EPOLLOUT
            r5 = r5 | r4
            long r5 = (long) r5
            long r5 = r5 & r2
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L3d
            r1.epollOutReady()
        L3d:
            int r5 = io.netty.channel.epoll.Native.EPOLLIN
            r4 = r4 | r5
            long r4 = (long) r4
            long r4 = r4 & r2
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L49
            r1.epollInReady()
        L49:
            int r4 = io.netty.channel.epoll.Native.EPOLLRDHUP
            long r4 = (long) r4
            long r2 = r2 & r4
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L5e
            r1.epollRdHupReady()
            goto L5e
        L55:
            io.netty.channel.unix.FileDescriptor r2 = r10.epollFd     // Catch: java.io.IOException -> L5e
            int r2 = r2.intValue()     // Catch: java.io.IOException -> L5e
            io.netty.channel.epoll.Native.epollCtlDel(r2, r1)     // Catch: java.io.IOException -> L5e
        L5e:
            int r0 = r0 + 1
            goto L1
        L61:
            return
    }

    void add(io.netty.channel.epoll.AbstractEpollChannel r4) throws java.io.IOException {
            r3 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r4.socket
            int r0 = r0.intValue()
            io.netty.channel.unix.FileDescriptor r1 = r3.epollFd
            int r1 = r1.intValue()
            int r2 = r4.flags
            io.netty.channel.epoll.Native.epollCtlAdd(r1, r0, r2)
            io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> r1 = r3.channels
            java.lang.Object r4 = r1.put(r0, r4)
            io.netty.channel.epoll.AbstractEpollChannel r4 = (io.netty.channel.epoll.AbstractEpollChannel) r4
            return
    }

    io.netty.channel.epoll.NativeDatagramPacketArray cleanDatagramPacketArray() {
            r1 = this;
            io.netty.channel.epoll.NativeDatagramPacketArray r0 = r1.datagramPacketArray
            if (r0 != 0) goto Lc
            io.netty.channel.epoll.NativeDatagramPacketArray r0 = new io.netty.channel.epoll.NativeDatagramPacketArray
            r0.<init>()
            r1.datagramPacketArray = r0
            goto Lf
        Lc:
            r0.clear()
        Lf:
            io.netty.channel.epoll.NativeDatagramPacketArray r0 = r1.datagramPacketArray
            return r0
    }

    io.netty.channel.unix.IovArray cleanIovArray() {
            r1 = this;
            io.netty.channel.unix.IovArray r0 = r1.iovArray
            if (r0 != 0) goto Lc
            io.netty.channel.unix.IovArray r0 = new io.netty.channel.unix.IovArray
            r0.<init>()
            r1.iovArray = r0
            goto Lf
        Lc:
            r0.clear()
        Lf:
            io.netty.channel.unix.IovArray r0 = r1.iovArray
            return r0
    }

    protected void cleanup() {
            r4 = this;
            r0 = 0
            io.netty.channel.unix.FileDescriptor r1 = r4.epollFd     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L9
            r1.close()     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L9
            goto L11
        L7:
            r1 = move-exception
            goto L45
        L9:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.epoll.EpollEventLoop.logger     // Catch: java.lang.Throwable -> L7
            java.lang.String r3 = "Failed to close the epoll fd."
            r2.warn(r3, r1)     // Catch: java.lang.Throwable -> L7
        L11:
            io.netty.channel.unix.FileDescriptor r1 = r4.eventFd     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L17
            r1.close()     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L17
            goto L1f
        L17:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.epoll.EpollEventLoop.logger     // Catch: java.lang.Throwable -> L7
            java.lang.String r3 = "Failed to close the event fd."
            r2.warn(r3, r1)     // Catch: java.lang.Throwable -> L7
        L1f:
            io.netty.channel.unix.FileDescriptor r1 = r4.timerFd     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L25
            r1.close()     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L25
            goto L2d
        L25:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.epoll.EpollEventLoop.logger     // Catch: java.lang.Throwable -> L7
            java.lang.String r3 = "Failed to close the timer fd."
            r2.warn(r3, r1)     // Catch: java.lang.Throwable -> L7
        L2d:
            io.netty.channel.unix.IovArray r1 = r4.iovArray
            if (r1 == 0) goto L36
            r1.release()
            r4.iovArray = r0
        L36:
            io.netty.channel.epoll.NativeDatagramPacketArray r1 = r4.datagramPacketArray
            if (r1 == 0) goto L3f
            r1.release()
            r4.datagramPacketArray = r0
        L3f:
            io.netty.channel.epoll.EpollEventArray r0 = r4.events
            r0.free()
            return
        L45:
            io.netty.channel.unix.IovArray r2 = r4.iovArray
            if (r2 == 0) goto L4e
            r2.release()
            r4.iovArray = r0
        L4e:
            io.netty.channel.epoll.NativeDatagramPacketArray r2 = r4.datagramPacketArray
            if (r2 == 0) goto L57
            r2.release()
            r4.datagramPacketArray = r0
        L57:
            io.netty.channel.epoll.EpollEventArray r0 = r4.events
            r0.free()
            throw r1
    }

    public int getIoRatio() {
            r1 = this;
            int r0 = r1.ioRatio
            return r0
    }

    void handleLoopException(java.lang.Throwable r3) {
            r2 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.epoll.EpollEventLoop.logger
            java.lang.String r1 = "Unexpected exception in the selector loop."
            r0.warn(r1, r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            return
    }

    void modify(io.netty.channel.epoll.AbstractEpollChannel r3) throws java.io.IOException {
            r2 = this;
            io.netty.channel.unix.FileDescriptor r0 = r2.epollFd
            int r0 = r0.intValue()
            io.netty.channel.epoll.LinuxSocket r1 = r3.socket
            int r1 = r1.intValue()
            int r3 = r3.flags
            io.netty.channel.epoll.Native.epollCtlMod(r0, r1, r3)
            return
    }

    protected java.util.Queue<java.lang.Runnable> newTaskQueue(int r1) {
            r0 = this;
            java.util.Queue r1 = newTaskQueue0(r1)
            return r1
    }

    @Override // io.netty.channel.SingleThreadEventLoop
    public int registeredChannels() {
            r1 = this;
            io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> r0 = r1.channels
            int r0 = r0.size()
            return r0
    }

    void remove(io.netty.channel.epoll.AbstractEpollChannel r3) throws java.io.IOException {
            r2 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r3.socket
            int r0 = r0.intValue()
            io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> r1 = r2.channels
            java.lang.Object r1 = r1.remove(r0)
            io.netty.channel.epoll.AbstractEpollChannel r1 = (io.netty.channel.epoll.AbstractEpollChannel) r1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L18
            io.netty.util.collection.IntObjectMap<io.netty.channel.epoll.AbstractEpollChannel> r3 = r2.channels
            r3.put(r0, r1)
            return
        L18:
            boolean r3 = r3.isOpen()
            if (r3 == 0) goto L27
            io.netty.channel.unix.FileDescriptor r3 = r2.epollFd
            int r3 = r3.intValue()
            io.netty.channel.epoll.Native.epollCtlDel(r3, r0)
        L27:
            return
    }

    protected void run() {
            r6 = this;
        L0:
            io.netty.channel.SelectStrategy r0 = r6.selectStrategy     // Catch: java.lang.Throwable -> L1f
            io.netty.util.IntSupplier r1 = r6.selectNowSupplier     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r6.hasTasks()     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.calculateStrategy(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r1 = -3
            if (r0 == r1) goto L2c
            r1 = -2
            if (r0 == r1) goto L0
            r1 = -1
            if (r0 == r1) goto L16
            goto L30
        L16:
            int r1 = r6.wakenUp     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            if (r1 != r2) goto L21
            r1 = 0
            r6.wakenUp = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r0 = move-exception
            goto L85
        L21:
            boolean r1 = r6.hasTasks()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L30
            int r0 = r6.epollWait()     // Catch: java.lang.Throwable -> L1f
            goto L30
        L2c:
            int r0 = r6.epollBusyWait()     // Catch: java.lang.Throwable -> L1f
        L30:
            int r1 = r6.ioRatio     // Catch: java.lang.Throwable -> L1f
            r2 = 100
            if (r1 != r2) goto L47
            if (r0 <= 0) goto L43
            io.netty.channel.epoll.EpollEventArray r1 = r6.events     // Catch: java.lang.Throwable -> L3e
            r6.processReady(r1, r0)     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r0 = move-exception
            r6.runAllTasks()     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1f
        L43:
            r6.runAllTasks()     // Catch: java.lang.Throwable -> L1f
            goto L73
        L47:
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1f
            if (r0 <= 0) goto L64
            io.netty.channel.epoll.EpollEventArray r4 = r6.events     // Catch: java.lang.Throwable -> L53
            r6.processReady(r4, r0)     // Catch: java.lang.Throwable -> L53
            goto L64
        L53:
            r0 = move-exception
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 - r2
            int r2 = 100 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 / r1
            r6.runAllTasks(r4)     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1f
        L64:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 - r2
            int r2 = 100 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 / r1
            r6.runAllTasks(r4)     // Catch: java.lang.Throwable -> L1f
        L73:
            boolean r1 = r6.allowGrowing     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L88
            io.netty.channel.epoll.EpollEventArray r1 = r6.events     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1f
            if (r0 != r1) goto L88
            io.netty.channel.epoll.EpollEventArray r0 = r6.events     // Catch: java.lang.Throwable -> L1f
            r0.increase()     // Catch: java.lang.Throwable -> L1f
            goto L88
        L85:
            r6.handleLoopException(r0)
        L88:
            boolean r0 = r6.isShuttingDown()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L0
            r6.closeAll()     // Catch: java.lang.Throwable -> L98
            boolean r0 = r6.confirmShutdown()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L0
            return
        L98:
            r0 = move-exception
            r6.handleLoopException(r0)
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
            if (r3 != 0) goto L16
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.epoll.EpollEventLoop> r3 = io.netty.channel.epoll.EpollEventLoop.WAKEN_UP_UPDATER
            r0 = 1
            int r3 = r3.getAndSet(r2, r0)
            if (r3 != 0) goto L16
            io.netty.channel.unix.FileDescriptor r3 = r2.eventFd
            int r3 = r3.intValue()
            r0 = 1
            io.netty.channel.epoll.Native.eventFdWrite(r3, r0)
        L16:
            return
    }
}

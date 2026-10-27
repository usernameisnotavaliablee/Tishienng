package io.netty.channel.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class NioEventLoop extends io.netty.channel.SingleThreadEventLoop {
    private static final int CLEANUP_INTERVAL = 256;
    private static final boolean DISABLE_KEY_SET_OPTIMIZATION = false;
    private static final int MIN_PREMATURE_SELECTOR_RETURNS = 3;
    private static final int SELECTOR_AUTO_REBUILD_THRESHOLD = 0;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private int cancelledKeys;
    private volatile int ioRatio;
    private boolean needsToSelectAgain;
    private final java.nio.channels.spi.SelectorProvider provider;
    private final io.netty.util.IntSupplier selectNowSupplier;
    private final io.netty.channel.SelectStrategy selectStrategy;
    private io.netty.channel.nio.SelectedSelectionKeySet selectedKeys;
    private java.nio.channels.Selector selector;
    private java.nio.channels.Selector unwrappedSelector;
    private final java.util.concurrent.atomic.AtomicBoolean wakenUp;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SelectorTuple {
        final java.nio.channels.Selector selector;
        final java.nio.channels.Selector unwrappedSelector;

        SelectorTuple(java.nio.channels.Selector r1) {
                r0 = this;
                r0.<init>()
                r0.unwrappedSelector = r1
                r0.selector = r1
                return
        }

        SelectorTuple(java.nio.channels.Selector r1, java.nio.channels.Selector r2) {
                r0 = this;
                r0.<init>()
                r0.unwrappedSelector = r1
                r0.selector = r2
                return
        }
    }

    static {
            java.lang.Class<io.netty.channel.nio.NioEventLoop> r0 = io.netty.channel.nio.NioEventLoop.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.nio.NioEventLoop.logger = r0
            java.lang.String r0 = "io.netty.noKeySetOptimization"
            r1 = 0
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            io.netty.channel.nio.NioEventLoop.DISABLE_KEY_SET_OPTIMIZATION = r0
            java.lang.String r0 = "sun.nio.ch.bugLevel"
            java.lang.String r0 = io.netty.util.internal.SystemPropertyUtil.get(r0)
            if (r0 != 0) goto L2a
            io.netty.channel.nio.NioEventLoop$2 r0 = new io.netty.channel.nio.NioEventLoop$2     // Catch: java.lang.SecurityException -> L22
            r0.<init>()     // Catch: java.lang.SecurityException -> L22
            java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.SecurityException -> L22
            goto L2a
        L22:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r3 = "Unable to get/set System Property: sun.nio.ch.bugLevel"
            r2.debug(r3, r0)
        L2a:
            java.lang.String r0 = "io.netty.selectorAutoRebuildThreshold"
            r2 = 512(0x200, float:7.17E-43)
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r2)
            r2 = 3
            if (r0 >= r2) goto L36
            goto L37
        L36:
            r1 = r0
        L37:
            io.netty.channel.nio.NioEventLoop.SELECTOR_AUTO_REBUILD_THRESHOLD = r1
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.nio.NioEventLoop.logger
            boolean r2 = r0.isDebugEnabled()
            if (r2 == 0) goto L55
            boolean r2 = io.netty.channel.nio.NioEventLoop.DISABLE_KEY_SET_OPTIMIZATION
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "-Dio.netty.noKeySetOptimization: {}"
            r0.debug(r3, r2)
            java.lang.String r2 = "-Dio.netty.selectorAutoRebuildThreshold: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r1)
        L55:
            return
    }

    NioEventLoop(io.netty.channel.nio.NioEventLoopGroup r8, java.util.concurrent.Executor r9, java.nio.channels.spi.SelectorProvider r10, io.netty.channel.SelectStrategy r11, io.netty.util.concurrent.RejectedExecutionHandler r12, io.netty.channel.EventLoopTaskQueueFactory r13) {
            r7 = this;
            java.util.Queue r4 = newTaskQueue(r13)
            java.util.Queue r5 = newTaskQueue(r13)
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            io.netty.channel.nio.NioEventLoop$1 r8 = new io.netty.channel.nio.NioEventLoop$1
            r8.<init>(r7)
            r0.selectNowSupplier = r8
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r8.<init>()
            r0.wakenUp = r8
            r8 = 50
            r0.ioRatio = r8
            if (r10 == 0) goto L3f
            if (r11 == 0) goto L37
            r0.provider = r10
            io.netty.channel.nio.NioEventLoop$SelectorTuple r8 = r7.openSelector()
            java.nio.channels.Selector r9 = r8.selector
            r0.selector = r9
            java.nio.channels.Selector r8 = r8.unwrappedSelector
            r0.unwrappedSelector = r8
            r0.selectStrategy = r11
            return
        L37:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "selectStrategy"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "selectorProvider"
            r8.<init>(r9)
            throw r8
    }

    static /* synthetic */ void access$000(io.netty.channel.nio.NioEventLoop r0, java.nio.channels.SelectableChannel r1, int r2, io.netty.channel.nio.NioTask r3) {
            r0.register0(r1, r2, r3)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.nio.NioEventLoop r0) {
            r0.rebuildSelector0()
            return
    }

    private void closeAll() {
            r5 = this;
            r5.selectAgain()
            java.nio.channels.Selector r0 = r5.selector
            java.util.Set r0 = r0.keys()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            java.nio.channels.SelectionKey r2 = (java.nio.channels.SelectionKey) r2
            java.lang.Object r3 = r2.attachment()
            boolean r4 = r3 instanceof io.netty.channel.nio.AbstractNioChannel
            if (r4 == 0) goto L30
            io.netty.channel.nio.AbstractNioChannel r3 = (io.netty.channel.nio.AbstractNioChannel) r3
            r1.add(r3)
            goto L16
        L30:
            r2.cancel()
            io.netty.channel.nio.NioTask r3 = (io.netty.channel.nio.NioTask) r3
            r4 = 0
            invokeChannelUnregistered(r3, r2, r4)
            goto L16
        L3a:
            java.util.Iterator r0 = r1.iterator()
        L3e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            io.netty.channel.nio.AbstractNioChannel r1 = (io.netty.channel.nio.AbstractNioChannel) r1
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r2 = r1.unsafe()
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r1 = r1.unsafe()
            io.netty.channel.ChannelPromise r1 = r1.voidPromise()
            r2.close(r1)
            goto L3e
        L5a:
            return
    }

    private static void handleLoopException(java.lang.Throwable r2) {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r1 = "Unexpected exception in the selector loop."
            r0.warn(r1, r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            return
    }

    private static void invokeChannelUnregistered(io.netty.channel.nio.NioTask<java.nio.channels.SelectableChannel> r0, java.nio.channels.SelectionKey r1, java.lang.Throwable r2) {
            java.nio.channels.SelectableChannel r1 = r1.channel()     // Catch: java.lang.Exception -> L8
            r0.channelUnregistered(r1, r2)     // Catch: java.lang.Exception -> L8
            return
        L8:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r2 = "Unexpected exception while running NioTask.channelUnregistered()"
            r1.warn(r2, r0)
            return
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

    private io.netty.channel.nio.NioEventLoop.SelectorTuple openSelector() {
            r5 = this;
            java.nio.channels.spi.SelectorProvider r0 = r5.provider     // Catch: java.io.IOException -> L74
            java.nio.channels.spi.AbstractSelector r0 = r0.openSelector()     // Catch: java.io.IOException -> L74
            boolean r1 = io.netty.channel.nio.NioEventLoop.DISABLE_KEY_SET_OPTIMIZATION
            if (r1 == 0) goto L10
            io.netty.channel.nio.NioEventLoop$SelectorTuple r1 = new io.netty.channel.nio.NioEventLoop$SelectorTuple
            r1.<init>(r0)
            return r1
        L10:
            io.netty.channel.nio.NioEventLoop$3 r1 = new io.netty.channel.nio.NioEventLoop$3
            r1.<init>(r5)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            boolean r2 = r1 instanceof java.lang.Class
            java.lang.String r3 = "failed to instrument a special java.util.Set into: {}"
            if (r2 == 0) goto L63
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class r4 = r0.getClass()
            boolean r4 = r2.isAssignableFrom(r4)
            if (r4 != 0) goto L2d
            goto L63
        L2d:
            io.netty.channel.nio.SelectedSelectionKeySet r1 = new io.netty.channel.nio.SelectedSelectionKeySet
            r1.<init>()
            io.netty.channel.nio.NioEventLoop$4 r4 = new io.netty.channel.nio.NioEventLoop$4
            r4.<init>(r5, r2, r0, r1)
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r4)
            boolean r4 = r2 instanceof java.lang.Exception
            if (r4 == 0) goto L4f
            r1 = 0
            r5.selectedKeys = r1
            java.lang.Exception r2 = (java.lang.Exception) r2
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            r1.trace(r3, r0, r2)
            io.netty.channel.nio.NioEventLoop$SelectorTuple r1 = new io.netty.channel.nio.NioEventLoop$SelectorTuple
            r1.<init>(r0)
            return r1
        L4f:
            r5.selectedKeys = r1
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r3 = "instrumented a special java.util.Set into: {}"
            r2.trace(r3, r0)
            io.netty.channel.nio.NioEventLoop$SelectorTuple r2 = new io.netty.channel.nio.NioEventLoop$SelectorTuple
            io.netty.channel.nio.SelectedSelectionKeySetSelector r3 = new io.netty.channel.nio.SelectedSelectionKeySetSelector
            r3.<init>(r0, r1)
            r2.<init>(r0, r3)
            return r2
        L63:
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L6e
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.nio.NioEventLoop.logger
            r2.trace(r3, r0, r1)
        L6e:
            io.netty.channel.nio.NioEventLoop$SelectorTuple r1 = new io.netty.channel.nio.NioEventLoop$SelectorTuple
            r1.<init>(r0)
            return r1
        L74:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "failed to open a new selector"
            r1.<init>(r2, r0)
            throw r1
    }

    private void processSelectedKey(java.nio.channels.SelectionKey r4, io.netty.channel.nio.AbstractNioChannel r5) {
            r3 = this;
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = r5.unsafe()
            boolean r1 = r4.isValid()
            if (r1 != 0) goto L1b
            io.netty.channel.nio.NioEventLoop r4 = r5.eventLoop()     // Catch: java.lang.Throwable -> L1a
            if (r4 != r3) goto L41
            if (r4 != 0) goto L13
            goto L41
        L13:
            io.netty.channel.ChannelPromise r4 = r0.voidPromise()
            r0.close(r4)
        L1a:
            return
        L1b:
            int r1 = r4.readyOps()     // Catch: java.nio.channels.CancelledKeyException -> L46
            r2 = r1 & 8
            if (r2 == 0) goto L2f
            int r2 = r4.interestOps()     // Catch: java.nio.channels.CancelledKeyException -> L46
            r2 = r2 & (-9)
            r4.interestOps(r2)     // Catch: java.nio.channels.CancelledKeyException -> L46
            r0.finishConnect()     // Catch: java.nio.channels.CancelledKeyException -> L46
        L2f:
            r4 = r1 & 4
            if (r4 == 0) goto L3a
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r4 = r5.unsafe()     // Catch: java.nio.channels.CancelledKeyException -> L46
            r4.forceFlush()     // Catch: java.nio.channels.CancelledKeyException -> L46
        L3a:
            r4 = r1 & 17
            if (r4 != 0) goto L42
            if (r1 != 0) goto L41
            goto L42
        L41:
            return
        L42:
            r0.read()     // Catch: java.nio.channels.CancelledKeyException -> L46
            return
        L46:
            io.netty.channel.ChannelPromise r4 = r0.voidPromise()
            r0.close(r4)
            return
    }

    private static void processSelectedKey(java.nio.channels.SelectionKey r2, io.netty.channel.nio.NioTask<java.nio.channels.SelectableChannel> r3) {
            r0 = 0
            java.nio.channels.SelectableChannel r1 = r2.channel()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            r3.channelReady(r1, r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            boolean r1 = r2.isValid()
            if (r1 != 0) goto L11
            invokeChannelUnregistered(r3, r2, r0)
        L11:
            return
        L12:
            r1 = move-exception
            goto L1c
        L14:
            r1 = move-exception
            r2.cancel()     // Catch: java.lang.Throwable -> L12
            invokeChannelUnregistered(r3, r2, r1)     // Catch: java.lang.Throwable -> L12
            return
        L1c:
            r2.cancel()
            invokeChannelUnregistered(r3, r2, r0)
            throw r1
    }

    private void processSelectedKeys() {
            r1 = this;
            io.netty.channel.nio.SelectedSelectionKeySet r0 = r1.selectedKeys
            if (r0 == 0) goto L8
            r1.processSelectedKeysOptimized()
            return
        L8:
            java.nio.channels.Selector r0 = r1.selector
            java.util.Set r0 = r0.selectedKeys()
            r1.processSelectedKeysPlain(r0)
            return
    }

    private void processSelectedKeysOptimized() {
            r4 = this;
            r0 = 0
        L1:
            io.netty.channel.nio.SelectedSelectionKeySet r1 = r4.selectedKeys
            int r2 = r1.size
            if (r0 >= r2) goto L33
            java.nio.channels.SelectionKey[] r1 = r1.keys
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            java.lang.Object r1 = r2.attachment()
            boolean r3 = r1 instanceof io.netty.channel.nio.AbstractNioChannel
            if (r3 == 0) goto L1c
            io.netty.channel.nio.AbstractNioChannel r1 = (io.netty.channel.nio.AbstractNioChannel) r1
            r4.processSelectedKey(r2, r1)
            goto L21
        L1c:
            io.netty.channel.nio.NioTask r1 = (io.netty.channel.nio.NioTask) r1
            processSelectedKey(r2, r1)
        L21:
            boolean r1 = r4.needsToSelectAgain
            if (r1 == 0) goto L30
            io.netty.channel.nio.SelectedSelectionKeySet r1 = r4.selectedKeys
            int r0 = r0 + 1
            r1.reset(r0)
            r4.selectAgain()
            r0 = -1
        L30:
            int r0 = r0 + 1
            goto L1
        L33:
            return
    }

    private void processSelectedKeysPlain(java.util.Set<java.nio.channels.SelectionKey> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L41
        L7:
            java.util.Iterator r4 = r4.iterator()
        Lb:
            java.lang.Object r0 = r4.next()
            java.nio.channels.SelectionKey r0 = (java.nio.channels.SelectionKey) r0
            java.lang.Object r1 = r0.attachment()
            r4.remove()
            boolean r2 = r1 instanceof io.netty.channel.nio.AbstractNioChannel
            if (r2 == 0) goto L22
            io.netty.channel.nio.AbstractNioChannel r1 = (io.netty.channel.nio.AbstractNioChannel) r1
            r3.processSelectedKey(r0, r1)
            goto L27
        L22:
            io.netty.channel.nio.NioTask r1 = (io.netty.channel.nio.NioTask) r1
            processSelectedKey(r0, r1)
        L27:
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r0 = r3.needsToSelectAgain
            if (r0 == 0) goto Lb
            r3.selectAgain()
            java.nio.channels.Selector r4 = r3.selector
            java.util.Set r4 = r4.selectedKeys()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.util.Iterator r4 = r4.iterator()
            goto Lb
    }

    private void rebuildSelector0() {
            r9 = this;
            java.nio.channels.Selector r0 = r9.selector
            if (r0 != 0) goto L6
            goto Lb6
        L6:
            io.netty.channel.nio.NioEventLoop$SelectorTuple r1 = r9.openSelector()     // Catch: java.lang.Exception -> Lb7
            java.util.Set r2 = r0.keys()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L13:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.next()
            java.nio.channels.SelectionKey r4 = (java.nio.channels.SelectionKey) r4
            java.lang.Object r5 = r4.attachment()
            boolean r6 = r4.isValid()     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L13
            java.nio.channels.SelectableChannel r6 = r4.channel()     // Catch: java.lang.Exception -> L51
            java.nio.channels.Selector r7 = r1.unwrappedSelector     // Catch: java.lang.Exception -> L51
            java.nio.channels.SelectionKey r6 = r6.keyFor(r7)     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L36
            goto L13
        L36:
            int r6 = r4.interestOps()     // Catch: java.lang.Exception -> L51
            r4.cancel()     // Catch: java.lang.Exception -> L51
            java.nio.channels.SelectableChannel r7 = r4.channel()     // Catch: java.lang.Exception -> L51
            java.nio.channels.Selector r8 = r1.unwrappedSelector     // Catch: java.lang.Exception -> L51
            java.nio.channels.SelectionKey r6 = r7.register(r8, r6, r5)     // Catch: java.lang.Exception -> L51
            boolean r7 = r5 instanceof io.netty.channel.nio.AbstractNioChannel     // Catch: java.lang.Exception -> L51
            if (r7 == 0) goto L53
            r7 = r5
            io.netty.channel.nio.AbstractNioChannel r7 = (io.netty.channel.nio.AbstractNioChannel) r7     // Catch: java.lang.Exception -> L51
            r7.selectionKey = r6     // Catch: java.lang.Exception -> L51
            goto L53
        L51:
            r6 = move-exception
            goto L56
        L53:
            int r3 = r3 + 1
            goto L13
        L56:
            io.netty.util.internal.logging.InternalLogger r7 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r8 = "Failed to re-register a Channel to the new Selector."
            r7.warn(r8, r6)
            boolean r7 = r5 instanceof io.netty.channel.nio.AbstractNioChannel
            if (r7 == 0) goto L73
            io.netty.channel.nio.AbstractNioChannel r5 = (io.netty.channel.nio.AbstractNioChannel) r5
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r4 = r5.unsafe()
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r5 = r5.unsafe()
            io.netty.channel.ChannelPromise r5 = r5.voidPromise()
            r4.close(r5)
            goto L13
        L73:
            io.netty.channel.nio.NioTask r5 = (io.netty.channel.nio.NioTask) r5
            invokeChannelUnregistered(r5, r4, r6)
            goto L13
        L79:
            java.nio.channels.Selector r2 = r1.selector
            r9.selector = r2
            java.nio.channels.Selector r1 = r1.unwrappedSelector
            r9.unwrappedSelector = r1
            r0.close()     // Catch: java.lang.Throwable -> L85
            goto L95
        L85:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L95
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r2 = "Failed to close the old Selector."
            r1.warn(r2, r0)
        L95:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.nio.NioEventLoop.logger
            boolean r1 = r0.isInfoEnabled()
            if (r1 == 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Migrated "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " channel(s) to the new Selector."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.info(r1)
        Lb6:
            return
        Lb7:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r2 = "Failed to create a new Selector."
            r1.warn(r2, r0)
            return
    }

    private void register0(java.nio.channels.SelectableChannel r2, int r3, io.netty.channel.nio.NioTask<?> r4) {
            r1 = this;
            java.nio.channels.Selector r0 = r1.unwrappedSelector     // Catch: java.lang.Exception -> L6
            r2.register(r0, r3, r4)     // Catch: java.lang.Exception -> L6
            return
        L6:
            r2 = move-exception
            io.netty.channel.EventLoopException r3 = new io.netty.channel.EventLoopException
            java.lang.String r4 = "failed to register a channel"
            r3.<init>(r4, r2)
            throw r3
    }

    private void select(boolean r14) throws java.io.IOException {
            r13 = this;
            java.nio.channels.Selector r0 = r13.selector
            long r1 = java.lang.System.nanoTime()     // Catch: java.nio.channels.CancelledKeyException -> L26
            long r3 = r13.delayNanos(r1)     // Catch: java.nio.channels.CancelledKeyException -> L26
            long r3 = r3 + r1
            r5 = 0
            r6 = 0
        Ld:
            long r7 = r3 - r1
            r9 = 500000(0x7a120, double:2.47033E-318)
            long r7 = r7 + r9
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r9
            r9 = 0
            r11 = 1
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L29
            if (r6 != 0) goto L8d
            r0.selectNow()     // Catch: java.nio.channels.CancelledKeyException -> L26
        L23:
            r6 = 1
            goto L8d
        L26:
            r14 = move-exception
            goto La3
        L29:
            boolean r9 = r13.hasTasks()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r9 == 0) goto L3b
            java.util.concurrent.atomic.AtomicBoolean r9 = r13.wakenUp     // Catch: java.nio.channels.CancelledKeyException -> L26
            boolean r9 = r9.compareAndSet(r5, r11)     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r9 == 0) goto L3b
            r0.selectNow()     // Catch: java.nio.channels.CancelledKeyException -> L26
            goto L23
        L3b:
            int r9 = r0.select(r7)     // Catch: java.nio.channels.CancelledKeyException -> L26
            int r6 = r6 + 1
            if (r9 != 0) goto L8d
            if (r14 != 0) goto L8d
            java.util.concurrent.atomic.AtomicBoolean r9 = r13.wakenUp     // Catch: java.nio.channels.CancelledKeyException -> L26
            boolean r9 = r9.get()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r9 != 0) goto L8d
            boolean r9 = r13.hasTasks()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r9 != 0) goto L8d
            boolean r9 = r13.hasScheduledTasks()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r9 == 0) goto L5a
            goto L8d
        L5a:
            boolean r9 = java.lang.Thread.interrupted()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r9 == 0) goto L6e
            io.netty.util.internal.logging.InternalLogger r14 = io.netty.channel.nio.NioEventLoop.logger     // Catch: java.nio.channels.CancelledKeyException -> L26
            boolean r1 = r14.isDebugEnabled()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r1 == 0) goto L23
            java.lang.String r1 = "Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop."
            r14.debug(r1)     // Catch: java.nio.channels.CancelledKeyException -> L26
            goto L23
        L6e:
            long r9 = java.lang.System.nanoTime()     // Catch: java.nio.channels.CancelledKeyException -> L26
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.nio.channels.CancelledKeyException -> L26
            long r7 = r12.toNanos(r7)     // Catch: java.nio.channels.CancelledKeyException -> L26
            long r7 = r9 - r7
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 < 0) goto L80
            r6 = 1
            goto L8b
        L80:
            int r1 = io.netty.channel.nio.NioEventLoop.SELECTOR_AUTO_REBUILD_THRESHOLD     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r1 <= 0) goto L8b
            if (r6 < r1) goto L8b
            java.nio.channels.Selector r0 = r13.selectRebuildSelector(r6)     // Catch: java.nio.channels.CancelledKeyException -> L26
            goto L23
        L8b:
            r1 = r9
            goto Ld
        L8d:
            r14 = 3
            if (r6 <= r14) goto Lc5
            io.netty.util.internal.logging.InternalLogger r14 = io.netty.channel.nio.NioEventLoop.logger     // Catch: java.nio.channels.CancelledKeyException -> L26
            boolean r1 = r14.isDebugEnabled()     // Catch: java.nio.channels.CancelledKeyException -> L26
            if (r1 == 0) goto Lc5
            java.lang.String r1 = "Selector.select() returned prematurely {} times in a row for Selector {}."
            int r6 = r6 - r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.nio.channels.CancelledKeyException -> L26
            r14.debug(r1, r2, r0)     // Catch: java.nio.channels.CancelledKeyException -> L26
            return
        La3:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            boolean r2 = r1.isDebugEnabled()
            if (r2 == 0) goto Lc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<java.nio.channels.CancelledKeyException> r3 = java.nio.channels.CancelledKeyException.class
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " raised by a Selector {} - JDK bug?"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.debug(r2, r0, r14)
        Lc5:
            return
    }

    private void selectAgain() {
            r3 = this;
            r0 = 0
            r3.needsToSelectAgain = r0
            java.nio.channels.Selector r0 = r3.selector     // Catch: java.lang.Throwable -> L9
            r0.selectNow()     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r2 = "Failed to update SelectionKeys."
            r1.warn(r2, r0)
            return
    }

    private java.nio.channels.Selector selectRebuildSelector(int r4) throws java.io.IOException {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.nio.channels.Selector r1 = r3.selector
            java.lang.String r2 = "Selector.select() returned prematurely {} times in a row; rebuilding Selector {}."
            r0.warn(r2, r4, r1)
            r3.rebuildSelector()
            java.nio.channels.Selector r4 = r3.selector
            r4.selectNow()
            return r4
    }

    void cancel(java.nio.channels.SelectionKey r3) {
            r2 = this;
            r3.cancel()
            int r3 = r2.cancelledKeys
            r0 = 1
            int r3 = r3 + r0
            r2.cancelledKeys = r3
            r1 = 256(0x100, float:3.59E-43)
            if (r3 < r1) goto L12
            r3 = 0
            r2.cancelledKeys = r3
            r2.needsToSelectAgain = r0
        L12:
            return
    }

    protected void cleanup() {
            r3 = this;
            java.nio.channels.Selector r0 = r3.selector     // Catch: java.io.IOException -> L6
            r0.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.nio.NioEventLoop.logger
            java.lang.String r2 = "Failed to close a selector."
            r1.warn(r2, r0)
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

    protected java.lang.Runnable pollTask() {
            r2 = this;
            java.lang.Runnable r0 = super.pollTask()
            boolean r1 = r2.needsToSelectAgain
            if (r1 == 0) goto Lb
            r2.selectAgain()
        Lb:
            return r0
    }

    public void rebuildSelector() {
            r1 = this;
            boolean r0 = r1.inEventLoop()
            if (r0 != 0) goto Lf
            io.netty.channel.nio.NioEventLoop$6 r0 = new io.netty.channel.nio.NioEventLoop$6
            r0.<init>(r1)
            r1.execute(r0)
            return
        Lf:
            r1.rebuildSelector0()
            return
    }

    public void register(java.nio.channels.SelectableChannel r3, int r4, io.netty.channel.nio.NioTask<?> r5) {
            r2 = this;
            if (r3 == 0) goto L73
            if (r4 == 0) goto L6b
            int r0 = r3.validOps()
            int r0 = ~r0
            r0 = r0 & r4
            if (r0 != 0) goto L43
            if (r5 == 0) goto L3b
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L33
            boolean r0 = r2.inEventLoop()
            if (r0 == 0) goto L1e
            r2.register0(r3, r4, r5)
            return
        L1e:
            io.netty.channel.nio.NioEventLoop$5 r0 = new io.netty.channel.nio.NioEventLoop$5     // Catch: java.lang.InterruptedException -> L2b
            r0.<init>(r2, r3, r4, r5)     // Catch: java.lang.InterruptedException -> L2b
            io.netty.util.concurrent.Future r3 = r2.submit(r0)     // Catch: java.lang.InterruptedException -> L2b
            r3.sync()     // Catch: java.lang.InterruptedException -> L2b
            return
        L2b:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            return
        L33:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "event loop shut down"
            r3.<init>(r4)
            throw r3
        L3b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "task"
            r3.<init>(r4)
            throw r3
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid interestOps: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "(validOps: "
            r0.append(r4)
            int r3 = r3.validOps()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L6b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "interestOps must be non-zero."
            r3.<init>(r4)
            throw r3
        L73:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "ch"
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.channel.SingleThreadEventLoop
    public int registeredChannels() {
            r2 = this;
            java.nio.channels.Selector r0 = r2.selector
            java.util.Set r0 = r0.keys()
            int r0 = r0.size()
            int r1 = r2.cancelledKeys
            int r0 = r0 - r1
            return r0
    }

    protected void run() {
            r6 = this;
        L0:
            io.netty.channel.SelectStrategy r0 = r6.selectStrategy     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            io.netty.util.IntSupplier r1 = r6.selectNowSupplier     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            boolean r2 = r6.hasTasks()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            int r0 = r0.calculateStrategy(r1, r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r1 = -3
            r2 = 0
            if (r0 == r1) goto L17
            r1 = -2
            if (r0 == r1) goto L0
            r1 = -1
            if (r0 == r1) goto L17
            goto L32
        L17:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.wakenUp     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            boolean r0 = r0.getAndSet(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r6.select(r0)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.wakenUp     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            if (r0 == 0) goto L32
            java.nio.channels.Selector r0 = r6.selector     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r0.wakeup()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L32
        L2e:
            r0 = move-exception
            goto L77
        L30:
            r0 = move-exception
            goto L70
        L32:
            r6.cancelledKeys = r2     // Catch: java.lang.Throwable -> L2e
            r6.needsToSelectAgain = r2     // Catch: java.lang.Throwable -> L2e
            int r0 = r6.ioRatio     // Catch: java.lang.Throwable -> L2e
            r1 = 100
            if (r0 != r1) goto L48
            r6.processSelectedKeys()     // Catch: java.lang.Throwable -> L43
            r6.runAllTasks()     // Catch: java.lang.Throwable -> L2e
            goto L7a
        L43:
            r0 = move-exception
            r6.runAllTasks()     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L48:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2e
            r6.processSelectedKeys()     // Catch: java.lang.Throwable -> L5f
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 - r1
            int r1 = 100 - r0
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 * r1
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 / r0
            r6.runAllTasks(r3)     // Catch: java.lang.Throwable -> L2e
            goto L7a
        L5f:
            r3 = move-exception
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2e
            long r4 = r4 - r1
            int r1 = 100 - r0
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L2e
            long r4 = r4 * r1
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L2e
            long r4 = r4 / r0
            r6.runAllTasks(r4)     // Catch: java.lang.Throwable -> L2e
            throw r3     // Catch: java.lang.Throwable -> L2e
        L70:
            r6.rebuildSelector0()     // Catch: java.lang.Throwable -> L2e
            handleLoopException(r0)     // Catch: java.lang.Throwable -> L2e
            goto L0
        L77:
            handleLoopException(r0)
        L7a:
            boolean r0 = r6.isShuttingDown()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L0
            r6.closeAll()     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r6.confirmShutdown()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L0
            return
        L8a:
            r0 = move-exception
            handleLoopException(r0)
            goto L0
    }

    int selectNow() throws java.io.IOException {
            r2 = this;
            java.nio.channels.Selector r0 = r2.selector     // Catch: java.lang.Throwable -> L14
            int r0 = r0.selectNow()     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.wakenUp
            boolean r1 = r1.get()
            if (r1 == 0) goto L13
            java.nio.channels.Selector r1 = r2.selector
            r1.wakeup()
        L13:
            return r0
        L14:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.wakenUp
            boolean r1 = r1.get()
            if (r1 == 0) goto L22
            java.nio.channels.Selector r1 = r2.selector
            r1.wakeup()
        L22:
            throw r0
    }

    public java.nio.channels.spi.SelectorProvider selectorProvider() {
            r1 = this;
            java.nio.channels.spi.SelectorProvider r0 = r1.provider
            return r0
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

    java.nio.channels.Selector unwrappedSelector() {
            r1 = this;
            java.nio.channels.Selector r0 = r1.unwrappedSelector
            return r0
    }

    protected void wakeup(boolean r3) {
            r2 = this;
            if (r3 != 0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.wakenUp
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L11
            java.nio.channels.Selector r3 = r2.selector
            r3.wakeup()
        L11:
            return
    }
}

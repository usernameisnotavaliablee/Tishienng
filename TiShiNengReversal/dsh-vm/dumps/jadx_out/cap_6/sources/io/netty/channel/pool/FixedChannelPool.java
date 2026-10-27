package io.netty.channel.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FixedChannelPool extends io.netty.channel.pool.SimpleChannelPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long acquireTimeoutNanos;
    private final java.util.concurrent.atomic.AtomicInteger acquiredChannelCount;
    private boolean closed;
    private final io.netty.util.concurrent.EventExecutor executor;
    private final int maxConnections;
    private final int maxPendingAcquires;
    private int pendingAcquireCount;
    private final java.util.Queue<io.netty.channel.pool.FixedChannelPool.AcquireTask> pendingAcquireQueue;
    private final java.lang.Runnable timeoutTask;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.pool.FixedChannelPool$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$pool$FixedChannelPool$AcquireTimeoutAction = null;

        static {
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction[] r0 = io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.pool.FixedChannelPool.AnonymousClass7.$SwitchMap$io$netty$channel$pool$FixedChannelPool$AcquireTimeoutAction = r0
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction r1 = io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.FAIL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.pool.FixedChannelPool.AnonymousClass7.$SwitchMap$io$netty$channel$pool$FixedChannelPool$AcquireTimeoutAction     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction r1 = io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.NEW     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass7() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class AcquireListener implements io.netty.util.concurrent.FutureListener<io.netty.channel.Channel> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        protected boolean acquired;
        private final io.netty.util.concurrent.Promise<io.netty.channel.Channel> originalPromise;
        final /* synthetic */ io.netty.channel.pool.FixedChannelPool this$0;

        static {
                return
        }

        AcquireListener(io.netty.channel.pool.FixedChannelPool r1, io.netty.util.concurrent.Promise<io.netty.channel.Channel> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.originalPromise = r2
                return
        }

        public void acquired() {
                r1 = this;
                boolean r0 = r1.acquired
                if (r0 == 0) goto L5
                return
            L5:
                io.netty.channel.pool.FixedChannelPool r0 = r1.this$0
                java.util.concurrent.atomic.AtomicInteger r0 = io.netty.channel.pool.FixedChannelPool.access$1000(r0)
                r0.incrementAndGet()
                r0 = 1
                r1.acquired = r0
                return
        }

        public void operationComplete(io.netty.util.concurrent.Future<io.netty.channel.Channel> r3) throws java.lang.Exception {
                r2 = this;
                io.netty.channel.pool.FixedChannelPool r0 = r2.this$0
                boolean r0 = io.netty.channel.pool.FixedChannelPool.access$400(r0)
                if (r0 == 0) goto L24
                boolean r0 = r3.isSuccess()
                if (r0 == 0) goto L17
                java.lang.Object r3 = r3.getNow()
                io.netty.channel.Channel r3 = (io.netty.channel.Channel) r3
                r3.close()
            L17:
                io.netty.util.concurrent.Promise<io.netty.channel.Channel> r3 = r2.originalPromise
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "FixedChannelPool was closed"
                r0.<init>(r1)
                r3.setFailure(r0)
                return
            L24:
                boolean r0 = r3.isSuccess()
                if (r0 == 0) goto L34
                io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r2.originalPromise
                java.lang.Object r3 = r3.getNow()
                r0.setSuccess(r3)
                return
            L34:
                boolean r0 = r2.acquired
                if (r0 == 0) goto L3e
                io.netty.channel.pool.FixedChannelPool r0 = r2.this$0
                io.netty.channel.pool.FixedChannelPool.access$500(r0)
                goto L43
            L3e:
                io.netty.channel.pool.FixedChannelPool r0 = r2.this$0
                io.netty.channel.pool.FixedChannelPool.access$900(r0)
            L43:
                io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r2.originalPromise
                java.lang.Throwable r3 = r3.cause()
                r0.setFailure(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AcquireTask extends io.netty.channel.pool.FixedChannelPool.AcquireListener {
        final long expireNanoTime;
        final io.netty.util.concurrent.Promise<io.netty.channel.Channel> promise;
        final /* synthetic */ io.netty.channel.pool.FixedChannelPool this$0;
        java.util.concurrent.ScheduledFuture<?> timeoutFuture;

        AcquireTask(io.netty.channel.pool.FixedChannelPool r5, io.netty.util.concurrent.Promise<io.netty.channel.Channel> r6) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>(r5, r6)
                long r0 = java.lang.System.nanoTime()
                long r2 = io.netty.channel.pool.FixedChannelPool.access$600(r5)
                long r0 = r0 + r2
                r4.expireNanoTime = r0
                io.netty.util.concurrent.EventExecutor r5 = io.netty.channel.pool.FixedChannelPool.access$300(r5)
                io.netty.util.concurrent.Promise r5 = r5.newPromise()
                io.netty.util.concurrent.Promise r5 = r5.addListener(r4)
                r4.promise = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AcquireTimeoutAction extends java.lang.Enum<io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction> {
        private static final /* synthetic */ io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction[] $VALUES = null;
        public static final io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction FAIL = null;
        public static final io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction NEW = null;

        static {
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction r0 = new io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction
                java.lang.String r1 = "NEW"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.NEW = r0
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction r1 = new io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction
                java.lang.String r3 = "FAIL"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.FAIL = r1
                r3 = 2
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction[] r3 = new io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.$VALUES = r3
                return
        }

        AcquireTimeoutAction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction> r0 = io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction r1 = (io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction) r1
                return r1
        }

        public static io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction[] values() {
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction[] r0 = io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.channel.pool.FixedChannelPool$AcquireTimeoutAction[] r0 = (io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class TimeoutTask implements java.lang.Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final /* synthetic */ io.netty.channel.pool.FixedChannelPool this$0;

        static {
                return
        }

        private TimeoutTask(io.netty.channel.pool.FixedChannelPool r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ TimeoutTask(io.netty.channel.pool.FixedChannelPool r1, io.netty.channel.pool.FixedChannelPool.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public abstract void onTimeout(io.netty.channel.pool.FixedChannelPool.AcquireTask r1);

        @Override // java.lang.Runnable
        public final void run() {
                r8 = this;
                long r0 = java.lang.System.nanoTime()
            L4:
                io.netty.channel.pool.FixedChannelPool r2 = r8.this$0
                java.util.Queue r2 = io.netty.channel.pool.FixedChannelPool.access$700(r2)
                java.lang.Object r2 = r2.peek()
                io.netty.channel.pool.FixedChannelPool$AcquireTask r2 = (io.netty.channel.pool.FixedChannelPool.AcquireTask) r2
                if (r2 == 0) goto L2f
                long r3 = r2.expireNanoTime
                long r3 = r0 - r3
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L1d
                goto L2f
            L1d:
                io.netty.channel.pool.FixedChannelPool r3 = r8.this$0
                java.util.Queue r3 = io.netty.channel.pool.FixedChannelPool.access$700(r3)
                r3.remove()
                io.netty.channel.pool.FixedChannelPool r3 = r8.this$0
                io.netty.channel.pool.FixedChannelPool.access$806(r3)
                r8.onTimeout(r2)
                goto L4
            L2f:
                return
        }
    }

    static {
            return
    }

    public FixedChannelPool(io.netty.bootstrap.Bootstrap r2, io.netty.channel.pool.ChannelPoolHandler r3, int r4) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public FixedChannelPool(io.netty.bootstrap.Bootstrap r10, io.netty.channel.pool.ChannelPoolHandler r11, int r12, int r13) {
            r9 = this;
            io.netty.channel.pool.ChannelHealthChecker r3 = io.netty.channel.pool.ChannelHealthChecker.ACTIVE
            r4 = 0
            r5 = -1
            r0 = r9
            r1 = r10
            r2 = r11
            r7 = r12
            r8 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    public FixedChannelPool(io.netty.bootstrap.Bootstrap r11, io.netty.channel.pool.ChannelPoolHandler r12, io.netty.channel.pool.ChannelHealthChecker r13, io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction r14, long r15, int r17, int r18) {
            r10 = this;
            r9 = 1
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
    }

    public FixedChannelPool(io.netty.bootstrap.Bootstrap r12, io.netty.channel.pool.ChannelPoolHandler r13, io.netty.channel.pool.ChannelHealthChecker r14, io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction r15, long r16, int r18, int r19, boolean r20) {
            r11 = this;
            r10 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
    }

    public FixedChannelPool(io.netty.bootstrap.Bootstrap r11, io.netty.channel.pool.ChannelPoolHandler r12, io.netty.channel.pool.ChannelHealthChecker r13, io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction r14, long r15, int r17, int r18, boolean r19, boolean r20) {
            r10 = this;
            r0 = r15
            r2 = r17
            r3 = r18
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r19
            r9 = r20
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.ArrayDeque r12 = new java.util.ArrayDeque
            r12.<init>()
            r10.pendingAcquireQueue = r12
            java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
            r12.<init>()
            r10.acquiredChannelCount = r12
            java.lang.String r12 = " (expected: >= 1)"
            r13 = 1
            if (r2 < r13) goto Lbe
            if (r3 < r13) goto La4
            r5 = -1
            if (r14 != 0) goto L33
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 != 0) goto L33
            r12 = 0
            r10.timeoutTask = r12
            r10.acquireTimeoutNanos = r5
            goto L91
        L33:
            if (r14 != 0) goto L42
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 != 0) goto L3a
            goto L42
        L3a:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "action"
            r11.<init>(r12)
            throw r11
        L42:
            if (r14 == 0) goto L67
            r5 = 0
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 < 0) goto L4b
            goto L67
        L4b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "acquireTimeoutMillis: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = " (expected: >= 0)"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L67:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r12.toNanos(r0)
            r10.acquireTimeoutNanos = r0
            int[] r12 = io.netty.channel.pool.FixedChannelPool.AnonymousClass7.$SwitchMap$io$netty$channel$pool$FixedChannelPool$AcquireTimeoutAction
            int r14 = r14.ordinal()
            r12 = r12[r14]
            if (r12 == r13) goto L8a
            r13 = 2
            if (r12 != r13) goto L84
            io.netty.channel.pool.FixedChannelPool$2 r12 = new io.netty.channel.pool.FixedChannelPool$2
            r12.<init>(r10)
            r10.timeoutTask = r12
            goto L91
        L84:
            java.lang.Error r11 = new java.lang.Error
            r11.<init>()
            throw r11
        L8a:
            io.netty.channel.pool.FixedChannelPool$1 r12 = new io.netty.channel.pool.FixedChannelPool$1
            r12.<init>(r10)
            r10.timeoutTask = r12
        L91:
            io.netty.bootstrap.BootstrapConfig r11 = r11.config2()
            io.netty.channel.EventLoopGroup r11 = r11.group()
            io.netty.channel.EventLoop r11 = r11.next()
            r10.executor = r11
            r10.maxConnections = r2
            r10.maxPendingAcquires = r3
            return
        La4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "maxPendingAcquires: "
            r13.append(r14)
            r13.append(r3)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        Lbe:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "maxConnections: "
            r13.append(r14)
            r13.append(r2)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger access$1000(io.netty.channel.pool.FixedChannelPool r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.acquiredChannelCount
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.Future access$101(io.netty.channel.pool.FixedChannelPool r0, io.netty.util.concurrent.Promise r1) {
            io.netty.util.concurrent.Future r0 = super.acquire(r1)
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.Future access$1100(io.netty.channel.pool.FixedChannelPool r0) {
            io.netty.util.concurrent.Future r0 = r0.close0()
            return r0
    }

    static /* synthetic */ void access$1201(io.netty.channel.pool.FixedChannelPool r0) {
            super.close()
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.pool.FixedChannelPool r0, io.netty.util.concurrent.Promise r1) {
            r0.acquire0(r1)
            return
    }

    static /* synthetic */ io.netty.util.concurrent.EventExecutor access$300(io.netty.channel.pool.FixedChannelPool r0) {
            io.netty.util.concurrent.EventExecutor r0 = r0.executor
            return r0
    }

    static /* synthetic */ boolean access$400(io.netty.channel.pool.FixedChannelPool r0) {
            boolean r0 = r0.closed
            return r0
    }

    static /* synthetic */ void access$500(io.netty.channel.pool.FixedChannelPool r0) {
            r0.decrementAndRunTaskQueue()
            return
    }

    static /* synthetic */ long access$600(io.netty.channel.pool.FixedChannelPool r2) {
            long r0 = r2.acquireTimeoutNanos
            return r0
    }

    static /* synthetic */ java.util.Queue access$700(io.netty.channel.pool.FixedChannelPool r0) {
            java.util.Queue<io.netty.channel.pool.FixedChannelPool$AcquireTask> r0 = r0.pendingAcquireQueue
            return r0
    }

    static /* synthetic */ int access$806(io.netty.channel.pool.FixedChannelPool r1) {
            int r0 = r1.pendingAcquireCount
            int r0 = r0 + (-1)
            r1.pendingAcquireCount = r0
            return r0
    }

    static /* synthetic */ void access$900(io.netty.channel.pool.FixedChannelPool r0) {
            r0.runTaskQueue()
            return
    }

    private void acquire0(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r6) {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 == 0) goto Lf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FixedChannelPool was closed"
            r0.<init>(r1)
            r6.setFailure(r0)
            return
        Lf:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.acquiredChannelCount
            int r0 = r0.get()
            int r1 = r5.maxConnections
            if (r0 >= r1) goto L2e
            io.netty.util.concurrent.EventExecutor r0 = r5.executor
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.channel.pool.FixedChannelPool$AcquireListener r1 = new io.netty.channel.pool.FixedChannelPool$AcquireListener
            r1.<init>(r5, r6)
            r1.acquired()
            r0.addListener(r1)
            super.acquire(r0)
            return
        L2e:
            int r0 = r5.pendingAcquireCount
            int r1 = r5.maxPendingAcquires
            if (r0 < r1) goto L38
            r5.tooManyOutstanding(r6)
            goto L5f
        L38:
            io.netty.channel.pool.FixedChannelPool$AcquireTask r0 = new io.netty.channel.pool.FixedChannelPool$AcquireTask
            r0.<init>(r5, r6)
            java.util.Queue<io.netty.channel.pool.FixedChannelPool$AcquireTask> r1 = r5.pendingAcquireQueue
            boolean r1 = r1.offer(r0)
            if (r1 == 0) goto L5c
            int r6 = r5.pendingAcquireCount
            int r6 = r6 + 1
            r5.pendingAcquireCount = r6
            java.lang.Runnable r6 = r5.timeoutTask
            if (r6 == 0) goto L5f
            io.netty.util.concurrent.EventExecutor r1 = r5.executor
            long r2 = r5.acquireTimeoutNanos
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            io.netty.util.concurrent.ScheduledFuture r6 = r1.schedule(r6, r2, r4)
            r0.timeoutFuture = r6
            goto L5f
        L5c:
            r5.tooManyOutstanding(r6)
        L5f:
            return
    }

    private io.netty.util.concurrent.Future<java.lang.Void> close0() {
            r3 = this;
            boolean r0 = r3.closed
            if (r0 != 0) goto L37
            r0 = 1
            r3.closed = r0
        L7:
            java.util.Queue<io.netty.channel.pool.FixedChannelPool$AcquireTask> r0 = r3.pendingAcquireQueue
            java.lang.Object r0 = r0.poll()
            io.netty.channel.pool.FixedChannelPool$AcquireTask r0 = (io.netty.channel.pool.FixedChannelPool.AcquireTask) r0
            r1 = 0
            if (r0 != 0) goto L25
            java.util.concurrent.atomic.AtomicInteger r0 = r3.acquiredChannelCount
            r0.set(r1)
            r3.pendingAcquireCount = r1
            io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            io.netty.channel.pool.FixedChannelPool$6 r1 = new io.netty.channel.pool.FixedChannelPool$6
            r1.<init>(r3)
            io.netty.util.concurrent.Future r0 = r0.submit(r1)
            return r0
        L25:
            java.util.concurrent.ScheduledFuture<?> r2 = r0.timeoutFuture
            if (r2 == 0) goto L2c
            r2.cancel(r1)
        L2c:
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r0.promise
            java.nio.channels.ClosedChannelException r1 = new java.nio.channels.ClosedChannelException
            r1.<init>()
            r0.setFailure(r1)
            goto L7
        L37:
            io.netty.util.concurrent.GlobalEventExecutor r0 = io.netty.util.concurrent.GlobalEventExecutor.INSTANCE
            r1 = 0
            io.netty.util.concurrent.Future r0 = r0.newSucceededFuture(r1)
            return r0
    }

    private void decrementAndRunTaskQueue() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.acquiredChannelCount
            r0.decrementAndGet()
            r1.runTaskQueue()
            return
    }

    private void runTaskQueue() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.acquiredChannelCount
            int r0 = r0.get()
            int r1 = r3.maxConnections
            if (r0 >= r1) goto L2c
            java.util.Queue<io.netty.channel.pool.FixedChannelPool$AcquireTask> r0 = r3.pendingAcquireQueue
            java.lang.Object r0 = r0.poll()
            io.netty.channel.pool.FixedChannelPool$AcquireTask r0 = (io.netty.channel.pool.FixedChannelPool.AcquireTask) r0
            if (r0 != 0) goto L15
            goto L2c
        L15:
            java.util.concurrent.ScheduledFuture<?> r1 = r0.timeoutFuture
            if (r1 == 0) goto L1d
            r2 = 0
            r1.cancel(r2)
        L1d:
            int r1 = r3.pendingAcquireCount
            int r1 = r1 + (-1)
            r3.pendingAcquireCount = r1
            r0.acquired()
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r0.promise
            super.acquire(r0)
            goto L0
        L2c:
            return
    }

    private void tooManyOutstanding(io.netty.util.concurrent.Promise<?> r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Too many outstanding acquire operations"
            r0.<init>(r1)
            r3.setFailure(r0)
            return
    }

    @Override // io.netty.channel.pool.SimpleChannelPool, io.netty.channel.pool.ChannelPool
    public io.netty.util.concurrent.Future<io.netty.channel.Channel> acquire(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r3) {
            r2 = this;
            io.netty.util.concurrent.EventExecutor r0 = r2.executor     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r0.inEventLoop()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r2.acquire0(r3)     // Catch: java.lang.Throwable -> Lc
            return r3
        Lc:
            r0 = move-exception
            goto L19
        Le:
            io.netty.util.concurrent.EventExecutor r0 = r2.executor     // Catch: java.lang.Throwable -> Lc
            io.netty.channel.pool.FixedChannelPool$3 r1 = new io.netty.channel.pool.FixedChannelPool$3     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lc
            return r3
        L19:
            r3.setFailure(r0)
            return r3
    }

    public int acquiredChannelCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.acquiredChannelCount
            int r0 = r0.get()
            return r0
    }

    @Override // io.netty.channel.pool.SimpleChannelPool, io.netty.channel.pool.ChannelPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            io.netty.util.concurrent.Future r0 = r2.closeAsync()     // Catch: java.lang.InterruptedException -> L8
            r0.await()     // Catch: java.lang.InterruptedException -> L8
            return
        L8:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public io.netty.util.concurrent.Future<java.lang.Void> closeAsync() {
            r3 = this;
            io.netty.util.concurrent.EventExecutor r0 = r3.executor
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto Ld
            io.netty.util.concurrent.Future r0 = r3.close0()
            return r0
        Ld:
            io.netty.util.concurrent.EventExecutor r0 = r3.executor
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.EventExecutor r1 = r3.executor
            io.netty.channel.pool.FixedChannelPool$5 r2 = new io.netty.channel.pool.FixedChannelPool$5
            r2.<init>(r3, r0)
            r1.execute(r2)
            return r0
    }

    @Override // io.netty.channel.pool.SimpleChannelPool, io.netty.channel.pool.ChannelPool
    public io.netty.util.concurrent.Future<java.lang.Void> release(io.netty.channel.Channel r3, io.netty.util.concurrent.Promise<java.lang.Void> r4) {
            r2 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.util.concurrent.EventExecutor r0 = r2.executor
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.channel.pool.FixedChannelPool$4 r1 = new io.netty.channel.pool.FixedChannelPool$4
            r1.<init>(r2, r3, r4)
            io.netty.util.concurrent.Promise r0 = r0.addListener(r1)
            super.release(r3, r0)
            return r4
    }
}

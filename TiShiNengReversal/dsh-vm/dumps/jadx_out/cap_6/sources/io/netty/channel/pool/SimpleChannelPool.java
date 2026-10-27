package io.netty.channel.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SimpleChannelPool implements io.netty.channel.pool.ChannelPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.AttributeKey<io.netty.channel.pool.SimpleChannelPool> POOL_KEY = null;
    private final io.netty.bootstrap.Bootstrap bootstrap;
    private final java.util.Deque<io.netty.channel.Channel> deque;
    private final io.netty.channel.pool.ChannelPoolHandler handler;
    private final io.netty.channel.pool.ChannelHealthChecker healthCheck;
    private final boolean lastRecentUsed;
    private final boolean releaseHealthCheck;








    static {
            java.lang.String r0 = "channelPool"
            io.netty.util.AttributeKey r0 = io.netty.util.AttributeKey.newInstance(r0)
            io.netty.channel.pool.SimpleChannelPool.POOL_KEY = r0
            return
    }

    public SimpleChannelPool(io.netty.bootstrap.Bootstrap r2, io.netty.channel.pool.ChannelPoolHandler r3) {
            r1 = this;
            io.netty.channel.pool.ChannelHealthChecker r0 = io.netty.channel.pool.ChannelHealthChecker.ACTIVE
            r1.<init>(r2, r3, r0)
            return
    }

    public SimpleChannelPool(io.netty.bootstrap.Bootstrap r2, io.netty.channel.pool.ChannelPoolHandler r3, io.netty.channel.pool.ChannelHealthChecker r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public SimpleChannelPool(io.netty.bootstrap.Bootstrap r7, io.netty.channel.pool.ChannelPoolHandler r8, io.netty.channel.pool.ChannelHealthChecker r9, boolean r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public SimpleChannelPool(io.netty.bootstrap.Bootstrap r2, io.netty.channel.pool.ChannelPoolHandler r3, io.netty.channel.pool.ChannelHealthChecker r4, boolean r5, boolean r6) {
            r1 = this;
            r1.<init>()
            java.util.Deque r0 = io.netty.util.internal.PlatformDependent.newConcurrentDeque()
            r1.deque = r0
            java.lang.String r0 = "handler"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.channel.pool.ChannelPoolHandler r0 = (io.netty.channel.pool.ChannelPoolHandler) r0
            r1.handler = r0
            java.lang.String r0 = "healthCheck"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.channel.pool.ChannelHealthChecker r4 = (io.netty.channel.pool.ChannelHealthChecker) r4
            r1.healthCheck = r4
            r1.releaseHealthCheck = r5
            java.lang.String r4 = "bootstrap"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r4)
            io.netty.bootstrap.Bootstrap r2 = (io.netty.bootstrap.Bootstrap) r2
            io.netty.bootstrap.Bootstrap r2 = r2.clone2()
            r1.bootstrap = r2
            io.netty.channel.pool.SimpleChannelPool$1 r4 = new io.netty.channel.pool.SimpleChannelPool$1
            r4.<init>(r1, r3)
            r2.handler(r4)
            r1.lastRecentUsed = r6
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.pool.SimpleChannelPool r0, io.netty.channel.ChannelFuture r1, io.netty.util.concurrent.Promise r2) throws java.lang.Exception {
            r0.notifyConnect(r1, r2)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.pool.SimpleChannelPool r0, io.netty.channel.Channel r1, io.netty.util.concurrent.Promise r2) {
            r0.doHealthCheck(r1, r2)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.pool.SimpleChannelPool r0, io.netty.util.concurrent.Future r1, io.netty.channel.Channel r2, io.netty.util.concurrent.Promise r3) {
            r0.notifyHealthCheck(r1, r2, r3)
            return
    }

    static /* synthetic */ void access$300(io.netty.channel.pool.SimpleChannelPool r0, io.netty.channel.Channel r1, io.netty.util.concurrent.Promise r2) {
            r0.doReleaseChannel(r1, r2)
            return
    }

    static /* synthetic */ void access$400(io.netty.channel.pool.SimpleChannelPool r0, io.netty.channel.Channel r1, io.netty.util.concurrent.Promise r2, io.netty.util.concurrent.Future r3) throws java.lang.Exception {
            r0.releaseAndOfferIfHealthy(r1, r2, r3)
            return
    }

    private io.netty.util.concurrent.Future<io.netty.channel.Channel> acquireHealthyFromPoolOrNew(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r4) {
            r3 = this;
            io.netty.channel.Channel r0 = r3.pollChannel()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L2a
            io.netty.bootstrap.Bootstrap r0 = r3.bootstrap     // Catch: java.lang.Throwable -> L1f
            io.netty.bootstrap.Bootstrap r0 = r0.clone2()     // Catch: java.lang.Throwable -> L1f
            io.netty.util.AttributeKey<io.netty.channel.pool.SimpleChannelPool> r1 = io.netty.channel.pool.SimpleChannelPool.POOL_KEY     // Catch: java.lang.Throwable -> L1f
            r0.attr(r1, r3)     // Catch: java.lang.Throwable -> L1f
            io.netty.channel.ChannelFuture r0 = r3.connectChannel(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            r3.notifyConnect(r0, r4)     // Catch: java.lang.Throwable -> L1f
            return r4
        L1f:
            r0 = move-exception
            goto L41
        L21:
            io.netty.channel.pool.SimpleChannelPool$2 r1 = new io.netty.channel.pool.SimpleChannelPool$2     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1f
            r0.addListener(r1)     // Catch: java.lang.Throwable -> L1f
            return r4
        L2a:
            io.netty.channel.EventLoop r1 = r0.eventLoop()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.inEventLoop()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L38
            r3.doHealthCheck(r0, r4)     // Catch: java.lang.Throwable -> L1f
            return r4
        L38:
            io.netty.channel.pool.SimpleChannelPool$3 r2 = new io.netty.channel.pool.SimpleChannelPool$3     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L1f
            r1.execute(r2)     // Catch: java.lang.Throwable -> L1f
            return r4
        L41:
            r4.tryFailure(r0)
            return r4
    }

    private static void closeAndFail(io.netty.channel.Channel r0, java.lang.Throwable r1, io.netty.util.concurrent.Promise<?> r2) {
            closeChannel(r0)
            r2.tryFailure(r1)
            return
    }

    private static void closeChannel(io.netty.channel.Channel r2) {
            io.netty.util.AttributeKey<io.netty.channel.pool.SimpleChannelPool> r0 = io.netty.channel.pool.SimpleChannelPool.POOL_KEY
            io.netty.util.Attribute r0 = r2.attr(r0)
            r1 = 0
            r0.getAndSet(r1)
            r2.close()
            return
    }

    private void doHealthCheck(io.netty.channel.Channel r3, io.netty.util.concurrent.Promise<io.netty.channel.Channel> r4) {
            r2 = this;
            io.netty.channel.pool.ChannelHealthChecker r0 = r2.healthCheck
            io.netty.util.concurrent.Future r0 = r0.isHealthy(r3)
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L10
            r2.notifyHealthCheck(r0, r3, r4)
            return
        L10:
            io.netty.channel.pool.SimpleChannelPool$4 r1 = new io.netty.channel.pool.SimpleChannelPool$4
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            return
    }

    private void doHealthCheckOnRelease(io.netty.channel.Channel r3, io.netty.util.concurrent.Promise<java.lang.Void> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.pool.ChannelHealthChecker r0 = r2.healthCheck
            io.netty.util.concurrent.Future r0 = r0.isHealthy(r3)
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L10
            r2.releaseAndOfferIfHealthy(r3, r4, r0)
            return
        L10:
            io.netty.channel.pool.SimpleChannelPool$6 r1 = new io.netty.channel.pool.SimpleChannelPool$6
            r1.<init>(r2, r3, r4, r0)
            r0.addListener(r1)
            return
    }

    private void doReleaseChannel(io.netty.channel.Channel r4, io.netty.util.concurrent.Promise<java.lang.Void> r5) {
            r3 = this;
            io.netty.util.AttributeKey<io.netty.channel.pool.SimpleChannelPool> r0 = io.netty.channel.pool.SimpleChannelPool.POOL_KEY
            io.netty.util.Attribute r0 = r4.attr(r0)
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            if (r0 == r3) goto L2c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Channel "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " was not acquired from this ChannelPool"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            closeAndFail(r4, r0, r5)
            return
        L2c:
            boolean r0 = r3.releaseHealthCheck     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            r3.doHealthCheckOnRelease(r4, r5)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r0 = move-exception
            goto L3a
        L36:
            r3.releaseAndOffer(r4, r5)     // Catch: java.lang.Throwable -> L34
            return
        L3a:
            closeAndFail(r4, r0, r5)
            return
    }

    private void notifyConnect(io.netty.channel.ChannelFuture r2, io.netty.util.concurrent.Promise<io.netty.channel.Channel> r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto L19
            io.netty.channel.Channel r2 = r2.channel()
            io.netty.channel.pool.ChannelPoolHandler r0 = r1.handler
            r0.channelAcquired(r2)
            boolean r3 = r3.trySuccess(r2)
            if (r3 != 0) goto L18
            r1.release(r2)
        L18:
            return
        L19:
            java.lang.Throwable r2 = r2.cause()
            r3.tryFailure(r2)
            return
    }

    private void notifyHealthCheck(io.netty.util.concurrent.Future<java.lang.Boolean> r2, io.netty.channel.Channel r3, io.netty.util.concurrent.Promise<io.netty.channel.Channel> r4) {
            r1 = this;
            boolean r0 = r2.isSuccess()
            if (r0 == 0) goto L30
            java.lang.Object r2 = r2.getNow()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L29
            io.netty.util.AttributeKey<io.netty.channel.pool.SimpleChannelPool> r2 = io.netty.channel.pool.SimpleChannelPool.POOL_KEY     // Catch: java.lang.Throwable -> L24
            io.netty.util.Attribute r2 = r3.attr(r2)     // Catch: java.lang.Throwable -> L24
            r2.set(r1)     // Catch: java.lang.Throwable -> L24
            io.netty.channel.pool.ChannelPoolHandler r2 = r1.handler     // Catch: java.lang.Throwable -> L24
            r2.channelAcquired(r3)     // Catch: java.lang.Throwable -> L24
            r4.setSuccess(r3)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r2 = move-exception
            closeAndFail(r3, r2, r4)
            return
        L29:
            closeChannel(r3)
            r1.acquireHealthyFromPoolOrNew(r4)
            return
        L30:
            closeChannel(r3)
            r1.acquireHealthyFromPoolOrNew(r4)
            return
    }

    private void releaseAndOffer(io.netty.channel.Channel r3, io.netty.util.concurrent.Promise<java.lang.Void> r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.offerChannel(r3)
            if (r0 == 0) goto L10
            io.netty.channel.pool.ChannelPoolHandler r0 = r2.handler
            r0.channelReleased(r3)
            r3 = 0
            r4.setSuccess(r3)
            return
        L10:
            io.netty.channel.pool.SimpleChannelPool$7 r0 = new io.netty.channel.pool.SimpleChannelPool$7
            java.lang.String r1 = "ChannelPool full"
            r0.<init>(r2, r1)
            closeAndFail(r3, r0, r4)
            return
    }

    private void releaseAndOfferIfHealthy(io.netty.channel.Channel r1, io.netty.util.concurrent.Promise<java.lang.Void> r2, io.netty.util.concurrent.Future<java.lang.Boolean> r3) throws java.lang.Exception {
            r0 = this;
            java.lang.Object r3 = r3.getNow()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            r0.releaseAndOffer(r1, r2)
            return
        L10:
            io.netty.channel.pool.ChannelPoolHandler r3 = r0.handler
            r3.channelReleased(r1)
            r1 = 0
            r2.setSuccess(r1)
            return
    }

    @Override // io.netty.channel.pool.ChannelPool
    public final io.netty.util.concurrent.Future<io.netty.channel.Channel> acquire() {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = r1.bootstrap
            io.netty.bootstrap.BootstrapConfig r0 = r0.config2()
            io.netty.channel.EventLoopGroup r0 = r0.group()
            io.netty.channel.EventLoop r0 = r0.next()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r0 = r1.acquire(r0)
            return r0
    }

    @Override // io.netty.channel.pool.ChannelPool
    public io.netty.util.concurrent.Future<io.netty.channel.Channel> acquire(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r2) {
            r1 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.Future r2 = r1.acquireHealthyFromPoolOrNew(r2)
            return r2
    }

    protected io.netty.bootstrap.Bootstrap bootstrap() {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = r1.bootstrap
            return r0
    }

    @Override // io.netty.channel.pool.ChannelPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
        L0:
            io.netty.channel.Channel r0 = r1.pollChannel()
            if (r0 != 0) goto L7
            return
        L7:
            io.netty.channel.ChannelFuture r0 = r0.close()
            r0.awaitUninterruptibly()
            goto L0
    }

    protected io.netty.channel.ChannelFuture connectChannel(io.netty.bootstrap.Bootstrap r1) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r1.connect()
            return r1
    }

    protected io.netty.channel.pool.ChannelPoolHandler handler() {
            r1 = this;
            io.netty.channel.pool.ChannelPoolHandler r0 = r1.handler
            return r0
    }

    protected io.netty.channel.pool.ChannelHealthChecker healthChecker() {
            r1 = this;
            io.netty.channel.pool.ChannelHealthChecker r0 = r1.healthCheck
            return r0
    }

    protected boolean offerChannel(io.netty.channel.Channel r2) {
            r1 = this;
            java.util.Deque<io.netty.channel.Channel> r0 = r1.deque
            boolean r2 = r0.offer(r2)
            return r2
    }

    protected io.netty.channel.Channel pollChannel() {
            r1 = this;
            boolean r0 = r1.lastRecentUsed
            if (r0 == 0) goto Ld
            java.util.Deque<io.netty.channel.Channel> r0 = r1.deque
            java.lang.Object r0 = r0.pollLast()
        La:
            io.netty.channel.Channel r0 = (io.netty.channel.Channel) r0
            return r0
        Ld:
            java.util.Deque<io.netty.channel.Channel> r0 = r1.deque
            java.lang.Object r0 = r0.pollFirst()
            goto La
    }

    @Override // io.netty.channel.pool.ChannelPool
    public final io.netty.util.concurrent.Future<java.lang.Void> release(io.netty.channel.Channel r2) {
            r1 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r2 = r1.release(r2, r0)
            return r2
    }

    @Override // io.netty.channel.pool.ChannelPool
    public io.netty.util.concurrent.Future<java.lang.Void> release(io.netty.channel.Channel r3, io.netty.util.concurrent.Promise<java.lang.Void> r4) {
            r2 = this;
            java.lang.String r0 = "channel"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.channel.EventLoop r0 = r3.eventLoop()     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.inEventLoop()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            r2.doReleaseChannel(r3, r4)     // Catch: java.lang.Throwable -> L18
            return r4
        L18:
            r0 = move-exception
            goto L23
        L1a:
            io.netty.channel.pool.SimpleChannelPool$5 r1 = new io.netty.channel.pool.SimpleChannelPool$5     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L18
            r0.execute(r1)     // Catch: java.lang.Throwable -> L18
            return r4
        L23:
            closeAndFail(r3, r0, r4)
            return r4
    }

    protected boolean releaseHealthCheck() {
            r1 = this;
            boolean r0 = r1.releaseHealthCheck
            return r0
    }
}

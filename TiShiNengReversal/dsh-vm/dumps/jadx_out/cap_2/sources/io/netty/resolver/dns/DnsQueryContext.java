package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
abstract class DnsQueryContext implements io.netty.util.concurrent.FutureListener<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.codec.dns.DnsRecord[] additionals;
    private final int id;
    private final java.net.InetSocketAddress nameServerAddr;
    private final io.netty.handler.codec.dns.DnsRecord optResource;
    private final io.netty.resolver.dns.DnsNameResolver parent;
    private final io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> promise;
    private final io.netty.handler.codec.dns.DnsQuestion question;
    private final boolean recursionDesired;
    private volatile io.netty.util.concurrent.ScheduledFuture<?> timeoutFuture;





    static {
            java.lang.Class<io.netty.resolver.dns.DnsQueryContext> r0 = io.netty.resolver.dns.DnsQueryContext.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.dns.DnsQueryContext.logger = r0
            return
    }

    DnsQueryContext(io.netty.resolver.dns.DnsNameResolver r2, java.net.InetSocketAddress r3, io.netty.handler.codec.dns.DnsQuestion r4, io.netty.handler.codec.dns.DnsRecord[] r5, io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "parent"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.resolver.dns.DnsNameResolver r0 = (io.netty.resolver.dns.DnsNameResolver) r0
            r1.parent = r0
            java.lang.String r0 = "nameServerAddr"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            r1.nameServerAddr = r3
            java.lang.String r3 = "question"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            io.netty.handler.codec.dns.DnsQuestion r3 = (io.netty.handler.codec.dns.DnsQuestion) r3
            r1.question = r3
            java.lang.String r3 = "additionals"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r3)
            io.netty.handler.codec.dns.DnsRecord[] r3 = (io.netty.handler.codec.dns.DnsRecord[]) r3
            r1.additionals = r3
            java.lang.String r3 = "promise"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r3)
            io.netty.util.concurrent.Promise r3 = (io.netty.util.concurrent.Promise) r3
            r1.promise = r3
            boolean r3 = r2.isRecursionDesired()
            r1.recursionDesired = r3
            io.netty.resolver.dns.DnsQueryContextManager r3 = r2.queryContextManager
            int r3 = r3.add(r1)
            r1.id = r3
            r6.addListener(r1)
            boolean r3 = r2.isOptResourceEnabled()
            if (r3 == 0) goto L59
            io.netty.resolver.dns.DnsQueryContext$1 r3 = new io.netty.resolver.dns.DnsQueryContext$1
            int r2 = r2.maxPayloadSize()
            r4 = 0
            r3.<init>(r1, r2, r4, r4)
            r1.optResource = r3
            return
        L59:
            r2 = 0
            r1.optResource = r2
            return
    }

    static /* synthetic */ void access$000(io.netty.resolver.dns.DnsQueryContext r0, io.netty.handler.codec.dns.DnsQuery r1, boolean r2, io.netty.channel.ChannelPromise r3) {
            r0.writeQuery(r1, r2, r3)
            return
    }

    static /* synthetic */ io.netty.util.concurrent.Promise access$100(io.netty.resolver.dns.DnsQueryContext r0) {
            io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r0 = r0.promise
            return r0
    }

    static /* synthetic */ void access$200(io.netty.resolver.dns.DnsQueryContext r0, io.netty.channel.ChannelFuture r1) {
            r0.onQueryWriteCompletion(r1)
            return
    }

    static /* synthetic */ void access$300(io.netty.resolver.dns.DnsQueryContext r0, java.lang.String r1, java.lang.Throwable r2) {
            r0.setFailure(r1, r2)
            return
    }

    private void onQueryWriteCompletion(io.netty.channel.ChannelFuture r5) {
            r4 = this;
            boolean r0 = r5.isSuccess()
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to send a query via "
            r0.append(r1)
            java.lang.String r1 = r4.protocol()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r5 = r5.cause()
            r4.setFailure(r0, r5)
            return
        L23:
            io.netty.resolver.dns.DnsNameResolver r5 = r4.parent
            long r0 = r5.queryTimeoutMillis()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L44
            io.netty.resolver.dns.DnsNameResolver r5 = r4.parent
            io.netty.channel.Channel r5 = r5.ch
            io.netty.channel.EventLoop r5 = r5.eventLoop()
            io.netty.resolver.dns.DnsQueryContext$4 r2 = new io.netty.resolver.dns.DnsQueryContext$4
            r2.<init>(r4, r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.netty.util.concurrent.ScheduledFuture r5 = r5.schedule(r2, r0, r3)
            r4.timeoutFuture = r5
        L44:
            return
    }

    private void sendQuery(io.netty.handler.codec.dns.DnsQuery r2, boolean r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            io.netty.util.concurrent.Future<io.netty.channel.Channel> r0 = r0.channelFuture
            boolean r0 = r0.isDone()
            if (r0 == 0) goto Le
            r1.writeQuery(r2, r3, r4)
            return
        Le:
            io.netty.resolver.dns.DnsNameResolver r3 = r1.parent
            io.netty.util.concurrent.Future<io.netty.channel.Channel> r3 = r3.channelFuture
            io.netty.resolver.dns.DnsQueryContext$2 r0 = new io.netty.resolver.dns.DnsQueryContext$2
            r0.<init>(r1, r2, r4)
            r3.addListener(r0)
            return
    }

    private void setFailure(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            java.net.InetSocketAddress r0 = r3.nameServerAddr()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r2 = r2 + 64
            r1.<init>(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "] "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (no stack trace available)"
            r1.append(r4)
            if (r5 != 0) goto L34
            io.netty.resolver.dns.DnsNameResolverTimeoutException r4 = new io.netty.resolver.dns.DnsNameResolverTimeoutException
            io.netty.handler.codec.dns.DnsQuestion r5 = r3.question()
            java.lang.String r1 = r1.toString()
            r4.<init>(r0, r5, r1)
            goto L41
        L34:
            io.netty.resolver.dns.DnsNameResolverException r4 = new io.netty.resolver.dns.DnsNameResolverException
            io.netty.handler.codec.dns.DnsQuestion r2 = r3.question()
            java.lang.String r1 = r1.toString()
            r4.<init>(r0, r2, r1, r5)
        L41:
            io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r5 = r3.promise
            r5.tryFailure(r4)
            return
    }

    private void setSuccess(io.netty.channel.AddressedEnvelope<? extends io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r3) {
            r2 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r0 = r2.promise
            io.netty.channel.AddressedEnvelope r1 = r3.retain()
            boolean r0 = r0.trySuccess(r1)
            if (r0 != 0) goto Lf
            r3.release()
        Lf:
            return
    }

    private void writeQuery(io.netty.handler.codec.dns.DnsQuery r1, boolean r2, io.netty.channel.ChannelPromise r3) {
            r0 = this;
            if (r2 == 0) goto Lb
            io.netty.channel.Channel r2 = r0.channel()
            io.netty.channel.ChannelFuture r1 = r2.writeAndFlush(r1, r3)
            goto L13
        Lb:
            io.netty.channel.Channel r2 = r0.channel()
            io.netty.channel.ChannelFuture r1 = r2.write(r1, r3)
        L13:
            boolean r2 = r1.isDone()
            if (r2 == 0) goto L1d
            r0.onQueryWriteCompletion(r1)
            return
        L1d:
            io.netty.resolver.dns.DnsQueryContext$3 r2 = new io.netty.resolver.dns.DnsQueryContext$3
            r2.<init>(r0, r1)
            r1.addListener(r2)
            return
    }

    protected abstract io.netty.channel.Channel channel();

    void finish(io.netty.channel.AddressedEnvelope<? extends io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r5) {
            r4 = this;
            java.lang.Object r0 = r5.content()
            io.netty.handler.codec.dns.DnsResponse r0 = (io.netty.handler.codec.dns.DnsResponse) r0
            io.netty.handler.codec.dns.DnsSection r1 = io.netty.handler.codec.dns.DnsSection.QUESTION
            int r2 = r0.count(r1)
            r3 = 1
            if (r2 == r3) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.DnsQueryContext.logger
            java.lang.String r1 = "Received a DNS response with invalid number of questions: {}"
            r0.warn(r1, r5)
            return
        L17:
            io.netty.handler.codec.dns.DnsQuestion r2 = r4.question()
            io.netty.handler.codec.dns.DnsRecord r0 = r0.recordAt(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2d
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.DnsQueryContext.logger
            java.lang.String r1 = "Received a mismatching DNS response: {}"
            r0.warn(r1, r5)
            return
        L2d:
            r4.setSuccess(r5)
            return
    }

    java.net.InetSocketAddress nameServerAddr() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.nameServerAddr
            return r0
    }

    protected abstract io.netty.handler.codec.dns.DnsQuery newQuery(int r1);

    @Override // io.netty.util.concurrent.GenericFutureListener
    public void operationComplete(io.netty.util.concurrent.Future<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> r3) {
            r2 = this;
            io.netty.util.concurrent.ScheduledFuture<?> r3 = r2.timeoutFuture
            if (r3 == 0) goto Lb
            r0 = 0
            r2.timeoutFuture = r0
            r0 = 0
            r3.cancel(r0)
        Lb:
            io.netty.resolver.dns.DnsNameResolver r3 = r2.parent
            io.netty.resolver.dns.DnsQueryContextManager r3 = r3.queryContextManager
            java.net.InetSocketAddress r0 = r2.nameServerAddr
            int r1 = r2.id
            r3.remove(r0, r1)
            return
    }

    io.netty.resolver.dns.DnsNameResolver parent() {
            r1 = this;
            io.netty.resolver.dns.DnsNameResolver r0 = r1.parent
            return r0
    }

    protected abstract java.lang.String protocol();

    void query(boolean r10, io.netty.channel.ChannelPromise r11) {
            r9 = this;
            io.netty.handler.codec.dns.DnsQuestion r0 = r9.question()
            java.net.InetSocketAddress r1 = r9.nameServerAddr()
            int r2 = r9.id
            io.netty.handler.codec.dns.DnsQuery r2 = r9.newQuery(r2)
            boolean r3 = r9.recursionDesired
            r2.setRecursionDesired(r3)
            io.netty.handler.codec.dns.DnsSection r3 = io.netty.handler.codec.dns.DnsSection.QUESTION
            r2.addRecord(r3, r0)
            io.netty.handler.codec.dns.DnsRecord[] r3 = r9.additionals
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L1d:
            if (r6 >= r4) goto L29
            r7 = r3[r6]
            io.netty.handler.codec.dns.DnsSection r8 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            r2.addRecord(r8, r7)
            int r6 = r6 + 1
            goto L1d
        L29:
            io.netty.handler.codec.dns.DnsRecord r3 = r9.optResource
            if (r3 == 0) goto L32
            io.netty.handler.codec.dns.DnsSection r4 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            r2.addRecord(r4, r3)
        L32:
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.resolver.dns.DnsQueryContext.logger
            boolean r4 = r3.isDebugEnabled()
            if (r4 == 0) goto L5e
            io.netty.channel.Channel r4 = r9.channel()
            java.lang.String r6 = r9.protocol()
            int r7 = r9.id
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r4
            r4 = 1
            r8[r4] = r6
            r4 = 2
            r8[r4] = r7
            r4 = 3
            r8[r4] = r1
            r1 = 4
            r8[r1] = r0
            java.lang.String r0 = "{} WRITE: {}, [{}: {}], {}"
            r3.debug(r0, r8)
        L5e:
            r9.sendQuery(r2, r10, r11)
            return
    }

    io.netty.handler.codec.dns.DnsQuestion question() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuestion r0 = r1.question
            return r0
    }
}

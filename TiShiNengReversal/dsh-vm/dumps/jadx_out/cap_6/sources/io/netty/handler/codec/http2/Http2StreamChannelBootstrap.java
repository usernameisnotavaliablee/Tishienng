package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2StreamChannelBootstrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> attrs;
    private final io.netty.channel.Channel channel;
    private volatile io.netty.channel.ChannelHandler handler;
    private volatile io.netty.channel.ChannelHandlerContext multiplexCtx;
    private final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> options;



    static {
            java.lang.Class<io.netty.handler.codec.http2.Http2StreamChannelBootstrap> r0 = io.netty.handler.codec.http2.Http2StreamChannelBootstrap.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.Http2StreamChannelBootstrap.logger = r0
            return
    }

    public Http2StreamChannelBootstrap(io.netty.channel.Channel r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.options = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.attrs = r0
            java.lang.String r0 = "channel"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            r1.channel = r2
            return
    }

    private io.netty.channel.ChannelHandlerContext findCtx() throws java.nio.channels.ClosedChannelException {
            r4 = this;
            io.netty.channel.ChannelHandlerContext r0 = r4.multiplexCtx
            if (r0 == 0) goto Lb
            boolean r1 = r0.isRemoved()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            io.netty.channel.Channel r0 = r4.channel
            io.netty.channel.ChannelPipeline r0 = r0.pipeline()
            java.lang.Class<io.netty.handler.codec.http2.Http2MultiplexCodec> r1 = io.netty.handler.codec.http2.Http2MultiplexCodec.class
            io.netty.channel.ChannelHandlerContext r2 = r0.context(r1)
            java.lang.Class<io.netty.handler.codec.http2.Http2MultiplexHandler> r3 = io.netty.handler.codec.http2.Http2MultiplexHandler.class
            if (r2 != 0) goto L1f
            io.netty.channel.ChannelHandlerContext r2 = r0.context(r3)
        L1f:
            if (r2 != 0) goto L5b
            io.netty.channel.Channel r0 = r4.channel
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L55
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r2.append(r1)
            java.lang.String r1 = " or "
            r2.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r2.append(r1)
            java.lang.String r1 = " must be in the ChannelPipeline of Channel "
            r2.append(r1)
            io.netty.channel.Channel r1 = r4.channel
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L55:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
            r0.<init>()
            throw r0
        L5b:
            r4.multiplexCtx = r2
            return r2
    }

    private void init(io.netty.channel.Channel r5) {
            r4 = this;
            io.netty.channel.ChannelPipeline r0 = r5.pipeline()
            io.netty.channel.ChannelHandler r1 = r4.handler
            if (r1 == 0) goto L11
            r2 = 1
            io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r2]
            r3 = 0
            r2[r3] = r1
            r0.addLast(r2)
        L11:
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r4.options
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r1 = r4.options     // Catch: java.lang.Throwable -> L4b
            setChannelOptions(r5, r1)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r1 = r4.attrs
            monitor-enter(r1)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r4.attrs     // Catch: java.lang.Throwable -> L45
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L45
        L27:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L45
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L45
            io.netty.util.AttributeKey r3 = (io.netty.util.AttributeKey) r3     // Catch: java.lang.Throwable -> L45
            io.netty.util.Attribute r3 = r5.attr(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L45
            r3.set(r2)     // Catch: java.lang.Throwable -> L45
            goto L27
        L45:
            r5 = move-exception
            goto L49
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r5
        L4b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r5
    }

    private static void setChannelOption(io.netty.channel.Channel r4, io.netty.channel.ChannelOption<?> r5, java.lang.Object r6) {
            io.netty.channel.ChannelConfig r0 = r4.config()     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.setOption(r5, r6)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.Http2StreamChannelBootstrap.logger     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Unknown channel option '{}' for channel '{}'"
            r0.warn(r1, r5, r4)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            goto L15
        L14:
            return
        L15:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.codec.http2.Http2StreamChannelBootstrap.logger
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r5 = 2
            r2[r5] = r4
            r4 = 3
            r2[r4] = r0
            java.lang.String r4 = "Failed to set channel option '{}' with value '{}' for channel '{}'"
            r1.warn(r4, r2)
            return
    }

    private static void setChannelOptions(io.netty.channel.Channel r2, java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r3) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            io.netty.channel.ChannelOption r1 = (io.netty.channel.ChannelOption) r1
            java.lang.Object r0 = r0.getValue()
            setChannelOption(r2, r1, r0)
            goto L8
        L22:
            return
    }

    public <T> io.netty.handler.codec.http2.Http2StreamChannelBootstrap attr(io.netty.util.AttributeKey<T> r3, T r4) {
            r2 = this;
            if (r3 == 0) goto L1e
            if (r4 != 0) goto L11
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r2.attrs
            monitor-enter(r0)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r4 = r2.attrs     // Catch: java.lang.Throwable -> Le
            r4.remove(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r2.attrs
            monitor-enter(r0)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r1 = r2.attrs     // Catch: java.lang.Throwable -> L1b
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L1e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key"
            r3.<init>(r4)
            throw r3
    }

    public io.netty.handler.codec.http2.Http2StreamChannelBootstrap handler(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            java.lang.String r0 = "handler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.ChannelHandler r2 = (io.netty.channel.ChannelHandler) r2
            r1.handler = r2
            return r1
    }

    public io.netty.util.concurrent.Future<io.netty.handler.codec.http2.Http2StreamChannel> open() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.EventLoop r0 = r0.eventLoop()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r0 = r1.open(r0)
            return r0
    }

    public io.netty.util.concurrent.Future<io.netty.handler.codec.http2.Http2StreamChannel> open(io.netty.util.concurrent.Promise<io.netty.handler.codec.http2.Http2StreamChannel> r4) {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.findCtx()     // Catch: java.lang.Throwable -> L12
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()     // Catch: java.lang.Throwable -> L12
            boolean r2 = r1.inEventLoop()     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L14
            r3.open0(r0, r4)     // Catch: java.lang.Throwable -> L12
            return r4
        L12:
            r0 = move-exception
            goto L1d
        L14:
            io.netty.handler.codec.http2.Http2StreamChannelBootstrap$1 r2 = new io.netty.handler.codec.http2.Http2StreamChannelBootstrap$1     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L12
            r1.execute(r2)     // Catch: java.lang.Throwable -> L12
            return r4
        L1d:
            r4.setFailure(r0)
            return r4
    }

    @java.lang.Deprecated
    public void open0(io.netty.channel.ChannelHandlerContext r3, io.netty.util.concurrent.Promise<io.netty.handler.codec.http2.Http2StreamChannel> r4) {
            r2 = this;
            io.netty.channel.ChannelHandler r0 = r3.handler()
            boolean r0 = r0 instanceof io.netty.handler.codec.http2.Http2MultiplexCodec
            if (r0 == 0) goto L13
            io.netty.channel.ChannelHandler r0 = r3.handler()
            io.netty.handler.codec.http2.Http2MultiplexCodec r0 = (io.netty.handler.codec.http2.Http2MultiplexCodec) r0
            io.netty.handler.codec.http2.Http2StreamChannel r0 = r0.newOutboundStream()
            goto L1d
        L13:
            io.netty.channel.ChannelHandler r0 = r3.handler()
            io.netty.handler.codec.http2.Http2MultiplexHandler r0 = (io.netty.handler.codec.http2.Http2MultiplexHandler) r0
            io.netty.handler.codec.http2.Http2StreamChannel r0 = r0.newOutboundStream()
        L1d:
            r2.init(r0)     // Catch: java.lang.Exception -> L35
            io.netty.channel.Channel r3 = r3.channel()
            io.netty.channel.EventLoop r3 = r3.eventLoop()
            io.netty.channel.ChannelFuture r3 = r3.register(r0)
            io.netty.handler.codec.http2.Http2StreamChannelBootstrap$2 r1 = new io.netty.handler.codec.http2.Http2StreamChannelBootstrap$2
            r1.<init>(r2, r4, r0)
            r3.addListener(r1)
            return
        L35:
            r3 = move-exception
            io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
            r0.closeForcibly()
            r4.setFailure(r3)
            return
    }

    public <T> io.netty.handler.codec.http2.Http2StreamChannelBootstrap option(io.netty.channel.ChannelOption<T> r3, T r4) {
            r2 = this;
            if (r3 == 0) goto L1e
            if (r4 != 0) goto L11
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r2.options
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r4 = r2.options     // Catch: java.lang.Throwable -> Le
            r4.remove(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r2.options
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r1 = r2.options     // Catch: java.lang.Throwable -> L1b
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L1e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "option"
            r3.<init>(r4)
            throw r3
    }
}

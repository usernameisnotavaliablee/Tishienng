package io.netty.handler.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LoggingHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final io.netty.handler.logging.LogLevel DEFAULT_LEVEL = null;
    protected final io.netty.util.internal.logging.InternalLogLevel internalLevel;
    private final io.netty.handler.logging.LogLevel level;
    protected final io.netty.util.internal.logging.InternalLogger logger;

    static {
            io.netty.handler.logging.LogLevel r0 = io.netty.handler.logging.LogLevel.DEBUG
            io.netty.handler.logging.LoggingHandler.DEFAULT_LEVEL = r0
            return
    }

    public LoggingHandler() {
            r1 = this;
            io.netty.handler.logging.LogLevel r0 = io.netty.handler.logging.LoggingHandler.DEFAULT_LEVEL
            r1.<init>(r0)
            return
    }

    public LoggingHandler(io.netty.handler.logging.LogLevel r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L18
            java.lang.Class r0 = r1.getClass()
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            r1.logger = r0
            r1.level = r2
            io.netty.util.internal.logging.InternalLogLevel r2 = r2.toInternalLevel()
            r1.internalLevel = r2
            return
        L18:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "level"
            r2.<init>(r0)
            throw r2
    }

    public LoggingHandler(java.lang.Class<?> r2) {
            r1 = this;
            io.netty.handler.logging.LogLevel r0 = io.netty.handler.logging.LoggingHandler.DEFAULT_LEVEL
            r1.<init>(r2, r0)
            return
    }

    public LoggingHandler(java.lang.Class<?> r1, io.netty.handler.logging.LogLevel r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1e
            if (r2 == 0) goto L16
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r1)
            r0.logger = r1
            r0.level = r2
            io.netty.util.internal.logging.InternalLogLevel r1 = r2.toInternalLevel()
            r0.internalLevel = r1
            return
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "level"
            r1.<init>(r2)
            throw r1
        L1e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "clazz"
            r1.<init>(r2)
            throw r1
    }

    public LoggingHandler(java.lang.String r2) {
            r1 = this;
            io.netty.handler.logging.LogLevel r0 = io.netty.handler.logging.LoggingHandler.DEFAULT_LEVEL
            r1.<init>(r2, r0)
            return
    }

    public LoggingHandler(java.lang.String r1, io.netty.handler.logging.LogLevel r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L1e
            if (r2 == 0) goto L16
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r1)
            r0.logger = r1
            r0.level = r2
            io.netty.util.internal.logging.InternalLogLevel r1 = r2.toInternalLevel()
            r0.internalLevel = r1
            return
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "level"
            r1.<init>(r2)
            throw r1
        L1e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "name"
            r1.<init>(r2)
            throw r1
    }

    private static java.lang.String formatByteBuf(io.netty.channel.ChannelHandlerContext r6, java.lang.String r7, io.netty.buffer.ByteBuf r8) {
            io.netty.channel.Channel r6 = r6.channel()
            java.lang.String r6 = r6.toString()
            int r0 = r8.readableBytes()
            r1 = 32
            r2 = 1
            if (r0 != 0) goto L35
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r0 = r6.length()
            int r0 = r0 + r2
            int r2 = r7.length()
            int r0 = r0 + r2
            int r0 = r0 + 4
            r8.<init>(r0)
            r8.append(r6)
            r8.append(r1)
            r8.append(r7)
            java.lang.String r6 = ": 0B"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            return r6
        L35:
            int r3 = r0 / 16
            int r4 = r0 % 15
            if (r4 != 0) goto L3d
            r4 = 0
            goto L3e
        L3d:
            r4 = 1
        L3e:
            int r3 = r3 + r4
            int r3 = r3 + 4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r5 = r6.length()
            int r5 = r5 + r2
            int r2 = r7.length()
            int r5 = r5 + r2
            int r5 = r5 + 15
            int r3 = r3 * 80
            int r5 = r5 + r3
            r4.<init>(r5)
            r4.append(r6)
            r4.append(r1)
            r4.append(r7)
            java.lang.String r6 = ": "
            r4.append(r6)
            r4.append(r0)
            r6 = 66
            r4.append(r6)
            java.lang.String r6 = io.netty.util.internal.StringUtil.NEWLINE
            r4.append(r6)
            io.netty.buffer.ByteBufUtil.appendPrettyHexDump(r4, r8)
            java.lang.String r6 = r4.toString()
            return r6
    }

    private static java.lang.String formatByteBufHolder(io.netty.channel.ChannelHandlerContext r8, java.lang.String r9, io.netty.buffer.ByteBufHolder r10) {
            io.netty.channel.Channel r8 = r8.channel()
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = r10.toString()
            io.netty.buffer.ByteBuf r10 = r10.content()
            int r1 = r10.readableBytes()
            java.lang.String r2 = ", "
            r3 = 32
            r4 = 1
            if (r1 != 0) goto L4c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r1 = r8.length()
            int r1 = r1 + r4
            int r4 = r9.length()
            int r1 = r1 + r4
            int r1 = r1 + 2
            int r4 = r0.length()
            int r1 = r1 + r4
            int r1 = r1 + 4
            r10.<init>(r1)
            r10.append(r8)
            r10.append(r3)
            r10.append(r9)
            r10.append(r2)
            r10.append(r0)
            java.lang.String r8 = ", 0B"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            return r8
        L4c:
            int r5 = r1 / 16
            int r6 = r1 % 15
            if (r6 != 0) goto L54
            r6 = 0
            goto L55
        L54:
            r6 = 1
        L55:
            int r5 = r5 + r6
            int r5 = r5 + 4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r7 = r8.length()
            int r7 = r7 + r4
            int r4 = r9.length()
            int r7 = r7 + r4
            int r7 = r7 + 2
            int r4 = r0.length()
            int r7 = r7 + r4
            int r7 = r7 + 15
            int r5 = r5 * 80
            int r7 = r7 + r5
            r6.<init>(r7)
            r6.append(r8)
            r6.append(r3)
            r6.append(r9)
            java.lang.String r8 = ": "
            r6.append(r8)
            r6.append(r0)
            r6.append(r2)
            r6.append(r1)
            r8 = 66
            r6.append(r8)
            java.lang.String r8 = io.netty.util.internal.StringUtil.NEWLINE
            r6.append(r8)
            io.netty.buffer.ByteBufUtil.appendPrettyHexDump(r6, r10)
            java.lang.String r8 = r6.toString()
            return r8
    }

    private static java.lang.String formatSimple(io.netty.channel.ChannelHandlerContext r3, java.lang.String r4, java.lang.Object r5) {
            io.netty.channel.Channel r3 = r3.channel()
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 + 1
            int r2 = r4.length()
            int r1 = r1 + r2
            int r1 = r1 + 2
            int r2 = r5.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r4, java.net.SocketAddress r5, io.netty.channel.ChannelPromise r6) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "BIND"
            java.lang.String r2 = r3.format(r4, r2, r5)
            r0.log(r1, r2)
        L17:
            r4.bind(r5, r6)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "ACTIVE"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.fireChannelActive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "INACTIVE"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.fireChannelInactive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "READ"
            java.lang.String r2 = r3.format(r4, r2, r5)
            r0.log(r1, r2)
        L17:
            r4.fireChannelRead(r5)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "READ COMPLETE"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "REGISTERED"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.fireChannelRegistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelUnregistered(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "UNREGISTERED"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.fireChannelUnregistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "WRITABILITY CHANGED"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.fireChannelWritabilityChanged()
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "CLOSE"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.close(r5)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r4, java.net.SocketAddress r5, java.net.SocketAddress r6, io.netty.channel.ChannelPromise r7) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "CONNECT"
            java.lang.String r2 = r3.format(r4, r2, r5, r6)
            r0.log(r1, r2)
        L17:
            r4.connect(r5, r6, r7)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void deregister(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "DEREGISTER"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.deregister(r5)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "DISCONNECT"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.disconnect(r5)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "EXCEPTION"
            java.lang.String r2 = r3.format(r4, r2, r5)
            r0.log(r1, r2, r5)
        L17:
            r4.fireExceptionCaught(r5)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "FLUSH"
            java.lang.String r2 = r3.format(r4, r2)
            r0.log(r1, r2)
        L17:
            r4.flush()
            return
    }

    protected java.lang.String format(io.netty.channel.ChannelHandlerContext r4, java.lang.String r5) {
            r3 = this;
            io.netty.channel.Channel r4 = r4.channel()
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 1
            int r2 = r5.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.append(r4)
            r4 = 32
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            return r4
    }

    protected java.lang.String format(io.netty.channel.ChannelHandlerContext r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            java.lang.String r2 = formatByteBuf(r2, r3, r4)
            return r2
        Lb:
            boolean r0 = r4 instanceof io.netty.buffer.ByteBufHolder
            if (r0 == 0) goto L16
            io.netty.buffer.ByteBufHolder r4 = (io.netty.buffer.ByteBufHolder) r4
            java.lang.String r2 = formatByteBufHolder(r2, r3, r4)
            return r2
        L16:
            java.lang.String r2 = formatSimple(r2, r3, r4)
            return r2
    }

    protected java.lang.String format(io.netty.channel.ChannelHandlerContext r4, java.lang.String r5, java.lang.Object r6, java.lang.Object r7) {
            r3 = this;
            if (r7 != 0) goto L7
            java.lang.String r4 = formatSimple(r4, r5, r6)
            return r4
        L7:
            io.netty.channel.Channel r4 = r4.channel()
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 1
            int r2 = r5.length()
            int r1 = r1 + r2
            int r1 = r1 + 2
            int r2 = r6.length()
            int r1 = r1 + r2
            int r1 = r1 + 2
            int r2 = r7.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.append(r4)
            r4 = 32
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ": "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public io.netty.handler.logging.LogLevel level() {
            r1 = this;
            io.netty.handler.logging.LogLevel r0 = r1.level
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "USER_EVENT"
            java.lang.String r2 = r3.format(r4, r2, r5)
            r0.log(r1, r2)
        L17:
            r4.fireUserEventTriggered(r5)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5, io.netty.channel.ChannelPromise r6) throws java.lang.Exception {
            r3 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto L17
            io.netty.util.internal.logging.InternalLogger r0 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r3.internalLevel
            java.lang.String r2 = "WRITE"
            java.lang.String r2 = r3.format(r4, r2, r5)
            r0.log(r1, r2)
        L17:
            r4.write(r5, r6)
            return
    }
}

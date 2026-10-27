package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractSniHandler<T> extends io.netty.handler.codec.ByteToMessageDecoder implements io.netty.channel.ChannelOutboundHandler {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private boolean handshakeFailed;
    private boolean readPending;
    private boolean suppressRead;


    static {
            java.lang.Class<io.netty.handler.ssl.AbstractSniHandler> r0 = io.netty.handler.ssl.AbstractSniHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.AbstractSniHandler.logger = r0
            return
    }

    public AbstractSniHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$002(io.netty.handler.ssl.AbstractSniHandler r0, boolean r1) {
            r0.suppressRead = r1
            return r1
    }

    static /* synthetic */ void access$100(io.netty.handler.ssl.AbstractSniHandler r0, io.netty.channel.ChannelHandlerContext r1, java.lang.String r2, io.netty.util.concurrent.Future r3) {
            r0.fireSniCompletionEvent(r1, r2, r3)
            return
    }

    static /* synthetic */ boolean access$200(io.netty.handler.ssl.AbstractSniHandler r0) {
            boolean r0 = r0.readPending
            return r0
    }

    static /* synthetic */ boolean access$202(io.netty.handler.ssl.AbstractSniHandler r0, boolean r1) {
            r0.readPending = r1
            return r1
    }

    private void fireSniCompletionEvent(io.netty.channel.ChannelHandlerContext r2, java.lang.String r3, io.netty.util.concurrent.Future<T> r4) {
            r1 = this;
            java.lang.Throwable r4 = r4.cause()
            if (r4 != 0) goto Lf
            io.netty.handler.ssl.SniCompletionEvent r4 = new io.netty.handler.ssl.SniCompletionEvent
            r4.<init>(r3)
            r2.fireUserEventTriggered(r4)
            return
        Lf:
            io.netty.handler.ssl.SniCompletionEvent r0 = new io.netty.handler.ssl.SniCompletionEvent
            r0.<init>(r3, r4)
            r2.fireUserEventTriggered(r0)
            return
    }

    private void select(io.netty.channel.ChannelHandlerContext r3, java.lang.String r4) throws java.lang.Exception {
            r2 = this;
            io.netty.util.concurrent.Future r0 = r2.lookup(r3, r4)
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L11
            r2.fireSniCompletionEvent(r3, r4, r0)
            r2.onLookupComplete(r3, r4, r0)
            return
        L11:
            r1 = 1
            r2.suppressRead = r1
            io.netty.handler.ssl.AbstractSniHandler$1 r1 = new io.netty.handler.ssl.AbstractSniHandler$1
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r0 = this;
            r1.bind(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.close(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r0 = this;
            r1.connect(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r6 = this;
            boolean r9 = r6.suppressRead
            if (r9 != 0) goto L107
            boolean r9 = r6.handshakeFailed
            if (r9 != 0) goto L107
            int r9 = r8.readerIndex()     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r0 = r8.readableBytes()     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r1 = 5
            if (r0 >= r1) goto L15
            goto L107
        L15:
            short r2 = r8.getUnsignedByte(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r3 = 1
            switch(r2) {
                case 20: goto La7;
                case 21: goto La7;
                case 22: goto L1f;
                default: goto L1d;
            }     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
        L1d:
            goto L101
        L1f:
            int r2 = r9 + 1
            short r2 = r8.getUnsignedByte(r2)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r4 = 3
            if (r2 != r4) goto L101
            int r2 = r9 + 3
            int r2 = r8.getUnsignedShort(r2)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r2 = r2 + r1
            if (r0 >= r2) goto L33
            goto L107
        L33:
            int r2 = r2 + r9
            int r9 = r9 + 43
            int r0 = r2 - r9
            r1 = 6
            if (r0 < r1) goto L101
            short r0 = r8.getUnsignedByte(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r0 = r0 + r3
            int r9 = r9 + r0
            int r0 = r8.getUnsignedShort(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r0 = r0 + 2
            int r9 = r9 + r0
            short r0 = r8.getUnsignedByte(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r0 = r0 + r3
            int r9 = r9 + r0
            int r0 = r8.getUnsignedShort(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r9 = r9 + 2
            int r0 = r0 + r9
            if (r0 > r2) goto L101
        L57:
            int r1 = r0 - r9
            r2 = 4
            if (r1 < r2) goto L101
            int r1 = r8.getUnsignedShort(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r2 = r9 + 2
            int r2 = r8.getUnsignedShort(r2)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r3 = r9 + 4
            int r5 = r0 - r3
            if (r5 >= r2) goto L6e
            goto L101
        L6e:
            if (r1 != 0) goto La4
            int r1 = r9 + 6
            int r2 = r0 - r1
            if (r2 >= r4) goto L78
            goto L101
        L78:
            short r1 = r8.getUnsignedByte(r1)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r2 = r9 + 7
            if (r1 != 0) goto L101
            int r1 = r8.getUnsignedShort(r2)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r9 = r9 + 9
            int r0 = r0 - r9
            if (r0 >= r1) goto L8b
            goto L101
        L8b:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            java.lang.String r9 = r8.toString(r9, r1, r0)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = r9.toLowerCase(r0)     // Catch: java.lang.Throwable -> L9b
            r6.select(r7, r9)     // Catch: java.lang.Throwable -> L9b
            return
        L9b:
            r9 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            goto L107
        La0:
            r9 = move-exception
            goto Le1
        La2:
            r7 = move-exception
            goto L106
        La4:
            int r9 = r3 + r2
            goto L57
        La7:
            int r9 = io.netty.handler.ssl.SslUtils.getEncryptedPacketLength(r8, r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r0 = -2
            if (r9 == r0) goto Lb2
            r8 = -1
            if (r9 != r8) goto L101
            goto L107
        Lb2:
            r6.handshakeFailed = r3     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            io.netty.handler.ssl.NotSslRecordException r9 = new io.netty.handler.ssl.NotSslRecordException     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r0.<init>()     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            java.lang.String r1 = "not an SSL/TLS record: "
            r0.append(r1)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            java.lang.String r1 = io.netty.buffer.ByteBufUtil.hexDump(r8)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r0.append(r1)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r9.<init>(r0)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            int r0 = r8.readableBytes()     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r8.skipBytes(r0)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            io.netty.handler.ssl.SniCompletionEvent r0 = new io.netty.handler.ssl.SniCompletionEvent     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r0.<init>(r9)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            r7.fireUserEventTriggered(r0)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            io.netty.handler.ssl.SslUtils.handleHandshakeFailure(r7, r9, r3)     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
            throw r9     // Catch: java.lang.Exception -> La0 io.netty.handler.ssl.NotSslRecordException -> La2
        Le1:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.AbstractSniHandler.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected client hello packet: "
            r1.append(r2)
            java.lang.String r8 = io.netty.buffer.ByteBufUtil.hexDump(r8)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.debug(r8, r9)
        L101:
            r8 = 0
            r6.select(r7, r8)
            return
        L106:
            throw r7
        L107:
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void deregister(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.deregister(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.disconnect(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.flush()
            return
    }

    protected abstract io.netty.util.concurrent.Future<T> lookup(io.netty.channel.ChannelHandlerContext r1, java.lang.String r2) throws java.lang.Exception;

    protected abstract void onLookupComplete(io.netty.channel.ChannelHandlerContext r1, java.lang.String r2, io.netty.util.concurrent.Future<T> r3) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.suppressRead
            if (r0 == 0) goto L8
            r2 = 1
            r1.readPending = r2
            return
        L8:
            r2.read()
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r0 = this;
            r1.write(r2, r3)
            return
    }
}

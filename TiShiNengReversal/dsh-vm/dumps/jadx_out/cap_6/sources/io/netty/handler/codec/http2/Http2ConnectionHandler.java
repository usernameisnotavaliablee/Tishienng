package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2ConnectionHandler extends io.netty.handler.codec.ByteToMessageDecoder implements io.netty.handler.codec.http2.Http2LifecycleManager, io.netty.channel.ChannelOutboundHandler {
    private static final io.netty.handler.codec.http2.Http2Headers HEADERS_TOO_LARGE_HEADERS = null;
    private static final io.netty.buffer.ByteBuf HTTP_1_X_BUF = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder byteDecoder;
    private io.netty.channel.ChannelFutureListener closeListener;
    private final io.netty.handler.codec.http2.Http2ConnectionDecoder decoder;
    private final boolean decoupleCloseAndGoAway;
    private final io.netty.handler.codec.http2.Http2ConnectionEncoder encoder;
    private long gracefulShutdownTimeoutMillis;
    private final io.netty.handler.codec.http2.Http2Settings initialSettings;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.Http2ConnectionHandler$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass6.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass6.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass6.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class BaseDecoder {
        final /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionHandler this$0;

        private BaseDecoder(io.netty.handler.codec.http2.Http2ConnectionHandler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ BaseDecoder(io.netty.handler.codec.http2.Http2ConnectionHandler r1, io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void channelActive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        public void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
                r1 = this;
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r1.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r0.encoder()
                r0.close()
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r1.this$0
                io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r0.decoder()
                r0.close()
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r1.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
                io.netty.channel.ChannelPromise r2 = r2.voidPromise()
                r0.close(r2)
                return
        }

        public abstract void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception;

        public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        public boolean prefaceSent() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ClosingChannelFutureListener implements io.netty.channel.ChannelFutureListener {
        private final io.netty.channel.ChannelHandlerContext ctx;
        private final io.netty.channel.ChannelPromise promise;
        private final io.netty.util.concurrent.ScheduledFuture<?> timeoutTask;


        ClosingChannelFutureListener(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                r0.promise = r2
                r1 = 0
                r0.timeoutTask = r1
                return
        }

        ClosingChannelFutureListener(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2, long r3, java.util.concurrent.TimeUnit r5) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                r0.promise = r2
                io.netty.util.concurrent.EventExecutor r1 = r1.executor()
                io.netty.handler.codec.http2.Http2ConnectionHandler$ClosingChannelFutureListener$1 r2 = new io.netty.handler.codec.http2.Http2ConnectionHandler$ClosingChannelFutureListener$1
                r2.<init>(r0)
                io.netty.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
                r0.timeoutTask = r1
                return
        }

        static /* synthetic */ void access$1200(io.netty.handler.codec.http2.Http2ConnectionHandler.ClosingChannelFutureListener r0) {
                r0.doClose()
                return
        }

        private void doClose() {
                r2 = this;
                io.netty.channel.ChannelPromise r0 = r2.promise
                if (r0 != 0) goto La
                io.netty.channel.ChannelHandlerContext r0 = r2.ctx
                r0.close()
                return
            La:
                io.netty.channel.ChannelHandlerContext r1 = r2.ctx
                r1.close(r0)
                return
        }

        public void operationComplete(io.netty.channel.ChannelFuture r2) {
                r1 = this;
                io.netty.util.concurrent.ScheduledFuture<?> r2 = r1.timeoutTask
                if (r2 == 0) goto L8
                r0 = 0
                r2.cancel(r0)
            L8:
                r1.doClose()
                return
        }

        public /* bridge */ /* synthetic */ void operationComplete(io.netty.util.concurrent.Future r1) throws java.lang.Exception {
                r0 = this;
                io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1
                r0.operationComplete(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FrameDecoder extends io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder {
        final /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionHandler this$0;

        private FrameDecoder(io.netty.handler.codec.http2.Http2ConnectionHandler r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ FrameDecoder(io.netty.handler.codec.http2.Http2ConnectionHandler r1, io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder
        public void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
                r1 = this;
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r1.this$0     // Catch: java.lang.Throwable -> La
                io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$700(r0)     // Catch: java.lang.Throwable -> La
                r0.decodeFrame(r2, r3, r4)     // Catch: java.lang.Throwable -> La
                return
            La:
                r3 = move-exception
                io.netty.handler.codec.http2.Http2ConnectionHandler r4 = r1.this$0
                r0 = 0
                r4.onError(r2, r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PrefaceDecoder extends io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder {
        private io.netty.buffer.ByteBuf clientPrefaceString;
        private boolean prefaceSent;
        final /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionHandler this$0;

        PrefaceDecoder(io.netty.handler.codec.http2.Http2ConnectionHandler r2, io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                io.netty.handler.codec.http2.Http2ConnectionEncoder r2 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$100(r2)
                io.netty.handler.codec.http2.Http2Connection r2 = r2.connection()
                io.netty.buffer.ByteBuf r2 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$200(r2)
                r1.clientPrefaceString = r2
                r1.sendPreface(r3)
                return
        }

        private void cleanup() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.clientPrefaceString
                if (r0 == 0) goto La
                r0.release()
                r0 = 0
                r1.clientPrefaceString = r0
            La:
                return
        }

        private boolean readClientPrefaceString(io.netty.buffer.ByteBuf r7) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                io.netty.buffer.ByteBuf r0 = r6.clientPrefaceString
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.readableBytes()
                int r2 = r7.readableBytes()
                int r0 = java.lang.Math.min(r2, r0)
                r2 = 0
                if (r0 == 0) goto L40
                int r3 = r7.readerIndex()
                io.netty.buffer.ByteBuf r4 = r6.clientPrefaceString
                int r5 = r4.readerIndex()
                boolean r3 = io.netty.buffer.ByteBufUtil.equals(r7, r3, r4, r5, r0)
                if (r3 != 0) goto L26
                goto L40
            L26:
                r7.skipBytes(r0)
                io.netty.buffer.ByteBuf r7 = r6.clientPrefaceString
                r7.skipBytes(r0)
                io.netty.buffer.ByteBuf r7 = r6.clientPrefaceString
                boolean r7 = r7.isReadable()
                if (r7 != 0) goto L3f
                io.netty.buffer.ByteBuf r7 = r6.clientPrefaceString
                r7.release()
                r7 = 0
                r6.clientPrefaceString = r7
                return r1
            L3f:
                return r2
            L40:
                io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$500()
                int r3 = r7.readerIndex()
                int r4 = r7.readableBytes()
                r5 = 1024(0x400, float:1.435E-42)
                int r4 = java.lang.Math.min(r4, r5)
                io.netty.buffer.ByteBuf r3 = r7.slice(r3, r4)
                int r0 = io.netty.buffer.ByteBufUtil.indexOf(r0, r3)
                r3 = -1
                if (r0 == r3) goto L79
                int r3 = r7.readerIndex()
                int r4 = r7.readerIndex()
                int r0 = r0 - r4
                java.nio.charset.Charset r4 = io.netty.util.CharsetUtil.US_ASCII
                java.lang.String r7 = r7.toString(r3, r0, r4)
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r7
                java.lang.String r7 = "Unexpected HTTP/1.x request: %s"
                io.netty.handler.codec.http2.Http2Exception r7 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r7, r1)
                throw r7
            L79:
                int r0 = r7.readerIndex()
                int r3 = r7.readableBytes()
                io.netty.buffer.ByteBuf r4 = r6.clientPrefaceString
                int r4 = r4.readableBytes()
                int r3 = java.lang.Math.min(r3, r4)
                java.lang.String r7 = io.netty.buffer.ByteBufUtil.hexDump(r7, r0, r3)
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r7
                java.lang.String r7 = "HTTP/2 client preface string missing or corrupt. Hex dump for received bytes: %s"
                io.netty.handler.codec.http2.Http2Exception r7 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r7, r1)
                throw r7
        }

        private void sendPreface(io.netty.channel.ChannelHandlerContext r5) throws java.lang.Exception {
                r4 = this;
                boolean r0 = r4.prefaceSent
                if (r0 != 0) goto L4d
                io.netty.channel.Channel r0 = r5.channel()
                boolean r0 = r0.isActive()
                if (r0 != 0) goto Lf
                goto L4d
            Lf:
                r0 = 1
                r4.prefaceSent = r0
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r4.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
                boolean r0 = r0.isServer()
                if (r0 != 0) goto L2b
                io.netty.buffer.ByteBuf r1 = io.netty.handler.codec.http2.Http2CodecUtil.connectionPrefaceBuf()
                io.netty.channel.ChannelFuture r1 = r5.write(r1)
                io.netty.channel.ChannelFutureListener r2 = io.netty.channel.ChannelFutureListener.CLOSE_ON_FAILURE
                r1.addListener(r2)
            L2b:
                io.netty.handler.codec.http2.Http2ConnectionHandler r1 = r4.this$0
                io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$100(r1)
                io.netty.handler.codec.http2.Http2ConnectionHandler r2 = r4.this$0
                io.netty.handler.codec.http2.Http2Settings r2 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$600(r2)
                io.netty.channel.ChannelPromise r3 = r5.newPromise()
                io.netty.channel.ChannelFuture r1 = r1.writeSettings(r5, r2, r3)
                io.netty.channel.ChannelFutureListener r2 = io.netty.channel.ChannelFutureListener.CLOSE_ON_FAILURE
                r1.addListener(r2)
                if (r0 != 0) goto L4d
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r4.this$0
                io.netty.handler.codec.http2.Http2ConnectionPrefaceAndSettingsFrameWrittenEvent r1 = io.netty.handler.codec.http2.Http2ConnectionPrefaceAndSettingsFrameWrittenEvent.INSTANCE
                r0.userEventTriggered(r5, r1)
            L4d:
                return
        }

        private boolean verifyFirstFrameIsSettings(io.netty.buffer.ByteBuf r7) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                int r0 = r7.readableBytes()
                r1 = 0
                r2 = 5
                if (r0 >= r2) goto L9
                return r1
            L9:
                int r0 = r7.readerIndex()
                int r0 = r0 + 3
                short r0 = r7.getUnsignedByte(r0)
                int r3 = r7.readerIndex()
                r4 = 4
                int r3 = r3 + r4
                short r3 = r7.getUnsignedByte(r3)
                r5 = 1
                if (r0 != r4) goto L25
                r0 = r3 & 1
                if (r0 != 0) goto L25
                return r5
            L25:
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                int r3 = r7.readerIndex()
                java.lang.String r7 = io.netty.buffer.ByteBufUtil.hexDump(r7, r3, r2)
                java.lang.Object[] r2 = new java.lang.Object[r5]
                r2[r1] = r7
                java.lang.String r7 = "First received frame was not SETTINGS. Hex dump for first 5 bytes: %s"
                io.netty.handler.codec.http2.Http2Exception r7 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r7, r2)
                throw r7
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder
        public void channelActive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
                r0 = this;
                r0.sendPreface(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder
        public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
                r0 = this;
                r0.cleanup()
                super.channelInactive(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder
        public void decode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
                r3 = this;
                io.netty.channel.Channel r0 = r4.channel()     // Catch: java.lang.Throwable -> L2b
                boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L2b
                if (r0 == 0) goto L2d
                boolean r0 = r3.readClientPrefaceString(r5)     // Catch: java.lang.Throwable -> L2b
                if (r0 == 0) goto L2d
                boolean r0 = r3.verifyFirstFrameIsSettings(r5)     // Catch: java.lang.Throwable -> L2b
                if (r0 == 0) goto L2d
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L2b
                io.netty.handler.codec.http2.Http2ConnectionHandler$FrameDecoder r1 = new io.netty.handler.codec.http2.Http2ConnectionHandler$FrameDecoder     // Catch: java.lang.Throwable -> L2b
                r2 = 0
                r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L2b
                io.netty.handler.codec.http2.Http2ConnectionHandler.access$302(r0, r1)     // Catch: java.lang.Throwable -> L2b
                io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L2b
                io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.access$300(r0)     // Catch: java.lang.Throwable -> L2b
                r0.decode(r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
                return
            L2b:
                r5 = move-exception
                goto L2e
            L2d:
                return
            L2e:
                io.netty.handler.codec.http2.Http2ConnectionHandler r6 = r3.this$0
                r0 = 0
                r6.onError(r4, r0, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder
        public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
                r0 = this;
                r0.cleanup()
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder
        public boolean prefaceSent() {
                r1 = this;
                boolean r0 = r1.prefaceSent
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http2.Http2ConnectionHandler> r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.Http2ConnectionHandler.logger = r0
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE
            io.netty.util.AsciiString r0 = r0.codeAsText()
            r1 = 0
            io.netty.util.AsciiString[] r2 = new io.netty.util.AsciiString[r1]
            io.netty.handler.codec.http2.ReadOnlyHttp2Headers r0 = io.netty.handler.codec.http2.ReadOnlyHttp2Headers.serverHeaders(r1, r0, r2)
            io.netty.handler.codec.http2.Http2ConnectionHandler.HEADERS_TOO_LARGE_HEADERS = r0
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [72, 84, 84, 80, 47, 49, 46} // fill-array
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.buffer.ByteBuf r0 = r0.asReadOnly()
            io.netty.handler.codec.http2.Http2ConnectionHandler.HTTP_1_X_BUF = r0
            return
    }

    protected Http2ConnectionHandler(io.netty.handler.codec.http2.Http2ConnectionDecoder r2, io.netty.handler.codec.http2.Http2ConnectionEncoder r3, io.netty.handler.codec.http2.Http2Settings r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    protected Http2ConnectionHandler(io.netty.handler.codec.http2.Http2ConnectionDecoder r2, io.netty.handler.codec.http2.Http2ConnectionEncoder r3, io.netty.handler.codec.http2.Http2Settings r4, boolean r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "initialSettings"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.handler.codec.http2.Http2Settings r4 = (io.netty.handler.codec.http2.Http2Settings) r4
            r1.initialSettings = r4
            java.lang.String r4 = "decoder"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r4)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r4 = (io.netty.handler.codec.http2.Http2ConnectionDecoder) r4
            r1.decoder = r4
            java.lang.String r4 = "encoder"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r4)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r4 = (io.netty.handler.codec.http2.Http2ConnectionEncoder) r4
            r1.encoder = r4
            r1.decoupleCloseAndGoAway = r5
            io.netty.handler.codec.http2.Http2Connection r3 = r3.connection()
            io.netty.handler.codec.http2.Http2Connection r2 = r2.connection()
            if (r3 != r2) goto L2e
            return
        L2e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Encoder and Decoder do not share the same connection object"
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionEncoder access$100(io.netty.handler.codec.http2.Http2ConnectionHandler r0) {
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r0.encoder
            return r0
    }

    static /* synthetic */ void access$1000(io.netty.handler.codec.http2.Http2ConnectionHandler r0, io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2Stream r2, io.netty.channel.ChannelFuture r3) {
            r0.processRstStreamWriteResult(r1, r2, r3)
            return
    }

    static /* synthetic */ void access$1100(io.netty.channel.ChannelHandlerContext r0, int r1, long r2, io.netty.buffer.ByteBuf r4, io.netty.channel.ChannelFuture r5) {
            processGoAwayWriteResult(r0, r1, r2, r4, r5)
            return
    }

    static /* synthetic */ io.netty.buffer.ByteBuf access$200(io.netty.handler.codec.http2.Http2Connection r0) {
            io.netty.buffer.ByteBuf r0 = clientPrefaceString(r0)
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder access$300(io.netty.handler.codec.http2.Http2ConnectionHandler r0) {
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r0.byteDecoder
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder access$302(io.netty.handler.codec.http2.Http2ConnectionHandler r0, io.netty.handler.codec.http2.Http2ConnectionHandler.BaseDecoder r1) {
            r0.byteDecoder = r1
            return r1
    }

    static /* synthetic */ io.netty.buffer.ByteBuf access$500() {
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.HTTP_1_X_BUF
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Settings access$600(io.netty.handler.codec.http2.Http2ConnectionHandler r0) {
            io.netty.handler.codec.http2.Http2Settings r0 = r0.initialSettings
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2ConnectionDecoder access$700(io.netty.handler.codec.http2.Http2ConnectionHandler r0) {
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r0.decoder
            return r0
    }

    static /* synthetic */ void access$800(io.netty.handler.codec.http2.Http2ConnectionHandler r0, io.netty.channel.ChannelFuture r1) {
            r0.checkCloseConnection(r1)
            return
    }

    static /* synthetic */ void access$900(io.netty.handler.codec.http2.Http2ConnectionHandler r0, io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelFuture r2) {
            r0.closeConnectionOnError(r1, r2)
            return
    }

    private void checkCloseConnection(io.netty.channel.ChannelFuture r3) {
            r2 = this;
            io.netty.channel.ChannelFutureListener r0 = r2.closeListener
            if (r0 == 0) goto L1c
            boolean r0 = r2.isGracefulShutdownComplete()
            if (r0 == 0) goto L1c
            io.netty.channel.ChannelFutureListener r0 = r2.closeListener
            r1 = 0
            r2.closeListener = r1
            r0.operationComplete(r3)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close listener threw an unexpected exception"
            r0.<init>(r1, r3)
            throw r0
        L1c:
            return
    }

    private static io.netty.buffer.ByteBuf clientPrefaceString(io.netty.handler.codec.http2.Http2Connection r0) {
            boolean r0 = r0.isServer()
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.http2.Http2CodecUtil.connectionPrefaceBuf()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private void closeConnectionOnError(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.ChannelFuture r4) {
            r2 = this;
            boolean r0 = r4.isSuccess()
            if (r0 != 0) goto Lf
            java.lang.Throwable r4 = r4.cause()
            r0 = 0
            r1 = 1
            r2.onConnectionError(r3, r1, r4, r0)
        Lf:
            return
    }

    private void doGracefulShutdown(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.channel.ChannelFutureListener r2 = r1.newClosingChannelFutureListener(r2, r4)
            boolean r0 = r1.isGracefulShutdownComplete()
            if (r0 == 0) goto Le
            r3.addListener(r2)
            return
        Le:
            io.netty.channel.ChannelFutureListener r3 = r1.closeListener
            if (r3 != 0) goto L15
            r1.closeListener = r2
            return
        L15:
            if (r4 == 0) goto L1e
            io.netty.handler.codec.http2.Http2ConnectionHandler$1 r4 = new io.netty.handler.codec.http2.Http2ConnectionHandler$1
            r4.<init>(r1, r3, r2)
            r1.closeListener = r4
        L1e:
            return
    }

    private io.netty.channel.ChannelFuture goAway(io.netty.channel.ChannelHandlerContext r10, io.netty.handler.codec.http2.Http2Exception r11, io.netty.channel.ChannelPromise r12) {
            r9 = this;
            if (r11 == 0) goto Lc
            io.netty.handler.codec.http2.Http2Error r0 = r11.error()
        L6:
            long r0 = r0.code()
            r5 = r0
            goto Lf
        Lc:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.NO_ERROR
            goto L6
        Lf:
            io.netty.handler.codec.http2.Http2Connection r0 = r9.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.remote()
            int r4 = r0.lastStreamCreated()
            io.netty.buffer.ByteBuf r7 = io.netty.handler.codec.http2.Http2CodecUtil.toByteBuf(r10, r11)
            r2 = r9
            r3 = r10
            r8 = r12
            io.netty.channel.ChannelFuture r10 = r2.goAway(r3, r4, r5, r7, r8)
            return r10
    }

    private io.netty.channel.ChannelFutureListener newClosingChannelFutureListener(io.netty.channel.ChannelHandlerContext r7, io.netty.channel.ChannelPromise r8) {
            r6 = this;
            long r3 = r6.gracefulShutdownTimeoutMillis
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            io.netty.handler.codec.http2.Http2ConnectionHandler$ClosingChannelFutureListener r0 = new io.netty.handler.codec.http2.Http2ConnectionHandler$ClosingChannelFutureListener
            if (r2 >= 0) goto Le
            r0.<init>(r7, r8)
            return r0
        Le:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    private boolean prefaceSent() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r1.byteDecoder
            if (r0 == 0) goto Lc
            boolean r0 = r0.prefaceSent()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private static void processGoAwayWriteResult(io.netty.channel.ChannelHandlerContext r9, int r10, long r11, io.netty.buffer.ByteBuf r13, io.netty.channel.ChannelFuture r14) {
            boolean r0 = r14.isSuccess()     // Catch: java.lang.Throwable -> L46
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 5
            if (r0 == 0) goto L4c
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.NO_ERROR     // Catch: java.lang.Throwable -> L46
            long r7 = r0.code()     // Catch: java.lang.Throwable -> L46
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L7e
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.logger     // Catch: java.lang.Throwable -> L46
            boolean r7 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L48
            java.lang.String r7 = "{} Sent GOAWAY: lastStreamId '{}', errorCode '{}', debugData '{}'. Forcing shutdown of the connection."
            io.netty.channel.Channel r8 = r9.channel()     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L46
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L46
            java.nio.charset.Charset r12 = io.netty.util.CharsetUtil.UTF_8     // Catch: java.lang.Throwable -> L46
            java.lang.String r12 = r13.toString(r12)     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r14 = r14.cause()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L46
            r6[r5] = r8     // Catch: java.lang.Throwable -> L46
            r6[r4] = r10     // Catch: java.lang.Throwable -> L46
            r6[r3] = r11     // Catch: java.lang.Throwable -> L46
            r6[r2] = r12     // Catch: java.lang.Throwable -> L46
            r6[r1] = r14     // Catch: java.lang.Throwable -> L46
            r0.debug(r7, r6)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r9 = move-exception
            goto L82
        L48:
            r9.close()     // Catch: java.lang.Throwable -> L46
            goto L7e
        L4c:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.logger     // Catch: java.lang.Throwable -> L46
            boolean r7 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L7b
            java.lang.String r7 = "{} Sending GOAWAY failed: lastStreamId '{}', errorCode '{}', debugData '{}'. Forcing shutdown of the connection."
            io.netty.channel.Channel r8 = r9.channel()     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L46
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L46
            java.nio.charset.Charset r12 = io.netty.util.CharsetUtil.UTF_8     // Catch: java.lang.Throwable -> L46
            java.lang.String r12 = r13.toString(r12)     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r14 = r14.cause()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L46
            r6[r5] = r8     // Catch: java.lang.Throwable -> L46
            r6[r4] = r10     // Catch: java.lang.Throwable -> L46
            r6[r3] = r11     // Catch: java.lang.Throwable -> L46
            r6[r2] = r12     // Catch: java.lang.Throwable -> L46
            r6[r1] = r14     // Catch: java.lang.Throwable -> L46
            r0.debug(r7, r6)     // Catch: java.lang.Throwable -> L46
        L7b:
            r9.close()     // Catch: java.lang.Throwable -> L46
        L7e:
            r13.release()
            return
        L82:
            r13.release()
            throw r9
    }

    private void processRstStreamWriteResult(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2Stream r3, io.netty.channel.ChannelFuture r4) {
            r1 = this;
            boolean r0 = r4.isSuccess()
            if (r0 == 0) goto La
            r1.closeStream(r3, r4)
            return
        La:
            java.lang.Throwable r3 = r4.cause()
            r4 = 0
            r0 = 1
            r1.onConnectionError(r2, r0, r3, r4)
            return
    }

    private io.netty.channel.ChannelFuture resetStream(io.netty.channel.ChannelHandlerContext r7, io.netty.handler.codec.http2.Http2Stream r8, long r9, io.netty.channel.ChannelPromise r11) {
            r6 = this;
            io.netty.channel.ChannelPromise r5 = r11.unvoid()
            boolean r11 = r8.isResetSent()
            if (r11 == 0) goto Lf
            io.netty.channel.ChannelPromise r7 = r5.setSuccess()
            return r7
        Lf:
            io.netty.handler.codec.http2.Http2Stream$State r11 = r8.state()
            io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.IDLE
            if (r11 == r0) goto L31
            io.netty.handler.codec.http2.Http2Connection r11 = r6.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r11 = r11.local()
            boolean r11 = r11.created(r8)
            if (r11 == 0) goto L33
            boolean r11 = r8.isHeadersSent()
            if (r11 != 0) goto L33
            boolean r11 = r8.isPushPromiseSent()
            if (r11 != 0) goto L33
        L31:
            r1 = r7
            goto L42
        L33:
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r6.frameWriter()
            int r2 = r8.id()
            r1 = r7
            r3 = r9
            io.netty.channel.ChannelFuture r7 = r0.writeRstStream(r1, r2, r3, r5)
            goto L46
        L42:
            io.netty.channel.ChannelPromise r7 = r5.setSuccess()
        L46:
            r8.resetSent()
            boolean r9 = r7.isDone()
            if (r9 == 0) goto L53
            r6.processRstStreamWriteResult(r1, r8, r7)
            return r7
        L53:
            io.netty.handler.codec.http2.Http2ConnectionHandler$4 r9 = new io.netty.handler.codec.http2.Http2ConnectionHandler$4
            r9.<init>(r6, r1, r8)
            r7.addListener(r9)
            return r7
    }

    private io.netty.channel.ChannelFuture resetUnknownStream(io.netty.channel.ChannelHandlerContext r7, int r8, long r9, io.netty.channel.ChannelPromise r11) {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r6.frameWriter()
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            io.netty.channel.ChannelFuture r7 = r0.writeRstStream(r1, r2, r3, r5)
            boolean r8 = r7.isDone()
            if (r8 == 0) goto L16
            r6.closeConnectionOnError(r1, r7)
            return r7
        L16:
            io.netty.handler.codec.http2.Http2ConnectionHandler$3 r8 = new io.netty.handler.codec.http2.Http2ConnectionHandler$3
            r8.<init>(r6, r1)
            r7.addListener(r8)
            return r7
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r0 = this;
            r1.bind(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r1.byteDecoder
            if (r0 != 0) goto Lb
            io.netty.handler.codec.http2.Http2ConnectionHandler$PrefaceDecoder r0 = new io.netty.handler.codec.http2.Http2ConnectionHandler$PrefaceDecoder
            r0.<init>(r1, r2)
            r1.byteDecoder = r0
        Lb:
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r1.byteDecoder
            r0.channelActive(r2)
            super.channelActive(r2)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            super.channelInactive(r2)
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r1.byteDecoder
            if (r0 == 0) goto Ld
            r0.channelInactive(r2)
            r2 = 0
            r1.byteDecoder = r2
        Ld:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r1.channelReadComplete0(r2)     // Catch: java.lang.Throwable -> L7
            r1.flush(r2)
            return
        L7:
            r0 = move-exception
            r1.flush(r2)
            throw r0
    }

    final void channelReadComplete0(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r1.discardSomeReadBytes()
            io.netty.channel.Channel r0 = r2.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L14
            r2.read()
        L14:
            r2.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.isWritable()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r1.flush(r2)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L1d
        L10:
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder     // Catch: java.lang.Throwable -> Le
            io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r0.flowController()     // Catch: java.lang.Throwable -> Le
            r0.channelWritabilityChanged()     // Catch: java.lang.Throwable -> Le
            super.channelWritabilityChanged(r2)
            return
        L1d:
            super.channelWritabilityChanged(r2)
            throw r0
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.decoupleCloseAndGoAway
            if (r0 == 0) goto L8
            r3.close(r4)
            return
        L8:
            io.netty.channel.ChannelPromise r4 = r4.unvoid()
            io.netty.channel.Channel r0 = r3.channel()
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L1a
            r3.close(r4)
            return
        L1a:
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            boolean r0 = r0.goAwaySent()
            if (r0 == 0) goto L2b
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            io.netty.channel.ChannelFuture r0 = r3.write(r0)
            goto L34
        L2b:
            r0 = 0
            io.netty.channel.ChannelPromise r1 = r3.newPromise()
            io.netty.channel.ChannelFuture r0 = r2.goAway(r3, r0, r1)
        L34:
            r3.flush()
            r2.doGracefulShutdown(r3, r0, r4)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LifecycleManager
    public void closeStream(io.netty.handler.codec.http2.Http2Stream r1, io.netty.channel.ChannelFuture r2) {
            r0 = this;
            r1.close()
            boolean r1 = r2.isDone()
            if (r1 == 0) goto Ld
            r0.checkCloseConnection(r2)
            return
        Ld:
            io.netty.handler.codec.http2.Http2ConnectionHandler$2 r1 = new io.netty.handler.codec.http2.Http2ConnectionHandler$2
            r1.<init>(r0)
            r2.addListener(r1)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LifecycleManager
    public void closeStreamLocal(io.netty.handler.codec.http2.Http2Stream r3, io.netty.channel.ChannelFuture r4) {
            r2 = this;
            int[] r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass6.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
            io.netty.handler.codec.http2.Http2Stream$State r1 = r3.state()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L16
            r2.closeStream(r3, r4)
            return
        L16:
            r3.closeLocalSide()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LifecycleManager
    public void closeStreamRemote(io.netty.handler.codec.http2.Http2Stream r3, io.netty.channel.ChannelFuture r4) {
            r2 = this;
            int[] r0 = io.netty.handler.codec.http2.Http2ConnectionHandler.AnonymousClass6.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
            io.netty.handler.codec.http2.Http2Stream$State r1 = r3.state()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L16
            r2.closeStream(r3, r4)
            return
        L16:
            r3.closeRemoteSide()
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r0 = this;
            r1.connect(r2, r3, r4)
            return
    }

    public io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
            return r0
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r1.byteDecoder
            r0.decode(r2, r3, r4)
            return
    }

    public io.netty.handler.codec.http2.Http2ConnectionDecoder decoder() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.decoder
            return r0
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

    public io.netty.handler.codec.http2.Http2ConnectionEncoder encoder() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2CodecUtil.getEmbeddedHttp2Exception(r3)
            if (r0 == 0) goto Lb
            r0 = 0
            r1.onError(r2, r0, r3)
            return
        Lb:
            super.exceptionCaught(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r6) {
            r5 = this;
            r0 = 1
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r5.encoder     // Catch: java.lang.Throwable -> Le io.netty.handler.codec.http2.Http2Exception -> L10
            io.netty.handler.codec.http2.Http2RemoteFlowController r1 = r1.flowController()     // Catch: java.lang.Throwable -> Le io.netty.handler.codec.http2.Http2Exception -> L10
            r1.writePendingBytes()     // Catch: java.lang.Throwable -> Le io.netty.handler.codec.http2.Http2Exception -> L10
            r6.flush()     // Catch: java.lang.Throwable -> Le io.netty.handler.codec.http2.Http2Exception -> L10
            return
        Le:
            r1 = move-exception
            goto L12
        L10:
            r1 = move-exception
            goto L21
        L12:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Error flushing"
            io.netty.handler.codec.http2.Http2Exception r1 = io.netty.handler.codec.http2.Http2Exception.connectionError(r2, r1, r4, r3)
            r5.onError(r6, r0, r1)
            goto L24
        L21:
            r5.onError(r6, r0, r1)
        L24:
            return
    }

    protected io.netty.handler.codec.http2.Http2FrameWriter frameWriter() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder()
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r0.frameWriter()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2LifecycleManager
    public io.netty.channel.ChannelFuture goAway(io.netty.channel.ChannelHandlerContext r8, int r9, long r10, io.netty.buffer.ByteBuf r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.channel.ChannelPromise r6 = r13.unvoid()
            io.netty.handler.codec.http2.Http2Connection r13 = r7.connection()
            boolean r13 = r13.goAwaySent(r9, r10, r12)     // Catch: java.lang.Throwable -> L15
            if (r13 != 0) goto L18
            r12.release()     // Catch: java.lang.Throwable -> L15
            r6.trySuccess()     // Catch: java.lang.Throwable -> L15
            return r6
        L15:
            r0 = move-exception
            r8 = r0
            goto L3f
        L18:
            r12.retain()
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.frameWriter()
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            io.netty.channel.ChannelFuture r13 = r0.writeGoAway(r1, r2, r3, r5, r6)
            boolean r0 = r13.isDone()
            if (r0 == 0) goto L31
            processGoAwayWriteResult(r8, r9, r10, r12, r13)
            return r13
        L31:
            io.netty.handler.codec.http2.Http2ConnectionHandler$5 r0 = new io.netty.handler.codec.http2.Http2ConnectionHandler$5
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r6)
            r13.addListener(r0)
            return r13
        L3f:
            r12.release()
            r6.tryFailure(r8)
            return r6
    }

    public long gracefulShutdownTimeoutMillis() {
            r2 = this;
            long r0 = r2.gracefulShutdownTimeoutMillis
            return r0
    }

    public void gracefulShutdownTimeoutMillis(long r4) {
            r3 = this;
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r3.gracefulShutdownTimeoutMillis = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "gracefulShutdownTimeoutMillis: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: -1 for indefinite or >= 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    protected void handleServerHeaderDecodeSizeError(io.netty.channel.ChannelHandlerContext r8, io.netty.handler.codec.http2.Http2Stream r9) {
            r7 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r7.encoder()
            int r2 = r9.id()
            io.netty.handler.codec.http2.Http2Headers r3 = io.netty.handler.codec.http2.Http2ConnectionHandler.HEADERS_TOO_LARGE_HEADERS
            r5 = 1
            io.netty.channel.ChannelPromise r6 = r8.newPromise()
            r4 = 0
            r1 = r8
            r0.writeHeaders(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder
            r0.lifecycleManager(r1)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.decoder
            r0.lifecycleManager(r1)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.encoder
            io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r0.flowController()
            r0.channelHandlerContext(r2)
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r1.decoder
            io.netty.handler.codec.http2.Http2LocalFlowController r0 = r0.flowController()
            r0.channelHandlerContext(r2)
            io.netty.handler.codec.http2.Http2ConnectionHandler$PrefaceDecoder r0 = new io.netty.handler.codec.http2.Http2ConnectionHandler$PrefaceDecoder
            r0.<init>(r1, r2)
            r1.byteDecoder = r0
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void handlerRemoved0(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionHandler$BaseDecoder r0 = r1.byteDecoder
            if (r0 == 0) goto La
            r0.handlerRemoved(r2)
            r2 = 0
            r1.byteDecoder = r2
        La:
            return
    }

    protected boolean isGracefulShutdownComplete() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection()
            int r0 = r0.numActiveStreams()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected void onConnectionError(io.netty.channel.ChannelHandlerContext r2, boolean r3, java.lang.Throwable r4, io.netty.handler.codec.http2.Http2Exception r5) {
            r1 = this;
            if (r5 != 0) goto Ld
            io.netty.handler.codec.http2.Http2Exception r5 = new io.netty.handler.codec.http2.Http2Exception
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            java.lang.String r0 = r4.getMessage()
            r5.<init>(r3, r0, r4)
        Ld:
            io.netty.channel.ChannelPromise r3 = r2.newPromise()
            io.netty.channel.ChannelPromise r4 = r2.newPromise()
            io.netty.channel.ChannelFuture r4 = r1.goAway(r2, r5, r4)
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r5 = r5.shutdownHint()
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r0 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.GRACEFUL_SHUTDOWN
            if (r5 != r0) goto L25
            r1.doGracefulShutdown(r2, r4, r3)
            return
        L25:
            io.netty.channel.ChannelFutureListener r2 = r1.newClosingChannelFutureListener(r2, r3)
            r4.addListener(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LifecycleManager
    public void onError(io.netty.channel.ChannelHandlerContext r3, boolean r4, java.lang.Throwable r5) {
            r2 = this;
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2CodecUtil.getEmbeddedHttp2Exception(r5)
            boolean r1 = io.netty.handler.codec.http2.Http2Exception.isStreamError(r0)
            if (r1 == 0) goto L10
            io.netty.handler.codec.http2.Http2Exception$StreamException r0 = (io.netty.handler.codec.http2.Http2Exception.StreamException) r0
            r2.onStreamError(r3, r4, r5, r0)
            goto L2d
        L10:
            boolean r1 = r0 instanceof io.netty.handler.codec.http2.Http2Exception.CompositeStreamException
            if (r1 == 0) goto L2a
            io.netty.handler.codec.http2.Http2Exception$CompositeStreamException r0 = (io.netty.handler.codec.http2.Http2Exception.CompositeStreamException) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.http2.Http2Exception$StreamException r1 = (io.netty.handler.codec.http2.Http2Exception.StreamException) r1
            r2.onStreamError(r3, r4, r5, r1)
            goto L1a
        L2a:
            r2.onConnectionError(r3, r4, r5, r0)
        L2d:
            r3.flush()
            return
    }

    public void onHttpClientUpgrade() throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r3.connection()
            boolean r0 = r0.isServer()
            r1 = 0
            if (r0 != 0) goto L3c
            boolean r0 = r3.prefaceSent()
            if (r0 == 0) goto L31
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r3.decoder
            boolean r0 = r0.prefaceReceived()
            if (r0 != 0) goto L26
            io.netty.handler.codec.http2.Http2Connection r0 = r3.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            r1 = 1
            r0.createStream(r1, r1)
            return
        L26:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r2 = "HTTP upgrade must occur before HTTP/2 preface is received"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
        L31:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            java.lang.String r2 = "HTTP upgrade must occur after preface was sent"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
        L3c:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r2 = "Client-side HTTP upgrade requested for a server"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
    }

    public void onHttpServerUpgrade(io.netty.handler.codec.http2.Http2Settings r3) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            boolean r0 = r0.isServer()
            r1 = 0
            if (r0 == 0) goto L41
            boolean r0 = r2.prefaceSent()
            if (r0 == 0) goto L36
            io.netty.handler.codec.http2.Http2ConnectionDecoder r0 = r2.decoder
            boolean r0 = r0.prefaceReceived()
            if (r0 != 0) goto L2b
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r2.encoder
            r0.remoteSettings(r3)
            io.netty.handler.codec.http2.Http2Connection r3 = r2.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.remote()
            r0 = 1
            r3.createStream(r0, r0)
            return
        L2b:
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r0 = "HTTP upgrade must occur before HTTP/2 preface is received"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r0, r1)
            throw r3
        L36:
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            java.lang.String r0 = "HTTP upgrade must occur after preface was sent"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r0, r1)
            throw r3
        L41:
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r0 = "Server-side HTTP upgrade requested for a client"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r0, r1)
            throw r3
    }

    protected void onStreamError(io.netty.channel.ChannelHandlerContext r12, boolean r13, java.lang.Throwable r14, io.netty.handler.codec.http2.Http2Exception.StreamException r15) {
            r11 = this;
            int r4 = r15.streamId()
            io.netty.handler.codec.http2.Http2Connection r0 = r11.connection()
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r4)
            boolean r5 = r15 instanceof io.netty.handler.codec.http2.Http2Exception.HeaderListSizeException
            if (r5 == 0) goto L6b
            r5 = r15
            io.netty.handler.codec.http2.Http2Exception$HeaderListSizeException r5 = (io.netty.handler.codec.http2.Http2Exception.HeaderListSizeException) r5
            boolean r5 = r5.duringDecode()
            if (r5 == 0) goto L6b
            io.netty.handler.codec.http2.Http2Connection r5 = r11.connection()
            boolean r5 = r5.isServer()
            if (r5 == 0) goto L6b
            if (r0 != 0) goto L4c
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r11.encoder     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.remote()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            r5 = 1
            io.netty.handler.codec.http2.Http2Stream r0 = r0.createStream(r4, r5)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            r5 = r0
            r3 = r4
            goto L4e
        L37:
            io.netty.handler.codec.http2.Http2Error r0 = r15.error()
            long r2 = r0.code()
            io.netty.channel.ChannelPromise r6 = r12.newPromise()
            r9 = r2
            r3 = r4
            r4 = r9
            r1 = r11
            r2 = r12
            r1.resetUnknownStream(r2, r3, r4, r6)
            return
        L4c:
            r3 = r4
            r5 = r0
        L4e:
            if (r5 == 0) goto L69
            boolean r0 = r5.isHeadersSent()
            if (r0 != 0) goto L69
            r11.handleServerHeaderDecodeSizeError(r12, r5)     // Catch: java.lang.Throwable -> L5a
            goto L69
        L5a:
            r0 = move-exception
            io.netty.handler.codec.http2.Http2Error r6 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "Error DecodeSizeError"
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r6, r0, r8, r7)
            r11.onError(r12, r13, r0)
        L69:
            r0 = r5
            goto L6c
        L6b:
            r3 = r4
        L6c:
            if (r0 != 0) goto L91
            if (r13 == 0) goto L7e
            io.netty.handler.codec.http2.Http2Connection r0 = r11.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            boolean r0 = r0.mayHaveCreatedStream(r3)
            if (r0 == 0) goto La3
        L7e:
            io.netty.handler.codec.http2.Http2Error r0 = r15.error()
            long r5 = r0.code()
            r4 = r5
            io.netty.channel.ChannelPromise r6 = r12.newPromise()
            r1 = r11
            r2 = r12
            r1.resetUnknownStream(r2, r3, r4, r6)
            goto La3
        L91:
            io.netty.handler.codec.http2.Http2Error r1 = r15.error()
            long r4 = r1.code()
            io.netty.channel.ChannelPromise r6 = r12.newPromise()
            r1 = r11
            r2 = r12
            r3 = r0
            r1.resetStream(r2, r3, r4, r6)
        La3:
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.read()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LifecycleManager
    public io.netty.channel.ChannelFuture resetStream(io.netty.channel.ChannelHandlerContext r11, int r12, long r13, io.netty.channel.ChannelPromise r15) {
            r10 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r10.connection()
            io.netty.handler.codec.http2.Http2Stream r3 = r0.stream(r12)
            if (r3 != 0) goto L17
            io.netty.channel.ChannelPromise r9 = r15.unvoid()
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            io.netty.channel.ChannelFuture r11 = r4.resetUnknownStream(r5, r6, r7, r9)
            return r11
        L17:
            r1 = r10
            r2 = r11
            r4 = r13
            r6 = r15
            io.netty.channel.ChannelFuture r11 = r1.resetStream(r2, r3, r4, r6)
            return r11
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r0 = this;
            r1.write(r2, r3)
            return
    }
}

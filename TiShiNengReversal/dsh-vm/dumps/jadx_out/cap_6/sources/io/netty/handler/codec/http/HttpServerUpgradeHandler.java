package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpServerUpgradeHandler extends io.netty.handler.codec.http.HttpObjectAggregator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean handlingUpgrade;
    private final io.netty.handler.codec.http.HttpServerUpgradeHandler.SourceCodec sourceCodec;
    private final io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodecFactory upgradeCodecFactory;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SourceCodec {
        void upgradeFrom(io.netty.channel.ChannelHandlerContext r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface UpgradeCodec {
        boolean prepareUpgradeResponse(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.FullHttpRequest r2, io.netty.handler.codec.http.HttpHeaders r3);

        java.util.Collection<java.lang.CharSequence> requiredUpgradeHeaders();

        void upgradeTo(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.FullHttpRequest r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface UpgradeCodecFactory {
        io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodec newUpgradeCodec(java.lang.CharSequence r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class UpgradeEvent implements io.netty.util.ReferenceCounted {
        private final java.lang.CharSequence protocol;
        private final io.netty.handler.codec.http.FullHttpRequest upgradeRequest;

        UpgradeEvent(java.lang.CharSequence r1, io.netty.handler.codec.http.FullHttpRequest r2) {
                r0 = this;
                r0.<init>()
                r0.protocol = r1
                r0.upgradeRequest = r2
                return
        }

        public java.lang.CharSequence protocol() {
                r1 = this;
                java.lang.CharSequence r0 = r1.protocol
                return r0
        }

        public int refCnt() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                int r0 = r0.refCnt()
                return r0
        }

        public boolean release() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                boolean r0 = r0.release()
                return r0
        }

        public boolean release(int r2) {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                boolean r2 = r0.release(r2)
                return r2
        }

        public io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent retain() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                r0.mo39retain()
                return r1
        }

        public io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent retain(int r2) {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                r0.mo40retain(r2)
                return r1
        }

        /* renamed from: retain, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m188retain() {
                r1 = this;
                io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r0 = r1.retain()
                return r0
        }

        /* renamed from: retain, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m189retain(int r1) {
                r0 = this;
                io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r1 = r0.retain(r1)
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "UpgradeEvent [protocol="
                r0.append(r1)
                java.lang.CharSequence r1 = r2.protocol
                r0.append(r1)
                java.lang.String r1 = ", upgradeRequest="
                r0.append(r1)
                io.netty.handler.codec.http.FullHttpRequest r1 = r2.upgradeRequest
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent touch() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                r0.mo41touch()
                return r1
        }

        public io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent touch(java.lang.Object r2) {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                r0.mo42touch(r2)
                return r1
        }

        /* renamed from: touch, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m190touch() {
                r1 = this;
                io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r0 = r1.touch()
                return r0
        }

        /* renamed from: touch, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m191touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r1 = r0.touch(r1)
                return r1
        }

        public io.netty.handler.codec.http.FullHttpRequest upgradeRequest() {
                r1 = this;
                io.netty.handler.codec.http.FullHttpRequest r0 = r1.upgradeRequest
                return r0
        }
    }

    static {
            return
    }

    public HttpServerUpgradeHandler(io.netty.handler.codec.http.HttpServerUpgradeHandler.SourceCodec r2, io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodecFactory r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public HttpServerUpgradeHandler(io.netty.handler.codec.http.HttpServerUpgradeHandler.SourceCodec r1, io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodecFactory r2, int r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.String r3 = "sourceCodec"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r3)
            io.netty.handler.codec.http.HttpServerUpgradeHandler$SourceCodec r1 = (io.netty.handler.codec.http.HttpServerUpgradeHandler.SourceCodec) r1
            r0.sourceCodec = r1
            java.lang.String r1 = "upgradeCodecFactory"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeCodecFactory r1 = (io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodecFactory) r1
            r0.upgradeCodecFactory = r1
            return
    }

    private static io.netty.handler.codec.http.FullHttpResponse createUpgradeResponse(java.lang.CharSequence r5) {
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r1.add(r2, r3)
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            r1.add(r2, r5)
            return r0
    }

    private static boolean isUpgradeRequest(io.netty.handler.codec.http.HttpObject r1) {
            boolean r0 = r1 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L14
            io.netty.handler.codec.http.HttpRequest r1 = (io.netty.handler.codec.http.HttpRequest) r1
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            java.lang.String r1 = r1.get(r0)
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    private static java.util.List<java.lang.CharSequence> splitHeader(java.lang.CharSequence r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 4
            r1.<init>(r2)
            r2 = 0
            r3 = 0
        L11:
            int r4 = r6.length()
            if (r3 >= r4) goto L37
            char r4 = r6.charAt(r3)
            boolean r5 = java.lang.Character.isWhitespace(r4)
            if (r5 == 0) goto L22
            goto L34
        L22:
            r5 = 44
            if (r4 != r5) goto L31
            java.lang.String r4 = r0.toString()
            r1.add(r4)
            r0.setLength(r2)
            goto L34
        L31:
            r0.append(r4)
        L34:
            int r3 = r3 + 1
            goto L11
        L37:
            int r6 = r0.length()
            if (r6 <= 0) goto L44
            java.lang.String r6 = r0.toString()
            r1.add(r6)
        L44:
            return r1
    }

    private boolean upgrade(io.netty.channel.ChannelHandlerContext r8, io.netty.handler.codec.http.FullHttpRequest r9) {
            r7 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r9.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            java.lang.String r0 = r0.get(r1)
            java.util.List r0 = splitHeader(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r1) goto L28
            java.lang.Object r4 = r0.get(r3)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeCodecFactory r5 = r7.upgradeCodecFactory
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeCodec r5 = r5.newUpgradeCodec(r4)
            if (r5 == 0) goto L25
            goto L2a
        L25:
            int r3 = r3 + 1
            goto L14
        L28:
            r4 = 0
            r5 = r4
        L2a:
            if (r5 != 0) goto L2d
            return r2
        L2d:
            io.netty.handler.codec.http.HttpHeaders r0 = r9.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            java.util.List r0 = r0.getAll(r1)
            if (r0 != 0) goto L3a
            return r2
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r0.size()
            int r3 = r3 * 10
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r0.next()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.append(r3)
            r3 = 44
            r1.append(r3)
            goto L49
        L5e:
            int r0 = r1.length()
            r3 = 1
            int r0 = r0 - r3
            r1.setLength(r0)
            java.util.Collection r0 = r5.requiredUpgradeHeaders()
            java.util.List r1 = splitHeader(r1)
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            boolean r6 = io.netty.util.AsciiString.containsContentEqualsIgnoreCase(r1, r6)
            if (r6 == 0) goto Ld5
            boolean r1 = io.netty.util.AsciiString.containsAllContentEqualsIgnoreCase(r1, r0)
            if (r1 != 0) goto L7e
            goto Ld5
        L7e:
            java.util.Iterator r0 = r0.iterator()
        L82:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http.HttpHeaders r6 = r9.headers()
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto L82
            return r2
        L99:
            io.netty.handler.codec.http.FullHttpResponse r0 = createUpgradeResponse(r4)
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            boolean r1 = r5.prepareUpgradeResponse(r8, r9, r1)
            if (r1 != 0) goto La8
            return r2
        La8:
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r1 = new io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent
            r1.<init>(r4, r9)
            io.netty.channel.ChannelFuture r0 = r8.writeAndFlush(r0)     // Catch: java.lang.Throwable -> Ld0
            io.netty.handler.codec.http.HttpServerUpgradeHandler$SourceCodec r2 = r7.sourceCodec     // Catch: java.lang.Throwable -> Ld0
            r2.upgradeFrom(r8)     // Catch: java.lang.Throwable -> Ld0
            r5.upgradeTo(r8, r9)     // Catch: java.lang.Throwable -> Ld0
            io.netty.channel.ChannelPipeline r9 = r8.pipeline()     // Catch: java.lang.Throwable -> Ld0
            r9.remove(r7)     // Catch: java.lang.Throwable -> Ld0
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r9 = r1.retain()     // Catch: java.lang.Throwable -> Ld0
            r8.fireUserEventTriggered(r9)     // Catch: java.lang.Throwable -> Ld0
            io.netty.channel.ChannelFutureListener r8 = io.netty.channel.ChannelFutureListener.CLOSE_ON_FAILURE     // Catch: java.lang.Throwable -> Ld0
            r0.addListener(r8)     // Catch: java.lang.Throwable -> Ld0
            r1.release()
            return r3
        Ld0:
            r8 = move-exception
            r1.release()
            throw r8
        Ld5:
            return r2
    }

    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http.HttpObject r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.handlingUpgrade
            boolean r1 = isUpgradeRequest(r4)
            r0 = r0 | r1
            r2.handlingUpgrade = r0
            if (r0 != 0) goto L12
            io.netty.util.ReferenceCountUtil.retain(r4)
            r5.add(r4)
            return
        L12:
            boolean r0 = r4 instanceof io.netty.handler.codec.http.FullHttpRequest
            if (r0 == 0) goto L20
            r0 = r4
            io.netty.handler.codec.http.FullHttpRequest r0 = (io.netty.handler.codec.http.FullHttpRequest) r0
            io.netty.util.ReferenceCountUtil.retain(r4)
            r5.add(r4)
            goto L34
        L20:
            super.decode(r3, r4, r5)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L2a
            goto L3d
        L2a:
            r4 = 0
            r2.handlingUpgrade = r4
            java.lang.Object r4 = r5.get(r4)
            r0 = r4
            io.netty.handler.codec.http.FullHttpRequest r0 = (io.netty.handler.codec.http.FullHttpRequest) r0
        L34:
            boolean r3 = r2.upgrade(r3, r0)
            if (r3 == 0) goto L3d
            r5.clear()
        L3d:
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator, io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r2 = (io.netty.handler.codec.http.HttpObject) r2
            r0.decode(r1, r2, r3)
            return
    }
}

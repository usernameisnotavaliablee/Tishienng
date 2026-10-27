package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpClientUpgradeHandler extends io.netty.handler.codec.http.HttpObjectAggregator implements io.netty.channel.ChannelOutboundHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final io.netty.handler.codec.http.HttpClientUpgradeHandler.SourceCodec sourceCodec;
    private final io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeCodec upgradeCodec;
    private boolean upgradeRequested;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SourceCodec {
        void prepareUpgradeFrom(io.netty.channel.ChannelHandlerContext r1);

        void upgradeFrom(io.netty.channel.ChannelHandlerContext r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface UpgradeCodec {
        java.lang.CharSequence protocol();

        java.util.Collection<java.lang.CharSequence> setUpgradeHeaders(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpRequest r2);

        void upgradeTo(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.FullHttpResponse r2) throws java.lang.Exception;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum UpgradeEvent extends java.lang.Enum<io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent> {
        private static final /* synthetic */ io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent[] $VALUES = null;
        public static final io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent UPGRADE_ISSUED = null;
        public static final io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent UPGRADE_REJECTED = null;
        public static final io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent UPGRADE_SUCCESSFUL = null;

        static {
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r0 = new io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent
                java.lang.String r1 = "UPGRADE_ISSUED"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_ISSUED = r0
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r1 = new io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent
                java.lang.String r3 = "UPGRADE_SUCCESSFUL"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_SUCCESSFUL = r1
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r3 = new io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent
                java.lang.String r5 = "UPGRADE_REJECTED"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_REJECTED = r3
                r5 = 3
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent[] r5 = new io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.$VALUES = r5
                return
        }

        UpgradeEvent(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent> r0 = io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r1 = (io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent) r1
                return r1
        }

        public static io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent[] values() {
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent[] r0 = io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent[] r0 = (io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent[]) r0
                return r0
        }
    }

    static {
            return
    }

    public HttpClientUpgradeHandler(io.netty.handler.codec.http.HttpClientUpgradeHandler.SourceCodec r1, io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeCodec r2, int r3) {
            r0 = this;
            r0.<init>(r3)
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.sourceCodec = r1
            r0.upgradeCodec = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "upgradeCodec"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "sourceCodec"
            r1.<init>(r2)
            throw r1
    }

    private static void removeThisHandler(io.netty.channel.ChannelHandlerContext r1) {
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            java.lang.String r1 = r1.name()
            r0.remove(r1)
            return
    }

    private void setUpgradeRequestHeaders(io.netty.channel.ChannelHandlerContext r4, io.netty.handler.codec.http.HttpRequest r5) {
            r3 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r5.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeCodec r2 = r3.upgradeCodec
            java.lang.CharSequence r2 = r2.protocol()
            r0.set(r1, r2)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = 2
            r0.<init>(r1)
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeCodec r1 = r3.upgradeCodec
            java.util.Collection r4 = r1.setUpgradeHeaders(r4, r5)
            r0.addAll(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.append(r1)
            r1 = 44
            r4.append(r1)
            goto L27
        L3c:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r4.append(r0)
            io.netty.handler.codec.http.HttpHeaders r5 = r5.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            java.lang.String r4 = r4.toString()
            r5.add(r0, r4)
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

    protected void decode(io.netty.channel.ChannelHandlerContext r4, io.netty.handler.codec.http.HttpObject r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            r0 = 0
            boolean r1 = r3.upgradeRequested     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L99
            boolean r1 = r5 instanceof io.netty.handler.codec.http.HttpResponse     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L27
            r1 = r5
            io.netty.handler.codec.http.HttpResponse r1 = (io.netty.handler.codec.http.HttpResponse) r1     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http.HttpResponseStatus r1 = r1.status()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L27
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r6 = io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_REJECTED     // Catch: java.lang.Throwable -> L24
            r4.fireUserEventTriggered(r6)     // Catch: java.lang.Throwable -> L24
            removeThisHandler(r4)     // Catch: java.lang.Throwable -> L24
            r4.fireChannelRead(r5)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r5 = move-exception
            goto La1
        L27:
            boolean r1 = r5 instanceof io.netty.handler.codec.http.FullHttpResponse     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L39
            io.netty.handler.codec.http.FullHttpResponse r5 = (io.netty.handler.codec.http.FullHttpResponse) r5     // Catch: java.lang.Throwable -> L24
            r5.mo39retain()     // Catch: java.lang.Throwable -> L35
            r6.add(r5)     // Catch: java.lang.Throwable -> L35
        L33:
            r0 = r5
            goto L4b
        L35:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto La1
        L39:
            super.decode(r4, r5, r6)     // Catch: java.lang.Throwable -> L24
            boolean r5 = r6.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L43
            return
        L43:
            r5 = 0
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http.FullHttpResponse r5 = (io.netty.handler.codec.http.FullHttpResponse) r5     // Catch: java.lang.Throwable -> L24
            goto L33
        L4b:
            io.netty.handler.codec.http.HttpHeaders r5 = r0.headers()     // Catch: java.lang.Throwable -> L24
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L7b
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeCodec r1 = r3.upgradeCodec     // Catch: java.lang.Throwable -> L24
            java.lang.CharSequence r1 = r1.protocol()     // Catch: java.lang.Throwable -> L24
            boolean r1 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r1, r5)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L64
            goto L7b
        L64:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "Switching Protocols response with unexpected UPGRADE protocol: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            r1.append(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L7b:
            io.netty.handler.codec.http.HttpClientUpgradeHandler$SourceCodec r5 = r3.sourceCodec     // Catch: java.lang.Throwable -> L24
            r5.prepareUpgradeFrom(r4)     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeCodec r5 = r3.upgradeCodec     // Catch: java.lang.Throwable -> L24
            r5.upgradeTo(r4, r0)     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r5 = io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_SUCCESSFUL     // Catch: java.lang.Throwable -> L24
            r4.fireUserEventTriggered(r5)     // Catch: java.lang.Throwable -> L24
            io.netty.handler.codec.http.HttpClientUpgradeHandler$SourceCodec r5 = r3.sourceCodec     // Catch: java.lang.Throwable -> L24
            r5.upgradeFrom(r4)     // Catch: java.lang.Throwable -> L24
            r0.release()     // Catch: java.lang.Throwable -> L24
            r6.clear()     // Catch: java.lang.Throwable -> L24
            removeThisHandler(r4)     // Catch: java.lang.Throwable -> L24
            return
        L99:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = "Read HTTP response without requesting protocol switch"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L24
            throw r5     // Catch: java.lang.Throwable -> L24
        La1:
            io.netty.util.ReferenceCountUtil.release(r0)
            r4.fireExceptionCaught(r5)
            removeThisHandler(r4)
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator, io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r2 = (io.netty.handler.codec.http.HttpObject) r2
            r0.decode(r1, r2, r3)
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

    @Override // io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r1.read()
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 != 0) goto L8
            r2.write(r3, r4)
            return
        L8:
            boolean r0 = r1.upgradeRequested
            if (r0 == 0) goto L17
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Attempting to write HTTP request with upgrade in progress"
            r2.<init>(r3)
            r4.setFailure(r2)
            return
        L17:
            r0 = 1
            r1.upgradeRequested = r0
            r0 = r3
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            r1.setUpgradeRequestHeaders(r2, r0)
            r2.write(r3, r4)
            io.netty.handler.codec.http.HttpClientUpgradeHandler$UpgradeEvent r3 = io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeEvent.UPGRADE_ISSUED
            r2.fireUserEventTriggered(r3)
            return
    }
}

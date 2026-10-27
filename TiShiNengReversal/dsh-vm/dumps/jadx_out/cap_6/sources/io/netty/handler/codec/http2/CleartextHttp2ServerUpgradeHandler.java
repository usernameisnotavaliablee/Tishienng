package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CleartextHttp2ServerUpgradeHandler extends io.netty.channel.ChannelHandlerAdapter {
    private static final io.netty.buffer.ByteBuf CONNECTION_PREFACE = null;
    private final io.netty.channel.ChannelHandler http2ServerHandler;
    private final io.netty.handler.codec.http.HttpServerCodec httpServerCodec;
    private final io.netty.handler.codec.http.HttpServerUpgradeHandler httpServerUpgradeHandler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PriorKnowledgeHandler extends io.netty.handler.codec.ByteToMessageDecoder {
        final /* synthetic */ io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler this$0;

        private PriorKnowledgeHandler(io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ PriorKnowledgeHandler(io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r1, io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.handler.codec.ByteToMessageDecoder
        protected void decode(io.netty.channel.ChannelHandlerContext r5, io.netty.buffer.ByteBuf r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
                r4 = this;
                io.netty.buffer.ByteBuf r7 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.access$100()
                int r7 = r7.readableBytes()
                int r0 = r6.readableBytes()
                int r0 = java.lang.Math.min(r0, r7)
                io.netty.buffer.ByteBuf r1 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.access$100()
                io.netty.buffer.ByteBuf r2 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.access$100()
                int r2 = r2.readerIndex()
                int r3 = r6.readerIndex()
                boolean r6 = io.netty.buffer.ByteBufUtil.equals(r1, r2, r6, r3, r0)
                if (r6 != 0) goto L2e
                io.netty.channel.ChannelPipeline r5 = r5.pipeline()
                r5.remove(r4)
                return
            L2e:
                if (r0 != r7) goto L67
                io.netty.channel.ChannelPipeline r6 = r5.pipeline()
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r7 = r4.this$0
                io.netty.handler.codec.http.HttpServerCodec r7 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.access$300(r7)
                io.netty.channel.ChannelPipeline r6 = r6.remove(r7)
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r7 = r4.this$0
                io.netty.handler.codec.http.HttpServerUpgradeHandler r7 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.access$200(r7)
                r6.remove(r7)
                io.netty.channel.ChannelPipeline r6 = r5.pipeline()
                java.lang.String r7 = r5.name()
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r0 = r4.this$0
                io.netty.channel.ChannelHandler r0 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.access$400(r0)
                r1 = 0
                r6.addAfter(r7, r1, r0)
                io.netty.channel.ChannelPipeline r6 = r5.pipeline()
                r6.remove(r4)
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$PriorKnowledgeUpgradeEvent r6 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.PriorKnowledgeUpgradeEvent.access$500()
                r5.fireUserEventTriggered(r6)
            L67:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class PriorKnowledgeUpgradeEvent {
        private static final io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.PriorKnowledgeUpgradeEvent INSTANCE = null;

        static {
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$PriorKnowledgeUpgradeEvent r0 = new io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$PriorKnowledgeUpgradeEvent
                r0.<init>()
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.PriorKnowledgeUpgradeEvent.INSTANCE = r0
                return
        }

        private PriorKnowledgeUpgradeEvent() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.PriorKnowledgeUpgradeEvent access$500() {
                io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$PriorKnowledgeUpgradeEvent r0 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.PriorKnowledgeUpgradeEvent.INSTANCE
                return r0
        }
    }

    static {
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.http2.Http2CodecUtil.connectionPrefaceBuf()
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.CONNECTION_PREFACE = r0
            return
    }

    public CleartextHttp2ServerUpgradeHandler(io.netty.handler.codec.http.HttpServerCodec r2, io.netty.handler.codec.http.HttpServerUpgradeHandler r3, io.netty.channel.ChannelHandler r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "httpServerCodec"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http.HttpServerCodec r2 = (io.netty.handler.codec.http.HttpServerCodec) r2
            r1.httpServerCodec = r2
            java.lang.String r2 = "httpServerUpgradeHandler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http.HttpServerUpgradeHandler r2 = (io.netty.handler.codec.http.HttpServerUpgradeHandler) r2
            r1.httpServerUpgradeHandler = r2
            java.lang.String r2 = "http2ServerHandler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.channel.ChannelHandler r2 = (io.netty.channel.ChannelHandler) r2
            r1.http2ServerHandler = r2
            return
    }

    static /* synthetic */ io.netty.buffer.ByteBuf access$100() {
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler.CONNECTION_PREFACE
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http.HttpServerUpgradeHandler access$200(io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r0) {
            io.netty.handler.codec.http.HttpServerUpgradeHandler r0 = r0.httpServerUpgradeHandler
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http.HttpServerCodec access$300(io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r0) {
            io.netty.handler.codec.http.HttpServerCodec r0 = r0.httpServerCodec
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandler access$400(io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler r0) {
            io.netty.channel.ChannelHandler r0 = r0.http2ServerHandler
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r5) throws java.lang.Exception {
            r4 = this;
            io.netty.channel.ChannelPipeline r0 = r5.pipeline()
            java.lang.String r1 = r5.name()
            io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$PriorKnowledgeHandler r2 = new io.netty.handler.codec.http2.CleartextHttp2ServerUpgradeHandler$PriorKnowledgeHandler
            r3 = 0
            r2.<init>(r4, r3)
            io.netty.channel.ChannelPipeline r0 = r0.addBefore(r1, r3, r2)
            java.lang.String r5 = r5.name()
            io.netty.handler.codec.http.HttpServerCodec r1 = r4.httpServerCodec
            io.netty.channel.ChannelPipeline r5 = r0.addBefore(r5, r3, r1)
            io.netty.handler.codec.http.HttpServerUpgradeHandler r0 = r4.httpServerUpgradeHandler
            r5.replace(r4, r3, r0)
            return
    }
}

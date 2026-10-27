package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class Http2ChannelDuplexHandler extends io.netty.channel.ChannelDuplexHandler {
    private volatile io.netty.handler.codec.http2.Http2FrameCodec frameCodec;

    public Http2ChannelDuplexHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    private static io.netty.handler.codec.http2.Http2FrameCodec requireHttp2FrameCodec(io.netty.channel.ChannelHandlerContext r2) {
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()
            java.lang.Class<io.netty.handler.codec.http2.Http2FrameCodec> r0 = io.netty.handler.codec.http2.Http2FrameCodec.class
            io.netty.channel.ChannelHandlerContext r2 = r2.context(r0)
            if (r2 == 0) goto L13
            io.netty.channel.ChannelHandler r2 = r2.handler()
            io.netty.handler.codec.http2.Http2FrameCodec r2 = (io.netty.handler.codec.http2.Http2FrameCodec) r2
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " was not found in the channel pipeline."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
    }

    protected final void forEachActiveStream(io.netty.handler.codec.http2.Http2FrameStreamVisitor r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameCodec r0 = r1.frameCodec
            r0.forEachActiveStream(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public final void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameCodec r0 = requireHttp2FrameCodec(r2)
            r1.frameCodec = r0
            r1.handlerAdded0(r2)
            return
    }

    protected void handlerAdded0(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public final void handlerRemoved(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            r1.handlerRemoved0(r2)     // Catch: java.lang.Throwable -> L7
            r1.frameCodec = r0
            return
        L7:
            r2 = move-exception
            r1.frameCodec = r0
            throw r2
    }

    protected void handlerRemoved0(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    public final io.netty.handler.codec.http2.Http2FrameStream newStream() {
            r3 = this;
            io.netty.handler.codec.http2.Http2FrameCodec r0 = r3.frameCodec
            if (r0 == 0) goto L9
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = r0.newStream()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.netty.handler.codec.http2.Http2FrameCodec> r2 = io.netty.handler.codec.http2.Http2FrameCodec.class
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r1.append(r2)
            java.lang.String r2 = " not found. Has the handler been added to a pipeline?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}

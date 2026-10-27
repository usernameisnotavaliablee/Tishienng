package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2InboundFrameLogger implements io.netty.handler.codec.http2.Http2FrameReader {
    private final io.netty.handler.codec.http2.Http2FrameLogger logger;
    private final io.netty.handler.codec.http2.Http2FrameReader reader;


    public Http2InboundFrameLogger(io.netty.handler.codec.http2.Http2FrameReader r2, io.netty.handler.codec.http2.Http2FrameLogger r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "reader"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameReader r2 = (io.netty.handler.codec.http2.Http2FrameReader) r2
            r1.reader = r2
            java.lang.String r2 = "logger"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.http2.Http2FrameLogger r2 = (io.netty.handler.codec.http2.Http2FrameLogger) r2
            r1.logger = r2
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameLogger access$000(io.netty.handler.codec.http2.Http2InboundFrameLogger r0) {
            io.netty.handler.codec.http2.Http2FrameLogger r0 = r0.logger
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameReader r0 = r1.reader
            r0.close()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader
    public io.netty.handler.codec.http2.Http2FrameReader.Configuration configuration() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameReader r0 = r1.reader
            io.netty.handler.codec.http2.Http2FrameReader$Configuration r0 = r0.configuration()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader
    public void readFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.handler.codec.http2.Http2FrameListener r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2FrameReader r0 = r2.reader
            io.netty.handler.codec.http2.Http2InboundFrameLogger$1 r1 = new io.netty.handler.codec.http2.Http2InboundFrameLogger$1
            r1.<init>(r2, r5)
            r0.readFrame(r3, r4, r1)
            return
    }
}

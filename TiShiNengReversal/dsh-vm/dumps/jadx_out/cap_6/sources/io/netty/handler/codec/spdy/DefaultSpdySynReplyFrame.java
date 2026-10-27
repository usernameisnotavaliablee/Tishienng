package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdySynReplyFrame extends io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame implements io.netty.handler.codec.spdy.SpdySynReplyFrame {
    public DefaultSpdySynReplyFrame(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DefaultSpdySynReplyFrame(int r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.SpdyHeadersFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyHeadersFrame setInvalid() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdySynReplyFrame r0 = r1.setInvalid()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.SpdyHeadersFrame
    public io.netty.handler.codec.spdy.SpdySynReplyFrame setInvalid() {
            r0 = this;
            super.setInvalid()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyHeadersFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynReplyFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynReplyFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdySynReplyFrame setLast(boolean r1) {
            r0 = this;
            super.setLast(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyHeadersFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynReplyFrame r1 = r0.setStreamId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynReplyFrame r1 = r0.setStreamId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdySynReplyFrame setStreamId(int r1) {
            r0 = this;
            super.setStreamId(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(last: "
            r0.append(r1)
            boolean r1 = r3.isLast()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.append(r1)
            java.lang.String r2 = "--> Stream-ID = "
            r0.append(r2)
            int r2 = r3.streamId()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "--> Headers:"
            r0.append(r2)
            r0.append(r1)
            r3.appendHeaders(r0)
            int r2 = r0.length()
            int r1 = r1.length()
            int r2 = r2 - r1
            r0.setLength(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

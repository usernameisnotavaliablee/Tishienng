package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdyRstStreamFrame extends io.netty.handler.codec.spdy.DefaultSpdyStreamFrame implements io.netty.handler.codec.spdy.SpdyRstStreamFrame {
    private io.netty.handler.codec.spdy.SpdyStreamStatus status;

    public DefaultSpdyRstStreamFrame(int r1, int r2) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyStreamStatus r2 = io.netty.handler.codec.spdy.SpdyStreamStatus.valueOf(r2)
            r0.<init>(r1, r2)
            return
    }

    public DefaultSpdyRstStreamFrame(int r1, io.netty.handler.codec.spdy.SpdyStreamStatus r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setStatus(r2)
            return
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyRstStreamFrame setLast(boolean r1) {
            r0 = this;
            super.setLast(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyRstStreamFrame
    public io.netty.handler.codec.spdy.SpdyRstStreamFrame setStatus(io.netty.handler.codec.spdy.SpdyStreamStatus r1) {
            r0 = this;
            r0.status = r1
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyRstStreamFrame setStreamId(int r1) {
            r0 = this;
            super.setStreamId(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyRstStreamFrame r1 = r0.setStreamId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyRstStreamFrame
    public io.netty.handler.codec.spdy.SpdyStreamStatus status() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyStreamStatus r0 = r1.status
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.append(r1)
            java.lang.String r2 = "--> Stream-ID = "
            r0.append(r2)
            int r2 = r3.streamId()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "--> Status: "
            r0.append(r1)
            io.netty.handler.codec.spdy.SpdyStreamStatus r1 = r3.status()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdyGoAwayFrame implements io.netty.handler.codec.spdy.SpdyGoAwayFrame {
    private int lastGoodStreamId;
    private io.netty.handler.codec.spdy.SpdySessionStatus status;

    public DefaultSpdyGoAwayFrame(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultSpdyGoAwayFrame(int r1, int r2) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySessionStatus r2 = io.netty.handler.codec.spdy.SpdySessionStatus.valueOf(r2)
            r0.<init>(r1, r2)
            return
    }

    public DefaultSpdyGoAwayFrame(int r1, io.netty.handler.codec.spdy.SpdySessionStatus r2) {
            r0 = this;
            r0.<init>()
            r0.setLastGoodStreamId(r1)
            r0.setStatus(r2)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyGoAwayFrame
    public int lastGoodStreamId() {
            r1 = this;
            int r0 = r1.lastGoodStreamId
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyGoAwayFrame
    public io.netty.handler.codec.spdy.SpdyGoAwayFrame setLastGoodStreamId(int r2) {
            r1 = this;
            java.lang.String r0 = "lastGoodStreamId"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.lastGoodStreamId = r2
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyGoAwayFrame
    public io.netty.handler.codec.spdy.SpdyGoAwayFrame setStatus(io.netty.handler.codec.spdy.SpdySessionStatus r1) {
            r0 = this;
            r0.status = r1
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyGoAwayFrame
    public io.netty.handler.codec.spdy.SpdySessionStatus status() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdySessionStatus r0 = r1.status
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
            java.lang.String r2 = "--> Last-good-stream-ID = "
            r0.append(r2)
            int r2 = r3.lastGoodStreamId()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "--> Status: "
            r0.append(r1)
            io.netty.handler.codec.spdy.SpdySessionStatus r1 = r3.status()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

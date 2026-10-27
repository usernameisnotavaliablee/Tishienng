package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class DefaultSpdyStreamFrame implements io.netty.handler.codec.spdy.SpdyStreamFrame {
    private boolean last;
    private int streamId;

    protected DefaultSpdyStreamFrame(int r1) {
            r0 = this;
            r0.<init>()
            r0.setStreamId(r1)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyStreamFrame
    public boolean isLast() {
            r1 = this;
            boolean r0 = r1.last
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyStreamFrame setLast(boolean r1) {
            r0 = this;
            r0.last = r1
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyStreamFrame setStreamId(int r2) {
            r1 = this;
            java.lang.String r0 = "streamId"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.streamId = r2
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyStreamFrame
    public int streamId() {
            r1 = this;
            int r0 = r1.streamId
            return r0
    }
}

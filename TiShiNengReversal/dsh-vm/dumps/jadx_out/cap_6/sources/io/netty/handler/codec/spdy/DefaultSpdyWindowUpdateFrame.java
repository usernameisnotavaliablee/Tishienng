package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdyWindowUpdateFrame implements io.netty.handler.codec.spdy.SpdyWindowUpdateFrame {
    private int deltaWindowSize;
    private int streamId;

    public DefaultSpdyWindowUpdateFrame(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.setStreamId(r1)
            r0.setDeltaWindowSize(r2)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
    public int deltaWindowSize() {
            r1 = this;
            int r0 = r1.deltaWindowSize
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
    public io.netty.handler.codec.spdy.SpdyWindowUpdateFrame setDeltaWindowSize(int r2) {
            r1 = this;
            java.lang.String r0 = "deltaWindowSize"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.deltaWindowSize = r2
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
    public io.netty.handler.codec.spdy.SpdyWindowUpdateFrame setStreamId(int r2) {
            r1 = this;
            java.lang.String r0 = "streamId"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.streamId = r2
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyWindowUpdateFrame
    public int streamId() {
            r1 = this;
            int r0 = r1.streamId
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
            java.lang.String r1 = "--> Delta-Window-Size = "
            r0.append(r1)
            int r1 = r3.deltaWindowSize()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

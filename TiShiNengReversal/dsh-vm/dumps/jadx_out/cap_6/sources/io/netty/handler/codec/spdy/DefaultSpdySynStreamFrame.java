package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdySynStreamFrame extends io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame implements io.netty.handler.codec.spdy.SpdySynStreamFrame {
    private int associatedStreamId;
    private byte priority;
    private boolean unidirectional;

    public DefaultSpdySynStreamFrame(int r2, int r3, byte r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultSpdySynStreamFrame(int r1, int r2, byte r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r4)
            r0.setAssociatedStreamId(r2)
            r0.setPriority(r3)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdySynStreamFrame
    public int associatedStreamId() {
            r1 = this;
            int r0 = r1.associatedStreamId
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySynStreamFrame
    public boolean isUnidirectional() {
            r1 = this;
            boolean r0 = r1.unidirectional
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySynStreamFrame
    public byte priority() {
            r1 = this;
            byte r0 = r1.priority
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySynStreamFrame
    public io.netty.handler.codec.spdy.SpdySynStreamFrame setAssociatedStreamId(int r2) {
            r1 = this;
            java.lang.String r0 = "associatedStreamId"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.associatedStreamId = r2
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.SpdyHeadersFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyHeadersFrame setInvalid() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdySynStreamFrame r0 = r1.setInvalid()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.SpdyHeadersFrame
    public io.netty.handler.codec.spdy.SpdySynStreamFrame setInvalid() {
            r0 = this;
            super.setInvalid()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyHeadersFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynStreamFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynStreamFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdySynStreamFrame setLast(boolean r1) {
            r0 = this;
            super.setLast(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySynStreamFrame
    public io.netty.handler.codec.spdy.SpdySynStreamFrame setPriority(byte r4) {
            r3 = this;
            if (r4 < 0) goto L8
            r0 = 7
            if (r4 > r0) goto L8
            r3.priority = r4
            return r3
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Priority must be between 0 and 7 inclusive: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyHeadersFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynStreamFrame r1 = r0.setStreamId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySynStreamFrame r1 = r0.setStreamId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame, io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdySynStreamFrame setStreamId(int r1) {
            r0 = this;
            super.setStreamId(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySynStreamFrame
    public io.netty.handler.codec.spdy.SpdySynStreamFrame setUnidirectional(boolean r1) {
            r0 = this;
            r0.unidirectional = r1
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
            java.lang.String r1 = "; unidirectional: "
            r0.append(r1)
            boolean r1 = r3.isUnidirectional()
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
            int r2 = r3.associatedStreamId
            if (r2 == 0) goto L50
            java.lang.String r2 = "--> Associated-To-Stream-ID = "
            r0.append(r2)
            int r2 = r3.associatedStreamId()
            r0.append(r2)
            r0.append(r1)
        L50:
            java.lang.String r2 = "--> Priority = "
            r0.append(r2)
            byte r2 = r3.priority()
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

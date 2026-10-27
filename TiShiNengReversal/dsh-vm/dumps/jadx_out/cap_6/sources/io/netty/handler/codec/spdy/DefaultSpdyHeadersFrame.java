package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdyHeadersFrame extends io.netty.handler.codec.spdy.DefaultSpdyStreamFrame implements io.netty.handler.codec.spdy.SpdyHeadersFrame {
    private final io.netty.handler.codec.spdy.SpdyHeaders headers;
    private boolean invalid;
    private boolean truncated;

    public DefaultSpdyHeadersFrame(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public DefaultSpdyHeadersFrame(int r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            io.netty.handler.codec.spdy.DefaultSpdyHeaders r1 = new io.netty.handler.codec.spdy.DefaultSpdyHeaders
            r1.<init>(r2)
            r0.headers = r1
            return
    }

    protected void appendHeaders(java.lang.StringBuilder r4) {
            r3 = this;
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r3.headers()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "    "
            r4.append(r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r4.append(r1)
            goto L8
        L36:
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame
    public io.netty.handler.codec.spdy.SpdyHeaders headers() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r1.headers
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame
    public boolean isInvalid() {
            r1 = this;
            boolean r0 = r1.invalid
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame
    public boolean isTruncated() {
            r1 = this;
            boolean r0 = r1.truncated
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame
    public io.netty.handler.codec.spdy.SpdyHeadersFrame setInvalid() {
            r1 = this;
            r0 = 1
            r1.invalid = r0
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyHeadersFrame setLast(boolean r1) {
            r0 = this;
            super.setLast(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyHeadersFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyHeadersFrame setStreamId(int r1) {
            r0 = this;
            super.setStreamId(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyHeadersFrame r1 = r0.setStreamId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeadersFrame
    public io.netty.handler.codec.spdy.SpdyHeadersFrame setTruncated() {
            r1 = this;
            r0 = 1
            r1.truncated = r0
            return r1
    }

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

package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultHttp2ResetFrame extends io.netty.handler.codec.http2.AbstractHttp2StreamFrame implements io.netty.handler.codec.http2.Http2ResetFrame {
    private final long errorCode;

    public DefaultHttp2ResetFrame(long r1) {
            r0 = this;
            r0.<init>()
            r0.errorCode = r1
            return
    }

    public DefaultHttp2ResetFrame(io.netty.handler.codec.http2.Http2Error r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "error"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http2.Http2Error r3 = (io.netty.handler.codec.http2.Http2Error) r3
            long r0 = r3.code()
            r2.errorCode = r0
            return
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http2.DefaultHttp2ResetFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r7
            io.netty.handler.codec.http2.DefaultHttp2ResetFrame r0 = (io.netty.handler.codec.http2.DefaultHttp2ResetFrame) r0
            boolean r7 = super.equals(r7)
            if (r7 == 0) goto L19
            long r2 = r6.errorCode
            long r4 = r0.errorCode
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L19
            r7 = 1
            return r7
        L19:
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2ResetFrame
    public long errorCode() {
            r2 = this;
            long r0 = r2.errorCode
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame
    public int hashCode() {
            r5 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            long r1 = r5.errorCode
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "RST_STREAM"
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2ResetFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.DefaultHttp2ResetFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            super.stream(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2ResetFrame r1 = r0.stream(r1)
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(stream="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2FrameStream r1 = r3.stream()
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            long r1 = r3.errorCode
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

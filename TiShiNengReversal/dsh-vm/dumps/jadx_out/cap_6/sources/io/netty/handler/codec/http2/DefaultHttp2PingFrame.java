package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2PingFrame implements io.netty.handler.codec.http2.Http2PingFrame {
    private final boolean ack;
    private final long content;

    public DefaultHttp2PingFrame(long r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2PingFrame(long r1, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.content = r1
            r0.ack = r3
            return
    }

    @Override // io.netty.handler.codec.http2.Http2PingFrame
    public boolean ack() {
            r1 = this;
            boolean r0 = r1.ack
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2PingFrame
    public long content() {
            r2 = this;
            long r0 = r2.content
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http2.Http2PingFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.Http2PingFrame r7 = (io.netty.handler.codec.http2.Http2PingFrame) r7
            boolean r0 = r6.ack
            boolean r2 = r7.ack()
            if (r0 != r2) goto L1c
            long r2 = r6.content
            long r4 = r7.content()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L1c
            r7 = 1
            return r7
        L1c:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.ack
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "PING"
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(content="
            r0.append(r1)
            long r1 = r3.content
            r0.append(r1)
            java.lang.String r1 = ", ack="
            r0.append(r1)
            boolean r1 = r3.ack
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

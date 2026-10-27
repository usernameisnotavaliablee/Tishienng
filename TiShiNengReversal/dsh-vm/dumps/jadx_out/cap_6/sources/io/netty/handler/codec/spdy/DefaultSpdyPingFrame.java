package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdyPingFrame implements io.netty.handler.codec.spdy.SpdyPingFrame {
    private int id;

    public DefaultSpdyPingFrame(int r1) {
            r0 = this;
            r0.<init>()
            r0.setId(r1)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyPingFrame
    public int id() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyPingFrame
    public io.netty.handler.codec.spdy.SpdyPingFrame setId(int r1) {
            r0 = this;
            r0.id = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.append(r1)
            java.lang.String r1 = "--> ID = "
            r0.append(r1)
            int r1 = r2.id()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

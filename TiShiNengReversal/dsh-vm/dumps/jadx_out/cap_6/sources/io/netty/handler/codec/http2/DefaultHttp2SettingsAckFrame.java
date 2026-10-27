package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultHttp2SettingsAckFrame implements io.netty.handler.codec.http2.Http2SettingsAckFrame {
    DefaultHttp2SettingsAckFrame() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2SettingsAckFrame, io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "SETTINGS(ACK)"
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            return r0
    }
}

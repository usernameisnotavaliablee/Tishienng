package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2SettingsFrame implements io.netty.handler.codec.http2.Http2SettingsFrame {
    private final io.netty.handler.codec.http2.Http2Settings settings;

    public DefaultHttp2SettingsFrame(io.netty.handler.codec.http2.Http2Settings r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "settings"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2Settings r2 = (io.netty.handler.codec.http2.Http2Settings) r2
            r1.settings = r2
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http2.Http2SettingsFrame
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.netty.handler.codec.http2.Http2SettingsFrame r2 = (io.netty.handler.codec.http2.Http2SettingsFrame) r2
            io.netty.handler.codec.http2.Http2Settings r0 = r1.settings
            io.netty.handler.codec.http2.Http2Settings r2 = r2.settings()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = r1.settings
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2SettingsFrame, io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "SETTINGS"
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2SettingsFrame
    public io.netty.handler.codec.http2.Http2Settings settings() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = r1.settings
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(settings="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2Settings r1 = r2.settings
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

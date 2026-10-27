package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DecoratingHttp2ConnectionEncoder extends io.netty.handler.codec.http2.DecoratingHttp2FrameWriter implements io.netty.handler.codec.http2.Http2ConnectionEncoder, io.netty.handler.codec.http2.Http2SettingsReceivedConsumer {
    private final io.netty.handler.codec.http2.Http2ConnectionEncoder delegate;

    public DecoratingHttp2ConnectionEncoder(io.netty.handler.codec.http2.Http2ConnectionEncoder r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r2 = (io.netty.handler.codec.http2.Http2ConnectionEncoder) r2
            r1.delegate = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2SettingsReceivedConsumer
    public void consumeReceivedSettings(io.netty.handler.codec.http2.Http2Settings r3) {
            r2 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r2.delegate
            boolean r1 = r0 instanceof io.netty.handler.codec.http2.Http2SettingsReceivedConsumer
            if (r1 == 0) goto Lc
            io.netty.handler.codec.http2.Http2SettingsReceivedConsumer r0 = (io.netty.handler.codec.http2.Http2SettingsReceivedConsumer) r0
            r0.consumeReceivedSettings(r3)
            return
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "delegate "
            r0.append(r1)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r2.delegate
            r0.append(r1)
            java.lang.String r1 = " is not an instance of "
            r0.append(r1)
            java.lang.Class<io.netty.handler.codec.http2.Http2SettingsReceivedConsumer> r1 = io.netty.handler.codec.http2.Http2SettingsReceivedConsumer.class
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2RemoteFlowController flowController() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r0.flowController()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2FrameWriter frameWriter() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r0.frameWriter()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public void lifecycleManager(io.netty.handler.codec.http2.Http2LifecycleManager r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.delegate
            r0.lifecycleManager(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2Settings pollSentSettings() {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.delegate
            io.netty.handler.codec.http2.Http2Settings r0 = r0.pollSentSettings()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public void remoteSettings(io.netty.handler.codec.http2.Http2Settings r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r1.delegate
            r0.remoteSettings(r2)
            return
    }
}

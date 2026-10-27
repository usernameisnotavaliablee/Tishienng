package io.netty.handler.codec.rtsp;

import io.netty.handler.codec.http.HttpMessage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class RtspObjectEncoder<H extends io.netty.handler.codec.http.HttpMessage> extends io.netty.handler.codec.http.HttpObjectEncoder<H> {
    protected RtspObjectEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectEncoder, io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.http.FullHttpMessage
            return r1
    }
}

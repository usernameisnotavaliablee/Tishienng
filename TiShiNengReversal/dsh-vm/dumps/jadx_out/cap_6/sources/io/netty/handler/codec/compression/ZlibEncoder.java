package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ZlibEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    protected ZlibEncoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public abstract io.netty.channel.ChannelFuture close();

    public abstract io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r1);

    public abstract boolean isClosed();
}

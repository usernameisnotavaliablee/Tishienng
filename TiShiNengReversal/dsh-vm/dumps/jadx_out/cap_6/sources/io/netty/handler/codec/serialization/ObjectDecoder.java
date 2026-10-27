package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ObjectDecoder extends io.netty.handler.codec.LengthFieldBasedFrameDecoder {
    private final io.netty.handler.codec.serialization.ClassResolver classResolver;

    public ObjectDecoder(int r7, io.netty.handler.codec.serialization.ClassResolver r8) {
            r6 = this;
            r4 = 0
            r5 = 4
            r2 = 0
            r3 = 4
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.classResolver = r8
            return
    }

    public ObjectDecoder(io.netty.handler.codec.serialization.ClassResolver r2) {
            r1 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.handler.codec.LengthFieldBasedFrameDecoder
    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r3 = super.decode(r3, r4)
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            if (r3 != 0) goto La
            r3 = 0
            return r3
        La:
            io.netty.handler.codec.serialization.CompactObjectInputStream r4 = new io.netty.handler.codec.serialization.CompactObjectInputStream
            io.netty.buffer.ByteBufInputStream r0 = new io.netty.buffer.ByteBufInputStream
            r1 = 1
            r0.<init>(r3, r1)
            io.netty.handler.codec.serialization.ClassResolver r3 = r2.classResolver
            r4.<init>(r0, r3)
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L1f
            r4.close()
            return r3
        L1f:
            r3 = move-exception
            r4.close()
            throw r3
    }
}

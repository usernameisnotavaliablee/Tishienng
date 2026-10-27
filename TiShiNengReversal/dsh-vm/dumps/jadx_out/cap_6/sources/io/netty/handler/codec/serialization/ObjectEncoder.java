package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ObjectEncoder extends io.netty.handler.codec.MessageToByteEncoder<java.io.Serializable> {
    private static final byte[] LENGTH_PLACEHOLDER = null;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            io.netty.handler.codec.serialization.ObjectEncoder.LENGTH_PLACEHOLDER = r0
            return
    }

    public ObjectEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r4, java.io.Serializable r5, io.netty.buffer.ByteBuf r6) throws java.lang.Exception {
            r3 = this;
            int r4 = r6.writerIndex()
            io.netty.buffer.ByteBufOutputStream r0 = new io.netty.buffer.ByteBufOutputStream
            r0.<init>(r6)
            r1 = 0
            byte[] r2 = io.netty.handler.codec.serialization.ObjectEncoder.LENGTH_PLACEHOLDER     // Catch: java.lang.Throwable -> L2b
            r0.write(r2)     // Catch: java.lang.Throwable -> L2b
            io.netty.handler.codec.serialization.CompactObjectOutputStream r2 = new io.netty.handler.codec.serialization.CompactObjectOutputStream     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r2.writeObject(r5)     // Catch: java.lang.Throwable -> L28
            r2.flush()     // Catch: java.lang.Throwable -> L28
            r2.close()
            int r5 = r6.writerIndex()
            int r5 = r5 - r4
            int r5 = r5 + (-4)
            r6.setInt(r4, r5)
            return
        L28:
            r4 = move-exception
            r1 = r2
            goto L2c
        L2b:
            r4 = move-exception
        L2c:
            if (r1 == 0) goto L32
            r1.close()
            goto L35
        L32:
            r0.close()
        L35:
            throw r4
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, java.io.Serializable r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.encode2(r1, r2, r3)
            return
    }
}

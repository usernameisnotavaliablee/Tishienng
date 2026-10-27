package io.netty.handler.codec.memcache.binary;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractBinaryMemcacheEncoder<M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage> extends io.netty.handler.codec.memcache.AbstractMemcacheObjectEncoder<M> {
    private static final int MINIMUM_HEADER_SIZE = 24;

    public AbstractBinaryMemcacheEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void encodeExtras(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2) {
            if (r2 == 0) goto Lc
            boolean r0 = r2.isReadable()
            if (r0 != 0) goto L9
            goto Lc
        L9:
            r1.writeBytes(r2)
        Lc:
            return
    }

    private static void encodeKey(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2) {
            if (r2 == 0) goto Lc
            boolean r0 = r2.isReadable()
            if (r0 != 0) goto L9
            goto Lc
        L9:
            r1.writeBytes(r2)
        Lc:
            return
    }

    protected abstract void encodeHeader(io.netty.buffer.ByteBuf r1, M r2);

    @Override // io.netty.handler.codec.memcache.AbstractMemcacheObjectEncoder
    protected /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf encodeMessage(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.memcache.MemcacheMessage r2) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r2 = (io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage) r2
            io.netty.buffer.ByteBuf r1 = r0.encodeMessage(r1, r2)
            return r1
    }

    protected io.netty.buffer.ByteBuf encodeMessage(io.netty.channel.ChannelHandlerContext r3, M r4) {
            r2 = this;
            io.netty.buffer.ByteBufAllocator r3 = r3.alloc()
            byte r0 = r4.extrasLength()
            int r0 = r0 + 24
            short r1 = r4.keyLength()
            int r0 = r0 + r1
            io.netty.buffer.ByteBuf r3 = r3.buffer(r0)
            r2.encodeHeader(r3, r4)
            io.netty.buffer.ByteBuf r0 = r4.extras()
            encodeExtras(r3, r0)
            io.netty.buffer.ByteBuf r4 = r4.key()
            encodeKey(r3, r4)
            return r3
    }
}

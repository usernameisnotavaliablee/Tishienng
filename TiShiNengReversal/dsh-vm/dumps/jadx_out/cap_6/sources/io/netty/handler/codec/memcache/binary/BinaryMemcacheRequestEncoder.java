package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BinaryMemcacheRequestEncoder extends io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheEncoder<io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest> {
    public BinaryMemcacheRequestEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheEncoder
    protected /* bridge */ /* synthetic */ void encodeHeader(io.netty.buffer.ByteBuf r1, io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r2) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r2 = (io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest) r2
            r0.encodeHeader2(r1, r2)
            return
    }

    /* renamed from: encodeHeader, reason: avoid collision after fix types in other method */
    protected void encodeHeader2(io.netty.buffer.ByteBuf r3, io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r4) {
            r2 = this;
            byte r0 = r4.magic()
            r3.writeByte(r0)
            byte r0 = r4.opcode()
            r3.writeByte(r0)
            short r0 = r4.keyLength()
            r3.writeShort(r0)
            byte r0 = r4.extrasLength()
            r3.writeByte(r0)
            byte r0 = r4.dataType()
            r3.writeByte(r0)
            short r0 = r4.reserved()
            r3.writeShort(r0)
            int r0 = r4.totalBodyLength()
            r3.writeInt(r0)
            int r0 = r4.opaque()
            r3.writeInt(r0)
            long r0 = r4.cas()
            r3.writeLong(r0)
            return
    }
}

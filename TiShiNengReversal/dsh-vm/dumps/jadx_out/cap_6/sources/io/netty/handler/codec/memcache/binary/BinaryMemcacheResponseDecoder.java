package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BinaryMemcacheResponseDecoder extends io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder<io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse> {
    public BinaryMemcacheResponseDecoder() {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0)
            return
    }

    public BinaryMemcacheResponseDecoder(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse buildInvalidMessage() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse r0 = r1.buildInvalidMessage2()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder
    /* renamed from: buildInvalidMessage, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse buildInvalidMessage2() {
            r2 = this;
            io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse r0 = new io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.<init>(r1, r1)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse decodeHeader(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse r1 = r0.decodeHeader2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder
    /* renamed from: decodeHeader, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse decodeHeader2(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse r0 = new io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse
            r0.<init>()
            byte r1 = r4.readByte()
            r0.setMagic(r1)
            byte r1 = r4.readByte()
            r0.setOpcode(r1)
            short r1 = r4.readShort()
            r0.setKeyLength(r1)
            byte r1 = r4.readByte()
            r0.setExtrasLength(r1)
            byte r1 = r4.readByte()
            r0.setDataType(r1)
            short r1 = r4.readShort()
            r0.setStatus(r1)
            int r1 = r4.readInt()
            r0.setTotalBodyLength(r1)
            int r1 = r4.readInt()
            r0.setOpaque(r1)
            long r1 = r4.readLong()
            r0.setCas(r1)
            return r0
    }
}

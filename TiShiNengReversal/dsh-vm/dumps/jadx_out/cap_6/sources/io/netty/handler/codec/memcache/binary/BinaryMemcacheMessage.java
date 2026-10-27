package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface BinaryMemcacheMessage extends io.netty.handler.codec.memcache.MemcacheMessage {
    long cas();

    byte dataType();

    io.netty.buffer.ByteBuf extras();

    byte extrasLength();

    io.netty.buffer.ByteBuf key();

    short keyLength();

    byte magic();

    int opaque();

    byte opcode();

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo39retain();

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo40retain(int r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setCas(long r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setDataType(byte r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setExtras(io.netty.buffer.ByteBuf r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setKey(io.netty.buffer.ByteBuf r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setMagic(byte r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setOpaque(int r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setOpcode(byte r1);

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setTotalBodyLength(int r1);

    int totalBodyLength();

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo41touch();

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo42touch(java.lang.Object r1);
}

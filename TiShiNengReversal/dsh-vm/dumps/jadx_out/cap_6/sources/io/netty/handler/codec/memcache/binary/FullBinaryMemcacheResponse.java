package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FullBinaryMemcacheResponse extends io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse, io.netty.handler.codec.memcache.FullMemcacheMessage {
    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse copy();

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse duplicate();

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo39retain();

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo40retain(int r1);

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse retainedDuplicate();

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo41touch();

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo42touch(java.lang.Object r1);
}

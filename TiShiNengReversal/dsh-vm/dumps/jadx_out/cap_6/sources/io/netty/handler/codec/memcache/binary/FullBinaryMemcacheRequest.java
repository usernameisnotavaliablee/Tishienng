package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FullBinaryMemcacheRequest extends io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest, io.netty.handler.codec.memcache.FullMemcacheMessage {
    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest copy();

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest duplicate();

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest mo39retain();

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest mo40retain(int r1);

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest retainedDuplicate();

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest mo41touch();

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.memcache.binary.FullBinaryMemcacheRequest mo42touch(java.lang.Object r1);
}

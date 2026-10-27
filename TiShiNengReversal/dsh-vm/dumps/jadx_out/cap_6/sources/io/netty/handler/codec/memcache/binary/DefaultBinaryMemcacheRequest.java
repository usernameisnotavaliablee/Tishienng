package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultBinaryMemcacheRequest extends io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage implements io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest {
    public static final byte REQUEST_MAGIC_BYTE = Byte.MIN_VALUE;
    private short reserved;

    public DefaultBinaryMemcacheRequest() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    public DefaultBinaryMemcacheRequest(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultBinaryMemcacheRequest(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -128(0xffffffffffffff80, float:NaN)
            r0.setMagic(r1)
            return
    }

    void copyMeta(io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheRequest r2) {
            r1 = this;
            super.copyMeta(r2)
            short r0 = r1.reserved
            r2.reserved = r0
            return
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest
    public short reserved() {
            r1 = this;
            short r0 = r1.reserved
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest setReserved(short r1) {
            r0 = this;
            r0.reserved = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequest r1 = r0.mo42touch(r1)
            return r1
    }
}

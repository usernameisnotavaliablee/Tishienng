package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultFullBinaryMemcacheResponse extends io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse implements io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse {
    private final io.netty.buffer.ByteBuf content;

    public DefaultFullBinaryMemcacheResponse(io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultFullBinaryMemcacheResponse(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 == 0) goto L19
            r0.content = r3
            short r1 = r0.keyLength()
            byte r2 = r0.extrasLength()
            int r1 = r1 + r2
            int r2 = r3.readableBytes()
            int r1 = r1 + r2
            r0.setTotalBodyLength(r1)
            return
        L19:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Supplied content is null."
            r1.<init>(r2)
            throw r1
    }

    private io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse newInstance(io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            io.netty.handler.codec.memcache.binary.DefaultFullBinaryMemcacheResponse r0 = new io.netty.handler.codec.memcache.binary.DefaultFullBinaryMemcacheResponse
            r0.<init>(r2, r3, r4)
            r1.copyMeta(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage copy() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent copy() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent copy() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse, io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse copy() {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.key()
            if (r0 == 0) goto La
            io.netty.buffer.ByteBuf r0 = r0.copy()
        La:
            io.netty.buffer.ByteBuf r1 = r3.extras()
            if (r1 == 0) goto L14
            io.netty.buffer.ByteBuf r1 = r1.copy()
        L14:
            io.netty.buffer.ByteBuf r2 = r3.content()
            io.netty.buffer.ByteBuf r2 = r2.copy()
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r3.newInstance(r0, r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    protected void deallocate() {
            r1 = this;
            super.deallocate()
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.release()
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse, io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse duplicate() {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.key()
            if (r0 == 0) goto La
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
        La:
            io.netty.buffer.ByteBuf r1 = r3.extras()
            if (r1 == 0) goto L14
            io.netty.buffer.ByteBuf r1 = r1.duplicate()
        L14:
            io.netty.buffer.ByteBuf r2 = r3.content()
            io.netty.buffer.ByteBuf r2 = r2.duplicate()
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r3.newInstance(r0, r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse, io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse replace(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.key()
            if (r0 == 0) goto La
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
        La:
            io.netty.buffer.ByteBuf r1 = r2.extras()
            if (r1 == 0) goto L14
            io.netty.buffer.ByteBuf r1 = r1.retainedDuplicate()
        L14:
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r3 = r2.newInstance(r0, r1, r3)
            return r3
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse, io.netty.handler.codec.memcache.FullMemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.FullMemcacheMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.LastMemcacheContent touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheResponse mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse mo42touch(java.lang.Object r2) {
            r1 = this;
            super.mo42touch(r2)
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse, io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.FullBinaryMemcacheResponse r1 = r0.mo42touch(r1)
            return r1
    }
}

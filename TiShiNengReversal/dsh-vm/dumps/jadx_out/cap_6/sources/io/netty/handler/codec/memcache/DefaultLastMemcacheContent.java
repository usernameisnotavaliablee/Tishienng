package io.netty.handler.codec.memcache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultLastMemcacheContent extends io.netty.handler.codec.memcache.DefaultMemcacheContent implements io.netty.handler.codec.memcache.LastMemcacheContent {
    public DefaultLastMemcacheContent() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer()
            r1.<init>(r0)
            return
    }

    public DefaultLastMemcacheContent(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.LastMemcacheContent copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent copy() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.LastMemcacheContent duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.LastMemcacheContent replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.memcache.DefaultLastMemcacheContent r0 = new io.netty.handler.codec.memcache.DefaultLastMemcacheContent
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.LastMemcacheContent mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.LastMemcacheContent mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.memcache.LastMemcacheContent retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.LastMemcacheContent mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.LastMemcacheContent mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheContent mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.DefaultMemcacheContent
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.LastMemcacheContent r1 = r0.mo42touch(r1)
            return r1
    }
}

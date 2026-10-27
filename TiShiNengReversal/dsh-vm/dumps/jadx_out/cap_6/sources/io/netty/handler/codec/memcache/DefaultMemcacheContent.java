package io.netty.handler.codec.memcache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultMemcacheContent extends io.netty.handler.codec.memcache.AbstractMemcacheObject implements io.netty.handler.codec.memcache.MemcacheContent {
    private final io.netty.buffer.ByteBuf content;

    public DefaultMemcacheContent(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.content = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Content cannot be null."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.copy()
            return r0
    }

    public io.netty.handler.codec.memcache.MemcacheContent copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.replace(r0)
            return r0
    }

    protected void deallocate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.release()
            return
    }

    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.duplicate()
            return r0
    }

    public io.netty.handler.codec.memcache.MemcacheContent duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.replace(r0)
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheContent r1 = r0.replace(r1)
            return r1
    }

    public io.netty.handler.codec.memcache.MemcacheContent replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.memcache.DefaultMemcacheContent r0 = new io.netty.handler.codec.memcache.DefaultMemcacheContent
            r0.<init>(r2)
            return r0
    }

    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.mo39retain()
            return r0
    }

    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheContent r1 = r0.mo40retain(r1)
            return r1
    }

    /* renamed from: retain */
    public io.netty.handler.codec.memcache.MemcacheContent mo39retain() {
            r0 = this;
            super.retain()
            return r0
    }

    /* renamed from: retain */
    public io.netty.handler.codec.memcache.MemcacheContent mo40retain(int r1) {
            r0 = this;
            super.retain(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheContent r1 = r0.mo40retain(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.retainedDuplicate()
            return r0
    }

    public io.netty.handler.codec.memcache.MemcacheContent retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.replace(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(data: "
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r2.content()
            r0.append(r1)
            java.lang.String r1 = ", decoderResult: "
            r0.append(r1)
            io.netty.handler.codec.DecoderResult r1 = r2.decoderResult()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.mo41touch()
            return r0
    }

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheContent r1 = r0.mo42touch(r1)
            return r1
    }

    /* renamed from: touch */
    public io.netty.handler.codec.memcache.MemcacheContent mo41touch() {
            r0 = this;
            super.touch()
            return r0
    }

    /* renamed from: touch */
    public io.netty.handler.codec.memcache.MemcacheContent mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.memcache.MemcacheContent r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.MemcacheContent r1 = r0.mo42touch(r1)
            return r1
    }
}

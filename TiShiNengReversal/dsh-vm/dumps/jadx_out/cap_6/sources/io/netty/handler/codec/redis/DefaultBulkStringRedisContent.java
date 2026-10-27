package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultBulkStringRedisContent extends io.netty.buffer.DefaultByteBufHolder implements io.netty.handler.codec.redis.BulkStringRedisContent {
    public DefaultBulkStringRedisContent(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.redis.BulkStringRedisContent copy() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.copy()
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = (io.netty.handler.codec.redis.BulkStringRedisContent) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.redis.BulkStringRedisContent duplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.duplicate()
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = (io.netty.handler.codec.redis.BulkStringRedisContent) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.redis.BulkStringRedisContent replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.redis.DefaultBulkStringRedisContent r0 = new io.netty.handler.codec.redis.DefaultBulkStringRedisContent
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.redis.BulkStringRedisContent mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.redis.BulkStringRedisContent mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.redis.BulkStringRedisContent retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.retainedDuplicate()
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = (io.netty.handler.codec.redis.BulkStringRedisContent) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "content="
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r2.content()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.redis.BulkStringRedisContent mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.redis.BulkStringRedisContent mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r1 = r0.mo42touch(r1)
            return r1
    }
}

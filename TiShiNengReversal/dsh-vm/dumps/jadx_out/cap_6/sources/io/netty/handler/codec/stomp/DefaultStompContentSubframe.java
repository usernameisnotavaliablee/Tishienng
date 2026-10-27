package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultStompContentSubframe extends io.netty.buffer.DefaultByteBufHolder implements io.netty.handler.codec.stomp.StompContentSubframe {
    private io.netty.handler.codec.DecoderResult decoderResult;

    public DefaultStompContentSubframe(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult r1 = io.netty.handler.codec.DecoderResult.SUCCESS
            r0.decoderResult = r1
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompContentSubframe copy() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.copy()
            io.netty.handler.codec.stomp.StompContentSubframe r0 = (io.netty.handler.codec.stomp.StompContentSubframe) r0
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public io.netty.handler.codec.DecoderResult decoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompContentSubframe duplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.duplicate()
            io.netty.handler.codec.stomp.StompContentSubframe r0 = (io.netty.handler.codec.stomp.StompContentSubframe) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompContentSubframe replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.stomp.DefaultStompContentSubframe r0 = new io.netty.handler.codec.stomp.DefaultStompContentSubframe
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.stomp.StompContentSubframe mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.stomp.StompContentSubframe mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompContentSubframe retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.retainedDuplicate()
            io.netty.handler.codec.stomp.StompContentSubframe r0 = (io.netty.handler.codec.stomp.StompContentSubframe) r0
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public void setDecoderResult(io.netty.handler.codec.DecoderResult r1) {
            r0 = this;
            r0.decoderResult = r1
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DefaultStompContent{decoderResult="
            r0.append(r1)
            io.netty.handler.codec.DecoderResult r1 = r2.decoderResult
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.stomp.StompContentSubframe mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.stomp.StompContentSubframe mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompContentSubframe r1 = r0.mo42touch(r1)
            return r1
    }
}

package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class PemValue extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.ssl.PemEncoded {
    private final io.netty.buffer.ByteBuf content;
    private final boolean sensitive;

    PemValue(io.netty.buffer.ByteBuf r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "content"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r1.content = r2
            r1.sensitive = r3
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            int r0 = r2.refCnt()
            if (r0 <= 0) goto L9
            io.netty.buffer.ByteBuf r0 = r2.content
            return r0
        L9:
            io.netty.util.IllegalReferenceCountException r1 = new io.netty.util.IllegalReferenceCountException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded copy() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemValue copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.ssl.PemValue r0 = r1.replace(r0)
            return r0
    }

    protected void deallocate() {
            r1 = this;
            boolean r0 = r1.sensitive
            if (r0 == 0) goto L9
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.handler.ssl.SslUtils.zeroout(r0)
        L9:
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.release()
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded duplicate() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemValue duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.ssl.PemValue r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded
    public boolean isSensitive() {
            r1 = this;
            boolean r0 = r1.sensitive
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemValue replace(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.ssl.PemValue r0 = new io.netty.handler.ssl.PemValue
            boolean r1 = r2.sensitive
            r0.<init>(r3, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo39retain() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo40retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.ssl.PemValue mo39retain() {
            r1 = this;
            io.netty.util.ReferenceCounted r0 = super.retain()
            io.netty.handler.ssl.PemValue r0 = (io.netty.handler.ssl.PemValue) r0
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.ssl.PemValue mo40retain(int r1) {
            r0 = this;
            io.netty.util.ReferenceCounted r1 = super.retain(r1)
            io.netty.handler.ssl.PemValue r1 = (io.netty.handler.ssl.PemValue) r1
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded retainedDuplicate() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemValue retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.ssl.PemValue r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo41touch() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.ssl.PemValue mo41touch() {
            r1 = this;
            io.netty.util.ReferenceCounted r0 = super.touch()
            io.netty.handler.ssl.PemValue r0 = (io.netty.handler.ssl.PemValue) r0
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.ssl.PemValue mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.ssl.PemValue r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemValue r1 = r0.mo42touch(r1)
            return r1
    }
}

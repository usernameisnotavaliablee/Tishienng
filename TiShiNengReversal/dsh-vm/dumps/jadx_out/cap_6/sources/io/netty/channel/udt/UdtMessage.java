package io.netty.channel.udt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UdtMessage extends io.netty.buffer.DefaultByteBufHolder {
    public UdtMessage(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.udt.UdtMessage copy() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.copy()
            io.netty.channel.udt.UdtMessage r0 = (io.netty.channel.udt.UdtMessage) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.udt.UdtMessage duplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.duplicate()
            io.netty.channel.udt.UdtMessage r0 = (io.netty.channel.udt.UdtMessage) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.channel.udt.UdtMessage r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.udt.UdtMessage replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = new io.netty.channel.udt.UdtMessage
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.channel.udt.UdtMessage mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.channel.udt.UdtMessage mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.channel.udt.UdtMessage retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.retainedDuplicate()
            io.netty.channel.udt.UdtMessage r0 = (io.netty.channel.udt.UdtMessage) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.udt.UdtMessage r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.channel.udt.UdtMessage mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.channel.udt.UdtMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.channel.udt.UdtMessage r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.udt.UdtMessage r1 = r0.mo42touch(r1)
            return r1
    }
}

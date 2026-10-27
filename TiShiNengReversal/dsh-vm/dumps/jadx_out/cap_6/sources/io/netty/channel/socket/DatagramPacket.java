package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DatagramPacket extends io.netty.channel.DefaultAddressedEnvelope<io.netty.buffer.ByteBuf, java.net.InetSocketAddress> implements io.netty.buffer.ByteBufHolder {
    public DatagramPacket(io.netty.buffer.ByteBuf r1, java.net.InetSocketAddress r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public DatagramPacket(io.netty.buffer.ByteBuf r1, java.net.InetSocketAddress r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf content() {
            r1 = this;
            java.lang.Object r0 = super.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.channel.socket.DatagramPacket copy() {
            r1 = this;
            java.lang.Object r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.channel.socket.DatagramPacket r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.channel.socket.DatagramPacket duplicate() {
            r1 = this;
            java.lang.Object r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.channel.socket.DatagramPacket r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.channel.socket.DatagramPacket replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.channel.socket.DatagramPacket r0 = new io.netty.channel.socket.DatagramPacket
            java.net.SocketAddress r1 = r3.recipient()
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.net.SocketAddress r2 = r3.sender()
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.mo179retain()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.mo180retain(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo179retain() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.mo179retain()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo180retain(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.mo180retain(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public io.netty.channel.socket.DatagramPacket mo179retain() {
            r0 = this;
            super.mo179retain()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public io.netty.channel.socket.DatagramPacket mo180retain(int r1) {
            r0 = this;
            super.mo180retain(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo39retain() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.mo179retain()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo40retain(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.mo180retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.channel.socket.DatagramPacket retainedDuplicate() {
            r1 = this;
            java.lang.Object r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.channel.socket.DatagramPacket r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.mo181touch()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.mo182touch(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo181touch() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.mo181touch()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo182touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.mo182touch(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public io.netty.channel.socket.DatagramPacket mo181touch() {
            r0 = this;
            super.mo181touch()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public io.netty.channel.socket.DatagramPacket mo182touch(java.lang.Object r1) {
            r0 = this;
            super.mo182touch(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo41touch() {
            r1 = this;
            io.netty.channel.socket.DatagramPacket r0 = r1.mo181touch()
            return r0
    }

    @Override // io.netty.channel.DefaultAddressedEnvelope, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r1 = r0.mo182touch(r1)
            return r1
    }
}

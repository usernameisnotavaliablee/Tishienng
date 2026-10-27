package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsRawRecord extends io.netty.handler.codec.dns.DnsRecord, io.netty.buffer.ByteBufHolder {
    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.dns.DnsRawRecord copy();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.dns.DnsRawRecord duplicate();

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.dns.DnsRawRecord replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.dns.DnsRawRecord mo39retain();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.dns.DnsRawRecord mo40retain(int r1);

    @Override // io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.dns.DnsRawRecord retainedDuplicate();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.dns.DnsRawRecord mo41touch();

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.dns.DnsRawRecord mo42touch(java.lang.Object r1);
}

package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DnsRecordResolveContext extends io.netty.resolver.dns.DnsResolveContext<io.netty.handler.codec.dns.DnsRecord> {
    DnsRecordResolveContext(io.netty.resolver.dns.DnsNameResolver r8, io.netty.handler.codec.dns.DnsQuestion r9, io.netty.handler.codec.dns.DnsRecord[] r10, io.netty.resolver.dns.DnsServerAddressStream r11) {
            r7 = this;
            java.lang.String r2 = r9.name()
            int r3 = r9.dnsClass()
            io.netty.handler.codec.dns.DnsRecordType r9 = r9.type()
            r0 = 1
            io.netty.handler.codec.dns.DnsRecordType[] r4 = new io.netty.handler.codec.dns.DnsRecordType[r0]
            r0 = 0
            r4[r0] = r9
            r0 = r7
            r1 = r8
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private DnsRecordResolveContext(io.netty.resolver.dns.DnsNameResolver r1, java.lang.String r2, int r3, io.netty.handler.codec.dns.DnsRecordType[] r4, io.netty.handler.codec.dns.DnsRecord[] r5, io.netty.resolver.dns.DnsServerAddressStream r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    /* renamed from: cache, reason: avoid collision after fix types in other method */
    void cache2(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, io.netty.handler.codec.dns.DnsRecord r3, io.netty.handler.codec.dns.DnsRecord r4) {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* bridge */ /* synthetic */ void cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, io.netty.handler.codec.dns.DnsRecord r3, io.netty.handler.codec.dns.DnsRecord r4) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRecord r4 = (io.netty.handler.codec.dns.DnsRecord) r4
            r0.cache2(r1, r2, r3, r4)
            return
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    void cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, java.net.UnknownHostException r3) {
            r0 = this;
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.resolver.dns.DnsResolveContext
    io.netty.handler.codec.dns.DnsRecord convertRecord(io.netty.handler.codec.dns.DnsRecord r1, java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3, io.netty.channel.EventLoop r4) {
            r0 = this;
            java.lang.Object r1 = io.netty.util.ReferenceCountUtil.retain(r1)
            io.netty.handler.codec.dns.DnsRecord r1 = (io.netty.handler.codec.dns.DnsRecord) r1
            return r1
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsRecord convertRecord(io.netty.handler.codec.dns.DnsRecord r1, java.lang.String r2, io.netty.handler.codec.dns.DnsRecord[] r3, io.netty.channel.EventLoop r4) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRecord r1 = r0.convertRecord(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    java.util.List<io.netty.handler.codec.dns.DnsRecord> filterResults(java.util.List<io.netty.handler.codec.dns.DnsRecord> r1) {
            r0 = this;
            return r1
    }

    /* renamed from: isCompleteEarly, reason: avoid collision after fix types in other method */
    boolean isCompleteEarly2(io.netty.handler.codec.dns.DnsRecord r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    /* bridge */ /* synthetic */ boolean isCompleteEarly(io.netty.handler.codec.dns.DnsRecord r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRecord r1 = (io.netty.handler.codec.dns.DnsRecord) r1
            boolean r1 = r0.isCompleteEarly2(r1)
            return r1
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    boolean isDuplicateAllowed() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.resolver.dns.DnsResolveContext
    io.netty.resolver.dns.DnsResolveContext<io.netty.handler.codec.dns.DnsRecord> newResolverContext(io.netty.resolver.dns.DnsNameResolver r8, java.lang.String r9, int r10, io.netty.handler.codec.dns.DnsRecordType[] r11, io.netty.handler.codec.dns.DnsRecord[] r12, io.netty.resolver.dns.DnsServerAddressStream r13) {
            r7 = this;
            io.netty.resolver.dns.DnsRecordResolveContext r0 = new io.netty.resolver.dns.DnsRecordResolveContext
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}

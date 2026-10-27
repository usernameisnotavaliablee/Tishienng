package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsQuery extends io.netty.handler.codec.dns.DnsMessage {
    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery clear();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery clear(io.netty.handler.codec.dns.DnsSection r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery retain();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery retain(int r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery setId(int r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery setOpCode(io.netty.handler.codec.dns.DnsOpCode r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery setRecursionDesired(boolean r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery setZ(int r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery touch();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsQuery touch(java.lang.Object r1);
}

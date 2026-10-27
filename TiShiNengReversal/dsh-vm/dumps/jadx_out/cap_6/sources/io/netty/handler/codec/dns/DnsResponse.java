package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsResponse extends io.netty.handler.codec.dns.DnsMessage {
    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse clear();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse clear(io.netty.handler.codec.dns.DnsSection r1);

    io.netty.handler.codec.dns.DnsResponseCode code();

    boolean isAuthoritativeAnswer();

    boolean isRecursionAvailable();

    boolean isTruncated();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse retain();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse retain(int r1);

    io.netty.handler.codec.dns.DnsResponse setAuthoritativeAnswer(boolean r1);

    io.netty.handler.codec.dns.DnsResponse setCode(io.netty.handler.codec.dns.DnsResponseCode r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse setId(int r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse setOpCode(io.netty.handler.codec.dns.DnsOpCode r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2);

    io.netty.handler.codec.dns.DnsResponse setRecursionAvailable(boolean r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse setRecursionDesired(boolean r1);

    io.netty.handler.codec.dns.DnsResponse setTruncated(boolean r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse setZ(int r1);

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse touch();

    @Override // io.netty.handler.codec.dns.DnsMessage
    io.netty.handler.codec.dns.DnsResponse touch(java.lang.Object r1);
}

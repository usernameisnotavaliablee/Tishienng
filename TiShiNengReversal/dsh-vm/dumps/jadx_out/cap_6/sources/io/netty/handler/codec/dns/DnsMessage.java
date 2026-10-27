package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsMessage extends io.netty.util.ReferenceCounted {
    io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3);

    io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2);

    io.netty.handler.codec.dns.DnsMessage clear();

    io.netty.handler.codec.dns.DnsMessage clear(io.netty.handler.codec.dns.DnsSection r1);

    int count();

    int count(io.netty.handler.codec.dns.DnsSection r1);

    int id();

    boolean isRecursionDesired();

    io.netty.handler.codec.dns.DnsOpCode opCode();

    <T extends io.netty.handler.codec.dns.DnsRecord> T recordAt(io.netty.handler.codec.dns.DnsSection r1);

    <T extends io.netty.handler.codec.dns.DnsRecord> T recordAt(io.netty.handler.codec.dns.DnsSection r1, int r2);

    <T extends io.netty.handler.codec.dns.DnsRecord> T removeRecord(io.netty.handler.codec.dns.DnsSection r1, int r2);

    io.netty.handler.codec.dns.DnsMessage retain();

    io.netty.handler.codec.dns.DnsMessage retain(int r1);

    io.netty.handler.codec.dns.DnsMessage setId(int r1);

    io.netty.handler.codec.dns.DnsMessage setOpCode(io.netty.handler.codec.dns.DnsOpCode r1);

    io.netty.handler.codec.dns.DnsMessage setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2);

    <T extends io.netty.handler.codec.dns.DnsRecord> T setRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3);

    io.netty.handler.codec.dns.DnsMessage setRecursionDesired(boolean r1);

    io.netty.handler.codec.dns.DnsMessage setZ(int r1);

    io.netty.handler.codec.dns.DnsMessage touch();

    io.netty.handler.codec.dns.DnsMessage touch(java.lang.Object r1);

    int z();
}

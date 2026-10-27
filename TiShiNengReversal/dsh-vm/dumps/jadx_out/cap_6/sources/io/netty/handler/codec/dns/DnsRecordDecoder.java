package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsRecordDecoder {
    public static final io.netty.handler.codec.dns.DnsRecordDecoder DEFAULT = null;

    static {
            io.netty.handler.codec.dns.DefaultDnsRecordDecoder r0 = new io.netty.handler.codec.dns.DefaultDnsRecordDecoder
            r0.<init>()
            io.netty.handler.codec.dns.DnsRecordDecoder.DEFAULT = r0
            return
    }

    io.netty.handler.codec.dns.DnsQuestion decodeQuestion(io.netty.buffer.ByteBuf r1) throws java.lang.Exception;

    <T extends io.netty.handler.codec.dns.DnsRecord> T decodeRecord(io.netty.buffer.ByteBuf r1) throws java.lang.Exception;
}

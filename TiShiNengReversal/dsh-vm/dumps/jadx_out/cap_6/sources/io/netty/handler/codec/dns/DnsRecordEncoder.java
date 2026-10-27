package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DnsRecordEncoder {
    public static final io.netty.handler.codec.dns.DnsRecordEncoder DEFAULT = null;

    static {
            io.netty.handler.codec.dns.DefaultDnsRecordEncoder r0 = new io.netty.handler.codec.dns.DefaultDnsRecordEncoder
            r0.<init>()
            io.netty.handler.codec.dns.DnsRecordEncoder.DEFAULT = r0
            return
    }

    void encodeQuestion(io.netty.handler.codec.dns.DnsQuestion r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception;

    void encodeRecord(io.netty.handler.codec.dns.DnsRecord r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception;
}

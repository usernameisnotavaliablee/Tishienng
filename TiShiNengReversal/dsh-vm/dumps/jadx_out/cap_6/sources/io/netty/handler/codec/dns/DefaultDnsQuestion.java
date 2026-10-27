package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsQuestion extends io.netty.handler.codec.dns.AbstractDnsRecord implements io.netty.handler.codec.dns.DnsQuestion {
    public DefaultDnsQuestion(java.lang.String r3, io.netty.handler.codec.dns.DnsRecordType r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
    }

    public DefaultDnsQuestion(java.lang.String r7, io.netty.handler.codec.dns.DnsRecordType r8, int r9) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsRecord
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r3.name()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            int r2 = r3.dnsClass()
            java.lang.StringBuilder r2 = io.netty.handler.codec.dns.DnsMessageUtil.appendRecordClass(r0, r2)
            r2.append(r1)
            io.netty.handler.codec.dns.DnsRecordType r1 = r3.type()
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

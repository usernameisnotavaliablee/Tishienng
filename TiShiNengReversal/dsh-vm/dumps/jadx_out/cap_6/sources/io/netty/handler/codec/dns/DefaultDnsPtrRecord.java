package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsPtrRecord extends io.netty.handler.codec.dns.AbstractDnsRecord implements io.netty.handler.codec.dns.DnsPtrRecord {
    private final java.lang.String hostname;

    public DefaultDnsPtrRecord(java.lang.String r7, int r8, long r9, java.lang.String r11) {
            r6 = this;
            io.netty.handler.codec.dns.DnsRecordType r2 = io.netty.handler.codec.dns.DnsRecordType.PTR
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            java.lang.String r7 = "hostname"
            java.lang.Object r7 = io.netty.util.internal.ObjectUtil.checkNotNull(r11, r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.hostname = r7
            return
    }

    @Override // io.netty.handler.codec.dns.DnsPtrRecord
    public java.lang.String hostname() {
            r1 = this;
            java.lang.String r0 = r1.hostname
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsRecord
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r5)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            io.netty.handler.codec.dns.DnsRecordType r1 = r5.type()
            java.lang.String r2 = r5.name()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L24
            java.lang.String r2 = "<root>"
            goto L28
        L24:
            java.lang.String r2 = r5.name()
        L28:
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            long r3 = r5.timeToLive()
            r0.append(r3)
            r0.append(r2)
            int r3 = r5.dnsClass()
            java.lang.StringBuilder r3 = io.netty.handler.codec.dns.DnsMessageUtil.appendRecordClass(r0, r3)
            r3.append(r2)
            java.lang.String r1 = r1.name()
            r3.append(r1)
            r0.append(r2)
            java.lang.String r1 = r5.hostname
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

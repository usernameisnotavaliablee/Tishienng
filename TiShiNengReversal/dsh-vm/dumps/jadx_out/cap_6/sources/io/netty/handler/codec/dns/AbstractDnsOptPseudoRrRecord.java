package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractDnsOptPseudoRrRecord extends io.netty.handler.codec.dns.AbstractDnsRecord implements io.netty.handler.codec.dns.DnsOptPseudoRecord {
    protected AbstractDnsOptPseudoRrRecord(int r7) {
            r6 = this;
            io.netty.handler.codec.dns.DnsRecordType r2 = io.netty.handler.codec.dns.DnsRecordType.OPT
            r4 = 0
            java.lang.String r1 = ""
            r0 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            return
    }

    protected AbstractDnsOptPseudoRrRecord(int r7, int r8, int r9) {
            r6 = this;
            io.netty.handler.codec.dns.DnsRecordType r2 = io.netty.handler.codec.dns.DnsRecordType.OPT
            long r4 = packIntoLong(r8, r9)
            java.lang.String r1 = ""
            r0 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private static long packIntoLong(int r2, int r3) {
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    @Override // io.netty.handler.codec.dns.DnsOptPseudoRecord
    public int extendedRcode() {
            r2 = this;
            long r0 = r2.timeToLive()
            int r1 = (int) r0
            int r0 = r1 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsOptPseudoRecord
    public int flags() {
            r2 = this;
            long r0 = r2.timeToLive()
            int r1 = (int) r0
            short r0 = (short) r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsRecord
    public java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.toStringBuilder()
            java.lang.String r0 = r0.toString()
            return r0
    }

    final java.lang.StringBuilder toStringBuilder() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = "OPT flags:"
            r0.append(r1)
            int r1 = r2.flags()
            r0.append(r1)
            java.lang.String r1 = " version:"
            r0.append(r1)
            int r1 = r2.version()
            r0.append(r1)
            java.lang.String r1 = " extendedRecode:"
            r0.append(r1)
            int r1 = r2.extendedRcode()
            r0.append(r1)
            java.lang.String r1 = " udp:"
            r0.append(r1)
            int r1 = r2.dnsClass()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsOptPseudoRecord
    public int version() {
            r2 = this;
            long r0 = r2.timeToLive()
            int r1 = (int) r0
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }
}

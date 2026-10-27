package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum DnsSection extends java.lang.Enum<io.netty.handler.codec.dns.DnsSection> {
    private static final /* synthetic */ io.netty.handler.codec.dns.DnsSection[] $VALUES = null;
    public static final io.netty.handler.codec.dns.DnsSection ADDITIONAL = null;
    public static final io.netty.handler.codec.dns.DnsSection ANSWER = null;
    public static final io.netty.handler.codec.dns.DnsSection AUTHORITY = null;
    public static final io.netty.handler.codec.dns.DnsSection QUESTION = null;

    static {
            io.netty.handler.codec.dns.DnsSection r0 = new io.netty.handler.codec.dns.DnsSection
            java.lang.String r1 = "QUESTION"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsSection.QUESTION = r0
            io.netty.handler.codec.dns.DnsSection r1 = new io.netty.handler.codec.dns.DnsSection
            java.lang.String r3 = "ANSWER"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.codec.dns.DnsSection.ANSWER = r1
            io.netty.handler.codec.dns.DnsSection r3 = new io.netty.handler.codec.dns.DnsSection
            java.lang.String r5 = "AUTHORITY"
            r6 = 2
            r3.<init>(r5, r6)
            io.netty.handler.codec.dns.DnsSection.AUTHORITY = r3
            io.netty.handler.codec.dns.DnsSection r5 = new io.netty.handler.codec.dns.DnsSection
            java.lang.String r7 = "ADDITIONAL"
            r8 = 3
            r5.<init>(r7, r8)
            io.netty.handler.codec.dns.DnsSection.ADDITIONAL = r5
            r7 = 4
            io.netty.handler.codec.dns.DnsSection[] r7 = new io.netty.handler.codec.dns.DnsSection[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            io.netty.handler.codec.dns.DnsSection.$VALUES = r7
            return
    }

    DnsSection(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.codec.dns.DnsSection valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.dns.DnsSection> r0 = io.netty.handler.codec.dns.DnsSection.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.dns.DnsSection r1 = (io.netty.handler.codec.dns.DnsSection) r1
            return r1
    }

    public static io.netty.handler.codec.dns.DnsSection[] values() {
            io.netty.handler.codec.dns.DnsSection[] r0 = io.netty.handler.codec.dns.DnsSection.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.dns.DnsSection[] r0 = (io.netty.handler.codec.dns.DnsSection[]) r0
            return r0
    }
}

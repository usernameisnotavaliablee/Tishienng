package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DnsOpCode implements java.lang.Comparable<io.netty.handler.codec.dns.DnsOpCode> {
    public static final io.netty.handler.codec.dns.DnsOpCode IQUERY = null;
    public static final io.netty.handler.codec.dns.DnsOpCode NOTIFY = null;
    public static final io.netty.handler.codec.dns.DnsOpCode QUERY = null;
    public static final io.netty.handler.codec.dns.DnsOpCode STATUS = null;
    public static final io.netty.handler.codec.dns.DnsOpCode UPDATE = null;
    private final byte byteValue;
    private final java.lang.String name;
    private java.lang.String text;

    static {
            io.netty.handler.codec.dns.DnsOpCode r0 = new io.netty.handler.codec.dns.DnsOpCode
            r1 = 0
            java.lang.String r2 = "QUERY"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsOpCode.QUERY = r0
            io.netty.handler.codec.dns.DnsOpCode r0 = new io.netty.handler.codec.dns.DnsOpCode
            r1 = 1
            java.lang.String r2 = "IQUERY"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsOpCode.IQUERY = r0
            io.netty.handler.codec.dns.DnsOpCode r0 = new io.netty.handler.codec.dns.DnsOpCode
            r1 = 2
            java.lang.String r2 = "STATUS"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsOpCode.STATUS = r0
            io.netty.handler.codec.dns.DnsOpCode r0 = new io.netty.handler.codec.dns.DnsOpCode
            r1 = 4
            java.lang.String r2 = "NOTIFY"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsOpCode.NOTIFY = r0
            io.netty.handler.codec.dns.DnsOpCode r0 = new io.netty.handler.codec.dns.DnsOpCode
            r1 = 5
            java.lang.String r2 = "UPDATE"
            r0.<init>(r1, r2)
            io.netty.handler.codec.dns.DnsOpCode.UPDATE = r0
            return
    }

    private DnsOpCode(int r2) {
            r1 = this;
            java.lang.String r0 = "UNKNOWN"
            r1.<init>(r2, r0)
            return
    }

    public DnsOpCode(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            byte r1 = (byte) r1
            r0.byteValue = r1
            java.lang.String r1 = "name"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.name = r1
            return
    }

    public static io.netty.handler.codec.dns.DnsOpCode valueOf(int r1) {
            if (r1 == 0) goto L20
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L17
            r0 = 5
            if (r1 == r0) goto L14
            io.netty.handler.codec.dns.DnsOpCode r0 = new io.netty.handler.codec.dns.DnsOpCode
            r0.<init>(r1)
            return r0
        L14:
            io.netty.handler.codec.dns.DnsOpCode r1 = io.netty.handler.codec.dns.DnsOpCode.UPDATE
            return r1
        L17:
            io.netty.handler.codec.dns.DnsOpCode r1 = io.netty.handler.codec.dns.DnsOpCode.NOTIFY
            return r1
        L1a:
            io.netty.handler.codec.dns.DnsOpCode r1 = io.netty.handler.codec.dns.DnsOpCode.STATUS
            return r1
        L1d:
            io.netty.handler.codec.dns.DnsOpCode r1 = io.netty.handler.codec.dns.DnsOpCode.IQUERY
            return r1
        L20:
            io.netty.handler.codec.dns.DnsOpCode r1 = io.netty.handler.codec.dns.DnsOpCode.QUERY
            return r1
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.dns.DnsOpCode r2) {
            r1 = this;
            byte r0 = r1.byteValue
            byte r2 = r2.byteValue
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.dns.DnsOpCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsOpCode r1 = (io.netty.handler.codec.dns.DnsOpCode) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof io.netty.handler.codec.dns.DnsOpCode
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            byte r1 = r3.byteValue
            io.netty.handler.codec.dns.DnsOpCode r4 = (io.netty.handler.codec.dns.DnsOpCode) r4
            byte r4 = r4.byteValue
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.text
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.name
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            byte r1 = r2.byteValue
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.text = r0
        L25:
            return r0
    }
}

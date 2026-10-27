package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramDnsQuery extends io.netty.handler.codec.dns.DefaultDnsQuery implements io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DatagramDnsQuery, java.net.InetSocketAddress> {
    private final java.net.InetSocketAddress recipient;
    private final java.net.InetSocketAddress sender;

    public DatagramDnsQuery(java.net.InetSocketAddress r2, java.net.InetSocketAddress r3, int r4) {
            r1 = this;
            io.netty.handler.codec.dns.DnsOpCode r0 = io.netty.handler.codec.dns.DnsOpCode.QUERY
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DatagramDnsQuery(java.net.InetSocketAddress r1, java.net.InetSocketAddress r2, int r3, io.netty.handler.codec.dns.DnsOpCode r4) {
            r0 = this;
            r0.<init>(r3, r4)
            if (r2 != 0) goto L10
            if (r1 == 0) goto L8
            goto L10
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "recipient and sender"
            r1.<init>(r2)
            throw r1
        L10:
            r0.sender = r1
            r0.recipient = r2
            return
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.addRecord(r1, r2, r3)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.addRecord(r1, r2)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.addRecord(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.addRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.addRecord(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.addRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery clear() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = super.clear()
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = (io.netty.handler.codec.dns.DatagramDnsQuery) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery clear(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.clear(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage clear() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.clear()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage clear(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.clear(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery clear() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.clear()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery clear(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.clear(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.channel.AddressedEnvelope
    public io.netty.handler.codec.dns.DatagramDnsQuery content() {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.AddressedEnvelope
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DatagramDnsQuery content() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.content()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = super.equals(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            boolean r1 = r5 instanceof io.netty.channel.AddressedEnvelope
            if (r1 != 0) goto L11
            return r2
        L11:
            io.netty.channel.AddressedEnvelope r5 = (io.netty.channel.AddressedEnvelope) r5
            java.net.InetSocketAddress r1 = r4.sender()
            if (r1 != 0) goto L20
            java.net.SocketAddress r1 = r5.sender()
            if (r1 == 0) goto L2f
            return r2
        L20:
            java.net.InetSocketAddress r1 = r4.sender()
            java.net.SocketAddress r3 = r5.sender()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2f
            return r2
        L2f:
            java.net.InetSocketAddress r1 = r4.recipient()
            if (r1 != 0) goto L3c
            java.net.SocketAddress r5 = r5.recipient()
            if (r5 == 0) goto L4b
            return r2
        L3c:
            java.net.InetSocketAddress r1 = r4.recipient()
            java.net.SocketAddress r5 = r5.recipient()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L4b
            return r2
        L4b:
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            java.net.InetSocketAddress r1 = r2.sender()
            if (r1 == 0) goto L15
            int r0 = r0 * 31
            java.net.InetSocketAddress r1 = r2.sender()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L15:
            java.net.InetSocketAddress r1 = r2.recipient()
            if (r1 == 0) goto L26
            int r0 = r0 * 31
            java.net.InetSocketAddress r1 = r2.recipient()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L26:
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.channel.AddressedEnvelope
    public java.net.InetSocketAddress recipient() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.recipient
            return r0
    }

    @Override // io.netty.channel.AddressedEnvelope
    public /* bridge */ /* synthetic */ java.net.InetSocketAddress recipient() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.recipient()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo179retain() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo180retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = super.retain()
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = (io.netty.handler.codec.dns.DatagramDnsQuery) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.retain(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage retain() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery retain() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo179retain() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo180retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.retain(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.channel.AddressedEnvelope
    public java.net.InetSocketAddress sender() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.sender
            return r0
    }

    @Override // io.netty.channel.AddressedEnvelope
    public /* bridge */ /* synthetic */ java.net.InetSocketAddress sender() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.sender()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery setId(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.setId(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setId(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery setId(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery setOpCode(io.netty.handler.codec.dns.DnsOpCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.setOpCode(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setOpCode(io.netty.handler.codec.dns.DnsOpCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setOpCode(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery setOpCode(io.netty.handler.codec.dns.DnsOpCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setOpCode(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.setRecord(r1, r2)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery setRecursionDesired(boolean r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.setRecursionDesired(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setRecursionDesired(boolean r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setRecursionDesired(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery setRecursionDesired(boolean r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setRecursionDesired(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery setZ(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.setZ(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setZ(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setZ(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery setZ(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.setZ(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo181touch() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.channel.AddressedEnvelope mo182touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = super.touch()
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = (io.netty.handler.codec.dns.DatagramDnsQuery) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DatagramDnsQuery touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = super.touch(r1)
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = (io.netty.handler.codec.dns.DatagramDnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage touch() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery touch() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsQuery touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo181touch() {
            r1 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DefaultDnsQuery, io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo182touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = r0.touch(r1)
            return r1
    }
}

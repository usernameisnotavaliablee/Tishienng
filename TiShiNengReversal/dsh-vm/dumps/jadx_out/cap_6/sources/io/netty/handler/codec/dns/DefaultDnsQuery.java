package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsQuery extends io.netty.handler.codec.dns.AbstractDnsMessage implements io.netty.handler.codec.dns.DnsQuery {
    public DefaultDnsQuery(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DefaultDnsQuery(int r1, io.netty.handler.codec.dns.DnsOpCode r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.addRecord(r1, r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.addRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, int r2, io.netty.handler.codec.dns.DnsRecord r3) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.addRecord(r1, r2, r3)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery addRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.addRecord(r1, r2)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage clear() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = r1.clear()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage clear(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.clear(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery clear() {
            r1 = this;
            io.netty.handler.codec.dns.DnsMessage r0 = super.clear()
            io.netty.handler.codec.dns.DnsQuery r0 = (io.netty.handler.codec.dns.DnsQuery) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery clear(io.netty.handler.codec.dns.DnsSection r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.clear(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsMessage r0 = super.retain()
            io.netty.handler.codec.dns.DnsQuery r0 = (io.netty.handler.codec.dns.DnsQuery) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.retain(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo179retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo180retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setId(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.setId(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery setId(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.setId(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setOpCode(io.netty.handler.codec.dns.DnsOpCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.setOpCode(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery setOpCode(io.netty.handler.codec.dns.DnsOpCode r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.setOpCode(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.setRecord(r1, r2)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery setRecord(io.netty.handler.codec.dns.DnsSection r1, io.netty.handler.codec.dns.DnsRecord r2) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.setRecord(r1, r2)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setRecursionDesired(boolean r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.setRecursionDesired(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery setRecursionDesired(boolean r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.setRecursionDesired(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage setZ(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.setZ(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery setZ(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.setZ(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = io.netty.handler.codec.dns.DnsMessageUtil.appendQuery(r0, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public /* bridge */ /* synthetic */ io.netty.handler.codec.dns.DnsMessage touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsMessage r0 = super.touch()
            io.netty.handler.codec.dns.DnsQuery r0 = (io.netty.handler.codec.dns.DnsQuery) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.handler.codec.dns.DnsMessage
    public io.netty.handler.codec.dns.DnsQuery touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsMessage r1 = super.touch(r1)
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            return r1
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo181touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuery r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsMessage, io.netty.channel.AddressedEnvelope
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo182touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r1 = r0.touch(r1)
            return r1
    }
}

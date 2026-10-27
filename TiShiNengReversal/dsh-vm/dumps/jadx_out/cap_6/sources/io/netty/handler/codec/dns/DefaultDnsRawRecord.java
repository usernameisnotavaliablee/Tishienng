package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsRawRecord extends io.netty.handler.codec.dns.AbstractDnsRecord implements io.netty.handler.codec.dns.DnsRawRecord {
    private final io.netty.buffer.ByteBuf content;

    public DefaultDnsRawRecord(java.lang.String r1, io.netty.handler.codec.dns.DnsRecordType r2, int r3, long r4, io.netty.buffer.ByteBuf r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = r0
            java.lang.String r2 = "content"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r2)
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r1.content = r2
            return
    }

    public DefaultDnsRawRecord(java.lang.String r8, io.netty.handler.codec.dns.DnsRecordType r9, long r10, io.netty.buffer.ByteBuf r12) {
            r7 = this;
            r3 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.dns.DnsRawRecord copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.dns.DnsRawRecord duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.replace(r0)
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRawRecord r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.dns.DnsRawRecord replace(io.netty.buffer.ByteBuf r8) {
            r7 = this;
            io.netty.handler.codec.dns.DefaultDnsRawRecord r0 = new io.netty.handler.codec.dns.DefaultDnsRawRecord
            java.lang.String r1 = r7.name()
            io.netty.handler.codec.dns.DnsRecordType r2 = r7.type()
            int r3 = r7.dnsClass()
            long r4 = r7.timeToLive()
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRawRecord r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.dns.DnsRawRecord mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.dns.DnsRawRecord mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.retain(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRawRecord r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.dns.DnsRawRecord retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsRecord
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            io.netty.handler.codec.dns.DnsRecordType r1 = r6.type()
            io.netty.handler.codec.dns.DnsRecordType r2 = io.netty.handler.codec.dns.DnsRecordType.OPT
            r3 = 32
            if (r1 == r2) goto L51
            java.lang.String r2 = r6.name()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2a
            java.lang.String r2 = "<root>"
            goto L2e
        L2a:
            java.lang.String r2 = r6.name()
        L2e:
            r0.append(r2)
            r0.append(r3)
            long r4 = r6.timeToLive()
            r0.append(r4)
            r0.append(r3)
            int r2 = r6.dnsClass()
            java.lang.StringBuilder r2 = io.netty.handler.codec.dns.DnsMessageUtil.appendRecordClass(r0, r2)
            r2.append(r3)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            goto L69
        L51:
            java.lang.String r1 = "OPT flags:"
            r0.append(r1)
            long r1 = r6.timeToLive()
            r0.append(r1)
            java.lang.String r1 = " udp:"
            r0.append(r1)
            int r1 = r6.dnsClass()
            r0.append(r1)
        L69:
            r0.append(r3)
            io.netty.buffer.ByteBuf r1 = r6.content()
            int r1 = r1.readableBytes()
            r0.append(r1)
            java.lang.String r1 = "B)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRawRecord r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.dns.DnsRawRecord mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsRawRecord, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.dns.DnsRawRecord mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRawRecord r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.dns.DnsRawRecord r1 = r0.mo42touch(r1)
            return r1
    }
}

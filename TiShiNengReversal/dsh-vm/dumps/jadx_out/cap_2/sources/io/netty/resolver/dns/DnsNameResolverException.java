package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DnsNameResolverException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -8826717909627131850L;
    private final io.netty.handler.codec.dns.DnsQuestion question;
    private final java.net.InetSocketAddress remoteAddress;

    public DnsNameResolverException(java.net.InetSocketAddress r1, io.netty.handler.codec.dns.DnsQuestion r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3)
            java.net.InetSocketAddress r1 = validateRemoteAddress(r1)
            r0.remoteAddress = r1
            io.netty.handler.codec.dns.DnsQuestion r1 = validateQuestion(r2)
            r0.question = r1
            return
    }

    public DnsNameResolverException(java.net.InetSocketAddress r1, io.netty.handler.codec.dns.DnsQuestion r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = this;
            r0.<init>(r3, r4)
            java.net.InetSocketAddress r1 = validateRemoteAddress(r1)
            r0.remoteAddress = r1
            io.netty.handler.codec.dns.DnsQuestion r1 = validateQuestion(r2)
            r0.question = r1
            return
    }

    private static io.netty.handler.codec.dns.DnsQuestion validateQuestion(io.netty.handler.codec.dns.DnsQuestion r1) {
            java.lang.String r0 = "question"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            io.netty.handler.codec.dns.DnsQuestion r1 = (io.netty.handler.codec.dns.DnsQuestion) r1
            return r1
    }

    private static java.net.InetSocketAddress validateRemoteAddress(java.net.InetSocketAddress r1) {
            java.lang.String r0 = "remoteAddress"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            return r1
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            java.lang.StackTraceElement[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STACK_TRACE
            r1.setStackTrace(r0)
            return r1
    }

    public io.netty.handler.codec.dns.DnsQuestion question() {
            r1 = this;
            io.netty.handler.codec.dns.DnsQuestion r0 = r1.question
            return r0
    }

    public java.net.InetSocketAddress remoteAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.remoteAddress
            return r0
    }
}

package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class TraceDnsQueryLifecycleObserver implements io.netty.resolver.dns.DnsQueryLifecycleObserver {
    private java.net.InetSocketAddress dnsServerAddress;
    private final io.netty.util.internal.logging.InternalLogLevel level;
    private final io.netty.util.internal.logging.InternalLogger logger;
    private final io.netty.handler.codec.dns.DnsQuestion question;

    TraceDnsQueryLifecycleObserver(io.netty.handler.codec.dns.DnsQuestion r2, io.netty.util.internal.logging.InternalLogger r3, io.netty.util.internal.logging.InternalLogLevel r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "question"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.dns.DnsQuestion r2 = (io.netty.handler.codec.dns.DnsQuestion) r2
            r1.question = r2
            java.lang.String r2 = "logger"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.util.internal.logging.InternalLogger r2 = (io.netty.util.internal.logging.InternalLogger) r2
            r1.logger = r2
            java.lang.String r2 = "level"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.util.internal.logging.InternalLogLevel r2 = (io.netty.util.internal.logging.InternalLogLevel) r2
            r1.level = r2
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryCNAMEd(io.netty.handler.codec.dns.DnsQuestion r7) {
            r6 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r6.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r6.level
            java.net.InetSocketAddress r2 = r6.dnsServerAddress
            io.netty.handler.codec.dns.DnsQuestion r3 = r6.question
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            r2 = 2
            r4[r2] = r7
            java.lang.String r7 = "from {} : {} CNAME question {}"
            r0.log(r1, r7, r4)
            return r6
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryCancelled(int r7) {
            r6 = this;
            java.net.InetSocketAddress r0 = r6.dnsServerAddress
            if (r0 == 0) goto L20
            io.netty.util.internal.logging.InternalLogger r1 = r6.logger
            io.netty.util.internal.logging.InternalLogLevel r2 = r6.level
            io.netty.handler.codec.dns.DnsQuestion r3 = r6.question
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r3
            r0 = 2
            r4[r0] = r7
            java.lang.String r7 = "from {} : {} cancelled with {} queries remaining"
            r1.log(r2, r7, r4)
            return
        L20:
            io.netty.util.internal.logging.InternalLogger r0 = r6.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r6.level
            io.netty.handler.codec.dns.DnsQuestion r2 = r6.question
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "{} query never written and cancelled with {} queries remaining"
            r0.log(r1, r3, r2, r7)
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryFailed(java.lang.Throwable r7) {
            r6 = this;
            java.net.InetSocketAddress r0 = r6.dnsServerAddress
            if (r0 == 0) goto L1c
            io.netty.util.internal.logging.InternalLogger r1 = r6.logger
            io.netty.util.internal.logging.InternalLogLevel r2 = r6.level
            io.netty.handler.codec.dns.DnsQuestion r3 = r6.question
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r3
            r0 = 2
            r4[r0] = r7
            java.lang.String r7 = "from {} : {} failure"
            r1.log(r2, r7, r4)
            return
        L1c:
            io.netty.util.internal.logging.InternalLogger r0 = r6.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r6.level
            java.lang.String r2 = "{} query never written and failed"
            io.netty.handler.codec.dns.DnsQuestion r3 = r6.question
            r0.log(r1, r2, r3, r7)
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryNoAnswer(io.netty.handler.codec.dns.DnsResponseCode r7) {
            r6 = this;
            io.netty.util.internal.logging.InternalLogger r0 = r6.logger
            io.netty.util.internal.logging.InternalLogLevel r1 = r6.level
            java.net.InetSocketAddress r2 = r6.dnsServerAddress
            io.netty.handler.codec.dns.DnsQuestion r3 = r6.question
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            r2 = 2
            r4[r2] = r7
            java.lang.String r7 = "from {} : {} no answer {}"
            r0.log(r1, r7, r4)
            return r6
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public io.netty.resolver.dns.DnsQueryLifecycleObserver queryRedirected(java.util.List<java.net.InetSocketAddress> r5) {
            r4 = this;
            io.netty.util.internal.logging.InternalLogger r5 = r4.logger
            io.netty.util.internal.logging.InternalLogLevel r0 = r4.level
            java.net.InetSocketAddress r1 = r4.dnsServerAddress
            io.netty.handler.codec.dns.DnsQuestion r2 = r4.question
            java.lang.String r3 = "from {} : {} redirected"
            r5.log(r0, r3, r1, r2)
            return r4
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void querySucceed() {
            r0 = this;
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryWritten(java.net.InetSocketAddress r1, io.netty.channel.ChannelFuture r2) {
            r0 = this;
            r0.dnsServerAddress = r1
            return
    }
}

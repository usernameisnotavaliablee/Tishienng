package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class TraceDnsQueryLifeCycleObserverFactory implements io.netty.resolver.dns.DnsQueryLifecycleObserverFactory {
    private static final io.netty.util.internal.logging.InternalLogLevel DEFAULT_LEVEL = null;
    private static final io.netty.util.internal.logging.InternalLogger DEFAULT_LOGGER = null;
    private final io.netty.util.internal.logging.InternalLogLevel level;
    private final io.netty.util.internal.logging.InternalLogger logger;

    static {
            java.lang.Class<io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory> r0 = io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory.DEFAULT_LOGGER = r0
            io.netty.util.internal.logging.InternalLogLevel r0 = io.netty.util.internal.logging.InternalLogLevel.DEBUG
            io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory.DEFAULT_LEVEL = r0
            return
    }

    TraceDnsQueryLifeCycleObserverFactory() {
            r2 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory.DEFAULT_LOGGER
            io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.resolver.dns.TraceDnsQueryLifeCycleObserverFactory.DEFAULT_LEVEL
            r2.<init>(r0, r1)
            return
    }

    TraceDnsQueryLifeCycleObserverFactory(io.netty.util.internal.logging.InternalLogger r2, io.netty.util.internal.logging.InternalLogLevel r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "logger"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.internal.logging.InternalLogger r2 = (io.netty.util.internal.logging.InternalLogger) r2
            r1.logger = r2
            java.lang.String r2 = "level"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.util.internal.logging.InternalLogLevel r2 = (io.netty.util.internal.logging.InternalLogLevel) r2
            r1.level = r2
            return
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserverFactory
    public io.netty.resolver.dns.DnsQueryLifecycleObserver newDnsQueryLifecycleObserver(io.netty.handler.codec.dns.DnsQuestion r4) {
            r3 = this;
            io.netty.resolver.dns.TraceDnsQueryLifecycleObserver r0 = new io.netty.resolver.dns.TraceDnsQueryLifecycleObserver
            io.netty.util.internal.logging.InternalLogger r1 = r3.logger
            io.netty.util.internal.logging.InternalLogLevel r2 = r3.level
            r0.<init>(r4, r1, r2)
            return r0
    }
}

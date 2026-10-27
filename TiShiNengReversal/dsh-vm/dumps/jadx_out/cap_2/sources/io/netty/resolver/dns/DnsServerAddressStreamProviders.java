package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DnsServerAddressStreamProviders {
    private static final io.netty.resolver.dns.DnsServerAddressStreamProvider DEFAULT_DNS_SERVER_ADDRESS_STREAM_PROVIDER = null;
    private static final long REFRESH_INTERVAL = 0;


    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 5
            long r0 = r0.toNanos(r1)
            io.netty.resolver.dns.DnsServerAddressStreamProviders.REFRESH_INTERVAL = r0
            io.netty.resolver.dns.DnsServerAddressStreamProviders$1 r0 = new io.netty.resolver.dns.DnsServerAddressStreamProviders$1
            r0.<init>()
            io.netty.resolver.dns.DnsServerAddressStreamProviders.DEFAULT_DNS_SERVER_ADDRESS_STREAM_PROVIDER = r0
            return
    }

    private DnsServerAddressStreamProviders() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long access$000() {
            long r0 = io.netty.resolver.dns.DnsServerAddressStreamProviders.REFRESH_INTERVAL
            return r0
    }

    public static io.netty.resolver.dns.DnsServerAddressStreamProvider platformDefault() {
            io.netty.resolver.dns.DnsServerAddressStreamProvider r0 = io.netty.resolver.dns.DnsServerAddressStreamProviders.DEFAULT_DNS_SERVER_ADDRESS_STREAM_PROVIDER
            return r0
    }
}

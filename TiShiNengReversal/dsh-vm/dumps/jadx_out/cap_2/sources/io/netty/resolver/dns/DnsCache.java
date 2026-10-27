package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface DnsCache {
    io.netty.resolver.dns.DnsCacheEntry cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, java.lang.Throwable r3, io.netty.channel.EventLoop r4);

    io.netty.resolver.dns.DnsCacheEntry cache(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2, java.net.InetAddress r3, long r4, io.netty.channel.EventLoop r6);

    void clear();

    boolean clear(java.lang.String r1);

    java.util.List<? extends io.netty.resolver.dns.DnsCacheEntry> get(java.lang.String r1, io.netty.handler.codec.dns.DnsRecord[] r2);
}

package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HostsFileEntries {
    static final io.netty.resolver.HostsFileEntries EMPTY = null;
    private final java.util.Map<java.lang.String, java.net.Inet4Address> inet4Entries;
    private final java.util.Map<java.lang.String, java.net.Inet6Address> inet6Entries;

    static {
            io.netty.resolver.HostsFileEntries r0 = new io.netty.resolver.HostsFileEntries
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.<init>(r1, r1)
            io.netty.resolver.HostsFileEntries.EMPTY = r0
            return
    }

    public HostsFileEntries(java.util.Map<java.lang.String, java.net.Inet4Address> r2, java.util.Map<java.lang.String, java.net.Inet6Address> r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            r1.inet4Entries = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r3)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.inet6Entries = r2
            return
    }

    public java.util.Map<java.lang.String, java.net.Inet4Address> inet4Entries() {
            r1 = this;
            java.util.Map<java.lang.String, java.net.Inet4Address> r0 = r1.inet4Entries
            return r0
    }

    public java.util.Map<java.lang.String, java.net.Inet6Address> inet6Entries() {
            r1 = this;
            java.util.Map<java.lang.String, java.net.Inet6Address> r0 = r1.inet6Entries
            return r0
    }
}

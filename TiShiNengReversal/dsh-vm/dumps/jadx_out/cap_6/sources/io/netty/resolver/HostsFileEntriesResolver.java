package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface HostsFileEntriesResolver {
    public static final io.netty.resolver.HostsFileEntriesResolver DEFAULT = null;

    static {
            io.netty.resolver.DefaultHostsFileEntriesResolver r0 = new io.netty.resolver.DefaultHostsFileEntriesResolver
            r0.<init>()
            io.netty.resolver.HostsFileEntriesResolver.DEFAULT = r0
            return
    }

    java.net.InetAddress address(java.lang.String r1, io.netty.resolver.ResolvedAddressTypes r2);
}

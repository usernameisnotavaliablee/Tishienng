package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class PreferredAddressTypeComparator implements java.util.Comparator<java.net.InetAddress> {
    private static final io.netty.resolver.dns.PreferredAddressTypeComparator IPv4 = null;
    private static final io.netty.resolver.dns.PreferredAddressTypeComparator IPv6 = null;
    private final java.lang.Class<? extends java.net.InetAddress> preferredAddressType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.resolver.dns.PreferredAddressTypeComparator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$socket$InternetProtocolFamily = null;

        static {
                io.netty.channel.socket.InternetProtocolFamily[] r0 = io.netty.channel.socket.InternetProtocolFamily.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.resolver.dns.PreferredAddressTypeComparator.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily = r0
                io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv4     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.resolver.dns.PreferredAddressTypeComparator.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv6     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            io.netty.resolver.dns.PreferredAddressTypeComparator r0 = new io.netty.resolver.dns.PreferredAddressTypeComparator
            java.lang.Class<java.net.Inet4Address> r1 = java.net.Inet4Address.class
            r0.<init>(r1)
            io.netty.resolver.dns.PreferredAddressTypeComparator.IPv4 = r0
            io.netty.resolver.dns.PreferredAddressTypeComparator r0 = new io.netty.resolver.dns.PreferredAddressTypeComparator
            java.lang.Class<java.net.Inet6Address> r1 = java.net.Inet6Address.class
            r0.<init>(r1)
            io.netty.resolver.dns.PreferredAddressTypeComparator.IPv6 = r0
            return
    }

    private PreferredAddressTypeComparator(java.lang.Class<? extends java.net.InetAddress> r1) {
            r0 = this;
            r0.<init>()
            r0.preferredAddressType = r1
            return
    }

    static io.netty.resolver.dns.PreferredAddressTypeComparator comparator(io.netty.channel.socket.InternetProtocolFamily r1) {
            int[] r0 = io.netty.resolver.dns.PreferredAddressTypeComparator.AnonymousClass1.$SwitchMap$io$netty$channel$socket$InternetProtocolFamily
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 != r0) goto L11
            io.netty.resolver.dns.PreferredAddressTypeComparator r1 = io.netty.resolver.dns.PreferredAddressTypeComparator.IPv6
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L17:
            io.netty.resolver.dns.PreferredAddressTypeComparator r1 = io.netty.resolver.dns.PreferredAddressTypeComparator.IPv4
            return r1
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.net.InetAddress r1, java.net.InetAddress r2) {
            r0 = this;
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.net.InetAddress r2, java.net.InetAddress r3) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            if (r0 != r3) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.Class<? extends java.net.InetAddress> r3 = r1.preferredAddressType
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L1a
            r2 = -1
            return r2
        L1a:
            r2 = 1
            return r2
    }
}

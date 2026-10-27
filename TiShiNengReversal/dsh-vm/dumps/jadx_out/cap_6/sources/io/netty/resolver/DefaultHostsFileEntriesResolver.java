package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultHostsFileEntriesResolver implements io.netty.resolver.HostsFileEntriesResolver {
    private final java.util.Map<java.lang.String, java.net.Inet4Address> inet4Entries;
    private final java.util.Map<java.lang.String, java.net.Inet6Address> inet6Entries;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.resolver.DefaultHostsFileEntriesResolver$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$resolver$ResolvedAddressTypes = null;

        static {
                io.netty.resolver.ResolvedAddressTypes[] r0 = io.netty.resolver.ResolvedAddressTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.resolver.DefaultHostsFileEntriesResolver.AnonymousClass1.$SwitchMap$io$netty$resolver$ResolvedAddressTypes = r0
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV4_ONLY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.resolver.DefaultHostsFileEntriesResolver.AnonymousClass1.$SwitchMap$io$netty$resolver$ResolvedAddressTypes     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV6_ONLY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.resolver.DefaultHostsFileEntriesResolver.AnonymousClass1.$SwitchMap$io$netty$resolver$ResolvedAddressTypes     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV4_PREFERRED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.resolver.DefaultHostsFileEntriesResolver.AnonymousClass1.$SwitchMap$io$netty$resolver$ResolvedAddressTypes     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.resolver.ResolvedAddressTypes r1 = io.netty.resolver.ResolvedAddressTypes.IPV6_PREFERRED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public DefaultHostsFileEntriesResolver() {
            r1 = this;
            io.netty.resolver.HostsFileEntries r0 = parseEntries()
            r1.<init>(r0)
            return
    }

    DefaultHostsFileEntriesResolver(io.netty.resolver.HostsFileEntries r2) {
            r1 = this;
            r1.<init>()
            java.util.Map r0 = r2.inet4Entries()
            r1.inet4Entries = r0
            java.util.Map r2 = r2.inet6Entries()
            r1.inet6Entries = r2
            return
    }

    private static io.netty.resolver.HostsFileEntries parseEntries() {
            boolean r0 = io.netty.util.internal.PlatformDependent.isWindows()
            if (r0 == 0) goto L1f
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1 = 3
            java.nio.charset.Charset[] r1 = new java.nio.charset.Charset[r1]
            r2 = 0
            r1[r2] = r0
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_16
            r2 = 1
            r1[r2] = r0
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            r2 = 2
            r1[r2] = r0
            io.netty.resolver.HostsFileEntries r0 = io.netty.resolver.HostsFileParser.parseSilently(r1)
            return r0
        L1f:
            io.netty.resolver.HostsFileEntries r0 = io.netty.resolver.HostsFileParser.parseSilently()
            return r0
    }

    @Override // io.netty.resolver.HostsFileEntriesResolver
    public java.net.InetAddress address(java.lang.String r3, io.netty.resolver.ResolvedAddressTypes r4) {
            r2 = this;
            java.lang.String r3 = r2.normalize(r3)
            int[] r0 = io.netty.resolver.DefaultHostsFileEntriesResolver.AnonymousClass1.$SwitchMap$io$netty$resolver$ResolvedAddressTypes
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L60
            r1 = 2
            if (r0 == r1) goto L57
            r1 = 3
            if (r0 == r1) goto L43
            r1 = 4
            if (r0 != r1) goto L2c
            java.util.Map<java.lang.String, java.net.Inet6Address> r4 = r2.inet6Entries
            java.lang.Object r4 = r4.get(r3)
            java.net.Inet6Address r4 = (java.net.Inet6Address) r4
            if (r4 == 0) goto L23
            return r4
        L23:
            java.util.Map<java.lang.String, java.net.Inet4Address> r4 = r2.inet4Entries
            java.lang.Object r3 = r4.get(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            return r3
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown ResolvedAddressTypes "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L43:
            java.util.Map<java.lang.String, java.net.Inet4Address> r4 = r2.inet4Entries
            java.lang.Object r4 = r4.get(r3)
            java.net.Inet4Address r4 = (java.net.Inet4Address) r4
            if (r4 == 0) goto L4e
            return r4
        L4e:
            java.util.Map<java.lang.String, java.net.Inet6Address> r4 = r2.inet6Entries
            java.lang.Object r3 = r4.get(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            return r3
        L57:
            java.util.Map<java.lang.String, java.net.Inet6Address> r4 = r2.inet6Entries
            java.lang.Object r3 = r4.get(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            return r3
        L60:
            java.util.Map<java.lang.String, java.net.Inet4Address> r4 = r2.inet4Entries
            java.lang.Object r3 = r4.get(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            return r3
    }

    java.lang.String normalize(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            return r2
    }
}

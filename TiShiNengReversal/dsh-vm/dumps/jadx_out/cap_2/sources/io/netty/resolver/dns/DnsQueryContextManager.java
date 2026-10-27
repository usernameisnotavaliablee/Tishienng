package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DnsQueryContextManager {
    final java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> map;

    DnsQueryContextManager() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            return
    }

    private io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext> getContextMap(java.net.InetSocketAddress r3) {
            r2 = this;
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r0 = r2.map
            monitor-enter(r0)
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r1 = r2.map     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld
            io.netty.util.collection.IntObjectMap r3 = (io.netty.util.collection.IntObjectMap) r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    private io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext> getOrCreateContextMap(java.net.InetSocketAddress r6) {
            r5 = this;
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r0 = r5.map
            monitor-enter(r0)
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r1 = r5.map     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> Lf
            io.netty.util.collection.IntObjectMap r1 = (io.netty.util.collection.IntObjectMap) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r6 = move-exception
            goto L7a
        L11:
            io.netty.util.collection.IntObjectHashMap r1 = new io.netty.util.collection.IntObjectHashMap     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            java.net.InetAddress r2 = r6.getAddress()     // Catch: java.lang.Throwable -> Lf
            int r3 = r6.getPort()     // Catch: java.lang.Throwable -> Lf
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r4 = r5.map     // Catch: java.lang.Throwable -> Lf
            r4.put(r6, r1)     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r2 instanceof java.net.Inet4Address     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L4b
            java.net.Inet4Address r2 = (java.net.Inet4Address) r2     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r2.isLoopbackAddress()     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L3c
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r6 = r5.map     // Catch: java.lang.Throwable -> Lf
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> Lf
            java.net.Inet6Address r4 = io.netty.util.NetUtil.LOCALHOST6     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> Lf
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> Lf
            goto L78
        L3c:
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r6 = r5.map     // Catch: java.lang.Throwable -> Lf
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> Lf
            java.net.Inet6Address r2 = toCompactAddress(r2)     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            r6.put(r4, r1)     // Catch: java.lang.Throwable -> Lf
            goto L78
        L4b:
            boolean r6 = r2 instanceof java.net.Inet6Address     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L78
            java.net.Inet6Address r2 = (java.net.Inet6Address) r2     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r2.isLoopbackAddress()     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L64
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r6 = r5.map     // Catch: java.lang.Throwable -> Lf
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> Lf
            java.net.Inet4Address r4 = io.netty.util.NetUtil.LOCALHOST4     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> Lf
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> Lf
            goto L78
        L64:
            boolean r6 = r2.isIPv4CompatibleAddress()     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L78
            java.util.Map<java.net.InetSocketAddress, io.netty.util.collection.IntObjectMap<io.netty.resolver.dns.DnsQueryContext>> r6 = r5.map     // Catch: java.lang.Throwable -> Lf
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> Lf
            java.net.Inet4Address r2 = toIPv4Address(r2)     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            r6.put(r4, r1)     // Catch: java.lang.Throwable -> Lf
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }

    private static java.net.Inet6Address toCompactAddress(java.net.Inet4Address r8) {
            byte[] r8 = r8.getAddress()
            r0 = 0
            r1 = r8[r0]
            r2 = 1
            r3 = r8[r2]
            r4 = 2
            r5 = r8[r4]
            r6 = 3
            r8 = r8[r6]
            r7 = 16
            byte[] r7 = new byte[r7]
            r7[r0] = r0
            r7[r2] = r0
            r7[r4] = r0
            r7[r6] = r0
            r2 = 4
            r7[r2] = r0
            r2 = 5
            r7[r2] = r0
            r2 = 6
            r7[r2] = r0
            r2 = 7
            r7[r2] = r0
            r2 = 8
            r7[r2] = r0
            r2 = 9
            r7[r2] = r0
            r2 = 10
            r7[r2] = r0
            r2 = 11
            r7[r2] = r0
            r0 = 12
            r7[r0] = r1
            r0 = 13
            r7[r0] = r3
            r0 = 14
            r7[r0] = r5
            r0 = 15
            r7[r0] = r8
            java.net.InetAddress r8 = java.net.InetAddress.getByAddress(r7)     // Catch: java.net.UnknownHostException -> L4f
            java.net.Inet6Address r8 = (java.net.Inet6Address) r8     // Catch: java.net.UnknownHostException -> L4f
            return r8
        L4f:
            r8 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r8)
            throw r0
    }

    private static java.net.Inet4Address toIPv4Address(java.net.Inet6Address r5) {
            byte[] r5 = r5.getAddress()
            r0 = 12
            r0 = r5[r0]
            r1 = 13
            r1 = r5[r1]
            r2 = 14
            r2 = r5[r2]
            r3 = 15
            r5 = r5[r3]
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            java.net.InetAddress r5 = java.net.InetAddress.getByAddress(r3)     // Catch: java.net.UnknownHostException -> L2a
            java.net.Inet4Address r5 = (java.net.Inet4Address) r5     // Catch: java.net.UnknownHostException -> L2a
            return r5
        L2a:
            r5 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r5)
            throw r0
    }

    int add(io.netty.resolver.dns.DnsQueryContext r6) {
            r5 = this;
            java.net.InetSocketAddress r0 = r6.nameServerAddr()
            io.netty.util.collection.IntObjectMap r0 = r5.getOrCreateContextMap(r0)
            java.util.Random r1 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            r2 = 65535(0xffff, float:9.1834E-41)
            int r1 = r1.nextInt(r2)
            int r1 = r1 + 1
            monitor-enter(r0)
            r3 = 0
        L17:
            boolean r4 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L24
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r6 = move-exception
            goto L4a
        L24:
            int r1 = r1 + 1
            r1 = r1 & r2
            int r3 = r3 + 1
            r4 = 131070(0x1fffe, float:1.83668E-40)
            if (r3 >= r4) goto L2f
            goto L17
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "query ID space exhausted: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L22
            io.netty.handler.codec.dns.DnsQuestion r6 = r6.question()     // Catch: java.lang.Throwable -> L22
            r2.append(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L22
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r6
    }

    io.netty.resolver.dns.DnsQueryContext get(java.net.InetSocketAddress r1, int r2) {
            r0 = this;
            io.netty.util.collection.IntObjectMap r1 = r0.getContextMap(r1)
            if (r1 == 0) goto L12
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> Lf
            io.netty.resolver.dns.DnsQueryContext r2 = (io.netty.resolver.dns.DnsQueryContext) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
        L12:
            r1 = 0
            return r1
    }

    io.netty.resolver.dns.DnsQueryContext remove(java.net.InetSocketAddress r1, int r2) {
            r0 = this;
            io.netty.util.collection.IntObjectMap r1 = r0.getContextMap(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            monitor-enter(r1)
            java.lang.Object r2 = r1.remove(r2)     // Catch: java.lang.Throwable -> L11
            io.netty.resolver.dns.DnsQueryContext r2 = (io.netty.resolver.dns.DnsQueryContext) r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }
}

package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RoundRobinInetAddressResolver extends io.netty.resolver.InetNameResolver {
    private final io.netty.resolver.NameResolver<java.net.InetAddress> nameResolver;



    public RoundRobinInetAddressResolver(io.netty.util.concurrent.EventExecutor r1, io.netty.resolver.NameResolver<java.net.InetAddress> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.nameResolver = r2
            return
    }

    static /* synthetic */ int access$000(int r0) {
            int r0 = randomIndex(r0)
            return r0
    }

    private static int randomIndex(int r1) {
            r0 = 1
            if (r1 != r0) goto L5
            r1 = 0
            return r1
        L5:
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            int r1 = r0.nextInt(r1)
            return r1
    }

    @Override // io.netty.resolver.SimpleNameResolver, io.netty.resolver.NameResolver, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.resolver.NameResolver<java.net.InetAddress> r0 = r1.nameResolver
            r0.close()
            return
    }

    @Override // io.netty.resolver.SimpleNameResolver
    protected void doResolve(java.lang.String r3, io.netty.util.concurrent.Promise<java.net.InetAddress> r4) throws java.lang.Exception {
            r2 = this;
            io.netty.resolver.NameResolver<java.net.InetAddress> r0 = r2.nameResolver
            io.netty.util.concurrent.Future r0 = r0.resolveAll(r3)
            io.netty.resolver.RoundRobinInetAddressResolver$1 r1 = new io.netty.resolver.RoundRobinInetAddressResolver$1
            r1.<init>(r2, r4, r3)
            r0.addListener(r1)
            return
    }

    @Override // io.netty.resolver.SimpleNameResolver
    protected void doResolveAll(java.lang.String r2, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r3) throws java.lang.Exception {
            r1 = this;
            io.netty.resolver.NameResolver<java.net.InetAddress> r0 = r1.nameResolver
            io.netty.util.concurrent.Future r2 = r0.resolveAll(r2)
            io.netty.resolver.RoundRobinInetAddressResolver$2 r0 = new io.netty.resolver.RoundRobinInetAddressResolver$2
            r0.<init>(r1, r3)
            r2.addListener(r0)
            return
    }
}

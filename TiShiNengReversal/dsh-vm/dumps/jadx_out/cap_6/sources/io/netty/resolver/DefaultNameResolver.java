package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultNameResolver extends io.netty.resolver.InetNameResolver {
    public DefaultNameResolver(io.netty.util.concurrent.EventExecutor r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.resolver.SimpleNameResolver
    protected void doResolve(java.lang.String r1, io.netty.util.concurrent.Promise<java.net.InetAddress> r2) throws java.lang.Exception {
            r0 = this;
            java.net.InetAddress r1 = io.netty.util.internal.SocketUtils.addressByName(r1)     // Catch: java.net.UnknownHostException -> L8
            r2.setSuccess(r1)     // Catch: java.net.UnknownHostException -> L8
            return
        L8:
            r1 = move-exception
            r2.setFailure(r1)
            return
    }

    @Override // io.netty.resolver.SimpleNameResolver
    protected void doResolveAll(java.lang.String r1, io.netty.util.concurrent.Promise<java.util.List<java.net.InetAddress>> r2) throws java.lang.Exception {
            r0 = this;
            java.net.InetAddress[] r1 = io.netty.util.internal.SocketUtils.allAddressesByName(r1)     // Catch: java.net.UnknownHostException -> Lc
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.net.UnknownHostException -> Lc
            r2.setSuccess(r1)     // Catch: java.net.UnknownHostException -> Lc
            return
        Lc:
            r1 = move-exception
            r2.setFailure(r1)
            return
    }
}

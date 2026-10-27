package io.netty.resolver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NoopAddressResolver extends io.netty.resolver.AbstractAddressResolver<java.net.SocketAddress> {
    public NoopAddressResolver(io.netty.util.concurrent.EventExecutor r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.resolver.AbstractAddressResolver
    protected boolean doIsResolved(java.net.SocketAddress r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // io.netty.resolver.AbstractAddressResolver
    protected void doResolve(java.net.SocketAddress r1, io.netty.util.concurrent.Promise<java.net.SocketAddress> r2) throws java.lang.Exception {
            r0 = this;
            r2.setSuccess(r1)
            return
    }

    @Override // io.netty.resolver.AbstractAddressResolver
    protected void doResolveAll(java.net.SocketAddress r1, io.netty.util.concurrent.Promise<java.util.List<java.net.SocketAddress>> r2) throws java.lang.Exception {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2.setSuccess(r1)
            return
    }
}

package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslCachingKeyMaterialProvider extends io.netty.handler.ssl.OpenSslKeyMaterialProvider {
    private final java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.handler.ssl.OpenSslKeyMaterial> cache;

    OpenSslCachingKeyMaterialProvider(javax.net.ssl.X509KeyManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.cache = r1
            return
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterialProvider
    io.netty.handler.ssl.OpenSslKeyMaterial chooseKeyMaterial(io.netty.buffer.ByteBufAllocator r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.handler.ssl.OpenSslKeyMaterial> r0 = r1.cache
            java.lang.Object r0 = r0.get(r3)
            io.netty.handler.ssl.OpenSslKeyMaterial r0 = (io.netty.handler.ssl.OpenSslKeyMaterial) r0
            if (r0 != 0) goto L20
            io.netty.handler.ssl.OpenSslKeyMaterial r0 = super.chooseKeyMaterial(r2, r3)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.handler.ssl.OpenSslKeyMaterial> r2 = r1.cache
            java.lang.Object r2 = r2.putIfAbsent(r3, r0)
            io.netty.handler.ssl.OpenSslKeyMaterial r2 = (io.netty.handler.ssl.OpenSslKeyMaterial) r2
            if (r2 == 0) goto L20
            r0.release()
            r0 = r2
        L20:
            io.netty.handler.ssl.OpenSslKeyMaterial r2 = r0.retain()
            return r2
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterialProvider
    void destroy() {
            r2 = this;
        L0:
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.handler.ssl.OpenSslKeyMaterial> r0 = r2.cache
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            io.netty.handler.ssl.OpenSslKeyMaterial r1 = (io.netty.handler.ssl.OpenSslKeyMaterial) r1
            r1.release()
            r0.remove()
            goto La
        L1d:
            java.util.concurrent.ConcurrentMap<java.lang.String, io.netty.handler.ssl.OpenSslKeyMaterial> r0 = r2.cache
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L0
            return
    }
}

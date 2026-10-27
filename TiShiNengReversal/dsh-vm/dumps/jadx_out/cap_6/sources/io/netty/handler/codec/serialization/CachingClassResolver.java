package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class CachingClassResolver implements io.netty.handler.codec.serialization.ClassResolver {
    private final java.util.Map<java.lang.String, java.lang.Class<?>> classCache;
    private final io.netty.handler.codec.serialization.ClassResolver delegate;

    CachingClassResolver(io.netty.handler.codec.serialization.ClassResolver r1, java.util.Map<java.lang.String, java.lang.Class<?>> r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.classCache = r2
            return
    }

    @Override // io.netty.handler.codec.serialization.ClassResolver
    public java.lang.Class<?> resolve(java.lang.String r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r2.classCache
            java.lang.Object r0 = r0.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            io.netty.handler.codec.serialization.ClassResolver r0 = r2.delegate
            java.lang.Class r0 = r0.resolve(r3)
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r2.classCache
            r1.put(r3, r0)
            return r0
    }
}

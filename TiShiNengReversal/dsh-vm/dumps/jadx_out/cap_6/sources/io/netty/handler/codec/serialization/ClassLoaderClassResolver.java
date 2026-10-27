package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ClassLoaderClassResolver implements io.netty.handler.codec.serialization.ClassResolver {
    private final java.lang.ClassLoader classLoader;

    ClassLoaderClassResolver(java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>()
            r0.classLoader = r1
            return
    }

    @Override // io.netty.handler.codec.serialization.ClassResolver
    public java.lang.Class<?> resolve(java.lang.String r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.ClassLoader r0 = r2.classLoader     // Catch: java.lang.ClassNotFoundException -> L7
            java.lang.Class r3 = r0.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L7
            return r3
        L7:
            r0 = 0
            java.lang.ClassLoader r1 = r2.classLoader
            java.lang.Class r3 = java.lang.Class.forName(r3, r0, r1)
            return r3
    }
}

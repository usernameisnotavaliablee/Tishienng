package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ClassResolvers {
    private ClassResolvers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.serialization.ClassResolver cacheDisabled(java.lang.ClassLoader r1) {
            io.netty.handler.codec.serialization.ClassLoaderClassResolver r0 = new io.netty.handler.codec.serialization.ClassLoaderClassResolver
            java.lang.ClassLoader r1 = defaultClassLoader(r1)
            r0.<init>(r1)
            return r0
    }

    static java.lang.ClassLoader defaultClassLoader(java.lang.ClassLoader r0) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent.getContextClassLoader()
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Class<io.netty.handler.codec.serialization.ClassResolvers> r0 = io.netty.handler.codec.serialization.ClassResolvers.class
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent.getClassLoader(r0)
            return r0
    }

    public static io.netty.handler.codec.serialization.ClassResolver softCachingConcurrentResolver(java.lang.ClassLoader r3) {
            io.netty.handler.codec.serialization.CachingClassResolver r0 = new io.netty.handler.codec.serialization.CachingClassResolver
            io.netty.handler.codec.serialization.ClassLoaderClassResolver r1 = new io.netty.handler.codec.serialization.ClassLoaderClassResolver
            java.lang.ClassLoader r3 = defaultClassLoader(r3)
            r1.<init>(r3)
            io.netty.handler.codec.serialization.SoftReferenceMap r3 = new io.netty.handler.codec.serialization.SoftReferenceMap
            java.util.concurrent.ConcurrentMap r2 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r3.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static io.netty.handler.codec.serialization.ClassResolver softCachingResolver(java.lang.ClassLoader r3) {
            io.netty.handler.codec.serialization.CachingClassResolver r0 = new io.netty.handler.codec.serialization.CachingClassResolver
            io.netty.handler.codec.serialization.ClassLoaderClassResolver r1 = new io.netty.handler.codec.serialization.ClassLoaderClassResolver
            java.lang.ClassLoader r3 = defaultClassLoader(r3)
            r1.<init>(r3)
            io.netty.handler.codec.serialization.SoftReferenceMap r3 = new io.netty.handler.codec.serialization.SoftReferenceMap
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static io.netty.handler.codec.serialization.ClassResolver weakCachingConcurrentResolver(java.lang.ClassLoader r3) {
            io.netty.handler.codec.serialization.CachingClassResolver r0 = new io.netty.handler.codec.serialization.CachingClassResolver
            io.netty.handler.codec.serialization.ClassLoaderClassResolver r1 = new io.netty.handler.codec.serialization.ClassLoaderClassResolver
            java.lang.ClassLoader r3 = defaultClassLoader(r3)
            r1.<init>(r3)
            io.netty.handler.codec.serialization.WeakReferenceMap r3 = new io.netty.handler.codec.serialization.WeakReferenceMap
            java.util.concurrent.ConcurrentMap r2 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r3.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static io.netty.handler.codec.serialization.ClassResolver weakCachingResolver(java.lang.ClassLoader r3) {
            io.netty.handler.codec.serialization.CachingClassResolver r0 = new io.netty.handler.codec.serialization.CachingClassResolver
            io.netty.handler.codec.serialization.ClassLoaderClassResolver r1 = new io.netty.handler.codec.serialization.ClassLoaderClassResolver
            java.lang.ClassLoader r3 = defaultClassLoader(r3)
            r1.<init>(r3)
            io.netty.handler.codec.serialization.WeakReferenceMap r3 = new io.netty.handler.codec.serialization.WeakReferenceMap
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }
}

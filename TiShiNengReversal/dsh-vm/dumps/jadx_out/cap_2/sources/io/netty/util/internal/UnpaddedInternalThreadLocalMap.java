package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class UnpaddedInternalThreadLocalMap {
    static final java.util.concurrent.atomic.AtomicInteger nextIndex = null;
    static final java.lang.ThreadLocal<io.netty.util.internal.InternalThreadLocalMap> slowThreadLocalMap = null;
    java.util.ArrayList<java.lang.Object> arrayList;
    java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetDecoder> charsetDecoderCache;
    java.util.Map<java.nio.charset.Charset, java.nio.charset.CharsetEncoder> charsetEncoderCache;
    io.netty.util.internal.IntegerHolder counterHashCode;
    int futureListenerStackDepth;
    java.util.Map<java.lang.Class<?>, java.lang.Boolean> handlerSharableCache;
    java.lang.Object[] indexedVariables;
    int localChannelReaderStackDepth;
    io.netty.util.internal.ThreadLocalRandom random;
    java.lang.StringBuilder stringBuilder;
    java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, io.netty.util.internal.TypeParameterMatcher>> typeParameterMatcherFindCache;
    java.util.Map<java.lang.Class<?>, io.netty.util.internal.TypeParameterMatcher> typeParameterMatcherGetCache;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            io.netty.util.internal.UnpaddedInternalThreadLocalMap.slowThreadLocalMap = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            io.netty.util.internal.UnpaddedInternalThreadLocalMap.nextIndex = r0
            return
    }

    UnpaddedInternalThreadLocalMap(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.indexedVariables = r1
            return
    }
}

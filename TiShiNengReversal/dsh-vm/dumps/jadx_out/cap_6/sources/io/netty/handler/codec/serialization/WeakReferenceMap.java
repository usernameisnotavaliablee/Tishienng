package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class WeakReferenceMap<K, V> extends io.netty.handler.codec.serialization.ReferenceMap<K, V> {
    WeakReferenceMap(java.util.Map<K, java.lang.ref.Reference<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.serialization.ReferenceMap
    java.lang.ref.Reference<V> fold(V r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            return r0
    }
}

package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingConcurrentMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    protected ForwardingConcurrentMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Map delegate() {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected abstract java.util.concurrent.ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            return r2
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            boolean r2 = r0.remove(r2, r3)
            return r2
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V replace(K r2, V r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            java.lang.Object r2 = r0.replace(r2, r3)
            return r2
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.delegate()
            boolean r2 = r0.replace(r2, r3, r4)
            return r2
    }
}

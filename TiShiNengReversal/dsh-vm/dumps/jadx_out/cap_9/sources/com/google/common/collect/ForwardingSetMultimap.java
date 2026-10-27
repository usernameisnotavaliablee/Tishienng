package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingSetMultimap<K, V> extends com.google.common.collect.ForwardingMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
    public ForwardingSetMultimap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.collect.SetMultimap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            java.util.Set r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.delegate()
            java.util.Set r0 = r0.entries()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public java.util.Set<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2) {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.delegate()
            java.util.Set r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Set<V> removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.delegate()
            java.util.Set r2 = r0.removeAll(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.Set r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Set<V> replaceValues(K r2, java.lang.Iterable<? extends V> r3) {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.delegate()
            java.util.Set r2 = r0.replaceValues(r2, r3)
            return r2
    }
}

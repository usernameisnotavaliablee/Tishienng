package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface SetMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.Multimap
    java.util.Set<java.util.Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @Override // com.google.common.collect.Multimap
    java.util.Set<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1);

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Set<V> removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Set<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2);
}

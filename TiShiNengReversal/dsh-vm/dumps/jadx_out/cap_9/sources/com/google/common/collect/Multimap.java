package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    void clear();

    boolean containsEntry(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r2);

    boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r1);

    java.util.Collection<java.util.Map.Entry<K, V>> entries();

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    java.util.Collection<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1);

    int hashCode();

    boolean isEmpty();

    java.util.Set<K> keySet();

    com.google.common.collect.Multiset<K> keys();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, java.lang.Iterable<? extends V> r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Collection<V> removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Collection<V> replaceValues(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, java.lang.Iterable<? extends V> r2);

    int size();

    java.util.Collection<V> values();
}

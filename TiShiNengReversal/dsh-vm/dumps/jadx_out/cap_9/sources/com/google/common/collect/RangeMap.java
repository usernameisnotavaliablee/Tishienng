package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface RangeMap<K extends java.lang.Comparable, V> {
    java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges();

    java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V get(K r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K r1);

    int hashCode();

    void put(com.google.common.collect.Range<K> r1, V r2);

    void putAll(com.google.common.collect.RangeMap<K, V> r1);

    void putCoalescing(com.google.common.collect.Range<K> r1, V r2);

    void remove(com.google.common.collect.Range<K> r1);

    com.google.common.collect.Range<K> span();

    com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> r1);

    java.lang.String toString();
}

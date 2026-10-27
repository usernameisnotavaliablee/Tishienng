package com.google.common.collect;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface RangeSet<C extends java.lang.Comparable> {
    void add(com.google.common.collect.Range<C> r1);

    void addAll(com.google.common.collect.RangeSet<C> r1);

    void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1);

    java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges();

    java.util.Set<com.google.common.collect.Range<C>> asRanges();

    void clear();

    com.google.common.collect.RangeSet<C> complement();

    boolean contains(C r1);

    boolean encloses(com.google.common.collect.Range<C> r1);

    boolean enclosesAll(com.google.common.collect.RangeSet<C> r1);

    boolean enclosesAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1);

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    int hashCode();

    boolean intersects(com.google.common.collect.Range<C> r1);

    boolean isEmpty();

    com.google.common.collect.Range<C> rangeContaining(C r1);

    void remove(com.google.common.collect.Range<C> r1);

    void removeAll(com.google.common.collect.RangeSet<C> r1);

    void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1);

    com.google.common.collect.Range<C> span();

    com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> r1);

    java.lang.String toString();
}

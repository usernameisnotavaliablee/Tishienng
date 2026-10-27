package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface SortedMultiset<E> extends com.google.common.collect.SortedMultisetBridge<E>, com.google.common.collect.SortedIterable<E> {
    java.util.Comparator<? super E> comparator();

    com.google.common.collect.SortedMultiset<E> descendingMultiset();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    java.util.NavigableSet<E> elementSet();

    @Override // com.google.common.collect.Multiset
    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    com.google.common.collect.Multiset.Entry<E> firstEntry();

    com.google.common.collect.SortedMultiset<E> headMultiset(E r1, com.google.common.collect.BoundType r2);

    @Override // com.google.common.collect.Multiset, java.util.Collection, java.lang.Iterable
    java.util.Iterator<E> iterator();

    com.google.common.collect.Multiset.Entry<E> lastEntry();

    com.google.common.collect.Multiset.Entry<E> pollFirstEntry();

    com.google.common.collect.Multiset.Entry<E> pollLastEntry();

    com.google.common.collect.SortedMultiset<E> subMultiset(E r1, com.google.common.collect.BoundType r2, E r3, com.google.common.collect.BoundType r4);

    com.google.common.collect.SortedMultiset<E> tailMultiset(E r1, com.google.common.collect.BoundType r2);
}

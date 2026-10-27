package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface MapDifference<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ValueDifference<V> {
        boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

        int hashCode();

        V leftValue();

        V rightValue();
    }

    boolean areEqual();

    java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    java.util.Map<K, V> entriesInCommon();

    java.util.Map<K, V> entriesOnlyOnLeft();

    java.util.Map<K, V> entriesOnlyOnRight();

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    int hashCode();
}

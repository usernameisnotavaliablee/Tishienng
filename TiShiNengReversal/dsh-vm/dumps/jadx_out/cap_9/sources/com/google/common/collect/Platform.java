package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Platform {
    private Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> T[] copy(java.lang.Object[] r0, int r1, int r2, T[] r3) {
            java.lang.Class r3 = r3.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2, r3)
            return r0
    }

    static <T> T[] newArray(T[] r0, int r1) {
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    static <K, V> java.util.Map<K, V> newHashMapWithExpectedSize(int r0) {
            com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.createWithExpectedSize(r0)
            return r0
    }

    static <E> java.util.Set<E> newHashSetWithExpectedSize(int r0) {
            com.google.common.collect.CompactHashSet r0 = com.google.common.collect.CompactHashSet.createWithExpectedSize(r0)
            return r0
    }

    static <K, V> java.util.Map<K, V> newLinkedHashMapWithExpectedSize(int r0) {
            com.google.common.collect.CompactLinkedHashMap r0 = com.google.common.collect.CompactLinkedHashMap.createWithExpectedSize(r0)
            return r0
    }

    static <E> java.util.Set<E> newLinkedHashSetWithExpectedSize(int r0) {
            com.google.common.collect.CompactLinkedHashSet r0 = com.google.common.collect.CompactLinkedHashSet.createWithExpectedSize(r0)
            return r0
    }

    static <E> java.util.Set<E> preservesInsertionOrderOnAddsSet() {
            com.google.common.collect.CompactHashSet r0 = com.google.common.collect.CompactHashSet.create()
            return r0
    }

    static <K, V> java.util.Map<K, V> preservesInsertionOrderOnPutsMap() {
            com.google.common.collect.CompactHashMap r0 = com.google.common.collect.CompactHashMap.create()
            return r0
    }

    static int reduceExponentIfGwt(int r0) {
            return r0
    }

    static int reduceIterationsIfGwt(int r0) {
            return r0
    }

    static com.google.common.collect.MapMaker tryWeakKeys(com.google.common.collect.MapMaker r0) {
            com.google.common.collect.MapMaker r0 = r0.weakKeys()
            return r0
    }
}

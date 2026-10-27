package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class ImmutableMapEntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static class EntrySetSerializedForm<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<K, V> map;

        EntrySetSerializedForm(com.google.common.collect.ImmutableMap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                return
        }

        java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
                com.google.common.collect.ImmutableSet r0 = r0.entrySet()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RegularEntrySet<K, V> extends com.google.common.collect.ImmutableMapEntrySet<K, V> {
        private final transient com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> entries;

        @com.google.j2objc.annotations.Weak
        private final transient com.google.common.collect.ImmutableMap<K, V> map;

        RegularEntrySet(com.google.common.collect.ImmutableMap<K, V> r1, com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> r2) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.entries = r2
                return
        }

        RegularEntrySet(com.google.common.collect.ImmutableMap<K, V> r1, java.util.Map.Entry<K, V>[] r2) {
                r0 = this;
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.asImmutableList(r2)
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection
        @com.google.common.annotations.GwtIncompatible("not used in GWT")
        int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList<java.util.Map$Entry<K, V>> r0 = r1.entries
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet
        com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.util.Map$Entry<K, V>> r0 = r1.entries
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableList<java.util.Map$Entry<K, V>> r0 = r1.entries
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        com.google.common.collect.ImmutableMap<K, V> map() {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, V> r0 = r1.map
                return r0
        }
    }

    ImmutableMapEntrySet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L21
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.google.common.collect.ImmutableMap r0 = r3.map()
            java.lang.Object r2 = r4.getKey()
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L21
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L21
            r4 = 1
            return r4
        L21:
            return r1
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
    @com.google.common.annotations.GwtIncompatible
    boolean isHashCodeFast() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            boolean r0 = r0.isHashCodeFast()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            boolean r0 = r0.isPartialView()
            return r0
    }

    abstract com.google.common.collect.ImmutableMap<K, V> map();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableMap r0 = r1.map()
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.ImmutableMapEntrySet$EntrySetSerializedForm r0 = new com.google.common.collect.ImmutableMapEntrySet$EntrySetSerializedForm
            com.google.common.collect.ImmutableMap r1 = r2.map()
            r0.<init>(r1)
            return r0
    }
}

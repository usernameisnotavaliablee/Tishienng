package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class q<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b<K> {

    @com.google.j2objc.annotations.Weak
    private final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> a;

    q(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r1.a
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b
    K get(int r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r0.asList()
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<K> iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.keyIterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r1.a
            int r0 = r0.size()
            return r0
    }
}

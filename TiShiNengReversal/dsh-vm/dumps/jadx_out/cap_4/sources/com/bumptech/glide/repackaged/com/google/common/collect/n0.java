package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class n0<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<K, V> {
    final transient K a;
    final transient V b;
    transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> c;

    n0(K r1, V r2) {
            r0 = this;
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.f.a(r1, r2)
            r0.a = r1
            r0.b = r2
            return
    }

    private n0(K r1, V r2, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            K r0 = r1.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            V r0 = r1.b
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r2 = this;
            K r0 = r2.a
            V r1 = r2.b
            java.util.Map$Entry r0 = com.bumptech.glide.repackaged.com.google.common.collect.x.b(r0, r1)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<K> createKeySet() {
            r1 = this;
            K r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of(r0)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            K r0 = r1.a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lb
            V r2 = r1.b
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> inverse() {
            r3 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> r0 = r3.c
            if (r0 != 0) goto Lf
            com.bumptech.glide.repackaged.com.google.common.collect.n0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.n0
            V r1 = r3.b
            K r2 = r3.a
            r0.<init>(r1, r2, r3)
            r3.c = r0
        Lf:
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            r0 = 1
            return r0
    }
}

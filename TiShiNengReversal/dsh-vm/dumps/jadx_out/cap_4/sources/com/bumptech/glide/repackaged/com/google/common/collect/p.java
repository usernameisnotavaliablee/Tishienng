package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class p<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.p<K, V> {

        @com.google.j2objc.annotations.Weak
        private final transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> a;
        private final transient java.util.Map.Entry<K, V>[] b;

        a(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r1, java.util.Map.Entry<K, V>[] r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.p
        com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> a() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r1.a
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
        com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                r2 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.e0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.e0
                java.util.Map$Entry<K, V>[] r1 = r2.b
                r0.<init>(r2, r1)
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public com.bumptech.glide.repackaged.com.google.common.collect.u0<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r1.asList()
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.iterator()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
                return r0
        }
    }

    p() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> a();

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L21
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r0 = r3.a()
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

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r0 = r1.a()
            boolean r0 = r0.isHashCodeFast()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r0 = r1.a()
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r0 = r1.a()
            int r0 = r0.size()
            return r0
    }
}

package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class r<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<V> {

    @com.google.j2objc.annotations.Weak
    private final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bumptech.glide.repackaged.com.google.common.collect.u0<V> {
        final com.bumptech.glide.repackaged.com.google.common.collect.u0<java.util.Map.Entry<K, V>> a;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.r b;

        a(com.bumptech.glide.repackaged.com.google.common.collect.r r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r1 = com.bumptech.glide.repackaged.com.google.common.collect.r.a(r1)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r1 = r1.entrySet()
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r1 = r1.iterator()
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0<java.util.Map$Entry<K, V>> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public V next() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0<java.util.Map$Entry<K, V>> r0 = r1.a
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends com.bumptech.glide.repackaged.com.google.common.collect.l<V> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList a;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.r b;

        b(com.bumptech.glide.repackaged.com.google.common.collect.r r1, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.l
        com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<V> a() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.r r0 = r1.b
                return r0
        }

        @Override // java.util.List
        public V get(int r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r1.a
                java.lang.Object r2 = r0.get(r2)
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getValue()
                return r2
        }
    }

    r(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap a(com.bumptech.glide.repackaged.com.google.common.collect.r r0) {
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r0.a
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Le
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            boolean r2 = com.bumptech.glide.repackaged.com.google.common.collect.v.d(r0, r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<V> createAsList() {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r2.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r0.entrySet()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r0.asList()
            com.bumptech.glide.repackaged.com.google.common.collect.r$b r1 = new com.bumptech.glide.repackaged.com.google.common.collect.r$b
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<V> iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.r$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.r$a
            r0.<init>(r1)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> r0 = r1.a
            int r0 = r0.size()
            return r0
    }
}

package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ImmutableMap<K, V> implements java.io.Serializable, java.util.Map<K, V> {
    static final java.util.Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = null;
    private transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet;
    private transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<K> keySet;
    private transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<V> values;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bumptech.glide.repackaged.com.google.common.collect.u0<K> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.u0 a;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap b;

        a(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap r1, com.bumptech.glide.repackaged.com.google.common.collect.u0 r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public K next() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.a
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getKey()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b<K, V> {
        java.util.Comparator<? super V> a;
        com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] b;
        int c;
        boolean d;

        public b() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        b(int r1) {
                r0 = this;
                r0.<init>()
                com.bumptech.glide.repackaged.com.google.common.collect.o[] r1 = new com.bumptech.glide.repackaged.com.google.common.collect.o[r1]
                r0.b = r1
                r1 = 0
                r0.c = r1
                r0.d = r1
                return
        }

        private void a(int r3) {
                r2 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r0 = r2.b
                int r1 = r0.length
                if (r3 <= r1) goto L15
                int r1 = r0.length
                int r3 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b.c(r1, r3)
                java.lang.Object[] r3 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a(r0, r3)
                com.bumptech.glide.repackaged.com.google.common.collect.o[] r3 = (com.bumptech.glide.repackaged.com.google.common.collect.o[]) r3
                r2.b = r3
                r3 = 0
                r2.d = r3
            L15:
                return
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.b<K, V> b(K r3, V r4) {
                r2 = this;
                int r0 = r2.c
                int r0 = r0 + 1
                r2.a(r0)
                com.bumptech.glide.repackaged.com.google.common.collect.o r3 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.entryOf(r3, r4)
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r4 = r2.b
                int r0 = r2.c
                int r1 = r0 + 1
                r2.c = r1
                r4[r0] = r3
                return r2
        }
    }

    static {
            r0 = 0
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY = r0
            return
    }

    ImmutableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkNoConflict(boolean r2, java.lang.String r3, java.util.Map.Entry<?, ?> r4, java.util.Map.Entry<?, ?> r5) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Multiple entries with same "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " and "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static <K, V> com.bumptech.glide.repackaged.com.google.common.collect.o<K, V> entryOf(K r1, V r2) {
            com.bumptech.glide.repackaged.com.google.common.collect.o r0 = new com.bumptech.glide.repackaged.com.google.common.collect.o
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = r1.values()
            boolean r2 = r0.contains(r2)
            return r2
    }

    abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet();

    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<K> createKeySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of()
            return r0
        Lb:
            com.bumptech.glide.repackaged.com.google.common.collect.q r0 = new com.bumptech.glide.repackaged.com.google.common.collect.q
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 != 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.repackaged.com.google.common.collect.x.a(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public abstract V get(java.lang.Object r1);

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            int r0 = com.bumptech.glide.repackaged.com.google.common.collect.m0.b(r0)
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    boolean isHashCodeFast() {
            r1 = this;
            r0 = 0
            return r0
    }

    abstract boolean isPartialView();

    com.bumptech.glide.repackaged.com.google.common.collect.u0<K> keyIterator() {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r0.iterator()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap$a r1 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap$a
            r1.<init>(r2, r0)
            return r1
    }

    @Override // java.util.Map
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<K> keySet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<K> r0 = r1.keySet
            if (r0 != 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.createKeySet()
            r1.keySet = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.keySet()
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.bumptech.glide.repackaged.com.google.common.collect.x.c(r1)
            return r0
    }

    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<V> r0 = r1.values
            if (r0 != 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.r r0 = new com.bumptech.glide.repackaged.com.google.common.collect.r
            r0.<init>(r1)
            r1.values = r0
        Lb:
            return r0
    }

    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }
}

package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class f0<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<K, V> {
    static final com.bumptech.glide.repackaged.com.google.common.collect.f0<java.lang.Object, java.lang.Object> g = null;
    private final transient com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] a;
    private final transient com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] b;
    private final transient java.util.Map.Entry<K, V>[] c;
    private final transient int d;
    private final transient int e;
    private transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class b extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.f0 a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class a extends com.bumptech.glide.repackaged.com.google.common.collect.p<V, K> {
            final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.f0.b a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a$a, reason: collision with other inner class name */
            class C0037a extends com.bumptech.glide.repackaged.com.google.common.collect.l<java.util.Map.Entry<V, K>> {
                final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.f0.b.a a;

                C0037a(com.bumptech.glide.repackaged.com.google.common.collect.f0.b.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // com.bumptech.glide.repackaged.com.google.common.collect.l
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<java.util.Map.Entry<V, K>> a() {
                        r1 = this;
                        com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a r0 = r1.a
                        return r0
                }

                public java.util.Map.Entry<V, K> d(int r2) {
                        r1 = this;
                        com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a r0 = r1.a
                        com.bumptech.glide.repackaged.com.google.common.collect.f0$b r0 = r0.a
                        com.bumptech.glide.repackaged.com.google.common.collect.f0 r0 = r0.a
                        java.util.Map$Entry[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.f0.d(r0)
                        r2 = r0[r2]
                        java.lang.Object r0 = r2.getValue()
                        java.lang.Object r2 = r2.getKey()
                        java.util.Map$Entry r2 = com.bumptech.glide.repackaged.com.google.common.collect.x.b(r0, r2)
                        return r2
                }

                @Override // java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        java.util.Map$Entry r1 = r0.d(r1)
                        return r1
                }
            }

            a(com.bumptech.glide.repackaged.com.google.common.collect.f0.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.p
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<V, K> a() {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.f0$b r0 = r1.a
                    return r0
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<java.util.Map.Entry<V, K>> createAsList() {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a$a
                    r0.<init>(r1)
                    return r0
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.p, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
            public int hashCode() {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.f0$b r0 = r1.a
                    com.bumptech.glide.repackaged.com.google.common.collect.f0 r0 = r0.a
                    int r0 = com.bumptech.glide.repackaged.com.google.common.collect.f0.c(r0)
                    return r0
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.p, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet
            boolean isHashCodeFast() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public com.bumptech.glide.repackaged.com.google.common.collect.u0<java.util.Map.Entry<V, K>> iterator() {
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

        private b(com.bumptech.glide.repackaged.com.google.common.collect.f0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.bumptech.glide.repackaged.com.google.common.collect.f0 r1, com.bumptech.glide.repackaged.com.google.common.collect.f0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
        com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<V, K>> createEntrySet() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.f0$b$a
                r0.<init>(r1)
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
        public K get(java.lang.Object r4) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L39
                com.bumptech.glide.repackaged.com.google.common.collect.f0 r1 = r3.a
                com.bumptech.glide.repackaged.com.google.common.collect.o[] r1 = com.bumptech.glide.repackaged.com.google.common.collect.f0.a(r1)
                if (r1 != 0) goto Lc
                goto L39
            Lc:
                int r1 = r4.hashCode()
                int r1 = com.bumptech.glide.repackaged.com.google.common.collect.k.b(r1)
                com.bumptech.glide.repackaged.com.google.common.collect.f0 r2 = r3.a
                int r2 = com.bumptech.glide.repackaged.com.google.common.collect.f0.b(r2)
                r1 = r1 & r2
                com.bumptech.glide.repackaged.com.google.common.collect.f0 r2 = r3.a
                com.bumptech.glide.repackaged.com.google.common.collect.o[] r2 = com.bumptech.glide.repackaged.com.google.common.collect.f0.a(r2)
                r1 = r2[r1]
            L23:
                if (r1 == 0) goto L39
                java.lang.Object r2 = r1.getValue()
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L34
                java.lang.Object r4 = r1.getKey()
                return r4
            L34:
                com.bumptech.glide.repackaged.com.google.common.collect.o r1 = r1.c()
                goto L23
            L39:
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap
        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<K, V> inverse() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.f0 r0 = r1.a
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
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap r0 = r1.inverse()
                int r0 = r0.size()
                return r0
        }
    }

    static {
            com.bumptech.glide.repackaged.com.google.common.collect.f0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.f0
            java.util.Map$Entry<?, ?>[] r1 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY
            r3 = r1
            java.util.Map$Entry[] r3 = (java.util.Map.Entry[]) r3
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.bumptech.glide.repackaged.com.google.common.collect.f0.g = r0
            return
    }

    private f0(com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r1, com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r2, java.util.Map.Entry<K, V>[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.o[] a(com.bumptech.glide.repackaged.com.google.common.collect.f0 r0) {
            com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r0 = r0.b
            return r0
    }

    static /* synthetic */ int b(com.bumptech.glide.repackaged.com.google.common.collect.f0 r0) {
            int r0 = r0.d
            return r0
    }

    static /* synthetic */ int c(com.bumptech.glide.repackaged.com.google.common.collect.f0 r0) {
            int r0 = r0.e
            return r0
    }

    static /* synthetic */ java.util.Map.Entry[] d(com.bumptech.glide.repackaged.com.google.common.collect.f0 r0) {
            java.util.Map$Entry<K, V>[] r0 = r0.c
            return r0
    }

    private static void e(java.lang.Object r2, java.util.Map.Entry<?, ?> r3, com.bumptech.glide.repackaged.com.google.common.collect.o<?, ?> r4) {
        L0:
            if (r4 == 0) goto L16
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            java.lang.String r1 = "value"
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.checkNoConflict(r0, r1, r3, r4)
            com.bumptech.glide.repackaged.com.google.common.collect.o r4 = r4.c()
            goto L0
        L16:
            return
    }

    static <K, V> com.bumptech.glide.repackaged.com.google.common.collect.f0<K, V> f(int r16, java.util.Map.Entry<K, V>[] r17) {
            r0 = r16
            r1 = r17
            int r2 = r1.length
            com.bumptech.glide.repackaged.com.google.common.base.d.k(r0, r2)
            r2 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            int r2 = com.bumptech.glide.repackaged.com.google.common.collect.k.a(r0, r2)
            int r7 = r2 + (-1)
            com.bumptech.glide.repackaged.com.google.common.collect.o[] r4 = com.bumptech.glide.repackaged.com.google.common.collect.o.a(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.o[] r5 = com.bumptech.glide.repackaged.com.google.common.collect.o.a(r2)
            int r2 = r1.length
            if (r0 != r2) goto L20
            r6 = r1
            goto L25
        L20:
            com.bumptech.glide.repackaged.com.google.common.collect.o[] r2 = com.bumptech.glide.repackaged.com.google.common.collect.o.a(r0)
            r6 = r2
        L25:
            r2 = 0
            r8 = 0
        L27:
            if (r2 >= r0) goto L7f
            r3 = r1[r2]
            java.lang.Object r9 = r3.getKey()
            java.lang.Object r10 = r3.getValue()
            com.bumptech.glide.repackaged.com.google.common.collect.f.a(r9, r10)
            int r11 = r9.hashCode()
            int r12 = r10.hashCode()
            int r13 = com.bumptech.glide.repackaged.com.google.common.collect.k.b(r11)
            r13 = r13 & r7
            int r14 = com.bumptech.glide.repackaged.com.google.common.collect.k.b(r12)
            r14 = r14 & r7
            r15 = r4[r13]
            com.bumptech.glide.repackaged.com.google.common.collect.h0.a(r9, r3, r15)
            r0 = r5[r14]
            e(r10, r3, r0)
            if (r0 != 0) goto L6c
            if (r15 != 0) goto L6c
            boolean r0 = r3 instanceof com.bumptech.glide.repackaged.com.google.common.collect.o
            if (r0 == 0) goto L66
            r0 = r3
            com.bumptech.glide.repackaged.com.google.common.collect.o r0 = (com.bumptech.glide.repackaged.com.google.common.collect.o) r0
            boolean r0 = r0.d()
            if (r0 == 0) goto L66
            com.bumptech.glide.repackaged.com.google.common.collect.o r3 = (com.bumptech.glide.repackaged.com.google.common.collect.o) r3
            goto L71
        L66:
            com.bumptech.glide.repackaged.com.google.common.collect.o r3 = new com.bumptech.glide.repackaged.com.google.common.collect.o
            r3.<init>(r9, r10)
            goto L71
        L6c:
            com.bumptech.glide.repackaged.com.google.common.collect.o$a r3 = new com.bumptech.glide.repackaged.com.google.common.collect.o$a
            r3.<init>(r9, r10, r15, r0)
        L71:
            r4[r13] = r3
            r5[r14] = r3
            r6[r2] = r3
            r0 = r11 ^ r12
            int r8 = r8 + r0
            int r2 = r2 + 1
            r0 = r16
            goto L27
        L7f:
            com.bumptech.glide.repackaged.com.google.common.collect.f0 r3 = new com.bumptech.glide.repackaged.com.google.common.collect.f0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of()
            return r0
        Lb:
            com.bumptech.glide.repackaged.com.google.common.collect.p$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.p$a
            java.util.Map$Entry<K, V>[] r1 = r2.c
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public V get(java.lang.Object r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r0 = r2.a
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            int r1 = r2.d
            java.lang.Object r3 = com.bumptech.glide.repackaged.com.google.common.collect.h0.b(r3, r0, r1)
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public int hashCode() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> inverse() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap.of()
            return r0
        Lb:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> r0 = r2.f
            if (r0 != 0) goto L17
            com.bumptech.glide.repackaged.com.google.common.collect.f0$b r0 = new com.bumptech.glide.repackaged.com.google.common.collect.f0$b
            r1 = 0
            r0.<init>(r2, r1)
            r2.f = r0
        L17:
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    boolean isHashCodeFast() {
            r1 = this;
            r0 = 1
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
            java.util.Map$Entry<K, V>[] r0 = r1.c
            int r0 = r0.length
            return r0
    }
}

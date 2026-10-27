package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ImmutableSet<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> implements java.util.Set<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a<E> {
        public a() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        a(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b a(java.lang.Object r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a r1 = r0.f(r1)
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b b(java.util.Iterator r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a r1 = r0.g(r1)
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a d(java.lang.Object r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a r1 = r0.f(r1)
                return r1
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.a<E> f(E r1) {
                r0 = this;
                super.d(r1)
                return r0
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.a<E> g(java.util.Iterator<? extends E> r1) {
                r0 = this;
                super.b(r1)
                return r0
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> h() {
                r2 = this;
                int r0 = r2.b
                java.lang.Object[] r1 = r2.a
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.access$000(r0, r1)
                int r1 = r0.size()
                r2.b = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class b<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends com.bumptech.glide.repackaged.com.google.common.collect.l<E> {
            final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b a;

            a(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.l
            /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection a() {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$b r0 = r1.d()
                    return r0
            }

            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.b<E> d() {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$b r0 = r1.a
                    return r0
            }

            @Override // java.util.List
            public E get(int r2) {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$b r0 = r1.a
                    java.lang.Object r2 = r0.get(r2)
                    return r2
            }
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
        com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> createAsList() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$b$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$b$a
                r0.<init>(r1)
                return r0
        }

        abstract E get(int r1);

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator() {
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

    ImmutableSet() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet access$000(int r0, java.lang.Object[] r1) {
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = construct(r0, r1)
            return r0
    }

    static int chooseTableSize(int r6) {
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r1 = 1
            if (r6 >= r0) goto L1e
            int r0 = r6 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = r0 << r1
        Ld:
            double r1 = (double) r0
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            int r0 = r0 << 1
            goto Ld
        L1d:
            return r0
        L1e:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.String r6 = "collection too large"
            com.bumptech.glide.repackaged.com.google.common.base.d.e(r1, r6)
            return r0
    }

    private static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> construct(int r13, java.lang.Object... r14) {
            if (r13 == 0) goto L69
            r0 = 0
            r1 = 1
            if (r13 == r1) goto L62
            int r2 = chooseTableSize(r13)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r2 + (-1)
            r5 = 0
            r6 = 0
            r7 = 0
        L11:
            if (r5 >= r13) goto L3c
            r8 = r14[r5]
            java.lang.Object r8 = com.bumptech.glide.repackaged.com.google.common.collect.a0.b(r8, r5)
            int r9 = r8.hashCode()
            int r10 = com.bumptech.glide.repackaged.com.google.common.collect.k.b(r9)
        L21:
            r11 = r10 & r4
            r12 = r3[r11]
            if (r12 != 0) goto L30
            int r10 = r6 + 1
            r14[r6] = r8
            r3[r11] = r8
            int r7 = r7 + r9
            r6 = r10
            goto L36
        L30:
            boolean r11 = r12.equals(r8)
            if (r11 == 0) goto L39
        L36:
            int r5 = r5 + 1
            goto L11
        L39:
            int r10 = r10 + 1
            goto L21
        L3c:
            r5 = 0
            java.util.Arrays.fill(r14, r6, r13, r5)
            if (r6 != r1) goto L4a
            r13 = r14[r0]
            com.bumptech.glide.repackaged.com.google.common.collect.p0 r14 = new com.bumptech.glide.repackaged.com.google.common.collect.p0
            r14.<init>(r13, r7)
            return r14
        L4a:
            int r13 = chooseTableSize(r6)
            if (r2 == r13) goto L55
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r13 = construct(r6, r14)
            return r13
        L55:
            int r13 = r14.length
            if (r6 >= r13) goto L5c
            java.lang.Object[] r14 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a(r14, r6)
        L5c:
            com.bumptech.glide.repackaged.com.google.common.collect.i0 r13 = new com.bumptech.glide.repackaged.com.google.common.collect.i0
            r13.<init>(r14, r7, r3, r4)
            return r13
        L62:
            r13 = r14[r0]
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r13 = of(r13)
            return r13
        L69:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r13 = of()
            return r13
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lb
            java.util.Collection r1 = (java.util.Collection) r1
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r1 = copyOf(r1)
            return r1
        Lb:
            java.util.Iterator r1 = r1.iterator()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r1 = copyOf(r1)
            return r1
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> copyOf(java.util.Collection<? extends E> r2) {
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet
            if (r0 == 0) goto L12
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet
            if (r0 != 0) goto L12
            r0 = r2
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = (com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L1d
            return r0
        L12:
            boolean r0 = r2 instanceof java.util.EnumSet
            if (r0 == 0) goto L1d
            java.util.EnumSet r2 = (java.util.EnumSet) r2
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = copyOfEnumSet(r2)
            return r2
        L1d:
            java.lang.Object[] r2 = r2.toArray()
            int r0 = r2.length
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = construct(r0, r2)
            return r2
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> copyOf(java.util.Iterator<? extends E> r2) {
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = of()
            return r2
        Lb:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = of(r0)
            return r2
        L1a:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a r1 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a
            r1.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a r0 = r1.f(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet$a r2 = r0.g(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = r2.h()
            return r2
    }

    private static com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet copyOfEnumSet(java.util.EnumSet r0) {
            java.util.EnumSet r0 = java.util.EnumSet.copyOf(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.n.a(r0)
            return r0
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> of() {
            com.bumptech.glide.repackaged.com.google.common.collect.i0<java.lang.Object> r0 = com.bumptech.glide.repackaged.com.google.common.collect.i0.e
            return r0
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> of(E r1) {
            com.bumptech.glide.repackaged.com.google.common.collect.p0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.p0
            r0.<init>(r1)
            return r0
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> of(E r3, E r4) {
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r3 = construct(r0, r1)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet
            if (r0 == 0) goto L23
            boolean r0 = r2.isHashCodeFast()
            if (r0 == 0) goto L23
            r0 = r3
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = (com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet) r0
            boolean r0 = r0.isHashCodeFast()
            if (r0 == 0) goto L23
            int r0 = r2.hashCode()
            int r1 = r3.hashCode()
            if (r0 == r1) goto L23
            r3 = 0
            return r3
        L23:
            boolean r3 = com.bumptech.glide.repackaged.com.google.common.collect.m0.a(r2, r3)
            return r3
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = com.bumptech.glide.repackaged.com.google.common.collect.m0.b(r1)
            return r0
    }

    boolean isHashCodeFast() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator();

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }
}

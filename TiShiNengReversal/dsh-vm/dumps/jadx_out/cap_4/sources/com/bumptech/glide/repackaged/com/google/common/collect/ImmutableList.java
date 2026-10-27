package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ImmutableList<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> implements java.util.List<E>, java.util.RandomAccess {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bumptech.glide.repackaged.com.google.common.collect.a<E> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList c;

        a(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1, int r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.a
        protected E a(int r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r1.c
                java.lang.Object r2 = r0.get(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a<E> {
        public b() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        b(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b a(java.lang.Object r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b r1 = r0.f(r1)
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b b(java.util.Iterator r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b r1 = r0.g(r1)
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a d(java.lang.Object r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b r1 = r0.f(r1)
                return r1
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.b<E> f(E r1) {
                r0 = this;
                super.d(r1)
                return r0
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.b<E> g(java.util.Iterator<? extends E> r1) {
                r0 = this;
                super.b(r1)
                return r0
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> h() {
                r2 = this;
                java.lang.Object[] r0 = r2.a
                int r1 = r2.b
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> {
        private final transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> a;

        c(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        private int a(int r2) {
                r1 = this;
                int r0 = r1.size()
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                return r0
        }

        private int d(int r2) {
                r1 = this;
                int r0 = r1.size()
                int r0 = r0 - r2
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.List
        public E get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.bumptech.glide.repackaged.com.google.common.base.d.g(r2, r0)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                int r2 = r1.a(r2)
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(java.lang.Object r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                int r2 = r0.lastIndexOf(r2)
                if (r2 < 0) goto Ld
                int r2 = r1.a(r2)
                return r2
            Ld:
                r2 = -1
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                boolean r0 = r0.isPartialView()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = super.iterator()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                int r2 = r0.indexOf(r2)
                if (r2 < 0) goto Ld
                int r2 = r1.a(r2)
                return r2
            Ld:
                r2 = -1
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.v0 r0 = super.listIterator()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.v0 r1 = super.listIterator(r1)
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList
        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> reverse() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                int r0 = r0.size()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subList(int r2, int r3) {
                r1 = this;
                int r0 = r1.size()
                com.bumptech.glide.repackaged.com.google.common.base.d.m(r2, r3, r0)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.a
                int r3 = r1.d(r3)
                int r2 = r1.d(r2)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = r0.subList(r3, r2)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = r2.reverse()
                return r2
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> {
        final transient int a;
        final transient int b;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList c;

        d(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1, int r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        @Override // java.util.List
        public E get(int r3) {
                r2 = this;
                int r0 = r2.b
                com.bumptech.glide.repackaged.com.google.common.base.d.g(r3, r0)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r2.c
                int r1 = r2.a
                int r3 = r3 + r1
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = super.iterator()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.v0 r0 = super.listIterator()
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.v0 r1 = super.listIterator(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subList(int r3, int r4) {
                r2 = this;
                int r0 = r2.b
                com.bumptech.glide.repackaged.com.google.common.base.d.m(r3, r4, r0)
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r2.c
                int r1 = r2.a
                int r3 = r3 + r1
                int r4 = r4 + r1
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = r0.subList(r3, r4)
                return r3
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    ImmutableList() {
            r0 = this;
            r0.<init>()
            return
    }

    static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] r1) {
            int r0 = r1.length
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = asImmutableList(r1, r0)
            return r1
    }

    static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] r1, int r2) {
            if (r2 == 0) goto L1b
            r0 = 1
            if (r2 == r0) goto L12
            int r0 = r1.length
            if (r2 >= r0) goto Lc
            java.lang.Object[] r1 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a(r1, r2)
        Lc:
            com.bumptech.glide.repackaged.com.google.common.collect.g0 r2 = new com.bumptech.glide.repackaged.com.google.common.collect.g0
            r2.<init>(r1)
            return r2
        L12:
            com.bumptech.glide.repackaged.com.google.common.collect.o0 r2 = new com.bumptech.glide.repackaged.com.google.common.collect.o0
            r0 = 0
            r1 = r1[r0]
            r2.<init>(r1)
            return r2
        L1b:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = of()
            return r1
    }

    private static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> construct(java.lang.Object... r0) {
            java.lang.Object[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.a0.c(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = asImmutableList(r0)
            return r0
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> copyOf(java.lang.Iterable<? extends E> r1) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r1 = (java.util.Collection) r1
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = copyOf(r1)
            return r1
        Le:
            java.util.Iterator r1 = r1.iterator()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = copyOf(r1)
            return r1
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> copyOf(java.util.Collection<? extends E> r1) {
            boolean r0 = r1 instanceof com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
            if (r0 == 0) goto L19
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r1 = (com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection) r1
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = r1.asList()
            boolean r0 = r1.isPartialView()
            if (r0 == 0) goto L18
            java.lang.Object[] r1 = r1.toArray()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = asImmutableList(r1)
        L18:
            return r1
        L19:
            java.lang.Object[] r1 = r1.toArray()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = construct(r1)
            return r1
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> copyOf(java.util.Iterator<? extends E> r2) {
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = of()
            return r2
        Lb:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = of(r0)
            return r2
        L1a:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b r1 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b
            r1.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b r0 = r1.f(r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$b r2 = r0.g(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = r2.h()
            return r2
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> of() {
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<java.lang.Object> r0 = com.bumptech.glide.repackaged.com.google.common.collect.g0.d
            return r0
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> of(E r1) {
            com.bumptech.glide.repackaged.com.google.common.collect.o0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.o0
            r0.<init>(r1)
            return r0
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> of(E r2, E r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    public final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> asList() {
            r0 = this;
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            int r2 = r6 + r1
            java.lang.Object r3 = r4.get(r1)
            r5[r2] = r3
            int r1 = r1 + 1
            goto L5
        L12:
            int r6 = r6 + r0
            return r6
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.repackaged.com.google.common.collect.w.a(r0, r1)
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r1 = ~r1
            int r1 = ~r1
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = -1
            return r1
        L4:
            int r1 = com.bumptech.glide.repackaged.com.google.common.collect.w.b(r0, r1)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r0 = r1.listIterator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = -1
            return r1
        L4:
            int r1 = com.bumptech.glide.repackaged.com.google.common.collect.w.d(r0, r1)
            return r1
    }

    @Override // java.util.List
    public com.bumptech.glide.repackaged.com.google.common.collect.v0<E> listIterator() {
            r1 = this;
            r0 = 0
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.List
    public com.bumptech.glide.repackaged.com.google.common.collect.v0<E> listIterator(int r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$a
            int r1 = r2.size()
            r0.<init>(r2, r1, r3)
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r1 = r0.listIterator(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> reverse() {
            r2 = this;
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto L8
            return r2
        L8:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$c r0 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$c
            r0.<init>(r2)
            return r0
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            com.bumptech.glide.repackaged.com.google.common.base.d.m(r3, r4, r0)
            int r0 = r4 - r3
            int r1 = r2.size()
            if (r0 != r1) goto L10
            return r2
        L10:
            if (r0 == 0) goto L23
            r1 = 1
            if (r0 == r1) goto L1a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = r2.subListUnchecked(r3, r4)
            return r3
        L1a:
            java.lang.Object r3 = r2.get(r3)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = of(r3)
            return r3
        L23:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r3 = of()
            return r3
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
            return r1
    }

    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subListUnchecked(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$d r0 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList$d
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }
}

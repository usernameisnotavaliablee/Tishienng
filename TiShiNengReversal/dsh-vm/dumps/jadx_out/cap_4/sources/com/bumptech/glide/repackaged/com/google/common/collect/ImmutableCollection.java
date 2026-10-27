package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ImmutableCollection<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private transient com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> asList;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class a<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b<E> {
        java.lang.Object[] a;
        int b;

        a(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "initialCapacity"
                com.bumptech.glide.repackaged.com.google.common.collect.f.b(r2, r0)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.a = r2
                r2 = 0
                r1.b = r2
                return
        }

        private void e(int r3) {
                r2 = this;
                java.lang.Object[] r0 = r2.a
                int r1 = r0.length
                if (r1 >= r3) goto L10
                int r1 = r0.length
                int r3 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b.c(r1, r3)
                java.lang.Object[] r3 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a(r0, r3)
                r2.a = r3
            L10:
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b a(java.lang.Object r1) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection$a r1 = r0.d(r1)
                return r1
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.a<E> d(E r4) {
                r3 = this;
                com.bumptech.glide.repackaged.com.google.common.base.d.i(r4)
                int r0 = r3.b
                int r0 = r0 + 1
                r3.e(r0)
                java.lang.Object[] r0 = r3.a
                int r1 = r3.b
                int r2 = r1 + 1
                r3.b = r2
                r0[r1] = r4
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b<E> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        static int c(int r1, int r2) {
                if (r2 < 0) goto L17
                int r0 = r1 >> 1
                int r1 = r1 + r0
                int r1 = r1 + 1
                if (r1 >= r2) goto L11
                int r2 = r2 + (-1)
                int r1 = java.lang.Integer.highestOneBit(r2)
                int r1 = r1 << 1
            L11:
                if (r1 >= 0) goto L16
                r1 = 2147483647(0x7fffffff, float:NaN)
            L16:
                return r1
            L17:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "cannot store more than MAX_VALUE elements"
                r1.<init>(r2)
                throw r1
        }

        public abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b<E> a(E r1);

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection.b<E> b(java.util.Iterator<? extends E> r2) {
                r1 = this;
            L0:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Le
                java.lang.Object r0 = r2.next()
                r1.a(r0)
                goto L0
            Le:
                return r1
        }
    }

    ImmutableCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> asList() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r0 = r1.asList
            if (r0 != 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = r1.createAsList()
            r1.asList = r0
        La:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object r1);

    int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            int r2 = r5 + 1
            r4[r5] = r1
            r5 = r2
            goto L4
        L14:
            return r5
    }

    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> createAsList() {
            r2 = this;
            int r0 = r2.size()
            if (r0 == 0) goto L20
            r1 = 1
            if (r0 == r1) goto L13
            com.bumptech.glide.repackaged.com.google.common.collect.e0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.e0
            java.lang.Object[] r1 = r2.toArray()
            r0.<init>(r2, r1)
            return r0
        L13:
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r2.iterator()
            java.lang.Object r0 = r0.next()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of(r0)
            return r0
        L20:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of()
            return r0
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r2 = this;
            int r0 = r2.size()
            if (r0 != 0) goto L9
            java.lang.Object[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a
            return r0
        L9:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2.copyIntoArray(r0, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r3)
            int r0 = r2.size()
            int r1 = r3.length
            if (r1 >= r0) goto Lf
            java.lang.Object[] r3 = com.bumptech.glide.repackaged.com.google.common.collect.a0.e(r3, r0)
            goto L15
        Lf:
            int r1 = r3.length
            if (r1 <= r0) goto L15
            r1 = 0
            r3[r0] = r1
        L15:
            r0 = 0
            r2.copyIntoArray(r3, r0)
            return r3
    }
}

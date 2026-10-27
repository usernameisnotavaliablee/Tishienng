package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class i0<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> {
    static final com.bumptech.glide.repackaged.com.google.common.collect.i0<java.lang.Object> e = null;
    private final transient java.lang.Object[] a;
    final transient java.lang.Object[] b;
    private final transient int c;
    private final transient int d;

    static {
            com.bumptech.glide.repackaged.com.google.common.collect.i0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.i0
            java.lang.Object[] r1 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r2)
            com.bumptech.glide.repackaged.com.google.common.collect.i0.e = r0
            return
    }

    i0(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r2
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.b
            r1 = 0
            if (r5 == 0) goto L1f
            if (r0 != 0) goto L8
            goto L1f
        L8:
            int r2 = com.bumptech.glide.repackaged.com.google.common.collect.k.c(r5)
        Lc:
            int r3 = r4.c
            r2 = r2 & r3
            r3 = r0[r2]
            if (r3 != 0) goto L14
            return r1
        L14:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto Lc
        L1f:
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.a
            r1 = 0
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r1, r4, r5, r2)
            java.lang.Object[] r4 = r3.a
            int r4 = r4.length
            int r5 = r5 + r4
            return r5
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> createAsList() {
            r2 = this;
            java.lang.Object[] r0 = r2.b
            if (r0 != 0) goto L9
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of()
            return r0
        L9:
            com.bumptech.glide.repackaged.com.google.common.collect.e0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.e0
            java.lang.Object[] r1 = r2.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator() {
            r1 = this;
            java.lang.Object[] r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.h(r0)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            java.lang.Object[] r0 = r1.a
            int r0 = r0.length
            return r0
    }
}

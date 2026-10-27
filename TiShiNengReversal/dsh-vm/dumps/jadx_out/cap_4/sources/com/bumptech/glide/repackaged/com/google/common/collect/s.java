package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class s<E> extends com.bumptech.glide.repackaged.com.google.common.collect.e0<E> implements com.bumptech.glide.repackaged.com.google.common.collect.q0<E> {
    s(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> r1, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.e0, com.bumptech.glide.repackaged.com.google.common.collect.l
    /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection a() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = r1.d()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.q0, java.util.SortedSet
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = r1.d()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.l, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
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

    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet<E> d() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection r0 = super.a()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = (com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet) r0
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public int indexOf(java.lang.Object r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSortedSet r0 = r2.d()
            int r0 = r0.indexOf(r3)
            if (r0 < 0) goto L15
            java.lang.Object r1 = r2.get(r0)
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = -1
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subListUnchecked(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = super.subListUnchecked(r2, r3)
            com.bumptech.glide.repackaged.com.google.common.collect.j0 r3 = new com.bumptech.glide.repackaged.com.google.common.collect.j0
            java.util.Comparator r0 = r1.comparator()
            r3.<init>(r2, r0)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = r3.asList()
            return r2
    }
}

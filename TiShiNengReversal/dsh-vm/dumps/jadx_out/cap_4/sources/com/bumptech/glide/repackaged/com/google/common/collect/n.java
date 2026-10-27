package com.bumptech.glide.repackaged.com.google.common.collect;

import java.lang.Enum;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class n<E extends java.lang.Enum<E>> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> {
    private final transient java.util.EnumSet<E> a;
    private transient int b;

    private n(java.util.EnumSet<E> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet a(java.util.EnumSet r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto Lf
            com.bumptech.glide.repackaged.com.google.common.collect.n r0 = new com.bumptech.glide.repackaged.com.google.common.collect.n
            r0.<init>(r2)
            return r0
        Lf:
            java.lang.Object r2 = com.bumptech.glide.repackaged.com.google.common.collect.u.d(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of(r2)
            return r2
        L18:
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r2 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.of()
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.n
            if (r0 == 0) goto L8
            com.bumptech.glide.repackaged.com.google.common.collect.n r2 = (com.bumptech.glide.repackaged.com.google.common.collect.n) r2
            java.util.EnumSet<E extends java.lang.Enum<E>> r2 = r2.a
        L8:
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.n
            if (r0 == 0) goto Lc
            com.bumptech.glide.repackaged.com.google.common.collect.n r2 = (com.bumptech.glide.repackaged.com.google.common.collect.n) r2
            java.util.EnumSet<E extends java.lang.Enum<E>> r2 = r2.a
        Lc:
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = r1.b
            if (r0 != 0) goto Lc
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            int r0 = r0.hashCode()
            r1.b = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            boolean r0 = r0.isEmpty()
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
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            java.util.Iterator r0 = r0.iterator()
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.q(r0)
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
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}

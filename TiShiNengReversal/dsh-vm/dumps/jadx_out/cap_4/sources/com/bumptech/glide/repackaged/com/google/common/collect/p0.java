package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class p0<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> {
    final transient E a;
    private transient int b;

    p0(E r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            r0.a = r1
            return
    }

    p0(E r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            E r0 = r1.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            E r0 = r1.a
            r2[r3] = r0
            int r3 = r3 + 1
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = r1.b
            if (r0 != 0) goto Lc
            E r0 = r1.a
            int r0 = r0.hashCode()
            r1.b = r0
        Lc:
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
            r1 = this;
            int r0 = r1.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
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
            E r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.n(r0)
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
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r3 = this;
            E r0 = r3.a
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length()
            int r2 = r2 + 2
            r1.<init>(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

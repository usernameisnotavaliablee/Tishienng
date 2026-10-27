package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class o0<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> {
    final transient E a;

    o0(E r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            r0.a = r1
            return
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.google.common.base.d.g(r2, r0)
            E r2 = r1.a
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public com.bumptech.glide.repackaged.com.google.common.collect.u0<E> iterator() {
            r1 = this;
            E r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.n(r0)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subList(int r2, int r3) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.google.common.base.d.m(r2, r3, r0)
            if (r2 != r3) goto Lb
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.of()
            return r2
        Lb:
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
            return r1
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

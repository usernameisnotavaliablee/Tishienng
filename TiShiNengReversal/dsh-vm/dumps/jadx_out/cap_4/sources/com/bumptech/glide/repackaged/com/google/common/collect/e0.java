package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class e0<E> extends com.bumptech.glide.repackaged.com.google.common.collect.l<E> {

    @com.google.j2objc.annotations.Weak
    private final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> a;
    private final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<? extends E> b;

    e0(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> r1, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<? extends E> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    e0(com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> r1, java.lang.Object[] r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r2 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.asImmutableList(r2)
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.l
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> a() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection<E> r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<? extends E> r0 = r1.b
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<? extends E> r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public com.bumptech.glide.repackaged.com.google.common.collect.v0<E> listIterator(int r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<? extends E> r0 = r1.b
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r2 = r0.listIterator(r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r1 = r0.listIterator(r1)
            return r1
    }
}

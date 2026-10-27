package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class g0<E> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> {
    static final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<java.lang.Object> d = null;
    private final transient int a;
    private final transient int b;
    private final transient java.lang.Object[] c;

    static {
            com.bumptech.glide.repackaged.com.google.common.collect.g0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.g0
            java.lang.Object[] r1 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.g0.d = r0
            return
    }

    g0(java.lang.Object[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.<init>(r3, r0, r1)
            return
    }

    g0(java.lang.Object[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r1
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.c
            int r1 = r3.a
            int r2 = r3.b
            java.lang.System.arraycopy(r0, r1, r4, r5, r2)
            int r4 = r3.b
            int r5 = r5 + r4
            return r5
    }

    @Override // java.util.List
    public E get(int r3) {
            r2 = this;
            int r0 = r2.b
            com.bumptech.glide.repackaged.com.google.common.base.d.g(r3, r0)
            java.lang.Object[] r0 = r2.c
            int r1 = r2.a
            int r3 = r3 + r1
            r3 = r0[r3]
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r2 = this;
            int r0 = r2.b
            java.lang.Object[] r1 = r2.c
            int r1 = r1.length
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public com.bumptech.glide.repackaged.com.google.common.collect.v0<E> listIterator(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.c
            int r1 = r3.a
            int r2 = r3.b
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r4 = com.bumptech.glide.repackaged.com.google.common.collect.v.i(r0, r1, r2, r4)
            return r4
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r1 = r0.listIterator(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> subListUnchecked(int r4, int r5) {
            r3 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.g0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.g0
            java.lang.Object[] r1 = r3.c
            int r2 = r3.a
            int r2 = r2 + r4
            int r5 = r5 - r4
            r0.<init>(r1, r2, r5)
            return r0
    }
}

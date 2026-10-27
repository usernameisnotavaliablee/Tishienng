package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j<E> implements java.lang.Iterable<E> {
    private final java.lang.Iterable<E> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.bumptech.glide.repackaged.com.google.common.collect.j<E> {
        final /* synthetic */ java.lang.Iterable b;

        a(java.lang.Iterable r1, java.lang.Iterable r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<E> iterator() {
                r1 = this;
                java.lang.Iterable r0 = r1.b
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    protected j() {
            r0 = this;
            r0.<init>()
            r0.a = r0
            return
    }

    j(java.lang.Iterable<E> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r0.a = r1
            return
    }

    public static <E> com.bumptech.glide.repackaged.com.google.common.collect.j<E> e(java.lang.Iterable<E> r1) {
            boolean r0 = r1 instanceof com.bumptech.glide.repackaged.com.google.common.collect.j
            if (r0 == 0) goto L7
            com.bumptech.glide.repackaged.com.google.common.collect.j r1 = (com.bumptech.glide.repackaged.com.google.common.collect.j) r1
            return r1
        L7:
            com.bumptech.glide.repackaged.com.google.common.collect.j$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.j$a
            r0.<init>(r1, r1)
            return r0
    }

    public final boolean a(com.bumptech.glide.repackaged.com.google.common.base.e<? super E> r2) {
            r1 = this;
            java.lang.Iterable<E> r0 = r1.a
            boolean r2 = com.bumptech.glide.repackaged.com.google.common.collect.u.a(r0, r2)
            return r2
    }

    public final com.bumptech.glide.repackaged.com.google.common.collect.j<E> d(com.bumptech.glide.repackaged.com.google.common.base.e<? super E> r2) {
            r1 = this;
            java.lang.Iterable<E> r0 = r1.a
            java.lang.Iterable r2 = com.bumptech.glide.repackaged.com.google.common.collect.u.b(r0, r2)
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = e(r2)
            return r2
    }

    public final java.lang.String f(com.bumptech.glide.repackaged.com.google.common.base.b r1) {
            r0 = this;
            java.lang.String r1 = r1.d(r0)
            return r1
    }

    public final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList<E> g() {
            r1 = this;
            java.lang.Iterable<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableList.copyOf(r0)
            return r0
    }

    public final com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<E> j() {
            r1 = this;
            java.lang.Iterable<E> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet.copyOf(r0)
            return r0
    }

    public final <T> com.bumptech.glide.repackaged.com.google.common.collect.j<T> m(com.bumptech.glide.repackaged.com.google.common.base.a<? super E, T> r2) {
            r1 = this;
            java.lang.Iterable<E> r0 = r1.a
            java.lang.Iterable r2 = com.bumptech.glide.repackaged.com.google.common.collect.u.f(r0, r2)
            com.bumptech.glide.repackaged.com.google.common.collect.j r2 = e(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Iterable<E> r0 = r1.a
            java.lang.String r0 = com.bumptech.glide.repackaged.com.google.common.collect.u.e(r0)
            return r0
    }
}

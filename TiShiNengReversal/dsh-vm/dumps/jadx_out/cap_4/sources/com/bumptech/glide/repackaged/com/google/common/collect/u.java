package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> extends com.bumptech.glide.repackaged.com.google.common.collect.j<T> {
        final /* synthetic */ java.lang.Iterable b;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.base.e c;

        a(java.lang.Iterable r1, com.bumptech.glide.repackaged.com.google.common.base.e r2) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r2 = this;
                java.lang.Iterable r0 = r2.b
                java.util.Iterator r0 = r0.iterator()
                com.bumptech.glide.repackaged.com.google.common.base.e r1 = r2.c
                com.bumptech.glide.repackaged.com.google.common.collect.u0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.g(r0, r1)
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<T> extends com.bumptech.glide.repackaged.com.google.common.collect.j<T> {
        final /* synthetic */ java.lang.Iterable b;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.base.a c;

        b(java.lang.Iterable r1, com.bumptech.glide.repackaged.com.google.common.base.a r2) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r2 = this;
                java.lang.Iterable r0 = r2.b
                java.util.Iterator r0 = r0.iterator()
                com.bumptech.glide.repackaged.com.google.common.base.a r1 = r2.c
                java.util.Iterator r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.p(r0, r1)
                return r0
        }
    }

    public u() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> boolean a(java.lang.Iterable<T> r0, com.bumptech.glide.repackaged.com.google.common.base.e<? super T> r1) {
            java.util.Iterator r0 = r0.iterator()
            boolean r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.b(r0, r1)
            return r0
    }

    public static <T> java.lang.Iterable<T> b(java.lang.Iterable<T> r1, com.bumptech.glide.repackaged.com.google.common.base.e<? super T> r2) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.u$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.u$a
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> T c(java.lang.Iterable<? extends T> r0, T r1) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.j(r0, r1)
            return r0
    }

    public static <T> T d(java.lang.Iterable<T> r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.k(r0)
            return r0
    }

    public static java.lang.String e(java.lang.Iterable<?> r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.o(r0)
            return r0
    }

    public static <F, T> java.lang.Iterable<T> f(java.lang.Iterable<F> r1, com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r2) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.u$b r0 = new com.bumptech.glide.repackaged.com.google.common.collect.u$b
            r0.<init>(r1, r2)
            return r0
    }
}

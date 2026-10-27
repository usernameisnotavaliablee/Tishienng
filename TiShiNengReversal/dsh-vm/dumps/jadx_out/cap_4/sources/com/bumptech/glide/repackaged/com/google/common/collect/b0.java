package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class b0<T> implements java.util.Comparator<T> {
    protected b0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.collect.b0<T> a(java.util.Comparator<T> r1) {
            boolean r0 = r1 instanceof com.bumptech.glide.repackaged.com.google.common.collect.b0
            if (r0 == 0) goto L7
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r1 = (com.bumptech.glide.repackaged.com.google.common.collect.b0) r1
            return r1
        L7:
            com.bumptech.glide.repackaged.com.google.common.collect.h r0 = new com.bumptech.glide.repackaged.com.google.common.collect.h
            r0.<init>(r1)
            return r0
    }

    public static <C extends java.lang.Comparable> com.bumptech.glide.repackaged.com.google.common.collect.b0<C> b() {
            com.bumptech.glide.repackaged.com.google.common.collect.z r0 = com.bumptech.glide.repackaged.com.google.common.collect.z.a
            return r0
    }

    public <F> com.bumptech.glide.repackaged.com.google.common.collect.b0<F> c(com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r2) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.e r0 = new com.bumptech.glide.repackaged.com.google.common.collect.e
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Comparator
    public abstract int compare(T r1, T r2);

    public <S extends T> com.bumptech.glide.repackaged.com.google.common.collect.b0<S> d() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.l0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.l0
            r0.<init>(r1)
            return r0
    }
}

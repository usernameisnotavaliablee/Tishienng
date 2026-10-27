package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class s0<F, T> implements java.util.Iterator<T> {
    final java.util.Iterator<? extends F> a;

    s0(java.util.Iterator<? extends F> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.a = r1
            return
    }

    abstract T a(F r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.a
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.a
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = r1.a(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.a
            r0.remove()
            return
    }
}

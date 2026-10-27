package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class l0<T> extends com.bumptech.glide.repackaged.com.google.common.collect.b0<T> implements java.io.Serializable {
    final com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> a;

    l0(com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r1 = (com.bumptech.glide.repackaged.com.google.common.collect.b0) r1
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.b0, java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r0 = r1.a
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.b0
    public <S extends T> com.bumptech.glide.repackaged.com.google.common.collect.b0<S> d() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r0 = r1.a
            return r0
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.l0
            if (r0 == 0) goto L13
            com.bumptech.glide.repackaged.com.google.common.collect.l0 r2 = (com.bumptech.glide.repackaged.com.google.common.collect.l0) r2
            com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r0 = r1.a
            com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r2 = r2.a
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = -r0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.b0<? super T> r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ".reverse()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

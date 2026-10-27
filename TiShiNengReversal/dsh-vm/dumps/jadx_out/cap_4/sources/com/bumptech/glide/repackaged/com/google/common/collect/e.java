package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class e<F, T> extends com.bumptech.glide.repackaged.com.google.common.collect.b0<F> implements java.io.Serializable {
    final com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> a;
    final com.bumptech.glide.repackaged.com.google.common.collect.b0<T> b;

    e(com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r1, com.bumptech.glide.repackaged.com.google.common.collect.b0<T> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.base.a r1 = (com.bumptech.glide.repackaged.com.google.common.base.a) r1
            r0.a = r1
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r1 = (com.bumptech.glide.repackaged.com.google.common.collect.b0) r1
            r0.b = r1
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.b0, java.util.Comparator
    public int compare(F r3, F r4) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.b0<T> r0 = r2.b
            com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r1 = r2.a
            java.lang.Object r3 = r1.apply(r3)
            com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r1 = r2.a
            java.lang.Object r4 = r1.apply(r4)
            int r3 = r0.compare(r3, r4)
            return r3
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.bumptech.glide.repackaged.com.google.common.collect.e
            r2 = 0
            if (r1 == 0) goto L20
            com.bumptech.glide.repackaged.com.google.common.collect.e r5 = (com.bumptech.glide.repackaged.com.google.common.collect.e) r5
            com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r1 = r4.a
            com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            com.bumptech.glide.repackaged.com.google.common.collect.b0<T> r1 = r4.b
            com.bumptech.glide.repackaged.com.google.common.collect.b0<T> r5 = r5.b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public int hashCode() {
            r4 = this;
            com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r0 = r4.a
            com.bumptech.glide.repackaged.com.google.common.collect.b0<T> r1 = r4.b
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = com.bumptech.glide.repackaged.com.google.common.base.c.b(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.b0<T> r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ".onResultOf("
            r0.append(r1)
            com.bumptech.glide.repackaged.com.google.common.base.a<F, ? extends T> r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

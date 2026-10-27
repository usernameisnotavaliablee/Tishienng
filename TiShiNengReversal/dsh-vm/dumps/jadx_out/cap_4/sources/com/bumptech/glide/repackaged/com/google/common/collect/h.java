package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class h<T> extends com.bumptech.glide.repackaged.com.google.common.collect.b0<T> implements java.io.Serializable {
    final java.util.Comparator<T> a;

    h(java.util.Comparator<T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.b0, java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            java.util.Comparator<T> r0 = r1.a
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.h
            if (r0 == 0) goto L13
            com.bumptech.glide.repackaged.com.google.common.collect.h r2 = (com.bumptech.glide.repackaged.com.google.common.collect.h) r2
            java.util.Comparator<T> r0 = r1.a
            java.util.Comparator<T> r2 = r2.a
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}

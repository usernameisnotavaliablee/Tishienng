package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class z extends com.bumptech.glide.repackaged.com.google.common.collect.b0<java.lang.Comparable> implements java.io.Serializable {
    static final com.bumptech.glide.repackaged.com.google.common.collect.z a = null;

    static {
            com.bumptech.glide.repackaged.com.google.common.collect.z r0 = new com.bumptech.glide.repackaged.com.google.common.collect.z
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.z.a = r0
            return
    }

    private z() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.b0, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r1 = r0.e(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.b0
    public <S extends java.lang.Comparable> com.bumptech.glide.repackaged.com.google.common.collect.b0<S> d() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.k0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.k0.a
            return r0
    }

    public int e(java.lang.Comparable r1, java.lang.Comparable r2) {
            r0 = this;
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            int r1 = r1.compareTo(r2)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural()"
            return r0
    }
}

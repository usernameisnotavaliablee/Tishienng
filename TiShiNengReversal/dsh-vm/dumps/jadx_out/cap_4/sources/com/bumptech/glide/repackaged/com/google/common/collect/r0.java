package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class r0 {
    public r0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <E> java.util.Comparator<? super E> a(java.util.SortedSet<E> r0) {
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.b0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.b0.b()
        La:
            return r0
    }

    public static boolean b(java.util.Comparator<?> r1, java.lang.Iterable<?> r2) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            boolean r0 = r2 instanceof java.util.SortedSet
            if (r0 == 0) goto L11
            java.util.SortedSet r2 = (java.util.SortedSet) r2
            java.util.Comparator r2 = a(r2)
            goto L1b
        L11:
            boolean r0 = r2 instanceof com.bumptech.glide.repackaged.com.google.common.collect.q0
            if (r0 == 0) goto L20
            com.bumptech.glide.repackaged.com.google.common.collect.q0 r2 = (com.bumptech.glide.repackaged.com.google.common.collect.q0) r2
            java.util.Comparator r2 = r2.comparator()
        L1b:
            boolean r1 = r1.equals(r2)
            return r1
        L20:
            r1 = 0
            return r1
    }
}

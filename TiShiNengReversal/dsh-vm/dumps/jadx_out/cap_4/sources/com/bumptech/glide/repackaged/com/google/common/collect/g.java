package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {
    static final com.bumptech.glide.repackaged.com.google.common.base.b a = null;

    static {
            java.lang.String r0 = ", "
            com.bumptech.glide.repackaged.com.google.common.base.b r0 = com.bumptech.glide.repackaged.com.google.common.base.b.g(r0)
            java.lang.String r1 = "null"
            com.bumptech.glide.repackaged.com.google.common.base.b r0 = r0.i(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.g.a = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    static <T> java.util.Collection<T> a(java.lang.Iterable<T> r0) {
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    static java.lang.StringBuilder b(int r5) {
            java.lang.String r0 = "size"
            com.bumptech.glide.repackaged.com.google.common.collect.f.b(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            long r1 = (long) r5
            r3 = 8
            long r1 = r1 * r3
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r1 = java.lang.Math.min(r1, r3)
            int r5 = (int) r1
            r0.<init>(r5)
            return r0
    }
}

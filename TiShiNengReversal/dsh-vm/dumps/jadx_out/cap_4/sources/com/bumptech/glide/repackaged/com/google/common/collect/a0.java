package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a0 {
    static final java.lang.Object[] a = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.bumptech.glide.repackaged.com.google.common.collect.a0.a = r0
            return
    }

    public a0() {
            r1 = this;
            r1.<init>()
            return
    }

    static <T> T[] a(T[] r2, int r3) {
            java.lang.Object[] r0 = e(r2, r3)
            int r1 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    static java.lang.Object b(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static java.lang.Object[] c(java.lang.Object... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = d(r1, r0)
            return r1
    }

    static java.lang.Object[] d(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            r1 = r2[r0]
            b(r1, r0)
            int r0 = r0 + 1
            goto L1
        Lb:
            return r2
    }

    public static <T> T[] e(T[] r0, int r1) {
            java.lang.Object[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.d0.a(r0, r1)
            return r0
    }
}

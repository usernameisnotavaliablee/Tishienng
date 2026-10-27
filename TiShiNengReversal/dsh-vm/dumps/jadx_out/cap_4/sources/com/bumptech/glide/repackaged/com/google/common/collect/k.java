package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class k {
    private static int a = 1073741824;

    static {
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    static int a(int r3, double r4) {
            r0 = 2
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Integer.highestOneBit(r3)
            double r1 = (double) r0
            double r4 = r4 * r1
            int r4 = (int) r4
            if (r3 <= r4) goto L17
            int r3 = r0 << 1
            if (r3 <= 0) goto L14
            return r3
        L14:
            int r3 = com.bumptech.glide.repackaged.com.google.common.collect.k.a
            return r3
        L17:
            return r0
    }

    static int b(int r1) {
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            r0 = 15
            int r1 = java.lang.Integer.rotateLeft(r1, r0)
            r0 = 461845907(0x1b873593, float:2.2368498E-22)
            int r1 = r1 * r0
            return r1
    }

    static int c(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r0 = b(r0)
            return r0
    }
}

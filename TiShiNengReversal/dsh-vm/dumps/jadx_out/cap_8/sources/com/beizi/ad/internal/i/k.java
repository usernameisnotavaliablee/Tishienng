package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> T a(T r0) {
            r0.getClass()
            return r0
    }

    public static <T> T a(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    static void a(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    static void a(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static void a(java.lang.Object... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r3[r1]
            r2.getClass()
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }
}

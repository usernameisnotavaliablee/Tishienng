package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class n {
    public n() {
            r0 = this;
            r0.<init>()
            return
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

    static void b(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    static void c(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static <T> T d(T r0) {
            r0.getClass()
            return r0
    }

    public static <T> T e(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }
}

package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u8 extends com.amap.api.col.p0003l.y9 {
    private static int a(com.amap.api.col.p0003l.x9 r0) {
            int r0 = r0.n()
            return r0
    }

    public static int b(com.amap.api.col.p0003l.x9 r1, byte r2, int r3) {
            r0 = 2
            r1.q(r0)
            e(r1, r3)
            d(r1, r2)
            int r1 = a(r1)
            return r1
    }

    public static int c(com.amap.api.col.p0003l.x9 r2, byte[] r3) {
            int r0 = r3.length
            r1 = 1
            r2.h(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 - r1
        L7:
            if (r0 < 0) goto L11
            r1 = r3[r0]
            r2.d(r1)
            int r0 = r0 + (-1)
            goto L7
        L11:
            int r2 = r2.a()
            return r2
    }

    private static void d(com.amap.api.col.p0003l.x9 r1, byte r2) {
            r0 = 0
            r1.f(r0, r2)
            return
    }

    private static void e(com.amap.api.col.p0003l.x9 r1, int r2) {
            r0 = 1
            r1.r(r0, r2)
            return
    }
}

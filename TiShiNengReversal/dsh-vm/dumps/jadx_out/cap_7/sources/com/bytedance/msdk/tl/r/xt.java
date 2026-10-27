package com.bytedance.msdk.tl.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> j;

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.msdk.up.j r1, boolean r2) {
            if (r1 != 0) goto L3
            goto Ld
        L3:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            xt(r1, r2)
            return
    }

    public static void j(java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0) {
            com.bytedance.msdk.tl.r.xt.j = r0
            return
    }

    private static void xt(com.bytedance.msdk.up.j r3, boolean r4) {
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = com.bytedance.msdk.tl.r.xt.j
            if (r0 == 0) goto L41
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            r2 = 10002(0x2712, float:1.4016E-41)
            if (r4 == 0) goto L28
            com.bytedance.sdk.openadsdk.i.r r4 = r0.j(r2)
            r4.j(r1)
            r4 = 20003(0x4e23, float:2.803E-41)
            java.lang.String r3 = r3.cw()
            r0.j(r4, r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r3 = com.bytedance.msdk.tl.r.xt.j
            android.util.SparseArray r4 = r0.xt()
            com.bytedance.msdk.core.ae.a.a(r3, r4)
            return
        L28:
            com.bytedance.sdk.openadsdk.i.r r4 = r0.j(r2)
            r4.j(r1)
            r4 = 20002(0x4e22, float:2.8029E-41)
            java.lang.String r3 = r3.cw()
            r0.j(r4, r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r3 = com.bytedance.msdk.tl.r.xt.j
            android.util.SparseArray r4 = r0.xt()
            com.bytedance.msdk.core.ae.a.a(r3, r4)
        L41:
            return
    }
}

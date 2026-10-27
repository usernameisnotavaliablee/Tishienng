package com.bytedance.msdk.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class g extends com.bytedance.msdk.cw.j.j.cw {
    public g(com.bytedance.msdk.cw.cw.xt.j.j.xt r1, java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public void cw(android.app.Activity r3) {
            r2 = this;
            com.bytedance.msdk.cw.cw.xt.j.j.xt r0 = r2.g
            if (r0 == 0) goto L7
            r0.m()
        L7:
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.oq
            if (r0 == 0) goto L2a
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8113(0x1fb1, float:1.1369E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 20033(0x4e41, float:2.8072E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.oq
            com.bytedance.msdk.core.ae.a.a(r0, r3)
        L2a:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void j(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            r0.cw(r1)     // Catch: java.lang.Exception -> L4
            return
        L4:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return
    }
}

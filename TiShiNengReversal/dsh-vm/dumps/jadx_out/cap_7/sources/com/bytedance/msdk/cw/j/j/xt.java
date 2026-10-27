package com.bytedance.msdk.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt extends com.bytedance.msdk.cw.j.j.cw {
    public xt(com.bytedance.msdk.cw.cw.xt.j.j.xt r1, java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public android.view.View g() {
            r1 = this;
            android.view.View r0 = r1.m2if()
            return r0
    }

    /* renamed from: if, reason: not valid java name */
    public android.view.View m2if() {
            r3 = this;
            r0 = 0
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.oq     // Catch: java.lang.Exception -> L26
            if (r1 == 0) goto L2c
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()     // Catch: java.lang.Exception -> L26
            r2 = 8113(0x1fb1, float:1.1369E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)     // Catch: java.lang.Exception -> L26
            java.lang.Class<android.view.View> r2 = android.view.View.class
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)     // Catch: java.lang.Exception -> L26
            android.util.SparseArray r1 = r1.xt()     // Catch: java.lang.Exception -> L26
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2 = r3.oq     // Catch: java.lang.Exception -> L26
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r2, r1)     // Catch: java.lang.Exception -> L26
            boolean r2 = r1 instanceof android.view.View     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L28
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Exception -> L26
            return r1
        L26:
            r1 = move-exception
            goto L29
        L28:
            return r0
        L29:
            com.bytedance.sdk.component.utils.vl.j(r1)
        L2c:
            return r0
    }
}

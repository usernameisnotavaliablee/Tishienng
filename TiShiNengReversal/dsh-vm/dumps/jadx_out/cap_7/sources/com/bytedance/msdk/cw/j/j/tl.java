package com.bytedance.msdk.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class tl extends com.bytedance.msdk.cw.j.j.cw {
    private boolean jy;
    private int qv;
    private int vl;

    public tl(com.bytedance.msdk.cw.cw.xt.j.j.xt r1, java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.qv = r1
            r0.vl = r1
            r0.jy = r1
            return
    }

    public abstract void j(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.view.ViewGroup r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4, java.util.List<android.view.View> r5, com.bytedance.msdk.api.r.j.ae.oq r6);

    @Override // com.bytedance.msdk.xt.cw
    public void j(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull android.view.ViewGroup r3, java.util.List<android.view.View> r4, java.util.List<android.view.View> r5, java.util.List<android.view.View> r6, com.bytedance.msdk.api.r.j.ae.oq r7, java.util.List<android.view.View> r8) {
            r1 = this;
            super.j(r2, r3, r4, r5, r6, r7, r8)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r0 = 1
            r2.jy = r0     // Catch: java.lang.Exception -> L17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r1.j(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L17
            return
        L17:
            r0 = move-exception
            r2 = r0
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    public final void j(com.bytedance.msdk.cw.j.j.j r3) {
            r2 = this;
            int r0 = r2.vl
            r1 = 60
            if (r0 >= r1) goto L10
            int r0 = r0 + 1
            r2.vl = r0
            if (r3 == 0) goto Lf
            r3.j()
        Lf:
            return
        L10:
            java.lang.String r3 = "TTMediationSDK"
            java.lang.String r0 = "自定义Adapter click方法回调次数需要小于60次"
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void qv() {
            r2 = this;
            r0 = 1
            r2.jy = r0     // Catch: java.lang.Exception -> L21
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.oq     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L23
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()     // Catch: java.lang.Exception -> L21
            r1 = 6083(0x17c3, float:8.524E-42)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)     // Catch: java.lang.Exception -> L21
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)     // Catch: java.lang.Exception -> L21
            android.util.SparseArray r0 = r0.xt()     // Catch: java.lang.Exception -> L21
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.oq     // Catch: java.lang.Exception -> L21
            com.bytedance.msdk.core.ae.a.a(r1, r0)     // Catch: java.lang.Exception -> L21
            return
        L21:
            r0 = move-exception
            goto L24
        L23:
            return
        L24:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public final void xt(com.bytedance.msdk.cw.j.j.j r4) {
            r3 = this;
            boolean r0 = r3.jy
            java.lang.String r1 = "TTMediationSDK"
            if (r0 == 0) goto L1b
            int r0 = r3.qv
            r2 = 2
            if (r0 >= r2) goto L15
            int r0 = r0 + 1
            r3.qv = r0
            if (r4 == 0) goto L14
            r4.j()
        L14:
            return
        L15:
            java.lang.String r4 = "自定义Adapter show方法回调次数需要小于2次"
            com.bytedance.msdk.j.up.cw.r(r1, r4)
            return
        L1b:
            java.lang.String r4 = "自定义Adapter show方法回调必须由GroMore触发show时才会生效"
            com.bytedance.msdk.j.up.cw.r(r1, r4)
            return
    }
}

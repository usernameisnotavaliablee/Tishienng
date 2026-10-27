package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class kt {
    private final com.bytedance.adsdk.lottie.tl cw;
    private final java.util.Map<java.lang.String, java.lang.String> j;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1814r;
    private final com.bytedance.adsdk.lottie.LottieAnimationView xt;

    kt() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.j = r0
            r0 = 1
            r1.f1814r = r0
            r0 = 0
            r1.xt = r0
            r1.cw = r0
            return
    }

    public kt(com.bytedance.adsdk.lottie.LottieAnimationView r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.j = r0
            r0 = 1
            r1.f1814r = r0
            r1.xt = r2
            r2 = 0
            r1.cw = r2
            return
    }

    private void j() {
            r1 = this;
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r1.xt
            if (r0 == 0) goto L7
            r0.invalidate()
        L7:
            com.bytedance.adsdk.lottie.tl r0 = r1.cw
            if (r0 == 0) goto Le
            r0.invalidateSelf()
        Le:
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public final java.lang.String cw(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.f1814r
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.j
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.j
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L15:
            java.lang.String r2 = r1.j(r2, r3)
            boolean r0 = r1.f1814r
            if (r0 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.j
            r0.put(r3, r2)
        L22:
            return r2
    }

    public java.lang.String j(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public java.lang.String j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r0.j(r2)
            return r1
    }

    public void xt(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.j
            r0.put(r2, r3)
            r1.j()
            return
    }
}

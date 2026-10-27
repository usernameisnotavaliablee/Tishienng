package com.bytedance.adsdk.lottie.cw;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum cw extends java.lang.Enum<com.bytedance.adsdk.lottie.cw.cw> {
    public static final com.bytedance.adsdk.lottie.cw.cw j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ com.bytedance.adsdk.lottie.cw.cw[] f1761r = null;
    public static final com.bytedance.adsdk.lottie.cw.cw xt = null;
    public final java.lang.String cw;

    static {
            com.bytedance.adsdk.lottie.cw.cw r0 = new com.bytedance.adsdk.lottie.cw.cw
            java.lang.String r1 = ".json"
            java.lang.String r2 = "JSON"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.bytedance.adsdk.lottie.cw.cw.j = r0
            com.bytedance.adsdk.lottie.cw.cw r1 = new com.bytedance.adsdk.lottie.cw.cw
            java.lang.String r2 = ".zip"
            java.lang.String r4 = "ZIP"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.bytedance.adsdk.lottie.cw.cw.xt = r1
            r2 = 2
            com.bytedance.adsdk.lottie.cw.cw[] r2 = new com.bytedance.adsdk.lottie.cw.cw[r2]
            r2[r3] = r0
            r2[r5] = r1
            com.bytedance.adsdk.lottie.cw.cw.f1761r = r2
            return
    }

    cw(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.cw = r3
            return
    }

    public static com.bytedance.adsdk.lottie.cw.cw valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.adsdk.lottie.cw.cw> r0 = com.bytedance.adsdk.lottie.cw.cw.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.adsdk.lottie.cw.cw r1 = (com.bytedance.adsdk.lottie.cw.cw) r1
            return r1
    }

    public static com.bytedance.adsdk.lottie.cw.cw[] values() {
            com.bytedance.adsdk.lottie.cw.cw[] r0 = com.bytedance.adsdk.lottie.cw.cw.f1761r
            java.lang.Object r0 = r0.clone()
            com.bytedance.adsdk.lottie.cw.cw[] r0 = (com.bytedance.adsdk.lottie.cw.cw[]) r0
            return r0
    }

    public java.lang.String j() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ".temp"
            r0.<init>(r1)
            java.lang.String r1 = r2.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }
}

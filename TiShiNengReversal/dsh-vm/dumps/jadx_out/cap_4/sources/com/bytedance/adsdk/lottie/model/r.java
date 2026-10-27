package com.bytedance.adsdk.lottie.model;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private final double cw;
    private final java.util.List<com.bytedance.adsdk.lottie.model.xt.av> j;

    /* renamed from: m, reason: collision with root package name */
    private final java.lang.String f1857m;

    /* renamed from: r, reason: collision with root package name */
    private final double f1858r;
    private final java.lang.String up;
    private final char xt;

    public r(java.util.List<com.bytedance.adsdk.lottie.model.xt.av> r1, char r2, double r3, double r5, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f1858r = r5
            r0.up = r7
            r0.f1857m = r8
            return
    }

    public static int j(char r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public int hashCode() {
            r3 = this;
            char r0 = r3.xt
            java.lang.String r1 = r3.f1857m
            java.lang.String r2 = r3.up
            int r0 = j(r0, r1, r2)
            return r0
    }

    public java.util.List<com.bytedance.adsdk.lottie.model.xt.av> j() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.xt.av> r0 = r1.j
            return r0
    }

    public double xt() {
            r2 = this;
            double r0 = r2.f1858r
            return r0
    }
}

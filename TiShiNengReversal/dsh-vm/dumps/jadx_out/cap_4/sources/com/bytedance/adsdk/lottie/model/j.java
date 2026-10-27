package com.bytedance.adsdk.lottie.model;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private final android.graphics.PointF cw;
    private final android.graphics.PointF j;
    private final android.graphics.PointF xt;

    public j() {
            r1 = this;
            r1.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.j = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.xt = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.cw = r0
            return
    }

    public j(android.graphics.PointF r1, android.graphics.PointF r2, android.graphics.PointF r3) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            return
    }

    public android.graphics.PointF cw() {
            r1 = this;
            android.graphics.PointF r0 = r1.cw
            return r0
    }

    public void cw(float r2, float r3) {
            r1 = this;
            android.graphics.PointF r0 = r1.cw
            r0.set(r2, r3)
            return
    }

    public android.graphics.PointF j() {
            r1 = this;
            android.graphics.PointF r0 = r1.j
            return r0
    }

    public void j(float r2, float r3) {
            r1 = this;
            android.graphics.PointF r0 = r1.j
            r0.set(r2, r3)
            return
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    public java.lang.String toString() {
            r8 = this;
            android.graphics.PointF r0 = r8.cw
            float r0 = r0.x
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.graphics.PointF r1 = r8.cw
            float r1 = r1.y
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            android.graphics.PointF r2 = r8.j
            float r2 = r2.x
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            android.graphics.PointF r3 = r8.j
            float r3 = r3.y
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            android.graphics.PointF r4 = r8.xt
            float r4 = r4.x
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            android.graphics.PointF r5 = r8.xt
            float r5 = r5.y
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            java.lang.String r0 = "v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f"
            java.lang.String r0 = java.lang.String.format(r0, r6)
            return r0
    }

    public android.graphics.PointF xt() {
            r1 = this;
            android.graphics.PointF r0 = r1.xt
            return r0
    }

    public void xt(float r2, float r3) {
            r1 = this;
            android.graphics.PointF r0 = r1.xt
            r0.set(r2, r3)
            return
    }
}

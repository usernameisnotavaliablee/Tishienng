package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g extends com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> {
    private android.graphics.Path oq;
    private final com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> qv;

    public g(com.bytedance.adsdk.lottie.m r10, com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r11) {
            r9 = this;
            T r2 = r11.j
            T r3 = r11.xt
            android.view.animation.Interpolator r4 = r11.cw
            android.view.animation.Interpolator r5 = r11.f1821r
            android.view.animation.Interpolator r6 = r11.up
            float r7 = r11.f1820m
            java.lang.Float r8 = r11.ae
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.qv = r11
            r9.j()
            return
    }

    public void j() {
            r4 = this;
            T r0 = r4.xt
            if (r0 == 0) goto L1b
            T r1 = r4.j
            if (r1 == 0) goto L1b
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r2 = r0
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.y
            boolean r0 = r1.equals(r2, r0)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            T r1 = r4.j
            if (r1 == 0) goto L36
            T r2 = r4.xt
            if (r2 == 0) goto L36
            if (r0 != 0) goto L36
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            com.bytedance.adsdk.lottie.m.j<android.graphics.PointF> r0 = r4.qv
            android.graphics.PointF r3 = r0.tl
            android.graphics.PointF r0 = r0.g
            android.graphics.Path r0 = com.bytedance.adsdk.lottie.up.g.j(r1, r2, r3, r0)
            r4.oq = r0
        L36:
            return
    }

    android.graphics.Path xt() {
            r1 = this;
            android.graphics.Path r0 = r1.oq
            return r0
    }
}

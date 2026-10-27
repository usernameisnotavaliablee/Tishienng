package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv extends com.bytedance.adsdk.lottie.model.layer.cw {
    private final android.graphics.RectF ae;
    private final float[] g;
    private final android.graphics.Path oq;
    private final com.bytedance.adsdk.lottie.model.layer.tl qv;
    private final android.graphics.Paint tl;
    private com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> vl;

    qv(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.tl r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.ae = r2
            com.bytedance.adsdk.lottie.j.j r2 = new com.bytedance.adsdk.lottie.j.j
            r2.<init>()
            r1.tl = r2
            r0 = 8
            float[] r0 = new float[r0]
            r1.g = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.oq = r0
            r1.qv = r3
            r0 = 0
            r2.setAlpha(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            int r3 = r3.av()
            r2.setColor(r3)
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw, com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r3, android.graphics.Matrix r4, boolean r5) {
            r2 = this;
            super.j(r3, r4, r5)
            android.graphics.RectF r4 = r2.ae
            com.bytedance.adsdk.lottie.model.layer.tl r5 = r2.qv
            int r5 = r5.w()
            float r5 = (float) r5
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r2.qv
            int r0 = r0.i()
            float r0 = (float) r0
            r1 = 0
            r4.set(r1, r1, r5, r0)
            android.graphics.Matrix r4 = r2.j
            android.graphics.RectF r5 = r2.ae
            r4.mapRect(r5)
            android.graphics.RectF r4 = r2.ae
            r3.set(r4)
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r10, android.graphics.Matrix r11, int r12) {
            r9 = this;
            super.xt(r10, r11, r12)
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r9.qv
            int r0 = r0.av()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 != 0) goto L11
            goto Ldd
        L11:
            com.bytedance.adsdk.lottie.j.xt.av r1 = r9.f1838r
            com.bytedance.adsdk.lottie.j.xt.j r1 = r1.j()
            if (r1 != 0) goto L1c
            r1 = 100
            goto L2c
        L1c:
            com.bytedance.adsdk.lottie.j.xt.av r1 = r9.f1838r
            com.bytedance.adsdk.lottie.j.xt.j r1 = r1.j()
            java.lang.Object r1 = r1.ae()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L2c:
            float r12 = (float) r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            float r12 = r12 * r0
            float r12 = r12 * r2
            int r12 = (int) r12
            android.graphics.Paint r0 = r9.tl
            r0.setAlpha(r12)
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> r0 = r9.vl
            if (r0 == 0) goto L51
            android.graphics.Paint r1 = r9.tl
            java.lang.Object r0 = r0.ae()
            android.graphics.ColorFilter r0 = (android.graphics.ColorFilter) r0
            r1.setColorFilter(r0)
        L51:
            if (r12 <= 0) goto Ldd
            float[] r12 = r9.g
            r0 = 0
            r1 = 0
            r12[r0] = r1
            r2 = 1
            r12[r2] = r1
            com.bytedance.adsdk.lottie.model.layer.tl r3 = r9.qv
            int r3 = r3.w()
            float r3 = (float) r3
            r4 = 2
            r12[r4] = r3
            float[] r12 = r9.g
            r3 = 3
            r12[r3] = r1
            com.bytedance.adsdk.lottie.model.layer.tl r5 = r9.qv
            int r5 = r5.w()
            float r5 = (float) r5
            r6 = 4
            r12[r6] = r5
            float[] r12 = r9.g
            com.bytedance.adsdk.lottie.model.layer.tl r5 = r9.qv
            int r5 = r5.i()
            float r5 = (float) r5
            r7 = 5
            r12[r7] = r5
            float[] r12 = r9.g
            r5 = 6
            r12[r5] = r1
            com.bytedance.adsdk.lottie.model.layer.tl r1 = r9.qv
            int r1 = r1.i()
            float r1 = (float) r1
            r8 = 7
            r12[r8] = r1
            float[] r12 = r9.g
            r11.mapPoints(r12)
            android.graphics.Path r11 = r9.oq
            r11.reset()
            android.graphics.Path r11 = r9.oq
            float[] r12 = r9.g
            r1 = r12[r0]
            r12 = r12[r2]
            r11.moveTo(r1, r12)
            android.graphics.Path r11 = r9.oq
            float[] r12 = r9.g
            r1 = r12[r4]
            r12 = r12[r3]
            r11.lineTo(r1, r12)
            android.graphics.Path r11 = r9.oq
            float[] r12 = r9.g
            r1 = r12[r6]
            r12 = r12[r7]
            r11.lineTo(r1, r12)
            android.graphics.Path r11 = r9.oq
            float[] r12 = r9.g
            r1 = r12[r5]
            r12 = r12[r8]
            r11.lineTo(r1, r12)
            android.graphics.Path r11 = r9.oq
            float[] r12 = r9.g
            r0 = r12[r0]
            r12 = r12[r2]
            r11.lineTo(r0, r12)
            android.graphics.Path r11 = r9.oq
            r11.close()
            android.graphics.Path r11 = r9.oq
            android.graphics.Paint r12 = r9.tl
            r10.drawPath(r11, r12)
        Ldd:
            return
    }
}

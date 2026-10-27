package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae extends com.bytedance.adsdk.lottie.model.layer.cw {
    protected final com.bytedance.adsdk.lottie.g ae;
    private final android.graphics.Rect g;
    private final android.graphics.Rect oq;
    private com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> qv;
    private final android.graphics.Paint tl;
    private com.bytedance.adsdk.lottie.j.xt.j<android.graphics.Bitmap, android.graphics.Bitmap> vl;

    ae(com.bytedance.adsdk.lottie.tl r3, com.bytedance.adsdk.lottie.model.layer.tl r4) {
            r2 = this;
            r2.<init>(r3, r4)
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r1 = 3
            r0.<init>(r1)
            r2.tl = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.g = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.oq = r0
            java.lang.String r4 = r4.ae()
            com.bytedance.adsdk.lottie.g r3 = r3.m(r4)
            r2.ae = r3
            return
    }

    private android.graphics.Bitmap ws() {
            r2 = this;
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.Bitmap, android.graphics.Bitmap> r0 = r2.vl
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.ae()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r2.cw
            java.lang.String r0 = r0.ae()
            com.bytedance.adsdk.lottie.tl r1 = r2.xt
            android.graphics.Bitmap r0 = r1.up(r0)
            if (r0 == 0) goto L1c
            return r0
        L1c:
            com.bytedance.adsdk.lottie.g r0 = r2.ae
            if (r0 == 0) goto L25
            android.graphics.Bitmap r0 = r0.ws()
            return r0
        L25:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw, com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r2, android.graphics.Matrix r3, boolean r4) {
            r1 = this;
            super.j(r2, r3, r4)
            com.bytedance.adsdk.lottie.g r3 = r1.ae
            if (r3 == 0) goto L26
            float r3 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.g r4 = r1.ae
            int r4 = r4.j()
            float r4 = (float) r4
            float r4 = r4 * r3
            com.bytedance.adsdk.lottie.g r0 = r1.ae
            int r0 = r0.xt()
            float r0 = (float) r0
            float r0 = r0 * r3
            r3 = 0
            r2.set(r3, r3, r4, r0)
            android.graphics.Matrix r3 = r1.j
            r3.mapRect(r2)
        L26:
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r5, android.graphics.Matrix r6, int r7) {
            r4 = this;
            super.xt(r5, r6, r7)
            android.graphics.Bitmap r0 = r4.ws()
            if (r0 == 0) goto L83
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L83
            com.bytedance.adsdk.lottie.g r1 = r4.ae
            if (r1 != 0) goto L14
            goto L83
        L14:
            float r1 = com.bytedance.adsdk.lottie.up.g.j()
            android.graphics.Paint r2 = r4.tl
            r2.setAlpha(r7)
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> r7 = r4.qv
            if (r7 == 0) goto L2c
            android.graphics.Paint r2 = r4.tl
            java.lang.Object r7 = r7.ae()
            android.graphics.ColorFilter r7 = (android.graphics.ColorFilter) r7
            r2.setColorFilter(r7)
        L2c:
            r5.save()
            r5.concat(r6)
            android.graphics.Rect r6 = r4.g
            int r7 = r0.getWidth()
            int r2 = r0.getHeight()
            r3 = 0
            r6.set(r3, r3, r7, r2)
            com.bytedance.adsdk.lottie.tl r6 = r4.xt
            boolean r6 = r6.m()
            if (r6 == 0) goto L62
            android.graphics.Rect r6 = r4.oq
            com.bytedance.adsdk.lottie.g r7 = r4.ae
            int r7 = r7.j()
            float r7 = (float) r7
            float r7 = r7 * r1
            int r7 = (int) r7
            com.bytedance.adsdk.lottie.g r2 = r4.ae
            int r2 = r2.xt()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = (int) r2
            r6.set(r3, r3, r7, r1)
            goto L77
        L62:
            android.graphics.Rect r6 = r4.oq
            int r7 = r0.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r1
            int r7 = (int) r7
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = (int) r2
            r6.set(r3, r3, r7, r1)
        L77:
            android.graphics.Rect r6 = r4.g
            android.graphics.Rect r7 = r4.oq
            android.graphics.Paint r1 = r4.tl
            r5.drawBitmap(r0, r6, r7, r1)
            r5.restore()
        L83:
            return
    }
}

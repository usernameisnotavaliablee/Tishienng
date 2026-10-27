package com.github.mikephil.charting.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class LineRadarRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    public LineRadarRenderer(com.github.mikephil.charting.animation.ChartAnimator r1, com.github.mikephil.charting.utils.ViewPortHandler r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean clipPathSupported() {
            r2 = this;
            int r0 = com.github.mikephil.charting.utils.Utils.getSDKInt()
            r1 = 18
            if (r0 < r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    protected void drawFilledPath(android.graphics.Canvas r4, android.graphics.Path r5, int r6, int r7) {
            r3 = this;
            int r7 = r7 << 24
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r0
            r6 = r6 | r7
            boolean r7 = r3.clipPathSupported()
            if (r7 == 0) goto L1b
            int r7 = r4.save()
            r4.clipPath(r5)
            r4.drawColor(r6)
            r4.restoreToCount(r7)
            return
        L1b:
            android.graphics.Paint r7 = r3.mRenderPaint
            android.graphics.Paint$Style r7 = r7.getStyle()
            android.graphics.Paint r0 = r3.mRenderPaint
            int r0 = r0.getColor()
            android.graphics.Paint r1 = r3.mRenderPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r3.mRenderPaint
            r1.setColor(r6)
            android.graphics.Paint r6 = r3.mRenderPaint
            r4.drawPath(r5, r6)
            android.graphics.Paint r4 = r3.mRenderPaint
            r4.setColor(r0)
            android.graphics.Paint r4 = r3.mRenderPaint
            r4.setStyle(r7)
            return
    }

    protected void drawFilledPath(android.graphics.Canvas r5, android.graphics.Path r6, android.graphics.drawable.Drawable r7) {
            r4 = this;
            boolean r0 = r4.clipPathSupported()
            if (r0 == 0) goto L33
            int r0 = r5.save()
            r5.clipPath(r6)
            com.github.mikephil.charting.utils.ViewPortHandler r6 = r4.mViewPortHandler
            float r6 = r6.contentLeft()
            int r6 = (int) r6
            com.github.mikephil.charting.utils.ViewPortHandler r1 = r4.mViewPortHandler
            float r1 = r1.contentTop()
            int r1 = (int) r1
            com.github.mikephil.charting.utils.ViewPortHandler r2 = r4.mViewPortHandler
            float r2 = r2.contentRight()
            int r2 = (int) r2
            com.github.mikephil.charting.utils.ViewPortHandler r3 = r4.mViewPortHandler
            float r3 = r3.contentBottom()
            int r3 = (int) r3
            r7.setBounds(r6, r1, r2, r3)
            r7.draw(r5)
            r5.restoreToCount(r0)
            return
        L33:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Fill-drawables not (yet) supported below API level 18, this code was run on API level "
            r6.append(r7)
            int r7 = com.github.mikephil.charting.utils.Utils.getSDKInt()
            r6.append(r7)
            java.lang.String r7 = "."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}

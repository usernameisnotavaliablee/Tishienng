package com.kwad.components.core.page.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class TextProgressBar extends android.widget.ProgressBar {

    @androidx.annotation.Nullable
    private java.lang.String VF;
    private android.graphics.LinearGradient VG;
    private android.graphics.Matrix VH;
    private boolean VI;
    private boolean VJ;
    private boolean VK;
    private int VL;
    private int VM;
    private android.graphics.drawable.Drawable VN;
    private int VO;
    private android.graphics.Rect VP;
    private int[] VQ;
    private int VR;
    private int VS;
    private boolean VT;
    private android.graphics.Paint mPaint;
    private android.graphics.RectF mRectF;

    public TextProgressBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TextProgressBar(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            android.content.Context r1 = com.kwad.sdk.o.m.wrapContextIfNeed(r1)
            r0.<init>(r1, r2)
            r1 = 0
            r0.VJ = r1
            r1 = 1
            r0.VK = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.VP = r1
            r0.rP()
            return
    }

    private void rP() {
            r4 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.mPaint = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r4.mPaint
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.mPaint
            android.content.Context r2 = r4.getContext()
            r3 = 1094713344(0x41400000, float:12.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r3)
            float r2 = (float) r2
            r0.setTextSize(r2)
            android.content.Context r0 = r4.getContext()
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r2)
            r4.VO = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.mRectF = r0
            r4.VR = r1
            r0 = -117146(0xfffffffffffe3666, float:NaN)
            r4.VS = r0
            return
    }

    private void setProgressText(int r2) {
            r1 = this;
            float r2 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r0
            int r0 = r1.getMax()
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            java.lang.String r2 = "%"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.VF = r2
            return
    }

    public final void e(java.lang.String r1, int r2) {
            r0 = this;
            r0.VF = r1
            r1 = 1
            r0.VI = r1
            r0.setProgress(r2)
            r0.invalidate()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.VJ     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            if (r0 == 0) goto L22
            r14.save()     // Catch: java.lang.Throwable -> L1e
            r0 = 1119092736(0x42b40000, float:90.0)
            r14.rotate(r0)     // Catch: java.lang.Throwable -> L1e
            int r0 = r13.getWidth()     // Catch: java.lang.Throwable -> L1e
            int r0 = -r0
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1e
            r14.translate(r1, r0)     // Catch: java.lang.Throwable -> L1e
            super.onDraw(r14)     // Catch: java.lang.Throwable -> L1e
            r14.restore()     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r0 = move-exception
            r14 = r0
            goto L18c
        L22:
            super.onDraw(r14)     // Catch: java.lang.Throwable -> L1e
        L25:
            java.lang.String r0 = r13.VF     // Catch: java.lang.Throwable -> L1e
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L3b
            android.graphics.Paint r0 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r13.VF     // Catch: java.lang.Throwable -> L1e
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L1e
            android.graphics.Rect r4 = r13.VP     // Catch: java.lang.Throwable -> L1e
            r5 = 0
            r0.getTextBounds(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L1e
        L3b:
            int r0 = r13.getHeight()     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 / 2
            android.graphics.Rect r2 = r13.VP     // Catch: java.lang.Throwable -> L1e
            int r2 = r2.centerY()     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 - r2
            android.graphics.drawable.Drawable r2 = r13.VN     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L84
            int r2 = r2.getIntrinsicWidth()     // Catch: java.lang.Throwable -> L1e
            android.graphics.drawable.Drawable r3 = r13.VN     // Catch: java.lang.Throwable -> L1e
            int r3 = r3.getIntrinsicHeight()     // Catch: java.lang.Throwable -> L1e
            int r4 = r13.getWidth()     // Catch: java.lang.Throwable -> L1e
            android.graphics.Rect r5 = r13.VP     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.width()     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 - r5
            int r4 = r4 - r2
            int r5 = r13.VO     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 - r5
            int r4 = r4 / 2
            android.graphics.drawable.Drawable r5 = r13.VN     // Catch: java.lang.Throwable -> L1e
            int r6 = r13.getHeight()     // Catch: java.lang.Throwable -> L1e
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r2 = r2 + r4
            int r7 = r13.getHeight()     // Catch: java.lang.Throwable -> L1e
            int r7 = r7 + r3
            int r7 = r7 / 2
            r5.setBounds(r4, r6, r2, r7)     // Catch: java.lang.Throwable -> L1e
            android.graphics.drawable.Drawable r3 = r13.VN     // Catch: java.lang.Throwable -> L1e
            r3.draw(r14)     // Catch: java.lang.Throwable -> L1e
            int r3 = r13.VO     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + r3
            goto L91
        L84:
            int r2 = r13.getWidth()     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 / 2
            android.graphics.Rect r3 = r13.VP     // Catch: java.lang.Throwable -> L1e
            int r3 = r3.centerX()     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 - r3
        L91:
            int[] r3 = r13.VQ     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L105
            int r3 = r13.getProgress()     // Catch: java.lang.Throwable -> L1e
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L1e
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            int r5 = r13.getMax()     // Catch: java.lang.Throwable -> L1e
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L1e
            float r3 = r3 / r5
            int r5 = r13.getWidth()     // Catch: java.lang.Throwable -> L1e
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L1e
            float r3 = r3 * r5
            float r6 = (float) r2     // Catch: java.lang.Throwable -> L1e
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto Lf5
            android.graphics.LinearGradient r5 = r13.VG     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto Ld6
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient     // Catch: java.lang.Throwable -> L1e
            android.graphics.Rect r7 = r13.VP     // Catch: java.lang.Throwable -> L1e
            int r7 = r7.width()     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + r7
            float r8 = (float) r2     // Catch: java.lang.Throwable -> L1e
            int[] r10 = r13.VQ     // Catch: java.lang.Throwable -> L1e
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> L1e
            r7 = 0
            r9 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1e
            r13.VG = r5     // Catch: java.lang.Throwable -> L1e
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L1e
            r2.<init>()     // Catch: java.lang.Throwable -> L1e
            r13.VH = r2     // Catch: java.lang.Throwable -> L1e
            android.graphics.LinearGradient r5 = r13.VG     // Catch: java.lang.Throwable -> L1e
            r5.setLocalMatrix(r2)     // Catch: java.lang.Throwable -> L1e
        Ld6:
            android.graphics.Paint r2 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            android.graphics.LinearGradient r5 = r13.VG     // Catch: java.lang.Throwable -> L1e
            r2.setShader(r5)     // Catch: java.lang.Throwable -> L1e
            float r3 = r3 - r6
            float r3 = r3 * r4
            android.graphics.Rect r2 = r13.VP     // Catch: java.lang.Throwable -> L1e
            int r2 = r2.width()     // Catch: java.lang.Throwable -> L1e
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L1e
            float r3 = r3 / r2
            android.graphics.Matrix r2 = r13.VH     // Catch: java.lang.Throwable -> L1e
            r2.setScale(r3, r4, r6, r1)     // Catch: java.lang.Throwable -> L1e
            android.graphics.LinearGradient r1 = r13.VG     // Catch: java.lang.Throwable -> L1e
            android.graphics.Matrix r2 = r13.VH     // Catch: java.lang.Throwable -> L1e
            r1.setLocalMatrix(r2)     // Catch: java.lang.Throwable -> L1e
            goto Lfb
        Lf5:
            android.graphics.Paint r1 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.setShader(r2)     // Catch: java.lang.Throwable -> L1e
        Lfb:
            java.lang.String r1 = r13.VF     // Catch: java.lang.Throwable -> L1e
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1e
            android.graphics.Paint r2 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            r14.drawText(r1, r6, r0, r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r13)
            return
        L105:
            boolean r3 = r13.isIndeterminate()     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L124
            boolean r3 = r13.VT     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L110
            goto L124
        L110:
            android.graphics.Paint r1 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            int r3 = r13.VR     // Catch: java.lang.Throwable -> L1e
            r1.setColor(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r13.VF     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L122
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L1e
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1e
            android.graphics.Paint r3 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            r14.drawText(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L1e
        L122:
            monitor-exit(r13)
            return
        L124:
            int r3 = r13.getWidth()     // Catch: java.lang.Throwable -> L1e
            int r4 = r13.getProgress()     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 * r4
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L1e
            int r4 = r13.getMax()     // Catch: java.lang.Throwable -> L1e
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L1e
            float r3 = r3 / r4
            int r4 = r14.save()     // Catch: java.lang.Throwable -> L1e
            android.graphics.RectF r5 = r13.mRectF     // Catch: java.lang.Throwable -> L1e
            int r6 = r13.getWidth()     // Catch: java.lang.Throwable -> L1e
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L1e
            int r7 = r13.getHeight()     // Catch: java.lang.Throwable -> L1e
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L1e
            r5.set(r3, r1, r6, r7)     // Catch: java.lang.Throwable -> L1e
            android.graphics.RectF r5 = r13.mRectF     // Catch: java.lang.Throwable -> L1e
            r14.clipRect(r5)     // Catch: java.lang.Throwable -> L1e
            android.graphics.Paint r5 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            int r6 = r13.VS     // Catch: java.lang.Throwable -> L1e
            r5.setColor(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r13.VF     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L15f
            float r6 = (float) r2     // Catch: java.lang.Throwable -> L1e
            float r7 = (float) r0     // Catch: java.lang.Throwable -> L1e
            android.graphics.Paint r8 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            r14.drawText(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1e
        L15f:
            r14.restoreToCount(r4)     // Catch: java.lang.Throwable -> L1e
            int r4 = r14.save()     // Catch: java.lang.Throwable -> L1e
            android.graphics.RectF r5 = r13.mRectF     // Catch: java.lang.Throwable -> L1e
            int r6 = r13.getHeight()     // Catch: java.lang.Throwable -> L1e
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L1e
            r5.set(r1, r1, r3, r6)     // Catch: java.lang.Throwable -> L1e
            android.graphics.RectF r1 = r13.mRectF     // Catch: java.lang.Throwable -> L1e
            r14.clipRect(r1)     // Catch: java.lang.Throwable -> L1e
            android.graphics.Paint r1 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            int r3 = r13.VR     // Catch: java.lang.Throwable -> L1e
            r1.setColor(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r13.VF     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L187
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L1e
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1e
            android.graphics.Paint r3 = r13.mPaint     // Catch: java.lang.Throwable -> L1e
            r14.drawText(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L1e
        L187:
            r14.restoreToCount(r4)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r13)
            return
        L18c:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L1e
            throw r14
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            java.lang.String r1 = r6.VF     // Catch: java.lang.Throwable -> L38
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L48
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            android.graphics.Paint r2 = r6.mPaint     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r6.VF     // Catch: java.lang.Throwable -> L38
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L38
            r5 = 0
            r2.getTextBounds(r3, r5, r4, r1)     // Catch: java.lang.Throwable -> L38
            int r2 = r0.width     // Catch: java.lang.Throwable -> L38
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2
            if (r2 != r4) goto L3a
            int r7 = r1.width()     // Catch: java.lang.Throwable -> L38
            int r2 = r6.VL     // Catch: java.lang.Throwable -> L38
            int r7 = r7 + r2
            int r2 = r6.VM     // Catch: java.lang.Throwable -> L38
            int r7 = r7 + r2
            r0.width = r7     // Catch: java.lang.Throwable -> L38
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r7 = move-exception
            goto L61
        L3a:
            int r2 = r0.height     // Catch: java.lang.Throwable -> L38
            if (r2 != r4) goto L48
            int r8 = r1.height()     // Catch: java.lang.Throwable -> L38
            r0.height = r8     // Catch: java.lang.Throwable -> L38
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)     // Catch: java.lang.Throwable -> L38
        L48:
            boolean r0 = r6.VJ     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L5c
            super.onMeasure(r8, r7)     // Catch: java.lang.Throwable -> L38
            int r7 = r6.getMeasuredHeight()     // Catch: java.lang.Throwable -> L38
            int r8 = r6.getMeasuredWidth()     // Catch: java.lang.Throwable -> L38
            r6.setMeasuredDimension(r7, r8)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r6)
            return
        L5c:
            super.onMeasure(r7, r8)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r6)
            return
        L61:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L38
            throw r7
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.VJ
            if (r0 == 0) goto L8
            super.onSizeChanged(r3, r2, r4, r5)
            return
        L8:
            super.onSizeChanged(r2, r3, r4, r5)
            return
    }

    public void setDrawableLeft(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.VN = r1
            return
    }

    public void setDrawablePadding(int r1) {
            r0 = this;
            r0.VO = r1
            return
    }

    public void setHasProgress(boolean r1) {
            r0 = this;
            r0.VK = r1
            return
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.VL = r1
            r0.VM = r3
            return
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int r2) {
            r1 = this;
            boolean r0 = r1.VK
            if (r0 == 0) goto L8
            super.setProgress(r2)
            return
        L8:
            r2 = 0
            super.setProgress(r2)
            return
    }

    public void setTextColor(int r2) {
            r1 = this;
            r0 = 0
            r1.VT = r0
            r1.VR = r2
            r1.postInvalidate()
            return
    }

    public final void setTextColor(@androidx.annotation.ColorInt int r2, @androidx.annotation.ColorInt int r3) {
            r1 = this;
            r0 = 1
            r1.VT = r0
            r1.VR = r2
            r1.VS = r3
            r1.postInvalidate()
            return
    }

    public void setTextDimen(float r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setTextSize(r2)
            return
    }

    public void setTextDimenSp(int r4) {
            r3 = this;
            android.graphics.Paint r0 = r3.mPaint
            float r4 = (float) r4
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 2
            float r4 = android.util.TypedValue.applyDimension(r2, r4, r1)
            r0.setTextSize(r4)
            return
    }

    public void setVertical(boolean r1) {
            r0 = this;
            r0.VJ = r1
            return
    }
}

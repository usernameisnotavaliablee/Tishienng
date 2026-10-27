package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ToggleButton extends android.widget.CompoundButton {
    private static final java.lang.String TAG = "ToggleButton";
    private android.graphics.Paint backgroundPaint;
    private android.graphics.Path backgroundPath;
    private int color_off;
    private int color_on;
    private float padding;
    private android.graphics.Path toggleDrawPath;
    private android.graphics.Paint togglePaint;
    private android.graphics.Path togglePath_off;
    private android.graphics.Path togglePath_on;

    public ToggleButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ToggleButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ToggleButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r3 = 1
            r1.<init>(r3)
            r0.backgroundPaint = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r3)
            r0.togglePaint = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.backgroundPath = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.togglePath_on = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.togglePath_off = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.toggleDrawPath = r1
            r0.setClickable(r3)
            r0.initAttrs(r2)
            r0.initPaints()
            return
    }

    private void initAttrs(android.util.AttributeSet r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int[] r1 = com.bxkj.student.R.styleable.ToggleButton
            android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r1)
            r0 = 1
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            int r0 = r3.getColor(r0, r1)
            r2.color_on = r0
            r0 = 0
            r1 = -3355444(0xffffffffffcccccc, float:NaN)
            int r0 = r3.getColor(r0, r1)
            r2.color_off = r0
            r0 = 2
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.getDimension(r0, r1)
            r2.padding = r0
            r3.recycle()
            return
    }

    private void initPaints() {
            r2 = this;
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L9
            int r0 = r2.color_on
            goto Lb
        L9:
            int r0 = r2.color_off
        Lb:
            android.graphics.Paint r1 = r2.backgroundPaint
            r1.setColor(r0)
            android.graphics.Paint r0 = r2.togglePaint
            r1 = -1
            r0.setColor(r1)
            return
    }

    private void initPath() {
            r16 = this;
            r0 = r16
            int r1 = r0.getHeight()
            int r2 = r0.getWidth()
            if (r1 <= 0) goto L83
            if (r2 <= 0) goto L83
            int r3 = java.lang.Math.min(r2, r1)
            int r3 = r3 / 2
            android.graphics.Path r4 = r0.backgroundPath
            r4.reset()
            android.graphics.Path r4 = r0.togglePath_on
            r4.reset()
            android.graphics.Path r4 = r0.togglePath_off
            r4.reset()
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r3 * 2
            float r6 = (float) r5
            r7 = 0
            r4.<init>(r7, r7, r6, r6)
            android.graphics.RectF r8 = new android.graphics.RectF
            int r5 = r2 - r5
            float r5 = (float) r5
            float r9 = (float) r2
            float r14 = (float) r1
            r8.<init>(r5, r7, r9, r14)
            android.graphics.Path r1 = r0.backgroundPath
            r7 = 1119092736(0x42b40000, float:90.0)
            r10 = 1127481344(0x43340000, float:180.0)
            r1.addArc(r4, r7, r10)
            r1 = 1127481344(0x43340000, float:180.0)
            android.graphics.Path r10 = r0.backgroundPath
            float r11 = (float) r3
            int r2 = r2 - r3
            float r13 = (float) r2
            android.graphics.Path$Direction r15 = android.graphics.Path.Direction.CCW
            r12 = 0
            r10.addRect(r11, r12, r13, r14, r15)
            android.graphics.Path r2 = r0.backgroundPath
            r3 = 1132920832(0x43870000, float:270.0)
            r2.addArc(r8, r3, r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r0.padding
            float r5 = r5 - r2
            float r9 = r9 - r2
            float r14 = r14 - r2
            r1.<init>(r5, r2, r9, r14)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r0.padding
            float r4 = r6 - r3
            float r6 = r6 - r3
            r2.<init>(r3, r3, r4, r6)
            android.graphics.Path r3 = r0.togglePath_on
            r4 = 1135869952(0x43b40000, float:360.0)
            r3.addArc(r1, r7, r4)
            android.graphics.Path r1 = r0.togglePath_off
            r1.addArc(r2, r7, r4)
            android.graphics.Path r1 = r0.toggleDrawPath
            boolean r2 = r0.isChecked()
            if (r2 == 0) goto L7e
            android.graphics.Path r2 = r0.togglePath_on
            goto L80
        L7e:
            android.graphics.Path r2 = r0.togglePath_off
        L80:
            r1.set(r2)
        L83:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            android.graphics.Path r0 = r2.backgroundPath
            android.graphics.Paint r1 = r2.backgroundPaint
            r3.drawPath(r0, r1)
            android.graphics.Path r0 = r2.toggleDrawPath
            android.graphics.Paint r1 = r2.togglePaint
            r3.drawPath(r0, r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            android.content.res.Resources r2 = r5.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 1
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 == r4) goto L20
            r6 = 1112014848(0x42480000, float:50.0)
            float r6 = android.util.TypedValue.applyDimension(r3, r6, r2)
            int r6 = (int) r6
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
        L20:
            if (r1 == r4) goto L2d
            r7 = 1106247680(0x41f00000, float:30.0)
            float r7 = android.util.TypedValue.applyDimension(r3, r7, r2)
            int r7 = (int) r7
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
        L2d:
            r5.setMeasuredDimension(r6, r7)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.initPath()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r3) {
            r2 = this;
            super.setChecked(r3)
            android.graphics.Paint r0 = r2.backgroundPaint
            if (r0 == 0) goto L11
            if (r3 == 0) goto Lc
            int r1 = r2.color_on
            goto Le
        Lc:
            int r1 = r2.color_off
        Le:
            r0.setColor(r1)
        L11:
            android.graphics.Path r0 = r2.toggleDrawPath
            if (r0 == 0) goto L24
            r0.reset()
            android.graphics.Path r0 = r2.toggleDrawPath
            if (r3 == 0) goto L1f
            android.graphics.Path r3 = r2.togglePath_on
            goto L21
        L1f:
            android.graphics.Path r3 = r2.togglePath_off
        L21:
            r0.set(r3)
        L24:
            r2.invalidate()
            return
    }

    public void setColor_off(int r1) {
            r0 = this;
            r0.color_off = r1
            return
    }

    public void setColor_on(int r1) {
            r0 = this;
            r0.color_on = r1
            return
    }

    public void setPadding(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.padding = r1
            return
    }
}

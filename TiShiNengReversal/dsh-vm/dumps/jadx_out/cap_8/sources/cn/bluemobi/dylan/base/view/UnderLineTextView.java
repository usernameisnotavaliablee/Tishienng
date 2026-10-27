package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class UnderLineTextView extends androidx.appcompat.widget.AppCompatTextView {
    private float density;
    private int mColor;
    private android.graphics.Paint mPaint;
    private android.graphics.Rect mRect;
    private float mStrokeWidth;
    private float spase;

    public UnderLineTextView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public UnderLineTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public UnderLineTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.init(r1, r2, r3)
            return
    }

    private void init(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r0, r3)
            float r0 = (float) r0
            r2.spase = r0
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r2.density = r0
            int[] r0 = cn.bluemobi.dylan.base.R.styleable.UnderlinedTextView
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r4 = cn.bluemobi.dylan.base.R.styleable.UnderlinedTextView_underlineColor
            r5 = -65536(0xffffffffffff0000, float:NaN)
            int r4 = r3.getColor(r4, r5)
            r2.mColor = r4
            int r4 = cn.bluemobi.dylan.base.R.styleable.UnderlinedTextView_underlineWidth
            float r5 = r2.density
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            float r4 = r3.getDimension(r4, r5)
            r2.mStrokeWidth = r4
            r3.recycle()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.mRect = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r2.mPaint = r3
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            android.graphics.Paint r3 = r2.mPaint
            int r4 = r2.mColor
            r3.setColor(r4)
            android.graphics.Paint r3 = r2.mPaint
            float r4 = r2.mStrokeWidth
            r3.setStrokeWidth(r4)
            return
    }

    public int getUnderLineColor() {
            r1 = this;
            int r0 = r1.mColor
            return r0
    }

    public float getUnderlineWidth() {
            r1 = this;
            float r0 = r1.mStrokeWidth
            return r0
    }

    protected void onDraw(android.graphics.Canvas r13) {
            r12 = this;
            int r0 = r12.getLineCount()
            android.text.Layout r1 = r12.getLayout()
            r2 = 0
        L9:
            if (r2 >= r0) goto L41
            android.graphics.Rect r3 = r12.mRect
            int r3 = r12.getLineBounds(r2, r3)
            int r4 = r1.getLineStart(r2)
            int r5 = r1.getLineEnd(r2)
            float r7 = r1.getPrimaryHorizontal(r4)
            int r4 = r4 + 1
            float r4 = r1.getPrimaryHorizontal(r4)
            float r4 = r4 - r7
            int r5 = r5 + (-1)
            float r5 = r1.getPrimaryHorizontal(r5)
            float r9 = r5 + r4
            float r3 = (float) r3
            float r4 = r12.mStrokeWidth
            float r5 = r3 + r4
            float r6 = r12.spase
            float r8 = r5 + r6
            float r3 = r3 + r4
            float r10 = r3 + r6
            android.graphics.Paint r11 = r12.mPaint
            r6 = r13
            r6.drawLine(r7, r8, r9, r10, r11)
            int r2 = r2 + 1
            goto L9
        L41:
            r6 = r13
            super/*android.widget.TextView*/.onDraw(r6)
            return
    }

    public void setUnderLineColor(int r1) {
            r0 = this;
            r0.mColor = r1
            r0.invalidate()
            return
    }

    public void setUnderlineWidth(float r1) {
            r0 = this;
            r0.mStrokeWidth = r1
            r0.invalidate()
            return
    }
}

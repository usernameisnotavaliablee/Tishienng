package androidx.constraintlayout.utils.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MotionTelltales extends androidx.constraintlayout.utils.widget.MockView {
    private static final java.lang.String TAG = "MotionTelltales";
    android.graphics.Matrix mInvertMatrix;
    androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private android.graphics.Paint mPaintTelltales;
    int mTailColor;
    float mTailScale;
    int mVelocityMode;
    float[] velocity;

    public MotionTelltales(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaintTelltales = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.velocity = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mInvertMatrix = r0
            r0 = 0
            r1.mVelocityMode = r0
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r1.mTailColor = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r1.mTailScale = r0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public MotionTelltales(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaintTelltales = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.velocity = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mInvertMatrix = r0
            r0 = 0
            r1.mVelocityMode = r0
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r1.mTailColor = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r1.mTailScale = r0
            r1.init(r2, r3)
            return
    }

    public MotionTelltales(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0.mPaintTelltales = r3
            r3 = 2
            float[] r3 = new float[r3]
            r0.velocity = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r0.mInvertMatrix = r3
            r3 = 0
            r0.mVelocityMode = r3
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            r0.mTailColor = r3
            r3 = 1048576000(0x3e800000, float:0.25)
            r0.mTailScale = r3
            r0.init(r1, r2)
            return
    }

    private void init(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            if (r5 == 0) goto L3c
            int[] r0 = androidx.constraintlayout.widget.R.styleable.MotionTelltales
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = r4.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r5) goto L3c
            int r1 = r4.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.R.styleable.MotionTelltales_telltales_tailColor
            if (r1 != r2) goto L20
            int r2 = r3.mTailColor
            int r1 = r4.getColor(r1, r2)
            r3.mTailColor = r1
            goto L39
        L20:
            int r2 = androidx.constraintlayout.widget.R.styleable.MotionTelltales_telltales_velocityMode
            if (r1 != r2) goto L2d
            int r2 = r3.mVelocityMode
            int r1 = r4.getInt(r1, r2)
            r3.mVelocityMode = r1
            goto L39
        L2d:
            int r2 = androidx.constraintlayout.widget.R.styleable.MotionTelltales_telltales_tailScale
            if (r1 != r2) goto L39
            float r2 = r3.mTailScale
            float r1 = r4.getFloat(r1, r2)
            r3.mTailScale = r1
        L39:
            int r0 = r0 + 1
            goto Ld
        L3c:
            android.graphics.Paint r4 = r3.mPaintTelltales
            int r5 = r3.mTailColor
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.mPaintTelltales
            r5 = 1084227584(0x40a00000, float:5.0)
            r4.setStrokeWidth(r5)
            return
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(android.graphics.Canvas r20) {
            r19 = this;
            r1 = r19
            super.onDraw(r20)
            android.graphics.Matrix r0 = r1.getMatrix()
            android.graphics.Matrix r2 = r1.mInvertMatrix
            r0.invert(r2)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            if (r0 != 0) goto L1f
            android.view.ViewParent r0 = r1.getParent()
            boolean r2 = r0 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            if (r2 == 0) goto L73
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            r1.mMotionLayout = r0
            return
        L1f:
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            r8 = 5
            float[] r9 = new float[r8]
            r9 = {x0074: FILL_ARRAY_DATA , data: [1036831949, 1048576000, 1056964608, 1061158912, 1063675494} // fill-array
            r10 = 0
            r11 = 0
        L2f:
            if (r11 >= r8) goto L73
            r3 = r9[r11]
            r12 = 0
        L34:
            if (r12 >= r8) goto L70
            r2 = r9[r12]
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            float[] r4 = r1.velocity
            int r5 = r1.mVelocityMode
            r0.getViewVelocity(r1, r2, r3, r4, r5)
            android.graphics.Matrix r0 = r1.mInvertMatrix
            float[] r4 = r1.velocity
            r0.mapVectors(r4)
            float r0 = (float) r6
            float r14 = r0 * r2
            float r0 = (float) r7
            float r15 = r0 * r3
            float[] r0 = r1.velocity
            r2 = r0[r10]
            float r4 = r1.mTailScale
            float r2 = r2 * r4
            float r16 = r14 - r2
            r2 = 1
            r2 = r0[r2]
            float r2 = r2 * r4
            float r17 = r15 - r2
            android.graphics.Matrix r2 = r1.mInvertMatrix
            r2.mapVectors(r0)
            android.graphics.Paint r0 = r1.mPaintTelltales
            r13 = r20
            r18 = r0
            r13.drawLine(r14, r15, r16, r17, r18)
            int r12 = r12 + 1
            goto L34
        L70:
            int r11 = r11 + 1
            goto L2f
        L73:
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.postInvalidate()
            return
    }

    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.mText = r1
            r0.requestLayout()
            return
    }
}

package com.kwad.components.ad.reward.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AppCompatCustomView"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KSCouponLabelTextView extends android.widget.TextView implements com.kwad.components.core.widget.d {
    private final android.graphics.Rect DB;
    private final android.graphics.RectF DC;
    private final android.graphics.RectF DF;
    private float DH;
    private float DI;
    private float DJ;
    private final android.graphics.RectF DK;
    private final android.graphics.RectF DL;
    private final android.graphics.Path DM;
    private android.graphics.Path DN;
    private android.graphics.Path DO;
    private boolean DP;
    private final android.graphics.Paint mPaint;

    @androidx.annotation.ColorInt
    private int strokeColor;

    public KSCouponLabelTextView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.mPaint = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.DB = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.DC = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.DK = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.DL = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.DM = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.DF = r0
            r0 = 1
            r2.DP = r0
            r0 = 0
            r1 = 0
            r2.a(r3, r0, r1)
            return
    }

    public KSCouponLabelTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaint = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.DB = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DC = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DK = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DL = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.DM = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DF = r0
            r0 = 1
            r1.DP = r0
            r0 = 0
            r1.a(r2, r3, r0)
            return
    }

    public KSCouponLabelTextView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.mPaint = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.DB = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DC = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DK = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DL = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.DM = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.DF = r0
            r0 = 1
            r1.DP = r0
            r1.a(r2, r3, r4)
            return
    }

    @android.annotation.SuppressLint({"CustomViewStyleable"})
    private void a(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            int[] r0 = com.kwad.sdk.R.styleable.ksad_KSCouponLabelTextView
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            android.content.res.Resources r3 = r3.getResources()
            int r5 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r3 = r3.getColor(r5)
            int r5 = com.kwad.sdk.R.styleable.ksad_KSCouponLabelTextView_ksad_labelRadius
            r0 = 1090519040(0x41000000, float:8.0)
            float r5 = r4.getDimension(r5, r0)
            r2.DH = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KSCouponLabelTextView_ksad_strokeSize
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r4.getDimension(r5, r0)
            r2.DI = r5
            int r5 = com.kwad.sdk.R.styleable.ksad_KSCouponLabelTextView_ksad_strokeColor
            int r3 = r4.getColor(r5, r3)
            r2.strokeColor = r3
            int r3 = com.kwad.sdk.R.styleable.ksad_KSCouponLabelTextView_ksad_sideRadius
            r5 = 1098907648(0x41800000, float:16.0)
            float r3 = r4.getDimension(r3, r5)
            r2.DJ = r3
            r4.recycle()
            r2.lm()
            return
    }

    @androidx.annotation.RequiresApi(api = 19)
    private void a(android.graphics.Path r3, android.graphics.Path r4, android.graphics.Path r5, android.graphics.RectF r6, android.graphics.RectF r7, android.graphics.RectF r8) {
            r2 = this;
            r3.reset()
            float r0 = r2.DH
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r6, r0, r0, r1)
            r6 = -1020002304(0xffffffffc3340000, float:-180.0)
            r0 = 1119092736(0x42b40000, float:90.0)
            r4.addArc(r7, r0, r6)
            r4 = 1127481344(0x43340000, float:180.0)
            r5.addArc(r8, r0, r4)
            android.graphics.Path r4 = r2.DN
            android.graphics.Path$Op r5 = android.graphics.Path.Op.DIFFERENCE
            r3.op(r4, r5)
            android.graphics.Path r4 = r2.DO
            r3.op(r4, r5)
            return
    }

    private void a(android.graphics.RectF r4, android.graphics.RectF r5) {
            r3 = this;
            r5.set(r4)
            float r0 = r5.left
            float r1 = r3.DJ
            float r0 = r0 - r1
            r5.left = r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 + r1
            r5.right = r0
            float r4 = r4.height()
            float r0 = r3.DJ
            float r1 = r0 * r2
            float r4 = r4 - r1
            float r4 = r4 / r2
            float r1 = r5.top
            float r1 = r1 + r4
            r5.top = r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r5.bottom = r1
            return
    }

    private void b(android.graphics.Path r7, android.graphics.RectF r8, android.graphics.RectF r9, android.graphics.RectF r10) {
            r6 = this;
            r7.reset()
            float r0 = r8.left
            float r1 = r8.top
            float r2 = r6.DH
            float r1 = r1 + r2
            r7.moveTo(r0, r1)
            android.graphics.RectF r0 = r6.DF
            r0.set(r8)
            android.graphics.RectF r0 = r6.DF
            float r1 = r0.top
            float r2 = r6.DH
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 * r3
            float r1 = r1 + r4
            r0.bottom = r1
            float r1 = r0.left
            float r2 = r2 * r3
            float r1 = r1 + r2
            r0.right = r1
            r1 = 1127481344(0x43340000, float:180.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r7.arcTo(r0, r1, r2)
            float r0 = r8.width()
            float r1 = r6.DH
            float r0 = r0 - r1
            float r1 = r8.top
            r7.lineTo(r0, r1)
            android.graphics.RectF r0 = r6.DF
            r0.set(r8)
            android.graphics.RectF r0 = r6.DF
            float r1 = r0.right
            float r4 = r6.DH
            float r5 = r4 * r3
            float r1 = r1 - r5
            r0.left = r1
            float r1 = r0.top
            float r4 = r4 * r3
            float r1 = r1 + r4
            r0.bottom = r1
            r1 = 1132920832(0x43870000, float:270.0)
            r7.arcTo(r0, r1, r2)
            float r0 = r8.right
            float r4 = r10.top
            r7.lineTo(r0, r4)
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            r7.arcTo(r10, r1, r0)
            float r10 = r8.right
            float r1 = r8.bottom
            float r4 = r6.DH
            float r1 = r1 - r4
            r7.lineTo(r10, r1)
            android.graphics.RectF r10 = r6.DF
            r10.set(r8)
            android.graphics.RectF r10 = r6.DF
            float r1 = r10.right
            float r4 = r6.DH
            float r5 = r4 * r3
            float r1 = r1 - r5
            r10.left = r1
            float r1 = r10.bottom
            float r4 = r4 * r3
            float r1 = r1 - r4
            r10.top = r1
            r1 = 0
            r7.arcTo(r10, r1, r2)
            float r10 = r8.left
            float r1 = r6.DH
            float r10 = r10 + r1
            float r1 = r8.bottom
            r7.lineTo(r10, r1)
            android.graphics.RectF r10 = r6.DF
            r10.set(r8)
            android.graphics.RectF r10 = r6.DF
            float r1 = r10.left
            float r4 = r6.DH
            float r5 = r4 * r3
            float r1 = r1 + r5
            r10.right = r1
            float r1 = r10.bottom
            float r4 = r4 * r3
            float r1 = r1 - r4
            r10.top = r1
            r7.arcTo(r10, r2, r2)
            float r8 = r8.left
            float r10 = r9.bottom
            r7.lineTo(r8, r10)
            r7.arcTo(r9, r2, r0)
            r7.close()
            return
    }

    private void b(android.graphics.RectF r4, android.graphics.RectF r5) {
            r3 = this;
            r5.set(r4)
            float r0 = r5.right
            float r1 = r3.DJ
            float r0 = r0 + r1
            r5.right = r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            r5.left = r0
            float r4 = r4.height()
            float r0 = r3.DJ
            float r1 = r0 * r2
            float r4 = r4 - r1
            float r4 = r4 / r2
            float r1 = r5.top
            float r1 = r1 + r4
            r5.top = r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r5.bottom = r1
            return
    }

    private void lm() {
            r2 = this;
            android.graphics.Paint r0 = r2.mPaint
            int r1 = r2.strokeColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.mPaint
            float r1 = r2.DI
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.mPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.mPaint
            r1 = 1
            r0.setAntiAlias(r1)
            return
    }

    @Override // com.kwad.components.core.widget.d
    public final void a(com.kwad.components.core.widget.e r2) {
            r1 = this;
            android.content.res.Resources r2 = r1.getResources()
            int r0 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r2 = r2.getColor(r0)
            r1.strokeColor = r2
            r1.setTextColor(r2)
            r1.lm()
            r1.invalidate()
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            super.onDraw(r9)
            android.graphics.Rect r0 = r8.DB
            r0.setEmpty()
            android.graphics.Rect r0 = r8.DB
            r8.getDrawingRect(r0)
            float r0 = r8.DI
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.RectF r1 = r8.DC
            android.graphics.Rect r2 = r8.DB
            r1.set(r2)
            android.graphics.RectF r1 = r8.DC
            float r2 = r1.left
            float r2 = r2 + r0
            r1.left = r2
            float r2 = r1.top
            float r2 = r2 + r0
            r1.top = r2
            float r2 = r1.right
            float r2 = r2 - r0
            r1.right = r2
            float r2 = r1.bottom
            float r2 = r2 - r0
            r1.bottom = r2
            android.graphics.RectF r0 = r8.DK
            r8.a(r1, r0)
            android.graphics.RectF r0 = r8.DC
            android.graphics.RectF r1 = r8.DL
            r8.b(r0, r1)
            android.graphics.Path r0 = r8.DN
            if (r0 != 0) goto L47
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r8.DN = r0
            goto L4a
        L47:
            r0.reset()
        L4a:
            android.graphics.Path r0 = r8.DO
            if (r0 != 0) goto L56
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r8.DO = r0
            goto L59
        L56:
            r0.reset()
        L59:
            android.graphics.Path r2 = r8.DM
            android.graphics.Path r3 = r8.DN
            android.graphics.Path r4 = r8.DO
            android.graphics.RectF r5 = r8.DC
            android.graphics.RectF r6 = r8.DK
            android.graphics.RectF r7 = r8.DL
            r1 = r8
            r1.a(r2, r3, r4, r5, r6, r7)
            android.graphics.Path r0 = r1.DM
            android.graphics.Paint r2 = r1.mPaint
            r9.drawPath(r0, r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            boolean r3 = r2.DP
            if (r3 == 0) goto L31
            int r3 = r2.getMeasuredWidth()
            android.text.TextPaint r4 = r2.getPaint()
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            float r4 = r4.measureText(r0)
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            float r0 = (float) r0
            float r0 = r0 + r4
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L2c
            return
        L2c:
            r3 = 8
            r2.setVisibility(r3)
        L31:
            return
    }
}

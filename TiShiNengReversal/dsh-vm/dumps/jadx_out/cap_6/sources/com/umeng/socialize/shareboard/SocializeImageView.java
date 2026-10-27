package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeImageView extends android.widget.ImageButton {
    public static int BG_SHAPE_CIRCULAR = 1;
    public static int BG_SHAPE_NONE = 0;
    public static int BG_SHAPE_ROUNDED_SQUARE = 2;
    private int mAngle;
    private int mBgShape;
    private int mIconPressedColor;
    private boolean mIsPressEffect;
    private boolean mIsSelected;
    private int mNormalColor;
    protected android.graphics.Paint mNormalPaint;
    private int mPressedColor;
    protected android.graphics.Paint mPressedPaint;
    private android.graphics.RectF mSquareRect;

    static {
            return
    }

    public SocializeImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.init()
            return
    }

    public SocializeImageView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.init()
            return
    }

    public SocializeImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.init()
            return
    }

    @android.annotation.TargetApi(21)
    public SocializeImageView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.init()
            return
    }

    private void drawCircle(android.graphics.Canvas r2, android.graphics.Paint r3) {
            r1 = this;
            int r0 = r1.getMeasuredWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            r2.drawCircle(r0, r0, r0, r3)
            return
    }

    private void drawRect(android.graphics.Canvas r4, android.graphics.Paint r5) {
            r3 = this;
            android.graphics.RectF r0 = r3.mSquareRect
            if (r0 != 0) goto L20
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.mSquareRect = r0
            r1 = 0
            r0.left = r1
            r0.top = r1
            int r1 = r3.getMeasuredWidth()
            float r1 = (float) r1
            r0.right = r1
            android.graphics.RectF r0 = r3.mSquareRect
            int r1 = r3.getMeasuredWidth()
            float r1 = (float) r1
            r0.bottom = r1
        L20:
            android.graphics.RectF r0 = r3.mSquareRect
            int r1 = r3.mAngle
            float r2 = (float) r1
            float r1 = (float) r1
            r4.drawRoundRect(r0, r2, r1, r5)
            return
    }

    private void init() {
            r1 = this;
            r0 = 0
            r1.setBackground(r0)
            r0 = 0
            r1.setClickable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r0)
            return
    }

    protected int dip2px(float r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            boolean r0 = r2.mIsPressEffect
            if (r0 != 0) goto L8
            goto L1d
        L8:
            boolean r0 = r2.isPressed()
            if (r0 == 0) goto L25
            int r0 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_NONE
            int r1 = r2.mBgShape
            if (r0 != r1) goto L1e
            int r0 = r2.mIconPressedColor
            if (r0 == 0) goto L1d
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r0, r1)
        L1d:
            return
        L1e:
            r0 = 1
            r2.mIsSelected = r0
            r2.invalidate()
            return
        L25:
            int r0 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_NONE
            int r1 = r2.mBgShape
            if (r0 != r1) goto L2f
            r2.clearColorFilter()
            return
        L2f:
            r0 = 0
            r2.mIsSelected = r0
            r2.invalidate()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            int r0 = r3.mBgShape
            int r1 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_NONE
            if (r0 != r1) goto La
            super.onDraw(r4)
            return
        La:
            boolean r1 = r3.mIsSelected
            if (r1 == 0) goto L26
            boolean r1 = r3.mIsPressEffect
            if (r1 == 0) goto L39
            android.graphics.Paint r1 = r3.mPressedPaint
            if (r1 == 0) goto L39
            int r2 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_CIRCULAR
            if (r0 != r2) goto L1e
            r3.drawCircle(r4, r1)
            goto L39
        L1e:
            int r2 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_ROUNDED_SQUARE
            if (r0 != r2) goto L39
            r3.drawRect(r4, r1)
            goto L39
        L26:
            int r1 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_CIRCULAR
            if (r0 != r1) goto L30
            android.graphics.Paint r0 = r3.mNormalPaint
            r3.drawCircle(r4, r0)
            goto L39
        L30:
            int r1 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_ROUNDED_SQUARE
            if (r0 != r1) goto L39
            android.graphics.Paint r0 = r3.mNormalPaint
            r3.drawRect(r4, r0)
        L39:
            super.onDraw(r4)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            r0 = 0
            r1.setBackgroundColor(r2, r0)
            return
    }

    public void setBackgroundColor(int r4, int r5) {
            r3 = this;
            r3.mNormalColor = r4
            r3.mPressedColor = r5
            r0 = 1
            if (r5 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            r3.setPressEffectEnable(r1)
            int r1 = r3.mNormalColor
            if (r1 == 0) goto L27
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r3.mNormalPaint = r1
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r3.mNormalPaint
            r1.setAntiAlias(r0)
            android.graphics.Paint r1 = r3.mNormalPaint
            r1.setColor(r4)
        L27:
            int r4 = r3.mPressedColor
            if (r4 == 0) goto L41
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.mPressedPaint = r4
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r4.setStyle(r1)
            android.graphics.Paint r4 = r3.mPressedPaint
            r4.setAntiAlias(r0)
            android.graphics.Paint r4 = r3.mPressedPaint
            r4.setColor(r5)
        L41:
            return
    }

    public void setBackgroundShape(int r2) {
            r1 = this;
            r0 = 0
            r1.setBackgroundShape(r2, r0)
            return
    }

    public void setBackgroundShape(int r2, int r3) {
            r1 = this;
            r1.mBgShape = r2
            int r0 = com.umeng.socialize.shareboard.SocializeImageView.BG_SHAPE_ROUNDED_SQUARE
            if (r2 == r0) goto La
            r2 = 0
            r1.mAngle = r2
            return
        La:
            android.content.res.Resources r2 = r1.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            r1.mAngle = r2
            return
    }

    public void setPressEffectEnable(boolean r1) {
            r0 = this;
            r0.mIsPressEffect = r1
            return
    }

    public void setPressedColor(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.setPressEffectEnable(r0)
            r1.mIconPressedColor = r2
            return
    }
}

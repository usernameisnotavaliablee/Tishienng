package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RoundedBitmapDrawable extends android.graphics.drawable.Drawable {
    private static final int DEFAULT_PAINT_FLAGS = 3;
    private boolean mApplyGravity;
    final android.graphics.Bitmap mBitmap;
    private int mBitmapHeight;
    private final android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private float mCornerRadius;
    final android.graphics.Rect mDstRect;
    private final android.graphics.RectF mDstRectF;
    private int mGravity;
    private boolean mIsCircular;
    private final android.graphics.Paint mPaint;
    private final android.graphics.Matrix mShaderMatrix;
    private int mTargetDensity;

    RoundedBitmapDrawable(android.content.res.Resources r3, android.graphics.Bitmap r4) {
            r2 = this;
            r2.<init>()
            r0 = 160(0xa0, float:2.24E-43)
            r2.mTargetDensity = r0
            r0 = 119(0x77, float:1.67E-43)
            r2.mGravity = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r2.mPaint = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mShaderMatrix = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mDstRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.mDstRectF = r0
            r0 = 1
            r2.mApplyGravity = r0
            if (r3 == 0) goto L35
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.densityDpi
            r2.mTargetDensity = r3
        L35:
            r2.mBitmap = r4
            if (r4 == 0) goto L46
            r2.computeBitmapSize()
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r4, r0, r0)
            r2.mBitmapShader = r3
            return
        L46:
            r3 = -1
            r2.mBitmapHeight = r3
            r2.mBitmapWidth = r3
            r3 = 0
            r2.mBitmapShader = r3
            return
    }

    private void computeBitmapSize() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.mBitmap
            int r1 = r2.mTargetDensity
            int r0 = r0.getScaledWidth(r1)
            r2.mBitmapWidth = r0
            android.graphics.Bitmap r0 = r2.mBitmap
            int r1 = r2.mTargetDensity
            int r0 = r0.getScaledHeight(r1)
            r2.mBitmapHeight = r0
            return
    }

    private static boolean isGreaterThanZero(float r1) {
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    private void updateCircularCornerRadius() {
            r2 = this;
            int r0 = r2.mBitmapHeight
            int r1 = r2.mBitmapWidth
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 / 2
            float r0 = (float) r0
            r2.mCornerRadius = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Bitmap r0 = r4.mBitmap
            if (r0 != 0) goto L5
            return
        L5:
            r4.updateDstRect()
            android.graphics.Paint r1 = r4.mPaint
            android.graphics.Shader r1 = r1.getShader()
            if (r1 != 0) goto L19
            android.graphics.Rect r1 = r4.mDstRect
            android.graphics.Paint r2 = r4.mPaint
            r3 = 0
            r5.drawBitmap(r0, r3, r1, r2)
            return
        L19:
            android.graphics.RectF r0 = r4.mDstRectF
            float r1 = r4.mCornerRadius
            android.graphics.Paint r2 = r4.mPaint
            r5.drawRoundRect(r0, r1, r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            return r0
    }

    @androidx.annotation.Nullable
    public final android.graphics.Bitmap getBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mBitmap
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.mCornerRadius
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mBitmapHeight
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mBitmapWidth
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r3 = this;
            int r0 = r3.mGravity
            r1 = 119(0x77, float:1.67E-43)
            r2 = -3
            if (r0 != r1) goto L2b
            boolean r0 = r3.mIsCircular
            if (r0 == 0) goto Lc
            goto L2b
        Lc:
            android.graphics.Bitmap r0 = r3.mBitmap
            if (r0 == 0) goto L2b
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L2b
            android.graphics.Paint r0 = r3.mPaint
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 < r1) goto L2b
            float r0 = r3.mCornerRadius
            boolean r0 = isGreaterThanZero(r0)
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = -1
            return r0
        L2b:
            return r2
    }

    @androidx.annotation.NonNull
    public final android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    void gravityCompatApply(int r1, int r2, int r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public boolean hasAntiAlias() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            boolean r0 = r0.isAntiAlias()
            return r0
    }

    public boolean hasMipMap() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean isCircular() {
            r1 = this;
            boolean r0 = r1.mIsCircular
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            boolean r1 = r0.mIsCircular
            if (r1 == 0) goto La
            r0.updateCircularCornerRadius()
        La:
            r1 = 1
            r0.mApplyGravity = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    public void setAntiAlias(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setAntiAlias(r2)
            r1.invalidateSelf()
            return
    }

    public void setCircular(boolean r2) {
            r1 = this;
            r1.mIsCircular = r2
            r0 = 1
            r1.mApplyGravity = r0
            if (r2 == 0) goto L15
            r1.updateCircularCornerRadius()
            android.graphics.Paint r2 = r1.mPaint
            android.graphics.BitmapShader r0 = r1.mBitmapShader
            r2.setShader(r0)
            r1.invalidateSelf()
            return
        L15:
            r2 = 0
            r1.setCornerRadius(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setCornerRadius(float r3) {
            r2 = this;
            float r0 = r2.mCornerRadius
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r2.mIsCircular = r0
            boolean r0 = isGreaterThanZero(r3)
            if (r0 == 0) goto L18
            android.graphics.Paint r0 = r2.mPaint
            android.graphics.BitmapShader r1 = r2.mBitmapShader
            r0.setShader(r1)
            goto L1e
        L18:
            android.graphics.Paint r0 = r2.mPaint
            r1 = 0
            r0.setShader(r1)
        L1e:
            r2.mCornerRadius = r3
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto Lc
            r1.mGravity = r2
            r2 = 1
            r1.mApplyGravity = r2
            r1.invalidateSelf()
        Lc:
            return
    }

    public void setMipMap(boolean r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void setTargetDensity(int r2) {
            r1 = this;
            int r0 = r1.mTargetDensity
            if (r0 == r2) goto L14
            if (r2 != 0) goto L8
            r2 = 160(0xa0, float:2.24E-43)
        L8:
            r1.mTargetDensity = r2
            android.graphics.Bitmap r2 = r1.mBitmap
            if (r2 == 0) goto L11
            r1.computeBitmapSize()
        L11:
            r1.invalidateSelf()
        L14:
            return
    }

    public void setTargetDensity(@androidx.annotation.NonNull android.graphics.Canvas r1) {
            r0 = this;
            int r1 = r1.getDensity()
            r0.setTargetDensity(r1)
            return
    }

    public void setTargetDensity(@androidx.annotation.NonNull android.util.DisplayMetrics r1) {
            r0 = this;
            int r1 = r1.densityDpi
            r0.setTargetDensity(r1)
            return
    }

    void updateDstRect() {
            r15 = this;
            boolean r0 = r15.mApplyGravity
            if (r0 == 0) goto Lae
            boolean r0 = r15.mIsCircular
            r1 = 0
            if (r0 == 0) goto L55
            int r0 = r15.mBitmapWidth
            int r2 = r15.mBitmapHeight
            int r5 = java.lang.Math.min(r0, r2)
            int r4 = r15.mGravity
            android.graphics.Rect r7 = r15.getBounds()
            android.graphics.Rect r8 = r15.mDstRect
            r6 = r5
            r3 = r15
            r3.gravityCompatApply(r4, r5, r6, r7, r8)
            android.graphics.Rect r0 = r3.mDstRect
            int r0 = r0.width()
            android.graphics.Rect r2 = r3.mDstRect
            int r2 = r2.height()
            int r0 = java.lang.Math.min(r0, r2)
            android.graphics.Rect r2 = r3.mDstRect
            int r2 = r2.width()
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r2 = java.lang.Math.max(r1, r2)
            android.graphics.Rect r4 = r3.mDstRect
            int r4 = r4.height()
            int r4 = r4 - r0
            int r4 = r4 / 2
            int r4 = java.lang.Math.max(r1, r4)
            android.graphics.Rect r5 = r3.mDstRect
            r5.inset(r2, r4)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = (float) r0
            float r0 = r0 * r2
            r3.mCornerRadius = r0
            goto L66
        L55:
            r3 = r15
            int r10 = r3.mGravity
            int r11 = r3.mBitmapWidth
            int r12 = r3.mBitmapHeight
            android.graphics.Rect r13 = r15.getBounds()
            android.graphics.Rect r14 = r3.mDstRect
            r9 = r3
            r9.gravityCompatApply(r10, r11, r12, r13, r14)
        L66:
            android.graphics.RectF r0 = r3.mDstRectF
            android.graphics.Rect r2 = r3.mDstRect
            r0.set(r2)
            android.graphics.BitmapShader r0 = r3.mBitmapShader
            if (r0 == 0) goto Lab
            android.graphics.Matrix r0 = r3.mShaderMatrix
            android.graphics.RectF r2 = r3.mDstRectF
            float r4 = r2.left
            float r2 = r2.top
            r0.setTranslate(r4, r2)
            android.graphics.Matrix r0 = r3.mShaderMatrix
            android.graphics.RectF r2 = r3.mDstRectF
            float r2 = r2.width()
            android.graphics.Bitmap r4 = r3.mBitmap
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            android.graphics.RectF r4 = r3.mDstRectF
            float r4 = r4.height()
            android.graphics.Bitmap r5 = r3.mBitmap
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            r0.preScale(r2, r4)
            android.graphics.BitmapShader r0 = r3.mBitmapShader
            android.graphics.Matrix r2 = r3.mShaderMatrix
            r0.setLocalMatrix(r2)
            android.graphics.Paint r0 = r3.mPaint
            android.graphics.BitmapShader r2 = r3.mBitmapShader
            r0.setShader(r2)
        Lab:
            r3.mApplyGravity = r1
            return
        Lae:
            r3 = r15
            return
    }
}

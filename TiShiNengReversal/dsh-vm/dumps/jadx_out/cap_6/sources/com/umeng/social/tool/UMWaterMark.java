package com.umeng.social.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class UMWaterMark {
    static final int RELATIVE_POSITION_HORIZONTAL_LEFT = 4;
    static final int RELATIVE_POSITION_HORIZONTAL_RIGHT = 3;
    static final int RELATIVE_POSITION_VERTICAL_BOTTOM = 1;
    static final int RELATIVE_POSITION_VERTICAL_TOP = 2;
    private static final java.lang.String TAG = "UMWaterMark";
    private float mAlpha;
    private android.graphics.Rect mAnchorMarkRect;
    private int mBottomMargin;
    private android.content.Context mContext;
    private int mDegree;
    private int mGravity;
    private int mHorizontalRelativePosition;
    private boolean mIsBringToFront;
    private boolean mIsTransparent;
    private int mLeftMargin;
    private android.graphics.Rect mMeasureRect;
    private int mRightMargin;
    private float mScale;
    private int mTopMargin;
    private int mVerticalRelativePosition;

    static {
            return
    }

    UMWaterMark() {
            r2 = this;
            r2.<init>()
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.mScale = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mAnchorMarkRect = r0
            r0 = -1
            r2.mVerticalRelativePosition = r0
            r2.mHorizontalRelativePosition = r0
            r1 = 51
            r2.mGravity = r1
            r1 = 0
            r2.mIsTransparent = r1
            r2.mIsBringToFront = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAlpha = r1
            r2.mDegree = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mMeasureRect = r0
            return
    }

    private float getDx(int r5) {
            r4 = this;
            int r0 = r4.mLeftMargin
            float r0 = (float) r0
            int r0 = r4.dip2px(r0)
            int r1 = r4.mRightMargin
            float r1 = (float) r1
            int r1 = r4.dip2px(r1)
            int r1 = -r1
            int r2 = r4.mGravity
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L23
            r3 = 5
            if (r2 == r3) goto L1b
            float r5 = (float) r0
            return r5
        L1b:
            int r0 = r4.getMarkWidth()
            int r5 = r5 - r0
            int r5 = r5 + r1
            float r5 = (float) r5
            return r5
        L23:
            if (r0 == 0) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            int r1 = r4.getMarkWidth()
            int r5 = r5 - r1
            float r5 = (float) r5
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            float r0 = (float) r0
            float r5 = r5 + r0
            return r5
    }

    private float getDy(int r5) {
            r4 = this;
            int r0 = r4.mBottomMargin
            float r0 = (float) r0
            int r0 = r4.dip2px(r0)
            int r0 = -r0
            int r1 = r4.mTopMargin
            float r1 = (float) r1
            int r1 = r4.dip2px(r1)
            int r2 = r4.mGravity
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 16
            if (r2 == r3) goto L25
            r3 = 80
            if (r2 == r3) goto L1d
            float r5 = (float) r1
            return r5
        L1d:
            int r1 = r4.getMarkHeight()
            int r5 = r5 - r1
            int r5 = r5 + r0
            float r5 = (float) r5
            return r5
        L25:
            if (r1 == 0) goto L28
            r0 = r1
        L28:
            int r1 = r4.getMarkHeight()
            int r5 = r5 - r1
            float r5 = (float) r5
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            float r0 = (float) r0
            float r5 = r5 + r0
            return r5
    }

    private int getMarkHeight() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.getMarkBitmap()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            android.graphics.Bitmap r0 = r1.getMarkBitmap()
            int r0 = r0.getHeight()
            return r0
    }

    private int getMarkWidth() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.getMarkBitmap()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            android.graphics.Bitmap r0 = r1.getMarkBitmap()
            int r0 = r0.getWidth()
            return r0
    }

    private float getRelativeDx(int r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.mAnchorMarkRect
            int r1 = r0.left
            float r1 = (float) r1
            int r0 = r0.right
            float r0 = (float) r0
            int r2 = r4.mHorizontalRelativePosition
            r3 = 3
            if (r2 == r3) goto L26
            r0 = 4
            if (r2 == r0) goto L15
            float r5 = r4.getDx(r5)
            return r5
        L15:
            int r5 = r4.mRightMargin
            float r5 = (float) r5
            int r5 = r4.dip2px(r5)
            int r5 = -r5
            int r0 = r4.getMarkWidth()
            float r0 = (float) r0
            float r1 = r1 - r0
            float r5 = (float) r5
            float r1 = r1 + r5
            return r1
        L26:
            int r5 = r4.mLeftMargin
            float r5 = (float) r5
            int r5 = r4.dip2px(r5)
            float r5 = (float) r5
            float r0 = r0 + r5
            return r0
    }

    private float getRelativeDy(int r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.mAnchorMarkRect
            int r1 = r0.top
            float r1 = (float) r1
            int r0 = r0.bottom
            float r0 = (float) r0
            int r2 = r4.mVerticalRelativePosition
            r3 = 1
            if (r2 == r3) goto L26
            r0 = 2
            if (r2 == r0) goto L15
            float r5 = r4.getDy(r5)
            return r5
        L15:
            int r5 = r4.mBottomMargin
            float r5 = (float) r5
            int r5 = r4.dip2px(r5)
            int r5 = -r5
            int r0 = r4.getMarkHeight()
            float r0 = (float) r0
            float r1 = r1 - r0
            float r5 = (float) r5
            float r1 = r1 + r5
            return r1
        L26:
            int r5 = r4.mTopMargin
            float r5 = (float) r5
            int r5 = r4.dip2px(r5)
            float r5 = (float) r5
            float r0 = r0 + r5
            return r0
    }

    private float getScaleAnchorX(int r3) {
            r2 = this;
            int r0 = r2.mGravity
            r0 = r0 & 7
            r1 = 1
            if (r0 == r1) goto Le
            r1 = 5
            if (r0 == r1) goto Lc
            r3 = 0
            return r3
        Lc:
            float r3 = (float) r3
            return r3
        Le:
            int r3 = r3 / 2
            float r3 = (float) r3
            return r3
    }

    private float getScaleAnchorY(int r3) {
            r2 = this;
            int r0 = r2.mGravity
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 16
            if (r0 == r1) goto L10
            r1 = 80
            if (r0 == r1) goto Le
            r3 = 0
            return r3
        Le:
            float r3 = (float) r3
            return r3
        L10:
            int r3 = r3 / 2
            float r3 = (float) r3
            return r3
    }

    private void safelyRecycleBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isRecycled()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto Lb
            r2.recycle()     // Catch: java.lang.Exception -> Lb
        Lb:
            return
    }

    public void bringToFront() {
            r1 = this;
            r0 = 1
            r1.mIsBringToFront = r0
            return
    }

    void clearRelativePosition() {
            r1 = this;
            r0 = -1
            r1.mHorizontalRelativePosition = r0
            r1.mVerticalRelativePosition = r0
            return
    }

    public android.graphics.Bitmap compound(android.graphics.Bitmap r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            android.graphics.Bitmap r1 = r12.getMarkBitmap()     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto Lb
            return r13
        Lb:
            int r2 = r13.getWidth()     // Catch: java.lang.Throwable -> Lca
            int r3 = r13.getHeight()     // Catch: java.lang.Throwable -> Lca
            if (r2 <= 0) goto Lc9
            if (r3 > 0) goto L19
            goto Lc9
        L19:
            int r4 = r12.getMarkWidth()     // Catch: java.lang.Throwable -> Lca
            int r5 = r12.getMarkHeight()     // Catch: java.lang.Throwable -> Lca
            if (r4 <= 0) goto Lc9
            if (r5 > 0) goto L27
            goto Lc9
        L27:
            boolean r6 = r12.mIsTransparent     // Catch: java.lang.Throwable -> Lca
            if (r6 == 0) goto L3b
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lca
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r2, r3, r6)     // Catch: java.lang.Throwable -> Lca
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lca
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lca
            r8 = 0
            r7.drawColor(r8)     // Catch: java.lang.Throwable -> Lca
            goto L46
        L3b:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> Lca
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r2, r3, r6)     // Catch: java.lang.Throwable -> Lca
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lca
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lca
        L46:
            r8 = 0
            r7.drawBitmap(r13, r8, r8, r0)     // Catch: java.lang.Throwable -> Lca
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> Lca
            r8.<init>()     // Catch: java.lang.Throwable -> Lca
            int r9 = r13.getWidth()     // Catch: java.lang.Throwable -> Lca
            int r10 = r13.getHeight()     // Catch: java.lang.Throwable -> Lca
            int r9 = java.lang.Math.min(r9, r10)     // Catch: java.lang.Throwable -> Lca
            int r10 = java.lang.Math.max(r4, r5)     // Catch: java.lang.Throwable -> Lca
            float r11 = r12.mScale     // Catch: java.lang.Throwable -> Lca
            float r9 = (float) r9     // Catch: java.lang.Throwable -> Lca
            float r11 = r11 * r9
            float r9 = (float) r10     // Catch: java.lang.Throwable -> Lca
            float r11 = r11 / r9
            float r9 = r12.getScaleAnchorX(r4)     // Catch: java.lang.Throwable -> Lca
            float r10 = r12.getScaleAnchorY(r5)     // Catch: java.lang.Throwable -> Lca
            r8.postScale(r11, r11, r9, r10)     // Catch: java.lang.Throwable -> Lca
            int r9 = r12.mDegree     // Catch: java.lang.Throwable -> Lca
            r10 = -1
            if (r9 == r10) goto L80
            float r9 = (float) r9     // Catch: java.lang.Throwable -> Lca
            int r4 = r4 / 2
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lca
            int r5 = r5 / 2
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Lca
            r8.postRotate(r9, r4, r5)     // Catch: java.lang.Throwable -> Lca
        L80:
            boolean r4 = r12.isHorizontalRelativePosition()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L8b
            float r2 = r12.getRelativeDx(r2)     // Catch: java.lang.Throwable -> Lca
            goto L8f
        L8b:
            float r2 = r12.getDx(r2)     // Catch: java.lang.Throwable -> Lca
        L8f:
            boolean r4 = r12.isVerticalRelativePosition()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L9a
            float r3 = r12.getRelativeDy(r3)     // Catch: java.lang.Throwable -> Lca
            goto L9e
        L9a:
            float r3 = r12.getDy(r3)     // Catch: java.lang.Throwable -> Lca
        L9e:
            r8.postTranslate(r2, r3)     // Catch: java.lang.Throwable -> Lca
            float r2 = r12.mAlpha     // Catch: java.lang.Throwable -> Lca
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto Lbc
            android.graphics.Paint r2 = new android.graphics.Paint     // Catch: java.lang.Throwable -> Lca
            r2.<init>()     // Catch: java.lang.Throwable -> Lca
            float r3 = r12.mAlpha     // Catch: java.lang.Throwable -> Lca
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lca
            r2.setAlpha(r3)     // Catch: java.lang.Throwable -> Lca
            r7.drawBitmap(r1, r8, r2)     // Catch: java.lang.Throwable -> Lca
            goto Lbf
        Lbc:
            r7.drawBitmap(r1, r8, r0)     // Catch: java.lang.Throwable -> Lca
        Lbf:
            r12.safelyRecycleBitmap(r13)     // Catch: java.lang.Throwable -> Lca
            r12.safelyRecycleBitmap(r1)     // Catch: java.lang.Throwable -> Lca
            r12.releaseResource()     // Catch: java.lang.Throwable -> Lca
            return r6
        Lc9:
            return r13
        Lca:
            return r0
    }

    int dip2px(float r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    android.graphics.Bitmap getMarkBitmap() {
            r1 = this;
            r0 = 0
            return r0
    }

    boolean isBringToFront() {
            r1 = this;
            boolean r0 = r1.mIsBringToFront
            return r0
    }

    boolean isHorizontalRelativePosition() {
            r2 = this;
            int r0 = r2.mHorizontalRelativePosition
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    boolean isVerticalRelativePosition() {
            r2 = this;
            int r0 = r2.mVerticalRelativePosition
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    android.graphics.Rect onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.isHorizontalRelativePosition()
            r1 = 0
            if (r0 != 0) goto L12
            float r4 = r3.getDx(r4)
            int r4 = (int) r4
            int r0 = r3.getMarkWidth()
            int r0 = r0 + r4
            goto L14
        L12:
            r4 = 0
            r0 = 0
        L14:
            boolean r2 = r3.isVerticalRelativePosition()
            if (r2 != 0) goto L25
            float r5 = r3.getDy(r5)
            int r1 = (int) r5
            int r5 = r3.getMarkHeight()
            int r5 = r5 + r1
            goto L26
        L25:
            r5 = 0
        L26:
            android.graphics.Rect r2 = r3.mMeasureRect
            r2.set(r4, r1, r0, r5)
            android.graphics.Rect r4 = r3.mMeasureRect
            return r4
    }

    void releaseResource() {
            r0 = this;
            return
    }

    public void setAlpha(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc
            goto Le
        Lc:
            r1.mAlpha = r2
        Le:
            return
    }

    void setAnchorMarkHorizontalRect(android.graphics.Rect r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.mAnchorMarkRect
            int r1 = r0.top
            int r2 = r0.bottom
            int r3 = r5.left
            int r5 = r5.right
            r0.set(r3, r1, r5, r2)
            return
    }

    void setAnchorMarkVerticalRect(android.graphics.Rect r5) {
            r4 = this;
            r4.mAnchorMarkRect = r5
            int r0 = r5.left
            int r1 = r5.right
            int r2 = r5.top
            int r3 = r5.bottom
            r5.set(r0, r2, r1, r3)
            return
    }

    public void setContext(android.content.Context r1) {
            r0 = this;
            r0.mContext = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            goto L9
        L3:
            int r0 = r1.mGravity
            if (r0 == r2) goto L9
            r1.mGravity = r2
        L9:
            return
    }

    void setHorizontalRelativePosition(int r1) {
            r0 = this;
            r0.mHorizontalRelativePosition = r1
            return
    }

    public void setMargins(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mLeftMargin = r1
            r0.mTopMargin = r2
            r0.mRightMargin = r3
            r0.mBottomMargin = r4
            return
    }

    public void setRotate(int r2) {
            r1 = this;
            if (r2 < 0) goto L9
            r0 = 360(0x168, float:5.04E-43)
            if (r2 <= r0) goto L7
            goto L9
        L7:
            r1.mDegree = r2
        L9:
            return
    }

    public void setScale(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc
            goto Le
        Lc:
            r1.mScale = r2
        Le:
            return
    }

    public void setTransparent() {
            r1 = this;
            r0 = 1
            r1.mIsTransparent = r0
            return
    }

    void setVerticalRelativePosition(int r1) {
            r0 = this;
            r0.mVerticalRelativePosition = r1
            return
    }
}

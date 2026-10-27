package com.github.mikephil.charting.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ViewPortHandler {
    protected android.graphics.Matrix mCenterViewPortMatrixBuffer;
    protected float mChartHeight;
    protected float mChartWidth;
    protected android.graphics.RectF mContentRect;
    protected final android.graphics.Matrix mMatrixTouch;
    private float mMaxScaleX;
    private float mMaxScaleY;
    private float mMinScaleX;
    private float mMinScaleY;
    private float mScaleX;
    private float mScaleY;
    private float mTransOffsetX;
    private float mTransOffsetY;
    private float mTransX;
    private float mTransY;
    protected final float[] matrixBuffer;
    protected float[] valsBufferForFitScreen;

    public ViewPortHandler() {
            r3 = this;
            r3.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.mMatrixTouch = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.mContentRect = r0
            r0 = 0
            r3.mChartWidth = r0
            r3.mChartHeight = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.mMinScaleY = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.mMaxScaleY = r2
            r3.mMinScaleX = r1
            r3.mMaxScaleX = r2
            r3.mScaleX = r1
            r3.mScaleY = r1
            r3.mTransX = r0
            r3.mTransY = r0
            r3.mTransOffsetX = r0
            r3.mTransOffsetY = r0
            r0 = 9
            float[] r1 = new float[r0]
            r3.valsBufferForFitScreen = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3.mCenterViewPortMatrixBuffer = r1
            float[] r0 = new float[r0]
            r3.matrixBuffer = r0
            return
    }

    public boolean canZoomInMoreX() {
            r2 = this;
            float r0 = r2.mScaleX
            float r1 = r2.mMaxScaleX
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean canZoomInMoreY() {
            r2 = this;
            float r0 = r2.mScaleY
            float r1 = r2.mMaxScaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean canZoomOutMoreX() {
            r2 = this;
            float r0 = r2.mScaleX
            float r1 = r2.mMinScaleX
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean canZoomOutMoreY() {
            r2 = this;
            float r0 = r2.mScaleY
            float r1 = r2.mMinScaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void centerViewPort(float[] r5, android.view.View r6) {
            r4 = this;
            android.graphics.Matrix r0 = r4.mCenterViewPortMatrixBuffer
            r0.reset()
            android.graphics.Matrix r1 = r4.mMatrixTouch
            r0.set(r1)
            r1 = 0
            r1 = r5[r1]
            float r2 = r4.offsetLeft()
            float r1 = r1 - r2
            r2 = 1
            r5 = r5[r2]
            float r3 = r4.offsetTop()
            float r5 = r5 - r3
            float r1 = -r1
            float r5 = -r5
            r0.postTranslate(r1, r5)
            r4.refresh(r0, r6, r2)
            return
    }

    public float contentBottom() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.bottom
            return r0
    }

    public float contentHeight() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.height()
            return r0
    }

    public float contentLeft() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.left
            return r0
    }

    public float contentRight() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.right
            return r0
    }

    public float contentTop() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.top
            return r0
    }

    public float contentWidth() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.width()
            return r0
    }

    public android.graphics.Matrix fitScreen() {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.fitScreen(r0)
            return r0
    }

    public void fitScreen(android.graphics.Matrix r7) {
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.mMinScaleX = r0
            r6.mMinScaleY = r0
            android.graphics.Matrix r1 = r6.mMatrixTouch
            r7.set(r1)
            float[] r1 = r6.valsBufferForFitScreen
            r2 = 0
            r3 = 0
        Lf:
            r4 = 9
            r5 = 0
            if (r3 >= r4) goto L19
            r1[r3] = r5
            int r3 = r3 + 1
            goto Lf
        L19:
            r7.getValues(r1)
            r3 = 2
            r1[r3] = r5
            r3 = 5
            r1[r3] = r5
            r1[r2] = r0
            r2 = 4
            r1[r2] = r0
            r7.setValues(r1)
            return
    }

    public float getChartHeight() {
            r1 = this;
            float r0 = r1.mChartHeight
            return r0
    }

    public float getChartWidth() {
            r1 = this;
            float r0 = r1.mChartWidth
            return r0
    }

    public com.github.mikephil.charting.utils.MPPointF getContentCenter() {
            r2 = this;
            android.graphics.RectF r0 = r2.mContentRect
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r2.mContentRect
            float r1 = r1.centerY()
            com.github.mikephil.charting.utils.MPPointF r0 = com.github.mikephil.charting.utils.MPPointF.getInstance(r0, r1)
            return r0
    }

    public android.graphics.RectF getContentRect() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            return r0
    }

    public android.graphics.Matrix getMatrixTouch() {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrixTouch
            return r0
    }

    public float getMaxScaleX() {
            r1 = this;
            float r0 = r1.mMaxScaleX
            return r0
    }

    public float getMaxScaleY() {
            r1 = this;
            float r0 = r1.mMaxScaleY
            return r0
    }

    public float getMinScaleX() {
            r1 = this;
            float r0 = r1.mMinScaleX
            return r0
    }

    public float getMinScaleY() {
            r1 = this;
            float r0 = r1.mMinScaleY
            return r0
    }

    public float getScaleX() {
            r1 = this;
            float r0 = r1.mScaleX
            return r0
    }

    public float getScaleY() {
            r1 = this;
            float r0 = r1.mScaleY
            return r0
    }

    public float getSmallestContentExtension() {
            r2 = this;
            android.graphics.RectF r0 = r2.mContentRect
            float r0 = r0.width()
            android.graphics.RectF r1 = r2.mContentRect
            float r1 = r1.height()
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public float getTransX() {
            r1 = this;
            float r0 = r1.mTransX
            return r0
    }

    public float getTransY() {
            r1 = this;
            float r0 = r1.mTransY
            return r0
    }

    public boolean hasChartDimens() {
            r2 = this;
            float r0 = r2.mChartHeight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf
            float r0 = r2.mChartWidth
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public boolean hasNoDragOffset() {
            r2 = this;
            float r0 = r2.mTransOffsetX
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lf
            float r0 = r2.mTransOffsetY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public boolean isFullyZoomedOut() {
            r1 = this;
            boolean r0 = r1.isFullyZoomedOutX()
            if (r0 == 0) goto Le
            boolean r0 = r1.isFullyZoomedOutY()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public boolean isFullyZoomedOutX() {
            r2 = this;
            float r0 = r2.mScaleX
            float r1 = r2.mMinScaleX
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean isFullyZoomedOutY() {
            r2 = this;
            float r0 = r2.mScaleY
            float r1 = r2.mMinScaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean isInBounds(float r1, float r2) {
            r0 = this;
            boolean r1 = r0.isInBoundsX(r1)
            if (r1 == 0) goto Le
            boolean r1 = r0.isInBoundsY(r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public boolean isInBoundsBottom(float r2) {
            r1 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            float r2 = (float) r2
            float r2 = r2 / r0
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.bottom
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public boolean isInBoundsLeft(float r3) {
            r2 = this;
            android.graphics.RectF r0 = r2.mContentRect
            float r0 = r0.left
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto Ld
            r3 = 1
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public boolean isInBoundsRight(float r3) {
            r2 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r0
            android.graphics.RectF r0 = r2.mContentRect
            float r0 = r0.right
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L14
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    public boolean isInBoundsTop(float r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.top
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public boolean isInBoundsX(float r2) {
            r1 = this;
            boolean r0 = r1.isInBoundsLeft(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.isInBoundsRight(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public boolean isInBoundsY(float r2) {
            r1 = this;
            boolean r0 = r1.isInBoundsTop(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.isInBoundsBottom(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public void limitTransAndScale(android.graphics.Matrix r10, android.graphics.RectF r11) {
            r9 = this;
            float[] r0 = r9.matrixBuffer
            r10.getValues(r0)
            float[] r0 = r9.matrixBuffer
            r1 = 2
            r2 = r0[r1]
            r3 = 0
            r4 = r0[r3]
            r5 = 5
            r6 = r0[r5]
            r7 = 4
            r0 = r0[r7]
            float r8 = r9.mMinScaleX
            float r4 = java.lang.Math.max(r8, r4)
            float r8 = r9.mMaxScaleX
            float r4 = java.lang.Math.min(r4, r8)
            r9.mScaleX = r4
            float r4 = r9.mMinScaleY
            float r0 = java.lang.Math.max(r4, r0)
            float r4 = r9.mMaxScaleY
            float r0 = java.lang.Math.min(r0, r4)
            r9.mScaleY = r0
            if (r11 == 0) goto L3a
            float r0 = r11.width()
            float r11 = r11.height()
            goto L3c
        L3a:
            r0 = 0
            r11 = 0
        L3c:
            float r0 = -r0
            float r4 = r9.mScaleX
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r8
            float r0 = r0 * r4
            float r4 = r9.mTransOffsetX
            float r0 = r0 - r4
            float r0 = java.lang.Math.max(r2, r0)
            float r2 = r9.mTransOffsetX
            float r0 = java.lang.Math.min(r0, r2)
            r9.mTransX = r0
            float r0 = r9.mScaleY
            float r0 = r0 - r8
            float r11 = r11 * r0
            float r0 = r9.mTransOffsetY
            float r11 = r11 + r0
            float r11 = java.lang.Math.min(r6, r11)
            float r0 = r9.mTransOffsetY
            float r0 = -r0
            float r11 = java.lang.Math.max(r11, r0)
            r9.mTransY = r11
            float[] r0 = r9.matrixBuffer
            float r2 = r9.mTransX
            r0[r1] = r2
            float r1 = r9.mScaleX
            r0[r3] = r1
            r0[r5] = r11
            float r11 = r9.mScaleY
            r0[r7] = r11
            r10.setValues(r0)
            return
    }

    public float offsetBottom() {
            r2 = this;
            float r0 = r2.mChartHeight
            android.graphics.RectF r1 = r2.mContentRect
            float r1 = r1.bottom
            float r0 = r0 - r1
            return r0
    }

    public float offsetLeft() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.left
            return r0
    }

    public float offsetRight() {
            r2 = this;
            float r0 = r2.mChartWidth
            android.graphics.RectF r1 = r2.mContentRect
            float r1 = r1.right
            float r0 = r0 - r1
            return r0
    }

    public float offsetTop() {
            r1 = this;
            android.graphics.RectF r0 = r1.mContentRect
            float r0 = r0.top
            return r0
    }

    public android.graphics.Matrix refresh(android.graphics.Matrix r3, android.view.View r4, boolean r5) {
            r2 = this;
            android.graphics.Matrix r0 = r2.mMatrixTouch
            r0.set(r3)
            android.graphics.Matrix r0 = r2.mMatrixTouch
            android.graphics.RectF r1 = r2.mContentRect
            r2.limitTransAndScale(r0, r1)
            if (r5 == 0) goto L11
            r4.invalidate()
        L11:
            android.graphics.Matrix r4 = r2.mMatrixTouch
            r3.set(r4)
            return r3
    }

    public void resetZoom(android.graphics.Matrix r3) {
            r2 = this;
            r3.reset()
            android.graphics.Matrix r0 = r2.mMatrixTouch
            r3.set(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r3.postScale(r0, r0, r1, r1)
            return
    }

    public void restrainViewPort(float r3, float r4, float r5, float r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.mContentRect
            float r1 = r2.mChartWidth
            float r1 = r1 - r5
            float r5 = r2.mChartHeight
            float r5 = r5 - r6
            r0.set(r3, r4, r1, r5)
            return
    }

    public void setChartDimens(float r5, float r6) {
            r4 = this;
            float r0 = r4.offsetLeft()
            float r1 = r4.offsetTop()
            float r2 = r4.offsetRight()
            float r3 = r4.offsetBottom()
            r4.mChartHeight = r6
            r4.mChartWidth = r5
            r4.restrainViewPort(r0, r1, r2, r3)
            return
    }

    public void setDragOffsetX(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mTransOffsetX = r1
            return
    }

    public void setDragOffsetY(float r1) {
            r0 = this;
            float r1 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r0.mTransOffsetY = r1
            return
    }

    public void setMaximumScaleX(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L8:
            r1.mMaxScaleX = r2
            android.graphics.Matrix r2 = r1.mMatrixTouch
            android.graphics.RectF r0 = r1.mContentRect
            r1.limitTransAndScale(r2, r0)
            return
    }

    public void setMaximumScaleY(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L8:
            r1.mMaxScaleY = r2
            android.graphics.Matrix r2 = r1.mMatrixTouch
            android.graphics.RectF r0 = r1.mContentRect
            r1.limitTransAndScale(r2, r0)
            return
    }

    public void setMinMaxScaleX(float r3, float r4) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            r3 = 1065353216(0x3f800000, float:1.0)
        L8:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L10:
            r2.mMinScaleX = r3
            r2.mMaxScaleX = r4
            android.graphics.Matrix r3 = r2.mMatrixTouch
            android.graphics.RectF r4 = r2.mContentRect
            r2.limitTransAndScale(r3, r4)
            return
    }

    public void setMinMaxScaleY(float r3, float r4) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            r3 = 1065353216(0x3f800000, float:1.0)
        L8:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L10
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L10:
            r2.mMinScaleY = r3
            r2.mMaxScaleY = r4
            android.graphics.Matrix r3 = r2.mMatrixTouch
            android.graphics.RectF r4 = r2.mContentRect
            r2.limitTransAndScale(r3, r4)
            return
    }

    public void setMinimumScaleX(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            r3 = 1065353216(0x3f800000, float:1.0)
        L8:
            r2.mMinScaleX = r3
            android.graphics.Matrix r3 = r2.mMatrixTouch
            android.graphics.RectF r0 = r2.mContentRect
            r2.limitTransAndScale(r3, r0)
            return
    }

    public void setMinimumScaleY(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
            r3 = 1065353216(0x3f800000, float:1.0)
        L8:
            r2.mMinScaleY = r3
            android.graphics.Matrix r3 = r2.mMatrixTouch
            android.graphics.RectF r0 = r2.mContentRect
            r2.limitTransAndScale(r3, r0)
            return
    }

    public android.graphics.Matrix setZoom(float r2, float r3) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.setZoom(r2, r3, r0)
            return r0
    }

    public android.graphics.Matrix setZoom(float r3, float r4, float r5, float r6) {
            r2 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.Matrix r1 = r2.mMatrixTouch
            r0.set(r1)
            r0.setScale(r3, r4, r5, r6)
            return r0
    }

    public void setZoom(float r2, float r3, android.graphics.Matrix r4) {
            r1 = this;
            r4.reset()
            android.graphics.Matrix r0 = r1.mMatrixTouch
            r4.set(r0)
            r4.setScale(r2, r3)
            return
    }

    public android.graphics.Matrix translate(float[] r2) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.translate(r2, r0)
            return r0
    }

    public void translate(float[] r3, android.graphics.Matrix r4) {
            r2 = this;
            r4.reset()
            android.graphics.Matrix r0 = r2.mMatrixTouch
            r4.set(r0)
            r0 = 0
            r0 = r3[r0]
            float r1 = r2.offsetLeft()
            float r0 = r0 - r1
            r1 = 1
            r3 = r3[r1]
            float r1 = r2.offsetTop()
            float r3 = r3 - r1
            float r0 = -r0
            float r3 = -r3
            r4.postTranslate(r0, r3)
            return
    }

    public android.graphics.Matrix zoom(float r2, float r3) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.zoom(r2, r3, r0)
            return r0
    }

    public android.graphics.Matrix zoom(float r7, float r8, float r9, float r10) {
            r6 = this;
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.zoom(r1, r2, r3, r4, r5)
            return r5
    }

    public void zoom(float r2, float r3, float r4, float r5, android.graphics.Matrix r6) {
            r1 = this;
            r6.reset()
            android.graphics.Matrix r0 = r1.mMatrixTouch
            r6.set(r0)
            r6.postScale(r2, r3, r4, r5)
            return
    }

    public void zoom(float r2, float r3, android.graphics.Matrix r4) {
            r1 = this;
            r4.reset()
            android.graphics.Matrix r0 = r1.mMatrixTouch
            r4.set(r0)
            r4.postScale(r2, r3)
            return
    }

    public android.graphics.Matrix zoomIn(float r2, float r3) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.zoomIn(r2, r3, r0)
            return r0
    }

    public void zoomIn(float r2, float r3, android.graphics.Matrix r4) {
            r1 = this;
            r4.reset()
            android.graphics.Matrix r0 = r1.mMatrixTouch
            r4.set(r0)
            r0 = 1068708659(0x3fb33333, float:1.4)
            r4.postScale(r0, r0, r2, r3)
            return
    }

    public android.graphics.Matrix zoomOut(float r2, float r3) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.zoomOut(r2, r3, r0)
            return r0
    }

    public void zoomOut(float r2, float r3, android.graphics.Matrix r4) {
            r1 = this;
            r4.reset()
            android.graphics.Matrix r0 = r1.mMatrixTouch
            r4.set(r0)
            r0 = 1060320051(0x3f333333, float:0.7)
            r4.postScale(r0, r0, r2, r3)
            return
    }
}

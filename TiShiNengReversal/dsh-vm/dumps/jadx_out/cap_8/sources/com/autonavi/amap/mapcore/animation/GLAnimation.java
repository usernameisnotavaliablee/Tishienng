package com.autonavi.amap.mapcore.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLAnimation implements java.lang.Cloneable {
    public static final int ABSOLUTE = 0;
    public static final int INFINITE = -1;
    public static final int RELATIVE_TO_PARENT = 2;
    public static final int RELATIVE_TO_SELF = 1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public static final int START_ON_FIRST_FRAME = -1;
    public static final int ZORDER_BOTTOM = -1;
    public static final int ZORDER_NORMAL = 0;
    public static final int ZORDER_TOP = 1;
    private int mBackgroundColor;
    boolean mCycleFlip;
    private boolean mDetachWallpaper;
    long mDuration;
    boolean mEnded;
    boolean mFillAfter;
    boolean mFillBefore;
    boolean mFillEnabled;
    boolean mInitialized;
    android.view.animation.Interpolator mInterpolator;
    com.amap.api.maps.model.animation.Animation.AnimationListener mListener;
    private android.os.Handler mListenerHandler;
    private boolean mMore;
    private java.lang.Runnable mOnEnd;
    private java.lang.Runnable mOnStart;
    private boolean mOneMoreTime;
    android.graphics.RectF mPreviousRegion;
    com.autonavi.amap.mapcore.animation.GLTransformation mPreviousTransformation;
    android.graphics.RectF mRegion;
    int mRepeatCount;
    int mRepeatMode;
    int mRepeated;
    private float mScaleFactor;
    long mStartOffset;
    long mStartTime;
    boolean mStarted;
    private int mZAdjustment;

    public GLAnimation() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mEnded = r0
            r4.mStarted = r0
            r4.mCycleFlip = r0
            r4.mInitialized = r0
            r1 = 1
            r4.mFillBefore = r1
            r4.mFillAfter = r0
            r4.mFillEnabled = r0
            r2 = -1
            r4.mStartTime = r2
            r2 = 500(0x1f4, double:2.47E-321)
            r4.mDuration = r2
            r4.mRepeatCount = r0
            r4.mRepeated = r0
            r4.mRepeatMode = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.mScaleFactor = r2
            r4.mDetachWallpaper = r0
            r4.mMore = r1
            r4.mOneMoreTime = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.mPreviousRegion = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.mRegion = r0
            com.autonavi.amap.mapcore.animation.GLTransformation r0 = new com.autonavi.amap.mapcore.animation.GLTransformation
            r0.<init>()
            r4.mPreviousTransformation = r0
            r4.ensureInterpolator()     // Catch: java.lang.Throwable -> L43
        L43:
            return
    }

    private void fireAnimationEnd() {
            r2 = this;
            com.amap.api.maps.model.animation.Animation$AnimationListener r0 = r2.mListener
            if (r0 == 0) goto L11
            android.os.Handler r1 = r2.mListenerHandler
            if (r1 != 0) goto Lc
            r0.onAnimationEnd()
            return
        Lc:
            java.lang.Runnable r0 = r2.mOnEnd
            r1.postAtFrontOfQueue(r0)
        L11:
            return
    }

    private void fireAnimationRepeat() {
            r0 = this;
            return
    }

    private void fireAnimationStart() {
            r2 = this;
            com.amap.api.maps.model.animation.Animation$AnimationListener r0 = r2.mListener
            if (r0 == 0) goto L11
            android.os.Handler r1 = r2.mListenerHandler
            if (r1 != 0) goto Lc
            r0.onAnimationStart()
            return
        Lc:
            java.lang.Runnable r0 = r2.mOnStart
            r1.postAtFrontOfQueue(r0)
        L11:
            return
    }

    protected void applyTransformation(float r1, com.autonavi.amap.mapcore.animation.GLTransformation r2) {
            r0 = this;
            return
    }

    public void cancel() {
            r2 = this;
            boolean r0 = r2.mStarted
            if (r0 == 0) goto Le
            boolean r0 = r2.mEnded
            if (r0 != 0) goto Le
            r2.fireAnimationEnd()
            r0 = 1
            r2.mEnded = r0
        Le:
            r0 = -9223372036854775808
            r2.mStartTime = r0
            r0 = 0
            r2.mOneMoreTime = r0
            r2.mMore = r0
            return
    }

    public com.autonavi.amap.mapcore.animation.GLAnimation clone() throws java.lang.CloneNotSupportedException {
            r2 = this;
            java.lang.Object r0 = super.clone()
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = (com.autonavi.amap.mapcore.animation.GLAnimation) r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mPreviousRegion = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.mRegion = r1
            com.autonavi.amap.mapcore.animation.GLTransformation r1 = new com.autonavi.amap.mapcore.animation.GLTransformation
            r1.<init>()
            r0.mPreviousTransformation = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo43clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.autonavi.amap.mapcore.animation.GLAnimation r0 = r1.clone()
            return r0
    }

    public long computeDurationHint() {
            r4 = this;
            long r0 = r4.getStartOffset()
            long r2 = r4.getDuration()
            long r0 = r0 + r2
            int r2 = r4.getRepeatCount()
            int r2 = r2 + 1
            long r2 = (long) r2
            long r0 = r0 * r2
            return r0
    }

    public void detach() {
            r1 = this;
            boolean r0 = r1.mStarted
            if (r0 == 0) goto Le
            boolean r0 = r1.mEnded
            if (r0 != 0) goto Le
            r0 = 1
            r1.mEnded = r0
            r1.fireAnimationEnd()
        Le:
            return
    }

    protected void ensureInterpolator() {
            r1 = this;
            android.view.animation.Interpolator r0 = r1.mInterpolator
            if (r0 != 0) goto Lb
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r1.mInterpolator = r0
        Lb:
            return
    }

    public int getBackgroundColor() {
            r1 = this;
            int r0 = r1.mBackgroundColor
            return r0
    }

    public boolean getDetachWallpaper() {
            r1 = this;
            boolean r0 = r1.mDetachWallpaper
            return r0
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.mDuration
            return r0
    }

    public boolean getFillAfter() {
            r1 = this;
            boolean r0 = r1.mFillAfter
            return r0
    }

    public boolean getFillBefore() {
            r1 = this;
            boolean r0 = r1.mFillBefore
            return r0
    }

    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            android.view.animation.Interpolator r0 = r1.mInterpolator
            return r0
    }

    public int getRepeatCount() {
            r1 = this;
            int r0 = r1.mRepeatCount
            return r0
    }

    public int getRepeatMode() {
            r1 = this;
            int r0 = r1.mRepeatMode
            return r0
    }

    protected float getScaleFactor() {
            r1 = this;
            float r0 = r1.mScaleFactor
            return r0
    }

    public long getStartOffset() {
            r2 = this;
            long r0 = r2.mStartOffset
            return r0
    }

    public long getStartTime() {
            r2 = this;
            long r0 = r2.mStartTime
            return r0
    }

    public boolean getTransformation(long r12, com.autonavi.amap.mapcore.animation.GLTransformation r14) {
            r11 = this;
            long r0 = r11.mStartTime
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r11.mStartTime = r12
        La:
            long r0 = r11.getStartOffset()
            long r4 = r11.mDuration
            r6 = 0
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L21
            long r6 = r11.mStartTime
            long r6 = r6 + r0
            long r12 = r12 - r6
            float r12 = (float) r12
            float r13 = (float) r4
            float r12 = r12 / r13
            goto L2b
        L21:
            long r0 = r11.mStartTime
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 >= 0) goto L29
            r12 = 0
            goto L2b
        L29:
            r12 = 1065353216(0x3f800000, float:1.0)
        L2b:
            r13 = 0
            r0 = 1
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 < 0) goto L33
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            r4 = r1 ^ 1
            r11.mMore = r4
            boolean r4 = r11.mFillEnabled
            if (r4 != 0) goto L44
            float r12 = java.lang.Math.min(r12, r9)
            float r12 = java.lang.Math.max(r12, r8)
        L44:
            int r4 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r4 >= 0) goto L4c
            boolean r4 = r11.mFillBefore
            if (r4 == 0) goto L78
        L4c:
            int r4 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r4 <= 0) goto L54
            boolean r4 = r11.mFillAfter
            if (r4 == 0) goto L78
        L54:
            boolean r4 = r11.mStarted
            if (r4 != 0) goto L5d
            r11.fireAnimationStart()     // Catch: java.lang.Throwable -> L5b
        L5b:
            r11.mStarted = r0
        L5d:
            boolean r4 = r11.mFillEnabled
            if (r4 == 0) goto L69
            float r12 = java.lang.Math.min(r12, r9)
            float r12 = java.lang.Math.max(r12, r8)
        L69:
            boolean r4 = r11.mCycleFlip
            if (r4 == 0) goto L6f
            float r12 = r9 - r12
        L6f:
            android.view.animation.Interpolator r4 = r11.mInterpolator
            float r12 = r4.getInterpolation(r12)
            r11.applyTransformation(r12, r14)
        L78:
            if (r1 == 0) goto La0
            int r12 = r11.mRepeatCount
            int r14 = r11.mRepeated
            if (r12 != r14) goto L8a
            boolean r12 = r11.mEnded
            if (r12 != 0) goto La0
            r11.mEnded = r0
            r11.fireAnimationEnd()
            goto La0
        L8a:
            if (r12 <= 0) goto L8f
            int r14 = r14 + r0
            r11.mRepeated = r14
        L8f:
            int r12 = r11.mRepeatMode
            r14 = 2
            if (r12 != r14) goto L99
            boolean r12 = r11.mCycleFlip
            r12 = r12 ^ r0
            r11.mCycleFlip = r12
        L99:
            r11.mStartTime = r2
            r11.mMore = r0
            r11.fireAnimationRepeat()
        La0:
            boolean r12 = r11.mMore
            if (r12 != 0) goto Lab
            boolean r14 = r11.mOneMoreTime
            if (r14 == 0) goto Lab
            r11.mOneMoreTime = r13
            return r0
        Lab:
            return r12
    }

    public boolean getTransformation(long r1, com.autonavi.amap.mapcore.animation.GLTransformation r3, float r4) {
            r0 = this;
            r0.mScaleFactor = r4
            boolean r1 = r0.getTransformation(r1, r3)
            return r1
    }

    public int getZAdjustment() {
            r1 = this;
            int r0 = r1.mZAdjustment
            return r0
    }

    public boolean hasAlpha() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean hasEnded() {
            r1 = this;
            boolean r0 = r1.mEnded
            return r0
    }

    protected boolean hasStarted() {
            r1 = this;
            boolean r0 = r1.mStarted
            return r0
    }

    public void initialize() {
            r1 = this;
            r1.reset()
            r0 = 1
            r1.mInitialized = r0
            return
    }

    public boolean isFillEnabled() {
            r1 = this;
            boolean r0 = r1.mFillEnabled
            return r0
    }

    public boolean isInitialized() {
            r1 = this;
            boolean r0 = r1.mInitialized
            return r0
    }

    public void reset() {
            r1 = this;
            android.graphics.RectF r0 = r1.mPreviousRegion
            r0.setEmpty()
            com.autonavi.amap.mapcore.animation.GLTransformation r0 = r1.mPreviousTransformation
            r0.clear()
            r0 = 0
            r1.mInitialized = r0
            r1.mCycleFlip = r0
            r1.mRepeated = r0
            r0 = 1
            r1.mMore = r0
            r1.mOneMoreTime = r0
            r0 = 0
            r1.mListenerHandler = r0
            return
    }

    public void restrictDuration(long r9) {
            r8 = this;
            long r0 = r8.mStartOffset
            r2 = 0
            r3 = 0
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 <= 0) goto L10
            r8.mStartOffset = r9
            r8.mDuration = r3
            r8.mRepeatCount = r2
            return
        L10:
            long r5 = r8.mDuration
            long r5 = r5 + r0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 <= 0) goto L1c
            long r0 = r9 - r0
            r8.mDuration = r0
            r5 = r9
        L1c:
            long r0 = r8.mDuration
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 > 0) goto L27
            r8.mDuration = r3
            r8.mRepeatCount = r2
            return
        L27:
            int r0 = r8.mRepeatCount
            if (r0 < 0) goto L37
            long r3 = (long) r0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 > 0) goto L37
            long r0 = (long) r0
            long r0 = r0 * r5
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 <= 0) goto L41
        L37:
            long r9 = r9 / r5
            int r10 = (int) r9
            int r10 = r10 + (-1)
            r8.mRepeatCount = r10
            if (r10 >= 0) goto L41
            r8.mRepeatCount = r2
        L41:
            return
    }

    public void scaleCurrentDuration(float r3) {
            r2 = this;
            long r0 = r2.mDuration
            float r0 = (float) r0
            float r0 = r0 * r3
            long r0 = (long) r0
            r2.mDuration = r0
            long r0 = r2.mStartOffset
            float r0 = (float) r0
            float r0 = r0 * r3
            long r0 = (long) r0
            r2.mStartOffset = r0
            return
    }

    public void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public void setBackgroundColor(int r1) {
            r0 = this;
            r0.mBackgroundColor = r1
            return
    }

    public void setDetachWallpaper(boolean r1) {
            r0 = this;
            r0.mDetachWallpaper = r1
            return
    }

    public void setDuration(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r4 = r0
        L7:
            r3.mDuration = r4
            return
    }

    public void setFillAfter(boolean r1) {
            r0 = this;
            r0.mFillAfter = r1
            return
    }

    public void setFillBefore(boolean r1) {
            r0 = this;
            r0.mFillBefore = r1
            return
    }

    public void setFillEnabled(boolean r1) {
            r0 = this;
            r0.mFillEnabled = r1
            return
    }

    public void setInterpolator(android.content.Context r1, int r2) {
            r0 = this;
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
            r0.setInterpolator(r1)
            return
    }

    public void setInterpolator(android.view.animation.Interpolator r1) {
            r0 = this;
            r0.mInterpolator = r1
            return
    }

    public void setRepeatCount(int r1) {
            r0 = this;
            if (r1 >= 0) goto L3
            r1 = -1
        L3:
            r0.mRepeatCount = r1
            return
    }

    public void setRepeatMode(int r1) {
            r0 = this;
            r0.mRepeatMode = r1
            return
    }

    public void setStartOffset(long r1) {
            r0 = this;
            r0.mStartOffset = r1
            return
    }

    public void setStartTime(long r1) {
            r0 = this;
            r0.mStartTime = r1
            r1 = 0
            r0.mEnded = r1
            r0.mStarted = r1
            r0.mCycleFlip = r1
            r0.mRepeated = r1
            r1 = 1
            r0.mMore = r1
            return
    }

    public void setZAdjustment(int r1) {
            r0 = this;
            r0.mZAdjustment = r1
            return
    }

    public void start() {
            r2 = this;
            r0 = -1
            r2.setStartTime(r0)
            return
    }

    public void startNow() {
            r2 = this;
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r2.setStartTime(r0)
            return
    }

    public boolean willChangeBounds() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean willChangeTransformationMatrix() {
            r1 = this;
            r0 = 1
            return r0
    }
}

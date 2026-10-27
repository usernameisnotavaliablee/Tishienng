package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SwipeDismissTouchListener implements android.view.View.OnTouchListener {
    public static final int A_HALF = 2;
    public static final int MIN_VIEW_WIDTH = 2;
    public static final int ONE_THIRD = 3;
    private long mAnimationTime;
    private com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks mCallbacks;
    private boolean mCanFinish;
    private float mDownX;
    private float mDownY;
    private int mMaxFlingVelocity;
    private int mMinFlingVelocity;
    private boolean mO;
    private int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private java.lang.Object mToken;
    private float mTranslationX;
    private android.view.VelocityTracker mVelocityTracker;
    private android.view.View mView;
    private int mViewWidth;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface DismissCallbacks {
        boolean canDismiss(java.lang.Object r1);

        void onDismiss(android.view.View r1, java.lang.Object r2);

        void onNotifySwipe();
    }

    public SwipeDismissTouchListener(android.view.View r3, java.lang.Object r4, com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mViewWidth = r0
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.mSlop = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            int r1 = r1 * 16
            r2.mMinFlingVelocity = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.mMaxFlingVelocity = r0
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 17694720(0x10e0000, float:2.608128E-38)
            int r0 = r0.getInteger(r1)
            long r0 = (long) r0
            r2.mAnimationTime = r0
            r2.mView = r3
            r2.mToken = r4
            r2.mCallbacks = r5
            return
    }

    private void a() {
            r5 = this;
            com.amap.api.maps.SwipeDismissTouchListener$DismissCallbacks r0 = r5.mCallbacks
            android.view.View r1 = r5.mView
            java.lang.Object r2 = r5.mToken
            r0.onDismiss(r1, r2)
            android.view.View r0 = r5.mView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.View r1 = r5.mView
            int r1 = r1.getHeight()
            r2 = 1
            int[] r2 = new int[]{r1, r2}
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            long r3 = r5.mAnimationTime
            android.animation.ValueAnimator r2 = r2.setDuration(r3)
            com.amap.api.maps.SwipeDismissTouchListener$2 r3 = new com.amap.api.maps.SwipeDismissTouchListener$2
            r3.<init>(r5, r0, r1)
            r2.addListener(r3)
            com.amap.api.maps.SwipeDismissTouchListener$3 r1 = new com.amap.api.maps.SwipeDismissTouchListener$3
            r1.<init>(r5, r0)
            r2.addUpdateListener(r1)
            r2.start()
            return
    }

    static /* synthetic */ void a(com.amap.api.maps.SwipeDismissTouchListener r0) {
            r0.a()
            return
    }

    static /* synthetic */ android.view.View b(com.amap.api.maps.SwipeDismissTouchListener r0) {
            android.view.View r0 = r0.mView
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            r11 = this;
            float r12 = r11.mTranslationX
            r0 = 0
            r13.offsetLocation(r12, r0)
            int r12 = r11.mViewWidth
            r1 = 2
            if (r12 >= r1) goto L13
            android.view.View r12 = r11.mView
            int r12 = r12.getWidth()
            r11.mViewWidth = r12
        L13:
            int r12 = r13.getActionMasked()
            r2 = 0
            r3 = 1
            if (r12 == 0) goto L1d0
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r12 == r3) goto Lfe
            r6 = 3
            if (r12 == r1) goto L53
            if (r12 == r6) goto L27
            goto L1cf
        L27:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            if (r12 == 0) goto L1cf
            android.view.View r12 = r11.mView
            android.view.ViewPropertyAnimator r12 = r12.animate()
            android.view.ViewPropertyAnimator r12 = r12.translationX(r0)
            android.view.ViewPropertyAnimator r12 = r12.alpha(r5)
            long r5 = r11.mAnimationTime
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r5)
            r12.setListener(r4)
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            r12.recycle()
            r11.mVelocityTracker = r4
            r11.mTranslationX = r0
            r11.mDownX = r0
            r11.mDownY = r0
            r11.mSwiping = r2
            goto L1cf
        L53:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            if (r12 == 0) goto L1cf
            r12.addMovement(r13)
            float r12 = r13.getRawX()
            float r1 = r11.mDownX
            float r12 = r12 - r1
            float r1 = r13.getRawY()
            float r4 = r11.mDownY
            float r1 = r1 - r4
            float r4 = java.lang.Math.abs(r12)
            int r7 = r11.mSlop
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto Ld4
            float r1 = java.lang.Math.abs(r1)
            float r4 = java.lang.Math.abs(r12)
            float r4 = r4 / r8
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto Ld4
            r11.mSwiping = r3
            int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8b
            int r1 = r11.mSlop
            goto L8e
        L8b:
            int r1 = r11.mSlop
            int r1 = -r1
        L8e:
            r11.mSwipingSlop = r1
            android.view.View r1 = r11.mView
            android.view.ViewParent r1 = r1.getParent()
            r1.requestDisallowInterceptTouchEvent(r3)
            boolean r1 = r11.mO
            if (r1 != 0) goto La4
            r11.mO = r3
            com.amap.api.maps.SwipeDismissTouchListener$DismissCallbacks r1 = r11.mCallbacks
            r1.onNotifySwipe()
        La4:
            float r1 = java.lang.Math.abs(r12)
            int r4 = r11.mViewWidth
            int r4 = r4 / r6
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lbc
            boolean r1 = r11.mCanFinish
            if (r1 != 0) goto Lbe
            r11.mCanFinish = r3
            com.amap.api.maps.SwipeDismissTouchListener$DismissCallbacks r1 = r11.mCallbacks
            r1.onNotifySwipe()
            goto Lbe
        Lbc:
            r11.mCanFinish = r2
        Lbe:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
            int r13 = r13.getActionIndex()
            int r13 = r13 << 8
            r13 = r13 | r6
            r1.setAction(r13)
            android.view.View r13 = r11.mView
            r13.onTouchEvent(r1)
            r1.recycle()
        Ld4:
            boolean r13 = r11.mSwiping
            if (r13 == 0) goto L1cf
            r11.mTranslationX = r12
            android.view.View r13 = r11.mView
            int r1 = r11.mSwipingSlop
            float r1 = (float) r1
            float r1 = r12 - r1
            r13.setTranslationX(r1)
            android.view.View r13 = r11.mView
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 * r8
            int r1 = r11.mViewWidth
            float r1 = (float) r1
            float r12 = r12 / r1
            float r12 = r5 - r12
            float r12 = java.lang.Math.min(r5, r12)
            float r12 = java.lang.Math.max(r0, r12)
            r13.setAlpha(r12)
            return r3
        Lfe:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            if (r12 == 0) goto L1cf
            float r12 = r13.getRawX()
            float r6 = r11.mDownX
            float r12 = r12 - r6
            android.view.VelocityTracker r6 = r11.mVelocityTracker
            r6.addMovement(r13)
            android.view.VelocityTracker r13 = r11.mVelocityTracker
            r6 = 1000(0x3e8, float:1.401E-42)
            r13.computeCurrentVelocity(r6)
            android.view.VelocityTracker r13 = r11.mVelocityTracker
            float r13 = r13.getXVelocity()
            float r6 = java.lang.Math.abs(r13)
            android.view.VelocityTracker r7 = r11.mVelocityTracker
            float r7 = r7.getYVelocity()
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r12)
            int r9 = r11.mViewWidth
            int r9 = r9 / r1
            float r1 = (float) r9
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L141
            boolean r1 = r11.mSwiping
            if (r1 == 0) goto L141
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L13f
            r12 = 1
            goto L17c
        L13f:
            r12 = 0
            goto L17c
        L141:
            int r1 = r11.mMinFlingVelocity
            float r1 = (float) r1
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L17a
            int r1 = r11.mMaxFlingVelocity
            float r1 = (float) r1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L17a
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 >= 0) goto L17a
            boolean r1 = r11.mSwiping
            if (r1 == 0) goto L17a
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 >= 0) goto L15d
            r13 = 1
            goto L15e
        L15d:
            r13 = 0
        L15e:
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 >= 0) goto L164
            r12 = 1
            goto L165
        L164:
            r12 = 0
        L165:
            if (r13 != r12) goto L169
            r12 = 1
            goto L16a
        L169:
            r12 = 0
        L16a:
            android.view.VelocityTracker r13 = r11.mVelocityTracker
            float r13 = r13.getXVelocity()
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto L175
            goto L176
        L175:
            r3 = 0
        L176:
            r10 = r3
            r3 = r12
            r12 = r10
            goto L17c
        L17a:
            r12 = 0
            r3 = 0
        L17c:
            if (r3 == 0) goto L1a5
            android.view.View r13 = r11.mView
            android.view.ViewPropertyAnimator r13 = r13.animate()
            if (r12 == 0) goto L18a
            int r12 = r11.mViewWidth
        L188:
            float r12 = (float) r12
            goto L18e
        L18a:
            int r12 = r11.mViewWidth
            int r12 = -r12
            goto L188
        L18e:
            android.view.ViewPropertyAnimator r12 = r13.translationX(r12)
            android.view.ViewPropertyAnimator r12 = r12.alpha(r0)
            r5 = 50
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r5)
            com.amap.api.maps.SwipeDismissTouchListener$1 r13 = new com.amap.api.maps.SwipeDismissTouchListener$1
            r13.<init>(r11)
            r12.setListener(r13)
            goto L1c0
        L1a5:
            boolean r12 = r11.mSwiping
            if (r12 == 0) goto L1c0
            android.view.View r12 = r11.mView
            android.view.ViewPropertyAnimator r12 = r12.animate()
            android.view.ViewPropertyAnimator r12 = r12.translationX(r0)
            android.view.ViewPropertyAnimator r12 = r12.alpha(r5)
            long r5 = r11.mAnimationTime
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r5)
            r12.setListener(r4)
        L1c0:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            r12.recycle()
            r11.mVelocityTracker = r4
            r11.mTranslationX = r0
            r11.mDownX = r0
            r11.mDownY = r0
            r11.mSwiping = r2
        L1cf:
            return r2
        L1d0:
            float r12 = r13.getRawX()
            r11.mDownX = r12
            float r12 = r13.getRawY()
            r11.mDownY = r12
            com.amap.api.maps.SwipeDismissTouchListener$DismissCallbacks r12 = r11.mCallbacks
            java.lang.Object r0 = r11.mToken
            boolean r12 = r12.canDismiss(r0)
            if (r12 == 0) goto L1f1
            r11.mO = r2
            android.view.VelocityTracker r12 = android.view.VelocityTracker.obtain()
            r11.mVelocityTracker = r12
            r12.addMovement(r13)
        L1f1:
            return r3
    }
}

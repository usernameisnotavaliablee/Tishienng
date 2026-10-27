package com.bxkj.student.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SlideDetailsLayout extends android.view.ViewGroup {
    private static final int DEFAULT_DURATION = 300;
    private static final float DEFAULT_PERCENT = 0.2f;
    private boolean isFirstShowBehindView;
    private android.view.View mBehindView;
    private int mDefaultPanel;
    private long mDuration;
    private android.view.View mFrontView;
    private float mInitMotionX;
    private float mInitMotionY;
    private com.bxkj.student.common.view.SlideDetailsLayout.OnSlideDetailsListener mOnSlideDetailsListener;
    private float mPercent;
    private float mSlideOffset;
    private com.bxkj.student.common.view.SlideDetailsLayout.Status mStatus;
    private android.view.View mTarget;
    private float mTouchSlop;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnSlideDetailsListener {
        void onStatucChanged(com.bxkj.student.common.view.SlideDetailsLayout.Status r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.bxkj.student.common.view.SlideDetailsLayout.SavedState> CREATOR = null;
        private float offset;
        private int status;


        static {
                com.bxkj.student.common.view.SlideDetailsLayout$SavedState$1 r0 = new com.bxkj.student.common.view.SlideDetailsLayout$SavedState$1
                r0.<init>()
                com.bxkj.student.common.view.SlideDetailsLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                float r0 = r2.readFloat()
                r1.offset = r0
                int r2 = r2.readInt()
                r1.status = r2
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* bridge */ /* synthetic */ float a(com.bxkj.student.common.view.SlideDetailsLayout.SavedState r0) {
                float r0 = r0.offset
                return r0
        }

        static /* bridge */ /* synthetic */ int b(com.bxkj.student.common.view.SlideDetailsLayout.SavedState r0) {
                int r0 = r0.status
                return r0
        }

        static /* bridge */ /* synthetic */ void c(com.bxkj.student.common.view.SlideDetailsLayout.SavedState r0, float r1) {
                r0.offset = r1
                return
        }

        static /* bridge */ /* synthetic */ void d(com.bxkj.student.common.view.SlideDetailsLayout.SavedState r0, int r1) {
                r0.status = r1
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                float r2 = r0.offset
                r1.writeFloat(r2)
                int r2 = r0.status
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Status extends java.lang.Enum<com.bxkj.student.common.view.SlideDetailsLayout.Status> {
        private static final /* synthetic */ com.bxkj.student.common.view.SlideDetailsLayout.Status[] $VALUES = null;
        public static final com.bxkj.student.common.view.SlideDetailsLayout.Status CLOSE = null;
        public static final com.bxkj.student.common.view.SlideDetailsLayout.Status OPEN = null;

        private static /* synthetic */ com.bxkj.student.common.view.SlideDetailsLayout.Status[] $values() {
                r0 = 2
                com.bxkj.student.common.view.SlideDetailsLayout$Status[] r0 = new com.bxkj.student.common.view.SlideDetailsLayout.Status[r0]
                com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
                r2 = 0
                r0[r2] = r1
                com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = new com.bxkj.student.common.view.SlideDetailsLayout$Status
                java.lang.String r1 = "CLOSE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE = r0
                com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = new com.bxkj.student.common.view.SlideDetailsLayout$Status
                java.lang.String r1 = "OPEN"
                r2 = 1
                r0.<init>(r1, r2)
                com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN = r0
                com.bxkj.student.common.view.SlideDetailsLayout$Status[] r0 = $values()
                com.bxkj.student.common.view.SlideDetailsLayout.Status.$VALUES = r0
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bxkj.student.common.view.SlideDetailsLayout.Status valueOf(int r1) {
                if (r1 != 0) goto L5
                com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
                return r1
            L5:
                r0 = 1
                if (r0 != r1) goto Lb
                com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
                return r1
            Lb:
                com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
                return r1
        }

        public static com.bxkj.student.common.view.SlideDetailsLayout.Status valueOf(java.lang.String r1) {
                java.lang.Class<com.bxkj.student.common.view.SlideDetailsLayout$Status> r0 = com.bxkj.student.common.view.SlideDetailsLayout.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = (com.bxkj.student.common.view.SlideDetailsLayout.Status) r1
                return r1
        }

        public static com.bxkj.student.common.view.SlideDetailsLayout.Status[] values() {
                com.bxkj.student.common.view.SlideDetailsLayout$Status[] r0 = com.bxkj.student.common.view.SlideDetailsLayout.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bxkj.student.common.view.SlideDetailsLayout$Status[] r0 = (com.bxkj.student.common.view.SlideDetailsLayout.Status[]) r0
                return r0
        }
    }

    public SlideDetailsLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SlideDetailsLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SlideDetailsLayout(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
            r4.mStatus = r0
            r0 = 1
            r4.isFirstShowBehindView = r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r4.mPercent = r1
            r2 = 300(0x12c, double:1.48E-321)
            r4.mDuration = r2
            r2 = 0
            r4.mDefaultPanel = r2
            int[] r3 = com.bxkj.student.R.styleable.SlideDetailsLayout
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r3, r7, r2)
            r6 = 2
            float r6 = r5.getFloat(r6, r1)
            r4.mPercent = r6
            r6 = 300(0x12c, float:4.2E-43)
            int r6 = r5.getInt(r0, r6)
            long r6 = (long) r6
            r4.mDuration = r6
            int r6 = r5.getInt(r2, r2)
            r4.mDefaultPanel = r6
            r5.recycle()
            android.content.Context r5 = r4.getContext()
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            int r5 = r5.getScaledTouchSlop()
            float r5 = (float) r5
            r4.mTouchSlop = r5
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.SlideDetailsLayout.OnSlideDetailsListener a(com.bxkj.student.common.view.SlideDetailsLayout r0) {
            com.bxkj.student.common.view.SlideDetailsLayout$OnSlideDetailsListener r0 = r0.mOnSlideDetailsListener
            return r0
    }

    private void animatorSwitch(float r7, float r8) {
            r6 = this;
            r3 = 1
            long r4 = r6.mDuration
            r0 = r6
            r1 = r7
            r2 = r8
            r0.animatorSwitch(r1, r2, r3, r4)
            return
    }

    private void animatorSwitch(float r7, float r8, long r9) {
            r6 = this;
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.animatorSwitch(r1, r2, r3, r4)
            return
    }

    private void animatorSwitch(float r7, float r8, boolean r9) {
            r6 = this;
            long r4 = r6.mDuration
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.animatorSwitch(r1, r2, r3, r4)
            return
    }

    private void animatorSwitch(float r3, float r4, boolean r5, long r6) {
            r2 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            com.bxkj.student.common.view.SlideDetailsLayout$2 r4 = new com.bxkj.student.common.view.SlideDetailsLayout$2
            r4.<init>(r2)
            r3.addUpdateListener(r4)
            com.bxkj.student.common.view.SlideDetailsLayout$3 r4 = new com.bxkj.student.common.view.SlideDetailsLayout$3
            r4.<init>(r2, r5)
            r3.addListener(r4)
            r3.setDuration(r6)
            r3.start()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.view.SlideDetailsLayout.Status b(com.bxkj.student.common.view.SlideDetailsLayout r0) {
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = r0.mStatus
            return r0
    }

    static /* bridge */ /* synthetic */ void c(com.bxkj.student.common.view.SlideDetailsLayout r0, float r1) {
            r0.mSlideOffset = r1
            return
    }

    private void checkAndFirstOpenPanel() {
            r2 = this;
            boolean r0 = r2.isFirstShowBehindView
            if (r0 == 0) goto Lc
            r0 = 0
            r2.isFirstShowBehindView = r0
            android.view.View r1 = r2.mBehindView
            r1.setVisibility(r0)
        Lc:
            return
    }

    static /* bridge */ /* synthetic */ void d(com.bxkj.student.common.view.SlideDetailsLayout r0) {
            r0.checkAndFirstOpenPanel()
            return
    }

    private void ensureTarget() {
            r2 = this;
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = r2.mStatus
            com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
            if (r0 != r1) goto Lb
            android.view.View r0 = r2.mFrontView
            r2.mTarget = r0
            return
        Lb:
            android.view.View r0 = r2.mBehindView
            r2.mTarget = r0
            return
    }

    private void finishTouchEvent() {
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            float r1 = (float) r0
            float r2 = r9.mPercent
            float r2 = r2 * r1
            int r2 = (int) r2
            float r3 = r9.mSlideOffset
            com.bxkj.student.common.view.SlideDetailsLayout$Status r4 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
            com.bxkj.student.common.view.SlideDetailsLayout$Status r5 = r9.mStatus
            r6 = 0
            r7 = 1
            if (r4 != r5) goto L26
            int r1 = -r2
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L23
            int r0 = -r0
            float r0 = (float) r0
            r9.mSlideOffset = r0
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            r9.mStatus = r0
            goto L3a
        L23:
            r9.mSlideOffset = r6
            goto L39
        L26:
            com.bxkj.student.common.view.SlideDetailsLayout$Status r8 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            if (r8 != r5) goto L39
            float r1 = r1 + r3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L35
            r9.mSlideOffset = r6
            r9.mStatus = r4
            goto L3a
        L35:
            int r0 = -r0
            float r0 = (float) r0
            r9.mSlideOffset = r0
        L39:
            r7 = 0
        L3a:
            float r0 = r9.mSlideOffset
            r9.animatorSwitch(r3, r0, r7)
            return
    }

    private void processTouchEvent(float r5) {
            r4 = this;
            float r0 = java.lang.Math.abs(r5)
            float r1 = r4.mTouchSlop
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb
            goto L3e
        Lb:
            float r0 = r4.mSlideOffset
            com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = r4.mStatus
            com.bxkj.student.common.view.SlideDetailsLayout$Status r2 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
            r3 = 0
            if (r1 != r2) goto L24
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L1b
            r4.mSlideOffset = r3
            goto L1d
        L1b:
            r4.mSlideOffset = r5
        L1d:
            float r5 = r4.mSlideOffset
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L3f
            goto L3e
        L24:
            com.bxkj.student.common.view.SlideDetailsLayout$Status r2 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            if (r1 != r2) goto L3f
            int r1 = r4.getMeasuredHeight()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L35
            r4.mSlideOffset = r1
            goto L38
        L35:
            float r1 = r1 + r5
            r4.mSlideOffset = r1
        L38:
            float r5 = r4.mSlideOffset
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L3f
        L3e:
            return
        L3f:
            r4.requestLayout()
            return
    }

    protected boolean canChildScrollVertically(int r4) {
            r3 = this;
            android.view.View r0 = r3.mTarget
            boolean r1 = r0 instanceof android.widget.AbsListView
            if (r1 == 0) goto Ld
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            boolean r4 = r3.canListViewSroll(r0)
            return r4
        Ld:
            boolean r1 = r0 instanceof android.widget.FrameLayout
            if (r1 != 0) goto L19
            boolean r1 = r0 instanceof android.widget.RelativeLayout
            if (r1 != 0) goto L19
            boolean r0 = r0 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L3a
        L19:
            r0 = 0
        L1a:
            android.view.View r1 = r3.mTarget
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L3a
            android.view.View r1 = r3.mTarget
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof android.widget.AbsListView
            if (r2 == 0) goto L37
            android.widget.AbsListView r1 = (android.widget.AbsListView) r1
            boolean r4 = r3.canListViewSroll(r1)
            return r4
        L37:
            int r0 = r0 + 1
            goto L1a
        L3a:
            android.view.View r0 = r3.mTarget
            int r4 = -r4
            boolean r4 = androidx.core.view.ViewCompat.canScrollVertically(r0, r4)
            return r4
    }

    protected boolean canListViewSroll(android.widget.AbsListView r5) {
            r4 = this;
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = r4.mStatus
            com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L24
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L23
            int r0 = r5.getFirstVisiblePosition()
            if (r0 > 0) goto L22
            android.view.View r0 = r5.getChildAt(r3)
            int r0 = r0.getTop()
            int r5 = r5.getPaddingTop()
            if (r0 >= r5) goto L23
        L22:
            return r2
        L23:
            return r3
        L24:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L40
            int r1 = r5.getLastVisiblePosition()
            int r0 = r0 - r2
            if (r1 < r0) goto L3f
            android.view.View r0 = r5.getChildAt(r0)
            int r0 = r0.getBottom()
            int r5 = r5.getMeasuredHeight()
            if (r0 <= r5) goto L40
        L3f:
            return r2
        L40:
            return r3
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = r2.getChildCount()
            r1 = 1
            if (r1 >= r0) goto L24
            r0 = 0
            android.view.View r0 = r2.getChildAt(r0)
            r2.mFrontView = r0
            android.view.View r0 = r2.getChildAt(r1)
            r2.mBehindView = r0
            int r0 = r2.mDefaultPanel
            if (r0 != r1) goto L23
            com.bxkj.student.common.view.SlideDetailsLayout$1 r0 = new com.bxkj.student.common.view.SlideDetailsLayout$1
            r0.<init>(r2)
            r2.post(r0)
        L23:
            return
        L24:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "SlideDetailsLayout only accept childs more than 1!!"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            r5.ensureTarget()
            android.view.View r0 = r5.mTarget
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L10
            return r1
        L10:
            int r0 = androidx.core.view.MotionEventCompat.getActionMasked(r6)
            if (r0 == 0) goto L5a
            r2 = 1
            if (r0 == r2) goto L59
            r3 = 2
            if (r0 == r3) goto L1d
            goto L59
        L1d:
            float r0 = r6.getX()
            float r6 = r6.getY()
            float r3 = r5.mInitMotionX
            float r0 = r0 - r3
            float r3 = r5.mInitMotionY
            float r6 = r6 - r3
            int r3 = (int) r6
            boolean r3 = r5.canChildScrollVertically(r3)
            if (r3 == 0) goto L33
            return r1
        L33:
            float r0 = java.lang.Math.abs(r0)
            float r3 = java.lang.Math.abs(r6)
            float r4 = r5.mTouchSlop
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L59
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L59
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = r5.mStatus
            com.bxkj.student.common.view.SlideDetailsLayout$Status r3 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
            r4 = 0
            if (r0 != r3) goto L50
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 > 0) goto L59
        L50:
            com.bxkj.student.common.view.SlideDetailsLayout$Status r3 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            if (r0 != r3) goto L58
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L59
        L58:
            return r2
        L59:
            return r1
        L5a:
            float r0 = r6.getX()
            r5.mInitMotionX = r0
            float r6 = r6.getY()
            r5.mInitMotionY = r6
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            float r5 = r4.mSlideOffset
            int r5 = (int) r5
            r0 = 0
        L4:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L2b
            android.view.View r1 = r4.getChildAt(r0)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L17
            goto L28
        L17:
            android.view.View r2 = r4.mBehindView
            if (r1 != r2) goto L21
            int r2 = r9 + r5
            int r3 = r2 + r9
            int r3 = r3 - r7
            goto L25
        L21:
            int r2 = r7 + r5
            int r3 = r9 + r5
        L25:
            r1.layout(r6, r2, r8, r3)
        L28:
            int r0 = r0 + 1
            goto L4
        L2b:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            r2 = 0
        L13:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L2c
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L26
            goto L29
        L26:
            r6.measureChild(r3, r1, r0)
        L29:
            int r2 = r2 + 1
            goto L13
        L2c:
            r6.setMeasuredDimension(r7, r8)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            com.bxkj.student.common.view.SlideDetailsLayout$SavedState r2 = (com.bxkj.student.common.view.SlideDetailsLayout.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            float r0 = com.bxkj.student.common.view.SlideDetailsLayout.SavedState.a(r2)
            r1.mSlideOffset = r0
            int r2 = com.bxkj.student.common.view.SlideDetailsLayout.SavedState.b(r2)
            com.bxkj.student.common.view.SlideDetailsLayout$Status r2 = com.bxkj.student.common.view.SlideDetailsLayout.Status.valueOf(r2)
            r1.mStatus = r2
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            if (r2 != r0) goto L23
            android.view.View r2 = r1.mBehindView
            r0 = 0
            r2.setVisibility(r0)
        L23:
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.bxkj.student.common.view.SlideDetailsLayout$SavedState r0 = new com.bxkj.student.common.view.SlideDetailsLayout$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            float r1 = r2.mSlideOffset
            com.bxkj.student.common.view.SlideDetailsLayout.SavedState.c(r0, r1)
            com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = r2.mStatus
            int r1 = r1.ordinal()
            com.bxkj.student.common.view.SlideDetailsLayout.SavedState.d(r0, r1)
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            r4.ensureTarget()
            android.view.View r0 = r4.mTarget
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            boolean r0 = r4.isEnabled()
            if (r0 != 0) goto L10
            return r1
        L10:
            int r0 = androidx.core.view.MotionEventCompat.getActionMasked(r5)
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 == r2) goto L33
            r3 = 2
            if (r0 == r3) goto L20
            r5 = 3
            if (r0 == r5) goto L33
            return r2
        L20:
            float r5 = r5.getY()
            float r0 = r4.mInitMotionY
            float r5 = r5 - r0
            int r0 = (int) r5
            boolean r0 = r4.canChildScrollVertically(r0)
            if (r0 == 0) goto L2f
            return r1
        L2f:
            r4.processTouchEvent(r5)
            return r2
        L33:
            r4.finishTouchEvent()
            return r1
        L37:
            android.view.View r5 = r4.mTarget
            androidx.activity.k.a(r5)
            return r2
    }

    public void setOnSlideDetailsListener(com.bxkj.student.common.view.SlideDetailsLayout.OnSlideDetailsListener r1) {
            r0 = this;
            r0.mOnSlideDetailsListener = r1
            return
    }

    public void setPercent(float r1) {
            r0 = this;
            r0.mPercent = r1
            return
    }

    public void smoothClose(boolean r8) {
            r7 = this;
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = r7.mStatus
            com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.CLOSE
            if (r0 == r1) goto L1d
            r7.mStatus = r1
            int r0 = r7.getMeasuredHeight()
            int r0 = -r0
            float r2 = (float) r0
            if (r8 == 0) goto L14
            long r0 = r7.mDuration
        L12:
            r5 = r0
            goto L17
        L14:
            r0 = 0
            goto L12
        L17:
            r3 = 0
            r4 = 1
            r1 = r7
            r1.animatorSwitch(r2, r3, r4, r5)
        L1d:
            return
    }

    public void smoothOpen(boolean r8) {
            r7 = this;
            com.bxkj.student.common.view.SlideDetailsLayout$Status r0 = r7.mStatus
            com.bxkj.student.common.view.SlideDetailsLayout$Status r1 = com.bxkj.student.common.view.SlideDetailsLayout.Status.OPEN
            if (r0 == r1) goto L1d
            r7.mStatus = r1
            int r0 = r7.getMeasuredHeight()
            int r0 = -r0
            float r3 = (float) r0
            if (r8 == 0) goto L14
            long r0 = r7.mDuration
        L12:
            r5 = r0
            goto L17
        L14:
            r0 = 0
            goto L12
        L17:
            r2 = 0
            r4 = 1
            r1 = r7
            r1.animatorSwitch(r2, r3, r4, r5)
        L1d:
            return
    }
}

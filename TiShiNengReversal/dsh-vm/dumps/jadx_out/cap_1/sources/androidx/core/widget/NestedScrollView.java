package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NestedScrollView extends android.widget.FrameLayout implements androidx.core.view.NestedScrollingParent3, androidx.core.view.NestedScrollingChild3, androidx.core.view.ScrollingView {
    private static final androidx.core.widget.NestedScrollView.AccessibilityDelegate ACCESSIBILITY_DELEGATE = null;
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final float DECELERATION_RATE = 0.0f;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int[] SCROLLVIEW_STYLEABLE = null;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final java.lang.String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final androidx.core.view.NestedScrollingChildHelper mChildHelper;
    private android.view.View mChildToScrollTo;

    @androidx.annotation.VisibleForTesting
    androidx.core.view.DifferentialMotionFlingController mDifferentialMotionFlingController;

    @androidx.annotation.VisibleForTesting
    final androidx.core.widget.NestedScrollView.DifferentialMotionFlingTargetImpl mDifferentialMotionFlingTarget;

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @androidx.annotation.VisibleForTesting
    public android.widget.EdgeEffect mEdgeGlowBottom;

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    @androidx.annotation.VisibleForTesting
    public android.widget.EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private androidx.core.widget.NestedScrollView.OnScrollChangeListener mOnScrollChangeListener;
    private final androidx.core.view.NestedScrollingParentHelper mParentHelper;
    private final float mPhysicalCoeff;
    private androidx.core.widget.NestedScrollView.SavedState mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private android.widget.OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final android.graphics.Rect mTempRect;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        AccessibilityDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2, r3)
                androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r3.setClassName(r0)
                int r0 = r2.getScrollRange()
                if (r0 <= 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                r3.setScrollable(r0)
                int r0 = r2.getScrollX()
                r3.setScrollX(r0)
                int r0 = r2.getScrollY()
                r3.setScrollY(r0)
                int r0 = r2.getScrollX()
                androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollX(r3, r0)
                int r2 = r2.getScrollRange()
                androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollY(r3, r2)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r2 = this;
                super.onInitializeAccessibilityNodeInfo(r3, r4)
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r4.setClassName(r0)
                boolean r0 = r3.isEnabled()
                if (r0 == 0) goto L3e
                int r0 = r3.getScrollRange()
                if (r0 <= 0) goto L3e
                r1 = 1
                r4.setScrollable(r1)
                int r1 = r3.getScrollY()
                if (r1 <= 0) goto L2e
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r4.addAction(r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP
                r4.addAction(r1)
            L2e:
                int r3 = r3.getScrollY()
                if (r3 >= r0) goto L3e
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                r4.addAction(r3)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN
                r4.addAction(r3)
            L3e:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
                r4 = this;
                boolean r7 = super.performAccessibilityAction(r5, r6, r7)
                r0 = 1
                if (r7 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
                boolean r7 = r5.isEnabled()
                r1 = 0
                if (r7 != 0) goto L12
                return r1
            L12:
                int r7 = r5.getHeight()
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                android.graphics.Matrix r3 = r5.getMatrix()
                boolean r3 = r3.isIdentity()
                if (r3 == 0) goto L2f
                boolean r3 = r5.getGlobalVisibleRect(r2)
                if (r3 == 0) goto L2f
                int r7 = r2.height()
            L2f:
                r2 = 4096(0x1000, float:5.74E-42)
                if (r6 == r2) goto L60
                r2 = 8192(0x2000, float:1.148E-41)
                if (r6 == r2) goto L42
                r2 = 16908344(0x1020038, float:2.3877386E-38)
                if (r6 == r2) goto L42
                r2 = 16908346(0x102003a, float:2.3877392E-38)
                if (r6 == r2) goto L60
                return r1
            L42:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 - r7
                int r6 = java.lang.Math.max(r6, r1)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L5f
                r5.smoothScrollTo(r1, r6, r0)
                return r0
            L5f:
                return r1
            L60:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 + r7
                int r7 = r5.getScrollRange()
                int r6 = java.lang.Math.min(r6, r7)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L81
                r5.smoothScrollTo(r1, r6, r0)
                return r0
            L81:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean getClipToPadding(android.view.ViewGroup r0) {
                boolean r0 = r0.getClipToPadding()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class DifferentialMotionFlingTargetImpl implements androidx.core.view.DifferentialMotionFlingTarget {
        final /* synthetic */ androidx.core.widget.NestedScrollView this$0;

        DifferentialMotionFlingTargetImpl(androidx.core.widget.NestedScrollView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
                r1 = this;
                androidx.core.widget.NestedScrollView r0 = r1.this$0
                float r0 = r0.getVerticalScrollFactorCompat()
                float r0 = -r0
                return r0
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float r2) {
                r1 = this;
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                r2 = 0
                return r2
            L7:
                r1.stopDifferentialMotionFling()
                androidx.core.widget.NestedScrollView r0 = r1.this$0
                int r2 = (int) r2
                r0.fling(r2)
                r2 = 1
                return r2
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
                r1 = this;
                androidx.core.widget.NestedScrollView r0 = r1.this$0
                android.widget.OverScroller r0 = androidx.core.widget.NestedScrollView.access$000(r0)
                r0.abortAnimation()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnScrollChangeListener {
        void onScrollChange(@androidx.annotation.NonNull androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.SavedState> CREATOR = null;
        public int scrollPosition;


        static {
                androidx.core.widget.NestedScrollView$SavedState$1 r0 = new androidx.core.widget.NestedScrollView$SavedState$1
                r0.<init>()
                androidx.core.widget.NestedScrollView.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.scrollPosition = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                r0.append(r1)
                int r1 = r2.scrollPosition
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.scrollPosition
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.DECELERATION_RATE = r0
            androidx.core.widget.NestedScrollView$AccessibilityDelegate r0 = new androidx.core.widget.NestedScrollView$AccessibilityDelegate
            r0.<init>()
            androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE = r0
            return
    }

    public NestedScrollView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.core.R.attr.nestedScrollViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            r0 = 1
            r5.mIsLayoutDirty = r0
            r1 = 0
            r5.mIsLaidOut = r1
            r2 = 0
            r5.mChildToScrollTo = r2
            r5.mIsBeingDragged = r1
            r5.mSmoothScrollingEnabled = r0
            r2 = -1
            r5.mActivePointerId = r2
            r2 = 2
            int[] r3 = new int[r2]
            r5.mScrollOffset = r3
            int[] r2 = new int[r2]
            r5.mScrollConsumed = r2
            androidx.core.widget.NestedScrollView$DifferentialMotionFlingTargetImpl r2 = new androidx.core.widget.NestedScrollView$DifferentialMotionFlingTargetImpl
            r2.<init>(r5)
            r5.mDifferentialMotionFlingTarget = r2
            androidx.core.view.DifferentialMotionFlingController r3 = new androidx.core.view.DifferentialMotionFlingController
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r2)
            r5.mDifferentialMotionFlingController = r3
            android.widget.EdgeEffect r2 = androidx.core.widget.EdgeEffectCompat.create(r6, r7)
            r5.mEdgeGlowTop = r2
            android.widget.EdgeEffect r2 = androidx.core.widget.EdgeEffectCompat.create(r6, r7)
            r5.mEdgeGlowBottom = r2
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 * r3
            r3 = 1136724797(0x43c10b3d, float:386.0878)
            float r2 = r2 * r3
            r3 = 1062668861(0x3f570a3d, float:0.84)
            float r2 = r2 * r3
            r5.mPhysicalCoeff = r2
            r5.initScrollView()
            int[] r2 = androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r2, r8, r1)
            boolean r7 = r6.getBoolean(r1, r1)
            r5.setFillViewport(r7)
            r6.recycle()
            androidx.core.view.NestedScrollingParentHelper r6 = new androidx.core.view.NestedScrollingParentHelper
            r6.<init>(r5)
            r5.mParentHelper = r6
            androidx.core.view.NestedScrollingChildHelper r6 = new androidx.core.view.NestedScrollingChildHelper
            r6.<init>(r5)
            r5.mChildHelper = r6
            r5.setNestedScrollingEnabled(r0)
            androidx.core.widget.NestedScrollView$AccessibilityDelegate r6 = androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r6)
            return
    }

    private void abortAnimatedScroll() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.abortAnimation()
            r0 = 1
            r1.stopNestedScroll(r0)
            return
    }

    static /* synthetic */ android.widget.OverScroller access$000(androidx.core.widget.NestedScrollView r0) {
            android.widget.OverScroller r0 = r0.mScroller
            return r0
    }

    private boolean canOverScroll() {
            r2 = this;
            int r0 = r2.getOverScrollMode()
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto L10
            int r0 = r2.getScrollRange()
            if (r0 <= 0) goto L10
            goto L12
        L10:
            r0 = 0
            return r0
        L12:
            return r1
    }

    private boolean canScroll() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2d
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            if (r0 <= r2) goto L2d
            r0 = 1
            return r0
        L2d:
            return r1
    }

    private static int clamp(int r1, int r2, int r3) {
            if (r2 >= r3) goto Lc
            if (r1 >= 0) goto L5
            goto Lc
        L5:
            int r0 = r2 + r1
            if (r0 <= r3) goto Lb
            int r3 = r3 - r2
            return r3
        Lb:
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private void doScrollY(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            boolean r0 = r2.mSmoothScrollingEnabled
            r1 = 0
            if (r0 == 0) goto Lb
            r2.smoothScrollBy(r1, r3)
            return
        Lb:
            r2.scrollBy(r1, r3)
        Le:
            return
    }

    private boolean edgeEffectFling(int r4) {
            r3 = this;
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            r1 = 1
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1f
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            boolean r0 = r3.shouldAbsorb(r0, r4)
            if (r0 == 0) goto L1a
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            r0.onAbsorb(r4)
            return r1
        L1a:
            int r4 = -r4
            r3.fling(r4)
            return r1
        L1f:
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3c
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            int r4 = -r4
            boolean r0 = r3.shouldAbsorb(r0, r4)
            if (r0 == 0) goto L38
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            r0.onAbsorb(r4)
            return r1
        L38:
            r3.fling(r4)
            return r1
        L3c:
            r4 = 0
            return r4
    }

    private void endTouchDrag() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.recycleVelocityTracker()
            r1.stopNestedScroll(r0)
            android.widget.EdgeEffect r0 = r1.mEdgeGlowTop
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mEdgeGlowBottom
            r0.onRelease()
            return
    }

    private android.view.View findFocusableViewInBounds(boolean r13, int r14, int r15) {
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
    }

    private float getSplineFlingDistance(int r9) {
            r8 = this;
            int r9 = java.lang.Math.abs(r9)
            float r9 = (float) r9
            r0 = 1051931443(0x3eb33333, float:0.35)
            float r9 = r9 * r0
            float r0 = r8.mPhysicalCoeff
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r0 = r0 * r1
            float r9 = r9 / r0
            double r2 = (double) r9
            double r2 = java.lang.Math.log(r2)
            float r9 = androidx.core.widget.NestedScrollView.DECELERATION_RATE
            double r4 = (double) r9
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            float r0 = r8.mPhysicalCoeff
            float r0 = r0 * r1
            double r0 = (double) r0
            double r6 = (double) r9
            double r6 = r6 / r4
            double r6 = r6 * r2
            double r2 = java.lang.Math.exp(r6)
            double r0 = r0 * r2
            float r9 = (float) r0
            return r9
    }

    private boolean inChild(int r5, int r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2b
            int r0 = r4.getScrollY()
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r2.getTop()
            int r3 = r3 - r0
            if (r6 < r3) goto L2b
            int r3 = r2.getBottom()
            int r3 = r3 - r0
            if (r6 >= r3) goto L2b
            int r6 = r2.getLeft()
            if (r5 < r6) goto L2b
            int r6 = r2.getRight()
            if (r5 >= r6) goto L2b
            r5 = 1
            return r5
        L2b:
            return r1
    }

    private void initOrResetVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto Lb
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            return
        Lb:
            r0.clear()
            return
    }

    private void initScrollView() {
            r2 = this;
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mScroller = r0
            r0 = 1
            r2.setFocusable(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r0)
            r0 = 0
            r2.setWillNotDraw(r0)
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.mTouchSlop = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            r2.mMinimumVelocity = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.mMaximumVelocity = r0
            return
    }

    private void initVelocityTrackerIfNotExists() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
        La:
            return
    }

    private void initializeTouchDrag(int r1, int r2) {
            r0 = this;
            r0.mLastMotionY = r1
            r0.mActivePointerId = r2
            r1 = 2
            r2 = 0
            r0.startNestedScroll(r1, r2)
            return
    }

    private boolean isOffScreen(android.view.View r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.getHeight()
            boolean r3 = r2.isWithinDeltaOfScreen(r3, r0, r1)
            r3 = r3 ^ 1
            return r3
    }

    private static boolean isViewDescendantOf(android.view.View r2, android.view.View r3) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            boolean r2 = isViewDescendantOf(r2, r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    private boolean isWithinDeltaOfScreen(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.mTempRect
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.mTempRect
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r2.bottom
            int r2 = r2 + r3
            int r0 = r1.getScrollY()
            if (r2 < r0) goto L23
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r2.top
            int r2 = r2 - r3
            int r3 = r1.getScrollY()
            int r3 = r3 + r4
            if (r2 > r3) goto L23
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    private void onNestedScrollInternal(int r11, int r12, @androidx.annotation.Nullable int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r0 = 1
            r1 = r13[r0]
            int r1 = r1 + r4
            r13[r0] = r1
        L16:
            int r6 = r11 - r4
            androidx.core.view.NestedScrollingChildHelper r2 = r10.mChildHelper
            r5 = 0
            r7 = 0
            r3 = 0
            r8 = r12
            r9 = r13
            r2.dispatchNestedScroll(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mActivePointerId
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.mLastMotionY = r1
            int r4 = r4.getPointerId(r0)
            r3.mActivePointerId = r4
            android.view.VelocityTracker r4 = r3.mVelocityTracker
            if (r4 == 0) goto L25
            r4.clear()
        L25:
            return
    }

    private void recycleVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        La:
            return
    }

    private int releaseVerticalGlow(int r4, float r5) {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r4 = -r4
            float r4 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
    }

    private void runAnimatedScroll(boolean r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L8
            r2 = 2
            r1.startNestedScroll(r2, r0)
            goto Lb
        L8:
            r1.stopNestedScroll(r0)
        Lb:
            int r2 = r1.getScrollY()
            r1.mLastScrollerY = r2
            r1.postInvalidateOnAnimation()
            return
    }

    private boolean scrollAndFocus(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getHeight()
            int r1 = r6.getScrollY()
            int r0 = r0 + r1
            r2 = 33
            r3 = 0
            r4 = 1
            if (r7 != r2) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            android.view.View r5 = r6.findFocusableViewInBounds(r2, r8, r9)
            if (r5 != 0) goto L19
            r5 = r6
        L19:
            if (r8 < r1) goto L1e
            if (r9 > r0) goto L1e
            goto L28
        L1e:
            if (r2 == 0) goto L22
            int r8 = r8 - r1
            goto L24
        L22:
            int r8 = r9 - r0
        L24:
            r6.scrollBy(r8, r3, r4, r4)
            r3 = 1
        L28:
            android.view.View r8 = r6.findFocus()
            if (r5 == r8) goto L31
            r5.requestFocus(r7)
        L31:
            return r3
    }

    private int scrollBy(int r19, int r20, int r21, boolean r22) {
            r18 = this;
            r0 = r18
            r10 = r20
            r5 = r21
            r11 = 1
            if (r5 != r11) goto Ld
            r1 = 2
            r0.startNestedScroll(r1, r5)
        Ld:
            int[] r3 = r0.mScrollConsumed
            int[] r4 = r0.mScrollOffset
            r1 = 0
            r2 = r19
            boolean r1 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            r12 = r5
            r13 = 0
            if (r1 == 0) goto L29
            int[] r1 = r0.mScrollConsumed
            r1 = r1[r11]
            int r1 = r19 - r1
            int[] r2 = r0.mScrollOffset
            r2 = r2[r11]
            r14 = r2
            r2 = r1
            goto L2c
        L29:
            r2 = r19
            r14 = 0
        L2c:
            int r4 = r0.getScrollY()
            int r6 = r0.getScrollRange()
            boolean r1 = r0.canOverScroll()
            if (r1 == 0) goto L3e
            if (r22 != 0) goto L3e
            r15 = 1
            goto L3f
        L3e:
            r15 = 0
        L3f:
            r8 = 0
            r9 = 1
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            boolean r1 = r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r2
            r9 = r4
            if (r1 == 0) goto L56
            boolean r1 = r0.hasNestedScrollingParent(r12)
            if (r1 != 0) goto L56
            r16 = 1
            goto L58
        L56:
            r16 = 0
        L58:
            int r1 = r0.getScrollY()
            int r2 = r1 - r9
            int r4 = r8 - r2
            int[] r7 = r0.mScrollConsumed
            r7[r11] = r13
            r3 = 0
            int[] r5 = r0.mScrollOffset
            r1 = 0
            r17 = r12
            r12 = r6
            r6 = r17
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            r5 = r6
            int[] r1 = r0.mScrollOffset
            r1 = r1[r11]
            int r14 = r14 + r1
            int[] r1 = r0.mScrollConsumed
            r1 = r1[r11]
            int r2 = r8 - r1
            int r4 = r9 + r2
            if (r4 >= 0) goto La4
            if (r15 == 0) goto Lcb
            android.widget.EdgeEffect r1 = r0.mEdgeGlowTop
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = (float) r10
            int r4 = r0.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r1, r2, r3)
            android.widget.EdgeEffect r1 = r0.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lcb
            android.widget.EdgeEffect r1 = r0.mEdgeGlowBottom
            r1.onRelease()
            goto Lcb
        La4:
            if (r4 <= r12) goto Lcb
            if (r15 == 0) goto Lcb
            android.widget.EdgeEffect r1 = r0.mEdgeGlowBottom
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = (float) r10
            int r4 = r0.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r1, r2, r4)
            android.widget.EdgeEffect r1 = r0.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lcb
            android.widget.EdgeEffect r1 = r0.mEdgeGlowTop
            r1.onRelease()
        Lcb:
            android.widget.EdgeEffect r1 = r0.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto Ldf
            android.widget.EdgeEffect r1 = r0.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Ldc
            goto Ldf
        Ldc:
            r13 = r16
            goto Le2
        Ldf:
            r0.postInvalidateOnAnimation()
        Le2:
            if (r13 == 0) goto Led
            if (r5 != 0) goto Led
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            if (r1 == 0) goto Led
            r1.clear()
        Led:
            if (r5 != r11) goto Lfc
            r0.stopNestedScroll(r5)
            android.widget.EdgeEffect r1 = r0.mEdgeGlowTop
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.mEdgeGlowBottom
            r1.onRelease()
        Lfc:
            return r14
    }

    private void scrollToChild(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.mTempRect
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.mTempRect
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r1.computeScrollDeltaToGetChildRectOnScreen(r2)
            if (r2 == 0) goto L16
            r0 = 0
            r1.scrollBy(r0, r2)
        L16:
            return
    }

    private boolean scrollToChildRect(android.graphics.Rect r3, boolean r4) {
            r2 = this;
            int r3 = r2.computeScrollDeltaToGetChildRectOnScreen(r3)
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L15
            if (r4 == 0) goto L12
            r2.scrollBy(r0, r3)
            return r1
        L12:
            r2.smoothScrollBy(r0, r3)
        L15:
            return r1
    }

    private boolean shouldAbsorb(@androidx.annotation.NonNull android.widget.EdgeEffect r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 <= 0) goto L4
            return r0
        L4:
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r3)
            int r1 = r2.getHeight()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r4 = -r4
            float r4 = r2.getSplineFlingDistance(r4)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L19
            return r0
        L19:
            r3 = 0
            return r3
    }

    private void smoothScrollBy(int r9, int r10, int r11, boolean r12) {
            r8 = this;
            int r0 = r8.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r8.mLastScroll
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5a
            r9 = 0
            android.view.View r0 = r8.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            int r4 = r8.getScrollY()
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r9, r0)
            int r10 = r10 + r4
            int r10 = java.lang.Math.min(r10, r0)
            int r9 = java.lang.Math.max(r9, r10)
            int r6 = r9 - r4
            android.widget.OverScroller r2 = r8.mScroller
            int r3 = r8.getScrollX()
            r5 = 0
            r7 = r11
            r2.startScroll(r3, r4, r5, r6, r7)
            r8.runAnimatedScroll(r12)
            goto L68
        L5a:
            android.widget.OverScroller r11 = r8.mScroller
            boolean r11 = r11.isFinished()
            if (r11 != 0) goto L65
            r8.abortAnimatedScroll()
        L65:
            r8.scrollBy(r9, r10)
        L68:
            long r9 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r8.mLastScroll = r9
            return
    }

    private boolean stopGlowAnimations(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.mEdgeGlowTop
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            r1 = 1
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1d
            android.widget.EdgeEffect r0 = r5.mEdgeGlowTop
            float r3 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r2, r3)
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            android.widget.EdgeEffect r3 = r5.mEdgeGlowBottom
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L3b
            android.widget.EdgeEffect r0 = r5.mEdgeGlowBottom
            float r6 = r6.getX()
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r6 = r6 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r6
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r2, r3)
            return r1
        L3b:
            return r0
    }

    @Override // android.view.ViewGroup
    public void addView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ScrollView can host only one direct child"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    public boolean arrowScroll(int r9) {
            r8 = this;
            android.view.View r0 = r8.findFocus()
            if (r0 != r8) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r8, r0, r9)
            int r2 = r8.getMaxScrollAmount()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L38
            int r5 = r8.getHeight()
            boolean r5 = r8.isWithinDeltaOfScreen(r1, r2, r5)
            if (r5 == 0) goto L38
            android.graphics.Rect r2 = r8.mTempRect
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r8.mTempRect
            r8.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r2 = r8.mTempRect
            int r2 = r8.computeScrollDeltaToGetChildRectOnScreen(r2)
            r8.scrollBy(r2, r3, r4, r4)
            r1.requestFocus(r9)
            goto L7f
        L38:
            r1 = 33
            r5 = 130(0x82, float:1.82E-43)
            if (r9 != r1) goto L49
            int r1 = r8.getScrollY()
            if (r1 >= r2) goto L49
            int r2 = r8.getScrollY()
            goto L75
        L49:
            if (r9 != r5) goto L75
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L75
            android.view.View r1 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r1 = r1.getBottom()
            int r6 = r6.bottomMargin
            int r1 = r1 + r6
            int r6 = r8.getScrollY()
            int r7 = r8.getHeight()
            int r6 = r6 + r7
            int r7 = r8.getPaddingBottom()
            int r6 = r6 - r7
            int r1 = r1 - r6
            int r2 = java.lang.Math.min(r1, r2)
        L75:
            if (r2 != 0) goto L78
            return r3
        L78:
            if (r9 != r5) goto L7b
            goto L7c
        L7b:
            int r2 = -r2
        L7c:
            r8.scrollBy(r2, r3, r4, r4)
        L7f:
            if (r0 == 0) goto L9c
            boolean r9 = r0.isFocused()
            if (r9 == 0) goto L9c
            boolean r9 = r8.isOffScreen(r0)
            if (r9 == 0) goto L9c
            int r9 = r8.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r8.setDescendantFocusability(r0)
            r8.requestFocus()
            r8.setDescendantFocusability(r9)
        L9c:
            return r4
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r12 = this;
            android.widget.OverScroller r1 = r12.mScroller
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L9
            return
        L9:
            android.widget.OverScroller r1 = r12.mScroller
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r12.mScroller
            int r1 = r1.getCurrY()
            int r2 = r12.mLastScrollerY
            int r2 = r1 - r2
            int r2 = r12.consumeFlingInVerticalStretch(r2)
            r12.mLastScrollerY = r1
            int[] r3 = r12.mScrollConsumed
            r10 = 1
            r11 = 0
            r3[r10] = r11
            r4 = 0
            r5 = 1
            r1 = 0
            r0 = r12
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            int[] r1 = r12.mScrollConsumed
            r1 = r1[r10]
            int r2 = r2 - r1
            int r6 = r12.getScrollRange()
            if (r2 == 0) goto L63
            int r4 = r12.getScrollY()
            int r3 = r12.getScrollX()
            r8 = 0
            r9 = 0
            r1 = 0
            r5 = 0
            r7 = 0
            r0 = r12
            r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r6
            int r1 = r12.getScrollY()
            int r1 = r1 - r4
            int r4 = r2 - r1
            int[] r7 = r12.mScrollConsumed
            r7[r10] = r11
            int[] r5 = r12.mScrollOffset
            r6 = 1
            r2 = r1
            r1 = 0
            r3 = 0
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = r12.mScrollConsumed
            r1 = r1[r10]
            int r2 = r4 - r1
            goto L64
        L63:
            r8 = r6
        L64:
            if (r2 == 0) goto L9e
            int r1 = r12.getOverScrollMode()
            if (r1 == 0) goto L70
            if (r1 != r10) goto L9b
            if (r8 <= 0) goto L9b
        L70:
            if (r2 >= 0) goto L87
            android.widget.EdgeEffect r1 = r12.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L9b
            android.widget.EdgeEffect r1 = r12.mEdgeGlowTop
            android.widget.OverScroller r2 = r12.mScroller
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
            goto L9b
        L87:
            android.widget.EdgeEffect r1 = r12.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L9b
            android.widget.EdgeEffect r1 = r12.mEdgeGlowBottom
            android.widget.OverScroller r2 = r12.mScroller
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
        L9b:
            r12.abortAnimatedScroll()
        L9e:
            android.widget.OverScroller r1 = r12.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Laa
            r12.postInvalidateOnAnimation()
            return
        Laa:
            r12.stopNestedScroll(r10)
            return
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L59
            int r8 = r11.top
            if (r8 <= r2) goto L59
            int r1 = r11.height()
            if (r1 <= r0) goto L49
            int r11 = r11.top
            int r11 = r11 - r2
            goto L4c
        L49:
            int r11 = r11.bottom
            int r11 = r11 - r4
        L4c:
            int r0 = r5.getBottom()
            int r1 = r6.bottomMargin
            int r0 = r0 + r1
            int r0 = r0 - r3
            int r11 = java.lang.Math.min(r11, r0)
            return r11
        L59:
            int r3 = r11.top
            if (r3 >= r2) goto L78
            if (r7 >= r4) goto L78
            int r3 = r11.height()
            if (r3 <= r0) goto L6a
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L6e
        L6a:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L6e:
            int r11 = r10.getScrollY()
            int r11 = -r11
            int r11 = java.lang.Math.max(r1, r11)
            return r11
        L78:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
            r2 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r3 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r3 >= 0) goto L35
            int r2 = r2 - r3
            return r2
        L35:
            if (r3 <= r0) goto L39
            int r3 = r3 - r0
            int r2 = r2 + r3
        L39:
            return r2
    }

    int consumeFlingInVerticalStretch(int r6) {
            r5 = this;
            int r0 = r5.getHeight()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 1082130432(0x40800000, float:4.0)
            if (r6 <= 0) goto L33
            android.widget.EdgeEffect r4 = r5.mEdgeGlowTop
            float r4 = androidx.core.widget.EdgeEffectCompat.getDistance(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L33
            int r2 = -r6
            float r2 = (float) r2
            float r2 = r2 * r3
            float r4 = (float) r0
            float r2 = r2 / r4
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 / r3
            android.widget.EdgeEffect r3 = r5.mEdgeGlowTop
            float r1 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r2, r1)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            if (r0 == r6) goto L31
            android.widget.EdgeEffect r1 = r5.mEdgeGlowTop
            r1.finish()
        L31:
            int r6 = r6 - r0
            return r6
        L33:
            if (r6 >= 0) goto L59
            android.widget.EdgeEffect r4 = r5.mEdgeGlowBottom
            float r4 = androidx.core.widget.EdgeEffectCompat.getDistance(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L59
            float r2 = (float) r6
            float r2 = r2 * r3
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = r0 / r3
            android.widget.EdgeEffect r3 = r5.mEdgeGlowBottom
            float r1 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r2, r1)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            if (r0 == r6) goto L58
            android.widget.EdgeEffect r1 = r5.mEdgeGlowBottom
            r1.finish()
        L58:
            int r6 = r6 - r0
        L59:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.executeKeyEvent(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int r7, int r8, @androidx.annotation.Nullable int[] r9, @androidx.annotation.Nullable int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int r7, int r8, @androidx.annotation.Nullable int[] r9, @androidx.annotation.Nullable int[] r10, int r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int r9, int r10, int r11, int r12, @androidx.annotation.Nullable int[] r13, int r14, @androidx.annotation.NonNull int[] r15) {
            r8 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r8.mChildHelper
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, @androidx.annotation.Nullable int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, @androidx.annotation.Nullable int[] r12, int r13) {
            r7 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r7.mChildHelper
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.view.View
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r10) {
            r9 = this;
            super.draw(r10)
            int r0 = r9.getScrollY()
            android.widget.EdgeEffect r1 = r9.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            r2 = 0
            if (r1 != 0) goto L63
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = java.lang.Math.min(r2, r0)
            boolean r6 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r6 == 0) goto L35
            int r6 = r9.getPaddingLeft()
            int r7 = r9.getPaddingRight()
            int r6 = r6 + r7
            int r3 = r3 - r6
            int r6 = r9.getPaddingLeft()
            goto L36
        L35:
            r6 = 0
        L36:
            boolean r7 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r7 == 0) goto L4b
            int r7 = r9.getPaddingTop()
            int r8 = r9.getPaddingBottom()
            int r7 = r7 + r8
            int r4 = r4 - r7
            int r7 = r9.getPaddingTop()
            int r5 = r5 + r7
        L4b:
            float r6 = (float) r6
            float r5 = (float) r5
            r10.translate(r6, r5)
            android.widget.EdgeEffect r5 = r9.mEdgeGlowTop
            r5.setSize(r3, r4)
            android.widget.EdgeEffect r3 = r9.mEdgeGlowTop
            boolean r3 = r3.draw(r10)
            if (r3 == 0) goto L60
            r9.postInvalidateOnAnimation()
        L60:
            r10.restoreToCount(r1)
        L63:
            android.widget.EdgeEffect r1 = r9.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lc9
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = r9.getScrollRange()
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = r0 + r4
            boolean r5 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r5 == 0) goto L94
            int r2 = r9.getPaddingLeft()
            int r5 = r9.getPaddingRight()
            int r2 = r2 + r5
            int r3 = r3 - r2
            int r2 = r9.getPaddingLeft()
        L94:
            boolean r5 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r5 == 0) goto La9
            int r5 = r9.getPaddingTop()
            int r6 = r9.getPaddingBottom()
            int r5 = r5 + r6
            int r4 = r4 - r5
            int r5 = r9.getPaddingBottom()
            int r0 = r0 - r5
        La9:
            int r2 = r2 - r3
            float r2 = (float) r2
            float r0 = (float) r0
            r10.translate(r2, r0)
            float r0 = (float) r3
            r2 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r5, r0, r2)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowBottom
            r0.setSize(r3, r4)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowBottom
            boolean r0 = r0.draw(r10)
            if (r0 == 0) goto Lc6
            r9.postInvalidateOnAnimation()
        Lc6:
            r10.restoreToCount(r1)
        Lc9:
            return
    }

    public boolean executeKeyEvent(@androidx.annotation.NonNull android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.mTempRect
            r0.setEmpty()
            boolean r0 = r5.canScroll()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L37
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L36
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L36
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L22
            r6 = 0
        L22:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto L36
            if (r6 == r5) goto L36
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto L36
            r6 = 1
            return r6
        L36:
            return r1
        L37:
            int r0 = r6.getAction()
            if (r0 != 0) goto L9e
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L8e
            r3 = 20
            if (r0 == r3) goto L7e
            r3 = 62
            if (r0 == r3) goto L72
            r6 = 92
            if (r0 == r6) goto L6d
            r6 = 93
            if (r0 == r6) goto L68
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L64
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L60
            goto L9e
        L60:
            r5.pageScroll(r2)
            return r1
        L64:
            r5.pageScroll(r4)
            return r1
        L68:
            boolean r6 = r5.fullScroll(r2)
            return r6
        L6d:
            boolean r6 = r5.fullScroll(r4)
            return r6
        L72:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L7a
            r2 = 33
        L7a:
            r5.pageScroll(r2)
            return r1
        L7e:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L89
            boolean r6 = r5.fullScroll(r2)
            return r6
        L89:
            boolean r6 = r5.arrowScroll(r2)
            return r6
        L8e:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L99
            boolean r6 = r5.fullScroll(r4)
            return r6
        L99:
            boolean r6 = r5.arrowScroll(r4)
            return r6
        L9e:
            return r1
    }

    public void fling(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L22
            android.widget.OverScroller r1 = r12.mScroller
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r12.runAnimatedScroll(r13)
        L22:
            return
    }

    public boolean fullScroll(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.mTempRect
            r4.top = r1
            r4.bottom = r3
            if (r0 == 0) goto L3d
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L3d
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r2 = r5.mTempRect
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            r2.bottom = r0
            android.graphics.Rect r0 = r5.mTempRect
            int r1 = r0.bottom
            int r1 = r1 - r3
            r0.top = r1
        L3d:
            android.graphics.Rect r0 = r5.mTempRect
            int r1 = r0.top
            int r0 = r0.bottom
            boolean r6 = r5.scrollAndFocus(r6, r1, r0)
            return r6
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L33:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2f
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L2f:
            return r1
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.getVerticalFadingEdgeLength()
            int r1 = r2.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.mVerticalScrollFactor
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.mVerticalScrollFactor = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L35:
            float r0 = r5.mVerticalScrollFactor
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.hasNestedScrollingParent(r0)
            return r0
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.hasNestedScrollingParent(r2)
            return r2
    }

    public boolean isFillViewport() {
            r1 = this;
            boolean r0 = r1.mFillViewport
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public boolean isSmoothScrollingEnabled() {
            r1 = this;
            boolean r0 = r1.mSmoothScrollingEnabled
            return r0
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@androidx.annotation.NonNull android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r5 = r5.width
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r4, r0, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.leftMargin
            int r6 = r6 + r0
            int r0 = r5.rightMargin
            int r6 = r6 + r0
            int r6 = r6 + r4
            int r4 = r5.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r6, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.mIsLaidOut = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@androidx.annotation.NonNull android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L5b
            boolean r0 = r6.mIsBeingDragged
            if (r0 != 0) goto L5b
            r0 = 2
            boolean r1 = androidx.core.view.MotionEventCompat.isFromSource(r7, r0)
            r3 = 0
            if (r1 == 0) goto L21
            r0 = 9
            float r1 = r7.getAxisValue(r0)
            float r4 = r7.getX()
            int r4 = (int) r4
            goto L3d
        L21:
            r1 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = androidx.core.view.MotionEventCompat.isFromSource(r7, r1)
            if (r1 == 0) goto L3a
            r1 = 26
            float r4 = r7.getAxisValue(r1)
            int r5 = r6.getWidth()
            int r0 = r5 / 2
            r1 = r4
            r4 = r0
            r0 = 26
            goto L3d
        L3a:
            r0 = 0
            r1 = 0
            r4 = 0
        L3d:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L5b
            float r2 = r6.getVerticalScrollFactorCompat()
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.MotionEventCompat.isFromSource(r7, r2)
            int r1 = -r1
            r3 = 1
            r6.scrollBy(r1, r4, r3, r2)
            if (r0 == 0) goto L5a
            androidx.core.view.DifferentialMotionFlingController r1 = r6.mDifferentialMotionFlingController
            r1.onMotionEvent(r7, r0)
        L5a:
            return r3
        L5b:
            return r2
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r11.mIsBeingDragged
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L88
            r4 = -1
            if (r0 == r1) goto L63
            if (r0 == r2) goto L24
            r1 = 3
            if (r0 == r1) goto L63
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld8
        L1f:
            r11.onSecondaryPointerUp(r12)
            goto Ld8
        L24:
            int r0 = r11.mActivePointerId
            if (r0 != r4) goto L2a
            goto Ld8
        L2a:
            int r0 = r12.findPointerIndex(r0)
            if (r0 != r4) goto L32
            goto Ld8
        L32:
            float r0 = r12.getY(r0)
            int r0 = (int) r0
            int r4 = r11.mLastMotionY
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.mTouchSlop
            if (r4 <= r5) goto Ld8
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto Ld8
            r11.mIsBeingDragged = r1
            r11.mLastMotionY = r0
            r11.initVelocityTrackerIfNotExists()
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            r11.mNestedYOffset = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld8
            r12.requestDisallowInterceptTouchEvent(r1)
            goto Ld8
        L63:
            r11.mIsBeingDragged = r3
            r11.mActivePointerId = r4
            r11.recycleVelocityTracker()
            android.widget.OverScroller r4 = r11.mScroller
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r9 = 0
            int r10 = r11.getScrollRange()
            r7 = 0
            r8 = 0
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L84
            r11.postInvalidateOnAnimation()
        L84:
            r11.stopNestedScroll(r3)
            goto Ld8
        L88:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.inChild(r4, r0)
            if (r4 != 0) goto Lae
            boolean r12 = r11.stopGlowAnimations(r12)
            if (r12 != 0) goto La8
            android.widget.OverScroller r12 = r11.mScroller
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto La7
            goto La8
        La7:
            r1 = 0
        La8:
            r11.mIsBeingDragged = r1
            r11.recycleVelocityTracker()
            goto Ld8
        Lae:
            r11.mLastMotionY = r0
            int r0 = r12.getPointerId(r3)
            r11.mActivePointerId = r0
            r11.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            android.widget.OverScroller r0 = r11.mScroller
            r0.computeScrollOffset()
            boolean r12 = r11.stopGlowAnimations(r12)
            if (r12 != 0) goto Ld3
            android.widget.OverScroller r12 = r11.mScroller
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto Ld2
            goto Ld3
        Ld2:
            r1 = 0
        Ld3:
            r11.mIsBeingDragged = r1
            r11.startNestedScroll(r2, r3)
        Ld8:
            boolean r12 = r11.mIsBeingDragged
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            r4 = 0
            r3.mIsLayoutDirty = r4
            android.view.View r6 = r3.mChildToScrollTo
            if (r6 == 0) goto L16
            boolean r6 = isViewDescendantOf(r6, r2)
            if (r6 == 0) goto L16
            android.view.View r6 = r3.mChildToScrollTo
            r2.scrollToChild(r6)
        L16:
            r6 = 0
            r3.mChildToScrollTo = r6
            boolean r0 = r3.mIsLaidOut
            if (r0 != 0) goto L64
            androidx.core.widget.NestedScrollView$SavedState r0 = r3.mSavedState
            if (r0 == 0) goto L2e
            int r0 = r2.getScrollX()
            androidx.core.widget.NestedScrollView$SavedState r1 = r3.mSavedState
            int r1 = r1.scrollPosition
            r2.scrollTo(r0, r1)
            r3.mSavedState = r6
        L2e:
            int r6 = r2.getChildCount()
            if (r6 <= 0) goto L48
            android.view.View r4 = r2.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r4 = r4.getMeasuredHeight()
            int r0 = r6.topMargin
            int r4 = r4 + r0
            int r6 = r6.bottomMargin
            int r4 = r4 + r6
        L48:
            int r7 = r7 - r5
            int r5 = r2.getPaddingTop()
            int r7 = r7 - r5
            int r5 = r2.getPaddingBottom()
            int r7 = r7 - r5
            int r5 = r2.getScrollY()
            int r4 = clamp(r5, r7, r4)
            if (r4 == r5) goto L64
            int r5 = r2.getScrollX()
            r2.scrollTo(r5, r4)
        L64:
            int r4 = r2.getScrollX()
            int r5 = r2.getScrollY()
            r2.scrollTo(r4, r5)
            r4 = 1
            r3.mIsLaidOut = r4
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.mFillViewport
            if (r0 != 0) goto L8
            goto L58
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            goto L58
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r1 = r1 + r3
            int r3 = r0.leftMargin
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r1 = r1 + r3
            int r0 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.fling(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@androidx.annotation.NonNull android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@androidx.annotation.NonNull android.view.View r7, int r8, int r9, @androidx.annotation.NonNull int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@androidx.annotation.NonNull android.view.View r7, int r8, int r9, @androidx.annotation.NonNull int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.onNestedScrollInternal(r5, r1, r2)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.onNestedScrollInternal(r5, r6, r1)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3, int r4, int r5, int r6, @androidx.annotation.NonNull int[] r7) {
            r0 = this;
            r0.onNestedScrollInternal(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4, r5)
            r2 = 2
            r1.startNestedScroll(r2, r5)
            return
    }

    @Override // android.view.View
    protected void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L6
            r4 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 33
        Lb:
            if (r5 != 0) goto L17
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L1f
        L17:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L1f:
            r1 = 0
            if (r0 != 0) goto L23
            return r1
        L23:
            boolean r2 = r3.isOffScreen(r0)
            if (r2 == 0) goto L2a
            return r1
        L2a:
            boolean r4 = r0.requestFocus(r4, r5)
            return r4
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.widget.NestedScrollView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.core.widget.NestedScrollView$SavedState r2 = (androidx.core.widget.NestedScrollView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.mSavedState = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    @androidx.annotation.NonNull
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$SavedState r1 = new androidx.core.widget.NestedScrollView$SavedState
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.scrollPosition = r0
            return r1
    }

    @Override // android.view.View
    protected void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            androidx.core.widget.NestedScrollView$OnScrollChangeListener r0 = r6.mOnScrollChangeListener
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.onScrollChange(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L26
            if (r0 != r1) goto Lc
            goto L26
        Lc:
            r2 = 0
            boolean r2 = r0.isWithinDeltaOfScreen(r1, r2, r4)
            if (r2 == 0) goto L26
            android.graphics.Rect r2 = r0.mTempRect
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r0.mTempRect
            r0.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r1 = r0.mTempRect
            int r1 = r0.computeScrollDeltaToGetChildRectOnScreen(r1)
            r0.doScrollY(r1)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@androidx.annotation.NonNull android.view.View r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onStopNestedScroll(r2, r3)
            r1.stopNestedScroll(r3)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r13) {
            r12 = this;
            r12.initVelocityTrackerIfNotExists()
            int r0 = r13.getActionMasked()
            r1 = 0
            if (r0 != 0) goto Lc
            r12.mNestedYOffset = r1
        Lc:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r13)
            int r3 = r12.mNestedYOffset
            float r3 = (float) r3
            r4 = 0
            r2.offsetLocation(r4, r3)
            r3 = 1
            if (r0 == 0) goto L117
            if (r0 == r3) goto Lcb
            r4 = 2
            if (r0 == r4) goto L78
            r1 = 3
            if (r0 == r1) goto L4f
            r1 = 5
            if (r0 == r1) goto L3c
            r1 = 6
            if (r0 == r1) goto L2a
            goto L142
        L2a:
            r12.onSecondaryPointerUp(r13)
            int r0 = r12.mActivePointerId
            int r0 = r13.findPointerIndex(r0)
            float r13 = r13.getY(r0)
            int r13 = (int) r13
            r12.mLastMotionY = r13
            goto L142
        L3c:
            int r0 = r13.getActionIndex()
            float r1 = r13.getY(r0)
            int r1 = (int) r1
            r12.mLastMotionY = r1
            int r13 = r13.getPointerId(r0)
            r12.mActivePointerId = r13
            goto L142
        L4f:
            boolean r13 = r12.mIsBeingDragged
            if (r13 == 0) goto L73
            int r13 = r12.getChildCount()
            if (r13 <= 0) goto L73
            android.widget.OverScroller r4 = r12.mScroller
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r9 = 0
            int r10 = r12.getScrollRange()
            r7 = 0
            r8 = 0
            boolean r13 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L73
            r12.postInvalidateOnAnimation()
        L73:
            r12.endTouchDrag()
            goto L142
        L78:
            int r0 = r12.mActivePointerId
            int r0 = r13.findPointerIndex(r0)
            r4 = -1
            if (r0 != r4) goto L83
            goto L142
        L83:
            float r4 = r13.getY(r0)
            int r4 = (int) r4
            int r5 = r12.mLastMotionY
            int r5 = r5 - r4
            float r6 = r13.getX(r0)
            int r6 = r12.releaseVerticalGlow(r5, r6)
            int r5 = r5 - r6
            boolean r6 = r12.mIsBeingDragged
            if (r6 != 0) goto Lb4
            int r6 = java.lang.Math.abs(r5)
            int r7 = r12.mTouchSlop
            if (r6 <= r7) goto Lb4
            android.view.ViewParent r6 = r12.getParent()
            if (r6 == 0) goto La9
            r6.requestDisallowInterceptTouchEvent(r3)
        La9:
            r12.mIsBeingDragged = r3
            if (r5 <= 0) goto Lb1
            int r6 = r12.mTouchSlop
            int r5 = r5 - r6
            goto Lb4
        Lb1:
            int r6 = r12.mTouchSlop
            int r5 = r5 + r6
        Lb4:
            boolean r6 = r12.mIsBeingDragged
            if (r6 == 0) goto L142
            float r13 = r13.getX(r0)
            int r13 = (int) r13
            int r13 = r12.scrollBy(r5, r13, r1, r1)
            int r4 = r4 - r13
            r12.mLastMotionY = r4
            int r0 = r12.mNestedYOffset
            int r0 = r0 + r13
            r12.mNestedYOffset = r0
            goto L142
        Lcb:
            android.view.VelocityTracker r13 = r12.mVelocityTracker
            int r0 = r12.mMaximumVelocity
            float r0 = (float) r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r13.computeCurrentVelocity(r1, r0)
            int r0 = r12.mActivePointerId
            float r13 = r13.getYVelocity(r0)
            int r13 = (int) r13
            int r0 = java.lang.Math.abs(r13)
            int r1 = r12.mMinimumVelocity
            if (r0 < r1) goto Lf9
            boolean r0 = r12.edgeEffectFling(r13)
            if (r0 != 0) goto L113
            int r13 = -r13
            float r0 = (float) r13
            boolean r1 = r12.dispatchNestedPreFling(r4, r0)
            if (r1 != 0) goto L113
            r12.dispatchNestedFling(r4, r0, r3)
            r12.fling(r13)
            goto L113
        Lf9:
            android.widget.OverScroller r5 = r12.mScroller
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L113
            r12.postInvalidateOnAnimation()
        L113:
            r12.endTouchDrag()
            goto L142
        L117:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L11e
            return r1
        L11e:
            boolean r0 = r12.mIsBeingDragged
            if (r0 == 0) goto L12b
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L12b
            r0.requestDisallowInterceptTouchEvent(r3)
        L12b:
            android.widget.OverScroller r0 = r12.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L136
            r12.abortAnimatedScroll()
        L136:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r13 = r13.getPointerId(r1)
            r12.initializeTouchDrag(r0, r13)
        L142:
            android.view.VelocityTracker r13 = r12.mVelocityTracker
            if (r13 == 0) goto L149
            r13.addMovement(r2)
        L149:
            r2.recycle()
            return r3
    }

    boolean overScrollByCompat(int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, boolean r20) {
            r11 = this;
            int r0 = r11.getOverScrollMode()
            int r1 = r11.computeHorizontalScrollRange()
            int r2 = r11.computeHorizontalScrollExtent()
            r3 = 0
            r4 = 1
            if (r1 <= r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            int r2 = r11.computeVerticalScrollRange()
            int r5 = r11.computeVerticalScrollExtent()
            if (r2 <= r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r0 == 0) goto L29
            if (r0 != r4) goto L27
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            if (r0 == 0) goto L33
            if (r0 != r4) goto L31
            if (r2 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            int r2 = r14 + r12
            if (r1 != 0) goto L3a
            r1 = 0
            goto L3c
        L3a:
            r1 = r18
        L3c:
            int r5 = r15 + r13
            if (r0 != 0) goto L42
            r0 = 0
            goto L44
        L42:
            r0 = r19
        L44:
            int r6 = -r1
            int r1 = r1 + r16
            int r7 = -r0
            int r0 = r0 + r17
            if (r2 <= r1) goto L4f
            r2 = r1
        L4d:
            r1 = 1
            goto L54
        L4f:
            if (r2 >= r6) goto L53
            r2 = r6
            goto L4d
        L53:
            r1 = 0
        L54:
            if (r5 <= r0) goto L59
            r5 = r0
        L57:
            r0 = 1
            goto L5e
        L59:
            if (r5 >= r7) goto L5d
            r5 = r7
            goto L57
        L5d:
            r0 = 0
        L5e:
            if (r0 == 0) goto L7e
            boolean r6 = r11.hasNestedScrollingParent(r4)
            if (r6 != 0) goto L7e
            android.widget.OverScroller r6 = r11.mScroller
            r7 = 0
            int r8 = r11.getScrollRange()
            r9 = 0
            r10 = 0
            r13 = r2
            r14 = r5
            r12 = r6
            r18 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r12.springBack(r13, r14, r15, r16, r17, r18)
            r6 = r13
            goto L7f
        L7e:
            r6 = r2
        L7f:
            r11.onOverScrolled(r6, r5, r1, r0)
            if (r1 != 0) goto L88
            if (r0 == 0) goto L87
            goto L88
        L87:
            return r3
        L88:
            return r4
    }

    public boolean pageScroll(int r5) {
            r4 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            int r3 = r4.getHeight()
            if (r0 == 0) goto L40
            android.graphics.Rect r0 = r4.mTempRect
            int r1 = r4.getScrollY()
            int r1 = r1 + r3
            r0.top = r1
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L51
            int r0 = r0 - r2
            android.view.View r0 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getPaddingBottom()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r4.mTempRect
            int r2 = r1.top
            int r2 = r2 + r3
            if (r2 <= r0) goto L51
            int r0 = r0 - r3
            r1.top = r0
            goto L51
        L40:
            android.graphics.Rect r0 = r4.mTempRect
            int r2 = r4.getScrollY()
            int r2 = r2 - r3
            r0.top = r2
            android.graphics.Rect r0 = r4.mTempRect
            int r2 = r0.top
            if (r2 >= 0) goto L51
            r0.top = r1
        L51:
            android.graphics.Rect r0 = r4.mTempRect
            int r1 = r0.top
            int r3 = r3 + r1
            r0.bottom = r3
            boolean r5 = r4.scrollAndFocus(r5, r1, r3)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.mIsLayoutDirty
            if (r0 != 0) goto L8
            r1.scrollToChild(r3)
            goto La
        L8:
            r1.mChildToScrollTo = r3
        La:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            boolean r3 = r2.scrollToChildRect(r4, r5)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.recycleVelocityTracker()
        L5:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.mIsLayoutDirty = r0
            super.requestLayout()
            return
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L58
            r0 = 0
            android.view.View r0 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r0 = r0.getHeight()
            int r5 = r1.topMargin
            int r0 = r0 + r5
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r7 = clamp(r7, r2, r3)
            int r8 = clamp(r8, r4, r0)
            int r0 = r6.getScrollX()
            if (r7 != r0) goto L55
            int r0 = r6.getScrollY()
            if (r8 == r0) goto L58
        L55:
            super.scrollTo(r7, r8)
        L58:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFillViewport
            if (r2 == r0) goto L9
            r1.mFillViewport = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnScrollChangeListener(@androidx.annotation.Nullable androidx.core.widget.NestedScrollView.OnScrollChangeListener r1) {
            r0 = this;
            r0.mOnScrollChangeListener = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.mSmoothScrollingEnabled = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void smoothScrollBy(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollBy(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollBy(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollBy(r2, r3, r4, r0)
            return
    }

    public final void smoothScrollTo(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollTo(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollTo(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r4, r0)
            return
    }

    void smoothScrollTo(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            int r0 = r1.getScrollX()
            int r2 = r2 - r0
            int r0 = r1.getScrollY()
            int r3 = r3 - r0
            r1.smoothScrollBy(r2, r3, r4, r5)
            return
    }

    void smoothScrollTo(int r2, int r3, boolean r4) {
            r1 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1.smoothScrollTo(r2, r3, r0, r4)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.startNestedScroll(r2, r0)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.startNestedScroll(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.stopNestedScroll(r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            r0.stopNestedScroll(r2)
            return
    }
}

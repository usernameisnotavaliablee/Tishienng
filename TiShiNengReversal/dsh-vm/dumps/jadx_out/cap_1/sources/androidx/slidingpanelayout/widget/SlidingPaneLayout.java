package androidx.slidingpanelayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SlidingPaneLayout extends android.view.ViewGroup {
    private static final int DEFAULT_FADE_COLOR = -858993460;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final java.lang.String TAG = "SlidingPaneLayout";
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final androidx.customview.widget.ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private java.lang.reflect.Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    final java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private java.lang.reflect.Field mRecreateDisplayList;
    private android.graphics.drawable.Drawable mShadowDrawableLeft;
    private android.graphics.drawable.Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    android.view.View mSlideableView;
    private int mSliderFadeColor;
    private final android.graphics.Rect mTmpRect;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect mTmpRect;
        final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout this$0;

        AccessibilityDelegate(androidx.slidingpanelayout.widget.SlidingPaneLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mTmpRect = r1
                return
        }

        private void copyNodeInfoNoChildren(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r1 = this;
                android.graphics.Rect r0 = r1.mTmpRect
                r3.getBoundsInParent(r0)
                r2.setBoundsInParent(r0)
                r3.getBoundsInScreen(r0)
                r2.setBoundsInScreen(r0)
                boolean r0 = r3.isVisibleToUser()
                r2.setVisibleToUser(r0)
                java.lang.CharSequence r0 = r3.getPackageName()
                r2.setPackageName(r0)
                java.lang.CharSequence r0 = r3.getClassName()
                r2.setClassName(r0)
                java.lang.CharSequence r0 = r3.getContentDescription()
                r2.setContentDescription(r0)
                boolean r0 = r3.isEnabled()
                r2.setEnabled(r0)
                boolean r0 = r3.isClickable()
                r2.setClickable(r0)
                boolean r0 = r3.isFocusable()
                r2.setFocusable(r0)
                boolean r0 = r3.isFocused()
                r2.setFocused(r0)
                boolean r0 = r3.isAccessibilityFocused()
                r2.setAccessibilityFocused(r0)
                boolean r0 = r3.isSelected()
                r2.setSelected(r0)
                boolean r0 = r3.isLongClickable()
                r2.setLongClickable(r0)
                int r0 = r3.getActions()
                r2.addAction(r0)
                int r3 = r3.getMovementGranularities()
                r2.setMovementGranularities(r3)
                return
        }

        public boolean filter(android.view.View r2) {
                r1 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r1.this$0
                boolean r2 = r0.isDimmed(r2)
                return r2
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                super.onInitializeAccessibilityEvent(r1, r2)
                java.lang.Class<androidx.slidingpanelayout.widget.SlidingPaneLayout> r1 = androidx.slidingpanelayout.widget.SlidingPaneLayout.class
                java.lang.String r1 = r1.getName()
                r2.setClassName(r1)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r4, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5) {
                r3 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r5)
                super.onInitializeAccessibilityNodeInfo(r4, r0)
                r3.copyNodeInfoNoChildren(r5, r0)
                r0.recycle()
                java.lang.Class<androidx.slidingpanelayout.widget.SlidingPaneLayout> r0 = androidx.slidingpanelayout.widget.SlidingPaneLayout.class
                java.lang.String r0 = r0.getName()
                r5.setClassName(r0)
                r5.setSource(r4)
                android.view.ViewParent r4 = androidx.core.view.ViewCompat.getParentForAccessibility(r4)
                boolean r0 = r4 instanceof android.view.View
                if (r0 == 0) goto L26
                android.view.View r4 = (android.view.View) r4
                r5.setParent(r4)
            L26:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r3.this$0
                int r4 = r4.getChildCount()
                r0 = 0
            L2d:
                if (r0 >= r4) goto L4b
                androidx.slidingpanelayout.widget.SlidingPaneLayout r1 = r3.this$0
                android.view.View r1 = r1.getChildAt(r0)
                boolean r2 = r3.filter(r1)
                if (r2 != 0) goto L48
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L48
                r2 = 1
                androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r2)
                r5.addChild(r1)
            L48:
                int r0 = r0 + 1
                goto L2d
            L4b:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                boolean r0 = r1.filter(r3)
                if (r0 != 0) goto Lb
                boolean r2 = super.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
            Lb:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DisableLayerRunnable implements java.lang.Runnable {
        final android.view.View mChildView;
        final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout this$0;

        DisableLayerRunnable(androidx.slidingpanelayout.widget.SlidingPaneLayout r1, android.view.View r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mChildView = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.view.View r0 = r3.mChildView
                android.view.ViewParent r0 = r0.getParent()
                androidx.slidingpanelayout.widget.SlidingPaneLayout r1 = r3.this$0
                if (r0 != r1) goto L18
                android.view.View r0 = r3.mChildView
                r1 = 0
                r2 = 0
                r0.setLayerType(r1, r2)
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r3.this$0
                android.view.View r1 = r3.mChildView
                r0.invalidateChildRegion(r1)
            L18:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r3.this$0
                java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable> r0 = r0.mPostedRunnables
                r0.remove(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DragHelperCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout this$0;

        DragHelperCallback(androidx.slidingpanelayout.widget.SlidingPaneLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View r2, int r3, int r4) {
                r1 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = r1.this$0
                android.view.View r2 = r2.mSlideableView
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r2
                androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r1.this$0
                boolean r4 = r4.isLayoutRtlSupport()
                if (r4 == 0) goto L3a
                androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r1.this$0
                int r4 = r4.getWidth()
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r1.this$0
                int r0 = r0.getPaddingRight()
                int r2 = r2.rightMargin
                int r0 = r0 + r2
                androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = r1.this$0
                android.view.View r2 = r2.mSlideableView
                int r2 = r2.getWidth()
                int r0 = r0 + r2
                int r4 = r4 - r0
                androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = r1.this$0
                int r2 = r2.mSlideRange
                int r2 = r4 - r2
                int r3 = java.lang.Math.min(r3, r4)
                int r2 = java.lang.Math.max(r3, r2)
                return r2
            L3a:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r1.this$0
                int r4 = r4.getPaddingLeft()
                int r2 = r2.leftMargin
                int r4 = r4 + r2
                androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = r1.this$0
                int r2 = r2.mSlideRange
                int r2 = r2 + r4
                int r3 = java.lang.Math.max(r3, r4)
                int r2 = java.lang.Math.min(r3, r2)
                return r2
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View r1) {
                r0 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r1 = r0.this$0
                int r1 = r1.mSlideRange
                return r1
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int r2, int r3) {
                r1 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = r1.this$0
                androidx.customview.widget.ViewDragHelper r0 = r2.mDragHelper
                android.view.View r2 = r2.mSlideableView
                r0.captureChildView(r2, r3)
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View r1, int r2) {
                r0 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r1 = r0.this$0
                r1.setAllChildrenVisible()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int r3) {
                r2 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r3 = r2.this$0
                androidx.customview.widget.ViewDragHelper r3 = r3.mDragHelper
                int r3 = r3.getViewDragState()
                if (r3 != 0) goto L2f
                androidx.slidingpanelayout.widget.SlidingPaneLayout r3 = r2.this$0
                float r0 = r3.mSlideOffset
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L25
                android.view.View r0 = r3.mSlideableView
                r3.updateObscuredViewsVisibility(r0)
                androidx.slidingpanelayout.widget.SlidingPaneLayout r3 = r2.this$0
                android.view.View r0 = r3.mSlideableView
                r3.dispatchOnPanelClosed(r0)
                androidx.slidingpanelayout.widget.SlidingPaneLayout r3 = r2.this$0
                r0 = 0
                r3.mPreservedOpenState = r0
                return
            L25:
                android.view.View r0 = r3.mSlideableView
                r3.dispatchOnPanelOpened(r0)
                androidx.slidingpanelayout.widget.SlidingPaneLayout r3 = r2.this$0
                r0 = 1
                r3.mPreservedOpenState = r0
            L2f:
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r1 = r0.this$0
                r1.onPanelDragged(r2)
                androidx.slidingpanelayout.widget.SlidingPaneLayout r1 = r0.this$0
                r1.invalidate()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View r4, float r5, float r6) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
                androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r6 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r6
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r3.this$0
                boolean r0 = r0.isLayoutRtlSupport()
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 0
                if (r0 == 0) goto L40
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r3.this$0
                int r0 = r0.getPaddingRight()
                int r6 = r6.rightMargin
                int r0 = r0 + r6
                int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r6 < 0) goto L2a
                int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r5 != 0) goto L2f
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r3.this$0
                float r5 = r5.mSlideOffset
                int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r5 <= 0) goto L2f
            L2a:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r3.this$0
                int r5 = r5.mSlideRange
                int r0 = r0 + r5
            L2f:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r3.this$0
                android.view.View r5 = r5.mSlideableView
                int r5 = r5.getWidth()
                androidx.slidingpanelayout.widget.SlidingPaneLayout r6 = r3.this$0
                int r6 = r6.getWidth()
                int r6 = r6 - r0
                int r6 = r6 - r5
                goto L5c
            L40:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = r3.this$0
                int r0 = r0.getPaddingLeft()
                int r6 = r6.leftMargin
                int r6 = r6 + r0
                int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r5 > 0) goto L57
                if (r5 != 0) goto L5c
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r3.this$0
                float r5 = r5.mSlideOffset
                int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r5 <= 0) goto L5c
            L57:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r3.this$0
                int r5 = r5.mSlideRange
                int r6 = r6 + r5
            L5c:
                androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r3.this$0
                androidx.customview.widget.ViewDragHelper r5 = r5.mDragHelper
                int r4 = r4.getTop()
                r5.settleCapturedViewAt(r6, r4)
                androidx.slidingpanelayout.widget.SlidingPaneLayout r4 = r3.this$0
                r4.invalidate()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View r1, int r2) {
                r0 = this;
                androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = r0.this$0
                boolean r2 = r2.mIsUnableToDrag
                if (r2 == 0) goto L8
                r1 = 0
                return r1
            L8:
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
                boolean r1 = r1.slideable
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = null;
        android.graphics.Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        static {
                r0 = 16843137(0x1010181, float:2.3694637E-38)
                int[] r0 = new int[]{r0}
                androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams.ATTRS = r0
                return
        }

        public LayoutParams() {
                r1 = this;
                r0 = -1
                r1.<init>(r0, r0)
                r0 = 0
                r1.weight = r0
                return
        }

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.weight = r1
                return
        }

        public LayoutParams(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.weight = r0
                int[] r1 = androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams.ATTRS
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                r4 = 0
                float r4 = r3.getFloat(r4, r0)
                r2.weight = r4
                r3.recycle()
                return
        }

        public LayoutParams(@androidx.annotation.NonNull android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.weight = r1
                return
        }

        public LayoutParams(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.weight = r1
                return
        }

        public LayoutParams(@androidx.annotation.NonNull androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.weight = r0
                float r2 = r2.weight
                r1.weight = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PanelSlideListener {
        void onPanelClosed(@androidx.annotation.NonNull android.view.View r1);

        void onPanelOpened(@androidx.annotation.NonNull android.view.View r1);

        void onPanelSlide(@androidx.annotation.NonNull android.view.View r1, float r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState> CREATOR = null;
        boolean isOpen;


        static {
                androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$1 r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$1
                r0.<init>()
                androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.isOpen = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.isOpen
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SimplePanelSlideListener implements androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener {
        public SimplePanelSlideListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    public SlidingPaneLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SlidingPaneLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SlidingPaneLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r3 = -858993460(0xffffffffcccccccc, float:-1.0737418E8)
            r1.mSliderFadeColor = r3
            r3 = 1
            r1.mFirstLayout = r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.mTmpRect = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.mPostedRunnables = r4
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r4 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            r1.mOverhangSize = r4
            r4 = 0
            r1.setWillNotDraw(r4)
            androidx.slidingpanelayout.widget.SlidingPaneLayout$AccessibilityDelegate r4 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$AccessibilityDelegate
            r4.<init>(r1)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r4)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r3)
            androidx.slidingpanelayout.widget.SlidingPaneLayout$DragHelperCallback r3 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$DragHelperCallback
            r3.<init>(r1)
            androidx.customview.widget.ViewDragHelper r3 = androidx.customview.widget.ViewDragHelper.create(r1, r0, r3)
            r1.mDragHelper = r3
            r4 = 1137180672(0x43c80000, float:400.0)
            float r2 = r2 * r4
            r3.setMinVelocity(r2)
            return
    }

    private boolean closePane(android.view.View r2, int r3) {
            r1 = this;
            boolean r2 = r1.mFirstLayout
            r0 = 0
            if (r2 != 0) goto Le
            r2 = 0
            boolean r2 = r1.smoothSlideTo(r2, r3)
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            r1.mPreservedOpenState = r0
            r2 = 1
            return r2
    }

    private void dimChildView(android.view.View r4, float r5, int r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r0
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L44
            if (r6 == 0) goto L44
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r6
            int r1 = r1 >>> 24
            float r1 = (float) r1
            float r1 = r1 * r5
            int r5 = (int) r1
            int r5 = r5 << 24
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r1
            r5 = r5 | r6
            android.graphics.Paint r6 = r0.dimPaint
            if (r6 != 0) goto L28
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r0.dimPaint = r6
        L28:
            android.graphics.Paint r6 = r0.dimPaint
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OVER
            r1.<init>(r5, r2)
            r6.setColorFilter(r1)
            int r5 = r4.getLayerType()
            r6 = 2
            if (r5 == r6) goto L40
            android.graphics.Paint r5 = r0.dimPaint
            r4.setLayerType(r6, r5)
        L40:
            r3.invalidateChildRegion(r4)
            return
        L44:
            int r5 = r4.getLayerType()
            if (r5 == 0) goto L5f
            android.graphics.Paint r5 = r0.dimPaint
            if (r5 == 0) goto L52
            r6 = 0
            r5.setColorFilter(r6)
        L52:
            androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable r5 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable
            r5.<init>(r3, r4)
            java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable> r4 = r3.mPostedRunnables
            r4.add(r5)
            androidx.core.view.ViewCompat.postOnAnimation(r3, r5)
        L5f:
            return
    }

    private boolean openPane(android.view.View r1, int r2) {
            r0 = this;
            boolean r1 = r0.mFirstLayout
            if (r1 != 0) goto Lf
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r0.smoothSlideTo(r1, r2)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            r0.mPreservedOpenState = r1
            return r1
    }

    private void parallaxOtherViews(float r10) {
            r9 = this;
            boolean r0 = r9.isLayoutRtlSupport()
            android.view.View r1 = r9.mSlideableView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.dimWhenOffset
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L59
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.mSlideableView
            if (r4 != r5) goto L2c
            goto L56
        L2c:
            float r5 = r9.mParallaxOffset
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.mParallaxBy
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.mParallaxOffset = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L44
            int r5 = -r5
        L44:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L56
            float r5 = r9.mParallaxOffset
            if (r0 == 0) goto L4f
            float r5 = r5 - r6
            goto L51
        L4f:
            float r5 = r6 - r5
        L51:
            int r6 = r9.mCoveredFadeColor
            r9.dimChildView(r4, r5, r6)
        L56:
            int r3 = r3 + 1
            goto L21
        L59:
            return
    }

    private static boolean viewIsOpaque(android.view.View r0) {
            boolean r0 = r0.isOpaque()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    protected boolean canScroll(android.view.View r12, boolean r13, int r14, int r15, int r16) {
            r11 = this;
            boolean r0 = r12 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L50
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            int r4 = r0.getChildCount()
            int r4 = r4 - r1
        L15:
            if (r4 < 0) goto L50
            android.view.View r6 = r0.getChildAt(r4)
            int r5 = r15 + r2
            int r7 = r6.getLeft()
            if (r5 < r7) goto L4d
            int r7 = r6.getRight()
            if (r5 >= r7) goto L4d
            int r7 = r16 + r3
            int r8 = r6.getTop()
            if (r7 < r8) goto L4d
            int r8 = r6.getBottom()
            if (r7 >= r8) goto L4d
            int r8 = r6.getLeft()
            int r9 = r5 - r8
            int r5 = r6.getTop()
            int r10 = r7 - r5
            r7 = 1
            r5 = r11
            r8 = r14
            boolean r6 = r5.canScroll(r6, r7, r8, r9, r10)
            if (r6 == 0) goto L4d
            return r1
        L4d:
            int r4 = r4 + (-1)
            goto L15
        L50:
            if (r13 == 0) goto L61
            boolean r13 = r11.isLayoutRtlSupport()
            if (r13 == 0) goto L59
            goto L5a
        L59:
            int r14 = -r14
        L5a:
            boolean r12 = r12.canScrollHorizontally(r14)
            if (r12 == 0) goto L61
            return r1
        L61:
            r12 = 0
            return r12
    }

    @java.lang.Deprecated
    public boolean canSlide() {
            r1 = this;
            boolean r0 = r1.mCanSlide
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public boolean closePane() {
            r2 = this;
            android.view.View r0 = r2.mSlideableView
            r1 = 0
            boolean r0 = r2.closePane(r0, r1)
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r2 = this;
            androidx.customview.widget.ViewDragHelper r0 = r2.mDragHelper
            r1 = 1
            boolean r0 = r0.continueSettling(r1)
            if (r0 == 0) goto L16
            boolean r0 = r2.mCanSlide
            if (r0 != 0) goto L13
            androidx.customview.widget.ViewDragHelper r0 = r2.mDragHelper
            r0.abort()
            return
        L13:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L16:
            return
    }

    void dispatchOnPanelClosed(android.view.View r2) {
            r1 = this;
            androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener r0 = r1.mPanelSlideListener
            if (r0 == 0) goto L7
            r0.onPanelClosed(r2)
        L7:
            r2 = 32
            r1.sendAccessibilityEvent(r2)
            return
    }

    void dispatchOnPanelOpened(android.view.View r2) {
            r1 = this;
            androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener r0 = r1.mPanelSlideListener
            if (r0 == 0) goto L7
            r0.onPanelOpened(r2)
        L7:
            r2 = 32
            r1.sendAccessibilityEvent(r2)
            return
    }

    void dispatchOnPanelSlide(android.view.View r3) {
            r2 = this;
            androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener r0 = r2.mPanelSlideListener
            if (r0 == 0) goto L9
            float r1 = r2.mSlideOffset
            r0.onPanelSlide(r3, r1)
        L9:
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            boolean r0 = r7.isLayoutRtlSupport()
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r7.mShadowDrawableRight
            goto Le
        Lc:
            android.graphics.drawable.Drawable r0 = r7.mShadowDrawableLeft
        Le:
            int r1 = r7.getChildCount()
            r2 = 1
            if (r1 <= r2) goto L1a
            android.view.View r1 = r7.getChildAt(r2)
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L47
            if (r0 != 0) goto L20
            goto L47
        L20:
            int r2 = r1.getTop()
            int r3 = r1.getBottom()
            int r4 = r0.getIntrinsicWidth()
            boolean r5 = r7.isLayoutRtlSupport()
            if (r5 == 0) goto L38
            int r1 = r1.getRight()
            int r4 = r4 + r1
            goto L41
        L38:
            int r1 = r1.getLeft()
            int r4 = r1 - r4
            r6 = r4
            r4 = r1
            r1 = r6
        L41:
            r0.setBounds(r1, r2, r4, r3)
            r0.draw(r8)
        L47:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r0
            int r1 = r5.save()
            boolean r2 = r4.mCanSlide
            if (r2 == 0) goto L47
            boolean r0 = r0.slideable
            if (r0 != 0) goto L47
            android.view.View r0 = r4.mSlideableView
            if (r0 == 0) goto L47
            android.graphics.Rect r0 = r4.mTmpRect
            r5.getClipBounds(r0)
            boolean r0 = r4.isLayoutRtlSupport()
            if (r0 == 0) goto L32
            android.graphics.Rect r0 = r4.mTmpRect
            int r2 = r0.left
            android.view.View r3 = r4.mSlideableView
            int r3 = r3.getRight()
            int r2 = java.lang.Math.max(r2, r3)
            r0.left = r2
            goto L42
        L32:
            android.graphics.Rect r0 = r4.mTmpRect
            int r2 = r0.right
            android.view.View r3 = r4.mSlideableView
            int r3 = r3.getLeft()
            int r2 = java.lang.Math.min(r2, r3)
            r0.right = r2
        L42:
            android.graphics.Rect r0 = r4.mTmpRect
            r5.clipRect(r0)
        L47:
            boolean r6 = super.drawChild(r5, r6, r7)
            r5.restoreToCount(r1)
            return r6
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.ColorInt
    public int getCoveredFadeColor() {
            r1 = this;
            int r0 = r1.mCoveredFadeColor
            return r0
    }

    @androidx.annotation.Px
    public int getParallaxDistance() {
            r1 = this;
            int r0 = r1.mParallaxBy
            return r0
    }

    @androidx.annotation.ColorInt
    public int getSliderFadeColor() {
            r1 = this;
            int r0 = r1.mSliderFadeColor
            return r0
    }

    void invalidateChildRegion(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r0
            android.graphics.Paint r0 = r0.dimPaint
            androidx.core.view.ViewCompat.setLayerPaint(r2, r0)
            return
    }

    boolean isDimmed(android.view.View r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r3 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r3
            boolean r1 = r2.mCanSlide
            if (r1 == 0) goto L1b
            boolean r3 = r3.dimWhenOffset
            if (r3 == 0) goto L1b
            float r3 = r2.mSlideOffset
            r1 = 0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1b
            r3 = 1
            return r3
        L1b:
            return r0
    }

    boolean isLayoutRtlSupport() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public boolean isOpen() {
            r2 = this;
            boolean r0 = r2.mCanSlide
            if (r0 == 0) goto Lf
            float r0 = r2.mSlideOffset
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean isSlideable() {
            r1 = this;
            boolean r0 = r1.mCanSlide
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.mFirstLayout = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 1
            r3.mFirstLayout = r0
            java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable> r0 = r3.mPostedRunnables
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable> r2 = r3.mPostedRunnables
            java.lang.Object r2 = r2.get(r1)
            androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable r2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.DisableLayerRunnable) r2
            r2.run()
            int r1 = r1 + 1
            goto Ld
        L1d:
            java.util.ArrayList<androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable> r0 = r3.mPostedRunnables
            r0.clear()
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            boolean r1 = r6.mCanSlide
            r2 = 1
            if (r1 != 0) goto L2a
            if (r0 != 0) goto L2a
            int r1 = r6.getChildCount()
            if (r1 <= r2) goto L2a
            android.view.View r1 = r6.getChildAt(r2)
            if (r1 == 0) goto L2a
            androidx.customview.widget.ViewDragHelper r3 = r6.mDragHelper
            float r4 = r7.getX()
            int r4 = (int) r4
            float r5 = r7.getY()
            int r5 = (int) r5
            boolean r1 = r3.isViewUnder(r1, r4, r5)
            r1 = r1 ^ r2
            r6.mPreservedOpenState = r1
        L2a:
            boolean r1 = r6.mCanSlide
            if (r1 == 0) goto La8
            boolean r1 = r6.mIsUnableToDrag
            if (r1 == 0) goto L36
            if (r0 == 0) goto L36
            goto La8
        L36:
            r1 = 3
            r3 = 0
            if (r0 == r1) goto La2
            if (r0 != r2) goto L3d
            goto La2
        L3d:
            if (r0 == 0) goto L70
            r1 = 2
            if (r0 == r1) goto L43
            goto L94
        L43:
            float r0 = r7.getX()
            float r1 = r7.getY()
            float r4 = r6.mInitialMotionX
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r6.mInitialMotionY
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            androidx.customview.widget.ViewDragHelper r4 = r6.mDragHelper
            int r4 = r4.getTouchSlop()
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L94
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L94
            androidx.customview.widget.ViewDragHelper r7 = r6.mDragHelper
            r7.cancel()
            r6.mIsUnableToDrag = r2
            return r3
        L70:
            r6.mIsUnableToDrag = r3
            float r0 = r7.getX()
            float r1 = r7.getY()
            r6.mInitialMotionX = r0
            r6.mInitialMotionY = r1
            androidx.customview.widget.ViewDragHelper r4 = r6.mDragHelper
            android.view.View r5 = r6.mSlideableView
            int r0 = (int) r0
            int r1 = (int) r1
            boolean r0 = r4.isViewUnder(r5, r0, r1)
            if (r0 == 0) goto L94
            android.view.View r0 = r6.mSlideableView
            boolean r0 = r6.isDimmed(r0)
            if (r0 == 0) goto L94
            r0 = 1
            goto L95
        L94:
            r0 = 0
        L95:
            androidx.customview.widget.ViewDragHelper r1 = r6.mDragHelper
            boolean r7 = r1.shouldInterceptTouchEvent(r7)
            if (r7 != 0) goto La1
            if (r0 == 0) goto La0
            goto La1
        La0:
            return r3
        La1:
            return r2
        La2:
            androidx.customview.widget.ViewDragHelper r7 = r6.mDragHelper
            r7.cancel()
            return r3
        La8:
            androidx.customview.widget.ViewDragHelper r0 = r6.mDragHelper
            r0.cancel()
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            boolean r1 = r0.isLayoutRtlSupport()
            r2 = 1
            if (r1 == 0) goto L10
            androidx.customview.widget.ViewDragHelper r3 = r0.mDragHelper
            r4 = 2
            r3.setEdgeTrackingEnabled(r4)
            goto L15
        L10:
            androidx.customview.widget.ViewDragHelper r3 = r0.mDragHelper
            r3.setEdgeTrackingEnabled(r2)
        L15:
            int r3 = r22 - r20
            if (r1 == 0) goto L1e
            int r4 = r0.getPaddingRight()
            goto L22
        L1e:
            int r4 = r0.getPaddingLeft()
        L22:
            if (r1 == 0) goto L29
            int r5 = r0.getPaddingLeft()
            goto L2d
        L29:
            int r5 = r0.getPaddingRight()
        L2d:
            int r6 = r0.getPaddingTop()
            int r7 = r0.getChildCount()
            boolean r8 = r0.mFirstLayout
            if (r8 == 0) goto L47
            boolean r8 = r0.mCanSlide
            if (r8 == 0) goto L44
            boolean r8 = r0.mPreservedOpenState
            if (r8 == 0) goto L44
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L45
        L44:
            r8 = 0
        L45:
            r0.mSlideOffset = r8
        L47:
            r11 = r4
            r12 = 0
        L49:
            if (r12 >= r7) goto Ld7
            android.view.View r13 = r0.getChildAt(r12)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L5b
            r20 = 1065353216(0x3f800000, float:1.0)
            goto Ld2
        L5b:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r14 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r14
            int r15 = r13.getMeasuredWidth()
            boolean r2 = r14.slideable
            if (r2 == 0) goto La3
            int r2 = r14.leftMargin
            r20 = 1065353216(0x3f800000, float:1.0)
            int r10 = r14.rightMargin
            int r2 = r2 + r10
            int r10 = r3 - r5
            int r8 = r0.mOverhangSize
            int r8 = r10 - r8
            int r8 = java.lang.Math.min(r4, r8)
            int r8 = r8 - r11
            int r8 = r8 - r2
            r0.mSlideRange = r8
            if (r1 == 0) goto L83
            int r2 = r14.rightMargin
            goto L85
        L83:
            int r2 = r14.leftMargin
        L85:
            int r16 = r11 + r2
            int r16 = r16 + r8
            int r17 = r15 / 2
            int r9 = r16 + r17
            if (r9 <= r10) goto L91
            r9 = 1
            goto L92
        L91:
            r9 = 0
        L92:
            r14.dimWhenOffset = r9
            float r9 = (float) r8
            float r10 = r0.mSlideOffset
            float r9 = r9 * r10
            int r9 = (int) r9
            int r2 = r2 + r9
            int r11 = r11 + r2
            float r2 = (float) r9
            float r8 = (float) r8
            float r2 = r2 / r8
            r0.mSlideOffset = r2
        La1:
            r2 = 0
            goto Lb9
        La3:
            r20 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mCanSlide
            if (r2 == 0) goto Lb7
            int r2 = r0.mParallaxBy
            if (r2 == 0) goto Lb7
            float r8 = r0.mSlideOffset
            float r10 = r20 - r8
            float r2 = (float) r2
            float r10 = r10 * r2
            int r2 = (int) r10
            r11 = r4
            goto Lb9
        Lb7:
            r11 = r4
            goto La1
        Lb9:
            if (r1 == 0) goto Lc1
            int r8 = r3 - r11
            int r8 = r8 + r2
            int r2 = r8 - r15
            goto Lc5
        Lc1:
            int r2 = r11 - r2
            int r8 = r2 + r15
        Lc5:
            int r9 = r13.getMeasuredHeight()
            int r9 = r9 + r6
            r13.layout(r2, r6, r8, r9)
            int r2 = r13.getWidth()
            int r4 = r4 + r2
        Ld2:
            int r12 = r12 + 1
            r2 = 1
            goto L49
        Ld7:
            boolean r1 = r0.mFirstLayout
            if (r1 == 0) goto L113
            boolean r1 = r0.mCanSlide
            if (r1 == 0) goto Lfe
            int r1 = r0.mParallaxBy
            if (r1 == 0) goto Le8
            float r1 = r0.mSlideOffset
            r0.parallaxOtherViews(r1)
        Le8:
            android.view.View r1 = r0.mSlideableView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r1 = r1.dimWhenOffset
            if (r1 == 0) goto L10e
            android.view.View r1 = r0.mSlideableView
            float r2 = r0.mSlideOffset
            int r3 = r0.mSliderFadeColor
            r0.dimChildView(r1, r2, r3)
            goto L10e
        Lfe:
            r1 = 0
        Lff:
            if (r1 >= r7) goto L10e
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r0.mSliderFadeColor
            r4 = 0
            r0.dimChildView(r2, r4, r3)
            int r1 = r1 + 1
            goto Lff
        L10e:
            android.view.View r1 = r0.mSlideableView
            r0.updateObscuredViewsVisibility(r1)
        L113:
            r1 = 0
            r0.mFirstLayout = r1
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r21, int r22) {
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L30
            boolean r8 = r0.isInEditMode()
            if (r8 == 0) goto L28
            if (r1 != r6) goto L23
            goto L47
        L23:
            if (r1 != 0) goto L47
            r2 = 300(0x12c, float:4.2E-43)
            goto L47
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L30:
            if (r3 != 0) goto L47
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L3f
            if (r3 != 0) goto L47
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 300(0x12c, float:4.2E-43)
            goto L47
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L47:
            r1 = 0
            if (r3 == r6) goto L5b
            if (r3 == r7) goto L4f
            r4 = 0
            r5 = 0
            goto L67
        L4f:
            int r5 = r0.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r0.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            goto L67
        L5b:
            int r5 = r0.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r0.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = 0
        L67:
            int r8 = r0.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r0.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r0.getChildCount()
            r10 = 0
            r0.mSlideableView = r10
            r14 = r8
            r11 = 0
            r12 = 0
            r13 = 0
        L7d:
            r15 = 8
            r16 = 1
            r21 = 0
            if (r11 >= r9) goto L11c
            android.view.View r10 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r18 = r10.getLayoutParams()
            r6 = r18
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r6 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r6
            int r7 = r10.getVisibility()
            if (r7 != r15) goto L9d
            r6.dimWhenOffset = r1
        L99:
            r19 = r8
            goto L111
        L9d:
            float r7 = r6.weight
            int r15 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r15 <= 0) goto La9
            float r13 = r13 + r7
            int r7 = r6.width
            if (r7 != 0) goto La9
            goto L99
        La9:
            int r7 = r6.leftMargin
            int r15 = r6.rightMargin
            int r7 = r7 + r15
            int r15 = r6.width
            r1 = -2
            if (r15 != r1) goto Lbf
            int r7 = r8 - r7
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r15)
            r15 = r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Ld5
        Lbf:
            r17 = r7
            r1 = -1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r1) goto Lcf
            int r15 = r8 - r17
            r1 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r1)
            goto Ld5
        Lcf:
            r1 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r1)
        Ld5:
            int r1 = r6.height
            r19 = r8
            r8 = -2
            if (r1 != r8) goto Le1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto Lf1
        Le1:
            r8 = -1
            if (r1 != r8) goto Leb
            r8 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            goto Lf1
        Leb:
            r8 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
        Lf1:
            r10.measure(r15, r1)
            int r1 = r10.getMeasuredWidth()
            int r8 = r10.getMeasuredHeight()
            if (r3 != r7) goto L104
            if (r8 <= r4) goto L104
            int r4 = java.lang.Math.min(r8, r5)
        L104:
            int r14 = r14 - r1
            if (r14 >= 0) goto L109
            r1 = 1
            goto L10a
        L109:
            r1 = 0
        L10a:
            r6.slideable = r1
            r12 = r12 | r1
            if (r1 == 0) goto L111
            r0.mSlideableView = r10
        L111:
            int r11 = r11 + 1
            r8 = r19
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L7d
        L11c:
            r19 = r8
            if (r12 != 0) goto L124
            int r1 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r1 <= 0) goto L204
        L124:
            int r1 = r0.mOverhangSize
            int r8 = r19 - r1
            r1 = 0
        L129:
            if (r1 >= r9) goto L204
            android.view.View r3 = r0.getChildAt(r1)
            int r6 = r3.getVisibility()
            if (r6 != r15) goto L13a
        L135:
            r6 = 1073741824(0x40000000, float:2.0)
            r11 = 0
            goto L1fe
        L13a:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r6 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r6
            int r7 = r3.getVisibility()
            if (r7 != r15) goto L147
            goto L135
        L147:
            int r7 = r6.width
            if (r7 != 0) goto L153
            float r7 = r6.weight
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 <= 0) goto L153
            r7 = 1
            goto L154
        L153:
            r7 = 0
        L154:
            if (r7 == 0) goto L158
            r10 = 0
            goto L15c
        L158:
            int r10 = r3.getMeasuredWidth()
        L15c:
            if (r12 == 0) goto L1a1
            android.view.View r11 = r0.mSlideableView
            if (r3 == r11) goto L1a1
            int r11 = r6.width
            if (r11 >= 0) goto L135
            if (r10 > r8) goto L16e
            float r10 = r6.weight
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 <= 0) goto L135
        L16e:
            if (r7 == 0) goto L18f
            int r6 = r6.height
            r7 = -2
            if (r6 != r7) goto L17e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L199
        L17e:
            r7 = -1
            if (r6 != r7) goto L188
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L199
        L188:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            goto L199
        L18f:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r3.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L199:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
            r3.measure(r10, r6)
            goto L135
        L1a1:
            float r7 = r6.weight
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 <= 0) goto L135
            int r7 = r6.width
            if (r7 != 0) goto L1ca
            int r7 = r6.height
            r11 = -2
            if (r7 != r11) goto L1b9
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            r11 = 1073741824(0x40000000, float:2.0)
            goto L1d4
        L1b9:
            r11 = -1
            if (r7 != r11) goto L1c3
            r11 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L1d4
        L1c3:
            r11 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
            goto L1d4
        L1ca:
            r11 = 1073741824(0x40000000, float:2.0)
            int r7 = r3.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
        L1d4:
            if (r12 == 0) goto L1e8
            int r15 = r6.leftMargin
            int r6 = r6.rightMargin
            int r15 = r15 + r6
            int r6 = r19 - r15
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            if (r10 == r6) goto L135
            r3.measure(r15, r7)
            goto L135
        L1e8:
            r11 = 0
            int r15 = java.lang.Math.max(r11, r14)
            float r6 = r6.weight
            float r15 = (float) r15
            float r6 = r6 * r15
            float r6 = r6 / r13
            int r6 = (int) r6
            int r10 = r10 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r3.measure(r10, r7)
        L1fe:
            int r1 = r1 + 1
            r15 = 8
            goto L129
        L204:
            int r1 = r0.getPaddingTop()
            int r4 = r4 + r1
            int r1 = r0.getPaddingBottom()
            int r4 = r4 + r1
            r0.setMeasuredDimension(r2, r4)
            r0.mCanSlide = r12
            androidx.customview.widget.ViewDragHelper r1 = r0.mDragHelper
            int r1 = r1.getViewDragState()
            if (r1 == 0) goto L222
            if (r12 != 0) goto L222
            androidx.customview.widget.ViewDragHelper r1 = r0.mDragHelper
            r1.abort()
        L222:
            return
    }

    void onPanelDragged(int r5) {
            r4 = this;
            android.view.View r0 = r4.mSlideableView
            if (r0 != 0) goto L8
            r5 = 0
            r4.mSlideOffset = r5
            return
        L8:
            boolean r0 = r4.isLayoutRtlSupport()
            android.view.View r1 = r4.mSlideableView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            android.view.View r2 = r4.mSlideableView
            int r2 = r2.getWidth()
            if (r0 == 0) goto L23
            int r3 = r4.getWidth()
            int r3 = r3 - r5
            int r5 = r3 - r2
        L23:
            if (r0 == 0) goto L2a
            int r2 = r4.getPaddingRight()
            goto L2e
        L2a:
            int r2 = r4.getPaddingLeft()
        L2e:
            if (r0 == 0) goto L33
            int r0 = r1.rightMargin
            goto L35
        L33:
            int r0 = r1.leftMargin
        L35:
            int r2 = r2 + r0
            int r5 = r5 - r2
            float r5 = (float) r5
            int r0 = r4.mSlideRange
            float r0 = (float) r0
            float r5 = r5 / r0
            r4.mSlideOffset = r5
            int r0 = r4.mParallaxBy
            if (r0 == 0) goto L45
            r4.parallaxOtherViews(r5)
        L45:
            boolean r5 = r1.dimWhenOffset
            if (r5 == 0) goto L52
            android.view.View r5 = r4.mSlideableView
            float r0 = r4.mSlideOffset
            int r1 = r4.mSliderFadeColor
            r4.dimChildView(r5, r0, r1)
        L52:
            android.view.View r5 = r4.mSlideableView
            r4.dispatchOnPanelSlide(r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState r2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r0 = r2.isOpen
            if (r0 == 0) goto L19
            r1.openPane()
            goto L1c
        L19:
            r1.closePane()
        L1c:
            boolean r2 = r2.isOpen
            r1.mPreservedOpenState = r2
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState r1 = new androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState
            r1.<init>(r0)
            boolean r0 = r2.isSlideable()
            if (r0 == 0) goto L14
            boolean r0 = r2.isOpen()
            goto L16
        L14:
            boolean r0 = r2.mPreservedOpenState
        L16:
            r1.isOpen = r0
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 == r3) goto L8
            r1 = 1
            r0.mFirstLayout = r1
        L8:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.mCanSlide
            if (r0 != 0) goto L9
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L9:
            androidx.customview.widget.ViewDragHelper r0 = r5.mDragHelper
            r0.processTouchEvent(r6)
            int r0 = r6.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 == r1) goto L18
            goto L54
        L18:
            android.view.View r0 = r5.mSlideableView
            boolean r0 = r5.isDimmed(r0)
            if (r0 == 0) goto L54
            float r0 = r6.getX()
            float r6 = r6.getY()
            float r2 = r5.mInitialMotionX
            float r2 = r0 - r2
            float r3 = r5.mInitialMotionY
            float r3 = r6 - r3
            androidx.customview.widget.ViewDragHelper r4 = r5.mDragHelper
            int r4 = r4.getTouchSlop()
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r2 = r2 + r3
            int r4 = r4 * r4
            float r3 = (float) r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L54
            androidx.customview.widget.ViewDragHelper r2 = r5.mDragHelper
            android.view.View r3 = r5.mSlideableView
            int r0 = (int) r0
            int r6 = (int) r6
            boolean r6 = r2.isViewUnder(r3, r0, r6)
            if (r6 == 0) goto L54
            android.view.View r6 = r5.mSlideableView
            r0 = 0
            r5.closePane(r6, r0)
        L54:
            return r1
        L55:
            float r0 = r6.getX()
            float r6 = r6.getY()
            r5.mInitialMotionX = r0
            r5.mInitialMotionY = r6
            return r1
    }

    public boolean openPane() {
            r2 = this;
            android.view.View r0 = r2.mSlideableView
            r1 = 0
            boolean r0 = r2.openPane(r0, r1)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r1, android.view.View r2) {
            r0 = this;
            super.requestChildFocus(r1, r2)
            boolean r2 = r0.isInTouchMode()
            if (r2 != 0) goto L16
            boolean r2 = r0.mCanSlide
            if (r2 != 0) goto L16
            android.view.View r2 = r0.mSlideableView
            if (r1 != r2) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r0.mPreservedOpenState = r1
        L16:
            return
    }

    void setAllChildrenVisible() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L19
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            r5 = 4
            if (r4 != r5) goto L16
            r3.setVisibility(r1)
        L16:
            int r2 = r2 + 1
            goto L6
        L19:
            return
    }

    public void setCoveredFadeColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mCoveredFadeColor = r1
            return
    }

    public void setPanelSlideListener(@androidx.annotation.Nullable androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener r1) {
            r0 = this;
            r0.mPanelSlideListener = r1
            return
    }

    public void setParallaxDistance(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.mParallaxBy = r1
            r0.requestLayout()
            return
    }

    @java.lang.Deprecated
    public void setShadowDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setShadowDrawableLeft(r1)
            return
    }

    public void setShadowDrawableLeft(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mShadowDrawableLeft = r1
            return
    }

    public void setShadowDrawableRight(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mShadowDrawableRight = r1
            return
    }

    @java.lang.Deprecated
    public void setShadowResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setShadowDrawable(r2)
            return
    }

    public void setShadowResourceLeft(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setShadowDrawableLeft(r2)
            return
    }

    public void setShadowResourceRight(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setShadowDrawableRight(r2)
            return
    }

    public void setSliderFadeColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mSliderFadeColor = r1
            return
    }

    @java.lang.Deprecated
    public void smoothSlideClosed() {
            r0 = this;
            r0.closePane()
            return
    }

    @java.lang.Deprecated
    public void smoothSlideOpen() {
            r0 = this;
            r0.openPane()
            return
    }

    boolean smoothSlideTo(float r5, int r6) {
            r4 = this;
            boolean r6 = r4.mCanSlide
            r0 = 0
            if (r6 != 0) goto L6
            return r0
        L6:
            boolean r6 = r4.isLayoutRtlSupport()
            android.view.View r1 = r4.mSlideableView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            if (r6 == 0) goto L32
            int r6 = r4.getPaddingRight()
            int r1 = r1.rightMargin
            int r6 = r6 + r1
            android.view.View r1 = r4.mSlideableView
            int r1 = r1.getWidth()
            int r2 = r4.getWidth()
            float r2 = (float) r2
            float r6 = (float) r6
            int r3 = r4.mSlideRange
            float r3 = (float) r3
            float r5 = r5 * r3
            float r6 = r6 + r5
            float r5 = (float) r1
            float r6 = r6 + r5
            float r2 = r2 - r6
            int r5 = (int) r2
            goto L41
        L32:
            int r6 = r4.getPaddingLeft()
            int r1 = r1.leftMargin
            int r6 = r6 + r1
            float r6 = (float) r6
            int r1 = r4.mSlideRange
            float r1 = (float) r1
            float r5 = r5 * r1
            float r6 = r6 + r5
            int r5 = (int) r6
        L41:
            androidx.customview.widget.ViewDragHelper r6 = r4.mDragHelper
            android.view.View r1 = r4.mSlideableView
            int r2 = r1.getTop()
            boolean r5 = r6.smoothSlideViewTo(r1, r5, r2)
            if (r5 == 0) goto L57
            r4.setAllChildrenVisible()
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r4)
            r5 = 1
            return r5
        L57:
            return r0
    }

    void updateObscuredViewsVisibility(android.view.View r18) {
            r17 = this;
            r0 = r18
            boolean r1 = r17.isLayoutRtlSupport()
            if (r1 == 0) goto L12
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L16
        L12:
            int r2 = r17.getPaddingLeft()
        L16:
            if (r1 == 0) goto L1d
            int r3 = r17.getPaddingLeft()
            goto L26
        L1d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L26:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L4c
            boolean r7 = viewIsOpaque(r0)
            if (r7 == 0) goto L4c
            int r7 = r0.getLeft()
            int r8 = r0.getRight()
            int r9 = r0.getTop()
            int r10 = r0.getBottom()
            goto L50
        L4c:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L50:
            int r11 = r17.getChildCount()
            r12 = 0
        L55:
            r13 = r17
            if (r12 >= r11) goto Lad
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 != r0) goto L60
            goto Lad
        L60:
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 != r6) goto L6b
            r16 = r1
            goto La6
        L6b:
            if (r1 == 0) goto L6f
            r6 = r3
            goto L70
        L6f:
            r6 = r2
        L70:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            if (r1 == 0) goto L86
            r0 = r2
        L83:
            r16 = r1
            goto L88
        L86:
            r0 = r3
            goto L83
        L88:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto La2
            if (r15 < r9) goto La2
            if (r0 > r8) goto La2
            if (r1 > r10) goto La2
            r0 = 4
            goto La3
        La2:
            r0 = 0
        La3:
            r14.setVisibility(r0)
        La6:
            int r12 = r12 + 1
            r0 = r18
            r1 = r16
            goto L55
        Lad:
            return
    }
}

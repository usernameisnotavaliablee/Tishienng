package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"UnknownNullness"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.DecorContentParent, androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    static final int[] ATTRS = null;
    private static final java.lang.String TAG = "ActionBarOverlayLayout";
    private int mActionBarHeight;
    androidx.appcompat.widget.ActionBarContainer mActionBarTop;
    private androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final java.lang.Runnable mAddActionBarHideOffset;
    boolean mAnimatingForFling;
    private final android.graphics.Rect mBaseContentInsets;

    @androidx.annotation.NonNull
    private androidx.core.view.WindowInsetsCompat mBaseInnerInsets;
    private final android.graphics.Rect mBaseInnerInsetsRect;
    private androidx.appcompat.widget.ContentFrameLayout mContent;
    private final android.graphics.Rect mContentInsets;
    android.view.ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    private android.widget.OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;

    @androidx.annotation.NonNull
    private androidx.core.view.WindowInsetsCompat mInnerInsets;
    private final android.graphics.Rect mInnerInsetsRect;
    private final android.graphics.Rect mLastBaseContentInsets;

    @androidx.annotation.NonNull
    private androidx.core.view.WindowInsetsCompat mLastBaseInnerInsets;
    private final android.graphics.Rect mLastBaseInnerInsetsRect;

    @androidx.annotation.NonNull
    private androidx.core.view.WindowInsetsCompat mLastInnerInsets;
    private final android.graphics.Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final androidx.core.view.NestedScrollingParentHelper mParentHelper;
    private final java.lang.Runnable mRemoveActionBarHideOffset;
    final android.animation.AnimatorListenerAdapter mTopAnimatorListener;
    private android.graphics.drawable.Drawable mWindowContentOverlay;
    private int mWindowVisibility;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean r1);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int r1);

        void showForSystem();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            int r0 = androidx.appcompat.R.attr.actionBarSize
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.ATTRS = r0
            return
    }

    public ActionBarOverlayLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.mWindowVisibility = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mBaseContentInsets = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mLastBaseContentInsets = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mContentInsets = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mBaseInnerInsetsRect = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mLastBaseInnerInsetsRect = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mInnerInsetsRect = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.mLastInnerInsetsRect = r2
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r0.mBaseInnerInsets = r2
            r0.mLastBaseInnerInsets = r2
            r0.mInnerInsets = r2
            r0.mLastInnerInsets = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$1 r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$1
            r2.<init>(r0)
            r0.mTopAnimatorListener = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$2 r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$2
            r2.<init>(r0)
            r0.mRemoveActionBarHideOffset = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$3 r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$3
            r2.<init>(r0)
            r0.mAddActionBarHideOffset = r2
            r0.init(r1)
            androidx.core.view.NestedScrollingParentHelper r1 = new androidx.core.view.NestedScrollingParentHelper
            r1.<init>(r0)
            r0.mParentHelper = r1
            return
    }

    private void addActionBarHideOffset() {
            r1 = this;
            r1.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r1.mAddActionBarHideOffset
            r0.run()
            return
    }

    private boolean applyInsets(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
    }

    private androidx.appcompat.widget.DecorToolbar getDecorToolbar(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.DecorToolbar
            if (r0 == 0) goto L7
            androidx.appcompat.widget.DecorToolbar r4 = (androidx.appcompat.widget.DecorToolbar) r4
            return r4
        L7:
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L12
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            androidx.appcompat.widget.DecorToolbar r4 = r4.getWrapper()
            return r4
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private void init(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.ATTRS
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.mActionBarHeight = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.mWindowContentOverlay = r3
            if (r3 != 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r4.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 19
            if (r0 >= r3) goto L32
            r1 = 1
        L32:
            r4.mIgnoreWindowContentOverlay = r1
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.mFlingEstimator = r0
            return
    }

    private void postAddActionBarHideOffset() {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r3.mAddActionBarHideOffset
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void postRemoveActionBarHideOffset() {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r3.mRemoveActionBarHideOffset
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void removeActionBarHideOffset() {
            r1 = this;
            r1.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r1.mRemoveActionBarHideOffset
            r0.run()
            return
    }

    private boolean shouldHideActionBarOnFling(float r10) {
            r9 = this;
            android.widget.OverScroller r0 = r9.mFlingEstimator
            int r4 = (int) r10
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.mFlingEstimator
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r0 = r9.mActionBarTop
            int r0 = r0.getHeight()
            if (r10 <= r0) goto L20
            r10 = 1
            return r10
        L20:
            r10 = 0
            return r10
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.canShowOverflowMenu()
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams
            return r1
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.dismissPopupMenus()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.mWindowContentOverlay
            if (r0 == 0) goto L3d
            boolean r0 = r5.mIgnoreWindowContentOverlay
            if (r0 != 0) goto L3d
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mActionBarTop
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L27
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mActionBarTop
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.mActionBarTop
            float r2 = r2.getTranslationY()
            float r0 = r0 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            goto L28
        L27:
            r0 = 0
        L28:
            android.graphics.drawable.Drawable r2 = r5.mWindowContentOverlay
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.mWindowContentOverlay
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.mWindowContentOverlay
            r0.draw(r6)
        L3d:
            return
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.fitSystemWindows(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    void haltActionBarHideOffsetAnimations() {
            r1 = this;
            java.lang.Runnable r0 = r1.mRemoveActionBarHideOffset
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mAddActionBarHideOffset
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.mCurrentActionBarTopAnimator
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasIcon()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasLogo()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hideOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int r2) {
            r1 = this;
            r1.pullChildren()
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 5
            if (r2 == r0) goto L13
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto Le
            return
        Le:
            r2 = 1
            r1.setOverlayMode(r2)
            return
        L13:
            androidx.appcompat.widget.DecorToolbar r2 = r1.mDecorToolbar
            r2.initIndeterminateProgress()
            return
        L19:
            androidx.appcompat.widget.DecorToolbar r2 = r1.mDecorToolbar
            r2.initProgress()
            return
    }

    public boolean isHideOnContentScrollEnabled() {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            return r0
    }

    public boolean isInOverlayMode() {
            r1 = this;
            boolean r0 = r1.mOverlayMode
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(21)
    public android.view.WindowInsets onApplyWindowInsets(@androidx.annotation.NonNull android.view.WindowInsets r8) {
            r7 = this;
            r7.pullChildren()
            androidx.core.view.WindowInsetsCompat r8 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r8, r7)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r0 = r8.getSystemWindowInsetLeft()
            int r1 = r8.getSystemWindowInsetTop()
            int r3 = r8.getSystemWindowInsetRight()
            int r4 = r8.getSystemWindowInsetBottom()
            r2.<init>(r0, r1, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r7.mActionBarTop
            r5 = 0
            r6 = 1
            r3 = 1
            r4 = 1
            r0 = r7
            boolean r1 = r0.applyInsets(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r2 = r0.mBaseContentInsets
            androidx.core.view.ViewCompat.computeSystemWindowInsets(r7, r8, r2)
            android.graphics.Rect r2 = r0.mBaseContentInsets
            int r3 = r2.left
            int r4 = r2.top
            int r5 = r2.right
            int r2 = r2.bottom
            androidx.core.view.WindowInsetsCompat r2 = r8.inset(r3, r4, r5, r2)
            r0.mBaseInnerInsets = r2
            androidx.core.view.WindowInsetsCompat r3 = r0.mLastBaseInnerInsets
            boolean r2 = r3.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4a
            androidx.core.view.WindowInsetsCompat r1 = r0.mBaseInnerInsets
            r0.mLastBaseInnerInsets = r1
            r1 = 1
        L4a:
            android.graphics.Rect r2 = r0.mLastBaseContentInsets
            android.graphics.Rect r4 = r0.mBaseContentInsets
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L5c
            android.graphics.Rect r1 = r0.mLastBaseContentInsets
            android.graphics.Rect r2 = r0.mBaseContentInsets
            r1.set(r2)
            goto L5d
        L5c:
            r3 = r1
        L5d:
            if (r3 == 0) goto L62
            r7.requestLayout()
        L62:
            androidx.core.view.WindowInsetsCompat r8 = r8.consumeDisplayCutout()
            androidx.core.view.WindowInsetsCompat r8 = r8.consumeSystemWindowInsets()
            androidx.core.view.WindowInsetsCompat r8 = r8.consumeStableInsets()
            android.view.WindowInsets r8 = r8.toWindowInsets()
            return r8
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.init(r1)
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.haltActionBarHideOffsetAnimations()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L37
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L34
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L34:
            int r8 = r8 + 1
            goto Ld
        L37:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r14, int r15) {
            r13 = this;
            r13.pullChildren()
            androidx.appcompat.widget.ActionBarContainer r1 = r13.mActionBarTop
            r3 = 0
            r5 = 0
            r0 = r13
            r2 = r14
            r4 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r6 = r0
            androidx.appcompat.widget.ActionBarContainer r14 = r6.mActionBarTop
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r14 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r14
            androidx.appcompat.widget.ActionBarContainer r15 = r6.mActionBarTop
            int r15 = r15.getMeasuredWidth()
            int r0 = r14.leftMargin
            int r15 = r15 + r0
            int r0 = r14.rightMargin
            int r15 = r15 + r0
            r0 = 0
            int r15 = java.lang.Math.max(r0, r15)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.mActionBarTop
            int r1 = r1.getMeasuredHeight()
            int r3 = r14.topMargin
            int r1 = r1 + r3
            int r14 = r14.bottomMargin
            int r1 = r1 + r14
            int r14 = java.lang.Math.max(r0, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.mActionBarTop
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r0, r1)
            int r3 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r13)
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L4b
            r3 = 1
            goto L4c
        L4b:
            r3 = 0
        L4c:
            if (r3 == 0) goto L60
            int r5 = r6.mActionBarHeight
            boolean r7 = r6.mHasNonEmbeddedTabs
            if (r7 == 0) goto L72
            androidx.appcompat.widget.ActionBarContainer r7 = r6.mActionBarTop
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L72
            int r7 = r6.mActionBarHeight
            int r5 = r5 + r7
            goto L72
        L60:
            androidx.appcompat.widget.ActionBarContainer r5 = r6.mActionBarTop
            int r5 = r5.getVisibility()
            r7 = 8
            if (r5 == r7) goto L71
            androidx.appcompat.widget.ActionBarContainer r5 = r6.mActionBarTop
            int r5 = r5.getMeasuredHeight()
            goto L72
        L71:
            r5 = 0
        L72:
            android.graphics.Rect r7 = r6.mContentInsets
            android.graphics.Rect r8 = r6.mBaseContentInsets
            r7.set(r8)
            androidx.core.view.WindowInsetsCompat r7 = r6.mBaseInnerInsets
            r6.mInnerInsets = r7
            boolean r8 = r6.mOverlayMode
            if (r8 != 0) goto L95
            if (r3 != 0) goto L95
            android.graphics.Rect r3 = r6.mContentInsets
            int r8 = r3.top
            int r8 = r8 + r5
            r3.top = r8
            int r8 = r3.bottom
            r3.bottom = r8
            androidx.core.view.WindowInsetsCompat r0 = r7.inset(r0, r5, r0, r0)
            r6.mInnerInsets = r0
            goto Lc1
        L95:
            int r0 = r7.getSystemWindowInsetLeft()
            androidx.core.view.WindowInsetsCompat r3 = r6.mInnerInsets
            int r3 = r3.getSystemWindowInsetTop()
            int r3 = r3 + r5
            androidx.core.view.WindowInsetsCompat r5 = r6.mInnerInsets
            int r5 = r5.getSystemWindowInsetRight()
            androidx.core.view.WindowInsetsCompat r7 = r6.mInnerInsets
            int r7 = r7.getSystemWindowInsetBottom()
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0, r3, r5, r7)
            androidx.core.view.WindowInsetsCompat$Builder r3 = new androidx.core.view.WindowInsetsCompat$Builder
            androidx.core.view.WindowInsetsCompat r5 = r6.mInnerInsets
            r3.<init>(r5)
            androidx.core.view.WindowInsetsCompat$Builder r0 = r3.setSystemWindowInsets(r0)
            androidx.core.view.WindowInsetsCompat r0 = r0.build()
            r6.mInnerInsets = r0
        Lc1:
            androidx.appcompat.widget.ContentFrameLayout r7 = r6.mContent
            android.graphics.Rect r8 = r6.mContentInsets
            r11 = 1
            r12 = 1
            r9 = 1
            r10 = 1
            r6.applyInsets(r7, r8, r9, r10, r11, r12)
            androidx.core.view.WindowInsetsCompat r0 = r6.mLastInnerInsets
            androidx.core.view.WindowInsetsCompat r3 = r6.mInnerInsets
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Ldf
            androidx.core.view.WindowInsetsCompat r0 = r6.mInnerInsets
            r6.mLastInnerInsets = r0
            androidx.appcompat.widget.ContentFrameLayout r3 = r6.mContent
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r3, r0)
        Ldf:
            androidx.appcompat.widget.ContentFrameLayout r7 = r6.mContent
            r9 = 0
            r11 = 0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r0 = r6.mContent
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r0
            androidx.appcompat.widget.ContentFrameLayout r3 = r6.mContent
            int r3 = r3.getMeasuredWidth()
            int r5 = r0.leftMargin
            int r3 = r3 + r5
            int r5 = r0.rightMargin
            int r3 = r3 + r5
            int r15 = java.lang.Math.max(r15, r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = r6.mContent
            int r3 = r3.getMeasuredHeight()
            int r5 = r0.topMargin
            int r3 = r3 + r5
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r14 = java.lang.Math.max(r14, r3)
            androidx.appcompat.widget.ContentFrameLayout r0 = r6.mContent
            int r0 = r0.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r1, r0)
            int r1 = r13.getPaddingLeft()
            int r3 = r13.getPaddingRight()
            int r1 = r1 + r3
            int r15 = r15 + r1
            int r1 = r13.getPaddingTop()
            int r3 = r13.getPaddingBottom()
            int r1 = r1 + r3
            int r14 = r14 + r1
            int r1 = r13.getSuggestedMinimumHeight()
            int r14 = java.lang.Math.max(r14, r1)
            int r1 = r13.getSuggestedMinimumWidth()
            int r15 = java.lang.Math.max(r15, r1)
            int r15 = android.view.View.resolveSizeAndState(r15, r2, r0)
            int r0 = r0 << 16
            int r14 = android.view.View.resolveSizeAndState(r14, r4, r0)
            r13.setMeasuredDimension(r15, r14)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.mHideOnContentScroll
            if (r1 == 0) goto L18
            if (r4 != 0) goto L7
            goto L18
        L7:
            boolean r1 = r0.shouldHideActionBarOnFling(r3)
            if (r1 == 0) goto L11
            r0.addActionBarHideOffset()
            goto L14
        L11:
            r0.removeActionBarHideOffset()
        L14:
            r1 = 1
            r0.mAnimatingForFling = r1
            return r1
        L18:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.mHideOnContentScrollReference
            int r1 = r1 + r3
            r0.mHideOnContentScrollReference = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4)
            int r2 = r1.getActionBarHideOffset()
            r1.mHideOnContentScrollReference = r2
            r1.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r1.mActionBarVisibilityCallback
            if (r2 == 0) goto L15
            r2.onContentScrollStarted()
        L15:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.mActionBarTop
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r1 = r0.mHideOnContentScroll
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r1 = r0.onStartNestedScroll(r1, r2, r3)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            boolean r2 = r1.mHideOnContentScroll
            if (r2 == 0) goto L19
            boolean r2 = r1.mAnimatingForFling
            if (r2 != 0) goto L19
            int r2 = r1.mHideOnContentScrollReference
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            int r0 = r0.getHeight()
            if (r2 > r0) goto L16
            r1.postRemoveActionBarHideOffset()
            goto L19
        L16:
            r1.postAddActionBarHideOffset()
        L19:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r1.mActionBarVisibilityCallback
            if (r2 == 0) goto L20
            r2.onContentScrollStopped()
        L20:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int r5) {
            r4 = this;
            super.onWindowSystemUiVisibilityChanged(r5)
            r4.pullChildren()
            int r0 = r4.mLastSystemUiVisibility
            r0 = r0 ^ r5
            r4.mLastSystemUiVisibility = r5
            r1 = r5 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L19
            r2 = 1
        L19:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r4.mActionBarVisibilityCallback
            if (r5 == 0) goto L32
            r3 = r2 ^ 1
            r5.enableContentAnimations(r3)
            if (r1 != 0) goto L2d
            if (r2 != 0) goto L27
            goto L2d
        L27:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r4.mActionBarVisibilityCallback
            r5.hideForSystem()
            goto L32
        L2d:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r4.mActionBarVisibilityCallback
            r5.showForSystem()
        L32:
            r5 = r0 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L3d
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r4.mActionBarVisibilityCallback
            if (r5 == 0) goto L3d
            androidx.core.view.ViewCompat.requestApplyInsets(r4)
        L3d:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.mWindowVisibility = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            if (r0 == 0) goto Lc
            r0.onWindowVisibilityChanged(r2)
        Lc:
            return
    }

    void pullChildren() {
            r1 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r1.mContent
            if (r0 != 0) goto L24
            int r0 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r1.mContent = r0
            int r0 = androidx.appcompat.R.id.action_bar_container
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r1.mActionBarTop = r0
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.DecorToolbar r0 = r1.getDecorToolbar(r0)
            r1.mDecorToolbar = r0
        L24:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.restoreHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.saveHierarchyState(r2)
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.mActionBarTop
            int r0 = r0.getHeight()
            r1 = 0
            int r3 = java.lang.Math.min(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r0 = r2.mActionBarTop
            int r3 = -r3
            float r3 = (float) r3
            r0.setTranslationY(r3)
            return
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback r2) {
            r1 = this;
            r1.mActionBarVisibilityCallback = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L19
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r1.mActionBarVisibilityCallback
            int r0 = r1.mWindowVisibility
            r2.onWindowVisibilityChanged(r0)
            int r2 = r1.mLastSystemUiVisibility
            if (r2 == 0) goto L19
            r1.onWindowSystemUiVisibilityChanged(r2)
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
        L19:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.mHasNonEmbeddedTabs = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            if (r2 == r0) goto Lf
            r1.mHideOnContentScroll = r2
            if (r2 != 0) goto Lf
            r1.haltActionBarHideOffsetAnimations()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(android.view.Menu r2, androidx.appcompat.view.menu.MenuPresenter.Callback r3) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setMenu(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setMenuPrepared()
            return
    }

    public void setOverlayMode(boolean r2) {
            r1 = this;
            r1.mOverlayMode = r2
            if (r2 == 0) goto L14
            android.content.Context r2 = r1.getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0 = 19
            if (r2 >= r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.mIgnoreWindowContentOverlay = r2
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowCallback(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.showOverflowMenu()
            return r0
    }
}

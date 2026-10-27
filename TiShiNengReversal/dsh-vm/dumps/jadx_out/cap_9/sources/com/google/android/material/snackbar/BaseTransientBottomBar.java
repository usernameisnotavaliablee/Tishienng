package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class BaseTransientBottomBar<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    static final int DEFAULT_ANIMATION_FADE_DURATION = 180;
    private static final android.animation.TimeInterpolator DEFAULT_ANIMATION_FADE_INTERPOLATOR = null;
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 150;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 75;
    private static final android.animation.TimeInterpolator DEFAULT_ANIMATION_SCALE_INTERPOLATOR = null;
    private static final android.animation.TimeInterpolator DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = null;
    static final int DEFAULT_SLIDE_ANIMATION_DURATION = 250;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW = 0;
    private static final int[] SNACKBAR_STYLE_ATTR = null;
    private static final java.lang.String TAG = null;
    private static final boolean USE_OFFSET_API = false;

    @androidx.annotation.NonNull
    static final android.os.Handler handler = null;

    @androidx.annotation.Nullable
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @androidx.annotation.Nullable
    private com.google.android.material.snackbar.BaseTransientBottomBar.Anchor anchor;
    private boolean anchorViewLayoutListenerEnabled;
    private final int animationFadeInDuration;
    private final android.animation.TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private final android.animation.TimeInterpolator animationScaleInterpolator;
    private final int animationSlideDuration;
    private final android.animation.TimeInterpolator animationSlideInterpolator;
    private int appliedBottomMarginGestureInset;
    private com.google.android.material.snackbar.BaseTransientBottomBar.Behavior behavior;

    @androidx.annotation.RequiresApi(29)
    private final java.lang.Runnable bottomMarginGestureInsetRunnable;
    private java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B>> callbacks;

    @androidx.annotation.NonNull
    private final com.google.android.material.snackbar.ContentViewCallback contentViewCallback;
    private final android.content.Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;

    @androidx.annotation.NonNull
    com.google.android.material.snackbar.SnackbarManager.Callback managerCallback;
    private boolean pendingShowingView;

    @androidx.annotation.NonNull
    private final android.view.ViewGroup targetParent;

    @androidx.annotation.NonNull
    protected final com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout view;

















    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Anchor implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {

        @androidx.annotation.NonNull
        private final java.lang.ref.WeakReference<android.view.View> anchorView;

        @androidx.annotation.NonNull
        private final java.lang.ref.WeakReference<com.google.android.material.snackbar.BaseTransientBottomBar> transientBottomBar;

        private Anchor(@androidx.annotation.NonNull com.google.android.material.snackbar.BaseTransientBottomBar r2, @androidx.annotation.NonNull android.view.View r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.transientBottomBar = r0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.anchorView = r2
                return
        }

        static com.google.android.material.snackbar.BaseTransientBottomBar.Anchor anchor(@androidx.annotation.NonNull com.google.android.material.snackbar.BaseTransientBottomBar r1, @androidx.annotation.NonNull android.view.View r2) {
                com.google.android.material.snackbar.BaseTransientBottomBar$Anchor r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$Anchor
                r0.<init>(r1, r2)
                boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
                if (r1 == 0) goto Le
                com.google.android.material.internal.ViewUtils.addOnGlobalLayoutListener(r2, r0)
            Le:
                r2.addOnAttachStateChangeListener(r0)
                return r0
        }

        private boolean unanchorIfNoTransientBottomBar() {
                r1 = this;
                java.lang.ref.WeakReference<com.google.android.material.snackbar.BaseTransientBottomBar> r0 = r1.transientBottomBar
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto Ld
                r1.unanchor()
                r0 = 1
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @androidx.annotation.Nullable
        android.view.View getAnchorView() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.anchorView
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                return r0
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r1 = this;
                boolean r0 = r1.unanchorIfNoTransientBottomBar()
                if (r0 != 0) goto L20
                java.lang.ref.WeakReference<com.google.android.material.snackbar.BaseTransientBottomBar> r0 = r1.transientBottomBar
                java.lang.Object r0 = r0.get()
                com.google.android.material.snackbar.BaseTransientBottomBar r0 = (com.google.android.material.snackbar.BaseTransientBottomBar) r0
                boolean r0 = com.google.android.material.snackbar.BaseTransientBottomBar.access$2100(r0)
                if (r0 != 0) goto L15
                goto L20
            L15:
                java.lang.ref.WeakReference<com.google.android.material.snackbar.BaseTransientBottomBar> r0 = r1.transientBottomBar
                java.lang.Object r0 = r0.get()
                com.google.android.material.snackbar.BaseTransientBottomBar r0 = (com.google.android.material.snackbar.BaseTransientBottomBar) r0
                com.google.android.material.snackbar.BaseTransientBottomBar.access$2200(r0)
            L20:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.unanchorIfNoTransientBottomBar()
                if (r0 == 0) goto L7
                return
            L7:
                com.google.android.material.internal.ViewUtils.addOnGlobalLayoutListener(r2, r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.unanchorIfNoTransientBottomBar()
                if (r0 == 0) goto L7
                return
            L7:
                com.google.android.material.internal.ViewUtils.removeOnGlobalLayoutListener(r2, r1)
                return
        }

        void unanchor() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.anchorView
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L1e
                java.lang.ref.WeakReference<android.view.View> r0 = r1.anchorView
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                r0.removeOnAttachStateChangeListener(r1)
                java.lang.ref.WeakReference<android.view.View> r0 = r1.anchorView
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                com.google.android.material.internal.ViewUtils.removeOnGlobalLayoutListener(r0, r1)
            L1e:
                java.lang.ref.WeakReference<android.view.View> r0 = r1.anchorView
                r0.clear()
                java.lang.ref.WeakReference<com.google.android.material.snackbar.BaseTransientBottomBar> r0 = r1.transientBottomBar
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DismissEvent {
        }

        public BaseCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onDismissed(B r1, int r2) {
                r0 = this;
                return
        }

        public void onShown(B r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {

        @androidx.annotation.NonNull
        private final com.google.android.material.snackbar.BaseTransientBottomBar.BehaviorDelegate delegate;

        public Behavior() {
                r1 = this;
                r1.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate
                r0.<init>(r1)
                r1.delegate = r0
                return
        }

        static /* synthetic */ void access$1100(com.google.android.material.snackbar.BaseTransientBottomBar.Behavior r0, com.google.android.material.snackbar.BaseTransientBottomBar r1) {
                r0.setBaseTransientBottomBar(r1)
                return
        }

        private void setBaseTransientBottomBar(@androidx.annotation.NonNull com.google.android.material.snackbar.BaseTransientBottomBar<?> r2) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = r1.delegate
                r0.setBaseTransientBottomBar(r2)
                return
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(android.view.View r2) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = r1.delegate
                boolean r2 = r0.canSwipeDismissView(r2)
                return r2
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.MotionEvent r4) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = r1.delegate
                r0.onInterceptTouchEvent(r2, r3, r4)
                boolean r2 = super.onInterceptTouchEvent(r2, r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class BehaviorDelegate {
        private com.google.android.material.snackbar.SnackbarManager.Callback managerCallback;

        public BehaviorDelegate(@androidx.annotation.NonNull com.google.android.material.behavior.SwipeDismissBehavior<?> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1036831949(0x3dcccccd, float:0.1)
                r2.setStartAlphaSwipeDistance(r0)
                r0 = 1058642330(0x3f19999a, float:0.6)
                r2.setEndAlphaSwipeDistance(r0)
                r0 = 0
                r2.setSwipeDirection(r0)
                return
        }

        public boolean canSwipeDismissView(android.view.View r1) {
                r0 = this;
                boolean r1 = r1 instanceof com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout
                return r1
        }

        public void onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.MotionEvent r4) {
                r1 = this;
                int r0 = r4.getActionMasked()
                if (r0 == 0) goto L17
                r2 = 1
                if (r0 == r2) goto Ld
                r2 = 3
                if (r0 == r2) goto Ld
                goto L30
            Ld:
                com.google.android.material.snackbar.SnackbarManager r2 = com.google.android.material.snackbar.SnackbarManager.getInstance()
                com.google.android.material.snackbar.SnackbarManager$Callback r3 = r1.managerCallback
                r2.restoreTimeoutIfPaused(r3)
                return
            L17:
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                boolean r2 = r2.isPointInChildBounds(r3, r0, r4)
                if (r2 == 0) goto L30
                com.google.android.material.snackbar.SnackbarManager r2 = com.google.android.material.snackbar.SnackbarManager.getInstance()
                com.google.android.material.snackbar.SnackbarManager$Callback r3 = r1.managerCallback
                r2.pauseTimeout(r3)
            L30:
                return
        }

        public void setBaseTransientBottomBar(@androidx.annotation.NonNull com.google.android.material.snackbar.BaseTransientBottomBar<?> r1) {
                r0 = this;
                com.google.android.material.snackbar.SnackbarManager$Callback r1 = r1.managerCallback
                r0.managerCallback = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.IntRange(from = -2)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Duration {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected static class SnackbarBaseLayout extends android.widget.FrameLayout {
        private static final android.view.View.OnTouchListener consumeAllTouchListener = null;
        private final float actionTextColorAlpha;
        private boolean addingToTargetParent;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private android.content.res.ColorStateList backgroundTint;
        private android.graphics.PorterDuff.Mode backgroundTintMode;

        @androidx.annotation.Nullable
        private com.google.android.material.snackbar.BaseTransientBottomBar<?> baseTransientBottomBar;
        private final int maxInlineActionWidth;
        private final int maxWidth;

        @androidx.annotation.Nullable
        private android.graphics.Rect originalMargins;

        @androidx.annotation.Nullable
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;


        static {
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1
                r0.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.consumeAllTouchListener = r0
                return
        }

        protected SnackbarBaseLayout(@androidx.annotation.NonNull android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        protected SnackbarBaseLayout(@androidx.annotation.NonNull android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                r0 = 0
                android.content.Context r5 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r5, r6, r0, r0)
                r4.<init>(r5, r6)
                android.content.Context r5 = r4.getContext()
                int[] r1 = com.google.android.material.R.styleable.SnackbarLayout
                android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_elevation
                boolean r3 = r1.hasValue(r2)
                if (r3 == 0) goto L22
                int r2 = r1.getDimensionPixelSize(r2, r0)
                float r2 = (float) r2
                androidx.core.view.ViewCompat.setElevation(r4, r2)
            L22:
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_animationMode
                int r2 = r1.getInt(r2, r0)
                r4.animationMode = r2
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_shapeAppearance
                boolean r2 = r1.hasValue(r2)
                if (r2 != 0) goto L3a
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_shapeAppearanceOverlay
                boolean r2 = r1.hasValue(r2)
                if (r2 == 0) goto L44
            L3a:
                com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = com.google.android.material.shape.ShapeAppearanceModel.builder(r5, r6, r0, r0)
                com.google.android.material.shape.ShapeAppearanceModel r6 = r6.build()
                r4.shapeAppearanceModel = r6
            L44:
                int r6 = com.google.android.material.R.styleable.SnackbarLayout_backgroundOverlayColorAlpha
                r0 = 1065353216(0x3f800000, float:1.0)
                float r6 = r1.getFloat(r6, r0)
                r4.backgroundOverlayColorAlpha = r6
                int r6 = com.google.android.material.R.styleable.SnackbarLayout_backgroundTint
                android.content.res.ColorStateList r5 = com.google.android.material.resources.MaterialResources.getColorStateList(r5, r1, r6)
                r4.setBackgroundTintList(r5)
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_backgroundTintMode
                r6 = -1
                int r5 = r1.getInt(r5, r6)
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
                android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.ViewUtils.parseTintMode(r5, r2)
                r4.setBackgroundTintMode(r5)
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_actionTextColorAlpha
                float r5 = r1.getFloat(r5, r0)
                r4.actionTextColorAlpha = r5
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_android_maxWidth
                int r5 = r1.getDimensionPixelSize(r5, r6)
                r4.maxWidth = r5
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_maxActionInlineWidth
                int r5 = r1.getDimensionPixelSize(r5, r6)
                r4.maxInlineActionWidth = r5
                r1.recycle()
                android.view.View$OnTouchListener r5 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.consumeAllTouchListener
                r4.setOnTouchListener(r5)
                r5 = 1
                r4.setFocusable(r5)
                android.graphics.drawable.Drawable r5 = r4.getBackground()
                if (r5 != 0) goto L98
                android.graphics.drawable.Drawable r5 = r4.createThemedBackground()
                androidx.core.view.ViewCompat.setBackground(r4, r5)
            L98:
                return
        }

        static /* synthetic */ android.graphics.Rect access$1000(com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout r0) {
                android.graphics.Rect r0 = r0.originalMargins
                return r0
        }

        static /* synthetic */ void access$500(com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout r0, com.google.android.material.snackbar.BaseTransientBottomBar r1) {
                r0.setBaseTransientBottomBar(r1)
                return
        }

        @androidx.annotation.NonNull
        private android.graphics.drawable.Drawable createThemedBackground() {
                r3 = this;
                int r0 = com.google.android.material.R.attr.colorSurface
                int r1 = com.google.android.material.R.attr.colorOnSurface
                float r2 = r3.getBackgroundOverlayColorAlpha()
                int r0 = com.google.android.material.color.MaterialColors.layer(r3, r0, r1, r2)
                com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModel
                if (r1 == 0) goto L15
                com.google.android.material.shape.MaterialShapeDrawable r0 = com.google.android.material.snackbar.BaseTransientBottomBar.access$1900(r0, r1)
                goto L1d
            L15:
                android.content.res.Resources r1 = r3.getResources()
                android.graphics.drawable.GradientDrawable r0 = com.google.android.material.snackbar.BaseTransientBottomBar.access$2000(r0, r1)
            L1d:
                android.content.res.ColorStateList r1 = r3.backgroundTint
                if (r1 == 0) goto L2b
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                android.content.res.ColorStateList r1 = r3.backgroundTint
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
                return r0
            L2b:
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                return r0
        }

        private void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar<?> r1) {
                r0 = this;
                r0.baseTransientBottomBar = r1
                return
        }

        private void updateOriginalMargins(android.view.ViewGroup.MarginLayoutParams r5) {
                r4 = this;
                android.graphics.Rect r0 = new android.graphics.Rect
                int r1 = r5.leftMargin
                int r2 = r5.topMargin
                int r3 = r5.rightMargin
                int r5 = r5.bottomMargin
                r0.<init>(r1, r2, r3, r5)
                r4.originalMargins = r0
                return
        }

        void addToTargetParent(android.view.ViewGroup r2) {
                r1 = this;
                r0 = 1
                r1.addingToTargetParent = r0
                r2.addView(r1)
                r2 = 0
                r1.addingToTargetParent = r2
                return
        }

        float getActionTextColorAlpha() {
                r1 = this;
                float r0 = r1.actionTextColorAlpha
                return r0
        }

        int getAnimationMode() {
                r1 = this;
                int r0 = r1.animationMode
                return r0
        }

        float getBackgroundOverlayColorAlpha() {
                r1 = this;
                float r0 = r1.backgroundOverlayColorAlpha
                return r0
        }

        int getMaxInlineActionWidth() {
                r1 = this;
                int r0 = r1.maxInlineActionWidth
                return r0
        }

        int getMaxWidth() {
                r1 = this;
                int r0 = r1.maxWidth
                return r0
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
                r1 = this;
                super.onAttachedToWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r1.baseTransientBottomBar
                if (r0 == 0) goto La
                r0.onAttachedToWindow()
            La:
                androidx.core.view.ViewCompat.requestApplyInsets(r1)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
                r1 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r1.baseTransientBottomBar
                if (r0 == 0) goto La
                r0.onDetachedFromWindow()
            La:
                return
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                super.onLayout(r1, r2, r3, r4, r5)
                r1 = r0
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r2 = r1.baseTransientBottomBar
                if (r2 == 0) goto Lb
                r2.onLayoutChange()
            Lb:
                return
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                int r2 = r1.maxWidth
                if (r2 <= 0) goto L18
                int r2 = r1.getMeasuredWidth()
                int r0 = r1.maxWidth
                if (r2 <= r0) goto L18
                r2 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
                super.onMeasure(r2, r3)
            L18:
                return
        }

        void setAnimationMode(int r1) {
                r0 = this;
                r0.animationMode = r1
                return
        }

        @Override // android.view.View
        public void setBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.setBackgroundDrawable(r1)
                return
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
                r1 = this;
                if (r2 == 0) goto L18
                android.content.res.ColorStateList r0 = r1.backgroundTint
                if (r0 == 0) goto L18
                android.graphics.drawable.Drawable r2 = r2.mutate()
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
                android.content.res.ColorStateList r0 = r1.backgroundTint
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
                android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r2, r0)
            L18:
                super.setBackgroundDrawable(r2)
                return
        }

        @Override // android.view.View
        public void setBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
                r1 = this;
                r1.backgroundTint = r2
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                if (r0 == 0) goto L25
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r1.backgroundTintMode
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                if (r0 == r2) goto L25
                super.setBackgroundDrawable(r0)
            L25:
                return
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
                r1 = this;
                r1.backgroundTintMode = r2
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                if (r0 == 0) goto L20
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                if (r0 == r2) goto L20
                super.setBackgroundDrawable(r0)
            L20:
                return
        }

        @Override // android.view.View
        public void setLayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                super.setLayoutParams(r2)
                boolean r0 = r1.addingToTargetParent
                if (r0 != 0) goto L17
                boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L17
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r1.updateOriginalMargins(r2)
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r2 = r1.baseTransientBottomBar
                if (r2 == 0) goto L17
                com.google.android.material.snackbar.BaseTransientBottomBar.access$900(r2)
            L17:
                return
        }

        @Override // android.view.View
        public void setOnClickListener(@androidx.annotation.Nullable android.view.View.OnClickListener r2) {
                r1 = this;
                if (r2 == 0) goto L4
                r0 = 0
                goto L6
            L4:
                android.view.View$OnTouchListener r0 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.consumeAllTouchListener
            L6:
                r1.setOnTouchListener(r0)
                super.setOnClickListener(r2)
                return
        }
    }

    static {
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            com.google.android.material.snackbar.BaseTransientBottomBar.DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = r0
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            com.google.android.material.snackbar.BaseTransientBottomBar.DEFAULT_ANIMATION_FADE_INTERPOLATOR = r0
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            com.google.android.material.snackbar.BaseTransientBottomBar.DEFAULT_ANIMATION_SCALE_INTERPOLATOR = r0
            r0 = 0
            com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API = r0
            int r0 = com.google.android.material.R.attr.snackbarStyle
            int[] r0 = new int[]{r0}
            com.google.android.material.snackbar.BaseTransientBottomBar.SNACKBAR_STYLE_ATTR = r0
            java.lang.Class<com.google.android.material.snackbar.BaseTransientBottomBar> r0 = com.google.android.material.snackbar.BaseTransientBottomBar.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.material.snackbar.BaseTransientBottomBar.TAG = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.material.snackbar.BaseTransientBottomBar$1 r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$1
            r2.<init>()
            r0.<init>(r1, r2)
            com.google.android.material.snackbar.BaseTransientBottomBar.handler = r0
            return
    }

    protected BaseTransientBottomBar(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.view.ViewGroup r4, @androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull com.google.android.material.snackbar.ContentViewCallback r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.anchorViewLayoutListenerEnabled = r0
            com.google.android.material.snackbar.BaseTransientBottomBar$2 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$2
            r1.<init>(r2)
            r2.bottomMarginGestureInsetRunnable = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$5 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$5
            r1.<init>(r2)
            r2.managerCallback = r1
            if (r4 == 0) goto Lb9
            if (r5 == 0) goto Lb1
            if (r6 == 0) goto La9
            r2.targetParent = r4
            r2.contentViewCallback = r6
            r2.context = r3
            com.google.android.material.internal.ThemeEnforcement.checkAppCompatTheme(r3)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r3)
            int r1 = r2.getSnackbarBaseLayoutResId()
            android.view.View r4 = r6.inflate(r1, r4, r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r4 = (com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout) r4
            r2.view = r4
            com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.access$500(r4, r2)
            boolean r6 = r5 instanceof com.google.android.material.snackbar.SnackbarContentLayout
            if (r6 == 0) goto L4b
            r6 = r5
            com.google.android.material.snackbar.SnackbarContentLayout r6 = (com.google.android.material.snackbar.SnackbarContentLayout) r6
            float r0 = r4.getActionTextColorAlpha()
            r6.updateActionTextColorAlphaIfNeeded(r0)
            int r0 = r4.getMaxInlineActionWidth()
            r6.setMaxInlineActionWidth(r0)
        L4b:
            r4.addView(r5)
            r5 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r4, r5)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r5)
            androidx.core.view.ViewCompat.setFitsSystemWindows(r4, r5)
            com.google.android.material.snackbar.BaseTransientBottomBar$3 r5 = new com.google.android.material.snackbar.BaseTransientBottomBar$3
            r5.<init>(r2)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r4, r5)
            com.google.android.material.snackbar.BaseTransientBottomBar$4 r5 = new com.google.android.material.snackbar.BaseTransientBottomBar$4
            r5.<init>(r2)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r4, r5)
            java.lang.String r4 = "accessibility"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            r2.accessibilityManager = r4
            int r4 = com.google.android.material.R.attr.motionDurationLong2
            r5 = 250(0xfa, float:3.5E-43)
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r3, r4, r5)
            r2.animationSlideDuration = r5
            r5 = 150(0x96, float:2.1E-43)
            int r4 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r3, r4, r5)
            r2.animationFadeInDuration = r4
            int r4 = com.google.android.material.R.attr.motionDurationMedium1
            r5 = 75
            int r4 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r3, r4, r5)
            r2.animationFadeOutDuration = r4
            int r4 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r5 = com.google.android.material.snackbar.BaseTransientBottomBar.DEFAULT_ANIMATION_FADE_INTERPOLATOR
            android.animation.TimeInterpolator r5 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r3, r4, r5)
            r2.animationFadeInterpolator = r5
            android.animation.TimeInterpolator r5 = com.google.android.material.snackbar.BaseTransientBottomBar.DEFAULT_ANIMATION_SCALE_INTERPOLATOR
            android.animation.TimeInterpolator r5 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r3, r4, r5)
            r2.animationScaleInterpolator = r5
            android.animation.TimeInterpolator r5 = com.google.android.material.snackbar.BaseTransientBottomBar.DEFAULT_ANIMATION_SLIDE_INTERPOLATOR
            android.animation.TimeInterpolator r3 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r3, r4, r5)
            r2.animationSlideInterpolator = r3
            return
        La9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Transient bottom bar must have non-null callback"
            r3.<init>(r4)
            throw r3
        Lb1:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Transient bottom bar must have non-null content"
            r3.<init>(r4)
            throw r3
        Lb9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Transient bottom bar must have non-null parent"
            r3.<init>(r4)
            throw r3
    }

    protected BaseTransientBottomBar(@androidx.annotation.NonNull android.view.ViewGroup r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull com.google.android.material.snackbar.ContentViewCallback r4) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    static /* synthetic */ android.content.Context access$000(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            android.content.Context r0 = r0.context
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.getViewAbsoluteBottom()
            return r0
    }

    static /* synthetic */ void access$1200(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.startFadeInAnimation()
            return
    }

    static /* synthetic */ void access$1300(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.startSlideInAnimation()
            return
    }

    static /* synthetic */ int access$1400(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.animationSlideDuration
            return r0
    }

    static /* synthetic */ int access$1500(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.animationFadeInDuration
            return r0
    }

    static /* synthetic */ com.google.android.material.snackbar.ContentViewCallback access$1600(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            com.google.android.material.snackbar.ContentViewCallback r0 = r0.contentViewCallback
            return r0
    }

    static /* synthetic */ boolean access$1700() {
            boolean r0 = com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API
            return r0
    }

    static /* synthetic */ int access$1800(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.animationFadeOutDuration
            return r0
    }

    static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$1900(int r0, com.google.android.material.shape.ShapeAppearanceModel r1) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = createMaterialShapeDrawableBackground(r0, r1)
            return r0
    }

    static /* synthetic */ int access$200(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.extraBottomMarginGestureInset
            return r0
    }

    static /* synthetic */ android.graphics.drawable.GradientDrawable access$2000(int r0, android.content.res.Resources r1) {
            android.graphics.drawable.GradientDrawable r0 = createGradientDrawableBackground(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$2100(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            boolean r0 = r0.anchorViewLayoutListenerEnabled
            return r0
    }

    static /* synthetic */ void access$2200(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.recalculateAndUpdateMargins()
            return
    }

    static /* synthetic */ int access$302(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.appliedBottomMarginGestureInset = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$400() {
            java.lang.String r0 = com.google.android.material.snackbar.BaseTransientBottomBar.TAG
            return r0
    }

    static /* synthetic */ int access$602(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraBottomMarginWindowInset = r1
            return r1
    }

    static /* synthetic */ int access$702(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraLeftMarginWindowInset = r1
            return r1
    }

    static /* synthetic */ int access$802(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraRightMarginWindowInset = r1
            return r1
    }

    static /* synthetic */ void access$900(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.updateMargins()
            return
    }

    private void animateViewOut(int r3) {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            int r0 = r0.getAnimationMode()
            r1 = 1
            if (r0 != r1) goto Ld
            r2.startFadeOutAnimation(r3)
            return
        Ld:
            r2.startSlideOutAnimation(r3)
            return
    }

    private int calculateBottomMarginForAnchorView() {
            r4 = this;
            android.view.View r0 = r4.getAnchorView()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 2
            int[] r1 = new int[r0]
            android.view.View r2 = r4.getAnchorView()
            r2.getLocationOnScreen(r1)
            r2 = 1
            r1 = r1[r2]
            int[] r0 = new int[r0]
            android.view.ViewGroup r3 = r4.targetParent
            r3.getLocationOnScreen(r0)
            r0 = r0[r2]
            android.view.ViewGroup r2 = r4.targetParent
            int r2 = r2.getHeight()
            int r0 = r0 + r2
            int r0 = r0 - r1
            return r0
    }

    @androidx.annotation.NonNull
    private static android.graphics.drawable.GradientDrawable createGradientDrawableBackground(@androidx.annotation.ColorInt int r2, @androidx.annotation.NonNull android.content.res.Resources r3) {
            int r0 = com.google.android.material.R.dimen.mtrl_snackbar_background_corner_radius
            float r3 = r3.getDimension(r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            r0.setCornerRadius(r3)
            r0.setColor(r2)
            return r0
    }

    @androidx.annotation.NonNull
    private static com.google.android.material.shape.MaterialShapeDrawable createMaterialShapeDrawableBackground(@androidx.annotation.ColorInt int r1, @androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r2) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>(r2)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
            return r0
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... r2) {
            r1 = this;
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r0 = r1.animationFadeInterpolator
            r2.setInterpolator(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$11 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$11
            r0.<init>(r1)
            r2.addUpdateListener(r0)
            return r2
    }

    private android.animation.ValueAnimator getScaleAnimator(float... r2) {
            r1 = this;
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r0 = r1.animationScaleInterpolator
            r2.setInterpolator(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$12 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$12
            r0.<init>(r1)
            r2.addUpdateListener(r0)
            return r2
    }

    private int getTranslationYBottom() {
            r3 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r3.view
            int r0 = r0.getHeight()
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r3.view
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L15
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L15:
            return r0
    }

    private int getViewAbsoluteBottom() {
            r2 = this;
            r0 = 2
            int[] r0 = new int[r0]
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r2.view
            r1.getLocationOnScreen(r0)
            r1 = 1
            r0 = r0[r1]
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r2.view
            int r1 = r1.getHeight()
            int r0 = r0 + r1
            return r0
    }

    private boolean isSwipeDismissable() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private void recalculateAndUpdateMargins() {
            r1 = this;
            int r0 = r1.calculateBottomMarginForAnchorView()
            r1.extraBottomMarginAnchorView = r0
            r1.updateMargins()
            return
    }

    private void setUpBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r3) {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r0 = r2.behavior
            if (r0 != 0) goto L8
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.getNewBehavior()
        L8:
            boolean r1 = r0 instanceof com.google.android.material.snackbar.BaseTransientBottomBar.Behavior
            if (r1 == 0) goto L12
            r1 = r0
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r1 = (com.google.android.material.snackbar.BaseTransientBottomBar.Behavior) r1
            com.google.android.material.snackbar.BaseTransientBottomBar.Behavior.access$1100(r1, r2)
        L12:
            com.google.android.material.snackbar.BaseTransientBottomBar$7 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$7
            r1.<init>(r2)
            r0.setListener(r1)
            r3.setBehavior(r0)
            android.view.View r0 = r2.getAnchorView()
            if (r0 != 0) goto L27
            r0 = 80
            r3.insetEdge = r0
        L27:
            return
    }

    private boolean shouldUpdateGestureInset() {
            r1 = this;
            int r0 = r1.extraBottomMarginGestureInset
            if (r0 <= 0) goto L10
            boolean r0 = r1.gestureInsetBottomIgnored
            if (r0 != 0) goto L10
            boolean r0 = r1.isSwipeDismissable()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private void showViewImpl() {
            r2 = this;
            boolean r0 = r2.shouldAnimate()
            if (r0 == 0) goto La
            r2.animateViewIn()
            return
        La:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L18
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r1 = 0
            r0.setVisibility(r1)
        L18:
            r2.onViewShown()
            return
    }

    private void startFadeInAnimation() {
            r5 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0036: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = r5.getAlphaAnimator(r1)
            float[] r2 = new float[r0]
            r2 = {x003e: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = r5.getScaleAnimator(r2)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r4 = 0
            r0[r4] = r1
            r1 = 1
            r0[r1] = r2
            r3.playTogether(r0)
            int r0 = r5.animationFadeInDuration
            long r0 = (long) r0
            r3.setDuration(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$9 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$9
            r0.<init>(r5)
            r3.addListener(r0)
            r3.start()
            return
    }

    private void startFadeOutAnimation(int r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r0)
            int r1 = r3.animationFadeOutDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$10 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$10
            r1.<init>(r3, r4)
            r0.addListener(r1)
            r0.start()
            return
    }

    private void startSlideInAnimation() {
            r4 = this;
            int r0 = r4.getTranslationYBottom()
            boolean r1 = com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API
            if (r1 == 0) goto Le
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r4.view
            androidx.core.view.ViewCompat.offsetTopAndBottom(r1, r0)
            goto L14
        Le:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r4.view
            float r2 = (float) r0
            r1.setTranslationY(r2)
        L14:
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r2 = 0
            int[] r2 = new int[]{r0, r2}
            r1.setIntValues(r2)
            android.animation.TimeInterpolator r2 = r4.animationSlideInterpolator
            r1.setInterpolator(r2)
            int r2 = r4.animationSlideDuration
            long r2 = (long) r2
            r1.setDuration(r2)
            com.google.android.material.snackbar.BaseTransientBottomBar$13 r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$13
            r2.<init>(r4)
            r1.addListener(r2)
            com.google.android.material.snackbar.BaseTransientBottomBar$14 r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$14
            r2.<init>(r4, r0)
            r1.addUpdateListener(r2)
            r1.start()
            return
    }

    private void startSlideOutAnimation(int r4) {
            r3 = this;
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r1 = 0
            int r2 = r3.getTranslationYBottom()
            int[] r1 = new int[]{r1, r2}
            r0.setIntValues(r1)
            android.animation.TimeInterpolator r1 = r3.animationSlideInterpolator
            r0.setInterpolator(r1)
            int r1 = r3.animationSlideDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$15 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$15
            r1.<init>(r3, r4)
            r0.addListener(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$16 r4 = new com.google.android.material.snackbar.BaseTransientBottomBar$16
            r4.<init>(r3)
            r0.addUpdateListener(r4)
            r0.start()
            return
    }

    private void updateMargins() {
            r6 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r6.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 != 0) goto Lb
            return
        Lb:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r6.view
            android.graphics.Rect r1 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.access$1000(r1)
            if (r1 != 0) goto L14
            return
        L14:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r6.view
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L1e
            goto L97
        L1e:
            android.view.View r1 = r6.getAnchorView()
            if (r1 == 0) goto L27
            int r1 = r6.extraBottomMarginAnchorView
            goto L29
        L27:
            int r1 = r6.extraBottomMarginWindowInset
        L29:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r2 = r6.view
            android.graphics.Rect r2 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.access$1000(r2)
            int r2 = r2.bottom
            int r2 = r2 + r1
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r6.view
            android.graphics.Rect r1 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.access$1000(r1)
            int r1 = r1.left
            int r3 = r6.extraLeftMarginWindowInset
            int r1 = r1 + r3
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r3 = r6.view
            android.graphics.Rect r3 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.access$1000(r3)
            int r3 = r3.right
            int r4 = r6.extraRightMarginWindowInset
            int r3 = r3 + r4
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r4 = r6.view
            android.graphics.Rect r4 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.access$1000(r4)
            int r4 = r4.top
            int r5 = r0.bottomMargin
            if (r5 != r2) goto L65
            int r5 = r0.leftMargin
            if (r5 != r1) goto L65
            int r5 = r0.rightMargin
            if (r5 != r3) goto L65
            int r5 = r0.topMargin
            if (r5 == r4) goto L63
            goto L65
        L63:
            r5 = 0
            goto L66
        L65:
            r5 = 1
        L66:
            if (r5 == 0) goto L75
            r0.bottomMargin = r2
            r0.leftMargin = r1
            r0.rightMargin = r3
            r0.topMargin = r4
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r6.view
            r0.requestLayout()
        L75:
            if (r5 != 0) goto L7d
            int r0 = r6.appliedBottomMarginGestureInset
            int r1 = r6.extraBottomMarginGestureInset
            if (r0 == r1) goto L97
        L7d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L97
            boolean r0 = r6.shouldUpdateGestureInset()
            if (r0 == 0) goto L97
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r6.view
            java.lang.Runnable r1 = r6.bottomMarginGestureInsetRunnable
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r6.view
            java.lang.Runnable r1 = r6.bottomMarginGestureInsetRunnable
            r0.post(r1)
        L97:
            return
    }

    @androidx.annotation.NonNull
    public B addCallback(@androidx.annotation.Nullable com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B> r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r1.callbacks
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.callbacks = r0
        Le:
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r1.callbacks
            r0.add(r2)
            return r1
    }

    void animateViewIn() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            com.google.android.material.snackbar.BaseTransientBottomBar$8 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$8
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void dismiss() {
            r1 = this;
            r0 = 3
            r1.dispatchDismiss(r0)
            return
    }

    protected void dispatchDismiss(int r3) {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            r0.dismiss(r1, r3)
            return
    }

    @androidx.annotation.Nullable
    public android.view.View getAnchorView() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Anchor r0 = r1.anchor
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getAnchorView()
            return r0
    }

    public int getAnimationMode() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            int r0 = r0.getAnimationMode()
            return r0
    }

    public com.google.android.material.snackbar.BaseTransientBottomBar.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r0 = r1.behavior
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.duration
            return r0
    }

    @androidx.annotation.NonNull
    protected com.google.android.material.behavior.SwipeDismissBehavior<? extends android.view.View> getNewBehavior() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r0.<init>()
            return r0
    }

    @androidx.annotation.LayoutRes
    protected int getSnackbarBaseLayoutResId() {
            r1 = this;
            boolean r0 = r1.hasSnackbarStyleAttr()
            if (r0 == 0) goto L9
            int r0 = com.google.android.material.R.layout.mtrl_layout_snackbar
            return r0
        L9:
            int r0 = com.google.android.material.R.layout.design_layout_snackbar
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            return r0
    }

    protected boolean hasSnackbarStyleAttr() {
            r4 = this;
            android.content.Context r0 = r4.context
            int[] r1 = com.google.android.material.snackbar.BaseTransientBottomBar.SNACKBAR_STYLE_ATTR
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            r2 = -1
            int r3 = r0.getResourceId(r1, r2)
            r0.recycle()
            if (r3 == r2) goto L15
            r0 = 1
            return r0
        L15:
            return r1
    }

    final void hideView(int r2) {
            r1 = this;
            boolean r0 = r1.shouldAnimate()
            if (r0 == 0) goto L12
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r1.animateViewOut(r2)
            return
        L12:
            r1.onViewHidden(r2)
            return
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
            r1 = this;
            boolean r0 = r1.anchorViewLayoutListenerEnabled
            return r0
    }

    public boolean isGestureInsetBottomIgnored() {
            r1 = this;
            boolean r0 = r1.gestureInsetBottomIgnored
            return r0
    }

    public boolean isShown() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            boolean r0 = r0.isCurrent(r1)
            return r0
    }

    public boolean isShownOrQueued() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            boolean r0 = r0.isCurrentOrNext(r1)
            return r0
    }

    void onAttachedToWindow() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1b
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.WindowInsets r0 = com.google.android.material.snackbar.a.a(r0)
            if (r0 == 0) goto L1b
            android.graphics.Insets r0 = androidx.core.view.b2.a(r0)
            int r0 = androidx.appcompat.widget.i.a(r0)
            r2.extraBottomMarginGestureInset = r0
            r2.updateMargins()
        L1b:
            return
    }

    void onDetachedFromWindow() {
            r2 = this;
            boolean r0 = r2.isShownOrQueued()
            if (r0 == 0) goto L10
            android.os.Handler r0 = com.google.android.material.snackbar.BaseTransientBottomBar.handler
            com.google.android.material.snackbar.BaseTransientBottomBar$6 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$6
            r1.<init>(r2)
            r0.post(r1)
        L10:
            return
    }

    void onLayoutChange() {
            r1 = this;
            boolean r0 = r1.pendingShowingView
            if (r0 == 0) goto La
            r1.showViewImpl()
            r0 = 0
            r1.pendingShowingView = r0
        La:
            return
    }

    void onViewHidden(int r3) {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            r0.onDismissed(r1)
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r2.callbacks
            if (r0 == 0) goto L23
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L13:
            if (r0 < 0) goto L23
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r1 = r2.callbacks
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback r1 = (com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback) r1
            r1.onDismissed(r2, r3)
            int r0 = r0 + (-1)
            goto L13
        L23:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r3 = r2.view
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L34
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r3.removeView(r0)
        L34:
            return
    }

    void onViewShown() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            r0.onShown(r1)
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r2.callbacks
            if (r0 == 0) goto L23
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L13:
            if (r0 < 0) goto L23
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r1 = r2.callbacks
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback r1 = (com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback) r1
            r1.onShown(r2)
            int r0 = r0 + (-1)
            goto L13
        L23:
            return
    }

    @androidx.annotation.NonNull
    public B removeCallback(@androidx.annotation.Nullable com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B> r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L7
        L3:
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r1.callbacks
            if (r0 != 0) goto L8
        L7:
            return r1
        L8:
            r0.remove(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public B setAnchorView(@androidx.annotation.IdRes int r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.targetParent
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto Ld
            com.google.android.material.snackbar.BaseTransientBottomBar r4 = r3.setAnchorView(r0)
            return r4
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find anchor view with id: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @androidx.annotation.NonNull
    public B setAnchorView(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Anchor r0 = r1.anchor
            if (r0 == 0) goto L7
            r0.unanchor()
        L7:
            if (r2 != 0) goto Lb
            r2 = 0
            goto Lf
        Lb:
            com.google.android.material.snackbar.BaseTransientBottomBar$Anchor r2 = com.google.android.material.snackbar.BaseTransientBottomBar.Anchor.anchor(r1, r2)
        Lf:
            r1.anchor = r2
            return r1
    }

    public void setAnchorViewLayoutListenerEnabled(boolean r1) {
            r0 = this;
            r0.anchorViewLayoutListenerEnabled = r1
            return
    }

    @androidx.annotation.NonNull
    public B setAnimationMode(int r2) {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            r0.setAnimationMode(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public B setBehavior(com.google.android.material.snackbar.BaseTransientBottomBar.Behavior r1) {
            r0 = this;
            r0.behavior = r1
            return r0
    }

    @androidx.annotation.NonNull
    public B setDuration(int r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    @androidx.annotation.NonNull
    public B setGestureInsetBottomIgnored(boolean r1) {
            r0 = this;
            r0.gestureInsetBottomIgnored = r1
            return r0
    }

    boolean shouldAnimate() {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r1)
            if (r0 == 0) goto L13
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            return r0
    }

    public void show() {
            r3 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            int r1 = r3.getDuration()
            com.google.android.material.snackbar.SnackbarManager$Callback r2 = r3.managerCallback
            r0.show(r1, r2)
            return
    }

    final void showView() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L27
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L17
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            r2.setUpBehavior(r0)
        L17:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewGroup r1 = r2.targetParent
            r0.addToTargetParent(r1)
            r2.recalculateAndUpdateMargins()
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r1 = 4
            r0.setVisibility(r1)
        L27:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r0 == 0) goto L33
            r2.showViewImpl()
            return
        L33:
            r0 = 1
            r2.pendingShowingView = r0
            return
    }
}

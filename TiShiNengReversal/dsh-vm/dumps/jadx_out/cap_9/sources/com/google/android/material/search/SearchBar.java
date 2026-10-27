package com.google.android.material.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SearchBar extends androidx.appcompat.widget.Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = 0;
    private static final java.lang.String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";

    @androidx.annotation.Nullable
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private com.google.android.material.shape.MaterialShapeDrawable backgroundShape;

    @androidx.annotation.Nullable
    private android.view.View centerView;
    private final boolean defaultMarginsEnabled;
    private final android.graphics.drawable.Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;

    @androidx.annotation.Nullable
    private java.lang.Integer navigationIconTint;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable originalNavigationIconBackground;
    private final com.google.android.material.search.SearchBarAnimationHelper searchBarAnimationHelper;
    private final android.widget.TextView textView;
    private final boolean tintNavigationIcon;
    private final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnLoadAnimationCallback {
        public OnLoadAnimationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAnimationEnd() {
                r0 = this;
                return
        }

        public void onAnimationStart() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchBar.SavedState> CREATOR = null;
        java.lang.String text;


        static {
                com.google.android.material.search.SearchBar$SavedState$1 r0 = new com.google.android.material.search.SearchBar$SavedState$1
                r0.<init>()
                com.google.android.material.search.SearchBar.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r1 = r1.readString()
                r0.text = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.text
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.initialized = r0
                return
        }

        public ScrollingViewBehavior(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.initialized = r1
                return
        }

        private void setAppBarLayoutTransparent(com.google.android.material.appbar.AppBarLayout r3) {
                r2 = this;
                r0 = 0
                r3.setBackgroundColor(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                if (r0 != r1) goto Lf
                r0 = 0
                r3.setOutlineProvider(r0)
                return
            Lf:
                r0 = 0
                r3.setTargetElevation(r0)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
        public boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                boolean r1 = super.onDependentViewChanged(r1, r2, r3)
                boolean r2 = r0.initialized
                if (r2 != 0) goto L14
                boolean r2 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L14
                r2 = 1
                r0.initialized = r2
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r0.setAppBarLayoutTransparent(r3)
            L14:
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean shouldHeaderOverlapScrollingChild() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_SearchBar
            com.google.android.material.search.SearchBar.DEF_STYLE_RES = r0
            return
    }

    public SearchBar(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchBar(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialSearchBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchBar(@androidx.annotation.NonNull android.content.Context r14, @androidx.annotation.Nullable android.util.AttributeSet r15, int r16) {
            r13 = this;
            r3 = r16
            int r4 = com.google.android.material.search.SearchBar.DEF_STYLE_RES
            android.content.Context r14 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r14, r15, r3, r4)
            r13.<init>(r14, r15, r3)
            r14 = -1
            r13.menuResId = r14
            com.google.android.material.search.b r0 = new com.google.android.material.search.b
            r0.<init>(r13)
            r13.touchExplorationStateChangeListener = r0
            android.content.Context r0 = r13.getContext()
            r13.validateAttributes(r15)
            int r2 = r13.getDefaultNavigationIconResource()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r13.defaultNavigationIcon = r2
            com.google.android.material.search.SearchBarAnimationHelper r2 = new com.google.android.material.search.SearchBarAnimationHelper
            r2.<init>()
            r13.searchBarAnimationHelper = r2
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r15
            android.content.res.TypedArray r2 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r0, r15, r3, r4)
            com.google.android.material.shape.ShapeAppearanceModel r8 = r1.build()
            int r1 = com.google.android.material.R.styleable.SearchBar_backgroundTint
            int r9 = r2.getColor(r1, r6)
            int r1 = com.google.android.material.R.styleable.SearchBar_elevation
            r3 = 0
            float r10 = r2.getDimension(r1, r3)
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r3 = 1
            boolean r1 = r2.getBoolean(r1, r3)
            r13.defaultMarginsEnabled = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r1 = r2.getBoolean(r1, r3)
            r13.defaultScrollFlagsEnabled = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r1 = r2.getBoolean(r1, r6)
            int r4 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r4 = r2.getBoolean(r4, r6)
            r13.forceDefaultNavigationOnClickListener = r4
            int r4 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r4 = r2.getBoolean(r4, r3)
            r13.tintNavigationIcon = r4
            int r4 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L85
            int r4 = r2.getColor(r4, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.navigationIconTint = r4
        L85:
            int r4 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r14 = r2.getResourceId(r4, r14)
            int r4 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r4 = r2.getString(r4)
            int r5 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r5 = r2.getString(r5)
            int r7 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r2.getDimension(r7, r11)
            int r7 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r12 = r2.getColor(r7, r6)
            r2.recycle()
            if (r1 != 0) goto Lad
            r13.initNavigationIcon()
        Lad:
            r13.setClickable(r3)
            r13.setFocusable(r3)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.google.android.material.R.layout.mtrl_search_bar
            r0.inflate(r1, r13)
            r13.layoutInflated = r3
            int r0 = com.google.android.material.R.id.open_search_bar_text_view
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.textView = r0
            androidx.core.view.ViewCompat.setElevation(r13, r10)
            r13.initTextView(r14, r4, r5)
            r7 = r13
            r7.initBackground(r8, r9, r10, r11, r12)
            android.content.Context r14 = r13.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r14 = r14.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r14 = (android.view.accessibility.AccessibilityManager) r14
            r13.accessibilityManager = r14
            r13.setupTouchExplorationStateChangeListener()
            return
    }

    public static /* synthetic */ void a(com.google.android.material.search.SearchBar r0, boolean r1) {
            r0.setFocusableInTouchMode(r1)
            return
    }

    static /* synthetic */ android.view.accessibility.AccessibilityManager access$000(com.google.android.material.search.SearchBar r0) {
            android.view.accessibility.AccessibilityManager r0 = r0.accessibilityManager
            return r0
    }

    static /* synthetic */ androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener access$100(com.google.android.material.search.SearchBar r0) {
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r0.touchExplorationStateChangeListener
            return r0
    }

    public static /* synthetic */ void b(com.google.android.material.search.SearchBar r1) {
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startOnLoadAnimation(r1)
            return
    }

    private int defaultIfZero(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return r2
        L3:
            return r1
    }

    private android.content.res.ColorStateList getCompatBackgroundColorStateList(@androidx.annotation.ColorInt int r5, @androidx.annotation.ColorInt int r6) {
            r4 = this;
            r0 = 0
            int[] r1 = new int[r0]
            r2 = 3
            int[][] r2 = new int[r2][]
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r3 = new int[]{r3}
            r2[r0] = r3
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0}
            r3 = 1
            r2[r3] = r0
            r0 = 2
            r2[r0] = r1
            int r6 = com.google.android.material.color.MaterialColors.layer(r5, r6)
            int[] r5 = new int[]{r6, r6, r5}
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r6.<init>(r2, r5)
            return r6
    }

    private void initBackground(com.google.android.material.shape.ShapeAppearanceModel r2, @androidx.annotation.ColorInt int r3, float r4, float r5, @androidx.annotation.ColorInt int r6) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>(r2)
            r1.backgroundShape = r0
            android.content.Context r2 = r1.getContext()
            r0.initializeElevationOverlay(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.backgroundShape
            r2.setElevation(r4)
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L1d
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.backgroundShape
            r2.setStroke(r5, r6)
        L1d:
            int r2 = com.google.android.material.R.attr.colorControlHighlight
            int r2 = com.google.android.material.color.MaterialColors.getColor(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r1.backgroundShape
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r4.setFillColor(r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r1.backgroundShape
            r3.<init>(r2, r4, r4)
            androidx.core.view.ViewCompat.setBackground(r1, r3)
            return
    }

    private void initNavigationIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
            if (r0 != 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.defaultNavigationIcon
            goto Ld
        L9:
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
        Ld:
            r1.setNavigationIcon(r0)
            r0 = 1
            r1.setNavigationIconDecorative(r0)
            return
    }

    private void initTextView(@androidx.annotation.StyleRes int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.widget.TextView r0 = r1.textView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L8:
            r1.setText(r3)
            r1.setHint(r4)
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 != 0) goto L29
            android.widget.TextView r2 = r1.textView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r3 = r1.getResources()
            int r4 = com.google.android.material.R.dimen.m3_searchbar_text_margin_start_no_navigation_icon
            int r3 = r3.getDimensionPixelSize(r4)
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r2, r3)
        L29:
            return
    }

    private void layoutCenterView() {
            r9 = this;
            android.view.View r0 = r9.centerView
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.getMeasuredWidth()
            int r1 = r9.getMeasuredWidth()
            int r1 = r1 / 2
            int r2 = r0 / 2
            int r5 = r1 - r2
            int r7 = r5 + r0
            android.view.View r0 = r9.centerView
            int r0 = r0.getMeasuredHeight()
            int r1 = r9.getMeasuredHeight()
            int r1 = r1 / 2
            int r2 = r0 / 2
            int r6 = r1 - r2
            int r8 = r6 + r0
            android.view.View r4 = r9.centerView
            r3 = r9
            r3.layoutChild(r4, r5, r6, r7, r8)
            return
    }

    private void layoutChild(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L15
            int r0 = r2.getMeasuredWidth()
            int r0 = r0 - r6
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 - r4
            r3.layout(r0, r5, r6, r7)
            return
        L15:
            r3.layout(r4, r5, r6, r7)
            return
    }

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable maybeTintNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.tintNavigationIcon
            if (r0 == 0) goto L28
            if (r2 != 0) goto L7
            goto L28
        L7:
            java.lang.Integer r0 = r1.navigationIconTint
            if (r0 == 0) goto L10
            int r0 = r0.intValue()
            goto L1d
        L10:
            android.graphics.drawable.Drawable r0 = r1.defaultNavigationIcon
            if (r2 != r0) goto L17
            int r0 = com.google.android.material.R.attr.colorOnSurfaceVariant
            goto L19
        L17:
            int r0 = com.google.android.material.R.attr.colorOnSurface
        L19:
            int r0 = com.google.android.material.color.MaterialColors.getColor(r1, r0)
        L1d:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            androidx.core.graphics.drawable.DrawableCompat.setTint(r2, r0)
        L28:
            return r2
    }

    private void measureCenterView(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.centerView
            if (r0 == 0) goto L7
            r0.measure(r2, r3)
        L7:
            return
    }

    private void setDefaultMargins() {
            r4 = this;
            boolean r0 = r4.defaultMarginsEnabled
            if (r0 == 0) goto L44
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L44
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.google.android.material.R.dimen.m3_searchbar_margin_horizontal
            int r1 = r0.getDimensionPixelSize(r1)
            int r2 = r4.getDefaultMarginVerticalResource()
            int r0 = r0.getDimensionPixelSize(r2)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.leftMargin
            int r3 = r4.defaultIfZero(r3, r1)
            r2.leftMargin = r3
            int r3 = r2.topMargin
            int r3 = r4.defaultIfZero(r3, r0)
            r2.topMargin = r3
            int r3 = r2.rightMargin
            int r1 = r4.defaultIfZero(r3, r1)
            r2.rightMargin = r1
            int r1 = r2.bottomMargin
            int r0 = r4.defaultIfZero(r1, r0)
            r2.bottomMargin = r0
        L44:
            return
    }

    private void setNavigationIconDecorative(boolean r3) {
            r2 = this;
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r1 = r3 ^ 1
            r0.setClickable(r1)
            r1 = r3 ^ 1
            r0.setFocusable(r1)
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L19
            r2.originalNavigationIconBackground = r1
        L19:
            if (r3 == 0) goto L1d
            r3 = 0
            goto L1f
        L1d:
            android.graphics.drawable.Drawable r3 = r2.originalNavigationIconBackground
        L1f:
            r0.setBackgroundDrawable(r3)
            return
    }

    private void setOrClearDefaultScrollFlags() {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r0 = r0 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r0 == 0) goto L28
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
            boolean r1 = r3.defaultScrollFlagsEnabled
            r2 = 53
            if (r1 == 0) goto L1e
            int r1 = r0.getScrollFlags()
            if (r1 != 0) goto L28
            r0.setScrollFlags(r2)
            return
        L1e:
            int r1 = r0.getScrollFlags()
            if (r1 != r2) goto L28
            r1 = 0
            r0.setScrollFlags(r1)
        L28:
            return
    }

    private void setupTouchExplorationStateChangeListener() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L16
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L16
            r0 = 1
            r1.setFocusableInTouchMode(r0)
        L16:
            com.google.android.material.search.SearchBar$1 r0 = new com.google.android.material.search.SearchBar$1
            r0.<init>(r1)
            r1.addOnAttachStateChangeListener(r0)
        L1e:
            return
    }

    private void validateAttributes(@androidx.annotation.Nullable android.util.AttributeSet r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L15
        L3:
            java.lang.String r0 = "title"
            java.lang.String r1 = "http://schemas.android.com/apk/res-auto"
            java.lang.String r0 = r3.getAttributeValue(r1, r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "subtitle"
            java.lang.String r3 = r3.getAttributeValue(r1, r0)
            if (r3 != 0) goto L16
        L15:
            return
        L16:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "SearchBar does not support subtitle. Use hint or text instead."
            r3.<init>(r0)
            throw r3
        L1e:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "SearchBar does not support title. Use hint or text instead."
            r3.<init>(r0)
            throw r3
    }

    public void addCollapseAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addCollapseAnimationListener(r2)
            return
    }

    public void addExpandAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addExpandAnimationListener(r2)
            return
    }

    public void addOnLoadAnimationCallback(@androidx.annotation.NonNull com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.addOnLoadAnimationCallback(r2)
            return
    }

    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r1.layoutInflated
            if (r0 == 0) goto L12
            android.view.View r0 = r1.centerView
            if (r0 != 0) goto L12
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView
            if (r0 != 0) goto L12
            r1.centerView = r2
            r0 = 0
            r2.setAlpha(r0)
        L12:
            super/*android.view.ViewGroup*/.addView(r2, r3, r4)
            return
    }

    public void clearText() {
            r2 = this;
            android.widget.TextView r0 = r2.textView
            java.lang.String r1 = ""
            r0.setText(r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean collapse(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.collapse(r2, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean collapse(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.collapse(r2, r3, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean collapse(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 != 0) goto Lc
            boolean r0 = r1.isCollapsing()
            if (r0 == 0) goto L12
        Lc:
            boolean r0 = r1.isExpanding()
            if (r0 == 0) goto L19
        L12:
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startCollapseAnimation(r1, r2, r3, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean expand(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.expand(r2, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean expand(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.expand(r2, r3, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean expand(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable com.google.android.material.appbar.AppBarLayout r3, boolean r4) {
            r1 = this;
            int r0 = r2.getVisibility()
            if (r0 == 0) goto Lc
            boolean r0 = r1.isExpanding()
            if (r0 == 0) goto L12
        Lc:
            boolean r0 = r1.isCollapsing()
            if (r0 == 0) goto L19
        L12:
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.startExpandAnimation(r1, r2, r3, r4)
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public android.view.View getCenterView() {
            r1 = this;
            android.view.View r0 = r1.centerView
            return r0
    }

    float getCompatElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            if (r0 == 0) goto L9
            float r0 = r0.getElevation()
            return r0
        L9:
            float r0 = androidx.core.view.ViewCompat.getElevation(r1)
            return r0
    }

    public float getCornerSize() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            float r0 = r0.getTopLeftCornerResolvedSize()
            return r0
    }

    @androidx.annotation.DimenRes
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultMarginVerticalResource() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.m3_searchbar_margin_vertical
            return r0
    }

    @androidx.annotation.DrawableRes
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getHint() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getHint()
            return r0
    }

    int getMenuResId() {
            r1 = this;
            int r0 = r1.menuResId
            return r0
    }

    @androidx.annotation.ColorInt
    public int getStrokeColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            int r0 = r0.getDefaultColor()
            return r0
    }

    @androidx.annotation.Dimension
    public float getStrokeWidth() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            float r0 = r0.getStrokeWidth()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.CharSequence getText() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.TextView getTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            return r0
    }

    public void inflateMenu(@androidx.annotation.MenuRes int r4) {
            r3 = this;
            android.view.Menu r0 = r3.getMenu()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuBuilder
            if (r1 == 0) goto Le
            r2 = r0
            androidx.appcompat.view.menu.MenuBuilder r2 = (androidx.appcompat.view.menu.MenuBuilder) r2
            r2.stopDispatchingItemsChanged()
        Le:
            super.inflateMenu(r4)
            r3.menuResId = r4
            if (r1 == 0) goto L1a
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            r0.startDispatchingItemsChanged()
        L1a:
            return
    }

    public boolean isCollapsing() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isCollapsing()
            return r0
    }

    public boolean isDefaultScrollFlagsEnabled() {
            r1 = this;
            boolean r0 = r1.defaultScrollFlagsEnabled
            return r0
    }

    public boolean isExpanding() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isExpanding()
            return r0
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r0 = r0.isOnLoadAnimationFadeInEnabled()
            return r0
    }

    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
            r1.setDefaultMargins()
            r1.setOrClearDefaultScrollFlags()
            return
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super/*android.view.ViewGroup*/.onInitializeAccessibilityNodeInfo(r5)
            java.lang.Class<android.widget.EditText> r0 = android.widget.EditText.class
            java.lang.String r0 = r0.getCanonicalName()
            r5.setClassName(r0)
            java.lang.CharSequence r0 = r4.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L24
            java.lang.CharSequence r2 = r4.getHint()
            androidx.core.view.accessibility.m.a(r5, r2)
            androidx.core.view.accessibility.o.a(r5, r1)
        L24:
            if (r1 == 0) goto L2a
            java.lang.CharSequence r0 = r4.getHint()
        L2a:
            r5.setText(r0)
            return
    }

    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.layoutCenterView()
            return
    }

    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            r0.measureCenterView(r1, r2)
            return
    }

    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchBar.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchBar$SavedState r2 = (com.google.android.material.search.SearchBar.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.text
            r1.setText(r2)
            return
    }

    @androidx.annotation.NonNull
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.search.SearchBar$SavedState r0 = new com.google.android.material.search.SearchBar$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.getText()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            java.lang.String r1 = r1.toString()
        L15:
            r0.text = r1
            return r0
    }

    public boolean removeCollapseAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeCollapseAnimationListener(r2)
            return r2
    }

    public boolean removeExpandAnimationListener(@androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeExpandAnimationListener(r2)
            return r2
    }

    public boolean removeOnLoadAnimationCallback(@androidx.annotation.NonNull com.google.android.material.search.SearchBar.OnLoadAnimationCallback r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            boolean r2 = r0.removeOnLoadAnimationCallback(r2)
            return r2
    }

    public void setCenterView(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.centerView
            if (r0 == 0) goto La
            r1.removeView(r0)
            r0 = 0
            r1.centerView = r0
        La:
            if (r2 == 0) goto Lf
            r1.addView(r2)
        Lf:
            return
    }

    public void setDefaultScrollFlagsEnabled(boolean r1) {
            r0 = this;
            r0.defaultScrollFlagsEnabled = r1
            r0.setOrClearDefaultScrollFlags()
            return
    }

    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r2) {
            r1 = this;
            super/*android.view.ViewGroup*/.setElevation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            if (r0 == 0) goto La
            r0.setElevation(r2)
        La:
            return
    }

    public void setHint(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setHint(r2)
            return
    }

    public void setHint(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setHint(r2)
            return
    }

    public void setNavigationIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.maybeTintNavigationIcon(r1)
            super.setNavigationIcon(r1)
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            boolean r0 = r1.forceDefaultNavigationOnClickListener
            if (r0 == 0) goto L5
            return
        L5:
            super.setNavigationOnClickListener(r2)
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.setNavigationIconDecorative(r2)
            return
    }

    public void setOnLoadAnimationFadeInEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.setOnLoadAnimationFadeInEnabled(r2)
            return
    }

    public void setStrokeColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.getStrokeColor()
            if (r0 == r2) goto Lf
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setStrokeColor(r2)
        Lf:
            return
    }

    public void setStrokeWidth(@androidx.annotation.Dimension float r2) {
            r1 = this;
            float r0 = r1.getStrokeWidth()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.backgroundShape
            r0.setStrokeWidth(r2)
        Ld:
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void setText(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    public void setText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void startOnLoadAnimation() {
            r1 = this;
            com.google.android.material.search.a r0 = new com.google.android.material.search.a
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    public void stopOnLoadAnimation() {
            r1 = this;
            com.google.android.material.search.SearchBarAnimationHelper r0 = r1.searchBarAnimationHelper
            r0.stopOnLoadAnimation(r1)
            return
    }
}

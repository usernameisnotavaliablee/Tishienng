package com.google.android.material.search;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SearchView extends android.widget.FrameLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior, com.google.android.material.motion.MaterialBackHandler {
    private static final int DEF_STYLE_RES = 0;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;

    @androidx.annotation.NonNull
    private final com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;

    @androidx.annotation.ColorInt
    private final int backgroundColor;
    final android.view.View backgroundView;
    private java.util.Map<android.view.View, java.lang.Integer> childImportantForAccessibilityMap;
    final android.widget.ImageButton clearButton;
    final com.google.android.material.internal.TouchObserverFrameLayout contentContainer;

    @androidx.annotation.NonNull
    private com.google.android.material.search.SearchView.TransitionState currentTransitionState;
    final android.view.View divider;
    final androidx.appcompat.widget.Toolbar dummyToolbar;
    final android.widget.EditText editText;
    private final com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
    final android.widget.FrameLayout headerContainer;
    private final boolean layoutInflated;
    final com.google.android.material.internal.ClippableRoundedCornerLayout rootView;
    final android.view.View scrim;

    @androidx.annotation.Nullable
    private com.google.android.material.search.SearchBar searchBar;
    final android.widget.TextView searchPrefix;
    private final com.google.android.material.search.SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final android.view.View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final com.google.android.material.appbar.MaterialToolbar toolbar;
    final android.widget.FrameLayout toolbarContainer;
    private final java.util.Set<com.google.android.material.search.SearchView.TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.search.SearchView> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                com.google.android.material.search.SearchView r2 = (com.google.android.material.search.SearchView) r2
                boolean r1 = r0.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        public boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.search.SearchView r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                boolean r1 = r2.isSetupWithSearchBar()
                if (r1 != 0) goto Lf
                boolean r1 = r3 instanceof com.google.android.material.search.SearchBar
                if (r1 == 0) goto Lf
                com.google.android.material.search.SearchBar r3 = (com.google.android.material.search.SearchBar) r3
                r2.setupWithSearchBar(r3)
            Lf:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchView.SavedState> CREATOR = null;
        java.lang.String text;
        int visibility;


        static {
                com.google.android.material.search.SearchView$SavedState$1 r0 = new com.google.android.material.search.SearchView$SavedState$1
                r0.<init>()
                com.google.android.material.search.SearchView.SavedState.CREATOR = r0
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
                java.lang.String r2 = r1.readString()
                r0.text = r2
                int r1 = r1.readInt()
                r0.visibility = r1
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
                int r2 = r0.visibility
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface TransitionListener {
        void onStateChanged(@androidx.annotation.NonNull com.google.android.material.search.SearchView r1, @androidx.annotation.NonNull com.google.android.material.search.SearchView.TransitionState r2, @androidx.annotation.NonNull com.google.android.material.search.SearchView.TransitionState r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum TransitionState extends java.lang.Enum<com.google.android.material.search.SearchView.TransitionState> {
        private static final /* synthetic */ com.google.android.material.search.SearchView.TransitionState[] $VALUES = null;
        public static final com.google.android.material.search.SearchView.TransitionState HIDDEN = null;
        public static final com.google.android.material.search.SearchView.TransitionState HIDING = null;
        public static final com.google.android.material.search.SearchView.TransitionState SHOWING = null;
        public static final com.google.android.material.search.SearchView.TransitionState SHOWN = null;

        static {
                com.google.android.material.search.SearchView$TransitionState r0 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r1 = "HIDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.search.SearchView.TransitionState.HIDING = r0
                com.google.android.material.search.SearchView$TransitionState r1 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r3 = "HIDDEN"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.material.search.SearchView.TransitionState.HIDDEN = r1
                com.google.android.material.search.SearchView$TransitionState r3 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r5 = "SHOWING"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.material.search.SearchView.TransitionState.SHOWING = r3
                com.google.android.material.search.SearchView$TransitionState r5 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r7 = "SHOWN"
                r8 = 3
                r5.<init>(r7, r8)
                com.google.android.material.search.SearchView.TransitionState.SHOWN = r5
                r7 = 4
                com.google.android.material.search.SearchView$TransitionState[] r7 = new com.google.android.material.search.SearchView.TransitionState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.google.android.material.search.SearchView.TransitionState.$VALUES = r7
                return
        }

        TransitionState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.search.SearchView.TransitionState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.search.SearchView$TransitionState> r0 = com.google.android.material.search.SearchView.TransitionState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.search.SearchView$TransitionState r1 = (com.google.android.material.search.SearchView.TransitionState) r1
                return r1
        }

        public static com.google.android.material.search.SearchView.TransitionState[] values() {
                com.google.android.material.search.SearchView$TransitionState[] r0 = com.google.android.material.search.SearchView.TransitionState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.search.SearchView$TransitionState[] r0 = (com.google.android.material.search.SearchView.TransitionState[]) r0
                return r0
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_SearchView
            com.google.android.material.search.SearchView.DEF_STYLE_RES = r0
            return
    }

    public SearchView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialSearchViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r4 = com.google.android.material.search.SearchView.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.motion.MaterialBackOrchestrator r9 = new com.google.android.material.motion.MaterialBackOrchestrator
            r9.<init>(r8)
            r8.backOrchestrator = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.transitionListeners = r9
            r9 = 16
            r8.softInputMode = r9
            com.google.android.material.search.SearchView$TransitionState r9 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            r8.currentTransitionState = r9
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.SearchView
            r9 = 0
            int[] r5 = new int[r9]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.SearchView_backgroundTint
            int r11 = r10.getColor(r11, r9)
            r8.backgroundColor = r11
            int r11 = com.google.android.material.R.styleable.SearchView_headerLayout
            r1 = -1
            int r11 = r10.getResourceId(r11, r1)
            int r2 = com.google.android.material.R.styleable.SearchView_android_textAppearance
            int r1 = r10.getResourceId(r2, r1)
            int r2 = com.google.android.material.R.styleable.SearchView_android_text
            java.lang.String r2 = r10.getString(r2)
            int r3 = com.google.android.material.R.styleable.SearchView_android_hint
            java.lang.String r3 = r10.getString(r3)
            int r4 = com.google.android.material.R.styleable.SearchView_searchPrefixText
            java.lang.String r4 = r10.getString(r4)
            int r5 = com.google.android.material.R.styleable.SearchView_useDrawerArrowDrawable
            boolean r5 = r10.getBoolean(r5, r9)
            int r6 = com.google.android.material.R.styleable.SearchView_animateNavigationIcon
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r8.animatedNavigationIcon = r6
            int r6 = com.google.android.material.R.styleable.SearchView_animateMenuItems
            boolean r6 = r10.getBoolean(r6, r7)
            r8.animatedMenuItems = r6
            int r6 = com.google.android.material.R.styleable.SearchView_hideNavigationIcon
            boolean r9 = r10.getBoolean(r6, r9)
            int r6 = com.google.android.material.R.styleable.SearchView_autoShowKeyboard
            boolean r6 = r10.getBoolean(r6, r7)
            r8.autoShowKeyboard = r6
            int r6 = com.google.android.material.R.styleable.SearchView_backHandlingEnabled
            boolean r6 = r10.getBoolean(r6, r7)
            r8.backHandlingEnabled = r6
            r10.recycle()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r0)
            int r6 = com.google.android.material.R.layout.mtrl_search_view
            r10.inflate(r6, r8)
            r8.layoutInflated = r7
            int r10 = com.google.android.material.R.id.open_search_view_scrim
            android.view.View r10 = r8.findViewById(r10)
            r8.scrim = r10
            int r10 = com.google.android.material.R.id.open_search_view_root
            android.view.View r10 = r8.findViewById(r10)
            com.google.android.material.internal.ClippableRoundedCornerLayout r10 = (com.google.android.material.internal.ClippableRoundedCornerLayout) r10
            r8.rootView = r10
            int r10 = com.google.android.material.R.id.open_search_view_background
            android.view.View r10 = r8.findViewById(r10)
            r8.backgroundView = r10
            int r10 = com.google.android.material.R.id.open_search_view_status_bar_spacer
            android.view.View r10 = r8.findViewById(r10)
            r8.statusBarSpacer = r10
            int r10 = com.google.android.material.R.id.open_search_view_header_container
            android.view.View r10 = r8.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r8.headerContainer = r10
            int r10 = com.google.android.material.R.id.open_search_view_toolbar_container
            android.view.View r10 = r8.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r8.toolbarContainer = r10
            int r10 = com.google.android.material.R.id.open_search_view_toolbar
            android.view.View r10 = r8.findViewById(r10)
            com.google.android.material.appbar.MaterialToolbar r10 = (com.google.android.material.appbar.MaterialToolbar) r10
            r8.toolbar = r10
            int r10 = com.google.android.material.R.id.open_search_view_dummy_toolbar
            android.view.View r10 = r8.findViewById(r10)
            androidx.appcompat.widget.Toolbar r10 = (androidx.appcompat.widget.Toolbar) r10
            r8.dummyToolbar = r10
            int r10 = com.google.android.material.R.id.open_search_view_search_prefix
            android.view.View r10 = r8.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8.searchPrefix = r10
            int r10 = com.google.android.material.R.id.open_search_view_edit_text
            android.view.View r10 = r8.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r8.editText = r10
            int r10 = com.google.android.material.R.id.open_search_view_clear_button
            android.view.View r10 = r8.findViewById(r10)
            android.widget.ImageButton r10 = (android.widget.ImageButton) r10
            r8.clearButton = r10
            int r10 = com.google.android.material.R.id.open_search_view_divider
            android.view.View r10 = r8.findViewById(r10)
            r8.divider = r10
            int r10 = com.google.android.material.R.id.open_search_view_content_container
            android.view.View r10 = r8.findViewById(r10)
            com.google.android.material.internal.TouchObserverFrameLayout r10 = (com.google.android.material.internal.TouchObserverFrameLayout) r10
            r8.contentContainer = r10
            com.google.android.material.search.SearchViewAnimationHelper r10 = new com.google.android.material.search.SearchViewAnimationHelper
            r10.<init>(r8)
            r8.searchViewAnimationHelper = r10
            com.google.android.material.elevation.ElevationOverlayProvider r10 = new com.google.android.material.elevation.ElevationOverlayProvider
            r10.<init>(r0)
            r8.elevationOverlayProvider = r10
            r8.setUpRootView()
            r8.setUpBackgroundViewElevationOverlay()
            r8.setUpHeaderLayout(r11)
            r8.setSearchPrefixText(r4)
            r8.setUpEditText(r1, r2, r3)
            r8.setUpBackButton(r5, r9)
            r8.setUpClearButton()
            r8.setUpContentOnTouchListener()
            r8.setUpInsetListeners()
            return
    }

    public static /* synthetic */ void a(com.google.android.material.search.SearchView r0, android.view.View r1) {
            r0.show()
            return
    }

    public static /* synthetic */ androidx.core.view.WindowInsetsCompat b(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, android.view.View r3, androidx.core.view.WindowInsetsCompat r4) {
            int r3 = r4.getSystemWindowInsetLeft()
            int r1 = r1 + r3
            r0.leftMargin = r1
            int r1 = r4.getSystemWindowInsetRight()
            int r2 = r2 + r1
            r0.rightMargin = r2
            return r4
    }

    public static /* synthetic */ boolean c(com.google.android.material.search.SearchView r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r1 = r0.isAdjustNothingSoftInputMode()
            if (r1 == 0) goto L9
            r0.clearFocusAndHideKeyboard()
        L9:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void d(com.google.android.material.search.SearchView r1) {
            android.widget.EditText r0 = r1.editText
            r0.clearFocus()
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 == 0) goto Lc
            r0.requestFocus()
        Lc:
            android.widget.EditText r0 = r1.editText
            boolean r1 = r1.useWindowInsetsController
            com.google.android.material.internal.ViewUtils.hideKeyboard(r0, r1)
            return
    }

    public static /* synthetic */ void e(com.google.android.material.search.SearchView r2) {
            android.widget.EditText r0 = r2.editText
            boolean r0 = r0.requestFocus()
            if (r0 == 0) goto Lf
            android.widget.EditText r0 = r2.editText
            r1 = 8
            r0.sendAccessibilityEvent(r1)
        Lf:
            android.widget.EditText r0 = r2.editText
            boolean r2 = r2.useWindowInsetsController
            com.google.android.material.internal.ViewUtils.showKeyboard(r0, r2)
            return
    }

    public static /* synthetic */ void f(com.google.android.material.search.SearchView r0, android.view.View r1) {
            r0.clearText()
            r0.requestFocusAndShowKeyboardIfNeeded()
            return
    }

    public static /* synthetic */ androidx.core.view.WindowInsetsCompat g(com.google.android.material.search.SearchView r3, android.view.View r4, androidx.core.view.WindowInsetsCompat r5, com.google.android.material.internal.ViewUtils.RelativePadding r6) {
            com.google.android.material.appbar.MaterialToolbar r4 = r3.toolbar
            boolean r4 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r4)
            if (r4 == 0) goto Lb
            int r0 = r6.end
            goto Ld
        Lb:
            int r0 = r6.start
        Ld:
            if (r4 == 0) goto L12
            int r4 = r6.start
            goto L14
        L12:
            int r4 = r6.end
        L14:
            com.google.android.material.appbar.MaterialToolbar r3 = r3.toolbar
            int r1 = r5.getSystemWindowInsetLeft()
            int r0 = r0 + r1
            int r1 = r6.top
            int r2 = r5.getSystemWindowInsetRight()
            int r4 = r4 + r2
            int r6 = r6.bottom
            r3.setPadding(r0, r1, r4, r6)
            return r5
    }

    @androidx.annotation.Nullable
    private android.view.Window getActivityWindow() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.app.Activity r0 = com.google.android.material.internal.ContextUtils.getActivity(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            android.view.Window r0 = r0.getWindow()
            return r0
    }

    private float getOverlayElevation() {
            r2 = this;
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto L9
            float r0 = r0.getCompatElevation()
            return r0
        L9:
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.dimen.m3_searchview_elevation
            float r0 = r0.getDimension(r1)
            return r0
    }

    @androidx.annotation.Px
    private int getStatusBarHeight() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L19
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r1.getDimensionPixelSize(r0)
            return r0
        L19:
            r0 = 0
            return r0
    }

    public static /* synthetic */ androidx.core.view.WindowInsetsCompat h(com.google.android.material.search.SearchView r1, android.view.View r2, androidx.core.view.WindowInsetsCompat r3) {
            r1.getClass()
            int r2 = r3.getSystemWindowInsetTop()
            r1.setUpStatusBarSpacer(r2)
            boolean r0 = r1.statusBarSpacerEnabledOverride
            if (r0 != 0) goto L16
            if (r2 <= 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            r1.setStatusBarSpacerEnabledInternal(r2)
        L16:
            return r3
    }

    public static /* synthetic */ boolean i(android.view.View r0, android.view.MotionEvent r1) {
            r0 = 1
            return r0
    }

    private boolean isHiddenOrHiding() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    private boolean isNavigationIconDrawerArrowDrawable(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r1)
            boolean r1 = r1 instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            return r1
    }

    public static /* synthetic */ void j(com.google.android.material.search.SearchView r0, android.view.View r1) {
            r0.hide()
            return
    }

    private void setStatusBarSpacerEnabledInternal(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.statusBarSpacer
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r0.setVisibility(r2)
            return
    }

    private void setTransitionState(@androidx.annotation.NonNull com.google.android.material.search.SearchView.TransitionState r3, boolean r4) {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9
            goto L5e
        L9:
            if (r4 == 0) goto L1c
            com.google.android.material.search.SearchView$TransitionState r4 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            if (r3 != r4) goto L14
            r4 = 1
            r2.setModalForAccessibility(r4)
            goto L1c
        L14:
            com.google.android.material.search.SearchView$TransitionState r4 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            if (r3 != r4) goto L1c
            r4 = 0
            r2.setModalForAccessibility(r4)
        L1c:
            com.google.android.material.search.SearchView$TransitionState r4 = r2.currentTransitionState
            r2.currentTransitionState = r3
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set<com.google.android.material.search.SearchView$TransitionListener> r1 = r2.transitionListeners
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            com.google.android.material.search.SearchView$TransitionListener r1 = (com.google.android.material.search.SearchView.TransitionListener) r1
            r1.onStateChanged(r2, r4, r3)
            goto L2b
        L3b:
            com.google.android.material.search.SearchBar r4 = r2.searchBar
            if (r4 == 0) goto L5e
            boolean r4 = r2.backHandlingEnabled
            if (r4 == 0) goto L5e
            com.google.android.material.search.SearchView$TransitionState r4 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L51
            com.google.android.material.motion.MaterialBackOrchestrator r3 = r2.backOrchestrator
            r3.startListeningForBackCallbacks()
            return
        L51:
            com.google.android.material.search.SearchView$TransitionState r4 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5e
            com.google.android.material.motion.MaterialBackOrchestrator r3 = r2.backOrchestrator
            r3.stopListeningForBackCallbacks()
        L5e:
            return
    }

    private void setUpBackButton(boolean r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L9
            com.google.android.material.appbar.MaterialToolbar r2 = r1.toolbar
            r3 = 0
            r2.setNavigationIcon(r3)
            return
        L9:
            com.google.android.material.appbar.MaterialToolbar r3 = r1.toolbar
            com.google.android.material.search.k r0 = new com.google.android.material.search.k
            r0.<init>(r1)
            r3.setNavigationOnClickListener(r0)
            if (r2 == 0) goto L2c
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r2 = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            int r3 = com.google.android.material.R.attr.colorOnSurface
            int r3 = com.google.android.material.color.MaterialColors.getColor(r1, r3)
            r2.setColor(r3)
            com.google.android.material.appbar.MaterialToolbar r3 = r1.toolbar
            r3.setNavigationIcon(r2)
        L2c:
            return
    }

    private void setUpBackgroundViewElevationOverlay() {
            r1 = this;
            float r0 = r1.getOverlayElevation()
            r1.setUpBackgroundViewElevationOverlay(r0)
            return
    }

    private void setUpBackgroundViewElevationOverlay(float r3) {
            r2 = this;
            com.google.android.material.elevation.ElevationOverlayProvider r0 = r2.elevationOverlayProvider
            if (r0 == 0) goto L14
            android.view.View r1 = r2.backgroundView
            if (r1 != 0) goto L9
            goto L14
        L9:
            int r1 = r2.backgroundColor
            int r3 = r0.compositeOverlayIfNeeded(r1, r3)
            android.view.View r0 = r2.backgroundView
            r0.setBackgroundColor(r3)
        L14:
            return
    }

    private void setUpClearButton() {
            r2 = this;
            android.widget.ImageButton r0 = r2.clearButton
            com.google.android.material.search.m r1 = new com.google.android.material.search.m
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.EditText r0 = r2.editText
            com.google.android.material.search.SearchView$1 r1 = new com.google.android.material.search.SearchView$1
            r1.<init>(r2)
            r0.addTextChangedListener(r1)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
            r2 = this;
            com.google.android.material.internal.TouchObserverFrameLayout r0 = r2.contentContainer
            com.google.android.material.search.u r1 = new com.google.android.material.search.u
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            return
    }

    private void setUpDividerInsetListener() {
            r5 = this;
            android.view.View r0 = r5.divider
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            int r2 = r0.rightMargin
            android.view.View r3 = r5.divider
            com.google.android.material.search.n r4 = new com.google.android.material.search.n
            r4.<init>(r0, r1, r2)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r3, r4)
            return
    }

    private void setUpEditText(@androidx.annotation.StyleRes int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.widget.EditText r0 = r1.editText
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L8:
            android.widget.EditText r2 = r1.editText
            r2.setText(r3)
            android.widget.EditText r2 = r1.editText
            r2.setHint(r4)
            return
    }

    private void setUpHeaderLayout(int r4) {
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L15
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.FrameLayout r1 = r3.headerContainer
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.addHeaderView(r4)
        L15:
            return
    }

    private void setUpInsetListeners() {
            r0 = this;
            r0.setUpToolbarInsetListener()
            r0.setUpDividerInsetListener()
            r0.setUpStatusBarSpacerInsetListener()
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
            r2 = this;
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r2.rootView
            com.google.android.material.search.t r1 = new com.google.android.material.search.t
            r1.<init>()
            r0.setOnTouchListener(r1)
            return
    }

    private void setUpStatusBarSpacer(@androidx.annotation.Px int r2) {
            r1 = this;
            android.view.View r0 = r1.statusBarSpacer
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            if (r0 == r2) goto L17
            android.view.View r0 = r1.statusBarSpacer
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            android.view.View r2 = r1.statusBarSpacer
            r2.requestLayout()
        L17:
            return
    }

    private void setUpStatusBarSpacerInsetListener() {
            r2 = this;
            int r0 = r2.getStatusBarHeight()
            r2.setUpStatusBarSpacer(r0)
            android.view.View r0 = r2.statusBarSpacer
            com.google.android.material.search.q r1 = new com.google.android.material.search.q
            r1.<init>(r2)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r0, r1)
            return
    }

    private void setUpToolbarInsetListener() {
            r2 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r2.toolbar
            com.google.android.material.search.p r1 = new com.google.android.material.search.p
            r1.<init>(r2)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(android.view.ViewGroup r5, boolean r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L50
            android.view.View r1 = r5.getChildAt(r0)
            if (r1 != r4) goto Le
            goto L4d
        Le:
            com.google.android.material.internal.ClippableRoundedCornerLayout r2 = r4.rootView
            int r2 = r2.getId()
            android.view.View r2 = r1.findViewById(r2)
            if (r2 == 0) goto L20
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.updateChildImportantForAccessibility(r1, r6)
            goto L4d
        L20:
            if (r6 != 0) goto L3c
            java.util.Map<android.view.View, java.lang.Integer> r2 = r4.childImportantForAccessibilityMap
            if (r2 == 0) goto L4d
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L4d
            java.util.Map<android.view.View, java.lang.Integer> r2 = r4.childImportantForAccessibilityMap
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r2)
            goto L4d
        L3c:
            java.util.Map<android.view.View, java.lang.Integer> r2 = r4.childImportantForAccessibilityMap
            int r3 = r1.getImportantForAccessibility()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r1, r3)
            r2 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r2)
        L4d:
            int r0 = r0 + 1
            goto L1
        L50:
            return
    }

    private void updateNavigationIconIfNeeded() {
            r4 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r4.toolbar
            if (r0 != 0) goto L5
            goto Lb
        L5:
            boolean r0 = r4.isNavigationIconDrawerArrowDrawable(r0)
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            int r0 = r4.getDefaultNavigationIconResource()
            com.google.android.material.search.SearchBar r1 = r4.searchBar
            if (r1 != 0) goto L1a
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            r1.setNavigationIcon(r0)
            return
        L1a:
            android.content.Context r1 = r4.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            java.lang.Integer r1 = r1.getNavigationIconTint()
            if (r1 == 0) goto L3f
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            java.lang.Integer r1 = r1.getNavigationIconTint()
            int r1 = r1.intValue()
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r1)
        L3f:
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            com.google.android.material.internal.FadeThroughDrawable r2 = new com.google.android.material.internal.FadeThroughDrawable
            com.google.android.material.search.SearchBar r3 = r4.searchBar
            android.graphics.drawable.Drawable r3 = r3.getNavigationIcon()
            r2.<init>(r3, r0)
            r1.setNavigationIcon(r2)
            r4.updateNavigationIconProgressIfNeeded()
            return
    }

    private void updateNavigationIconProgressIfNeeded() {
            r4 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r4.toolbar
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r0)
            if (r0 != 0) goto L9
            goto L31
        L9:
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = r4.rootView
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r0)
            boolean r2 = r0 instanceof androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            if (r2 == 0) goto L27
            r2 = r0
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r2 = (androidx.appcompat.graphics.drawable.DrawerArrowDrawable) r2
            float r3 = (float) r1
            r2.setProgress(r3)
        L27:
            boolean r2 = r0 instanceof com.google.android.material.internal.FadeThroughDrawable
            if (r2 == 0) goto L31
            com.google.android.material.internal.FadeThroughDrawable r0 = (com.google.android.material.internal.FadeThroughDrawable) r0
            float r1 = (float) r1
            r0.setProgress(r1)
        L31:
            return
    }

    public void addHeaderView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.headerContainer
            r0.addView(r2)
            android.widget.FrameLayout r2 = r1.headerContainer
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    public void addTransitionListener(@androidx.annotation.NonNull com.google.android.material.search.SearchView.TransitionListener r2) {
            r1 = this;
            java.util.Set<com.google.android.material.search.SearchView$TransitionListener> r0 = r1.transitionListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r1.layoutInflated
            if (r0 == 0) goto La
            com.google.android.material.internal.TouchObserverFrameLayout r0 = r1.contentContainer
            r0.addView(r2, r3, r4)
            return
        La:
            super.addView(r2, r3, r4)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
            r2 = this;
            boolean r0 = r2.isHiddenOrHiding()
            if (r0 != 0) goto L16
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L11
            goto L16
        L11:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.cancelBackProgress()
        L16:
            return
    }

    public void clearFocusAndHideKeyboard() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            com.google.android.material.search.l r1 = new com.google.android.material.search.l
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void clearText() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            java.lang.String r1 = ""
            r0.setText(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    com.google.android.material.motion.MaterialMainContainerBackHelper getBackHelper() {
            r1 = this;
            com.google.android.material.search.SearchViewAnimationHelper r0 = r1.searchViewAnimationHelper
            com.google.android.material.motion.MaterialMainContainerBackHelper r0 = r0.getBackHelper()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.search.SearchView> getBehavior() {
            r1 = this;
            com.google.android.material.search.SearchView$Behavior r0 = new com.google.android.material.search.SearchView$Behavior
            r0.<init>()
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.search.SearchView.TransitionState getCurrentTransitionState() {
            r1 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r1.currentTransitionState
            return r0
    }

    @androidx.annotation.DrawableRes
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.ic_arrow_back_black_24
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.EditText getEditText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getHint() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            java.lang.CharSequence r0 = r0.getHint()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.TextView getSearchPrefix() {
            r1 = this;
            android.widget.TextView r0 = r1.searchPrefix
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getSearchPrefixText() {
            r1 = this;
            android.widget.TextView r0 = r1.searchPrefix
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
            r1 = this;
            int r0 = r1.softInputMode
            return r0
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public android.text.Editable getText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            android.text.Editable r0 = r0.getText()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.Toolbar getToolbar() {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            return r0
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
            r3 = this;
            boolean r0 = r3.isHiddenOrHiding()
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r3.searchViewAnimationHelper
            androidx.activity.BackEventCompat r0 = r0.onHandleBackInvoked()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L1f
            com.google.android.material.search.SearchBar r1 = r3.searchBar
            if (r1 == 0) goto L1f
            if (r0 == 0) goto L1f
            com.google.android.material.search.SearchViewAnimationHelper r0 = r3.searchViewAnimationHelper
            r0.finishBackProgress()
            return
        L1f:
            r3.hide()
            return
    }

    public void hide() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L1a
        L15:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.hide()
        L1a:
            return
    }

    public void inflateMenu(@androidx.annotation.MenuRes int r2) {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            r0.inflateMenu(r2)
            return
    }

    boolean isAdjustNothingSoftInputMode() {
            r2 = this;
            int r0 = r2.softInputMode
            r1 = 48
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isAnimatedNavigationIcon() {
            r1 = this;
            boolean r0 = r1.animatedNavigationIcon
            return r0
    }

    public boolean isAutoShowKeyboard() {
            r1 = this;
            boolean r0 = r1.autoShowKeyboard
            return r0
    }

    public boolean isMenuItemsAnimated() {
            r1 = this;
            boolean r0 = r1.animatedMenuItems
            return r0
    }

    public boolean isSetupWithSearchBar() {
            r1 = this;
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isShowing() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
            r1 = this;
            boolean r0 = r1.useWindowInsetsController
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.updateSoftInputMode()
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchView$SavedState r2 = (com.google.android.material.search.SearchView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r0 = r2.text
            r1.setText(r0)
            int r2 = r2.visibility
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r1.setVisible(r2)
            return
    }

    @Override // android.view.View
    @androidx.annotation.NonNull
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.search.SearchView$SavedState r0 = new com.google.android.material.search.SearchView$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.text.Editable r1 = r2.getText()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            java.lang.String r1 = r1.toString()
        L15:
            r0.text = r1
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = r2.rootView
            int r1 = r1.getVisibility()
            r0.visibility = r1
            return r0
    }

    public void removeAllHeaderViews() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.headerContainer
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r2.headerContainer
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    public void removeHeaderView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.headerContainer
            r0.removeView(r2)
            android.widget.FrameLayout r2 = r1.headerContainer
            int r2 = r2.getChildCount()
            if (r2 != 0) goto L14
            android.widget.FrameLayout r2 = r1.headerContainer
            r0 = 8
            r2.setVisibility(r0)
        L14:
            return
    }

    public void removeTransitionListener(@androidx.annotation.NonNull com.google.android.material.search.SearchView.TransitionListener r2) {
            r1 = this;
            java.util.Set<com.google.android.material.search.SearchView$TransitionListener> r0 = r1.transitionListeners
            r0.remove(r2)
            return
    }

    public void requestFocusAndShowKeyboard() {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            com.google.android.material.search.o r1 = new com.google.android.material.search.o
            r1.<init>(r4)
            r2 = 100
            r0.postDelayed(r1, r2)
            return
    }

    void requestFocusAndShowKeyboardIfNeeded() {
            r1 = this;
            boolean r0 = r1.autoShowKeyboard
            if (r0 == 0) goto L7
            r1.requestFocusAndShowKeyboard()
        L7:
            return
    }

    public void setAnimatedNavigationIcon(boolean r1) {
            r0 = this;
            r0.animatedNavigationIcon = r1
            return
    }

    public void setAutoShowKeyboard(boolean r1) {
            r0 = this;
            r0.autoShowKeyboard = r1
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(21)
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.setUpBackgroundViewElevationOverlay(r1)
            return
    }

    public void setHint(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setHint(r2)
            return
    }

    public void setHint(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setHint(r2)
            return
    }

    public void setMenuItemsAnimated(boolean r1) {
            r0 = this;
            r0.animatedMenuItems = r1
            return
    }

    public void setModalForAccessibility(boolean r4) {
            r3 = this;
            android.view.View r0 = r3.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r4 == 0) goto L13
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.getChildCount()
            r1.<init>(r2)
            r3.childImportantForAccessibilityMap = r1
        L13:
            r3.updateChildImportantForAccessibility(r0, r4)
            if (r4 != 0) goto L1b
            r4 = 0
            r3.childImportantForAccessibilityMap = r4
        L1b:
            return
    }

    public void setOnMenuItemClickListener(@androidx.annotation.Nullable androidx.appcompat.widget.Toolbar.OnMenuItemClickListener r2) {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            r0.setOnMenuItemClickListener(r2)
            return
    }

    public void setSearchPrefixText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.searchPrefix
            r0.setText(r2)
            android.widget.TextView r0 = r1.searchPrefix
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L10
            r2 = 8
            goto L11
        L10:
            r2 = 0
        L11:
            r0.setVisibility(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean r2) {
            r1 = this;
            r0 = 1
            r1.statusBarSpacerEnabledOverride = r0
            r1.setStatusBarSpacerEnabledInternal(r2)
            return
    }

    public void setText(@androidx.annotation.StringRes int r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setText(r2)
            return
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public void setText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setText(r2)
            return
    }

    public void setToolbarTouchscreenBlocksFocus(boolean r2) {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            r0.setTouchscreenBlocksFocus(r2)
            return
    }

    void setTransitionState(@androidx.annotation.NonNull com.google.android.material.search.SearchView.TransitionState r2) {
            r1 = this;
            r0 = 1
            r1.setTransitionState(r2, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean r1) {
            r0 = this;
            r0.useWindowInsetsController = r1
            return
    }

    public void setVisible(boolean r6) {
            r5 = this;
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r5.rootView
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.material.internal.ClippableRoundedCornerLayout r3 = r5.rootView
            if (r6 == 0) goto L13
            r4 = 0
            goto L15
        L13:
            r4 = 8
        L15:
            r3.setVisibility(r4)
            r5.updateNavigationIconProgressIfNeeded()
            if (r6 == 0) goto L20
            com.google.android.material.search.SearchView$TransitionState r3 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            goto L22
        L20:
            com.google.android.material.search.SearchView$TransitionState r3 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
        L22:
            if (r0 == r6) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            r5.setTransitionState(r3, r1)
            return
    }

    public void setupWithSearchBar(@androidx.annotation.Nullable com.google.android.material.search.SearchBar r3) {
            r2 = this;
            r2.searchBar = r3
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.setSearchBar(r3)
            if (r3 == 0) goto L25
            com.google.android.material.search.r r0 = new com.google.android.material.search.r
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L25
            com.google.android.material.search.s r0 = new com.google.android.material.search.s     // Catch: java.lang.LinkageError -> L25
            r0.<init>(r2)     // Catch: java.lang.LinkageError -> L25
            com.google.android.material.search.i.a(r3, r0)     // Catch: java.lang.LinkageError -> L25
            android.widget.EditText r3 = r2.editText     // Catch: java.lang.LinkageError -> L25
            r0 = 1
            com.google.android.material.search.j.a(r3, r0)     // Catch: java.lang.LinkageError -> L25
        L25:
            r2.updateNavigationIconIfNeeded()
            r2.setUpBackgroundViewElevationOverlay()
            return
    }

    public void show() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L1a
        L15:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.show()
        L1a:
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            boolean r0 = r1.isHiddenOrHiding()
            if (r0 != 0) goto L10
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r1.searchViewAnimationHelper
            r0.startBackProgress(r2)
        L10:
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r3) {
            r2 = this;
            boolean r0 = r2.isHiddenOrHiding()
            if (r0 != 0) goto L16
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L11
            goto L16
        L11:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.updateBackProgress(r3)
        L16:
            return
    }

    public void updateSoftInputMode() {
            r1 = this;
            android.view.Window r0 = r1.getActivityWindow()
            if (r0 == 0) goto Le
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.softInputMode
            r1.softInputMode = r0
        Le:
            return
    }
}

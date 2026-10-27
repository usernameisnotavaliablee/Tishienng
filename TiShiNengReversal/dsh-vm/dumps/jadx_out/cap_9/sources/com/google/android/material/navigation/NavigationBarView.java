package com.google.android.material.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class NavigationBarView extends android.widget.FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;

    @androidx.annotation.NonNull
    private final com.google.android.material.navigation.NavigationBarMenu menu;
    private android.view.MenuInflater menuInflater;

    @androidx.annotation.NonNull
    private final com.google.android.material.navigation.NavigationBarMenuView menuView;

    @androidx.annotation.NonNull
    private final com.google.android.material.navigation.NavigationBarPresenter presenter;
    private com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener reselectedListener;
    private com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener selectedListener;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@androidx.annotation.NonNull android.view.MenuItem r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationBarView.SavedState> CREATOR = null;

        @androidx.annotation.Nullable
        android.os.Bundle menuPresenterState;


        static {
                com.google.android.material.navigation.NavigationBarView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationBarView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationBarView.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Ld
                java.lang.Class r2 = r0.getClass()
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Ld:
                r0.readFromParcel(r1, r2)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuPresenterState = r1
                return
        }

        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.menuPresenterState
                r1.writeBundle(r2)
                return
        }
    }

    public NavigationBarView(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, @androidx.annotation.AttrRes int r12, @androidx.annotation.StyleRes int r13) {
            r9 = this;
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r13)
            r9.<init>(r10, r11, r12)
            com.google.android.material.navigation.NavigationBarPresenter r10 = new com.google.android.material.navigation.NavigationBarPresenter
            r10.<init>()
            r9.presenter = r10
            android.content.Context r0 = r9.getContext()
            int[] r2 = com.google.android.material.R.styleable.NavigationBarView
            int r6 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceInactive
            int r7 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActive
            int[] r5 = new int[]{r6, r7}
            r1 = r11
            r3 = r12
            r4 = r13
            androidx.appcompat.widget.TintTypedArray r11 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.navigation.NavigationBarMenu r12 = new com.google.android.material.navigation.NavigationBarMenu
            java.lang.Class r13 = r9.getClass()
            int r2 = r9.getMaxItemCount()
            r12.<init>(r0, r13, r2)
            r9.menu = r12
            com.google.android.material.navigation.NavigationBarMenuView r13 = r9.createNavigationBarMenuView(r0)
            r9.menuView = r13
            r10.setMenuView(r13)
            r2 = 1
            r10.setId(r2)
            r13.setPresenter(r10)
            r12.addMenuPresenter(r10)
            android.content.Context r5 = r9.getContext()
            r10.initForMenu(r5, r12)
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemIconTint
            boolean r5 = r11.hasValue(r10)
            if (r5 == 0) goto L5c
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r13.setIconTintList(r10)
            goto L66
        L5c:
            r10 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r10 = r13.createDefaultColorStateList(r10)
            r13.setIconTintList(r10)
        L66:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemIconSize
            android.content.res.Resources r5 = r9.getResources()
            int r8 = com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_icon_size
            int r5 = r5.getDimensionPixelSize(r8)
            int r10 = r11.getDimensionPixelSize(r10, r5)
            r9.setItemIconSize(r10)
            boolean r10 = r11.hasValue(r6)
            r5 = 0
            if (r10 == 0) goto L87
            int r10 = r11.getResourceId(r6, r5)
            r9.setItemTextAppearanceInactive(r10)
        L87:
            boolean r10 = r11.hasValue(r7)
            if (r10 == 0) goto L94
            int r10 = r11.getResourceId(r7, r5)
            r9.setItemTextAppearanceActive(r10)
        L94:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled
            boolean r10 = r11.getBoolean(r10, r2)
            r9.setItemTextAppearanceActiveBoldEnabled(r10)
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemTextColor
            boolean r6 = r11.hasValue(r10)
            if (r6 == 0) goto Lac
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r9.setItemTextColor(r10)
        Lac:
            android.graphics.drawable.Drawable r10 = r9.getBackground()
            if (r10 == 0) goto Lba
            android.graphics.drawable.Drawable r10 = r9.getBackground()
            boolean r10 = r10 instanceof android.graphics.drawable.ColorDrawable
            if (r10 == 0) goto Lc9
        Lba:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.builder(r0, r1, r3, r4)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            com.google.android.material.shape.MaterialShapeDrawable r10 = r9.createMaterialShapeDrawableBackground(r0, r10)
            androidx.core.view.ViewCompat.setBackground(r9, r10)
        Lc9:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingTop
            boolean r1 = r11.hasValue(r10)
            if (r1 == 0) goto Ld8
            int r10 = r11.getDimensionPixelSize(r10, r5)
            r9.setItemPaddingTop(r10)
        Ld8:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemPaddingBottom
            boolean r1 = r11.hasValue(r10)
            if (r1 == 0) goto Le7
            int r10 = r11.getDimensionPixelSize(r10, r5)
            r9.setItemPaddingBottom(r10)
        Le7:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_activeIndicatorLabelPadding
            boolean r1 = r11.hasValue(r10)
            if (r1 == 0) goto Lf6
            int r10 = r11.getDimensionPixelSize(r10, r5)
            r9.setActiveIndicatorLabelPadding(r10)
        Lf6:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_elevation
            boolean r1 = r11.hasValue(r10)
            if (r1 == 0) goto L106
            int r10 = r11.getDimensionPixelSize(r10, r5)
            float r10 = (float) r10
            r9.setElevation(r10)
        L106:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_backgroundTint
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r11, r10)
            android.graphics.drawable.Drawable r1 = r9.getBackground()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r1, r10)
            int r10 = com.google.android.material.R.styleable.NavigationBarView_labelVisibilityMode
            r1 = -1
            int r10 = r11.getInteger(r10, r1)
            r9.setLabelVisibilityMode(r10)
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemBackground
            int r10 = r11.getResourceId(r10, r5)
            if (r10 == 0) goto L12d
            r13.setItemBackgroundRes(r10)
            goto L136
        L12d:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemRippleColor
            android.content.res.ColorStateList r10 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r11, r10)
            r9.setItemRippleColor(r10)
        L136:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_itemActiveIndicatorStyle
            int r10 = r11.getResourceId(r10, r5)
            if (r10 == 0) goto L17f
            r9.setItemActiveIndicatorEnabled(r2)
            int[] r1 = com.google.android.material.R.styleable.NavigationBarActiveIndicator
            android.content.res.TypedArray r10 = r0.obtainStyledAttributes(r10, r1)
            int r1 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_width
            int r1 = r10.getDimensionPixelSize(r1, r5)
            r9.setItemActiveIndicatorWidth(r1)
            int r1 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_height
            int r1 = r10.getDimensionPixelSize(r1, r5)
            r9.setItemActiveIndicatorHeight(r1)
            int r1 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_marginHorizontal
            int r1 = r10.getDimensionPixelOffset(r1, r5)
            r9.setItemActiveIndicatorMarginHorizontal(r1)
            int r1 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_android_color
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r10, r1)
            r9.setItemActiveIndicatorColor(r1)
            int r1 = com.google.android.material.R.styleable.NavigationBarActiveIndicator_shapeAppearance
            int r1 = r10.getResourceId(r1, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r0, r1, r5)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r9.setItemActiveIndicatorShapeAppearance(r0)
            r10.recycle()
        L17f:
            int r10 = com.google.android.material.R.styleable.NavigationBarView_menu
            boolean r0 = r11.hasValue(r10)
            if (r0 == 0) goto L18e
            int r10 = r11.getResourceId(r10, r5)
            r9.inflateMenu(r10)
        L18e:
            r11.recycle()
            r9.addView(r13)
            com.google.android.material.navigation.NavigationBarView$1 r10 = new com.google.android.material.navigation.NavigationBarView$1
            r10.<init>(r9)
            r12.setCallback(r10)
            return
    }

    static /* synthetic */ com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener access$000(com.google.android.material.navigation.NavigationBarView r0) {
            com.google.android.material.navigation.NavigationBarView$OnItemReselectedListener r0 = r0.reselectedListener
            return r0
    }

    static /* synthetic */ com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener access$100(com.google.android.material.navigation.NavigationBarView r0) {
            com.google.android.material.navigation.NavigationBarView$OnItemSelectedListener r0 = r0.selectedListener
            return r0
    }

    @androidx.annotation.NonNull
    private com.google.android.material.shape.MaterialShapeDrawable createMaterialShapeDrawableBackground(android.content.Context r4, com.google.android.material.shape.ShapeAppearanceModel r5) {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L1a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
        L1a:
            r0.initializeElevationOverlay(r4)
            r0.setShapeAppearanceModel(r5)
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.menuInflater
            if (r0 != 0) goto Lf
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.menuInflater = r0
        Lf:
            android.view.MenuInflater r0 = r2.menuInflater
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(@androidx.annotation.NonNull android.content.Context r1);

    @androidx.annotation.Px
    public int getActiveIndicatorLabelPadding() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getActiveIndicatorLabelPadding()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.badge.BadgeDrawable getBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getBadge(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemActiveIndicatorColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemActiveIndicatorColor()
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorHeight() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorHeight()
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorMarginHorizontal() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorMarginHorizontal()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.shape.ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getItemActiveIndicatorShapeAppearance()
            return r0
    }

    @androidx.annotation.Px
    public int getItemActiveIndicatorWidth() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemActiveIndicatorWidth()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @androidx.annotation.DrawableRes
    @java.lang.Deprecated
    public int getItemBackgroundResource() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemBackgroundRes()
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemIconSize() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemIconSize()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @androidx.annotation.Px
    public int getItemPaddingBottom() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemPaddingBottom()
            return r0
    }

    @androidx.annotation.Px
    public int getItemPaddingTop() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemPaddingTop()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemRippleColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemRippleColor()
            return r0
    }

    @androidx.annotation.StyleRes
    public int getItemTextAppearanceActive() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceActive()
            return r0
    }

    @androidx.annotation.StyleRes
    public int getItemTextAppearanceInactive() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceInactive()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            return r0
    }

    public abstract int getMaxItemCount();

    @androidx.annotation.NonNull
    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenu r0 = r1.menu
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.appcompat.view.menu.MenuView getMenuView() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getOrCreateBadge(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.material.navigation.NavigationBarPresenter getPresenter() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarPresenter r0 = r1.presenter
            return r0
    }

    @androidx.annotation.IdRes
    public int getSelectedItemId() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getSelectedItemId()
            return r0
    }

    public void inflateMenu(int r4) {
            r3 = this;
            com.google.android.material.navigation.NavigationBarPresenter r0 = r3.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r3.getMenuInflater()
            com.google.android.material.navigation.NavigationBarMenu r2 = r3.menu
            r0.inflate(r4, r2)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r3.presenter
            r0 = 0
            r4.setUpdateSuspended(r0)
            com.google.android.material.navigation.NavigationBarPresenter r4 = r3.presenter
            r4.updateMenuView(r1)
            return
    }

    public boolean isItemActiveIndicatorEnabled() {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            boolean r0 = r0.getItemActiveIndicatorEnabled()
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
    protected void onRestoreInstanceState(@androidx.annotation.Nullable android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationBarView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationBarView$SavedState r2 = (com.google.android.material.navigation.NavigationBarView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.navigation.NavigationBarMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuPresenterState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    @androidx.annotation.NonNull
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationBarView$SavedState r1 = new com.google.android.material.navigation.NavigationBarView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuPresenterState = r0
            com.google.android.material.navigation.NavigationBarMenu r2 = r3.menu
            r2.savePresenterStates(r0)
            return r1
    }

    public void removeBadge(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.removeBadge(r2)
            return
    }

    public void setActiveIndicatorLabelPadding(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setActiveIndicatorLabelPadding(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setItemActiveIndicatorColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorColor(r2)
            return
    }

    public void setItemActiveIndicatorEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorEnabled(r2)
            return
    }

    public void setItemActiveIndicatorHeight(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorHeight(r2)
            return
    }

    public void setItemActiveIndicatorMarginHorizontal(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorMarginHorizontal(r2)
            return
    }

    public void setItemActiveIndicatorShapeAppearance(@androidx.annotation.Nullable com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorShapeAppearance(r2)
            return
    }

    public void setItemActiveIndicatorWidth(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemActiveIndicatorWidth(r2)
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemBackgroundRes(r2)
            return
    }

    public void setItemIconSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconSizeRes(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setIconTintList(r2)
            return
    }

    public void setItemOnTouchListener(int r2, @androidx.annotation.Nullable android.view.View.OnTouchListener r3) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemOnTouchListener(r2, r3)
            return
    }

    public void setItemPaddingBottom(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemPaddingBottom(r2)
            return
    }

    public void setItemPaddingTop(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemPaddingTop(r2)
            return
    }

    public void setItemRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemRippleColor(r2)
            return
    }

    public void setItemTextAppearanceActive(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceActive(r2)
            return
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceActiveBoldEnabled(r2)
            return
    }

    public void setItemTextAppearanceInactive(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextAppearanceInactive(r2)
            return
    }

    public void setItemTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setItemTextColor(r2)
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            if (r0 == r2) goto L13
            com.google.android.material.navigation.NavigationBarMenuView r0 = r1.menuView
            r0.setLabelVisibilityMode(r2)
            com.google.android.material.navigation.NavigationBarPresenter r2 = r1.presenter
            r0 = 0
            r2.updateMenuView(r0)
        L13:
            return
    }

    public void setOnItemReselectedListener(@androidx.annotation.Nullable com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener r1) {
            r0 = this;
            r0.reselectedListener = r1
            return
    }

    public void setOnItemSelectedListener(@androidx.annotation.Nullable com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener r1) {
            r0 = this;
            r0.selectedListener = r1
            return
    }

    public void setSelectedItemId(@androidx.annotation.IdRes int r4) {
            r3 = this;
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            android.view.MenuItem r4 = r0.findItem(r4)
            if (r4 == 0) goto L17
            com.google.android.material.navigation.NavigationBarMenu r0 = r3.menu
            com.google.android.material.navigation.NavigationBarPresenter r1 = r3.presenter
            r2 = 0
            boolean r0 = r0.performItemAction(r4, r1, r2)
            if (r0 != 0) goto L17
            r0 = 1
            r4.setChecked(r0)
        L17:
            return
    }
}

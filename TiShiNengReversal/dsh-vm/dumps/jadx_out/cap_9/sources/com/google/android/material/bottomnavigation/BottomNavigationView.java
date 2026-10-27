package com.google.android.material.bottomnavigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BottomNavigationView extends com.google.android.material.navigation.NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface OnNavigationItemReselectedListener extends com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public interface OnNavigationItemSelectedListener extends com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.bottomNavigationStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.R.style.Widget_Design_BottomNavigationView
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r6.<init>(r7, r8, r9, r10)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.BottomNavigationView
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            r4 = r10
            androidx.appcompat.widget.TintTypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled
            r10 = 1
            boolean r9 = r8.getBoolean(r9, r10)
            r6.setItemHorizontalTranslationEnabled(r9)
            int r9 = com.google.android.material.R.styleable.BottomNavigationView_android_minHeight
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L2c
            int r7 = r8.getDimensionPixelSize(r9, r7)
            r6.setMinimumHeight(r7)
        L2c:
            int r7 = com.google.android.material.R.styleable.BottomNavigationView_compatShadowEnabled
            boolean r7 = r8.getBoolean(r7, r10)
            if (r7 == 0) goto L3d
            boolean r7 = r6.shouldDrawCompatibilityTopDivider()
            if (r7 == 0) goto L3d
            r6.addCompatibilityTopDivider(r0)
        L3d:
            r8.recycle()
            r6.applyWindowInsets()
            return
    }

    private void addCompatibilityTopDivider(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            int r1 = com.google.android.material.R.color.design_bottom_navigation_shadow_color
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setBackgroundColor(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.google.android.material.R.dimen.design_bottom_navigation_shadow_height
            int r1 = r1.getDimensionPixelSize(r2)
            r2 = -1
            r4.<init>(r2, r1)
            r0.setLayoutParams(r4)
            r3.addView(r0)
            return
    }

    private void applyWindowInsets() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationView$1 r0 = new com.google.android.material.bottomnavigation.BottomNavigationView$1
            r0.<init>(r1)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r1, r0)
            return
    }

    private int makeMinHeightSpec(int r5) {
            r4 = this;
            int r0 = r4.getSuggestedMinimumHeight()
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r0 <= 0) goto L24
            int r1 = r4.getPaddingTop()
            int r3 = r4.getPaddingBottom()
            int r1 = r1 + r3
            int r0 = r0 + r1
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
        L24:
            return r5
    }

    private boolean shouldDrawCompatibilityTopDivider() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = new com.google.android.material.bottomnavigation.BottomNavigationMenuView
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
            r1 = this;
            r0 = 5
            return r0
    }

    public boolean isItemHorizontalTranslationEnabled() {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.getMenuView()
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r0
            boolean r0 = r0.isItemHorizontalTranslationEnabled()
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            int r2 = r0.makeMinHeightSpec(r2)
            super.onMeasure(r1, r2)
            return
    }

    public void setItemHorizontalTranslationEnabled(boolean r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuView r0 = r2.getMenuView()
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r0
            boolean r1 = r0.isItemHorizontalTranslationEnabled()
            if (r1 == r3) goto L17
            r0.setItemHorizontalTranslationEnabled(r3)
            com.google.android.material.navigation.NavigationBarPresenter r3 = r2.getPresenter()
            r0 = 0
            r3.updateMenuView(r0)
        L17:
            return
    }

    @java.lang.Deprecated
    public void setOnNavigationItemReselectedListener(@androidx.annotation.Nullable com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener r1) {
            r0 = this;
            r0.setOnItemReselectedListener(r1)
            return
    }

    @java.lang.Deprecated
    public void setOnNavigationItemSelectedListener(@androidx.annotation.Nullable com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.setOnItemSelectedListener(r1)
            return
    }
}

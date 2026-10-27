package com.google.android.material.navigationrail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class NavigationRailItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public NavigationRailItemView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.DimenRes
    protected int getItemDefaultMarginResId() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.mtrl_navigation_rail_icon_margin
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.LayoutRes
    protected int getItemLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.mtrl_navigation_rail_item
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            int r1 = android.view.View.MeasureSpec.getMode(r2)
            if (r1 != 0) goto L1c
            int r1 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r0.getMeasuredHeight()
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r0.getMeasuredWidthAndState()
            r0.setMeasuredDimension(r2, r1)
        L1c:
            return
    }
}

package com.google.android.material.bottomnavigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BottomNavigationItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public BottomNavigationItemView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.DimenRes
    protected int getItemDefaultMarginResId() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_margin
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @androidx.annotation.LayoutRes
    protected int getItemLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.design_bottom_navigation_item
            return r0
    }
}

package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CollapsingToolbarOnDestinationChangedListener extends androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener {
    private final java.lang.ref.WeakReference<com.google.android.material.appbar.CollapsingToolbarLayout> mCollapsingToolbarLayoutWeakReference;
    private final java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> mToolbarWeakReference;

    CollapsingToolbarOnDestinationChangedListener(@androidx.annotation.NonNull com.google.android.material.appbar.CollapsingToolbarLayout r2, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r3, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r4) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r1.mCollapsingToolbarLayoutWeakReference = r4
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.mToolbarWeakReference = r2
            return
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(@androidx.annotation.NonNull androidx.navigation.NavController r3, @androidx.annotation.NonNull androidx.navigation.NavDestination r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r2 = this;
            java.lang.ref.WeakReference<com.google.android.material.appbar.CollapsingToolbarLayout> r0 = r2.mCollapsingToolbarLayoutWeakReference
            java.lang.Object r0 = r0.get()
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = (com.google.android.material.appbar.CollapsingToolbarLayout) r0
            java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> r1 = r2.mToolbarWeakReference
            java.lang.Object r1 = r1.get()
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r0 == 0) goto L19
            if (r1 != 0) goto L15
            goto L19
        L15:
            super.onDestinationChanged(r3, r4, r5)
            return
        L19:
            r3.removeOnDestinationChangedListener(r2)
            return
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(android.graphics.drawable.Drawable r3, @androidx.annotation.StringRes int r4) {
            r2 = this;
            java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> r0 = r2.mToolbarWeakReference
            java.lang.Object r0 = r0.get()
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            if (r0 == 0) goto L20
            if (r3 != 0) goto L14
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r0.setNavigationIcon(r3)
            r0.setNavigationContentDescription(r4)
            if (r1 == 0) goto L20
            androidx.transition.TransitionManager.beginDelayedTransition(r0)
        L20:
            return
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.google.android.material.appbar.CollapsingToolbarLayout> r0 = r1.mCollapsingToolbarLayoutWeakReference
            java.lang.Object r0 = r0.get()
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = (com.google.android.material.appbar.CollapsingToolbarLayout) r0
            if (r0 == 0) goto Ld
            r0.setTitle(r2)
        Ld:
            return
    }
}

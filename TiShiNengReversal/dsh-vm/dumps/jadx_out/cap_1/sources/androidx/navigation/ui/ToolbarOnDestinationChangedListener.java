package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ToolbarOnDestinationChangedListener extends androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener {
    private final java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> mToolbarWeakReference;

    ToolbarOnDestinationChangedListener(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r2, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r3) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0, r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.mToolbarWeakReference = r3
            return
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(@androidx.annotation.NonNull androidx.navigation.NavController r2, @androidx.annotation.NonNull androidx.navigation.NavDestination r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> r0 = r1.mToolbarWeakReference
            java.lang.Object r0 = r0.get()
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            if (r0 != 0) goto Le
            r2.removeOnDestinationChangedListener(r1)
            return
        Le:
            super.onDestinationChanged(r2, r3, r4)
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
            java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> r0 = r1.mToolbarWeakReference
            java.lang.Object r0 = r0.get()
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.setTitle(r2)
            return
    }
}

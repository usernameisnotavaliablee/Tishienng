package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ActionBarOnDestinationChangedListener extends androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener {
    private final androidx.appcompat.app.AppCompatActivity mActivity;

    ActionBarOnDestinationChangedListener(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatActivity r2, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r3) {
            r1 = this;
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r2.getDrawerToggleDelegate()
            android.content.Context r0 = r0.getActionBarThemedContext()
            r1.<init>(r0, r3)
            r1.mActivity = r2
            return
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(android.graphics.drawable.Drawable r3, @androidx.annotation.StringRes int r4) {
            r2 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r2.mActivity
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            if (r3 != 0) goto Ld
            r3 = 0
            r0.setDisplayHomeAsUpEnabled(r3)
            return
        Ld:
            r1 = 1
            r0.setDisplayHomeAsUpEnabled(r1)
            androidx.appcompat.app.AppCompatActivity r0 = r2.mActivity
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r0.getDrawerToggleDelegate()
            r0.setActionBarUpIndicator(r3, r4)
            return
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.mActivity
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            r0.setTitle(r2)
            return
    }
}

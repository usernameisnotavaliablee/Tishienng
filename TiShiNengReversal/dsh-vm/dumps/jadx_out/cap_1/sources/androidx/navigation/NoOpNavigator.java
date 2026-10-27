package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.Navigator.Name("NoOp")
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NoOpNavigator extends androidx.navigation.Navigator<androidx.navigation.NavDestination> {
    public NoOpNavigator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    public androidx.navigation.NavDestination createDestination() {
            r1 = this;
            androidx.navigation.NavDestination r0 = new androidx.navigation.NavDestination
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull androidx.navigation.NavDestination r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r4) {
            r0 = this;
            return r1
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
            r1 = this;
            r0 = 1
            return r0
    }
}

package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.navigation.Navigator.Name("navigation")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NavGraphNavigator extends androidx.navigation.Navigator<androidx.navigation.NavGraph> {
    private final androidx.navigation.NavigatorProvider mNavigatorProvider;

    public NavGraphNavigator(@androidx.annotation.NonNull androidx.navigation.NavigatorProvider r1) {
            r0 = this;
            r0.<init>()
            r0.mNavigatorProvider = r1
            return
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.navigation.NavGraph createDestination() {
            r1 = this;
            androidx.navigation.NavGraph r0 = r1.createDestination2()
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.NonNull
    /* renamed from: createDestination, reason: avoid collision after fix types in other method */
    public androidx.navigation.NavGraph createDestination2() {
            r1 = this;
            androidx.navigation.NavGraph r0 = new androidx.navigation.NavGraph
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.Navigator
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ androidx.navigation.NavDestination navigate(@androidx.annotation.NonNull androidx.navigation.NavGraph r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.Nullable androidx.navigation.NavOptions r3, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r4) {
            r0 = this;
            androidx.navigation.NavGraph r1 = (androidx.navigation.NavGraph) r1
            androidx.navigation.NavDestination r1 = r0.navigate2(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    /* renamed from: navigate, reason: avoid collision after fix types in other method */
    public androidx.navigation.NavDestination navigate2(@androidx.annotation.NonNull androidx.navigation.NavGraph r3, @androidx.annotation.Nullable android.os.Bundle r4, @androidx.annotation.Nullable androidx.navigation.NavOptions r5, @androidx.annotation.Nullable androidx.navigation.Navigator.Extras r6) {
            r2 = this;
            int r0 = r3.getStartDestination()
            if (r0 == 0) goto L40
            r1 = 0
            androidx.navigation.NavDestination r0 = r3.findNode(r0, r1)
            if (r0 == 0) goto L20
            androidx.navigation.NavigatorProvider r3 = r2.mNavigatorProvider
            java.lang.String r1 = r0.getNavigatorName()
            androidx.navigation.Navigator r3 = r3.getNavigator(r1)
            android.os.Bundle r4 = r0.addInDefaultArgs(r4)
            androidx.navigation.NavDestination r3 = r3.navigate(r0, r4, r5, r6)
            return r3
        L20:
            java.lang.String r3 = r3.getStartDestDisplayName()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "navigation destination "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " is not a direct child of this NavGraph"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L40:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "no start destination defined via app:startDestination for "
            r5.append(r6)
            java.lang.String r3 = r3.getDisplayName()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
            r1 = this;
            r0 = 1
            return r0
    }
}

package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavigationUI {







    private NavigationUI() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.material.bottomsheet.BottomSheetBehavior findBottomSheetBehavior(@androidx.annotation.NonNull android.view.View r3) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            r2 = 0
            if (r1 != 0) goto L19
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L18
            android.view.View r3 = (android.view.View) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = findBottomSheetBehavior(r3)
            return r3
        L18:
            return r2
        L19:
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r0.getBehavior()
            boolean r0 = r3 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 != 0) goto L24
            return r2
        L24:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            return r3
    }

    static androidx.navigation.NavDestination findStartDestination(@androidx.annotation.NonNull androidx.navigation.NavGraph r1) {
        L0:
            boolean r0 = r1 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto Lf
            androidx.navigation.NavGraph r1 = (androidx.navigation.NavGraph) r1
            int r0 = r1.getStartDestination()
            androidx.navigation.NavDestination r1 = r1.findNode(r0)
            goto L0
        Lf:
            return r1
    }

    static boolean matchDestination(@androidx.annotation.NonNull androidx.navigation.NavDestination r1, @androidx.annotation.IdRes int r2) {
        L0:
            int r0 = r1.getId()
            if (r0 == r2) goto L11
            androidx.navigation.NavGraph r0 = r1.getParent()
            if (r0 == 0) goto L11
            androidx.navigation.NavGraph r1 = r1.getParent()
            goto L0
        L11:
            int r1 = r1.getId()
            if (r1 != r2) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    static boolean matchDestinations(@androidx.annotation.NonNull androidx.navigation.NavDestination r1, @androidx.annotation.NonNull java.util.Set<java.lang.Integer> r2) {
        L0:
            int r0 = r1.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L10
            r1 = 1
            return r1
        L10:
            androidx.navigation.NavGraph r1 = r1.getParent()
            if (r1 != 0) goto L0
            r1 = 0
            return r1
    }

    public static boolean navigateUp(@androidx.annotation.NonNull androidx.navigation.NavController r2, @androidx.annotation.Nullable androidx.customview.widget.Openable r3) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r2.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = r0.setOpenableLayout(r3)
            androidx.navigation.ui.AppBarConfiguration r3 = r3.build()
            boolean r2 = navigateUp(r2, r3)
            return r2
    }

    public static boolean navigateUp(@androidx.annotation.NonNull androidx.navigation.NavController r4, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r5) {
            androidx.customview.widget.Openable r0 = r5.getOpenableLayout()
            androidx.navigation.NavDestination r1 = r4.getCurrentDestination()
            java.util.Set r2 = r5.getTopLevelDestinations()
            r3 = 1
            if (r0 == 0) goto L1b
            if (r1 == 0) goto L1b
            boolean r1 = matchDestinations(r1, r2)
            if (r1 == 0) goto L1b
            r0.open()
            return r3
        L1b:
            boolean r4 = r4.navigateUp()
            if (r4 == 0) goto L22
            return r3
        L22:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r4 = r5.getFallbackOnNavigateUpListener()
            if (r4 == 0) goto L31
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r4 = r5.getFallbackOnNavigateUpListener()
            boolean r4 = r4.onNavigateUp()
            return r4
        L31:
            r4 = 0
            return r4
    }

    public static boolean onNavDestinationSelected(@androidx.annotation.NonNull android.view.MenuItem r4, @androidx.annotation.NonNull androidx.navigation.NavController r5) {
            androidx.navigation.NavOptions$Builder r0 = new androidx.navigation.NavOptions$Builder
            r0.<init>()
            r1 = 1
            androidx.navigation.NavOptions$Builder r0 = r0.setLaunchSingleTop(r1)
            androidx.navigation.NavDestination r2 = r5.getCurrentDestination()
            androidx.navigation.NavGraph r2 = r2.getParent()
            int r3 = r4.getItemId()
            androidx.navigation.NavDestination r2 = r2.findNode(r3)
            boolean r2 = r2 instanceof androidx.navigation.ActivityNavigator.Destination
            if (r2 == 0) goto L36
            int r2 = androidx.navigation.ui.R.anim.nav_default_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r0.setEnterAnim(r2)
            int r3 = androidx.navigation.ui.R.anim.nav_default_exit_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setExitAnim(r3)
            int r3 = androidx.navigation.ui.R.anim.nav_default_pop_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setPopEnterAnim(r3)
            int r3 = androidx.navigation.ui.R.anim.nav_default_pop_exit_anim
            r2.setPopExitAnim(r3)
            goto L4d
        L36:
            int r2 = androidx.navigation.ui.R.animator.nav_default_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r0.setEnterAnim(r2)
            int r3 = androidx.navigation.ui.R.animator.nav_default_exit_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setExitAnim(r3)
            int r3 = androidx.navigation.ui.R.animator.nav_default_pop_enter_anim
            androidx.navigation.NavOptions$Builder r2 = r2.setPopEnterAnim(r3)
            int r3 = androidx.navigation.ui.R.animator.nav_default_pop_exit_anim
            r2.setPopExitAnim(r3)
        L4d:
            int r2 = r4.getOrder()
            r3 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r3
            r3 = 0
            if (r2 != 0) goto L66
            androidx.navigation.NavGraph r2 = r5.getGraph()
            androidx.navigation.NavDestination r2 = findStartDestination(r2)
            int r2 = r2.getId()
            r0.setPopUpTo(r2, r3)
        L66:
            androidx.navigation.NavOptions r0 = r0.build()
            int r4 = r4.getItemId()     // Catch: java.lang.IllegalArgumentException -> L73
            r2 = 0
            r5.navigate(r4, r2, r0)     // Catch: java.lang.IllegalArgumentException -> L73
            return r1
        L73:
            return r3
    }

    public static void setupActionBarWithNavController(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatActivity r2, @androidx.annotation.NonNull androidx.navigation.NavController r3) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r3.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration r0 = r0.build()
            setupActionBarWithNavController(r2, r3, r0)
            return
    }

    public static void setupActionBarWithNavController(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatActivity r2, @androidx.annotation.NonNull androidx.navigation.NavController r3, @androidx.annotation.Nullable androidx.customview.widget.Openable r4) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r3.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r0.setOpenableLayout(r4)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            setupActionBarWithNavController(r2, r3, r4)
            return
    }

    public static void setupActionBarWithNavController(@androidx.annotation.NonNull androidx.appcompat.app.AppCompatActivity r1, @androidx.annotation.NonNull androidx.navigation.NavController r2, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r3) {
            androidx.navigation.ui.ActionBarOnDestinationChangedListener r0 = new androidx.navigation.ui.ActionBarOnDestinationChangedListener
            r0.<init>(r1, r3)
            r2.addOnDestinationChangedListener(r0)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r2, @androidx.annotation.NonNull androidx.navigation.NavController r3) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r3.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration r0 = r0.build()
            setupWithNavController(r2, r3, r0)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r2, @androidx.annotation.NonNull androidx.navigation.NavController r3, @androidx.annotation.Nullable androidx.customview.widget.Openable r4) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r3.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r0.setOpenableLayout(r4)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            setupWithNavController(r2, r3, r4)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r1, @androidx.annotation.NonNull androidx.navigation.NavController r2, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r3) {
            androidx.navigation.ui.ToolbarOnDestinationChangedListener r0 = new androidx.navigation.ui.ToolbarOnDestinationChangedListener
            r0.<init>(r1, r3)
            r2.addOnDestinationChangedListener(r0)
            androidx.navigation.ui.NavigationUI$1 r0 = new androidx.navigation.ui.NavigationUI$1
            r0.<init>(r2, r3)
            r1.setNavigationOnClickListener(r0)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull com.google.android.material.appbar.CollapsingToolbarLayout r2, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r3, @androidx.annotation.NonNull androidx.navigation.NavController r4) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r4.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration r0 = r0.build()
            setupWithNavController(r2, r3, r4, r0)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull com.google.android.material.appbar.CollapsingToolbarLayout r2, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r3, @androidx.annotation.NonNull androidx.navigation.NavController r4, @androidx.annotation.Nullable androidx.customview.widget.Openable r5) {
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            androidx.navigation.NavGraph r1 = r4.getGraph()
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r5 = r0.setOpenableLayout(r5)
            androidx.navigation.ui.AppBarConfiguration r5 = r5.build()
            setupWithNavController(r2, r3, r4, r5)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull com.google.android.material.appbar.CollapsingToolbarLayout r1, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar r2, @androidx.annotation.NonNull androidx.navigation.NavController r3, @androidx.annotation.NonNull androidx.navigation.ui.AppBarConfiguration r4) {
            androidx.navigation.ui.CollapsingToolbarOnDestinationChangedListener r0 = new androidx.navigation.ui.CollapsingToolbarOnDestinationChangedListener
            r0.<init>(r1, r2, r4)
            r3.addOnDestinationChangedListener(r0)
            androidx.navigation.ui.NavigationUI$2 r1 = new androidx.navigation.ui.NavigationUI$2
            r1.<init>(r3, r4)
            r2.setNavigationOnClickListener(r1)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull com.google.android.material.bottomnavigation.BottomNavigationView r1, @androidx.annotation.NonNull androidx.navigation.NavController r2) {
            androidx.navigation.ui.NavigationUI$5 r0 = new androidx.navigation.ui.NavigationUI$5
            r0.<init>(r2)
            r1.setOnNavigationItemSelectedListener(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            androidx.navigation.ui.NavigationUI$6 r1 = new androidx.navigation.ui.NavigationUI$6
            r1.<init>(r0, r2)
            r2.addOnDestinationChangedListener(r1)
            return
    }

    public static void setupWithNavController(@androidx.annotation.NonNull com.google.android.material.navigation.NavigationView r1, @androidx.annotation.NonNull androidx.navigation.NavController r2) {
            androidx.navigation.ui.NavigationUI$3 r0 = new androidx.navigation.ui.NavigationUI$3
            r0.<init>(r2, r1)
            r1.setNavigationItemSelectedListener(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            androidx.navigation.ui.NavigationUI$4 r1 = new androidx.navigation.ui.NavigationUI$4
            r1.<init>(r0, r2)
            r2.addOnDestinationChangedListener(r1)
            return
    }
}

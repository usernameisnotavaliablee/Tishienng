package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CollapsingToolbarLayoutKt {
    public static final void setupWithNavController(@org.jetbrains.annotations.NotNull com.google.android.material.appbar.CollapsingToolbarLayout r3, @org.jetbrains.annotations.NotNull androidx.appcompat.widget.Toolbar r4, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r5, @org.jetbrains.annotations.Nullable androidx.drawerlayout.widget.DrawerLayout r6) {
            java.lang.String r0 = "$this$setupWithNavController"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.g0.q(r4, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.g0.q(r5, r0)
            androidx.navigation.NavGraph r0 = r5.getGraph()
            java.lang.String r1 = "navController.graph"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>(r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r6 = r2.setOpenableLayout(r6)
            if (r1 == 0) goto L2b
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L2b:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r6 = r6.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r6 = r6.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r6, r0)
            androidx.navigation.ui.NavigationUI.setupWithNavController(r3, r4, r5, r6)
            return
    }

    public static final void setupWithNavController(@org.jetbrains.annotations.NotNull com.google.android.material.appbar.CollapsingToolbarLayout r1, @org.jetbrains.annotations.NotNull androidx.appcompat.widget.Toolbar r2, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r3, @org.jetbrains.annotations.NotNull androidx.navigation.ui.AppBarConfiguration r4) {
            java.lang.String r0 = "$this$setupWithNavController"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.q(r4, r0)
            androidx.navigation.ui.NavigationUI.setupWithNavController(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void setupWithNavController$default(com.google.android.material.appbar.CollapsingToolbarLayout r0, androidx.appcompat.widget.Toolbar r1, androidx.navigation.NavController r2, androidx.navigation.ui.AppBarConfiguration r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L30
            androidx.navigation.NavGraph r3 = r2.getGraph()
            java.lang.String r4 = "navController.graph"
            kotlin.jvm.internal.g0.h(r3, r4)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r4 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r5 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r5.<init>(r3)
            r3 = 0
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = r5.setOpenableLayout(r3)
            if (r4 == 0) goto L21
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r5 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r5.<init>(r4)
            r4 = r5
        L21:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r4 = (androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener) r4
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = r3.setFallbackOnNavigateUpListener(r4)
            androidx.navigation.ui.AppBarConfiguration r3 = r3.build()
            java.lang.String r4 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r3, r4)
        L30:
            setupWithNavController(r0, r1, r2, r3)
            return
    }
}

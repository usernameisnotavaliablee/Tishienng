package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ToolbarKt {
    public static final void setupWithNavController(@org.jetbrains.annotations.NotNull androidx.appcompat.widget.Toolbar r3, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r4, @org.jetbrains.annotations.Nullable androidx.drawerlayout.widget.DrawerLayout r5) {
            java.lang.String r0 = "$this$setupWithNavController"
            kotlin.jvm.internal.g0.q(r3, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.g0.q(r4, r0)
            androidx.navigation.NavGraph r0 = r4.getGraph()
            java.lang.String r1 = "navController.graph"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>(r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r5 = r2.setOpenableLayout(r5)
            if (r1 == 0) goto L26
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L26:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r5 = r5.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r5 = r5.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r5, r0)
            androidx.navigation.ui.NavigationUI.setupWithNavController(r3, r4, r5)
            return
    }

    public static final void setupWithNavController(@org.jetbrains.annotations.NotNull androidx.appcompat.widget.Toolbar r1, @org.jetbrains.annotations.NotNull androidx.navigation.NavController r2, @org.jetbrains.annotations.NotNull androidx.navigation.ui.AppBarConfiguration r3) {
            java.lang.String r0 = "$this$setupWithNavController"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.g0.q(r2, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.ui.NavigationUI.setupWithNavController(r1, r2, r3)
            return
    }

    public static /* synthetic */ void setupWithNavController$default(androidx.appcompat.widget.Toolbar r0, androidx.navigation.NavController r1, androidx.navigation.ui.AppBarConfiguration r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L30
            androidx.navigation.NavGraph r2 = r1.getGraph()
            java.lang.String r3 = "navController.graph"
            kotlin.jvm.internal.g0.h(r2, r3)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r3 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r4.<init>(r2)
            r2 = 0
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = r4.setOpenableLayout(r2)
            if (r3 == 0) goto L21
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r4 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r4.<init>(r3)
            r3 = r4
        L21:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r3 = (androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener) r3
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = r2.setFallbackOnNavigateUpListener(r3)
            androidx.navigation.ui.AppBarConfiguration r2 = r2.build()
            java.lang.String r3 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r2, r3)
        L30:
            setupWithNavController(r0, r1, r2)
            return
    }
}

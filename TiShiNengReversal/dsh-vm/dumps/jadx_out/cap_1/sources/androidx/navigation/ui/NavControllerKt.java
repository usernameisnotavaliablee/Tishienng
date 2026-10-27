package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavControllerKt {
    public static final boolean navigateUp(@org.jetbrains.annotations.NotNull androidx.navigation.NavController r3, @org.jetbrains.annotations.Nullable androidx.customview.widget.Openable r4) {
            java.lang.String r0 = "$this$navigateUp"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.NavGraph r0 = r3.getGraph()
            java.lang.String r1 = "graph"
            kotlin.jvm.internal.g0.h(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>(r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r2.setOpenableLayout(r4)
            if (r1 == 0) goto L21
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L21:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r4.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r4, r0)
            boolean r3 = androidx.navigation.ui.NavigationUI.navigateUp(r3, r4)
            return r3
    }

    public static final boolean navigateUp(@org.jetbrains.annotations.NotNull androidx.navigation.NavController r1, @org.jetbrains.annotations.NotNull androidx.navigation.ui.AppBarConfiguration r2) {
            java.lang.String r0 = "$this$navigateUp"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "appBarConfiguration"
            kotlin.jvm.internal.g0.q(r2, r0)
            boolean r1 = androidx.navigation.ui.NavigationUI.navigateUp(r1, r2)
            return r1
    }
}

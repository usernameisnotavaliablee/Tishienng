package androidx.navigation.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AppBarConfigurationKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.ui.AppBarConfiguration AppBarConfiguration(@org.jetbrains.annotations.NotNull android.view.Menu r1, @org.jetbrains.annotations.Nullable androidx.customview.widget.Openable r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r3) {
            java.lang.String r0 = "topLevelMenu"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "fallbackOnNavigateUpListener"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r1 = r0.setOpenableLayout(r2)
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r2 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r2.<init>(r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r1 = r1.setFallbackOnNavigateUpListener(r2)
            androidx.navigation.ui.AppBarConfiguration r1 = r1.build()
            java.lang.String r2 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.ui.AppBarConfiguration AppBarConfiguration(@org.jetbrains.annotations.NotNull androidx.navigation.NavGraph r1, @org.jetbrains.annotations.Nullable androidx.customview.widget.Openable r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r3) {
            java.lang.String r0 = "navGraph"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "fallbackOnNavigateUpListener"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r1 = r0.setOpenableLayout(r2)
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r2 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r2.<init>(r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r1 = r1.setFallbackOnNavigateUpListener(r2)
            androidx.navigation.ui.AppBarConfiguration r1 = r1.build()
            java.lang.String r2 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.ui.AppBarConfiguration AppBarConfiguration(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.Integer> r1, @org.jetbrains.annotations.Nullable androidx.customview.widget.Openable r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r3) {
            java.lang.String r0 = "topLevelDestinationIds"
            kotlin.jvm.internal.g0.q(r1, r0)
            java.lang.String r0 = "fallbackOnNavigateUpListener"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r0.<init>(r1)
            androidx.navigation.ui.AppBarConfiguration$Builder r1 = r0.setOpenableLayout(r2)
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r2 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r2.<init>(r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r1 = r1.setFallbackOnNavigateUpListener(r2)
            androidx.navigation.ui.AppBarConfiguration r1 = r1.build()
            java.lang.String r2 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }

    public static /* synthetic */ androidx.navigation.ui.AppBarConfiguration AppBarConfiguration$default(android.view.Menu r0, androidx.customview.widget.Openable r1, kotlin.jvm.functions.Function0 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 2
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 4
            if (r3 == 0) goto Lb
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$2 r2 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$2.INSTANCE
        Lb:
            java.lang.String r3 = "topLevelMenu"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "fallbackOnNavigateUpListener"
            kotlin.jvm.internal.g0.q(r2, r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r3.<init>(r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = r3.setOpenableLayout(r1)
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r1 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r1.<init>(r2)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = r0.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r0 = r0.build()
            java.lang.String r1 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    public static /* synthetic */ androidx.navigation.ui.AppBarConfiguration AppBarConfiguration$default(androidx.navigation.NavGraph r0, androidx.customview.widget.Openable r1, kotlin.jvm.functions.Function0 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 2
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 4
            if (r3 == 0) goto Lb
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r2 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
        Lb:
            java.lang.String r3 = "navGraph"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "fallbackOnNavigateUpListener"
            kotlin.jvm.internal.g0.q(r2, r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r3.<init>(r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = r3.setOpenableLayout(r1)
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r1 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r1.<init>(r2)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = r0.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r0 = r0.build()
            java.lang.String r1 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }

    public static /* synthetic */ androidx.navigation.ui.AppBarConfiguration AppBarConfiguration$default(java.util.Set r0, androidx.customview.widget.Openable r1, kotlin.jvm.functions.Function0 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 2
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 4
            if (r3 == 0) goto Lb
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$3 r2 = androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$3.INSTANCE
        Lb:
            java.lang.String r3 = "topLevelDestinationIds"
            kotlin.jvm.internal.g0.q(r0, r3)
            java.lang.String r3 = "fallbackOnNavigateUpListener"
            kotlin.jvm.internal.g0.q(r2, r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r3.<init>(r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = r3.setOpenableLayout(r1)
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r1 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r1.<init>(r2)
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = r0.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r0 = r0.build()
            java.lang.String r1 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.g0.h(r0, r1)
            return r0
    }
}

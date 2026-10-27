package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(29)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EdgeToEdgeApi29 implements androidx.activity.EdgeToEdgeImpl {
    public EdgeToEdgeApi29() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    @androidx.annotation.DoNotInline
    public void setUp(@org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r2, @org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r3, @org.jetbrains.annotations.NotNull android.view.Window r4, @org.jetbrains.annotations.NotNull android.view.View r5, boolean r6, boolean r7) {
            r1 = this;
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "navigationBarStyle"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "window"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r4, r0)
            int r2 = r2.getScrimWithEnforcedContrast$activity_release(r6)
            r4.setStatusBarColor(r2)
            int r2 = r3.getScrimWithEnforcedContrast$activity_release(r7)
            r4.setNavigationBarColor(r2)
            androidx.activity.h.a(r4, r0)
            int r2 = r3.getNightMode$activity_release()
            r3 = 1
            if (r2 != 0) goto L33
            r0 = 1
        L33:
            androidx.activity.i.a(r4, r0)
            androidx.core.view.WindowInsetsControllerCompat r2 = new androidx.core.view.WindowInsetsControllerCompat
            r2.<init>(r4, r5)
            r4 = r6 ^ 1
            r2.setAppearanceLightStatusBars(r4)
            r3 = r3 ^ r7
            r2.setAppearanceLightNavigationBars(r3)
            return
    }
}

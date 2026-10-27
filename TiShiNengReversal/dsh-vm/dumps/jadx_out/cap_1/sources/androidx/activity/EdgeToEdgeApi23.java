package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EdgeToEdgeApi23 implements androidx.activity.EdgeToEdgeImpl {
    public EdgeToEdgeApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    @androidx.annotation.DoNotInline
    public void setUp(@org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r1, @org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r2, @org.jetbrains.annotations.NotNull android.view.Window r3, @org.jetbrains.annotations.NotNull android.view.View r4, boolean r5, boolean r6) {
            r0 = this;
            java.lang.String r6 = "statusBarStyle"
            kotlin.jvm.internal.g0.p(r1, r6)
            java.lang.String r6 = "navigationBarStyle"
            kotlin.jvm.internal.g0.p(r2, r6)
            java.lang.String r6 = "window"
            kotlin.jvm.internal.g0.p(r3, r6)
            java.lang.String r6 = "view"
            kotlin.jvm.internal.g0.p(r4, r6)
            r6 = 0
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r3, r6)
            int r1 = r1.getScrim$activity_release(r5)
            r3.setStatusBarColor(r1)
            int r1 = r2.getDarkScrim$activity_release()
            r3.setNavigationBarColor(r1)
            androidx.core.view.WindowInsetsControllerCompat r1 = new androidx.core.view.WindowInsetsControllerCompat
            r1.<init>(r3, r4)
            r2 = r5 ^ 1
            r1.setAppearanceLightStatusBars(r2)
            return
    }
}

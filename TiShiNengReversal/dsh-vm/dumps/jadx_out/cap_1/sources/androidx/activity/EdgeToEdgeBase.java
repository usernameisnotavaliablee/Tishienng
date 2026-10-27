package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class EdgeToEdgeBase implements androidx.activity.EdgeToEdgeImpl {
    public EdgeToEdgeBase() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(@org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r1, @org.jetbrains.annotations.NotNull androidx.activity.SystemBarStyle r2, @org.jetbrains.annotations.NotNull android.view.Window r3, @org.jetbrains.annotations.NotNull android.view.View r4, boolean r5, boolean r6) {
            r0 = this;
            java.lang.String r5 = "statusBarStyle"
            kotlin.jvm.internal.g0.p(r1, r5)
            java.lang.String r1 = "navigationBarStyle"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.String r1 = "window"
            kotlin.jvm.internal.g0.p(r3, r1)
            java.lang.String r1 = "view"
            kotlin.jvm.internal.g0.p(r4, r1)
            return
    }
}

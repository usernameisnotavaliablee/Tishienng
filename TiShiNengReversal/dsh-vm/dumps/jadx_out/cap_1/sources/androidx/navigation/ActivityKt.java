package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.NavController findNavController(@org.jetbrains.annotations.NotNull android.app.Activity r1, @androidx.annotation.IdRes int r2) {
            java.lang.String r0 = "$this$findNavController"
            kotlin.jvm.internal.g0.q(r1, r0)
            androidx.navigation.NavController r1 = androidx.navigation.Navigation.findNavController(r1, r2)
            java.lang.String r2 = "Navigation.findNavController(this, viewId)"
            kotlin.jvm.internal.g0.h(r1, r2)
            return r1
    }
}

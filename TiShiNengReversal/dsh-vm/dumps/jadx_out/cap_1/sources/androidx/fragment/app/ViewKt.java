package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewKt {
    @org.jetbrains.annotations.NotNull
    public static final <F extends androidx.fragment.app.Fragment> F findFragment(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "$this$findFragment"
            kotlin.jvm.internal.g0.q(r1, r0)
            androidx.fragment.app.Fragment r1 = androidx.fragment.app.FragmentManager.findFragment(r1)
            java.lang.String r0 = "FragmentManager.findFragment(this)"
            kotlin.jvm.internal.g0.h(r1, r0)
            return r1
    }
}

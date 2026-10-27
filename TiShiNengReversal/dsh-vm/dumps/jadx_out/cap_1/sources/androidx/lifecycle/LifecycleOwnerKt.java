package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LifecycleOwnerKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleCoroutineScope getLifecycleScope(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleKt.getCoroutineScope(r1)
            return r1
    }
}

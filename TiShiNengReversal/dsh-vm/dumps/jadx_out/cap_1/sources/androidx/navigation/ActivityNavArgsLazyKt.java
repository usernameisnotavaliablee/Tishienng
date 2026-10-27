package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityNavArgsLazyKt {
    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public static final /* synthetic */ <Args extends androidx.navigation.NavArgs> androidx.navigation.NavArgsLazy<Args> navArgs(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
            java.lang.String r0 = "$this$navArgs"
            kotlin.jvm.internal.g0.q(r3, r0)
            androidx.navigation.NavArgsLazy r0 = new androidx.navigation.NavArgsLazy
            r1 = 4
            java.lang.String r2 = "Args"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.navigation.NavArgs> r1 = androidx.navigation.NavArgs.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            androidx.navigation.ActivityNavArgsLazyKt$navArgs$1 r2 = new androidx.navigation.ActivityNavArgsLazyKt$navArgs$1
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }
}

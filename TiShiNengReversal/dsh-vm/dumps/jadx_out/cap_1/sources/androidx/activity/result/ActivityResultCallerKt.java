package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ActivityResultCallerKt {
    public static /* synthetic */ void a(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            registerForActivityResult$lambda$0(r0, r1)
            return
    }

    public static /* synthetic */ void b(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            registerForActivityResult$lambda$1(r0, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <I, O> androidx.activity.result.ActivityResultLauncher<kotlin.n1> registerForActivityResult(@org.jetbrains.annotations.NotNull androidx.activity.result.ActivityResultCaller r1, @org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContract<I, O> r2, I r3, @org.jetbrains.annotations.NotNull androidx.activity.result.ActivityResultRegistry r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super O, kotlin.n1> r5) {
            androidx.activity.result.a r0 = new androidx.activity.result.a
            r0.<init>(r5)
            androidx.activity.result.ActivityResultLauncher r1 = r1.registerForActivityResult(r2, r4, r0)
            androidx.activity.result.ActivityResultCallerLauncher r4 = new androidx.activity.result.ActivityResultCallerLauncher
            r4.<init>(r1, r2, r3)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <I, O> androidx.activity.result.ActivityResultLauncher<kotlin.n1> registerForActivityResult(@org.jetbrains.annotations.NotNull androidx.activity.result.ActivityResultCaller r1, @org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContract<I, O> r2, I r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super O, kotlin.n1> r4) {
            androidx.activity.result.b r0 = new androidx.activity.result.b
            r0.<init>(r4)
            androidx.activity.result.ActivityResultLauncher r1 = r1.registerForActivityResult(r2, r0)
            androidx.activity.result.ActivityResultCallerLauncher r4 = new androidx.activity.result.ActivityResultCallerLauncher
            r4.<init>(r1, r2, r3)
            return r4
    }

    private static final void registerForActivityResult$lambda$0(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }

    private static final void registerForActivityResult$lambda$1(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }
}

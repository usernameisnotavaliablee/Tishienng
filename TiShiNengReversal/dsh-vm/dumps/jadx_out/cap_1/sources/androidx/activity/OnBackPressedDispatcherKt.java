package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OnBackPressedDispatcherKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.OnBackPressedCallback addCallback(@org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedDispatcher r1, @org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleOwner r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.activity.OnBackPressedCallback, kotlin.n1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "onBackPressed"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1 r0 = new androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            r0.<init>(r3, r4)
            if (r2 == 0) goto L15
            r1.addCallback(r2, r0)
            return r0
        L15:
            r1.addCallback(r0)
            return r0
    }

    public static /* synthetic */ androidx.activity.OnBackPressedCallback addCallback$default(androidx.activity.OnBackPressedDispatcher r0, androidx.lifecycle.LifecycleOwner r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r2 = 1
        La:
            androidx.activity.OnBackPressedCallback r0 = addCallback(r0, r1, r2, r3)
            return r0
    }
}

package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RepeatOnLifecycleKt {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object repeatOnLifecycle(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r3 == r0) goto L23
            androidx.lifecycle.Lifecycle$State r0 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Lf
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        Lf:
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 r0 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            java.lang.Object r2 = kotlinx.coroutines.s0.g(r0, r5)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L20
            return r2
        L20:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object repeatOnLifecycle(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r0, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.Object r0 = repeatOnLifecycle(r0, r1, r2, r3)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto Lf
            return r0
        Lf:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }
}

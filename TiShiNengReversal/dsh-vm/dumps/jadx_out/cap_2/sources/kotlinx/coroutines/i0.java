package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,67:1\n61#2,2:68\n61#2,2:70\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n21#1:68,2\n27#1:70,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i0 {
    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.Nullable java.lang.Object r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 == 0) goto L13
            kotlin.Result$a r1 = kotlin.Result.Companion
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r0 = r0.a
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            return r0
        L13:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r4) {
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r3)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto Le
            kotlinx.coroutines.e0 r0 = new kotlinx.coroutines.e0
            r0.<init>(r3, r4)
            return r0
        Le:
            return r3
        Lf:
            kotlinx.coroutines.d0 r3 = new kotlinx.coroutines.d0
            r4 = 2
            r1 = 0
            r2 = 0
            r3.<init>(r0, r2, r4, r1)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<?> r4) {
            java.lang.Throwable r4 = kotlin.Result.m14exceptionOrNullimpl(r3)
            if (r4 != 0) goto L7
            return r3
        L7:
            kotlinx.coroutines.d0 r3 = new kotlinx.coroutines.d0
            r0 = 2
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return r3
    }

    public static /* synthetic */ java.lang.Object d(java.lang.Object r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.Object r0 = b(r0, r1)
            return r0
    }
}

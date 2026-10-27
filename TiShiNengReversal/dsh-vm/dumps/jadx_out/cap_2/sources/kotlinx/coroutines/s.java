package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,386:1\n1#2:387\n19#3:388\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n380#1:388\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s {
    @kotlinx.coroutines.InternalCoroutinesApi
    public static final void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.p<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.j1 r2) {
            kotlinx.coroutines.k1 r0 = new kotlinx.coroutines.k1
            r0.<init>(r2)
            r1.I(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.q<T> b(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.l
            if (r0 != 0) goto Lb
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lb:
            r0 = r2
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            kotlinx.coroutines.q r0 = r0.l()
            if (r0 == 0) goto L20
            boolean r1 = r0.R()
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            r1 = 2
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.p<? super T>, kotlin.n1> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            r3.invoke(r0)
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L1d
            kotlin.coroutines.jvm.internal.e.c(r4)
        L1d:
            return r3
    }

    private static final <T> java.lang.Object d(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.p<? super T>, kotlin.n1> r3, kotlin.coroutines.e<? super T> r4) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            r3.invoke(r0)
            java.lang.Object r3 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r0) goto L21
            kotlin.coroutines.jvm.internal.e.c(r4)
        L21:
            kotlin.jvm.internal.d0.e(r2)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.q<? super T>, kotlin.n1> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r2)
            kotlinx.coroutines.q r0 = b(r0)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r0) goto L18
            kotlin.coroutines.jvm.internal.e.c(r2)
        L18:
            return r1
        L19:
            r1 = move-exception
            r0.N()
            throw r1
    }

    private static final <T> java.lang.Object f(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.q<? super T>, kotlin.n1> r1, kotlin.coroutines.e<? super T> r2) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r2)
            kotlinx.coroutines.q r0 = b(r0)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r0) goto L1c
            kotlin.coroutines.jvm.internal.e.c(r2)
        L1c:
            r2 = 1
            kotlin.jvm.internal.d0.e(r2)
            return r1
        L21:
            r1 = move-exception
            r0.N()
            throw r1
    }
}

package n4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final <T> void a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            kotlin.coroutines.e r0 = kotlin.coroutines.jvm.internal.e.a(r4)
            kotlin.coroutines.i r4 = r4.getContext()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.y0.c(r4, r1)     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            java.lang.Object r3 = kotlin.jvm.internal.u0.q(r3, r2)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.internal.y0.a(r4, r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 == r4) goto L2a
            kotlin.Result$a r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
        L2a:
            return
        L2b:
            r3 = move-exception
            goto L32
        L2d:
            r3 = move-exception
            kotlinx.coroutines.internal.y0.a(r4, r1)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L32:
            kotlin.Result$a r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
            return
    }

    public static final <R, T> void b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r5) {
            kotlin.coroutines.e r0 = kotlin.coroutines.jvm.internal.e.a(r5)
            kotlin.coroutines.i r5 = r5.getContext()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.y0.c(r5, r1)     // Catch: java.lang.Throwable -> L2b
            r2 = 2
            java.lang.Object r3 = kotlin.jvm.internal.u0.q(r3, r2)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.internal.y0.a(r5, r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 == r4) goto L2a
            kotlin.Result$a r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
        L2a:
            return
        L2b:
            r3 = move-exception
            goto L32
        L2d:
            r3 = move-exception
            kotlinx.coroutines.internal.y0.a(r5, r1)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L32:
            kotlin.Result$a r4 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
            return
    }

    public static final <T> void c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            kotlin.coroutines.e r2 = kotlin.coroutines.jvm.internal.e.a(r2)
            r0 = 1
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.invoke(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 == r0) goto L1e
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            r2.resumeWith(r1)
        L1e:
            return
        L1f:
            r1 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.g0.a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            r2.resumeWith(r1)
            return
    }

    private static final <T> void d(kotlin.coroutines.e<? super T> r1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2) {
            kotlin.coroutines.e r1 = kotlin.coroutines.jvm.internal.e.a(r1)
            java.lang.Object r2 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 == r0) goto L17
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
        L17:
            return
        L18:
            r2 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.g0.a(r2)
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, R> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.o0<? super T> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5) {
            r0 = 2
            java.lang.Object r5 = kotlin.jvm.internal.u0.q(r5, r0)     // Catch: java.lang.Throwable -> Lc
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r4 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r4 = move-exception
            kotlinx.coroutines.d0 r5 = new kotlinx.coroutines.d0
            r1 = 0
            r2 = 0
            r5.<init>(r4, r1, r0, r2)
            r4 = r5
        L15:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L20
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            goto L35
        L20:
            java.lang.Object r3 = r3.U0(r4)
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.m2.b
            if (r3 != r4) goto L2d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            goto L35
        L2d:
            boolean r4 = r3 instanceof kotlinx.coroutines.d0
            if (r4 != 0) goto L36
            java.lang.Object r3 = kotlinx.coroutines.m2.h(r3)
        L35:
            return r3
        L36:
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.d0) r3
            java.lang.Throwable r3 = r3.a
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, R> java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.o0<? super T> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5) {
            r0 = 2
            java.lang.Object r5 = kotlin.jvm.internal.u0.q(r5, r0)     // Catch: java.lang.Throwable -> Lc
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r4 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r4 = move-exception
            kotlinx.coroutines.d0 r5 = new kotlinx.coroutines.d0
            r1 = 0
            r2 = 0
            r5.<init>(r4, r1, r0, r2)
            r4 = r5
        L15:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L20
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            goto L50
        L20:
            java.lang.Object r5 = r3.U0(r4)
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.b
            if (r5 != r0) goto L2d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            goto L50
        L2d:
            boolean r0 = r5 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto L4b
            kotlinx.coroutines.d0 r5 = (kotlinx.coroutines.d0) r5
            java.lang.Throwable r5 = r5.a
            boolean r0 = r5 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L4a
            r0 = r5
            kotlinx.coroutines.TimeoutCancellationException r0 = (kotlinx.coroutines.TimeoutCancellationException) r0
            kotlinx.coroutines.e2 r0 = r0.coroutine
            if (r0 != r3) goto L4a
            boolean r3 = r4 instanceof kotlinx.coroutines.d0
            if (r3 != 0) goto L45
            goto L4f
        L45:
            kotlinx.coroutines.d0 r4 = (kotlinx.coroutines.d0) r4
            java.lang.Throwable r3 = r4.a
            throw r3
        L4a:
            throw r5
        L4b:
            java.lang.Object r4 = kotlinx.coroutines.m2.h(r5)
        L4f:
            r3 = r4
        L50:
            return r3
    }

    private static final <T> java.lang.Object g(kotlinx.coroutines.internal.o0<? super T> r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r5, kotlin.jvm.functions.Function0<? extends java.lang.Object> r6) {
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5
            goto Lf
        L5:
            r6 = move-exception
            kotlinx.coroutines.d0 r0 = new kotlinx.coroutines.d0
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r6, r3, r1, r2)
            r6 = r0
        Lf:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r6 != r0) goto L1a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            return r4
        L1a:
            java.lang.Object r4 = r4.U0(r6)
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.m2.b
            if (r4 != r0) goto L27
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            return r4
        L27:
            boolean r0 = r4 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto L48
            kotlinx.coroutines.d0 r4 = (kotlinx.coroutines.d0) r4
            java.lang.Throwable r0 = r4.a
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L45
            boolean r4 = r6 instanceof kotlinx.coroutines.d0
            if (r4 != 0) goto L40
            goto L4c
        L40:
            kotlinx.coroutines.d0 r6 = (kotlinx.coroutines.d0) r6
            java.lang.Throwable r4 = r6.a
            throw r4
        L45:
            java.lang.Throwable r4 = r4.a
            throw r4
        L48:
            java.lang.Object r6 = kotlinx.coroutines.m2.h(r4)
        L4c:
            return r6
    }
}

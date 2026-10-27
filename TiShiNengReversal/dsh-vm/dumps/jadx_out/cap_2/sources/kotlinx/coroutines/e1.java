package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,222:1\n200#1,17:240\n1#2:223\n255#3:224\n256#3,2:235\n258#3:239\n107#4,10:225\n118#4,2:237\n61#5,2:257\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n190#1:240,17\n178#1:224\n178#1:235,2\n178#1:239\n178#1:225,10\n178#1:237,2\n220#1:257,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e1 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = -1;

    public static final <T> void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.d1<? super T> r3, int r4) {
            kotlin.coroutines.e r0 = r3.e()
            r1 = 4
            if (r4 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 != 0) goto L33
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.l
            if (r2 == 0) goto L33
            boolean r4 = c(r4)
            int r2 = r3.c
            boolean r2 = c(r2)
            if (r4 != r2) goto L33
            r4 = r0
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.l) r4
            kotlinx.coroutines.m0 r4 = r4.d
            kotlin.coroutines.i r0 = r0.getContext()
            boolean r1 = r4.isDispatchNeeded(r0)
            if (r1 == 0) goto L2f
            r4.dispatch(r0, r3)
            return
        L2f:
            f(r3)
            return
        L33:
            e(r3, r0, r1)
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void b() {
            return
    }

    public static final boolean c(int r2) {
            r0 = 1
            if (r2 == r0) goto L9
            r1 = 2
            if (r2 != r1) goto L7
            goto L9
        L7:
            r2 = 0
            return r2
        L9:
            return r0
    }

    public static final boolean d(int r1) {
            r0 = 2
            if (r1 != r0) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }

    public static final <T> void e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.d1<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4, boolean r5) {
            java.lang.Object r0 = r3.j()
            java.lang.Throwable r1 = r3.f(r0)
            if (r1 == 0) goto L15
            kotlin.Result$a r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r1)
        L10:
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            goto L1c
        L15:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r3 = r3.g(r0)
            goto L10
        L1c:
            if (r5 == 0) goto L5d
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"
            kotlin.jvm.internal.g0.n(r4, r5)
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.l) r4
            kotlin.coroutines.e<T> r5 = r4.e
            java.lang.Object r0 = r4.g
            kotlin.coroutines.i r1 = r5.getContext()
            java.lang.Object r0 = kotlinx.coroutines.internal.y0.c(r1, r0)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.y0.a
            if (r0 == r2) goto L3a
            kotlinx.coroutines.p3 r5 = kotlinx.coroutines.l0.g(r5, r1, r0)
            goto L3b
        L3a:
            r5 = 0
        L3b:
            kotlin.coroutines.e<T> r4 = r4.e     // Catch: java.lang.Throwable -> L50
            r4.resumeWith(r3)     // Catch: java.lang.Throwable -> L50
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L4c
            boolean r3 = r5.A1()
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            return
        L4c:
            kotlinx.coroutines.internal.y0.a(r1, r0)
            return
        L50:
            r3 = move-exception
            if (r5 == 0) goto L59
            boolean r4 = r5.A1()
            if (r4 == 0) goto L5c
        L59:
            kotlinx.coroutines.internal.y0.a(r1, r0)
        L5c:
            throw r3
        L5d:
            r4.resumeWith(r3)
            return
    }

    private static final void f(kotlinx.coroutines.d1<?> r4) {
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r0 = r0.b()
            boolean r1 = r0.D()
            if (r1 == 0) goto L10
            r0.w(r4)
            return
        L10:
            r1 = 1
            r0.z(r1)
            kotlin.coroutines.e r2 = r4.e()     // Catch: java.lang.Throwable -> L25
            e(r4, r2, r1)     // Catch: java.lang.Throwable -> L25
        L1b:
            boolean r2 = r0.N()     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L1b
        L21:
            r0.t(r1)
            goto L2b
        L25:
            r2 = move-exception
            r3 = 0
            r4.i(r2, r3)     // Catch: java.lang.Throwable -> L2c
            goto L21
        L2b:
            return
        L2c:
            r4 = move-exception
            r0.t(r1)
            throw r4
    }

    public static final void g(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.g0.a(r2)
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    public static final void h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.d1<?> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.n1 r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            r0 = 1
            r3.z(r0)
            r4.invoke()     // Catch: java.lang.Throwable -> L17
        L7:
            boolean r4 = r3.N()     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L7
            kotlin.jvm.internal.d0.d(r0)
        L10:
            r3.t(r0)
            kotlin.jvm.internal.d0.c(r0)
            return
        L17:
            r4 = move-exception
            r1 = 0
            r2.i(r4, r1)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.d0.d(r0)
            goto L10
        L20:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r3.t(r0)
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}

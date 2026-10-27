package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n297#1,5:325\n302#1,12:331\n314#1:387\n301#1:389\n302#1,12:391\n314#1:420\n217#2,7:318\n224#2:346\n243#2,8:347\n225#2:355\n255#2:356\n256#2,2:367\n258#2:371\n227#2:372\n229#2:388\n1#3:330\n1#3:390\n1#3:421\n200#4,3:343\n203#4,14:373\n200#4,17:403\n200#4,17:422\n107#5,10:357\n118#5,2:369\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n282#1:325,5\n282#1:331,12\n282#1:387\n287#1:389\n287#1:391,12\n287#1:420\n282#1:318,7\n282#1:346\n282#1:347,8\n282#1:355\n282#1:356\n282#1:367,2\n282#1:371\n282#1:372\n282#1:388\n282#1:330\n287#1:390\n282#1:343,3\n282#1:373,14\n287#1:403,17\n313#1:422,17\n282#1:357,10\n282#1:369,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 a = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 b = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.m.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.m.b = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 a() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.internal.m.a
            return r0
    }

    private static final boolean b(kotlinx.coroutines.internal.l<?> r3, java.lang.Object r4, int r5, boolean r6, kotlin.jvm.functions.Function0<kotlin.n1> r7) {
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r0 = r0.b()
            r1 = 0
            if (r6 == 0) goto L10
            boolean r6 = r0.I()
            if (r6 == 0) goto L10
            return r1
        L10:
            boolean r6 = r0.D()
            r2 = 1
            if (r6 == 0) goto L1f
            r3.f = r4
            r3.c = r5
            r0.w(r3)
            return r2
        L1f:
            r0.z(r2)
            r7.invoke()     // Catch: java.lang.Throwable -> L35
        L25:
            boolean r4 = r0.N()     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L25
            kotlin.jvm.internal.d0.d(r2)
        L2e:
            r0.t(r2)
            kotlin.jvm.internal.d0.c(r2)
            goto L3e
        L35:
            r4 = move-exception
            r5 = 0
            r3.i(r4, r5)     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.internal.d0.d(r2)
            goto L2e
        L3e:
            return r1
        L3f:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r0.t(r2)
            kotlin.jvm.internal.d0.c(r2)
            throw r3
    }

    static /* synthetic */ boolean c(kotlinx.coroutines.internal.l r1, java.lang.Object r2, int r3, boolean r4, kotlin.jvm.functions.Function0 r5, int r6, java.lang.Object r7) {
            r6 = r6 & 4
            r7 = 0
            if (r6 == 0) goto L6
            r4 = 0
        L6:
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r6 = r6.b()
            if (r4 == 0) goto L15
            boolean r4 = r6.I()
            if (r4 == 0) goto L15
            return r7
        L15:
            boolean r4 = r6.D()
            r0 = 1
            if (r4 == 0) goto L24
            r1.f = r2
            r1.c = r3
            r6.w(r1)
            return r0
        L24:
            r6.z(r0)
            r5.invoke()     // Catch: java.lang.Throwable -> L3a
        L2a:
            boolean r2 = r6.N()     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L2a
            kotlin.jvm.internal.d0.d(r0)
        L33:
            r6.t(r0)
            kotlin.jvm.internal.d0.c(r0)
            goto L43
        L3a:
            r2 = move-exception
            r3 = 0
            r1.i(r2, r3)     // Catch: java.lang.Throwable -> L44
            kotlin.jvm.internal.d0.d(r0)
            goto L33
        L43:
            return r7
        L44:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r6.t(r0)
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final <T> void d(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r6, @org.jetbrains.annotations.NotNull java.lang.Object r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r8) {
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.l
            if (r0 == 0) goto Lb3
            kotlinx.coroutines.internal.l r6 = (kotlinx.coroutines.internal.l) r6
            java.lang.Object r8 = kotlinx.coroutines.i0.b(r7, r8)
            kotlinx.coroutines.m0 r0 = r6.d
            kotlin.coroutines.i r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.f = r8
            r6.c = r1
            kotlinx.coroutines.m0 r7 = r6.d
            kotlin.coroutines.i r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto Lad
        L26:
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r0 = r0.b()
            boolean r2 = r0.D()
            if (r2 == 0) goto L3b
            r6.f = r8
            r6.c = r1
            r0.w(r6)
            goto Lad
        L3b:
            r0.z(r1)
            r2 = 0
            kotlin.coroutines.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.e2$b r4 = kotlinx.coroutines.e2.s0     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.i$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.e2 r3 = (kotlinx.coroutines.e2) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.H()     // Catch: java.lang.Throwable -> L68
            r6.d(r8, r7)     // Catch: java.lang.Throwable -> L68
            kotlin.Result$a r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.g0.a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.Result.m11constructorimpl(r7)     // Catch: java.lang.Throwable -> L68
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            kotlin.coroutines.e<T> r8 = r6.e     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.g     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.i r4 = r8.getContext()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = kotlinx.coroutines.internal.y0.c(r4, r3)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.internal.y0.a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            kotlinx.coroutines.p3 r8 = kotlinx.coroutines.l0.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            kotlin.coroutines.e<T> r5 = r6.e     // Catch: java.lang.Throwable -> L9c
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9c
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.A1()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            kotlinx.coroutines.internal.y0.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.N()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.t(r1)
            goto Lad
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.A1()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            kotlinx.coroutines.internal.y0.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.i(r7, r2)     // Catch: java.lang.Throwable -> Lae
            goto L98
        Lad:
            return
        Lae:
            r6 = move-exception
            r0.t(r1)
            throw r6
        Lb3:
            r6.resumeWith(r7)
            return
    }

    public static /* synthetic */ void e(kotlin.coroutines.e r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            d(r0, r1, r2)
            return
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.l<? super kotlin.n1> r5) {
            kotlin.n1 r0 = kotlin.n1.a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r1 = r1.b()
            boolean r2 = r1.I()
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            boolean r2 = r1.D()
            r4 = 1
            if (r2 == 0) goto L20
            r5.f = r0
            r5.c = r4
            r1.w(r5)
            r3 = 1
            goto L36
        L20:
            r1.z(r4)
            r5.run()     // Catch: java.lang.Throwable -> L30
        L26:
            boolean r0 = r1.N()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L26
        L2c:
            r1.t(r4)
            goto L36
        L30:
            r0 = move-exception
            r2 = 0
            r5.i(r0, r2)     // Catch: java.lang.Throwable -> L37
            goto L2c
        L36:
            return r3
        L37:
            r5 = move-exception
            r1.t(r4)
            throw r5
    }
}

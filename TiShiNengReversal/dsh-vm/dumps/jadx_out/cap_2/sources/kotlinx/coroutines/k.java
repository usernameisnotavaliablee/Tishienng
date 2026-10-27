package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,273:1\n95#2,5:274\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n166#1:274,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class k {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.x0<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r4) {
            kotlin.coroutines.i r1 = kotlinx.coroutines.l0.e(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L10
            kotlinx.coroutines.n2 r2 = new kotlinx.coroutines.n2
            r2.<init>(r1, r4)
            goto L16
        L10:
            kotlinx.coroutines.y0 r2 = new kotlinx.coroutines.y0
            r0 = 1
            r2.<init>(r1, r0)
        L16:
            r2.z1(r3, r2, r4)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.x0 b(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Lc:
            kotlinx.coroutines.x0 r0 = kotlinx.coroutines.i.a(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.i.h(r0, r1, r2)
            return r0
    }

    private static final <T> java.lang.Object d(kotlinx.coroutines.m0 r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super T> r3) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            java.lang.Object r1 = kotlinx.coroutines.i.h(r1, r2, r3)
            r2 = 1
            kotlin.jvm.internal.d0.e(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.e2 e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            kotlin.coroutines.i r1 = kotlinx.coroutines.l0.e(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L10
            kotlinx.coroutines.o2 r2 = new kotlinx.coroutines.o2
            r2.<init>(r1, r4)
            goto L16
        L10:
            kotlinx.coroutines.a3 r2 = new kotlinx.coroutines.a3
            r0 = 1
            r2.<init>(r1, r0)
        L16:
            r2.z1(r3, r2, r4)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.e2 f(kotlinx.coroutines.r0 r0, kotlin.coroutines.i r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Lc:
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.i.d(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r10) {
            kotlin.coroutines.i r0 = r10.getContext()
            kotlin.coroutines.i r8 = kotlinx.coroutines.l0.d(r0, r8)
            kotlinx.coroutines.h2.z(r8)
            if (r8 != r0) goto L17
            kotlinx.coroutines.internal.o0 r0 = new kotlinx.coroutines.internal.o0
            r0.<init>(r8, r10)
            java.lang.Object r8 = n4.b.e(r0, r0, r9)
            goto L55
        L17:
            kotlin.coroutines.f$b r1 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r2 = r8.get(r1)
            kotlin.coroutines.i$b r0 = r0.get(r1)
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L44
            kotlinx.coroutines.p3 r0 = new kotlinx.coroutines.p3
            r0.<init>(r8, r10)
            kotlin.coroutines.i r8 = r0.getContext()
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.y0.c(r8, r1)
            java.lang.Object r9 = n4.b.e(r0, r0, r9)     // Catch: java.lang.Throwable -> L3e
            kotlinx.coroutines.internal.y0.a(r8, r1)
            r8 = r9
            goto L55
        L3e:
            r0 = move-exception
            r9 = r0
            kotlinx.coroutines.internal.y0.a(r8, r1)
            throw r9
        L44:
            kotlinx.coroutines.c1 r3 = new kotlinx.coroutines.c1
            r3.<init>(r8, r10)
            r6 = 4
            r7 = 0
            r5 = 0
            r4 = r3
            r2 = r9
            n4.a.f(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = r3.A1()
        L55:
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.l()
            if (r8 != r9) goto L5e
            kotlin.coroutines.jvm.internal.e.c(r10)
        L5e:
            return r8
    }
}

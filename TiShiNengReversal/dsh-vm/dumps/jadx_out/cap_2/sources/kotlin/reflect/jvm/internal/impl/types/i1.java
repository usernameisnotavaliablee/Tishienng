package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSpecialTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n102#2,2:217\n104#2,6:222\n112#2,7:229\n1563#3:219\n1634#3,2:220\n1636#3:228\n*S KotlinDebug\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n*L\n214#1:217,2\n214#1:222,6\n214#1:229,7\n214#1:219\n214#1:220,2\n214#1:228\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i1 {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.a a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.a
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.a r1 = (kotlin.reflect.jvm.internal.impl.types.a) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.e1 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.a r1 = a(r1)
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.U0()
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.z
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.types.s0 d(kotlin.reflect.jvm.internal.impl.types.s0 r8) {
            java.util.Collection r0 = r8.i()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L17:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L38
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
            boolean r7 = kotlin.reflect.jvm.internal.impl.types.j2.l(r4)
            if (r7 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r4.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r4 = f(r3, r2, r5, r6)
            r3 = 1
        L34:
            r1.add(r4)
            goto L17
        L38:
            if (r3 != 0) goto L3b
            return r6
        L3b:
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r8.l()
            if (r8 == 0) goto L50
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.l(r8)
            if (r0 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = r8.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = f(r8, r2, r5, r6)
        L4f:
            r6 = r8
        L50:
            kotlin.reflect.jvm.internal.impl.types.s0 r8 = new kotlin.reflect.jvm.internal.impl.types.s0
            r8.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.s0 r8 = r8.s(r6)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.m2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.types.z$a r1 = kotlin.reflect.jvm.internal.impl.types.z.d
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r7
            r3 = r8
            kotlin.reflect.jvm.internal.impl.types.z r7 = kotlin.reflect.jvm.internal.impl.types.z.a.c(r1, r2, r3, r4, r5, r6)
            if (r7 == 0) goto L13
            return r7
        L13:
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = g(r2)
            if (r7 == 0) goto L1a
            return r7
        L1a:
            r7 = 0
            kotlin.reflect.jvm.internal.impl.types.m2 r7 = r2.M0(r7)
            return r7
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 f(kotlin.reflect.jvm.internal.impl.types.m2 r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = e(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 g(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            r1 = 0
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.types.s0 r2 = (kotlin.reflect.jvm.internal.impl.types.s0) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 != 0) goto L10
            return r1
        L10:
            kotlin.reflect.jvm.internal.impl.types.s0 r2 = d(r2)
            if (r2 != 0) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.j()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.types.z$a r1 = kotlin.reflect.jvm.internal.impl.types.z.d
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r7
            r3 = r8
            kotlin.reflect.jvm.internal.impl.types.z r7 = kotlin.reflect.jvm.internal.impl.types.z.a.c(r1, r2, r3, r4, r5, r6)
            if (r7 == 0) goto L13
            return r7
        L13:
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = g(r2)
            if (r7 != 0) goto L1e
            r7 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r2.P0(r7)
        L1e:
            return r7
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 i(kotlin.reflect.jvm.internal.impl.types.e1 r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "abbreviatedType"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r1)
            if (r0 == 0) goto L11
            return r1
        L11:
            kotlin.reflect.jvm.internal.impl.types.a r0 = new kotlin.reflect.jvm.internal.impl.types.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.checker.i k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.i r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2 = r8.R0()
            kotlin.reflect.jvm.internal.impl.types.checker.n r3 = r8.S0()
            kotlin.reflect.jvm.internal.impl.types.m2 r4 = r8.T0()
            kotlin.reflect.jvm.internal.impl.types.t1 r5 = r8.H0()
            boolean r6 = r8.J0()
            r7 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }
}

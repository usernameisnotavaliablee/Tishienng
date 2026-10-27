package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1761#2,3:109\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n*L\n51#1:109,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 {
    private static final kotlin.reflect.jvm.internal.impl.types.t0 a(kotlin.reflect.jvm.internal.impl.types.t0 r0) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.d.c(r0)
            java.lang.Object r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            return r0
    }

    private static final java.lang.String b(kotlin.reflect.jvm.internal.impl.types.w1 r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            c(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hashCode: "
            r1.append(r2)
            int r2 = r4.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "javaClass: "
            r1.append(r2)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            c(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
        L51:
            if (r4 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "fqName: "
            r1.append(r3)
            kotlin.reflect.jvm.internal.impl.renderer.m r3 = kotlin.reflect.jvm.internal.impl.renderer.m.h
            java.lang.String r3 = r3.N(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            c(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            c(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b()
            goto L51
        L8c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static final java.lang.StringBuilder c(java.lang.String r1, java.lang.StringBuilder r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r2.append(r1)
            r1 = 10
            r2.append(r1)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.t0 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.z r11) {
            java.lang.String r0 = "subtype"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "supertype"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "typeCheckingProcedureCallbacks"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.checker.w r1 = new kotlin.reflect.jvm.internal.impl.types.checker.w
            r2 = 0
            r1.<init>(r9, r2)
            r0.add(r1)
            kotlin.reflect.jvm.internal.impl.types.w1 r9 = r10.I0()
        L21:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L119
            java.lang.Object r10 = r0.poll()
            kotlin.reflect.jvm.internal.impl.types.checker.w r10 = (kotlin.reflect.jvm.internal.impl.types.checker.w) r10
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r10.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r1.I0()
            boolean r4 = r11.a(r3, r9)
            if (r4 == 0) goto Lf9
            boolean r0 = r1.J0()
            kotlin.reflect.jvm.internal.impl.types.checker.w r10 = r10.a()
        L43:
            if (r10 == 0) goto Lb7
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r10.getType()
            java.util.List r4 = r3.G0()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L5f
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L5f
            goto L93
        L5f:
            java.util.Iterator r4 = r4.iterator()
        L63:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L93
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = (kotlin.reflect.jvm.internal.impl.types.c2) r5
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r5.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r5 == r8) goto L63
            kotlin.reflect.jvm.internal.impl.types.x1$a r4 = kotlin.reflect.jvm.internal.impl.types.x1.c
            kotlin.reflect.jvm.internal.impl.types.f2 r4 = r4.a(r3)
            kotlin.reflect.jvm.internal.impl.types.f2 r4 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e.h(r4, r7, r6, r2)
            kotlin.reflect.jvm.internal.impl.types.h2 r4 = r4.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.n(r1, r8)
            java.lang.String r4 = "safeSubstitute(...)"
            kotlin.jvm.internal.g0.o(r1, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = a(r1)
            goto La6
        L93:
            kotlin.reflect.jvm.internal.impl.types.x1$a r4 = kotlin.reflect.jvm.internal.impl.types.x1.c
            kotlin.reflect.jvm.internal.impl.types.f2 r4 = r4.a(r3)
            kotlin.reflect.jvm.internal.impl.types.h2 r4 = r4.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.n(r1, r5)
            kotlin.jvm.internal.g0.m(r1)
        La6:
            if (r0 != 0) goto Lb1
            boolean r0 = r3.J0()
            if (r0 == 0) goto Laf
            goto Lb1
        Laf:
            r0 = 0
            goto Lb2
        Lb1:
            r0 = 1
        Lb2:
            kotlin.reflect.jvm.internal.impl.types.checker.w r10 = r10.a()
            goto L43
        Lb7:
            kotlin.reflect.jvm.internal.impl.types.w1 r10 = r1.I0()
            boolean r2 = r11.a(r10, r9)
            if (r2 == 0) goto Lc6
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = kotlin.reflect.jvm.internal.impl.types.j2.p(r1, r0)
            return r9
        Lc6:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type constructors should be equals!\nsubstitutedSuperType: "
            r1.append(r2)
            java.lang.String r2 = b(r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\nsupertype: "
            r1.append(r2)
            java.lang.String r2 = b(r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.a(r10, r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        Lf9:
            java.util.Collection r1 = r3.i()
            java.util.Iterator r1 = r1.iterator()
        L101:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            kotlin.reflect.jvm.internal.impl.types.checker.w r4 = new kotlin.reflect.jvm.internal.impl.types.checker.w
            kotlin.jvm.internal.g0.m(r3)
            r4.<init>(r3, r10)
            r0.add(r4)
            goto L101
        L119:
            return r2
    }
}

package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1563#2:184\n1634#2,3:185\n1563#2:188\n1634#2,3:189\n1563#2:192\n1634#2,3:193\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n*L\n26#1:184\n26#1:185,3\n38#1:188\n38#1:189,3\n58#1:192\n58#1:193,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.m2 a(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.m2> r10) {
            java.lang.String r0 = "types"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.size()
            if (r0 == 0) goto Lb1
            r1 = 1
            if (r0 == r1) goto La8
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
            r5 = 0
            r6 = 0
            r7 = 0
        L23:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = (kotlin.reflect.jvm.internal.impl.types.m2) r8
            if (r6 != 0) goto L3a
            boolean r6 = kotlin.reflect.jvm.internal.impl.types.x0.a(r8)
            if (r6 == 0) goto L38
            goto L3a
        L38:
            r6 = 0
            goto L3b
        L3a:
            r6 = 1
        L3b:
            boolean r9 = r8 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r9 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = (kotlin.reflect.jvm.internal.impl.types.e1) r8
            goto L54
        L42:
            boolean r7 = r8 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r7 == 0) goto L58
            boolean r7 = kotlin.reflect.jvm.internal.impl.types.g0.a(r8)
            if (r7 == 0) goto L4d
            return r8
        L4d:
            kotlin.reflect.jvm.internal.impl.types.k0 r8 = (kotlin.reflect.jvm.internal.impl.types.k0) r8
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r8.Q0()
            r7 = 1
        L54:
            r2.add(r8)
            goto L23
        L58:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L5e:
            if (r6 == 0) goto L6f
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES
            java.lang.String r10 = r10.toString()
            java.lang.String[] r10 = new java.lang.String[]{r10}
            kotlin.reflect.jvm.internal.impl.types.error.g r10 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r10)
            return r10
        L6f:
            if (r7 != 0) goto L78
            kotlin.reflect.jvm.internal.impl.types.checker.b0 r10 = kotlin.reflect.jvm.internal.impl.types.checker.b0.a
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r10.d(r2)
            return r10
        L78:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r1 = kotlin.collections.f0.d0(r0, r3)
            r10.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L85:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = (kotlin.reflect.jvm.internal.impl.types.m2) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.n0.d(r1)
            r10.add(r1)
            goto L85
        L99:
            kotlin.reflect.jvm.internal.impl.types.checker.b0 r0 = kotlin.reflect.jvm.internal.impl.types.checker.b0.a
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.d(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r0.d(r10)
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = kotlin.reflect.jvm.internal.impl.types.w0.e(r1, r10)
            return r10
        La8:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = kotlin.collections.f0.k5(r10)
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = (kotlin.reflect.jvm.internal.impl.types.m2) r10
            return r10
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected some types"
            r10.<init>(r0)
            throw r10
    }
}

package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ntypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n1761#3,3:105\n*S KotlinDebug\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n*L\n55#1:105,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j0 {
    @org.jetbrains.annotations.NotNull
    public static final <T> T a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.t<T> r1, @org.jetbrains.annotations.NotNull T r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "possiblyPrimitiveType"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto L11
            java.lang.Object r1 = r1.c(r2)
            return r1
        L11:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i2 r3, @org.jetbrains.annotations.NotNull d4.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.t<T> r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.i0 r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "typeFactory"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.g0.p(r6, r0)
            d4.o r0 = r3.W(r4)
            boolean r1 = r3.V(r0)
            r2 = 0
            if (r1 != 0) goto L20
            return r2
        L20:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = r3.i(r0)
            if (r1 == 0) goto L3f
            java.lang.Object r6 = r5.d(r1)
            boolean r0 = r3.i0(r4)
            if (r0 != 0) goto L39
            boolean r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.p1.c(r3, r4)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            java.lang.Object r3 = a(r5, r6, r3)
            return r3
        L3f:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r4 = r3.C0(r0)
            if (r4 == 0) goto L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = 91
            r3.append(r6)
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(r4)
            java.lang.String r4 = r4.getDesc()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r5.a(r3)
            return r3
        L63:
            boolean r4 = r3.b0(r0)
            if (r4 == 0) goto Lbe
            kotlin.reflect.jvm.internal.impl.name.d r3 = r3.E0(r0)
            if (r3 == 0) goto L76
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.b r3 = r4.n(r3)
            goto L77
        L76:
            r3 = r2
        L77:
            if (r3 == 0) goto Lbe
            boolean r4 = r6.a()
            if (r4 != 0) goto Lb0
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            java.util.List r4 = r4.i()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r6 = r4 instanceof java.util.Collection
            if (r6 == 0) goto L95
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L95
            goto Lb0
        L95:
            java.util.Iterator r4 = r4.iterator()
        L99:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r4.next()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c$a r6 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a) r6
            kotlin.reflect.jvm.internal.impl.name.b r6 = r6.d()
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r3)
            if (r6 == 0) goto L99
            return r2
        Lb0:
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.h(r3)
            java.lang.String r4 = "internalNameByClassId(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Object r3 = r5.f(r3)
            return r3
        Lbe:
            return r2
    }
}

package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ninlineClassManglingRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1761#2,3:54\n1761#2,3:57\n1#3:60\n*S KotlinDebug\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n*L\n21#1:54,3\n27#1:57,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    private static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r1)
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.x
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            return r1
    }

    private static final boolean b(kotlin.reflect.jvm.internal.impl.types.t0 r1, boolean r2) {
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = 0
            if (r1 != 0) goto L14
            return r0
        L14:
            if (r2 != 0) goto L1c
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(r1)
            if (r2 != 0) goto L28
        L1c:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.p(r1)
            boolean r1 = e(r1)
            if (r1 == 0) goto L28
            r1 = 1
            return r1
        L28:
            return r0
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r1)
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r1 = a(r1)
            if (r1 != 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r3.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L24
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.b(r0)
            if (r2 == 0) goto L1c
            boolean r0 = c(r0)
            if (r0 != 0) goto L22
        L1c:
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.j.i(r3)
            if (r3 == 0) goto L24
        L22:
            r3 = 1
            return r3
        L24:
            return r1
    }

    private static final boolean e(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            boolean r0 = d(r2)
            r1 = 1
            if (r0 != 0) goto L10
            boolean r2 = b(r2, r1)
            if (r2 == 0) goto Le
            goto L10
        Le:
            r2 = 0
            return r2
        L10:
            return r1
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r3
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r0 = 0
            if (r3 != 0) goto L11
            return r0
        L11:
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r3.getVisibility()
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.g(r1)
            if (r1 == 0) goto L1c
            return r0
        L1c:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.J()
            java.lang.String r2 = "getConstructedClass(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r1)
            if (r1 == 0) goto L2c
            return r0
        L2c:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.J()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.G(r1)
            if (r1 == 0) goto L37
            return r0
        L37:
            java.util.List r3 = r3.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r1 = r3 instanceof java.util.Collection
            if (r1 == 0) goto L50
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L50
            return r0
        L50:
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r1 = e(r1)
            if (r1 == 0) goto L54
            r3 = 1
            return r3
        L71:
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nsuspendFunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1563#2:66\n1634#2,3:67\n1#3:70\n*S KotlinDebug\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n*L\n54#1:66\n54#1:67,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 a = null;

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.g0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.p
            kotlin.reflect.jvm.internal.impl.types.error.i r2 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r2 = r2.i()
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.o.s
            r1.<init>(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.o.w
            kotlin.reflect.jvm.internal.impl.name.f r5 = r3.f()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r6 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            kotlin.reflect.jvm.internal.impl.storage.n r7 = kotlin.reflect.jvm.internal.impl.storage.f.e
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            r0.H0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            r0.J0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            java.lang.String r2 = "T"
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            r5 = 0
            r2 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.t0.M0(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r1 = kotlin.collections.f0.l(r1)
            r0.I0(r1)
            r0.F0()
            kotlin.reflect.jvm.internal.impl.builtins.p.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r13) {
            java.lang.String r0 = "suspendFunType"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.builtins.i.r(r13)
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r13)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r13.getAnnotations()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.builtins.i.k(r13)
            java.util.List r4 = kotlin.reflect.jvm.internal.impl.builtins.i.e(r13)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.builtins.i.m(r13)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.f0.d0(r0, r6)
            r5.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L41
            java.lang.Object r6 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r6 = (kotlin.reflect.jvm.internal.impl.types.c2) r6
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
            r5.add(r6)
            goto L2d
        L41:
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r6 = r0.k()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 r0 = kotlin.reflect.jvm.internal.impl.builtins.p.a
            kotlin.reflect.jvm.internal.impl.types.w1 r7 = r0.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.builtins.i.l(r13)
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r0)
            java.util.List r8 = kotlin.collections.f0.l(r0)
            r11 = 16
            r12 = 0
            r9 = 0
            r10 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.w0.m(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r5 = kotlin.collections.f0.J4(r5, r0)
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r13)
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r0.J()
            java.lang.String r0 = "getNullableAnyType(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            r9 = 128(0x80, float:1.8E-43)
            r6 = 0
            r8 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.builtins.i.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r13 = r13.J0()
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = r0.P0(r13)
            return r13
    }
}

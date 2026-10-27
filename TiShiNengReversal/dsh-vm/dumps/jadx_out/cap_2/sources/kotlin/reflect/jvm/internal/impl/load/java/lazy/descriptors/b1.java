package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1563#2:76\n1634#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b1 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k k;

    @org.jetbrains.annotations.NotNull
    private final x3.y l;

    public b1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r12, @org.jetbrains.annotations.NotNull x3.y r13, int r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r15) {
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "javaTypeParameter"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r15, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r12.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.g
            r7 = 4
            r8 = 0
            r6 = 0
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.name.f r5 = r13.getName()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r12.a()
            kotlin.reflect.jvm.internal.impl.descriptors.h1 r10 = r0.v()
            r7 = 0
            r1 = r11
            r8 = r14
            r4 = r3
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.k = r12
            r1.l = r13
            return
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> H0() {
            r10 = this;
            x3.y r0 = r10.l
            java.util.Collection r0 = r0.getUpperBounds()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r10.k
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.i()
            java.lang.String r1 = "getAnyType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r10.k
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = r1.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.J()
            java.lang.String r2 = "getNullableAnyType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r1)
            java.util.List r0 = kotlin.collections.f0.l(r0)
            return r0
        L3b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r0.next()
            x3.j r2 = (x3.j) r2
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r10.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r3 = r3.g()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r4 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = r10
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.p(r2, r4)
            r1.add(r2)
            goto L4c
        L71:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> E0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r3) {
            r2 = this;
            java.lang.String r0 = "bounds"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r0 = r0.r()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.k
            java.util.List r3 = r0.r(r2, r3, r1)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    protected void F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> G0() {
            r1 = this;
            java.util.List r0 = r1.H0()
            return r0
    }
}

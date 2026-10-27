package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n11228#2:52\n11563#2,3:53\n*S KotlinDebug\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n*L\n49#1:52\n49#1:53,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y implements x3.k {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Constructor<?> a;

    public t(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<?> r2) {
            r1 = this;
            java.lang.String r0 = "member"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y
    public /* bridge */ /* synthetic */ java.lang.reflect.Member N() {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.P()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Constructor<?> P() {
            r1 = this;
            java.lang.reflect.Constructor<?> r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<x3.b0> g() {
            r4 = this;
            java.lang.reflect.Constructor r0 = r4.P()
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.length
            if (r1 != 0) goto L13
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L13:
            java.lang.reflect.Constructor r1 = r4.P()
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.Class r2 = r1.getDeclaringClass()
            if (r2 == 0) goto L33
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L33
            r1 = 1
            int r2 = r0.length
            java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r1, r2)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
        L33:
            java.lang.reflect.Constructor r1 = r4.P()
            java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
            int r2 = r1.length
            int r3 = r0.length
            if (r2 < r3) goto L63
            int r2 = r1.length
            int r3 = r0.length
            if (r2 <= r3) goto L50
            kotlin.jvm.internal.g0.m(r1)
            int r2 = r1.length
            int r3 = r0.length
            int r2 = r2 - r3
            int r3 = r1.length
            java.lang.Object[] r1 = kotlin.collections.n.l1(r1, r2, r3)
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
        L50:
            kotlin.jvm.internal.g0.m(r0)
            kotlin.jvm.internal.g0.m(r1)
            java.lang.reflect.Constructor r2 = r4.P()
            boolean r2 = r2.isVarArgs()
            java.util.List r0 = r4.O(r0, r1, r2)
            return r0
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal generic signature: "
            r1.append(r2)
            java.lang.reflect.Constructor r2 = r4.P()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0> getTypeParameters() {
            r6 = this;
            java.lang.reflect.Constructor r0 = r6.P()
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.String r1 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L24
            r4 = r0[r3]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0 r5 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L15
        L24:
            return r1
    }
}

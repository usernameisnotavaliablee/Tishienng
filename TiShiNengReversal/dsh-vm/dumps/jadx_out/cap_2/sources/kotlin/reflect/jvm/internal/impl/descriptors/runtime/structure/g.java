package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaAnnotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11228#2:44\n11563#2,3:45\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n*L\n26#1:44\n26#1:45,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u implements x3.a {

    @org.jetbrains.annotations.NotNull
    private final java.lang.annotation.Annotation a;

    public g(@org.jetbrains.annotations.NotNull java.lang.annotation.Annotation r2) {
            r1 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public /* bridge */ /* synthetic */ x3.g D() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = r1.N()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.annotation.Annotation M() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q N() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.q
            java.lang.annotation.Annotation r1 = r2.a
            kotlin.reflect.d r1 = k3.a.a(r1)
            java.lang.Class r1 = k3.a.e(r1)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.b c() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.a
            kotlin.reflect.d r0 = k3.a.a(r0)
            java.lang.Class r0 = k3.a.e(r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r0)
            return r0
    }

    public boolean e() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
            if (r0 == 0) goto Le
            java.lang.annotation.Annotation r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g) r2
            java.lang.annotation.Annotation r2 = r2.a
            if (r0 != r2) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.b> getArguments() {
            r8 = this;
            java.lang.annotation.Annotation r0 = r8.a
            kotlin.reflect.d r0 = k3.a.a(r0)
            java.lang.Class r0 = k3.a.e(r0)
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "getDeclaredMethods(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L1b:
            if (r3 >= r2) goto L3f
            r4 = r0[r3]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h$a r5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h.b
            java.lang.annotation.Annotation r6 = r8.a
            r7 = 0
            java.lang.Object r6 = r4.invoke(r6, r7)
            java.lang.String r7 = "invoke(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            java.lang.String r4 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h r4 = r5.a(r6, r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L1b
        L3f:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.a
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g> r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.annotation.Annotation r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean u() {
            r1 = this;
            r0 = 0
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n1#2:38\n11228#3:39\n11563#3,3:40\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n*L\n35#1:39\n35#1:40,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y implements x3.r {

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Method a;

    public z(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r0 = "member"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public boolean K() {
            r1 = this;
            x3.b r0 = r1.l()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y
    public /* bridge */ /* synthetic */ java.lang.reflect.Member N() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.P()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.reflect.Method P() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 Q() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a
            java.lang.reflect.Method r1 = r3.P()
            java.lang.reflect.Type r1 = r1.getGenericReturnType()
            java.lang.String r2 = "getGenericReturnType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r0.a(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<x3.b0> g() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.P()
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            java.lang.String r1 = "getGenericParameterTypes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.reflect.Method r1 = r3.P()
            java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
            java.lang.String r2 = "getParameterAnnotations(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            java.lang.reflect.Method r2 = r3.P()
            boolean r2 = r2.isVarArgs()
            java.util.List r0 = r3.O(r0, r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ x3.x getReturnType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r0 = r1.Q()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f0> getTypeParameters() {
            r6 = this;
            java.lang.reflect.Method r0 = r6.P()
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

    @org.jetbrains.annotations.Nullable
    public x3.b l() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.P()
            java.lang.Object r0 = r0.getDefaultValue()
            r1 = 0
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h.b
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h r0 = r2.a(r0, r1)
            return r0
        L12:
            return r1
    }
}

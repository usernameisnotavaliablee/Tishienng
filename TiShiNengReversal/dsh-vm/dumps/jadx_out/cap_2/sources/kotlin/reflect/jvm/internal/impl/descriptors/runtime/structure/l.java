package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaAnnotationArguments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n11228#2:80\n11563#2,3:81\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n*L\n48#1:80\n48#1:81,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h implements x3.e {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] c;

    public l(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
            r1 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.c = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h> getElements() {
            r7 = this;
            java.lang.Object[] r0 = r7.c
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        La:
            if (r3 >= r2) goto L1e
            r4 = r0[r3]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h$a r5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h.b
            kotlin.jvm.internal.g0.m(r4)
            r6 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h r4 = r5.a(r4, r6)
            r1.add(r4)
            int r3 = r3 + 1
            goto La
        L1e:
            return r1
    }
}

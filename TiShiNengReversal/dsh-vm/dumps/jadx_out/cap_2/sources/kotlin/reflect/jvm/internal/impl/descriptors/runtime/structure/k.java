package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJavaAnnotationOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n11228#2:44\n11563#2,3:45\n1310#2,2:48\n1#3:50\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n*L\n37#1:44\n37#1:45,3\n41#1:48,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g a(@org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[] r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            r2 = 0
            if (r1 >= r0) goto L2b
            r3 = r5[r1]
            kotlin.reflect.d r4 = k3.a.a(r3)
            java.lang.Class r4 = k3.a.e(r4)
            kotlin.reflect.jvm.internal.impl.name.b r4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.e(r4)
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.a()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
            if (r4 == 0) goto L28
            goto L2c
        L28:
            int r1 = r1 + 1
            goto Lc
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r5 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
            r5.<init>(r3)
            return r5
        L34:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g> b(@org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1c
            r3 = r5[r2]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g r4 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto Ld
        L1c:
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotationsTypeAttribute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationsTypeAttribute.kt\norg/jetbrains/kotlin/types/AnnotationsTypeAttributeKt\n+ 2 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n*L\n1#1,40:1\n42#2:41\n*S KotlinDebug\n*F\n+ 1 AnnotationsTypeAttribute.kt\norg/jetbrains/kotlin/types/AnnotationsTypeAttributeKt\n*L\n-1#1:41\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.properties.e b = null;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.u> r1 = kotlin.reflect.jvm.internal.impl.types.u.class
            java.lang.String r2 = "annotationsAttribute"
            java.lang.String r3 = "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r4]
            r2 = 0
            r1[r2] = r0
            kotlin.reflect.jvm.internal.impl.types.u.a = r1
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.t> r1 = kotlin.reflect.jvm.internal.impl.types.t.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            kotlin.reflect.jvm.internal.impl.util.n r0 = r0.d(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.u.b = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.t r1 = b(r1)
            if (r1 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.e()
            if (r1 != 0) goto L12
            goto L13
        L12:
            return r1
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.t b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.properties.e r0 = kotlin.reflect.jvm.internal.impl.types.u.b
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.types.u.a
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r3 = r0.a(r3, r1)
            kotlin.reflect.jvm.internal.impl.types.t r3 = (kotlin.reflect.jvm.internal.impl.types.t) r3
            return r3
    }
}

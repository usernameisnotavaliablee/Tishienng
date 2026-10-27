package kotlin.reflect.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KTypesJvm")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKTypesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n295#2,2:53\n*S KotlinDebug\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n*L\n44#1:53,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.d<?> a(@org.jetbrains.annotations.NotNull kotlin.reflect.g r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof kotlin.reflect.d
            if (r0 == 0) goto Lc
            kotlin.reflect.d r5 = (kotlin.reflect.d) r5
            return r5
        Lc:
            boolean r0 = r5 instanceof kotlin.reflect.s
            if (r0 == 0) goto L74
            kotlin.reflect.s r5 = (kotlin.reflect.s) r5
            java.util.List r5 = r5.getUpperBounds()
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.reflect.r r3 = (kotlin.reflect.r) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            kotlin.jvm.internal.g0.n(r3, r4)
            kotlin.reflect.jvm.internal.z2 r3 = (kotlin.reflect.jvm.internal.z2) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.c()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r4 == 0) goto L45
            r2 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
        L45:
            if (r2 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = r2.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r3 == r4) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r2.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r2 == r3) goto L1d
            r2 = r1
        L58:
            kotlin.reflect.r r2 = (kotlin.reflect.r) r2
            if (r2 != 0) goto L63
            java.lang.Object r5 = kotlin.collections.f0.L2(r5)
            r2 = r5
            kotlin.reflect.r r2 = (kotlin.reflect.r) r2
        L63:
            if (r2 == 0) goto L6d
            kotlin.reflect.d r5 = b(r2)
            if (r5 != 0) goto L6c
            goto L6d
        L6c:
            return r5
        L6d:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            kotlin.reflect.d r5 = kotlin.jvm.internal.o0.d(r5)
            return r5
        L74:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.d<?> b(@org.jetbrains.annotations.NotNull kotlin.reflect.r r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.g r0 = r3.n()
            if (r0 == 0) goto L12
            kotlin.reflect.d r0 = a(r0)
            if (r0 == 0) goto L12
            return r0
        L12:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static /* synthetic */ void c(kotlin.reflect.r r0) {
            return
    }
}

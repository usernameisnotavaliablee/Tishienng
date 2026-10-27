package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1#2:50\n12637#3,2:51\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n*L\n47#1:51,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s0 {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r7, @org.jetbrains.annotations.NotNull x3.c0 r8) {
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "wildcardType"
            kotlin.jvm.internal.g0.p(r8, r0)
            x3.x r0 = r8.getBound()
            if (r0 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.g
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.Iterator r7 = r1.iterator()
        L1e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L43
            java.lang.Object r8 = r7.next()
            r0 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r0
            kotlin.reflect.jvm.internal.impl.name.c[] r1 = kotlin.reflect.jvm.internal.impl.load.java.a0.e()
            int r2 = r1.length
            r3 = 0
        L31:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            kotlin.reflect.jvm.internal.impl.name.c r5 = r0.d()
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r4)
            if (r4 == 0) goto L40
            goto L44
        L40:
            int r3 = r3 + 1
            goto L31
        L43:
            r8 = 0
        L44:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r8 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r8
            return r8
        L47:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Nullability annotations on unbounded wildcards aren't supported"
            r7.<init>(r8)
            throw r7
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "memberDescriptor"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.descriptors.a$a<java.lang.Boolean> r0 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.H
            java.lang.Object r1 = r1.N(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.d0 r1) {
            java.lang.String r0 = "javaTypeEnhancementState"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.jvm.functions.Function1 r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.a0.d()
            java.lang.Object r1 = r1.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT
            if (r1 != r0) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.load.java.x.g(r1)
            java.lang.String r0 = "toDescriptorVisibility(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ndescriptorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 descriptorUtil.kt\norg/jetbrains/kotlin/descriptors/DescriptorUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,113:1\n1#2:114\n19#3:115\n*S KotlinDebug\n*F\n+ 1 descriptorUtil.kt\norg/jetbrains/kotlin/descriptors/DescriptorUtilKt\n*L\n38#1:115\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.f a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r2.b()
            r1 = 0
            if (r0 == 0) goto L23
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r2 == 0) goto L11
            goto L23
        L11:
            boolean r2 = b(r0)
            if (r2 != 0) goto L1c
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = a(r0)
            return r2
        L1c:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r0
            return r0
        L23:
            return r1
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            return r1
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r5.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r2 = 0
            if (r1 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L12
        L11:
            r0 = r2
        L12:
            r1 = 0
            if (r0 == 0) goto L83
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r0)
            if (r3 == 0) goto L1c
            r2 = r0
        L1c:
            if (r2 == 0) goto L83
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.s()
            if (r0 == 0) goto L83
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.E(r0)
            if (r0 != 0) goto L2b
            goto L83
        L2b:
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r5.getReturnType()
            if (r2 != 0) goto L32
            return r1
        L32:
            kotlin.reflect.jvm.internal.impl.name.f r3 = r5.getName()
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.util.t.e
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L83
            boolean r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.t(r2)
            if (r3 != 0) goto L4a
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.u(r2)
            if (r2 == 0) goto L83
        L4a:
            java.util.List r2 = r5.g()
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L83
            java.util.List r2 = r5.g()
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r4 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.E(r2)
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L83
            java.util.List r0 = r5.A0()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r5 = r5.f0()
            if (r5 != 0) goto L83
            return r3
        L83:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4, @org.jetbrains.annotations.NotNull t3.b r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "lookupLocation"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4.c()
            r1 = 0
            if (r0 == 0) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.name.c r0 = r4.d()
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = r3.M(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r4.f()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.g(r2, r5)
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 == 0) goto L36
            return r0
        L36:
            kotlin.reflect.jvm.internal.impl.name.c r0 = r4.d()
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = d(r3, r0, r5)
            if (r3 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r3.G()
            if (r3 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.f()
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.g(r4, r5)
            goto L50
        L4f:
            r3 = r1
        L50:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r4 == 0) goto L57
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
            return r3
        L57:
            return r1
    }
}

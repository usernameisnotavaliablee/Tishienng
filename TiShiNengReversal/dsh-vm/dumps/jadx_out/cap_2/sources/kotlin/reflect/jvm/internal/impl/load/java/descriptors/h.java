package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1563#2:66\n1634#2,3:67\n*S KotlinDebug\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n*L\n40#1:66\n40#1:67,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> a(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r14, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r16) {
            java.lang.String r1 = "newValueParameterTypes"
            kotlin.jvm.internal.g0.p(r14, r1)
            java.lang.String r1 = "oldValueParameters"
            kotlin.jvm.internal.g0.p(r15, r1)
            java.lang.String r1 = "newOwner"
            r3 = r16
            kotlin.jvm.internal.g0.p(r3, r1)
            r14.size()
            r15.size()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r0 = r15
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r14 = kotlin.collections.f0.o6(r14, r0)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r14, r1)
            r0.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L31:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r14.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            r8 = r2
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = (kotlin.reflect.jvm.internal.impl.types.t0) r8
            java.lang.Object r1 = r1.component2()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            int r5 = r1.getIndex()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6 = r1.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.f r7 = r1.getName()
            java.lang.String r4 = "getName(...)"
            kotlin.jvm.internal.g0.o(r7, r4)
            boolean r9 = r1.Q()
            boolean r10 = r1.w0()
            boolean r11 = r1.u0()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r1.z0()
            if (r4 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.s(r3)
            kotlin.reflect.jvm.internal.impl.builtins.j r4 = r4.p()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.k(r8)
        L7b:
            r12 = r4
            goto L7f
        L7d:
            r4 = 0
            goto L7b
        L7f:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r13 = r1.getSource()
            java.lang.String r1 = "getSource(...)"
            kotlin.jvm.internal.g0.o(r13, r1)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.add(r2)
            r3 = r16
            goto L31
        L92:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.x(r3)
            r0 = 0
            if (r3 != 0) goto Ld
            return r0
        Ld:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r3.r0()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0
            if (r2 == 0) goto L18
            r0 = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0 r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0) r0
        L18:
            if (r0 != 0) goto L1f
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0 r3 = b(r3)
            return r3
        L1f:
            return r0
    }
}

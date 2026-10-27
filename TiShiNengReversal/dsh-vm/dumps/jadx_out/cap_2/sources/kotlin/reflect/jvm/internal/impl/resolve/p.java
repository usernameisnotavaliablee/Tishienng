package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1634#2,3:85\n855#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {
    static /* synthetic */ kotlin.n1 a(kotlin.reflect.jvm.internal.impl.utils.k r0, java.lang.Object r1) {
            kotlin.n1 r0 = c(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <H> java.util.Collection<H> b(@org.jetbrains.annotations.NotNull java.util.Collection<? extends H> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "descriptorByHandle"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8.size()
            r1 = 1
            if (r0 > r1) goto L12
            return r8
        L12:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.impl.utils.k$b r8 = kotlin.reflect.jvm.internal.impl.utils.k.c
            kotlin.reflect.jvm.internal.impl.utils.k r8 = r8.a()
        L1d:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L90
            java.lang.Object r2 = kotlin.collections.f0.G2(r0)
            kotlin.reflect.jvm.internal.impl.utils.k$b r3 = kotlin.reflect.jvm.internal.impl.utils.k.c
            kotlin.reflect.jvm.internal.impl.utils.k r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.resolve.o r4 = new kotlin.reflect.jvm.internal.impl.resolve.o
            r4.<init>(r3)
            java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.p(r2, r0, r9, r4)
            java.lang.String r4 = "extractMembersOverridableInBothWays(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            int r4 = r2.size()
            if (r4 != r1) goto L56
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L56
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.f0.k5(r2)
            java.lang.String r3 = "single(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r8.add(r2)
            goto L1d
        L56:
            java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.L(r2, r9)
            java.lang.Object r5 = r9.invoke(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.a r5 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L66:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r2.next()
            kotlin.jvm.internal.g0.m(r6)
            java.lang.Object r7 = r9.invoke(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.a r7 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r7
            boolean r7 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.B(r5, r7)
            if (r7 != 0) goto L66
            r3.add(r6)
            goto L66
        L83:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L8c
            r8.addAll(r3)
        L8c:
            r8.add(r4)
            goto L1d
        L90:
            return r8
    }

    private static final kotlin.n1 c(kotlin.reflect.jvm.internal.impl.utils.k r0, java.lang.Object r1) {
            kotlin.jvm.internal.g0.m(r1)
            r0.add(r1)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }
}

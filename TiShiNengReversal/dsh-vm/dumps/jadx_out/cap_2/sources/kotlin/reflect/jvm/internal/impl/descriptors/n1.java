package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n16#2,2:101\n1563#3:103\n1634#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n1 {
    static /* synthetic */ boolean a(kotlin.reflect.jvm.internal.impl.descriptors.k r0) {
            boolean r0 = h(r0)
            return r0
    }

    static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.descriptors.k r0) {
            boolean r0 = i(r0)
            return r0
    }

    static /* synthetic */ kotlin.sequences.m c(kotlin.reflect.jvm.internal.impl.descriptors.k r0) {
            kotlin.sequences.m r0 = j(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.u0 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            if (r1 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r0
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r2 = e(r2, r0, r1)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.u0 e(kotlin.reflect.jvm.internal.impl.types.t0 r5, kotlin.reflect.jvm.internal.impl.descriptors.g r6, int r7) {
            r0 = 0
            if (r6 == 0) goto L5a
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r6)
            if (r1 == 0) goto La
            goto L5a
        La:
            java.util.List r1 = r6.t()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.k()
            if (r2 != 0) goto L3d
            java.util.List r2 = r5.G0()
            int r2 = r2.size()
            if (r1 == r2) goto L27
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.E(r6)
        L27:
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.u0
            java.util.List r2 = r5.G0()
            java.util.List r5 = r5.G0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L3d:
            java.util.List r2 = r5.G0()
            java.util.List r7 = r2.subList(r7, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.u0
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r6.b()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            if (r4 == 0) goto L52
            r0 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r0
        L52:
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r5 = e(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L5a:
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.b f(kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2, int r3) {
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = new kotlin.reflect.jvm.internal.impl.descriptors.b
            r0.<init>(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.g r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.List r0 = r7.t()
            java.lang.String r1 = "getDeclaredTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r2 = r7.k()
            if (r2 != 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r7.b()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r2 != 0) goto L1d
            return r0
        L1d:
            kotlin.sequences.m r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.u(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.k1 r3 = kotlin.reflect.jvm.internal.impl.descriptors.k1.a
            kotlin.sequences.m r2 = kotlin.sequences.p.F3(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.l1 r3 = kotlin.reflect.jvm.internal.impl.descriptors.l1.a
            kotlin.sequences.m r2 = kotlin.sequences.p.P0(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.m1 r3 = kotlin.reflect.jvm.internal.impl.descriptors.m1.a
            kotlin.sequences.m r2 = kotlin.sequences.p.k1(r2, r3)
            java.util.List r2 = kotlin.sequences.p.I3(r2)
            kotlin.sequences.m r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.u(r7)
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()
            boolean r6 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r6 == 0) goto L3f
            goto L50
        L4f:
            r4 = r5
        L50:
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            if (r4 == 0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r4.o()
            if (r3 == 0) goto L5e
            java.util.List r5 = r3.getParameters()
        L5e:
            if (r5 != 0) goto L64
            java.util.List r5 = kotlin.collections.f0.J()
        L64:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L78
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L78
            java.util.List r7 = r7.t()
            kotlin.jvm.internal.g0.o(r7, r1)
            return r7
        L78:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r1 = kotlin.collections.f0.I4(r2, r5)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L91:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
            kotlin.jvm.internal.g0.m(r3)
            int r4 = r0.size()
            kotlin.reflect.jvm.internal.impl.descriptors.b r3 = f(r3, r7, r4)
            r2.add(r3)
            goto L91
        Lac:
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r7 = kotlin.collections.f0.I4(r0, r2)
            return r7
    }

    private static final boolean h(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            return r1
    }

    private static final boolean i(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
            if (r1 != 0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private static final kotlin.sequences.m j(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r1
            java.util.List r1 = r1.getTypeParameters()
            java.lang.String r0 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.sequences.m r1 = kotlin.collections.f0.E1(r1)
            return r1
    }
}

package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStarProjectionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1563#2:102\n1634#2,3:103\n1563#2:106\n1634#2,3:107\n*S KotlinDebug\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n*L\n66#1:102\n66#1:103,3\n73#1:106\n73#1:107,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.types.x1 {
        final /* synthetic */ java.util.List<kotlin.reflect.jvm.internal.impl.types.w1> d;

        a(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.w1> r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.x1
        public kotlin.reflect.jvm.internal.impl.types.c2 k(kotlin.reflect.jvm.internal.impl.types.w1 r2) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<kotlin.reflect.jvm.internal.impl.types.w1> r0 = r1.d
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L1d
                kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
                java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor"
                kotlin.jvm.internal.g0.n(r2, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                kotlin.reflect.jvm.internal.impl.types.c2 r2 = kotlin.reflect.jvm.internal.impl.types.j2.s(r2)
                return r2
            L1d:
                r2 = 0
                return r2
        }
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 a(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.w1> r1, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r2, kotlin.reflect.jvm.internal.impl.builtins.j r3) {
            kotlin.reflect.jvm.internal.impl.types.m1$a r0 = new kotlin.reflect.jvm.internal.impl.types.m1$a
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.h2 r1 = kotlin.reflect.jvm.internal.impl.types.h2.g(r0)
            java.lang.Object r2 = kotlin.collections.f0.G2(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.p(r2, r0)
            if (r1 != 0) goto L20
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.z()
            java.lang.String r2 = "getDefaultBound(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
        L20:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r5.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            java.lang.String r2 = "getUpperBounds(...)"
            java.lang.String r3 = "getTypeConstructor(...)"
            r4 = 10
            if (r1 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r0
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.util.List r0 = r0.getParameters()
            java.lang.String r1 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r0, r4)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.o()
            kotlin.jvm.internal.g0.o(r4, r3)
            r1.add(r4)
            goto L36
        L4d:
            java.util.List r0 = r5.getUpperBounds()
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.builtins.j r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = a(r1, r0, r5)
            return r5
        L5d:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r1 == 0) goto La2
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            java.util.List r0 = r0.getTypeParameters()
            java.lang.String r1 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r0, r4)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.o()
            kotlin.jvm.internal.g0.o(r4, r3)
            r1.add(r4)
            goto L7b
        L92:
            java.util.List r0 = r5.getUpperBounds()
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.builtins.j r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = a(r1, r0, r5)
            return r5
        La2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported descriptor type to build star projection type based on type parameters of it"
            r5.<init>(r0)
            throw r5
    }
}

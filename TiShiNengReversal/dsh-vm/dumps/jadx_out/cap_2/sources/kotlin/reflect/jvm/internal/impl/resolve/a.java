package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSealedClassInheritorsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n183#2,2:87\n1056#3:89\n*S KotlinDebug\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n73#1:87,2\n82#1:89\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.resolve.s {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n1#1,328:1\n82#2:329\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.a$a, reason: collision with other inner class name */
    public static final class C0064a<T> implements java.util.Comparator {
        public C0064a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
                kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r1)
                java.lang.String r1 = r1.a()
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
                kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r2)
                java.lang.String r2 = r2.a()
                int r1 = kotlin.comparisons.a.l(r1, r2)
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.a r0 = new kotlin.reflect.jvm.internal.impl.resolve.a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.a.a = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void b(kotlin.reflect.jvm.internal.impl.descriptors.d r4, java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.d> r5, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6, boolean r7) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.t
            r1 = 2
            r2 = 0
            java.util.Collection r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.n.a.a(r6, r0, r2, r1, r2)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r1
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r3 = r1.q0()
            if (r3 == 0) goto L46
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r6.g(r1, r3)
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            goto L46
        L3a:
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r3 == 0) goto L45
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r1
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.m()
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 != 0) goto L49
            goto Lc
        L49:
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.i.z(r1, r4)
            if (r3 == 0) goto L52
            r5.add(r1)
        L52:
            if (r7 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.G()
            java.lang.String r3 = "getUnsubstitutedInnerClassesScope(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            b(r4, r5, r1, r7)
            goto Lc
        L61:
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = "sealedClass"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r5.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r0 == r1) goto L14
            java.util.List r5 = kotlin.collections.f0.J()
            java.util.Collection r5 = (java.util.Collection) r5
            return r5
        L14:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            if (r6 != 0) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r5.b()
            goto L3e
        L20:
            kotlin.sequences.m r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.u(r5)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3
            boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r3 == 0) goto L28
            goto L3b
        L3a:
            r2 = 0
        L3b:
            r1 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r1
        L3e:
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r2 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.r()
            b(r5, r0, r1, r6)
        L4b:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6 = r5.G()
            java.lang.String r1 = "getUnsubstitutedInnerClassesScope(...)"
            kotlin.jvm.internal.g0.o(r6, r1)
            r1 = 1
            b(r5, r0, r6, r1)
            kotlin.reflect.jvm.internal.impl.resolve.a$a r5 = new kotlin.reflect.jvm.internal.impl.resolve.a$a
            r5.<init>()
            java.util.List r5 = kotlin.collections.f0.z5(r0, r5)
            java.util.Collection r5 = (java.util.Collection) r5
            return r5
    }
}

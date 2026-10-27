package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nErasedOverridabilityCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,63:1\n1255#2,2:64\n*S KotlinDebug\n*F\n+ 1 ErasedOverridabilityCondition.kt\norg/jetbrains/kotlin/load/java/ErasedOverridabilityCondition\n*L\n44#1:64,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.load.java.p.a.a = r0
                return
        }
    }

    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 c(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = d(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r7) {
            r4 = this;
            java.lang.String r7 = "superDescriptor"
            kotlin.jvm.internal.g0.p(r5, r7)
            java.lang.String r7 = "subDescriptor"
            kotlin.jvm.internal.g0.p(r6, r7)
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e
            if (r7 == 0) goto Lf1
            r7 = r6
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r7 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) r7
            java.util.List r0 = r7.getTypeParameters()
            java.lang.String r1 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            goto Lf1
        L24:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.w(r5, r6)
            r2 = 0
            if (r0 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = r0.c()
            goto L31
        L30:
            r0 = r2
        L31:
            if (r0 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r5
        L36:
            java.util.List r0 = r7.g()
            java.lang.String r3 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlin.reflect.jvm.internal.impl.load.java.o r3 = kotlin.reflect.jvm.internal.impl.load.java.o.a
            kotlin.sequences.m r0 = kotlin.sequences.p.N1(r0, r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r7.getReturnType()
            kotlin.jvm.internal.g0.m(r3)
            kotlin.sequences.m r0 = kotlin.sequences.p.S2(r0, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r7 = r7.f0()
            if (r7 == 0) goto L61
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r7.getType()
            goto L62
        L61:
            r7 = r2
        L62:
            java.util.List r7 = kotlin.collections.f0.R(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.sequences.m r7 = kotlin.sequences.p.R2(r0, r7)
            java.util.Iterator r7 = r7.iterator()
        L70:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            java.util.List r3 = r0.G0()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L70
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r0.L0()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            if (r0 != 0) goto L70
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r5
        L93:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h r7 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h
            r0 = 1
            r7.<init>(r2, r0, r2)
            kotlin.reflect.jvm.internal.impl.types.h2 r7 = r7.c()
            kotlin.reflect.jvm.internal.impl.descriptors.l r5 = r5.c(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.a r5 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r5
            if (r5 != 0) goto La8
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r5
        La8:
            boolean r7 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r7 == 0) goto Ld1
            r7 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r7
            java.util.List r2 = r7.getTypeParameters()
            kotlin.jvm.internal.g0.o(r2, r1)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto Ld1
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r5 = r7.n()
            java.util.List r7 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r5 = r5.k(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = r5.build()
            kotlin.jvm.internal.g0.m(r5)
        Ld1:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r7 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f
            r1 = 0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r5 = r7.F(r5, r6, r1)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = r5.c()
            java.lang.String r6 = "getResult(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            int[] r6 = kotlin.reflect.jvm.internal.impl.load.java.p.a.a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 != r0) goto Lee
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE
            return r5
        Lee:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r5
        Lf1:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r5
    }
}

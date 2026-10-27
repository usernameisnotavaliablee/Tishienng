package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.y.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.y r6) {
                r5 = this;
                java.util.List r0 = r6.g()
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 == r2) goto Ld
                return r1
            Ld:
                kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r6.b()
                boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                r4 = 0
                if (r3 == 0) goto L19
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
                goto L1a
            L19:
                r0 = r4
            L1a:
                if (r0 != 0) goto L1d
                return r1
            L1d:
                java.util.List r6 = r6.g()
                java.lang.String r3 = "getValueParameters(...)"
                kotlin.jvm.internal.g0.o(r6, r3)
                java.lang.Object r6 = kotlin.collections.f0.m5(r6)
                kotlin.reflect.jvm.internal.impl.descriptors.q1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r6
                kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
                kotlin.reflect.jvm.internal.impl.types.w1 r6 = r6.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.c()
                boolean r3 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r3 == 0) goto L3f
                r4 = r6
                kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            L3f:
                if (r4 != 0) goto L42
                return r1
            L42:
                boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.j.s0(r0)
                if (r6 == 0) goto L57
                kotlin.reflect.jvm.internal.impl.name.c r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r0)
                kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r4)
                boolean r6 = kotlin.jvm.internal.g0.g(r6, r0)
                if (r6 == 0) goto L57
                return r2
            L57:
                return r1
        }

        private final kotlin.reflect.jvm.internal.impl.load.kotlin.s c(kotlin.reflect.jvm.internal.impl.descriptors.y r3, kotlin.reflect.jvm.internal.impl.descriptors.q1 r4) {
                r2 = this;
                boolean r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.e(r3)
                java.lang.String r1 = "getType(...)"
                if (r0 != 0) goto L1b
                boolean r3 = r2.b(r3)
                if (r3 == 0) goto Lf
                goto L1b
            Lf:
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = r4.getType()
                kotlin.jvm.internal.g0.o(r3, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.s r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.g(r3)
                return r3
            L1b:
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = r4.getType()
                kotlin.jvm.internal.g0.o(r3, r1)
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.C(r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.s r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.g(r3)
                return r3
        }

        public final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r7) {
                r5 = this;
                java.lang.String r0 = "superDescriptor"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "subDescriptor"
                kotlin.jvm.internal.g0.p(r7, r0)
                boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e
                r1 = 0
                if (r0 == 0) goto L7c
                boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
                if (r0 != 0) goto L14
                goto L7c
            L14:
                r0 = r7
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) r0
                java.util.List r2 = r0.g()
                r2.size()
                kotlin.reflect.jvm.internal.impl.descriptors.y r6 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r6
                java.util.List r2 = r6.g()
                r2.size()
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r0.h1()
                java.util.List r0 = r0.g()
                java.lang.String r2 = "getValueParameters(...)"
                kotlin.jvm.internal.g0.o(r0, r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.descriptors.y r3 = r6.a()
                java.util.List r3 = r3.g()
                kotlin.jvm.internal.g0.o(r3, r2)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.List r0 = kotlin.collections.f0.o6(r0, r3)
                java.util.Iterator r0 = r0.iterator()
            L4b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L7c
                java.lang.Object r2 = r0.next()
                kotlin.Pair r2 = (kotlin.Pair) r2
                java.lang.Object r3 = r2.component1()
                kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
                java.lang.Object r2 = r2.component2()
                kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
                r4 = r7
                kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
                kotlin.jvm.internal.g0.m(r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.s r3 = r5.c(r4, r3)
                boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.s.d
                kotlin.jvm.internal.g0.m(r2)
                kotlin.reflect.jvm.internal.impl.load.kotlin.s r2 = r5.c(r6, r2)
                boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.s.d
                if (r3 == r2) goto L4b
                r6 = 1
                return r6
            L7c:
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.y$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.y$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.y.a = r0
            return
    }

    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a r8, kotlin.reflect.jvm.internal.impl.descriptors.a r9, kotlin.reflect.jvm.internal.impl.descriptors.d r10) {
            r7 = this;
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            r1 = 0
            if (r0 == 0) goto L9e
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto L9e
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r9)
            if (r0 == 0) goto L11
            goto L9e
        L11:
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            kotlin.reflect.jvm.internal.impl.descriptors.y r9 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r9
            kotlin.reflect.jvm.internal.impl.name.f r2 = r9.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r0 = r0.n(r2)
            if (r0 != 0) goto L34
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            kotlin.reflect.jvm.internal.impl.name.f r2 = r9.getName()
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r0 = r0.k(r2)
            if (r0 != 0) goto L34
            return r1
        L34:
            r0 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.load.java.r0.j(r0)
            boolean r2 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            r3 = 0
            if (r2 == 0) goto L44
            r4 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            goto L45
        L44:
            r4 = r3
        L45:
            r5 = 1
            if (r4 == 0) goto L54
            boolean r6 = r9.D0()
            boolean r4 = r4.D0()
            if (r6 != r4) goto L54
            r4 = 1
            goto L55
        L54:
            r4 = 0
        L55:
            if (r4 != 0) goto L60
            if (r0 == 0) goto L5f
            boolean r4 = r9.D0()
            if (r4 != 0) goto L60
        L5f:
            return r5
        L60:
            boolean r4 = r10 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c
            if (r4 == 0) goto L9e
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = r9.x0()
            if (r4 == 0) goto L6b
            goto L9e
        L6b:
            if (r0 == 0) goto L9e
            boolean r10 = kotlin.reflect.jvm.internal.impl.load.java.r0.l(r10, r0)
            if (r10 == 0) goto L74
            goto L9e
        L74:
            boolean r10 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r10 == 0) goto L9d
            if (r2 == 0) goto L9d
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            kotlin.reflect.jvm.internal.impl.descriptors.y r10 = kotlin.reflect.jvm.internal.impl.load.java.h.l(r0)
            if (r10 == 0) goto L9d
            r10 = 2
            java.lang.String r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r9, r1, r1, r10, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y r8 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r8
            kotlin.reflect.jvm.internal.impl.descriptors.y r8 = r8.a()
            java.lang.String r0 = "getOriginal(...)"
            kotlin.jvm.internal.g0.o(r8, r0)
            java.lang.String r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r8, r1, r1, r10, r3)
            boolean r8 = kotlin.jvm.internal.g0.g(r9, r8)
            if (r8 == 0) goto L9d
            return r1
        L9d:
            return r5
        L9e:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r4) {
            r1 = this;
            java.lang.String r0 = "superDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "subDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r4 = r1.c(r2, r3, r4)
            if (r4 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r2
        L13:
            kotlin.reflect.jvm.internal.impl.load.java.y$a r4 = kotlin.reflect.jvm.internal.impl.load.java.y.a
            boolean r2 = r4.a(r2, r3)
            if (r2 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r2
        L1e:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r2
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o1 {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.a.a = r0
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.v
            java.lang.String r2 = "ENHANCED_NULLABILITY_ANNOTATION"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.a = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.load.java.i0.w
            java.lang.String r2 = "ENHANCED_MUTABILITY_ANNOTATION"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.b = r0
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(java.util.List r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = e(r0)
            return r0
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f b(kotlin.reflect.jvm.internal.impl.descriptors.f r0, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = f(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f c() {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.b
            return r0
    }

    public static final /* synthetic */ java.lang.Boolean d(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r1) {
            java.lang.Boolean r0 = h(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.n r0 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            r0.<init>(r2)
            return r0
        L15:
            java.lang.Object r2 = kotlin.collections.f0.m5(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) r2
            return r2
        L1c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "At least one Annotations object expected"
            r2.<init>(r0)
            throw r2
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.f f(kotlin.reflect.jvm.internal.impl.descriptors.f r4, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r5, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a
            boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m1.a(r6)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 != 0) goto Lf
            return r2
        Lf:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = r5.e()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            if (r1 != r3) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            if (r6 != r1) goto L29
            r1 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r3 = r0.c(r1)
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r0.a(r1)
            return r4
        L29:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = r5.e()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
            if (r5 != r1) goto L42
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            if (r6 != r5) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            boolean r5 = r0.d(r4)
            if (r5 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r0.b(r4)
            return r4
        L42:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.a
            return r0
    }

    private static final java.lang.Boolean h(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r2) {
            boolean r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m1.a(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r1.f()
            if (r1 != 0) goto L10
            r1 = -1
            goto L18
        L10:
            int[] r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.a.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
        L18:
            r2 = 1
            if (r1 == r2) goto L22
            r2 = 2
            if (r1 == r2) goto L1f
            return r0
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L22:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
    }

    public static final boolean i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.u r0 = kotlin.reflect.jvm.internal.impl.types.checker.u.a
            boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.p1.c(r0, r1)
            return r1
    }
}

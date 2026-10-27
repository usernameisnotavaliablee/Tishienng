package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.types.h0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility[] r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f.a.a = r0
                return
        }
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.c2 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.b2 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r5) {
            r1 = this;
            java.lang.String r0 = "parameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeAttr"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeParameterUpperBoundEraser"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "erasedUpperBound"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a
            if (r0 != 0) goto L1d
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = super.a(r2, r3, r4, r5)
            return r2
        L1d:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a) r3
            boolean r4 = r3.i()
            if (r4 == 0) goto L26
            goto L2c
        L26:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r3 = r3.l(r4)
        L2c:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r4 = r3.g()
            int[] r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f.a.a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L87
            r0 = 2
            if (r4 == r0) goto L48
            r0 = 3
            if (r4 != r0) goto L42
            goto L48
        L42:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L48:
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r2.l()
            boolean r4 = r4.getAllowsOutPosition()
            if (r4 != 0) goto L62
            kotlin.reflect.jvm.internal.impl.types.e2 r3 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.I()
            r3.<init>(r4, r2)
            return r3
        L62:
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r5.I0()
            java.util.List r4 = r4.getParameters()
            java.lang.String r0 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L7f
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            r2.<init>(r3, r5)
            return r2
        L7f:
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = kotlin.reflect.jvm.internal.impl.types.j2.t(r2, r3)
            kotlin.jvm.internal.g0.m(r2)
            return r2
        L87:
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            r2.<init>(r3, r5)
            return r2
    }
}

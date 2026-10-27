package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class u {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.u.a.a = r0
                return
        }
    }

    public u() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.s<T> a(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.m0 r0 = new kotlin.m0
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.s<T> b(@org.jetbrains.annotations.NotNull kotlin.LazyThreadSafetyMode r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r3, r0)
            int[] r0 = kotlin.u.a.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 2
            if (r2 == r0) goto L2d
            if (r2 == r1) goto L27
            r0 = 3
            if (r2 != r0) goto L21
            kotlin.UnsafeLazyImpl r2 = new kotlin.UnsafeLazyImpl
            r2.<init>(r3)
            return r2
        L21:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L27:
            kotlin.h0 r2 = new kotlin.h0
            r2.<init>(r3)
            return r2
        L2d:
            kotlin.m0 r2 = new kotlin.m0
            r0 = 0
            r2.<init>(r3, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.s<T> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.m0 r0 = new kotlin.m0
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2, r1)
            return r0
    }
}

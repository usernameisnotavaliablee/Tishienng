package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,103:1\n1#2:104\n19#3:105\n*S KotlinDebug\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n*L\n80#1:105\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class JvmBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.j {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] l = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind i;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a> j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Kind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind FALLBACK = null;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind FROM_CLASS_LOADER = null;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind FROM_DEPENDENCIES = null;

        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[] $values() {
                r0 = 3
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind[] r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[r0]
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_CLASS_LOADER
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FALLBACK
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind
                java.lang.String r1 = "FROM_DEPENDENCIES"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES = r0
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind
                java.lang.String r1 = "FROM_CLASS_LOADER"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_CLASS_LOADER = r0
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind
                java.lang.String r1 = "FALLBACK"
                r2 = 2
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FALLBACK = r0
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind[] r0 = $values()
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.$ENTRIES = r0
                return
        }

        Kind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind> r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[] values() {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind[] r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind[] r0 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.descriptors.f0 a;
        private final boolean b;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "ownerModuleDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.f0 a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.a
                return r0
        }

        public final boolean b() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind[] r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_CLASS_LOADER     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FALLBACK     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.b.a = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns> r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.class
            java.lang.String r2 = "customizer"
            java.lang.String r3 = "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.l = r1
            return
    }

    public JvmBuiltIns(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.i = r3
            kotlin.reflect.jvm.internal.impl.builtins.jvm.h r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.h
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r0)
            r1.k = r2
            int[] r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.b.a
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L39
            r0 = 2
            if (r2 == r0) goto L35
            r0 = 3
            if (r2 != r0) goto L2f
            r1.f(r3)
            return
        L2f:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L35:
            r2 = 0
            r1.f(r2)
        L39:
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.t G0(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r0, kotlin.reflect.jvm.internal.impl.storage.n r1) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r0 = J0(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a H0(kotlin.reflect.jvm.internal.impl.descriptors.f0 r0, boolean r1) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = O0(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a I0(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r0) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = K0(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.jvm.t J0(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r3, kotlin.reflect.jvm.internal.impl.storage.n r4) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.t
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r1 = r3.s()
            java.lang.String r2 = "getBuiltInsModule(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.j r2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.j
            r2.<init>(r3)
            r0.<init>(r1, r4, r2)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a K0(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r2) {
            kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a> r0 = r2.j
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a) r0
            r1 = 0
            r2.j = r1
            return r0
        Le:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = "JvmBuiltins instance has not been initialized properly"
            r2.<init>(r0)
            throw r2
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a O0(kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, boolean r2) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.util.List<q3.b> L0() {
            r8 = this;
            java.lang.Iterable r0 = super.w()
            java.lang.String r1 = "getClassDescriptorFactories(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.g r2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.g
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r8.V()
            java.lang.String r1 = "getStorageManager(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r4 = r8.s()
            java.lang.String r1 = "getBuiltInsModule(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            r6 = 4
            r7 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r0 = kotlin.collections.f0.F4(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.builtins.jvm.t M0() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.k
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.l
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r0 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.t) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.j
    @org.jetbrains.annotations.NotNull
    protected q3.c N() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r0 = r1.M0()
            return r0
    }

    public final void N0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "moduleDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.i r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.i
            r0.<init>(r2, r3)
            r1.P0(r0)
            return
    }

    public final void P0(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.a> r2) {
            r1 = this;
            java.lang.String r0 = "computation"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.j = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.j
    @org.jetbrains.annotations.NotNull
    protected q3.a g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r0 = r1.M0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.j
    public /* bridge */ /* synthetic */ java.lang.Iterable w() {
            r1 = this;
            java.util.List r0 = r1.L0()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }
}

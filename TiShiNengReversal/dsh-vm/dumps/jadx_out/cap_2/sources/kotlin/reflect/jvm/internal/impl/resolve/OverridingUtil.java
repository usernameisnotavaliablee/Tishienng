package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class OverridingUtil {
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition> e = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil f = null;
    private static final kotlin.reflect.jvm.internal.impl.types.checker.e.a g = null;
    static final /* synthetic */ boolean h = false;
    private final kotlin.reflect.jvm.internal.impl.types.checker.g a;
    private final kotlin.reflect.jvm.internal.impl.types.checker.f b;
    private final kotlin.reflect.jvm.internal.impl.types.checker.e.a c;
    private final kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class OverrideCompatibilityInfo {
        private static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo c = null;
        private final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result a;
        private final java.lang.String b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public enum Result extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result> {
            private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[] $VALUES = null;
            public static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result CONFLICT = null;
            public static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result INCOMPATIBLE = null;
            public static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result OVERRIDABLE = null;

            static {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result
                    java.lang.String r1 = "OVERRIDABLE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE = r0
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result
                    java.lang.String r3 = "INCOMPATIBLE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE = r1
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r3 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result
                    java.lang.String r5 = "CONFLICT"
                    r6 = 2
                    r3.<init>(r5, r6)
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT = r3
                    r5 = 3
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r5 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.$VALUES = r5
                    return
            }

            Result(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result valueOf(java.lang.String r1) {
                    java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result> r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = (kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result) r1
                    return r1
            }

            public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[] values() {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.$VALUES
                    java.lang.Object r0 = r0.clone()
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r0 = (kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[]) r0
                    return r0
            }
        }

        static {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
                java.lang.String r2 = "SUCCESS"
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.c = r0
                return
        }

        public OverrideCompatibilityInfo(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 3
                a(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 4
                a(r0)
            Lc:
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        private static /* synthetic */ void a(int r10) {
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                if (r2 != 0) goto L6
                r0 = 2
                a(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT
                r0.<init>(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                if (r2 != 0) goto L6
                r0 = 1
                a(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE
                r0.<init>(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo e() {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.c
                if (r0 != 0) goto L8
                r1 = 0
                a(r1)
            L8:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result c() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = r2.a
                if (r0 != 0) goto L8
                r1 = 5
                a(r1)
            L8:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.types.checker.e.a {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void b(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "a"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "b"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "equals"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e.a
        public boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r3) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                b(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                b(r0)
            Lc:
                boolean r2 = r2.equals(r3)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<D> implements kotlin.jvm.functions.Function2<D, D, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        public kotlin.Pair a(kotlin.reflect.jvm.internal.impl.descriptors.a r2, kotlin.reflect.jvm.internal.impl.descriptors.a r3) {
                r1 = this;
                kotlin.Pair r0 = new kotlin.Pair
                r0.<init>(r2, r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.a r1 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r1
                kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
                kotlin.Pair r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a;

        c(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.b()
                kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r1.a
                if (r2 != r0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                return r1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d a;

        e(kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r3.getVisibility()
                boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.g(r0)
                r1 = 0
                if (r0 != 0) goto L14
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a
                boolean r3 = kotlin.reflect.jvm.internal.impl.descriptors.r.h(r3, r0, r1)
                if (r3 == 0) goto L14
                r1 = 1
            L14:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        f() {
                r0 = this;
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.a a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                return r1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.n1> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.m a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor b;

        g(kotlin.reflect.jvm.internal.impl.resolve.m r1, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public kotlin.n1 a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.resolve.m r0 = r2.a
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r2.b
                r0.b(r1, r3)
                kotlin.n1 r3 = kotlin.n1.a
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                kotlin.n1 r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class h {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;
        static final /* synthetic */ int[] c = null;

        static {
                kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.c = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.c     // Catch: java.lang.NoSuchFieldError -> L1d
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.c     // Catch: java.lang.NoSuchFieldError -> L28
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.c     // Catch: java.lang.NoSuchFieldError -> L33
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT     // Catch: java.lang.NoSuchFieldError -> L33
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.b = r3
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.b     // Catch: java.lang.NoSuchFieldError -> L4e
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.b     // Catch: java.lang.NoSuchFieldError -> L58
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE     // Catch: java.lang.NoSuchFieldError -> L58
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r3 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.a = r3
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE     // Catch: java.lang.NoSuchFieldError -> L69
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L69
            L69:
                int[] r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.a     // Catch: java.lang.NoSuchFieldError -> L73
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r3 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE     // Catch: java.lang.NoSuchFieldError -> L73
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L73
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L73
            L73:
                int[] r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.a     // Catch: java.lang.NoSuchFieldError -> L7d
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L7d:
                return
        }
    }

    static {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition> r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e = r0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.g = r0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r1 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil
            kotlin.reflect.jvm.internal.impl.types.checker.g$a r2 = kotlin.reflect.jvm.internal.impl.types.checker.g.a.a
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r3 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
            r4 = 0
            r1.<init>(r0, r2, r3, r4)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f = r1
            return
    }

    private OverridingUtil(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.e.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.f r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> r5) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 5
            a(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 6
            a(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 7
            a(r0)
        L12:
            r1.<init>()
            r1.c = r2
            r1.a = r3
            r1.b = r4
            r1.d = r5
            return
    }

    private static boolean A(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.v0 r0, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.v0 r1) {
            if (r0 == 0) goto La
            if (r1 != 0) goto L5
            goto La
        L5:
            boolean r0 = H(r0, r1)
            return r0
        La:
            r0 = 1
            return r0
    }

    public static boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r9) {
            if (r8 != 0) goto L7
            r0 = 65
            a(r0)
        L7:
            if (r9 != 0) goto Le
            r0 = 66
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r8.getReturnType()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r9.getReturnType()
            boolean r2 = H(r8, r9)
            r3 = 0
            if (r2 != 0) goto L1e
            return r3
        L1e:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f
            java.util.List r4 = r8.getTypeParameters()
            java.util.List r5 = r9.getTypeParameters()
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2 = r2.l(r4, r5)
            boolean r4 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r4 == 0) goto L35
            boolean r8 = G(r8, r0, r9, r1, r2)
            return r8
        L35:
            boolean r4 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r4 == 0) goto L7e
            r4 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r4
            r5 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r5
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = r4.getSetter()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r7 = r5.getSetter()
            boolean r6 = A(r6, r7)
            if (r6 != 0) goto L4e
            return r3
        L4e:
            boolean r6 = r4.C()
            if (r6 == 0) goto L69
            boolean r6 = r5.C()
            if (r6 == 0) goto L69
            kotlin.reflect.jvm.internal.impl.types.h r8 = kotlin.reflect.jvm.internal.impl.types.h.a
            kotlin.reflect.jvm.internal.impl.types.m2 r9 = r0.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r1.L0()
            boolean r8 = r8.m(r2, r9, r0)
            return r8
        L69:
            boolean r4 = r4.C()
            if (r4 != 0) goto L75
            boolean r4 = r5.C()
            if (r4 != 0) goto L7d
        L75:
            boolean r8 = G(r8, r0, r9, r1, r2)
            if (r8 == 0) goto L7d
            r8 = 1
            return r8
        L7d:
            return r3
        L7e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected callable: "
            r0.append(r1)
            java.lang.Class r8 = r8.getClass()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }

    private static boolean C(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r1, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> r2) {
            if (r1 != 0) goto L7
            r0 = 69
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 70
            a(r0)
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r0
            boolean r0 = B(r1, r0)
            if (r0 != 0) goto L12
            r1 = 0
            return r1
        L26:
            r1 = 1
            return r1
    }

    private static boolean G(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r0, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r4) {
            if (r0 != 0) goto L7
            r0 = 71
            a(r0)
        L7:
            if (r1 != 0) goto Le
            r0 = 72
            a(r0)
        Le:
            if (r2 != 0) goto L15
            r0 = 73
            a(r0)
        L15:
            if (r3 != 0) goto L1c
            r0 = 74
            a(r0)
        L1c:
            if (r4 != 0) goto L23
            r0 = 75
            a(r0)
        L23:
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r3.L0()
            boolean r0 = r0.t(r4, r1, r2)
            return r0
    }

    private static boolean H(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2) {
            if (r1 != 0) goto L7
            r0 = 67
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 68
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r1.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r2.getVisibility()
            java.lang.Integer r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.d(r1, r2)
            if (r1 == 0) goto L25
            int r1 = r1.intValue()
            if (r1 < 0) goto L23
            goto L25
        L23:
            r1 = 0
            return r1
        L25:
            r1 = 1
            return r1
    }

    public static boolean I(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.c0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.c0 r2, boolean r3) {
            if (r1 != 0) goto L7
            r0 = 55
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 56
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r2.getVisibility()
            boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.g(r0)
            if (r0 != 0) goto L20
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.h(r2, r1, r3)
            if (r1 == 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean J(@org.jetbrains.annotations.NotNull D r4, @org.jetbrains.annotations.NotNull D r5, boolean r6, boolean r7) {
            if (r4 != 0) goto L7
            r0 = 13
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 14
            a(r0)
        Le:
            boolean r0 = r4.equals(r5)
            r1 = 1
            if (r0 != 0) goto L26
            kotlin.reflect.jvm.internal.impl.resolve.g r0 = kotlin.reflect.jvm.internal.impl.resolve.g.a
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = r4.a()
            kotlin.reflect.jvm.internal.impl.descriptors.a r3 = r5.a()
            boolean r0 = r0.k(r2, r3, r6, r7)
            if (r0 == 0) goto L26
            return r1
        L26:
            kotlin.reflect.jvm.internal.impl.descriptors.a r5 = r5.a()
            java.util.Set r4 = kotlin.reflect.jvm.internal.impl.resolve.i.d(r4)
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r0
            kotlin.reflect.jvm.internal.impl.resolve.g r2 = kotlin.reflect.jvm.internal.impl.resolve.g.a
            boolean r0 = r2.k(r5, r0, r6, r7)
            if (r0 == 0) goto L32
            return r1
        L47:
            r4 = 0
            return r4
    }

    public static void K(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.n1> r5) {
            if (r4 != 0) goto L7
            r0 = 105(0x69, float:1.47E-43)
            a(r0)
        L7:
            java.util.Collection r0 = r4.e()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r1.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = kotlin.reflect.jvm.internal.impl.descriptors.r.g
            if (r2 != r3) goto Lf
            K(r1, r5)
            goto Lf
        L27:
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.g
            if (r0 == r1) goto L30
            goto L85
        L30:
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = h(r4)
            if (r0 != 0) goto L3e
            if (r5 == 0) goto L3b
            r5.invoke(r4)
        L3b:
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            goto L3f
        L3e:
            r1 = r0
        L3f:
            boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.k0
            if (r2 == 0) goto L68
            r2 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) r2
            r2.Y0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r4
            java.util.List r4 = r4.x()
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.v0) r1
            if (r0 != 0) goto L63
            r2 = 0
            goto L64
        L63:
            r2 = r5
        L64:
            K(r1, r2)
            goto L53
        L68:
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.s
            if (r5 == 0) goto L72
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s r4 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.s) r4
            r4.e1(r1)
            return
        L72:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.j0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.j0) r4
            r4.J0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r5 = r4.h0()
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = r5.getVisibility()
            if (r1 == r5) goto L85
            r5 = 0
            r4.H0(r5)
        L85:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static <H> H L(@org.jetbrains.annotations.NotNull java.util.Collection<H> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.a> r9) {
            if (r8 != 0) goto L7
            r0 = 76
            a(r0)
        L7:
            if (r9 != 0) goto Le
            r0 = 77
            a(r0)
        Le:
            int r0 = r8.size()
            r1 = 1
            if (r0 != r1) goto L21
            java.lang.Object r8 = kotlin.collections.f0.E2(r8)
            if (r8 != 0) goto L20
            r9 = 78
            a(r9)
        L20:
            return r8
        L21:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 2
            r0.<init>(r2)
            java.util.List r2 = kotlin.collections.f0.C3(r8, r9)
            java.lang.Object r3 = kotlin.collections.f0.E2(r8)
            java.lang.Object r4 = r9.invoke(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.a r4 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r4
            java.util.Iterator r8 = r8.iterator()
        L39:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r8.next()
            java.lang.Object r6 = r9.invoke(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.a r6 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r6
            boolean r7 = C(r6, r2)
            if (r7 == 0) goto L52
            r0.add(r5)
        L52:
            boolean r7 = B(r6, r4)
            if (r7 == 0) goto L39
            boolean r6 = B(r4, r6)
            if (r6 != 0) goto L39
            r3 = r5
            goto L39
        L60:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L6e
            if (r3 != 0) goto L6d
            r8 = 79
            a(r8)
        L6d:
            return r3
        L6e:
            int r8 = r0.size()
            if (r8 != r1) goto L80
            java.lang.Object r8 = kotlin.collections.f0.E2(r0)
            if (r8 != 0) goto L7f
            r9 = 80
            a(r9)
        L7f:
            return r8
        L80:
            java.util.Iterator r8 = r0.iterator()
        L84:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r8.next()
            java.lang.Object r2 = r9.invoke(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getReturnType()
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.n0.b(r2)
            if (r2 != 0) goto L84
            goto La0
        L9f:
            r1 = 0
        La0:
            if (r1 == 0) goto La3
            return r1
        La3:
            java.lang.Object r8 = kotlin.collections.f0.E2(r0)
            if (r8 != 0) goto Lae
            r9 = 82
            a(r9)
        Lae:
            return r8
    }

    private static /* synthetic */ void a(int r24) {
            r0 = r24
            r1 = 43
            r2 = 42
            r3 = 101(0x65, float:1.42E-43)
            r4 = 96
            r5 = 93
            r6 = 21
            r7 = 16
            r8 = 12
            r9 = 11
            if (r0 == r9) goto L35
            if (r0 == r8) goto L35
            if (r0 == r7) goto L35
            if (r0 == r6) goto L35
            if (r0 == r5) goto L35
            if (r0 == r4) goto L35
            if (r0 == r3) goto L35
            if (r0 == r2) goto L35
            if (r0 == r1) goto L35
            switch(r0) {
                case 24: goto L35;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L35;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L35;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L35;
                default: goto L2c;
            }
        L2c:
            switch(r0) {
                case 78: goto L35;
                case 79: goto L35;
                case 80: goto L35;
                case 81: goto L35;
                case 82: goto L35;
                default: goto L2f;
            }
        L2f:
            switch(r0) {
                case 88: goto L35;
                case 89: goto L35;
                case 90: goto L35;
                default: goto L32;
            }
        L32:
            java.lang.String r10 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L37
        L35:
            java.lang.String r10 = "@NotNull method %s.%s must not return null"
        L37:
            r11 = 2
            if (r0 == r9) goto L58
            if (r0 == r8) goto L58
            if (r0 == r7) goto L58
            if (r0 == r6) goto L58
            if (r0 == r5) goto L58
            if (r0 == r4) goto L58
            if (r0 == r3) goto L58
            if (r0 == r2) goto L58
            if (r0 == r1) goto L58
            switch(r0) {
                case 24: goto L58;
                case 25: goto L58;
                case 26: goto L58;
                case 27: goto L58;
                default: goto L4d;
            }
        L4d:
            switch(r0) {
                case 30: goto L58;
                case 31: goto L58;
                case 32: goto L58;
                case 33: goto L58;
                case 34: goto L58;
                case 35: goto L58;
                case 36: goto L58;
                case 37: goto L58;
                default: goto L50;
            }
        L50:
            switch(r0) {
                case 78: goto L58;
                case 79: goto L58;
                case 80: goto L58;
                case 81: goto L58;
                case 82: goto L58;
                default: goto L53;
            }
        L53:
            switch(r0) {
                case 88: goto L58;
                case 89: goto L58;
                case 90: goto L58;
                default: goto L56;
            }
        L56:
            r12 = 3
            goto L59
        L58:
            r12 = 2
        L59:
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r13 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil"
            r14 = 0
            switch(r0) {
                case 1: goto L155;
                case 2: goto L150;
                case 3: goto L61;
                case 4: goto L14b;
                case 5: goto L146;
                case 6: goto L61;
                case 7: goto L155;
                case 8: goto L141;
                case 9: goto L141;
                case 10: goto L13c;
                case 11: goto L139;
                case 12: goto L139;
                case 13: goto L134;
                case 14: goto L12f;
                case 15: goto L12a;
                case 16: goto L139;
                case 17: goto L12a;
                case 18: goto L125;
                case 19: goto L120;
                case 20: goto L11b;
                case 21: goto L139;
                case 22: goto L120;
                case 23: goto L11b;
                case 24: goto L139;
                case 25: goto L139;
                case 26: goto L139;
                case 27: goto L139;
                case 28: goto L120;
                case 29: goto L11b;
                case 30: goto L139;
                case 31: goto L139;
                case 32: goto L139;
                case 33: goto L139;
                case 34: goto L139;
                case 35: goto L139;
                case 36: goto L139;
                case 37: goto L139;
                case 38: goto L120;
                case 39: goto L11b;
                case 40: goto L116;
                case 41: goto L111;
                case 42: goto L139;
                case 43: goto L139;
                case 44: goto L10c;
                case 45: goto L107;
                case 46: goto L102;
                case 47: goto Lfd;
                case 48: goto Lf7;
                case 49: goto L102;
                case 50: goto Lf1;
                case 51: goto Leb;
                case 52: goto Le5;
                case 53: goto Ldf;
                case 54: goto Ld9;
                case 55: goto Ld3;
                case 56: goto Lcd;
                case 57: goto Lc7;
                case 58: goto Lc1;
                case 59: goto Ldf;
                case 60: goto Ld9;
                case 61: goto Lbb;
                case 62: goto Ldf;
                case 63: goto Lbb;
                case 64: goto Ld9;
                case 65: goto Lb5;
                case 66: goto Laf;
                case 67: goto Lb5;
                case 68: goto Laf;
                case 69: goto La9;
                case 70: goto La3;
                case 71: goto Lb5;
                case 72: goto L9d;
                case 73: goto Laf;
                case 74: goto L97;
                case 75: goto L102;
                case 76: goto L91;
                case 77: goto L8b;
                case 78: goto L139;
                case 79: goto L139;
                case 80: goto L139;
                case 81: goto L139;
                case 82: goto L139;
                case 83: goto L91;
                case 84: goto Ldf;
                case 85: goto Ld9;
                case 86: goto La3;
                case 87: goto Ldf;
                case 88: goto L139;
                case 89: goto L139;
                case 90: goto L139;
                case 91: goto La3;
                case 92: goto L85;
                case 93: goto L139;
                case 94: goto Ldf;
                case 95: goto L7f;
                case 96: goto L139;
                case 97: goto L79;
                case 98: goto L73;
                case 99: goto L8b;
                case 100: goto L6d;
                case 101: goto L139;
                case 102: goto L79;
                case 103: goto L73;
                case 104: goto Ld9;
                case 105: goto L67;
                case 106: goto L67;
                case 107: goto La3;
                default: goto L61;
            }
        L61:
            java.lang.String r15 = "kotlinTypeRefiner"
            r12[r14] = r15
            goto L159
        L67:
            java.lang.String r15 = "memberDescriptor"
            r12[r14] = r15
            goto L159
        L6d:
            java.lang.String r15 = "onConflict"
            r12[r14] = r15
            goto L159
        L73:
            java.lang.String r15 = "extractFrom"
            r12[r14] = r15
            goto L159
        L79:
            java.lang.String r15 = "overrider"
            r12[r14] = r15
            goto L159
        L7f:
            java.lang.String r15 = "toFilter"
            r12[r14] = r15
            goto L159
        L85:
            java.lang.String r15 = "classModality"
            r12[r14] = r15
            goto L159
        L8b:
            java.lang.String r15 = "descriptorByHandle"
            r12[r14] = r15
            goto L159
        L91:
            java.lang.String r15 = "overridables"
            r12[r14] = r15
            goto L159
        L97:
            java.lang.String r15 = "bReturnType"
            r12[r14] = r15
            goto L159
        L9d:
            java.lang.String r15 = "aReturnType"
            r12[r14] = r15
            goto L159
        La3:
            java.lang.String r15 = "descriptors"
            r12[r14] = r15
            goto L159
        La9:
            java.lang.String r15 = "candidate"
            r12[r14] = r15
            goto L159
        Laf:
            java.lang.String r15 = "b"
            r12[r14] = r15
            goto L159
        Lb5:
            java.lang.String r15 = "a"
            r12[r14] = r15
            goto L159
        Lbb:
            java.lang.String r15 = "notOverridden"
            r12[r14] = r15
            goto L159
        Lc1:
            java.lang.String r15 = "descriptorsFromSuper"
            r12[r14] = r15
            goto L159
        Lc7:
            java.lang.String r15 = "fromCurrent"
            r12[r14] = r15
            goto L159
        Lcd:
            java.lang.String r15 = "fromSuper"
            r12[r14] = r15
            goto L159
        Ld3:
            java.lang.String r15 = "overriding"
            r12[r14] = r15
            goto L159
        Ld9:
            java.lang.String r15 = "strategy"
            r12[r14] = r15
            goto L159
        Ldf:
            java.lang.String r15 = "current"
            r12[r14] = r15
            goto L159
        Le5:
            java.lang.String r15 = "membersFromCurrent"
            r12[r14] = r15
            goto L159
        Leb:
            java.lang.String r15 = "membersFromSupertypes"
            r12[r14] = r15
            goto L159
        Lf1:
            java.lang.String r15 = "name"
            r12[r14] = r15
            goto L159
        Lf7:
            java.lang.String r15 = "subTypeParameter"
            r12[r14] = r15
            goto L159
        Lfd:
            java.lang.String r15 = "superTypeParameter"
            r12[r14] = r15
            goto L159
        L102:
            java.lang.String r15 = "typeCheckerState"
            r12[r14] = r15
            goto L159
        L107:
            java.lang.String r15 = "typeInSub"
            r12[r14] = r15
            goto L159
        L10c:
            java.lang.String r15 = "typeInSuper"
            r12[r14] = r15
            goto L159
        L111:
            java.lang.String r15 = "secondParameters"
            r12[r14] = r15
            goto L159
        L116:
            java.lang.String r15 = "firstParameters"
            r12[r14] = r15
            goto L159
        L11b:
            java.lang.String r15 = "subDescriptor"
            r12[r14] = r15
            goto L159
        L120:
            java.lang.String r15 = "superDescriptor"
            r12[r14] = r15
            goto L159
        L125:
            java.lang.String r15 = "result"
            r12[r14] = r15
            goto L159
        L12a:
            java.lang.String r15 = "descriptor"
            r12[r14] = r15
            goto L159
        L12f:
            java.lang.String r15 = "g"
            r12[r14] = r15
            goto L159
        L134:
            java.lang.String r15 = "f"
            r12[r14] = r15
            goto L159
        L139:
            r12[r14] = r13
            goto L159
        L13c:
            java.lang.String r15 = "transformFirst"
            r12[r14] = r15
            goto L159
        L141:
            java.lang.String r15 = "candidateSet"
            r12[r14] = r15
            goto L159
        L146:
            java.lang.String r15 = "axioms"
            r12[r14] = r15
            goto L159
        L14b:
            java.lang.String r15 = "equalityAxioms"
            r12[r14] = r15
            goto L159
        L150:
            java.lang.String r15 = "customSubtype"
            r12[r14] = r15
            goto L159
        L155:
            java.lang.String r15 = "kotlinTypePreparator"
            r12[r14] = r15
        L159:
            java.lang.String r14 = "getOverriddenDeclarations"
            java.lang.String r15 = "isOverridableBy"
            java.lang.String r16 = "isOverridableByWithoutExternalConditions"
            java.lang.String r17 = "createTypeCheckerState"
            java.lang.String r18 = "selectMostSpecificMember"
            java.lang.String r19 = "determineModalityForFakeOverride"
            java.lang.String r20 = "getMinimalModality"
            java.lang.String r21 = "filterVisibleFakeOverrides"
            java.lang.String r22 = "extractMembersOverridableInBothWays"
            r23 = 1
            if (r0 == r9) goto L1a9
            if (r0 == r8) goto L1a9
            if (r0 == r7) goto L1a6
            if (r0 == r6) goto L1a3
            if (r0 == r5) goto L1a0
            if (r0 == r4) goto L19d
            if (r0 == r3) goto L19a
            if (r0 == r2) goto L197
            if (r0 == r1) goto L197
            switch(r0) {
                case 24: goto L1a3;
                case 25: goto L1a3;
                case 26: goto L1a3;
                case 27: goto L1a3;
                default: goto L182;
            }
        L182:
            switch(r0) {
                case 30: goto L194;
                case 31: goto L194;
                case 32: goto L194;
                case 33: goto L194;
                case 34: goto L194;
                case 35: goto L194;
                case 36: goto L194;
                case 37: goto L194;
                default: goto L185;
            }
        L185:
            switch(r0) {
                case 78: goto L191;
                case 79: goto L191;
                case 80: goto L191;
                case 81: goto L191;
                case 82: goto L191;
                default: goto L188;
            }
        L188:
            switch(r0) {
                case 88: goto L18e;
                case 89: goto L18e;
                case 90: goto L18e;
                default: goto L18b;
            }
        L18b:
            r12[r23] = r13
            goto L1ad
        L18e:
            r12[r23] = r19
            goto L1ad
        L191:
            r12[r23] = r18
            goto L1ad
        L194:
            r12[r23] = r16
            goto L1ad
        L197:
            r12[r23] = r17
            goto L1ad
        L19a:
            r12[r23] = r22
            goto L1ad
        L19d:
            r12[r23] = r21
            goto L1ad
        L1a0:
            r12[r23] = r20
            goto L1ad
        L1a3:
            r12[r23] = r15
            goto L1ad
        L1a6:
            r12[r23] = r14
            goto L1ad
        L1a9:
            java.lang.String r13 = "filterOverrides"
            r12[r23] = r13
        L1ad:
            switch(r0) {
                case 1: goto L24b;
                case 2: goto L24b;
                case 3: goto L246;
                case 4: goto L246;
                case 5: goto L241;
                case 6: goto L241;
                case 7: goto L241;
                case 8: goto L23c;
                case 9: goto L237;
                case 10: goto L237;
                case 11: goto L24f;
                case 12: goto L24f;
                case 13: goto L232;
                case 14: goto L232;
                case 15: goto L22f;
                case 16: goto L24f;
                case 17: goto L22a;
                case 18: goto L22a;
                case 19: goto L227;
                case 20: goto L227;
                case 21: goto L24f;
                case 22: goto L227;
                case 23: goto L227;
                case 24: goto L24f;
                case 25: goto L24f;
                case 26: goto L24f;
                case 27: goto L24f;
                case 28: goto L224;
                case 29: goto L224;
                case 30: goto L24f;
                case 31: goto L24f;
                case 32: goto L24f;
                case 33: goto L24f;
                case 34: goto L24f;
                case 35: goto L24f;
                case 36: goto L24f;
                case 37: goto L24f;
                case 38: goto L21f;
                case 39: goto L21f;
                case 40: goto L21c;
                case 41: goto L21c;
                case 42: goto L24f;
                case 43: goto L24f;
                case 44: goto L217;
                case 45: goto L217;
                case 46: goto L217;
                case 47: goto L212;
                case 48: goto L212;
                case 49: goto L212;
                case 50: goto L20d;
                case 51: goto L20d;
                case 52: goto L20d;
                case 53: goto L20d;
                case 54: goto L20d;
                case 55: goto L208;
                case 56: goto L208;
                case 57: goto L203;
                case 58: goto L203;
                case 59: goto L203;
                case 60: goto L203;
                case 61: goto L1fe;
                case 62: goto L1f9;
                case 63: goto L1f9;
                case 64: goto L1f9;
                case 65: goto L1f4;
                case 66: goto L1f4;
                case 67: goto L1ee;
                case 68: goto L1ee;
                case 69: goto L1e8;
                case 70: goto L1e8;
                case 71: goto L1e2;
                case 72: goto L1e2;
                case 73: goto L1e2;
                case 74: goto L1e2;
                case 75: goto L1e2;
                case 76: goto L1de;
                case 77: goto L1de;
                case 78: goto L24f;
                case 79: goto L24f;
                case 80: goto L24f;
                case 81: goto L24f;
                case 82: goto L24f;
                case 83: goto L1d8;
                case 84: goto L1d8;
                case 85: goto L1d8;
                case 86: goto L1d4;
                case 87: goto L1d4;
                case 88: goto L24f;
                case 89: goto L24f;
                case 90: goto L24f;
                case 91: goto L1d0;
                case 92: goto L1d0;
                case 93: goto L24f;
                case 94: goto L1cc;
                case 95: goto L1cc;
                case 96: goto L24f;
                case 97: goto L1c8;
                case 98: goto L1c8;
                case 99: goto L1c8;
                case 100: goto L1c8;
                case 101: goto L24f;
                case 102: goto L1c8;
                case 103: goto L1c8;
                case 104: goto L1c8;
                case 105: goto L1c2;
                case 106: goto L1bc;
                case 107: goto L1b6;
                default: goto L1b0;
            }
        L1b0:
            java.lang.String r13 = "createWithTypeRefiner"
            r12[r11] = r13
            goto L24f
        L1b6:
            java.lang.String r13 = "findMaxVisibility"
            r12[r11] = r13
            goto L24f
        L1bc:
            java.lang.String r13 = "computeVisibilityToInherit"
            r12[r11] = r13
            goto L24f
        L1c2:
            java.lang.String r13 = "resolveUnknownVisibilityForMember"
            r12[r11] = r13
            goto L24f
        L1c8:
            r12[r11] = r22
            goto L24f
        L1cc:
            r12[r11] = r21
            goto L24f
        L1d0:
            r12[r11] = r20
            goto L24f
        L1d4:
            r12[r11] = r19
            goto L24f
        L1d8:
            java.lang.String r13 = "createAndBindFakeOverride"
            r12[r11] = r13
            goto L24f
        L1de:
            r12[r11] = r18
            goto L24f
        L1e2:
            java.lang.String r13 = "isReturnTypeMoreSpecific"
            r12[r11] = r13
            goto L24f
        L1e8:
            java.lang.String r13 = "isMoreSpecificThenAllOf"
            r12[r11] = r13
            goto L24f
        L1ee:
            java.lang.String r13 = "isVisibilityMoreSpecific"
            r12[r11] = r13
            goto L24f
        L1f4:
            java.lang.String r13 = "isMoreSpecific"
            r12[r11] = r13
            goto L24f
        L1f9:
            java.lang.String r13 = "createAndBindFakeOverrides"
            r12[r11] = r13
            goto L24f
        L1fe:
            java.lang.String r13 = "allHasSameContainingDeclaration"
            r12[r11] = r13
            goto L24f
        L203:
            java.lang.String r13 = "extractAndBindOverridesForMember"
            r12[r11] = r13
            goto L24f
        L208:
            java.lang.String r13 = "isVisibleForOverride"
            r12[r11] = r13
            goto L24f
        L20d:
            java.lang.String r13 = "generateOverridesInFunctionGroup"
            r12[r11] = r13
            goto L24f
        L212:
            java.lang.String r13 = "areTypeParametersEquivalent"
            r12[r11] = r13
            goto L24f
        L217:
            java.lang.String r13 = "areTypesEquivalent"
            r12[r11] = r13
            goto L24f
        L21c:
            r12[r11] = r17
            goto L24f
        L21f:
            java.lang.String r13 = "getBasicOverridabilityProblem"
            r12[r11] = r13
            goto L24f
        L224:
            r12[r11] = r16
            goto L24f
        L227:
            r12[r11] = r15
            goto L24f
        L22a:
            java.lang.String r13 = "collectOverriddenDeclarations"
            r12[r11] = r13
            goto L24f
        L22f:
            r12[r11] = r14
            goto L24f
        L232:
            java.lang.String r13 = "overrides"
            r12[r11] = r13
            goto L24f
        L237:
            java.lang.String r13 = "filterOverrides"
            r12[r11] = r13
            goto L24f
        L23c:
            java.lang.String r13 = "filterOutOverridden"
            r12[r11] = r13
            goto L24f
        L241:
            java.lang.String r13 = "<init>"
            r12[r11] = r13
            goto L24f
        L246:
            java.lang.String r13 = "create"
            r12[r11] = r13
            goto L24f
        L24b:
            java.lang.String r13 = "createWithTypePreparatorAndCustomSubtype"
            r12[r11] = r13
        L24f:
            java.lang.String r10 = java.lang.String.format(r10, r12)
            if (r0 == r9) goto L277
            if (r0 == r8) goto L277
            if (r0 == r7) goto L277
            if (r0 == r6) goto L277
            if (r0 == r5) goto L277
            if (r0 == r4) goto L277
            if (r0 == r3) goto L277
            if (r0 == r2) goto L277
            if (r0 == r1) goto L277
            switch(r0) {
                case 24: goto L277;
                case 25: goto L277;
                case 26: goto L277;
                case 27: goto L277;
                default: goto L268;
            }
        L268:
            switch(r0) {
                case 30: goto L277;
                case 31: goto L277;
                case 32: goto L277;
                case 33: goto L277;
                case 34: goto L277;
                case 35: goto L277;
                case 36: goto L277;
                case 37: goto L277;
                default: goto L26b;
            }
        L26b:
            switch(r0) {
                case 78: goto L277;
                case 79: goto L277;
                case 80: goto L277;
                case 81: goto L277;
                case 82: goto L277;
                default: goto L26e;
            }
        L26e:
            switch(r0) {
                case 88: goto L277;
                case 89: goto L277;
                case 90: goto L277;
                default: goto L271;
            }
        L271:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            goto L27c
        L277:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
        L27c:
            throw r0
    }

    private static boolean b(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r2) {
            if (r2 != 0) goto L7
            r0 = 61
            a(r0)
        L7:
            int r0 = r2.size()
            r1 = 2
            if (r0 >= r1) goto L10
            r2 = 1
            return r2
        L10:
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r0 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$c r1 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$c
            r1.<init>(r0)
            boolean r2 = kotlin.collections.f0.A1(r2, r1)
            return r2
    }

    private static boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r6) {
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = (kotlin.reflect.jvm.internal.impl.types.t0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
    }

    private static boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r3) {
            if (r1 != 0) goto L7
            r0 = 44
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 45
            a(r0)
        Le:
            if (r3 != 0) goto L15
            r0 = 46
            a(r0)
        L15:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r1)
            if (r0 == 0) goto L23
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
            if (r0 == 0) goto L23
            r1 = 1
            return r1
        L23:
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            boolean r1 = r0.m(r3, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo e(kotlin.reflect.jvm.internal.impl.descriptors.a r4, kotlin.reflect.jvm.internal.impl.descriptors.a r5) {
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r4.f0()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r5.f0()
            if (r3 != 0) goto L12
            r1 = 1
        L12:
            if (r0 == r1) goto L1b
            java.lang.String r4 = "Receiver presence mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r4)
            return r4
        L1b:
            java.util.List r4 = r4.g()
            int r4 = r4.size()
            java.util.List r5 = r5.g()
            int r5 = r5.size()
            if (r4 == r5) goto L34
            java.lang.String r4 = "Value parameter number mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r4)
            return r4
        L34:
            r4 = 0
            return r4
    }

    private static void f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, @org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r3) {
            if (r2 != 0) goto L7
            r0 = 17
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 18
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r2.h()
            boolean r0 = r0.isReal()
            if (r0 == 0) goto L1c
            r3.add(r2)
            return
        L1c:
            java.util.Collection r0 = r2.e()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3f
            java.util.Collection r2 = r2.e()
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            f(r0, r3)
            goto L2e
        L3e:
            return
        L3f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No overridden descriptors found for (fake override) "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private static java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> g(kotlin.reflect.jvm.internal.impl.descriptors.a r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r2.f0()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            r1.add(r0)
        L12:
            java.util.List r2 = r2.g()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            r1.add(r0)
            goto L1a
        L2e:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.descriptors.s h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
            if (r5 != 0) goto L7
            r0 = 106(0x6a, float:1.49E-43)
            a(r0)
        L7:
            java.util.Collection r0 = r5.e()
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = u(r0)
            r2 = 0
            if (r1 != 0) goto L13
            return r2
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = r5.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r5 != r3) goto L3f
            java.util.Iterator r5 = r0.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r3 == r4) goto L1f
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r0.getVisibility()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
            return r2
        L3e:
            return r1
        L3f:
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = r1.f()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.e.a r4) {
            if (r3 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            if (r4 != 0) goto Lc
            r0 = 4
            a(r0)
        Lc:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
            r2 = 0
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    private static void j(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.m r10) {
            if (r8 != 0) goto L7
            r0 = 83
            a(r0)
        L7:
            if (r9 != 0) goto Le
            r0 = 84
            a(r0)
        Le:
            if (r10 != 0) goto L15
            r0 = 85
            a(r0)
        L15:
            java.util.Collection r0 = t(r9, r8)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r8 = r0
        L21:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = n(r8, r9)
            if (r1 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.h
        L29:
            r5 = r0
            goto L2e
        L2b:
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.g
            goto L29
        L2e:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$d r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$d
            r0.<init>()
            java.lang.Object r0 = L(r8, r0)
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r7 = 0
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r9 = r2.e0(r3, r4, r5, r6, r7)
            r10.d(r9, r8)
            r10.a(r9)
            return
    }

    private static void k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.m r3) {
            if (r1 != 0) goto L7
            r0 = 62
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 63
            a(r0)
        Le:
            if (r3 != 0) goto L15
            r0 = 64
            a(r0)
        L15:
            boolean r0 = b(r2)
            if (r0 == 0) goto L33
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            java.util.Set r0 = java.util.Collections.singleton(r0)
            j(r0, r1, r3)
            goto L1f
        L33:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r2)
        L38:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L4a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.v.a(r0)
            java.util.Collection r2 = q(r2, r0, r3)
            j(r2, r1, r3)
            goto L38
        L4a:
            return
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.types.TypeCheckerState l(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r10, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r11) {
            r9 = this;
            if (r10 != 0) goto L7
            r0 = 40
            a(r0)
        L7:
            if (r11 != 0) goto Le
            r0 = 41
            a(r0)
        Le:
            boolean r0 = r10.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.resolve.n r3 = new kotlin.reflect.jvm.internal.impl.resolve.n
            kotlin.reflect.jvm.internal.impl.types.checker.e$a r5 = r9.c
            kotlin.reflect.jvm.internal.impl.types.checker.g r6 = r9.a
            kotlin.reflect.jvm.internal.impl.types.checker.f r7 = r9.b
            kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> r8 = r9.d
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r10 = r3.U(r2, r2, r1)
            if (r10 != 0) goto L2f
            r11 = 42
            a(r11)
        L2f:
            return r10
        L30:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0 = 0
        L36:
            int r3 = r10.size()
            if (r0 >= r3) goto L56
            java.lang.Object r3 = r10.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.o()
            java.lang.Object r5 = r11.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r5
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r5.o()
            r4.put(r3, r5)
            int r0 = r0 + 1
            goto L36
        L56:
            kotlin.reflect.jvm.internal.impl.resolve.n r3 = new kotlin.reflect.jvm.internal.impl.resolve.n
            kotlin.reflect.jvm.internal.impl.types.checker.e$a r5 = r9.c
            kotlin.reflect.jvm.internal.impl.types.checker.g r6 = r9.a
            kotlin.reflect.jvm.internal.impl.types.checker.f r7 = r9.b
            kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> r8 = r9.d
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r10 = r3.U(r2, r2, r1)
            if (r10 != 0) goto L6e
            r11 = 43
            a(r11)
        L6e:
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r4) {
            if (r4 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil
            kotlin.reflect.jvm.internal.impl.types.checker.e$a r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.g
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r2 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
            r3 = 0
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private static kotlin.reflect.jvm.internal.impl.descriptors.Modality n(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9) {
            if (r8 != 0) goto L7
            r0 = 86
            a(r0)
        L7:
            if (r9 != 0) goto Le
            r0 = 87
            a(r0)
        Le:
            java.util.Iterator r0 = r8.iterator()
            r1 = 0
            r2 = 0
            r3 = 0
        L15:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            int[] r6 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r7 = r4.i()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            if (r6 == r5) goto L55
            r7 = 2
            if (r6 == r7) goto L3e
            r4 = 3
            if (r6 == r4) goto L3c
            r4 = 4
            if (r6 == r4) goto L3a
            goto L15
        L3a:
            r3 = 1
            goto L15
        L3c:
            r2 = 1
            goto L15
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Member cannot have SEALED modality: "
            r9.append(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L55:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r8 != 0) goto L5e
            r9 = 88
            a(r9)
        L5e:
            return r8
        L5f:
            boolean r0 = r9.q0()
            if (r0 == 0) goto L76
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r9.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r0 == r4) goto L76
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r9.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r0 == r4) goto L76
            r1 = 1
        L76:
            if (r2 == 0) goto L84
            if (r3 != 0) goto L84
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            if (r8 != 0) goto L83
            r9 = 89
            a(r9)
        L83:
            return r8
        L84:
            if (r2 != 0) goto L99
            if (r3 == 0) goto L99
            if (r1 == 0) goto L8f
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = r9.i()
            goto L91
        L8f:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
        L91:
            if (r8 != 0) goto L98
            r9 = 90
            a(r9)
        L98:
            return r8
        L99:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        La2:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            java.util.Set r2 = z(r2)
            r0.addAll(r2)
            goto La2
        Lb6:
            java.util.Set r8 = r(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = r9.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = y(r8, r1, r9)
            return r8
    }

    private java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.m r10) {
            r6 = this;
            if (r7 != 0) goto L7
            r0 = 57
            a(r0)
        L7:
            if (r8 != 0) goto Le
            r0 = 58
            a(r0)
        Le:
            if (r9 != 0) goto L15
            r0 = 59
            a(r0)
        L15:
            if (r10 != 0) goto L1c
            r0 = 60
            a(r0)
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.utils.k r1 = kotlin.reflect.jvm.internal.impl.utils.k.a()
            java.util.Iterator r8 = r8.iterator()
        L2d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r3 = r6.D(r2, r7, r9)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r3 = r3.c()
            r4 = 0
            boolean r4 = I(r7, r2, r4)
            int[] r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.b
            int r3 = r3.ordinal()
            r3 = r5[r3]
            r5 = 1
            if (r3 == r5) goto L5e
            r5 = 2
            if (r3 == r5) goto L55
            goto L2d
        L55:
            if (r4 == 0) goto L5a
            r10.c(r2, r7)
        L5a:
            r0.add(r2)
            goto L2d
        L5e:
            if (r4 == 0) goto L63
            r1.add(r2)
        L63:
            r0.add(r2)
            goto L2d
        L67:
            r10.d(r7, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <H> java.util.Collection<H> p(@org.jetbrains.annotations.NotNull H r5, @org.jetbrains.annotations.NotNull java.util.Collection<H> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.a> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<H, kotlin.n1> r8) {
            if (r5 != 0) goto L7
            r0 = 97
            a(r0)
        L7:
            if (r6 != 0) goto Le
            r0 = 98
            a(r0)
        Le:
            if (r7 != 0) goto L15
            r0 = 99
            a(r0)
        L15:
            if (r8 != 0) goto L1c
            r0 = 100
            a(r0)
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            java.lang.Object r1 = r7.invoke(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r1
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r7.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.a r3 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r3
            if (r5 != r2) goto L44
            r6.remove()
            goto L2e
        L44:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r3 = x(r1, r3)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            if (r3 != r4) goto L53
            r0.add(r2)
            r6.remove()
            goto L2e
        L53:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT
            if (r3 != r4) goto L2e
            r8.invoke(r2)
            r6.remove()
            goto L2e
        L5e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    private static java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, @org.jetbrains.annotations.NotNull java.util.Queue<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.m r4) {
            if (r2 != 0) goto L7
            r0 = 102(0x66, float:1.43E-43)
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 103(0x67, float:1.44E-43)
            a(r0)
        Le:
            if (r4 != 0) goto L15
            r0 = 104(0x68, float:1.46E-43)
            a(r0)
        L15:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$f r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$f
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$g r1 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$g
            r1.<init>(r4, r2)
            java.util.Collection r2 = p(r2, r3, r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> java.util.Set<D> r(@org.jetbrains.annotations.NotNull java.util.Set<D> r3) {
            if (r3 != 0) goto L7
            r0 = 8
            a(r0)
        L7:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L23
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r0
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.s(r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.y(r0)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b r1 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b
            r1.<init>()
            r2 = 0
            java.util.Set r3 = s(r3, r0, r2, r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <D> java.util.Set<D> s(@org.jetbrains.annotations.NotNull java.util.Set<D> r7, boolean r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<?> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super D, ? super D, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> r10) {
            if (r7 != 0) goto L7
            r0 = 9
            a(r0)
        L7:
            if (r10 != 0) goto Le
            r0 = 10
            a(r0)
        Le:
            int r0 = r7.size()
            r1 = 1
            if (r0 > r1) goto L16
            return r7
        L16:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r7.next()
            if (r9 == 0) goto L2e
            r9.invoke()
        L2e:
            java.util.Iterator r3 = r0.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r3.next()
            java.lang.Object r4 = r10.invoke(r2, r4)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            kotlin.reflect.jvm.internal.impl.descriptors.a r5 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r5
            java.lang.Object r4 = r4.component2()
            kotlin.reflect.jvm.internal.impl.descriptors.a r4 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r4
            boolean r6 = J(r5, r4, r8, r1)
            if (r6 == 0) goto L58
            r3.remove()
            goto L32
        L58:
            boolean r4 = J(r4, r5, r8, r1)
            if (r4 == 0) goto L32
            goto L1f
        L5f:
            r0.add(r2)
            goto L1f
        L63:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r2) {
            if (r1 != 0) goto L7
            r0 = 94
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 95
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$e r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$e
            r0.<init>(r1)
            java.util.List r1 = kotlin.collections.f0.r2(r2, r0)
            if (r1 != 0) goto L1e
            r2 = 96
            a(r2)
        L1e:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.s u(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r5) {
            if (r5 != 0) goto L7
            r0 = 107(0x6b, float:1.5E-43)
            a(r0)
        L7:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = kotlin.reflect.jvm.internal.impl.descriptors.r.l
            return r5
        L10:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L15:
            r2 = r1
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = r3.getVisibility()
            if (r2 != 0) goto L2a
        L28:
            r2 = r3
            goto L16
        L2a:
            java.lang.Integer r4 = kotlin.reflect.jvm.internal.impl.descriptors.r.d(r3, r2)
            if (r4 != 0) goto L31
            goto L15
        L31:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L16
            goto L28
        L38:
            if (r2 != 0) goto L3b
            return r1
        L3b:
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r0.getVisibility()
            java.lang.Integer r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.d(r2, r0)
            if (r0 == 0) goto L5b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L3f
        L5b:
            return r1
        L5c:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r4) {
            if (r3 != 0) goto L7
            r0 = 38
            a(r0)
        L7:
            if (r4 != 0) goto Le
            r0 = 39
            a(r0)
        Le:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto L16
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r1 == 0) goto L1e
        L16:
            boolean r1 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r1 == 0) goto L25
            boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r2 != 0) goto L25
        L1e:
            java.lang.String r3 = "Member kind mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r3)
            return r3
        L25:
            if (r0 != 0) goto L41
            if (r1 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "This type of CallableDescriptor cannot be checked for overridability: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L41:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r4.getName()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            java.lang.String r3 = "Name mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r3)
            return r3
        L56:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r3 = e(r3, r4)
            if (r3 == 0) goto L5d
            return r3
        L5d:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result x(kotlin.reflect.jvm.internal.impl.descriptors.a r3, kotlin.reflect.jvm.internal.impl.descriptors.a r4) {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f
            r1 = 0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r2 = r0.D(r4, r3, r1)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r3 = r0.D(r3, r4, r1)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r3 = r3.c()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            if (r2 != r4) goto L1a
            if (r3 != r4) goto L1a
            return r4
        L1a:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT
            if (r2 == r4) goto L24
            if (r3 != r4) goto L21
            goto L24
        L21:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE
            return r3
        L24:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    private static kotlin.reflect.jvm.internal.impl.descriptors.Modality y(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r4, boolean r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r6) {
            if (r4 != 0) goto L7
            r0 = 91
            a(r0)
        L7:
            if (r6 != 0) goto Le
            r0 = 92
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
            if (r5 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = r1.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r2 != r3) goto L2c
            r1 = r6
            goto L30
        L2c:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r1.i()
        L30:
            int r2 = r1.compareTo(r0)
            if (r2 >= 0) goto L14
            r0 = r1
            goto L14
        L38:
            if (r0 != 0) goto L3f
            r4 = 93
            a(r4)
        L3f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            if (r1 != 0) goto L7
            r0 = 15
            a(r0)
        L7:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            f(r1, r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r4) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 19
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 20
            a(r0)
        Le:
            r0 = 0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r2 = r1.E(r2, r3, r4, r0)
            if (r2 != 0) goto L1a
            r3 = 21
            a(r3)
        L1a:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r11, boolean r12) {
            r8 = this;
            if (r9 != 0) goto L7
            r0 = 22
            a(r0)
        L7:
            if (r10 != 0) goto Le
            r0 = 23
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r12 = r8.F(r9, r10, r12)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = r12.c()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            r2 = 1
            if (r0 != r1) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition> r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = "External condition"
            r5 = 2
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition r3 = (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition) r3
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r6 = r3.a()
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r7 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY
            if (r6 != r7) goto L3c
            goto L24
        L3c:
            if (r0 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r6 = r3.a()
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r7 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY
            if (r6 != r7) goto L47
            goto L24
        L47:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r3 = r3.b(r9, r10, r11)
            int[] r6 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.a
            int r3 = r3.ordinal()
            r3 = r6[r3]
            if (r3 == r2) goto L64
            if (r3 == r5) goto L58
            goto L24
        L58:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r9 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r4)
            if (r9 != 0) goto L63
            r10 = 24
            a(r10)
        L63:
            return r9
        L64:
            r0 = 1
            goto L24
        L66:
            if (r0 != 0) goto L69
            return r12
        L69:
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition> r12 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e
            java.util.Iterator r12 = r12.iterator()
        L6f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r12.next()
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition r0 = (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition) r0
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r1 = r0.a()
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract r3 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY
            if (r1 == r3) goto L84
            goto L6f
        L84:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = r0.b(r9, r10, r11)
            int[] r3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.h.a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto La1
            if (r1 == r5) goto L95
            goto L6f
        L95:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r9 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r4)
            if (r9 != 0) goto La0
            r10 = 26
            a(r10)
        La0:
            return r9
        La1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Contract violation in "
            r10.append(r11)
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = " condition. It's not supposed to end with success"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lc5:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r9 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.e()
            if (r9 != 0) goto Ld0
            r10 = 27
            a(r10)
        Ld0:
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo F(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r11, boolean r12) {
            r9 = this;
            if (r10 != 0) goto L7
            r0 = 28
            a(r0)
        L7:
            if (r11 != 0) goto Le
            r0 = 29
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = w(r10, r11)
            if (r0 == 0) goto L15
            return r0
        L15:
            java.util.List r0 = g(r10)
            java.util.List r1 = g(r11)
            java.util.List r2 = r10.getTypeParameters()
            java.util.List r3 = r11.getTypeParameters()
            int r4 = r2.size()
            int r5 = r3.size()
            r6 = 0
            if (r4 == r5) goto L67
        L30:
            int r10 = r0.size()
            java.lang.String r11 = "Type parameter number mismatch"
            if (r6 >= r10) goto L5b
            kotlin.reflect.jvm.internal.impl.types.checker.e r10 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            java.lang.Object r12 = r0.get(r6)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = (kotlin.reflect.jvm.internal.impl.types.t0) r12
            java.lang.Object r2 = r1.get(r6)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            boolean r10 = r10.a(r12, r2)
            if (r10 != 0) goto L58
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r11)
            if (r10 != 0) goto L57
            r11 = 31
            a(r11)
        L57:
            return r10
        L58:
            int r6 = r6 + 1
            goto L30
        L5b:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.b(r11)
            if (r10 != 0) goto L66
            r11 = 32
            a(r11)
        L66:
            return r10
        L67:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r4 = r9.l(r2, r3)
            r5 = 0
        L6c:
            int r7 = r2.size()
            if (r5 >= r7) goto L95
            java.lang.Object r7 = r2.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r7
            java.lang.Object r8 = r3.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r8
            boolean r7 = c(r7, r8, r4)
            if (r7 != 0) goto L92
            java.lang.String r10 = "Type parameter bounds mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r10)
            if (r10 != 0) goto L91
            r11 = 33
            a(r11)
        L91:
            return r10
        L92:
            int r5 = r5 + 1
            goto L6c
        L95:
            int r2 = r0.size()
            if (r6 >= r2) goto Lbe
            java.lang.Object r2 = r0.get(r6)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            java.lang.Object r3 = r1.get(r6)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            boolean r2 = d(r2, r3, r4)
            if (r2 != 0) goto Lbb
            java.lang.String r10 = "Value parameter type mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r10)
            if (r10 != 0) goto Lba
            r11 = 34
            a(r11)
        Lba:
            return r10
        Lbb:
            int r6 = r6 + 1
            goto L95
        Lbe:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto Le4
            boolean r0 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto Le4
            r0 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r0
            boolean r0 = r0.isSuspend()
            r1 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
            boolean r1 = r1.isSuspend()
            if (r0 == r1) goto Le4
            java.lang.String r10 = "Incompatible suspendability"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.b(r10)
            if (r10 != 0) goto Le3
            r11 = 35
            a(r11)
        Le3:
            return r10
        Le4:
            if (r12 == 0) goto L11d
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = r10.getReturnType()
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r11.getReturnType()
            if (r10 == 0) goto L11d
            if (r11 == 0) goto L11d
            boolean r12 = kotlin.reflect.jvm.internal.impl.types.x0.a(r11)
            if (r12 == 0) goto Lff
            boolean r12 = kotlin.reflect.jvm.internal.impl.types.x0.a(r10)
            if (r12 == 0) goto Lff
            goto L11d
        Lff:
            kotlin.reflect.jvm.internal.impl.types.h r12 = kotlin.reflect.jvm.internal.impl.types.h.a
            kotlin.reflect.jvm.internal.impl.types.m2 r11 = r11.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = r10.L0()
            boolean r10 = r12.t(r4, r11, r10)
            if (r10 != 0) goto L11d
            java.lang.String r10 = "Return type mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.b(r10)
            if (r10 != 0) goto L11c
            r11 = 36
            a(r11)
        L11c:
            return r10
        L11d:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r10 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.e()
            if (r10 != 0) goto L128
            r11 = 37
            a(r11)
        L128:
            return r10
    }

    public void v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.m r6) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 50
            a(r2)
        L7:
            if (r3 != 0) goto Le
            r2 = 51
            a(r2)
        Le:
            if (r4 != 0) goto L15
            r2 = 52
            a(r2)
        L15:
            if (r5 != 0) goto L1c
            r2 = 53
            a(r2)
        L1c:
            if (r6 != 0) goto L23
            r2 = 54
            a(r2)
        L23:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>(r3)
            java.util.Iterator r4 = r4.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            java.util.Collection r0 = r1.o(r0, r3, r5, r6)
            r2.removeAll(r0)
            goto L2c
        L40:
            k(r5, r2, r6)
            return
    }
}

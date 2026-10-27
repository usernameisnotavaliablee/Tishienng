package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.a f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.DeprecationLevel c;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer d;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nVersionRequirement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionRequirement.kt\norg/jetbrains/kotlin/metadata/deserialization/VersionRequirement$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1617#2,9:120\n1869#2:129\n1870#2:131\n1626#2:132\n1#3:130\n*S KotlinDebug\n*F\n+ 1 VersionRequirement.kt\norg/jetbrains/kotlin/metadata/deserialization/VersionRequirement$Companion\n*L\n94#1:120,9\n94#1:129\n94#1:131\n94#1:132\n94#1:130\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0056a {
            public static final /* synthetic */ int[] a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level[] r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.WARNING     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.ERROR     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level.HIDDEN     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.a.C0056a.a = r0
                    return
            }
        }

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

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i a(int r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r12) {
                r9 = this;
                java.lang.String r0 = "nameResolver"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "table"
                kotlin.jvm.internal.g0.p(r12, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r10 = r12.b(r10)
                r12 = 0
                if (r10 != 0) goto L12
                return r12
            L12:
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b$a r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b.d
                boolean r1 = r10.hasVersion()
                if (r1 == 0) goto L23
                int r1 = r10.getVersion()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L24
            L23:
                r1 = r12
            L24:
                boolean r2 = r10.hasVersionFull()
                if (r2 == 0) goto L33
                int r2 = r10.getVersionFull()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L34
            L33:
                r2 = r12
            L34:
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r4 = r0.a(r1, r2)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level r0 = r10.getLevel()
                kotlin.jvm.internal.g0.m(r0)
                int[] r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.a.C0056a.a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L5d
                r1 = 2
                if (r0 == r1) goto L5a
                r1 = 3
                if (r0 != r1) goto L54
                kotlin.DeprecationLevel r0 = kotlin.DeprecationLevel.HIDDEN
            L52:
                r6 = r0
                goto L60
            L54:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            L5a:
                kotlin.DeprecationLevel r0 = kotlin.DeprecationLevel.ERROR
                goto L52
            L5d:
                kotlin.DeprecationLevel r0 = kotlin.DeprecationLevel.WARNING
                goto L52
            L60:
                boolean r0 = r10.hasErrorCode()
                if (r0 == 0) goto L70
                int r0 = r10.getErrorCode()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7 = r0
                goto L71
            L70:
                r7 = r12
            L71:
                boolean r0 = r10.hasMessage()
                if (r0 == 0) goto L7f
                int r12 = r10.getMessage()
                java.lang.String r12 = r11.getString(r12)
            L7f:
                r8 = r12
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i r3 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.i
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind r5 = r10.getVersionKind()
                java.lang.String r10 = "getVersionKind(...)"
                kotlin.jvm.internal.g0.o(r5, r10)
                r3.<init>(r4, r5, r6, r7, r8)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b.a d = null;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b e = null;
        private final int a;
        private final int b;
        private final int c;

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

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b a(@org.jetbrains.annotations.Nullable java.lang.Integer r3, @org.jetbrains.annotations.Nullable java.lang.Integer r4) {
                    r2 = this;
                    if (r4 == 0) goto L1e
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r3 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b
                    int r0 = r4.intValue()
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    int r1 = r4.intValue()
                    int r1 = r1 >> 8
                    r1 = r1 & 255(0xff, float:3.57E-43)
                    int r4 = r4.intValue()
                    int r4 = r4 >> 16
                    r4 = r4 & 255(0xff, float:3.57E-43)
                    r3.<init>(r0, r1, r4)
                    return r3
                L1e:
                    if (r3 == 0) goto L3c
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r4 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b
                    int r0 = r3.intValue()
                    r0 = r0 & 7
                    int r1 = r3.intValue()
                    int r1 = r1 >> 3
                    r1 = r1 & 15
                    int r3 = r3.intValue()
                    int r3 = r3 >> 7
                    r3 = r3 & 127(0x7f, float:1.78E-43)
                    r4.<init>(r0, r1, r3)
                    return r4
                L3c:
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b.e
                    return r3
            }
        }

        static {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b$a r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b$a
                r1 = 0
                r0.<init>(r1)
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b.d = r0
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b
                r1 = 256(0x100, float:3.59E-43)
                r0.<init>(r1, r1, r1)
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b.e = r0
                return
        }

        public b(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a() {
                r3 = this;
                int r0 = r3.c
                r1 = 46
                if (r0 != 0) goto L1d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r3.a
                r0.append(r2)
                r0.append(r1)
                int r1 = r3.b
            L15:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r2 = r3.a
                r0.append(r2)
                r0.append(r1)
                int r2 = r3.b
                r0.append(r2)
                r0.append(r1)
                int r1 = r3.c
                goto L15
        }

        public final int b() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public final int c() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final int d() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        public final void e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r7) {
                r5 = this;
                java.lang.String r0 = "writeVersion"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "writeVersionFull"
                kotlin.jvm.internal.g0.p(r7, r0)
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b.e
                boolean r0 = kotlin.jvm.internal.g0.g(r5, r0)
                if (r0 != 0) goto L43
                int r0 = r5.a
                r1 = 7
                if (r0 > r1) goto L32
                int r2 = r5.b
                r3 = 15
                if (r2 > r3) goto L32
                int r3 = r5.c
                r4 = 127(0x7f, float:1.78E-43)
                if (r3 <= r4) goto L24
                goto L32
            L24:
                int r7 = r2 << 3
                r7 = r7 | r0
                int r0 = r3 << 7
                r7 = r7 | r0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6.invoke(r7)
                return
            L32:
                int r6 = r5.b
                int r6 = r6 << 8
                r6 = r6 | r0
                int r0 = r5.c
                int r0 = r0 << 16
                r6 = r6 | r0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.invoke(r6)
            L43:
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r5 = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b) r5
                int r1 = r4.a
                int r3 = r5.a
                if (r1 == r3) goto L13
                return r2
            L13:
                int r1 = r4.b
                int r3 = r5.b
                if (r1 == r3) goto L1a
                return r2
            L1a:
                int r1 = r4.c
                int r5 = r5.c
                if (r1 == r5) goto L21
                return r2
            L21:
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.a
                int r0 = r0 * 31
                int r1 = r2.b
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.c
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.a()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$a r0 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.f = r0
            return
    }

    public i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind r3, @org.jetbrains.annotations.NotNull kotlin.DeprecationLevel r4, @org.jetbrains.annotations.Nullable java.lang.Integer r5, @org.jetbrains.annotations.Nullable java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "version"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "level"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer a() {
            r1 = this;
            java.lang.Integer r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.DeprecationLevel c() {
            r1 = this;
            kotlin.DeprecationLevel r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "since "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.i$b r1 = r4.a
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            kotlin.DeprecationLevel r1 = r4.c
            r0.append(r1)
            java.lang.Integer r1 = r4.d
            java.lang.String r2 = ""
            if (r1 == 0) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = " error "
            r1.append(r3)
            java.lang.Integer r3 = r4.d
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L34
        L33:
            r1 = r2
        L34:
            r0.append(r1)
            java.lang.String r1 = r4.e
            if (r1 == 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": "
            r1.append(r2)
            java.lang.String r2 = r4.e
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L4e:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

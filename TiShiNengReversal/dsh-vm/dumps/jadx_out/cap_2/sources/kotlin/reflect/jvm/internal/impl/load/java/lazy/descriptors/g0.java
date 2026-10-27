package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1634#2,3:189\n1625#2:192\n1869#2:193\n1870#2:195\n1626#2:196\n774#2:197\n865#2,2:198\n1#3:194\n1#3:200\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n159#1:189,3\n161#1:192\n161#1:193\n161#1:195\n161#1:196\n184#1:197\n184#1:198,2\n161#1:194\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g0 extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a1 {

    @org.jetbrains.annotations.NotNull
    private final x3.u n;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j<java.util.Set<java.lang.String>> p;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.a, kotlin.reflect.jvm.internal.impl.descriptors.d> q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.name.f a;

        @org.jetbrains.annotations.Nullable
        private final x3.g b;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.Nullable x3.g r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.Nullable
        public final x3.g a() {
                r1 = this;
                x3.g r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.f b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.a
                if (r0 == 0) goto L12
                kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$a r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.a) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.a
                boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class b {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b {

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.descriptors.d a;

            public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
                    r1 = this;
                    java.lang.String r0 = "descriptor"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r0 = 0
                    r1.<init>(r0)
                    r1.a = r2
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.descriptors.d a() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$b, reason: collision with other inner class name */
        public static final class C0042b extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.C0042b a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$b r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$b
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.C0042b.a = r0
                    return
            }

            private C0042b() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class c extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.c a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$c r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$c
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.c.a = r0
                    return
            }

            private c() {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    return
            }
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public g0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull x3.u r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r4) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "jPackage"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "ownerDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2)
            r1.n = r3
            r1.o = r4
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e0 r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e0
            r4.<init>(r2, r1)
            kotlin.reflect.jvm.internal.impl.storage.j r3 = r3.g(r4)
            r1.p = r3
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f0 r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f0
            r4.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r3.c(r4)
            r1.q = r2
            return
    }

    static /* synthetic */ java.util.Set h0(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r1) {
            java.util.Set r0 = p0(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d i0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.a r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = j0(r0, r1, r2)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d j0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r15, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r16, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.a r17) {
            java.lang.String r0 = "request"
            r1 = r17
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.name.b r2 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = r15.o0()
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.f r3 = r1.b()
            r2.<init>(r0, r3)
            x3.g r0 = r1.a()
            if (r0 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r16.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r0 = r0.j()
            x3.g r3 = r1.a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r4 = r15.n0()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v$a r0 = r0.b(r3, r4)
            goto L43
        L33:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r16.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r0 = r0.j()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3 = r15.n0()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v$a r0 = r0.a(r2, r3)
        L43:
            r7 = 0
            if (r0 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r3 = r0.a()
            goto L4c
        L4b:
            r3 = r7
        L4c:
            if (r3 == 0) goto L53
            kotlin.reflect.jvm.internal.impl.name.b r4 = r3.c()
            goto L54
        L53:
            r4 = r7
        L54:
            if (r4 == 0) goto L63
            boolean r5 = r4.j()
            if (r5 != 0) goto L62
            boolean r4 = r4.i()
            if (r4 == 0) goto L63
        L62:
            return r7
        L63:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b r3 = r15.q0(r3)
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.a
            if (r4 == 0) goto L72
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.a) r3
            kotlin.reflect.jvm.internal.impl.descriptors.d r15 = r3.a()
            return r15
        L72:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.c
            if (r4 == 0) goto L77
            return r7
        L77:
            boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.C0042b
            if (r3 == 0) goto L146
            x3.g r1 = r1.a()
            if (r1 != 0) goto La6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r16.a()
            kotlin.reflect.jvm.internal.impl.load.java.t r8 = r1.d()
            kotlin.reflect.jvm.internal.impl.load.java.t$a r1 = new kotlin.reflect.jvm.internal.impl.load.java.t$a
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.v.a.C0053a
            if (r3 == 0) goto L92
            kotlin.reflect.jvm.internal.impl.load.kotlin.v$a$a r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.v.a.C0053a) r0
            goto L93
        L92:
            r0 = r7
        L93:
            if (r0 == 0) goto L9b
            byte[] r0 = r0.b()
            r3 = r0
            goto L9c
        L9b:
            r3 = r7
        L9c:
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            x3.g r1 = r8.b(r1)
        La6:
            r11 = r1
            if (r11 == 0) goto Lae
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r0 = r11.w()
            goto Laf
        Lae:
            r0 = r7
        Laf:
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.BINARY
            if (r0 == r1) goto Lf2
            if (r11 == 0) goto Lba
            kotlin.reflect.jvm.internal.impl.name.c r0 = r11.d()
            goto Lbb
        Lba:
            r0 = r7
        Lbb:
            if (r0 == 0) goto Lf1
            boolean r1 = r0.c()
            if (r1 != 0) goto Lf1
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r1 = r15.o0()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 != 0) goto Ld6
            goto Lf1
        Ld6:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n r8 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r10 = r15.o0()
            r13 = 8
            r14 = 0
            r12 = 0
            r9 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r15 = r16.a()
            kotlin.reflect.jvm.internal.impl.load.java.u r15 = r15.e()
            r15.a(r8)
            return r8
        Lf1:
            return r7
        Lf2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = "\nClassId: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "\nfindKotlinClass(JavaClass) = "
            r1.append(r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r16.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r4 = r15.n0()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.b(r3, r11, r4)
            r1.append(r3)
            java.lang.String r3 = "\nfindKotlinClass(ClassId) = "
            r1.append(r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r16.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r15 = r15.n0()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r15 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r3, r2, r15)
            r1.append(r15)
            r15 = 10
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L146:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d k0(kotlin.reflect.jvm.internal.impl.name.f r4, x3.g r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.name.h r0 = kotlin.reflect.jvm.internal.impl.name.h.a
            boolean r0 = r0.a(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            kotlin.reflect.jvm.internal.impl.storage.j<java.util.Set<java.lang.String>> r0 = r3.p
            java.lang.Object r0 = r0.invoke()
            java.util.Set r0 = (java.util.Set) r0
            if (r5 != 0) goto L21
            if (r0 == 0) goto L21
            java.lang.String r2 = r4.b()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L21
            return r1
        L21:
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$a, kotlin.reflect.jvm.internal.impl.descriptors.d> r0 = r3.q
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$a r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$a
            r1.<init>(r4, r5)
            java.lang.Object r4 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            return r4
    }

    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c n0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r0 = r0.f()
            return r0
    }

    private static final java.util.Set p0(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0 r1) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.t r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r1 = r1.o0()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            java.util.Set r0 = r0.a(r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b q0(kotlin.reflect.jvm.internal.impl.load.kotlin.x r3) {
            r2 = this;
            if (r3 != 0) goto L5
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$b r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.C0042b.a
            return r3
        L5:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
            if (r0 != r1) goto L2c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r0.n(r3)
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$a
            r0.<init>(r3)
            return r0
        L29:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$b r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.C0042b.a
            return r3
        L2c:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0$b$c r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g0.b.c.a
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c A() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c$a r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void C(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2) {
            r0 = this;
            java.lang.String r2 = "kindFilter"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.util.Set r1 = kotlin.collections.u1.k()
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k S() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = r1.o0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f g(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.m0(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r6) {
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r1 = r0.c()
            int r0 = r0.e()
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L22
            java.util.List r5 = kotlin.collections.f0.J()
            java.util.Collection r5 = (java.util.Collection) r5
            return r5
        L22:
            kotlin.reflect.jvm.internal.impl.storage.i r5 = r4.L()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L35
            r0.add(r1)
            goto L35
        L61:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.d l0(@org.jetbrains.annotations.NotNull x3.g r2) {
            r1 = this;
            java.lang.String r0 = "javaClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.k0(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.d m0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.k0(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 o0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = r1.o
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r0 = r0.e()
            boolean r4 = r4.a(r0)
            if (r4 != 0) goto L16
            java.util.Set r4 = kotlin.collections.u1.k()
            return r4
        L16:
            kotlin.reflect.jvm.internal.impl.storage.j<java.util.Set<java.lang.String>> r4 = r3.p
            java.lang.Object r4 = r4.invoke()
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L3e
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            r5.add(r0)
            goto L29
        L3d:
            return r5
        L3e:
            x3.u r4 = r3.n
            if (r5 != 0) goto L46
            kotlin.jvm.functions.Function1 r5 = kotlin.reflect.jvm.internal.impl.utils.i.k()
        L46:
            java.util.Collection r4 = r4.G(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r4.next()
            x3.g r0 = (x3.g) r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = r0.w()
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r2 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE
            if (r1 != r2) goto L6b
            r0 = 0
            goto L6f
        L6b:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
        L6f:
            if (r0 == 0) goto L55
            r5.add(r0)
            goto L55
        L75:
            return r5
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2) {
            r0 = this;
            java.lang.String r2 = "kindFilter"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.util.Set r1 = kotlin.collections.u1.k()
            return r1
    }
}

package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class m {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m.a a = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m b = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m c = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m d = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m e = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m f = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m g = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m h = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m i = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m j = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m k = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.m l = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.m$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0062a {
            public static final /* synthetic */ int[] a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT     // Catch: java.lang.NoSuchFieldError -> L2b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                L2b:
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS     // Catch: java.lang.NoSuchFieldError -> L34
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                L34:
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                L3d:
                    kotlin.reflect.jvm.internal.impl.renderer.m.a.C0062a.a = r0
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

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.g r4) {
                r3 = this;
                java.lang.String r0 = "classifier"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
                if (r0 == 0) goto Lc
                java.lang.String r4 = "typealias"
                return r4
            Lc:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r0 == 0) goto L42
                kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
                boolean r0 = r4.l0()
                if (r0 == 0) goto L1b
                java.lang.String r4 = "companion object"
                return r4
            L1b:
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r4.h()
                int[] r0 = kotlin.reflect.jvm.internal.impl.renderer.m.a.C0062a.a
                int r4 = r4.ordinal()
                r4 = r0[r4]
                switch(r4) {
                    case 1: goto L3f;
                    case 2: goto L3c;
                    case 3: goto L39;
                    case 4: goto L36;
                    case 5: goto L33;
                    case 6: goto L30;
                    default: goto L2a;
                }
            L2a:
                kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                r4.<init>()
                throw r4
            L30:
                java.lang.String r4 = "enum entry"
                return r4
            L33:
                java.lang.String r4 = "annotation class"
                return r4
            L36:
                java.lang.String r4 = "object"
                return r4
            L39:
                java.lang.String r4 = "enum class"
                return r4
            L3c:
                java.lang.String r4 = "interface"
                return r4
            L3f:
                java.lang.String r4 = "class"
                return r4
            L42:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected classifier: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.renderer.m b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.renderer.u, kotlin.n1> r2) {
                r1 = this;
                java.lang.String r0 = "changeOptions"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.renderer.x r0 = new kotlin.reflect.jvm.internal.impl.renderer.x
                r0.<init>()
                r2.invoke(r0)
                r0.r0()
                kotlin.reflect.jvm.internal.impl.renderer.t r2 = new kotlin.reflect.jvm.internal.impl.renderer.t
                r2.<init>(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a implements kotlin.reflect.jvm.internal.impl.renderer.m.b {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.reflect.jvm.internal.impl.renderer.m.b.a a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.renderer.m$b$a r0 = new kotlin.reflect.jvm.internal.impl.renderer.m$b$a
                    r0.<init>()
                    kotlin.reflect.jvm.internal.impl.renderer.m.b.a.a = r0
                    return
            }

            private a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.m.b
            public void a(int r1, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r2) {
                    r0 = this;
                    java.lang.String r1 = "builder"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    java.lang.String r1 = "("
                    r2.append(r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.m.b
            public void b(int r1, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r2) {
                    r0 = this;
                    java.lang.String r1 = "builder"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    java.lang.String r1 = ")"
                    r2.append(r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.m.b
            public void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r4) {
                    r0 = this;
                    java.lang.String r2 = "parameter"
                    kotlin.jvm.internal.g0.p(r1, r2)
                    java.lang.String r1 = "builder"
                    kotlin.jvm.internal.g0.p(r4, r1)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.m.b
            public void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r2, int r3, int r4, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r5) {
                    r1 = this;
                    java.lang.String r0 = "parameter"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r2 = "builder"
                    kotlin.jvm.internal.g0.p(r5, r2)
                    int r4 = r4 + (-1)
                    if (r3 == r4) goto L13
                    java.lang.String r2 = ", "
                    r5.append(r2)
                L13:
                    return
            }
        }

        void a(int r1, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r2);

        void b(int r1, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r2);

        void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r4);

        void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r4);
    }

    static {
            kotlin.reflect.jvm.internal.impl.renderer.m$a r0 = new kotlin.reflect.jvm.internal.impl.renderer.m$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.a = r0
            kotlin.reflect.jvm.internal.impl.renderer.b r1 = kotlin.reflect.jvm.internal.impl.renderer.b.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.b = r1
            kotlin.reflect.jvm.internal.impl.renderer.d r1 = kotlin.reflect.jvm.internal.impl.renderer.d.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.c = r1
            kotlin.reflect.jvm.internal.impl.renderer.e r1 = kotlin.reflect.jvm.internal.impl.renderer.e.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.d = r1
            kotlin.reflect.jvm.internal.impl.renderer.f r1 = kotlin.reflect.jvm.internal.impl.renderer.f.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.e = r1
            kotlin.reflect.jvm.internal.impl.renderer.g r1 = kotlin.reflect.jvm.internal.impl.renderer.g.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.f = r1
            kotlin.reflect.jvm.internal.impl.renderer.h r1 = kotlin.reflect.jvm.internal.impl.renderer.h.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.g = r1
            kotlin.reflect.jvm.internal.impl.renderer.i r1 = kotlin.reflect.jvm.internal.impl.renderer.i.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.h = r1
            kotlin.reflect.jvm.internal.impl.renderer.j r1 = kotlin.reflect.jvm.internal.impl.renderer.j.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.i = r1
            kotlin.reflect.jvm.internal.impl.renderer.k r1 = kotlin.reflect.jvm.internal.impl.renderer.k.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.j = r1
            kotlin.reflect.jvm.internal.impl.renderer.l r1 = kotlin.reflect.jvm.internal.impl.renderer.l.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.k = r1
            kotlin.reflect.jvm.internal.impl.renderer.c r1 = kotlin.reflect.jvm.internal.impl.renderer.c.a
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = r0.b(r1)
            kotlin.reflect.jvm.internal.impl.renderer.m.l = r0
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.n1 A(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.renderer.a$b r0 = kotlin.reflect.jvm.internal.impl.renderer.a.b.a
            r1.p(r0)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED
            r1.a(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 B(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    static /* synthetic */ kotlin.n1 C(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = B(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 D(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = t(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 E(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = y(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 F(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = r(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 G(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = s(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 H(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = u(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 I(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = z(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 J(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = w(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 K(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = x(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 L(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = A(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 M(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = v(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String P(kotlin.reflect.jvm.internal.impl.renderer.m r0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.lang.String r0 = r0.O(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: renderAnnotation"
            r0.<init>(r1)
            throw r0
    }

    private static final kotlin.n1 r(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            r1.k(r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 s(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            r1.k(r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r1.g(r0)
            r0 = 1
            r1.l(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 t(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            r1.k(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 u(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r1.g(r0)
            kotlin.reflect.jvm.internal.impl.renderer.a$b r0 = kotlin.reflect.jvm.internal.impl.renderer.a.b.a
            r1.p(r0)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED
            r1.a(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 v(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            r1.h(r0)
            kotlin.reflect.jvm.internal.impl.renderer.a$a r0 = kotlin.reflect.jvm.internal.impl.renderer.a.C0061a.a
            r1.p(r0)
            java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 w(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 x(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 y(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            r1.n(r0)
            java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 z(kotlin.reflect.jvm.internal.impl.renderer.u r2) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r2.k(r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r2.g(r0)
            kotlin.reflect.jvm.internal.impl.renderer.a$b r0 = kotlin.reflect.jvm.internal.impl.renderer.a.b.a
            r2.p(r0)
            r0 = 1
            r2.i(r0)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE
            r2.a(r1)
            r2.m(r0)
            r2.q(r0)
            r2.l(r0)
            r2.j(r0)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String N(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String O(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r2);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String Q(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r3);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String R(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r1);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, boolean r2);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r1);

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.renderer.m V(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.renderer.u, kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "changeOptions"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl"
            kotlin.jvm.internal.g0.n(r1, r0)
            r0 = r1
            kotlin.reflect.jvm.internal.impl.renderer.t r0 = (kotlin.reflect.jvm.internal.impl.renderer.t) r0
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r0.L0()
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r0.t()
            r2.invoke(r0)
            r0.r0()
            kotlin.reflect.jvm.internal.impl.renderer.t r2 = new kotlin.reflect.jvm.internal.impl.renderer.t
            r2.<init>(r0)
            return r2
    }
}

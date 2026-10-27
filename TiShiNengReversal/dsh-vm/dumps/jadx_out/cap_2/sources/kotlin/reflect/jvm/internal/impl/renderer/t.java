package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n152#1,10:1226\n152#1,10:1236\n2746#2,3:1246\n774#2:1249\n865#2,2:1250\n1563#2:1252\n1634#2,3:1253\n774#2:1256\n865#2,2:1257\n1563#2:1259\n1634#2,3:1260\n1563#2:1263\n1634#2,3:1264\n1617#2,9:1268\n1869#2:1277\n1870#2:1279\n1626#2:1280\n2746#2,3:1281\n2746#2,3:1284\n774#2:1287\n865#2,2:1288\n1634#2,3:1290\n1#3:1267\n1#3:1278\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n138#1:1226,10\n145#1:1236,10\n200#1:1246,3\n501#1:1249\n501#1:1250,2\n502#1:1252\n502#1:1253,3\n504#1:1256\n504#1:1257,2\n504#1:1259\n504#1:1260,3\n506#1:1263\n506#1:1264,3\n515#1:1268,9\n515#1:1277\n515#1:1279\n515#1:1280\n606#1:1281,3\n608#1:1284,3\n824#1:1287\n824#1:1288,2\n847#1:1290,3\n515#1:1278\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t extends kotlin.reflect.jvm.internal.impl.renderer.m implements kotlin.reflect.jvm.internal.impl.renderer.u {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.renderer.x m;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class a implements kotlin.reflect.jvm.internal.impl.descriptors.m<kotlin.n1, java.lang.StringBuilder> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.t a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.t$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0063a {
            public static final /* synthetic */ int[] a = null;

            static {
                    kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] r0 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.PRETTY     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    kotlin.reflect.jvm.internal.impl.renderer.t.a.C0063a.a = r0
                    return
            }
        }

        public a(kotlin.reflect.jvm.internal.impl.renderer.t r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        private final void t(kotlin.reflect.jvm.internal.impl.descriptors.v0 r3, java.lang.StringBuilder r4, java.lang.String r5) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r2.a
                kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r0 = r0.Q0()
                int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.t.a.C0063a.a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L22
                r5 = 2
                if (r0 == r5) goto L1e
                r3 = 3
                if (r0 != r3) goto L18
                return
            L18:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            L1e:
                r2.p(r3, r4)
                return
            L22:
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r2.a
                kotlin.reflect.jvm.internal.impl.renderer.t.W(r0, r3, r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                java.lang.String r5 = " for "
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.append(r5)
                kotlin.reflect.jvm.internal.impl.renderer.t r5 = r2.a
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = r3.h0()
                java.lang.String r0 = "getCorrespondingProperty(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t.d0(r5, r3, r4)
                return
        }

        public void A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r3, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r4) {
                r2 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r2.a
                r1 = 1
                kotlin.reflect.jvm.internal.impl.renderer.t.g0(r0, r3, r1, r4, r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 a(kotlin.reflect.jvm.internal.impl.descriptors.d r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.n(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 b(kotlin.reflect.jvm.internal.impl.descriptors.s0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.s(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 c(kotlin.reflect.jvm.internal.impl.descriptors.w0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.u(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 d(kotlin.reflect.jvm.internal.impl.descriptors.y0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.w(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 e(kotlin.reflect.jvm.internal.impl.descriptors.q1 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.A(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 f(kotlin.reflect.jvm.internal.impl.descriptors.j r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.o(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 g(kotlin.reflect.jvm.internal.impl.descriptors.z0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.x(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 h(kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.z(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 i(kotlin.reflect.jvm.internal.impl.descriptors.i1 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.y(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 j(kotlin.reflect.jvm.internal.impl.descriptors.x0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.v(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 k(kotlin.reflect.jvm.internal.impl.descriptors.l0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.r(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 l(kotlin.reflect.jvm.internal.impl.descriptors.y r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.p(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ kotlin.n1 m(kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, java.lang.StringBuilder r2) {
                r0 = this;
                java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
                r0.q(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public void n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.X(r0, r2, r3)
                return
        }

        public void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "constructorDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.Y(r0, r2, r3)
                return
        }

        public void p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.Z(r0, r2, r3)
                return
        }

        public void q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r4) {
                r2 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r2.a
                r1 = 1
                kotlin.reflect.jvm.internal.impl.renderer.t.a0(r0, r3, r4, r1)
                return
        }

        public void r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.l0 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.b0(r0, r2, r3)
                return
        }

        public void s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s0 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.c0(r0, r2, r3)
                return
        }

        public void u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.d0(r0, r2, r3)
                return
        }

        public void v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.x0 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "getter"
                r1.t(r2, r3, r0)
                return
        }

        public void w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y0 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "setter"
                r1.t(r2, r3, r0)
                return
        }

        public void x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.z0 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                r3.append(r2)
                return
        }

        public void y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r2, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r3) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r1.a
                kotlin.reflect.jvm.internal.impl.renderer.t.e0(r0, r2, r3)
                return
        }

        public void z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r3, @org.jetbrains.annotations.NotNull java.lang.StringBuilder r4) {
                r2 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.renderer.t r0 = r2.a
                r1 = 1
                kotlin.reflect.jvm.internal.impl.renderer.t.f0(r0, r3, r4, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;
        public static final /* synthetic */ int[] b = null;

        static {
                kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] r0 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r2 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN     // Catch: java.lang.NoSuchFieldError -> L10
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                r2 = 2
                kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r3 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML     // Catch: java.lang.NoSuchFieldError -> L19
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.renderer.t.b.a = r0
                kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] r0 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r3 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL     // Catch: java.lang.NoSuchFieldError -> L2a
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2a
            L2a:
                kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED     // Catch: java.lang.NoSuchFieldError -> L32
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
            L32:
                kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                kotlin.reflect.jvm.internal.impl.renderer.t.b.b = r0
                return
        }
    }

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.x r2) {
            r1 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.m = r2
            r2.q0()
            kotlin.reflect.jvm.internal.impl.renderer.n r2 = new kotlin.reflect.jvm.internal.impl.renderer.n
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.n = r2
            return
    }

    private final void A1(java.lang.StringBuilder r5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r6, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r7) {
            r4 = this;
            java.util.Set r0 = r4.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            goto L69
        Ld:
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.types.t0
            if (r0 == 0) goto L16
            java.util.Set r0 = r4.c()
            goto L1a
        L16:
            java.util.Set r0 = r4.C0()
        L1a:
            kotlin.jvm.functions.Function1 r1 = r4.w0()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6 = r6.getAnnotations()
            java.util.Iterator r6 = r6.iterator()
        L26:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r2
            kotlin.reflect.jvm.internal.impl.name.c r3 = r2.d()
            boolean r3 = kotlin.collections.f0.a2(r0, r3)
            if (r3 != 0) goto L26
            boolean r3 = r4.t1(r2)
            if (r3 != 0) goto L26
            if (r1 == 0) goto L50
            java.lang.Object r3 = r1.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L26
        L50:
            java.lang.String r2 = r4.O(r2, r7)
            r5.append(r2)
            boolean r2 = r4.B0()
            if (r2 == 0) goto L63
            r2 = 10
            r5.append(r2)
            goto L26
        L63:
            java.lang.String r2 = " "
            r5.append(r2)
            goto L26
        L69:
            return
    }

    private final void A2(kotlin.reflect.jvm.internal.impl.descriptors.s1 r1, java.lang.StringBuilder r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto L8
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.q1
            if (r3 != 0) goto L7
            goto L8
        L7:
            return
        L8:
            boolean r1 = r1.C()
            if (r1 == 0) goto L11
            java.lang.String r1 = "var"
            goto L13
        L11:
            java.lang.String r1 = "val"
        L13:
            java.lang.String r1 = r0.T1(r1)
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            return
    }

    static /* synthetic */ void B1(kotlin.reflect.jvm.internal.impl.renderer.t r0, java.lang.StringBuilder r1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.A1(r1, r2, r3)
            return
    }

    static /* synthetic */ void B2(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.s1 r1, java.lang.StringBuilder r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.A2(r1, r2, r3)
            return
    }

    private final void C1(kotlin.reflect.jvm.internal.impl.descriptors.g r4, java.lang.StringBuilder r5) {
            r3 = this;
            java.util.List r0 = r4.t()
            java.lang.String r1 = "getDeclaredTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r4.o()
            java.util.List r1 = r1.getParameters()
            java.lang.String r2 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r2 = r3.k1()
            if (r2 == 0) goto L45
            boolean r4 = r4.k()
            if (r4 == 0) goto L45
            int r4 = r1.size()
            int r2 = r0.size()
            if (r4 <= r2) goto L45
            java.lang.String r4 = " /*captured type parameters: "
            r5.append(r4)
            int r4 = r0.size()
            int r0 = r1.size()
            java.util.List r4 = r1.subList(r4, r0)
            r3.y2(r5, r4)
            java.lang.String r4 = "*/"
            r5.append(r4)
        L45:
            return
    }

    private final void C2(kotlin.reflect.jvm.internal.impl.descriptors.q1 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.T1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.k1()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
            java.lang.String r2 = "*/ "
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            B1(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.w0()
            java.lang.String r3 = "crossinline"
            r8.Z1(r11, r2, r3)
            boolean r2 = r9.u0()
            java.lang.String r3 = "noinline"
            r8.Z1(r11, r2, r3)
            boolean r2 = r8.Z0()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = r9.b()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c
            if (r3 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.m0()
            if (r2 != r7) goto L60
            r5 = 1
            goto L61
        L60:
            r5 = 0
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.u0()
            java.lang.String r3 = "actual"
            r8.Z1(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.E2(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function1 r0 = r8.A0()
            if (r0 == 0) goto L8c
            boolean r0 = r8.d()
            if (r0 == 0) goto L85
            boolean r0 = r9.Q()
            goto L89
        L85:
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.f(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = 1
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            kotlin.jvm.functions.Function1 r2 = r8.A0()
            kotlin.jvm.internal.g0.m(r2)
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
    }

    private final kotlin.reflect.jvm.internal.impl.renderer.t D0() {
            r1 = this;
            kotlin.s r0 = r1.n
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.renderer.t r0 = (kotlin.reflect.jvm.internal.impl.renderer.t) r0
            return r0
    }

    private final void D1(kotlin.reflect.jvm.internal.impl.descriptors.d r11, java.lang.StringBuilder r12) {
            r10 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r11.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            r6 = 0
            r7 = 1
            if (r2 != r3) goto Lc
            r8 = 1
            goto Ld
        Lc:
            r8 = 0
        Ld:
            boolean r2 = r10.e1()
            java.lang.String r9 = "getVisibility(...)"
            if (r2 != 0) goto Lf0
            java.util.List r2 = r11.j0()
            java.lang.String r3 = "getContextReceivers(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r10.K1(r2, r12)
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r10
            r2 = r11
            r1 = r12
            B1(r0, r1, r2, r3, r4, r5)
            if (r8 != 0) goto L36
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r11.getVisibility()
            kotlin.jvm.internal.g0.o(r2, r9)
            r10.F2(r2, r12)
        L36:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r11.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r2 != r3) goto L46
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = r11.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r2 == r3) goto L68
        L46:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r11.h()
            boolean r2 = r2.isSingleton()
            if (r2 == 0) goto L58
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = r11.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r2 == r3) goto L68
        L58:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = r11.i()
            java.lang.String r3 = "getModality(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r10.s1(r11)
            r10.X1(r2, r12, r3)
        L68:
            r10.V1(r11, r12)
            java.util.Set r2 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INNER
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L7f
            boolean r2 = r11.k()
            if (r2 == 0) goto L7f
            r2 = 1
            goto L80
        L7f:
            r2 = 0
        L80:
            java.lang.String r3 = "inner"
            r10.Z1(r12, r2, r3)
            java.util.Set r2 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.DATA
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L99
            boolean r2 = r11.w()
            if (r2 == 0) goto L99
            r2 = 1
            goto L9a
        L99:
            r2 = 0
        L9a:
            java.lang.String r3 = "data"
            r10.Z1(r12, r2, r3)
            java.util.Set r2 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INLINE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Lb3
            boolean r2 = r11.isInline()
            if (r2 == 0) goto Lb3
            r2 = 1
            goto Lb4
        Lb3:
            r2 = 0
        Lb4:
            java.lang.String r3 = "inline"
            r10.Z1(r12, r2, r3)
            java.util.Set r2 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VALUE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Lcd
            boolean r2 = r11.v()
            if (r2 == 0) goto Lcd
            r2 = 1
            goto Lce
        Lcd:
            r2 = 0
        Lce:
            java.lang.String r3 = "value"
            r10.Z1(r12, r2, r3)
            java.util.Set r2 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.FUN
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Le7
            boolean r2 = r11.u()
            if (r2 == 0) goto Le7
            r2 = 1
            goto Le8
        Le7:
            r2 = 0
        Le8:
            java.lang.String r3 = "fun"
            r10.Z1(r12, r2, r3)
            r10.E1(r11, r12)
        Lf0:
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r11)
            if (r2 != 0) goto L103
            boolean r2 = r10.e1()
            if (r2 != 0) goto Lff
            r10.n2(r12)
        Lff:
            r10.a2(r11, r12, r7)
            goto L106
        L103:
            r10.G1(r11, r12)
        L106:
            if (r8 == 0) goto L109
            return
        L109:
            java.util.List r7 = r11.t()
            java.lang.String r2 = "getDeclaredTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r7, r2)
            r10.z2(r7, r12, r6)
            r10.C1(r11, r12)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r11.h()
            boolean r2 = r2.isSingleton()
            if (r2 != 0) goto L160
            boolean r2 = r10.y0()
            if (r2 == 0) goto L160
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = r11.z()
            if (r2 == 0) goto L160
            java.lang.String r3 = " "
            r12.append(r3)
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r10
            r1 = r12
            B1(r0, r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = r2.getVisibility()
            kotlin.jvm.internal.g0.o(r3, r9)
            r10.F2(r3, r12)
            java.lang.String r3 = "constructor"
            java.lang.String r3 = r10.T1(r3)
            r12.append(r3)
            java.util.List r3 = r2.g()
            java.lang.String r4 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.n0()
            r10.D2(r3, r2, r12)
        L160:
            r10.o2(r11, r12)
            r10.G2(r7, r12)
            return
    }

    private final void D2(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r7, boolean r8, java.lang.StringBuilder r9) {
            r6 = this;
            boolean r8 = r6.I2(r8)
            int r0 = r7.size()
            kotlin.reflect.jvm.internal.impl.renderer.m$b r1 = r6.j1()
            r1.a(r0, r9)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r2 = 0
        L17:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L38
            int r3 = r2 + 1
            java.lang.Object r4 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            kotlin.reflect.jvm.internal.impl.renderer.m$b r5 = r6.j1()
            r5.c(r4, r2, r0, r9)
            r6.C2(r4, r8, r9, r1)
            kotlin.reflect.jvm.internal.impl.renderer.m$b r5 = r6.j1()
            r5.d(r4, r2, r0, r9)
            r2 = r3
            goto L17
        L38:
            kotlin.reflect.jvm.internal.impl.renderer.m$b r7 = r6.j1()
            r7.b(r0, r9)
            return
    }

    private final void E1(kotlin.reflect.jvm.internal.impl.descriptors.d r2, java.lang.StringBuilder r3) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.m$a r0 = kotlin.reflect.jvm.internal.impl.renderer.m.a
            java.lang.String r2 = r0.a(r2)
            java.lang.String r2 = r1.T1(r2)
            r3.append(r2)
            return
    }

    private final void E2(kotlin.reflect.jvm.internal.impl.descriptors.s1 r6, boolean r7, java.lang.StringBuilder r8, boolean r9, boolean r10) {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r6.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.q1
            r2 = 0
            if (r1 == 0) goto L12
            r1 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r1
            goto L13
        L12:
            r1 = r2
        L13:
            if (r1 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r1.z0()
        L19:
            if (r2 != 0) goto L1d
            r1 = r0
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r2 == 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            java.lang.String r4 = "vararg"
            r5.Z1(r8, r3, r4)
            if (r10 != 0) goto L32
            if (r9 == 0) goto L35
            boolean r3 = r5.e1()
            if (r3 != 0) goto L35
        L32:
            r5.A2(r6, r8, r10)
        L35:
            if (r7 == 0) goto L3f
            r5.a2(r6, r8, r9)
            java.lang.String r7 = ": "
            r8.append(r7)
        L3f:
            java.lang.String r7 = r5.T(r1)
            r8.append(r7)
            r5.S1(r6, r8)
            boolean r6 = r5.k1()
            if (r6 == 0) goto L62
            if (r2 == 0) goto L62
            java.lang.String r6 = " /*"
            r8.append(r6)
            java.lang.String r6 = r5.T(r0)
            r8.append(r6)
            java.lang.String r6 = "*/"
            r8.append(r6)
        L62:
            return
    }

    private final boolean F2(kotlin.reflect.jvm.internal.impl.descriptors.s r3, java.lang.StringBuilder r4) {
            r2 = this;
            java.util.Set r0 = r2.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VISIBILITY
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            boolean r0 = r2.K0()
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = r3.f()
        L18:
            boolean r0 = r2.Y0()
            if (r0 != 0) goto L27
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.l
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto L27
            return r1
        L27:
            java.lang.String r3 = r3.c()
            java.lang.String r3 = r2.T1(r3)
            r4.append(r3)
            java.lang.String r3 = " "
            r4.append(r3)
            r3 = 1
            return r3
    }

    private final void G1(kotlin.reflect.jvm.internal.impl.descriptors.k r4, java.lang.StringBuilder r5) {
            r3 = this;
            boolean r0 = r3.T0()
            java.lang.String r1 = "getName(...)"
            if (r0 == 0) goto L30
            boolean r0 = r3.e1()
            if (r0 == 0) goto L13
            java.lang.String r0 = "companion object"
            r5.append(r0)
        L13:
            r3.n2(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.b()
            if (r0 == 0) goto L30
            java.lang.String r2 = "of "
            r5.append(r2)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            kotlin.jvm.internal.g0.o(r0, r1)
            r2 = 0
            java.lang.String r0 = r3.S(r0, r2)
            r5.append(r0)
        L30:
            boolean r0 = r3.k1()
            if (r0 != 0) goto L44
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.h.d
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L43
            goto L44
        L43:
            return
        L44:
            boolean r0 = r3.e1()
            if (r0 != 0) goto L4d
            r3.n2(r5)
        L4d:
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            kotlin.jvm.internal.g0.o(r4, r1)
            r0 = 1
            java.lang.String r4 = r3.S(r4, r0)
            r5.append(r4)
            return
    }

    private final void G2(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r12, java.lang.StringBuilder r13) {
            r11 = this;
            boolean r0 = r11.p1()
            if (r0 == 0) goto L8
            goto L91
        L8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 0
            r1.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L12:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r12.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            java.util.List r3 = r2.getUpperBounds()
            java.lang.String r4 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 1
            java.util.List r3 = kotlin.collections.f0.g2(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L34:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L12
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            kotlin.reflect.jvm.internal.impl.name.f r6 = r2.getName()
            java.lang.String r7 = "getName(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            java.lang.String r6 = r11.S(r6, r0)
            r5.append(r6)
            java.lang.String r6 = " : "
            r5.append(r6)
            kotlin.jvm.internal.g0.m(r4)
            java.lang.String r4 = r11.T(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.add(r4)
            goto L34
        L6c:
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L91
            java.lang.String r12 = " "
            r13.append(r12)
            java.lang.String r0 = "where"
            java.lang.String r0 = r11.T1(r0)
            r13.append(r0)
            r13.append(r12)
            r9 = 124(0x7c, float:1.74E-43)
            r10 = 0
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r13
            kotlin.collections.f0.p3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L91:
            return
    }

    private final java.lang.String H1(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r10) {
            r9 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r9.m
            kotlin.jvm.functions.Function1 r0 = r0.Q()
            if (r0 == 0) goto Lf
            java.lang.Object r10 = r0.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        Lf:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b
            if (r0 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) r10
            java.lang.Object r10 = r10.a()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L24:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r10.next()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1
            java.lang.String r1 = r9.H1(r1)
            if (r1 == 0) goto L24
            r0.add(r1)
            goto L24
        L3a:
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r10 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L4b:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a
            if (r0 == 0) goto L64
            kotlin.reflect.jvm.internal.impl.resolve.constants.a r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.a) r10
            java.lang.Object r10 = r10.a()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r10 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r10
            r0 = 2
            r1 = 0
            java.lang.String r10 = kotlin.reflect.jvm.internal.impl.renderer.m.P(r9, r10, r1, r0, r1)
            java.lang.String r0 = "@"
            java.lang.String r10 = kotlin.text.u.v4(r10, r0)
            return r10
        L64:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t
            if (r0 == 0) goto Ld4
            kotlin.reflect.jvm.internal.impl.resolve.constants.t r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t) r10
            java.lang.Object r10 = r10.a()
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b) r10
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.a
            java.lang.String r1 = "::class"
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$a r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.a) r10
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = r10.getType()
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            return r10
        L8c:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b
            if (r0 == 0) goto Lce
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b r10 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b) r10
            kotlin.reflect.jvm.internal.impl.name.b r0 = r10.b()
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.a()
            java.lang.String r0 = r0.a()
            int r10 = r10.a()
            r2 = 0
        La3:
            if (r2 >= r10) goto Lbe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "kotlin.Array<"
            r3.append(r4)
            r3.append(r0)
            r0 = 62
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto La3
        Lbe:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            return r10
        Lce:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Ld4:
            java.lang.String r10 = r10.toString()
            return r10
    }

    private final boolean H2(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.i.p(r2)
            if (r0 == 0) goto L33
            java.util.List r2 = r2.G0()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            goto L31
        L1a:
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = (kotlin.reflect.jvm.internal.impl.types.c2) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L1e
            goto L33
        L31:
            r2 = 1
            return r2
        L33:
            r2 = 0
            return r2
    }

    private final void I1(kotlin.reflect.jvm.internal.impl.descriptors.j r18, java.lang.StringBuilder r19) {
            r17 = this;
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r17
            r2 = r18
            r1 = r19
            B1(r0, r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.renderer.x r2 = r0.m
            boolean r2 = r2.Y()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L22
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r18.J()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = r2.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r2 == r5) goto L33
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r18.getVisibility()
            java.lang.String r5 = "getVisibility(...)"
            kotlin.jvm.internal.g0.o(r2, r5)
            boolean r2 = r0.F2(r2, r1)
            if (r2 == 0) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            r17.U1(r18, r19)
            boolean r5 = r0.V0()
            if (r5 != 0) goto L48
            boolean r5 = r18.m0()
            if (r5 == 0) goto L48
            if (r2 == 0) goto L46
            goto L48
        L46:
            r2 = 0
            goto L49
        L48:
            r2 = 1
        L49:
            if (r2 == 0) goto L54
            java.lang.String r5 = "constructor"
            java.lang.String r5 = r0.T1(r5)
            r1.append(r5)
        L54:
            kotlin.reflect.jvm.internal.impl.descriptors.g r5 = r18.b()
            java.lang.String r6 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            boolean r6 = r0.c1()
            java.lang.String r7 = "getTypeParameters(...)"
            if (r6 == 0) goto L79
            if (r2 == 0) goto L6c
            java.lang.String r2 = " "
            r1.append(r2)
        L6c:
            r0.a2(r5, r1, r4)
            java.util.List r2 = r18.getTypeParameters()
            kotlin.jvm.internal.g0.o(r2, r7)
            r0.z2(r2, r1, r3)
        L79:
            java.util.List r2 = r18.g()
            java.lang.String r3 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r4 = r18.n0()
            r0.D2(r2, r4, r1)
            boolean r2 = r0.U0()
            if (r2 == 0) goto Lfb
            boolean r2 = r18.m0()
            if (r2 != 0) goto Lfb
            boolean r2 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto Lfb
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r5
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = r5.z()
            if (r2 == 0) goto Lfb
            java.util.List r2 = r2.g()
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lb5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld2
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            boolean r5 = r4.Q()
            if (r5 != 0) goto Lb5
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.z0()
            if (r4 != 0) goto Lb5
            r8.add(r3)
            goto Lb5
        Ld2:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto Lfb
            java.lang.String r2 = " : "
            r1.append(r2)
            java.lang.String r2 = "this"
            java.lang.String r2 = r0.T1(r2)
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.renderer.q r14 = kotlin.reflect.jvm.internal.impl.renderer.q.a
            r15 = 24
            r16 = 0
            java.lang.String r9 = ", "
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            r12 = 0
            r13 = 0
            java.lang.String r2 = kotlin.collections.f0.r3(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.append(r2)
        Lfb:
            boolean r2 = r0.c1()
            if (r2 == 0) goto L10b
            java.util.List r2 = r18.getTypeParameters()
            kotlin.jvm.internal.g0.o(r2, r7)
            r0.G2(r2, r1)
        L10b:
            return
    }

    private final boolean I2(boolean r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = r4.N0()
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.t.b.b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L1d
            r5 = 3
            if (r0 != r5) goto L17
            return r3
        L17:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L1d:
            if (r5 != 0) goto L20
            return r1
        L20:
            return r3
        L21:
            return r1
    }

    private static final java.lang.CharSequence J1(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            java.lang.String r0 = ""
            return r0
    }

    private final void K1(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.z0> r6, java.lang.StringBuilder r7) {
            r5 = this;
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4c
            java.lang.String r0 = "context("
            r7.append(r0)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4c
            int r2 = r1 + 1
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER
            r5.A1(r7, r3, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            java.lang.String r4 = "getType(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.String r3 = r5.O1(r3)
            r7.append(r3)
            int r3 = kotlin.collections.f0.L(r6)
            if (r1 != r3) goto L45
            java.lang.String r1 = ") "
            r7.append(r1)
            goto L4a
        L45:
            java.lang.String r1 = ", "
            r7.append(r1)
        L4a:
            r1 = r2
            goto L16
        L4c:
            return
    }

    private final void L1(java.lang.StringBuilder r13, kotlin.reflect.jvm.internal.impl.types.t0 r14) {
            r12 = this;
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            B1(r0, r1, r2, r3, r4, r5)
            boolean r13 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.z
            r14 = 0
            if (r13 == 0) goto L12
            r13 = r2
            kotlin.reflect.jvm.internal.impl.types.z r13 = (kotlin.reflect.jvm.internal.impl.types.z) r13
            goto L13
        L12:
            r13 = r14
        L13:
            if (r13 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.types.e1 r14 = r13.U0()
        L19:
            boolean r13 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
            if (r13 == 0) goto L65
            boolean r13 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.A(r2)
            if (r13 == 0) goto L39
            boolean r13 = r12.P0()
            if (r13 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.types.error.i r13 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            java.lang.String r13 = r13.p(r2)
            java.lang.String r13 = r12.M1(r13)
            r1.append(r13)
            goto L95
        L39:
            boolean r13 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.error.g
            if (r13 == 0) goto L4e
            boolean r13 = r12.I0()
            if (r13 != 0) goto L4e
            r14 = r2
            kotlin.reflect.jvm.internal.impl.types.error.g r14 = (kotlin.reflect.jvm.internal.impl.types.error.g) r14
            java.lang.String r13 = r14.R0()
            r1.append(r13)
            goto L59
        L4e:
            kotlin.reflect.jvm.internal.impl.types.w1 r13 = r2.I0()
            java.lang.String r13 = r13.toString()
            r1.append(r13)
        L59:
            java.util.List r13 = r2.G0()
            java.lang.String r13 = r12.s2(r13)
            r1.append(r13)
            goto L95
        L65:
            boolean r13 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.n1
            if (r13 == 0) goto L78
            r14 = r2
            kotlin.reflect.jvm.internal.impl.types.n1 r14 = (kotlin.reflect.jvm.internal.impl.types.n1) r14
            kotlin.reflect.jvm.internal.impl.types.checker.r r13 = r14.R0()
            java.lang.String r13 = r13.toString()
            r1.append(r13)
            goto L95
        L78:
            boolean r13 = r14 instanceof kotlin.reflect.jvm.internal.impl.types.n1
            if (r13 == 0) goto L8a
            kotlin.reflect.jvm.internal.impl.types.n1 r14 = (kotlin.reflect.jvm.internal.impl.types.n1) r14
            kotlin.reflect.jvm.internal.impl.types.checker.r r13 = r14.R0()
            java.lang.String r13 = r13.toString()
            r1.append(r13)
            goto L95
        L8a:
            r10 = 2
            r11 = 0
            r9 = 0
            r6 = r0
            r7 = r1
            r8 = r2
            w2(r6, r7, r8, r9, r10, r11)
            kotlin.n1 r13 = kotlin.n1.a
        L95:
            boolean r13 = r2.J0()
            if (r13 == 0) goto La0
            java.lang.String r13 = "?"
            r1.append(r13)
        La0:
            boolean r13 = kotlin.reflect.jvm.internal.impl.types.i1.c(r2)
            if (r13 == 0) goto Lab
            java.lang.String r13 = " & Any"
            r1.append(r13)
        Lab:
            return
    }

    private final java.lang.String M1(java.lang.String r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.t.b.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 != r1) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<font color=red><b>"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "</b></font>"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L29:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L2f:
            return r3
    }

    private final void N1(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.types.a r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            if (r0 != r1) goto Ld
            java.lang.String r0 = "<font color=\"808080\"><i>"
            r3.append(r0)
        Ld:
            java.lang.String r0 = " /* "
            r3.append(r0)
            java.lang.String r0 = "= "
            r3.append(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.Z()
            r2.c2(r3, r4)
            java.lang.String r4 = " */"
            r3.append(r4)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r4 = r2.f1()
            if (r4 != r1) goto L2e
            java.lang.String r4 = "</i></font>"
            r3.append(r4)
        L2e:
            return
    }

    private final java.lang.String O1(kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r2 = this;
            java.lang.String r0 = r2.T(r3)
            boolean r1 = r2.H2(r3)
            if (r1 == 0) goto L10
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.l(r3)
            if (r1 == 0) goto L14
        L10:
            boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.z
            if (r3 == 0) goto L2b
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1 = 40
            r3.append(r1)
            r3.append(r0)
            r0 = 41
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L2b:
            return r0
    }

    private final java.lang.String P1(java.util.List<kotlin.reflect.jvm.internal.impl.name.f> r1) {
            r0 = this;
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.renderer.a0.c(r1)
            java.lang.String r1 = r0.r0(r1)
            return r1
    }

    private final void Q1(kotlin.reflect.jvm.internal.impl.descriptors.y r11, java.lang.StringBuilder r12) {
            r10 = this;
            boolean r0 = r10.e1()
            r1 = 1
            java.lang.String r2 = "getTypeParameters(...)"
            if (r0 != 0) goto L8b
            boolean r0 = r10.d1()
            if (r0 != 0) goto L6c
            java.util.List r0 = r11.A0()
            java.lang.String r3 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            r10.K1(r0, r12)
            r8 = 2
            r9 = 0
            r7 = 0
            r4 = r10
            r6 = r11
            r5 = r12
            B1(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.s r11 = r6.getVisibility()
            java.lang.String r12 = "getVisibility(...)"
            kotlin.jvm.internal.g0.o(r11, r12)
            r10.F2(r11, r5)
            r10.Y1(r6, r5)
            boolean r11 = r10.E0()
            if (r11 == 0) goto L3c
            r10.V1(r6, r5)
        L3c:
            r10.d2(r6, r5)
            boolean r11 = r10.E0()
            if (r11 == 0) goto L49
            r10.y1(r6, r5)
            goto L4c
        L49:
            r10.q2(r6, r5)
        L4c:
            r10.U1(r6, r5)
            boolean r11 = r10.k1()
            if (r11 == 0) goto L6f
            boolean r11 = r6.D0()
            if (r11 == 0) goto L60
            java.lang.String r11 = "/*isHiddenToOvercomeSignatureClash*/ "
            r5.append(r11)
        L60:
            boolean r11 = r6.S()
            if (r11 == 0) goto L6f
            java.lang.String r11 = "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "
            r5.append(r11)
            goto L6f
        L6c:
            r4 = r10
            r6 = r11
            r5 = r12
        L6f:
            java.lang.String r11 = "fun"
            java.lang.String r11 = r10.T1(r11)
            r5.append(r11)
            java.lang.String r11 = " "
            r5.append(r11)
            java.util.List r11 = r6.getTypeParameters()
            kotlin.jvm.internal.g0.o(r11, r2)
            r10.z2(r11, r5, r1)
            r10.k2(r6, r5)
            goto L8e
        L8b:
            r4 = r10
            r6 = r11
            r5 = r12
        L8e:
            r10.a2(r6, r5, r1)
            java.util.List r11 = r6.g()
            java.lang.String r12 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r11, r12)
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r12 = r6.n0()
            r10.D2(r11, r12, r5)
            r10.l2(r6, r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r6.getReturnType()
            boolean r12 = r10.n1()
            if (r12 != 0) goto Lcf
            boolean r12 = r10.i1()
            if (r12 != 0) goto Lbe
            if (r11 == 0) goto Lbe
            boolean r12 = kotlin.reflect.jvm.internal.impl.builtins.j.D0(r11)
            if (r12 != 0) goto Lcf
        Lbe:
            java.lang.String r12 = ": "
            r5.append(r12)
            if (r11 != 0) goto Lc8
            java.lang.String r11 = "[NULL]"
            goto Lcc
        Lc8:
            java.lang.String r11 = r10.T(r11)
        Lcc:
            r5.append(r11)
        Lcf:
            java.util.List r11 = r6.getTypeParameters()
            kotlin.jvm.internal.g0.o(r11, r2)
            r10.G2(r11, r5)
            return
    }

    private final void R1(java.lang.StringBuilder r12, kotlin.reflect.jvm.internal.impl.types.t0 r13) {
            r11 = this;
            int r0 = r12.length()
            kotlin.reflect.jvm.internal.impl.renderer.t r1 = r11.D0()
            r5 = 2
            r6 = 0
            r4 = 0
            r2 = r12
            r3 = r13
            B1(r1, r2, r3, r4, r5, r6)
            int r12 = r2.length()
            r13 = 0
            r1 = 1
            if (r12 == r0) goto L1a
            r12 = 1
            goto L1b
        L1a:
            r12 = 0
        L1b:
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = kotlin.reflect.jvm.internal.impl.builtins.i.k(r3)
            java.util.List r5 = kotlin.reflect.jvm.internal.impl.builtins.i.e(r3)
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.i.r(r3)
            boolean r7 = r3.J0()
            if (r7 != 0) goto L34
            if (r12 == 0) goto L32
            if (r4 == 0) goto L32
            goto L34
        L32:
            r8 = 0
            goto L35
        L34:
            r8 = 1
        L35:
            java.lang.String r9 = "("
            if (r8 == 0) goto L63
            if (r6 == 0) goto L41
            r12 = 40
            r2.insert(r0, r12)
            goto L63
        L41:
            if (r12 == 0) goto L60
            char r12 = kotlin.text.u.U7(r2)
            kotlin.text.b.r(r12)
            int r12 = kotlin.text.u.y3(r2)
            int r12 = r12 - r1
            char r12 = r2.charAt(r12)
            r0 = 41
            if (r12 == r0) goto L60
            int r12 = kotlin.text.u.y3(r2)
            java.lang.String r0 = "()"
            r2.insert(r12, r0)
        L60:
            r2.append(r9)
        L63:
            java.lang.String r12 = "suspend"
            r11.Z1(r2, r6, r12)
            r12 = r5
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            java.lang.String r0 = ") "
            java.lang.String r6 = ", "
            if (r12 != 0) goto La5
            java.lang.String r12 = "context("
            r2.append(r12)
            int r12 = kotlin.collections.f0.L(r5)
            java.util.List r12 = r5.subList(r13, r12)
            java.util.Iterator r12 = r12.iterator()
        L86:
            boolean r10 = r12.hasNext()
            if (r10 == 0) goto L99
            java.lang.Object r10 = r12.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r10 = (kotlin.reflect.jvm.internal.impl.types.t0) r10
            r11.b2(r2, r10)
            r2.append(r6)
            goto L86
        L99:
            java.lang.Object r12 = kotlin.collections.f0.u3(r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = (kotlin.reflect.jvm.internal.impl.types.t0) r12
            r11.b2(r2, r12)
            r2.append(r0)
        La5:
            java.lang.String r12 = ")"
            if (r4 == 0) goto Ld5
            boolean r5 = r11.H2(r4)
            if (r5 == 0) goto Lb5
            boolean r5 = r4.J0()
            if (r5 == 0) goto Lc2
        Lb5:
            boolean r5 = r11.r1(r4)
            if (r5 != 0) goto Lc2
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.z
            if (r5 == 0) goto Lc0
            goto Lc2
        Lc0:
            r5 = 0
            goto Lc3
        Lc2:
            r5 = 1
        Lc3:
            if (r5 == 0) goto Lc8
            r2.append(r9)
        Lc8:
            r11.b2(r2, r4)
            if (r5 == 0) goto Ld0
            r2.append(r12)
        Ld0:
            java.lang.String r4 = "."
            r2.append(r4)
        Ld5:
            r2.append(r9)
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.i.n(r3)
            if (r4 == 0) goto Lee
            java.util.List r4 = r3.G0()
            int r4 = r4.size()
            if (r4 > r1) goto Lee
            java.lang.String r13 = "???"
            r2.append(r13)
            goto L138
        Lee:
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.builtins.i.m(r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        Lf9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L138
            int r5 = r4 + 1
            java.lang.Object r9 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r9 = (kotlin.reflect.jvm.internal.impl.types.c2) r9
            if (r4 <= 0) goto L10c
            r2.append(r6)
        L10c:
            boolean r4 = r11.O0()
            if (r4 == 0) goto L120
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r9.getType()
            java.lang.String r10 = "getType(...)"
            kotlin.jvm.internal.g0.o(r4, r10)
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.builtins.i.d(r4)
            goto L121
        L120:
            r4 = 0
        L121:
            if (r4 == 0) goto L12f
            java.lang.String r4 = r11.S(r4, r13)
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
        L12f:
            java.lang.String r4 = r11.U(r9)
            r2.append(r4)
            r4 = r5
            goto Lf9
        L138:
            r2.append(r0)
            java.lang.String r13 = r11.q0()
            r2.append(r13)
            java.lang.String r13 = " "
            r2.append(r13)
            kotlin.reflect.jvm.internal.impl.types.t0 r13 = kotlin.reflect.jvm.internal.impl.builtins.i.l(r3)
            r11.b2(r2, r13)
            if (r8 == 0) goto L153
            r2.append(r12)
        L153:
            if (r7 == 0) goto L15a
            java.lang.String r12 = "?"
            r2.append(r12)
        L15a:
            return
    }

    private final void S1(kotlin.reflect.jvm.internal.impl.descriptors.s1 r2, java.lang.StringBuilder r3) {
            r1 = this;
            boolean r0 = r1.H0()
            if (r0 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r2 = r2.t0()
            if (r2 == 0) goto L1e
            java.lang.String r2 = r1.H1(r2)
            if (r2 == 0) goto L1e
            java.lang.String r0 = " = "
            r3.append(r0)
            java.lang.String r2 = r1.r0(r2)
            r3.append(r2)
        L1e:
            return
    }

    private final java.lang.String T1(java.lang.String r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.t.b.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L36
            r1 = 2
            if (r0 != r1) goto L30
            boolean r0 = r2.x0()
            if (r0 == 0) goto L19
            goto L36
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<b>"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "</b>"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L30:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L36:
            return r3
    }

    private final void U1(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3, java.lang.StringBuilder r4) {
            r2 = this;
            java.util.Set r0 = r2.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MEMBER_KIND
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            goto L34
        Ld:
            boolean r0 = r2.k1()
            if (r0 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r3.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r0 == r1) goto L34
            java.lang.String r0 = "/*"
            r4.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = r3.h()
            java.lang.String r3 = r3.name()
            java.lang.String r3 = e4.a.f(r3)
            r4.append(r3)
            java.lang.String r3 = "*/ "
            r4.append(r3)
        L34:
            return
    }

    private final void V1(kotlin.reflect.jvm.internal.impl.descriptors.c0 r5, java.lang.StringBuilder r6) {
            r4 = this;
            boolean r0 = r5.isExternal()
            java.lang.String r1 = "external"
            r4.Z1(r6, r0, r1)
            java.util.Set r0 = r4.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.EXPECT
            boolean r0 = r0.contains(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r5.q0()
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            java.lang.String r3 = "expect"
            r4.Z1(r6, r0, r3)
            java.util.Set r0 = r4.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ACTUAL
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L38
            boolean r5 = r5.i0()
            if (r5 == 0) goto L38
            r1 = 1
        L38:
            java.lang.String r5 = "actual"
            r4.Z1(r6, r1, r5)
            return
    }

    public static final /* synthetic */ void W(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.v0 r1, java.lang.StringBuilder r2) {
            r0.x1(r1, r2)
            return
    }

    public static final /* synthetic */ void X(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.d r1, java.lang.StringBuilder r2) {
            r0.D1(r1, r2)
            return
    }

    private final void X1(kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.descriptors.Modality r4) {
            r1 = this;
            boolean r0 = r1.X0()
            if (r0 != 0) goto L9
            if (r2 != r4) goto L9
            return
        L9:
            java.util.Set r4 = r1.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MODALITY
            boolean r4 = r4.contains(r0)
            java.lang.String r2 = r2.name()
            java.lang.String r2 = e4.a.f(r2)
            r1.Z1(r3, r4, r2)
            return
    }

    public static final /* synthetic */ void Y(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.j r1, java.lang.StringBuilder r2) {
            r0.I1(r1, r2)
            return
    }

    private final void Y1(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3, java.lang.StringBuilder r4) {
            r2 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.J(r3)
            if (r0 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r3.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r0 == r1) goto L24
        Le:
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r0 = r2.M0()
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OVERRIDE
            if (r0 != r1) goto L25
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r3.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            if (r0 != r1) goto L25
            boolean r0 = r2.v1(r3)
            if (r0 == 0) goto L25
        L24:
            return
        L25:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r3.i()
            java.lang.String r1 = "getModality(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r2.s1(r3)
            r2.X1(r0, r4, r3)
            return
    }

    public static final /* synthetic */ void Z(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.y r1, java.lang.StringBuilder r2) {
            r0.Q1(r1, r2)
            return
    }

    private final void Z1(java.lang.StringBuilder r1, boolean r2, java.lang.String r3) {
            r0 = this;
            if (r2 == 0) goto Le
            java.lang.String r2 = r0.T1(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
        Le:
            return
    }

    public static final /* synthetic */ void a0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1, java.lang.StringBuilder r2, boolean r3) {
            r0.a2(r1, r2, r3)
            return
    }

    private final void a2(kotlin.reflect.jvm.internal.impl.descriptors.k r2, java.lang.StringBuilder r3, boolean r4) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r0 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.String r2 = r1.S(r2, r4)
            r3.append(r2)
            return
    }

    public static final /* synthetic */ void b0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.l0 r1, java.lang.StringBuilder r2) {
            r0.e2(r1, r2)
            return
    }

    private final void b2(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r4.L0()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.a
            if (r1 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.a r0 = (kotlin.reflect.jvm.internal.impl.types.a) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L36
            boolean r4 = r2.a1()
            if (r4 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r0.Z()
            r2.c2(r3, r4)
            boolean r4 = r2.S0()
            if (r4 == 0) goto L35
            r2.w1(r3, r0)
            return
        L25:
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r0.U0()
            r2.c2(r3, r4)
            boolean r4 = r2.b1()
            if (r4 == 0) goto L35
            r2.N1(r3, r0)
        L35:
            return
        L36:
            r2.c2(r3, r4)
            return
    }

    public static final /* synthetic */ void c0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.s0 r1, java.lang.StringBuilder r2) {
            r0.g2(r1, r2)
            return
    }

    private final void c2(java.lang.StringBuilder r2, kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r1 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.n2
            if (r0 == 0) goto L19
            boolean r0 = r1.d()
            if (r0 == 0) goto L19
            r0 = r3
            kotlin.reflect.jvm.internal.impl.types.n2 r0 = (kotlin.reflect.jvm.internal.impl.types.n2) r0
            boolean r0 = r0.N0()
            if (r0 != 0) goto L19
            java.lang.String r3 = "<Not computed yet>"
            r2.append(r3)
            return
        L19:
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r3.L0()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.types.k0 r3 = (kotlin.reflect.jvm.internal.impl.types.k0) r3
            java.lang.String r3 = r3.S0(r1, r1)
            r2.append(r3)
            return
        L2b:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = (kotlin.reflect.jvm.internal.impl.types.e1) r3
            r1.m2(r2, r3)
            return
        L35:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
    }

    public static final /* synthetic */ void d0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.w0 r1, java.lang.StringBuilder r2) {
            r0.i2(r1, r2)
            return
    }

    private final void d2(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3, java.lang.StringBuilder r4) {
            r2 = this;
            java.util.Set r0 = r2.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.OVERRIDE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            goto L3c
        Ld:
            boolean r0 = r2.v1(r3)
            if (r0 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r0 = r2.M0()
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OPEN
            if (r0 == r1) goto L3c
            r0 = 1
            java.lang.String r1 = "override"
            r2.Z1(r4, r0, r1)
            boolean r0 = r2.k1()
            if (r0 == 0) goto L3c
            java.lang.String r0 = "/*"
            r4.append(r0)
            java.util.Collection r3 = r3.e()
            int r3 = r3.size()
            r4.append(r3)
            java.lang.String r3 = "*/ "
            r4.append(r3)
        L3c:
            return
    }

    public static final /* synthetic */ void e0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.i1 r1, java.lang.StringBuilder r2) {
            r0.r2(r1, r2)
            return
    }

    private final void e2(kotlin.reflect.jvm.internal.impl.descriptors.l0 r3, java.lang.StringBuilder r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r3.d()
            java.lang.String r1 = "package-fragment"
            r2.f2(r0, r1, r4)
            boolean r0 = r2.d()
            if (r0 == 0) goto L1c
            java.lang.String r0 = " in "
            r4.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r3 = r3.b()
            r0 = 0
            r2.a2(r3, r4, r0)
        L1c:
            return
    }

    public static final /* synthetic */ void f0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, java.lang.StringBuilder r2, boolean r3) {
            r0.x2(r1, r2, r3)
            return
    }

    private final void f2(kotlin.reflect.jvm.internal.impl.name.c r1, java.lang.String r2, java.lang.StringBuilder r3) {
            r0 = this;
            java.lang.String r2 = r0.T1(r2)
            r3.append(r2)
            kotlin.reflect.jvm.internal.impl.name.d r1 = r1.i()
            java.lang.String r1 = r0.R(r1)
            int r2 = r1.length()
            if (r2 <= 0) goto L1d
            java.lang.String r2 = " "
            r3.append(r2)
            r3.append(r1)
        L1d:
            return
    }

    public static final /* synthetic */ void g0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.descriptors.q1 r1, boolean r2, java.lang.StringBuilder r3, boolean r4) {
            r0.C2(r1, r2, r3, r4)
            return
    }

    private final void g2(kotlin.reflect.jvm.internal.impl.descriptors.s0 r3, java.lang.StringBuilder r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r3.d()
            java.lang.String r1 = "package"
            r2.f2(r0, r1, r4)
            boolean r0 = r2.d()
            if (r0 == 0) goto L1c
            java.lang.String r0 = " in context of "
            r4.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r3 = r3.C0()
            r0 = 0
            r2.a2(r3, r4, r0)
        L1c:
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.t h0(kotlin.reflect.jvm.internal.impl.renderer.t r0) {
            kotlin.reflect.jvm.internal.impl.renderer.t r0 = s0(r0)
            return r0
    }

    private final void h2(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.descriptors.u0 r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r0 = r4.c()
            if (r0 == 0) goto L24
            r2.h2(r3, r0)
            r0 = 46
            r3.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = r4.b()
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 0
            java.lang.String r0 = r2.S(r0, r1)
            r3.append(r0)
            goto L38
        L24:
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.lang.String r1 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r0 = r2.t2(r0)
            r3.append(r0)
        L38:
            java.util.List r4 = r4.a()
            java.lang.String r4 = r2.s2(r4)
            r3.append(r4)
            return
    }

    static /* synthetic */ java.lang.Object i0(kotlin.reflect.jvm.internal.impl.types.t0 r0) {
            java.lang.Object r0 = u2(r0)
            return r0
    }

    private final void i2(kotlin.reflect.jvm.internal.impl.descriptors.w0 r11, java.lang.StringBuilder r12) {
            r10 = this;
            boolean r0 = r10.e1()
            java.lang.String r1 = "getTypeParameters(...)"
            r2 = 1
            if (r0 != 0) goto L80
            boolean r0 = r10.d1()
            if (r0 != 0) goto L69
            java.util.List r0 = r11.A0()
            java.lang.String r3 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            r10.K1(r0, r12)
            r10.j2(r11, r12)
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r11.getVisibility()
            java.lang.String r3 = "getVisibility(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            r10.F2(r0, r12)
            java.util.Set r0 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.CONST
            boolean r0 = r0.contains(r3)
            r3 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r11.isConst()
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            java.lang.String r4 = "const"
            r10.Z1(r12, r0, r4)
            r10.V1(r11, r12)
            r10.Y1(r11, r12)
            r10.d2(r11, r12)
            java.util.Set r0 = r10.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r4 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.LATEINIT
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L61
            boolean r0 = r11.B0()
            if (r0 == 0) goto L61
            r3 = 1
        L61:
            java.lang.String r0 = "lateinit"
            r10.Z1(r12, r3, r0)
            r10.U1(r11, r12)
        L69:
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            B2(r4, r5, r6, r7, r8, r9)
            java.util.List r11 = r5.getTypeParameters()
            kotlin.jvm.internal.g0.o(r11, r1)
            r10.z2(r11, r6, r2)
            r10.k2(r5, r6)
            goto L83
        L80:
            r4 = r10
            r5 = r11
            r6 = r12
        L83:
            r10.a2(r5, r6, r2)
            java.lang.String r11 = ": "
            r6.append(r11)
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r5.getType()
            java.lang.String r12 = "getType(...)"
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.String r11 = r10.T(r11)
            r6.append(r11)
            r10.l2(r5, r6)
            r10.S1(r5, r6)
            java.util.List r11 = r5.getTypeParameters()
            kotlin.jvm.internal.g0.o(r11, r1)
            r10.G2(r11, r6)
            return
    }

    static /* synthetic */ java.lang.CharSequence j0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.types.c2 r1) {
            java.lang.CharSequence r0 = p0(r0, r1)
            return r0
    }

    private final void j2(kotlin.reflect.jvm.internal.impl.descriptors.w0 r8, java.lang.StringBuilder r9) {
            r7 = this;
            java.util.Set r0 = r7.J0()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r1 = r7
            goto L62
        Le:
            r5 = 2
            r6 = 0
            r4 = 0
            r1 = r7
            r3 = r8
            r2 = r9
            B1(r1, r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.descriptors.v r8 = r3.O()
            if (r8 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FIELD
            r7.A1(r2, r8, r9)
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.v r8 = r3.D()
            if (r8 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD
            r7.A1(r2, r8, r9)
        L2d:
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r8 = r7.Q0()
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r9 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE
            if (r8 != r9) goto L62
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r8 = r3.getGetter()
            if (r8 == 0) goto L40
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_GETTER
            r7.A1(r2, r8, r9)
        L40:
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r8 = r3.getSetter()
            if (r8 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_SETTER
            r7.A1(r2, r8, r9)
            java.util.List r8 = r8.g()
            java.lang.String r9 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            java.lang.Object r8 = kotlin.collections.f0.m5(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r8
            kotlin.jvm.internal.g0.m(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.SETTER_PARAMETER
            r7.A1(r2, r8, r9)
        L62:
            return
    }

    static /* synthetic */ java.lang.CharSequence k0(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            java.lang.CharSequence r0 = J1(r0)
            return r0
    }

    private final void k2(kotlin.reflect.jvm.internal.impl.descriptors.a r2, java.lang.StringBuilder r3) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = r2.f0()
            if (r2 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER
            r1.A1(r3, r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.String r2 = r1.O1(r2)
            r3.append(r2)
            java.lang.String r2 = "."
            r3.append(r2)
        L20:
            return
    }

    static /* synthetic */ java.lang.CharSequence l0(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.CharSequence r0 = p2(r0, r1)
            return r0
    }

    private final void l2(kotlin.reflect.jvm.internal.impl.descriptors.a r2, java.lang.StringBuilder r3) {
            r1 = this;
            boolean r0 = r1.R0()
            if (r0 != 0) goto L7
            goto L22
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = r2.f0()
            if (r2 == 0) goto L22
            java.lang.String r0 = " on "
            r3.append(r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.lang.String r2 = r1.T(r2)
            r3.append(r2)
        L22:
            return
    }

    static /* synthetic */ kotlin.n1 m0(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = t0(r0)
            return r0
    }

    private final void m2(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.types.e1 r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.j2.b
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r0)
            java.lang.String r1 = "???"
            if (r0 != 0) goto L51
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.k(r4)
            if (r0 == 0) goto L11
            goto L51
        L11:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.error.i.o(r4)
            if (r0 == 0) goto L39
            boolean r0 = r2.h1()
            if (r0 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.I0()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            kotlin.jvm.internal.g0.n(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.error.h r4 = (kotlin.reflect.jvm.internal.impl.types.error.h) r4
            r0 = 0
            java.lang.String r4 = r4.f(r0)
            java.lang.String r4 = r2.M1(r4)
            r3.append(r4)
            return
        L35:
            r3.append(r1)
            return
        L39:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r4)
            if (r0 == 0) goto L43
            r2.L1(r3, r4)
            return
        L43:
            boolean r0 = r2.H2(r4)
            if (r0 == 0) goto L4d
            r2.R1(r3, r4)
            return
        L4d:
            r2.L1(r3, r4)
            return
        L51:
            r3.append(r1)
            return
    }

    private final void n0(java.lang.StringBuilder r5, kotlin.reflect.jvm.internal.impl.descriptors.k r6) {
            r4 = this;
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 != 0) goto L6d
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.s0
            if (r0 == 0) goto L9
            return
        L9:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r6.b()
            if (r0 == 0) goto L6d
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
            if (r1 != 0) goto L6d
            java.lang.String r1 = " "
            r5.append(r1)
            java.lang.String r2 = "defined in"
            java.lang.String r2 = r4.W1(r2)
            r5.append(r2)
            r5.append(r1)
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r0)
            java.lang.String r3 = "getFqName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r3 = r2.e()
            if (r3 == 0) goto L36
            java.lang.String r2 = "root package"
            goto L3a
        L36:
            java.lang.String r2 = r4.R(r2)
        L3a:
            r5.append(r2)
            boolean r2 = r4.m1()
            if (r2 == 0) goto L6d
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 == 0) goto L6d
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.n
            if (r0 == 0) goto L6d
            kotlin.reflect.jvm.internal.impl.descriptors.n r6 = (kotlin.reflect.jvm.internal.impl.descriptors.n) r6
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r6 = r6.getSource()
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r6 = r6.b()
            java.lang.String r6 = r6.getName()
            if (r6 == 0) goto L6d
            r5.append(r1)
            java.lang.String r0 = "in file"
            java.lang.String r0 = r4.W1(r0)
            r5.append(r0)
            r5.append(r1)
            r5.append(r6)
        L6d:
            return
    }

    private final void n2(java.lang.StringBuilder r3) {
            r2 = this;
            int r0 = r3.length()
            r1 = 32
            if (r0 == 0) goto L12
            int r0 = r0 + (-1)
            char r0 = r3.charAt(r0)
            if (r0 == r1) goto L11
            goto L12
        L11:
            return
        L12:
            r3.append(r1)
            return
    }

    private final void o0(java.lang.StringBuilder r11, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r12) {
            r10 = this;
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.reflect.jvm.internal.impl.renderer.p r7 = new kotlin.reflect.jvm.internal.impl.renderer.p
            r7.<init>(r10)
            r8 = 60
            r9 = 0
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r11
            kotlin.collections.f0.p3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private final void o2(kotlin.reflect.jvm.internal.impl.descriptors.d r12, java.lang.StringBuilder r13) {
            r11 = this;
            boolean r0 = r11.o1()
            if (r0 == 0) goto L7
            goto L5a
        L7:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r12.s()
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.o0(r0)
            if (r0 == 0) goto L12
            goto L5a
        L12:
            kotlin.reflect.jvm.internal.impl.types.w1 r12 = r12.o()
            java.util.Collection r12 = r12.i()
            java.lang.String r0 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r12, r0)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L5a
            int r0 = r12.size()
            r1 = 1
            if (r0 != r1) goto L3d
            java.util.Iterator r0 = r12.iterator()
            java.lang.Object r0 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.c0(r0)
            if (r0 == 0) goto L3d
            goto L5a
        L3d:
            r11.n2(r13)
            java.lang.String r0 = ": "
            r13.append(r0)
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.impl.renderer.r r8 = new kotlin.reflect.jvm.internal.impl.renderer.r
            r8.<init>(r11)
            r9 = 60
            r10 = 0
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r13
            kotlin.collections.f0.p3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L5a:
            return
    }

    private static final java.lang.CharSequence p0(kotlin.reflect.jvm.internal.impl.renderer.t r2, kotlin.reflect.jvm.internal.impl.types.c2 r3) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.b()
            if (r0 == 0) goto Le
            java.lang.String r2 = "*"
            return r2
        Le:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r2 = r2.T(r0)
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r3.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r0 != r1) goto L24
            return r2
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r3.c()
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static final java.lang.CharSequence p2(kotlin.reflect.jvm.internal.impl.renderer.t r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.jvm.internal.g0.m(r1)
            java.lang.String r0 = r0.T(r1)
            return r0
    }

    private final java.lang.String q0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.t.b.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 != r1) goto L15
            java.lang.String r0 = "&rarr;"
            return r0
        L15:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String r0 = "->"
            java.lang.String r0 = r2.r0(r0)
            return r0
    }

    private final java.lang.String q1() {
            r1 = this;
            java.lang.String r0 = ">"
            java.lang.String r0 = r1.r0(r0)
            return r0
    }

    private final void q2(kotlin.reflect.jvm.internal.impl.descriptors.y r2, java.lang.StringBuilder r3) {
            r1 = this;
            boolean r2 = r2.isSuspend()
            java.lang.String r0 = "suspend"
            r1.Z1(r3, r2, r0)
            return
    }

    private final java.lang.String r0(java.lang.String r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r1.f1()
            java.lang.String r2 = r0.escape(r2)
            return r2
    }

    private final boolean r1(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.i.r(r2)
            if (r0 != 0) goto L13
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private final void r2(kotlin.reflect.jvm.internal.impl.descriptors.i1 r7, java.lang.StringBuilder r8) {
            r6 = this;
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r1 = r8
            B1(r0, r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.s r7 = r2.getVisibility()
            java.lang.String r8 = "getVisibility(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            r6.F2(r7, r1)
            r6.V1(r2, r1)
            java.lang.String r7 = "typealias"
            java.lang.String r7 = r6.T1(r7)
            r1.append(r7)
            java.lang.String r7 = " "
            r1.append(r7)
            r7 = 1
            r6.a2(r2, r1, r7)
            java.util.List r7 = r2.t()
            java.lang.String r8 = "getDeclaredTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            r8 = 0
            r6.z2(r7, r1, r8)
            r6.C1(r2, r1)
            java.lang.String r7 = " = "
            r1.append(r7)
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r2.y0()
            java.lang.String r7 = r6.T(r7)
            r1.append(r7)
            return
    }

    private static final kotlin.reflect.jvm.internal.impl.renderer.t s0(kotlin.reflect.jvm.internal.impl.renderer.t r1) {
            kotlin.reflect.jvm.internal.impl.renderer.s r0 = kotlin.reflect.jvm.internal.impl.renderer.s.a
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = r1.V(r0)
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlin.reflect.jvm.internal.impl.renderer.t r1 = (kotlin.reflect.jvm.internal.impl.renderer.t) r1
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality s1(kotlin.reflect.jvm.internal.impl.descriptors.c0 r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r4.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r4 != r0) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            return r4
        L11:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            return r4
        L14:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 != 0) goto L25
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            return r4
        L25:
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r1 != 0) goto L2c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            return r4
        L2c:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            java.util.Collection r1 = r4.e()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L48
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r1 == r2) goto L48
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            return r4
        L48:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r0 != r1) goto L68
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 != 0) goto L68
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r4.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r4 != r0) goto L65
            return r0
        L65:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            return r4
        L68:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            return r4
    }

    private static final kotlin.n1 t0(kotlin.reflect.jvm.internal.impl.renderer.u r4) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r0 = r4.c()
            r1 = 2
            kotlin.reflect.jvm.internal.impl.name.c[] r1 = new kotlin.reflect.jvm.internal.impl.name.c[r1]
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.C
            r3 = 0
            r1[r3] = r2
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.D
            r3 = 1
            r1[r3] = r2
            java.util.List r1 = kotlin.collections.f0.Q(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r0 = kotlin.collections.u1.C(r0, r1)
            r4.f(r0)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    private final boolean t1(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.E
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            return r2
    }

    private final java.lang.String u1() {
            r1 = this;
            java.lang.String r0 = "<"
            java.lang.String r0 = r1.r0(r0)
            return r0
    }

    private static final java.lang.Object u2(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.n1
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.types.n1 r1 = (kotlin.reflect.jvm.internal.impl.types.n1) r1
            kotlin.reflect.jvm.internal.impl.types.checker.r r1 = r1.R0()
        Lf:
            return r1
    }

    private final boolean v1(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            r0 = this;
            java.util.Collection r1 = r1.e()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    private final void v2(java.lang.StringBuilder r2, kotlin.reflect.jvm.internal.impl.types.t0 r3, kotlin.reflect.jvm.internal.impl.types.w1 r4) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r0 = kotlin.reflect.jvm.internal.impl.descriptors.n1.d(r3)
            if (r0 != 0) goto L19
            java.lang.String r4 = r1.t2(r4)
            r2.append(r4)
            java.util.List r3 = r3.G0()
            java.lang.String r3 = r1.s2(r3)
            r2.append(r3)
            return
        L19:
            r1.h2(r2, r0)
            return
    }

    private final void w1(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.types.a r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            if (r0 != r1) goto Ld
            java.lang.String r0 = "<font color=\"808080\"><i>"
            r3.append(r0)
        Ld:
            java.lang.String r0 = " /* "
            r3.append(r0)
            java.lang.String r0 = "from: "
            r3.append(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.U0()
            r2.c2(r3, r4)
            java.lang.String r4 = " */"
            r3.append(r4)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r4 = r2.f1()
            if (r4 != r1) goto L2e
            java.lang.String r4 = "</i></font>"
            r3.append(r4)
        L2e:
            return
    }

    static /* synthetic */ void w2(kotlin.reflect.jvm.internal.impl.renderer.t r0, java.lang.StringBuilder r1, kotlin.reflect.jvm.internal.impl.types.t0 r2, kotlin.reflect.jvm.internal.impl.types.w1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L8
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r2.I0()
        L8:
            r0.v2(r1, r2, r3)
            return
    }

    private final void x1(kotlin.reflect.jvm.internal.impl.descriptors.v0 r1, java.lang.StringBuilder r2) {
            r0 = this;
            r0.V1(r1, r2)
            return
    }

    private final void x2(kotlin.reflect.jvm.internal.impl.descriptors.j1 r11, java.lang.StringBuilder r12, boolean r13) {
            r10 = this;
            if (r13 == 0) goto L9
            java.lang.String r0 = r10.u1()
            r12.append(r0)
        L9:
            boolean r0 = r10.k1()
            if (r0 == 0) goto L20
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r11.getIndex()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L20:
            boolean r0 = r11.j()
            java.lang.String r1 = "reified"
            r10.Z1(r12, r0, r1)
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r11.l()
            java.lang.String r0 = r0.getLabel()
            int r1 = r0.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L3b
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            r10.Z1(r12, r1, r0)
            r8 = 2
            r9 = 0
            r7 = 0
            r4 = r10
            r6 = r11
            r5 = r12
            B1(r4, r5, r6, r7, r8, r9)
            r10.a2(r6, r5, r13)
            java.util.List r11 = r6.getUpperBounds()
            int r11 = r11.size()
            java.lang.String r12 = " : "
            if (r11 <= r3) goto L59
            if (r13 == 0) goto L5b
        L59:
            if (r11 != r3) goto L7d
        L5b:
            java.util.List r11 = r6.getUpperBounds()
            java.util.Iterator r11 = r11.iterator()
            java.lang.Object r11 = r11.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = (kotlin.reflect.jvm.internal.impl.types.t0) r11
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.k0(r11)
            if (r0 != 0) goto Lb1
            r5.append(r12)
            kotlin.jvm.internal.g0.m(r11)
            java.lang.String r11 = r10.T(r11)
            r5.append(r11)
            goto Lb1
        L7d:
            if (r13 == 0) goto Lb1
            java.util.List r11 = r6.getUpperBounds()
            java.util.Iterator r11 = r11.iterator()
        L87:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r11.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.k0(r0)
            if (r1 == 0) goto L9a
            goto L87
        L9a:
            if (r3 == 0) goto La0
            r5.append(r12)
            goto La5
        La0:
            java.lang.String r1 = " & "
            r5.append(r1)
        La5:
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r0 = r10.T(r0)
            r5.append(r0)
            r3 = 0
            goto L87
        Lb1:
            if (r13 == 0) goto Lba
            java.lang.String r11 = r10.q1()
            r5.append(r11)
        Lba:
            return
    }

    private final void y1(kotlin.reflect.jvm.internal.impl.descriptors.y r6, java.lang.StringBuilder r7) {
            r5 = this;
            boolean r0 = r6.isOperator()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "getOverriddenDescriptors(...)"
            if (r0 == 0) goto L3b
            java.util.Collection r0 = r6.e()
            kotlin.jvm.internal.g0.o(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1d
            goto L39
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L21
            boolean r0 = r5.v0()
            if (r0 == 0) goto L3b
        L39:
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L72
            java.util.Collection r4 = r6.e()
            kotlin.jvm.internal.g0.o(r4, r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L55
            goto L71
        L55:
            java.util.Iterator r3 = r4.iterator()
        L59:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L59
            boolean r3 = r5.v0()
            if (r3 == 0) goto L72
        L71:
            r1 = 1
        L72:
            boolean r2 = r6.y()
            java.lang.String r3 = "tailrec"
            r5.Z1(r7, r2, r3)
            r5.q2(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r2 = "inline"
            r5.Z1(r7, r6, r2)
            java.lang.String r6 = "infix"
            r5.Z1(r7, r1, r6)
            java.lang.String r6 = "operator"
            r5.Z1(r7, r0, r6)
            return
    }

    private final void y2(java.lang.StringBuilder r3, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r4) {
            r2 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            r1 = 0
            r2.x2(r0, r3, r1)
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4
            java.lang.String r0 = ", "
            r3.append(r0)
            goto L4
        L20:
            return
    }

    private final java.util.List<java.lang.String> z1(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r8) {
            r7 = this;
            java.util.Map r0 = r8.a()
            boolean r1 = r7.W0()
            r2 = 0
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.d r8 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.l(r8)
            goto L11
        L10:
            r8 = r2
        L11:
            r1 = 10
            if (r8 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.descriptors.c r8 = r8.z()
            if (r8 == 0) goto L65
            java.util.List r8 = r8.g()
            if (r8 == 0) goto L65
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L2c:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r8.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            boolean r4 = r4.Q()
            if (r4 == 0) goto L2c
            r2.add(r3)
            goto L2c
        L43:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r3 = kotlin.collections.f0.d0(r2, r1)
            r8.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            r8.add(r3)
            goto L50
        L64:
            r2 = r8
        L65:
            if (r2 != 0) goto L6b
            java.util.List r2 = kotlin.collections.f0.J()
        L6b:
            r8 = r2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r8.next()
            r5 = r4
            kotlin.reflect.jvm.internal.impl.name.f r5 = (kotlin.reflect.jvm.internal.impl.name.f) r5
            boolean r5 = r0.containsKey(r5)
            if (r5 != 0) goto L77
            r3.add(r4)
            goto L77
        L8e:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r3, r1)
            r8.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L9b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.name.f r4 = (kotlin.reflect.jvm.internal.impl.name.f) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = r4.b()
            r5.append(r4)
            java.lang.String r4 = " = ..."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r8.add(r4)
            goto L9b
        Lc0:
            java.util.Set r0 = r0.entrySet()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = kotlin.collections.f0.d0(r0, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Ld1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L112
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            kotlin.reflect.jvm.internal.impl.name.f r4 = (kotlin.reflect.jvm.internal.impl.name.f) r4
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.b()
            r5.append(r6)
            java.lang.String r6 = " = "
            r5.append(r6)
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L105
            java.lang.String r1 = r7.H1(r1)
            goto L107
        L105:
            java.lang.String r1 = "..."
        L107:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r3.add(r1)
            goto Ld1
        L112:
            java.util.List r8 = kotlin.collections.f0.I4(r8, r3)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = kotlin.collections.f0.v5(r8)
            return r8
    }

    private final void z2(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r2, java.lang.StringBuilder r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.p1()
            if (r0 == 0) goto L7
            goto L28
        L7:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.lang.String r0 = r1.u1()
            r3.append(r0)
            r1.y2(r3, r2)
            java.lang.String r2 = r1.q1()
            r3.append(r2)
            if (r4 == 0) goto L28
            java.lang.String r2 = " "
            r3.append(r2)
        L28:
            return
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.q1, java.lang.String> A0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.jvm.functions.Function1 r0 = r0.B()
            return r0
    }

    public boolean B0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.C()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> C0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            java.util.Set r0 = r0.D()
            return r0
    }

    public boolean E0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.E()
            return r0
    }

    public boolean F0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.F()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String F1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r2) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r2)
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            java.lang.String r2 = r2.toString()
            return r2
        L14:
            kotlin.reflect.jvm.internal.impl.renderer.a r0 = r1.z0()
            java.lang.String r2 = r0.a(r2, r1)
            return r2
    }

    public boolean G0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.G()
            return r0
    }

    public boolean H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.H()
            return r0
    }

    public boolean I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.I()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> J0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            java.util.Set r0 = r0.J()
            return r0
    }

    public boolean K0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.K()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.renderer.x L0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy M0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy r0 = r0.L()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String N(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            r2 = this;
            java.lang.String r0 = "declarationDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.renderer.t$a r1 = new kotlin.reflect.jvm.internal.impl.renderer.t$a
            r1.<init>(r2)
            r3.W(r1, r0)
            boolean r1 = r2.l1()
            if (r1 == 0) goto L1b
            r2.n0(r0, r3)
        L1b:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy N0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = r0.M()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String O(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r12, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r13) {
            r11 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 64
            r2.append(r0)
            if (r13 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r13.getRenderName()
            r0.append(r13)
            r13 = 58
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r2.append(r13)
        L29:
            kotlin.reflect.jvm.internal.impl.types.t0 r13 = r12.getType()
            java.lang.String r0 = r11.T(r13)
            r2.append(r0)
            boolean r0 = r11.F0()
            if (r0 == 0) goto L5f
            java.util.List r12 = r11.z1(r12)
            boolean r0 = r11.G0()
            if (r0 != 0) goto L4d
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5f
        L4d:
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r9 = 112(0x70, float:1.57E-43)
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r6 = 0
            r7 = 0
            r8 = 0
            kotlin.collections.f0.p3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L5f:
            boolean r12 = r11.k1()
            if (r12 == 0) goto L7c
            boolean r12 = kotlin.reflect.jvm.internal.impl.types.x0.a(r13)
            if (r12 != 0) goto L77
            kotlin.reflect.jvm.internal.impl.types.w1 r12 = r13.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r12 = r12.c()
            boolean r12 = r12 instanceof kotlin.reflect.jvm.internal.impl.descriptors.k0.b
            if (r12 == 0) goto L7c
        L77:
            java.lang.String r12 = " /* annotation class not found */"
            r2.append(r12)
        L7c:
            java.lang.String r12 = r2.toString()
            return r12
    }

    public boolean O0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.N()
            return r0
    }

    public boolean P0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.O()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String Q(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r11) {
            r8 = this;
            java.lang.String r0 = "lowerRendered"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "upperRendered"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r11, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.renderer.a0.f(r9, r10)
            r1 = 40
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L49
            java.lang.String r11 = "("
            r0 = 0
            boolean r10 = kotlin.text.u.H2(r10, r11, r0, r2, r3)
            if (r10 == 0) goto L37
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r9)
            java.lang.String r9 = ")!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        L37:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r9 = 33
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        L49:
            kotlin.reflect.jvm.internal.impl.renderer.a r0 = r8.z0()
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r11.x()
            java.lang.String r5 = "getCollection(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.String r0 = r0.a(r4, r8)
            java.lang.String r4 = "Collection"
            java.lang.String r0 = kotlin.text.u.S5(r0, r4, r3, r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = "Mutable"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r1)
            r6.append(r5)
            r5 = 41
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r4 = kotlin.reflect.jvm.internal.impl.renderer.a0.d(r9, r4, r10, r0, r6)
            if (r4 == 0) goto L8f
            return r4
        L8f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r6 = "MutableMap.MutableEntry"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r7 = "Map.Entry"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = "(Mutable)Map.(Mutable)Entry"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.renderer.a0.d(r9, r4, r10, r6, r0)
            if (r0 == 0) goto Lc9
            return r0
        Lc9:
            kotlin.reflect.jvm.internal.impl.renderer.a r0 = r8.z0()
            kotlin.reflect.jvm.internal.impl.descriptors.d r11 = r11.j()
            java.lang.String r4 = "getArray(...)"
            kotlin.jvm.internal.g0.o(r11, r4)
            java.lang.String r11 = r0.a(r11, r8)
            java.lang.String r0 = "Array"
            java.lang.String r11 = kotlin.text.u.S5(r11, r0, r3, r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r2 = "Array<"
            java.lang.String r2 = r8.r0(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = "Array<out "
            java.lang.String r3 = r8.r0(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r11 = "Array<(out) "
            java.lang.String r11 = r8.r0(r11)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            java.lang.String r11 = kotlin.reflect.jvm.internal.impl.renderer.a0.d(r9, r0, r10, r2, r11)
            if (r11 == 0) goto L126
            return r11
        L126:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r9)
            java.lang.String r9 = ".."
            r11.append(r9)
            r11.append(r10)
            r11.append(r5)
            java.lang.String r9 = r11.toString()
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy Q0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r0 = r0.P()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String R(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = r2.h()
            java.lang.String r2 = r1.P1(r2)
            return r2
    }

    public boolean R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.R()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.renderer.a0.b(r3)
            java.lang.String r3 = r2.r0(r3)
            boolean r0 = r2.x0()
            if (r0 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            if (r0 != r1) goto L33
            if (r4 == 0) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "<b>"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = "</b>"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L33:
            return r3
    }

    public boolean S0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.S()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.jvm.functions.Function1 r1 = r2.g1()
            java.lang.Object r3 = r1.invoke(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            r2.b2(r0, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public boolean T0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.T()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r2) {
            r1 = this;
            java.lang.String r0 = "typeProjection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r2 = kotlin.collections.f0.l(r2)
            r1.o0(r0, r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean U0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.U()
            return r0
    }

    public boolean V0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.V()
            return r0
    }

    public boolean W0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.W()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String W1(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r2.f1()
            int[] r1 = kotlin.reflect.jvm.internal.impl.renderer.t.b.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 != r1) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<i>"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "</i>"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L2e:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L34:
            return r3
    }

    public boolean X0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.X()
            return r0
    }

    public boolean Y0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.Y()
            return r0
    }

    public boolean Z0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.Z()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.a(r2)
            return
    }

    public boolean a1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.a0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public boolean b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.b()
            return r0
    }

    public boolean b1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.b0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            java.util.Set r0 = r0.c()
            return r0
    }

    public boolean c1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.c0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public boolean d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.d()
            return r0
    }

    public boolean d1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.d0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = r0.e()
            return r0
    }

    public boolean e1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.e0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void f(@org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.f(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat f1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r0.f0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void g(@org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.g(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0> g1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.jvm.functions.Function1 r0 = r0.g0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void h(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.h(r2)
            return
    }

    public boolean h1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.h0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void i(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.i(r2)
            return
    }

    public boolean i1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.i0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void j(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.j(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.m.b j1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.m$b r0 = r0.j0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void k(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.k(r2)
            return
    }

    public boolean k1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.k0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void l(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.l(r2)
            return
    }

    public boolean l1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.l0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void m(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.m(r2)
            return
    }

    public boolean m1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.m0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.n(r2)
            return
    }

    public boolean n1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.n0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.o(r2)
            return
    }

    public boolean o1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.o0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.a r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.p(r2)
            return
    }

    public boolean p1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.p0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void q(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.q(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String s2(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r3) {
            r2 = this;
            java.lang.String r0 = "typeArguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Le
            java.lang.String r3 = ""
            return r3
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.u1()
            r0.append(r1)
            r2.o0(r0, r3)
            java.lang.String r3 = r2.q1()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.u
    public void setVerbose(boolean r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            r0.setVerbose(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String t2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r4) {
            r3 = this;
            java.lang.String r0 = "typeConstructor"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r4.c()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r1 != 0) goto L49
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 != 0) goto L49
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r1 == 0) goto L16
            goto L49
        L16:
            if (r0 != 0) goto L2a
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            if (r0 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.types.s0 r4 = (kotlin.reflect.jvm.internal.impl.types.s0) r4
            kotlin.reflect.jvm.internal.impl.renderer.o r0 = kotlin.reflect.jvm.internal.impl.renderer.o.a
            java.lang.String r4 = r4.m(r0)
            return r4
        L25:
            java.lang.String r4 = r4.toString()
            return r4
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected classifier: "
            r1.append(r2)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L49:
            java.lang.String r4 = r3.F1(r0)
            return r4
    }

    public boolean u0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.v()
            return r0
    }

    public boolean v0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.w()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, java.lang.Boolean> w0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.jvm.functions.Function1 r0 = r0.x()
            return r0
    }

    public boolean x0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.y()
            return r0
    }

    public boolean y0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            boolean r0 = r0.z()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.renderer.a z0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.x r0 = r1.m
            kotlin.reflect.jvm.internal.impl.renderer.a r0 = r0.A()
            return r0
    }
}

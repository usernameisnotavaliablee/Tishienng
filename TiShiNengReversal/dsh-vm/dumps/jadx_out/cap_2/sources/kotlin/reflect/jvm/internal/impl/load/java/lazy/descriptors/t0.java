package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,408:1\n1491#2:409\n1516#2,3:410\n1519#2,3:420\n1563#2:423\n1634#2,3:424\n1563#2:427\n1634#2,3:428\n382#3,7:413\n*S KotlinDebug\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n*L\n129#1:409\n129#1:410,3\n129#1:420,3\n165#1:423\n165#1:424,3\n212#1:427\n212#1:428,3\n129#1:413,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class t0 extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] m = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c> e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.w0> g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0>> l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.types.t0 a;

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.impl.types.t0 b;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> c;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> d;
        private final boolean e;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> f;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r5, boolean r6, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7) {
                r1 = this;
                java.lang.String r0 = "returnType"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "valueParameters"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "typeParameters"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "errors"
                kotlin.jvm.internal.g0.p(r7, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r1.c = r4
                r1.d = r5
                r1.e = r6
                r1.f = r7
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> a() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.f
                return r0
        }

        public final boolean b() {
                r1 = this;
                boolean r0 = r1.e
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.types.t0 c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.t0 d() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> e() {
                r1 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.d
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.a) r5
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.a
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.b
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = r5.b
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r1 = r4.c
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r3 = r5.c
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1 = r4.d
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r3 = r5.d
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                boolean r1 = r4.e
                boolean r3 = r5.e
                if (r1 == r3) goto L3f
                return r2
            L3f:
                java.util.List<java.lang.String> r1 = r4.f
                java.util.List<java.lang.String> r5 = r5.f
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L4a
                return r2
            L4a:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> f() {
                r1 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r0 = r1.c
                return r0
        }

        public int hashCode() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.b
                if (r1 != 0) goto Le
                r1 = 0
                goto L12
            Le:
                int r1 = r1.hashCode()
            L12:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r1 = r2.c
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1 = r2.d
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.e
                int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<java.lang.String> r1 = r2.f
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MethodSignatureData(returnType="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", receiverType="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", valueParameters="
                r0.append(r1)
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", typeParameters="
                r0.append(r1)
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ", hasStableParameterNames="
                r0.append(r1)
                boolean r1 = r2.e
                r0.append(r1)
                java.lang.String r1 = ", errors="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r2.f
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static final class b {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> a;
        private final boolean b;

        public b(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "descriptors"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> a() {
                r1 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r0 = r1.a
                return r0
        }

        public final boolean b() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0> r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.class
            java.lang.String r2 = "functionNamesLazy"
            java.lang.String r3 = "getFunctionNamesLazy()Ljava/util/Set;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "propertyNamesLazy"
            java.lang.String r5 = "getPropertyNamesLazy()Ljava/util/Set;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r2 = kotlin.jvm.internal.o0.u(r2)
            kotlin.jvm.internal.PropertyReference1Impl r3 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r5 = "classNamesLazy"
            java.lang.String r6 = "getClassNamesLazy()Ljava/util/Set;"
            r3.<init>(r1, r5, r6, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r3)
            r3 = 3
            kotlin.reflect.n[] r3 = new kotlin.reflect.n[r3]
            r3[r4] = r0
            r0 = 1
            r3[r0] = r2
            r0 = 2
            r3[r0] = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.m = r3
            return
    }

    public t0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r4) {
            r2 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.b = r3
            r2.c = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h0
            r0.<init>(r2)
            java.util.List r1 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.storage.i r4 = r4.a(r0, r1)
            r2.d = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r4 = r4.e(r0)
            r2.e = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.g r4 = r4.i(r0)
            r2.f = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.h r4 = r4.c(r0)
            r2.g = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.g r4 = r4.i(r0)
            r2.h = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.o0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.o0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r4 = r4.e(r0)
            r2.i = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r4 = r4.e(r0)
            r2.j = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.q0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.q0
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r4 = r4.e(r0)
            r2.k = r4
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.r0 r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.r0
            r4.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.g r3 = r3.i(r4)
            r2.l = r3
            return
    }

    public /* synthetic */ t0(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 F(x3.n r10) {
            r9 = this;
            boolean r0 = r10.isFinal()
            r5 = r0 ^ 1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r9.b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r0, r10)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r9.S()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r10.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r4 = kotlin.reflect.jvm.internal.impl.load.java.s0.d(r0)
            kotlin.reflect.jvm.internal.impl.name.f r6 = r10.getName()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r9.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            w3.b r0 = r0.t()
            w3.a r7 = r0.a(r10)
            boolean r8 = r9.V(r10)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r10 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.b1(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "create(...)"
            kotlin.jvm.internal.g0.o(r10, r0)
            return r10
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.w0 G(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0 = r1.c
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.w0> r1 = r0.g
            java.lang.Object r1 = r1.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r1
            return r1
        L12:
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c> r0 = r1.e
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            x3.n r2 = r0.c(r2)
            if (r2 == 0) goto L2b
            boolean r0 = r2.H()
            if (r0 != 0) goto L2b
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r1.b0(r2)
            return r1
        L2b:
            r1 = 0
            return r1
    }

    private static final java.util.Collection H(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r5, kotlin.reflect.jvm.internal.impl.name.f r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0 = r5.c
            if (r0 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> r5 = r0.f
            java.lang.Object r5 = r5.invoke(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            return r5
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c> r1 = r5.e
            java.lang.Object r1 = r1.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r1 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r1
            java.util.Collection r1 = r1.e(r6)
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            x3.r r2 = (x3.r) r2
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r3 = r5.a0(r2)
            boolean r4 = r5.W(r3)
            if (r4 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r5.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r4.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.j r4 = r4.h()
            r4.d(r2, r3)
            r0.add(r3)
            goto L27
        L4e:
            r5.z(r0, r6)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c I(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = r0.A()
            return r0
    }

    private static final java.util.Set J(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.v
            r1 = 0
            java.util.Set r2 = r2.y(r0, r1)
            return r2
    }

    private static final java.util.Collection K(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2, kotlin.reflect.jvm.internal.impl.name.f r3) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> r1 = r2.f
            java.lang.Object r1 = r1.invoke(r3)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            r2.f0(r0)
            r2.C(r0, r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r2.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r3 = r3.r()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r2.b
            java.util.Collection r2 = r3.p(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> N() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.k
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.m
            r2 = 2
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> Q() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.i
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.m
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> T() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.j
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.m
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.t0 U(x3.n r9) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r8.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r0 = r0.g()
            x3.x r1 = r9.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.p(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.t0(r0)
            if (r1 != 0) goto L25
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.w0(r0)
            if (r1 == 0) goto L3b
        L25:
            boolean r1 = r8.V(r9)
            if (r1 == 0) goto L3b
            boolean r9 = r9.x()
            if (r9 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = kotlin.reflect.jvm.internal.impl.types.j2.n(r0)
            java.lang.String r0 = "makeNotNullable(...)"
            kotlin.jvm.internal.g0.o(r9, r0)
            return r9
        L3b:
            return r0
    }

    private final boolean V(x3.n r2) {
            r1 = this;
            boolean r0 = r2.isFinal()
            if (r0 == 0) goto Le
            boolean r2 = r2.L()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private static final java.util.List X(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2, kotlin.reflect.jvm.internal.impl.name.f r3) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.w0> r1 = r2.g
            java.lang.Object r1 = r1.invoke(r3)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r1)
            r2.D(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r2.S()
            boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.i.t(r3)
            if (r3 == 0) goto L25
            java.util.List r2 = kotlin.collections.f0.a6(r0)
            return r2
        L25:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r2.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r3 = r3.r()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r2.b
            java.util.Collection r2 = r3.p(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            return r2
    }

    private static final java.util.Set Y(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.w
            r1 = 0
            java.util.Set r2 = r2.E(r0, r1)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.w0 b0(x3.n r10) {
            r9 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r1 = r9.F(r10)
            r0.element = r1
            r2 = 0
            r1.R0(r2, r2, r2, r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r9.U(r10)
            T r1 = r0.element
            r3 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) r3
            java.util.List r5 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r6 = r9.P()
            r7 = 0
            java.util.List r8 = kotlin.collections.f0.J()
            r3.X0(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r9.S()
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L33
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
        L33:
            if (r2 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r9.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r1 = r1.w()
            T r3 = r0.element
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r9.b
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r1 = r1.b(r2, r3, r4)
            r0.element = r1
        L4b:
            T r1 = r0.element
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.s1) r2
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.K(r2, r1)
            if (r1 == 0) goto L68
            T r1 = r0.element
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i0 r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i0
            r2.<init>(r9, r10, r0)
            r1.H0(r2)
        L68:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r9.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.j r1 = r1.h()
            T r2 = r0.element
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            r1.a(r10, r2)
            T r10 = r0.element
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r10 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r10
            return r10
    }

    private static final kotlin.reflect.jvm.internal.impl.storage.j c0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2, x3.n r3, kotlin.jvm.internal.Ref.ObjectRef r4) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.b
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j0 r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j0
            r1.<init>(r2, r3, r4)
            kotlin.reflect.jvm.internal.impl.storage.j r2 = r0.g(r1)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.constants.g d0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, x3.n r1, kotlin.jvm.internal.Ref.ObjectRef r2) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r0.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.i r0 = r0.g()
            T r2 = r2.element
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = r0.a(r1, r2)
            return r0
    }

    private final void f0(java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.d1> r8) {
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r3
            r4 = 2
            r5 = 0
            r6 = 0
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r3, r6, r6, r4, r5)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L2b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L2b:
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L9
        L31:
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            r3 = 1
            if (r2 == r3) goto L39
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.s0 r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.s0.a
            java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.resolve.p.b(r1, r2)
            r8.removeAll(r1)
            r8.addAll(r2)
            goto L39
        L5b:
            return
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.a g0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1) {
            java.lang.String r0 = "$this$selectMostSpecificInEachOverridableGroup"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    static /* synthetic */ java.util.Collection i(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0) {
            java.util.Collection r0 = u(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c j(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = I(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.j k(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, x3.n r1, kotlin.jvm.internal.Ref.ObjectRef r2) {
            kotlin.reflect.jvm.internal.impl.storage.j r0 = c0(r0, r1, r2)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g l(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, x3.n r1, kotlin.jvm.internal.Ref.ObjectRef r2) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = d0(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.util.Collection m(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.Collection r0 = H(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.w0 n(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = G(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Collection o(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.Collection r0 = K(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Set p(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0) {
            java.util.Set r0 = J(r0)
            return r0
    }

    static /* synthetic */ java.util.Set q(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0) {
            java.util.Set r0 = Y(r0)
            return r0
    }

    static /* synthetic */ java.util.Set r(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0) {
            java.util.Set r0 = v(r0)
            return r0
    }

    static /* synthetic */ java.util.List s(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.List r0 = X(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a t(kotlin.reflect.jvm.internal.impl.descriptors.d1 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = g0(r0)
            return r0
    }

    private static final java.util.Collection u(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.o
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a
            kotlin.jvm.functions.Function1 r1 = r1.c()
            java.util.List r2 = r2.x(r0, r1)
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    private static final java.util.Set v(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r2) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.t
            r1 = 0
            java.util.Set r2 = r2.w(r0, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c A();

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.types.t0 B(@org.jetbrains.annotations.NotNull x3.r r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r9) {
            r7 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r9, r0)
            x3.g r0 = r8.y()
            boolean r2 = r0.k()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r1 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r1, r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r9 = r9.g()
            x3.x r8 = r8.getReturnType()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r9.p(r8, r0)
            return r8
    }

    protected abstract void C(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2);

    protected abstract void D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> r2);

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2);

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> L() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.k M() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c> O() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c> r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.z0 P();

    @org.jetbrains.annotations.Nullable
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 R() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.k S();

    protected boolean W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.a Z(@org.jetbrains.annotations.NotNull x3.r r1, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r4);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r3 = r1.b()
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L1b
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
        L1b:
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> r3 = r1.h
            java.lang.Object r2 = r3.invoke(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e a0(@org.jetbrains.annotations.NotNull x3.r r20) {
            r19 = this;
            r0 = r19
            r3 = r20
            java.lang.String r1 = "method"
            kotlin.jvm.internal.g0.p(r3, r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r0.b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r1, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r0.S()
            kotlin.reflect.jvm.internal.impl.name.f r4 = r3.getName()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5 = r0.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r5 = r5.a()
            w3.b r5 = r5.t()
            w3.a r5 = r5.a(r3)
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c> r6 = r0.e
            java.lang.Object r6 = r6.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r6 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r6
            kotlin.reflect.jvm.internal.impl.name.f r7 = r3.getName()
            x3.w r6 = r6.f(r7)
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L45
            java.util.List r6 = r3.g()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.k1(r2, r1, r4, r5, r6)
            java.lang.String r1 = "createJavaMethod(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r0.b
            r5 = 4
            r6 = 0
            r4 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.i(r1, r2, r3, r4, r5, r6)
            java.util.List r4 = r3.getTypeParameters()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.f0.d0(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L6d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r6 = r4.next()
            x3.y r6 = (x3.y) r6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r9 = r1.f()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = r9.a(r6)
            kotlin.jvm.internal.g0.m(r6)
            r5.add(r6)
            goto L6d
        L88:
            java.util.List r4 = r3.g()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$b r4 = r0.e0(r1, r2, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r0.B(r3, r1)
            java.util.List r9 = r4.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$a r5 = r0.Z(r3, r5, r6, r9)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r5.c()
            if (r6 == 0) goto Lae
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9 = r9.b()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r6 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r2, r6, r9)
        Lac:
            r10 = r6
            goto Lb0
        Lae:
            r6 = 0
            goto Lac
        Lb0:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r11 = r0.P()
            java.util.List r12 = kotlin.collections.f0.J()
            java.util.List r13 = r5.e()
            java.util.List r14 = r5.f()
            kotlin.reflect.jvm.internal.impl.types.t0 r15 = r5.d()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality$a r6 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion
            boolean r9 = r3.isAbstract()
            boolean r16 = r3.isFinal()
            r8 = r16 ^ 1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r16 = r6.a(r7, r9, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r3 = r3.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r17 = kotlin.reflect.jvm.internal.impl.load.java.s0.d(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r5.c()
            if (r3 == 0) goto Lf8
            kotlin.reflect.jvm.internal.impl.descriptors.a$a<kotlin.reflect.jvm.internal.impl.descriptors.q1> r3 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.G
            java.util.List r6 = r4.a()
            java.lang.Object r6 = kotlin.collections.f0.G2(r6)
            kotlin.Pair r3 = kotlin.o0.a(r3, r6)
            java.util.Map r3 = kotlin.collections.i1.k(r3)
        Lf4:
            r9 = r2
            r18 = r3
            goto Lfd
        Lf8:
            java.util.Map r3 = kotlin.collections.i1.z()
            goto Lf4
        Lfd:
            r9.j1(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r9
            boolean r3 = r5.b()
            boolean r4 = r4.b()
            r2.n1(r3, r4)
            java.util.List r3 = r5.a()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L127
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.o r1 = r1.s()
            java.util.List r3 = r5.a()
            r1.a(r2, r3)
        L127:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            java.util.Set r0 = r1.Q()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r3 = r1.d()
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L1b
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
        L1b:
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0>> r3 = r1.l
            java.lang.Object r2 = r3.invoke(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            java.util.Set r0 = r1.T()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.b e0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r19, @org.jetbrains.annotations.NotNull java.util.List<? extends x3.b0> r20) {
            r17 = this;
            r0 = r18
            r1 = r20
            java.lang.String r2 = "c"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "function"
            r4 = r19
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.String r2 = "jValueParameters"
            kotlin.jvm.internal.g0.p(r1, r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Iterable r2 = kotlin.collections.f0.m6(r2)
            java.util.ArrayList r15 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r2, r3)
            r15.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L129
            java.lang.Object r5 = r2.next()
            kotlin.collections.a1 r5 = (kotlin.collections.a1) r5
            int r6 = r5.a()
            java.lang.Object r5 = r5.b()
            x3.b0 r5 = (x3.b0) r5
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r0, r5)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r8 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r12 = 7
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r8 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r8, r9, r10, r11, r12, r13)
            boolean r9 = r5.a()
            r10 = 0
            r11 = 1
            if (r9 == 0) goto L96
            x3.x r9 = r5.getType()
            boolean r12 = r9 instanceof x3.f
            if (r12 == 0) goto L64
            r10 = r9
            x3.f r10 = (x3.f) r10
        L64:
            if (r10 == 0) goto L7f
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r9 = r0.g()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r9.l(r10, r8, r11)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r9 = r0.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r9 = r9.p()
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r9.k(r8)
            kotlin.Pair r8 = kotlin.o0.a(r8, r9)
            goto La6
        L7f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r9 = r0.g()
            x3.x r12 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r9.p(r12, r8)
            kotlin.Pair r8 = kotlin.o0.a(r8, r10)
        La6:
            java.lang.Object r9 = r8.component1()
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = (kotlin.reflect.jvm.internal.impl.types.t0) r9
            java.lang.Object r8 = r8.component2()
            r13 = r8
            kotlin.reflect.jvm.internal.impl.types.t0 r13 = (kotlin.reflect.jvm.internal.impl.types.t0) r13
            kotlin.reflect.jvm.internal.impl.name.f r8 = r4.getName()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "equals"
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r10)
            if (r8 == 0) goto Le4
            int r8 = r1.size()
            if (r8 != r11) goto Le4
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r8 = r0.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r8 = r8.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r8.J()
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r9)
            if (r8 == 0) goto Le4
            java.lang.String r8 = "other"
            kotlin.reflect.jvm.internal.impl.name.f r8 = kotlin.reflect.jvm.internal.impl.name.f.h(r8)
        Le1:
            r16 = r3
            goto L108
        Le4:
            kotlin.reflect.jvm.internal.impl.name.f r8 = r5.getName()
            if (r8 != 0) goto Leb
            r3 = 1
        Leb:
            if (r8 != 0) goto Le1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r10 = 112(0x70, float:1.57E-43)
            r8.append(r10)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            kotlin.reflect.jvm.internal.impl.name.f r8 = kotlin.reflect.jvm.internal.impl.name.f.h(r8)
            java.lang.String r10 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r8, r10)
            goto Le1
        L108:
            kotlin.jvm.internal.g0.m(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r10 = r0.a()
            w3.b r10 = r10.t()
            w3.a r14 = r10.a(r5)
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.add(r3)
            r4 = r19
            r3 = r16
            goto L2c
        L129:
            java.util.List r0 = kotlin.collections.f0.a6(r15)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$b
            r1.<init>(r0, r3)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            java.util.Set r0 = r1.N()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> r2 = r1.d
            java.lang.Object r2 = r2.invoke()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Lazy scope for "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r2.S()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2);

    @org.jetbrains.annotations.NotNull
    protected final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.k> x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r7) {
            r5 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r2 = r2.c()
            boolean r2 = r6.a(r2)
            if (r2 == 0) goto L45
            java.util.Set r2 = r5.w(r6, r7)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
            java.lang.Object r4 = r7.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r5.g(r3, r0)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r1, r3)
            goto L25
        L45:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r2 = r2.d()
            boolean r2 = r6.a(r2)
            if (r2 == 0) goto L85
            java.util.List r2 = r6.l()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.c$a r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.a
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L85
            java.util.Set r2 = r5.y(r6, r7)
            java.util.Iterator r2 = r2.iterator()
        L65:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
            java.lang.Object r4 = r7.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L65
            java.util.Collection r3 = r5.a(r3, r0)
            r1.addAll(r3)
            goto L65
        L85:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r2 = r2.i()
            boolean r2 = r6.a(r2)
            if (r2 == 0) goto Lc5
            java.util.List r2 = r6.l()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.c$a r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.a
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto Lc5
            java.util.Set r6 = r5.E(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        La5:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r6.next()
            kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
            java.lang.Object r3 = r7.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto La5
            java.util.Collection r2 = r5.c(r2, r0)
            r1.addAll(r2)
            goto La5
        Lc5:
            java.util.List r6 = kotlin.collections.f0.a6(r1)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2);

    protected void z(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }
}

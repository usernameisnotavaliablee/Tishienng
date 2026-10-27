package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n92#2,14:92\n47#2,11:106\n47#2,11:117\n47#2,11:128\n10557#3,5:139\n10557#3,5:144\n13472#3,2:149\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope\n*L\n35#1:92,14\n38#1:106,11\n41#1:117,11\n44#1:128,11\n46#1:139,5\n47#1:144,5\n51#1:149,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.b.a d = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChainedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n37#2:92\n36#2,3:93\n*S KotlinDebug\n*F\n+ 1 ChainedMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/ChainedMemberScope$Companion\n*L\n87#1:92\n87#1:93,3\n*E\n"})
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
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k a(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r5) {
                r3 = this;
                java.lang.String r0 = "debugName"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "scopes"
                kotlin.jvm.internal.g0.p(r5, r0)
                kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            L13:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L35
                java.lang.Object r1 = r5.next()
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r1
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
                if (r1 == r2) goto L13
                boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.b
                if (r2 == 0) goto L31
                kotlin.reflect.jvm.internal.impl.resolve.scopes.b r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.b) r1
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.i(r1)
                kotlin.collections.f0.u0(r0, r1)
                goto L13
            L31:
                r0.add(r1)
                goto L13
            L35:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r3.b(r4, r0)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k b(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r5) {
                r3 = this;
                java.lang.String r0 = "debugName"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "scopes"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r5.size()
                if (r0 == 0) goto L2c
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L25
                kotlin.reflect.jvm.internal.impl.resolve.scopes.b r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.b
                java.util.Collection r5 = (java.util.Collection) r5
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r1 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.k[r2]
                java.lang.Object[] r5 = r5.toArray(r1)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r5 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k[]) r5
                r1 = 0
                r0.<init>(r4, r5, r1)
                return r0
            L25:
                java.lang.Object r4 = r5.get(r2)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r4
                return r4
            L2c:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r4 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
                return r4
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d = r0
            return
    }

    private b(java.lang.String r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return
    }

    public /* synthetic */ b(java.lang.String r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] i(kotlin.reflect.jvm.internal.impl.resolve.scopes.b r0) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r0.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, @org.jetbrains.annotations.NotNull t3.b r7) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.c
            int r1 = r0.length
            if (r1 == 0) goto L33
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L2c
            int r1 = r0.length
            r3 = 0
        L15:
            if (r2 >= r1) goto L24
            r4 = r0[r2]
            java.util.Collection r4 = r4.a(r6, r7)
            java.util.Collection r3 = f4.a.a(r3, r4)
            int r2 = r2 + 1
            goto L15
        L24:
            if (r3 != 0) goto L2b
            java.util.Set r6 = kotlin.collections.u1.k()
            return r6
        L2b:
            return r3
        L2c:
            r0 = r0[r2]
            java.util.Collection r6 = r0.a(r6, r7)
            return r6
        L33:
            java.util.List r6 = kotlin.collections.f0.J()
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.c
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L17
            r4 = r0[r3]
            java.util.Set r4 = r4.b()
            kotlin.collections.f0.s0(r1, r4)
            int r3 = r3 + 1
            goto L9
        L17:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, @org.jetbrains.annotations.NotNull t3.b r7) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.c
            int r1 = r0.length
            if (r1 == 0) goto L33
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L2c
            int r1 = r0.length
            r3 = 0
        L15:
            if (r2 >= r1) goto L24
            r4 = r0[r2]
            java.util.Collection r4 = r4.c(r6, r7)
            java.util.Collection r3 = f4.a.a(r3, r4)
            int r2 = r2 + 1
            goto L15
        L24:
            if (r3 != 0) goto L2b
            java.util.Set r6 = kotlin.collections.u1.k()
            return r6
        L2b:
            return r3
        L2c:
            r0 = r0[r2]
            java.util.Collection r6 = r0.c(r6, r7)
            return r6
        L33:
            java.util.List r6 = kotlin.collections.f0.J()
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.c
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L17
            r4 = r0[r3]
            java.util.Set r4 = r4.d()
            kotlin.collections.f0.s0(r1, r4)
            int r3 = r3 + 1
            goto L9
        L17:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull t3.b r6) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r4.c
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            r3.e(r5, r6)
            int r2 = r2 + 1
            goto Le
        L18:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r1.c
            java.lang.Iterable r0 = kotlin.collections.n.K5(r0)
            java.util.Set r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.m.a(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r7, @org.jetbrains.annotations.NotNull t3.b r8) {
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r6.c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r1) goto L2e
            r4 = r0[r3]
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.g(r7, r8)
            if (r4 == 0) goto L2b
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            if (r5 == 0) goto L2a
            r5 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.c0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.c0) r5
            boolean r5 = r5.q0()
            if (r5 == 0) goto L2a
            if (r2 != 0) goto L2b
            r2 = r4
            goto L2b
        L2a:
            return r4
        L2b:
            int r3 = r3 + 1
            goto Lf
        L2e:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r7) {
            r5 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k[] r0 = r5.c
            int r1 = r0.length
            if (r1 == 0) goto L33
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L2c
            int r1 = r0.length
            r3 = 0
        L15:
            if (r2 >= r1) goto L24
            r4 = r0[r2]
            java.util.Collection r4 = r4.h(r6, r7)
            java.util.Collection r3 = f4.a.a(r3, r4)
            int r2 = r2 + 1
            goto L15
        L24:
            if (r3 != 0) goto L2b
            java.util.Set r6 = kotlin.collections.u1.k()
            return r6
        L2b:
            return r3
        L2c:
            r0 = r0[r2]
            java.util.Collection r6 = r0.h(r6, r7)
            return r6
        L33:
            java.util.List r6 = kotlin.collections.f0.J()
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyPackageViewDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1563#2:72\n1634#2,3:73\n*S KotlinDebug\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl\n*L\n49#1:72\n49#1:73,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class x extends kotlin.reflect.jvm.internal.impl.descriptors.impl.m implements kotlin.reflect.jvm.internal.impl.descriptors.s0 {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] h = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k g;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.impl.x> r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.x.class
            java.lang.String r2 = "fragments"
            java.lang.String r3 = "getFragments()Ljava/util/List;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "empty"
            java.lang.String r5 = "getEmpty()Z"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.x.h = r2
            return
    }

    public x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r5) {
            r2 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r4.g()
            r2.<init>(r0, r1)
            r2.c = r3
            r2.d = r4
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u
            r3.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r5.e(r3)
            r2.e = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.v r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.v
            r3.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r5.e(r3)
            r2.f = r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.i r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.i
            kotlin.reflect.jvm.internal.impl.descriptors.impl.w r4 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.w
            r4.<init>(r2)
            r3.<init>(r5, r4)
            r2.g = r3
            return
    }

    static /* synthetic */ boolean E0(kotlin.reflect.jvm.internal.impl.descriptors.impl.x r0) {
            boolean r0 = G0(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k F0(kotlin.reflect.jvm.internal.impl.descriptors.impl.x r0) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = L0(r0)
            return r0
    }

    private static final boolean G0(kotlin.reflect.jvm.internal.impl.descriptors.impl.x r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r1.K0()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r0 = r0.H0()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.q0.b(r0, r1)
            return r1
    }

    private static final java.util.List H0(kotlin.reflect.jvm.internal.impl.descriptors.impl.x r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r1.K0()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r0 = r0.H0()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.descriptors.q0.c(r0, r1)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k L0(kotlin.reflect.jvm.internal.impl.descriptors.impl.x r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r4 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
            return r4
        L9:
            java.util.List r0 = r4.L()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r2
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
            r1.add(r2)
            goto L1e
        L32:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.p0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = r4.K0()
            kotlin.reflect.jvm.internal.impl.name.c r3 = r4.d()
            r0.<init>(r2, r3)
            java.util.List r0 = kotlin.collections.f0.J4(r1, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "package view scope for "
            r2.append(r3)
            kotlin.reflect.jvm.internal.impl.name.c r3 = r4.d()
            r2.append(r3)
            java.lang.String r3 = " in "
            r2.append(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r4 = r4.K0()
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r1.a(r4, r0)
            return r4
    }

    static /* synthetic */ java.util.List p0(kotlin.reflect.jvm.internal.impl.descriptors.impl.x r0) {
            java.util.List r0 = H0(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f0 C0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r1.K0()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.s0 I0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.d()
            boolean r0 = r0.c()
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r2.K0()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.d()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = r0.M(r1)
            return r0
    }

    protected final boolean J0() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.f
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.x.h
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 K0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.l0> L() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.x.h
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r2, D r3) {
            r1 = this;
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.b(r1, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = r1.I0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.d
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.s0
            if (r0 == 0) goto L7
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.s0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            r0 = 0
            if (r4 != 0) goto Lc
            return r0
        Lc:
            kotlin.reflect.jvm.internal.impl.name.c r1 = r3.d()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r4.d()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L2a
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r1 = r3.K0()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r4 = r4.C0()
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r4 == 0) goto L2a
            r4 = 1
            return r4
        L2a:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r2.K0()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.d()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s0
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.J0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.g
            return r0
    }
}

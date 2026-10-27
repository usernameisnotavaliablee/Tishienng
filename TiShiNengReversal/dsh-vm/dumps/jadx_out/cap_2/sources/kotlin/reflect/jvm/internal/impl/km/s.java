package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1#2:831\n1563#3:832\n1634#3,3:833\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmProperty\n*L\n390#1:832\n390#1:833,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] r = null;
    private int a;

    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.internal.a c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.internal.a d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.km.t e;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.t f;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.w> g;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u h;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> i;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.u> j;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.y k;
    public kotlin.reflect.jvm.internal.impl.km.u l;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> m;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> n;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> o;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> p;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.j> q;

    static {
            kotlin.jvm.internal.MutablePropertyReference1Impl r0 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.s> r1 = kotlin.reflect.jvm.internal.impl.km.s.class
            java.lang.String r2 = "_hasSetter"
            java.lang.String r3 = "get_hasSetter()Z"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.l r0 = kotlin.jvm.internal.o0.k(r0)
            kotlin.jvm.internal.MutablePropertyReference1Impl r2 = new kotlin.jvm.internal.MutablePropertyReference1Impl
            java.lang.String r3 = "_hasGetter"
            java.lang.String r5 = "get_hasGetter()Z"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.l r1 = kotlin.jvm.internal.o0.k(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.impl.km.s.r = r2
            return
    }

    public s(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            kotlin.reflect.jvm.internal.impl.km.internal.d r2 = new kotlin.reflect.jvm.internal.impl.km.internal.d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A
            java.lang.String r0 = "HAS_SETTER"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.km.internal.a r2 = kotlin.reflect.jvm.internal.impl.km.internal.c.g(r2)
            r1.c = r2
            kotlin.reflect.jvm.internal.impl.km.internal.d r2 = new kotlin.reflect.jvm.internal.impl.km.internal.d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.z
            java.lang.String r0 = "HAS_GETTER"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.km.internal.a r2 = kotlin.reflect.jvm.internal.impl.km.internal.c.g(r2)
            r1.d = r2
            kotlin.reflect.jvm.internal.impl.km.t r2 = new kotlin.reflect.jvm.internal.impl.km.t
            r2.<init>(r4)
            r3 = 1
            r1.u(r3)
            r1.e = r2
            boolean r2 = r1.p()
            if (r2 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.km.t r2 = new kotlin.reflect.jvm.internal.impl.km.t
            r2.<init>(r5)
            goto L48
        L47:
            r2 = 0
        L48:
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 0
            r2.<init>(r3)
            r1.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.m = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.n = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.o = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.p = r2
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r2 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r2 = r2.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L93:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La7
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r4 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r4
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.j r4 = r4.p()
            r3.add(r4)
            goto L93
        La7:
            r1.q = r3
            return
    }

    private final boolean p() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.km.s.r
            r2 = 0
            r1 = r1[r2]
            boolean r0 = r0.a(r3, r1)
            return r0
    }

    private final void u(boolean r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.km.s.r
            r2 = 1
            r1 = r1[r2]
            r0.b(r3, r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> b() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.o
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.u> c() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.u> r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> d() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.p
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> e() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.i
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.j> f() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.j> r0 = r1.q
            return r0
    }

    public final int g() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.t h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.t r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.u j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.u k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.l
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.t l() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.t r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.y m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.y r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.w> n() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.w> r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> o() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> r0 = r1.m
            return r0
    }

    public final void q(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void r(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public final void s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.l = r2
            return
    }

    public final void t(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.y r1) {
            r0 = this;
            r0.k = r1
            return
    }
}

package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmFunction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmFunction\n*L\n263#1:831\n263#1:832,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q {
    private int a;

    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.w> c;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.u> f;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.y> g;
    public kotlin.reflect.jvm.internal.impl.km.u h;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> i;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.k j;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> k;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.g> l;

    public q(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 0
            r2.<init>(r3)
            r1.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.k = r2
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r2 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r2 = r2.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.f0.d0(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r0 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r0
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.g r0 = r0.u()
            r3.add(r0)
            goto L4e
        L62:
            r1.l = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.u> b() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.u> r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> c() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.g> d() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.g> r0 = r1.l
            return r0
    }

    public final int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.w> f() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.w> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.y> g() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.y> r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> h() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> r0 = r1.i
            return r0
    }

    public final void i(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.k r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public final void j(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void k(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public final void l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }
}

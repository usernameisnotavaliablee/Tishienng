package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeAlias\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n1617#2,9:831\n1869#2:840\n1870#2:842\n1626#2:843\n1#3:841\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeAlias\n*L\n435#1:831,9\n435#1:840\n435#1:842\n435#1:843\n435#1:841\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v {
    private int a;

    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.w> c;
    public kotlin.reflect.jvm.internal.impl.km.u d;
    public kotlin.reflect.jvm.internal.impl.km.u e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> f;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> g;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.k> h;

    public v(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
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
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r1.g = r2
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r2 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r2 = r2.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r0 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r0
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.k r0 = r0.a()
            if (r0 == 0) goto L33
            r3.add(r0)
            goto L33
        L49:
            r1.h = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.f
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.w> c() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.w> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> d() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> r0 = r1.g
            return r0
    }

    public final void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.e = r2
            return
    }

    public final void f(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }
}

package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeParameter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeParameter\n*L\n505#1:831\n505#1:832,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class w {
    private int a;

    @org.jetbrains.annotations.NotNull
    private java.lang.String b;
    private int c;

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.km.KmVariance d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.u> e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.m> f;

    public w(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3, int r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.KmVariance r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "variance"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 1
            r2.<init>(r3)
            r1.e = r2
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r2 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r2 = r2.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r4 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r4
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.m r4 = r4.j()
            r3.add(r4)
            goto L34
        L48:
            r1.f = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.m> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.m> r0 = r1.f
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.u> e() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.u> r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.KmVariance f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.KmVariance r0 = r1.d
            return r0
    }

    public final void g(int r1) {
            r0 = this;
            r0.a = r1
            return
    }
}

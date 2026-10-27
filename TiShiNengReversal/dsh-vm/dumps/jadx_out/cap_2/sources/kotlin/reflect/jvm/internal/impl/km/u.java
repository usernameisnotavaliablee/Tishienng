package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmType\n*L\n579#1:831\n579#1:832,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u {
    private int a;
    public kotlin.reflect.jvm.internal.impl.km.h b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.x> c;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u d;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u e;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.p f;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.l> g;

    public u() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public u(int r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 0
            r3.<init>(r0)
            r2.c = r3
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r3 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r3 = r3.c()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r1 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r1
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.l r1 = r1.h()
            r0.add(r1)
            goto L24
        L38:
            r2.g = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.u a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.x> b() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.x> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.h c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.h r0 = r1.b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.l> d() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.l> r0 = r1.g
            return r0
    }

    public final int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<kotlin.reflect.jvm.internal.impl.km.u> r2 = kotlin.reflect.jvm.internal.impl.km.u.class
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.metadata.KmType"
            kotlin.jvm.internal.g0.n(r5, r1)
            kotlin.reflect.jvm.internal.impl.km.u r5 = (kotlin.reflect.jvm.internal.impl.km.u) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L24
            return r2
        L24:
            kotlin.reflect.jvm.internal.impl.km.h r1 = r4.c()
            kotlin.reflect.jvm.internal.impl.km.h r3 = r5.c()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L33
            return r2
        L33:
            java.util.List<kotlin.reflect.jvm.internal.impl.km.x> r1 = r4.c
            java.util.List<kotlin.reflect.jvm.internal.impl.km.x> r3 = r5.c
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L3e
            return r2
        L3e:
            kotlin.reflect.jvm.internal.impl.km.u r1 = r4.e
            kotlin.reflect.jvm.internal.impl.km.u r3 = r5.e
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L49
            return r2
        L49:
            kotlin.reflect.jvm.internal.impl.km.u r1 = r4.d
            kotlin.reflect.jvm.internal.impl.km.u r3 = r5.d
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L54
            return r2
        L54:
            kotlin.reflect.jvm.internal.impl.km.p r1 = r4.f
            kotlin.reflect.jvm.internal.impl.km.p r3 = r5.f
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L5f
            return r2
        L5f:
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.l> r1 = r4.g
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.l> r5 = r5.g
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L6a
            return r2
        L6a:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.p f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.p r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.u g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.e
            return r0
    }

    public final void h(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.km.h r1 = r2.c()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<kotlin.reflect.jvm.internal.impl.km.x> r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final void i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.h r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.b = r2
            return
    }

    public final void j(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void k(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.p r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public final void l(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r1) {
            r0 = this;
            r0.e = r1
            return
    }
}

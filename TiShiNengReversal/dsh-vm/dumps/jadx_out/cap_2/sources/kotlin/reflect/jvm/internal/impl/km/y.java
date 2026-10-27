package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmValueParameter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n1617#2,9:831\n1869#2:840\n1870#2:842\n1626#2:843\n1#3:841\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmValueParameter\n*L\n476#1:831,9\n476#1:840\n476#1:842\n476#1:843\n476#1:841\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y {
    private int a;

    @org.jetbrains.annotations.NotNull
    private java.lang.String b;
    public kotlin.reflect.jvm.internal.impl.km.u c;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u d;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.e e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> f;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.n> g;

    public y(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 0
            r2.<init>(r3)
            r1.f = r2
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r2 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r2 = r2.c()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r0 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r0
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.n r0 = r0.k()
            if (r0 == 0) goto L25
            r3.add(r0)
            goto L25
        L3b:
            r1.g = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.e a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.e r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> b() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.f
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.km.u e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.d
            return r0
    }

    public final void f(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.e r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public final void g(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.km.u getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.u r0 = r1.c
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    public final void h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.c = r2
            return
    }

    public final void i(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r1) {
            r0 = this;
            r0.d = r1
            return
    }
}

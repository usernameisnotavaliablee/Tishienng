package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmConstructor\n*L\n199#1:831\n199#1:832,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {
    private int a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.y> b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.c> e;

    public j() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public j(int r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 0
            r3.<init>(r0)
            r2.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.d = r3
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r3 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r3 = r3.c()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r1 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r1
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.c r1 = r1.f()
            r0.add(r1)
            goto L32
        L46:
            r2.e = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.c> b() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.c> r0 = r1.e
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.y> d() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.y> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> e() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.a0> r0 = r1.c
            return r0
    }

    public final void f(int r1) {
            r0 = this;
            r0.a = r1
            return
    }
}

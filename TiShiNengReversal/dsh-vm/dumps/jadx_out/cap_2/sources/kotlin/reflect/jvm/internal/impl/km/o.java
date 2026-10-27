package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmEnumEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n1617#2,9:831\n1869#2:840\n1870#2:842\n1626#2:843\n1#3:841\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmEnumEntry\n*L\n521#1:831,9\n521#1:840\n521#1:842\n521#1:843\n521#1:841\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {

    @org.jetbrains.annotations.NotNull
    private java.lang.String a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.d> c;

    public o(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 0
            r3.<init>(r0)
            r2.b = r3
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p$a r3 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.p.a
            java.util.List r3 = r3.c()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.p r1 = (kotlin.reflect.jvm.internal.impl.km.internal.extensions.p) r1
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.d r1 = r1.b()
            if (r1 == 0) goto L23
            r0.add(r1)
            goto L23
        L39:
            r2.c = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.d> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.d> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}

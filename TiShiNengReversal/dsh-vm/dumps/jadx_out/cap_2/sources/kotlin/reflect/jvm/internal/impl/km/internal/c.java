package kotlin.reflect.jvm.internal.impl.km.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFlagDelegatesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlagDelegatesImpl.kt\nkotlin/metadata/internal/FlagDelegatesImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1563#2:89\n1634#2,3:90\n1563#2:93\n1634#2,3:94\n1563#2:97\n1634#2,3:98\n*S KotlinDebug\n*F\n+ 1 FlagDelegatesImpl.kt\nkotlin/metadata/internal/FlagDelegatesImplKt\n*L\n50#1:89\n50#1:90,3\n53#1:93\n53#1:94,3\n56#1:97\n56#1:98,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {









    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.g> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$a r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.a.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.j> b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$b r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.b.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.q> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$c r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.C0037c.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <Node> kotlin.reflect.jvm.internal.impl.km.internal.b<Node, kotlin.reflect.jvm.internal.impl.km.MemberKind> d(@org.jetbrains.annotations.NotNull kotlin.reflect.l<Node, java.lang.Integer> r5) {
            java.lang.String r0 = "flags"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind> r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.p
            java.lang.String r1 = "MEMBER_KIND"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.enums.a r1 = kotlin.reflect.jvm.internal.impl.km.MemberKind.getEntries()
            kotlin.enums.a r2 = kotlin.reflect.jvm.internal.impl.km.MemberKind.getEntries()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.MemberKind r4 = (kotlin.reflect.jvm.internal.impl.km.MemberKind) r4
            kotlin.reflect.jvm.internal.impl.km.internal.d r4 = r4.getFlag$kotlin_metadata()
            r3.add(r4)
            goto L23
        L37:
            kotlin.reflect.jvm.internal.impl.km.internal.b r2 = new kotlin.reflect.jvm.internal.impl.km.internal.b
            r2.<init>(r5, r0, r1, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <Node> kotlin.reflect.jvm.internal.impl.km.internal.b<Node, kotlin.reflect.jvm.internal.impl.km.Modality> e(@org.jetbrains.annotations.NotNull kotlin.reflect.l<Node, java.lang.Integer> r5) {
            java.lang.String r0 = "flags"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e
            java.lang.String r1 = "MODALITY"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.enums.a r1 = kotlin.reflect.jvm.internal.impl.km.Modality.getEntries()
            kotlin.enums.a r2 = kotlin.reflect.jvm.internal.impl.km.Modality.getEntries()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.Modality r4 = (kotlin.reflect.jvm.internal.impl.km.Modality) r4
            kotlin.reflect.jvm.internal.impl.km.internal.d r4 = r4.getFlag$kotlin_metadata()
            r3.add(r4)
            goto L23
        L37:
            kotlin.reflect.jvm.internal.impl.km.internal.b r2 = new kotlin.reflect.jvm.internal.impl.km.internal.b
            r2.<init>(r5, r0, r1, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.t> f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$d r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.d.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.s> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$e r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.e.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.v> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$f r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.f.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.u> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$g r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.g.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.km.internal.a<kotlin.reflect.jvm.internal.impl.km.y> j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.d r2) {
            java.lang.String r0 = "flag"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.km.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.internal.a
            kotlin.reflect.jvm.internal.impl.km.internal.c$h r1 = kotlin.reflect.jvm.internal.impl.km.internal.c.h.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <Node> kotlin.reflect.jvm.internal.impl.km.internal.b<Node, kotlin.reflect.jvm.internal.impl.km.Visibility> k(@org.jetbrains.annotations.NotNull kotlin.reflect.l<Node, java.lang.Integer> r5) {
            java.lang.String r0 = "flags"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            java.lang.String r1 = "VISIBILITY"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.enums.a r1 = kotlin.reflect.jvm.internal.impl.km.Visibility.getEntries()
            kotlin.enums.a r2 = kotlin.reflect.jvm.internal.impl.km.Visibility.getEntries()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.km.Visibility r4 = (kotlin.reflect.jvm.internal.impl.km.Visibility) r4
            kotlin.reflect.jvm.internal.impl.km.internal.d r4 = r4.getFlag$kotlin_metadata()
            r3.add(r4)
            goto L23
        L37:
            kotlin.reflect.jvm.internal.impl.km.internal.b r2 = new kotlin.reflect.jvm.internal.impl.km.internal.b
            r2.<init>(r5, r0, r1, r3)
            return r2
    }
}

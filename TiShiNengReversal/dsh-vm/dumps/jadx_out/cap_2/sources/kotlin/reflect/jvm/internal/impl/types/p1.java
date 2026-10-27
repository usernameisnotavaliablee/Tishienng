package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p1 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.p1.a e = null;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.p1 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.i1 b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.j1, kotlin.reflect.jvm.internal.impl.types.c2> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAliasExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1563#2:44\n1634#2,3:45\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n*L\n34#1:44\n34#1:45,3\n*E\n"})
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.p1 a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.p1 r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r9, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r10) {
                r7 = this;
                java.lang.String r0 = "typeAliasDescriptor"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r0 = "arguments"
                kotlin.jvm.internal.g0.p(r10, r0)
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r9.o()
                java.util.List r0 = r0.getParameters()
                java.lang.String r1 = "getParameters(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.f0.d0(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L28:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3c
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = r2.a()
                r1.add(r2)
                goto L28
            L3c:
                r0 = r10
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.f0.o6(r1, r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Map r5 = kotlin.collections.i1.B0(r0)
                kotlin.reflect.jvm.internal.impl.types.p1 r1 = new kotlin.reflect.jvm.internal.impl.types.p1
                r6 = 0
                r2 = r8
                r3 = r9
                r4 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.p1$a r0 = new kotlin.reflect.jvm.internal.impl.types.p1$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.p1.e = r0
            return
    }

    private p1(kotlin.reflect.jvm.internal.impl.types.p1 r1, kotlin.reflect.jvm.internal.impl.descriptors.i1 r2, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r3, java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.j1, ? extends kotlin.reflect.jvm.internal.impl.types.c2> r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public /* synthetic */ p1(kotlin.reflect.jvm.internal.impl.types.p1 r1, kotlin.reflect.jvm.internal.impl.descriptors.i1 r2, java.util.List r3, java.util.Map r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.i1 b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.c2 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r2) {
            r1 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L16
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.j1, kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.d
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r3) {
            r2 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r2.b
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r0 != 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.p1 r0 = r2.a
            r1 = 0
            if (r0 == 0) goto L17
            boolean r3 = r0.d(r3)
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            return r1
        L1c:
            r3 = 1
            return r3
    }
}

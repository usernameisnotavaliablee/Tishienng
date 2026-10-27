package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeclaredMemberIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n996#2:67\n1025#2,3:68\n1028#2,3:78\n682#2:81\n712#2,4:82\n1163#2,3:95\n1163#2,3:98\n382#3,7:71\n774#4:86\n865#4,2:87\n1208#4,2:89\n1236#4,4:91\n*S KotlinDebug\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n*L\n52#1:67\n52#1:68,3\n52#1:78,3\n53#1:81\n53#1:82,4\n57#1:95,3\n60#1:98,3\n52#1:71,7\n54#1:86\n54#1:87,2\n54#1:89,2\n54#1:91,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b implements kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c {

    @org.jetbrains.annotations.NotNull
    private final x3.g a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<x3.q, java.lang.Boolean> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<x3.r, java.lang.Boolean> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, java.util.List<x3.r>> d;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.n> e;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.w> f;

    public b(@org.jetbrains.annotations.NotNull x3.g r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super x3.q, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "memberFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            r3.<init>()
            r3.a = r4
            r3.b = r5
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
            r5.<init>(r3)
            r3.c = r5
            java.util.Collection r4 = r4.r()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.sequences.m r4 = kotlin.collections.f0.E1(r4)
            kotlin.sequences.m r4 = kotlin.sequences.p.P0(r4, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r4.next()
            r1 = r0
            x3.r r1 = (x3.r) r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            java.lang.Object r2 = r5.get(r1)
            if (r2 != 0) goto L4e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.put(r1, r2)
        L4e:
            java.util.List r2 = (java.util.List) r2
            r2.add(r0)
            goto L2f
        L54:
            r3.d = r5
            x3.g r4 = r3.a
            java.util.Collection r4 = r4.F()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.sequences.m r4 = kotlin.collections.f0.E1(r4)
            kotlin.jvm.functions.Function1<x3.q, java.lang.Boolean> r5 = r3.b
            kotlin.sequences.m r4 = kotlin.sequences.p.P0(r4, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r4.next()
            r1 = r0
            x3.n r1 = (x3.n) r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            r5.put(r1, r0)
            goto L71
        L86:
            r3.e = r5
            x3.g r4 = r3.a
            java.util.Collection r4 = r4.z()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.jvm.functions.Function1<x3.q, java.lang.Boolean> r5 = r3.b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9b
            r0.add(r1)
            goto L9b
        Lb5:
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r0, r4)
            int r4 = kotlin.collections.i1.j(r4)
            r5 = 16
            int r4 = kotlin.ranges.t.u(r4, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        Lce:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Le3
            java.lang.Object r0 = r4.next()
            r1 = r0
            x3.w r1 = (x3.w) r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
            r5.put(r1, r0)
            goto Lce
        Le3:
            r3.f = r5
            return
    }

    static /* synthetic */ boolean g(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r0, x3.r r1) {
            boolean r0 = h(r0, r1)
            return r0
    }

    private static final boolean h(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r1, x3.r r2) {
            java.lang.String r0 = "m"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<x3.q, java.lang.Boolean> r1 = r1.b
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1b
            boolean r1 = x3.p.c(r2)
            if (r1 != 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            r3 = this;
            x3.g r0 = r3.a
            java.util.Collection r0 = r0.r()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlin.jvm.functions.Function1<x3.r, java.lang.Boolean> r1 = r3.c
            kotlin.sequences.m r0 = kotlin.sequences.p.P0(r0, r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            x3.r r2 = (x3.r) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            r1.add(r2)
            goto L1b
        L2f:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.w> r0 = r1.f
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
    @org.jetbrains.annotations.Nullable
    public x3.n c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.n> r0 = r1.e
            java.lang.Object r2 = r0.get(r2)
            x3.n r2 = (x3.n) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r3 = this;
            x3.g r0 = r3.a
            java.util.Collection r0 = r0.F()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlin.jvm.functions.Function1<x3.q, java.lang.Boolean> r1 = r3.b
            kotlin.sequences.m r0 = kotlin.sequences.p.P0(r0, r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            x3.n r2 = (x3.n) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            r1.add(r2)
            goto L1b
        L2f:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<x3.r> e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, java.util.List<x3.r>> r0 = r1.d
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L12
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
        L12:
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c
    @org.jetbrains.annotations.Nullable
    public x3.w f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.w> r0 = r1.f
            java.lang.Object r2 = r0.get(r2)
            x3.w r2 = (x3.w) r2
            return r2
    }
}

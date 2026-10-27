package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFakePureImplementationsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n1299#2,4:39\n11228#3:43\n11563#3,3:44\n126#4:47\n153#4,3:48\n*S KotlinDebug\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n*L\n18#1:39,4\n36#1:43\n36#1:44,3\n32#1:47\n32#1:48,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.q a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> c = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.q r0 = new kotlin.reflect.jvm.internal.impl.load.java.q
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.q.a = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.q.b = r1
            kotlin.reflect.jvm.internal.impl.name.i r2 = kotlin.reflect.jvm.internal.impl.name.i.a
            kotlin.reflect.jvm.internal.impl.name.b r3 = r2.m()
            java.lang.String r4 = "java.util.ArrayList"
            java.lang.String r5 = "java.util.LinkedList"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = r0.a(r4)
            r0.c(r3, r4)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r2.o()
            java.lang.String r4 = "java.util.TreeSet"
            java.lang.String r5 = "java.util.LinkedHashSet"
            java.lang.String r6 = "java.util.HashSet"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.util.List r4 = r0.a(r4)
            r0.c(r3, r4)
            kotlin.reflect.jvm.internal.impl.name.b r2 = r2.n()
            java.lang.String r3 = "java.util.concurrent.ConcurrentHashMap"
            java.lang.String r4 = "java.util.concurrent.ConcurrentSkipListMap"
            java.lang.String r5 = "java.util.HashMap"
            java.lang.String r6 = "java.util.TreeMap"
            java.lang.String r7 = "java.util.LinkedHashMap"
            java.lang.String[] r3 = new java.lang.String[]{r5, r6, r7, r3, r4}
            java.util.List r3 = r0.a(r3)
            r0.c(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.b$a r2 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r3 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r4 = "java.util.function.Function"
            r3.<init>(r4)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r2.c(r3)
            java.lang.String r4 = "java.util.function.UnaryOperator"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r4 = r0.a(r4)
            r0.c(r3, r4)
            kotlin.reflect.jvm.internal.impl.name.c r3 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r4 = "java.util.function.BiFunction"
            r3.<init>(r4)
            kotlin.reflect.jvm.internal.impl.name.b r2 = r2.c(r3)
            java.lang.String r3 = "java.util.function.BinaryOperator"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r3 = r0.a(r3)
            r0.c(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L94:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.name.b r3 = (kotlin.reflect.jvm.internal.impl.name.b) r3
            java.lang.Object r2 = r2.getValue()
            kotlin.reflect.jvm.internal.impl.name.b r2 = (kotlin.reflect.jvm.internal.impl.name.b) r2
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.a()
            kotlin.Pair r2 = kotlin.o0.a(r3, r2)
            r0.add(r2)
            goto L94
        Lbc:
            java.util.Map r0 = kotlin.collections.i1.B0(r0)
            kotlin.reflect.jvm.internal.impl.load.java.q.c = r0
            return
    }

    private q() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.name.b> a(java.lang.String... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1d
            r3 = r7[r2]
            kotlin.reflect.jvm.internal.impl.name.b$a r4 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r5 = new kotlin.reflect.jvm.internal.impl.name.c
            r5.<init>(r3)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r4.c(r5)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L1d:
            return r0
    }

    private final void c(kotlin.reflect.jvm.internal.impl.name.b r4, java.util.List<kotlin.reflect.jvm.internal.impl.name.b> r5) {
            r3 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> r0 = kotlin.reflect.jvm.internal.impl.load.java.q.b
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.name.b r2 = (kotlin.reflect.jvm.internal.impl.name.b) r2
            r0.put(r1, r4)
            goto L8
        L19:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.name.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "classFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> r0 = kotlin.reflect.jvm.internal.impl.load.java.q.c
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.name.c r2 = (kotlin.reflect.jvm.internal.impl.name.c) r2
            return r2
    }
}

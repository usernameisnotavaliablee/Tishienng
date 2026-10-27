package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class x1 extends kotlin.collections.w1 {
    public x1() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> A(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            kotlin.collections.m0.M0(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> B(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = y(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> C(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Integer r0 = kotlin.collections.i0.e0(r3)
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            int r1 = r2.size()
            int r1 = r1 + r0
            goto L20
        L1a:
            int r0 = r2.size()
            int r1 = r0 * 2
        L20:
            int r0 = kotlin.collections.k1.j(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r1.addAll(r2)
            kotlin.collections.m0.s0(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> D(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 + 1
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> E(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 * 2
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            r0.addAll(r2)
            kotlin.collections.m0.t0(r0, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> F(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r3, @org.jetbrains.annotations.NotNull T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r3.size()
            int r2 = r4.length
            int r1 = r1 + r2
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            r0.addAll(r3)
            kotlin.collections.m0.u0(r0, r4)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> G(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = D(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> x(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r3, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Collection r4 = kotlin.collections.m0.v0(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L19
            java.util.Set r3 = kotlin.collections.r0.f6(r3)
            return r3
        L19:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L3e
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            r2 = r4
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L26
            r0.add(r1)
            goto L26
        L3d:
            return r0
        L3e:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r3)
            r0.removeAll(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> y(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r6, T r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r6.size()
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = 0
        L18:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L2d
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r7)
            if (r5 == 0) goto L2d
            r2 = 1
            r4 = 0
        L2d:
            if (r4 == 0) goto L18
            r0.add(r3)
            goto L18
        L33:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> z(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            kotlin.collections.m0.L0(r0, r2)
            return r0
    }
}

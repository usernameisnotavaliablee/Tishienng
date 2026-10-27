package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m0 extends kotlin.collections.l0 {
    public m0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void A0(java.util.Collection<? super T> r1, kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            L0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void B0(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            M0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void C0(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            s0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void D0(java.util.Collection<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.add(r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void E0(java.util.Collection<? super T> r1, kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            t0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void F0(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            u0(r1, r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.ReplaceWith(expression = "removeAt(index)", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> T G0(java.util.List<T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.remove(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean H0(java.util.Collection<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Collection r1 = kotlin.jvm.internal.u0.a(r1)
            boolean r1 = r1.remove(r2)
            return r1
    }

    public static final <T> boolean I0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            boolean r1 = w0(r1, r2, r0)
            return r1
    }

    public static final <T> boolean J0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r2 = v0(r2)
            boolean r1 = r1.removeAll(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean K0(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r1 = kotlin.jvm.internal.u0.a(r1)
            boolean r1 = r1.removeAll(r2)
            return r1
    }

    public static final <T> boolean L0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.sequences.p.I3(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            boolean r1 = r1.removeAll(r2)
            if (r1 == 0) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static final <T> boolean M0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r3, @org.jetbrains.annotations.NotNull T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L21
            java.util.List r4 = kotlin.collections.q.t(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r3 = r3.removeAll(r4)
            if (r3 == 0) goto L21
            return r2
        L21:
            return r1
    }

    public static final <T> boolean N0(@org.jetbrains.annotations.NotNull java.util.List<T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            boolean r1 = x0(r1, r2, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final <T> T O0(@org.jetbrains.annotations.NotNull java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r1 = r1.remove(r0)
            return r1
        L11:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T P0(@org.jetbrains.annotations.NotNull java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.remove(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static <T> T Q0(@org.jetbrains.annotations.NotNull java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = kotlin.collections.h0.L(r1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static <T> T R0(@org.jetbrains.annotations.NotNull java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            int r0 = kotlin.collections.h0.L(r1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
    }

    public static <T> boolean S0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            boolean r1 = w0(r1, r2, r0)
            return r1
    }

    public static final <T> boolean T0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r2 = v0(r2)
            boolean r1 = r1.retainAll(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean U0(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r1 = kotlin.jvm.internal.u0.a(r1)
            boolean r1 = r1.retainAll(r2)
            return r1
    }

    public static final <T> boolean V0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.sequences.p.I3(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1b
            boolean r1 = r1.retainAll(r2)
            return r1
        L1b:
            boolean r1 = Y0(r1)
            return r1
    }

    public static final <T> boolean W0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L1d
            java.util.List r2 = kotlin.collections.q.t(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r1.retainAll(r2)
            return r1
        L1d:
            boolean r1 = Y0(r1)
            return r1
    }

    public static final <T> boolean X0(@org.jetbrains.annotations.NotNull java.util.List<T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            boolean r1 = x0(r1, r2, r0)
            return r1
    }

    private static final boolean Y0(java.util.Collection<?> r1) {
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r1.clear()
            return r0
    }

    public static <T> boolean s0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L15
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.addAll(r3)
            return r2
        L15:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L1a
            r0 = 1
            goto L1a
        L2c:
            return r0
    }

    public static <T> boolean t0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto Lf
            r0 = 1
            goto Lf
        L21:
            return r0
    }

    public static <T> boolean u0(@org.jetbrains.annotations.NotNull java.util.Collection<? super T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.q.t(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r1.addAll(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Collection<T> v0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
        Lc:
            java.util.List r1 = kotlin.collections.r0.a6(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    private static final <T> boolean w0(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3, boolean r4) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r4) goto L5
            r2.remove()
            r0 = 1
            goto L5
        L20:
            return r0
    }

    private static final <T> boolean x0(java.util.List<T> r6, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r7, boolean r8) {
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 != 0) goto L12
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>"
            kotlin.jvm.internal.g0.n(r6, r0)
            java.lang.Iterable r6 = kotlin.jvm.internal.u0.c(r6)
            boolean r6 = w0(r6, r7, r8)
            return r6
        L12:
            int r0 = kotlin.collections.h0.L(r6)
            r1 = 0
            if (r0 < 0) goto L38
            r2 = 0
            r3 = 0
        L1b:
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r8) goto L2c
            goto L33
        L2c:
            if (r3 == r2) goto L31
            r6.set(r3, r4)
        L31:
            int r3 = r3 + 1
        L33:
            if (r2 == r0) goto L39
            int r2 = r2 + 1
            goto L1b
        L38:
            r3 = 0
        L39:
            int r7 = r6.size()
            if (r3 >= r7) goto L4f
            int r7 = kotlin.collections.h0.L(r6)
            if (r3 > r7) goto L4d
        L45:
            r6.remove(r7)
            if (r7 == r3) goto L4d
            int r7 = r7 + (-1)
            goto L45
        L4d:
            r6 = 1
            return r6
        L4f:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> void y0(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            J0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> void z0(java.util.Collection<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.remove(r2)
            return
    }
}

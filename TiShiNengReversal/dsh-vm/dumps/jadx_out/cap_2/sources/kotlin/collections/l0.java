package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class l0 extends kotlin.collections.k0 {
    public l0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final <T> void l0(java.util.List<T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Collections.fill(r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final <T> void m0(java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Collections.shuffle(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.internal.InlineOnly
    private static final <T> void n0(java.util.List<T> r1, java.util.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collections.shuffle(r1, r2)
            return
    }

    public static <T extends java.lang.Comparable<? super T>> void o0(@org.jetbrains.annotations.NotNull java.util.List<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto Lf
            java.util.Collections.sort(r2)
        Lf:
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.sortWith(comparator)", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> void p0(java.util.List<T> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r1)
            kotlin.NotImplementedError r1 = new kotlin.NotImplementedError
            r2 = 0
            r0 = 1
            r1.<init>(r2, r0, r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> void q0(java.util.List<T> r1, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = "comparison"
            kotlin.jvm.internal.g0.p(r2, r1)
            kotlin.NotImplementedError r1 = new kotlin.NotImplementedError
            r2 = 0
            r0 = 1
            r1.<init>(r2, r0, r2)
            throw r1
    }

    public static <T> void r0(@org.jetbrains.annotations.NotNull java.util.List<T> r2, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L14
            java.util.Collections.sort(r2, r3)
        L14:
            return
    }
}

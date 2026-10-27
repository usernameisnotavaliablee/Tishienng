package kotlin.comparisons;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k implements java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.comparisons.k a = null;

    static {
            kotlin.comparisons.k r0 = new kotlin.comparisons.k
            r0.<init>()
            kotlin.comparisons.k.a = r0
            return
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    public int a(@org.jetbrains.annotations.NotNull java.lang.Comparable<java.lang.Object> r2, @org.jetbrains.annotations.NotNull java.lang.Comparable<java.lang.Object> r3) {
            r1 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r2 = r3.compareTo(r2)
            return r2
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Comparable<? super java.lang.Object> r1, java.lang.Comparable<? super java.lang.Object> r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r1 = r0.a(r1, r2)
            return r1
    }

    @Override // java.util.Comparator
    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> reversed() {
            r1 = this;
            kotlin.comparisons.j r0 = kotlin.comparisons.j.a
            return r0
    }
}

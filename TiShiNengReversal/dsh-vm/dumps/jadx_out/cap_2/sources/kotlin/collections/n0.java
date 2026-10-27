package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class n0 extends kotlin.collections.m0 {
    public n0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int Z0(java.util.List r0, int r1) {
            int r0 = e1(r0, r1)
            return r0
    }

    public static final /* synthetic */ int a1(java.util.List r0, int r1) {
            int r0 = f1(r0, r1)
            return r0
    }

    public static final /* synthetic */ int b1(java.util.List r0, int r1) {
            int r0 = g1(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> c1(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.s1 r0 = new kotlin.collections.s1
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "asReversedMutable")
    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> d1(@org.jetbrains.annotations.NotNull java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.r1 r0 = new kotlin.collections.r1
            r0.<init>(r1)
            return r0
    }

    private static final int e1(java.util.List<?> r3, int r4) {
            if (r4 < 0) goto Le
            int r0 = kotlin.collections.h0.L(r3)
            if (r4 > r0) goto Le
            int r3 = kotlin.collections.h0.L(r3)
            int r3 = r3 - r4
            return r3
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " must be in range ["
            r1.append(r4)
            kotlin.ranges.m r4 = new kotlin.ranges.m
            r2 = 0
            int r3 = kotlin.collections.h0.L(r3)
            r4.<init>(r2, r3)
            r1.append(r4)
            java.lang.String r3 = "]."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final int f1(java.util.List<?> r0, int r1) {
            int r0 = kotlin.collections.h0.L(r0)
            int r0 = r0 - r1
            return r0
    }

    private static final int g1(java.util.List<?> r3, int r4) {
            if (r4 < 0) goto Le
            int r0 = r3.size()
            if (r4 > r0) goto Le
            int r3 = r3.size()
            int r3 = r3 - r4
            return r3
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Position index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " must be in range ["
            r1.append(r4)
            kotlin.ranges.m r4 = new kotlin.ranges.m
            r2 = 0
            int r3 = r3.size()
            r4.<init>(r2, r3)
            r1.append(r4)
            java.lang.String r3 = "]."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}

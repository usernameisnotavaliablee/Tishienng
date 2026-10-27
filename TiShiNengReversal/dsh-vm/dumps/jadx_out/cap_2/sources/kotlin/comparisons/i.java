package kotlin.comparisons;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class i extends kotlin.comparisons.h {
    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final <T> T A0(T r4, @org.jetbrains.annotations.NotNull T[] r5, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            int r3 = r6.compare(r4, r2)
            if (r3 >= 0) goto L17
            r4 = r2
        L17:
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final <T> T B0(T r1, T r2, T r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r2 = C0(r2, r3, r4)
            java.lang.Object r1 = C0(r1, r2, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final <T> T C0(T r1, T r2, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r3 = r3.compare(r1, r2)
            if (r3 > 0) goto Lc
            return r1
        Lc:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static final <T> T D0(T r4, @org.jetbrains.annotations.NotNull T[] r5, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            int r3 = r6.compare(r4, r2)
            if (r3 <= 0) goto L17
            r4 = r2
        L17:
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final <T> T y0(T r1, T r2, T r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r2 = z0(r2, r3, r4)
            java.lang.Object r1 = z0(r1, r2, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static final <T> T z0(T r1, T r2, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r3 = r3.compare(r1, r2)
            if (r3 < 0) goto Lc
            return r1
        Lc:
            return r2
    }
}

package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "TuplesKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o0 {
    @org.jetbrains.annotations.NotNull
    public static final <A, B> kotlin.Pair<A, B> a(A r1, B r2) {
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> b(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends T, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r3.getFirst()
            java.lang.Object r3 = r3.getSecond()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            java.util.List r3 = kotlin.collections.f0.Q(r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> c(@org.jetbrains.annotations.NotNull kotlin.Triple<? extends T, ? extends T, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r0 = r4.getFirst()
            java.lang.Object r1 = r4.getSecond()
            java.lang.Object r4 = r4.getThird()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r4
            java.util.List r4 = kotlin.collections.f0.Q(r2)
            return r4
    }
}

package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b1 {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final int[] a(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.z0> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = new int[r3]
            r1 = 0
        L8:
            if (r1 >= r3) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            kotlin.z0 r2 = (kotlin.z0) r2
            int r2 = r2.q0()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            int[] r3 = kotlin.a1.f(r0)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final int[] b(int... r1) {
            java.lang.String r0 = "$v$c$kotlin-UIntArray$-elements$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }
}

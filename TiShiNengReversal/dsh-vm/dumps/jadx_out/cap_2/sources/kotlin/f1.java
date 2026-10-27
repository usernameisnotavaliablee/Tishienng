package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f1 {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final long[] a(int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.d1> r5) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r5, r0)
            long[] r0 = new long[r4]
            r1 = 0
        L8:
            if (r1 >= r4) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.invoke(r2)
            kotlin.d1 r2 = (kotlin.d1) r2
            long r2 = r2.q0()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            long[] r4 = kotlin.e1.f(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    private static final long[] b(long... r1) {
            java.lang.String r0 = "$v$c$kotlin-ULongArray$-elements$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }
}

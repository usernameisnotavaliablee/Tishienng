package h4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "TimingKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final long a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = java.lang.System.nanoTime()
            r4.invoke()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r0
            return r2
    }

    public static final long b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r4) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r4.invoke()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            return r2
    }
}

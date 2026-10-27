package j4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "InstantConversionsJDK8Kt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final java.time.Instant a(@org.jetbrains.annotations.NotNull kotlin.time.Instant r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = r4.getEpochSeconds()
            int r4 = r4.getNanosecondsOfSecond()
            long r2 = (long) r4
            java.time.Instant r4 = j4.e.a(r0, r2)
            java.lang.String r0 = "ofEpochSecond(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.Instant b(@org.jetbrains.annotations.NotNull java.time.Instant r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.time.Instant$a r0 = kotlin.time.Instant.Companion
            long r1 = j4.f.a(r3)
            int r3 = j4.g.a(r3)
            kotlin.time.Instant r3 = r0.b(r1, r3)
            return r3
    }
}

package j4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "DurationConversionsJDK8Kt")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n548#2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final java.time.Duration a(long r2) {
            long r0 = kotlin.time.h.C(r2)
            int r2 = kotlin.time.h.I(r2)
            long r2 = (long) r2
            java.time.Duration r2 = j4.c.a(r0, r2)
            java.lang.String r3 = "toComponents-impl(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long b(java.time.Duration r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            long r0 = j4.a.a(r4)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.j.x(r0, r2)
            int r4 = j4.b.a(r4)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.j.w(r4, r2)
            long r0 = kotlin.time.h.Y(r0, r2)
            return r0
    }
}

package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.time.e a = null;

    static {
            kotlin.internal.a r0 = kotlin.internal.b.a
            kotlin.time.e r0 = r0.e()
            kotlin.time.o.a = r0
            return
    }

    @kotlin.time.ExperimentalTime
    private static /* synthetic */ void a() {
            return
    }

    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.time.Instant r3) {
            java.lang.String r0 = "instant"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.time.x r0 = new kotlin.time.x
            long r1 = r3.getEpochSeconds()
            int r3 = r3.getNanosecondsOfSecond()
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.Instant c() {
            kotlin.time.e r0 = kotlin.time.o.a
            kotlin.time.Instant r0 = r0.a()
            return r0
    }
}

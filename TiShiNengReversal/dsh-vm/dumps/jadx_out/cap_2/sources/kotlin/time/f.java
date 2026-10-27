package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.time.e {
        private final kotlin.time.d0 b;
        final /* synthetic */ kotlin.time.Instant c;

        a(kotlin.time.e0 r1, kotlin.time.Instant r2) {
                r0 = this;
                r0.c = r2
                r0.<init>()
                kotlin.time.d0 r1 = r1.a()
                r0.b = r1
                return
        }

        @Override // kotlin.time.e
        public kotlin.time.Instant a() {
                r3 = this;
                kotlin.time.Instant r0 = r3.c
                kotlin.time.d0 r1 = r3.b
                long r1 = r1.a()
                kotlin.time.Instant r0 = r0.m37plusLRDsOJo(r1)
                return r0
        }
    }

    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.jvm.JvmName(name = "fromTimeSource")
    @org.jetbrains.annotations.NotNull
    @kotlin.time.ExperimentalTime
    public static final kotlin.time.e a(@org.jetbrains.annotations.NotNull kotlin.time.e0 r1, @org.jetbrains.annotations.NotNull kotlin.time.Instant r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.time.f$a r0 = new kotlin.time.f$a
            r0.<init>(r1, r2)
            return r0
    }
}

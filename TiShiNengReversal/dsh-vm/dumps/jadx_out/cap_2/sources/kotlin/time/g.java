package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface g extends kotlin.time.d0, java.lang.Comparable<kotlin.time.g> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static int a(@org.jetbrains.annotations.NotNull kotlin.time.g r2, @org.jetbrains.annotations.NotNull kotlin.time.g r3) {
                java.lang.String r0 = "other"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r2 = r2.g(r3)
                kotlin.time.h$a r0 = kotlin.time.h.b
                long r0 = r0.T()
                int r2 = kotlin.time.h.k(r2, r0)
                return r2
        }

        public static boolean b(@org.jetbrains.annotations.NotNull kotlin.time.g r0) {
                boolean r0 = kotlin.time.d0.a.a(r0)
                return r0
        }

        public static boolean c(@org.jetbrains.annotations.NotNull kotlin.time.g r0) {
                boolean r0 = kotlin.time.d0.a.b(r0)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.time.g d(@org.jetbrains.annotations.NotNull kotlin.time.g r0, long r1) {
                long r1 = kotlin.time.h.n0(r1)
                kotlin.time.g r0 = r0.e(r1)
                return r0
        }
    }

    int N(@org.jetbrains.annotations.NotNull kotlin.time.g r1);

    @Override // kotlin.time.d0
    @org.jetbrains.annotations.NotNull
    kotlin.time.g e(long r1);

    boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1);

    @Override // kotlin.time.d0
    @org.jetbrains.annotations.NotNull
    kotlin.time.g f(long r1);

    long g(@org.jetbrains.annotations.NotNull kotlin.time.g r1);

    int hashCode();
}

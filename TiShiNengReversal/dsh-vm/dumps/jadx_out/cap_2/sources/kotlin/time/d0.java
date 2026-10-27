package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface d0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static boolean a(@org.jetbrains.annotations.NotNull kotlin.time.d0 r2) {
                long r0 = r2.a()
                boolean r2 = kotlin.time.h.V(r0)
                return r2
        }

        public static boolean b(@org.jetbrains.annotations.NotNull kotlin.time.d0 r2) {
                long r0 = r2.a()
                boolean r2 = kotlin.time.h.V(r0)
                r2 = r2 ^ 1
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.time.d0 c(@org.jetbrains.annotations.NotNull kotlin.time.d0 r0, long r1) {
                long r1 = kotlin.time.h.n0(r1)
                kotlin.time.d0 r0 = r0.e(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.time.d0 d(@org.jetbrains.annotations.NotNull kotlin.time.d0 r2, long r3) {
                kotlin.time.d r0 = new kotlin.time.d
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
        }
    }

    long a();

    boolean b();

    boolean c();

    @org.jetbrains.annotations.NotNull
    kotlin.time.d0 e(long r1);

    @org.jetbrains.annotations.NotNull
    kotlin.time.d0 f(long r1);
}

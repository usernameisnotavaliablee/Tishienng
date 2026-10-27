package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r1 {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final long e = 1000000;
    private static final long f = 9223372036854L;
    private static final long g = 4611686018427387903L;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 h = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "REMOVED_TASK"
            r0.<init>(r1)
            kotlinx.coroutines.r1.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CLOSED_EMPTY"
            r0.<init>(r1)
            kotlinx.coroutines.r1.h = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 a() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.r1.h
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 b() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.r1.a
            return r0
    }

    public static final long c(long r2) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            return r2
    }

    public static final long d(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L16
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            return r3
    }
}

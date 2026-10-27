package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b0 implements kotlin.time.e0.c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.b0 b = null;
    private static final long c = 0;

    static {
            kotlin.time.b0 r0 = new kotlin.time.b0
            r0.<init>()
            kotlin.time.b0.b = r0
            long r0 = java.lang.System.nanoTime()
            kotlin.time.b0.c = r0
            return
    }

    private b0() {
            r0 = this;
            r0.<init>()
            return
    }

    private final long f() {
            r4 = this;
            long r0 = java.lang.System.nanoTime()
            long r2 = kotlin.time.b0.c
            long r0 = r0 - r2
            return r0
    }

    @Override // kotlin.time.e0
    public /* bridge */ /* synthetic */ kotlin.time.d0 a() {
            r2 = this;
            long r0 = r2.e()
            kotlin.time.e0$b$a r0 = kotlin.time.e0.b.a.d(r0)
            return r0
    }

    @Override // kotlin.time.e0.c, kotlin.time.e0
    public /* bridge */ /* synthetic */ kotlin.time.g a() {
            r2 = this;
            long r0 = r2.e()
            kotlin.time.e0$b$a r0 = kotlin.time.e0.b.a.d(r0)
            return r0
    }

    public final long b(long r2, long r4) {
            r1 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.y.d(r2, r0, r4)
            long r2 = kotlin.time.e0.b.a.j(r2)
            return r2
    }

    public final long c(long r2, long r4) {
            r1 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.y.h(r2, r4, r0)
            return r2
    }

    public final long d(long r4) {
            r3 = this;
            long r0 = r3.f()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r4 = kotlin.time.y.f(r0, r4, r2)
            return r4
    }

    public long e() {
            r2 = this;
            long r0 = r2.f()
            long r0 = kotlin.time.e0.b.a.j(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "TimeSource(System.nanoTime())"
            return r0
    }
}

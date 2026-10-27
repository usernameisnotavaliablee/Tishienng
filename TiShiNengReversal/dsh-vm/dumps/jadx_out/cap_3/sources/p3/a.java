package p3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a extends kotlin.random.a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Random a() {
            r2 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            java.lang.String r1 = "current(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public double nextDouble(double r2) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            double r2 = r0.nextDouble(r2)
            return r2
    }

    public int nextInt(int r2, int r3) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            int r2 = r0.nextInt(r2, r3)
            return r2
    }

    public long nextLong(long r2) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            long r2 = r0.nextLong(r2)
            return r2
    }

    public long nextLong(long r2, long r4) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            long r2 = r0.nextLong(r2, r4)
            return r2
    }
}

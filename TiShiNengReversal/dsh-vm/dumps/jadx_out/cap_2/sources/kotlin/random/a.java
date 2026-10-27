package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a extends kotlin.random.Random {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.Random a();

    @Override // kotlin.random.Random
    public int nextBits(int r2) {
            r1 = this;
            java.util.Random r0 = r1.a()
            int r0 = r0.nextInt()
            int r2 = kotlin.random.f.j(r0, r2)
            return r2
    }

    @Override // kotlin.random.Random
    public boolean nextBoolean() {
            r1 = this;
            java.util.Random r0 = r1.a()
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // kotlin.random.Random
    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Random r0 = r1.a()
            r0.nextBytes(r2)
            return r2
    }

    @Override // kotlin.random.Random
    public double nextDouble() {
            r2 = this;
            java.util.Random r0 = r2.a()
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // kotlin.random.Random
    public float nextFloat() {
            r1 = this;
            java.util.Random r0 = r1.a()
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // kotlin.random.Random
    public int nextInt() {
            r1 = this;
            java.util.Random r0 = r1.a()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // kotlin.random.Random
    public int nextInt(int r2) {
            r1 = this;
            java.util.Random r0 = r1.a()
            int r2 = r0.nextInt(r2)
            return r2
    }

    @Override // kotlin.random.Random
    public long nextLong() {
            r2 = this;
            java.util.Random r0 = r2.a()
            long r0 = r0.nextLong()
            return r0
    }
}

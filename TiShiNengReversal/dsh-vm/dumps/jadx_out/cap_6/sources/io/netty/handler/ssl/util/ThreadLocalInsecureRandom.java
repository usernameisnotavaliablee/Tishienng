package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ThreadLocalInsecureRandom extends java.security.SecureRandom {
    private static final java.security.SecureRandom INSTANCE = null;
    private static final long serialVersionUID = -8209473337192526191L;

    static {
            io.netty.handler.ssl.util.ThreadLocalInsecureRandom r0 = new io.netty.handler.ssl.util.ThreadLocalInsecureRandom
            r0.<init>()
            io.netty.handler.ssl.util.ThreadLocalInsecureRandom.INSTANCE = r0
            return
    }

    private ThreadLocalInsecureRandom() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.security.SecureRandom current() {
            java.security.SecureRandom r0 = io.netty.handler.ssl.util.ThreadLocalInsecureRandom.INSTANCE
            return r0
    }

    private static java.util.Random random() {
            java.util.Random r0 = io.netty.util.internal.PlatformDependent.threadLocalRandom()
            return r0
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int r2) {
            r1 = this;
            byte[] r2 = new byte[r2]
            java.util.Random r0 = random()
            r0.nextBytes(r2)
            return r2
    }

    @Override // java.security.SecureRandom
    public java.lang.String getAlgorithm() {
            r1 = this;
            java.lang.String r0 = "insecure"
            return r0
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
            r1 = this;
            java.util.Random r0 = random()
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] r2) {
            r1 = this;
            java.util.Random r0 = random()
            r0.nextBytes(r2)
            return
    }

    @Override // java.util.Random
    public double nextDouble() {
            r2 = this;
            java.util.Random r0 = random()
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // java.util.Random
    public float nextFloat() {
            r1 = this;
            java.util.Random r0 = random()
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // java.util.Random
    public double nextGaussian() {
            r2 = this;
            java.util.Random r0 = random()
            double r0 = r0.nextGaussian()
            return r0
    }

    @Override // java.util.Random
    public int nextInt() {
            r1 = this;
            java.util.Random r0 = random()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // java.util.Random
    public int nextInt(int r2) {
            r1 = this;
            java.util.Random r0 = random()
            int r2 = r0.nextInt(r2)
            return r2
    }

    @Override // java.util.Random
    public long nextLong() {
            r2 = this;
            java.util.Random r0 = random()
            long r0 = r0.nextLong()
            return r0
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long r1) {
            r0 = this;
            return
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] r1) {
            r0 = this;
            return
    }
}

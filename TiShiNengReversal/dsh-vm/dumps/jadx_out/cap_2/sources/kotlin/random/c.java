package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class c extends java.util.Random {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.c.a c = null;
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private final kotlin.random.Random a;
    private boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.random.c$a r0 = new kotlin.random.c$a
            r1 = 0
            r0.<init>(r1)
            kotlin.random.c.c = r0
            return
    }

    public c(@org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            r1 = this;
            java.lang.String r0 = "impl"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.random.Random a() {
            r1 = this;
            kotlin.random.Random r0 = r1.a
            return r0
    }

    @Override // java.util.Random
    protected int next(int r2) {
            r1 = this;
            kotlin.random.Random r0 = r1.a
            int r2 = r0.nextBits(r2)
            return r2
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
            r1 = this;
            kotlin.random.Random r0 = r1.a
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // java.util.Random
    public void nextBytes(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.random.Random r0 = r1.a
            r0.nextBytes(r2)
            return
    }

    @Override // java.util.Random
    public double nextDouble() {
            r2 = this;
            kotlin.random.Random r0 = r2.a
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // java.util.Random
    public float nextFloat() {
            r1 = this;
            kotlin.random.Random r0 = r1.a
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // java.util.Random
    public int nextInt() {
            r1 = this;
            kotlin.random.Random r0 = r1.a
            int r0 = r0.nextInt()
            return r0
    }

    @Override // java.util.Random
    public int nextInt(int r2) {
            r1 = this;
            kotlin.random.Random r0 = r1.a
            int r2 = r0.nextInt(r2)
            return r2
    }

    @Override // java.util.Random
    public long nextLong() {
            r2 = this;
            kotlin.random.Random r0 = r2.a
            long r0 = r0.nextLong()
            return r0
    }

    @Override // java.util.Random
    public void setSeed(long r1) {
            r0 = this;
            boolean r1 = r0.b
            if (r1 != 0) goto L8
            r1 = 1
            r0.b = r1
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Setting seed is not supported."
            r1.<init>(r2)
            throw r1
    }
}

package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Random {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.random.Random.Default Default = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.random.Random defaultRandom = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Default extends kotlin.random.Random implements java.io.Serializable {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class a implements java.io.Serializable {

            @org.jetbrains.annotations.NotNull
            public static final kotlin.random.Random.Default.a a = null;
            private static final long serialVersionUID = 0;

            static {
                    kotlin.random.Random$Default$a r0 = new kotlin.random.Random$Default$a
                    r0.<init>()
                    kotlin.random.Random.Default.a.a = r0
                    return
            }

            private a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private final java.lang.Object readResolve() {
                    r1 = this;
                    kotlin.random.Random$Default r0 = kotlin.random.Random.Default
                    return r0
            }
        }

        private Default() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Default(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final void readObject(java.io.ObjectInputStream r2) {
                r1 = this;
                java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
                java.lang.String r0 = "Deserialization is supported via proxy only"
                r2.<init>(r0)
                throw r2
        }

        private final java.lang.Object writeReplace() {
                r1 = this;
                kotlin.random.Random$Default$a r0 = kotlin.random.Random.Default.a.a
                return r0
        }

        @Override // kotlin.random.Random
        public int nextBits(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r2 = r0.nextBits(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                boolean r0 = r0.nextBoolean()
                return r0
        }

        @Override // kotlin.random.Random
        @org.jetbrains.annotations.NotNull
        public byte[] nextBytes(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r2 = r0.nextBytes(r2)
                return r2
        }

        @Override // kotlin.random.Random
        @org.jetbrains.annotations.NotNull
        public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r2 = r0.nextBytes(r2)
                return r2
        }

        @Override // kotlin.random.Random
        @org.jetbrains.annotations.NotNull
        public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r2 = r0.nextBytes(r2, r3, r4)
                return r2
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r0 = r0.nextDouble()
                return r0
        }

        @Override // kotlin.random.Random
        public double nextDouble(double r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r2 = r0.nextDouble(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public double nextDouble(double r2, double r4) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r2 = r0.nextDouble(r2, r4)
                return r2
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                float r0 = r0.nextFloat()
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r0 = r0.nextInt()
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r2 = r0.nextInt(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public int nextInt(int r2, int r3) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r2 = r0.nextInt(r2, r3)
                return r2
        }

        @Override // kotlin.random.Random
        public long nextLong() {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r0 = r0.nextLong()
                return r0
        }

        @Override // kotlin.random.Random
        public long nextLong(long r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r2 = r0.nextLong(r2)
                return r2
        }

        @Override // kotlin.random.Random
        public long nextLong(long r2, long r4) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r2 = r0.nextLong(r2, r4)
                return r2
        }
    }

    static {
            kotlin.random.Random$Default r0 = new kotlin.random.Random$Default
            r1 = 0
            r0.<init>(r1)
            kotlin.random.Random.Default = r0
            kotlin.internal.a r0 = kotlin.internal.b.a
            kotlin.random.Random r0 = r0.b()
            kotlin.random.Random.defaultRandom = r0
            return
    }

    public Random() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlin.random.Random access$getDefaultRandom$cp() {
            kotlin.random.Random r0 = kotlin.random.Random.defaultRandom
            return r0
    }

    public static /* synthetic */ byte[] nextBytes$default(kotlin.random.Random r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.nextBytes(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: nextBytes"
            r0.<init>(r1)
            throw r0
    }

    public abstract int nextBits(int r1);

    public boolean nextBoolean() {
            r2 = this;
            r0 = 1
            int r1 = r2.nextBits(r0)
            if (r1 == 0) goto L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            byte[] r1 = r0.nextBytes(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r3) {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r1 = r3.length
            byte[] r3 = r2.nextBytes(r3, r0, r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "fromIndex ("
            if (r8 < 0) goto L78
            int r1 = r7.length
            if (r8 > r1) goto L78
            if (r9 < 0) goto L78
            int r1 = r7.length
            if (r9 > r1) goto L78
            if (r8 > r9) goto L52
            int r0 = r9 - r8
            int r0 = r0 / 4
            r1 = 0
            r2 = 0
        L19:
            if (r2 >= r0) goto L3c
            int r3 = r6.nextInt()
            byte r4 = (byte) r3
            r7[r8] = r4
            int r4 = r8 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 2
            int r5 = r3 >>> 16
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r8 + 3
            int r3 = r3 >>> 24
            byte r3 = (byte) r3
            r7[r4] = r3
            int r8 = r8 + 4
            int r2 = r2 + 1
            goto L19
        L3c:
            int r9 = r9 - r8
            int r0 = r9 * 8
            int r0 = r6.nextBits(r0)
        L43:
            if (r1 >= r9) goto L51
            int r2 = r8 + r1
            int r3 = r1 * 8
            int r3 = r0 >>> r3
            byte r3 = (byte) r3
            r7[r2] = r3
            int r1 = r1 + 1
            goto L43
        L51:
            return r7
        L52:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = ") must be not greater than toIndex ("
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ")."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L78:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = ") or toIndex ("
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = ") are out of range: 0.."
            r1.append(r8)
            int r7 = r7.length
            r1.append(r7)
            r7 = 46
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public double nextDouble() {
            r2 = this;
            r0 = 26
            int r0 = r2.nextBits(r0)
            r1 = 27
            int r1 = r2.nextBits(r1)
            double r0 = kotlin.random.e.d(r0, r1)
            return r0
    }

    public double nextDouble(double r3) {
            r2 = this;
            r0 = 0
            double r3 = r2.nextDouble(r0, r3)
            return r3
    }

    public double nextDouble(double r8, double r10) {
            r7 = this;
            kotlin.random.f.d(r8, r10)
            double r0 = r10 - r8
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L30
            double r2 = java.lang.Math.abs(r8)
            r4 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L30
            double r2 = java.lang.Math.abs(r10)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L30
            double r0 = r7.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r10 / r2
            double r2 = r8 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r8 = r8 + r0
            double r8 = r8 + r0
            goto L37
        L30:
            double r2 = r7.nextDouble()
            double r2 = r2 * r0
            double r8 = r8 + r2
        L37:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L41
            r8 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r8 = java.lang.Math.nextAfter(r10, r8)
        L41:
            return r8
    }

    public float nextFloat() {
            r2 = this;
            r0 = 24
            int r0 = r2.nextBits(r0)
            float r0 = (float) r0
            r1 = 1266679808(0x4b800000, float:1.6777216E7)
            float r0 = r0 / r1
            return r0
    }

    public int nextInt() {
            r1 = this;
            r0 = 32
            int r0 = r1.nextBits(r0)
            return r0
    }

    public int nextInt(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.nextInt(r0, r2)
            return r2
    }

    public int nextInt(int r4, int r5) {
            r3 = this;
            kotlin.random.f.e(r4, r5)
            int r0 = r5 - r4
            if (r0 > 0) goto L15
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lc
            goto L15
        Lc:
            int r0 = r3.nextInt()
            if (r4 > r0) goto Lc
            if (r0 >= r5) goto Lc
            return r0
        L15:
            int r5 = -r0
            r5 = r5 & r0
            if (r5 != r0) goto L22
            int r5 = kotlin.random.f.g(r0)
            int r5 = r3.nextBits(r5)
            goto L31
        L22:
            int r5 = r3.nextInt()
            int r5 = r5 >>> 1
            int r1 = r5 % r0
            int r5 = r5 - r1
            int r2 = r0 + (-1)
            int r5 = r5 + r2
            if (r5 < 0) goto L22
            r5 = r1
        L31:
            int r4 = r4 + r5
            return r4
    }

    public long nextLong() {
            r4 = this;
            int r0 = r4.nextInt()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.nextInt()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public long nextLong(long r3) {
            r2 = this;
            r0 = 0
            long r3 = r2.nextLong(r0, r3)
            return r3
    }

    public long nextLong(long r10, long r12) {
            r9 = this;
            kotlin.random.f.f(r10, r12)
            long r0 = r12 - r10
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L57
            long r12 = -r0
            long r12 = r12 & r0
            r4 = 1
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L43
            int r12 = (int) r0
            r13 = 32
            long r0 = r0 >>> r13
            int r1 = (int) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r12 == 0) goto L29
            int r12 = kotlin.random.f.g(r12)
            int r12 = r9.nextBits(r12)
        L26:
            long r12 = (long) r12
            long r12 = r12 & r2
            goto L55
        L29:
            if (r1 != r4) goto L30
            int r12 = r9.nextInt()
            goto L26
        L30:
            int r12 = kotlin.random.f.g(r1)
            int r12 = r9.nextBits(r12)
            long r0 = (long) r12
            long r12 = r0 << r13
            int r0 = r9.nextInt()
            long r0 = (long) r0
            long r0 = r0 & r2
            long r12 = r12 + r0
            goto L55
        L43:
            long r12 = r9.nextLong()
            long r12 = r12 >>> r4
            long r5 = r12 % r0
            long r12 = r12 - r5
            r7 = 1
            long r7 = r0 - r7
            long r12 = r12 + r7
            int r7 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r7 < 0) goto L43
            r12 = r5
        L55:
            long r10 = r10 + r12
            return r10
        L57:
            long r0 = r9.nextLong()
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L57
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L57
            return r0
    }
}

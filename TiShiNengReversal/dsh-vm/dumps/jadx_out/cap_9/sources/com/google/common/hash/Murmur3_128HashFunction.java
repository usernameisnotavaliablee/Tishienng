package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Murmur3_128HashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    static final com.google.common.hash.HashFunction GOOD_FAST_HASH_128 = null;
    static final com.google.common.hash.HashFunction MURMUR3_128 = null;
    private static final long serialVersionUID = 0;
    private final int seed;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Murmur3_128Hasher extends com.google.common.hash.AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;
        private long h1;
        private long h2;
        private int length;

        Murmur3_128Hasher(int r3) {
                r2 = this;
                r0 = 16
                r2.<init>(r0)
                long r0 = (long) r3
                r2.h1 = r0
                r2.h2 = r0
                r3 = 0
                r2.length = r3
                return
        }

        private void bmix64(long r7, long r9) {
                r6 = this;
                long r0 = r6.h1
                long r7 = mixK1(r7)
                long r7 = r7 ^ r0
                r6.h1 = r7
                r0 = 27
                long r7 = java.lang.Long.rotateLeft(r7, r0)
                long r0 = r6.h2
                long r7 = r7 + r0
                r2 = 5
                long r7 = r7 * r2
                r4 = 1390208809(0x52dce729, double:6.86854413E-315)
                long r7 = r7 + r4
                r6.h1 = r7
                long r7 = mixK2(r9)
                long r7 = r7 ^ r0
                r6.h2 = r7
                r9 = 31
                long r7 = java.lang.Long.rotateLeft(r7, r9)
                long r9 = r6.h1
                long r7 = r7 + r9
                long r7 = r7 * r2
                r9 = 944331445(0x38495ab5, double:4.665617253E-315)
                long r7 = r7 + r9
                r6.h2 = r7
                return
        }

        private static long fmix64(long r3) {
                r0 = 33
                long r1 = r3 >>> r0
                long r3 = r3 ^ r1
                r1 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
                long r3 = r3 * r1
                long r1 = r3 >>> r0
                long r3 = r3 ^ r1
                r1 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
                long r3 = r3 * r1
                long r0 = r3 >>> r0
                long r3 = r3 ^ r0
                return r3
        }

        private static long mixK1(long r2) {
                r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
                long r2 = r2 * r0
                r0 = 31
                long r2 = java.lang.Long.rotateLeft(r2, r0)
                r0 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
                long r2 = r2 * r0
                return r2
        }

        private static long mixK2(long r2) {
                r0 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
                long r2 = r2 * r0
                r0 = 33
                long r2 = java.lang.Long.rotateLeft(r2, r0)
                r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
                long r2 = r2 * r0
                return r2
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public com.google.common.hash.HashCode makeHash() {
                r7 = this;
                long r0 = r7.h1
                int r2 = r7.length
                long r3 = (long) r2
                long r0 = r0 ^ r3
                long r3 = r7.h2
                long r5 = (long) r2
                long r3 = r3 ^ r5
                long r0 = r0 + r3
                r7.h1 = r0
                long r3 = r3 + r0
                r7.h2 = r3
                long r0 = fmix64(r0)
                r7.h1 = r0
                long r0 = r7.h2
                long r0 = fmix64(r0)
                long r2 = r7.h1
                long r2 = r2 + r0
                r7.h1 = r2
                long r0 = r0 + r2
                r7.h2 = r0
                r0 = 16
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r0 = r0.order(r1)
                long r1 = r7.h1
                java.nio.ByteBuffer r0 = r0.putLong(r1)
                long r1 = r7.h2
                java.nio.ByteBuffer r0 = r0.putLong(r1)
                byte[] r0 = r0.array()
                com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromBytesNoCopy(r0)
                return r0
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(java.nio.ByteBuffer r5) {
                r4 = this;
                long r0 = r5.getLong()
                long r2 = r5.getLong()
                r4.bmix64(r0, r2)
                int r5 = r4.length
                int r5 = r5 + 16
                r4.length = r5
                return
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(java.nio.ByteBuffer r14) {
                r13 = this;
                int r0 = r13.length
                int r1 = r14.remaining()
                int r0 = r0 + r1
                r13.length = r0
                int r0 = r14.remaining()
                r1 = 16
                r2 = 24
                r3 = 32
                r4 = 40
                r5 = 48
                r6 = 8
                r7 = 0
                switch(r0) {
                    case 1: goto Ldb;
                    case 2: goto Lcd;
                    case 3: goto Lbe;
                    case 4: goto Laf;
                    case 5: goto La1;
                    case 6: goto L92;
                    case 7: goto L86;
                    case 8: goto L81;
                    case 9: goto L77;
                    case 10: goto L6a;
                    case 11: goto L5c;
                    case 12: goto L4e;
                    case 13: goto L40;
                    case 14: goto L32;
                    case 15: goto L26;
                    default: goto L1e;
                }
            L1e:
                java.lang.AssertionError r14 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r14.<init>(r0)
                throw r14
            L26:
                r0 = 14
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r7 = (long) r0
                long r7 = r7 << r5
            L32:
                r0 = 13
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r9 = (long) r0
                long r4 = r9 << r4
                long r7 = r7 ^ r4
            L40:
                r0 = 12
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r4 = (long) r0
                long r3 = r4 << r3
                long r7 = r7 ^ r3
            L4e:
                r0 = 11
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r3 = (long) r0
                long r2 = r3 << r2
                long r7 = r7 ^ r2
            L5c:
                r0 = 10
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r2 = (long) r0
                long r0 = r2 << r1
                long r7 = r7 ^ r0
            L6a:
                r0 = 9
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r0 = (long) r0
                long r0 = r0 << r6
                long r7 = r7 ^ r0
            L77:
                byte r0 = r14.get(r6)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r0 = (long) r0
                long r7 = r7 ^ r0
            L81:
                long r0 = r14.getLong()
                goto Le7
            L86:
                r0 = 6
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r9 = (long) r0
                long r9 = r9 << r5
                goto L93
            L92:
                r9 = r7
            L93:
                r0 = 5
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r11 = (long) r0
                long r4 = r11 << r4
                long r4 = r4 ^ r9
                goto La2
            La1:
                r4 = r7
            La2:
                r0 = 4
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r9 = (long) r0
                long r9 = r9 << r3
                long r4 = r4 ^ r9
                goto Lb0
            Laf:
                r4 = r7
            Lb0:
                r0 = 3
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r9 = (long) r0
                long r2 = r9 << r2
                long r2 = r2 ^ r4
                goto Lbf
            Lbe:
                r2 = r7
            Lbf:
                r0 = 2
                byte r0 = r14.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.toInt(r0)
                long r4 = (long) r0
                long r0 = r4 << r1
                long r0 = r0 ^ r2
                goto Lce
            Lcd:
                r0 = r7
            Lce:
                r2 = 1
                byte r2 = r14.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.toInt(r2)
                long r2 = (long) r2
                long r2 = r2 << r6
                long r0 = r0 ^ r2
                goto Ldc
            Ldb:
                r0 = r7
            Ldc:
                r2 = 0
                byte r14 = r14.get(r2)
                int r14 = com.google.common.primitives.UnsignedBytes.toInt(r14)
                long r2 = (long) r14
                long r0 = r0 ^ r2
            Le7:
                long r2 = r13.h1
                long r0 = mixK1(r0)
                long r0 = r0 ^ r2
                r13.h1 = r0
                long r0 = r13.h2
                long r2 = mixK2(r7)
                long r0 = r0 ^ r2
                r13.h2 = r0
                return
        }
    }

    static {
            com.google.common.hash.Murmur3_128HashFunction r0 = new com.google.common.hash.Murmur3_128HashFunction
            r1 = 0
            r0.<init>(r1)
            com.google.common.hash.Murmur3_128HashFunction.MURMUR3_128 = r0
            com.google.common.hash.Murmur3_128HashFunction r0 = new com.google.common.hash.Murmur3_128HashFunction
            int r1 = com.google.common.hash.Hashing.GOOD_FAST_HASH_SEED
            r0.<init>(r1)
            com.google.common.hash.Murmur3_128HashFunction.GOOD_FAST_HASH_128 = r0
            return
    }

    Murmur3_128HashFunction(int r1) {
            r0 = this;
            r0.<init>()
            r0.seed = r1
            return
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            return r0
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.common.hash.Murmur3_128HashFunction
            r1 = 0
            if (r0 == 0) goto Lf
            com.google.common.hash.Murmur3_128HashFunction r3 = (com.google.common.hash.Murmur3_128HashFunction) r3
            int r0 = r2.seed
            int r3 = r3.seed
            if (r0 != r3) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<com.google.common.hash.Murmur3_128HashFunction> r0 = com.google.common.hash.Murmur3_128HashFunction.class
            int r0 = r0.hashCode()
            int r1 = r2.seed
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r2 = this;
            com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher r0 = new com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher
            int r1 = r2.seed
            r0.<init>(r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Hashing.murmur3_128("
            r0.append(r1)
            int r1 = r2.seed
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

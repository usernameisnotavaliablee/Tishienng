package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ChecksumHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> checksumSupplier;
    private final java.lang.String toString;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.hash.ChecksumHashFunction$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ChecksumHasher extends com.google.common.hash.AbstractByteHasher {
        private final java.util.zip.Checksum checksum;
        final /* synthetic */ com.google.common.hash.ChecksumHashFunction this$0;

        private ChecksumHasher(com.google.common.hash.ChecksumHashFunction r1, java.util.zip.Checksum r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.zip.Checksum r1 = (java.util.zip.Checksum) r1
                r0.checksum = r1
                return
        }

        /* synthetic */ ChecksumHasher(com.google.common.hash.ChecksumHashFunction r1, java.util.zip.Checksum r2, com.google.common.hash.ChecksumHashFunction.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
                r4 = this;
                java.util.zip.Checksum r0 = r4.checksum
                long r0 = r0.getValue()
                com.google.common.hash.ChecksumHashFunction r2 = r4.this$0
                int r2 = com.google.common.hash.ChecksumHashFunction.access$100(r2)
                r3 = 32
                if (r2 != r3) goto L16
                int r1 = (int) r0
                com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromInt(r1)
                return r0
            L16:
                com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromLong(r0)
                return r0
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte r2) {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void update(byte[] r2, int r3, int r4) {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.update(r2, r3, r4)
                return
        }
    }

    ChecksumHashFunction(com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.hash.ImmutableSupplier r2 = (com.google.common.hash.ImmutableSupplier) r2
            r1.checksumSupplier = r2
            r2 = 32
            if (r3 == r2) goto L16
            r2 = 64
            if (r3 != r2) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            java.lang.String r0 = "bits (%s) must be either 32 or 64"
            com.google.common.base.Preconditions.checkArgument(r2, r0, r3)
            r1.bits = r3
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.String r2 = (java.lang.String) r2
            r1.toString = r2
            return
    }

    static /* synthetic */ int access$100(com.google.common.hash.ChecksumHashFunction r0) {
            int r0 = r0.bits
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            int r0 = r1.bits
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r3 = this;
            com.google.common.hash.ChecksumHashFunction$ChecksumHasher r0 = new com.google.common.hash.ChecksumHashFunction$ChecksumHasher
            com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> r1 = r3.checksumSupplier
            java.lang.Object r1 = r1.get()
            java.util.zip.Checksum r1 = (java.util.zip.Checksum) r1
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            return r0
    }
}

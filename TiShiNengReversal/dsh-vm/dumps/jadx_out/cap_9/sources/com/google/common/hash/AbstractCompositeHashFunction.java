package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractCompositeHashFunction extends com.google.common.hash.AbstractHashFunction {
    private static final long serialVersionUID = 0;
    final com.google.common.hash.HashFunction[] functions;


    AbstractCompositeHashFunction(com.google.common.hash.HashFunction... r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            r2 = r4[r1]
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r1 = r1 + 1
            goto L5
        Lf:
            r3.functions = r4
            return
    }

    private com.google.common.hash.Hasher fromHashers(com.google.common.hash.Hasher[] r2) {
            r1 = this;
            com.google.common.hash.AbstractCompositeHashFunction$1 r0 = new com.google.common.hash.AbstractCompositeHashFunction$1
            r0.<init>(r1, r2)
            return r0
    }

    abstract com.google.common.hash.HashCode makeHash(com.google.common.hash.Hasher[] r1);

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r4 = this;
            com.google.common.hash.HashFunction[] r0 = r4.functions
            int r0 = r0.length
            com.google.common.hash.Hasher[] r1 = new com.google.common.hash.Hasher[r0]
            r2 = 0
        L6:
            if (r2 >= r0) goto L15
            com.google.common.hash.HashFunction[] r3 = r4.functions
            r3 = r3[r2]
            com.google.common.hash.Hasher r3 = r3.newHasher()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L6
        L15:
            com.google.common.hash.Hasher r0 = r4.fromHashers(r1)
            return r0
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int r5) {
            r4 = this;
            r0 = 0
            if (r5 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            com.google.common.base.Preconditions.checkArgument(r1)
            com.google.common.hash.HashFunction[] r1 = r4.functions
            int r1 = r1.length
            com.google.common.hash.Hasher[] r2 = new com.google.common.hash.Hasher[r1]
        Le:
            if (r0 >= r1) goto L1d
            com.google.common.hash.HashFunction[] r3 = r4.functions
            r3 = r3[r0]
            com.google.common.hash.Hasher r3 = r3.newHasher(r5)
            r2[r0] = r3
            int r0 = r0 + 1
            goto Le
        L1d:
            com.google.common.hash.Hasher r5 = r4.fromHashers(r2)
            return r5
    }
}

package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class d implements com.bumptech.glide.load.c {
    private final com.bumptech.glide.load.c c;
    private final com.bumptech.glide.load.c d;

    d(com.bumptech.glide.load.c r1, com.bumptech.glide.load.c r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.c r0 = r1.c
            r0.b(r2)
            com.bumptech.glide.load.c r0 = r1.d
            r0.b(r2)
            return
    }

    com.bumptech.glide.load.c c() {
            r1 = this;
            com.bumptech.glide.load.c r0 = r1.c
            return r0
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.d
            r1 = 0
            if (r0 == 0) goto L1d
            com.bumptech.glide.load.engine.d r4 = (com.bumptech.glide.load.engine.d) r4
            com.bumptech.glide.load.c r0 = r3.c
            com.bumptech.glide.load.c r2 = r4.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            com.bumptech.glide.load.c r0 = r3.d
            com.bumptech.glide.load.c r4 = r4.d
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            com.bumptech.glide.load.c r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.bumptech.glide.load.c r1 = r2.d
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DataCacheKey{sourceKey="
            r0.append(r1)
            com.bumptech.glide.load.c r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            com.bumptech.glide.load.c r1 = r2.d
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

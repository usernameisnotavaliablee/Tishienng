package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class n implements com.bumptech.glide.load.c {
    private final java.lang.Object c;
    private final int d;
    private final int e;
    private final java.lang.Class<?> f;
    private final java.lang.Class<?> g;
    private final com.bumptech.glide.load.c h;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> i;
    private final com.bumptech.glide.load.f j;
    private int k;

    n(java.lang.Object r1, com.bumptech.glide.load.c r2, int r3, int r4, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r5, java.lang.Class<?> r6, java.lang.Class<?> r7, com.bumptech.glide.load.f r8) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            r0.c = r1
            java.lang.String r1 = "Signature must not be null"
            java.lang.Object r1 = com.bumptech.glide.util.k.e(r2, r1)
            com.bumptech.glide.load.c r1 = (com.bumptech.glide.load.c) r1
            r0.h = r1
            r0.d = r3
            r0.e = r4
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r5)
            java.util.Map r1 = (java.util.Map) r1
            r0.i = r1
            java.lang.String r1 = "Resource class must not be null"
            java.lang.Object r1 = com.bumptech.glide.util.k.e(r6, r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.f = r1
            java.lang.String r1 = "Transcode class must not be null"
            java.lang.Object r1 = com.bumptech.glide.util.k.e(r7, r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.g = r1
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r8)
            com.bumptech.glide.load.f r1 = (com.bumptech.glide.load.f) r1
            r0.j = r1
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.n
            r1 = 0
            if (r0 == 0) goto L51
            com.bumptech.glide.load.engine.n r4 = (com.bumptech.glide.load.engine.n) r4
            java.lang.Object r0 = r3.c
            java.lang.Object r2 = r4.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            com.bumptech.glide.load.c r0 = r3.h
            com.bumptech.glide.load.c r2 = r4.h
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            int r0 = r3.e
            int r2 = r4.e
            if (r0 != r2) goto L51
            int r0 = r3.d
            int r2 = r4.d
            if (r0 != r2) goto L51
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r3.i
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r2 = r4.i
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            java.lang.Class<?> r0 = r3.f
            java.lang.Class<?> r2 = r4.f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            java.lang.Class<?> r0 = r3.g
            java.lang.Class<?> r2 = r4.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            com.bumptech.glide.load.f r0 = r3.j
            com.bumptech.glide.load.f r4 = r4.j
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L51
            r4 = 1
            return r4
        L51:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            int r0 = r2.k
            if (r0 != 0) goto L4d
            java.lang.Object r0 = r2.c
            int r0 = r0.hashCode()
            r2.k = r0
            int r0 = r0 * 31
            com.bumptech.glide.load.c r1 = r2.h
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.d
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.e
            int r0 = r0 + r1
            r2.k = r0
            int r0 = r0 * 31
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r1 = r2.i
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.k = r0
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.f
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.k = r0
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.g
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.k = r0
            int r0 = r0 * 31
            com.bumptech.glide.load.f r1 = r2.j
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.k = r0
        L4d:
            int r0 = r2.k
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EngineKey{model="
            r0.append(r1)
            java.lang.Object r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", resourceClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", transcodeClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            com.bumptech.glide.load.c r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = ", transformations="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            com.bumptech.glide.load.f r1 = r2.j
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

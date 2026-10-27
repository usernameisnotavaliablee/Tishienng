package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class w implements com.bumptech.glide.load.c {
    private static final com.bumptech.glide.util.h<java.lang.Class<?>, byte[]> k = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private final com.bumptech.glide.load.c d;
    private final com.bumptech.glide.load.c e;
    private final int f;
    private final int g;
    private final java.lang.Class<?> h;
    private final com.bumptech.glide.load.f i;
    private final com.bumptech.glide.load.i<?> j;

    static {
            com.bumptech.glide.util.h r0 = new com.bumptech.glide.util.h
            r1 = 50
            r0.<init>(r1)
            com.bumptech.glide.load.engine.w.k = r0
            return
    }

    w(com.bumptech.glide.load.engine.bitmap_recycle.b r1, com.bumptech.glide.load.c r2, com.bumptech.glide.load.c r3, int r4, int r5, com.bumptech.glide.load.i<?> r6, java.lang.Class<?> r7, com.bumptech.glide.load.f r8) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.g = r5
            r0.j = r6
            r0.h = r7
            r0.i = r8
            return
    }

    private byte[] c() {
            r3 = this;
            com.bumptech.glide.util.h<java.lang.Class<?>, byte[]> r0 = com.bumptech.glide.load.engine.w.k
            java.lang.Class<?> r1 = r3.h
            java.lang.Object r1 = r0.i(r1)
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L1d
            java.lang.Class<?> r1 = r3.h
            java.lang.String r1 = r1.getName()
            java.nio.charset.Charset r2 = com.bumptech.glide.load.c.b
            byte[] r1 = r1.getBytes(r2)
            java.lang.Class<?> r2 = r3.h
            r0.m(r2, r1)
        L1d:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r4) {
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r3.c
            r1 = 8
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.d(r1, r2)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            int r2 = r3.f
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            int r2 = r3.g
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            r1.array()
            com.bumptech.glide.load.c r1 = r3.e
            r1.b(r4)
            com.bumptech.glide.load.c r1 = r3.d
            r1.b(r4)
            r4.update(r0)
            com.bumptech.glide.load.i<?> r1 = r3.j
            if (r1 == 0) goto L33
            r1.b(r4)
        L33:
            com.bumptech.glide.load.f r1 = r3.i
            r1.b(r4)
            byte[] r1 = r3.c()
            r4.update(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.b r4 = r3.c
            r4.put(r0)
            return
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.w
            r1 = 0
            if (r0 == 0) goto L47
            com.bumptech.glide.load.engine.w r4 = (com.bumptech.glide.load.engine.w) r4
            int r0 = r3.g
            int r2 = r4.g
            if (r0 != r2) goto L47
            int r0 = r3.f
            int r2 = r4.f
            if (r0 != r2) goto L47
            com.bumptech.glide.load.i<?> r0 = r3.j
            com.bumptech.glide.load.i<?> r2 = r4.j
            boolean r0 = com.bumptech.glide.util.l.d(r0, r2)
            if (r0 == 0) goto L47
            java.lang.Class<?> r0 = r3.h
            java.lang.Class<?> r2 = r4.h
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L47
            com.bumptech.glide.load.c r0 = r3.d
            com.bumptech.glide.load.c r2 = r4.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L47
            com.bumptech.glide.load.c r0 = r3.e
            com.bumptech.glide.load.c r2 = r4.e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L47
            com.bumptech.glide.load.f r0 = r3.i
            com.bumptech.glide.load.f r4 = r4.i
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L47
            r4 = 1
            return r4
        L47:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            com.bumptech.glide.load.c r0 = r2.d
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.bumptech.glide.load.c r1 = r2.e
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.g
            int r0 = r0 + r1
            com.bumptech.glide.load.i<?> r1 = r2.j
            if (r1 == 0) goto L24
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L24:
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.h
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.bumptech.glide.load.f r1 = r2.i
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ResourceCacheKey{sourceKey="
            r0.append(r1)
            com.bumptech.glide.load.c r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            com.bumptech.glide.load.c r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", decodedResourceClass="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", transformation='"
            r0.append(r1)
            com.bumptech.glide.load.i<?> r1 = r2.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", options="
            r0.append(r1)
            com.bumptech.glide.load.f r1 = r2.i
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

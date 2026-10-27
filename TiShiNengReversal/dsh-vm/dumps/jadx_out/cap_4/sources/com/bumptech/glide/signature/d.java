package com.bumptech.glide.signature;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.load.c {

    @androidx.annotation.NonNull
    private final java.lang.String c;
    private final long d;
    private final int e;

    public d(@androidx.annotation.Nullable java.lang.String r1, long r2, int r4) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            r0.c = r1
            r0.d = r2
            r0.e = r4
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r4) {
            r3 = this;
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r1 = r3.d
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            int r1 = r3.e
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r4.update(r0)
            java.lang.String r0 = r3.c
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            r4.update(r0)
            return
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L30
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L12
            goto L30
        L12:
            com.bumptech.glide.signature.d r8 = (com.bumptech.glide.signature.d) r8
            long r2 = r7.d
            long r4 = r8.d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1d
            return r1
        L1d:
            int r2 = r7.e
            int r3 = r8.e
            if (r2 == r3) goto L24
            return r1
        L24:
            java.lang.String r2 = r7.c
            java.lang.String r8 = r8.c
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L2f
            return r1
        L2f:
            return r0
        L30:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r5.d
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.e
            int r0 = r0 + r1
            return r0
    }
}

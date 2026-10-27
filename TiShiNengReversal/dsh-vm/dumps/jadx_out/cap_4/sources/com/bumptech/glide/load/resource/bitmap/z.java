package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class z extends com.bumptech.glide.load.resource.bitmap.h {
    private static final java.lang.String g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";
    private static final byte[] h = null;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners"
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            com.bumptech.glide.load.resource.bitmap.z.h = r0
            return
    }

    public z(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.z.h
            r3.update(r0)
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            float r1 = r2.c
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            float r1 = r2.d
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            float r1 = r2.e
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            float r1 = r2.f
            java.nio.ByteBuffer r0 = r0.putFloat(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected android.graphics.Bitmap c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r7, @androidx.annotation.NonNull android.graphics.Bitmap r8, int r9, int r10) {
            r6 = this;
            float r2 = r6.c
            float r3 = r6.d
            float r4 = r6.e
            float r5 = r6.f
            r0 = r7
            r1 = r8
            android.graphics.Bitmap r7 = com.bumptech.glide.load.resource.bitmap.k0.p(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.resource.bitmap.z
            r1 = 0
            if (r0 == 0) goto L29
            com.bumptech.glide.load.resource.bitmap.z r4 = (com.bumptech.glide.load.resource.bitmap.z) r4
            float r0 = r3.c
            float r2 = r4.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L29
            float r0 = r3.d
            float r2 = r4.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L29
            float r0 = r3.e
            float r2 = r4.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L29
            float r0 = r3.f
            float r4 = r4.f
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L29
            r4 = 1
            return r4
        L29:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            float r0 = r2.c
            int r0 = com.bumptech.glide.util.l.m(r0)
            r1 = -2013597734(0xffffffff87faefda, float:-3.7756791E-34)
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            float r1 = r2.d
            int r0 = com.bumptech.glide.util.l.n(r1, r0)
            float r1 = r2.e
            int r0 = com.bumptech.glide.util.l.n(r1, r0)
            float r1 = r2.f
            int r0 = com.bumptech.glide.util.l.n(r1, r0)
            return r0
    }
}

package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h0 extends com.bumptech.glide.load.resource.bitmap.h {
    private static final java.lang.String d = "com.bumptech.glide.load.resource.bitmap.Rotate";
    private static final byte[] e = null;
    private final int c;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.Rotate"
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            com.bumptech.glide.load.resource.bitmap.h0.e = r0
            return
    }

    public h0(int r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.h0.e
            r3.update(r0)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.c
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected android.graphics.Bitmap c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            int r1 = r0.c
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.k0.n(r2, r1)
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.resource.bitmap.h0
            r1 = 0
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.bitmap.h0 r3 = (com.bumptech.glide.load.resource.bitmap.h0) r3
            int r0 = r2.c
            int r3 = r3.c
            if (r0 != r3) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            int r0 = r2.c
            int r0 = com.bumptech.glide.util.l.o(r0)
            r1 = -950519196(0xffffffffc7583a64, float:-55354.39)
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            return r0
    }
}

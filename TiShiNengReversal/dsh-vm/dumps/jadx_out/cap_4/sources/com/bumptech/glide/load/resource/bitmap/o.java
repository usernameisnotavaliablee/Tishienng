package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class o extends com.bumptech.glide.load.resource.bitmap.h {
    private static final int c = 1;
    private static final java.lang.String d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] e = null;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1"
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            com.bumptech.glide.load.resource.bitmap.o.e = r0
            return
    }

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.o.e
            r2.update(r0)
            return
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected android.graphics.Bitmap c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.k0.d(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.bumptech.glide.load.resource.bitmap.o
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r1 = this;
            r0 = 1101716364(0x41aadb8c, float:21.3572)
            return r0
    }
}

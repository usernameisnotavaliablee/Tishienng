package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e implements com.bumptech.glide.load.i<com.bumptech.glide.load.resource.gif.GifDrawable> {
    private final com.bumptech.glide.load.i<android.graphics.Bitmap> c;

    public e(com.bumptech.glide.load.i<android.graphics.Bitmap> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            com.bumptech.glide.load.i r1 = (com.bumptech.glide.load.i) r1
            r0.c = r1
            return
    }

    @Override // com.bumptech.glide.load.i
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> a(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> r6, int r7, int r8) {
            r4 = this;
            java.lang.Object r0 = r6.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            com.bumptech.glide.b r1 = com.bumptech.glide.b.e(r5)
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r1.h()
            android.graphics.Bitmap r2 = r0.e()
            com.bumptech.glide.load.resource.bitmap.g r3 = new com.bumptech.glide.load.resource.bitmap.g
            r3.<init>(r2, r1)
            com.bumptech.glide.load.i<android.graphics.Bitmap> r1 = r4.c
            com.bumptech.glide.load.engine.u r5 = r1.a(r5, r3, r7, r8)
            boolean r7 = r3.equals(r5)
            if (r7 != 0) goto L26
            r3.recycle()
        L26:
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            com.bumptech.glide.load.i<android.graphics.Bitmap> r7 = r4.c
            r0.o(r7, r5)
            return r6
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.c
            r0.b(r2)
            return
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.gif.e
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.gif.e r2 = (com.bumptech.glide.load.resource.gif.e) r2
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.c
            com.bumptech.glide.load.i<android.graphics.Bitmap> r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }
}

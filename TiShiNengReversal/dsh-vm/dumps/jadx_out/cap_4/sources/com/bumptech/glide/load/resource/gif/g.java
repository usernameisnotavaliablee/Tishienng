package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g implements com.bumptech.glide.load.g<com.bumptech.glide.gifdecoder.GifDecoder, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;

    public g(com.bumptech.glide.load.engine.bitmap_recycle.e r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r1 = (com.bumptech.glide.gifdecoder.GifDecoder) r1
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r1 = (com.bumptech.glide.gifdecoder.GifDecoder) r1
            com.bumptech.glide.load.engine.u r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> c(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            android.graphics.Bitmap r1 = r1.h()
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = r0.a
            com.bumptech.glide.load.resource.bitmap.g r1 = com.bumptech.glide.load.resource.bitmap.g.c(r1, r2)
            return r1
    }

    public boolean d(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}

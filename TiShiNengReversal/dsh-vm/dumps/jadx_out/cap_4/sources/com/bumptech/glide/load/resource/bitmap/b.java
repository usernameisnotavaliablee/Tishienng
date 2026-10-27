package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements com.bumptech.glide.load.h<android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;
    private final com.bumptech.glide.load.h<android.graphics.Bitmap> b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e r1, com.bumptech.glide.load.h<android.graphics.Bitmap> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.load.a
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) {
            r0 = this;
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            boolean r1 = r0.c(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.h
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.EncodeStrategy b(@androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r1 = this;
            com.bumptech.glide.load.h<android.graphics.Bitmap> r0 = r1.b
            com.bumptech.glide.load.EncodeStrategy r2 = r0.b(r2)
            return r2
    }

    public boolean c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> r4, @androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull com.bumptech.glide.load.f r6) {
            r3 = this;
            com.bumptech.glide.load.h<android.graphics.Bitmap> r0 = r3.b
            com.bumptech.glide.load.resource.bitmap.g r1 = new com.bumptech.glide.load.resource.bitmap.g
            java.lang.Object r4 = r4.get()
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r4 = r4.getBitmap()
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = r3.a
            r1.<init>(r4, r2)
            boolean r4 = r0.a(r1, r5, r6)
            return r4
    }
}

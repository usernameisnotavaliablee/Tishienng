package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c extends com.bumptech.glide.load.resource.drawable.b<android.graphics.drawable.BitmapDrawable> implements com.bumptech.glide.load.engine.q {
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;

    public c(android.graphics.drawable.BitmapDrawable r1, com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.drawable.BitmapDrawable> a() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r0 = android.graphics.drawable.BitmapDrawable.class
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            int r0 = com.bumptech.glide.util.l.h(r0)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.q
    public void initialize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r0.prepareToDraw()
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r2.b
            T extends android.graphics.drawable.Drawable r1 = r2.a
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            r0.d(r1)
            return
    }
}

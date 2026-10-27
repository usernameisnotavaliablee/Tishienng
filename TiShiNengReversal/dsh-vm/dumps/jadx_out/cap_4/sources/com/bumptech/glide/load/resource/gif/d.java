package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d extends com.bumptech.glide.load.resource.drawable.b<com.bumptech.glide.load.resource.gif.GifDrawable> implements com.bumptech.glide.load.engine.q {
    public d(com.bumptech.glide.load.resource.gif.GifDrawable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> a() {
            r1 = this;
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            int r0 = r0.j()
            return r0
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.q
    public void initialize() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            android.graphics.Bitmap r0 = r0.e()
            r0.prepareToDraw()
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            r0.stop()
            T extends android.graphics.drawable.Drawable r0 = r1.a
            com.bumptech.glide.load.resource.gif.GifDrawable r0 = (com.bumptech.glide.load.resource.gif.GifDrawable) r0
            r0.m()
            return
    }
}

package com.bumptech.glide.load.resource.transcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c implements com.bumptech.glide.load.resource.transcode.e<android.graphics.drawable.Drawable, byte[]> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;
    private final com.bumptech.glide.load.resource.transcode.e<android.graphics.Bitmap, byte[]> b;
    private final com.bumptech.glide.load.resource.transcode.e<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> c;

    public c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r1, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.e<android.graphics.Bitmap, byte[]> r2, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.e<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> b(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> r0) {
            return r0
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.u<byte[]> a(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r2 = this;
            java.lang.Object r0 = r3.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L1d
            com.bumptech.glide.load.resource.transcode.e<android.graphics.Bitmap, byte[]> r3 = r2.b
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r2.a
            com.bumptech.glide.load.resource.bitmap.g r0 = com.bumptech.glide.load.resource.bitmap.g.c(r0, r1)
            com.bumptech.glide.load.engine.u r3 = r3.a(r0, r4)
            return r3
        L1d:
            boolean r0 = r0 instanceof com.bumptech.glide.load.resource.gif.GifDrawable
            if (r0 == 0) goto L2c
            com.bumptech.glide.load.resource.transcode.e<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> r0 = r2.c
            com.bumptech.glide.load.engine.u r3 = b(r3)
            com.bumptech.glide.load.engine.u r3 = r0.a(r3, r4)
            return r3
        L2c:
            r3 = 0
            return r3
    }
}

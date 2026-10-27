package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 28)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f extends com.bumptech.glide.load.resource.k<android.graphics.Bitmap> {
    private static final java.lang.String d = "BitmapImageDecoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.e c;

    public f() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.f r0 = new com.bumptech.glide.load.engine.bitmap_recycle.f
            r0.<init>()
            r1.c = r0
            return
    }

    @Override // com.bumptech.glide.load.resource.k
    protected com.bumptech.glide.load.engine.u<android.graphics.Bitmap> c(android.graphics.ImageDecoder.Source r1, int r2, int r3, android.graphics.ImageDecoder.OnHeaderDecodedListener r4) throws java.io.IOException {
            r0 = this;
            android.graphics.Bitmap r1 = androidx.core.graphics.w.a(r1, r4)
            java.lang.String r2 = "BitmapImageDecoder"
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L13
            r1.getWidth()
            r1.getHeight()
        L13:
            com.bumptech.glide.load.resource.bitmap.g r2 = new com.bumptech.glide.load.resource.bitmap.g
            com.bumptech.glide.load.engine.bitmap_recycle.e r3 = r0.c
            r2.<init>(r1, r3)
            return r2
    }
}

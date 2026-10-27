package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g implements com.bumptech.glide.load.engine.u<android.graphics.Bitmap>, com.bumptech.glide.load.engine.q {
    private final android.graphics.Bitmap a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;

    public g(@androidx.annotation.NonNull android.graphics.Bitmap r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Bitmap must not be null"
            java.lang.Object r2 = com.bumptech.glide.util.k.e(r2, r0)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.a = r2
            java.lang.String r2 = "BitmapPool must not be null"
            java.lang.Object r2 = com.bumptech.glide.util.k.e(r3, r2)
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = (com.bumptech.glide.load.engine.bitmap_recycle.e) r2
            r1.b = r2
            return
    }

    @androidx.annotation.Nullable
    public static com.bumptech.glide.load.resource.bitmap.g c(@androidx.annotation.Nullable android.graphics.Bitmap r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bumptech.glide.load.resource.bitmap.g r0 = new com.bumptech.glide.load.resource.bitmap.g
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.Bitmap> a() {
            r1 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.Bitmap b() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.graphics.Bitmap get() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.b()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.a
            int r0 = com.bumptech.glide.util.l.h(r0)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.q
    public void initialize() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.a
            r0.prepareToDraw()
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r2.b
            android.graphics.Bitmap r1 = r2.a
            r0.d(r1)
            return
    }
}

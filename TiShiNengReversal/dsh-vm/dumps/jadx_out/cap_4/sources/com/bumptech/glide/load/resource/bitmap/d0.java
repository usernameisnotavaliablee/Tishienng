package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d0 implements com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable>, com.bumptech.glide.load.engine.q {
    private final android.content.res.Resources a;
    private final com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b;

    private d0(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.a = r1
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            r0.b = r1
            return
    }

    @androidx.annotation.Nullable
    public static com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> c(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.bumptech.glide.load.resource.bitmap.d0 r0 = new com.bumptech.glide.load.resource.bitmap.d0
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.resource.bitmap.d0 d(android.content.Context r1, android.graphics.Bitmap r2) {
            android.content.res.Resources r0 = r1.getResources()
            com.bumptech.glide.b r1 = com.bumptech.glide.b.e(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r1.h()
            com.bumptech.glide.load.resource.bitmap.g r1 = com.bumptech.glide.load.resource.bitmap.g.c(r2, r1)
            com.bumptech.glide.load.engine.u r1 = c(r0, r1)
            com.bumptech.glide.load.resource.bitmap.d0 r1 = (com.bumptech.glide.load.resource.bitmap.d0) r1
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.resource.bitmap.d0 e(android.content.res.Resources r0, com.bumptech.glide.load.engine.bitmap_recycle.e r1, android.graphics.Bitmap r2) {
            com.bumptech.glide.load.resource.bitmap.g r1 = com.bumptech.glide.load.resource.bitmap.g.c(r2, r1)
            com.bumptech.glide.load.engine.u r0 = c(r0, r1)
            com.bumptech.glide.load.resource.bitmap.d0 r0 = (com.bumptech.glide.load.resource.bitmap.d0) r0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.drawable.BitmapDrawable> a() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r0 = android.graphics.drawable.BitmapDrawable.class
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.drawable.BitmapDrawable b() {
            r3 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r3.a
            com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r2 = r3.b
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.graphics.drawable.BitmapDrawable get() {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = r1.b()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r0 = r1.b
            int r0 = r0.getSize()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.q
    public void initialize() {
            r2 = this;
            com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r0 = r2.b
            boolean r1 = r0 instanceof com.bumptech.glide.load.engine.q
            if (r1 == 0) goto Lb
            com.bumptech.glide.load.engine.q r0 = (com.bumptech.glide.load.engine.q) r0
            r0.initialize()
        Lb:
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r1 = this;
            com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r0 = r1.b
            r0.recycle()
            return
    }
}

package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g0 implements com.bumptech.glide.load.g<android.net.Uri, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.drawable.e a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;

    public g0(com.bumptech.glide.load.resource.drawable.e r1, com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.engine.u r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> c(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            com.bumptech.glide.load.resource.drawable.e r0 = r1.a
            com.bumptech.glide.load.engine.u r2 = r0.c(r2, r3, r4, r5)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.Object r2 = r2.get()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            com.bumptech.glide.load.engine.bitmap_recycle.e r5 = r1.b
            com.bumptech.glide.load.engine.u r2 = com.bumptech.glide.load.resource.bitmap.v.a(r5, r2, r3, r4)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            java.lang.String r2 = "android.resource"
            java.lang.String r1 = r1.getScheme()
            boolean r1 = r2.equals(r1)
            return r1
    }
}

package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a<DataType> implements com.bumptech.glide.load.g<DataType, android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.g<DataType, android.graphics.Bitmap> a;
    private final android.content.res.Resources b;

    public a(android.content.Context r1, com.bumptech.glide.load.g<DataType, android.graphics.Bitmap> r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public a(android.content.res.Resources r1, com.bumptech.glide.load.engine.bitmap_recycle.e r2, com.bumptech.glide.load.g<DataType, android.graphics.Bitmap> r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public a(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull com.bumptech.glide.load.g<DataType, android.graphics.Bitmap> r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.b = r1
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.load.g r1 = (com.bumptech.glide.load.g) r1
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@androidx.annotation.NonNull DataType r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.g<DataType, android.graphics.Bitmap> r0 = r1.a
            boolean r2 = r0.a(r2, r3)
            return r2
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> b(@androidx.annotation.NonNull DataType r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.g<DataType, android.graphics.Bitmap> r0 = r1.a
            com.bumptech.glide.load.engine.u r2 = r0.b(r2, r3, r4, r5)
            android.content.res.Resources r3 = r1.b
            com.bumptech.glide.load.engine.u r2 = com.bumptech.glide.load.resource.bitmap.d0.c(r3, r2)
            return r2
    }
}

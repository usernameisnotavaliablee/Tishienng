package com.bumptech.glide.load.resource.transcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements com.bumptech.glide.load.resource.transcode.e<android.graphics.Bitmap, android.graphics.drawable.BitmapDrawable> {
    private final android.content.res.Resources a;

    public b(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            r0.<init>(r1)
            return
    }

    public b(@androidx.annotation.NonNull android.content.res.Resources r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.a = r1
            return
    }

    @java.lang.Deprecated
    public b(@androidx.annotation.NonNull android.content.res.Resources r1, com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> a(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            android.content.res.Resources r2 = r0.a
            com.bumptech.glide.load.engine.u r1 = com.bumptech.glide.load.resource.bitmap.d0.c(r2, r1)
            return r1
    }
}

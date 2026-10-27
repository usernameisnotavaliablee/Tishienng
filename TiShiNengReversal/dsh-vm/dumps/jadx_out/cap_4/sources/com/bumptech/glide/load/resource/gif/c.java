package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements com.bumptech.glide.load.h<com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final java.lang.String a = "GifEncoder";

    public c() {
            r0 = this;
            r0.<init>()
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
    public com.bumptech.glide.load.EncodeStrategy b(@androidx.annotation.NonNull com.bumptech.glide.load.f r1) {
            r0 = this;
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.SOURCE
            return r1
    }

    public boolean c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) {
            r0 = this;
            java.lang.Object r1 = r1.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r1 = (com.bumptech.glide.load.resource.gif.GifDrawable) r1
            java.nio.ByteBuffer r1 = r1.c()     // Catch: java.io.IOException -> Lf
            com.bumptech.glide.util.a.e(r1, r2)     // Catch: java.io.IOException -> Lf
            r1 = 1
            return r1
        Lf:
            java.lang.String r1 = "GifEncoder"
            r2 = 5
            android.util.Log.isLoggable(r1, r2)
            r1 = 0
            return r1
    }
}

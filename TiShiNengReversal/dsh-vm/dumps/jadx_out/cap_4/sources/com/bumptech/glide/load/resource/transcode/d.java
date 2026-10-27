package com.bumptech.glide.load.resource.transcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.load.resource.transcode.e<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.u<byte[]> a(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            java.lang.Object r1 = r1.get()
            com.bumptech.glide.load.resource.gif.GifDrawable r1 = (com.bumptech.glide.load.resource.gif.GifDrawable) r1
            java.nio.ByteBuffer r1 = r1.c()
            u.b r2 = new u.b
            byte[] r1 = com.bumptech.glide.util.a.d(r1)
            r2.<init>(r1)
            return r2
    }
}

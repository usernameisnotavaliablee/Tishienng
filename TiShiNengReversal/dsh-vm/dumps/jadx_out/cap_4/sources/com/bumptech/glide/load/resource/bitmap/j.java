package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j implements com.bumptech.glide.load.g<java.nio.ByteBuffer, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.bitmap.u a;

    public j(com.bumptech.glide.load.resource.bitmap.u r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            com.bumptech.glide.load.engine.u r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> c(@androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r2 = com.bumptech.glide.util.a.f(r2)
            com.bumptech.glide.load.resource.bitmap.u r0 = r1.a
            com.bumptech.glide.load.engine.u r2 = r0.f(r2, r3, r4, r5)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.u r2 = r0.a
            boolean r1 = r2.q(r1)
            return r1
    }
}

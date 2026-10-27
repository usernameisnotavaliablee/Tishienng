package com.bumptech.glide.load.resource.transcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements com.bumptech.glide.load.resource.transcode.e<android.graphics.Bitmap, byte[]> {
    private final android.graphics.Bitmap.CompressFormat a;
    private final int b;

    public a() {
            r2 = this;
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1 = 100
            r2.<init>(r0, r1)
            return
    }

    public a(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.engine.u<byte[]> a(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r3 = this;
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap$CompressFormat r1 = r3.a
            int r2 = r3.b
            r0.compress(r1, r2, r5)
            r4.recycle()
            u.b r4 = new u.b
            byte[] r5 = r5.toByteArray()
            r4.<init>(r5)
            return r4
    }
}

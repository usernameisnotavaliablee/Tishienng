package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(27)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class x implements com.bumptech.glide.load.ImageHeaderParser {
    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = com.bumptech.glide.util.a.f(r1)
            int r1 = r0.b(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            r1 = this;
            androidx.exifinterface.media.ExifInterface r3 = new androidx.exifinterface.media.ExifInterface
            r3.<init>(r2)
            java.lang.String r2 = "Orientation"
            r0 = 1
            int r2 = r3.getAttributeInt(r2, r0)
            if (r2 != 0) goto Lf
            r2 = -1
        Lf:
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.io.InputStream r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.nio.ByteBuffer r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }
}

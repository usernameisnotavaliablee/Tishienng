package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i implements com.bumptech.glide.load.g<java.io.InputStream, com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final java.lang.String d = "StreamGifDecoder";
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> a;
    private final com.bumptech.glide.load.g<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;

    public i(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, com.bumptech.glide.load.g<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    private static byte[] e(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L1d
        L9:
            int r2 = r4.read(r1)     // Catch: java.io.IOException -> L1d
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.io.IOException -> L1d
            goto L9
        L15:
            r0.flush()     // Catch: java.io.IOException -> L1d
            byte[] r4 = r0.toByteArray()
            return r4
        L1d:
            java.lang.String r4 = "StreamGifDecoder"
            r0 = 5
            android.util.Log.isLoggable(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> b(@androidx.annotation.NonNull java.io.InputStream r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            com.bumptech.glide.load.engine.u r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    public com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> c(@androidx.annotation.NonNull java.io.InputStream r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) throws java.io.IOException {
            r1 = this;
            byte[] r2 = e(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            com.bumptech.glide.load.g<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> r0 = r1.b
            com.bumptech.glide.load.engine.u r2 = r0.b(r2, r3, r4, r5)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.e<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.gif.h.b
            java.lang.Object r3 = r3.c(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1c
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3 = r1.a
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r1.c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.b.getType(r3, r2, r0)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
            if (r2 != r3) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }
}

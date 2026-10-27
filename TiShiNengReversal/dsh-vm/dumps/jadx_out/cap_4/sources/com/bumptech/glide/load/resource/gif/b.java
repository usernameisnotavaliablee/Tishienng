package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b implements com.bumptech.glide.gifdecoder.GifDecoder.a {
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.a
    @androidx.annotation.NonNull
    public byte[] a(int r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r2.b
            if (r0 != 0) goto L7
            byte[] r3 = new byte[r3]
            return r3
        L7:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r3 = r0.c(r3, r1)
            byte[] r3 = (byte[]) r3
            return r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.a
    @androidx.annotation.NonNull
    public android.graphics.Bitmap b(int r2, int r3, @androidx.annotation.NonNull android.graphics.Bitmap.Config r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r1.a
            android.graphics.Bitmap r2 = r0.f(r2, r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.a
    public void c(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r1.a
            r0.d(r2)
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.a
    @androidx.annotation.NonNull
    public int[] d(int r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r2.b
            if (r0 != 0) goto L7
            int[] r3 = new int[r3]
            return r3
        L7:
            java.lang.Class<int[]> r1 = int[].class
            java.lang.Object r3 = r0.c(r3, r1)
            int[] r3 = (int[]) r3
            return r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.a
    public void e(@androidx.annotation.NonNull byte[] r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r1.b
            if (r0 != 0) goto L5
            return
        L5:
            r0.put(r2)
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.a
    public void f(@androidx.annotation.NonNull int[] r2) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r1.b
            if (r0 != 0) goto L5
            return
        L5:
            r0.put(r2)
            return
    }
}

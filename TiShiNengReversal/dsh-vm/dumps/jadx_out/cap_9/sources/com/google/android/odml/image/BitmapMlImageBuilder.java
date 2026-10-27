package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BitmapMlImageBuilder {
    private final android.graphics.Bitmap zza;
    private int zzb;
    private android.graphics.Rect zzc;

    public BitmapMlImageBuilder(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.net.Uri r2) throws java.io.IOException {
            r0 = this;
            android.content.ContentResolver r1 = r1.getContentResolver()
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Media.getBitmap(r1, r2)
            r0.<init>(r1)
            return
    }

    public BitmapMlImageBuilder(@androidx.annotation.NonNull android.graphics.Bitmap r4) {
            r3 = this;
            r3.<init>()
            r3.zza = r4
            r0 = 0
            r3.zzb = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r4.getWidth()
            int r4 = r4.getHeight()
            r1.<init>(r0, r0, r2, r4)
            r3.zzc = r1
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.odml.image.MlImage build() {
            r8 = this;
            com.google.android.odml.image.MlImage r0 = new com.google.android.odml.image.MlImage
            com.google.android.odml.image.zze r1 = new com.google.android.odml.image.zze
            android.graphics.Bitmap r2 = r8.zza
            r1.<init>(r2)
            int r2 = r8.zzb
            android.graphics.Rect r3 = r8.zzc
            android.graphics.Bitmap r4 = r8.zza
            int r6 = r4.getWidth()
            android.graphics.Bitmap r4 = r8.zza
            int r7 = r4.getHeight()
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.odml.image.BitmapMlImageBuilder setRotation(int r1) {
            r0 = this;
            com.google.android.odml.image.MlImage.zzc(r1)
            r0.zzb = r1
            return r0
    }
}

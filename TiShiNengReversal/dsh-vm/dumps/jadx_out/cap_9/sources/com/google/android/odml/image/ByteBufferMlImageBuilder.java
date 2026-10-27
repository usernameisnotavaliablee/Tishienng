package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ByteBufferMlImageBuilder {
    private final java.nio.ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private android.graphics.Rect zzf;

    public ByteBufferMlImageBuilder(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r1 = 0
            r0.zze = r1
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r1, r1, r2, r3)
            r0.zzf = r4
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.odml.image.MlImage build() {
            r8 = this;
            com.google.android.odml.image.MlImage r0 = new com.google.android.odml.image.MlImage
            com.google.android.odml.image.zzf r1 = new com.google.android.odml.image.zzf
            java.nio.ByteBuffer r2 = r8.zza
            int r3 = r8.zzd
            r1.<init>(r2, r3)
            int r2 = r8.zze
            android.graphics.Rect r3 = r8.zzf
            int r6 = r8.zzb
            int r7 = r8.zzc
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.odml.image.ByteBufferMlImageBuilder setRotation(int r1) {
            r0 = this;
            com.google.android.odml.image.MlImage.zzc(r1)
            r0.zze = r1
            return r0
    }
}

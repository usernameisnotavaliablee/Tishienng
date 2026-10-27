package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzi implements com.google.android.odml.image.zzg {
    private final android.media.Image zza;
    private final com.google.android.odml.image.ImageProperties zzb;

    public zzi(android.media.Image r4) {
            r3 = this;
            r3.<init>()
            r3.zza = r4
            com.google.android.odml.image.zzb r0 = new com.google.android.odml.image.zzb
            r0.<init>()
            r1 = 3
            r0.zzb(r1)
            int r4 = r4.getFormat()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L24
            r1 = 42
            if (r4 != r1) goto L1e
            r4 = 1
            goto L32
        L1e:
            r1 = 41
            if (r4 != r1) goto L24
            r4 = 2
            goto L32
        L24:
            r1 = 35
            if (r4 == r1) goto L31
            r1 = 256(0x100, float:3.59E-43)
            if (r4 == r1) goto L2e
            r4 = 0
            goto L32
        L2e:
            r4 = 9
            goto L32
        L31:
            r4 = 7
        L32:
            r0.zza(r4)
            com.google.android.odml.image.ImageProperties r4 = r0.zzc()
            r3.zzb = r4
            return
    }

    public final android.media.Image zza() {
            r1 = this;
            android.media.Image r0 = r1.zza
            return r0
    }

    @Override // com.google.android.odml.image.zzg
    public final com.google.android.odml.image.ImageProperties zzb() {
            r1 = this;
            com.google.android.odml.image.ImageProperties r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
            r1 = this;
            android.media.Image r0 = r1.zza
            r0.close()
            return
    }
}

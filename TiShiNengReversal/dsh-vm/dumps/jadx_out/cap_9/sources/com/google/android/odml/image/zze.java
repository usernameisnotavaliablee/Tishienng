package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zze implements com.google.android.odml.image.zzg {
    private final android.graphics.Bitmap zza;
    private final com.google.android.odml.image.ImageProperties zzb;

    public zze(android.graphics.Bitmap r4) {
            r3 = this;
            r3.<init>()
            r3.zza = r4
            com.google.android.odml.image.zzb r0 = new com.google.android.odml.image.zzb
            r0.<init>()
            android.graphics.Bitmap$Config r4 = r4.getConfig()
            int[] r1 = com.google.android.odml.image.zzd.zza
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 1
            if (r4 == r1) goto L20
            r2 = 2
            if (r4 == r2) goto L1e
            r4 = 0
            goto L22
        L1e:
            r4 = 1
            goto L22
        L20:
            r4 = 8
        L22:
            r0.zza(r4)
            r0.zzb(r1)
            com.google.android.odml.image.ImageProperties r4 = r0.zzc()
            r3.zzb = r4
            return
    }

    public final android.graphics.Bitmap zza() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.zza
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
            android.graphics.Bitmap r0 = r1.zza
            r0.recycle()
            return
    }
}

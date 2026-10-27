package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhq implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzhm {
    private long zza;

    public zzhq(long r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static native void zze(long r0);

    private static native void zzf(long r0);

    private static native void zzg(long r0);

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzhm
    public final long zza() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzhm
    public final void zzb() {
            r5 = this;
            long r0 = r5.zza
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            zze(r0)
            r5.zza = r2
        Ld:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzhm
    public final void zzc() {
            r5 = this;
            long r0 = r5.zza
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            zzf(r0)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzhm
    public final void zzd() {
            r5 = this;
            long r0 = r5.zza
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            zzg(r0)
        Lb:
            return
    }
}

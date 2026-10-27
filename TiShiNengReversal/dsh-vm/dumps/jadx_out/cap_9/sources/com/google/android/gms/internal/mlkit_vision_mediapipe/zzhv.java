package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzhv {
    private long zza;

    private zzhv(long r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzd(long r1) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv
            r0.<init>(r1)
            return r0
    }

    private final native long zzf(long r1);

    private final native long zzg(long r1);

    private final native void zzh(long r1);

    public long zza() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zza
            long r0 = r2.zzg(r0)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzc() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv
            long r1 = r3.zza
            long r1 = r3.zzf(r1)
            r0.<init>(r1)
            return r0
    }

    public void zze() {
            r5 = this;
            long r0 = r5.zza
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r5.zzh(r0)
            r5.zza = r2
        Ld:
            return
    }
}

package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzdt {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj zza;
    private int zzb;
    private int zzc;

    public zzdt(com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            r0 = -1
            r1.zzc = r0
            java.lang.String r0 = "context"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r2, r0)
            r1.zza = r2
            return
    }

    protected abstract java.lang.Object zza();

    protected abstract void zzc(int r1, int r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo r3);

    public final int zzh() {
            r1 = this;
            int r0 = r1.zzc
            int r0 = r0 + 1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu zzi() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r0.zza()
            return r0
    }

    public final java.lang.Object zzj() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r3.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r0.zza()
            r0.zzc(r3)
            int r0 = r3.zzb
            int r1 = r0 + 1
            r1 = r1 & r0
            if (r1 != 0) goto L1e
            int r1 = r3.zzc
            r2 = 31
            if (r1 <= r2) goto L19
            r1 = -1
            if (r0 != r1) goto L1e
        L19:
            java.lang.Object r0 = r3.zza()
            return r0
        L1e:
            int r0 = ~r0
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "unreferenced arguments [first missing index=%d]"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r1 = r3.zza
            java.lang.String r1 = r1.zzb()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzb(r0, r1)
            throw r0
    }

    public final java.lang.String zzk() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r1.zza
            java.lang.String r0 = r0.zzb()
            return r0
    }

    public final void zzl(int r4, int r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo r6) {
            r3 = this;
            int r0 = r6.zzc()
            r1 = 32
            if (r0 >= r1) goto L13
            int r0 = r3.zzb
            r1 = 1
            int r2 = r6.zzc()
            int r1 = r1 << r2
            r0 = r0 | r1
            r3.zzb = r0
        L13:
            int r0 = r3.zzc
            int r1 = r6.zzc()
            int r0 = java.lang.Math.max(r0, r1)
            r3.zzc = r0
            r3.zzc(r4, r5, r6)
            return
    }
}

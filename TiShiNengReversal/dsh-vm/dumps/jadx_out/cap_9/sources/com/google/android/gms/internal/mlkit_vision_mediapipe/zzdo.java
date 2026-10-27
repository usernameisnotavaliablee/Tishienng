package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzdo {
    private final int zza;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzay zzb;

    protected zzdo(com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r3, int r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L23
            if (r4 < 0) goto Lc
            r2.zza = r4
            r2.zzb = r3
            return
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid index: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "format options cannot be null"
            r3.<init>(r4)
            throw r3
    }

    protected abstract void zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp r1, java.lang.Object r2);

    public final int zzc() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    protected final com.google.android.gms.internal.mlkit_vision_mediapipe.zzay zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r0 = r1.zzb
            return r0
    }

    public final void zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp r3, java.lang.Object[] r4) {
            r2 = this;
            int r0 = r2.zza
            int r1 = r4.length
            if (r0 >= r1) goto L11
            r4 = r4[r0]
            if (r4 == 0) goto Ld
            r2.zzb(r3, r4)
            return
        Ld:
            r3.zzg()
            return
        L11:
            r3.zzf()
            return
    }
}

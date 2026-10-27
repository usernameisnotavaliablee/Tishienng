package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbv implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzbw zza;
    private int zzb;

    zzbv(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbw r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = 0
            r0.zzb = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbw r0 = r2.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0 = r0.zza
            int r1 = r2.zzb
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzca.zzd(r0)
            if (r1 >= r0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbw r0 = r4.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0 = r0.zza
            int[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzca.zzg(r0)
            int r2 = r4.zzb
            int r3 = r2 + 1
            r4.zzb = r3
            r1 = r1[r2]
            r1 = r1 & 31
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzca.zze(r0, r1)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}

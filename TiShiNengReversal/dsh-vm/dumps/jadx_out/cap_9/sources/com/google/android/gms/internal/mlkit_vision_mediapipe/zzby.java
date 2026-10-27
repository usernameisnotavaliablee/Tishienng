package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzby implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzca zza;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzai zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzby(com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2, int r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbx r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r1 = r3 & 31
            r0.zzc = r1
            int r1 = r1 + 5
            int r1 = r3 >>> r1
            r0.zzd = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.zzc
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0 = r3.zza
            int r1 = r3.zzc
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzca.zzf(r0, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r1 = r3.zzb
            java.lang.Object r0 = r1.zze(r0)
            int r1 = r3.zzd
            if (r1 == 0) goto L23
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            int r1 = r1 + 1
            int r2 = r3.zzd
            int r2 = r2 >>> r1
            r3.zzd = r2
            int r2 = r3.zzc
            int r2 = r2 + r1
            r3.zzc = r2
            return r0
        L23:
            r1 = -1
            r3.zzc = r1
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

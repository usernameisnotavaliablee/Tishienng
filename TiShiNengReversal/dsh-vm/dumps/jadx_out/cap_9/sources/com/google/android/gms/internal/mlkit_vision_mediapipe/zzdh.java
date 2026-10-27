package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdh implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi zza;
    private int zzb;

    zzdh(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = 0
            r0.zzb = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1 = r3.zza
            int r2 = r1.zza()
            int r1 = r1.zzb()
            int r2 = r2 - r1
            if (r0 >= r2) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1 = r3.zza
            int r2 = r1.zza()
            int r1 = r1.zzb()
            int r2 = r2 - r1
            if (r0 >= r2) goto L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdi r1 = r3.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r2 = r1.zzb
            java.lang.Object[] r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zzc(r2)
            int r1 = r1.zzb()
            int r1 = r1 + r0
            r1 = r2[r1]
            int r0 = r0 + 1
            r3.zzb = r0
            return r1
        L23:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}

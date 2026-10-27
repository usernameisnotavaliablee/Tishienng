package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdi extends java.util.AbstractSet {
    final int zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj zzb;

    zzdi(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r1, int r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r1 = r5.zzb
            java.lang.Object[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zzc(r1)
            int r2 = r5.zzb()
            int r3 = r5.zza()
            r4 = -1
            if (r0 != r4) goto L18
            java.util.Comparator r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zza()
            goto L1c
        L18:
            java.util.Comparator r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl.zzc()
        L1c:
            int r6 = java.util.Arrays.binarySearch(r1, r2, r3, r6, r0)
            if (r6 < 0) goto L24
            r6 = 1
            return r6
        L24:
            r6 = 0
            return r6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdh r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdh
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r2 = this;
            int r0 = r2.zza()
            int r1 = r2.zzb()
            int r0 = r0 - r1
            return r0
    }

    final int zza() {
            r2 = this;
            int r0 = r2.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r1 = r2.zzb
            int[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zzb(r1)
            int r0 = r0 + 1
            r0 = r1[r0]
            return r0
    }

    final int zzb() {
            r2 = this;
            int r0 = r2.zza
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r1 = r2.zzb
            int[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zzb(r1)
            r0 = r1[r0]
            return r0
    }

    final java.lang.Object zzc(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj r0 = r2.zzb
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdj.zzc(r0)
            int r1 = r2.zzb()
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }
}

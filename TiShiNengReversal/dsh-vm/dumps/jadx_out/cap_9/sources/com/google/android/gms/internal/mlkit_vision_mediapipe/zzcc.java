package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcc extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzce {
    private final java.util.Map zza;

    /* synthetic */ zzcc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzcb r4) {
            r1 = this;
            r4 = 0
            r1.<init>(r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            zzd(r4, r2)
            zzd(r4, r3)
            java.util.Set r2 = r4.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzai) r0
            boolean r0 = r0.zzi()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r3.setValue(r0)
            goto L17
        L3d:
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r4)
            r1.zza = r2
            return
    }

    private static void zzd(java.util.Map r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r5) {
            r0 = 0
        L1:
            int r1 = r5.zza()
            if (r0 >= r1) goto L3b
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r1 = r5.zzb(r0)
            java.lang.Object r2 = r4.get(r1)
            boolean r3 = r1.zzi()
            if (r3 == 0) goto L2d
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L21
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.put(r1, r2)
        L21:
            java.lang.Object r3 = r5.zzd(r0)
            java.lang.Object r1 = r1.zze(r3)
            r2.add(r1)
            goto L38
        L2d:
            java.lang.Object r2 = r5.zzd(r0)
            java.lang.Object r2 = r1.zze(r2)
            r4.put(r1, r2)
        L38:
            int r0 = r0 + 1
            goto L1
        L3b:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzce
    public final int zza() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzce
    public final java.util.Set zzb() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzce
    public final void zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq r5, java.lang.Object r6) {
            r4 = this;
            java.util.Map r0 = r4.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzai) r2
            java.lang.Object r1 = r1.getValue()
            boolean r3 = r2.zzi()
            if (r3 == 0) goto L30
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            r5.zzb(r2, r1, r6)
            goto La
        L30:
            r5.zza(r2, r1, r6)
            goto La
        L34:
            return
    }
}

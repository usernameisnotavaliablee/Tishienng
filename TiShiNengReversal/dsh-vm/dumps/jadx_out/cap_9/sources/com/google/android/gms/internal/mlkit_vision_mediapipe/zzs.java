package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzs extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzai {
    zzs(java.lang.String r1, java.lang.Class r2, boolean r3) {
            r0 = this;
            java.lang.String r1 = "tags"
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzai
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzah r6) {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl) r5
            java.util.Map r5 = r5.zzd()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L44
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r6.zza(r3, r2)
            goto L30
        L44:
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r6.zza(r0, r1)
            goto Le
        L4f:
            return
    }
}

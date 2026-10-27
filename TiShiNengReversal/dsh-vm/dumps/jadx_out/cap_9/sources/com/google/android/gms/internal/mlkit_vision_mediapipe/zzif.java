package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzif {
    private final java.util.Map zza;

    zzif() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final java.lang.String zza(java.lang.Class r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final void zzb(java.lang.Class r3, java.lang.String r4) {
            r2 = this;
            java.util.Map r4 = r2.zza
            boolean r4 = r4.containsKey(r3)
            java.lang.String r0 = "drishti.InferenceCalculatorOptions.Delegate"
            if (r4 == 0) goto L37
            java.util.Map r4 = r2.zza
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L19
            goto L37
        L19:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu r4 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzht r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzht.zzg
            int r0 = r0.ordinal()
            java.util.Map r1 = r2.zza
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Protobuf type name: drishti.InferenceCalculatorOptions.Delegate conflicts with: "
            java.lang.String r3 = r1.concat(r3)
            r4.<init>(r0, r3)
            throw r4
        L37:
            java.util.Map r4 = r2.zza
            r4.put(r3, r0)
            return
    }
}

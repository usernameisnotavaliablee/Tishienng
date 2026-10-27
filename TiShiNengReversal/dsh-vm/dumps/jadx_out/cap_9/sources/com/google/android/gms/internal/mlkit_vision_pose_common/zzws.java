package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzws implements com.google.android.gms.internal.mlkit_vision_pose_common.zzwb {

    @androidx.annotation.Nullable
    private com.google.firebase.inject.Provider zza;
    private final com.google.firebase.inject.Provider zzb;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwd zzc;

    public zzws(android.content.Context r2, com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r3) {
            r1 = this;
            r1.<init>()
            r1.zzc = r3
            com.google.android.datatransport.cct.CCTDestination r3 = com.google.android.datatransport.cct.CCTDestination.INSTANCE
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r2)
            com.google.android.datatransport.runtime.TransportRuntime r2 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.TransportFactory r2 = r2.newFactory(r3)
            java.util.Set r3 = r3.getSupportedEncodings()
            java.lang.String r0 = "json"
            com.google.android.datatransport.Encoding r0 = com.google.android.datatransport.Encoding.of(r0)
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L2e
            com.google.firebase.components.Lazy r3 = new com.google.firebase.components.Lazy
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwp r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwp
            r0.<init>(r2)
            r3.<init>(r0)
            r1.zza = r3
        L2e:
            com.google.firebase.components.Lazy r3 = new com.google.firebase.components.Lazy
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwq r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwq
            r0.<init>(r2)
            r3.<init>(r0)
            r1.zzb = r3
            return
    }

    @androidx.annotation.VisibleForTesting
    static com.google.android.datatransport.Event zzb(com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r2, com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r3) {
            int r2 = r2.zza()
            int r0 = r3.zza()
            r1 = 0
            if (r0 == 0) goto L14
            byte[] r2 = r3.zze(r2, r1)
            com.google.android.datatransport.Event r2 = com.google.android.datatransport.Event.ofData(r2)
            return r2
        L14:
            byte[] r2 = r3.zze(r2, r1)
            com.google.android.datatransport.Event r2 = com.google.android.datatransport.Event.ofTelemetry(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzwb
    public final void zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r0 = r2.zzc
            int r0 = r0.zza()
            if (r0 != 0) goto L1c
            com.google.firebase.inject.Provider r0 = r2.zza
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.Transport r0 = (com.google.android.datatransport.Transport) r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r1 = r2.zzc
            com.google.android.datatransport.Event r3 = zzb(r1, r3)
            r0.send(r3)
        L1b:
            return
        L1c:
            com.google.firebase.inject.Provider r0 = r2.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.Transport r0 = (com.google.android.datatransport.Transport) r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r1 = r2.zzc
            com.google.android.datatransport.Event r3 = zzb(r1, r3)
            r0.send(r3)
            return
    }
}

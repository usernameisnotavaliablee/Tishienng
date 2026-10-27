package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzxe implements com.google.android.gms.internal.mlkit_vision_pose_common.zzxn {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzxf zza;
    private final java.lang.String zzb;
    private final java.util.Date zzc;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvr zzd;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zze;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzwy zzf;

    zzxe(com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r1, java.lang.String r2, java.util.Date r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzxn
    public final boolean zza() throws com.google.android.gms.internal.mlkit_vision_pose_common.zzxh {
            r13 = this;
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r1 = r13.zza     // Catch: com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L5b
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwz r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zze(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L5b
            java.net.HttpURLConnection r3 = r1.zzb()     // Catch: com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L5b
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r1 = r13.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwz r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zze(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzd(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r1 = r1.zza()
            java.lang.String r4 = r1.zza()
            java.lang.String r5 = r13.zzb
            java.util.Date r9 = r13.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r1 = r13.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r12 = r13.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbg.zzc()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r8 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbg.zzc()
            java.lang.String r10 = "o:a:mlkit:1.0.0"
            java.lang.String r11 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzg(r1)
            r7 = 0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxa r1 = r2.zza(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r1 = r1.zza()
            r13.zzf = r1
            org.json.JSONObject r1 = r1.zzc()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzc(r1)     // Catch: org.json.JSONException -> L4a
            r13.zze = r2     // Catch: org.json.JSONException -> L4a
            r0 = 1
            return r0
        L4a:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r2 = r13.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zze
            r2.zzb(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Fetched remote config setting has invalid format: "
            r2.concat(r1)
            return r0
        L5b:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r1 = r13.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzb
            r1.zzb(r2)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzwy zzc() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r0 = r1.zzf
            return r0
    }
}

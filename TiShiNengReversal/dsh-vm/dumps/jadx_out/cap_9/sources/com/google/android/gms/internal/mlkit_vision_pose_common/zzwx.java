package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzwx {
    private org.json.JSONObject zza;
    private java.util.Date zzb;
    private org.json.JSONArray zzc;

    private zzwx() {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.zza = r0
            java.util.Date r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwy.zza()
            r1.zzb = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1.zzc = r0
            return
    }

    /* synthetic */ zzwx(com.google.android.gms.internal.mlkit_vision_pose_common.zzww r1) {
            r0 = this;
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r0.zza = r1
            java.util.Date r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwy.zza()
            r0.zzb = r1
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r0.zzc = r1
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzwx zza(org.json.JSONObject r2) {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> Lb
            r0.<init>(r2)     // Catch: org.json.JSONException -> Lb
            r1.zza = r0     // Catch: org.json.JSONException -> Lb
        Lb:
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzwx zzb(org.json.JSONArray r2) {
            r1 = this;
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> Lb
            r0.<init>(r2)     // Catch: org.json.JSONException -> Lb
            r1.zzc = r0     // Catch: org.json.JSONException -> Lb
        Lb:
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzwx zzc(java.util.Date r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzwy zzd() throws org.json.JSONException {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwy
            org.json.JSONObject r1 = r4.zza
            java.util.Date r2 = r4.zzb
            org.json.JSONArray r3 = r4.zzc
            r0.<init>(r1, r2, r3)
            return r0
    }
}

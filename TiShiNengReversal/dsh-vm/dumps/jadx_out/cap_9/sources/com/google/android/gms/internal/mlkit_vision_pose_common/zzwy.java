package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzwy {
    private static final java.util.Date zza = null;
    private final org.json.JSONObject zzb;
    private final org.json.JSONObject zzc;
    private final java.util.Date zzd;

    static {
            java.util.Date r0 = new java.util.Date
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy.zza = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    zzwy(org.json.JSONObject r5, java.util.Date r6, org.json.JSONArray r7) throws org.json.JSONException {
            r4 = this;
            r4.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "configs_key"
            r0.put(r1, r5)
            java.lang.String r1 = "fetch_time_key"
            long r2 = r6.getTime()
            r0.put(r1, r2)
            java.lang.String r1 = "abt_experiments_key"
            r0.put(r1, r7)
            r4.zzc = r5
            r4.zzd = r6
            r4.zzb = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.Date zza() {
            java.util.Date r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwy.zza
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            org.json.JSONObject r0 = r1.zzb
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.util.Date zzb() {
            r1 = this;
            java.util.Date r0 = r1.zzd
            return r0
    }

    public final org.json.JSONObject zzc() {
            r1 = this;
            org.json.JSONObject r0 = r1.zzc
            return r0
    }
}

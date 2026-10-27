package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzxk {
    private static final java.lang.Object zza = null;
    private final android.content.Context zzb;

    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzxk> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxk.class
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxj r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxj
            r1.<init>()
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            r0.build()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxk.zza = r0
            return
    }

    public zzxk(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    private final java.io.File zzc() {
            r4 = this;
            android.content.Context r0 = r4.zzb
            java.io.File r1 = new java.io.File
            java.io.File r0 = androidx.core.content.ContextCompat.getNoBackupFilesDir(r0)
            if (r0 == 0) goto L11
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L11
            goto L32
        L11:
            android.content.Context r0 = r4.zzb
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L32
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L32
            boolean r2 = r0.mkdirs()     // Catch: java.lang.SecurityException -> L29
            if (r2 != 0) goto L32
            r0.toString()     // Catch: java.lang.SecurityException -> L29
            goto L32
        L29:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "mkdirs threw an exception: "
            r3.concat(r2)
        L32:
            java.lang.String r2 = "com.google.mlkit.RemoteConfig"
            r1.<init>(r0, r2)
            return r1
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzwy zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r9) {
            r8 = this;
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxk.zza
            monitor-enter(r0)
            java.io.File r1 = r8.zzc()     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            androidx.core.util.AtomicFile r3 = new androidx.core.util.AtomicFile     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L5c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L5c
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L5c
            byte[] r3 = r3.readFully()     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L5c
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L5c
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L5c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L50
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L50
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwy     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            java.lang.String r4 = "configs_key"
            org.json.JSONObject r4 = r1.getJSONObject(r4)     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            java.lang.String r6 = "fetch_time_key"
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            java.lang.String r6 = "abt_experiments_key"
            org.json.JSONArray r6 = r1.getJSONArray(r6)     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L3f org.json.JSONException -> L41
            r2 = r3
            goto L5a
        L3f:
            r9 = move-exception
            goto L71
        L41:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzk     // Catch: java.lang.Throwable -> L3f
            r9.zzc(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Error parsing remote config settings JSON object:\n"
            r1.concat(r9)     // Catch: java.lang.Throwable -> L3f
            goto L5a
        L50:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzl     // Catch: java.lang.Throwable -> L3f
            r9.zzc(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = "Error parsing remote config settings JSON string:\n"
            r9.concat(r4)     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r2
        L5c:
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L67
            r1.toString()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r2
        L67:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzj     // Catch: java.lang.Throwable -> L3f
            r9.zzc(r3)     // Catch: java.lang.Throwable -> L3f
            r1.toString()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r2
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r9
    }

    public final void zzb(com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r6, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r7) {
            r5 = this;
            java.lang.String r6 = r6.toString()
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxk.zza
            monitor-enter(r0)
            java.io.File r1 = r5.zzc()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L30
            r1.toString()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            androidx.core.util.AtomicFile r2 = new androidx.core.util.AtomicFile     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            java.io.FileOutputStream r3 = r2.startWrite()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r4.println(r6)     // Catch: java.lang.Throwable -> L2b
            r4.flush()     // Catch: java.lang.Throwable -> L2b
            r2.finishWrite(r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            r1.toString()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            goto L39
        L29:
            r6 = move-exception
            goto L3b
        L2b:
            r6 = move-exception
            r2.failWrite(r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
            throw r6     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L31
        L30:
            r1 = 0
        L31:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzi     // Catch: java.lang.Throwable -> L29
            r7.zzc(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L29
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r6
    }
}

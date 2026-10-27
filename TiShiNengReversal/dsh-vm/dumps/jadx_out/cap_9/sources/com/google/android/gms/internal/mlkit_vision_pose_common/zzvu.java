package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvu {
    private static final java.lang.Object zza = null;
    private final android.content.Context zzb;

    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzvu> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvu.class
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.firebase.components.Dependency r1 = com.google.firebase.components.Dependency.required(r1)
            com.google.firebase.components.Component$Builder r0 = r0.add(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvt r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvt
            r1.<init>()
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            r0.build()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvu.zza = r0
            return
    }

    public zzvu(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzvv zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r10) {
            r9 = this;
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvu.zza
            monitor-enter(r1)
            java.io.File r0 = r9.zzb(r10)     // Catch: java.lang.Throwable -> L33
            r2 = 0
            androidx.core.util.AtomicFile r3 = new androidx.core.util.AtomicFile     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L83
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L83
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L83
            byte[] r3 = r3.readFully()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L83
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L83
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L83
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzda.zzb(r4)     // Catch: java.lang.Throwable -> L33 com.google.android.gms.internal.mlkit_vision_pose_common.zzdc -> L77
            boolean r3 = r0 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcy     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L36
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "Error parsing installation info JSON element:\n"
            r3.concat(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzl     // Catch: java.lang.Throwable -> L33
            r10.zzc(r0)     // Catch: java.lang.Throwable -> L33
            goto L81
        L33:
            r0 = move-exception
            r10 = r0
            goto L98
        L36:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r0 = r0.zzb()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvk     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r3 = "fid"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r0.zzc(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r3 = r3.zze()     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r3 = "refreshToken"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r0.zzc(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r5 = r3.zze()     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r3 = "temporaryToken"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r0.zzc(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r6 = r3.zze()     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            java.lang.String r3 = "temporaryTokenExpiryTimestamp"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r0.zzc(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            long r7 = r3.zzc()     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvv     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            r3.<init>(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L6e
            r2 = r3
            goto L81
        L6e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzk     // Catch: java.lang.Throwable -> L33
            r10.zzc(r3)     // Catch: java.lang.Throwable -> L33
            r0.toString()     // Catch: java.lang.Throwable -> L33
            goto L81
        L77:
            java.lang.String r0 = "Error parsing installation info JSON object:\n"
            r0.concat(r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzl     // Catch: java.lang.Throwable -> L33
            r10.zzc(r0)     // Catch: java.lang.Throwable -> L33
        L81:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L83:
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L8e
            r0.toString()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L8e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzj     // Catch: java.lang.Throwable -> L33
            r10.zzc(r3)     // Catch: java.lang.Throwable -> L33
            r0.toString()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L98:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r10
    }

    @androidx.annotation.VisibleForTesting
    final java.io.File zzb(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r5) {
            r4 = this;
            android.content.Context r0 = r4.zzb
            java.io.File r1 = new java.io.File
            java.io.File r0 = androidx.core.content.ContextCompat.getNoBackupFilesDir(r0)
            if (r0 == 0) goto L11
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L11
            goto L3c
        L11:
            android.content.Context r0 = r4.zzb
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L3c
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L3c
            boolean r2 = r0.mkdirs()     // Catch: java.lang.SecurityException -> L2e
            if (r2 != 0) goto L3c
            r0.toString()     // Catch: java.lang.SecurityException -> L2e
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzg     // Catch: java.lang.SecurityException -> L2e
            r5.zzd(r2)     // Catch: java.lang.SecurityException -> L2e
            goto L3c
        L2e:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "mkdirs threw an exception: "
            r3.concat(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzg
            r5.zzd(r2)
        L3c:
            java.lang.String r5 = "com.google.mlkit.InstallationId"
            r1.<init>(r0, r5)
            return r1
    }

    public final void zzc(com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r6, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r7) {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r0 = r6.zzb()
            java.lang.String r0 = r0.zza()
            java.lang.String r1 = r6.zzc()
            java.lang.String r2 = r6.zzd()
            long r3 = r6.zza()
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r6
            java.lang.String r6 = "{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvu.zza
            monitor-enter(r0)
            java.io.File r1 = r5.zzb(r7)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L59
            r1.toString()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            androidx.core.util.AtomicFile r2 = new androidx.core.util.AtomicFile     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            java.io.FileOutputStream r3 = r2.startWrite()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L54
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L54
            r4.println(r6)     // Catch: java.lang.Throwable -> L54
            r4.flush()     // Catch: java.lang.Throwable -> L54
            r2.finishWrite(r3)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            r1.toString()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            goto L62
        L52:
            r6 = move-exception
            goto L64
        L54:
            r6 = move-exception
            r2.failWrite(r3)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
            throw r6     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5a
        L59:
            r1 = 0
        L5a:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzi     // Catch: java.lang.Throwable -> L52
            r7.zzc(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L52
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r6
    }
}

package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zza {
    private static final java.lang.Object zza = null;

    @androidx.annotation.GuardedBy("gpuAllowedLock")
    private static java.lang.Boolean zzb;
    private final android.content.Context zzc;
    private final com.google.mlkit.acceleration.internal.PipelineId zzd;
    private final com.google.mlkit.acceleration.internal.AllowlistConfig zze;
    private final com.google.mlkit.acceleration.internal.AccelerationLogger zzf;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.mlkit.acceleration.internal.zza.zza = r0
            return
    }

    zza(android.content.Context r1, com.google.mlkit.acceleration.internal.PipelineId r2, com.google.mlkit.acceleration.internal.AllowlistConfig r3, com.google.mlkit.acceleration.internal.AccelerationLogger r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            r0.zzf = r4
            return
    }

    final java.util.List zza(@androidx.annotation.NonNull com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 0
            com.google.android.gms.tasks.Tasks.forResult(r0)
            com.google.mlkit.acceleration.internal.AllowlistConfig r0 = r1.zze
            java.lang.String r3 = r0.getBundledAllowlistAssetPath()
            android.content.Context r0 = r1.zzc     // Catch: java.io.IOException -> L26
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L26
            java.io.InputStream r4 = r0.open(r3)     // Catch: java.io.IOException -> L26
            com.google.android.gms.internal.mlkit_acceleration.zzdi r0 = com.google.android.gms.internal.mlkit_acceleration.zzdi.zza()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.internal.mlkit_acceleration.zzhh r0 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzc(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L4b
            r4.close()     // Catch: java.io.IOException -> L26
            goto L4b
        L26:
            goto L35
        L28:
            r0 = move-exception
            r5 = r0
            if (r4 == 0) goto L34
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.io.IOException -> L26
        L34:
            throw r5     // Catch: java.io.IOException -> L26
        L35:
            java.lang.String r0 = "AllowlistManager"
            r4 = 6
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L47
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Failed to load allowlist from "
            r3.concat(r0)
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzhh r0 = com.google.android.gms.internal.mlkit_acceleration.zzhh.zzb()
        L4b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L81
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.mlkit_acceleration.zzhk r4 = (com.google.android.gms.internal.mlkit_acceleration.zzhk) r4
            com.google.android.gms.internal.mlkit_acceleration.zzhe r5 = r4.zza()
            java.lang.String r5 = r5.zzc()
            com.google.android.gms.internal.mlkit_acceleration.zzhe r4 = r4.zza()
            boolean r4 = r4.zzd()
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6.<init>(r5, r4)
            r3.add(r6)
            goto L58
        L81:
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r4 = "default_config"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0.<init>(r4, r5)
            r3.add(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.size()
            r7 = 0
        L97:
            if (r7 >= r5) goto L1b4
            java.lang.Object r0 = r3.get(r7)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r8 = r0.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            com.google.mlkit.acceleration.internal.AllowlistConfig r0 = r1.zze
            boolean r0 = r0.isRunConfigCompatibleWithOptions(r8, r2)
            if (r0 != 0) goto Lb6
            r15 = 0
            goto L1b0
        Lb6:
            com.google.mlkit.acceleration.internal.AllowlistConfig r0 = r1.zze
            boolean r0 = r0.shouldCheckGenericGpuAllowlist(r8)
            if (r0 == 0) goto L195
            java.lang.Object r10 = com.google.mlkit.acceleration.internal.zza.zza
            monitor-enter(r10)
            java.lang.Boolean r0 = com.google.mlkit.acceleration.internal.zza.zzb     // Catch: java.lang.Throwable -> L147
            if (r0 != 0) goto L145
            com.google.android.gms.internal.mlkit_acceleration.zzbv r0 = com.google.android.gms.internal.mlkit_acceleration.zzbw.zze()     // Catch: java.lang.Throwable -> L147
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L147
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L147
            r12.<init>()     // Catch: java.lang.Throwable -> L147
            r12.append(r11)     // Catch: java.lang.Throwable -> L147
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L147
            r0.zza(r11)     // Catch: java.lang.Throwable -> L147
            java.lang.String r11 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L147
            r0.zzd(r11)     // Catch: java.lang.Throwable -> L147
            java.lang.String r11 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L147
            r0.zzb(r11)     // Catch: java.lang.Throwable -> L147
            java.lang.String r11 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L147
            r0.zzc(r11)     // Catch: java.lang.Throwable -> L147
            com.google.android.gms.internal.mlkit_acceleration.zzbw r0 = r0.zze()     // Catch: java.lang.Throwable -> L147
            com.google.android.gms.internal.mlkit_acceleration.zzg r11 = com.google.android.gms.internal.mlkit_acceleration.zzh.zza()     // Catch: java.lang.Throwable -> L147 com.google.android.gms.internal.mlkit_acceleration.zze -> L172
            com.google.android.gms.internal.mlkit_acceleration.zzbx r12 = com.google.android.gms.internal.mlkit_acceleration.zzby.zzd()     // Catch: java.lang.Throwable -> L147
            java.lang.String r13 = r11.zzc()     // Catch: java.lang.Throwable -> L147
            r12.zzc(r13)     // Catch: java.lang.Throwable -> L147
            int r13 = r11.zza()     // Catch: java.lang.Throwable -> L147
            r12.zza(r13)     // Catch: java.lang.Throwable -> L147
            int r11 = r11.zzb()     // Catch: java.lang.Throwable -> L147
            r12.zzb(r11)     // Catch: java.lang.Throwable -> L147
            com.google.android.gms.internal.mlkit_acceleration.zzby r11 = r12.zzd()     // Catch: java.lang.Throwable -> L147
            android.content.Context r12 = r1.zzc     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            android.content.res.AssetManager r12 = r12.getAssets()     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            java.lang.String r13 = "mobile_acceleration/gpu_compatibility.bin"
            java.io.InputStream r12 = r12.open(r13)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            int r13 = r12.available()     // Catch: java.lang.Throwable -> L15f
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L15f
            r14 = 0
        L121:
            int r15 = r13.length     // Catch: java.lang.Throwable -> L15f
            int r6 = r15 - r14
            int r6 = r12.read(r13, r14, r6)     // Catch: java.lang.Throwable -> L15f
            if (r6 > 0) goto L14b
            r12.close()     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r13)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            com.google.android.gms.internal.mlkit_acceleration.zzhv r6 = com.google.android.gms.internal.mlkit_acceleration.zzhv.zzg(r6)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            boolean r0 = com.google.android.gms.internal.mlkit_acceleration.zzbz.zza(r0, r11, r6)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            com.google.mlkit.acceleration.internal.zza.zzb = r0     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
            java.lang.String r0 = "AllowlistManager"
            r6 = 3
            android.util.Log.isLoggable(r0, r6)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L149
        L145:
            r15 = 0
            goto L189
        L147:
            r0 = move-exception
            goto L193
        L149:
            r15 = 0
            goto L16d
        L14b:
            int r14 = r14 + r6
            int r6 = r12.available()     // Catch: java.lang.Throwable -> L15f
            int r15 = r15 - r14
            if (r6 <= r15) goto L121
            int r6 = r6 + r14
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L15f
            r15 = 0
            java.lang.System.arraycopy(r13, r15, r6, r15, r14)     // Catch: java.lang.Throwable -> L15c
            r13 = r6
            goto L121
        L15c:
            r0 = move-exception
        L15d:
            r6 = r0
            goto L162
        L15f:
            r0 = move-exception
            r15 = 0
            goto L15d
        L162:
            if (r12 == 0) goto L16c
            r12.close()     // Catch: java.lang.Throwable -> L168
            goto L16c
        L168:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L16d
        L16c:
            throw r6     // Catch: java.lang.Throwable -> L147 java.io.IOException -> L16d
        L16d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L147
            com.google.mlkit.acceleration.internal.zza.zzb = r0     // Catch: java.lang.Throwable -> L147
            goto L189
        L172:
            r0 = move-exception
            r15 = 0
            com.google.mlkit.acceleration.internal.AccelerationLogger r6 = r1.zzf     // Catch: java.lang.Throwable -> L147
            com.google.mlkit.acceleration.internal.AccelerationInfraException r0 = com.google.mlkit.acceleration.internal.AccelerationInfraException.zza(r0)     // Catch: java.lang.Throwable -> L147
            r6.logAccelerationInfraError(r0)     // Catch: java.lang.Throwable -> L147
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L147
            com.google.mlkit.acceleration.internal.zza.zzb = r0     // Catch: java.lang.Throwable -> L147
            java.lang.Boolean r0 = com.google.mlkit.acceleration.internal.zza.zzb     // Catch: java.lang.Throwable -> L147
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L147
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L147
            goto L190
        L189:
            java.lang.Boolean r0 = com.google.mlkit.acceleration.internal.zza.zzb     // Catch: java.lang.Throwable -> L147
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L147
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L147
        L190:
            if (r0 == 0) goto L1b0
            goto L196
        L193:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L147
            throw r0
        L195:
            r15 = 0
        L196:
            com.google.mlkit.acceleration.internal.RunConfig$Builder r0 = new com.google.mlkit.acceleration.internal.RunConfig$Builder
            r0.<init>()
            com.google.mlkit.acceleration.internal.PipelineId r6 = r1.zzd
            r0.setPipelineId(r6)
            r0.setBaseOptions(r2)
            r0.setConfigName(r8)
            r0.setMiniBenchmarkRequired(r9)
            com.google.mlkit.acceleration.internal.RunConfig r0 = r0.build()
            r4.add(r0)
        L1b0:
            int r7 = r7 + 1
            goto L97
        L1b4:
            return r4
    }
}

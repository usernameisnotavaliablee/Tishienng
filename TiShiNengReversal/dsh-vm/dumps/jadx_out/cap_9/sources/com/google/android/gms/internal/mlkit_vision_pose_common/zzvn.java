package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvn {
    private static final okhttp3.MediaType zzb = null;
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzvo zza;
    private final okhttp3.OkHttpClient zzc;

    @androidx.annotation.Nullable
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzvv zzd;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvs zze;
    private final java.lang.String zzf;

    static {
            java.lang.String r0 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvn.zzb = r0
            return
    }

    public zzvn(com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r5, com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r6) {
            r4 = this;
            r4.<init>()
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 10000(0x2710, double:4.9407E-320)
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r2, r1)
            okhttp3.OkHttpClient r0 = r0.build()
            r4.zzc = r0
            r4.zza = r5
            r4.zze = r6
            r5 = 0
            r4.zzd = r5
            java.lang.String r5 = "https://firebaseinstallations.googleapis.com/v1"
            r4.zzf = r5
            return
    }

    private static long zze(long r4, java.lang.String r6) {
            java.lang.String r0 = "s$"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replaceFirst(r0, r1)
            long r0 = java.lang.Long.parseLong(r6)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = r4 + r0
            return r4
    }

    @androidx.annotation.Nullable
    private final java.lang.String zzf(okhttp3.Headers r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r5, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r6) {
            r1 = this;
            okhttp3.MediaType r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvn.zzb
            okhttp3.RequestBody r4 = okhttp3.RequestBody.create(r0, r4)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r2 = r0.headers(r2)
            okhttp3.Request$Builder r2 = r2.url(r3)
            okhttp3.Request$Builder r2 = r2.post(r4)
            okhttp3.Request r2 = r2.build()
            okhttp3.OkHttpClient r3 = r1.zzc
            okhttp3.Call r2 = r3.newCall(r2)
            r3 = 0
            okhttp3.Response r2 = r2.execute()     // Catch: java.io.IOException -> L83
            int r4 = r2.code()
            r6.zzf(r4)
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 < r0) goto L57
            r0 = 300(0x12c, float:4.2E-43)
            if (r4 < r0) goto L36
            goto L57
        L36:
            okhttp3.ResponseBody r2 = r2.body()     // Catch: java.io.IOException -> L4e
            java.lang.String r4 = r2.string()     // Catch: java.lang.Throwable -> L42
            r2.close()     // Catch: java.io.IOException -> L4e
            return r4
        L42:
            r4 = move-exception
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r4     // Catch: java.io.IOException -> L4e
        L4e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzc
            r6.zzd(r2)
            r5.zzb(r2)
            return r3
        L57:
            okhttp3.ResponseBody r2 = r2.body()     // Catch: java.io.IOException -> L6f
            java.lang.String r4 = r2.string()     // Catch: java.lang.Throwable -> L63
            r2.close()     // Catch: java.io.IOException -> L6f
            goto L71
        L63:
            r4 = move-exception
            if (r2 == 0) goto L6e
            r2.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch: java.io.IOException -> L6f
        L6e:
            throw r4     // Catch: java.io.IOException -> L6f
        L6f:
            java.lang.String r4 = "<none>"
        L71:
            java.lang.String r2 = "HTTP Response Body:\n"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.concat(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzc
            r6.zzd(r2)
            r5.zzb(r2)
            return r3
        L83:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzb
            r6.zzd(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzb
            r5.zzb(r2)
            return r3
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzvv zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r1.zzd
            return r0
    }

    final /* synthetic */ boolean zzb(com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r17, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r18) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzxm, java.io.IOException, java.lang.InterruptedException {
            r16 = this;
            r1 = r16
            java.lang.String r0 = r1.zzf
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r2 = r1.zza
            java.lang.String r2 = r2.zzc()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r7 = 0
            r4[r7] = r0
            r0 = 1
            r4[r0] = r2
            java.lang.String r2 = "%s/projects/%s/installations"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            okhttp3.Headers$Builder r4 = new okhttp3.Headers$Builder
            r4.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r5 = r1.zza
            java.lang.String r6 = "x-goog-api-key"
            java.lang.String r5 = r5.zza()
            okhttp3.Headers$Builder r4 = r4.add(r6, r5)
            okhttp3.Headers r4 = r4.build()
            java.lang.String r5 = r17.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r6 = r1.zza
            java.lang.String r6 = r6.zzb()
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r5
            r8[r0] = r6
            java.lang.String r5 = "FIS_v2"
            r8[r3] = r5
            java.lang.String r3 = "o:a:mlkit:1.0.0"
            r5 = 3
            r8[r5] = r3
            java.lang.String r3 = "{fid: '%s', appId: '%s', authVersion: '%s', sdkVersion: '%s'}"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            long r8 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r6 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r6.<init>()
            r6.zzg()
            r5 = r3
            r3 = r2
            r2 = r4
            r4 = r5
            r5 = r18
            java.lang.String r2 = r1.zzf(r2, r3, r4, r5, r6)
            r6.zze()
            if (r2 != 0) goto L6a
            goto Ld7
        L6a:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzda.zzb(r2)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r2 = r2.zzb()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lcf
            java.lang.String r3 = "name"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r2.zzc(r3)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            r3.zze()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r11 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvk     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r3 = "fid"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r2.zzc(r3)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r3 = r3.zze()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            r11.<init>(r3)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r3 = "refreshToken"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r3 = r2.zzc(r3)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r12 = r3.zze()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r3 = "authToken"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r3 = r2.zza(r3)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r4 = "token"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r4 = r3.zzc(r4)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r13 = r4.zze()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r4 = "expiresIn"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r4 = r3.zzc(r4)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String r4 = r4.zze()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            long r14 = zze(r8, r4)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            r11.zza()     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r10 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvv     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            r10.<init>(r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            r1.zzd = r10     // Catch: java.lang.Throwable -> Lc1 java.lang.Throwable -> Lc3
            r7 = 1
            goto Ld7
        Lc1:
            r0 = move-exception
            goto Ldf
        Lc3:
            r2.toString()     // Catch: java.lang.Throwable -> Lc1
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzd     // Catch: java.lang.Throwable -> Lc1
            r6.zzd(r0)     // Catch: java.lang.Throwable -> Lc1
            r5.zzb(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Ld7
        Lcf:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zze     // Catch: java.lang.Throwable -> Lc1
            r6.zzd(r0)     // Catch: java.lang.Throwable -> Lc1
            r5.zzb(r0)     // Catch: java.lang.Throwable -> Lc1
        Ld7:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r0 = r1.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbE
            r0.zza(r2, r6)
            return r7
        Ldf:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r2 = r1.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbE
            r2.zza(r3, r6)
            throw r0
    }

    public final boolean zzc(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r3) throws java.lang.InterruptedException {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r2.zzd
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvl r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvl
            r0.<init>(r2, r3)
            boolean r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zza(r0)
            if (r0 != 0) goto L16
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzf
            r3.zzc(r1)
        L16:
            return r0
    }

    public final boolean zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r1) {
            r0 = this;
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            r1 = 0
            return r1
    }
}

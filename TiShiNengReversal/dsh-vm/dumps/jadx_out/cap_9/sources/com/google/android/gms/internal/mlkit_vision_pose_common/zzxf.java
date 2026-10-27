package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzxf {
    public static final long zza = 0;
    private static final java.util.concurrent.ExecutorService zzb = null;
    private static final java.util.concurrent.ExecutorService zzc = null;

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzxf zzd;
    private final java.util.concurrent.Executor zze;
    private final java.util.concurrent.Executor zzf;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvp zzg;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwz zzh;

    @androidx.annotation.Nullable
    private volatile com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zzi;

    @androidx.annotation.Nullable
    private volatile com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zzj;
    private final java.util.Map zzk;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzxk zzl;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzxi zzm;

    @androidx.annotation.Nullable
    private java.lang.String zzn;

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzb = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzc = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 12
            long r0 = r0.toSeconds(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zza = r0
            return
    }

    private zzxf(android.content.Context r13, com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r14, com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r15, com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r16) {
            r12 = this;
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzb
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzc
            r12.<init>()
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r12.zzk = r2
            r13.getApplicationContext()
            r12.zzg = r14
            r12.zze = r0
            r12.zzf = r1
            r11 = r15
            r12.zzm = r11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwz r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwz
            java.lang.String r4 = r16.zzb()
            java.lang.String r5 = r16.zza()
            java.lang.String r6 = "firebase"
            r7 = 5
            r9 = r7
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7, r9, r11)
            r12.zzh = r2
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxk r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxk
            r0.<init>(r13)
            r12.zzl = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zzc(org.json.JSONObject r0) {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r0 = zzm(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzvp zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0) {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzwz zze(com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0) {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwz r0 = r0.zzh
            return r0
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzxf zzf(android.content.Context r5) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzxf> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzd     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxf     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvp.zzb(r5)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxi     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvw.zza     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r5, r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzd = r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L20
        L1c:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzd     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return r5
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
    }

    static /* bridge */ /* synthetic */ java.lang.String zzg(com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0) {
            java.lang.String r0 = r0.zzn
            return r0
    }

    @androidx.annotation.Nullable
    private final android.util.Pair zzl(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r4, boolean r5) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxk r0 = r3.zzl
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r0 = r0.zza(r4)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.json.JSONObject r2 = r0.zzc()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r1 = zzm(r2)     // Catch: org.json.JSONException -> L36
            r3.zzj = r1
            if (r5 == 0) goto L2a
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r5.<init>()
            r5.zzg()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r2 = r3.zzj
            r3.zzi = r2
            r5.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r2 = r3.zzm
            r2.zzb(r5)
        L2a:
            r4.zzh()
            java.util.Date r4 = r0.zzb()
            android.util.Pair r4 = android.util.Pair.create(r1, r4)
            return r4
        L36:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzl
            r4.zzc(r5)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "Saved remote config setting has invalid format: "
            r5.concat(r4)
            return r1
    }

    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zzm(org.json.JSONObject r7) throws org.json.JSONException {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxc r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxc
            r0.<init>(r7)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbf r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzbf
            r1.<init>()
            org.json.JSONObject r0 = r0.zza
            java.util.Iterator r0 = r0.keys()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r7.getString(r2)
            if (r3 != 0) goto L24
            r3 = 0
            goto L4e
        L24:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2d
            java.lang.String r3 = ""
            goto L4e
        L2d:
            org.json.JSONObject r4 = new org.json.JSONObject
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "{ \"value\": "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " }"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            java.lang.String r3 = "value"
            java.lang.String r3 = r4.getString(r3)
        L4e:
            r1.zza(r2, r3)
            goto L10
        L52:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r7 = r1.zzb()
            return r7
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task zza(long r9) {
            r8 = this;
            java.util.Date r2 = new java.util.Date
            long r0 = java.lang.System.currentTimeMillis()
            r2.<init>(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r5.<init>()
            r5.zzg()
            com.google.android.gms.tasks.TaskCompletionSource r7 = new com.google.android.gms.tasks.TaskCompletionSource
            r7.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxd r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxd
            r6 = 0
            r1 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7)
            java.util.concurrent.Executor r9 = r1.zzf
            r9.execute(r0)
            com.google.android.gms.tasks.Task r9 = r7.getTask()
            return r9
    }

    public final com.google.android.gms.tasks.Task zzb() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r0.<init>()
            r0.zzg()
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxb r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxb
            r3 = 1
            r2.<init>(r4, r0, r3, r1)
            java.util.concurrent.Executor r0 = r4.zze
            r0.execute(r2)
            com.google.android.gms.tasks.Task r0 = r1.getTask()
            return r0
    }

    public final java.lang.String zzh(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r0 = r2.zzi
            if (r0 == 0) goto L12
            boolean r1 = r0.containsKey(r3)
            if (r1 != 0) goto Lb
            goto L12
        Lb:
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L12:
            java.util.Map r0 = r2.zzk
            monitor-enter(r0)
            java.util.Map r1 = r2.zzk     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r3
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    final /* synthetic */ void zzi(java.util.Date r6, long r7, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r9, boolean r10, com.google.android.gms.tasks.TaskCompletionSource r11) {
            r5 = this;
            r10 = 0
            android.util.Pair r10 = r5.zzl(r9, r10)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            r0 = 0
            if (r10 != 0) goto La
        L8:
            r1 = r0
            goto L29
        La:
            java.lang.Object r1 = r10.first     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r1 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzbg) r1     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.lang.Object r10 = r10.second     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.util.Date r10 = (java.util.Date) r10     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            long r3 = r10.getTime()     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            long r7 = r10.toMillis(r7)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            long r3 = r3 + r7
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            boolean r7 = r6.after(r2)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            if (r7 == 0) goto L29
            goto L8
        L29:
            if (r1 != 0) goto L6d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r7 = r5.zzg     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d java.io.IOException -> L68
            r7.zzd()     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d java.io.IOException -> L68
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r7 = r5.zzg     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.lang.String r7 = r7.zzc()     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxe r8 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxe     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            r8.<init>(r5, r7, r6, r9)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            boolean r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zza(r8)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            if (r6 != 0) goto L4f
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzf     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            r9.zzd(r6)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            goto L6d
        L47:
            r6 = move-exception
            goto L7d
        L49:
            r6 = move-exception
            goto L71
        L4b:
            r6 = move-exception
            goto L71
        L4d:
            r6 = move-exception
            goto L71
        L4f:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r6 = r8.zzb()     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            java.lang.String r10 = "writeAndSetFetchedConfig: "
            r10.concat(r7)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxk r7 = r5.zzl     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwy r8 = r8.zzc()     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            r7.zzb(r8, r9)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            r5.zzj = r6     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            goto L6d
        L68:
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zza     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            r9.zzd(r6)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
        L6d:
            r11.setResult(r0)     // Catch: java.lang.Throwable -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzxh -> L49 java.lang.InterruptedException -> L4b java.lang.RuntimeException -> L4d
            goto L74
        L71:
            r11.setException(r6)     // Catch: java.lang.Throwable -> L47
        L74:
            r9.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r6 = r5.zzm
            r6.zzc(r9)
            return
        L7d:
            r9.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r7 = r5.zzm
            r7.zzc(r9)
            throw r6
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r1, boolean r2, com.google.android.gms.tasks.TaskCompletionSource r3) {
            r0 = this;
            r2 = 1
            r0.zzl(r1, r2)     // Catch: java.lang.Throwable -> L9 java.lang.RuntimeException -> Lb
            r2 = 0
            r3.setResult(r2)     // Catch: java.lang.Throwable -> L9 java.lang.RuntimeException -> Lb
            goto Lf
        L9:
            r2 = move-exception
            goto L18
        Lb:
            r2 = move-exception
            r3.setException(r2)     // Catch: java.lang.Throwable -> L9
        Lf:
            r1.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r2 = r0.zzm
            r2.zze(r1)
            return
        L18:
            r1.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxi r3 = r0.zzm
            r3.zze(r1)
            throw r2
    }

    public final void zzk(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.zzn = r2
            return
    }
}

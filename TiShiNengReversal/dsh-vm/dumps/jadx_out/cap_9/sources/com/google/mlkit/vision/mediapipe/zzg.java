package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzg {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String zzb = "zzg";
    private final com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig zzc;

    @androidx.annotation.Nullable
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp zzd;
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl zze;
    private final java.util.concurrent.atomic.AtomicBoolean zzf;
    private long zzg;
    private java.util.concurrent.ConcurrentHashMap zzh;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzis.zza()     // Catch: java.lang.UnsatisfiedLinkError -> L8
            java.lang.String r0 = "xeno_native"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L8
        L8:
            return
    }

    zzg(com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r3) {
            r2 = this;
            r2.<init>()
            r2.zzc = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r3.<init>(r0)
            r2.zzf = r3
            r0 = -1
            r2.zzg = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.ConcurrentHashMap zzb(com.google.mlkit.vision.mediapipe.zzg r0) {
            java.util.concurrent.ConcurrentHashMap r0 = r0.zzh
            return r0
    }

    private final void zzg() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r1.zzd
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r0
            r0.zzk()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r1.zzd
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r0
            r0.zzn()
            return
    }

    public final java.lang.Object zza(java.util.List r11, com.google.mlkit.vision.mediapipe.Converter r12) throws com.google.mlkit.common.MlKitException {
            r10 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.mlkit.vision.mediapipe.zze r1 = new com.google.mlkit.vision.mediapipe.zze
            r1.<init>(r10, r0, r12)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r12 = r10.zzd
            r2 = 13
            if (r12 == 0) goto L116
            java.util.concurrent.atomic.AtomicBoolean r12 = r10.zzf
            r3 = 1
            boolean r12 = r12.getAndSet(r3)
            if (r12 != 0) goto L1c
            r10.zzg()
        L1c:
            int r12 = r11.size()
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r4 = r10.zzc
            java.util.List r4 = r4.zzc()
            int r4 = r4.size()
            r5 = 0
            if (r12 != r4) goto L2f
            r12 = 1
            goto L30
        L2f:
            r12 = 0
        L30:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r12)
            r12 = 0
        L34:
            int r4 = r11.size()
            int r4 = r4 + (-1)
            if (r12 >= r4) goto L5f
            java.lang.Object r4 = r11.get(r12)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r4 = (com.google.mlkit.vision.mediapipe.MediaPipeInput) r4
            long r6 = r4.zza()
            int r12 = r12 + 1
            java.lang.Object r4 = r11.get(r12)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r4 = (com.google.mlkit.vision.mediapipe.MediaPipeInput) r4
            long r8 = r4.zza()
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = 0
        L59:
            java.lang.String r6 = "MediaPipeInputs doesn't have same timestamp."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r6)
            goto L34
        L5f:
            java.lang.Object r12 = r11.get(r5)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r12 = (com.google.mlkit.vision.mediapipe.MediaPipeInput) r12
            long r3 = r12.zza()
            java.util.concurrent.ConcurrentHashMap r12 = r10.zzh
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r12.put(r6, r1)
        L72:
            int r12 = r11.size()
            if (r5 >= r12) goto Lf1
            java.lang.Object r12 = r11.get(r5)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r12 = (com.google.mlkit.vision.mediapipe.MediaPipeInput) r12
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r6 = r10.zze
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r12 = r12.zzb(r6)
            long r6 = r10.zzg     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto La6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r6 = r10.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r6     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r7 = r10.zzc     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.util.List r7 = r7.zzc()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.Object r7 = r7.get(r5)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.String r7 = (java.lang.String) r7     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            r6.zzc(r7, r12, r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            int r5 = r5 + 1
            goto L72
        La4:
            r11 = move-exception
            goto Lc7
        La6:
            com.google.mlkit.common.MlKitException r11 = new com.google.mlkit.common.MlKitException     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            long r5 = r10.zzg     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            r0.<init>()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.String r7 = "Timestamp must be monotonically increasing. Last timestampUs: "
            r0.append(r7)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            r0.append(r5)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.String r5 = ", Current: "
            r0.append(r5)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            r0.append(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            java.lang.String r0 = r0.toString()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            r11.<init>(r0, r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
            throw r11     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> La4
        Lc7:
            r12.zze()
            java.util.concurrent.ConcurrentHashMap r12 = r10.zzh
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r12.remove(r0)
            java.lang.String r11 = r11.getMessage()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            com.google.android.gms.tasks.TaskCompletionSource r12 = r1.zza
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Mediapipe failed with message: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            r12.setException(r0)
            com.google.mlkit.common.MlKitException r12 = new com.google.mlkit.common.MlKitException
            r12.<init>(r11, r2)
            throw r12
        Lf1:
            java.lang.String r11 = "From creating image packet to addConsumablePacketToInputStream"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zziq r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziq.zze(r11)
            r11.zzd(r3)
            r10.zzg = r3
            com.google.android.gms.tasks.Task r11 = r0.getTask()     // Catch: java.lang.InterruptedException -> L105 java.util.concurrent.ExecutionException -> L107
            java.lang.Object r11 = com.google.android.gms.tasks.Tasks.await(r11)     // Catch: java.lang.InterruptedException -> L105 java.util.concurrent.ExecutionException -> L107
            return r11
        L105:
            r11 = move-exception
            goto L108
        L107:
            r11 = move-exception
        L108:
            com.google.mlkit.common.MlKitException r12 = new com.google.mlkit.common.MlKitException
            java.lang.String r11 = r11.getMessage()
            java.lang.String r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzc.zzb(r11)
            r12.<init>(r11, r2)
            throw r12
        L116:
            com.google.mlkit.common.MlKitException r11 = new com.google.mlkit.common.MlKitException
            java.lang.String r12 = "Couldn't send input frame. Possible reason: load() hasn't been called yet."
            r11.<init>(r12, r2)
            throw r11
    }

    final void zzc() {
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.zzf
            r2 = 0
            boolean r1 = r1.getAndSet(r2)
            if (r1 == 0) goto L11d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzis.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            boolean r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzis.zzb()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            if (r1 != 0) goto L16
            goto Lfb
        L16:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r0.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhr r1 = r1.zzb()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.util.List r1 = r1.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.mlkit.vision.mediapipe.zzd r3 = new com.google.mlkit.vision.mediapipe.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r3.<init>()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.util.Collections.sort(r1, r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.util.Iterator r3 = r1.iterator()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r4 = 0
            r6 = r4
        L35:
            boolean r8 = r3.hasNext()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            if (r8 == 0) goto L61
            java.lang.Object r8 = r3.next()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfw r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzfw) r8     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r9 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            int r9 = r9.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            if (r9 <= 0) goto L35
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r9 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r9 = r9.zzc(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto L35
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r8 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r8 = r8.zze()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r6 = r6 + r8
            goto L35
        L61:
            java.lang.String r3 = "\n\t\t\t\tPercent\tCount\tAvgProcessUs\n--------------------------------------------------------------------"
            java.util.Iterator r1 = r1.iterator()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
        L67:
            boolean r8 = r1.hasNext()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            if (r8 == 0) goto Lf8
            java.lang.Object r8 = r1.next()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfw r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzfw) r8     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.String r9 = r8.zze()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r10.<init>()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r10.append(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.String r3 = "\n"
            r10.append(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r10.append(r9)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.String r3 = ":\n\t\t\t\t"
            r10.append(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.String r3 = r10.toString()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r9 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            int r9 = r9.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            if (r9 <= 0) goto Lf5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r9 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r9 = r9.zzc(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto Lf5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r9 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r9 = r9.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r11 = 1
            r13 = 1
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto Lb7
            r9 = 1
            goto Lb8
        Lb7:
            r9 = 0
        Lb8:
            com.google.android.gms.common.internal.Preconditions.checkState(r9)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r9 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r9 = r9.zze()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzga r8 = r8.zzd()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r11 = r8.zzc(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.util.Locale r8 = java.util.Locale.US     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.String r14 = "%d\t%d\t%d"
            r15 = 100
            long r15 = r15 * r9
            long r15 = r15 / r6
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.Long r16 = java.lang.Long.valueOf(r11)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            long r9 = r9 / r11
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r10[r2] = r15     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r10[r13] = r16     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r11 = 2
            r10[r11] = r9     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.String r8 = java.lang.String.format(r8, r14, r10)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
        Lef:
            java.lang.String r3 = r3.concat(r8)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            goto L67
        Lf5:
            java.lang.String r8 = "---"
            goto Lef
        Lf8:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzis.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
        Lfb:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r0.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r1.zzf()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r0.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
            r1.zzm()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L111
        L111:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r0.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L11d
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L11d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L11d
            r1.zzl()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L11d
        L11d:
            return
    }

    final void zzd() throws com.google.mlkit.common.MlKitException {
            r5 = this;
            r0 = 13
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r1 = r5.zzc     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r1.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            android.content.Context r1 = r1.getApplicationContext()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhk.zza(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r1 = r5.zzc     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = r1.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            android.content.Context r1 = r1.getApplicationContext()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r2 = r5.zzc     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            java.lang.String r2 = r2.zzb()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            java.io.InputStream r1 = r1.open(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 java.io.IOException -> L110
            byte[] r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzee.zza(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 java.io.IOException -> L110
            r1.close()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 java.io.IOException -> L110
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzgf r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzgf.zzc(r2, r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzis.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzis.zzb()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r3 = 1
            if (r2 == 0) goto L68
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzgk r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzgl.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r2.zza(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = r2.zzi()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzgl r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzgl) r2     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r1 = r1.zzq()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzgc r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzgc) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r1.zza(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = r1.zzi()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzgf r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzgf) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            goto L68
        L65:
            r1 = move-exception
            goto L125
        L68:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r2.<init>()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r2.zzg(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r1 = r5.zzc     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            java.util.Map r1 = r1.zze()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            if (r1 == 0) goto L85
            com.google.research.xeno.effect.AssetRegistry r4 = new com.google.research.xeno.effect.AssetRegistry     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r4.<init>(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            com.google.research.xeno.effect.AssetRegistryService r1 = new com.google.research.xeno.effect.AssetRegistryService     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r1.<init>()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r2.zzj(r1, r4)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
        L85:
            r5.zzd = r2
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.zzh = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r5.zzd
            r0.<init>(r1)
            r5.zze = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzf
            boolean r0 = r0.get()
            r0 = r0 ^ r3
            java.lang.String r1 = "setInputSidePackets must be called before the graph is started"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r0 = r5.zze
            if (r0 == 0) goto La8
            goto La9
        La8:
            r3 = 0
        La9:
            java.lang.String r0 = "setInputSidePackets must be called after packetCreator is created"
            com.google.android.gms.common.internal.Preconditions.checkState(r3, r0)
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r0 = r5.zzc
            java.util.Map r0 = r0.zzf()
            if (r0 == 0) goto Lf7
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lbd
            goto Lf7
        Lbd:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lca:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.google.mlkit.vision.mediapipe.MediaPipeInput r2 = (com.google.mlkit.vision.mediapipe.MediaPipeInput) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r4 = r5.zze
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2 = r2.zzb(r4)
            r1.put(r3, r2)
            goto Lca
        Lec:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r5.zzd
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r0
            r0.zzi(r1)
        Lf7:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r5.zzd
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r0
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r1 = r5.zzc
            java.util.List r1 = r1.zzd()
            com.google.mlkit.vision.mediapipe.zzf r2 = new com.google.mlkit.vision.mediapipe.zzf
            r2.<init>(r5)
            r0.zzd(r1, r2)
            return
        L10e:
            r1 = move-exception
            goto L117
        L110:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            r2.<init>(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
            throw r2     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65 com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L10e
        L117:
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzc.zzb(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            r2.<init>(r1, r0)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
            throw r2     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L65
        L125:
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = r1.getLocalizedMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Error loading MediaPipe graph. "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1, r0)
            throw r2
    }

    final void zze() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzf
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Lc
            r2.zzg()
        Lc:
            return
    }

    final void zzf(java.lang.String r5, com.google.mlkit.vision.mediapipe.MediaPipeInput r6) throws com.google.mlkit.common.MlKitException {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r0 = r4.zze
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = r6.zzb(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = r4.zzd     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L1c
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L1c
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp) r1     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L1c
            long r2 = r6.zza()     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L1c
            r1.zzc(r5, r0, r2)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> L1c
            return
        L1c:
            r5 = move-exception
            r0.zze()
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.google.mlkit.common.MlKitException r6 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Mediapipe failed with message: "
            java.lang.String r5 = r0.concat(r5)
            r0 = 13
            r6.<init>(r5, r0)
            throw r6
    }
}

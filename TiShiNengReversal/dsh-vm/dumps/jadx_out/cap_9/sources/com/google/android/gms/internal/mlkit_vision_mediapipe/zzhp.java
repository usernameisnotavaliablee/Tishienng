package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhp {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzo zza = null;
    private long zzb;
    private final java.util.List zzc;
    private final java.util.Map zzd;
    private final java.util.Map zze;
    private boolean zzf;
    private boolean zzg;
    private final java.util.Map zzh;
    private final java.lang.Object zzi;

    static {
            java.lang.String r0 = "com/google/mediapipe/framework/Graph"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzo r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzo.zzh(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp.zza = r0
            return
    }

    public zzhp() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzd = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zze = r0
            r0 = 0
            r2.zzf = r0
            r2.zzg = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzh = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzi = r0
            long r0 = r2.zzo()
            r2.zzb = r0
            return
    }

    private final native long zzo();

    private final native long zzp(long r1);

    private final native void zzq(long r1, java.util.List r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzhz r4, boolean r5);

    private final native void zzr(long r1);

    private final native void zzs(long r1, byte[] r3);

    private final native void zzt(long r1, java.lang.String r3, long r4, long r6);

    private final native void zzu(long r1);

    private final native void zzv(long r1, java.lang.String[] r3, long[] r4, java.lang.String[] r5, long[] r6);

    private final native void zzw(long r1);

    private final native void zzx(long r1);

    private static void zzy(java.util.Map r3, java.lang.String[] r4, long[] r5) {
            int r0 = r3.size()
            int r1 = r4.length
            if (r0 != r1) goto L3b
            int r0 = r3.size()
            int r1 = r5.length
            if (r0 != r1) goto L3b
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r4[r0] = r2
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r1
            long r1 = r1.zza()
            r5[r0] = r1
            int r0 = r0 + 1
            goto L17
        L3a:
            return
        L3b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Input array length doesn't match the map size!"
            r3.<init>(r4)
            throw r3
    }

    public final synchronized long zza() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhr zzb() {
            r5 = this;
            long r0 = r5.zzb
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "Invalid context, tearDown() might have been called already."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhr r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhr
            long r1 = r5.zzb
            long r1 = r5.zzp(r1)
            r0.<init>(r1, r5)
            return r0
    }

    public final synchronized void zzc(java.lang.String r10, com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r11, long r12) {
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.zzb     // Catch: java.lang.Throwable -> Lab
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Invalid context, tearDown() might have been called."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r9.zzg     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L97
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = r11.zzc()     // Catch: java.lang.Throwable -> L2c
            java.util.Map r1 = r9.zzh     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.containsKey(r10)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L31
            java.util.Map r1 = r9.zzh     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            r1.put(r10, r2)     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r0 = move-exception
            r10 = r0
            r1 = r9
            goto Lae
        L31:
            java.util.Map r1 = r9.zzh     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = r1.get(r10)     // Catch: java.lang.Throwable -> L2c
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2c
            int r1 = r10.size()     // Catch: java.lang.Throwable -> L2c
            r2 = 20
            if (r1 <= r2) goto L85
            java.util.Map r10 = r9.zze     // Catch: java.lang.Throwable -> L2c
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2c
        L4b:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L2c
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r12 = r11.getValue()     // Catch: java.lang.Throwable -> L2c
            if (r12 != 0) goto L4b
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzo r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp.zza     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r12 = r12.zzc()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzk r12 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzk) r12     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "Graph.java"
            java.lang.String r0 = "com/google/mediapipe/framework/Graph"
            java.lang.String r1 = "addPacketToBuffer"
            r2 = 578(0x242, float:8.1E-43)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r12 = r12.zzg(r0, r1, r2, r13)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzk r12 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzk) r12     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r11 = r11.getKey()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "Stream: %s might be missing."
            r12.zzn(r13, r11)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L7d:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = "Graph is not started because of missing streams"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2c
            throw r10     // Catch: java.lang.Throwable -> L2c
        L85:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzho r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzho     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L2c
            r13 = 0
            r1.<init>(r0, r12, r13)     // Catch: java.lang.Throwable -> L2c
            r10.add(r1)     // Catch: java.lang.Throwable -> L2c
            r11.zze()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r9)
            return
        L97:
            long r2 = r9.zzb     // Catch: java.lang.Throwable -> Lab
            long r5 = r11.zza()     // Catch: java.lang.Throwable -> Lab
            r1 = r9
            r4 = r10
            r7 = r12
            r1.zzt(r2, r4, r5, r7)     // Catch: java.lang.Throwable -> La8
            r11.zze()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r9)
            return
        La8:
            r0 = move-exception
        La9:
            r10 = r0
            goto Lae
        Lab:
            r0 = move-exception
            r1 = r9
            goto La9
        Lae:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La8
            throw r10
    }

    public final synchronized void zzd(java.util.List r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzhz r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zze(r2, r3, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final synchronized void zze(java.util.List r8, com.google.android.gms.internal.mlkit_vision_mediapipe.zzhz r9, boolean r10) {
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.zzb     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r10 = 1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "Invalid context, tearDown() might have been called already."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r7.zzg     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L1c
            boolean r0 = r7.zzf     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            r10 = 0
            goto L22
        L1e:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L3b
        L22:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzb(r10)     // Catch: java.lang.Throwable -> L38
            java.util.List r10 = r7.zzc     // Catch: java.lang.Throwable -> L38
            r10.add(r9)     // Catch: java.lang.Throwable -> L38
            long r2 = r7.zzb     // Catch: java.lang.Throwable -> L38
            r6 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            r1.zzq(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r7)
            return
        L35:
            r0 = move-exception
        L36:
            r8 = r0
            goto L3b
        L38:
            r0 = move-exception
            r1 = r7
            goto L36
        L3b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L35
            throw r8
    }

    public final synchronized void zzf() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Invalid context, tearDown() might have been called."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L18
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r5.zzr(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r5)
            return
        L18:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final synchronized void zzg(com.google.android.gms.internal.mlkit_vision_mediapipe.zzgf r1) {
            r0 = this;
            monitor-enter(r0)
            byte[] r1 = r1.zzk()     // Catch: java.lang.Throwable -> La
            r0.zzh(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final synchronized void zzh(byte[] r6) {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Invalid context, tearDown() might have been called already."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L18
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r5.zzs(r0, r6)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r5)
            return
        L18:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L18
            throw r6
    }

    public final synchronized void zzi(java.util.Map r8) {
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.zzb     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "Invalid context, tearDown() might have been called."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r7.zzg     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            boolean r0 = r7.zzf     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            goto L20
        L1c:
            r4 = 0
            goto L20
        L1e:
            r8 = move-exception
            goto L4f
        L20:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzb(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1e
        L2b:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L1e
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L1e
            java.util.Map r1 = r7.zzd     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r0     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = r0.zzc()     // Catch: java.lang.Throwable -> L1e
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L1e
            goto L2b
        L4d:
            monitor-exit(r7)
            return
        L4f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e
            throw r8
    }

    public final synchronized void zzj(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhs r5, java.lang.Object r6) {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.zzb     // Catch: java.lang.Throwable -> L10
            com.google.research.xeno.effect.AssetRegistry r6 = (com.google.research.xeno.effect.AssetRegistry) r6     // Catch: java.lang.Throwable -> L10
            long r2 = r6.zza()     // Catch: java.lang.Throwable -> L10
            com.google.research.xeno.effect.AssetRegistryService r5 = (com.google.research.xeno.effect.AssetRegistryService) r5     // Catch: java.lang.Throwable -> L10
            r5.nativeInstallServiceObject(r0, r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return
        L10:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r5
    }

    public final synchronized void zzk() {
            r15 = this;
            monitor-enter(r15)
            long r2 = r15.zzb     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r0 = 0
            r8 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.String r3 = "Invalid context, tearDown() might have been called."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r2, r3)     // Catch: java.lang.Throwable -> L4e
            r15.zzf = r8     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zze     // Catch: java.lang.Throwable -> L4e
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4e
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzo r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp.zza     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r0 = r0.zzb()     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzk) r0     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "Graph.java"
            java.lang.String r3 = "com/google/mediapipe/framework/Graph"
            java.lang.String r4 = "startRunningGraph"
            r5 = 333(0x14d, float:4.67E-43)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r0 = r0.zzg(r3, r4, r5, r2)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzk) r0     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "MediaPipe graph won't start until all stream headers are available."
            r0.zzm(r2)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r15)
            return
        L4e:
            r0 = move-exception
            goto L105
        L51:
            java.util.Map r2 = r15.zzd     // Catch: java.lang.Throwable -> L4e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4e
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zzd     // Catch: java.lang.Throwable -> L4e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4e
            long[] r5 = new long[r2]     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zzd     // Catch: java.lang.Throwable -> L4e
            zzy(r2, r4, r5)     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zze     // Catch: java.lang.Throwable -> L4e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4e
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zze     // Catch: java.lang.Throwable -> L4e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4e
            long[] r7 = new long[r2]     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zze     // Catch: java.lang.Throwable -> L4e
            zzy(r2, r6, r7)     // Catch: java.lang.Throwable -> L4e
            long r2 = r15.zzb     // Catch: java.lang.Throwable -> L4e
            r1 = r15
            r1.zzv(r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            r15.zzg = r8     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r15.zzh     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L103
            java.util.Map r2 = r15.zzh     // Catch: java.lang.Throwable -> L4e
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> L4e
        L95:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto Lfc
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L4e
            r10 = r2
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r10.getValue()     // Catch: java.lang.Throwable -> L4e
            r11 = r2
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch: java.lang.Throwable -> L4e
            int r12 = r11.size()     // Catch: java.lang.Throwable -> L4e
            r13 = 0
        Lae:
            if (r13 >= r12) goto L95
            java.lang.Object r2 = r11.get(r13)     // Catch: java.lang.Throwable -> L4e
            r14 = r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzho r14 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzho) r14     // Catch: java.lang.Throwable -> L4e
            long r2 = r15.zzb     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            java.lang.Object r4 = r10.getKey()     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r5 = r14.zza     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            long r5 = r5.zza()     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            java.lang.Long r7 = r14.zzb     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            r1 = r15
            r1.zzt(r2, r4, r5, r7)     // Catch: java.lang.Throwable -> L4e com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu -> Ld7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2 = r14.zza     // Catch: java.lang.Throwable -> L4e
            r2.zze()     // Catch: java.lang.Throwable -> L4e
            int r13 = r13 + 1
            goto Lae
        Ld7:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzo r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp.zza     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r2 = r2.zzc()     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzk r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzk) r2     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "Graph.java"
            java.lang.String r4 = "com/google/mediapipe/framework/Graph"
            java.lang.String r5 = "moveBufferedPacketsToInputStream"
            r6 = 597(0x255, float:8.37E-43)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r2 = r2.zzg(r4, r5, r6, r3)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzk r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzk) r2     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r10.getKey()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "AddPacket for stream: %s failed: %s."
            r2.zzo(r5, r3, r4)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        Lfc:
            java.util.Map r0 = r15.zzh     // Catch: java.lang.Throwable -> L4e
            r0.clear()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r15)
            return
        L103:
            monitor-exit(r15)
            return
        L105:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L4e
            throw r0
    }

    public final synchronized void zzl() {
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.zzb     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "Invalid context, tearDown() might have been called already."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L32
            java.util.Map r0 = r8.zzd     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
        L1c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r1     // Catch: java.lang.Throwable -> L32
            r1.zze()     // Catch: java.lang.Throwable -> L32
            goto L1c
        L32:
            r0 = move-exception
            goto Lb6
        L35:
            java.util.Map r0 = r8.zzd     // Catch: java.lang.Throwable -> L32
            r0.clear()     // Catch: java.lang.Throwable -> L32
            java.util.Map r0 = r8.zze     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
        L44:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L32
            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L44
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r1     // Catch: java.lang.Throwable -> L32
            r1.zze()     // Catch: java.lang.Throwable -> L32
            goto L44
        L60:
            java.util.Map r0 = r8.zze     // Catch: java.lang.Throwable -> L32
            r0.clear()     // Catch: java.lang.Throwable -> L32
            java.util.Map r0 = r8.zzh     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
        L6f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L96
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L32
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L32
            r6 = 0
        L86:
            if (r6 >= r5) goto L6f
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzho r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzho) r7     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r7 = r7.zza     // Catch: java.lang.Throwable -> L32
            r7.zze()     // Catch: java.lang.Throwable -> L32
            int r6 = r6 + 1
            goto L86
        L96:
            java.util.Map r0 = r8.zzh     // Catch: java.lang.Throwable -> L32
            r0.clear()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r8.zzi     // Catch: java.lang.Throwable -> L32
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L32
            long r1 = r8.zzb     // Catch: java.lang.Throwable -> Laa
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lac
            r8.zzu(r1)     // Catch: java.lang.Throwable -> Laa
            r8.zzb = r3     // Catch: java.lang.Throwable -> Laa
            goto Lac
        Laa:
            r1 = move-exception
            goto Lb4
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            java.util.List r0 = r8.zzc     // Catch: java.lang.Throwable -> L32
            r0.clear()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r8)
            return
        Lb4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            throw r1     // Catch: java.lang.Throwable -> L32
        Lb6:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public final synchronized void zzm() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Invalid context, tearDown() might have been called."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L18
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r5.zzw(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r5)
            return
        L18:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final synchronized void zzn() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Invalid context, tearDown() might have been called."
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzb.zzc(r0, r1)     // Catch: java.lang.Throwable -> L18
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L18
            r5.zzx(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r5)
            return
        L18:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}

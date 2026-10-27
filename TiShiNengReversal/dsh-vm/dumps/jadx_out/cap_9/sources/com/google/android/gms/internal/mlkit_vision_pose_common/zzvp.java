package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvp {

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzvp zza;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvn zzb;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvu zzc;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvs zzd;

    @androidx.annotation.Nullable
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzvv zze;

    @androidx.annotation.VisibleForTesting
    public zzvp(android.content.Context r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r4) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvs
            r0.<init>(r3)
            r2.zzd = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvu r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvu
            r1.<init>(r3)
            r2.zzc = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvn r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvn
            r3.<init>(r4, r0)
            r2.zzb = r3
            return
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzvp zzb(android.content.Context r3) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzvp> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvp.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvp.zza     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvp     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvo r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvw.zza     // Catch: java.lang.Throwable -> L11
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp.zza = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L17
        L13:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvp r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvp.zza     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r3
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzvk zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r1.zze
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r1.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r0 = r0.zzb()
            return r0
    }

    public final java.lang.String zzc() throws java.lang.InterruptedException {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r5.zze
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r5.zze
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r5.zze
            boolean r0 = r0.zze()
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r0.<init>()
            r0.zzg()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvn r3 = r5.zzb     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.zzc(r0)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L39
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvn r3 = r5.zzb     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r3 = r3.zza()     // Catch: java.lang.Throwable -> L37
            r5.zze = r3     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r1 = move-exception
            goto L44
        L39:
            r0.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r3 = r5.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbD
            r3.zza(r4, r0)
            goto L4f
        L44:
            r0.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r2 = r5.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbD
            r2.zza(r3, r0)
            throw r1
        L4f:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r5.zze
            if (r0 == 0) goto L54
            r1 = 1
        L54:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r0 = r5.zze
            java.lang.String r0 = r0.zzd()
            return r0
    }

    public final void zzd() throws java.io.IOException, java.lang.InterruptedException {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr
            r0.<init>()
            r0.zzg()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvu r1 = r6.zzc     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r1 = r1.zza(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L16
            r6.zze = r1     // Catch: java.lang.Throwable -> L13
            goto L86
        L13:
            r1 = move-exception
            goto L9c
        L16:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvr     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r1.zzg()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvk     // Catch: java.lang.Throwable -> L6f
            int r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvq.zzb     // Catch: java.lang.Throwable -> L6f
            r3 = 17
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L6f
            java.util.Random r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvq.zza     // Catch: java.lang.Throwable -> L6f
            r4.nextBytes(r3)     // Catch: java.lang.Throwable -> L6f
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L6f
            r5 = r5 & 15
            r5 = r5 | 112(0x70, float:1.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L6f
            r3[r4] = r5     // Catch: java.lang.Throwable -> L6f
            r5 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r5)     // Catch: java.lang.Throwable -> L6f
            r5 = 22
            java.lang.String r3 = r3.substring(r4, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Generated installation id: "
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L6f
            r4.concat(r5)     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvn r3 = r6.zzb     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvm r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvm     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r3, r2, r1)     // Catch: java.lang.Throwable -> L6f
            boolean r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxo.zza(r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L71
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzf     // Catch: java.lang.Throwable -> L6f
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zztd.zzc     // Catch: java.lang.Throwable -> L6f
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L6f
            r1.zze()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r2 = r6.zzd     // Catch: java.lang.Throwable -> L13
        L69:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbC     // Catch: java.lang.Throwable -> L13
            r2.zza(r3, r1)     // Catch: java.lang.Throwable -> L13
            goto L86
        L6f:
            r2 = move-exception
            goto L91
        L71:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvn r2 = r6.zzb     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvv r2 = r2.zza()     // Catch: java.lang.Throwable -> L6f
            r6.zze = r2     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L80
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvu r3 = r6.zzc     // Catch: java.lang.Throwable -> L6f
            r3.zzc(r2, r1)     // Catch: java.lang.Throwable -> L6f
        L80:
            r1.zze()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r2 = r6.zzd     // Catch: java.lang.Throwable -> L13
            goto L69
        L86:
            r0.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r1 = r6.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbB
            r1.zza(r2, r0)
            return
        L91:
            r1.zze()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r3 = r6.zzd     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbC     // Catch: java.lang.Throwable -> L13
            r3.zza(r4, r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L9c:
            r0.zze()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvs r2 = r6.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbB
            r2.zza(r3, r0)
            throw r1
    }
}

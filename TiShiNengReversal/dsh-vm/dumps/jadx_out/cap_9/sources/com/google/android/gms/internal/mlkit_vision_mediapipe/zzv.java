package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzv implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb {
    private static final java.lang.String zza = null;
    private final java.util.logging.Level zzb;
    private final long zzc;
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzu zzd;
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzz zze;
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzao zzf;
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj zzg;
    private java.lang.Object[] zzh;

    static {
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzv.zza = r0
            return
    }

    protected zzv(java.util.logging.Level r3, boolean r4) {
            r2 = this;
            long r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzch.zzb()
            r2.<init>()
            r4 = 0
            r2.zzd = r4
            r2.zze = r4
            r2.zzf = r4
            r2.zzg = r4
            r2.zzh = r4
            java.lang.String r4 = "level"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r3, r4)
            r2.zzb = r3
            r2.zzc = r0
            return
    }

    private final void zzr(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            r3.zzh = r5
            r0 = 0
        L3:
            int r1 = r5.length
            if (r0 >= r1) goto L17
            r1 = r5[r0]
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzq
            if (r2 == 0) goto L14
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzq r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzq) r1
            java.lang.Object r1 = r1.zza()
            r5[r0] = r1
        L14:
            int r0 = r0 + 1
            goto L3
        L17:
            java.lang.String r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzv.zza
            if (r4 == r5) goto L26
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r5 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r3.zza()
            r5.<init>(r0, r4)
            r3.zzg = r5
        L26:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzch.zzk()
            boolean r5 = r4.zze()
            if (r5 != 0) goto L45
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r5 = r3.zzh()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzh
            java.lang.Object r5 = r5.zzc(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl) r5
            if (r5 == 0) goto L42
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdl r4 = r4.zzb(r5)
        L42:
            r3.zzl(r0, r4)
        L45:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzd r4 = r3.zzc()
            r4.zze(r3)
            return
    }

    private final boolean zzs() {
            r8 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r0 = r8.zze
            r1 = 1
            if (r0 != 0) goto L11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcg r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzch.zzg()
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzv> r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzv.class
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r0 = r0.zza(r2, r1)
            r8.zze = r0
        L11:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r0 = r8.zze
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzz.zza
            r3 = 0
            if (r0 == r2) goto L50
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r2 = r8.zzd
            if (r2 == 0) goto L51
            int r4 = r2.zza()
            if (r4 <= 0) goto L51
            java.lang.String r4 = "logSiteKey"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r0, r4)
            int r4 = r2.zza()
            r5 = 0
        L2c:
            if (r5 >= r4) goto L51
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzf
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r7 = r2.zzb(r5)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r2.zzd(r5)
            boolean r7 = r6 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzag
            if (r7 == 0) goto L49
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzag r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzag) r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r0 = r6.zzb()
            goto L4d
        L49:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzas.zza(r0, r6)
        L4d:
            int r5 = r5 + 1
            goto L2c
        L50:
            r0 = 0
        L51:
            boolean r2 = r8.zzb(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r4 = r8.zzf
            if (r4 == 0) goto L75
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r5 = r8.zzd
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzan.zza(r4, r0, r5)
            if (r2 == 0) goto L6e
            if (r0 <= 0) goto L6e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r4 = r8.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zze
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r4.zze(r5, r6)
        L6e:
            if (r0 < 0) goto L71
            goto L72
        L71:
            r1 = 0
        L72:
            r0 = r2 & r1
            return r0
        L75:
            return r2
    }

    protected abstract com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu zza();

    protected boolean zzb(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r7) {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r0 = r6.zzd
            r1 = 1
            if (r0 == 0) goto L5b
            if (r7 == 0) goto L2a
            long r2 = r6.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzi.zza(r0, r7, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r2 = r6.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzf.zza(r2, r7)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzao.zzc(r0, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r2 = r6.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzar.zza(r2, r7)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzao.zzc(r0, r7)
            r6.zzf = r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzao.zzc
            if (r7 == r0) goto L28
            goto L2a
        L28:
            r7 = 0
            return r7
        L2a:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r7 = r6.zzd
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzi
            java.lang.Object r7 = r7.zzc(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzat r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzat) r7
            if (r7 == 0) goto L5b
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r2 = r6.zzd
            if (r2 == 0) goto L3d
            r2.zzf(r0)
        L3d:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzad r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzad
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r2 = r6.zzh()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zza
            java.lang.Object r2 = r2.zzc(r3)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzv> r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzv.class
            int r5 = r7.zza()
            java.lang.StackTraceElement[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdx.zzb(r4, r5, r1)
            r0.<init>(r2, r7, r4)
            r6.zzl(r3, r0)
        L5b:
            return r1
    }

    protected abstract com.google.android.gms.internal.mlkit_vision_mediapipe.zzd zzc();

    protected abstract com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf zzd();

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final long zze() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzz zzf() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r0 = r2.zze
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot request log site information prior to postProcess()"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf zzg(java.lang.String r7, java.lang.String r8, int r9, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r10) {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzy r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzy
            java.lang.String r1 = "com/google/mediapipe/framework/Graph"
            r5 = 0
            java.lang.String r4 = "Graph.java"
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r7 = r6.zze
            if (r7 != 0) goto L12
            r6.zze = r0
        L12:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf r7 = r6.zzd()
            return r7
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh zzh() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r0 = r1.zzd
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh.zzg()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj zzi() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final java.lang.Object zzj() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r2.zzg
            if (r0 != 0) goto La
            java.lang.Object[] r0 = r2.zzh
            r1 = 0
            r0 = r0[r1]
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot get literal argument if a template context exists"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final java.util.logging.Level zzk() {
            r1 = this;
            java.util.logging.Level r0 = r1.zzb
            return r0
    }

    protected final void zzl(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r0 = r1.zzd
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzu
            r0.<init>()
            r1.zzd = r0
        Lb:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r0 = r1.zzd
            r0.zze(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf
    public final void zzm(java.lang.String r4) {
            r3 = this;
            boolean r4 = r3.zzs()
            if (r4 == 0) goto L13
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzv.zza
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MediaPipe graph won't start until all stream headers are available."
            r2 = 0
            r0[r2] = r1
            r3.zzr(r4, r0)
        L13:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf
    public final void zzn(java.lang.String r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r1 = this;
            boolean r2 = r1.zzs()
            if (r2 == 0) goto L11
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.String r3 = "Stream: %s might be missing."
            r1.zzr(r3, r2)
        L11:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf
    public final void zzo(java.lang.String r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r1 = this;
            boolean r2 = r1.zzs()
            if (r2 == 0) goto L14
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            r3 = 1
            r2[r3] = r4
            java.lang.String r3 = "AddPacket for stream: %s failed: %s."
            r1.zzr(r3, r2)
        L14:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final boolean zzp() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzu r0 = r3.zzd
            if (r0 == 0) goto L14
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzg
            java.lang.Object r0 = r0.zzc(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb
    public final java.lang.Object[] zzq() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r0 = r2.zzg
            if (r0 == 0) goto L7
            java.lang.Object[] r0 = r2.zzh
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot get arguments unless a template context exists"
            r0.<init>(r1)
            throw r0
    }
}

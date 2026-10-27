package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzy extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzz {
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final int zzd;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final java.lang.String zze;
    private int zzf;

    /* synthetic */ zzy(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzx r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzf = r1
            java.lang.String r1 = "com/google/mediapipe/framework/Graph"
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            java.lang.String r1 = "Graph.java"
            r0.zze = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzy
            r1 = 0
            if (r0 == 0) goto L27
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzy r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzy) r4
            java.lang.String r0 = r3.zzc
            java.lang.String r2 = r4.zzc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            int r0 = r3.zzd
            int r2 = r4.zzd
            if (r0 != r2) goto L27
            java.lang.String r0 = r3.zzb()
            java.lang.String r4 = r4.zzb()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L27
            r4 = 1
            return r4
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzf
            if (r0 != 0) goto L13
            java.lang.String r0 = r2.zzc
            int r0 = r0.hashCode()
            int r0 = r0 + 4867
            int r0 = r0 * 31
            int r1 = r2.zzd
            int r0 = r0 + r1
            r2.zzf = r0
        L13:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzz
    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            char r0 = (char) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzz
    public final java.lang.String zzb() {
            r3 = this;
            java.lang.String r0 = r3.zzb
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzz
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzz
    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
